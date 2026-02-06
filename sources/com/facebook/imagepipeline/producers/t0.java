package com.facebook.imagepipeline.producers;

import T5.k;
import W6.g;
import c7.C3189i;

public class t0 implements d0 {

    /* renamed from: a  reason: collision with root package name */
    private final u0[] f40070a;

    private class a extends C3313t {

        /* renamed from: c  reason: collision with root package name */
        private final e0 f40071c;

        /* renamed from: d  reason: collision with root package name */
        private final int f40072d;

        /* renamed from: e  reason: collision with root package name */
        private final g f40073e;

        public a(C3308n nVar, e0 e0Var, int i10) {
            super(nVar);
            this.f40071c = e0Var;
            this.f40072d = i10;
            this.f40073e = e0Var.F().r();
        }

        /* access modifiers changed from: protected */
        public void h(Throwable th2) {
            if (!t0.this.e(this.f40072d + 1, p(), this.f40071c)) {
                p().a(th2);
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: q */
        public void i(C3189i iVar, int i10) {
            if (iVar != null && (C3297c.f(i10) || v0.c(iVar, this.f40073e))) {
                p().c(iVar, i10);
            } else if (C3297c.e(i10)) {
                C3189i.f(iVar);
                if (!t0.this.e(this.f40072d + 1, p(), this.f40071c)) {
                    p().c((Object) null, 1);
                }
            }
        }
    }

    public t0(u0... u0VarArr) {
        u0[] u0VarArr2 = (u0[]) k.g(u0VarArr);
        this.f40070a = u0VarArr2;
        k.e(0, u0VarArr2.length);
    }

    private int d(int i10, g gVar) {
        while (true) {
            u0[] u0VarArr = this.f40070a;
            if (i10 >= u0VarArr.length) {
                return -1;
            }
            if (u0VarArr[i10].a(gVar)) {
                return i10;
            }
            i10++;
        }
    }

    /* access modifiers changed from: private */
    public boolean e(int i10, C3308n nVar, e0 e0Var) {
        int d10 = d(i10, e0Var.F().r());
        if (d10 == -1) {
            return false;
        }
        this.f40070a[d10].b(new a(nVar, e0Var, d10), e0Var);
        return true;
    }

    public void b(C3308n nVar, e0 e0Var) {
        if (e0Var.F().r() == null) {
            nVar.c((Object) null, 1);
        } else if (!e(0, nVar, e0Var)) {
            nVar.c((Object) null, 1);
        }
    }
}
