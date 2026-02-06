package com.fasterxml.jackson.databind.introspect;

import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.cfg.MapperConfig;
import com.fasterxml.jackson.databind.introspect.ClassIntrospector;
import com.fasterxml.jackson.databind.introspect.TypeResolutionContext;
import com.fasterxml.jackson.databind.type.TypeBindings;
import com.fasterxml.jackson.databind.type.TypeFactory;
import com.fasterxml.jackson.databind.util.Annotations;
import com.fasterxml.jackson.databind.util.ClassUtil;
import java.lang.annotation.Annotation;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public final class AnnotatedClass extends Annotated implements TypeResolutionContext {
    private static final AnnotationMap[] NO_ANNOTATION_MAPS = new AnnotationMap[0];
    protected final AnnotationIntrospector _annotationIntrospector;
    protected final TypeBindings _bindings;
    protected final Class<?> _class;
    protected final AnnotationMap _classAnnotations;
    protected List<AnnotatedConstructor> _constructors;
    protected List<AnnotatedMethod> _creatorMethods;
    protected boolean _creatorsResolved = false;
    protected AnnotatedConstructor _defaultConstructor;
    protected List<AnnotatedField> _fields;
    protected AnnotatedMethodMap _memberMethods;
    protected final ClassIntrospector.MixInResolver _mixInResolver;
    protected transient Boolean _nonStaticInnerClass;
    protected final Class<?> _primaryMixIn;
    protected final List<JavaType> _superTypes;
    protected final JavaType _type;
    protected final TypeFactory _typeFactory;

    private AnnotatedClass(JavaType javaType, Class<?> cls, TypeBindings typeBindings, List<JavaType> list, AnnotationIntrospector annotationIntrospector, ClassIntrospector.MixInResolver mixInResolver, TypeFactory typeFactory) {
        Class<?> cls2;
        this._type = javaType;
        this._class = cls;
        this._bindings = typeBindings;
        this._superTypes = list;
        this._annotationIntrospector = annotationIntrospector;
        this._typeFactory = typeFactory;
        this._mixInResolver = mixInResolver;
        if (mixInResolver == null) {
            cls2 = null;
        } else {
            cls2 = mixInResolver.findMixInClassFor(cls);
        }
        this._primaryMixIn = cls2;
        this._classAnnotations = _resolveClassAnnotations();
    }

    private AnnotationMap _addAnnotationsIfNotPresent(AnnotationMap annotationMap, Annotation[] annotationArr) {
        if (annotationArr != null) {
            List<Annotation> list = null;
            for (Annotation annotation : annotationArr) {
                if (annotationMap.addIfNotPresent(annotation) && _isAnnotationBundle(annotation)) {
                    list = _addFromBundle(annotation, list);
                }
            }
            if (list != null) {
                _addAnnotationsIfNotPresent(annotationMap, (Annotation[]) list.toArray(new Annotation[list.size()]));
            }
        }
        return annotationMap;
    }

    private List<Annotation> _addFromBundle(Annotation annotation, List<Annotation> list) {
        for (Annotation annotation2 : ClassUtil.findClassAnnotations(annotation.annotationType())) {
            if (!(annotation2 instanceof Target) && !(annotation2 instanceof Retention)) {
                if (list == null) {
                    list = new ArrayList<>();
                }
                list.add(annotation2);
            }
        }
        return list;
    }

    private void _addOrOverrideAnnotations(AnnotatedMember annotatedMember, Annotation[] annotationArr) {
        if (annotationArr != null) {
            List<Annotation> list = null;
            for (Annotation annotation : annotationArr) {
                if (annotatedMember.addOrOverride(annotation) && _isAnnotationBundle(annotation)) {
                    list = _addFromBundle(annotation, list);
                }
            }
            if (list != null) {
                _addOrOverrideAnnotations(annotatedMember, (Annotation[]) list.toArray(new Annotation[list.size()]));
            }
        }
    }

    private AnnotationMap _emptyAnnotationMap() {
        return new AnnotationMap();
    }

    private AnnotationMap[] _emptyAnnotationMaps(int i10) {
        if (i10 == 0) {
            return NO_ANNOTATION_MAPS;
        }
        AnnotationMap[] annotationMapArr = new AnnotationMap[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            annotationMapArr[i11] = _emptyAnnotationMap();
        }
        return annotationMapArr;
    }

    private final boolean _isAnnotationBundle(Annotation annotation) {
        AnnotationIntrospector annotationIntrospector = this._annotationIntrospector;
        if (annotationIntrospector == null || !annotationIntrospector.isAnnotationBundle(annotation)) {
            return false;
        }
        return true;
    }

    private boolean _isIncludableConstructor(Constructor<?> constructor) {
        return !constructor.isSynthetic();
    }

    private boolean _isIncludableField(Field field) {
        if (!field.isSynthetic() && !Modifier.isStatic(field.getModifiers())) {
            return true;
        }
        return false;
    }

    private AnnotationMap _resolveClassAnnotations() {
        AnnotationMap annotationMap = new AnnotationMap();
        if (this._annotationIntrospector != null) {
            Class<?> cls = this._primaryMixIn;
            if (cls != null) {
                _addClassMixIns(annotationMap, this._class, cls);
            }
            _addAnnotationsIfNotPresent(annotationMap, ClassUtil.findClassAnnotations(this._class));
            for (JavaType next : this._superTypes) {
                _addClassMixIns(annotationMap, next);
                _addAnnotationsIfNotPresent(annotationMap, ClassUtil.findClassAnnotations(next.getRawClass()));
            }
            _addClassMixIns(annotationMap, (Class<?>) Object.class);
        }
        return annotationMap;
    }

    private AnnotatedMethodMap _resolveMemberMethods() {
        Class<?> findMixInClassFor;
        Class<?> findMixInClassFor2;
        AnnotatedMethodMap annotatedMethodMap = new AnnotatedMethodMap();
        AnnotatedMethodMap annotatedMethodMap2 = new AnnotatedMethodMap();
        _addMemberMethods(this._class, this, annotatedMethodMap, this._primaryMixIn, annotatedMethodMap2);
        for (JavaType next : this._superTypes) {
            ClassIntrospector.MixInResolver mixInResolver = this._mixInResolver;
            if (mixInResolver == null) {
                findMixInClassFor2 = null;
            } else {
                findMixInClassFor2 = mixInResolver.findMixInClassFor(next.getRawClass());
            }
            Class<?> cls = findMixInClassFor2;
            _addMemberMethods(next.getRawClass(), new TypeResolutionContext.Basic(this._typeFactory, next.getBindings()), annotatedMethodMap, cls, annotatedMethodMap2);
        }
        ClassIntrospector.MixInResolver mixInResolver2 = this._mixInResolver;
        Class<Object> cls2 = Object.class;
        if (!(mixInResolver2 == null || (findMixInClassFor = mixInResolver2.findMixInClassFor(cls2)) == null)) {
            _addMethodMixIns(this._class, annotatedMethodMap, findMixInClassFor, annotatedMethodMap2);
        }
        if (this._annotationIntrospector != null && !annotatedMethodMap2.isEmpty()) {
            Iterator<AnnotatedMethod> it = annotatedMethodMap2.iterator();
            while (it.hasNext()) {
                AnnotatedMethod next2 = it.next();
                try {
                    Method declaredMethod = cls2.getDeclaredMethod(next2.getName(), next2.getRawParameterTypes());
                    if (declaredMethod != null) {
                        AnnotatedMethod _constructMethod = _constructMethod(declaredMethod, this);
                        _addMixOvers(next2.getAnnotated(), _constructMethod, false);
                        annotatedMethodMap.add(_constructMethod);
                    }
                } catch (Exception unused) {
                }
            }
        }
        return annotatedMethodMap;
    }

    public static AnnotatedClass construct(JavaType javaType, MapperConfig<?> mapperConfig) {
        return new AnnotatedClass(javaType, javaType.getRawClass(), javaType.getBindings(), ClassUtil.findSuperTypes(javaType, (Class<?>) null, false), mapperConfig.isAnnotationProcessingEnabled() ? mapperConfig.getAnnotationIntrospector() : null, mapperConfig, mapperConfig.getTypeFactory());
    }

    public static AnnotatedClass constructWithoutSuperTypes(Class<?> cls, MapperConfig<?> mapperConfig) {
        if (mapperConfig == null) {
            return new AnnotatedClass((JavaType) null, cls, TypeBindings.emptyBindings(), Collections.emptyList(), (AnnotationIntrospector) null, (ClassIntrospector.MixInResolver) null, (TypeFactory) null);
        }
        return new AnnotatedClass((JavaType) null, cls, TypeBindings.emptyBindings(), Collections.emptyList(), mapperConfig.isAnnotationProcessingEnabled() ? mapperConfig.getAnnotationIntrospector() : null, mapperConfig, mapperConfig.getTypeFactory());
    }

    private void resolveCreators() {
        ArrayList arrayList;
        ArrayList arrayList2 = null;
        if (!this._type.isEnumType()) {
            ClassUtil.Ctor[] constructors = ClassUtil.getConstructors(this._class);
            arrayList = null;
            for (ClassUtil.Ctor ctor : constructors) {
                if (_isIncludableConstructor(ctor.getConstructor())) {
                    if (ctor.getParamCount() == 0) {
                        this._defaultConstructor = _constructDefaultConstructor(ctor, this);
                    } else {
                        if (arrayList == null) {
                            arrayList = new ArrayList(Math.max(10, constructors.length));
                        }
                        arrayList.add(_constructNonDefaultConstructor(ctor, this));
                    }
                }
            }
        } else {
            arrayList = null;
        }
        if (arrayList == null) {
            this._constructors = Collections.emptyList();
        } else {
            this._constructors = arrayList;
        }
        if (this._primaryMixIn != null && (this._defaultConstructor != null || !this._constructors.isEmpty())) {
            _addConstructorMixIns(this._primaryMixIn);
        }
        AnnotationIntrospector annotationIntrospector = this._annotationIntrospector;
        if (annotationIntrospector != null) {
            AnnotatedConstructor annotatedConstructor = this._defaultConstructor;
            if (annotatedConstructor != null && annotationIntrospector.hasIgnoreMarker(annotatedConstructor)) {
                this._defaultConstructor = null;
            }
            List<AnnotatedConstructor> list = this._constructors;
            if (list != null) {
                int size = list.size();
                while (true) {
                    size--;
                    if (size < 0) {
                        break;
                    } else if (this._annotationIntrospector.hasIgnoreMarker(this._constructors.get(size))) {
                        this._constructors.remove(size);
                    }
                }
            }
        }
        for (Method method : _findClassMethods(this._class)) {
            if (Modifier.isStatic(method.getModifiers())) {
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList(8);
                }
                arrayList2.add(_constructCreatorMethod(method, this));
            }
        }
        if (arrayList2 == null) {
            this._creatorMethods = Collections.emptyList();
        } else {
            this._creatorMethods = arrayList2;
            Class<?> cls = this._primaryMixIn;
            if (cls != null) {
                _addFactoryMixIns(cls);
            }
            if (this._annotationIntrospector != null) {
                int size2 = this._creatorMethods.size();
                while (true) {
                    size2--;
                    if (size2 < 0) {
                        break;
                    } else if (this._annotationIntrospector.hasIgnoreMarker(this._creatorMethods.get(size2))) {
                        this._creatorMethods.remove(size2);
                    }
                }
            }
        }
        this._creatorsResolved = true;
    }

    private void resolveFields() {
        List<AnnotatedField> list;
        Map<String, AnnotatedField> _findFields = _findFields(this._type, this, (Map<String, AnnotatedField>) null);
        if (_findFields == null || _findFields.size() == 0) {
            list = Collections.emptyList();
        } else {
            list = new ArrayList<>(_findFields.size());
            list.addAll(_findFields.values());
        }
        this._fields = list;
    }

    private void resolveMemberMethods() {
        this._memberMethods = _resolveMemberMethods();
    }

    /* access modifiers changed from: protected */
    public void _addClassMixIns(AnnotationMap annotationMap, JavaType javaType) {
        if (this._mixInResolver != null) {
            Class<?> rawClass = javaType.getRawClass();
            _addClassMixIns(annotationMap, rawClass, this._mixInResolver.findMixInClassFor(rawClass));
        }
    }

    /* access modifiers changed from: protected */
    public void _addConstructorMixIns(Class<?> cls) {
        int i10;
        List<AnnotatedConstructor> list = this._constructors;
        if (list == null) {
            i10 = 0;
        } else {
            i10 = list.size();
        }
        MemberKey[] memberKeyArr = null;
        for (ClassUtil.Ctor constructor : ClassUtil.getConstructors(cls)) {
            Constructor<?> constructor2 = constructor.getConstructor();
            if (constructor2.getParameterTypes().length != 0) {
                if (memberKeyArr == null) {
                    memberKeyArr = new MemberKey[i10];
                    for (int i11 = 0; i11 < i10; i11++) {
                        memberKeyArr[i11] = new MemberKey((Constructor<?>) this._constructors.get(i11).getAnnotated());
                    }
                }
                MemberKey memberKey = new MemberKey(constructor2);
                int i12 = 0;
                while (true) {
                    if (i12 < i10) {
                        if (memberKey.equals(memberKeyArr[i12])) {
                            _addMixOvers(constructor2, this._constructors.get(i12), true);
                            break;
                        }
                        i12++;
                    } else {
                        break;
                    }
                }
            } else {
                AnnotatedConstructor annotatedConstructor = this._defaultConstructor;
                if (annotatedConstructor != null) {
                    _addMixOvers(constructor2, annotatedConstructor, false);
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    public void _addFactoryMixIns(Class<?> cls) {
        int size = this._creatorMethods.size();
        MemberKey[] memberKeyArr = null;
        for (Method method : ClassUtil.getDeclaredMethods(cls)) {
            if (Modifier.isStatic(method.getModifiers()) && method.getParameterTypes().length != 0) {
                if (memberKeyArr == null) {
                    memberKeyArr = new MemberKey[size];
                    for (int i10 = 0; i10 < size; i10++) {
                        memberKeyArr[i10] = new MemberKey(this._creatorMethods.get(i10).getAnnotated());
                    }
                }
                MemberKey memberKey = new MemberKey(method);
                int i11 = 0;
                while (true) {
                    if (i11 < size) {
                        if (memberKey.equals(memberKeyArr[i11])) {
                            _addMixOvers(method, this._creatorMethods.get(i11), true);
                            break;
                        }
                        i11++;
                    } else {
                        break;
                    }
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    public void _addFieldMixIns(Class<?> cls, Class<?> cls2, Map<String, AnnotatedField> map) {
        AnnotatedField annotatedField;
        for (Class<?> declaredFields : ClassUtil.findSuperClasses(cls, cls2, true)) {
            for (Field field : ClassUtil.getDeclaredFields(declaredFields)) {
                if (_isIncludableField(field) && (annotatedField = map.get(field.getName())) != null) {
                    _addOrOverrideAnnotations(annotatedField, field.getDeclaredAnnotations());
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    public void _addMemberMethods(Class<?> cls, TypeResolutionContext typeResolutionContext, AnnotatedMethodMap annotatedMethodMap, Class<?> cls2, AnnotatedMethodMap annotatedMethodMap2) {
        if (cls2 != null) {
            _addMethodMixIns(cls, annotatedMethodMap, cls2, annotatedMethodMap2);
        }
        if (cls != null) {
            for (Method method : _findClassMethods(cls)) {
                if (_isIncludableMemberMethod(method)) {
                    AnnotatedMethod find = annotatedMethodMap.find(method);
                    if (find == null) {
                        AnnotatedMethod _constructMethod = _constructMethod(method, typeResolutionContext);
                        annotatedMethodMap.add(_constructMethod);
                        AnnotatedMethod remove = annotatedMethodMap2.remove(method);
                        if (remove != null) {
                            _addMixOvers(remove.getAnnotated(), _constructMethod, false);
                        }
                    } else {
                        _addMixUnders(method, find);
                        if (find.getDeclaringClass().isInterface() && !method.getDeclaringClass().isInterface()) {
                            annotatedMethodMap.add(find.withMethod(method));
                        }
                    }
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    public void _addMethodMixIns(Class<?> cls, AnnotatedMethodMap annotatedMethodMap, Class<?> cls2, AnnotatedMethodMap annotatedMethodMap2) {
        for (Class<?> declaredMethods : ClassUtil.findRawSuperTypes(cls2, cls, true)) {
            for (Method method : ClassUtil.getDeclaredMethods(declaredMethods)) {
                if (_isIncludableMemberMethod(method)) {
                    AnnotatedMethod find = annotatedMethodMap.find(method);
                    if (find != null) {
                        _addMixUnders(method, find);
                    } else {
                        AnnotatedMethod find2 = annotatedMethodMap2.find(method);
                        if (find2 != null) {
                            _addMixUnders(method, find2);
                        } else {
                            annotatedMethodMap2.add(_constructMethod(method, this));
                        }
                    }
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    public void _addMixOvers(Constructor<?> constructor, AnnotatedConstructor annotatedConstructor, boolean z10) {
        _addOrOverrideAnnotations(annotatedConstructor, constructor.getDeclaredAnnotations());
        if (z10) {
            Annotation[][] parameterAnnotations = constructor.getParameterAnnotations();
            int length = parameterAnnotations.length;
            for (int i10 = 0; i10 < length; i10++) {
                for (Annotation addOrOverrideParam : parameterAnnotations[i10]) {
                    annotatedConstructor.addOrOverrideParam(i10, addOrOverrideParam);
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    public void _addMixUnders(Method method, AnnotatedMethod annotatedMethod) {
        _addAnnotationsIfNotPresent((AnnotatedMember) annotatedMethod, method.getDeclaredAnnotations());
    }

    /* access modifiers changed from: protected */
    public AnnotationMap[] _collectRelevantAnnotations(Annotation[][] annotationArr) {
        int length = annotationArr.length;
        AnnotationMap[] annotationMapArr = new AnnotationMap[length];
        for (int i10 = 0; i10 < length; i10++) {
            annotationMapArr[i10] = _collectRelevantAnnotations(annotationArr[i10]);
        }
        return annotationMapArr;
    }

    /* access modifiers changed from: protected */
    public AnnotatedMethod _constructCreatorMethod(Method method, TypeResolutionContext typeResolutionContext) {
        int length = method.getParameterTypes().length;
        if (this._annotationIntrospector == null) {
            return new AnnotatedMethod(typeResolutionContext, method, _emptyAnnotationMap(), _emptyAnnotationMaps(length));
        }
        if (length == 0) {
            return new AnnotatedMethod(typeResolutionContext, method, _collectRelevantAnnotations(method.getDeclaredAnnotations()), NO_ANNOTATION_MAPS);
        }
        return new AnnotatedMethod(typeResolutionContext, method, _collectRelevantAnnotations(method.getDeclaredAnnotations()), _collectRelevantAnnotations(method.getParameterAnnotations()));
    }

    /* access modifiers changed from: protected */
    public AnnotatedConstructor _constructDefaultConstructor(ClassUtil.Ctor ctor, TypeResolutionContext typeResolutionContext) {
        if (this._annotationIntrospector == null) {
            return new AnnotatedConstructor(typeResolutionContext, ctor.getConstructor(), _emptyAnnotationMap(), NO_ANNOTATION_MAPS);
        }
        return new AnnotatedConstructor(typeResolutionContext, ctor.getConstructor(), _collectRelevantAnnotations(ctor.getDeclaredAnnotations()), NO_ANNOTATION_MAPS);
    }

    /* access modifiers changed from: protected */
    public AnnotatedField _constructField(Field field, TypeResolutionContext typeResolutionContext) {
        if (this._annotationIntrospector == null) {
            return new AnnotatedField(typeResolutionContext, field, _emptyAnnotationMap());
        }
        return new AnnotatedField(typeResolutionContext, field, _collectRelevantAnnotations(field.getDeclaredAnnotations()));
    }

    /* access modifiers changed from: protected */
    public AnnotatedMethod _constructMethod(Method method, TypeResolutionContext typeResolutionContext) {
        if (this._annotationIntrospector == null) {
            return new AnnotatedMethod(typeResolutionContext, method, _emptyAnnotationMap(), (AnnotationMap[]) null);
        }
        return new AnnotatedMethod(typeResolutionContext, method, _collectRelevantAnnotations(method.getDeclaredAnnotations()), (AnnotationMap[]) null);
    }

    /* access modifiers changed from: protected */
    public AnnotatedConstructor _constructNonDefaultConstructor(ClassUtil.Ctor ctor, TypeResolutionContext typeResolutionContext) {
        AnnotationMap[] annotationMapArr;
        Annotation[][] annotationArr;
        int paramCount = ctor.getParamCount();
        if (this._annotationIntrospector == null) {
            return new AnnotatedConstructor(typeResolutionContext, ctor.getConstructor(), _emptyAnnotationMap(), _emptyAnnotationMaps(paramCount));
        }
        if (paramCount == 0) {
            return new AnnotatedConstructor(typeResolutionContext, ctor.getConstructor(), _collectRelevantAnnotations(ctor.getDeclaredAnnotations()), NO_ANNOTATION_MAPS);
        }
        Annotation[][] parameterAnnotations = ctor.getParameterAnnotations();
        if (paramCount != parameterAnnotations.length) {
            Class<?> declaringClass = ctor.getDeclaringClass();
            if (declaringClass.isEnum() && paramCount == parameterAnnotations.length + 2) {
                annotationArr = new Annotation[(parameterAnnotations.length + 2)][];
                System.arraycopy(parameterAnnotations, 0, annotationArr, 2, parameterAnnotations.length);
                annotationMapArr = _collectRelevantAnnotations(annotationArr);
            } else if (!declaringClass.isMemberClass() || paramCount != parameterAnnotations.length + 1) {
                annotationArr = parameterAnnotations;
                annotationMapArr = null;
            } else {
                annotationArr = new Annotation[(parameterAnnotations.length + 1)][];
                System.arraycopy(parameterAnnotations, 0, annotationArr, 1, parameterAnnotations.length);
                annotationMapArr = _collectRelevantAnnotations(annotationArr);
            }
            if (annotationMapArr == null) {
                throw new IllegalStateException("Internal error: constructor for " + ctor.getDeclaringClass().getName() + " has mismatch: " + paramCount + " parameters; " + annotationArr.length + " sets of annotations");
            }
        } else {
            annotationMapArr = _collectRelevantAnnotations(parameterAnnotations);
        }
        return new AnnotatedConstructor(typeResolutionContext, ctor.getConstructor(), _collectRelevantAnnotations(ctor.getDeclaredAnnotations()), annotationMapArr);
    }

    /* access modifiers changed from: protected */
    public Method[] _findClassMethods(Class<?> cls) {
        try {
            return ClassUtil.getDeclaredMethods(cls);
        } catch (NoClassDefFoundError e10) {
            ClassLoader contextClassLoader = Thread.currentThread().getContextClassLoader();
            if (contextClassLoader != null) {
                try {
                    return contextClassLoader.loadClass(cls.getName()).getDeclaredMethods();
                } catch (ClassNotFoundException unused) {
                    throw e10;
                }
            } else {
                throw e10;
            }
        }
    }

    /* access modifiers changed from: protected */
    public Map<String, AnnotatedField> _findFields(JavaType javaType, TypeResolutionContext typeResolutionContext, Map<String, AnnotatedField> map) {
        Class<?> findMixInClassFor;
        JavaType superClass = javaType.getSuperClass();
        if (superClass != null) {
            Class<?> rawClass = javaType.getRawClass();
            map = _findFields(superClass, new TypeResolutionContext.Basic(this._typeFactory, superClass.getBindings()), map);
            for (Field field : ClassUtil.getDeclaredFields(rawClass)) {
                if (_isIncludableField(field)) {
                    if (map == null) {
                        map = new LinkedHashMap<>();
                    }
                    map.put(field.getName(), _constructField(field, typeResolutionContext));
                }
            }
            ClassIntrospector.MixInResolver mixInResolver = this._mixInResolver;
            if (!(mixInResolver == null || (findMixInClassFor = mixInResolver.findMixInClassFor(rawClass)) == null)) {
                _addFieldMixIns(findMixInClassFor, rawClass, map);
            }
        }
        return map;
    }

    /* access modifiers changed from: protected */
    public boolean _isIncludableMemberMethod(Method method) {
        if (!Modifier.isStatic(method.getModifiers()) && !method.isSynthetic() && !method.isBridge() && method.getParameterTypes().length <= 2) {
            return true;
        }
        return false;
    }

    public Iterable<Annotation> annotations() {
        return this._classAnnotations.annotations();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != AnnotatedClass.class) {
            return false;
        }
        if (((AnnotatedClass) obj)._class == this._class) {
            return true;
        }
        return false;
    }

    public Iterable<AnnotatedField> fields() {
        if (this._fields == null) {
            resolveFields();
        }
        return this._fields;
    }

    public AnnotatedMethod findMethod(String str, Class<?>[] clsArr) {
        if (this._memberMethods == null) {
            resolveMemberMethods();
        }
        return this._memberMethods.find(str, clsArr);
    }

    /* access modifiers changed from: protected */
    public AnnotationMap getAllAnnotations() {
        return this._classAnnotations;
    }

    public <A extends Annotation> A getAnnotation(Class<A> cls) {
        return this._classAnnotations.get(cls);
    }

    public Annotations getAnnotations() {
        return this._classAnnotations;
    }

    public List<AnnotatedConstructor> getConstructors() {
        if (!this._creatorsResolved) {
            resolveCreators();
        }
        return this._constructors;
    }

    public AnnotatedConstructor getDefaultConstructor() {
        if (!this._creatorsResolved) {
            resolveCreators();
        }
        return this._defaultConstructor;
    }

    public int getFieldCount() {
        if (this._fields == null) {
            resolveFields();
        }
        return this._fields.size();
    }

    public int getMemberMethodCount() {
        if (this._memberMethods == null) {
            resolveMemberMethods();
        }
        return this._memberMethods.size();
    }

    public int getModifiers() {
        return this._class.getModifiers();
    }

    public String getName() {
        return this._class.getName();
    }

    public Class<?> getRawType() {
        return this._class;
    }

    public List<AnnotatedMethod> getStaticMethods() {
        if (!this._creatorsResolved) {
            resolveCreators();
        }
        return this._creatorMethods;
    }

    public JavaType getType() {
        return this._type;
    }

    public boolean hasAnnotation(Class<?> cls) {
        return this._classAnnotations.has(cls);
    }

    public boolean hasAnnotations() {
        if (this._classAnnotations.size() > 0) {
            return true;
        }
        return false;
    }

    public boolean hasOneOf(Class<? extends Annotation>[] clsArr) {
        return this._classAnnotations.hasOneOf(clsArr);
    }

    public int hashCode() {
        return this._class.getName().hashCode();
    }

    public boolean isNonStaticInnerClass() {
        Boolean bool = this._nonStaticInnerClass;
        if (bool == null) {
            bool = Boolean.valueOf(ClassUtil.isNonStaticInnerClass(this._class));
            this._nonStaticInnerClass = bool;
        }
        return bool.booleanValue();
    }

    public Iterable<AnnotatedMethod> memberMethods() {
        if (this._memberMethods == null) {
            resolveMemberMethods();
        }
        return this._memberMethods;
    }

    public JavaType resolveType(Type type) {
        return this._typeFactory.constructType(type, this._bindings);
    }

    public String toString() {
        return "[AnnotedClass " + this._class.getName() + "]";
    }

    public Class<?> getAnnotated() {
        return this._class;
    }

    public AnnotatedClass withAnnotations(AnnotationMap annotationMap) {
        return new AnnotatedClass(this, annotationMap);
    }

    public static AnnotatedClass construct(JavaType javaType, MapperConfig<?> mapperConfig, ClassIntrospector.MixInResolver mixInResolver) {
        return new AnnotatedClass(javaType, javaType.getRawClass(), javaType.getBindings(), ClassUtil.findSuperTypes(javaType, (Class<?>) null, false), mapperConfig.isAnnotationProcessingEnabled() ? mapperConfig.getAnnotationIntrospector() : null, mixInResolver, mapperConfig.getTypeFactory());
    }

    public static AnnotatedClass constructWithoutSuperTypes(Class<?> cls, MapperConfig<?> mapperConfig, ClassIntrospector.MixInResolver mixInResolver) {
        if (mapperConfig == null) {
            return new AnnotatedClass((JavaType) null, cls, TypeBindings.emptyBindings(), Collections.emptyList(), (AnnotationIntrospector) null, (ClassIntrospector.MixInResolver) null, (TypeFactory) null);
        }
        return new AnnotatedClass((JavaType) null, cls, TypeBindings.emptyBindings(), Collections.emptyList(), mapperConfig.isAnnotationProcessingEnabled() ? mapperConfig.getAnnotationIntrospector() : null, mixInResolver, mapperConfig.getTypeFactory());
    }

    /* access modifiers changed from: protected */
    public void _addClassMixIns(AnnotationMap annotationMap, Class<?> cls) {
        ClassIntrospector.MixInResolver mixInResolver = this._mixInResolver;
        if (mixInResolver != null) {
            _addClassMixIns(annotationMap, cls, mixInResolver.findMixInClassFor(cls));
        }
    }

    /* access modifiers changed from: protected */
    public AnnotationMap _collectRelevantAnnotations(Annotation[] annotationArr) {
        return _addAnnotationsIfNotPresent(new AnnotationMap(), annotationArr);
    }

    private void _addAnnotationsIfNotPresent(AnnotatedMember annotatedMember, Annotation[] annotationArr) {
        if (annotationArr != null) {
            List<Annotation> list = null;
            for (Annotation annotation : annotationArr) {
                if (annotatedMember.addIfNotPresent(annotation) && _isAnnotationBundle(annotation)) {
                    list = _addFromBundle(annotation, list);
                }
            }
            if (list != null) {
                _addAnnotationsIfNotPresent(annotatedMember, (Annotation[]) list.toArray(new Annotation[list.size()]));
            }
        }
    }

    /* access modifiers changed from: protected */
    public void _addClassMixIns(AnnotationMap annotationMap, Class<?> cls, Class<?> cls2) {
        if (cls2 != null) {
            _addAnnotationsIfNotPresent(annotationMap, ClassUtil.findClassAnnotations(cls2));
            for (Class<?> findClassAnnotations : ClassUtil.findSuperClasses(cls2, cls, false)) {
                _addAnnotationsIfNotPresent(annotationMap, ClassUtil.findClassAnnotations(findClassAnnotations));
            }
        }
    }

    /* access modifiers changed from: protected */
    public void _addMixOvers(Method method, AnnotatedMethod annotatedMethod, boolean z10) {
        _addOrOverrideAnnotations(annotatedMethod, method.getDeclaredAnnotations());
        if (z10) {
            Annotation[][] parameterAnnotations = method.getParameterAnnotations();
            int length = parameterAnnotations.length;
            for (int i10 = 0; i10 < length; i10++) {
                for (Annotation addOrOverrideParam : parameterAnnotations[i10]) {
                    annotatedMethod.addOrOverrideParam(i10, addOrOverrideParam);
                }
            }
        }
    }

    private AnnotatedClass(AnnotatedClass annotatedClass, AnnotationMap annotationMap) {
        this._type = annotatedClass._type;
        this._class = annotatedClass._class;
        this._bindings = annotatedClass._bindings;
        this._superTypes = annotatedClass._superTypes;
        this._annotationIntrospector = annotatedClass._annotationIntrospector;
        this._typeFactory = annotatedClass._typeFactory;
        this._mixInResolver = annotatedClass._mixInResolver;
        this._primaryMixIn = annotatedClass._primaryMixIn;
        this._classAnnotations = annotationMap;
    }
}
