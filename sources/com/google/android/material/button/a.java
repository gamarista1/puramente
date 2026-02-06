package com.google.android.material.button;

import Ua.j;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import androidx.core.view.C1680b0;
import fb.C4982c;
import gb.C4994a;
import gb.C4995b;
import ib.C5020g;
import ib.C5024k;
import ib.n;
import q1.C2429a;

class a {

    /* renamed from: t  reason: collision with root package name */
    private static final boolean f55658t = true;

    /* renamed from: u  reason: collision with root package name */
    private static final boolean f55659u = false;

    /* renamed from: a  reason: collision with root package name */
    private final MaterialButton f55660a;

    /* renamed from: b  reason: collision with root package name */
    private C5024k f55661b;

    /* renamed from: c  reason: collision with root package name */
    private int f55662c;

    /* renamed from: d  reason: collision with root package name */
    private int f55663d;

    /* renamed from: e  reason: collision with root package name */
    private int f55664e;

    /* renamed from: f  reason: collision with root package name */
    private int f55665f;

    /* renamed from: g  reason: collision with root package name */
    private int f55666g;

    /* renamed from: h  reason: collision with root package name */
    private int f55667h;

    /* renamed from: i  reason: collision with root package name */
    private PorterDuff.Mode f55668i;

    /* renamed from: j  reason: collision with root package name */
    private ColorStateList f55669j;

    /* renamed from: k  reason: collision with root package name */
    private ColorStateList f55670k;

    /* renamed from: l  reason: collision with root package name */
    private ColorStateList f55671l;

    /* renamed from: m  reason: collision with root package name */
    private Drawable f55672m;

    /* renamed from: n  reason: collision with root package name */
    private boolean f55673n = false;

    /* renamed from: o  reason: collision with root package name */
    private boolean f55674o = false;

    /* renamed from: p  reason: collision with root package name */
    private boolean f55675p = false;

    /* renamed from: q  reason: collision with root package name */
    private boolean f55676q;

    /* renamed from: r  reason: collision with root package name */
    private LayerDrawable f55677r;

    /* renamed from: s  reason: collision with root package name */
    private int f55678s;

    a(MaterialButton materialButton, C5024k kVar) {
        this.f55660a = materialButton;
        this.f55661b = kVar;
    }

    private void E(int i10, int i11) {
        int F10 = C1680b0.F(this.f55660a);
        int paddingTop = this.f55660a.getPaddingTop();
        int E10 = C1680b0.E(this.f55660a);
        int paddingBottom = this.f55660a.getPaddingBottom();
        int i12 = this.f55664e;
        int i13 = this.f55665f;
        this.f55665f = i11;
        this.f55664e = i10;
        if (!this.f55674o) {
            F();
        }
        C1680b0.D0(this.f55660a, F10, (paddingTop + i10) - i12, E10, (paddingBottom + i11) - i13);
    }

    private void F() {
        this.f55660a.setInternalBackground(a());
        C5020g f10 = f();
        if (f10 != null) {
            f10.V((float) this.f55678s);
        }
    }

    private void G(C5024k kVar) {
        if (!f55659u || this.f55674o) {
            if (f() != null) {
                f().setShapeAppearanceModel(kVar);
            }
            if (n() != null) {
                n().setShapeAppearanceModel(kVar);
            }
            if (e() != null) {
                e().setShapeAppearanceModel(kVar);
                return;
            }
            return;
        }
        int F10 = C1680b0.F(this.f55660a);
        int paddingTop = this.f55660a.getPaddingTop();
        int E10 = C1680b0.E(this.f55660a);
        int paddingBottom = this.f55660a.getPaddingBottom();
        F();
        C1680b0.D0(this.f55660a, F10, paddingTop, E10, paddingBottom);
    }

    private void H() {
        int i10;
        C5020g f10 = f();
        C5020g n10 = n();
        if (f10 != null) {
            f10.b0((float) this.f55667h, this.f55670k);
            if (n10 != null) {
                float f11 = (float) this.f55667h;
                if (this.f55673n) {
                    i10 = Ya.a.d(this.f55660a, Ua.a.f52734l);
                } else {
                    i10 = 0;
                }
                n10.a0(f11, i10);
            }
        }
    }

