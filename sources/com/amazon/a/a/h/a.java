package com.amazon.a.a.h;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

public class a implements Serializable {

    /* renamed from: a  reason: collision with root package name */
    public static final String f37178a = "name";

    /* renamed from: b  reason: collision with root package name */
    public static final String f37179b = "time";

    /* renamed from: c  reason: collision with root package name */
    private static final long f37180c = 1;

    /* renamed from: d  reason: collision with root package name */
    private final Map<String, String> f37181d;

    public a(String str) {
        HashMap hashMap = new HashMap();
        this.f37181d = hashMap;
        hashMap.put("name", str);
        hashMap.put(f37179b, String.valueOf(System.currentTimeMillis()));
    }

    public a a(String str, String str2) {
        this.f37181d.put(str, str2);
        return this;
    }

    public String toString() {
        return "Metric: [" + this.f37181d.toString() + "]";
    }

    public Map<String, String> a() {
        return this.f37181d;
    }
}
