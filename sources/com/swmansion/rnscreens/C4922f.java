package com.swmansion.rnscreens;

import android.view.ViewGroup;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.WritableNativeMap;
import com.facebook.react.uimanager.C3413g0;
import com.facebook.react.uimanager.G;

/* renamed from: com.swmansion.rnscreens.f  reason: case insensitive filesystem */
public abstract class C4922f extends ViewGroup {

    /* renamed from: a  reason: collision with root package name */
    private C3413g0 f59790a;

    /* renamed from: b  reason: collision with root package name */
    private float f59791b;

    /* renamed from: c  reason: collision with root package name */
    private float f59792c;

    public C4922f(ReactContext reactContext) {
        super(reactContext);
    }

    /* access modifiers changed from: protected */
    public final void b(int i10, int i11, int i12) {
        c(i10, i11, i12);
    }

    public final void c(int i10, int i11, int i12) {
        float f10 = G.f((float) i10);
        float f11 = G.f((float) i11);
        float f12 = G.f((float) i12);
        if (Math.abs(this.f59791b - f10) >= 0.9f || Math.abs(this.f59792c - f11) >= 0.9f) {
            this.f59791b = f10;
            this.f59792c = f11;
            WritableNativeMap writableNativeMap = new WritableNativeMap();
            writableNativeMap.putDouble("frameWidth", (double) f10);
            writableNativeMap.putDouble("frameHeight", (double) f11);
            writableNativeMap.putDouble("contentOffsetX", 0.0d);
            writableNativeMap.putDouble("contentOffsetY", (double) f12);
            C3413g0 g0Var = this.f59790a;
            if (g0Var != null) {
                g0Var.updateState(writableNativeMap);
            }
        }
    }

    public final void setStateWrapper(C3413g0 g0Var) {
        this.f59790a = g0Var;
    }
}
