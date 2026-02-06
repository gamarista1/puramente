package com.google.android.material.timepicker;

import Ua.i;
import Ua.j;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.core.view.C1680b0;
import java.util.ArrayList;
import java.util.List;

class ClockHandView extends View {

    /* renamed from: a  reason: collision with root package name */
    private ValueAnimator f56336a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f56337b;

    /* renamed from: c  reason: collision with root package name */
    private float f56338c;

    /* renamed from: d  reason: collision with root package name */
    private float f56339d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f56340e;

    /* renamed from: f  reason: collision with root package name */
    private int f56341f;

    /* renamed from: g  reason: collision with root package name */
    private final List f56342g;

    /* renamed from: h  reason: collision with root package name */
    private final int f56343h;

    /* renamed from: i  reason: collision with root package name */
    private final float f56344i;

    /* renamed from: j  reason: collision with root package name */
    private final Paint f56345j;

    /* renamed from: k  reason: collision with root package name */
    private final RectF f56346k;

    /* renamed from: l  reason: collision with root package name */
    private final int f56347l;

    /* renamed from: m  reason: collision with root package name */
    private float f56348m;

    /* renamed from: n  reason: collision with root package name */
    private boolean f56349n;

    /* renamed from: o  reason: collision with root package name */
    private c f56350o;

    /* renamed from: p  reason: collision with root package name */
    private double f56351p;

    /* renamed from: q  reason: collision with root package name */
    private int f56352q;

    class a implements ValueAnimator.AnimatorUpdateListener {
        a() {
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            ClockHandView.this.n(((Float) valueAnimator.getAnimatedValue()).floatValue(), true);
        }
    }

    class b extends AnimatorListenerAdapter {
        b() {
        }

        public void onAnimationCancel(Animator animator) {
            animator.end();
        }
    }

    public interface c {
        void c(float f10, boolean z10);
    }

    public interface d {
        void f(float f10, boolean z10);
    }

