package com.google.android.material.textfield;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.StateListDrawable;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.Spinner;
import androidx.core.view.C1680b0;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import ib.C5020g;
import ib.C5024k;
import y1.C2930A;

class d extends e {
    /* access modifiers changed from: private */

    /* renamed from: r  reason: collision with root package name */
    public static final boolean f56231r = true;
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public final TextWatcher f56232e = new a();
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public final View.OnFocusChangeListener f56233f = new C0840d();
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public final TextInputLayout.e f56234g = new e(this.f56261a);

    /* renamed from: h  reason: collision with root package name */
    private final TextInputLayout.f f56235h = new f();

    /* renamed from: i  reason: collision with root package name */
    private final TextInputLayout.g f56236i = new g();
    /* access modifiers changed from: private */

    /* renamed from: j  reason: collision with root package name */
    public boolean f56237j = false;
    /* access modifiers changed from: private */

    /* renamed from: k  reason: collision with root package name */
    public boolean f56238k = false;

    /* renamed from: l  reason: collision with root package name */
    private long f56239l = Long.MAX_VALUE;

    /* renamed from: m  reason: collision with root package name */
    private StateListDrawable f56240m;

    /* renamed from: n  reason: collision with root package name */
    private C5020g f56241n;
    /* access modifiers changed from: private */

    /* renamed from: o  reason: collision with root package name */
    public AccessibilityManager f56242o;

    /* renamed from: p  reason: collision with root package name */
    private ValueAnimator f56243p;
    /* access modifiers changed from: private */

    /* renamed from: q  reason: collision with root package name */
    public ValueAnimator f56244q;

    class a extends com.google.android.material.internal.k {

        /* renamed from: com.google.android.material.textfield.d$a$a  reason: collision with other inner class name */
        class C0839a implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ AutoCompleteTextView f56246a;

            C0839a(AutoCompleteTextView autoCompleteTextView) {
                this.f56246a = autoCompleteTextView;
            }

            public void run() {
                boolean isPopupShowing = this.f56246a.isPopupShowing();
                d.this.E(isPopupShowing);
                boolean unused = d.this.f56237j = isPopupShowing;
            }
        }

        a() {
        }

