package androidx.fragment.app;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MenuItem;
import android.view.View;
import x1.g;

/* renamed from: androidx.fragment.app.y  reason: case insensitive filesystem */
public class C1776y {

    /* renamed from: a  reason: collision with root package name */
    private final A f17074a;

    private C1776y(A a10) {
        this.f17074a = a10;
    }

    public static C1776y b(A a10) {
        return new C1776y((A) g.g(a10, "callbacks == null"));
    }

    public void a(C1769q qVar) {
        J g10 = this.f17074a.g();
        A a10 = this.f17074a;
        g10.n(a10, a10, qVar);
    }

    public void c() {
        this.f17074a.g().z();
    }

    public boolean d(MenuItem menuItem) {
        return this.f17074a.g().C(menuItem);
    }

    public void e() {
        this.f17074a.g().D();
    }

    public void f() {
        this.f17074a.g().F();
    }

    public void g() {
        this.f17074a.g().O();
    }

    public void h() {
        this.f17074a.g().S();
    }

    public void i() {
        this.f17074a.g().T();
    }

    public void j() {
        this.f17074a.g().V();
    }

    public boolean k() {
        return this.f17074a.g().c0(true);
    }

    public J l() {
        return this.f17074a.g();
    }

    public void m() {
        this.f17074a.g().d1();
    }

    public View n(View view, String str, Context context, AttributeSet attributeSet) {
        return this.f17074a.g().z0().onCreateView(view, str, context, attributeSet);
    }
}
