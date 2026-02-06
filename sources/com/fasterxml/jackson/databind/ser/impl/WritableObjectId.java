package com.fasterxml.jackson.databind.ser.impl;

import com.fasterxml.jackson.annotation.ObjectIdGenerator;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.SerializableString;
import com.fasterxml.jackson.databind.SerializerProvider;

public final class WritableObjectId {
    public final ObjectIdGenerator<?> generator;

    /* renamed from: id  reason: collision with root package name */
    public Object f42711id;
    protected boolean idWritten = false;

    public WritableObjectId(ObjectIdGenerator<?> objectIdGenerator) {
        this.generator = objectIdGenerator;
    }

    public Object generateId(Object obj) {
        if (this.f42711id == null) {
            this.f42711id = this.generator.generateId(obj);
        }
        return this.f42711id;
    }

    public void writeAsField(JsonGenerator jsonGenerator, SerializerProvider serializerProvider, ObjectIdWriter objectIdWriter) {
        this.idWritten = true;
        if (jsonGenerator.canWriteObjectId()) {
            jsonGenerator.writeObjectId(String.valueOf(this.f42711id));
            return;
        }
        SerializableString serializableString = objectIdWriter.propertyName;
        if (serializableString != null) {
            jsonGenerator.writeFieldName(serializableString);
            objectIdWriter.serializer.serialize(this.f42711id, jsonGenerator, serializerProvider);
        }
    }

    public boolean writeAsId(JsonGenerator jsonGenerator, SerializerProvider serializerProvider, ObjectIdWriter objectIdWriter) {
        if (this.f42711id == null) {
            return false;
        }
        if (!this.idWritten && !objectIdWriter.alwaysAsId) {
            return false;
        }
        if (jsonGenerator.canWriteObjectId()) {
            jsonGenerator.writeObjectRef(String.valueOf(this.f42711id));
            return true;
        }
        objectIdWriter.serializer.serialize(this.f42711id, jsonGenerator, serializerProvider);
        return true;
    }
}
