package com.google.common.util.concurrent;

import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import java.lang.reflect.Field;
import java.security.PrivilegedExceptionAction;
import java.util.Locale;
import java.util.Objects;
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
import nb.o;
import nb.t;
import qb.C5148a;
import sun.misc.Unsafe;

public abstract class a extends C5148a implements g {

    /* renamed from: d  reason: collision with root package name */
    static final boolean f56799d;

    /* renamed from: e  reason: collision with root package name */
    static final f f56800e;
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public static final b f56801f;

    /* renamed from: g  reason: collision with root package name */
    private static final Object f56802g = new Object();
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public volatile Object f56803a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public volatile e f56804b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public volatile k f56805c;

    private static abstract class b {
        private b() {
        }

        /* access modifiers changed from: package-private */
        public abstract boolean a(a aVar, e eVar, e eVar2);

        /* access modifiers changed from: package-private */
        public abstract boolean b(a aVar, Object obj, Object obj2);

        /* access modifiers changed from: package-private */
        public abstract boolean c(a aVar, k kVar, k kVar2);

        /* access modifiers changed from: package-private */
        public abstract e d(a aVar, e eVar);

        /* access modifiers changed from: package-private */
        public abstract k e(a aVar, k kVar);

        /* access modifiers changed from: package-private */
        public abstract void f(k kVar, k kVar2);

        /* access modifiers changed from: package-private */
        public abstract void g(k kVar, Thread thread);
    }

    private static final class c {

        /* renamed from: c  reason: collision with root package name */
        static final c f56806c;

        /* renamed from: d  reason: collision with root package name */
        static final c f56807d;

        /* renamed from: a  reason: collision with root package name */
        final boolean f56808a;

        /* renamed from: b  reason: collision with root package name */
        final Throwable f56809b;

        static {
            if (a.f56799d) {
                f56807d = null;
                f56806c = null;
                return;
            }
            f56807d = new c(false, (Throwable) null);
            f56806c = new c(true, (Throwable) null);
        }

        c(boolean z10, Throwable th2) {
            this.f56808a = z10;
            this.f56809b = th2;
        }
    }

    private static final class d {

        /* renamed from: b  reason: collision with root package name */
        static final d f56810b = new d(new C0850a("Failure occurred while trying to finish a future."));

        /* renamed from: a  reason: collision with root package name */
        final Throwable f56811a;

        /* renamed from: com.google.common.util.concurrent.a$d$a  reason: collision with other inner class name */
        class C0850a extends Throwable {
            C0850a(String str) {
                super(str);
            }

            public synchronized Throwable fillInStackTrace() {
                return this;
            }
        }

        d(Throwable th2) {
            this.f56811a = (Throwable) o.j(th2);
        }
    }

    private static final class f extends b {

        /* renamed from: a  reason: collision with root package name */
        final AtomicReferenceFieldUpdater f56816a;

        /* renamed from: b  reason: collision with root package name */
        final AtomicReferenceFieldUpdater f56817b;

        /* renamed from: c  reason: collision with root package name */
        final AtomicReferenceFieldUpdater f56818c;

        /* renamed from: d  reason: collision with root package name */
        final AtomicReferenceFieldUpdater f56819d;

        /* renamed from: e  reason: collision with root package name */
        final AtomicReferenceFieldUpdater f56820e;

        f(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
            super();
            this.f56816a = atomicReferenceFieldUpdater;
            this.f56817b = atomicReferenceFieldUpdater2;
            this.f56818c = atomicReferenceFieldUpdater3;
            this.f56819d = atomicReferenceFieldUpdater4;
            this.f56820e = atomicReferenceFieldUpdater5;
        }

        /* access modifiers changed from: package-private */
        public boolean a(a aVar, e eVar, e eVar2) {
            return androidx.concurrent.futures.b.a(this.f56819d, aVar, eVar, eVar2);
        }

        /* access modifiers changed from: package-private */
        public boolean b(a aVar, Object obj, Object obj2) {
            return androidx.concurrent.futures.b.a(this.f56820e, aVar, obj, obj2);
        }

        /* access modifiers changed from: package-private */
        public boolean c(a aVar, k kVar, k kVar2) {
            return androidx.concurrent.futures.b.a(this.f56818c, aVar, kVar, kVar2);
        }

        /* access modifiers changed from: package-private */
        public e d(a aVar, e eVar) {
            return (e) this.f56819d.getAndSet(aVar, eVar);
        }

