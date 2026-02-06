package com.google.android.gms.measurement.internal;

import android.os.Bundle;

final class C3 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ String f54477a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ String f54478b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ long f54479c;

    /* renamed from: d  reason: collision with root package name */
    private final /* synthetic */ Bundle f54480d;

    /* renamed from: e  reason: collision with root package name */
    private final /* synthetic */ boolean f54481e;

    /* renamed from: f  reason: collision with root package name */
    private final /* synthetic */ boolean f54482f;

    /* renamed from: g  reason: collision with root package name */
    private final /* synthetic */ boolean f54483g;

    /* renamed from: h  reason: collision with root package name */
    private final /* synthetic */ String f54484h;

    /* renamed from: i  reason: collision with root package name */
    private final /* synthetic */ C4643k3 f54485i;

    C3(C4643k3 k3Var, String str, String str2, long j10, Bundle bundle, boolean z10, boolean z11, boolean z12, String str3) {
        this.f54477a = str;
        this.f54478b = str2;
        this.f54479c = j10;
        this.f54480d = bundle;
        this.f54481e = z10;
        this.f54482f = z11;
        this.f54483g = z12;
        this.f54484h = str3;
        this.f54485i = k3Var;
    }

    public final void run() {
        this.f54485i.Z(this.f54477a, this.f54478b, this.f54479c, this.f54480d, this.f54481e, this.f54482f, this.f54483g, this.f54484h);
    }
}
