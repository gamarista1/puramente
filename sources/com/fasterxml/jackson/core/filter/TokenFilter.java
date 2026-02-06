package com.fasterxml.jackson.core.filter;

import com.fasterxml.jackson.core.JsonParser;
import java.math.BigDecimal;
import java.math.BigInteger;

public class TokenFilter {
    public static final TokenFilter INCLUDE_ALL = new TokenFilter();

    protected TokenFilter() {
    }

    /* access modifiers changed from: protected */
    public boolean _includeScalar() {
        return true;
    }

    public void filterFinishArray() {
    }

    public void filterFinishObject() {
    }

    public TokenFilter filterStartArray() {
        return this;
    }

    public TokenFilter filterStartObject() {
        return this;
    }

    public boolean includeBinary() {
        return _includeScalar();
    }

    public boolean includeBoolean(boolean z10) {
        return _includeScalar();
    }

    public TokenFilter includeElement(int i10) {
        return this;
    }

    public boolean includeEmbeddedValue(Object obj) {
        return _includeScalar();
    }

    public boolean includeNull() {
        return _includeScalar();
    }

    public boolean includeNumber(int i10) {
        return _includeScalar();
    }

    public TokenFilter includeProperty(String str) {
        return this;
    }

    public boolean includeRawValue() {
        return _includeScalar();
    }

    public TokenFilter includeRootValue(int i10) {
        return this;
    }

    public boolean includeString(String str) {
        return _includeScalar();
    }

    public boolean includeValue(JsonParser jsonParser) {
        return _includeScalar();
    }

    public String toString() {
        if (this == INCLUDE_ALL) {
            return "TokenFilter.INCLUDE_ALL";
        }
        return super.toString();
    }

    public boolean includeNumber(long j10) {
        return _includeScalar();
    }

    public boolean includeNumber(float f10) {
        return _includeScalar();
    }

    public boolean includeNumber(double d10) {
        return _includeScalar();
    }

    public boolean includeNumber(BigDecimal bigDecimal) {
        return _includeScalar();
    }

    public boolean includeNumber(BigInteger bigInteger) {
        return _includeScalar();
    }
}
