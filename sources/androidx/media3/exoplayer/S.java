package androidx.media3.exoplayer;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.util.Pair;
import androidx.media3.exoplayer.C1809g;
import androidx.media3.exoplayer.ExoPlayer;
import androidx.media3.exoplayer.T;
import androidx.media3.exoplayer.m0;
import androidx.media3.exoplayer.o0;
import androidx.media3.exoplayer.q0;
import androidx.media3.exoplayer.r0;
import com.adjust.sdk.network.ErrorCodes;
import com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer;
import com.google.common.collect.C4770v;
import com.google.common.collect.a0;
import f2.C1961B;
import f2.C1963D;
import f2.H;
import f2.s;
import f2.w;
import f2.z;
import i2.C2076a;
import i2.C2078c;
import i2.C2087l;
import i2.L;
import i2.p;
import io.intercom.android.sdk.m5.inbox.data.InboxPagingSource;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import m2.C2190B;
import m2.x;
import m2.z;
import n2.C2280a;
import n2.u1;
import nb.u;
import p2.C2409m;
import s2.C2592c;
import t2.C2614B;
import t2.C2615C;
import t2.Z;
import t2.b0;
import t2.j0;
import u2.C2705i;
import v2.C;
import v2.D;
import w2.C2822d;

final class S implements Handler.Callback, C2614B.a, C.a, m0.d, C1809g.a, o0.a {

    /* renamed from: q0  reason: collision with root package name */
    private static final long f17461q0 = L.h1(10000);

    /* renamed from: A  reason: collision with root package name */
    private e f17462A;

    /* renamed from: B  reason: collision with root package name */
    private boolean f17463B;

    /* renamed from: C  reason: collision with root package name */
    private boolean f17464C;

    /* renamed from: D  reason: collision with root package name */
    private boolean f17465D;

    /* renamed from: E  reason: collision with root package name */
    private boolean f17466E;

    /* renamed from: F  reason: collision with root package name */
    private long f17467F = -9223372036854775807L;

    /* renamed from: G  reason: collision with root package name */
    private boolean f17468G;

    /* renamed from: H  reason: collision with root package name */
    private int f17469H;

    /* renamed from: I  reason: collision with root package name */
    private boolean f17470I;

    /* renamed from: X  reason: collision with root package name */
    private boolean f17471X;
    /* access modifiers changed from: private */

    /* renamed from: Y  reason: collision with root package name */
    public boolean f17472Y;
    /* access modifiers changed from: private */

    /* renamed from: Z  reason: collision with root package name */
    public boolean f17473Z;

    /* renamed from: a  reason: collision with root package name */
    private final q0[] f17474a;

    /* renamed from: b  reason: collision with root package name */
    private final Set f17475b;

    /* renamed from: c  reason: collision with root package name */
    private final r0[] f17476c;

    /* renamed from: d  reason: collision with root package name */
    private final C f17477d;

    /* renamed from: e  reason: collision with root package name */
    private final D f17478e;

    /* renamed from: f  reason: collision with root package name */
    private final T f17479f;

    /* renamed from: f0  reason: collision with root package name */
    private int f17480f0;

    /* renamed from: g  reason: collision with root package name */
    private final C2822d f17481g;

    /* renamed from: g0  reason: collision with root package name */
    private h f17482g0;
    /* access modifiers changed from: private */

    /* renamed from: h  reason: collision with root package name */
    public final C2087l f17483h;

    /* renamed from: h0  reason: collision with root package name */
    private long f17484h0;

    /* renamed from: i  reason: collision with root package name */
    private final HandlerThread f17485i;

    /* renamed from: i0  reason: collision with root package name */
    private long f17486i0;

    /* renamed from: j  reason: collision with root package name */
    private final Looper f17487j;

    /* renamed from: j0  reason: collision with root package name */
    private int f17488j0;

    /* renamed from: k  reason: collision with root package name */
    private final H.c f17489k;

    /* renamed from: k0  reason: collision with root package name */
    private boolean f17490k0;

    /* renamed from: l  reason: collision with root package name */
    private final H.b f17491l;

    /* renamed from: l0  reason: collision with root package name */
    private C1810h f17492l0;

    /* renamed from: m  reason: collision with root package name */
    private final long f17493m;

    /* renamed from: m0  reason: collision with root package name */
    private long f17494m0;

    /* renamed from: n  reason: collision with root package name */
    private final boolean f17495n;

    /* renamed from: n0  reason: collision with root package name */
    private long f17496n0 = -9223372036854775807L;

    /* renamed from: o  reason: collision with root package name */
    private final C1809g f17497o;

    /* renamed from: o0  reason: collision with root package name */
    private ExoPlayer.c f17498o0;

    /* renamed from: p  reason: collision with root package name */
    private final ArrayList f17499p;

    /* renamed from: p0  reason: collision with root package name */
    private H f17500p0;

    /* renamed from: q  reason: collision with root package name */
    private final C2078c f17501q;

    /* renamed from: r  reason: collision with root package name */
    private final f f17502r;

    /* renamed from: s  reason: collision with root package name */
    private final Y f17503s;

    /* renamed from: t  reason: collision with root package name */
    private final m0 f17504t;

    /* renamed from: u  reason: collision with root package name */
    private final x f17505u;

    /* renamed from: v  reason: collision with root package name */
    private final long f17506v;

    /* renamed from: w  reason: collision with root package name */
    private final u1 f17507w;
    /* access modifiers changed from: private */

    /* renamed from: x  reason: collision with root package name */
    public final boolean f17508x;

    /* renamed from: y  reason: collision with root package name */
    private C2190B f17509y;

    /* renamed from: z  reason: collision with root package name */
    private n0 f17510z;

    class a implements q0.a {
        a() {
        }

        public void a() {
            boolean unused = S.this.f17472Y = true;
        }

        public void b() {
            if (S.this.f17508x || S.this.f17473Z) {
                S.this.f17483h.g(2);
            }
        }
    }

    private static final class b {
        /* access modifiers changed from: private */

        /* renamed from: a  reason: collision with root package name */
        public final List f17512a;
        /* access modifiers changed from: private */

        /* renamed from: b  reason: collision with root package name */
        public final b0 f17513b;
        /* access modifiers changed from: private */

        /* renamed from: c  reason: collision with root package name */
        public final int f17514c;
        /* access modifiers changed from: private */

        /* renamed from: d  reason: collision with root package name */
        public final long f17515d;

        /* synthetic */ b(List list, b0 b0Var, int i10, long j10, a aVar) {
            this(list, b0Var, i10, j10);
        }

        private b(List list, b0 b0Var, int i10, long j10) {
            this.f17512a = list;
            this.f17513b = b0Var;
            this.f17514c = i10;
            this.f17515d = j10;
        }
    }

    private static class c {
    }

    private static final class d implements Comparable {

        /* renamed from: a  reason: collision with root package name */
        public final o0 f17516a;

        /* renamed from: b  reason: collision with root package name */
        public int f17517b;

        /* renamed from: c  reason: collision with root package name */
        public long f17518c;

        /* renamed from: d  reason: collision with root package name */
        public Object f17519d;

        public d(o0 o0Var) {
            this.f17516a = o0Var;
        }

        /* renamed from: a */
        public int compareTo(d dVar) {
            boolean z10;
            boolean z11;
            Object obj = this.f17519d;
            if (obj == null) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (dVar.f17519d == null) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z10 != z11) {
                if (obj != null) {
                    return -1;
                }
                return 1;
            } else if (obj == null) {
                return 0;
            } else {
                int i10 = this.f17517b - dVar.f17517b;
                if (i10 != 0) {
                    return i10;
                }
                return L.m(this.f17518c, dVar.f17518c);
            }
        }

