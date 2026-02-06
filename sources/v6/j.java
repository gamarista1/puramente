package V6;

import M5.d;
import N5.k;
import U3.f;
import W5.h;
import W5.i;
import W5.l;
import c7.C3189i;
import com.revenuecat.purchases.subscriberattributes.SubscriberAttributeKt;
import d7.C3479a;
import j7.b;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lf.C6514M;

public final class j {

    /* renamed from: h  reason: collision with root package name */
    public static final a f34703h = new a((DefaultConstructorMarker) null);

    /* renamed from: i  reason: collision with root package name */
    private static final Class f34704i = j.class;

    /* renamed from: a  reason: collision with root package name */
    private final k f34705a;

    /* renamed from: b  reason: collision with root package name */
    private final i f34706b;

    /* renamed from: c  reason: collision with root package name */
    private final l f34707c;

    /* renamed from: d  reason: collision with root package name */
    private final Executor f34708d;

    /* renamed from: e  reason: collision with root package name */
    private final Executor f34709e;

    /* renamed from: f  reason: collision with root package name */
    private final t f34710f;

    /* renamed from: g  reason: collision with root package name */
    private final C f34711g;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public j(k kVar, i iVar, l lVar, Executor executor, Executor executor2, t tVar) {
        C6496s.h(kVar, "fileCache");
        C6496s.h(iVar, "pooledByteBufferFactory");
        C6496s.h(lVar, "pooledByteStreams");
        C6496s.h(executor, "readExecutor");
        C6496s.h(executor2, "writeExecutor");
        C6496s.h(tVar, "imageCacheStatsTracker");
        this.f34705a = kVar;
        this.f34706b = iVar;
        this.f34707c = lVar;
        this.f34708d = executor;
        this.f34709e = executor2;
        this.f34710f = tVar;
        C d10 = C.d();
        C6496s.g(d10, "getInstance(...)");
        this.f34711g = d10;
    }

    private final boolean g(d dVar) {
        C3189i c10 = this.f34711g.c(dVar);
        if (c10 != null) {
            c10.close();
            U5.a.y(f34704i, "Found image for %s in staging area", dVar.a());
            this.f34710f.d(dVar);
            return true;
        }
        U5.a.y(f34704i, "Did not find image for %s in staging area", dVar.a());
        this.f34710f.n(dVar);
        try {
            return this.f34705a.d(dVar);
        } catch (Exception unused) {
            return false;
        }
    }

    /* access modifiers changed from: private */
    public static final Void i(Object obj, j jVar) {
        C6496s.h(jVar, "this$0");
        Object e10 = C3479a.e(obj, (String) null);
        try {
            jVar.f34711g.a();
            jVar.f34705a.a();
            C3479a.f(e10);
            return null;
        } catch (Throwable th2) {
            C3479a.f(e10);
            throw th2;
        }
    }

    private final f l(d dVar, C3189i iVar) {
        U5.a.y(f34704i, "Found image for %s in staging area", dVar.a());
        this.f34710f.d(dVar);
        f h10 = f.h(iVar);
        C6496s.g(h10, "forResult(...)");
        return h10;
    }

    private final f n(d dVar, AtomicBoolean atomicBoolean) {
        try {
            return f.b(new f(C3479a.d("BufferedDiskCache_getAsync"), atomicBoolean, this, dVar), this.f34708d);
        } catch (Exception e10) {
            U5.a.H(f34704i, e10, "Failed to schedule disk-cache read for %s", dVar.a());
            return f.g(e10);
        }
    }

