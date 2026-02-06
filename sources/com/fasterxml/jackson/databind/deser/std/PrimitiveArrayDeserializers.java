package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.core.Base64Variants;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.annotation.JacksonStdImpl;
import com.fasterxml.jackson.databind.deser.ContextualDeserializer;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import com.fasterxml.jackson.databind.util.ArrayBuilders;

public abstract class PrimitiveArrayDeserializers<T> extends StdDeserializer<T> implements ContextualDeserializer {
    protected final Boolean _unwrapSingle;

    @JacksonStdImpl
    static final class BooleanDeser extends PrimitiveArrayDeserializers<boolean[]> {
        private static final long serialVersionUID = 1;

        public BooleanDeser() {
            super(boolean[].class);
        }

        /* access modifiers changed from: protected */
        public PrimitiveArrayDeserializers<?> withResolved(Boolean bool) {
            return new BooleanDeser(this, bool);
        }

        protected BooleanDeser(BooleanDeser booleanDeser, Boolean bool) {
            super(booleanDeser, bool);
        }

        public boolean[] deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) {
            if (!jsonParser.isExpectedStartArrayToken()) {
                return (boolean[]) handleNonArray(jsonParser, deserializationContext);
            }
            ArrayBuilders.BooleanBuilder booleanBuilder = deserializationContext.getArrayBuilders().getBooleanBuilder();
            boolean[] zArr = (boolean[]) booleanBuilder.resetAndStart();
            int i10 = 0;
            while (jsonParser.nextToken() != JsonToken.END_ARRAY) {
                try {
                    boolean _parseBooleanPrimitive = _parseBooleanPrimitive(jsonParser, deserializationContext);
                    if (i10 >= zArr.length) {
                        boolean[] zArr2 = (boolean[]) booleanBuilder.appendCompletedChunk(zArr, i10);
                        i10 = 0;
                        zArr = zArr2;
                    }
                    int i11 = i10 + 1;
                    try {
                        zArr[i10] = _parseBooleanPrimitive;
                        i10 = i11;
                    } catch (Exception e10) {
                        e = e10;
                        i10 = i11;
                        throw JsonMappingException.wrapWithPath((Throwable) e, (Object) zArr, booleanBuilder.bufferedSize() + i10);
                    }
                } catch (Exception e11) {
                    e = e11;
                    throw JsonMappingException.wrapWithPath((Throwable) e, (Object) zArr, booleanBuilder.bufferedSize() + i10);
                }
            }
            return (boolean[]) booleanBuilder.completeAndClearBuffer(zArr, i10);
        }

