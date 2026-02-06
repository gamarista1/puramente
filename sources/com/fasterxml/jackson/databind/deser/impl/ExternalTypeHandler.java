package com.fasterxml.jackson.databind.deser.impl;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.deser.SettableBeanProperty;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import com.fasterxml.jackson.databind.util.TokenBuffer;
import java.util.ArrayList;
import java.util.HashMap;

public class ExternalTypeHandler {
    private final HashMap<String, Integer> _nameToPropertyIndex;
    private final ExtTypedProperty[] _properties;
    private final TokenBuffer[] _tokens;
    private final String[] _typeIds;

    private static final class ExtTypedProperty {
        private final SettableBeanProperty _property;
        private final TypeDeserializer _typeDeserializer;
        private SettableBeanProperty _typeProperty;
        private final String _typePropertyName;

        public ExtTypedProperty(SettableBeanProperty settableBeanProperty, TypeDeserializer typeDeserializer) {
            this._property = settableBeanProperty;
            this._typeDeserializer = typeDeserializer;
            this._typePropertyName = typeDeserializer.getPropertyName();
        }

        public String getDefaultTypeId() {
            Class<?> defaultImpl = this._typeDeserializer.getDefaultImpl();
            if (defaultImpl == null) {
                return null;
            }
            return this._typeDeserializer.getTypeIdResolver().idFromValueAndType((Object) null, defaultImpl);
        }

        public SettableBeanProperty getProperty() {
            return this._property;
        }

        public SettableBeanProperty getTypeProperty() {
            return this._typeProperty;
        }

        public String getTypePropertyName() {
            return this._typePropertyName;
        }

        public boolean hasDefaultType() {
            if (this._typeDeserializer.getDefaultImpl() != null) {
                return true;
            }
            return false;
        }

        public boolean hasTypePropertyName(String str) {
            return str.equals(this._typePropertyName);
        }

        public void linkTypeProperty(SettableBeanProperty settableBeanProperty) {
            this._typeProperty = settableBeanProperty;
        }
    }

    protected ExternalTypeHandler(ExtTypedProperty[] extTypedPropertyArr, HashMap<String, Integer> hashMap, String[] strArr, TokenBuffer[] tokenBufferArr) {
        this._properties = extTypedPropertyArr;
        this._nameToPropertyIndex = hashMap;
        this._typeIds = strArr;
        this._tokens = tokenBufferArr;
    }

    /* access modifiers changed from: protected */
    public final Object _deserialize(JsonParser jsonParser, DeserializationContext deserializationContext, int i10, String str) {
        JsonParser asParser = this._tokens[i10].asParser(jsonParser);
        if (asParser.nextToken() == JsonToken.VALUE_NULL) {
            return null;
        }
        TokenBuffer tokenBuffer = new TokenBuffer(jsonParser, deserializationContext);
        tokenBuffer.writeStartArray();
        tokenBuffer.writeString(str);
        tokenBuffer.copyCurrentStructure(asParser);
        tokenBuffer.writeEndArray();
        JsonParser asParser2 = tokenBuffer.asParser(jsonParser);
        asParser2.nextToken();
        return this._properties[i10].getProperty().deserialize(asParser2, deserializationContext);
    }

    /* access modifiers changed from: protected */
    public final void _deserializeAndSet(JsonParser jsonParser, DeserializationContext deserializationContext, Object obj, int i10, String str) {
        JsonParser asParser = this._tokens[i10].asParser(jsonParser);
        if (asParser.nextToken() == JsonToken.VALUE_NULL) {
            this._properties[i10].getProperty().set(obj, (Object) null);
            return;
        }
        TokenBuffer tokenBuffer = new TokenBuffer(jsonParser, deserializationContext);
        tokenBuffer.writeStartArray();
        tokenBuffer.writeString(str);
        tokenBuffer.copyCurrentStructure(asParser);
        tokenBuffer.writeEndArray();
        JsonParser asParser2 = tokenBuffer.asParser(jsonParser);
        asParser2.nextToken();
        this._properties[i10].getProperty().deserializeAndSet(asParser2, deserializationContext, obj);
    }

