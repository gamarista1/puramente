package wh;

import Fh.d;
import Gh.C5404e;
import Gh.C5413n;
import Gh.C5414o;
import Gh.H;
import Gh.U;
import Gh.W;
import io.intercom.android.sdk.metrics.MetricTracker;
import java.io.IOException;
import java.net.ProtocolException;
import kotlin.jvm.internal.C6496s;
import rh.C;
import rh.D;
import rh.E;
import rh.F;
import rh.r;
import xh.d;
import xh.h;

/* renamed from: wh.c  reason: case insensitive filesystem */
public final class C6773c {

    /* renamed from: a  reason: collision with root package name */
    private final C6775e f73777a;

    /* renamed from: b  reason: collision with root package name */
    private final r f73778b;

    /* renamed from: c  reason: collision with root package name */
    private final C6774d f73779c;

    /* renamed from: d  reason: collision with root package name */
    private final d f73780d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f73781e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f73782f;

    /* renamed from: g  reason: collision with root package name */
    private final C6776f f73783g;

    /* renamed from: wh.c$a */
    private final class a extends C5413n {

        /* renamed from: b  reason: collision with root package name */
        private final long f73784b;

        /* renamed from: c  reason: collision with root package name */
        private boolean f73785c;

        /* renamed from: d  reason: collision with root package name */
        private long f73786d;

        /* renamed from: e  reason: collision with root package name */
        private boolean f73787e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ C6773c f73788f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(C6773c cVar, U u10, long j10) {
            super(u10);
            C6496s.h(u10, "delegate");
            this.f73788f = cVar;
            this.f73784b = j10;
        }

        private final IOException a(IOException iOException) {
            if (this.f73785c) {
                return iOException;
            }
            this.f73785c = true;
            return this.f73788f.a(this.f73786d, false, true, iOException);
        }

        public void P(C5404e eVar, long j10) {
            C6496s.h(eVar, "source");
            if (!this.f73787e) {
                long j11 = this.f73784b;
                if (j11 == -1 || this.f73786d + j10 <= j11) {
                    try {
                        super.P(eVar, j10);
                        this.f73786d += j10;
                    } catch (IOException e10) {
                        throw a(e10);
                    }
                } else {
                    throw new ProtocolException("expected " + this.f73784b + " bytes but received " + (this.f73786d + j10));
                }
            } else {
                throw new IllegalStateException(MetricTracker.Action.CLOSED);
            }
        }

        public void close() {
            if (!this.f73787e) {
                this.f73787e = true;
                long j10 = this.f73784b;
                if (j10 == -1 || this.f73786d == j10) {
                    try {
                        super.close();
                        a((IOException) null);
                    } catch (IOException e10) {
                        throw a(e10);
                    }
                } else {
                    throw new ProtocolException("unexpected end of stream");
                }
            }
        }

        public void flush() {
            try {
                super.flush();
            } catch (IOException e10) {
                throw a(e10);
            }
        }
    }

    /* renamed from: wh.c$b */
    public final class b extends C5414o {

        /* renamed from: b  reason: collision with root package name */
        private final long f73789b;

        /* renamed from: c  reason: collision with root package name */
        private long f73790c;

        /* renamed from: d  reason: collision with root package name */
        private boolean f73791d = true;

        /* renamed from: e  reason: collision with root package name */
        private boolean f73792e;

        /* renamed from: f  reason: collision with root package name */
        private boolean f73793f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ C6773c f73794g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(C6773c cVar, W w10, long j10) {
            super(w10);
            C6496s.h(w10, "delegate");
            this.f73794g = cVar;
            this.f73789b = j10;
            if (j10 == 0) {
                b((IOException) null);
            }
        }

        public final IOException b(IOException iOException) {
            if (this.f73792e) {
                return iOException;
            }
            this.f73792e = true;
            if (iOException == null && this.f73791d) {
                this.f73791d = false;
                this.f73794g.i().w(this.f73794g.g());
            }
            return this.f73794g.a(this.f73790c, true, false, iOException);
        }

        public void close() {
            if (!this.f73793f) {
                this.f73793f = true;
                try {
                    super.close();
                    b((IOException) null);
                } catch (IOException e10) {
                    throw b(e10);
                }
            }
        }

