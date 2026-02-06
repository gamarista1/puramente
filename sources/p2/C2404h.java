package p2;

import android.media.ResourceBusyException;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import com.google.common.collect.C4770v;
import com.google.common.collect.C4773y;
import com.google.common.collect.a0;
import com.google.common.collect.g0;
import f2.C1960A;
import f2.C1973h;
import f2.C1979n;
import f2.s;
import i2.C2076a;
import i2.L;
import i2.p;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import n2.u1;
import p2.C2390A;
import p2.C2403g;
import p2.C2409m;
import p2.t;
import p2.u;
import w2.C2826h;
import w2.C2827i;

/* renamed from: p2.h  reason: case insensitive filesystem */
public class C2404h implements u {

    /* renamed from: b  reason: collision with root package name */
    private final UUID f25235b;

    /* renamed from: c  reason: collision with root package name */
    private final C2390A.c f25236c;

    /* renamed from: d  reason: collision with root package name */
    private final L f25237d;

    /* renamed from: e  reason: collision with root package name */
    private final HashMap f25238e;

    /* renamed from: f  reason: collision with root package name */
    private final boolean f25239f;

    /* renamed from: g  reason: collision with root package name */
    private final int[] f25240g;

    /* renamed from: h  reason: collision with root package name */
    private final boolean f25241h;
    /* access modifiers changed from: private */

    /* renamed from: i  reason: collision with root package name */
    public final g f25242i;

    /* renamed from: j  reason: collision with root package name */
    private final C2827i f25243j;

    /* renamed from: k  reason: collision with root package name */
    private final C0423h f25244k;
    /* access modifiers changed from: private */

    /* renamed from: l  reason: collision with root package name */
    public final long f25245l;
    /* access modifiers changed from: private */

    /* renamed from: m  reason: collision with root package name */
    public final List f25246m;
    /* access modifiers changed from: private */

    /* renamed from: n  reason: collision with root package name */
    public final Set f25247n;
    /* access modifiers changed from: private */

    /* renamed from: o  reason: collision with root package name */
    public final Set f25248o;
    /* access modifiers changed from: private */

    /* renamed from: p  reason: collision with root package name */
    public int f25249p;

    /* renamed from: q  reason: collision with root package name */
    private C2390A f25250q;
    /* access modifiers changed from: private */

    /* renamed from: r  reason: collision with root package name */
    public C2403g f25251r;
    /* access modifiers changed from: private */

    /* renamed from: s  reason: collision with root package name */
    public C2403g f25252s;
    /* access modifiers changed from: private */

    /* renamed from: t  reason: collision with root package name */
    public Looper f25253t;
    /* access modifiers changed from: private */

    /* renamed from: u  reason: collision with root package name */
    public Handler f25254u;

    /* renamed from: v  reason: collision with root package name */
    private int f25255v;

    /* renamed from: w  reason: collision with root package name */
    private byte[] f25256w;

    /* renamed from: x  reason: collision with root package name */
    private u1 f25257x;

    /* renamed from: y  reason: collision with root package name */
    volatile d f25258y;

    /* renamed from: p2.h$b */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        private final HashMap f25259a = new HashMap();

        /* renamed from: b  reason: collision with root package name */
        private UUID f25260b = C1973h.f19975d;

        /* renamed from: c  reason: collision with root package name */
        private C2390A.c f25261c = I.f25187d;

        /* renamed from: d  reason: collision with root package name */
        private boolean f25262d;

        /* renamed from: e  reason: collision with root package name */
        private int[] f25263e = new int[0];

        /* renamed from: f  reason: collision with root package name */
        private boolean f25264f = true;

        /* renamed from: g  reason: collision with root package name */
        private C2827i f25265g = new C2826h();

        /* renamed from: h  reason: collision with root package name */
        private long f25266h = 300000;

        public C2404h a(L l10) {
            return new C2404h(this.f25260b, this.f25261c, l10, this.f25259a, this.f25262d, this.f25263e, this.f25264f, this.f25265g, this.f25266h);
        }

