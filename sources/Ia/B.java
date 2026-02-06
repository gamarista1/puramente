package ia;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import ja.C3645a;
import ja.J;
import ja.M;
import ja.s;
import java.io.IOException;
import java.util.concurrent.ExecutorService;

public final class B implements C {

    /* renamed from: d  reason: collision with root package name */
    public static final c f44362d = h(false, -9223372036854775807L);

    /* renamed from: e  reason: collision with root package name */
    public static final c f44363e = h(true, -9223372036854775807L);

    /* renamed from: f  reason: collision with root package name */
    public static final c f44364f = new c(2, -9223372036854775807L);

    /* renamed from: g  reason: collision with root package name */
    public static final c f44365g = new c(3, -9223372036854775807L);
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final ExecutorService f44366a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public d f44367b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public IOException f44368c;

    public interface b {
        void p(e eVar, long j10, long j11);

        void t(e eVar, long j10, long j11, boolean z10);

        c u(e eVar, long j10, long j11, IOException iOException, int i10);
    }

    public static final class c {
        /* access modifiers changed from: private */

        /* renamed from: a  reason: collision with root package name */
        public final int f44369a;
        /* access modifiers changed from: private */

        /* renamed from: b  reason: collision with root package name */
        public final long f44370b;

        public boolean c() {
            int i10 = this.f44369a;
            if (i10 == 0 || i10 == 1) {
                return true;
            }
            return false;
        }

        private c(int i10, long j10) {
            this.f44369a = i10;
            this.f44370b = j10;
        }
    }

    private final class d extends Handler implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final int f44371a;

        /* renamed from: b  reason: collision with root package name */
        private final e f44372b;

        /* renamed from: c  reason: collision with root package name */
        private final long f44373c;

        /* renamed from: d  reason: collision with root package name */
        private b f44374d;

        /* renamed from: e  reason: collision with root package name */
        private IOException f44375e;

        /* renamed from: f  reason: collision with root package name */
        private int f44376f;

        /* renamed from: g  reason: collision with root package name */
        private Thread f44377g;

        /* renamed from: h  reason: collision with root package name */
        private boolean f44378h;

        /* renamed from: i  reason: collision with root package name */
        private volatile boolean f44379i;

        public d(Looper looper, e eVar, b bVar, int i10, long j10) {
            super(looper);
            this.f44372b = eVar;
            this.f44374d = bVar;
            this.f44371a = i10;
            this.f44373c = j10;
        }

        private void b() {
            this.f44375e = null;
            B.this.f44366a.execute((Runnable) C3645a.e(B.this.f44367b));
        }

        private void c() {
            d unused = B.this.f44367b = null;
        }

        private long d() {
            return (long) Math.min((this.f44376f - 1) * 1000, 5000);
        }

        public void a(boolean z10) {
            this.f44379i = z10;
            this.f44375e = null;
            if (hasMessages(0)) {
                this.f44378h = true;
                removeMessages(0);
                if (!z10) {
                    sendEmptyMessage(1);
                }
            } else {
                synchronized (this) {
                    try {
                        this.f44378h = true;
                        this.f44372b.b();
                        Thread thread = this.f44377g;
                        if (thread != null) {
                            thread.interrupt();
                        }
                    } catch (Throwable th2) {
                        while (true) {
                            throw th2;
                        }
                    }
                }
            }
            if (z10) {
                c();
                long elapsedRealtime = SystemClock.elapsedRealtime();
                ((b) C3645a.e(this.f44374d)).t(this.f44372b, elapsedRealtime, elapsedRealtime - this.f44373c, true);
                this.f44374d = null;
            }
        }

        public void e(int i10) {
            IOException iOException = this.f44375e;
            if (iOException != null && this.f44376f > i10) {
                throw iOException;
            }
        }

        public void f(long j10) {
            boolean z10;
            if (B.this.f44367b == null) {
                z10 = true;
            } else {
                z10 = false;
            }
            C3645a.f(z10);
            d unused = B.this.f44367b = this;
            if (j10 > 0) {
                sendEmptyMessageDelayed(0, j10);
            } else {
                b();
            }
        }

