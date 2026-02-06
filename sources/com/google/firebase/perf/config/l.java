package com.google.firebase.perf.config;

public final class l extends v {

    /* renamed from: a  reason: collision with root package name */
    private static l f57656a;

    protected l() {
    }

    protected static synchronized l e() {
        l lVar;
        synchronized (l.class) {
            try {
                if (f57656a == null) {
                    f57656a = new l();
                }
                lVar = f57656a;
            } catch (Throwable th2) {
                while (true) {
                    throw th2;
                }
            }
        }
        return lVar;
    }

    /* access modifiers changed from: protected */
    public String a() {
        return "com.google.firebase.perf.SdkEnabled";
    }

    /* access modifiers changed from: protected */
    public String c() {
        return "fpr_enabled";
    }

    /* access modifiers changed from: protected */
    public Boolean d() {
        return Boolean.TRUE;
    }
}
