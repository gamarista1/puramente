package com.google.android.material.chip;

import Ua.i;
import Ua.j;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Outline;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Bundle;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.PointerIcon;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.TextView;
import androidx.appcompat.widget.C1568g;
import androidx.core.view.C1677a;
import androidx.core.view.C1680b0;
import com.adjust.sdk.network.ErrorCodes;
import com.facebook.react.modules.appstate.AppStateModule;
import com.google.android.material.chip.a;
import com.google.android.material.internal.h;
import com.google.android.material.internal.l;
import fb.C4983d;
import fb.C4985f;
import gb.C4995b;
import ib.C5021h;
import ib.C5024k;
import ib.n;
import java.util.List;
import y1.C2930A;

public class Chip extends C1568g implements a.C0832a, n, h {

    /* renamed from: w  reason: collision with root package name */
    private static final int f55679w = i.f52920j;
    /* access modifiers changed from: private */

    /* renamed from: x  reason: collision with root package name */
    public static final Rect f55680x = new Rect();

    /* renamed from: y  reason: collision with root package name */
    private static final int[] f55681y = {16842913};

    /* renamed from: z  reason: collision with root package name */
    private static final int[] f55682z = {16842911};
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public a f55683e;

    /* renamed from: f  reason: collision with root package name */
    private InsetDrawable f55684f;

    /* renamed from: g  reason: collision with root package name */
    private RippleDrawable f55685g;
    /* access modifiers changed from: private */

    /* renamed from: h  reason: collision with root package name */
    public View.OnClickListener f55686h;

    /* renamed from: i  reason: collision with root package name */
    private h.a f55687i;

    /* renamed from: j  reason: collision with root package name */
    private boolean f55688j;

    /* renamed from: k  reason: collision with root package name */
    private boolean f55689k;

    /* renamed from: l  reason: collision with root package name */
    private boolean f55690l;
    /* access modifiers changed from: private */

    /* renamed from: m  reason: collision with root package name */
    public boolean f55691m;

    /* renamed from: n  reason: collision with root package name */
    private boolean f55692n;

    /* renamed from: o  reason: collision with root package name */
    private int f55693o;

    /* renamed from: p  reason: collision with root package name */
    private int f55694p;

    /* renamed from: q  reason: collision with root package name */
    private CharSequence f55695q;

    /* renamed from: r  reason: collision with root package name */
    private final c f55696r;

    /* renamed from: s  reason: collision with root package name */
    private boolean f55697s;

    /* renamed from: t  reason: collision with root package name */
    private final Rect f55698t;

    /* renamed from: u  reason: collision with root package name */
    private final RectF f55699u;

    /* renamed from: v  reason: collision with root package name */
    private final C4985f f55700v;

    class a extends C4985f {
        a() {
        }

        public void a(int i10) {
        }

        public void b(Typeface typeface, boolean z10) {
            CharSequence charSequence;
            Chip chip = Chip.this;
            if (chip.f55683e.I2()) {
                charSequence = Chip.this.f55683e.e1();
            } else {
                charSequence = Chip.this.getText();
            }
            chip.setText(charSequence);
            Chip.this.requestLayout();
            Chip.this.invalidate();
        }
    }

    class b extends ViewOutlineProvider {
        b() {
        }

        public void getOutline(View view, Outline outline) {
            if (Chip.this.f55683e != null) {
                Chip.this.f55683e.getOutline(outline);
            } else {
                outline.setAlpha(0.0f);
            }
        }
    }

    private class c extends G1.a {
        c(Chip chip) {
            super(chip);
        }

        /* access modifiers changed from: protected */
        public void B(C2930A a10) {
            a10.r0(Chip.this.q());
            a10.u0(Chip.this.isClickable());
            a10.t0(Chip.this.getAccessibilityClassName());
            a10.b1(Chip.this.getText());
        }

        /* access modifiers changed from: protected */
        public void C(int i10, C2930A a10) {
            CharSequence charSequence = "";
            if (i10 == 1) {
                CharSequence closeIconContentDescription = Chip.this.getCloseIconContentDescription();
                if (closeIconContentDescription != null) {
                    a10.x0(closeIconContentDescription);
                } else {
                    CharSequence text = Chip.this.getText();
                    Context context = Chip.this.getContext();
                    int i11 = Ua.h.f52900p;
                    if (!TextUtils.isEmpty(text)) {
                        charSequence = text;
                    }
                    a10.x0(context.getString(i11, new Object[]{charSequence}).trim());
                }
                a10.p0(Chip.this.getCloseIconTouchBoundsInt());
                a10.b(C2930A.a.f28602i);
                a10.A0(Chip.this.isEnabled());
                return;
            }
            a10.x0(charSequence);
            a10.p0(Chip.f55680x);
        }

        /* access modifiers changed from: protected */
        public void D(int i10, boolean z10) {
            if (i10 == 1) {
                boolean unused = Chip.this.f55691m = z10;
                Chip.this.refreshDrawableState();
            }
        }

        /* access modifiers changed from: protected */
        public int q(float f10, float f11) {
            if (!Chip.this.m() || !Chip.this.getCloseIconTouchBounds().contains(f10, f11)) {
                return 0;
            }
            return 1;
        }

        /* access modifiers changed from: protected */
        public void r(List list) {
            list.add(0);
            if (Chip.this.m() && Chip.this.r() && Chip.this.f55686h != null) {
                list.add(1);
            }
        }

