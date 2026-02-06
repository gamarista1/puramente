package com.fasterxml.jackson.core.json;

import com.fasterxml.jackson.core.JsonLocation;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonStreamContext;
import com.fasterxml.jackson.core.io.CharTypes;

public final class JsonReadContext extends JsonStreamContext {
    protected JsonReadContext _child;
    protected int _columnNr;
    protected String _currentName;
    protected Object _currentValue;
    protected DupDetector _dups;
    protected int _lineNr;
    protected final JsonReadContext _parent;

    public JsonReadContext(JsonReadContext jsonReadContext, DupDetector dupDetector, int i10, int i11, int i12) {
        this._parent = jsonReadContext;
        this._dups = dupDetector;
        this._type = i10;
        this._lineNr = i11;
        this._columnNr = i12;
        this._index = -1;
    }

    private void _checkDup(DupDetector dupDetector, String str) {
        JsonParser jsonParser;
        if (dupDetector.isDup(str)) {
            Object source = dupDetector.getSource();
            if (source instanceof JsonParser) {
                jsonParser = (JsonParser) source;
            } else {
                jsonParser = null;
            }
            throw new JsonParseException(jsonParser, "Duplicate field '" + str + "'");
        }
    }

    public static JsonReadContext createRootContext(int i10, int i11, DupDetector dupDetector) {
        return new JsonReadContext((JsonReadContext) null, dupDetector, 0, i10, i11);
    }

    public JsonReadContext clearAndGetParent() {
        this._currentValue = null;
        return this._parent;
    }

    public JsonReadContext createChildArrayContext(int i10, int i11) {
        DupDetector child;
        JsonReadContext jsonReadContext = this._child;
        if (jsonReadContext == null) {
            DupDetector dupDetector = this._dups;
            if (dupDetector == null) {
                child = null;
            } else {
                child = dupDetector.child();
            }
            jsonReadContext = new JsonReadContext(this, child, 1, i10, i11);
            this._child = jsonReadContext;
        } else {
            jsonReadContext.reset(1, i10, i11);
        }
        return jsonReadContext;
    }

    public JsonReadContext createChildObjectContext(int i10, int i11) {
        DupDetector child;
        JsonReadContext jsonReadContext = this._child;
        if (jsonReadContext == null) {
            DupDetector dupDetector = this._dups;
            if (dupDetector == null) {
                child = null;
            } else {
                child = dupDetector.child();
            }
            JsonReadContext jsonReadContext2 = new JsonReadContext(this, child, 2, i10, i11);
            this._child = jsonReadContext2;
            return jsonReadContext2;
        }
        jsonReadContext.reset(2, i10, i11);
        return jsonReadContext;
    }

    public boolean expectComma() {
        int i10 = this._index + 1;
        this._index = i10;
        if (this._type == 0 || i10 <= 0) {
            return false;
        }
        return true;
    }

    public String getCurrentName() {
        return this._currentName;
    }

    public Object getCurrentValue() {
        return this._currentValue;
    }

    public DupDetector getDupDetector() {
        return this._dups;
    }

    public JsonLocation getStartLocation(Object obj) {
        return new JsonLocation(obj, -1, this._lineNr, this._columnNr);
    }

    /* access modifiers changed from: protected */
    public void reset(int i10, int i11, int i12) {
        this._type = i10;
        this._index = -1;
        this._lineNr = i11;
        this._columnNr = i12;
        this._currentName = null;
        this._currentValue = null;
        DupDetector dupDetector = this._dups;
        if (dupDetector != null) {
            dupDetector.reset();
        }
    }

    public void setCurrentName(String str) {
        this._currentName = str;
        DupDetector dupDetector = this._dups;
        if (dupDetector != null) {
            _checkDup(dupDetector, str);
        }
    }

    public void setCurrentValue(Object obj) {
        this._currentValue = obj;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(64);
        int i10 = this._type;
        if (i10 == 0) {
            sb2.append("/");
        } else if (i10 != 1) {
            sb2.append('{');
            if (this._currentName != null) {
                sb2.append('\"');
                CharTypes.appendQuoted(sb2, this._currentName);
                sb2.append('\"');
            } else {
                sb2.append('?');
            }
            sb2.append('}');
        } else {
            sb2.append('[');
            sb2.append(getCurrentIndex());
            sb2.append(']');
        }
        return sb2.toString();
    }

    public JsonReadContext withDupDetector(DupDetector dupDetector) {
        this._dups = dupDetector;
        return this;
    }

    public static JsonReadContext createRootContext(DupDetector dupDetector) {
        return new JsonReadContext((JsonReadContext) null, dupDetector, 0, 1, 0);
    }

    public JsonReadContext getParent() {
        return this._parent;
    }
}
