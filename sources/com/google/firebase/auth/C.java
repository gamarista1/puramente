package com.google.firebase.auth;

import io.jsonwebtoken.Claims;
import java.util.Map;

public class C {

    /* renamed from: a  reason: collision with root package name */
    private String f56863a;

    /* renamed from: b  reason: collision with root package name */
    private Map f56864b;

    public C(String str, Map map) {
        this.f56863a = str;
        this.f56864b = map;
    }

    private final long g(String str) {
        Integer num = (Integer) this.f56864b.get(str);
        if (num == null) {
            return 0;
        }
        return num.longValue();
    }

    public long a() {
        return g("auth_time");
    }

    public Map b() {
        return this.f56864b;
    }

    public long c() {
        return g(Claims.EXPIRATION);
    }

    public long d() {
        return g(Claims.ISSUED_AT);
    }

    public String e() {
        Map map = (Map) this.f56864b.get("firebase");
        if (map != null) {
            return (String) map.get("sign_in_provider");
        }
        return null;
    }

    public String f() {
        return this.f56863a;
    }
}
