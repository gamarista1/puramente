package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.annotation.JacksonStdImpl;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.fasterxml.jackson.databind.ser.ContainerSerializer;
import com.fasterxml.jackson.databind.type.TypeFactory;
import io.intercom.android.sdk.models.AttributeType;
import java.lang.reflect.Type;
import java.util.HashMap;

public class StdArraySerializers {
    protected static final HashMap<String, JsonSerializer<?>> _arraySerializers;

    @JacksonStdImpl
    public static class BooleanArraySerializer extends ArraySerializerBase<boolean[]> {
        private static final JavaType VALUE_TYPE = TypeFactory.defaultInstance().uncheckedSimpleType(Boolean.class);

        public BooleanArraySerializer() {
            super(boolean[].class);
        }

        public JsonSerializer<?> _withResolved(BeanProperty beanProperty, Boolean bool) {
            return new BooleanArraySerializer(this, beanProperty, bool);
        }

        public ContainerSerializer<?> _withValueTypeSerializer(TypeSerializer typeSerializer) {
            return this;
        }

        public void acceptJsonFormatVisitor(JsonFormatVisitorWrapper jsonFormatVisitorWrapper, JavaType javaType) {
            visitArrayFormat(jsonFormatVisitorWrapper, javaType, JsonFormatTypes.BOOLEAN);
        }

        public JsonSerializer<?> getContentSerializer() {
            return null;
        }

        public JavaType getContentType() {
            return VALUE_TYPE;
        }

        public JsonNode getSchema(SerializerProvider serializerProvider, Type type) {
            ObjectNode createSchemaNode = createSchemaNode("array", true);
            createSchemaNode.set("items", createSchemaNode(AttributeType.BOOLEAN));
            return createSchemaNode;
        }

        protected BooleanArraySerializer(BooleanArraySerializer booleanArraySerializer, BeanProperty beanProperty, Boolean bool) {
            super(booleanArraySerializer, beanProperty, bool);
        }

        public boolean hasSingleElement(boolean[] zArr) {
            return zArr.length == 1;
        }

        public boolean isEmpty(SerializerProvider serializerProvider, boolean[] zArr) {
            return zArr == null || zArr.length == 0;
        }

        public final void serialize(boolean[] zArr, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) {
            int length = zArr.length;
            if (length != 1 || ((this._unwrapSingle != null || !serializerProvider.isEnabled(SerializationFeature.WRITE_SINGLE_ELEM_ARRAYS_UNWRAPPED)) && this._unwrapSingle != Boolean.TRUE)) {
                jsonGenerator.writeStartArray(length);
                serializeContents(zArr, jsonGenerator, serializerProvider);
                jsonGenerator.writeEndArray();
                return;
            }
            serializeContents(zArr, jsonGenerator, serializerProvider);
        }

        public void serializeContents(boolean[] zArr, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) {
            for (boolean writeBoolean : zArr) {
                jsonGenerator.writeBoolean(writeBoolean);
            }
        }
    }

    @JacksonStdImpl
    public static class CharArraySerializer extends StdSerializer<char[]> {
        public CharArraySerializer() {
            super(char[].class);
        }

        private final void _writeArrayContents(JsonGenerator jsonGenerator, char[] cArr) {
            int length = cArr.length;
            for (int i10 = 0; i10 < length; i10++) {
                jsonGenerator.writeString(cArr, i10, 1);
            }
        }

        public void acceptJsonFormatVisitor(JsonFormatVisitorWrapper jsonFormatVisitorWrapper, JavaType javaType) {
            visitArrayFormat(jsonFormatVisitorWrapper, javaType, JsonFormatTypes.STRING);
        }

        public JsonNode getSchema(SerializerProvider serializerProvider, Type type) {
            ObjectNode createSchemaNode = createSchemaNode("array", true);
            ObjectNode createSchemaNode2 = createSchemaNode("string");
            createSchemaNode2.put("type", "string");
            return createSchemaNode.set("items", createSchemaNode2);
        }

        public boolean isEmpty(SerializerProvider serializerProvider, char[] cArr) {
            return cArr == null || cArr.length == 0;
        }

