package com.fasterxml.jackson.databind.jsontype.impl;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.jsontype.TypeIdResolver;

public class AsExistingPropertyTypeSerializer extends AsPropertyTypeSerializer {
    public AsExistingPropertyTypeSerializer(TypeIdResolver typeIdResolver, BeanProperty beanProperty, String str) {
        super(typeIdResolver, beanProperty, str);
    }

    public JsonTypeInfo.As getTypeInclusion() {
        return JsonTypeInfo.As.EXISTING_PROPERTY;
    }

    public void writeCustomTypePrefixForObject(Object obj, JsonGenerator jsonGenerator, String str) {
        if (str != null && jsonGenerator.canWriteTypeId()) {
            jsonGenerator.writeTypeId(str);
        }
        jsonGenerator.writeStartObject();
    }

    public void writeTypePrefixForObject(Object obj, JsonGenerator jsonGenerator) {
        String idFromValue = idFromValue(obj);
        if (idFromValue != null && jsonGenerator.canWriteTypeId()) {
            jsonGenerator.writeTypeId(idFromValue);
        }
        jsonGenerator.writeStartObject();
    }

    public AsExistingPropertyTypeSerializer forProperty(BeanProperty beanProperty) {
        return this._property == beanProperty ? this : new AsExistingPropertyTypeSerializer(this._idResolver, beanProperty, this._typePropertyName);
    }

    public void writeTypePrefixForObject(Object obj, JsonGenerator jsonGenerator, Class<?> cls) {
        String idFromValueAndType = idFromValueAndType(obj, cls);
        if (idFromValueAndType != null && jsonGenerator.canWriteTypeId()) {
            jsonGenerator.writeTypeId(idFromValueAndType);
        }
        jsonGenerator.writeStartObject();
    }
}
