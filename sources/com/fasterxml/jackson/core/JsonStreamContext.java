package com.fasterxml.jackson.core;

public abstract class JsonStreamContext {
    protected static final int TYPE_ARRAY = 1;
    protected static final int TYPE_OBJECT = 2;
    protected static final int TYPE_ROOT = 0;
    protected int _index;
    protected int _type;

    protected JsonStreamContext() {
    }

    public final int getCurrentIndex() {
        int i10 = this._index;
        if (i10 < 0) {
            return 0;
        }
        return i10;
    }

    public abstract String getCurrentName();

    public Object getCurrentValue() {
        return null;
    }

    public final int getEntryCount() {
        return this._index + 1;
    }

    public abstract JsonStreamContext getParent();

    @Deprecated
    public final String getTypeDesc() {
        int i10 = this._type;
        if (i10 == 0) {
            return "ROOT";
        }
        if (i10 == 1) {
            return "ARRAY";
        }
        if (i10 != 2) {
            return "?";
        }
        return "OBJECT";
    }

    public final boolean inArray() {
        if (this._type == 1) {
            return true;
        }
        return false;
    }

    public final boolean inObject() {
        if (this._type == 2) {
            return true;
        }
        return false;
    }

    public final boolean inRoot() {
        if (this._type == 0) {
            return true;
        }
        return false;
    }

    public void setCurrentValue(Object obj) {
    }

    public String typeDesc() {
        int i10 = this._type;
        if (i10 == 0) {
            return "root";
        }
        if (i10 == 1) {
            return "Array";
        }
        if (i10 != 2) {
            return "?";
        }
        return "Object";
    }
}
