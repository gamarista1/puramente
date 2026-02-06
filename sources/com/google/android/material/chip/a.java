package com.google.android.material.chip;

import Va.c;
import ab.C4457a;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.text.TextUtils;
import android.util.AttributeSet;
import com.google.android.gms.common.api.a;
import com.google.android.material.internal.j;
import com.google.android.material.internal.l;
import com.google.android.material.internal.n;
import fb.C4982c;
import fb.C4983d;
import gb.C4995b;
import ib.C5020g;
import j.C2115a;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import p1.C2387c;
import q1.C2429a;
import w1.C2818a;

public class a extends C5020g implements Drawable.Callback, j.b {

    /* renamed from: c1  reason: collision with root package name */
    private static final int[] f55715c1 = {16842910};

    /* renamed from: d1  reason: collision with root package name */
    private static final ShapeDrawable f55716d1 = new ShapeDrawable(new OvalShape());

    /* renamed from: A  reason: collision with root package name */
    private ColorStateList f55717A;

    /* renamed from: A0  reason: collision with root package name */
    private final Paint f55718A0 = new Paint(1);

    /* renamed from: B  reason: collision with root package name */
    private float f55719B;

    /* renamed from: B0  reason: collision with root package name */
    private final Paint f55720B0;

    /* renamed from: C  reason: collision with root package name */
    private float f55721C = -1.0f;

    /* renamed from: C0  reason: collision with root package name */
    private final Paint.FontMetrics f55722C0 = new Paint.FontMetrics();

    /* renamed from: D  reason: collision with root package name */
    private ColorStateList f55723D;

    /* renamed from: D0  reason: collision with root package name */
    private final RectF f55724D0 = new RectF();

    /* renamed from: E  reason: collision with root package name */
    private float f55725E;

    /* renamed from: E0  reason: collision with root package name */
    private final PointF f55726E0 = new PointF();

    /* renamed from: F  reason: collision with root package name */
    private ColorStateList f55727F;

    /* renamed from: F0  reason: collision with root package name */
    private final Path f55728F0 = new Path();

    /* renamed from: G  reason: collision with root package name */
    private CharSequence f55729G;

    /* renamed from: G0  reason: collision with root package name */
    private final j f55730G0;

    /* renamed from: H  reason: collision with root package name */
    private boolean f55731H;

    /* renamed from: H0  reason: collision with root package name */
    private int f55732H0;

    /* renamed from: I  reason: collision with root package name */
    private Drawable f55733I;

    /* renamed from: I0  reason: collision with root package name */
    private int f55734I0;

    /* renamed from: J0  reason: collision with root package name */
    private int f55735J0;

    /* renamed from: K0  reason: collision with root package name */
    private int f55736K0;

    /* renamed from: L0  reason: collision with root package name */
    private int f55737L0;

    /* renamed from: M0  reason: collision with root package name */
    private int f55738M0;

    /* renamed from: N0  reason: collision with root package name */
    private boolean f55739N0;

    /* renamed from: O0  reason: collision with root package name */
    private int f55740O0;

    /* renamed from: P0  reason: collision with root package name */
    private int f55741P0 = 255;

    /* renamed from: Q0  reason: collision with root package name */
    private ColorFilter f55742Q0;

    /* renamed from: R0  reason: collision with root package name */
    private PorterDuffColorFilter f55743R0;

    /* renamed from: S0  reason: collision with root package name */
    private ColorStateList f55744S0;

    /* renamed from: T0  reason: collision with root package name */
    private PorterDuff.Mode f55745T0 = PorterDuff.Mode.SRC_IN;

    /* renamed from: U0  reason: collision with root package name */
    private int[] f55746U0;

    /* renamed from: V0  reason: collision with root package name */
    private boolean f55747V0;

    /* renamed from: W0  reason: collision with root package name */
    private ColorStateList f55748W0;

    /* renamed from: X  reason: collision with root package name */
    private ColorStateList f55749X;

    /* renamed from: X0  reason: collision with root package name */
    private WeakReference f55750X0 = new WeakReference((Object) null);

    /* renamed from: Y  reason: collision with root package name */
    private float f55751Y;

    /* renamed from: Y0  reason: collision with root package name */
    private TextUtils.TruncateAt f55752Y0;

    /* renamed from: Z  reason: collision with root package name */
    private boolean f55753Z;

    /* renamed from: Z0  reason: collision with root package name */
    private boolean f55754Z0;

    /* renamed from: a1  reason: collision with root package name */
    private int f55755a1;

    /* renamed from: b1  reason: collision with root package name */
    private boolean f55756b1;

    /* renamed from: f0  reason: collision with root package name */
    private boolean f55757f0;

    /* renamed from: g0  reason: collision with root package name */
    private Drawable f55758g0;

    /* renamed from: h0  reason: collision with root package name */
    private Drawable f55759h0;

    /* renamed from: i0  reason: collision with root package name */
    private ColorStateList f55760i0;

    /* renamed from: j0  reason: collision with root package name */
    private float f55761j0;

    /* renamed from: k0  reason: collision with root package name */
    private CharSequence f55762k0;

    /* renamed from: l0  reason: collision with root package name */
    private boolean f55763l0;

    /* renamed from: m0  reason: collision with root package name */
    private boolean f55764m0;

    /* renamed from: n0  reason: collision with root package name */
    private Drawable f55765n0;

    /* renamed from: o0  reason: collision with root package name */
    private ColorStateList f55766o0;

    /* renamed from: p0  reason: collision with root package name */
    private c f55767p0;

    /* renamed from: q0  reason: collision with root package name */
    private c f55768q0;

    /* renamed from: r0  reason: collision with root package name */
    private float f55769r0;

    /* renamed from: s0  reason: collision with root package name */
    private float f55770s0;

    /* renamed from: t0  reason: collision with root package name */
    private float f55771t0;

    /* renamed from: u0  reason: collision with root package name */
    private float f55772u0;

    /* renamed from: v0  reason: collision with root package name */
    private float f55773v0;

