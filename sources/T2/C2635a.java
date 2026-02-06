package t2;

import android.os.Handler;
import android.os.Looper;
import f2.H;
import i2.C2076a;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import k2.x;
import n2.u1;
import p2.t;
import t2.C2615C;
import t2.C2621I;

/* renamed from: t2.a  reason: case insensitive filesystem */
public abstract class C2635a implements C2615C {

    /* renamed from: a  reason: collision with root package name */
    private final ArrayList f26155a = new ArrayList(1);

    /* renamed from: b  reason: collision with root package name */
    private final HashSet f26156b = new HashSet(1);

    /* renamed from: c  reason: collision with root package name */
    private final C2621I.a f26157c = new C2621I.a();

    /* renamed from: d  reason: collision with root package name */
    private final t.a f26158d = new t.a();

    /* renamed from: e  reason: collision with root package name */
    private Looper f26159e;

    /* renamed from: f  reason: collision with root package name */
    private H f26160f;

    /* renamed from: g  reason: collision with root package name */
    private u1 f26161g;

    /* access modifiers changed from: protected */
    public abstract void A();

    public final void f(C2615C.c cVar) {
        boolean isEmpty = this.f26156b.isEmpty();
        this.f26156b.remove(cVar);
        if (!isEmpty && this.f26156b.isEmpty()) {
            u();
        }
    }

    public final void g(C2615C.c cVar) {
        this.f26155a.remove(cVar);
        if (this.f26155a.isEmpty()) {
            this.f26159e = null;
            this.f26160f = null;
            this.f26161g = null;
            this.f26156b.clear();
            A();
            return;
        }
        f(cVar);
    }

    public final void h(Handler handler, t tVar) {
        C2076a.e(handler);
        C2076a.e(tVar);
        this.f26158d.g(handler, tVar);
    }

    public final void i(Handler handler, C2621I i10) {
        C2076a.e(handler);
        C2076a.e(i10);
        this.f26157c.f(handler, i10);
    }

    public final void k(C2615C.c cVar, x xVar, u1 u1Var) {
        boolean z10;
        Looper myLooper = Looper.myLooper();
        Looper looper = this.f26159e;
        if (looper == null || looper == myLooper) {
            z10 = true;
        } else {
            z10 = false;
        }
        C2076a.a(z10);
        this.f26161g = u1Var;
        H h10 = this.f26160f;
        this.f26155a.add(cVar);
        if (this.f26159e == null) {
            this.f26159e = myLooper;
            this.f26156b.add(cVar);
            y(xVar);
        } else if (h10 != null) {
            p(cVar);
            cVar.a(this, h10);
        }
    }

    public final void l(C2621I i10) {
        this.f26157c.v(i10);
    }

    public final void n(t tVar) {
        this.f26158d.t(tVar);
    }

    public final void p(C2615C.c cVar) {
        C2076a.e(this.f26159e);
        boolean isEmpty = this.f26156b.isEmpty();
        this.f26156b.add(cVar);
        if (isEmpty) {
            v();
        }
    }

    /* access modifiers changed from: protected */
    public final t.a q(int i10, C2615C.b bVar) {
        return this.f26158d.u(i10, bVar);
    }

    /* access modifiers changed from: protected */
    public final t.a r(C2615C.b bVar) {
        return this.f26158d.u(0, bVar);
    }

    /* access modifiers changed from: protected */
    public final C2621I.a s(int i10, C2615C.b bVar) {
        return this.f26157c.w(i10, bVar);
    }

    /* access modifiers changed from: protected */
    public final C2621I.a t(C2615C.b bVar) {
        return this.f26157c.w(0, bVar);
    }

    /* access modifiers changed from: protected */
    public final u1 w() {
        return (u1) C2076a.i(this.f26161g);
    }

    /* access modifiers changed from: protected */
    public final boolean x() {
        return !this.f26156b.isEmpty();
    }

    /* access modifiers changed from: protected */
    public abstract void y(x xVar);

    /* access modifiers changed from: protected */
    public final void z(H h10) {
        this.f26160f = h10;
        Iterator it = this.f26155a.iterator();
        while (it.hasNext()) {
            ((C2615C.c) it.next()).a(this, h10);
        }
    }

    /* access modifiers changed from: protected */
    public void u() {
    }

    /* access modifiers changed from: protected */
    public void v() {
    }
}
