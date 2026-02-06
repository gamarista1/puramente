package com.google.firebase.perf.config;

public final class h extends v {

    /* renamed from: a  reason: collision with root package name */
    private static h f57652a;

    private h() {
    }

    public static synchronized h e() {
        h hVar;
        synchronized (h.class) {
            try {
                if (f57652a == null) {
                    f57652a = new h();
                }
                hVar = f57652a;
            } catch (Throwable th2) {
                while (true) {
                    throw th2;
                }
            }
        }
        return hVar;
    }

    /* access modifiers changed from: protected */
    public String a() {
        return "com.google.firebase.perf.NetworkEventCountForeground";
    }

    /* access modifiers changed from: protected */
    public String c() {
        return "fpr_rl_network_event_count_fg";
    }

    /* access modifiers changed from: protected */
    public Long d() {
        return 700L;
    }
}
