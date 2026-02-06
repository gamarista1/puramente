package com.facebook.soloader;

import android.content.Context;
import android.os.StrictMode;
import java.io.File;

/* renamed from: com.facebook.soloader.a  reason: case insensitive filesystem */
public class C3450a extends E implements w {

    /* renamed from: a  reason: collision with root package name */
    private final int f42508a;

    /* renamed from: b  reason: collision with root package name */
    private C3455f f42509b;

    public C3450a(Context context, int i10) {
        this.f42508a = i10;
        this.f42509b = new C3455f(f(context), i10);
    }

    private static File f(Context context) {
        return new File(context.getApplicationInfo().nativeLibraryDir);
    }

    public E b(Context context) {
        this.f42509b = new C3455f(f(context), this.f42508a | 1);
        return this;
    }

    public String c() {
        return "ApplicationSoSource";
    }

    public int d(String str, int i10, StrictMode.ThreadPolicy threadPolicy) {
        return this.f42509b.d(str, i10, threadPolicy);
    }

    /* access modifiers changed from: protected */
    public void e(int i10) {
        this.f42509b.e(i10);
    }

    public String toString() {
        return c() + "[" + this.f42509b.toString() + "]";
    }
}
