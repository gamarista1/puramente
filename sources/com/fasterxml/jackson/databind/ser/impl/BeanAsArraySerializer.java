package com.fasterxml.jackson.databind.ser.impl;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;
import com.fasterxml.jackson.databind.ser.BeanPropertyWriter;
import com.fasterxml.jackson.databind.ser.std.BeanSerializerBase;
import com.fasterxml.jackson.databind.util.NameTransformer;
import java.util.Set;

public class BeanAsArraySerializer extends BeanSerializerBase {
    private static final long serialVersionUID = 1;
    protected final BeanSerializerBase _defaultSerializer;

    public BeanAsArraySerializer(BeanSerializerBase beanSerializerBase) {
        super(beanSerializerBase, (ObjectIdWriter) null);
        this._defaultSerializer = beanSerializerBase;
    }

    private boolean hasSingleElement(SerializerProvider serializerProvider) {
        BeanPropertyWriter[] beanPropertyWriterArr;
        if (this._filteredProps == null || serializerProvider.getActiveView() == null) {
            beanPropertyWriterArr = this._props;
        } else {
            beanPropertyWriterArr = this._filteredProps;
        }
        if (beanPropertyWriterArr.length == 1) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public BeanSerializerBase asArraySerializer() {
        return this;
    }

    public boolean isUnwrappingSerializer() {
        return false;
    }

    public final void serialize(Object obj, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) {
        if (!serializerProvider.isEnabled(SerializationFeature.WRITE_SINGLE_ELEM_ARRAYS_UNWRAPPED) || !hasSingleElement(serializerProvider)) {
            jsonGenerator.writeStartArray();
            jsonGenerator.setCurrentValue(obj);
            serializeAsArray(obj, jsonGenerator, serializerProvider);
            jsonGenerator.writeEndArray();
            return;
        }
        serializeAsArray(obj, jsonGenerator, serializerProvider);
    }

    /* access modifiers changed from: protected */
    public final void serializeAsArray(Object obj, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) {
        BeanPropertyWriter[] beanPropertyWriterArr;
        String str = "[anySetter]";
        if (this._filteredProps == null || serializerProvider.getActiveView() == null) {
            beanPropertyWriterArr = this._props;
        } else {
            beanPropertyWriterArr = this._filteredProps;
        }
        try {
            for (BeanPropertyWriter beanPropertyWriter : beanPropertyWriterArr) {
                if (beanPropertyWriter == null) {
                    jsonGenerator.writeNull();
                } else {
                    beanPropertyWriter.serializeAsElement(obj, jsonGenerator, serializerProvider);
                }
            }
        } catch (Exception e10) {
            if (0 != beanPropertyWriterArr.length) {
                str = beanPropertyWriterArr[0].getName();
            }
            wrapAndThrow(serializerProvider, (Throwable) e10, obj, str);
        } catch (StackOverflowError e11) {
            JsonMappingException from = JsonMappingException.from(jsonGenerator, "Infinite recursion (StackOverflowError)", (Throwable) e11);
            if (0 != beanPropertyWriterArr.length) {
                str = beanPropertyWriterArr[0].getName();
            }
            from.prependPath(new JsonMappingException.Reference(obj, str));
            throw from;
        }
    }

    public void serializeWithType(Object obj, JsonGenerator jsonGenerator, SerializerProvider serializerProvider, TypeSerializer typeSerializer) {
        String str;
        if (this._objectIdWriter != null) {
            _serializeWithObjectId(obj, jsonGenerator, serializerProvider, typeSerializer);
            return;
        }
        if (this._typeId == null) {
            str = null;
        } else {
            str = _customTypeId(obj);
        }
        if (str == null) {
            typeSerializer.writeTypePrefixForArray(obj, jsonGenerator);
        } else {
            typeSerializer.writeCustomTypePrefixForArray(obj, jsonGenerator, str);
        }
        serializeAsArray(obj, jsonGenerator, serializerProvider);
        if (str == null) {
            typeSerializer.writeTypeSuffixForArray(obj, jsonGenerator);
        } else {
            typeSerializer.writeCustomTypeSuffixForArray(obj, jsonGenerator, str);
        }
    }

    public String toString() {
        return "BeanAsArraySerializer for " + handledType().getName();
    }

    public JsonSerializer<Object> unwrappingSerializer(NameTransformer nameTransformer) {
        return this._defaultSerializer.unwrappingSerializer(nameTransformer);
    }

    public BeanSerializerBase withObjectIdWriter(ObjectIdWriter objectIdWriter) {
        return this._defaultSerializer.withObjectIdWriter(objectIdWriter);
    }

    public BeanSerializerBase withFilterId(Object obj) {
        return new BeanAsArraySerializer(this, this._objectIdWriter, obj);
    }

    /* access modifiers changed from: protected */
    public BeanAsArraySerializer withIgnorals(Set<String> set) {
        return new BeanAsArraySerializer(this, set);
    }

    protected BeanAsArraySerializer(BeanSerializerBase beanSerializerBase, Set<String> set) {
        super(beanSerializerBase, set);
        this._defaultSerializer = beanSerializerBase;
    }

    protected BeanAsArraySerializer(BeanSerializerBase beanSerializerBase, ObjectIdWriter objectIdWriter, Object obj) {
        super(beanSerializerBase, objectIdWriter, obj);
        this._defaultSerializer = beanSerializerBase;
    }
}
