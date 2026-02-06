package c0;

import Ef.m;
import java.util.ConcurrentModificationException;
import java.util.ListIterator;
import kotlin.jvm.internal.C6496s;
import zf.C6828a;

public final class h extends C1887a implements ListIterator, C6828a {

    /* renamed from: c  reason: collision with root package name */
    private final f f19194c;

    /* renamed from: d  reason: collision with root package name */
    private int f19195d;

    /* renamed from: e  reason: collision with root package name */
    private k f19196e;

    /* renamed from: f  reason: collision with root package name */
    private int f19197f = -1;

    public h(f fVar, int i10) {
        super(i10, fVar.size());
        this.f19194c = fVar;
        this.f19195d = fVar.n();
        o();
    }

    private final void k() {
        if (this.f19195d != this.f19194c.n()) {
            throw new ConcurrentModificationException();
        }
    }

    private final void l() {
        if (this.f19197f == -1) {
            throw new IllegalStateException();
        }
    }

    private final void n() {
        j(this.f19194c.size());
        this.f19195d = this.f19194c.n();
        this.f19197f = -1;
        o();
    }

    private final void o() {
        Object[] r10 = this.f19194c.r();
        if (r10 == null) {
            this.f19196e = null;
            return;
        }
        int d10 = l.d(this.f19194c.size());
        int h10 = m.h(c(), d10);
        int t10 = (this.f19194c.t() / 5) + 1;
        k kVar = this.f19196e;
        if (kVar == null) {
            this.f19196e = new k(r10, h10, d10, t10);
            return;
        }
        C6496s.e(kVar);
        kVar.o(r10, h10, d10, t10);
    }

    public void add(Object obj) {
        k();
        this.f19194c.add(c(), obj);
        g(c() + 1);
        n();
    }

    public Object next() {
        k();
        a();
        this.f19197f = c();
        k kVar = this.f19196e;
        if (kVar == null) {
            Object[] v10 = this.f19194c.v();
            int c10 = c();
            g(c10 + 1);
            return v10[c10];
        } else if (kVar.hasNext()) {
            g(c() + 1);
            return kVar.next();
        } else {
            Object[] v11 = this.f19194c.v();
            int c11 = c();
            g(c11 + 1);
            return v11[c11 - kVar.e()];
        }
    }

    public Object previous() {
        k();
        b();
        this.f19197f = c() - 1;
        k kVar = this.f19196e;
        if (kVar == null) {
            Object[] v10 = this.f19194c.v();
            g(c() - 1);
            return v10[c()];
        } else if (c() > kVar.e()) {
            Object[] v11 = this.f19194c.v();
            g(c() - 1);
            return v11[c() - kVar.e()];
        } else {
            g(c() - 1);
            return kVar.previous();
        }
    }

    public void remove() {
        k();
        l();
        this.f19194c.remove(this.f19197f);
        if (this.f19197f < c()) {
            g(this.f19197f);
        }
        n();
    }

    public void set(Object obj) {
        k();
        l();
        this.f19194c.set(this.f19197f, obj);
        this.f19195d = this.f19194c.n();
        o();
    }
}
