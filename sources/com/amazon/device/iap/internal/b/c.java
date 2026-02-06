package com.amazon.device.iap.internal.b;

import org.json.JSONObject;

class c {

    /* renamed from: a  reason: collision with root package name */
    private static final String f37881a = "KEY_TIMESTAMP";

    /* renamed from: b  reason: collision with root package name */
    private static final String f37882b = "KEY_REQUEST_ID";

    /* renamed from: c  reason: collision with root package name */
    private static final String f37883c = "KEY_USER_ID";

    /* renamed from: d  reason: collision with root package name */
    private static final String f37884d = "KEY_RECEIPT_STRING";

    /* renamed from: e  reason: collision with root package name */
    private final String f37885e;

    /* renamed from: f  reason: collision with root package name */
    private final String f37886f;

    /* renamed from: g  reason: collision with root package name */
    private final long f37887g;

    /* renamed from: h  reason: collision with root package name */
    private final String f37888h;

    public c(String str, String str2, String str3, long j10) {
        this.f37885e = str;
        this.f37886f = str2;
        this.f37888h = str3;
        this.f37887g = j10;
    }

    public String a() {
        return this.f37885e;
    }

    public String b() {
        return this.f37888h;
    }

    public String c() {
        return this.f37886f;
    }

    public long d() {
        return this.f37887g;
    }

    public String e() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(f37883c, this.f37885e);
        jSONObject.put(f37884d, this.f37886f);
        jSONObject.put(f37882b, this.f37888h);
        jSONObject.put(f37881a, this.f37887g);
        return jSONObject.toString();
    }

    public static c a(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            return new c(jSONObject.getString(f37883c), jSONObject.getString(f37884d), jSONObject.getString(f37882b), jSONObject.getLong(f37881a));
        } catch (Throwable th2) {
            throw new b("Input invalid for PendingReceipt Object:" + str, th2);
        }
    }
}
