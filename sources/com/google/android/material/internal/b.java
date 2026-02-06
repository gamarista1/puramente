package com.google.android.material.internal;

import android.animation.TimeInterpolator;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.View;
import androidx.core.view.C1680b0;
import androidx.core.view.C1712s;
import fb.C4980a;
import fb.C4983d;
import fb.C4987h;
import s1.C2589a;
import w1.n;
import w1.o;
import x1.g;

public final class b {

    /* renamed from: t0  reason: collision with root package name */
    private static final boolean f55981t0 = false;

    /* renamed from: u0  reason: collision with root package name */
    private static final Paint f55982u0 = null;

    /* renamed from: A  reason: collision with root package name */
    private Typeface f55983A;

    /* renamed from: B  reason: collision with root package name */
    private Typeface f55984B;

    /* renamed from: C  reason: collision with root package name */
    private Typeface f55985C;

    /* renamed from: D  reason: collision with root package name */
    private Typeface f55986D;

    /* renamed from: E  reason: collision with root package name */
    private C4980a f55987E;

    /* renamed from: F  reason: collision with root package name */
    private C4980a f55988F;

    /* renamed from: G  reason: collision with root package name */
    private CharSequence f55989G;

    /* renamed from: H  reason: collision with root package name */
    private CharSequence f55990H;

    /* renamed from: I  reason: collision with root package name */
    private boolean f55991I;

    /* renamed from: J  reason: collision with root package name */
    private boolean f55992J = true;

    /* renamed from: K  reason: collision with root package name */
    private boolean f55993K;

    /* renamed from: L  reason: collision with root package name */
    private Bitmap f55994L;

    /* renamed from: M  reason: collision with root package name */
    private Paint f55995M;

    /* renamed from: N  reason: collision with root package name */
    private float f55996N;

    /* renamed from: O  reason: collision with root package name */
    private float f55997O;

    /* renamed from: P  reason: collision with root package name */
    private float f55998P;

    /* renamed from: Q  reason: collision with root package name */
    private float f55999Q;

    /* renamed from: R  reason: collision with root package name */
    private float f56000R;

    /* renamed from: S  reason: collision with root package name */
    private int f56001S;

    /* renamed from: T  reason: collision with root package name */
    private int[] f56002T;

    /* renamed from: U  reason: collision with root package name */
    private boolean f56003U;

    /* renamed from: V  reason: collision with root package name */
    private final TextPaint f56004V;

    /* renamed from: W  reason: collision with root package name */
    private final TextPaint f56005W;

    /* renamed from: X  reason: collision with root package name */
    private TimeInterpolator f56006X;

    /* renamed from: Y  reason: collision with root package name */
    private TimeInterpolator f56007Y;

    /* renamed from: Z  reason: collision with root package name */
    private float f56008Z;

    /* renamed from: a  reason: collision with root package name */
    private final View f56009a;

    /* renamed from: a0  reason: collision with root package name */
    private float f56010a0;

    /* renamed from: b  reason: collision with root package name */
    private boolean f56011b;

    /* renamed from: b0  reason: collision with root package name */
    private float f56012b0;

    /* renamed from: c  reason: collision with root package name */
    private float f56013c;

    /* renamed from: c0  reason: collision with root package name */
    private ColorStateList f56014c0;

    /* renamed from: d  reason: collision with root package name */
    private boolean f56015d;

    /* renamed from: d0  reason: collision with root package name */
    private float f56016d0;

    /* renamed from: e  reason: collision with root package name */
    private float f56017e;

    /* renamed from: e0  reason: collision with root package name */
    private float f56018e0;

    /* renamed from: f  reason: collision with root package name */
    private float f56019f;

    /* renamed from: f0  reason: collision with root package name */
    private float f56020f0;

    /* renamed from: g  reason: collision with root package name */
    private int f56021g;

    /* renamed from: g0  reason: collision with root package name */
    private ColorStateList f56022g0;

    /* renamed from: h  reason: collision with root package name */
    private final Rect f56023h;

