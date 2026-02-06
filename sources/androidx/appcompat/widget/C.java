package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;
import androidx.core.widget.i;
import j.C2115a;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import w1.m;

public class C extends TextView {
    private final C1566e mBackgroundTintHelper;
    private C1575n mEmojiTextViewHelper;
    private boolean mIsSetTypefaceProcessing;
    private Future<m> mPrecomputedTextFuture;
    private a mSuperCaller;
    private final A mTextClassifierHelper;
    private final B mTextHelper;

    private interface a {
        void a(int[] iArr, int i10);

        void b(int i10);

        int c();

        int d();

        void e(int i10, float f10);

        int[] f();

        TextClassifier g();

        int h();

        void i(TextClassifier textClassifier);

        void j(int i10, int i11, int i12, int i13);

        void k(int i10);

        int l();

        void m(int i10);
    }

    class b implements a {
        b() {
        }

        public void a(int[] iArr, int i10) {
            C.super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i10);
        }

        public void b(int i10) {
        }

        public int c() {
            return C.super.getAutoSizeTextType();
        }

        public int d() {
            return C.super.getAutoSizeMinTextSize();
        }

        public void e(int i10, float f10) {
        }

        public int[] f() {
            return C.super.getAutoSizeTextAvailableSizes();
        }

        public TextClassifier g() {
            return C.super.getTextClassifier();
        }

        public int h() {
            return C.super.getAutoSizeMaxTextSize();
        }

        public void i(TextClassifier textClassifier) {
            C.super.setTextClassifier(textClassifier);
        }

        public void j(int i10, int i11, int i12, int i13) {
            C.super.setAutoSizeTextTypeUniformWithConfiguration(i10, i11, i12, i13);
        }

        public void k(int i10) {
        }

        public int l() {
            return C.super.getAutoSizeStepGranularity();
        }

