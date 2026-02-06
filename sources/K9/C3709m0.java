package k9;

import D9.a;
import N9.C3053b;
import N9.C3070t;
import N9.O;
import N9.V;
import N9.r;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.util.Pair;
import com.adjust.sdk.network.ErrorCodes;
import com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer;
import com.google.common.collect.C4770v;
import com.google.common.collect.a0;
import ga.A;
import ga.B;
import ia.C3607e;
import ia.C3613k;
import io.intercom.android.sdk.m5.inbox.data.InboxPagingSource;
import ja.C3645a;
import ja.C3648d;
import ja.M;
import ja.o;
import ja.s;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import k9.C3708m;
import k9.C3732y0;
import k9.K0;
import k9.W0;
import k9.a1;
import k9.n1;
import l9.C3747a;
import l9.s0;
import nb.u;
import o9.n;

/* renamed from: k9.m0  reason: case insensitive filesystem */
final class C3709m0 implements Handler.Callback, r.a, A.a, K0.d, C3708m.a, W0.a {

    /* renamed from: A  reason: collision with root package name */
    private boolean f45631A;

    /* renamed from: B  reason: collision with root package name */
    private boolean f45632B;

    /* renamed from: C  reason: collision with root package name */
    private boolean f45633C;

    /* renamed from: D  reason: collision with root package name */
    private boolean f45634D;

    /* renamed from: E  reason: collision with root package name */
    private int f45635E;

    /* renamed from: F  reason: collision with root package name */
    private boolean f45636F;

    /* renamed from: G  reason: collision with root package name */
    private boolean f45637G;
    /* access modifiers changed from: private */

    /* renamed from: H  reason: collision with root package name */
    public boolean f45638H;

    /* renamed from: I  reason: collision with root package name */
    private boolean f45639I;

    /* renamed from: X  reason: collision with root package name */
    private int f45640X;

    /* renamed from: Y  reason: collision with root package name */
    private h f45641Y;

    /* renamed from: Z  reason: collision with root package name */
    private long f45642Z;

    /* renamed from: a  reason: collision with root package name */
    private final a1[] f45643a;

    /* renamed from: b  reason: collision with root package name */
    private final Set f45644b;

    /* renamed from: c  reason: collision with root package name */
    private final b1[] f45645c;

    /* renamed from: d  reason: collision with root package name */
    private final A f45646d;

    /* renamed from: e  reason: collision with root package name */
    private final B f45647e;

    /* renamed from: f  reason: collision with root package name */
    private final C3728w0 f45648f;

    /* renamed from: f0  reason: collision with root package name */
    private int f45649f0;

    /* renamed from: g  reason: collision with root package name */
    private final C3607e f45650g;

    /* renamed from: g0  reason: collision with root package name */
    private boolean f45651g0;
    /* access modifiers changed from: private */

    /* renamed from: h  reason: collision with root package name */
    public final o f45652h;

    /* renamed from: h0  reason: collision with root package name */
    private r f45653h0;

    /* renamed from: i  reason: collision with root package name */
    private final HandlerThread f45654i;

    /* renamed from: i0  reason: collision with root package name */
    private long f45655i0;

    /* renamed from: j  reason: collision with root package name */
    private final Looper f45656j;

    /* renamed from: j0  reason: collision with root package name */
    private long f45657j0 = -9223372036854775807L;

    /* renamed from: k  reason: collision with root package name */
    private final n1.d f45658k;

    /* renamed from: l  reason: collision with root package name */
    private final n1.b f45659l;

    /* renamed from: m  reason: collision with root package name */
    private final long f45660m;

    /* renamed from: n  reason: collision with root package name */
    private final boolean f45661n;

    /* renamed from: o  reason: collision with root package name */
    private final C3708m f45662o;

    /* renamed from: p  reason: collision with root package name */
    private final ArrayList f45663p;

    /* renamed from: q  reason: collision with root package name */
    private final C3648d f45664q;

    /* renamed from: r  reason: collision with root package name */
    private final f f45665r;

    /* renamed from: s  reason: collision with root package name */
    private final H0 f45666s;

    /* renamed from: t  reason: collision with root package name */
    private final K0 f45667t;

    /* renamed from: u  reason: collision with root package name */
    private final C3726v0 f45668u;

    /* renamed from: v  reason: collision with root package name */
    private final long f45669v;

    /* renamed from: w  reason: collision with root package name */
    private e1 f45670w;

    /* renamed from: x  reason: collision with root package name */
    private Q0 f45671x;

    /* renamed from: y  reason: collision with root package name */
    private e f45672y;

    /* renamed from: z  reason: collision with root package name */
    private boolean f45673z;

    /* renamed from: k9.m0$a */
    class a implements a1.a {
        a() {
        }

        public void a() {
            boolean unused = C3709m0.this.f45638H = true;
        }

        public void b() {
            C3709m0.this.f45652h.g(2);
        }
    }

    /* renamed from: k9.m0$b */
    private static final class b {
        /* access modifiers changed from: private */

        /* renamed from: a  reason: collision with root package name */
        public final List f45675a;
        /* access modifiers changed from: private */

        /* renamed from: b  reason: collision with root package name */
        public final O f45676b;
        /* access modifiers changed from: private */

        /* renamed from: c  reason: collision with root package name */
        public final int f45677c;
        /* access modifiers changed from: private */

        /* renamed from: d  reason: collision with root package name */
        public final long f45678d;

        /* synthetic */ b(List list, O o10, int i10, long j10, a aVar) {
            this(list, o10, i10, j10);
        }

        private b(List list, O o10, int i10, long j10) {
            this.f45675a = list;
            this.f45676b = o10;
            this.f45677c = i10;
            this.f45678d = j10;
        }
    }

    /* renamed from: k9.m0$c */
    private static class c {
    }

    /* renamed from: k9.m0$d */
    private static final class d implements Comparable {

        /* renamed from: a  reason: collision with root package name */
        public final W0 f45679a;

        /* renamed from: b  reason: collision with root package name */
        public int f45680b;

        /* renamed from: c  reason: collision with root package name */
        public long f45681c;

        /* renamed from: d  reason: collision with root package name */
        public Object f45682d;

        public d(W0 w02) {
            this.f45679a = w02;
        }

        /* renamed from: a */
        public int compareTo(d dVar) {
            boolean z10;
            boolean z11;
            Object obj = this.f45682d;
            if (obj == null) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (dVar.f45682d == null) {
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
                int i10 = this.f45680b - dVar.f45680b;
                if (i10 != 0) {
                    return i10;
                }
                return M.o(this.f45681c, dVar.f45681c);
            }
        }

        public void b(int i10, long j10, Object obj) {
            this.f45680b = i10;
            this.f45681c = j10;
            this.f45682d = obj;
        }
    }

    /* renamed from: k9.m0$e */
    public static final class e {
        /* access modifiers changed from: private */

        /* renamed from: a  reason: collision with root package name */
        public boolean f45683a;

        /* renamed from: b  reason: collision with root package name */
        public Q0 f45684b;

        /* renamed from: c  reason: collision with root package name */
        public int f45685c;

        /* renamed from: d  reason: collision with root package name */
        public boolean f45686d;

        /* renamed from: e  reason: collision with root package name */
        public int f45687e;

        /* renamed from: f  reason: collision with root package name */
        public boolean f45688f;

        /* renamed from: g  reason: collision with root package name */
        public int f45689g;

        public e(Q0 q02) {
            this.f45684b = q02;
        }

        public void b(int i10) {
            boolean z10;
            boolean z11 = this.f45683a;
            if (i10 > 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.f45683a = z11 | z10;
            this.f45685c += i10;
        }

        public void c(int i10) {
            this.f45683a = true;
            this.f45688f = true;
            this.f45689g = i10;
        }

        public void d(Q0 q02) {
            boolean z10;
            boolean z11 = this.f45683a;
            if (this.f45684b != q02) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.f45683a = z11 | z10;
            this.f45684b = q02;
        }

        public void e(int i10) {
            boolean z10 = true;
            if (!this.f45686d || this.f45687e == 5) {
                this.f45683a = true;
                this.f45686d = true;
                this.f45687e = i10;
                return;
            }
            if (i10 != 5) {
                z10 = false;
            }
            C3645a.a(z10);
        }
    }

    /* renamed from: k9.m0$f */
    public interface f {
        void a(e eVar);
    }

    /* renamed from: k9.m0$g */
    private static final class g {

        /* renamed from: a  reason: collision with root package name */
        public final C3070t.b f45690a;

        /* renamed from: b  reason: collision with root package name */
        public final long f45691b;

        /* renamed from: c  reason: collision with root package name */
        public final long f45692c;

        /* renamed from: d  reason: collision with root package name */
        public final boolean f45693d;

        /* renamed from: e  reason: collision with root package name */
        public final boolean f45694e;

        /* renamed from: f  reason: collision with root package name */
        public final boolean f45695f;

        public g(C3070t.b bVar, long j10, long j11, boolean z10, boolean z11, boolean z12) {
            this.f45690a = bVar;
            this.f45691b = j10;
            this.f45692c = j11;
            this.f45693d = z10;
            this.f45694e = z11;
            this.f45695f = z12;
        }
    }

    /* renamed from: k9.m0$h */
    private static final class h {

        /* renamed from: a  reason: collision with root package name */
        public final n1 f45696a;

        /* renamed from: b  reason: collision with root package name */
        public final int f45697b;

        /* renamed from: c  reason: collision with root package name */
        public final long f45698c;

        public h(n1 n1Var, int i10, long j10) {
            this.f45696a = n1Var;
            this.f45697b = i10;
            this.f45698c = j10;
        }
    }

    public C3709m0(a1[] a1VarArr, A a10, B b10, C3728w0 w0Var, C3607e eVar, int i10, boolean z10, C3747a aVar, e1 e1Var, C3726v0 v0Var, long j10, boolean z11, Looper looper, C3648d dVar, f fVar, s0 s0Var) {
        a1[] a1VarArr2 = a1VarArr;
        C3607e eVar2 = eVar;
        C3747a aVar2 = aVar;
        long j11 = j10;
        C3648d dVar2 = dVar;
        s0 s0Var2 = s0Var;
        this.f45665r = fVar;
        this.f45643a = a1VarArr2;
        this.f45646d = a10;
        this.f45647e = b10;
        this.f45648f = w0Var;
        this.f45650g = eVar2;
        this.f45635E = i10;
        this.f45636F = z10;
        this.f45670w = e1Var;
        this.f45668u = v0Var;
        this.f45669v = j11;
        this.f45655i0 = j11;
        this.f45631A = z11;
        this.f45664q = dVar2;
        this.f45660m = w0Var.e();
        this.f45661n = w0Var.c();
        Q0 j12 = Q0.j(b10);
        this.f45671x = j12;
        this.f45672y = new e(j12);
        this.f45645c = new b1[a1VarArr2.length];
        for (int i11 = 0; i11 < a1VarArr2.length; i11++) {
            a1VarArr2[i11].j(i11, s0Var2);
            this.f45645c[i11] = a1VarArr2[i11].t();
        }
        this.f45662o = new C3708m(this, dVar2);
        this.f45663p = new ArrayList();
        this.f45644b = a0.h();
        this.f45658k = new n1.d();
        this.f45659l = new n1.b();
        a10.b(this, eVar2);
        this.f45651g0 = true;
        Handler handler = new Handler(looper);
        this.f45666s = new H0(aVar2, handler);
        this.f45667t = new K0(this, aVar2, handler, s0Var2);
        HandlerThread handlerThread = new HandlerThread("ExoPlayer:Playback", -16);
        this.f45654i = handlerThread;
        handlerThread.start();
        Looper looper2 = handlerThread.getLooper();
        this.f45656j = looper2;
        this.f45652h = dVar2.d(looper2, this);
    }

    private long A() {
        E0 q10 = this.f45666s.q();
        if (q10 == null) {
            return 0;
        }
        long l10 = q10.l();
        if (!q10.f45268d) {
            return l10;
        }
        int i10 = 0;
        while (true) {
            a1[] a1VarArr = this.f45643a;
            if (i10 >= a1VarArr.length) {
                return l10;
            }
            if (R(a1VarArr[i10]) && this.f45643a[i10].x() == q10.f45267c[i10]) {
                long y10 = this.f45643a[i10].y();
                if (y10 == Long.MIN_VALUE) {
                    return Long.MIN_VALUE;
                }
                l10 = Math.max(y10, l10);
            }
            i10++;
        }
    }

    private void A0(long j10, long j11) {
        this.f45652h.h(2, j10 + j11);
    }

    private Pair B(n1 n1Var) {
        long j10 = 0;
        if (n1Var.u()) {
            return Pair.create(Q0.k(), 0L);
        }
        n1 n1Var2 = n1Var;
        Pair n10 = n1Var2.n(this.f45658k, this.f45659l, n1Var.e(this.f45636F), -9223372036854775807L);
        C3070t.b B10 = this.f45666s.B(n1Var, n10.first, 0);
        long longValue = ((Long) n10.second).longValue();
        if (B10.b()) {
            n1Var.l(B10.f33285a, this.f45659l);
            if (B10.f33287c == this.f45659l.n(B10.f33286b)) {
                j10 = this.f45659l.j();
            }
            longValue = j10;
        }
        return Pair.create(B10, Long.valueOf(longValue));
    }

