package com.amazon.a.b;

import java.util.Map;

public class g {

    /* renamed from: a  reason: collision with root package name */
    private static final String f37608a = "license";

    /* renamed from: b  reason: collision with root package name */
    private static final String f37609b = "customerId";

    /* renamed from: c  reason: collision with root package name */
    private static final String f37610c = "deviceId";

    /* renamed from: d  reason: collision with root package name */
    private final String f37611d;

    /* renamed from: e  reason: collision with root package name */
    private final String f37612e;

    /* renamed from: f  reason: collision with root package name */
    private final String f37613f;

    public g(Map<String, String> map) {
        if (map != null) {
            this.f37611d = a(f37608a, map);
            this.f37612e = a(f37609b, map);
            this.f37613f = a(f37610c, map);
            return;
        }
        throw com.amazon.a.a.n.a.a.g.d();
    }

    private String a(String str, Map<String, String> map) {
        String str2 = map.get(str);
        if (!a(str2)) {
            return str2;
        }
        throw com.amazon.a.a.n.a.a.g.a(str);
    }

    public String b() {
        return this.f37613f;
    }

    public String c() {
        return this.f37611d;
    }

    private boolean a(String str) {
        return str == null || str.length() == 0;
    }

    public String a() {
        return this.f37612e;
    }
}
