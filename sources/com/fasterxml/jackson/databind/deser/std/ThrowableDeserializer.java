package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.deser.BeanDeserializer;
import com.fasterxml.jackson.databind.deser.BeanDeserializerBase;
import com.fasterxml.jackson.databind.deser.SettableAnyProperty;
import com.fasterxml.jackson.databind.deser.SettableBeanProperty;
import com.fasterxml.jackson.databind.util.NameTransformer;
import java.util.Set;

public class ThrowableDeserializer extends BeanDeserializer {
    protected static final String PROP_NAME_MESSAGE = "message";
    private static final long serialVersionUID = 1;

    public ThrowableDeserializer(BeanDeserializer beanDeserializer) {
        super(beanDeserializer);
        this._vanillaProcessing = false;
    }

    public Object deserializeFromObject(JsonParser jsonParser, DeserializationContext deserializationContext) {
        Object createUsingDefault;
        if (this._propertyBasedCreator != null) {
            return _deserializeUsingPropertyBased(jsonParser, deserializationContext);
        }
        JsonDeserializer<Object> jsonDeserializer = this._delegateDeserializer;
        if (jsonDeserializer != null) {
            return this._valueInstantiator.createUsingDelegate(deserializationContext, jsonDeserializer.deserialize(jsonParser, deserializationContext));
        }
        if (this._beanType.isAbstract()) {
            return deserializationContext.handleMissingInstantiator(handledType(), jsonParser, "abstract type (need to add/enable type information?)", new Object[0]);
        }
        boolean canCreateFromString = this._valueInstantiator.canCreateFromString();
        boolean canCreateUsingDefault = this._valueInstantiator.canCreateUsingDefault();
        if (!canCreateFromString && !canCreateUsingDefault) {
            return deserializationContext.handleMissingInstantiator(handledType(), jsonParser, "Throwable needs a default contructor, a single-String-arg constructor; or explicit @JsonCreator", new Object[0]);
        }
        int i10 = 0;
        Object obj = null;
        Object[] objArr = null;
        while (jsonParser.getCurrentToken() != JsonToken.END_OBJECT) {
            String currentName = jsonParser.getCurrentName();
            SettableBeanProperty find = this._beanProperties.find(currentName);
            jsonParser.nextToken();
            if (find != null) {
                if (obj != null) {
                    find.deserializeAndSet(jsonParser, deserializationContext, obj);
                } else {
                    if (objArr == null) {
                        int size = this._beanProperties.size();
                        objArr = new Object[(size + size)];
                    }
                    int i11 = i10 + 1;
                    objArr[i10] = find;
                    i10 += 2;
                    objArr[i11] = find.deserialize(jsonParser, deserializationContext);
                }
            } else if (!"message".equals(currentName) || !canCreateFromString) {
                Set<String> set = this._ignorableProps;
                if (set == null || !set.contains(currentName)) {
                    SettableAnyProperty settableAnyProperty = this._anySetter;
                    if (settableAnyProperty != null) {
                        settableAnyProperty.deserializeAndSet(jsonParser, deserializationContext, obj, currentName);
                    } else {
                        handleUnknownProperty(jsonParser, deserializationContext, obj, currentName);
                    }
                } else {
                    jsonParser.skipChildren();
                }
            } else {
                obj = this._valueInstantiator.createFromString(deserializationContext, jsonParser.getText());
                if (objArr != null) {
                    for (int i12 = 0; i12 < i10; i12 += 2) {
                        ((SettableBeanProperty) objArr[i12]).set(obj, objArr[i12 + 1]);
                    }
                    objArr = null;
                }
            }
            jsonParser.nextToken();
        }
        if (obj == null) {
            if (canCreateFromString) {
                createUsingDefault = this._valueInstantiator.createFromString(deserializationContext, (String) null);
            } else {
                createUsingDefault = this._valueInstantiator.createUsingDefault(deserializationContext);
            }
            obj = createUsingDefault;
            if (objArr != null) {
                for (int i13 = 0; i13 < i10; i13 += 2) {
                    ((SettableBeanProperty) objArr[i13]).set(obj, objArr[i13 + 1]);
                }
            }
        }
        return obj;
    }

    public JsonDeserializer<Object> unwrappingDeserializer(NameTransformer nameTransformer) {
        if (getClass() != ThrowableDeserializer.class) {
            return this;
        }
        return new ThrowableDeserializer(this, nameTransformer);
    }

    protected ThrowableDeserializer(BeanDeserializer beanDeserializer, NameTransformer nameTransformer) {
        super((BeanDeserializerBase) beanDeserializer, nameTransformer);
    }
}
