package Nb;

import Lb.C4368b;
import Ob.l;
import Qb.a;
import Qb.i;
import Tb.g;
import Tb.n;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;

public class d implements e {

    /* renamed from: a  reason: collision with root package name */
    private boolean f52072a = false;

    private void p() {
        l.g(this.f52072a, "Transaction expected to already be in progress.");
    }

    public List a() {
        return Collections.emptyList();
    }

    public void b(long j10) {
        p();
    }

    public void c(Lb.l lVar, n nVar, long j10) {
        p();
    }

    public void d(Lb.l lVar, C4368b bVar, long j10) {
        p();
    }

    public void e(i iVar, n nVar) {
        p();
    }

    public Object f(Callable callable) {
        l.g(!this.f52072a, "runInTransaction called when an existing transaction is already in progress.");
        this.f52072a = true;
        try {
            Object call = callable.call();
            this.f52072a = false;
            return call;
        } catch (Throwable th2) {
            this.f52072a = false;
            throw th2;
        }
    }

    public void g(Lb.l lVar, n nVar) {
        p();
    }

    public void h(Lb.l lVar, C4368b bVar) {
        p();
    }

    public void i(i iVar) {
        p();
    }

    public void j(i iVar) {
        p();
    }

    public a k(i iVar) {
        return new a(Tb.i.d(g.A(), iVar.c()), false, false);
    }

    public void l(i iVar, Set set) {
        p();
    }

    public void m(i iVar) {
        p();
    }

    public void n(i iVar, Set set, Set set2) {
        p();
    }

    public void o(Lb.l lVar, C4368b bVar) {
        p();
    }
}