        public void serialize(char[] cArr, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) {
            if (serializerProvider.isEnabled(SerializationFeature.WRITE_CHAR_ARRAYS_AS_JSON_ARRAYS)) {
                jsonGenerator.writeStartArray(cArr.length);
                _writeArrayContents(jsonGenerator, cArr);
                jsonGenerator.writeEndArray();
                return;
            }
            jsonGenerator.writeString(cArr, 0, cArr.length);
        }

        public void serializeWithType(char[] cArr, JsonGenerator jsonGenerator, SerializerProvider serializerProvider, TypeSerializer typeSerializer) {
            if (serializerProvider.isEnabled(SerializationFeature.WRITE_CHAR_ARRAYS_AS_JSON_ARRAYS)) {
                typeSerializer.writeTypePrefixForArray(cArr, jsonGenerator);
                _writeArrayContents(jsonGenerator, cArr);
                typeSerializer.writeTypeSuffixForArray(cArr, jsonGenerator);
                return;
            }
            typeSerializer.writeTypePrefixForScalar(cArr, jsonGenerator);
            jsonGenerator.writeString(cArr, 0, cArr.length);
            typeSerializer.writeTypeSuffixForScalar(cArr, jsonGenerator);
        }
    }

    @JacksonStdImpl
    public static class DoubleArraySerializer extends ArraySerializerBase<double[]> {
        private static final JavaType VALUE_TYPE = TypeFactory.defaultInstance().uncheckedSimpleType(Double.TYPE);

        public DoubleArraySerializer() {
            super(double[].class);
        }

        public JsonSerializer<?> _withResolved(BeanProperty beanProperty, Boolean bool) {
            return new DoubleArraySerializer(this, beanProperty, bool);
        }

        public ContainerSerializer<?> _withValueTypeSerializer(TypeSerializer typeSerializer) {
            return this;
        }

        public void acceptJsonFormatVisitor(JsonFormatVisitorWrapper jsonFormatVisitorWrapper, JavaType javaType) {
            visitArrayFormat(jsonFormatVisitorWrapper, javaType, JsonFormatTypes.NUMBER);
        }

        public JsonSerializer<?> getContentSerializer() {
            return null;
        }

        public JavaType getContentType() {
            return VALUE_TYPE;
        }

        public JsonNode getSchema(SerializerProvider serializerProvider, Type type) {
            return createSchemaNode("array", true).set("items", createSchemaNode(AttributeType.NUMBER));
        }

        protected DoubleArraySerializer(DoubleArraySerializer doubleArraySerializer, BeanProperty beanProperty, Boolean bool) {
            super(doubleArraySerializer, beanProperty, bool);
        }

        public boolean hasSingleElement(double[] dArr) {
            return dArr.length == 1;
        }

        public boolean isEmpty(SerializerProvider serializerProvider, double[] dArr) {
            return dArr == null || dArr.length == 0;
        }

        public final void serialize(double[] dArr, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) {
            if (dArr.length != 1 || ((this._unwrapSingle != null || !serializerProvider.isEnabled(SerializationFeature.WRITE_SINGLE_ELEM_ARRAYS_UNWRAPPED)) && this._unwrapSingle != Boolean.TRUE)) {
                jsonGenerator.setCurrentValue(dArr);
                jsonGenerator.writeArray(dArr, 0, dArr.length);
                return;
            }
            serializeContents(dArr, jsonGenerator, serializerProvider);
        }

        public void serializeContents(double[] dArr, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) {
            for (double writeNumber : dArr) {
                jsonGenerator.writeNumber(writeNumber);
            }
        }
    }

    @JacksonStdImpl
    public static class FloatArraySerializer extends TypedPrimitiveArraySerializer<float[]> {
        private static final JavaType VALUE_TYPE = TypeFactory.defaultInstance().uncheckedSimpleType(Float.TYPE);

        public FloatArraySerializer() {
            super(float[].class);
        }

        public JsonSerializer<?> _withResolved(BeanProperty beanProperty, Boolean bool) {
            return new FloatArraySerializer(this, beanProperty, this._valueTypeSerializer, bool);
        }

