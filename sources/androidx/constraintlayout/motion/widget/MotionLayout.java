package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import android.view.Display;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import androidx.constraintlayout.motion.widget.o;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.G;
import com.revenuecat.purchases.common.Constants;
import i1.C2059a;
import i1.C2063e;
import i1.C2064f;
import i1.C2065g;
import i1.C2066h;
import i1.C2067i;
import i1.C2068j;
import i1.C2070l;
import i1.C2071m;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import k1.C2141b;

public class MotionLayout extends ConstraintLayout implements G {

    /* renamed from: w1  reason: collision with root package name */
    public static boolean f14373w1;

    /* renamed from: A  reason: collision with root package name */
    Interpolator f14374A;

    /* renamed from: A0  reason: collision with root package name */
    int f14375A0;

    /* renamed from: B  reason: collision with root package name */
    Interpolator f14376B = null;

    /* renamed from: B0  reason: collision with root package name */
    int f14377B0;

    /* renamed from: C  reason: collision with root package name */
    float f14378C = 0.0f;

    /* renamed from: C0  reason: collision with root package name */
    int f14379C0;
    /* access modifiers changed from: private */

    /* renamed from: D  reason: collision with root package name */
    public int f14380D = -1;

    /* renamed from: D0  reason: collision with root package name */
    boolean f14381D0 = false;

    /* renamed from: E  reason: collision with root package name */
    int f14382E = -1;

    /* renamed from: E0  reason: collision with root package name */
    float f14383E0;
    /* access modifiers changed from: private */

    /* renamed from: F  reason: collision with root package name */
    public int f14384F = -1;

    /* renamed from: F0  reason: collision with root package name */
    float f14385F0;
    /* access modifiers changed from: private */

    /* renamed from: G  reason: collision with root package name */
    public int f14386G = 0;

    /* renamed from: G0  reason: collision with root package name */
    long f14387G0;
    /* access modifiers changed from: private */

    /* renamed from: H  reason: collision with root package name */
    public int f14388H = 0;

    /* renamed from: H0  reason: collision with root package name */
    float f14389H0;

    /* renamed from: I  reason: collision with root package name */
    private boolean f14390I = true;

    /* renamed from: I0  reason: collision with root package name */
    private boolean f14391I0 = false;

    /* renamed from: J0  reason: collision with root package name */
    private ArrayList f14392J0 = null;

    /* renamed from: K0  reason: collision with root package name */
    private ArrayList f14393K0 = null;

    /* renamed from: L0  reason: collision with root package name */
    private ArrayList f14394L0 = null;

    /* renamed from: M0  reason: collision with root package name */
    private CopyOnWriteArrayList f14395M0 = null;

    /* renamed from: N0  reason: collision with root package name */
    private int f14396N0 = 0;

    /* renamed from: O0  reason: collision with root package name */
    private long f14397O0 = -1;

    /* renamed from: P0  reason: collision with root package name */
    private float f14398P0 = 0.0f;

    /* renamed from: Q0  reason: collision with root package name */
    private int f14399Q0 = 0;

    /* renamed from: R0  reason: collision with root package name */
    private float f14400R0 = 0.0f;

    /* renamed from: S0  reason: collision with root package name */
    boolean f14401S0 = false;

    /* renamed from: T0  reason: collision with root package name */
    protected boolean f14402T0 = false;

    /* renamed from: U0  reason: collision with root package name */
    int f14403U0;

    /* renamed from: V0  reason: collision with root package name */
    int f14404V0;

    /* renamed from: W0  reason: collision with root package name */
    int f14405W0;

    /* renamed from: X0  reason: collision with root package name */
    int f14406X0;

    /* renamed from: Y0  reason: collision with root package name */
    int f14407Y0;

    /* renamed from: Z0  reason: collision with root package name */
    int f14408Z0;

    /* renamed from: a1  reason: collision with root package name */
    float f14409a1;

    /* renamed from: b1  reason: collision with root package name */
    private g1.d f14410b1 = new g1.d();

    /* renamed from: c1  reason: collision with root package name */
    private boolean f14411c1 = false;
    /* access modifiers changed from: private */

    /* renamed from: d1  reason: collision with root package name */
    public h f14412d1;

    /* renamed from: e1  reason: collision with root package name */
    private Runnable f14413e1 = null;

    /* renamed from: f0  reason: collision with root package name */
    HashMap f14414f0 = new HashMap();

    /* renamed from: f1  reason: collision with root package name */
    private int[] f14415f1 = null;

    /* renamed from: g0  reason: collision with root package name */
    private long f14416g0 = 0;

    /* renamed from: g1  reason: collision with root package name */
    int f14417g1 = 0;

    /* renamed from: h0  reason: collision with root package name */
    private float f14418h0 = 1.0f;
    /* access modifiers changed from: private */

    /* renamed from: h1  reason: collision with root package name */
    public boolean f14419h1 = false;

    /* renamed from: i0  reason: collision with root package name */
    float f14420i0 = 0.0f;

    /* renamed from: i1  reason: collision with root package name */
    int f14421i1 = 0;

    /* renamed from: j0  reason: collision with root package name */
    float f14422j0 = 0.0f;

    /* renamed from: j1  reason: collision with root package name */
    HashMap f14423j1 = new HashMap();

    /* renamed from: k0  reason: collision with root package name */
    private long f14424k0;
    /* access modifiers changed from: private */

    /* renamed from: k1  reason: collision with root package name */
    public int f14425k1;

    /* renamed from: l0  reason: collision with root package name */
    float f14426l0 = 0.0f;
    /* access modifiers changed from: private */

    /* renamed from: l1  reason: collision with root package name */
    public int f14427l1;

    /* renamed from: m0  reason: collision with root package name */
    private boolean f14428m0;

    /* renamed from: m1  reason: collision with root package name */
    private int f14429m1;

    /* renamed from: n0  reason: collision with root package name */
    boolean f14430n0 = false;

    /* renamed from: n1  reason: collision with root package name */
    Rect f14431n1 = new Rect();

    /* renamed from: o0  reason: collision with root package name */
    boolean f14432o0 = false;

    /* renamed from: o1  reason: collision with root package name */
    private boolean f14433o1 = false;

    /* renamed from: p0  reason: collision with root package name */
    private i f14434p0;

    /* renamed from: p1  reason: collision with root package name */
    j f14435p1 = j.UNDEFINED;

    /* renamed from: q0  reason: collision with root package name */
    private float f14436q0;

    /* renamed from: q1  reason: collision with root package name */
    e f14437q1 = new e();

    /* renamed from: r0  reason: collision with root package name */
    private float f14438r0;

    /* renamed from: r1  reason: collision with root package name */
    private boolean f14439r1 = false;

    /* renamed from: s0  reason: collision with root package name */
    int f14440s0 = 0;

    /* renamed from: s1  reason: collision with root package name */
    private RectF f14441s1 = new RectF();

    /* renamed from: t0  reason: collision with root package name */
    d f14442t0;

    /* renamed from: t1  reason: collision with root package name */
    private View f14443t1 = null;

    /* renamed from: u0  reason: collision with root package name */
    private boolean f14444u0 = false;

    /* renamed from: u1  reason: collision with root package name */
    private Matrix f14445u1 = null;

    /* renamed from: v0  reason: collision with root package name */
    private C2141b f14446v0 = new C2141b();

    /* renamed from: v1  reason: collision with root package name */
    ArrayList f14447v1 = new ArrayList();

    /* renamed from: w0  reason: collision with root package name */
    private c f14448w0 = new c();

    /* renamed from: x0  reason: collision with root package name */
    private b f14449x0;

    /* renamed from: y0  reason: collision with root package name */
    boolean f14450y0 = true;

    /* renamed from: z  reason: collision with root package name */
    o f14451z;

    /* renamed from: z0  reason: collision with root package name */
    int f14452z0;

    class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ View f14453a;

        a(View view) {
            this.f14453a = view;
        }

