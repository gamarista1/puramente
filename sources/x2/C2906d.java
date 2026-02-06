package x2;

import android.content.Context;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.Looper;
import android.util.Pair;
import android.view.Surface;
import androidx.media3.exoplayer.C1810h;
import com.google.common.collect.C4770v;
import f2.C1965F;
import f2.C1974i;
import f2.C1977l;
import f2.C1980o;
import f2.M;
import f2.N;
import f2.O;
import f2.P;
import f2.s;
import f2.t;
import i2.C2075C;
import i2.C2076a;
import i2.C2078c;
import i2.C2087l;
import i2.L;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.Executor;
import nb.u;
import nb.v;
import x2.C2901E;
import x2.s;

/* renamed from: x2.d  reason: case insensitive filesystem */
public final class C2906d implements C2902F, O {
    /* access modifiers changed from: private */

    /* renamed from: n  reason: collision with root package name */
    public static final Executor f28229n = new C2904b();

    /* renamed from: a  reason: collision with root package name */
    private final Context f28230a;

    /* renamed from: b  reason: collision with root package name */
    private final h f28231b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public final p f28232c;

    /* renamed from: d  reason: collision with root package name */
    private final s f28233d;

    /* renamed from: e  reason: collision with root package name */
    private final C1965F.a f28234e;
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public final C2078c f28235f;
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public final CopyOnWriteArraySet f28236g;
    /* access modifiers changed from: private */

    /* renamed from: h  reason: collision with root package name */
    public s f28237h;
    /* access modifiers changed from: private */

    /* renamed from: i  reason: collision with root package name */
    public o f28238i;

    /* renamed from: j  reason: collision with root package name */
    private C2087l f28239j;
    /* access modifiers changed from: private */

    /* renamed from: k  reason: collision with root package name */
    public Pair f28240k;

    /* renamed from: l  reason: collision with root package name */
    private int f28241l;

    /* renamed from: m  reason: collision with root package name */
    private int f28242m;

    /* renamed from: x2.d$b */
    public static final class b {
        /* access modifiers changed from: private */

        /* renamed from: a  reason: collision with root package name */
        public final Context f28243a;
        /* access modifiers changed from: private */

        /* renamed from: b  reason: collision with root package name */
        public final p f28244b;

        /* renamed from: c  reason: collision with root package name */
        private N.a f28245c;
        /* access modifiers changed from: private */

        /* renamed from: d  reason: collision with root package name */
        public C1965F.a f28246d;
        /* access modifiers changed from: private */

        /* renamed from: e  reason: collision with root package name */
        public C2078c f28247e = C2078c.f22089a;

        /* renamed from: f  reason: collision with root package name */
        private boolean f28248f;

        public b(Context context, p pVar) {
            this.f28243a = context.getApplicationContext();
            this.f28244b = pVar;
        }

        public C2906d e() {
            C2076a.g(!this.f28248f);
            if (this.f28246d == null) {
                if (this.f28245c == null) {
                    this.f28245c = new e();
                }
                this.f28246d = new f(this.f28245c);
            }
            C2906d dVar = new C2906d(this);
            this.f28248f = true;
            return dVar;
        }

        public b f(C2078c cVar) {
            this.f28247e = cVar;
            return this;
        }
    }

    /* renamed from: x2.d$c */
    private final class c implements s.a {
        private c() {
        }

        public void a() {
            Iterator it = C2906d.this.f28236g.iterator();
            while (it.hasNext()) {
                ((C0472d) it.next()).h(C2906d.this);
            }
            C1965F unused = C2906d.this.getClass();
            android.support.v4.media.session.c.a(C2076a.i((Object) null));
            throw null;
        }

        public void b(long j10, long j11, long j12, boolean z10) {
            f2.s k10;
            if (z10 && C2906d.this.f28240k != null) {
                Iterator it = C2906d.this.f28236g.iterator();
                while (it.hasNext()) {
                    ((C0472d) it.next()).a(C2906d.this);
                }
            }
            if (C2906d.this.f28238i != null) {
                if (C2906d.this.f28237h == null) {
                    k10 = new s.b().K();
                } else {
                    k10 = C2906d.this.f28237h;
                }
                C2906d.this.f28238i.f(j11, C2906d.this.f28235f.b(), k10, (MediaFormat) null);
            }
            C1965F unused = C2906d.this.getClass();
            android.support.v4.media.session.c.a(C2076a.i((Object) null));
            throw null;
        }

