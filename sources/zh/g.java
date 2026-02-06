package zh;

import Gh.U;
import Gh.W;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import rh.B;
import rh.C;
import rh.C6703A;
import rh.E;
import rh.u;
import sh.C6726e;
import wh.C6776f;
import xh.d;
import xh.e;
import xh.i;
import xh.k;

public final class g implements d {

    /* renamed from: g  reason: collision with root package name */
    public static final a f74138g = new a((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: h  reason: collision with root package name */
    public static final List f74139h = C6726e.w("connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade", ":method", ":path", ":scheme", ":authority");
    /* access modifiers changed from: private */

    /* renamed from: i  reason: collision with root package name */
    public static final List f74140i = C6726e.w("connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade");

    /* renamed from: a  reason: collision with root package name */
    private final C6776f f74141a;

    /* renamed from: b  reason: collision with root package name */
    private final xh.g f74142b;

    /* renamed from: c  reason: collision with root package name */
    private final f f74143c;

    /* renamed from: d  reason: collision with root package name */
    private volatile i f74144d;

    /* renamed from: e  reason: collision with root package name */
    private final B f74145e;

    /* renamed from: f  reason: collision with root package name */
    private volatile boolean f74146f;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final List a(C c10) {
            C6496s.h(c10, "request");
            u f10 = c10.f();
            ArrayList arrayList = new ArrayList(f10.size() + 4);
            arrayList.add(new C6845c(C6845c.f74028g, c10.h()));
            arrayList.add(new C6845c(C6845c.f74029h, i.f73895a.c(c10.l())));
            String d10 = c10.d("Host");
            if (d10 != null) {
                arrayList.add(new C6845c(C6845c.f74031j, d10));
            }
            arrayList.add(new C6845c(C6845c.f74030i, c10.l().s()));
            int size = f10.size();
            for (int i10 = 0; i10 < size; i10++) {
                String g10 = f10.g(i10);
                Locale locale = Locale.US;
                C6496s.g(locale, "US");
                String lowerCase = g10.toLowerCase(locale);
                C6496s.g(lowerCase, "this as java.lang.String).toLowerCase(locale)");
                if (!g.f74139h.contains(lowerCase) || (C6496s.c(lowerCase, "te") && C6496s.c(f10.x(i10), "trailers"))) {
                    arrayList.add(new C6845c(lowerCase, f10.x(i10)));
                }
            }
            return arrayList;
        }

        public final E.a b(u uVar, B b10) {
            C6496s.h(uVar, "headerBlock");
            C6496s.h(b10, "protocol");
            u.a aVar = new u.a();
            int size = uVar.size();
            k kVar = null;
            for (int i10 = 0; i10 < size; i10++) {
                String g10 = uVar.g(i10);
                String x10 = uVar.x(i10);
                if (C6496s.c(g10, ":status")) {
                    k.a aVar2 = k.f73898d;
                    kVar = aVar2.a("HTTP/1.1 " + x10);
                } else if (!g.f74140i.contains(g10)) {
                    aVar.d(g10, x10);
                }
            }
            if (kVar != null) {
                return new E.a().p(b10).g(kVar.f73900b).m(kVar.f73901c).k(aVar.f());
            }
            throw new ProtocolException("Expected ':status' header not present");
        }

        private a() {
        }
    }

    public g(C6703A a10, C6776f fVar, xh.g gVar, f fVar2) {
        C6496s.h(a10, "client");
        C6496s.h(fVar, "connection");
        C6496s.h(gVar, "chain");
        C6496s.h(fVar2, "http2Connection");
        this.f74141a = fVar;
        this.f74142b = gVar;
        this.f74143c = fVar2;
        List E10 = a10.E();
        B b10 = B.H2_PRIOR_KNOWLEDGE;
        this.f74145e = !E10.contains(b10) ? B.HTTP_2 : b10;
    }

    public long a(E e10) {
        C6496s.h(e10, "response");
        if (!e.b(e10)) {
            return 0;
        }
        return C6726e.v(e10);
    }

    public void b() {
        i iVar = this.f74144d;
        C6496s.e(iVar);
        iVar.n().close();
    }

    public U c(C c10, long j10) {
        C6496s.h(c10, "request");
        i iVar = this.f74144d;
        C6496s.e(iVar);
        return iVar.n();
    }

    public void cancel() {
        this.f74146f = true;
        i iVar = this.f74144d;
        if (iVar != null) {
            iVar.f(C6844b.CANCEL);
        }
    }

    public C6776f d() {
        return this.f74141a;
    }

    public E.a e(boolean z10) {
        i iVar = this.f74144d;
        if (iVar != null) {
            E.a b10 = f74138g.b(iVar.C(), this.f74145e);
            if (!z10 || b10.h() != 100) {
                return b10;
            }
            return null;
        }
        throw new IOException("stream wasn't created");
    }

    public void f(C c10) {
        boolean z10;
        C6496s.h(c10, "request");
        if (this.f74144d == null) {
            if (c10.a() != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.f74144d = this.f74143c.A1(f74138g.a(c10), z10);
            if (!this.f74146f) {
                i iVar = this.f74144d;
                C6496s.e(iVar);
                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                iVar.v().g((long) this.f74142b.g(), timeUnit);
                i iVar2 = this.f74144d;
                C6496s.e(iVar2);
                iVar2.E().g((long) this.f74142b.i(), timeUnit);
                return;
            }
            i iVar3 = this.f74144d;
            C6496s.e(iVar3);
            iVar3.f(C6844b.CANCEL);
            throw new IOException("Canceled");
        }
    }

    public void g() {
        this.f74143c.flush();
    }

    public W h(E e10) {
        C6496s.h(e10, "response");
        i iVar = this.f74144d;
        C6496s.e(iVar);
        return iVar.p();
    }
}
