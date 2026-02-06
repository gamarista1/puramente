package eb;

import Ua.a;
import Ua.i;
import android.content.Context;
import android.content.res.ColorStateList;
import android.util.AttributeSet;
import androidx.appcompat.widget.C1581u;
import androidx.core.widget.c;

/* renamed from: eb.a  reason: case insensitive filesystem */
public class C4948a extends C1581u {

    /* renamed from: g  reason: collision with root package name */
    private static final int f60065g = i.f52922l;

    /* renamed from: h  reason: collision with root package name */
    private static final int[][] f60066h = {new int[]{16842910, 16842912}, new int[]{16842910, -16842912}, new int[]{-16842910, 16842912}, new int[]{-16842910, -16842912}};

    /* renamed from: e  reason: collision with root package name */
    private ColorStateList f60067e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f60068f;

    public C4948a(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, a.f52714B);
    }

    private ColorStateList getMaterialThemeColorsTintList() {
        if (this.f60067e == null) {
            int d10 = Ya.a.d(this, a.f52729g);
            int d11 = Ya.a.d(this, a.f52731i);
            int d12 = Ya.a.d(this, a.f52734l);
            int[][] iArr = f60066h;
            int[] iArr2 = new int[iArr.length];
            iArr2[0] = Ya.a.h(d12, d10, 1.0f);
            iArr2[1] = Ya.a.h(d12, d11, 0.54f);
            iArr2[2] = Ya.a.h(d12, d11, 0.38f);
            iArr2[3] = Ya.a.h(d12, d11, 0.38f);
            this.f60067e = new ColorStateList(iArr, iArr2);
        }
        return this.f60067e;
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f60068f && c.b(this) == null) {
            setUseMaterialThemeColors(true);
        }
    }

    public void setUseMaterialThemeColors(boolean z10) {
        this.f60068f = z10;
        if (z10) {
            c.c(this, getMaterialThemeColorsTintList());
        } else {
            c.c(this, (ColorStateList) null);
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C4948a(android.content.Context r8, android.util.AttributeSet r9, int r10) {
        /*
            r7 = this;
            int r4 = f60065g
            android.content.Context r8 = jb.C5041a.c(r8, r9, r10, r4)
            r7.<init>(r8, r9, r10)
            android.content.Context r8 = r7.getContext()
            int[] r2 = Ua.j.f53210l3
            r6 = 0
            int[] r5 = new int[r6]
            r0 = r8
            r1 = r9
            r3 = r10
            android.content.res.TypedArray r9 = com.google.android.material.internal.l.h(r0, r1, r2, r3, r4, r5)
            int r10 = Ua.j.f53218m3
            boolean r10 = r9.hasValue(r10)
            if (r10 == 0) goto L_0x002a
            int r10 = Ua.j.f53218m3
            android.content.res.ColorStateList r8 = fb.C4982c.a(r8, r9, r10)
            androidx.core.widget.c.c(r7, r8)
        L_0x002a:
            int r8 = Ua.j.f53226n3
            boolean r8 = r9.getBoolean(r8, r6)
            r7.f60068f = r8
            r9.recycle()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: eb.C4948a.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }
}
