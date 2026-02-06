package com.google.android.material.timepicker;

import android.content.Context;
import android.view.View;
import androidx.core.view.C1677a;
import y1.C2930A;

abstract class a extends C1677a {

    /* renamed from: a  reason: collision with root package name */
    private final C2930A.a f56369a;

    public a(Context context, int i10) {
        this.f56369a = new C2930A.a(16, context.getString(i10));
    }

    public void onInitializeAccessibilityNodeInfo(View view, C2930A a10) {
        super.onInitializeAccessibilityNodeInfo(view, a10);
        a10.b(this.f56369a);
    }
}
