package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.method.KeyListener;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.AutoCompleteTextView;
import androidx.core.widget.i;
import i.C2037a;
import j.C2115a;

/* renamed from: androidx.appcompat.widget.d  reason: case insensitive filesystem */
public class C1565d extends AutoCompleteTextView {

    /* renamed from: d  reason: collision with root package name */
    private static final int[] f11876d = {16843126};

    /* renamed from: a  reason: collision with root package name */
    private final C1566e f11877a;

    /* renamed from: b  reason: collision with root package name */
    private final B f11878b;

    /* renamed from: c  reason: collision with root package name */
    private final C1574m f11879c;

    public C1565d(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C2037a.f21270m);
    }

    /* access modifiers changed from: package-private */
    public void a(C1574m mVar) {
        KeyListener keyListener = getKeyListener();
        if (mVar.b(keyListener)) {
            boolean isFocusable = super.isFocusable();
            boolean isClickable = super.isClickable();
            boolean isLongClickable = super.isLongClickable();
            int inputType = super.getInputType();
            KeyListener a10 = mVar.a(keyListener);
            if (a10 != keyListener) {
                super.setKeyListener(a10);
                super.setRawInputType(inputType);
                super.setFocusable(isFocusable);
                super.setClickable(isClickable);
                super.setLongClickable(isLongClickable);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        C1566e eVar = this.f11877a;
        if (eVar != null) {
            eVar.b();
        }
        B b10 = this.f11878b;
        if (b10 != null) {
            b10.b();
        }
    }

    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return i.q(super.getCustomSelectionActionModeCallback());
    }

    public ColorStateList getSupportBackgroundTintList() {
        C1566e eVar = this.f11877a;
        if (eVar != null) {
            return eVar.c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C1566e eVar = this.f11877a;
        if (eVar != null) {
            return eVar.d();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f11878b.j();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f11878b.k();
    }

    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        return this.f11879c.d(C1576o.a(super.onCreateInputConnection(editorInfo), editorInfo, this), editorInfo);
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C1566e eVar = this.f11877a;
        if (eVar != null) {
            eVar.f(drawable);
        }
    }

    public void setBackgroundResource(int i10) {
        super.setBackgroundResource(i10);
        C1566e eVar = this.f11877a;
        if (eVar != null) {
            eVar.g(i10);
        }
    }

    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        B b10 = this.f11878b;
        if (b10 != null) {
            b10.p();
        }
    }

    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        B b10 = this.f11878b;
        if (b10 != null) {
            b10.p();
        }
    }

    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(i.r(this, callback));
    }

    public void setDropDownBackgroundResource(int i10) {
        setDropDownBackgroundDrawable(C2115a.b(getContext(), i10));
    }

    public void setEmojiCompatEnabled(boolean z10) {
        this.f11879c.e(z10);
    }

    public void setKeyListener(KeyListener keyListener) {
        super.setKeyListener(this.f11879c.a(keyListener));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C1566e eVar = this.f11877a;
        if (eVar != null) {
            eVar.i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C1566e eVar = this.f11877a;
        if (eVar != null) {
            eVar.j(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        this.f11878b.w(colorStateList);
        this.f11878b.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        this.f11878b.x(mode);
        this.f11878b.b();
    }

    public void setTextAppearance(Context context, int i10) {
        super.setTextAppearance(context, i10);
        B b10 = this.f11878b;
        if (b10 != null) {
            b10.q(context, i10);
        }
    }

    public C1565d(Context context, AttributeSet attributeSet, int i10) {
        super(d0.b(context), attributeSet, i10);
        c0.a(this, getContext());
        g0 v10 = g0.v(getContext(), attributeSet, f11876d, i10, 0);
        if (v10.s(0)) {
            setDropDownBackgroundDrawable(v10.g(0));
        }
        v10.x();
        C1566e eVar = new C1566e(this);
        this.f11877a = eVar;
        eVar.e(attributeSet, i10);
        B b10 = new B(this);
        this.f11878b = b10;
        b10.m(attributeSet, i10);
        b10.b();
        C1574m mVar = new C1574m(this);
        this.f11879c = mVar;
        mVar.c(attributeSet, i10);
        a(mVar);
    }
}
