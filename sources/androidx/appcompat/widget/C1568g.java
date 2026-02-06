package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.CheckBox;
import i.C2037a;
import j.C2115a;

/* renamed from: androidx.appcompat.widget.g  reason: case insensitive filesystem */
public class C1568g extends CheckBox {

    /* renamed from: a  reason: collision with root package name */
    private final C1571j f11898a;

    /* renamed from: b  reason: collision with root package name */
    private final C1566e f11899b;

    /* renamed from: c  reason: collision with root package name */
    private final B f11900c;

    /* renamed from: d  reason: collision with root package name */
    private C1575n f11901d;

    public C1568g(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C2037a.f21272o);
    }

    private C1575n getEmojiTextViewHelper() {
        if (this.f11901d == null) {
            this.f11901d = new C1575n(this);
        }
        return this.f11901d;
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        C1566e eVar = this.f11899b;
        if (eVar != null) {
            eVar.b();
        }
        B b10 = this.f11900c;
        if (b10 != null) {
            b10.b();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        C1566e eVar = this.f11899b;
        if (eVar != null) {
            return eVar.c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C1566e eVar = this.f11899b;
        if (eVar != null) {
            return eVar.d();
        }
        return null;
    }

    public ColorStateList getSupportButtonTintList() {
        C1571j jVar = this.f11898a;
        if (jVar != null) {
            return jVar.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportButtonTintMode() {
        C1571j jVar = this.f11898a;
        if (jVar != null) {
            return jVar.c();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f11900c.j();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f11900c.k();
    }

    public void setAllCaps(boolean z10) {
        super.setAllCaps(z10);
        getEmojiTextViewHelper().d(z10);
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C1566e eVar = this.f11899b;
        if (eVar != null) {
            eVar.f(drawable);
        }
    }

    public void setBackgroundResource(int i10) {
        super.setBackgroundResource(i10);
        C1566e eVar = this.f11899b;
        if (eVar != null) {
            eVar.g(i10);
        }
    }

    public void setButtonDrawable(Drawable drawable) {
        super.setButtonDrawable(drawable);
        C1571j jVar = this.f11898a;
        if (jVar != null) {
            jVar.e();
        }
    }

    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        B b10 = this.f11900c;
        if (b10 != null) {
            b10.p();
        }
    }

    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        B b10 = this.f11900c;
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
        C1566e eVar = this.f11899b;
        if (eVar != null) {
            eVar.i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C1566e eVar = this.f11899b;
        if (eVar != null) {
            eVar.j(mode);
        }
    }

    public void setSupportButtonTintList(ColorStateList colorStateList) {
        C1571j jVar = this.f11898a;
        if (jVar != null) {
            jVar.f(colorStateList);
        }
    }

    public void setSupportButtonTintMode(PorterDuff.Mode mode) {
        C1571j jVar = this.f11898a;
        if (jVar != null) {
            jVar.g(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        this.f11900c.w(colorStateList);
        this.f11900c.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        this.f11900c.x(mode);
        this.f11900c.b();
    }

    public C1568g(Context context, AttributeSet attributeSet, int i10) {
        super(d0.b(context), attributeSet, i10);
        c0.a(this, getContext());
        C1571j jVar = new C1571j(this);
        this.f11898a = jVar;
        jVar.d(attributeSet, i10);
        C1566e eVar = new C1566e(this);
        this.f11899b = eVar;
        eVar.e(attributeSet, i10);
        B b10 = new B(this);
        this.f11900c = b10;
        b10.m(attributeSet, i10);
        getEmojiTextViewHelper().c(attributeSet, i10);
    }

    public void setButtonDrawable(int i10) {
        setButtonDrawable(C2115a.b(getContext(), i10));
    }
}
