package com.fasterxml.jackson.core.json;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonStreamContext;

public class JsonWriteContext extends JsonStreamContext {
    public static final int STATUS_EXPECT_NAME = 5;
    public static final int STATUS_EXPECT_VALUE = 4;
    public static final int STATUS_OK_AFTER_COLON = 2;
    public static final int STATUS_OK_AFTER_COMMA = 1;
    public static final int STATUS_OK_AFTER_SPACE = 3;
    public static final int STATUS_OK_AS_IS = 0;
    protected JsonWriteContext _child;
    protected String _currentName;
    protected Object _currentValue;
    protected DupDetector _dups;
    protected boolean _gotName;
    protected final JsonWriteContext _parent;

    protected JsonWriteContext(int i10, JsonWriteContext jsonWriteContext, DupDetector dupDetector) {
        this._type = i10;
        this._parent = jsonWriteContext;
        this._dups = dupDetector;
        this._index = -1;
    }

    private final void _checkDup(DupDetector dupDetector, String str) {
        JsonGenerator jsonGenerator;
        if (dupDetector.isDup(str)) {
            Object source = dupDetector.getSource();
            String str2 = "Duplicate field '" + str + "'";
            if (source instanceof JsonGenerator) {
                jsonGenerator = (JsonGenerator) source;
            } else {
                jsonGenerator = null;
            }
            throw new JsonGenerationException(str2, jsonGenerator);
        }
    }

    @Deprecated
    public static JsonWriteContext createRootContext() {
        return createRootContext((DupDetector) null);
    }

    /* access modifiers changed from: protected */
    public void appendDesc(StringBuilder sb2) {
        int i10 = this._type;
        if (i10 == 2) {
            sb2.append('{');
            if (this._currentName != null) {
                sb2.append('\"');
                sb2.append(this._currentName);
                sb2.append('\"');
            } else {
                sb2.append('?');
            }
            sb2.append('}');
        } else if (i10 == 1) {
            sb2.append('[');
            sb2.append(getCurrentIndex());
            sb2.append(']');
        } else {
            sb2.append("/");
        }
    }

    public JsonWriteContext clearAndGetParent() {
        this._currentValue = null;
        return this._parent;
    }

    public JsonWriteContext createChildArrayContext() {
        DupDetector dupDetector;
        JsonWriteContext jsonWriteContext = this._child;
        if (jsonWriteContext != null) {
            return jsonWriteContext.reset(1);
        }
        DupDetector dupDetector2 = this._dups;
        if (dupDetector2 == null) {
            dupDetector = null;
        } else {
            dupDetector = dupDetector2.child();
        }
        JsonWriteContext jsonWriteContext2 = new JsonWriteContext(1, this, dupDetector);
        this._child = jsonWriteContext2;
        return jsonWriteContext2;
    }

    public JsonWriteContext createChildObjectContext() {
        DupDetector dupDetector;
        JsonWriteContext jsonWriteContext = this._child;
        if (jsonWriteContext != null) {
            return jsonWriteContext.reset(2);
        }
        DupDetector dupDetector2 = this._dups;
        if (dupDetector2 == null) {
            dupDetector = null;
        } else {
            dupDetector = dupDetector2.child();
        }
        JsonWriteContext jsonWriteContext2 = new JsonWriteContext(2, this, dupDetector);
        this._child = jsonWriteContext2;
        return jsonWriteContext2;
    }

    public final String getCurrentName() {
        return this._currentName;
    }

    public Object getCurrentValue() {
        return this._currentValue;
    }

    public DupDetector getDupDetector() {
        return this._dups;
    }

    /* access modifiers changed from: protected */
    public JsonWriteContext reset(int i10) {
        this._type = i10;
        this._index = -1;
        this._currentName = null;
        this._gotName = false;
        this._currentValue = null;
        DupDetector dupDetector = this._dups;
        if (dupDetector != null) {
            dupDetector.reset();
        }
        return this;
    }

    public void setCurrentValue(Object obj) {
        this._currentValue = obj;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(64);
        appendDesc(sb2);
        return sb2.toString();
    }

    public JsonWriteContext withDupDetector(DupDetector dupDetector) {
        this._dups = dupDetector;
        return this;
    }

    public int writeFieldName(String str) {
        if (this._type != 2 || this._gotName) {
            return 4;
        }
        this._gotName = true;
        this._currentName = str;
        DupDetector dupDetector = this._dups;
        if (dupDetector != null) {
            _checkDup(dupDetector, str);
        }
        if (this._index < 0) {
            return 0;
        }
        return 1;
    }

    public int writeValue() {
        int i10 = this._type;
        if (i10 == 2) {
            if (!this._gotName) {
                return 5;
            }
            this._gotName = false;
            this._index++;
            return 2;
        } else if (i10 == 1) {
            int i11 = this._index;
            this._index = i11 + 1;
            if (i11 < 0) {
                return 0;
            }
            return 1;
        } else {
            int i12 = this._index + 1;
            this._index = i12;
            if (i12 == 0) {
                return 0;
            }
            return 3;
        }
    }

    public static JsonWriteContext createRootContext(DupDetector dupDetector) {
        return new JsonWriteContext(0, (JsonWriteContext) null, dupDetector);
    }

    public final JsonWriteContext getParent() {
        return this._parent;
    }
}