    /* renamed from: h0  reason: collision with root package name */
    private float f56024h0;

    /* renamed from: i  reason: collision with root package name */
    private final Rect f56025i;

    /* renamed from: i0  reason: collision with root package name */
    private float f56026i0;

    /* renamed from: j  reason: collision with root package name */
    private final RectF f56027j;

    /* renamed from: j0  reason: collision with root package name */
    private float f56028j0;

    /* renamed from: k  reason: collision with root package name */
    private int f56029k = 16;

    /* renamed from: k0  reason: collision with root package name */
    private StaticLayout f56030k0;

    /* renamed from: l  reason: collision with root package name */
    private int f56031l = 16;

    /* renamed from: l0  reason: collision with root package name */
    private float f56032l0;

    /* renamed from: m  reason: collision with root package name */
    private float f56033m = 15.0f;

    /* renamed from: m0  reason: collision with root package name */
    private float f56034m0;

    /* renamed from: n  reason: collision with root package name */
    private float f56035n = 15.0f;

    /* renamed from: n0  reason: collision with root package name */
    private float f56036n0;

    /* renamed from: o  reason: collision with root package name */
    private ColorStateList f56037o;

    /* renamed from: o0  reason: collision with root package name */
    private CharSequence f56038o0;

    /* renamed from: p  reason: collision with root package name */
    private ColorStateList f56039p;

    /* renamed from: p0  reason: collision with root package name */
    private int f56040p0 = 1;

    /* renamed from: q  reason: collision with root package name */
    private int f56041q;

    /* renamed from: q0  reason: collision with root package name */
    private float f56042q0 = 0.0f;

    /* renamed from: r  reason: collision with root package name */
    private float f56043r;

    /* renamed from: r0  reason: collision with root package name */
    private float f56044r0 = 1.0f;

    /* renamed from: s  reason: collision with root package name */
    private float f56045s;

    /* renamed from: s0  reason: collision with root package name */
    private int f56046s0 = i.f56067n;

    /* renamed from: t  reason: collision with root package name */
    private float f56047t;

    /* renamed from: u  reason: collision with root package name */
    private float f56048u;

    /* renamed from: v  reason: collision with root package name */
    private float f56049v;

    /* renamed from: w  reason: collision with root package name */
    private float f56050w;

    /* renamed from: x  reason: collision with root package name */
    private Typeface f56051x;

    /* renamed from: y  reason: collision with root package name */
    private Typeface f56052y;

    /* renamed from: z  reason: collision with root package name */
    private Typeface f56053z;

    class a implements C4980a.C0887a {
        a() {
        }

        public void a(Typeface typeface) {
            b.this.T(typeface);
        }
    }

    public b(View view) {
        this.f56009a = view;
        TextPaint textPaint = new TextPaint(129);
        this.f56004V = textPaint;
        this.f56005W = new TextPaint(textPaint);
        this.f56025i = new Rect();
        this.f56023h = new Rect();
        this.f56027j = new RectF();
        this.f56019f = e();
        H(view.getContext().getResources().getConfiguration());
    }

    private void A(TextPaint textPaint) {
        textPaint.setTextSize(this.f56033m);
        textPaint.setTypeface(this.f55983A);
        textPaint.setLetterSpacing(this.f56026i0);
    }

    private void B(float f10) {
        Rect rect;
        if (this.f56015d) {
            RectF rectF = this.f56027j;
            if (f10 < this.f56019f) {
                rect = this.f56023h;
            } else {
                rect = this.f56025i;
            }
            rectF.set(rect);
            return;
        }
        this.f56027j.left = G((float) this.f56023h.left, (float) this.f56025i.left, f10, this.f56006X);
        this.f56027j.top = G(this.f56043r, this.f56045s, f10, this.f56006X);
        this.f56027j.right = G((float) this.f56023h.right, (float) this.f56025i.right, f10, this.f56006X);
        this.f56027j.bottom = G((float) this.f56023h.bottom, (float) this.f56025i.bottom, f10, this.f56006X);
    }

