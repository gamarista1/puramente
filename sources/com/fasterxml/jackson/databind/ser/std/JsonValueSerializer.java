package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.annotation.JacksonStdImpl;
import com.fasterxml.jackson.databind.introspect.AnnotatedMethod;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitable;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonStringFormatVisitor;
import com.fasterxml.jackson.databind.jsonschema.JsonSchema;
import com.fasterxml.jackson.databind.jsonschema.SchemaAware;
import com.fasterxml.jackson.databind.jsontype.TypeIdResolver;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;
import com.fasterxml.jackson.databind.ser.ContextualSerializer;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Type;
import java.util.LinkedHashSet;

@JacksonStdImpl
public class JsonValueSerializer extends StdSerializer<Object> implements ContextualSerializer, JsonFormatVisitable, SchemaAware {
    protected final AnnotatedMethod _accessorMethod;
    protected final boolean _forceTypeInformation;
    protected final BeanProperty _property;
    protected final JsonSerializer<Object> _valueSerializer;

    static class TypeSerializerRerouter extends TypeSerializer {
        protected final Object _forObject;
        protected final TypeSerializer _typeSerializer;

        public TypeSerializerRerouter(TypeSerializer typeSerializer, Object obj) {
            this._typeSerializer = typeSerializer;
            this._forObject = obj;
        }

        public TypeSerializer forProperty(BeanProperty beanProperty) {
            throw new UnsupportedOperationException();
        }

        public String getPropertyName() {
            return this._typeSerializer.getPropertyName();
        }

        public TypeIdResolver getTypeIdResolver() {
            return this._typeSerializer.getTypeIdResolver();
        }

        public JsonTypeInfo.As getTypeInclusion() {
            return this._typeSerializer.getTypeInclusion();
        }

        public void writeCustomTypePrefixForArray(Object obj, JsonGenerator jsonGenerator, String str) {
            this._typeSerializer.writeCustomTypePrefixForArray(this._forObject, jsonGenerator, str);
        }

        public void writeCustomTypePrefixForObject(Object obj, JsonGenerator jsonGenerator, String str) {
            this._typeSerializer.writeCustomTypePrefixForObject(this._forObject, jsonGenerator, str);
        }

        public void writeCustomTypePrefixForScalar(Object obj, JsonGenerator jsonGenerator, String str) {
            this._typeSerializer.writeCustomTypePrefixForScalar(this._forObject, jsonGenerator, str);
        }

        public void writeCustomTypeSuffixForArray(Object obj, JsonGenerator jsonGenerator, String str) {
            this._typeSerializer.writeCustomTypeSuffixForArray(this._forObject, jsonGenerator, str);
        }

        public void writeCustomTypeSuffixForObject(Object obj, JsonGenerator jsonGenerator, String str) {
            this._typeSerializer.writeCustomTypeSuffixForObject(this._forObject, jsonGenerator, str);
        }

        public void writeCustomTypeSuffixForScalar(Object obj, JsonGenerator jsonGenerator, String str) {
            this._typeSerializer.writeCustomTypeSuffixForScalar(this._forObject, jsonGenerator, str);
        }

        public void writeTypePrefixForArray(Object obj, JsonGenerator jsonGenerator) {
            this._typeSerializer.writeTypePrefixForArray(this._forObject, jsonGenerator);
        }

        public void writeTypePrefixForObject(Object obj, JsonGenerator jsonGenerator) {
            this._typeSerializer.writeTypePrefixForObject(this._forObject, jsonGenerator);
        }

        public void writeTypePrefixForScalar(Object obj, JsonGenerator jsonGenerator) {
            this._typeSerializer.writeTypePrefixForScalar(this._forObject, jsonGenerator);
        }

        public void writeTypeSuffixForArray(Object obj, JsonGenerator jsonGenerator) {
            this._typeSerializer.writeTypeSuffixForArray(this._forObject, jsonGenerator);
        }

        public void writeTypeSuffixForObject(Object obj, JsonGenerator jsonGenerator) {
            this._typeSerializer.writeTypeSuffixForObject(this._forObject, jsonGenerator);
        }

