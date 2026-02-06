package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.CheckedTextView;
import androidx.core.widget.i;
import i.C2037a;
import j.C2115a;

/* renamed from: androidx.appcompat.widget.h  reason: case insensitive filesystem */
public class C1569h extends CheckedTextView {

    /* renamed from: a  reason: collision with root package name */
    private final C1570i f11905a;

    /* renamed from: b  reason: collision with root package name */
    private final C1566e f11906b;

    /* renamed from: c  reason: collision with root package name */
    private final B f11907c;

    /* renamed from: d  reason: collision with root package name */
    private C1575n f11908d;

    public C1569h(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C2037a.f21273p);
    }

    private C1575n getEmojiTextViewHelper() {
        if (this.f11908d == null) {
            this.f11908d = new C1575n(this);
        }
        return this.f11908d;
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        B b10 = this.f11907c;
        if (b10 != null) {
            b10.b();
        }
        C1566e eVar = this.f11906b;
        if (eVar != null) {
            eVar.b();
        }
        C1570i iVar = this.f11905a;
        if (iVar != null) {
            iVar.a();
        }
    }

    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return i.q(super.getCustomSelectionActionModeCallback());
    }

    public ColorStateList getSupportBackgroundTintList() {
        C1566e eVar = this.f11906b;
        if (eVar != null) {
            return eVar.c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C1566e eVar = this.f11906b;
        if (eVar != null) {
            return eVar.d();
        }
        return null;
    }

    public ColorStateList getSupportCheckMarkTintList() {
        C1570i iVar = this.f11905a;
        if (iVar != null) {
            return iVar.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportCheckMarkTintMode() {
        C1570i iVar = this.f11905a;
        if (iVar != null) {
            return iVar.c();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f11907c.j();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f11907c.k();
    }

    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        return C1576o.a(super.onCreateInputConnection(editorInfo), editorInfo, this);
    }

    public void setAllCaps(boolean z10) {
        super.setAllCaps(z10);
        getEmojiTextViewHelper().d(z10);
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C1566e eVar = this.f11906b;
        if (eVar != null) {
            eVar.f(drawable);
        }
    }

    public void setBackgroundResource(int i10) {
        super.setBackgroundResource(i10);
        C1566e eVar = this.f11906b;
        if (eVar != null) {
            eVar.g(i10);
        }
    }

    public void setCheckMarkDrawable(Drawable drawable) {
        super.setCheckMarkDrawable(drawable);
        C1570i iVar = this.f11905a;
        if (iVar != null) {
            iVar.e();
        }
    }

    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        B b10 = this.f11907c;
        if (b10 != null) {
            b10.p();
        }
    }

    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        B b10 = this.f11907c;
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

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C1566e eVar = this.f11906b;
        if (eVar != null) {
            eVar.i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C1566e eVar = this.f11906b;
        if (eVar != null) {
            eVar.j(mode);
        }
    }

    public void setSupportCheckMarkTintList(ColorStateList colorStateList) {
        C1570i iVar = this.f11905a;
        if (iVar != null) {
            iVar.f(colorStateList);
        }
    }

    public void setSupportCheckMarkTintMode(PorterDuff.Mode mode) {
        C1570i iVar = this.f11905a;
        if (iVar != null) {
            iVar.g(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        this.f11907c.w(colorStateList);
        this.f11907c.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        this.f11907c.x(mode);
        this.f11907c.b();
    }

    public void setTextAppearance(Context context, int i10) {
        super.setTextAppearance(context, i10);
        B b10 = this.f11907c;
        if (b10 != null) {
            b10.q(context, i10);
        }
    }

    public C1569h(Context context, AttributeSet attributeSet, int i10) {
        super(d0.b(context), attributeSet, i10);
        c0.a(this, getContext());
        B b10 = new B(this);
        this.f11907c = b10;
        b10.m(attributeSet, i10);
        b10.b();
        C1566e eVar = new C1566e(this);
        this.f11906b = eVar;
        eVar.e(attributeSet, i10);
        C1570i iVar = new C1570i(this);
        this.f11905a = iVar;
        iVar.d(attributeSet, i10);
        getEmojiTextViewHelper().c(attributeSet, i10);
    }

    public void setCheckMarkDrawable(int i10) {
        setCheckMarkDrawable(C2115a.b(getContext(), i10));
    }
}