    private static boolean C(float f10, float f11) {
        if (Math.abs(f10 - f11) < 1.0E-5f) {
            return true;
        }
        return false;
    }

    private boolean D() {
        if (C1680b0.A(this.f56009a) == 1) {
            return true;
        }
        return false;
    }

    private boolean F(CharSequence charSequence, boolean z10) {
        n nVar;
        if (z10) {
            nVar = o.f27698d;
        } else {
            nVar = o.f27697c;
        }
        return nVar.a(charSequence, 0, charSequence.length());
    }

    private static float G(float f10, float f11, float f12, TimeInterpolator timeInterpolator) {
        if (timeInterpolator != null) {
            f12 = timeInterpolator.getInterpolation(f12);
        }
        return Va.a.a(f10, f11, f12);
    }

    private float I(TextPaint textPaint, CharSequence charSequence) {
        return textPaint.measureText(charSequence, 0, charSequence.length());
    }

    private static boolean M(Rect rect, int i10, int i11, int i12, int i13) {
        if (rect.left == i10 && rect.top == i11 && rect.right == i12 && rect.bottom == i13) {
            return true;
        }
        return false;
    }

    private void Q(float f10) {
        this.f56034m0 = f10;
        C1680b0.f0(this.f56009a);
    }

    private boolean U(Typeface typeface) {
        C4980a aVar = this.f55988F;
        if (aVar != null) {
            aVar.c();
        }
        if (this.f56053z == typeface) {
            return false;
        }
        this.f56053z = typeface;
        Typeface b10 = C4987h.b(this.f56009a.getContext().getResources().getConfiguration(), typeface);
        this.f56052y = b10;
        if (b10 == null) {
            b10 = this.f56053z;
        }
        this.f56051x = b10;
        return true;
    }

    private void Y(float f10) {
        this.f56036n0 = f10;
        C1680b0.f0(this.f56009a);
    }

    private static int a(int i10, int i11, float f10) {
        float f11 = 1.0f - f10;
        return Color.argb(Math.round((((float) Color.alpha(i10)) * f11) + (((float) Color.alpha(i11)) * f10)), Math.round((((float) Color.red(i10)) * f11) + (((float) Color.red(i11)) * f10)), Math.round((((float) Color.green(i10)) * f11) + (((float) Color.green(i11)) * f10)), Math.round((((float) Color.blue(i10)) * f11) + (((float) Color.blue(i11)) * f10)));
    }

