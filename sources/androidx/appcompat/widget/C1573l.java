package androidx.appcompat.widget;

import A1.c;
import A1.e;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Editable;
import android.text.method.KeyListener;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.DragEvent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.view.textclassifier.TextClassifier;
import android.widget.EditText;
import androidx.core.view.C1680b0;
import androidx.core.view.C1683d;
import androidx.core.view.K;
import androidx.core.widget.i;
import androidx.core.widget.j;
import i.C2037a;

/* renamed from: androidx.appcompat.widget.l  reason: case insensitive filesystem */
public class C1573l extends EditText implements K {

    /* renamed from: a  reason: collision with root package name */
    private final C1566e f11955a;

    /* renamed from: b  reason: collision with root package name */
    private final B f11956b;

    /* renamed from: c  reason: collision with root package name */
    private final A f11957c;

    /* renamed from: d  reason: collision with root package name */
    private final j f11958d;

    /* renamed from: e  reason: collision with root package name */
    private final C1574m f11959e;

    /* renamed from: f  reason: collision with root package name */
    private a f11960f;

    /* renamed from: androidx.appcompat.widget.l$a */
    class a {
        a() {
        }

        public TextClassifier a() {
            return C1573l.super.getTextClassifier();
        }

        public void b(TextClassifier textClassifier) {
            C1573l.super.setTextClassifier(textClassifier);
        }
    }

    public C1573l(Context context) {
        this(context, (AttributeSet) null);
    }

    private a getSuperCaller() {
        if (this.f11960f == null) {
            this.f11960f = new a();
        }
        return this.f11960f;
    }

    public C1683d a(C1683d dVar) {
        return this.f11958d.a(this, dVar);
    }

    /* access modifiers changed from: package-private */
    public void d(C1574m mVar) {
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
        C1566e eVar = this.f11955a;
        if (eVar != null) {
            eVar.b();
        }
        B b10 = this.f11956b;
        if (b10 != null) {
            b10.b();
        }
    }

    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return i.q(super.getCustomSelectionActionModeCallback());
    }

    public ColorStateList getSupportBackgroundTintList() {
        C1566e eVar = this.f11955a;
        if (eVar != null) {
            return eVar.c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C1566e eVar = this.f11955a;
        if (eVar != null) {
            return eVar.d();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f11956b.j();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f11956b.k();
    }

    public TextClassifier getTextClassifier() {
        A a10;
        if (Build.VERSION.SDK_INT >= 28 || (a10 = this.f11957c) == null) {
            return getSuperCaller().a();
        }
        return a10.a();
    }

    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        String[] D10;
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.f11956b.r(this, onCreateInputConnection, editorInfo);
        InputConnection a10 = C1576o.a(onCreateInputConnection, editorInfo, this);
        if (!(a10 == null || Build.VERSION.SDK_INT > 30 || (D10 = C1680b0.D(this)) == null)) {
            c.d(editorInfo, D10);
            a10 = e.c(this, a10, editorInfo);
        }
        return this.f11959e.d(a10, editorInfo);
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 30 && i10 < 33) {
            ((InputMethodManager) getContext().getSystemService("input_method")).isActive(this);
        }
    }

    public boolean onDragEvent(DragEvent dragEvent) {
        if (C1583w.a(this, dragEvent)) {
            return true;
        }
        return super.onDragEvent(dragEvent);
    }

    public boolean onTextContextMenuItem(int i10) {
        if (C1583w.b(this, i10)) {
            return true;
        }
        return super.onTextContextMenuItem(i10);
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C1566e eVar = this.f11955a;
        if (eVar != null) {
            eVar.f(drawable);
        }
    }

    public void setBackgroundResource(int i10) {
        super.setBackgroundResource(i10);
        C1566e eVar = this.f11955a;
        if (eVar != null) {
            eVar.g(i10);
        }
    }

    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        B b10 = this.f11956b;
        if (b10 != null) {
            b10.p();
        }
    }

    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        B b10 = this.f11956b;
        if (b10 != null) {
            b10.p();
        }
    }

    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(i.r(this, callback));
    }

    public void setEmojiCompatEnabled(boolean z10) {
        this.f11959e.e(z10);
    }

    public void setKeyListener(KeyListener keyListener) {
        super.setKeyListener(this.f11959e.a(keyListener));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C1566e eVar = this.f11955a;
        if (eVar != null) {
            eVar.i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C1566e eVar = this.f11955a;
        if (eVar != null) {
            eVar.j(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        this.f11956b.w(colorStateList);
        this.f11956b.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        this.f11956b.x(mode);
        this.f11956b.b();
    }

    public void setTextAppearance(Context context, int i10) {
        super.setTextAppearance(context, i10);
        B b10 = this.f11956b;
        if (b10 != null) {
            b10.q(context, i10);
        }
    }

    public void setTextClassifier(TextClassifier textClassifier) {
        A a10;
        if (Build.VERSION.SDK_INT >= 28 || (a10 = this.f11957c) == null) {
            getSuperCaller().b(textClassifier);
        } else {
            a10.b(textClassifier);
        }
    }

    public C1573l(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C2037a.f21282y);
    }

    public Editable getText() {
        if (Build.VERSION.SDK_INT >= 28) {
            return super.getText();
        }
        return super.getEditableText();
    }

    public C1573l(Context context, AttributeSet attributeSet, int i10) {
        super(d0.b(context), attributeSet, i10);
        c0.a(this, getContext());
        C1566e eVar = new C1566e(this);
        this.f11955a = eVar;
        eVar.e(attributeSet, i10);
        B b10 = new B(this);
        this.f11956b = b10;
        b10.m(attributeSet, i10);
        b10.b();
        this.f11957c = new A(this);
        this.f11958d = new j();
        C1574m mVar = new C1574m(this);
        this.f11959e = mVar;
        mVar.c(attributeSet, i10);
        d(mVar);
    }
}
