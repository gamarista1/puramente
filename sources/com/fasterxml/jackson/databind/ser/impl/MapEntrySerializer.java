package com.fasterxml.jackson.databind.ser.impl;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.annotation.JacksonStdImpl;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;
import com.fasterxml.jackson.databind.ser.ContainerSerializer;
import com.fasterxml.jackson.databind.ser.ContextualSerializer;
import com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap;
import java.util.Map;

@JacksonStdImpl
public class MapEntrySerializer extends ContainerSerializer<Map.Entry<?, ?>> implements ContextualSerializer {
    protected PropertySerializerMap _dynamicValueSerializers;
    protected final JavaType _entryType;
    protected JsonSerializer<Object> _keySerializer;
    protected final JavaType _keyType;
    protected final BeanProperty _property;
    protected JsonSerializer<Object> _valueSerializer;
    protected final JavaType _valueType;
    protected final boolean _valueTypeIsStatic;
    protected final TypeSerializer _valueTypeSerializer;

    public MapEntrySerializer(JavaType javaType, JavaType javaType2, JavaType javaType3, boolean z10, TypeSerializer typeSerializer, BeanProperty beanProperty) {
        super(javaType);
        this._entryType = javaType;
        this._keyType = javaType2;
        this._valueType = javaType3;
        this._valueTypeIsStatic = z10;
        this._valueTypeSerializer = typeSerializer;
        this._property = beanProperty;
        this._dynamicValueSerializers = PropertySerializerMap.emptyForProperties();
    }

    /* access modifiers changed from: protected */
    public final JsonSerializer<Object> _findAndAddDynamic(PropertySerializerMap propertySerializerMap, Class<?> cls, SerializerProvider serializerProvider) {
        PropertySerializerMap.SerializerAndMapResult findAndAddSecondarySerializer = propertySerializerMap.findAndAddSecondarySerializer(cls, serializerProvider, this._property);
        PropertySerializerMap propertySerializerMap2 = findAndAddSecondarySerializer.map;
        if (propertySerializerMap != propertySerializerMap2) {
            this._dynamicValueSerializers = propertySerializerMap2;
        }
        return findAndAddSecondarySerializer.serializer;
    }

    public ContainerSerializer<?> _withValueTypeSerializer(TypeSerializer typeSerializer) {
        return new MapEntrySerializer(this, this._property, typeSerializer, this._keySerializer, this._valueSerializer);
    }

    public JsonSerializer<?> createContextual(SerializerProvider serializerProvider, BeanProperty beanProperty) {
        AnnotatedMember annotatedMember;
        JsonSerializer jsonSerializer;
        JsonSerializer jsonSerializer2;
        AnnotationIntrospector annotationIntrospector = serializerProvider.getAnnotationIntrospector();
        JsonSerializer jsonSerializer3 = null;
        if (beanProperty == null) {
            annotatedMember = null;
        } else {
            annotatedMember = beanProperty.getMember();
        }
        if (annotatedMember == null || annotationIntrospector == null) {
            jsonSerializer = null;
        } else {
            Object findKeySerializer = annotationIntrospector.findKeySerializer(annotatedMember);
            if (findKeySerializer != null) {
                jsonSerializer = serializerProvider.serializerInstance(annotatedMember, findKeySerializer);
            } else {
                jsonSerializer = null;
            }
            Object findContentSerializer = annotationIntrospector.findContentSerializer(annotatedMember);
            if (findContentSerializer != null) {
                jsonSerializer3 = serializerProvider.serializerInstance(annotatedMember, findContentSerializer);
            }
        }
        if (jsonSerializer3 == null) {
            jsonSerializer3 = this._valueSerializer;
        }
        JsonSerializer findConvertingContentSerializer = findConvertingContentSerializer(serializerProvider, beanProperty, jsonSerializer3);
        if (findConvertingContentSerializer != null) {
            findConvertingContentSerializer = serializerProvider.handleSecondaryContextualization(findConvertingContentSerializer, beanProperty);
        } else if (this._valueTypeIsStatic && !this._valueType.isJavaLangObject()) {
            findConvertingContentSerializer = serializerProvider.findValueSerializer(this._valueType, beanProperty);
        }
        if (jsonSerializer == null) {
            jsonSerializer = this._keySerializer;
        }
        if (jsonSerializer == null) {
            jsonSerializer2 = serializerProvider.findKeySerializer(this._keyType, beanProperty);
        } else {
            jsonSerializer2 = serializerProvider.handleSecondaryContextualization(jsonSerializer, beanProperty);
        }
        return withResolved(beanProperty, jsonSerializer2, findConvertingContentSerializer);
    }

    public JsonSerializer<?> getContentSerializer() {
        return this._valueSerializer;
    }

    public JavaType getContentType() {
        return this._valueType;
    }

    public boolean hasSingleElement(Map.Entry<?, ?> entry) {
        return true;
    }

    public boolean isEmpty(SerializerProvider serializerProvider, Map.Entry<?, ?> entry) {
        return entry == null;
    }

