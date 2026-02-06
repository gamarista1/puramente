package com.google.android.material.textfield;

import Ua.c;
import Ua.e;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.C;
import androidx.core.view.C1680b0;
import androidx.core.widget.i;
import fb.C4982c;
import java.util.ArrayList;
import java.util.List;

final class g {

    /* renamed from: a  reason: collision with root package name */
    private final Context f56265a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final TextInputLayout f56266b;

    /* renamed from: c  reason: collision with root package name */
    private LinearLayout f56267c;

    /* renamed from: d  reason: collision with root package name */
    private int f56268d;

    /* renamed from: e  reason: collision with root package name */
    private FrameLayout f56269e;
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public Animator f56270f;

    /* renamed from: g  reason: collision with root package name */
    private final float f56271g;
    /* access modifiers changed from: private */

    /* renamed from: h  reason: collision with root package name */
    public int f56272h;

    /* renamed from: i  reason: collision with root package name */
    private int f56273i;

    /* renamed from: j  reason: collision with root package name */
    private CharSequence f56274j;

    /* renamed from: k  reason: collision with root package name */
    private boolean f56275k;
    /* access modifiers changed from: private */

    /* renamed from: l  reason: collision with root package name */
    public TextView f56276l;

    /* renamed from: m  reason: collision with root package name */
    private CharSequence f56277m;

    /* renamed from: n  reason: collision with root package name */
    private int f56278n;

    /* renamed from: o  reason: collision with root package name */
    private ColorStateList f56279o;

    /* renamed from: p  reason: collision with root package name */
    private CharSequence f56280p;

    /* renamed from: q  reason: collision with root package name */
    private boolean f56281q;

    /* renamed from: r  reason: collision with root package name */
    private TextView f56282r;

    /* renamed from: s  reason: collision with root package name */
    private int f56283s;

    /* renamed from: t  reason: collision with root package name */
    private ColorStateList f56284t;

    /* renamed from: u  reason: collision with root package name */
    private Typeface f56285u;

    class a extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ int f56286a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ TextView f56287b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f56288c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ TextView f56289d;

        a(int i10, TextView textView, int i11, TextView textView2) {
            this.f56286a = i10;
            this.f56287b = textView;
            this.f56288c = i11;
            this.f56289d = textView2;
        }

        public void onAnimationEnd(Animator animator) {
            int unused = g.this.f56272h = this.f56286a;
            Animator unused2 = g.this.f56270f = null;
            TextView textView = this.f56287b;
            if (textView != null) {
                textView.setVisibility(4);
                if (this.f56288c == 1 && g.this.f56276l != null) {
                    g.this.f56276l.setText((CharSequence) null);
                }
            }
            TextView textView2 = this.f56289d;
            if (textView2 != null) {
                textView2.setTranslationY(0.0f);
                this.f56289d.setAlpha(1.0f);
            }
        }

