package com.google.android.gms.measurement.internal;

import android.content.Intent;

public final /* synthetic */ class U4 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private /* synthetic */ S4 f54886a;

    /* renamed from: b  reason: collision with root package name */
    private /* synthetic */ int f54887b;

    /* renamed from: c  reason: collision with root package name */
    private /* synthetic */ V1 f54888c;

    /* renamed from: d  reason: collision with root package name */
    private /* synthetic */ Intent f54889d;

    public /* synthetic */ U4(S4 s42, int i10, V1 v12, Intent intent) {
        this.f54886a = s42;
        this.f54887b = i10;
        this.f54888c = v12;
        this.f54889d = intent;
    }

    public final void run() {
        this.f54886a.d(this.f54887b, this.f54888c, this.f54889d);
    }
}
