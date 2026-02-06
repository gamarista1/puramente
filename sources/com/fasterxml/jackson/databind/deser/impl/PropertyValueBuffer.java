package com.fasterxml.jackson.databind.deser.impl;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.deser.SettableAnyProperty;
import com.fasterxml.jackson.databind.deser.SettableBeanProperty;
import com.fasterxml.jackson.databind.deser.impl.PropertyValue;
import java.util.BitSet;

public class PropertyValueBuffer {
    protected PropertyValue _buffered;
    protected final DeserializationContext _context;
    protected final Object[] _creatorParameters;
    protected Object _idValue;
    protected final ObjectIdReader _objectIdReader;
    protected int _paramsNeeded;
    protected int _paramsSeen;
    protected final BitSet _paramsSeenBig;
    protected final JsonParser _parser;

    public PropertyValueBuffer(JsonParser jsonParser, DeserializationContext deserializationContext, int i10, ObjectIdReader objectIdReader) {
        this._parser = jsonParser;
        this._context = deserializationContext;
        this._paramsNeeded = i10;
        this._objectIdReader = objectIdReader;
        this._creatorParameters = new Object[i10];
        if (i10 < 32) {
            this._paramsSeenBig = null;
        } else {
            this._paramsSeenBig = new BitSet();
        }
    }

    /* access modifiers changed from: protected */
    public Object _findMissing(SettableBeanProperty settableBeanProperty) {
        if (settableBeanProperty.getInjectableValueId() != null) {
            return this._context.findInjectableValue(settableBeanProperty.getInjectableValueId(), settableBeanProperty, (Object) null);
        }
        if (settableBeanProperty.isRequired()) {
            this._context.reportMappingException("Missing required creator property '%s' (index %d)", settableBeanProperty.getName(), Integer.valueOf(settableBeanProperty.getCreatorIndex()));
        }
        if (this._context.isEnabled(DeserializationFeature.FAIL_ON_MISSING_CREATOR_PROPERTIES)) {
            this._context.reportMappingException("Missing creator property '%s' (index %d); DeserializationFeature.FAIL_ON_MISSING_CREATOR_PROPERTIES enabled", settableBeanProperty.getName(), Integer.valueOf(settableBeanProperty.getCreatorIndex()));
        }
        return settableBeanProperty.getValueDeserializer().getNullValue(this._context);
    }

    public boolean assignParameter(SettableBeanProperty settableBeanProperty, Object obj) {
        int creatorIndex = settableBeanProperty.getCreatorIndex();
        this._creatorParameters[creatorIndex] = obj;
        BitSet bitSet = this._paramsSeenBig;
        if (bitSet == null) {
            int i10 = this._paramsSeen;
            int i11 = (1 << creatorIndex) | i10;
            if (i10 != i11) {
                this._paramsSeen = i11;
                int i12 = this._paramsNeeded - 1;
                this._paramsNeeded = i12;
                if (i12 <= 0) {
                    if (this._objectIdReader == null || this._idValue != null) {
                        return true;
                    }
                    return false;
                }
            }
        } else if (!bitSet.get(creatorIndex)) {
            this._paramsSeenBig.set(creatorIndex);
            this._paramsNeeded--;
        }
        return false;
    }

    public void bufferAnyProperty(SettableAnyProperty settableAnyProperty, String str, Object obj) {
        this._buffered = new PropertyValue.Any(this._buffered, obj, settableAnyProperty, str);
    }

    public void bufferMapProperty(Object obj, Object obj2) {
        this._buffered = new PropertyValue.Map(this._buffered, obj2, obj);
    }

    public void bufferProperty(SettableBeanProperty settableBeanProperty, Object obj) {
        this._buffered = new PropertyValue.Regular(this._buffered, obj, settableBeanProperty);
    }

    /* access modifiers changed from: protected */
    public PropertyValue buffered() {
        return this._buffered;
    }

