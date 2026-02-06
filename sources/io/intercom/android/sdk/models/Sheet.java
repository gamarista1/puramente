package io.intercom.android.sdk.models;

import com.google.gson.k;

public class Sheet {
    private final String body;

    public static final class Builder {
        k sheet_request_body;
        String sheet_title;

        public Sheet build() {
            return new Sheet(this);
        }
    }

    Sheet(Builder builder) {
        String str;
        k kVar = builder.sheet_request_body;
        if (kVar == null) {
            str = "";
        } else {
            str = kVar.toString();
        }
        this.body = str;
    }

    public String getBody() {
        return this.body;
    }
}
