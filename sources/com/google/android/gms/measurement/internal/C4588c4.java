package com.google.android.gms.measurement.internal;

import java.util.Map;

/* renamed from: com.google.android.gms.measurement.internal.c4  reason: case insensitive filesystem */
public final /* synthetic */ class C4588c4 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private /* synthetic */ Z3 f55026a;

    /* renamed from: b  reason: collision with root package name */
    private /* synthetic */ int f55027b;

    /* renamed from: c  reason: collision with root package name */
    private /* synthetic */ Exception f55028c;

    /* renamed from: d  reason: collision with root package name */
    private /* synthetic */ byte[] f55029d;

    /* renamed from: e  reason: collision with root package name */
    private /* synthetic */ Map f55030e;

    public /* synthetic */ C4588c4(Z3 z32, int i10, Exception exc, byte[] bArr, Map map) {
        this.f55026a = z32;
        this.f55027b = i10;
        this.f55028c = exc;
        this.f55029d = bArr;
        this.f55030e = map;
    }

    public final void run() {
        this.f55026a.a(this.f55027b, this.f55028c, this.f55029d, this.f55030e);
    }
}
