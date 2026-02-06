package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.KeyDeserializer;
import com.fasterxml.jackson.databind.deser.ContextualDeserializer;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import java.util.EnumMap;

public class EnumMapDeserializer extends ContainerDeserializerBase<EnumMap<?, ?>> implements ContextualDeserializer {
    private static final long serialVersionUID = 1;
    protected final Class<?> _enumClass;
    protected KeyDeserializer _keyDeserializer;
    protected final JavaType _mapType;
    protected JsonDeserializer<Object> _valueDeserializer;
    protected final TypeDeserializer _valueTypeDeserializer;

    public EnumMapDeserializer(JavaType javaType, KeyDeserializer keyDeserializer, JsonDeserializer<?> jsonDeserializer, TypeDeserializer typeDeserializer) {
        super(javaType);
        this._mapType = javaType;
        this._enumClass = javaType.getKeyType().getRawClass();
        this._keyDeserializer = keyDeserializer;
        this._valueDeserializer = jsonDeserializer;
        this._valueTypeDeserializer = typeDeserializer;
    }

    /* access modifiers changed from: protected */
    public EnumMap<?, ?> constructMap() {
        return new EnumMap<>(this._enumClass);
    }

    public JsonDeserializer<?> createContextual(DeserializationContext deserializationContext, BeanProperty beanProperty) {
        JsonDeserializer jsonDeserializer;
        KeyDeserializer keyDeserializer = this._keyDeserializer;
        if (keyDeserializer == null) {
            keyDeserializer = deserializationContext.findKeyDeserializer(this._mapType.getKeyType(), beanProperty);
        }
        JsonDeserializer jsonDeserializer2 = this._valueDeserializer;
        JavaType contentType = this._mapType.getContentType();
        if (jsonDeserializer2 == null) {
            jsonDeserializer = deserializationContext.findContextualValueDeserializer(contentType, beanProperty);
        } else {
            jsonDeserializer = deserializationContext.handleSecondaryContextualization(jsonDeserializer2, beanProperty, contentType);
        }
        TypeDeserializer typeDeserializer = this._valueTypeDeserializer;
        if (typeDeserializer != null) {
            typeDeserializer = typeDeserializer.forProperty(beanProperty);
        }
        return withResolved(keyDeserializer, jsonDeserializer, typeDeserializer);
    }

    public Object deserializeWithType(JsonParser jsonParser, DeserializationContext deserializationContext, TypeDeserializer typeDeserializer) {
        return typeDeserializer.deserializeTypedFromObject(jsonParser, deserializationContext);
    }

    public JsonDeserializer<Object> getContentDeserializer() {
        return this._valueDeserializer;
    }

    public JavaType getContentType() {
        return this._mapType.getContentType();
    }

    public boolean isCachable() {
        if (this._valueDeserializer == null && this._keyDeserializer == null && this._valueTypeDeserializer == null) {
            return true;
        }
        return false;
    }

    public EnumMapDeserializer withResolved(KeyDeserializer keyDeserializer, JsonDeserializer<?> jsonDeserializer, TypeDeserializer typeDeserializer) {
        if (keyDeserializer == this._keyDeserializer && jsonDeserializer == this._valueDeserializer && typeDeserializer == this._valueTypeDeserializer) {
            return this;
        }
        return new EnumMapDeserializer(this._mapType, keyDeserializer, jsonDeserializer, this._valueTypeDeserializer);
    }

    public EnumMap<?, ?> deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) {
        Object obj;
        if (jsonParser.getCurrentToken() != JsonToken.START_OBJECT) {
            return (EnumMap) _deserializeFromEmpty(jsonParser, deserializationContext);
        }
        EnumMap<?, ?> constructMap = constructMap();
        JsonDeserializer<Object> jsonDeserializer = this._valueDeserializer;
        TypeDeserializer typeDeserializer = this._valueTypeDeserializer;
        while (jsonParser.nextToken() == JsonToken.FIELD_NAME) {
            String currentName = jsonParser.getCurrentName();
            Enum enumR = (Enum) this._keyDeserializer.deserializeKey(currentName, deserializationContext);
            if (enumR != null) {
                try {
                    if (jsonParser.nextToken() == JsonToken.VALUE_NULL) {
                        obj = jsonDeserializer.getNullValue(deserializationContext);
                    } else if (typeDeserializer == null) {
                        obj = jsonDeserializer.deserialize(jsonParser, deserializationContext);
                    } else {
                        obj = jsonDeserializer.deserializeWithType(jsonParser, deserializationContext, typeDeserializer);
                    }
                    constructMap.put(enumR, obj);
                } catch (Exception e10) {
                    wrapAndThrow(e10, constructMap, currentName);
                    return null;
                }
            } else if (!deserializationContext.isEnabled(DeserializationFeature.READ_UNKNOWN_ENUM_VALUES_AS_NULL)) {
                return (EnumMap) deserializationContext.handleWeirdStringValue(this._enumClass, currentName, "value not one of declared Enum instance names for %s", this._mapType.getKeyType());
            } else {
                jsonParser.nextToken();
                jsonParser.skipChildren();
            }
        }
        return constructMap;
    }
}
