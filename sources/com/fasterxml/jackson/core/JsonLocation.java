package com.fasterxml.jackson.core;

import java.io.Serializable;

public class JsonLocation implements Serializable {
    public static final JsonLocation NA = new JsonLocation("N/A", -1, -1, -1, -1);
    private static final long serialVersionUID = 1;
    final int _columnNr;
    final int _lineNr;
    final transient Object _sourceRef;
    final long _totalBytes;
    final long _totalChars;

    public JsonLocation(Object obj, long j10, int i10, int i11) {
        this(obj, -1, j10, i10, i11);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || !(obj instanceof JsonLocation)) {
            return false;
        }
        JsonLocation jsonLocation = (JsonLocation) obj;
        Object obj2 = this._sourceRef;
        if (obj2 == null) {
            if (jsonLocation._sourceRef != null) {
                return false;
            }
        } else if (!obj2.equals(jsonLocation._sourceRef)) {
            return false;
        }
        if (this._lineNr == jsonLocation._lineNr && this._columnNr == jsonLocation._columnNr && this._totalChars == jsonLocation._totalChars && getByteOffset() == jsonLocation.getByteOffset()) {
            return true;
        }
        return false;
    }

    public long getByteOffset() {
        return this._totalBytes;
    }

    public long getCharOffset() {
        return this._totalChars;
    }

    public int getColumnNr() {
        return this._columnNr;
    }

    public int getLineNr() {
        return this._lineNr;
    }

    public Object getSourceRef() {
        return this._sourceRef;
    }

    public int hashCode() {
        int i10;
        Object obj = this._sourceRef;
        if (obj == null) {
            i10 = 1;
        } else {
            i10 = obj.hashCode();
        }
        return (((i10 ^ this._lineNr) + this._columnNr) ^ ((int) this._totalChars)) + ((int) this._totalBytes);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(80);
        sb2.append("[Source: ");
        Object obj = this._sourceRef;
        if (obj == null) {
            sb2.append("UNKNOWN");
        } else {
            sb2.append(obj.toString());
        }
        sb2.append("; line: ");
        sb2.append(this._lineNr);
        sb2.append(", column: ");
        sb2.append(this._columnNr);
        sb2.append(']');
        return sb2.toString();
    }

    public JsonLocation(Object obj, long j10, long j11, int i10, int i11) {
        this._sourceRef = obj;
        this._totalBytes = j10;
        this._totalChars = j11;
        this._lineNr = i10;
        this._columnNr = i11;
    }
}
