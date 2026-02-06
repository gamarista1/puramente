package com.fasterxml.jackson.databind;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.Version;
import com.fasterxml.jackson.core.Versioned;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.cfg.MapperConfig;
import com.fasterxml.jackson.databind.introspect.Annotated;
import com.fasterxml.jackson.databind.introspect.AnnotatedClass;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.introspect.AnnotatedMethod;
import com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair;
import com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector;
import com.fasterxml.jackson.databind.introspect.ObjectIdInfo;
import com.fasterxml.jackson.databind.introspect.VisibilityChecker;
import com.fasterxml.jackson.databind.jsontype.NamedType;
import com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder;
import com.fasterxml.jackson.databind.ser.BeanPropertyWriter;
import com.fasterxml.jackson.databind.util.NameTransformer;
import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public abstract class AnnotationIntrospector implements Versioned, Serializable {

    public static class ReferenceProperty {
        private final String _name;
        private final Type _type;

        public enum Type {
            MANAGED_REFERENCE,
            BACK_REFERENCE
        }

        public ReferenceProperty(Type type, String str) {
            this._type = type;
            this._name = str;
        }

        public static ReferenceProperty back(String str) {
            return new ReferenceProperty(Type.BACK_REFERENCE, str);
        }

        public static ReferenceProperty managed(String str) {
            return new ReferenceProperty(Type.MANAGED_REFERENCE, str);
        }

        public String getName() {
            return this._name;
        }

        public Type getType() {
            return this._type;
        }

        public boolean isBackReference() {
            if (this._type == Type.BACK_REFERENCE) {
                return true;
            }
            return false;
        }

        public boolean isManagedReference() {
            if (this._type == Type.MANAGED_REFERENCE) {
                return true;
            }
            return false;
        }
    }

    public static AnnotationIntrospector nopInstance() {
        return NopAnnotationIntrospector.instance;
    }

    public static AnnotationIntrospector pair(AnnotationIntrospector annotationIntrospector, AnnotationIntrospector annotationIntrospector2) {
        return new AnnotationIntrospectorPair(annotationIntrospector, annotationIntrospector2);
    }

    /* access modifiers changed from: protected */
    public <A extends Annotation> A _findAnnotation(Annotated annotated, Class<A> cls) {
        return annotated.getAnnotation(cls);
    }

    /* access modifiers changed from: protected */
    public boolean _hasAnnotation(Annotated annotated, Class<? extends Annotation> cls) {
        return annotated.hasAnnotation(cls);
    }

    /* access modifiers changed from: protected */
    public boolean _hasOneOf(Annotated annotated, Class<? extends Annotation>[] clsArr) {
        return annotated.hasOneOf(clsArr);
    }

    public Collection<AnnotationIntrospector> allIntrospectors() {
        return Collections.singletonList(this);
    }

    public void findAndAddVirtualProperties(MapperConfig<?> mapperConfig, AnnotatedClass annotatedClass, List<BeanPropertyWriter> list) {
    }

    public VisibilityChecker<?> findAutoDetectVisibility(AnnotatedClass annotatedClass, VisibilityChecker<?> visibilityChecker) {
        return visibilityChecker;
    }

    public String findClassDescription(AnnotatedClass annotatedClass) {
        return null;
    }

    public Object findContentDeserializer(Annotated annotated) {
        return null;
    }

    public Object findContentSerializer(Annotated annotated) {
        return null;
    }

    public JsonCreator.Mode findCreatorBinding(Annotated annotated) {
        return null;
    }

    public Enum<?> findDefaultEnumValue(Class<Enum<?>> cls) {
        return null;
    }

    public Object findDeserializationContentConverter(AnnotatedMember annotatedMember) {
        return null;
    }

    @Deprecated
    public Class<?> findDeserializationContentType(Annotated annotated, JavaType javaType) {
        return null;
    }

    public Object findDeserializationConverter(Annotated annotated) {
        return null;
    }

    @Deprecated
    public Class<?> findDeserializationKeyType(Annotated annotated, JavaType javaType) {
        return null;
    }

    @Deprecated
    public Class<?> findDeserializationType(Annotated annotated, JavaType javaType) {
        return null;
    }

    public Object findDeserializer(Annotated annotated) {
        return null;
    }

    @Deprecated
    public String findEnumValue(Enum<?> enumR) {
        return enumR.name();
    }

    public String[] findEnumValues(Class<?> cls, Enum<?>[] enumArr, String[] strArr) {
        int length = enumArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (strArr[i10] == null) {
                strArr[i10] = findEnumValue(enumArr[i10]);
            }
        }
        return strArr;
    }

    public Object findFilterId(Annotated annotated) {
        return null;
    }

    public JsonFormat.Value findFormat(Annotated annotated) {
        return null;
    }

    @Deprecated
    public Boolean findIgnoreUnknownProperties(AnnotatedClass annotatedClass) {
        return null;
    }

    public String findImplicitPropertyName(AnnotatedMember annotatedMember) {
        return null;
    }

    public Object findInjectableValueId(AnnotatedMember annotatedMember) {
        return null;
    }

    public Object findKeyDeserializer(Annotated annotated) {
        return null;
    }

    public Object findKeySerializer(Annotated annotated) {
        return null;
    }

    public PropertyName findNameForDeserialization(Annotated annotated) {
        return null;
    }

    public PropertyName findNameForSerialization(Annotated annotated) {
        return null;
    }

    public Object findNamingStrategy(AnnotatedClass annotatedClass) {
        return null;
    }

    public Object findNullSerializer(Annotated annotated) {
        return null;
    }

    public ObjectIdInfo findObjectIdInfo(Annotated annotated) {
        return null;
    }

    public ObjectIdInfo findObjectReferenceInfo(Annotated annotated, ObjectIdInfo objectIdInfo) {
        return objectIdInfo;
    }

    public Class<?> findPOJOBuilder(AnnotatedClass annotatedClass) {
        return null;
    }

    public JsonPOJOBuilder.Value findPOJOBuilderConfig(AnnotatedClass annotatedClass) {
        return null;
    }

    @Deprecated
    public String[] findPropertiesToIgnore(Annotated annotated) {
        return null;
    }

    public JsonProperty.Access findPropertyAccess(Annotated annotated) {
        return null;
    }

    public TypeResolverBuilder<?> findPropertyContentTypeResolver(MapperConfig<?> mapperConfig, AnnotatedMember annotatedMember, JavaType javaType) {
        return null;
    }

    public String findPropertyDefaultValue(Annotated annotated) {
        return null;
    }

    public String findPropertyDescription(Annotated annotated) {
        return null;
    }

    public JsonIgnoreProperties.Value findPropertyIgnorals(Annotated annotated) {
        Boolean bool;
        JsonIgnoreProperties.Value value;
        JsonIgnoreProperties.Value withoutIgnoreUnknown;
        String[] findPropertiesToIgnore = findPropertiesToIgnore(annotated, true);
        if (annotated instanceof AnnotatedClass) {
            bool = findIgnoreUnknownProperties((AnnotatedClass) annotated);
        } else {
            bool = null;
        }
        if (findPropertiesToIgnore != null) {
            value = JsonIgnoreProperties.Value.forIgnoredProperties(findPropertiesToIgnore);
        } else if (bool == null) {
            return null;
        } else {
            value = JsonIgnoreProperties.Value.empty();
        }
        if (bool == null) {
            return value;
        }
        if (bool.booleanValue()) {
            withoutIgnoreUnknown = value.withIgnoreUnknown();
        } else {
            withoutIgnoreUnknown = value.withoutIgnoreUnknown();
        }
        return withoutIgnoreUnknown;
    }

    public JsonInclude.Value findPropertyInclusion(Annotated annotated) {
        return JsonInclude.Value.empty();
    }

    public Integer findPropertyIndex(Annotated annotated) {
        return null;
    }

    public TypeResolverBuilder<?> findPropertyTypeResolver(MapperConfig<?> mapperConfig, AnnotatedMember annotatedMember, JavaType javaType) {
        return null;
    }

    public ReferenceProperty findReferenceType(AnnotatedMember annotatedMember) {
        return null;
    }

    public PropertyName findRootName(AnnotatedClass annotatedClass) {
        return null;
    }

    public Object findSerializationContentConverter(AnnotatedMember annotatedMember) {
        return null;
    }

    @Deprecated
    public Class<?> findSerializationContentType(Annotated annotated, JavaType javaType) {
        return null;
    }

    public Object findSerializationConverter(Annotated annotated) {
        return null;
    }

    @Deprecated
    public JsonInclude.Include findSerializationInclusion(Annotated annotated, JsonInclude.Include include) {
        return include;
    }

    @Deprecated
    public JsonInclude.Include findSerializationInclusionForContent(Annotated annotated, JsonInclude.Include include) {
        return include;
    }

    @Deprecated
    public Class<?> findSerializationKeyType(Annotated annotated, JavaType javaType) {
        return null;
    }

    public String[] findSerializationPropertyOrder(AnnotatedClass annotatedClass) {
        return null;
    }

    public Boolean findSerializationSortAlphabetically(Annotated annotated) {
        return null;
    }

    @Deprecated
    public Class<?> findSerializationType(Annotated annotated) {
        return null;
    }

    public JsonSerialize.Typing findSerializationTyping(Annotated annotated) {
        return null;
    }

    public Object findSerializer(Annotated annotated) {
        return null;
    }

    public List<NamedType> findSubtypes(Annotated annotated) {
        return null;
    }

    public String findTypeName(AnnotatedClass annotatedClass) {
        return null;
    }

    public TypeResolverBuilder<?> findTypeResolver(MapperConfig<?> mapperConfig, AnnotatedClass annotatedClass, JavaType javaType) {
        return null;
    }

    public NameTransformer findUnwrappingNameTransformer(AnnotatedMember annotatedMember) {
        return null;
    }

    public Object findValueInstantiator(AnnotatedClass annotatedClass) {
        return null;
    }

    public Class<?>[] findViews(Annotated annotated) {
        return null;
    }

    public PropertyName findWrapperName(Annotated annotated) {
        return null;
    }

    public boolean hasAnyGetterAnnotation(AnnotatedMethod annotatedMethod) {
        return false;
    }

    public boolean hasAnySetterAnnotation(AnnotatedMethod annotatedMethod) {
        return false;
    }

    public boolean hasAsValueAnnotation(AnnotatedMethod annotatedMethod) {
        return false;
    }

    public boolean hasCreatorAnnotation(Annotated annotated) {
        return false;
    }

    public boolean hasIgnoreMarker(AnnotatedMember annotatedMember) {
        return false;
    }

    public Boolean hasRequiredMarker(AnnotatedMember annotatedMember) {
        return null;
    }

    public boolean isAnnotationBundle(Annotation annotation) {
        return false;
    }

    public Boolean isIgnorableType(AnnotatedClass annotatedClass) {
        return null;
    }

    public Boolean isTypeId(AnnotatedMember annotatedMember) {
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0039, code lost:
        r0 = r7.getKeyType();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.fasterxml.jackson.databind.JavaType refineDeserializationType(com.fasterxml.jackson.databind.cfg.MapperConfig<?> r5, com.fasterxml.jackson.databind.introspect.Annotated r6, com.fasterxml.jackson.databind.JavaType r7) {
        /*
            r4 = this;
            com.fasterxml.jackson.databind.type.TypeFactory r5 = r5.getTypeFactory()
            java.lang.Class r0 = r4.findDeserializationType(r6, r7)
            r1 = 0
            if (r0 == 0) goto L_0x0033
            boolean r2 = r7.hasRawClass(r0)
            if (r2 != 0) goto L_0x0033
            com.fasterxml.jackson.databind.JavaType r7 = r5.constructSpecializedType(r7, r0)     // Catch:{ IllegalArgumentException -> 0x0016 }
            goto L_0x0033
        L_0x0016:
            r5 = move-exception
            com.fasterxml.jackson.databind.JsonMappingException r2 = new com.fasterxml.jackson.databind.JsonMappingException
            java.lang.String r0 = r0.getName()
            java.lang.String r6 = r6.getName()
            java.lang.String r3 = r5.getMessage()
            java.lang.Object[] r6 = new java.lang.Object[]{r7, r0, r6, r3}
            java.lang.String r7 = "Failed to narrow type %s with annotation (value %s), from '%s': %s"
            java.lang.String r6 = java.lang.String.format(r7, r6)
            r2.<init>((java.io.Closeable) r1, (java.lang.String) r6, (java.lang.Throwable) r5)
            throw r2
        L_0x0033:
            boolean r0 = r7.isMapLikeType()
            if (r0 == 0) goto L_0x006c
            com.fasterxml.jackson.databind.JavaType r0 = r7.getKeyType()
            java.lang.Class r2 = r4.findDeserializationKeyType(r6, r0)
            if (r2 == 0) goto L_0x006c
            com.fasterxml.jackson.databind.JavaType r0 = r5.constructSpecializedType(r0, r2)     // Catch:{ IllegalArgumentException -> 0x004f }
            r3 = r7
            com.fasterxml.jackson.databind.type.MapLikeType r3 = (com.fasterxml.jackson.databind.type.MapLikeType) r3     // Catch:{ IllegalArgumentException -> 0x004f }
            com.fasterxml.jackson.databind.type.MapLikeType r7 = r3.withKeyType(r0)     // Catch:{ IllegalArgumentException -> 0x004f }
            goto L_0x006c
        L_0x004f:
            r5 = move-exception
            com.fasterxml.jackson.databind.JsonMappingException r0 = new com.fasterxml.jackson.databind.JsonMappingException
            java.lang.String r2 = r2.getName()
            java.lang.String r6 = r6.getName()
            java.lang.String r3 = r5.getMessage()
            java.lang.Object[] r6 = new java.lang.Object[]{r7, r2, r6, r3}
            java.lang.String r7 = "Failed to narrow key type of %s with concrete-type annotation (value %s), from '%s': %s"
            java.lang.String r6 = java.lang.String.format(r7, r6)
            r0.<init>((java.io.Closeable) r1, (java.lang.String) r6, (java.lang.Throwable) r5)
            throw r0
        L_0x006c:
            com.fasterxml.jackson.databind.JavaType r0 = r7.getContentType()
            if (r0 == 0) goto L_0x009e
            java.lang.Class r2 = r4.findDeserializationContentType(r6, r0)
            if (r2 == 0) goto L_0x009e
            com.fasterxml.jackson.databind.JavaType r5 = r5.constructSpecializedType(r0, r2)     // Catch:{ IllegalArgumentException -> 0x0081 }
            com.fasterxml.jackson.databind.JavaType r7 = r7.withContentType(r5)     // Catch:{ IllegalArgumentException -> 0x0081 }
            goto L_0x009e
        L_0x0081:
            r5 = move-exception
            com.fasterxml.jackson.databind.JsonMappingException r0 = new com.fasterxml.jackson.databind.JsonMappingException
            java.lang.String r2 = r2.getName()
            java.lang.String r6 = r6.getName()
            java.lang.String r3 = r5.getMessage()
            java.lang.Object[] r6 = new java.lang.Object[]{r7, r2, r6, r3}
            java.lang.String r7 = "Failed to narrow value type of %s with concrete-type annotation (value %s), from '%s': %s"
            java.lang.String r6 = java.lang.String.format(r7, r6)
            r0.<init>((java.io.Closeable) r1, (java.lang.String) r6, (java.lang.Throwable) r5)
            throw r0
        L_0x009e:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.AnnotationIntrospector.refineDeserializationType(com.fasterxml.jackson.databind.cfg.MapperConfig, com.fasterxml.jackson.databind.introspect.Annotated, com.fasterxml.jackson.databind.JavaType):com.fasterxml.jackson.databind.JavaType");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0068, code lost:
        r0 = r8.getKeyType();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.fasterxml.jackson.databind.JavaType refineSerializationType(com.fasterxml.jackson.databind.cfg.MapperConfig<?> r6, com.fasterxml.jackson.databind.introspect.Annotated r7, com.fasterxml.jackson.databind.JavaType r8) {
        /*
            r5 = this;
            com.fasterxml.jackson.databind.type.TypeFactory r6 = r6.getTypeFactory()
            java.lang.Class r0 = r5.findSerializationType(r7)
            r1 = 0
            if (r0 == 0) goto L_0x0062
            boolean r2 = r8.hasRawClass(r0)
            if (r2 == 0) goto L_0x0016
            com.fasterxml.jackson.databind.JavaType r8 = r8.withStaticTyping()
            goto L_0x0062
        L_0x0016:
            java.lang.Class r2 = r8.getRawClass()
            boolean r3 = r0.isAssignableFrom(r2)     // Catch:{ IllegalArgumentException -> 0x0025 }
            if (r3 == 0) goto L_0x0027
            com.fasterxml.jackson.databind.JavaType r8 = r6.constructGeneralizedType(r8, r0)     // Catch:{ IllegalArgumentException -> 0x0025 }
            goto L_0x0062
        L_0x0025:
            r6 = move-exception
            goto L_0x0046
        L_0x0027:
            boolean r2 = r2.isAssignableFrom(r0)     // Catch:{ IllegalArgumentException -> 0x0025 }
            if (r2 == 0) goto L_0x0032
            com.fasterxml.jackson.databind.JavaType r8 = r6.constructSpecializedType(r8, r0)     // Catch:{ IllegalArgumentException -> 0x0025 }
            goto L_0x0062
        L_0x0032:
            com.fasterxml.jackson.databind.JsonMappingException r6 = new com.fasterxml.jackson.databind.JsonMappingException     // Catch:{ IllegalArgumentException -> 0x0025 }
            java.lang.String r2 = "Can not refine serialization type %s into %s; types not related"
            java.lang.String r3 = r0.getName()     // Catch:{ IllegalArgumentException -> 0x0025 }
            java.lang.Object[] r3 = new java.lang.Object[]{r8, r3}     // Catch:{ IllegalArgumentException -> 0x0025 }
            java.lang.String r2 = java.lang.String.format(r2, r3)     // Catch:{ IllegalArgumentException -> 0x0025 }
            r6.<init>((java.io.Closeable) r1, (java.lang.String) r2)     // Catch:{ IllegalArgumentException -> 0x0025 }
            throw r6     // Catch:{ IllegalArgumentException -> 0x0025 }
        L_0x0046:
            com.fasterxml.jackson.databind.JsonMappingException r2 = new com.fasterxml.jackson.databind.JsonMappingException
            java.lang.String r0 = r0.getName()
            java.lang.String r7 = r7.getName()
            java.lang.String r3 = r6.getMessage()
            java.lang.Object[] r7 = new java.lang.Object[]{r8, r0, r7, r3}
            java.lang.String r8 = "Failed to widen type %s with annotation (value %s), from '%s': %s"
            java.lang.String r7 = java.lang.String.format(r8, r7)
            r2.<init>((java.io.Closeable) r1, (java.lang.String) r7, (java.lang.Throwable) r6)
            throw r2
        L_0x0062:
            boolean r0 = r8.isMapLikeType()
            if (r0 == 0) goto L_0x00cf
            com.fasterxml.jackson.databind.JavaType r0 = r8.getKeyType()
            java.lang.Class r2 = r5.findSerializationKeyType(r7, r0)
            if (r2 == 0) goto L_0x00cf
            boolean r3 = r0.hasRawClass(r2)
            if (r3 == 0) goto L_0x007d
            com.fasterxml.jackson.databind.JavaType r0 = r0.withStaticTyping()
            goto L_0x0098
        L_0x007d:
            java.lang.Class r3 = r0.getRawClass()
            boolean r4 = r2.isAssignableFrom(r3)     // Catch:{ IllegalArgumentException -> 0x008c }
            if (r4 == 0) goto L_0x008e
            com.fasterxml.jackson.databind.JavaType r0 = r6.constructGeneralizedType(r0, r2)     // Catch:{ IllegalArgumentException -> 0x008c }
            goto L_0x0098
        L_0x008c:
            r6 = move-exception
            goto L_0x00b3
        L_0x008e:
            boolean r3 = r3.isAssignableFrom(r2)     // Catch:{ IllegalArgumentException -> 0x008c }
            if (r3 == 0) goto L_0x009f
            com.fasterxml.jackson.databind.JavaType r0 = r6.constructSpecializedType(r0, r2)     // Catch:{ IllegalArgumentException -> 0x008c }
        L_0x0098:
            com.fasterxml.jackson.databind.type.MapLikeType r8 = (com.fasterxml.jackson.databind.type.MapLikeType) r8
            com.fasterxml.jackson.databind.type.MapLikeType r8 = r8.withKeyType(r0)
            goto L_0x00cf
        L_0x009f:
            com.fasterxml.jackson.databind.JsonMappingException r6 = new com.fasterxml.jackson.databind.JsonMappingException     // Catch:{ IllegalArgumentException -> 0x008c }
            java.lang.String r3 = "Can not refine serialization key type %s into %s; types not related"
            java.lang.String r4 = r2.getName()     // Catch:{ IllegalArgumentException -> 0x008c }
            java.lang.Object[] r0 = new java.lang.Object[]{r0, r4}     // Catch:{ IllegalArgumentException -> 0x008c }
            java.lang.String r0 = java.lang.String.format(r3, r0)     // Catch:{ IllegalArgumentException -> 0x008c }
            r6.<init>((java.io.Closeable) r1, (java.lang.String) r0)     // Catch:{ IllegalArgumentException -> 0x008c }
            throw r6     // Catch:{ IllegalArgumentException -> 0x008c }
        L_0x00b3:
            com.fasterxml.jackson.databind.JsonMappingException r0 = new com.fasterxml.jackson.databind.JsonMappingException
            java.lang.String r2 = r2.getName()
            java.lang.String r7 = r7.getName()
            java.lang.String r3 = r6.getMessage()
            java.lang.Object[] r7 = new java.lang.Object[]{r8, r2, r7, r3}
            java.lang.String r8 = "Failed to widen key type of %s with concrete-type annotation (value %s), from '%s': %s"
            java.lang.String r7 = java.lang.String.format(r8, r7)
            r0.<init>((java.io.Closeable) r1, (java.lang.String) r7, (java.lang.Throwable) r6)
            throw r0
        L_0x00cf:
            com.fasterxml.jackson.databind.JavaType r0 = r8.getContentType()
            if (r0 == 0) goto L_0x0136
            java.lang.Class r2 = r5.findSerializationContentType(r7, r0)
            if (r2 == 0) goto L_0x0136
            boolean r3 = r0.hasRawClass(r2)
            if (r3 == 0) goto L_0x00e6
            com.fasterxml.jackson.databind.JavaType r6 = r0.withStaticTyping()
            goto L_0x0101
        L_0x00e6:
            java.lang.Class r3 = r0.getRawClass()
            boolean r4 = r2.isAssignableFrom(r3)     // Catch:{ IllegalArgumentException -> 0x00f5 }
            if (r4 == 0) goto L_0x00f7
            com.fasterxml.jackson.databind.JavaType r6 = r6.constructGeneralizedType(r0, r2)     // Catch:{ IllegalArgumentException -> 0x00f5 }
            goto L_0x0101
        L_0x00f5:
            r6 = move-exception
            goto L_0x011a
        L_0x00f7:
            boolean r3 = r3.isAssignableFrom(r2)     // Catch:{ IllegalArgumentException -> 0x00f5 }
            if (r3 == 0) goto L_0x0106
            com.fasterxml.jackson.databind.JavaType r6 = r6.constructSpecializedType(r0, r2)     // Catch:{ IllegalArgumentException -> 0x00f5 }
        L_0x0101:
            com.fasterxml.jackson.databind.JavaType r8 = r8.withContentType(r6)
            goto L_0x0136
        L_0x0106:
            com.fasterxml.jackson.databind.JsonMappingException r6 = new com.fasterxml.jackson.databind.JsonMappingException     // Catch:{ IllegalArgumentException -> 0x00f5 }
            java.lang.String r3 = "Can not refine serialization content type %s into %s; types not related"
            java.lang.String r4 = r2.getName()     // Catch:{ IllegalArgumentException -> 0x00f5 }
            java.lang.Object[] r0 = new java.lang.Object[]{r0, r4}     // Catch:{ IllegalArgumentException -> 0x00f5 }
            java.lang.String r0 = java.lang.String.format(r3, r0)     // Catch:{ IllegalArgumentException -> 0x00f5 }
            r6.<init>((java.io.Closeable) r1, (java.lang.String) r0)     // Catch:{ IllegalArgumentException -> 0x00f5 }
            throw r6     // Catch:{ IllegalArgumentException -> 0x00f5 }
        L_0x011a:
            com.fasterxml.jackson.databind.JsonMappingException r0 = new com.fasterxml.jackson.databind.JsonMappingException
            java.lang.String r2 = r2.getName()
            java.lang.String r7 = r7.getName()
            java.lang.String r3 = r6.getMessage()
            java.lang.Object[] r7 = new java.lang.Object[]{r8, r2, r7, r3}
            java.lang.String r8 = "Internal error: failed to refine value type of %s with concrete-type annotation (value %s), from '%s': %s"
            java.lang.String r7 = java.lang.String.format(r8, r7)
            r0.<init>((java.io.Closeable) r1, (java.lang.String) r7, (java.lang.Throwable) r6)
            throw r0
        L_0x0136:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.AnnotationIntrospector.refineSerializationType(com.fasterxml.jackson.databind.cfg.MapperConfig, com.fasterxml.jackson.databind.introspect.Annotated, com.fasterxml.jackson.databind.JavaType):com.fasterxml.jackson.databind.JavaType");
    }

    public AnnotatedMethod resolveSetterConflict(MapperConfig<?> mapperConfig, AnnotatedMethod annotatedMethod, AnnotatedMethod annotatedMethod2) {
        return null;
    }

    public abstract Version version();

    public Collection<AnnotationIntrospector> allIntrospectors(Collection<AnnotationIntrospector> collection) {
        collection.add(this);
        return collection;
    }

    @Deprecated
    public String[] findPropertiesToIgnore(Annotated annotated, boolean z10) {
        return null;
    }
}