    public Object getParameter(SettableBeanProperty settableBeanProperty) {
        Object obj;
        if (hasParameter(settableBeanProperty)) {
            obj = this._creatorParameters[settableBeanProperty.getCreatorIndex()];
        } else {
            Object[] objArr = this._creatorParameters;
            int creatorIndex = settableBeanProperty.getCreatorIndex();
            Object _findMissing = _findMissing(settableBeanProperty);
            objArr[creatorIndex] = _findMissing;
            obj = _findMissing;
        }
        if (obj != null || !this._context.isEnabled(DeserializationFeature.FAIL_ON_NULL_CREATOR_PROPERTIES)) {
            return obj;
        }
        throw this._context.mappingException("Null value for creator property '%s'; DeserializationFeature.FAIL_ON_NULL_FOR_CREATOR_PARAMETERS enabled", settableBeanProperty.getName(), Integer.valueOf(settableBeanProperty.getCreatorIndex()));
    }

    public Object[] getParameters(SettableBeanProperty[] settableBeanPropertyArr) {
        if (this._paramsNeeded > 0) {
            if (this._paramsSeenBig != null) {
                int length = this._creatorParameters.length;
                int i10 = 0;
                while (true) {
                    int nextClearBit = this._paramsSeenBig.nextClearBit(i10);
                    if (nextClearBit >= length) {
                        break;
                    }
                    this._creatorParameters[nextClearBit] = _findMissing(settableBeanPropertyArr[nextClearBit]);
                    i10 = nextClearBit + 1;
                }
            } else {
                int i11 = this._paramsSeen;
                int length2 = this._creatorParameters.length;
                int i12 = 0;
                while (i12 < length2) {
                    if ((i11 & 1) == 0) {
                        this._creatorParameters[i12] = _findMissing(settableBeanPropertyArr[i12]);
                    }
                    i12++;
                    i11 >>= 1;
                }
            }
        }
        if (this._context.isEnabled(DeserializationFeature.FAIL_ON_NULL_CREATOR_PROPERTIES)) {
            for (int i13 = 0; i13 < settableBeanPropertyArr.length; i13++) {
                if (this._creatorParameters[i13] == null) {
                    this._context.reportMappingException("Null value for creator property '%s'; DeserializationFeature.FAIL_ON_NULL_FOR_CREATOR_PARAMETERS enabled", settableBeanPropertyArr[i13].getName(), Integer.valueOf(settableBeanPropertyArr[i13].getCreatorIndex()));
                }
            }
        }
        return this._creatorParameters;
    }

    public Object handleIdValue(DeserializationContext deserializationContext, Object obj) {
        ObjectIdReader objectIdReader = this._objectIdReader;
        if (objectIdReader != null) {
            Object obj2 = this._idValue;
            if (obj2 != null) {
                deserializationContext.findObjectId(obj2, objectIdReader.generator, objectIdReader.resolver).bindItem(obj);
                SettableBeanProperty settableBeanProperty = this._objectIdReader.idProperty;
                if (settableBeanProperty != null) {
                    return settableBeanProperty.setAndReturn(obj, this._idValue);
                }
            } else {
                deserializationContext.reportUnresolvedObjectId(objectIdReader, obj);
            }
        }
        return obj;
    }

    public final boolean hasParameter(SettableBeanProperty settableBeanProperty) {
        BitSet bitSet = this._paramsSeenBig;
        if (bitSet != null) {
            return bitSet.get(settableBeanProperty.getCreatorIndex());
        }
        if (((this._paramsSeen >> settableBeanProperty.getCreatorIndex()) & 1) == 1) {
            return true;
        }
        return false;
    }

    public boolean isComplete() {
        if (this._paramsNeeded <= 0) {
            return true;
        }
        return false;
    }

    public boolean readIdProperty(String str) {
        ObjectIdReader objectIdReader = this._objectIdReader;
        if (objectIdReader == null || !str.equals(objectIdReader.propertyName.getSimpleName())) {
            return false;
        }
        this._idValue = this._objectIdReader.readObjectReference(this._parser, this._context);
        return true;
    }
}
