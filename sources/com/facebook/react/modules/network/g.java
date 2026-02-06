package com.facebook.react.modules.network;

import com.facebook.react.bridge.ReactApplicationContext;
import rh.E;
import rh.w;

public final /* synthetic */ class g implements w {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ NetworkingModule f41088a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ String f41089b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ ReactApplicationContext f41090c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ int f41091d;

    public /* synthetic */ g(NetworkingModule networkingModule, String str, ReactApplicationContext reactApplicationContext, int i10) {
        this.f41088a = networkingModule;
        this.f41089b = str;
        this.f41090c = reactApplicationContext;
        this.f41091d = i10;
    }

    public final E intercept(w.a aVar) {
        return this.f41088a.lambda$sendRequestInternal$0(this.f41089b, this.f41090c, this.f41091d, aVar);
    }
}