    private void b(boolean z10) {
        float f10;
        int i10;
        StaticLayout staticLayout;
        i(1.0f, z10);
        CharSequence charSequence = this.f55990H;
        if (!(charSequence == null || (staticLayout = this.f56030k0) == null)) {
            this.f56038o0 = TextUtils.ellipsize(charSequence, this.f56004V, (float) staticLayout.getWidth(), TextUtils.TruncateAt.END);
        }
        CharSequence charSequence2 = this.f56038o0;
        float f11 = 0.0f;
        if (charSequence2 != null) {
            this.f56032l0 = I(this.f56004V, charSequence2);
        } else {
            this.f56032l0 = 0.0f;
        }
        int b10 = C1712s.b(this.f56031l, this.f55991I ? 1 : 0);
        int i11 = b10 & 112;
        if (i11 == 48) {
            this.f56045s = (float) this.f56025i.top;
        } else if (i11 != 80) {
            this.f56045s = ((float) this.f56025i.centerY()) - ((this.f56004V.descent() - this.f56004V.ascent()) / 2.0f);
        } else {
            this.f56045s = ((float) this.f56025i.bottom) + this.f56004V.ascent();
        }
        int i12 = b10 & 8388615;
        if (i12 == 1) {
            this.f56048u = ((float) this.f56025i.centerX()) - (this.f56032l0 / 2.0f);
        } else if (i12 != 5) {
            this.f56048u = (float) this.f56025i.left;
        } else {
            this.f56048u = ((float) this.f56025i.right) - this.f56032l0;
        }
        i(0.0f, z10);
        StaticLayout staticLayout2 = this.f56030k0;
        if (staticLayout2 != null) {
            f10 = (float) staticLayout2.getHeight();
        } else {
            f10 = 0.0f;
        }
        StaticLayout staticLayout3 = this.f56030k0;
        if (staticLayout3 == null || this.f56040p0 <= 1) {
            CharSequence charSequence3 = this.f55990H;
            if (charSequence3 != null) {
                f11 = I(this.f56004V, charSequence3);
            }
        } else {
            f11 = (float) staticLayout3.getWidth();
        }
        StaticLayout staticLayout4 = this.f56030k0;
        if (staticLayout4 != null) {
            i10 = staticLayout4.getLineCount();
        } else {
            i10 = 0;
        }
        this.f56041q = i10;
        int b11 = C1712s.b(this.f56029k, this.f55991I ? 1 : 0);
        int i13 = b11 & 112;
        if (i13 == 48) {
            this.f56043r = (float) this.f56023h.top;
        } else if (i13 != 80) {
            this.f56043r = ((float) this.f56023h.centerY()) - (f10 / 2.0f);
        } else {
            this.f56043r = (((float) this.f56023h.bottom) - f10) + this.f56004V.descent();
        }
        int i14 = b11 & 8388615;
        if (i14 == 1) {
            this.f56047t = ((float) this.f56023h.centerX()) - (f11 / 2.0f);
        } else if (i14 != 5) {
            this.f56047t = (float) this.f56023h.left;
        } else {
            this.f56047t = ((float) this.f56023h.right) - f11;
        }
        j();
        e0(this.f56013c);
    }

    private void c() {
        g(this.f56013c);
    }

    private boolean c0(Typeface typeface) {
        C4980a aVar = this.f55987E;
        if (aVar != null) {
            aVar.c();
        }
        if (this.f55985C == typeface) {
            return false;
        }
        this.f55985C = typeface;
        Typeface b10 = C4987h.b(this.f56009a.getContext().getResources().getConfiguration(), typeface);
        this.f55984B = b10;
        if (b10 == null) {
            b10 = this.f55985C;
        }
        this.f55983A = b10;
        return true;
    }

    private float d(float f10) {
        float f11 = this.f56019f;
        if (f10 <= f11) {
            return Va.a.b(1.0f, 0.0f, this.f56017e, f11, f10);
        }
        return Va.a.b(0.0f, 1.0f, f11, 1.0f, f10);
    }

    private float e() {
        float f10 = this.f56017e;
        return f10 + ((1.0f - f10) * 0.5f);
    }

    private void e0(float f10) {
        boolean z10;
        h(f10);
        if (!f55981t0 || this.f55996N == 1.0f) {
            z10 = false;
        } else {
            z10 = true;
        }
        this.f55993K = z10;
        if (z10) {
            n();
        }
        C1680b0.f0(this.f56009a);
    }

    private boolean f(CharSequence charSequence) {
        boolean D10 = D();
        if (this.f55992J) {
            return F(charSequence, D10);
        }
        return D10;
    }

