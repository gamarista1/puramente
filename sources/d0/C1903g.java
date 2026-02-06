package d0;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.V;
import zf.C6828a;

/* renamed from: d0.g  reason: case insensitive filesystem */
public class C1903g extends C1901e implements Iterator, C6828a {

    /* renamed from: d  reason: collision with root package name */
    private final C1902f f19414d;

    /* renamed from: e  reason: collision with root package name */
    private Object f19415e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f19416f;

    /* renamed from: g  reason: collision with root package name */
    private int f19417g;

    public C1903g(C1902f fVar, C1917u[] uVarArr) {
        super(fVar.k(), uVarArr);
        this.f19414d = fVar;
        this.f19417g = fVar.j();
    }

    private final void k() {
        if (this.f19414d.j() != this.f19417g) {
            throw new ConcurrentModificationException();
        }
    }

    private final void l() {
        if (!this.f19416f) {
            throw new IllegalStateException();
        }
    }

    private final void n(int i10, C1916t tVar, Object obj, int i11) {
        int i12 = i11 * 5;
        if (i12 > 30) {
            e()[i11].o(tVar.p(), tVar.p().length, 0);
            while (!C6496s.c(e()[i11].a(), obj)) {
                e()[i11].k();
            }
            j(i11);
            return;
        }
        int f10 = 1 << C1920x.f(i10, i12);
        if (tVar.q(f10)) {
            e()[i11].o(tVar.p(), tVar.m() * 2, tVar.n(f10));
            j(i11);
            return;
        }
        int O10 = tVar.O(f10);
        C1916t N10 = tVar.N(O10);
        e()[i11].o(tVar.p(), tVar.m() * 2, O10);
        n(i10, N10, obj, i11 + 1);
    }

    public Object next() {
        k();
        this.f19415e = b();
        this.f19416f = true;
        return super.next();
    }

    public final void o(Object obj, Object obj2) {
        int i10;
        if (this.f19414d.containsKey(obj)) {
            if (hasNext()) {
                Object b10 = b();
                this.f19414d.put(obj, obj2);
                if (b10 != null) {
                    i10 = b10.hashCode();
                } else {
                    i10 = 0;
                }
                n(i10, this.f19414d.k(), b10, 0);
            } else {
                this.f19414d.put(obj, obj2);
            }
            this.f19417g = this.f19414d.j();
        }
    }

    public void remove() {
        int i10;
        l();
        if (hasNext()) {
            Object b10 = b();
            V.d(this.f19414d).remove(this.f19415e);
            if (b10 != null) {
                i10 = b10.hashCode();
            } else {
                i10 = 0;
            }
            n(i10, this.f19414d.k(), b10, 0);
        } else {
            V.d(this.f19414d).remove(this.f19415e);
        }
        this.f19415e = null;
        this.f19416f = false;
        this.f19417g = this.f19414d.j();
    }
}
