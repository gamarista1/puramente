package com.fasterxml.jackson.databind.deser.impl;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.deser.BeanDeserializerBase;
import com.fasterxml.jackson.databind.deser.SettableBeanProperty;
import com.fasterxml.jackson.databind.util.NameTransformer;
import java.util.Set;

public class BeanAsArrayDeserializer extends BeanDeserializerBase {
    private static final long serialVersionUID = 1;
    protected final BeanDeserializerBase _delegate;
    protected final SettableBeanProperty[] _orderedProperties;

    public BeanAsArrayDeserializer(BeanDeserializerBase beanDeserializerBase, SettableBeanProperty[] settableBeanPropertyArr) {
        super(beanDeserializerBase);
        this._delegate = beanDeserializerBase;
        this._orderedProperties = settableBeanPropertyArr;
    }

    /* access modifiers changed from: protected */
    public Object _deserializeFromNonArray(JsonParser jsonParser, DeserializationContext deserializationContext) {
        return deserializationContext.handleUnexpectedToken(handledType(), jsonParser.getCurrentToken(), jsonParser, "Can not deserialize a POJO (of type %s) from non-Array representation (token: %s): type/property designed to be serialized as JSON Array", this._beanType.getRawClass().getName(), jsonParser.getCurrentToken());
    }