    private void g(float f10) {
        float f11;
        B(f10);
        if (!this.f56015d) {
            this.f56049v = G(this.f56047t, this.f56048u, f10, this.f56006X);
            this.f56050w = G(this.f56043r, this.f56045s, f10, this.f56006X);
            e0(f10);
            f11 = f10;
        } else if (f10 < this.f56019f) {
            this.f56049v = this.f56047t;
            this.f56050w = this.f56043r;
            e0(0.0f);
            f11 = 0.0f;
        } else {
            this.f56049v = this.f56048u;
            this.f56050w = this.f56045s - ((float) Math.max(0, this.f56021g));
            e0(1.0f);
            f11 = 1.0f;
        }
        TimeInterpolator timeInterpolator = Va.a.f53419b;
        Q(1.0f - G(0.0f, 1.0f, 1.0f - f10, timeInterpolator));
        Y(G(1.0f, 0.0f, f10, timeInterpolator));
        if (this.f56039p != this.f56037o) {
            this.f56004V.setColor(a(v(), t(), f11));
        } else {
            this.f56004V.setColor(t());
        }
        float f12 = this.f56024h0;
        float f13 = this.f56026i0;
        if (f12 != f13) {
            this.f56004V.setLetterSpacing(G(f13, f12, f10, timeInterpolator));
        } else {
            this.f56004V.setLetterSpacing(f12);
        }
        this.f55998P = G(this.f56016d0, this.f56008Z, f10, (TimeInterpolator) null);
        this.f55999Q = G(this.f56018e0, this.f56010a0, f10, (TimeInterpolator) null);
        this.f56000R = G(this.f56020f0, this.f56012b0, f10, (TimeInterpolator) null);
        int a10 = a(u(this.f56022g0), u(this.f56014c0), f10);
        this.f56001S = a10;
        this.f56004V.setShadowLayer(this.f55998P, this.f55999Q, this.f56000R, a10);
        if (this.f56015d) {
            this.f56004V.setAlpha((int) (d(f10) * ((float) this.f56004V.getAlpha())));
        }
        C1680b0.f0(this.f56009a);
    }

    private void h(float f10) {
        i(f10, false);
    }

    private void i(float f10, boolean z10) {
        float f11;
        float f12;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        if (this.f55989G != null) {
            float width = (float) this.f56025i.width();
            float width2 = (float) this.f56023h.width();
            boolean z16 = false;
            int i10 = 1;
            if (C(f10, 1.0f)) {
                f12 = this.f56035n;
                f11 = this.f56024h0;
                this.f55996N = 1.0f;
                Typeface typeface = this.f55986D;
                Typeface typeface2 = this.f56051x;
                if (typeface != typeface2) {
                    this.f55986D = typeface2;
                    z11 = true;
                } else {
                    z11 = false;
                }
            } else {
                float f13 = this.f56033m;
                float f14 = this.f56026i0;
                Typeface typeface3 = this.f55986D;
                Typeface typeface4 = this.f55983A;
                if (typeface3 != typeface4) {
                    this.f55986D = typeface4;
                    z15 = true;
                } else {
                    z15 = false;
                }
                if (C(f10, 0.0f)) {
                    this.f55996N = 1.0f;
                } else {
                    this.f55996N = G(this.f56033m, this.f56035n, f10, this.f56007Y) / this.f56033m;
                }
                float f15 = this.f56035n / this.f56033m;
                float f16 = width2 * f15;
                if (!z10 && f16 > width) {
                    width = Math.min(width / f15, width2);
                } else {
                    width = width2;
                }
                f12 = f13;
                f11 = f14;
                z11 = z15;
            }
            if (width > 0.0f) {
                if (this.f55997O != f12) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (this.f56028j0 != f11) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                if (z12 || z13 || this.f56003U || z11) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                this.f55997O = f12;
                this.f56028j0 = f11;
                this.f56003U = false;
            }
            if (this.f55990H == null || z11) {
                this.f56004V.setTextSize(this.f55997O);
                this.f56004V.setTypeface(this.f55986D);
                this.f56004V.setLetterSpacing(this.f56028j0);
                TextPaint textPaint = this.f56004V;
                if (this.f55996N != 1.0f) {
                    z16 = true;
                }
                textPaint.setLinearText(z16);
                this.f55991I = f(this.f55989G);
                if (k0()) {
                    i10 = this.f56040p0;
                }
                StaticLayout k10 = k(i10, width, this.f55991I);
                this.f56030k0 = k10;
                this.f55990H = k10.getText();
            }
        }
    }

    private void j() {
        Bitmap bitmap = this.f55994L;
        if (bitmap != null) {
            bitmap.recycle();
            this.f55994L = null;
        }
    }