    public ClockHandView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, Ua.a.f52744v);
    }

    private void c(Canvas canvas) {
        int height = getHeight() / 2;
        int width = getWidth() / 2;
        float f10 = (float) width;
        float f11 = (float) height;
        this.f56345j.setStrokeWidth(0.0f);
        canvas.drawCircle((((float) this.f56352q) * ((float) Math.cos(this.f56351p))) + f10, (((float) this.f56352q) * ((float) Math.sin(this.f56351p))) + f11, (float) this.f56343h, this.f56345j);
        double sin = Math.sin(this.f56351p);
        double cos = Math.cos(this.f56351p);
        double d10 = (double) ((float) (this.f56352q - this.f56343h));
        float f12 = (float) (width + ((int) (cos * d10)));
        float f13 = (float) (height + ((int) (d10 * sin)));
        this.f56345j.setStrokeWidth((float) this.f56347l);
        canvas.drawLine(f10, f11, f12, f13, this.f56345j);
        canvas.drawCircle(f10, f11, this.f56344i, this.f56345j);
    }

    private int e(float f10, float f11) {
        int degrees = (int) Math.toDegrees(Math.atan2((double) (f11 - ((float) (getHeight() / 2))), (double) (f10 - ((float) (getWidth() / 2)))));
        int i10 = degrees + 90;
        if (i10 < 0) {
            return degrees + 450;
        }
        return i10;
    }

    private Pair h(float f10) {
        float f11 = f();
        if (Math.abs(f11 - f10) > 180.0f) {
            if (f11 > 180.0f && f10 < 180.0f) {
                f10 += 360.0f;
            }
            if (f11 < 180.0f && f10 > 180.0f) {
                f11 += 360.0f;
            }
        }
        return new Pair(Float.valueOf(f11), Float.valueOf(f10));
    }

    private boolean i(float f10, float f11, boolean z10, boolean z11, boolean z12) {
        boolean z13;
        float e10 = (float) e(f10, f11);
        boolean z14 = false;
        if (f() != e10) {
            z13 = true;
        } else {
            z13 = false;
        }
        if (z11 && z13) {
            return true;
        }
        if (!z13 && !z10) {
            return false;
        }
        if (z12 && this.f56337b) {
            z14 = true;
        }
        m(e10, z14);
        return true;
    }

    /* access modifiers changed from: private */
    public void n(float f10, boolean z10) {
        float f11 = f10 % 360.0f;
        this.f56348m = f11;
        this.f56351p = Math.toRadians((double) (f11 - 90.0f));
        float width = ((float) (getWidth() / 2)) + (((float) this.f56352q) * ((float) Math.cos(this.f56351p)));
        float height = ((float) (getHeight() / 2)) + (((float) this.f56352q) * ((float) Math.sin(this.f56351p)));
        RectF rectF = this.f56346k;
        int i10 = this.f56343h;
        rectF.set(width - ((float) i10), height - ((float) i10), width + ((float) i10), height + ((float) i10));
        for (d f12 : this.f56342g) {
            f12.f(f11, z10);
        }
        invalidate();
    }

    public void b(d dVar) {
        this.f56342g.add(dVar);
    }

    public RectF d() {
        return this.f56346k;
    }

    public float f() {
        return this.f56348m;
    }

    public int g() {
        return this.f56343h;
    }

    public void j(boolean z10) {
        this.f56337b = z10;
    }

    public void k(int i10) {
        this.f56352q = i10;
        invalidate();
    }

    public void l(float f10) {
        m(f10, false);
    }

    public void m(float f10, boolean z10) {
        ValueAnimator valueAnimator = this.f56336a;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        if (!z10) {
            n(f10, false);
            return;
        }
        Pair h10 = h(f10);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{((Float) h10.first).floatValue(), ((Float) h10.second).floatValue()});
        this.f56336a = ofFloat;
        ofFloat.setDuration(200);
        this.f56336a.addUpdateListener(new a());
        this.f56336a.addListener(new b());
        this.f56336a.start();
    }

    public void o(c cVar) {
        this.f56350o = cVar;
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        c(canvas);
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        l(f());
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        boolean z11;
        boolean z12;
        c cVar;
        boolean z13;
        int actionMasked = motionEvent.getActionMasked();
        float x10 = motionEvent.getX();
        float y10 = motionEvent.getY();
        if (actionMasked == 0) {
            this.f56338c = x10;
            this.f56339d = y10;
            this.f56340e = true;
            this.f56349n = false;
            z12 = false;
            z11 = false;
            z10 = true;
        } else if (actionMasked == 1 || actionMasked == 2) {
            int i10 = (int) (x10 - this.f56338c);
            int i11 = (int) (y10 - this.f56339d);
            if ((i10 * i10) + (i11 * i11) > this.f56341f) {
                z13 = true;
            } else {
                z13 = false;
            }
            this.f56340e = z13;
            boolean z14 = this.f56349n;
            if (actionMasked == 1) {
                z12 = true;
            } else {
                z12 = false;
            }
            z10 = false;
            z11 = z14;
        } else {
            z12 = false;
            z11 = false;
            z10 = false;
        }
        boolean i12 = i(x10, y10, z11, z10, z12) | this.f56349n;
        this.f56349n = i12;
        if (i12 && z12 && (cVar = this.f56350o) != null) {
            cVar.c((float) e(x10, y10), this.f56340e);
        }
        return true;
    }

    public ClockHandView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f56342g = new ArrayList();
        Paint paint = new Paint();
        this.f56345j = paint;
        this.f56346k = new RectF();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, j.f53168g1, i10, i.f52928r);
        this.f56352q = obtainStyledAttributes.getDimensionPixelSize(j.f53184i1, 0);
        this.f56343h = obtainStyledAttributes.getDimensionPixelSize(j.f53192j1, 0);
        Resources resources = getResources();
        this.f56347l = resources.getDimensionPixelSize(Ua.c.f52780i);
        this.f56344i = (float) resources.getDimensionPixelSize(Ua.c.f52778g);
        int color = obtainStyledAttributes.getColor(j.f53176h1, 0);
        paint.setAntiAlias(true);
        paint.setColor(color);
        l(0.0f);
        this.f56341f = ViewConfiguration.get(context).getScaledTouchSlop();
        C1680b0.y0(this, 2);
        obtainStyledAttributes.recycle();
    }
}
