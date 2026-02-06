package com.amazon.a.b;

import com.amazon.a.a.o.b.f;
import com.amazon.a.a.o.e;
import java.util.Date;

public class b {

    /* renamed from: a  reason: collision with root package name */
    private final String f37582a;

    /* renamed from: b  reason: collision with root package name */
    private final String f37583b;

    /* renamed from: c  reason: collision with root package name */
    private final String f37584c;

    /* renamed from: d  reason: collision with root package name */
    private final Date f37585d;

    /* renamed from: e  reason: collision with root package name */
    private final String f37586e;

    public b(f fVar) {
        this.f37582a = a("checksum", fVar);
        this.f37583b = a("customerId", fVar);
        this.f37584c = a("deviceId", fVar);
        this.f37586e = a("packageName", fVar);
        this.f37585d = b("expiration", fVar);
    }

    private String a(String str, f fVar) {
        String a10 = fVar.a(str);
        if (!e.a(a10)) {
            return a10;
        }
        throw com.amazon.a.a.o.b.a.b.a(str);
    }

    private Date b(String str, f fVar) {
        String a10 = a(str, fVar);
        try {
            return new Date(Long.parseLong(a10));
        } catch (NumberFormatException unused) {
            throw com.amazon.a.a.o.b.a.b.a(str, a10);
        }
    }

    public String c() {
        return this.f37584c;
    }

    public Date d() {
        return this.f37585d;
    }

    public String e() {
        return this.f37586e;
    }

    public String a() {
        return this.f37582a;
    }

    public String b() {
        return this.f37583b;
    }
}
