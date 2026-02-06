package com.facebook.react;

import com.facebook.react.bridge.ReactApplicationContext;

public final /* synthetic */ class G implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ J f40220a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ B[] f40221b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ ReactApplicationContext f40222c;

    public /* synthetic */ G(J j10, B[] bArr, ReactApplicationContext reactApplicationContext) {
        this.f40220a = j10;
        this.f40221b = bArr;
        this.f40222c = reactApplicationContext;
    }

    public final void run() {
        this.f40220a.R(this.f40221b, this.f40222c);
    }
}