        public void p(P p10) {
            f2.s unused = C2906d.this.f28237h = new s.b().t0(p10.f19911a).Y(p10.f19912b).o0("video/raw").K();
            Iterator it = C2906d.this.f28236g.iterator();
            while (it.hasNext()) {
                ((C0472d) it.next()).f(C2906d.this, p10);
            }
        }
    }

    /* renamed from: x2.d$d  reason: collision with other inner class name */
    public interface C0472d {
        void a(C2906d dVar);

        void f(C2906d dVar, P p10);

        void h(C2906d dVar);
    }

    /* renamed from: x2.d$e */
    private static final class e implements N.a {

        /* renamed from: a  reason: collision with root package name */
        private static final u f28250a = v.a(new C2907e());

        private e() {
        }

        /* access modifiers changed from: private */
        public static /* synthetic */ N.a b() {
            try {
                Class<?> cls = Class.forName("androidx.media3.effect.DefaultVideoFrameProcessor$Factory$Builder");
                return (N.a) C2076a.e(cls.getMethod("build", (Class[]) null).invoke(cls.getConstructor((Class[]) null).newInstance((Object[]) null), (Object[]) null));
            } catch (Exception e10) {
                throw new IllegalStateException(e10);
            }
        }
    }

    /* renamed from: x2.d$f */
    private static final class f implements C1965F.a {

        /* renamed from: a  reason: collision with root package name */
        private final N.a f28251a;

        public f(N.a aVar) {
            this.f28251a = aVar;
        }

        public C1965F a(Context context, C1974i iVar, C1977l lVar, O o10, Executor executor, List list, long j10) {
            try {
                try {
                    ((C1965F.a) Class.forName("androidx.media3.effect.PreviewingSingleInputVideoGraph$Factory").getConstructor(new Class[]{N.a.class}).newInstance(new Object[]{this.f28251a})).a(context, iVar, lVar, o10, executor, list, j10);
                    return null;
                } catch (Exception e10) {
                    e = e10;
                    throw M.a(e);
                }
            } catch (Exception e11) {
                e = e11;
                throw M.a(e);
            }
        }
    }

    /* renamed from: x2.d$g */
    private static final class g {

        /* renamed from: a  reason: collision with root package name */
        private static Constructor f28252a;

        /* renamed from: b  reason: collision with root package name */
        private static Method f28253b;

        /* renamed from: c  reason: collision with root package name */
        private static Method f28254c;

        public static C1980o a(float f10) {
            try {
                b();
                Object newInstance = f28252a.newInstance((Object[]) null);
                f28253b.invoke(newInstance, new Object[]{Float.valueOf(f10)});
                android.support.v4.media.session.c.a(C2076a.e(f28254c.invoke(newInstance, (Object[]) null)));
                return null;
            } catch (Exception e10) {
                throw new IllegalStateException(e10);
            }
        }

        private static void b() {
            if (f28252a == null || f28253b == null || f28254c == null) {
                Class<?> cls = Class.forName("androidx.media3.effect.ScaleAndRotateTransformation$Builder");
                f28252a = cls.getConstructor((Class[]) null);
                f28253b = cls.getMethod("setRotationDegrees", new Class[]{Float.TYPE});
                f28254c = cls.getMethod("build", (Class[]) null);
            }
        }
    }

    /* renamed from: x2.d$h */
    private final class h implements C2901E, C0472d {

        /* renamed from: a  reason: collision with root package name */
        private final Context f28255a;

        /* renamed from: b  reason: collision with root package name */
        private final int f28256b;

        /* renamed from: c  reason: collision with root package name */
        private final ArrayList f28257c = new ArrayList();

        /* renamed from: d  reason: collision with root package name */
        private f2.s f28258d;

        /* renamed from: e  reason: collision with root package name */
        private int f28259e;

        /* renamed from: f  reason: collision with root package name */
        private long f28260f;

        /* renamed from: g  reason: collision with root package name */
        private long f28261g;

        /* renamed from: h  reason: collision with root package name */
        private boolean f28262h;

        /* renamed from: i  reason: collision with root package name */
        private long f28263i = -9223372036854775807L;

        /* renamed from: j  reason: collision with root package name */
        private long f28264j = -9223372036854775807L;

        /* renamed from: k  reason: collision with root package name */
        private boolean f28265k;

        /* renamed from: l  reason: collision with root package name */
        private long f28266l;

        /* renamed from: m  reason: collision with root package name */
        private C2901E.a f28267m = C2901E.a.f28225a;

        /* renamed from: n  reason: collision with root package name */
        private Executor f28268n = C2906d.f28229n;

