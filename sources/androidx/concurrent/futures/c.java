package androidx.concurrent.futures;

import com.google.common.util.concurrent.g;
import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

public abstract class c {

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        Object f14366a;

        /* renamed from: b  reason: collision with root package name */
        d f14367b;

        /* renamed from: c  reason: collision with root package name */
        private d f14368c = d.A();

        /* renamed from: d  reason: collision with root package name */
        private boolean f14369d;

        a() {
        }

        private void d() {
            this.f14366a = null;
            this.f14367b = null;
            this.f14368c = null;
        }

        /* access modifiers changed from: package-private */
        public void a() {
            this.f14366a = null;
            this.f14367b = null;
            this.f14368c.u((Object) null);
        }

        public boolean b(Object obj) {
            boolean z10 = true;
            this.f14369d = true;
            d dVar = this.f14367b;
            if (dVar == null || !dVar.b(obj)) {
                z10 = false;
            }
            if (z10) {
                d();
            }
            return z10;
        }

        public boolean c() {
            boolean z10 = true;
            this.f14369d = true;
            d dVar = this.f14367b;
            if (dVar == null || !dVar.a(true)) {
                z10 = false;
            }
            if (z10) {
                d();
            }
            return z10;
        }

        public boolean e(Throwable th2) {
            boolean z10 = true;
            this.f14369d = true;
            d dVar = this.f14367b;
            if (dVar == null || !dVar.c(th2)) {
                z10 = false;
            }
            if (z10) {
                d();
            }
            return z10;
        }

        /* access modifiers changed from: protected */
        public void finalize() {
            d dVar;
            d dVar2 = this.f14367b;
            if (dVar2 != null && !dVar2.isDone()) {
                dVar2.c(new b("The completer object was garbage collected - this future would otherwise never complete. The tag was: " + this.f14366a));
            }
            if (!this.f14369d && (dVar = this.f14368c) != null) {
                dVar.u((Object) null);
            }
        }
    }

    static final class b extends Throwable {
        b(String str) {
            super(str);
        }

        public synchronized Throwable fillInStackTrace() {
            return this;
        }
    }

    /* renamed from: androidx.concurrent.futures.c$c  reason: collision with other inner class name */
    public interface C0275c {
        Object a(a aVar);
    }

    private static final class d implements g {

        /* renamed from: a  reason: collision with root package name */
        final WeakReference f14370a;

        /* renamed from: b  reason: collision with root package name */
        private final a f14371b = new a();

        class a extends a {
            a() {
            }

            /* access modifiers changed from: protected */
            public String r() {
                a aVar = (a) d.this.f14370a.get();
                if (aVar == null) {
                    return "Completer object has been garbage collected, future will fail soon";
                }
                return "tag=[" + aVar.f14366a + "]";
            }
        }

        d(a aVar) {
            this.f14370a = new WeakReference(aVar);
        }

        /* access modifiers changed from: package-private */
        public boolean a(boolean z10) {
            return this.f14371b.cancel(z10);
        }

        /* access modifiers changed from: package-private */
        public boolean b(Object obj) {
            return this.f14371b.u(obj);
        }

        /* access modifiers changed from: package-private */
        public boolean c(Throwable th2) {
            return this.f14371b.x(th2);
        }

        public boolean cancel(boolean z10) {
            a aVar = (a) this.f14370a.get();
            boolean cancel = this.f14371b.cancel(z10);
            if (cancel && aVar != null) {
                aVar.a();
            }
            return cancel;
        }

        public void e(Runnable runnable, Executor executor) {
            this.f14371b.e(runnable, executor);
        }

        public Object get() {
            return this.f14371b.get();
        }

        public boolean isCancelled() {
            return this.f14371b.isCancelled();
        }

        public boolean isDone() {
            return this.f14371b.isDone();
        }

        public String toString() {
            return this.f14371b.toString();
        }

        public Object get(long j10, TimeUnit timeUnit) {
            return this.f14371b.get(j10, timeUnit);
        }
    }

    public static g a(C0275c cVar) {
        a aVar = new a();
        d dVar = new d(aVar);
        aVar.f14367b = dVar;
        aVar.f14366a = cVar.getClass();
        try {
            Object a10 = cVar.a(aVar);
            if (a10 != null) {
                aVar.f14366a = a10;
            }
        } catch (Exception e10) {
            dVar.c(e10);
        }
        return dVar;
    }
}
