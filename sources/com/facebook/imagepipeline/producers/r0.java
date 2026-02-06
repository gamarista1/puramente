package com.facebook.imagepipeline.producers;

import T5.k;
import android.util.Pair;
import java.util.Map;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;

public class r0 implements d0 {

    /* renamed from: a  reason: collision with root package name */
    private final d0 f40059a;

    /* renamed from: b  reason: collision with root package name */
    private final int f40060b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public int f40061c = 0;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public final ConcurrentLinkedQueue f40062d = new ConcurrentLinkedQueue();
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public final Executor f40063e;

    private class a extends C3313t {

        /* renamed from: com.facebook.imagepipeline.producers.r0$a$a  reason: collision with other inner class name */
        class C0633a implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ Pair f40065a;

            C0633a(Pair pair) {
                this.f40065a = pair;
            }

            public void run() {
                r0 r0Var = r0.this;
                Pair pair = this.f40065a;
                r0Var.g((C3308n) pair.first, (e0) pair.second);
            }
        }

        private void q() {
            Pair pair;
            synchronized (r0.this) {
                try {
                    pair = (Pair) r0.this.f40062d.poll();
                    if (pair == null) {
                        r0 r0Var = r0.this;
                        r0Var.f40061c = r0Var.f40061c - 1;
                    }
                } catch (Throwable th2) {
                    while (true) {
                        throw th2;
                    }
                }
            }
            if (pair != null) {
                r0.this.f40063e.execute(new C0633a(pair));
            }
        }

        /* access modifiers changed from: protected */
        public void g() {
            p().b();
            q();
        }

        /* access modifiers changed from: protected */
        public void h(Throwable th2) {
            p().a(th2);
            q();
        }

        /* access modifiers changed from: protected */
        public void i(Object obj, int i10) {
            p().c(obj, i10);
            if (C3297c.e(i10)) {
                q();
            }
        }

        private a(C3308n nVar) {
            super(nVar);
        }
    }

    public r0(int i10, Executor executor, d0 d0Var) {
        this.f40060b = i10;
        this.f40063e = (Executor) k.g(executor);
        this.f40059a = (d0) k.g(d0Var);
    }

    public void b(C3308n nVar, e0 e0Var) {
        boolean z10;
        e0Var.y().d(e0Var, "ThrottlingProducer");
        synchronized (this) {
            try {
                int i10 = this.f40061c;
                z10 = true;
                if (i10 >= this.f40060b) {
                    this.f40062d.add(Pair.create(nVar, e0Var));
                } else {
                    this.f40061c = i10 + 1;
                    z10 = false;
                }
            } catch (Throwable th2) {
                while (true) {
                    throw th2;
                }
            }
        }
        if (!z10) {
            g(nVar, e0Var);
        }
    }

    /* access modifiers changed from: package-private */
    public void g(C3308n nVar, e0 e0Var) {
        e0Var.y().j(e0Var, "ThrottlingProducer", (Map) null);
        this.f40059a.b(new a(nVar), e0Var);
    }
}
