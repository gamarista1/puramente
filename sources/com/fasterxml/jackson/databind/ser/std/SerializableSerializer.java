package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonSerializable;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.annotation.JacksonStdImpl;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;
import java.util.concurrent.atomic.AtomicReference;

@JacksonStdImpl
public class SerializableSerializer extends StdSerializer<JsonSerializable> {
    private static final AtomicReference<ObjectMapper> _mapperReference = new AtomicReference<>();
    public static final SerializableSerializer instance = new SerializableSerializer();

    protected SerializableSerializer() {
        super(JsonSerializable.class);
    }

    private static final synchronized ObjectMapper _getObjectMapper() {
        ObjectMapper objectMapper;
        synchronized (SerializableSerializer.class) {
            AtomicReference<ObjectMapper> atomicReference = _mapperReference;
            objectMapper = atomicReference.get();
            if (objectMapper == null) {
                objectMapper = new ObjectMapper();
                atomicReference.set(objectMapper);
            }
        }
        return objectMapper;
    }

    public void acceptJsonFormatVisitor(JsonFormatVisitorWrapper jsonFormatVisitorWrapper, JavaType javaType) {
        jsonFormatVisitorWrapper.expectAnyFormat(javaType);
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x004b  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0062  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.fasterxml.jackson.databind.JsonNode getSchema(com.fasterxml.jackson.databind.SerializerProvider r7, java.lang.reflect.Type r8) {
        /*
            r6 = this;
            com.fasterxml.jackson.databind.node.ObjectNode r0 = r6.createObjectNode()
            r1 = 0
            if (r8 == 0) goto L_0x0040
            java.lang.Class r8 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(r8)
            java.lang.Class<com.fasterxml.jackson.databind.jsonschema.JsonSerializableSchema> r2 = com.fasterxml.jackson.databind.jsonschema.JsonSerializableSchema.class
            boolean r3 = r8.isAnnotationPresent(r2)
            if (r3 == 0) goto L_0x0040
            java.lang.annotation.Annotation r8 = r8.getAnnotation(r2)
            com.fasterxml.jackson.databind.jsonschema.JsonSerializableSchema r8 = (com.fasterxml.jackson.databind.jsonschema.JsonSerializableSchema) r8
            java.lang.String r2 = r8.schemaType()
            java.lang.String r3 = r8.schemaObjectPropertiesDefinition()
            java.lang.String r4 = "##irrelevant"
            boolean r3 = r4.equals(r3)
            if (r3 != 0) goto L_0x002e
            java.lang.String r3 = r8.schemaObjectPropertiesDefinition()
            goto L_0x002f
        L_0x002e:
            r3 = r1
        L_0x002f:
            java.lang.String r5 = r8.schemaItemDefinition()
            boolean r4 = r4.equals(r5)
            if (r4 != 0) goto L_0x003d
            java.lang.String r1 = r8.schemaItemDefinition()
        L_0x003d:
            r8 = r1
            r1 = r3
            goto L_0x0043
        L_0x0040:
            java.lang.String r2 = "any"
            r8 = r1
        L_0x0043:
            java.lang.String r3 = "type"
            r0.put((java.lang.String) r3, (java.lang.String) r2)
            r2 = 0
            if (r1 == 0) goto L_0x0060
            java.lang.String r3 = "properties"
            com.fasterxml.jackson.databind.ObjectMapper r4 = _getObjectMapper()     // Catch:{ IOException -> 0x0059 }
            com.fasterxml.jackson.databind.JsonNode r1 = r4.readTree((java.lang.String) r1)     // Catch:{ IOException -> 0x0059 }
            r0.set(r3, r1)     // Catch:{ IOException -> 0x0059 }
            goto L_0x0060
        L_0x0059:
            java.lang.String r1 = "Failed to parse @JsonSerializableSchema.schemaObjectPropertiesDefinition value"
            java.lang.Object[] r3 = new java.lang.Object[r2]
            r7.reportMappingProblem(r1, r3)
        L_0x0060:
            if (r8 == 0) goto L_0x0077
            java.lang.String r1 = "items"
            com.fasterxml.jackson.databind.ObjectMapper r3 = _getObjectMapper()     // Catch:{ IOException -> 0x0070 }
            com.fasterxml.jackson.databind.JsonNode r8 = r3.readTree((java.lang.String) r8)     // Catch:{ IOException -> 0x0070 }
            r0.set(r1, r8)     // Catch:{ IOException -> 0x0070 }
            goto L_0x0077
        L_0x0070:
            java.lang.String r8 = "Failed to parse @JsonSerializableSchema.schemaItemDefinition value"
            java.lang.Object[] r1 = new java.lang.Object[r2]
            r7.reportMappingProblem(r8, r1)
        L_0x0077:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.ser.std.SerializableSerializer.getSchema(com.fasterxml.jackson.databind.SerializerProvider, java.lang.reflect.Type):com.fasterxml.jackson.databind.JsonNode");
    }

    public boolean isEmpty(SerializerProvider serializerProvider, JsonSerializable jsonSerializable) {
        if (jsonSerializable instanceof JsonSerializable.Base) {
            return ((JsonSerializable.Base) jsonSerializable).isEmpty(serializerProvider);
        }
        return false;
    }

    public void serialize(JsonSerializable jsonSerializable, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) {
        jsonSerializable.serialize(jsonGenerator, serializerProvider);
    }

    public final void serializeWithType(JsonSerializable jsonSerializable, JsonGenerator jsonGenerator, SerializerProvider serializerProvider, TypeSerializer typeSerializer) {
        jsonSerializable.serializeWithType(jsonGenerator, serializerProvider, typeSerializer);
    }
}