    /* access modifiers changed from: protected */
    public Object _deserializeNonVanilla(JsonParser jsonParser, DeserializationContext deserializationContext) {
        Class<?> cls;
        if (this._nonStandardCreation) {
            return deserializeFromObjectUsingNonDefault(jsonParser, deserializationContext);
        }
        Object createUsingDefault = this._valueInstantiator.createUsingDefault(deserializationContext);
        jsonParser.setCurrentValue(createUsingDefault);
        if (this._injectables != null) {
            injectValues(deserializationContext, createUsingDefault);
        }
        if (this._needViewProcesing) {
            cls = deserializationContext.getActiveView();
        } else {
            cls = null;
        }
        SettableBeanProperty[] settableBeanPropertyArr = this._orderedProperties;
        int length = settableBeanPropertyArr.length;
        int i10 = 0;
        while (true) {
            JsonToken nextToken = jsonParser.nextToken();
            JsonToken jsonToken = JsonToken.END_ARRAY;
            if (nextToken == jsonToken) {
                return createUsingDefault;
            }
            if (i10 == length) {
                if (!this._ignoreAllUnknown) {
                    deserializationContext.reportWrongTokenException(jsonParser, jsonToken, "Unexpected JSON values; expected at most %d properties (in JSON Array)", Integer.valueOf(length));
                }
                do {
                    jsonParser.skipChildren();
                } while (jsonParser.nextToken() != JsonToken.END_ARRAY);
                return createUsingDefault;
            }
            SettableBeanProperty settableBeanProperty = settableBeanPropertyArr[i10];
            i10++;
            if (settableBeanProperty == null || (cls != null && !settableBeanProperty.visibleInView(cls))) {
                jsonParser.skipChildren();
            } else {
                try {
                    settableBeanProperty.deserializeAndSet(jsonParser, deserializationContext, createUsingDefault);
                } catch (Exception e10) {
                    wrapAndThrow((Throwable) e10, createUsingDefault, settableBeanProperty.getName(), deserializationContext);
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    public final Object _deserializeUsingPropertyBased(JsonParser jsonParser, DeserializationContext deserializationContext) {
        SettableBeanProperty settableBeanProperty;
        PropertyBasedCreator propertyBasedCreator = this._propertyBasedCreator;
        PropertyValueBuffer startBuilding = propertyBasedCreator.startBuilding(jsonParser, deserializationContext, this._objectIdReader);
        SettableBeanProperty[] settableBeanPropertyArr = this._orderedProperties;
        int length = settableBeanPropertyArr.length;
        int i10 = 0;
        Object obj = null;
        while (jsonParser.nextToken() != JsonToken.END_ARRAY) {
            if (i10 < length) {
                settableBeanProperty = settableBeanPropertyArr[i10];
            } else {
                settableBeanProperty = null;
            }
            if (settableBeanProperty == null) {
                jsonParser.skipChildren();
            } else if (obj != null) {
                try {
                    settableBeanProperty.deserializeAndSet(jsonParser, deserializationContext, obj);
                } catch (Exception e10) {
                    wrapAndThrow((Throwable) e10, obj, settableBeanProperty.getName(), deserializationContext);
                }
            } else {
                String name = settableBeanProperty.getName();
                SettableBeanProperty findCreatorProperty = propertyBasedCreator.findCreatorProperty(name);
                if (findCreatorProperty != null) {
                    if (startBuilding.assignParameter(findCreatorProperty, findCreatorProperty.deserialize(jsonParser, deserializationContext))) {
                        try {
                            obj = propertyBasedCreator.build(deserializationContext, startBuilding);
                            jsonParser.setCurrentValue(obj);
                            if (obj.getClass() != this._beanType.getRawClass()) {
                                deserializationContext.reportMappingException("Can not support implicit polymorphic deserialization for POJOs-as-Arrays style: nominal type %s, actual type %s", this._beanType.getRawClass().getName(), obj.getClass().getName());
                            }
                        } catch (Exception e11) {
                            wrapAndThrow((Throwable) e11, (Object) this._beanType.getRawClass(), name, deserializationContext);
                        }
                    }
                } else if (!startBuilding.readIdProperty(name)) {
                    startBuilding.bufferProperty(settableBeanProperty, settableBeanProperty.deserialize(jsonParser, deserializationContext));
                }
            }
            i10++;
        }
        if (obj != null) {
            return obj;
        }
        try {
            return propertyBasedCreator.build(deserializationContext, startBuilding);
        } catch (Exception e12) {
            return wrapInstantiationProblem(e12, deserializationContext);
        }
    }

    /* access modifiers changed from: protected */
    public BeanDeserializerBase asArrayDeserializer() {
        return this;
    }

    public Object deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) {
        if (!jsonParser.isExpectedStartArrayToken()) {
            return _deserializeFromNonArray(jsonParser, deserializationContext);
        }
        if (!this._vanillaProcessing) {
            return _deserializeNonVanilla(jsonParser, deserializationContext);
        }
        Object createUsingDefault = this._valueInstantiator.createUsingDefault(deserializationContext);
        jsonParser.setCurrentValue(createUsingDefault);
        SettableBeanProperty[] settableBeanPropertyArr = this._orderedProperties;
        int length = settableBeanPropertyArr.length;
        int i10 = 0;
        while (true) {
            JsonToken nextToken = jsonParser.nextToken();
            JsonToken jsonToken = JsonToken.END_ARRAY;
            if (nextToken == jsonToken) {
                return createUsingDefault;
            }
            if (i10 == length) {
                if (!this._ignoreAllUnknown) {
                    deserializationContext.reportWrongTokenException(jsonParser, jsonToken, "Unexpected JSON values; expected at most %d properties (in JSON Array)", Integer.valueOf(length));
                }
                do {
                    jsonParser.skipChildren();
                } while (jsonParser.nextToken() != JsonToken.END_ARRAY);
                return createUsingDefault;
            }
            SettableBeanProperty settableBeanProperty = settableBeanPropertyArr[i10];
            if (settableBeanProperty != null) {
                try {
                    settableBeanProperty.deserializeAndSet(jsonParser, deserializationContext, createUsingDefault);
                } catch (Exception e10) {
                    wrapAndThrow((Throwable) e10, createUsingDefault, settableBeanProperty.getName(), deserializationContext);
                }
            } else {
                jsonParser.skipChildren();
            }
            i10++;
        }
    }

    public Object deserializeFromObject(JsonParser jsonParser, DeserializationContext deserializationContext) {
        return _deserializeFromNonArray(jsonParser, deserializationContext);
    }

    public JsonDeserializer<Object> unwrappingDeserializer(NameTransformer nameTransformer) {
        return this._delegate.unwrappingDeserializer(nameTransformer);
    }

    public BeanDeserializerBase withBeanProperties(BeanPropertyMap beanPropertyMap) {
        return new BeanAsArrayDeserializer(this._delegate.withBeanProperties(beanPropertyMap), this._orderedProperties);
    }

    public BeanDeserializerBase withIgnorableProperties(Set<String> set) {
        return new BeanAsArrayDeserializer(this._delegate.withIgnorableProperties(set), this._orderedProperties);
    }

    public BeanDeserializerBase withObjectIdReader(ObjectIdReader objectIdReader) {
        return new BeanAsArrayDeserializer(this._delegate.withObjectIdReader(objectIdReader), this._orderedProperties);
    }

    public Object deserialize(JsonParser jsonParser, DeserializationContext deserializationContext, Object obj) {
        jsonParser.setCurrentValue(obj);
        if (this._injectables != null) {
            injectValues(deserializationContext, obj);
        }
        SettableBeanProperty[] settableBeanPropertyArr = this._orderedProperties;
        int length = settableBeanPropertyArr.length;
        int i10 = 0;
        while (true) {
            JsonToken nextToken = jsonParser.nextToken();
            JsonToken jsonToken = JsonToken.END_ARRAY;
            if (nextToken == jsonToken) {
                return obj;
            }
            if (i10 == length) {
                if (!this._ignoreAllUnknown) {
                    deserializationContext.reportWrongTokenException(jsonParser, jsonToken, "Unexpected JSON values; expected at most %d properties (in JSON Array)", Integer.valueOf(length));
                }
                do {
                    jsonParser.skipChildren();
                } while (jsonParser.nextToken() != JsonToken.END_ARRAY);
                return obj;
            }
            SettableBeanProperty settableBeanProperty = settableBeanPropertyArr[i10];
            if (settableBeanProperty != null) {
                try {
                    settableBeanProperty.deserializeAndSet(jsonParser, deserializationContext, obj);
                } catch (Exception e10) {
                    wrapAndThrow((Throwable) e10, obj, settableBeanProperty.getName(), deserializationContext);
                }
            } else {
                jsonParser.skipChildren();
            }
            i10++;
        }
    }
}
