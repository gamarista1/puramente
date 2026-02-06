package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonArrayFormatVisitor;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitable;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonIntegerFormatVisitor;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonNumberFormatVisitor;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonStringFormatVisitor;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonValueFormat;
import com.fasterxml.jackson.databind.jsonschema.SchemaAware;
import com.fasterxml.jackson.databind.node.JsonNodeFactory;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.fasterxml.jackson.databind.ser.FilterProvider;
import com.fasterxml.jackson.databind.ser.PropertyFilter;
import com.fasterxml.jackson.databind.util.ClassUtil;
import com.fasterxml.jackson.databind.util.Converter;
import java.io.IOException;
import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Type;

public abstract class StdSerializer<T> extends JsonSerializer<T> implements JsonFormatVisitable, SchemaAware, Serializable {
    private static final Object CONVERTING_CONTENT_CONVERTER_LOCK = new Object();
    private static final long serialVersionUID = 1;
    protected final Class<T> _handledType;

    protected StdSerializer(Class<T> cls) {
        this._handledType = cls;
    }

    public void acceptJsonFormatVisitor(JsonFormatVisitorWrapper jsonFormatVisitorWrapper, JavaType javaType) {
        jsonFormatVisitorWrapper.expectAnyFormat(javaType);
    }

    /* access modifiers changed from: protected */
    public ObjectNode createObjectNode() {
        return JsonNodeFactory.instance.objectNode();
    }

    /* access modifiers changed from: protected */
    public ObjectNode createSchemaNode(String str) {
        ObjectNode createObjectNode = createObjectNode();
        createObjectNode.put("type", str);
        return createObjectNode;
    }

    /* access modifiers changed from: protected */
    public JsonSerializer<?> findAnnotatedContentSerializer(SerializerProvider serializerProvider, BeanProperty beanProperty) {
        Object findContentSerializer;
        if (beanProperty == null) {
            return null;
        }
        AnnotatedMember member = beanProperty.getMember();
        AnnotationIntrospector annotationIntrospector = serializerProvider.getAnnotationIntrospector();
        if (member == null || (findContentSerializer = annotationIntrospector.findContentSerializer(member)) == null) {
            return null;
        }
        return serializerProvider.serializerInstance(member, findContentSerializer);
    }

    /* access modifiers changed from: protected */
    public JsonSerializer<?> findConvertingContentSerializer(SerializerProvider serializerProvider, BeanProperty beanProperty, JsonSerializer<?> jsonSerializer) {
        AnnotationIntrospector annotationIntrospector;
        AnnotatedMember member;
        Object obj = CONVERTING_CONTENT_CONVERTER_LOCK;
        Object attribute = serializerProvider.getAttribute(obj);
        if (!((attribute != null && attribute == Boolean.TRUE) || (annotationIntrospector = serializerProvider.getAnnotationIntrospector()) == null || beanProperty == null || (member = beanProperty.getMember()) == null)) {
            serializerProvider.setAttribute(obj, (Object) Boolean.TRUE);
            try {
                Object findSerializationContentConverter = annotationIntrospector.findSerializationContentConverter(member);
                serializerProvider.setAttribute(obj, (Object) null);
                if (findSerializationContentConverter != null) {
                    Converter<Object, Object> converterInstance = serializerProvider.converterInstance(beanProperty.getMember(), findSerializationContentConverter);
                    JavaType outputType = converterInstance.getOutputType(serializerProvider.getTypeFactory());
                    JsonSerializer<Object> jsonSerializer2 = jsonSerializer;
                    if (jsonSerializer == null) {
                        jsonSerializer2 = jsonSerializer;
                        if (!outputType.isJavaLangObject()) {
                            jsonSerializer2 = serializerProvider.findValueSerializer(outputType);
                        }
                    }
                    return new StdDelegatingSerializer(converterInstance, outputType, jsonSerializer2);
                }
            } catch (Throwable th2) {
                serializerProvider.setAttribute(CONVERTING_CONTENT_CONVERTER_LOCK, (Object) null);
                throw th2;
            }
        }
        return jsonSerializer;
    }

