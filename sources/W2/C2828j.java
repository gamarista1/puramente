package w2;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import i2.C2076a;
import i2.H;
import i2.L;
import i2.p;
import java.io.IOException;
import java.util.concurrent.ExecutorService;

/* renamed from: w2.j  reason: case insensitive filesystem */
public final class C2828j {

    /* renamed from: d  reason: collision with root package name */
    public static final c f27757d = g(false, -9223372036854775807L);

    /* renamed from: e  reason: collision with root package name */
    public static final c f27758e = g(true, -9223372036854775807L);

    /* renamed from: f  reason: collision with root package name */
    public static final c f27759f = new c(2, -9223372036854775807L);

    /* renamed from: g  reason: collision with root package name */
    public static final c f27760g = new c(3, -9223372036854775807L);
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final ExecutorService f27761a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public d f27762b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public IOException f27763c;

    /* renamed from: w2.j$b */
    public interface b {
        void m(e eVar, long j10, long j11, boolean z10);

        c q(e eVar, long j10, long j11, IOException iOException, int i10);

        void r(e eVar, long j10, long j11);
    }

    /* renamed from: w2.j$c */
    public static final class c {
        /* access modifiers changed from: private */

        /* renamed from: a  reason: collision with root package name */
        public final int f27764a;
        /* access modifiers changed from: private */

        /* renamed from: b  reason: collision with root package name */
        public final long f27765b;

        public boolean c() {
            int i10 = this.f27764a;
            if (i10 == 0 || i10 == 1) {
                return true;
            }
            return false;
        }

        private c(int i10, long j10) {
            this.f27764a = i10;
            this.f27765b = j10;
        }
    }

    /* renamed from: w2.j$d */
    private final class d extends Handler implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final int f27766a;

        /* renamed from: b  reason: collision with root package name */
        private final e f27767b;

        /* renamed from: c  reason: collision with root package name */
        private final long f27768c;

        /* renamed from: d  reason: collision with root package name */
        private b f27769d;

        /* renamed from: e  reason: collision with root package name */
        private IOException f27770e;

        /* renamed from: f  reason: collision with root package name */
        private int f27771f;

        /* renamed from: g  reason: collision with root package name */
        private Thread f27772g;

        /* renamed from: h  reason: collision with root package name */
        private boolean f27773h;

        /* renamed from: i  reason: collision with root package name */
        private volatile boolean f27774i;

        public d(Looper looper, e eVar, b bVar, int i10, long j10) {
            super(looper);
            this.f27767b = eVar;
            this.f27769d = bVar;
            this.f27766a = i10;
            this.f27768c = j10;
        }

        private void b() {
            this.f27770e = null;
            C2828j.this.f27761a.execute((Runnable) C2076a.e(C2828j.this.f27762b));
        }

        private void c() {
            d unused = C2828j.this.f27762b = null;
        }

        private long d() {
            return (long) Math.min((this.f27771f - 1) * 1000, 5000);
        }

