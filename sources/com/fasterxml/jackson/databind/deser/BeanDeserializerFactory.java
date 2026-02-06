package com.fasterxml.jackson.databind.deser;

import com.fasterxml.jackson.annotation.ObjectIdGenerator;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import com.fasterxml.jackson.annotation.ObjectIdResolver;
import com.fasterxml.jackson.databind.AbstractTypeResolver;
import com.fasterxml.jackson.databind.BeanDescription;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.PropertyMetadata;
import com.fasterxml.jackson.databind.PropertyName;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import com.fasterxml.jackson.databind.cfg.ConfigOverride;
import com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig;
import com.fasterxml.jackson.databind.cfg.MapperConfig;
import com.fasterxml.jackson.databind.deser.impl.ErrorThrowingDeserializer;
import com.fasterxml.jackson.databind.deser.impl.ObjectIdReader;
import com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator;
import com.fasterxml.jackson.databind.deser.impl.SetterlessProperty;
import com.fasterxml.jackson.databind.deser.std.ThrowableDeserializer;
import com.fasterxml.jackson.databind.introspect.AnnotatedField;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.introspect.AnnotatedMethod;
import com.fasterxml.jackson.databind.introspect.AnnotatedParameter;
import com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition;
import com.fasterxml.jackson.databind.introspect.ObjectIdInfo;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import com.fasterxml.jackson.databind.util.ClassUtil;
import com.fasterxml.jackson.databind.util.SimpleBeanPropertyDefinition;
import io.intercom.android.sdk.metrics.MetricTracker;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class BeanDeserializerFactory extends BasicDeserializerFactory implements Serializable {
    protected static final Set<String> DEFAULT_NO_DESER_CLASS_NAMES;
    private static final Class<?>[] INIT_CAUSE_PARAMS = {Throwable.class};
    private static final Class<?>[] NO_VIEWS = new Class[0];
    public static final BeanDeserializerFactory instance = new BeanDeserializerFactory(new DeserializerFactoryConfig());
    private static final long serialVersionUID = 1;
    protected Set<String> _cfgIllegalClassNames = DEFAULT_NO_DESER_CLASS_NAMES;

    static {
        HashSet hashSet = new HashSet();
        hashSet.add("org.apache.commons.collections.functors.InvokerTransformer");
        hashSet.add("org.apache.commons.collections.functors.InstantiateTransformer");
        hashSet.add("org.apache.commons.collections4.functors.InvokerTransformer");
        hashSet.add("org.apache.commons.collections4.functors.InstantiateTransformer");
        hashSet.add("org.codehaus.groovy.runtime.ConvertedClosure");
        hashSet.add("org.codehaus.groovy.runtime.MethodClosure");
        hashSet.add("org.springframework.beans.factory.ObjectFactory");
        hashSet.add("com.sun.org.apache.xalan.internal.xsltc.trax.TemplatesImpl");
        hashSet.add("org.apache.xalan.xsltc.trax.TemplatesImpl");
        DEFAULT_NO_DESER_CLASS_NAMES = Collections.unmodifiableSet(hashSet);
    }

    public BeanDeserializerFactory(DeserializerFactoryConfig deserializerFactoryConfig) {
        super(deserializerFactoryConfig);
    }

    /* JADX WARNING: type inference failed for: r0v10, types: [com.fasterxml.jackson.databind.deser.SettableBeanProperty[]] */
    /* access modifiers changed from: protected */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x016b  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x018b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void addBeanProps(com.fasterxml.jackson.databind.DeserializationContext r17, com.fasterxml.jackson.databind.BeanDescription r18, com.fasterxml.jackson.databind.deser.BeanDeserializerBuilder r19) {
        /*
            r16 = this;
            r6 = r16
            r7 = r17
            r8 = r18
            r9 = r19
            com.fasterxml.jackson.databind.JavaType r0 = r18.getType()
            boolean r0 = r0.isAbstract()
            if (r0 != 0) goto L_0x0020
            com.fasterxml.jackson.databind.deser.ValueInstantiator r0 = r19.getValueInstantiator()
            com.fasterxml.jackson.databind.DeserializationConfig r1 = r17.getConfig()
            com.fasterxml.jackson.databind.deser.SettableBeanProperty[] r0 = r0.getFromObjectArguments(r1)
            r11 = r0
            goto L_0x0021
        L_0x0020:
            r11 = 0
        L_0x0021:
            r0 = 1
            r12 = 0
            if (r11 == 0) goto L_0x0027
            r13 = r0
            goto L_0x0028
        L_0x0027:
            r13 = r12
        L_0x0028:
            com.fasterxml.jackson.databind.DeserializationConfig r1 = r17.getConfig()
            java.lang.Class r2 = r18.getBeanClass()
            com.fasterxml.jackson.databind.introspect.AnnotatedClass r3 = r18.getClassInfo()
            com.fasterxml.jackson.annotation.JsonIgnoreProperties$Value r1 = r1.getDefaultPropertyIgnorals(r2, r3)
            if (r1 == 0) goto L_0x005b
            boolean r2 = r1.getIgnoreUnknown()
            r9.setIgnoreUnknownProperties(r2)
            java.util.Set r1 = r1.findIgnoredForDeserialization()
            java.util.Iterator r2 = r1.iterator()
        L_0x0049:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x0059
            java.lang.Object r3 = r2.next()
            java.lang.String r3 = (java.lang.String) r3
            r9.addIgnorable(r3)
            goto L_0x0049
        L_0x0059:
            r5 = r1
            goto L_0x0060
        L_0x005b:
            java.util.Set r1 = java.util.Collections.emptySet()
            goto L_0x0059
        L_0x0060:
            com.fasterxml.jackson.databind.introspect.AnnotatedMethod r1 = r18.findAnySetter()
            if (r1 == 0) goto L_0x006f
            com.fasterxml.jackson.databind.deser.SettableAnyProperty r2 = r6.constructAnySetter(r7, r8, r1)
            r9.setAnySetter(r2)
            r2 = 0
            goto L_0x007c
        L_0x006f:
            com.fasterxml.jackson.databind.introspect.AnnotatedMember r2 = r18.findAnySetterField()
            if (r2 == 0) goto L_0x007c
            com.fasterxml.jackson.databind.deser.SettableAnyProperty r3 = r6.constructAnySetter(r7, r8, r2)
            r9.setAnySetter(r3)
        L_0x007c:
            if (r1 != 0) goto L_0x009a
            if (r2 != 0) goto L_0x009a
            java.util.Set r1 = r18.getIgnoredPropertyNames()
            if (r1 == 0) goto L_0x009a
            java.util.Iterator r1 = r1.iterator()
        L_0x008a:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x009a
            java.lang.Object r2 = r1.next()
            java.lang.String r2 = (java.lang.String) r2
            r9.addIgnorable(r2)
            goto L_0x008a
        L_0x009a:
            com.fasterxml.jackson.databind.MapperFeature r1 = com.fasterxml.jackson.databind.MapperFeature.USE_GETTERS_AS_SETTERS
            boolean r1 = r7.isEnabled((com.fasterxml.jackson.databind.MapperFeature) r1)
            if (r1 == 0) goto L_0x00ac
            com.fasterxml.jackson.databind.MapperFeature r1 = com.fasterxml.jackson.databind.MapperFeature.AUTO_DETECT_GETTERS
            boolean r1 = r7.isEnabled((com.fasterxml.jackson.databind.MapperFeature) r1)
            if (r1 == 0) goto L_0x00ac
            r14 = r0
            goto L_0x00ad
        L_0x00ac:
            r14 = r12
        L_0x00ad:
            java.util.List r4 = r18.findProperties()
            r0 = r16
            r1 = r17
            r2 = r18
            r3 = r19
            java.util.List r0 = r0.filterBeanProps(r1, r2, r3, r4, r5)
            com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig r1 = r6._factoryConfig
            boolean r1 = r1.hasDeserializerModifiers()
            if (r1 == 0) goto L_0x00e4
            com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig r1 = r6._factoryConfig
            java.lang.Iterable r1 = r1.deserializerModifiers()
            java.util.Iterator r1 = r1.iterator()
        L_0x00cf:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x00e4
            java.lang.Object r2 = r1.next()
            com.fasterxml.jackson.databind.deser.BeanDeserializerModifier r2 = (com.fasterxml.jackson.databind.deser.BeanDeserializerModifier) r2
            com.fasterxml.jackson.databind.DeserializationConfig r3 = r17.getConfig()
            java.util.List r0 = r2.updateProperties(r3, r8, r0)
            goto L_0x00cf
        L_0x00e4:
            java.util.Iterator r0 = r0.iterator()
        L_0x00e8:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x01af
            java.lang.Object r1 = r0.next()
            com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition r1 = (com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition) r1
            boolean r2 = r1.hasSetter()
            if (r2 == 0) goto L_0x0107
            com.fasterxml.jackson.databind.introspect.AnnotatedMethod r2 = r1.getSetter()
            com.fasterxml.jackson.databind.JavaType r2 = r2.getParameterType(r12)
            com.fasterxml.jackson.databind.deser.SettableBeanProperty r2 = r6.constructSettableProperty(r7, r8, r1, r2)
            goto L_0x0140
        L_0x0107:
            boolean r2 = r1.hasField()
            if (r2 == 0) goto L_0x011a
            com.fasterxml.jackson.databind.introspect.AnnotatedField r2 = r1.getField()
            com.fasterxml.jackson.databind.JavaType r2 = r2.getType()
            com.fasterxml.jackson.databind.deser.SettableBeanProperty r2 = r6.constructSettableProperty(r7, r8, r1, r2)
            goto L_0x0140
        L_0x011a:
            if (r14 == 0) goto L_0x013f
            boolean r2 = r1.hasGetter()
            if (r2 == 0) goto L_0x013f
            com.fasterxml.jackson.databind.introspect.AnnotatedMethod r2 = r1.getGetter()
            java.lang.Class r2 = r2.getRawType()
            java.lang.Class<java.util.Collection> r3 = java.util.Collection.class
            boolean r3 = r3.isAssignableFrom(r2)
            if (r3 != 0) goto L_0x013a
            java.lang.Class<java.util.Map> r3 = java.util.Map.class
            boolean r2 = r3.isAssignableFrom(r2)
            if (r2 == 0) goto L_0x013f
        L_0x013a:
            com.fasterxml.jackson.databind.deser.SettableBeanProperty r2 = r6.constructSetterlessProperty(r7, r8, r1)
            goto L_0x0140
        L_0x013f:
            r2 = 0
        L_0x0140:
            if (r13 == 0) goto L_0x0195
            boolean r3 = r1.hasConstructorParameter()
            if (r3 == 0) goto L_0x0195
            java.lang.String r3 = r1.getName()
            if (r11 == 0) goto L_0x0168
            int r4 = r11.length
            r5 = r12
        L_0x0150:
            if (r5 >= r4) goto L_0x0168
            r15 = r11[r5]
            java.lang.String r10 = r15.getName()
            boolean r10 = r3.equals(r10)
            if (r10 == 0) goto L_0x0165
            boolean r10 = r15 instanceof com.fasterxml.jackson.databind.deser.CreatorProperty
            if (r10 == 0) goto L_0x0165
            com.fasterxml.jackson.databind.deser.CreatorProperty r15 = (com.fasterxml.jackson.databind.deser.CreatorProperty) r15
            goto L_0x0169
        L_0x0165:
            int r5 = r5 + 1
            goto L_0x0150
        L_0x0168:
            r15 = 0
        L_0x0169:
            if (r15 != 0) goto L_0x018b
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            int r4 = r11.length
            r5 = r12
        L_0x0172:
            if (r5 >= r4) goto L_0x0180
            r10 = r11[r5]
            java.lang.String r10 = r10.getName()
            r2.add(r10)
            int r5 = r5 + 1
            goto L_0x0172
        L_0x0180:
            java.lang.String r4 = "Could not find creator property with name '%s' (known Creator properties: %s)"
            java.lang.Object[] r2 = new java.lang.Object[]{r3, r2}
            r7.reportBadPropertyDefinition(r8, r1, r4, r2)
            goto L_0x00e8
        L_0x018b:
            if (r2 == 0) goto L_0x0190
            r15.setFallbackSetter(r2)
        L_0x0190:
            r9.addCreatorProperty(r15)
            goto L_0x00e8
        L_0x0195:
            if (r2 == 0) goto L_0x00e8
            java.lang.Class[] r1 = r1.findViews()
            if (r1 != 0) goto L_0x01a7
            com.fasterxml.jackson.databind.MapperFeature r3 = com.fasterxml.jackson.databind.MapperFeature.DEFAULT_VIEW_INCLUSION
            boolean r3 = r7.isEnabled((com.fasterxml.jackson.databind.MapperFeature) r3)
            if (r3 != 0) goto L_0x01a7
            java.lang.Class<?>[] r1 = NO_VIEWS
        L_0x01a7:
            r2.setViews(r1)
            r9.addProperty(r2)
            goto L_0x00e8
        L_0x01af:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.deser.BeanDeserializerFactory.addBeanProps(com.fasterxml.jackson.databind.DeserializationContext, com.fasterxml.jackson.databind.BeanDescription, com.fasterxml.jackson.databind.deser.BeanDeserializerBuilder):void");
    }

    /* access modifiers changed from: protected */
    public void addInjectables(DeserializationContext deserializationContext, BeanDescription beanDescription, BeanDeserializerBuilder beanDeserializerBuilder) {
        Map<Object, AnnotatedMember> findInjectables = beanDescription.findInjectables();
        if (findInjectables != null) {
            for (Map.Entry next : findInjectables.entrySet()) {
                AnnotatedMember annotatedMember = (AnnotatedMember) next.getValue();
                beanDeserializerBuilder.addInjectable(PropertyName.construct(annotatedMember.getName()), annotatedMember.getType(), beanDescription.getClassAnnotations(), annotatedMember, next.getKey());
            }
        }
    }

    /* access modifiers changed from: protected */
    public void addObjectIdReader(DeserializationContext deserializationContext, BeanDescription beanDescription, BeanDeserializerBuilder beanDeserializerBuilder) {
        SettableBeanProperty settableBeanProperty;
        PropertyBasedObjectIdGenerator objectIdGeneratorInstance;
        JavaType javaType;
        ObjectIdInfo objectIdInfo = beanDescription.getObjectIdInfo();
        if (objectIdInfo != null) {
            Class<? extends ObjectIdGenerator<?>> generatorType = objectIdInfo.getGeneratorType();
            ObjectIdResolver objectIdResolverInstance = deserializationContext.objectIdResolverInstance(beanDescription.getClassInfo(), objectIdInfo);
            if (generatorType == ObjectIdGenerators.PropertyGenerator.class) {
                PropertyName propertyName = objectIdInfo.getPropertyName();
                settableBeanProperty = beanDeserializerBuilder.findProperty(propertyName);
                if (settableBeanProperty != null) {
                    JavaType type = settableBeanProperty.getType();
                    javaType = type;
                    objectIdGeneratorInstance = new PropertyBasedObjectIdGenerator(objectIdInfo.getScope());
                } else {
                    throw new IllegalArgumentException("Invalid Object Id definition for " + beanDescription.getBeanClass().getName() + ": can not find property with name '" + propertyName + "'");
                }
            } else {
                JavaType javaType2 = deserializationContext.getTypeFactory().findTypeParameters(deserializationContext.constructType(generatorType), (Class<?>) ObjectIdGenerator.class)[0];
                settableBeanProperty = null;
                objectIdGeneratorInstance = deserializationContext.objectIdGeneratorInstance(beanDescription.getClassInfo(), objectIdInfo);
                javaType = javaType2;
            }
            SettableBeanProperty settableBeanProperty2 = settableBeanProperty;
            beanDeserializerBuilder.setObjectIdReader(ObjectIdReader.construct(javaType, objectIdInfo.getPropertyName(), objectIdGeneratorInstance, deserializationContext.findRootValueDeserializer(javaType), settableBeanProperty2, objectIdResolverInstance));
        }
    }

    /* access modifiers changed from: protected */
    public void addReferenceProperties(DeserializationContext deserializationContext, BeanDescription beanDescription, BeanDeserializerBuilder beanDeserializerBuilder) {
        JavaType javaType;
        Map<String, AnnotatedMember> findBackReferenceProperties = beanDescription.findBackReferenceProperties();
        if (findBackReferenceProperties != null) {
            for (Map.Entry next : findBackReferenceProperties.entrySet()) {
                String str = (String) next.getKey();
                AnnotatedMember annotatedMember = (AnnotatedMember) next.getValue();
                if (annotatedMember instanceof AnnotatedMethod) {
                    javaType = ((AnnotatedMethod) annotatedMember).getParameterType(0);
                } else {
                    javaType = annotatedMember.getType();
                    if (annotatedMember instanceof AnnotatedParameter) {
                        deserializationContext.reportBadTypeDefinition(beanDescription, "Can not bind back references as Creator parameters: type %s (reference '%s', parameter index #%d)", beanDescription.getBeanClass().getName(), str, Integer.valueOf(((AnnotatedParameter) annotatedMember).getIndex()));
                    }
                }
                beanDeserializerBuilder.addBackReferenceProperty(str, constructSettableProperty(deserializationContext, beanDescription, SimpleBeanPropertyDefinition.construct((MapperConfig<?>) deserializationContext.getConfig(), annotatedMember, PropertyName.construct(str)), javaType));
            }
        }
    }

    public JsonDeserializer<Object> buildBeanDeserializer(DeserializationContext deserializationContext, JavaType javaType, BeanDescription beanDescription) {
        JsonDeserializer<?> jsonDeserializer;
        try {
            ValueInstantiator findValueInstantiator = findValueInstantiator(deserializationContext, beanDescription);
            BeanDeserializerBuilder constructBeanDeserializerBuilder = constructBeanDeserializerBuilder(deserializationContext, beanDescription);
            constructBeanDeserializerBuilder.setValueInstantiator(findValueInstantiator);
            addBeanProps(deserializationContext, beanDescription, constructBeanDeserializerBuilder);
            addObjectIdReader(deserializationContext, beanDescription, constructBeanDeserializerBuilder);
            addReferenceProperties(deserializationContext, beanDescription, constructBeanDeserializerBuilder);
            addInjectables(deserializationContext, beanDescription, constructBeanDeserializerBuilder);
            DeserializationConfig config = deserializationContext.getConfig();
            if (this._factoryConfig.hasDeserializerModifiers()) {
                for (BeanDeserializerModifier updateBuilder : this._factoryConfig.deserializerModifiers()) {
                    constructBeanDeserializerBuilder = updateBuilder.updateBuilder(config, beanDescription, constructBeanDeserializerBuilder);
                }
            }
            if (!javaType.isAbstract() || findValueInstantiator.canInstantiate()) {
                jsonDeserializer = constructBeanDeserializerBuilder.build();
            } else {
                jsonDeserializer = constructBeanDeserializerBuilder.buildAbstract();
            }
            if (this._factoryConfig.hasDeserializerModifiers()) {
                for (BeanDeserializerModifier modifyDeserializer : this._factoryConfig.deserializerModifiers()) {
                    jsonDeserializer = modifyDeserializer.modifyDeserializer(config, beanDescription, jsonDeserializer);
                }
            }
            return jsonDeserializer;
        } catch (NoClassDefFoundError e10) {
            return new ErrorThrowingDeserializer(e10);
        }
    }

    /* access modifiers changed from: protected */
    public JsonDeserializer<Object> buildBuilderBasedDeserializer(DeserializationContext deserializationContext, JavaType javaType, BeanDescription beanDescription) {
        String str;
        ValueInstantiator findValueInstantiator = findValueInstantiator(deserializationContext, beanDescription);
        DeserializationConfig config = deserializationContext.getConfig();
        BeanDeserializerBuilder constructBeanDeserializerBuilder = constructBeanDeserializerBuilder(deserializationContext, beanDescription);
        constructBeanDeserializerBuilder.setValueInstantiator(findValueInstantiator);
        addBeanProps(deserializationContext, beanDescription, constructBeanDeserializerBuilder);
        addObjectIdReader(deserializationContext, beanDescription, constructBeanDeserializerBuilder);
        addReferenceProperties(deserializationContext, beanDescription, constructBeanDeserializerBuilder);
        addInjectables(deserializationContext, beanDescription, constructBeanDeserializerBuilder);
        JsonPOJOBuilder.Value findPOJOBuilderConfig = beanDescription.findPOJOBuilderConfig();
        if (findPOJOBuilderConfig == null) {
            str = "build";
        } else {
            str = findPOJOBuilderConfig.buildMethodName;
        }
        AnnotatedMethod findMethod = beanDescription.findMethod(str, (Class<?>[]) null);
        if (findMethod != null && config.canOverrideAccessModifiers()) {
            ClassUtil.checkAndFixAccess(findMethod.getMember(), config.isEnabled(MapperFeature.OVERRIDE_PUBLIC_ACCESS_MODIFIERS));
        }
        constructBeanDeserializerBuilder.setPOJOBuilder(findMethod, findPOJOBuilderConfig);
        if (this._factoryConfig.hasDeserializerModifiers()) {
            for (BeanDeserializerModifier updateBuilder : this._factoryConfig.deserializerModifiers()) {
                constructBeanDeserializerBuilder = updateBuilder.updateBuilder(config, beanDescription, constructBeanDeserializerBuilder);
            }
        }
        JsonDeserializer<?> buildBuilderBased = constructBeanDeserializerBuilder.buildBuilderBased(javaType, str);
        if (this._factoryConfig.hasDeserializerModifiers()) {
            for (BeanDeserializerModifier modifyDeserializer : this._factoryConfig.deserializerModifiers()) {
                buildBuilderBased = modifyDeserializer.modifyDeserializer(config, beanDescription, buildBuilderBased);
            }
        }
        return buildBuilderBased;
    }

    public JsonDeserializer<Object> buildThrowableDeserializer(DeserializationContext deserializationContext, JavaType javaType, BeanDescription beanDescription) {
        SettableBeanProperty constructSettableProperty;
        DeserializationConfig config = deserializationContext.getConfig();
        BeanDeserializerBuilder constructBeanDeserializerBuilder = constructBeanDeserializerBuilder(deserializationContext, beanDescription);
        constructBeanDeserializerBuilder.setValueInstantiator(findValueInstantiator(deserializationContext, beanDescription));
        addBeanProps(deserializationContext, beanDescription, constructBeanDeserializerBuilder);
        AnnotatedMethod findMethod = beanDescription.findMethod("initCause", INIT_CAUSE_PARAMS);
        if (!(findMethod == null || (constructSettableProperty = constructSettableProperty(deserializationContext, beanDescription, SimpleBeanPropertyDefinition.construct((MapperConfig<?>) deserializationContext.getConfig(), (AnnotatedMember) findMethod, new PropertyName("cause")), findMethod.getParameterType(0))) == null)) {
            constructBeanDeserializerBuilder.addOrReplaceProperty(constructSettableProperty, true);
        }
        constructBeanDeserializerBuilder.addIgnorable("localizedMessage");
        constructBeanDeserializerBuilder.addIgnorable("suppressed");
        constructBeanDeserializerBuilder.addIgnorable(MetricTracker.Object.MESSAGE);
        if (this._factoryConfig.hasDeserializerModifiers()) {
            for (BeanDeserializerModifier updateBuilder : this._factoryConfig.deserializerModifiers()) {
                constructBeanDeserializerBuilder = updateBuilder.updateBuilder(config, beanDescription, constructBeanDeserializerBuilder);
            }
        }
        JsonDeserializer<?> build = constructBeanDeserializerBuilder.build();
        if (build instanceof BeanDeserializer) {
            build = new ThrowableDeserializer((BeanDeserializer) build);
        }
        if (this._factoryConfig.hasDeserializerModifiers()) {
            for (BeanDeserializerModifier modifyDeserializer : this._factoryConfig.deserializerModifiers()) {
                build = modifyDeserializer.modifyDeserializer(config, beanDescription, build);
            }
        }
        return build;
    }

    /* access modifiers changed from: protected */
    public void checkIllegalTypes(DeserializationContext deserializationContext, JavaType javaType, BeanDescription beanDescription) {
        String name = javaType.getRawClass().getName();
        if (this._cfgIllegalClassNames.contains(name)) {
            deserializationContext.reportBadTypeDefinition(beanDescription, "Illegal type (%s) to deserialize: prevented for security reasons", name);
        }
    }

    /* access modifiers changed from: protected */
    public SettableAnyProperty constructAnySetter(DeserializationContext deserializationContext, BeanDescription beanDescription, AnnotatedMember annotatedMember) {
        JavaType javaType;
        JsonDeserializer<?> jsonDeserializer;
        if (annotatedMember instanceof AnnotatedMethod) {
            javaType = ((AnnotatedMethod) annotatedMember).getParameterType(1);
        } else if (annotatedMember instanceof AnnotatedField) {
            javaType = ((AnnotatedField) annotatedMember).getType().getContentType();
        } else {
            javaType = null;
        }
        JavaType resolveMemberAndTypeAnnotations = resolveMemberAndTypeAnnotations(deserializationContext, annotatedMember, javaType);
        BeanProperty.Std std = new BeanProperty.Std(PropertyName.construct(annotatedMember.getName()), resolveMemberAndTypeAnnotations, (PropertyName) null, beanDescription.getClassAnnotations(), annotatedMember, PropertyMetadata.STD_OPTIONAL);
        JsonDeserializer<Object> findDeserializerFromAnnotation = findDeserializerFromAnnotation(deserializationContext, annotatedMember);
        if (findDeserializerFromAnnotation == null) {
            findDeserializerFromAnnotation = (JsonDeserializer) resolveMemberAndTypeAnnotations.getValueHandler();
        }
        if (findDeserializerFromAnnotation != null) {
            jsonDeserializer = deserializationContext.handlePrimaryContextualization(findDeserializerFromAnnotation, std, resolveMemberAndTypeAnnotations);
        } else {
            jsonDeserializer = findDeserializerFromAnnotation;
        }
        return new SettableAnyProperty(std, annotatedMember, resolveMemberAndTypeAnnotations, jsonDeserializer, (TypeDeserializer) resolveMemberAndTypeAnnotations.getTypeHandler());
    }

    /* access modifiers changed from: protected */
    public BeanDeserializerBuilder constructBeanDeserializerBuilder(DeserializationContext deserializationContext, BeanDescription beanDescription) {
        return new BeanDeserializerBuilder(beanDescription, deserializationContext.getConfig());
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v9, resolved type: com.fasterxml.jackson.databind.deser.SettableBeanProperty} */
    /* JADX WARNING: type inference failed for: r1v2, types: [com.fasterxml.jackson.databind.BeanProperty, com.fasterxml.jackson.databind.deser.SettableBeanProperty] */
    /* JADX WARNING: type inference failed for: r1v3, types: [com.fasterxml.jackson.databind.deser.SettableBeanProperty] */
    /* JADX WARNING: type inference failed for: r3v2, types: [com.fasterxml.jackson.databind.deser.impl.FieldProperty] */
    /* JADX WARNING: type inference failed for: r3v3, types: [com.fasterxml.jackson.databind.deser.impl.MethodProperty] */
    /* access modifiers changed from: protected */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.fasterxml.jackson.databind.deser.SettableBeanProperty constructSettableProperty(com.fasterxml.jackson.databind.DeserializationContext r10, com.fasterxml.jackson.databind.BeanDescription r11, com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition r12, com.fasterxml.jackson.databind.JavaType r13) {
        /*
            r9 = this;
            com.fasterxml.jackson.databind.introspect.AnnotatedMember r0 = r12.getNonConstructorMutator()
            if (r0 != 0) goto L_0x000e
            r1 = 0
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.String r2 = "No non-constructor mutator available"
            r10.reportBadPropertyDefinition(r11, r12, r2, r1)
        L_0x000e:
            com.fasterxml.jackson.databind.JavaType r13 = r9.resolveMemberAndTypeAnnotations(r10, r0, r13)
            java.lang.Object r1 = r13.getTypeHandler()
            r6 = r1
            com.fasterxml.jackson.databind.jsontype.TypeDeserializer r6 = (com.fasterxml.jackson.databind.jsontype.TypeDeserializer) r6
            boolean r1 = r0 instanceof com.fasterxml.jackson.databind.introspect.AnnotatedMethod
            if (r1 == 0) goto L_0x002d
            com.fasterxml.jackson.databind.deser.impl.MethodProperty r1 = new com.fasterxml.jackson.databind.deser.impl.MethodProperty
            com.fasterxml.jackson.databind.util.Annotations r7 = r11.getClassAnnotations()
            r8 = r0
            com.fasterxml.jackson.databind.introspect.AnnotatedMethod r8 = (com.fasterxml.jackson.databind.introspect.AnnotatedMethod) r8
            r3 = r1
            r4 = r12
            r5 = r13
            r3.<init>(r4, r5, r6, r7, r8)
            goto L_0x003c
        L_0x002d:
            com.fasterxml.jackson.databind.deser.impl.FieldProperty r1 = new com.fasterxml.jackson.databind.deser.impl.FieldProperty
            com.fasterxml.jackson.databind.util.Annotations r7 = r11.getClassAnnotations()
            r8 = r0
            com.fasterxml.jackson.databind.introspect.AnnotatedField r8 = (com.fasterxml.jackson.databind.introspect.AnnotatedField) r8
            r3 = r1
            r4 = r12
            r5 = r13
            r3.<init>(r4, r5, r6, r7, r8)
        L_0x003c:
            com.fasterxml.jackson.databind.JsonDeserializer r11 = r9.findDeserializerFromAnnotation(r10, r0)
            if (r11 != 0) goto L_0x0048
            java.lang.Object r11 = r13.getValueHandler()
            com.fasterxml.jackson.databind.JsonDeserializer r11 = (com.fasterxml.jackson.databind.JsonDeserializer) r11
        L_0x0048:
            if (r11 == 0) goto L_0x0052
            com.fasterxml.jackson.databind.JsonDeserializer r10 = r10.handlePrimaryContextualization(r11, r1, r13)
            com.fasterxml.jackson.databind.deser.SettableBeanProperty r1 = r1.withValueDeserializer(r10)
        L_0x0052:
            com.fasterxml.jackson.databind.AnnotationIntrospector$ReferenceProperty r10 = r12.findReferenceType()
            if (r10 == 0) goto L_0x0065
            boolean r11 = r10.isManagedReference()
            if (r11 == 0) goto L_0x0065
            java.lang.String r10 = r10.getName()
            r1.setManagedReferenceName(r10)
        L_0x0065:
            com.fasterxml.jackson.databind.introspect.ObjectIdInfo r10 = r12.findObjectIdInfo()
            if (r10 == 0) goto L_0x006e
            r1.setObjectIdInfo(r10)
        L_0x006e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.deser.BeanDeserializerFactory.constructSettableProperty(com.fasterxml.jackson.databind.DeserializationContext, com.fasterxml.jackson.databind.BeanDescription, com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition, com.fasterxml.jackson.databind.JavaType):com.fasterxml.jackson.databind.deser.SettableBeanProperty");
    }

    /* access modifiers changed from: protected */
    public SettableBeanProperty constructSetterlessProperty(DeserializationContext deserializationContext, BeanDescription beanDescription, BeanPropertyDefinition beanPropertyDefinition) {
        AnnotatedMethod getter = beanPropertyDefinition.getGetter();
        JavaType resolveMemberAndTypeAnnotations = resolveMemberAndTypeAnnotations(deserializationContext, getter, getter.getType());
        SetterlessProperty setterlessProperty = new SetterlessProperty(beanPropertyDefinition, resolveMemberAndTypeAnnotations, (TypeDeserializer) resolveMemberAndTypeAnnotations.getTypeHandler(), beanDescription.getClassAnnotations(), getter);
        JsonDeserializer<Object> findDeserializerFromAnnotation = findDeserializerFromAnnotation(deserializationContext, getter);
        if (findDeserializerFromAnnotation == null) {
            findDeserializerFromAnnotation = (JsonDeserializer) resolveMemberAndTypeAnnotations.getValueHandler();
        }
        if (findDeserializerFromAnnotation != null) {
            return setterlessProperty.withValueDeserializer(deserializationContext.handlePrimaryContextualization(findDeserializerFromAnnotation, setterlessProperty, resolveMemberAndTypeAnnotations));
        }
        return setterlessProperty;
    }

    public JsonDeserializer<Object> createBeanDeserializer(DeserializationContext deserializationContext, JavaType javaType, BeanDescription beanDescription) {
        JavaType materializeAbstractType;
        DeserializationConfig config = deserializationContext.getConfig();
        JsonDeserializer<Object> _findCustomBeanDeserializer = _findCustomBeanDeserializer(javaType, config, beanDescription);
        if (_findCustomBeanDeserializer != null) {
            return _findCustomBeanDeserializer;
        }
        if (javaType.isThrowable()) {
            return buildThrowableDeserializer(deserializationContext, javaType, beanDescription);
        }
        if (javaType.isAbstract() && !javaType.isPrimitive() && !javaType.isEnumType() && (materializeAbstractType = materializeAbstractType(deserializationContext, javaType, beanDescription)) != null) {
            return buildBeanDeserializer(deserializationContext, materializeAbstractType, config.introspect(materializeAbstractType));
        }
        JsonDeserializer<?> findStdDeserializer = findStdDeserializer(deserializationContext, javaType, beanDescription);
        if (findStdDeserializer != null) {
            return findStdDeserializer;
        }
        if (!isPotentialBeanType(javaType.getRawClass())) {
            return null;
        }
        checkIllegalTypes(deserializationContext, javaType, beanDescription);
        return buildBeanDeserializer(deserializationContext, javaType, beanDescription);
    }

    public JsonDeserializer<Object> createBuilderBasedDeserializer(DeserializationContext deserializationContext, JavaType javaType, BeanDescription beanDescription, Class<?> cls) {
        return buildBuilderBasedDeserializer(deserializationContext, javaType, deserializationContext.getConfig().introspectForBuilder(deserializationContext.constructType(cls)));
    }

    /* access modifiers changed from: protected */
    public List<BeanPropertyDefinition> filterBeanProps(DeserializationContext deserializationContext, BeanDescription beanDescription, BeanDeserializerBuilder beanDeserializerBuilder, List<BeanPropertyDefinition> list, Set<String> set) {
        Class<?> cls;
        ArrayList arrayList = new ArrayList(Math.max(4, list.size()));
        HashMap hashMap = new HashMap();
        for (BeanPropertyDefinition next : list) {
            String name = next.getName();
            if (!set.contains(name)) {
                if (!next.hasConstructorParameter()) {
                    if (next.hasSetter()) {
                        cls = next.getSetter().getRawParameterType(0);
                    } else if (next.hasField()) {
                        cls = next.getField().getRawType();
                    } else {
                        cls = null;
                    }
                    if (cls != null && isIgnorableType(deserializationContext.getConfig(), beanDescription, cls, hashMap)) {
                        beanDeserializerBuilder.addIgnorable(name);
                    }
                }
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    /* access modifiers changed from: protected */
    public JsonDeserializer<?> findStdDeserializer(DeserializationContext deserializationContext, JavaType javaType, BeanDescription beanDescription) {
        JsonDeserializer<?> findDefaultDeserializer = findDefaultDeserializer(deserializationContext, javaType, beanDescription);
        if (findDefaultDeserializer != null && this._factoryConfig.hasDeserializerModifiers()) {
            for (BeanDeserializerModifier modifyDeserializer : this._factoryConfig.deserializerModifiers()) {
                findDefaultDeserializer = modifyDeserializer.modifyDeserializer(deserializationContext.getConfig(), beanDescription, findDefaultDeserializer);
            }
        }
        return findDefaultDeserializer;
    }

    /* access modifiers changed from: protected */
    public boolean isIgnorableType(DeserializationConfig deserializationConfig, BeanDescription beanDescription, Class<?> cls, Map<Class<?>, Boolean> map) {
        Boolean bool = map.get(cls);
        if (bool != null) {
            return bool.booleanValue();
        }
        ConfigOverride findConfigOverride = deserializationConfig.findConfigOverride(cls);
        if (findConfigOverride != null) {
            bool = findConfigOverride.getIsIgnoredType();
        }
        if (bool == null) {
            bool = deserializationConfig.getAnnotationIntrospector().isIgnorableType(deserializationConfig.introspectClassAnnotations(cls).getClassInfo());
            if (bool == null) {
                bool = Boolean.FALSE;
            }
        }
        map.put(cls, bool);
        return bool.booleanValue();
    }

    /* access modifiers changed from: protected */
    public boolean isPotentialBeanType(Class<?> cls) {
        String canBeABeanType = ClassUtil.canBeABeanType(cls);
        if (canBeABeanType != null) {
            throw new IllegalArgumentException("Can not deserialize Class " + cls.getName() + " (of type " + canBeABeanType + ") as a Bean");
        } else if (!ClassUtil.isProxyType(cls)) {
            String isLocalType = ClassUtil.isLocalType(cls, true);
            if (isLocalType == null) {
                return true;
            }
            throw new IllegalArgumentException("Can not deserialize Class " + cls.getName() + " (of type " + isLocalType + ") as a Bean");
        } else {
            throw new IllegalArgumentException("Can not deserialize Proxy class " + cls.getName() + " as a Bean");
        }
    }

    /* access modifiers changed from: protected */
    public JavaType materializeAbstractType(DeserializationContext deserializationContext, JavaType javaType, BeanDescription beanDescription) {
        for (AbstractTypeResolver resolveAbstractType : this._factoryConfig.abstractTypeResolvers()) {
            JavaType resolveAbstractType2 = resolveAbstractType.resolveAbstractType(deserializationContext.getConfig(), beanDescription);
            if (resolveAbstractType2 != null) {
                return resolveAbstractType2;
            }
        }
        return null;
    }

    public DeserializerFactory withConfig(DeserializerFactoryConfig deserializerFactoryConfig) {
        if (this._factoryConfig == deserializerFactoryConfig) {
            return this;
        }
        if (getClass() == BeanDeserializerFactory.class) {
            return new BeanDeserializerFactory(deserializerFactoryConfig);
        }
        throw new IllegalStateException("Subtype of BeanDeserializerFactory (" + getClass().getName() + ") has not properly overridden method 'withAdditionalDeserializers': can not instantiate subtype with " + "additional deserializer definitions");
    }
}
