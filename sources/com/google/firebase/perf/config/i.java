package com.google.firebase.perf.config;

public final class i extends v {

    /* renamed from: a  reason: collision with root package name */
    private static i f57653a;

    private i() {
    }

    protected static synchronized i f() {
        i iVar;
        synchronized (i.class) {
            try {
                if (f57653a == null) {
                    f57653a = new i();
                }
                iVar = f57653a;
            } catch (Throwable th2) {
                while (true) {
                    throw th2;
                }
            }
        }
        return iVar;
    }

    /* access modifiers changed from: protected */
    public String a() {
        return "com.google.firebase.perf.NetworkRequestSamplingRate";
    }

    /* access modifiers changed from: protected */
    public String c() {
        return "fpr_vc_network_request_sampling_rate";
    }

    /* access modifiers changed from: protected */
    public Double d() {
        return Double.valueOf(1.0d);
    }

    /* access modifiers changed from: protected */
    public Double e() {
        return Double.valueOf(d().doubleValue() / 1000.0d);
    }
}
