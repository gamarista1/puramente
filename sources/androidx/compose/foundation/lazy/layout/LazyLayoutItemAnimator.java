package androidx.compose.foundation.lazy.layout;

import E.C1140i;
import E.C1148q;
import E.z;
import J0.C1252s;
import J0.r;
import androidx.collection.K;
import androidx.collection.L;
import androidx.collection.V;
import androidx.collection.X;
import c1.n;
import c1.s;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import k0.i;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.C6498u;
import pf.C6632a;
import r0.F1;
import t0.C2602c;
import u0.C2673c;
import u0.C2675e;
import yf.C6787a;

public final class LazyLayoutItemAnimator {

    /* renamed from: a  reason: collision with root package name */
    private final K f12944a = V.d();

    /* renamed from: b  reason: collision with root package name */
    private c f12945b;

    /* renamed from: c  reason: collision with root package name */
    private int f12946c;

    /* renamed from: d  reason: collision with root package name */
    private final L f12947d = X.a();

    /* renamed from: e  reason: collision with root package name */
    private final List f12948e = new ArrayList();

    /* renamed from: f  reason: collision with root package name */
    private final List f12949f = new ArrayList();

    /* renamed from: g  reason: collision with root package name */
    private final List f12950g = new ArrayList();

    /* renamed from: h  reason: collision with root package name */
    private final List f12951h = new ArrayList();
    /* access modifiers changed from: private */

    /* renamed from: i  reason: collision with root package name */
    public final List f12952i = new ArrayList();
    /* access modifiers changed from: private */

    /* renamed from: j  reason: collision with root package name */
    public r f12953j;

    /* renamed from: k  reason: collision with root package name */
    private final i f12954k = new DisplayingDisappearingItemsElement(this);

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0013\u0012\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0018\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u00038\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator$DisplayingDisappearingItemsElement;", "LJ0/V;", "Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator$a;", "Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;", "animator", "<init>", "(Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;)V", "d", "()Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator$a;", "node", "Llf/M;", "e", "(Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator$a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private static final class DisplayingDisappearingItemsElement extends J0.V {

        /* renamed from: b  reason: collision with root package name */
        private final LazyLayoutItemAnimator f12955b;

        public DisplayingDisappearingItemsElement(LazyLayoutItemAnimator lazyLayoutItemAnimator) {
            this.f12955b = lazyLayoutItemAnimator;
        }

        /* renamed from: d */
        public a a() {
            return new a(this.f12955b);
        }

        /* renamed from: e */
        public void b(a aVar) {
            aVar.l2(this.f12955b);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof DisplayingDisappearingItemsElement) && C6496s.c(this.f12955b, ((DisplayingDisappearingItemsElement) obj).f12955b);
        }

        public int hashCode() {
            return this.f12955b.hashCode();
        }

        public String toString() {
            return "DisplayingDisappearingItemsElement(animator=" + this.f12955b + ')';
        }
    }

    private static final class a extends i.c implements r {

        /* renamed from: n  reason: collision with root package name */
        private LazyLayoutItemAnimator f12956n;

        public a(LazyLayoutItemAnimator lazyLayoutItemAnimator) {
            this.f12956n = lazyLayoutItemAnimator;
        }

        public void V1() {
            this.f12956n.f12953j = this;
        }

        public void W1() {
            this.f12956n.o();
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && C6496s.c(this.f12956n, ((a) obj).f12956n);
        }

        public int hashCode() {
            return this.f12956n.hashCode();
        }

        public final void l2(LazyLayoutItemAnimator lazyLayoutItemAnimator) {
            if (!C6496s.c(this.f12956n, lazyLayoutItemAnimator) && v0().S1()) {
                this.f12956n.o();
                lazyLayoutItemAnimator.f12953j = this;
                this.f12956n = lazyLayoutItemAnimator;
            }
        }

        public String toString() {
            return "DisplayingDisappearingItemsNode(animator=" + this.f12956n + ')';
        }

        public void u(C2602c cVar) {
            List b10 = this.f12956n.f12952i;
            int size = b10.size();
            for (int i10 = 0; i10 < size; i10++) {
                b bVar = (b) b10.get(i10);
                C2673c p10 = bVar.p();
                if (p10 != null) {
                    float j10 = ((float) n.j(bVar.o())) - ((float) n.j(p10.w()));
                    float k10 = ((float) n.k(bVar.o())) - ((float) n.k(p10.w()));
                    cVar.w1().e().d(j10, k10);
                    try {
                        C2675e.a(cVar, p10);
                    } finally {
                        cVar.w1().e().d(-j10, -k10);
                    }
                }
            }
            cVar.H1();
        }
    }

    private final class b {

        /* renamed from: a  reason: collision with root package name */
        private b[] f12957a = C1148q.f1669a;

        /* renamed from: b  reason: collision with root package name */
        private c1.b f12958b;

        /* renamed from: c  reason: collision with root package name */
        private int f12959c;

        /* renamed from: d  reason: collision with root package name */
        private int f12960d;