    /* access modifiers changed from: protected */
    public void serializeDynamic(Map.Entry<?, ?> entry, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) {
        JsonSerializer<Object> _findAndAddDynamic;
        JsonSerializer<Object> jsonSerializer = this._keySerializer;
        boolean isEnabled = serializerProvider.isEnabled(SerializationFeature.WRITE_NULL_MAP_VALUES);
        TypeSerializer typeSerializer = this._valueTypeSerializer;
        PropertySerializerMap propertySerializerMap = this._dynamicValueSerializers;
        Object value = entry.getValue();
        Object key = entry.getKey();
        if (key == null) {
            serializerProvider.findNullKeySerializer(this._keyType, this._property).serialize(null, jsonGenerator, serializerProvider);
        } else if (isEnabled || value != null) {
            jsonSerializer.serialize(key, jsonGenerator, serializerProvider);
        } else {
            return;
        }
        if (value == null) {
            serializerProvider.defaultSerializeNull(jsonGenerator);
            return;
        }
        Class<?> cls = value.getClass();
        JsonSerializer<Object> serializerFor = propertySerializerMap.serializerFor(cls);
        if (serializerFor == null) {
            if (this._valueType.hasGenericTypes()) {
                _findAndAddDynamic = _findAndAddDynamic(propertySerializerMap, serializerProvider.constructSpecializedType(this._valueType, cls), serializerProvider);
            } else {
                _findAndAddDynamic = _findAndAddDynamic(propertySerializerMap, cls, serializerProvider);
            }
            serializerFor = _findAndAddDynamic;
        }
        if (typeSerializer == null) {
            try {
                serializerFor.serialize(value, jsonGenerator, serializerProvider);
            } catch (Exception e10) {
                wrapAndThrow(serializerProvider, (Throwable) e10, (Object) entry, "" + key);
            }
        } else {
            serializerFor.serializeWithType(value, jsonGenerator, serializerProvider, typeSerializer);
        }
    }

    /* access modifiers changed from: protected */
    public void serializeUsing(Map.Entry<?, ?> entry, JsonGenerator jsonGenerator, SerializerProvider serializerProvider, JsonSerializer<Object> jsonSerializer) {
        JsonSerializer<Object> jsonSerializer2 = this._keySerializer;
        TypeSerializer typeSerializer = this._valueTypeSerializer;
        boolean isEnabled = serializerProvider.isEnabled(SerializationFeature.WRITE_NULL_MAP_VALUES);
        Object value = entry.getValue();
        Object key = entry.getKey();
        if (key == null) {
            serializerProvider.findNullKeySerializer(this._keyType, this._property).serialize(null, jsonGenerator, serializerProvider);
        } else if (isEnabled || value != null) {
            jsonSerializer2.serialize(key, jsonGenerator, serializerProvider);
        } else {
            return;
        }
        if (value == null) {
            serializerProvider.defaultSerializeNull(jsonGenerator);
        } else if (typeSerializer == null) {
            try {
                jsonSerializer.serialize(value, jsonGenerator, serializerProvider);
            } catch (Exception e10) {
                wrapAndThrow(serializerProvider, (Throwable) e10, (Object) entry, "" + key);
            }
        } else {
            jsonSerializer.serializeWithType(value, jsonGenerator, serializerProvider, typeSerializer);
        }
    }

    public MapEntrySerializer withResolved(BeanProperty beanProperty, JsonSerializer<?> jsonSerializer, JsonSerializer<?> jsonSerializer2) {
        return new MapEntrySerializer(this, beanProperty, this._valueTypeSerializer, jsonSerializer, jsonSerializer2);
    }

    public void serialize(Map.Entry<?, ?> entry, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) {
        jsonGenerator.writeStartObject(entry);
        JsonSerializer<Object> jsonSerializer = this._valueSerializer;
        if (jsonSerializer != null) {
            serializeUsing(entry, jsonGenerator, serializerProvider, jsonSerializer);
        } else {
            serializeDynamic(entry, jsonGenerator, serializerProvider);
        }
        jsonGenerator.writeEndObject();
    }

    public void serializeWithType(Map.Entry<?, ?> entry, JsonGenerator jsonGenerator, SerializerProvider serializerProvider, TypeSerializer typeSerializer) {
        typeSerializer.writeTypePrefixForObject(entry, jsonGenerator);
        jsonGenerator.setCurrentValue(entry);
        JsonSerializer<Object> jsonSerializer = this._valueSerializer;
        if (jsonSerializer != null) {
            serializeUsing(entry, jsonGenerator, serializerProvider, jsonSerializer);
        } else {
            serializeDynamic(entry, jsonGenerator, serializerProvider);
        }
        typeSerializer.writeTypeSuffixForObject(entry, jsonGenerator);
    }

    /* access modifiers changed from: protected */
    public final JsonSerializer<Object> _findAndAddDynamic(PropertySerializerMap propertySerializerMap, JavaType javaType, SerializerProvider serializerProvider) {
        PropertySerializerMap.SerializerAndMapResult findAndAddSecondarySerializer = propertySerializerMap.findAndAddSecondarySerializer(javaType, serializerProvider, this._property);
        PropertySerializerMap propertySerializerMap2 = findAndAddSecondarySerializer.map;
        if (propertySerializerMap != propertySerializerMap2) {
            this._dynamicValueSerializers = propertySerializerMap2;
        }
        return findAndAddSecondarySerializer.serializer;
    }

    protected MapEntrySerializer(MapEntrySerializer mapEntrySerializer, BeanProperty beanProperty, TypeSerializer typeSerializer, JsonSerializer<?> jsonSerializer, JsonSerializer<?> jsonSerializer2) {
        super(Map.class, false);
        this._entryType = mapEntrySerializer._entryType;
        this._keyType = mapEntrySerializer._keyType;
        this._valueType = mapEntrySerializer._valueType;
        this._valueTypeIsStatic = mapEntrySerializer._valueTypeIsStatic;
        this._valueTypeSerializer = mapEntrySerializer._valueTypeSerializer;
        this._keySerializer = jsonSerializer;
        this._valueSerializer = jsonSerializer2;
        this._dynamicValueSerializers = mapEntrySerializer._dynamicValueSerializers;
        this._property = mapEntrySerializer._property;
    }
}