        /* access modifiers changed from: package-private */
        public k e(a aVar, k kVar) {
            return (k) this.f56818c.getAndSet(aVar, kVar);
        }

        /* access modifiers changed from: package-private */
        public void f(k kVar, k kVar2) {
            this.f56817b.lazySet(kVar, kVar2);
        }

        /* access modifiers changed from: package-private */
        public void g(k kVar, Thread thread) {
            this.f56816a.lazySet(kVar, thread);
        }
    }

    private static final class g extends b {
        private g() {
            super();
        }

        /* access modifiers changed from: package-private */
        public boolean a(a aVar, e eVar, e eVar2) {
            synchronized (aVar) {
                try {
                    if (aVar.f56804b != eVar) {
                        return false;
                    }
                    e unused = aVar.f56804b = eVar2;
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
                    if (aVar.f56803a != obj) {
                        return false;
                    }
                    Object unused = aVar.f56803a = obj2;
                    return true;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        /* access modifiers changed from: package-private */
        public boolean c(a aVar, k kVar, k kVar2) {
            synchronized (aVar) {
                try {
                    if (aVar.f56805c != kVar) {
                        return false;
                    }
                    k unused = aVar.f56805c = kVar2;
                    return true;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        /* access modifiers changed from: package-private */
        public e d(a aVar, e eVar) {
            e f10;
            synchronized (aVar) {
                try {
                    f10 = aVar.f56804b;
                    if (f10 != eVar) {
                        e unused = aVar.f56804b = eVar;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return f10;
        }

        /* access modifiers changed from: package-private */
        public k e(a aVar, k kVar) {
            k h10;
            synchronized (aVar) {
                try {
                    h10 = aVar.f56805c;
                    if (h10 != kVar) {
                        k unused = aVar.f56805c = kVar;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return h10;
        }

        /* access modifiers changed from: package-private */
        public void f(k kVar, k kVar2) {
            kVar.f56829b = kVar2;
        }

        /* access modifiers changed from: package-private */
        public void g(k kVar, Thread thread) {
            kVar.f56828a = thread;
        }
    }

    interface h extends g {
    }

    static abstract class i extends a implements h {
        i() {
        }

        public final boolean cancel(boolean z10) {
            return a.super.cancel(z10);
        }

        public final void e(Runnable runnable, Executor executor) {
            a.super.e(runnable, executor);
        }

        public Object get() {
            return a.super.get();
        }

        public final boolean isCancelled() {
            return a.super.isCancelled();
        }

        public final boolean isDone() {
            return a.super.isDone();
        }

        public final Object get(long j10, TimeUnit timeUnit) {
            return a.super.get(j10, timeUnit);
        }
    }

    private static final class j extends b {

        /* renamed from: a  reason: collision with root package name */
        static final Unsafe f56821a;

        /* renamed from: b  reason: collision with root package name */
        static final long f56822b;

        /* renamed from: c  reason: collision with root package name */
        static final long f56823c;

        /* renamed from: d  reason: collision with root package name */
        static final long f56824d;

        /* renamed from: e  reason: collision with root package name */
        static final long f56825e;

        /* renamed from: f  reason: collision with root package name */
        static final long f56826f;

        /* renamed from: com.google.common.util.concurrent.a$j$a  reason: collision with other inner class name */
        class C0851a implements PrivilegedExceptionAction {
            C0851a() {
            }

            /* renamed from: a */
            public Unsafe run() {
                Class<Unsafe> cls = Unsafe.class;
                for (Field field : cls.getDeclaredFields()) {
                    field.setAccessible(true);
                    Object obj = field.get((Object) null);
                    if (cls.isInstance(obj)) {
                        return cls.cast(obj);
                    }
                }
                throw new NoSuchFieldError("the Unsafe");
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:12:0x0056, code lost:
            r0 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:14:0x0062, code lost:
            throw new java.lang.RuntimeException("Could not initialize intrinsics", r0.getCause());
         */
        /* JADX WARNING: Code restructure failed: missing block: B:4:?, code lost:
            r3 = (sun.misc.Unsafe) java.security.AccessController.doPrivileged(new com.google.common.util.concurrent.a.j.C0851a());
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x000b */
        static {
            /*
                java.lang.String r0 = "a"
                java.lang.String r1 = "b"
                java.lang.Class<com.google.common.util.concurrent.a$k> r2 = com.google.common.util.concurrent.a.k.class
                sun.misc.Unsafe r3 = sun.misc.Unsafe.getUnsafe()     // Catch:{ SecurityException -> 0x000b }
                goto L_0x0016
            L_0x000b:
                com.google.common.util.concurrent.a$j$a r3 = new com.google.common.util.concurrent.a$j$a     // Catch:{ PrivilegedActionException -> 0x0056 }
                r3.<init>()     // Catch:{ PrivilegedActionException -> 0x0056 }
                java.lang.Object r3 = java.security.AccessController.doPrivileged(r3)     // Catch:{ PrivilegedActionException -> 0x0056 }
                sun.misc.Unsafe r3 = (sun.misc.Unsafe) r3     // Catch:{ PrivilegedActionException -> 0x0056 }
            L_0x0016:
                java.lang.Class<com.google.common.util.concurrent.a> r4 = com.google.common.util.concurrent.a.class
                java.lang.String r5 = "c"
                java.lang.reflect.Field r5 = r4.getDeclaredField(r5)     // Catch:{ NoSuchFieldException -> 0x004f }
                long r5 = r3.objectFieldOffset(r5)     // Catch:{ NoSuchFieldException -> 0x004f }
                f56823c = r5     // Catch:{ NoSuchFieldException -> 0x004f }
                java.lang.reflect.Field r5 = r4.getDeclaredField(r1)     // Catch:{ NoSuchFieldException -> 0x004f }
                long r5 = r3.objectFieldOffset(r5)     // Catch:{ NoSuchFieldException -> 0x004f }
                f56822b = r5     // Catch:{ NoSuchFieldException -> 0x004f }
                java.lang.reflect.Field r4 = r4.getDeclaredField(r0)     // Catch:{ NoSuchFieldException -> 0x004f }
                long r4 = r3.objectFieldOffset(r4)     // Catch:{ NoSuchFieldException -> 0x004f }
                f56824d = r4     // Catch:{ NoSuchFieldException -> 0x004f }
                java.lang.reflect.Field r0 = r2.getDeclaredField(r0)     // Catch:{ NoSuchFieldException -> 0x004f }
                long r4 = r3.objectFieldOffset(r0)     // Catch:{ NoSuchFieldException -> 0x004f }
                f56825e = r4     // Catch:{ NoSuchFieldException -> 0x004f }
                java.lang.reflect.Field r0 = r2.getDeclaredField(r1)     // Catch:{ NoSuchFieldException -> 0x004f }
                long r0 = r3.objectFieldOffset(r0)     // Catch:{ NoSuchFieldException -> 0x004f }
                f56826f = r0     // Catch:{ NoSuchFieldException -> 0x004f }
                f56821a = r3     // Catch:{ NoSuchFieldException -> 0x004f }
                return
            L_0x004f:
                r0 = move-exception
                java.lang.RuntimeException r1 = new java.lang.RuntimeException
                r1.<init>(r0)
                throw r1
            L_0x0056:
                r0 = move-exception
                java.lang.RuntimeException r1 = new java.lang.RuntimeException
                java.lang.String r2 = "Could not initialize intrinsics"
                java.lang.Throwable r0 = r0.getCause()
                r1.<init>(r2, r0)
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.common.util.concurrent.a.j.<clinit>():void");
        }

        private j() {
            super();
        }

        /* access modifiers changed from: package-private */
        public boolean a(a aVar, e eVar, e eVar2) {
            return com.google.android.gms.internal.play_billing.a.a(f56821a, aVar, f56822b, eVar, eVar2);
        }

        /* access modifiers changed from: package-private */
        public boolean b(a aVar, Object obj, Object obj2) {
            return com.google.android.gms.internal.play_billing.a.a(f56821a, aVar, f56824d, obj, obj2);
        }

        /* access modifiers changed from: package-private */
        public boolean c(a aVar, k kVar, k kVar2) {
            return com.google.android.gms.internal.play_billing.a.a(f56821a, aVar, f56823c, kVar, kVar2);
        }

        /*  JADX ERROR: StackOverflow in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: 
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
            	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
            */
        com.google.common.util.concurrent.a.e d(com.google.common.util.concurrent.a r3, com.google.common.util.concurrent.a.e r4) {
            /*
                r2 = this;
            L_0x0000:
                com.google.common.util.concurrent.a$e r0 = r3.f56804b
                if (r4 != r0) goto L_0x0007
                return r0
            L_0x0007:
                boolean r1 = r2.a(r3, r0, r4)
                if (r1 == 0) goto L_0x0000
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.common.util.concurrent.a.j.d(com.google.common.util.concurrent.a, com.google.common.util.concurrent.a$e):com.google.common.util.concurrent.a$e");
        }

        /*  JADX ERROR: StackOverflow in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: 
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
            	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
            */
        com.google.common.util.concurrent.a.k e(com.google.common.util.concurrent.a r3, com.google.common.util.concurrent.a.k r4) {
            /*
                r2 = this;
            L_0x0000:
                com.google.common.util.concurrent.a$k r0 = r3.f56805c
                if (r4 != r0) goto L_0x0007
                return r0
            L_0x0007:
                boolean r1 = r2.c(r3, r0, r4)
                if (r1 == 0) goto L_0x0000
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.common.util.concurrent.a.j.e(com.google.common.util.concurrent.a, com.google.common.util.concurrent.a$k):com.google.common.util.concurrent.a$k");
        }

        /* access modifiers changed from: package-private */
        public void f(k kVar, k kVar2) {
            f56821a.putObject(kVar, f56826f, kVar2);
        }

        /* access modifiers changed from: package-private */
        public void g(k kVar, Thread thread) {
            f56821a.putObject(kVar, f56825e, thread);
        }
    }

    private static final class k {

        /* renamed from: c  reason: collision with root package name */
        static final k f56827c = new k(false);

        /* renamed from: a  reason: collision with root package name */
        volatile Thread f56828a;

        /* renamed from: b  reason: collision with root package name */
        volatile k f56829b;

        k(boolean z10) {
        }

        /* access modifiers changed from: package-private */
        public void a(k kVar) {
            a.f56801f.f(this, kVar);
        }

        /* access modifiers changed from: package-private */
        public void b() {
            Thread thread = this.f56828a;
            if (thread != null) {
                this.f56828a = null;
                LockSupport.unpark(thread);
            }
        }

        k() {
            a.f56801f.g(this, Thread.currentThread());
        }
    }

    static {
        boolean z10;
        b bVar;
        Class<k> cls = k.class;
        try {
            z10 = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", com.amazon.a.a.o.b.f37476ag));
        } catch (SecurityException unused) {
            z10 = false;
        }
        f56799d = z10;
        Class<a> cls2 = a.class;
        f56800e = new f(cls2);
        Throwable th2 = null;
        try {
            bVar = new j();
            e = null;
        } catch (Error | Exception e10) {
            e = e10;
            try {
                bVar = new f(AtomicReferenceFieldUpdater.newUpdater(cls, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(cls, cls, "b"), AtomicReferenceFieldUpdater.newUpdater(cls2, cls, "c"), AtomicReferenceFieldUpdater.newUpdater(cls2, e.class, "b"), AtomicReferenceFieldUpdater.newUpdater(cls2, Object.class, "a"));
            } catch (Error | Exception e11) {
                bVar = new g();
                th2 = e11;
            }
        }
        f56801f = bVar;
        if (th2 != null) {
            f fVar = f56800e;
            Logger a10 = fVar.a();
            Level level = Level.SEVERE;
            a10.log(level, "UnsafeAtomicHelper is broken!", e);
            fVar.a().log(level, "SafeAtomicHelper is broken!", th2);
        }
    }

    protected a() {
    }

    private void j(StringBuilder sb2) {
        try {
            Object s10 = s(this);
            sb2.append("SUCCESS, result=[");
            m(sb2, s10);
            sb2.append("]");
        } catch (ExecutionException e10) {
            sb2.append("FAILURE, cause=[");
            sb2.append(e10.getCause());
            sb2.append("]");
        } catch (CancellationException unused) {
            sb2.append("CANCELLED");
        } catch (Exception e11) {
            sb2.append("UNKNOWN, cause=[");
            sb2.append(e11.getClass());
            sb2.append(" thrown from get()]");
        }
    }

    private void k(StringBuilder sb2) {
        String str;
        int length = sb2.length();
        sb2.append("PENDING");
        try {
            str = t.a(u());
        } catch (Exception | StackOverflowError e10) {
            str = "Exception thrown from implementation: " + e10.getClass();
        }
        if (str != null) {
            sb2.append(", info=[");
            sb2.append(str);
            sb2.append("]");
        }
        if (isDone()) {
            sb2.delete(length, sb2.length());
            j(sb2);
        }
    }

    private void m(StringBuilder sb2, Object obj) {
        if (obj == null) {
            sb2.append("null");
        } else if (obj == this) {
            sb2.append("this future");
        } else {
            sb2.append(obj.getClass().getName());
            sb2.append("@");
            sb2.append(Integer.toHexString(System.identityHashCode(obj)));
        }
    }

    private static CancellationException n(String str, Throwable th2) {
        CancellationException cancellationException = new CancellationException(str);
        cancellationException.initCause(th2);
        return cancellationException;
    }

    private e o(e eVar) {
        e eVar2 = eVar;
        e d10 = f56801f.d(this, e.f56812d);
        while (d10 != null) {
            e eVar3 = d10.f56815c;
            d10.f56815c = eVar2;
            eVar2 = d10;
            d10 = eVar3;
        }
        return eVar2;
    }

    private static void p(a aVar, boolean z10) {
        aVar.v();
        if (z10) {
            aVar.t();
        }
        aVar.l();
        e o10 = aVar.o((e) null);
        while (o10 != null) {
            e eVar = o10.f56815c;
            Runnable runnable = o10.f56813a;
            Objects.requireNonNull(runnable);
            Executor executor = o10.f56814b;
            Objects.requireNonNull(executor);
            q(runnable, executor);
            o10 = eVar;
        }
    }

    private static void q(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (Exception e10) {
            Logger a10 = f56800e.a();
            Level level = Level.SEVERE;
            a10.log(level, "RuntimeException while executing runnable " + runnable + " with executor " + executor, e10);
        }
    }

    private Object r(Object obj) {
        if (obj instanceof c) {
            throw n("Task was cancelled.", ((c) obj).f56809b);
        } else if (obj instanceof d) {
            throw new ExecutionException(((d) obj).f56811a);
        } else if (obj == f56802g) {
            return i.a();
        } else {
            return obj;
        }
    }

    private static Object s(Future future) {
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

    private void v() {
        for (k e10 = f56801f.e(this, k.f56827c); e10 != null; e10 = e10.f56829b) {
            e10.b();
        }
    }

    private void w(k kVar) {
        kVar.f56828a = null;
        while (true) {
            k kVar2 = this.f56805c;
            if (kVar2 != k.f56827c) {
                k kVar3 = null;
                while (kVar2 != null) {
                    k kVar4 = kVar2.f56829b;
                    if (kVar2.f56828a != null) {
                        kVar3 = kVar2;
                    } else if (kVar3 != null) {
                        kVar3.f56829b = kVar4;
                        if (kVar3.f56828a == null) {
                        }
                    } else if (!f56801f.c(this, kVar2, kVar4)) {
                    }
                    kVar2 = kVar4;
                }
                return;
            }
            return;
        }
    }

    /* access modifiers changed from: protected */
    public final Throwable a() {
        if (!(this instanceof h)) {
            return null;
        }
        Object obj = this.f56803a;
        if (obj instanceof d) {
            return ((d) obj).f56811a;
        }
        return null;
    }

    public boolean cancel(boolean z10) {
        boolean z11;
        c cVar;
        Object obj = this.f56803a;
        if (obj == null) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11) {
            if (f56799d) {
                cVar = new c(z10, new CancellationException("Future.cancel() was called."));
            } else {
                if (z10) {
                    cVar = c.f56806c;
                } else {
                    cVar = c.f56807d;
                }
                Objects.requireNonNull(cVar);
            }
            if (f56801f.b(this, obj, cVar)) {
                p(this, z10);
                return true;
            }
        }
        return false;
    }

    public void e(Runnable runnable, Executor executor) {
        e eVar;
        o.k(runnable, "Runnable was null.");
        o.k(executor, "Executor was null.");
        if (isDone() || (eVar = this.f56804b) == e.f56812d) {
            q(runnable, executor);
        }
        e eVar2 = new e(runnable, executor);
        do {
            eVar2.f56815c = eVar;
            if (!f56801f.a(this, eVar, eVar2)) {
                eVar = this.f56804b;
            } else {
                return;
            }
        } while (eVar != e.f56812d);
        q(runnable, executor);
    }

    public Object get(long j10, TimeUnit timeUnit) {
        long j11 = j10;
        TimeUnit timeUnit2 = timeUnit;
        long nanos = timeUnit2.toNanos(j11);
        if (!Thread.interrupted()) {
            Object obj = this.f56803a;
            if (obj != null) {
                return r(obj);
            }
            long nanoTime = nanos > 0 ? System.nanoTime() + nanos : 0;
            if (nanos >= 1000) {
                k kVar = this.f56805c;
                if (kVar != k.f56827c) {
                    k kVar2 = new k();
                    do {
                        kVar2.a(kVar);
                        if (f56801f.c(this, kVar, kVar2)) {
                            do {
                                j.a(this, nanos);
                                if (!Thread.interrupted()) {
                                    Object obj2 = this.f56803a;
                                    if (obj2 != null) {
                                        return r(obj2);
                                    }
                                    nanos = nanoTime - System.nanoTime();
                                } else {
                                    w(kVar2);
                                    throw new InterruptedException();
                                }
                            } while (nanos >= 1000);
                            w(kVar2);
                        } else {
                            kVar = this.f56805c;
                        }
                    } while (kVar != k.f56827c);
                }
                Object obj3 = this.f56803a;
                Objects.requireNonNull(obj3);
                return r(obj3);
            }
            while (nanos > 0) {
                Object obj4 = this.f56803a;
                if (obj4 != null) {
                    return r(obj4);
                }
                if (!Thread.interrupted()) {
                    nanos = nanoTime - System.nanoTime();
                } else {
                    throw new InterruptedException();
                }
            }
            String aVar = toString();
            String obj5 = timeUnit.toString();
            Locale locale = Locale.ROOT;
            String lowerCase = obj5.toLowerCase(locale);
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

    public boolean isCancelled() {
        return this.f56803a instanceof c;
    }

    public boolean isDone() {
        if (this.f56803a != null) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public void l() {
    }

    /* access modifiers changed from: protected */
    public void t() {
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        if (getClass().getName().startsWith("com.google.common.util.concurrent.")) {
            sb2.append(getClass().getSimpleName());
        } else {
            sb2.append(getClass().getName());
        }
        sb2.append('@');
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append("[status=");
        if (isCancelled()) {
            sb2.append("CANCELLED");
        } else if (isDone()) {
            j(sb2);
        } else {
            k(sb2);
        }
        sb2.append("]");
        return sb2.toString();
    }

    /* access modifiers changed from: protected */
    public String u() {
        if (!(this instanceof ScheduledFuture)) {
            return null;
        }
        return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
    }

    /* access modifiers changed from: protected */
    public boolean x(Object obj) {
        if (obj == null) {
            obj = f56802g;
        }
        if (!f56801f.b(this, (Object) null, obj)) {
            return false;
        }
        p(this, false);
        return true;
    }

    /* access modifiers changed from: protected */
    public boolean y(Throwable th2) {
        if (!f56801f.b(this, (Object) null, new d((Throwable) o.j(th2)))) {
            return false;
        }
        p(this, false);
        return true;
    }

    private static final class e {

        /* renamed from: d  reason: collision with root package name */
        static final e f56812d = new e();

        /* renamed from: a  reason: collision with root package name */
        final Runnable f56813a;

        /* renamed from: b  reason: collision with root package name */
        final Executor f56814b;

        /* renamed from: c  reason: collision with root package name */
        e f56815c;

        e(Runnable runnable, Executor executor) {
            this.f56813a = runnable;
            this.f56814b = executor;
        }

        e() {
            this.f56813a = null;
            this.f56814b = null;
        }
    }

    public Object get() {
        Object obj;
        boolean z10;
        if (!Thread.interrupted()) {
            Object obj2 = this.f56803a;
            if (obj2 != null) {
                return r(obj2);
            }
            k kVar = this.f56805c;
            if (kVar != k.f56827c) {
                k kVar2 = new k();
                do {
                    kVar2.a(kVar);
                    if (f56801f.c(this, kVar, kVar2)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.f56803a;
                                if (obj != null) {
                                    z10 = true;
                                    continue;
                                } else {
                                    z10 = false;
                                    continue;
                                }
                            } else {
                                w(kVar2);
                                throw new InterruptedException();
                            }
                        } while (!z10);
                        return r(obj);
                    }
                    kVar = this.f56805c;
                } while (kVar != k.f56827c);
            }
            Object obj3 = this.f56803a;
            Objects.requireNonNull(obj3);
            return r(obj3);
        }
        throw new InterruptedException();
    }
}