        public void a(boolean z10) {
            this.f27774i = z10;
            this.f27770e = null;
            if (hasMessages(1)) {
                this.f27773h = true;
                removeMessages(1);
                if (!z10) {
                    sendEmptyMessage(2);
                }
            } else {
                synchronized (this) {
                    try {
                        this.f27773h = true;
                        this.f27767b.b();
                        Thread thread = this.f27772g;
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
                ((b) C2076a.e(this.f27769d)).m(this.f27767b, elapsedRealtime, elapsedRealtime - this.f27768c, true);
                this.f27769d = null;
            }
        }

        public void e(int i10) {
            IOException iOException = this.f27770e;
            if (iOException != null && this.f27771f > i10) {
                throw iOException;
            }
        }

        public void f(long j10) {
            boolean z10;
            if (C2828j.this.f27762b == null) {
                z10 = true;
            } else {
                z10 = false;
            }
            C2076a.g(z10);
            d unused = C2828j.this.f27762b = this;
            if (j10 > 0) {
                sendEmptyMessageDelayed(1, j10);
            } else {
                b();
            }
        }

        public void handleMessage(Message message) {
            long j10;
            if (!this.f27774i) {
                int i10 = message.what;
                if (i10 == 1) {
                    b();
                } else if (i10 != 4) {
                    c();
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    long j11 = elapsedRealtime - this.f27768c;
                    b bVar = (b) C2076a.e(this.f27769d);
                    if (this.f27773h) {
                        bVar.m(this.f27767b, elapsedRealtime, j11, false);
                        return;
                    }
                    int i11 = message.what;
                    if (i11 == 2) {
                        try {
                            bVar.r(this.f27767b, elapsedRealtime, j11);
                        } catch (RuntimeException e10) {
                            p.d("LoadTask", "Unexpected exception handling load completed", e10);
                            IOException unused = C2828j.this.f27763c = new h(e10);
                        }
                    } else if (i11 == 3) {
                        IOException iOException = (IOException) message.obj;
                        this.f27770e = iOException;
                        int i12 = this.f27771f + 1;
                        this.f27771f = i12;
                        c q10 = bVar.q(this.f27767b, elapsedRealtime, j11, iOException, i12);
                        if (q10.f27764a == 3) {
                            IOException unused2 = C2828j.this.f27763c = this.f27770e;
                        } else if (q10.f27764a != 2) {
                            if (q10.f27764a == 1) {
                                this.f27771f = 1;
                            }
                            if (q10.f27765b != -9223372036854775807L) {
                                j10 = q10.f27765b;
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
                    z10 = this.f27773h;
                    this.f27772g = Thread.currentThread();
                }
                if (!z10) {
                    H.a("load:" + this.f27767b.getClass().getSimpleName());
                    this.f27767b.a();
                    H.b();
                }
                synchronized (this) {
                    this.f27772g = null;
                    Thread.interrupted();
                }
                if (!this.f27774i) {
                    sendEmptyMessage(2);
                }
            } catch (IOException e10) {
                if (!this.f27774i) {
                    obtainMessage(3, e10).sendToTarget();
                }
            } catch (Exception e11) {
                if (!this.f27774i) {
                    p.d("LoadTask", "Unexpected exception loading stream", e11);
                    obtainMessage(3, new h(e11)).sendToTarget();
                }
            } catch (OutOfMemoryError e12) {
                if (!this.f27774i) {
                    p.d("LoadTask", "OutOfMemory error loading stream", e12);
                    obtainMessage(3, new h(e12)).sendToTarget();
                }
            } catch (Error e13) {
                if (!this.f27774i) {
                    p.d("LoadTask", "Unexpected error loading stream", e13);
                    obtainMessage(4, e13).sendToTarget();
                }
                throw e13;
            } catch (Throwable th2) {
                H.b();
                throw th2;
            }
        }
    }

    /* renamed from: w2.j$e */
    public interface e {
        void a();

        void b();
    }

    /* renamed from: w2.j$f */
    public interface f {
        void i();
    }

    /* renamed from: w2.j$g */
    private static final class g implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        private final f f27776a;

        public g(f fVar) {
            this.f27776a = fVar;
        }

        public void run() {
            this.f27776a.i();
        }
    }

    /* renamed from: w2.j$h */
    public static final class h extends IOException {
        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public h(java.lang.Throwable r4) {
            /*
                r3 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "Unexpected "
                r0.append(r1)
                java.lang.Class r1 = r4.getClass()
                java.lang.String r1 = r1.getSimpleName()
                r0.append(r1)
                java.lang.String r1 = r4.getMessage()
                if (r1 == 0) goto L_0x0031
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = ": "
                r1.append(r2)
                java.lang.String r2 = r4.getMessage()
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                goto L_0x0033
            L_0x0031:
                java.lang.String r1 = ""
            L_0x0033:
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                r3.<init>(r0, r4)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: w2.C2828j.h.<init>(java.lang.Throwable):void");
        }
    }

    public C2828j(String str) {
        this.f27761a = L.M0("ExoPlayer:Loader:" + str);
    }

    public static c g(boolean z10, long j10) {
        return new c(z10 ? 1 : 0, j10);
    }

    public void e() {
        ((d) C2076a.i(this.f27762b)).a(false);
    }

    public void f() {
        this.f27763c = null;
    }

    public boolean h() {
        if (this.f27763c != null) {
            return true;
        }
        return false;
    }

    public boolean i() {
        if (this.f27762b != null) {
            return true;
        }
        return false;
    }

    public void j() {
        k(Integer.MIN_VALUE);
    }

    public void k(int i10) {
        IOException iOException = this.f27763c;
        if (iOException == null) {
            d dVar = this.f27762b;
            if (dVar != null) {
                if (i10 == Integer.MIN_VALUE) {
                    i10 = dVar.f27766a;
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
        d dVar = this.f27762b;
        if (dVar != null) {
            dVar.a(true);
        }
        if (fVar != null) {
            this.f27761a.execute(new g(fVar));
        }
        this.f27761a.shutdown();
    }

    public long n(e eVar, b bVar, int i10) {
        this.f27763c = null;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        new d((Looper) C2076a.i(Looper.myLooper()), eVar, bVar, i10, elapsedRealtime).f(0);
        return elapsedRealtime;
    }
}
