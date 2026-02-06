package retrofit2;

import Gh.C5404e;
import Gh.C5406g;
import Gh.C5414o;
import Gh.H;
import Gh.W;
import Gh.X;
import com.google.firebase.perf.network.FirebasePerfOkHttpClient;
import java.io.IOException;
import java.util.Objects;
import rh.C;
import rh.C6708e;
import rh.C6709f;
import rh.E;
import rh.F;
import rh.y;

final class v implements C6671d {

    /* renamed from: a  reason: collision with root package name */
    private final E f72931a;

    /* renamed from: b  reason: collision with root package name */
    private final Object f72932b;

    /* renamed from: c  reason: collision with root package name */
    private final Object[] f72933c;

    /* renamed from: d  reason: collision with root package name */
    private final C6708e.a f72934d;

    /* renamed from: e  reason: collision with root package name */
    private final C6675h f72935e;

    /* renamed from: f  reason: collision with root package name */
    private volatile boolean f72936f;

    /* renamed from: g  reason: collision with root package name */
    private C6708e f72937g;

    /* renamed from: h  reason: collision with root package name */
    private Throwable f72938h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f72939i;

    class a implements C6709f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C6673f f72940a;

        a(C6673f fVar) {
            this.f72940a = fVar;
        }

        private void a(Throwable th2) {
            try {
                this.f72940a.onFailure(v.this, th2);
            } catch (Throwable th3) {
                K.t(th3);
                th3.printStackTrace();
            }
        }

        public void onFailure(C6708e eVar, IOException iOException) {
            a(iOException);
        }

        public void onResponse(C6708e eVar, E e10) {
            try {
                try {
                    this.f72940a.onResponse(v.this, v.this.e(e10));
                } catch (Throwable th2) {
                    K.t(th2);
                    th2.printStackTrace();
                }
            } catch (Throwable th3) {
                K.t(th3);
                a(th3);
            }
        }
    }

    static final class b extends F {

        /* renamed from: c  reason: collision with root package name */
        private final F f72942c;

        /* renamed from: d  reason: collision with root package name */
        private final C5406g f72943d;

        /* renamed from: e  reason: collision with root package name */
        IOException f72944e;

        class a extends C5414o {
            a(W w10) {
                super(w10);
            }

            public long y1(C5404e eVar, long j10) {
                try {
                    return super.y1(eVar, j10);
                } catch (IOException e10) {
                    b.this.f72944e = e10;
                    throw e10;
                }
            }
        }

        b(F f10) {
            this.f72942c = f10;
            this.f72943d = H.d(new a(f10.y()));
        }

        /* access modifiers changed from: package-private */
        public void F() {
            IOException iOException = this.f72944e;
            if (iOException != null) {
                throw iOException;
            }
        }

        public void close() {
            this.f72942c.close();
        }

        public long o() {
            return this.f72942c.o();
        }

        public y q() {
            return this.f72942c.q();
        }

        public C5406g y() {
            return this.f72943d;
        }
    }

    static final class c extends F {

        /* renamed from: c  reason: collision with root package name */
        private final y f72946c;

        /* renamed from: d  reason: collision with root package name */
        private final long f72947d;

        c(y yVar, long j10) {
            this.f72946c = yVar;
            this.f72947d = j10;
        }

        public long o() {
            return this.f72947d;
        }

        public y q() {
            return this.f72946c;
        }

        public C5406g y() {
            throw new IllegalStateException("Cannot read raw response body of a converted body.");
        }
    }

    v(E e10, Object obj, Object[] objArr, C6708e.a aVar, C6675h hVar) {
        this.f72931a = e10;
        this.f72932b = obj;
        this.f72933c = objArr;
        this.f72934d = aVar;
        this.f72935e = hVar;
    }

    private C6708e c() {
        C6708e a10 = this.f72934d.a(this.f72931a.a(this.f72932b, this.f72933c));
        if (a10 != null) {
            return a10;
        }
        throw new NullPointerException("Call.Factory returned null.");
    }

    private C6708e d() {
        C6708e eVar = this.f72937g;
        if (eVar != null) {
            return eVar;
        }
        Throwable th2 = this.f72938h;
        if (th2 == null) {
            try {
                C6708e c10 = c();
                this.f72937g = c10;
                return c10;
            } catch (IOException | Error | RuntimeException e10) {
                K.t(e10);
                this.f72938h = e10;
                throw e10;
            }
        } else if (th2 instanceof IOException) {
            throw ((IOException) th2);
        } else if (th2 instanceof RuntimeException) {
            throw ((RuntimeException) th2);
        } else {
            throw ((Error) th2);
        }
    }

    /* renamed from: a */
    public v clone() {
        return new v(this.f72931a, this.f72932b, this.f72933c, this.f72934d, this.f72935e);
    }

    public void cancel() {
        C6708e eVar;
        this.f72936f = true;
        synchronized (this) {
            eVar = this.f72937g;
        }
        if (eVar != null) {
            eVar.cancel();
        }
    }

    /* access modifiers changed from: package-private */
    public F e(E e10) {
        F a10 = e10.a();
        E c10 = e10.T().b(new c(a10.q(), a10.o())).c();
        int o10 = c10.o();
        if (o10 < 200 || o10 >= 300) {
            try {
                return F.c(K.a(a10), c10);
            } finally {
                a10.close();
            }
        } else if (o10 == 204 || o10 == 205) {
            a10.close();
            return F.h((Object) null, c10);
        } else {
            b bVar = new b(a10);
            try {
                return F.h(this.f72935e.convert(bVar), c10);
            } catch (RuntimeException e11) {
                bVar.F();
                throw e11;
            }
        }
    }

    public void enqueue(C6673f fVar) {
        C6708e eVar;
        Throwable th2;
        Objects.requireNonNull(fVar, "callback == null");
        synchronized (this) {
            try {
                if (!this.f72939i) {
                    this.f72939i = true;
                    eVar = this.f72937g;
                    th2 = this.f72938h;
                    if (eVar == null && th2 == null) {
                        C6708e c10 = c();
                        this.f72937g = c10;
                        eVar = c10;
                    }
                } else {
                    throw new IllegalStateException("Already executed.");
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        if (th2 != null) {
            fVar.onFailure(this, th2);
            return;
        }
        if (this.f72936f) {
            eVar.cancel();
        }
        FirebasePerfOkHttpClient.enqueue(eVar, new a(fVar));
    }

    public boolean isCanceled() {
        boolean z10 = true;
        if (this.f72936f) {
            return true;
        }
        synchronized (this) {
            try {
                C6708e eVar = this.f72937g;
                if (eVar == null || !eVar.isCanceled()) {
                    z10 = false;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return z10;
    }

    public synchronized boolean isExecuted() {
        return this.f72939i;
    }

    public synchronized C request() {
        try {
        } catch (IOException e10) {
            throw new RuntimeException("Unable to create request.", e10);
        }
        return d().request();
    }

    public synchronized X timeout() {
        try {
        } catch (IOException e10) {
            throw new RuntimeException("Unable to create call.", e10);
        }
        return d().timeout();
    }
}
