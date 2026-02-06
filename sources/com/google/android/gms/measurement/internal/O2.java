package com.google.android.gms.measurement.internal;

final class O2 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ String f54799a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ String f54800b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ String f54801c;

    /* renamed from: d  reason: collision with root package name */
    private final /* synthetic */ long f54802d;

    /* renamed from: e  reason: collision with root package name */
    private final /* synthetic */ I2 f54803e;

    O2(I2 i22, String str, String str2, String str3, long j10) {
        this.f54799a = str;
        this.f54800b = str2;
        this.f54801c = str3;
        this.f54802d = j10;
        this.f54803e = i22;
    }

    public final void run() {
        String str = this.f54799a;
        if (str == null) {
            this.f54803e.f54718a.A(this.f54800b, (C4595d4) null);
            return;
        }
        this.f54803e.f54718a.A(this.f54800b, new C4595d4(this.f54801c, str, this.f54802d));
    }
}
