package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.RuntimeJsonMappingException;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;
import com.fasterxml.jackson.databind.ser.ContextualSerializer;
import com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap;
import com.fasterxml.jackson.databind.type.ReferenceType;
import com.fasterxml.jackson.databind.util.NameTransformer;

public abstract class ReferenceTypeSerializer<T> extends StdSerializer<T> implements ContextualSerializer {
    private static final long serialVersionUID = 1;
    protected final JsonInclude.Include _contentInclusion;
    protected transient PropertySerializerMap _dynamicSerializers;
    protected final BeanProperty _property;
    protected final JavaType _referredType;
    protected final NameTransformer _unwrapper;
    protected final JsonSerializer<Object> _valueSerializer;
    protected final TypeSerializer _valueTypeSerializer;

    public ReferenceTypeSerializer(ReferenceType referenceType, boolean z10, TypeSerializer typeSerializer, JsonSerializer<Object> jsonSerializer) {
        super((JavaType) referenceType);
        this._referredType = referenceType.getReferencedType();
        this._property = null;
        this._valueTypeSerializer = typeSerializer;
        this._valueSerializer = jsonSerializer;
        this._unwrapper = null;
        this._contentInclusion = null;
        this._dynamicSerializers = PropertySerializerMap.emptyForProperties();
    }

    private final JsonSerializer<Object> _findCachedSerializer(SerializerProvider serializerProvider, Class<?> cls) {
        JsonSerializer<Object> serializerFor = this._dynamicSerializers.serializerFor(cls);
        if (serializerFor != null) {
            return serializerFor;
        }
        JsonSerializer<Object> _findSerializer = _findSerializer(serializerProvider, cls, this._property);
        NameTransformer nameTransformer = this._unwrapper;
        if (nameTransformer != null) {
            _findSerializer = _findSerializer.unwrappingSerializer(nameTransformer);
        }
        JsonSerializer<Object> jsonSerializer = _findSerializer;
        this._dynamicSerializers = this._dynamicSerializers.newWith(cls, jsonSerializer);
        return jsonSerializer;
    }

    private final JsonSerializer<Object> _findSerializer(SerializerProvider serializerProvider, Class<?> cls, BeanProperty beanProperty) {
        return serializerProvider.findValueSerializer(cls, beanProperty);
    }

    /* access modifiers changed from: protected */
    public abstract Object _getReferenced(T t10);

    /* access modifiers changed from: protected */
    public abstract Object _getReferencedIfPresent(T t10);

    /* access modifiers changed from: protected */
    public abstract boolean _isValueEmpty(T t10);

    /* access modifiers changed from: protected */
    public boolean _useStatic(SerializerProvider serializerProvider, BeanProperty beanProperty, JavaType javaType) {
        if (javaType.isJavaLangObject()) {
            return false;
        }
        if (javaType.isFinal() || javaType.useStaticType()) {
            return true;
        }
        AnnotationIntrospector annotationIntrospector = serializerProvider.getAnnotationIntrospector();
        if (!(annotationIntrospector == null || beanProperty == null || beanProperty.getMember() == null)) {
            JsonSerialize.Typing findSerializationTyping = annotationIntrospector.findSerializationTyping(beanProperty.getMember());
            if (findSerializationTyping == JsonSerialize.Typing.STATIC) {
                return true;
            }
            if (findSerializationTyping == JsonSerialize.Typing.DYNAMIC) {
                return false;
            }
        }
        return serializerProvider.isEnabled(MapperFeature.USE_STATIC_TYPING);
    }

    public void acceptJsonFormatVisitor(JsonFormatVisitorWrapper jsonFormatVisitorWrapper, JavaType javaType) {
        JsonSerializer<Object> jsonSerializer = this._valueSerializer;
        if (jsonSerializer == null) {
            jsonSerializer = _findSerializer(jsonFormatVisitorWrapper.getProvider(), this._referredType, this._property);
            NameTransformer nameTransformer = this._unwrapper;
            if (nameTransformer != null) {
                jsonSerializer = jsonSerializer.unwrappingSerializer(nameTransformer);
            }
        }
        jsonSerializer.acceptJsonFormatVisitor(jsonFormatVisitorWrapper, this._referredType);
    }

    public JsonSerializer<?> createContextual(SerializerProvider serializerProvider, BeanProperty beanProperty) {
        JsonInclude.Include include;
        TypeSerializer typeSerializer = this._valueTypeSerializer;
        if (typeSerializer != null) {
            typeSerializer = typeSerializer.forProperty(beanProperty);
        }
        TypeSerializer typeSerializer2 = typeSerializer;
        JsonSerializer findAnnotatedContentSerializer = findAnnotatedContentSerializer(serializerProvider, beanProperty);
        if (findAnnotatedContentSerializer == null) {
            findAnnotatedContentSerializer = this._valueSerializer;
            if (findAnnotatedContentSerializer != null) {
                findAnnotatedContentSerializer = serializerProvider.handlePrimaryContextualization(findAnnotatedContentSerializer, beanProperty);
            } else if (_useStatic(serializerProvider, beanProperty, this._referredType)) {
                findAnnotatedContentSerializer = _findSerializer(serializerProvider, this._referredType, beanProperty);
            }
        }
        JsonSerializer jsonSerializer = findAnnotatedContentSerializer;
        JsonInclude.Include include2 = this._contentInclusion;
        JsonInclude.Include contentInclusion = findIncludeOverrides(serializerProvider, beanProperty, handledType()).getContentInclusion();
        if (contentInclusion == include2 || contentInclusion == JsonInclude.Include.USE_DEFAULTS) {
            include = include2;
        } else {
            include = contentInclusion;
        }
        return withResolved(beanProperty, typeSerializer2, jsonSerializer, this._unwrapper, include);
    }