    private InsetDrawable I(Drawable drawable) {
        return new InsetDrawable(drawable, this.f55662c, this.f55664e, this.f55663d, this.f55665f);
    }

    private Drawable a() {
        int i10;
        C5020g gVar = new C5020g(this.f55661b);
        gVar.M(this.f55660a.getContext());
        C2429a.i(gVar, this.f55669j);
        PorterDuff.Mode mode = this.f55668i;
        if (mode != null) {
            C2429a.j(gVar, mode);
        }
        gVar.b0((float) this.f55667h, this.f55670k);
        C5020g gVar2 = new C5020g(this.f55661b);
        gVar2.setTint(0);
        float f10 = (float) this.f55667h;
        if (this.f55673n) {
            i10 = Ya.a.d(this.f55660a, Ua.a.f52734l);
        } else {
            i10 = 0;
        }
        gVar2.a0(f10, i10);
        if (f55658t) {
            C5020g gVar3 = new C5020g(this.f55661b);
            this.f55672m = gVar3;
            C2429a.h(gVar3, -1);
            RippleDrawable rippleDrawable = new RippleDrawable(C4995b.a(this.f55671l), I(new LayerDrawable(new Drawable[]{gVar2, gVar})), this.f55672m);
            this.f55677r = rippleDrawable;
            return rippleDrawable;
        }
        C4994a aVar = new C4994a(this.f55661b);
        this.f55672m = aVar;
        C2429a.i(aVar, C4995b.a(this.f55671l));
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{gVar2, gVar, this.f55672m});
        this.f55677r = layerDrawable;
        return I(layerDrawable);
    }

    private C5020g g(boolean z10) {
        LayerDrawable layerDrawable = this.f55677r;
        if (layerDrawable == null || layerDrawable.getNumberOfLayers() <= 0) {
            return null;
        }
        if (f55658t) {
            return (C5020g) ((LayerDrawable) ((InsetDrawable) this.f55677r.getDrawable(0)).getDrawable()).getDrawable(z10 ^ true ? 1 : 0);
        }
        return (C5020g) this.f55677r.getDrawable(z10 ^ true ? 1 : 0);
    }

    private C5020g n() {
        return g(true);
    }

    /* access modifiers changed from: package-private */
    public void A(ColorStateList colorStateList) {
        if (this.f55670k != colorStateList) {
            this.f55670k = colorStateList;
            H();
        }
    }

    /* access modifiers changed from: package-private */
    public void B(int i10) {
        if (this.f55667h != i10) {
            this.f55667h = i10;
            H();
        }
    }

    /* access modifiers changed from: package-private */
    public void C(ColorStateList colorStateList) {
        if (this.f55669j != colorStateList) {
            this.f55669j = colorStateList;
            if (f() != null) {
                C2429a.i(f(), this.f55669j);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void D(PorterDuff.Mode mode) {
        if (this.f55668i != mode) {
            this.f55668i = mode;
            if (f() != null && this.f55668i != null) {
                C2429a.j(f(), this.f55668i);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public int b() {
        return this.f55666g;
    }

    public int c() {
        return this.f55665f;
    }

    public int d() {
        return this.f55664e;
    }

    public n e() {
        LayerDrawable layerDrawable = this.f55677r;
        if (layerDrawable == null || layerDrawable.getNumberOfLayers() <= 1) {
            return null;
        }
        if (this.f55677r.getNumberOfLayers() > 2) {
            return (n) this.f55677r.getDrawable(2);
        }
        return (n) this.f55677r.getDrawable(1);
    }

    /* access modifiers changed from: package-private */
    public C5020g f() {
        return g(false);
    }

    /* access modifiers changed from: package-private */
    public ColorStateList h() {
        return this.f55671l;
    }

    /* access modifiers changed from: package-private */
    public C5024k i() {
        return this.f55661b;
    }

    /* access modifiers changed from: package-private */
    public ColorStateList j() {
        return this.f55670k;
    }

    /* access modifiers changed from: package-private */
    public int k() {
        return this.f55667h;
    }

    /* access modifiers changed from: package-private */
    public ColorStateList l() {
        return this.f55669j;
    }

    /* access modifiers changed from: package-private */
    public PorterDuff.Mode m() {
        return this.f55668i;
    }

    /* access modifiers changed from: package-private */
    public boolean o() {
        return this.f55674o;
    }

    /* access modifiers changed from: package-private */
    public boolean p() {
        return this.f55676q;
    }

    /* access modifiers changed from: package-private */
    public void q(TypedArray typedArray) {
        this.f55662c = typedArray.getDimensionPixelOffset(j.f53209l2, 0);
        this.f55663d = typedArray.getDimensionPixelOffset(j.f53217m2, 0);
        this.f55664e = typedArray.getDimensionPixelOffset(j.f53225n2, 0);
        this.f55665f = typedArray.getDimensionPixelOffset(j.f53233o2, 0);
        if (typedArray.hasValue(j.f53265s2)) {
            int dimensionPixelSize = typedArray.getDimensionPixelSize(j.f53265s2, -1);
            this.f55666g = dimensionPixelSize;
            y(this.f55661b.w((float) dimensionPixelSize));
            this.f55675p = true;
        }
        this.f55667h = typedArray.getDimensionPixelSize(j.f52949C2, 0);
        this.f55668i = com.google.android.material.internal.n.f(typedArray.getInt(j.f53257r2, -1), PorterDuff.Mode.SRC_IN);
        this.f55669j = C4982c.a(this.f55660a.getContext(), typedArray, j.f53249q2);
        this.f55670k = C4982c.a(this.f55660a.getContext(), typedArray, j.f52941B2);
        this.f55671l = C4982c.a(this.f55660a.getContext(), typedArray, j.f52933A2);
        this.f55676q = typedArray.getBoolean(j.f53241p2, false);
        this.f55678s = typedArray.getDimensionPixelSize(j.f53273t2, 0);
        int F10 = C1680b0.F(this.f55660a);
        int paddingTop = this.f55660a.getPaddingTop();
        int E10 = C1680b0.E(this.f55660a);
        int paddingBottom = this.f55660a.getPaddingBottom();
        if (typedArray.hasValue(j.f53201k2)) {
            s();
        } else {
            F();
        }
        C1680b0.D0(this.f55660a, F10 + this.f55662c, paddingTop + this.f55664e, E10 + this.f55663d, paddingBottom + this.f55665f);
    }

    /* access modifiers changed from: package-private */
    public void r(int i10) {
        if (f() != null) {
            f().setTint(i10);
        }
    }

    /* access modifiers changed from: package-private */
    public void s() {
        this.f55674o = true;
        this.f55660a.setSupportBackgroundTintList(this.f55669j);
        this.f55660a.setSupportBackgroundTintMode(this.f55668i);
    }

    /* access modifiers changed from: package-private */
    public void t(boolean z10) {
        this.f55676q = z10;
    }

    /* access modifiers changed from: package-private */
    public void u(int i10) {
        if (!this.f55675p || this.f55666g != i10) {
            this.f55666g = i10;
            this.f55675p = true;
            y(this.f55661b.w((float) i10));
        }
    }

    public void v(int i10) {
        E(this.f55664e, i10);
    }

    public void w(int i10) {
        E(i10, this.f55665f);
    }

    /* access modifiers changed from: package-private */
    public void x(ColorStateList colorStateList) {
        if (this.f55671l != colorStateList) {
            this.f55671l = colorStateList;
            boolean z10 = f55658t;
            if (z10 && (this.f55660a.getBackground() instanceof RippleDrawable)) {
                ((RippleDrawable) this.f55660a.getBackground()).setColor(C4995b.a(colorStateList));
            } else if (!z10 && (this.f55660a.getBackground() instanceof C4994a)) {
                ((C4994a) this.f55660a.getBackground()).setTintList(C4995b.a(colorStateList));
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void y(C5024k kVar) {
        this.f55661b = kVar;
        G(kVar);
    }

    /* access modifiers changed from: package-private */
    public void z(boolean z10) {
        this.f55673n = z10;
        H();
    }
}