        public void run() {
            this.f14453a.setNestedScrollingEnabled(true);
        }
    }

    class b implements Runnable {
        b() {
        }

        public void run() {
            MotionLayout.this.f14412d1.a();
        }
    }

    class c extends m {

        /* renamed from: a  reason: collision with root package name */
        float f14456a = 0.0f;

        /* renamed from: b  reason: collision with root package name */
        float f14457b = 0.0f;

        /* renamed from: c  reason: collision with root package name */
        float f14458c;

        c() {
        }

        public float a() {
            return MotionLayout.this.f14378C;
        }

        public void b(float f10, float f11, float f12) {
            this.f14456a = f10;
            this.f14457b = f11;
            this.f14458c = f12;
        }

        public float getInterpolation(float f10) {
            float f11;
            float f12;
            float f13 = this.f14456a;
            if (f13 > 0.0f) {
                float f14 = this.f14458c;
                if (f13 / f14 < f10) {
                    f10 = f13 / f14;
                }
                MotionLayout.this.f14378C = f13 - (f14 * f10);
                f11 = (f13 * f10) - (((f14 * f10) * f10) / 2.0f);
                f12 = this.f14457b;
            } else {
                float f15 = this.f14458c;
                if ((-f13) / f15 < f10) {
                    f10 = (-f13) / f15;
                }
                MotionLayout.this.f14378C = (f15 * f10) + f13;
                f11 = (f13 * f10) + (((f15 * f10) * f10) / 2.0f);
                f12 = this.f14457b;
            }
            return f11 + f12;
        }
    }

    private class d {

        /* renamed from: a  reason: collision with root package name */
        float[] f14460a;

        /* renamed from: b  reason: collision with root package name */
        int[] f14461b;

        /* renamed from: c  reason: collision with root package name */
        float[] f14462c;

        /* renamed from: d  reason: collision with root package name */
        Path f14463d;

        /* renamed from: e  reason: collision with root package name */
        Paint f14464e;

        /* renamed from: f  reason: collision with root package name */
        Paint f14465f;

        /* renamed from: g  reason: collision with root package name */
        Paint f14466g;

        /* renamed from: h  reason: collision with root package name */
        Paint f14467h;

        /* renamed from: i  reason: collision with root package name */
        Paint f14468i;

        /* renamed from: j  reason: collision with root package name */
        private float[] f14469j;

        /* renamed from: k  reason: collision with root package name */
        final int f14470k = -21965;

        /* renamed from: l  reason: collision with root package name */
        final int f14471l = -2067046;

        /* renamed from: m  reason: collision with root package name */
        final int f14472m = -13391360;

        /* renamed from: n  reason: collision with root package name */
        final int f14473n = 1996488704;

        /* renamed from: o  reason: collision with root package name */
        final int f14474o = 10;

        /* renamed from: p  reason: collision with root package name */
        DashPathEffect f14475p;

        /* renamed from: q  reason: collision with root package name */
        int f14476q;

        /* renamed from: r  reason: collision with root package name */
        Rect f14477r = new Rect();

        /* renamed from: s  reason: collision with root package name */
        boolean f14478s = false;

        /* renamed from: t  reason: collision with root package name */
        int f14479t = 1;

        d() {
            Paint paint = new Paint();
            this.f14464e = paint;
            paint.setAntiAlias(true);
            this.f14464e.setColor(-21965);
            this.f14464e.setStrokeWidth(2.0f);
            Paint paint2 = this.f14464e;
            Paint.Style style = Paint.Style.STROKE;
            paint2.setStyle(style);
            Paint paint3 = new Paint();
            this.f14465f = paint3;
            paint3.setAntiAlias(true);
            this.f14465f.setColor(-2067046);
            this.f14465f.setStrokeWidth(2.0f);
            this.f14465f.setStyle(style);
            Paint paint4 = new Paint();
            this.f14466g = paint4;
            paint4.setAntiAlias(true);
            this.f14466g.setColor(-13391360);
            this.f14466g.setStrokeWidth(2.0f);
            this.f14466g.setStyle(style);
            Paint paint5 = new Paint();
            this.f14467h = paint5;
            paint5.setAntiAlias(true);
            this.f14467h.setColor(-13391360);
            this.f14467h.setTextSize(MotionLayout.this.getContext().getResources().getDisplayMetrics().density * 12.0f);
            this.f14469j = new float[8];
            Paint paint6 = new Paint();
            this.f14468i = paint6;
            paint6.setAntiAlias(true);
            DashPathEffect dashPathEffect = new DashPathEffect(new float[]{4.0f, 8.0f}, 0.0f);
            this.f14475p = dashPathEffect;
            this.f14466g.setPathEffect(dashPathEffect);
            this.f14462c = new float[100];
            this.f14461b = new int[50];
            if (this.f14478s) {
                this.f14464e.setStrokeWidth(8.0f);
                this.f14468i.setStrokeWidth(8.0f);
                this.f14465f.setStrokeWidth(8.0f);
                this.f14479t = 4;
            }
        }

        private void c(Canvas canvas) {
            canvas.drawLines(this.f14460a, this.f14464e);
        }

        private void d(Canvas canvas) {
            boolean z10 = false;
            boolean z11 = false;
            for (int i10 = 0; i10 < this.f14476q; i10++) {
                int i11 = this.f14461b[i10];
                if (i11 == 1) {
                    z10 = true;
                }
                if (i11 == 0) {
                    z11 = true;
                }
            }
            if (z10) {
                g(canvas);
            }
            if (z11) {
                e(canvas);
            }
        }

        private void e(Canvas canvas) {
            float[] fArr = this.f14460a;
            float f10 = fArr[0];
            float f11 = fArr[1];
            float f12 = fArr[fArr.length - 2];
            float f13 = fArr[fArr.length - 1];
            canvas.drawLine(Math.min(f10, f12), Math.max(f11, f13), Math.max(f10, f12), Math.max(f11, f13), this.f14466g);
            canvas.drawLine(Math.min(f10, f12), Math.min(f11, f13), Math.min(f10, f12), Math.max(f11, f13), this.f14466g);
        }

        private void f(Canvas canvas, float f10, float f11) {
            Canvas canvas2 = canvas;
            float[] fArr = this.f14460a;
            float f12 = fArr[0];
            float f13 = fArr[1];
            float f14 = fArr[fArr.length - 2];
            float f15 = fArr[fArr.length - 1];
            float min = Math.min(f12, f14);
            float max = Math.max(f13, f15);
            float min2 = f10 - Math.min(f12, f14);
            float max2 = Math.max(f13, f15) - f11;
            String str = "" + (((float) ((int) (((double) ((min2 * 100.0f) / Math.abs(f14 - f12))) + 0.5d))) / 100.0f);
            l(str, this.f14467h);
            canvas2.drawText(str, ((min2 / 2.0f) - ((float) (this.f14477r.width() / 2))) + min, f11 - 20.0f, this.f14467h);
            canvas.drawLine(f10, f11, Math.min(f12, f14), f11, this.f14466g);
            String str2 = "" + (((float) ((int) (((double) ((max2 * 100.0f) / Math.abs(f15 - f13))) + 0.5d))) / 100.0f);
            l(str2, this.f14467h);
            canvas2.drawText(str2, f10 + 5.0f, max - ((max2 / 2.0f) - ((float) (this.f14477r.height() / 2))), this.f14467h);
            canvas.drawLine(f10, f11, f10, Math.max(f13, f15), this.f14466g);
        }

        private void g(Canvas canvas) {
            float[] fArr = this.f14460a;
            canvas.drawLine(fArr[0], fArr[1], fArr[fArr.length - 2], fArr[fArr.length - 1], this.f14466g);
        }

        private void h(Canvas canvas, float f10, float f11) {
            float[] fArr = this.f14460a;
            float f12 = fArr[0];
            float f13 = fArr[1];
            float f14 = fArr[fArr.length - 2];
            float f15 = fArr[fArr.length - 1];
            float hypot = (float) Math.hypot((double) (f12 - f14), (double) (f13 - f15));
            float f16 = f14 - f12;
            float f17 = f15 - f13;
            float f18 = (((f10 - f12) * f16) + ((f11 - f13) * f17)) / (hypot * hypot);
            float f19 = f12 + (f16 * f18);
            float f20 = f13 + (f18 * f17);
            Path path = new Path();
            path.moveTo(f10, f11);
            path.lineTo(f19, f20);
            float hypot2 = (float) Math.hypot((double) (f19 - f10), (double) (f20 - f11));
            String str = "" + (((float) ((int) ((hypot2 * 100.0f) / hypot))) / 100.0f);
            l(str, this.f14467h);
            canvas.drawTextOnPath(str, path, (hypot2 / 2.0f) - ((float) (this.f14477r.width() / 2)), -20.0f, this.f14467h);
            canvas.drawLine(f10, f11, f19, f20, this.f14466g);
        }

        private void i(Canvas canvas, float f10, float f11, int i10, int i11) {
            Canvas canvas2 = canvas;
            String str = "" + (((float) ((int) (((double) (((f10 - ((float) (i10 / 2))) * 100.0f) / ((float) (MotionLayout.this.getWidth() - i10)))) + 0.5d))) / 100.0f);
            l(str, this.f14467h);
            canvas2.drawText(str, ((f10 / 2.0f) - ((float) (this.f14477r.width() / 2))) + 0.0f, f11 - 20.0f, this.f14467h);
            canvas.drawLine(f10, f11, Math.min(0.0f, 1.0f), f11, this.f14466g);
            String str2 = "" + (((float) ((int) (((double) (((f11 - ((float) (i11 / 2))) * 100.0f) / ((float) (MotionLayout.this.getHeight() - i11)))) + 0.5d))) / 100.0f);
            l(str2, this.f14467h);
            canvas2.drawText(str2, f10 + 5.0f, 0.0f - ((f11 / 2.0f) - ((float) (this.f14477r.height() / 2))), this.f14467h);
            canvas.drawLine(f10, f11, f10, Math.max(0.0f, 1.0f), this.f14466g);
        }

        private void j(Canvas canvas, l lVar) {
            this.f14463d.reset();
            for (int i10 = 0; i10 <= 50; i10++) {
                lVar.e(((float) i10) / ((float) 50), this.f14469j, 0);
                Path path = this.f14463d;
                float[] fArr = this.f14469j;
                path.moveTo(fArr[0], fArr[1]);
                Path path2 = this.f14463d;
                float[] fArr2 = this.f14469j;
                path2.lineTo(fArr2[2], fArr2[3]);
                Path path3 = this.f14463d;
                float[] fArr3 = this.f14469j;
                path3.lineTo(fArr3[4], fArr3[5]);
                Path path4 = this.f14463d;
                float[] fArr4 = this.f14469j;
                path4.lineTo(fArr4[6], fArr4[7]);
                this.f14463d.close();
            }
            this.f14464e.setColor(1140850688);
            canvas.translate(2.0f, 2.0f);
            canvas.drawPath(this.f14463d, this.f14464e);
            canvas.translate(-2.0f, -2.0f);
            this.f14464e.setColor(-65536);
            canvas.drawPath(this.f14463d, this.f14464e);
        }

        private void k(Canvas canvas, int i10, int i11, l lVar) {
            int i12;
            int i13;
            float f10;
            float f11;
            Canvas canvas2 = canvas;
            int i14 = i10;
            l lVar2 = lVar;
            View view = lVar2.f14656b;
            if (view != null) {
                i13 = view.getWidth();
                i12 = lVar2.f14656b.getHeight();
            } else {
                i13 = 0;
                i12 = 0;
            }
            for (int i15 = 1; i15 < i11 - 1; i15++) {
                if (i14 != 4 || this.f14461b[i15 - 1] != 0) {
                    float[] fArr = this.f14462c;
                    int i16 = i15 * 2;
                    float f12 = fArr[i16];
                    float f13 = fArr[i16 + 1];
                    this.f14463d.reset();
                    this.f14463d.moveTo(f12, f13 + 10.0f);
                    this.f14463d.lineTo(f12 + 10.0f, f13);
                    this.f14463d.lineTo(f12, f13 - 10.0f);
                    this.f14463d.lineTo(f12 - 10.0f, f13);
                    this.f14463d.close();
                    int i17 = i15 - 1;
                    lVar2.q(i17);
                    if (i14 == 4) {
                        int i18 = this.f14461b[i17];
                        if (i18 == 1) {
                            h(canvas2, f12 - 0.0f, f13 - 0.0f);
                        } else if (i18 == 0) {
                            f(canvas2, f12 - 0.0f, f13 - 0.0f);
                        } else if (i18 == 2) {
                            f11 = f13;
                            f10 = f12;
                            i(canvas, f12 - 0.0f, f13 - 0.0f, i13, i12);
                            canvas2.drawPath(this.f14463d, this.f14468i);
                        }
                        f11 = f13;
                        f10 = f12;
                        canvas2.drawPath(this.f14463d, this.f14468i);
                    } else {
                        f11 = f13;
                        f10 = f12;
                    }
                    if (i14 == 2) {
                        h(canvas2, f10 - 0.0f, f11 - 0.0f);
                    }
                    if (i14 == 3) {
                        f(canvas2, f10 - 0.0f, f11 - 0.0f);
                    }
                    if (i14 == 6) {
                        i(canvas, f10 - 0.0f, f11 - 0.0f, i13, i12);
                    }
                    canvas2.drawPath(this.f14463d, this.f14468i);
                }
            }
            float[] fArr2 = this.f14460a;
            if (fArr2.length > 1) {
                canvas2.drawCircle(fArr2[0], fArr2[1], 8.0f, this.f14465f);
                float[] fArr3 = this.f14460a;
                canvas2.drawCircle(fArr3[fArr3.length - 2], fArr3[fArr3.length - 1], 8.0f, this.f14465f);
            }
        }

        public void a(Canvas canvas, HashMap hashMap, int i10, int i11) {
            if (hashMap != null && hashMap.size() != 0) {
                canvas.save();
                if (!MotionLayout.this.isInEditMode() && (i11 & 1) == 2) {
                    String str = MotionLayout.this.getContext().getResources().getResourceName(MotionLayout.this.f14384F) + Constants.SUBS_ID_BASE_PLAN_ID_SEPARATOR + MotionLayout.this.getProgress();
                    canvas.drawText(str, 10.0f, (float) (MotionLayout.this.getHeight() - 30), this.f14467h);
                    canvas.drawText(str, 11.0f, (float) (MotionLayout.this.getHeight() - 29), this.f14464e);
                }
                for (l lVar : hashMap.values()) {
                    int m10 = lVar.m();
                    if (i11 > 0 && m10 == 0) {
                        m10 = 1;
                    }
                    if (m10 != 0) {
                        this.f14476q = lVar.c(this.f14462c, this.f14461b);
                        if (m10 >= 1) {
                            int i12 = i10 / 16;
                            float[] fArr = this.f14460a;
                            if (fArr == null || fArr.length != i12 * 2) {
                                this.f14460a = new float[(i12 * 2)];
                                this.f14463d = new Path();
                            }
                            int i13 = this.f14479t;
                            canvas.translate((float) i13, (float) i13);
                            this.f14464e.setColor(1996488704);
                            this.f14468i.setColor(1996488704);
                            this.f14465f.setColor(1996488704);
                            this.f14466g.setColor(1996488704);
                            lVar.d(this.f14460a, i12);
                            b(canvas, m10, this.f14476q, lVar);
                            this.f14464e.setColor(-21965);
                            this.f14465f.setColor(-2067046);
                            this.f14468i.setColor(-2067046);
                            this.f14466g.setColor(-13391360);
                            int i14 = this.f14479t;
                            canvas.translate((float) (-i14), (float) (-i14));
                            b(canvas, m10, this.f14476q, lVar);
                            if (m10 == 5) {
                                j(canvas, lVar);
                            }
                        }
                    }
                }
                canvas.restore();
            }
        }

        public void b(Canvas canvas, int i10, int i11, l lVar) {
            if (i10 == 4) {
                d(canvas);
            }
            if (i10 == 2) {
                g(canvas);
            }
            if (i10 == 3) {
                e(canvas);
            }
            c(canvas);
            k(canvas, i10, i11, lVar);
        }

        /* access modifiers changed from: package-private */
        public void l(String str, Paint paint) {
            paint.getTextBounds(str, 0, str.length(), this.f14477r);
        }
    }

    class e {

        /* renamed from: a  reason: collision with root package name */
        C2064f f14481a = new C2064f();

        /* renamed from: b  reason: collision with root package name */
        C2064f f14482b = new C2064f();

        /* renamed from: c  reason: collision with root package name */
        androidx.constraintlayout.widget.d f14483c = null;

        /* renamed from: d  reason: collision with root package name */
        androidx.constraintlayout.widget.d f14484d = null;

        /* renamed from: e  reason: collision with root package name */
        int f14485e;

        /* renamed from: f  reason: collision with root package name */
        int f14486f;

        e() {
        }

        private void b(int i10, int i11) {
            int i12;
            int i13;
            int i14;
            int i15;
            int i16;
            int i17;
            int optimizationLevel = MotionLayout.this.getOptimizationLevel();
            MotionLayout motionLayout = MotionLayout.this;
            if (motionLayout.f14382E == motionLayout.getStartState()) {
                MotionLayout motionLayout2 = MotionLayout.this;
                C2064f fVar = this.f14482b;
                androidx.constraintlayout.widget.d dVar = this.f14484d;
                if (dVar == null || dVar.f14996e == 0) {
                    i15 = i10;
                } else {
                    i15 = i11;
                }
                if (dVar == null || dVar.f14996e == 0) {
                    i16 = i11;
                } else {
                    i16 = i10;
                }
                motionLayout2.x(fVar, optimizationLevel, i15, i16);
                androidx.constraintlayout.widget.d dVar2 = this.f14483c;
                if (dVar2 != null) {
                    MotionLayout motionLayout3 = MotionLayout.this;
                    C2064f fVar2 = this.f14481a;
                    int i18 = dVar2.f14996e;
                    if (i18 == 0) {
                        i17 = i10;
                    } else {
                        i17 = i11;
                    }
                    if (i18 == 0) {
                        i10 = i11;
                    }
                    motionLayout3.x(fVar2, optimizationLevel, i17, i10);
                    return;
                }
                return;
            }
            androidx.constraintlayout.widget.d dVar3 = this.f14483c;
            if (dVar3 != null) {
                MotionLayout motionLayout4 = MotionLayout.this;
                C2064f fVar3 = this.f14481a;
                int i19 = dVar3.f14996e;
                if (i19 == 0) {
                    i13 = i10;
                } else {
                    i13 = i11;
                }
                if (i19 == 0) {
                    i14 = i11;
                } else {
                    i14 = i10;
                }
                motionLayout4.x(fVar3, optimizationLevel, i13, i14);
            }
            MotionLayout motionLayout5 = MotionLayout.this;
            C2064f fVar4 = this.f14482b;
            androidx.constraintlayout.widget.d dVar4 = this.f14484d;
            if (dVar4 == null || dVar4.f14996e == 0) {
                i12 = i10;
            } else {
                i12 = i11;
            }
            if (dVar4 == null || dVar4.f14996e == 0) {
                i10 = i11;
            }
            motionLayout5.x(fVar4, optimizationLevel, i12, i10);
        }

        private void j(C2064f fVar, androidx.constraintlayout.widget.d dVar) {
            SparseArray sparseArray = new SparseArray();
            androidx.constraintlayout.widget.e eVar = new androidx.constraintlayout.widget.e(-2, -2);
            sparseArray.clear();
            sparseArray.put(0, fVar);
            sparseArray.put(MotionLayout.this.getId(), fVar);
            if (!(dVar == null || dVar.f14996e == 0)) {
                MotionLayout motionLayout = MotionLayout.this;
                motionLayout.x(this.f14482b, motionLayout.getOptimizationLevel(), View.MeasureSpec.makeMeasureSpec(MotionLayout.this.getHeight(), 1073741824), View.MeasureSpec.makeMeasureSpec(MotionLayout.this.getWidth(), 1073741824));
            }
            Iterator it = fVar.w1().iterator();
            while (it.hasNext()) {
                C2063e eVar2 = (C2063e) it.next();
                eVar2.E0(true);
                sparseArray.put(((View) eVar2.u()).getId(), eVar2);
            }
            Iterator it2 = fVar.w1().iterator();
            while (it2.hasNext()) {
                C2063e eVar3 = (C2063e) it2.next();
                View view = (View) eVar3.u();
                dVar.l(view.getId(), eVar);
                eVar3.p1(dVar.B(view.getId()));
                eVar3.Q0(dVar.w(view.getId()));
                if (view instanceof androidx.constraintlayout.widget.b) {
                    dVar.j((androidx.constraintlayout.widget.b) view, eVar3, eVar, sparseArray);
                    if (view instanceof Barrier) {
                        ((Barrier) view).r();
                    }
                }
                eVar.resolveLayoutDirection(MotionLayout.this.getLayoutDirection());
                MotionLayout.this.d(false, view, eVar3, eVar, sparseArray);
                if (dVar.A(view.getId()) == 1) {
                    eVar3.o1(view.getVisibility());
                } else {
                    eVar3.o1(dVar.z(view.getId()));
                }
            }
            Iterator it3 = fVar.w1().iterator();
            while (it3.hasNext()) {
                C2063e eVar4 = (C2063e) it3.next();
                if (eVar4 instanceof C2071m) {
                    C2067i iVar = (C2067i) eVar4;
                    ((androidx.constraintlayout.widget.b) eVar4.u()).q(fVar, iVar, sparseArray);
                    ((C2071m) iVar).y1();
                }
            }
        }

        /* JADX WARNING: Removed duplicated region for block: B:22:0x00e9  */
        /* JADX WARNING: Removed duplicated region for block: B:40:0x013d A[SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void a() {
            /*
                r18 = this;
                r0 = r18
                androidx.constraintlayout.motion.widget.MotionLayout r1 = androidx.constraintlayout.motion.widget.MotionLayout.this
                int r1 = r1.getChildCount()
                androidx.constraintlayout.motion.widget.MotionLayout r2 = androidx.constraintlayout.motion.widget.MotionLayout.this
                java.util.HashMap r2 = r2.f14414f0
                r2.clear()
                android.util.SparseArray r2 = new android.util.SparseArray
                r2.<init>()
                int[] r3 = new int[r1]
                r5 = 0
            L_0x0017:
                if (r5 >= r1) goto L_0x0037
                androidx.constraintlayout.motion.widget.MotionLayout r6 = androidx.constraintlayout.motion.widget.MotionLayout.this
                android.view.View r6 = r6.getChildAt(r5)
                androidx.constraintlayout.motion.widget.l r7 = new androidx.constraintlayout.motion.widget.l
                r7.<init>(r6)
                int r8 = r6.getId()
                r3[r5] = r8
                r2.put(r8, r7)
                androidx.constraintlayout.motion.widget.MotionLayout r8 = androidx.constraintlayout.motion.widget.MotionLayout.this
                java.util.HashMap r8 = r8.f14414f0
                r8.put(r6, r7)
                int r5 = r5 + 1
                goto L_0x0017
            L_0x0037:
                r5 = 0
            L_0x0038:
                if (r5 >= r1) goto L_0x0143
                androidx.constraintlayout.motion.widget.MotionLayout r6 = androidx.constraintlayout.motion.widget.MotionLayout.this
                android.view.View r6 = r6.getChildAt(r5)
                androidx.constraintlayout.motion.widget.MotionLayout r7 = androidx.constraintlayout.motion.widget.MotionLayout.this
                java.util.HashMap r7 = r7.f14414f0
                java.lang.Object r7 = r7.get(r6)
                r13 = r7
                androidx.constraintlayout.motion.widget.l r13 = (androidx.constraintlayout.motion.widget.l) r13
                if (r13 != 0) goto L_0x0051
                r16 = r2
                goto L_0x013d
            L_0x0051:
                androidx.constraintlayout.widget.d r7 = r0.f14483c
                java.lang.String r14 = ")"
                java.lang.String r15 = " ("
                java.lang.String r12 = "no widget for  "
                java.lang.String r11 = "MotionLayout"
                if (r7 == 0) goto L_0x00b6
                i1.f r7 = r0.f14481a
                i1.e r7 = r0.d(r7, r6)
                if (r7 == 0) goto L_0x007d
                androidx.constraintlayout.motion.widget.MotionLayout r8 = androidx.constraintlayout.motion.widget.MotionLayout.this
                android.graphics.Rect r7 = r8.D0(r7)
                androidx.constraintlayout.widget.d r8 = r0.f14483c
                androidx.constraintlayout.motion.widget.MotionLayout r9 = androidx.constraintlayout.motion.widget.MotionLayout.this
                int r9 = r9.getWidth()
                androidx.constraintlayout.motion.widget.MotionLayout r10 = androidx.constraintlayout.motion.widget.MotionLayout.this
                int r10 = r10.getHeight()
                r13.C(r7, r8, r9, r10)
                goto L_0x00b1
            L_0x007d:
                androidx.constraintlayout.motion.widget.MotionLayout r7 = androidx.constraintlayout.motion.widget.MotionLayout.this
                int r7 = r7.f14440s0
                if (r7 == 0) goto L_0x00b1
                java.lang.StringBuilder r7 = new java.lang.StringBuilder
                r7.<init>()
                java.lang.String r8 = androidx.constraintlayout.motion.widget.a.b()
                r7.append(r8)
                r7.append(r12)
                java.lang.String r8 = androidx.constraintlayout.motion.widget.a.d(r6)
                r7.append(r8)
                r7.append(r15)
                java.lang.Class r8 = r6.getClass()
                java.lang.String r8 = r8.getName()
                r7.append(r8)
                r7.append(r14)
                java.lang.String r7 = r7.toString()
                android.util.Log.e(r11, r7)
            L_0x00b1:
                r16 = r2
                r4 = r11
                r2 = r12
                goto L_0x00e5
            L_0x00b6:
                androidx.constraintlayout.motion.widget.MotionLayout r7 = androidx.constraintlayout.motion.widget.MotionLayout.this
                boolean r7 = r7.f14419h1
                if (r7 == 0) goto L_0x00b1
                androidx.constraintlayout.motion.widget.MotionLayout r7 = androidx.constraintlayout.motion.widget.MotionLayout.this
                java.util.HashMap r7 = r7.f14423j1
                java.lang.Object r7 = r7.get(r6)
                android.support.v4.media.session.c.a(r7)
                androidx.constraintlayout.motion.widget.MotionLayout r7 = androidx.constraintlayout.motion.widget.MotionLayout.this
                int r10 = r7.f14421i1
                int r16 = r7.f14425k1
                androidx.constraintlayout.motion.widget.MotionLayout r7 = androidx.constraintlayout.motion.widget.MotionLayout.this
                int r17 = r7.f14427l1
                r8 = 0
                r7 = r13
                r9 = r6
                r4 = r11
                r11 = r16
                r16 = r2
                r2 = r12
                r12 = r17
                r7.D(r8, r9, r10, r11, r12)
            L_0x00e5:
                androidx.constraintlayout.widget.d r7 = r0.f14484d
                if (r7 == 0) goto L_0x013d
                i1.f r7 = r0.f14482b
                i1.e r7 = r0.d(r7, r6)
                if (r7 == 0) goto L_0x0109
                androidx.constraintlayout.motion.widget.MotionLayout r2 = androidx.constraintlayout.motion.widget.MotionLayout.this
                android.graphics.Rect r2 = r2.D0(r7)
                androidx.constraintlayout.widget.d r4 = r0.f14484d
                androidx.constraintlayout.motion.widget.MotionLayout r6 = androidx.constraintlayout.motion.widget.MotionLayout.this
                int r6 = r6.getWidth()
                androidx.constraintlayout.motion.widget.MotionLayout r7 = androidx.constraintlayout.motion.widget.MotionLayout.this
                int r7 = r7.getHeight()
                r13.z(r2, r4, r6, r7)
                goto L_0x013d
            L_0x0109:
                androidx.constraintlayout.motion.widget.MotionLayout r7 = androidx.constraintlayout.motion.widget.MotionLayout.this
                int r7 = r7.f14440s0
                if (r7 == 0) goto L_0x013d
                java.lang.StringBuilder r7 = new java.lang.StringBuilder
                r7.<init>()
                java.lang.String r8 = androidx.constraintlayout.motion.widget.a.b()
                r7.append(r8)
                r7.append(r2)
                java.lang.String r2 = androidx.constraintlayout.motion.widget.a.d(r6)
                r7.append(r2)
                r7.append(r15)
                java.lang.Class r2 = r6.getClass()
                java.lang.String r2 = r2.getName()
                r7.append(r2)
                r7.append(r14)
                java.lang.String r2 = r7.toString()
                android.util.Log.e(r4, r2)
            L_0x013d:
                int r5 = r5 + 1
                r2 = r16
                goto L_0x0038
            L_0x0143:
                r16 = r2
                r4 = 0
            L_0x0146:
                if (r4 >= r1) goto L_0x0167
                r2 = r3[r4]
                r5 = r16
                java.lang.Object r2 = r5.get(r2)
                androidx.constraintlayout.motion.widget.l r2 = (androidx.constraintlayout.motion.widget.l) r2
                int r6 = r2.h()
                r7 = -1
                if (r6 == r7) goto L_0x0162
                java.lang.Object r6 = r5.get(r6)
                androidx.constraintlayout.motion.widget.l r6 = (androidx.constraintlayout.motion.widget.l) r6
                r2.G(r6)
            L_0x0162:
                int r4 = r4 + 1
                r16 = r5
                goto L_0x0146
            L_0x0167:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.motion.widget.MotionLayout.e.a():void");
        }

        /* access modifiers changed from: package-private */
        public void c(C2064f fVar, C2064f fVar2) {
            C2063e eVar;
            ArrayList w12 = fVar.w1();
            HashMap hashMap = new HashMap();
            hashMap.put(fVar, fVar2);
            fVar2.w1().clear();
            fVar2.n(fVar, hashMap);
            Iterator it = w12.iterator();
            while (it.hasNext()) {
                C2063e eVar2 = (C2063e) it.next();
                if (eVar2 instanceof C2059a) {
                    eVar = new C2059a();
                } else if (eVar2 instanceof C2066h) {
                    eVar = new C2066h();
                } else if (eVar2 instanceof C2065g) {
                    eVar = new C2065g();
                } else if (eVar2 instanceof C2070l) {
                    eVar = new C2070l();
                } else if (eVar2 instanceof C2067i) {
                    eVar = new C2068j();
                } else {
                    eVar = new C2063e();
                }
                fVar2.a(eVar);
                hashMap.put(eVar2, eVar);
            }
            Iterator it2 = w12.iterator();
            while (it2.hasNext()) {
                C2063e eVar3 = (C2063e) it2.next();
                ((C2063e) hashMap.get(eVar3)).n(eVar3, hashMap);
            }
        }

        /* access modifiers changed from: package-private */
        public C2063e d(C2064f fVar, View view) {
            if (fVar.u() == view) {
                return fVar;
            }
            ArrayList w12 = fVar.w1();
            int size = w12.size();
            for (int i10 = 0; i10 < size; i10++) {
                C2063e eVar = (C2063e) w12.get(i10);
                if (eVar.u() == view) {
                    return eVar;
                }
            }
            return null;
        }

        /* access modifiers changed from: package-private */
        public void e(C2064f fVar, androidx.constraintlayout.widget.d dVar, androidx.constraintlayout.widget.d dVar2) {
            this.f14483c = dVar;
            this.f14484d = dVar2;
            this.f14481a = new C2064f();
            this.f14482b = new C2064f();
            this.f14481a.b2(MotionLayout.this.f14839c.O1());
            this.f14482b.b2(MotionLayout.this.f14839c.O1());
            this.f14481a.z1();
            this.f14482b.z1();
            c(MotionLayout.this.f14839c, this.f14481a);
            c(MotionLayout.this.f14839c, this.f14482b);
            if (((double) MotionLayout.this.f14422j0) > 0.5d) {
                if (dVar != null) {
                    j(this.f14481a, dVar);
                }
                j(this.f14482b, dVar2);
            } else {
                j(this.f14482b, dVar2);
                if (dVar != null) {
                    j(this.f14481a, dVar);
                }
            }
            this.f14481a.e2(MotionLayout.this.t());
            this.f14481a.g2();
            this.f14482b.e2(MotionLayout.this.t());
            this.f14482b.g2();
            ViewGroup.LayoutParams layoutParams = MotionLayout.this.getLayoutParams();
            if (layoutParams != null) {
                if (layoutParams.width == -2) {
                    C2064f fVar2 = this.f14481a;
                    C2063e.b bVar = C2063e.b.WRAP_CONTENT;
                    fVar2.U0(bVar);
                    this.f14482b.U0(bVar);
                }
                if (layoutParams.height == -2) {
                    C2064f fVar3 = this.f14481a;
                    C2063e.b bVar2 = C2063e.b.WRAP_CONTENT;
                    fVar3.l1(bVar2);
                    this.f14482b.l1(bVar2);
                }
            }
        }

        public boolean f(int i10, int i11) {
            if (i10 == this.f14485e && i11 == this.f14486f) {
                return false;
            }
            return true;
        }

        public void g(int i10, int i11) {
            boolean z10;
            boolean z11;
            boolean z12;
            int mode = View.MeasureSpec.getMode(i10);
            int mode2 = View.MeasureSpec.getMode(i11);
            MotionLayout motionLayout = MotionLayout.this;
            motionLayout.f14407Y0 = mode;
            motionLayout.f14408Z0 = mode2;
            b(i10, i11);
            if (!((MotionLayout.this.getParent() instanceof MotionLayout) && mode == 1073741824 && mode2 == 1073741824)) {
                b(i10, i11);
                MotionLayout.this.f14403U0 = this.f14481a.Y();
                MotionLayout.this.f14404V0 = this.f14481a.z();
                MotionLayout.this.f14405W0 = this.f14482b.Y();
                MotionLayout.this.f14406X0 = this.f14482b.z();
                MotionLayout motionLayout2 = MotionLayout.this;
                if (motionLayout2.f14403U0 == motionLayout2.f14405W0 && motionLayout2.f14404V0 == motionLayout2.f14406X0) {
                    z12 = false;
                } else {
                    z12 = true;
                }
                motionLayout2.f14402T0 = z12;
            }
            MotionLayout motionLayout3 = MotionLayout.this;
            int i12 = motionLayout3.f14403U0;
            int i13 = motionLayout3.f14404V0;
            int i14 = motionLayout3.f14407Y0;
            if (i14 == Integer.MIN_VALUE || i14 == 0) {
                i12 = (int) (((float) i12) + (motionLayout3.f14409a1 * ((float) (motionLayout3.f14405W0 - i12))));
            }
            int i15 = i12;
            int i16 = motionLayout3.f14408Z0;
            if (i16 == Integer.MIN_VALUE || i16 == 0) {
                i13 = (int) (((float) i13) + (motionLayout3.f14409a1 * ((float) (motionLayout3.f14406X0 - i13))));
            }
            int i17 = i13;
            if (this.f14481a.W1() || this.f14482b.W1()) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (this.f14481a.U1() || this.f14482b.U1()) {
                z11 = true;
            } else {
                z11 = false;
            }
            MotionLayout.this.w(i10, i11, i15, i17, z10, z11);
        }

        public void h() {
            g(MotionLayout.this.f14386G, MotionLayout.this.f14388H);
            MotionLayout.this.C0();
        }

        public void i(int i10, int i11) {
            this.f14485e = i10;
            this.f14486f = i11;
        }
    }

    protected interface f {
        void a(MotionEvent motionEvent);

        float b();

        float c();

        void d(int i10);

        void recycle();
    }

    private static class g implements f {

        /* renamed from: b  reason: collision with root package name */
        private static g f14488b = new g();

        /* renamed from: a  reason: collision with root package name */
        VelocityTracker f14489a;

        private g() {
        }

        public static g e() {
            f14488b.f14489a = VelocityTracker.obtain();
            return f14488b;
        }

        public void a(MotionEvent motionEvent) {
            VelocityTracker velocityTracker = this.f14489a;
            if (velocityTracker != null) {
                velocityTracker.addMovement(motionEvent);
            }
        }

        public float b() {
            VelocityTracker velocityTracker = this.f14489a;
            if (velocityTracker != null) {
                return velocityTracker.getYVelocity();
            }
            return 0.0f;
        }

        public float c() {
            VelocityTracker velocityTracker = this.f14489a;
            if (velocityTracker != null) {
                return velocityTracker.getXVelocity();
            }
            return 0.0f;
        }

        public void d(int i10) {
            VelocityTracker velocityTracker = this.f14489a;
            if (velocityTracker != null) {
                velocityTracker.computeCurrentVelocity(i10);
            }
        }

        public void recycle() {
            VelocityTracker velocityTracker = this.f14489a;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.f14489a = null;
            }
        }
    }

    class h {

        /* renamed from: a  reason: collision with root package name */
        float f14490a = Float.NaN;

        /* renamed from: b  reason: collision with root package name */
        float f14491b = Float.NaN;

        /* renamed from: c  reason: collision with root package name */
        int f14492c = -1;

        /* renamed from: d  reason: collision with root package name */
        int f14493d = -1;

        /* renamed from: e  reason: collision with root package name */
        final String f14494e = "motion.progress";

        /* renamed from: f  reason: collision with root package name */
        final String f14495f = "motion.velocity";

        /* renamed from: g  reason: collision with root package name */
        final String f14496g = "motion.StartState";

        /* renamed from: h  reason: collision with root package name */
        final String f14497h = "motion.EndState";

        h() {
        }

        /* access modifiers changed from: package-private */
        public void a() {
            int i10 = this.f14492c;
            if (!(i10 == -1 && this.f14493d == -1)) {
                if (i10 == -1) {
                    MotionLayout.this.I0(this.f14493d);
                } else {
                    int i11 = this.f14493d;
                    if (i11 == -1) {
                        MotionLayout.this.A0(i10, -1, -1);
                    } else {
                        MotionLayout.this.B0(i10, i11);
                    }
                }
                MotionLayout.this.setState(j.SETUP);
            }
            if (!Float.isNaN(this.f14491b)) {
                MotionLayout.this.z0(this.f14490a, this.f14491b);
                this.f14490a = Float.NaN;
                this.f14491b = Float.NaN;
                this.f14492c = -1;
                this.f14493d = -1;
            } else if (!Float.isNaN(this.f14490a)) {
                MotionLayout.this.setProgress(this.f14490a);
            }
        }

        public Bundle b() {
            Bundle bundle = new Bundle();
            bundle.putFloat("motion.progress", this.f14490a);
            bundle.putFloat("motion.velocity", this.f14491b);
            bundle.putInt("motion.StartState", this.f14492c);
            bundle.putInt("motion.EndState", this.f14493d);
            return bundle;
        }

        public void c() {
            this.f14493d = MotionLayout.this.f14384F;
            this.f14492c = MotionLayout.this.f14380D;
            this.f14491b = MotionLayout.this.getVelocity();
            this.f14490a = MotionLayout.this.getProgress();
        }

        public void d(int i10) {
            this.f14493d = i10;
        }

        public void e(float f10) {
            this.f14490a = f10;
        }

        public void f(int i10) {
            this.f14492c = i10;
        }

        public void g(Bundle bundle) {
            this.f14490a = bundle.getFloat("motion.progress");
            this.f14491b = bundle.getFloat("motion.velocity");
            this.f14492c = bundle.getInt("motion.StartState");
            this.f14493d = bundle.getInt("motion.EndState");
        }

        public void h(float f10) {
            this.f14491b = f10;
        }
    }

    public interface i {
        void onTransitionChange(MotionLayout motionLayout, int i10, int i11, float f10);

        void onTransitionCompleted(MotionLayout motionLayout, int i10);

        void onTransitionStarted(MotionLayout motionLayout, int i10, int i11);

        void onTransitionTrigger(MotionLayout motionLayout, int i10, boolean z10, float f10);
    }

    enum j {
        UNDEFINED,
        SETUP,
        MOVING,
        FINISHED
    }

    public MotionLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        s0(attributeSet);
    }

    /* access modifiers changed from: private */
    public void C0() {
        float f10;
        float f11;
        int childCount = getChildCount();
        this.f14437q1.a();
        boolean z10 = true;
        this.f14430n0 = true;
        SparseArray sparseArray = new SparseArray();
        int i10 = 0;
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            sparseArray.put(childAt.getId(), (l) this.f14414f0.get(childAt));
        }
        int width = getWidth();
        int height = getHeight();
        int i12 = this.f14451z.i();
        if (i12 != -1) {
            for (int i13 = 0; i13 < childCount; i13++) {
                l lVar = (l) this.f14414f0.get(getChildAt(i13));
                if (lVar != null) {
                    lVar.A(i12);
                }
            }
        }
        SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
        int[] iArr = new int[this.f14414f0.size()];
        int i14 = 0;
        for (int i15 = 0; i15 < childCount; i15++) {
            l lVar2 = (l) this.f14414f0.get(getChildAt(i15));
            if (lVar2.h() != -1) {
                sparseBooleanArray.put(lVar2.h(), true);
                iArr[i14] = lVar2.h();
                i14++;
            }
        }
        if (this.f14394L0 != null) {
            for (int i16 = 0; i16 < i14; i16++) {
                l lVar3 = (l) this.f14414f0.get(findViewById(iArr[i16]));
                if (lVar3 != null) {
                    this.f14451z.s(lVar3);
                }
            }
            Iterator it = this.f14394L0.iterator();
            if (!it.hasNext()) {
                for (int i17 = 0; i17 < i14; i17++) {
                    l lVar4 = (l) this.f14414f0.get(findViewById(iArr[i17]));
                    if (lVar4 != null) {
                        lVar4.F(width, height, this.f14418h0, getNanoTime());
                    }
                }
            } else {
                android.support.v4.media.session.c.a(it.next());
                throw null;
            }
        } else {
            for (int i18 = 0; i18 < i14; i18++) {
                l lVar5 = (l) this.f14414f0.get(findViewById(iArr[i18]));
                if (lVar5 != null) {
                    this.f14451z.s(lVar5);
                    lVar5.F(width, height, this.f14418h0, getNanoTime());
                }
            }
        }
        for (int i19 = 0; i19 < childCount; i19++) {
            View childAt2 = getChildAt(i19);
            l lVar6 = (l) this.f14414f0.get(childAt2);
            if (!sparseBooleanArray.get(childAt2.getId()) && lVar6 != null) {
                this.f14451z.s(lVar6);
                lVar6.F(width, height, this.f14418h0, getNanoTime());
            }
        }
        float D10 = this.f14451z.D();
        if (D10 != 0.0f) {
            if (((double) D10) >= 0.0d) {
                z10 = false;
            }
            float abs = Math.abs(D10);
            float f12 = -3.4028235E38f;
            float f13 = Float.MAX_VALUE;
            float f14 = -3.4028235E38f;
            float f15 = Float.MAX_VALUE;
            for (int i20 = 0; i20 < childCount; i20++) {
                l lVar7 = (l) this.f14414f0.get(getChildAt(i20));
                if (!Float.isNaN(lVar7.f14667m)) {
                    for (int i21 = 0; i21 < childCount; i21++) {
                        l lVar8 = (l) this.f14414f0.get(getChildAt(i21));
                        if (!Float.isNaN(lVar8.f14667m)) {
                            f13 = Math.min(f13, lVar8.f14667m);
                            f12 = Math.max(f12, lVar8.f14667m);
                        }
                    }
                    while (i10 < childCount) {
                        l lVar9 = (l) this.f14414f0.get(getChildAt(i10));
                        if (!Float.isNaN(lVar9.f14667m)) {
                            lVar9.f14669o = 1.0f / (1.0f - abs);
                            if (z10) {
                                lVar9.f14668n = abs - (((f12 - lVar9.f14667m) / (f12 - f13)) * abs);
                            } else {
                                lVar9.f14668n = abs - (((lVar9.f14667m - f13) * abs) / (f12 - f13));
                            }
                        }
                        i10++;
                    }
                    return;
                }
                float n10 = lVar7.n();
                float o10 = lVar7.o();
                if (z10) {
                    f11 = o10 - n10;
                } else {
                    f11 = o10 + n10;
                }
                f15 = Math.min(f15, f11);
                f14 = Math.max(f14, f11);
            }
            while (i10 < childCount) {
                l lVar10 = (l) this.f14414f0.get(getChildAt(i10));
                float n11 = lVar10.n();
                float o11 = lVar10.o();
                if (z10) {
                    f10 = o11 - n11;
                } else {
                    f10 = o11 + n11;
                }
                lVar10.f14669o = 1.0f / (1.0f - abs);
                lVar10.f14668n = abs - (((f10 - f15) * abs) / (f14 - f15));
                i10++;
            }
        }
    }

    /* access modifiers changed from: private */
    public Rect D0(C2063e eVar) {
        this.f14431n1.top = eVar.a0();
        this.f14431n1.left = eVar.Z();
        Rect rect = this.f14431n1;
        int Y10 = eVar.Y();
        Rect rect2 = this.f14431n1;
        rect.right = Y10 + rect2.left;
        int z10 = eVar.z();
        Rect rect3 = this.f14431n1;
        rect2.bottom = z10 + rect3.top;
        return rect3;
    }

    private static boolean O0(float f10, float f11, float f12) {
        if (f10 > 0.0f) {
            float f13 = f10 / f12;
            return f11 + ((f10 * f13) - (((f12 * f13) * f13) / 2.0f)) > 1.0f;
        }
        float f14 = (-f10) / f12;
        return f11 + ((f10 * f14) + (((f12 * f14) * f14) / 2.0f)) < 0.0f;
    }

    private boolean b0(View view, MotionEvent motionEvent, float f10, float f11) {
        Matrix matrix = view.getMatrix();
        if (matrix.isIdentity()) {
            motionEvent.offsetLocation(f10, f11);
            boolean onTouchEvent = view.onTouchEvent(motionEvent);
            motionEvent.offsetLocation(-f10, -f11);
            return onTouchEvent;
        }
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        obtain.offsetLocation(f10, f11);
        if (this.f14445u1 == null) {
            this.f14445u1 = new Matrix();
        }
        matrix.invert(this.f14445u1);
        obtain.transform(this.f14445u1);
        boolean onTouchEvent2 = view.onTouchEvent(obtain);
        obtain.recycle();
        return onTouchEvent2;
    }

    private void c0() {
        o oVar = this.f14451z;
        if (oVar == null) {
            Log.e("MotionLayout", "CHECK: motion scene not set! set \"app:layoutDescription=\"@xml/file\"");
            return;
        }
        int E10 = oVar.E();
        o oVar2 = this.f14451z;
        d0(E10, oVar2.k(oVar2.E()));
        SparseIntArray sparseIntArray = new SparseIntArray();
        SparseIntArray sparseIntArray2 = new SparseIntArray();
        Iterator it = this.f14451z.n().iterator();
        while (it.hasNext()) {
            o.b bVar = (o.b) it.next();
            if (bVar == this.f14451z.f14704c) {
                Log.v("MotionLayout", "CHECK: CURRENT");
            }
            e0(bVar);
            int A10 = bVar.A();
            int y10 = bVar.y();
            String c10 = a.c(getContext(), A10);
            String c11 = a.c(getContext(), y10);
            if (sparseIntArray.get(A10) == y10) {
                Log.e("MotionLayout", "CHECK: two transitions with the same start and end " + c10 + "->" + c11);
            }
            if (sparseIntArray2.get(y10) == A10) {
                Log.e("MotionLayout", "CHECK: you can't have reverse transitions" + c10 + "->" + c11);
            }
            sparseIntArray.put(A10, y10);
            sparseIntArray2.put(y10, A10);
            if (this.f14451z.k(A10) == null) {
                Log.e("MotionLayout", " no such constraintSetStart " + c10);
            }
            if (this.f14451z.k(y10) == null) {
                Log.e("MotionLayout", " no such constraintSetEnd " + c10);
            }
        }
    }

    private void d0(int i10, androidx.constraintlayout.widget.d dVar) {
        String c10 = a.c(getContext(), i10);
        int childCount = getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            int id2 = childAt.getId();
            if (id2 == -1) {
                Log.w("MotionLayout", "CHECK: " + c10 + " ALL VIEWS SHOULD HAVE ID's " + childAt.getClass().getName() + " does not!");
            }
            if (dVar.v(id2) == null) {
                Log.w("MotionLayout", "CHECK: " + c10 + " NO CONSTRAINTS for " + a.d(childAt));
            }
        }
        int[] x10 = dVar.x();
        for (int i12 = 0; i12 < x10.length; i12++) {
            int i13 = x10[i12];
            String c11 = a.c(getContext(), i13);
            if (findViewById(x10[i12]) == null) {
                Log.w("MotionLayout", "CHECK: " + c10 + " NO View matches id " + c11);
            }
            if (dVar.w(i13) == -1) {
                Log.w("MotionLayout", "CHECK: " + c10 + "(" + c11 + ") no LAYOUT_HEIGHT");
            }
            if (dVar.B(i13) == -1) {
                Log.w("MotionLayout", "CHECK: " + c10 + "(" + c11 + ") no LAYOUT_HEIGHT");
            }
        }
    }

    private void e0(o.b bVar) {
        if (bVar.A() == bVar.y()) {
            Log.e("MotionLayout", "CHECK: start and end constraint set should not be the same!");
        }
    }

    private void f0() {
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            l lVar = (l) this.f14414f0.get(childAt);
            if (lVar != null) {
                lVar.B(childAt);
            }
        }
    }

    private void i0() {
        float f10;
        boolean z10;
        float signum = Math.signum(this.f14426l0 - this.f14422j0);
        long nanoTime = getNanoTime();
        Interpolator interpolator = this.f14374A;
        if (!(interpolator instanceof C2141b)) {
            f10 = ((((float) (nanoTime - this.f14424k0)) * signum) * 1.0E-9f) / this.f14418h0;
        } else {
            f10 = 0.0f;
        }
        float f11 = this.f14422j0 + f10;
        if (this.f14428m0) {
            f11 = this.f14426l0;
        }
        int i10 = (signum > 0.0f ? 1 : (signum == 0.0f ? 0 : -1));
        if ((i10 <= 0 || f11 < this.f14426l0) && (signum > 0.0f || f11 > this.f14426l0)) {
            z10 = false;
        } else {
            f11 = this.f14426l0;
            z10 = true;
        }
        if (interpolator != null && !z10) {
            if (this.f14444u0) {
                f11 = interpolator.getInterpolation(((float) (nanoTime - this.f14416g0)) * 1.0E-9f);
            } else {
                f11 = interpolator.getInterpolation(f11);
            }
        }
        if ((i10 > 0 && f11 >= this.f14426l0) || (signum <= 0.0f && f11 <= this.f14426l0)) {
            f11 = this.f14426l0;
        }
        this.f14409a1 = f11;
        int childCount = getChildCount();
        long nanoTime2 = getNanoTime();
        Interpolator interpolator2 = this.f14376B;
        if (interpolator2 != null) {
            f11 = interpolator2.getInterpolation(f11);
        }
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            l lVar = (l) this.f14414f0.get(childAt);
            if (lVar != null) {
                lVar.u(childAt, f11, nanoTime2, this.f14410b1);
            }
        }
        if (this.f14402T0) {
            requestLayout();
        }
    }

    private void j0() {
        CopyOnWriteArrayList copyOnWriteArrayList;
        if ((this.f14434p0 != null || ((copyOnWriteArrayList = this.f14395M0) != null && !copyOnWriteArrayList.isEmpty())) && this.f14400R0 != this.f14420i0) {
            if (this.f14399Q0 != -1) {
                l0();
                this.f14401S0 = true;
            }
            this.f14399Q0 = -1;
            float f10 = this.f14420i0;
            this.f14400R0 = f10;
            i iVar = this.f14434p0;
            if (iVar != null) {
                iVar.onTransitionChange(this, this.f14380D, this.f14384F, f10);
            }
            CopyOnWriteArrayList copyOnWriteArrayList2 = this.f14395M0;
            if (copyOnWriteArrayList2 != null) {
                Iterator it = copyOnWriteArrayList2.iterator();
                while (it.hasNext()) {
                    ((i) it.next()).onTransitionChange(this, this.f14380D, this.f14384F, this.f14420i0);
                }
            }
            this.f14401S0 = true;
        }
    }

    private void l0() {
        i iVar = this.f14434p0;
        if (iVar != null) {
            iVar.onTransitionStarted(this, this.f14380D, this.f14384F);
        }
        CopyOnWriteArrayList copyOnWriteArrayList = this.f14395M0;
        if (copyOnWriteArrayList != null) {
            Iterator it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                ((i) it.next()).onTransitionStarted(this, this.f14380D, this.f14384F);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0039  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean r0(float r8, float r9, android.view.View r10, android.view.MotionEvent r11) {
        /*
            r7 = this;
            boolean r0 = r10 instanceof android.view.ViewGroup
            r1 = 1
            if (r0 == 0) goto L_0x0036
            r0 = r10
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            int r2 = r0.getChildCount()
            int r2 = r2 - r1
        L_0x000d:
            if (r2 < 0) goto L_0x0036
            android.view.View r3 = r0.getChildAt(r2)
            int r4 = r3.getLeft()
            float r4 = (float) r4
            float r4 = r4 + r8
            int r5 = r10.getScrollX()
            float r5 = (float) r5
            float r4 = r4 - r5
            int r5 = r3.getTop()
            float r5 = (float) r5
            float r5 = r5 + r9
            int r6 = r10.getScrollY()
            float r6 = (float) r6
            float r5 = r5 - r6
            boolean r3 = r7.r0(r4, r5, r3, r11)
            if (r3 == 0) goto L_0x0033
            r0 = r1
            goto L_0x0037
        L_0x0033:
            int r2 = r2 + -1
            goto L_0x000d
        L_0x0036:
            r0 = 0
        L_0x0037:
            if (r0 != 0) goto L_0x0075
            android.graphics.RectF r2 = r7.f14441s1
            int r3 = r10.getRight()
            float r3 = (float) r3
            float r3 = r3 + r8
            int r4 = r10.getLeft()
            float r4 = (float) r4
            float r3 = r3 - r4
            int r4 = r10.getBottom()
            float r4 = (float) r4
            float r4 = r4 + r9
            int r5 = r10.getTop()
            float r5 = (float) r5
            float r4 = r4 - r5
            r2.set(r8, r9, r3, r4)
            int r2 = r11.getAction()
            if (r2 != 0) goto L_0x006c
            android.graphics.RectF r2 = r7.f14441s1
            float r3 = r11.getX()
            float r4 = r11.getY()
            boolean r2 = r2.contains(r3, r4)
            if (r2 == 0) goto L_0x0075
        L_0x006c:
            float r8 = -r8
            float r9 = -r9
            boolean r8 = r7.b0(r10, r11, r8, r9)
            if (r8 == 0) goto L_0x0075
            goto L_0x0076
        L_0x0075:
            r1 = r0
        L_0x0076:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.motion.widget.MotionLayout.r0(float, float, android.view.View, android.view.MotionEvent):boolean");
    }

    private void s0(AttributeSet attributeSet) {
        o oVar;
        int i10;
        f14373w1 = isInEditMode();
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, androidx.constraintlayout.widget.h.f15629v7);
            int indexCount = obtainStyledAttributes.getIndexCount();
            boolean z10 = true;
            for (int i11 = 0; i11 < indexCount; i11++) {
                int index = obtainStyledAttributes.getIndex(i11);
                if (index == androidx.constraintlayout.widget.h.f15659y7) {
                    this.f14451z = new o(getContext(), this, obtainStyledAttributes.getResourceId(index, -1));
                } else if (index == androidx.constraintlayout.widget.h.f15649x7) {
                    this.f14382E = obtainStyledAttributes.getResourceId(index, -1);
                } else if (index == androidx.constraintlayout.widget.h.f15148A7) {
                    this.f14426l0 = obtainStyledAttributes.getFloat(index, 0.0f);
                    this.f14430n0 = true;
                } else if (index == androidx.constraintlayout.widget.h.f15639w7) {
                    z10 = obtainStyledAttributes.getBoolean(index, z10);
                } else if (index == androidx.constraintlayout.widget.h.f15158B7) {
                    if (this.f14440s0 == 0) {
                        if (obtainStyledAttributes.getBoolean(index, false)) {
                            i10 = 2;
                        } else {
                            i10 = 0;
                        }
                        this.f14440s0 = i10;
                    }
                } else if (index == androidx.constraintlayout.widget.h.f15669z7) {
                    this.f14440s0 = obtainStyledAttributes.getInt(index, 0);
                }
            }
            obtainStyledAttributes.recycle();
            if (this.f14451z == null) {
                Log.e("MotionLayout", "WARNING NO app:layoutDescription tag");
            }
            if (!z10) {
                this.f14451z = null;
            }
        }
        if (this.f14440s0 != 0) {
            c0();
        }
        if (this.f14382E == -1 && (oVar = this.f14451z) != null) {
            this.f14382E = oVar.E();
            this.f14380D = this.f14451z.E();
            this.f14384F = this.f14451z.p();
        }
    }

    private void w0() {
        CopyOnWriteArrayList copyOnWriteArrayList;
        if (this.f14434p0 != null || ((copyOnWriteArrayList = this.f14395M0) != null && !copyOnWriteArrayList.isEmpty())) {
            this.f14401S0 = false;
            Iterator it = this.f14447v1.iterator();
            while (it.hasNext()) {
                Integer num = (Integer) it.next();
                i iVar = this.f14434p0;
                if (iVar != null) {
                    iVar.onTransitionCompleted(this, num.intValue());
                }
                CopyOnWriteArrayList copyOnWriteArrayList2 = this.f14395M0;
                if (copyOnWriteArrayList2 != null) {
                    Iterator it2 = copyOnWriteArrayList2.iterator();
                    while (it2.hasNext()) {
                        ((i) it2.next()).onTransitionCompleted(this, num.intValue());
                    }
                }
            }
            this.f14447v1.clear();
        }
    }

    public void A0(int i10, int i11, int i12) {
        setState(j.SETUP);
        this.f14382E = i10;
        this.f14380D = -1;
        this.f14384F = -1;
        androidx.constraintlayout.widget.c cVar = this.f14847k;
        if (cVar != null) {
            cVar.d(i10, (float) i11, (float) i12);
            return;
        }
        o oVar = this.f14451z;
        if (oVar != null) {
            oVar.k(i10).i(this);
        }
    }

    public void B0(int i10, int i11) {
        if (!isAttachedToWindow()) {
            if (this.f14412d1 == null) {
                this.f14412d1 = new h();
            }
            this.f14412d1.f(i10);
            this.f14412d1.d(i11);
            return;
        }
        o oVar = this.f14451z;
        if (oVar != null) {
            this.f14380D = i10;
            this.f14384F = i11;
            oVar.W(i10, i11);
            this.f14437q1.e(this.f14839c, this.f14451z.k(i10), this.f14451z.k(i11));
            x0();
            this.f14422j0 = 0.0f;
            H0();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0037, code lost:
        if (r10 != 7) goto L_0x00f1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void E0(int r10, float r11, float r12) {
        /*
            r9 = this;
            androidx.constraintlayout.motion.widget.o r0 = r9.f14451z
            if (r0 != 0) goto L_0x0005
            return
        L_0x0005:
            float r0 = r9.f14422j0
            int r0 = (r0 > r11 ? 1 : (r0 == r11 ? 0 : -1))
            if (r0 != 0) goto L_0x000c
            return
        L_0x000c:
            r0 = 1
            r9.f14444u0 = r0
            long r1 = r9.getNanoTime()
            r9.f14416g0 = r1
            androidx.constraintlayout.motion.widget.o r1 = r9.f14451z
            int r1 = r1.o()
            float r1 = (float) r1
            r2 = 1148846080(0x447a0000, float:1000.0)
            float r1 = r1 / r2
            r9.f14418h0 = r1
            r9.f14426l0 = r11
            r9.f14430n0 = r0
            r1 = 0
            r2 = 7
            r3 = 6
            r4 = 2
            if (r10 == 0) goto L_0x0093
            if (r10 == r0) goto L_0x0093
            if (r10 == r4) goto L_0x0093
            r5 = 4
            if (r10 == r5) goto L_0x0081
            r5 = 5
            if (r10 == r5) goto L_0x003b
            if (r10 == r3) goto L_0x0093
            if (r10 == r2) goto L_0x0093
            goto L_0x00f1
        L_0x003b:
            float r10 = r9.f14422j0
            androidx.constraintlayout.motion.widget.o r0 = r9.f14451z
            float r0 = r0.t()
            boolean r10 = O0(r12, r10, r0)
            if (r10 == 0) goto L_0x005c
            androidx.constraintlayout.motion.widget.MotionLayout$c r10 = r9.f14448w0
            float r11 = r9.f14422j0
            androidx.constraintlayout.motion.widget.o r0 = r9.f14451z
            float r0 = r0.t()
            r10.b(r12, r11, r0)
            androidx.constraintlayout.motion.widget.MotionLayout$c r10 = r9.f14448w0
            r9.f14374A = r10
            goto L_0x00f1
        L_0x005c:
            k1.b r2 = r9.f14446v0
            float r3 = r9.f14422j0
            float r6 = r9.f14418h0
            androidx.constraintlayout.motion.widget.o r10 = r9.f14451z
            float r7 = r10.t()
            androidx.constraintlayout.motion.widget.o r10 = r9.f14451z
            float r8 = r10.u()
            r4 = r11
            r5 = r12
            r2.b(r3, r4, r5, r6, r7, r8)
            r9.f14378C = r1
            int r10 = r9.f14382E
            r9.f14426l0 = r11
            r9.f14382E = r10
            k1.b r10 = r9.f14446v0
            r9.f14374A = r10
            goto L_0x00f1
        L_0x0081:
            androidx.constraintlayout.motion.widget.MotionLayout$c r10 = r9.f14448w0
            float r11 = r9.f14422j0
            androidx.constraintlayout.motion.widget.o r0 = r9.f14451z
            float r0 = r0.t()
            r10.b(r12, r11, r0)
            androidx.constraintlayout.motion.widget.MotionLayout$c r10 = r9.f14448w0
            r9.f14374A = r10
            goto L_0x00f1
        L_0x0093:
            if (r10 == r0) goto L_0x009f
            if (r10 != r2) goto L_0x0098
            goto L_0x009f
        L_0x0098:
            if (r10 == r4) goto L_0x009c
            if (r10 != r3) goto L_0x00a0
        L_0x009c:
            r11 = 1065353216(0x3f800000, float:1.0)
            goto L_0x00a0
        L_0x009f:
            r11 = r1
        L_0x00a0:
            androidx.constraintlayout.motion.widget.o r10 = r9.f14451z
            int r10 = r10.j()
            if (r10 != 0) goto L_0x00c0
            k1.b r0 = r9.f14446v0
            float r1 = r9.f14422j0
            float r4 = r9.f14418h0
            androidx.constraintlayout.motion.widget.o r10 = r9.f14451z
            float r5 = r10.t()
            androidx.constraintlayout.motion.widget.o r10 = r9.f14451z
            float r6 = r10.u()
            r2 = r11
            r3 = r12
            r0.b(r1, r2, r3, r4, r5, r6)
            goto L_0x00e7
        L_0x00c0:
            k1.b r0 = r9.f14446v0
            float r1 = r9.f14422j0
            androidx.constraintlayout.motion.widget.o r10 = r9.f14451z
            float r4 = r10.A()
            androidx.constraintlayout.motion.widget.o r10 = r9.f14451z
            float r5 = r10.B()
            androidx.constraintlayout.motion.widget.o r10 = r9.f14451z
            float r6 = r10.z()
            androidx.constraintlayout.motion.widget.o r10 = r9.f14451z
            float r7 = r10.C()
            androidx.constraintlayout.motion.widget.o r10 = r9.f14451z
            int r8 = r10.y()
            r2 = r11
            r3 = r12
            r0.d(r1, r2, r3, r4, r5, r6, r7, r8)
        L_0x00e7:
            int r10 = r9.f14382E
            r9.f14426l0 = r11
            r9.f14382E = r10
            k1.b r10 = r9.f14446v0
            r9.f14374A = r10
        L_0x00f1:
            r10 = 0
            r9.f14428m0 = r10
            long r10 = r9.getNanoTime()
            r9.f14416g0 = r10
            r9.invalidate()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.motion.widget.MotionLayout.E0(int, float, float):void");
    }

    public void F0() {
        a0(1.0f);
        this.f14413e1 = null;
    }

    public void G0(Runnable runnable) {
        a0(1.0f);
        this.f14413e1 = runnable;
    }

    public void H0() {
        a0(0.0f);
    }

    public void I0(int i10) {
        if (!isAttachedToWindow()) {
            if (this.f14412d1 == null) {
                this.f14412d1 = new h();
            }
            this.f14412d1.d(i10);
            return;
        }
        J0(i10, -1, -1);
    }

    public void J0(int i10, int i11, int i12) {
        K0(i10, i11, i12, -1);
    }

    public void K0(int i10, int i11, int i12, int i13) {
        androidx.constraintlayout.widget.j jVar;
        int a10;
        o oVar = this.f14451z;
        if (!(oVar == null || (jVar = oVar.f14703b) == null || (a10 = jVar.a(this.f14382E, i10, (float) i11, (float) i12)) == -1)) {
            i10 = a10;
        }
        int i14 = this.f14382E;
        if (i14 != i10) {
            if (this.f14380D == i10) {
                a0(0.0f);
                if (i13 > 0) {
                    this.f14418h0 = ((float) i13) / 1000.0f;
                }
            } else if (this.f14384F == i10) {
                a0(1.0f);
                if (i13 > 0) {
                    this.f14418h0 = ((float) i13) / 1000.0f;
                }
            } else {
                this.f14384F = i10;
                if (i14 != -1) {
                    B0(i14, i10);
                    a0(1.0f);
                    this.f14422j0 = 0.0f;
                    F0();
                    if (i13 > 0) {
                        this.f14418h0 = ((float) i13) / 1000.0f;
                        return;
                    }
                    return;
                }
                this.f14444u0 = false;
                this.f14426l0 = 1.0f;
                this.f14420i0 = 0.0f;
                this.f14422j0 = 0.0f;
                this.f14424k0 = getNanoTime();
                this.f14416g0 = getNanoTime();
                this.f14428m0 = false;
                this.f14374A = null;
                if (i13 == -1) {
                    this.f14418h0 = ((float) this.f14451z.o()) / 1000.0f;
                }
                this.f14380D = -1;
                this.f14451z.W(-1, this.f14384F);
                SparseArray sparseArray = new SparseArray();
                if (i13 == 0) {
                    this.f14418h0 = ((float) this.f14451z.o()) / 1000.0f;
                } else if (i13 > 0) {
                    this.f14418h0 = ((float) i13) / 1000.0f;
                }
                int childCount = getChildCount();
                this.f14414f0.clear();
                for (int i15 = 0; i15 < childCount; i15++) {
                    View childAt = getChildAt(i15);
                    this.f14414f0.put(childAt, new l(childAt));
                    sparseArray.put(childAt.getId(), (l) this.f14414f0.get(childAt));
                }
                this.f14430n0 = true;
                this.f14437q1.e(this.f14839c, (androidx.constraintlayout.widget.d) null, this.f14451z.k(i10));
                x0();
                this.f14437q1.a();
                f0();
                int width = getWidth();
                int height = getHeight();
                if (this.f14394L0 != null) {
                    for (int i16 = 0; i16 < childCount; i16++) {
                        l lVar = (l) this.f14414f0.get(getChildAt(i16));
                        if (lVar != null) {
                            this.f14451z.s(lVar);
                        }
                    }
                    Iterator it = this.f14394L0.iterator();
                    if (!it.hasNext()) {
                        for (int i17 = 0; i17 < childCount; i17++) {
                            l lVar2 = (l) this.f14414f0.get(getChildAt(i17));
                            if (lVar2 != null) {
                                lVar2.F(width, height, this.f14418h0, getNanoTime());
                            }
                        }
                    } else {
                        android.support.v4.media.session.c.a(it.next());
                        throw null;
                    }
                } else {
                    for (int i18 = 0; i18 < childCount; i18++) {
                        l lVar3 = (l) this.f14414f0.get(getChildAt(i18));
                        if (lVar3 != null) {
                            this.f14451z.s(lVar3);
                            lVar3.F(width, height, this.f14418h0, getNanoTime());
                        }
                    }
                }
                float D10 = this.f14451z.D();
                if (D10 != 0.0f) {
                    float f10 = Float.MAX_VALUE;
                    float f11 = -3.4028235E38f;
                    for (int i19 = 0; i19 < childCount; i19++) {
                        l lVar4 = (l) this.f14414f0.get(getChildAt(i19));
                        float o10 = lVar4.o() + lVar4.n();
                        f10 = Math.min(f10, o10);
                        f11 = Math.max(f11, o10);
                    }
                    for (int i20 = 0; i20 < childCount; i20++) {
                        l lVar5 = (l) this.f14414f0.get(getChildAt(i20));
                        float n10 = lVar5.n();
                        float o11 = lVar5.o();
                        lVar5.f14669o = 1.0f / (1.0f - D10);
                        lVar5.f14668n = D10 - ((((n10 + o11) - f10) * D10) / (f11 - f10));
                    }
                }
                this.f14420i0 = 0.0f;
                this.f14422j0 = 0.0f;
                this.f14430n0 = true;
                invalidate();
            }
        }
    }

    public void L0() {
        this.f14437q1.e(this.f14839c, this.f14451z.k(this.f14380D), this.f14451z.k(this.f14384F));
        x0();
    }

    public void M0(int i10, androidx.constraintlayout.widget.d dVar) {
        o oVar = this.f14451z;
        if (oVar != null) {
            oVar.T(i10, dVar);
        }
        L0();
        if (this.f14382E == i10) {
            dVar.i(this);
        }
    }

    public void N0(int i10, View... viewArr) {
        o oVar = this.f14451z;
        if (oVar != null) {
            oVar.b0(i10, viewArr);
        } else {
            Log.e("MotionLayout", " no motionScene");
        }
    }

    /* access modifiers changed from: package-private */
    public void a0(float f10) {
        o oVar = this.f14451z;
        if (oVar != null) {
            float f11 = this.f14422j0;
            float f12 = this.f14420i0;
            if (f11 != f12 && this.f14428m0) {
                this.f14422j0 = f12;
            }
            float f13 = this.f14422j0;
            if (f13 != f10) {
                this.f14444u0 = false;
                this.f14426l0 = f10;
                this.f14418h0 = ((float) oVar.o()) / 1000.0f;
                setProgress(this.f14426l0);
                this.f14374A = null;
                this.f14376B = this.f14451z.r();
                this.f14428m0 = false;
                this.f14416g0 = getNanoTime();
                this.f14430n0 = true;
                this.f14420i0 = f13;
                this.f14422j0 = f13;
                invalidate();
            }
        }
    }

    /* access modifiers changed from: protected */
    public void dispatchDraw(Canvas canvas) {
        String str;
        s sVar;
        ArrayList arrayList = this.f14394L0;
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            if (it.hasNext()) {
                android.support.v4.media.session.c.a(it.next());
                throw null;
            }
        }
        h0(false);
        o oVar = this.f14451z;
        if (!(oVar == null || (sVar = oVar.f14719r) == null)) {
            sVar.c();
        }
        super.dispatchDraw(canvas);
        if (this.f14451z != null) {
            if ((this.f14440s0 & 1) == 1 && !isInEditMode()) {
                this.f14396N0++;
                long nanoTime = getNanoTime();
                long j10 = this.f14397O0;
                if (j10 != -1) {
                    long j11 = nanoTime - j10;
                    if (j11 > 200000000) {
                        this.f14398P0 = ((float) ((int) ((((float) this.f14396N0) / (((float) j11) * 1.0E-9f)) * 100.0f))) / 100.0f;
                        this.f14396N0 = 0;
                        this.f14397O0 = nanoTime;
                    }
                } else {
                    this.f14397O0 = nanoTime;
                }
                Paint paint = new Paint();
                paint.setTextSize(42.0f);
                StringBuilder sb2 = new StringBuilder();
                sb2.append(this.f14398P0 + " fps " + a.e(this, this.f14380D) + " -> ");
                sb2.append(a.e(this, this.f14384F));
                sb2.append(" (progress: ");
                sb2.append(((float) ((int) (getProgress() * 1000.0f))) / 10.0f);
                sb2.append(" ) state=");
                int i10 = this.f14382E;
                if (i10 == -1) {
                    str = "undefined";
                } else {
                    str = a.e(this, i10);
                }
                sb2.append(str);
                String sb3 = sb2.toString();
                paint.setColor(-16777216);
                canvas.drawText(sb3, 11.0f, (float) (getHeight() - 29), paint);
                paint.setColor(-7864184);
                canvas.drawText(sb3, 10.0f, (float) (getHeight() - 30), paint);
            }
            if (this.f14440s0 > 1) {
                if (this.f14442t0 == null) {
                    this.f14442t0 = new d();
                }
                this.f14442t0.a(canvas, this.f14414f0, this.f14451z.o(), this.f14440s0);
            }
            ArrayList arrayList2 = this.f14394L0;
            if (arrayList2 != null) {
                Iterator it2 = arrayList2.iterator();
                if (it2.hasNext()) {
                    android.support.v4.media.session.c.a(it2.next());
                    throw null;
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void g0(boolean z10) {
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            l lVar = (l) this.f14414f0.get(getChildAt(i10));
            if (lVar != null) {
                lVar.f(z10);
            }
        }
    }

    public int[] getConstraintSetIds() {
        o oVar = this.f14451z;
        if (oVar == null) {
            return null;
        }
        return oVar.m();
    }

    public int getCurrentState() {
        return this.f14382E;
    }

    public ArrayList<o.b> getDefinedTransitions() {
        o oVar = this.f14451z;
        if (oVar == null) {
            return null;
        }
        return oVar.n();
    }

    public b getDesignTool() {
        if (this.f14449x0 == null) {
            this.f14449x0 = new b(this);
        }
        return this.f14449x0;
    }

    public int getEndState() {
        return this.f14384F;
    }

    /* access modifiers changed from: protected */
    public long getNanoTime() {
        return System.nanoTime();
    }

    public float getProgress() {
        return this.f14422j0;
    }

    public o getScene() {
        return this.f14451z;
    }

    public int getStartState() {
        return this.f14380D;
    }

    public float getTargetPosition() {
        return this.f14426l0;
    }

    public Bundle getTransitionState() {
        if (this.f14412d1 == null) {
            this.f14412d1 = new h();
        }
        this.f14412d1.c();
        return this.f14412d1.b();
    }

    public long getTransitionTimeMs() {
        o oVar = this.f14451z;
        if (oVar != null) {
            this.f14418h0 = ((float) oVar.o()) / 1000.0f;
        }
        return (long) (this.f14418h0 * 1000.0f);
    }

    public float getVelocity() {
        return this.f14378C;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x01a8  */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x01aa  */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x01be  */
    /* JADX WARNING: Removed duplicated region for block: B:132:0x020c A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:140:0x0222  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x0111  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x0118 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x014f  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x0151  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x0159  */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x0170  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void h0(boolean r23) {
        /*
            r22 = this;
            r0 = r22
            long r1 = r0.f14424k0
            r3 = -1
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 != 0) goto L_0x0010
            long r1 = r22.getNanoTime()
            r0.f14424k0 = r1
        L_0x0010:
            float r1 = r0.f14422j0
            r2 = 0
            int r3 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            r4 = -1
            r5 = 1065353216(0x3f800000, float:1.0)
            if (r3 <= 0) goto L_0x0020
            int r3 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r3 >= 0) goto L_0x0020
            r0.f14382E = r4
        L_0x0020:
            boolean r3 = r0.f14391I0
            r6 = 1
            r7 = 0
            if (r3 != 0) goto L_0x0032
            boolean r3 = r0.f14430n0
            if (r3 == 0) goto L_0x0240
            if (r23 != 0) goto L_0x0032
            float r3 = r0.f14426l0
            int r3 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r3 == 0) goto L_0x0240
        L_0x0032:
            float r3 = r0.f14426l0
            float r3 = r3 - r1
            float r1 = java.lang.Math.signum(r3)
            long r8 = r22.getNanoTime()
            android.view.animation.Interpolator r3 = r0.f14374A
            boolean r10 = r3 instanceof androidx.constraintlayout.motion.widget.m
            r11 = 814313567(0x3089705f, float:1.0E-9)
            if (r10 != 0) goto L_0x0051
            long r12 = r0.f14424k0
            long r12 = r8 - r12
            float r10 = (float) r12
            float r10 = r10 * r1
            float r10 = r10 * r11
            float r12 = r0.f14418h0
            float r10 = r10 / r12
            goto L_0x0052
        L_0x0051:
            r10 = r2
        L_0x0052:
            float r12 = r0.f14422j0
            float r12 = r12 + r10
            boolean r13 = r0.f14428m0
            if (r13 == 0) goto L_0x005b
            float r12 = r0.f14426l0
        L_0x005b:
            int r13 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r13 <= 0) goto L_0x0065
            float r14 = r0.f14426l0
            int r14 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r14 >= 0) goto L_0x006f
        L_0x0065:
            int r14 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r14 > 0) goto L_0x0075
            float r14 = r0.f14426l0
            int r14 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r14 > 0) goto L_0x0075
        L_0x006f:
            float r12 = r0.f14426l0
            r0.f14430n0 = r7
            r14 = r6
            goto L_0x0076
        L_0x0075:
            r14 = r7
        L_0x0076:
            r0.f14422j0 = r12
            r0.f14420i0 = r12
            r0.f14424k0 = r8
            r15 = 925353388(0x3727c5ac, float:1.0E-5)
            if (r3 == 0) goto L_0x0104
            if (r14 != 0) goto L_0x0104
            boolean r14 = r0.f14444u0
            if (r14 == 0) goto L_0x00e4
            long r4 = r0.f14416g0
            long r4 = r8 - r4
            float r4 = (float) r4
            float r4 = r4 * r11
            float r3 = r3.getInterpolation(r4)
            android.view.animation.Interpolator r4 = r0.f14374A
            k1.b r5 = r0.f14446v0
            r10 = 2
            if (r4 != r5) goto L_0x00a2
            boolean r4 = r5.c()
            if (r4 == 0) goto L_0x00a0
            r4 = r10
            goto L_0x00a3
        L_0x00a0:
            r4 = r6
            goto L_0x00a3
        L_0x00a2:
            r4 = r7
        L_0x00a3:
            r0.f14422j0 = r3
            r0.f14424k0 = r8
            android.view.animation.Interpolator r5 = r0.f14374A
            boolean r8 = r5 instanceof androidx.constraintlayout.motion.widget.m
            if (r8 == 0) goto L_0x00e2
            androidx.constraintlayout.motion.widget.m r5 = (androidx.constraintlayout.motion.widget.m) r5
            float r5 = r5.a()
            r0.f14378C = r5
            float r8 = java.lang.Math.abs(r5)
            float r9 = r0.f14418h0
            float r8 = r8 * r9
            int r8 = (r8 > r15 ? 1 : (r8 == r15 ? 0 : -1))
            if (r8 > 0) goto L_0x00c4
            if (r4 != r10) goto L_0x00c4
            r0.f14430n0 = r7
        L_0x00c4:
            int r8 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r8 <= 0) goto L_0x00d4
            r8 = 1065353216(0x3f800000, float:1.0)
            int r9 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r9 < 0) goto L_0x00d4
            r0.f14422j0 = r8
            r0.f14430n0 = r7
            r3 = 1065353216(0x3f800000, float:1.0)
        L_0x00d4:
            int r5 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r5 >= 0) goto L_0x00e2
            int r5 = (r3 > r2 ? 1 : (r3 == r2 ? 0 : -1))
            if (r5 > 0) goto L_0x00e2
            r0.f14422j0 = r2
            r0.f14430n0 = r7
            r12 = r2
            goto L_0x0107
        L_0x00e2:
            r12 = r3
            goto L_0x0107
        L_0x00e4:
            float r3 = r3.getInterpolation(r12)
            android.view.animation.Interpolator r4 = r0.f14374A
            boolean r5 = r4 instanceof androidx.constraintlayout.motion.widget.m
            if (r5 == 0) goto L_0x00f7
            androidx.constraintlayout.motion.widget.m r4 = (androidx.constraintlayout.motion.widget.m) r4
            float r4 = r4.a()
            r0.f14378C = r4
            goto L_0x0101
        L_0x00f7:
            float r12 = r12 + r10
            float r4 = r4.getInterpolation(r12)
            float r4 = r4 - r3
            float r4 = r4 * r1
            float r4 = r4 / r10
            r0.f14378C = r4
        L_0x0101:
            r12 = r3
        L_0x0102:
            r4 = r7
            goto L_0x0107
        L_0x0104:
            r0.f14378C = r10
            goto L_0x0102
        L_0x0107:
            float r3 = r0.f14378C
            float r3 = java.lang.Math.abs(r3)
            int r3 = (r3 > r15 ? 1 : (r3 == r15 ? 0 : -1))
            if (r3 <= 0) goto L_0x0116
            androidx.constraintlayout.motion.widget.MotionLayout$j r3 = androidx.constraintlayout.motion.widget.MotionLayout.j.MOVING
            r0.setState(r3)
        L_0x0116:
            if (r4 == r6) goto L_0x013f
            if (r13 <= 0) goto L_0x0120
            float r3 = r0.f14426l0
            int r3 = (r12 > r3 ? 1 : (r12 == r3 ? 0 : -1))
            if (r3 >= 0) goto L_0x012a
        L_0x0120:
            int r3 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r3 > 0) goto L_0x012e
            float r3 = r0.f14426l0
            int r3 = (r12 > r3 ? 1 : (r12 == r3 ? 0 : -1))
            if (r3 > 0) goto L_0x012e
        L_0x012a:
            float r12 = r0.f14426l0
            r0.f14430n0 = r7
        L_0x012e:
            r3 = 1065353216(0x3f800000, float:1.0)
            int r4 = (r12 > r3 ? 1 : (r12 == r3 ? 0 : -1))
            if (r4 >= 0) goto L_0x0138
            int r3 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r3 > 0) goto L_0x013f
        L_0x0138:
            r0.f14430n0 = r7
            androidx.constraintlayout.motion.widget.MotionLayout$j r3 = androidx.constraintlayout.motion.widget.MotionLayout.j.FINISHED
            r0.setState(r3)
        L_0x013f:
            int r3 = r22.getChildCount()
            r0.f14391I0 = r7
            long r4 = r22.getNanoTime()
            r0.f14409a1 = r12
            android.view.animation.Interpolator r8 = r0.f14376B
            if (r8 != 0) goto L_0x0151
            r8 = r12
            goto L_0x0155
        L_0x0151:
            float r8 = r8.getInterpolation(r12)
        L_0x0155:
            android.view.animation.Interpolator r9 = r0.f14376B
            if (r9 == 0) goto L_0x016d
            float r10 = r0.f14418h0
            float r10 = r1 / r10
            float r10 = r10 + r12
            float r9 = r9.getInterpolation(r10)
            r0.f14378C = r9
            android.view.animation.Interpolator r10 = r0.f14376B
            float r10 = r10.getInterpolation(r12)
            float r9 = r9 - r10
            r0.f14378C = r9
        L_0x016d:
            r9 = r7
        L_0x016e:
            if (r9 >= r3) goto L_0x0196
            android.view.View r10 = r0.getChildAt(r9)
            java.util.HashMap r11 = r0.f14414f0
            java.lang.Object r11 = r11.get(r10)
            r16 = r11
            androidx.constraintlayout.motion.widget.l r16 = (androidx.constraintlayout.motion.widget.l) r16
            if (r16 == 0) goto L_0x0193
            boolean r11 = r0.f14391I0
            g1.d r15 = r0.f14410b1
            r17 = r10
            r18 = r8
            r19 = r4
            r21 = r15
            boolean r10 = r16.u(r17, r18, r19, r21)
            r10 = r10 | r11
            r0.f14391I0 = r10
        L_0x0193:
            int r9 = r9 + 1
            goto L_0x016e
        L_0x0196:
            if (r13 <= 0) goto L_0x019e
            float r3 = r0.f14426l0
            int r3 = (r12 > r3 ? 1 : (r12 == r3 ? 0 : -1))
            if (r3 >= 0) goto L_0x01a8
        L_0x019e:
            int r3 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r3 > 0) goto L_0x01aa
            float r3 = r0.f14426l0
            int r3 = (r12 > r3 ? 1 : (r12 == r3 ? 0 : -1))
            if (r3 > 0) goto L_0x01aa
        L_0x01a8:
            r3 = r6
            goto L_0x01ab
        L_0x01aa:
            r3 = r7
        L_0x01ab:
            boolean r4 = r0.f14391I0
            if (r4 != 0) goto L_0x01ba
            boolean r4 = r0.f14430n0
            if (r4 != 0) goto L_0x01ba
            if (r3 == 0) goto L_0x01ba
            androidx.constraintlayout.motion.widget.MotionLayout$j r4 = androidx.constraintlayout.motion.widget.MotionLayout.j.FINISHED
            r0.setState(r4)
        L_0x01ba:
            boolean r4 = r0.f14402T0
            if (r4 == 0) goto L_0x01c1
            r22.requestLayout()
        L_0x01c1:
            boolean r4 = r0.f14391I0
            r3 = r3 ^ r6
            r3 = r3 | r4
            r0.f14391I0 = r3
            int r3 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r3 > 0) goto L_0x01e5
            int r3 = r0.f14380D
            r4 = -1
            if (r3 == r4) goto L_0x01e5
            int r4 = r0.f14382E
            if (r4 == r3) goto L_0x01e5
            r0.f14382E = r3
            androidx.constraintlayout.motion.widget.o r4 = r0.f14451z
            androidx.constraintlayout.widget.d r3 = r4.k(r3)
            r3.g(r0)
            androidx.constraintlayout.motion.widget.MotionLayout$j r3 = androidx.constraintlayout.motion.widget.MotionLayout.j.FINISHED
            r0.setState(r3)
            r7 = r6
        L_0x01e5:
            double r3 = (double) r12
            r8 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            int r3 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r3 < 0) goto L_0x0203
            int r3 = r0.f14382E
            int r4 = r0.f14384F
            if (r3 == r4) goto L_0x0203
            r0.f14382E = r4
            androidx.constraintlayout.motion.widget.o r3 = r0.f14451z
            androidx.constraintlayout.widget.d r3 = r3.k(r4)
            r3.g(r0)
            androidx.constraintlayout.motion.widget.MotionLayout$j r3 = androidx.constraintlayout.motion.widget.MotionLayout.j.FINISHED
            r0.setState(r3)
            r7 = r6
        L_0x0203:
            boolean r3 = r0.f14391I0
            if (r3 != 0) goto L_0x0222
            boolean r3 = r0.f14430n0
            if (r3 == 0) goto L_0x020c
            goto L_0x0222
        L_0x020c:
            if (r13 <= 0) goto L_0x0214
            r3 = 1065353216(0x3f800000, float:1.0)
            int r4 = (r12 > r3 ? 1 : (r12 == r3 ? 0 : -1))
            if (r4 == 0) goto L_0x021c
        L_0x0214:
            int r3 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r3 >= 0) goto L_0x0225
            int r3 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r3 != 0) goto L_0x0225
        L_0x021c:
            androidx.constraintlayout.motion.widget.MotionLayout$j r3 = androidx.constraintlayout.motion.widget.MotionLayout.j.FINISHED
            r0.setState(r3)
            goto L_0x0225
        L_0x0222:
            r22.invalidate()
        L_0x0225:
            boolean r3 = r0.f14391I0
            if (r3 != 0) goto L_0x0240
            boolean r3 = r0.f14430n0
            if (r3 != 0) goto L_0x0240
            if (r13 <= 0) goto L_0x0235
            r3 = 1065353216(0x3f800000, float:1.0)
            int r4 = (r12 > r3 ? 1 : (r12 == r3 ? 0 : -1))
            if (r4 == 0) goto L_0x023d
        L_0x0235:
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 >= 0) goto L_0x0240
            int r1 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r1 != 0) goto L_0x0240
        L_0x023d:
            r22.v0()
        L_0x0240:
            float r1 = r0.f14422j0
            r3 = 1065353216(0x3f800000, float:1.0)
            int r3 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r3 < 0) goto L_0x0254
            int r1 = r0.f14382E
            int r2 = r0.f14384F
            if (r1 == r2) goto L_0x024f
            goto L_0x0250
        L_0x024f:
            r6 = r7
        L_0x0250:
            r0.f14382E = r2
        L_0x0252:
            r7 = r6
            goto L_0x0263
        L_0x0254:
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 > 0) goto L_0x0263
            int r1 = r0.f14382E
            int r2 = r0.f14380D
            if (r1 == r2) goto L_0x025f
            goto L_0x0260
        L_0x025f:
            r6 = r7
        L_0x0260:
            r0.f14382E = r2
            goto L_0x0252
        L_0x0263:
            boolean r1 = r0.f14439r1
            r1 = r1 | r7
            r0.f14439r1 = r1
            if (r7 == 0) goto L_0x0271
            boolean r1 = r0.f14411c1
            if (r1 != 0) goto L_0x0271
            r22.requestLayout()
        L_0x0271:
            float r1 = r0.f14422j0
            r0.f14420i0 = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.motion.widget.MotionLayout.h0(boolean):void");
    }

    public void i(View view, View view2, int i10, int i11) {
        this.f14387G0 = getNanoTime();
        this.f14389H0 = 0.0f;
        this.f14383E0 = 0.0f;
        this.f14385F0 = 0.0f;
    }

    public void j(View view, int i10) {
        o oVar = this.f14451z;
        if (oVar != null) {
            float f10 = this.f14389H0;
            if (f10 != 0.0f) {
                oVar.P(this.f14383E0 / f10, this.f14385F0 / f10);
            }
        }
    }

    public void k(View view, int i10, int i11, int[] iArr, int i12) {
        o.b bVar;
        p B10;
        int q10;
        o oVar = this.f14451z;
        if (oVar != null && (bVar = oVar.f14704c) != null && bVar.C()) {
            int i13 = -1;
            if (!bVar.C() || (B10 = bVar.B()) == null || (q10 = B10.q()) == -1 || view.getId() == q10) {
                if (oVar.v()) {
                    p B11 = bVar.B();
                    if (!(B11 == null || (B11.e() & 4) == 0)) {
                        i13 = i11;
                    }
                    float f10 = this.f14420i0;
                    if ((f10 == 1.0f || f10 == 0.0f) && view.canScrollVertically(i13)) {
                        return;
                    }
                }
                if (!(bVar.B() == null || (bVar.B().e() & 1) == 0)) {
                    float w10 = oVar.w((float) i10, (float) i11);
                    float f11 = this.f14422j0;
                    if ((f11 <= 0.0f && w10 < 0.0f) || (f11 >= 1.0f && w10 > 0.0f)) {
                        view.setNestedScrollingEnabled(false);
                        view.post(new a(view));
                        return;
                    }
                }
                float f12 = this.f14420i0;
                long nanoTime = getNanoTime();
                float f13 = (float) i10;
                this.f14383E0 = f13;
                float f14 = (float) i11;
                this.f14385F0 = f14;
                this.f14389H0 = (float) (((double) (nanoTime - this.f14387G0)) * 1.0E-9d);
                this.f14387G0 = nanoTime;
                oVar.O(f13, f14);
                if (f12 != this.f14420i0) {
                    iArr[0] = i10;
                    iArr[1] = i11;
                }
                h0(false);
                if (iArr[0] != 0 || iArr[1] != 0) {
                    this.f14381D0 = true;
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    public void k0() {
        int i10;
        CopyOnWriteArrayList copyOnWriteArrayList;
        if ((this.f14434p0 != null || ((copyOnWriteArrayList = this.f14395M0) != null && !copyOnWriteArrayList.isEmpty())) && this.f14399Q0 == -1) {
            this.f14399Q0 = this.f14382E;
            if (!this.f14447v1.isEmpty()) {
                ArrayList arrayList = this.f14447v1;
                i10 = ((Integer) arrayList.get(arrayList.size() - 1)).intValue();
            } else {
                i10 = -1;
            }
            int i11 = this.f14382E;
            if (!(i10 == i11 || i11 == -1)) {
                this.f14447v1.add(Integer.valueOf(i11));
            }
        }
        w0();
        Runnable runnable = this.f14413e1;
        if (runnable != null) {
            runnable.run();
            this.f14413e1 = null;
        }
        int[] iArr = this.f14415f1;
        if (iArr != null && this.f14417g1 > 0) {
            I0(iArr[0]);
            int[] iArr2 = this.f14415f1;
            System.arraycopy(iArr2, 1, iArr2, 0, iArr2.length - 1);
            this.f14417g1--;
        }
    }

    public void m(View view, int i10, int i11, int i12, int i13, int i14, int[] iArr) {
        if (!(!this.f14381D0 && i10 == 0 && i11 == 0)) {
            iArr[0] = iArr[0] + i12;
            iArr[1] = iArr[1] + i13;
        }
        this.f14381D0 = false;
    }

    public void m0(int i10, boolean z10, float f10) {
        i iVar = this.f14434p0;
        if (iVar != null) {
            iVar.onTransitionTrigger(this, i10, z10, f10);
        }
        CopyOnWriteArrayList copyOnWriteArrayList = this.f14395M0;
        if (copyOnWriteArrayList != null) {
            Iterator it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                ((i) it.next()).onTransitionTrigger(this, i10, z10, f10);
            }
        }
    }

    public void n(View view, int i10, int i11, int i12, int i13, int i14) {
    }

    /* access modifiers changed from: package-private */
    public void n0(int i10, float f10, float f11, float f12, float[] fArr) {
        String str;
        HashMap hashMap = this.f14414f0;
        View q10 = q(i10);
        l lVar = (l) hashMap.get(q10);
        if (lVar != null) {
            lVar.l(f10, f11, f12, fArr);
            float y10 = q10.getY();
            this.f14436q0 = f10;
            this.f14438r0 = y10;
            return;
        }
        if (q10 == null) {
            str = "" + i10;
        } else {
            str = q10.getContext().getResources().getResourceName(i10);
        }
        Log.w("MotionLayout", "WARNING could not find view id " + str);
    }

    public boolean o(View view, View view2, int i10, int i11) {
        o.b bVar;
        o oVar = this.f14451z;
        if (oVar == null || (bVar = oVar.f14704c) == null || bVar.B() == null || (this.f14451z.f14704c.B().e() & 2) != 0) {
            return false;
        }
        return true;
    }

    public androidx.constraintlayout.widget.d o0(int i10) {
        o oVar = this.f14451z;
        if (oVar == null) {
            return null;
        }
        return oVar.k(i10);
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        o.b bVar;
        int i10;
        super.onAttachedToWindow();
        Display display = getDisplay();
        if (display != null) {
            this.f14429m1 = display.getRotation();
        }
        o oVar = this.f14451z;
        if (!(oVar == null || (i10 = this.f14382E) == -1)) {
            androidx.constraintlayout.widget.d k10 = oVar.k(i10);
            this.f14451z.S(this);
            ArrayList arrayList = this.f14394L0;
            if (arrayList != null) {
                Iterator it = arrayList.iterator();
                if (it.hasNext()) {
                    android.support.v4.media.session.c.a(it.next());
                    throw null;
                }
            }
            if (k10 != null) {
                k10.i(this);
            }
            this.f14380D = this.f14382E;
        }
        v0();
        h hVar = this.f14412d1;
        if (hVar == null) {
            o oVar2 = this.f14451z;
            if (oVar2 != null && (bVar = oVar2.f14704c) != null && bVar.x() == 4) {
                F0();
                setState(j.SETUP);
                setState(j.MOVING);
            }
        } else if (this.f14433o1) {
            post(new b());
        } else {
            hVar.a();
        }
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        p B10;
        int q10;
        RectF p10;
        o oVar = this.f14451z;
        if (oVar != null && this.f14390I) {
            s sVar = oVar.f14719r;
            if (sVar != null) {
                sVar.g(motionEvent);
            }
            o.b bVar = this.f14451z.f14704c;
            if (bVar != null && bVar.C() && (B10 = bVar.B()) != null && ((motionEvent.getAction() != 0 || (p10 = B10.p(this, new RectF())) == null || p10.contains(motionEvent.getX(), motionEvent.getY())) && (q10 = B10.q()) != -1)) {
                View view = this.f14443t1;
                if (view == null || view.getId() != q10) {
                    this.f14443t1 = findViewById(q10);
                }
                View view2 = this.f14443t1;
                if (view2 != null) {
                    this.f14441s1.set((float) view2.getLeft(), (float) this.f14443t1.getTop(), (float) this.f14443t1.getRight(), (float) this.f14443t1.getBottom());
                    if (this.f14441s1.contains(motionEvent.getX(), motionEvent.getY()) && !r0((float) this.f14443t1.getLeft(), (float) this.f14443t1.getTop(), this.f14443t1, motionEvent)) {
                        return onTouchEvent(motionEvent);
                    }
                }
            }
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        this.f14411c1 = true;
        try {
            if (this.f14451z == null) {
                super.onLayout(z10, i10, i11, i12, i13);
                return;
            }
            int i14 = i12 - i10;
            int i15 = i13 - i11;
            if (!(this.f14377B0 == i14 && this.f14379C0 == i15)) {
                x0();
                h0(true);
            }
            this.f14377B0 = i14;
            this.f14379C0 = i15;
            this.f14452z0 = i14;
            this.f14375A0 = i15;
            this.f14411c1 = false;
        } finally {
            this.f14411c1 = false;
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i10, int i11) {
        boolean z10;
        if (this.f14451z == null) {
            super.onMeasure(i10, i11);
            return;
        }
        boolean z11 = false;
        if (this.f14386G == i10 && this.f14388H == i11) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (this.f14439r1) {
            this.f14439r1 = false;
            v0();
            w0();
            z10 = true;
        }
        if (this.f14844h) {
            z10 = true;
        }
        this.f14386G = i10;
        this.f14388H = i11;
        int E10 = this.f14451z.E();
        int p10 = this.f14451z.p();
        if ((z10 || this.f14437q1.f(E10, p10)) && this.f14380D != -1) {
            super.onMeasure(i10, i11);
            this.f14437q1.e(this.f14839c, this.f14451z.k(E10), this.f14451z.k(p10));
            this.f14437q1.h();
            this.f14437q1.i(E10, p10);
        } else {
            if (z10) {
                super.onMeasure(i10, i11);
            }
            z11 = true;
        }
        if (this.f14402T0 || z11) {
            int paddingTop = getPaddingTop() + getPaddingBottom();
            int Y10 = this.f14839c.Y() + getPaddingLeft() + getPaddingRight();
            int z12 = this.f14839c.z() + paddingTop;
            int i12 = this.f14407Y0;
            if (i12 == Integer.MIN_VALUE || i12 == 0) {
                int i13 = this.f14403U0;
                Y10 = (int) (((float) i13) + (this.f14409a1 * ((float) (this.f14405W0 - i13))));
                requestLayout();
            }
            int i14 = this.f14408Z0;
            if (i14 == Integer.MIN_VALUE || i14 == 0) {
                int i15 = this.f14404V0;
                z12 = (int) (((float) i15) + (this.f14409a1 * ((float) (this.f14406X0 - i15))));
                requestLayout();
            }
            setMeasuredDimension(Y10, z12);
        }
        i0();
    }

    public boolean onNestedFling(View view, float f10, float f11, boolean z10) {
        return false;
    }

    public boolean onNestedPreFling(View view, float f10, float f11) {
        return false;
    }

    public void onRtlPropertiesChanged(int i10) {
        o oVar = this.f14451z;
        if (oVar != null) {
            oVar.V(t());
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        o oVar = this.f14451z;
        if (oVar == null || !this.f14390I || !oVar.a0()) {
            return super.onTouchEvent(motionEvent);
        }
        o.b bVar = this.f14451z.f14704c;
        if (bVar != null && !bVar.C()) {
            return super.onTouchEvent(motionEvent);
        }
        this.f14451z.Q(motionEvent, getCurrentState(), this);
        if (this.f14451z.f14704c.D(4)) {
            return this.f14451z.f14704c.B().r();
        }
        return true;
    }

    public void onViewAdded(View view) {
        super.onViewAdded(view);
    }

    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        ArrayList arrayList = this.f14392J0;
        if (arrayList != null) {
            arrayList.remove(view);
        }
        ArrayList arrayList2 = this.f14393K0;
        if (arrayList2 != null) {
            arrayList2.remove(view);
        }
    }

    /* access modifiers changed from: package-private */
    public l p0(int i10) {
        return (l) this.f14414f0.get(findViewById(i10));
    }

    public o.b q0(int i10) {
        return this.f14451z.F(i10);
    }

    public void requestLayout() {
        o oVar;
        o.b bVar;
        if (!this.f14402T0 && this.f14382E == -1 && (oVar = this.f14451z) != null && (bVar = oVar.f14704c) != null) {
            int z10 = bVar.z();
            if (z10 != 0) {
                if (z10 == 2) {
                    int childCount = getChildCount();
                    for (int i10 = 0; i10 < childCount; i10++) {
                        ((l) this.f14414f0.get(getChildAt(i10))).w();
                    }
                    return;
                }
            } else {
                return;
            }
        }
        super.requestLayout();
    }

    public void setDebugMode(int i10) {
        this.f14440s0 = i10;
        invalidate();
    }

    public void setDelayedApplicationOfInitialState(boolean z10) {
        this.f14433o1 = z10;
    }

    public void setInteractionEnabled(boolean z10) {
        this.f14390I = z10;
    }

    public void setInterpolatedProgress(float f10) {
        if (this.f14451z != null) {
            setState(j.MOVING);
            Interpolator r10 = this.f14451z.r();
            if (r10 != null) {
                setProgress(r10.getInterpolation(f10));
                return;
            }
        }
        setProgress(f10);
    }

    public void setOnHide(float f10) {
        ArrayList arrayList = this.f14393K0;
        if (arrayList != null && arrayList.size() > 0) {
            android.support.v4.media.session.c.a(this.f14393K0.get(0));
            throw null;
        }
    }

    public void setOnShow(float f10) {
        ArrayList arrayList = this.f14392J0;
        if (arrayList != null && arrayList.size() > 0) {
            android.support.v4.media.session.c.a(this.f14392J0.get(0));
            throw null;
        }
    }

    public void setProgress(float f10) {
        int i10 = (f10 > 0.0f ? 1 : (f10 == 0.0f ? 0 : -1));
        if (i10 < 0 || f10 > 1.0f) {
            Log.w("MotionLayout", "Warning! Progress is defined for values between 0.0 and 1.0 inclusive");
        }
        if (!isAttachedToWindow()) {
            if (this.f14412d1 == null) {
                this.f14412d1 = new h();
            }
            this.f14412d1.e(f10);
            return;
        }
        if (i10 <= 0) {
            if (this.f14422j0 == 1.0f && this.f14382E == this.f14384F) {
                setState(j.MOVING);
            }
            this.f14382E = this.f14380D;
            if (this.f14422j0 == 0.0f) {
                setState(j.FINISHED);
            }
        } else if (f10 >= 1.0f) {
            if (this.f14422j0 == 0.0f && this.f14382E == this.f14380D) {
                setState(j.MOVING);
            }
            this.f14382E = this.f14384F;
            if (this.f14422j0 == 1.0f) {
                setState(j.FINISHED);
            }
        } else {
            this.f14382E = -1;
            setState(j.MOVING);
        }
        if (this.f14451z != null) {
            this.f14428m0 = true;
            this.f14426l0 = f10;
            this.f14420i0 = f10;
            this.f14424k0 = -1;
            this.f14416g0 = -1;
            this.f14374A = null;
            this.f14430n0 = true;
            invalidate();
        }
    }

    public void setScene(o oVar) {
        this.f14451z = oVar;
        oVar.V(t());
        x0();
    }

    /* access modifiers changed from: package-private */
    public void setStartState(int i10) {
        if (!isAttachedToWindow()) {
            if (this.f14412d1 == null) {
                this.f14412d1 = new h();
            }
            this.f14412d1.f(i10);
            this.f14412d1.d(i10);
            return;
        }
        this.f14382E = i10;
    }

    /* access modifiers changed from: package-private */
    public void setState(j jVar) {
        j jVar2 = j.FINISHED;
        if (jVar != jVar2 || this.f14382E != -1) {
            j jVar3 = this.f14435p1;
            this.f14435p1 = jVar;
            j jVar4 = j.MOVING;
            if (jVar3 == jVar4 && jVar == jVar4) {
                j0();
            }
            int ordinal = jVar3.ordinal();
            if (ordinal == 0 || ordinal == 1) {
                if (jVar == jVar4) {
                    j0();
                }
                if (jVar == jVar2) {
                    k0();
                }
            } else if (ordinal == 2 && jVar == jVar2) {
                k0();
            }
        }
    }

    public void setTransition(int i10) {
        float f10;
        if (this.f14451z != null) {
            o.b q02 = q0(i10);
            this.f14380D = q02.A();
            this.f14384F = q02.y();
            if (!isAttachedToWindow()) {
                if (this.f14412d1 == null) {
                    this.f14412d1 = new h();
                }
                this.f14412d1.f(this.f14380D);
                this.f14412d1.d(this.f14384F);
                return;
            }
            int i11 = this.f14382E;
            float f11 = 0.0f;
            if (i11 == this.f14380D) {
                f10 = 0.0f;
            } else {
                f10 = i11 == this.f14384F ? 1.0f : Float.NaN;
            }
            this.f14451z.X(q02);
            this.f14437q1.e(this.f14839c, this.f14451z.k(this.f14380D), this.f14451z.k(this.f14384F));
            x0();
            if (this.f14422j0 != f10) {
                if (f10 == 0.0f) {
                    g0(true);
                    this.f14451z.k(this.f14380D).i(this);
                } else if (f10 == 1.0f) {
                    g0(false);
                    this.f14451z.k(this.f14384F).i(this);
                }
            }
            if (!Float.isNaN(f10)) {
                f11 = f10;
            }
            this.f14422j0 = f11;
            if (Float.isNaN(f10)) {
                Log.v("MotionLayout", a.b() + " transitionToStart ");
                H0();
                return;
            }
            setProgress(f10);
        }
    }

    public void setTransitionDuration(int i10) {
        o oVar = this.f14451z;
        if (oVar == null) {
            Log.e("MotionLayout", "MotionScene not defined");
        } else {
            oVar.U(i10);
        }
    }

    public void setTransitionListener(i iVar) {
        this.f14434p0 = iVar;
    }

    public void setTransitionState(Bundle bundle) {
        if (this.f14412d1 == null) {
            this.f14412d1 = new h();
        }
        this.f14412d1.g(bundle);
        if (isAttachedToWindow()) {
            this.f14412d1.a();
        }
    }

    public boolean t0() {
        return this.f14390I;
    }

    public String toString() {
        Context context = getContext();
        return a.c(context, this.f14380D) + "->" + a.c(context, this.f14384F) + " (pos:" + this.f14422j0 + " Dpos/Dt:" + this.f14378C;
    }

    /* access modifiers changed from: protected */
    public f u0() {
        return g.e();
    }

    /* access modifiers changed from: protected */
    public void v(int i10) {
        this.f14847k = null;
    }

    /* access modifiers changed from: package-private */
    public void v0() {
        o oVar = this.f14451z;
        if (oVar != null) {
            if (oVar.g(this, this.f14382E)) {
                requestLayout();
                return;
            }
            int i10 = this.f14382E;
            if (i10 != -1) {
                this.f14451z.f(this, i10);
            }
            if (this.f14451z.a0()) {
                this.f14451z.Y();
            }
        }
    }

    public void x0() {
        this.f14437q1.h();
        invalidate();
    }

    public boolean y0(i iVar) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.f14395M0;
        if (copyOnWriteArrayList == null) {
            return false;
        }
        return copyOnWriteArrayList.remove(iVar);
    }

    public void z0(float f10, float f11) {
        if (!isAttachedToWindow()) {
            if (this.f14412d1 == null) {
                this.f14412d1 = new h();
            }
            this.f14412d1.e(f10);
            this.f14412d1.h(f11);
            return;
        }
        setProgress(f10);
        setState(j.MOVING);
        this.f14378C = f11;
        float f12 = 0.0f;
        int i10 = (f11 > 0.0f ? 1 : (f11 == 0.0f ? 0 : -1));
        if (i10 != 0) {
            if (i10 > 0) {
                f12 = 1.0f;
            }
            a0(f12);
        } else if (f10 != 0.0f && f10 != 1.0f) {
            if (f10 > 0.5f) {
                f12 = 1.0f;
            }
            a0(f12);
        }
    }

    /* access modifiers changed from: protected */
    public void setTransition(o.b bVar) {
        this.f14451z.X(bVar);
        setState(j.SETUP);
        if (this.f14382E == this.f14451z.p()) {
            this.f14422j0 = 1.0f;
            this.f14420i0 = 1.0f;
            this.f14426l0 = 1.0f;
        } else {
            this.f14422j0 = 0.0f;
            this.f14420i0 = 0.0f;
            this.f14426l0 = 0.0f;
        }
        this.f14424k0 = bVar.D(1) ? -1 : getNanoTime();
        int E10 = this.f14451z.E();
        int p10 = this.f14451z.p();
        if (E10 != this.f14380D || p10 != this.f14384F) {
            this.f14380D = E10;
            this.f14384F = p10;
            this.f14451z.W(E10, p10);
            this.f14437q1.e(this.f14839c, this.f14451z.k(this.f14380D), this.f14451z.k(this.f14384F));
            this.f14437q1.i(this.f14380D, this.f14384F);
            this.f14437q1.h();
            x0();
        }
    }
}
