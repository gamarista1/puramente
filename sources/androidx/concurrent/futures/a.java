package androidx.concurrent.futures;

import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import java.util.Locale;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;

public abstract class a implements com.google.common.util.concurrent.g {

    /* renamed from: d  reason: collision with root package name */
    static final boolean f14341d = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", com.amazon.a.a.o.b.f37476ag));

    /* renamed from: e  reason: collision with root package name */
    private static final Logger f14342e;

    /* renamed from: f  reason: collision with root package name */
    static final b f14343f;

    /* renamed from: g  reason: collision with root package name */
    private static final Object f14344g = new Object();

    /* renamed from: a  reason: collision with root package name */
    volatile Object f14345a;

    /* renamed from: b  reason: collision with root package name */
    volatile e f14346b;

    /* renamed from: c  reason: collision with root package name */
    volatile h f14347c;

    private static abstract class b {
        private b() {
        }

        /* access modifiers changed from: package-private */
        public abstract boolean a(a aVar, e eVar, e eVar2);

        /* access modifiers changed from: package-private */
        public abstract boolean b(a aVar, Object obj, Object obj2);

        /* access modifiers changed from: package-private */
        public abstract boolean c(a aVar, h hVar, h hVar2);

        /* access modifiers changed from: package-private */
        public abstract void d(h hVar, h hVar2);

        /* access modifiers changed from: package-private */
        public abstract void e(h hVar, Thread thread);
    }

    private static final class c {

        /* renamed from: c  reason: collision with root package name */
        static final c f14348c;

        /* renamed from: d  reason: collision with root package name */
        static final c f14349d;

        /* renamed from: a  reason: collision with root package name */
        final boolean f14350a;

        /* renamed from: b  reason: collision with root package name */
        final Throwable f14351b;

        static {
            if (a.f14341d) {
                f14349d = null;
                f14348c = null;
                return;
            }
            f14349d = new c(false, (Throwable) null);
            f14348c = new c(true, (Throwable) null);
        }

        c(boolean z10, Throwable th2) {
            this.f14350a = z10;
            this.f14351b = th2;
        }
    }

    private static final class d {

        /* renamed from: b  reason: collision with root package name */
        static final d f14352b = new d(new C0274a("Failure occurred while trying to finish a future."));

        /* renamed from: a  reason: collision with root package name */
        final Throwable f14353a;

        /* renamed from: androidx.concurrent.futures.a$d$a  reason: collision with other inner class name */
        class C0274a extends Throwable {
            C0274a(String str) {
                super(str);
            }

            public synchronized Throwable fillInStackTrace() {
                return this;
            }
        }

        d(Throwable th2) {
            this.f14353a = (Throwable) a.f(th2);
        }
    }

    private static final class e {

        /* renamed from: d  reason: collision with root package name */
        static final e f14354d = new e((Runnable) null, (Executor) null);

        /* renamed from: a  reason: collision with root package name */
        final Runnable f14355a;

        /* renamed from: b  reason: collision with root package name */
        final Executor f14356b;

        /* renamed from: c  reason: collision with root package name */
        e f14357c;

        e(Runnable runnable, Executor executor) {
            this.f14355a = runnable;
            this.f14356b = executor;
        }
    }

    private static final class f extends b {

        /* renamed from: a  reason: collision with root package name */
        final AtomicReferenceFieldUpdater f14358a;

        /* renamed from: b  reason: collision with root package name */
        final AtomicReferenceFieldUpdater f14359b;

        /* renamed from: c  reason: collision with root package name */
        final AtomicReferenceFieldUpdater f14360c;

        /* renamed from: d  reason: collision with root package name */
        final AtomicReferenceFieldUpdater f14361d;

        /* renamed from: e  reason: collision with root package name */
        final AtomicReferenceFieldUpdater f14362e;

