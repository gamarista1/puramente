package com.google.common.util.concurrent;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import nb.C5114i;
import nb.o;
import qb.C5148a;
import qb.C5149b;

public abstract class d extends e {

    private static final class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final Future f56832a;

        /* renamed from: b  reason: collision with root package name */
        final c f56833b;

        a(Future future, c cVar) {
            this.f56832a = future;
            this.f56833b = cVar;
        }

        public void run() {
            Throwable a10;
            Future future = this.f56832a;
            if (!(future instanceof C5148a) || (a10 = C5149b.a((C5148a) future)) == null) {
                try {
                    this.f56833b.onSuccess(d.b(this.f56832a));
                } catch (ExecutionException e10) {
                    this.f56833b.a(e10.getCause());
                } catch (Throwable th2) {
                    this.f56833b.a(th2);
                }
            } else {
                this.f56833b.a(a10);
            }
        }

        public String toString() {
            return C5114i.b(this).c(this.f56833b).toString();
        }
    }

    public static void a(g gVar, c cVar, Executor executor) {
        o.j(cVar);
        gVar.e(new a(gVar, cVar), executor);
    }

    public static Object b(Future future) {
        o.q(future.isDone(), "Future was expected to be done: %s", future);
        return l.a(future);
    }
}
