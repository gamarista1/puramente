package com.fasterxml.jackson.core;

import com.fasterxml.jackson.core.io.NumberInput;

public class JsonPointer {
    protected static final JsonPointer EMPTY = new JsonPointer();
    protected final String _asString;
    protected volatile JsonPointer _head;
    protected final int _matchingElementIndex;
    protected final String _matchingPropertyName;
    protected final JsonPointer _nextSegment;

    protected JsonPointer() {
        this._nextSegment = null;
        this._matchingPropertyName = "";
        this._matchingElementIndex = -1;
        this._asString = "";
    }

    private static void _appendEscape(StringBuilder sb2, char c10) {
        if (c10 == '0') {
            c10 = '~';
        } else if (c10 == '1') {
            c10 = '/';
        } else {
            sb2.append('~');
        }
        sb2.append(c10);
    }

    private static final int _parseIndex(String str) {
        int length = str.length();
        if (length == 0 || length > 10) {
            return -1;
        }
        char charAt = str.charAt(0);
        if (charAt <= '0') {
            if (length == 1 && charAt == '0') {
                return 0;
            }
            return -1;
        } else if (charAt > '9') {
            return -1;
        } else {
            for (int i10 = 1; i10 < length; i10++) {
                char charAt2 = str.charAt(i10);
                if (charAt2 > '9' || charAt2 < '0') {
                    return -1;
                }
            }
            if (length != 10 || NumberInput.parseLong(str) <= 2147483647L) {
                return NumberInput.parseInt(str);
            }
            return -1;
        }
    }

    protected static JsonPointer _parseQuotedTail(String str, int i10) {
        int length = str.length();
        StringBuilder sb2 = new StringBuilder(Math.max(16, length));
        if (i10 > 2) {
            sb2.append(str, 1, i10 - 1);
        }
        int i11 = i10 + 1;
        _appendEscape(sb2, str.charAt(i10));
        while (i11 < length) {
            char charAt = str.charAt(i11);
            if (charAt == '/') {
                return new JsonPointer(str, sb2.toString(), _parseTail(str.substring(i11)));
            }
            int i12 = i11 + 1;
            if (charAt != '~' || i12 >= length) {
                sb2.append(charAt);
                i11 = i12;
            } else {
                i11 += 2;
                _appendEscape(sb2, str.charAt(i12));
            }
        }
        return new JsonPointer(str, sb2.toString(), EMPTY);
    }

    protected static JsonPointer _parseTail(String str) {
        int length = str.length();
        int i10 = 1;
        while (i10 < length) {
            char charAt = str.charAt(i10);
            if (charAt == '/') {
                return new JsonPointer(str, str.substring(1, i10), _parseTail(str.substring(i10)));
            }
            i10++;
            if (charAt == '~' && i10 < length) {
                return _parseQuotedTail(str, i10);
            }
        }
        return new JsonPointer(str, str.substring(1), EMPTY);
    }

    public static JsonPointer compile(String str) {
        if (str == null || str.length() == 0) {
            return EMPTY;
        }
        if (str.charAt(0) == '/') {
            return _parseTail(str);
        }
        throw new IllegalArgumentException("Invalid input: JSON Pointer expression must start with '/': \"" + str + "\"");
    }

    public static JsonPointer valueOf(String str) {
        return compile(str);
    }

    /* access modifiers changed from: protected */
    public JsonPointer _constructHead() {
        JsonPointer last = last();
        if (last == this) {
            return EMPTY;
        }
        int length = last._asString.length();
        JsonPointer jsonPointer = this._nextSegment;
        String str = this._asString;
        return new JsonPointer(str.substring(0, str.length() - length), this._matchingPropertyName, this._matchingElementIndex, jsonPointer._constructHead(length, last));
    }

    public JsonPointer append(JsonPointer jsonPointer) {
        JsonPointer jsonPointer2 = EMPTY;
        if (this == jsonPointer2) {
            return jsonPointer;
        }
        if (jsonPointer == jsonPointer2) {
            return this;
        }
        String str = this._asString;
        if (str.endsWith("/")) {
            str = str.substring(0, str.length() - 1);
        }
        return compile(str + jsonPointer._asString);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && (obj instanceof JsonPointer)) {
            return this._asString.equals(((JsonPointer) obj)._asString);
        }
        return false;
    }

    public int getMatchingIndex() {
        return this._matchingElementIndex;
    }

    public String getMatchingProperty() {
        return this._matchingPropertyName;
    }

    public int hashCode() {
        return this._asString.hashCode();
    }

    public JsonPointer head() {
        JsonPointer jsonPointer = this._head;
        if (jsonPointer == null) {
            if (this != EMPTY) {
                jsonPointer = _constructHead();
            }
            this._head = jsonPointer;
        }
        return jsonPointer;
    }

    public JsonPointer last() {
        if (this == EMPTY) {
            return null;
        }
        JsonPointer jsonPointer = this;
        while (true) {
            JsonPointer jsonPointer2 = jsonPointer._nextSegment;
            if (jsonPointer2 == EMPTY) {
                return jsonPointer;
            }
            jsonPointer = jsonPointer2;
        }
    }

    public JsonPointer matchElement(int i10) {
        if (i10 != this._matchingElementIndex || i10 < 0) {
            return null;
        }
        return this._nextSegment;
    }

    public JsonPointer matchProperty(String str) {
        if (this._nextSegment == null || !this._matchingPropertyName.equals(str)) {
            return null;
        }
        return this._nextSegment;
    }

    public boolean matches() {
        if (this._nextSegment == null) {
            return true;
        }
        return false;
    }

    public boolean matchesElement(int i10) {
        if (i10 != this._matchingElementIndex || i10 < 0) {
            return false;
        }
        return true;
    }

    public boolean matchesProperty(String str) {
        if (this._nextSegment == null || !this._matchingPropertyName.equals(str)) {
            return false;
        }
        return true;
    }

    public boolean mayMatchElement() {
        if (this._matchingElementIndex >= 0) {
            return true;
        }
        return false;
    }

    public boolean mayMatchProperty() {
        if (this._matchingPropertyName != null) {
            return true;
        }
        return false;
    }

    public JsonPointer tail() {
        return this._nextSegment;
    }

    public String toString() {
        return this._asString;
    }

    protected JsonPointer(String str, String str2, JsonPointer jsonPointer) {
        this._asString = str;
        this._nextSegment = jsonPointer;
        this._matchingPropertyName = str2;
        this._matchingElementIndex = _parseIndex(str2);
    }

    /* access modifiers changed from: protected */
    public JsonPointer _constructHead(int i10, JsonPointer jsonPointer) {
        if (this == jsonPointer) {
            return EMPTY;
        }
        JsonPointer jsonPointer2 = this._nextSegment;
        String str = this._asString;
        return new JsonPointer(str.substring(0, str.length() - i10), this._matchingPropertyName, this._matchingElementIndex, jsonPointer2._constructHead(i10, jsonPointer));
    }

    protected JsonPointer(String str, String str2, int i10, JsonPointer jsonPointer) {
        this._asString = str;
        this._nextSegment = jsonPointer;
        this._matchingPropertyName = str2;
        this._matchingElementIndex = i10;
    }
}
