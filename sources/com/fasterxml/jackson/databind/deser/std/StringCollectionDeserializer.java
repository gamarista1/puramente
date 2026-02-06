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
import com.fasterxml.jackson.databind.deser.ValueInstantiator;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import java.util.Collection;

@JacksonStdImpl
public final class StringCollectionDeserializer extends ContainerDeserializerBase<Collection<String>> implements ContextualDeserializer {
    private static final long serialVersionUID = 1;
    protected final JavaType _collectionType;
    protected final JsonDeserializer<Object> _delegateDeserializer;
    protected final Boolean _unwrapSingle;
    protected final JsonDeserializer<String> _valueDeserializer;
    protected final ValueInstantiator _valueInstantiator;

    public StringCollectionDeserializer(JavaType javaType, JsonDeserializer<?> jsonDeserializer, ValueInstantiator valueInstantiator) {
        this(javaType, valueInstantiator, (JsonDeserializer<?>) null, jsonDeserializer, (Boolean) null);
    }

    /* JADX WARNING: type inference failed for: r6v0, types: [com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String>, com.fasterxml.jackson.databind.JsonDeserializer] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.util.Collection<java.lang.String> deserializeUsingCustom(com.fasterxml.jackson.core.JsonParser r3, com.fasterxml.jackson.databind.DeserializationContext r4, java.util.Collection<java.lang.String> r5, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String> r6) {
        /*
            r2 = this;
        L_0x0000:
            java.lang.String r0 = r3.nextTextValue()
            if (r0 != 0) goto L_0x001f
            com.fasterxml.jackson.core.JsonToken r0 = r3.getCurrentToken()
            com.fasterxml.jackson.core.JsonToken r1 = com.fasterxml.jackson.core.JsonToken.END_ARRAY
            if (r0 != r1) goto L_0x000f
            return r5
        L_0x000f:
            com.fasterxml.jackson.core.JsonToken r1 = com.fasterxml.jackson.core.JsonToken.VALUE_NULL
            if (r0 != r1) goto L_0x001a
            java.lang.Object r0 = r6.getNullValue(r4)
        L_0x0017:
            java.lang.String r0 = (java.lang.String) r0
            goto L_0x0025
        L_0x001a:
            java.lang.Object r0 = r6.deserialize(r3, r4)
            goto L_0x0017
        L_0x001f:
            java.lang.Object r0 = r6.deserialize(r3, r4)
            java.lang.String r0 = (java.lang.String) r0
        L_0x0025:
            r5.add(r0)
            goto L_0x0000
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer.deserializeUsingCustom(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext, java.util.Collection, com.fasterxml.jackson.databind.JsonDeserializer):java.util.Collection");
    }

    private final Collection<String> handleNonArray(JsonParser jsonParser, DeserializationContext deserializationContext, Collection<String> collection) {
        String str;
        Boolean bool = this._unwrapSingle;
        if (bool != Boolean.TRUE && (bool != null || !deserializationContext.isEnabled(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY))) {
            return (Collection) deserializationContext.handleUnexpectedToken(this._collectionType.getRawClass(), jsonParser);
        }
        JsonDeserializer<String> jsonDeserializer = this._valueDeserializer;
        if (jsonParser.getCurrentToken() == JsonToken.VALUE_NULL) {
            if (jsonDeserializer == null) {
                str = null;
            } else {
                str = jsonDeserializer.getNullValue(deserializationContext);
            }
        } else if (jsonDeserializer == null) {
            str = _parseString(jsonParser, deserializationContext);
        } else {
            str = jsonDeserializer.deserialize(jsonParser, deserializationContext);
        }
        collection.add(str);
        return collection;
    }

    public JsonDeserializer<?> createContextual(DeserializationContext deserializationContext, BeanProperty beanProperty) {
        JsonDeserializer<Object> jsonDeserializer;
        JsonDeserializer jsonDeserializer2;
        ValueInstantiator valueInstantiator = this._valueInstantiator;
        JsonDeserializer jsonDeserializer3 = null;
        if (valueInstantiator == null || valueInstantiator.getDelegateCreator() == null) {
            jsonDeserializer = null;
        } else {
            jsonDeserializer = findDeserializer(deserializationContext, this._valueInstantiator.getDelegateType(deserializationContext.getConfig()), beanProperty);
        }
        JsonDeserializer jsonDeserializer4 = this._valueDeserializer;
        JavaType contentType = this._collectionType.getContentType();
        if (jsonDeserializer4 == null) {
            jsonDeserializer2 = findConvertingContentDeserializer(deserializationContext, beanProperty, jsonDeserializer4);
            if (jsonDeserializer2 == null) {
                jsonDeserializer2 = deserializationContext.findContextualValueDeserializer(contentType, beanProperty);
            }
        } else {
            jsonDeserializer2 = deserializationContext.handleSecondaryContextualization(jsonDeserializer4, beanProperty, contentType);
        }
        Boolean findFormatFeature = findFormatFeature(deserializationContext, beanProperty, Collection.class, JsonFormat.Feature.ACCEPT_SINGLE_VALUE_AS_ARRAY);
        if (!isDefaultDeserializer(jsonDeserializer2)) {
            jsonDeserializer3 = jsonDeserializer2;
        }
        return withResolved(jsonDeserializer, jsonDeserializer3, findFormatFeature);
    }

    public Object deserializeWithType(JsonParser jsonParser, DeserializationContext deserializationContext, TypeDeserializer typeDeserializer) {
        return typeDeserializer.deserializeTypedFromArray(jsonParser, deserializationContext);
    }

    public JsonDeserializer<Object> getContentDeserializer() {
        return this._valueDeserializer;
    }

    public JavaType getContentType() {
        return this._collectionType.getContentType();
    }

    public boolean isCachable() {
        if (this._valueDeserializer == null && this._delegateDeserializer == null) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public StringCollectionDeserializer withResolved(JsonDeserializer<?> jsonDeserializer, JsonDeserializer<?> jsonDeserializer2, Boolean bool) {
        if (this._unwrapSingle == bool && this._valueDeserializer == jsonDeserializer2 && this._delegateDeserializer == jsonDeserializer) {
            return this;
        }
        return new StringCollectionDeserializer(this._collectionType, this._valueInstantiator, jsonDeserializer, jsonDeserializer2, bool);
    }

    protected StringCollectionDeserializer(JavaType javaType, ValueInstantiator valueInstantiator, JsonDeserializer<?> jsonDeserializer, JsonDeserializer<?> jsonDeserializer2, Boolean bool) {
        super(javaType);
        this._collectionType = javaType;
        this._valueDeserializer = jsonDeserializer2;
        this._valueInstantiator = valueInstantiator;
        this._delegateDeserializer = jsonDeserializer;
        this._unwrapSingle = bool;
    }

    public Collection<String> deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) {
        JsonDeserializer<Object> jsonDeserializer = this._delegateDeserializer;
        if (jsonDeserializer != null) {
            return (Collection) this._valueInstantiator.createUsingDelegate(deserializationContext, jsonDeserializer.deserialize(jsonParser, deserializationContext));
        }
        return deserialize(jsonParser, deserializationContext, (Collection<String>) (Collection) this._valueInstantiator.createUsingDefault(deserializationContext));
    }

    public Collection<String> deserialize(JsonParser jsonParser, DeserializationContext deserializationContext, Collection<String> collection) {
        if (!jsonParser.isExpectedStartArrayToken()) {
            return handleNonArray(jsonParser, deserializationContext, collection);
        }
        JsonDeserializer<String> jsonDeserializer = this._valueDeserializer;
        if (jsonDeserializer != null) {
            return deserializeUsingCustom(jsonParser, deserializationContext, collection, jsonDeserializer);
        }
        while (true) {
            try {
                String nextTextValue = jsonParser.nextTextValue();
                if (nextTextValue != null) {
                    collection.add(nextTextValue);
                } else {
                    JsonToken currentToken = jsonParser.getCurrentToken();
                    if (currentToken == JsonToken.END_ARRAY) {
                        return collection;
                    }
                    if (currentToken != JsonToken.VALUE_NULL) {
                        nextTextValue = _parseString(jsonParser, deserializationContext);
                    }
                    collection.add(nextTextValue);
                }
            } catch (Exception e10) {
                throw JsonMappingException.wrapWithPath((Throwable) e10, (Object) collection, collection.size());
            }
        }
    }
}
