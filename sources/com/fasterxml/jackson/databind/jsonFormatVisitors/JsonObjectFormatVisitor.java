package com.fasterxml.jackson.databind.jsonFormatVisitors;

import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.SerializerProvider;

public interface JsonObjectFormatVisitor extends JsonFormatVisitorWithSerializerProvider {

    public static class Base implements JsonObjectFormatVisitor {
        protected SerializerProvider _provider;

        public Base() {
        }

        public SerializerProvider getProvider() {
            return this._provider;
        }

        public void optionalProperty(BeanProperty beanProperty) {
        }

        public void property(BeanProperty beanProperty) {
        }

        public void setProvider(SerializerProvider serializerProvider) {
            this._provider = serializerProvider;
        }

        public Base(SerializerProvider serializerProvider) {
            this._provider = serializerProvider;
        }

        public void optionalProperty(String str, JsonFormatVisitable jsonFormatVisitable, JavaType javaType) {
        }

        public void property(String str, JsonFormatVisitable jsonFormatVisitable, JavaType javaType) {
        }
    }

    void optionalProperty(BeanProperty beanProperty);

    void optionalProperty(String str, JsonFormatVisitable jsonFormatVisitable, JavaType javaType);

    void property(BeanProperty beanProperty);

    void property(String str, JsonFormatVisitable jsonFormatVisitable, JavaType javaType);
}