    public boolean isEmpty(SerializerProvider serializerProvider, T t10) {
        if (t10 == null || _isValueEmpty(t10)) {
            return true;
        }
        if (this._contentInclusion == null) {
            return false;
        }
        Object _getReferenced = _getReferenced(t10);
        JsonSerializer<Object> jsonSerializer = this._valueSerializer;
        if (jsonSerializer == null) {
            try {
                jsonSerializer = _findCachedSerializer(serializerProvider, _getReferenced.getClass());
            } catch (JsonMappingException e10) {
                throw new RuntimeJsonMappingException(e10);
            }
        }
        return jsonSerializer.isEmpty(serializerProvider, _getReferenced);
    }

    public boolean isUnwrappingSerializer() {
        if (this._unwrapper != null) {
            return true;
        }
        return false;
    }

    public void serialize(T t10, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) {
        Object _getReferencedIfPresent = _getReferencedIfPresent(t10);
        if (_getReferencedIfPresent != null) {
            JsonSerializer<Object> jsonSerializer = this._valueSerializer;
            if (jsonSerializer == null) {
                jsonSerializer = _findCachedSerializer(serializerProvider, _getReferencedIfPresent.getClass());
            }
            TypeSerializer typeSerializer = this._valueTypeSerializer;
            if (typeSerializer != null) {
                jsonSerializer.serializeWithType(_getReferencedIfPresent, jsonGenerator, serializerProvider, typeSerializer);
            } else {
                jsonSerializer.serialize(_getReferencedIfPresent, jsonGenerator, serializerProvider);
            }
        } else if (this._unwrapper == null) {
            serializerProvider.defaultSerializeNull(jsonGenerator);
        }
    }

    public void serializeWithType(T t10, JsonGenerator jsonGenerator, SerializerProvider serializerProvider, TypeSerializer typeSerializer) {
        Object _getReferencedIfPresent = _getReferencedIfPresent(t10);
        if (_getReferencedIfPresent != null) {
            JsonSerializer<Object> jsonSerializer = this._valueSerializer;
            if (jsonSerializer == null) {
                jsonSerializer = _findCachedSerializer(serializerProvider, _getReferencedIfPresent.getClass());
            }
            jsonSerializer.serializeWithType(_getReferencedIfPresent, jsonGenerator, serializerProvider, typeSerializer);
        } else if (this._unwrapper == null) {
            serializerProvider.defaultSerializeNull(jsonGenerator);
        }
    }

    public JsonSerializer<T> unwrappingSerializer(NameTransformer nameTransformer) {
        JsonSerializer<Object> jsonSerializer = this._valueSerializer;
        if (jsonSerializer != null) {
            jsonSerializer = jsonSerializer.unwrappingSerializer(nameTransformer);
        }
        JsonSerializer<Object> jsonSerializer2 = jsonSerializer;
        NameTransformer nameTransformer2 = this._unwrapper;
        if (nameTransformer2 != null) {
            nameTransformer = NameTransformer.chainedTransformer(nameTransformer, nameTransformer2);
        }
        return withResolved(this._property, this._valueTypeSerializer, jsonSerializer2, nameTransformer, this._contentInclusion);
    }

    /* access modifiers changed from: protected */
    public abstract ReferenceTypeSerializer<T> withResolved(BeanProperty beanProperty, TypeSerializer typeSerializer, JsonSerializer<?> jsonSerializer, NameTransformer nameTransformer, JsonInclude.Include include);

    private final JsonSerializer<Object> _findSerializer(SerializerProvider serializerProvider, JavaType javaType, BeanProperty beanProperty) {
        return serializerProvider.findValueSerializer(javaType, beanProperty);
    }

    protected ReferenceTypeSerializer(ReferenceTypeSerializer<?> referenceTypeSerializer, BeanProperty beanProperty, TypeSerializer typeSerializer, JsonSerializer<?> jsonSerializer, NameTransformer nameTransformer, JsonInclude.Include include) {
        super((StdSerializer<?>) referenceTypeSerializer);
        this._referredType = referenceTypeSerializer._referredType;
        this._dynamicSerializers = referenceTypeSerializer._dynamicSerializers;
        this._property = beanProperty;
        this._valueTypeSerializer = typeSerializer;
        this._valueSerializer = jsonSerializer;
        this._unwrapper = nameTransformer;
        if (include == JsonInclude.Include.USE_DEFAULTS || include == JsonInclude.Include.ALWAYS) {
            this._contentInclusion = null;
        } else {
            this._contentInclusion = include;
        }
    }
}
