package com.google.firebase.perf.config;

public final class c extends v {

    /* renamed from: a  reason: collision with root package name */
    private static c f57646a;

    private c() {
    }

    protected static synchronized c d() {
        c cVar;
        synchronized (c.class) {
            try {
                if (f57646a == null) {
                    f57646a = new c();
                }
                cVar = f57646a;
            } catch (Throwable th2) {
                while (true) {
                    throw th2;
                }
            }
        }
        return cVar;
    }

    /* access modifiers changed from: protected */
    public String a() {
        return "isEnabled";
    }

    /* access modifiers changed from: protected */
    public String b() {
        return "firebase_performance_collection_enabled";
    }
}