        f(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
            super();
            this.f14358a = atomicReferenceFieldUpdater;
            this.f14359b = atomicReferenceFieldUpdater2;
            this.f14360c = atomicReferenceFieldUpdater3;
            this.f14361d = atomicReferenceFieldUpdater4;
            this.f14362e = atomicReferenceFieldUpdater5;
        }

        /* access modifiers changed from: package-private */
        public boolean a(a aVar, e eVar, e eVar2) {
            return b.a(this.f14361d, aVar, eVar, eVar2);
        }

        /* access modifiers changed from: package-private */
        public boolean b(a aVar, Object obj, Object obj2) {
            return b.a(this.f14362e, aVar, obj, obj2);
        }

        /* access modifiers changed from: package-private */
        public boolean c(a aVar, h hVar, h hVar2) {
            return b.a(this.f14360c, aVar, hVar, hVar2);
        }

        /* access modifiers changed from: package-private */
        public void d(h hVar, h hVar2) {
            this.f14359b.lazySet(hVar, hVar2);
        }

        /* access modifiers changed from: package-private */
        public void e(h hVar, Thread thread) {
            this.f14358a.lazySet(hVar, thread);
        }
    }

    private static final class g extends b {
        g() {
            super();
        }

        /* access modifiers changed from: package-private */
        public boolean a(a aVar, e eVar, e eVar2) {
            synchronized (aVar) {
                try {
                    if (aVar.f14346b != eVar) {
                        return false;
                    }
                    aVar.f14346b = eVar2;
                    return true;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        /* access modifiers changed from: package-private */
        public boolean b(a aVar, Object obj, Object obj2) {
            synchronized (aVar) {
                try {
                    if (aVar.f14345a != obj) {
                        return false;
                    }
                    aVar.f14345a = obj2;
                    return true;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        /* access modifiers changed from: package-private */
        public boolean c(a aVar, h hVar, h hVar2) {
            synchronized (aVar) {
                try {
                    if (aVar.f14347c != hVar) {
                        return false;
                    }
                    aVar.f14347c = hVar2;
                    return true;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        /* access modifiers changed from: package-private */
        public void d(h hVar, h hVar2) {
            hVar.f14365b = hVar2;
        }

        /* access modifiers changed from: package-private */
        public void e(h hVar, Thread thread) {
            hVar.f14364a = thread;
        }
    }

    private static final class h {

        /* renamed from: c  reason: collision with root package name */
        static final h f14363c = new h(false);

        /* renamed from: a  reason: collision with root package name */
        volatile Thread f14364a;

        /* renamed from: b  reason: collision with root package name */
        volatile h f14365b;

        h(boolean z10) {
        }

        /* access modifiers changed from: package-private */
        public void a(h hVar) {
            a.f14343f.d(this, hVar);
        }

        /* access modifiers changed from: package-private */
        public void b() {
            Thread thread = this.f14364a;
            if (thread != null) {
                this.f14364a = null;
                LockSupport.unpark(thread);
            }
        }

        h() {
            a.f14343f.e(this, Thread.currentThread());
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v3, resolved type: androidx.concurrent.futures.a$f} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v4, resolved type: androidx.concurrent.futures.a$g} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v5, resolved type: androidx.concurrent.futures.a$f} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v3, resolved type: androidx.concurrent.futures.a$f} */
    /* JADX WARNING: Multi-variable type inference failed */
    static {
        /*
            java.lang.String r0 = "b"
            java.lang.String r1 = "a"
            java.lang.Class<androidx.concurrent.futures.a$h> r2 = androidx.concurrent.futures.a.h.class
            java.lang.String r3 = "guava.concurrent.generate_cancellation_cause"
            java.lang.String r4 = "false"
            java.lang.String r3 = java.lang.System.getProperty(r3, r4)
            boolean r3 = java.lang.Boolean.parseBoolean(r3)
            f14341d = r3
            java.lang.Class<androidx.concurrent.futures.a> r3 = androidx.concurrent.futures.a.class
            java.lang.String r4 = r3.getName()
            java.util.logging.Logger r4 = java.util.logging.Logger.getLogger(r4)
            f14342e = r4
            androidx.concurrent.futures.a$f r4 = new androidx.concurrent.futures.a$f     // Catch:{ all -> 0x0044 }
            java.lang.Class<java.lang.Thread> r5 = java.lang.Thread.class
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r6 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r2, r5, r1)     // Catch:{ all -> 0x0044 }
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r7 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r2, r2, r0)     // Catch:{ all -> 0x0044 }
            java.lang.String r5 = "c"
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r8 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r3, r2, r5)     // Catch:{ all -> 0x0044 }
            java.lang.Class<androidx.concurrent.futures.a$e> r2 = androidx.concurrent.futures.a.e.class
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r9 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r3, r2, r0)     // Catch:{ all -> 0x0044 }
            java.lang.Class<java.lang.Object> r0 = java.lang.Object.class
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r10 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r3, r0, r1)     // Catch:{ all -> 0x0044 }
            r5 = r4
            r5.<init>(r6, r7, r8, r9, r10)     // Catch:{ all -> 0x0044 }
            r0 = 0
            goto L_0x004a
        L_0x0044:
            r0 = move-exception
            androidx.concurrent.futures.a$g r4 = new androidx.concurrent.futures.a$g
            r4.<init>()
        L_0x004a:
            f14343f = r4
            if (r0 == 0) goto L_0x0057
            java.util.logging.Logger r1 = f14342e
            java.util.logging.Level r2 = java.util.logging.Level.SEVERE
            java.lang.String r3 = "SafeAtomicHelper is broken!"
            r1.log(r2, r3, r0)
        L_0x0057:
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            f14344g = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.concurrent.futures.a.<clinit>():void");
    }

    protected a() {
    }

    private void a(StringBuilder sb2) {
        try {
            Object o10 = o(this);
            sb2.append("SUCCESS, result=[");
            sb2.append(y(o10));
            sb2.append("]");
        } catch (ExecutionException e10) {
            sb2.append("FAILURE, cause=[");
            sb2.append(e10.getCause());
            sb2.append("]");
        } catch (CancellationException unused) {
            sb2.append("CANCELLED");
        } catch (RuntimeException e11) {
            sb2.append("UNKNOWN, cause=[");
            sb2.append(e11.getClass());
            sb2.append(" thrown from get()]");
        }
    }

    private static CancellationException c(String str, Throwable th2) {
        CancellationException cancellationException = new CancellationException(str);
        cancellationException.initCause(th2);
        return cancellationException;
    }

    static Object f(Object obj) {
        obj.getClass();
        return obj;
    }

    private e i(e eVar) {
        e eVar2;
        do {
            eVar2 = this.f14346b;
        } while (!f14343f.a(this, eVar2, e.f14354d));
        e eVar3 = eVar2;
        e eVar4 = eVar;
        e eVar5 = eVar3;
        while (eVar5 != null) {
            e eVar6 = eVar5.f14357c;
            eVar5.f14357c = eVar4;
            eVar4 = eVar5;
            eVar5 = eVar6;
        }
        return eVar4;
    }

    static void j(a aVar) {
        aVar.s();
        aVar.b();
        e i10 = aVar.i((e) null);
        while (i10 != null) {
            e eVar = i10.f14357c;
            l(i10.f14355a, i10.f14356b);
            i10 = eVar;
        }
    }

    private static void l(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e10) {
            Logger logger = f14342e;
            Level level = Level.SEVERE;
            logger.log(level, "RuntimeException while executing runnable " + runnable + " with executor " + executor, e10);
        }
    }

    private Object m(Object obj) {
        if (obj instanceof c) {
            throw c("Task was cancelled.", ((c) obj).f14351b);
        } else if (obj instanceof d) {
            throw new ExecutionException(((d) obj).f14353a);
        } else if (obj == f14344g) {
            return null;
        } else {
            return obj;
        }
    }

    static Object o(Future future) {
        Object obj;
        boolean z10 = false;
        while (true) {
            try {
                obj = future.get();
                break;
            } catch (InterruptedException unused) {
                z10 = true;
            } catch (Throwable th2) {
                if (z10) {
                    Thread.currentThread().interrupt();
                }
                throw th2;
            }
        }
        if (z10) {
            Thread.currentThread().interrupt();
        }
        return obj;
    }

    private void s() {
        h hVar;
        do {
            hVar = this.f14347c;
        } while (!f14343f.c(this, hVar, h.f14363c));
        while (hVar != null) {
            hVar.b();
            hVar = hVar.f14365b;
        }
    }

    private void t(h hVar) {
        hVar.f14364a = null;
        while (true) {
            h hVar2 = this.f14347c;
            if (hVar2 != h.f14363c) {
                h hVar3 = null;
                while (hVar2 != null) {
                    h hVar4 = hVar2.f14365b;
                    if (hVar2.f14364a != null) {
                        hVar3 = hVar2;
                    } else if (hVar3 != null) {
                        hVar3.f14365b = hVar4;
                        if (hVar3.f14364a == null) {
                        }
                    } else if (!f14343f.c(this, hVar2, hVar4)) {
                    }
                    hVar2 = hVar4;
                }
                return;
            }
            return;
        }
    }

    private String y(Object obj) {
        if (obj == this) {
            return "this future";
        }
        return String.valueOf(obj);
    }

    /* access modifiers changed from: protected */
    public void b() {
    }

    public final boolean cancel(boolean z10) {
        boolean z11;
        c cVar;
        Object obj = this.f14345a;
        if (obj == null) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11) {
            if (f14341d) {
                cVar = new c(z10, new CancellationException("Future.cancel() was called."));
            } else if (z10) {
                cVar = c.f14348c;
            } else {
                cVar = c.f14349d;
            }
            if (f14343f.b(this, obj, cVar)) {
                if (z10) {
                    p();
                }
                j(this);
                return true;
            }
        }
        return false;
    }

    public final void e(Runnable runnable, Executor executor) {
        f(runnable);
        f(executor);
        e eVar = this.f14346b;
        if (eVar != e.f14354d) {
            e eVar2 = new e(runnable, executor);
            do {
                eVar2.f14357c = eVar;
                if (!f14343f.a(this, eVar, eVar2)) {
                    eVar = this.f14346b;
                } else {
                    return;
                }
            } while (eVar != e.f14354d);
        }
        l(runnable, executor);
    }

    public final Object get(long j10, TimeUnit timeUnit) {
        long j11 = j10;
        TimeUnit timeUnit2 = timeUnit;
        long nanos = timeUnit2.toNanos(j11);
        if (!Thread.interrupted()) {
            Object obj = this.f14345a;
            if (obj != null) {
                return m(obj);
            }
            long nanoTime = nanos > 0 ? System.nanoTime() + nanos : 0;
            if (nanos >= 1000) {
                h hVar = this.f14347c;
                if (hVar != h.f14363c) {
                    h hVar2 = new h();
                    do {
                        hVar2.a(hVar);
                        if (f14343f.c(this, hVar, hVar2)) {
                            do {
                                LockSupport.parkNanos(this, nanos);
                                if (!Thread.interrupted()) {
                                    Object obj2 = this.f14345a;
                                    if (obj2 != null) {
                                        return m(obj2);
                                    }
                                    nanos = nanoTime - System.nanoTime();
                                } else {
                                    t(hVar2);
                                    throw new InterruptedException();
                                }
                            } while (nanos >= 1000);
                            t(hVar2);
                        } else {
                            hVar = this.f14347c;
                        }
                    } while (hVar != h.f14363c);
                }
                return m(this.f14345a);
            }
            while (nanos > 0) {
                Object obj3 = this.f14345a;
                if (obj3 != null) {
                    return m(obj3);
                }
                if (!Thread.interrupted()) {
                    nanos = nanoTime - System.nanoTime();
                } else {
                    throw new InterruptedException();
                }
            }
            String aVar = toString();
            String obj4 = timeUnit.toString();
            Locale locale = Locale.ROOT;
            String lowerCase = obj4.toLowerCase(locale);
            String str = "Waited " + j11 + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + timeUnit.toString().toLowerCase(locale);
            if (nanos + 1000 < 0) {
                String str2 = str + " (plus ";
                long j12 = -nanos;
                long convert = timeUnit2.convert(j12, TimeUnit.NANOSECONDS);
                long nanos2 = j12 - timeUnit2.toNanos(convert);
                int i10 = (convert > 0 ? 1 : (convert == 0 ? 0 : -1));
                boolean z10 = i10 == 0 || nanos2 > 1000;
                if (i10 > 0) {
                    String str3 = str2 + convert + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + lowerCase;
                    if (z10) {
                        str3 = str3 + com.amazon.a.a.o.b.f.f37529a;
                    }
                    str2 = str3 + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR;
                }
                if (z10) {
                    str2 = str2 + nanos2 + " nanoseconds ";
                }
                str = str2 + "delay)";
            }
            if (isDone()) {
                throw new TimeoutException(str + " but future completed as timeout expired");
            }
            throw new TimeoutException(str + " for " + aVar);
        }
        throw new InterruptedException();
    }

    public final boolean isCancelled() {
        return this.f14345a instanceof c;
    }

    public final boolean isDone() {
        if (this.f14345a != null) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public void p() {
    }

    /* access modifiers changed from: protected */
    public String r() {
        if (!(this instanceof ScheduledFuture)) {
            return null;
        }
        return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
    }

    public String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(super.toString());
        sb2.append("[status=");
        if (isCancelled()) {
            sb2.append("CANCELLED");
        } else if (isDone()) {
            a(sb2);
        } else {
            try {
                str = r();
            } catch (RuntimeException e10) {
                str = "Exception thrown from implementation: " + e10.getClass();
            }
            if (str != null && !str.isEmpty()) {
                sb2.append("PENDING, info=[");
                sb2.append(str);
                sb2.append("]");
            } else if (isDone()) {
                a(sb2);
            } else {
                sb2.append("PENDING");
            }
        }
        sb2.append("]");
        return sb2.toString();
    }

    /* access modifiers changed from: protected */
    public boolean u(Object obj) {
        if (obj == null) {
            obj = f14344g;
        }
        if (!f14343f.b(this, (Object) null, obj)) {
            return false;
        }
        j(this);
        return true;
    }

    /* access modifiers changed from: protected */
    public boolean x(Throwable th2) {
        if (!f14343f.b(this, (Object) null, new d((Throwable) f(th2)))) {
            return false;
        }
        j(this);
        return true;
    }

    /* access modifiers changed from: protected */
    public final boolean z() {
        Object obj = this.f14345a;
        if (!(obj instanceof c) || !((c) obj).f14350a) {
            return false;
        }
        return true;
    }

    public final Object get() {
        Object obj;
        boolean z10;
        if (!Thread.interrupted()) {
            Object obj2 = this.f14345a;
            if (obj2 != null) {
                return m(obj2);
            }
            h hVar = this.f14347c;
            if (hVar != h.f14363c) {
                h hVar2 = new h();
                do {
                    hVar2.a(hVar);
                    if (f14343f.c(this, hVar, hVar2)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.f14345a;
                                if (obj != null) {
                                    z10 = true;
                                    continue;
                                } else {
                                    z10 = false;
                                    continue;
                                }
                            } else {
                                t(hVar2);
                                throw new InterruptedException();
                            }
                        } while (!z10);
                        return m(obj);
                    }
                    hVar = this.f14347c;
                } while (hVar != h.f14363c);
            }
            return m(this.f14345a);
        }
        throw new InterruptedException();
    }
}
