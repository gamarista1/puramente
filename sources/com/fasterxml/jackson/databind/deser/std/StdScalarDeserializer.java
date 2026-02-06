package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;

public abstract class StdScalarDeserializer<T> extends StdDeserializer<T> {
    protected static final int FEATURES_ACCEPT_ARRAYS = (DeserializationFeature.UNWRAP_SINGLE_VALUE_ARRAYS.getMask() | DeserializationFeature.ACCEPT_EMPTY_ARRAY_AS_NULL_OBJECT.getMask());
    private static final long serialVersionUID = 1;

    protected StdScalarDeserializer(Class<?> cls) {
        super(cls);
    }

    /* access modifiers changed from: protected */
    public T _deserializeFromArray(JsonParser jsonParser, DeserializationContext deserializationContext) {
        JsonToken currentToken;
        if (deserializationContext.hasSomeOfFeatures(FEATURES_ACCEPT_ARRAYS)) {
            currentToken = jsonParser.nextToken();
            JsonToken jsonToken = JsonToken.END_ARRAY;
            if (currentToken == jsonToken && deserializationContext.isEnabled(DeserializationFeature.ACCEPT_EMPTY_ARRAY_AS_NULL_OBJECT)) {
                return getNullValue(deserializationContext);
            }
            if (deserializationContext.isEnabled(DeserializationFeature.UNWRAP_SINGLE_VALUE_ARRAYS)) {
                T deserialize = deserialize(jsonParser, deserializationContext);
                if (jsonParser.nextToken() != jsonToken) {
                    handleMissingEndArrayForSingle(jsonParser, deserializationContext);
                }
                return deserialize;
            }
        } else {
            currentToken = jsonParser.getCurrentToken();
        }
        return deserializationContext.handleUnexpectedToken(this._valueClass, currentToken, jsonParser, (String) null, new Object[0]);
    }

    public Object deserializeWithType(JsonParser jsonParser, DeserializationContext deserializationContext, TypeDeserializer typeDeserializer) {
        return typeDeserializer.deserializeTypedFromScalar(jsonParser, deserializationContext);
    }

    protected StdScalarDeserializer(JavaType javaType) {
        super(javaType);
    }

    protected StdScalarDeserializer(StdScalarDeserializer<?> stdScalarDeserializer) {
        super((StdDeserializer<?>) stdScalarDeserializer);
    }
}
