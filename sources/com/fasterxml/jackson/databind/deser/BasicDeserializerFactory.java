package com.fasterxml.jackson.databind.deser;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.core.JsonLocation;
import com.fasterxml.jackson.databind.AbstractTypeResolver;
import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.BeanDescription;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.KeyDeserializer;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.PropertyMetadata;
import com.fasterxml.jackson.databind.PropertyName;
import com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig;
import com.fasterxml.jackson.databind.cfg.HandlerInstantiator;
import com.fasterxml.jackson.databind.cfg.MapperConfig;
import com.fasterxml.jackson.databind.deser.impl.CreatorCollector;
import com.fasterxml.jackson.databind.deser.std.ArrayBlockingQueueDeserializer;
import com.fasterxml.jackson.databind.deser.std.AtomicReferenceDeserializer;
import com.fasterxml.jackson.databind.deser.std.CollectionDeserializer;
import com.fasterxml.jackson.databind.deser.std.DateDeserializers;
import com.fasterxml.jackson.databind.deser.std.EnumDeserializer;
import com.fasterxml.jackson.databind.deser.std.EnumSetDeserializer;
import com.fasterxml.jackson.databind.deser.std.JdkDeserializers;
import com.fasterxml.jackson.databind.deser.std.JsonLocationInstantiator;
import com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer;
import com.fasterxml.jackson.databind.deser.std.MapEntryDeserializer;
import com.fasterxml.jackson.databind.deser.std.NumberDeserializers;
import com.fasterxml.jackson.databind.deser.std.ObjectArrayDeserializer;
import com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers;
import com.fasterxml.jackson.databind.deser.std.StdKeyDeserializers;
import com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer;
import com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer;
import com.fasterxml.jackson.databind.deser.std.StringDeserializer;
import com.fasterxml.jackson.databind.deser.std.TokenBufferDeserializer;
import com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer;
import com.fasterxml.jackson.databind.ext.OptionalHandlerFactory;
import com.fasterxml.jackson.databind.introspect.Annotated;
import com.fasterxml.jackson.databind.introspect.AnnotatedClass;
import com.fasterxml.jackson.databind.introspect.AnnotatedConstructor;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.introspect.AnnotatedMethod;
import com.fasterxml.jackson.databind.introspect.AnnotatedParameter;
import com.fasterxml.jackson.databind.introspect.AnnotatedWithParams;
import com.fasterxml.jackson.databind.introspect.BasicBeanDescription;
import com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition;
import com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder;
import com.fasterxml.jackson.databind.introspect.VisibilityChecker;
import com.fasterxml.jackson.databind.jsontype.NamedType;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder;
import com.fasterxml.jackson.databind.type.ArrayType;
import com.fasterxml.jackson.databind.type.CollectionLikeType;
import com.fasterxml.jackson.databind.type.CollectionType;
import com.fasterxml.jackson.databind.type.MapLikeType;
import com.fasterxml.jackson.databind.type.MapType;
import com.fasterxml.jackson.databind.type.ReferenceType;
import com.fasterxml.jackson.databind.type.TypeFactory;
import com.fasterxml.jackson.databind.util.ClassUtil;
import com.fasterxml.jackson.databind.util.EnumResolver;
import com.fasterxml.jackson.databind.util.SimpleBeanPropertyDefinition;
import com.fasterxml.jackson.databind.util.TokenBuffer;
import java.io.Serializable;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.NavigableMap;
import java.util.Queue;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ConcurrentNavigableMap;
import java.util.concurrent.ConcurrentSkipListMap;
import java.util.concurrent.atomic.AtomicReference;

public abstract class BasicDeserializerFactory extends DeserializerFactory implements Serializable {
    private static final Class<?> CLASS_CHAR_BUFFER = CharSequence.class;
    private static final Class<?> CLASS_ITERABLE = Iterable.class;
    private static final Class<?> CLASS_MAP_ENTRY = Map.Entry.class;
    private static final Class<?> CLASS_OBJECT = Object.class;
    private static final Class<?> CLASS_STRING = String.class;
    protected static final PropertyName UNWRAPPED_CREATOR_PARAM_NAME = new PropertyName("@JsonUnwrapped");
    static final HashMap<String, Class<? extends Collection>> _collectionFallbacks;
    static final HashMap<String, Class<? extends Map>> _mapFallbacks;
    protected final DeserializerFactoryConfig _factoryConfig;

    static {
        HashMap<String, Class<? extends Map>> hashMap = new HashMap<>();
        _mapFallbacks = hashMap;
        hashMap.put(Map.class.getName(), LinkedHashMap.class);
        hashMap.put(ConcurrentMap.class.getName(), ConcurrentHashMap.class);
        Class<TreeMap> cls = TreeMap.class;
        hashMap.put(SortedMap.class.getName(), cls);
        hashMap.put(NavigableMap.class.getName(), cls);
        hashMap.put(ConcurrentNavigableMap.class.getName(), ConcurrentSkipListMap.class);
        HashMap<String, Class<? extends Collection>> hashMap2 = new HashMap<>();
        _collectionFallbacks = hashMap2;
        Class<ArrayList> cls2 = ArrayList.class;
        hashMap2.put(Collection.class.getName(), cls2);
        hashMap2.put(List.class.getName(), cls2);
        hashMap2.put(Set.class.getName(), HashSet.class);
        Class<TreeSet> cls3 = TreeSet.class;
        hashMap2.put(SortedSet.class.getName(), cls3);
        Class<LinkedList> cls4 = LinkedList.class;
        hashMap2.put(Queue.class.getName(), cls4);
        hashMap2.put("java.util.Deque", cls4);
        hashMap2.put("java.util.NavigableSet", cls3);
    }

    protected BasicDeserializerFactory(DeserializerFactoryConfig deserializerFactoryConfig) {
        this._factoryConfig = deserializerFactoryConfig;
    }

    private KeyDeserializer _createEnumKeyDeserializer(DeserializationContext deserializationContext, JavaType javaType) {
        DeserializationConfig config = deserializationContext.getConfig();
        Class<?> rawClass = javaType.getRawClass();
        BeanDescription introspect = config.introspect(javaType);
        KeyDeserializer findKeyDeserializerFromAnnotation = findKeyDeserializerFromAnnotation(deserializationContext, introspect.getClassInfo());
        if (findKeyDeserializerFromAnnotation != null) {
            return findKeyDeserializerFromAnnotation;
        }
        JsonDeserializer<?> _findCustomEnumDeserializer = _findCustomEnumDeserializer(rawClass, config, introspect);
        if (_findCustomEnumDeserializer != null) {
            return StdKeyDeserializers.constructDelegatingKeyDeserializer(config, javaType, _findCustomEnumDeserializer);
        }
        JsonDeserializer<Object> findDeserializerFromAnnotation = findDeserializerFromAnnotation(deserializationContext, introspect.getClassInfo());
        if (findDeserializerFromAnnotation != null) {
            return StdKeyDeserializers.constructDelegatingKeyDeserializer(config, javaType, findDeserializerFromAnnotation);
        }
        EnumResolver constructEnumResolver = constructEnumResolver(rawClass, config, introspect.findJsonValueMethod());
        AnnotationIntrospector annotationIntrospector = config.getAnnotationIntrospector();
        for (AnnotatedMethod next : introspect.getFactoryMethods()) {
            if (annotationIntrospector.hasCreatorAnnotation(next)) {
                if (next.getParameterCount() != 1 || !next.getRawReturnType().isAssignableFrom(rawClass)) {
                    throw new IllegalArgumentException("Unsuitable method (" + next + ") decorated with @JsonCreator (for Enum type " + rawClass.getName() + ")");
                } else if (next.getRawParameterType(0) == String.class) {
                    if (config.canOverrideAccessModifiers()) {
                        ClassUtil.checkAndFixAccess(next.getMember(), deserializationContext.isEnabled(MapperFeature.OVERRIDE_PUBLIC_ACCESS_MODIFIERS));
                    }
                    return StdKeyDeserializers.constructEnumKeyDeserializer(constructEnumResolver, next);
                } else {
                    throw new IllegalArgumentException("Parameter #0 type for factory method (" + next + ") not suitable, must be java.lang.String");
                }
            }
        }
        return StdKeyDeserializers.constructEnumKeyDeserializer(constructEnumResolver);
    }

    private ValueInstantiator _findStdValueInstantiator(DeserializationConfig deserializationConfig, BeanDescription beanDescription) {
        if (beanDescription.getBeanClass() == JsonLocation.class) {
            return new JsonLocationInstantiator();
        }
        return null;
    }

    private JavaType _mapAbstractType2(DeserializationConfig deserializationConfig, JavaType javaType) {
        Class<?> rawClass = javaType.getRawClass();
        if (!this._factoryConfig.hasAbstractTypeResolvers()) {
            return null;
        }
        for (AbstractTypeResolver findTypeMapping : this._factoryConfig.abstractTypeResolvers()) {
            JavaType findTypeMapping2 = findTypeMapping.findTypeMapping(deserializationConfig, javaType);
            if (findTypeMapping2 != null && findTypeMapping2.getRawClass() != rawClass) {
                return findTypeMapping2;
            }
        }
        return null;
    }

