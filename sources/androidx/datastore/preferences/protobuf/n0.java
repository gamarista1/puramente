package androidx.datastore.preferences.protobuf;

class n0 extends l0 {
    n0() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: A */
    public m0 g(Object obj) {
        return ((C1749w) obj).unknownFields;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: B */
    public int h(m0 m0Var) {
        return m0Var.f();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: C */
    public int i(m0 m0Var) {
        return m0Var.g();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: D */
    public m0 k(m0 m0Var, m0 m0Var2) {
        if (m0Var2.equals(m0.e())) {
            return m0Var;
        }
        return m0.k(m0Var, m0Var2);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: E */
    public m0 n() {
        return m0.l();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: F */
    public void o(Object obj, m0 m0Var) {
        p(obj, m0Var);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: G */
    public void p(Object obj, m0 m0Var) {
        ((C1749w) obj).unknownFields = m0Var;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: H */
    public m0 r(m0 m0Var) {
        m0Var.j();
        return m0Var;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: I */
    public void s(m0 m0Var, s0 s0Var) {
        m0Var.o(s0Var);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: J */
    public void t(m0 m0Var, s0 s0Var) {
        m0Var.q(s0Var);
    }

    /* access modifiers changed from: package-private */
    public void j(Object obj) {
        g(obj).j();
    }

    /* access modifiers changed from: package-private */
    public boolean q(d0 d0Var) {
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: u */
    public void a(m0 m0Var, int i10, int i11) {
        m0Var.n(r0.c(i10, 5), Integer.valueOf(i11));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: v */
    public void b(m0 m0Var, int i10, long j10) {
        m0Var.n(r0.c(i10, 1), Long.valueOf(j10));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: w */
    public void c(m0 m0Var, int i10, m0 m0Var2) {
        m0Var.n(r0.c(i10, 3), m0Var2);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: x */
    public void d(m0 m0Var, int i10, C1734g gVar) {
        m0Var.n(r0.c(i10, 2), gVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: y */
    public void e(m0 m0Var, int i10, long j10) {
        m0Var.n(r0.c(i10, 0), Long.valueOf(j10));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: z */
    public m0 f(Object obj) {
        m0 A10 = g(obj);
        if (A10 != m0.e()) {
            return A10;
        }
        m0 l10 = m0.l();
        p(obj, l10);
        return l10;
    }
}