    /* access modifiers changed from: private */
    public static final C3189i o(Object obj, AtomicBoolean atomicBoolean, j jVar, d dVar) {
        X5.a U10;
        C6496s.h(atomicBoolean, "$isCancelled");
        C6496s.h(jVar, "this$0");
        C6496s.h(dVar, "$key");
        Object e10 = C3479a.e(obj, (String) null);
        try {
            if (!atomicBoolean.get()) {
                C3189i c10 = jVar.f34711g.c(dVar);
                if (c10 != null) {
                    U5.a.y(f34704i, "Found image for %s in staging area", dVar.a());
                    jVar.f34710f.d(dVar);
                } else {
                    U5.a.y(f34704i, "Did not find image for %s in staging area", dVar.a());
                    jVar.f34710f.n(dVar);
                    try {
                        h r10 = jVar.r(dVar);
                        if (r10 == null) {
                            C3479a.f(e10);
                            return null;
                        }
                        U10 = X5.a.U(r10);
                        C6496s.g(U10, "of(...)");
                        C3189i iVar = new C3189i(U10);
                        X5.a.E(U10);
                        c10 = iVar;
                    } catch (Exception unused) {
                        C3479a.f(e10);
                        return null;
                    } catch (Throwable th2) {
                        X5.a.E(U10);
                        throw th2;
                    }
                }
                if (!Thread.interrupted()) {
                    C3479a.f(e10);
                    return c10;
                }
                U5.a.x(f34704i, "Host thread was interrupted, decreasing reference count");
                c10.close();
                throw new InterruptedException();
            }
            throw new CancellationException();
        } catch (Throwable th3) {
            C3479a.f(e10);
            throw th3;
        }
    }

    /* access modifiers changed from: private */
    public static final void q(Object obj, j jVar, d dVar, C3189i iVar) {
        C6496s.h(jVar, "this$0");
        C6496s.h(dVar, "$key");
        Object e10 = C3479a.e(obj, (String) null);
        try {
            jVar.u(dVar, iVar);
            C c10 = jVar.f34711g;
            C6496s.e(iVar);
            c10.h(dVar, iVar);
            C3189i.f(iVar);
            C3479a.f(e10);
        } catch (Throwable th2) {
            C c11 = jVar.f34711g;
            C6496s.e(iVar);
            c11.h(dVar, iVar);
            C3189i.f(iVar);
            C3479a.f(e10);
            throw th2;
        }
    }

    private final h r(d dVar) {
        InputStream a10;
        try {
            Class cls = f34704i;
            U5.a.y(cls, "Disk cache read for %s", dVar.a());
            L5.a g10 = this.f34705a.g(dVar);
            if (g10 == null) {
                U5.a.y(cls, "Disk cache miss for %s", dVar.a());
                this.f34710f.e(dVar);
                return null;
            }
            U5.a.y(cls, "Found entry in disk cache for %s", dVar.a());
            this.f34710f.l(dVar);
            a10 = g10.a();
            h b10 = this.f34706b.b(a10, (int) g10.size());
            a10.close();
            U5.a.y(cls, "Successful read from disk cache for %s", dVar.a());
            return b10;
        } catch (IOException e10) {
            U5.a.H(f34704i, e10, "Exception reading from cache for %s", dVar.a());
            this.f34710f.g(dVar);
            throw e10;
        } catch (Throwable th2) {
            a10.close();
            throw th2;
        }
    }

    /* access modifiers changed from: private */
    public static final Void t(Object obj, j jVar, d dVar) {
        C6496s.h(jVar, "this$0");
        C6496s.h(dVar, "$key");
        Object e10 = C3479a.e(obj, (String) null);
        try {
            jVar.f34711g.g(dVar);
            jVar.f34705a.c(dVar);
            C3479a.f(e10);
            return null;
        } catch (Throwable th2) {
            C3479a.f(e10);
            throw th2;
        }
    }

    private final void u(d dVar, C3189i iVar) {
        Class cls = f34704i;
        U5.a.y(cls, "About to write to disk-cache for key %s", dVar.a());
        try {
            this.f34705a.e(dVar, new i(iVar, this));
            this.f34710f.k(dVar);
            U5.a.y(cls, "Successful disk-cache write for key %s", dVar.a());
        } catch (IOException e10) {
            U5.a.H(f34704i, e10, "Failed to write to disk-cache for key %s", dVar.a());
        }
    }

    /* access modifiers changed from: private */
    public static final void v(C3189i iVar, j jVar, OutputStream outputStream) {
        C6496s.h(jVar, "this$0");
        C6496s.h(outputStream, "os");
        C6496s.e(iVar);
        InputStream E10 = iVar.E();
        if (E10 != null) {
            jVar.f34707c.a(E10, outputStream);
            return;
        }
        throw new IllegalStateException("Required value was null.");
    }

