package androidx.cardview.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import t.C2598a;
import t.C2599b;
import t.c;
import t.d;

public class CardView extends FrameLayout {

    /* renamed from: h  reason: collision with root package name */
    private static final int[] f12052h = {16842801};

    /* renamed from: i  reason: collision with root package name */
    private static final c f12053i;

    /* renamed from: a  reason: collision with root package name */
    private boolean f12054a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f12055b;

    /* renamed from: c  reason: collision with root package name */
    int f12056c;

    /* renamed from: d  reason: collision with root package name */
    int f12057d;

    /* renamed from: e  reason: collision with root package name */
    final Rect f12058e;

    /* renamed from: f  reason: collision with root package name */
    final Rect f12059f;

    /* renamed from: g  reason: collision with root package name */
    private final b f12060g;

    class a implements b {

        /* renamed from: a  reason: collision with root package name */
        private Drawable f12061a;

        a() {
        }

        public void a(Drawable drawable) {
            this.f12061a = drawable;
            CardView.this.setBackgroundDrawable(drawable);
        }

        public boolean b() {
            return CardView.this.getUseCompatPadding();
        }

        public Drawable c() {
            return this.f12061a;
        }

        public void d(int i10, int i11, int i12, int i13) {
            CardView.this.f12059f.set(i10, i11, i12, i13);
            CardView cardView = CardView.this;
            Rect rect = cardView.f12058e;
            CardView.super.setPadding(i10 + rect.left, i11 + rect.top, i12 + rect.right, i13 + rect.bottom);
        }

        public boolean e() {
            return CardView.this.getPreventCornerOverlap();
        }

        public View f() {
            return CardView.this;
        }
    }

    static {
        a aVar = new a();
        f12053i = aVar;
        aVar.k();
    }

    public CardView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C2598a.f25909a);
    }

    public ColorStateList getCardBackgroundColor() {
        return f12053i.e(this.f12060g);
    }

    public float getCardElevation() {
        return f12053i.i(this.f12060g);
    }

    public int getContentPaddingBottom() {
        return this.f12058e.bottom;
    }

    public int getContentPaddingLeft() {
        return this.f12058e.left;
    }

    public int getContentPaddingRight() {
        return this.f12058e.right;
    }

    public int getContentPaddingTop() {
        return this.f12058e.top;
    }

    public float getMaxCardElevation() {
        return f12053i.d(this.f12060g);
    }

    public boolean getPreventCornerOverlap() {
        return this.f12055b;
    }

    public float getRadius() {
        return f12053i.b(this.f12060g);
    }

    public boolean getUseCompatPadding() {
        return this.f12054a;
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i10, int i11) {
        c cVar = f12053i;
        if (!(cVar instanceof a)) {
            int mode = View.MeasureSpec.getMode(i10);
            if (mode == Integer.MIN_VALUE || mode == 1073741824) {
                i10 = View.MeasureSpec.makeMeasureSpec(Math.max((int) Math.ceil((double) cVar.l(this.f12060g)), View.MeasureSpec.getSize(i10)), mode);
            }
            int mode2 = View.MeasureSpec.getMode(i11);
            if (mode2 == Integer.MIN_VALUE || mode2 == 1073741824) {
                i11 = View.MeasureSpec.makeMeasureSpec(Math.max((int) Math.ceil((double) cVar.f(this.f12060g)), View.MeasureSpec.getSize(i11)), mode2);
            }
            super.onMeasure(i10, i11);
            return;
        }
        super.onMeasure(i10, i11);
    }

    public void setCardBackgroundColor(int i10) {
        f12053i.m(this.f12060g, ColorStateList.valueOf(i10));
    }

    public void setCardElevation(float f10) {
        f12053i.c(this.f12060g, f10);
    }

    public void setMaxCardElevation(float f10) {
        f12053i.n(this.f12060g, f10);
    }

    public void setMinimumHeight(int i10) {
        this.f12057d = i10;
        super.setMinimumHeight(i10);
    }

    public void setMinimumWidth(int i10) {
        this.f12056c = i10;
        super.setMinimumWidth(i10);
    }

    public void setPadding(int i10, int i11, int i12, int i13) {
    }

    public void setPaddingRelative(int i10, int i11, int i12, int i13) {
    }

    public void setPreventCornerOverlap(boolean z10) {
        if (z10 != this.f12055b) {
            this.f12055b = z10;
            f12053i.g(this.f12060g);
        }
    }

    public void setRadius(float f10) {
        f12053i.a(this.f12060g, f10);
    }

    public void setUseCompatPadding(boolean z10) {
        if (this.f12054a != z10) {
            this.f12054a = z10;
            f12053i.j(this.f12060g);
        }
    }

    public CardView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        int i11;
        ColorStateList valueOf;
        Rect rect = new Rect();
        this.f12058e = rect;
        this.f12059f = new Rect();
        a aVar = new a();
        this.f12060g = aVar;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, d.f25913a, i10, c.f25912a);
        if (obtainStyledAttributes.hasValue(d.f25916d)) {
            valueOf = obtainStyledAttributes.getColorStateList(d.f25916d);
        } else {
            TypedArray obtainStyledAttributes2 = getContext().obtainStyledAttributes(f12052h);
            int color = obtainStyledAttributes2.getColor(0, 0);
            obtainStyledAttributes2.recycle();
            float[] fArr = new float[3];
            Color.colorToHSV(color, fArr);
            if (fArr[2] > 0.5f) {
                i11 = getResources().getColor(C2599b.f25911b);
            } else {
                i11 = getResources().getColor(C2599b.f25910a);
            }
            valueOf = ColorStateList.valueOf(i11);
        }
        ColorStateList colorStateList = valueOf;
        float dimension = obtainStyledAttributes.getDimension(d.f25917e, 0.0f);
        float dimension2 = obtainStyledAttributes.getDimension(d.f25918f, 0.0f);
        float dimension3 = obtainStyledAttributes.getDimension(d.f25919g, 0.0f);
        this.f12054a = obtainStyledAttributes.getBoolean(d.f25921i, false);
        this.f12055b = obtainStyledAttributes.getBoolean(d.f25920h, true);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(d.f25922j, 0);
        rect.left = obtainStyledAttributes.getDimensionPixelSize(d.f25924l, dimensionPixelSize);
        rect.top = obtainStyledAttributes.getDimensionPixelSize(d.f25926n, dimensionPixelSize);
        rect.right = obtainStyledAttributes.getDimensionPixelSize(d.f25925m, dimensionPixelSize);
        rect.bottom = obtainStyledAttributes.getDimensionPixelSize(d.f25923k, dimensionPixelSize);
        float f10 = dimension2 > dimension3 ? dimension2 : dimension3;
        this.f12056c = obtainStyledAttributes.getDimensionPixelSize(d.f25914b, 0);
        this.f12057d = obtainStyledAttributes.getDimensionPixelSize(d.f25915c, 0);
        obtainStyledAttributes.recycle();
        f12053i.h(aVar, context, colorStateList, dimension, dimension2, f10);
    }

    public void setCardBackgroundColor(ColorStateList colorStateList) {
        f12053i.m(this.f12060g, colorStateList);
    }
}
