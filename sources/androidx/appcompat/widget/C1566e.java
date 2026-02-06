package androidx.appcompat.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import androidx.core.view.C1680b0;
import i.j;

/* renamed from: androidx.appcompat.widget.e  reason: case insensitive filesystem */
class C1566e {

    /* renamed from: a  reason: collision with root package name */
    private final View f11884a;

    /* renamed from: b  reason: collision with root package name */
    private final C1572k f11885b;

    /* renamed from: c  reason: collision with root package name */
    private int f11886c = -1;

    /* renamed from: d  reason: collision with root package name */
    private e0 f11887d;

    /* renamed from: e  reason: collision with root package name */
    private e0 f11888e;

    /* renamed from: f  reason: collision with root package name */
    private e0 f11889f;

    C1566e(View view) {
        this.f11884a = view;
        this.f11885b = C1572k.b();
    }

    private boolean a(Drawable drawable) {
        if (this.f11889f == null) {
            this.f11889f = new e0();
        }
        e0 e0Var = this.f11889f;
        e0Var.a();
        ColorStateList r10 = C1680b0.r(this.f11884a);
        if (r10 != null) {
            e0Var.f11893d = true;
            e0Var.f11890a = r10;
        }
        PorterDuff.Mode s10 = C1680b0.s(this.f11884a);
        if (s10 != null) {
            e0Var.f11892c = true;
            e0Var.f11891b = s10;
        }
        if (!e0Var.f11893d && !e0Var.f11892c) {
            return false;
        }
        C1572k.i(drawable, e0Var, this.f11884a.getDrawableState());
        return true;
    }

    private boolean k() {
        if (this.f11887d != null) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public void b() {
        Drawable background = this.f11884a.getBackground();
        if (background == null) {
            return;
        }
        if (!k() || !a(background)) {
            e0 e0Var = this.f11888e;
            if (e0Var != null) {
                C1572k.i(background, e0Var, this.f11884a.getDrawableState());
                return;
            }
            e0 e0Var2 = this.f11887d;
            if (e0Var2 != null) {
                C1572k.i(background, e0Var2, this.f11884a.getDrawableState());
            }
        }
    }

    /* access modifiers changed from: package-private */
    public ColorStateList c() {
        e0 e0Var = this.f11888e;
        if (e0Var != null) {
            return e0Var.f11890a;
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public PorterDuff.Mode d() {
        e0 e0Var = this.f11888e;
        if (e0Var != null) {
            return e0Var.f11891b;
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public void e(AttributeSet attributeSet, int i10) {
        g0 v10 = g0.v(this.f11884a.getContext(), attributeSet, j.f21486K3, i10, 0);
        View view = this.f11884a;
        C1680b0.m0(view, view.getContext(), j.f21486K3, attributeSet, v10.r(), i10, 0);
        try {
            if (v10.s(j.f21491L3)) {
                this.f11886c = v10.n(j.f21491L3, -1);
                ColorStateList f10 = this.f11885b.f(this.f11884a.getContext(), this.f11886c);
                if (f10 != null) {
                    h(f10);
                }
            }
            if (v10.s(j.f21496M3)) {
                C1680b0.t0(this.f11884a, v10.c(j.f21496M3));
            }
            if (v10.s(j.f21501N3)) {
                C1680b0.u0(this.f11884a, N.e(v10.k(j.f21501N3, -1), (PorterDuff.Mode) null));
            }
            v10.x();
        } catch (Throwable th2) {
            v10.x();
            throw th2;
        }
    }

    /* access modifiers changed from: package-private */
    public void f(Drawable drawable) {
        this.f11886c = -1;
        h((ColorStateList) null);
        b();
    }

    /* access modifiers changed from: package-private */
    public void g(int i10) {
        ColorStateList colorStateList;
        this.f11886c = i10;
        C1572k kVar = this.f11885b;
        if (kVar != null) {
            colorStateList = kVar.f(this.f11884a.getContext(), i10);
        } else {
            colorStateList = null;
        }
        h(colorStateList);
        b();
    }

    /* access modifiers changed from: package-private */
    public void h(ColorStateList colorStateList) {
        if (colorStateList != null) {
            if (this.f11887d == null) {
                this.f11887d = new e0();
            }
            e0 e0Var = this.f11887d;
            e0Var.f11890a = colorStateList;
            e0Var.f11893d = true;
        } else {
            this.f11887d = null;
        }
        b();
    }

    /* access modifiers changed from: package-private */
    public void i(ColorStateList colorStateList) {
        if (this.f11888e == null) {
            this.f11888e = new e0();
        }
        e0 e0Var = this.f11888e;
        e0Var.f11890a = colorStateList;
        e0Var.f11893d = true;
        b();
    }

    /* access modifiers changed from: package-private */
    public void j(PorterDuff.Mode mode) {
        if (this.f11888e == null) {
            this.f11888e = new e0();
        }
        e0 e0Var = this.f11888e;
        e0Var.f11891b = mode;
        e0Var.f11892c = true;
        b();
    }
}
