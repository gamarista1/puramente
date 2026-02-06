package yh;

import Gh.C5404e;
import Gh.C5405f;
import Gh.C5406g;
import Gh.C5415p;
import Gh.U;
import Gh.W;
import Gh.X;
import Sg.p;
import com.google.android.gms.common.api.a;
import io.intercom.android.sdk.metrics.MetricTracker;
import java.io.EOFException;
import java.io.IOException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import rh.C;
import rh.C6703A;
import rh.E;
import rh.n;
import rh.u;
import rh.v;
import sh.C6726e;
import wh.C6776f;
import xh.i;
import xh.k;

/* renamed from: yh.b  reason: case insensitive filesystem */
public final class C6827b implements xh.d {

    /* renamed from: h  reason: collision with root package name */
    public static final d f73973h = new d((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final C6703A f73974a;

    /* renamed from: b  reason: collision with root package name */
    private final C6776f f73975b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public final C5406g f73976c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public final C5405f f73977d;
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public int f73978e;
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public final C6826a f73979f;
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public u f73980g;

    /* renamed from: yh.b$a */
    private abstract class a implements W {

        /* renamed from: a  reason: collision with root package name */
        private final C5415p f73981a;

        /* renamed from: b  reason: collision with root package name */
        private boolean f73982b;

        public a() {
            this.f73981a = new C5415p(C6827b.this.f73976c.timeout());
        }

        /* access modifiers changed from: protected */
        public final boolean a() {
            return this.f73982b;
        }

        public final void b() {
            if (C6827b.this.f73978e != 6) {
                if (C6827b.this.f73978e == 5) {
                    C6827b.this.r(this.f73981a);
                    C6827b.this.f73978e = 6;
                    return;
                }
                throw new IllegalStateException("state: " + C6827b.this.f73978e);
            }
        }

        /* access modifiers changed from: protected */
        public final void f(boolean z10) {
            this.f73982b = z10;
        }

        public X timeout() {
            return this.f73981a;
        }

        public long y1(C5404e eVar, long j10) {
            C6496s.h(eVar, "sink");
            try {
                return C6827b.this.f73976c.y1(eVar, j10);
            } catch (IOException e10) {
                C6827b.this.d().z();
                b();
                throw e10;
            }
        }
    }

    /* renamed from: yh.b$b  reason: collision with other inner class name */
    private final class C1079b implements U {

        /* renamed from: a  reason: collision with root package name */
        private final C5415p f73984a;

        /* renamed from: b  reason: collision with root package name */
        private boolean f73985b;

        public C1079b() {
            this.f73984a = new C5415p(C6827b.this.f73977d.timeout());
        }

        public void P(C5404e eVar, long j10) {
            C6496s.h(eVar, "source");
            if (this.f73985b) {
                throw new IllegalStateException(MetricTracker.Action.CLOSED);
            } else if (j10 != 0) {
                C6827b.this.f73977d.e1(j10);
                C6827b.this.f73977d.X("\r\n");
                C6827b.this.f73977d.P(eVar, j10);
                C6827b.this.f73977d.X("\r\n");
            }
        }

        public synchronized void close() {
            if (!this.f73985b) {
                this.f73985b = true;
                C6827b.this.f73977d.X("0\r\n\r\n");
                C6827b.this.r(this.f73984a);
                C6827b.this.f73978e = 3;
            }
        }

        public synchronized void flush() {
            if (!this.f73985b) {
                C6827b.this.f73977d.flush();
            }
        }

        public X timeout() {
            return this.f73984a;
        }
    }

    /* renamed from: yh.b$c */
    private final class c extends a {

        /* renamed from: d  reason: collision with root package name */
        private final v f73987d;

        /* renamed from: e  reason: collision with root package name */
        private long f73988e = -1;

        /* renamed from: f  reason: collision with root package name */
        private boolean f73989f = true;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ C6827b f73990g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(C6827b bVar, v vVar) {
            super();
            C6496s.h(vVar, "url");
            this.f73990g = bVar;
            this.f73987d = vVar;
        }

        private final void n() {
            if (this.f73988e != -1) {
                this.f73990g.f73976c.i0();
            }
            try {
                this.f73988e = this.f73990g.f73976c.v1();
                String obj = p.g1(this.f73990g.f73976c.i0()).toString();
                if (this.f73988e < 0 || (obj.length() > 0 && !p.J(obj, ";", false, 2, (Object) null))) {
                    throw new ProtocolException("expected chunk size and optional extensions but was \"" + this.f73988e + obj + '\"');
                } else if (this.f73988e == 0) {
                    this.f73989f = false;
                    C6827b bVar = this.f73990g;
                    bVar.f73980g = bVar.f73979f.a();
                    C6703A j10 = this.f73990g.f73974a;
                    C6496s.e(j10);
                    n p10 = j10.p();
                    v vVar = this.f73987d;
                    u o10 = this.f73990g.f73980g;
                    C6496s.e(o10);
                    xh.e.f(p10, vVar, o10);
                    b();
                }
            } catch (NumberFormatException e10) {
                throw new ProtocolException(e10.getMessage());
            }
        }

        public void close() {
            if (!a()) {
                if (this.f73989f && !C6726e.s(this, 100, TimeUnit.MILLISECONDS)) {
                    this.f73990g.d().z();
                    b();
                }
                f(true);
            }
        }

        public long y1(C5404e eVar, long j10) {
            C6496s.h(eVar, "sink");
            if (j10 < 0) {
                throw new IllegalArgumentException(("byteCount < 0: " + j10).toString());
            } else if (a()) {
                throw new IllegalStateException(MetricTracker.Action.CLOSED);
            } else if (!this.f73989f) {
                return -1;
            } else {
                long j11 = this.f73988e;
                if (j11 == 0 || j11 == -1) {
                    n();
                    if (!this.f73989f) {
                        return -1;
                    }
                }
                long y12 = super.y1(eVar, Math.min(j10, this.f73988e));
                if (y12 != -1) {
                    this.f73988e -= y12;
                    return y12;
                }
                this.f73990g.d().z();
                ProtocolException protocolException = new ProtocolException("unexpected end of stream");
                b();
                throw protocolException;
            }
        }
    }

    /* renamed from: yh.b$d */
    public static final class d {
        public /* synthetic */ d(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private d() {
        }
    }

    /* renamed from: yh.b$e */
    private final class e extends a {

        /* renamed from: d  reason: collision with root package name */
        private long f73991d;

        public e(long j10) {
            super();
            this.f73991d = j10;
            if (j10 == 0) {
                b();
            }
        }

        public void close() {
            if (!a()) {
                if (this.f73991d != 0 && !C6726e.s(this, 100, TimeUnit.MILLISECONDS)) {
                    C6827b.this.d().z();
                    b();
                }
                f(true);
            }
        }

        public long y1(C5404e eVar, long j10) {
            C6496s.h(eVar, "sink");
            if (j10 < 0) {
                throw new IllegalArgumentException(("byteCount < 0: " + j10).toString());
            } else if (!a()) {
                long j11 = this.f73991d;
                if (j11 == 0) {
                    return -1;
                }
                long y12 = super.y1(eVar, Math.min(j11, j10));
                if (y12 != -1) {
                    long j12 = this.f73991d - y12;
                    this.f73991d = j12;
                    if (j12 == 0) {
                        b();
                    }
                    return y12;
                }
                C6827b.this.d().z();
                ProtocolException protocolException = new ProtocolException("unexpected end of stream");
                b();
                throw protocolException;
            } else {
                throw new IllegalStateException(MetricTracker.Action.CLOSED);
            }
        }
    }

    /* renamed from: yh.b$f */
    private final class f implements U {

        /* renamed from: a  reason: collision with root package name */
        private final C5415p f73993a;

        /* renamed from: b  reason: collision with root package name */
        private boolean f73994b;

        public f() {
            this.f73993a = new C5415p(C6827b.this.f73977d.timeout());
        }

        public void P(C5404e eVar, long j10) {
            C6496s.h(eVar, "source");
            if (!this.f73994b) {
                C6726e.l(eVar.B0(), 0, j10);
                C6827b.this.f73977d.P(eVar, j10);
                return;
            }
            throw new IllegalStateException(MetricTracker.Action.CLOSED);
        }

        public void close() {
            if (!this.f73994b) {
                this.f73994b = true;
                C6827b.this.r(this.f73993a);
                C6827b.this.f73978e = 3;
            }
        }

        public void flush() {
            if (!this.f73994b) {
                C6827b.this.f73977d.flush();
            }
        }

        public X timeout() {
            return this.f73993a;
        }
    }

    /* renamed from: yh.b$g */
    private final class g extends a {

        /* renamed from: d  reason: collision with root package name */
        private boolean f73996d;

        public g() {
            super();
        }

        public void close() {
            if (!a()) {
                if (!this.f73996d) {
                    b();
                }
                f(true);
            }
        }

        public long y1(C5404e eVar, long j10) {
            C6496s.h(eVar, "sink");
            if (j10 < 0) {
                throw new IllegalArgumentException(("byteCount < 0: " + j10).toString());
            } else if (a()) {
                throw new IllegalStateException(MetricTracker.Action.CLOSED);
            } else if (this.f73996d) {
                return -1;
            } else {
                long y12 = super.y1(eVar, j10);
                if (y12 != -1) {
                    return y12;
                }
                this.f73996d = true;
                b();
                return -1;
            }
        }
    }

    public C6827b(C6703A a10, C6776f fVar, C5406g gVar, C5405f fVar2) {
        C6496s.h(fVar, "connection");
        C6496s.h(gVar, "source");
        C6496s.h(fVar2, "sink");
        this.f73974a = a10;
        this.f73975b = fVar;
        this.f73976c = gVar;
        this.f73977d = fVar2;
        this.f73979f = new C6826a(gVar);
    }

    /* access modifiers changed from: private */
    public final void r(C5415p pVar) {
        X i10 = pVar.i();
        pVar.j(X.f63257e);
        i10.a();
        i10.b();
    }

    private final boolean s(C c10) {
        return p.v("chunked", c10.d("Transfer-Encoding"), true);
    }

    private final boolean t(E e10) {
        return p.v("chunked", E.E(e10, "Transfer-Encoding", (String) null, 2, (Object) null), true);
    }

    private final U u() {
        if (this.f73978e == 1) {
            this.f73978e = 2;
            return new C1079b();
        }
        throw new IllegalStateException(("state: " + this.f73978e).toString());
    }

    private final W v(v vVar) {
        if (this.f73978e == 4) {
            this.f73978e = 5;
            return new c(this, vVar);
        }
        throw new IllegalStateException(("state: " + this.f73978e).toString());
    }

    private final W w(long j10) {
        if (this.f73978e == 4) {
            this.f73978e = 5;
            return new e(j10);
        }
        throw new IllegalStateException(("state: " + this.f73978e).toString());
    }

    private final U x() {
        if (this.f73978e == 1) {
            this.f73978e = 2;
            return new f();
        }
        throw new IllegalStateException(("state: " + this.f73978e).toString());
    }

    private final W y() {
        if (this.f73978e == 4) {
            this.f73978e = 5;
            d().z();
            return new g();
        }
        throw new IllegalStateException(("state: " + this.f73978e).toString());
    }

    public final void A(u uVar, String str) {
        C6496s.h(uVar, "headers");
        C6496s.h(str, "requestLine");
        if (this.f73978e == 0) {
            this.f73977d.X(str).X("\r\n");
            int size = uVar.size();
            for (int i10 = 0; i10 < size; i10++) {
                this.f73977d.X(uVar.g(i10)).X(": ").X(uVar.x(i10)).X("\r\n");
            }
            this.f73977d.X("\r\n");
            this.f73978e = 1;
            return;
        }
        throw new IllegalStateException(("state: " + this.f73978e).toString());
    }

    public long a(E e10) {
        C6496s.h(e10, "response");
        if (!xh.e.b(e10)) {
            return 0;
        }
        if (t(e10)) {
            return -1;
        }
        return C6726e.v(e10);
    }

    public void b() {
        this.f73977d.flush();
    }

    public U c(C c10, long j10) {
        C6496s.h(c10, "request");
        if (c10.a() != null && c10.a().isDuplex()) {
            throw new ProtocolException("Duplex connections are not supported for HTTP/1");
        } else if (s(c10)) {
            return u();
        } else {
            if (j10 != -1) {
                return x();
            }
            throw new IllegalStateException("Cannot stream a request body without chunked encoding or a known content length!");
        }
    }

    public void cancel() {
        d().d();
    }

    public C6776f d() {
        return this.f73975b;
    }

    public E.a e(boolean z10) {
        int i10 = this.f73978e;
        if (i10 == 1 || i10 == 2 || i10 == 3) {
            try {
                k a10 = k.f73898d.a(this.f73979f.b());
                E.a k10 = new E.a().p(a10.f73899a).g(a10.f73900b).m(a10.f73901c).k(this.f73979f.a());
                if (z10 && a10.f73900b == 100) {
                    return null;
                }
                int i11 = a10.f73900b;
                if (i11 == 100) {
                    this.f73978e = 3;
                    return k10;
                } else if (102 > i11 || i11 >= 200) {
                    this.f73978e = 4;
                    return k10;
                } else {
                    this.f73978e = 3;
                    return k10;
                }
            } catch (EOFException e10) {
                String q10 = d().A().a().l().q();
                throw new IOException("unexpected end of stream on " + q10, e10);
            }
        } else {
            throw new IllegalStateException(("state: " + this.f73978e).toString());
        }
    }

    public void f(C c10) {
        C6496s.h(c10, "request");
        i iVar = i.f73895a;
        Proxy.Type type = d().A().b().type();
        C6496s.g(type, "connection.route().proxy.type()");
        A(c10.f(), iVar.a(c10, type));
    }

    public void g() {
        this.f73977d.flush();
    }

    public W h(E e10) {
        C6496s.h(e10, "response");
        if (!xh.e.b(e10)) {
            return w(0);
        }
        if (t(e10)) {
            return v(e10.g0().l());
        }
        long v10 = C6726e.v(e10);
        if (v10 != -1) {
            return w(v10);
        }
        return y();
    }

    public final void z(E e10) {
        C6496s.h(e10, "response");
        long v10 = C6726e.v(e10);
        if (v10 != -1) {
            W w10 = w(v10);
            C6726e.M(w10, a.e.API_PRIORITY_OTHER, TimeUnit.MILLISECONDS);
            w10.close();
        }
    }
}
