package d0;

import java.util.Iterator;
import java.util.NoSuchElementException;
import zf.C6828a;

/* renamed from: d0.e  reason: case insensitive filesystem */
public abstract class C1901e implements Iterator, C6828a {

    /* renamed from: a  reason: collision with root package name */
    private final C1917u[] f19405a;

    /* renamed from: b  reason: collision with root package name */
    private int f19406b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f19407c = true;

    public C1901e(C1916t tVar, C1917u[] uVarArr) {
        this.f19405a = uVarArr;
        uVarArr[0].n(tVar.p(), tVar.m() * 2);
        this.f19406b = 0;
        c();
    }

    private final void a() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
    }

    private final void c() {
        if (!this.f19405a[this.f19406b].g()) {
            for (int i10 = this.f19406b; -1 < i10; i10--) {
                int g10 = g(i10);
                if (g10 == -1 && this.f19405a[i10].j()) {
                    this.f19405a[i10].l();
                    g10 = g(i10);
                }
                if (g10 != -1) {
                    this.f19406b = g10;
                    return;
                }
                if (i10 > 0) {
                    this.f19405a[i10 - 1].l();
                }
                this.f19405a[i10].n(C1916t.f19425e.a().p(), 0);
            }
            this.f19407c = false;
        }
    }

    private final int g(int i10) {
        if (this.f19405a[i10].g()) {
            return i10;
        }
        if (!this.f19405a[i10].j()) {
            return -1;
        }
        C1916t b10 = this.f19405a[i10].b();
        if (i10 == 6) {
            this.f19405a[i10 + 1].n(b10.p(), b10.p().length);
        } else {
            this.f19405a[i10 + 1].n(b10.p(), b10.m() * 2);
        }
        return g(i10 + 1);
    }

    /* access modifiers changed from: protected */
    public final Object b() {
        a();
        return this.f19405a[this.f19406b].a();
    }

    /* access modifiers changed from: protected */
    public final C1917u[] e() {
        return this.f19405a;
    }

    public boolean hasNext() {
        return this.f19407c;
    }

    /* access modifiers changed from: protected */
    public final void j(int i10) {
        this.f19406b = i10;
    }

    public Object next() {
        a();
        Object next = this.f19405a[this.f19406b].next();
        c();
        return next;
    }

    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
