package com.reactnativecommunity.picker;

import android.content.Context;
import androidx.appcompat.widget.C1586z;
import com.facebook.react.bridge.ReadableNativeMap;
import com.facebook.react.bridge.WritableNativeMap;
import com.facebook.react.uimanager.C3413g0;
import com.facebook.react.uimanager.G;

public abstract class a extends C1586z {

    /* renamed from: j  reason: collision with root package name */
    private C3413g0 f59284j = null;

    public a(Context context) {
        super(context);
    }

    /* access modifiers changed from: package-private */
    public void c(int i10) {
        float f10;
        float f11 = G.f((float) i10);
        ReadableNativeMap stateData = this.f59284j.getStateData();
        if (stateData != null) {
            if (stateData.hasKey("measuredHeight")) {
                f10 = (float) stateData.getInt("measuredHeight");
            } else {
                f10 = 1.0f;
            }
            if (((double) Math.abs(f10 - f11)) < 0.9d) {
                return;
            }
        }
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        writableNativeMap.putDouble("measuredHeight", (double) f11);
        this.f59284j.updateState(writableNativeMap);
    }

    public C3413g0 getStateWrapper() {
        return this.f59284j;
    }

    /* access modifiers changed from: protected */
    public void setMeasuredHeight(int i10) {
        c(i10);
    }

    public void setStateWrapper(C3413g0 g0Var) {
        this.f59284j = g0Var;
    }

    public a(Context context, int i10) {
        super(context, i10);
    }
}