        public ContainerSerializer<?> _withValueTypeSerializer(TypeSerializer typeSerializer) {
            return new FloatArraySerializer(this, this._property, typeSerializer, this._unwrapSingle);
        }

        public void acceptJsonFormatVisitor(JsonFormatVisitorWrapper jsonFormatVisitorWrapper, JavaType javaType) {
            visitArrayFormat(jsonFormatVisitorWrapper, javaType, JsonFormatTypes.NUMBER);
        }

        public JsonSerializer<?> getContentSerializer() {
            return null;
        }

        public JavaType getContentType() {
            return VALUE_TYPE;
        }

        public JsonNode getSchema(SerializerProvider serializerProvider, Type type) {
            return createSchemaNode("array", true).set("items", createSchemaNode(AttributeType.NUMBER));
        }

        public FloatArraySerializer(FloatArraySerializer floatArraySerializer, BeanProperty beanProperty, TypeSerializer typeSerializer, Boolean bool) {
            super(floatArraySerializer, beanProperty, typeSerializer, bool);
        }

        public boolean hasSingleElement(float[] fArr) {
            return fArr.length == 1;
        }

        public boolean isEmpty(SerializerProvider serializerProvider, float[] fArr) {
            return fArr == null || fArr.length == 0;
        }

        public final void serialize(float[] fArr, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) {
            int length = fArr.length;
            if (length != 1 || ((this._unwrapSingle != null || !serializerProvider.isEnabled(SerializationFeature.WRITE_SINGLE_ELEM_ARRAYS_UNWRAPPED)) && this._unwrapSingle != Boolean.TRUE)) {
                jsonGenerator.writeStartArray(length);
                serializeContents(fArr, jsonGenerator, serializerProvider);
                jsonGenerator.writeEndArray();
                return;
            }
            serializeContents(fArr, jsonGenerator, serializerProvider);
        }

        public void serializeContents(float[] fArr, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) {
            int i10 = 0;
            if (this._valueTypeSerializer != null) {
                int length = fArr.length;
                while (i10 < length) {
                    this._valueTypeSerializer.writeTypePrefixForScalar((Object) null, jsonGenerator, Float.TYPE);
                    jsonGenerator.writeNumber(fArr[i10]);
                    this._valueTypeSerializer.writeTypeSuffixForScalar((Object) null, jsonGenerator);
                    i10++;
                }
                return;
            }
            int length2 = fArr.length;
            while (i10 < length2) {
                jsonGenerator.writeNumber(fArr[i10]);
                i10++;
            }
        }
    }

    @JacksonStdImpl
    public static class IntArraySerializer extends ArraySerializerBase<int[]> {
        private static final JavaType VALUE_TYPE = TypeFactory.defaultInstance().uncheckedSimpleType(Integer.TYPE);

        public IntArraySerializer() {
            super(int[].class);
        }

        public JsonSerializer<?> _withResolved(BeanProperty beanProperty, Boolean bool) {
            return new IntArraySerializer(this, beanProperty, bool);
        }

        public ContainerSerializer<?> _withValueTypeSerializer(TypeSerializer typeSerializer) {
            return this;
        }

        public void acceptJsonFormatVisitor(JsonFormatVisitorWrapper jsonFormatVisitorWrapper, JavaType javaType) {
            visitArrayFormat(jsonFormatVisitorWrapper, javaType, JsonFormatTypes.INTEGER);
        }

        public JsonSerializer<?> getContentSerializer() {
            return null;
        }

        public JavaType getContentType() {
            return VALUE_TYPE;
        }

        public JsonNode getSchema(SerializerProvider serializerProvider, Type type) {
            return createSchemaNode("array", true).set("items", createSchemaNode(AttributeType.INTEGER));
        }

        protected IntArraySerializer(IntArraySerializer intArraySerializer, BeanProperty beanProperty, Boolean bool) {
            super(intArraySerializer, beanProperty, bool);
        }

        public boolean hasSingleElement(int[] iArr) {
            return iArr.length == 1;
        }

        public boolean isEmpty(SerializerProvider serializerProvider, int[] iArr) {
            return iArr == null || iArr.length == 0;
        }

