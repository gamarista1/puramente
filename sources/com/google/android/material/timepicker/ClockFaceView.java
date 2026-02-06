package com.google.android.material.timepicker;

import Ua.c;
import Ua.e;
import Ua.g;
import Ua.i;
import Ua.j;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.os.Bundle;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.TextView;
import androidx.core.view.C1677a;
import androidx.core.view.C1680b0;
import com.google.android.material.timepicker.ClockHandView;
import fb.C4982c;
import j.C2115a;
import java.util.Arrays;
import y1.C2930A;

class ClockFaceView extends d implements ClockHandView.d {
    /* access modifiers changed from: private */

    /* renamed from: C  reason: collision with root package name */
    public final ClockHandView f56320C;

    /* renamed from: D  reason: collision with root package name */
    private final Rect f56321D;

    /* renamed from: E  reason: collision with root package name */
    private final RectF f56322E;
    /* access modifiers changed from: private */

    /* renamed from: F  reason: collision with root package name */
    public final SparseArray f56323F;

    /* renamed from: G  reason: collision with root package name */
    private final C1677a f56324G;

    /* renamed from: H  reason: collision with root package name */
    private final int[] f56325H;

    /* renamed from: I  reason: collision with root package name */
    private final float[] f56326I;
    /* access modifiers changed from: private */

    /* renamed from: f0  reason: collision with root package name */
    public final int f56327f0;

    /* renamed from: g0  reason: collision with root package name */
    private final int f56328g0;

    /* renamed from: h0  reason: collision with root package name */
    private final int f56329h0;

    /* renamed from: i0  reason: collision with root package name */
    private final int f56330i0;

    /* renamed from: j0  reason: collision with root package name */
    private String[] f56331j0;

    /* renamed from: k0  reason: collision with root package name */
    private float f56332k0;

    /* renamed from: l0  reason: collision with root package name */
    private final ColorStateList f56333l0;

    class a implements ViewTreeObserver.OnPreDrawListener {
        a() {
        }

        public boolean onPreDraw() {
            if (!ClockFaceView.this.isShown()) {
                return true;
            }
            ClockFaceView.this.getViewTreeObserver().removeOnPreDrawListener(this);
            ClockFaceView.this.F(((ClockFaceView.this.getHeight() / 2) - ClockFaceView.this.f56320C.g()) - ClockFaceView.this.f56327f0);
            return true;
        }
    }

    class b extends C1677a {
        b() {
        }

        public void onInitializeAccessibilityNodeInfo(View view, C2930A a10) {
            super.onInitializeAccessibilityNodeInfo(view, a10);
            int intValue = ((Integer) view.getTag(e.f52852x)).intValue();
            if (intValue > 0) {
                a10.e1((View) ClockFaceView.this.f56323F.get(intValue - 1));
            }
            a10.w0(C2930A.f.b(0, 1, intValue, 1, false, view.isSelected()));
            a10.u0(true);
            a10.b(C2930A.a.f28602i);
        }

        public boolean performAccessibilityAction(View view, int i10, Bundle bundle) {
            if (i10 != 16) {
                return super.performAccessibilityAction(view, i10, bundle);
            }
            long uptimeMillis = SystemClock.uptimeMillis();
            float x10 = view.getX() + (((float) view.getWidth()) / 2.0f);
            long j10 = uptimeMillis;
            float f10 = x10;
            float height = (((float) view.getHeight()) / 2.0f) + view.getY();
            ClockFaceView.this.f56320C.onTouchEvent(MotionEvent.obtain(uptimeMillis, j10, 0, f10, height, 0));
            ClockFaceView.this.f56320C.onTouchEvent(MotionEvent.obtain(uptimeMillis, j10, 1, f10, height, 0));
            return true;
        }
    }

