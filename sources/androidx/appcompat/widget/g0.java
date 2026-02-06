package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import j.C2115a;
import o1.h;

public class g0 {

    /* renamed from: a  reason: collision with root package name */
    private final Context f11902a;

    /* renamed from: b  reason: collision with root package name */
    private final TypedArray f11903b;

    /* renamed from: c  reason: collision with root package name */
    private TypedValue f11904c;

    private g0(Context context, TypedArray typedArray) {
        this.f11902a = context;
        this.f11903b = typedArray;
    }

    public static g0 t(Context context, int i10, int[] iArr) {
        return new g0(context, context.obtainStyledAttributes(i10, iArr));
    }

    public static g0 u(Context context, AttributeSet attributeSet, int[] iArr) {
        return new g0(context, context.obtainStyledAttributes(attributeSet, iArr));
    }

    public static g0 v(Context context, AttributeSet attributeSet, int[] iArr, int i10, int i11) {
        return new g0(context, context.obtainStyledAttributes(attributeSet, iArr, i10, i11));
    }

    public boolean a(int i10, boolean z10) {
        return this.f11903b.getBoolean(i10, z10);
    }

    public int b(int i10, int i11) {
        return this.f11903b.getColor(i10, i11);
    }

    public ColorStateList c(int i10) {
        int resourceId;
        ColorStateList a10;
        if (!this.f11903b.hasValue(i10) || (resourceId = this.f11903b.getResourceId(i10, 0)) == 0 || (a10 = C2115a.a(this.f11902a, resourceId)) == null) {
            return this.f11903b.getColorStateList(i10);
        }
        return a10;
    }

    public float d(int i10, float f10) {
        return this.f11903b.getDimension(i10, f10);
    }

    public int e(int i10, int i11) {
        return this.f11903b.getDimensionPixelOffset(i10, i11);
    }

    public int f(int i10, int i11) {
        return this.f11903b.getDimensionPixelSize(i10, i11);
    }

    public Drawable g(int i10) {
        int resourceId;
        if (!this.f11903b.hasValue(i10) || (resourceId = this.f11903b.getResourceId(i10, 0)) == 0) {
            return this.f11903b.getDrawable(i10);
        }
        return C2115a.b(this.f11902a, resourceId);
    }

    public Drawable h(int i10) {
        int resourceId;
        if (!this.f11903b.hasValue(i10) || (resourceId = this.f11903b.getResourceId(i10, 0)) == 0) {
            return null;
        }
        return C1572k.b().d(this.f11902a, resourceId, true);
    }

    public float i(int i10, float f10) {
        return this.f11903b.getFloat(i10, f10);
    }

    public Typeface j(int i10, int i11, h.e eVar) {
        int resourceId = this.f11903b.getResourceId(i10, 0);
        if (resourceId == 0) {
            return null;
        }
        if (this.f11904c == null) {
            this.f11904c = new TypedValue();
        }
        return h.i(this.f11902a, resourceId, this.f11904c, i11, eVar);
    }

    public int k(int i10, int i11) {
        return this.f11903b.getInt(i10, i11);
    }

    public int l(int i10, int i11) {
        return this.f11903b.getInteger(i10, i11);
    }

    public int m(int i10, int i11) {
        return this.f11903b.getLayoutDimension(i10, i11);
    }

    public int n(int i10, int i11) {
        return this.f11903b.getResourceId(i10, i11);
    }

    public String o(int i10) {
        return this.f11903b.getString(i10);
    }

    public CharSequence p(int i10) {
        return this.f11903b.getText(i10);
    }

    public CharSequence[] q(int i10) {
        return this.f11903b.getTextArray(i10);
    }

    public TypedArray r() {
        return this.f11903b;
    }

    public boolean s(int i10) {
        return this.f11903b.hasValue(i10);
    }

    public TypedValue w(int i10) {
        return this.f11903b.peekValue(i10);
    }

    public void x() {
        this.f11903b.recycle();
    }
}
