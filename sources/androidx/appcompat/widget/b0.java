package androidx.appcompat.widget;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.InputFilter;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.util.Property;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.CompoundButton;
import androidx.core.view.C1680b0;
import androidx.core.widget.i;
import androidx.emoji2.text.f;
import i.C2037a;
import i.h;
import i.j;
import j.C2115a;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import m.C2174a;
import q1.C2429a;

public abstract class b0 extends CompoundButton {

    /* renamed from: o0  reason: collision with root package name */
    private static final Property f11790o0 = new a(Float.class, "thumbPos");

    /* renamed from: p0  reason: collision with root package name */
    private static final int[] f11791p0 = {16842912};

    /* renamed from: A  reason: collision with root package name */
    private int f11792A;

    /* renamed from: B  reason: collision with root package name */
    private int f11793B;

    /* renamed from: C  reason: collision with root package name */
    private int f11794C;

    /* renamed from: D  reason: collision with root package name */
    private int f11795D;

    /* renamed from: E  reason: collision with root package name */
    private int f11796E;

    /* renamed from: F  reason: collision with root package name */
    private int f11797F;

    /* renamed from: G  reason: collision with root package name */
    private int f11798G;

    /* renamed from: H  reason: collision with root package name */
    private boolean f11799H;

    /* renamed from: I  reason: collision with root package name */
    private final TextPaint f11800I;

    /* renamed from: a  reason: collision with root package name */
    private Drawable f11801a;

    /* renamed from: b  reason: collision with root package name */
    private ColorStateList f11802b;

    /* renamed from: c  reason: collision with root package name */
    private PorterDuff.Mode f11803c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f11804d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f11805e;

    /* renamed from: f  reason: collision with root package name */
    private Drawable f11806f;

    /* renamed from: f0  reason: collision with root package name */
    private ColorStateList f11807f0;

    /* renamed from: g  reason: collision with root package name */
    private ColorStateList f11808g;

    /* renamed from: g0  reason: collision with root package name */
    private Layout f11809g0;

    /* renamed from: h  reason: collision with root package name */
    private PorterDuff.Mode f11810h;

    /* renamed from: h0  reason: collision with root package name */
    private Layout f11811h0;

    /* renamed from: i  reason: collision with root package name */
    private boolean f11812i;

    /* renamed from: i0  reason: collision with root package name */
    private TransformationMethod f11813i0;

    /* renamed from: j  reason: collision with root package name */
    private boolean f11814j;

    /* renamed from: j0  reason: collision with root package name */
    ObjectAnimator f11815j0;

    /* renamed from: k  reason: collision with root package name */
    private int f11816k;

    /* renamed from: k0  reason: collision with root package name */
    private final B f11817k0;

    /* renamed from: l  reason: collision with root package name */
    private int f11818l;

    /* renamed from: l0  reason: collision with root package name */
    private C1575n f11819l0;

    /* renamed from: m  reason: collision with root package name */
    private int f11820m;

    /* renamed from: m0  reason: collision with root package name */
    private b f11821m0;

    /* renamed from: n  reason: collision with root package name */
    private boolean f11822n;

    /* renamed from: n0  reason: collision with root package name */
    private final Rect f11823n0;

    /* renamed from: o  reason: collision with root package name */
    private CharSequence f11824o;

    /* renamed from: p  reason: collision with root package name */
    private CharSequence f11825p;

    /* renamed from: q  reason: collision with root package name */
    private CharSequence f11826q;

    /* renamed from: r  reason: collision with root package name */
    private CharSequence f11827r;

    /* renamed from: s  reason: collision with root package name */
    private boolean f11828s;

    /* renamed from: t  reason: collision with root package name */
    private int f11829t;

    /* renamed from: u  reason: collision with root package name */
    private int f11830u;

    /* renamed from: v  reason: collision with root package name */
    private float f11831v;

    /* renamed from: w  reason: collision with root package name */
    private float f11832w;

    /* renamed from: x  reason: collision with root package name */
    private VelocityTracker f11833x;

    /* renamed from: y  reason: collision with root package name */
    private int f11834y;

    /* renamed from: z  reason: collision with root package name */
    float f11835z;

    class a extends Property {
        a(Class cls, String str) {
            super(cls, str);
        }

        /* renamed from: a */
        public Float get(b0 b0Var) {
            return Float.valueOf(b0Var.f11835z);
        }

        /* renamed from: b */
        public void set(b0 b0Var, Float f10) {
            b0Var.setThumbPosition(f10.floatValue());
        }
    }

