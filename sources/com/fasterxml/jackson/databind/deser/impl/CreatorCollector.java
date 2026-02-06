package com.fasterxml.jackson.databind.deser.impl;

import com.fasterxml.jackson.databind.BeanDescription;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.cfg.MapperConfig;
import com.fasterxml.jackson.databind.deser.CreatorProperty;
import com.fasterxml.jackson.databind.deser.SettableBeanProperty;
import com.fasterxml.jackson.databind.deser.ValueInstantiator;
import com.fasterxml.jackson.databind.deser.std.StdValueInstantiator;
import com.fasterxml.jackson.databind.introspect.Annotated;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.introspect.AnnotatedParameter;
import com.fasterxml.jackson.databind.introspect.AnnotatedWithParams;
import com.fasterxml.jackson.databind.introspect.AnnotationMap;
import com.fasterxml.jackson.databind.util.ClassUtil;
import java.io.Serializable;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Member;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;

public class CreatorCollector {
    protected static final int C_ARRAY_DELEGATE = 8;
    protected static final int C_BOOLEAN = 5;
    protected static final int C_DEFAULT = 0;
    protected static final int C_DELEGATE = 6;
    protected static final int C_DOUBLE = 4;
    protected static final int C_INT = 2;
    protected static final int C_LONG = 3;
    protected static final int C_PROPS = 7;
    protected static final int C_STRING = 1;
    protected static final String[] TYPE_DESCS = {"default", "from-String", "from-int", "from-long", "from-double", "from-boolean", "delegate", "property-based"};
    protected SettableBeanProperty[] _arrayDelegateArgs;
    protected final BeanDescription _beanDesc;
    protected final boolean _canFixAccess;
    protected final AnnotatedWithParams[] _creators = new AnnotatedWithParams[9];
    protected SettableBeanProperty[] _delegateArgs;
    protected int _explicitCreators = 0;
    protected final boolean _forceAccess;
    protected boolean _hasNonDefaultCreator = false;
    protected AnnotatedParameter _incompleteParameter;
    protected SettableBeanProperty[] _propertyBasedArgs;

    protected static final class StdTypeConstructor extends AnnotatedWithParams implements Serializable {
        public static final int TYPE_ARRAY_LIST = 1;
        public static final int TYPE_HASH_MAP = 2;
        public static final int TYPE_LINKED_HASH_MAP = 3;
        private static final long serialVersionUID = 1;
        private final AnnotatedWithParams _base;
        private final int _type;

        public StdTypeConstructor(AnnotatedWithParams annotatedWithParams, int i10) {
            super(annotatedWithParams, (AnnotationMap[]) null);
            this._base = annotatedWithParams;
            this._type = i10;
        }

        public static AnnotatedWithParams tryToOptimize(AnnotatedWithParams annotatedWithParams) {
            if (annotatedWithParams != null) {
                Class<?> declaringClass = annotatedWithParams.getDeclaringClass();
                if (declaringClass == List.class || declaringClass == ArrayList.class) {
                    return new StdTypeConstructor(annotatedWithParams, 1);
                }
                if (declaringClass == LinkedHashMap.class) {
                    return new StdTypeConstructor(annotatedWithParams, 3);
                }
                if (declaringClass == HashMap.class) {
                    return new StdTypeConstructor(annotatedWithParams, 2);
                }
            }
            return annotatedWithParams;
        }

        /* access modifiers changed from: protected */
        public final Object _construct() {
            int i10 = this._type;
            if (i10 == 1) {
                return new ArrayList();
            }
            if (i10 == 2) {
                return new HashMap();
            }
            if (i10 == 3) {
                return new LinkedHashMap();
            }
            throw new IllegalStateException("Unknown type " + this._type);
        }

        public Object call() {
            return _construct();
        }

        public Object call1(Object obj) {
            return _construct();
        }

        public boolean equals(Object obj) {
            return obj == this;
        }

        public AnnotatedElement getAnnotated() {
            return this._base.getAnnotated();
        }

        public Class<?> getDeclaringClass() {
            return this._base.getDeclaringClass();
        }

        @Deprecated
        public Type getGenericParameterType(int i10) {
            return this._base.getGenericParameterType(i10);
        }

        public Member getMember() {
            return this._base.getMember();
        }

        /* access modifiers changed from: protected */
        public int getModifiers() {
            return this._base.getMember().getModifiers();
        }

        public String getName() {
            return this._base.getName();
        }

        public int getParameterCount() {
            return this._base.getParameterCount();
        }

        public JavaType getParameterType(int i10) {
            return this._base.getParameterType(i10);
        }

        public Class<?> getRawParameterType(int i10) {
            return this._base.getRawParameterType(i10);
        }

        public Class<?> getRawType() {
            return this._base.getRawType();
        }

        public JavaType getType() {
            return this._base.getType();
        }

