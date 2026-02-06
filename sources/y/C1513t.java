package Y;

import Y.I;
import a0.d;
import a0.f;
import androidx.collection.B;
import androidx.collection.K;
import androidx.collection.L;
import androidx.collection.N;
import androidx.collection.W;
import androidx.collection.X;
import i0.C2053g;
import i0.x;
import i0.y;
import j0.C2118c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Pair;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lf.C6514M;
import lf.C6527k;
import mf.C6565s;
import qf.g;
import yf.C6787a;
import yf.p;

/* renamed from: Y.t  reason: case insensitive filesystem */
public final class C1513t implements F, V0, N0 {

    /* renamed from: a  reason: collision with root package name */
    private final r f10145a;

    /* renamed from: b  reason: collision with root package name */
    private final C1483f f10146b;

    /* renamed from: c  reason: collision with root package name */
    private final AtomicReference f10147c;

    /* renamed from: d  reason: collision with root package name */
    private final Object f10148d;

    /* renamed from: e  reason: collision with root package name */
    private final Set f10149e;

    /* renamed from: f  reason: collision with root package name */
    private final C1476c1 f10150f;
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public final f f10151g;

    /* renamed from: h  reason: collision with root package name */
    private final L f10152h;

    /* renamed from: i  reason: collision with root package name */
    private final L f10153i;

    /* renamed from: j  reason: collision with root package name */
    private final f f10154j;

    /* renamed from: k  reason: collision with root package name */
    private final Z.a f10155k;

    /* renamed from: l  reason: collision with root package name */
    private final Z.a f10156l;

    /* renamed from: m  reason: collision with root package name */
    private final f f10157m;

    /* renamed from: n  reason: collision with root package name */
    private f f10158n;

    /* renamed from: o  reason: collision with root package name */
    private boolean f10159o;

    /* renamed from: p  reason: collision with root package name */
    private C1513t f10160p;

    /* renamed from: q  reason: collision with root package name */
    private int f10161q;

    /* renamed from: r  reason: collision with root package name */
    private final A f10162r;

    /* renamed from: s  reason: collision with root package name */
    private final C1502n f10163s;

    /* renamed from: t  reason: collision with root package name */
    private final g f10164t;

    /* renamed from: u  reason: collision with root package name */
    private final boolean f10165u;

    /* renamed from: v  reason: collision with root package name */
    private boolean f10166v;

    /* renamed from: w  reason: collision with root package name */
    private p f10167w;

    /* renamed from: Y.t$a */
    private static final class a implements S0 {

        /* renamed from: a  reason: collision with root package name */
        private final Set f10168a;

        /* renamed from: b  reason: collision with root package name */
        private final List f10169b = new ArrayList();

        /* renamed from: c  reason: collision with root package name */
        private final List f10170c = new ArrayList();

        /* renamed from: d  reason: collision with root package name */
        private final List f10171d = new ArrayList();

        /* renamed from: e  reason: collision with root package name */
        private L f10172e;

        /* renamed from: f  reason: collision with root package name */
        private final List f10173f = new ArrayList();

        /* renamed from: g  reason: collision with root package name */
        private final B f10174g = new B(0, 1, (DefaultConstructorMarker) null);

        /* renamed from: h  reason: collision with root package name */
        private final B f10175h = new B(0, 1, (DefaultConstructorMarker) null);

        public a(Set set) {
            this.f10168a = set;
        }

        private final void i(int i10) {
            if (!this.f10173f.isEmpty()) {
                int i11 = 0;
                int i12 = 0;
                List list = null;
                B b10 = null;
                B b11 = null;
                while (i12 < this.f10175h.b()) {
                    if (i10 <= this.f10175h.a(i12)) {
                        Object remove = this.f10173f.remove(i12);
                        int l10 = this.f10175h.l(i12);
                        int l11 = this.f10174g.l(i12);
                        if (list == null) {
                            list = C6565s.t(remove);
                            b11 = new B(0, 1, (DefaultConstructorMarker) null);
                            b11.h(l10);
                            b10 = new B(0, 1, (DefaultConstructorMarker) null);
                            b10.h(l11);
                        } else {
                            C6496s.f(b10, "null cannot be cast to non-null type androidx.collection.MutableIntList");
                            C6496s.f(b11, "null cannot be cast to non-null type androidx.collection.MutableIntList");
                            list.add(remove);
                            b11.h(l10);
                            b10.h(l11);
                        }
                    } else {
                        i12++;
                    }
                }
                if (list != null) {
                    C6496s.f(b10, "null cannot be cast to non-null type androidx.collection.MutableIntList");
                    C6496s.f(b11, "null cannot be cast to non-null type androidx.collection.MutableIntList");
                    int size = list.size() - 1;
                    while (i11 < size) {
                        int i13 = i11 + 1;
                        int size2 = list.size();
                        for (int i14 = i13; i14 < size2; i14++) {
                            int a10 = b11.a(i11);
                            int a11 = b11.a(i14);
                            if (a10 < a11 || (a11 == a10 && b10.a(i11) < b10.a(i14))) {
                                C1515u.g(list, i11, i14);
                                C1515u.f(b10, i11, i14);
                                C1515u.f(b11, i11, i14);
                            }
                        }
                        i11 = i13;
                    }
                    this.f10170c.addAll(list);
                }
            }
        }

        private final void j(Object obj, int i10, int i11, int i12) {
            i(i10);
            if (i12 < 0 || i12 >= i10) {
                this.f10170c.add(obj);
                return;
            }
            this.f10173f.add(obj);
            this.f10174g.h(i11);
            this.f10175h.h(i12);
        }

        public void a(C1496k kVar, int i10, int i11, int i12) {
            j(kVar, i10, i11, i12);
        }

        public void b(T0 t02, int i10, int i11, int i12) {
            j(t02, i10, i11, i12);
        }

        public void c(C6787a aVar) {
            this.f10171d.add(aVar);
        }

        public void d(T0 t02) {
            this.f10169b.add(t02);
        }

        public void e(C1496k kVar, int i10, int i11, int i12) {
            L l10 = this.f10172e;
            if (l10 == null) {
                l10 = X.a();
                this.f10172e = l10;
            }
            l10.w(kVar);
            j(kVar, i10, i11, i12);
        }

        public final void f() {
            if (!this.f10168a.isEmpty()) {
                Object a10 = E1.f9759a.a("Compose:abandons");
                try {
                    Iterator it = this.f10168a.iterator();
                    while (it.hasNext()) {
                        it.remove();
                        ((T0) it.next()).c();
                    }
                    C6514M m10 = C6514M.f71813a;
                    E1.f9759a.b(a10);
                } catch (Throwable th2) {
                    E1.f9759a.b(a10);
                    throw th2;
                }
            }
        }

        public final void g() {
            i(Integer.MIN_VALUE);
            if (!this.f10170c.isEmpty()) {
                Object a10 = E1.f9759a.a("Compose:onForgotten");
                try {
                    L l10 = this.f10172e;
                    for (int size = this.f10170c.size() - 1; -1 < size; size--) {
                        Object obj = this.f10170c.get(size);
                        if (obj instanceof T0) {
                            this.f10168a.remove(obj);
                            ((T0) obj).d();
                        }
                        if (obj instanceof C1496k) {
                            if (l10 == null || !l10.a(obj)) {
                                ((C1496k) obj).f();
                            } else {
                                ((C1496k) obj).c();
                            }
                        }
                    }
                    C6514M m10 = C6514M.f71813a;
                    E1.f9759a.b(a10);
                } catch (Throwable th2) {
                    E1.f9759a.b(a10);
                    throw th2;
                }
            }
            if (!this.f10169b.isEmpty()) {
                Object a11 = E1.f9759a.a("Compose:onRemembered");
                try {
                    List list = this.f10169b;
                    int size2 = list.size();
                    for (int i10 = 0; i10 < size2; i10++) {
                        T0 t02 = (T0) list.get(i10);
                        this.f10168a.remove(t02);
                        t02.b();
                    }
                    C6514M m11 = C6514M.f71813a;
                    E1.f9759a.b(a11);
                } catch (Throwable th3) {
                    E1.f9759a.b(a11);
                    throw th3;
                }
            }
        }

        public final void h() {
            if (!this.f10171d.isEmpty()) {
                Object a10 = E1.f9759a.a("Compose:sideeffects");
                try {
                    List list = this.f10171d;
                    int size = list.size();
                    for (int i10 = 0; i10 < size; i10++) {
                        ((C6787a) list.get(i10)).invoke();
                    }
                    this.f10171d.clear();
                    C6514M m10 = C6514M.f71813a;
                    E1.f9759a.b(a10);
                } catch (Throwable th2) {
                    E1.f9759a.b(a10);
                    throw th2;
                }
            }
        }
    }

