package com.google.android.material.textfield;

import E3.C1154d;
import E3.C1164n;
import Ua.i;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStructure;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.C;
import androidx.appcompat.widget.C1572k;
import androidx.appcompat.widget.N;
import androidx.core.view.C1677a;
import androidx.core.view.C1680b0;
import androidx.core.view.C1718v;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.internal.n;
import fb.C4982c;
import ib.C5020g;
import ib.C5024k;
import j.C2115a;
import java.util.Iterator;
import java.util.LinkedHashSet;
import q1.C2429a;
import w1.C2818a;
import y1.C2930A;

public class TextInputLayout extends LinearLayout {

    /* renamed from: b1  reason: collision with root package name */
    private static final int f56118b1 = i.f52916f;

    /* renamed from: A  reason: collision with root package name */
    private CharSequence f56119A;

    /* renamed from: A0  reason: collision with root package name */
    private PorterDuff.Mode f56120A0;

    /* renamed from: B  reason: collision with root package name */
    private final TextView f56121B;

    /* renamed from: B0  reason: collision with root package name */
    private Drawable f56122B0;

    /* renamed from: C  reason: collision with root package name */
    private boolean f56123C;

    /* renamed from: C0  reason: collision with root package name */
    private int f56124C0;

    /* renamed from: D  reason: collision with root package name */
    private CharSequence f56125D;

    /* renamed from: D0  reason: collision with root package name */
    private Drawable f56126D0;

    /* renamed from: E  reason: collision with root package name */
    private boolean f56127E;

    /* renamed from: E0  reason: collision with root package name */
    private View.OnLongClickListener f56128E0;

    /* renamed from: F  reason: collision with root package name */
    private C5020g f56129F;

    /* renamed from: F0  reason: collision with root package name */
    private View.OnLongClickListener f56130F0;

    /* renamed from: G  reason: collision with root package name */
    private C5020g f56131G;

    /* renamed from: G0  reason: collision with root package name */
    private final CheckableImageButton f56132G0;

    /* renamed from: H  reason: collision with root package name */
    private C5020g f56133H;

    /* renamed from: H0  reason: collision with root package name */
    private ColorStateList f56134H0;

    /* renamed from: I  reason: collision with root package name */
    private C5024k f56135I;

    /* renamed from: I0  reason: collision with root package name */
    private PorterDuff.Mode f56136I0;

    /* renamed from: J0  reason: collision with root package name */
    private ColorStateList f56137J0;

    /* renamed from: K0  reason: collision with root package name */
    private ColorStateList f56138K0;

    /* renamed from: L0  reason: collision with root package name */
    private int f56139L0;

    /* renamed from: M0  reason: collision with root package name */
    private int f56140M0;

    /* renamed from: N0  reason: collision with root package name */
    private int f56141N0;

    /* renamed from: O0  reason: collision with root package name */
    private ColorStateList f56142O0;

    /* renamed from: P0  reason: collision with root package name */
    private int f56143P0;

    /* renamed from: Q0  reason: collision with root package name */
    private int f56144Q0;

    /* renamed from: R0  reason: collision with root package name */
    private int f56145R0;

    /* renamed from: S0  reason: collision with root package name */
    private int f56146S0;

    /* renamed from: T0  reason: collision with root package name */
    private int f56147T0;

    /* renamed from: U0  reason: collision with root package name */
    private boolean f56148U0;

    /* renamed from: V0  reason: collision with root package name */
    final com.google.android.material.internal.b f56149V0;

    /* renamed from: W0  reason: collision with root package name */
    private boolean f56150W0;

    /* renamed from: X0  reason: collision with root package name */
    private boolean f56151X0;

    /* renamed from: Y0  reason: collision with root package name */
    private ValueAnimator f56152Y0;

    /* renamed from: Z0  reason: collision with root package name */
    private boolean f56153Z0;

    /* renamed from: a  reason: collision with root package name */
    private final FrameLayout f56154a;
    /* access modifiers changed from: private */

    /* renamed from: a1  reason: collision with root package name */
    public boolean f56155a1;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final k f56156b;

    /* renamed from: c  reason: collision with root package name */
    private final LinearLayout f56157c;

    /* renamed from: d  reason: collision with root package name */
    private final FrameLayout f56158d;

    /* renamed from: e  reason: collision with root package name */
    EditText f56159e;

    /* renamed from: f  reason: collision with root package name */
    private CharSequence f56160f;

    /* renamed from: f0  reason: collision with root package name */
    private boolean f56161f0;

    /* renamed from: g  reason: collision with root package name */
    private int f56162g;

    /* renamed from: g0  reason: collision with root package name */
    private final int f56163g0;

    /* renamed from: h  reason: collision with root package name */
    private int f56164h;

    /* renamed from: h0  reason: collision with root package name */
    private int f56165h0;

    /* renamed from: i  reason: collision with root package name */
    private int f56166i;

    /* renamed from: i0  reason: collision with root package name */
    private int f56167i0;

    /* renamed from: j  reason: collision with root package name */
    private int f56168j;

    /* renamed from: j0  reason: collision with root package name */
    private int f56169j0;
    /* access modifiers changed from: private */

    /* renamed from: k  reason: collision with root package name */
    public final g f56170k;

    /* renamed from: k0  reason: collision with root package name */
    private int f56171k0;

    /* renamed from: l  reason: collision with root package name */
    boolean f56172l;

    /* renamed from: l0  reason: collision with root package name */
    private int f56173l0;

    /* renamed from: m  reason: collision with root package name */
    private int f56174m;

    /* renamed from: m0  reason: collision with root package name */
    private int f56175m0;

    /* renamed from: n  reason: collision with root package name */
    private boolean f56176n;

    /* renamed from: n0  reason: collision with root package name */
    private int f56177n0;

    /* renamed from: o  reason: collision with root package name */
    private TextView f56178o;

    /* renamed from: o0  reason: collision with root package name */
    private final Rect f56179o0;

    /* renamed from: p  reason: collision with root package name */
    private int f56180p;

    /* renamed from: p0  reason: collision with root package name */
    private final Rect f56181p0;

    /* renamed from: q  reason: collision with root package name */
    private int f56182q;

    /* renamed from: q0  reason: collision with root package name */
    private final RectF f56183q0;

    /* renamed from: r  reason: collision with root package name */
    private CharSequence f56184r;

    /* renamed from: r0  reason: collision with root package name */
    private Typeface f56185r0;
    /* access modifiers changed from: private */

    /* renamed from: s  reason: collision with root package name */
    public boolean f56186s;

    /* renamed from: s0  reason: collision with root package name */
    private Drawable f56187s0;

    /* renamed from: t  reason: collision with root package name */
    private TextView f56188t;

    /* renamed from: t0  reason: collision with root package name */
    private int f56189t0;

    /* renamed from: u  reason: collision with root package name */
    private ColorStateList f56190u;

    /* renamed from: u0  reason: collision with root package name */
    private final LinkedHashSet f56191u0;

    /* renamed from: v  reason: collision with root package name */
    private int f56192v;

    /* renamed from: v0  reason: collision with root package name */
    private int f56193v0;

    /* renamed from: w  reason: collision with root package name */
    private C1154d f56194w;

    /* renamed from: w0  reason: collision with root package name */
    private final SparseArray f56195w0;

    /* renamed from: x  reason: collision with root package name */
    private C1154d f56196x;
    /* access modifiers changed from: private */

    /* renamed from: x0  reason: collision with root package name */
    public final CheckableImageButton f56197x0;

    /* renamed from: y  reason: collision with root package name */
    private ColorStateList f56198y;

    /* renamed from: y0  reason: collision with root package name */
    private final LinkedHashSet f56199y0;

    /* renamed from: z  reason: collision with root package name */
    private ColorStateList f56200z;

    /* renamed from: z0  reason: collision with root package name */
    private ColorStateList f56201z0;

    class a implements TextWatcher {
        a() {
        }

        public void afterTextChanged(Editable editable) {
            TextInputLayout textInputLayout = TextInputLayout.this;
            textInputLayout.w0(!textInputLayout.f56155a1);
            TextInputLayout textInputLayout2 = TextInputLayout.this;
            if (textInputLayout2.f56172l) {
                textInputLayout2.m0(editable.length());
            }
            if (TextInputLayout.this.f56186s) {
                TextInputLayout.this.A0(editable.length());
            }
        }

        public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }

