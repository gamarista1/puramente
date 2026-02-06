package com.amazon.a.a.n.c;

import com.amazon.a.a.k.d;
import com.amazon.a.a.n.a;
import com.amazon.a.a.o.c;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

public abstract class b extends a implements d {

    /* renamed from: b  reason: collision with root package name */
    private static final c f37425b = new c("TaskWorkflow");

    /* renamed from: a  reason: collision with root package name */
    protected final List<a> f37426a = new ArrayList();
    @com.amazon.a.a.k.a

    /* renamed from: c  reason: collision with root package name */
    private com.amazon.a.a.k.b f37427c;

    /* renamed from: d  reason: collision with root package name */
    private AtomicBoolean f37428d = new AtomicBoolean(false);

    private void f() {
        if (c.f37534a) {
            c cVar = f37425b;
            cVar.a("Exiting task workflow: " + this);
        }
        for (a next : this.f37426a) {
            if (!this.f37428d.get()) {
                next.a();
            } else if (c.f37534a) {
                f37425b.a("Finished set, exiting task workflow early");
                return;
            } else {
                return;
            }
        }
    }

    public final void a() {
        try {
            c();
            f();
        } finally {
            b();
        }
    }

    /* access modifiers changed from: protected */
    public void b() {
    }

    /* access modifiers changed from: protected */
    public abstract String b_();

    /* access modifiers changed from: protected */
    public void c() {
    }

    public final void d() {
        this.f37428d.set(true);
    }

    public final void e() {
        for (a b10 : this.f37426a) {
            this.f37427c.b(b10);
        }
    }

    public final String toString() {
        return b_();
    }

    /* access modifiers changed from: protected */
    public final void a(a aVar) {
        com.amazon.a.a.o.a.a.a((Object) aVar, "task");
        this.f37426a.add(aVar);
        if (aVar instanceof c) {
            ((c) aVar).a(this);
        }
    }
}
