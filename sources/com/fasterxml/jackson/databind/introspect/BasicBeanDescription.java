package com.fasterxml.jackson.databind.introspect;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.BeanDescription;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.PropertyName;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import com.fasterxml.jackson.databind.cfg.HandlerInstantiator;
import com.fasterxml.jackson.databind.cfg.MapperConfig;
import com.fasterxml.jackson.databind.type.TypeBindings;
import com.fasterxml.jackson.databind.util.Annotations;
import com.fasterxml.jackson.databind.util.ClassUtil;
import com.fasterxml.jackson.databind.util.Converter;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class BasicBeanDescription extends BeanDescription {
    protected final AnnotationIntrospector _annotationIntrospector;
    protected final AnnotatedClass _classInfo;
    protected final MapperConfig<?> _config;
    protected ObjectIdInfo _objectIdInfo;
    protected final POJOPropertiesCollector _propCollector;
    protected List<BeanPropertyDefinition> _properties;

    protected BasicBeanDescription(POJOPropertiesCollector pOJOPropertiesCollector, JavaType javaType, AnnotatedClass annotatedClass) {
        super(javaType);
        this._propCollector = pOJOPropertiesCollector;
        MapperConfig<?> config = pOJOPropertiesCollector.getConfig();
        this._config = config;
        if (config == null) {
            this._annotationIntrospector = null;
        } else {
            this._annotationIntrospector = config.getAnnotationIntrospector();
        }
        this._classInfo = annotatedClass;
    }

    public static BasicBeanDescription forDeserialization(POJOPropertiesCollector pOJOPropertiesCollector) {
        return new BasicBeanDescription(pOJOPropertiesCollector);
    }

    public static BasicBeanDescription forOtherUse(MapperConfig<?> mapperConfig, JavaType javaType, AnnotatedClass annotatedClass) {
        return new BasicBeanDescription(mapperConfig, javaType, annotatedClass, Collections.emptyList());
    }

    public static BasicBeanDescription forSerialization(POJOPropertiesCollector pOJOPropertiesCollector) {
        return new BasicBeanDescription(pOJOPropertiesCollector);
    }

    public Converter<Object, Object> _createConverter(Object obj) {
        Converter<?, ?> converter = null;
        if (obj == null) {
            return null;
        }
        if (obj instanceof Converter) {
            return (Converter) obj;
        }
        if (obj instanceof Class) {
            Class<Converter.None> cls = (Class) obj;
            if (cls == Converter.None.class || ClassUtil.isBogusClass(cls)) {
                return null;
            }
            if (Converter.class.isAssignableFrom(cls)) {
                HandlerInstantiator handlerInstantiator = this._config.getHandlerInstantiator();
                if (handlerInstantiator != null) {
                    converter = handlerInstantiator.converterInstance(this._config, this._classInfo, cls);
                }
                if (converter == null) {
                    return (Converter) ClassUtil.createInstance(cls, this._config.canOverrideAccessModifiers());
                }
                return converter;
            }
            throw new IllegalStateException("AnnotationIntrospector returned Class " + cls.getName() + "; expected Class<Converter>");
        }
        throw new IllegalStateException("AnnotationIntrospector returned Converter definition of type " + obj.getClass().getName() + "; expected type Converter or Class<Converter> instead");
    }

    /* access modifiers changed from: protected */
    @Deprecated
    public PropertyName _findCreatorPropertyName(AnnotatedParameter annotatedParameter) {
        String findImplicitPropertyName;
        PropertyName findNameForDeserialization = this._annotationIntrospector.findNameForDeserialization(annotatedParameter);
        if ((findNameForDeserialization == null || findNameForDeserialization.isEmpty()) && (findImplicitPropertyName = this._annotationIntrospector.findImplicitPropertyName(annotatedParameter)) != null && !findImplicitPropertyName.isEmpty()) {
            return PropertyName.construct(findImplicitPropertyName);
        }
        return findNameForDeserialization;
    }

    @Deprecated
    public LinkedHashMap<String, AnnotatedField> _findPropertyFields(Collection<String> collection, boolean z10) {
        LinkedHashMap<String, AnnotatedField> linkedHashMap = new LinkedHashMap<>();
        for (BeanPropertyDefinition next : _properties()) {
            AnnotatedField field = next.getField();
            if (field != null) {
                String name = next.getName();
                if (collection == null || !collection.contains(name)) {
                    linkedHashMap.put(name, field);
                }
            }
        }
        return linkedHashMap;
    }

    /* access modifiers changed from: protected */
    public List<BeanPropertyDefinition> _properties() {
        if (this._properties == null) {
            this._properties = this._propCollector.getProperties();
        }
        return this._properties;
    }

    public boolean addProperty(BeanPropertyDefinition beanPropertyDefinition) {
        if (hasProperty(beanPropertyDefinition.getFullName())) {
            return false;
        }
        _properties().add(beanPropertyDefinition);
        return true;
    }

    @Deprecated
    public TypeBindings bindingsForBeanType() {
        return this._type.getBindings();
    }

    public AnnotatedMember findAnyGetter() {
        AnnotatedMember annotatedMember;
        POJOPropertiesCollector pOJOPropertiesCollector = this._propCollector;
        if (pOJOPropertiesCollector == null) {
            annotatedMember = null;
        } else {
            annotatedMember = pOJOPropertiesCollector.getAnyGetter();
        }
        if (annotatedMember != null) {
            if (!Map.class.isAssignableFrom(annotatedMember.getRawType())) {
                throw new IllegalArgumentException("Invalid 'any-getter' annotation on method " + annotatedMember.getName() + "(): return type is not instance of java.util.Map");
            }
        }
        return annotatedMember;
    }

    public AnnotatedMethod findAnySetter() {
        AnnotatedMethod annotatedMethod;
        Class<?> rawParameterType;
        POJOPropertiesCollector pOJOPropertiesCollector = this._propCollector;
        if (pOJOPropertiesCollector == null) {
            annotatedMethod = null;
        } else {
            annotatedMethod = pOJOPropertiesCollector.getAnySetterMethod();
        }
        if (annotatedMethod == null || (rawParameterType = annotatedMethod.getRawParameterType(0)) == String.class || rawParameterType == Object.class) {
            return annotatedMethod;
        }
        throw new IllegalArgumentException("Invalid 'any-setter' annotation on method " + annotatedMethod.getName() + "(): first argument not of type String or Object, but " + rawParameterType.getName());
    }

    public AnnotatedMember findAnySetterField() {
        AnnotatedMember annotatedMember;
        POJOPropertiesCollector pOJOPropertiesCollector = this._propCollector;
        if (pOJOPropertiesCollector == null) {
            annotatedMember = null;
        } else {
            annotatedMember = pOJOPropertiesCollector.getAnySetterField();
        }
        if (annotatedMember != null) {
            if (!Map.class.isAssignableFrom(annotatedMember.getRawType())) {
                throw new IllegalArgumentException("Invalid 'any-setter' annotation on field " + annotatedMember.getName() + "(): type is not instance of java.util.Map");
            }
        }
        return annotatedMember;
    }

    public Map<String, AnnotatedMember> findBackReferenceProperties() {
        AnnotationIntrospector.ReferenceProperty findReferenceType;
        HashMap hashMap = null;
        for (BeanPropertyDefinition mutator : _properties()) {
            AnnotatedMember mutator2 = mutator.getMutator();
            if (!(mutator2 == null || (findReferenceType = this._annotationIntrospector.findReferenceType(mutator2)) == null || !findReferenceType.isBackReference())) {
                if (hashMap == null) {
                    hashMap = new HashMap();
                }
                String name = findReferenceType.getName();
                if (hashMap.put(name, mutator2) != null) {
                    throw new IllegalArgumentException("Multiple back-reference properties with name '" + name + "'");
                }
            }
        }
        return hashMap;
    }

    public String findClassDescription() {
        AnnotationIntrospector annotationIntrospector = this._annotationIntrospector;
        if (annotationIntrospector == null) {
            return null;
        }
        return annotationIntrospector.findClassDescription(this._classInfo);
    }

    public AnnotatedConstructor findDefaultConstructor() {
        return this._classInfo.getDefaultConstructor();
    }

    public Converter<Object, Object> findDeserializationConverter() {
        AnnotationIntrospector annotationIntrospector = this._annotationIntrospector;
        if (annotationIntrospector == null) {
            return null;
        }
        return _createConverter(annotationIntrospector.findDeserializationConverter(this._classInfo));
    }

    public JsonFormat.Value findExpectedFormat(JsonFormat.Value value) {
        JsonFormat.Value findFormat;
        AnnotationIntrospector annotationIntrospector = this._annotationIntrospector;
        if (!(annotationIntrospector == null || (findFormat = annotationIntrospector.findFormat(this._classInfo)) == null)) {
            if (value == null) {
                value = findFormat;
            } else {
                value = value.withOverrides(findFormat);
            }
        }
        JsonFormat.Value defaultPropertyFormat = this._config.getDefaultPropertyFormat(this._classInfo.getRawType());
        if (defaultPropertyFormat == null) {
            return value;
        }
        if (value == null) {
            return defaultPropertyFormat;
        }
        return value.withOverrides(defaultPropertyFormat);
    }

    public Method findFactoryMethod(Class<?>... clsArr) {
        for (AnnotatedMethod next : this._classInfo.getStaticMethods()) {
            if (isFactoryMethod(next) && next.getParameterCount() == 1) {
                Class<?> rawParameterType = next.getRawParameterType(0);
                for (Class<?> isAssignableFrom : clsArr) {
                    if (rawParameterType.isAssignableFrom(isAssignableFrom)) {
                        return next.getAnnotated();
                    }
                }
                continue;
            }
        }
        return null;
    }

    public Map<Object, AnnotatedMember> findInjectables() {
        POJOPropertiesCollector pOJOPropertiesCollector = this._propCollector;
        if (pOJOPropertiesCollector != null) {
            return pOJOPropertiesCollector.getInjectables();
        }
        return Collections.emptyMap();
    }

    public AnnotatedMethod findJsonValueMethod() {
        POJOPropertiesCollector pOJOPropertiesCollector = this._propCollector;
        if (pOJOPropertiesCollector == null) {
            return null;
        }
        return pOJOPropertiesCollector.getJsonValueMethod();
    }

    public AnnotatedMethod findMethod(String str, Class<?>[] clsArr) {
        return this._classInfo.findMethod(str, clsArr);
    }

    public Class<?> findPOJOBuilder() {
        AnnotationIntrospector annotationIntrospector = this._annotationIntrospector;
        if (annotationIntrospector == null) {
            return null;
        }
        return annotationIntrospector.findPOJOBuilder(this._classInfo);
    }

    public JsonPOJOBuilder.Value findPOJOBuilderConfig() {
        AnnotationIntrospector annotationIntrospector = this._annotationIntrospector;
        if (annotationIntrospector == null) {
            return null;
        }
        return annotationIntrospector.findPOJOBuilderConfig(this._classInfo);
    }

    public List<BeanPropertyDefinition> findProperties() {
        return _properties();
    }

    public BeanPropertyDefinition findProperty(PropertyName propertyName) {
        for (BeanPropertyDefinition next : _properties()) {
            if (next.hasName(propertyName)) {
                return next;
            }
        }
        return null;
    }

    public JsonInclude.Value findPropertyInclusion(JsonInclude.Value value) {
        JsonInclude.Value findPropertyInclusion;
        AnnotationIntrospector annotationIntrospector = this._annotationIntrospector;
        if (annotationIntrospector == null || (findPropertyInclusion = annotationIntrospector.findPropertyInclusion(this._classInfo)) == null) {
            return value;
        }
        if (value == null) {
            return findPropertyInclusion;
        }
        return value.withOverrides(findPropertyInclusion);
    }

    public Converter<Object, Object> findSerializationConverter() {
        AnnotationIntrospector annotationIntrospector = this._annotationIntrospector;
        if (annotationIntrospector == null) {
            return null;
        }
        return _createConverter(annotationIntrospector.findSerializationConverter(this._classInfo));
    }

    public Constructor<?> findSingleArgConstructor(Class<?>... clsArr) {
        for (AnnotatedConstructor next : this._classInfo.getConstructors()) {
            if (next.getParameterCount() == 1) {
                Class<?> rawParameterType = next.getRawParameterType(0);
                for (Class<?> cls : clsArr) {
                    if (cls == rawParameterType) {
                        return next.getAnnotated();
                    }
                }
                continue;
            }
        }
        return null;
    }

    public Annotations getClassAnnotations() {
        return this._classInfo.getAnnotations();
    }

    public AnnotatedClass getClassInfo() {
        return this._classInfo;
    }

    public List<AnnotatedConstructor> getConstructors() {
        return this._classInfo.getConstructors();
    }

    public List<AnnotatedMethod> getFactoryMethods() {
        List<AnnotatedMethod> staticMethods = this._classInfo.getStaticMethods();
        if (staticMethods.isEmpty()) {
            return staticMethods;
        }
        ArrayList arrayList = new ArrayList();
        for (AnnotatedMethod next : staticMethods) {
            if (isFactoryMethod(next)) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    public Set<String> getIgnoredPropertyNames() {
        Set<String> set;
        POJOPropertiesCollector pOJOPropertiesCollector = this._propCollector;
        if (pOJOPropertiesCollector == null) {
            set = null;
        } else {
            set = pOJOPropertiesCollector.getIgnoredPropertyNames();
        }
        if (set == null) {
            return Collections.emptySet();
        }
        return set;
    }

    public ObjectIdInfo getObjectIdInfo() {
        return this._objectIdInfo;
    }

    public boolean hasKnownClassAnnotations() {
        return this._classInfo.hasAnnotations();
    }

    public boolean hasProperty(PropertyName propertyName) {
        if (findProperty(propertyName) != null) {
            return true;
        }
        return false;
    }

    public Object instantiateBean(boolean z10) {
        AnnotatedConstructor defaultConstructor = this._classInfo.getDefaultConstructor();
        if (defaultConstructor == null) {
            return null;
        }
        if (z10) {
            defaultConstructor.fixAccess(this._config.isEnabled(MapperFeature.OVERRIDE_PUBLIC_ACCESS_MODIFIERS));
        }
        try {
            return defaultConstructor.getAnnotated().newInstance((Object[]) null);
        } catch (Exception e10) {
            e = e10;
            while (e.getCause() != null) {
                e = e.getCause();
            }
            if (e instanceof Error) {
                throw ((Error) e);
            } else if (e instanceof RuntimeException) {
                throw ((RuntimeException) e);
            } else {
                throw new IllegalArgumentException("Failed to instantiate bean of type " + this._classInfo.getAnnotated().getName() + ": (" + e.getClass().getName() + ") " + e.getMessage(), e);
            }
        }
    }

    /* access modifiers changed from: protected */
    public boolean isFactoryMethod(AnnotatedMethod annotatedMethod) {
        Class<?> rawParameterType;
        if (!getBeanClass().isAssignableFrom(annotatedMethod.getRawReturnType())) {
            return false;
        }
        if (this._annotationIntrospector.hasCreatorAnnotation(annotatedMethod)) {
            return true;
        }
        String name = annotatedMethod.getName();
        if ("valueOf".equals(name) && annotatedMethod.getParameterCount() == 1) {
            return true;
        }
        if (!"fromString".equals(name) || annotatedMethod.getParameterCount() != 1 || ((rawParameterType = annotatedMethod.getRawParameterType(0)) != String.class && !CharSequence.class.isAssignableFrom(rawParameterType))) {
            return false;
        }
        return true;
    }

    public boolean removeProperty(String str) {
        Iterator<BeanPropertyDefinition> it = _properties().iterator();
        while (it.hasNext()) {
            if (it.next().getName().equals(str)) {
                it.remove();
                return true;
            }
        }
        return false;
    }

    @Deprecated
    public JavaType resolveType(Type type) {
        if (type == null) {
            return null;
        }
        return this._config.getTypeFactory().constructType(type, this._type.getBindings());
    }

    protected BasicBeanDescription(MapperConfig<?> mapperConfig, JavaType javaType, AnnotatedClass annotatedClass, List<BeanPropertyDefinition> list) {
        super(javaType);
        this._propCollector = null;
        this._config = mapperConfig;
        if (mapperConfig == null) {
            this._annotationIntrospector = null;
        } else {
            this._annotationIntrospector = mapperConfig.getAnnotationIntrospector();
        }
        this._classInfo = annotatedClass;
        this._properties = list;
    }

    protected BasicBeanDescription(POJOPropertiesCollector pOJOPropertiesCollector) {
        this(pOJOPropertiesCollector, pOJOPropertiesCollector.getType(), pOJOPropertiesCollector.getClassDef());
        this._objectIdInfo = pOJOPropertiesCollector.getObjectIdInfo();
    }
}
