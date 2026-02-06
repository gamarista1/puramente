package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.a  reason: case insensitive filesystem */
final class C4569a implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ String f54997a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ long f54998b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ C4731z f54999c;

    C4569a(C4731z zVar, String str, long j10) {
        this.f54997a = str;
        this.f54998b = j10;
        this.f54999c = zVar;
    }

    public final void run() {
        C4731z.t(this.f54999c, this.f54997a, this.f54998b);
    }
}
