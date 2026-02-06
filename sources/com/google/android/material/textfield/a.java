package com.google.android.material.textfield;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;

class a extends e {
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public final TextWatcher f56212e = new C0837a();
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public final View.OnFocusChangeListener f56213f = new b();

    /* renamed from: g  reason: collision with root package name */
    private final TextInputLayout.f f56214g = new c();

    /* renamed from: h  reason: collision with root package name */
    private final TextInputLayout.g f56215h = new d();

    /* renamed from: i  reason: collision with root package name */
    private AnimatorSet f56216i;

    /* renamed from: j  reason: collision with root package name */
    private ValueAnimator f56217j;

    /* renamed from: com.google.android.material.textfield.a$a  reason: collision with other inner class name */
    class C0837a implements TextWatcher {
        C0837a() {
        }

        public void afterTextChanged(Editable editable) {
            if (a.this.f56261a.getSuffixText() == null) {
                a aVar = a.this;
                aVar.i(aVar.m());
            }
        }

        public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }

        public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }
    }

    class b implements View.OnFocusChangeListener {
        b() {
        }

        public void onFocusChange(View view, boolean z10) {
            a aVar = a.this;
            aVar.i(aVar.m());
        }
    }

    class c implements TextInputLayout.f {
        c() {
        }

        public void a(TextInputLayout textInputLayout) {
            EditText editText = textInputLayout.getEditText();
            textInputLayout.setEndIconVisible(a.this.m());
            editText.setOnFocusChangeListener(a.this.f56213f);
            a aVar = a.this;
            aVar.f56263c.setOnFocusChangeListener(aVar.f56213f);
            editText.removeTextChangedListener(a.this.f56212e);
            editText.addTextChangedListener(a.this.f56212e);
        }
    }

    class d implements TextInputLayout.g {

        /* renamed from: com.google.android.material.textfield.a$d$a  reason: collision with other inner class name */
        class C0838a implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ EditText f56222a;

            C0838a(EditText editText) {
                this.f56222a = editText;
            }

            public void run() {
                this.f56222a.removeTextChangedListener(a.this.f56212e);
                a.this.i(true);
            }
        }

        d() {
        }

        public void a(TextInputLayout textInputLayout, int i10) {
            EditText editText = textInputLayout.getEditText();
            if (editText != null && i10 == 2) {
                editText.post(new C0838a(editText));
                if (editText.getOnFocusChangeListener() == a.this.f56213f) {
                    editText.setOnFocusChangeListener((View.OnFocusChangeListener) null);
                }
                if (a.this.f56263c.getOnFocusChangeListener() == a.this.f56213f) {
                    a.this.f56263c.setOnFocusChangeListener((View.OnFocusChangeListener) null);
                }
            }
        }
    }

    class e implements View.OnClickListener {
        e() {
        }

        public void onClick(View view) {
            Editable text = a.this.f56261a.getEditText().getText();
            if (text != null) {
                text.clear();
            }
            a.this.f56261a.U();
        }
    }

    class f extends AnimatorListenerAdapter {
        f() {
        }

        public void onAnimationStart(Animator animator) {
            a.this.f56261a.setEndIconVisible(true);
        }
    }

    class g extends AnimatorListenerAdapter {
        g() {
        }

        public void onAnimationEnd(Animator animator) {
            a.this.f56261a.setEndIconVisible(false);
        }
    }

    class h implements ValueAnimator.AnimatorUpdateListener {
        h() {
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            a.this.f56263c.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    class i implements ValueAnimator.AnimatorUpdateListener {
        i() {
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            a.this.f56263c.setScaleX(floatValue);
            a.this.f56263c.setScaleY(floatValue);
        }
    }

    a(TextInputLayout textInputLayout, int i10) {
        super(textInputLayout, i10);
    }

    /* access modifiers changed from: private */
    public void i(boolean z10) {
        boolean z11;
        if (this.f56261a.K() == z10) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z10 && !this.f56216i.isRunning()) {
            this.f56217j.cancel();
            this.f56216i.start();
            if (z11) {
                this.f56216i.end();
            }
        } else if (!z10) {
            this.f56216i.cancel();
            this.f56217j.start();
            if (z11) {
                this.f56217j.end();
            }
        }
    }

    private ValueAnimator j(float... fArr) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(fArr);
        ofFloat.setInterpolator(Va.a.f53418a);
        ofFloat.setDuration(100);
        ofFloat.addUpdateListener(new h());
        return ofFloat;
    }

    private ValueAnimator k() {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.8f, 1.0f});
        ofFloat.setInterpolator(Va.a.f53421d);
        ofFloat.setDuration(150);
        ofFloat.addUpdateListener(new i());
        return ofFloat;
    }

    private void l() {
        ValueAnimator k10 = k();
        ValueAnimator j10 = j(0.0f, 1.0f);
        AnimatorSet animatorSet = new AnimatorSet();
        this.f56216i = animatorSet;
        animatorSet.playTogether(new Animator[]{k10, j10});
        this.f56216i.addListener(new f());
        ValueAnimator j11 = j(1.0f, 0.0f);
        this.f56217j = j11;
        j11.addListener(new g());
    }

    /* access modifiers changed from: private */
    public boolean m() {
        EditText editText = this.f56261a.getEditText();
        if (editText == null || ((!editText.hasFocus() && !this.f56263c.hasFocus()) || editText.getText().length() <= 0)) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    public void a() {
        TextInputLayout textInputLayout = this.f56261a;
        int i10 = this.f56264d;
        if (i10 == 0) {
            i10 = Ua.d.f52803f;
        }
        textInputLayout.setEndIconDrawable(i10);
        TextInputLayout textInputLayout2 = this.f56261a;
        textInputLayout2.setEndIconContentDescription(textInputLayout2.getResources().getText(Ua.h.f52889e));
        this.f56261a.setEndIconCheckable(false);
        this.f56261a.setEndIconOnClickListener(new e());
        this.f56261a.g(this.f56214g);
        this.f56261a.h(this.f56215h);
        l();
    }

    /* access modifiers changed from: package-private */
    public void c(boolean z10) {
        if (this.f56261a.getSuffixText() != null) {
            i(z10);
        }
    }
}