        public final void serialize(int[] iArr, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) {
            if (iArr.length != 1 || ((this._unwrapSingle != null || !serializerProvider.isEnabled(SerializationFeature.WRITE_SINGLE_ELEM_ARRAYS_UNWRAPPED)) && this._unwrapSingle != Boolean.TRUE)) {
                jsonGenerator.setCurrentValue(iArr);
                jsonGenerator.writeArray(iArr, 0, iArr.length);
                return;
            }
            serializeContents(iArr, jsonGenerator, serializerProvider);
        }

        public void serializeContents(int[] iArr, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) {
            for (int writeNumber : iArr) {
                jsonGenerator.writeNumber(writeNumber);
            }
        }
    }

    @JacksonStdImpl
    public static class LongArraySerializer extends TypedPrimitiveArraySerializer<long[]> {
        private static final JavaType VALUE_TYPE = TypeFactory.defaultInstance().uncheckedSimpleType(Long.TYPE);

        public LongArraySerializer() {
            super(long[].class);
        }

        public JsonSerializer<?> _withResolved(BeanProperty beanProperty, Boolean bool) {
            return new LongArraySerializer(this, beanProperty, this._valueTypeSerializer, bool);
        }

        public ContainerSerializer<?> _withValueTypeSerializer(TypeSerializer typeSerializer) {
            return new LongArraySerializer(this, this._property, typeSerializer, this._unwrapSingle);
        }

        public void acceptJsonFormatVisitor(JsonFormatVisitorWrapper jsonFormatVisitorWrapper, JavaType javaType) {
            visitArrayFormat(jsonFormatVisitorWrapper, javaType, JsonFormatTypes.NUMBER);
        }

        public JsonSerializer<?> getContentSerializer() {
            return null;
        }

        public JavaType getContentType() {
            return VALUE_TYPE;
        }

        public JsonNode getSchema(SerializerProvider serializerProvider, Type type) {
            return createSchemaNode("array", true).set("items", createSchemaNode(AttributeType.NUMBER, true));
        }

        public LongArraySerializer(LongArraySerializer longArraySerializer, BeanProperty beanProperty, TypeSerializer typeSerializer, Boolean bool) {
            super(longArraySerializer, beanProperty, typeSerializer, bool);
        }

        public boolean hasSingleElement(long[] jArr) {
            return jArr.length == 1;
        }

        public boolean isEmpty(SerializerProvider serializerProvider, long[] jArr) {
            return jArr == null || jArr.length == 0;
        }

        public final void serialize(long[] jArr, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) {
            if (jArr.length != 1 || ((this._unwrapSingle != null || !serializerProvider.isEnabled(SerializationFeature.WRITE_SINGLE_ELEM_ARRAYS_UNWRAPPED)) && this._unwrapSingle != Boolean.TRUE)) {
                jsonGenerator.setCurrentValue(jArr);
                jsonGenerator.writeArray(jArr, 0, jArr.length);
                return;
            }
            serializeContents(jArr, jsonGenerator, serializerProvider);
        }

        public void serializeContents(long[] jArr, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) {
            int i10 = 0;
            if (this._valueTypeSerializer != null) {
                int length = jArr.length;
                while (i10 < length) {
                    this._valueTypeSerializer.writeTypePrefixForScalar((Object) null, jsonGenerator, Long.TYPE);
                    jsonGenerator.writeNumber(jArr[i10]);
                    this._valueTypeSerializer.writeTypeSuffixForScalar((Object) null, jsonGenerator);
                    i10++;
                }
                return;
            }
            int length2 = jArr.length;
            while (i10 < length2) {
                jsonGenerator.writeNumber(jArr[i10]);
                i10++;
            }
        }
    }

    @JacksonStdImpl
    public static class ShortArraySerializer extends TypedPrimitiveArraySerializer<short[]> {
        private static final JavaType VALUE_TYPE = TypeFactory.defaultInstance().uncheckedSimpleType(Short.TYPE);

        public ShortArraySerializer() {
            super(short[].class);
        }

        public JsonSerializer<?> _withResolved(BeanProperty beanProperty, Boolean bool) {
            return new ShortArraySerializer(this, beanProperty, this._valueTypeSerializer, bool);
        }

