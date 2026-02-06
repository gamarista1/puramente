package N9;

import N9.A;
import N9.C3070t;
import android.os.Handler;
import android.os.Looper;
import ia.J;
import ja.C3645a;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import k9.n1;
import l9.s0;
import o9.u;

/* renamed from: N9.a  reason: case insensitive filesystem */
public abstract class C3052a implements C3070t {

    /* renamed from: a  reason: collision with root package name */
    private final ArrayList f33200a = new ArrayList(1);

    /* renamed from: b  reason: collision with root package name */
    private final HashSet f33201b = new HashSet(1);

    /* renamed from: c  reason: collision with root package name */
    private final A.a f33202c = new A.a();

    /* renamed from: d  reason: collision with root package name */
    private final u.a f33203d = new u.a();

    /* renamed from: e  reason: collision with root package name */
    private Looper f33204e;

    /* renamed from: f  reason: collision with root package name */
    private n1 f33205f;

    /* renamed from: g  reason: collision with root package name */
    private s0 f33206g;

    /* access modifiers changed from: protected */
    public final s0 A() {
        return (s0) C3645a.h(this.f33206g);
    }

    /* access modifiers changed from: protected */
    public final boolean B() {
        return !this.f33201b.isEmpty();
    }

    /* access modifiers changed from: protected */
    public abstract void C(J j10);

    /* access modifiers changed from: protected */
    public final void D(n1 n1Var) {
        this.f33205f = n1Var;
        Iterator it = this.f33200a.iterator();
        while (it.hasNext()) {
            ((C3070t.c) it.next()).a(this, n1Var);
        }
    }

    /* access modifiers changed from: protected */
    public abstract void E();

    public final void f(Handler handler, A a10) {
        C3645a.e(handler);
        C3645a.e(a10);
        this.f33202c.g(handler, a10);
    }

    public final void h(A a10) {
        this.f33202c.C(a10);
    }

    public final void j(Handler handler, u uVar) {
        C3645a.e(handler);
        C3645a.e(uVar);
        this.f33203d.g(handler, uVar);
    }

    public final void k(C3070t.c cVar) {
        C3645a.e(this.f33204e);
        boolean isEmpty = this.f33201b.isEmpty();
        this.f33201b.add(cVar);
        if (isEmpty) {
            z();
        }
    }

    public final void m(u uVar) {
        this.f33203d.t(uVar);
    }

    public final void n(C3070t.c cVar) {
        boolean isEmpty = this.f33201b.isEmpty();
        this.f33201b.remove(cVar);
        if (!isEmpty && this.f33201b.isEmpty()) {
            y();
        }
    }

    public final void o(C3070t.c cVar) {
        this.f33200a.remove(cVar);
        if (this.f33200a.isEmpty()) {
            this.f33204e = null;
            this.f33205f = null;
            this.f33206g = null;
            this.f33201b.clear();
            E();
            return;
        }
        n(cVar);
    }

    public final void q(C3070t.c cVar, J j10, s0 s0Var) {
        boolean z10;
        Looper myLooper = Looper.myLooper();
        Looper looper = this.f33204e;
        if (looper == null || looper == myLooper) {
            z10 = true;
        } else {
            z10 = false;
        }
        C3645a.a(z10);
        this.f33206g = s0Var;
        n1 n1Var = this.f33205f;
        this.f33200a.add(cVar);
        if (this.f33204e == null) {
            this.f33204e = myLooper;
            this.f33201b.add(cVar);
            C(j10);
        } else if (n1Var != null) {
            k(cVar);
            cVar.a(this, n1Var);
        }
    }

    /* access modifiers changed from: protected */
    public final u.a r(int i10, C3070t.b bVar) {
        return this.f33203d.u(i10, bVar);
    }

    /* access modifiers changed from: protected */
    public final u.a s(C3070t.b bVar) {
        return this.f33203d.u(0, bVar);
    }

    /* access modifiers changed from: protected */
    public final A.a v(int i10, C3070t.b bVar, long j10) {
        return this.f33202c.F(i10, bVar, j10);
    }

    /* access modifiers changed from: protected */
    public final A.a w(C3070t.b bVar) {
        return this.f33202c.F(0, bVar, 0);
    }

    /* access modifiers changed from: protected */
    public final A.a x(C3070t.b bVar, long j10) {
        C3645a.e(bVar);
        return this.f33202c.F(0, bVar, j10);
    }

    /* access modifiers changed from: protected */
    public void y() {
    }

    /* access modifiers changed from: protected */
    public void z() {
    }
}
