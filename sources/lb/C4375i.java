package Lb;

import Gb.b;
import Ob.l;
import Qb.c;
import Qb.d;
import Qb.e;
import Qb.i;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: Lb.i  reason: case insensitive filesystem */
public abstract class C4375i {

    /* renamed from: a  reason: collision with root package name */
    private AtomicBoolean f51754a = new AtomicBoolean(false);

    /* renamed from: b  reason: collision with root package name */
    private j f51755b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f51756c = false;

    public abstract C4375i a(i iVar);

    public abstract d b(c cVar, i iVar);

    public abstract void c(b bVar);

    public abstract void d(d dVar);

    public abstract i e();

    public abstract boolean f(C4375i iVar);

    public boolean g() {
        return this.f51756c;
    }

    public boolean h() {
        return this.f51754a.get();
    }

    public abstract boolean i(e.a aVar);

    public void j(boolean z10) {
        this.f51756c = z10;
    }

    public void k(j jVar) {
        boolean z10 = true;
        l.f(!h());
        if (this.f51755b != null) {
            z10 = false;
        }
        l.f(z10);
        this.f51755b = jVar;
    }

    public void l() {
        j jVar;
        if (this.f51754a.compareAndSet(false, true) && (jVar = this.f51755b) != null) {
            jVar.a(this);
            this.f51755b = null;
        }
    }
}