        /* renamed from: e  reason: collision with root package name */
        private int f12961e = 1;

        /* renamed from: f  reason: collision with root package name */
        private int f12962f;

        /* renamed from: g  reason: collision with root package name */
        private int f12963g;

        static final class a extends C6498u implements C6787a {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ LazyLayoutItemAnimator f12965a;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(LazyLayoutItemAnimator lazyLayoutItemAnimator) {
                super(0);
                this.f12965a = lazyLayoutItemAnimator;
            }

            public final void invoke() {
                r c10 = this.f12965a.f12953j;
                if (c10 != null) {
                    C1252s.a(c10);
                }
            }
        }

        public b() {
        }

        private final boolean h() {
            for (b bVar : this.f12957a) {
                if (bVar != null && bVar.x()) {
                    return true;
                }
            }
            return false;
        }

        public static /* synthetic */ void l(b bVar, z zVar, Ug.K k10, F1 f12, int i10, int i11, int i12, int i13, Object obj) {
            if ((i13 & 32) != 0) {
                i12 = LazyLayoutItemAnimator.this.f(zVar);
            }
            bVar.k(zVar, k10, f12, i10, i11, i12);
        }

        public final b[] a() {
            return this.f12957a;
        }

        public final c1.b b() {
            return this.f12958b;
        }

        public final int c() {
            return this.f12959c;
        }

        public final int d() {
            return this.f12960d;
        }

        public final int e() {
            return this.f12963g;
        }

        public final int f() {
            return this.f12962f;
        }

        public final int g() {
            return this.f12961e;
        }

        public final void i(int i10) {
            this.f12960d = i10;
        }

        public final void j(int i10) {
            this.f12961e = i10;
        }

        public final void k(z zVar, Ug.K k10, F1 f12, int i10, int i11, int i12) {
            if (!h()) {
                this.f12962f = i10;
                this.f12963g = i11;
            }
            int length = this.f12957a.length;
            for (int d10 = zVar.d(); d10 < length; d10++) {
                b bVar = this.f12957a[d10];
                if (bVar != null) {
                    bVar.y();
                }
            }
            if (this.f12957a.length != zVar.d()) {
                Object[] copyOf = Arrays.copyOf(this.f12957a, zVar.d());
                C6496s.g(copyOf, "copyOf(this, newSize)");
                this.f12957a = (b[]) copyOf;
            }
            this.f12958b = c1.b.a(zVar.c());
            this.f12959c = i12;
            this.f12960d = zVar.l();
            this.f12961e = zVar.f();
            int d11 = zVar.d();
            LazyLayoutItemAnimator lazyLayoutItemAnimator = LazyLayoutItemAnimator.this;
            for (int i13 = 0; i13 < d11; i13++) {
                C1140i b10 = C1148q.c(zVar.j(i13));
                if (b10 == null) {
                    b bVar2 = this.f12957a[i13];
                    if (bVar2 != null) {
                        bVar2.y();
                    }
                    this.f12957a[i13] = null;
                } else {
                    b bVar3 = this.f12957a[i13];
                    if (bVar3 == null) {
                        bVar3 = new b(k10, f12, new a(lazyLayoutItemAnimator));
                        this.f12957a[i13] = bVar3;
                    }
                    bVar3.C(b10.l2());
                    bVar3.I(b10.n2());
                    bVar3.D(b10.m2());
                }
            }
        }
    }

    public static final class c implements Comparator {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f12966a;

        public c(c cVar) {
            this.f12966a = cVar;
        }

        public final int compare(Object obj, Object obj2) {
            return C6632a.d(Integer.valueOf(this.f12966a.c(((z) obj).getKey())), Integer.valueOf(this.f12966a.c(((z) obj2).getKey())));
        }
    }

    public static final class d implements Comparator {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f12967a;

        public d(c cVar) {
            this.f12967a = cVar;
        }

        public final int compare(Object obj, Object obj2) {
            return C6632a.d(Integer.valueOf(this.f12967a.c(((z) obj).getKey())), Integer.valueOf(this.f12967a.c(((z) obj2).getKey())));
        }
    }

    public static final class e implements Comparator {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f12968a;

        public e(c cVar) {
            this.f12968a = cVar;
        }

        public final int compare(Object obj, Object obj2) {
            return C6632a.d(Integer.valueOf(this.f12968a.c(((z) obj2).getKey())), Integer.valueOf(this.f12968a.c(((z) obj).getKey())));
        }
    }

    public static final class f implements Comparator {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f12969a;

        public f(c cVar) {
            this.f12969a = cVar;
        }

        public final int compare(Object obj, Object obj2) {
            return C6632a.d(Integer.valueOf(this.f12969a.c(((z) obj2).getKey())), Integer.valueOf(this.f12969a.c(((z) obj).getKey())));
        }
    }

    /* access modifiers changed from: private */
    public final int f(z zVar) {
        long k10 = zVar.k(0);
        if (!zVar.g()) {
            return n.k(k10);
        }
        return n.j(k10);
    }

