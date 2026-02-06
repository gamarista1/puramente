package com.android.billingclient.api;

import org.json.JSONObject;

/* renamed from: com.android.billingclient.api.c  reason: case insensitive filesystem */
public final class C3196c {

    /* renamed from: a  reason: collision with root package name */
    private final String f38236a;

    C3196c(String str) {
        this.f38236a = new JSONObject(str).optString("countryCode");
    }

    public String a() {
        return this.f38236a;
    }
}