        /* access modifiers changed from: protected */
        public boolean y(int i10, int i11, Bundle bundle) {
            if (i11 != 16) {
                return false;
            }
            if (i10 == 0) {
                return Chip.this.performClick();
            }
            if (i10 == 1) {
                return Chip.this.s();
            }
            return false;
        }
    }

    public Chip(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, Ua.a.f52728f);
    }

    private void A() {
        TextPaint paint = getPaint();
        a aVar = this.f55683e;
        if (aVar != null) {
            paint.drawableState = aVar.getState();
        }
        C4983d textAppearance = getTextAppearance();
        if (textAppearance != null) {
            textAppearance.n(getContext(), paint, this.f55700v);
        }
    }

    private void B(AttributeSet attributeSet) {
        if (attributeSet != null) {
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", AppStateModule.APP_STATE_BACKGROUND) != null) {
                Log.w("Chip", "Do not set the background; Chip manages its own background drawable.");
            }
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableLeft") != null) {
                throw new UnsupportedOperationException("Please set left drawable using R.attr#chipIcon.");
            } else if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableStart") != null) {
                throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
            } else if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableEnd") != null) {
                throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
            } else if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableRight") != null) {
                throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
            } else if (!attributeSet.getAttributeBooleanValue("http://schemas.android.com/apk/res/android", "singleLine", true) || attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "lines", 1) != 1 || attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "minLines", 1) != 1 || attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "maxLines", 1) != 1) {
                throw new UnsupportedOperationException("Chip does not support multi-line text");
            } else if (attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "gravity", 8388627) != 8388627) {
                Log.w("Chip", "Chip text must be vertically center and start aligned");
            }
        }
    }

    /* access modifiers changed from: private */
    public RectF getCloseIconTouchBounds() {
        this.f55699u.setEmpty();
        if (m() && this.f55686h != null) {
            this.f55683e.V0(this.f55699u);
        }
        return this.f55699u;
    }

    /* access modifiers changed from: private */
    public Rect getCloseIconTouchBoundsInt() {
        RectF closeIconTouchBounds = getCloseIconTouchBounds();
        this.f55698t.set((int) closeIconTouchBounds.left, (int) closeIconTouchBounds.top, (int) closeIconTouchBounds.right, (int) closeIconTouchBounds.bottom);
        return this.f55698t;
    }

    private C4983d getTextAppearance() {
        a aVar = this.f55683e;
        if (aVar != null) {
            return aVar.f1();
        }
        return null;
    }

    private void i(a aVar) {
        aVar.m2(this);
    }

    private int[] j() {
        int isEnabled = isEnabled();
        if (this.f55691m) {
            isEnabled++;
        }
        if (this.f55690l) {
            isEnabled++;
        }
        if (this.f55689k) {
            isEnabled++;
        }
        if (isChecked()) {
            isEnabled++;
        }
        int[] iArr = new int[isEnabled];
        int i10 = 0;
        if (isEnabled()) {
            iArr[0] = 16842910;
            i10 = 1;
        }
        if (this.f55691m) {
            iArr[i10] = 16842908;
            i10++;
        }
        if (this.f55690l) {
            iArr[i10] = 16843623;
            i10++;
        }
        if (this.f55689k) {
            iArr[i10] = 16842919;
            i10++;
        }
        if (isChecked()) {
            iArr[i10] = 16842913;
        }
        return iArr;
    }

    private void l() {
        if (getBackgroundDrawable() == this.f55684f && this.f55683e.getCallback() == null) {
            this.f55683e.setCallback(this.f55684f);
        }
    }

    /* access modifiers changed from: private */
    public boolean m() {
        a aVar = this.f55683e;
        if (aVar == null || aVar.O0() == null) {
            return false;
        }
        return true;
    }

    private void n(Context context, AttributeSet attributeSet, int i10) {
        TypedArray h10 = l.h(context, attributeSet, j.f53159f0, i10, f55679w, new int[0]);
        this.f55692n = h10.getBoolean(j.f53014L0, false);
        this.f55694p = (int) Math.ceil((double) h10.getDimension(j.f53319z0, (float) Math.ceil((double) com.google.android.material.internal.n.b(getContext(), 48))));
        h10.recycle();
    }

    private void o() {
        setOutlineProvider(new b());
    }

    private void p(int i10, int i11, int i12, int i13) {
        this.f55684f = new InsetDrawable(this.f55683e, i10, i11, i12, i13);
    }

    private void setCloseIconHovered(boolean z10) {
        if (this.f55690l != z10) {
            this.f55690l = z10;
            refreshDrawableState();
        }
    }

    private void setCloseIconPressed(boolean z10) {
        if (this.f55689k != z10) {
            this.f55689k = z10;
            refreshDrawableState();
        }
    }

    private void t() {
        if (this.f55684f != null) {
            this.f55684f = null;
            setMinWidth(0);
            setMinHeight((int) getChipMinHeight());
            x();
        }
    }

    private void v(a aVar) {
        if (aVar != null) {
            aVar.m2((a.C0832a) null);
        }
    }

    private void w() {
        if (!m() || !r() || this.f55686h == null) {
            C1680b0.o0(this, (C1677a) null);
            this.f55697s = false;
            return;
        }
        C1680b0.o0(this, this.f55696r);
        this.f55697s = true;
    }

    private void x() {
        if (C4995b.f60593a) {
            y();
            return;
        }
        this.f55683e.H2(true);
        C1680b0.s0(this, getBackgroundDrawable());
        z();
        l();
    }

    private void y() {
        this.f55685g = new RippleDrawable(C4995b.a(this.f55683e.c1()), getBackgroundDrawable(), (Drawable) null);
        this.f55683e.H2(false);
        C1680b0.s0(this, this.f55685g);
        z();
    }

    private void z() {
        a aVar;
        if (!TextUtils.isEmpty(getText()) && (aVar = this.f55683e) != null) {
            int G02 = (int) (aVar.G0() + this.f55683e.g1() + this.f55683e.n0());
            int L02 = (int) (this.f55683e.L0() + this.f55683e.h1() + this.f55683e.j0());
            if (this.f55684f != null) {
                Rect rect = new Rect();
                this.f55684f.getPadding(rect);
                L02 += rect.left;
                G02 += rect.right;
            }
            C1680b0.D0(this, L02, getPaddingTop(), G02, getPaddingBottom());
        }
    }

    public void a() {
        k(this.f55694p);
        requestLayout();
        invalidateOutline();
    }

    /* access modifiers changed from: protected */
    public boolean dispatchHoverEvent(MotionEvent motionEvent) {
        if (!this.f55697s) {
            return super.dispatchHoverEvent(motionEvent);
        }
        if (this.f55696r.k(motionEvent) || super.dispatchHoverEvent(motionEvent)) {
            return true;
        }
        return false;
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (!this.f55697s) {
            return super.dispatchKeyEvent(keyEvent);
        }
        if (!this.f55696r.l(keyEvent) || this.f55696r.p() == Integer.MIN_VALUE) {
            return super.dispatchKeyEvent(keyEvent);
        }
        return true;
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        boolean z10;
        super.drawableStateChanged();
        a aVar = this.f55683e;
        if (aVar == null || !aVar.m1()) {
            z10 = false;
        } else {
            z10 = this.f55683e.i2(j());
        }
        if (z10) {
            invalidate();
        }
    }

    public CharSequence getAccessibilityClassName() {
        if (!TextUtils.isEmpty(this.f55695q)) {
            return this.f55695q;
        }
        if (q()) {
            ViewParent parent = getParent();
            if (!(parent instanceof ChipGroup) || !((ChipGroup) parent).h()) {
                return "android.widget.CompoundButton";
            }
            return "android.widget.RadioButton";
        } else if (isClickable()) {
            return "android.widget.Button";
        } else {
            return "android.view.View";
        }
    }

    public Drawable getBackgroundDrawable() {
        InsetDrawable insetDrawable = this.f55684f;
        if (insetDrawable == null) {
            return this.f55683e;
        }
        return insetDrawable;
    }

    public Drawable getCheckedIcon() {
        a aVar = this.f55683e;
        if (aVar != null) {
            return aVar.C0();
        }
        return null;
    }

    public ColorStateList getCheckedIconTint() {
        a aVar = this.f55683e;
        if (aVar != null) {
            return aVar.D0();
        }
        return null;
    }

    public ColorStateList getChipBackgroundColor() {
        a aVar = this.f55683e;
        if (aVar != null) {
            return aVar.E0();
        }
        return null;
    }

    public float getChipCornerRadius() {
        a aVar = this.f55683e;
        if (aVar != null) {
            return Math.max(0.0f, aVar.F0());
        }
        return 0.0f;
    }

    public Drawable getChipDrawable() {
        return this.f55683e;
    }

    public float getChipEndPadding() {
        a aVar = this.f55683e;
        if (aVar != null) {
            return aVar.G0();
        }
        return 0.0f;
    }

    public Drawable getChipIcon() {
        a aVar = this.f55683e;
        if (aVar != null) {
            return aVar.H0();
        }
        return null;
    }

    public float getChipIconSize() {
        a aVar = this.f55683e;
        if (aVar != null) {
            return aVar.I0();
        }
        return 0.0f;
    }

    public ColorStateList getChipIconTint() {
        a aVar = this.f55683e;
        if (aVar != null) {
            return aVar.J0();
        }
        return null;
    }

    public float getChipMinHeight() {
        a aVar = this.f55683e;
        if (aVar != null) {
            return aVar.K0();
        }
        return 0.0f;
    }

    public float getChipStartPadding() {
        a aVar = this.f55683e;
        if (aVar != null) {
            return aVar.L0();
        }
        return 0.0f;
    }

    public ColorStateList getChipStrokeColor() {
        a aVar = this.f55683e;
        if (aVar != null) {
            return aVar.M0();
        }
        return null;
    }

    public float getChipStrokeWidth() {
        a aVar = this.f55683e;
        if (aVar != null) {
            return aVar.N0();
        }
        return 0.0f;
    }

    @Deprecated
    public CharSequence getChipText() {
        return getText();
    }

    public Drawable getCloseIcon() {
        a aVar = this.f55683e;
        if (aVar != null) {
            return aVar.O0();
        }
        return null;
    }

    public CharSequence getCloseIconContentDescription() {
        a aVar = this.f55683e;
        if (aVar != null) {
            return aVar.P0();
        }
        return null;
    }

    public float getCloseIconEndPadding() {
        a aVar = this.f55683e;
        if (aVar != null) {
            return aVar.Q0();
        }
        return 0.0f;
    }

    public float getCloseIconSize() {
        a aVar = this.f55683e;
        if (aVar != null) {
            return aVar.R0();
        }
        return 0.0f;
    }

    public float getCloseIconStartPadding() {
        a aVar = this.f55683e;
        if (aVar != null) {
            return aVar.S0();
        }
        return 0.0f;
    }

    public ColorStateList getCloseIconTint() {
        a aVar = this.f55683e;
        if (aVar != null) {
            return aVar.U0();
        }
        return null;
    }

    public TextUtils.TruncateAt getEllipsize() {
        a aVar = this.f55683e;
        if (aVar != null) {
            return aVar.Y0();
        }
        return null;
    }

    public void getFocusedRect(Rect rect) {
        if (!this.f55697s || !(this.f55696r.p() == 1 || this.f55696r.m() == 1)) {
            super.getFocusedRect(rect);
        } else {
            rect.set(getCloseIconTouchBoundsInt());
        }
    }

    public Va.c getHideMotionSpec() {
        a aVar = this.f55683e;
        if (aVar != null) {
            return aVar.Z0();
        }
        return null;
    }

    public float getIconEndPadding() {
        a aVar = this.f55683e;
        if (aVar != null) {
            return aVar.a1();
        }
        return 0.0f;
    }

    public float getIconStartPadding() {
        a aVar = this.f55683e;
        if (aVar != null) {
            return aVar.b1();
        }
        return 0.0f;
    }

    public ColorStateList getRippleColor() {
        a aVar = this.f55683e;
        if (aVar != null) {
            return aVar.c1();
        }
        return null;
    }

    public C5024k getShapeAppearanceModel() {
        return this.f55683e.C();
    }

    public Va.c getShowMotionSpec() {
        a aVar = this.f55683e;
        if (aVar != null) {
            return aVar.d1();
        }
        return null;
    }

    public float getTextEndPadding() {
        a aVar = this.f55683e;
        if (aVar != null) {
            return aVar.g1();
        }
        return 0.0f;
    }

    public float getTextStartPadding() {
        a aVar = this.f55683e;
        if (aVar != null) {
            return aVar.h1();
        }
        return 0.0f;
    }

    public boolean k(int i10) {
        int i11;
        this.f55694p = i10;
        int i12 = 0;
        if (!u()) {
            if (this.f55684f != null) {
                t();
            } else {
                x();
            }
            return false;
        }
        int max = Math.max(0, i10 - this.f55683e.getIntrinsicHeight());
        int max2 = Math.max(0, i10 - this.f55683e.getIntrinsicWidth());
        if (max2 > 0 || max > 0) {
            if (max2 > 0) {
                i11 = max2 / 2;
            } else {
                i11 = 0;
            }
            if (max > 0) {
                i12 = max / 2;
            }
            if (this.f55684f != null) {
                Rect rect = new Rect();
                this.f55684f.getPadding(rect);
                if (rect.top == i12 && rect.bottom == i12 && rect.left == i11 && rect.right == i11) {
                    x();
                    return true;
                }
            }
            if (getMinHeight() != i10) {
                setMinHeight(i10);
            }
            if (getMinWidth() != i10) {
                setMinWidth(i10);
            }
            p(i11, i12, i11, i12);
            x();
            return true;
        }
        if (this.f55684f != null) {
            t();
        } else {
            x();
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        C5021h.f(this, this.f55683e);
    }

    /* access modifiers changed from: protected */
    public int[] onCreateDrawableState(int i10) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i10 + 2);
        if (isChecked()) {
            View.mergeDrawableStates(onCreateDrawableState, f55681y);
        }
        if (q()) {
            View.mergeDrawableStates(onCreateDrawableState, f55682z);
        }
        return onCreateDrawableState;
    }

    /* access modifiers changed from: protected */
    public void onFocusChanged(boolean z10, int i10, Rect rect) {
        super.onFocusChanged(z10, i10, rect);
        if (this.f55697s) {
            this.f55696r.x(z10, i10, rect);
        }
    }

    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 7) {
            setCloseIconHovered(getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY()));
        } else if (actionMasked == 10) {
            setCloseIconHovered(false);
        }
        return super.onHoverEvent(motionEvent);
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        int i10;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(getAccessibilityClassName());
        accessibilityNodeInfo.setCheckable(q());
        accessibilityNodeInfo.setClickable(isClickable());
        if (getParent() instanceof ChipGroup) {
            ChipGroup chipGroup = (ChipGroup) getParent();
            C2930A l12 = C2930A.l1(accessibilityNodeInfo);
            if (chipGroup.c()) {
                i10 = chipGroup.g(this);
            } else {
                i10 = -1;
            }
            l12.w0(C2930A.f.b(chipGroup.b(this), 1, i10, 1, false, isChecked()));
        }
    }

    public PointerIcon onResolvePointerIcon(MotionEvent motionEvent, int i10) {
        if (!getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY()) || !isEnabled()) {
            return null;
        }
        return PointerIcon.getSystemIcon(getContext(), ErrorCodes.UNSUPPORTED_ENCODING_EXCEPTION);
    }

    public void onRtlPropertiesChanged(int i10) {
        super.onRtlPropertiesChanged(i10);
        if (this.f55693o != i10) {
            this.f55693o = i10;
            z();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001e, code lost:
        if (r0 != 3) goto L_0x0040;
     */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x004a  */
    /* JADX WARNING: Removed duplicated region for block: B:26:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(android.view.MotionEvent r6) {
        /*
            r5 = this;
            int r0 = r6.getActionMasked()
            android.graphics.RectF r1 = r5.getCloseIconTouchBounds()
            float r2 = r6.getX()
            float r3 = r6.getY()
            boolean r1 = r1.contains(r2, r3)
            r2 = 1
            r3 = 0
            if (r0 == 0) goto L_0x003a
            if (r0 == r2) goto L_0x002c
            r4 = 2
            if (r0 == r4) goto L_0x0021
            r1 = 3
            if (r0 == r1) goto L_0x0035
            goto L_0x0040
        L_0x0021:
            boolean r0 = r5.f55689k
            if (r0 == 0) goto L_0x0040
            if (r1 != 0) goto L_0x002a
            r5.setCloseIconPressed(r3)
        L_0x002a:
            r0 = r2
            goto L_0x0041
        L_0x002c:
            boolean r0 = r5.f55689k
            if (r0 == 0) goto L_0x0035
            r5.s()
            r0 = r2
            goto L_0x0036
        L_0x0035:
            r0 = r3
        L_0x0036:
            r5.setCloseIconPressed(r3)
            goto L_0x0041
        L_0x003a:
            if (r1 == 0) goto L_0x0040
            r5.setCloseIconPressed(r2)
            goto L_0x002a
        L_0x0040:
            r0 = r3
        L_0x0041:
            if (r0 != 0) goto L_0x004b
            boolean r6 = super.onTouchEvent(r6)
            if (r6 == 0) goto L_0x004a
            goto L_0x004b
        L_0x004a:
            r2 = r3
        L_0x004b:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.chip.Chip.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public boolean q() {
        a aVar = this.f55683e;
        if (aVar == null || !aVar.l1()) {
            return false;
        }
        return true;
    }

    public boolean r() {
        a aVar = this.f55683e;
        if (aVar == null || !aVar.n1()) {
            return false;
        }
        return true;
    }

    public boolean s() {
        boolean z10 = false;
        playSoundEffect(0);
        View.OnClickListener onClickListener = this.f55686h;
        if (onClickListener != null) {
            onClickListener.onClick(this);
            z10 = true;
        }
        if (this.f55697s) {
            this.f55696r.J(1, 1);
        }
        return z10;
    }

    public void setAccessibilityClassName(CharSequence charSequence) {
        this.f55695q = charSequence;
    }

    public void setBackground(Drawable drawable) {
        if (drawable == getBackgroundDrawable() || drawable == this.f55685g) {
            super.setBackground(drawable);
        } else {
            Log.w("Chip", "Do not set the background; Chip manages its own background drawable.");
        }
    }

    public void setBackgroundColor(int i10) {
        Log.w("Chip", "Do not set the background color; Chip manages its own background drawable.");
    }

    public void setBackgroundDrawable(Drawable drawable) {
        if (drawable == getBackgroundDrawable() || drawable == this.f55685g) {
            super.setBackgroundDrawable(drawable);
        } else {
            Log.w("Chip", "Do not set the background drawable; Chip manages its own background drawable.");
        }
    }

    public void setBackgroundResource(int i10) {
        Log.w("Chip", "Do not set the background resource; Chip manages its own background drawable.");
    }

    public void setBackgroundTintList(ColorStateList colorStateList) {
        Log.w("Chip", "Do not set the background tint list; Chip manages its own background drawable.");
    }

    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        Log.w("Chip", "Do not set the background tint mode; Chip manages its own background drawable.");
    }

    public void setCheckable(boolean z10) {
        a aVar = this.f55683e;
        if (aVar != null) {
            aVar.u1(z10);
        }
    }

    public void setCheckableResource(int i10) {
        a aVar = this.f55683e;
        if (aVar != null) {
            aVar.v1(i10);
        }
    }

    public void setChecked(boolean z10) {
        h.a aVar;
        a aVar2 = this.f55683e;
        if (aVar2 == null) {
            this.f55688j = z10;
        } else if (aVar2.l1()) {
            boolean isChecked = isChecked();
            super.setChecked(z10);
            if (isChecked != z10 && (aVar = this.f55687i) != null) {
                aVar.a(this, z10);
            }
        }
    }

    public void setCheckedIcon(Drawable drawable) {
        a aVar = this.f55683e;
        if (aVar != null) {
            aVar.w1(drawable);
        }
    }

    @Deprecated
    public void setCheckedIconEnabled(boolean z10) {
        setCheckedIconVisible(z10);
    }

    @Deprecated
    public void setCheckedIconEnabledResource(int i10) {
        setCheckedIconVisible(i10);
    }

    public void setCheckedIconResource(int i10) {
        a aVar = this.f55683e;
        if (aVar != null) {
            aVar.x1(i10);
        }
    }

    public void setCheckedIconTint(ColorStateList colorStateList) {
        a aVar = this.f55683e;
        if (aVar != null) {
            aVar.y1(colorStateList);
        }
    }

    public void setCheckedIconTintResource(int i10) {
        a aVar = this.f55683e;
        if (aVar != null) {
            aVar.z1(i10);
        }
    }

    public void setCheckedIconVisible(int i10) {
        a aVar = this.f55683e;
        if (aVar != null) {
            aVar.A1(i10);
        }
    }

    public void setChipBackgroundColor(ColorStateList colorStateList) {
        a aVar = this.f55683e;
        if (aVar != null) {
            aVar.C1(colorStateList);
        }
    }

    public void setChipBackgroundColorResource(int i10) {
        a aVar = this.f55683e;
        if (aVar != null) {
            aVar.D1(i10);
        }
    }

    @Deprecated
    public void setChipCornerRadius(float f10) {
        a aVar = this.f55683e;
        if (aVar != null) {
            aVar.E1(f10);
        }
    }

    @Deprecated
    public void setChipCornerRadiusResource(int i10) {
        a aVar = this.f55683e;
        if (aVar != null) {
            aVar.F1(i10);
        }
    }

    public void setChipDrawable(a aVar) {
        a aVar2 = this.f55683e;
        if (aVar2 != aVar) {
            v(aVar2);
            this.f55683e = aVar;
            aVar.x2(false);
            i(this.f55683e);
            k(this.f55694p);
        }
    }

    public void setChipEndPadding(float f10) {
        a aVar = this.f55683e;
        if (aVar != null) {
            aVar.G1(f10);
        }
    }

    public void setChipEndPaddingResource(int i10) {
        a aVar = this.f55683e;
        if (aVar != null) {
            aVar.H1(i10);
        }
    }

    public void setChipIcon(Drawable drawable) {
        a aVar = this.f55683e;
        if (aVar != null) {
            aVar.I1(drawable);
        }
    }

    @Deprecated
    public void setChipIconEnabled(boolean z10) {
        setChipIconVisible(z10);
    }

    @Deprecated
    public void setChipIconEnabledResource(int i10) {
        setChipIconVisible(i10);
    }

    public void setChipIconResource(int i10) {
        a aVar = this.f55683e;
        if (aVar != null) {
            aVar.J1(i10);
        }
    }

    public void setChipIconSize(float f10) {
        a aVar = this.f55683e;
        if (aVar != null) {
            aVar.K1(f10);
        }
    }

    public void setChipIconSizeResource(int i10) {
        a aVar = this.f55683e;
        if (aVar != null) {
            aVar.L1(i10);
        }
    }

    public void setChipIconTint(ColorStateList colorStateList) {
        a aVar = this.f55683e;
        if (aVar != null) {
            aVar.M1(colorStateList);
        }
    }

    public void setChipIconTintResource(int i10) {
        a aVar = this.f55683e;
        if (aVar != null) {
            aVar.N1(i10);
        }
    }

    public void setChipIconVisible(int i10) {
        a aVar = this.f55683e;
        if (aVar != null) {
            aVar.O1(i10);
        }
    }

    public void setChipMinHeight(float f10) {
        a aVar = this.f55683e;
        if (aVar != null) {
            aVar.Q1(f10);
        }
    }

    public void setChipMinHeightResource(int i10) {
        a aVar = this.f55683e;
        if (aVar != null) {
            aVar.R1(i10);
        }
    }

    public void setChipStartPadding(float f10) {
        a aVar = this.f55683e;
        if (aVar != null) {
            aVar.S1(f10);
        }
    }

    public void setChipStartPaddingResource(int i10) {
        a aVar = this.f55683e;
        if (aVar != null) {
            aVar.T1(i10);
        }
    }

    public void setChipStrokeColor(ColorStateList colorStateList) {
        a aVar = this.f55683e;
        if (aVar != null) {
            aVar.U1(colorStateList);
        }
    }

    public void setChipStrokeColorResource(int i10) {
        a aVar = this.f55683e;
        if (aVar != null) {
            aVar.V1(i10);
        }
    }

    public void setChipStrokeWidth(float f10) {
        a aVar = this.f55683e;
        if (aVar != null) {
            aVar.W1(f10);
        }
    }

    public void setChipStrokeWidthResource(int i10) {
        a aVar = this.f55683e;
        if (aVar != null) {
            aVar.X1(i10);
        }
    }

    @Deprecated
    public void setChipText(CharSequence charSequence) {
        setText(charSequence);
    }

    @Deprecated
    public void setChipTextResource(int i10) {
        setText(getResources().getString(i10));
    }

    public void setCloseIcon(Drawable drawable) {
        a aVar = this.f55683e;
        if (aVar != null) {
            aVar.Z1(drawable);
        }
        w();
    }

    public void setCloseIconContentDescription(CharSequence charSequence) {
        a aVar = this.f55683e;
        if (aVar != null) {
            aVar.a2(charSequence);
        }
    }

    @Deprecated
    public void setCloseIconEnabled(boolean z10) {
        setCloseIconVisible(z10);
    }

    @Deprecated
    public void setCloseIconEnabledResource(int i10) {
        setCloseIconVisible(i10);
    }

    public void setCloseIconEndPadding(float f10) {
        a aVar = this.f55683e;
        if (aVar != null) {
            aVar.b2(f10);
        }
    }

    public void setCloseIconEndPaddingResource(int i10) {
        a aVar = this.f55683e;
        if (aVar != null) {
            aVar.c2(i10);
        }
    }

    public void setCloseIconResource(int i10) {
        a aVar = this.f55683e;
        if (aVar != null) {
            aVar.d2(i10);
        }
        w();
    }

    public void setCloseIconSize(float f10) {
        a aVar = this.f55683e;
        if (aVar != null) {
            aVar.e2(f10);
        }
    }

    public void setCloseIconSizeResource(int i10) {
        a aVar = this.f55683e;
        if (aVar != null) {
            aVar.f2(i10);
        }
    }

    public void setCloseIconStartPadding(float f10) {
        a aVar = this.f55683e;
        if (aVar != null) {
            aVar.g2(f10);
        }
    }

    public void setCloseIconStartPaddingResource(int i10) {
        a aVar = this.f55683e;
        if (aVar != null) {
            aVar.h2(i10);
        }
    }

    public void setCloseIconTint(ColorStateList colorStateList) {
        a aVar = this.f55683e;
        if (aVar != null) {
            aVar.j2(colorStateList);
        }
    }

    public void setCloseIconTintResource(int i10) {
        a aVar = this.f55683e;
        if (aVar != null) {
            aVar.k2(i10);
        }
    }

    public void setCloseIconVisible(int i10) {
        setCloseIconVisible(getResources().getBoolean(i10));
    }

    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        } else if (drawable3 == null) {
            super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        } else {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
    }

    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        } else if (drawable3 == null) {
            super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        } else {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
    }

    public void setCompoundDrawablesRelativeWithIntrinsicBounds(int i10, int i11, int i12, int i13) {
        if (i10 != 0) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        } else if (i12 == 0) {
            super.setCompoundDrawablesRelativeWithIntrinsicBounds(i10, i11, i12, i13);
        } else {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
    }

    public void setCompoundDrawablesWithIntrinsicBounds(int i10, int i11, int i12, int i13) {
        if (i10 != 0) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        } else if (i12 == 0) {
            super.setCompoundDrawablesWithIntrinsicBounds(i10, i11, i12, i13);
        } else {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
    }

    public void setElevation(float f10) {
        super.setElevation(f10);
        a aVar = this.f55683e;
        if (aVar != null) {
            aVar.V(f10);
        }
    }

    public void setEllipsize(TextUtils.TruncateAt truncateAt) {
        if (this.f55683e != null) {
            if (truncateAt != TextUtils.TruncateAt.MARQUEE) {
                super.setEllipsize(truncateAt);
                a aVar = this.f55683e;
                if (aVar != null) {
                    aVar.n2(truncateAt);
                    return;
                }
                return;
            }
            throw new UnsupportedOperationException("Text within a chip are not allowed to scroll.");
        }
    }

    public void setEnsureMinTouchTargetSize(boolean z10) {
        this.f55692n = z10;
        k(this.f55694p);
    }

    public void setGravity(int i10) {
        if (i10 != 8388627) {
            Log.w("Chip", "Chip text must be vertically center and start aligned");
        } else {
            super.setGravity(i10);
        }
    }

    public void setHideMotionSpec(Va.c cVar) {
        a aVar = this.f55683e;
        if (aVar != null) {
            aVar.o2(cVar);
        }
    }

    public void setHideMotionSpecResource(int i10) {
        a aVar = this.f55683e;
        if (aVar != null) {
            aVar.p2(i10);
        }
    }

    public void setIconEndPadding(float f10) {
        a aVar = this.f55683e;
        if (aVar != null) {
            aVar.q2(f10);
        }
    }

    public void setIconEndPaddingResource(int i10) {
        a aVar = this.f55683e;
        if (aVar != null) {
            aVar.r2(i10);
        }
    }

    public void setIconStartPadding(float f10) {
        a aVar = this.f55683e;
        if (aVar != null) {
            aVar.s2(f10);
        }
    }

    public void setIconStartPaddingResource(int i10) {
        a aVar = this.f55683e;
        if (aVar != null) {
            aVar.t2(i10);
        }
    }

    public void setInternalOnCheckedChangeListener(h.a aVar) {
        this.f55687i = aVar;
    }

    public void setLayoutDirection(int i10) {
        if (this.f55683e != null) {
            super.setLayoutDirection(i10);
        }
    }

    public void setLines(int i10) {
        if (i10 <= 1) {
            super.setLines(i10);
            return;
        }
        throw new UnsupportedOperationException("Chip does not support multi-line text");
    }

    public void setMaxLines(int i10) {
        if (i10 <= 1) {
            super.setMaxLines(i10);
            return;
        }
        throw new UnsupportedOperationException("Chip does not support multi-line text");
    }

    public void setMaxWidth(int i10) {
        super.setMaxWidth(i10);
        a aVar = this.f55683e;
        if (aVar != null) {
            aVar.u2(i10);
        }
    }

    public void setMinLines(int i10) {
        if (i10 <= 1) {
            super.setMinLines(i10);
            return;
        }
        throw new UnsupportedOperationException("Chip does not support multi-line text");
    }

    public void setOnCloseIconClickListener(View.OnClickListener onClickListener) {
        this.f55686h = onClickListener;
        w();
    }

    public void setRippleColor(ColorStateList colorStateList) {
        a aVar = this.f55683e;
        if (aVar != null) {
            aVar.v2(colorStateList);
        }
        if (!this.f55683e.j1()) {
            y();
        }
    }

    public void setRippleColorResource(int i10) {
        a aVar = this.f55683e;
        if (aVar != null) {
            aVar.w2(i10);
            if (!this.f55683e.j1()) {
                y();
            }
        }
    }

    public void setShapeAppearanceModel(C5024k kVar) {
        this.f55683e.setShapeAppearanceModel(kVar);
    }

    public void setShowMotionSpec(Va.c cVar) {
        a aVar = this.f55683e;
        if (aVar != null) {
            aVar.y2(cVar);
        }
    }

    public void setShowMotionSpecResource(int i10) {
        a aVar = this.f55683e;
        if (aVar != null) {
            aVar.z2(i10);
        }
    }

    public void setSingleLine(boolean z10) {
        if (z10) {
            super.setSingleLine(z10);
            return;
        }
        throw new UnsupportedOperationException("Chip does not support multi-line text");
    }

    public void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        CharSequence charSequence2;
        a aVar = this.f55683e;
        if (aVar != null) {
            if (charSequence == null) {
                charSequence = "";
            }
            if (aVar.I2()) {
                charSequence2 = null;
            } else {
                charSequence2 = charSequence;
            }
            super.setText(charSequence2, bufferType);
            a aVar2 = this.f55683e;
            if (aVar2 != null) {
                aVar2.A2(charSequence);
            }
        }
    }

    public void setTextAppearance(C4983d dVar) {
        a aVar = this.f55683e;
        if (aVar != null) {
            aVar.B2(dVar);
        }
        A();
    }

    public void setTextAppearanceResource(int i10) {
        setTextAppearance(getContext(), i10);
    }

    public void setTextEndPadding(float f10) {
        a aVar = this.f55683e;
        if (aVar != null) {
            aVar.D2(f10);
        }
    }

    public void setTextEndPaddingResource(int i10) {
        a aVar = this.f55683e;
        if (aVar != null) {
            aVar.E2(i10);
        }
    }

    public void setTextStartPadding(float f10) {
        a aVar = this.f55683e;
        if (aVar != null) {
            aVar.F2(f10);
        }
    }

    public void setTextStartPaddingResource(int i10) {
        a aVar = this.f55683e;
        if (aVar != null) {
            aVar.G2(i10);
        }
    }

    public boolean u() {
        return this.f55692n;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public Chip(android.content.Context r7, android.util.AttributeSet r8, int r9) {
        /*
            r6 = this;
            int r4 = f55679w
            android.content.Context r7 = jb.C5041a.c(r7, r8, r9, r4)
            r6.<init>(r7, r8, r9)
            android.graphics.Rect r7 = new android.graphics.Rect
            r7.<init>()
            r6.f55698t = r7
            android.graphics.RectF r7 = new android.graphics.RectF
            r7.<init>()
            r6.f55699u = r7
            com.google.android.material.chip.Chip$a r7 = new com.google.android.material.chip.Chip$a
            r7.<init>()
            r6.f55700v = r7
            android.content.Context r0 = r6.getContext()
            r6.B(r8)
            com.google.android.material.chip.a r7 = com.google.android.material.chip.a.s0(r0, r8, r9, r4)
            r6.n(r0, r8, r9)
            r6.setChipDrawable(r7)
            float r1 = androidx.core.view.C1680b0.v(r6)
            r7.V(r1)
            int[] r2 = Ua.j.f53159f0
            r1 = 0
            int[] r5 = new int[r1]
            r1 = r8
            r3 = r9
            android.content.res.TypedArray r8 = com.google.android.material.internal.l.h(r0, r1, r2, r3, r4, r5)
            int r9 = Ua.j.f53049Q0
            boolean r9 = r8.hasValue(r9)
            r8.recycle()
            com.google.android.material.chip.Chip$c r8 = new com.google.android.material.chip.Chip$c
            r8.<init>(r6)
            r6.f55696r = r8
            r6.w()
            if (r9 != 0) goto L_0x0059
            r6.o()
        L_0x0059:
            boolean r8 = r6.f55688j
            r6.setChecked(r8)
            java.lang.CharSequence r8 = r7.e1()
            r6.setText(r8)
            android.text.TextUtils$TruncateAt r7 = r7.Y0()
            r6.setEllipsize(r7)
            r6.A()
            com.google.android.material.chip.a r7 = r6.f55683e
            boolean r7 = r7.I2()
            if (r7 != 0) goto L_0x007e
            r7 = 1
            r6.setLines(r7)
            r6.setHorizontallyScrolling(r7)
        L_0x007e:
            r7 = 8388627(0x800013, float:1.175497E-38)
            r6.setGravity(r7)
            r6.z()
            boolean r7 = r6.u()
            if (r7 == 0) goto L_0x0092
            int r7 = r6.f55694p
            r6.setMinHeight(r7)
        L_0x0092:
            int r7 = androidx.core.view.C1680b0.A(r6)
            r6.f55693o = r7
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.chip.Chip.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    public void setCloseIconVisible(boolean z10) {
        a aVar = this.f55683e;
        if (aVar != null) {
            aVar.l2(z10);
        }
        w();
    }

    public void setCheckedIconVisible(boolean z10) {
        a aVar = this.f55683e;
        if (aVar != null) {
            aVar.B1(z10);
        }
    }

    public void setChipIconVisible(boolean z10) {
        a aVar = this.f55683e;
        if (aVar != null) {
            aVar.P1(z10);
        }
    }

    public void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        } else if (drawable3 == null) {
            super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        } else {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
    }

    public void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set left drawable using R.attr#chipIcon.");
        } else if (drawable3 == null) {
            super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        } else {
            throw new UnsupportedOperationException("Please set right drawable using R.attr#closeIcon.");
        }
    }

    public void setTextAppearance(Context context, int i10) {
        super.setTextAppearance(context, i10);
        a aVar = this.f55683e;
        if (aVar != null) {
            aVar.C2(i10);
        }
        A();
    }

    public void setTextAppearance(int i10) {
        super.setTextAppearance(i10);
        a aVar = this.f55683e;
        if (aVar != null) {
            aVar.C2(i10);
        }
        A();
    }
}