        public void writeTypeSuffixForScalar(Object obj, JsonGenerator jsonGenerator) {
            this._typeSerializer.writeTypeSuffixForScalar(this._forObject, jsonGenerator);
        }

        public void writeTypePrefixForArray(Object obj, JsonGenerator jsonGenerator, Class<?> cls) {
            this._typeSerializer.writeTypePrefixForArray(this._forObject, jsonGenerator, cls);
        }

        public void writeTypePrefixForObject(Object obj, JsonGenerator jsonGenerator, Class<?> cls) {
            this._typeSerializer.writeTypePrefixForObject(this._forObject, jsonGenerator, cls);
        }

        public void writeTypePrefixForScalar(Object obj, JsonGenerator jsonGenerator, Class<?> cls) {
            this._typeSerializer.writeTypePrefixForScalar(this._forObject, jsonGenerator, cls);
        }
    }

    public JsonValueSerializer(AnnotatedMethod annotatedMethod, JsonSerializer<?> jsonSerializer) {
        super(annotatedMethod.getType());
        this._accessorMethod = annotatedMethod;
        this._valueSerializer = jsonSerializer;
        this._property = null;
        this._forceTypeInformation = true;
    }

    private static final Class<Object> _notNullClass(Class<?> cls) {
        if (cls == null) {
            return Object.class;
        }
        return cls;
    }

