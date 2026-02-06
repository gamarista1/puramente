package com.google.firebase.perf.config;

public final class e extends v {

    /* renamed from: a  reason: collision with root package name */
    private static e f57648a;

    private e() {
    }

    protected static synchronized e e() {
        e eVar;
        synchronized (e.class) {
            try {
                if (f57648a == null) {
                    f57648a = new e();
                }
                eVar = f57648a;
            } catch (Throwable th2) {
                while (true) {
                    throw th2;
                }
            }
        }
        return eVar;
    }

    /* access modifiers changed from: protected */
    public String a() {
        return "com.google.firebase.perf.FragmentSamplingRate";
    }

    /* access modifiers changed from: protected */
    public String b() {
        return "fragment_sampling_percentage";
    }

    /* access modifiers changed from: protected */
    public String c() {
        return "fpr_vc_fragment_sampling_rate";
    }

    /* access modifiers changed from: protected */
    public Double d() {
        return Double.valueOf(0.0d);
    }
}
