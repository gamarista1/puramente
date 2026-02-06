package com.google.android.material.textfield;

import Ua.c;
import Ua.e;
import Ua.g;
import Ua.j;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.C;
import androidx.appcompat.widget.g0;
import androidx.core.view.C1680b0;
import androidx.core.view.C1718v;
import androidx.core.widget.i;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.internal.n;
import fb.C4982c;
import y1.C2930A;

class k extends LinearLayout {

    /* renamed from: a  reason: collision with root package name */
    private final TextInputLayout f56306a;

    /* renamed from: b  reason: collision with root package name */
    private final TextView f56307b;

    /* renamed from: c  reason: collision with root package name */
    private CharSequence f56308c;

    /* renamed from: d  reason: collision with root package name */
    private final CheckableImageButton f56309d;

    /* renamed from: e  reason: collision with root package name */
    private ColorStateList f56310e;

    /* renamed from: f  reason: collision with root package name */
    private PorterDuff.Mode f56311f;

    /* renamed from: g  reason: collision with root package name */
    private View.OnLongClickListener f56312g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f56313h;

    k(TextInputLayout textInputLayout, g0 g0Var) {
        super(textInputLayout.getContext());
        this.f56306a = textInputLayout;
        setVisibility(8);
        setOrientation(0);
        setLayoutParams(new FrameLayout.LayoutParams(-2, -1, 8388611));
        CheckableImageButton checkableImageButton = (CheckableImageButton) LayoutInflater.from(getContext()).inflate(g.f52859c, this, false);
        this.f56309d = checkableImageButton;
        C c10 = new C(getContext());
        this.f56307b = c10;
        g(g0Var);
        f(g0Var);
        addView(checkableImageButton);
        addView(c10);
    }

    private void f(g0 g0Var) {
        this.f56307b.setVisibility(8);
        this.f56307b.setId(e.f52827W);
        this.f56307b.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        C1680b0.q0(this.f56307b, 1);
        l(g0Var.n(j.f53197j6, 0));
        if (g0Var.s(j.f53205k6)) {
            m(g0Var.c(j.f53205k6));
        }
        k(g0Var.p(j.f53189i6));
    }

    private void g(g0 g0Var) {
        if (C4982c.g(getContext())) {
            C1718v.c((ViewGroup.MarginLayoutParams) this.f56309d.getLayoutParams(), 0);
        }
        q((View.OnClickListener) null);
        r((View.OnLongClickListener) null);
        if (g0Var.s(j.f53237o6)) {
            this.f56310e = C4982c.b(getContext(), g0Var, j.f53237o6);
        }
        if (g0Var.s(j.f53245p6)) {
            this.f56311f = n.f(g0Var.k(j.f53245p6, -1), (PorterDuff.Mode) null);
        }
        if (g0Var.s(j.f53229n6)) {
            p(g0Var.g(j.f53229n6));
            if (g0Var.s(j.f53221m6)) {
                o(g0Var.p(j.f53221m6));
            }
            n(g0Var.a(j.f53213l6, true));
        }
    }

    private void x() {
        int i10;
        int i11 = 8;
        if (this.f56308c == null || this.f56313h) {
            i10 = 8;
        } else {
            i10 = 0;
        }
        if (this.f56309d.getVisibility() == 0 || i10 == 0) {
            i11 = 0;
        }
        setVisibility(i11);
        this.f56307b.setVisibility(i10);
        this.f56306a.q0();
    }

    /* access modifiers changed from: package-private */
    public CharSequence a() {
        return this.f56308c;
    }

    /* access modifiers changed from: package-private */
    public ColorStateList b() {
        return this.f56307b.getTextColors();
    }

    /* access modifiers changed from: package-private */
    public TextView c() {
        return this.f56307b;
    }

    /* access modifiers changed from: package-private */
    public CharSequence d() {
        return this.f56309d.getContentDescription();
    }

    /* access modifiers changed from: package-private */
    public Drawable e() {
        return this.f56309d.getDrawable();
    }

    /* access modifiers changed from: package-private */
    public boolean h() {
        if (this.f56309d.getVisibility() == 0) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public void i(boolean z10) {
        this.f56313h = z10;
        x();
    }

    /* access modifiers changed from: package-private */
    public void j() {
        f.c(this.f56306a, this.f56309d, this.f56310e);
    }

    /* access modifiers changed from: package-private */
    public void k(CharSequence charSequence) {
        CharSequence charSequence2;
        if (TextUtils.isEmpty(charSequence)) {
            charSequence2 = null;
        } else {
            charSequence2 = charSequence;
        }
        this.f56308c = charSequence2;
        this.f56307b.setText(charSequence);
        x();
    }

    /* access modifiers changed from: package-private */
    public void l(int i10) {
        i.o(this.f56307b, i10);
    }

    /* access modifiers changed from: package-private */
    public void m(ColorStateList colorStateList) {
        this.f56307b.setTextColor(colorStateList);
    }

    /* access modifiers changed from: package-private */
    public void n(boolean z10) {
        this.f56309d.setCheckable(z10);
    }

    /* access modifiers changed from: package-private */
    public void o(CharSequence charSequence) {
        if (d() != charSequence) {
            this.f56309d.setContentDescription(charSequence);
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        w();
    }

    /* access modifiers changed from: package-private */
    public void p(Drawable drawable) {
        this.f56309d.setImageDrawable(drawable);
        if (drawable != null) {
            f.a(this.f56306a, this.f56309d, this.f56310e, this.f56311f);
            u(true);
            j();
            return;
        }
        u(false);
        q((View.OnClickListener) null);
        r((View.OnLongClickListener) null);
        o((CharSequence) null);
    }

    /* access modifiers changed from: package-private */
    public void q(View.OnClickListener onClickListener) {
        f.e(this.f56309d, onClickListener, this.f56312g);
    }

    /* access modifiers changed from: package-private */
    public void r(View.OnLongClickListener onLongClickListener) {
        this.f56312g = onLongClickListener;
        f.f(this.f56309d, onLongClickListener);
    }

    /* access modifiers changed from: package-private */
    public void s(ColorStateList colorStateList) {
        if (this.f56310e != colorStateList) {
            this.f56310e = colorStateList;
            f.a(this.f56306a, this.f56309d, colorStateList, this.f56311f);
        }
    }

    /* access modifiers changed from: package-private */
    public void t(PorterDuff.Mode mode) {
        if (this.f56311f != mode) {
            this.f56311f = mode;
            f.a(this.f56306a, this.f56309d, this.f56310e, mode);
        }
    }

    /* access modifiers changed from: package-private */
    public void u(boolean z10) {
        int i10;
        if (h() != z10) {
            CheckableImageButton checkableImageButton = this.f56309d;
            if (z10) {
                i10 = 0;
            } else {
                i10 = 8;
            }
            checkableImageButton.setVisibility(i10);
            w();
            x();
        }
    }

    /* access modifiers changed from: package-private */
    public void v(C2930A a10) {
        if (this.f56307b.getVisibility() == 0) {
            a10.H0(this.f56307b);
            a10.e1(this.f56307b);
            return;
        }
        a10.e1(this.f56309d);
    }

    /* access modifiers changed from: package-private */
    public void w() {
        int i10;
        EditText editText = this.f56306a.f56159e;
        if (editText != null) {
            if (h()) {
                i10 = 0;
            } else {
                i10 = C1680b0.F(editText);
            }
            C1680b0.D0(this.f56307b, i10, editText.getCompoundPaddingTop(), getContext().getResources().getDimensionPixelSize(c.f52792u), editText.getCompoundPaddingBottom());
        }
    }
}
