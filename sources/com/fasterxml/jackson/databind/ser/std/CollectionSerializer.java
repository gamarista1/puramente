package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;
import com.fasterxml.jackson.databind.ser.ContainerSerializer;
import com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap;
import java.util.Collection;
import java.util.Iterator;

public class CollectionSerializer extends AsArraySerializerBase<Collection<?>> {
    private static final long serialVersionUID = 1;

    public CollectionSerializer(JavaType javaType, boolean z10, TypeSerializer typeSerializer, JsonSerializer<Object> jsonSerializer) {
        super((Class<?>) Collection.class, javaType, z10, typeSerializer, jsonSerializer);
    }

    public ContainerSerializer<?> _withValueTypeSerializer(TypeSerializer typeSerializer) {
        return new CollectionSerializer(this, this._property, typeSerializer, (JsonSerializer<?>) this._elementSerializer, this._unwrapSingle);
    }

    public void serializeContentsUsing(Collection<?> collection, JsonGenerator jsonGenerator, SerializerProvider serializerProvider, JsonSerializer<Object> jsonSerializer) {
        Iterator<?> it = collection.iterator();
        if (it.hasNext()) {
            TypeSerializer typeSerializer = this._valueTypeSerializer;
            int i10 = 0;
            do {
                Object next = it.next();
                if (next == null) {
                    try {
                        serializerProvider.defaultSerializeNull(jsonGenerator);
                    } catch (Exception e10) {
                        wrapAndThrow(serializerProvider, (Throwable) e10, (Object) collection, i10);
                    }
                } else if (typeSerializer == null) {
                    jsonSerializer.serialize(next, jsonGenerator, serializerProvider);
                } else {
                    jsonSerializer.serializeWithType(next, jsonGenerator, serializerProvider, typeSerializer);
                }
                i10++;
            } while (it.hasNext());
        }
    }

    @Deprecated
    public CollectionSerializer(JavaType javaType, boolean z10, TypeSerializer typeSerializer, BeanProperty beanProperty, JsonSerializer<Object> jsonSerializer) {
        this(javaType, z10, typeSerializer, jsonSerializer);
    }

    public boolean hasSingleElement(Collection<?> collection) {
        Iterator<?> it = collection.iterator();
        if (!it.hasNext()) {
            return false;
        }
        it.next();
        return !it.hasNext();
    }

    public boolean isEmpty(SerializerProvider serializerProvider, Collection<?> collection) {
        return collection == null || collection.isEmpty();
    }

    public final void serialize(Collection<?> collection, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) {
        int size = collection.size();
        if (size != 1 || ((this._unwrapSingle != null || !serializerProvider.isEnabled(SerializationFeature.WRITE_SINGLE_ELEM_ARRAYS_UNWRAPPED)) && this._unwrapSingle != Boolean.TRUE)) {
            jsonGenerator.writeStartArray(size);
            serializeContents(collection, jsonGenerator, serializerProvider);
            jsonGenerator.writeEndArray();
            return;
        }
        serializeContents(collection, jsonGenerator, serializerProvider);
    }

    public void serializeContents(Collection<?> collection, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) {
        JsonSerializer<Object> _findAndAddDynamic;
        JsonSerializer<Object> jsonSerializer = this._elementSerializer;
        if (jsonSerializer != null) {
            serializeContentsUsing(collection, jsonGenerator, serializerProvider, jsonSerializer);
            return;
        }
        Iterator<?> it = collection.iterator();
        if (it.hasNext()) {
            PropertySerializerMap propertySerializerMap = this._dynamicSerializers;
            TypeSerializer typeSerializer = this._valueTypeSerializer;
            int i10 = 0;
            do {
                try {
                    Object next = it.next();
                    if (next == null) {
                        serializerProvider.defaultSerializeNull(jsonGenerator);
                    } else {
                        Class<?> cls = next.getClass();
                        JsonSerializer<Object> serializerFor = propertySerializerMap.serializerFor(cls);
                        if (serializerFor == null) {
                            if (this._elementType.hasGenericTypes()) {
                                _findAndAddDynamic = _findAndAddDynamic(propertySerializerMap, serializerProvider.constructSpecializedType(this._elementType, cls), serializerProvider);
                            } else {
                                _findAndAddDynamic = _findAndAddDynamic(propertySerializerMap, cls, serializerProvider);
                            }
                            serializerFor = _findAndAddDynamic;
                            propertySerializerMap = this._dynamicSerializers;
                        }
                        if (typeSerializer == null) {
                            serializerFor.serialize(next, jsonGenerator, serializerProvider);
                        } else {
                            serializerFor.serializeWithType(next, jsonGenerator, serializerProvider, typeSerializer);
                        }
                    }
                    i10++;
                } catch (Exception e10) {
                    wrapAndThrow(serializerProvider, (Throwable) e10, (Object) collection, i10);
                    return;
                }
            } while (it.hasNext());
        }
    }

    public CollectionSerializer withResolved(BeanProperty beanProperty, TypeSerializer typeSerializer, JsonSerializer<?> jsonSerializer, Boolean bool) {
        return new CollectionSerializer(this, beanProperty, typeSerializer, jsonSerializer, bool);
    }

    public CollectionSerializer(CollectionSerializer collectionSerializer, BeanProperty beanProperty, TypeSerializer typeSerializer, JsonSerializer<?> jsonSerializer, Boolean bool) {
        super((AsArraySerializerBase<?>) collectionSerializer, beanProperty, typeSerializer, jsonSerializer, bool);
    }
}
