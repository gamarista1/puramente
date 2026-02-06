package com.google.android.material.appbar;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

abstract class d extends CoordinatorLayout.c {

    /* renamed from: a  reason: collision with root package name */
    private e f55507a;

    /* renamed from: b  reason: collision with root package name */
    private int f55508b = 0;

    /* renamed from: c  reason: collision with root package name */
    private int f55509c = 0;

    public d() {
    }

    public int E() {
        e eVar = this.f55507a;
        if (eVar != null) {
            return eVar.b();
        }
        return 0;
    }

    /* access modifiers changed from: protected */
    public void F(CoordinatorLayout coordinatorLayout, View view, int i10) {
        coordinatorLayout.K(view, i10);
    }

    public boolean G(int i10) {
        e eVar = this.f55507a;
        if (eVar != null) {
            return eVar.e(i10);
        }
        this.f55508b = i10;
        return false;
    }

    public boolean l(CoordinatorLayout coordinatorLayout, View view, int i10) {
        F(coordinatorLayout, view, i10);
        if (this.f55507a == null) {
            this.f55507a = new e(view);
        }
        this.f55507a.c();
        this.f55507a.a();
        int i11 = this.f55508b;
        if (i11 != 0) {
            this.f55507a.e(i11);
            this.f55508b = 0;
        }
        int i12 = this.f55509c;
        if (i12 == 0) {
            return true;
        }
        this.f55507a.d(i12);
        this.f55509c = 0;
        return true;
    }

    public d(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
