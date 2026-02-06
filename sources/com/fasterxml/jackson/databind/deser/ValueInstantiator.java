package com.fasterxml.jackson.databind.deser;

import com.amazon.a.a.o.b;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer;
import com.fasterxml.jackson.databind.introspect.AnnotatedParameter;
import com.fasterxml.jackson.databind.introspect.AnnotatedWithParams;

public abstract class ValueInstantiator {
    /* access modifiers changed from: protected */
    public Object _createFromStringFallbacks(DeserializationContext deserializationContext, String str) {
        if (canCreateFromBoolean()) {
            String trim = str.trim();
            if (b.f37475af.equals(trim)) {
                return createFromBoolean(deserializationContext, true);
            }
            if (b.f37476ag.equals(trim)) {
                return createFromBoolean(deserializationContext, false);
            }
        }
        if (str.length() != 0 || !deserializationContext.isEnabled(DeserializationFeature.ACCEPT_EMPTY_STRING_AS_NULL_OBJECT)) {
            return deserializationContext.handleMissingInstantiator(getValueClass(), deserializationContext.getParser(), "no String-argument constructor/factory method to deserialize from String value ('%s')", str);
        }
        return null;
    }

    public boolean canCreateFromBoolean() {
        return false;
    }

    public boolean canCreateFromDouble() {
        return false;
    }

    public boolean canCreateFromInt() {
        return false;
    }

    public boolean canCreateFromLong() {
        return false;
    }

    public boolean canCreateFromObjectWith() {
        return false;
    }

    public boolean canCreateFromString() {
        return false;
    }

    public boolean canCreateUsingArrayDelegate() {
        return false;
    }

    public boolean canCreateUsingDefault() {
        if (getDefaultCreator() != null) {
            return true;
        }
        return false;
    }

    public boolean canCreateUsingDelegate() {
        return false;
    }

    public boolean canInstantiate() {
        if (canCreateUsingDefault() || canCreateUsingDelegate() || canCreateFromObjectWith() || canCreateFromString() || canCreateFromInt() || canCreateFromLong() || canCreateFromDouble() || canCreateFromBoolean()) {
            return true;
        }
        return false;
    }

    public Object createFromBoolean(DeserializationContext deserializationContext, boolean z10) {
        return deserializationContext.handleMissingInstantiator(getValueClass(), deserializationContext.getParser(), "no boolean/Boolean-argument constructor/factory method to deserialize from boolean value (%s)", Boolean.valueOf(z10));
    }

    public Object createFromDouble(DeserializationContext deserializationContext, double d10) {
        return deserializationContext.handleMissingInstantiator(getValueClass(), deserializationContext.getParser(), "no double/Double-argument constructor/factory method to deserialize from Number value (%s)", Double.valueOf(d10));
    }

    public Object createFromInt(DeserializationContext deserializationContext, int i10) {
        return deserializationContext.handleMissingInstantiator(getValueClass(), deserializationContext.getParser(), "no int/Int-argument constructor/factory method to deserialize from Number value (%s)", Integer.valueOf(i10));
    }

    public Object createFromLong(DeserializationContext deserializationContext, long j10) {
        return deserializationContext.handleMissingInstantiator(getValueClass(), deserializationContext.getParser(), "no long/Long-argument constructor/factory method to deserialize from Number value (%s)", Long.valueOf(j10));
    }

    public Object createFromObjectWith(DeserializationContext deserializationContext, Object[] objArr) {
        return deserializationContext.handleMissingInstantiator(getValueClass(), deserializationContext.getParser(), "no creator with arguments specified", new Object[0]);
    }

    public Object createFromString(DeserializationContext deserializationContext, String str) {
        return _createFromStringFallbacks(deserializationContext, str);
    }

    public Object createUsingArrayDelegate(DeserializationContext deserializationContext, Object obj) {
        return deserializationContext.handleMissingInstantiator(getValueClass(), deserializationContext.getParser(), "no array delegate creator specified", new Object[0]);
    }

    public Object createUsingDefault(DeserializationContext deserializationContext) {
        return deserializationContext.handleMissingInstantiator(getValueClass(), deserializationContext.getParser(), "no default no-arguments constructor found", new Object[0]);
    }

    public Object createUsingDelegate(DeserializationContext deserializationContext, Object obj) {
        return deserializationContext.handleMissingInstantiator(getValueClass(), deserializationContext.getParser(), "no delegate creator specified", new Object[0]);
    }

    public AnnotatedWithParams getArrayDelegateCreator() {
        return null;
    }

    public JavaType getArrayDelegateType(DeserializationConfig deserializationConfig) {
        return null;
    }

    public AnnotatedWithParams getDefaultCreator() {
        return null;
    }

    public AnnotatedWithParams getDelegateCreator() {
        return null;
    }

    public JavaType getDelegateType(DeserializationConfig deserializationConfig) {
        return null;
    }

    public SettableBeanProperty[] getFromObjectArguments(DeserializationConfig deserializationConfig) {
        return null;
    }

    public AnnotatedParameter getIncompleteParameter() {
        return null;
    }

    public Class<?> getValueClass() {
        return Object.class;
    }

    public String getValueTypeDesc() {
        Class<?> valueClass = getValueClass();
        if (valueClass == null) {
            return "UNKNOWN";
        }
        return valueClass.getName();
    }

    public AnnotatedWithParams getWithArgsCreator() {
        return null;
    }

    public static class Base extends ValueInstantiator {
        protected final Class<?> _valueType;

        public Base(Class<?> cls) {
            this._valueType = cls;
        }

        public Class<?> getValueClass() {
            return this._valueType;
        }

        public String getValueTypeDesc() {
            return this._valueType.getName();
        }

        public Base(JavaType javaType) {
            this._valueType = javaType.getRawClass();
        }
    }

    public Object createFromObjectWith(DeserializationContext deserializationContext, SettableBeanProperty[] settableBeanPropertyArr, PropertyValueBuffer propertyValueBuffer) {
        return createFromObjectWith(deserializationContext, propertyValueBuffer.getParameters(settableBeanPropertyArr));
    }
}
