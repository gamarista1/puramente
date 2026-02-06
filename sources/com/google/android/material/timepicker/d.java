package com.google.android.material.timepicker;

import Ua.e;
import Ua.g;
import Ua.j;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.C1680b0;
import ib.C5020g;
import ib.C5022i;
import io.intercom.android.sdk.models.carousel.ActionType;

abstract class d extends ConstraintLayout {

    /* renamed from: A  reason: collision with root package name */
    private int f56405A;

    /* renamed from: B  reason: collision with root package name */
    private C5020g f56406B;

    /* renamed from: z  reason: collision with root package name */
    private final Runnable f56407z = new a();

    class a implements Runnable {
        a() {
        }

        public void run() {
            d.this.H();
        }
    }

    public d(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        LayoutInflater.from(context).inflate(g.f52862f, this);
        C1680b0.s0(this, D());
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, j.f53123a4, i10, 0);
        this.f56405A = obtainStyledAttributes.getDimensionPixelSize(j.f53131b4, 0);
        obtainStyledAttributes.recycle();
    }

    private Drawable D() {
        C5020g gVar = new C5020g();
        this.f56406B = gVar;
        gVar.U(new C5022i(0.5f));
        this.f56406B.W(ColorStateList.valueOf(-1));
        return this.f56406B;
    }

    private static boolean G(View view) {
        return ActionType.SKIP.equals(view.getTag());
    }

    private void I() {
        Handler handler = getHandler();
        if (handler != null) {
            handler.removeCallbacks(this.f56407z);
            handler.post(this.f56407z);
        }
    }

    public int E() {
        return this.f56405A;
    }

    public void F(int i10) {
        this.f56405A = i10;
        H();
    }

    /* access modifiers changed from: protected */
    public void H() {
        int childCount = getChildCount();
        int i10 = 1;
        for (int i11 = 0; i11 < childCount; i11++) {
            if (G(getChildAt(i11))) {
                i10++;
            }
        }
        androidx.constraintlayout.widget.d dVar = new androidx.constraintlayout.widget.d();
        dVar.p(this);
        float f10 = 0.0f;
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = getChildAt(i12);
            if (childAt.getId() != e.f52830b && !G(childAt)) {
                dVar.r(childAt.getId(), e.f52830b, this.f56405A, f10);
                f10 += 360.0f / ((float) (childCount - i10));
            }
        }
        dVar.i(this);
    }

    public void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i10, layoutParams);
        if (view.getId() == -1) {
            view.setId(C1680b0.k());
        }
        I();
    }

    /* access modifiers changed from: protected */
    public void onFinishInflate() {
        super.onFinishInflate();
        H();
    }

    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        I();
    }

    public void setBackgroundColor(int i10) {
        this.f56406B.W(ColorStateList.valueOf(i10));
    }
}