        public b b(C2827i iVar) {
            this.f25265g = (C2827i) C2076a.e(iVar);
            return this;
        }

        public b c(boolean z10) {
            this.f25262d = z10;
            return this;
        }

        public b d(boolean z10) {
            this.f25264f = z10;
            return this;
        }

        public b e(int... iArr) {
            for (int i10 : iArr) {
                boolean z10 = true;
                if (!(i10 == 2 || i10 == 1)) {
                    z10 = false;
                }
                C2076a.a(z10);
            }
            this.f25263e = (int[]) iArr.clone();
            return this;
        }

        public b f(UUID uuid, C2390A.c cVar) {
            this.f25260b = (UUID) C2076a.e(uuid);
            this.f25261c = (C2390A.c) C2076a.e(cVar);
            return this;
        }
    }

    /* renamed from: p2.h$c */
    private class c implements C2390A.b {
        private c() {
        }

        public void a(C2390A a10, byte[] bArr, int i10, int i11, byte[] bArr2) {
            ((d) C2076a.e(C2404h.this.f25258y)).obtainMessage(i10, bArr).sendToTarget();
        }
    }

    /* renamed from: p2.h$d */
    private class d extends Handler {
        public d(Looper looper) {
            super(looper);
        }

        public void handleMessage(Message message) {
            byte[] bArr = (byte[]) message.obj;
            if (bArr != null) {
                for (C2403g gVar : C2404h.this.f25246m) {
                    if (gVar.u(bArr)) {
                        gVar.C(message.what);
                        return;
                    }
                }
            }
        }
    }

    /* renamed from: p2.h$e */
    public static final class e extends Exception {
        private e(UUID uuid) {
            super("Media does not support uuid: " + uuid);
        }
    }

    /* renamed from: p2.h$f */
    private class f implements u.b {

        /* renamed from: b  reason: collision with root package name */
        private final t.a f25269b;

        /* renamed from: c  reason: collision with root package name */
        private C2409m f25270c;

        /* renamed from: d  reason: collision with root package name */
        private boolean f25271d;

        public f(t.a aVar) {
            this.f25269b = aVar;
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void f(s sVar) {
            if (C2404h.this.f25249p != 0 && !this.f25271d) {
                C2404h hVar = C2404h.this;
                this.f25270c = hVar.t((Looper) C2076a.e(hVar.f25253t), this.f25269b, sVar, false);
                C2404h.this.f25247n.add(this);
            }
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void g() {
            if (!this.f25271d) {
                C2409m mVar = this.f25270c;
                if (mVar != null) {
                    mVar.h(this.f25269b);
                }
                C2404h.this.f25247n.remove(this);
                this.f25271d = true;
            }
        }

        public void e(s sVar) {
            ((Handler) C2076a.e(C2404h.this.f25254u)).post(new C2405i(this, sVar));
        }

        public void release() {
            L.R0((Handler) C2076a.e(C2404h.this.f25254u), new C2406j(this));
        }
    }

    /* renamed from: p2.h$g */
    private class g implements C2403g.a {

        /* renamed from: a  reason: collision with root package name */
        private final Set f25273a = new HashSet();

        /* renamed from: b  reason: collision with root package name */
        private C2403g f25274b;

        public g() {
        }

        public void a(Exception exc, boolean z10) {
            this.f25274b = null;
            C4770v z11 = C4770v.z(this.f25273a);
            this.f25273a.clear();
            g0 m10 = z11.iterator();
            while (m10.hasNext()) {
                ((C2403g) m10.next()).E(exc, z10);
            }
        }

        public void b() {
            this.f25274b = null;
            C4770v z10 = C4770v.z(this.f25273a);
            this.f25273a.clear();
            g0 m10 = z10.iterator();
            while (m10.hasNext()) {
                ((C2403g) m10.next()).D();
            }
        }

        public void c(C2403g gVar) {
            this.f25273a.add(gVar);
            if (this.f25274b == null) {
                this.f25274b = gVar;
                gVar.I();
            }
        }

        public void d(C2403g gVar) {
            this.f25273a.remove(gVar);
            if (this.f25274b == gVar) {
                this.f25274b = null;
                if (!this.f25273a.isEmpty()) {
                    C2403g gVar2 = (C2403g) this.f25273a.iterator().next();
                    this.f25274b = gVar2;
                    gVar2.I();
                }
            }
        }
    }

    /* renamed from: p2.h$h  reason: collision with other inner class name */
    private class C0423h implements C2403g.b {
        private C0423h() {
        }

        public void a(C2403g gVar, int i10) {
            if (i10 == 1 && C2404h.this.f25249p > 0 && C2404h.this.f25245l != -9223372036854775807L) {
                C2404h.this.f25248o.add(gVar);
                ((Handler) C2076a.e(C2404h.this.f25254u)).postAtTime(new C2407k(gVar), gVar, SystemClock.uptimeMillis() + C2404h.this.f25245l);
            } else if (i10 == 0) {
                C2404h.this.f25246m.remove(gVar);
                if (C2404h.this.f25251r == gVar) {
                    C2403g unused = C2404h.this.f25251r = null;
                }
                if (C2404h.this.f25252s == gVar) {
                    C2403g unused2 = C2404h.this.f25252s = null;
                }
                C2404h.this.f25242i.d(gVar);
                if (C2404h.this.f25245l != -9223372036854775807L) {
                    ((Handler) C2076a.e(C2404h.this.f25254u)).removeCallbacksAndMessages(gVar);
                    C2404h.this.f25248o.remove(gVar);
                }
            }
            C2404h.this.C();
        }

        public void b(C2403g gVar, int i10) {
            if (C2404h.this.f25245l != -9223372036854775807L) {
                C2404h.this.f25248o.remove(gVar);
                ((Handler) C2076a.e(C2404h.this.f25254u)).removeCallbacksAndMessages(gVar);
            }
        }
    }

    private C2409m A(int i10, boolean z10) {
        C2390A a10 = (C2390A) C2076a.e(this.f25250q);
        if ((a10.f() == 2 && C2391B.f25181d) || L.J0(this.f25240g, i10) == -1 || a10.f() == 1) {
            return null;
        }
        C2403g gVar = this.f25251r;
        if (gVar == null) {
            C2403g x10 = x(C4770v.E(), true, (t.a) null, z10);
            this.f25246m.add(x10);
            this.f25251r = x10;
        } else {
            gVar.i((t.a) null);
        }
        return this.f25251r;
    }

    private void B(Looper looper) {
        if (this.f25258y == null) {
            this.f25258y = new d(looper);
        }
    }

    /* access modifiers changed from: private */
    public void C() {
        if (this.f25250q != null && this.f25249p == 0 && this.f25246m.isEmpty() && this.f25247n.isEmpty()) {
            ((C2390A) C2076a.e(this.f25250q)).release();
            this.f25250q = null;
        }
    }

    private void D() {
        g0 m10 = C4773y.x(this.f25248o).m();
        while (m10.hasNext()) {
            ((C2409m) m10.next()).h((t.a) null);
        }
    }

    private void E() {
        g0 m10 = C4773y.x(this.f25247n).m();
        while (m10.hasNext()) {
            ((f) m10.next()).release();
        }
    }

    private void G(C2409m mVar, t.a aVar) {
        mVar.h(aVar);
        if (this.f25245l != -9223372036854775807L) {
            mVar.h((t.a) null);
        }
    }

    private void H(boolean z10) {
        if (z10 && this.f25253t == null) {
            p.i("DefaultDrmSessionMgr", "DefaultDrmSessionManager accessed before setPlayer(), possibly on the wrong thread.", new IllegalStateException());
        } else if (Thread.currentThread() != ((Looper) C2076a.e(this.f25253t)).getThread()) {
            p.i("DefaultDrmSessionMgr", "DefaultDrmSessionManager accessed on the wrong thread.\nCurrent thread: " + Thread.currentThread().getName() + "\nExpected thread: " + this.f25253t.getThread().getName(), new IllegalStateException());
        }
    }

    /* access modifiers changed from: private */
    public C2409m t(Looper looper, t.a aVar, s sVar, boolean z10) {
        List list;
        B(looper);
        C1979n nVar = sVar.f20087r;
        if (nVar == null) {
            return A(C1960A.i(sVar.f20083n), z10);
        }
        C2403g gVar = null;
        if (this.f25256w == null) {
            list = y((C1979n) C2076a.e(nVar), this.f25235b, false);
            if (list.isEmpty()) {
                e eVar = new e(this.f25235b);
                p.d("DefaultDrmSessionMgr", "DRM error", eVar);
                if (aVar != null) {
                    aVar.l(eVar);
                }
                return new z(new C2409m.a(eVar, 6003));
            }
        } else {
            list = null;
        }
        if (this.f25239f) {
            Iterator it = this.f25246m.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                C2403g gVar2 = (C2403g) it.next();
                if (L.c(gVar2.f25202a, list)) {
                    gVar = gVar2;
                    break;
                }
            }
        } else {
            gVar = this.f25252s;
        }
        if (gVar == null) {
            gVar = x(list, false, aVar, z10);
            if (!this.f25239f) {
                this.f25252s = gVar;
            }
            this.f25246m.add(gVar);
        } else {
            gVar.i(aVar);
        }
        return gVar;
    }

    private static boolean u(C2409m mVar) {
        if (mVar.getState() != 1) {
            return false;
        }
        Throwable cause = ((C2409m.a) C2076a.e(mVar.a())).getCause();
        if ((cause instanceof ResourceBusyException) || x.c(cause)) {
            return true;
        }
        return false;
    }

    private boolean v(C1979n nVar) {
        if (this.f25256w != null) {
            return true;
        }
        if (y(nVar, this.f25235b, true).isEmpty()) {
            if (nVar.f20015d != 1 || !nVar.c(0).b(C1973h.f19973b)) {
                return false;
            }
            p.h("DefaultDrmSessionMgr", "DrmInitData only contains common PSSH SchemeData. Assuming support for: " + this.f25235b);
        }
        String str = nVar.f20014c;
        if (str == null || "cenc".equals(str)) {
            return true;
        }
        if ("cbcs".equals(str)) {
            if (L.f22072a >= 25) {
                return true;
            }
            return false;
        } else if ("cbc1".equals(str) || "cens".equals(str)) {
            return false;
        } else {
            return true;
        }
    }

    private C2403g w(List list, boolean z10, t.a aVar) {
        C2076a.e(this.f25250q);
        List list2 = list;
        C2403g gVar = new C2403g(this.f25235b, this.f25250q, this.f25242i, this.f25244k, list2, this.f25255v, this.f25241h | z10, z10, this.f25256w, this.f25238e, this.f25237d, (Looper) C2076a.e(this.f25253t), this.f25243j, (u1) C2076a.e(this.f25257x));
        gVar.i(aVar);
        if (this.f25245l != -9223372036854775807L) {
            gVar.i((t.a) null);
        }
        return gVar;
    }

    private C2403g x(List list, boolean z10, t.a aVar, boolean z11) {
        C2403g w10 = w(list, z10, aVar);
        if (u(w10) && !this.f25248o.isEmpty()) {
            D();
            G(w10, aVar);
            w10 = w(list, z10, aVar);
        }
        if (!u(w10) || !z11 || this.f25247n.isEmpty()) {
            return w10;
        }
        E();
        if (!this.f25248o.isEmpty()) {
            D();
        }
        G(w10, aVar);
        return w(list, z10, aVar);
    }

    private static List y(C1979n nVar, UUID uuid, boolean z10) {
        ArrayList arrayList = new ArrayList(nVar.f20015d);
        for (int i10 = 0; i10 < nVar.f20015d; i10++) {
            C1979n.b c10 = nVar.c(i10);
            if ((c10.b(uuid) || (C1973h.f19974c.equals(uuid) && c10.b(C1973h.f19973b))) && (c10.f20020e != null || z10)) {
                arrayList.add(c10);
            }
        }
        return arrayList;
    }

    private synchronized void z(Looper looper) {
        boolean z10;
        try {
            Looper looper2 = this.f25253t;
            if (looper2 == null) {
                this.f25253t = looper;
                this.f25254u = new Handler(looper);
            } else {
                if (looper2 == looper) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                C2076a.g(z10);
                C2076a.e(this.f25254u);
            }
        } catch (Throwable th2) {
            while (true) {
                throw th2;
            }
        }
    }

    public void F(int i10, byte[] bArr) {
        C2076a.g(this.f25246m.isEmpty());
        if (i10 == 1 || i10 == 3) {
            C2076a.e(bArr);
        }
        this.f25255v = i10;
        this.f25256w = bArr;
    }

    public u.b a(t.a aVar, s sVar) {
        boolean z10;
        if (this.f25249p > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        C2076a.g(z10);
        C2076a.i(this.f25253t);
        f fVar = new f(aVar);
        fVar.e(sVar);
        return fVar;
    }

    public void b(Looper looper, u1 u1Var) {
        z(looper);
        this.f25257x = u1Var;
    }

    public C2409m c(t.a aVar, s sVar) {
        boolean z10 = false;
        H(false);
        if (this.f25249p > 0) {
            z10 = true;
        }
        C2076a.g(z10);
        C2076a.i(this.f25253t);
        return t(this.f25253t, aVar, sVar, true);
    }

    public int d(s sVar) {
        H(false);
        int f10 = ((C2390A) C2076a.e(this.f25250q)).f();
        C1979n nVar = sVar.f20087r;
        if (nVar == null) {
            if (L.J0(this.f25240g, C1960A.i(sVar.f20083n)) != -1) {
                return f10;
            }
            return 0;
        } else if (v(nVar)) {
            return f10;
        } else {
            return 1;
        }
    }

    public final void j() {
        H(true);
        int i10 = this.f25249p;
        this.f25249p = i10 + 1;
        if (i10 == 0) {
            if (this.f25250q == null) {
                C2390A a10 = this.f25236c.a(this.f25235b);
                this.f25250q = a10;
                a10.m(new c());
            } else if (this.f25245l != -9223372036854775807L) {
                for (int i11 = 0; i11 < this.f25246m.size(); i11++) {
                    ((C2403g) this.f25246m.get(i11)).i((t.a) null);
                }
            }
        }
    }

    public final void release() {
        H(true);
        int i10 = this.f25249p - 1;
        this.f25249p = i10;
        if (i10 == 0) {
            if (this.f25245l != -9223372036854775807L) {
                ArrayList arrayList = new ArrayList(this.f25246m);
                for (int i11 = 0; i11 < arrayList.size(); i11++) {
                    ((C2403g) arrayList.get(i11)).h((t.a) null);
                }
            }
            E();
            C();
        }
    }

    private C2404h(UUID uuid, C2390A.c cVar, L l10, HashMap hashMap, boolean z10, int[] iArr, boolean z11, C2827i iVar, long j10) {
        C2076a.e(uuid);
        C2076a.b(!C1973h.f19973b.equals(uuid), "Use C.CLEARKEY_UUID instead");
        this.f25235b = uuid;
        this.f25236c = cVar;
        this.f25237d = l10;
        this.f25238e = hashMap;
        this.f25239f = z10;
        this.f25240g = iArr;
        this.f25241h = z11;
        this.f25243j = iVar;
        this.f25242i = new g();
        this.f25244k = new C0423h();
        this.f25255v = 0;
        this.f25246m = new ArrayList();
        this.f25247n = a0.h();
        this.f25248o = a0.h();
        this.f25245l = j10;
    }
}