        public ContainerSerializer<?> _withValueTypeSerializer(TypeSerializer typeSerializer) {
            return new ShortArraySerializer(this, this._property, typeSerializer, this._unwrapSingle);
        }

        public void acceptJsonFormatVisitor(JsonFormatVisitorWrapper jsonFormatVisitorWrapper, JavaType javaType) {
            visitArrayFormat(jsonFormatVisitorWrapper, javaType, JsonFormatTypes.INTEGER);
        }

        public JsonSerializer<?> getContentSerializer() {
            return null;
        }

        public JavaType getContentType() {
            return VALUE_TYPE;
        }

        public JsonNode getSchema(SerializerProvider serializerProvider, Type type) {
            return createSchemaNode("array", true).set("items", createSchemaNode(AttributeType.INTEGER));
        }

        public ShortArraySerializer(ShortArraySerializer shortArraySerializer, BeanProperty beanProperty, TypeSerializer typeSerializer, Boolean bool) {
            super(shortArraySerializer, beanProperty, typeSerializer, bool);
        }

        public boolean hasSingleElement(short[] sArr) {
            return sArr.length == 1;
        }

        public boolean isEmpty(SerializerProvider serializerProvider, short[] sArr) {
            return sArr == null || sArr.length == 0;
        }

        public final void serialize(short[] sArr, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) {
            int length = sArr.length;
            if (length != 1 || ((this._unwrapSingle != null || !serializerProvider.isEnabled(SerializationFeature.WRITE_SINGLE_ELEM_ARRAYS_UNWRAPPED)) && this._unwrapSingle != Boolean.TRUE)) {
                jsonGenerator.writeStartArray(length);
                serializeContents(sArr, jsonGenerator, serializerProvider);
                jsonGenerator.writeEndArray();
                return;
            }
            serializeContents(sArr, jsonGenerator, serializerProvider);
        }

        public void serializeContents(short[] sArr, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) {
            int i10 = 0;
            if (this._valueTypeSerializer != null) {
                int length = sArr.length;
                while (i10 < length) {
                    this._valueTypeSerializer.writeTypePrefixForScalar((Object) null, jsonGenerator, Short.TYPE);
                    jsonGenerator.writeNumber(sArr[i10]);
                    this._valueTypeSerializer.writeTypeSuffixForScalar((Object) null, jsonGenerator);
                    i10++;
                }
                return;
            }
            int length2 = sArr.length;
            while (i10 < length2) {
                jsonGenerator.writeNumber((int) sArr[i10]);
                i10++;
            }
        }
    }

    static {
        HashMap<String, JsonSerializer<?>> hashMap = new HashMap<>();
        _arraySerializers = hashMap;
        hashMap.put(boolean[].class.getName(), new BooleanArraySerializer());
        hashMap.put(byte[].class.getName(), new ByteArraySerializer());
        hashMap.put(char[].class.getName(), new CharArraySerializer());
        hashMap.put(short[].class.getName(), new ShortArraySerializer());
        hashMap.put(int[].class.getName(), new IntArraySerializer());
        hashMap.put(long[].class.getName(), new LongArraySerializer());
        hashMap.put(float[].class.getName(), new FloatArraySerializer());
        hashMap.put(double[].class.getName(), new DoubleArraySerializer());
    }

    protected StdArraySerializers() {
    }

    public static JsonSerializer<?> findStandardImpl(Class<?> cls) {
        return _arraySerializers.get(cls.getName());
    }

    protected static abstract class TypedPrimitiveArraySerializer<T> extends ArraySerializerBase<T> {
        protected final TypeSerializer _valueTypeSerializer;

        protected TypedPrimitiveArraySerializer(Class<T> cls) {
            super(cls);
            this._valueTypeSerializer = null;
        }

        protected TypedPrimitiveArraySerializer(TypedPrimitiveArraySerializer<T> typedPrimitiveArraySerializer, BeanProperty beanProperty, TypeSerializer typeSerializer, Boolean bool) {
            super(typedPrimitiveArraySerializer, beanProperty, bool);
            this._valueTypeSerializer = typeSerializer;
        }
    }
}
