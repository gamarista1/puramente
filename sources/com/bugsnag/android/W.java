package com.bugsnag.android;

import com.bugsnag.android.K0;
import java.util.LinkedHashMap;
import java.util.Map;

public class W implements K0.a {

    /* renamed from: a  reason: collision with root package name */
    private String[] f38617a;

    /* renamed from: b  reason: collision with root package name */
    private Boolean f38618b;

    /* renamed from: c  reason: collision with root package name */
    private String f38619c;

    /* renamed from: d  reason: collision with root package name */
    private String f38620d;

    /* renamed from: e  reason: collision with root package name */
    private Long f38621e;

    /* renamed from: f  reason: collision with root package name */
    private String f38622f;

    /* renamed from: g  reason: collision with root package name */
    private String f38623g;

    /* renamed from: h  reason: collision with root package name */
    private String f38624h = "android";

    /* renamed from: i  reason: collision with root package name */
    private String f38625i;

    /* renamed from: j  reason: collision with root package name */
    private Map f38626j;

    public W(X x10, String[] strArr, Boolean bool, String str, String str2, Long l10, Map map) {
        this.f38617a = strArr;
        this.f38618b = bool;
        this.f38619c = str;
        this.f38620d = str2;
        this.f38621e = l10;
        this.f38622f = x10.e();
        this.f38623g = x10.f();
        this.f38625i = x10.h();
        this.f38626j = k(map);
    }

    private final Map k(Map map) {
        if (map == null) {
            return null;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : map.entrySet()) {
            linkedHashMap.put(entry.getKey(), entry.getValue().toString());
        }
        return linkedHashMap;
    }

    public final String[] a() {
        return this.f38617a;
    }

    public final String b() {
        return this.f38619c;
    }

    public final Boolean c() {
        return this.f38618b;
    }

    public final String d() {
        return this.f38620d;
    }

    public final String e() {
        return this.f38622f;
    }

    public final String f() {
        return this.f38623g;
    }

    public final String g() {
        return this.f38624h;
    }

    public final String h() {
        return this.f38625i;
    }

    public final Map i() {
        return this.f38626j;
    }

    public final Long j() {
        return this.f38621e;
    }

    public void l(K0 k02) {
        k02.y("cpuAbi").E0(this.f38617a);
        k02.y("jailbroken").g0(this.f38618b);
        k02.y("id").j0(this.f38619c);
        k02.y("locale").j0(this.f38620d);
        k02.y("manufacturer").j0(this.f38622f);
        k02.y("model").j0(this.f38623g);
        k02.y("osName").j0(this.f38624h);
        k02.y("osVersion").j0(this.f38625i);
        k02.y("runtimeVersions").E0(this.f38626j);
        k02.y("totalMemory").h0(this.f38621e);
    }

    public void toStream(K0 k02) {
        k02.n();
        l(k02);
        k02.t();
    }
}
