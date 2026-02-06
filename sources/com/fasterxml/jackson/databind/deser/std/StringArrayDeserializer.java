package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.annotation.JacksonStdImpl;
import com.fasterxml.jackson.databind.deser.ContextualDeserializer;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import com.fasterxml.jackson.databind.util.ObjectBuffer;

@JacksonStdImpl
public final class StringArrayDeserializer extends StdDeserializer<String[]> implements ContextualDeserializer {
    public static final StringArrayDeserializer instance = new StringArrayDeserializer();
    private static final long serialVersionUID = 2;
    protected JsonDeserializer<String> _elementDeserializer;
    protected final Boolean _unwrapSingle;

    public StringArrayDeserializer() {
        this((JsonDeserializer<?>) null, (Boolean) null);
    }

    private final String[] handleNonArray(JsonParser jsonParser, DeserializationContext deserializationContext) {
        Boolean bool = this._unwrapSingle;
        String str = null;
        if (bool == Boolean.TRUE || (bool == null && deserializationContext.isEnabled(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY))) {
            if (!jsonParser.hasToken(JsonToken.VALUE_NULL)) {
                str = _parseString(jsonParser, deserializationContext);
            }
            return new String[]{str};
        } else if (!jsonParser.hasToken(JsonToken.VALUE_STRING) || !deserializationContext.isEnabled(DeserializationFeature.ACCEPT_EMPTY_STRING_AS_NULL_OBJECT) || jsonParser.getText().length() != 0) {
            return (String[]) deserializationContext.handleUnexpectedToken(this._valueClass, jsonParser);
        } else {
            return null;
        }
    }

    /* access modifiers changed from: protected */
    public final String[] _deserializeCustom(JsonParser jsonParser, DeserializationContext deserializationContext) {
        String str;
        Object deserialize;
        Class<String> cls = String.class;
        ObjectBuffer leaseObjectBuffer = deserializationContext.leaseObjectBuffer();
        Object[] resetAndStart = leaseObjectBuffer.resetAndStart();
        JsonDeserializer jsonDeserializer = this._elementDeserializer;
        int i10 = 0;
        while (true) {
            try {
                if (jsonParser.nextTextValue() == null) {
                    JsonToken currentToken = jsonParser.getCurrentToken();
                    if (currentToken == JsonToken.END_ARRAY) {
                        String[] strArr = (String[]) leaseObjectBuffer.completeAndClearBuffer(resetAndStart, i10, cls);
                        deserializationContext.returnObjectBuffer(leaseObjectBuffer);
                        return strArr;
                    }
                    if (currentToken == JsonToken.VALUE_NULL) {
                        deserialize = jsonDeserializer.getNullValue(deserializationContext);
                    } else {
                        deserialize = jsonDeserializer.deserialize(jsonParser, deserializationContext);
                    }
                    str = (String) deserialize;
                } else {
                    str = (String) jsonDeserializer.deserialize(jsonParser, deserializationContext);
                }
                if (i10 >= resetAndStart.length) {
                    resetAndStart = leaseObjectBuffer.appendCompletedChunk(resetAndStart);
                    i10 = 0;
                }
                int i11 = i10 + 1;
                try {
                    resetAndStart[i10] = str;
                    i10 = i11;
                } catch (Exception e10) {
                    e = e10;
                    i10 = i11;
                    throw JsonMappingException.wrapWithPath((Throwable) e, (Object) cls, i10);
                }
            } catch (Exception e11) {
                e = e11;
                throw JsonMappingException.wrapWithPath((Throwable) e, (Object) cls, i10);
            }
        }
    }

    public JsonDeserializer<?> createContextual(DeserializationContext deserializationContext, BeanProperty beanProperty) {
        JsonDeserializer jsonDeserializer;
        JsonDeserializer findConvertingContentDeserializer = findConvertingContentDeserializer(deserializationContext, beanProperty, this._elementDeserializer);
        JavaType constructType = deserializationContext.constructType(String.class);
        if (findConvertingContentDeserializer == null) {
            jsonDeserializer = deserializationContext.findContextualValueDeserializer(constructType, beanProperty);
        } else {
            jsonDeserializer = deserializationContext.handleSecondaryContextualization(findConvertingContentDeserializer, beanProperty, constructType);
        }
        Boolean findFormatFeature = findFormatFeature(deserializationContext, beanProperty, String[].class, JsonFormat.Feature.ACCEPT_SINGLE_VALUE_AS_ARRAY);
        if (jsonDeserializer != null && isDefaultDeserializer(jsonDeserializer)) {
            jsonDeserializer = null;
        }
        if (this._elementDeserializer == jsonDeserializer && this._unwrapSingle == findFormatFeature) {
            return this;
        }
        return new StringArrayDeserializer(jsonDeserializer, findFormatFeature);
    }

    public Object deserializeWithType(JsonParser jsonParser, DeserializationContext deserializationContext, TypeDeserializer typeDeserializer) {
        return typeDeserializer.deserializeTypedFromArray(jsonParser, deserializationContext);
    }

    protected StringArrayDeserializer(JsonDeserializer<?> jsonDeserializer, Boolean bool) {
        super((Class<?>) String[].class);
        this._elementDeserializer = jsonDeserializer;
        this._unwrapSingle = bool;
    }

    public String[] deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) {
        if (!jsonParser.isExpectedStartArrayToken()) {
            return handleNonArray(jsonParser, deserializationContext);
        }
        if (this._elementDeserializer != null) {
            return _deserializeCustom(jsonParser, deserializationContext);
        }
        ObjectBuffer leaseObjectBuffer = deserializationContext.leaseObjectBuffer();
        Object[] resetAndStart = leaseObjectBuffer.resetAndStart();
        int i10 = 0;
        while (true) {
            try {
                String nextTextValue = jsonParser.nextTextValue();
                if (nextTextValue == null) {
                    JsonToken currentToken = jsonParser.getCurrentToken();
                    if (currentToken == JsonToken.END_ARRAY) {
                        String[] strArr = (String[]) leaseObjectBuffer.completeAndClearBuffer(resetAndStart, i10, String.class);
                        deserializationContext.returnObjectBuffer(leaseObjectBuffer);
                        return strArr;
                    } else if (currentToken != JsonToken.VALUE_NULL) {
                        nextTextValue = _parseString(jsonParser, deserializationContext);
                    }
                }
                if (i10 >= resetAndStart.length) {
                    resetAndStart = leaseObjectBuffer.appendCompletedChunk(resetAndStart);
                    i10 = 0;
                }
                int i11 = i10 + 1;
                try {
                    resetAndStart[i10] = nextTextValue;
                    i10 = i11;
                } catch (Exception e10) {
                    e = e10;
                    i10 = i11;
                    throw JsonMappingException.wrapWithPath((Throwable) e, (Object) resetAndStart, leaseObjectBuffer.bufferedSize() + i10);
                }
            } catch (Exception e11) {
                e = e11;
                throw JsonMappingException.wrapWithPath((Throwable) e, (Object) resetAndStart, leaseObjectBuffer.bufferedSize() + i10);
            }
        }
    }
}
