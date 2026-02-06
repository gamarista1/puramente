package com.fasterxml.jackson.databind.ser;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.PropertyMetadata;
import com.fasterxml.jackson.databind.PropertyName;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition;
import com.fasterxml.jackson.databind.introspect.ConcreteBeanPropertyBase;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonObjectFormatVisitor;
import com.fasterxml.jackson.databind.node.ObjectNode;
import java.io.Serializable;
import java.lang.annotation.Annotation;

public abstract class PropertyWriter extends ConcreteBeanPropertyBase implements Serializable {
    private static final long serialVersionUID = 1;

    protected PropertyWriter(PropertyMetadata propertyMetadata) {
        super(propertyMetadata);
    }

    public abstract void depositSchemaProperty(JsonObjectFormatVisitor jsonObjectFormatVisitor, SerializerProvider serializerProvider);

    @Deprecated
    public abstract void depositSchemaProperty(ObjectNode objectNode, SerializerProvider serializerProvider);

    public <A extends Annotation> A findAnnotation(Class<A> cls) {
        A annotation = getAnnotation(cls);
        if (annotation == null) {
            return getContextAnnotation(cls);
        }
        return annotation;
    }

    public abstract <A extends Annotation> A getAnnotation(Class<A> cls);

    public abstract <A extends Annotation> A getContextAnnotation(Class<A> cls);

    public abstract PropertyName getFullName();

    public abstract String getName();

    public abstract void serializeAsElement(Object obj, JsonGenerator jsonGenerator, SerializerProvider serializerProvider);

    public abstract void serializeAsField(Object obj, JsonGenerator jsonGenerator, SerializerProvider serializerProvider);

    public abstract void serializeAsOmittedField(Object obj, JsonGenerator jsonGenerator, SerializerProvider serializerProvider);

    public abstract void serializeAsPlaceholder(Object obj, JsonGenerator jsonGenerator, SerializerProvider serializerProvider);

    protected PropertyWriter(BeanPropertyDefinition beanPropertyDefinition) {
        super(beanPropertyDefinition.getMetadata());
    }

    protected PropertyWriter(PropertyWriter propertyWriter) {
        super((ConcreteBeanPropertyBase) propertyWriter);
    }
}