        public void afterTextChanged(Editable editable) {
            AutoCompleteTextView e10 = d.y(d.this.f56261a.getEditText());
            if (d.this.f56242o.isTouchExplorationEnabled() && d.D(e10) && !d.this.f56263c.hasFocus()) {
                e10.dismissDropDown();
            }
            e10.post(new C0839a(e10));
        }
    }

    class b extends AnimatorListenerAdapter {
        b() {
        }

        public void onAnimationEnd(Animator animator) {
            d dVar = d.this;
            dVar.f56263c.setChecked(dVar.f56238k);
            d.this.f56244q.start();
        }
    }

    class c implements ValueAnimator.AnimatorUpdateListener {
        c() {
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            d.this.f56263c.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    /* renamed from: com.google.android.material.textfield.d$d  reason: collision with other inner class name */
    class C0840d implements View.OnFocusChangeListener {
        C0840d() {
        }

        public void onFocusChange(View view, boolean z10) {
            d.this.f56261a.setEndIconActivated(z10);
            if (!z10) {
                d.this.E(false);
                boolean unused = d.this.f56237j = false;
            }
        }
    }

    class e extends TextInputLayout.e {
        e(TextInputLayout textInputLayout) {
            super(textInputLayout);
        }

        public void onInitializeAccessibilityNodeInfo(View view, C2930A a10) {
            super.onInitializeAccessibilityNodeInfo(view, a10);
            if (!d.D(d.this.f56261a.getEditText())) {
                a10.t0(Spinner.class.getName());
            }
            if (a10.c0()) {
                a10.F0((CharSequence) null);
            }
        }

        public void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            super.onPopulateAccessibilityEvent(view, accessibilityEvent);
            AutoCompleteTextView e10 = d.y(d.this.f56261a.getEditText());
            if (accessibilityEvent.getEventType() == 1 && d.this.f56242o.isEnabled() && !d.D(d.this.f56261a.getEditText())) {
                d.this.H(e10);
                d.this.I();
            }
        }
    }

    class f implements TextInputLayout.f {
        f() {
        }

        public void a(TextInputLayout textInputLayout) {
            AutoCompleteTextView e10 = d.y(textInputLayout.getEditText());
            d.this.F(e10);
            d.this.v(e10);
            d.this.G(e10);
            e10.setThreshold(0);
            e10.removeTextChangedListener(d.this.f56232e);
            e10.addTextChangedListener(d.this.f56232e);
            textInputLayout.setEndIconCheckable(true);
            textInputLayout.setErrorIconDrawable((Drawable) null);
            if (!d.D(e10) && d.this.f56242o.isTouchExplorationEnabled()) {
                C1680b0.y0(d.this.f56263c, 2);
            }
            textInputLayout.setTextInputAccessibilityDelegate(d.this.f56234g);
            textInputLayout.setEndIconVisible(true);
        }
    }

    class g implements TextInputLayout.g {

        class a implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ AutoCompleteTextView f56254a;

            a(AutoCompleteTextView autoCompleteTextView) {
                this.f56254a = autoCompleteTextView;
            }

            public void run() {
                this.f56254a.removeTextChangedListener(d.this.f56232e);
            }
        }

        g() {
        }

        public void a(TextInputLayout textInputLayout, int i10) {
            AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) textInputLayout.getEditText();
            if (autoCompleteTextView != null && i10 == 3) {
                autoCompleteTextView.post(new a(autoCompleteTextView));
                if (autoCompleteTextView.getOnFocusChangeListener() == d.this.f56233f) {
                    autoCompleteTextView.setOnFocusChangeListener((View.OnFocusChangeListener) null);
                }
                autoCompleteTextView.setOnTouchListener((View.OnTouchListener) null);
                if (d.f56231r) {
                    autoCompleteTextView.setOnDismissListener((AutoCompleteTextView.OnDismissListener) null);
                }
            }
        }
    }

    class h implements View.OnClickListener {
        h() {
        }

        public void onClick(View view) {
            d.this.H((AutoCompleteTextView) d.this.f56261a.getEditText());
        }
    }

    class i implements AccessibilityManager.TouchExplorationStateChangeListener {
        i() {
        }

        public void onTouchExplorationStateChanged(boolean z10) {
            int i10;
            if (d.this.f56261a.getEditText() != null && !d.D(d.this.f56261a.getEditText())) {
                CheckableImageButton checkableImageButton = d.this.f56263c;
                if (z10) {
                    i10 = 2;
                } else {
                    i10 = 1;
                }
                C1680b0.y0(checkableImageButton, i10);
            }
        }
    }

    class j implements View.OnTouchListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ AutoCompleteTextView f56258a;

        j(AutoCompleteTextView autoCompleteTextView) {
            this.f56258a = autoCompleteTextView;
        }

        public boolean onTouch(View view, MotionEvent motionEvent) {
            if (motionEvent.getAction() == 1) {
                if (d.this.C()) {
                    boolean unused = d.this.f56237j = false;
                }
                d.this.H(this.f56258a);
                d.this.I();
            }
            return false;
        }
    }

    class k implements AutoCompleteTextView.OnDismissListener {
        k() {
        }

        public void onDismiss() {
            d.this.I();
            d.this.E(false);
        }
    }

    d(TextInputLayout textInputLayout, int i10) {
        super(textInputLayout, i10);
    }

    private C5020g A(float f10, float f11, float f12, int i10) {
        C5024k m10 = C5024k.a().B(f10).G(f10).s(f11).w(f11).m();
        C5020g m11 = C5020g.m(this.f56262b, f12);
        m11.setShapeAppearanceModel(m10);
        m11.Y(0, i10, 0, i10);
        return m11;
    }

    private void B() {
        this.f56244q = z(67, 0.0f, 1.0f);
        ValueAnimator z10 = z(50, 1.0f, 0.0f);
        this.f56243p = z10;
        z10.addListener(new b());
    }

    /* access modifiers changed from: private */
    public boolean C() {
        long currentTimeMillis = System.currentTimeMillis() - this.f56239l;
        if (currentTimeMillis < 0 || currentTimeMillis > 300) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: private */
    public static boolean D(EditText editText) {
        if (editText.getKeyListener() != null) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: private */
    public void E(boolean z10) {
        if (this.f56238k != z10) {
            this.f56238k = z10;
            this.f56244q.cancel();
            this.f56243p.start();
        }
    }

    /* access modifiers changed from: private */
    public void F(AutoCompleteTextView autoCompleteTextView) {
        if (f56231r) {
            int boxBackgroundMode = this.f56261a.getBoxBackgroundMode();
            if (boxBackgroundMode == 2) {
                autoCompleteTextView.setDropDownBackgroundDrawable(this.f56241n);
            } else if (boxBackgroundMode == 1) {
                autoCompleteTextView.setDropDownBackgroundDrawable(this.f56240m);
            }
        }
    }

    /* access modifiers changed from: private */
    public void G(AutoCompleteTextView autoCompleteTextView) {
        autoCompleteTextView.setOnTouchListener(new j(autoCompleteTextView));
        autoCompleteTextView.setOnFocusChangeListener(this.f56233f);
        if (f56231r) {
            autoCompleteTextView.setOnDismissListener(new k());
        }
    }

    /* access modifiers changed from: private */
    public void H(AutoCompleteTextView autoCompleteTextView) {
        if (autoCompleteTextView != null) {
            if (C()) {
                this.f56237j = false;
            }
            if (!this.f56237j) {
                if (f56231r) {
                    E(!this.f56238k);
                } else {
                    this.f56238k = !this.f56238k;
                    this.f56263c.toggle();
                }
                if (this.f56238k) {
                    autoCompleteTextView.requestFocus();
                    autoCompleteTextView.showDropDown();
                    return;
                }
                autoCompleteTextView.dismissDropDown();
                return;
            }
            this.f56237j = false;
        }
    }

    /* access modifiers changed from: private */
    public void I() {
        this.f56237j = true;
        this.f56239l = System.currentTimeMillis();
    }

    /* access modifiers changed from: private */
    public void v(AutoCompleteTextView autoCompleteTextView) {
        if (!D(autoCompleteTextView)) {
            int boxBackgroundMode = this.f56261a.getBoxBackgroundMode();
            C5020g boxBackground = this.f56261a.getBoxBackground();
            int d10 = Ya.a.d(autoCompleteTextView, Ua.a.f52730h);
            int[][] iArr = {new int[]{16842919}, new int[0]};
            if (boxBackgroundMode == 2) {
                x(autoCompleteTextView, d10, iArr, boxBackground);
            } else if (boxBackgroundMode == 1) {
                w(autoCompleteTextView, d10, iArr, boxBackground);
            }
        }
    }

    private void w(AutoCompleteTextView autoCompleteTextView, int i10, int[][] iArr, C5020g gVar) {
        int boxBackgroundColor = this.f56261a.getBoxBackgroundColor();
        int[] iArr2 = {Ya.a.h(i10, boxBackgroundColor, 0.1f), boxBackgroundColor};
        if (f56231r) {
            C1680b0.s0(autoCompleteTextView, new RippleDrawable(new ColorStateList(iArr, iArr2), gVar, gVar));
            return;
        }
        C5020g gVar2 = new C5020g(gVar.C());
        gVar2.W(new ColorStateList(iArr, iArr2));
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{gVar, gVar2});
        int F10 = C1680b0.F(autoCompleteTextView);
        int paddingTop = autoCompleteTextView.getPaddingTop();
        int E10 = C1680b0.E(autoCompleteTextView);
        int paddingBottom = autoCompleteTextView.getPaddingBottom();
        C1680b0.s0(autoCompleteTextView, layerDrawable);
        C1680b0.D0(autoCompleteTextView, F10, paddingTop, E10, paddingBottom);
    }

    private void x(AutoCompleteTextView autoCompleteTextView, int i10, int[][] iArr, C5020g gVar) {
        LayerDrawable layerDrawable;
        int d10 = Ya.a.d(autoCompleteTextView, Ua.a.f52734l);
        C5020g gVar2 = new C5020g(gVar.C());
        int h10 = Ya.a.h(i10, d10, 0.1f);
        gVar2.W(new ColorStateList(iArr, new int[]{h10, 0}));
        if (f56231r) {
            gVar2.setTint(d10);
            ColorStateList colorStateList = new ColorStateList(iArr, new int[]{h10, d10});
            C5020g gVar3 = new C5020g(gVar.C());
            gVar3.setTint(-1);
            layerDrawable = new LayerDrawable(new Drawable[]{new RippleDrawable(colorStateList, gVar2, gVar3), gVar});
        } else {
            layerDrawable = new LayerDrawable(new Drawable[]{gVar2, gVar});
        }
        C1680b0.s0(autoCompleteTextView, layerDrawable);
    }

    /* access modifiers changed from: private */
    public static AutoCompleteTextView y(EditText editText) {
        if (editText instanceof AutoCompleteTextView) {
            return (AutoCompleteTextView) editText;
        }
        throw new RuntimeException("EditText needs to be an AutoCompleteTextView if an Exposed Dropdown Menu is being used.");
    }

    private ValueAnimator z(int i10, float... fArr) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(fArr);
        ofFloat.setInterpolator(Va.a.f53418a);
        ofFloat.setDuration((long) i10);
        ofFloat.addUpdateListener(new c());
        return ofFloat;
    }

    /* access modifiers changed from: package-private */
    public void J(AutoCompleteTextView autoCompleteTextView) {
        if (!D(autoCompleteTextView) && this.f56261a.getBoxBackgroundMode() == 2 && (autoCompleteTextView.getBackground() instanceof LayerDrawable)) {
            v(autoCompleteTextView);
        }
    }

    /* access modifiers changed from: package-private */
    public void a() {
        float dimensionPixelOffset = (float) this.f56262b.getResources().getDimensionPixelOffset(Ua.c.f52766L);
        float dimensionPixelOffset2 = (float) this.f56262b.getResources().getDimensionPixelOffset(Ua.c.f52763I);
        int dimensionPixelOffset3 = this.f56262b.getResources().getDimensionPixelOffset(Ua.c.f52764J);
        C5020g A10 = A(dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset2, dimensionPixelOffset3);
        C5020g A11 = A(0.0f, dimensionPixelOffset, dimensionPixelOffset2, dimensionPixelOffset3);
        this.f56241n = A10;
        StateListDrawable stateListDrawable = new StateListDrawable();
        this.f56240m = stateListDrawable;
        stateListDrawable.addState(new int[]{16842922}, A10);
        this.f56240m.addState(new int[0], A11);
        int i10 = this.f56264d;
        if (i10 == 0) {
            if (f56231r) {
                i10 = Ua.d.f52801d;
            } else {
                i10 = Ua.d.f52802e;
            }
        }
        this.f56261a.setEndIconDrawable(i10);
        TextInputLayout textInputLayout = this.f56261a;
        textInputLayout.setEndIconContentDescription(textInputLayout.getResources().getText(Ua.h.f52891g));
        this.f56261a.setEndIconOnClickListener(new h());
        this.f56261a.g(this.f56235h);
        this.f56261a.h(this.f56236i);
        B();
        AccessibilityManager accessibilityManager = (AccessibilityManager) this.f56262b.getSystemService("accessibility");
        this.f56242o = accessibilityManager;
        accessibilityManager.addTouchExplorationStateChangeListener(new i());
    }

    /* access modifiers changed from: package-private */
    public boolean b(int i10) {
        return i10 != 0;
    }

    /* access modifiers changed from: package-private */
    public boolean d() {
        return true;
    }
}
