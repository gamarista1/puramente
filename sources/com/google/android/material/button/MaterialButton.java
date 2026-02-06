package com.google.android.material.button;

import Ua.i;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.session.c;
import android.text.Layout;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import android.widget.Checkable;
import android.widget.CompoundButton;
import androidx.appcompat.widget.C1567f;
import androidx.core.view.C1680b0;
import ib.C5021h;
import ib.C5024k;
import ib.n;
import j.C2115a;
import java.util.Iterator;
import java.util.LinkedHashSet;
import q1.C2429a;

public class MaterialButton extends C1567f implements Checkable, n {

    /* renamed from: q  reason: collision with root package name */
    private static final int[] f55621q = {16842911};

    /* renamed from: r  reason: collision with root package name */
    private static final int[] f55622r = {16842912};

    /* renamed from: s  reason: collision with root package name */
    private static final int f55623s = i.f52918h;

    /* renamed from: d  reason: collision with root package name */
    private final a f55624d;

    /* renamed from: e  reason: collision with root package name */
    private final LinkedHashSet f55625e;

    /* renamed from: f  reason: collision with root package name */
    private a f55626f;

    /* renamed from: g  reason: collision with root package name */
    private PorterDuff.Mode f55627g;

    /* renamed from: h  reason: collision with root package name */
    private ColorStateList f55628h;

    /* renamed from: i  reason: collision with root package name */
    private Drawable f55629i;

    /* renamed from: j  reason: collision with root package name */
    private int f55630j;

    /* renamed from: k  reason: collision with root package name */
    private int f55631k;

    /* renamed from: l  reason: collision with root package name */
    private int f55632l;

    /* renamed from: m  reason: collision with root package name */
    private int f55633m;

    /* renamed from: n  reason: collision with root package name */
    private boolean f55634n;

    /* renamed from: o  reason: collision with root package name */
    private boolean f55635o;

    /* renamed from: p  reason: collision with root package name */
    private int f55636p;

    interface a {
        void a(MaterialButton materialButton, boolean z10);
    }

    static class b extends F1.a {
        public static final Parcelable.Creator<b> CREATOR = new a();

        /* renamed from: c  reason: collision with root package name */
        boolean f55637c;

        class a implements Parcelable.ClassLoaderCreator {
            a() {
            }

            /* renamed from: a */
            public b createFromParcel(Parcel parcel) {
                return new b(parcel, (ClassLoader) null);
            }

            /* renamed from: b */
            public b createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new b(parcel, classLoader);
            }

            /* renamed from: c */
            public b[] newArray(int i10) {
                return new b[i10];
            }
        }

        public b(Parcelable parcelable) {
            super(parcelable);
        }

