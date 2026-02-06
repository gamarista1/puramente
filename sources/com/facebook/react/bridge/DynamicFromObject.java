package com.facebook.react.bridge;

import U5.a;

public class DynamicFromObject implements Dynamic {
    private Object mObject;

    public DynamicFromObject(Object obj) {
        this.mObject = obj;
    }

    public ReadableArray asArray() {
        return (ReadableArray) this.mObject;
    }

    public boolean asBoolean() {
        return ((Boolean) this.mObject).booleanValue();
    }

    public double asDouble() {
        return ((Double) this.mObject).doubleValue();
    }

    public int asInt() {
        return ((Double) this.mObject).intValue();
    }

    public ReadableMap asMap() {
        return (ReadableMap) this.mObject;
    }

    public String asString() {
        return (String) this.mObject;
    }

    public ReadableType getType() {
        String str;
        if (isNull()) {
            return ReadableType.Null;
        }
        Object obj = this.mObject;
        if (obj instanceof Boolean) {
            return ReadableType.Boolean;
        }
        if (obj instanceof Number) {
            return ReadableType.Number;
        }
        if (obj instanceof String) {
            return ReadableType.String;
        }
        if (obj instanceof ReadableMap) {
            return ReadableType.Map;
        }
        if (obj instanceof ReadableArray) {
            return ReadableType.Array;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Unmapped object type ");
        Object obj2 = this.mObject;
        if (obj2 == null) {
            str = "<NULL object>";
        } else {
            str = obj2.getClass().getName();
        }
        sb2.append(str);
        a.m("ReactNative", sb2.toString());
        return ReadableType.Null;
    }

    public boolean isNull() {
        if (this.mObject == null) {
            return true;
        }
        return false;
    }

    public void recycle() {
    }
}
