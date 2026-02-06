package androidx.work.impl.utils.futures;

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
    static final boolean f18972d = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", com.amazon.a.a.o.b.f37476ag));

    /* renamed from: e  reason: collision with root package name */
    private static final Logger f18973e;

    /* renamed from: f  reason: collision with root package name */
    static final b f18974f;

    /* renamed from: g  reason: collision with root package name */
    private static final Object f18975g = new Object();

    /* renamed from: a  reason: collision with root package name */
    volatile Object f18976a;

    /* renamed from: b  reason: collision with root package name */
    volatile e f18977b;

    /* renamed from: c  reason: collision with root package name */
    volatile i f18978c;

    private static abstract class b {
        private b() {
        }

        /* access modifiers changed from: package-private */
        public abstract boolean a(a aVar, e eVar, e eVar2);

        /* access modifiers changed from: package-private */
        public abstract boolean b(a aVar, Object obj, Object obj2);

        /* access modifiers changed from: package-private */
        public abstract boolean c(a aVar, i iVar, i iVar2);

        /* access modifiers changed from: package-private */
        public abstract void d(i iVar, i iVar2);

        /* access modifiers changed from: package-private */
        public abstract void e(i iVar, Thread thread);
    }

    private static final class c {

        /* renamed from: c  reason: collision with root package name */
        static final c f18979c;

        /* renamed from: d  reason: collision with root package name */
        static final c f18980d;

        /* renamed from: a  reason: collision with root package name */
        final boolean f18981a;

        /* renamed from: b  reason: collision with root package name */
        final Throwable f18982b;

        static {
            if (a.f18972d) {
                f18980d = null;
                f18979c = null;
                return;
            }
            f18980d = new c(false, (Throwable) null);
            f18979c = new c(true, (Throwable) null);
        }

        c(boolean z10, Throwable th2) {
            this.f18981a = z10;
            this.f18982b = th2;
        }
    }

    private static final class d {

        /* renamed from: b  reason: collision with root package name */
        static final d f18983b = new d(new C0324a("Failure occurred while trying to finish a future."));

        /* renamed from: a  reason: collision with root package name */
        final Throwable f18984a;

        /* renamed from: androidx.work.impl.utils.futures.a$d$a  reason: collision with other inner class name */
        class C0324a extends Throwable {
            C0324a(String str) {
                super(str);
            }

            public synchronized Throwable fillInStackTrace() {
                return this;
            }
        }

        d(Throwable th2) {
            this.f18984a = (Throwable) a.d(th2);
        }
    }

    private static final class e {

        /* renamed from: d  reason: collision with root package name */
        static final e f18985d = new e((Runnable) null, (Executor) null);

        /* renamed from: a  reason: collision with root package name */
        final Runnable f18986a;

        /* renamed from: b  reason: collision with root package name */
        final Executor f18987b;

        /* renamed from: c  reason: collision with root package name */
        e f18988c;

        e(Runnable runnable, Executor executor) {
            this.f18986a = runnable;
            this.f18987b = executor;
        }
    }

    private static final class f extends b {

        /* renamed from: a  reason: collision with root package name */
        final AtomicReferenceFieldUpdater f18989a;

        /* renamed from: b  reason: collision with root package name */
        final AtomicReferenceFieldUpdater f18990b;

        /* renamed from: c  reason: collision with root package name */
        final AtomicReferenceFieldUpdater f18991c;

        /* renamed from: d  reason: collision with root package name */
        final AtomicReferenceFieldUpdater f18992d;

        /* renamed from: e  reason: collision with root package name */
        final AtomicReferenceFieldUpdater f18993e;

        f(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
            super();
            this.f18989a = atomicReferenceFieldUpdater;
            this.f18990b = atomicReferenceFieldUpdater2;
            this.f18991c = atomicReferenceFieldUpdater3;
            this.f18992d = atomicReferenceFieldUpdater4;
            this.f18993e = atomicReferenceFieldUpdater5;
        }

        /* access modifiers changed from: package-private */
        public boolean a(a aVar, e eVar, e eVar2) {
            return androidx.concurrent.futures.b.a(this.f18992d, aVar, eVar, eVar2);
        }

        /* access modifiers changed from: package-private */
        public boolean b(a aVar, Object obj, Object obj2) {
            return androidx.concurrent.futures.b.a(this.f18993e, aVar, obj, obj2);
        }

        /* access modifiers changed from: package-private */
        public boolean c(a aVar, i iVar, i iVar2) {
            return androidx.concurrent.futures.b.a(this.f18991c, aVar, iVar, iVar2);
        }

        /* access modifiers changed from: package-private */
        public void d(i iVar, i iVar2) {
            this.f18990b.lazySet(iVar, iVar2);
        }

        /* access modifiers changed from: package-private */
        public void e(i iVar, Thread thread) {
            this.f18989a.lazySet(iVar, thread);
        }
    }

    private static final class g implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final a f18994a;

        /* renamed from: b  reason: collision with root package name */
        final com.google.common.util.concurrent.g f18995b;

        g(a aVar, com.google.common.util.concurrent.g gVar) {
            this.f18994a = aVar;
            this.f18995b = gVar;
        }

        public void run() {
            if (this.f18994a.f18976a == this) {
                if (a.f18974f.b(this.f18994a, this, a.j(this.f18995b))) {
                    a.g(this.f18994a);
                }
            }
        }
    }

    private static final class h extends b {
        h() {
            super();
        }

        /* access modifiers changed from: package-private */
        public boolean a(a aVar, e eVar, e eVar2) {
            synchronized (aVar) {
                try {
                    if (aVar.f18977b != eVar) {
                        return false;
                    }
                    aVar.f18977b = eVar2;
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
                    if (aVar.f18976a != obj) {
                        return false;
                    }
                    aVar.f18976a = obj2;
                    return true;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        /* access modifiers changed from: package-private */
        public boolean c(a aVar, i iVar, i iVar2) {
            synchronized (aVar) {
                try {
                    if (aVar.f18978c != iVar) {
                        return false;
                    }
                    aVar.f18978c = iVar2;
                    return true;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        /* access modifiers changed from: package-private */
        public void d(i iVar, i iVar2) {
            iVar.f18998b = iVar2;
        }

        /* access modifiers changed from: package-private */
        public void e(i iVar, Thread thread) {
            iVar.f18997a = thread;
        }
    }

    private static final class i {

        /* renamed from: c  reason: collision with root package name */
        static final i f18996c = new i(false);

        /* renamed from: a  reason: collision with root package name */
        volatile Thread f18997a;

        /* renamed from: b  reason: collision with root package name */
        volatile i f18998b;

        i(boolean z10) {
        }

        /* access modifiers changed from: package-private */
        public void a(i iVar) {
            a.f18974f.d(this, iVar);
        }

        /* access modifiers changed from: package-private */
        public void b() {
            Thread thread = this.f18997a;
            if (thread != null) {
                this.f18997a = null;
                LockSupport.unpark(thread);
            }
        }

        i() {
            a.f18974f.e(this, Thread.currentThread());
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v3, resolved type: androidx.work.impl.utils.futures.a$f} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v4, resolved type: androidx.work.impl.utils.futures.a$h} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v5, resolved type: androidx.work.impl.utils.futures.a$f} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v3, resolved type: androidx.work.impl.utils.futures.a$f} */
    /* JADX WARNING: Multi-variable type inference failed */
    static {
        /*
            java.lang.String r0 = "b"
            java.lang.String r1 = "a"
            java.lang.Class<androidx.work.impl.utils.futures.a$i> r2 = androidx.work.impl.utils.futures.a.i.class
            java.lang.String r3 = "guava.concurrent.generate_cancellation_cause"
            java.lang.String r4 = "false"
            java.lang.String r3 = java.lang.System.getProperty(r3, r4)
            boolean r3 = java.lang.Boolean.parseBoolean(r3)
            f18972d = r3
            java.lang.Class<androidx.work.impl.utils.futures.a> r3 = androidx.work.impl.utils.futures.a.class
            java.lang.String r4 = r3.getName()
            java.util.logging.Logger r4 = java.util.logging.Logger.getLogger(r4)
            f18973e = r4
            androidx.work.impl.utils.futures.a$f r4 = new androidx.work.impl.utils.futures.a$f     // Catch:{ all -> 0x0044 }
            java.lang.Class<java.lang.Thread> r5 = java.lang.Thread.class
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r6 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r2, r5, r1)     // Catch:{ all -> 0x0044 }
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r7 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r2, r2, r0)     // Catch:{ all -> 0x0044 }
            java.lang.String r5 = "c"
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r8 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r3, r2, r5)     // Catch:{ all -> 0x0044 }
            java.lang.Class<androidx.work.impl.utils.futures.a$e> r2 = androidx.work.impl.utils.futures.a.e.class
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r9 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r3, r2, r0)     // Catch:{ all -> 0x0044 }
            java.lang.Class<java.lang.Object> r0 = java.lang.Object.class
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r10 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r3, r0, r1)     // Catch:{ all -> 0x0044 }
            r5 = r4
            r5.<init>(r6, r7, r8, r9, r10)     // Catch:{ all -> 0x0044 }
            r0 = 0
            goto L_0x004a
        L_0x0044:
            r0 = move-exception
            androidx.work.impl.utils.futures.a$h r4 = new androidx.work.impl.utils.futures.a$h
            r4.<init>()
        L_0x004a:
            f18974f = r4
            if (r0 == 0) goto L_0x0057
            java.util.logging.Logger r1 = f18973e
            java.util.logging.Level r2 = java.util.logging.Level.SEVERE
            java.lang.String r3 = "SafeAtomicHelper is broken!"
            r1.log(r2, r3, r0)
        L_0x0057:
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            f18975g = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.work.impl.utils.futures.a.<clinit>():void");
    }

    protected a() {
    }

    private void a(StringBuilder sb2) {
        try {
            Object k10 = k(this);
            sb2.append("SUCCESS, result=[");
            sb2.append(s(k10));
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

    static Object d(Object obj) {
        obj.getClass();
        return obj;
    }

    private e f(e eVar) {
        e eVar2;
        do {
            eVar2 = this.f18977b;
        } while (!f18974f.a(this, eVar2, e.f18985d));
        e eVar3 = eVar2;
        e eVar4 = eVar;
        e eVar5 = eVar3;
        while (eVar5 != null) {
            e eVar6 = eVar5.f18988c;
            eVar5.f18988c = eVar4;
            eVar4 = eVar5;
            eVar5 = eVar6;
        }
        return eVar4;
    }

    static void g(a aVar) {
        e eVar = null;
        while (true) {
            aVar.n();
            aVar.b();
            e f10 = aVar.f(eVar);
            while (true) {
                if (f10 != null) {
                    eVar = f10.f18988c;
                    Runnable runnable = f10.f18986a;
                    if (runnable instanceof g) {
                        g gVar = (g) runnable;
                        aVar = gVar.f18994a;
                        if (aVar.f18976a == gVar) {
                            if (f18974f.b(aVar, gVar, j(gVar.f18995b))) {
                            }
                        } else {
                            continue;
                        }
                    } else {
                        h(runnable, f10.f18987b);
                    }
                    f10 = eVar;
                } else {
                    return;
                }
            }
        }
    }

    private static void h(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e10) {
            Logger logger = f18973e;
            Level level = Level.SEVERE;
            logger.log(level, "RuntimeException while executing runnable " + runnable + " with executor " + executor, e10);
        }
    }

    private Object i(Object obj) {
        if (obj instanceof c) {
            throw c("Task was cancelled.", ((c) obj).f18982b);
        } else if (obj instanceof d) {
            throw new ExecutionException(((d) obj).f18984a);
        } else if (obj == f18975g) {
            return null;
        } else {
            return obj;
        }
    }

    static Object j(com.google.common.util.concurrent.g gVar) {
        if (gVar instanceof a) {
            Object obj = ((a) gVar).f18976a;
            if (!(obj instanceof c)) {
                return obj;
            }
            c cVar = (c) obj;
            if (!cVar.f18981a) {
                return obj;
            }
            if (cVar.f18982b != null) {
                return new c(false, cVar.f18982b);
            }
            return c.f18980d;
        }
        boolean isCancelled = gVar.isCancelled();
        if ((!f18972d) && isCancelled) {
            return c.f18980d;
        }
        try {
            Object k10 = k(gVar);
            if (k10 == null) {
                return f18975g;
            }
            return k10;
        } catch (ExecutionException e10) {
            return new d(e10.getCause());
        } catch (CancellationException e11) {
            if (isCancelled) {
                return new c(false, e11);
            }
            return new d(new IllegalArgumentException("get() threw CancellationException, despite reporting isCancelled() == false: " + gVar, e11));
        } catch (Throwable th2) {
            return new d(th2);
        }
    }

    private static Object k(Future future) {
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

    private void n() {
        i iVar;
        do {
            iVar = this.f18978c;
        } while (!f18974f.c(this, iVar, i.f18996c));
        while (iVar != null) {
            iVar.b();
            iVar = iVar.f18998b;
        }
    }

    private void o(i iVar) {
        iVar.f18997a = null;
        while (true) {
            i iVar2 = this.f18978c;
            if (iVar2 != i.f18996c) {
                i iVar3 = null;
                while (iVar2 != null) {
                    i iVar4 = iVar2.f18998b;
                    if (iVar2.f18997a != null) {
                        iVar3 = iVar2;
                    } else if (iVar3 != null) {
                        iVar3.f18998b = iVar4;
                        if (iVar3.f18997a == null) {
                        }
                    } else if (!f18974f.c(this, iVar2, iVar4)) {
                    }
                    iVar2 = iVar4;
                }
                return;
            }
            return;
        }
    }

    private String s(Object obj) {
        if (obj == this) {
            return "this future";
        }
        return String.valueOf(obj);
    }

    /* access modifiers changed from: protected */
    public void b() {
    }

    /* JADX WARNING: type inference failed for: r0v5, types: [java.util.concurrent.Future, com.google.common.util.concurrent.g] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean cancel(boolean r8) {
        /*
            r7 = this;
            java.lang.Object r0 = r7.f18976a
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L_0x0008
            r3 = r1
            goto L_0x0009
        L_0x0008:
            r3 = r2
        L_0x0009:
            boolean r4 = r0 instanceof androidx.work.impl.utils.futures.a.g
            r3 = r3 | r4
            if (r3 == 0) goto L_0x0061
            boolean r3 = f18972d
            if (r3 == 0) goto L_0x001f
            androidx.work.impl.utils.futures.a$c r3 = new androidx.work.impl.utils.futures.a$c
            java.util.concurrent.CancellationException r4 = new java.util.concurrent.CancellationException
            java.lang.String r5 = "Future.cancel() was called."
            r4.<init>(r5)
            r3.<init>(r8, r4)
            goto L_0x0026
        L_0x001f:
            if (r8 == 0) goto L_0x0024
            androidx.work.impl.utils.futures.a$c r3 = androidx.work.impl.utils.futures.a.c.f18979c
            goto L_0x0026
        L_0x0024:
            androidx.work.impl.utils.futures.a$c r3 = androidx.work.impl.utils.futures.a.c.f18980d
        L_0x0026:
            r4 = r7
            r5 = r2
        L_0x0028:
            androidx.work.impl.utils.futures.a$b r6 = f18974f
            boolean r6 = r6.b(r4, r0, r3)
            if (r6 == 0) goto L_0x0059
            if (r8 == 0) goto L_0x0035
            r4.l()
        L_0x0035:
            g(r4)
            boolean r4 = r0 instanceof androidx.work.impl.utils.futures.a.g
            if (r4 == 0) goto L_0x0062
            androidx.work.impl.utils.futures.a$g r0 = (androidx.work.impl.utils.futures.a.g) r0
            com.google.common.util.concurrent.g r0 = r0.f18995b
            boolean r4 = r0 instanceof androidx.work.impl.utils.futures.a
            if (r4 == 0) goto L_0x0055
            r4 = r0
            androidx.work.impl.utils.futures.a r4 = (androidx.work.impl.utils.futures.a) r4
            java.lang.Object r0 = r4.f18976a
            if (r0 != 0) goto L_0x004d
            r5 = r1
            goto L_0x004e
        L_0x004d:
            r5 = r2
        L_0x004e:
            boolean r6 = r0 instanceof androidx.work.impl.utils.futures.a.g
            r5 = r5 | r6
            if (r5 == 0) goto L_0x0062
            r5 = r1
            goto L_0x0028
        L_0x0055:
            r0.cancel(r8)
            goto L_0x0062
        L_0x0059:
            java.lang.Object r0 = r4.f18976a
            boolean r6 = r0 instanceof androidx.work.impl.utils.futures.a.g
            if (r6 != 0) goto L_0x0028
            r1 = r5
            goto L_0x0062
        L_0x0061:
            r1 = r2
        L_0x0062:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.work.impl.utils.futures.a.cancel(boolean):boolean");
    }

    public final void e(Runnable runnable, Executor executor) {
        d(runnable);
        d(executor);
        e eVar = this.f18977b;
        if (eVar != e.f18985d) {
            e eVar2 = new e(runnable, executor);
            do {
                eVar2.f18988c = eVar;
                if (!f18974f.a(this, eVar, eVar2)) {
                    eVar = this.f18977b;
                } else {
                    return;
                }
            } while (eVar != e.f18985d);
        }
        h(runnable, executor);
    }

    public final Object get(long j10, TimeUnit timeUnit) {
        long j11 = j10;
        TimeUnit timeUnit2 = timeUnit;
        long nanos = timeUnit2.toNanos(j11);
        if (!Thread.interrupted()) {
            Object obj = this.f18976a;
            if ((obj != null) && (!(obj instanceof g))) {
                return i(obj);
            }
            long nanoTime = nanos > 0 ? System.nanoTime() + nanos : 0;
            if (nanos >= 1000) {
                i iVar = this.f18978c;
                if (iVar != i.f18996c) {
                    i iVar2 = new i();
                    do {
                        iVar2.a(iVar);
                        if (f18974f.c(this, iVar, iVar2)) {
                            do {
                                LockSupport.parkNanos(this, nanos);
                                if (!Thread.interrupted()) {
                                    Object obj2 = this.f18976a;
                                    if ((obj2 != null) && (!(obj2 instanceof g))) {
                                        return i(obj2);
                                    }
                                    nanos = nanoTime - System.nanoTime();
                                } else {
                                    o(iVar2);
                                    throw new InterruptedException();
                                }
                            } while (nanos >= 1000);
                            o(iVar2);
                        } else {
                            iVar = this.f18978c;
                        }
                    } while (iVar != i.f18996c);
                }
                return i(this.f18976a);
            }
            while (nanos > 0) {
                Object obj3 = this.f18976a;
                if ((obj3 != null) && (!(obj3 instanceof g))) {
                    return i(obj3);
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
        return this.f18976a instanceof c;
    }

    public final boolean isDone() {
        boolean z10;
        Object obj = this.f18976a;
        if (obj != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        return (!(obj instanceof g)) & z10;
    }

    /* access modifiers changed from: protected */
    public void l() {
    }

    /* access modifiers changed from: protected */
    public String m() {
        Object obj = this.f18976a;
        if (obj instanceof g) {
            return "setFuture=[" + s(((g) obj).f18995b) + "]";
        } else if (!(this instanceof ScheduledFuture)) {
            return null;
        } else {
            return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
        }
    }

    /* access modifiers changed from: protected */
    public boolean p(Object obj) {
        if (obj == null) {
            obj = f18975g;
        }
        if (!f18974f.b(this, (Object) null, obj)) {
            return false;
        }
        g(this);
        return true;
    }

    /* access modifiers changed from: protected */
    public boolean q(Throwable th2) {
        if (!f18974f.b(this, (Object) null, new d((Throwable) d(th2)))) {
            return false;
        }
        g(this);
        return true;
    }

    /* access modifiers changed from: protected */
    public boolean r(com.google.common.util.concurrent.g gVar) {
        g gVar2;
        d dVar;
        d(gVar);
        Object obj = this.f18976a;
        if (obj == null) {
            if (gVar.isDone()) {
                if (!f18974f.b(this, (Object) null, j(gVar))) {
                    return false;
                }
                g(this);
                return true;
            }
            gVar2 = new g(this, gVar);
            if (f18974f.b(this, (Object) null, gVar2)) {
                try {
                    gVar.e(gVar2, b.INSTANCE);
                } catch (Throwable unused) {
                    dVar = d.f18983b;
                }
                return true;
            }
            obj = this.f18976a;
        }
        if (obj instanceof c) {
            gVar.cancel(((c) obj).f18981a);
        }
        return false;
        f18974f.b(this, gVar2, dVar);
        return true;
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
                str = m();
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

    public final Object get() {
        Object obj;
        if (!Thread.interrupted()) {
            Object obj2 = this.f18976a;
            if ((obj2 != null) && (!(obj2 instanceof g))) {
                return i(obj2);
            }
            i iVar = this.f18978c;
            if (iVar != i.f18996c) {
                i iVar2 = new i();
                do {
                    iVar2.a(iVar);
                    if (f18974f.c(this, iVar, iVar2)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.f18976a;
                            } else {
                                o(iVar2);
                                throw new InterruptedException();
                            }
                        } while (!((obj != null) & (!(obj instanceof g))));
                        return i(obj);
                    }
                    iVar = this.f18978c;
                } while (iVar != i.f18996c);
            }
            return i(this.f18976a);
        }
        throw new InterruptedException();
    }
}