        private void b(Parcel parcel) {
            boolean z10 = true;
            if (parcel.readInt() != 1) {
                z10 = false;
            }
            this.f55637c = z10;
        }

        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeInt(this.f55637c ? 1 : 0);
        }

        public b(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            if (classLoader == null) {
                getClass().getClassLoader();
            }
            b(parcel);
        }
    }

    public MaterialButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, Ua.a.f52740r);
    }

    private boolean b() {
        int i10 = this.f55636p;
        if (i10 == 3 || i10 == 4) {
            return true;
        }
        return false;
    }

    private boolean c() {
        int i10 = this.f55636p;
        if (i10 == 1 || i10 == 2) {
            return true;
        }
        return false;
    }

    private boolean d() {
        int i10 = this.f55636p;
        if (i10 == 16 || i10 == 32) {
            return true;
        }
        return false;
    }

    private boolean e() {
        if (C1680b0.A(this) == 1) {
            return true;
        }
        return false;
    }

    private boolean f() {
        a aVar = this.f55624d;
        if (aVar == null || aVar.o()) {
            return false;
        }
        return true;
    }

    private void g() {
        if (c()) {
            androidx.core.widget.i.i(this, this.f55629i, (Drawable) null, (Drawable) null, (Drawable) null);
        } else if (b()) {
            androidx.core.widget.i.i(this, (Drawable) null, (Drawable) null, this.f55629i, (Drawable) null);
        } else if (d()) {
            androidx.core.widget.i.i(this, (Drawable) null, this.f55629i, (Drawable) null, (Drawable) null);
        }
    }

    private String getA11yClassName() {
        Class cls;
        if (a()) {
            cls = CompoundButton.class;
        } else {
            cls = Button.class;
        }
        return cls.getName();
    }

    private Layout.Alignment getActualTextAlignment() {
        int textAlignment = getTextAlignment();
        if (textAlignment == 1) {
            return getGravityTextAlignment();
        }
        if (textAlignment == 6 || textAlignment == 3) {
            return Layout.Alignment.ALIGN_OPPOSITE;
        }
        if (textAlignment != 4) {
            return Layout.Alignment.ALIGN_NORMAL;
        }
        return Layout.Alignment.ALIGN_CENTER;
    }

    private Layout.Alignment getGravityTextAlignment() {
        int gravity = getGravity() & 8388615;
        if (gravity == 1) {
            return Layout.Alignment.ALIGN_CENTER;
        }
        if (gravity == 5 || gravity == 8388613) {
            return Layout.Alignment.ALIGN_OPPOSITE;
        }
        return Layout.Alignment.ALIGN_NORMAL;
    }

    private int getTextHeight() {
        TextPaint paint = getPaint();
        String charSequence = getText().toString();
        if (getTransformationMethod() != null) {
            charSequence = getTransformationMethod().getTransformation(charSequence, this).toString();
        }
        Rect rect = new Rect();
        paint.getTextBounds(charSequence, 0, charSequence.length(), rect);
        return Math.min(rect.height(), getLayout().getHeight());
    }

    private int getTextWidth() {
        TextPaint paint = getPaint();
        String charSequence = getText().toString();
        if (getTransformationMethod() != null) {
            charSequence = getTransformationMethod().getTransformation(charSequence, this).toString();
        }
        return Math.min((int) paint.measureText(charSequence), getLayout().getEllipsizedWidth());
    }

    private void h(boolean z10) {
        Drawable drawable = this.f55629i;
        if (drawable != null) {
            Drawable mutate = C2429a.l(drawable).mutate();
            this.f55629i = mutate;
            C2429a.i(mutate, this.f55628h);
            PorterDuff.Mode mode = this.f55627g;
            if (mode != null) {
                C2429a.j(this.f55629i, mode);
            }
            int i10 = this.f55630j;
            if (i10 == 0) {
                i10 = this.f55629i.getIntrinsicWidth();
            }
            int i11 = this.f55630j;
            if (i11 == 0) {
                i11 = this.f55629i.getIntrinsicHeight();
            }
            Drawable drawable2 = this.f55629i;
            int i12 = this.f55631k;
            int i13 = this.f55632l;
            drawable2.setBounds(i12, i13, i10 + i12, i11 + i13);
            this.f55629i.setVisible(true, z10);
        }
        if (z10) {
            g();
            return;
        }
        Drawable[] a10 = androidx.core.widget.i.a(this);
        Drawable drawable3 = a10[0];
        Drawable drawable4 = a10[1];
        Drawable drawable5 = a10[2];
        if ((c() && drawable3 != this.f55629i) || ((b() && drawable5 != this.f55629i) || (d() && drawable4 != this.f55629i))) {
            g();
        }
    }

    private void i(int i10, int i11) {
        if (this.f55629i != null && getLayout() != null) {
            if (c() || b()) {
                this.f55632l = 0;
                Layout.Alignment actualTextAlignment = getActualTextAlignment();
                int i12 = this.f55636p;
                boolean z10 = true;
                if (i12 == 1 || i12 == 3 || ((i12 == 2 && actualTextAlignment == Layout.Alignment.ALIGN_NORMAL) || (i12 == 4 && actualTextAlignment == Layout.Alignment.ALIGN_OPPOSITE))) {
                    this.f55631k = 0;
                    h(false);
                    return;
                }
                int i13 = this.f55630j;
                if (i13 == 0) {
                    i13 = this.f55629i.getIntrinsicWidth();
                }
                int textWidth = ((((i10 - getTextWidth()) - C1680b0.E(this)) - i13) - this.f55633m) - C1680b0.F(this);
                if (actualTextAlignment == Layout.Alignment.ALIGN_CENTER) {
                    textWidth /= 2;
                }
                boolean e10 = e();
                if (this.f55636p != 4) {
                    z10 = false;
                }
                if (e10 != z10) {
                    textWidth = -textWidth;
                }
                if (this.f55631k != textWidth) {
                    this.f55631k = textWidth;
                    h(false);
                }
            } else if (d()) {
                this.f55631k = 0;
                if (this.f55636p == 16) {
                    this.f55632l = 0;
                    h(false);
                    return;
                }
                int i14 = this.f55630j;
                if (i14 == 0) {
                    i14 = this.f55629i.getIntrinsicHeight();
                }
                int textHeight = (((((i11 - getTextHeight()) - getPaddingTop()) - i14) - this.f55633m) - getPaddingBottom()) / 2;
                if (this.f55632l != textHeight) {
                    this.f55632l = textHeight;
                    h(false);
                }
            }
        }
    }

    public boolean a() {
        a aVar = this.f55624d;
        if (aVar == null || !aVar.p()) {
            return false;
        }
        return true;
    }

    public ColorStateList getBackgroundTintList() {
        return getSupportBackgroundTintList();
    }

    public PorterDuff.Mode getBackgroundTintMode() {
        return getSupportBackgroundTintMode();
    }

    public int getCornerRadius() {
        if (f()) {
            return this.f55624d.b();
        }
        return 0;
    }

    public Drawable getIcon() {
        return this.f55629i;
    }

    public int getIconGravity() {
        return this.f55636p;
    }

    public int getIconPadding() {
        return this.f55633m;
    }

    public int getIconSize() {
        return this.f55630j;
    }

    public ColorStateList getIconTint() {
        return this.f55628h;
    }

    public PorterDuff.Mode getIconTintMode() {
        return this.f55627g;
    }

    public int getInsetBottom() {
        return this.f55624d.c();
    }

    public int getInsetTop() {
        return this.f55624d.d();
    }

    public ColorStateList getRippleColor() {
        if (f()) {
            return this.f55624d.h();
        }
        return null;
    }

    public C5024k getShapeAppearanceModel() {
        if (f()) {
            return this.f55624d.i();
        }
        throw new IllegalStateException("Attempted to get ShapeAppearanceModel from a MaterialButton which has an overwritten background.");
    }

    public ColorStateList getStrokeColor() {
        if (f()) {
            return this.f55624d.j();
        }
        return null;
    }

    public int getStrokeWidth() {
        if (f()) {
            return this.f55624d.k();
        }
        return 0;
    }

    public ColorStateList getSupportBackgroundTintList() {
        if (f()) {
            return this.f55624d.l();
        }
        return super.getSupportBackgroundTintList();
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        if (f()) {
            return this.f55624d.m();
        }
        return super.getSupportBackgroundTintMode();
    }

    public boolean isChecked() {
        return this.f55634n;
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (f()) {
            C5021h.f(this, this.f55624d.f());
        }
    }

    /* access modifiers changed from: protected */
    public int[] onCreateDrawableState(int i10) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i10 + 2);
        if (a()) {
            View.mergeDrawableStates(onCreateDrawableState, f55621q);
        }
        if (isChecked()) {
            View.mergeDrawableStates(onCreateDrawableState, f55622r);
        }
        return onCreateDrawableState;
    }

    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(getA11yClassName());
        accessibilityEvent.setChecked(isChecked());
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(getA11yClassName());
        accessibilityNodeInfo.setCheckable(a());
        accessibilityNodeInfo.setChecked(isChecked());
        accessibilityNodeInfo.setClickable(isClickable());
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        i(getMeasuredWidth(), getMeasuredHeight());
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof b)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        b bVar = (b) parcelable;
        super.onRestoreInstanceState(bVar.a());
        setChecked(bVar.f55637c);
    }

    public Parcelable onSaveInstanceState() {
        b bVar = new b(super.onSaveInstanceState());
        bVar.f55637c = this.f55634n;
        return bVar;
    }

    /* access modifiers changed from: protected */
    public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        super.onTextChanged(charSequence, i10, i11, i12);
        i(getMeasuredWidth(), getMeasuredHeight());
    }

    public boolean performClick() {
        toggle();
        return super.performClick();
    }

    public void refreshDrawableState() {
        super.refreshDrawableState();
        if (this.f55629i != null) {
            if (this.f55629i.setState(getDrawableState())) {
                invalidate();
            }
        }
    }

    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    public void setBackgroundColor(int i10) {
        if (f()) {
            this.f55624d.r(i10);
        } else {
            super.setBackgroundColor(i10);
        }
    }

    public void setBackgroundDrawable(Drawable drawable) {
        if (!f()) {
            super.setBackgroundDrawable(drawable);
        } else if (drawable != getBackground()) {
            Log.w("MaterialButton", "MaterialButton manages its own background to control elevation, shape, color and states. Consider using backgroundTint, shapeAppearance and other attributes where available. A custom background will ignore these attributes and you should consider handling interaction states such as pressed, focused and disabled");
            this.f55624d.s();
            super.setBackgroundDrawable(drawable);
        } else {
            getBackground().setState(drawable.getState());
        }
    }

    public void setBackgroundResource(int i10) {
        Drawable drawable;
        if (i10 != 0) {
            drawable = C2115a.b(getContext(), i10);
        } else {
            drawable = null;
        }
        setBackgroundDrawable(drawable);
    }

    public void setBackgroundTintList(ColorStateList colorStateList) {
        setSupportBackgroundTintList(colorStateList);
    }

    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        setSupportBackgroundTintMode(mode);
    }

    public void setCheckable(boolean z10) {
        if (f()) {
            this.f55624d.t(z10);
        }
    }

    public void setChecked(boolean z10) {
        if (a() && isEnabled() && this.f55634n != z10) {
            this.f55634n = z10;
            refreshDrawableState();
            if (getParent() instanceof MaterialButtonToggleGroup) {
                ((MaterialButtonToggleGroup) getParent()).n(this, this.f55634n);
            }
            if (!this.f55635o) {
                this.f55635o = true;
                Iterator it = this.f55625e.iterator();
                if (!it.hasNext()) {
                    this.f55635o = false;
                } else {
                    c.a(it.next());
                    throw null;
                }
            }
        }
    }

    public void setCornerRadius(int i10) {
        if (f()) {
            this.f55624d.u(i10);
        }
    }

    public void setCornerRadiusResource(int i10) {
        if (f()) {
            setCornerRadius(getResources().getDimensionPixelSize(i10));
        }
    }

    public void setElevation(float f10) {
        super.setElevation(f10);
        if (f()) {
            this.f55624d.f().V(f10);
        }
    }

    public void setIcon(Drawable drawable) {
        if (this.f55629i != drawable) {
            this.f55629i = drawable;
            h(true);
            i(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void setIconGravity(int i10) {
        if (this.f55636p != i10) {
            this.f55636p = i10;
            i(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void setIconPadding(int i10) {
        if (this.f55633m != i10) {
            this.f55633m = i10;
            setCompoundDrawablePadding(i10);
        }
    }

    public void setIconResource(int i10) {
        Drawable drawable;
        if (i10 != 0) {
            drawable = C2115a.b(getContext(), i10);
        } else {
            drawable = null;
        }
        setIcon(drawable);
    }

    public void setIconSize(int i10) {
        if (i10 < 0) {
            throw new IllegalArgumentException("iconSize cannot be less than 0");
        } else if (this.f55630j != i10) {
            this.f55630j = i10;
            h(true);
        }
    }

    public void setIconTint(ColorStateList colorStateList) {
        if (this.f55628h != colorStateList) {
            this.f55628h = colorStateList;
            h(false);
        }
    }

    public void setIconTintMode(PorterDuff.Mode mode) {
        if (this.f55627g != mode) {
            this.f55627g = mode;
            h(false);
        }
    }

    public void setIconTintResource(int i10) {
        setIconTint(C2115a.a(getContext(), i10));
    }

    public void setInsetBottom(int i10) {
        this.f55624d.v(i10);
    }

    public void setInsetTop(int i10) {
        this.f55624d.w(i10);
    }

    /* access modifiers changed from: package-private */
    public void setInternalBackground(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
    }

    /* access modifiers changed from: package-private */
    public void setOnPressedChangeListenerInternal(a aVar) {
        this.f55626f = aVar;
    }

    public void setPressed(boolean z10) {
        a aVar = this.f55626f;
        if (aVar != null) {
            aVar.a(this, z10);
        }
        super.setPressed(z10);
    }

    public void setRippleColor(ColorStateList colorStateList) {
        if (f()) {
            this.f55624d.x(colorStateList);
        }
    }

    public void setRippleColorResource(int i10) {
        if (f()) {
            setRippleColor(C2115a.a(getContext(), i10));
        }
    }

    public void setShapeAppearanceModel(C5024k kVar) {
        if (f()) {
            this.f55624d.y(kVar);
            return;
        }
        throw new IllegalStateException("Attempted to set ShapeAppearanceModel on a MaterialButton which has an overwritten background.");
    }

    /* access modifiers changed from: package-private */
    public void setShouldDrawSurfaceColorStroke(boolean z10) {
        if (f()) {
            this.f55624d.z(z10);
        }
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        if (f()) {
            this.f55624d.A(colorStateList);
        }
    }

    public void setStrokeColorResource(int i10) {
        if (f()) {
            setStrokeColor(C2115a.a(getContext(), i10));
        }
    }

    public void setStrokeWidth(int i10) {
        if (f()) {
            this.f55624d.B(i10);
        }
    }

    public void setStrokeWidthResource(int i10) {
        if (f()) {
            setStrokeWidth(getResources().getDimensionPixelSize(i10));
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        if (f()) {
            this.f55624d.C(colorStateList);
        } else {
            super.setSupportBackgroundTintList(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        if (f()) {
            this.f55624d.D(mode);
        } else {
            super.setSupportBackgroundTintMode(mode);
        }
    }

    public void setTextAlignment(int i10) {
        super.setTextAlignment(i10);
        i(getMeasuredWidth(), getMeasuredHeight());
    }

    public void toggle() {
        setChecked(!this.f55634n);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public MaterialButton(android.content.Context r9, android.util.AttributeSet r10, int r11) {
        /*
            r8 = this;
            int r6 = f55623s
            android.content.Context r9 = jb.C5041a.c(r9, r10, r11, r6)
            r8.<init>(r9, r10, r11)
            java.util.LinkedHashSet r9 = new java.util.LinkedHashSet
            r9.<init>()
            r8.f55625e = r9
            r9 = 0
            r8.f55634n = r9
            r8.f55635o = r9
            android.content.Context r7 = r8.getContext()
            int[] r2 = Ua.j.f53193j2
            int[] r5 = new int[r9]
            r0 = r7
            r1 = r10
            r3 = r11
            r4 = r6
            android.content.res.TypedArray r0 = com.google.android.material.internal.l.h(r0, r1, r2, r3, r4, r5)
            int r1 = Ua.j.f53297w2
            int r1 = r0.getDimensionPixelSize(r1, r9)
            r8.f55633m = r1
            int r1 = Ua.j.f53321z2
            r2 = -1
            int r1 = r0.getInt(r1, r2)
            android.graphics.PorterDuff$Mode r2 = android.graphics.PorterDuff.Mode.SRC_IN
            android.graphics.PorterDuff$Mode r1 = com.google.android.material.internal.n.f(r1, r2)
            r8.f55627g = r1
            android.content.Context r1 = r8.getContext()
            int r2 = Ua.j.f53313y2
            android.content.res.ColorStateList r1 = fb.C4982c.a(r1, r0, r2)
            r8.f55628h = r1
            android.content.Context r1 = r8.getContext()
            int r2 = Ua.j.f53281u2
            android.graphics.drawable.Drawable r1 = fb.C4982c.d(r1, r0, r2)
            r8.f55629i = r1
            int r1 = Ua.j.f53289v2
            r2 = 1
            int r1 = r0.getInteger(r1, r2)
            r8.f55636p = r1
            int r1 = Ua.j.f53305x2
            int r1 = r0.getDimensionPixelSize(r1, r9)
            r8.f55630j = r1
            ib.k$b r10 = ib.C5024k.e(r7, r10, r11, r6)
            ib.k r10 = r10.m()
            com.google.android.material.button.a r11 = new com.google.android.material.button.a
            r11.<init>(r8, r10)
            r8.f55624d = r11
            r11.q(r0)
            r0.recycle()
            int r10 = r8.f55633m
            r8.setCompoundDrawablePadding(r10)
            android.graphics.drawable.Drawable r10 = r8.f55629i
            if (r10 == 0) goto L_0x0084
            r9 = r2
        L_0x0084:
            r8.h(r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.button.MaterialButton.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }
}
