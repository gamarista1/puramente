package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.KeyDeserializer;
import com.fasterxml.jackson.databind.annotation.JacksonStdImpl;
import com.fasterxml.jackson.databind.deser.ContextualDeserializer;
import com.fasterxml.jackson.databind.deser.ContextualKeyDeserializer;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import java.util.AbstractMap;
import java.util.Map;

@JacksonStdImpl
public class MapEntryDeserializer extends ContainerDeserializerBase<Map.Entry<Object, Object>> implements ContextualDeserializer {
    private static final long serialVersionUID = 1;
    protected final KeyDeserializer _keyDeserializer;
    protected final JavaType _type;
    protected final JsonDeserializer<Object> _valueDeserializer;
    protected final TypeDeserializer _valueTypeDeserializer;

    public MapEntryDeserializer(JavaType javaType, KeyDeserializer keyDeserializer, JsonDeserializer<Object> jsonDeserializer, TypeDeserializer typeDeserializer) {
        super(javaType);
        if (javaType.containedTypeCount() == 2) {
            this._type = javaType;
            this._keyDeserializer = keyDeserializer;
            this._valueDeserializer = jsonDeserializer;
            this._valueTypeDeserializer = typeDeserializer;
            return;
        }
        throw new IllegalArgumentException("Missing generic type information for " + javaType);
    }

    public JsonDeserializer<?> createContextual(DeserializationContext deserializationContext, BeanProperty beanProperty) {
        JsonDeserializer jsonDeserializer;
        KeyDeserializer keyDeserializer = this._keyDeserializer;
        if (keyDeserializer == null) {
            keyDeserializer = deserializationContext.findKeyDeserializer(this._type.containedType(0), beanProperty);
        } else if (keyDeserializer instanceof ContextualKeyDeserializer) {
            keyDeserializer = ((ContextualKeyDeserializer) keyDeserializer).createContextual(deserializationContext, beanProperty);
        }
        JsonDeserializer findConvertingContentDeserializer = findConvertingContentDeserializer(deserializationContext, beanProperty, this._valueDeserializer);
        JavaType containedType = this._type.containedType(1);
        if (findConvertingContentDeserializer == null) {
            jsonDeserializer = deserializationContext.findContextualValueDeserializer(containedType, beanProperty);
        } else {
            jsonDeserializer = deserializationContext.handleSecondaryContextualization(findConvertingContentDeserializer, beanProperty, containedType);
        }
        TypeDeserializer typeDeserializer = this._valueTypeDeserializer;
        if (typeDeserializer != null) {
            typeDeserializer = typeDeserializer.forProperty(beanProperty);
        }
        return withResolved(keyDeserializer, typeDeserializer, jsonDeserializer);
    }

    public Object deserializeWithType(JsonParser jsonParser, DeserializationContext deserializationContext, TypeDeserializer typeDeserializer) {
        return typeDeserializer.deserializeTypedFromObject(jsonParser, deserializationContext);
    }

    public JsonDeserializer<Object> getContentDeserializer() {
        return this._valueDeserializer;
    }

    public JavaType getContentType() {
        return this._type.containedType(1);
    }

    public JavaType getValueType() {
        return this._type;
    }

    /* access modifiers changed from: protected */
    public MapEntryDeserializer withResolved(KeyDeserializer keyDeserializer, TypeDeserializer typeDeserializer, JsonDeserializer<?> jsonDeserializer) {
        if (this._keyDeserializer == keyDeserializer && this._valueDeserializer == jsonDeserializer && this._valueTypeDeserializer == typeDeserializer) {
            return this;
        }
        return new MapEntryDeserializer(this, keyDeserializer, (JsonDeserializer<Object>) jsonDeserializer, typeDeserializer);
    }

    public Map.Entry<Object, Object> deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) {
        Object obj;
        JsonToken currentToken = jsonParser.getCurrentToken();
        JsonToken jsonToken = JsonToken.START_OBJECT;
        if (currentToken != jsonToken && currentToken != JsonToken.FIELD_NAME && currentToken != JsonToken.END_OBJECT) {
            return (Map.Entry) _deserializeFromEmpty(jsonParser, deserializationContext);
        }
        if (currentToken == jsonToken) {
            currentToken = jsonParser.nextToken();
        }
        if (currentToken == JsonToken.FIELD_NAME) {
            KeyDeserializer keyDeserializer = this._keyDeserializer;
            JsonDeserializer<Object> jsonDeserializer = this._valueDeserializer;
            TypeDeserializer typeDeserializer = this._valueTypeDeserializer;
            String currentName = jsonParser.getCurrentName();
            Object deserializeKey = keyDeserializer.deserializeKey(currentName, deserializationContext);
            try {
                if (jsonParser.nextToken() == JsonToken.VALUE_NULL) {
                    obj = jsonDeserializer.getNullValue(deserializationContext);
                } else if (typeDeserializer == null) {
                    obj = jsonDeserializer.deserialize(jsonParser, deserializationContext);
                } else {
                    obj = jsonDeserializer.deserializeWithType(jsonParser, deserializationContext, typeDeserializer);
                }
            } catch (Exception e10) {
                wrapAndThrow(e10, Map.Entry.class, currentName);
                obj = null;
            }
            JsonToken nextToken = jsonParser.nextToken();
            if (nextToken == JsonToken.END_OBJECT) {
                return new AbstractMap.SimpleEntry(deserializeKey, obj);
            }
            if (nextToken == JsonToken.FIELD_NAME) {
                deserializationContext.reportMappingException("Problem binding JSON into Map.Entry: more than one entry in JSON (second field: '" + jsonParser.getCurrentName() + "')", new Object[0]);
            } else {
                deserializationContext.reportMappingException("Problem binding JSON into Map.Entry: unexpected content after JSON Object entry: " + nextToken, new Object[0]);
            }
            return null;
        } else if (currentToken != JsonToken.END_OBJECT) {
            return (Map.Entry) deserializationContext.handleUnexpectedToken(handledType(), jsonParser);
        } else {
            deserializationContext.reportMappingException("Can not deserialize a Map.Entry out of empty JSON Object", new Object[0]);
            return null;
        }
    }

    protected MapEntryDeserializer(MapEntryDeserializer mapEntryDeserializer) {
        super(mapEntryDeserializer._type);
        this._type = mapEntryDeserializer._type;
        this._keyDeserializer = mapEntryDeserializer._keyDeserializer;
        this._valueDeserializer = mapEntryDeserializer._valueDeserializer;
        this._valueTypeDeserializer = mapEntryDeserializer._valueTypeDeserializer;
    }

    protected MapEntryDeserializer(MapEntryDeserializer mapEntryDeserializer, KeyDeserializer keyDeserializer, JsonDeserializer<Object> jsonDeserializer, TypeDeserializer typeDeserializer) {
        super(mapEntryDeserializer._type);
        this._type = mapEntryDeserializer._type;
        this._keyDeserializer = keyDeserializer;
        this._valueDeserializer = jsonDeserializer;
        this._valueTypeDeserializer = typeDeserializer;
    }

    public Map.Entry<Object, Object> deserialize(JsonParser jsonParser, DeserializationContext deserializationContext, Map.Entry<Object, Object> entry) {
        throw new IllegalStateException("Can not update Map.Entry values");
    }
}