        public Object getValue(Object obj) {
            throw new UnsupportedOperationException();
        }

        public int hashCode() {
            return this._base.hashCode();
        }

        public void setValue(Object obj, Object obj2) {
            throw new UnsupportedOperationException();
        }

        public String toString() {
            return this._base.toString();
        }

        public Annotated withAnnotations(AnnotationMap annotationMap) {
            throw new UnsupportedOperationException();
        }

        public Object call(Object[] objArr) {
            return _construct();
        }
    }

    public CreatorCollector(BeanDescription beanDescription, MapperConfig<?> mapperConfig) {
        this._beanDesc = beanDescription;
        this._canFixAccess = mapperConfig.canOverrideAccessModifiers();
        this._forceAccess = mapperConfig.isEnabled(MapperFeature.OVERRIDE_PUBLIC_ACCESS_MODIFIERS);
    }

    private JavaType _computeDelegateType(AnnotatedWithParams annotatedWithParams, SettableBeanProperty[] settableBeanPropertyArr) {
        if (!this._hasNonDefaultCreator || annotatedWithParams == null) {
            return null;
        }
        int i10 = 0;
        if (settableBeanPropertyArr != null) {
            int length = settableBeanPropertyArr.length;
            int i11 = 0;
            while (true) {
                if (i11 >= length) {
                    break;
                } else if (settableBeanPropertyArr[i11] == null) {
                    i10 = i11;
                    break;
                } else {
                    i11++;
                }
            }
        }
        return annotatedWithParams.getParameterType(i10);
    }

    private <T extends AnnotatedMember> T _fixAccess(T t10) {
        if (t10 != null && this._canFixAccess) {
            ClassUtil.checkAndFixAccess((Member) t10.getAnnotated(), this._forceAccess);
        }
        return t10;
    }

    /* access modifiers changed from: protected */
    public boolean _isEnumValueOf(AnnotatedWithParams annotatedWithParams) {
        if (!annotatedWithParams.getDeclaringClass().isEnum() || !"valueOf".equals(annotatedWithParams.getName())) {
            return false;
        }
        return true;
    }

    public void addBooleanCreator(AnnotatedWithParams annotatedWithParams, boolean z10) {
        verifyNonDup(annotatedWithParams, 5, z10);
    }

    public void addDelegatingCreator(AnnotatedWithParams annotatedWithParams, boolean z10, SettableBeanProperty[] settableBeanPropertyArr) {
        if (annotatedWithParams.getParameterType(0).isCollectionLikeType()) {
            if (verifyNonDup(annotatedWithParams, 8, z10)) {
                this._arrayDelegateArgs = settableBeanPropertyArr;
            }
        } else if (verifyNonDup(annotatedWithParams, 6, z10)) {
            this._delegateArgs = settableBeanPropertyArr;
        }
    }

    public void addDoubleCreator(AnnotatedWithParams annotatedWithParams, boolean z10) {
        verifyNonDup(annotatedWithParams, 4, z10);
    }

    public void addIncompeteParameter(AnnotatedParameter annotatedParameter) {
        if (this._incompleteParameter == null) {
            this._incompleteParameter = annotatedParameter;
        }
    }

    public void addIntCreator(AnnotatedWithParams annotatedWithParams, boolean z10) {
        verifyNonDup(annotatedWithParams, 2, z10);
    }

    public void addLongCreator(AnnotatedWithParams annotatedWithParams, boolean z10) {
        verifyNonDup(annotatedWithParams, 3, z10);
    }

    public void addPropertyCreator(AnnotatedWithParams annotatedWithParams, boolean z10, SettableBeanProperty[] settableBeanPropertyArr) {
        Integer num;
        if (verifyNonDup(annotatedWithParams, 7, z10)) {
            if (settableBeanPropertyArr.length > 1) {
                HashMap hashMap = new HashMap();
                int length = settableBeanPropertyArr.length;
                for (int i10 = 0; i10 < length; i10++) {
                    String name = settableBeanPropertyArr[i10].getName();
                    if ((name.length() != 0 || settableBeanPropertyArr[i10].getInjectableValueId() == null) && (num = (Integer) hashMap.put(name, Integer.valueOf(i10))) != null) {
                        throw new IllegalArgumentException(String.format("Duplicate creator property \"%s\" (index %s vs %d)", new Object[]{name, num, Integer.valueOf(i10)}));
                    }
                }
            }
            this._propertyBasedArgs = settableBeanPropertyArr;
        }
    }

    public void addStringCreator(AnnotatedWithParams annotatedWithParams, boolean z10) {
        verifyNonDup(annotatedWithParams, 1, z10);
    }

