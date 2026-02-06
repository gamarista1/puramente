package com.bugsnag.android;

import K4.k;
import K4.m;
import com.bugsnag.android.K0;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/* renamed from: com.bugsnag.android.o0  reason: case insensitive filesystem */
public class C3262o0 implements K0.a {

    /* renamed from: a  reason: collision with root package name */
    private final C3269r0 f38793a;

    /* renamed from: b  reason: collision with root package name */
    private final S0 f38794b;

    C3262o0(Throwable th2, k kVar, q1 q1Var, S0 s02) {
        this(th2, kVar, q1Var, new Y0(), new C0(), s02);
    }

    private void n(String str) {
        S0 s02 = this.f38794b;
        s02.f("Invalid null value supplied to config." + str + ", ignoring");
    }

    public void a(String str, String str2) {
        if (str != null) {
            this.f38793a.a(str, str2);
        } else {
            n("addFeatureFlag");
        }
    }

    public void b(String str, String str2, Object obj) {
        if (str == null || str2 == null) {
            n("addMetadata");
        } else {
            this.f38793a.b(str, str2, obj);
        }
    }

    public void c(String str, Map map) {
        if (str == null || map == null) {
            n("addMetadata");
        } else {
            this.f38793a.c(str, map);
        }
    }

    public void d() {
        this.f38793a.d();
    }

    public String e() {
        return this.f38793a.e();
    }

    public C3258n f() {
        return this.f38793a.f();
    }

    public List g() {
        return this.f38793a.g();
    }

    public List h() {
        return this.f38793a.j();
    }

    /* access modifiers changed from: package-private */
    public C3269r0 i() {
        return this.f38793a;
    }

    /* access modifiers changed from: package-private */
    public C3254l1 j() {
        return this.f38793a.f38847i;
    }

    public Severity k() {
        return this.f38793a.m();
    }

    public List l() {
        return this.f38793a.o();
    }

    public boolean m() {
        return this.f38793a.p();
    }

    public void o(String str) {
        if (str != null) {
            this.f38793a.s(str);
        } else {
            n("apiKey");
        }
    }

    /* access modifiers changed from: package-private */
    public void p(C3258n nVar) {
        this.f38793a.t(nVar);
    }

    /* access modifiers changed from: package-private */
    public void q(List list) {
        this.f38793a.u(list);
    }

    public void r(String str) {
        this.f38793a.v(str);
    }

    /* access modifiers changed from: package-private */
    public void s(C3244i0 i0Var) {
        this.f38793a.w(i0Var);
    }

    public void t(String str) {
        this.f38793a.x(str);
    }

    public void toStream(K0 k02) {
        this.f38793a.toStream(k02);
    }

    /* access modifiers changed from: package-private */
    public void u(m mVar) {
        this.f38793a.y(mVar);
    }

    /* access modifiers changed from: package-private */
    public void v(Collection collection) {
        this.f38793a.A(collection);
    }

    /* access modifiers changed from: package-private */
    public void w(C3254l1 l1Var) {
        this.f38793a.f38847i = l1Var;
    }

    public void x(UUID uuid, long j10) {
        if (uuid != null) {
            this.f38793a.B(new I1(uuid, j10));
        } else {
            n("traceId");
        }
    }

    public void y(String str, String str2, String str3) {
        this.f38793a.C(str, str2, str3);
    }

    /* access modifiers changed from: protected */
    public void z(Severity severity) {
        this.f38793a.G(severity);
    }

    C3262o0(Throwable th2, k kVar, q1 q1Var, Y0 y02, C0 c02, S0 s02) {
        this(new C3269r0(th2, kVar, q1Var, y02, c02), s02);
    }

    C3262o0(C3269r0 r0Var, S0 s02) {
        this.f38793a = r0Var;
        this.f38794b = s02;
    }
}
