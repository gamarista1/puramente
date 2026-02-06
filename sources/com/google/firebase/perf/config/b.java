package com.google.firebase.perf.config;

public final class b extends v {

    /* renamed from: a  reason: collision with root package name */
    private static b f57645a;

    private b() {
    }

    protected static synchronized b e() {
        b bVar;
        synchronized (b.class) {
            try {
                if (f57645a == null) {
                    f57645a = new b();
                }
                bVar = f57645a;
            } catch (Throwable th2) {
                while (true) {
                    throw th2;
                }
            }
        }
        return bVar;
    }

    /* access modifiers changed from: protected */
    public String b() {
        return "firebase_performance_collection_deactivated";
    }

    /* access modifiers changed from: protected */
    public Boolean d() {
        return Boolean.FALSE;
    }
}