    /* access modifiers changed from: protected */
    public Boolean findFormatFeature(SerializerProvider serializerProvider, BeanProperty beanProperty, Class<?> cls, JsonFormat.Feature feature) {
        JsonFormat.Value findFormatOverrides = findFormatOverrides(serializerProvider, beanProperty, cls);
        if (findFormatOverrides != null) {
            return findFormatOverrides.getFeature(feature);
        }
        return null;
    }

    /* access modifiers changed from: protected */
    public JsonFormat.Value findFormatOverrides(SerializerProvider serializerProvider, BeanProperty beanProperty, Class<?> cls) {
        if (beanProperty != null) {
            return beanProperty.findPropertyFormat(serializerProvider.getConfig(), cls);
        }
        return serializerProvider.getDefaultPropertyFormat(cls);
    }

    /* access modifiers changed from: protected */
    public JsonInclude.Value findIncludeOverrides(SerializerProvider serializerProvider, BeanProperty beanProperty, Class<?> cls) {
        if (beanProperty != null) {
            return beanProperty.findPropertyInclusion(serializerProvider.getConfig(), cls);
        }
        return serializerProvider.getDefaultPropertyInclusion(cls);
    }

    /* access modifiers changed from: protected */
    public PropertyFilter findPropertyFilter(SerializerProvider serializerProvider, Object obj, Object obj2) {
        FilterProvider filterProvider = serializerProvider.getFilterProvider();
        if (filterProvider != null) {
            return filterProvider.findPropertyFilter(obj, obj2);
        }
        throw JsonMappingException.from(serializerProvider, "Can not resolve PropertyFilter with id '" + obj + "'; no FilterProvider configured");
    }

    public JsonNode getSchema(SerializerProvider serializerProvider, Type type) {
        return createSchemaNode("string");
    }

    public Class<T> handledType() {
        return this._handledType;
    }

    /* access modifiers changed from: protected */
    public boolean isDefaultSerializer(JsonSerializer<?> jsonSerializer) {
        return ClassUtil.isJacksonStdImpl((Object) jsonSerializer);
    }

    public abstract void serialize(T t10, JsonGenerator jsonGenerator, SerializerProvider serializerProvider);

    /* access modifiers changed from: protected */
    public void visitArrayFormat(JsonFormatVisitorWrapper jsonFormatVisitorWrapper, JavaType javaType, JsonSerializer<?> jsonSerializer, JavaType javaType2) {
        JsonArrayFormatVisitor expectArrayFormat;
        if (jsonFormatVisitorWrapper != null && (expectArrayFormat = jsonFormatVisitorWrapper.expectArrayFormat(javaType)) != null && jsonSerializer != null) {
            expectArrayFormat.itemsFormat(jsonSerializer, javaType2);
        }
    }

    /* access modifiers changed from: protected */
    public void visitFloatFormat(JsonFormatVisitorWrapper jsonFormatVisitorWrapper, JavaType javaType, JsonParser.NumberType numberType) {
        JsonNumberFormatVisitor expectNumberFormat;
        if (jsonFormatVisitorWrapper != null && (expectNumberFormat = jsonFormatVisitorWrapper.expectNumberFormat(javaType)) != null) {
            expectNumberFormat.numberType(numberType);
        }
    }

    /* access modifiers changed from: protected */
    public void visitIntFormat(JsonFormatVisitorWrapper jsonFormatVisitorWrapper, JavaType javaType, JsonParser.NumberType numberType) {
        JsonIntegerFormatVisitor expectIntegerFormat;
        if (jsonFormatVisitorWrapper != null && (expectIntegerFormat = jsonFormatVisitorWrapper.expectIntegerFormat(javaType)) != null && numberType != null) {
            expectIntegerFormat.numberType(numberType);
        }
    }

    /* access modifiers changed from: protected */
    public void visitStringFormat(JsonFormatVisitorWrapper jsonFormatVisitorWrapper, JavaType javaType) {
        if (jsonFormatVisitorWrapper != null) {
            jsonFormatVisitorWrapper.expectStringFormat(javaType);
        }
    }