    public final void f(d dVar) {
        C6496s.h(dVar, SubscriberAttributeKt.JSON_NAME_KEY);
        this.f34705a.f(dVar);
    }

    public final f h() {
        this.f34711g.a();
        try {
            return f.b(new h(C3479a.d("BufferedDiskCache_clearAll"), this), this.f34709e);
        } catch (Exception e10) {
            U5.a.H(f34704i, e10, "Failed to schedule disk-cache clear", new Object[0]);
            return f.g(e10);
        }
    }

    public final boolean j(d dVar) {
        C6496s.h(dVar, SubscriberAttributeKt.JSON_NAME_KEY);
        if (this.f34711g.b(dVar) || this.f34705a.b(dVar)) {
            return true;
        }
        return false;
    }

    public final boolean k(d dVar) {
        C6496s.h(dVar, SubscriberAttributeKt.JSON_NAME_KEY);
        if (j(dVar)) {
            return true;
        }
        return g(dVar);
    }

    public final f m(d dVar, AtomicBoolean atomicBoolean) {
        f fVar;
        f l10;
        C6496s.h(dVar, SubscriberAttributeKt.JSON_NAME_KEY);
        C6496s.h(atomicBoolean, "isCancelled");
        if (!b.d()) {
            C3189i c10 = this.f34711g.c(dVar);
            if (c10 == null || (l10 = l(dVar, c10)) == null) {
                return n(dVar, atomicBoolean);
            }
            return l10;
        }
        b.a("BufferedDiskCache#get");
        try {
            C3189i c11 = this.f34711g.c(dVar);
            if (c11 != null) {
                fVar = l(dVar, c11);
                if (fVar == null) {
                }
                b.b();
                return fVar;
            }
            fVar = n(dVar, atomicBoolean);
            b.b();
            return fVar;
        } catch (Throwable th2) {
            b.b();
            throw th2;
        }
    }

    public final void p(d dVar, C3189i iVar) {
        C3189i b10;
        C6496s.h(dVar, SubscriberAttributeKt.JSON_NAME_KEY);
        C6496s.h(iVar, "encodedImage");
        if (b.d()) {
            b.a("BufferedDiskCache#put");
            try {
                if (C3189i.h0(iVar)) {
                    this.f34711g.f(dVar, iVar);
                    b10 = C3189i.b(iVar);
                    this.f34709e.execute(new e(C3479a.d("BufferedDiskCache_putAsync"), this, dVar, b10));
                    C6514M m10 = C6514M.f71813a;
                    b.b();
                    return;
                }
                throw new IllegalStateException("Check failed.");
            } catch (Exception e10) {
                U5.a.H(f34704i, e10, "Failed to schedule disk-cache write for %s", dVar.a());
                this.f34711g.h(dVar, iVar);
                C3189i.f(b10);
            } catch (Throwable th2) {
                b.b();
                throw th2;
            }
        } else if (C3189i.h0(iVar)) {
            this.f34711g.f(dVar, iVar);
            C3189i b11 = C3189i.b(iVar);
            try {
                this.f34709e.execute(new e(C3479a.d("BufferedDiskCache_putAsync"), this, dVar, b11));
            } catch (Exception e11) {
                U5.a.H(f34704i, e11, "Failed to schedule disk-cache write for %s", dVar.a());
                this.f34711g.h(dVar, iVar);
                C3189i.f(b11);
            }
        } else {
            throw new IllegalStateException("Check failed.");
        }
    }

    public final f s(d dVar) {
        C6496s.h(dVar, SubscriberAttributeKt.JSON_NAME_KEY);
        this.f34711g.g(dVar);
        try {
            return f.b(new g(C3479a.d("BufferedDiskCache_remove"), this, dVar), this.f34709e);
        } catch (Exception e10) {
            U5.a.H(f34704i, e10, "Failed to schedule disk-cache remove for %s", dVar.a());
            return f.g(e10);
        }
    }
}