    private void C0(boolean z10) {
        C3070t.b bVar = this.f45666s.p().f45270f.f45281a;
        long F02 = F0(bVar, this.f45671x.f45369r, true, false);
        if (F02 != this.f45671x.f45369r) {
            Q0 q02 = this.f45671x;
            this.f45671x = M(bVar, F02, q02.f45354c, q02.f45355d, z10, 5);
        }
    }

    private long D() {
        return E(this.f45671x.f45367p);
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x00ac A[Catch:{ all -> 0x00af }] */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x00b3 A[Catch:{ all -> 0x00af }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void D0(k9.C3709m0.h r19) {
        /*
            r18 = this;
            r11 = r18
            r0 = r19
            k9.m0$e r1 = r11.f45672y
            r8 = 1
            r1.b(r8)
            k9.Q0 r1 = r11.f45671x
            k9.n1 r1 = r1.f45352a
            int r4 = r11.f45635E
            boolean r5 = r11.f45636F
            k9.n1$d r6 = r11.f45658k
            k9.n1$b r7 = r11.f45659l
            r3 = 1
            r2 = r19
            android.util.Pair r1 = y0(r1, r2, r3, r4, r5, r6, r7)
            r2 = 0
            r4 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r6 = 0
            if (r1 != 0) goto L_0x004c
            k9.Q0 r7 = r11.f45671x
            k9.n1 r7 = r7.f45352a
            android.util.Pair r7 = r11.B(r7)
            java.lang.Object r9 = r7.first
            N9.t$b r9 = (N9.C3070t.b) r9
            java.lang.Object r7 = r7.second
            java.lang.Long r7 = (java.lang.Long) r7
            long r12 = r7.longValue()
            k9.Q0 r7 = r11.f45671x
            k9.n1 r7 = r7.f45352a
            boolean r7 = r7.u()
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
            long r9 = r0.f45698c
            int r9 = (r9 > r4 ? 1 : (r9 == r4 ? 0 : -1))
            if (r9 != 0) goto L_0x005e
            r9 = r4
            goto L_0x005f
        L_0x005e:
            r9 = r12
        L_0x005f:
            k9.H0 r14 = r11.f45666s
            k9.Q0 r15 = r11.f45671x
            k9.n1 r15 = r15.f45352a
            N9.t$b r7 = r14.B(r15, r7, r12)
            boolean r14 = r7.b()
            if (r14 == 0) goto L_0x0094
            k9.Q0 r4 = r11.f45671x
            k9.n1 r4 = r4.f45352a
            java.lang.Object r5 = r7.f33285a
            k9.n1$b r12 = r11.f45659l
            r4.l(r5, r12)
            k9.n1$b r4 = r11.f45659l
            int r5 = r7.f33286b
            int r4 = r4.n(r5)
            int r5 = r7.f33287c
            if (r4 != r5) goto L_0x008e
            k9.n1$b r4 = r11.f45659l
            long r4 = r4.j()
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
            long r14 = r0.f45698c
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
            k9.Q0 r7 = r11.f45671x     // Catch:{ all -> 0x00af }
            k9.n1 r7 = r7.f45352a     // Catch:{ all -> 0x00af }
            boolean r7 = r7.u()     // Catch:{ all -> 0x00af }
            if (r7 == 0) goto L_0x00b3
            r11.f45641Y = r0     // Catch:{ all -> 0x00af }
            goto L_0x00c2
        L_0x00af:
            r0 = move-exception
            r7 = r4
            goto L_0x014b
        L_0x00b3:
            r0 = 4
            if (r1 != 0) goto L_0x00c5
            k9.Q0 r1 = r11.f45671x     // Catch:{ all -> 0x00af }
            int r1 = r1.f45356e     // Catch:{ all -> 0x00af }
            if (r1 == r8) goto L_0x00bf
            r11.Z0(r0)     // Catch:{ all -> 0x00af }
        L_0x00bf:
            r11.r0(r6, r8, r6, r8)     // Catch:{ all -> 0x00af }
        L_0x00c2:
            r7 = r4
            goto L_0x0139
        L_0x00c5:
            k9.Q0 r1 = r11.f45671x     // Catch:{ all -> 0x00af }
            N9.t$b r1 = r1.f45353b     // Catch:{ all -> 0x00af }
            boolean r1 = r9.equals(r1)     // Catch:{ all -> 0x00af }
            if (r1 == 0) goto L_0x0114
            k9.H0 r1 = r11.f45666s     // Catch:{ all -> 0x00af }
            k9.E0 r1 = r1.p()     // Catch:{ all -> 0x00af }
            if (r1 == 0) goto L_0x00e8
            boolean r7 = r1.f45268d     // Catch:{ all -> 0x00af }
            if (r7 == 0) goto L_0x00e8
            int r2 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r2 == 0) goto L_0x00e8
            N9.r r1 = r1.f45265a     // Catch:{ all -> 0x00af }
            k9.e1 r2 = r11.f45670w     // Catch:{ all -> 0x00af }
            long r1 = r1.l(r4, r2)     // Catch:{ all -> 0x00af }
            goto L_0x00e9
        L_0x00e8:
            r1 = r4
        L_0x00e9:
            long r14 = ja.M.Z0(r1)     // Catch:{ all -> 0x00af }
            k9.Q0 r3 = r11.f45671x     // Catch:{ all -> 0x00af }
            long r6 = r3.f45369r     // Catch:{ all -> 0x00af }
            long r6 = ja.M.Z0(r6)     // Catch:{ all -> 0x00af }
            int r3 = (r14 > r6 ? 1 : (r14 == r6 ? 0 : -1))
            if (r3 != 0) goto L_0x0115
            k9.Q0 r3 = r11.f45671x     // Catch:{ all -> 0x00af }
            int r6 = r3.f45356e     // Catch:{ all -> 0x00af }
            r7 = 2
            if (r6 == r7) goto L_0x0103
            r7 = 3
            if (r6 != r7) goto L_0x0115
        L_0x0103:
            long r7 = r3.f45369r     // Catch:{ all -> 0x00af }
            r0 = 2
            r1 = r18
            r2 = r9
            r3 = r7
            r5 = r12
            r9 = r10
            r10 = r0
            k9.Q0 r0 = r1.M(r2, r3, r5, r7, r9, r10)
            r11.f45671x = r0
            return
        L_0x0114:
            r1 = r4
        L_0x0115:
            k9.Q0 r3 = r11.f45671x     // Catch:{ all -> 0x00af }
            int r3 = r3.f45356e     // Catch:{ all -> 0x00af }
            if (r3 != r0) goto L_0x011d
            r0 = r8
            goto L_0x011e
        L_0x011d:
            r0 = 0
        L_0x011e:
            long r14 = r11.E0(r9, r1, r0)     // Catch:{ all -> 0x00af }
            int r0 = (r4 > r14 ? 1 : (r4 == r14 ? 0 : -1))
            if (r0 == 0) goto L_0x0127
            goto L_0x0128
        L_0x0127:
            r8 = 0
        L_0x0128:
            r8 = r8 | r10
            k9.Q0 r0 = r11.f45671x     // Catch:{ all -> 0x0148 }
            k9.n1 r4 = r0.f45352a     // Catch:{ all -> 0x0148 }
            N9.t$b r5 = r0.f45353b     // Catch:{ all -> 0x0148 }
            r1 = r18
            r2 = r4
            r3 = r9
            r6 = r12
            r1.n1(r2, r3, r4, r5, r6)     // Catch:{ all -> 0x0148 }
            r10 = r8
            r7 = r14
        L_0x0139:
            r0 = 2
            r1 = r18
            r2 = r9
            r3 = r7
            r5 = r12
            r9 = r10
            r10 = r0
            k9.Q0 r0 = r1.M(r2, r3, r5, r7, r9, r10)
            r11.f45671x = r0
            return
        L_0x0148:
            r0 = move-exception
            r10 = r8
            r7 = r14
        L_0x014b:
            r14 = 2
            r1 = r18
            r2 = r9
            r3 = r7
            r5 = r12
            r9 = r10
            r10 = r14
            k9.Q0 r1 = r1.M(r2, r3, r5, r7, r9, r10)
            r11.f45671x = r1
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: k9.C3709m0.D0(k9.m0$h):void");
    }

    private long E(long j10) {
        E0 j11 = this.f45666s.j();
        if (j11 == null) {
            return 0;
        }
        return Math.max(0, j10 - j11.y(this.f45642Z));
    }

    private long E0(C3070t.b bVar, long j10, boolean z10) {
        boolean z11;
        if (this.f45666s.p() != this.f45666s.q()) {
            z11 = true;
        } else {
            z11 = false;
        }
        return F0(bVar, j10, z11, z10);
    }

    private void F(r rVar) {
        if (this.f45666s.v(rVar)) {
            this.f45666s.y(this.f45642Z);
            W();
        }
    }

    private long F0(C3070t.b bVar, long j10, boolean z10, boolean z11) {
        i1();
        this.f45633C = false;
        if (z11 || this.f45671x.f45356e == 3) {
            Z0(2);
        }
        E0 p10 = this.f45666s.p();
        E0 e02 = p10;
        while (e02 != null && !bVar.equals(e02.f45270f.f45281a)) {
            e02 = e02.j();
        }
        if (z10 || p10 != e02 || (e02 != null && e02.z(j10) < 0)) {
            for (a1 m10 : this.f45643a) {
                m(m10);
            }
            if (e02 != null) {
                while (this.f45666s.p() != e02) {
                    this.f45666s.b();
                }
                this.f45666s.z(e02);
                e02.x(1000000000000L);
                s();
            }
        }
        if (e02 != null) {
            this.f45666s.z(e02);
            if (!e02.f45268d) {
                e02.f45270f = e02.f45270f.b(j10);
            } else if (e02.f45269e) {
                j10 = e02.f45265a.g(j10);
                e02.f45265a.o(j10 - this.f45660m, this.f45661n);
            }
            t0(j10);
            W();
        } else {
            this.f45666s.f();
            t0(j10);
        }
        H(false);
        this.f45652h.g(2);
        return j10;
    }

    private void G(IOException iOException, int i10) {
        r h10 = r.h(iOException, i10);
        E0 p10 = this.f45666s.p();
        if (p10 != null) {
            h10 = h10.f(p10.f45270f.f45281a);
        }
        s.d("ExoPlayerImplInternal", "Playback error", h10);
        h1(false, false);
        this.f45671x = this.f45671x.e(h10);
    }

    private void G0(W0 w02) {
        if (w02.f() == -9223372036854775807L) {
            H0(w02);
        } else if (this.f45671x.f45352a.u()) {
            this.f45663p.add(new d(w02));
        } else {
            d dVar = new d(w02);
            n1 n1Var = this.f45671x.f45352a;
            if (v0(dVar, n1Var, n1Var, this.f45635E, this.f45636F, this.f45658k, this.f45659l)) {
                this.f45663p.add(dVar);
                Collections.sort(this.f45663p);
                return;
            }
            w02.k(false);
        }
    }

    private void H(boolean z10) {
        C3070t.b bVar;
        long j10;
        E0 j11 = this.f45666s.j();
        if (j11 == null) {
            bVar = this.f45671x.f45353b;
        } else {
            bVar = j11.f45270f.f45281a;
        }
        boolean equals = this.f45671x.f45362k.equals(bVar);
        if (!equals) {
            this.f45671x = this.f45671x.b(bVar);
        }
        Q0 q02 = this.f45671x;
        if (j11 == null) {
            j10 = q02.f45369r;
        } else {
            j10 = j11.i();
        }
        q02.f45367p = j10;
        this.f45671x.f45368q = D();
        if ((!equals || z10) && j11 != null && j11.f45268d) {
            k1(j11.n(), j11.o());
        }
    }

    private void H0(W0 w02) {
        if (w02.c() == this.f45656j) {
            l(w02);
            int i10 = this.f45671x.f45356e;
            if (i10 == 3 || i10 == 2) {
                this.f45652h.g(2);
                return;
            }
            return;
        }
        this.f45652h.c(15, w02).a();
    }

    /* JADX WARNING: Removed duplicated region for block: B:70:0x013d  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x015e A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x0180  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x01aa  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void I(k9.n1 r25, boolean r26) {
        /*
            r24 = this;
            r11 = r24
            r12 = r25
            k9.Q0 r2 = r11.f45671x
            k9.m0$h r3 = r11.f45641Y
            k9.H0 r4 = r11.f45666s
            int r5 = r11.f45635E
            boolean r6 = r11.f45636F
            k9.n1$d r7 = r11.f45658k
            k9.n1$b r8 = r11.f45659l
            r1 = r25
            k9.m0$g r7 = x0(r1, r2, r3, r4, r5, r6, r7, r8)
            N9.t$b r8 = r7.f45690a
            long r9 = r7.f45692c
            boolean r0 = r7.f45693d
            long r13 = r7.f45691b
            k9.Q0 r1 = r11.f45671x
            N9.t$b r1 = r1.f45353b
            boolean r1 = r1.equals(r8)
            r15 = 1
            r5 = 0
            if (r1 == 0) goto L_0x0038
            k9.Q0 r1 = r11.f45671x
            long r1 = r1.f45369r
            int r1 = (r13 > r1 ? 1 : (r13 == r1 ? 0 : -1))
            if (r1 == 0) goto L_0x0035
            goto L_0x0038
        L_0x0035:
            r16 = r5
            goto L_0x003a
        L_0x0038:
            r16 = r15
        L_0x003a:
            r6 = 0
            r17 = 3
            r18 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r4 = 4
            boolean r1 = r7.f45694e     // Catch:{ all -> 0x0051 }
            if (r1 == 0) goto L_0x005a
            k9.Q0 r1 = r11.f45671x     // Catch:{ all -> 0x0051 }
            int r1 = r1.f45356e     // Catch:{ all -> 0x0051 }
            if (r1 == r15) goto L_0x0057
            r11.Z0(r4)     // Catch:{ all -> 0x0051 }
            goto L_0x0057
        L_0x0051:
            r0 = move-exception
            r20 = r4
            r15 = r5
            goto L_0x0133
        L_0x0057:
            r11.r0(r5, r5, r5, r15)     // Catch:{ all -> 0x0051 }
        L_0x005a:
            if (r16 != 0) goto L_0x0084
            k9.H0 r1 = r11.f45666s     // Catch:{ all -> 0x007f }
            long r3 = r11.f45642Z     // Catch:{ all -> 0x007a }
            long r21 = r24.A()     // Catch:{ all -> 0x007a }
            r2 = r25
            r15 = -1
            r20 = 4
            r15 = r5
            r5 = r21
            boolean r0 = r1.F(r2, r3, r5)     // Catch:{ all -> 0x0076 }
            if (r0 != 0) goto L_0x00b6
            r11.C0(r15)     // Catch:{ all -> 0x0076 }
            goto L_0x00b6
        L_0x0076:
            r0 = move-exception
        L_0x0077:
            r6 = 0
            goto L_0x0133
        L_0x007a:
            r0 = move-exception
            r15 = r5
            r20 = 4
            goto L_0x0077
        L_0x007f:
            r0 = move-exception
            r20 = r4
            r15 = r5
            goto L_0x0077
        L_0x0084:
            r20 = r4
            r15 = r5
            boolean r1 = r25.u()     // Catch:{ all -> 0x0076 }
            if (r1 != 0) goto L_0x00b6
            k9.H0 r1 = r11.f45666s     // Catch:{ all -> 0x0076 }
            k9.E0 r1 = r1.p()     // Catch:{ all -> 0x0076 }
        L_0x0093:
            if (r1 == 0) goto L_0x00b1
            k9.F0 r2 = r1.f45270f     // Catch:{ all -> 0x0076 }
            N9.t$b r2 = r2.f45281a     // Catch:{ all -> 0x0076 }
            boolean r2 = r2.equals(r8)     // Catch:{ all -> 0x0076 }
            if (r2 == 0) goto L_0x00ac
            k9.H0 r2 = r11.f45666s     // Catch:{ all -> 0x0076 }
            k9.F0 r3 = r1.f45270f     // Catch:{ all -> 0x0076 }
            k9.F0 r2 = r2.r(r12, r3)     // Catch:{ all -> 0x0076 }
            r1.f45270f = r2     // Catch:{ all -> 0x0076 }
            r1.A()     // Catch:{ all -> 0x0076 }
        L_0x00ac:
            k9.E0 r1 = r1.j()     // Catch:{ all -> 0x0076 }
            goto L_0x0093
        L_0x00b1:
            long r0 = r11.E0(r8, r13, r0)     // Catch:{ all -> 0x0076 }
            r13 = r0
        L_0x00b6:
            k9.Q0 r0 = r11.f45671x
            k9.n1 r4 = r0.f45352a
            N9.t$b r5 = r0.f45353b
            boolean r0 = r7.f45695f
            if (r0 == 0) goto L_0x00c2
            r6 = r13
            goto L_0x00c4
        L_0x00c2:
            r6 = r18
        L_0x00c4:
            r1 = r24
            r2 = r25
            r3 = r8
            r1.n1(r2, r3, r4, r5, r6)
            if (r16 != 0) goto L_0x00d6
            k9.Q0 r0 = r11.f45671x
            long r0 = r0.f45354c
            int r0 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r0 == 0) goto L_0x0114
        L_0x00d6:
            k9.Q0 r0 = r11.f45671x
            N9.t$b r1 = r0.f45353b
            java.lang.Object r1 = r1.f33285a
            k9.n1 r0 = r0.f45352a
            if (r16 == 0) goto L_0x00f5
            if (r26 == 0) goto L_0x00f5
            boolean r2 = r0.u()
            if (r2 != 0) goto L_0x00f5
            k9.n1$b r2 = r11.f45659l
            k9.n1$b r0 = r0.l(r1, r2)
            boolean r0 = r0.f45718f
            if (r0 != 0) goto L_0x00f5
            r23 = 1
            goto L_0x00f7
        L_0x00f5:
            r23 = r15
        L_0x00f7:
            k9.Q0 r0 = r11.f45671x
            long r5 = r0.f45355d
            int r0 = r12.f(r1)
            r1 = -1
            if (r0 != r1) goto L_0x0104
            r17 = r20
        L_0x0104:
            r1 = r24
            r2 = r8
            r3 = r13
            r7 = r5
            r5 = r9
            r9 = r23
            r10 = r17
            k9.Q0 r0 = r1.M(r2, r3, r5, r7, r9, r10)
            r11.f45671x = r0
        L_0x0114:
            r24.s0()
            k9.Q0 r0 = r11.f45671x
            k9.n1 r0 = r0.f45352a
            r11.w0(r12, r0)
            k9.Q0 r0 = r11.f45671x
            k9.Q0 r0 = r0.i(r12)
            r11.f45671x = r0
            boolean r0 = r25.u()
            if (r0 != 0) goto L_0x012f
            r6 = 0
            r11.f45641Y = r6
        L_0x012f:
            r11.H(r15)
            return
        L_0x0133:
            k9.Q0 r1 = r11.f45671x
            k9.n1 r4 = r1.f45352a
            N9.t$b r5 = r1.f45353b
            boolean r1 = r7.f45695f
            if (r1 == 0) goto L_0x013f
            r18 = r13
        L_0x013f:
            r1 = r24
            r2 = r25
            r3 = r8
            r15 = r6
            r6 = r18
            r1.n1(r2, r3, r4, r5, r6)
            if (r16 != 0) goto L_0x0154
            k9.Q0 r1 = r11.f45671x
            long r1 = r1.f45354c
            int r1 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
            if (r1 == 0) goto L_0x0192
        L_0x0154:
            k9.Q0 r1 = r11.f45671x
            N9.t$b r2 = r1.f45353b
            java.lang.Object r2 = r2.f33285a
            k9.n1 r1 = r1.f45352a
            if (r16 == 0) goto L_0x0173
            if (r26 == 0) goto L_0x0173
            boolean r3 = r1.u()
            if (r3 != 0) goto L_0x0173
            k9.n1$b r3 = r11.f45659l
            k9.n1$b r1 = r1.l(r2, r3)
            boolean r1 = r1.f45718f
            if (r1 != 0) goto L_0x0173
            r23 = 1
            goto L_0x0175
        L_0x0173:
            r23 = 0
        L_0x0175:
            k9.Q0 r1 = r11.f45671x
            long r5 = r1.f45355d
            int r1 = r12.f(r2)
            r2 = -1
            if (r1 != r2) goto L_0x0182
            r17 = r20
        L_0x0182:
            r1 = r24
            r2 = r8
            r3 = r13
            r7 = r5
            r5 = r9
            r9 = r23
            r10 = r17
            k9.Q0 r1 = r1.M(r2, r3, r5, r7, r9, r10)
            r11.f45671x = r1
        L_0x0192:
            r24.s0()
            k9.Q0 r1 = r11.f45671x
            k9.n1 r1 = r1.f45352a
            r11.w0(r12, r1)
            k9.Q0 r1 = r11.f45671x
            k9.Q0 r1 = r1.i(r12)
            r11.f45671x = r1
            boolean r1 = r25.u()
            if (r1 != 0) goto L_0x01ac
            r11.f45641Y = r15
        L_0x01ac:
            r1 = 0
            r11.H(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: k9.C3709m0.I(k9.n1, boolean):void");
    }

    private void I0(W0 w02) {
        Looper c10 = w02.c();
        if (!c10.getThread().isAlive()) {
            s.i("TAG", "Trying to send message on a dead thread.");
            w02.k(false);
            return;
        }
        this.f45664q.d(c10, (Handler.Callback) null).f(new C3707l0(this, w02));
    }

    private void J(r rVar) {
        if (this.f45666s.v(rVar)) {
            E0 j10 = this.f45666s.j();
            j10.p(this.f45662o.c().f45374a, this.f45671x.f45352a);
            k1(j10.n(), j10.o());
            if (j10 == this.f45666s.p()) {
                t0(j10.f45270f.f45282b);
                s();
                Q0 q02 = this.f45671x;
                C3070t.b bVar = q02.f45353b;
                long j11 = j10.f45270f.f45282b;
                this.f45671x = M(bVar, j11, q02.f45354c, j11, false, 5);
            }
            W();
        }
    }

    private void J0(long j10) {
        for (a1 a1Var : this.f45643a) {
            if (a1Var.x() != null) {
                K0(a1Var, j10);
            }
        }
    }

    private void K(S0 s02, float f10, boolean z10, boolean z11) {
        if (z10) {
            if (z11) {
                this.f45672y.b(1);
            }
            this.f45671x = this.f45671x.f(s02);
        }
        o1(s02.f45374a);
        for (a1 a1Var : this.f45643a) {
            if (a1Var != null) {
                a1Var.v(f10, s02.f45374a);
            }
        }
    }

    private void K0(a1 a1Var, long j10) {
        a1Var.k();
        if (a1Var instanceof W9.o) {
            ((W9.o) a1Var).f0(j10);
        }
    }

    private void L(S0 s02, boolean z10) {
        K(s02, s02.f45374a, true, z10);
    }

    private void L0(boolean z10, AtomicBoolean atomicBoolean) {
        if (this.f45637G != z10) {
            this.f45637G = z10;
            if (!z10) {
                for (a1 a1Var : this.f45643a) {
                    if (!R(a1Var) && this.f45644b.remove(a1Var)) {
                        a1Var.reset();
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

    private Q0 M(C3070t.b bVar, long j10, long j11, long j12, boolean z10, int i10) {
        boolean z11;
        C4770v vVar;
        B b10;
        V v10;
        V v11;
        B b11;
        C3070t.b bVar2 = bVar;
        long j13 = j11;
        if (this.f45651g0 || j10 != this.f45671x.f45369r || !bVar.equals(this.f45671x.f45353b)) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f45651g0 = z11;
        s0();
        Q0 q02 = this.f45671x;
        V v12 = q02.f45359h;
        B b12 = q02.f45360i;
        List list = q02.f45361j;
        if (this.f45667t.s()) {
            E0 p10 = this.f45666s.p();
            if (p10 == null) {
                v11 = V.f33194d;
            } else {
                v11 = p10.n();
            }
            if (p10 == null) {
                b11 = this.f45647e;
            } else {
                b11 = p10.o();
            }
            C4770v w10 = w(b11.f43760c);
            if (p10 != null) {
                F0 f02 = p10.f45270f;
                if (f02.f45283c != j13) {
                    p10.f45270f = f02.a(j13);
                }
            }
            v10 = v11;
            b10 = b11;
            vVar = w10;
        } else if (!bVar.equals(this.f45671x.f45353b)) {
            V v13 = V.f33194d;
            v10 = v13;
            b10 = this.f45647e;
            vVar = C4770v.E();
        } else {
            vVar = list;
            v10 = v12;
            b10 = b12;
        }
        if (z10) {
            this.f45672y.e(i10);
        }
        return this.f45671x.c(bVar, j10, j11, j12, D(), v10, b10, vVar);
    }

    private void M0(b bVar) {
        this.f45672y.b(1);
        if (bVar.f45677c != -1) {
            this.f45641Y = new h(new X0(bVar.f45675a, bVar.f45676b), bVar.f45677c, bVar.f45678d);
        }
        I(this.f45667t.B(bVar.f45675a, bVar.f45676b), false);
    }

    private boolean N(a1 a1Var, E0 e02) {
        E0 j10 = e02.j();
        if (!e02.f45270f.f45286f || !j10.f45268d || (!(a1Var instanceof W9.o) && !(a1Var instanceof D9.f) && a1Var.y() < j10.m())) {
            return false;
        }
        return true;
    }

    private boolean O() {
        E0 q10 = this.f45666s.q();
        if (!q10.f45268d) {
            return false;
        }
        int i10 = 0;
        while (true) {
            a1[] a1VarArr = this.f45643a;
            if (i10 >= a1VarArr.length) {
                return true;
            }
            a1 a1Var = a1VarArr[i10];
            N9.M m10 = q10.f45267c[i10];
            if (a1Var.x() != m10 || (m10 != null && !a1Var.h() && !N(a1Var, q10))) {
                return false;
            }
            i10++;
        }
        return false;
    }

    private void O0(boolean z10) {
        if (z10 != this.f45639I) {
            this.f45639I = z10;
            if (!z10 && this.f45671x.f45366o) {
                this.f45652h.g(2);
            }
        }
    }

    private static boolean P(boolean z10, C3070t.b bVar, long j10, C3070t.b bVar2, n1.b bVar3, long j11) {
        if (z10 || j10 != j11 || !bVar.f33285a.equals(bVar2.f33285a)) {
            return false;
        }
        if (!bVar.b() || !bVar3.t(bVar.f33286b)) {
            if (!bVar2.b() || !bVar3.t(bVar2.f33286b)) {
                return false;
            }
            return true;
        } else if (bVar3.k(bVar.f33286b, bVar.f33287c) == 4 || bVar3.k(bVar.f33286b, bVar.f33287c) == 2) {
            return false;
        } else {
            return true;
        }
    }

    private void P0(boolean z10) {
        this.f45631A = z10;
        s0();
        if (this.f45632B && this.f45666s.q() != this.f45666s.p()) {
            C0(true);
            H(false);
        }
    }

    private boolean Q() {
        E0 j10 = this.f45666s.j();
        if (j10 == null || j10.k() == Long.MIN_VALUE) {
            return false;
        }
        return true;
    }

    private static boolean R(a1 a1Var) {
        if (a1Var.getState() != 0) {
            return true;
        }
        return false;
    }

    private void R0(boolean z10, int i10, boolean z11, int i11) {
        this.f45672y.b(z11 ? 1 : 0);
        this.f45672y.c(i11);
        this.f45671x = this.f45671x.d(z10, i10);
        this.f45633C = false;
        g0(z10);
        if (!c1()) {
            i1();
            m1();
            return;
        }
        int i12 = this.f45671x.f45356e;
        if (i12 == 3) {
            f1();
            this.f45652h.g(2);
        } else if (i12 == 2) {
            this.f45652h.g(2);
        }
    }

    private boolean S() {
        E0 p10 = this.f45666s.p();
        long j10 = p10.f45270f.f45285e;
        if (!p10.f45268d || (j10 != -9223372036854775807L && this.f45671x.f45369r >= j10 && c1())) {
            return false;
        }
        return true;
    }

    private static boolean T(Q0 q02, n1.b bVar) {
        C3070t.b bVar2 = q02.f45353b;
        n1 n1Var = q02.f45352a;
        if (n1Var.u() || n1Var.l(bVar2.f33285a, bVar).f45718f) {
            return true;
        }
        return false;
    }

    private void T0(S0 s02) {
        this.f45662o.f(s02);
        L(this.f45662o.c(), true);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ Boolean U() {
        return Boolean.valueOf(this.f45673z);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void V(W0 w02) {
        try {
            l(w02);
        } catch (r e10) {
            s.d("ExoPlayerImplInternal", "Unexpected error delivering message on external thread.", e10);
            throw new RuntimeException(e10);
        }
    }

    private void V0(int i10) {
        this.f45635E = i10;
        if (!this.f45666s.G(this.f45671x.f45352a, i10)) {
            C0(true);
        }
        H(false);
    }

    private void W() {
        boolean b12 = b1();
        this.f45634D = b12;
        if (b12) {
            this.f45666s.j().d(this.f45642Z);
        }
        j1();
    }

    private void W0(e1 e1Var) {
        this.f45670w = e1Var;
    }

    private void X() {
        this.f45672y.d(this.f45671x);
        if (this.f45672y.f45683a) {
            this.f45665r.a(this.f45672y);
            this.f45672y = new e(this.f45671x);
        }
    }

    private void X0(boolean z10) {
        this.f45636F = z10;
        if (!this.f45666s.H(this.f45671x.f45352a, z10)) {
            C0(true);
        }
        H(false);
    }

    /* JADX WARNING: Removed duplicated region for block: B:42:0x00a8  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x0078 A[EDGE_INSN: B:72:0x0078->B:25:0x0078 ?: BREAK  , SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void Y(long r9, long r11) {
        /*
            r8 = this;
            java.util.ArrayList r0 = r8.f45663p
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x00fc
            k9.Q0 r0 = r8.f45671x
            N9.t$b r0 = r0.f45353b
            boolean r0 = r0.b()
            if (r0 == 0) goto L_0x0014
            goto L_0x00fc
        L_0x0014:
            boolean r0 = r8.f45651g0
            if (r0 == 0) goto L_0x001e
            r0 = 1
            long r9 = r9 - r0
            r0 = 0
            r8.f45651g0 = r0
        L_0x001e:
            k9.Q0 r0 = r8.f45671x
            k9.n1 r1 = r0.f45352a
            N9.t$b r0 = r0.f45353b
            java.lang.Object r0 = r0.f33285a
            int r0 = r1.f(r0)
            int r1 = r8.f45649f0
            java.util.ArrayList r2 = r8.f45663p
            int r2 = r2.size()
            int r1 = java.lang.Math.min(r1, r2)
            r2 = 0
            if (r1 <= 0) goto L_0x0044
            java.util.ArrayList r3 = r8.f45663p
            int r4 = r1 + -1
            java.lang.Object r3 = r3.get(r4)
            k9.m0$d r3 = (k9.C3709m0.d) r3
            goto L_0x0045
        L_0x0044:
            r3 = r2
        L_0x0045:
            if (r3 == 0) goto L_0x0067
            int r4 = r3.f45680b
            if (r4 > r0) goto L_0x0053
            if (r4 != r0) goto L_0x0067
            long r3 = r3.f45681c
            int r3 = (r3 > r9 ? 1 : (r3 == r9 ? 0 : -1))
            if (r3 <= 0) goto L_0x0067
        L_0x0053:
            int r3 = r1 + -1
            if (r3 <= 0) goto L_0x0062
            java.util.ArrayList r4 = r8.f45663p
            int r1 = r1 + -2
            java.lang.Object r1 = r4.get(r1)
            k9.m0$d r1 = (k9.C3709m0.d) r1
            goto L_0x0063
        L_0x0062:
            r1 = r2
        L_0x0063:
            r7 = r3
            r3 = r1
            r1 = r7
            goto L_0x0045
        L_0x0067:
            java.util.ArrayList r3 = r8.f45663p
            int r3 = r3.size()
            if (r1 >= r3) goto L_0x0078
            java.util.ArrayList r3 = r8.f45663p
            java.lang.Object r3 = r3.get(r1)
            k9.m0$d r3 = (k9.C3709m0.d) r3
            goto L_0x0079
        L_0x0078:
            r3 = r2
        L_0x0079:
            if (r3 == 0) goto L_0x009e
            java.lang.Object r4 = r3.f45682d
            if (r4 == 0) goto L_0x009e
            int r4 = r3.f45680b
            if (r4 < r0) goto L_0x008b
            if (r4 != r0) goto L_0x009e
            long r4 = r3.f45681c
            int r4 = (r4 > r9 ? 1 : (r4 == r9 ? 0 : -1))
            if (r4 > 0) goto L_0x009e
        L_0x008b:
            int r1 = r1 + 1
            java.util.ArrayList r3 = r8.f45663p
            int r3 = r3.size()
            if (r1 >= r3) goto L_0x0078
            java.util.ArrayList r3 = r8.f45663p
            java.lang.Object r3 = r3.get(r1)
            k9.m0$d r3 = (k9.C3709m0.d) r3
            goto L_0x0079
        L_0x009e:
            if (r3 == 0) goto L_0x00fa
            java.lang.Object r4 = r3.f45682d
            if (r4 == 0) goto L_0x00fa
            int r4 = r3.f45680b
            if (r4 != r0) goto L_0x00fa
            long r4 = r3.f45681c
            int r6 = (r4 > r9 ? 1 : (r4 == r9 ? 0 : -1))
            if (r6 <= 0) goto L_0x00fa
            int r4 = (r4 > r11 ? 1 : (r4 == r11 ? 0 : -1))
            if (r4 > 0) goto L_0x00fa
            k9.W0 r4 = r3.f45679a     // Catch:{ all -> 0x00e3 }
            r8.H0(r4)     // Catch:{ all -> 0x00e3 }
            k9.W0 r4 = r3.f45679a
            boolean r4 = r4.b()
            if (r4 != 0) goto L_0x00cb
            k9.W0 r3 = r3.f45679a
            boolean r3 = r3.j()
            if (r3 == 0) goto L_0x00c8
            goto L_0x00cb
        L_0x00c8:
            int r1 = r1 + 1
            goto L_0x00d0
        L_0x00cb:
            java.util.ArrayList r3 = r8.f45663p
            r3.remove(r1)
        L_0x00d0:
            java.util.ArrayList r3 = r8.f45663p
            int r3 = r3.size()
            if (r1 >= r3) goto L_0x00e1
            java.util.ArrayList r3 = r8.f45663p
            java.lang.Object r3 = r3.get(r1)
            k9.m0$d r3 = (k9.C3709m0.d) r3
            goto L_0x009e
        L_0x00e1:
            r3 = r2
            goto L_0x009e
        L_0x00e3:
            r9 = move-exception
            k9.W0 r10 = r3.f45679a
            boolean r10 = r10.b()
            if (r10 != 0) goto L_0x00f4
            k9.W0 r10 = r3.f45679a
            boolean r10 = r10.j()
            if (r10 == 0) goto L_0x00f9
        L_0x00f4:
            java.util.ArrayList r10 = r8.f45663p
            r10.remove(r1)
        L_0x00f9:
            throw r9
        L_0x00fa:
            r8.f45649f0 = r1
        L_0x00fc:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: k9.C3709m0.Y(long, long):void");
    }

    private void Y0(O o10) {
        this.f45672y.b(1);
        I(this.f45667t.C(o10), false);
    }

    private void Z() {
        F0 o10;
        this.f45666s.y(this.f45642Z);
        if (this.f45666s.D() && (o10 = this.f45666s.o(this.f45642Z, this.f45671x)) != null) {
            E0 g10 = this.f45666s.g(this.f45645c, this.f45646d, this.f45648f.a(), this.f45667t, o10, this.f45647e);
            g10.f45265a.r(this, o10.f45282b);
            if (this.f45666s.p() == g10) {
                t0(o10.f45282b);
            }
            H(false);
        }
        if (this.f45634D) {
            this.f45634D = Q();
            j1();
            return;
        }
        W();
    }

    private void Z0(int i10) {
        Q0 q02 = this.f45671x;
        if (q02.f45356e != i10) {
            if (i10 != 2) {
                this.f45657j0 = -9223372036854775807L;
            }
            this.f45671x = q02.g(i10);
        }
    }

    private void a0() {
        boolean z10;
        boolean z11 = false;
        while (a1()) {
            if (z11) {
                X();
            }
            E0 e02 = (E0) C3645a.e(this.f45666s.b());
            if (this.f45671x.f45353b.f33285a.equals(e02.f45270f.f45281a.f33285a)) {
                C3070t.b bVar = this.f45671x.f45353b;
                if (bVar.f33286b == -1) {
                    C3070t.b bVar2 = e02.f45270f.f45281a;
                    if (bVar2.f33286b == -1 && bVar.f33289e != bVar2.f33289e) {
                        z10 = true;
                        F0 f02 = e02.f45270f;
                        C3070t.b bVar3 = f02.f45281a;
                        long j10 = f02.f45282b;
                        this.f45671x = M(bVar3, j10, f02.f45283c, j10, !z10, 0);
                        s0();
                        m1();
                        z11 = true;
                    }
                }
            }
            z10 = false;
            F0 f022 = e02.f45270f;
            C3070t.b bVar32 = f022.f45281a;
            long j102 = f022.f45282b;
            this.f45671x = M(bVar32, j102, f022.f45283c, j102, !z10, 0);
            s0();
            m1();
            z11 = true;
        }
    }

    private boolean a1() {
        E0 p10;
        E0 j10;
        if (c1() && !this.f45632B && (p10 = this.f45666s.p()) != null && (j10 = p10.j()) != null && this.f45642Z >= j10.m() && j10.f45271g) {
            return true;
        }
        return false;
    }

    private void b0() {
        long j10;
        boolean z10;
        E0 q10 = this.f45666s.q();
        if (q10 != null) {
            int i10 = 0;
            if (q10.j() == null || this.f45632B) {
                if (q10.f45270f.f45289i || this.f45632B) {
                    while (true) {
                        a1[] a1VarArr = this.f45643a;
                        if (i10 < a1VarArr.length) {
                            a1 a1Var = a1VarArr[i10];
                            N9.M m10 = q10.f45267c[i10];
                            if (m10 != null && a1Var.x() == m10 && a1Var.h()) {
                                long j11 = q10.f45270f.f45285e;
                                if (j11 == -9223372036854775807L || j11 == Long.MIN_VALUE) {
                                    j10 = -9223372036854775807L;
                                } else {
                                    j10 = q10.l() + q10.f45270f.f45285e;
                                }
                                K0(a1Var, j10);
                            }
                            i10++;
                        } else {
                            return;
                        }
                    }
                }
            } else if (O()) {
                if (q10.j().f45268d || this.f45642Z >= q10.j().m()) {
                    B o10 = q10.o();
                    E0 c10 = this.f45666s.c();
                    B o11 = c10.o();
                    n1 n1Var = this.f45671x.f45352a;
                    n1(n1Var, c10.f45270f.f45281a, n1Var, q10.f45270f.f45281a, -9223372036854775807L);
                    if (!c10.f45268d || c10.f45265a.h() == -9223372036854775807L) {
                        for (int i11 = 0; i11 < this.f45643a.length; i11++) {
                            boolean c11 = o10.c(i11);
                            boolean c12 = o11.c(i11);
                            if (c11 && !this.f45643a[i11].r()) {
                                if (this.f45645c[i11].e() == -2) {
                                    z10 = true;
                                } else {
                                    z10 = false;
                                }
                                c1 c1Var = o10.f43759b[i11];
                                c1 c1Var2 = o11.f43759b[i11];
                                if (!c12 || !c1Var2.equals(c1Var) || z10) {
                                    K0(this.f45643a[i11], c10.m());
                                }
                            }
                        }
                        return;
                    }
                    J0(c10.m());
                }
            }
        }
    }

    private boolean b1() {
        long j10;
        if (!Q()) {
            return false;
        }
        E0 j11 = this.f45666s.j();
        long E10 = E(j11.k());
        if (j11 == this.f45666s.p()) {
            j10 = j11.y(this.f45642Z);
        } else {
            j10 = j11.y(this.f45642Z) - j11.f45270f.f45282b;
        }
        return this.f45648f.i(j10, E10, this.f45662o.c().f45374a);
    }

    private void c0() {
        E0 q10 = this.f45666s.q();
        if (q10 != null && this.f45666s.p() != q10 && !q10.f45271g && p0()) {
            s();
        }
    }

    private boolean c1() {
        Q0 q02 = this.f45671x;
        if (!q02.f45363l || q02.f45364m != 0) {
            return false;
        }
        return true;
    }

    private void d0() {
        I(this.f45667t.i(), true);
    }

    private boolean d1(boolean z10) {
        long j10;
        boolean z11;
        boolean z12;
        if (this.f45640X == 0) {
            return S();
        }
        if (!z10) {
            return false;
        }
        Q0 q02 = this.f45671x;
        if (!q02.f45358g) {
            return true;
        }
        if (e1(q02.f45352a, this.f45666s.p().f45270f.f45281a)) {
            j10 = this.f45668u.b();
        } else {
            j10 = -9223372036854775807L;
        }
        long j11 = j10;
        E0 j12 = this.f45666s.j();
        if (!j12.q() || !j12.f45270f.f45289i) {
            z11 = false;
        } else {
            z11 = true;
        }
        if (!j12.f45270f.f45281a.b() || j12.f45268d) {
            z12 = false;
        } else {
            z12 = true;
        }
        if (z11 || z12 || this.f45648f.f(D(), this.f45662o.c().f45374a, this.f45633C, j11)) {
            return true;
        }
        return false;
    }

    private void e0(c cVar) {
        this.f45672y.b(1);
        throw null;
    }

    private boolean e1(n1 n1Var, C3070t.b bVar) {
        if (bVar.b() || n1Var.u()) {
            return false;
        }
        n1Var.r(n1Var.l(bVar.f33285a, this.f45659l).f45715c, this.f45658k);
        if (!this.f45658k.g()) {
            return false;
        }
        n1.d dVar = this.f45658k;
        if (!dVar.f45736i || dVar.f45733f == -9223372036854775807L) {
            return false;
        }
        return true;
    }

    private void f0() {
        for (E0 p10 = this.f45666s.p(); p10 != null; p10 = p10.j()) {
            for (ga.r rVar : p10.o().f43760c) {
                if (rVar != null) {
                    rVar.e();
                }
            }
        }
    }

    private void f1() {
        this.f45633C = false;
        this.f45662o.g();
        for (a1 a1Var : this.f45643a) {
            if (R(a1Var)) {
                a1Var.start();
            }
        }
    }

    private void g0(boolean z10) {
        for (E0 p10 = this.f45666s.p(); p10 != null; p10 = p10.j()) {
            for (ga.r rVar : p10.o().f43760c) {
                if (rVar != null) {
                    rVar.h(z10);
                }
            }
        }
    }

    private void h0() {
        for (E0 p10 = this.f45666s.p(); p10 != null; p10 = p10.j()) {
            for (ga.r rVar : p10.o().f43760c) {
                if (rVar != null) {
                    rVar.k();
                }
            }
        }
    }

    private void h1(boolean z10, boolean z11) {
        boolean z12;
        if (z10 || !this.f45637G) {
            z12 = true;
        } else {
            z12 = false;
        }
        r0(z12, false, true, false);
        this.f45672y.b(z11 ? 1 : 0);
        this.f45648f.g();
        Z0(1);
    }

    private void i(b bVar, int i10) {
        this.f45672y.b(1);
        K0 k02 = this.f45667t;
        if (i10 == -1) {
            i10 = k02.q();
        }
        I(k02.f(i10, bVar.f45675a, bVar.f45676b), false);
    }

    private void i1() {
        this.f45662o.h();
        for (a1 a1Var : this.f45643a) {
            if (R(a1Var)) {
                u(a1Var);
            }
        }
    }

    private void j() {
        C0(true);
    }

    private void j1() {
        boolean z10;
        E0 j10 = this.f45666s.j();
        if (this.f45634D || (j10 != null && j10.f45265a.b())) {
            z10 = true;
        } else {
            z10 = false;
        }
        Q0 q02 = this.f45671x;
        if (z10 != q02.f45358g) {
            this.f45671x = q02.a(z10);
        }
    }

    private void k0() {
        int i10;
        this.f45672y.b(1);
        r0(false, false, false, true);
        this.f45648f.d();
        if (this.f45671x.f45352a.u()) {
            i10 = 4;
        } else {
            i10 = 2;
        }
        Z0(i10);
        this.f45667t.v(this.f45650g.a());
        this.f45652h.g(2);
    }

    private void k1(V v10, B b10) {
        this.f45648f.b(this.f45643a, v10, b10.f43760c);
    }

    private void l(W0 w02) {
        if (!w02.j()) {
            try {
                w02.g().p(w02.i(), w02.e());
            } finally {
                w02.k(true);
            }
        }
    }

    private void l1() {
        if (!this.f45671x.f45352a.u() && this.f45667t.s()) {
            Z();
            b0();
            c0();
            a0();
        }
    }

    private void m(a1 a1Var) {
        if (R(a1Var)) {
            this.f45662o.a(a1Var);
            u(a1Var);
            a1Var.disable();
            this.f45640X--;
        }
    }

    private void m0() {
        r0(true, false, true, false);
        this.f45648f.h();
        Z0(1);
        this.f45654i.quit();
        synchronized (this) {
            this.f45673z = true;
            notifyAll();
        }
    }

    private void m1() {
        long j10;
        boolean z10;
        E0 p10 = this.f45666s.p();
        if (p10 != null) {
            if (p10.f45268d) {
                j10 = p10.f45265a.h();
            } else {
                j10 = -9223372036854775807L;
            }
            if (j10 != -9223372036854775807L) {
                t0(j10);
                if (j10 != this.f45671x.f45369r) {
                    Q0 q02 = this.f45671x;
                    this.f45671x = M(q02.f45353b, j10, q02.f45354c, j10, true, 5);
                }
            } else {
                C3708m mVar = this.f45662o;
                if (p10 != this.f45666s.q()) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                long i10 = mVar.i(z10);
                this.f45642Z = i10;
                long y10 = p10.y(i10);
                Y(this.f45671x.f45369r, y10);
                this.f45671x.f45369r = y10;
            }
            this.f45671x.f45367p = this.f45666s.j().i();
            this.f45671x.f45368q = D();
            Q0 q03 = this.f45671x;
            if (q03.f45363l && q03.f45356e == 3 && e1(q03.f45352a, q03.f45353b) && this.f45671x.f45365n.f45374a == 1.0f) {
                float a10 = this.f45668u.a(x(), D());
                if (this.f45662o.c().f45374a != a10) {
                    this.f45662o.f(this.f45671x.f45365n.e(a10));
                    K(this.f45671x.f45365n, this.f45662o.c().f45374a, false, false);
                }
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:112:0x01b0  */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x01b2  */
    /* JADX WARNING: Removed duplicated region for block: B:123:0x01c6  */
    /* JADX WARNING: Removed duplicated region for block: B:128:0x01d7  */
    /* JADX WARNING: Removed duplicated region for block: B:150:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void n() {
        /*
            r16 = this;
            r0 = r16
            ja.d r1 = r0.f45664q
            long r1 = r1.c()
            ja.o r3 = r0.f45652h
            r4 = 2
            r3.i(r4)
            r16.l1()
            k9.Q0 r3 = r0.f45671x
            int r3 = r3.f45356e
            r5 = 1
            if (r3 == r5) goto L_0x01f1
            r6 = 4
            if (r3 != r6) goto L_0x001d
            goto L_0x01f1
        L_0x001d:
            k9.H0 r3 = r0.f45666s
            k9.E0 r3 = r3.p()
            r7 = 10
            if (r3 != 0) goto L_0x002b
            r0.A0(r1, r7)
            return
        L_0x002b:
            java.lang.String r9 = "doSomeWork"
            ja.J.a(r9)
            r16.m1()
            boolean r9 = r3.f45268d
            r10 = 1000(0x3e8, double:4.94E-321)
            r12 = 0
            if (r9 == 0) goto L_0x00ab
            long r13 = android.os.SystemClock.elapsedRealtime()
            long r13 = r13 * r10
            N9.r r9 = r3.f45265a
            k9.Q0 r15 = r0.f45671x
            long r7 = r15.f45369r
            long r10 = r0.f45660m
            long r7 = r7 - r10
            boolean r10 = r0.f45661n
            r9.o(r7, r10)
            r8 = r5
            r9 = r8
            r7 = r12
        L_0x0050:
            k9.a1[] r10 = r0.f45643a
            int r11 = r10.length
            if (r7 >= r11) goto L_0x00b2
            r10 = r10[r7]
            boolean r11 = R(r10)
            if (r11 != 0) goto L_0x005e
            goto L_0x00a6
        L_0x005e:
            long r4 = r0.f45642Z
            r10.g(r4, r13)
            if (r8 == 0) goto L_0x006d
            boolean r4 = r10.b()
            if (r4 == 0) goto L_0x006d
            r8 = 1
            goto L_0x006e
        L_0x006d:
            r8 = r12
        L_0x006e:
            N9.M[] r4 = r3.f45267c
            r4 = r4[r7]
            N9.M r5 = r10.x()
            if (r4 == r5) goto L_0x007a
            r4 = 1
            goto L_0x007b
        L_0x007a:
            r4 = r12
        L_0x007b:
            if (r4 != 0) goto L_0x0085
            boolean r5 = r10.h()
            if (r5 == 0) goto L_0x0085
            r5 = 1
            goto L_0x0086
        L_0x0085:
            r5 = r12
        L_0x0086:
            if (r4 != 0) goto L_0x0099
            if (r5 != 0) goto L_0x0099
            boolean r4 = r10.d()
            if (r4 != 0) goto L_0x0099
            boolean r4 = r10.b()
            if (r4 == 0) goto L_0x0097
            goto L_0x0099
        L_0x0097:
            r4 = r12
            goto L_0x009a
        L_0x0099:
            r4 = 1
        L_0x009a:
            if (r9 == 0) goto L_0x00a0
            if (r4 == 0) goto L_0x00a0
            r9 = 1
            goto L_0x00a1
        L_0x00a0:
            r9 = r12
        L_0x00a1:
            if (r4 != 0) goto L_0x00a6
            r10.q()
        L_0x00a6:
            int r7 = r7 + 1
            r4 = 2
            r5 = 1
            goto L_0x0050
        L_0x00ab:
            N9.r r4 = r3.f45265a
            r4.j()
            r8 = 1
            r9 = 1
        L_0x00b2:
            k9.F0 r4 = r3.f45270f
            long r4 = r4.f45285e
            r13 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r8 == 0) goto L_0x00cf
            boolean r7 = r3.f45268d
            if (r7 == 0) goto L_0x00cf
            int r7 = (r4 > r13 ? 1 : (r4 == r13 ? 0 : -1))
            if (r7 == 0) goto L_0x00cd
            k9.Q0 r7 = r0.f45671x
            long r7 = r7.f45369r
            int r4 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
            if (r4 > 0) goto L_0x00cf
        L_0x00cd:
            r4 = 1
            goto L_0x00d0
        L_0x00cf:
            r4 = r12
        L_0x00d0:
            if (r4 == 0) goto L_0x00e0
            boolean r5 = r0.f45632B
            if (r5 == 0) goto L_0x00e0
            r0.f45632B = r12
            k9.Q0 r5 = r0.f45671x
            int r5 = r5.f45364m
            r7 = 5
            r0.R0(r12, r5, r12, r7)
        L_0x00e0:
            r5 = 3
            if (r4 == 0) goto L_0x00f0
            k9.F0 r4 = r3.f45270f
            boolean r4 = r4.f45289i
            if (r4 == 0) goto L_0x00f0
            r0.Z0(r6)
            r16.i1()
            goto L_0x0139
        L_0x00f0:
            k9.Q0 r4 = r0.f45671x
            int r4 = r4.f45356e
            r7 = 2
            if (r4 != r7) goto L_0x010d
            boolean r4 = r0.d1(r9)
            if (r4 == 0) goto L_0x010d
            r0.Z0(r5)
            r4 = 0
            r0.f45653h0 = r4
            boolean r4 = r16.c1()
            if (r4 == 0) goto L_0x0139
            r16.f1()
            goto L_0x0139
        L_0x010d:
            k9.Q0 r4 = r0.f45671x
            int r4 = r4.f45356e
            if (r4 != r5) goto L_0x0139
            int r4 = r0.f45640X
            if (r4 != 0) goto L_0x011e
            boolean r4 = r16.S()
            if (r4 == 0) goto L_0x0120
            goto L_0x0139
        L_0x011e:
            if (r9 != 0) goto L_0x0139
        L_0x0120:
            boolean r4 = r16.c1()
            r0.f45633C = r4
            r4 = 2
            r0.Z0(r4)
            boolean r4 = r0.f45633C
            if (r4 == 0) goto L_0x0136
            r16.h0()
            k9.v0 r4 = r0.f45668u
            r4.c()
        L_0x0136:
            r16.i1()
        L_0x0139:
            k9.Q0 r4 = r0.f45671x
            int r4 = r4.f45356e
            r7 = 2
            if (r4 != r7) goto L_0x01a2
            r4 = r12
        L_0x0141:
            k9.a1[] r7 = r0.f45643a
            int r8 = r7.length
            if (r4 >= r8) goto L_0x0166
            r7 = r7[r4]
            boolean r7 = R(r7)
            if (r7 == 0) goto L_0x0163
            k9.a1[] r7 = r0.f45643a
            r7 = r7[r4]
            N9.M r7 = r7.x()
            N9.M[] r8 = r3.f45267c
            r8 = r8[r4]
            if (r7 != r8) goto L_0x0163
            k9.a1[] r7 = r0.f45643a
            r7 = r7[r4]
            r7.q()
        L_0x0163:
            int r4 = r4 + 1
            goto L_0x0141
        L_0x0166:
            k9.Q0 r3 = r0.f45671x
            boolean r4 = r3.f45358g
            if (r4 != 0) goto L_0x01a2
            long r3 = r3.f45368q
            r7 = 500000(0x7a120, double:2.47033E-318)
            int r3 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r3 >= 0) goto L_0x01a2
            boolean r3 = r16.Q()
            if (r3 == 0) goto L_0x01a2
            long r3 = r0.f45657j0
            int r3 = (r3 > r13 ? 1 : (r3 == r13 ? 0 : -1))
            if (r3 != 0) goto L_0x018a
            ja.d r3 = r0.f45664q
            long r3 = r3.a()
            r0.f45657j0 = r3
            goto L_0x01a4
        L_0x018a:
            ja.d r3 = r0.f45664q
            long r3 = r3.a()
            long r7 = r0.f45657j0
            long r3 = r3 - r7
            r7 = 4000(0xfa0, double:1.9763E-320)
            int r3 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r3 >= 0) goto L_0x019a
            goto L_0x01a4
        L_0x019a:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "Playback stuck buffering and not loading"
            r1.<init>(r2)
            throw r1
        L_0x01a2:
            r0.f45657j0 = r13
        L_0x01a4:
            boolean r3 = r16.c1()
            if (r3 == 0) goto L_0x01b2
            k9.Q0 r3 = r0.f45671x
            int r3 = r3.f45356e
            if (r3 != r5) goto L_0x01b2
            r3 = 1
            goto L_0x01b3
        L_0x01b2:
            r3 = r12
        L_0x01b3:
            boolean r4 = r0.f45639I
            if (r4 == 0) goto L_0x01bf
            boolean r4 = r0.f45638H
            if (r4 == 0) goto L_0x01bf
            if (r3 == 0) goto L_0x01bf
            r15 = 1
            goto L_0x01c0
        L_0x01bf:
            r15 = r12
        L_0x01c0:
            k9.Q0 r4 = r0.f45671x
            boolean r7 = r4.f45366o
            if (r7 == r15) goto L_0x01cc
            k9.Q0 r4 = r4.h(r15)
            r0.f45671x = r4
        L_0x01cc:
            r0.f45638H = r12
            if (r15 != 0) goto L_0x01f1
            k9.Q0 r4 = r0.f45671x
            int r4 = r4.f45356e
            if (r4 != r6) goto L_0x01d7
            goto L_0x01f1
        L_0x01d7:
            if (r3 != 0) goto L_0x01dc
            r3 = 2
            if (r4 != r3) goto L_0x01df
        L_0x01dc:
            r3 = 10
            goto L_0x01eb
        L_0x01df:
            if (r4 != r5) goto L_0x01ee
            int r3 = r0.f45640X
            if (r3 == 0) goto L_0x01ee
            r3 = 1000(0x3e8, double:4.94E-321)
            r0.A0(r1, r3)
            goto L_0x01ee
        L_0x01eb:
            r0.A0(r1, r3)
        L_0x01ee:
            ja.J.c()
        L_0x01f1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: k9.C3709m0.n():void");
    }

    private void n0(int i10, int i11, O o10) {
        this.f45672y.b(1);
        I(this.f45667t.z(i10, i11, o10), false);
    }

    private void n1(n1 n1Var, C3070t.b bVar, n1 n1Var2, C3070t.b bVar2, long j10) {
        Object obj;
        S0 s02;
        if (!e1(n1Var, bVar)) {
            if (bVar.b()) {
                s02 = S0.f45372d;
            } else {
                s02 = this.f45671x.f45365n;
            }
            if (!this.f45662o.c().equals(s02)) {
                this.f45662o.f(s02);
                return;
            }
            return;
        }
        n1Var.r(n1Var.l(bVar.f33285a, this.f45659l).f45715c, this.f45658k);
        this.f45668u.e((C3732y0.g) M.j(this.f45658k.f45738k));
        if (j10 != -9223372036854775807L) {
            this.f45668u.d(z(n1Var, bVar.f33285a, j10));
            return;
        }
        Object obj2 = this.f45658k.f45728a;
        if (!n1Var2.u()) {
            obj = n1Var2.r(n1Var2.l(bVar2.f33285a, this.f45659l).f45715c, this.f45658k).f45728a;
        } else {
            obj = null;
        }
        if (!M.c(obj, obj2)) {
            this.f45668u.d(-9223372036854775807L);
        }
    }

    private void o1(float f10) {
        for (E0 p10 = this.f45666s.p(); p10 != null; p10 = p10.j()) {
            for (ga.r rVar : p10.o().f43760c) {
                if (rVar != null) {
                    rVar.d(f10);
                }
            }
        }
    }

    private boolean p0() {
        boolean z10;
        E0 q10 = this.f45666s.q();
        B o10 = q10.o();
        int i10 = 0;
        boolean z11 = false;
        while (true) {
            a1[] a1VarArr = this.f45643a;
            if (i10 >= a1VarArr.length) {
                return !z11;
            }
            a1 a1Var = a1VarArr[i10];
            if (R(a1Var)) {
                if (a1Var.x() != q10.f45267c[i10]) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (!o10.c(i10) || z10) {
                    if (!a1Var.r()) {
                        a1Var.D(y(o10.f43760c[i10]), q10.f45267c[i10], q10.m(), q10.l());
                    } else if (a1Var.b()) {
                        m(a1Var);
                    } else {
                        z11 = true;
                    }
                }
            }
            i10++;
        }
    }

    private synchronized void p1(u uVar, long j10) {
        long a10 = this.f45664q.a() + j10;
        boolean z10 = false;
        while (!((Boolean) uVar.get()).booleanValue() && j10 > 0) {
            try {
                this.f45664q.e();
                wait(j10);
            } catch (InterruptedException unused) {
                z10 = true;
            }
            j10 = a10 - this.f45664q.a();
        }
        if (z10) {
            Thread.currentThread().interrupt();
        }
    }

    private void q0() {
        boolean z10;
        float f10 = this.f45662o.c().f45374a;
        E0 p10 = this.f45666s.p();
        E0 q10 = this.f45666s.q();
        boolean z11 = true;
        while (p10 != null && p10.f45268d) {
            B v10 = p10.v(f10, this.f45671x.f45352a);
            if (!v10.a(p10.o())) {
                if (z11) {
                    E0 p11 = this.f45666s.p();
                    boolean z12 = this.f45666s.z(p11);
                    boolean[] zArr = new boolean[this.f45643a.length];
                    long b10 = p11.b(v10, this.f45671x.f45369r, z12, zArr);
                    Q0 q02 = this.f45671x;
                    if (q02.f45356e == 4 || b10 == q02.f45369r) {
                        z10 = false;
                    } else {
                        z10 = true;
                    }
                    Q0 q03 = this.f45671x;
                    E0 e02 = p11;
                    boolean[] zArr2 = zArr;
                    this.f45671x = M(q03.f45353b, b10, q03.f45354c, q03.f45355d, z10, 5);
                    if (z10) {
                        t0(b10);
                    }
                    boolean[] zArr3 = new boolean[this.f45643a.length];
                    int i10 = 0;
                    while (true) {
                        a1[] a1VarArr = this.f45643a;
                        if (i10 >= a1VarArr.length) {
                            break;
                        }
                        a1 a1Var = a1VarArr[i10];
                        boolean R10 = R(a1Var);
                        zArr3[i10] = R10;
                        N9.M m10 = e02.f45267c[i10];
                        if (R10) {
                            if (m10 != a1Var.x()) {
                                m(a1Var);
                            } else if (zArr2[i10]) {
                                a1Var.z(this.f45642Z);
                            }
                        }
                        i10++;
                    }
                    t(zArr3);
                } else {
                    this.f45666s.z(p10);
                    if (p10.f45268d) {
                        p10.a(v10, Math.max(p10.f45270f.f45282b, p10.y(this.f45642Z)), false);
                    }
                }
                H(true);
                if (this.f45671x.f45356e != 4) {
                    W();
                    m1();
                    this.f45652h.g(2);
                    return;
                }
                return;
            }
            if (p10 == q10) {
                z11 = false;
            }
            p10 = p10.j();
        }
    }

    private void r(int i10, boolean z10) {
        boolean z11;
        boolean z12;
        boolean z13;
        a1 a1Var = this.f45643a[i10];
        if (!R(a1Var)) {
            E0 q10 = this.f45666s.q();
            if (q10 == this.f45666s.p()) {
                z11 = true;
            } else {
                z11 = false;
            }
            B o10 = q10.o();
            c1 c1Var = o10.f43759b[i10];
            C3717q0[] y10 = y(o10.f43760c[i10]);
            if (!c1() || this.f45671x.f45356e != 3) {
                z12 = false;
            } else {
                z12 = true;
            }
            if (z10 || !z12) {
                z13 = false;
            } else {
                z13 = true;
            }
            this.f45640X++;
            this.f45644b.add(a1Var);
            a1Var.E(c1Var, y10, q10.f45267c[i10], this.f45642Z, z13, z11, q10.m(), q10.l());
            a1Var.p(11, new a());
            this.f45662o.b(a1Var);
            if (z12) {
                a1Var.start();
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:34:0x00bb  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00c0  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00c4  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00c9  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00cd  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00d2  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00d9  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00fd  */
    /* JADX WARNING: Removed duplicated region for block: B:58:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void r0(boolean r29, boolean r30, boolean r31, boolean r32) {
        /*
            r28 = this;
            r1 = r28
            ja.o r0 = r1.f45652h
            r2 = 2
            r0.i(r2)
            r2 = 0
            r1.f45653h0 = r2
            r3 = 0
            r1.f45633C = r3
            k9.m r0 = r1.f45662o
            r0.h()
            r4 = 1000000000000(0xe8d4a51000, double:4.94065645841E-312)
            r1.f45642Z = r4
            k9.a1[] r4 = r1.f45643a
            int r5 = r4.length
            r6 = r3
        L_0x001e:
            java.lang.String r7 = "ExoPlayerImplInternal"
            if (r6 >= r5) goto L_0x0033
            r0 = r4[r6]
            r1.m(r0)     // Catch:{ r -> 0x002a, RuntimeException -> 0x0028 }
            goto L_0x0030
        L_0x0028:
            r0 = move-exception
            goto L_0x002b
        L_0x002a:
            r0 = move-exception
        L_0x002b:
            java.lang.String r8 = "Disable failed."
            ja.s.d(r7, r8, r0)
        L_0x0030:
            int r6 = r6 + 1
            goto L_0x001e
        L_0x0033:
            if (r29 == 0) goto L_0x0053
            k9.a1[] r4 = r1.f45643a
            int r5 = r4.length
            r6 = r3
        L_0x0039:
            if (r6 >= r5) goto L_0x0053
            r0 = r4[r6]
            java.util.Set r8 = r1.f45644b
            boolean r8 = r8.remove(r0)
            if (r8 == 0) goto L_0x0050
            r0.reset()     // Catch:{ RuntimeException -> 0x0049 }
            goto L_0x0050
        L_0x0049:
            r0 = move-exception
            r8 = r0
            java.lang.String r0 = "Reset failed."
            ja.s.d(r7, r0, r8)
        L_0x0050:
            int r6 = r6 + 1
            goto L_0x0039
        L_0x0053:
            r1.f45640X = r3
            k9.Q0 r0 = r1.f45671x
            N9.t$b r4 = r0.f45353b
            long r5 = r0.f45369r
            k9.Q0 r0 = r1.f45671x
            N9.t$b r0 = r0.f45353b
            boolean r0 = r0.b()
            if (r0 != 0) goto L_0x0075
            k9.Q0 r0 = r1.f45671x
            k9.n1$b r7 = r1.f45659l
            boolean r0 = T(r0, r7)
            if (r0 == 0) goto L_0x0070
            goto L_0x0075
        L_0x0070:
            k9.Q0 r0 = r1.f45671x
            long r7 = r0.f45369r
            goto L_0x0079
        L_0x0075:
            k9.Q0 r0 = r1.f45671x
            long r7 = r0.f45354c
        L_0x0079:
            if (r30 == 0) goto L_0x00a6
            r1.f45641Y = r2
            k9.Q0 r0 = r1.f45671x
            k9.n1 r0 = r0.f45352a
            android.util.Pair r0 = r1.B(r0)
            java.lang.Object r4 = r0.first
            N9.t$b r4 = (N9.C3070t.b) r4
            java.lang.Object r0 = r0.second
            java.lang.Long r0 = (java.lang.Long) r0
            long r5 = r0.longValue()
            k9.Q0 r0 = r1.f45671x
            N9.t$b r0 = r0.f45353b
            boolean r0 = r4.equals(r0)
            r7 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r0 != 0) goto L_0x00a6
            r0 = 1
        L_0x00a1:
            r17 = r4
            r25 = r5
            goto L_0x00a8
        L_0x00a6:
            r0 = r3
            goto L_0x00a1
        L_0x00a8:
            k9.H0 r4 = r1.f45666s
            r4.f()
            r1.f45634D = r3
            k9.Q0 r3 = new k9.Q0
            k9.Q0 r4 = r1.f45671x
            k9.n1 r5 = r4.f45352a
            int r11 = r4.f45356e
            if (r32 == 0) goto L_0x00bb
        L_0x00b9:
            r12 = r2
            goto L_0x00be
        L_0x00bb:
            k9.r r2 = r4.f45357f
            goto L_0x00b9
        L_0x00be:
            if (r0 == 0) goto L_0x00c4
            N9.V r2 = N9.V.f33194d
        L_0x00c2:
            r14 = r2
            goto L_0x00c7
        L_0x00c4:
            N9.V r2 = r4.f45359h
            goto L_0x00c2
        L_0x00c7:
            if (r0 == 0) goto L_0x00cd
            ga.B r2 = r1.f45647e
        L_0x00cb:
            r15 = r2
            goto L_0x00d0
        L_0x00cd:
            ga.B r2 = r4.f45360i
            goto L_0x00cb
        L_0x00d0:
            if (r0 == 0) goto L_0x00d9
            com.google.common.collect.v r0 = com.google.common.collect.C4770v.E()
        L_0x00d6:
            r16 = r0
            goto L_0x00dc
        L_0x00d9:
            java.util.List r0 = r4.f45361j
            goto L_0x00d6
        L_0x00dc:
            k9.Q0 r0 = r1.f45671x
            boolean r2 = r0.f45363l
            r18 = r2
            int r2 = r0.f45364m
            r19 = r2
            k9.S0 r0 = r0.f45365n
            r20 = r0
            r23 = 0
            r27 = 0
            r13 = 0
            r4 = r3
            r6 = r17
            r9 = r25
            r21 = r25
            r4.<init>(r5, r6, r7, r9, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r23, r25, r27)
            r1.f45671x = r3
            if (r31 == 0) goto L_0x0102
            k9.K0 r0 = r1.f45667t
            r0.x()
        L_0x0102:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: k9.C3709m0.r0(boolean, boolean, boolean, boolean):void");
    }

    private void s() {
        t(new boolean[this.f45643a.length]);
    }

    private void s0() {
        boolean z10;
        E0 p10 = this.f45666s.p();
        if (p10 == null || !p10.f45270f.f45288h || !this.f45631A) {
            z10 = false;
        } else {
            z10 = true;
        }
        this.f45632B = z10;
    }

    private void t(boolean[] zArr) {
        E0 q10 = this.f45666s.q();
        B o10 = q10.o();
        for (int i10 = 0; i10 < this.f45643a.length; i10++) {
            if (!o10.c(i10) && this.f45644b.remove(this.f45643a[i10])) {
                this.f45643a[i10].reset();
            }
        }
        for (int i11 = 0; i11 < this.f45643a.length; i11++) {
            if (o10.c(i11)) {
                r(i11, zArr[i11]);
            }
        }
        q10.f45271g = true;
    }

    private void t0(long j10) {
        long j11;
        E0 p10 = this.f45666s.p();
        if (p10 == null) {
            j11 = j10 + 1000000000000L;
        } else {
            j11 = p10.z(j10);
        }
        this.f45642Z = j11;
        this.f45662o.d(j11);
        for (a1 a1Var : this.f45643a) {
            if (R(a1Var)) {
                a1Var.z(this.f45642Z);
            }
        }
        f0();
    }

    private void u(a1 a1Var) {
        if (a1Var.getState() == 2) {
            a1Var.stop();
        }
    }

    private static void u0(n1 n1Var, d dVar, n1.d dVar2, n1.b bVar) {
        long j10;
        int i10 = n1Var.r(n1Var.l(dVar.f45682d, bVar).f45715c, dVar2).f45743p;
        Object obj = n1Var.k(i10, bVar, true).f45714b;
        long j11 = bVar.f45716d;
        if (j11 != -9223372036854775807L) {
            j10 = j11 - 1;
        } else {
            j10 = Long.MAX_VALUE;
        }
        dVar.b(i10, j10, obj);
    }

    private static boolean v0(d dVar, n1 n1Var, n1 n1Var2, int i10, boolean z10, n1.d dVar2, n1.b bVar) {
        long j10;
        d dVar3 = dVar;
        n1 n1Var3 = n1Var;
        n1 n1Var4 = n1Var2;
        n1.d dVar4 = dVar2;
        n1.b bVar2 = bVar;
        Object obj = dVar3.f45682d;
        if (obj == null) {
            if (dVar3.f45679a.f() == Long.MIN_VALUE) {
                j10 = -9223372036854775807L;
            } else {
                j10 = M.C0(dVar3.f45679a.f());
            }
            Pair y02 = y0(n1Var, new h(dVar3.f45679a.h(), dVar3.f45679a.d(), j10), false, i10, z10, dVar2, bVar);
            if (y02 == null) {
                return false;
            }
            dVar.b(n1Var3.f(y02.first), ((Long) y02.second).longValue(), y02.first);
            if (dVar3.f45679a.f() == Long.MIN_VALUE) {
                u0(n1Var3, dVar, dVar4, bVar2);
            }
            return true;
        }
        int f10 = n1Var3.f(obj);
        if (f10 == -1) {
            return false;
        }
        if (dVar3.f45679a.f() == Long.MIN_VALUE) {
            u0(n1Var3, dVar, dVar4, bVar2);
            return true;
        }
        dVar3.f45680b = f10;
        n1Var4.l(dVar3.f45682d, bVar2);
        if (bVar2.f45718f && n1Var4.r(bVar2.f45715c, dVar4).f45742o == n1Var4.f(dVar3.f45682d)) {
            long q10 = dVar3.f45681c + bVar.q();
            Pair n10 = n1Var.n(dVar2, bVar, n1Var3.l(dVar3.f45682d, bVar2).f45715c, q10);
            dVar.b(n1Var3.f(n10.first), ((Long) n10.second).longValue(), n10.first);
        }
        return true;
    }

    private C4770v w(ga.r[] rVarArr) {
        C4770v.a aVar = new C4770v.a();
        boolean z10 = false;
        for (ga.r rVar : rVarArr) {
            if (rVar != null) {
                D9.a aVar2 = rVar.b(0).f45768j;
                if (aVar2 == null) {
                    aVar.a(new D9.a(new a.b[0]));
                } else {
                    aVar.a(aVar2);
                    z10 = true;
                }
            }
        }
        if (z10) {
            return aVar.k();
        }
        return C4770v.E();
    }

    private void w0(n1 n1Var, n1 n1Var2) {
        if (!n1Var.u() || !n1Var2.u()) {
            for (int size = this.f45663p.size() - 1; size >= 0; size--) {
                if (!v0((d) this.f45663p.get(size), n1Var, n1Var2, this.f45635E, this.f45636F, this.f45658k, this.f45659l)) {
                    ((d) this.f45663p.get(size)).f45679a.k(false);
                    this.f45663p.remove(size);
                }
            }
            Collections.sort(this.f45663p);
        }
    }

    private long x() {
        Q0 q02 = this.f45671x;
        return z(q02.f45352a, q02.f45353b.f33285a, q02.f45369r);
    }

    /* JADX WARNING: Removed duplicated region for block: B:48:0x0156  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0174  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x01c0  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static k9.C3709m0.g x0(k9.n1 r30, k9.Q0 r31, k9.C3709m0.h r32, k9.H0 r33, int r34, boolean r35, k9.n1.d r36, k9.n1.b r37) {
        /*
            r7 = r30
            r8 = r31
            r9 = r32
            r10 = r35
            r11 = r37
            boolean r0 = r30.u()
            if (r0 == 0) goto L_0x0025
            k9.m0$g r0 = new k9.m0$g
            N9.t$b r2 = k9.Q0.k()
            r8 = 1
            r9 = 0
            r3 = 0
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r7 = 0
            r1 = r0
            r1.<init>(r2, r3, r5, r7, r8, r9)
            return r0
        L_0x0025:
            N9.t$b r14 = r8.f45353b
            java.lang.Object r12 = r14.f33285a
            boolean r13 = T(r8, r11)
            N9.t$b r0 = r8.f45353b
            boolean r0 = r0.b()
            if (r0 != 0) goto L_0x003c
            if (r13 == 0) goto L_0x0038
            goto L_0x003c
        L_0x0038:
            long r0 = r8.f45369r
        L_0x003a:
            r15 = r0
            goto L_0x003f
        L_0x003c:
            long r0 = r8.f45354c
            goto L_0x003a
        L_0x003f:
            r17 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r6 = -1
            r19 = 0
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
            android.util.Pair r0 = y0(r0, r1, r2, r3, r4, r5, r6)
            if (r0 != 0) goto L_0x006d
            int r0 = r7.e(r10)
            r6 = r0
            r0 = r15
            r2 = r19
            r3 = r2
            r4 = r20
            goto L_0x0098
        L_0x006d:
            long r1 = r9.f45698c
            int r1 = (r1 > r17 ? 1 : (r1 == r17 ? 0 : -1))
            if (r1 != 0) goto L_0x007f
            java.lang.Object r0 = r0.first
            k9.n1$b r0 = r7.l(r0, r11)
            int r6 = r0.f45715c
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
            int r3 = r8.f45356e
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
            goto L_0x0154
        L_0x00a5:
            r21 = r14
            r14 = r6
            k9.n1 r0 = r8.f45352a
            boolean r0 = r0.u()
            if (r0 == 0) goto L_0x00bf
            int r0 = r7.e(r10)
        L_0x00b4:
            r9 = r36
            r3 = r0
            r0 = r15
            r27 = r19
            r28 = r27
            r29 = r28
            goto L_0x00a1
        L_0x00bf:
            int r0 = r7.f(r12)
            if (r0 != r14) goto L_0x00f2
            k9.n1 r5 = r8.f45352a
            r0 = r36
            r1 = r37
            r2 = r34
            r3 = r35
            r4 = r12
            r6 = r30
            java.lang.Object r0 = z0(r0, r1, r2, r3, r4, r5, r6)
            if (r0 != 0) goto L_0x00df
            int r0 = r7.e(r10)
            r4 = r20
            goto L_0x00e7
        L_0x00df:
            k9.n1$b r0 = r7.l(r0, r11)
            int r0 = r0.f45715c
            r4 = r19
        L_0x00e7:
            r9 = r36
            r3 = r0
            r28 = r4
            r0 = r15
            r27 = r19
            r29 = r27
            goto L_0x00a1
        L_0x00f2:
            int r0 = (r15 > r17 ? 1 : (r15 == r17 ? 0 : -1))
            if (r0 != 0) goto L_0x00fd
            k9.n1$b r0 = r7.l(r12, r11)
            int r0 = r0.f45715c
            goto L_0x00b4
        L_0x00fd:
            if (r13 == 0) goto L_0x0148
            k9.n1 r0 = r8.f45352a
            r6 = r21
            java.lang.Object r1 = r6.f33285a
            r0.l(r1, r11)
            k9.n1 r0 = r8.f45352a
            int r1 = r11.f45715c
            r9 = r36
            k9.n1$d r0 = r0.r(r1, r9)
            int r0 = r0.f45742o
            k9.n1 r1 = r8.f45352a
            java.lang.Object r2 = r6.f33285a
            int r1 = r1.f(r2)
            if (r0 != r1) goto L_0x013f
            long r0 = r37.q()
            long r4 = r15 + r0
            k9.n1$b r0 = r7.l(r12, r11)
            int r3 = r0.f45715c
            r0 = r30
            r1 = r36
            r2 = r37
            android.util.Pair r0 = r0.n(r1, r2, r3, r4)
            java.lang.Object r12 = r0.first
            java.lang.Object r0 = r0.second
            java.lang.Long r0 = (java.lang.Long) r0
            long r0 = r0.longValue()
            goto L_0x0140
        L_0x013f:
            r0 = r15
        L_0x0140:
            r3 = r14
            r27 = r19
            r28 = r27
            r29 = r20
            goto L_0x0154
        L_0x0148:
            r9 = r36
            r6 = r21
            r3 = r14
            r0 = r15
            r27 = r19
            r28 = r27
            r29 = r28
        L_0x0154:
            if (r3 == r14) goto L_0x0174
            r4 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r0 = r30
            r1 = r36
            r2 = r37
            android.util.Pair r0 = r0.n(r1, r2, r3, r4)
            java.lang.Object r12 = r0.first
            java.lang.Object r0 = r0.second
            java.lang.Long r0 = (java.lang.Long) r0
            long r0 = r0.longValue()
            r2 = r33
            r25 = r17
            goto L_0x0178
        L_0x0174:
            r2 = r33
            r25 = r0
        L_0x0178:
            N9.t$b r2 = r2.B(r7, r12, r0)
            int r3 = r2.f33289e
            if (r3 == r14) goto L_0x018a
            int r4 = r6.f33289e
            if (r4 == r14) goto L_0x0187
            if (r3 < r4) goto L_0x0187
            goto L_0x018a
        L_0x0187:
            r3 = r19
            goto L_0x018c
        L_0x018a:
            r3 = r20
        L_0x018c:
            java.lang.Object r4 = r6.f33285a
            boolean r4 = r4.equals(r12)
            if (r4 == 0) goto L_0x01a3
            boolean r4 = r6.b()
            if (r4 != 0) goto L_0x01a3
            boolean r4 = r2.b()
            if (r4 != 0) goto L_0x01a3
            if (r3 == 0) goto L_0x01a3
            goto L_0x01a5
        L_0x01a3:
            r20 = r19
        L_0x01a5:
            k9.n1$b r17 = r7.l(r12, r11)
            r12 = r13
            r13 = r6
            r3 = r6
            r14 = r15
            r16 = r2
            r18 = r25
            boolean r4 = P(r12, r13, r14, r16, r17, r18)
            if (r20 != 0) goto L_0x01b9
            if (r4 == 0) goto L_0x01ba
        L_0x01b9:
            r2 = r3
        L_0x01ba:
            boolean r4 = r2.b()
            if (r4 == 0) goto L_0x01c8
            boolean r0 = r2.equals(r3)
            if (r0 == 0) goto L_0x01cb
            long r0 = r8.f45369r
        L_0x01c8:
            r23 = r0
            goto L_0x01e2
        L_0x01cb:
            java.lang.Object r0 = r2.f33285a
            r7.l(r0, r11)
            int r0 = r2.f33287c
            int r1 = r2.f33286b
            int r1 = r11.n(r1)
            if (r0 != r1) goto L_0x01df
            long r0 = r37.j()
            goto L_0x01c8
        L_0x01df:
            r0 = 0
            goto L_0x01c8
        L_0x01e2:
            k9.m0$g r0 = new k9.m0$g
            r21 = r0
            r22 = r2
            r21.<init>(r22, r23, r25, r27, r28, r29)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: k9.C3709m0.x0(k9.n1, k9.Q0, k9.m0$h, k9.H0, int, boolean, k9.n1$d, k9.n1$b):k9.m0$g");
    }

    private static C3717q0[] y(ga.r rVar) {
        int i10;
        if (rVar != null) {
            i10 = rVar.length();
        } else {
            i10 = 0;
        }
        C3717q0[] q0VarArr = new C3717q0[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            q0VarArr[i11] = rVar.b(i11);
        }
        return q0VarArr;
    }

    private static Pair y0(n1 n1Var, h hVar, boolean z10, int i10, boolean z11, n1.d dVar, n1.b bVar) {
        n1 n1Var2;
        Object z02;
        n1 n1Var3 = n1Var;
        h hVar2 = hVar;
        n1.b bVar2 = bVar;
        n1 n1Var4 = hVar2.f45696a;
        if (n1Var.u()) {
            return null;
        }
        if (n1Var4.u()) {
            n1Var2 = n1Var3;
        } else {
            n1Var2 = n1Var4;
        }
        try {
            Pair n10 = n1Var2.n(dVar, bVar, hVar2.f45697b, hVar2.f45698c);
            if (n1Var.equals(n1Var2)) {
                return n10;
            }
            if (n1Var.f(n10.first) == -1) {
                n1.d dVar2 = dVar;
                if (z10 && (z02 = z0(dVar, bVar, i10, z11, n10.first, n1Var2, n1Var)) != null) {
                    return n1Var.n(dVar, bVar, n1Var.l(z02, bVar2).f45715c, -9223372036854775807L);
                }
                return null;
            } else if (!n1Var2.l(n10.first, bVar2).f45718f || n1Var2.r(bVar2.f45715c, dVar).f45742o != n1Var2.f(n10.first)) {
                return n10;
            } else {
                return n1Var.n(dVar, bVar, n1Var.l(n10.first, bVar2).f45715c, hVar2.f45698c);
            }
        } catch (IndexOutOfBoundsException unused) {
        }
    }

    private long z(n1 n1Var, Object obj, long j10) {
        n1Var.r(n1Var.l(obj, this.f45659l).f45715c, this.f45658k);
        n1.d dVar = this.f45658k;
        if (dVar.f45733f != -9223372036854775807L && dVar.g()) {
            n1.d dVar2 = this.f45658k;
            if (dVar2.f45736i) {
                return M.C0(dVar2.c() - this.f45658k.f45733f) - (j10 + this.f45659l.q());
            }
        }
        return -9223372036854775807L;
    }

    static Object z0(n1.d dVar, n1.b bVar, int i10, boolean z10, Object obj, n1 n1Var, n1 n1Var2) {
        int f10 = n1Var.f(obj);
        int m10 = n1Var.m();
        int i11 = f10;
        int i12 = -1;
        for (int i13 = 0; i13 < m10 && i12 == -1; i13++) {
            i11 = n1Var.h(i11, bVar, dVar, i10, z10);
            if (i11 == -1) {
                break;
            }
            i12 = n1Var2.f(n1Var.q(i11));
        }
        if (i12 == -1) {
            return null;
        }
        return n1Var2.q(i12);
    }

    public void B0(n1 n1Var, int i10, long j10) {
        this.f45652h.c(3, new h(n1Var, i10, j10)).a();
    }

    public Looper C() {
        return this.f45656j;
    }

    public void N0(List list, int i10, long j10, O o10) {
        this.f45652h.c(17, new b(list, o10, i10, j10, (a) null)).a();
    }

    public void Q0(boolean z10, int i10) {
        this.f45652h.e(1, z10 ? 1 : 0, i10).a();
    }

    public void S0(S0 s02) {
        this.f45652h.c(4, s02).a();
    }

    public void U0(int i10) {
        this.f45652h.e(11, i10, 0).a();
    }

    public void a() {
        this.f45652h.g(10);
    }

    public void b() {
        this.f45652h.g(22);
    }

    public synchronized void c(W0 w02) {
        if (!this.f45673z) {
            if (this.f45654i.isAlive()) {
                this.f45652h.c(14, w02).a();
                return;
            }
        }
        s.i("ExoPlayerImplInternal", "Ignoring messages sent after release.");
        w02.k(false);
    }

    public void g1() {
        this.f45652h.a(6).a();
    }

    public boolean handleMessage(Message message) {
        E0 q10;
        int i10;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        int i11 = 1000;
        try {
            switch (message.what) {
                case 0:
                    k0();
                    break;
                case 1:
                    if (message.arg1 != 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    R0(z10, message.arg2, true, 1);
                    break;
                case 2:
                    n();
                    break;
                case 3:
                    D0((h) message.obj);
                    break;
                case 4:
                    T0((S0) message.obj);
                    break;
                case 5:
                    W0((e1) message.obj);
                    break;
                case 6:
                    h1(false, true);
                    break;
                case 7:
                    m0();
                    return true;
                case 8:
                    J((r) message.obj);
                    break;
                case 9:
                    F((r) message.obj);
                    break;
                case 10:
                    q0();
                    break;
                case 11:
                    V0(message.arg1);
                    break;
                case 12:
                    if (message.arg1 != 0) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    X0(z11);
                    break;
                case 13:
                    if (message.arg1 != 0) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    L0(z12, (AtomicBoolean) message.obj);
                    break;
                case StdKeyDeserializer.TYPE_URL:
                    G0((W0) message.obj);
                    break;
                case StdKeyDeserializer.TYPE_CLASS:
                    I0((W0) message.obj);
                    break;
                case 16:
                    L((S0) message.obj, false);
                    break;
                case 17:
                    M0((b) message.obj);
                    break;
                case 18:
                    i((b) message.obj, message.arg1);
                    break;
                case 19:
                    android.support.v4.media.session.c.a(message.obj);
                    e0((c) null);
                    break;
                case InboxPagingSource.PAGE_SIZE /*20*/:
                    n0(message.arg1, message.arg2, (O) message.obj);
                    break;
                case 21:
                    Y0((O) message.obj);
                    break;
                case 22:
                    d0();
                    break;
                case 23:
                    if (message.arg1 != 0) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    P0(z13);
                    break;
                case 24:
                    if (message.arg1 == 1) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    O0(z14);
                    break;
                case 25:
                    j();
                    break;
                default:
                    return false;
            }
        } catch (r e10) {
            e = e10;
            if (e.f45816d == 1 && (q10 = this.f45666s.q()) != null) {
                e = e.f(q10.f45270f.f45281a);
            }
            if (!e.f45822j || this.f45653h0 != null) {
                r rVar = this.f45653h0;
                if (rVar != null) {
                    rVar.addSuppressed(e);
                    e = this.f45653h0;
                }
                s.d("ExoPlayerImplInternal", "Playback error", e);
                h1(true, false);
                this.f45671x = this.f45671x.e(e);
            } else {
                s.j("ExoPlayerImplInternal", "Recoverable renderer error", e);
                this.f45653h0 = e;
                o oVar = this.f45652h;
                oVar.j(oVar.c(25, e));
            }
        } catch (n.a e11) {
            G(e11, e11.f47527a);
        } catch (L0 e12) {
            int i12 = e12.f45338b;
            if (i12 != 1) {
                if (i12 == 4) {
                    if (e12.f45337a) {
                        i10 = 3002;
                    } else {
                        i10 = 3004;
                    }
                }
                G(e12, i11);
            } else if (e12.f45337a) {
                i10 = 3001;
            } else {
                i10 = 3003;
            }
            i11 = i10;
            G(e12, i11);
        } catch (C3613k e13) {
            G(e13, e13.f44449a);
        } catch (C3053b e14) {
            G(e14, ErrorCodes.UNSUPPORTED_ENCODING_EXCEPTION);
        } catch (IOException e15) {
            G(e15, 2000);
        } catch (RuntimeException e16) {
            if ((e16 instanceof IllegalStateException) || (e16 instanceof IllegalArgumentException)) {
                i11 = ErrorCodes.PROTOCOL_EXCEPTION;
            }
            r j10 = r.j(e16, i11);
            s.d("ExoPlayerImplInternal", "Playback error", j10);
            h1(true, false);
            this.f45671x = this.f45671x.e(j10);
        }
        X();
        return true;
    }

