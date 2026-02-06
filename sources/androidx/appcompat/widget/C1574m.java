package androidx.appcompat.widget;

import Q1.a;
import android.content.res.TypedArray;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.EditText;
import i.j;

/* renamed from: androidx.appcompat.widget.m  reason: case insensitive filesystem */
class C1574m {

    /* renamed from: a  reason: collision with root package name */
    private final EditText f11962a;

    /* renamed from: b  reason: collision with root package name */
    private final a f11963b;

    C1574m(EditText editText) {
        this.f11962a = editText;
        this.f11963b = new a(editText, false);
    }

    /* access modifiers changed from: package-private */
    public KeyListener a(KeyListener keyListener) {
        if (b(keyListener)) {
            return this.f11963b.a(keyListener);
        }
        return keyListener;
    }

    /* access modifiers changed from: package-private */
    public boolean b(KeyListener keyListener) {
        return !(keyListener instanceof NumberKeyListener);
    }

    /* JADX INFO: finally extract failed */
    /* access modifiers changed from: package-private */
    public void c(AttributeSet attributeSet, int i10) {
        TypedArray obtainStyledAttributes = this.f11962a.getContext().obtainStyledAttributes(attributeSet, j.f21585g0, i10, 0);
        try {
            boolean z10 = true;
            if (obtainStyledAttributes.hasValue(j.f21655u0)) {
                z10 = obtainStyledAttributes.getBoolean(j.f21655u0, true);
            }
            obtainStyledAttributes.recycle();
            e(z10);
        } catch (Throwable th2) {
            obtainStyledAttributes.recycle();
            throw th2;
        }
    }

    /* access modifiers changed from: package-private */
    public InputConnection d(InputConnection inputConnection, EditorInfo editorInfo) {
        return this.f11963b.b(inputConnection, editorInfo);
    }

    /* access modifiers changed from: package-private */
    public void e(boolean z10) {
        this.f11963b.c(z10);
    }
}
