package com.fasterxml.jackson.databind.ser.impl;

import com.fasterxml.jackson.annotation.ObjectIdGenerator;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import com.fasterxml.jackson.databind.introspect.ObjectIdInfo;
import com.fasterxml.jackson.databind.ser.BeanPropertyWriter;

public class PropertyBasedObjectIdGenerator extends ObjectIdGenerators.PropertyGenerator {
    private static final long serialVersionUID = 1;
    protected final BeanPropertyWriter _property;

    public PropertyBasedObjectIdGenerator(ObjectIdInfo objectIdInfo, BeanPropertyWriter beanPropertyWriter) {
        this(objectIdInfo.getScope(), beanPropertyWriter);
    }

    public boolean canUseFor(ObjectIdGenerator<?> objectIdGenerator) {
        if (objectIdGenerator.getClass() != getClass()) {
            return false;
        }
        PropertyBasedObjectIdGenerator propertyBasedObjectIdGenerator = (PropertyBasedObjectIdGenerator) objectIdGenerator;
        if (propertyBasedObjectIdGenerator.getScope() == this._scope && propertyBasedObjectIdGenerator._property == this._property) {
            return true;
        }
        return false;
    }

    public ObjectIdGenerator<Object> forScope(Class<?> cls) {
        if (cls == this._scope) {
            return this;
        }
        return new PropertyBasedObjectIdGenerator(cls, this._property);
    }

    public Object generateId(Object obj) {
        try {
            return this._property.get(obj);
        } catch (RuntimeException e10) {
            throw e10;
        } catch (Exception e11) {
            throw new IllegalStateException("Problem accessing property '" + this._property.getName() + "': " + e11.getMessage(), e11);
        }
    }

    public ObjectIdGenerator.IdKey key(Object obj) {
        if (obj == null) {
            return null;
        }
        return new ObjectIdGenerator.IdKey(getClass(), this._scope, obj);
    }

    public ObjectIdGenerator<Object> newForSerialization(Object obj) {
        return this;
    }

    protected PropertyBasedObjectIdGenerator(Class<?> cls, BeanPropertyWriter beanPropertyWriter) {
        super(cls);
        this._property = beanPropertyWriter;
    }
}
