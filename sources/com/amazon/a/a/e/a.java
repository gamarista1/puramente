package com.amazon.a.a.e;

import com.amazon.a.a.e.a;
import com.amazon.a.a.k.d;
import com.amazon.a.a.n.b;
import com.amazon.a.a.o.c;
import java.util.Date;
import java.util.List;
import java.util.Vector;
import java.util.concurrent.atomic.AtomicBoolean;

public abstract class a<T extends a<T>> implements d {

    /* renamed from: b  reason: collision with root package name */
    private static final c f37159b = new c("Expirable");
    @com.amazon.a.a.k.a

    /* renamed from: a  reason: collision with root package name */
    protected b f37160a;

    /* renamed from: c  reason: collision with root package name */
    private AtomicBoolean f37161c = new AtomicBoolean(false);

    /* renamed from: d  reason: collision with root package name */
    private final List<b<T>> f37162d = new Vector();

    private void h() {
        this.f37160a.a(com.amazon.a.a.n.b.d.BACKGROUND, (com.amazon.a.a.n.a) new com.amazon.a.a.n.a() {
            public void a() {
                a.this.c();
            }

            public String toString() {
                return "Expire: " + a.this.toString();
            }
        }, a());
    }

    private void i() {
        for (b<T> a10 : this.f37162d) {
            a10.a(this);
        }
    }

    /* access modifiers changed from: protected */
    public abstract Date a();

    public final void a(b<T> bVar) {
        this.f37162d.add(bVar);
    }

    /* access modifiers changed from: protected */
    public void b() {
    }

    public void c() {
        if (this.f37161c.compareAndSet(false, true)) {
            if (c.f37534a) {
                c cVar = f37159b;
                cVar.a("Expiring: " + this);
            }
            d();
            if (c.f37534a) {
                c cVar2 = f37159b;
                cVar2.a("Notifying Observers of expiration: " + this);
            }
            i();
        }
    }

    /* access modifiers changed from: protected */
    public abstract void d();

    public final void e() {
        h();
        b();
    }

    public final void f() {
        if (this.f37161c.compareAndSet(false, true)) {
            i();
        }
    }

    /* access modifiers changed from: protected */
    public boolean g() {
        return this.f37161c.get();
    }
}
