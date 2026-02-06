package com.google.firebase.perf.config;

public final class j extends v {

    /* renamed from: a  reason: collision with root package name */
    private static j f57654a;

    private j() {
    }

    public static synchronized j e() {
        j jVar;
        synchronized (j.class) {
            try {
                if (f57654a == null) {
                    f57654a = new j();
                }
                jVar = f57654a;
            } catch (Throwable th2) {
                while (true) {
                    throw th2;
                }
            }
        }
        return jVar;
    }

    /* access modifiers changed from: protected */
    public String a() {
        return "com.google.firebase.perf.TimeLimitSec";
    }

    /* access modifiers changed from: protected */
    public String c() {
        return "fpr_rl_time_limit_sec";
    }

    /* access modifiers changed from: protected */
    public Long d() {
        return 600L;
    }
}
