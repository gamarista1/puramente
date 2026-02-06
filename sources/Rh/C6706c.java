package rh;

import Bh.j;
import Gh.C5404e;
import Gh.C5405f;
import Gh.C5406g;
import Gh.C5407h;
import Gh.C5413n;
import Gh.C5414o;
import Gh.H;
import Gh.W;
import Sg.p;
import com.adjust.sdk.Constants;
import java.io.Closeable;
import java.io.File;
import java.io.Flushable;
import java.io.IOException;
import java.security.cert.Certificate;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.U;
import lf.C6514M;
import mf.C6565s;
import mf.Y;
import rh.C;
import rh.E;
import rh.u;
import sh.C6726e;
import uh.C6748b;
import uh.C6749c;
import uh.d;
import vh.C6760e;
import wf.C6763c;
import xh.f;
import xh.k;

/* renamed from: rh.c  reason: case insensitive filesystem */
public final class C6706c implements Closeable, Flushable {

    /* renamed from: g  reason: collision with root package name */
    public static final b f73215g = new b((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final uh.d f73216a;

    /* renamed from: b  reason: collision with root package name */
    private int f73217b;

    /* renamed from: c  reason: collision with root package name */
    private int f73218c;

    /* renamed from: d  reason: collision with root package name */
    private int f73219d;

    /* renamed from: e  reason: collision with root package name */
    private int f73220e;

    /* renamed from: f  reason: collision with root package name */
    private int f73221f;

    /* renamed from: rh.c$a */
    private static final class a extends F {

        /* renamed from: c  reason: collision with root package name */
        private final d.C1074d f73222c;

        /* renamed from: d  reason: collision with root package name */
        private final String f73223d;

        /* renamed from: e  reason: collision with root package name */
        private final String f73224e;

        /* renamed from: f  reason: collision with root package name */
        private final C5406g f73225f;

        /* renamed from: rh.c$a$a  reason: collision with other inner class name */
        public static final class C1062a extends C5414o {

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ a f73226b;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C1062a(W w10, a aVar) {
                super(w10);
                this.f73226b = aVar;
            }

            public void close() {
                this.f73226b.F().close();
                super.close();
            }
        }

        public a(d.C1074d dVar, String str, String str2) {
            C6496s.h(dVar, "snapshot");
            this.f73222c = dVar;
            this.f73223d = str;
            this.f73224e = str2;
            this.f73225f = H.d(new C1062a(dVar.b(1), this));
        }

        public final d.C1074d F() {
            return this.f73222c;
        }

        public long o() {
            String str = this.f73224e;
            if (str != null) {
                return C6726e.X(str, -1);
            }
            return -1;
        }

        public y q() {
            String str = this.f73223d;
            if (str != null) {
                return y.f73499e.b(str);
            }
            return null;
        }

        public C5406g y() {
            return this.f73225f;
        }
    }

    /* renamed from: rh.c$b */
    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final Set d(u uVar) {
            int size = uVar.size();
            TreeSet treeSet = null;
            for (int i10 = 0; i10 < size; i10++) {
                if (p.v("Vary", uVar.g(i10), true)) {
                    String x10 = uVar.x(i10);
                    if (treeSet == null) {
                        treeSet = new TreeSet(p.x(U.f71764a));
                    }
                    for (String g12 : p.E0(x10, new char[]{','}, false, 0, 6, (Object) null)) {
                        treeSet.add(p.g1(g12).toString());
                    }
                }
            }
            if (treeSet == null) {
                return Y.e();
            }
            return treeSet;
        }

        private final u e(u uVar, u uVar2) {
            Set d10 = d(uVar2);
            if (d10.isEmpty()) {
                return C6726e.f73541b;
            }
            u.a aVar = new u.a();
            int size = uVar.size();
            for (int i10 = 0; i10 < size; i10++) {
                String g10 = uVar.g(i10);
                if (d10.contains(g10)) {
                    aVar.a(g10, uVar.x(i10));
                }
            }
            return aVar.f();
        }

        public final boolean a(E e10) {
            C6496s.h(e10, "<this>");
            return d(e10.F()).contains("*");
        }

        public final String b(v vVar) {
            C6496s.h(vVar, "url");
            return C5407h.f63295d.d(vVar.toString()).D().r();
        }

        public final int c(C5406g gVar) {
            C6496s.h(gVar, "source");
            try {
                long O02 = gVar.O0();
                String i02 = gVar.i0();
                if (O02 >= 0 && O02 <= 2147483647L && i02.length() <= 0) {
                    return (int) O02;
                }
                throw new IOException("expected an int but was \"" + O02 + i02 + '\"');
            } catch (NumberFormatException e10) {
                throw new IOException(e10.getMessage());
            }
        }

        public final u f(E e10) {
            C6496s.h(e10, "<this>");
            E Q10 = e10.Q();
            C6496s.e(Q10);
            return e(Q10.g0().f(), e10.F());
        }

        public final boolean g(E e10, u uVar, C c10) {
            C6496s.h(e10, "cachedResponse");
            C6496s.h(uVar, "cachedRequest");
            C6496s.h(c10, "newRequest");
            Iterable<String> d10 = d(e10.F());
            if ((d10 instanceof Collection) && ((Collection) d10).isEmpty()) {
                return true;
            }
            for (String str : d10) {
                if (!C6496s.c(uVar.z(str), c10.e(str))) {
                    return false;
                }
            }
            return true;
        }

        private b() {
        }
    }

    /* renamed from: rh.c$d */
    private final class d implements C6748b {
        /* access modifiers changed from: private */

        /* renamed from: a  reason: collision with root package name */
        public final d.b f73240a;

        /* renamed from: b  reason: collision with root package name */
        private final Gh.U f73241b;

        /* renamed from: c  reason: collision with root package name */
        private final Gh.U f73242c;

        /* renamed from: d  reason: collision with root package name */
        private boolean f73243d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ C6706c f73244e;

        /* renamed from: rh.c$d$a */
        public static final class a extends C5413n {

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ C6706c f73245b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ d f73246c;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(C6706c cVar, d dVar, Gh.U u10) {
                super(u10);
                this.f73245b = cVar;
                this.f73246c = dVar;
            }

            public void close() {
                C6706c cVar = this.f73245b;
                d dVar = this.f73246c;
                synchronized (cVar) {
                    if (!dVar.d()) {
                        dVar.e(true);
                        cVar.v(cVar.n() + 1);
                        super.close();
                        this.f73246c.f73240a.b();
                    }
                }
            }
        }

        public d(C6706c cVar, d.b bVar) {
            C6496s.h(bVar, "editor");
            this.f73244e = cVar;
            this.f73240a = bVar;
            Gh.U f10 = bVar.f(1);
            this.f73241b = f10;
            this.f73242c = new a(cVar, this, f10);
        }

        public void a() {
            C6706c cVar = this.f73244e;
            synchronized (cVar) {
                if (!this.f73243d) {
                    this.f73243d = true;
                    cVar.t(cVar.f() + 1);
                    C6726e.m(this.f73241b);
                    try {
                        this.f73240a.a();
                    } catch (IOException unused) {
                    }
                }
            }
        }

        public Gh.U b() {
            return this.f73242c;
        }

        public final boolean d() {
            return this.f73243d;
        }

        public final void e(boolean z10) {
            this.f73243d = z10;
        }
    }

    public C6706c(File file, long j10, Ah.a aVar) {
        C6496s.h(file, "directory");
        C6496s.h(aVar, "fileSystem");
        this.f73216a = new uh.d(aVar, file, 201105, 2, j10, C6760e.f73695i);
    }

    private final void a(d.b bVar) {
        if (bVar != null) {
            try {
                bVar.a();
            } catch (IOException unused) {
            }
        }
    }

    public final synchronized void E(C6749c cVar) {
        try {
            C6496s.h(cVar, "cacheStrategy");
            this.f73221f++;
            if (cVar.b() != null) {
                this.f73219d++;
            } else if (cVar.a() != null) {
                this.f73220e++;
            }
        } catch (Throwable th2) {
            while (true) {
                throw th2;
            }
        }
    }

    public final void F(E e10, E e11) {
        d.b bVar;
        C6496s.h(e10, "cached");
        C6496s.h(e11, "network");
        C1063c cVar = new C1063c(e11);
        F a10 = e10.a();
        C6496s.f(a10, "null cannot be cast to non-null type okhttp3.Cache.CacheResponseBody");
        try {
            bVar = ((a) a10).F().a();
            if (bVar != null) {
                try {
                    cVar.f(bVar);
                    bVar.b();
                } catch (IOException unused) {
                }
            }
        } catch (IOException unused2) {
            bVar = null;
            a(bVar);
        }
    }

    public final E b(C c10) {
        C6496s.h(c10, "request");
        try {
            d.C1074d Q10 = this.f73216a.Q(f73215g.b(c10.l()));
            if (Q10 == null) {
                return null;
            }
            try {
                C1063c cVar = new C1063c(Q10.b(0));
                E d10 = cVar.d(Q10);
                if (cVar.b(c10, d10)) {
                    return d10;
                }
                F a10 = d10.a();
                if (a10 != null) {
                    C6726e.m(a10);
                }
                return null;
            } catch (IOException unused) {
                C6726e.m(Q10);
                return null;
            }
        } catch (IOException unused2) {
            return null;
        }
    }

    public void close() {
        this.f73216a.close();
    }

    public final int f() {
        return this.f73218c;
    }

    public void flush() {
        this.f73216a.flush();
    }

    public final int n() {
        return this.f73217b;
    }

    public final C6748b o(E e10) {
        d.b bVar;
        C6496s.h(e10, "response");
        String h10 = e10.g0().h();
        if (f.f73882a.a(e10.g0().h())) {
            try {
                q(e10.g0());
            } catch (IOException unused) {
            }
            return null;
        } else if (!C6496s.c(h10, "GET")) {
            return null;
        } else {
            b bVar2 = f73215g;
            if (bVar2.a(e10)) {
                return null;
            }
            C1063c cVar = new C1063c(e10);
            try {
                bVar = uh.d.M(this.f73216a, bVar2.b(e10.g0().l()), 0, 2, (Object) null);
                if (bVar == null) {
                    return null;
                }
                try {
                    cVar.f(bVar);
                    return new d(this, bVar);
                } catch (IOException unused2) {
                    a(bVar);
                    return null;
                }
            } catch (IOException unused3) {
                bVar = null;
                a(bVar);
                return null;
            }
        }
    }

    public final void q(C c10) {
        C6496s.h(c10, "request");
        this.f73216a.E0(f73215g.b(c10.l()));
    }

    public final void t(int i10) {
        this.f73218c = i10;
    }

    public final void v(int i10) {
        this.f73217b = i10;
    }

    public final synchronized void y() {
        this.f73220e++;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C6706c(File file, long j10) {
        this(file, j10, Ah.a.f62437b);
        C6496s.h(file, "directory");
    }

    /* renamed from: rh.c$c  reason: collision with other inner class name */
    private static final class C1063c {

        /* renamed from: k  reason: collision with root package name */
        public static final a f73227k = new a((DefaultConstructorMarker) null);

        /* renamed from: l  reason: collision with root package name */
        private static final String f73228l;

        /* renamed from: m  reason: collision with root package name */
        private static final String f73229m;

        /* renamed from: a  reason: collision with root package name */
        private final v f73230a;

        /* renamed from: b  reason: collision with root package name */
        private final u f73231b;

        /* renamed from: c  reason: collision with root package name */
        private final String f73232c;

        /* renamed from: d  reason: collision with root package name */
        private final B f73233d;

        /* renamed from: e  reason: collision with root package name */
        private final int f73234e;

        /* renamed from: f  reason: collision with root package name */
        private final String f73235f;

        /* renamed from: g  reason: collision with root package name */
        private final u f73236g;

        /* renamed from: h  reason: collision with root package name */
        private final t f73237h;

        /* renamed from: i  reason: collision with root package name */
        private final long f73238i;

        /* renamed from: j  reason: collision with root package name */
        private final long f73239j;

        /* renamed from: rh.c$c$a */
        public static final class a {
            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private a() {
            }
        }

        static {
            StringBuilder sb2 = new StringBuilder();
            j.a aVar = j.f62626a;
            sb2.append(aVar.g().g());
            sb2.append("-Sent-Millis");
            f73228l = sb2.toString();
            f73229m = aVar.g().g() + "-Received-Millis";
        }

        public C1063c(W w10) {
            H h10;
            C6496s.h(w10, "rawSource");
            try {
                C5406g d10 = H.d(w10);
                String i02 = d10.i0();
                v f10 = v.f73477k.f(i02);
                if (f10 != null) {
                    this.f73230a = f10;
                    this.f73232c = d10.i0();
                    u.a aVar = new u.a();
                    int c10 = C6706c.f73215g.c(d10);
                    for (int i10 = 0; i10 < c10; i10++) {
                        aVar.c(d10.i0());
                    }
                    this.f73231b = aVar.f();
                    k a10 = k.f73898d.a(d10.i0());
                    this.f73233d = a10.f73899a;
                    this.f73234e = a10.f73900b;
                    this.f73235f = a10.f73901c;
                    u.a aVar2 = new u.a();
                    int c11 = C6706c.f73215g.c(d10);
                    for (int i11 = 0; i11 < c11; i11++) {
                        aVar2.c(d10.i0());
                    }
                    String str = f73228l;
                    String g10 = aVar2.g(str);
                    String str2 = f73229m;
                    String g11 = aVar2.g(str2);
                    aVar2.i(str);
                    aVar2.i(str2);
                    long j10 = 0;
                    this.f73238i = g10 != null ? Long.parseLong(g10) : 0;
                    this.f73239j = g11 != null ? Long.parseLong(g11) : j10;
                    this.f73236g = aVar2.f();
                    if (a()) {
                        String i03 = d10.i0();
                        if (i03.length() <= 0) {
                            C6712i b10 = C6712i.f73335b.b(d10.i0());
                            List c12 = c(d10);
                            List c13 = c(d10);
                            if (!d10.J0()) {
                                h10 = H.f73192b.a(d10.i0());
                            } else {
                                h10 = H.SSL_3_0;
                            }
                            this.f73237h = t.f73466e.b(h10, b10, c12, c13);
                        } else {
                            throw new IOException("expected \"\" but was \"" + i03 + '\"');
                        }
                    } else {
                        this.f73237h = null;
                    }
                    C6514M m10 = C6514M.f71813a;
                    C6763c.a(w10, (Throwable) null);
                    return;
                }
                IOException iOException = new IOException("Cache corruption for " + i02);
                j.f62626a.g().k("cache corruption", 5, iOException);
                throw iOException;
            } catch (Throwable th2) {
                C6763c.a(w10, th);
                throw th2;
            }
        }

        private final boolean a() {
            return C6496s.c(this.f73230a.s(), Constants.SCHEME);
        }

        private final List c(C5406g gVar) {
            int c10 = C6706c.f73215g.c(gVar);
            if (c10 == -1) {
                return C6565s.n();
            }
            try {
                CertificateFactory instance = CertificateFactory.getInstance("X.509");
                ArrayList arrayList = new ArrayList(c10);
                int i10 = 0;
                while (i10 < c10) {
                    String i02 = gVar.i0();
                    C5404e eVar = new C5404e();
                    C5407h a10 = C5407h.f63295d.a(i02);
                    if (a10 != null) {
                        eVar.k0(a10);
                        arrayList.add(instance.generateCertificate(eVar.x1()));
                        i10++;
                    } else {
                        throw new IOException("Corrupt certificate in cache entry");
                    }
                }
                return arrayList;
            } catch (CertificateException e10) {
                throw new IOException(e10.getMessage());
            }
        }

        private final void e(C5405f fVar, List list) {
            try {
                fVar.v0((long) list.size()).K0(10);
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    byte[] encoded = ((Certificate) it.next()).getEncoded();
                    C5407h.a aVar = C5407h.f63295d;
                    C6496s.g(encoded, "bytes");
                    fVar.X(C5407h.a.g(aVar, encoded, 0, 0, 3, (Object) null).a()).K0(10);
                }
            } catch (CertificateEncodingException e10) {
                throw new IOException(e10.getMessage());
            }
        }

        public final boolean b(C c10, E e10) {
            C6496s.h(c10, "request");
            C6496s.h(e10, "response");
            if (!C6496s.c(this.f73230a, c10.l()) || !C6496s.c(this.f73232c, c10.h()) || !C6706c.f73215g.g(e10, this.f73231b, c10)) {
                return false;
            }
            return true;
        }

        public final E d(d.C1074d dVar) {
            C6496s.h(dVar, "snapshot");
            String a10 = this.f73236g.a("Content-Type");
            String a11 = this.f73236g.a("Content-Length");
            return new E.a().r(new C.a().n(this.f73230a).g(this.f73232c, (D) null).f(this.f73231b).b()).p(this.f73233d).g(this.f73234e).m(this.f73235f).k(this.f73236g).b(new a(dVar, a10, a11)).i(this.f73237h).s(this.f73238i).q(this.f73239j).c();
        }

        public final void f(d.b bVar) {
            C6496s.h(bVar, "editor");
            C5405f c10 = H.c(bVar.f(0));
            try {
                c10.X(this.f73230a.toString()).K0(10);
                c10.X(this.f73232c).K0(10);
                c10.v0((long) this.f73231b.size()).K0(10);
                int size = this.f73231b.size();
                for (int i10 = 0; i10 < size; i10++) {
                    c10.X(this.f73231b.g(i10)).X(": ").X(this.f73231b.x(i10)).K0(10);
                }
                c10.X(new k(this.f73233d, this.f73234e, this.f73235f).toString()).K0(10);
                c10.v0((long) (this.f73236g.size() + 2)).K0(10);
                int size2 = this.f73236g.size();
                for (int i11 = 0; i11 < size2; i11++) {
                    c10.X(this.f73236g.g(i11)).X(": ").X(this.f73236g.x(i11)).K0(10);
                }
                c10.X(f73228l).X(": ").v0(this.f73238i).K0(10);
                c10.X(f73229m).X(": ").v0(this.f73239j).K0(10);
                if (a()) {
                    c10.K0(10);
                    t tVar = this.f73237h;
                    C6496s.e(tVar);
                    c10.X(tVar.a().c()).K0(10);
                    e(c10, this.f73237h.d());
                    e(c10, this.f73237h.c());
                    c10.X(this.f73237h.e().b()).K0(10);
                }
                C6514M m10 = C6514M.f71813a;
                C6763c.a(c10, (Throwable) null);
            } catch (Throwable th2) {
                C6763c.a(c10, th);
                throw th2;
            }
        }

        public C1063c(E e10) {
            C6496s.h(e10, "response");
            this.f73230a = e10.g0().l();
            this.f73231b = C6706c.f73215g.f(e10);
            this.f73232c = e10.g0().h();
            this.f73233d = e10.V();
            this.f73234e = e10.o();
            this.f73235f = e10.M();
            this.f73236g = e10.F();
            this.f73237h = e10.t();
            this.f73238i = e10.h0();
            this.f73239j = e10.f0();
        }
    }
}
