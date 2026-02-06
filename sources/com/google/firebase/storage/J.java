package com.google.firebase.storage;

import Kc.g;
import android.app.Activity;
import com.google.android.gms.common.internal.C4536s;
import com.google.firebase.storage.D;
import java.util.HashMap;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;

class J {

    /* renamed from: a  reason: collision with root package name */
    private final Queue f58006a = new ConcurrentLinkedQueue();

    /* renamed from: b  reason: collision with root package name */
    private final HashMap f58007b = new HashMap();

    /* renamed from: c  reason: collision with root package name */
    private D f58008c;

    /* renamed from: d  reason: collision with root package name */
    private int f58009d;

    /* renamed from: e  reason: collision with root package name */
    private a f58010e;

    interface a {
        void a(Object obj, Object obj2);
    }

    public J(D d10, int i10, a aVar) {
        this.f58008c = d10;
        this.f58009d = i10;
        this.f58010e = aVar;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void f(Object obj, D.a aVar) {
        this.f58010e.a(obj, aVar);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void g(Object obj, D.a aVar) {
        this.f58010e.a(obj, aVar);
    }

    public void d(Activity activity, Executor executor, Object obj) {
        boolean z10;
        g gVar;
        C4536s.l(obj);
        synchronized (this.f58008c.J()) {
            try {
                z10 = false;
                if ((this.f58008c.B() & this.f58009d) != 0) {
                    z10 = true;
                }
                this.f58006a.add(obj);
                gVar = new g(executor);
                this.f58007b.put(obj, gVar);
                if (activity != null) {
                    C4536s.b(!activity.isDestroyed(), "Activity is already destroyed!");
                    Kc.a.a().c(activity, obj, new H(this, obj));
                }
            } catch (Throwable th2) {
                while (true) {
                    throw th2;
                }
            }
        }
        if (z10) {
            gVar.a(new I(this, obj, this.f58008c.g0()));
        }
    }

    public void h() {
        if ((this.f58008c.B() & this.f58009d) != 0) {
            D.a g02 = this.f58008c.g0();
            for (Object next : this.f58006a) {
                g gVar = (g) this.f58007b.get(next);
                if (gVar != null) {
                    gVar.a(new G(this, next, g02));
                }
            }
        }
    }

    /* renamed from: i */
    public void e(Object obj) {
        C4536s.l(obj);
        synchronized (this.f58008c.J()) {
            this.f58007b.remove(obj);
            this.f58006a.remove(obj);
            Kc.a.a().b(obj);
        }
    }
}
