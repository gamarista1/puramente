package com.google.protobuf;

class i0 extends g0 {
    i0() {
    }

    /* access modifiers changed from: package-private */
    public void d(Object obj) {
        a(obj).h();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public h0 a(Object obj) {
        return ((r) obj).unknownFields;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public int b(h0 h0Var) {
        return h0Var.d();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public int c(h0 h0Var) {
        return h0Var.e();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public h0 e(h0 h0Var, h0 h0Var2) {
        if (h0.c().equals(h0Var2)) {
            return h0Var;
        }
        if (h0.c().equals(h0Var)) {
            return h0.j(h0Var, h0Var2);
        }
        return h0Var.i(h0Var2);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public void f(Object obj, h0 h0Var) {
        ((r) obj).unknownFields = h0Var;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public void g(h0 h0Var, n0 n0Var) {
        h0Var.n(n0Var);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public void h(h0 h0Var, n0 n0Var) {
        h0Var.p(n0Var);
    }
}