        public void handleMessage(Message message) {
            long j10;
            if (!this.f44379i) {
                int i10 = message.what;
                if (i10 == 0) {
                    b();
                } else if (i10 != 3) {
                    c();
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    long j11 = elapsedRealtime - this.f44373c;
                    b bVar = (b) C3645a.e(this.f44374d);
                    if (this.f44378h) {
                        bVar.t(this.f44372b, elapsedRealtime, j11, false);
                        return;
                    }
                    int i11 = message.what;
                    if (i11 == 1) {
                        try {
                            bVar.p(this.f44372b, elapsedRealtime, j11);
                        } catch (RuntimeException e10) {
                            s.d("LoadTask", "Unexpected exception handling load completed", e10);
                            IOException unused = B.this.f44368c = new h(e10);
                        }
                    } else if (i11 == 2) {
                        IOException iOException = (IOException) message.obj;
                        this.f44375e = iOException;
                        int i12 = this.f44376f + 1;
                        this.f44376f = i12;
                        c u10 = bVar.u(this.f44372b, elapsedRealtime, j11, iOException, i12);
                        if (u10.f44369a == 3) {
                            IOException unused2 = B.this.f44368c = this.f44375e;
                        } else if (u10.f44369a != 2) {
                            if (u10.f44369a == 1) {
                                this.f44376f = 1;
                            }
                            if (u10.f44370b != -9223372036854775807L) {
                                j10 = u10.f44370b;
                            } else {
                                j10 = d();
                            }
                            f(j10);
                        }
                    }
                } else {
                    throw ((Error) message.obj);
                }
            }
        }

        public void run() {
            boolean z10;
            try {
                synchronized (this) {
                    z10 = this.f44378h;
                    this.f44377g = Thread.currentThread();
                }
                if (!z10) {
                    J.a("load:" + this.f44372b.getClass().getSimpleName());
                    this.f44372b.a();
                    J.c();
                }
                synchronized (this) {
                    this.f44377g = null;
                    Thread.interrupted();
                }
                if (!this.f44379i) {
                    sendEmptyMessage(1);
                }
            } catch (IOException e10) {
                if (!this.f44379i) {
                    obtainMessage(2, e10).sendToTarget();
                }
            } catch (Exception e11) {
                if (!this.f44379i) {
                    s.d("LoadTask", "Unexpected exception loading stream", e11);
                    obtainMessage(2, new h(e11)).sendToTarget();
                }
            } catch (OutOfMemoryError e12) {
                if (!this.f44379i) {
                    s.d("LoadTask", "OutOfMemory error loading stream", e12);
                    obtainMessage(2, new h(e12)).sendToTarget();
                }
            } catch (Error e13) {
                if (!this.f44379i) {
                    s.d("LoadTask", "Unexpected error loading stream", e13);
                    obtainMessage(3, e13).sendToTarget();
                }
                throw e13;
            } catch (Throwable th2) {
                J.c();
                throw th2;
            }
        }
    }

    public interface e {
        void a();

        void b();
    }

    public interface f {
        void i();
    }

    private static final class g implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        private final f f44381a;

        public g(f fVar) {
            this.f44381a = fVar;
        }

        public void run() {
            this.f44381a.i();
        }
    }

    public static final class h extends IOException {
        public h(Throwable th2) {
            super("Unexpected " + th2.getClass().getSimpleName() + ": " + th2.getMessage(), th2);
        }
    }

    public B(String str) {
        this.f44366a = M.D0("ExoPlayer:Loader:" + str);
    }

    public static c h(boolean z10, long j10) {
        return new c(z10 ? 1 : 0, j10);
    }

    public void e() {
        k(Integer.MIN_VALUE);
    }

    public void f() {
        ((d) C3645a.h(this.f44367b)).a(false);
    }

    public void g() {
        this.f44368c = null;
    }

    public boolean i() {
        if (this.f44368c != null) {
            return true;
        }
        return false;
    }

    public boolean j() {
        if (this.f44367b != null) {
            return true;
        }
        return false;
    }

    public void k(int i10) {
        IOException iOException = this.f44368c;
        if (iOException == null) {
            d dVar = this.f44367b;
            if (dVar != null) {
                if (i10 == Integer.MIN_VALUE) {
                    i10 = dVar.f44371a;
                }
                dVar.e(i10);
                return;
            }
            return;
        }
        throw iOException;
    }

    public void l() {
        m((f) null);
    }

    public void m(f fVar) {
        d dVar = this.f44367b;
        if (dVar != null) {
            dVar.a(true);
        }
        if (fVar != null) {
            this.f44366a.execute(new g(fVar));
        }
        this.f44366a.shutdown();
    }

    public long n(e eVar, b bVar, int i10) {
        this.f44368c = null;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        new d((Looper) C3645a.h(Looper.myLooper()), eVar, bVar, i10, elapsedRealtime).f(0);
        return elapsedRealtime;
    }
}