        public long y1(C5404e eVar, long j10) {
            C6496s.h(eVar, "sink");
            if (!this.f73793f) {
                try {
                    long y12 = a().y1(eVar, j10);
                    if (this.f73791d) {
                        this.f73791d = false;
                        this.f73794g.i().w(this.f73794g.g());
                    }
                    if (y12 == -1) {
                        b((IOException) null);
                        return -1;
                    }
                    long j11 = this.f73790c + y12;
                    long j12 = this.f73789b;
                    if (j12 != -1) {
                        if (j11 > j12) {
                            throw new ProtocolException("expected " + this.f73789b + " bytes but received " + j11);
                        }
                    }
                    this.f73790c = j11;
                    if (j11 == j12) {
                        b((IOException) null);
                    }
                    return y12;
                } catch (IOException e10) {
                    throw b(e10);
                }
            } else {
                throw new IllegalStateException(MetricTracker.Action.CLOSED);
            }
        }
    }

    public C6773c(C6775e eVar, r rVar, C6774d dVar, d dVar2) {
        C6496s.h(eVar, "call");
        C6496s.h(rVar, "eventListener");
        C6496s.h(dVar, "finder");
        C6496s.h(dVar2, "codec");
        this.f73777a = eVar;
        this.f73778b = rVar;
        this.f73779c = dVar;
        this.f73780d = dVar2;
        this.f73783g = dVar2.d();
    }

    private final void u(IOException iOException) {
        this.f73782f = true;
        this.f73779c.h(iOException);
        this.f73780d.d().H(this.f73777a, iOException);
    }

    public final IOException a(long j10, boolean z10, boolean z11, IOException iOException) {
        if (iOException != null) {
            u(iOException);
        }
        if (z11) {
            if (iOException != null) {
                this.f73778b.s(this.f73777a, iOException);
            } else {
                this.f73778b.q(this.f73777a, j10);
            }
        }
        if (z10) {
            if (iOException != null) {
                this.f73778b.x(this.f73777a, iOException);
            } else {
                this.f73778b.v(this.f73777a, j10);
            }
        }
        return this.f73777a.u(this, z11, z10, iOException);
    }

    public final void b() {
        this.f73780d.cancel();
    }

    public final U c(C c10, boolean z10) {
        C6496s.h(c10, "request");
        this.f73781e = z10;
        D a10 = c10.a();
        C6496s.e(a10);
        long contentLength = a10.contentLength();
        this.f73778b.r(this.f73777a);
        return new a(this, this.f73780d.c(c10, contentLength), contentLength);
    }

    public final void d() {
        this.f73780d.cancel();
        this.f73777a.u(this, true, true, (IOException) null);
    }

    public final void e() {
        try {
            this.f73780d.b();
        } catch (IOException e10) {
            this.f73778b.s(this.f73777a, e10);
            u(e10);
            throw e10;
        }
    }

    public final void f() {
        try {
            this.f73780d.g();
        } catch (IOException e10) {
            this.f73778b.s(this.f73777a, e10);
            u(e10);
            throw e10;
        }
    }

    public final C6775e g() {
        return this.f73777a;
    }

    public final C6776f h() {
        return this.f73783g;
    }

    public final r i() {
        return this.f73778b;
    }

    public final C6774d j() {
        return this.f73779c;
    }

    public final boolean k() {
        return this.f73782f;
    }

    public final boolean l() {
        return !C6496s.c(this.f73779c.d().l().i(), this.f73783g.A().a().l().i());
    }

    public final boolean m() {
        return this.f73781e;
    }

    public final d.C0935d n() {
        this.f73777a.C();
        return this.f73780d.d().x(this);
    }

    public final void o() {
        this.f73780d.d().z();
    }

    public final void p() {
        this.f73777a.u(this, true, false, (IOException) null);
    }

    public final F q(E e10) {
        C6496s.h(e10, "response");
        try {
            String E10 = E.E(e10, "Content-Type", (String) null, 2, (Object) null);
            long a10 = this.f73780d.a(e10);
            return new h(E10, a10, H.d(new b(this, this.f73780d.h(e10), a10)));
        } catch (IOException e11) {
            this.f73778b.x(this.f73777a, e11);
            u(e11);
            throw e11;
        }
    }

    public final E.a r(boolean z10) {
        try {
            E.a e10 = this.f73780d.e(z10);
            if (e10 != null) {
                e10.l(this);
            }
            return e10;
        } catch (IOException e11) {
            this.f73778b.x(this.f73777a, e11);
            u(e11);
            throw e11;
        }
    }

    public final void s(E e10) {
        C6496s.h(e10, "response");
        this.f73778b.y(this.f73777a, e10);
    }

    public final void t() {
        this.f73778b.z(this.f73777a);
    }

    public final void v() {
        a(-1, true, true, (IOException) null);
    }

    public final void w(C c10) {
        C6496s.h(c10, "request");
        try {
            this.f73778b.u(this.f73777a);
            this.f73780d.f(c10);
            this.f73778b.t(this.f73777a, c10);
        } catch (IOException e10) {
            this.f73778b.s(this.f73777a, e10);
            u(e10);
            throw e10;
        }
    }
}
