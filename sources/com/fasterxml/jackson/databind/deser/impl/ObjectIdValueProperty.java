package com.fasterxml.jackson.databind.deser.impl;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.PropertyMetadata;
import com.fasterxml.jackson.databind.PropertyName;
import com.fasterxml.jackson.databind.deser.SettableBeanProperty;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import java.lang.annotation.Annotation;

public final class ObjectIdValueProperty extends SettableBeanProperty {
    private static final long serialVersionUID = 1;
    protected final ObjectIdReader _objectIdReader;

    public ObjectIdValueProperty(ObjectIdReader objectIdReader, PropertyMetadata propertyMetadata) {
        super(objectIdReader.propertyName, objectIdReader.getIdType(), propertyMetadata, objectIdReader.getDeserializer());
        this._objectIdReader = objectIdReader;
    }

    public void deserializeAndSet(JsonParser jsonParser, DeserializationContext deserializationContext, Object obj) {
        deserializeSetAndReturn(jsonParser, deserializationContext, obj);
    }

    public Object deserializeSetAndReturn(JsonParser jsonParser, DeserializationContext deserializationContext, Object obj) {
        if (jsonParser.hasToken(JsonToken.VALUE_NULL)) {
            return null;
        }
        Object deserialize = this._valueDeserializer.deserialize(jsonParser, deserializationContext);
        ObjectIdReader objectIdReader = this._objectIdReader;
        deserializationContext.findObjectId(deserialize, objectIdReader.generator, objectIdReader.resolver).bindItem(obj);
        SettableBeanProperty settableBeanProperty = this._objectIdReader.idProperty;
        if (settableBeanProperty != null) {
            return settableBeanProperty.setAndReturn(obj, deserialize);
        }
        return obj;
    }

    public <A extends Annotation> A getAnnotation(Class<A> cls) {
        return null;
    }

    public AnnotatedMember getMember() {
        return null;
    }

    public void set(Object obj, Object obj2) {
        setAndReturn(obj, obj2);
    }

    public Object setAndReturn(Object obj, Object obj2) {
        SettableBeanProperty settableBeanProperty = this._objectIdReader.idProperty;
        if (settableBeanProperty != null) {
            return settableBeanProperty.setAndReturn(obj, obj2);
        }
        throw new UnsupportedOperationException("Should not call set() on ObjectIdProperty that has no SettableBeanProperty");
    }

    public ObjectIdValueProperty withName(PropertyName propertyName) {
        return new ObjectIdValueProperty(this, propertyName);
    }

    public ObjectIdValueProperty withValueDeserializer(JsonDeserializer<?> jsonDeserializer) {
        if (this._valueDeserializer == jsonDeserializer) {
            return this;
        }
        return new ObjectIdValueProperty(this, jsonDeserializer);
    }

    protected ObjectIdValueProperty(ObjectIdValueProperty objectIdValueProperty, JsonDeserializer<?> jsonDeserializer) {
        super((SettableBeanProperty) objectIdValueProperty, jsonDeserializer);
        this._objectIdReader = objectIdValueProperty._objectIdReader;
    }

    protected ObjectIdValueProperty(ObjectIdValueProperty objectIdValueProperty, PropertyName propertyName) {
        super((SettableBeanProperty) objectIdValueProperty, propertyName);
        this._objectIdReader = objectIdValueProperty._objectIdReader;
    }
}