    /* renamed from: i0 */
    public void p(r rVar) {
        this.f45652h.c(9, rVar).a();
    }

    public void j0() {
        this.f45652h.a(0).a();
    }

    public void k(r rVar) {
        this.f45652h.c(8, rVar).a();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0025, code lost:
        return true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized boolean l0() {
        /*
            r3 = this;
            monitor-enter(r3)
            boolean r0 = r3.f45673z     // Catch:{ all -> 0x0022 }
            if (r0 != 0) goto L_0x0024
            android.os.HandlerThread r0 = r3.f45654i     // Catch:{ all -> 0x0022 }
            boolean r0 = r0.isAlive()     // Catch:{ all -> 0x0022 }
            if (r0 != 0) goto L_0x000e
            goto L_0x0024
        L_0x000e:
            ja.o r0 = r3.f45652h     // Catch:{ all -> 0x0022 }
            r1 = 7
            r0.g(r1)     // Catch:{ all -> 0x0022 }
            k9.k0 r0 = new k9.k0     // Catch:{ all -> 0x0022 }
            r0.<init>(r3)     // Catch:{ all -> 0x0022 }
            long r1 = r3.f45669v     // Catch:{ all -> 0x0022 }
            r3.p1(r0, r1)     // Catch:{ all -> 0x0022 }
            boolean r0 = r3.f45673z     // Catch:{ all -> 0x0022 }
            monitor-exit(r3)
            return r0
        L_0x0022:
            r0 = move-exception
            goto L_0x0027
        L_0x0024:
            monitor-exit(r3)
            r0 = 1
            return r0
        L_0x0027:
            monitor-exit(r3)     // Catch:{ all -> 0x0022 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: k9.C3709m0.l0():boolean");
    }

    public void o(S0 s02) {
        this.f45652h.c(16, s02).a();
    }

    public void o0(int i10, int i11, O o10) {
        this.f45652h.k(20, i10, i11, o10).a();
    }

    public void v(long j10) {
        this.f45655i0 = j10;
    }
}
