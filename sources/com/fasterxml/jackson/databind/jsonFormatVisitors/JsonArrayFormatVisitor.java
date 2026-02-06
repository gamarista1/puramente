package com.fasterxml.jackson.databind.jsonFormatVisitors;

import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.SerializerProvider;

public interface JsonArrayFormatVisitor extends JsonFormatVisitorWithSerializerProvider {

    public static class Base implements JsonArrayFormatVisitor {
        protected SerializerProvider _provider;

        public Base() {
        }

        public SerializerProvider getProvider() {
            return this._provider;
        }

        public void itemsFormat(JsonFormatTypes jsonFormatTypes) {
        }

        public void setProvider(SerializerProvider serializerProvider) {
            this._provider = serializerProvider;
        }

        public Base(SerializerProvider serializerProvider) {
            this._provider = serializerProvider;
        }

        public void itemsFormat(JsonFormatVisitable jsonFormatVisitable, JavaType javaType) {
        }
    }

    void itemsFormat(JsonFormatTypes jsonFormatTypes);

    void itemsFormat(JsonFormatVisitable jsonFormatVisitable, JavaType javaType);
}
