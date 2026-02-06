package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.PropertyName;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonObjectFormatVisitor;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.fasterxml.jackson.databind.ser.PropertyWriter;
import com.fasterxml.jackson.databind.type.TypeFactory;
import java.lang.annotation.Annotation;

public class MapProperty extends PropertyWriter {
    private static final long serialVersionUID = 1;
    protected Object _key;
    protected JsonSerializer<Object> _keySerializer;
    protected final BeanProperty _property;
    protected final TypeSerializer _typeSerializer;
    protected JsonSerializer<Object> _valueSerializer;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public MapProperty(com.fasterxml.jackson.databind.jsontype.TypeSerializer r2, com.fasterxml.jackson.databind.BeanProperty r3) {
        /*
            r1 = this;
            if (r3 != 0) goto L_0x0005
            com.fasterxml.jackson.databind.PropertyMetadata r0 = com.fasterxml.jackson.databind.PropertyMetadata.STD_REQUIRED_OR_OPTIONAL
            goto L_0x0009
        L_0x0005:
            com.fasterxml.jackson.databind.PropertyMetadata r0 = r3.getMetadata()
        L_0x0009:
            r1.<init>((com.fasterxml.jackson.databind.PropertyMetadata) r0)
            r1._typeSerializer = r2
            r1._property = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.ser.std.MapProperty.<init>(com.fasterxml.jackson.databind.jsontype.TypeSerializer, com.fasterxml.jackson.databind.BeanProperty):void");
    }

    @Deprecated
    public void depositSchemaProperty(ObjectNode objectNode, SerializerProvider serializerProvider) {
    }

    public <A extends Annotation> A getAnnotation(Class<A> cls) {
        BeanProperty beanProperty = this._property;
        if (beanProperty == null) {
            return null;
        }
        return beanProperty.getAnnotation(cls);
    }

    public <A extends Annotation> A getContextAnnotation(Class<A> cls) {
        BeanProperty beanProperty = this._property;
        if (beanProperty == null) {
            return null;
        }
        return beanProperty.getContextAnnotation(cls);
    }

    public PropertyName getFullName() {
        return new PropertyName(getName());
    }

    public AnnotatedMember getMember() {
        BeanProperty beanProperty = this._property;
        if (beanProperty == null) {
            return null;
        }
        return beanProperty.getMember();
    }

    public String getName() {
        Object obj = this._key;
        if (obj instanceof String) {
            return (String) obj;
        }
        return String.valueOf(obj);
    }

    public JavaType getType() {
        BeanProperty beanProperty = this._property;
        if (beanProperty == null) {
            return TypeFactory.unknownType();
        }
        return beanProperty.getType();
    }

    public PropertyName getWrapperName() {
        BeanProperty beanProperty = this._property;
        if (beanProperty == null) {
            return null;
        }
        return beanProperty.getWrapperName();
    }

    public void reset(Object obj, JsonSerializer<Object> jsonSerializer, JsonSerializer<Object> jsonSerializer2) {
        this._key = obj;
        this._keySerializer = jsonSerializer;
        this._valueSerializer = jsonSerializer2;
    }

    public void serializeAsElement(Object obj, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) {
        TypeSerializer typeSerializer = this._typeSerializer;
        if (typeSerializer == null) {
            this._valueSerializer.serialize(obj, jsonGenerator, serializerProvider);
        } else {
            this._valueSerializer.serializeWithType(obj, jsonGenerator, serializerProvider, typeSerializer);
        }
    }

    public void serializeAsField(Object obj, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) {
        this._keySerializer.serialize(this._key, jsonGenerator, serializerProvider);
        TypeSerializer typeSerializer = this._typeSerializer;
        if (typeSerializer == null) {
            this._valueSerializer.serialize(obj, jsonGenerator, serializerProvider);
        } else {
            this._valueSerializer.serializeWithType(obj, jsonGenerator, serializerProvider, typeSerializer);
        }
    }

    public void serializeAsOmittedField(Object obj, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) {
        if (!jsonGenerator.canOmitFields()) {
            jsonGenerator.writeOmittedField(getName());
        }
    }

    public void serializeAsPlaceholder(Object obj, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) {
        jsonGenerator.writeNull();
    }

    public void depositSchemaProperty(JsonObjectFormatVisitor jsonObjectFormatVisitor, SerializerProvider serializerProvider) {
        BeanProperty beanProperty = this._property;
        if (beanProperty != null) {
            beanProperty.depositSchemaProperty(jsonObjectFormatVisitor, serializerProvider);
        }
    }
}
