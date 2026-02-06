package com.bugsnag.android;

import android.content.Context;
import java.io.File;
import java.util.Set;

public class G {

    /* renamed from: a  reason: collision with root package name */
    final E f38481a;

    public G(String str) {
        this.f38481a = new E(str);
    }

    public static G I(Context context) {
        return E.J(context);
    }

    private void J(String str) {
        S0 o10 = o();
        o10.f("Invalid null value supplied to config." + str + ", ignoring");
    }

    public String A() {
        return this.f38481a.C();
    }

    public boolean B() {
        return this.f38481a.D();
    }

    public E1 C() {
        return this.f38481a.E();
    }

    public Set D() {
        return this.f38481a.F();
    }

    public long E() {
        return this.f38481a.G();
    }

    public L1 F() {
        return this.f38481a.H();
    }

    public Integer G() {
        return this.f38481a.I();
    }

    public boolean H() {
        return this.f38481a.d();
    }

    public void K(String str) {
        this.f38481a.L(str);
    }

    public void L(String str) {
        this.f38481a.M(str);
    }

    public void M(boolean z10) {
        this.f38481a.N(z10);
    }

    public void N(boolean z10) {
        this.f38481a.O(z10);
    }

    public void O(boolean z10) {
        this.f38481a.P(z10);
    }

    public void P(Q q10) {
        if (q10 != null) {
            this.f38481a.Q(q10);
        } else {
            J("delivery");
        }
    }

    public void Q(Set set) {
        if (D.a(set)) {
            J("discardClasses");
        } else {
            this.f38481a.R(set);
        }
    }

    public void R(Set set) {
        this.f38481a.S(set);
    }

    public void S(C3247j0 j0Var) {
        if (j0Var != null) {
            this.f38481a.T(j0Var);
        } else {
            J("endpoints");
        }
    }

    public void T(boolean z10) {
        this.f38481a.U(z10);
    }

    public void U(long j10) {
        if (j10 >= 0) {
            this.f38481a.V(j10);
            return;
        }
        S0 o10 = o();
        o10.f("Invalid configuration value detected. Option launchDurationMillis should be a positive long value.Supplied value is " + j10);
    }

    public void V(S0 s02) {
        this.f38481a.W(s02);
    }

    public void W(int i10) {
        if (i10 < 0 || i10 > 500) {
            S0 o10 = o();
            o10.f("Invalid configuration value detected. Option maxBreadcrumbs should be an integer between 0-500. Supplied value is " + i10);
            return;
        }
        this.f38481a.X(i10);
    }

    public void X(int i10) {
        if (i10 >= 0) {
            this.f38481a.Y(i10);
            return;
        }
        S0 o10 = o();
        o10.f("Invalid configuration value detected. Option maxPersistedEvents should be a positive integer.Supplied value is " + i10);
    }

    public void Y(int i10) {
        if (i10 >= 0) {
            this.f38481a.Z(i10);
            return;
        }
        S0 o10 = o();
        o10.f("Invalid configuration value detected. Option maxPersistedSessions should be a positive integer.Supplied value is " + i10);
    }

    public void Z(int i10) {
        if (i10 >= 0) {
            this.f38481a.a0(i10);
            return;
        }
        S0 o10 = o();
        o10.f("Invalid configuration value detected. Option maxReportedThreads should be a positive integer.Supplied value is " + i10);
    }

    public String a() {
        return this.f38481a.a();
    }

    public void a0(boolean z10) {
        this.f38481a.b0(z10);
    }

    public String b() {
        return this.f38481a.b();
    }

    public void b0(Set set) {
        if (D.a(set)) {
            J("projectPackages");
        } else {
            this.f38481a.c0(set);
        }
    }

    public String c() {
        return this.f38481a.c();
    }

    public void c0(Set set) {
        if (D.a(set)) {
            J("redactedKeys");
        } else {
            this.f38481a.d0(set);
        }
    }

    public boolean d() {
        return this.f38481a.e();
    }

    public void d0(String str) {
        this.f38481a.e0(str);
    }

    public boolean e() {
        return this.f38481a.f();
    }

    public void e0(boolean z10) {
        this.f38481a.f0(z10);
    }

    public String f() {
        return this.f38481a.h();
    }

    public void f0(E1 e12) {
        if (e12 != null) {
            this.f38481a.g0(e12);
        } else {
            J("sendThreads");
        }
    }

    public Q g() {
        return this.f38481a.i();
    }

    public void g0(long j10) {
        if (j10 >= 0) {
            this.f38481a.h0(j10);
            return;
        }
        S0 o10 = o();
        o10.f("Invalid configuration value detected. Option threadCollectionTimeLimitMillis should be a positive integer.Supplied value is " + j10);
    }

    public Set h() {
        return this.f38481a.j();
    }

    public void h0(Integer num) {
        this.f38481a.i0(num);
    }

    public Set i() {
        return this.f38481a.k();
    }

    public C3259n0 j() {
        return this.f38481a.l();
    }

    public Set k() {
        return this.f38481a.m();
    }

    public C3247j0 l() {
        return this.f38481a.n();
    }

    public boolean m() {
        return this.f38481a.o();
    }

    public long n() {
        return this.f38481a.p();
    }

    public S0 o() {
        return this.f38481a.q();
    }

    public int p() {
        return this.f38481a.r();
    }

    public int q() {
        return this.f38481a.s();
    }

    public int r() {
        return this.f38481a.t();
    }

    public int s() {
        return this.f38481a.u();
    }

    public int t() {
        return this.f38481a.v();
    }

    /* access modifiers changed from: package-private */
    public C3233e1 u() {
        return this.f38481a.w();
    }

    public boolean v() {
        return this.f38481a.x();
    }

    public File w() {
        return this.f38481a.y();
    }

    /* access modifiers changed from: package-private */
    public Set x() {
        return this.f38481a.z();
    }

    public Set y() {
        return this.f38481a.A();
    }

    public Set z() {
        return this.f38481a.B();
    }
}