    /* access modifiers changed from: protected */
    public boolean _acceptJsonFormatVisitorForEnum(JsonFormatVisitorWrapper jsonFormatVisitorWrapper, JavaType javaType, Class<?> cls) {
        JsonStringFormatVisitor expectStringFormat = jsonFormatVisitorWrapper.expectStringFormat(javaType);
        if (expectStringFormat == null) {
            return true;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Object[] enumConstants = cls.getEnumConstants();
        int length = enumConstants.length;
        int i10 = 0;
        while (i10 < length) {
            Object obj = enumConstants[i10];
            try {
                linkedHashSet.add(String.valueOf(this._accessorMethod.callOn(obj)));
                i10++;
            } catch (Exception e10) {
                e = e10;
                while ((e instanceof InvocationTargetException) && e.getCause() != null) {
                    e = e.getCause();
                }
                if (e instanceof Error) {
                    throw ((Error) e);
                }
                throw JsonMappingException.wrapWithPath(e, obj, this._accessorMethod.getName() + "()");
            }
        }
        expectStringFormat.enumTypes(linkedHashSet);
        return true;
    }

    public void acceptJsonFormatVisitor(JsonFormatVisitorWrapper jsonFormatVisitorWrapper, JavaType javaType) {
        JavaType type = this._accessorMethod.getType();
        Class<?> declaringClass = this._accessorMethod.getDeclaringClass();
        if (declaringClass == null || !declaringClass.isEnum() || !_acceptJsonFormatVisitorForEnum(jsonFormatVisitorWrapper, javaType, declaringClass)) {
            JsonSerializer<Object> jsonSerializer = this._valueSerializer;
            if (jsonSerializer == null && (jsonSerializer = jsonFormatVisitorWrapper.getProvider().findTypedValueSerializer(type, false, this._property)) == null) {
                jsonFormatVisitorWrapper.expectAnyFormat(javaType);
            } else {
                jsonSerializer.acceptJsonFormatVisitor(jsonFormatVisitorWrapper, (JavaType) null);
            }
        }
    }

    public JsonSerializer<?> createContextual(SerializerProvider serializerProvider, BeanProperty beanProperty) {
        JsonSerializer<Object> jsonSerializer = this._valueSerializer;
        if (jsonSerializer != null) {
            return withResolved(beanProperty, serializerProvider.handlePrimaryContextualization(jsonSerializer, beanProperty), this._forceTypeInformation);
        }
        JavaType type = this._accessorMethod.getType();
        if (!serializerProvider.isEnabled(MapperFeature.USE_STATIC_TYPING) && !type.isFinal()) {
            return this;
        }
        JsonSerializer<Object> findPrimaryPropertySerializer = serializerProvider.findPrimaryPropertySerializer(type, beanProperty);
        return withResolved(beanProperty, findPrimaryPropertySerializer, isNaturalTypeWithStdHandling(type.getRawClass(), findPrimaryPropertySerializer));
    }

    public JsonNode getSchema(SerializerProvider serializerProvider, Type type) {
        JsonSerializer<Object> jsonSerializer = this._valueSerializer;
        if (jsonSerializer instanceof SchemaAware) {
            return ((SchemaAware) jsonSerializer).getSchema(serializerProvider, (Type) null);
        }
        return JsonSchema.getDefaultSchemaNode();
    }

    /* access modifiers changed from: protected */
    public boolean isNaturalTypeWithStdHandling(Class<?> cls, JsonSerializer<?> jsonSerializer) {
        if (cls.isPrimitive()) {
            if (!(cls == Integer.TYPE || cls == Boolean.TYPE || cls == Double.TYPE)) {
                return false;
            }
        } else if (!(cls == String.class || cls == Integer.class || cls == Boolean.class || cls == Double.class)) {
            return false;
        }
        return isDefaultSerializer(jsonSerializer);
    }

    public void serialize(Object obj, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) {
        try {
            Object value = this._accessorMethod.getValue(obj);
            if (value == null) {
                serializerProvider.defaultSerializeNull(jsonGenerator);
                return;
            }
            JsonSerializer<Object> jsonSerializer = this._valueSerializer;
            if (jsonSerializer == null) {
                jsonSerializer = serializerProvider.findTypedValueSerializer(value.getClass(), true, this._property);
            }
            jsonSerializer.serialize(value, jsonGenerator, serializerProvider);
        } catch (IOException e10) {
            throw e10;
        } catch (Exception e11) {
            e = e11;
            while ((e instanceof InvocationTargetException) && e.getCause() != null) {
                e = e.getCause();
            }
            if (e instanceof Error) {
                throw ((Error) e);
            }
            throw JsonMappingException.wrapWithPath(e, obj, this._accessorMethod.getName() + "()");
        }
    }

    public void serializeWithType(Object obj, JsonGenerator jsonGenerator, SerializerProvider serializerProvider, TypeSerializer typeSerializer) {
        try {
            Object value = this._accessorMethod.getValue(obj);
            if (value == null) {
                serializerProvider.defaultSerializeNull(jsonGenerator);
                return;
            }
            JsonSerializer<Object> jsonSerializer = this._valueSerializer;
            if (jsonSerializer == null) {
                jsonSerializer = serializerProvider.findValueSerializer(value.getClass(), this._property);
            } else if (this._forceTypeInformation) {
                typeSerializer.writeTypePrefixForScalar(obj, jsonGenerator);
                jsonSerializer.serialize(value, jsonGenerator, serializerProvider);
                typeSerializer.writeTypeSuffixForScalar(obj, jsonGenerator);
                return;
            }
            jsonSerializer.serializeWithType(value, jsonGenerator, serializerProvider, new TypeSerializerRerouter(typeSerializer, obj));
        } catch (IOException e10) {
            throw e10;
        } catch (Exception e11) {
            e = e11;
            while ((e instanceof InvocationTargetException) && e.getCause() != null) {
                e = e.getCause();
            }
            if (e instanceof Error) {
                throw ((Error) e);
            }
            throw JsonMappingException.wrapWithPath(e, obj, this._accessorMethod.getName() + "()");
        }
    }

    public String toString() {
        return "(@JsonValue serializer for method " + this._accessorMethod.getDeclaringClass() + "#" + this._accessorMethod.getName() + ")";
    }

    public JsonValueSerializer withResolved(BeanProperty beanProperty, JsonSerializer<?> jsonSerializer, boolean z10) {
        if (this._property == beanProperty && this._valueSerializer == jsonSerializer && z10 == this._forceTypeInformation) {
            return this;
        }
        return new JsonValueSerializer(this, beanProperty, jsonSerializer, z10);
    }

    public JsonValueSerializer(JsonValueSerializer jsonValueSerializer, BeanProperty beanProperty, JsonSerializer<?> jsonSerializer, boolean z10) {
        super(_notNullClass(jsonValueSerializer.handledType()));
        this._accessorMethod = jsonValueSerializer._accessorMethod;
        this._valueSerializer = jsonSerializer;
        this._property = beanProperty;
        this._forceTypeInformation = z10;
    }
}
