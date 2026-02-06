package androidx.work;

import Ug.C5600w0;
import androidx.work.impl.utils.futures.c;
import com.google.common.util.concurrent.g;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.C6498u;
import lf.C6514M;
import yf.C6798l;

public final class o implements g {

    /* renamed from: a  reason: collision with root package name */
    private final C5600w0 f19020a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final c f19021b;

    static final class a extends C6498u implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ o f19022a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(o oVar) {
            super(1);
            this.f19022a = oVar;
        }

        public final void a(Throwable th2) {
            if (th2 == null) {
                if (!this.f19022a.f19021b.isDone()) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
            } else if (th2 instanceof CancellationException) {
                this.f19022a.f19021b.cancel(true);
            } else {
                c a10 = this.f19022a.f19021b;
                Throwable cause = th2.getCause();
                if (cause != null) {
                    th2 = cause;
                }
                a10.q(th2);
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((Throwable) obj);
            return C6514M.f71813a;
        }
    }

    public o(C5600w0 w0Var, c cVar) {
        C6496s.h(w0Var, "job");
        C6496s.h(cVar, "underlying");
        this.f19020a = w0Var;
        this.f19021b = cVar;
        w0Var.P0(new a(this));
    }

    public final void b(Object obj) {
        this.f19021b.p(obj);
    }

    public boolean cancel(boolean z10) {
        return this.f19021b.cancel(z10);
    }

    public void e(Runnable runnable, Executor executor) {
        this.f19021b.e(runnable, executor);
    }

    public Object get() {
        return this.f19021b.get();
    }

    public boolean isCancelled() {
        return this.f19021b.isCancelled();
    }

    public boolean isDone() {
        return this.f19021b.isDone();
    }

    public Object get(long j10, TimeUnit timeUnit) {
        return this.f19021b.get(j10, timeUnit);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ o(Ug.C5600w0 r1, androidx.work.impl.utils.futures.c r2, int r3, kotlin.jvm.internal.DefaultConstructorMarker r4) {
        /*
            r0 = this;
            r3 = r3 & 2
            if (r3 == 0) goto L_0x000d
            androidx.work.impl.utils.futures.c r2 = androidx.work.impl.utils.futures.c.t()
            java.lang.String r3 = "create()"
            kotlin.jvm.internal.C6496s.g(r2, r3)
        L_0x000d:
            r0.<init>(r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.work.o.<init>(Ug.w0, androidx.work.impl.utils.futures.c, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
