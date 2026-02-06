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
import com.fasterxml.jackson.databind.type.ArrayType;
import com.fasterxml.jackson.databind.util.ObjectBuffer;
import java.lang.reflect.Array;

@JacksonStdImpl
public class ObjectArrayDeserializer extends ContainerDeserializerBase<Object[]> implements ContextualDeserializer {
    private static final long serialVersionUID = 1;
    protected final ArrayType _arrayType;
    protected final Class<?> _elementClass;
    protected JsonDeserializer<Object> _elementDeserializer;
    protected final TypeDeserializer _elementTypeDeserializer;
    protected final boolean _untyped;
    protected final Boolean _unwrapSingle;

    public ObjectArrayDeserializer(ArrayType arrayType, JsonDeserializer<Object> jsonDeserializer, TypeDeserializer typeDeserializer) {
        super(arrayType);
        this._arrayType = arrayType;
        Class<?> rawClass = arrayType.getContentType().getRawClass();
        this._elementClass = rawClass;
        this._untyped = rawClass == Object.class;
        this._elementDeserializer = jsonDeserializer;
        this._elementTypeDeserializer = typeDeserializer;
        this._unwrapSingle = null;
    }

    public JsonDeserializer<?> createContextual(DeserializationContext deserializationContext, BeanProperty beanProperty) {
        JsonDeserializer jsonDeserializer;
        JsonDeserializer jsonDeserializer2 = this._elementDeserializer;
        Boolean findFormatFeature = findFormatFeature(deserializationContext, beanProperty, this._arrayType.getRawClass(), JsonFormat.Feature.ACCEPT_SINGLE_VALUE_AS_ARRAY);
        JsonDeserializer findConvertingContentDeserializer = findConvertingContentDeserializer(deserializationContext, beanProperty, jsonDeserializer2);
        JavaType contentType = this._arrayType.getContentType();
        if (findConvertingContentDeserializer == null) {
            jsonDeserializer = deserializationContext.findContextualValueDeserializer(contentType, beanProperty);
        } else {
            jsonDeserializer = deserializationContext.handleSecondaryContextualization(findConvertingContentDeserializer, beanProperty, contentType);
        }
        TypeDeserializer typeDeserializer = this._elementTypeDeserializer;
        if (typeDeserializer != null) {
            typeDeserializer = typeDeserializer.forProperty(beanProperty);
        }
        return withResolved(typeDeserializer, jsonDeserializer, findFormatFeature);
    }

    /* access modifiers changed from: protected */
    public Byte[] deserializeFromBase64(JsonParser jsonParser, DeserializationContext deserializationContext) {
        byte[] binaryValue = jsonParser.getBinaryValue(deserializationContext.getBase64Variant());
        Byte[] bArr = new Byte[binaryValue.length];
        int length = binaryValue.length;
        for (int i10 = 0; i10 < length; i10++) {
            bArr[i10] = Byte.valueOf(binaryValue[i10]);
        }
        return bArr;
    }

    public JsonDeserializer<Object> getContentDeserializer() {
        return this._elementDeserializer;
    }

    public JavaType getContentType() {
        return this._arrayType.getContentType();
    }

    /* access modifiers changed from: protected */
    public Object[] handleNonArray(JsonParser jsonParser, DeserializationContext deserializationContext) {
        Object obj;
        Object[] objArr;
        JsonToken jsonToken = JsonToken.VALUE_STRING;
        if (jsonParser.hasToken(jsonToken) && deserializationContext.isEnabled(DeserializationFeature.ACCEPT_EMPTY_STRING_AS_NULL_OBJECT) && jsonParser.getText().length() == 0) {
            return null;
        }
        Boolean bool = this._unwrapSingle;
        if (bool == Boolean.TRUE || (bool == null && deserializationContext.isEnabled(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY))) {
            if (jsonParser.getCurrentToken() == JsonToken.VALUE_NULL) {
                obj = this._elementDeserializer.getNullValue(deserializationContext);
            } else {
                TypeDeserializer typeDeserializer = this._elementTypeDeserializer;
                if (typeDeserializer == null) {
                    obj = this._elementDeserializer.deserialize(jsonParser, deserializationContext);
                } else {
                    obj = this._elementDeserializer.deserializeWithType(jsonParser, deserializationContext, typeDeserializer);
                }
            }
            if (this._untyped) {
                objArr = new Object[1];
            } else {
                objArr = (Object[]) Array.newInstance(this._elementClass, 1);
            }
            objArr[0] = obj;
            return objArr;
        } else if (jsonParser.getCurrentToken() == jsonToken && this._elementClass == Byte.class) {
            return deserializeFromBase64(jsonParser, deserializationContext);
        } else {
            return (Object[]) deserializationContext.handleUnexpectedToken(this._arrayType.getRawClass(), jsonParser);
        }
    }