    /* renamed from: w0  reason: collision with root package name */
    private float f55774w0;

    /* renamed from: x0  reason: collision with root package name */
    private float f55775x0;

    /* renamed from: y0  reason: collision with root package name */
    private float f55776y0;

    /* renamed from: z  reason: collision with root package name */
    private ColorStateList f55777z;

    /* renamed from: z0  reason: collision with root package name */
    private final Context f55778z0;

    /* renamed from: com.google.android.material.chip.a$a  reason: collision with other inner class name */
    public interface C0832a {
        void a();
    }

    private a(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        M(context);
        this.f55778z0 = context;
        j jVar = new j(this);
        this.f55730G0 = jVar;
        this.f55729G = "";
        jVar.e().density = context.getResources().getDisplayMetrics().density;
        this.f55720B0 = null;
        int[] iArr = f55715c1;
        setState(iArr);
        i2(iArr);
        this.f55754Z0 = true;
        if (C4995b.f60593a) {
            f55716d1.setTint(-1);
        }
    }

    private void A0(Canvas canvas, Rect rect) {
        Paint paint = this.f55720B0;
        if (paint != null) {
            paint.setColor(C2387c.p(-16777216, 127));
            canvas.drawRect(rect, this.f55720B0);
            if (K2() || J2()) {
                i0(rect, this.f55724D0);
                canvas.drawRect(this.f55724D0, this.f55720B0);
            }
            if (this.f55729G != null) {
                canvas.drawLine((float) rect.left, rect.exactCenterY(), (float) rect.right, rect.exactCenterY(), this.f55720B0);
            }
            if (L2()) {
                l0(rect, this.f55724D0);
                canvas.drawRect(this.f55724D0, this.f55720B0);
            }
            this.f55720B0.setColor(C2387c.p(-65536, 127));
            k0(rect, this.f55724D0);
            canvas.drawRect(this.f55724D0, this.f55720B0);
            this.f55720B0.setColor(C2387c.p(-16711936, 127));
            m0(rect, this.f55724D0);
            canvas.drawRect(this.f55724D0, this.f55720B0);
        }
    }