    public Object complete(JsonParser jsonParser, DeserializationContext deserializationContext, Object obj) {
        int length = this._properties.length;
        for (int i10 = 0; i10 < length; i10++) {
            String str = this._typeIds[i10];
            if (str == null) {
                TokenBuffer tokenBuffer = this._tokens[i10];
                if (tokenBuffer != null) {
                    JsonToken firstToken = tokenBuffer.firstToken();
                    if (firstToken != null && firstToken.isScalarValue()) {
                        JsonParser asParser = tokenBuffer.asParser(jsonParser);
                        asParser.nextToken();
                        SettableBeanProperty property = this._properties[i10].getProperty();
                        Object deserializeIfNatural = TypeDeserializer.deserializeIfNatural(asParser, deserializationContext, property.getType());
                        if (deserializeIfNatural != null) {
                            property.set(obj, deserializeIfNatural);
                        } else if (!this._properties[i10].hasDefaultType()) {
                            deserializationContext.reportMappingException("Missing external type id property '%s'", this._properties[i10].getTypePropertyName());
                        } else {
                            str = this._properties[i10].getDefaultTypeId();
                        }
                    }
                }
            } else if (this._tokens[i10] == null) {
                SettableBeanProperty property2 = this._properties[i10].getProperty();
                if (property2.isRequired() || deserializationContext.isEnabled(DeserializationFeature.FAIL_ON_MISSING_EXTERNAL_TYPE_ID_PROPERTY)) {
                    deserializationContext.reportMappingException("Missing property '%s' for external type id '%s'", property2.getName(), this._properties[i10].getTypePropertyName());
                }
                return obj;
            }
            _deserializeAndSet(jsonParser, deserializationContext, obj, i10, str);
        }
        return obj;
    }

    public boolean handlePropertyValue(JsonParser jsonParser, DeserializationContext deserializationContext, String str, Object obj) {
        Integer num = this._nameToPropertyIndex.get(str);
        if (num == null) {
            return false;
        }
        int intValue = num.intValue();
        if (this._properties[intValue].hasTypePropertyName(str)) {
            this._typeIds[intValue] = jsonParser.getText();
            jsonParser.skipChildren();
            if (obj == null || this._tokens[intValue] == null) {
                return true;
            }
        } else {
            TokenBuffer tokenBuffer = new TokenBuffer(jsonParser, deserializationContext);
            tokenBuffer.copyCurrentStructure(jsonParser);
            this._tokens[intValue] = tokenBuffer;
            if (obj == null || this._typeIds[intValue] == null) {
                return true;
            }
        }
        String[] strArr = this._typeIds;
        String str2 = strArr[intValue];
        strArr[intValue] = null;
        _deserializeAndSet(jsonParser, deserializationContext, obj, intValue, str2);
        this._tokens[intValue] = null;
        return true;
    }

    public boolean handleTypePropertyValue(JsonParser jsonParser, DeserializationContext deserializationContext, String str, Object obj) {
        Integer num = this._nameToPropertyIndex.get(str);
        if (num == null) {
            return false;
        }
        int intValue = num.intValue();
        if (!this._properties[intValue].hasTypePropertyName(str)) {
            return false;
        }
        String text = jsonParser.getText();
        if (obj == null || this._tokens[intValue] == null) {
            this._typeIds[intValue] = text;
            return true;
        }
        _deserializeAndSet(jsonParser, deserializationContext, obj, intValue, text);
        this._tokens[intValue] = null;
        return true;
    }

    public ExternalTypeHandler start() {
        return new ExternalTypeHandler(this);
    }

