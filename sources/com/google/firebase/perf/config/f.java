package com.google.firebase.perf.config;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import rc.C5191a;

public final class f extends v {

    /* renamed from: a  reason: collision with root package name */
    private static f f57649a;

    /* renamed from: b  reason: collision with root package name */
    private static final Map f57650b = Collections.unmodifiableMap(new a());

    class a extends HashMap {
        a() {
            put(461L, "FIREPERF_AUTOPUSH");
            put(462L, "FIREPERF");
            put(675L, "FIREPERF_INTERNAL_LOW");
            put(676L, "FIREPERF_INTERNAL_HIGH");
        }
    }

    private f() {
    }

    public static synchronized f e() {
        f fVar;
        synchronized (f.class) {
            try {
                if (f57649a == null) {
                    f57649a = new f();
                }
                fVar = f57649a;
            } catch (Throwable th2) {
                while (true) {
                    throw th2;
                }
            }
        }
        return fVar;
    }

    protected static String f(long j10) {
        return (String) f57650b.get(Long.valueOf(j10));
    }

    protected static boolean g(long j10) {
        return f57650b.containsKey(Long.valueOf(j10));
    }

    /* access modifiers changed from: protected */
    public String a() {
        return "com.google.firebase.perf.LogSourceName";
    }

    /* access modifiers changed from: protected */
    public String c() {
        return "fpr_log_source";
    }

    /* access modifiers changed from: protected */
    public String d() {
        return C5191a.f61565c;
    }
}
