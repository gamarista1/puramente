package com.google.android.gms.measurement.internal;

import java.util.List;

/* renamed from: com.google.android.gms.measurement.internal.o3  reason: case insensitive filesystem */
public final /* synthetic */ class C4670o3 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private /* synthetic */ C4643k3 f55249a;

    /* renamed from: b  reason: collision with root package name */
    private /* synthetic */ List f55250b;

    public /* synthetic */ C4670o3(C4643k3 k3Var, List list) {
        this.f55249a = k3Var;
        this.f55250b = list;
    }

    public final void run() {
        this.f55249a.h0(this.f55250b);
    }
}