        public void b(int i10, long j10, Object obj) {
            this.f17517b = i10;
            this.f17518c = j10;
            this.f17519d = obj;
        }
    }

    public static final class e {
        /* access modifiers changed from: private */

        /* renamed from: a  reason: collision with root package name */
        public boolean f17520a;

        /* renamed from: b  reason: collision with root package name */
        public n0 f17521b;

        /* renamed from: c  reason: collision with root package name */
        public int f17522c;

        /* renamed from: d  reason: collision with root package name */
        public boolean f17523d;

        /* renamed from: e  reason: collision with root package name */
        public int f17524e;

        public e(n0 n0Var) {
            this.f17521b = n0Var;
        }

        public void b(int i10) {
            boolean z10;
            boolean z11 = this.f17520a;
            if (i10 > 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.f17520a = z11 | z10;
            this.f17522c += i10;
        }

        public void c(n0 n0Var) {
            boolean z10;
            boolean z11 = this.f17520a;
            if (this.f17521b != n0Var) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.f17520a = z11 | z10;
            this.f17521b = n0Var;
        }

        public void d(int i10) {
            boolean z10 = true;
            if (!this.f17523d || this.f17524e == 5) {
                this.f17520a = true;
                this.f17523d = true;
                this.f17524e = i10;
                return;
            }
            if (i10 != 5) {
                z10 = false;
            }
            C2076a.a(z10);
        }
    }

    public interface f {
        void a(e eVar);
    }

    private static final class g {

        /* renamed from: a  reason: collision with root package name */
        public final C2615C.b f17525a;

        /* renamed from: b  reason: collision with root package name */
        public final long f17526b;

        /* renamed from: c  reason: collision with root package name */
        public final long f17527c;

        /* renamed from: d  reason: collision with root package name */
        public final boolean f17528d;

        /* renamed from: e  reason: collision with root package name */
        public final boolean f17529e;

        /* renamed from: f  reason: collision with root package name */
        public final boolean f17530f;

        public g(C2615C.b bVar, long j10, long j11, boolean z10, boolean z11, boolean z12) {
            this.f17525a = bVar;
            this.f17526b = j10;
            this.f17527c = j11;
            this.f17528d = z10;
            this.f17529e = z11;
            this.f17530f = z12;
        }
    }

    private static final class h {

        /* renamed from: a  reason: collision with root package name */
        public final H f17531a;

        /* renamed from: b  reason: collision with root package name */
        public final int f17532b;

        /* renamed from: c  reason: collision with root package name */
        public final long f17533c;

        public h(H h10, int i10, long j10) {
            this.f17531a = h10;
            this.f17532b = i10;
            this.f17533c = j10;
        }
    }

    public S(q0[] q0VarArr, C c10, D d10, T t10, C2822d dVar, int i10, boolean z10, C2280a aVar, C2190B b10, x xVar, long j10, boolean z11, boolean z12, Looper looper, C2078c cVar, f fVar, u1 u1Var, Looper looper2, ExoPlayer.c cVar2) {
        q0[] q0VarArr2 = q0VarArr;
        C c11 = c10;
        T t11 = t10;
        C2822d dVar2 = dVar;
        C2280a aVar2 = aVar;
        long j11 = j10;
        C2078c cVar3 = cVar;
        u1 u1Var2 = u1Var;
        Looper looper3 = looper2;
        ExoPlayer.c cVar4 = cVar2;
        this.f17502r = fVar;
        this.f17474a = q0VarArr2;
        this.f17477d = c11;
        this.f17478e = d10;
        this.f17479f = t11;
        this.f17481g = dVar2;
        this.f17469H = i10;
        this.f17470I = z10;
        this.f17509y = b10;
        this.f17505u = xVar;
        this.f17506v = j11;
        this.f17494m0 = j11;
        this.f17464C = z11;
        this.f17508x = z12;
        this.f17501q = cVar3;
        this.f17507w = u1Var2;
        this.f17498o0 = cVar4;
        this.f17493m = t11.c(u1Var2);
        this.f17495n = t11.e(u1Var2);
        this.f17500p0 = H.f19735a;
        n0 k10 = n0.k(d10);
        this.f17510z = k10;
        this.f17462A = new e(k10);
        this.f17476c = new r0[q0VarArr2.length];
        r0.a d11 = c10.d();
        for (int i11 = 0; i11 < q0VarArr2.length; i11++) {
            q0VarArr2[i11].D(i11, u1Var2, cVar3);
            this.f17476c[i11] = q0VarArr2[i11].t();
            if (d11 != null) {
                this.f17476c[i11].P(d11);
            }
        }
        this.f17497o = new C1809g(this, cVar3);
        this.f17499p = new ArrayList();
        this.f17475b = a0.h();
        this.f17489k = new H.c();
        this.f17491l = new H.b();
        c11.e(this, dVar2);
        this.f17490k0 = true;
        C2087l d12 = cVar3.d(looper, (Handler.Callback) null);
        this.f17503s = new Y(aVar2, d12, new Q(this), cVar4);
        this.f17504t = new m0(this, aVar2, d12, u1Var2);
        if (looper3 != null) {
            this.f17485i = null;
            this.f17487j = looper3;
        } else {
            HandlerThread handlerThread = new HandlerThread("ExoPlayer:Playback", -16);
            this.f17485i = handlerThread;
            handlerThread.start();
            this.f17487j = handlerThread.getLooper();
        }
        this.f17483h = cVar3.d(this.f17487j, this);
    }

    private long A() {
        n0 n0Var = this.f17510z;
        return D(n0Var.f17754a, n0Var.f17755b.f25960a, n0Var.f17772s);
    }

    private void A0(long j10) {
        long j11;
        V t10 = this.f17503s.t();
        if (t10 == null) {
            j11 = j10 + 1000000000000L;
        } else {
            j11 = t10.B(j10);
        }
        this.f17484h0 = j11;
        this.f17497o.d(j11);
        for (q0 q0Var : this.f17474a) {
            if (V(q0Var)) {
                q0Var.z(this.f17484h0);
            }
        }
        l0();
    }

    private void A1(float f10) {
        for (V t10 = this.f17503s.t(); t10 != null; t10 = t10.k()) {
            for (v2.x xVar : t10.p().f26967c) {
                if (xVar != null) {
                    xVar.d(f10);
                }
            }
        }
    }

    private static void B0(H h10, d dVar, H.c cVar, H.b bVar) {
        long j10;
        int i10 = h10.n(h10.h(dVar.f17519d, bVar).f19746c, cVar).f19781o;
        Object obj = h10.g(i10, bVar, true).f19745b;
        long j11 = bVar.f19747d;
        if (j11 != -9223372036854775807L) {
            j10 = j11 - 1;
        } else {
            j10 = Long.MAX_VALUE;
        }
        dVar.b(i10, j10, obj);
    }

    private synchronized void B1(u uVar, long j10) {
        long a10 = this.f17501q.a() + j10;
        boolean z10 = false;
        while (!((Boolean) uVar.get()).booleanValue() && j10 > 0) {
            try {
                this.f17501q.e();
                wait(j10);
            } catch (InterruptedException unused) {
                z10 = true;
            }
            j10 = a10 - this.f17501q.a();
        }
        if (z10) {
            Thread.currentThread().interrupt();
        }
    }

    private static s[] C(v2.x xVar) {
        int i10;
        if (xVar != null) {
            i10 = xVar.length();
        } else {
            i10 = 0;
        }
        s[] sVarArr = new s[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            sVarArr[i11] = xVar.b(i11);
        }
        return sVarArr;
    }

    private static boolean C0(d dVar, H h10, H h11, int i10, boolean z10, H.c cVar, H.b bVar) {
        long j10;
        d dVar2 = dVar;
        H h12 = h10;
        H h13 = h11;
        H.c cVar2 = cVar;
        H.b bVar2 = bVar;
        Object obj = dVar2.f17519d;
        if (obj == null) {
            if (dVar2.f17516a.f() == Long.MIN_VALUE) {
                j10 = -9223372036854775807L;
            } else {
                j10 = L.L0(dVar2.f17516a.f());
            }
            Pair F02 = F0(h10, new h(dVar2.f17516a.h(), dVar2.f17516a.d(), j10), false, i10, z10, cVar, bVar);
            if (F02 == null) {
                return false;
            }
            dVar.b(h12.b(F02.first), ((Long) F02.second).longValue(), F02.first);
            if (dVar2.f17516a.f() == Long.MIN_VALUE) {
                B0(h12, dVar, cVar2, bVar2);
            }
            return true;
        }
        int b10 = h12.b(obj);
        if (b10 == -1) {
            return false;
        }
        if (dVar2.f17516a.f() == Long.MIN_VALUE) {
            B0(h12, dVar, cVar2, bVar2);
            return true;
        }
        dVar2.f17517b = b10;
        h13.h(dVar2.f17519d, bVar2);
        if (bVar2.f19749f && h13.n(bVar2.f19746c, cVar2).f19780n == h13.b(dVar2.f17519d)) {
            long n10 = dVar2.f17518c + bVar.n();
            Pair j11 = h10.j(cVar, bVar, h12.h(dVar2.f17519d, bVar2).f19746c, n10);
            dVar.b(h12.b(j11.first), ((Long) j11.second).longValue(), j11.first);
        }
        return true;
    }

    private long D(H h10, Object obj, long j10) {
        h10.n(h10.h(obj, this.f17491l).f19746c, this.f17489k);
        H.c cVar = this.f17489k;
        if (cVar.f19772f != -9223372036854775807L && cVar.f()) {
            H.c cVar2 = this.f17489k;
            if (cVar2.f19775i) {
                return L.L0(cVar2.a() - this.f17489k.f19772f) - (j10 + this.f17491l.n());
            }
        }
        return -9223372036854775807L;
    }

    private void D0(H h10, H h11) {
        if (!h10.q() || !h11.q()) {
            for (int size = this.f17499p.size() - 1; size >= 0; size--) {
                if (!C0((d) this.f17499p.get(size), h10, h11, this.f17469H, this.f17470I, this.f17489k, this.f17491l)) {
                    ((d) this.f17499p.get(size)).f17516a.k(false);
                    this.f17499p.remove(size);
                }
            }
            Collections.sort(this.f17499p);
        }
    }

    private long E() {
        V u10 = this.f17503s.u();
        if (u10 == null) {
            return 0;
        }
        long m10 = u10.m();
        if (!u10.f17552d) {
            return m10;
        }
        int i10 = 0;
        while (true) {
            q0[] q0VarArr = this.f17474a;
            if (i10 >= q0VarArr.length) {
                return m10;
            }
            if (V(q0VarArr[i10]) && this.f17474a[i10].x() == u10.f17551c[i10]) {
                long y10 = this.f17474a[i10].y();
                if (y10 == Long.MIN_VALUE) {
                    return Long.MIN_VALUE;
                }
                m10 = Math.max(y10, m10);
            }
            i10++;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:48:0x0150  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x016e  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x01ba  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static androidx.media3.exoplayer.S.g E0(f2.H r30, androidx.media3.exoplayer.n0 r31, androidx.media3.exoplayer.S.h r32, androidx.media3.exoplayer.Y r33, int r34, boolean r35, f2.H.c r36, f2.H.b r37) {
        /*
            r7 = r30
            r8 = r31
            r9 = r32
            r10 = r35
            r11 = r37
            boolean r0 = r30.q()
            if (r0 == 0) goto L_0x0025
            androidx.media3.exoplayer.S$g r0 = new androidx.media3.exoplayer.S$g
            t2.C$b r2 = androidx.media3.exoplayer.n0.l()
            r8 = 1
            r9 = 0
            r3 = 0
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r7 = 0
            r1 = r0
            r1.<init>(r2, r3, r5, r7, r8, r9)
            return r0
        L_0x0025:
            t2.C$b r14 = r8.f17755b
            java.lang.Object r12 = r14.f25960a
            boolean r13 = X(r8, r11)
            t2.C$b r0 = r8.f17755b
            boolean r0 = r0.b()
            if (r0 != 0) goto L_0x003c
            if (r13 == 0) goto L_0x0038
            goto L_0x003c
        L_0x0038:
            long r0 = r8.f17772s
        L_0x003a:
            r15 = r0
            goto L_0x003f
        L_0x003c:
            long r0 = r8.f17756c
            goto L_0x003a
        L_0x003f:
            r17 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r19 = 0
            r6 = -1
            r20 = 1
            if (r9 == 0) goto L_0x00a5
            r2 = 1
            r0 = r30
            r1 = r32
            r3 = r34
            r4 = r35
            r5 = r36
            r21 = r14
            r14 = r6
            r6 = r37
            android.util.Pair r0 = F0(r0, r1, r2, r3, r4, r5, r6)
            if (r0 != 0) goto L_0x006d
            int r0 = r7.a(r10)
            r6 = r0
            r0 = r15
            r2 = r19
            r3 = r2
            r4 = r20
            goto L_0x0098
        L_0x006d:
            long r1 = r9.f17533c
            int r1 = (r1 > r17 ? 1 : (r1 == r17 ? 0 : -1))
            if (r1 != 0) goto L_0x007f
            java.lang.Object r0 = r0.first
            f2.H$b r0 = r7.h(r0, r11)
            int r6 = r0.f19746c
            r0 = r15
            r2 = r19
            goto L_0x008c
        L_0x007f:
            java.lang.Object r12 = r0.first
            java.lang.Object r0 = r0.second
            java.lang.Long r0 = (java.lang.Long) r0
            long r0 = r0.longValue()
            r6 = r14
            r2 = r20
        L_0x008c:
            int r3 = r8.f17758e
            r4 = 4
            if (r3 != r4) goto L_0x0094
            r3 = r20
            goto L_0x0096
        L_0x0094:
            r3 = r19
        L_0x0096:
            r4 = r19
        L_0x0098:
            r9 = r36
            r29 = r2
            r27 = r3
            r28 = r4
            r3 = r6
        L_0x00a1:
            r6 = r21
            goto L_0x014e
        L_0x00a5:
            r21 = r14
            r14 = r6
            f2.H r0 = r8.f17754a
            boolean r0 = r0.q()
            if (r0 == 0) goto L_0x00bf
            int r0 = r7.a(r10)
        L_0x00b4:
            r9 = r36
            r3 = r0
            r0 = r15
            r27 = r19
            r28 = r27
            r29 = r28
            goto L_0x00a1
        L_0x00bf:
            int r0 = r7.b(r12)
            if (r0 != r14) goto L_0x00ec
            f2.H r5 = r8.f17754a
            r0 = r36
            r1 = r37
            r2 = r34
            r3 = r35
            r4 = r12
            r6 = r30
            int r0 = G0(r0, r1, r2, r3, r4, r5, r6)
            if (r0 != r14) goto L_0x00df
            int r0 = r7.a(r10)
            r4 = r20
            goto L_0x00e1
        L_0x00df:
            r4 = r19
        L_0x00e1:
            r9 = r36
            r3 = r0
            r28 = r4
            r0 = r15
            r27 = r19
            r29 = r27
            goto L_0x00a1
        L_0x00ec:
            int r0 = (r15 > r17 ? 1 : (r15 == r17 ? 0 : -1))
            if (r0 != 0) goto L_0x00f7
            f2.H$b r0 = r7.h(r12, r11)
            int r0 = r0.f19746c
            goto L_0x00b4
        L_0x00f7:
            if (r13 == 0) goto L_0x0142
            f2.H r0 = r8.f17754a
            r6 = r21
            java.lang.Object r1 = r6.f25960a
            r0.h(r1, r11)
            f2.H r0 = r8.f17754a
            int r1 = r11.f19746c
            r9 = r36
            f2.H$c r0 = r0.n(r1, r9)
            int r0 = r0.f19780n
            f2.H r1 = r8.f17754a
            java.lang.Object r2 = r6.f25960a
            int r1 = r1.b(r2)
            if (r0 != r1) goto L_0x0139
            long r0 = r37.n()
            long r4 = r15 + r0
            f2.H$b r0 = r7.h(r12, r11)
            int r3 = r0.f19746c
            r0 = r30
            r1 = r36
            r2 = r37
            android.util.Pair r0 = r0.j(r1, r2, r3, r4)
            java.lang.Object r12 = r0.first
            java.lang.Object r0 = r0.second
            java.lang.Long r0 = (java.lang.Long) r0
            long r0 = r0.longValue()
            goto L_0x013a
        L_0x0139:
            r0 = r15
        L_0x013a:
            r3 = r14
            r27 = r19
            r28 = r27
            r29 = r20
            goto L_0x014e
        L_0x0142:
            r9 = r36
            r6 = r21
            r3 = r14
            r0 = r15
            r27 = r19
            r28 = r27
            r29 = r28
        L_0x014e:
            if (r3 == r14) goto L_0x016e
            r4 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r0 = r30
            r1 = r36
            r2 = r37
            android.util.Pair r0 = r0.j(r1, r2, r3, r4)
            java.lang.Object r12 = r0.first
            java.lang.Object r0 = r0.second
            java.lang.Long r0 = (java.lang.Long) r0
            long r0 = r0.longValue()
            r2 = r33
            r25 = r17
            goto L_0x0172
        L_0x016e:
            r2 = r33
            r25 = r0
        L_0x0172:
            t2.C$b r2 = r2.L(r7, r12, r0)
            int r3 = r2.f25964e
            if (r3 == r14) goto L_0x0184
            int r4 = r6.f25964e
            if (r4 == r14) goto L_0x0181
            if (r3 < r4) goto L_0x0181
            goto L_0x0184
        L_0x0181:
            r3 = r19
            goto L_0x0186
        L_0x0184:
            r3 = r20
        L_0x0186:
            java.lang.Object r4 = r6.f25960a
            boolean r4 = r4.equals(r12)
            if (r4 == 0) goto L_0x019d
            boolean r4 = r6.b()
            if (r4 != 0) goto L_0x019d
            boolean r4 = r2.b()
            if (r4 != 0) goto L_0x019d
            if (r3 == 0) goto L_0x019d
            goto L_0x019f
        L_0x019d:
            r20 = r19
        L_0x019f:
            f2.H$b r17 = r7.h(r12, r11)
            r12 = r13
            r13 = r6
            r3 = r6
            r14 = r15
            r16 = r2
            r18 = r25
            boolean r4 = T(r12, r13, r14, r16, r17, r18)
            if (r20 != 0) goto L_0x01b3
            if (r4 == 0) goto L_0x01b4
        L_0x01b3:
            r2 = r3
        L_0x01b4:
            boolean r4 = r2.b()
            if (r4 == 0) goto L_0x01c2
            boolean r0 = r2.equals(r3)
            if (r0 == 0) goto L_0x01c5
            long r0 = r8.f17772s
        L_0x01c2:
            r23 = r0
            goto L_0x01dc
        L_0x01c5:
            java.lang.Object r0 = r2.f25960a
            r7.h(r0, r11)
            int r0 = r2.f25962c
            int r1 = r2.f25961b
            int r1 = r11.k(r1)
            if (r0 != r1) goto L_0x01d9
            long r0 = r37.g()
            goto L_0x01c2
        L_0x01d9:
            r0 = 0
            goto L_0x01c2
        L_0x01dc:
            androidx.media3.exoplayer.S$g r0 = new androidx.media3.exoplayer.S$g
            r21 = r0
            r22 = r2
            r21.<init>(r22, r23, r25, r27, r28, r29)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.S.E0(f2.H, androidx.media3.exoplayer.n0, androidx.media3.exoplayer.S$h, androidx.media3.exoplayer.Y, int, boolean, f2.H$c, f2.H$b):androidx.media3.exoplayer.S$g");
    }

    private Pair F(H h10) {
        long j10 = 0;
        if (h10.q()) {
            return Pair.create(n0.l(), 0L);
        }
        H h11 = h10;
        Pair j11 = h11.j(this.f17489k, this.f17491l, h10.a(this.f17470I), -9223372036854775807L);
        C2615C.b L10 = this.f17503s.L(h10, j11.first, 0);
        long longValue = ((Long) j11.second).longValue();
        if (L10.b()) {
            h10.h(L10.f25960a, this.f17491l);
            if (L10.f25962c == this.f17491l.k(L10.f25961b)) {
                j10 = this.f17491l.g();
            }
            longValue = j10;
        }
        return Pair.create(L10, Long.valueOf(longValue));
    }

    private static Pair F0(H h10, h hVar, boolean z10, int i10, boolean z11, H.c cVar, H.b bVar) {
        H h11;
        int G02;
        H h12 = h10;
        h hVar2 = hVar;
        H.b bVar2 = bVar;
        H h13 = hVar2.f17531a;
        if (h10.q()) {
            return null;
        }
        if (h13.q()) {
            h11 = h12;
        } else {
            h11 = h13;
        }
        try {
            Pair j10 = h11.j(cVar, bVar, hVar2.f17532b, hVar2.f17533c);
            if (h10.equals(h11)) {
                return j10;
            }
            if (h10.b(j10.first) == -1) {
                H.c cVar2 = cVar;
                if (z10 && (G02 = G0(cVar, bVar, i10, z11, j10.first, h11, h10)) != -1) {
                    return h10.j(cVar, bVar, G02, -9223372036854775807L);
                }
                return null;
            } else if (!h11.h(j10.first, bVar2).f19749f || h11.n(bVar2.f19746c, cVar).f19780n != h11.b(j10.first)) {
                return j10;
            } else {
                return h10.j(cVar, bVar, h10.h(j10.first, bVar2).f19746c, hVar2.f17533c);
            }
        } catch (IndexOutOfBoundsException unused) {
        }
    }

    static int G0(H.c cVar, H.b bVar, int i10, boolean z10, Object obj, H h10, H h11) {
        Object obj2 = h10.n(h10.h(obj, bVar).f19746c, cVar).f19767a;
        for (int i11 = 0; i11 < h11.p(); i11++) {
            if (h11.n(i11, cVar).f19767a.equals(obj2)) {
                return i11;
            }
        }
        int b10 = h10.b(obj);
        int i12 = h10.i();
        int i13 = b10;
        int i14 = -1;
        for (int i15 = 0; i15 < i12 && i14 == -1; i15++) {
            i13 = h10.d(i13, bVar, cVar, i10, z10);
            if (i13 == -1) {
                break;
            }
            i14 = h11.b(h10.m(i13));
        }
        if (i14 == -1) {
            return -1;
        }
        return h11.f(i14, bVar).f19746c;
    }

    private long H() {
        return I(this.f17510z.f17770q);
    }

    private void H0(long j10) {
        long j11;
        if (this.f17510z.f17758e != 3 || (!this.f17508x && m1())) {
            j11 = f17461q0;
        } else {
            j11 = 1000;
        }
        if (this.f17508x && m1()) {
            for (q0 q0Var : this.f17474a) {
                if (V(q0Var)) {
                    j11 = Math.min(j11, L.h1(q0Var.M(this.f17484h0, this.f17486i0)));
                }
            }
        }
        this.f17483h.h(2, j10 + j11);
    }

    private long I(long j10) {
        V m10 = this.f17503s.m();
        if (m10 == null) {
            return 0;
        }
        return Math.max(0, j10 - m10.A(this.f17484h0));
    }

    private void J(C2614B b10) {
        if (this.f17503s.B(b10)) {
            this.f17503s.F(this.f17484h0);
            a0();
        }
    }

    private void J0(boolean z10) {
        C2615C.b bVar = this.f17503s.t().f17554f.f17564a;
        long M02 = M0(bVar, this.f17510z.f17772s, true, false);
        if (M02 != this.f17510z.f17772s) {
            n0 n0Var = this.f17510z;
            this.f17510z = Q(bVar, M02, n0Var.f17756c, n0Var.f17757d, z10, 5);
        }
    }

    private void K(IOException iOException, int i10) {
        C1810h c10 = C1810h.c(iOException, i10);
        V t10 = this.f17503s.t();
        if (t10 != null) {
            c10 = c10.a(t10.f17554f.f17564a);
        }
        p.d("ExoPlayerImplInternal", "Playback error", c10);
        r1(false, false);
        this.f17510z = this.f17510z.f(c10);
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x00ac A[Catch:{ all -> 0x00af }] */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x00b3 A[Catch:{ all -> 0x00af }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void K0(androidx.media3.exoplayer.S.h r19) {
        /*
            r18 = this;
            r11 = r18
            r0 = r19
            androidx.media3.exoplayer.S$e r1 = r11.f17462A
            r8 = 1
            r1.b(r8)
            androidx.media3.exoplayer.n0 r1 = r11.f17510z
            f2.H r1 = r1.f17754a
            int r4 = r11.f17469H
            boolean r5 = r11.f17470I
            f2.H$c r6 = r11.f17489k
            f2.H$b r7 = r11.f17491l
            r3 = 1
            r2 = r19
            android.util.Pair r1 = F0(r1, r2, r3, r4, r5, r6, r7)
            r2 = 0
            r4 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r6 = 0
            if (r1 != 0) goto L_0x004c
            androidx.media3.exoplayer.n0 r7 = r11.f17510z
            f2.H r7 = r7.f17754a
            android.util.Pair r7 = r11.F(r7)
            java.lang.Object r9 = r7.first
            t2.C$b r9 = (t2.C2615C.b) r9
            java.lang.Object r7 = r7.second
            java.lang.Long r7 = (java.lang.Long) r7
            long r12 = r7.longValue()
            androidx.media3.exoplayer.n0 r7 = r11.f17510z
            f2.H r7 = r7.f17754a
            boolean r7 = r7.q()
            r7 = r7 ^ r8
            r10 = r7
            r16 = r4
        L_0x0047:
            r4 = r12
            r12 = r16
            goto L_0x00a2
        L_0x004c:
            java.lang.Object r7 = r1.first
            java.lang.Object r9 = r1.second
            java.lang.Long r9 = (java.lang.Long) r9
            long r12 = r9.longValue()
            long r9 = r0.f17533c
            int r9 = (r9 > r4 ? 1 : (r9 == r4 ? 0 : -1))
            if (r9 != 0) goto L_0x005e
            r9 = r4
            goto L_0x005f
        L_0x005e:
            r9 = r12
        L_0x005f:
            androidx.media3.exoplayer.Y r14 = r11.f17503s
            androidx.media3.exoplayer.n0 r15 = r11.f17510z
            f2.H r15 = r15.f17754a
            t2.C$b r7 = r14.L(r15, r7, r12)
            boolean r14 = r7.b()
            if (r14 == 0) goto L_0x0094
            androidx.media3.exoplayer.n0 r4 = r11.f17510z
            f2.H r4 = r4.f17754a
            java.lang.Object r5 = r7.f25960a
            f2.H$b r12 = r11.f17491l
            r4.h(r5, r12)
            f2.H$b r4 = r11.f17491l
            int r5 = r7.f25961b
            int r4 = r4.k(r5)
            int r5 = r7.f25962c
            if (r4 != r5) goto L_0x008e
            f2.H$b r4 = r11.f17491l
            long r4 = r4.g()
            r12 = r4
            goto L_0x008f
        L_0x008e:
            r12 = r2
        L_0x008f:
            r4 = r12
            r12 = r9
            r9 = r7
            r10 = r8
            goto L_0x00a2
        L_0x0094:
            long r14 = r0.f17533c
            int r4 = (r14 > r4 ? 1 : (r14 == r4 ? 0 : -1))
            if (r4 != 0) goto L_0x009c
            r4 = r8
            goto L_0x009d
        L_0x009c:
            r4 = r6
        L_0x009d:
            r16 = r9
            r10 = r4
            r9 = r7
            goto L_0x0047
        L_0x00a2:
            androidx.media3.exoplayer.n0 r7 = r11.f17510z     // Catch:{ all -> 0x00af }
            f2.H r7 = r7.f17754a     // Catch:{ all -> 0x00af }
            boolean r7 = r7.q()     // Catch:{ all -> 0x00af }
            if (r7 == 0) goto L_0x00b3
            r11.f17482g0 = r0     // Catch:{ all -> 0x00af }
            goto L_0x00c2
        L_0x00af:
            r0 = move-exception
            r7 = r4
            goto L_0x014a
        L_0x00b3:
            r0 = 4
            if (r1 != 0) goto L_0x00c5
            androidx.media3.exoplayer.n0 r1 = r11.f17510z     // Catch:{ all -> 0x00af }
            int r1 = r1.f17758e     // Catch:{ all -> 0x00af }
            if (r1 == r8) goto L_0x00bf
            r11.j1(r0)     // Catch:{ all -> 0x00af }
        L_0x00bf:
            r11.y0(r6, r8, r6, r8)     // Catch:{ all -> 0x00af }
        L_0x00c2:
            r7 = r4
            goto L_0x0139
        L_0x00c5:
            androidx.media3.exoplayer.n0 r1 = r11.f17510z     // Catch:{ all -> 0x00af }
            t2.C$b r1 = r1.f17755b     // Catch:{ all -> 0x00af }
            boolean r1 = r9.equals(r1)     // Catch:{ all -> 0x00af }
            if (r1 == 0) goto L_0x0114
            androidx.media3.exoplayer.Y r1 = r11.f17503s     // Catch:{ all -> 0x00af }
            androidx.media3.exoplayer.V r1 = r1.t()     // Catch:{ all -> 0x00af }
            if (r1 == 0) goto L_0x00e8
            boolean r7 = r1.f17552d     // Catch:{ all -> 0x00af }
            if (r7 == 0) goto L_0x00e8
            int r2 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r2 == 0) goto L_0x00e8
            t2.B r1 = r1.f17549a     // Catch:{ all -> 0x00af }
            m2.B r2 = r11.f17509y     // Catch:{ all -> 0x00af }
            long r1 = r1.s(r4, r2)     // Catch:{ all -> 0x00af }
            goto L_0x00e9
        L_0x00e8:
            r1 = r4
        L_0x00e9:
            long r14 = i2.L.h1(r1)     // Catch:{ all -> 0x00af }
            androidx.media3.exoplayer.n0 r3 = r11.f17510z     // Catch:{ all -> 0x00af }
            long r6 = r3.f17772s     // Catch:{ all -> 0x00af }
            long r6 = i2.L.h1(r6)     // Catch:{ all -> 0x00af }
            int r3 = (r14 > r6 ? 1 : (r14 == r6 ? 0 : -1))
            if (r3 != 0) goto L_0x0115
            androidx.media3.exoplayer.n0 r3 = r11.f17510z     // Catch:{ all -> 0x00af }
            int r6 = r3.f17758e     // Catch:{ all -> 0x00af }
            r7 = 2
            if (r6 == r7) goto L_0x0103
            r7 = 3
            if (r6 != r7) goto L_0x0115
        L_0x0103:
            long r7 = r3.f17772s     // Catch:{ all -> 0x00af }
            r0 = 2
            r1 = r18
            r2 = r9
            r3 = r7
            r5 = r12
            r9 = r10
            r10 = r0
            androidx.media3.exoplayer.n0 r0 = r1.Q(r2, r3, r5, r7, r9, r10)
            r11.f17510z = r0
            return
        L_0x0114:
            r1 = r4
        L_0x0115:
            androidx.media3.exoplayer.n0 r3 = r11.f17510z     // Catch:{ all -> 0x00af }
            int r3 = r3.f17758e     // Catch:{ all -> 0x00af }
            if (r3 != r0) goto L_0x011d
            r0 = r8
            goto L_0x011e
        L_0x011d:
            r0 = 0
        L_0x011e:
            long r14 = r11.L0(r9, r1, r0)     // Catch:{ all -> 0x00af }
            int r0 = (r4 > r14 ? 1 : (r4 == r14 ? 0 : -1))
            if (r0 == 0) goto L_0x0127
            goto L_0x0128
        L_0x0127:
            r8 = 0
        L_0x0128:
            r10 = r10 | r8
            androidx.media3.exoplayer.n0 r0 = r11.f17510z     // Catch:{ all -> 0x0148 }
            f2.H r4 = r0.f17754a     // Catch:{ all -> 0x0148 }
            t2.C$b r5 = r0.f17755b     // Catch:{ all -> 0x0148 }
            r8 = 1
            r1 = r18
            r2 = r4
            r3 = r9
            r6 = r12
            r1.y1(r2, r3, r4, r5, r6, r8)     // Catch:{ all -> 0x0148 }
            r7 = r14
        L_0x0139:
            r0 = 2
            r1 = r18
            r2 = r9
            r3 = r7
            r5 = r12
            r9 = r10
            r10 = r0
            androidx.media3.exoplayer.n0 r0 = r1.Q(r2, r3, r5, r7, r9, r10)
            r11.f17510z = r0
            return
        L_0x0148:
            r0 = move-exception
            r7 = r14
        L_0x014a:
            r14 = 2
            r1 = r18
            r2 = r9
            r3 = r7
            r5 = r12
            r9 = r10
            r10 = r14
            androidx.media3.exoplayer.n0 r1 = r1.Q(r2, r3, r5, r7, r9, r10)
            r11.f17510z = r1
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.S.K0(androidx.media3.exoplayer.S$h):void");
    }

    private void L(boolean z10) {
        C2615C.b bVar;
        long j10;
        V m10 = this.f17503s.m();
        if (m10 == null) {
            bVar = this.f17510z.f17755b;
        } else {
            bVar = m10.f17554f.f17564a;
        }
        boolean equals = this.f17510z.f17764k.equals(bVar);
        if (!equals) {
            this.f17510z = this.f17510z.c(bVar);
        }
        n0 n0Var = this.f17510z;
        if (m10 == null) {
            j10 = n0Var.f17772s;
        } else {
            j10 = m10.j();
        }
        n0Var.f17770q = j10;
        this.f17510z.f17771r = H();
        if ((!equals || z10) && m10 != null && m10.f17552d) {
            u1(m10.f17554f.f17564a, m10.o(), m10.p());
        }
    }

    private long L0(C2615C.b bVar, long j10, boolean z10) {
        boolean z11;
        if (this.f17503s.t() != this.f17503s.u()) {
            z11 = true;
        } else {
            z11 = false;
        }
        return M0(bVar, j10, z11, z10);
    }

    /* JADX WARNING: Removed duplicated region for block: B:102:0x01be  */
    /* JADX WARNING: Removed duplicated region for block: B:103:0x01c1  */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x01e9  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x00ea  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x00ed  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x012e  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x0131  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x0159  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x0170  */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x019d A[ADDED_TO_REGION] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void M(f2.H r28, boolean r29) {
        /*
            r27 = this;
            r11 = r27
            r12 = r28
            androidx.media3.exoplayer.n0 r2 = r11.f17510z
            androidx.media3.exoplayer.S$h r3 = r11.f17482g0
            androidx.media3.exoplayer.Y r4 = r11.f17503s
            int r5 = r11.f17469H
            boolean r6 = r11.f17470I
            f2.H$c r7 = r11.f17489k
            f2.H$b r8 = r11.f17491l
            r1 = r28
            androidx.media3.exoplayer.S$g r7 = E0(r1, r2, r3, r4, r5, r6, r7, r8)
            t2.C$b r9 = r7.f17525a
            long r13 = r7.f17527c
            boolean r0 = r7.f17528d
            long r5 = r7.f17526b
            androidx.media3.exoplayer.n0 r1 = r11.f17510z
            t2.C$b r1 = r1.f17755b
            boolean r1 = r1.equals(r9)
            r10 = 1
            r15 = 0
            if (r1 == 0) goto L_0x0038
            androidx.media3.exoplayer.n0 r1 = r11.f17510z
            long r1 = r1.f17772s
            int r1 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r1 == 0) goto L_0x0035
            goto L_0x0038
        L_0x0035:
            r16 = r15
            goto L_0x003a
        L_0x0038:
            r16 = r10
        L_0x003a:
            r8 = 2
            r17 = 3
            r18 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r2 = 4
            boolean r1 = r7.f17529e     // Catch:{ all -> 0x0051 }
            if (r1 == 0) goto L_0x005c
            androidx.media3.exoplayer.n0 r1 = r11.f17510z     // Catch:{ all -> 0x0051 }
            int r1 = r1.f17758e     // Catch:{ all -> 0x0051 }
            if (r1 == r10) goto L_0x0059
            r11.j1(r2)     // Catch:{ all -> 0x0051 }
            goto L_0x0059
        L_0x0051:
            r0 = move-exception
            r20 = r2
            r4 = r8
            r8 = 0
            r10 = -1
            goto L_0x0166
        L_0x0059:
            r11.y0(r15, r15, r15, r10)     // Catch:{ all -> 0x0051 }
        L_0x005c:
            androidx.media3.exoplayer.q0[] r1 = r11.f17474a     // Catch:{ all -> 0x0051 }
            int r2 = r1.length     // Catch:{ all -> 0x006a }
            r3 = r15
        L_0x0060:
            if (r3 >= r2) goto L_0x0072
            r4 = r1[r3]     // Catch:{ all -> 0x006a }
            r4.N(r12)     // Catch:{ all -> 0x006a }
            int r3 = r3 + 1
            goto L_0x0060
        L_0x006a:
            r0 = move-exception
            r4 = r8
            r8 = 0
            r10 = -1
            r20 = 4
            goto L_0x0166
        L_0x0072:
            if (r16 != 0) goto L_0x00a0
            androidx.media3.exoplayer.Y r1 = r11.f17503s     // Catch:{ all -> 0x0098 }
            long r3 = r11.f17484h0     // Catch:{ all -> 0x0098 }
            long r23 = r27.E()     // Catch:{ all -> 0x0098 }
            r20 = 4
            r2 = r28
            r10 = -1
            r25 = r5
            r5 = r23
            boolean r0 = r1.R(r2, r3, r5)     // Catch:{ all -> 0x0091 }
            if (r0 != 0) goto L_0x008e
            r11.J0(r15)     // Catch:{ all -> 0x0091 }
        L_0x008e:
            r5 = r25
            goto L_0x00de
        L_0x0091:
            r0 = move-exception
            r4 = r8
            r5 = r25
        L_0x0095:
            r8 = 0
            goto L_0x0166
        L_0x0098:
            r0 = move-exception
            r25 = r5
            r10 = -1
            r20 = 4
        L_0x009e:
            r4 = r8
            goto L_0x0095
        L_0x00a0:
            r25 = r5
            r10 = -1
            r20 = 4
            boolean r1 = r28.q()     // Catch:{ all -> 0x0091 }
            if (r1 != 0) goto L_0x008e
            androidx.media3.exoplayer.Y r1 = r11.f17503s     // Catch:{ all -> 0x00da }
            androidx.media3.exoplayer.V r1 = r1.t()     // Catch:{ all -> 0x00da }
        L_0x00b1:
            if (r1 == 0) goto L_0x00cf
            androidx.media3.exoplayer.W r2 = r1.f17554f     // Catch:{ all -> 0x0091 }
            t2.C$b r2 = r2.f17564a     // Catch:{ all -> 0x0091 }
            boolean r2 = r2.equals(r9)     // Catch:{ all -> 0x0091 }
            if (r2 == 0) goto L_0x00ca
            androidx.media3.exoplayer.Y r2 = r11.f17503s     // Catch:{ all -> 0x0091 }
            androidx.media3.exoplayer.W r3 = r1.f17554f     // Catch:{ all -> 0x0091 }
            androidx.media3.exoplayer.W r2 = r2.v(r12, r3)     // Catch:{ all -> 0x0091 }
            r1.f17554f = r2     // Catch:{ all -> 0x0091 }
            r1.C()     // Catch:{ all -> 0x0091 }
        L_0x00ca:
            androidx.media3.exoplayer.V r1 = r1.k()     // Catch:{ all -> 0x0091 }
            goto L_0x00b1
        L_0x00cf:
            r5 = r25
            long r0 = r11.L0(r9, r5, r0)     // Catch:{ all -> 0x00d8 }
            r22 = r0
            goto L_0x00e0
        L_0x00d8:
            r0 = move-exception
            goto L_0x009e
        L_0x00da:
            r0 = move-exception
            r5 = r25
            goto L_0x009e
        L_0x00de:
            r22 = r5
        L_0x00e0:
            androidx.media3.exoplayer.n0 r0 = r11.f17510z
            f2.H r4 = r0.f17754a
            t2.C$b r5 = r0.f17755b
            boolean r0 = r7.f17530f
            if (r0 == 0) goto L_0x00ed
            r6 = r22
            goto L_0x00ef
        L_0x00ed:
            r6 = r18
        L_0x00ef:
            r0 = 0
            r1 = r27
            r2 = r28
            r3 = r9
            r8 = r0
            r1.y1(r2, r3, r4, r5, r6, r8)
            if (r16 != 0) goto L_0x0103
            androidx.media3.exoplayer.n0 r0 = r11.f17510z
            long r0 = r0.f17756c
            int r0 = (r13 > r0 ? 1 : (r13 == r0 ? 0 : -1))
            if (r0 == 0) goto L_0x0141
        L_0x0103:
            androidx.media3.exoplayer.n0 r0 = r11.f17510z
            t2.C$b r1 = r0.f17755b
            java.lang.Object r1 = r1.f25960a
            f2.H r0 = r0.f17754a
            if (r16 == 0) goto L_0x0122
            if (r29 == 0) goto L_0x0122
            boolean r2 = r0.q()
            if (r2 != 0) goto L_0x0122
            f2.H$b r2 = r11.f17491l
            f2.H$b r0 = r0.h(r1, r2)
            boolean r0 = r0.f19749f
            if (r0 != 0) goto L_0x0122
            r21 = 1
            goto L_0x0124
        L_0x0122:
            r21 = r15
        L_0x0124:
            androidx.media3.exoplayer.n0 r0 = r11.f17510z
            long r7 = r0.f17757d
            int r0 = r12.b(r1)
            if (r0 != r10) goto L_0x0131
            r10 = r20
            goto L_0x0133
        L_0x0131:
            r10 = r17
        L_0x0133:
            r1 = r27
            r2 = r9
            r3 = r22
            r5 = r13
            r9 = r21
            androidx.media3.exoplayer.n0 r0 = r1.Q(r2, r3, r5, r7, r9, r10)
            r11.f17510z = r0
        L_0x0141:
            r27.z0()
            androidx.media3.exoplayer.n0 r0 = r11.f17510z
            f2.H r0 = r0.f17754a
            r11.D0(r12, r0)
            androidx.media3.exoplayer.n0 r0 = r11.f17510z
            androidx.media3.exoplayer.n0 r0 = r0.j(r12)
            r11.f17510z = r0
            boolean r0 = r28.q()
            if (r0 != 0) goto L_0x015c
            r8 = 0
            r11.f17482g0 = r8
        L_0x015c:
            r11.L(r15)
            i2.l r0 = r11.f17483h
            r4 = 2
            r0.g(r4)
            return
        L_0x0166:
            androidx.media3.exoplayer.n0 r1 = r11.f17510z
            f2.H r3 = r1.f17754a
            t2.C$b r2 = r1.f17755b
            boolean r1 = r7.f17530f
            if (r1 == 0) goto L_0x0172
            r18 = r5
        L_0x0172:
            r22 = 0
            r1 = r27
            r7 = r2
            r2 = r28
            r23 = r3
            r3 = r9
            r4 = r23
            r23 = r5
            r5 = r7
            r6 = r18
            r15 = r8
            r8 = r22
            r1.y1(r2, r3, r4, r5, r6, r8)
            if (r16 != 0) goto L_0x0193
            androidx.media3.exoplayer.n0 r1 = r11.f17510z
            long r1 = r1.f17756c
            int r1 = (r13 > r1 ? 1 : (r13 == r1 ? 0 : -1))
            if (r1 == 0) goto L_0x01d1
        L_0x0193:
            androidx.media3.exoplayer.n0 r1 = r11.f17510z
            t2.C$b r2 = r1.f17755b
            java.lang.Object r2 = r2.f25960a
            f2.H r1 = r1.f17754a
            if (r16 == 0) goto L_0x01b2
            if (r29 == 0) goto L_0x01b2
            boolean r3 = r1.q()
            if (r3 != 0) goto L_0x01b2
            f2.H$b r3 = r11.f17491l
            f2.H$b r1 = r1.h(r2, r3)
            boolean r1 = r1.f19749f
            if (r1 != 0) goto L_0x01b2
            r21 = 1
            goto L_0x01b4
        L_0x01b2:
            r21 = 0
        L_0x01b4:
            androidx.media3.exoplayer.n0 r1 = r11.f17510z
            long r7 = r1.f17757d
            int r1 = r12.b(r2)
            if (r1 != r10) goto L_0x01c1
            r10 = r20
            goto L_0x01c3
        L_0x01c1:
            r10 = r17
        L_0x01c3:
            r1 = r27
            r2 = r9
            r3 = r23
            r5 = r13
            r9 = r21
            androidx.media3.exoplayer.n0 r1 = r1.Q(r2, r3, r5, r7, r9, r10)
            r11.f17510z = r1
        L_0x01d1:
            r27.z0()
            androidx.media3.exoplayer.n0 r1 = r11.f17510z
            f2.H r1 = r1.f17754a
            r11.D0(r12, r1)
            androidx.media3.exoplayer.n0 r1 = r11.f17510z
            androidx.media3.exoplayer.n0 r1 = r1.j(r12)
            r11.f17510z = r1
            boolean r1 = r28.q()
            if (r1 != 0) goto L_0x01eb
            r11.f17482g0 = r15
        L_0x01eb:
            r1 = 0
            r11.L(r1)
            i2.l r1 = r11.f17483h
            r2 = 2
            r1.g(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.S.M(f2.H, boolean):void");
    }

    private long M0(C2615C.b bVar, long j10, boolean z10, boolean z11) {
        s1();
        z1(false, true);
        if (z11 || this.f17510z.f17758e == 3) {
            j1(2);
        }
        V t10 = this.f17503s.t();
        V v10 = t10;
        while (v10 != null && !bVar.equals(v10.f17554f.f17564a)) {
            v10 = v10.k();
        }
        if (z10 || t10 != v10 || (v10 != null && v10.B(j10) < 0)) {
            for (q0 s10 : this.f17474a) {
                s(s10);
            }
            if (v10 != null) {
                while (this.f17503s.t() != v10) {
                    this.f17503s.b();
                }
                this.f17503s.I(v10);
                v10.z(1000000000000L);
                v();
            }
        }
        if (v10 != null) {
            this.f17503s.I(v10);
            if (!v10.f17552d) {
                v10.f17554f = v10.f17554f.b(j10);
            } else if (v10.f17553e) {
                j10 = v10.f17549a.g(j10);
                v10.f17549a.o(j10 - this.f17493m, this.f17495n);
            }
            A0(j10);
            a0();
        } else {
            this.f17503s.f();
            A0(j10);
        }
        L(false);
        this.f17483h.g(2);
        return j10;
    }

    private void N(C2614B b10) {
        if (this.f17503s.B(b10)) {
            V m10 = this.f17503s.m();
            m10.q(this.f17497o.c().f19709a, this.f17510z.f17754a);
            u1(m10.f17554f.f17564a, m10.o(), m10.p());
            if (m10 == this.f17503s.t()) {
                A0(m10.f17554f.f17565b);
                v();
                n0 n0Var = this.f17510z;
                C2615C.b bVar = n0Var.f17755b;
                long j10 = m10.f17554f.f17565b;
                this.f17510z = Q(bVar, j10, n0Var.f17756c, j10, false, 5);
            }
            a0();
        }
    }

    private void N0(o0 o0Var) {
        if (o0Var.f() == -9223372036854775807L) {
            O0(o0Var);
        } else if (this.f17510z.f17754a.q()) {
            this.f17499p.add(new d(o0Var));
        } else {
            d dVar = new d(o0Var);
            H h10 = this.f17510z.f17754a;
            if (C0(dVar, h10, h10, this.f17469H, this.f17470I, this.f17489k, this.f17491l)) {
                this.f17499p.add(dVar);
                Collections.sort(this.f17499p);
                return;
            }
            o0Var.k(false);
        }
    }

    private void O(C1963D d10, float f10, boolean z10, boolean z11) {
        if (z10) {
            if (z11) {
                this.f17462A.b(1);
            }
            this.f17510z = this.f17510z.g(d10);
        }
        A1(d10.f19709a);
        for (q0 q0Var : this.f17474a) {
            if (q0Var != null) {
                q0Var.v(f10, d10.f19709a);
            }
        }
    }

    private void O0(o0 o0Var) {
        if (o0Var.c() == this.f17487j) {
            r(o0Var);
            int i10 = this.f17510z.f17758e;
            if (i10 == 3 || i10 == 2) {
                this.f17483h.g(2);
                return;
            }
            return;
        }
        this.f17483h.c(15, o0Var).a();
    }

    private void P(C1963D d10, boolean z10) {
        O(d10, d10.f19709a, true, z10);
    }

    private void P0(o0 o0Var) {
        Looper c10 = o0Var.c();
        if (!c10.getThread().isAlive()) {
            p.h("TAG", "Trying to send message on a dead thread.");
            o0Var.k(false);
            return;
        }
        this.f17501q.d(c10, (Handler.Callback) null).f(new P(this, o0Var));
    }

    private n0 Q(C2615C.b bVar, long j10, long j11, long j12, boolean z10, int i10) {
        boolean z11;
        C4770v vVar;
        D d10;
        j0 j0Var;
        j0 j0Var2;
        D d11;
        C2615C.b bVar2 = bVar;
        long j13 = j11;
        if (this.f17490k0 || j10 != this.f17510z.f17772s || !bVar.equals(this.f17510z.f17755b)) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f17490k0 = z11;
        z0();
        n0 n0Var = this.f17510z;
        j0 j0Var3 = n0Var.f17761h;
        D d12 = n0Var.f17762i;
        List list = n0Var.f17763j;
        if (this.f17504t.t()) {
            V t10 = this.f17503s.t();
            if (t10 == null) {
                j0Var2 = j0.f26269d;
            } else {
                j0Var2 = t10.o();
            }
            if (t10 == null) {
                d11 = this.f17478e;
            } else {
                d11 = t10.p();
            }
            C4770v z12 = z(d11.f26967c);
            if (t10 != null) {
                W w10 = t10.f17554f;
                if (w10.f17566c != j13) {
                    t10.f17554f = w10.a(j13);
                }
            }
            e0();
            j0Var = j0Var2;
            d10 = d11;
            vVar = z12;
        } else if (!bVar.equals(this.f17510z.f17755b)) {
            j0 j0Var4 = j0.f26269d;
            j0Var = j0Var4;
            d10 = this.f17478e;
            vVar = C4770v.E();
        } else {
            vVar = list;
            j0Var = j0Var3;
            d10 = d12;
        }
        if (z10) {
            this.f17462A.d(i10);
        }
        return this.f17510z.d(bVar, j10, j11, j12, H(), j0Var, d10, vVar);
    }

    private void Q0(long j10) {
        for (q0 q0Var : this.f17474a) {
            if (q0Var.x() != null) {
                R0(q0Var, j10);
            }
        }
    }

    private boolean R(q0 q0Var, V v10) {
        V k10 = v10.k();
        if (!v10.f17554f.f17569f || !k10.f17552d || (!(q0Var instanceof C2705i) && !(q0Var instanceof C2592c) && q0Var.y() < k10.n())) {
            return false;
        }
        return true;
    }

    private void R0(q0 q0Var, long j10) {
        q0Var.k();
        if (q0Var instanceof C2705i) {
            ((C2705i) q0Var).E0(j10);
        }
    }

    private boolean S() {
        V u10 = this.f17503s.u();
        if (!u10.f17552d) {
            return false;
        }
        int i10 = 0;
        while (true) {
            q0[] q0VarArr = this.f17474a;
            if (i10 >= q0VarArr.length) {
                return true;
            }
            q0 q0Var = q0VarArr[i10];
            Z z10 = u10.f17551c[i10];
            if (q0Var.x() != z10 || (z10 != null && !q0Var.h() && !R(q0Var, u10))) {
                return false;
            }
            i10++;
        }
        return false;
    }

    private void S0(boolean z10, AtomicBoolean atomicBoolean) {
        if (this.f17471X != z10) {
            this.f17471X = z10;
            if (!z10) {
                for (q0 q0Var : this.f17474a) {
                    if (!V(q0Var) && this.f17475b.remove(q0Var)) {
                        q0Var.reset();
                    }
                }
            }
        }
        if (atomicBoolean != null) {
            synchronized (this) {
                atomicBoolean.set(true);
                notifyAll();
            }
        }
    }

    private static boolean T(boolean z10, C2615C.b bVar, long j10, C2615C.b bVar2, H.b bVar3, long j11) {
        if (z10 || j10 != j11 || !bVar.f25960a.equals(bVar2.f25960a)) {
            return false;
        }
        if (!bVar.b() || !bVar3.r(bVar.f25961b)) {
            if (!bVar2.b() || !bVar3.r(bVar2.f25961b)) {
                return false;
            }
            return true;
        } else if (bVar3.h(bVar.f25961b, bVar.f25962c) == 4 || bVar3.h(bVar.f25961b, bVar.f25962c) == 2) {
            return false;
        } else {
            return true;
        }
    }

    private void T0(C1963D d10) {
        this.f17483h.i(16);
        this.f17497o.f(d10);
    }

    private boolean U() {
        V m10 = this.f17503s.m();
        if (m10 == null || m10.r() || m10.l() == Long.MIN_VALUE) {
            return false;
        }
        return true;
    }

    private void U0(b bVar) {
        this.f17462A.b(1);
        if (bVar.f17514c != -1) {
            this.f17482g0 = new h(new p0(bVar.f17512a, bVar.f17513b), bVar.f17514c, bVar.f17515d);
        }
        M(this.f17504t.C(bVar.f17512a, bVar.f17513b), false);
    }

    private static boolean V(q0 q0Var) {
        if (q0Var.getState() != 0) {
            return true;
        }
        return false;
    }

    private boolean W() {
        V t10 = this.f17503s.t();
        long j10 = t10.f17554f.f17568e;
        if (!t10.f17552d || (j10 != -9223372036854775807L && this.f17510z.f17772s >= j10 && m1())) {
            return false;
        }
        return true;
    }

    private void W0(boolean z10) {
        if (z10 != this.f17473Z) {
            this.f17473Z = z10;
            if (!z10 && this.f17510z.f17769p) {
                this.f17483h.g(2);
            }
        }
    }

    private static boolean X(n0 n0Var, H.b bVar) {
        C2615C.b bVar2 = n0Var.f17755b;
        H h10 = n0Var.f17754a;
        if (h10.q() || h10.h(bVar2.f25960a, bVar).f19749f) {
            return true;
        }
        return false;
    }

    private void X0(boolean z10) {
        this.f17464C = z10;
        z0();
        if (this.f17465D && this.f17503s.u() != this.f17503s.t()) {
            J0(true);
            L(false);
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ Boolean Y() {
        return Boolean.valueOf(this.f17463B);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void Z(o0 o0Var) {
        try {
            r(o0Var);
        } catch (C1810h e10) {
            p.d("ExoPlayerImplInternal", "Unexpected error delivering message on external thread.", e10);
            throw new RuntimeException(e10);
        }
    }

    private void Z0(boolean z10, int i10, boolean z11, int i11) {
        this.f17462A.b(z11 ? 1 : 0);
        this.f17510z = this.f17510z.e(z10, i11, i10);
        z1(false, false);
        m0(z10);
        if (!m1()) {
            s1();
            x1();
            return;
        }
        int i12 = this.f17510z.f17758e;
        if (i12 == 3) {
            this.f17497o.g();
            p1();
            this.f17483h.g(2);
        } else if (i12 == 2) {
            this.f17483h.g(2);
        }
    }

    private void a0() {
        boolean l12 = l1();
        this.f17468G = l12;
        if (l12) {
            this.f17503s.m().e(this.f17484h0, this.f17497o.c().f19709a, this.f17467F);
        }
        t1();
    }

    private void b0() {
        this.f17462A.c(this.f17510z);
        if (this.f17462A.f17520a) {
            this.f17502r.a(this.f17462A);
            this.f17462A = new e(this.f17510z);
        }
    }

    private void b1(C1963D d10) {
        T0(d10);
        P(this.f17497o.c(), true);
    }

    /* JADX WARNING: Removed duplicated region for block: B:42:0x00a8  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x0078 A[EDGE_INSN: B:72:0x0078->B:25:0x0078 ?: BREAK  , SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void c0(long r9, long r11) {
        /*
            r8 = this;
            java.util.ArrayList r0 = r8.f17499p
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x00fc
            androidx.media3.exoplayer.n0 r0 = r8.f17510z
            t2.C$b r0 = r0.f17755b
            boolean r0 = r0.b()
            if (r0 == 0) goto L_0x0014
            goto L_0x00fc
        L_0x0014:
            boolean r0 = r8.f17490k0
            if (r0 == 0) goto L_0x001e
            r0 = 1
            long r9 = r9 - r0
            r0 = 0
            r8.f17490k0 = r0
        L_0x001e:
            androidx.media3.exoplayer.n0 r0 = r8.f17510z
            f2.H r1 = r0.f17754a
            t2.C$b r0 = r0.f17755b
            java.lang.Object r0 = r0.f25960a
            int r0 = r1.b(r0)
            int r1 = r8.f17488j0
            java.util.ArrayList r2 = r8.f17499p
            int r2 = r2.size()
            int r1 = java.lang.Math.min(r1, r2)
            r2 = 0
            if (r1 <= 0) goto L_0x0044
            java.util.ArrayList r3 = r8.f17499p
            int r4 = r1 + -1
            java.lang.Object r3 = r3.get(r4)
            androidx.media3.exoplayer.S$d r3 = (androidx.media3.exoplayer.S.d) r3
            goto L_0x0045
        L_0x0044:
            r3 = r2
        L_0x0045:
            if (r3 == 0) goto L_0x0067
            int r4 = r3.f17517b
            if (r4 > r0) goto L_0x0053
            if (r4 != r0) goto L_0x0067
            long r3 = r3.f17518c
            int r3 = (r3 > r9 ? 1 : (r3 == r9 ? 0 : -1))
            if (r3 <= 0) goto L_0x0067
        L_0x0053:
            int r3 = r1 + -1
            if (r3 <= 0) goto L_0x0062
            java.util.ArrayList r4 = r8.f17499p
            int r1 = r1 + -2
            java.lang.Object r1 = r4.get(r1)
            androidx.media3.exoplayer.S$d r1 = (androidx.media3.exoplayer.S.d) r1
            goto L_0x0063
        L_0x0062:
            r1 = r2
        L_0x0063:
            r7 = r3
            r3 = r1
            r1 = r7
            goto L_0x0045
        L_0x0067:
            java.util.ArrayList r3 = r8.f17499p
            int r3 = r3.size()
            if (r1 >= r3) goto L_0x0078
            java.util.ArrayList r3 = r8.f17499p
            java.lang.Object r3 = r3.get(r1)
            androidx.media3.exoplayer.S$d r3 = (androidx.media3.exoplayer.S.d) r3
            goto L_0x0079
        L_0x0078:
            r3 = r2
        L_0x0079:
            if (r3 == 0) goto L_0x009e
            java.lang.Object r4 = r3.f17519d
            if (r4 == 0) goto L_0x009e
            int r4 = r3.f17517b
            if (r4 < r0) goto L_0x008b
            if (r4 != r0) goto L_0x009e
            long r4 = r3.f17518c
            int r4 = (r4 > r9 ? 1 : (r4 == r9 ? 0 : -1))
            if (r4 > 0) goto L_0x009e
        L_0x008b:
            int r1 = r1 + 1
            java.util.ArrayList r3 = r8.f17499p
            int r3 = r3.size()
            if (r1 >= r3) goto L_0x0078
            java.util.ArrayList r3 = r8.f17499p
            java.lang.Object r3 = r3.get(r1)
            androidx.media3.exoplayer.S$d r3 = (androidx.media3.exoplayer.S.d) r3
            goto L_0x0079
        L_0x009e:
            if (r3 == 0) goto L_0x00fa
            java.lang.Object r4 = r3.f17519d
            if (r4 == 0) goto L_0x00fa
            int r4 = r3.f17517b
            if (r4 != r0) goto L_0x00fa
            long r4 = r3.f17518c
            int r6 = (r4 > r9 ? 1 : (r4 == r9 ? 0 : -1))
            if (r6 <= 0) goto L_0x00fa
            int r4 = (r4 > r11 ? 1 : (r4 == r11 ? 0 : -1))
            if (r4 > 0) goto L_0x00fa
            androidx.media3.exoplayer.o0 r4 = r3.f17516a     // Catch:{ all -> 0x00e3 }
            r8.O0(r4)     // Catch:{ all -> 0x00e3 }
            androidx.media3.exoplayer.o0 r4 = r3.f17516a
            boolean r4 = r4.b()
            if (r4 != 0) goto L_0x00cb
            androidx.media3.exoplayer.o0 r3 = r3.f17516a
            boolean r3 = r3.j()
            if (r3 == 0) goto L_0x00c8
            goto L_0x00cb
        L_0x00c8:
            int r1 = r1 + 1
            goto L_0x00d0
        L_0x00cb:
            java.util.ArrayList r3 = r8.f17499p
            r3.remove(r1)
        L_0x00d0:
            java.util.ArrayList r3 = r8.f17499p
            int r3 = r3.size()
            if (r1 >= r3) goto L_0x00e1
            java.util.ArrayList r3 = r8.f17499p
            java.lang.Object r3 = r3.get(r1)
            androidx.media3.exoplayer.S$d r3 = (androidx.media3.exoplayer.S.d) r3
            goto L_0x009e
        L_0x00e1:
            r3 = r2
            goto L_0x009e
        L_0x00e3:
            r9 = move-exception
            androidx.media3.exoplayer.o0 r10 = r3.f17516a
            boolean r10 = r10.b()
            if (r10 != 0) goto L_0x00f4
            androidx.media3.exoplayer.o0 r10 = r3.f17516a
            boolean r10 = r10.j()
            if (r10 == 0) goto L_0x00f9
        L_0x00f4:
            java.util.ArrayList r10 = r8.f17499p
            r10.remove(r1)
        L_0x00f9:
            throw r9
        L_0x00fa:
            r8.f17488j0 = r1
        L_0x00fc:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.S.c0(long, long):void");
    }

    private void c1(ExoPlayer.c cVar) {
        this.f17498o0 = cVar;
        this.f17503s.Q(this.f17510z.f17754a, cVar);
    }

    private boolean d0() {
        W s10;
        this.f17503s.F(this.f17484h0);
        boolean z10 = false;
        if (this.f17503s.O() && (s10 = this.f17503s.s(this.f17484h0, this.f17510z)) != null) {
            V g10 = this.f17503s.g(s10);
            g10.f17549a.p(this, s10.f17565b);
            if (this.f17503s.t() == g10) {
                A0(s10.f17565b);
            }
            L(false);
            z10 = true;
        }
        if (this.f17468G) {
            this.f17468G = U();
            t1();
        } else {
            a0();
        }
        return z10;
    }

    private void e0() {
        boolean z10;
        V t10 = this.f17503s.t();
        if (t10 != null) {
            D p10 = t10.p();
            boolean z11 = false;
            int i10 = 0;
            boolean z12 = false;
            while (true) {
                if (i10 >= this.f17474a.length) {
                    z10 = true;
                    break;
                }
                if (p10.c(i10)) {
                    if (this.f17474a[i10].e() != 1) {
                        z10 = false;
                        break;
                    } else if (p10.f26966b[i10].f23736a != 0) {
                        z12 = true;
                    }
                }
                i10++;
            }
            if (z12 && z10) {
                z11 = true;
            }
            W0(z11);
        }
    }

    private void e1(int i10) {
        this.f17469H = i10;
        if (!this.f17503s.S(this.f17510z.f17754a, i10)) {
            J0(true);
        }
        L(false);
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0066  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0069 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void f0() {
        /*
            r14 = this;
            r0 = 0
            r1 = r0
        L_0x0002:
            boolean r2 = r14.k1()
            if (r2 == 0) goto L_0x006e
            if (r1 == 0) goto L_0x000d
            r14.b0()
        L_0x000d:
            androidx.media3.exoplayer.Y r1 = r14.f17503s
            androidx.media3.exoplayer.V r1 = r1.b()
            java.lang.Object r1 = i2.C2076a.e(r1)
            androidx.media3.exoplayer.V r1 = (androidx.media3.exoplayer.V) r1
            androidx.media3.exoplayer.n0 r2 = r14.f17510z
            t2.C$b r2 = r2.f17755b
            java.lang.Object r2 = r2.f25960a
            androidx.media3.exoplayer.W r3 = r1.f17554f
            t2.C$b r3 = r3.f17564a
            java.lang.Object r3 = r3.f25960a
            boolean r2 = r2.equals(r3)
            r3 = 1
            if (r2 == 0) goto L_0x0045
            androidx.media3.exoplayer.n0 r2 = r14.f17510z
            t2.C$b r2 = r2.f17755b
            int r4 = r2.f25961b
            r5 = -1
            if (r4 != r5) goto L_0x0045
            androidx.media3.exoplayer.W r4 = r1.f17554f
            t2.C$b r4 = r4.f17564a
            int r6 = r4.f25961b
            if (r6 != r5) goto L_0x0045
            int r2 = r2.f25964e
            int r4 = r4.f25964e
            if (r2 == r4) goto L_0x0045
            r2 = r3
            goto L_0x0046
        L_0x0045:
            r2 = r0
        L_0x0046:
            androidx.media3.exoplayer.W r1 = r1.f17554f
            t2.C$b r5 = r1.f17564a
            long r10 = r1.f17565b
            long r8 = r1.f17566c
            r12 = r2 ^ 1
            r13 = 0
            r4 = r14
            r6 = r10
            androidx.media3.exoplayer.n0 r1 = r4.Q(r5, r6, r8, r10, r12, r13)
            r14.f17510z = r1
            r14.z0()
            r14.x1()
            androidx.media3.exoplayer.n0 r1 = r14.f17510z
            int r1 = r1.f17758e
            r2 = 3
            if (r1 != r2) goto L_0x0069
            r14.p1()
        L_0x0069:
            r14.o()
            r1 = r3
            goto L_0x0002
        L_0x006e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.S.f0():void");
    }

    private void f1(C2190B b10) {
        this.f17509y = b10;
    }

    private void g0(boolean z10) {
        if (this.f17498o0.f17362a == -9223372036854775807L) {
            return;
        }
        if (z10 || !this.f17510z.f17754a.equals(this.f17500p0)) {
            H h10 = this.f17510z.f17754a;
            this.f17500p0 = h10;
            this.f17503s.x(h10);
        }
    }

    private void h0() {
        long j10;
        boolean z10;
        V u10 = this.f17503s.u();
        if (u10 != null) {
            int i10 = 0;
            if (u10.k() == null || this.f17465D) {
                if (u10.f17554f.f17572i || this.f17465D) {
                    while (true) {
                        q0[] q0VarArr = this.f17474a;
                        if (i10 < q0VarArr.length) {
                            q0 q0Var = q0VarArr[i10];
                            Z z11 = u10.f17551c[i10];
                            if (z11 != null && q0Var.x() == z11 && q0Var.h()) {
                                long j11 = u10.f17554f.f17568e;
                                if (j11 == -9223372036854775807L || j11 == Long.MIN_VALUE) {
                                    j10 = -9223372036854775807L;
                                } else {
                                    j10 = u10.m() + u10.f17554f.f17568e;
                                }
                                R0(q0Var, j10);
                            }
                            i10++;
                        } else {
                            return;
                        }
                    }
                }
            } else if (S()) {
                if (u10.k().f17552d || this.f17484h0 >= u10.k().n()) {
                    D p10 = u10.p();
                    V c10 = this.f17503s.c();
                    D p11 = c10.p();
                    H h10 = this.f17510z.f17754a;
                    y1(h10, c10.f17554f.f17564a, h10, u10.f17554f.f17564a, -9223372036854775807L, false);
                    if (!c10.f17552d || c10.f17549a.h() == -9223372036854775807L) {
                        for (int i11 = 0; i11 < this.f17474a.length; i11++) {
                            boolean c11 = p10.c(i11);
                            boolean c12 = p11.c(i11);
                            if (c11 && !this.f17474a[i11].r()) {
                                if (this.f17476c[i11].e() == -2) {
                                    z10 = true;
                                } else {
                                    z10 = false;
                                }
                                z zVar = p10.f26966b[i11];
                                z zVar2 = p11.f26966b[i11];
                                if (!c12 || !zVar2.equals(zVar) || z10) {
                                    R0(this.f17474a[i11], c10.n());
                                }
                            }
                        }
                        return;
                    }
                    Q0(c10.n());
                    if (!c10.s()) {
                        this.f17503s.I(c10);
                        L(false);
                        a0();
                    }
                }
            }
        }
    }

    private void h1(boolean z10) {
        this.f17470I = z10;
        if (!this.f17503s.T(this.f17510z.f17754a, z10)) {
            J0(true);
        }
        L(false);
    }

    private void i0() {
        V u10 = this.f17503s.u();
        if (u10 != null && this.f17503s.t() != u10 && !u10.f17555g && v0()) {
            v();
        }
    }

    private void i1(b0 b0Var) {
        this.f17462A.b(1);
        M(this.f17504t.D(b0Var), false);
    }

    private void j0() {
        M(this.f17504t.i(), true);
    }

    private void j1(int i10) {
        n0 n0Var = this.f17510z;
        if (n0Var.f17758e != i10) {
            if (i10 != 2) {
                this.f17496n0 = -9223372036854775807L;
            }
            this.f17510z = n0Var.h(i10);
        }
    }

    private void k0(c cVar) {
        this.f17462A.b(1);
        throw null;
    }

    private boolean k1() {
        V t10;
        V k10;
        if (m1() && !this.f17465D && (t10 = this.f17503s.t()) != null && (k10 = t10.k()) != null && this.f17484h0 >= k10.n() && k10.f17555g) {
            return true;
        }
        return false;
    }

    private void l0() {
        for (V t10 = this.f17503s.t(); t10 != null; t10 = t10.k()) {
            for (v2.x xVar : t10.p().f26967c) {
                if (xVar != null) {
                    xVar.e();
                }
            }
        }
    }

    private boolean l1() {
        long A10;
        long j10;
        if (!U()) {
            return false;
        }
        V m10 = this.f17503s.m();
        long I10 = I(m10.l());
        if (m10 == this.f17503s.t()) {
            A10 = m10.A(this.f17484h0);
        } else {
            A10 = m10.A(this.f17484h0) - m10.f17554f.f17565b;
        }
        long j11 = A10;
        if (o1(this.f17510z.f17754a, m10.f17554f.f17564a)) {
            j10 = this.f17505u.b();
        } else {
            j10 = -9223372036854775807L;
        }
        T.a aVar = r5;
        T.a aVar2 = new T.a(this.f17507w, this.f17510z.f17754a, m10.f17554f.f17564a, j11, I10, this.f17497o.c().f19709a, this.f17510z.f17765l, this.f17466E, j10);
        boolean g10 = this.f17479f.g(aVar);
        V t10 = this.f17503s.t();
        if (g10 || !t10.f17552d || I10 >= 500000) {
            return g10;
        }
        if (this.f17493m <= 0 && !this.f17495n) {
            return g10;
        }
        t10.f17549a.o(this.f17510z.f17772s, false);
        return this.f17479f.g(aVar);
    }

    private void m0(boolean z10) {
        for (V t10 = this.f17503s.t(); t10 != null; t10 = t10.k()) {
            for (v2.x xVar : t10.p().f26967c) {
                if (xVar != null) {
                    xVar.h(z10);
                }
            }
        }
    }

    private boolean m1() {
        n0 n0Var = this.f17510z;
        if (!n0Var.f17765l || n0Var.f17767n != 0) {
            return false;
        }
        return true;
    }

    private void n(b bVar, int i10) {
        this.f17462A.b(1);
        m0 m0Var = this.f17504t;
        if (i10 == -1) {
            i10 = m0Var.r();
        }
        M(m0Var.f(i10, bVar.f17512a, bVar.f17513b), false);
    }

    private void n0() {
        for (V t10 = this.f17503s.t(); t10 != null; t10 = t10.k()) {
            for (v2.x xVar : t10.p().f26967c) {
                if (xVar != null) {
                    xVar.k();
                }
            }
        }
    }

    private boolean n1(boolean z10) {
        long j10;
        boolean z11;
        boolean z12;
        if (this.f17480f0 == 0) {
            return W();
        }
        if (!z10) {
            return false;
        }
        if (!this.f17510z.f17760g) {
            return true;
        }
        V t10 = this.f17503s.t();
        if (o1(this.f17510z.f17754a, t10.f17554f.f17564a)) {
            j10 = this.f17505u.b();
        } else {
            j10 = -9223372036854775807L;
        }
        long j11 = j10;
        V m10 = this.f17503s.m();
        if (!m10.s() || !m10.f17554f.f17572i) {
            z11 = false;
        } else {
            z11 = true;
        }
        if (!m10.f17554f.f17564a.b() || m10.f17552d) {
            z12 = false;
        } else {
            z12 = true;
        }
        if (z11 || z12 || this.f17479f.b(new T.a(this.f17507w, this.f17510z.f17754a, t10.f17554f.f17564a, t10.A(this.f17484h0), H(), this.f17497o.c().f19709a, this.f17510z.f17765l, this.f17466E, j11))) {
            return true;
        }
        return false;
    }

    private void o() {
        D p10 = this.f17503s.t().p();
        for (int i10 = 0; i10 < this.f17474a.length; i10++) {
            if (p10.c(i10)) {
                this.f17474a[i10].j();
            }
        }
    }

    private boolean o1(H h10, C2615C.b bVar) {
        if (bVar.b() || h10.q()) {
            return false;
        }
        h10.n(h10.h(bVar.f25960a, this.f17491l).f19746c, this.f17489k);
        if (!this.f17489k.f()) {
            return false;
        }
        H.c cVar = this.f17489k;
        if (!cVar.f19775i || cVar.f19772f == -9223372036854775807L) {
            return false;
        }
        return true;
    }

    private void p() {
        x0();
    }

    private void p1() {
        V t10 = this.f17503s.t();
        if (t10 != null) {
            D p10 = t10.p();
            for (int i10 = 0; i10 < this.f17474a.length; i10++) {
                if (p10.c(i10) && this.f17474a[i10].getState() == 1) {
                    this.f17474a[i10].start();
                }
            }
        }
    }

    /* access modifiers changed from: private */
    public V q(W w10, long j10) {
        return new V(this.f17476c, j10, this.f17477d, this.f17479f.a(), this.f17504t, w10, this.f17478e);
    }

    private void q0() {
        int i10;
        this.f17462A.b(1);
        y0(false, false, false, true);
        this.f17479f.i(this.f17507w);
        if (this.f17510z.f17754a.q()) {
            i10 = 4;
        } else {
            i10 = 2;
        }
        j1(i10);
        this.f17504t.w(this.f17481g.a());
        this.f17483h.g(2);
    }

    private void r(o0 o0Var) {
        if (!o0Var.j()) {
            try {
                o0Var.g().p(o0Var.i(), o0Var.e());
            } finally {
                o0Var.k(true);
            }
        }
    }

    private void r1(boolean z10, boolean z11) {
        boolean z12;
        if (z10 || !this.f17471X) {
            z12 = true;
        } else {
            z12 = false;
        }
        y0(z12, false, true, false);
        this.f17462A.b(z11 ? 1 : 0);
        this.f17479f.f(this.f17507w);
        j1(1);
    }

    private void s(q0 q0Var) {
        if (V(q0Var)) {
            this.f17497o.a(q0Var);
            x(q0Var);
            q0Var.disable();
            this.f17480f0--;
        }
    }

    private void s0() {
        try {
            y0(true, false, true, false);
            t0();
            this.f17479f.h(this.f17507w);
            j1(1);
            HandlerThread handlerThread = this.f17485i;
            if (handlerThread != null) {
                handlerThread.quit();
            }
            synchronized (this) {
                this.f17463B = true;
                notifyAll();
            }
        } catch (Throwable th2) {
            HandlerThread handlerThread2 = this.f17485i;
            if (handlerThread2 != null) {
                handlerThread2.quit();
            }
            synchronized (this) {
                this.f17463B = true;
                notifyAll();
                throw th2;
            }
        }
    }

    private void s1() {
        this.f17497o.h();
        for (q0 q0Var : this.f17474a) {
            if (V(q0Var)) {
                x(q0Var);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:112:0x01c3  */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x01c5  */
    /* JADX WARNING: Removed duplicated region for block: B:122:0x01d8  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void t() {
        /*
            r16 = this;
            r0 = r16
            i2.c r1 = r0.f17501q
            long r1 = r1.c()
            i2.l r3 = r0.f17483h
            r4 = 2
            r3.i(r4)
            r16.w1()
            androidx.media3.exoplayer.n0 r3 = r0.f17510z
            int r3 = r3.f17758e
            r5 = 1
            if (r3 == r5) goto L_0x01f9
            r6 = 4
            if (r3 != r6) goto L_0x001d
            goto L_0x01f9
        L_0x001d:
            androidx.media3.exoplayer.Y r3 = r0.f17503s
            androidx.media3.exoplayer.V r3 = r3.t()
            if (r3 != 0) goto L_0x0029
            r0.H0(r1)
            return
        L_0x0029:
            java.lang.String r7 = "doSomeWork"
            i2.H.a(r7)
            r16.x1()
            boolean r7 = r3.f17552d
            r8 = 0
            if (r7 == 0) goto L_0x00ae
            i2.c r7 = r0.f17501q
            long r9 = r7.a()
            long r9 = i2.L.L0(r9)
            r0.f17486i0 = r9
            t2.B r7 = r3.f17549a
            androidx.media3.exoplayer.n0 r9 = r0.f17510z
            long r9 = r9.f17772s
            long r11 = r0.f17493m
            long r9 = r9 - r11
            boolean r11 = r0.f17495n
            r7.o(r9, r11)
            r9 = r5
            r10 = r9
            r7 = r8
        L_0x0053:
            androidx.media3.exoplayer.q0[] r11 = r0.f17474a
            int r12 = r11.length
            if (r7 >= r12) goto L_0x00b5
            r11 = r11[r7]
            boolean r12 = V(r11)
            if (r12 != 0) goto L_0x0061
            goto L_0x00ab
        L_0x0061:
            long r12 = r0.f17484h0
            long r14 = r0.f17486i0
            r11.g(r12, r14)
            if (r9 == 0) goto L_0x0072
            boolean r9 = r11.b()
            if (r9 == 0) goto L_0x0072
            r9 = r5
            goto L_0x0073
        L_0x0072:
            r9 = r8
        L_0x0073:
            t2.Z[] r12 = r3.f17551c
            r12 = r12[r7]
            t2.Z r13 = r11.x()
            if (r12 == r13) goto L_0x007f
            r12 = r5
            goto L_0x0080
        L_0x007f:
            r12 = r8
        L_0x0080:
            if (r12 != 0) goto L_0x008a
            boolean r13 = r11.h()
            if (r13 == 0) goto L_0x008a
            r13 = r5
            goto L_0x008b
        L_0x008a:
            r13 = r8
        L_0x008b:
            if (r12 != 0) goto L_0x009e
            if (r13 != 0) goto L_0x009e
            boolean r12 = r11.d()
            if (r12 != 0) goto L_0x009e
            boolean r12 = r11.b()
            if (r12 == 0) goto L_0x009c
            goto L_0x009e
        L_0x009c:
            r12 = r8
            goto L_0x009f
        L_0x009e:
            r12 = r5
        L_0x009f:
            if (r10 == 0) goto L_0x00a5
            if (r12 == 0) goto L_0x00a5
            r10 = r5
            goto L_0x00a6
        L_0x00a5:
            r10 = r8
        L_0x00a6:
            if (r12 != 0) goto L_0x00ab
            r11.q()
        L_0x00ab:
            int r7 = r7 + 1
            goto L_0x0053
        L_0x00ae:
            t2.B r7 = r3.f17549a
            r7.j()
            r9 = r5
            r10 = r9
        L_0x00b5:
            androidx.media3.exoplayer.W r7 = r3.f17554f
            long r11 = r7.f17568e
            r13 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r9 == 0) goto L_0x00d2
            boolean r7 = r3.f17552d
            if (r7 == 0) goto L_0x00d2
            int r7 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r7 == 0) goto L_0x00d0
            androidx.media3.exoplayer.n0 r7 = r0.f17510z
            long r13 = r7.f17772s
            int r7 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r7 > 0) goto L_0x00d2
        L_0x00d0:
            r7 = r5
            goto L_0x00d3
        L_0x00d2:
            r7 = r8
        L_0x00d3:
            if (r7 == 0) goto L_0x00e3
            boolean r9 = r0.f17465D
            if (r9 == 0) goto L_0x00e3
            r0.f17465D = r8
            androidx.media3.exoplayer.n0 r9 = r0.f17510z
            int r9 = r9.f17767n
            r11 = 5
            r0.Z0(r8, r9, r8, r11)
        L_0x00e3:
            r9 = 3
            if (r7 == 0) goto L_0x00f3
            androidx.media3.exoplayer.W r7 = r3.f17554f
            boolean r7 = r7.f17572i
            if (r7 == 0) goto L_0x00f3
            r0.j1(r6)
            r16.s1()
            goto L_0x0143
        L_0x00f3:
            androidx.media3.exoplayer.n0 r7 = r0.f17510z
            int r7 = r7.f17758e
            if (r7 != r4) goto L_0x0117
            boolean r7 = r0.n1(r10)
            if (r7 == 0) goto L_0x0117
            r0.j1(r9)
            r7 = 0
            r0.f17492l0 = r7
            boolean r7 = r16.m1()
            if (r7 == 0) goto L_0x0143
            r0.z1(r8, r8)
            androidx.media3.exoplayer.g r7 = r0.f17497o
            r7.g()
            r16.p1()
            goto L_0x0143
        L_0x0117:
            androidx.media3.exoplayer.n0 r7 = r0.f17510z
            int r7 = r7.f17758e
            if (r7 != r9) goto L_0x0143
            int r7 = r0.f17480f0
            if (r7 != 0) goto L_0x0128
            boolean r7 = r16.W()
            if (r7 == 0) goto L_0x012a
            goto L_0x0143
        L_0x0128:
            if (r10 != 0) goto L_0x0143
        L_0x012a:
            boolean r7 = r16.m1()
            r0.z1(r7, r8)
            r0.j1(r4)
            boolean r7 = r0.f17466E
            if (r7 == 0) goto L_0x0140
            r16.n0()
            m2.x r7 = r0.f17505u
            r7.c()
        L_0x0140:
            r16.s1()
        L_0x0143:
            androidx.media3.exoplayer.n0 r7 = r0.f17510z
            int r7 = r7.f17758e
            if (r7 != r4) goto L_0x01b0
            r7 = r8
        L_0x014a:
            androidx.media3.exoplayer.q0[] r10 = r0.f17474a
            int r11 = r10.length
            if (r7 >= r11) goto L_0x016f
            r10 = r10[r7]
            boolean r10 = V(r10)
            if (r10 == 0) goto L_0x016c
            androidx.media3.exoplayer.q0[] r10 = r0.f17474a
            r10 = r10[r7]
            t2.Z r10 = r10.x()
            t2.Z[] r11 = r3.f17551c
            r11 = r11[r7]
            if (r10 != r11) goto L_0x016c
            androidx.media3.exoplayer.q0[] r10 = r0.f17474a
            r10 = r10[r7]
            r10.q()
        L_0x016c:
            int r7 = r7 + 1
            goto L_0x014a
        L_0x016f:
            androidx.media3.exoplayer.n0 r3 = r0.f17510z
            boolean r7 = r3.f17760g
            if (r7 != 0) goto L_0x01b0
            long r10 = r3.f17771r
            r12 = 500000(0x7a120, double:2.47033E-318)
            int r3 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r3 >= 0) goto L_0x01b0
            boolean r3 = r16.U()
            if (r3 == 0) goto L_0x01b0
            long r10 = r0.f17496n0
            r12 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r3 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r3 != 0) goto L_0x0198
            i2.c r3 = r0.f17501q
            long r10 = r3.a()
            r0.f17496n0 = r10
            goto L_0x01b7
        L_0x0198:
            i2.c r3 = r0.f17501q
            long r10 = r3.a()
            long r12 = r0.f17496n0
            long r10 = r10 - r12
            r12 = 4000(0xfa0, double:1.9763E-320)
            int r3 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r3 >= 0) goto L_0x01a8
            goto L_0x01b7
        L_0x01a8:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "Playback stuck buffering and not loading"
            r1.<init>(r2)
            throw r1
        L_0x01b0:
            r10 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r0.f17496n0 = r10
        L_0x01b7:
            boolean r3 = r16.m1()
            if (r3 == 0) goto L_0x01c5
            androidx.media3.exoplayer.n0 r3 = r0.f17510z
            int r3 = r3.f17758e
            if (r3 != r9) goto L_0x01c5
            r3 = r5
            goto L_0x01c6
        L_0x01c5:
            r3 = r8
        L_0x01c6:
            boolean r7 = r0.f17473Z
            if (r7 == 0) goto L_0x01d1
            boolean r7 = r0.f17472Y
            if (r7 == 0) goto L_0x01d1
            if (r3 == 0) goto L_0x01d1
            goto L_0x01d2
        L_0x01d1:
            r5 = r8
        L_0x01d2:
            androidx.media3.exoplayer.n0 r7 = r0.f17510z
            boolean r10 = r7.f17769p
            if (r10 == r5) goto L_0x01de
            androidx.media3.exoplayer.n0 r7 = r7.i(r5)
            r0.f17510z = r7
        L_0x01de:
            r0.f17472Y = r8
            if (r5 != 0) goto L_0x01f6
            androidx.media3.exoplayer.n0 r5 = r0.f17510z
            int r5 = r5.f17758e
            if (r5 != r6) goto L_0x01e9
            goto L_0x01f6
        L_0x01e9:
            if (r3 != 0) goto L_0x01f3
            if (r5 == r4) goto L_0x01f3
            if (r5 != r9) goto L_0x01f6
            int r3 = r0.f17480f0
            if (r3 == 0) goto L_0x01f6
        L_0x01f3:
            r0.H0(r1)
        L_0x01f6:
            i2.H.b()
        L_0x01f9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.S.t():void");
    }

    private void t0() {
        for (int i10 = 0; i10 < this.f17474a.length; i10++) {
            this.f17476c[i10].C();
            this.f17474a[i10].release();
        }
    }

    private void t1() {
        boolean z10;
        V m10 = this.f17503s.m();
        if (this.f17468G || (m10 != null && m10.f17549a.b())) {
            z10 = true;
        } else {
            z10 = false;
        }
        n0 n0Var = this.f17510z;
        if (z10 != n0Var.f17760g) {
            this.f17510z = n0Var.b(z10);
        }
    }

    private void u(int i10, boolean z10, long j10) {
        boolean z11;
        boolean z12;
        boolean z13;
        q0 q0Var = this.f17474a[i10];
        if (!V(q0Var)) {
            V u10 = this.f17503s.u();
            if (u10 == this.f17503s.t()) {
                z11 = true;
            } else {
                z11 = false;
            }
            D p10 = u10.p();
            z zVar = p10.f26966b[i10];
            s[] C10 = C(p10.f26967c[i10]);
            if (!m1() || this.f17510z.f17758e != 3) {
                z12 = false;
            } else {
                z12 = true;
            }
            if (z10 || !z12) {
                z13 = false;
            } else {
                z13 = true;
            }
            this.f17480f0++;
            this.f17475b.add(q0Var);
            q0Var.G(zVar, C10, u10.f17551c[i10], this.f17484h0, z13, z11, j10, u10.m(), u10.f17554f.f17564a);
            q0Var.p(11, new a());
            this.f17497o.b(q0Var);
            if (z12 && z11) {
                q0Var.start();
            }
        }
    }

    private void u0(int i10, int i11, b0 b0Var) {
        this.f17462A.b(1);
        M(this.f17504t.A(i10, i11, b0Var), false);
    }

    private void u1(C2615C.b bVar, j0 j0Var, D d10) {
        this.f17479f.d(this.f17507w, this.f17510z.f17754a, bVar, this.f17474a, j0Var, d10.f26967c);
    }

    private void v() {
        w(new boolean[this.f17474a.length], this.f17503s.u().n());
    }

    private boolean v0() {
        boolean z10;
        V u10 = this.f17503s.u();
        D p10 = u10.p();
        int i10 = 0;
        boolean z11 = false;
        while (true) {
            q0[] q0VarArr = this.f17474a;
            if (i10 >= q0VarArr.length) {
                return !z11;
            }
            q0 q0Var = q0VarArr[i10];
            if (V(q0Var)) {
                if (q0Var.x() != u10.f17551c[i10]) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (!p10.c(i10) || z10) {
                    if (!q0Var.r()) {
                        q0Var.O(C(p10.f26967c[i10]), u10.f17551c[i10], u10.n(), u10.m(), u10.f17554f.f17564a);
                        if (this.f17473Z) {
                            W0(false);
                        }
                    } else if (q0Var.b()) {
                        s(q0Var);
                    } else {
                        z11 = true;
                    }
                }
            }
            i10++;
        }
    }

    private void v1(int i10, int i11, List list) {
        this.f17462A.b(1);
        M(this.f17504t.E(i10, i11, list), false);
    }

    private void w(boolean[] zArr, long j10) {
        V u10 = this.f17503s.u();
        D p10 = u10.p();
        for (int i10 = 0; i10 < this.f17474a.length; i10++) {
            if (!p10.c(i10) && this.f17475b.remove(this.f17474a[i10])) {
                this.f17474a[i10].reset();
            }
        }
        for (int i11 = 0; i11 < this.f17474a.length; i11++) {
            if (p10.c(i11)) {
                u(i11, zArr[i11], j10);
            }
        }
        u10.f17555g = true;
    }

    private void w0() {
        boolean z10;
        float f10 = this.f17497o.c().f19709a;
        V t10 = this.f17503s.t();
        V u10 = this.f17503s.u();
        D d10 = null;
        boolean z11 = true;
        while (t10 != null && t10.f17552d) {
            D x10 = t10.x(f10, this.f17510z.f17754a);
            if (t10 == this.f17503s.t()) {
                d10 = x10;
            }
            if (!x10.a(t10.p())) {
                if (z11) {
                    V t11 = this.f17503s.t();
                    boolean I10 = this.f17503s.I(t11);
                    boolean[] zArr = new boolean[this.f17474a.length];
                    long b10 = t11.b((D) C2076a.e(d10), this.f17510z.f17772s, I10, zArr);
                    n0 n0Var = this.f17510z;
                    if (n0Var.f17758e == 4 || b10 == n0Var.f17772s) {
                        z10 = false;
                    } else {
                        z10 = true;
                    }
                    n0 n0Var2 = this.f17510z;
                    long j10 = b10;
                    this.f17510z = Q(n0Var2.f17755b, b10, n0Var2.f17756c, n0Var2.f17757d, z10, 5);
                    if (z10) {
                        A0(j10);
                    }
                    boolean[] zArr2 = new boolean[this.f17474a.length];
                    int i10 = 0;
                    while (true) {
                        q0[] q0VarArr = this.f17474a;
                        if (i10 >= q0VarArr.length) {
                            break;
                        }
                        q0 q0Var = q0VarArr[i10];
                        boolean V10 = V(q0Var);
                        zArr2[i10] = V10;
                        Z z12 = t11.f17551c[i10];
                        if (V10) {
                            if (z12 != q0Var.x()) {
                                s(q0Var);
                            } else if (zArr[i10]) {
                                q0Var.z(this.f17484h0);
                            }
                        }
                        i10++;
                    }
                    w(zArr2, this.f17484h0);
                } else {
                    this.f17503s.I(t10);
                    if (t10.f17552d) {
                        t10.a(x10, Math.max(t10.f17554f.f17565b, t10.A(this.f17484h0)), false);
                    }
                }
                L(true);
                if (this.f17510z.f17758e != 4) {
                    a0();
                    x1();
                    this.f17483h.g(2);
                    return;
                }
                return;
            }
            if (t10 == u10) {
                z11 = false;
            }
            t10 = t10.k();
        }
    }

    private void w1() {
        if (!this.f17510z.f17754a.q() && this.f17504t.t()) {
            boolean d02 = d0();
            h0();
            i0();
            f0();
            g0(d02);
        }
    }

    private void x(q0 q0Var) {
        if (q0Var.getState() == 2) {
            q0Var.stop();
        }
    }

    private void x0() {
        w0();
        J0(true);
    }

    private void x1() {
        long j10;
        boolean z10;
        V t10 = this.f17503s.t();
        if (t10 != null) {
            if (t10.f17552d) {
                j10 = t10.f17549a.h();
            } else {
                j10 = -9223372036854775807L;
            }
            if (j10 != -9223372036854775807L) {
                if (!t10.s()) {
                    this.f17503s.I(t10);
                    L(false);
                    a0();
                }
                A0(j10);
                if (j10 != this.f17510z.f17772s) {
                    n0 n0Var = this.f17510z;
                    this.f17510z = Q(n0Var.f17755b, j10, n0Var.f17756c, j10, true, 5);
                }
            } else {
                C1809g gVar = this.f17497o;
                if (t10 != this.f17503s.u()) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                long i10 = gVar.i(z10);
                this.f17484h0 = i10;
                long A10 = t10.A(i10);
                c0(this.f17510z.f17772s, A10);
                if (this.f17497o.H()) {
                    boolean z11 = !this.f17462A.f17523d;
                    n0 n0Var2 = this.f17510z;
                    this.f17510z = Q(n0Var2.f17755b, A10, n0Var2.f17756c, A10, z11, 6);
                } else {
                    this.f17510z.o(A10);
                }
            }
            this.f17510z.f17770q = this.f17503s.m().j();
            this.f17510z.f17771r = H();
            n0 n0Var3 = this.f17510z;
            if (n0Var3.f17765l && n0Var3.f17758e == 3 && o1(n0Var3.f17754a, n0Var3.f17755b) && this.f17510z.f17768o.f19709a == 1.0f) {
                float a10 = this.f17505u.a(A(), H());
                if (this.f17497o.c().f19709a != a10) {
                    T0(this.f17510z.f17768o.b(a10));
                    O(this.f17510z.f17768o, this.f17497o.c().f19709a, false, false);
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00a0, code lost:
        if (r5.equals(r1.f17510z.f17755b) == false) goto L_0x00a2;
     */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00fb  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0100  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0105  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x010a  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x010f  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0114  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x011b  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x0145  */
    /* JADX WARNING: Removed duplicated region for block: B:67:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void y0(boolean r34, boolean r35, boolean r36, boolean r37) {
        /*
            r33 = this;
            r1 = r33
            i2.l r0 = r1.f17483h
            r2 = 2
            r0.i(r2)
            r2 = 0
            r1.f17492l0 = r2
            r3 = 0
            r4 = 1
            r1.z1(r3, r4)
            androidx.media3.exoplayer.g r0 = r1.f17497o
            r0.h()
            r5 = 1000000000000(0xe8d4a51000, double:4.94065645841E-312)
            r1.f17484h0 = r5
            androidx.media3.exoplayer.q0[] r5 = r1.f17474a
            int r6 = r5.length
            r7 = r3
        L_0x0020:
            java.lang.String r8 = "ExoPlayerImplInternal"
            if (r7 >= r6) goto L_0x0035
            r0 = r5[r7]
            r1.s(r0)     // Catch:{ h -> 0x002c, RuntimeException -> 0x002a }
            goto L_0x0032
        L_0x002a:
            r0 = move-exception
            goto L_0x002d
        L_0x002c:
            r0 = move-exception
        L_0x002d:
            java.lang.String r9 = "Disable failed."
            i2.p.d(r8, r9, r0)
        L_0x0032:
            int r7 = r7 + 1
            goto L_0x0020
        L_0x0035:
            if (r34 == 0) goto L_0x0055
            androidx.media3.exoplayer.q0[] r5 = r1.f17474a
            int r6 = r5.length
            r7 = r3
        L_0x003b:
            if (r7 >= r6) goto L_0x0055
            r0 = r5[r7]
            java.util.Set r9 = r1.f17475b
            boolean r9 = r9.remove(r0)
            if (r9 == 0) goto L_0x0052
            r0.reset()     // Catch:{ RuntimeException -> 0x004b }
            goto L_0x0052
        L_0x004b:
            r0 = move-exception
            r9 = r0
            java.lang.String r0 = "Reset failed."
            i2.p.d(r8, r0, r9)
        L_0x0052:
            int r7 = r7 + 1
            goto L_0x003b
        L_0x0055:
            r1.f17480f0 = r3
            androidx.media3.exoplayer.n0 r0 = r1.f17510z
            t2.C$b r5 = r0.f17755b
            long r6 = r0.f17772s
            androidx.media3.exoplayer.n0 r0 = r1.f17510z
            t2.C$b r0 = r0.f17755b
            boolean r0 = r0.b()
            if (r0 != 0) goto L_0x0077
            androidx.media3.exoplayer.n0 r0 = r1.f17510z
            f2.H$b r8 = r1.f17491l
            boolean r0 = X(r0, r8)
            if (r0 == 0) goto L_0x0072
            goto L_0x0077
        L_0x0072:
            androidx.media3.exoplayer.n0 r0 = r1.f17510z
            long r8 = r0.f17772s
            goto L_0x007b
        L_0x0077:
            androidx.media3.exoplayer.n0 r0 = r1.f17510z
            long r8 = r0.f17756c
        L_0x007b:
            if (r35 == 0) goto L_0x00a6
            r1.f17482g0 = r2
            androidx.media3.exoplayer.n0 r0 = r1.f17510z
            f2.H r0 = r0.f17754a
            android.util.Pair r0 = r1.F(r0)
            java.lang.Object r5 = r0.first
            t2.C$b r5 = (t2.C2615C.b) r5
            java.lang.Object r0 = r0.second
            java.lang.Long r0 = (java.lang.Long) r0
            long r6 = r0.longValue()
            androidx.media3.exoplayer.n0 r0 = r1.f17510z
            t2.C$b r0 = r0.f17755b
            boolean r0 = r5.equals(r0)
            r8 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r0 != 0) goto L_0x00a6
        L_0x00a2:
            r28 = r6
            r9 = r8
            goto L_0x00a8
        L_0x00a6:
            r4 = r3
            goto L_0x00a2
        L_0x00a8:
            androidx.media3.exoplayer.Y r0 = r1.f17503s
            r0.f()
            r1.f17468G = r3
            androidx.media3.exoplayer.n0 r0 = r1.f17510z
            f2.H r0 = r0.f17754a
            if (r36 == 0) goto L_0x00ee
            boolean r3 = r0 instanceof androidx.media3.exoplayer.p0
            if (r3 == 0) goto L_0x00ee
            androidx.media3.exoplayer.p0 r0 = (androidx.media3.exoplayer.p0) r0
            androidx.media3.exoplayer.m0 r3 = r1.f17504t
            t2.b0 r3 = r3.q()
            androidx.media3.exoplayer.p0 r0 = r0.E(r3)
            int r3 = r5.f25961b
            r6 = -1
            if (r3 == r6) goto L_0x00ee
            java.lang.Object r3 = r5.f25960a
            f2.H$b r6 = r1.f17491l
            r0.h(r3, r6)
            f2.H$b r3 = r1.f17491l
            int r3 = r3.f19746c
            f2.H$c r6 = r1.f17489k
            f2.H$c r3 = r0.n(r3, r6)
            boolean r3 = r3.f()
            if (r3 == 0) goto L_0x00ee
            t2.C$b r3 = new t2.C$b
            java.lang.Object r6 = r5.f25960a
            long r7 = r5.f25963d
            r3.<init>(r6, r7)
            r7 = r0
            r19 = r3
            goto L_0x00f1
        L_0x00ee:
            r7 = r0
            r19 = r5
        L_0x00f1:
            androidx.media3.exoplayer.n0 r0 = new androidx.media3.exoplayer.n0
            androidx.media3.exoplayer.n0 r3 = r1.f17510z
            int r13 = r3.f17758e
            if (r37 == 0) goto L_0x00fb
        L_0x00f9:
            r14 = r2
            goto L_0x00fe
        L_0x00fb:
            androidx.media3.exoplayer.h r2 = r3.f17759f
            goto L_0x00f9
        L_0x00fe:
            if (r4 == 0) goto L_0x0105
            t2.j0 r2 = t2.j0.f26269d
        L_0x0102:
            r16 = r2
            goto L_0x0108
        L_0x0105:
            t2.j0 r2 = r3.f17761h
            goto L_0x0102
        L_0x0108:
            if (r4 == 0) goto L_0x010f
            v2.D r2 = r1.f17478e
        L_0x010c:
            r17 = r2
            goto L_0x0112
        L_0x010f:
            v2.D r2 = r3.f17762i
            goto L_0x010c
        L_0x0112:
            if (r4 == 0) goto L_0x011b
            com.google.common.collect.v r2 = com.google.common.collect.C4770v.E()
        L_0x0118:
            r18 = r2
            goto L_0x011e
        L_0x011b:
            java.util.List r2 = r3.f17763j
            goto L_0x0118
        L_0x011e:
            androidx.media3.exoplayer.n0 r2 = r1.f17510z
            boolean r3 = r2.f17765l
            r20 = r3
            int r3 = r2.f17766m
            r21 = r3
            int r3 = r2.f17767n
            r22 = r3
            f2.D r2 = r2.f17768o
            r23 = r2
            r30 = 0
            r32 = 0
            r15 = 0
            r26 = 0
            r6 = r0
            r8 = r19
            r11 = r28
            r24 = r28
            r6.<init>(r7, r8, r9, r11, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r26, r28, r30, r32)
            r1.f17510z = r0
            if (r36 == 0) goto L_0x014f
            androidx.media3.exoplayer.Y r0 = r1.f17503s
            r0.H()
            androidx.media3.exoplayer.m0 r0 = r1.f17504t
            r0.y()
        L_0x014f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.S.y0(boolean, boolean, boolean, boolean):void");
    }

    private void y1(H h10, C2615C.b bVar, H h11, C2615C.b bVar2, long j10, boolean z10) {
        Object obj;
        C1963D d10;
        if (!o1(h10, bVar)) {
            if (bVar.b()) {
                d10 = C1963D.f19706d;
            } else {
                d10 = this.f17510z.f17768o;
            }
            if (!this.f17497o.c().equals(d10)) {
                T0(d10);
                O(this.f17510z.f17768o, d10.f19709a, false, false);
                return;
            }
            return;
        }
        h10.n(h10.h(bVar.f25960a, this.f17491l).f19746c, this.f17489k);
        this.f17505u.e((w.g) L.h(this.f17489k.f19776j));
        if (j10 != -9223372036854775807L) {
            this.f17505u.d(D(h10, bVar.f25960a, j10));
            return;
        }
        Object obj2 = this.f17489k.f19767a;
        if (!h11.q()) {
            obj = h11.n(h11.h(bVar2.f25960a, this.f17491l).f19746c, this.f17489k).f19767a;
        } else {
            obj = null;
        }
        if (!L.c(obj, obj2) || z10) {
            this.f17505u.d(-9223372036854775807L);
        }
    }

    private C4770v z(v2.x[] xVarArr) {
        C4770v.a aVar = new C4770v.a();
        boolean z10 = false;
        for (v2.x xVar : xVarArr) {
            if (xVar != null) {
                f2.z zVar = xVar.b(0).f20080k;
                if (zVar == null) {
                    aVar.a(new f2.z(new z.b[0]));
                } else {
                    aVar.a(zVar);
                    z10 = true;
                }
            }
        }
        if (z10) {
            return aVar.k();
        }
        return C4770v.E();
    }

    private void z0() {
        boolean z10;
        V t10 = this.f17503s.t();
        if (t10 == null || !t10.f17554f.f17571h || !this.f17464C) {
            z10 = false;
        } else {
            z10 = true;
        }
        this.f17465D = z10;
    }

    private void z1(boolean z10, boolean z11) {
        long j10;
        this.f17466E = z10;
        if (!z10 || z11) {
            j10 = -9223372036854775807L;
        } else {
            j10 = this.f17501q.a();
        }
        this.f17467F = j10;
    }

    public void B(C1963D d10) {
        this.f17483h.c(16, d10).a();
    }

    public Looper G() {
        return this.f17487j;
    }

    public void I0(H h10, int i10, long j10) {
        this.f17483h.c(3, new h(h10, i10, j10)).a();
    }

    public void V0(List list, int i10, long j10, b0 b0Var) {
        this.f17483h.c(17, new b(list, b0Var, i10, j10, (a) null)).a();
    }

    public void Y0(boolean z10, int i10, int i11) {
        this.f17483h.e(1, z10 ? 1 : 0, i10 | (i11 << 4)).a();
    }

    public void a() {
        this.f17483h.g(10);
    }

    public void a1(C1963D d10) {
        this.f17483h.c(4, d10).a();
    }

    public void b() {
        this.f17483h.i(2);
        this.f17483h.g(22);
    }

    public void c(q0 q0Var) {
        this.f17483h.g(26);
    }

    public void d1(int i10) {
        this.f17483h.e(11, i10, 0).a();
    }

    public synchronized void e(o0 o0Var) {
        if (!this.f17463B) {
            if (this.f17487j.getThread().isAlive()) {
                this.f17483h.c(14, o0Var).a();
                return;
            }
        }
        p.h("ExoPlayerImplInternal", "Ignoring messages sent after release.");
        o0Var.k(false);
    }

    public void g1(boolean z10) {
        this.f17483h.e(12, z10 ? 1 : 0, 0).a();
    }

    public boolean handleMessage(Message message) {
        int i10;
        V u10;
        int i11;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        int i12 = 1000;
        try {
            switch (message.what) {
                case 1:
                    if (message.arg1 != 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    int i13 = message.arg2;
                    Z0(z10, i13 >> 4, true, i13 & 15);
                    break;
                case 2:
                    t();
                    break;
                case 3:
                    K0((h) message.obj);
                    break;
                case 4:
                    b1((C1963D) message.obj);
                    break;
                case 5:
                    f1((C2190B) message.obj);
                    break;
                case 6:
                    r1(false, true);
                    break;
                case 7:
                    s0();
                    return true;
                case 8:
                    N((C2614B) message.obj);
                    break;
                case 9:
                    J((C2614B) message.obj);
                    break;
                case 10:
                    w0();
                    break;
                case 11:
                    e1(message.arg1);
                    break;
                case 12:
                    if (message.arg1 != 0) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    h1(z11);
                    break;
                case 13:
                    if (message.arg1 != 0) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    S0(z12, (AtomicBoolean) message.obj);
                    break;
                case StdKeyDeserializer.TYPE_URL /*14*/:
                    N0((o0) message.obj);
                    break;
                case StdKeyDeserializer.TYPE_CLASS /*15*/:
                    P0((o0) message.obj);
                    break;
                case 16:
                    P((C1963D) message.obj, false);
                    break;
                case 17:
                    U0((b) message.obj);
                    break;
                case 18:
                    n((b) message.obj, message.arg1);
                    break;
                case 19:
                    android.support.v4.media.session.c.a(message.obj);
                    k0((c) null);
                    break;
                case InboxPagingSource.PAGE_SIZE /*20*/:
                    u0(message.arg1, message.arg2, (b0) message.obj);
                    break;
                case 21:
                    i1((b0) message.obj);
                    break;
                case 22:
                    j0();
                    break;
                case 23:
                    if (message.arg1 != 0) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    X0(z13);
                    break;
                case 25:
                    p();
                    break;
                case 26:
                    x0();
                    break;
                case 27:
                    v1(message.arg1, message.arg2, (List) message.obj);
                    break;
                case 28:
                    c1((ExoPlayer.c) message.obj);
                    break;
                case 29:
                    q0();
                    break;
                default:
                    return false;
            }
        } catch (C1810h e10) {
            e = e10;
            if (e.f17703j == 1 && (u10 = this.f17503s.u()) != null) {
                e = e.a(u10.f17554f.f17564a);
            }
            if (!e.f17709p || !(this.f17492l0 == null || (i10 = e.f19703a) == 5004 || i10 == 5003)) {
                C1810h hVar = this.f17492l0;
                if (hVar != null) {
                    hVar.addSuppressed(e);
                    e = this.f17492l0;
                }
                p.d("ExoPlayerImplInternal", "Playback error", e);
                if (e.f17703j == 1 && this.f17503s.t() != this.f17503s.u()) {
                    while (this.f17503s.t() != this.f17503s.u()) {
                        this.f17503s.b();
                    }
                    b0();
                    W w10 = ((V) C2076a.e(this.f17503s.t())).f17554f;
                    C2615C.b bVar = w10.f17564a;
                    long j10 = w10.f17565b;
                    this.f17510z = Q(bVar, j10, w10.f17566c, j10, true, 0);
                }
                r1(true, false);
                this.f17510z = this.f17510z.f(e);
            } else {
                p.i("ExoPlayerImplInternal", "Recoverable renderer error", e);
                C1810h hVar2 = this.f17492l0;
                if (hVar2 != null) {
                    hVar2.addSuppressed(e);
                    e = this.f17492l0;
                } else {
                    this.f17492l0 = e;
                }
                C2087l lVar = this.f17483h;
                lVar.j(lVar.c(25, e));
            }
        } catch (C2409m.a e11) {
            K(e11, e11.f25287a);
        } catch (C1961B e12) {
            int i14 = e12.f19696b;
            if (i14 != 1) {
                if (i14 == 4) {
                    if (e12.f19695a) {
                        i11 = 3002;
                    } else {
                        i11 = 3004;
                    }
                }
                K(e12, i12);
            } else if (e12.f19695a) {
                i11 = 3001;
            } else {
                i11 = 3003;
            }
            i12 = i11;
            K(e12, i12);
        } catch (k2.g e13) {
            K(e13, e13.f23187a);
        } catch (IOException e14) {
            K(e14, 2000);
        } catch (RuntimeException e15) {
            if ((e15 instanceof IllegalStateException) || (e15 instanceof IllegalArgumentException)) {
                i12 = ErrorCodes.PROTOCOL_EXCEPTION;
            }
            C1810h d10 = C1810h.d(e15, i12);
            p.d("ExoPlayerImplInternal", "Playback error", d10);
            r1(true, false);
            this.f17510z = this.f17510z.f(d10);
        }
        b0();
        return true;
    }

    public void i(C2614B b10) {
        this.f17483h.c(8, b10).a();
    }

    /* renamed from: o0 */
    public void d(C2614B b10) {
        this.f17483h.c(9, b10).a();
    }

    public void p0() {
        this.f17483h.a(29).a();
    }

    public void q1() {
        this.f17483h.a(6).a();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0029, code lost:
        return true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized boolean r0() {
        /*
            r3 = this;
            monitor-enter(r3)
            boolean r0 = r3.f17463B     // Catch:{ all -> 0x0026 }
            if (r0 != 0) goto L_0x0028
            android.os.Looper r0 = r3.f17487j     // Catch:{ all -> 0x0026 }
            java.lang.Thread r0 = r0.getThread()     // Catch:{ all -> 0x0026 }
            boolean r0 = r0.isAlive()     // Catch:{ all -> 0x0026 }
            if (r0 != 0) goto L_0x0012
            goto L_0x0028
        L_0x0012:
            i2.l r0 = r3.f17483h     // Catch:{ all -> 0x0026 }
            r1 = 7
            r0.g(r1)     // Catch:{ all -> 0x0026 }
            androidx.media3.exoplayer.O r0 = new androidx.media3.exoplayer.O     // Catch:{ all -> 0x0026 }
            r0.<init>(r3)     // Catch:{ all -> 0x0026 }
            long r1 = r3.f17506v     // Catch:{ all -> 0x0026 }
            r3.B1(r0, r1)     // Catch:{ all -> 0x0026 }
            boolean r0 = r3.f17463B     // Catch:{ all -> 0x0026 }
            monitor-exit(r3)
            return r0
        L_0x0026:
            r0 = move-exception
            goto L_0x002b
        L_0x0028:
            monitor-exit(r3)
            r0 = 1
            return r0
        L_0x002b:
            monitor-exit(r3)     // Catch:{ all -> 0x0026 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.S.r0():boolean");
    }

    public void y(long j10) {
        this.f17494m0 = j10;
    }
}
