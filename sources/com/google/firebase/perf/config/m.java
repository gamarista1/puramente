package com.google.firebase.perf.config;

public final class m extends v {

    /* renamed from: a  reason: collision with root package name */
    private static m f57657a;

    private m() {
    }

    public static synchronized m e() {
        m mVar;
        synchronized (m.class) {
            try {
                if (f57657a == null) {
                    f57657a = new m();
                }
                mVar = f57657a;
            } catch (Throwable th2) {
                while (true) {
                    throw th2;
                }
            }
        }
        return mVar;
    }

    /* access modifiers changed from: protected */
    public String a() {
        return "com.google.firebase.perf.SessionsCpuCaptureFrequencyBackgroundMs";
    }

    /* access modifiers changed from: protected */
    public String b() {
        return "sessions_cpu_capture_frequency_bg_ms";
    }

    /* access modifiers changed from: protected */
    public String c() {
        return "fpr_session_gauge_cpu_capture_frequency_bg_ms";
    }

    /* access modifiers changed from: protected */
    public Long d() {
        return 0L;
    }
}
