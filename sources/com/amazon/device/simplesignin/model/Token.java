package com.amazon.device.simplesignin.model;

public class Token {
    private String schema;
    private String token;

    /* access modifiers changed from: protected */
    public boolean canEqual(Object obj) {
        return obj instanceof Token;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Token)) {
            return false;
        }
        Token token2 = (Token) obj;
        if (!token2.canEqual(this)) {
            return false;
        }
        String token3 = getToken();
        String token4 = token2.getToken();
        if (token3 != null ? !token3.equals(token4) : token4 != null) {
            return false;
        }
        String schema2 = getSchema();
        String schema3 = token2.getSchema();
        if (schema2 != null ? schema2.equals(schema3) : schema3 == null) {
            return true;
        }
        return false;
    }

    public String getSchema() {
        return this.schema;
    }

    public String getToken() {
        return this.token;
    }

    public int hashCode() {
        int i10;
        String token2 = getToken();
        int i11 = 43;
        if (token2 == null) {
            i10 = 43;
        } else {
            i10 = token2.hashCode();
        }
        String schema2 = getSchema();
        int i12 = (i10 + 59) * 59;
        if (schema2 != null) {
            i11 = schema2.hashCode();
        }
        return i12 + i11;
    }

    public void setSchema(String str) {
        this.schema = str;
    }

    public void setToken(String str) {
        this.token = str;
    }
}