    private void B0(Canvas canvas, Rect rect) {
        boolean z10;
        if (this.f55729G != null) {
            Paint.Align q02 = q0(rect, this.f55726E0);
            o0(rect, this.f55724D0);
            if (this.f55730G0.d() != null) {
                this.f55730G0.e().drawableState = getState();
                this.f55730G0.j(this.f55778z0);
            }
            this.f55730G0.e().setTextAlign(q02);
            int i10 = 0;
            if (Math.round(this.f55730G0.f(e1().toString())) > Math.round(this.f55724D0.width())) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                i10 = canvas.save();
                canvas.clipRect(this.f55724D0);
            }
            CharSequence charSequence = this.f55729G;
            if (z10 && this.f55752Y0 != null) {
                charSequence = TextUtils.ellipsize(charSequence, this.f55730G0.e(), this.f55724D0.width(), this.f55752Y0);
            }
            CharSequence charSequence2 = charSequence;
            int length = charSequence2.length();
            PointF pointF = this.f55726E0;
            canvas.drawText(charSequence2, 0, length, pointF.x, pointF.y, this.f55730G0.e());
            if (z10) {
                canvas.restoreToCount(i10);
            }
        }
    }

    private boolean J2() {
        if (!this.f55764m0 || this.f55765n0 == null || !this.f55739N0) {
            return false;
        }
        return true;
    }

    private boolean K2() {
        if (!this.f55731H || this.f55733I == null) {
            return false;
        }
        return true;
    }

    private boolean L2() {
        if (!this.f55757f0 || this.f55758g0 == null) {
            return false;
        }
        return true;
    }

    private void M2(Drawable drawable) {
        if (drawable != null) {
            drawable.setCallback((Drawable.Callback) null);
        }
    }

    private void N2() {
        ColorStateList colorStateList;
        if (this.f55747V0) {
            colorStateList = C4995b.a(this.f55727F);
        } else {
            colorStateList = null;
        }
        this.f55748W0 = colorStateList;
    }

    private void O2() {
        this.f55759h0 = new RippleDrawable(C4995b.a(c1()), this.f55758g0, f55716d1);
    }

    private float W0() {
        Drawable drawable;
        if (this.f55739N0) {
            drawable = this.f55765n0;
        } else {
            drawable = this.f55733I;
        }
        float f10 = this.f55751Y;
        if (f10 <= 0.0f && drawable != null) {
            f10 = (float) Math.ceil((double) n.b(this.f55778z0, 24));
            if (((float) drawable.getIntrinsicHeight()) <= f10) {
                return (float) drawable.getIntrinsicHeight();
            }
        }
        return f10;
    }

    private float X0() {
        Drawable drawable;
        if (this.f55739N0) {
            drawable = this.f55765n0;
        } else {
            drawable = this.f55733I;
        }
        float f10 = this.f55751Y;
        if (f10 > 0.0f || drawable == null) {
            return f10;
        }
        return (float) drawable.getIntrinsicWidth();
    }

    private void Y1(ColorStateList colorStateList) {
        if (this.f55777z != colorStateList) {
            this.f55777z = colorStateList;
            onStateChange(getState());
        }
    }

    private void h0(Drawable drawable) {
        if (drawable != null) {
            drawable.setCallback(this);
            C2429a.g(drawable, C2429a.b(this));
            drawable.setLevel(getLevel());
            drawable.setVisible(isVisible(), false);
            if (drawable == this.f55758g0) {
                if (drawable.isStateful()) {
                    drawable.setState(T0());
                }
                C2429a.i(drawable, this.f55760i0);
                return;
            }
            Drawable drawable2 = this.f55733I;
            if (drawable == drawable2 && this.f55753Z) {
                C2429a.i(drawable2, this.f55749X);
            }
            if (drawable.isStateful()) {
                drawable.setState(getState());
            }
        }
    }

    private void i0(Rect rect, RectF rectF) {
        rectF.setEmpty();
        if (K2() || J2()) {
            float f10 = this.f55769r0 + this.f55770s0;
            float X02 = X0();
            if (C2429a.b(this) == 0) {
                float f11 = ((float) rect.left) + f10;
                rectF.left = f11;
                rectF.right = f11 + X02;
            } else {
                float f12 = ((float) rect.right) - f10;
                rectF.right = f12;
                rectF.left = f12 - X02;
            }
            float W02 = W0();
            float exactCenterY = rect.exactCenterY() - (W02 / 2.0f);
            rectF.top = exactCenterY;
            rectF.bottom = exactCenterY + W02;
        }
    }

    private ColorFilter i1() {
        ColorFilter colorFilter = this.f55742Q0;
        if (colorFilter != null) {
            return colorFilter;
        }
        return this.f55743R0;
    }

    private void k0(Rect rect, RectF rectF) {
        rectF.set(rect);
        if (L2()) {
            float f10 = this.f55776y0 + this.f55775x0 + this.f55761j0 + this.f55774w0 + this.f55773v0;
            if (C2429a.b(this) == 0) {
                rectF.right = ((float) rect.right) - f10;
            } else {
                rectF.left = ((float) rect.left) + f10;
            }
        }
    }

    private static boolean k1(int[] iArr, int i10) {
        if (iArr == null) {
            return false;
        }
        for (int i11 : iArr) {
            if (i11 == i10) {
                return true;
            }
        }
        return false;
    }

    private void l0(Rect rect, RectF rectF) {
        rectF.setEmpty();
        if (L2()) {
            float f10 = this.f55776y0 + this.f55775x0;
            if (C2429a.b(this) == 0) {
                float f11 = ((float) rect.right) - f10;
                rectF.right = f11;
                rectF.left = f11 - this.f55761j0;
            } else {
                float f12 = ((float) rect.left) + f10;
                rectF.left = f12;
                rectF.right = f12 + this.f55761j0;
            }
            float exactCenterY = rect.exactCenterY();
            float f13 = this.f55761j0;
            float f14 = exactCenterY - (f13 / 2.0f);
            rectF.top = f14;
            rectF.bottom = f14 + f13;
        }
    }

    private void m0(Rect rect, RectF rectF) {
        rectF.setEmpty();
        if (L2()) {
            float f10 = this.f55776y0 + this.f55775x0 + this.f55761j0 + this.f55774w0 + this.f55773v0;
            if (C2429a.b(this) == 0) {
                float f11 = (float) rect.right;
                rectF.right = f11;
                rectF.left = f11 - f10;
            } else {
                int i10 = rect.left;
                rectF.left = (float) i10;
                rectF.right = ((float) i10) + f10;
            }
            rectF.top = (float) rect.top;
            rectF.bottom = (float) rect.bottom;
        }
    }

    private void o0(Rect rect, RectF rectF) {
        rectF.setEmpty();
        if (this.f55729G != null) {
            float j02 = this.f55769r0 + j0() + this.f55772u0;
            float n02 = this.f55776y0 + n0() + this.f55773v0;
            if (C2429a.b(this) == 0) {
                rectF.left = ((float) rect.left) + j02;
                rectF.right = ((float) rect.right) - n02;
            } else {
                rectF.left = ((float) rect.left) + n02;
                rectF.right = ((float) rect.right) - j02;
            }
            rectF.top = (float) rect.top;
            rectF.bottom = (float) rect.bottom;
        }
    }

    private static boolean o1(ColorStateList colorStateList) {
        if (colorStateList == null || !colorStateList.isStateful()) {
            return false;
        }
        return true;
    }

    private float p0() {
        this.f55730G0.e().getFontMetrics(this.f55722C0);
        Paint.FontMetrics fontMetrics = this.f55722C0;
        return (fontMetrics.descent + fontMetrics.ascent) / 2.0f;
    }

    private static boolean p1(Drawable drawable) {
        if (drawable == null || !drawable.isStateful()) {
            return false;
        }
        return true;
    }

    private static boolean q1(C4983d dVar) {
        if (dVar == null || dVar.i() == null || !dVar.i().isStateful()) {
            return false;
        }
        return true;
    }

    private boolean r0() {
        if (!this.f55764m0 || this.f55765n0 == null || !this.f55763l0) {
            return false;
        }
        return true;
    }

    private void r1(AttributeSet attributeSet, int i10, int i11) {
        TypedArray h10 = l.h(this.f55778z0, attributeSet, Ua.j.f53159f0, i10, i11, new int[0]);
        this.f55756b1 = h10.hasValue(Ua.j.f53049Q0);
        Y1(C4982c.a(this.f55778z0, h10, Ua.j.f52955D0));
        C1(C4982c.a(this.f55778z0, h10, Ua.j.f53247q0));
        Q1(h10.getDimension(Ua.j.f53311y0, 0.0f));
        if (h10.hasValue(Ua.j.f53255r0)) {
            E1(h10.getDimension(Ua.j.f53255r0, 0.0f));
        }
        U1(C4982c.a(this.f55778z0, h10, Ua.j.f52939B0));
        W1(h10.getDimension(Ua.j.f52947C0, 0.0f));
        v2(C4982c.a(this.f55778z0, h10, Ua.j.f53042P0));
        A2(h10.getText(Ua.j.f53199k0));
        C4983d f10 = C4982c.f(this.f55778z0, h10, Ua.j.f53167g0);
        f10.l(h10.getDimension(Ua.j.f53175h0, f10.j()));
        B2(f10);
        int i12 = h10.getInt(Ua.j.f53183i0, 0);
        if (i12 == 1) {
            n2(TextUtils.TruncateAt.START);
        } else if (i12 == 2) {
            n2(TextUtils.TruncateAt.MIDDLE);
        } else if (i12 == 3) {
            n2(TextUtils.TruncateAt.END);
        }
        P1(h10.getBoolean(Ua.j.f53303x0, false));
        if (!(attributeSet == null || attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "chipIconEnabled") == null || attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "chipIconVisible") != null)) {
            P1(h10.getBoolean(Ua.j.f53279u0, false));
        }
        I1(C4982c.d(this.f55778z0, h10, Ua.j.f53271t0));
        if (h10.hasValue(Ua.j.f53295w0)) {
            M1(C4982c.a(this.f55778z0, h10, Ua.j.f53295w0));
        }
        K1(h10.getDimension(Ua.j.f53287v0, -1.0f));
        l2(h10.getBoolean(Ua.j.f53007K0, false));
        if (!(attributeSet == null || attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "closeIconEnabled") == null || attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "closeIconVisible") != null)) {
            l2(h10.getBoolean(Ua.j.f52971F0, false));
        }
        Z1(C4982c.d(this.f55778z0, h10, Ua.j.f52963E0));
        j2(C4982c.a(this.f55778z0, h10, Ua.j.f53000J0));
        e2(h10.getDimension(Ua.j.f52986H0, 0.0f));
        u1(h10.getBoolean(Ua.j.f53207l0, false));
        B1(h10.getBoolean(Ua.j.f53239p0, false));
        if (!(attributeSet == null || attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "checkedIconEnabled") == null || attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "checkedIconVisible") != null)) {
            B1(h10.getBoolean(Ua.j.f53223n0, false));
        }
        w1(C4982c.d(this.f55778z0, h10, Ua.j.f53215m0));
        if (h10.hasValue(Ua.j.f53231o0)) {
            y1(C4982c.a(this.f55778z0, h10, Ua.j.f53231o0));
        }
        y2(c.b(this.f55778z0, h10, Ua.j.f53056R0));
        o2(c.b(this.f55778z0, h10, Ua.j.f53021M0));
        S1(h10.getDimension(Ua.j.f52931A0, 0.0f));
        s2(h10.getDimension(Ua.j.f53035O0, 0.0f));
        q2(h10.getDimension(Ua.j.f53028N0, 0.0f));
        F2(h10.getDimension(Ua.j.f53070T0, 0.0f));
        D2(h10.getDimension(Ua.j.f53063S0, 0.0f));
        g2(h10.getDimension(Ua.j.f52993I0, 0.0f));
        b2(h10.getDimension(Ua.j.f52979G0, 0.0f));
        G1(h10.getDimension(Ua.j.f53263s0, 0.0f));
        u2(h10.getDimensionPixelSize(Ua.j.f53191j0, a.e.API_PRIORITY_OTHER));
        h10.recycle();
    }

    public static a s0(Context context, AttributeSet attributeSet, int i10, int i11) {
        a aVar = new a(context, attributeSet, i10, i11);
        aVar.r1(attributeSet, i10, i11);
        return aVar;
    }

    private void t0(Canvas canvas, Rect rect) {
        if (J2()) {
            i0(rect, this.f55724D0);
            RectF rectF = this.f55724D0;
            float f10 = rectF.left;
            float f11 = rectF.top;
            canvas.translate(f10, f11);
            this.f55765n0.setBounds(0, 0, (int) this.f55724D0.width(), (int) this.f55724D0.height());
            this.f55765n0.draw(canvas);
            canvas.translate(-f10, -f11);
        }
    }

    private boolean t1(int[] iArr, int[] iArr2) {
        int i10;
        int i11;
        boolean z10;
        boolean z11;
        int i12;
        int i13;
        int i14;
        boolean z12;
        boolean z13;
        int i15;
        boolean onStateChange = super.onStateChange(iArr);
        ColorStateList colorStateList = this.f55777z;
        if (colorStateList != null) {
            i10 = colorStateList.getColorForState(iArr, this.f55732H0);
        } else {
            i10 = 0;
        }
        int l10 = l(i10);
        boolean z14 = true;
        if (this.f55732H0 != l10) {
            this.f55732H0 = l10;
            onStateChange = true;
        }
        ColorStateList colorStateList2 = this.f55717A;
        if (colorStateList2 != null) {
            i11 = colorStateList2.getColorForState(iArr, this.f55734I0);
        } else {
            i11 = 0;
        }
        int l11 = l(i11);
        if (this.f55734I0 != l11) {
            this.f55734I0 = l11;
            onStateChange = true;
        }
        int g10 = Ya.a.g(l10, l11);
        if (this.f55735J0 != g10) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (x() == null) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z10 || z11) {
            this.f55735J0 = g10;
            W(ColorStateList.valueOf(g10));
            onStateChange = true;
        }
        ColorStateList colorStateList3 = this.f55723D;
        if (colorStateList3 != null) {
            i12 = colorStateList3.getColorForState(iArr, this.f55736K0);
        } else {
            i12 = 0;
        }
        if (this.f55736K0 != i12) {
            this.f55736K0 = i12;
            onStateChange = true;
        }
        if (this.f55748W0 == null || !C4995b.b(iArr)) {
            i13 = 0;
        } else {
            i13 = this.f55748W0.getColorForState(iArr, this.f55737L0);
        }
        if (this.f55737L0 != i13) {
            this.f55737L0 = i13;
            if (this.f55747V0) {
                onStateChange = true;
            }
        }
        if (this.f55730G0.d() == null || this.f55730G0.d().i() == null) {
            i14 = 0;
        } else {
            i14 = this.f55730G0.d().i().getColorForState(iArr, this.f55738M0);
        }
        if (this.f55738M0 != i14) {
            this.f55738M0 = i14;
            onStateChange = true;
        }
        if (!k1(getState(), 16842912) || !this.f55763l0) {
            z12 = false;
        } else {
            z12 = true;
        }
        if (this.f55739N0 == z12 || this.f55765n0 == null) {
            z13 = false;
        } else {
            float j02 = j0();
            this.f55739N0 = z12;
            if (j02 != j0()) {
                onStateChange = true;
                z13 = true;
            } else {
                z13 = false;
                onStateChange = true;
            }
        }
        ColorStateList colorStateList4 = this.f55744S0;
        if (colorStateList4 != null) {
            i15 = colorStateList4.getColorForState(iArr, this.f55740O0);
        } else {
            i15 = 0;
        }
        if (this.f55740O0 != i15) {
            this.f55740O0 = i15;
            this.f55743R0 = C4457a.a(this, this.f55744S0, this.f55745T0);
        } else {
            z14 = onStateChange;
        }
        if (p1(this.f55733I)) {
            z14 |= this.f55733I.setState(iArr);
        }
        if (p1(this.f55765n0)) {
            z14 |= this.f55765n0.setState(iArr);
        }
        if (p1(this.f55758g0)) {
            int[] iArr3 = new int[(iArr.length + iArr2.length)];
            System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
            System.arraycopy(iArr2, 0, iArr3, iArr.length, iArr2.length);
            z14 |= this.f55758g0.setState(iArr3);
        }
        if (C4995b.f60593a && p1(this.f55759h0)) {
            z14 |= this.f55759h0.setState(iArr2);
        }
        if (z14) {
            invalidateSelf();
        }
        if (z13) {
            s1();
        }
        return z14;
    }

    private void u0(Canvas canvas, Rect rect) {
        if (!this.f55756b1) {
            this.f55718A0.setColor(this.f55734I0);
            this.f55718A0.setStyle(Paint.Style.FILL);
            this.f55718A0.setColorFilter(i1());
            this.f55724D0.set(rect);
            canvas.drawRoundRect(this.f55724D0, F0(), F0(), this.f55718A0);
        }
    }

    private void v0(Canvas canvas, Rect rect) {
        if (K2()) {
            i0(rect, this.f55724D0);
            RectF rectF = this.f55724D0;
            float f10 = rectF.left;
            float f11 = rectF.top;
            canvas.translate(f10, f11);
            this.f55733I.setBounds(0, 0, (int) this.f55724D0.width(), (int) this.f55724D0.height());
            this.f55733I.draw(canvas);
            canvas.translate(-f10, -f11);
        }
    }

    private void w0(Canvas canvas, Rect rect) {
        if (this.f55725E > 0.0f && !this.f55756b1) {
            this.f55718A0.setColor(this.f55736K0);
            this.f55718A0.setStyle(Paint.Style.STROKE);
            if (!this.f55756b1) {
                this.f55718A0.setColorFilter(i1());
            }
            RectF rectF = this.f55724D0;
            float f10 = this.f55725E;
            rectF.set(((float) rect.left) + (f10 / 2.0f), ((float) rect.top) + (f10 / 2.0f), ((float) rect.right) - (f10 / 2.0f), ((float) rect.bottom) - (f10 / 2.0f));
            float f11 = this.f55721C - (this.f55725E / 2.0f);
            canvas.drawRoundRect(this.f55724D0, f11, f11, this.f55718A0);
        }
    }

    private void x0(Canvas canvas, Rect rect) {
        if (!this.f55756b1) {
            this.f55718A0.setColor(this.f55732H0);
            this.f55718A0.setStyle(Paint.Style.FILL);
            this.f55724D0.set(rect);
            canvas.drawRoundRect(this.f55724D0, F0(), F0(), this.f55718A0);
        }
    }

    private void y0(Canvas canvas, Rect rect) {
        if (L2()) {
            l0(rect, this.f55724D0);
            RectF rectF = this.f55724D0;
            float f10 = rectF.left;
            float f11 = rectF.top;
            canvas.translate(f10, f11);
            this.f55758g0.setBounds(0, 0, (int) this.f55724D0.width(), (int) this.f55724D0.height());
            if (C4995b.f60593a) {
                this.f55759h0.setBounds(this.f55758g0.getBounds());
                this.f55759h0.jumpToCurrentState();
                this.f55759h0.draw(canvas);
            } else {
                this.f55758g0.draw(canvas);
            }
            canvas.translate(-f10, -f11);
        }
    }

    private void z0(Canvas canvas, Rect rect) {
        this.f55718A0.setColor(this.f55737L0);
        this.f55718A0.setStyle(Paint.Style.FILL);
        this.f55724D0.set(rect);
        if (!this.f55756b1) {
            canvas.drawRoundRect(this.f55724D0, F0(), F0(), this.f55718A0);
            return;
        }
        h(new RectF(rect), this.f55728F0);
        super.p(canvas, this.f55718A0, this.f55728F0, u());
    }

    public void A1(int i10) {
        B1(this.f55778z0.getResources().getBoolean(i10));
    }

    public void A2(CharSequence charSequence) {
        if (charSequence == null) {
            charSequence = "";
        }
        if (!TextUtils.equals(this.f55729G, charSequence)) {
            this.f55729G = charSequence;
            this.f55730G0.i(true);
            invalidateSelf();
            s1();
        }
    }

    public void B1(boolean z10) {
        if (this.f55764m0 != z10) {
            boolean J22 = J2();
            this.f55764m0 = z10;
            boolean J23 = J2();
            if (J22 != J23) {
                if (J23) {
                    h0(this.f55765n0);
                } else {
                    M2(this.f55765n0);
                }
                invalidateSelf();
                s1();
            }
        }
    }

    public void B2(C4983d dVar) {
        this.f55730G0.h(dVar, this.f55778z0);
    }

    public Drawable C0() {
        return this.f55765n0;
    }

    public void C1(ColorStateList colorStateList) {
        if (this.f55717A != colorStateList) {
            this.f55717A = colorStateList;
            onStateChange(getState());
        }
    }

    public void C2(int i10) {
        B2(new C4983d(this.f55778z0, i10));
    }

    public ColorStateList D0() {
        return this.f55766o0;
    }

    public void D1(int i10) {
        C1(C2115a.a(this.f55778z0, i10));
    }

    public void D2(float f10) {
        if (this.f55773v0 != f10) {
            this.f55773v0 = f10;
            invalidateSelf();
            s1();
        }
    }

    public ColorStateList E0() {
        return this.f55717A;
    }

    public void E1(float f10) {
        if (this.f55721C != f10) {
            this.f55721C = f10;
            setShapeAppearanceModel(C().w(f10));
        }
    }

    public void E2(int i10) {
        D2(this.f55778z0.getResources().getDimension(i10));
    }

    public float F0() {
        if (this.f55756b1) {
            return F();
        }
        return this.f55721C;
    }

    public void F1(int i10) {
        E1(this.f55778z0.getResources().getDimension(i10));
    }

    public void F2(float f10) {
        if (this.f55772u0 != f10) {
            this.f55772u0 = f10;
            invalidateSelf();
            s1();
        }
    }

    public float G0() {
        return this.f55776y0;
    }

    public void G1(float f10) {
        if (this.f55776y0 != f10) {
            this.f55776y0 = f10;
            invalidateSelf();
            s1();
        }
    }

    public void G2(int i10) {
        F2(this.f55778z0.getResources().getDimension(i10));
    }

    public Drawable H0() {
        Drawable drawable = this.f55733I;
        if (drawable != null) {
            return C2429a.k(drawable);
        }
        return null;
    }

    public void H1(int i10) {
        G1(this.f55778z0.getResources().getDimension(i10));
    }

    public void H2(boolean z10) {
        if (this.f55747V0 != z10) {
            this.f55747V0 = z10;
            N2();
            onStateChange(getState());
        }
    }

    public float I0() {
        return this.f55751Y;
    }

    public void I1(Drawable drawable) {
        Drawable drawable2;
        Drawable H02 = H0();
        if (H02 != drawable) {
            float j02 = j0();
            if (drawable != null) {
                drawable2 = C2429a.l(drawable).mutate();
            } else {
                drawable2 = null;
            }
            this.f55733I = drawable2;
            float j03 = j0();
            M2(H02);
            if (K2()) {
                h0(this.f55733I);
            }
            invalidateSelf();
            if (j02 != j03) {
                s1();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public boolean I2() {
        return this.f55754Z0;
    }

    public ColorStateList J0() {
        return this.f55749X;
    }

    public void J1(int i10) {
        I1(C2115a.b(this.f55778z0, i10));
    }

    public float K0() {
        return this.f55719B;
    }

    public void K1(float f10) {
        if (this.f55751Y != f10) {
            float j02 = j0();
            this.f55751Y = f10;
            float j03 = j0();
            invalidateSelf();
            if (j02 != j03) {
                s1();
            }
        }
    }

    public float L0() {
        return this.f55769r0;
    }

    public void L1(int i10) {
        K1(this.f55778z0.getResources().getDimension(i10));
    }

    public ColorStateList M0() {
        return this.f55723D;
    }

    public void M1(ColorStateList colorStateList) {
        this.f55753Z = true;
        if (this.f55749X != colorStateList) {
            this.f55749X = colorStateList;
            if (K2()) {
                C2429a.i(this.f55733I, colorStateList);
            }
            onStateChange(getState());
        }
    }

    public float N0() {
        return this.f55725E;
    }

    public void N1(int i10) {
        M1(C2115a.a(this.f55778z0, i10));
    }

    public Drawable O0() {
        Drawable drawable = this.f55758g0;
        if (drawable != null) {
            return C2429a.k(drawable);
        }
        return null;
    }

    public void O1(int i10) {
        P1(this.f55778z0.getResources().getBoolean(i10));
    }

    public CharSequence P0() {
        return this.f55762k0;
    }

    public void P1(boolean z10) {
        if (this.f55731H != z10) {
            boolean K22 = K2();
            this.f55731H = z10;
            boolean K23 = K2();
            if (K22 != K23) {
                if (K23) {
                    h0(this.f55733I);
                } else {
                    M2(this.f55733I);
                }
                invalidateSelf();
                s1();
            }
        }
    }

    public float Q0() {
        return this.f55775x0;
    }

    public void Q1(float f10) {
        if (this.f55719B != f10) {
            this.f55719B = f10;
            invalidateSelf();
            s1();
        }
    }

    public float R0() {
        return this.f55761j0;
    }

    public void R1(int i10) {
        Q1(this.f55778z0.getResources().getDimension(i10));
    }

    public float S0() {
        return this.f55774w0;
    }

    public void S1(float f10) {
        if (this.f55769r0 != f10) {
            this.f55769r0 = f10;
            invalidateSelf();
            s1();
        }
    }

    public int[] T0() {
        return this.f55746U0;
    }

    public void T1(int i10) {
        S1(this.f55778z0.getResources().getDimension(i10));
    }

    public ColorStateList U0() {
        return this.f55760i0;
    }

    public void U1(ColorStateList colorStateList) {
        if (this.f55723D != colorStateList) {
            this.f55723D = colorStateList;
            if (this.f55756b1) {
                c0(colorStateList);
            }
            onStateChange(getState());
        }
    }

    public void V0(RectF rectF) {
        m0(getBounds(), rectF);
    }

    public void V1(int i10) {
        U1(C2115a.a(this.f55778z0, i10));
    }

    public void W1(float f10) {
        if (this.f55725E != f10) {
            this.f55725E = f10;
            this.f55718A0.setStrokeWidth(f10);
            if (this.f55756b1) {
                super.d0(f10);
            }
            invalidateSelf();
        }
    }

    public void X1(int i10) {
        W1(this.f55778z0.getResources().getDimension(i10));
    }

    public TextUtils.TruncateAt Y0() {
        return this.f55752Y0;
    }

    public c Z0() {
        return this.f55768q0;
    }

    public void Z1(Drawable drawable) {
        Drawable drawable2;
        Drawable O02 = O0();
        if (O02 != drawable) {
            float n02 = n0();
            if (drawable != null) {
                drawable2 = C2429a.l(drawable).mutate();
            } else {
                drawable2 = null;
            }
            this.f55758g0 = drawable2;
            if (C4995b.f60593a) {
                O2();
            }
            float n03 = n0();
            M2(O02);
            if (L2()) {
                h0(this.f55758g0);
            }
            invalidateSelf();
            if (n02 != n03) {
                s1();
            }
        }
    }

    public void a() {
        s1();
        invalidateSelf();
    }

    public float a1() {
        return this.f55771t0;
    }

    public void a2(CharSequence charSequence) {
        if (this.f55762k0 != charSequence) {
            this.f55762k0 = C2818a.c().h(charSequence);
            invalidateSelf();
        }
    }

    public float b1() {
        return this.f55770s0;
    }

    public void b2(float f10) {
        if (this.f55775x0 != f10) {
            this.f55775x0 = f10;
            invalidateSelf();
            if (L2()) {
                s1();
            }
        }
    }

    public ColorStateList c1() {
        return this.f55727F;
    }

    public void c2(int i10) {
        b2(this.f55778z0.getResources().getDimension(i10));
    }

    public c d1() {
        return this.f55767p0;
    }

    public void d2(int i10) {
        Z1(C2115a.b(this.f55778z0, i10));
    }

    public void draw(Canvas canvas) {
        int i10;
        Rect bounds = getBounds();
        if (!bounds.isEmpty() && getAlpha() != 0) {
            int i11 = this.f55741P0;
            if (i11 < 255) {
                i10 = Wa.a.a(canvas, (float) bounds.left, (float) bounds.top, (float) bounds.right, (float) bounds.bottom, i11);
            } else {
                i10 = 0;
            }
            x0(canvas, bounds);
            u0(canvas, bounds);
            if (this.f55756b1) {
                super.draw(canvas);
            }
            w0(canvas, bounds);
            z0(canvas, bounds);
            v0(canvas, bounds);
            t0(canvas, bounds);
            if (this.f55754Z0) {
                B0(canvas, bounds);
            }
            y0(canvas, bounds);
            A0(canvas, bounds);
            if (this.f55741P0 < 255) {
                canvas.restoreToCount(i10);
            }
        }
    }

    public CharSequence e1() {
        return this.f55729G;
    }

    public void e2(float f10) {
        if (this.f55761j0 != f10) {
            this.f55761j0 = f10;
            invalidateSelf();
            if (L2()) {
                s1();
            }
        }
    }

    public C4983d f1() {
        return this.f55730G0.d();
    }

    public void f2(int i10) {
        e2(this.f55778z0.getResources().getDimension(i10));
    }

    public float g1() {
        return this.f55773v0;
    }

    public void g2(float f10) {
        if (this.f55774w0 != f10) {
            this.f55774w0 = f10;
            invalidateSelf();
            if (L2()) {
                s1();
            }
        }
    }

    public int getAlpha() {
        return this.f55741P0;
    }

    public ColorFilter getColorFilter() {
        return this.f55742Q0;
    }

    public int getIntrinsicHeight() {
        return (int) this.f55719B;
    }

    public int getIntrinsicWidth() {
        return Math.min(Math.round(this.f55769r0 + j0() + this.f55772u0 + this.f55730G0.f(e1().toString()) + this.f55773v0 + n0() + this.f55776y0), this.f55755a1);
    }

    public int getOpacity() {
        return -3;
    }

    public void getOutline(Outline outline) {
        if (this.f55756b1) {
            super.getOutline(outline);
            return;
        }
        Rect bounds = getBounds();
        if (!bounds.isEmpty()) {
            outline.setRoundRect(bounds, this.f55721C);
        } else {
            outline.setRoundRect(0, 0, getIntrinsicWidth(), getIntrinsicHeight(), this.f55721C);
        }
        outline.setAlpha(((float) getAlpha()) / 255.0f);
    }

    public float h1() {
        return this.f55772u0;
    }

    public void h2(int i10) {
        g2(this.f55778z0.getResources().getDimension(i10));
    }

    public boolean i2(int[] iArr) {
        if (Arrays.equals(this.f55746U0, iArr)) {
            return false;
        }
        this.f55746U0 = iArr;
        if (L2()) {
            return t1(getState(), iArr);
        }
        return false;
    }

    public void invalidateDrawable(Drawable drawable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    public boolean isStateful() {
        if (o1(this.f55777z) || o1(this.f55717A) || o1(this.f55723D) || ((this.f55747V0 && o1(this.f55748W0)) || q1(this.f55730G0.d()) || r0() || p1(this.f55733I) || p1(this.f55765n0) || o1(this.f55744S0))) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public float j0() {
        if (K2() || J2()) {
            return this.f55770s0 + X0() + this.f55771t0;
        }
        return 0.0f;
    }

    public boolean j1() {
        return this.f55747V0;
    }

    public void j2(ColorStateList colorStateList) {
        if (this.f55760i0 != colorStateList) {
            this.f55760i0 = colorStateList;
            if (L2()) {
                C2429a.i(this.f55758g0, colorStateList);
            }
            onStateChange(getState());
        }
    }

    public void k2(int i10) {
        j2(C2115a.a(this.f55778z0, i10));
    }

    public boolean l1() {
        return this.f55763l0;
    }

    public void l2(boolean z10) {
        if (this.f55757f0 != z10) {
            boolean L22 = L2();
            this.f55757f0 = z10;
            boolean L23 = L2();
            if (L22 != L23) {
                if (L23) {
                    h0(this.f55758g0);
                } else {
                    M2(this.f55758g0);
                }
                invalidateSelf();
                s1();
            }
        }
    }

    public boolean m1() {
        return p1(this.f55758g0);
    }

    public void m2(C0832a aVar) {
        this.f55750X0 = new WeakReference(aVar);
    }

    /* access modifiers changed from: package-private */
    public float n0() {
        if (L2()) {
            return this.f55774w0 + this.f55761j0 + this.f55775x0;
        }
        return 0.0f;
    }

    public boolean n1() {
        return this.f55757f0;
    }

    public void n2(TextUtils.TruncateAt truncateAt) {
        this.f55752Y0 = truncateAt;
    }

    public void o2(c cVar) {
        this.f55768q0 = cVar;
    }

    public boolean onLayoutDirectionChanged(int i10) {
        boolean onLayoutDirectionChanged = super.onLayoutDirectionChanged(i10);
        if (K2()) {
            onLayoutDirectionChanged |= C2429a.g(this.f55733I, i10);
        }
        if (J2()) {
            onLayoutDirectionChanged |= C2429a.g(this.f55765n0, i10);
        }
        if (L2()) {
            onLayoutDirectionChanged |= C2429a.g(this.f55758g0, i10);
        }
        if (!onLayoutDirectionChanged) {
            return true;
        }
        invalidateSelf();
        return true;
    }

    /* access modifiers changed from: protected */
    public boolean onLevelChange(int i10) {
        boolean onLevelChange = super.onLevelChange(i10);
        if (K2()) {
            onLevelChange |= this.f55733I.setLevel(i10);
        }
        if (J2()) {
            onLevelChange |= this.f55765n0.setLevel(i10);
        }
        if (L2()) {
            onLevelChange |= this.f55758g0.setLevel(i10);
        }
        if (onLevelChange) {
            invalidateSelf();
        }
        return onLevelChange;
    }

    public boolean onStateChange(int[] iArr) {
        if (this.f55756b1) {
            super.onStateChange(iArr);
        }
        return t1(iArr, T0());
    }

    public void p2(int i10) {
        o2(c.c(this.f55778z0, i10));
    }

    /* access modifiers changed from: package-private */
    public Paint.Align q0(Rect rect, PointF pointF) {
        pointF.set(0.0f, 0.0f);
        Paint.Align align = Paint.Align.LEFT;
        if (this.f55729G != null) {
            float j02 = this.f55769r0 + j0() + this.f55772u0;
            if (C2429a.b(this) == 0) {
                pointF.x = ((float) rect.left) + j02;
            } else {
                pointF.x = ((float) rect.right) - j02;
                align = Paint.Align.RIGHT;
            }
            pointF.y = ((float) rect.centerY()) - p0();
        }
        return align;
    }

    public void q2(float f10) {
        if (this.f55771t0 != f10) {
            float j02 = j0();
            this.f55771t0 = f10;
            float j03 = j0();
            invalidateSelf();
            if (j02 != j03) {
                s1();
            }
        }
    }

    public void r2(int i10) {
        q2(this.f55778z0.getResources().getDimension(i10));
    }

    /* access modifiers changed from: protected */
    public void s1() {
        C0832a aVar = (C0832a) this.f55750X0.get();
        if (aVar != null) {
            aVar.a();
        }
    }

    public void s2(float f10) {
        if (this.f55770s0 != f10) {
            float j02 = j0();
            this.f55770s0 = f10;
            float j03 = j0();
            invalidateSelf();
            if (j02 != j03) {
                s1();
            }
        }
    }

    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j10) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.scheduleDrawable(this, runnable, j10);
        }
    }

    public void setAlpha(int i10) {
        if (this.f55741P0 != i10) {
            this.f55741P0 = i10;
            invalidateSelf();
        }
    }

    public void setColorFilter(ColorFilter colorFilter) {
        if (this.f55742Q0 != colorFilter) {
            this.f55742Q0 = colorFilter;
            invalidateSelf();
        }
    }

    public void setTintList(ColorStateList colorStateList) {
        if (this.f55744S0 != colorStateList) {
            this.f55744S0 = colorStateList;
            onStateChange(getState());
        }
    }

    public void setTintMode(PorterDuff.Mode mode) {
        if (this.f55745T0 != mode) {
            this.f55745T0 = mode;
            this.f55743R0 = C4457a.a(this, this.f55744S0, mode);
            invalidateSelf();
        }
    }

    public boolean setVisible(boolean z10, boolean z11) {
        boolean visible = super.setVisible(z10, z11);
        if (K2()) {
            visible |= this.f55733I.setVisible(z10, z11);
        }
        if (J2()) {
            visible |= this.f55765n0.setVisible(z10, z11);
        }
        if (L2()) {
            visible |= this.f55758g0.setVisible(z10, z11);
        }
        if (visible) {
            invalidateSelf();
        }
        return visible;
    }

    public void t2(int i10) {
        s2(this.f55778z0.getResources().getDimension(i10));
    }

    public void u1(boolean z10) {
        if (this.f55763l0 != z10) {
            this.f55763l0 = z10;
            float j02 = j0();
            if (!z10 && this.f55739N0) {
                this.f55739N0 = false;
            }
            float j03 = j0();
            invalidateSelf();
            if (j02 != j03) {
                s1();
            }
        }
    }

    public void u2(int i10) {
        this.f55755a1 = i10;
    }

    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.unscheduleDrawable(this, runnable);
        }
    }

    public void v1(int i10) {
        u1(this.f55778z0.getResources().getBoolean(i10));
    }

    public void v2(ColorStateList colorStateList) {
        if (this.f55727F != colorStateList) {
            this.f55727F = colorStateList;
            N2();
            onStateChange(getState());
        }
    }

    public void w1(Drawable drawable) {
        if (this.f55765n0 != drawable) {
            float j02 = j0();
            this.f55765n0 = drawable;
            float j03 = j0();
            M2(this.f55765n0);
            h0(this.f55765n0);
            invalidateSelf();
            if (j02 != j03) {
                s1();
            }
        }
    }

    public void w2(int i10) {
        v2(C2115a.a(this.f55778z0, i10));
    }

    public void x1(int i10) {
        w1(C2115a.b(this.f55778z0, i10));
    }

    /* access modifiers changed from: package-private */
    public void x2(boolean z10) {
        this.f55754Z0 = z10;
    }

    public void y1(ColorStateList colorStateList) {
        if (this.f55766o0 != colorStateList) {
            this.f55766o0 = colorStateList;
            if (r0()) {
                C2429a.i(this.f55765n0, colorStateList);
            }
            onStateChange(getState());
        }
    }

    public void y2(c cVar) {
        this.f55767p0 = cVar;
    }

    public void z1(int i10) {
        y1(C2115a.a(this.f55778z0, i10));
    }

    public void z2(int i10) {
        y2(c.c(this.f55778z0, i10));
    }
}
