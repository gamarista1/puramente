package com.google.android.material.textfield;

import android.content.Context;
import com.google.android.material.internal.CheckableImageButton;

abstract class e {

    /* renamed from: a  reason: collision with root package name */
    TextInputLayout f56261a;

    /* renamed from: b  reason: collision with root package name */
    Context f56262b;

    /* renamed from: c  reason: collision with root package name */
    CheckableImageButton f56263c;

    /* renamed from: d  reason: collision with root package name */
    final int f56264d;

    e(TextInputLayout textInputLayout, int i10) {
        this.f56261a = textInputLayout;
        this.f56262b = textInputLayout.getContext();
        this.f56263c = textInputLayout.getEndIconView();
        this.f56264d = i10;
    }

    /* access modifiers changed from: package-private */
    public abstract void a();

    /* access modifiers changed from: package-private */
    public boolean b(int i10) {
        return true;
    }

    /* access modifiers changed from: package-private */
    public void c(boolean z10) {
    }

    /* access modifiers changed from: package-private */
    public boolean d() {
        return false;
    }
}
