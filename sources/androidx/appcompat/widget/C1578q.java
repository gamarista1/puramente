package androidx.appcompat.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.util.AttributeSet;
import android.widget.ImageView;
import androidx.core.view.C1680b0;
import androidx.core.widget.e;
import i.j;
import j.C2115a;

/* renamed from: androidx.appcompat.widget.q  reason: case insensitive filesystem */
public class C1578q {

    /* renamed from: a  reason: collision with root package name */
    private final ImageView f11990a;

    /* renamed from: b  reason: collision with root package name */
    private e0 f11991b;

    /* renamed from: c  reason: collision with root package name */
    private e0 f11992c;

    /* renamed from: d  reason: collision with root package name */
    private e0 f11993d;

    /* renamed from: e  reason: collision with root package name */
    private int f11994e = 0;

    public C1578q(ImageView imageView) {
        this.f11990a = imageView;
    }

    private boolean a(Drawable drawable) {
        if (this.f11993d == null) {
            this.f11993d = new e0();
        }
        e0 e0Var = this.f11993d;
        e0Var.a();
        ColorStateList a10 = e.a(this.f11990a);
        if (a10 != null) {
            e0Var.f11893d = true;
            e0Var.f11890a = a10;
        }
        PorterDuff.Mode b10 = e.b(this.f11990a);
        if (b10 != null) {
            e0Var.f11892c = true;
            e0Var.f11891b = b10;
        }
        if (!e0Var.f11893d && !e0Var.f11892c) {
            return false;
        }
        C1572k.i(drawable, e0Var, this.f11990a.getDrawableState());
        return true;
    }

    private boolean l() {
        if (this.f11991b != null) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public void b() {
        if (this.f11990a.getDrawable() != null) {
            this.f11990a.getDrawable().setLevel(this.f11994e);
        }
    }

    /* access modifiers changed from: package-private */
    public void c() {
        Drawable drawable = this.f11990a.getDrawable();
        if (drawable != null) {
            N.b(drawable);
        }
        if (drawable == null) {
            return;
        }
        if (!l() || !a(drawable)) {
            e0 e0Var = this.f11992c;
            if (e0Var != null) {
                C1572k.i(drawable, e0Var, this.f11990a.getDrawableState());
                return;
            }
            e0 e0Var2 = this.f11991b;
            if (e0Var2 != null) {
                C1572k.i(drawable, e0Var2, this.f11990a.getDrawableState());
            }
        }
    }

    /* access modifiers changed from: package-private */
    public ColorStateList d() {
        e0 e0Var = this.f11992c;
        if (e0Var != null) {
            return e0Var.f11890a;
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public PorterDuff.Mode e() {
        e0 e0Var = this.f11992c;
        if (e0Var != null) {
            return e0Var.f11891b;
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public boolean f() {
        if (this.f11990a.getBackground() instanceof RippleDrawable) {
            return false;
        }
        return true;
    }

    public void g(AttributeSet attributeSet, int i10) {
        int n10;
        g0 v10 = g0.v(this.f11990a.getContext(), attributeSet, j.f21507P, i10, 0);
        ImageView imageView = this.f11990a;
        C1680b0.m0(imageView, imageView.getContext(), j.f21507P, attributeSet, v10.r(), i10, 0);
        try {
            Drawable drawable = this.f11990a.getDrawable();
            if (!(drawable != null || (n10 = v10.n(j.f21512Q, -1)) == -1 || (drawable = C2115a.b(this.f11990a.getContext(), n10)) == null)) {
                this.f11990a.setImageDrawable(drawable);
            }
            if (drawable != null) {
                N.b(drawable);
            }
            if (v10.s(j.f21517R)) {
                e.c(this.f11990a, v10.c(j.f21517R));
            }
            if (v10.s(j.f21522S)) {
                e.d(this.f11990a, N.e(v10.k(j.f21522S, -1), (PorterDuff.Mode) null));
            }
            v10.x();
        } catch (Throwable th2) {
            v10.x();
            throw th2;
        }
    }

    /* access modifiers changed from: package-private */
    public void h(Drawable drawable) {
        this.f11994e = drawable.getLevel();
    }

    public void i(int i10) {
        if (i10 != 0) {
            Drawable b10 = C2115a.b(this.f11990a.getContext(), i10);
            if (b10 != null) {
                N.b(b10);
            }
            this.f11990a.setImageDrawable(b10);
        } else {
            this.f11990a.setImageDrawable((Drawable) null);
        }
        c();
    }

    /* access modifiers changed from: package-private */
    public void j(ColorStateList colorStateList) {
        if (this.f11992c == null) {
            this.f11992c = new e0();
        }
        e0 e0Var = this.f11992c;
        e0Var.f11890a = colorStateList;
        e0Var.f11893d = true;
        c();
    }

    /* access modifiers changed from: package-private */
    public void k(PorterDuff.Mode mode) {
        if (this.f11992c == null) {
            this.f11992c = new e0();
        }
        e0 e0Var = this.f11992c;
        e0Var.f11891b = mode;
        e0Var.f11892c = true;
        c();
    }
}
