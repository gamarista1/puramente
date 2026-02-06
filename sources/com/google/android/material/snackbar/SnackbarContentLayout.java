package com.google.android.material.snackbar;

import Ua.c;
import Ua.e;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.view.C1680b0;

public class SnackbarContentLayout extends LinearLayout {

    /* renamed from: a  reason: collision with root package name */
    private TextView f56109a;

    /* renamed from: b  reason: collision with root package name */
    private Button f56110b;

    /* renamed from: c  reason: collision with root package name */
    private int f56111c;

    public SnackbarContentLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    private static void a(View view, int i10, int i11) {
        if (C1680b0.U(view)) {
            C1680b0.D0(view, C1680b0.F(view), i10, C1680b0.E(view), i11);
        } else {
            view.setPadding(view.getPaddingLeft(), i10, view.getPaddingRight(), i11);
        }
    }

    private boolean b(int i10, int i11, int i12) {
        boolean z10;
        if (i10 != getOrientation()) {
            setOrientation(i10);
            z10 = true;
        } else {
            z10 = false;
        }
        if (this.f56109a.getPaddingTop() == i11 && this.f56109a.getPaddingBottom() == i12) {
            return z10;
        }
        a(this.f56109a, i11, i12);
        return true;
    }

    public Button getActionView() {
        return this.f56110b;
    }

    public TextView getMessageView() {
        return this.f56109a;
    }

    /* access modifiers changed from: protected */
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f56109a = (TextView) findViewById(e.f52821Q);
        this.f56110b = (Button) findViewById(e.f52820P);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i10, int i11) {
        boolean z10;
        super.onMeasure(i10, i11);
        if (getOrientation() != 1) {
            int dimensionPixelSize = getResources().getDimensionPixelSize(c.f52776e);
            int dimensionPixelSize2 = getResources().getDimensionPixelSize(c.f52775d);
            if (this.f56109a.getLayout().getLineCount() > 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!z10 || this.f56111c <= 0 || this.f56110b.getMeasuredWidth() <= this.f56111c) {
                if (!z10) {
                    dimensionPixelSize = dimensionPixelSize2;
                }
                if (!b(0, dimensionPixelSize, dimensionPixelSize)) {
                    return;
                }
            } else if (!b(1, dimensionPixelSize, dimensionPixelSize - dimensionPixelSize2)) {
                return;
            }
            super.onMeasure(i10, i11);
        }
    }

    public void setMaxInlineActionWidth(int i10) {
        this.f56111c = i10;
    }
}