    protected ExternalTypeHandler(ExternalTypeHandler externalTypeHandler) {
        ExtTypedProperty[] extTypedPropertyArr = externalTypeHandler._properties;
        this._properties = extTypedPropertyArr;
        this._nameToPropertyIndex = externalTypeHandler._nameToPropertyIndex;
        int length = extTypedPropertyArr.length;
        this._typeIds = new String[length];
        this._tokens = new TokenBuffer[length];
    }

    public static class Builder {
        private final HashMap<String, Integer> _nameToPropertyIndex = new HashMap<>();
        private final ArrayList<ExtTypedProperty> _properties = new ArrayList<>();

        public void addExternal(SettableBeanProperty settableBeanProperty, TypeDeserializer typeDeserializer) {
            Integer valueOf = Integer.valueOf(this._properties.size());
            this._properties.add(new ExtTypedProperty(settableBeanProperty, typeDeserializer));
            this._nameToPropertyIndex.put(settableBeanProperty.getName(), valueOf);
            this._nameToPropertyIndex.put(typeDeserializer.getPropertyName(), valueOf);
        }

        public ExternalTypeHandler build(BeanPropertyMap beanPropertyMap) {
            int size = this._properties.size();
            ExtTypedProperty[] extTypedPropertyArr = new ExtTypedProperty[size];
            for (int i10 = 0; i10 < size; i10++) {
                ExtTypedProperty extTypedProperty = this._properties.get(i10);
                SettableBeanProperty find = beanPropertyMap.find(extTypedProperty.getTypePropertyName());
                if (find != null) {
                    extTypedProperty.linkTypeProperty(find);
                }
                extTypedPropertyArr[i10] = extTypedProperty;
            }
            return new ExternalTypeHandler(extTypedPropertyArr, this._nameToPropertyIndex, (String[]) null, (TokenBuffer[]) null);
        }

        @Deprecated
        public ExternalTypeHandler build() {
            ArrayList<ExtTypedProperty> arrayList = this._properties;
            return new ExternalTypeHandler((ExtTypedProperty[]) arrayList.toArray(new ExtTypedProperty[arrayList.size()]), this._nameToPropertyIndex, (String[]) null, (TokenBuffer[]) null);
        }
    }

    public Object complete(JsonParser jsonParser, DeserializationContext deserializationContext, PropertyValueBuffer propertyValueBuffer, PropertyBasedCreator propertyBasedCreator) {
        int length = this._properties.length;
        Object[] objArr = new Object[length];
        for (int i10 = 0; i10 < length; i10++) {
            String str = this._typeIds[i10];
            ExtTypedProperty extTypedProperty = this._properties[i10];
            if (str == null) {
                if (this._tokens[i10] == null) {
                } else if (!extTypedProperty.hasDefaultType()) {
                    deserializationContext.reportMappingException("Missing external type id property '%s'", extTypedProperty.getTypePropertyName());
                } else {
                    str = extTypedProperty.getDefaultTypeId();
                }
            } else if (this._tokens[i10] == null) {
                deserializationContext.reportMappingException("Missing property '%s' for external type id '%s'", extTypedProperty.getProperty().getName(), this._properties[i10].getTypePropertyName());
            }
            objArr[i10] = _deserialize(jsonParser, deserializationContext, i10, str);
            SettableBeanProperty property = extTypedProperty.getProperty();
            if (property.getCreatorIndex() >= 0) {
                propertyValueBuffer.assignParameter(property, objArr[i10]);
                SettableBeanProperty typeProperty = extTypedProperty.getTypeProperty();
                if (typeProperty != null && typeProperty.getCreatorIndex() >= 0) {
                    propertyValueBuffer.assignParameter(typeProperty, str);
                }
            }
        }
        Object build = propertyBasedCreator.build(deserializationContext, propertyValueBuffer);
        for (int i11 = 0; i11 < length; i11++) {
            SettableBeanProperty property2 = this._properties[i11].getProperty();
            if (property2.getCreatorIndex() < 0) {
                property2.set(build, objArr[i11]);
            }
        }
        return build;
    }
}
