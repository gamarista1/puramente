package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.deser.ContextualDeserializer;
import com.fasterxml.jackson.databind.deser.ValueInstantiator;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;

public abstract class ReferenceTypeDeserializer<T> extends StdDeserializer<T> implements ContextualDeserializer {
    private static final long serialVersionUID = 1;
    protected final JavaType _fullType;
    protected final JsonDeserializer<?> _valueDeserializer;
    protected final TypeDeserializer _valueTypeDeserializer;

    public ReferenceTypeDeserializer(JavaType javaType, TypeDeserializer typeDeserializer, JsonDeserializer<?> jsonDeserializer) {
        super(javaType);
        this._fullType = javaType;
        this._valueDeserializer = jsonDeserializer;
        this._valueTypeDeserializer = typeDeserializer;
    }

    public JsonDeserializer<?> createContextual(DeserializationContext deserializationContext, BeanProperty beanProperty) {
        JsonDeserializer jsonDeserializer;
        JsonDeserializer jsonDeserializer2 = this._valueDeserializer;
        if (jsonDeserializer2 == null) {
            jsonDeserializer = deserializationContext.findContextualValueDeserializer(this._fullType.getReferencedType(), beanProperty);
        } else {
            jsonDeserializer = deserializationContext.handleSecondaryContextualization(jsonDeserializer2, beanProperty, this._fullType.getReferencedType());
        }
        TypeDeserializer typeDeserializer = this._valueTypeDeserializer;
        if (typeDeserializer != null) {
            typeDeserializer = typeDeserializer.forProperty(beanProperty);
        }
        if (jsonDeserializer == this._valueDeserializer && typeDeserializer == this._valueTypeDeserializer) {
            return this;
        }
        return withResolved(typeDeserializer, jsonDeserializer);
    }

    public T deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) {
        Object obj;
        TypeDeserializer typeDeserializer = this._valueTypeDeserializer;
        if (typeDeserializer == null) {
            obj = this._valueDeserializer.deserialize(jsonParser, deserializationContext);
        } else {
            obj = this._valueDeserializer.deserializeWithType(jsonParser, deserializationContext, typeDeserializer);
        }
        return referenceValue(obj);
    }

    public Object deserializeWithType(JsonParser jsonParser, DeserializationContext deserializationContext, TypeDeserializer typeDeserializer) {
        if (jsonParser.getCurrentToken() == JsonToken.VALUE_NULL) {
            return getNullValue(deserializationContext);
        }
        TypeDeserializer typeDeserializer2 = this._valueTypeDeserializer;
        if (typeDeserializer2 == null) {
            return deserialize(jsonParser, deserializationContext);
        }
        return referenceValue(typeDeserializer2.deserializeTypedFromAny(jsonParser, deserializationContext));
    }

    public abstract T getNullValue(DeserializationContext deserializationContext);

    public JavaType getValueType() {
        return this._fullType;
    }

    public abstract T referenceValue(Object obj);

    /* access modifiers changed from: protected */
    public abstract ReferenceTypeDeserializer<T> withResolved(TypeDeserializer typeDeserializer, JsonDeserializer<?> jsonDeserializer);

    public ReferenceTypeDeserializer(JavaType javaType, ValueInstantiator valueInstantiator, TypeDeserializer typeDeserializer, JsonDeserializer<?> jsonDeserializer) {
        this(javaType, typeDeserializer, jsonDeserializer);
    }
}