    private final boolean g(z zVar) {
        int d10 = zVar.d();
        for (int i10 = 0; i10 < d10; i10++) {
            if (C1148q.c(zVar.j(i10)) != null) {
                return true;
            }
        }
        return false;
    }

    private final int h(z zVar) {
        long k10 = zVar.k(0);
        if (zVar.g()) {
            return n.k(k10);
        }
        return n.j(k10);
    }

    private final void k(z zVar, int i10, b bVar) {
        long j10;
        int i11 = 0;
        long k10 = zVar.k(0);
        if (zVar.g()) {
            j10 = n.g(k10, 0, i10, 1, (Object) null);
        } else {
            j10 = n.g(k10, i10, 0, 2, (Object) null);
        }
        b[] a10 = bVar.a();
        int length = a10.length;
        int i12 = 0;
        while (i11 < length) {
            b bVar2 = a10[i11];
            int i13 = i12 + 1;
            if (bVar2 != null) {
                bVar2.J(n.n(j10, n.m(zVar.k(i12), k10)));
            }
            i11++;
            i12 = i13;
        }
    }

    static /* synthetic */ void l(LazyLayoutItemAnimator lazyLayoutItemAnimator, z zVar, int i10, b bVar, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            Object b10 = lazyLayoutItemAnimator.f12944a.b(zVar.getKey());
            C6496s.e(b10);
            bVar = (b) b10;
        }
        lazyLayoutItemAnimator.k(zVar, i10, bVar);
    }

    private final void n(Object obj) {
        b[] a10;
        b bVar = (b) this.f12944a.o(obj);
        if (bVar != null && (a10 = bVar.a()) != null) {
            for (b bVar2 : a10) {
                if (bVar2 != null) {
                    bVar2.y();
                }
            }
        }
    }

    private final void p(z zVar, boolean z10) {
        Object b10 = this.f12944a.b(zVar.getKey());
        C6496s.e(b10);
        b[] a10 = ((b) b10).a();
        int length = a10.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            b bVar = a10[i10];
            int i12 = i11 + 1;
            if (bVar != null) {
                long k10 = zVar.k(i11);
                long s10 = bVar.s();
                if (!n.i(s10, b.f12977s.a()) && !n.i(s10, k10)) {
                    bVar.m(n.m(k10, s10), z10);
                }
                bVar.J(k10);
            }
            i10++;
            i11 = i12;
        }
    }

    static /* synthetic */ void q(LazyLayoutItemAnimator lazyLayoutItemAnimator, z zVar, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        lazyLayoutItemAnimator.p(zVar, z10);
    }

    private final int r(int[] iArr, z zVar) {
        int l10 = zVar.l();
        int f10 = zVar.f() + l10;
        int i10 = 0;
        while (l10 < f10) {
            int i11 = iArr[l10] + zVar.i();
            iArr[l10] = i11;
            i10 = Math.max(i10, i11);
            l10++;
        }
        return i10;
    }

    public final b e(Object obj, int i10) {
        b[] a10;
        b bVar = (b) this.f12944a.b(obj);
        if (bVar == null || (a10 = bVar.a()) == null) {
            return null;
        }
        return a10[i10];
    }

    public final long i() {
        long a10 = c1.r.f19235b.a();
        List list = this.f12952i;
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            b bVar = (b) list.get(i10);
            C2673c p10 = bVar.p();
            if (p10 != null) {
                a10 = s.a(Math.max(c1.r.g(a10), n.j(bVar.s()) + c1.r.g(p10.v())), Math.max(c1.r.f(a10), n.k(bVar.s()) + c1.r.f(p10.v())));
            }
        }
        return a10;
    }

    public final i j() {
        return this.f12954k;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:178:0x0416, code lost:
        r12.k(r0, r48, r49, r46, r47, r12.c());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:179:0x042b, code lost:
        if (r13 >= r6.f12946c) goto L_0x0433;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:180:0x042d, code lost:
        r6.f12950g.add(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:181:0x0433, code lost:
        r6.f12951h.add(r0);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void m(int r36, int r37, int r38, java.util.List r39, androidx.compose.foundation.lazy.layout.c r40, E.A r41, boolean r42, boolean r43, int r44, boolean r45, int r46, int r47, Ug.K r48, r0.F1 r49) {
        /*
            r35 = this;
            r6 = r35
            r0 = r36
            r7 = r37
            r8 = r38
            r9 = r39
            r10 = r40
            r11 = r44
            r12 = 1
            androidx.compose.foundation.lazy.layout.c r13 = r6.f12945b
            r6.f12945b = r10
            int r1 = r39.size()
            r14 = 0
            r2 = r14
        L_0x0019:
            if (r2 >= r1) goto L_0x002a
            java.lang.Object r3 = r9.get(r2)
            E.z r3 = (E.z) r3
            boolean r3 = r6.g(r3)
            if (r3 == 0) goto L_0x0028
            goto L_0x0036
        L_0x0028:
            int r2 = r2 + r12
            goto L_0x0019
        L_0x002a:
            androidx.collection.K r1 = r6.f12944a
            boolean r1 = r1.e()
            if (r1 == 0) goto L_0x0036
            r35.o()
            return
        L_0x0036:
            int r1 = r6.f12946c
            java.lang.Object r2 = mf.C6565s.q0(r39)
            E.z r2 = (E.z) r2
            if (r2 == 0) goto L_0x0045
            int r2 = r2.getIndex()
            goto L_0x0046
        L_0x0045:
            r2 = r14
        L_0x0046:
            r6.f12946c = r2
            if (r42 == 0) goto L_0x004f
            long r2 = c1.o.a(r14, r0)
            goto L_0x0053
        L_0x004f:
            long r2 = c1.o.a(r0, r14)
        L_0x0053:
            if (r43 != 0) goto L_0x005a
            if (r45 != 0) goto L_0x0058
            goto L_0x005a
        L_0x0058:
            r15 = r14
            goto L_0x005b
        L_0x005a:
            r15 = r12
        L_0x005b:
            androidx.collection.K r0 = r6.f12944a
            java.lang.Object[] r4 = r0.f12124b
            long[] r0 = r0.f12123a
            int r5 = r0.length
            r14 = 2
            int r5 = r5 - r14
            r16 = 128(0x80, double:6.32E-322)
            r18 = 255(0xff, double:1.26E-321)
            r20 = 7
            r21 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            r42 = r15
            if (r5 < 0) goto L_0x00cc
            r12 = 0
        L_0x0074:
            r14 = r0[r12]
            long r7 = ~r14
            long r7 = r7 << r20
            long r7 = r7 & r14
            long r7 = r7 & r21
            int r7 = (r7 > r21 ? 1 : (r7 == r21 ? 0 : -1))
            if (r7 == 0) goto L_0x00bb
            int r7 = r12 - r5
            int r7 = ~r7
            int r7 = r7 >>> 31
            r8 = 8
            int r7 = 8 - r7
            r8 = 0
        L_0x008a:
            if (r8 >= r7) goto L_0x00b1
            long r24 = r14 & r18
            int r24 = (r24 > r16 ? 1 : (r24 == r16 ? 0 : -1))
            if (r24 >= 0) goto L_0x00a4
            int r24 = r12 << 3
            int r24 = r24 + r8
            r25 = r0
            r0 = r4[r24]
            r24 = r4
            androidx.collection.L r4 = r6.f12947d
            r4.h(r0)
        L_0x00a1:
            r0 = 8
            goto L_0x00a9
        L_0x00a4:
            r25 = r0
            r24 = r4
            goto L_0x00a1
        L_0x00a9:
            long r14 = r14 >> r0
            r4 = 1
            int r8 = r8 + r4
            r4 = r24
            r0 = r25
            goto L_0x008a
        L_0x00b1:
            r25 = r0
            r24 = r4
            r0 = 8
            r4 = 1
            if (r7 != r0) goto L_0x00cc
            goto L_0x00c0
        L_0x00bb:
            r25 = r0
            r24 = r4
            r4 = 1
        L_0x00c0:
            if (r12 == r5) goto L_0x00cc
            int r12 = r12 + r4
            r7 = r37
            r8 = r38
            r4 = r24
            r0 = r25
            goto L_0x0074
        L_0x00cc:
            int r0 = r39.size()
            r4 = 0
        L_0x00d1:
            r7 = -1
            if (r4 >= r0) goto L_0x021b
            java.lang.Object r5 = r9.get(r4)
            E.z r5 = (E.z) r5
            androidx.collection.L r12 = r6.f12947d
            java.lang.Object r14 = r5.getKey()
            r12.x(r14)
            boolean r12 = r6.g(r5)
            if (r12 == 0) goto L_0x0203
            androidx.collection.K r12 = r6.f12944a
            java.lang.Object r14 = r5.getKey()
            java.lang.Object r12 = r12.b(r14)
            androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator$b r12 = (androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator.b) r12
            if (r13 == 0) goto L_0x0100
            java.lang.Object r14 = r5.getKey()
            int r14 = r13.c(r14)
            goto L_0x0101
        L_0x0100:
            r14 = r7
        L_0x0101:
            if (r14 != r7) goto L_0x0107
            if (r13 == 0) goto L_0x0107
            r15 = 1
            goto L_0x0108
        L_0x0107:
            r15 = 0
        L_0x0108:
            if (r12 != 0) goto L_0x0178
            androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator$b r8 = new androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator$b
            r8.<init>()
            r31 = 32
            r32 = 0
            r30 = 0
            r24 = r8
            r25 = r5
            r26 = r48
            r27 = r49
            r28 = r46
            r29 = r47
            androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator.b.l(r24, r25, r26, r27, r28, r29, r30, r31, r32)
            androidx.collection.K r12 = r6.f12944a
            java.lang.Object r7 = r5.getKey()
            r12.r(r7, r8)
            int r7 = r5.getIndex()
            if (r7 == r14) goto L_0x014b
            r7 = -1
            if (r14 == r7) goto L_0x014b
            if (r14 >= r1) goto L_0x0145
            java.util.List r7 = r6.f12948e
            r7.add(r5)
        L_0x013d:
            r26 = r0
            r27 = r13
            r0 = 0
            r9 = 1
            goto L_0x0210
        L_0x0145:
            java.util.List r7 = r6.f12949f
            r7.add(r5)
            goto L_0x013d
        L_0x014b:
            r7 = 0
            long r24 = r5.k(r7)
            boolean r7 = r5.g()
            if (r7 == 0) goto L_0x015b
            int r7 = c1.n.k(r24)
            goto L_0x015f
        L_0x015b:
            int r7 = c1.n.j(r24)
        L_0x015f:
            r6.k(r5, r7, r8)
            if (r15 == 0) goto L_0x013d
            androidx.compose.foundation.lazy.layout.b[] r5 = r8.a()
            int r7 = r5.length
            r8 = 0
        L_0x016a:
            if (r8 >= r7) goto L_0x013d
            r12 = r5[r8]
            if (r12 == 0) goto L_0x0175
            r12.k()
            lf.M r12 = lf.C6514M.f71813a
        L_0x0175:
            r12 = 1
            int r8 = r8 + r12
            goto L_0x016a
        L_0x0178:
            if (r42 == 0) goto L_0x013d
            r31 = 32
            r32 = 0
            r30 = 0
            r24 = r12
            r25 = r5
            r26 = r48
            r27 = r49
            r28 = r46
            r29 = r47
            androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator.b.l(r24, r25, r26, r27, r28, r29, r30, r31, r32)
            androidx.compose.foundation.lazy.layout.b[] r7 = r12.a()
            int r14 = r7.length
            r8 = 0
        L_0x0195:
            if (r8 >= r14) goto L_0x01cf
            r26 = r0
            r0 = r7[r8]
            if (r0 == 0) goto L_0x01be
            long r9 = r0.s()
            androidx.compose.foundation.lazy.layout.b$a r24 = androidx.compose.foundation.lazy.layout.b.f12977s
            r27 = r13
            r28 = r14
            long r13 = r24.a()
            boolean r9 = c1.n.i(r9, r13)
            if (r9 != 0) goto L_0x01bc
            long r9 = r0.s()
            long r9 = c1.n.n(r9, r2)
            r0.J(r9)
        L_0x01bc:
            r0 = 1
            goto L_0x01c3
        L_0x01be:
            r27 = r13
            r28 = r14
            goto L_0x01bc
        L_0x01c3:
            int r8 = r8 + r0
            r9 = r39
            r10 = r40
            r0 = r26
            r13 = r27
            r14 = r28
            goto L_0x0195
        L_0x01cf:
            r26 = r0
            r27 = r13
            if (r15 == 0) goto L_0x01fb
            androidx.compose.foundation.lazy.layout.b[] r0 = r12.a()
            int r7 = r0.length
            r8 = 0
        L_0x01db:
            if (r8 >= r7) goto L_0x01fb
            r9 = r0[r8]
            if (r9 == 0) goto L_0x01f8
            boolean r10 = r9.v()
            if (r10 == 0) goto L_0x01f5
            java.util.List r10 = r6.f12952i
            r10.remove(r9)
            J0.r r10 = r6.f12953j
            if (r10 == 0) goto L_0x01f5
            J0.C1252s.a(r10)
            lf.M r10 = lf.C6514M.f71813a
        L_0x01f5:
            r9.k()
        L_0x01f8:
            r9 = 1
            int r8 = r8 + r9
            goto L_0x01db
        L_0x01fb:
            r9 = 1
            r0 = 0
            r7 = 2
            r8 = 0
            q(r6, r5, r0, r7, r8)
            goto L_0x0210
        L_0x0203:
            r26 = r0
            r27 = r13
            r0 = 0
            r9 = 1
            java.lang.Object r5 = r5.getKey()
            r6.n(r5)
        L_0x0210:
            int r4 = r4 + r9
            r9 = r39
            r10 = r40
            r0 = r26
            r13 = r27
            goto L_0x00d1
        L_0x021b:
            r27 = r13
            r0 = 0
            r9 = 1
            int[] r7 = new int[r11]
            r1 = r0
        L_0x0222:
            if (r1 >= r11) goto L_0x0229
            r7[r1] = r0
            int r1 = r1 + r9
            r0 = 0
            goto L_0x0222
        L_0x0229:
            if (r42 == 0) goto L_0x02df
            if (r27 == 0) goto L_0x02df
            java.util.List r0 = r6.f12948e
            java.util.Collection r0 = (java.util.Collection) r0
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x0284
            java.util.List r0 = r6.f12948e
            int r1 = r0.size()
            if (r1 <= r9) goto L_0x024a
            androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator$e r1 = new androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator$e
            r8 = r27
            r1.<init>(r8)
            mf.C6565s.C(r0, r1)
            goto L_0x024c
        L_0x024a:
            r8 = r27
        L_0x024c:
            java.util.List r9 = r6.f12948e
            int r10 = r9.size()
            r12 = 0
        L_0x0253:
            if (r12 >= r10) goto L_0x0274
            java.lang.Object r0 = r9.get(r12)
            r13 = r0
            E.z r13 = (E.z) r13
            int r0 = r6.r(r7, r13)
            int r2 = r46 - r0
            r4 = 4
            r5 = 0
            r3 = 0
            r0 = r35
            r1 = r13
            l(r0, r1, r2, r3, r4, r5)
            r0 = 0
            r1 = 2
            r2 = 0
            q(r6, r13, r0, r1, r2)
            r0 = 1
            int r12 = r12 + r0
            goto L_0x0253
        L_0x0274:
            r32 = 6
            r33 = 0
            r29 = 0
            r30 = 0
            r31 = 0
            r28 = r7
            mf.C6559l.y(r28, r29, r30, r31, r32, r33)
            goto L_0x0286
        L_0x0284:
            r8 = r27
        L_0x0286:
            java.util.List r0 = r6.f12949f
            java.util.Collection r0 = (java.util.Collection) r0
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x02e1
            java.util.List r0 = r6.f12949f
            int r1 = r0.size()
            r2 = 1
            if (r1 <= r2) goto L_0x02a1
            androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator$c r1 = new androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator$c
            r1.<init>(r8)
            mf.C6565s.C(r0, r1)
        L_0x02a1:
            java.util.List r9 = r6.f12949f
            int r10 = r9.size()
            r12 = 0
        L_0x02a8:
            if (r12 >= r10) goto L_0x02cf
            java.lang.Object r0 = r9.get(r12)
            r13 = r0
            E.z r13 = (E.z) r13
            int r0 = r6.r(r7, r13)
            int r0 = r47 + r0
            int r1 = r13.i()
            int r2 = r0 - r1
            r4 = 4
            r5 = 0
            r3 = 0
            r0 = r35
            r1 = r13
            l(r0, r1, r2, r3, r4, r5)
            r0 = 0
            r1 = 2
            r2 = 0
            q(r6, r13, r0, r1, r2)
            r0 = 1
            int r12 = r12 + r0
            goto L_0x02a8
        L_0x02cf:
            r32 = 6
            r33 = 0
            r29 = 0
            r30 = 0
            r31 = 0
            r28 = r7
            mf.C6559l.y(r28, r29, r30, r31, r32, r33)
            goto L_0x02e1
        L_0x02df:
            r8 = r27
        L_0x02e1:
            androidx.collection.L r0 = r6.f12947d
            java.lang.Object[] r1 = r0.f12131b
            long[] r0 = r0.f12130a
            int r2 = r0.length
            r3 = 2
            int r2 = r2 - r3
            if (r2 < 0) goto L_0x0477
            r3 = 0
        L_0x02ed:
            r4 = r0[r3]
            long r9 = ~r4
            long r9 = r9 << r20
            long r9 = r9 & r4
            long r9 = r9 & r21
            int r9 = (r9 > r21 ? 1 : (r9 == r21 ? 0 : -1))
            if (r9 == 0) goto L_0x045f
            int r9 = r3 - r2
            int r9 = ~r9
            int r9 = r9 >>> 31
            r10 = 8
            int r14 = 8 - r9
            r9 = 0
        L_0x0303:
            if (r9 >= r14) goto L_0x0451
            long r12 = r4 & r18
            int r10 = (r12 > r16 ? 1 : (r12 == r16 ? 0 : -1))
            if (r10 >= 0) goto L_0x043b
            int r10 = r3 << 3
            int r10 = r10 + r9
            r10 = r1[r10]
            androidx.collection.K r12 = r6.f12944a
            java.lang.Object r12 = r12.b(r10)
            kotlin.jvm.internal.C6496s.e(r12)
            androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator$b r12 = (androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator.b) r12
            r15 = r40
            int r13 = r15.c(r10)
            r33 = r0
            int r0 = r12.g()
            int r0 = java.lang.Math.min(r11, r0)
            r12.j(r0)
            int r0 = r12.g()
            int r0 = r11 - r0
            r36 = r1
            int r1 = r12.d()
            int r0 = java.lang.Math.min(r0, r1)
            r12.i(r0)
            r0 = -1
            if (r13 != r0) goto L_0x03c7
            androidx.compose.foundation.lazy.layout.b[] r1 = r12.a()
            int r13 = r1.length
            r0 = 0
            r26 = 0
            r27 = 0
        L_0x034e:
            if (r0 >= r13) goto L_0x03bf
            r11 = r1[r0]
            r23 = 1
            int r28 = r26 + 1
            if (r11 == 0) goto L_0x03b3
            boolean r29 = r11.v()
            if (r29 == 0) goto L_0x0365
            r29 = r1
        L_0x0360:
            r1 = 1
            r11 = 0
            r27 = 1
            goto L_0x03b7
        L_0x0365:
            boolean r29 = r11.u()
            if (r29 == 0) goto L_0x0388
            r11.y()
            androidx.compose.foundation.lazy.layout.b[] r29 = r12.a()
            r25 = 0
            r29[r26] = r25
            r29 = r1
            java.util.List r1 = r6.f12952i
            r1.remove(r11)
            J0.r r1 = r6.f12953j
            if (r1 == 0) goto L_0x0386
            J0.C1252s.a(r1)
            lf.M r1 = lf.C6514M.f71813a
        L_0x0386:
            r11 = 0
            goto L_0x03b6
        L_0x0388:
            r29 = r1
            u0.c r1 = r11.p()
            if (r1 == 0) goto L_0x0393
            r11.l()
        L_0x0393:
            boolean r1 = r11.v()
            if (r1 == 0) goto L_0x03a8
            java.util.List r1 = r6.f12952i
            r1.add(r11)
            J0.r r1 = r6.f12953j
            if (r1 == 0) goto L_0x0360
            J0.C1252s.a(r1)
            lf.M r1 = lf.C6514M.f71813a
            goto L_0x0360
        L_0x03a8:
            r11.y()
            androidx.compose.foundation.lazy.layout.b[] r1 = r12.a()
            r11 = 0
            r1[r26] = r11
            goto L_0x03b6
        L_0x03b3:
            r29 = r1
            goto L_0x0386
        L_0x03b6:
            r1 = 1
        L_0x03b7:
            int r0 = r0 + r1
            r11 = r44
            r26 = r28
            r1 = r29
            goto L_0x034e
        L_0x03bf:
            r11 = 0
            if (r27 != 0) goto L_0x0441
            r6.n(r10)
            goto L_0x0441
        L_0x03c7:
            r11 = 0
            c1.b r0 = r12.b()
            kotlin.jvm.internal.C6496s.e(r0)
            long r30 = r0.r()
            int r28 = r12.d()
            int r29 = r12.g()
            r26 = r41
            r27 = r13
            E.z r0 = r26.a(r27, r28, r29, r30)
            r1 = 1
            r0.e(r1)
            androidx.compose.foundation.lazy.layout.b[] r11 = r12.a()
            int r1 = r11.length
            r34 = r7
            r7 = 0
        L_0x03ef:
            if (r7 >= r1) goto L_0x040a
            r26 = r11[r7]
            r27 = r1
            if (r26 == 0) goto L_0x0401
            boolean r1 = r26.w()
            r26 = r11
            r11 = 1
            if (r1 != r11) goto L_0x0404
            goto L_0x0416
        L_0x0401:
            r26 = r11
            r11 = 1
        L_0x0404:
            int r7 = r7 + r11
            r11 = r26
            r1 = r27
            goto L_0x03ef
        L_0x040a:
            if (r8 == 0) goto L_0x0416
            int r1 = r8.c(r10)
            if (r13 != r1) goto L_0x0416
            r6.n(r10)
            goto L_0x0438
        L_0x0416:
            int r32 = r12.c()
            r26 = r12
            r27 = r0
            r28 = r48
            r29 = r49
            r30 = r46
            r31 = r47
            r26.k(r27, r28, r29, r30, r31, r32)
            int r1 = r6.f12946c
            if (r13 >= r1) goto L_0x0433
            java.util.List r1 = r6.f12950g
            r1.add(r0)
            goto L_0x0438
        L_0x0433:
            java.util.List r1 = r6.f12951h
            r1.add(r0)
        L_0x0438:
            r0 = 8
            goto L_0x0444
        L_0x043b:
            r15 = r40
            r33 = r0
            r36 = r1
        L_0x0441:
            r34 = r7
            goto L_0x0438
        L_0x0444:
            long r4 = r4 >> r0
            r1 = 1
            int r9 = r9 + r1
            r1 = r36
            r11 = r44
            r0 = r33
            r7 = r34
            goto L_0x0303
        L_0x0451:
            r15 = r40
            r33 = r0
            r36 = r1
            r34 = r7
            r0 = 8
            r1 = 1
            if (r14 != r0) goto L_0x047b
            goto L_0x046a
        L_0x045f:
            r15 = r40
            r33 = r0
            r36 = r1
            r34 = r7
            r0 = 8
            r1 = 1
        L_0x046a:
            if (r3 == r2) goto L_0x047b
            int r3 = r3 + r1
            r1 = r36
            r11 = r44
            r0 = r33
            r7 = r34
            goto L_0x02ed
        L_0x0477:
            r15 = r40
            r34 = r7
        L_0x047b:
            java.util.List r0 = r6.f12950g
            java.util.Collection r0 = (java.util.Collection) r0
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x04f3
            java.util.List r0 = r6.f12950g
            int r1 = r0.size()
            r2 = 1
            if (r1 <= r2) goto L_0x0496
            androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator$f r1 = new androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator$f
            r1.<init>(r15)
            mf.C6565s.C(r0, r1)
        L_0x0496:
            java.util.List r0 = r6.f12950g
            int r1 = r0.size()
            r7 = 0
        L_0x049d:
            if (r7 >= r1) goto L_0x04e1
            java.lang.Object r2 = r0.get(r7)
            E.z r2 = (E.z) r2
            androidx.collection.K r3 = r6.f12944a
            java.lang.Object r4 = r2.getKey()
            java.lang.Object r3 = r3.b(r4)
            kotlin.jvm.internal.C6496s.e(r3)
            androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator$b r3 = (androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator.b) r3
            r4 = r34
            int r5 = r6.r(r4, r2)
            if (r43 == 0) goto L_0x04c7
            java.lang.Object r8 = mf.C6565s.o0(r39)
            E.z r8 = (E.z) r8
            int r8 = r6.h(r8)
            goto L_0x04cb
        L_0x04c7:
            int r8 = r3.f()
        L_0x04cb:
            int r8 = r8 - r5
            int r3 = r3.c()
            r5 = r37
            r9 = r38
            r2.h(r8, r3, r5, r9)
            r3 = 1
            if (r42 == 0) goto L_0x04dd
            r6.p(r2, r3)
        L_0x04dd:
            int r7 = r7 + r3
            r34 = r4
            goto L_0x049d
        L_0x04e1:
            r5 = r37
            r9 = r38
            r4 = r34
            r14 = 6
            r0 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r10 = r4
            r1 = r15
            r15 = r0
            mf.C6559l.y(r10, r11, r12, r13, r14, r15)
            goto L_0x04fa
        L_0x04f3:
            r5 = r37
            r9 = r38
            r1 = r15
            r4 = r34
        L_0x04fa:
            java.util.List r0 = r6.f12951h
            java.util.Collection r0 = (java.util.Collection) r0
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x055d
            java.util.List r0 = r6.f12951h
            int r2 = r0.size()
            r3 = 1
            if (r2 <= r3) goto L_0x0515
            androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator$d r2 = new androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator$d
            r2.<init>(r1)
            mf.C6565s.C(r0, r2)
        L_0x0515:
            java.util.List r0 = r6.f12951h
            int r1 = r0.size()
            r7 = 0
        L_0x051c:
            if (r7 >= r1) goto L_0x055d
            java.lang.Object r2 = r0.get(r7)
            E.z r2 = (E.z) r2
            androidx.collection.K r3 = r6.f12944a
            java.lang.Object r8 = r2.getKey()
            java.lang.Object r3 = r3.b(r8)
            kotlin.jvm.internal.C6496s.e(r3)
            androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator$b r3 = (androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator.b) r3
            int r8 = r6.r(r4, r2)
            if (r43 == 0) goto L_0x0544
            java.lang.Object r10 = mf.C6565s.z0(r39)
            E.z r10 = (E.z) r10
            int r10 = r6.h(r10)
            goto L_0x054d
        L_0x0544:
            int r10 = r3.e()
            int r11 = r2.i()
            int r10 = r10 - r11
        L_0x054d:
            int r10 = r10 + r8
            int r3 = r3.c()
            r2.h(r10, r3, r5, r9)
            r3 = 1
            if (r42 == 0) goto L_0x055b
            r6.p(r2, r3)
        L_0x055b:
            int r7 = r7 + r3
            goto L_0x051c
        L_0x055d:
            java.util.List r0 = r6.f12950g
            mf.C6565s.Z(r0)
            lf.M r1 = lf.C6514M.f71813a
            java.util.Collection r0 = (java.util.Collection) r0
            r1 = r39
            r2 = 0
            r1.addAll(r2, r0)
            java.util.List r0 = r6.f12951h
            java.util.Collection r0 = (java.util.Collection) r0
            r1.addAll(r0)
            java.util.List r0 = r6.f12948e
            r0.clear()
            java.util.List r0 = r6.f12949f
            r0.clear()
            java.util.List r0 = r6.f12950g
            r0.clear()
            java.util.List r0 = r6.f12951h
            r0.clear()
            androidx.collection.L r0 = r6.f12947d
            r0.m()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator.m(int, int, int, java.util.List, androidx.compose.foundation.lazy.layout.c, E.A, boolean, boolean, int, boolean, int, int, Ug.K, r0.F1):void");
    }

    public final void o() {
        if (this.f12944a.f()) {
            K k10 = this.f12944a;
            Object[] objArr = k10.f12125c;
            long[] jArr = k10.f12123a;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i10 = 0;
                while (true) {
                    long j10 = jArr[i10];
                    if ((((~j10) << 7) & j10 & -9187201950435737472L) != -9187201950435737472L) {
                        int i11 = 8 - ((~(i10 - length)) >>> 31);
                        for (int i12 = 0; i12 < i11; i12++) {
                            if ((255 & j10) < 128) {
                                for (b bVar : ((b) objArr[(i10 << 3) + i12]).a()) {
                                    if (bVar != null) {
                                        bVar.y();
                                    }
                                }
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
            this.f12944a.h();
        }
        this.f12945b = c.f13028a;
        this.f12946c = -1;
    }
}
