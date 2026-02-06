package We;

import We.h1;
import af.C5728a;
import bf.C5731a;
import bf.C5732b;
import ff.C5856j;
import ff.C5868v;
import java.io.Closeable;
import java.lang.Thread;
import java.util.concurrent.atomic.AtomicReference;
import p003if.d;
import p003if.e;
import p003if.h;

public final class i1 implements J, Thread.UncaughtExceptionHandler, Closeable {

    /* renamed from: a  reason: collision with root package name */
    private Thread.UncaughtExceptionHandler f65896a;

    /* renamed from: b  reason: collision with root package name */
    private C5658w f65897b;

    /* renamed from: c  reason: collision with root package name */
    private M0 f65898c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f65899d;

    /* renamed from: e  reason: collision with root package name */
    private final h1 f65900e;

    public static class a extends C5731a {

        /* renamed from: d  reason: collision with root package name */
        private final AtomicReference f65901d = new AtomicReference();

        public a(long j10, C5654u uVar) {
            super(j10, uVar);
        }

        public void b(C5868v vVar) {
            this.f65901d.set(vVar);
        }
    }

    public i1() {
        this(h1.a.c());
    }

    static Throwable a(Thread thread, Throwable th2) {
        C5856j jVar = new C5856j();
        jVar.a(Boolean.FALSE);
        jVar.b("UncaughtExceptionHandler");
        return new C5728a(jVar, th2, thread);
    }

    public final void b(C5658w wVar, M0 m02) {
        if (this.f65899d) {
            m02.s().b(E0.ERROR, "Attempt to register a UncaughtExceptionHandlerIntegration twice.", new Object[0]);
            return;
        }
        this.f65899d = true;
        this.f65897b = (C5658w) h.c(wVar, "Scopes are required");
        M0 m03 = (M0) h.c(m02, "SentryOptions is required");
        this.f65898c = m03;
        C5654u s10 = m03.s();
        E0 e02 = E0.DEBUG;
        s10.b(e02, "UncaughtExceptionHandlerIntegration enabled: %s", Boolean.valueOf(this.f65898c.B()));
        if (this.f65898c.B()) {
            Thread.UncaughtExceptionHandler b10 = this.f65900e.b();
            if (b10 != null) {
                C5654u s11 = this.f65898c.s();
                s11.b(e02, "default UncaughtExceptionHandler class='" + b10.getClass().getName() + "'", new Object[0]);
                if (b10 instanceof i1) {
                    this.f65896a = ((i1) b10).f65896a;
                } else {
                    this.f65896a = b10;
                }
            }
            this.f65900e.a(this);
            this.f65898c.s().b(e02, "UncaughtExceptionHandlerIntegration installed.", new Object[0]);
            e.a("UncaughtExceptionHandler");
        }
    }

    public void close() {
        if (this == this.f65900e.b()) {
            this.f65900e.a(this.f65896a);
            M0 m02 = this.f65898c;
            if (m02 != null) {
                m02.s().b(E0.DEBUG, "UncaughtExceptionHandlerIntegration removed.", new Object[0]);
            }
        }
    }

    public void uncaughtException(Thread thread, Throwable th2) {
        M0 m02 = this.f65898c;
        if (m02 != null && this.f65897b != null) {
            m02.s().b(E0.INFO, "Uncaught exception received.", new Object[0]);
            try {
                a aVar = new a(this.f65898c.q(), this.f65898c.s());
                C5663y0 y0Var = new C5663y0(a(thread, th2));
                y0Var.h(E0.FATAL);
                this.f65897b.a();
                if (y0Var.b() != null) {
                    aVar.b(y0Var.b());
                }
                C5643o a10 = d.a(aVar);
                boolean equals = this.f65897b.c(y0Var, a10).equals(C5868v.f67577b);
                C5732b b10 = d.b(a10);
                if ((!equals || C5732b.MULTITHREADED_DEDUPLICATION.equals(b10)) && !aVar.a()) {
                    this.f65898c.s().b(E0.WARNING, "Timed out waiting to flush event to disk before crashing. Event: %s", y0Var.b());
                }
            } catch (Throwable th3) {
                this.f65898c.s().a(E0.ERROR, "Error sending uncaught exception to Sentry.", th3);
            }
            if (this.f65896a != null) {
                this.f65898c.s().b(E0.INFO, "Invoking inner uncaught exception handler.", new Object[0]);
                this.f65896a.uncaughtException(thread, th2);
            } else if (this.f65898c.C()) {
                th2.printStackTrace();
            }
        }
    }

    i1(h1 h1Var) {
        this.f65899d = false;
        this.f65900e = (h1) h.c(h1Var, "threadAdapter is required.");
    }
}