    public C1513t(r rVar, C1483f fVar, g gVar) {
        this.f10145a = rVar;
        this.f10146b = fVar;
        this.f10147c = new AtomicReference((Object) null);
        this.f10148d = new Object();
        Set l10 = new L(0, 1, (DefaultConstructorMarker) null).l();
        this.f10149e = l10;
        C1476c1 c1Var = new C1476c1();
        if (rVar.c()) {
            c1Var.n();
        }
        if (rVar.e()) {
            c1Var.r();
        }
        this.f10150f = c1Var;
        this.f10151g = new f();
        this.f10152h = new L(0, 1, (DefaultConstructorMarker) null);
        this.f10153i = new L(0, 1, (DefaultConstructorMarker) null);
        this.f10154j = new f();
        Z.a aVar = new Z.a();
        this.f10155k = aVar;
        Z.a aVar2 = new Z.a();
        this.f10156l = aVar2;
        this.f10157m = new f();
        this.f10158n = new f();
        this.f10162r = new A((C2118c) null, false, 3, (DefaultConstructorMarker) null);
        C1502n nVar = new C1502n(fVar, rVar, c1Var, l10, aVar, aVar2, this);
        rVar.n(nVar);
        this.f10163s = nVar;
        this.f10164t = gVar;
        this.f10165u = rVar instanceof O0;
        this.f10167w = C1492i.f10015a.a();
    }

    private final void A() {
        boolean z10;
        long[] jArr;
        int i10;
        int i11;
        int i12;
        long[] jArr2;
        int i13;
        boolean z11;
        Object[] objArr;
        long[] jArr3;
        long[] jArr4;
        K d10 = this.f10154j.d();
        long[] jArr5 = d10.f12123a;
        int length = jArr5.length - 2;
        char c10 = 7;
        long j10 = -9187201950435737472L;
        int i14 = 8;
        if (length >= 0) {
            int i15 = 0;
            while (true) {
                long j11 = jArr5[i15];
                if ((((~j11) << c10) & j11 & j10) != j10) {
                    int i16 = 8 - ((~(i15 - length)) >>> 31);
                    int i17 = 0;
                    while (i17 < i16) {
                        if ((j11 & 255) < 128) {
                            int i18 = (i15 << 3) + i17;
                            Object obj = d10.f12124b[i18];
                            Object obj2 = d10.f12125c[i18];
                            if (obj2 instanceof L) {
                                C6496s.f(obj2, "null cannot be cast to non-null type androidx.collection.MutableScatterSet<Scope of androidx.compose.runtime.collection.ScopeMap.removeScopeIf$lambda$2>");
                                L l10 = (L) obj2;
                                Object[] objArr2 = l10.f12131b;
                                long[] jArr6 = l10.f12130a;
                                int length2 = jArr6.length - 2;
                                jArr2 = jArr5;
                                i12 = length;
                                if (length2 >= 0) {
                                    int i19 = 0;
                                    while (true) {
                                        long j12 = jArr6[i19];
                                        i11 = i15;
                                        Object[] objArr3 = objArr2;
                                        if ((((~j12) << c10) & j12 & -9187201950435737472L) != -9187201950435737472L) {
                                            int i20 = 8 - ((~(i19 - length2)) >>> 31);
                                            int i21 = 0;
                                            while (i21 < i20) {
                                                int i22 = i21;
                                                Object[] objArr4 = objArr3;
                                                if ((j12 & 255) < 128) {
                                                    int i23 = (i19 << 3) + i22;
                                                    jArr4 = jArr6;
                                                    if (!this.f10151g.c((I) objArr4[i23])) {
                                                        l10.y(i23);
                                                    }
                                                } else {
                                                    jArr4 = jArr6;
                                                }
                                                j12 >>= 8;
                                                i21 = i22 + 1;
                                                jArr6 = jArr4;
                                                objArr3 = objArr4;
                                            }
                                            objArr = objArr3;
                                            jArr3 = jArr6;
                                            if (i20 != 8) {
                                                break;
                                            }
                                        } else {
                                            objArr = objArr3;
                                            jArr3 = jArr6;
                                        }
                                        if (i19 == length2) {
                                            break;
                                        }
                                        i19++;
                                        jArr6 = jArr3;
                                        objArr2 = objArr;
                                        i15 = i11;
                                        c10 = 7;
                                    }
                                } else {
                                    i11 = i15;
                                }
                                z11 = l10.d();
                            } else {
                                jArr2 = jArr5;
                                i12 = length;
                                i11 = i15;
                                C6496s.f(obj2, "null cannot be cast to non-null type Scope of androidx.compose.runtime.collection.ScopeMap.removeScopeIf$lambda$2");
                                if (!this.f10151g.c((I) obj2)) {
                                    z11 = true;
                                } else {
                                    z11 = false;
                                }
                            }
                            if (z11) {
                                d10.p(i18);
                            }
                            i13 = 8;
                        } else {
                            jArr2 = jArr5;
                            i12 = length;
                            i11 = i15;
                            i13 = i14;
                        }
                        j11 >>= i13;
                        i17++;
                        i14 = i13;
                        jArr5 = jArr2;
                        length = i12;
                        i15 = i11;
                        c10 = 7;
                    }
                    jArr = jArr5;
                    int i24 = length;
                    int i25 = i15;
                    if (i16 != i14) {
                        break;
                    }
                    length = i24;
                    i10 = i25;
                } else {
                    jArr = jArr5;
                    i10 = i15;
                }
                if (i10 == length) {
                    break;
                }
                i15 = i10 + 1;
                jArr5 = jArr;
                c10 = 7;
                j10 = -9187201950435737472L;
                i14 = 8;
            }
        }
        if (this.f10153i.e()) {
            L l11 = this.f10153i;
            Object[] objArr5 = l11.f12131b;
            long[] jArr7 = l11.f12130a;
            int length3 = jArr7.length - 2;
            if (length3 >= 0) {
                int i26 = 0;
                while (true) {
                    long j13 = jArr7[i26];
                    if ((((~j13) << 7) & j13 & -9187201950435737472L) != -9187201950435737472L) {
                        int i27 = 8 - ((~(i26 - length3)) >>> 31);
                        for (int i28 = 0; i28 < i27; i28++) {
                            if ((j13 & 255) < 128) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            if (z10) {
                                int i29 = (i26 << 3) + i28;
                                if (!((L0) objArr5[i29]).t()) {
                                    l11.y(i29);
                                }
                            }
                            j13 >>= 8;
                        }
                        if (i27 != 8) {
                            return;
                        }
                    }
                    if (i26 != length3) {
                        i26++;
                    } else {
                        return;
                    }
                }
            }
        }
    }

    private final void B(p pVar) {
        if (this.f10166v) {
            C0.b("The composition is disposed");
        }
        this.f10167w = pVar;
        this.f10145a.a(this, pVar);
    }

    private final void C() {
        Object andSet = this.f10147c.getAndSet(C1515u.f10179a);
        if (andSet == null) {
            return;
        }
        if (C6496s.c(andSet, C1515u.f10179a)) {
            C1506p.s("pending composition has not been applied");
            throw new C6527k();
        } else if (andSet instanceof Set) {
            y((Set) andSet, true);
        } else if (andSet instanceof Object[]) {
            for (Set y10 : (Set[]) andSet) {
                y(y10, true);
            }
        } else {
            C1506p.s("corrupt pendingModifications drain: " + this.f10147c);
            throw new C6527k();
        }
    }

    private final void D() {
        Object andSet = this.f10147c.getAndSet((Object) null);
        if (C6496s.c(andSet, C1515u.f10179a)) {
            return;
        }
        if (andSet instanceof Set) {
            y((Set) andSet, false);
        } else if (andSet instanceof Object[]) {
            for (Set y10 : (Set[]) andSet) {
                y(y10, false);
            }
        } else if (andSet == null) {
            C1506p.s("calling recordModificationsOf and applyChanges concurrently is not supported");
            throw new C6527k();
        } else {
            C1506p.s("corrupt pendingModifications drain: " + this.f10147c);
            throw new C6527k();
        }
    }

