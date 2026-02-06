package com.google.android.gms.measurement.internal;

final class E3 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ String f54540a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ String f54541b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ Object f54542c;

    /* renamed from: d  reason: collision with root package name */
    private final /* synthetic */ long f54543d;

    /* renamed from: e  reason: collision with root package name */
    private final /* synthetic */ C4643k3 f54544e;

    E3(C4643k3 k3Var, String str, String str2, Object obj, long j10) {
        this.f54540a = str;
        this.f54541b = str2;
        this.f54542c = obj;
        this.f54543d = j10;
        this.f54544e = k3Var;
    }

    public final void run() {
        this.f54544e.e0(this.f54540a, this.f54541b, this.f54542c, this.f54543d);
    }
}