    public void wrapAndThrow(SerializerProvider serializerProvider, Throwable th2, Object obj, String str) {
        while ((th2 instanceof InvocationTargetException) && th2.getCause() != null) {
            th2 = th2.getCause();
        }
        if (!(th2 instanceof Error)) {
            boolean z10 = serializerProvider == null || serializerProvider.isEnabled(SerializationFeature.WRAP_EXCEPTIONS);
            if (th2 instanceof IOException) {
                if (!z10 || !(th2 instanceof JsonMappingException)) {
                    throw ((IOException) th2);
                }
            } else if (!z10 && (th2 instanceof RuntimeException)) {
                throw ((RuntimeException) th2);
            }
            throw JsonMappingException.wrapWithPath(th2, obj, str);
        }
        throw ((Error) th2);
    }

    public JsonNode getSchema(SerializerProvider serializerProvider, Type type, boolean z10) {
        ObjectNode objectNode = (ObjectNode) getSchema(serializerProvider, type);
        if (!z10) {
            objectNode.put("required", !z10);
        }
        return objectNode;
    }

    /* access modifiers changed from: protected */
    public void visitStringFormat(JsonFormatVisitorWrapper jsonFormatVisitorWrapper, JavaType javaType, JsonValueFormat jsonValueFormat) {
        JsonStringFormatVisitor expectStringFormat;
        if (jsonFormatVisitorWrapper != null && (expectStringFormat = jsonFormatVisitorWrapper.expectStringFormat(javaType)) != null) {
            expectStringFormat.format(jsonValueFormat);
        }
    }

    protected StdSerializer(JavaType javaType) {
        this._handledType = javaType.getRawClass();
    }

    /* access modifiers changed from: protected */
    public ObjectNode createSchemaNode(String str, boolean z10) {
        ObjectNode createSchemaNode = createSchemaNode(str);
        if (!z10) {
            createSchemaNode.put("required", !z10);
        }
        return createSchemaNode;
    }

    /* access modifiers changed from: protected */
    public void visitArrayFormat(JsonFormatVisitorWrapper jsonFormatVisitorWrapper, JavaType javaType, JsonFormatTypes jsonFormatTypes) {
        JsonArrayFormatVisitor expectArrayFormat;
        if (jsonFormatVisitorWrapper != null && (expectArrayFormat = jsonFormatVisitorWrapper.expectArrayFormat(javaType)) != null) {
            expectArrayFormat.itemsFormat(jsonFormatTypes);
        }
    }

    /* access modifiers changed from: protected */
    public void visitIntFormat(JsonFormatVisitorWrapper jsonFormatVisitorWrapper, JavaType javaType, JsonParser.NumberType numberType, JsonValueFormat jsonValueFormat) {
        JsonIntegerFormatVisitor expectIntegerFormat;
        if (jsonFormatVisitorWrapper != null && (expectIntegerFormat = jsonFormatVisitorWrapper.expectIntegerFormat(javaType)) != null) {
            if (numberType != null) {
                expectIntegerFormat.numberType(numberType);
            }
            if (jsonValueFormat != null) {
                expectIntegerFormat.format(jsonValueFormat);
            }
        }
    }

    protected StdSerializer(Class<?> cls, boolean z10) {
        this._handledType = cls;
    }

    protected StdSerializer(StdSerializer<?> stdSerializer) {
        this._handledType = stdSerializer._handledType;
    }

    public void wrapAndThrow(SerializerProvider serializerProvider, Throwable th2, Object obj, int i10) {
        while ((th2 instanceof InvocationTargetException) && th2.getCause() != null) {
            th2 = th2.getCause();
        }
        if (!(th2 instanceof Error)) {
            boolean z10 = serializerProvider == null || serializerProvider.isEnabled(SerializationFeature.WRAP_EXCEPTIONS);
            if (th2 instanceof IOException) {
                if (!z10 || !(th2 instanceof JsonMappingException)) {
                    throw ((IOException) th2);
                }
            } else if (!z10 && (th2 instanceof RuntimeException)) {
                throw ((RuntimeException) th2);
            }
            throw JsonMappingException.wrapWithPath(th2, obj, i10);
        }
        throw ((Error) th2);
    }
}