    public boolean isCachable() {
        if (this._elementDeserializer == null && this._elementTypeDeserializer == null) {
            return true;
        }
        return false;
    }

    public ObjectArrayDeserializer withDeserializer(TypeDeserializer typeDeserializer, JsonDeserializer<?> jsonDeserializer) {
        return withResolved(typeDeserializer, jsonDeserializer, this._unwrapSingle);
    }

    public ObjectArrayDeserializer withResolved(TypeDeserializer typeDeserializer, JsonDeserializer<?> jsonDeserializer, Boolean bool) {
        if (bool == this._unwrapSingle && jsonDeserializer == this._elementDeserializer && typeDeserializer == this._elementTypeDeserializer) {
            return this;
        }
        return new ObjectArrayDeserializer(this, jsonDeserializer, typeDeserializer, bool);
    }

    public Object[] deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) {
        Object[] objArr;
        Object obj;
        if (!jsonParser.isExpectedStartArrayToken()) {
            return handleNonArray(jsonParser, deserializationContext);
        }
        ObjectBuffer leaseObjectBuffer = deserializationContext.leaseObjectBuffer();
        Object[] resetAndStart = leaseObjectBuffer.resetAndStart();
        TypeDeserializer typeDeserializer = this._elementTypeDeserializer;
        int i10 = 0;
        while (true) {
            try {
                JsonToken nextToken = jsonParser.nextToken();
                if (nextToken == JsonToken.END_ARRAY) {
                    break;
                }
                if (nextToken == JsonToken.VALUE_NULL) {
                    obj = this._elementDeserializer.getNullValue(deserializationContext);
                } else if (typeDeserializer == null) {
                    obj = this._elementDeserializer.deserialize(jsonParser, deserializationContext);
                } else {
                    obj = this._elementDeserializer.deserializeWithType(jsonParser, deserializationContext, typeDeserializer);
                }
                if (i10 >= resetAndStart.length) {
                    resetAndStart = leaseObjectBuffer.appendCompletedChunk(resetAndStart);
                    i10 = 0;
                }
                int i11 = i10 + 1;
                try {
                    resetAndStart[i10] = obj;
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
        if (this._untyped) {
            objArr = leaseObjectBuffer.completeAndClearBuffer(resetAndStart, i10);
        } else {
            objArr = leaseObjectBuffer.completeAndClearBuffer(resetAndStart, i10, this._elementClass);
        }
        deserializationContext.returnObjectBuffer(leaseObjectBuffer);
        return objArr;
    }

    public Object[] deserializeWithType(JsonParser jsonParser, DeserializationContext deserializationContext, TypeDeserializer typeDeserializer) {
        return (Object[]) typeDeserializer.deserializeTypedFromArray(jsonParser, deserializationContext);
    }

    protected ObjectArrayDeserializer(ObjectArrayDeserializer objectArrayDeserializer, JsonDeserializer<Object> jsonDeserializer, TypeDeserializer typeDeserializer, Boolean bool) {
        super(objectArrayDeserializer._arrayType);
        this._arrayType = objectArrayDeserializer._arrayType;
        this._elementClass = objectArrayDeserializer._elementClass;
        this._untyped = objectArrayDeserializer._untyped;
        this._elementDeserializer = jsonDeserializer;
        this._elementTypeDeserializer = typeDeserializer;
        this._unwrapSingle = bool;
    }
}
