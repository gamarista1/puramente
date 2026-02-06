package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.annotation.JacksonStdImpl;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;

@JacksonStdImpl
public final class StringDeserializer extends StdScalarDeserializer<String> {
    protected static final int FEATURES_ACCEPT_ARRAYS = (DeserializationFeature.UNWRAP_SINGLE_VALUE_ARRAYS.getMask() | DeserializationFeature.ACCEPT_EMPTY_ARRAY_AS_NULL_OBJECT.getMask());
    public static final StringDeserializer instance = new StringDeserializer();
    private static final long serialVersionUID = 1;

    public StringDeserializer() {
        super((Class<?>) String.class);
    }

    public boolean isCachable() {
        return true;
    }

    /* access modifiers changed from: protected */
    public String _deserializeFromArray(JsonParser jsonParser, DeserializationContext deserializationContext) {
        JsonToken currentToken;
        if (deserializationContext.hasSomeOfFeatures(FEATURES_ACCEPT_ARRAYS)) {
            currentToken = jsonParser.nextToken();
            JsonToken jsonToken = JsonToken.END_ARRAY;
            if (currentToken == jsonToken && deserializationContext.isEnabled(DeserializationFeature.ACCEPT_EMPTY_ARRAY_AS_NULL_OBJECT)) {
                return (String) getNullValue(deserializationContext);
            }
            if (deserializationContext.isEnabled(DeserializationFeature.UNWRAP_SINGLE_VALUE_ARRAYS)) {
                String _parseString = _parseString(jsonParser, deserializationContext);
                if (jsonParser.nextToken() != jsonToken) {
                    handleMissingEndArrayForSingle(jsonParser, deserializationContext);
                }
                return _parseString;
            }
        } else {
            currentToken = jsonParser.getCurrentToken();
        }
        return (String) deserializationContext.handleUnexpectedToken(this._valueClass, currentToken, jsonParser, (String) null, new Object[0]);
    }

    public String deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) {
        if (jsonParser.hasToken(JsonToken.VALUE_STRING)) {
            return jsonParser.getText();
        }
        JsonToken currentToken = jsonParser.getCurrentToken();
        if (currentToken == JsonToken.START_ARRAY) {
            return _deserializeFromArray(jsonParser, deserializationContext);
        }
        if (currentToken == JsonToken.VALUE_EMBEDDED_OBJECT) {
            Object embeddedObject = jsonParser.getEmbeddedObject();
            if (embeddedObject == null) {
                return null;
            }
            if (embeddedObject instanceof byte[]) {
                return deserializationContext.getBase64Variant().encode((byte[]) embeddedObject, false);
            }
            return embeddedObject.toString();
        }
        String valueAsString = jsonParser.getValueAsString();
        if (valueAsString != null) {
            return valueAsString;
        }
        return (String) deserializationContext.handleUnexpectedToken(this._valueClass, jsonParser);
    }

    public String deserializeWithType(JsonParser jsonParser, DeserializationContext deserializationContext, TypeDeserializer typeDeserializer) {
        return deserialize(jsonParser, deserializationContext);
    }
}