        public void m(int i10) {
            C.super.setAutoSizeTextTypeWithDefaults(i10);
        }
    }

    class c extends b {
        c() {
            super();
        }

        public void b(int i10) {
            C.super.setLastBaselineToBottomHeight(i10);
        }

        public void k(int i10) {
            C.super.setFirstBaselineToTopHeight(i10);
        }
    }

    class d extends c {
        d() {
            super();
        }

        public void e(int i10, float f10) {
            C.super.setLineHeight(i10, f10);
        }
    }

    public C(Context context) {
        this(context, (AttributeSet) null);
    }

    private void d() {
        Future<m> future = this.mPrecomputedTextFuture;
        if (future != null) {
            try {
                this.mPrecomputedTextFuture = null;
                android.support.v4.media.session.c.a(future.get());
                i.n(this, (m) null);
            } catch (InterruptedException | ExecutionException unused) {
            }
        }
    }

    private C1575n getEmojiTextViewHelper() {
        if (this.mEmojiTextViewHelper == null) {
            this.mEmojiTextViewHelper = new C1575n(this);
        }
        return this.mEmojiTextViewHelper;
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        C1566e eVar = this.mBackgroundTintHelper;
        if (eVar != null) {
            eVar.b();
        }
        B b10 = this.mTextHelper;
        if (b10 != null) {
            b10.b();
        }
    }

    public int getAutoSizeMaxTextSize() {
        if (r0.f12003c) {
            return getSuperCaller().h();
        }
        B b10 = this.mTextHelper;
        if (b10 != null) {
            return b10.e();
        }
        return -1;
    }

    public int getAutoSizeMinTextSize() {
        if (r0.f12003c) {
            return getSuperCaller().d();
        }
        B b10 = this.mTextHelper;
        if (b10 != null) {
            return b10.f();
        }
        return -1;
    }

    public int getAutoSizeStepGranularity() {
        if (r0.f12003c) {
            return getSuperCaller().l();
        }
        B b10 = this.mTextHelper;
        if (b10 != null) {
            return b10.g();
        }
        return -1;
    }

    public int[] getAutoSizeTextAvailableSizes() {
        if (r0.f12003c) {
            return getSuperCaller().f();
        }
        B b10 = this.mTextHelper;
        if (b10 != null) {
            return b10.h();
        }
        return new int[0];
    }

    @SuppressLint({"WrongConstant"})
    public int getAutoSizeTextType() {
        if (!r0.f12003c) {
            B b10 = this.mTextHelper;
            if (b10 != null) {
                return b10.i();
            }
            return 0;
        } else if (getSuperCaller().c() == 1) {
            return 1;
        } else {
            return 0;
        }
    }

    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return i.q(super.getCustomSelectionActionModeCallback());
    }

    public int getFirstBaselineToTopHeight() {
        return i.b(this);
    }

    public int getLastBaselineToBottomHeight() {
        return i.c(this);
    }

    /* access modifiers changed from: package-private */
    public a getSuperCaller() {
        if (this.mSuperCaller == null) {
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 34) {
                this.mSuperCaller = new d();
            } else if (i10 >= 28) {
                this.mSuperCaller = new c();
            } else if (i10 >= 26) {
                this.mSuperCaller = new b();
            }
        }
        return this.mSuperCaller;
    }

    public ColorStateList getSupportBackgroundTintList() {
        C1566e eVar = this.mBackgroundTintHelper;
        if (eVar != null) {
            return eVar.c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C1566e eVar = this.mBackgroundTintHelper;
        if (eVar != null) {
            return eVar.d();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.mTextHelper.j();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.mTextHelper.k();
    }

    public CharSequence getText() {
        d();
        return super.getText();
    }

    public TextClassifier getTextClassifier() {
        A a10;
        if (Build.VERSION.SDK_INT >= 28 || (a10 = this.mTextClassifierHelper) == null) {
            return getSuperCaller().g();
        }
        return a10.a();
    }

    public m.a getTextMetricsParamsCompat() {
        return i.f(this);
    }

    public boolean isEmojiCompatEnabled() {
        return getEmojiTextViewHelper().b();
    }

    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.mTextHelper.r(this, onCreateInputConnection, editorInfo);
        return C1576o.a(onCreateInputConnection, editorInfo, this);
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 30 && i10 < 33 && onCheckIsTextEditor()) {
            ((InputMethodManager) getContext().getSystemService("input_method")).isActive(this);
        }
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        B b10 = this.mTextHelper;
        if (b10 != null) {
            b10.o(z10, i10, i11, i12, i13);
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i10, int i11) {
        d();
        super.onMeasure(i10, i11);
    }

    /* access modifiers changed from: protected */
    public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        super.onTextChanged(charSequence, i10, i11, i12);
        B b10 = this.mTextHelper;
        if (b10 != null && !r0.f12003c && b10.l()) {
            this.mTextHelper.c();
        }
    }

    public void setAllCaps(boolean z10) {
        super.setAllCaps(z10);
        getEmojiTextViewHelper().d(z10);
    }

    public void setAutoSizeTextTypeUniformWithConfiguration(int i10, int i11, int i12, int i13) {
        if (r0.f12003c) {
            getSuperCaller().j(i10, i11, i12, i13);
            return;
        }
        B b10 = this.mTextHelper;
        if (b10 != null) {
            b10.t(i10, i11, i12, i13);
        }
    }

    public void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i10) {
        if (r0.f12003c) {
            getSuperCaller().a(iArr, i10);
            return;
        }
        B b10 = this.mTextHelper;
        if (b10 != null) {
            b10.u(iArr, i10);
        }
    }

    public void setAutoSizeTextTypeWithDefaults(int i10) {
        if (r0.f12003c) {
            getSuperCaller().m(i10);
            return;
        }
        B b10 = this.mTextHelper;
        if (b10 != null) {
            b10.v(i10);
        }
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C1566e eVar = this.mBackgroundTintHelper;
        if (eVar != null) {
            eVar.f(drawable);
        }
    }

    public void setBackgroundResource(int i10) {
        super.setBackgroundResource(i10);
        C1566e eVar = this.mBackgroundTintHelper;
        if (eVar != null) {
            eVar.g(i10);
        }
    }

    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        B b10 = this.mTextHelper;
        if (b10 != null) {
            b10.p();
        }
    }

    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        B b10 = this.mTextHelper;
        if (b10 != null) {
            b10.p();
        }
    }

    public void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        B b10 = this.mTextHelper;
        if (b10 != null) {
            b10.p();
        }
    }

    public void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        B b10 = this.mTextHelper;
        if (b10 != null) {
            b10.p();
        }
    }

    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(i.r(this, callback));
    }

    public void setEmojiCompatEnabled(boolean z10) {
        getEmojiTextViewHelper().e(z10);
    }

    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().a(inputFilterArr));
    }

    public void setFirstBaselineToTopHeight(int i10) {
        if (Build.VERSION.SDK_INT >= 28) {
            getSuperCaller().k(i10);
        } else {
            i.j(this, i10);
        }
    }

    public void setLastBaselineToBottomHeight(int i10) {
        if (Build.VERSION.SDK_INT >= 28) {
            getSuperCaller().b(i10);
        } else {
            i.k(this, i10);
        }
    }

    public void setLineHeight(int i10) {
        i.l(this, i10);
    }

    public void setPrecomputedText(m mVar) {
        i.n(this, mVar);
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C1566e eVar = this.mBackgroundTintHelper;
        if (eVar != null) {
            eVar.i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C1566e eVar = this.mBackgroundTintHelper;
        if (eVar != null) {
            eVar.j(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        this.mTextHelper.w(colorStateList);
        this.mTextHelper.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        this.mTextHelper.x(mode);
        this.mTextHelper.b();
    }

    public void setTextAppearance(Context context, int i10) {
        super.setTextAppearance(context, i10);
        B b10 = this.mTextHelper;
        if (b10 != null) {
            b10.q(context, i10);
        }
    }

    public void setTextClassifier(TextClassifier textClassifier) {
        A a10;
        if (Build.VERSION.SDK_INT >= 28 || (a10 = this.mTextClassifierHelper) == null) {
            getSuperCaller().i(textClassifier);
        } else {
            a10.b(textClassifier);
        }
    }

    public void setTextFuture(Future<m> future) {
        this.mPrecomputedTextFuture = future;
        if (future != null) {
            requestLayout();
        }
    }

    public void setTextMetricsParamsCompat(m.a aVar) {
        i.p(this, aVar);
    }

    public void setTextSize(int i10, float f10) {
        if (r0.f12003c) {
            super.setTextSize(i10, f10);
            return;
        }
        B b10 = this.mTextHelper;
        if (b10 != null) {
            b10.A(i10, f10);
        }
    }

    public void setTypeface(Typeface typeface, int i10) {
        Typeface typeface2;
        if (!this.mIsSetTypefaceProcessing) {
            if (typeface == null || i10 <= 0) {
                typeface2 = null;
            } else {
                typeface2 = p1.i.a(getContext(), typeface, i10);
            }
            this.mIsSetTypefaceProcessing = true;
            if (typeface2 != null) {
                typeface = typeface2;
            }
            try {
                super.setTypeface(typeface, i10);
            } finally {
                this.mIsSetTypefaceProcessing = false;
            }
        }
    }

    public C(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 16842884);
    }

    public void setLineHeight(int i10, float f10) {
        if (Build.VERSION.SDK_INT >= 34) {
            getSuperCaller().e(i10, f10);
        } else {
            i.m(this, i10, f10);
        }
    }

    public C(Context context, AttributeSet attributeSet, int i10) {
        super(d0.b(context), attributeSet, i10);
        this.mIsSetTypefaceProcessing = false;
        this.mSuperCaller = null;
        c0.a(this, getContext());
        C1566e eVar = new C1566e(this);
        this.mBackgroundTintHelper = eVar;
        eVar.e(attributeSet, i10);
        B b10 = new B(this);
        this.mTextHelper = b10;
        b10.m(attributeSet, i10);
        b10.b();
        this.mTextClassifierHelper = new A(this);
        getEmojiTextViewHelper().c(attributeSet, i10);
    }

    public void setCompoundDrawablesRelativeWithIntrinsicBounds(int i10, int i11, int i12, int i13) {
        Context context = getContext();
        Drawable drawable = null;
        Drawable b10 = i10 != 0 ? C2115a.b(context, i10) : null;
        Drawable b11 = i11 != 0 ? C2115a.b(context, i11) : null;
        Drawable b12 = i12 != 0 ? C2115a.b(context, i12) : null;
        if (i13 != 0) {
            drawable = C2115a.b(context, i13);
        }
        setCompoundDrawablesRelativeWithIntrinsicBounds(b10, b11, b12, drawable);
        B b13 = this.mTextHelper;
        if (b13 != null) {
            b13.p();
        }
    }

    public void setCompoundDrawablesWithIntrinsicBounds(int i10, int i11, int i12, int i13) {
        Context context = getContext();
        Drawable drawable = null;
        Drawable b10 = i10 != 0 ? C2115a.b(context, i10) : null;
        Drawable b11 = i11 != 0 ? C2115a.b(context, i11) : null;
        Drawable b12 = i12 != 0 ? C2115a.b(context, i12) : null;
        if (i13 != 0) {
            drawable = C2115a.b(context, i13);
        }
        setCompoundDrawablesWithIntrinsicBounds(b10, b11, b12, drawable);
        B b13 = this.mTextHelper;
        if (b13 != null) {
            b13.p();
        }
    }
}
