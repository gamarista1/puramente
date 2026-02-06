package androidx.appcompat.widget;

import Q1.f;
import android.content.res.TypedArray;
import android.text.InputFilter;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.widget.TextView;
import i.j;

/* renamed from: androidx.appcompat.widget.n  reason: case insensitive filesystem */
class C1575n {

    /* renamed from: a  reason: collision with root package name */
    private final TextView f11965a;

    /* renamed from: b  reason: collision with root package name */
    private final f f11966b;

    C1575n(TextView textView) {
        this.f11965a = textView;
        this.f11966b = new f(textView, false);
    }

    /* access modifiers changed from: package-private */
    public InputFilter[] a(InputFilter[] inputFilterArr) {
        return this.f11966b.a(inputFilterArr);
    }

    public boolean b() {
        return this.f11966b.b();
    }

    /* JADX INFO: finally extract failed */
    /* access modifiers changed from: package-private */
    public void c(AttributeSet attributeSet, int i10) {
        TypedArray obtainStyledAttributes = this.f11965a.getContext().obtainStyledAttributes(attributeSet, j.f21585g0, i10, 0);
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
    public void d(boolean z10) {
        this.f11966b.c(z10);
    }

    /* access modifiers changed from: package-private */
    public void e(boolean z10) {
        this.f11966b.d(z10);
    }

    public TransformationMethod f(TransformationMethod transformationMethod) {
        return this.f11966b.e(transformationMethod);
    }
}