    private StaticLayout k(int i10, float f10, boolean z10) {
        Layout.Alignment alignment;
        if (i10 == 1) {
            alignment = Layout.Alignment.ALIGN_NORMAL;
        } else {
            alignment = y();
        }
        return (StaticLayout) g.f(i.b(this.f55989G, this.f56004V, (int) f10).d(TextUtils.TruncateAt.END).g(z10).c(alignment).f(false).i(i10).h(this.f56042q0, this.f56044r0).e(this.f56046s0).a());
    }

    private boolean k0() {
        if (this.f56040p0 <= 1 || ((this.f55991I && !this.f56015d) || this.f55993K)) {
            return false;
        }
        return true;
    }

    private void m(Canvas canvas, float f10, float f11) {
        int alpha = this.f56004V.getAlpha();
        canvas.translate(f10, f11);
        float f12 = (float) alpha;
        this.f56004V.setAlpha((int) (this.f56036n0 * f12));
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 31) {
            TextPaint textPaint = this.f56004V;
            textPaint.setShadowLayer(this.f55998P, this.f55999Q, this.f56000R, Ya.a.a(this.f56001S, textPaint.getAlpha()));
        }
        Canvas canvas2 = canvas;
        this.f56030k0.draw(canvas);
        this.f56004V.setAlpha((int) (this.f56034m0 * f12));
        if (i10 >= 31) {
            TextPaint textPaint2 = this.f56004V;
            textPaint2.setShadowLayer(this.f55998P, this.f55999Q, this.f56000R, Ya.a.a(this.f56001S, textPaint2.getAlpha()));
        }
        int lineBaseline = this.f56030k0.getLineBaseline(0);
        CharSequence charSequence = this.f56038o0;
        float f13 = (float) lineBaseline;
        canvas.drawText(charSequence, 0, charSequence.length(), 0.0f, f13, this.f56004V);
        if (i10 >= 31) {
            this.f56004V.setShadowLayer(this.f55998P, this.f55999Q, this.f56000R, this.f56001S);
        }
        if (!this.f56015d) {
            String trim = this.f56038o0.toString().trim();
            if (trim.endsWith("…")) {
                trim = trim.substring(0, trim.length() - 1);
            }
            String str = trim;
            this.f56004V.setAlpha(alpha);
            canvas.drawText(str, 0, Math.min(this.f56030k0.getLineEnd(0), str.length()), 0.0f, f13, this.f56004V);
        }
    }

    private void n() {
        if (this.f55994L == null && !this.f56023h.isEmpty() && !TextUtils.isEmpty(this.f55990H)) {
            g(0.0f);
            int width = this.f56030k0.getWidth();
            int height = this.f56030k0.getHeight();
            if (width > 0 && height > 0) {
                this.f55994L = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
                this.f56030k0.draw(new Canvas(this.f55994L));
                if (this.f55995M == null) {
                    this.f55995M = new Paint(3);
                }
            }
        }
    }

    private float r(int i10, int i11) {
        if (i11 == 17 || (i11 & 7) == 1) {
            return (((float) i10) / 2.0f) - (this.f56032l0 / 2.0f);
        }
        if ((i11 & 8388613) == 8388613 || (i11 & 5) == 5) {
            if (this.f55991I) {
                return (float) this.f56025i.left;
            }
            return ((float) this.f56025i.right) - this.f56032l0;
        } else if (this.f55991I) {
            return ((float) this.f56025i.right) - this.f56032l0;
        } else {
            return (float) this.f56025i.left;
        }
    }

    private float s(RectF rectF, int i10, int i11) {
        if (i11 == 17 || (i11 & 7) == 1) {
            return (((float) i10) / 2.0f) + (this.f56032l0 / 2.0f);
        }
        if ((i11 & 8388613) == 8388613 || (i11 & 5) == 5) {
            if (this.f55991I) {
                return rectF.left + this.f56032l0;
            }
            return (float) this.f56025i.right;
        } else if (this.f55991I) {
            return (float) this.f56025i.right;
        } else {
            return rectF.left + this.f56032l0;
        }
    }

    private int u(ColorStateList colorStateList) {
        if (colorStateList == null) {
            return 0;
        }
        int[] iArr = this.f56002T;
        if (iArr != null) {
            return colorStateList.getColorForState(iArr, 0);
        }
        return colorStateList.getDefaultColor();
    }

    private int v() {
        return u(this.f56037o);
    }

    private Layout.Alignment y() {
        int b10 = C1712s.b(this.f56029k, this.f55991I ? 1 : 0) & 7;
        if (b10 == 1) {
            return Layout.Alignment.ALIGN_CENTER;
        }
        if (b10 != 5) {
            if (this.f55991I) {
                return Layout.Alignment.ALIGN_OPPOSITE;
            }
            return Layout.Alignment.ALIGN_NORMAL;
        } else if (this.f55991I) {
            return Layout.Alignment.ALIGN_NORMAL;
        } else {
            return Layout.Alignment.ALIGN_OPPOSITE;
        }
    }

    private void z(TextPaint textPaint) {
        textPaint.setTextSize(this.f56035n);
        textPaint.setTypeface(this.f56051x);
        textPaint.setLetterSpacing(this.f56024h0);
    }

    public final boolean E() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2 = this.f56039p;
        if ((colorStateList2 == null || !colorStateList2.isStateful()) && ((colorStateList = this.f56037o) == null || !colorStateList.isStateful())) {
            return false;
        }
        return true;
    }

    public void H(Configuration configuration) {
        if (Build.VERSION.SDK_INT >= 31) {
            Typeface typeface = this.f56053z;
            if (typeface != null) {
                this.f56052y = C4987h.b(configuration, typeface);
            }
            Typeface typeface2 = this.f55985C;
            if (typeface2 != null) {
                this.f55984B = C4987h.b(configuration, typeface2);
            }
            Typeface typeface3 = this.f56052y;
            if (typeface3 == null) {
                typeface3 = this.f56053z;
            }
            this.f56051x = typeface3;
            Typeface typeface4 = this.f55984B;
            if (typeface4 == null) {
                typeface4 = this.f55985C;
            }
            this.f55983A = typeface4;
            L(true);
        }
    }

    /* access modifiers changed from: package-private */
    public void J() {
        boolean z10;
        if (this.f56025i.width() <= 0 || this.f56025i.height() <= 0 || this.f56023h.width() <= 0 || this.f56023h.height() <= 0) {
            z10 = false;
        } else {
            z10 = true;
        }
        this.f56011b = z10;
    }

    public void K() {
        L(false);
    }

    public void L(boolean z10) {
        if ((this.f56009a.getHeight() > 0 && this.f56009a.getWidth() > 0) || z10) {
            b(z10);
            c();
        }
    }

    public void N(int i10, int i11, int i12, int i13) {
        if (!M(this.f56025i, i10, i11, i12, i13)) {
            this.f56025i.set(i10, i11, i12, i13);
            this.f56003U = true;
            J();
        }
    }

    public void O(Rect rect) {
        N(rect.left, rect.top, rect.right, rect.bottom);
    }

    public void P(int i10) {
        C4983d dVar = new C4983d(this.f56009a.getContext(), i10);
        if (dVar.i() != null) {
            this.f56039p = dVar.i();
        }
        if (dVar.j() != 0.0f) {
            this.f56035n = dVar.j();
        }
        ColorStateList colorStateList = dVar.f60504c;
        if (colorStateList != null) {
            this.f56014c0 = colorStateList;
        }
        this.f56010a0 = dVar.f60509h;
        this.f56012b0 = dVar.f60510i;
        this.f56008Z = dVar.f60511j;
        this.f56024h0 = dVar.f60513l;
        C4980a aVar = this.f55988F;
        if (aVar != null) {
            aVar.c();
        }
        this.f55988F = new C4980a(new a(), dVar.e());
        dVar.h(this.f56009a.getContext(), this.f55988F);
        K();
    }

    public void R(ColorStateList colorStateList) {
        if (this.f56039p != colorStateList) {
            this.f56039p = colorStateList;
            K();
        }
    }

    public void S(int i10) {
        if (this.f56031l != i10) {
            this.f56031l = i10;
            K();
        }
    }

    public void T(Typeface typeface) {
        if (U(typeface)) {
            K();
        }
    }

    public void V(int i10, int i11, int i12, int i13) {
        if (!M(this.f56023h, i10, i11, i12, i13)) {
            this.f56023h.set(i10, i11, i12, i13);
            this.f56003U = true;
            J();
        }
    }

    public void W(Rect rect) {
        V(rect.left, rect.top, rect.right, rect.bottom);
    }

    public void X(float f10) {
        if (this.f56026i0 != f10) {
            this.f56026i0 = f10;
            K();
        }
    }

    public void Z(ColorStateList colorStateList) {
        if (this.f56037o != colorStateList) {
            this.f56037o = colorStateList;
            K();
        }
    }

    public void a0(int i10) {
        if (this.f56029k != i10) {
            this.f56029k = i10;
            K();
        }
    }

    public void b0(float f10) {
        if (this.f56033m != f10) {
            this.f56033m = f10;
            K();
        }
    }

    public void d0(float f10) {
        float a10 = C2589a.a(f10, 0.0f, 1.0f);
        if (a10 != this.f56013c) {
            this.f56013c = a10;
            c();
        }
    }

    public void f0(TimeInterpolator timeInterpolator) {
        this.f56006X = timeInterpolator;
        K();
    }

    public final boolean g0(int[] iArr) {
        this.f56002T = iArr;
        if (!E()) {
            return false;
        }
        K();
        return true;
    }

    public void h0(CharSequence charSequence) {
        if (charSequence == null || !TextUtils.equals(this.f55989G, charSequence)) {
            this.f55989G = charSequence;
            this.f55990H = null;
            j();
            K();
        }
    }

    public void i0(TimeInterpolator timeInterpolator) {
        this.f56007Y = timeInterpolator;
        K();
    }

    public void j0(Typeface typeface) {
        boolean U10 = U(typeface);
        boolean c02 = c0(typeface);
        if (U10 || c02) {
            K();
        }
    }

    public void l(Canvas canvas) {
        boolean z10;
        int save = canvas.save();
        if (this.f55990H != null && this.f56011b) {
            this.f56004V.setTextSize(this.f55997O);
            float f10 = this.f56049v;
            float f11 = this.f56050w;
            if (!this.f55993K || this.f55994L == null) {
                z10 = false;
            } else {
                z10 = true;
            }
            float f12 = this.f55996N;
            if (f12 != 1.0f && !this.f56015d) {
                canvas.scale(f12, f12, f10, f11);
            }
            if (z10) {
                canvas.drawBitmap(this.f55994L, f10, f11, this.f55995M);
                canvas.restoreToCount(save);
                return;
            }
            if (!k0() || (this.f56015d && this.f56013c <= this.f56019f)) {
                canvas.translate(f10, f11);
                this.f56030k0.draw(canvas);
            } else {
                m(canvas, this.f56049v - ((float) this.f56030k0.getLineStart(0)), f11);
            }
            canvas.restoreToCount(save);
        }
    }

    public void o(RectF rectF, int i10, int i11) {
        this.f55991I = f(this.f55989G);
        rectF.left = r(i10, i11);
        rectF.top = (float) this.f56025i.top;
        rectF.right = s(rectF, i10, i11);
        rectF.bottom = ((float) this.f56025i.top) + q();
    }

    public ColorStateList p() {
        return this.f56039p;
    }

    public float q() {
        z(this.f56005W);
        return -this.f56005W.ascent();
    }

    public int t() {
        return u(this.f56039p);
    }

    public float w() {
        A(this.f56005W);
        return -this.f56005W.ascent();
    }

    public float x() {
        return this.f56013c;
    }
}
