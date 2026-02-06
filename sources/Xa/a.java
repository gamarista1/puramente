package Xa;

import Ua.i;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import androidx.appcompat.widget.C1568g;
import androidx.core.widget.c;
import com.google.android.material.internal.n;
import q1.C2429a;

public class a extends C1568g {

    /* renamed from: h  reason: collision with root package name */
    private static final int f53498h = i.f52921k;

    /* renamed from: i  reason: collision with root package name */
    private static final int[][] f53499i = {new int[]{16842910, 16842912}, new int[]{16842910, -16842912}, new int[]{-16842910, 16842912}, new int[]{-16842910, -16842912}};

    /* renamed from: e  reason: collision with root package name */
    private ColorStateList f53500e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f53501f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f53502g;

    public a(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, Ua.a.f52726d);
    }

    private ColorStateList getMaterialThemeColorsTintList() {
        if (this.f53500e == null) {
            int[][] iArr = f53499i;
            int[] iArr2 = new int[iArr.length];
            int d10 = Ya.a.d(this, Ua.a.f52729g);
            int d11 = Ya.a.d(this, Ua.a.f52734l);
            int d12 = Ya.a.d(this, Ua.a.f52731i);
            iArr2[0] = Ya.a.h(d11, d10, 1.0f);
            iArr2[1] = Ya.a.h(d11, d12, 0.54f);
            iArr2[2] = Ya.a.h(d11, d12, 0.38f);
            iArr2[3] = Ya.a.h(d11, d12, 0.38f);
            this.f53500e = new ColorStateList(iArr, iArr2);
        }
        return this.f53500e;
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f53501f && c.b(this) == null) {
            setUseMaterialThemeColors(true);
        }
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        Drawable a10;
        int i10;
        if (!this.f53502g || !TextUtils.isEmpty(getText()) || (a10 = c.a(this)) == null) {
            super.onDraw(canvas);
            return;
        }
        if (n.e(this)) {
            i10 = -1;
        } else {
            i10 = 1;
        }
        int width = ((getWidth() - a10.getIntrinsicWidth()) / 2) * i10;
        int save = canvas.save();
        canvas.translate((float) width, 0.0f);
        super.onDraw(canvas);
        canvas.restoreToCount(save);
        if (getBackground() != null) {
            Rect bounds = a10.getBounds();
            C2429a.f(getBackground(), bounds.left + width, bounds.top, bounds.right + width, bounds.bottom);
        }
    }

    public void setCenterIfNoTextEnabled(boolean z10) {
        this.f53502g = z10;
    }

    public void setUseMaterialThemeColors(boolean z10) {
        this.f53501f = z10;
        if (z10) {
            c.c(this, getMaterialThemeColorsTintList());
        } else {
            c.c(this, (ColorStateList) null);
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public a(android.content.Context r8, android.util.AttributeSet r9, int r10) {
        /*
            r7 = this;
            int r4 = f53498h
            android.content.Context r8 = jb.C5041a.c(r8, r9, r10, r4)
            r7.<init>(r8, r9, r10)
            android.content.Context r8 = r7.getContext()
            int[] r2 = Ua.j.f53138c3
            r6 = 0
            int[] r5 = new int[r6]
            r0 = r8
            r1 = r9
            r3 = r10
            android.content.res.TypedArray r9 = com.google.android.material.internal.l.h(r0, r1, r2, r3, r4, r5)
            int r10 = Ua.j.f53146d3
            boolean r10 = r9.hasValue(r10)
            if (r10 == 0) goto L_0x002a
            int r10 = Ua.j.f53146d3
            android.content.res.ColorStateList r8 = fb.C4982c.a(r8, r9, r10)
            androidx.core.widget.c.c(r7, r8)
        L_0x002a:
            int r8 = Ua.j.f53162f3
            boolean r8 = r9.getBoolean(r8, r6)
            r7.f53501f = r8
            int r8 = Ua.j.f53154e3
            r10 = 1
            boolean r8 = r9.getBoolean(r8, r10)
            r7.f53502g = r8
            r9.recycle()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: Xa.a.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }
}