        public h(Context context) {
            this.f28255a = context;
            this.f28256b = L.a0(context);
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void C(C2901E.a aVar) {
            aVar.c(this);
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void D(C2901E.a aVar) {
            aVar.a((C2901E) C2076a.i(this));
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void E(C2901E.a aVar, P p10) {
            aVar.b(this, p10);
        }

        private void F() {
            if (this.f28258d != null) {
                new ArrayList().addAll(this.f28257c);
                f2.s sVar = (f2.s) C2076a.e(this.f28258d);
                android.support.v4.media.session.c.a(C2076a.i((Object) null));
                new t.b(C2906d.y(sVar.f20058A), sVar.f20089t, sVar.f20090u).b(sVar.f20093x).a();
                throw null;
            }
        }

        public void G(List list) {
            this.f28257c.clear();
            this.f28257c.addAll(list);
        }

        public void a(C2906d dVar) {
            this.f28268n.execute(new h(this, this.f28267m));
        }

        public boolean b() {
            if (e()) {
                long j10 = this.f28263i;
                if (j10 == -9223372036854775807L || !C2906d.this.z(j10)) {
                    return false;
                }
                return true;
            }
            return false;
        }

        public void c(C2901E.a aVar, Executor executor) {
            this.f28267m = aVar;
            this.f28268n = executor;
        }

        public boolean d() {
            if (!e() || !C2906d.this.C()) {
                return false;
            }
            return true;
        }

        public boolean e() {
            return false;
        }

        public void f(C2906d dVar, P p10) {
            this.f28268n.execute(new C2908f(this, this.f28267m, p10));
        }

        public void g(long j10, long j11) {
            try {
                C2906d.this.G(j10, j11);
            } catch (C1810h e10) {
                f2.s sVar = this.f28258d;
                if (sVar == null) {
                    sVar = new s.b().K();
                }
                throw new C2901E.b(e10, sVar);
            }
        }

        public void h(C2906d dVar) {
            this.f28268n.execute(new g(this, this.f28267m));
        }

        public long i(long j10, boolean z10) {
            boolean z11;
            C2076a.g(e());
            if (this.f28256b != -1) {
                z11 = true;
            } else {
                z11 = false;
            }
            C2076a.g(z11);
            long j11 = this.f28266l;
            if (j11 != -9223372036854775807L) {
                if (!C2906d.this.z(j11)) {
                    return -9223372036854775807L;
                }
                F();
                this.f28266l = -9223372036854775807L;
            }
            android.support.v4.media.session.c.a(C2076a.i((Object) null));
            throw null;
        }

        public void j() {
            C2906d.this.f28232c.a();
        }

        public void k() {
            C2906d.this.f28232c.l();
        }

        public void l(List list) {
            if (!this.f28257c.equals(list)) {
                G(list);
                F();
            }
        }

        public void m(long j10, long j11) {
            boolean z10;
            boolean z11 = this.f28262h;
            if (this.f28260f == j10 && this.f28261g == j11) {
                z10 = false;
            } else {
                z10 = true;
            }
            this.f28262h = z11 | z10;
            this.f28260f = j10;
            this.f28261g = j11;
        }

        public boolean n() {
            return L.D0(this.f28255a);
        }

        public void o(boolean z10) {
            C2906d.this.f28232c.h(z10);
        }

        public Surface p() {
            C2076a.g(e());
            android.support.v4.media.session.c.a(C2076a.i((Object) null));
            throw null;
        }

        public void q() {
            C2906d.this.f28232c.k();
        }

        public void r(Surface surface, C2075C c10) {
            C2906d.this.H(surface, c10);
        }

        public void release() {
            C2906d.this.F();
        }

        public void s() {
            C2906d.this.f28232c.g();
        }

        public void t(o oVar) {
            C2906d.this.J(oVar);
        }

        public void u() {
            C2906d.this.v();
        }

        public void v(boolean z10) {
            if (!e()) {
                this.f28265k = false;
                this.f28263i = -9223372036854775807L;
                this.f28264j = -9223372036854775807L;
                C2906d.this.w();
                if (z10) {
                    C2906d.this.f28232c.m();
                    return;
                }
                return;
            }
            throw null;
        }

        public void w(f2.s sVar) {
            C2076a.g(!e());
            N unused = C2906d.this.A(sVar);
        }

        public void x(int i10, f2.s sVar) {
            int i11;
            C2076a.g(e());
            boolean z10 = true;
            if (i10 == 1 || i10 == 2) {
                C2906d.this.f28232c.p(sVar.f20091v);
                if (i10 == 1 && L.f22072a < 21 && (i11 = sVar.f20092w) != -1 && i11 != 0) {
                    g.a((float) i11);
                }
                this.f28259e = i10;
                this.f28258d = sVar;
                if (!this.f28265k) {
                    F();
                    this.f28265k = true;
                    this.f28266l = -9223372036854775807L;
                    return;
                }
                if (this.f28264j == -9223372036854775807L) {
                    z10 = false;
                }
                C2076a.g(z10);
                this.f28266l = this.f28264j;
                return;
            }
            throw new UnsupportedOperationException("Unsupported input type " + i10);
        }

        public void z(float f10) {
            C2906d.this.I(f10);
        }
    }

    /* access modifiers changed from: private */
    public N A(f2.s sVar) {
        boolean z10;
        if (this.f28242m == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        C2076a.g(z10);
        C1974i y10 = y(sVar.f20058A);
        if (y10.f19987c == 7 && L.f22072a < 34) {
            y10 = y10.a().e(6).a();
        }
        C1974i iVar = y10;
        C2087l d10 = this.f28235f.d((Looper) C2076a.i(Looper.myLooper()), (Handler.Callback) null);
        this.f28239j = d10;
        try {
            C1965F.a aVar = this.f28234e;
            Context context = this.f28230a;
            C1977l lVar = C1977l.f19998a;
            Objects.requireNonNull(d10);
            aVar.a(context, iVar, lVar, this, new C2903a(d10), C4770v.E(), 0);
            Pair pair = this.f28240k;
            if (pair != null) {
                C2075C c10 = (C2075C) pair.second;
                E((Surface) pair.first, c10.b(), c10.a());
            }
            throw null;
        } catch (M e10) {
            throw new C2901E.b(e10, sVar);
        }
    }

    private boolean B() {
        if (this.f28242m == 1) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: private */
    public boolean C() {
        if (this.f28241l != 0 || !this.f28233d.e()) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: private */
    public void I(float f10) {
        this.f28233d.j(f10);
    }

    /* access modifiers changed from: private */
    public void J(o oVar) {
        this.f28238i = oVar;
    }

    /* access modifiers changed from: private */
    public void w() {
        if (B()) {
            this.f28241l++;
            this.f28233d.b();
            ((C2087l) C2076a.i(this.f28239j)).f(new C2905c(this));
        }
    }

    /* access modifiers changed from: private */
    public void x() {
        int i10 = this.f28241l - 1;
        this.f28241l = i10;
        if (i10 <= 0) {
            if (i10 >= 0) {
                this.f28233d.b();
                return;
            }
            throw new IllegalStateException(String.valueOf(this.f28241l));
        }
    }

    /* access modifiers changed from: private */
    public static C1974i y(C1974i iVar) {
        if (iVar == null || !iVar.g()) {
            return C1974i.f19977h;
        }
        return iVar;
    }

    /* access modifiers changed from: private */
    public boolean z(long j10) {
        if (this.f28241l != 0 || !this.f28233d.d(j10)) {
            return false;
        }
        return true;
    }

    public void F() {
        if (this.f28242m != 2) {
            C2087l lVar = this.f28239j;
            if (lVar != null) {
                lVar.d((Object) null);
            }
            this.f28240k = null;
            this.f28242m = 2;
        }
    }

    public void G(long j10, long j11) {
        if (this.f28241l == 0) {
            this.f28233d.h(j10, j11);
        }
    }

    public void H(Surface surface, C2075C c10) {
        Pair pair = this.f28240k;
        if (pair == null || !((Surface) pair.first).equals(surface) || !((C2075C) this.f28240k.second).equals(c10)) {
            this.f28240k = Pair.create(surface, c10);
            E(surface, c10.b(), c10.a());
        }
    }

    public p a() {
        return this.f28232c;
    }

    public C2901E b() {
        return this.f28231b;
    }

    public void u(C0472d dVar) {
        this.f28236g.add(dVar);
    }

    public void v() {
        C2075C c10 = C2075C.f22055c;
        E((Surface) null, c10.b(), c10.a());
        this.f28240k = null;
    }

    private C2906d(b bVar) {
        Context a10 = bVar.f28243a;
        this.f28230a = a10;
        h hVar = new h(a10);
        this.f28231b = hVar;
        C2078c b10 = bVar.f28247e;
        this.f28235f = b10;
        p c10 = bVar.f28244b;
        this.f28232c = c10;
        c10.o(b10);
        this.f28233d = new s(new c(), c10);
        this.f28234e = (C1965F.a) C2076a.i(bVar.f28246d);
        this.f28236g = new CopyOnWriteArraySet();
        this.f28242m = 0;
        u(hVar);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void D(Runnable runnable) {
    }

    private void E(Surface surface, int i10, int i11) {
    }
}