        /* access modifiers changed from: protected */
        public boolean[] handleSingleElementUnwrapped(JsonParser jsonParser, DeserializationContext deserializationContext) {
            return new boolean[]{_parseBooleanPrimitive(jsonParser, deserializationContext)};
        }
    }

    @JacksonStdImpl
    static final class ByteDeser extends PrimitiveArrayDeserializers<byte[]> {
        private static final long serialVersionUID = 1;

        public ByteDeser() {
            super(byte[].class);
        }

        /* access modifiers changed from: protected */
        public PrimitiveArrayDeserializers<?> withResolved(Boolean bool) {
            return new ByteDeser(this, bool);
        }

        protected ByteDeser(ByteDeser byteDeser, Boolean bool) {
            super(byteDeser, bool);
        }

        /* JADX WARNING: Removed duplicated region for block: B:35:0x0072 A[Catch:{ Exception -> 0x0069 }] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public byte[] deserialize(com.fasterxml.jackson.core.JsonParser r7, com.fasterxml.jackson.databind.DeserializationContext r8) {
            /*
                r6 = this;
                com.fasterxml.jackson.core.JsonToken r0 = r7.getCurrentToken()
                com.fasterxml.jackson.core.JsonToken r1 = com.fasterxml.jackson.core.JsonToken.VALUE_STRING
                if (r0 != r1) goto L_0x0011
                com.fasterxml.jackson.core.Base64Variant r8 = r8.getBase64Variant()
                byte[] r7 = r7.getBinaryValue(r8)
                return r7
            L_0x0011:
                com.fasterxml.jackson.core.JsonToken r1 = com.fasterxml.jackson.core.JsonToken.VALUE_EMBEDDED_OBJECT
                if (r0 != r1) goto L_0x0024
                java.lang.Object r0 = r7.getEmbeddedObject()
                if (r0 != 0) goto L_0x001d
                r7 = 0
                return r7
            L_0x001d:
                boolean r1 = r0 instanceof byte[]
                if (r1 == 0) goto L_0x0024
                byte[] r0 = (byte[]) r0
                return r0
            L_0x0024:
                boolean r0 = r7.isExpectedStartArrayToken()
                if (r0 != 0) goto L_0x0031
                java.lang.Object r7 = r6.handleNonArray(r7, r8)
                byte[] r7 = (byte[]) r7
                return r7
            L_0x0031:
                com.fasterxml.jackson.databind.util.ArrayBuilders r0 = r8.getArrayBuilders()
                com.fasterxml.jackson.databind.util.ArrayBuilders$ByteBuilder r0 = r0.getByteBuilder()
                java.lang.Object r1 = r0.resetAndStart()
                byte[] r1 = (byte[]) r1
                r2 = 0
                r3 = r2
            L_0x0041:
                com.fasterxml.jackson.core.JsonToken r4 = r7.nextToken()     // Catch:{ Exception -> 0x0069 }
                com.fasterxml.jackson.core.JsonToken r5 = com.fasterxml.jackson.core.JsonToken.END_ARRAY     // Catch:{ Exception -> 0x0069 }
                if (r4 == r5) goto L_0x0083
                com.fasterxml.jackson.core.JsonToken r5 = com.fasterxml.jackson.core.JsonToken.VALUE_NUMBER_INT     // Catch:{ Exception -> 0x0069 }
                if (r4 == r5) goto L_0x006b
                com.fasterxml.jackson.core.JsonToken r5 = com.fasterxml.jackson.core.JsonToken.VALUE_NUMBER_FLOAT     // Catch:{ Exception -> 0x0069 }
                if (r4 != r5) goto L_0x0052
                goto L_0x006b
            L_0x0052:
                com.fasterxml.jackson.core.JsonToken r5 = com.fasterxml.jackson.core.JsonToken.VALUE_NULL     // Catch:{ Exception -> 0x0069 }
                if (r4 != r5) goto L_0x0058
                r4 = r2
                goto L_0x006f
            L_0x0058:
                java.lang.Class<?> r4 = r6._valueClass     // Catch:{ Exception -> 0x0069 }
                java.lang.Class r4 = r4.getComponentType()     // Catch:{ Exception -> 0x0069 }
                java.lang.Object r4 = r8.handleUnexpectedToken(r4, r7)     // Catch:{ Exception -> 0x0069 }
                java.lang.Number r4 = (java.lang.Number) r4     // Catch:{ Exception -> 0x0069 }
                byte r4 = r4.byteValue()     // Catch:{ Exception -> 0x0069 }
                goto L_0x006f
            L_0x0069:
                r7 = move-exception
                goto L_0x008a
            L_0x006b:
                byte r4 = r7.getByteValue()     // Catch:{ Exception -> 0x0069 }
            L_0x006f:
                int r5 = r1.length     // Catch:{ Exception -> 0x0069 }
                if (r3 < r5) goto L_0x007a
                java.lang.Object r5 = r0.appendCompletedChunk(r1, r3)     // Catch:{ Exception -> 0x0069 }
                byte[] r5 = (byte[]) r5     // Catch:{ Exception -> 0x0069 }
                r3 = r2
                r1 = r5
            L_0x007a:
                int r5 = r3 + 1
                r1[r3] = r4     // Catch:{ Exception -> 0x0080 }
                r3 = r5
                goto L_0x0041
            L_0x0080:
                r7 = move-exception
                r3 = r5
                goto L_0x008a
            L_0x0083:
                java.lang.Object r7 = r0.completeAndClearBuffer(r1, r3)
                byte[] r7 = (byte[]) r7
                return r7
            L_0x008a:
                int r8 = r0.bufferedSize()
                int r8 = r8 + r3
                com.fasterxml.jackson.databind.JsonMappingException r7 = com.fasterxml.jackson.databind.JsonMappingException.wrapWithPath((java.lang.Throwable) r7, (java.lang.Object) r1, (int) r8)
                throw r7
            */
            throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers.ByteDeser.deserialize(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext):byte[]");
        }

        /* access modifiers changed from: protected */
        public byte[] handleSingleElementUnwrapped(JsonParser jsonParser, DeserializationContext deserializationContext) {
            byte b10;
            JsonToken currentToken = jsonParser.getCurrentToken();
            if (currentToken == JsonToken.VALUE_NUMBER_INT || currentToken == JsonToken.VALUE_NUMBER_FLOAT) {
                b10 = jsonParser.getByteValue();
            } else if (currentToken == JsonToken.VALUE_NULL) {
                return null;
            } else {
                b10 = ((Number) deserializationContext.handleUnexpectedToken(this._valueClass.getComponentType(), jsonParser)).byteValue();
            }
            return new byte[]{b10};
        }
    }

    @JacksonStdImpl
    static final class CharDeser extends PrimitiveArrayDeserializers<char[]> {
        private static final long serialVersionUID = 1;

        public CharDeser() {
            super(char[].class);
        }

        /* access modifiers changed from: protected */
        public PrimitiveArrayDeserializers<?> withResolved(Boolean bool) {
            return this;
        }

        protected CharDeser(CharDeser charDeser, Boolean bool) {
            super(charDeser, bool);
        }

        public char[] deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) {
            String str;
            JsonToken currentToken = jsonParser.getCurrentToken();
            if (currentToken == JsonToken.VALUE_STRING) {
                char[] textCharacters = jsonParser.getTextCharacters();
                int textOffset = jsonParser.getTextOffset();
                int textLength = jsonParser.getTextLength();
                char[] cArr = new char[textLength];
                System.arraycopy(textCharacters, textOffset, cArr, 0, textLength);
                return cArr;
            } else if (jsonParser.isExpectedStartArrayToken()) {
                StringBuilder sb2 = new StringBuilder(64);
                while (true) {
                    JsonToken nextToken = jsonParser.nextToken();
                    if (nextToken == JsonToken.END_ARRAY) {
                        return sb2.toString().toCharArray();
                    }
                    if (nextToken == JsonToken.VALUE_STRING) {
                        str = jsonParser.getText();
                    } else {
                        str = ((CharSequence) deserializationContext.handleUnexpectedToken(Character.TYPE, jsonParser)).toString();
                    }
                    if (str.length() != 1) {
                        deserializationContext.reportMappingException("Can not convert a JSON String of length %d into a char element of char array", Integer.valueOf(str.length()));
                    }
                    sb2.append(str.charAt(0));
                }
            } else {
                if (currentToken == JsonToken.VALUE_EMBEDDED_OBJECT) {
                    Object embeddedObject = jsonParser.getEmbeddedObject();
                    if (embeddedObject == null) {
                        return null;
                    }
                    if (embeddedObject instanceof char[]) {
                        return (char[]) embeddedObject;
                    }
                    if (embeddedObject instanceof String) {
                        return ((String) embeddedObject).toCharArray();
                    }
                    if (embeddedObject instanceof byte[]) {
                        return Base64Variants.getDefaultVariant().encode((byte[]) embeddedObject, false).toCharArray();
                    }
                }
                return (char[]) deserializationContext.handleUnexpectedToken(this._valueClass, jsonParser);
            }
        }

        /* access modifiers changed from: protected */
        public char[] handleSingleElementUnwrapped(JsonParser jsonParser, DeserializationContext deserializationContext) {
            return (char[]) deserializationContext.handleUnexpectedToken(this._valueClass, jsonParser);
        }
    }

    @JacksonStdImpl
    static final class DoubleDeser extends PrimitiveArrayDeserializers<double[]> {
        private static final long serialVersionUID = 1;

        public DoubleDeser() {
            super(double[].class);
        }

        /* access modifiers changed from: protected */
        public PrimitiveArrayDeserializers<?> withResolved(Boolean bool) {
            return new DoubleDeser(this, bool);
        }

        protected DoubleDeser(DoubleDeser doubleDeser, Boolean bool) {
            super(doubleDeser, bool);
        }

        public double[] deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) {
            if (!jsonParser.isExpectedStartArrayToken()) {
                return (double[]) handleNonArray(jsonParser, deserializationContext);
            }
            ArrayBuilders.DoubleBuilder doubleBuilder = deserializationContext.getArrayBuilders().getDoubleBuilder();
            double[] dArr = (double[]) doubleBuilder.resetAndStart();
            int i10 = 0;
            while (jsonParser.nextToken() != JsonToken.END_ARRAY) {
                try {
                    double _parseDoublePrimitive = _parseDoublePrimitive(jsonParser, deserializationContext);
                    if (i10 >= dArr.length) {
                        double[] dArr2 = (double[]) doubleBuilder.appendCompletedChunk(dArr, i10);
                        i10 = 0;
                        dArr = dArr2;
                    }
                    int i11 = i10 + 1;
                    try {
                        dArr[i10] = _parseDoublePrimitive;
                        i10 = i11;
                    } catch (Exception e10) {
                        e = e10;
                        i10 = i11;
                        throw JsonMappingException.wrapWithPath((Throwable) e, (Object) dArr, doubleBuilder.bufferedSize() + i10);
                    }
                } catch (Exception e11) {
                    e = e11;
                    throw JsonMappingException.wrapWithPath((Throwable) e, (Object) dArr, doubleBuilder.bufferedSize() + i10);
                }
            }
            return (double[]) doubleBuilder.completeAndClearBuffer(dArr, i10);
        }

        /* access modifiers changed from: protected */
        public double[] handleSingleElementUnwrapped(JsonParser jsonParser, DeserializationContext deserializationContext) {
            return new double[]{_parseDoublePrimitive(jsonParser, deserializationContext)};
        }
    }

    @JacksonStdImpl
    static final class FloatDeser extends PrimitiveArrayDeserializers<float[]> {
        private static final long serialVersionUID = 1;

        public FloatDeser() {
            super(float[].class);
        }

        /* access modifiers changed from: protected */
        public PrimitiveArrayDeserializers<?> withResolved(Boolean bool) {
            return new FloatDeser(this, bool);
        }

        protected FloatDeser(FloatDeser floatDeser, Boolean bool) {
            super(floatDeser, bool);
        }

        public float[] deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) {
            if (!jsonParser.isExpectedStartArrayToken()) {
                return (float[]) handleNonArray(jsonParser, deserializationContext);
            }
            ArrayBuilders.FloatBuilder floatBuilder = deserializationContext.getArrayBuilders().getFloatBuilder();
            float[] fArr = (float[]) floatBuilder.resetAndStart();
            int i10 = 0;
            while (jsonParser.nextToken() != JsonToken.END_ARRAY) {
                try {
                    float _parseFloatPrimitive = _parseFloatPrimitive(jsonParser, deserializationContext);
                    if (i10 >= fArr.length) {
                        float[] fArr2 = (float[]) floatBuilder.appendCompletedChunk(fArr, i10);
                        i10 = 0;
                        fArr = fArr2;
                    }
                    int i11 = i10 + 1;
                    try {
                        fArr[i10] = _parseFloatPrimitive;
                        i10 = i11;
                    } catch (Exception e10) {
                        e = e10;
                        i10 = i11;
                        throw JsonMappingException.wrapWithPath((Throwable) e, (Object) fArr, floatBuilder.bufferedSize() + i10);
                    }
                } catch (Exception e11) {
                    e = e11;
                    throw JsonMappingException.wrapWithPath((Throwable) e, (Object) fArr, floatBuilder.bufferedSize() + i10);
                }
            }
            return (float[]) floatBuilder.completeAndClearBuffer(fArr, i10);
        }

        /* access modifiers changed from: protected */
        public float[] handleSingleElementUnwrapped(JsonParser jsonParser, DeserializationContext deserializationContext) {
            return new float[]{_parseFloatPrimitive(jsonParser, deserializationContext)};
        }
    }

    @JacksonStdImpl
    static final class IntDeser extends PrimitiveArrayDeserializers<int[]> {
        public static final IntDeser instance = new IntDeser();
        private static final long serialVersionUID = 1;

        public IntDeser() {
            super(int[].class);
        }

        /* access modifiers changed from: protected */
        public PrimitiveArrayDeserializers<?> withResolved(Boolean bool) {
            return new IntDeser(this, bool);
        }

        protected IntDeser(IntDeser intDeser, Boolean bool) {
            super(intDeser, bool);
        }

        public int[] deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) {
            if (!jsonParser.isExpectedStartArrayToken()) {
                return (int[]) handleNonArray(jsonParser, deserializationContext);
            }
            ArrayBuilders.IntBuilder intBuilder = deserializationContext.getArrayBuilders().getIntBuilder();
            int[] iArr = (int[]) intBuilder.resetAndStart();
            int i10 = 0;
            while (jsonParser.nextToken() != JsonToken.END_ARRAY) {
                try {
                    int _parseIntPrimitive = _parseIntPrimitive(jsonParser, deserializationContext);
                    if (i10 >= iArr.length) {
                        int[] iArr2 = (int[]) intBuilder.appendCompletedChunk(iArr, i10);
                        i10 = 0;
                        iArr = iArr2;
                    }
                    int i11 = i10 + 1;
                    try {
                        iArr[i10] = _parseIntPrimitive;
                        i10 = i11;
                    } catch (Exception e10) {
                        e = e10;
                        i10 = i11;
                        throw JsonMappingException.wrapWithPath((Throwable) e, (Object) iArr, intBuilder.bufferedSize() + i10);
                    }
                } catch (Exception e11) {
                    e = e11;
                    throw JsonMappingException.wrapWithPath((Throwable) e, (Object) iArr, intBuilder.bufferedSize() + i10);
                }
            }
            return (int[]) intBuilder.completeAndClearBuffer(iArr, i10);
        }

        /* access modifiers changed from: protected */
        public int[] handleSingleElementUnwrapped(JsonParser jsonParser, DeserializationContext deserializationContext) {
            return new int[]{_parseIntPrimitive(jsonParser, deserializationContext)};
        }
    }

    @JacksonStdImpl
    static final class LongDeser extends PrimitiveArrayDeserializers<long[]> {
        public static final LongDeser instance = new LongDeser();
        private static final long serialVersionUID = 1;

        public LongDeser() {
            super(long[].class);
        }

        /* access modifiers changed from: protected */
        public PrimitiveArrayDeserializers<?> withResolved(Boolean bool) {
            return new LongDeser(this, bool);
        }

        protected LongDeser(LongDeser longDeser, Boolean bool) {
            super(longDeser, bool);
        }

        public long[] deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) {
            if (!jsonParser.isExpectedStartArrayToken()) {
                return (long[]) handleNonArray(jsonParser, deserializationContext);
            }
            ArrayBuilders.LongBuilder longBuilder = deserializationContext.getArrayBuilders().getLongBuilder();
            long[] jArr = (long[]) longBuilder.resetAndStart();
            int i10 = 0;
            while (jsonParser.nextToken() != JsonToken.END_ARRAY) {
                try {
                    long _parseLongPrimitive = _parseLongPrimitive(jsonParser, deserializationContext);
                    if (i10 >= jArr.length) {
                        long[] jArr2 = (long[]) longBuilder.appendCompletedChunk(jArr, i10);
                        i10 = 0;
                        jArr = jArr2;
                    }
                    int i11 = i10 + 1;
                    try {
                        jArr[i10] = _parseLongPrimitive;
                        i10 = i11;
                    } catch (Exception e10) {
                        e = e10;
                        i10 = i11;
                        throw JsonMappingException.wrapWithPath((Throwable) e, (Object) jArr, longBuilder.bufferedSize() + i10);
                    }
                } catch (Exception e11) {
                    e = e11;
                    throw JsonMappingException.wrapWithPath((Throwable) e, (Object) jArr, longBuilder.bufferedSize() + i10);
                }
            }
            return (long[]) longBuilder.completeAndClearBuffer(jArr, i10);
        }

        /* access modifiers changed from: protected */
        public long[] handleSingleElementUnwrapped(JsonParser jsonParser, DeserializationContext deserializationContext) {
            return new long[]{_parseLongPrimitive(jsonParser, deserializationContext)};
        }
    }

    @JacksonStdImpl
    static final class ShortDeser extends PrimitiveArrayDeserializers<short[]> {
        private static final long serialVersionUID = 1;

        public ShortDeser() {
            super(short[].class);
        }

        /* access modifiers changed from: protected */
        public PrimitiveArrayDeserializers<?> withResolved(Boolean bool) {
            return new ShortDeser(this, bool);
        }

        protected ShortDeser(ShortDeser shortDeser, Boolean bool) {
            super(shortDeser, bool);
        }

        public short[] deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) {
            if (!jsonParser.isExpectedStartArrayToken()) {
                return (short[]) handleNonArray(jsonParser, deserializationContext);
            }
            ArrayBuilders.ShortBuilder shortBuilder = deserializationContext.getArrayBuilders().getShortBuilder();
            short[] sArr = (short[]) shortBuilder.resetAndStart();
            int i10 = 0;
            while (jsonParser.nextToken() != JsonToken.END_ARRAY) {
                try {
                    short _parseShortPrimitive = _parseShortPrimitive(jsonParser, deserializationContext);
                    if (i10 >= sArr.length) {
                        short[] sArr2 = (short[]) shortBuilder.appendCompletedChunk(sArr, i10);
                        i10 = 0;
                        sArr = sArr2;
                    }
                    int i11 = i10 + 1;
                    try {
                        sArr[i10] = _parseShortPrimitive;
                        i10 = i11;
                    } catch (Exception e10) {
                        e = e10;
                        i10 = i11;
                        throw JsonMappingException.wrapWithPath((Throwable) e, (Object) sArr, shortBuilder.bufferedSize() + i10);
                    }
                } catch (Exception e11) {
                    e = e11;
                    throw JsonMappingException.wrapWithPath((Throwable) e, (Object) sArr, shortBuilder.bufferedSize() + i10);
                }
            }
            return (short[]) shortBuilder.completeAndClearBuffer(sArr, i10);
        }

        /* access modifiers changed from: protected */
        public short[] handleSingleElementUnwrapped(JsonParser jsonParser, DeserializationContext deserializationContext) {
            return new short[]{_parseShortPrimitive(jsonParser, deserializationContext)};
        }
    }

    protected PrimitiveArrayDeserializers(Class<T> cls) {
        super((Class<?>) cls);
        this._unwrapSingle = null;
    }

    public static JsonDeserializer<?> forType(Class<?> cls) {
        if (cls == Integer.TYPE) {
            return IntDeser.instance;
        }
        if (cls == Long.TYPE) {
            return LongDeser.instance;
        }
        if (cls == Byte.TYPE) {
            return new ByteDeser();
        }
        if (cls == Short.TYPE) {
            return new ShortDeser();
        }
        if (cls == Float.TYPE) {
            return new FloatDeser();
        }
        if (cls == Double.TYPE) {
            return new DoubleDeser();
        }
        if (cls == Boolean.TYPE) {
            return new BooleanDeser();
        }
        if (cls == Character.TYPE) {
            return new CharDeser();
        }
        throw new IllegalStateException();
    }

    public JsonDeserializer<?> createContextual(DeserializationContext deserializationContext, BeanProperty beanProperty) {
        Boolean findFormatFeature = findFormatFeature(deserializationContext, beanProperty, this._valueClass, JsonFormat.Feature.ACCEPT_SINGLE_VALUE_AS_ARRAY);
        if (findFormatFeature == this._unwrapSingle) {
            return this;
        }
        return withResolved(findFormatFeature);
    }

    public Object deserializeWithType(JsonParser jsonParser, DeserializationContext deserializationContext, TypeDeserializer typeDeserializer) {
        return typeDeserializer.deserializeTypedFromArray(jsonParser, deserializationContext);
    }

    /* access modifiers changed from: protected */
    public T handleNonArray(JsonParser jsonParser, DeserializationContext deserializationContext) {
        if (jsonParser.hasToken(JsonToken.VALUE_STRING) && deserializationContext.isEnabled(DeserializationFeature.ACCEPT_EMPTY_STRING_AS_NULL_OBJECT) && jsonParser.getText().length() == 0) {
            return null;
        }
        Boolean bool = this._unwrapSingle;
        if (bool == Boolean.TRUE || (bool == null && deserializationContext.isEnabled(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY))) {
            return handleSingleElementUnwrapped(jsonParser, deserializationContext);
        }
        return deserializationContext.handleUnexpectedToken(this._valueClass, jsonParser);
    }

    /* access modifiers changed from: protected */
    public abstract T handleSingleElementUnwrapped(JsonParser jsonParser, DeserializationContext deserializationContext);

    /* access modifiers changed from: protected */
    public abstract PrimitiveArrayDeserializers<?> withResolved(Boolean bool);

    protected PrimitiveArrayDeserializers(PrimitiveArrayDeserializers<?> primitiveArrayDeserializers, Boolean bool) {
        super(primitiveArrayDeserializers._valueClass);
        this._unwrapSingle = bool;
    }
}
