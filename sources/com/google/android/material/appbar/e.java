package com.google.android.material.appbar;

import android.view.View;
import androidx.core.view.C1680b0;

class e {

    /* renamed from: a  reason: collision with root package name */
    private final View f55510a;

    /* renamed from: b  reason: collision with root package name */
    private int f55511b;

    /* renamed from: c  reason: collision with root package name */
    private int f55512c;

    /* renamed from: d  reason: collision with root package name */
    private int f55513d;

    /* renamed from: e  reason: collision with root package name */
    private int f55514e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f55515f = true;

    /* renamed from: g  reason: collision with root package name */
    private boolean f55516g = true;

    public e(View view) {
        this.f55510a = view;
    }

    /* access modifiers changed from: package-private */
    public void a() {
        View view = this.f55510a;
        C1680b0.Z(view, this.f55513d - (view.getTop() - this.f55511b));
        View view2 = this.f55510a;
        C1680b0.Y(view2, this.f55514e - (view2.getLeft() - this.f55512c));
    }

    public int b() {
        return this.f55513d;
    }

    /* access modifiers changed from: package-private */
    public void c() {
        this.f55511b = this.f55510a.getTop();
        this.f55512c = this.f55510a.getLeft();
    }

    public boolean d(int i10) {
        if (!this.f55516g || this.f55514e == i10) {
            return false;
        }
        this.f55514e = i10;
        a();
        return true;
    }

    public boolean e(int i10) {
        if (!this.f55515f || this.f55513d == i10) {
            return false;
        }
        this.f55513d = i10;
        a();
        return true;
    }
}
