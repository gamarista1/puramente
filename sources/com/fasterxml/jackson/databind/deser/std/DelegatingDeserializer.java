package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.deser.ContextualDeserializer;
import com.fasterxml.jackson.databind.deser.ResolvableDeserializer;
import com.fasterxml.jackson.databind.deser.SettableBeanProperty;
import com.fasterxml.jackson.databind.deser.impl.ObjectIdReader;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import java.util.Collection;

public abstract class DelegatingDeserializer extends StdDeserializer<Object> implements ContextualDeserializer, ResolvableDeserializer {
    private static final long serialVersionUID = 1;
    protected final JsonDeserializer<?> _delegatee;

    public DelegatingDeserializer(JsonDeserializer<?> jsonDeserializer) {
        super(_figureType(jsonDeserializer));
        this._delegatee = jsonDeserializer;
    }

    private static Class<?> _figureType(JsonDeserializer<?> jsonDeserializer) {
        Class<?> handledType = jsonDeserializer.handledType();
        if (handledType != null) {
            return handledType;
        }
        return Object.class;
    }

    /* access modifiers changed from: protected */
    @Deprecated
    public JsonDeserializer<?> _createContextual(DeserializationContext deserializationContext, BeanProperty beanProperty, JsonDeserializer<?> jsonDeserializer) {
        if (jsonDeserializer == this._delegatee) {
            return this;
        }
        return newDelegatingInstance(jsonDeserializer);
    }

    public JsonDeserializer<?> createContextual(DeserializationContext deserializationContext, BeanProperty beanProperty) {
        JsonDeserializer<?> handleSecondaryContextualization = deserializationContext.handleSecondaryContextualization(this._delegatee, beanProperty, deserializationContext.constructType(this._delegatee.handledType()));
        if (handleSecondaryContextualization == this._delegatee) {
            return this;
        }
        return newDelegatingInstance(handleSecondaryContextualization);
    }

    public Object deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) {
        return this._delegatee.deserialize(jsonParser, deserializationContext);
    }

    public Object deserializeWithType(JsonParser jsonParser, DeserializationContext deserializationContext, TypeDeserializer typeDeserializer) {
        return this._delegatee.deserializeWithType(jsonParser, deserializationContext, typeDeserializer);
    }

    public SettableBeanProperty findBackReference(String str) {
        return this._delegatee.findBackReference(str);
    }

    public JsonDeserializer<?> getDelegatee() {
        return this._delegatee;
    }

    public Object getEmptyValue(DeserializationContext deserializationContext) {
        return this._delegatee.getEmptyValue(deserializationContext);
    }

    public Collection<Object> getKnownPropertyNames() {
        return this._delegatee.getKnownPropertyNames();
    }

    public Object getNullValue(DeserializationContext deserializationContext) {
        return this._delegatee.getNullValue(deserializationContext);
    }

    public ObjectIdReader getObjectIdReader() {
        return this._delegatee.getObjectIdReader();
    }

    public boolean isCachable() {
        return this._delegatee.isCachable();
    }

    /* access modifiers changed from: protected */
    public abstract JsonDeserializer<?> newDelegatingInstance(JsonDeserializer<?> jsonDeserializer);

    public JsonDeserializer<?> replaceDelegatee(JsonDeserializer<?> jsonDeserializer) {
        if (jsonDeserializer == this._delegatee) {
            return this;
        }
        return newDelegatingInstance(jsonDeserializer);
    }

    public void resolve(DeserializationContext deserializationContext) {
        JsonDeserializer<?> jsonDeserializer = this._delegatee;
        if (jsonDeserializer instanceof ResolvableDeserializer) {
            ((ResolvableDeserializer) jsonDeserializer).resolve(deserializationContext);
        }
    }

    public Object deserialize(JsonParser jsonParser, DeserializationContext deserializationContext, Object obj) {
        return this._delegatee.deserialize(jsonParser, deserializationContext, obj);
    }

    @Deprecated
    public Object getEmptyValue() {
        return this._delegatee.getEmptyValue();
    }

    @Deprecated
    public Object getNullValue() {
        return this._delegatee.getNullValue();
    }
}
