package com.facebook.react;

import com.facebook.react.bridge.Callback;

/* renamed from: com.facebook.react.u  reason: case insensitive filesystem */
public final /* synthetic */ class C3399u implements Callback {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ C3433v f41362a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ int f41363b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ String[] f41364c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ int[] f41365d;

    public /* synthetic */ C3399u(C3433v vVar, int i10, String[] strArr, int[] iArr) {
        this.f41362a = vVar;
        this.f41363b = i10;
        this.f41364c = strArr;
        this.f41365d = iArr;
    }

    public final void invoke(Object[] objArr) {
        this.f41362a.d(this.f41363b, this.f41364c, this.f41365d, objArr);
    }
}
