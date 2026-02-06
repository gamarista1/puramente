package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializationConfig;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper;
import com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap;
import com.fasterxml.jackson.databind.util.EnumValues;
import java.util.Calendar;
import java.util.Date;
import java.util.UUID;

public class StdKeySerializers {
    protected static final JsonSerializer<Object> DEFAULT_KEY_SERIALIZER = new StdKeySerializer();
    protected static final JsonSerializer<Object> DEFAULT_STRING_SERIALIZER = new StringKeySerializer();

    public static class Default extends StdSerializer<Object> {
        static final int TYPE_CALENDAR = 2;
        static final int TYPE_CLASS = 3;
        static final int TYPE_DATE = 1;
        static final int TYPE_ENUM = 4;
        static final int TYPE_TO_STRING = 5;
        protected final int _typeId;

        public Default(int i10, Class<?> cls) {
            super(cls, false);
            this._typeId = i10;
        }

        public void serialize(Object obj, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) {
            String str;
            int i10 = this._typeId;
            if (i10 == 1) {
                serializerProvider.defaultSerializeDateKey((Date) obj, jsonGenerator);
            } else if (i10 == 2) {
                serializerProvider.defaultSerializeDateKey(((Calendar) obj).getTimeInMillis(), jsonGenerator);
            } else if (i10 == 3) {
                jsonGenerator.writeFieldName(((Class) obj).getName());
            } else if (i10 != 4) {
                jsonGenerator.writeFieldName(obj.toString());
            } else {
                if (serializerProvider.isEnabled(SerializationFeature.WRITE_ENUMS_USING_TO_STRING)) {
                    str = obj.toString();
                } else {
                    Enum enumR = (Enum) obj;
                    if (serializerProvider.isEnabled(SerializationFeature.WRITE_ENUMS_USING_INDEX)) {
                        str = String.valueOf(enumR.ordinal());
                    } else {
                        str = enumR.name();
                    }
                }
                jsonGenerator.writeFieldName(str);
            }
        }
    }

    public static class Dynamic extends StdSerializer<Object> {
        protected transient PropertySerializerMap _dynamicSerializers = PropertySerializerMap.emptyForProperties();

        public Dynamic() {
            super(String.class, false);
        }

        /* access modifiers changed from: protected */
        public JsonSerializer<Object> _findAndAddDynamic(PropertySerializerMap propertySerializerMap, Class<?> cls, SerializerProvider serializerProvider) {
            PropertySerializerMap.SerializerAndMapResult findAndAddKeySerializer = propertySerializerMap.findAndAddKeySerializer(cls, serializerProvider, (BeanProperty) null);
            PropertySerializerMap propertySerializerMap2 = findAndAddKeySerializer.map;
            if (propertySerializerMap != propertySerializerMap2) {
                this._dynamicSerializers = propertySerializerMap2;
            }
            return findAndAddKeySerializer.serializer;
        }

        public void acceptJsonFormatVisitor(JsonFormatVisitorWrapper jsonFormatVisitorWrapper, JavaType javaType) {
            visitStringFormat(jsonFormatVisitorWrapper, javaType);
        }

        /* access modifiers changed from: package-private */
        public Object readResolve() {
            this._dynamicSerializers = PropertySerializerMap.emptyForProperties();
            return this;
        }

        public void serialize(Object obj, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) {
            Class<?> cls = obj.getClass();
            PropertySerializerMap propertySerializerMap = this._dynamicSerializers;
            JsonSerializer<Object> serializerFor = propertySerializerMap.serializerFor(cls);
            if (serializerFor == null) {
                serializerFor = _findAndAddDynamic(propertySerializerMap, cls, serializerProvider);
            }
            serializerFor.serialize(obj, jsonGenerator, serializerProvider);
        }
    }

    public static class EnumKeySerializer extends StdSerializer<Object> {
        protected final EnumValues _values;

        protected EnumKeySerializer(Class<?> cls, EnumValues enumValues) {
            super(cls, false);
            this._values = enumValues;
        }

        public static EnumKeySerializer construct(Class<?> cls, EnumValues enumValues) {
            return new EnumKeySerializer(cls, enumValues);
        }

        public void serialize(Object obj, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) {
            if (serializerProvider.isEnabled(SerializationFeature.WRITE_ENUMS_USING_TO_STRING)) {
                jsonGenerator.writeFieldName(obj.toString());
                return;
            }
            Enum enumR = (Enum) obj;
            if (serializerProvider.isEnabled(SerializationFeature.WRITE_ENUMS_USING_INDEX)) {
                jsonGenerator.writeFieldName(String.valueOf(enumR.ordinal()));
            } else {
                jsonGenerator.writeFieldName(this._values.serializedValueFor(enumR));
            }
        }
    }

    public static class StringKeySerializer extends StdSerializer<Object> {
        public StringKeySerializer() {
            super(String.class, false);
        }

        public void serialize(Object obj, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) {
            jsonGenerator.writeFieldName((String) obj);
        }
    }

    private StdKeySerializers() {
    }

    @Deprecated
    public static JsonSerializer<Object> getDefault() {
        return DEFAULT_KEY_SERIALIZER;
    }

    public static JsonSerializer<Object> getFallbackKeySerializer(SerializationConfig serializationConfig, Class<?> cls) {
        if (cls != null) {
            if (cls == Enum.class) {
                return new Dynamic();
            }
            if (cls.isEnum()) {
                return EnumKeySerializer.construct(cls, EnumValues.constructFromName(serializationConfig, cls));
            }
        }
        return DEFAULT_KEY_SERIALIZER;
    }

    public static JsonSerializer<Object> getStdKeySerializer(SerializationConfig serializationConfig, Class<?> cls, boolean z10) {
        if (cls == null || cls == Object.class) {
            return new Dynamic();
        }
        if (cls == String.class) {
            return DEFAULT_STRING_SERIALIZER;
        }
        if (cls.isPrimitive() || Number.class.isAssignableFrom(cls)) {
            return new Default(5, cls);
        }
        if (cls == Class.class) {
            return new Default(3, cls);
        }
        if (Date.class.isAssignableFrom(cls)) {
            return new Default(1, cls);
        }
        if (Calendar.class.isAssignableFrom(cls)) {
            return new Default(2, cls);
        }
        if (cls == UUID.class) {
            return new Default(5, cls);
        }
        if (z10) {
            return DEFAULT_KEY_SERIALIZER;
        }
        return null;
    }
}