    static class b extends f.C0294f {

        /* renamed from: a  reason: collision with root package name */
        private final Reference f11836a;

        b(b0 b0Var) {
            this.f11836a = new WeakReference(b0Var);
        }

        public void a(Throwable th2) {
            b0 b0Var = (b0) this.f11836a.get();
            if (b0Var != null) {
                b0Var.j();
            }
        }

        public void b() {
            b0 b0Var = (b0) this.f11836a.get();
            if (b0Var != null) {
                b0Var.j();
            }
        }
    }

    public b0(Context context) {
        this(context, (AttributeSet) null);
    }

    private void a(boolean z10) {
        float f10;
        if (z10) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, f11790o0, new float[]{f10});
        this.f11815j0 = ofFloat;
        ofFloat.setDuration(250);
        this.f11815j0.setAutoCancel(true);
        this.f11815j0.start();
    }

    private void b() {
        Drawable drawable = this.f11801a;
        if (drawable == null) {
            return;
        }
        if (this.f11804d || this.f11805e) {
            Drawable mutate = C2429a.l(drawable).mutate();
            this.f11801a = mutate;
            if (this.f11804d) {
                C2429a.i(mutate, this.f11802b);
            }
            if (this.f11805e) {
                C2429a.j(this.f11801a, this.f11803c);
            }
            if (this.f11801a.isStateful()) {
                this.f11801a.setState(getDrawableState());
            }
        }
    }

    private void c() {
        Drawable drawable = this.f11806f;
        if (drawable == null) {
            return;
        }
        if (this.f11812i || this.f11814j) {
            Drawable mutate = C2429a.l(drawable).mutate();
            this.f11806f = mutate;
            if (this.f11812i) {
                C2429a.i(mutate, this.f11808g);
            }
            if (this.f11814j) {
                C2429a.j(this.f11806f, this.f11810h);
            }
            if (this.f11806f.isStateful()) {
                this.f11806f.setState(getDrawableState());
            }
        }
    }

    private void d() {
        ObjectAnimator objectAnimator = this.f11815j0;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
    }

    private void e(MotionEvent motionEvent) {
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        obtain.setAction(3);
        super.onTouchEvent(obtain);
        obtain.recycle();
    }

    private static float f(float f10, float f11, float f12) {
        if (f10 < f11) {
            return f11;
        }
        return f10 > f12 ? f12 : f10;
    }

    private CharSequence g(CharSequence charSequence) {
        TransformationMethod f10 = getEmojiTextViewHelper().f(this.f11813i0);
        if (f10 != null) {
            return f10.getTransformation(charSequence, this);
        }
        return charSequence;
    }

    private C1575n getEmojiTextViewHelper() {
        if (this.f11819l0 == null) {
            this.f11819l0 = new C1575n(this);
        }
        return this.f11819l0;
    }

    private boolean getTargetCheckedState() {
        if (this.f11835z > 0.5f) {
            return true;
        }
        return false;
    }

    private int getThumbOffset() {
        float f10;
        if (r0.b(this)) {
            f10 = 1.0f - this.f11835z;
        } else {
            f10 = this.f11835z;
        }
        return (int) ((f10 * ((float) getThumbScrollRange())) + 0.5f);
    }

    private int getThumbScrollRange() {
        Rect rect;
        Drawable drawable = this.f11806f;
        if (drawable == null) {
            return 0;
        }
        Rect rect2 = this.f11823n0;
        drawable.getPadding(rect2);
        Drawable drawable2 = this.f11801a;
        if (drawable2 != null) {
            rect = N.d(drawable2);
        } else {
            rect = N.f11551c;
        }
        return ((((this.f11792A - this.f11794C) - rect2.left) - rect2.right) - rect.left) - rect.right;
    }

    private boolean h(float f10, float f11) {
        if (this.f11801a == null) {
            return false;
        }
        int thumbOffset = getThumbOffset();
        this.f11801a.getPadding(this.f11823n0);
        int i10 = this.f11796E;
        int i11 = this.f11830u;
        int i12 = i10 - i11;
        int i13 = (this.f11795D + thumbOffset) - i11;
        Rect rect = this.f11823n0;
        int i14 = this.f11794C + i13 + rect.left + rect.right + i11;
        int i15 = this.f11798G + i11;
        if (f10 <= ((float) i13) || f10 >= ((float) i14) || f11 <= ((float) i12) || f11 >= ((float) i15)) {
            return false;
        }
        return true;
    }

    private Layout i(CharSequence charSequence) {
        int i10;
        TextPaint textPaint = this.f11800I;
        if (charSequence != null) {
            i10 = (int) Math.ceil((double) Layout.getDesiredWidth(charSequence, textPaint));
        } else {
            i10 = 0;
        }
        return new StaticLayout(charSequence, textPaint, i10, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
    }

    private void k() {
        if (Build.VERSION.SDK_INT >= 30) {
            CharSequence charSequence = this.f11826q;
            if (charSequence == null) {
                charSequence = getResources().getString(h.f21415b);
            }
            C1680b0.G0(this, charSequence);
        }
    }

    private void l() {
        if (Build.VERSION.SDK_INT >= 30) {
            CharSequence charSequence = this.f11824o;
            if (charSequence == null) {
                charSequence = getResources().getString(h.f21416c);
            }
            C1680b0.G0(this, charSequence);
        }
    }

    private void o(int i10, int i11) {
        Typeface typeface;
        if (i10 == 1) {
            typeface = Typeface.SANS_SERIF;
        } else if (i10 == 2) {
            typeface = Typeface.SERIF;
        } else if (i10 != 3) {
            typeface = null;
        } else {
            typeface = Typeface.MONOSPACE;
        }
        n(typeface, i11);
    }

    private void p() {
        if (this.f11821m0 == null && this.f11819l0.b() && f.k()) {
            f c10 = f.c();
            int g10 = c10.g();
            if (g10 == 3 || g10 == 0) {
                b bVar = new b(this);
                this.f11821m0 = bVar;
                c10.v(bVar);
            }
        }
    }

    private void q(MotionEvent motionEvent) {
        boolean z10;
        this.f11829t = 0;
        boolean z11 = true;
        if (motionEvent.getAction() != 1 || !isEnabled()) {
            z10 = false;
        } else {
            z10 = true;
        }
        boolean isChecked = isChecked();
        if (z10) {
            this.f11833x.computeCurrentVelocity(1000);
            float xVelocity = this.f11833x.getXVelocity();
            if (Math.abs(xVelocity) <= ((float) this.f11834y)) {
                z11 = getTargetCheckedState();
            } else if (!r0.b(this) ? xVelocity <= 0.0f : xVelocity >= 0.0f) {
                z11 = false;
            }
        } else {
            z11 = isChecked;
        }
        if (z11 != isChecked) {
            playSoundEffect(0);
        }
        setChecked(z11);
        e(motionEvent);
    }

    private void setTextOffInternal(CharSequence charSequence) {
        this.f11826q = charSequence;
        this.f11827r = g(charSequence);
        this.f11811h0 = null;
        if (this.f11828s) {
            p();
        }
    }

    private void setTextOnInternal(CharSequence charSequence) {
        this.f11824o = charSequence;
        this.f11825p = g(charSequence);
        this.f11809g0 = null;
        if (this.f11828s) {
            p();
        }
    }

    public void draw(Canvas canvas) {
        Rect rect;
        int i10;
        int i11;
        Rect rect2 = this.f11823n0;
        int i12 = this.f11795D;
        int i13 = this.f11796E;
        int i14 = this.f11797F;
        int i15 = this.f11798G;
        int thumbOffset = getThumbOffset() + i12;
        Drawable drawable = this.f11801a;
        if (drawable != null) {
            rect = N.d(drawable);
        } else {
            rect = N.f11551c;
        }
        Drawable drawable2 = this.f11806f;
        if (drawable2 != null) {
            drawable2.getPadding(rect2);
            int i16 = rect2.left;
            thumbOffset += i16;
            if (rect != null) {
                int i17 = rect.left;
                if (i17 > i16) {
                    i12 += i17 - i16;
                }
                int i18 = rect.top;
                int i19 = rect2.top;
                if (i18 > i19) {
                    i10 = (i18 - i19) + i13;
                } else {
                    i10 = i13;
                }
                int i20 = rect.right;
                int i21 = rect2.right;
                if (i20 > i21) {
                    i14 -= i20 - i21;
                }
                int i22 = rect.bottom;
                int i23 = rect2.bottom;
                if (i22 > i23) {
                    i11 = i15 - (i22 - i23);
                    this.f11806f.setBounds(i12, i10, i14, i11);
                }
            } else {
                i10 = i13;
            }
            i11 = i15;
            this.f11806f.setBounds(i12, i10, i14, i11);
        }
        Drawable drawable3 = this.f11801a;
        if (drawable3 != null) {
            drawable3.getPadding(rect2);
            int i24 = thumbOffset - rect2.left;
            int i25 = thumbOffset + this.f11794C + rect2.right;
            this.f11801a.setBounds(i24, i13, i25, i15);
            Drawable background = getBackground();
            if (background != null) {
                C2429a.f(background, i24, i13, i25, i15);
            }
        }
        super.draw(canvas);
    }

    public void drawableHotspotChanged(float f10, float f11) {
        super.drawableHotspotChanged(f10, f11);
        Drawable drawable = this.f11801a;
        if (drawable != null) {
            C2429a.e(drawable, f10, f11);
        }
        Drawable drawable2 = this.f11806f;
        if (drawable2 != null) {
            C2429a.e(drawable2, f10, f11);
        }
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        boolean z10;
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f11801a;
        if (drawable == null || !drawable.isStateful()) {
            z10 = false;
        } else {
            z10 = drawable.setState(drawableState);
        }
        Drawable drawable2 = this.f11806f;
        if (drawable2 != null && drawable2.isStateful()) {
            z10 |= drawable2.setState(drawableState);
        }
        if (z10) {
            invalidate();
        }
    }

    public int getCompoundPaddingLeft() {
        if (!r0.b(this)) {
            return super.getCompoundPaddingLeft();
        }
        int compoundPaddingLeft = super.getCompoundPaddingLeft() + this.f11792A;
        if (!TextUtils.isEmpty(getText())) {
            return compoundPaddingLeft + this.f11820m;
        }
        return compoundPaddingLeft;
    }

    public int getCompoundPaddingRight() {
        if (r0.b(this)) {
            return super.getCompoundPaddingRight();
        }
        int compoundPaddingRight = super.getCompoundPaddingRight() + this.f11792A;
        if (!TextUtils.isEmpty(getText())) {
            return compoundPaddingRight + this.f11820m;
        }
        return compoundPaddingRight;
    }

    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return i.q(super.getCustomSelectionActionModeCallback());
    }

    public boolean getShowText() {
        return this.f11828s;
    }

    public boolean getSplitTrack() {
        return this.f11822n;
    }

    public int getSwitchMinWidth() {
        return this.f11818l;
    }

    public int getSwitchPadding() {
        return this.f11820m;
    }

    public CharSequence getTextOff() {
        return this.f11826q;
    }

    public CharSequence getTextOn() {
        return this.f11824o;
    }

    public Drawable getThumbDrawable() {
        return this.f11801a;
    }

    /* access modifiers changed from: protected */
    public final float getThumbPosition() {
        return this.f11835z;
    }

    public int getThumbTextPadding() {
        return this.f11816k;
    }

    public ColorStateList getThumbTintList() {
        return this.f11802b;
    }

    public PorterDuff.Mode getThumbTintMode() {
        return this.f11803c;
    }

    public Drawable getTrackDrawable() {
        return this.f11806f;
    }

    public ColorStateList getTrackTintList() {
        return this.f11808g;
    }

    public PorterDuff.Mode getTrackTintMode() {
        return this.f11810h;
    }

    /* access modifiers changed from: package-private */
    public void j() {
        setTextOnInternal(this.f11824o);
        setTextOffInternal(this.f11826q);
        requestLayout();
    }

    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f11801a;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.f11806f;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        ObjectAnimator objectAnimator = this.f11815j0;
        if (objectAnimator != null && objectAnimator.isStarted()) {
            this.f11815j0.end();
            this.f11815j0 = null;
        }
    }

    public void m(Context context, int i10) {
        g0 t10 = g0.t(context, i10, j.f21525S2);
        ColorStateList c10 = t10.c(j.f21541W2);
        if (c10 != null) {
            this.f11807f0 = c10;
        } else {
            this.f11807f0 = getTextColors();
        }
        int f10 = t10.f(j.f21529T2, 0);
        if (f10 != 0) {
            float f11 = (float) f10;
            if (f11 != this.f11800I.getTextSize()) {
                this.f11800I.setTextSize(f11);
                requestLayout();
            }
        }
        o(t10.k(j.f21533U2, -1), t10.k(j.f21537V2, -1));
        if (t10.a(j.f21563b3, false)) {
            this.f11813i0 = new C2174a(getContext());
        } else {
            this.f11813i0 = null;
        }
        setTextOnInternal(this.f11824o);
        setTextOffInternal(this.f11826q);
        t10.x();
    }

    public void n(Typeface typeface, int i10) {
        Typeface typeface2;
        int i11;
        float f10 = 0.0f;
        boolean z10 = false;
        if (i10 > 0) {
            if (typeface == null) {
                typeface2 = Typeface.defaultFromStyle(i10);
            } else {
                typeface2 = Typeface.create(typeface, i10);
            }
            setSwitchTypeface(typeface2);
            if (typeface2 != null) {
                i11 = typeface2.getStyle();
            } else {
                i11 = 0;
            }
            int i12 = (~i11) & i10;
            TextPaint textPaint = this.f11800I;
            if ((i12 & 1) != 0) {
                z10 = true;
            }
            textPaint.setFakeBoldText(z10);
            TextPaint textPaint2 = this.f11800I;
            if ((i12 & 2) != 0) {
                f10 = -0.25f;
            }
            textPaint2.setTextSkewX(f10);
            return;
        }
        this.f11800I.setFakeBoldText(false);
        this.f11800I.setTextSkewX(0.0f);
        setSwitchTypeface(typeface);
    }

    /* access modifiers changed from: protected */
    public int[] onCreateDrawableState(int i10) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i10 + 1);
        if (isChecked()) {
            View.mergeDrawableStates(onCreateDrawableState, f11791p0);
        }
        return onCreateDrawableState;
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        Layout layout;
        int i10;
        super.onDraw(canvas);
        Rect rect = this.f11823n0;
        Drawable drawable = this.f11806f;
        if (drawable != null) {
            drawable.getPadding(rect);
        } else {
            rect.setEmpty();
        }
        int i11 = this.f11796E;
        int i12 = this.f11798G;
        int i13 = i11 + rect.top;
        int i14 = i12 - rect.bottom;
        Drawable drawable2 = this.f11801a;
        if (drawable != null) {
            if (!this.f11822n || drawable2 == null) {
                drawable.draw(canvas);
            } else {
                Rect d10 = N.d(drawable2);
                drawable2.copyBounds(rect);
                rect.left += d10.left;
                rect.right -= d10.right;
                int save = canvas.save();
                canvas.clipRect(rect, Region.Op.DIFFERENCE);
                drawable.draw(canvas);
                canvas.restoreToCount(save);
            }
        }
        int save2 = canvas.save();
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
        if (getTargetCheckedState()) {
            layout = this.f11809g0;
        } else {
            layout = this.f11811h0;
        }
        if (layout != null) {
            int[] drawableState = getDrawableState();
            ColorStateList colorStateList = this.f11807f0;
            if (colorStateList != null) {
                this.f11800I.setColor(colorStateList.getColorForState(drawableState, 0));
            }
            this.f11800I.drawableState = drawableState;
            if (drawable2 != null) {
                Rect bounds = drawable2.getBounds();
                i10 = bounds.left + bounds.right;
            } else {
                i10 = getWidth();
            }
            canvas.translate((float) ((i10 / 2) - (layout.getWidth() / 2)), (float) (((i13 + i14) / 2) - (layout.getHeight() / 2)));
            layout.draw(canvas);
        }
        canvas.restoreToCount(save2);
    }

    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("android.widget.Switch");
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        CharSequence charSequence;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.Switch");
        if (Build.VERSION.SDK_INT < 30) {
            if (isChecked()) {
                charSequence = this.f11824o;
            } else {
                charSequence = this.f11826q;
            }
            if (!TextUtils.isEmpty(charSequence)) {
                CharSequence text = accessibilityNodeInfo.getText();
                if (TextUtils.isEmpty(text)) {
                    accessibilityNodeInfo.setText(charSequence);
                    return;
                }
                StringBuilder sb2 = new StringBuilder();
                sb2.append(text);
                sb2.append(' ');
                sb2.append(charSequence);
                accessibilityNodeInfo.setText(sb2);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        super.onLayout(z10, i10, i11, i12, i13);
        int i20 = 0;
        if (this.f11801a != null) {
            Rect rect = this.f11823n0;
            Drawable drawable = this.f11806f;
            if (drawable != null) {
                drawable.getPadding(rect);
            } else {
                rect.setEmpty();
            }
            Rect d10 = N.d(this.f11801a);
            i14 = Math.max(0, d10.left - rect.left);
            i20 = Math.max(0, d10.right - rect.right);
        } else {
            i14 = 0;
        }
        if (r0.b(this)) {
            i16 = getPaddingLeft() + i14;
            i15 = ((this.f11792A + i16) - i14) - i20;
        } else {
            i15 = (getWidth() - getPaddingRight()) - i20;
            i16 = (i15 - this.f11792A) + i14 + i20;
        }
        int gravity = getGravity() & 112;
        if (gravity == 16) {
            i19 = this.f11793B;
            i18 = (((getPaddingTop() + getHeight()) - getPaddingBottom()) / 2) - (i19 / 2);
        } else if (gravity != 80) {
            i18 = getPaddingTop();
            i19 = this.f11793B;
        } else {
            i17 = getHeight() - getPaddingBottom();
            i18 = i17 - this.f11793B;
            this.f11795D = i16;
            this.f11796E = i18;
            this.f11798G = i17;
            this.f11797F = i15;
        }
        i17 = i19 + i18;
        this.f11795D = i16;
        this.f11796E = i18;
        this.f11798G = i17;
        this.f11797F = i15;
    }

    public void onMeasure(int i10, int i11) {
        int i12;
        int i13;
        int i14;
        int i15;
        if (this.f11828s) {
            if (this.f11809g0 == null) {
                this.f11809g0 = i(this.f11825p);
            }
            if (this.f11811h0 == null) {
                this.f11811h0 = i(this.f11827r);
            }
        }
        Rect rect = this.f11823n0;
        Drawable drawable = this.f11801a;
        int i16 = 0;
        if (drawable != null) {
            drawable.getPadding(rect);
            i13 = (this.f11801a.getIntrinsicWidth() - rect.left) - rect.right;
            i12 = this.f11801a.getIntrinsicHeight();
        } else {
            i13 = 0;
            i12 = 0;
        }
        if (this.f11828s) {
            i14 = Math.max(this.f11809g0.getWidth(), this.f11811h0.getWidth()) + (this.f11816k * 2);
        } else {
            i14 = 0;
        }
        this.f11794C = Math.max(i14, i13);
        Drawable drawable2 = this.f11806f;
        if (drawable2 != null) {
            drawable2.getPadding(rect);
            i16 = this.f11806f.getIntrinsicHeight();
        } else {
            rect.setEmpty();
        }
        int i17 = rect.left;
        int i18 = rect.right;
        Drawable drawable3 = this.f11801a;
        if (drawable3 != null) {
            Rect d10 = N.d(drawable3);
            i17 = Math.max(i17, d10.left);
            i18 = Math.max(i18, d10.right);
        }
        if (this.f11799H) {
            i15 = Math.max(this.f11818l, (this.f11794C * 2) + i17 + i18);
        } else {
            i15 = this.f11818l;
        }
        int max = Math.max(i16, i12);
        this.f11792A = i15;
        this.f11793B = max;
        super.onMeasure(i10, i11);
        if (getMeasuredHeight() < max) {
            setMeasuredDimension(getMeasuredWidthAndState(), max);
        }
    }

    public void onPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        CharSequence charSequence;
        super.onPopulateAccessibilityEvent(accessibilityEvent);
        if (isChecked()) {
            charSequence = this.f11824o;
        } else {
            charSequence = this.f11826q;
        }
        if (charSequence != null) {
            accessibilityEvent.getText().add(charSequence);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0012, code lost:
        if (r0 != 3) goto L_0x00b7;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(android.view.MotionEvent r7) {
        /*
            r6 = this;
            android.view.VelocityTracker r0 = r6.f11833x
            r0.addMovement(r7)
            int r0 = r7.getActionMasked()
            r1 = 1
            if (r0 == 0) goto L_0x009d
            r2 = 2
            if (r0 == r1) goto L_0x0089
            if (r0 == r2) goto L_0x0016
            r3 = 3
            if (r0 == r3) goto L_0x0089
            goto L_0x00b7
        L_0x0016:
            int r0 = r6.f11829t
            if (r0 == r1) goto L_0x0055
            if (r0 == r2) goto L_0x001e
            goto L_0x00b7
        L_0x001e:
            float r7 = r7.getX()
            int r0 = r6.getThumbScrollRange()
            float r2 = r6.f11831v
            float r2 = r7 - r2
            r3 = 1065353216(0x3f800000, float:1.0)
            r4 = 0
            if (r0 == 0) goto L_0x0032
            float r0 = (float) r0
            float r2 = r2 / r0
            goto L_0x003b
        L_0x0032:
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 <= 0) goto L_0x0038
            r2 = r3
            goto L_0x003b
        L_0x0038:
            r0 = -1082130432(0xffffffffbf800000, float:-1.0)
            r2 = r0
        L_0x003b:
            boolean r0 = androidx.appcompat.widget.r0.b(r6)
            if (r0 == 0) goto L_0x0042
            float r2 = -r2
        L_0x0042:
            float r0 = r6.f11835z
            float r0 = r0 + r2
            float r0 = f(r0, r4, r3)
            float r2 = r6.f11835z
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 == 0) goto L_0x0054
            r6.f11831v = r7
            r6.setThumbPosition(r0)
        L_0x0054:
            return r1
        L_0x0055:
            float r0 = r7.getX()
            float r3 = r7.getY()
            float r4 = r6.f11831v
            float r4 = r0 - r4
            float r4 = java.lang.Math.abs(r4)
            int r5 = r6.f11830u
            float r5 = (float) r5
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 > 0) goto L_0x007b
            float r4 = r6.f11832w
            float r4 = r3 - r4
            float r4 = java.lang.Math.abs(r4)
            int r5 = r6.f11830u
            float r5 = (float) r5
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 <= 0) goto L_0x00b7
        L_0x007b:
            r6.f11829t = r2
            android.view.ViewParent r7 = r6.getParent()
            r7.requestDisallowInterceptTouchEvent(r1)
            r6.f11831v = r0
            r6.f11832w = r3
            return r1
        L_0x0089:
            int r0 = r6.f11829t
            if (r0 != r2) goto L_0x0094
            r6.q(r7)
            super.onTouchEvent(r7)
            return r1
        L_0x0094:
            r0 = 0
            r6.f11829t = r0
            android.view.VelocityTracker r0 = r6.f11833x
            r0.clear()
            goto L_0x00b7
        L_0x009d:
            float r0 = r7.getX()
            float r2 = r7.getY()
            boolean r3 = r6.isEnabled()
            if (r3 == 0) goto L_0x00b7
            boolean r3 = r6.h(r0, r2)
            if (r3 == 0) goto L_0x00b7
            r6.f11829t = r1
            r6.f11831v = r0
            r6.f11832w = r2
        L_0x00b7:
            boolean r7 = super.onTouchEvent(r7)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.b0.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void setAllCaps(boolean z10) {
        super.setAllCaps(z10);
        getEmojiTextViewHelper().d(z10);
    }

    public void setChecked(boolean z10) {
        float f10;
        super.setChecked(z10);
        boolean isChecked = isChecked();
        if (isChecked) {
            l();
        } else {
            k();
        }
        if (getWindowToken() == null || !isLaidOut()) {
            d();
            if (isChecked) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            setThumbPosition(f10);
            return;
        }
        a(isChecked);
    }

    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(i.r(this, callback));
    }

    public void setEmojiCompatEnabled(boolean z10) {
        getEmojiTextViewHelper().e(z10);
        setTextOnInternal(this.f11824o);
        setTextOffInternal(this.f11826q);
        requestLayout();
    }

    /* access modifiers changed from: protected */
    public final void setEnforceSwitchWidth(boolean z10) {
        this.f11799H = z10;
        invalidate();
    }

    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().a(inputFilterArr));
    }

    public void setShowText(boolean z10) {
        if (this.f11828s != z10) {
            this.f11828s = z10;
            requestLayout();
            if (z10) {
                p();
            }
        }
    }

    public void setSplitTrack(boolean z10) {
        this.f11822n = z10;
        invalidate();
    }

    public void setSwitchMinWidth(int i10) {
        this.f11818l = i10;
        requestLayout();
    }

    public void setSwitchPadding(int i10) {
        this.f11820m = i10;
        requestLayout();
    }

    public void setSwitchTypeface(Typeface typeface) {
        if ((this.f11800I.getTypeface() != null && !this.f11800I.getTypeface().equals(typeface)) || (this.f11800I.getTypeface() == null && typeface != null)) {
            this.f11800I.setTypeface(typeface);
            requestLayout();
            invalidate();
        }
    }

    public void setTextOff(CharSequence charSequence) {
        setTextOffInternal(charSequence);
        requestLayout();
        if (!isChecked()) {
            k();
        }
    }

    public void setTextOn(CharSequence charSequence) {
        setTextOnInternal(charSequence);
        requestLayout();
        if (isChecked()) {
            l();
        }
    }

    public void setThumbDrawable(Drawable drawable) {
        Drawable drawable2 = this.f11801a;
        if (drawable2 != null) {
            drawable2.setCallback((Drawable.Callback) null);
        }
        this.f11801a = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        requestLayout();
    }

    /* access modifiers changed from: package-private */
    public void setThumbPosition(float f10) {
        this.f11835z = f10;
        invalidate();
    }

    public void setThumbResource(int i10) {
        setThumbDrawable(C2115a.b(getContext(), i10));
    }

    public void setThumbTextPadding(int i10) {
        this.f11816k = i10;
        requestLayout();
    }

    public void setThumbTintList(ColorStateList colorStateList) {
        this.f11802b = colorStateList;
        this.f11804d = true;
        b();
    }

    public void setThumbTintMode(PorterDuff.Mode mode) {
        this.f11803c = mode;
        this.f11805e = true;
        b();
    }

    public void setTrackDrawable(Drawable drawable) {
        Drawable drawable2 = this.f11806f;
        if (drawable2 != null) {
            drawable2.setCallback((Drawable.Callback) null);
        }
        this.f11806f = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        requestLayout();
    }

    public void setTrackResource(int i10) {
        setTrackDrawable(C2115a.b(getContext(), i10));
    }

    public void setTrackTintList(ColorStateList colorStateList) {
        this.f11808g = colorStateList;
        this.f11812i = true;
        c();
    }

    public void setTrackTintMode(PorterDuff.Mode mode) {
        this.f11810h = mode;
        this.f11814j = true;
        c();
    }

    public void toggle() {
        setChecked(!isChecked());
    }

    /* access modifiers changed from: protected */
    public boolean verifyDrawable(Drawable drawable) {
        if (super.verifyDrawable(drawable) || drawable == this.f11801a || drawable == this.f11806f) {
            return true;
        }
        return false;
    }

    public b0(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C2037a.f21254I);
    }

    public b0(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f11802b = null;
        this.f11803c = null;
        this.f11804d = false;
        this.f11805e = false;
        this.f11808g = null;
        this.f11810h = null;
        this.f11812i = false;
        this.f11814j = false;
        this.f11833x = VelocityTracker.obtain();
        this.f11799H = true;
        this.f11823n0 = new Rect();
        c0.a(this, getContext());
        TextPaint textPaint = new TextPaint(1);
        this.f11800I = textPaint;
        textPaint.density = getResources().getDisplayMetrics().density;
        g0 v10 = g0.v(context, attributeSet, j.f21450D2, i10, 0);
        C1680b0.m0(this, context, j.f21450D2, attributeSet, v10.r(), i10, 0);
        Drawable g10 = v10.g(j.f21465G2);
        this.f11801a = g10;
        if (g10 != null) {
            g10.setCallback(this);
        }
        Drawable g11 = v10.g(j.f21510P2);
        this.f11806f = g11;
        if (g11 != null) {
            g11.setCallback(this);
        }
        setTextOnInternal(v10.p(j.f21455E2));
        setTextOffInternal(v10.p(j.f21460F2));
        this.f11828s = v10.a(j.f21470H2, true);
        this.f11816k = v10.f(j.f21495M2, 0);
        this.f11818l = v10.f(j.f21480J2, 0);
        this.f11820m = v10.f(j.f21485K2, 0);
        this.f11822n = v10.a(j.f21475I2, false);
        ColorStateList c10 = v10.c(j.f21500N2);
        if (c10 != null) {
            this.f11802b = c10;
            this.f11804d = true;
        }
        PorterDuff.Mode e10 = N.e(v10.k(j.f21505O2, -1), (PorterDuff.Mode) null);
        if (this.f11803c != e10) {
            this.f11803c = e10;
            this.f11805e = true;
        }
        if (this.f11804d || this.f11805e) {
            b();
        }
        ColorStateList c11 = v10.c(j.f21515Q2);
        if (c11 != null) {
            this.f11808g = c11;
            this.f11812i = true;
        }
        PorterDuff.Mode e11 = N.e(v10.k(j.f21520R2, -1), (PorterDuff.Mode) null);
        if (this.f11810h != e11) {
            this.f11810h = e11;
            this.f11814j = true;
        }
        if (this.f11812i || this.f11814j) {
            c();
        }
        int n10 = v10.n(j.f21490L2, 0);
        if (n10 != 0) {
            m(context, n10);
        }
        B b10 = new B(this);
        this.f11817k0 = b10;
        b10.m(attributeSet, i10);
        v10.x();
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.f11830u = viewConfiguration.getScaledTouchSlop();
        this.f11834y = viewConfiguration.getScaledMinimumFlingVelocity();
        getEmojiTextViewHelper().c(attributeSet, i10);
        refreshDrawableState();
        setChecked(isChecked());
    }
}