    private final boolean E() {
        return this.f10163s.D0();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00b1, code lost:
        if (r6 == null) goto L_0x00b8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x00b7, code lost:
        return r6.G(r0, r2, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x00b8, code lost:
        r1.f10145a.k(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x00c1, code lost:
        if (p() == false) goto L_0x00c6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:?, code lost:
        return Y.Z.SCHEDULED;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:?, code lost:
        return Y.Z.DEFERRED;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final Y.Z G(Y.L0 r21, Y.C1477d r22, java.lang.Object r23) {
        /*
            r20 = this;
            r1 = r20
            r0 = r21
            r2 = r22
            r3 = r23
            java.lang.Object r4 = r1.f10148d
            monitor-enter(r4)
            Y.t r5 = r1.f10160p     // Catch:{ all -> 0x001e }
            r6 = 0
            if (r5 == 0) goto L_0x0021
            Y.c1 r7 = r1.f10150f     // Catch:{ all -> 0x001e }
            int r8 = r1.f10161q     // Catch:{ all -> 0x001e }
            boolean r7 = r7.N(r8, r2)     // Catch:{ all -> 0x001e }
            if (r7 == 0) goto L_0x001b
            goto L_0x001c
        L_0x001b:
            r5 = r6
        L_0x001c:
            r6 = r5
            goto L_0x0021
        L_0x001e:
            r0 = move-exception
            goto L_0x00c9
        L_0x0021:
            if (r6 != 0) goto L_0x00b0
            boolean r5 = r1.M(r0, r3)     // Catch:{ all -> 0x001e }
            if (r5 == 0) goto L_0x002d
            Y.Z r0 = Y.Z.IMMINENT     // Catch:{ all -> 0x001e }
            monitor-exit(r4)
            return r0
        L_0x002d:
            r20.I()     // Catch:{ all -> 0x001e }
            if (r3 != 0) goto L_0x003b
            a0.f r5 = r1.f10158n     // Catch:{ all -> 0x001e }
            Y.X0 r7 = Y.X0.f9911a     // Catch:{ all -> 0x001e }
            r5.h(r0, r7)     // Catch:{ all -> 0x001e }
            goto L_0x00b0
        L_0x003b:
            boolean r5 = r3 instanceof Y.I     // Catch:{ all -> 0x001e }
            if (r5 != 0) goto L_0x0048
            a0.f r5 = r1.f10158n     // Catch:{ all -> 0x001e }
            Y.X0 r7 = Y.X0.f9911a     // Catch:{ all -> 0x001e }
            r5.h(r0, r7)     // Catch:{ all -> 0x001e }
            goto L_0x00b0
        L_0x0048:
            a0.f r5 = r1.f10158n     // Catch:{ all -> 0x001e }
            androidx.collection.K r5 = r5.d()     // Catch:{ all -> 0x001e }
            java.lang.Object r5 = r5.b(r0)     // Catch:{ all -> 0x001e }
            if (r5 == 0) goto L_0x00ab
            boolean r7 = r5 instanceof androidx.collection.L     // Catch:{ all -> 0x001e }
            if (r7 == 0) goto L_0x00a6
            androidx.collection.L r5 = (androidx.collection.L) r5     // Catch:{ all -> 0x001e }
            java.lang.Object[] r7 = r5.f12131b     // Catch:{ all -> 0x001e }
            long[] r5 = r5.f12130a     // Catch:{ all -> 0x001e }
            int r8 = r5.length     // Catch:{ all -> 0x001e }
            int r8 = r8 + -2
            if (r8 < 0) goto L_0x00ab
            r10 = 0
        L_0x0064:
            r11 = r5[r10]     // Catch:{ all -> 0x001e }
            long r13 = ~r11     // Catch:{ all -> 0x001e }
            r15 = 7
            long r13 = r13 << r15
            long r13 = r13 & r11
            r15 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r13 = r13 & r15
            int r13 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r13 == 0) goto L_0x00a1
            int r13 = r10 - r8
            int r13 = ~r13     // Catch:{ all -> 0x001e }
            int r13 = r13 >>> 31
            r14 = 8
            int r13 = 8 - r13
            r15 = 0
        L_0x007e:
            if (r15 >= r13) goto L_0x009e
            r16 = 255(0xff, double:1.26E-321)
            long r16 = r11 & r16
            r18 = 128(0x80, double:6.32E-322)
            int r16 = (r16 > r18 ? 1 : (r16 == r18 ? 0 : -1))
            if (r16 >= 0) goto L_0x0098
            int r16 = r10 << 3
            int r16 = r16 + r15
            r9 = r7[r16]     // Catch:{ all -> 0x001e }
            Y.X0 r14 = Y.X0.f9911a     // Catch:{ all -> 0x001e }
            if (r9 != r14) goto L_0x0095
            goto L_0x00b0
        L_0x0095:
            r9 = 8
            goto L_0x0099
        L_0x0098:
            r9 = r14
        L_0x0099:
            long r11 = r11 >> r9
            int r15 = r15 + 1
            r14 = r9
            goto L_0x007e
        L_0x009e:
            r9 = r14
            if (r13 != r9) goto L_0x00ab
        L_0x00a1:
            if (r10 == r8) goto L_0x00ab
            int r10 = r10 + 1
            goto L_0x0064
        L_0x00a6:
            Y.X0 r7 = Y.X0.f9911a     // Catch:{ all -> 0x001e }
            if (r5 != r7) goto L_0x00ab
            goto L_0x00b0
        L_0x00ab:
            a0.f r5 = r1.f10158n     // Catch:{ all -> 0x001e }
            r5.a(r0, r3)     // Catch:{ all -> 0x001e }
        L_0x00b0:
            monitor-exit(r4)
            if (r6 == 0) goto L_0x00b8
            Y.Z r0 = r6.G(r0, r2, r3)
            return r0
        L_0x00b8:
            Y.r r0 = r1.f10145a
            r0.k(r1)
            boolean r0 = r20.p()
            if (r0 == 0) goto L_0x00c6
            Y.Z r0 = Y.Z.DEFERRED
            goto L_0x00c8
        L_0x00c6:
            Y.Z r0 = Y.Z.SCHEDULED
        L_0x00c8:
            return r0
        L_0x00c9:
            monitor-exit(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.C1513t.G(Y.L0, Y.d, java.lang.Object):Y.Z");
    }

    private final void H(Object obj) {
        Object b10 = this.f10151g.d().b(obj);
        if (b10 == null) {
            return;
        }
        if (b10 instanceof L) {
            L l10 = (L) b10;
            Object[] objArr = l10.f12131b;
            long[] jArr = l10.f12130a;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i10 = 0;
                while (true) {
                    long j10 = jArr[i10];
                    if ((((~j10) << 7) & j10 & -9187201950435737472L) != -9187201950435737472L) {
                        int i11 = 8 - ((~(i10 - length)) >>> 31);
                        for (int i12 = 0; i12 < i11; i12++) {
                            if ((255 & j10) < 128) {
                                L0 l02 = (L0) objArr[(i10 << 3) + i12];
                                if (l02.s(obj) == Z.IMMINENT) {
                                    this.f10157m.a(obj, l02);
                                }
                            }
                            j10 >>= 8;
                        }
                        if (i11 != 8) {
                            return;
                        }
                    }
                    if (i10 != length) {
                        i10++;
                    } else {
                        return;
                    }
                }
            }
        } else {
            L0 l03 = (L0) b10;
            if (l03.s(obj) == Z.IMMINENT) {
                this.f10157m.a(obj, l03);
            }
        }
    }

    private final C2118c I() {
        A a10 = this.f10162r;
        if (a10.b()) {
            a10.a();
        } else {
            A i10 = this.f10145a.i();
            if (i10 != null) {
                i10.a();
            }
            a10.a();
            if (!C6496s.c((Object) null, (Object) null)) {
                a10.c((C2118c) null);
            }
        }
        return null;
    }

    private final f L() {
        f fVar = this.f10158n;
        this.f10158n = new f();
        return fVar;
    }

    private final boolean M(L0 l02, Object obj) {
        if (!p() || !this.f10163s.r1(l02, obj)) {
            return false;
        }
        return true;
    }

    private final void x(Object obj, boolean z10) {
        Object obj2 = obj;
        Object b10 = this.f10151g.d().b(obj2);
        if (b10 == null) {
            return;
        }
        if (b10 instanceof L) {
            L l10 = (L) b10;
            Object[] objArr = l10.f12131b;
            long[] jArr = l10.f12130a;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i10 = 0;
                while (true) {
                    long j10 = jArr[i10];
                    if ((((~j10) << 7) & j10 & -9187201950435737472L) != -9187201950435737472L) {
                        int i11 = 8 - ((~(i10 - length)) >>> 31);
                        for (int i12 = 0; i12 < i11; i12++) {
                            if ((255 & j10) < 128) {
                                L0 l02 = (L0) objArr[(i10 << 3) + i12];
                                if (!this.f10157m.f(obj2, l02) && l02.s(obj2) != Z.IGNORED) {
                                    if (!l02.t() || z10) {
                                        this.f10152h.h(l02);
                                    } else {
                                        this.f10153i.h(l02);
                                    }
                                }
                            }
                            j10 >>= 8;
                        }
                        if (i11 != 8) {
                            return;
                        }
                    }
                    if (i10 != length) {
                        i10++;
                    } else {
                        return;
                    }
                }
            }
        } else {
            L0 l03 = (L0) b10;
            if (!this.f10157m.f(obj2, l03) && l03.s(obj2) != Z.IGNORED) {
                if (!l03.t() || z10) {
                    this.f10152h.h(l03);
                } else {
                    this.f10153i.h(l03);
                }
            }
        }
    }

    private final void y(Set set, boolean z10) {
        String str;
        long[] jArr;
        int i10;
        boolean z11;
        long[] jArr2;
        int i11;
        int i12;
        String str2;
        int i13;
        boolean z12;
        Object[] objArr;
        long[] jArr3;
        boolean z13;
        Object[] objArr2;
        long[] jArr4;
        String str3;
        long[] jArr5;
        int i14;
        String str4;
        long[] jArr6;
        int i15;
        int i16;
        int i17;
        int i18;
        boolean z14;
        Object[] objArr3;
        long[] jArr7;
        Object[] objArr4;
        long[] jArr8;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        Set set2 = set;
        boolean z15 = z10;
        char c10 = 7;
        long j10 = -9187201950435737472L;
        int i25 = 8;
        if (set2 instanceof d) {
            W a10 = ((d) set2).a();
            Object[] objArr5 = a10.f12131b;
            long[] jArr9 = a10.f12130a;
            int length = jArr9.length - 2;
            if (length >= 0) {
                int i26 = 0;
                while (true) {
                    long j11 = jArr9[i26];
                    if ((((~j11) << c10) & j11 & j10) != j10) {
                        int i27 = 8 - ((~(i26 - length)) >>> 31);
                        int i28 = 0;
                        while (i28 < i27) {
                            if ((j11 & 255) < 128) {
                                Object obj = objArr5[(i26 << 3) + i28];
                                if (obj instanceof L0) {
                                    ((L0) obj).s((Object) null);
                                } else {
                                    x(obj, z15);
                                    Object b10 = this.f10154j.d().b(obj);
                                    if (b10 != null) {
                                        if (b10 instanceof L) {
                                            L l10 = (L) b10;
                                            Object[] objArr6 = l10.f12131b;
                                            long[] jArr10 = l10.f12130a;
                                            int length2 = jArr10.length - 2;
                                            if (length2 >= 0) {
                                                i20 = length;
                                                i23 = i26;
                                                int i29 = 0;
                                                while (true) {
                                                    long j12 = jArr10[i29];
                                                    i22 = i27;
                                                    i21 = i28;
                                                    if ((((~j12) << c10) & j12 & -9187201950435737472L) != -9187201950435737472L) {
                                                        int i30 = 8 - ((~(i29 - length2)) >>> 31);
                                                        for (int i31 = 0; i31 < i30; i31++) {
                                                            if ((j12 & 255) < 128) {
                                                                x((I) objArr6[(i29 << 3) + i31], z15);
                                                            }
                                                            j12 >>= 8;
                                                        }
                                                        if (i30 != 8) {
                                                            break;
                                                        }
                                                    }
                                                    if (i29 == length2) {
                                                        break;
                                                    }
                                                    i29++;
                                                    i27 = i22;
                                                    i28 = i21;
                                                    c10 = 7;
                                                }
                                            }
                                        } else {
                                            i22 = i27;
                                            i21 = i28;
                                            i20 = length;
                                            i23 = i26;
                                            x((I) b10, z15);
                                        }
                                        i24 = 8;
                                    }
                                }
                                i22 = i27;
                                i21 = i28;
                                i20 = length;
                                i23 = i26;
                                i24 = 8;
                            } else {
                                i22 = i27;
                                i21 = i28;
                                i20 = length;
                                i23 = i26;
                                i24 = i25;
                            }
                            j11 >>= i24;
                            i28 = i21 + 1;
                            length = i20;
                            i25 = i24;
                            i26 = i23;
                            i27 = i22;
                            c10 = 7;
                        }
                        int i32 = length;
                        i19 = i26;
                        if (i27 != i25) {
                            break;
                        }
                        length = i32;
                    } else {
                        i19 = i26;
                    }
                    if (i19 == length) {
                        break;
                    }
                    i26 = i19 + 1;
                    c10 = 7;
                    j10 = -9187201950435737472L;
                    i25 = 8;
                }
            }
        } else {
            for (Object next : set2) {
                if (next instanceof L0) {
                    ((L0) next).s((Object) null);
                } else {
                    x(next, z15);
                    Object b11 = this.f10154j.d().b(next);
                    if (b11 != null) {
                        if (b11 instanceof L) {
                            L l11 = (L) b11;
                            Object[] objArr7 = l11.f12131b;
                            long[] jArr11 = l11.f12130a;
                            int length3 = jArr11.length - 2;
                            if (length3 >= 0) {
                                int i33 = 0;
                                while (true) {
                                    long j13 = jArr11[i33];
                                    if ((((~j13) << 7) & j13 & -9187201950435737472L) != -9187201950435737472L) {
                                        int i34 = 8 - ((~(i33 - length3)) >>> 31);
                                        for (int i35 = 0; i35 < i34; i35++) {
                                            if ((j13 & 255) < 128) {
                                                x((I) objArr7[(i33 << 3) + i35], z15);
                                            }
                                            j13 >>= 8;
                                        }
                                        if (i34 != 8) {
                                            break;
                                        }
                                    }
                                    if (i33 == length3) {
                                        break;
                                    }
                                    i33++;
                                }
                            }
                        } else {
                            x((I) b11, z15);
                        }
                    }
                }
            }
        }
        L l12 = this.f10153i;
        L l13 = this.f10152h;
        String str5 = "null cannot be cast to non-null type androidx.collection.MutableScatterSet<Scope of androidx.compose.runtime.collection.ScopeMap.removeScopeIf$lambda$2>";
        if (!z15 || !l12.e()) {
            String str6 = str5;
            if (l13.e()) {
                K d10 = this.f10151g.d();
                long[] jArr12 = d10.f12123a;
                int length4 = jArr12.length - 2;
                if (length4 >= 0) {
                    int i36 = 0;
                    while (true) {
                        long j14 = jArr12[i36];
                        if ((((~j14) << 7) & j14 & -9187201950435737472L) != -9187201950435737472L) {
                            int i37 = 8 - ((~(i36 - length4)) >>> 31);
                            int i38 = 0;
                            while (i38 < i37) {
                                if ((j14 & 255) < 128) {
                                    z11 = true;
                                } else {
                                    z11 = false;
                                }
                                if (z11) {
                                    int i39 = (i36 << 3) + i38;
                                    Object obj2 = d10.f12124b[i39];
                                    Object obj3 = d10.f12125c[i39];
                                    if (obj3 instanceof L) {
                                        String str7 = str6;
                                        C6496s.f(obj3, str7);
                                        L l14 = (L) obj3;
                                        Object[] objArr8 = l14.f12131b;
                                        long[] jArr13 = l14.f12130a;
                                        int length5 = jArr13.length - 2;
                                        jArr2 = jArr12;
                                        i11 = length4;
                                        i13 = i36;
                                        if (length5 >= 0) {
                                            int i40 = 0;
                                            while (true) {
                                                long j15 = jArr13[i40];
                                                str2 = str7;
                                                i12 = i37;
                                                if ((((~j15) << 7) & j15 & -9187201950435737472L) != -9187201950435737472L) {
                                                    int i41 = 8 - ((~(i40 - length5)) >>> 31);
                                                    int i42 = 0;
                                                    while (i42 < i41) {
                                                        if ((j15 & 255) < 128) {
                                                            z13 = true;
                                                        } else {
                                                            z13 = false;
                                                        }
                                                        if (z13) {
                                                            jArr4 = jArr13;
                                                            int i43 = (i40 << 3) + i42;
                                                            objArr2 = objArr8;
                                                            if (l13.a((L0) objArr8[i43])) {
                                                                l14.y(i43);
                                                            }
                                                        } else {
                                                            objArr2 = objArr8;
                                                            jArr4 = jArr13;
                                                        }
                                                        j15 >>= 8;
                                                        i42++;
                                                        jArr13 = jArr4;
                                                        objArr8 = objArr2;
                                                    }
                                                    objArr = objArr8;
                                                    jArr3 = jArr13;
                                                    if (i41 != 8) {
                                                        break;
                                                    }
                                                } else {
                                                    objArr = objArr8;
                                                    jArr3 = jArr13;
                                                }
                                                if (i40 == length5) {
                                                    break;
                                                }
                                                i40++;
                                                i37 = i12;
                                                str7 = str2;
                                                jArr13 = jArr3;
                                                objArr8 = objArr;
                                            }
                                        } else {
                                            str2 = str7;
                                            i12 = i37;
                                        }
                                        z12 = l14.d();
                                    } else {
                                        jArr2 = jArr12;
                                        i11 = length4;
                                        i12 = i37;
                                        str2 = str6;
                                        i13 = i36;
                                        C6496s.f(obj3, "null cannot be cast to non-null type Scope of androidx.compose.runtime.collection.ScopeMap.removeScopeIf$lambda$2");
                                        z12 = l13.a((L0) obj3);
                                    }
                                    if (z12) {
                                        d10.p(i39);
                                    }
                                } else {
                                    jArr2 = jArr12;
                                    i11 = length4;
                                    i12 = i37;
                                    str2 = str6;
                                    i13 = i36;
                                }
                                j14 >>= 8;
                                i38++;
                                length4 = i11;
                                jArr12 = jArr2;
                                i36 = i13;
                                i37 = i12;
                                str6 = str2;
                            }
                            jArr = jArr12;
                            int i44 = length4;
                            str = str6;
                            int i45 = i36;
                            if (i37 != 8) {
                                break;
                            }
                            length4 = i44;
                            i10 = i45;
                        } else {
                            jArr = jArr12;
                            str = str6;
                            i10 = i36;
                        }
                        if (i10 == length4) {
                            break;
                        }
                        i36 = i10 + 1;
                        jArr12 = jArr;
                        str6 = str;
                    }
                }
                A();
                l13.m();
                return;
            }
            return;
        }
        K d11 = this.f10151g.d();
        long[] jArr14 = d11.f12123a;
        int length6 = jArr14.length - 2;
        if (length6 >= 0) {
            int i46 = 0;
            while (true) {
                long j16 = jArr14[i46];
                if ((((~j16) << 7) & j16 & -9187201950435737472L) != -9187201950435737472L) {
                    int i47 = 8 - ((~(i46 - length6)) >>> 31);
                    int i48 = 0;
                    while (i48 < i47) {
                        if ((j16 & 255) < 128) {
                            int i49 = (i46 << 3) + i48;
                            Object obj4 = d11.f12124b[i49];
                            Object obj5 = d11.f12125c[i49];
                            if (obj5 instanceof L) {
                                C6496s.f(obj5, str5);
                                L l15 = (L) obj5;
                                Object[] objArr9 = l15.f12131b;
                                jArr6 = jArr14;
                                long[] jArr15 = l15.f12130a;
                                str4 = str5;
                                int length7 = jArr15.length - 2;
                                i15 = length6;
                                i16 = i46;
                                if (length7 >= 0) {
                                    int i50 = 0;
                                    while (true) {
                                        long j17 = jArr15[i50];
                                        i17 = i47;
                                        i18 = i48;
                                        if ((((~j17) << 7) & j17 & -9187201950435737472L) != -9187201950435737472L) {
                                            int i51 = 8 - ((~(i50 - length7)) >>> 31);
                                            int i52 = 0;
                                            while (i52 < i51) {
                                                if ((j17 & 255) < 128) {
                                                    jArr8 = jArr15;
                                                    int i53 = (i50 << 3) + i52;
                                                    objArr4 = objArr9;
                                                    L0 l02 = (L0) objArr9[i53];
                                                    if (l12.a(l02) || l13.a(l02)) {
                                                        l15.y(i53);
                                                    }
                                                } else {
                                                    objArr4 = objArr9;
                                                    jArr8 = jArr15;
                                                }
                                                j17 >>= 8;
                                                i52++;
                                                jArr15 = jArr8;
                                                objArr9 = objArr4;
                                            }
                                            objArr3 = objArr9;
                                            jArr7 = jArr15;
                                            if (i51 != 8) {
                                                break;
                                            }
                                        } else {
                                            objArr3 = objArr9;
                                            jArr7 = jArr15;
                                        }
                                        if (i50 == length7) {
                                            break;
                                        }
                                        i50++;
                                        i47 = i17;
                                        i48 = i18;
                                        jArr15 = jArr7;
                                        objArr9 = objArr3;
                                    }
                                } else {
                                    i17 = i47;
                                    i18 = i48;
                                }
                                z14 = l15.d();
                            } else {
                                str4 = str5;
                                jArr6 = jArr14;
                                i15 = length6;
                                i16 = i46;
                                i17 = i47;
                                i18 = i48;
                                C6496s.f(obj5, "null cannot be cast to non-null type Scope of androidx.compose.runtime.collection.ScopeMap.removeScopeIf$lambda$2");
                                L0 l03 = (L0) obj5;
                                if (l12.a(l03) || l13.a(l03)) {
                                    z14 = true;
                                } else {
                                    z14 = false;
                                }
                            }
                            if (z14) {
                                d11.p(i49);
                            }
                        } else {
                            str4 = str5;
                            jArr6 = jArr14;
                            i15 = length6;
                            i16 = i46;
                            i17 = i47;
                            i18 = i48;
                        }
                        j16 >>= 8;
                        i48 = i18 + 1;
                        length6 = i15;
                        jArr14 = jArr6;
                        str5 = str4;
                        i46 = i16;
                        i47 = i17;
                    }
                    str3 = str5;
                    jArr5 = jArr14;
                    int i54 = length6;
                    int i55 = i46;
                    if (i47 != 8) {
                        break;
                    }
                    length6 = i54;
                    i14 = i55;
                } else {
                    str3 = str5;
                    jArr5 = jArr14;
                    i14 = i46;
                }
                if (i14 == length6) {
                    break;
                }
                i46 = i14 + 1;
                jArr14 = jArr5;
                str5 = str3;
            }
        }
        l12.m();
        A();
    }

    /* JADX WARNING: Removed duplicated region for block: B:110:0x01e3  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void z(Z.a r31) {
        /*
            r30 = this;
            r1 = r30
            r0 = 1
            Y.t$a r2 = new Y.t$a
            java.util.Set r3 = r1.f10149e
            r2.<init>(r3)
            boolean r3 = r31.c()     // Catch:{ all -> 0x01c3 }
            if (r3 == 0) goto L_0x001c
            Z.a r0 = r1.f10156l
            boolean r0 = r0.c()
            if (r0 == 0) goto L_0x001b
            r2.f()
        L_0x001b:
            return
        L_0x001c:
            java.lang.String r3 = "Compose:applyChanges"
            Y.E1 r4 = Y.E1.f9759a     // Catch:{ all -> 0x01c3 }
            java.lang.Object r3 = r4.a(r3)     // Catch:{ all -> 0x01c3 }
            Y.f r5 = r1.f10146b     // Catch:{ all -> 0x01c7 }
            r5.h()     // Catch:{ all -> 0x01c7 }
            Y.c1 r5 = r1.f10150f     // Catch:{ all -> 0x01c7 }
            Y.f1 r5 = r5.Q()     // Catch:{ all -> 0x01c7 }
            r6 = 0
            Y.f r7 = r1.f10146b     // Catch:{ all -> 0x01cb }
            r8 = r31
            r8.b(r7, r5, r2)     // Catch:{ all -> 0x01cb }
            lf.M r7 = lf.C6514M.f71813a     // Catch:{ all -> 0x01cb }
            r5.L(r0)     // Catch:{ all -> 0x01c7 }
            Y.f r5 = r1.f10146b     // Catch:{ all -> 0x01c7 }
            r5.e()     // Catch:{ all -> 0x01c7 }
            r4.b(r3)     // Catch:{ all -> 0x01c3 }
            r2.g()     // Catch:{ all -> 0x01c3 }
            r2.h()     // Catch:{ all -> 0x01c3 }
            boolean r3 = r1.f10159o     // Catch:{ all -> 0x01c3 }
            if (r3 == 0) goto L_0x01b4
            java.lang.String r3 = "Compose:unobserve"
            java.lang.Object r3 = r4.a(r3)     // Catch:{ all -> 0x01b0 }
            r1.f10159o = r6     // Catch:{ all -> 0x0124 }
            a0.f r4 = r1.f10151g     // Catch:{ all -> 0x0124 }
            androidx.collection.K r4 = r4.d()     // Catch:{ all -> 0x0124 }
            long[] r5 = r4.f12123a     // Catch:{ all -> 0x0124 }
            int r7 = r5.length     // Catch:{ all -> 0x0124 }
            int r7 = r7 + -2
            if (r7 < 0) goto L_0x0197
            r8 = r6
        L_0x0064:
            r9 = r5[r8]     // Catch:{ all -> 0x0124 }
            long r11 = ~r9     // Catch:{ all -> 0x0124 }
            r13 = 7
            long r11 = r11 << r13
            long r11 = r11 & r9
            r14 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r11 = r11 & r14
            int r11 = (r11 > r14 ? 1 : (r11 == r14 ? 0 : -1))
            if (r11 == 0) goto L_0x0183
            int r11 = r8 - r7
            int r11 = ~r11     // Catch:{ all -> 0x0124 }
            int r11 = r11 >>> 31
            r12 = 8
            int r11 = 8 - r11
        L_0x007d:
            if (r6 >= r11) goto L_0x0172
            r16 = 255(0xff, double:1.26E-321)
            long r18 = r9 & r16
            r20 = 128(0x80, double:6.32E-322)
            int r18 = (r18 > r20 ? 1 : (r18 == r20 ? 0 : -1))
            if (r18 >= 0) goto L_0x0150
            int r18 = r8 << 3
            int r0 = r18 + r6
            java.lang.Object[] r12 = r4.f12124b     // Catch:{ all -> 0x0124 }
            r12 = r12[r0]     // Catch:{ all -> 0x0124 }
            java.lang.Object[] r12 = r4.f12125c     // Catch:{ all -> 0x0124 }
            r12 = r12[r0]     // Catch:{ all -> 0x0124 }
            boolean r14 = r12 instanceof androidx.collection.L     // Catch:{ all -> 0x0124 }
            if (r14 == 0) goto L_0x0129
            java.lang.String r14 = "null cannot be cast to non-null type androidx.collection.MutableScatterSet<Scope of androidx.compose.runtime.collection.ScopeMap.removeScopeIf$lambda$2>"
            kotlin.jvm.internal.C6496s.f(r12, r14)     // Catch:{ all -> 0x0124 }
            androidx.collection.L r12 = (androidx.collection.L) r12     // Catch:{ all -> 0x0124 }
            java.lang.Object[] r14 = r12.f12131b     // Catch:{ all -> 0x0124 }
            long[] r15 = r12.f12130a     // Catch:{ all -> 0x0124 }
            int r13 = r15.length     // Catch:{ all -> 0x0124 }
            int r13 = r13 + -2
            r25 = r2
            r24 = r5
            if (r13 < 0) goto L_0x0114
            r5 = 0
        L_0x00ae:
            r1 = r15[r5]     // Catch:{ all -> 0x00eb }
            r26 = r7
            r27 = r8
            long r7 = ~r1     // Catch:{ all -> 0x00eb }
            r18 = 7
            long r7 = r7 << r18
            long r7 = r7 & r1
            r22 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r7 = r7 & r22
            int r7 = (r7 > r22 ? 1 : (r7 == r22 ? 0 : -1))
            if (r7 == 0) goto L_0x0105
            int r7 = r5 - r13
            int r7 = ~r7     // Catch:{ all -> 0x00eb }
            int r7 = r7 >>> 31
            r8 = 8
            int r7 = 8 - r7
            r8 = 0
        L_0x00cf:
            if (r8 >= r7) goto L_0x00fc
            long r28 = r1 & r16
            int r28 = (r28 > r20 ? 1 : (r28 == r20 ? 0 : -1))
            if (r28 >= 0) goto L_0x00f1
            int r28 = r5 << 3
            r29 = r15
            int r15 = r28 + r8
            r28 = r14[r15]     // Catch:{ all -> 0x00eb }
            Y.L0 r28 = (Y.L0) r28     // Catch:{ all -> 0x00eb }
            boolean r28 = r28.r()     // Catch:{ all -> 0x00eb }
            if (r28 != 0) goto L_0x00ee
            r12.y(r15)     // Catch:{ all -> 0x00eb }
            goto L_0x00ee
        L_0x00eb:
            r0 = move-exception
            goto L_0x01aa
        L_0x00ee:
            r15 = 8
            goto L_0x00f4
        L_0x00f1:
            r29 = r15
            goto L_0x00ee
        L_0x00f4:
            long r1 = r1 >> r15
            r19 = 1
            int r8 = r8 + 1
            r15 = r29
            goto L_0x00cf
        L_0x00fc:
            r29 = r15
            r15 = 8
            r19 = 1
            if (r7 != r15) goto L_0x011f
            goto L_0x0109
        L_0x0105:
            r29 = r15
            r19 = 1
        L_0x0109:
            if (r5 == r13) goto L_0x011f
            int r5 = r5 + 1
            r7 = r26
            r8 = r27
            r15 = r29
            goto L_0x00ae
        L_0x0114:
            r26 = r7
            r27 = r8
            r18 = 7
            r22 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
        L_0x011f:
            boolean r1 = r12.d()     // Catch:{ all -> 0x00eb }
            goto L_0x0148
        L_0x0124:
            r0 = move-exception
            r25 = r2
            goto L_0x01aa
        L_0x0129:
            r25 = r2
            r24 = r5
            r26 = r7
            r27 = r8
            r18 = r13
            r22 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            java.lang.String r1 = "null cannot be cast to non-null type Scope of androidx.compose.runtime.collection.ScopeMap.removeScopeIf$lambda$2"
            kotlin.jvm.internal.C6496s.f(r12, r1)     // Catch:{ all -> 0x00eb }
            Y.L0 r12 = (Y.L0) r12     // Catch:{ all -> 0x00eb }
            boolean r1 = r12.r()     // Catch:{ all -> 0x00eb }
            if (r1 != 0) goto L_0x0147
            r1 = 1
            goto L_0x0148
        L_0x0147:
            r1 = 0
        L_0x0148:
            if (r1 == 0) goto L_0x014d
            r4.p(r0)     // Catch:{ all -> 0x00eb }
        L_0x014d:
            r0 = 8
            goto L_0x015d
        L_0x0150:
            r25 = r2
            r24 = r5
            r26 = r7
            r27 = r8
            r18 = r13
            r22 = r14
            r0 = r12
        L_0x015d:
            long r9 = r9 >> r0
            r1 = 1
            int r6 = r6 + r1
            r12 = r0
            r0 = r1
            r13 = r18
            r14 = r22
            r5 = r24
            r2 = r25
            r7 = r26
            r8 = r27
            r1 = r30
            goto L_0x007d
        L_0x0172:
            r1 = r0
            r25 = r2
            r24 = r5
            r26 = r7
            r27 = r8
            r0 = r12
            if (r11 != r0) goto L_0x0199
            r7 = r26
            r6 = r27
            goto L_0x0189
        L_0x0183:
            r1 = r0
            r25 = r2
            r24 = r5
            r6 = r8
        L_0x0189:
            if (r6 == r7) goto L_0x0199
            int r8 = r6 + 1
            r0 = r1
            r5 = r24
            r2 = r25
            r6 = 0
            r1 = r30
            goto L_0x0064
        L_0x0197:
            r25 = r2
        L_0x0199:
            r30.A()     // Catch:{ all -> 0x00eb }
            lf.M r0 = lf.C6514M.f71813a     // Catch:{ all -> 0x00eb }
            Y.E1 r0 = Y.E1.f9759a     // Catch:{ all -> 0x01a6 }
            r0.b(r3)     // Catch:{ all -> 0x01a6 }
        L_0x01a3:
            r1 = r30
            goto L_0x01b7
        L_0x01a6:
            r0 = move-exception
        L_0x01a7:
            r1 = r30
            goto L_0x01db
        L_0x01aa:
            Y.E1 r1 = Y.E1.f9759a     // Catch:{ all -> 0x01a6 }
            r1.b(r3)     // Catch:{ all -> 0x01a6 }
            throw r0     // Catch:{ all -> 0x01a6 }
        L_0x01b0:
            r0 = move-exception
            r25 = r2
            goto L_0x01a7
        L_0x01b4:
            r25 = r2
            goto L_0x01a3
        L_0x01b7:
            Z.a r0 = r1.f10156l
            boolean r0 = r0.c()
            if (r0 == 0) goto L_0x01c2
            r25.f()
        L_0x01c2:
            return
        L_0x01c3:
            r0 = move-exception
            r25 = r2
            goto L_0x01db
        L_0x01c7:
            r0 = move-exception
            r25 = r2
            goto L_0x01d4
        L_0x01cb:
            r0 = move-exception
            r25 = r2
            r2 = 0
            r5.L(r2)     // Catch:{ all -> 0x01d3 }
            throw r0     // Catch:{ all -> 0x01d3 }
        L_0x01d3:
            r0 = move-exception
        L_0x01d4:
            Y.E1 r2 = Y.E1.f9759a     // Catch:{ all -> 0x01da }
            r2.b(r3)     // Catch:{ all -> 0x01da }
            throw r0     // Catch:{ all -> 0x01da }
        L_0x01da:
            r0 = move-exception
        L_0x01db:
            Z.a r2 = r1.f10156l
            boolean r2 = r2.c()
            if (r2 == 0) goto L_0x01e6
            r25.f()
        L_0x01e6:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.C1513t.z(Z.a):void");
    }

    public final A F() {
        return this.f10162r;
    }

    public final void J(I i10) {
        if (!this.f10151g.c(i10)) {
            this.f10154j.g(i10);
        }
    }

    public final void K(Object obj, L0 l02) {
        this.f10151g.f(obj, l02);
    }

    public void a(Object obj) {
        L0 F02;
        long[] jArr;
        long[] jArr2;
        int i10;
        Object obj2 = obj;
        if (!E() && (F02 = this.f10163s.F0()) != null) {
            F02.H(true);
            if (!F02.w(obj2)) {
                if (obj2 instanceof y) {
                    ((y) obj2).s(C2053g.a(1));
                }
                this.f10151g.a(obj2, F02);
                if (obj2 instanceof I) {
                    I i11 = (I) obj2;
                    I.a p10 = i11.p();
                    this.f10154j.g(obj2);
                    N b10 = p10.b();
                    Object[] objArr = b10.f12107b;
                    long[] jArr3 = b10.f12106a;
                    int length = jArr3.length - 2;
                    if (length >= 0) {
                        int i12 = 0;
                        while (true) {
                            long j10 = jArr3[i12];
                            if ((((~j10) << 7) & j10 & -9187201950435737472L) != -9187201950435737472L) {
                                int i13 = 8;
                                int i14 = 8 - ((~(i12 - length)) >>> 31);
                                int i15 = 0;
                                while (i15 < i14) {
                                    if ((j10 & 255) < 128) {
                                        x xVar = (x) objArr[(i12 << 3) + i15];
                                        if (xVar instanceof y) {
                                            jArr2 = jArr3;
                                            ((y) xVar).s(C2053g.a(1));
                                        } else {
                                            jArr2 = jArr3;
                                        }
                                        this.f10154j.a(xVar, obj2);
                                        i10 = 8;
                                    } else {
                                        jArr2 = jArr3;
                                        i10 = i13;
                                    }
                                    j10 >>= i10;
                                    i15++;
                                    i13 = i10;
                                    jArr3 = jArr2;
                                }
                                jArr = jArr3;
                                if (i14 != i13) {
                                    break;
                                }
                            } else {
                                jArr = jArr3;
                            }
                            if (i12 == length) {
                                break;
                            }
                            i12++;
                            jArr3 = jArr;
                        }
                    }
                    F02.v(i11, p10.a());
                }
            }
        }
    }

    public void b() {
        synchronized (this.f10148d) {
            try {
                if (this.f10156l.d()) {
                    z(this.f10156l);
                }
                C6514M m10 = C6514M.f71813a;
            } catch (Exception e10) {
                try {
                    s();
                    throw e10;
                } catch (Throwable th2) {
                    throw th2;
                }
            } catch (Throwable th3) {
                if (!this.f10149e.isEmpty()) {
                    new a(this.f10149e).f();
                }
                throw th3;
            }
        }
    }

    public boolean c() {
        return this.f10166v;
    }

    public void d(p pVar) {
        B(pVar);
    }

    public void deactivate() {
        boolean z10;
        Object a10;
        C1485f1 Q10;
        synchronized (this.f10148d) {
            try {
                if (this.f10150f.A() > 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (!z10) {
                    if (!this.f10149e.isEmpty()) {
                    }
                    this.f10151g.b();
                    this.f10154j.b();
                    this.f10158n.b();
                    this.f10155k.a();
                    this.f10156l.a();
                    this.f10163s.q0();
                    C6514M m10 = C6514M.f71813a;
                }
                E1 e12 = E1.f9759a;
                a10 = e12.a("Compose:deactivate");
                a aVar = new a(this.f10149e);
                if (z10) {
                    this.f10146b.h();
                    Q10 = this.f10150f.Q();
                    C1506p.t(Q10, aVar);
                    C6514M m11 = C6514M.f71813a;
                    Q10.L(true);
                    this.f10146b.e();
                    aVar.g();
                }
                aVar.f();
                C6514M m12 = C6514M.f71813a;
                e12.b(a10);
                this.f10151g.b();
                this.f10154j.b();
                this.f10158n.b();
                this.f10155k.a();
                this.f10156l.a();
                this.f10163s.q0();
                C6514M m102 = C6514M.f71813a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void dispose() {
        boolean z10;
        C1485f1 Q10;
        synchronized (this.f10148d) {
            try {
                if (this.f10163s.O0()) {
                    C0.b("Composition is disposed while composing. If dispose is triggered by a call in @Composable function, consider wrapping it with SideEffect block.");
                }
                if (!this.f10166v) {
                    this.f10166v = true;
                    this.f10167w = C1492i.f10015a.b();
                    Z.a G02 = this.f10163s.G0();
                    if (G02 != null) {
                        z(G02);
                    }
                    if (this.f10150f.A() > 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (z10 || !this.f10149e.isEmpty()) {
                        a aVar = new a(this.f10149e);
                        if (z10) {
                            this.f10146b.h();
                            Q10 = this.f10150f.Q();
                            C1506p.K(Q10, aVar);
                            C6514M m10 = C6514M.f71813a;
                            Q10.L(true);
                            this.f10146b.clear();
                            this.f10146b.e();
                            aVar.g();
                        }
                        aVar.f();
                    }
                    this.f10163s.r0();
                }
                C6514M m11 = C6514M.f71813a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        this.f10145a.r(this);
    }

    public void e(List list) {
        boolean z10 = true;
        int size = list.size();
        int i10 = 0;
        while (true) {
            if (i10 >= size) {
                break;
            } else if (!C6496s.c(((C1501m0) ((Pair) list.get(i10)).c()).b(), this)) {
                z10 = false;
                break;
            } else {
                i10++;
            }
        }
        C1506p.O(z10);
        try {
            this.f10163s.L0(list);
            C6514M m10 = C6514M.f71813a;
        } catch (Exception e10) {
            s();
            throw e10;
        } catch (Throwable th2) {
            if (!this.f10149e.isEmpty()) {
                new a(this.f10149e).f();
            }
            throw th2;
        }
    }

    public void f(L0 l02) {
        this.f10159o = true;
    }

    public void g(p pVar) {
        f L10;
        try {
            synchronized (this.f10148d) {
                C();
                L10 = L();
                I();
                this.f10163s.l0(L10, pVar);
            }
        } catch (Exception e10) {
            this.f10158n = L10;
            throw e10;
        } catch (Exception e11) {
            s();
            throw e11;
        } catch (Throwable th2) {
            if (!this.f10149e.isEmpty()) {
                new a(this.f10149e).f();
            }
            throw th2;
        }
    }

    public void h(C6787a aVar) {
        this.f10163s.T0(aVar);
    }

    public boolean i() {
        f L10;
        boolean V02;
        synchronized (this.f10148d) {
            try {
                C();
                try {
                    L10 = L();
                    I();
                    V02 = this.f10163s.V0(L10);
                    if (!V02) {
                        D();
                    }
                } catch (Exception e10) {
                    this.f10158n = L10;
                    throw e10;
                } catch (Exception e11) {
                    s();
                    throw e11;
                } catch (Throwable th2) {
                    if (!this.f10149e.isEmpty()) {
                        new a(this.f10149e).f();
                    }
                    throw th2;
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        return V02;
    }

    public void j(p pVar) {
        this.f10163s.p1();
        B(pVar);
        this.f10163s.w0();
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x0068  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean k(java.util.Set r15) {
        /*
            r14 = this;
            boolean r0 = r15 instanceof a0.d
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L_0x005c
            a0.d r15 = (a0.d) r15
            androidx.collection.W r15 = r15.a()
            java.lang.Object[] r0 = r15.f12131b
            long[] r15 = r15.f12130a
            int r3 = r15.length
            int r3 = r3 + -2
            if (r3 < 0) goto L_0x007d
            r4 = r1
        L_0x0016:
            r5 = r15[r4]
            long r7 = ~r5
            r9 = 7
            long r7 = r7 << r9
            long r7 = r7 & r5
            r9 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r7 = r7 & r9
            int r7 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r7 == 0) goto L_0x0057
            int r7 = r4 - r3
            int r7 = ~r7
            int r7 = r7 >>> 31
            r8 = 8
            int r7 = 8 - r7
            r9 = r1
        L_0x0030:
            if (r9 >= r7) goto L_0x0055
            r10 = 255(0xff, double:1.26E-321)
            long r10 = r10 & r5
            r12 = 128(0x80, double:6.32E-322)
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 >= 0) goto L_0x0051
            int r10 = r4 << 3
            int r10 = r10 + r9
            r10 = r0[r10]
            a0.f r11 = r14.f10151g
            boolean r11 = r11.c(r10)
            if (r11 != 0) goto L_0x0050
            a0.f r11 = r14.f10154j
            boolean r10 = r11.c(r10)
            if (r10 == 0) goto L_0x0051
        L_0x0050:
            return r2
        L_0x0051:
            long r5 = r5 >> r8
            int r9 = r9 + 1
            goto L_0x0030
        L_0x0055:
            if (r7 != r8) goto L_0x007d
        L_0x0057:
            if (r4 == r3) goto L_0x007d
            int r4 = r4 + 1
            goto L_0x0016
        L_0x005c:
            java.lang.Iterable r15 = (java.lang.Iterable) r15
            java.util.Iterator r15 = r15.iterator()
        L_0x0062:
            boolean r0 = r15.hasNext()
            if (r0 == 0) goto L_0x007d
            java.lang.Object r0 = r15.next()
            a0.f r3 = r14.f10151g
            boolean r3 = r3.c(r0)
            if (r3 != 0) goto L_0x007c
            a0.f r3 = r14.f10154j
            boolean r0 = r3.c(r0)
            if (r0 == 0) goto L_0x0062
        L_0x007c:
            return r2
        L_0x007d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.C1513t.k(java.util.Set):boolean");
    }

    /* JADX INFO: finally extract failed */
    public void l(C1499l0 l0Var) {
        a aVar = new a(this.f10149e);
        C1485f1 Q10 = l0Var.a().Q();
        try {
            C1506p.K(Q10, aVar);
            C6514M m10 = C6514M.f71813a;
            Q10.L(true);
            aVar.g();
        } catch (Throwable th2) {
            Q10.L(false);
            throw th2;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: java.util.Set} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v3, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v6, resolved type: java.util.Set} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v10, resolved type: java.util.Set} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v11, resolved type: java.util.Set} */
    /* JADX WARNING: type inference failed for: r2v5, types: [java.util.Set[]] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void m(java.util.Set r5) {
        /*
            r4 = this;
        L_0x0000:
            java.util.concurrent.atomic.AtomicReference r0 = r4.f10147c
            java.lang.Object r0 = r0.get()
            r1 = 1
            if (r0 != 0) goto L_0x000b
            r2 = r1
            goto L_0x0013
        L_0x000b:
            java.lang.Object r2 = Y.C1515u.f10179a
            boolean r2 = kotlin.jvm.internal.C6496s.c(r0, r2)
        L_0x0013:
            if (r2 == 0) goto L_0x0017
            r2 = r5
            goto L_0x0034
        L_0x0017:
            boolean r2 = r0 instanceof java.util.Set
            if (r2 == 0) goto L_0x0024
            r2 = 2
            java.util.Set[] r2 = new java.util.Set[r2]
            r3 = 0
            r2[r3] = r0
            r2[r1] = r5
            goto L_0x0034
        L_0x0024:
            boolean r1 = r0 instanceof java.lang.Object[]
            if (r1 == 0) goto L_0x004c
            java.lang.String r1 = "null cannot be cast to non-null type kotlin.Array<kotlin.collections.Set<kotlin.Any>>"
            kotlin.jvm.internal.C6496s.f(r0, r1)
            r1 = r0
            java.util.Set[] r1 = (java.util.Set[]) r1
            java.lang.Object[] r2 = mf.C6559l.G(r1, r5)
        L_0x0034:
            java.util.concurrent.atomic.AtomicReference r1 = r4.f10147c
            boolean r1 = w.C2780Y.a(r1, r0, r2)
            if (r1 == 0) goto L_0x0000
            if (r0 != 0) goto L_0x004b
            java.lang.Object r5 = r4.f10148d
            monitor-enter(r5)
            r4.D()     // Catch:{ all -> 0x0048 }
            lf.M r0 = lf.C6514M.f71813a     // Catch:{ all -> 0x0048 }
            monitor-exit(r5)
            goto L_0x004b
        L_0x0048:
            r0 = move-exception
            monitor-exit(r5)
            throw r0
        L_0x004b:
            return
        L_0x004c:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "corrupt pendingModifications: "
            r0.append(r1)
            java.util.concurrent.atomic.AtomicReference r1 = r4.f10147c
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r0 = r0.toString()
            r5.<init>(r0)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.C1513t.m(java.util.Set):void");
    }

    public Z n(L0 l02, Object obj) {
        C1513t tVar;
        if (l02.k()) {
            l02.C(true);
        }
        C1477d i10 = l02.i();
        if (i10 == null || !i10.b()) {
            return Z.IGNORED;
        }
        if (!this.f10150f.R(i10)) {
            synchronized (this.f10148d) {
                tVar = this.f10160p;
            }
            if (tVar == null || !tVar.M(l02, obj)) {
                return Z.IGNORED;
            }
            return Z.IMMINENT;
        } else if (!l02.j()) {
            return Z.IGNORED;
        } else {
            return G(l02, i10, obj);
        }
    }

    public void o() {
        synchronized (this.f10148d) {
            try {
                z(this.f10155k);
                D();
                C6514M m10 = C6514M.f71813a;
            } catch (Exception e10) {
                try {
                    s();
                    throw e10;
                } catch (Throwable th2) {
                    throw th2;
                }
            } catch (Throwable th3) {
                if (!this.f10149e.isEmpty()) {
                    new a(this.f10149e).f();
                }
                throw th3;
            }
        }
    }

    public boolean p() {
        return this.f10163s.O0();
    }

    public void q(Object obj) {
        synchronized (this.f10148d) {
            try {
                H(obj);
                Object b10 = this.f10154j.d().b(obj);
                if (b10 != null) {
                    if (b10 instanceof L) {
                        L l10 = (L) b10;
                        Object[] objArr = l10.f12131b;
                        long[] jArr = l10.f12130a;
                        int length = jArr.length - 2;
                        if (length >= 0) {
                            int i10 = 0;
                            while (true) {
                                long j10 = jArr[i10];
                                if ((((~j10) << 7) & j10 & -9187201950435737472L) != -9187201950435737472L) {
                                    int i11 = 8 - ((~(i10 - length)) >>> 31);
                                    for (int i12 = 0; i12 < i11; i12++) {
                                        if ((255 & j10) < 128) {
                                            H((I) objArr[(i10 << 3) + i12]);
                                        }
                                        j10 >>= 8;
                                    }
                                    if (i11 != 8) {
                                        break;
                                    }
                                }
                                if (i10 == length) {
                                    break;
                                }
                                i10++;
                            }
                        }
                    } else {
                        H((I) b10);
                    }
                }
                C6514M m10 = C6514M.f71813a;
            } finally {
            }
        }
    }

    public boolean r() {
        boolean z10;
        synchronized (this.f10148d) {
            if (this.f10158n.e() > 0) {
                z10 = true;
            } else {
                z10 = false;
            }
        }
        return z10;
    }

    public void s() {
        this.f10147c.set((Object) null);
        this.f10155k.a();
        this.f10156l.a();
        if (!this.f10149e.isEmpty()) {
            new a(this.f10149e).f();
        }
    }

    public void t() {
        synchronized (this.f10148d) {
            try {
                this.f10163s.i0();
                if (!this.f10149e.isEmpty()) {
                    new a(this.f10149e).f();
                }
                C6514M m10 = C6514M.f71813a;
            } catch (Exception e10) {
                try {
                    s();
                    throw e10;
                } catch (Throwable th2) {
                    throw th2;
                }
            } catch (Throwable th3) {
                if (!this.f10149e.isEmpty()) {
                    new a(this.f10149e).f();
                }
                throw th3;
            }
        }
    }

    public Object u(F f10, int i10, C6787a aVar) {
        if (f10 == null || C6496s.c(f10, this) || i10 < 0) {
            return aVar.invoke();
        }
        this.f10160p = (C1513t) f10;
        this.f10161q = i10;
        try {
            return aVar.invoke();
        } finally {
            this.f10160p = null;
            this.f10161q = 0;
        }
    }

    public void v() {
        L0 l02;
        synchronized (this.f10148d) {
            try {
                for (Object obj : this.f10150f.C()) {
                    if (obj instanceof L0) {
                        l02 = (L0) obj;
                    } else {
                        l02 = null;
                    }
                    if (l02 != null) {
                        l02.invalidate();
                    }
                }
                C6514M m10 = C6514M.f71813a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1513t(r rVar, C1483f fVar, g gVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(rVar, fVar, (i10 & 4) != 0 ? null : gVar);
    }
}
