package com.google.firebase.perf.config;

public final class g extends v {

    /* renamed from: a  reason: collision with root package name */
    private static g f57651a;

    private g() {
    }

    public static synchronized g e() {
        g gVar;
        synchronized (g.class) {
            try {
                if (f57651a == null) {
                    f57651a = new g();
                }
                gVar = f57651a;
            } catch (Throwable th2) {
                while (true) {
                    throw th2;
                }
            }
        }
        return gVar;
    }

    /* access modifiers changed from: protected */
    public String a() {
        return "com.google.firebase.perf.NetworkEventCountBackground";
    }

    /* access modifiers changed from: protected */
    public String c() {
        return "fpr_rl_network_event_count_bg";
    }

    /* access modifiers changed from: protected */
    public Long d() {
        return 70L;
    }
}