        public void onAnimationStart(Animator animator) {
            TextView textView = this.f56289d;
            if (textView != null) {
                textView.setVisibility(0);
            }
        }
    }

    class b extends View.AccessibilityDelegate {
        b() {
        }

        public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
            EditText editText = g.this.f56266b.getEditText();
            if (editText != null) {
                accessibilityNodeInfo.setLabeledBy(editText);
            }
        }
    }

    public g(TextInputLayout textInputLayout) {
        Context context = textInputLayout.getContext();
        this.f56265a = context;
        this.f56266b = textInputLayout;
        this.f56271g = (float) context.getResources().getDimensionPixelSize(c.f52777f);
    }

    private void C(int i10, int i11) {
        TextView m10;
        TextView m11;
        if (i10 != i11) {
            if (!(i11 == 0 || (m11 = m(i11)) == null)) {
                m11.setVisibility(0);
                m11.setAlpha(1.0f);
            }
            if (!(i10 == 0 || (m10 = m(i10)) == null)) {
                m10.setVisibility(4);
                if (i10 == 1) {
                    m10.setText((CharSequence) null);
                }
            }
            this.f56272h = i11;
        }
    }

    private void K(TextView textView, Typeface typeface) {
        if (textView != null) {
            textView.setTypeface(typeface);
        }
    }

    private void M(ViewGroup viewGroup, int i10) {
        if (i10 == 0) {
            viewGroup.setVisibility(8);
        }
    }

    private boolean N(TextView textView, CharSequence charSequence) {
        if (!C1680b0.S(this.f56266b) || !this.f56266b.isEnabled() || (this.f56273i == this.f56272h && textView != null && TextUtils.equals(textView.getText(), charSequence))) {
            return false;
        }
        return true;
    }

    private void Q(int i10, int i11, boolean z10) {
        boolean z11 = z10;
        if (i10 != i11) {
            if (z11) {
                AnimatorSet animatorSet = new AnimatorSet();
                this.f56270f = animatorSet;
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = arrayList;
                int i12 = i10;
                int i13 = i11;
                i(arrayList2, this.f56281q, this.f56282r, 2, i12, i13);
                i(arrayList2, this.f56275k, this.f56276l, 1, i12, i13);
                Va.b.a(animatorSet, arrayList);
                animatorSet.addListener(new a(i11, m(i10), i10, m(i11)));
                animatorSet.start();
            } else {
                C(i10, i11);
            }
            this.f56266b.r0();
            this.f56266b.w0(z11);
            this.f56266b.E0();
        }
    }

    private boolean g() {
        if (this.f56267c == null || this.f56266b.getEditText() == null) {
            return false;
        }
        return true;
    }

    private void i(List list, boolean z10, TextView textView, int i10, int i11, int i12) {
        boolean z11;
        if (textView != null && z10) {
            if (i10 == i12 || i10 == i11) {
                if (i12 == i10) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                list.add(j(textView, z11));
                if (i12 == i10) {
                    list.add(k(textView));
                }
            }
        }
    }

    private ObjectAnimator j(TextView textView, boolean z10) {
        float f10;
        if (z10) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(textView, View.ALPHA, new float[]{f10});
        ofFloat.setDuration(167);
        ofFloat.setInterpolator(Va.a.f53418a);
        return ofFloat;
    }

    private ObjectAnimator k(TextView textView) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(textView, View.TRANSLATION_Y, new float[]{-this.f56271g, 0.0f});
        ofFloat.setDuration(217);
        ofFloat.setInterpolator(Va.a.f53421d);
        return ofFloat;
    }

    private TextView m(int i10) {
        if (i10 == 1) {
            return this.f56276l;
        }
        if (i10 != 2) {
            return null;
        }
        return this.f56282r;
    }

    private int u(boolean z10, int i10, int i11) {
        if (z10) {
            return this.f56265a.getResources().getDimensionPixelSize(i10);
        }
        return i11;
    }

    private boolean x(int i10) {
        if (i10 != 1 || this.f56276l == null || TextUtils.isEmpty(this.f56274j)) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    public boolean A() {
        return this.f56281q;
    }

    /* access modifiers changed from: package-private */
    public void B(TextView textView, int i10) {
        FrameLayout frameLayout;
        if (this.f56267c != null) {
            if (!y(i10) || (frameLayout = this.f56269e) == null) {
                this.f56267c.removeView(textView);
            } else {
                frameLayout.removeView(textView);
            }
            int i11 = this.f56268d - 1;
            this.f56268d = i11;
            M(this.f56267c, i11);
        }
    }

    /* access modifiers changed from: package-private */
    public void D(CharSequence charSequence) {
        this.f56277m = charSequence;
        TextView textView = this.f56276l;
        if (textView != null) {
            textView.setContentDescription(charSequence);
        }
    }

    /* access modifiers changed from: package-private */
    public void E(boolean z10) {
        if (this.f56275k != z10) {
            h();
            if (z10) {
                C c10 = new C(this.f56265a);
                this.f56276l = c10;
                c10.setId(e.f52824T);
                this.f56276l.setTextAlignment(5);
                Typeface typeface = this.f56285u;
                if (typeface != null) {
                    this.f56276l.setTypeface(typeface);
                }
                F(this.f56278n);
                G(this.f56279o);
                D(this.f56277m);
                this.f56276l.setVisibility(4);
                C1680b0.q0(this.f56276l, 1);
                e(this.f56276l, 0);
            } else {
                v();
                B(this.f56276l, 0);
                this.f56276l = null;
                this.f56266b.r0();
                this.f56266b.E0();
            }
            this.f56275k = z10;
        }
    }

    /* access modifiers changed from: package-private */
    public void F(int i10) {
        this.f56278n = i10;
        TextView textView = this.f56276l;
        if (textView != null) {
            this.f56266b.d0(textView, i10);
        }
    }

    /* access modifiers changed from: package-private */
    public void G(ColorStateList colorStateList) {
        this.f56279o = colorStateList;
        TextView textView = this.f56276l;
        if (textView != null && colorStateList != null) {
            textView.setTextColor(colorStateList);
        }
    }

    /* access modifiers changed from: package-private */
    public void H(int i10) {
        this.f56283s = i10;
        TextView textView = this.f56282r;
        if (textView != null) {
            i.o(textView, i10);
        }
    }

    /* access modifiers changed from: package-private */
    public void I(boolean z10) {
        if (this.f56281q != z10) {
            h();
            if (z10) {
                C c10 = new C(this.f56265a);
                this.f56282r = c10;
                c10.setId(e.f52825U);
                this.f56282r.setTextAlignment(5);
                Typeface typeface = this.f56285u;
                if (typeface != null) {
                    this.f56282r.setTypeface(typeface);
                }
                this.f56282r.setVisibility(4);
                C1680b0.q0(this.f56282r, 1);
                H(this.f56283s);
                J(this.f56284t);
                e(this.f56282r, 1);
                this.f56282r.setAccessibilityDelegate(new b());
            } else {
                w();
                B(this.f56282r, 1);
                this.f56282r = null;
                this.f56266b.r0();
                this.f56266b.E0();
            }
            this.f56281q = z10;
        }
    }

    /* access modifiers changed from: package-private */
    public void J(ColorStateList colorStateList) {
        this.f56284t = colorStateList;
        TextView textView = this.f56282r;
        if (textView != null && colorStateList != null) {
            textView.setTextColor(colorStateList);
        }
    }

    /* access modifiers changed from: package-private */
    public void L(Typeface typeface) {
        if (typeface != this.f56285u) {
            this.f56285u = typeface;
            K(this.f56276l, typeface);
            K(this.f56282r, typeface);
        }
    }

    /* access modifiers changed from: package-private */
    public void O(CharSequence charSequence) {
        h();
        this.f56274j = charSequence;
        this.f56276l.setText(charSequence);
        int i10 = this.f56272h;
        if (i10 != 1) {
            this.f56273i = 1;
        }
        Q(i10, this.f56273i, N(this.f56276l, charSequence));
    }

    /* access modifiers changed from: package-private */
    public void P(CharSequence charSequence) {
        h();
        this.f56280p = charSequence;
        this.f56282r.setText(charSequence);
        int i10 = this.f56272h;
        if (i10 != 2) {
            this.f56273i = 2;
        }
        Q(i10, this.f56273i, N(this.f56282r, charSequence));
    }

    /* access modifiers changed from: package-private */
    public void e(TextView textView, int i10) {
        if (this.f56267c == null && this.f56269e == null) {
            LinearLayout linearLayout = new LinearLayout(this.f56265a);
            this.f56267c = linearLayout;
            linearLayout.setOrientation(0);
            this.f56266b.addView(this.f56267c, -1, -2);
            this.f56269e = new FrameLayout(this.f56265a);
            this.f56267c.addView(this.f56269e, new LinearLayout.LayoutParams(0, -2, 1.0f));
            if (this.f56266b.getEditText() != null) {
                f();
            }
        }
        if (y(i10)) {
            this.f56269e.setVisibility(0);
            this.f56269e.addView(textView);
        } else {
            this.f56267c.addView(textView, new LinearLayout.LayoutParams(-2, -2));
        }
        this.f56267c.setVisibility(0);
        this.f56268d++;
    }

    /* access modifiers changed from: package-private */
    public void f() {
        if (g()) {
            EditText editText = this.f56266b.getEditText();
            boolean g10 = C4982c.g(this.f56265a);
            C1680b0.D0(this.f56267c, u(g10, c.f52790s, C1680b0.F(editText)), u(g10, c.f52791t, this.f56265a.getResources().getDimensionPixelSize(c.f52789r)), u(g10, c.f52790s, C1680b0.E(editText)), 0);
        }
    }

    /* access modifiers changed from: package-private */
    public void h() {
        Animator animator = this.f56270f;
        if (animator != null) {
            animator.cancel();
        }
    }

    /* access modifiers changed from: package-private */
    public boolean l() {
        return x(this.f56273i);
    }

    /* access modifiers changed from: package-private */
    public CharSequence n() {
        return this.f56277m;
    }

    /* access modifiers changed from: package-private */
    public CharSequence o() {
        return this.f56274j;
    }

    /* access modifiers changed from: package-private */
    public int p() {
        TextView textView = this.f56276l;
        if (textView != null) {
            return textView.getCurrentTextColor();
        }
        return -1;
    }

    /* access modifiers changed from: package-private */
    public ColorStateList q() {
        TextView textView = this.f56276l;
        if (textView != null) {
            return textView.getTextColors();
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public CharSequence r() {
        return this.f56280p;
    }

    /* access modifiers changed from: package-private */
    public View s() {
        return this.f56282r;
    }

    /* access modifiers changed from: package-private */
    public int t() {
        TextView textView = this.f56282r;
        if (textView != null) {
            return textView.getCurrentTextColor();
        }
        return -1;
    }

    /* access modifiers changed from: package-private */
    public void v() {
        this.f56274j = null;
        h();
        if (this.f56272h == 1) {
            if (!this.f56281q || TextUtils.isEmpty(this.f56280p)) {
                this.f56273i = 0;
            } else {
                this.f56273i = 2;
            }
        }
        Q(this.f56272h, this.f56273i, N(this.f56276l, ""));
    }

    /* access modifiers changed from: package-private */
    public void w() {
        h();
        int i10 = this.f56272h;
        if (i10 == 2) {
            this.f56273i = 0;
        }
        Q(i10, this.f56273i, N(this.f56282r, ""));
    }

    /* access modifiers changed from: package-private */
    public boolean y(int i10) {
        return i10 == 0 || i10 == 1;
    }

    /* access modifiers changed from: package-private */
    public boolean z() {
        return this.f56275k;
    }
}
