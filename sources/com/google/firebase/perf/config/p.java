package com.google.firebase.perf.config;

public final class p extends v {

    /* renamed from: a  reason: collision with root package name */
    private static p f57660a;

    private p() {
    }

    public static synchronized p e() {
        p pVar;
        synchronized (p.class) {
            try {
                if (f57660a == null) {
                    f57660a = new p();
                }
                pVar = f57660a;
            } catch (Throwable th2) {
                while (true) {
                    throw th2;
                }
            }
        }
        return pVar;
    }

    /* access modifiers changed from: protected */
    public String a() {
        return "com.google.firebase.perf.SessionsMemoryCaptureFrequencyBackgroundMs";
    }

    /* access modifiers changed from: protected */
    public String b() {
        return "sessions_memory_capture_frequency_bg_ms";
    }

    /* access modifiers changed from: protected */
    public String c() {
        return "fpr_session_gauge_memory_capture_frequency_bg_ms";
    }

    /* access modifiers changed from: protected */
    public Long d() {
        return 0L;
    }
}
