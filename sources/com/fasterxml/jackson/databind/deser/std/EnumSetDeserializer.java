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
import com.fasterxml.jackson.databind.deser.ContextualDeserializer;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import java.util.EnumSet;

public class EnumSetDeserializer extends StdDeserializer<EnumSet<?>> implements ContextualDeserializer {
    private static final long serialVersionUID = 1;
    protected final Class<Enum> _enumClass;
    protected JsonDeserializer<Enum<?>> _enumDeserializer;
    protected final JavaType _enumType;
    protected final Boolean _unwrapSingle;

    public EnumSetDeserializer(JavaType javaType, JsonDeserializer<?> jsonDeserializer) {
        super((Class<?>) EnumSet.class);
        this._enumType = javaType;
        Class<?> rawClass = javaType.getRawClass();
        this._enumClass = rawClass;
        if (rawClass.isEnum()) {
            this._enumDeserializer = jsonDeserializer;
            this._unwrapSingle = null;
            return;
        }
        throw new IllegalArgumentException("Type " + javaType + " not Java Enum type");
    }

    private EnumSet constructSet() {
        return EnumSet.noneOf(this._enumClass);
    }

    public JsonDeserializer<?> createContextual(DeserializationContext deserializationContext, BeanProperty beanProperty) {
        JsonDeserializer jsonDeserializer;
        Boolean findFormatFeature = findFormatFeature(deserializationContext, beanProperty, EnumSet.class, JsonFormat.Feature.ACCEPT_SINGLE_VALUE_AS_ARRAY);
        JsonDeserializer jsonDeserializer2 = this._enumDeserializer;
        if (jsonDeserializer2 == null) {
            jsonDeserializer = deserializationContext.findContextualValueDeserializer(this._enumType, beanProperty);
        } else {
            jsonDeserializer = deserializationContext.handleSecondaryContextualization(jsonDeserializer2, beanProperty, this._enumType);
        }
        return withResolved(jsonDeserializer, findFormatFeature);
    }

    public Object deserializeWithType(JsonParser jsonParser, DeserializationContext deserializationContext, TypeDeserializer typeDeserializer) {
        return typeDeserializer.deserializeTypedFromArray(jsonParser, deserializationContext);
    }

    /* access modifiers changed from: protected */
    public EnumSet<?> handleNonArray(JsonParser jsonParser, DeserializationContext deserializationContext) {
        Boolean bool = this._unwrapSingle;
        if (bool != Boolean.TRUE && (bool != null || !deserializationContext.isEnabled(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY))) {
            return (EnumSet) deserializationContext.handleUnexpectedToken(EnumSet.class, jsonParser);
        }
        EnumSet<?> constructSet = constructSet();
        if (jsonParser.hasToken(JsonToken.VALUE_NULL)) {
            return (EnumSet) deserializationContext.handleUnexpectedToken(this._enumClass, jsonParser);
        }
        try {
            Enum deserialize = this._enumDeserializer.deserialize(jsonParser, deserializationContext);
            if (deserialize != null) {
                constructSet.add(deserialize);
            }
            return constructSet;
        } catch (Exception e10) {
            throw JsonMappingException.wrapWithPath((Throwable) e10, (Object) constructSet, constructSet.size());
        }
    }

    public boolean isCachable() {
        if (this._enumType.getValueHandler() != null) {
            return false;
        }
        return true;
    }

    public EnumSetDeserializer withDeserializer(JsonDeserializer<?> jsonDeserializer) {
        if (this._enumDeserializer == jsonDeserializer) {
            return this;
        }
        return new EnumSetDeserializer(this, jsonDeserializer, this._unwrapSingle);
    }

    public EnumSetDeserializer withResolved(JsonDeserializer<?> jsonDeserializer, Boolean bool) {
        if (this._unwrapSingle == bool && this._enumDeserializer == jsonDeserializer) {
            return this;
        }
        return new EnumSetDeserializer(this, jsonDeserializer, bool);
    }

    public EnumSet<?> deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) {
        if (!jsonParser.isExpectedStartArrayToken()) {
            return handleNonArray(jsonParser, deserializationContext);
        }
        EnumSet<?> constructSet = constructSet();
        while (true) {
            try {
                JsonToken nextToken = jsonParser.nextToken();
                if (nextToken == JsonToken.END_ARRAY) {
                    return constructSet;
                }
                if (nextToken == JsonToken.VALUE_NULL) {
                    return (EnumSet) deserializationContext.handleUnexpectedToken(this._enumClass, jsonParser);
                }
                Enum deserialize = this._enumDeserializer.deserialize(jsonParser, deserializationContext);
                if (deserialize != null) {
                    constructSet.add(deserialize);
                }
            } catch (Exception e10) {
                throw JsonMappingException.wrapWithPath((Throwable) e10, (Object) constructSet, constructSet.size());
            }
        }
    }

    protected EnumSetDeserializer(EnumSetDeserializer enumSetDeserializer, JsonDeserializer<?> jsonDeserializer, Boolean bool) {
        super((Class<?>) EnumSet.class);
        this._enumType = enumSetDeserializer._enumType;
        this._enumClass = enumSetDeserializer._enumClass;
        this._enumDeserializer = jsonDeserializer;
        this._unwrapSingle = bool;
    }
}
