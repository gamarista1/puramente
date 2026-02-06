package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import androidx.core.widget.i;
import i.C2037a;

/* renamed from: androidx.appcompat.widget.f  reason: case insensitive filesystem */
public class C1567f extends Button {

    /* renamed from: a  reason: collision with root package name */
    private final C1566e f11894a;

    /* renamed from: b  reason: collision with root package name */
    private final B f11895b;

    /* renamed from: c  reason: collision with root package name */
    private C1575n f11896c;

    public C1567f(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C2037a.f21271n);
    }

    private C1575n getEmojiTextViewHelper() {
        if (this.f11896c == null) {
            this.f11896c = new C1575n(this);
        }
        return this.f11896c;
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        C1566e eVar = this.f11894a;
        if (eVar != null) {
            eVar.b();
        }
        B b10 = this.f11895b;
        if (b10 != null) {
            b10.b();
        }
    }

    public int getAutoSizeMaxTextSize() {
        if (r0.f12003c) {
            return super.getAutoSizeMaxTextSize();
        }
        B b10 = this.f11895b;
        if (b10 != null) {
            return b10.e();
        }
        return -1;
    }

    public int getAutoSizeMinTextSize() {
        if (r0.f12003c) {
            return super.getAutoSizeMinTextSize();
        }
        B b10 = this.f11895b;
        if (b10 != null) {
            return b10.f();
        }
        return -1;
    }

    public int getAutoSizeStepGranularity() {
        if (r0.f12003c) {
            return super.getAutoSizeStepGranularity();
        }
        B b10 = this.f11895b;
        if (b10 != null) {
            return b10.g();
        }
        return -1;
    }

    public int[] getAutoSizeTextAvailableSizes() {
        if (r0.f12003c) {
            return super.getAutoSizeTextAvailableSizes();
        }
        B b10 = this.f11895b;
        if (b10 != null) {
            return b10.h();
        }
        return new int[0];
    }

    @SuppressLint({"WrongConstant"})
    public int getAutoSizeTextType() {
        if (!r0.f12003c) {
            B b10 = this.f11895b;
            if (b10 != null) {
                return b10.i();
            }
            return 0;
        } else if (super.getAutoSizeTextType() == 1) {
            return 1;
        } else {
            return 0;
        }
    }

    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return i.q(super.getCustomSelectionActionModeCallback());
    }

    public ColorStateList getSupportBackgroundTintList() {
        C1566e eVar = this.f11894a;
        if (eVar != null) {
            return eVar.c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C1566e eVar = this.f11894a;
        if (eVar != null) {
            return eVar.d();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f11895b.j();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f11895b.k();
    }

    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(Button.class.getName());
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(Button.class.getName());
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        B b10 = this.f11895b;
        if (b10 != null) {
            b10.o(z10, i10, i11, i12, i13);
        }
    }

    /* access modifiers changed from: protected */
    public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        super.onTextChanged(charSequence, i10, i11, i12);
        B b10 = this.f11895b;
        if (b10 != null && !r0.f12003c && b10.l()) {
            this.f11895b.c();
        }
    }

    public void setAllCaps(boolean z10) {
        super.setAllCaps(z10);
        getEmojiTextViewHelper().d(z10);
    }

    public void setAutoSizeTextTypeUniformWithConfiguration(int i10, int i11, int i12, int i13) {
        if (r0.f12003c) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i10, i11, i12, i13);
            return;
        }
        B b10 = this.f11895b;
        if (b10 != null) {
            b10.t(i10, i11, i12, i13);
        }
    }

    public void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i10) {
        if (r0.f12003c) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i10);
            return;
        }
        B b10 = this.f11895b;
        if (b10 != null) {
            b10.u(iArr, i10);
        }
    }

    public void setAutoSizeTextTypeWithDefaults(int i10) {
        if (r0.f12003c) {
            super.setAutoSizeTextTypeWithDefaults(i10);
            return;
        }
        B b10 = this.f11895b;
        if (b10 != null) {
            b10.v(i10);
        }
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C1566e eVar = this.f11894a;
        if (eVar != null) {
            eVar.f(drawable);
        }
    }

    public void setBackgroundResource(int i10) {
        super.setBackgroundResource(i10);
        C1566e eVar = this.f11894a;
        if (eVar != null) {
            eVar.g(i10);
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

    public void setSupportAllCaps(boolean z10) {
        B b10 = this.f11895b;
        if (b10 != null) {
            b10.s(z10);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C1566e eVar = this.f11894a;
        if (eVar != null) {
            eVar.i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C1566e eVar = this.f11894a;
        if (eVar != null) {
            eVar.j(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        this.f11895b.w(colorStateList);
        this.f11895b.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        this.f11895b.x(mode);
        this.f11895b.b();
    }

    public void setTextAppearance(Context context, int i10) {
        super.setTextAppearance(context, i10);
        B b10 = this.f11895b;
        if (b10 != null) {
            b10.q(context, i10);
        }
    }

    public void setTextSize(int i10, float f10) {
        if (r0.f12003c) {
            super.setTextSize(i10, f10);
            return;
        }
        B b10 = this.f11895b;
        if (b10 != null) {
            b10.A(i10, f10);
        }
    }

    public C1567f(Context context, AttributeSet attributeSet, int i10) {
        super(d0.b(context), attributeSet, i10);
        c0.a(this, getContext());
        C1566e eVar = new C1566e(this);
        this.f11894a = eVar;
        eVar.e(attributeSet, i10);
        B b10 = new B(this);
        this.f11895b = b10;
        b10.m(attributeSet, i10);
        b10.b();
        getEmojiTextViewHelper().c(attributeSet, i10);
    }
}
