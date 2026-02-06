package com.facebook.react;

import com.facebook.react.bridge.ReactApplicationContext;

public final /* synthetic */ class F implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ J f40218a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ ReactApplicationContext f40219b;

    public /* synthetic */ F(J j10, ReactApplicationContext reactApplicationContext) {
        this.f40218a = j10;
        this.f40219b = reactApplicationContext;
    }

    public final void run() {
        this.f40218a.P(this.f40219b);
    }
}
