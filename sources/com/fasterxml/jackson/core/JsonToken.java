package com.fasterxml.jackson.core;

import com.amazon.a.a.o.b;

public enum JsonToken {
    NOT_AVAILABLE((String) null, -1),
    START_OBJECT("{", 1),
    END_OBJECT("}", 2),
    START_ARRAY("[", 3),
    END_ARRAY("]", 4),
    FIELD_NAME((String) null, 5),
    VALUE_EMBEDDED_OBJECT((String) null, 12),
    VALUE_STRING((String) null, 6),
    VALUE_NUMBER_INT((String) null, 7),
    VALUE_NUMBER_FLOAT((String) null, 8),
    VALUE_TRUE(b.f37475af, 9),
    VALUE_FALSE(b.f37476ag, 10),
    VALUE_NULL("null", 11);
    
    final int _id;
    final boolean _isBoolean;
    final boolean _isNumber;
    final boolean _isScalar;
    final boolean _isStructEnd;
    final boolean _isStructStart;
    final String _serialized;
    final byte[] _serializedBytes;
    final char[] _serializedChars;

    private JsonToken(String str, int i10) {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14 = false;
        if (str == null) {
            this._serialized = null;
            this._serializedChars = null;
            this._serializedBytes = null;
        } else {
            this._serialized = str;
            char[] charArray = str.toCharArray();
            this._serializedChars = charArray;
            int length = charArray.length;
            this._serializedBytes = new byte[length];
            for (int i11 = 0; i11 < length; i11++) {
                this._serializedBytes[i11] = (byte) this._serializedChars[i11];
            }
        }
        this._id = i10;
        if (i10 == 10 || i10 == 9) {
            z10 = true;
        } else {
            z10 = false;
        }
        this._isBoolean = z10;
        if (i10 == 7 || i10 == 8) {
            z11 = true;
        } else {
            z11 = false;
        }
        this._isNumber = z11;
        if (i10 == 1 || i10 == 3) {
            z12 = true;
        } else {
            z12 = false;
        }
        this._isStructStart = z12;
        if (i10 == 2 || i10 == 4) {
            z13 = true;
        } else {
            z13 = false;
        }
        this._isStructEnd = z13;
        if (!z12 && !z13 && i10 != 5 && i10 != -1) {
            z14 = true;
        }
        this._isScalar = z14;
    }

    public final byte[] asByteArray() {
        return this._serializedBytes;
    }

    public final char[] asCharArray() {
        return this._serializedChars;
    }

    public final String asString() {
        return this._serialized;
    }

    public final int id() {
        return this._id;
    }

    public final boolean isBoolean() {
        return this._isBoolean;
    }

    public final boolean isNumeric() {
        return this._isNumber;
    }

    public final boolean isScalarValue() {
        return this._isScalar;
    }

    public final boolean isStructEnd() {
        return this._isStructEnd;
    }

    public final boolean isStructStart() {
        return this._isStructStart;
    }
}