    /* access modifiers changed from: protected */
    public void _addDeserializerConstructors(DeserializationContext deserializationContext, BeanDescription beanDescription, VisibilityChecker<?> visibilityChecker, AnnotationIntrospector annotationIntrospector, CreatorCollector creatorCollector, Map<AnnotatedWithParams, BeanPropertyDefinition[]> map) {
        Iterator<AnnotatedConstructor> it;
        BeanPropertyDefinition beanPropertyDefinition;
        PropertyName propertyName;
        Iterator<AnnotatedConstructor> it2;
        int i10;
        int i11;
        SettableBeanProperty[] settableBeanPropertyArr;
        AnnotatedParameter annotatedParameter;
        BeanPropertyDefinition beanPropertyDefinition2;
        PropertyName propertyName2;
        AnnotationIntrospector annotationIntrospector2 = annotationIntrospector;
        CreatorCollector creatorCollector2 = creatorCollector;
        AnnotatedConstructor findDefaultConstructor = beanDescription.findDefaultConstructor();
        if (findDefaultConstructor != null && (!creatorCollector.hasDefaultCreator() || annotationIntrospector2.hasCreatorAnnotation(findDefaultConstructor))) {
            creatorCollector2.setDefaultCreator(findDefaultConstructor);
        }
        if (!beanDescription.isNonStaticInnerClass()) {
            Iterator<AnnotatedConstructor> it3 = beanDescription.getConstructors().iterator();
            LinkedList linkedList = null;
            while (it3.hasNext()) {
                AnnotatedConstructor next = it3.next();
                boolean hasCreatorAnnotation = annotationIntrospector2.hasCreatorAnnotation(next);
                BeanPropertyDefinition[] beanPropertyDefinitionArr = map.get(next);
                int parameterCount = next.getParameterCount();
                if (parameterCount == 1) {
                    if (beanPropertyDefinitionArr == null) {
                        beanPropertyDefinition2 = null;
                    } else {
                        beanPropertyDefinition2 = beanPropertyDefinitionArr[0];
                    }
                    if (_checkIfCreatorPropertyBased(annotationIntrospector2, next, beanPropertyDefinition2)) {
                        if (beanPropertyDefinition2 == null) {
                            propertyName2 = null;
                        } else {
                            propertyName2 = beanPropertyDefinition2.getFullName();
                        }
                        AnnotatedParameter parameter = next.getParameter(0);
                        creatorCollector2.addPropertyCreator(next, hasCreatorAnnotation, new SettableBeanProperty[]{constructCreatorProperty(deserializationContext, beanDescription, propertyName2, 0, parameter, annotationIntrospector2.findInjectableValueId(parameter))});
                    } else {
                        BeanPropertyDefinition beanPropertyDefinition3 = beanPropertyDefinition2;
                        _handleSingleArgumentConstructor(deserializationContext, beanDescription, visibilityChecker, annotationIntrospector, creatorCollector, next, hasCreatorAnnotation, visibilityChecker.isCreatorVisible((AnnotatedMember) next));
                        if (beanPropertyDefinition3 != null) {
                            ((POJOPropertyBuilder) beanPropertyDefinition3).removeConstructors();
                        }
                    }
                    it = it3;
                } else {
                    SettableBeanProperty[] settableBeanPropertyArr2 = new SettableBeanProperty[parameterCount];
                    int i12 = 0;
                    int i13 = 0;
                    int i14 = 0;
                    int i15 = 0;
                    AnnotatedParameter annotatedParameter2 = null;
                    while (i12 < parameterCount) {
                        AnnotatedParameter parameter2 = next.getParameter(i12);
                        if (beanPropertyDefinitionArr == null) {
                            beanPropertyDefinition = null;
                        } else {
                            beanPropertyDefinition = beanPropertyDefinitionArr[i12];
                        }
                        Object findInjectableValueId = annotationIntrospector2.findInjectableValueId(parameter2);
                        if (beanPropertyDefinition == null) {
                            propertyName = null;
                        } else {
                            propertyName = beanPropertyDefinition.getFullName();
                        }
                        if (beanPropertyDefinition == null || !beanPropertyDefinition.isExplicitlyNamed()) {
                            AnnotatedParameter annotatedParameter3 = parameter2;
                            annotatedParameter = annotatedParameter2;
                            i10 = i12;
                            i11 = parameterCount;
                            it2 = it3;
                            settableBeanPropertyArr = settableBeanPropertyArr2;
                            if (findInjectableValueId != null) {
                                i15++;
                                settableBeanPropertyArr[i10] = constructCreatorProperty(deserializationContext, beanDescription, propertyName, i10, annotatedParameter3, findInjectableValueId);
                            } else {
                                AnnotatedParameter annotatedParameter4 = annotatedParameter3;
                                if (annotationIntrospector2.findUnwrappingNameTransformer(annotatedParameter4) != null) {
                                    settableBeanPropertyArr[i10] = constructCreatorProperty(deserializationContext, beanDescription, UNWRAPPED_CREATOR_PARAM_NAME, i10, annotatedParameter4, (Object) null);
                                    i13++;
                                } else if (hasCreatorAnnotation && propertyName != null && !propertyName.isEmpty()) {
                                    i14++;
                                    settableBeanPropertyArr[i10] = constructCreatorProperty(deserializationContext, beanDescription, propertyName, i10, annotatedParameter4, findInjectableValueId);
                                } else if (annotatedParameter == null) {
                                    annotatedParameter2 = annotatedParameter4;
                                    i12 = i10 + 1;
                                    settableBeanPropertyArr2 = settableBeanPropertyArr;
                                    parameterCount = i11;
                                    it3 = it2;
                                    Map<AnnotatedWithParams, BeanPropertyDefinition[]> map2 = map;
                                }
                            }
                        } else {
                            i13++;
                            annotatedParameter = annotatedParameter2;
                            i10 = i12;
                            it2 = it3;
                            settableBeanPropertyArr = settableBeanPropertyArr2;
                            i11 = parameterCount;
                            settableBeanPropertyArr[i10] = constructCreatorProperty(deserializationContext, beanDescription, propertyName, i12, parameter2, findInjectableValueId);
                        }
                        annotatedParameter2 = annotatedParameter;
                        i12 = i10 + 1;
                        settableBeanPropertyArr2 = settableBeanPropertyArr;
                        parameterCount = i11;
                        it3 = it2;
                        Map<AnnotatedWithParams, BeanPropertyDefinition[]> map22 = map;
                    }
                    AnnotatedParameter annotatedParameter5 = annotatedParameter2;
                    int i16 = parameterCount;
                    it = it3;
                    SettableBeanProperty[] settableBeanPropertyArr3 = settableBeanPropertyArr2;
                    int i17 = i13 + i14;
                    if (hasCreatorAnnotation || i13 > 0 || i15 > 0) {
                        if (i17 + i15 == i16) {
                            creatorCollector2.addPropertyCreator(next, hasCreatorAnnotation, settableBeanPropertyArr3);
                        } else if (i13 == 0 && i15 + 1 == i16) {
                            creatorCollector2.addDelegatingCreator(next, hasCreatorAnnotation, settableBeanPropertyArr3);
                        } else {
                            PropertyName _findImplicitParamName = _findImplicitParamName(annotatedParameter5, annotationIntrospector2);
                            if (_findImplicitParamName == null || _findImplicitParamName.isEmpty()) {
                                throw new IllegalArgumentException("Argument #" + annotatedParameter5.getIndex() + " of constructor " + next + " has no property name annotation; must have name when multiple-parameter constructor annotated as Creator");
                            }
                        }
                    }
                    if (!creatorCollector.hasDefaultCreator()) {
                        if (linkedList == null) {
                            linkedList = new LinkedList();
                        }
                        linkedList.add(next);
                    }
                }
                it3 = it;
            }
            if (linkedList != null && !creatorCollector.hasDelegatingCreator() && !creatorCollector.hasPropertyBasedCreator()) {
                _checkImplicitlyNamedConstructors(deserializationContext, beanDescription, visibilityChecker, annotationIntrospector, creatorCollector, linkedList);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void _addDeserializerFactoryMethods(DeserializationContext deserializationContext, BeanDescription beanDescription, VisibilityChecker<?> visibilityChecker, AnnotationIntrospector annotationIntrospector, CreatorCollector creatorCollector, Map<AnnotatedWithParams, BeanPropertyDefinition[]> map) {
        BeanPropertyDefinition beanPropertyDefinition;
        PropertyName propertyName;
        BasicDeserializerFactory basicDeserializerFactory;
        BeanPropertyDefinition beanPropertyDefinition2;
        AnnotationIntrospector annotationIntrospector2 = annotationIntrospector;
        CreatorCollector creatorCollector2 = creatorCollector;
        DeserializationConfig config = deserializationContext.getConfig();
        for (AnnotatedMethod next : beanDescription.getFactoryMethods()) {
            boolean hasCreatorAnnotation = annotationIntrospector2.hasCreatorAnnotation(next);
            int parameterCount = next.getParameterCount();
            if (parameterCount != 0) {
                BeanPropertyDefinition[] beanPropertyDefinitionArr = map.get(next);
                int i10 = 0;
                if (parameterCount == 1) {
                    if (beanPropertyDefinitionArr == null) {
                        basicDeserializerFactory = this;
                        beanPropertyDefinition2 = null;
                    } else {
                        basicDeserializerFactory = this;
                        beanPropertyDefinition2 = beanPropertyDefinitionArr[0];
                    }
                    if (!basicDeserializerFactory._checkIfCreatorPropertyBased(annotationIntrospector2, next, beanPropertyDefinition2)) {
                        _handleSingleArgumentFactory(config, beanDescription, visibilityChecker, annotationIntrospector, creatorCollector, next, hasCreatorAnnotation);
                        if (beanPropertyDefinition2 != null) {
                            ((POJOPropertyBuilder) beanPropertyDefinition2).removeConstructors();
                        }
                    }
                } else {
                    if (!hasCreatorAnnotation) {
                        continue;
                    }
                }
                SettableBeanProperty[] settableBeanPropertyArr = new SettableBeanProperty[parameterCount];
                AnnotatedParameter annotatedParameter = null;
                int i11 = 0;
                int i12 = 0;
                int i13 = 0;
                while (i10 < parameterCount) {
                    AnnotatedParameter parameter = next.getParameter(i10);
                    if (beanPropertyDefinitionArr == null) {
                        beanPropertyDefinition = null;
                    } else {
                        beanPropertyDefinition = beanPropertyDefinitionArr[i10];
                    }
                    Object findInjectableValueId = annotationIntrospector2.findInjectableValueId(parameter);
                    if (beanPropertyDefinition == null) {
                        propertyName = null;
                    } else {
                        propertyName = beanPropertyDefinition.getFullName();
                    }
                    if (beanPropertyDefinition == null || !beanPropertyDefinition.isExplicitlyNamed()) {
                        AnnotatedParameter annotatedParameter2 = parameter;
                        if (findInjectableValueId != null) {
                            i13++;
                            settableBeanPropertyArr[i10] = constructCreatorProperty(deserializationContext, beanDescription, propertyName, i10, annotatedParameter2, findInjectableValueId);
                        } else {
                            AnnotatedParameter annotatedParameter3 = annotatedParameter2;
                            if (annotationIntrospector2.findUnwrappingNameTransformer(annotatedParameter3) != null) {
                                settableBeanPropertyArr[i10] = constructCreatorProperty(deserializationContext, beanDescription, UNWRAPPED_CREATOR_PARAM_NAME, i10, annotatedParameter3, (Object) null);
                                i12++;
                            } else {
                                AnnotatedParameter annotatedParameter4 = annotatedParameter3;
                                if (hasCreatorAnnotation && propertyName != null && !propertyName.isEmpty()) {
                                    i12++;
                                    settableBeanPropertyArr[i10] = constructCreatorProperty(deserializationContext, beanDescription, propertyName, i10, annotatedParameter4, findInjectableValueId);
                                } else if (annotatedParameter == null) {
                                    annotatedParameter = annotatedParameter4;
                                }
                            }
                        }
                    } else {
                        i11++;
                        settableBeanPropertyArr[i10] = constructCreatorProperty(deserializationContext, beanDescription, propertyName, i10, parameter, findInjectableValueId);
                    }
                    i10++;
                }
                int i14 = i12 + i11;
                if (hasCreatorAnnotation || i11 > 0 || i13 > 0) {
                    if (i14 + i13 == parameterCount) {
                        creatorCollector2.addPropertyCreator(next, hasCreatorAnnotation, settableBeanPropertyArr);
                    } else if (i11 == 0 && i13 + 1 == parameterCount) {
                        creatorCollector2.addDelegatingCreator(next, hasCreatorAnnotation, settableBeanPropertyArr);
                    } else {
                        throw new IllegalArgumentException("Argument #" + annotatedParameter.getIndex() + " of factory method " + next + " has no property name annotation; must have name when multiple-parameter constructor annotated as Creator");
                    }
                }
            } else if (hasCreatorAnnotation) {
                creatorCollector2.setDefaultCreator(next);
            }
        }
    }

    /* access modifiers changed from: protected */
    public boolean _checkIfCreatorPropertyBased(AnnotationIntrospector annotationIntrospector, AnnotatedWithParams annotatedWithParams, BeanPropertyDefinition beanPropertyDefinition) {
        String name;
        JsonCreator.Mode findCreatorBinding = annotationIntrospector.findCreatorBinding(annotatedWithParams);
        if (findCreatorBinding == JsonCreator.Mode.PROPERTIES) {
            return true;
        }
        if (findCreatorBinding == JsonCreator.Mode.DELEGATING) {
            return false;
        }
        if ((beanPropertyDefinition != null && beanPropertyDefinition.isExplicitlyNamed()) || annotationIntrospector.findInjectableValueId(annotatedWithParams.getParameter(0)) != null) {
            return true;
        }
        if (beanPropertyDefinition == null || (name = beanPropertyDefinition.getName()) == null || name.isEmpty() || !beanPropertyDefinition.couldSerialize()) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: protected */
    public void _checkImplicitlyNamedConstructors(DeserializationContext deserializationContext, BeanDescription beanDescription, VisibilityChecker<?> visibilityChecker, AnnotationIntrospector annotationIntrospector, CreatorCollector creatorCollector, List<AnnotatedConstructor> list) {
        int i10;
        Iterator<AnnotatedConstructor> it = list.iterator();
        AnnotatedConstructor annotatedConstructor = null;
        AnnotatedConstructor annotatedConstructor2 = null;
        SettableBeanProperty[] settableBeanPropertyArr = null;
        while (true) {
            if (!it.hasNext()) {
                annotatedConstructor = annotatedConstructor2;
                break;
            }
            AnnotatedConstructor next = it.next();
            if (visibilityChecker.isCreatorVisible((AnnotatedMember) next)) {
                int parameterCount = next.getParameterCount();
                SettableBeanProperty[] settableBeanPropertyArr2 = new SettableBeanProperty[parameterCount];
                int i11 = 0;
                while (true) {
                    if (i11 < parameterCount) {
                        AnnotatedParameter parameter = next.getParameter(i11);
                        PropertyName _findParamName = _findParamName(parameter, annotationIntrospector);
                        if (_findParamName == null || _findParamName.isEmpty()) {
                            break;
                        }
                        settableBeanPropertyArr2[i11] = constructCreatorProperty(deserializationContext, beanDescription, _findParamName, parameter.getIndex(), parameter, (Object) null);
                        i11++;
                    } else if (annotatedConstructor2 != null) {
                        break;
                    } else {
                        annotatedConstructor2 = next;
                        settableBeanPropertyArr = settableBeanPropertyArr2;
                    }
                }
            }
        }
        if (annotatedConstructor != null) {
            creatorCollector.addPropertyCreator(annotatedConstructor, false, settableBeanPropertyArr);
            BasicBeanDescription basicBeanDescription = (BasicBeanDescription) beanDescription;
            for (SettableBeanProperty settableBeanProperty : settableBeanPropertyArr) {
                PropertyName fullName = settableBeanProperty.getFullName();
                if (!basicBeanDescription.hasProperty(fullName)) {
                    basicBeanDescription.addProperty(SimpleBeanPropertyDefinition.construct((MapperConfig<?>) deserializationContext.getConfig(), settableBeanProperty.getMember(), fullName));
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    public ValueInstantiator _constructDefaultValueInstantiator(DeserializationContext deserializationContext, BeanDescription beanDescription) {
        CreatorCollector creatorCollector = new CreatorCollector(beanDescription, deserializationContext.getConfig());
        AnnotationIntrospector annotationIntrospector = deserializationContext.getAnnotationIntrospector();
        DeserializationConfig config = deserializationContext.getConfig();
        VisibilityChecker<?> findAutoDetectVisibility = annotationIntrospector.findAutoDetectVisibility(beanDescription.getClassInfo(), config.getDefaultVisibilityChecker());
        Map<AnnotatedWithParams, BeanPropertyDefinition[]> _findCreatorsFromProperties = _findCreatorsFromProperties(deserializationContext, beanDescription);
        _addDeserializerFactoryMethods(deserializationContext, beanDescription, findAutoDetectVisibility, annotationIntrospector, creatorCollector, _findCreatorsFromProperties);
        if (beanDescription.getType().isConcrete()) {
            _addDeserializerConstructors(deserializationContext, beanDescription, findAutoDetectVisibility, annotationIntrospector, creatorCollector, _findCreatorsFromProperties);
        }
        return creatorCollector.constructValueInstantiator(config);
    }

    /* access modifiers changed from: protected */
    public Map<AnnotatedWithParams, BeanPropertyDefinition[]> _findCreatorsFromProperties(DeserializationContext deserializationContext, BeanDescription beanDescription) {
        Map<AnnotatedWithParams, BeanPropertyDefinition[]> emptyMap = Collections.emptyMap();
        for (BeanPropertyDefinition next : beanDescription.findProperties()) {
            Iterator<AnnotatedParameter> constructorParameters = next.getConstructorParameters();
            while (true) {
                if (constructorParameters.hasNext()) {
                    AnnotatedParameter next2 = constructorParameters.next();
                    AnnotatedWithParams owner = next2.getOwner();
                    BeanPropertyDefinition[] beanPropertyDefinitionArr = emptyMap.get(owner);
                    int index = next2.getIndex();
                    if (beanPropertyDefinitionArr == null) {
                        if (emptyMap.isEmpty()) {
                            emptyMap = new LinkedHashMap<>();
                        }
                        beanPropertyDefinitionArr = new BeanPropertyDefinition[owner.getParameterCount()];
                        emptyMap.put(owner, beanPropertyDefinitionArr);
                    } else if (beanPropertyDefinitionArr[index] != null) {
                        throw new IllegalStateException("Conflict: parameter #" + index + " of " + owner + " bound to more than one property; " + beanPropertyDefinitionArr[index] + " vs " + next);
                    }
                    beanPropertyDefinitionArr[index] = next;
                }
            }
        }
        return emptyMap;
    }

    /* access modifiers changed from: protected */
    public JsonDeserializer<?> _findCustomArrayDeserializer(ArrayType arrayType, DeserializationConfig deserializationConfig, BeanDescription beanDescription, TypeDeserializer typeDeserializer, JsonDeserializer<?> jsonDeserializer) {
        for (Deserializers findArrayDeserializer : this._factoryConfig.deserializers()) {
            JsonDeserializer<?> findArrayDeserializer2 = findArrayDeserializer.findArrayDeserializer(arrayType, deserializationConfig, beanDescription, typeDeserializer, jsonDeserializer);
            if (findArrayDeserializer2 != null) {
                return findArrayDeserializer2;
            }
        }
        return null;
    }

    /* access modifiers changed from: protected */
    public JsonDeserializer<Object> _findCustomBeanDeserializer(JavaType javaType, DeserializationConfig deserializationConfig, BeanDescription beanDescription) {
        for (Deserializers findBeanDeserializer : this._factoryConfig.deserializers()) {
            JsonDeserializer<?> findBeanDeserializer2 = findBeanDeserializer.findBeanDeserializer(javaType, deserializationConfig, beanDescription);
            if (findBeanDeserializer2 != null) {
                return findBeanDeserializer2;
            }
        }
        return null;
    }

    /* access modifiers changed from: protected */
    public JsonDeserializer<?> _findCustomCollectionDeserializer(CollectionType collectionType, DeserializationConfig deserializationConfig, BeanDescription beanDescription, TypeDeserializer typeDeserializer, JsonDeserializer<?> jsonDeserializer) {
        for (Deserializers findCollectionDeserializer : this._factoryConfig.deserializers()) {
            JsonDeserializer<?> findCollectionDeserializer2 = findCollectionDeserializer.findCollectionDeserializer(collectionType, deserializationConfig, beanDescription, typeDeserializer, jsonDeserializer);
            if (findCollectionDeserializer2 != null) {
                return findCollectionDeserializer2;
            }
        }
        return null;
    }

    /* access modifiers changed from: protected */
    public JsonDeserializer<?> _findCustomCollectionLikeDeserializer(CollectionLikeType collectionLikeType, DeserializationConfig deserializationConfig, BeanDescription beanDescription, TypeDeserializer typeDeserializer, JsonDeserializer<?> jsonDeserializer) {
        for (Deserializers findCollectionLikeDeserializer : this._factoryConfig.deserializers()) {
            JsonDeserializer<?> findCollectionLikeDeserializer2 = findCollectionLikeDeserializer.findCollectionLikeDeserializer(collectionLikeType, deserializationConfig, beanDescription, typeDeserializer, jsonDeserializer);
            if (findCollectionLikeDeserializer2 != null) {
                return findCollectionLikeDeserializer2;
            }
        }
        return null;
    }

    /* access modifiers changed from: protected */
    public JsonDeserializer<?> _findCustomEnumDeserializer(Class<?> cls, DeserializationConfig deserializationConfig, BeanDescription beanDescription) {
        for (Deserializers findEnumDeserializer : this._factoryConfig.deserializers()) {
            JsonDeserializer<?> findEnumDeserializer2 = findEnumDeserializer.findEnumDeserializer(cls, deserializationConfig, beanDescription);
            if (findEnumDeserializer2 != null) {
                return findEnumDeserializer2;
            }
        }
        return null;
    }

    /* access modifiers changed from: protected */
    public JsonDeserializer<?> _findCustomMapDeserializer(MapType mapType, DeserializationConfig deserializationConfig, BeanDescription beanDescription, KeyDeserializer keyDeserializer, TypeDeserializer typeDeserializer, JsonDeserializer<?> jsonDeserializer) {
        for (Deserializers findMapDeserializer : this._factoryConfig.deserializers()) {
            JsonDeserializer<?> findMapDeserializer2 = findMapDeserializer.findMapDeserializer(mapType, deserializationConfig, beanDescription, keyDeserializer, typeDeserializer, jsonDeserializer);
            if (findMapDeserializer2 != null) {
                return findMapDeserializer2;
            }
        }
        return null;
    }

    /* access modifiers changed from: protected */
    public JsonDeserializer<?> _findCustomMapLikeDeserializer(MapLikeType mapLikeType, DeserializationConfig deserializationConfig, BeanDescription beanDescription, KeyDeserializer keyDeserializer, TypeDeserializer typeDeserializer, JsonDeserializer<?> jsonDeserializer) {
        for (Deserializers findMapLikeDeserializer : this._factoryConfig.deserializers()) {
            JsonDeserializer<?> findMapLikeDeserializer2 = findMapLikeDeserializer.findMapLikeDeserializer(mapLikeType, deserializationConfig, beanDescription, keyDeserializer, typeDeserializer, jsonDeserializer);
            if (findMapLikeDeserializer2 != null) {
                return findMapLikeDeserializer2;
            }
        }
        return null;
    }

    /* access modifiers changed from: protected */
    public JsonDeserializer<?> _findCustomReferenceDeserializer(ReferenceType referenceType, DeserializationConfig deserializationConfig, BeanDescription beanDescription, TypeDeserializer typeDeserializer, JsonDeserializer<?> jsonDeserializer) {
        for (Deserializers findReferenceDeserializer : this._factoryConfig.deserializers()) {
            JsonDeserializer<?> findReferenceDeserializer2 = findReferenceDeserializer.findReferenceDeserializer(referenceType, deserializationConfig, beanDescription, typeDeserializer, jsonDeserializer);
            if (findReferenceDeserializer2 != null) {
                return findReferenceDeserializer2;
            }
        }
        return null;
    }

    /* access modifiers changed from: protected */
    public JsonDeserializer<?> _findCustomTreeNodeDeserializer(Class<? extends JsonNode> cls, DeserializationConfig deserializationConfig, BeanDescription beanDescription) {
        for (Deserializers findTreeNodeDeserializer : this._factoryConfig.deserializers()) {
            JsonDeserializer<?> findTreeNodeDeserializer2 = findTreeNodeDeserializer.findTreeNodeDeserializer(cls, deserializationConfig, beanDescription);
            if (findTreeNodeDeserializer2 != null) {
                return findTreeNodeDeserializer2;
            }
        }
        return null;
    }

    /* access modifiers changed from: protected */
    @Deprecated
    public PropertyName _findExplicitParamName(AnnotatedParameter annotatedParameter, AnnotationIntrospector annotationIntrospector) {
        if (annotatedParameter == null || annotationIntrospector == null) {
            return null;
        }
        return annotationIntrospector.findNameForDeserialization(annotatedParameter);
    }

    /* access modifiers changed from: protected */
    public PropertyName _findImplicitParamName(AnnotatedParameter annotatedParameter, AnnotationIntrospector annotationIntrospector) {
        String findImplicitPropertyName = annotationIntrospector.findImplicitPropertyName(annotatedParameter);
        if (findImplicitPropertyName == null || findImplicitPropertyName.isEmpty()) {
            return null;
        }
        return PropertyName.construct(findImplicitPropertyName);
    }

    /* access modifiers changed from: protected */
    @Deprecated
    public AnnotatedMethod _findJsonValueFor(DeserializationConfig deserializationConfig, JavaType javaType) {
        if (javaType == null) {
            return null;
        }
        return deserializationConfig.introspect(javaType).findJsonValueMethod();
    }

    /* access modifiers changed from: protected */
    public PropertyName _findParamName(AnnotatedParameter annotatedParameter, AnnotationIntrospector annotationIntrospector) {
        if (annotatedParameter == null || annotationIntrospector == null) {
            return null;
        }
        PropertyName findNameForDeserialization = annotationIntrospector.findNameForDeserialization(annotatedParameter);
        if (findNameForDeserialization != null) {
            return findNameForDeserialization;
        }
        String findImplicitPropertyName = annotationIntrospector.findImplicitPropertyName(annotatedParameter);
        if (findImplicitPropertyName == null || findImplicitPropertyName.isEmpty()) {
            return null;
        }
        return PropertyName.construct(findImplicitPropertyName);
    }

    /* access modifiers changed from: protected */
    public JavaType _findRemappedType(DeserializationConfig deserializationConfig, Class<?> cls) {
        JavaType mapAbstractType = mapAbstractType(deserializationConfig, deserializationConfig.constructType(cls));
        if (mapAbstractType == null || mapAbstractType.hasRawClass(cls)) {
            return null;
        }
        return mapAbstractType;
    }

    /* access modifiers changed from: protected */
    public boolean _handleSingleArgumentConstructor(DeserializationContext deserializationContext, BeanDescription beanDescription, VisibilityChecker<?> visibilityChecker, AnnotationIntrospector annotationIntrospector, CreatorCollector creatorCollector, AnnotatedConstructor annotatedConstructor, boolean z10, boolean z11) {
        Class<?> rawParameterType = annotatedConstructor.getRawParameterType(0);
        if (rawParameterType == String.class || rawParameterType == CharSequence.class) {
            if (z10 || z11) {
                creatorCollector.addStringCreator(annotatedConstructor, z10);
            }
            return true;
        } else if (rawParameterType == Integer.TYPE || rawParameterType == Integer.class) {
            if (z10 || z11) {
                creatorCollector.addIntCreator(annotatedConstructor, z10);
            }
            return true;
        } else if (rawParameterType == Long.TYPE || rawParameterType == Long.class) {
            if (z10 || z11) {
                creatorCollector.addLongCreator(annotatedConstructor, z10);
            }
            return true;
        } else if (rawParameterType == Double.TYPE || rawParameterType == Double.class) {
            if (z10 || z11) {
                creatorCollector.addDoubleCreator(annotatedConstructor, z10);
            }
            return true;
        } else if (rawParameterType == Boolean.TYPE || rawParameterType == Boolean.class) {
            if (z10 || z11) {
                creatorCollector.addBooleanCreator(annotatedConstructor, z10);
            }
            return true;
        } else if (!z10) {
            return false;
        } else {
            creatorCollector.addDelegatingCreator(annotatedConstructor, z10, (SettableBeanProperty[]) null);
            return true;
        }
    }

    /* access modifiers changed from: protected */
    public boolean _handleSingleArgumentFactory(DeserializationConfig deserializationConfig, BeanDescription beanDescription, VisibilityChecker<?> visibilityChecker, AnnotationIntrospector annotationIntrospector, CreatorCollector creatorCollector, AnnotatedMethod annotatedMethod, boolean z10) {
        Class<?> rawParameterType = annotatedMethod.getRawParameterType(0);
        if (rawParameterType == String.class || rawParameterType == CharSequence.class) {
            if (z10 || visibilityChecker.isCreatorVisible((AnnotatedMember) annotatedMethod)) {
                creatorCollector.addStringCreator(annotatedMethod, z10);
            }
            return true;
        } else if (rawParameterType == Integer.TYPE || rawParameterType == Integer.class) {
            if (z10 || visibilityChecker.isCreatorVisible((AnnotatedMember) annotatedMethod)) {
                creatorCollector.addIntCreator(annotatedMethod, z10);
            }
            return true;
        } else if (rawParameterType == Long.TYPE || rawParameterType == Long.class) {
            if (z10 || visibilityChecker.isCreatorVisible((AnnotatedMember) annotatedMethod)) {
                creatorCollector.addLongCreator(annotatedMethod, z10);
            }
            return true;
        } else if (rawParameterType == Double.TYPE || rawParameterType == Double.class) {
            if (z10 || visibilityChecker.isCreatorVisible((AnnotatedMember) annotatedMethod)) {
                creatorCollector.addDoubleCreator(annotatedMethod, z10);
            }
            return true;
        } else if (rawParameterType == Boolean.TYPE || rawParameterType == Boolean.class) {
            if (z10 || visibilityChecker.isCreatorVisible((AnnotatedMember) annotatedMethod)) {
                creatorCollector.addBooleanCreator(annotatedMethod, z10);
            }
            return true;
        } else if (!z10) {
            return false;
        } else {
            creatorCollector.addDelegatingCreator(annotatedMethod, z10, (SettableBeanProperty[]) null);
            return true;
        }
    }

    /* access modifiers changed from: protected */
    @Deprecated
    public boolean _hasExplicitParamName(AnnotatedParameter annotatedParameter, AnnotationIntrospector annotationIntrospector) {
        PropertyName findNameForDeserialization;
        if (annotatedParameter == null || annotationIntrospector == null || (findNameForDeserialization = annotationIntrospector.findNameForDeserialization(annotatedParameter)) == null || !findNameForDeserialization.hasSimpleName()) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: protected */
    public CollectionType _mapAbstractCollectionType(JavaType javaType, DeserializationConfig deserializationConfig) {
        Class cls = _collectionFallbacks.get(javaType.getRawClass().getName());
        if (cls == null) {
            return null;
        }
        return (CollectionType) deserializationConfig.constructSpecializedType(javaType, cls);
    }

    public ValueInstantiator _valueInstantiatorInstance(DeserializationConfig deserializationConfig, Annotated annotated, Object obj) {
        ValueInstantiator valueInstantiatorInstance;
        if (obj == null) {
            return null;
        }
        if (obj instanceof ValueInstantiator) {
            return (ValueInstantiator) obj;
        }
        if (obj instanceof Class) {
            Class cls = (Class) obj;
            if (ClassUtil.isBogusClass(cls)) {
                return null;
            }
            if (ValueInstantiator.class.isAssignableFrom(cls)) {
                HandlerInstantiator handlerInstantiator = deserializationConfig.getHandlerInstantiator();
                if (handlerInstantiator == null || (valueInstantiatorInstance = handlerInstantiator.valueInstantiatorInstance(deserializationConfig, annotated, cls)) == null) {
                    return (ValueInstantiator) ClassUtil.createInstance(cls, deserializationConfig.canOverrideAccessModifiers());
                }
                return valueInstantiatorInstance;
            }
            throw new IllegalStateException("AnnotationIntrospector returned Class " + cls.getName() + "; expected Class<ValueInstantiator>");
        }
        throw new IllegalStateException("AnnotationIntrospector returned key deserializer definition of type " + obj.getClass().getName() + "; expected type KeyDeserializer or Class<KeyDeserializer> instead");
    }

    /* access modifiers changed from: protected */
    public SettableBeanProperty constructCreatorProperty(DeserializationContext deserializationContext, BeanDescription beanDescription, PropertyName propertyName, int i10, AnnotatedParameter annotatedParameter, Object obj) {
        PropertyMetadata construct;
        DeserializationContext deserializationContext2 = deserializationContext;
        AnnotatedParameter annotatedParameter2 = annotatedParameter;
        DeserializationConfig config = deserializationContext.getConfig();
        AnnotationIntrospector annotationIntrospector = deserializationContext.getAnnotationIntrospector();
        if (annotationIntrospector == null) {
            construct = PropertyMetadata.STD_REQUIRED_OR_OPTIONAL;
        } else {
            construct = PropertyMetadata.construct(annotationIntrospector.hasRequiredMarker(annotatedParameter2), annotationIntrospector.findPropertyDescription(annotatedParameter2), annotationIntrospector.findPropertyIndex(annotatedParameter2), annotationIntrospector.findPropertyDefaultValue(annotatedParameter2));
        }
        PropertyMetadata propertyMetadata = construct;
        JavaType resolveMemberAndTypeAnnotations = resolveMemberAndTypeAnnotations(deserializationContext2, annotatedParameter2, annotatedParameter.getType());
        BeanProperty.Std std = new BeanProperty.Std(propertyName, resolveMemberAndTypeAnnotations, annotationIntrospector.findWrapperName(annotatedParameter2), beanDescription.getClassAnnotations(), annotatedParameter, propertyMetadata);
        TypeDeserializer typeDeserializer = (TypeDeserializer) resolveMemberAndTypeAnnotations.getTypeHandler();
        if (typeDeserializer == null) {
            typeDeserializer = findTypeDeserializer(config, resolveMemberAndTypeAnnotations);
        }
        PropertyName propertyName2 = propertyName;
        JavaType javaType = resolveMemberAndTypeAnnotations;
        CreatorProperty creatorProperty = new CreatorProperty(propertyName2, javaType, std.getWrapperName(), typeDeserializer, beanDescription.getClassAnnotations(), annotatedParameter, i10, obj, propertyMetadata);
        JsonDeserializer<Object> findDeserializerFromAnnotation = findDeserializerFromAnnotation(deserializationContext2, annotatedParameter2);
        if (findDeserializerFromAnnotation == null) {
            findDeserializerFromAnnotation = (JsonDeserializer) resolveMemberAndTypeAnnotations.getValueHandler();
        }
        if (findDeserializerFromAnnotation != null) {
            return creatorProperty.withValueDeserializer(deserializationContext2.handlePrimaryContextualization(findDeserializerFromAnnotation, creatorProperty, resolveMemberAndTypeAnnotations));
        }
        return creatorProperty;
    }

    /* access modifiers changed from: protected */
    public EnumResolver constructEnumResolver(Class<?> cls, DeserializationConfig deserializationConfig, AnnotatedMethod annotatedMethod) {
        if (annotatedMethod == null) {
            return EnumResolver.constructUnsafe(cls, deserializationConfig.getAnnotationIntrospector());
        }
        Method annotated = annotatedMethod.getAnnotated();
        if (deserializationConfig.canOverrideAccessModifiers()) {
            ClassUtil.checkAndFixAccess(annotated, deserializationConfig.isEnabled(MapperFeature.OVERRIDE_PUBLIC_ACCESS_MODIFIERS));
        }
        return EnumResolver.constructUnsafeUsingMethod(cls, annotated, deserializationConfig.getAnnotationIntrospector());
    }

    public JsonDeserializer<?> createArrayDeserializer(DeserializationContext deserializationContext, ArrayType arrayType, BeanDescription beanDescription) {
        DeserializationConfig config = deserializationContext.getConfig();
        JavaType contentType = arrayType.getContentType();
        JsonDeserializer jsonDeserializer = (JsonDeserializer) contentType.getValueHandler();
        TypeDeserializer typeDeserializer = (TypeDeserializer) contentType.getTypeHandler();
        if (typeDeserializer == null) {
            typeDeserializer = findTypeDeserializer(config, contentType);
        }
        TypeDeserializer typeDeserializer2 = typeDeserializer;
        JsonDeserializer<?> _findCustomArrayDeserializer = _findCustomArrayDeserializer(arrayType, config, beanDescription, typeDeserializer2, jsonDeserializer);
        if (_findCustomArrayDeserializer == null) {
            if (jsonDeserializer == null) {
                Class<?> rawClass = contentType.getRawClass();
                if (contentType.isPrimitive()) {
                    return PrimitiveArrayDeserializers.forType(rawClass);
                }
                if (rawClass == String.class) {
                    return StringArrayDeserializer.instance;
                }
            }
            _findCustomArrayDeserializer = new ObjectArrayDeserializer(arrayType, jsonDeserializer, typeDeserializer2);
        }
        if (this._factoryConfig.hasDeserializerModifiers()) {
            for (BeanDeserializerModifier modifyArrayDeserializer : this._factoryConfig.deserializerModifiers()) {
                _findCustomArrayDeserializer = modifyArrayDeserializer.modifyArrayDeserializer(config, arrayType, beanDescription, _findCustomArrayDeserializer);
            }
        }
        return _findCustomArrayDeserializer;
    }

    public JsonDeserializer<?> createCollectionDeserializer(DeserializationContext deserializationContext, CollectionType collectionType, BeanDescription beanDescription) {
        JavaType contentType = collectionType.getContentType();
        JsonDeserializer jsonDeserializer = (JsonDeserializer) contentType.getValueHandler();
        DeserializationConfig config = deserializationContext.getConfig();
        TypeDeserializer typeDeserializer = (TypeDeserializer) contentType.getTypeHandler();
        if (typeDeserializer == null) {
            typeDeserializer = findTypeDeserializer(config, contentType);
        }
        TypeDeserializer typeDeserializer2 = typeDeserializer;
        JsonDeserializer<?> _findCustomCollectionDeserializer = _findCustomCollectionDeserializer(collectionType, config, beanDescription, typeDeserializer2, jsonDeserializer);
        if (_findCustomCollectionDeserializer == null) {
            Class<?> rawClass = collectionType.getRawClass();
            if (jsonDeserializer == null && EnumSet.class.isAssignableFrom(rawClass)) {
                _findCustomCollectionDeserializer = new EnumSetDeserializer(contentType, (JsonDeserializer<?>) null);
            }
        }
        if (_findCustomCollectionDeserializer == null) {
            if (collectionType.isInterface() || collectionType.isAbstract()) {
                CollectionType _mapAbstractCollectionType = _mapAbstractCollectionType(collectionType, config);
                if (_mapAbstractCollectionType != null) {
                    beanDescription = config.introspectForCreation(_mapAbstractCollectionType);
                    collectionType = _mapAbstractCollectionType;
                } else if (collectionType.getTypeHandler() != null) {
                    _findCustomCollectionDeserializer = AbstractDeserializer.constructForNonPOJO(beanDescription);
                } else {
                    throw new IllegalArgumentException("Can not find a deserializer for non-concrete Collection type " + collectionType);
                }
            }
            if (_findCustomCollectionDeserializer == null) {
                ValueInstantiator findValueInstantiator = findValueInstantiator(deserializationContext, beanDescription);
                if (!findValueInstantiator.canCreateUsingDefault() && collectionType.getRawClass() == ArrayBlockingQueue.class) {
                    return new ArrayBlockingQueueDeserializer(collectionType, jsonDeserializer, typeDeserializer2, findValueInstantiator);
                }
                if (contentType.getRawClass() == String.class) {
                    _findCustomCollectionDeserializer = new StringCollectionDeserializer(collectionType, jsonDeserializer, findValueInstantiator);
                } else {
                    _findCustomCollectionDeserializer = new CollectionDeserializer(collectionType, jsonDeserializer, typeDeserializer2, findValueInstantiator);
                }
            }
        }
        if (this._factoryConfig.hasDeserializerModifiers()) {
            for (BeanDeserializerModifier modifyCollectionDeserializer : this._factoryConfig.deserializerModifiers()) {
                _findCustomCollectionDeserializer = modifyCollectionDeserializer.modifyCollectionDeserializer(config, collectionType, beanDescription, _findCustomCollectionDeserializer);
            }
        }
        return _findCustomCollectionDeserializer;
    }

    public JsonDeserializer<?> createCollectionLikeDeserializer(DeserializationContext deserializationContext, CollectionLikeType collectionLikeType, BeanDescription beanDescription) {
        TypeDeserializer typeDeserializer;
        JavaType contentType = collectionLikeType.getContentType();
        JsonDeserializer jsonDeserializer = (JsonDeserializer) contentType.getValueHandler();
        DeserializationConfig config = deserializationContext.getConfig();
        TypeDeserializer typeDeserializer2 = (TypeDeserializer) contentType.getTypeHandler();
        if (typeDeserializer2 == null) {
            typeDeserializer = findTypeDeserializer(config, contentType);
        } else {
            typeDeserializer = typeDeserializer2;
        }
        JsonDeserializer<?> _findCustomCollectionLikeDeserializer = _findCustomCollectionLikeDeserializer(collectionLikeType, config, beanDescription, typeDeserializer, jsonDeserializer);
        if (_findCustomCollectionLikeDeserializer != null && this._factoryConfig.hasDeserializerModifiers()) {
            for (BeanDeserializerModifier modifyCollectionLikeDeserializer : this._factoryConfig.deserializerModifiers()) {
                _findCustomCollectionLikeDeserializer = modifyCollectionLikeDeserializer.modifyCollectionLikeDeserializer(config, collectionLikeType, beanDescription, _findCustomCollectionLikeDeserializer);
            }
        }
        return _findCustomCollectionLikeDeserializer;
    }

    public JsonDeserializer<?> createEnumDeserializer(DeserializationContext deserializationContext, JavaType javaType, BeanDescription beanDescription) {
        SettableBeanProperty[] settableBeanPropertyArr;
        DeserializationConfig config = deserializationContext.getConfig();
        Class<?> rawClass = javaType.getRawClass();
        JsonDeserializer<?> _findCustomEnumDeserializer = _findCustomEnumDeserializer(rawClass, config, beanDescription);
        if (_findCustomEnumDeserializer == null) {
            ValueInstantiator _constructDefaultValueInstantiator = _constructDefaultValueInstantiator(deserializationContext, beanDescription);
            if (_constructDefaultValueInstantiator == null) {
                settableBeanPropertyArr = null;
            } else {
                settableBeanPropertyArr = _constructDefaultValueInstantiator.getFromObjectArguments(deserializationContext.getConfig());
            }
            Iterator<AnnotatedMethod> it = beanDescription.getFactoryMethods().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                AnnotatedMethod next = it.next();
                if (deserializationContext.getAnnotationIntrospector().hasCreatorAnnotation(next)) {
                    if (next.getParameterCount() == 0) {
                        _findCustomEnumDeserializer = EnumDeserializer.deserializerForNoArgsCreator(config, rawClass, next);
                        break;
                    } else if (next.getRawReturnType().isAssignableFrom(rawClass)) {
                        _findCustomEnumDeserializer = EnumDeserializer.deserializerForCreator(config, rawClass, next, _constructDefaultValueInstantiator, settableBeanPropertyArr);
                        break;
                    }
                }
            }
            if (_findCustomEnumDeserializer == null) {
                _findCustomEnumDeserializer = new EnumDeserializer(constructEnumResolver(rawClass, config, beanDescription.findJsonValueMethod()));
            }
        }
        if (this._factoryConfig.hasDeserializerModifiers()) {
            for (BeanDeserializerModifier modifyEnumDeserializer : this._factoryConfig.deserializerModifiers()) {
                _findCustomEnumDeserializer = modifyEnumDeserializer.modifyEnumDeserializer(config, javaType, beanDescription, _findCustomEnumDeserializer);
            }
        }
        return _findCustomEnumDeserializer;
    }

    /* JADX WARNING: Removed duplicated region for block: B:3:0x001f A[LOOP:0: B:3:0x001f->B:6:0x002f, LOOP_START, PHI: r2 
      PHI: (r2v8 com.fasterxml.jackson.databind.KeyDeserializer) = (r2v0 com.fasterxml.jackson.databind.KeyDeserializer), (r2v11 com.fasterxml.jackson.databind.KeyDeserializer) binds: [B:2:0x000d, B:6:0x002f] A[DONT_GENERATE, DONT_INLINE]] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.fasterxml.jackson.databind.KeyDeserializer createKeyDeserializer(com.fasterxml.jackson.databind.DeserializationContext r6, com.fasterxml.jackson.databind.JavaType r7) {
        /*
            r5 = this;
            com.fasterxml.jackson.databind.DeserializationConfig r0 = r6.getConfig()
            com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig r1 = r5._factoryConfig
            boolean r1 = r1.hasKeyDeserializers()
            r2 = 0
            if (r1 == 0) goto L_0x0031
            java.lang.Class r1 = r7.getRawClass()
            com.fasterxml.jackson.databind.BeanDescription r1 = r0.introspectClassAnnotations((java.lang.Class<?>) r1)
            com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig r3 = r5._factoryConfig
            java.lang.Iterable r3 = r3.keyDeserializers()
            java.util.Iterator r3 = r3.iterator()
        L_0x001f:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x0031
            java.lang.Object r2 = r3.next()
            com.fasterxml.jackson.databind.deser.KeyDeserializers r2 = (com.fasterxml.jackson.databind.deser.KeyDeserializers) r2
            com.fasterxml.jackson.databind.KeyDeserializer r2 = r2.findKeyDeserializer(r7, r0, r1)
            if (r2 == 0) goto L_0x001f
        L_0x0031:
            if (r2 != 0) goto L_0x0042
            boolean r1 = r7.isEnumType()
            if (r1 == 0) goto L_0x003e
            com.fasterxml.jackson.databind.KeyDeserializer r2 = r5._createEnumKeyDeserializer(r6, r7)
            goto L_0x0042
        L_0x003e:
            com.fasterxml.jackson.databind.KeyDeserializer r2 = com.fasterxml.jackson.databind.deser.std.StdKeyDeserializers.findStringBasedKeyDeserializer(r0, r7)
        L_0x0042:
            if (r2 == 0) goto L_0x0067
            com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig r6 = r5._factoryConfig
            boolean r6 = r6.hasDeserializerModifiers()
            if (r6 == 0) goto L_0x0067
            com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig r6 = r5._factoryConfig
            java.lang.Iterable r6 = r6.deserializerModifiers()
            java.util.Iterator r6 = r6.iterator()
        L_0x0056:
            boolean r1 = r6.hasNext()
            if (r1 == 0) goto L_0x0067
            java.lang.Object r1 = r6.next()
            com.fasterxml.jackson.databind.deser.BeanDeserializerModifier r1 = (com.fasterxml.jackson.databind.deser.BeanDeserializerModifier) r1
            com.fasterxml.jackson.databind.KeyDeserializer r2 = r1.modifyKeyDeserializer(r0, r7, r2)
            goto L_0x0056
        L_0x0067:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.deser.BasicDeserializerFactory.createKeyDeserializer(com.fasterxml.jackson.databind.DeserializationContext, com.fasterxml.jackson.databind.JavaType):com.fasterxml.jackson.databind.KeyDeserializer");
    }

    /* JADX WARNING: Removed duplicated region for block: B:28:0x009d  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00e5  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.fasterxml.jackson.databind.JsonDeserializer<?> createMapDeserializer(com.fasterxml.jackson.databind.DeserializationContext r18, com.fasterxml.jackson.databind.type.MapType r19, com.fasterxml.jackson.databind.BeanDescription r20) {
        /*
            r17 = this;
            r7 = r17
            r8 = r19
            com.fasterxml.jackson.databind.DeserializationConfig r9 = r18.getConfig()
            com.fasterxml.jackson.databind.JavaType r10 = r19.getKeyType()
            com.fasterxml.jackson.databind.JavaType r0 = r19.getContentType()
            java.lang.Object r1 = r0.getValueHandler()
            r15 = r1
            com.fasterxml.jackson.databind.JsonDeserializer r15 = (com.fasterxml.jackson.databind.JsonDeserializer) r15
            java.lang.Object r1 = r10.getValueHandler()
            r14 = r1
            com.fasterxml.jackson.databind.KeyDeserializer r14 = (com.fasterxml.jackson.databind.KeyDeserializer) r14
            java.lang.Object r1 = r0.getTypeHandler()
            com.fasterxml.jackson.databind.jsontype.TypeDeserializer r1 = (com.fasterxml.jackson.databind.jsontype.TypeDeserializer) r1
            if (r1 != 0) goto L_0x002c
            com.fasterxml.jackson.databind.jsontype.TypeDeserializer r0 = r7.findTypeDeserializer(r9, r0)
            r13 = r0
            goto L_0x002d
        L_0x002c:
            r13 = r1
        L_0x002d:
            r0 = r17
            r1 = r19
            r2 = r9
            r3 = r20
            r4 = r14
            r5 = r13
            r6 = r15
            com.fasterxml.jackson.databind.JsonDeserializer r0 = r0._findCustomMapDeserializer(r1, r2, r3, r4, r5, r6)
            if (r0 != 0) goto L_0x00db
            java.lang.Class r1 = r19.getRawClass()
            java.lang.Class<java.util.EnumMap> r2 = java.util.EnumMap.class
            boolean r2 = r2.isAssignableFrom(r1)
            r3 = 0
            if (r2 == 0) goto L_0x0064
            java.lang.Class r0 = r10.getRawClass()
            if (r0 == 0) goto L_0x005c
            boolean r0 = r0.isEnum()
            if (r0 == 0) goto L_0x005c
            com.fasterxml.jackson.databind.deser.std.EnumMapDeserializer r0 = new com.fasterxml.jackson.databind.deser.std.EnumMapDeserializer
            r0.<init>(r8, r3, r15, r13)
            goto L_0x0064
        L_0x005c:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Can not construct EnumMap; generic (key) type not available"
            r0.<init>(r1)
            throw r0
        L_0x0064:
            if (r0 != 0) goto L_0x00db
            boolean r2 = r19.isInterface()
            if (r2 != 0) goto L_0x0076
            boolean r2 = r19.isAbstract()
            if (r2 == 0) goto L_0x0073
            goto L_0x0076
        L_0x0073:
            r2 = r20
            goto L_0x009b
        L_0x0076:
            java.util.HashMap<java.lang.String, java.lang.Class<? extends java.util.Map>> r2 = _mapFallbacks
            java.lang.String r1 = r1.getName()
            java.lang.Object r1 = r2.get(r1)
            java.lang.Class r1 = (java.lang.Class) r1
            if (r1 == 0) goto L_0x0090
            com.fasterxml.jackson.databind.JavaType r1 = r9.constructSpecializedType(r8, r1)
            com.fasterxml.jackson.databind.type.MapType r1 = (com.fasterxml.jackson.databind.type.MapType) r1
            com.fasterxml.jackson.databind.BeanDescription r2 = r9.introspectForCreation(r1)
            r8 = r1
            goto L_0x009b
        L_0x0090:
            java.lang.Object r0 = r19.getTypeHandler()
            if (r0 == 0) goto L_0x00c4
            com.fasterxml.jackson.databind.deser.AbstractDeserializer r0 = com.fasterxml.jackson.databind.deser.AbstractDeserializer.constructForNonPOJO(r20)
            goto L_0x0073
        L_0x009b:
            if (r0 != 0) goto L_0x00dd
            r1 = r18
            com.fasterxml.jackson.databind.deser.ValueInstantiator r0 = r7.findValueInstantiator(r1, r2)
            com.fasterxml.jackson.databind.deser.std.MapDeserializer r1 = new com.fasterxml.jackson.databind.deser.std.MapDeserializer
            r11 = r1
            r12 = r8
            r4 = r13
            r13 = r0
            r16 = r4
            r11.<init>((com.fasterxml.jackson.databind.JavaType) r12, (com.fasterxml.jackson.databind.deser.ValueInstantiator) r13, (com.fasterxml.jackson.databind.KeyDeserializer) r14, (com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>) r15, (com.fasterxml.jackson.databind.jsontype.TypeDeserializer) r16)
            com.fasterxml.jackson.databind.introspect.AnnotatedClass r0 = r2.getClassInfo()
            java.lang.Class<java.util.Map> r4 = java.util.Map.class
            com.fasterxml.jackson.annotation.JsonIgnoreProperties$Value r0 = r9.getDefaultPropertyIgnorals(r4, r0)
            if (r0 != 0) goto L_0x00bb
            goto L_0x00bf
        L_0x00bb:
            java.util.Set r3 = r0.findIgnoredForDeserialization()
        L_0x00bf:
            r1.setIgnorableProperties((java.util.Set<java.lang.String>) r3)
            r0 = r1
            goto L_0x00dd
        L_0x00c4:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Can not find a deserializer for non-concrete Map type "
            r1.append(r2)
            r1.append(r8)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x00db:
            r2 = r20
        L_0x00dd:
            com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig r1 = r7._factoryConfig
            boolean r1 = r1.hasDeserializerModifiers()
            if (r1 == 0) goto L_0x0100
            com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig r1 = r7._factoryConfig
            java.lang.Iterable r1 = r1.deserializerModifiers()
            java.util.Iterator r1 = r1.iterator()
        L_0x00ef:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L_0x0100
            java.lang.Object r3 = r1.next()
            com.fasterxml.jackson.databind.deser.BeanDeserializerModifier r3 = (com.fasterxml.jackson.databind.deser.BeanDeserializerModifier) r3
            com.fasterxml.jackson.databind.JsonDeserializer r0 = r3.modifyMapDeserializer(r9, r8, r2, r0)
            goto L_0x00ef
        L_0x0100:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.deser.BasicDeserializerFactory.createMapDeserializer(com.fasterxml.jackson.databind.DeserializationContext, com.fasterxml.jackson.databind.type.MapType, com.fasterxml.jackson.databind.BeanDescription):com.fasterxml.jackson.databind.JsonDeserializer");
    }

    public JsonDeserializer<?> createMapLikeDeserializer(DeserializationContext deserializationContext, MapLikeType mapLikeType, BeanDescription beanDescription) {
        JavaType keyType = mapLikeType.getKeyType();
        JavaType contentType = mapLikeType.getContentType();
        DeserializationConfig config = deserializationContext.getConfig();
        JsonDeserializer jsonDeserializer = (JsonDeserializer) contentType.getValueHandler();
        KeyDeserializer keyDeserializer = (KeyDeserializer) keyType.getValueHandler();
        TypeDeserializer typeDeserializer = (TypeDeserializer) contentType.getTypeHandler();
        if (typeDeserializer == null) {
            typeDeserializer = findTypeDeserializer(config, contentType);
        }
        JsonDeserializer<?> _findCustomMapLikeDeserializer = _findCustomMapLikeDeserializer(mapLikeType, config, beanDescription, keyDeserializer, typeDeserializer, jsonDeserializer);
        if (_findCustomMapLikeDeserializer != null && this._factoryConfig.hasDeserializerModifiers()) {
            for (BeanDeserializerModifier modifyMapLikeDeserializer : this._factoryConfig.deserializerModifiers()) {
                _findCustomMapLikeDeserializer = modifyMapLikeDeserializer.modifyMapLikeDeserializer(config, mapLikeType, beanDescription, _findCustomMapLikeDeserializer);
            }
        }
        return _findCustomMapLikeDeserializer;
    }

    public JsonDeserializer<?> createReferenceDeserializer(DeserializationContext deserializationContext, ReferenceType referenceType, BeanDescription beanDescription) {
        JavaType contentType = referenceType.getContentType();
        JsonDeserializer jsonDeserializer = (JsonDeserializer) contentType.getValueHandler();
        DeserializationConfig config = deserializationContext.getConfig();
        TypeDeserializer typeDeserializer = (TypeDeserializer) contentType.getTypeHandler();
        if (typeDeserializer == null) {
            typeDeserializer = findTypeDeserializer(config, contentType);
        }
        TypeDeserializer typeDeserializer2 = typeDeserializer;
        JsonDeserializer<?> _findCustomReferenceDeserializer = _findCustomReferenceDeserializer(referenceType, config, beanDescription, typeDeserializer2, jsonDeserializer);
        if (_findCustomReferenceDeserializer == null && AtomicReference.class.isAssignableFrom(referenceType.getRawClass())) {
            return new AtomicReferenceDeserializer(referenceType, typeDeserializer2, jsonDeserializer);
        }
        if (_findCustomReferenceDeserializer != null && this._factoryConfig.hasDeserializerModifiers()) {
            for (BeanDeserializerModifier modifyReferenceDeserializer : this._factoryConfig.deserializerModifiers()) {
                _findCustomReferenceDeserializer = modifyReferenceDeserializer.modifyReferenceDeserializer(config, referenceType, beanDescription, _findCustomReferenceDeserializer);
            }
        }
        return _findCustomReferenceDeserializer;
    }

    public JsonDeserializer<?> createTreeDeserializer(DeserializationConfig deserializationConfig, JavaType javaType, BeanDescription beanDescription) {
        Class<?> rawClass = javaType.getRawClass();
        JsonDeserializer<?> _findCustomTreeNodeDeserializer = _findCustomTreeNodeDeserializer(rawClass, deserializationConfig, beanDescription);
        if (_findCustomTreeNodeDeserializer != null) {
            return _findCustomTreeNodeDeserializer;
        }
        return JsonNodeDeserializer.getDeserializer(rawClass);
    }

    public JsonDeserializer<?> findDefaultDeserializer(DeserializationContext deserializationContext, JavaType javaType, BeanDescription beanDescription) {
        JavaType javaType2;
        JavaType javaType3;
        JavaType javaType4;
        Class<?> rawClass = javaType.getRawClass();
        if (rawClass == CLASS_OBJECT) {
            DeserializationConfig config = deserializationContext.getConfig();
            if (this._factoryConfig.hasAbstractTypeResolvers()) {
                javaType3 = _findRemappedType(config, List.class);
                javaType4 = _findRemappedType(config, Map.class);
            } else {
                javaType3 = null;
                javaType4 = null;
            }
            return new UntypedObjectDeserializer(javaType3, javaType4);
        } else if (rawClass == CLASS_STRING || rawClass == CLASS_CHAR_BUFFER) {
            return StringDeserializer.instance;
        } else {
            Class<?> cls = CLASS_ITERABLE;
            if (rawClass == cls) {
                TypeFactory typeFactory = deserializationContext.getTypeFactory();
                JavaType[] findTypeParameters = typeFactory.findTypeParameters(javaType, cls);
                if (findTypeParameters == null || findTypeParameters.length != 1) {
                    javaType2 = TypeFactory.unknownType();
                } else {
                    javaType2 = findTypeParameters[0];
                }
                return createCollectionDeserializer(deserializationContext, typeFactory.constructCollectionType((Class<? extends Collection>) Collection.class, javaType2), beanDescription);
            } else if (rawClass == CLASS_MAP_ENTRY) {
                JavaType containedType = javaType.containedType(0);
                if (containedType == null) {
                    containedType = TypeFactory.unknownType();
                }
                JavaType containedType2 = javaType.containedType(1);
                if (containedType2 == null) {
                    containedType2 = TypeFactory.unknownType();
                }
                TypeDeserializer typeDeserializer = (TypeDeserializer) containedType2.getTypeHandler();
                if (typeDeserializer == null) {
                    typeDeserializer = findTypeDeserializer(deserializationContext.getConfig(), containedType2);
                }
                return new MapEntryDeserializer(javaType, (KeyDeserializer) containedType.getValueHandler(), (JsonDeserializer<Object>) (JsonDeserializer) containedType2.getValueHandler(), typeDeserializer);
            } else {
                String name = rawClass.getName();
                if (rawClass.isPrimitive() || name.startsWith("java.")) {
                    JsonDeserializer<?> find = NumberDeserializers.find(rawClass, name);
                    if (find == null) {
                        find = DateDeserializers.find(rawClass, name);
                    }
                    if (find != null) {
                        return find;
                    }
                }
                if (rawClass == TokenBuffer.class) {
                    return new TokenBufferDeserializer();
                }
                JsonDeserializer<?> findOptionalStdDeserializer = findOptionalStdDeserializer(deserializationContext, javaType, beanDescription);
                if (findOptionalStdDeserializer != null) {
                    return findOptionalStdDeserializer;
                }
                return JdkDeserializers.find(rawClass, name);
            }
        }
    }

    /* access modifiers changed from: protected */
    public JsonDeserializer<Object> findDeserializerFromAnnotation(DeserializationContext deserializationContext, Annotated annotated) {
        Object findDeserializer;
        AnnotationIntrospector annotationIntrospector = deserializationContext.getAnnotationIntrospector();
        if (annotationIntrospector == null || (findDeserializer = annotationIntrospector.findDeserializer(annotated)) == null) {
            return null;
        }
        return deserializationContext.deserializerInstance(annotated, findDeserializer);
    }

    /* access modifiers changed from: protected */
    public KeyDeserializer findKeyDeserializerFromAnnotation(DeserializationContext deserializationContext, Annotated annotated) {
        Object findKeyDeserializer;
        AnnotationIntrospector annotationIntrospector = deserializationContext.getAnnotationIntrospector();
        if (annotationIntrospector == null || (findKeyDeserializer = annotationIntrospector.findKeyDeserializer(annotated)) == null) {
            return null;
        }
        return deserializationContext.keyDeserializerInstance(annotated, findKeyDeserializer);
    }

    /* access modifiers changed from: protected */
    public JsonDeserializer<?> findOptionalStdDeserializer(DeserializationContext deserializationContext, JavaType javaType, BeanDescription beanDescription) {
        return OptionalHandlerFactory.instance.findDeserializer(javaType, deserializationContext.getConfig(), beanDescription);
    }

    public TypeDeserializer findPropertyContentTypeDeserializer(DeserializationConfig deserializationConfig, JavaType javaType, AnnotatedMember annotatedMember) {
        TypeResolverBuilder<?> findPropertyContentTypeResolver = deserializationConfig.getAnnotationIntrospector().findPropertyContentTypeResolver(deserializationConfig, annotatedMember, javaType);
        JavaType contentType = javaType.getContentType();
        if (findPropertyContentTypeResolver == null) {
            return findTypeDeserializer(deserializationConfig, contentType);
        }
        return findPropertyContentTypeResolver.buildTypeDeserializer(deserializationConfig, contentType, deserializationConfig.getSubtypeResolver().collectAndResolveSubtypesByTypeId(deserializationConfig, annotatedMember, contentType));
    }

    public TypeDeserializer findPropertyTypeDeserializer(DeserializationConfig deserializationConfig, JavaType javaType, AnnotatedMember annotatedMember) {
        TypeResolverBuilder<?> findPropertyTypeResolver = deserializationConfig.getAnnotationIntrospector().findPropertyTypeResolver(deserializationConfig, annotatedMember, javaType);
        if (findPropertyTypeResolver == null) {
            return findTypeDeserializer(deserializationConfig, javaType);
        }
        return findPropertyTypeResolver.buildTypeDeserializer(deserializationConfig, javaType, deserializationConfig.getSubtypeResolver().collectAndResolveSubtypesByTypeId(deserializationConfig, annotatedMember, javaType));
    }

    public TypeDeserializer findTypeDeserializer(DeserializationConfig deserializationConfig, JavaType javaType) {
        Collection<NamedType> collection;
        JavaType mapAbstractType;
        AnnotatedClass classInfo = deserializationConfig.introspectClassAnnotations(javaType.getRawClass()).getClassInfo();
        TypeResolverBuilder findTypeResolver = deserializationConfig.getAnnotationIntrospector().findTypeResolver(deserializationConfig, classInfo, javaType);
        if (findTypeResolver == null) {
            findTypeResolver = deserializationConfig.getDefaultTyper(javaType);
            collection = null;
            if (findTypeResolver == null) {
                return null;
            }
        } else {
            collection = deserializationConfig.getSubtypeResolver().collectAndResolveSubtypesByTypeId(deserializationConfig, classInfo);
        }
        if (findTypeResolver.getDefaultImpl() == null && javaType.isAbstract() && (mapAbstractType = mapAbstractType(deserializationConfig, javaType)) != null && mapAbstractType.getRawClass() != javaType.getRawClass()) {
            findTypeResolver = findTypeResolver.defaultImpl(mapAbstractType.getRawClass());
        }
        return findTypeResolver.buildTypeDeserializer(deserializationConfig, javaType, collection);
    }

    public ValueInstantiator findValueInstantiator(DeserializationContext deserializationContext, BeanDescription beanDescription) {
        ValueInstantiator valueInstantiator;
        DeserializationConfig config = deserializationContext.getConfig();
        AnnotatedClass classInfo = beanDescription.getClassInfo();
        Object findValueInstantiator = deserializationContext.getAnnotationIntrospector().findValueInstantiator(classInfo);
        if (findValueInstantiator != null) {
            valueInstantiator = _valueInstantiatorInstance(config, classInfo, findValueInstantiator);
        } else {
            valueInstantiator = null;
        }
        if (valueInstantiator == null && (valueInstantiator = _findStdValueInstantiator(config, beanDescription)) == null) {
            valueInstantiator = _constructDefaultValueInstantiator(deserializationContext, beanDescription);
        }
        if (this._factoryConfig.hasValueInstantiators()) {
            for (ValueInstantiators next : this._factoryConfig.valueInstantiators()) {
                valueInstantiator = next.findValueInstantiator(config, beanDescription, valueInstantiator);
                if (valueInstantiator == null) {
                    deserializationContext.reportMappingException("Broken registered ValueInstantiators (of type %s): returned null ValueInstantiator", next.getClass().getName());
                }
            }
        }
        if (valueInstantiator.getIncompleteParameter() == null) {
            return valueInstantiator;
        }
        AnnotatedParameter incompleteParameter = valueInstantiator.getIncompleteParameter();
        AnnotatedWithParams owner = incompleteParameter.getOwner();
        throw new IllegalArgumentException("Argument #" + incompleteParameter.getIndex() + " of constructor " + owner + " has no property name annotation; must have name when multiple-parameter constructor annotated as Creator");
    }

    public DeserializerFactoryConfig getFactoryConfig() {
        return this._factoryConfig;
    }

    public JavaType mapAbstractType(DeserializationConfig deserializationConfig, JavaType javaType) {
        JavaType _mapAbstractType2;
        while (true) {
            _mapAbstractType2 = _mapAbstractType2(deserializationConfig, javaType);
            if (_mapAbstractType2 == null) {
                return javaType;
            }
            Class<?> rawClass = javaType.getRawClass();
            Class<?> rawClass2 = _mapAbstractType2.getRawClass();
            if (rawClass == rawClass2 || !rawClass.isAssignableFrom(rawClass2)) {
            } else {
                javaType = _mapAbstractType2;
            }
        }
        throw new IllegalArgumentException("Invalid abstract type resolution from " + javaType + " to " + _mapAbstractType2 + ": latter is not a subtype of former");
    }

    /* access modifiers changed from: protected */
    @Deprecated
    public JavaType modifyTypeByAnnotation(DeserializationContext deserializationContext, Annotated annotated, JavaType javaType) {
        AnnotationIntrospector annotationIntrospector = deserializationContext.getAnnotationIntrospector();
        if (annotationIntrospector == null) {
            return javaType;
        }
        return annotationIntrospector.refineDeserializationType(deserializationContext.getConfig(), annotated, javaType);
    }

    /* access modifiers changed from: protected */
    public JavaType resolveMemberAndTypeAnnotations(DeserializationContext deserializationContext, AnnotatedMember annotatedMember, JavaType javaType) {
        KeyDeserializer keyDeserializerInstance;
        AnnotationIntrospector annotationIntrospector = deserializationContext.getAnnotationIntrospector();
        if (annotationIntrospector == null) {
            return javaType;
        }
        if (!(!javaType.isMapLikeType() || javaType.getKeyType() == null || (keyDeserializerInstance = deserializationContext.keyDeserializerInstance(annotatedMember, annotationIntrospector.findKeyDeserializer(annotatedMember))) == null)) {
            javaType = ((MapLikeType) javaType).withKeyValueHandler(keyDeserializerInstance);
            javaType.getKeyType();
        }
        if (javaType.hasContentType()) {
            JsonDeserializer<Object> deserializerInstance = deserializationContext.deserializerInstance(annotatedMember, annotationIntrospector.findContentDeserializer(annotatedMember));
            if (deserializerInstance != null) {
                javaType = javaType.withContentValueHandler(deserializerInstance);
            }
            TypeDeserializer findPropertyContentTypeDeserializer = findPropertyContentTypeDeserializer(deserializationContext.getConfig(), javaType, annotatedMember);
            if (findPropertyContentTypeDeserializer != null) {
                javaType = javaType.withContentTypeHandler(findPropertyContentTypeDeserializer);
            }
        }
        TypeDeserializer findPropertyTypeDeserializer = findPropertyTypeDeserializer(deserializationContext.getConfig(), javaType, annotatedMember);
        if (findPropertyTypeDeserializer != null) {
            javaType = javaType.withTypeHandler(findPropertyTypeDeserializer);
        }
        return annotationIntrospector.refineDeserializationType(deserializationContext.getConfig(), annotatedMember, javaType);
    }

    /* access modifiers changed from: protected */
    @Deprecated
    public JavaType resolveType(DeserializationContext deserializationContext, BeanDescription beanDescription, JavaType javaType, AnnotatedMember annotatedMember) {
        return resolveMemberAndTypeAnnotations(deserializationContext, annotatedMember, javaType);
    }

    public final DeserializerFactory withAbstractTypeResolver(AbstractTypeResolver abstractTypeResolver) {
        return withConfig(this._factoryConfig.withAbstractTypeResolver(abstractTypeResolver));
    }

    public final DeserializerFactory withAdditionalDeserializers(Deserializers deserializers) {
        return withConfig(this._factoryConfig.withAdditionalDeserializers(deserializers));
    }

    public final DeserializerFactory withAdditionalKeyDeserializers(KeyDeserializers keyDeserializers) {
        return withConfig(this._factoryConfig.withAdditionalKeyDeserializers(keyDeserializers));
    }

    /* access modifiers changed from: protected */
    public abstract DeserializerFactory withConfig(DeserializerFactoryConfig deserializerFactoryConfig);

    public final DeserializerFactory withDeserializerModifier(BeanDeserializerModifier beanDeserializerModifier) {
        return withConfig(this._factoryConfig.withDeserializerModifier(beanDeserializerModifier));
    }

    public final DeserializerFactory withValueInstantiators(ValueInstantiators valueInstantiators) {
        return withConfig(this._factoryConfig.withValueInstantiators(valueInstantiators));
    }
}
