package com.google.firebase.perf.config;

public final class s extends v {

    /* renamed from: a  reason: collision with root package name */
    private static s f57663a;

    private s() {
    }

    public static synchronized s e() {
        s sVar;
        synchronized (s.class) {
            try {
                if (f57663a == null) {
                    f57663a = new s();
                }
                sVar = f57663a;
            } catch (Throwable th2) {
                while (true) {
                    throw th2;
                }
            }
        }
        return sVar;
    }

    /* access modifiers changed from: protected */
    public String a() {
        return "com.google.firebase.perf.TraceEventCountBackground";
    }

    /* access modifiers changed from: protected */
    public String c() {
        return "fpr_rl_trace_event_count_bg";
    }

    /* access modifiers changed from: protected */
    public Long d() {
        return 30L;
    }
}
