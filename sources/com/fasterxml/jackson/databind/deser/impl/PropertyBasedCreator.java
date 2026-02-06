package com.fasterxml.jackson.databind.deser.impl;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.deser.SettableBeanProperty;
import com.fasterxml.jackson.databind.deser.ValueInstantiator;
import java.util.Collection;
import java.util.HashMap;

public final class PropertyBasedCreator {
    protected final SettableBeanProperty[] _allProperties;
    protected final int _propertyCount;
    protected final HashMap<String, SettableBeanProperty> _propertyLookup;
    protected final ValueInstantiator _valueInstantiator;

    static class CaseInsensitiveMap extends HashMap<String, SettableBeanProperty> {
        private static final long serialVersionUID = 1;

        CaseInsensitiveMap() {
        }

        public SettableBeanProperty get(Object obj) {
            return (SettableBeanProperty) super.get(((String) obj).toLowerCase());
        }

        public SettableBeanProperty put(String str, SettableBeanProperty settableBeanProperty) {
            return (SettableBeanProperty) super.put(str.toLowerCase(), settableBeanProperty);
        }
    }

    protected PropertyBasedCreator(ValueInstantiator valueInstantiator, SettableBeanProperty[] settableBeanPropertyArr, boolean z10) {
        this._valueInstantiator = valueInstantiator;
        if (z10) {
            this._propertyLookup = new CaseInsensitiveMap();
        } else {
            this._propertyLookup = new HashMap<>();
        }
        int length = settableBeanPropertyArr.length;
        this._propertyCount = length;
        this._allProperties = new SettableBeanProperty[length];
        for (int i10 = 0; i10 < length; i10++) {
            SettableBeanProperty settableBeanProperty = settableBeanPropertyArr[i10];
            this._allProperties[i10] = settableBeanProperty;
            this._propertyLookup.put(settableBeanProperty.getName(), settableBeanProperty);
        }
    }

    public static PropertyBasedCreator construct(DeserializationContext deserializationContext, ValueInstantiator valueInstantiator, SettableBeanProperty[] settableBeanPropertyArr) {
        int length = settableBeanPropertyArr.length;
        SettableBeanProperty[] settableBeanPropertyArr2 = new SettableBeanProperty[length];
        for (int i10 = 0; i10 < length; i10++) {
            SettableBeanProperty settableBeanProperty = settableBeanPropertyArr[i10];
            if (!settableBeanProperty.hasValueDeserializer()) {
                settableBeanProperty = settableBeanProperty.withValueDeserializer(deserializationContext.findContextualValueDeserializer(settableBeanProperty.getType(), settableBeanProperty));
            }
            settableBeanPropertyArr2[i10] = settableBeanProperty;
        }
        return new PropertyBasedCreator(valueInstantiator, settableBeanPropertyArr2, deserializationContext.isEnabled(MapperFeature.ACCEPT_CASE_INSENSITIVE_PROPERTIES));
    }

    public Object build(DeserializationContext deserializationContext, PropertyValueBuffer propertyValueBuffer) {
        Object createFromObjectWith = this._valueInstantiator.createFromObjectWith(deserializationContext, this._allProperties, propertyValueBuffer);
        if (createFromObjectWith != null) {
            createFromObjectWith = propertyValueBuffer.handleIdValue(deserializationContext, createFromObjectWith);
            for (PropertyValue buffered = propertyValueBuffer.buffered(); buffered != null; buffered = buffered.next) {
                buffered.assign(createFromObjectWith);
            }
        }
        return createFromObjectWith;
    }

    public SettableBeanProperty findCreatorProperty(String str) {
        return this._propertyLookup.get(str);
    }

    public Collection<SettableBeanProperty> properties() {
        return this._propertyLookup.values();
    }

    public PropertyValueBuffer startBuilding(JsonParser jsonParser, DeserializationContext deserializationContext, ObjectIdReader objectIdReader) {
        return new PropertyValueBuffer(jsonParser, deserializationContext, this._propertyCount, objectIdReader);
    }

    public SettableBeanProperty findCreatorProperty(int i10) {
        for (SettableBeanProperty next : this._propertyLookup.values()) {
            if (next.getPropertyIndex() == i10) {
                return next;
            }
        }
        return null;
    }
}