    public ValueInstantiator constructValueInstantiator(DeserializationConfig deserializationConfig) {
        JavaType _computeDelegateType = _computeDelegateType(this._creators[6], this._delegateArgs);
        JavaType _computeDelegateType2 = _computeDelegateType(this._creators[8], this._arrayDelegateArgs);
        JavaType type = this._beanDesc.getType();
        AnnotatedWithParams tryToOptimize = StdTypeConstructor.tryToOptimize(this._creators[0]);
        StdValueInstantiator stdValueInstantiator = new StdValueInstantiator(deserializationConfig, type);
        AnnotatedWithParams[] annotatedWithParamsArr = this._creators;
        stdValueInstantiator.configureFromObjectSettings(tryToOptimize, annotatedWithParamsArr[6], _computeDelegateType, this._delegateArgs, annotatedWithParamsArr[7], this._propertyBasedArgs);
        stdValueInstantiator.configureFromArraySettings(this._creators[8], _computeDelegateType2, this._arrayDelegateArgs);
        stdValueInstantiator.configureFromStringCreator(this._creators[1]);
        stdValueInstantiator.configureFromIntCreator(this._creators[2]);
        stdValueInstantiator.configureFromLongCreator(this._creators[3]);
        stdValueInstantiator.configureFromDoubleCreator(this._creators[4]);
        stdValueInstantiator.configureFromBooleanCreator(this._creators[5]);
        stdValueInstantiator.configureIncompleteParameter(this._incompleteParameter);
        return stdValueInstantiator;
    }

    public boolean hasDefaultCreator() {
        if (this._creators[0] != null) {
            return true;
        }
        return false;
    }

    public boolean hasDelegatingCreator() {
        if (this._creators[6] != null) {
            return true;
        }
        return false;
    }

    public boolean hasPropertyBasedCreator() {
        if (this._creators[7] != null) {
            return true;
        }
        return false;
    }

    public void setDefaultCreator(AnnotatedWithParams annotatedWithParams) {
        this._creators[0] = (AnnotatedWithParams) _fixAccess(annotatedWithParams);
    }

    /* access modifiers changed from: protected */
    public boolean verifyNonDup(AnnotatedWithParams annotatedWithParams, int i10, boolean z10) {
        boolean z11;
        String str;
        int i11 = 1 << i10;
        this._hasNonDefaultCreator = true;
        AnnotatedWithParams annotatedWithParams2 = this._creators[i10];
        if (annotatedWithParams2 != null) {
            if ((this._explicitCreators & i11) == 0) {
                z11 = !z10;
            } else if (!z10) {
                return false;
            } else {
                z11 = true;
            }
            if (z11 && annotatedWithParams2.getClass() == annotatedWithParams.getClass()) {
                Class<?> rawParameterType = annotatedWithParams2.getRawParameterType(0);
                Class<?> rawParameterType2 = annotatedWithParams.getRawParameterType(0);
                if (rawParameterType == rawParameterType2) {
                    if (_isEnumValueOf(annotatedWithParams)) {
                        return false;
                    }
                    if (!_isEnumValueOf(annotatedWithParams2)) {
                        String str2 = TYPE_DESCS[i10];
                        if (z10) {
                            str = "explicitly marked";
                        } else {
                            str = "implicitly discovered";
                        }
                        throw new IllegalArgumentException(String.format("Conflicting %s creators: already had %s creator %s, encountered another: %s", new Object[]{str2, str, annotatedWithParams2, annotatedWithParams}));
                    }
                } else if (rawParameterType2.isAssignableFrom(rawParameterType)) {
                    return false;
                }
            }
        }
        if (z10) {
            this._explicitCreators |= i11;
        }
        this._creators[i10] = (AnnotatedWithParams) _fixAccess(annotatedWithParams);
        return true;
    }

    @Deprecated
    public void addBooleanCreator(AnnotatedWithParams annotatedWithParams) {
        addBooleanCreator(annotatedWithParams, false);
    }

    @Deprecated
    public void addDoubleCreator(AnnotatedWithParams annotatedWithParams) {
        addBooleanCreator(annotatedWithParams, false);
    }

    @Deprecated
    public void addIntCreator(AnnotatedWithParams annotatedWithParams) {
        addBooleanCreator(annotatedWithParams, false);
    }

    @Deprecated
    public void addLongCreator(AnnotatedWithParams annotatedWithParams) {
        addBooleanCreator(annotatedWithParams, false);
    }

    @Deprecated
    public void addStringCreator(AnnotatedWithParams annotatedWithParams) {
        addStringCreator(annotatedWithParams, false);
    }

    @Deprecated
    public void addDelegatingCreator(AnnotatedWithParams annotatedWithParams, CreatorProperty[] creatorPropertyArr) {
        addDelegatingCreator(annotatedWithParams, false, creatorPropertyArr);
    }

    @Deprecated
    public void addPropertyCreator(AnnotatedWithParams annotatedWithParams, CreatorProperty[] creatorPropertyArr) {
        addPropertyCreator(annotatedWithParams, false, creatorPropertyArr);
    }
}