    public ClockFaceView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, Ua.a.f52744v);
    }

    private void M() {
        RectF d10 = this.f56320C.d();
        for (int i10 = 0; i10 < this.f56323F.size(); i10++) {
            TextView textView = (TextView) this.f56323F.get(i10);
            if (textView != null) {
                textView.getDrawingRect(this.f56321D);
                offsetDescendantRectToMyCoords(textView, this.f56321D);
                textView.setSelected(d10.contains((float) this.f56321D.centerX(), (float) this.f56321D.centerY()));
                textView.getPaint().setShader(N(d10, this.f56321D, textView));
                textView.invalidate();
            }
        }
    }

    private RadialGradient N(RectF rectF, Rect rect, TextView textView) {
        this.f56322E.set(rect);
        this.f56322E.offset((float) textView.getPaddingLeft(), (float) textView.getPaddingTop());
        if (!RectF.intersects(rectF, this.f56322E)) {
            return null;
        }
        return new RadialGradient(rectF.centerX() - this.f56322E.left, rectF.centerY() - this.f56322E.top, rectF.width() * 0.5f, this.f56325H, this.f56326I, Shader.TileMode.CLAMP);
    }

    private static float O(float f10, float f11, float f12) {
        return Math.max(Math.max(f10, f11), f12);
    }

    private void Q(int i10) {
        LayoutInflater from = LayoutInflater.from(getContext());
        int size = this.f56323F.size();
        for (int i11 = 0; i11 < Math.max(this.f56331j0.length, size); i11++) {
            TextView textView = (TextView) this.f56323F.get(i11);
            if (i11 >= this.f56331j0.length) {
                removeView(textView);
                this.f56323F.remove(i11);
            } else {
                if (textView == null) {
                    textView = (TextView) from.inflate(g.f52860d, this, false);
                    this.f56323F.put(i11, textView);
                    addView(textView);
                }
                textView.setVisibility(0);
                textView.setText(this.f56331j0[i11]);
                textView.setTag(e.f52852x, Integer.valueOf(i11));
                C1680b0.o0(textView, this.f56324G);
                textView.setTextColor(this.f56333l0);
                if (i10 != 0) {
                    textView.setContentDescription(getResources().getString(i10, new Object[]{this.f56331j0[i11]}));
                }
            }
        }
    }

    public void F(int i10) {
        if (i10 != E()) {
            super.F(i10);
            this.f56320C.k(E());
        }
    }

    public void P(String[] strArr, int i10) {
        this.f56331j0 = strArr;
        Q(i10);
    }

    public void f(float f10, boolean z10) {
        if (Math.abs(this.f56332k0 - f10) > 0.001f) {
            this.f56332k0 = f10;
            M();
        }
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        C2930A.l1(accessibilityNodeInfo).v0(C2930A.e.b(1, this.f56331j0.length, false, 1));
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        M();
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i10, int i11) {
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        int O10 = (int) (((float) this.f56330i0) / O(((float) this.f56328g0) / ((float) displayMetrics.heightPixels), ((float) this.f56329h0) / ((float) displayMetrics.widthPixels), 1.0f));
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(O10, 1073741824);
        setMeasuredDimension(O10, O10);
        super.onMeasure(makeMeasureSpec, makeMeasureSpec);
    }

    public ClockFaceView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f56321D = new Rect();
        this.f56322E = new RectF();
        this.f56323F = new SparseArray();
        this.f56326I = new float[]{0.0f, 0.9f, 1.0f};
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, j.f53144d1, i10, i.f52928r);
        Resources resources = getResources();
        ColorStateList a10 = C4982c.a(context, obtainStyledAttributes, j.f53160f1);
        this.f56333l0 = a10;
        LayoutInflater.from(context).inflate(g.f52861e, this, true);
        ClockHandView clockHandView = (ClockHandView) findViewById(e.f52838j);
        this.f56320C = clockHandView;
        this.f56327f0 = resources.getDimensionPixelSize(c.f52779h);
        int colorForState = a10.getColorForState(new int[]{16842913}, a10.getDefaultColor());
        this.f56325H = new int[]{colorForState, colorForState, a10.getDefaultColor()};
        clockHandView.b(this);
        int defaultColor = C2115a.a(context, Ua.b.f52750b).getDefaultColor();
        ColorStateList a11 = C4982c.a(context, obtainStyledAttributes, j.f53152e1);
        setBackgroundColor(a11 != null ? a11.getDefaultColor() : defaultColor);
        getViewTreeObserver().addOnPreDrawListener(new a());
        setFocusable(true);
        obtainStyledAttributes.recycle();
        this.f56324G = new b();
        String[] strArr = new String[12];
        Arrays.fill(strArr, "");
        P(strArr, 0);
        this.f56328g0 = resources.getDimensionPixelSize(c.f52793v);
        this.f56329h0 = resources.getDimensionPixelSize(c.f52794w);
        this.f56330i0 = resources.getDimensionPixelSize(c.f52781j);
    }
}