        public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }
    }

    class b implements Runnable {
        b() {
        }

        public void run() {
            TextInputLayout.this.f56197x0.performClick();
            TextInputLayout.this.f56197x0.jumpDrawablesToCurrentState();
        }
    }

    class c implements Runnable {
        c() {
        }

        public void run() {
            TextInputLayout.this.f56159e.requestLayout();
        }
    }

    class d implements ValueAnimator.AnimatorUpdateListener {
        d() {
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            TextInputLayout.this.f56149V0.d0(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    public static class e extends C1677a {

        /* renamed from: a  reason: collision with root package name */
        private final TextInputLayout f56206a;

        public e(TextInputLayout textInputLayout) {
            this.f56206a = textInputLayout;
        }

        public void onInitializeAccessibilityNodeInfo(View view, C2930A a10) {
            Editable editable;
            boolean z10;
            String str;
            super.onInitializeAccessibilityNodeInfo(view, a10);
            EditText editText = this.f56206a.getEditText();
            if (editText != null) {
                editable = editText.getText();
            } else {
                editable = null;
            }
            CharSequence hint = this.f56206a.getHint();
            CharSequence error = this.f56206a.getError();
            CharSequence placeholderText = this.f56206a.getPlaceholderText();
            int counterMaxLength = this.f56206a.getCounterMaxLength();
            CharSequence counterOverflowDescription = this.f56206a.getCounterOverflowDescription();
            boolean isEmpty = TextUtils.isEmpty(editable);
            boolean isEmpty2 = TextUtils.isEmpty(hint);
            boolean N10 = this.f56206a.N();
            boolean isEmpty3 = TextUtils.isEmpty(error);
            if (!isEmpty3 || !TextUtils.isEmpty(counterOverflowDescription)) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!isEmpty2) {
                str = hint.toString();
            } else {
                str = "";
            }
            this.f56206a.f56156b.v(a10);
            if (!isEmpty) {
                a10.b1(editable);
            } else if (!TextUtils.isEmpty(str)) {
                a10.b1(str);
                if (!N10 && placeholderText != null) {
                    a10.b1(str + ", " + placeholderText);
                }
            } else if (placeholderText != null) {
                a10.b1(placeholderText);
            }
            if (!TextUtils.isEmpty(str)) {
                if (Build.VERSION.SDK_INT >= 26) {
                    a10.F0(str);
                } else {
                    if (!isEmpty) {
                        str = editable + ", " + str;
                    }
                    a10.b1(str);
                }
                a10.X0(isEmpty);
            }
            if (editable == null || editable.length() != counterMaxLength) {
                counterMaxLength = -1;
            }
            a10.L0(counterMaxLength);
            if (z10) {
                if (isEmpty3) {
                    error = counterOverflowDescription;
                }
                a10.B0(error);
            }
            View s10 = this.f56206a.f56170k.s();
            if (s10 != null) {
                a10.H0(s10);
            }
        }
    }

    public interface f {
        void a(TextInputLayout textInputLayout);
    }

    public interface g {
        void a(TextInputLayout textInputLayout, int i10);
    }

    static class h extends F1.a {
        public static final Parcelable.Creator<h> CREATOR = new a();

        /* renamed from: c  reason: collision with root package name */
        CharSequence f56207c;

        /* renamed from: d  reason: collision with root package name */
        boolean f56208d;

        /* renamed from: e  reason: collision with root package name */
        CharSequence f56209e;

        /* renamed from: f  reason: collision with root package name */
        CharSequence f56210f;

        /* renamed from: g  reason: collision with root package name */
        CharSequence f56211g;

        class a implements Parcelable.ClassLoaderCreator {
            a() {
            }

            /* renamed from: a */
            public h createFromParcel(Parcel parcel) {
                return new h(parcel, (ClassLoader) null);
            }

            /* renamed from: b */
            public h createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new h(parcel, classLoader);
            }

            /* renamed from: c */
            public h[] newArray(int i10) {
                return new h[i10];
            }
        }

        h(Parcelable parcelable) {
            super(parcelable);
        }

        public String toString() {
            return "TextInputLayout.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " error=" + this.f56207c + " hint=" + this.f56209e + " helperText=" + this.f56210f + " placeholderText=" + this.f56211g + "}";
        }

        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            TextUtils.writeToParcel(this.f56207c, parcel, i10);
            parcel.writeInt(this.f56208d ? 1 : 0);
            TextUtils.writeToParcel(this.f56209e, parcel, i10);
            TextUtils.writeToParcel(this.f56210f, parcel, i10);
            TextUtils.writeToParcel(this.f56211g, parcel, i10);
        }

        h(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            Parcelable.Creator creator = TextUtils.CHAR_SEQUENCE_CREATOR;
            this.f56207c = (CharSequence) creator.createFromParcel(parcel);
            this.f56208d = parcel.readInt() != 1 ? false : true;
            this.f56209e = (CharSequence) creator.createFromParcel(parcel);
            this.f56210f = (CharSequence) creator.createFromParcel(parcel);
            this.f56211g = (CharSequence) creator.createFromParcel(parcel);
        }
    }

    public TextInputLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, Ua.a.f52720H);
    }

    private boolean A() {
        if (!this.f56123C || TextUtils.isEmpty(this.f56125D) || !(this.f56129F instanceof c)) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: private */
    public void A0(int i10) {
        if (i10 != 0 || this.f56148U0) {
            J();
        } else {
            h0();
        }
    }

    private void B() {
        Iterator it = this.f56191u0.iterator();
        while (it.hasNext()) {
            ((f) it.next()).a(this);
        }
    }

    private void B0(boolean z10, boolean z11) {
        int defaultColor = this.f56142O0.getDefaultColor();
        int colorForState = this.f56142O0.getColorForState(new int[]{16843623, 16842910}, defaultColor);
        int colorForState2 = this.f56142O0.getColorForState(new int[]{16843518, 16842910}, defaultColor);
        if (z10) {
            this.f56175m0 = colorForState2;
        } else if (z11) {
            this.f56175m0 = colorForState;
        } else {
            this.f56175m0 = defaultColor;
        }
    }

    private void C(int i10) {
        Iterator it = this.f56199y0.iterator();
        while (it.hasNext()) {
            ((g) it.next()).a(this, i10);
        }
    }

    private void C0() {
        int i10;
        if (this.f56159e != null) {
            if (K() || L()) {
                i10 = 0;
            } else {
                i10 = C1680b0.E(this.f56159e);
            }
            C1680b0.D0(this.f56121B, getContext().getResources().getDimensionPixelSize(Ua.c.f52792u), this.f56159e.getPaddingTop(), i10, this.f56159e.getPaddingBottom());
        }
    }

    private void D(Canvas canvas) {
        C5020g gVar;
        if (this.f56133H != null && (gVar = this.f56131G) != null) {
            gVar.draw(canvas);
            if (this.f56159e.isFocused()) {
                Rect bounds = this.f56133H.getBounds();
                Rect bounds2 = this.f56131G.getBounds();
                float x10 = this.f56149V0.x();
                int centerX = bounds2.centerX();
                bounds.left = Va.a.c(centerX, bounds2.left, x10);
                bounds.right = Va.a.c(centerX, bounds2.right, x10);
                this.f56133H.draw(canvas);
            }
        }
    }

    private void D0() {
        int i10;
        int visibility = this.f56121B.getVisibility();
        boolean z10 = false;
        if (this.f56119A == null || N()) {
            i10 = 8;
        } else {
            i10 = 0;
        }
        if (visibility != i10) {
            e endIconDelegate = getEndIconDelegate();
            if (i10 == 0) {
                z10 = true;
            }
            endIconDelegate.c(z10);
        }
        t0();
        this.f56121B.setVisibility(i10);
        q0();
    }

    private void E(Canvas canvas) {
        if (this.f56123C) {
            this.f56149V0.l(canvas);
        }
    }

    private void F(boolean z10) {
        ValueAnimator valueAnimator = this.f56152Y0;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.f56152Y0.cancel();
        }
        if (!z10 || !this.f56151X0) {
            this.f56149V0.d0(0.0f);
        } else {
            k(0.0f);
        }
        if (A() && ((c) this.f56129F).h0()) {
            x();
        }
        this.f56148U0 = true;
        J();
        this.f56156b.i(true);
        D0();
    }

    private int G(int i10, boolean z10) {
        int compoundPaddingLeft = i10 + this.f56159e.getCompoundPaddingLeft();
        if (getPrefixText() == null || z10) {
            return compoundPaddingLeft;
        }
        return (compoundPaddingLeft - getPrefixTextView().getMeasuredWidth()) + getPrefixTextView().getPaddingLeft();
    }

    private int H(int i10, boolean z10) {
        int compoundPaddingRight = i10 - this.f56159e.getCompoundPaddingRight();
        if (getPrefixText() == null || !z10) {
            return compoundPaddingRight;
        }
        return compoundPaddingRight + (getPrefixTextView().getMeasuredWidth() - getPrefixTextView().getPaddingRight());
    }

    private boolean I() {
        if (this.f56193v0 != 0) {
            return true;
        }
        return false;
    }

    private void J() {
        TextView textView = this.f56188t;
        if (textView != null && this.f56186s) {
            textView.setText((CharSequence) null);
            C1164n.a(this.f56154a, this.f56196x);
            this.f56188t.setVisibility(4);
        }
    }

    private boolean L() {
        if (this.f56132G0.getVisibility() == 0) {
            return true;
        }
        return false;
    }

    private boolean P() {
        if (this.f56165h0 != 1 || this.f56159e.getMinLines() > 1) {
            return false;
        }
        return true;
    }

    private void Q() {
        o();
        Z();
        E0();
        j0();
        j();
        if (this.f56165h0 != 0) {
            v0();
        }
    }

    private void R() {
        if (A()) {
            RectF rectF = this.f56183q0;
            this.f56149V0.o(rectF, this.f56159e.getWidth(), this.f56159e.getGravity());
            n(rectF);
            rectF.offset((float) (-getPaddingLeft()), (((float) (-getPaddingTop())) - (rectF.height() / 2.0f)) + ((float) this.f56169j0));
            ((c) this.f56129F).k0(rectF);
        }
    }

    private void S() {
        if (A() && !this.f56148U0) {
            x();
            R();
        }
    }

    private static void T(ViewGroup viewGroup, boolean z10) {
        int childCount = viewGroup.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = viewGroup.getChildAt(i10);
            childAt.setEnabled(z10);
            if (childAt instanceof ViewGroup) {
                T((ViewGroup) childAt, z10);
            }
        }
    }

    private void X() {
        TextView textView = this.f56188t;
        if (textView != null) {
            textView.setVisibility(8);
        }
    }

    private void Z() {
        if (g0()) {
            C1680b0.s0(this.f56159e, this.f56129F);
        }
    }

    private static void a0(CheckableImageButton checkableImageButton, View.OnLongClickListener onLongClickListener) {
        boolean z10;
        boolean N10 = C1680b0.N(checkableImageButton);
        boolean z11 = false;
        int i10 = 1;
        if (onLongClickListener != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (N10 || z10) {
            z11 = true;
        }
        checkableImageButton.setFocusable(z11);
        checkableImageButton.setClickable(N10);
        checkableImageButton.setPressable(N10);
        checkableImageButton.setLongClickable(z10);
        if (!z11) {
            i10 = 2;
        }
        C1680b0.y0(checkableImageButton, i10);
    }

    private static void b0(CheckableImageButton checkableImageButton, View.OnClickListener onClickListener, View.OnLongClickListener onLongClickListener) {
        checkableImageButton.setOnClickListener(onClickListener);
        a0(checkableImageButton, onLongClickListener);
    }

    private static void c0(CheckableImageButton checkableImageButton, View.OnLongClickListener onLongClickListener) {
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        a0(checkableImageButton, onLongClickListener);
    }

    private boolean e0() {
        if ((this.f56132G0.getVisibility() == 0 || ((I() && K()) || this.f56119A != null)) && this.f56157c.getMeasuredWidth() > 0) {
            return true;
        }
        return false;
    }

    private boolean f0() {
        if ((getStartIconDrawable() != null || (getPrefixText() != null && getPrefixTextView().getVisibility() == 0)) && this.f56156b.getMeasuredWidth() > 0) {
            return true;
        }
        return false;
    }

    private boolean g0() {
        EditText editText = this.f56159e;
        if (editText == null || this.f56129F == null || editText.getBackground() != null || this.f56165h0 == 0) {
            return false;
        }
        return true;
    }

    private e getEndIconDelegate() {
        e eVar = (e) this.f56195w0.get(this.f56193v0);
        if (eVar != null) {
            return eVar;
        }
        return (e) this.f56195w0.get(0);
    }

    private CheckableImageButton getEndIconToUpdateDummyDrawable() {
        if (this.f56132G0.getVisibility() == 0) {
            return this.f56132G0;
        }
        if (!I() || !K()) {
            return null;
        }
        return this.f56197x0;
    }

    private void h0() {
        if (this.f56188t != null && this.f56186s && !TextUtils.isEmpty(this.f56184r)) {
            this.f56188t.setText(this.f56184r);
            C1164n.a(this.f56154a, this.f56194w);
            this.f56188t.setVisibility(0);
            this.f56188t.bringToFront();
            announceForAccessibility(this.f56184r);
        }
    }

    private void i() {
        TextView textView = this.f56188t;
        if (textView != null) {
            this.f56154a.addView(textView);
            this.f56188t.setVisibility(0);
        }
    }

    private void i0(boolean z10) {
        if (!z10 || getEndIconDrawable() == null) {
            f.a(this, this.f56197x0, this.f56201z0, this.f56120A0);
            return;
        }
        Drawable mutate = C2429a.l(getEndIconDrawable()).mutate();
        C2429a.h(mutate, this.f56170k.p());
        this.f56197x0.setImageDrawable(mutate);
    }

    private void j() {
        if (this.f56159e != null && this.f56165h0 == 1) {
            if (C4982c.h(getContext())) {
                EditText editText = this.f56159e;
                C1680b0.D0(editText, C1680b0.F(editText), getResources().getDimensionPixelSize(Ua.c.f52786o), C1680b0.E(this.f56159e), getResources().getDimensionPixelSize(Ua.c.f52785n));
            } else if (C4982c.g(getContext())) {
                EditText editText2 = this.f56159e;
                C1680b0.D0(editText2, C1680b0.F(editText2), getResources().getDimensionPixelSize(Ua.c.f52784m), C1680b0.E(this.f56159e), getResources().getDimensionPixelSize(Ua.c.f52783l));
            }
        }
    }

    private void j0() {
        if (this.f56165h0 != 1) {
            return;
        }
        if (C4982c.h(getContext())) {
            this.f56167i0 = getResources().getDimensionPixelSize(Ua.c.f52788q);
        } else if (C4982c.g(getContext())) {
            this.f56167i0 = getResources().getDimensionPixelSize(Ua.c.f52787p);
        }
    }

    private void k0(Rect rect) {
        C5020g gVar = this.f56131G;
        if (gVar != null) {
            int i10 = rect.bottom;
            gVar.setBounds(rect.left, i10 - this.f56171k0, rect.right, i10);
        }
        C5020g gVar2 = this.f56133H;
        if (gVar2 != null) {
            int i11 = rect.bottom;
            gVar2.setBounds(rect.left, i11 - this.f56173l0, rect.right, i11);
        }
    }

    private void l() {
        C5020g gVar = this.f56129F;
        if (gVar != null) {
            C5024k C10 = gVar.C();
            C5024k kVar = this.f56135I;
            if (C10 != kVar) {
                this.f56129F.setShapeAppearanceModel(kVar);
                p0();
            }
            if (v()) {
                this.f56129F.a0((float) this.f56169j0, this.f56175m0);
            }
            int p10 = p();
            this.f56177n0 = p10;
            this.f56129F.W(ColorStateList.valueOf(p10));
            if (this.f56193v0 == 3) {
                this.f56159e.getBackground().invalidateSelf();
            }
            m();
            invalidate();
        }
    }

    private void l0() {
        int i10;
        if (this.f56178o != null) {
            EditText editText = this.f56159e;
            if (editText == null) {
                i10 = 0;
            } else {
                i10 = editText.getText().length();
            }
            m0(i10);
        }
    }

    private void m() {
        ColorStateList colorStateList;
        if (this.f56131G != null && this.f56133H != null) {
            if (w()) {
                C5020g gVar = this.f56131G;
                if (this.f56159e.isFocused()) {
                    colorStateList = ColorStateList.valueOf(this.f56139L0);
                } else {
                    colorStateList = ColorStateList.valueOf(this.f56175m0);
                }
                gVar.W(colorStateList);
                this.f56133H.W(ColorStateList.valueOf(this.f56175m0));
            }
            invalidate();
        }
    }

    private void n(RectF rectF) {
        float f10 = rectF.left;
        int i10 = this.f56163g0;
        rectF.left = f10 - ((float) i10);
        rectF.right += (float) i10;
    }

    private static void n0(Context context, TextView textView, int i10, int i11, boolean z10) {
        int i12;
        if (z10) {
            i12 = Ua.h.f52887c;
        } else {
            i12 = Ua.h.f52886b;
        }
        textView.setContentDescription(context.getString(i12, new Object[]{Integer.valueOf(i10), Integer.valueOf(i11)}));
    }

    private void o() {
        int i10 = this.f56165h0;
        if (i10 == 0) {
            this.f56129F = null;
            this.f56131G = null;
            this.f56133H = null;
        } else if (i10 == 1) {
            this.f56129F = new C5020g(this.f56135I);
            this.f56131G = new C5020g();
            this.f56133H = new C5020g();
        } else if (i10 == 2) {
            if (!this.f56123C || (this.f56129F instanceof c)) {
                this.f56129F = new C5020g(this.f56135I);
            } else {
                this.f56129F = new c(this.f56135I);
            }
            this.f56131G = null;
            this.f56133H = null;
        } else {
            throw new IllegalArgumentException(this.f56165h0 + " is illegal; only @BoxBackgroundMode constants are supported.");
        }
    }

    private void o0() {
        int i10;
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        TextView textView = this.f56178o;
        if (textView != null) {
            if (this.f56176n) {
                i10 = this.f56180p;
            } else {
                i10 = this.f56182q;
            }
            d0(textView, i10);
            if (!this.f56176n && (colorStateList2 = this.f56198y) != null) {
                this.f56178o.setTextColor(colorStateList2);
            }
            if (this.f56176n && (colorStateList = this.f56200z) != null) {
                this.f56178o.setTextColor(colorStateList);
            }
        }
    }

    private int p() {
        int i10 = this.f56177n0;
        if (this.f56165h0 == 1) {
            return Ya.a.g(Ya.a.e(this, Ua.a.f52734l, 0), this.f56177n0);
        }
        return i10;
    }

    private void p0() {
        if (this.f56193v0 == 3 && this.f56165h0 == 2) {
            ((d) this.f56195w0.get(3)).J((AutoCompleteTextView) this.f56159e);
        }
    }

    private Rect q(Rect rect) {
        if (this.f56159e != null) {
            Rect rect2 = this.f56181p0;
            boolean e10 = n.e(this);
            rect2.bottom = rect.bottom;
            int i10 = this.f56165h0;
            if (i10 == 1) {
                rect2.left = G(rect.left, e10);
                rect2.top = rect.top + this.f56167i0;
                rect2.right = H(rect.right, e10);
                return rect2;
            } else if (i10 != 2) {
                rect2.left = G(rect.left, e10);
                rect2.top = getPaddingTop();
                rect2.right = H(rect.right, e10);
                return rect2;
            } else {
                rect2.left = rect.left + this.f56159e.getPaddingLeft();
                rect2.top = rect.top - u();
                rect2.right = rect.right - this.f56159e.getPaddingRight();
                return rect2;
            }
        } else {
            throw new IllegalStateException();
        }
    }

    private int r(Rect rect, Rect rect2, float f10) {
        if (P()) {
            return (int) (((float) rect2.top) + f10);
        }
        return rect.bottom - this.f56159e.getCompoundPaddingBottom();
    }

    private int s(Rect rect, float f10) {
        if (P()) {
            return (int) (((float) rect.centerY()) - (f10 / 2.0f));
        }
        return rect.top + this.f56159e.getCompoundPaddingTop();
    }

    private boolean s0() {
        int max;
        if (this.f56159e == null || this.f56159e.getMeasuredHeight() >= (max = Math.max(this.f56157c.getMeasuredHeight(), this.f56156b.getMeasuredHeight()))) {
            return false;
        }
        this.f56159e.setMinimumHeight(max);
        return true;
    }

    private void setEditText(EditText editText) {
        if (this.f56159e == null) {
            if (this.f56193v0 != 3 && !(editText instanceof TextInputEditText)) {
                Log.i("TextInputLayout", "EditText added is not a TextInputEditText. Please switch to using that class instead.");
            }
            this.f56159e = editText;
            int i10 = this.f56162g;
            if (i10 != -1) {
                setMinEms(i10);
            } else {
                setMinWidth(this.f56166i);
            }
            int i11 = this.f56164h;
            if (i11 != -1) {
                setMaxEms(i11);
            } else {
                setMaxWidth(this.f56168j);
            }
            Q();
            setTextInputAccessibilityDelegate(new e(this));
            this.f56149V0.j0(this.f56159e.getTypeface());
            this.f56149V0.b0(this.f56159e.getTextSize());
            this.f56149V0.X(this.f56159e.getLetterSpacing());
            int gravity = this.f56159e.getGravity();
            this.f56149V0.S((gravity & -113) | 48);
            this.f56149V0.a0(gravity);
            this.f56159e.addTextChangedListener(new a());
            if (this.f56137J0 == null) {
                this.f56137J0 = this.f56159e.getHintTextColors();
            }
            if (this.f56123C) {
                if (TextUtils.isEmpty(this.f56125D)) {
                    CharSequence hint = this.f56159e.getHint();
                    this.f56160f = hint;
                    setHint(hint);
                    this.f56159e.setHint((CharSequence) null);
                }
                this.f56127E = true;
            }
            if (this.f56178o != null) {
                m0(this.f56159e.getText().length());
            }
            r0();
            this.f56170k.f();
            this.f56156b.bringToFront();
            this.f56157c.bringToFront();
            this.f56158d.bringToFront();
            this.f56132G0.bringToFront();
            B();
            C0();
            if (!isEnabled()) {
                editText.setEnabled(false);
            }
            x0(false, true);
            return;
        }
        throw new IllegalArgumentException("We already have an EditText, can only have one");
    }

    private void setHintInternal(CharSequence charSequence) {
        if (!TextUtils.equals(charSequence, this.f56125D)) {
            this.f56125D = charSequence;
            this.f56149V0.h0(charSequence);
            if (!this.f56148U0) {
                R();
            }
        }
    }

    private void setPlaceholderTextEnabled(boolean z10) {
        if (this.f56186s != z10) {
            if (z10) {
                i();
            } else {
                X();
                this.f56188t = null;
            }
            this.f56186s = z10;
        }
    }

    private Rect t(Rect rect) {
        if (this.f56159e != null) {
            Rect rect2 = this.f56181p0;
            float w10 = this.f56149V0.w();
            rect2.left = rect.left + this.f56159e.getCompoundPaddingLeft();
            rect2.top = s(rect, w10);
            rect2.right = rect.right - this.f56159e.getCompoundPaddingRight();
            rect2.bottom = r(rect, rect2, w10);
            return rect2;
        }
        throw new IllegalStateException();
    }

    private void t0() {
        int i10;
        boolean z10;
        boolean z11;
        FrameLayout frameLayout = this.f56158d;
        int i11 = 8;
        if (this.f56197x0.getVisibility() != 0 || L()) {
            i10 = 8;
        } else {
            i10 = 0;
        }
        frameLayout.setVisibility(i10);
        if (this.f56119A == null || N()) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (K() || L() || !z10) {
            z11 = true;
        } else {
            z11 = false;
        }
        LinearLayout linearLayout = this.f56157c;
        if (z11) {
            i11 = 0;
        }
        linearLayout.setVisibility(i11);
    }

    private int u() {
        float q10;
        if (!this.f56123C) {
            return 0;
        }
        int i10 = this.f56165h0;
        if (i10 == 0) {
            q10 = this.f56149V0.q();
        } else if (i10 != 2) {
            return 0;
        } else {
            q10 = this.f56149V0.q() / 2.0f;
        }
        return (int) q10;
    }

    private void u0() {
        boolean z10;
        int i10 = 0;
        if (getErrorIconDrawable() == null || !this.f56170k.z() || !this.f56170k.l()) {
            z10 = false;
        } else {
            z10 = true;
        }
        CheckableImageButton checkableImageButton = this.f56132G0;
        if (!z10) {
            i10 = 8;
        }
        checkableImageButton.setVisibility(i10);
        t0();
        C0();
        if (!I()) {
            q0();
        }
    }

    private boolean v() {
        if (this.f56165h0 != 2 || !w()) {
            return false;
        }
        return true;
    }

    private void v0() {
        if (this.f56165h0 != 1) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f56154a.getLayoutParams();
            int u10 = u();
            if (u10 != layoutParams.topMargin) {
                layoutParams.topMargin = u10;
                this.f56154a.requestLayout();
            }
        }
    }

    private boolean w() {
        if (this.f56169j0 <= -1 || this.f56175m0 == 0) {
            return false;
        }
        return true;
    }

    private void x() {
        if (A()) {
            ((c) this.f56129F).i0();
        }
    }

    private void x0(boolean z10, boolean z11) {
        boolean z12;
        ColorStateList colorStateList;
        TextView textView;
        int i10;
        boolean isEnabled = isEnabled();
        EditText editText = this.f56159e;
        boolean z13 = false;
        if (editText == null || TextUtils.isEmpty(editText.getText())) {
            z12 = false;
        } else {
            z12 = true;
        }
        EditText editText2 = this.f56159e;
        if (editText2 != null && editText2.hasFocus()) {
            z13 = true;
        }
        boolean l10 = this.f56170k.l();
        ColorStateList colorStateList2 = this.f56137J0;
        if (colorStateList2 != null) {
            this.f56149V0.R(colorStateList2);
            this.f56149V0.Z(this.f56137J0);
        }
        if (!isEnabled) {
            ColorStateList colorStateList3 = this.f56137J0;
            if (colorStateList3 != null) {
                i10 = colorStateList3.getColorForState(new int[]{-16842910}, this.f56147T0);
            } else {
                i10 = this.f56147T0;
            }
            this.f56149V0.R(ColorStateList.valueOf(i10));
            this.f56149V0.Z(ColorStateList.valueOf(i10));
        } else if (l10) {
            this.f56149V0.R(this.f56170k.q());
        } else if (this.f56176n && (textView = this.f56178o) != null) {
            this.f56149V0.R(textView.getTextColors());
        } else if (z13 && (colorStateList = this.f56138K0) != null) {
            this.f56149V0.R(colorStateList);
        }
        if (z12 || !this.f56150W0 || (isEnabled() && z13)) {
            if (z11 || this.f56148U0) {
                y(z10);
            }
        } else if (z11 || !this.f56148U0) {
            F(z10);
        }
    }

    private void y(boolean z10) {
        ValueAnimator valueAnimator = this.f56152Y0;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.f56152Y0.cancel();
        }
        if (!z10 || !this.f56151X0) {
            this.f56149V0.d0(1.0f);
        } else {
            k(1.0f);
        }
        this.f56148U0 = false;
        if (A()) {
            R();
        }
        z0();
        this.f56156b.i(false);
        D0();
    }

    private void y0() {
        EditText editText;
        if (this.f56188t != null && (editText = this.f56159e) != null) {
            this.f56188t.setGravity(editText.getGravity());
            this.f56188t.setPadding(this.f56159e.getCompoundPaddingLeft(), this.f56159e.getCompoundPaddingTop(), this.f56159e.getCompoundPaddingRight(), this.f56159e.getCompoundPaddingBottom());
        }
    }

    private C1154d z() {
        C1154d dVar = new C1154d();
        dVar.X(87);
        dVar.Z(Va.a.f53418a);
        return dVar;
    }

    private void z0() {
        int i10;
        EditText editText = this.f56159e;
        if (editText == null) {
            i10 = 0;
        } else {
            i10 = editText.getText().length();
        }
        A0(i10);
    }

    /* access modifiers changed from: package-private */
    public void E0() {
        boolean z10;
        TextView textView;
        EditText editText;
        EditText editText2;
        if (this.f56129F != null && this.f56165h0 != 0) {
            boolean z11 = false;
            if (isFocused() || ((editText2 = this.f56159e) != null && editText2.hasFocus())) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (isHovered() || ((editText = this.f56159e) != null && editText.isHovered())) {
                z11 = true;
            }
            if (!isEnabled()) {
                this.f56175m0 = this.f56147T0;
            } else if (this.f56170k.l()) {
                if (this.f56142O0 != null) {
                    B0(z10, z11);
                } else {
                    this.f56175m0 = this.f56170k.p();
                }
            } else if (!this.f56176n || (textView = this.f56178o) == null) {
                if (z10) {
                    this.f56175m0 = this.f56141N0;
                } else if (z11) {
                    this.f56175m0 = this.f56140M0;
                } else {
                    this.f56175m0 = this.f56139L0;
                }
            } else if (this.f56142O0 != null) {
                B0(z10, z11);
            } else {
                this.f56175m0 = textView.getCurrentTextColor();
            }
            u0();
            V();
            W();
            U();
            if (getEndIconDelegate().d()) {
                i0(this.f56170k.l());
            }
            if (this.f56165h0 == 2) {
                int i10 = this.f56169j0;
                if (!z10 || !isEnabled()) {
                    this.f56169j0 = this.f56171k0;
                } else {
                    this.f56169j0 = this.f56173l0;
                }
                if (this.f56169j0 != i10) {
                    S();
                }
            }
            if (this.f56165h0 == 1) {
                if (!isEnabled()) {
                    this.f56177n0 = this.f56144Q0;
                } else if (z11 && !z10) {
                    this.f56177n0 = this.f56146S0;
                } else if (z10) {
                    this.f56177n0 = this.f56145R0;
                } else {
                    this.f56177n0 = this.f56143P0;
                }
            }
            l();
        }
    }

    public boolean K() {
        if (this.f56158d.getVisibility() == 0 && this.f56197x0.getVisibility() == 0) {
            return true;
        }
        return false;
    }

    public boolean M() {
        return this.f56170k.A();
    }

    /* access modifiers changed from: package-private */
    public final boolean N() {
        return this.f56148U0;
    }

    public boolean O() {
        return this.f56127E;
    }

    public void U() {
        f.c(this, this.f56197x0, this.f56201z0);
    }

    public void V() {
        f.c(this, this.f56132G0, this.f56134H0);
    }

    public void W() {
        this.f56156b.j();
    }

    public void Y(float f10, float f11, float f12, float f13) {
        float f14;
        float f15;
        boolean e10 = n.e(this);
        this.f56161f0 = e10;
        if (e10) {
            f14 = f11;
        } else {
            f14 = f10;
        }
        if (!e10) {
            f10 = f11;
        }
        if (e10) {
            f15 = f13;
        } else {
            f15 = f12;
        }
        if (!e10) {
            f12 = f13;
        }
        C5020g gVar = this.f56129F;
        if (gVar == null || gVar.F() != f14 || this.f56129F.G() != f10 || this.f56129F.s() != f15 || this.f56129F.t() != f12) {
            this.f56135I = this.f56135I.v().B(f14).G(f10).s(f15).w(f12).m();
            l();
        }
    }

    public void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        if (view instanceof EditText) {
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(layoutParams);
            layoutParams2.gravity = (layoutParams2.gravity & -113) | 16;
            this.f56154a.addView(view, layoutParams2);
            this.f56154a.setLayoutParams(layoutParams);
            v0();
            setEditText((EditText) view);
            return;
        }
        super.addView(view, i10, layoutParams);
    }

    /* access modifiers changed from: package-private */
    public void d0(TextView textView, int i10) {
        try {
            androidx.core.widget.i.o(textView, i10);
            if (textView.getTextColors().getDefaultColor() != -65281) {
                return;
            }
        } catch (Exception unused) {
        }
        androidx.core.widget.i.o(textView, i.f52911a);
        textView.setTextColor(androidx.core.content.c.getColor(getContext(), Ua.b.f52749a));
    }

    public void dispatchProvideAutofillStructure(ViewStructure viewStructure, int i10) {
        EditText editText = this.f56159e;
        if (editText == null) {
            super.dispatchProvideAutofillStructure(viewStructure, i10);
            return;
        }
        if (this.f56160f != null) {
            boolean z10 = this.f56127E;
            this.f56127E = false;
            CharSequence hint = editText.getHint();
            this.f56159e.setHint(this.f56160f);
            try {
                super.dispatchProvideAutofillStructure(viewStructure, i10);
            } finally {
                this.f56159e.setHint(hint);
                this.f56127E = z10;
            }
        } else {
            viewStructure.setAutofillId(getAutofillId());
            onProvideAutofillStructure(viewStructure, i10);
            onProvideAutofillVirtualStructure(viewStructure, i10);
            viewStructure.setChildCount(this.f56154a.getChildCount());
            for (int i11 = 0; i11 < this.f56154a.getChildCount(); i11++) {
                View childAt = this.f56154a.getChildAt(i11);
                ViewStructure newChild = viewStructure.newChild(i11);
                childAt.dispatchProvideAutofillStructure(newChild, i10);
                if (childAt == this.f56159e) {
                    newChild.setHint(getHint());
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    public void dispatchRestoreInstanceState(SparseArray sparseArray) {
        this.f56155a1 = true;
        super.dispatchRestoreInstanceState(sparseArray);
        this.f56155a1 = false;
    }

    public void draw(Canvas canvas) {
        super.draw(canvas);
        E(canvas);
        D(canvas);
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        boolean z10;
        if (!this.f56153Z0) {
            boolean z11 = true;
            this.f56153Z0 = true;
            super.drawableStateChanged();
            int[] drawableState = getDrawableState();
            com.google.android.material.internal.b bVar = this.f56149V0;
            if (bVar != null) {
                z10 = bVar.g0(drawableState);
            } else {
                z10 = false;
            }
            if (this.f56159e != null) {
                if (!C1680b0.S(this) || !isEnabled()) {
                    z11 = false;
                }
                w0(z11);
            }
            r0();
            E0();
            if (z10) {
                invalidate();
            }
            this.f56153Z0 = false;
        }
    }

    public void g(f fVar) {
        this.f56191u0.add(fVar);
        if (this.f56159e != null) {
            fVar.a(this);
        }
    }

    public int getBaseline() {
        EditText editText = this.f56159e;
        if (editText != null) {
            return editText.getBaseline() + getPaddingTop() + u();
        }
        return super.getBaseline();
    }

    /* access modifiers changed from: package-private */
    public C5020g getBoxBackground() {
        int i10 = this.f56165h0;
        if (i10 == 1 || i10 == 2) {
            return this.f56129F;
        }
        throw new IllegalStateException();
    }

    public int getBoxBackgroundColor() {
        return this.f56177n0;
    }

    public int getBoxBackgroundMode() {
        return this.f56165h0;
    }

    public int getBoxCollapsedPaddingTop() {
        return this.f56167i0;
    }

    public float getBoxCornerRadiusBottomEnd() {
        if (n.e(this)) {
            return this.f56135I.j().a(this.f56183q0);
        }
        return this.f56135I.l().a(this.f56183q0);
    }

    public float getBoxCornerRadiusBottomStart() {
        if (n.e(this)) {
            return this.f56135I.l().a(this.f56183q0);
        }
        return this.f56135I.j().a(this.f56183q0);
    }

    public float getBoxCornerRadiusTopEnd() {
        if (n.e(this)) {
            return this.f56135I.r().a(this.f56183q0);
        }
        return this.f56135I.t().a(this.f56183q0);
    }

    public float getBoxCornerRadiusTopStart() {
        if (n.e(this)) {
            return this.f56135I.t().a(this.f56183q0);
        }
        return this.f56135I.r().a(this.f56183q0);
    }

    public int getBoxStrokeColor() {
        return this.f56141N0;
    }

    public ColorStateList getBoxStrokeErrorColor() {
        return this.f56142O0;
    }

    public int getBoxStrokeWidth() {
        return this.f56171k0;
    }

    public int getBoxStrokeWidthFocused() {
        return this.f56173l0;
    }

    public int getCounterMaxLength() {
        return this.f56174m;
    }

    /* access modifiers changed from: package-private */
    public CharSequence getCounterOverflowDescription() {
        TextView textView;
        if (!this.f56172l || !this.f56176n || (textView = this.f56178o) == null) {
            return null;
        }
        return textView.getContentDescription();
    }

    public ColorStateList getCounterOverflowTextColor() {
        return this.f56198y;
    }

    public ColorStateList getCounterTextColor() {
        return this.f56198y;
    }

    public ColorStateList getDefaultHintTextColor() {
        return this.f56137J0;
    }

    public EditText getEditText() {
        return this.f56159e;
    }

    public CharSequence getEndIconContentDescription() {
        return this.f56197x0.getContentDescription();
    }

    public Drawable getEndIconDrawable() {
        return this.f56197x0.getDrawable();
    }

    public int getEndIconMode() {
        return this.f56193v0;
    }

    /* access modifiers changed from: package-private */
    public CheckableImageButton getEndIconView() {
        return this.f56197x0;
    }

    public CharSequence getError() {
        if (this.f56170k.z()) {
            return this.f56170k.o();
        }
        return null;
    }

    public CharSequence getErrorContentDescription() {
        return this.f56170k.n();
    }

    public int getErrorCurrentTextColors() {
        return this.f56170k.p();
    }

    public Drawable getErrorIconDrawable() {
        return this.f56132G0.getDrawable();
    }

    /* access modifiers changed from: package-private */
    public final int getErrorTextCurrentColor() {
        return this.f56170k.p();
    }

    public CharSequence getHelperText() {
        if (this.f56170k.A()) {
            return this.f56170k.r();
        }
        return null;
    }

    public int getHelperTextCurrentTextColor() {
        return this.f56170k.t();
    }

    public CharSequence getHint() {
        if (this.f56123C) {
            return this.f56125D;
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public final float getHintCollapsedTextHeight() {
        return this.f56149V0.q();
    }

    /* access modifiers changed from: package-private */
    public final int getHintCurrentCollapsedTextColor() {
        return this.f56149V0.t();
    }

    public ColorStateList getHintTextColor() {
        return this.f56138K0;
    }

    public int getMaxEms() {
        return this.f56164h;
    }

    public int getMaxWidth() {
        return this.f56168j;
    }

    public int getMinEms() {
        return this.f56162g;
    }

    public int getMinWidth() {
        return this.f56166i;
    }

    @Deprecated
    public CharSequence getPasswordVisibilityToggleContentDescription() {
        return this.f56197x0.getContentDescription();
    }

    @Deprecated
    public Drawable getPasswordVisibilityToggleDrawable() {
        return this.f56197x0.getDrawable();
    }

    public CharSequence getPlaceholderText() {
        if (this.f56186s) {
            return this.f56184r;
        }
        return null;
    }

    public int getPlaceholderTextAppearance() {
        return this.f56192v;
    }

    public ColorStateList getPlaceholderTextColor() {
        return this.f56190u;
    }

    public CharSequence getPrefixText() {
        return this.f56156b.a();
    }

    public ColorStateList getPrefixTextColor() {
        return this.f56156b.b();
    }

    public TextView getPrefixTextView() {
        return this.f56156b.c();
    }

    public CharSequence getStartIconContentDescription() {
        return this.f56156b.d();
    }

    public Drawable getStartIconDrawable() {
        return this.f56156b.e();
    }

    public CharSequence getSuffixText() {
        return this.f56119A;
    }

    public ColorStateList getSuffixTextColor() {
        return this.f56121B.getTextColors();
    }

    public TextView getSuffixTextView() {
        return this.f56121B;
    }

    public Typeface getTypeface() {
        return this.f56185r0;
    }

    public void h(g gVar) {
        this.f56199y0.add(gVar);
    }

    /* access modifiers changed from: package-private */
    public void k(float f10) {
        if (this.f56149V0.x() != f10) {
            if (this.f56152Y0 == null) {
                ValueAnimator valueAnimator = new ValueAnimator();
                this.f56152Y0 = valueAnimator;
                valueAnimator.setInterpolator(Va.a.f53419b);
                this.f56152Y0.setDuration(167);
                this.f56152Y0.addUpdateListener(new d());
            }
            this.f56152Y0.setFloatValues(new float[]{this.f56149V0.x(), f10});
            this.f56152Y0.start();
        }
    }

    /* access modifiers changed from: package-private */
    public void m0(int i10) {
        boolean z10;
        boolean z11 = this.f56176n;
        int i11 = this.f56174m;
        if (i11 == -1) {
            this.f56178o.setText(String.valueOf(i10));
            this.f56178o.setContentDescription((CharSequence) null);
            this.f56176n = false;
        } else {
            if (i10 > i11) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.f56176n = z10;
            n0(getContext(), this.f56178o, i10, this.f56174m, this.f56176n);
            if (z11 != this.f56176n) {
                o0();
            }
            this.f56178o.setText(C2818a.c().j(getContext().getString(Ua.h.f52888d, new Object[]{Integer.valueOf(i10), Integer.valueOf(this.f56174m)})));
        }
        if (this.f56159e != null && z11 != this.f56176n) {
            w0(false);
            E0();
            r0();
        }
    }

    /* access modifiers changed from: protected */
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f56149V0.H(configuration);
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        EditText editText = this.f56159e;
        if (editText != null) {
            Rect rect = this.f56179o0;
            com.google.android.material.internal.c.a(this, editText, rect);
            k0(rect);
            if (this.f56123C) {
                this.f56149V0.b0(this.f56159e.getTextSize());
                int gravity = this.f56159e.getGravity();
                this.f56149V0.S((gravity & -113) | 48);
                this.f56149V0.a0(gravity);
                this.f56149V0.O(q(rect));
                this.f56149V0.W(t(rect));
                this.f56149V0.K();
                if (A() && !this.f56148U0) {
                    R();
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        boolean s02 = s0();
        boolean q02 = q0();
        if (s02 || q02) {
            this.f56159e.post(new c());
        }
        y0();
        C0();
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof h)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        h hVar = (h) parcelable;
        super.onRestoreInstanceState(hVar.a());
        setError(hVar.f56207c);
        if (hVar.f56208d) {
            this.f56197x0.post(new b());
        }
        setHint(hVar.f56209e);
        setHelperText(hVar.f56210f);
        setPlaceholderText(hVar.f56211g);
        requestLayout();
    }

    public void onRtlPropertiesChanged(int i10) {
        boolean z10;
        float f10;
        float f11;
        super.onRtlPropertiesChanged(i10);
        boolean z11 = false;
        if (i10 == 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        boolean z12 = this.f56161f0;
        if (z10 != z12) {
            if (z10 && !z12) {
                z11 = true;
            }
            float a10 = this.f56135I.r().a(this.f56183q0);
            float a11 = this.f56135I.t().a(this.f56183q0);
            float a12 = this.f56135I.j().a(this.f56183q0);
            float a13 = this.f56135I.l().a(this.f56183q0);
            if (z11) {
                f10 = a10;
            } else {
                f10 = a11;
            }
            if (z11) {
                a10 = a11;
            }
            if (z11) {
                f11 = a12;
            } else {
                f11 = a13;
            }
            if (z11) {
                a12 = a13;
            }
            Y(f10, a10, f11, a12);
        }
    }

    public Parcelable onSaveInstanceState() {
        boolean z10;
        h hVar = new h(super.onSaveInstanceState());
        if (this.f56170k.l()) {
            hVar.f56207c = getError();
        }
        if (!I() || !this.f56197x0.isChecked()) {
            z10 = false;
        } else {
            z10 = true;
        }
        hVar.f56208d = z10;
        hVar.f56209e = getHint();
        hVar.f56210f = getHelperText();
        hVar.f56211g = getPlaceholderText();
        return hVar;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0069  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00d2  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean q0() {
        /*
            r10 = this;
            android.widget.EditText r0 = r10.f56159e
            r1 = 0
            if (r0 != 0) goto L_0x0006
            return r1
        L_0x0006:
            boolean r0 = r10.f0()
            r2 = 0
            r3 = 2
            r4 = 3
            r5 = 1
            if (r0 == 0) goto L_0x0049
            com.google.android.material.textfield.k r0 = r10.f56156b
            int r0 = r0.getMeasuredWidth()
            android.widget.EditText r6 = r10.f56159e
            int r6 = r6.getPaddingLeft()
            int r0 = r0 - r6
            android.graphics.drawable.Drawable r6 = r10.f56187s0
            if (r6 == 0) goto L_0x0025
            int r6 = r10.f56189t0
            if (r6 == r0) goto L_0x0031
        L_0x0025:
            android.graphics.drawable.ColorDrawable r6 = new android.graphics.drawable.ColorDrawable
            r6.<init>()
            r10.f56187s0 = r6
            r10.f56189t0 = r0
            r6.setBounds(r1, r1, r0, r5)
        L_0x0031:
            android.widget.EditText r0 = r10.f56159e
            android.graphics.drawable.Drawable[] r0 = androidx.core.widget.i.a(r0)
            r6 = r0[r1]
            android.graphics.drawable.Drawable r7 = r10.f56187s0
            if (r6 == r7) goto L_0x0062
            android.widget.EditText r6 = r10.f56159e
            r8 = r0[r5]
            r9 = r0[r3]
            r0 = r0[r4]
            androidx.core.widget.i.i(r6, r7, r8, r9, r0)
            goto L_0x0060
        L_0x0049:
            android.graphics.drawable.Drawable r0 = r10.f56187s0
            if (r0 == 0) goto L_0x0062
            android.widget.EditText r0 = r10.f56159e
            android.graphics.drawable.Drawable[] r0 = androidx.core.widget.i.a(r0)
            android.widget.EditText r6 = r10.f56159e
            r7 = r0[r5]
            r8 = r0[r3]
            r0 = r0[r4]
            androidx.core.widget.i.i(r6, r2, r7, r8, r0)
            r10.f56187s0 = r2
        L_0x0060:
            r0 = r5
            goto L_0x0063
        L_0x0062:
            r0 = r1
        L_0x0063:
            boolean r6 = r10.e0()
            if (r6 == 0) goto L_0x00d2
            android.widget.TextView r2 = r10.f56121B
            int r2 = r2.getMeasuredWidth()
            android.widget.EditText r6 = r10.f56159e
            int r6 = r6.getPaddingRight()
            int r2 = r2 - r6
            com.google.android.material.internal.CheckableImageButton r6 = r10.getEndIconToUpdateDummyDrawable()
            if (r6 == 0) goto L_0x008c
            int r7 = r6.getMeasuredWidth()
            int r2 = r2 + r7
            android.view.ViewGroup$LayoutParams r6 = r6.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r6 = (android.view.ViewGroup.MarginLayoutParams) r6
            int r6 = androidx.core.view.C1718v.b(r6)
            int r2 = r2 + r6
        L_0x008c:
            android.widget.EditText r6 = r10.f56159e
            android.graphics.drawable.Drawable[] r6 = androidx.core.widget.i.a(r6)
            android.graphics.drawable.Drawable r7 = r10.f56122B0
            if (r7 == 0) goto L_0x00ad
            int r8 = r10.f56124C0
            if (r8 == r2) goto L_0x00ad
            r10.f56124C0 = r2
            r7.setBounds(r1, r1, r2, r5)
            android.widget.EditText r0 = r10.f56159e
            r1 = r6[r1]
            r2 = r6[r5]
            android.graphics.drawable.Drawable r3 = r10.f56122B0
            r4 = r6[r4]
            androidx.core.widget.i.i(r0, r1, r2, r3, r4)
            goto L_0x00d0
        L_0x00ad:
            if (r7 != 0) goto L_0x00bb
            android.graphics.drawable.ColorDrawable r7 = new android.graphics.drawable.ColorDrawable
            r7.<init>()
            r10.f56122B0 = r7
            r10.f56124C0 = r2
            r7.setBounds(r1, r1, r2, r5)
        L_0x00bb:
            r2 = r6[r3]
            android.graphics.drawable.Drawable r3 = r10.f56122B0
            if (r2 == r3) goto L_0x00cf
            r10.f56126D0 = r2
            android.widget.EditText r0 = r10.f56159e
            r1 = r6[r1]
            r2 = r6[r5]
            r4 = r6[r4]
            androidx.core.widget.i.i(r0, r1, r2, r3, r4)
            goto L_0x00d0
        L_0x00cf:
            r5 = r0
        L_0x00d0:
            r0 = r5
            goto L_0x00f4
        L_0x00d2:
            android.graphics.drawable.Drawable r6 = r10.f56122B0
            if (r6 == 0) goto L_0x00f4
            android.widget.EditText r6 = r10.f56159e
            android.graphics.drawable.Drawable[] r6 = androidx.core.widget.i.a(r6)
            r3 = r6[r3]
            android.graphics.drawable.Drawable r7 = r10.f56122B0
            if (r3 != r7) goto L_0x00f0
            android.widget.EditText r0 = r10.f56159e
            r1 = r6[r1]
            r3 = r6[r5]
            android.graphics.drawable.Drawable r7 = r10.f56126D0
            r4 = r6[r4]
            androidx.core.widget.i.i(r0, r1, r3, r7, r4)
            goto L_0x00f1
        L_0x00f0:
            r5 = r0
        L_0x00f1:
            r10.f56122B0 = r2
            goto L_0x00d0
        L_0x00f4:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.q0():boolean");
    }

    /* access modifiers changed from: package-private */
    public void r0() {
        Drawable background;
        TextView textView;
        EditText editText = this.f56159e;
        if (editText != null && this.f56165h0 == 0 && (background = editText.getBackground()) != null) {
            if (N.a(background)) {
                background = background.mutate();
            }
            if (this.f56170k.l()) {
                background.setColorFilter(C1572k.e(this.f56170k.p(), PorterDuff.Mode.SRC_IN));
            } else if (!this.f56176n || (textView = this.f56178o) == null) {
                C2429a.a(background);
                this.f56159e.refreshDrawableState();
            } else {
                background.setColorFilter(C1572k.e(textView.getCurrentTextColor(), PorterDuff.Mode.SRC_IN));
            }
        }
    }

    public void setBoxBackgroundColor(int i10) {
        if (this.f56177n0 != i10) {
            this.f56177n0 = i10;
            this.f56143P0 = i10;
            this.f56145R0 = i10;
            this.f56146S0 = i10;
            l();
        }
    }

    public void setBoxBackgroundColorResource(int i10) {
        setBoxBackgroundColor(androidx.core.content.c.getColor(getContext(), i10));
    }

    public void setBoxBackgroundColorStateList(ColorStateList colorStateList) {
        int defaultColor = colorStateList.getDefaultColor();
        this.f56143P0 = defaultColor;
        this.f56177n0 = defaultColor;
        this.f56144Q0 = colorStateList.getColorForState(new int[]{-16842910}, -1);
        this.f56145R0 = colorStateList.getColorForState(new int[]{16842908, 16842910}, -1);
        this.f56146S0 = colorStateList.getColorForState(new int[]{16843623, 16842910}, -1);
        l();
    }

    public void setBoxBackgroundMode(int i10) {
        if (i10 != this.f56165h0) {
            this.f56165h0 = i10;
            if (this.f56159e != null) {
                Q();
            }
        }
    }

    public void setBoxCollapsedPaddingTop(int i10) {
        this.f56167i0 = i10;
    }

    public void setBoxStrokeColor(int i10) {
        if (this.f56141N0 != i10) {
            this.f56141N0 = i10;
            E0();
        }
    }

    public void setBoxStrokeColorStateList(ColorStateList colorStateList) {
        if (colorStateList.isStateful()) {
            this.f56139L0 = colorStateList.getDefaultColor();
            this.f56147T0 = colorStateList.getColorForState(new int[]{-16842910}, -1);
            this.f56140M0 = colorStateList.getColorForState(new int[]{16843623, 16842910}, -1);
            this.f56141N0 = colorStateList.getColorForState(new int[]{16842908, 16842910}, -1);
        } else if (this.f56141N0 != colorStateList.getDefaultColor()) {
            this.f56141N0 = colorStateList.getDefaultColor();
        }
        E0();
    }

    public void setBoxStrokeErrorColor(ColorStateList colorStateList) {
        if (this.f56142O0 != colorStateList) {
            this.f56142O0 = colorStateList;
            E0();
        }
    }

    public void setBoxStrokeWidth(int i10) {
        this.f56171k0 = i10;
        E0();
    }

    public void setBoxStrokeWidthFocused(int i10) {
        this.f56173l0 = i10;
        E0();
    }

    public void setBoxStrokeWidthFocusedResource(int i10) {
        setBoxStrokeWidthFocused(getResources().getDimensionPixelSize(i10));
    }

    public void setBoxStrokeWidthResource(int i10) {
        setBoxStrokeWidth(getResources().getDimensionPixelSize(i10));
    }

    public void setCounterEnabled(boolean z10) {
        if (this.f56172l != z10) {
            if (z10) {
                C c10 = new C(getContext());
                this.f56178o = c10;
                c10.setId(Ua.e.f52823S);
                Typeface typeface = this.f56185r0;
                if (typeface != null) {
                    this.f56178o.setTypeface(typeface);
                }
                this.f56178o.setMaxLines(1);
                this.f56170k.e(this.f56178o, 2);
                C1718v.d((ViewGroup.MarginLayoutParams) this.f56178o.getLayoutParams(), getResources().getDimensionPixelOffset(Ua.c.f52771Q));
                o0();
                l0();
            } else {
                this.f56170k.B(this.f56178o, 2);
                this.f56178o = null;
            }
            this.f56172l = z10;
        }
    }

    public void setCounterMaxLength(int i10) {
        if (this.f56174m != i10) {
            if (i10 > 0) {
                this.f56174m = i10;
            } else {
                this.f56174m = -1;
            }
            if (this.f56172l) {
                l0();
            }
        }
    }

    public void setCounterOverflowTextAppearance(int i10) {
        if (this.f56180p != i10) {
            this.f56180p = i10;
            o0();
        }
    }

    public void setCounterOverflowTextColor(ColorStateList colorStateList) {
        if (this.f56200z != colorStateList) {
            this.f56200z = colorStateList;
            o0();
        }
    }

    public void setCounterTextAppearance(int i10) {
        if (this.f56182q != i10) {
            this.f56182q = i10;
            o0();
        }
    }

    public void setCounterTextColor(ColorStateList colorStateList) {
        if (this.f56198y != colorStateList) {
            this.f56198y = colorStateList;
            o0();
        }
    }

    public void setDefaultHintTextColor(ColorStateList colorStateList) {
        this.f56137J0 = colorStateList;
        this.f56138K0 = colorStateList;
        if (this.f56159e != null) {
            w0(false);
        }
    }

    public void setEnabled(boolean z10) {
        T(this, z10);
        super.setEnabled(z10);
    }

    public void setEndIconActivated(boolean z10) {
        this.f56197x0.setActivated(z10);
    }

    public void setEndIconCheckable(boolean z10) {
        this.f56197x0.setCheckable(z10);
    }

    public void setEndIconContentDescription(int i10) {
        setEndIconContentDescription(i10 != 0 ? getResources().getText(i10) : null);
    }

    public void setEndIconDrawable(int i10) {
        setEndIconDrawable(i10 != 0 ? C2115a.b(getContext(), i10) : null);
    }

    public void setEndIconMode(int i10) {
        boolean z10;
        int i11 = this.f56193v0;
        if (i11 != i10) {
            this.f56193v0 = i10;
            C(i11);
            if (i10 != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            setEndIconVisible(z10);
            if (getEndIconDelegate().b(this.f56165h0)) {
                getEndIconDelegate().a();
                f.a(this, this.f56197x0, this.f56201z0, this.f56120A0);
                return;
            }
            throw new IllegalStateException("The current box background mode " + this.f56165h0 + " is not supported by the end icon mode " + i10);
        }
    }

    public void setEndIconOnClickListener(View.OnClickListener onClickListener) {
        b0(this.f56197x0, onClickListener, this.f56128E0);
    }

    public void setEndIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.f56128E0 = onLongClickListener;
        c0(this.f56197x0, onLongClickListener);
    }

    public void setEndIconTintList(ColorStateList colorStateList) {
        if (this.f56201z0 != colorStateList) {
            this.f56201z0 = colorStateList;
            f.a(this, this.f56197x0, colorStateList, this.f56120A0);
        }
    }

    public void setEndIconTintMode(PorterDuff.Mode mode) {
        if (this.f56120A0 != mode) {
            this.f56120A0 = mode;
            f.a(this, this.f56197x0, this.f56201z0, mode);
        }
    }

    public void setEndIconVisible(boolean z10) {
        int i10;
        if (K() != z10) {
            CheckableImageButton checkableImageButton = this.f56197x0;
            if (z10) {
                i10 = 0;
            } else {
                i10 = 8;
            }
            checkableImageButton.setVisibility(i10);
            t0();
            C0();
            q0();
        }
    }

    public void setError(CharSequence charSequence) {
        if (!this.f56170k.z()) {
            if (!TextUtils.isEmpty(charSequence)) {
                setErrorEnabled(true);
            } else {
                return;
            }
        }
        if (!TextUtils.isEmpty(charSequence)) {
            this.f56170k.O(charSequence);
        } else {
            this.f56170k.v();
        }
    }

    public void setErrorContentDescription(CharSequence charSequence) {
        this.f56170k.D(charSequence);
    }

    public void setErrorEnabled(boolean z10) {
        this.f56170k.E(z10);
    }

    public void setErrorIconDrawable(int i10) {
        setErrorIconDrawable(i10 != 0 ? C2115a.b(getContext(), i10) : null);
        V();
    }

    public void setErrorIconOnClickListener(View.OnClickListener onClickListener) {
        b0(this.f56132G0, onClickListener, this.f56130F0);
    }

    public void setErrorIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.f56130F0 = onLongClickListener;
        c0(this.f56132G0, onLongClickListener);
    }

    public void setErrorIconTintList(ColorStateList colorStateList) {
        if (this.f56134H0 != colorStateList) {
            this.f56134H0 = colorStateList;
            f.a(this, this.f56132G0, colorStateList, this.f56136I0);
        }
    }

    public void setErrorIconTintMode(PorterDuff.Mode mode) {
        if (this.f56136I0 != mode) {
            this.f56136I0 = mode;
            f.a(this, this.f56132G0, this.f56134H0, mode);
        }
    }

    public void setErrorTextAppearance(int i10) {
        this.f56170k.F(i10);
    }

    public void setErrorTextColor(ColorStateList colorStateList) {
        this.f56170k.G(colorStateList);
    }

    public void setExpandedHintEnabled(boolean z10) {
        if (this.f56150W0 != z10) {
            this.f56150W0 = z10;
            w0(false);
        }
    }

    public void setHelperText(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            if (!M()) {
                setHelperTextEnabled(true);
            }
            this.f56170k.P(charSequence);
        } else if (M()) {
            setHelperTextEnabled(false);
        }
    }

    public void setHelperTextColor(ColorStateList colorStateList) {
        this.f56170k.J(colorStateList);
    }

    public void setHelperTextEnabled(boolean z10) {
        this.f56170k.I(z10);
    }

    public void setHelperTextTextAppearance(int i10) {
        this.f56170k.H(i10);
    }

    public void setHint(CharSequence charSequence) {
        if (this.f56123C) {
            setHintInternal(charSequence);
            sendAccessibilityEvent(2048);
        }
    }

    public void setHintAnimationEnabled(boolean z10) {
        this.f56151X0 = z10;
    }

    public void setHintEnabled(boolean z10) {
        if (z10 != this.f56123C) {
            this.f56123C = z10;
            if (!z10) {
                this.f56127E = false;
                if (!TextUtils.isEmpty(this.f56125D) && TextUtils.isEmpty(this.f56159e.getHint())) {
                    this.f56159e.setHint(this.f56125D);
                }
                setHintInternal((CharSequence) null);
            } else {
                CharSequence hint = this.f56159e.getHint();
                if (!TextUtils.isEmpty(hint)) {
                    if (TextUtils.isEmpty(this.f56125D)) {
                        setHint(hint);
                    }
                    this.f56159e.setHint((CharSequence) null);
                }
                this.f56127E = true;
            }
            if (this.f56159e != null) {
                v0();
            }
        }
    }

    public void setHintTextAppearance(int i10) {
        this.f56149V0.P(i10);
        this.f56138K0 = this.f56149V0.p();
        if (this.f56159e != null) {
            w0(false);
            v0();
        }
    }

    public void setHintTextColor(ColorStateList colorStateList) {
        if (this.f56138K0 != colorStateList) {
            if (this.f56137J0 == null) {
                this.f56149V0.R(colorStateList);
            }
            this.f56138K0 = colorStateList;
            if (this.f56159e != null) {
                w0(false);
            }
        }
    }

    public void setMaxEms(int i10) {
        this.f56164h = i10;
        EditText editText = this.f56159e;
        if (editText != null && i10 != -1) {
            editText.setMaxEms(i10);
        }
    }

    public void setMaxWidth(int i10) {
        this.f56168j = i10;
        EditText editText = this.f56159e;
        if (editText != null && i10 != -1) {
            editText.setMaxWidth(i10);
        }
    }

    public void setMaxWidthResource(int i10) {
        setMaxWidth(getContext().getResources().getDimensionPixelSize(i10));
    }

    public void setMinEms(int i10) {
        this.f56162g = i10;
        EditText editText = this.f56159e;
        if (editText != null && i10 != -1) {
            editText.setMinEms(i10);
        }
    }

    public void setMinWidth(int i10) {
        this.f56166i = i10;
        EditText editText = this.f56159e;
        if (editText != null && i10 != -1) {
            editText.setMinWidth(i10);
        }
    }

    public void setMinWidthResource(int i10) {
        setMinWidth(getContext().getResources().getDimensionPixelSize(i10));
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(int i10) {
        setPasswordVisibilityToggleContentDescription(i10 != 0 ? getResources().getText(i10) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(int i10) {
        setPasswordVisibilityToggleDrawable(i10 != 0 ? C2115a.b(getContext(), i10) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleEnabled(boolean z10) {
        if (z10 && this.f56193v0 != 1) {
            setEndIconMode(1);
        } else if (!z10) {
            setEndIconMode(0);
        }
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintList(ColorStateList colorStateList) {
        this.f56201z0 = colorStateList;
        f.a(this, this.f56197x0, colorStateList, this.f56120A0);
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintMode(PorterDuff.Mode mode) {
        this.f56120A0 = mode;
        f.a(this, this.f56197x0, this.f56201z0, mode);
    }

    public void setPlaceholderText(CharSequence charSequence) {
        if (this.f56188t == null) {
            C c10 = new C(getContext());
            this.f56188t = c10;
            c10.setId(Ua.e.f52826V);
            C1680b0.y0(this.f56188t, 2);
            C1154d z10 = z();
            this.f56194w = z10;
            z10.c0(67);
            this.f56196x = z();
            setPlaceholderTextAppearance(this.f56192v);
            setPlaceholderTextColor(this.f56190u);
        }
        if (TextUtils.isEmpty(charSequence)) {
            setPlaceholderTextEnabled(false);
        } else {
            if (!this.f56186s) {
                setPlaceholderTextEnabled(true);
            }
            this.f56184r = charSequence;
        }
        z0();
    }

    public void setPlaceholderTextAppearance(int i10) {
        this.f56192v = i10;
        TextView textView = this.f56188t;
        if (textView != null) {
            androidx.core.widget.i.o(textView, i10);
        }
    }

    public void setPlaceholderTextColor(ColorStateList colorStateList) {
        if (this.f56190u != colorStateList) {
            this.f56190u = colorStateList;
            TextView textView = this.f56188t;
            if (textView != null && colorStateList != null) {
                textView.setTextColor(colorStateList);
            }
        }
    }

    public void setPrefixText(CharSequence charSequence) {
        this.f56156b.k(charSequence);
    }

    public void setPrefixTextAppearance(int i10) {
        this.f56156b.l(i10);
    }

    public void setPrefixTextColor(ColorStateList colorStateList) {
        this.f56156b.m(colorStateList);
    }

    public void setStartIconCheckable(boolean z10) {
        this.f56156b.n(z10);
    }

    public void setStartIconContentDescription(int i10) {
        setStartIconContentDescription(i10 != 0 ? getResources().getText(i10) : null);
    }

    public void setStartIconDrawable(int i10) {
        setStartIconDrawable(i10 != 0 ? C2115a.b(getContext(), i10) : null);
    }

    public void setStartIconOnClickListener(View.OnClickListener onClickListener) {
        this.f56156b.q(onClickListener);
    }

    public void setStartIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.f56156b.r(onLongClickListener);
    }

    public void setStartIconTintList(ColorStateList colorStateList) {
        this.f56156b.s(colorStateList);
    }

    public void setStartIconTintMode(PorterDuff.Mode mode) {
        this.f56156b.t(mode);
    }

    public void setStartIconVisible(boolean z10) {
        this.f56156b.u(z10);
    }

    public void setSuffixText(CharSequence charSequence) {
        CharSequence charSequence2;
        if (TextUtils.isEmpty(charSequence)) {
            charSequence2 = null;
        } else {
            charSequence2 = charSequence;
        }
        this.f56119A = charSequence2;
        this.f56121B.setText(charSequence);
        D0();
    }

    public void setSuffixTextAppearance(int i10) {
        androidx.core.widget.i.o(this.f56121B, i10);
    }

    public void setSuffixTextColor(ColorStateList colorStateList) {
        this.f56121B.setTextColor(colorStateList);
    }

    public void setTextInputAccessibilityDelegate(e eVar) {
        EditText editText = this.f56159e;
        if (editText != null) {
            C1680b0.o0(editText, eVar);
        }
    }

    public void setTypeface(Typeface typeface) {
        if (typeface != this.f56185r0) {
            this.f56185r0 = typeface;
            this.f56149V0.j0(typeface);
            this.f56170k.L(typeface);
            TextView textView = this.f56178o;
            if (textView != null) {
                textView.setTypeface(typeface);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void w0(boolean z10) {
        x0(z10, false);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public TextInputLayout(android.content.Context r27, android.util.AttributeSet r28, int r29) {
        /*
            r26 = this;
            r0 = r26
            r7 = r28
            r8 = r29
            int r9 = f56118b1
            r1 = r27
            android.content.Context r1 = jb.C5041a.c(r1, r7, r8, r9)
            r0.<init>(r1, r7, r8)
            r10 = -1
            r0.f56162g = r10
            r0.f56164h = r10
            r0.f56166i = r10
            r0.f56168j = r10
            com.google.android.material.textfield.g r1 = new com.google.android.material.textfield.g
            r1.<init>(r0)
            r0.f56170k = r1
            android.graphics.Rect r1 = new android.graphics.Rect
            r1.<init>()
            r0.f56179o0 = r1
            android.graphics.Rect r1 = new android.graphics.Rect
            r1.<init>()
            r0.f56181p0 = r1
            android.graphics.RectF r1 = new android.graphics.RectF
            r1.<init>()
            r0.f56183q0 = r1
            java.util.LinkedHashSet r1 = new java.util.LinkedHashSet
            r1.<init>()
            r0.f56191u0 = r1
            r11 = 0
            r0.f56193v0 = r11
            android.util.SparseArray r12 = new android.util.SparseArray
            r12.<init>()
            r0.f56195w0 = r12
            java.util.LinkedHashSet r1 = new java.util.LinkedHashSet
            r1.<init>()
            r0.f56199y0 = r1
            com.google.android.material.internal.b r1 = new com.google.android.material.internal.b
            r1.<init>(r0)
            r0.f56149V0 = r1
            android.content.Context r13 = r26.getContext()
            r14 = 1
            r0.setOrientation(r14)
            r0.setWillNotDraw(r11)
            r0.setAddStatesFromChildren(r14)
            android.widget.FrameLayout r15 = new android.widget.FrameLayout
            r15.<init>(r13)
            r0.f56154a = r15
            android.widget.FrameLayout r6 = new android.widget.FrameLayout
            r6.<init>(r13)
            r0.f56158d = r6
            android.widget.LinearLayout r5 = new android.widget.LinearLayout
            r5.<init>(r13)
            r0.f56157c = r5
            androidx.appcompat.widget.C r4 = new androidx.appcompat.widget.C
            r4.<init>(r13)
            r0.f56121B = r4
            r2 = 8
            r5.setVisibility(r2)
            r6.setVisibility(r2)
            r4.setVisibility(r2)
            android.view.LayoutInflater r2 = android.view.LayoutInflater.from(r13)
            int r3 = Ua.g.f52858b
            android.view.View r3 = r2.inflate(r3, r5, r11)
            com.google.android.material.internal.CheckableImageButton r3 = (com.google.android.material.internal.CheckableImageButton) r3
            r0.f56132G0 = r3
            int r10 = Ua.g.f52858b
            android.view.View r2 = r2.inflate(r10, r6, r11)
            r10 = r2
            com.google.android.material.internal.CheckableImageButton r10 = (com.google.android.material.internal.CheckableImageButton) r10
            r0.f56197x0 = r10
            r15.setAddStatesFromChildren(r14)
            r5.setOrientation(r11)
            android.widget.FrameLayout$LayoutParams r2 = new android.widget.FrameLayout$LayoutParams
            r11 = 8388613(0x800005, float:1.175495E-38)
            r14 = -2
            r16 = r3
            r3 = -1
            r2.<init>(r14, r3, r11)
            r5.setLayoutParams(r2)
            android.widget.FrameLayout$LayoutParams r2 = new android.widget.FrameLayout$LayoutParams
            r2.<init>(r14, r3)
            r6.setLayoutParams(r2)
            android.animation.TimeInterpolator r2 = Va.a.f53418a
            r1.i0(r2)
            r1.f0(r2)
            r2 = 8388659(0x800033, float:1.1755015E-38)
            r1.S(r2)
            int[] r3 = Ua.j.f53164f5
            int r1 = Ua.j.f52952C5
            int r2 = Ua.j.f52936A5
            int r11 = Ua.j.f53047P5
            int r14 = Ua.j.f53082U5
            r17 = r4
            int r4 = Ua.j.f53110Y5
            int[] r11 = new int[]{r1, r2, r11, r14, r4}
            r1 = r13
            r2 = r28
            r14 = r16
            r16 = r15
            r15 = r17
            r4 = r29
            r18 = r5
            r5 = r9
            r19 = r6
            r6 = r11
            androidx.appcompat.widget.g0 r1 = com.google.android.material.internal.l.i(r1, r2, r3, r4, r5, r6)
            com.google.android.material.textfield.k r2 = new com.google.android.material.textfield.k
            r2.<init>(r0, r1)
            r0.f56156b = r2
            int r3 = Ua.j.f53103X5
            r4 = 1
            boolean r3 = r1.a(r3, r4)
            r0.f56123C = r3
            int r3 = Ua.j.f53204k5
            java.lang.CharSequence r3 = r1.p(r3)
            r0.setHint((java.lang.CharSequence) r3)
            int r3 = Ua.j.f53096W5
            boolean r3 = r1.a(r3, r4)
            r0.f56151X0 = r3
            int r3 = Ua.j.f53061R5
            boolean r3 = r1.a(r3, r4)
            r0.f56150W0 = r3
            int r3 = Ua.j.f53220m5
            boolean r3 = r1.s(r3)
            if (r3 == 0) goto L_0x0131
            int r3 = Ua.j.f53220m5
            r4 = -1
            int r3 = r1.k(r3, r4)
            r0.setMinEms(r3)
            goto L_0x0143
        L_0x0131:
            r4 = -1
            int r3 = Ua.j.f53196j5
            boolean r3 = r1.s(r3)
            if (r3 == 0) goto L_0x0143
            int r3 = Ua.j.f53196j5
            int r3 = r1.f(r3, r4)
            r0.setMinWidth(r3)
        L_0x0143:
            int r3 = Ua.j.f53212l5
            boolean r3 = r1.s(r3)
            if (r3 == 0) goto L_0x0155
            int r3 = Ua.j.f53212l5
            int r3 = r1.k(r3, r4)
            r0.setMaxEms(r3)
            goto L_0x0166
        L_0x0155:
            int r3 = Ua.j.f53188i5
            boolean r3 = r1.s(r3)
            if (r3 == 0) goto L_0x0166
            int r3 = Ua.j.f53188i5
            int r3 = r1.f(r3, r4)
            r0.setMaxWidth(r3)
        L_0x0166:
            ib.k$b r3 = ib.C5024k.e(r13, r7, r8, r9)
            ib.k r3 = r3.m()
            r0.f56135I = r3
            android.content.res.Resources r3 = r13.getResources()
            int r4 = Ua.c.f52768N
            int r3 = r3.getDimensionPixelOffset(r4)
            r0.f56163g0 = r3
            int r3 = Ua.j.f53244p5
            r4 = 0
            int r3 = r1.e(r3, r4)
            r0.f56167i0 = r3
            int r3 = Ua.j.f53300w5
            android.content.res.Resources r4 = r13.getResources()
            int r5 = Ua.c.f52769O
            int r4 = r4.getDimensionPixelSize(r5)
            int r3 = r1.f(r3, r4)
            r0.f56171k0 = r3
            int r3 = Ua.j.f53308x5
            android.content.res.Resources r4 = r13.getResources()
            int r5 = Ua.c.f52770P
            int r4 = r4.getDimensionPixelSize(r5)
            int r3 = r1.f(r3, r4)
            r0.f56173l0 = r3
            int r3 = r0.f56171k0
            r0.f56169j0 = r3
            int r3 = Ua.j.f53276t5
            r4 = -1082130432(0xffffffffbf800000, float:-1.0)
            float r3 = r1.d(r3, r4)
            int r5 = Ua.j.f53268s5
            float r5 = r1.d(r5, r4)
            int r6 = Ua.j.f53252q5
            float r6 = r1.d(r6, r4)
            int r7 = Ua.j.f53260r5
            float r4 = r1.d(r7, r4)
            ib.k r7 = r0.f56135I
            ib.k$b r7 = r7.v()
            r8 = 0
            int r9 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r9 < 0) goto L_0x01d5
            r7.B(r3)
        L_0x01d5:
            int r3 = (r5 > r8 ? 1 : (r5 == r8 ? 0 : -1))
            if (r3 < 0) goto L_0x01dc
            r7.G(r5)
        L_0x01dc:
            int r3 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r3 < 0) goto L_0x01e3
            r7.w(r6)
        L_0x01e3:
            int r3 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r3 < 0) goto L_0x01ea
            r7.s(r4)
        L_0x01ea:
            ib.k r3 = r7.m()
            r0.f56135I = r3
            int r3 = Ua.j.f53228n5
            android.content.res.ColorStateList r3 = fb.C4982c.b(r13, r1, r3)
            if (r3 == 0) goto L_0x0252
            int r4 = r3.getDefaultColor()
            r0.f56143P0 = r4
            r0.f56177n0 = r4
            boolean r4 = r3.isStateful()
            r5 = 16843623(0x1010367, float:2.3696E-38)
            r6 = -16842910(0xfffffffffefeff62, float:-1.6947497E38)
            if (r4 == 0) goto L_0x0232
            int[] r4 = new int[]{r6}
            r7 = -1
            int r4 = r3.getColorForState(r4, r7)
            r0.f56144Q0 = r4
            r4 = 16842908(0x101009c, float:2.3693995E-38)
            r6 = 16842910(0x101009e, float:2.3694E-38)
            int[] r4 = new int[]{r4, r6}
            int r4 = r3.getColorForState(r4, r7)
            r0.f56145R0 = r4
            int[] r4 = new int[]{r5, r6}
            int r3 = r3.getColorForState(r4, r7)
            r0.f56146S0 = r3
            goto L_0x025d
        L_0x0232:
            r7 = -1
            int r3 = r0.f56143P0
            r0.f56145R0 = r3
            int r3 = Ua.b.f52751c
            android.content.res.ColorStateList r3 = j.C2115a.a(r13, r3)
            int[] r4 = new int[]{r6}
            int r4 = r3.getColorForState(r4, r7)
            r0.f56144Q0 = r4
            int[] r4 = new int[]{r5}
            int r3 = r3.getColorForState(r4, r7)
            r0.f56146S0 = r3
            goto L_0x025d
        L_0x0252:
            r3 = 0
            r0.f56177n0 = r3
            r0.f56143P0 = r3
            r0.f56144Q0 = r3
            r0.f56145R0 = r3
            r0.f56146S0 = r3
        L_0x025d:
            int r3 = Ua.j.f53180h5
            boolean r3 = r1.s(r3)
            if (r3 == 0) goto L_0x026f
            int r3 = Ua.j.f53180h5
            android.content.res.ColorStateList r3 = r1.c(r3)
            r0.f56138K0 = r3
            r0.f56137J0 = r3
        L_0x026f:
            int r3 = Ua.j.f53284u5
            android.content.res.ColorStateList r3 = fb.C4982c.b(r13, r1, r3)
            int r4 = Ua.j.f53284u5
            r5 = 0
            int r4 = r1.b(r4, r5)
            r0.f56141N0 = r4
            int r4 = Ua.b.f52752d
            int r4 = androidx.core.content.c.getColor(r13, r4)
            r0.f56139L0 = r4
            int r4 = Ua.b.f52753e
            int r4 = androidx.core.content.c.getColor(r13, r4)
            r0.f56147T0 = r4
            int r4 = Ua.b.f52754f
            int r4 = androidx.core.content.c.getColor(r13, r4)
            r0.f56140M0 = r4
            if (r3 == 0) goto L_0x029b
            r0.setBoxStrokeColorStateList(r3)
        L_0x029b:
            int r3 = Ua.j.f53292v5
            boolean r3 = r1.s(r3)
            if (r3 == 0) goto L_0x02ac
            int r3 = Ua.j.f53292v5
            android.content.res.ColorStateList r3 = fb.C4982c.b(r13, r1, r3)
            r0.setBoxStrokeErrorColor(r3)
        L_0x02ac:
            int r3 = Ua.j.f53110Y5
            r4 = -1
            int r3 = r1.n(r3, r4)
            if (r3 == r4) goto L_0x02c0
            int r3 = Ua.j.f53110Y5
            r4 = 0
            int r3 = r1.n(r3, r4)
            r0.setHintTextAppearance(r3)
            goto L_0x02c1
        L_0x02c0:
            r4 = 0
        L_0x02c1:
            int r3 = Ua.j.f53047P5
            int r3 = r1.n(r3, r4)
            int r5 = Ua.j.f53012K5
            java.lang.CharSequence r5 = r1.p(r5)
            int r6 = Ua.j.f53019L5
            boolean r6 = r1.a(r6, r4)
            int r7 = Ua.e.f52822R
            r14.setId(r7)
            boolean r7 = fb.C4982c.g(r13)
            if (r7 == 0) goto L_0x02e7
            android.view.ViewGroup$LayoutParams r7 = r14.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r7 = (android.view.ViewGroup.MarginLayoutParams) r7
            androidx.core.view.C1718v.d(r7, r4)
        L_0x02e7:
            int r4 = Ua.j.f53033N5
            boolean r4 = r1.s(r4)
            if (r4 == 0) goto L_0x02f7
            int r4 = Ua.j.f53033N5
            android.content.res.ColorStateList r4 = fb.C4982c.b(r13, r1, r4)
            r0.f56134H0 = r4
        L_0x02f7:
            int r4 = Ua.j.f53040O5
            boolean r4 = r1.s(r4)
            r7 = 0
            if (r4 == 0) goto L_0x030d
            int r4 = Ua.j.f53040O5
            r8 = -1
            int r4 = r1.k(r4, r8)
            android.graphics.PorterDuff$Mode r4 = com.google.android.material.internal.n.f(r4, r7)
            r0.f56136I0 = r4
        L_0x030d:
            int r4 = Ua.j.f53026M5
            boolean r4 = r1.s(r4)
            if (r4 == 0) goto L_0x031e
            int r4 = Ua.j.f53026M5
            android.graphics.drawable.Drawable r4 = r1.g(r4)
            r0.setErrorIconDrawable((android.graphics.drawable.Drawable) r4)
        L_0x031e:
            android.content.res.Resources r4 = r26.getResources()
            int r8 = Ua.h.f52890f
            java.lang.CharSequence r4 = r4.getText(r8)
            r14.setContentDescription(r4)
            r4 = 2
            androidx.core.view.C1680b0.y0(r14, r4)
            r8 = 0
            r14.setClickable(r8)
            r14.setPressable(r8)
            r14.setFocusable(r8)
            int r9 = Ua.j.f53082U5
            int r9 = r1.n(r9, r8)
            int r11 = Ua.j.f53075T5
            boolean r11 = r1.a(r11, r8)
            int r7 = Ua.j.f53068S5
            java.lang.CharSequence r7 = r1.p(r7)
            int r4 = Ua.j.f53173g6
            int r4 = r1.n(r4, r8)
            int r8 = Ua.j.f53165f6
            java.lang.CharSequence r8 = r1.p(r8)
            r17 = r7
            int r7 = Ua.j.f53261r6
            r20 = r6
            r6 = 0
            int r7 = r1.n(r7, r6)
            int r6 = Ua.j.f53253q6
            java.lang.CharSequence r6 = r1.p(r6)
            r21 = r6
            int r6 = Ua.j.f53316y5
            r22 = r11
            r11 = 0
            boolean r6 = r1.a(r6, r11)
            int r11 = Ua.j.f53324z5
            r23 = r6
            r6 = -1
            int r11 = r1.k(r11, r6)
            r0.setCounterMaxLength(r11)
            int r6 = Ua.j.f52952C5
            r11 = 0
            int r6 = r1.n(r6, r11)
            r0.f56182q = r6
            int r6 = Ua.j.f52936A5
            int r6 = r1.n(r6, r11)
            r0.f56180p = r6
            int r6 = Ua.j.f53236o5
            int r6 = r1.k(r6, r11)
            r0.setBoxBackgroundMode(r6)
            boolean r6 = fb.C4982c.g(r13)
            if (r6 == 0) goto L_0x03a8
            android.view.ViewGroup$LayoutParams r6 = r10.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r6 = (android.view.ViewGroup.MarginLayoutParams) r6
            androidx.core.view.C1718v.d(r6, r11)
        L_0x03a8:
            int r6 = Ua.j.f52984G5
            int r6 = r1.n(r6, r11)
            com.google.android.material.textfield.b r11 = new com.google.android.material.textfield.b
            r11.<init>(r0, r6)
            r24 = r2
            r2 = -1
            r12.append(r2, r11)
            com.google.android.material.textfield.i r2 = new com.google.android.material.textfield.i
            r2.<init>(r0)
            r11 = 0
            r12.append(r11, r2)
            com.google.android.material.textfield.j r2 = new com.google.android.material.textfield.j
            if (r6 != 0) goto L_0x03cf
            r25 = r14
            int r14 = Ua.j.f53133b6
            int r14 = r1.n(r14, r11)
            goto L_0x03d2
        L_0x03cf:
            r25 = r14
            r14 = r6
        L_0x03d2:
            r2.<init>(r0, r14)
            r11 = 1
            r12.append(r11, r2)
            com.google.android.material.textfield.a r2 = new com.google.android.material.textfield.a
            r2.<init>(r0, r6)
            r11 = 2
            r12.append(r11, r2)
            com.google.android.material.textfield.d r2 = new com.google.android.material.textfield.d
            r2.<init>(r0, r6)
            r6 = 3
            r12.append(r6, r2)
            int r2 = Ua.j.f53141c6
            boolean r2 = r1.s(r2)
            if (r2 != 0) goto L_0x0419
            int r2 = Ua.j.f52998I5
            boolean r2 = r1.s(r2)
            if (r2 == 0) goto L_0x0403
            int r2 = Ua.j.f52998I5
            android.content.res.ColorStateList r2 = fb.C4982c.b(r13, r1, r2)
            r0.f56201z0 = r2
        L_0x0403:
            int r2 = Ua.j.f53005J5
            boolean r2 = r1.s(r2)
            if (r2 == 0) goto L_0x0419
            int r2 = Ua.j.f53005J5
            r6 = -1
            int r2 = r1.k(r2, r6)
            r6 = 0
            android.graphics.PorterDuff$Mode r2 = com.google.android.material.internal.n.f(r2, r6)
            r0.f56120A0 = r2
        L_0x0419:
            int r2 = Ua.j.f52991H5
            boolean r2 = r1.s(r2)
            if (r2 == 0) goto L_0x0447
            int r2 = Ua.j.f52991H5
            r6 = 0
            int r2 = r1.k(r2, r6)
            r0.setEndIconMode(r2)
            int r2 = Ua.j.f52976F5
            boolean r2 = r1.s(r2)
            if (r2 == 0) goto L_0x043c
            int r2 = Ua.j.f52976F5
            java.lang.CharSequence r2 = r1.p(r2)
            r0.setEndIconContentDescription((java.lang.CharSequence) r2)
        L_0x043c:
            int r2 = Ua.j.f52968E5
            r6 = 1
            boolean r2 = r1.a(r2, r6)
            r0.setEndIconCheckable(r2)
            goto L_0x0488
        L_0x0447:
            int r2 = Ua.j.f53141c6
            boolean r2 = r1.s(r2)
            if (r2 == 0) goto L_0x0488
            int r2 = Ua.j.f53149d6
            boolean r2 = r1.s(r2)
            if (r2 == 0) goto L_0x045f
            int r2 = Ua.j.f53149d6
            android.content.res.ColorStateList r2 = fb.C4982c.b(r13, r1, r2)
            r0.f56201z0 = r2
        L_0x045f:
            int r2 = Ua.j.f53157e6
            boolean r2 = r1.s(r2)
            if (r2 == 0) goto L_0x0475
            int r2 = Ua.j.f53157e6
            r6 = -1
            int r2 = r1.k(r2, r6)
            r6 = 0
            android.graphics.PorterDuff$Mode r2 = com.google.android.material.internal.n.f(r2, r6)
            r0.f56120A0 = r2
        L_0x0475:
            int r2 = Ua.j.f53141c6
            r6 = 0
            boolean r2 = r1.a(r2, r6)
            r0.setEndIconMode(r2)
            int r2 = Ua.j.f53125a6
            java.lang.CharSequence r2 = r1.p(r2)
            r0.setEndIconContentDescription((java.lang.CharSequence) r2)
        L_0x0488:
            int r2 = Ua.e.f52828X
            r15.setId(r2)
            android.widget.FrameLayout$LayoutParams r2 = new android.widget.FrameLayout$LayoutParams
            r6 = 80
            r11 = -2
            r2.<init>(r11, r11, r6)
            r15.setLayoutParams(r2)
            r2 = 1
            androidx.core.view.C1680b0.q0(r15, r2)
            r0.setErrorContentDescription(r5)
            int r2 = r0.f56180p
            r0.setCounterOverflowTextAppearance(r2)
            r0.setHelperTextTextAppearance(r9)
            r0.setErrorTextAppearance(r3)
            int r2 = r0.f56182q
            r0.setCounterTextAppearance(r2)
            r0.setPlaceholderText(r8)
            r0.setPlaceholderTextAppearance(r4)
            r0.setSuffixTextAppearance(r7)
            int r2 = Ua.j.f53054Q5
            boolean r2 = r1.s(r2)
            if (r2 == 0) goto L_0x04c9
            int r2 = Ua.j.f53054Q5
            android.content.res.ColorStateList r2 = r1.c(r2)
            r0.setErrorTextColor(r2)
        L_0x04c9:
            int r2 = Ua.j.f53089V5
            boolean r2 = r1.s(r2)
            if (r2 == 0) goto L_0x04da
            int r2 = Ua.j.f53089V5
            android.content.res.ColorStateList r2 = r1.c(r2)
            r0.setHelperTextColor(r2)
        L_0x04da:
            int r2 = Ua.j.f53117Z5
            boolean r2 = r1.s(r2)
            if (r2 == 0) goto L_0x04eb
            int r2 = Ua.j.f53117Z5
            android.content.res.ColorStateList r2 = r1.c(r2)
            r0.setHintTextColor(r2)
        L_0x04eb:
            int r2 = Ua.j.f52960D5
            boolean r2 = r1.s(r2)
            if (r2 == 0) goto L_0x04fc
            int r2 = Ua.j.f52960D5
            android.content.res.ColorStateList r2 = r1.c(r2)
            r0.setCounterTextColor(r2)
        L_0x04fc:
            int r2 = Ua.j.f52944B5
            boolean r2 = r1.s(r2)
            if (r2 == 0) goto L_0x050d
            int r2 = Ua.j.f52944B5
            android.content.res.ColorStateList r2 = r1.c(r2)
            r0.setCounterOverflowTextColor(r2)
        L_0x050d:
            int r2 = Ua.j.f53181h6
            boolean r2 = r1.s(r2)
            if (r2 == 0) goto L_0x051e
            int r2 = Ua.j.f53181h6
            android.content.res.ColorStateList r2 = r1.c(r2)
            r0.setPlaceholderTextColor(r2)
        L_0x051e:
            int r2 = Ua.j.f53269s6
            boolean r2 = r1.s(r2)
            if (r2 == 0) goto L_0x052f
            int r2 = Ua.j.f53269s6
            android.content.res.ColorStateList r2 = r1.c(r2)
            r0.setSuffixTextColor(r2)
        L_0x052f:
            int r2 = Ua.j.f53172g5
            r3 = 1
            boolean r2 = r1.a(r2, r3)
            r0.setEnabled(r2)
            r1.x()
            r1 = 2
            androidx.core.view.C1680b0.y0(r0, r1)
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 26
            if (r1 < r2) goto L_0x0549
            androidx.core.view.C1680b0.A0(r0, r3)
        L_0x0549:
            r1 = r19
            r1.addView(r10)
            r2 = r18
            r2.addView(r15)
            r3 = r25
            r2.addView(r3)
            r2.addView(r1)
            r1 = r16
            r3 = r24
            r1.addView(r3)
            r1.addView(r2)
            r0.addView(r1)
            r1 = r22
            r0.setHelperTextEnabled(r1)
            r1 = r20
            r0.setErrorEnabled(r1)
            r1 = r23
            r0.setCounterEnabled(r1)
            r1 = r17
            r0.setHelperText(r1)
            r1 = r21
            r0.setSuffixText(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    public void setEndIconContentDescription(CharSequence charSequence) {
        if (getEndIconContentDescription() != charSequence) {
            this.f56197x0.setContentDescription(charSequence);
        }
    }

    public void setEndIconDrawable(Drawable drawable) {
        this.f56197x0.setImageDrawable(drawable);
        if (drawable != null) {
            f.a(this, this.f56197x0, this.f56201z0, this.f56120A0);
            U();
        }
    }

    public void setStartIconContentDescription(CharSequence charSequence) {
        this.f56156b.o(charSequence);
    }

    public void setStartIconDrawable(Drawable drawable) {
        this.f56156b.p(drawable);
    }

    public void setErrorIconDrawable(Drawable drawable) {
        this.f56132G0.setImageDrawable(drawable);
        u0();
        f.a(this, this.f56132G0, this.f56134H0, this.f56136I0);
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(CharSequence charSequence) {
        this.f56197x0.setContentDescription(charSequence);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(Drawable drawable) {
        this.f56197x0.setImageDrawable(drawable);
    }

    public void setHint(int i10) {
        setHint(i10 != 0 ? getResources().getText(i10) : null);
    }
}
