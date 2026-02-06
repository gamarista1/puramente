package mh;

import kotlin.jvm.internal.C6496s;

/* renamed from: mh.m  reason: case insensitive filesystem */
public class C6596m {

    /* renamed from: a  reason: collision with root package name */
    public final C6608z f72218a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f72219b = true;

    public C6596m(C6608z zVar) {
        C6496s.h(zVar, "writer");
        this.f72218a = zVar;
    }

    public final boolean a() {
        return this.f72219b;
    }

    public void b() {
        this.f72219b = true;
    }

    public void c() {
        this.f72219b = false;
    }

    public void d() {
        this.f72219b = false;
    }

    public void e(byte b10) {
        this.f72218a.c((long) b10);
    }

    public final void f(char c10) {
        this.f72218a.a(c10);
    }

    public void g(double d10) {
        this.f72218a.d(String.valueOf(d10));
    }

    public void h(float f10) {
        this.f72218a.d(String.valueOf(f10));
    }

    public void i(int i10) {
        this.f72218a.c((long) i10);
    }

    public void j(long j10) {
        this.f72218a.c(j10);
    }

    public final void k(String str) {
        C6496s.h(str, "v");
        this.f72218a.d(str);
    }

    public void l(short s10) {
        this.f72218a.c((long) s10);
    }

    public void m(boolean z10) {
        this.f72218a.d(String.valueOf(z10));
    }

    public void n(String str) {
        C6496s.h(str, "value");
        this.f72218a.b(str);
    }

    /* access modifiers changed from: protected */
    public final void o(boolean z10) {
        this.f72219b = z10;
    }

    public void p() {
    }

    public void q() {
    }
}
