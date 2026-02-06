package com.google.android.material.snackbar;

import Ua.c;
import Ua.j;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.C1680b0;
import com.google.android.material.behavior.SwipeDismissBehavior;
import com.google.android.material.internal.n;
import com.google.android.material.snackbar.a;
import fb.C4982c;
import jb.C5041a;
import q1.C2429a;

public abstract class BaseTransientBottomBar {

    public static class Behavior extends SwipeDismissBehavior<View> {

        /* renamed from: j  reason: collision with root package name */
        private final a f56098j = new a(this);

        public boolean E(View view) {
            return this.f56098j.a(view);
        }

        public boolean k(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
            this.f56098j.b(coordinatorLayout, view, motionEvent);
            return super.k(coordinatorLayout, view, motionEvent);
        }
    }

    public static class a {
        public a(SwipeDismissBehavior swipeDismissBehavior) {
            swipeDismissBehavior.K(0.1f);
            swipeDismissBehavior.J(0.6f);
            swipeDismissBehavior.L(0);
        }

        public boolean a(View view) {
            return view instanceof b;
        }

        public void b(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked != 0) {
                if (actionMasked == 1 || actionMasked == 3) {
                    a.b().f((a.b) null);
                }
            } else if (coordinatorLayout.C(view, (int) motionEvent.getX(), (int) motionEvent.getY())) {
                a.b().e((a.b) null);
            }
        }
    }

    protected static class b extends FrameLayout {

        /* renamed from: j  reason: collision with root package name */
        private static final View.OnTouchListener f56099j = new a();

        /* renamed from: a  reason: collision with root package name */
        private int f56100a;

        /* renamed from: b  reason: collision with root package name */
        private final float f56101b;

        /* renamed from: c  reason: collision with root package name */
        private final float f56102c;

        /* renamed from: d  reason: collision with root package name */
        private final int f56103d;

        /* renamed from: e  reason: collision with root package name */
        private final int f56104e;

        /* renamed from: f  reason: collision with root package name */
        private ColorStateList f56105f;

        /* renamed from: g  reason: collision with root package name */
        private PorterDuff.Mode f56106g;

        /* renamed from: h  reason: collision with root package name */
        private Rect f56107h;

        /* renamed from: i  reason: collision with root package name */
        private boolean f56108i;

        class a implements View.OnTouchListener {
            a() {
            }

            public boolean onTouch(View view, MotionEvent motionEvent) {
                return true;
            }
        }

        protected b(Context context, AttributeSet attributeSet) {
            super(C5041a.c(context, attributeSet, 0, 0), attributeSet);
            Context context2 = getContext();
            TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, j.f53307x4);
            if (obtainStyledAttributes.hasValue(j.f52967E4)) {
                C1680b0.w0(this, (float) obtainStyledAttributes.getDimensionPixelSize(j.f52967E4, 0));
            }
            this.f56100a = obtainStyledAttributes.getInt(j.f52935A4, 0);
            this.f56101b = obtainStyledAttributes.getFloat(j.f52943B4, 1.0f);
            setBackgroundTintList(C4982c.a(context2, obtainStyledAttributes, j.f52951C4));
            setBackgroundTintMode(n.f(obtainStyledAttributes.getInt(j.f52959D4, -1), PorterDuff.Mode.SRC_IN));
            this.f56102c = obtainStyledAttributes.getFloat(j.f53323z4, 1.0f);
            this.f56103d = obtainStyledAttributes.getDimensionPixelSize(j.f53315y4, -1);
            this.f56104e = obtainStyledAttributes.getDimensionPixelSize(j.f52975F4, -1);
            obtainStyledAttributes.recycle();
            setOnTouchListener(f56099j);
            setFocusable(true);
            if (getBackground() == null) {
                C1680b0.s0(this, a());
            }
        }

        private Drawable a() {
            float dimension = getResources().getDimension(c.f52767M);
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setShape(0);
            gradientDrawable.setCornerRadius(dimension);
            gradientDrawable.setColor(Ya.a.i(this, Ua.a.f52734l, Ua.a.f52731i, getBackgroundOverlayColorAlpha()));
            if (this.f56105f == null) {
                return C2429a.l(gradientDrawable);
            }
            Drawable l10 = C2429a.l(gradientDrawable);
            C2429a.i(l10, this.f56105f);
            return l10;
        }

        private void b(ViewGroup.MarginLayoutParams marginLayoutParams) {
            this.f56107h = new Rect(marginLayoutParams.leftMargin, marginLayoutParams.topMargin, marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
        }

        private void setBaseTransientBottomBar(BaseTransientBottomBar baseTransientBottomBar) {
        }

        /* access modifiers changed from: package-private */
        public float getActionTextColorAlpha() {
            return this.f56102c;
        }

        /* access modifiers changed from: package-private */
        public int getAnimationMode() {
            return this.f56100a;
        }

        /* access modifiers changed from: package-private */
        public float getBackgroundOverlayColorAlpha() {
            return this.f56101b;
        }

        /* access modifiers changed from: package-private */
        public int getMaxInlineActionWidth() {
            return this.f56104e;
        }

        /* access modifiers changed from: package-private */
        public int getMaxWidth() {
            return this.f56103d;
        }

        /* access modifiers changed from: protected */
        public void onAttachedToWindow() {
            super.onAttachedToWindow();
            C1680b0.l0(this);
        }

        /* access modifiers changed from: protected */
        public void onDetachedFromWindow() {
            super.onDetachedFromWindow();
        }

        /* access modifiers changed from: protected */
        public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
            super.onLayout(z10, i10, i11, i12, i13);
        }

        /* access modifiers changed from: protected */
        public void onMeasure(int i10, int i11) {
            int i12;
            super.onMeasure(i10, i11);
            if (this.f56103d > 0 && getMeasuredWidth() > (i12 = this.f56103d)) {
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(i12, 1073741824), i11);
            }
        }

        /* access modifiers changed from: package-private */
        public void setAnimationMode(int i10) {
            this.f56100a = i10;
        }

        public void setBackground(Drawable drawable) {
            setBackgroundDrawable(drawable);
        }

        public void setBackgroundDrawable(Drawable drawable) {
            if (!(drawable == null || this.f56105f == null)) {
                drawable = C2429a.l(drawable.mutate());
                C2429a.i(drawable, this.f56105f);
                C2429a.j(drawable, this.f56106g);
            }
            super.setBackgroundDrawable(drawable);
        }

        public void setBackgroundTintList(ColorStateList colorStateList) {
            this.f56105f = colorStateList;
            if (getBackground() != null) {
                Drawable l10 = C2429a.l(getBackground().mutate());
                C2429a.i(l10, colorStateList);
                C2429a.j(l10, this.f56106g);
                if (l10 != getBackground()) {
                    super.setBackgroundDrawable(l10);
                }
            }
        }

        public void setBackgroundTintMode(PorterDuff.Mode mode) {
            this.f56106g = mode;
            if (getBackground() != null) {
                Drawable l10 = C2429a.l(getBackground().mutate());
                C2429a.j(l10, mode);
                if (l10 != getBackground()) {
                    super.setBackgroundDrawable(l10);
                }
            }
        }

        public void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
            super.setLayoutParams(layoutParams);
            if (!this.f56108i && (layoutParams instanceof ViewGroup.MarginLayoutParams)) {
                b((ViewGroup.MarginLayoutParams) layoutParams);
            }
        }

        public void setOnClickListener(View.OnClickListener onClickListener) {
            View.OnTouchListener onTouchListener;
            if (onClickListener != null) {
                onTouchListener = null;
            } else {
                onTouchListener = f56099j;
            }
            setOnTouchListener(onTouchListener);
            super.setOnClickListener(onClickListener);
        }
    }
}
