package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.ToggleButton;

public class G extends ToggleButton {

    /* renamed from: a  reason: collision with root package name */
    private final C1566e f11546a;

    /* renamed from: b  reason: collision with root package name */
    private final B f11547b;

    /* renamed from: c  reason: collision with root package name */
    private C1575n f11548c;

    public G(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 16842827);
    }

    private C1575n getEmojiTextViewHelper() {
        if (this.f11548c == null) {
            this.f11548c = new C1575n(this);
        }
        return this.f11548c;
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        C1566e eVar = this.f11546a;
        if (eVar != null) {
            eVar.b();
        }
        B b10 = this.f11547b;
        if (b10 != null) {
            b10.b();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        C1566e eVar = this.f11546a;
        if (eVar != null) {
            return eVar.c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C1566e eVar = this.f11546a;
        if (eVar != null) {
            return eVar.d();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f11547b.j();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f11547b.k();
    }

    public void setAllCaps(boolean z10) {
        super.setAllCaps(z10);
        getEmojiTextViewHelper().d(z10);
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C1566e eVar = this.f11546a;
        if (eVar != null) {
            eVar.f(drawable);
        }
    }

    public void setBackgroundResource(int i10) {
        super.setBackgroundResource(i10);
        C1566e eVar = this.f11546a;
        if (eVar != null) {
            eVar.g(i10);
        }
    }

    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        B b10 = this.f11547b;
        if (b10 != null) {
            b10.p();
        }
    }

    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        B b10 = this.f11547b;
        if (b10 != null) {
            b10.p();
        }
    }

    public void setEmojiCompatEnabled(boolean z10) {
        getEmojiTextViewHelper().e(z10);
    }

    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().a(inputFilterArr));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C1566e eVar = this.f11546a;
        if (eVar != null) {
            eVar.i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C1566e eVar = this.f11546a;
        if (eVar != null) {
            eVar.j(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        this.f11547b.w(colorStateList);
        this.f11547b.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        this.f11547b.x(mode);
        this.f11547b.b();
    }

    public G(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        c0.a(this, getContext());
        C1566e eVar = new C1566e(this);
        this.f11546a = eVar;
        eVar.e(attributeSet, i10);
        B b10 = new B(this);
        this.f11547b = b10;
        b10.m(attributeSet, i10);
        getEmojiTextViewHelper().c(attributeSet, i10);
    }
}
