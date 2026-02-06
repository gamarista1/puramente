package com.facebook.react.runtime;

import com.facebook.react.bridge.Callback;
import com.facebook.react.runtime.ReactHostImpl;

public final /* synthetic */ class P implements ReactHostImpl.d {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ReactHostImpl f41204a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ String f41205b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ int f41206c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ String f41207d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ Callback f41208e;

    public /* synthetic */ P(ReactHostImpl reactHostImpl, String str, int i10, String str2, Callback callback) {
        this.f41204a = reactHostImpl;
        this.f41205b = str;
        this.f41206c = i10;
        this.f41207d = str2;
        this.f41208e = callback;
    }

    public final void a(ReactInstance reactInstance) {
        this.f41204a.r1(this.f41205b, this.f41206c, this.f41207d, this.f41208e, reactInstance);
    }
}
