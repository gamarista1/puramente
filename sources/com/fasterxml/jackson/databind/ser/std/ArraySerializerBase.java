package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;
import com.fasterxml.jackson.databind.ser.ContainerSerializer;
import com.fasterxml.jackson.databind.ser.ContextualSerializer;

public abstract class ArraySerializerBase<T> extends ContainerSerializer<T> implements ContextualSerializer {
    protected final BeanProperty _property;
    protected final Boolean _unwrapSingle;

    protected ArraySerializerBase(Class<T> cls) {
        super(cls);
        this._property = null;
        this._unwrapSingle = null;
    }

    public abstract JsonSerializer<?> _withResolved(BeanProperty beanProperty, Boolean bool);

    public JsonSerializer<?> createContextual(SerializerProvider serializerProvider, BeanProperty beanProperty) {
        JsonFormat.Value findFormatOverrides;
        Boolean feature;
        if (beanProperty == null || (findFormatOverrides = findFormatOverrides(serializerProvider, beanProperty, handledType())) == null || (feature = findFormatOverrides.getFeature(JsonFormat.Feature.WRITE_SINGLE_ELEM_ARRAYS_UNWRAPPED)) == this._unwrapSingle) {
            return this;
        }
        return _withResolved(beanProperty, feature);
    }

    public void serialize(T t10, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) {
        if (((this._unwrapSingle != null || !serializerProvider.isEnabled(SerializationFeature.WRITE_SINGLE_ELEM_ARRAYS_UNWRAPPED)) && this._unwrapSingle != Boolean.TRUE) || !hasSingleElement(t10)) {
            jsonGenerator.setCurrentValue(t10);
            jsonGenerator.writeStartArray();
            serializeContents(t10, jsonGenerator, serializerProvider);
            jsonGenerator.writeEndArray();
            return;
        }
        serializeContents(t10, jsonGenerator, serializerProvider);
    }

    /* access modifiers changed from: protected */
    public abstract void serializeContents(T t10, JsonGenerator jsonGenerator, SerializerProvider serializerProvider);

    public final void serializeWithType(T t10, JsonGenerator jsonGenerator, SerializerProvider serializerProvider, TypeSerializer typeSerializer) {
        typeSerializer.writeTypePrefixForArray(t10, jsonGenerator);
        jsonGenerator.setCurrentValue(t10);
        serializeContents(t10, jsonGenerator, serializerProvider);
        typeSerializer.writeTypeSuffixForArray(t10, jsonGenerator);
    }

    @Deprecated
    protected ArraySerializerBase(Class<T> cls, BeanProperty beanProperty) {
        super(cls);
        this._property = beanProperty;
        this._unwrapSingle = null;
    }

    protected ArraySerializerBase(ArraySerializerBase<?> arraySerializerBase) {
        super(arraySerializerBase._handledType, false);
        this._property = arraySerializerBase._property;
        this._unwrapSingle = arraySerializerBase._unwrapSingle;
    }

    protected ArraySerializerBase(ArraySerializerBase<?> arraySerializerBase, BeanProperty beanProperty, Boolean bool) {
        super(arraySerializerBase._handledType, false);
        this._property = beanProperty;
        this._unwrapSingle = bool;
    }

    @Deprecated
    protected ArraySerializerBase(ArraySerializerBase<?> arraySerializerBase, BeanProperty beanProperty) {
        super(arraySerializerBase._handledType, false);
        this._property = beanProperty;
        this._unwrapSingle = arraySerializerBase._unwrapSingle;
    }
}
