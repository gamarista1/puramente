package Y;

import Y.I;
import a0.C1538b;
import androidx.collection.N;
import androidx.collection.O;
import com.google.android.gms.common.api.a;
import g0.d;
import i0.C2057k;
import i0.p;
import i0.x;
import i0.y;
import i0.z;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.C6498u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lf.C6514M;
import yf.C6787a;
import yf.C6798l;

final class H extends y implements I {

    /* renamed from: b  reason: collision with root package name */
    private final C6787a f9767b;

    /* renamed from: c  reason: collision with root package name */
    private final o1 f9768c;

    /* renamed from: d  reason: collision with root package name */
    private a f9769d = new a();

    public static final class a extends z implements I.a {

        /* renamed from: h  reason: collision with root package name */
        public static final C0185a f9770h = new C0185a((DefaultConstructorMarker) null);

        /* renamed from: i  reason: collision with root package name */
        public static final int f9771i = 8;
        /* access modifiers changed from: private */

        /* renamed from: j  reason: collision with root package name */
        public static final Object f9772j = new Object();

        /* renamed from: c  reason: collision with root package name */
        private int f9773c;

        /* renamed from: d  reason: collision with root package name */
        private int f9774d;

        /* renamed from: e  reason: collision with root package name */
        private N f9775e = O.a();

        /* renamed from: f  reason: collision with root package name */
        private Object f9776f = f9772j;

        /* renamed from: g  reason: collision with root package name */
        private int f9777g;

        /* renamed from: Y.H$a$a  reason: collision with other inner class name */
        public static final class C0185a {
            public /* synthetic */ C0185a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final Object a() {
                return a.f9772j;
            }

            private C0185a() {
            }
        }

        public Object a() {
            return this.f9776f;
        }

        public N b() {
            return this.f9775e;
        }

        public void c(z zVar) {
            C6496s.f(zVar, "null cannot be cast to non-null type androidx.compose.runtime.DerivedSnapshotState.ResultRecord<T of androidx.compose.runtime.DerivedSnapshotState.ResultRecord>");
            a aVar = (a) zVar;
            m(aVar.b());
            this.f9776f = aVar.f9776f;
            this.f9777g = aVar.f9777g;
        }

        public z d() {
            return new a();
        }

        public final Object j() {
            return this.f9776f;
        }

        public final boolean k(I i10, C2057k kVar) {
            boolean z10;
            boolean z11;
            synchronized (p.I()) {
                z10 = true;
                if (this.f9773c == kVar.f() && this.f9774d == kVar.j()) {
                    z11 = false;
                } else {
                    z11 = true;
                }
            }
            if (this.f9776f == f9772j || (z11 && this.f9777g != l(i10, kVar))) {
                z10 = false;
            }
            if (z10 && z11) {
                synchronized (p.I()) {
                    this.f9773c = kVar.f();
                    this.f9774d = kVar.j();
                    C6514M m10 = C6514M.f71813a;
                }
            }
            return z10;
        }

        /* JADX INFO: finally extract failed */
        public final int l(I i10, C2057k kVar) {
            N b10;
            int i11;
            int i12;
            z zVar;
            I i13 = i10;
            C2057k kVar2 = kVar;
            synchronized (p.I()) {
                try {
                    b10 = b();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            char c10 = 7;
            if (!b10.g()) {
                return 7;
            }
            C1538b c11 = p1.c();
            int q10 = c11.q();
            if (q10 > 0) {
                Object[] p10 = c11.p();
                int i14 = 0;
                do {
                    ((J) p10[i14]).a(i13);
                    i14++;
                } while (i14 < q10);
            }
            try {
                Object[] objArr = b10.f12107b;
                int[] iArr = b10.f12108c;
                long[] jArr = b10.f12106a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i15 = 7;
                    int i16 = 0;
                    while (true) {
                        long j10 = jArr[i16];
                        if ((((~j10) << c10) & j10 & -9187201950435737472L) != -9187201950435737472L) {
                            int i17 = 8;
                            int i18 = 8 - ((~(i16 - length)) >>> 31);
                            int i19 = 0;
                            while (i19 < i18) {
                                if ((j10 & 255) < 128) {
                                    int i20 = (i16 << 3) + i19;
                                    x xVar = (x) objArr[i20];
                                    if (iArr[i20] == 1) {
                                        if (xVar instanceof H) {
                                            zVar = ((H) xVar).u(kVar2);
                                        } else {
                                            zVar = p.G(xVar.k(), kVar2);
                                        }
                                        i15 = (((i15 * 31) + C1474c.c(zVar)) * 31) + zVar.f();
                                    }
                                    i12 = 8;
                                } else {
                                    i12 = i17;
                                }
                                j10 >>= i12;
                                i19++;
                                i17 = i12;
                            }
                            if (i18 != i17) {
                                break;
                            }
                        }
                        if (i16 == length) {
                            break;
                        }
                        i16++;
                        c10 = 7;
                    }
                    i11 = i15;
                } else {
                    i11 = 7;
                }
                C6514M m10 = C6514M.f71813a;
                int q11 = c11.q();
                if (q11 <= 0) {
                    return i11;
                }
                Object[] p11 = c11.p();
                int i21 = 0;
                do {
                    ((J) p11[i21]).b(i13);
                    i21++;
                } while (i21 < q11);
                return i11;
            } catch (Throwable th3) {
                int q12 = c11.q();
                if (q12 > 0) {
                    Object[] p12 = c11.p();
                    int i22 = 0;
                    do {
                        ((J) p12[i22]).b(i13);
                        i22++;
                    } while (i22 < q12);
                }
                throw th3;
            }
        }

        public void m(N n10) {
            this.f9775e = n10;
        }

        public final void n(Object obj) {
            this.f9776f = obj;
        }

        public final void o(int i10) {
            this.f9777g = i10;
        }

        public final void p(int i10) {
            this.f9773c = i10;
        }

        public final void q(int i10) {
            this.f9774d = i10;
        }
    }

    static final class b extends C6498u implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ H f9778a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ d f9779b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ androidx.collection.H f9780c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ int f9781d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(H h10, d dVar, androidx.collection.H h11, int i10) {
            super(1);
            this.f9778a = h10;
            this.f9779b = dVar;
            this.f9780c = h11;
            this.f9781d = i10;
        }

        public final void a(Object obj) {
            if (obj == this.f9778a) {
                throw new IllegalStateException("A derived state calculation cannot read itself");
            } else if (obj instanceof x) {
                int a10 = this.f9779b.a();
                androidx.collection.H h10 = this.f9780c;
                h10.r(obj, Math.min(a10 - this.f9781d, h10.d(obj, a.e.API_PRIORITY_OTHER)));
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a(obj);
            return C6514M.f71813a;
        }
    }

    public H(C6787a aVar, o1 o1Var) {
        this.f9767b = aVar;
        this.f9768c = o1Var;
    }

    private final a v(a aVar, C2057k kVar, boolean z10, C6787a aVar2) {
        C2057k.a aVar3;
        o1 d10;
        int i10;
        int i11;
        a aVar4 = aVar;
        int i12 = 1;
        if (aVar4.k(this, kVar)) {
            if (z10) {
                C1538b c10 = p1.c();
                int q10 = c10.q();
                if (q10 > 0) {
                    Object[] p10 = c10.p();
                    int i13 = 0;
                    do {
                        ((J) p10[i13]).a(this);
                        i13++;
                    } while (i13 < q10);
                }
                try {
                    N b10 = aVar.b();
                    d dVar = (d) q1.f10109a.a();
                    if (dVar == null) {
                        dVar = new d(0);
                        q1.f10109a.b(dVar);
                    }
                    int a10 = dVar.a();
                    Object[] objArr = b10.f12107b;
                    int[] iArr = b10.f12108c;
                    long[] jArr = b10.f12106a;
                    int length = jArr.length - 2;
                    if (length >= 0) {
                        int i14 = 0;
                        while (true) {
                            long j10 = jArr[i14];
                            long[] jArr2 = jArr;
                            if ((((~j10) << 7) & j10 & -9187201950435737472L) != -9187201950435737472L) {
                                int i15 = 8;
                                int i16 = 8 - ((~(i14 - length)) >>> 31);
                                int i17 = 0;
                                while (i17 < i16) {
                                    if ((j10 & 255) < 128) {
                                        int i18 = (i14 << 3) + i17;
                                        x xVar = (x) objArr[i18];
                                        dVar.b(a10 + iArr[i18]);
                                        C6798l h10 = kVar.h();
                                        if (h10 != null) {
                                            h10.invoke(xVar);
                                        }
                                        i11 = 8;
                                    } else {
                                        i11 = i15;
                                    }
                                    j10 >>= i11;
                                    i17++;
                                    i15 = i11;
                                    i12 = 1;
                                }
                                int i19 = i15;
                                i10 = i12;
                                if (i16 != i19) {
                                    break;
                                }
                            } else {
                                i10 = i12;
                            }
                            if (i14 == length) {
                                break;
                            }
                            i14 += i10;
                            i12 = i10;
                            jArr = jArr2;
                        }
                    }
                    dVar.b(a10);
                    C6514M m10 = C6514M.f71813a;
                    int q11 = c10.q();
                    if (q11 > 0) {
                        Object[] p11 = c10.p();
                        int i20 = 0;
                        do {
                            ((J) p11[i20]).b(this);
                            i20++;
                        } while (i20 < q11);
                    }
                } catch (Throwable th2) {
                    int q12 = c10.q();
                    if (q12 > 0) {
                        Object[] p12 = c10.p();
                        int i21 = 0;
                        do {
                            ((J) p12[i21]).b(this);
                            i21++;
                        } while (i21 < q12);
                    }
                    throw th2;
                }
            }
            return aVar4;
        }
        int i22 = 0;
        androidx.collection.H h11 = new androidx.collection.H(0, 1, (DefaultConstructorMarker) null);
        d dVar2 = (d) q1.f10109a.a();
        if (dVar2 == null) {
            dVar2 = new d(0);
            q1.f10109a.b(dVar2);
        }
        int a11 = dVar2.a();
        C1538b c11 = p1.c();
        int q13 = c11.q();
        if (q13 > 0) {
            Object[] p13 = c11.p();
            int i23 = 0;
            while (true) {
                ((J) p13[i23]).a(this);
                int i24 = i23 + 1;
                if (i24 >= q13) {
                    break;
                }
                i23 = i24;
            }
        }
        try {
            dVar2.b(a11 + 1);
            Object h12 = C2057k.f21728e.h(new b(this, dVar2, h11, a11), (C6798l) null, aVar2);
            dVar2.b(a11);
            int q14 = c11.q();
            if (q14 > 0) {
                Object[] p14 = c11.p();
                do {
                    ((J) p14[i22]).b(this);
                    i22++;
                } while (i22 < q14);
            }
            synchronized (p.I()) {
                try {
                    aVar3 = C2057k.f21728e;
                    C2057k c12 = aVar3.c();
                    if (aVar.j() == a.f9770h.a() || (d10 = d()) == null || !d10.b(h12, aVar.j())) {
                        aVar4 = (a) p.O(this.f9769d, this, c12);
                        aVar4.m(h11);
                        aVar4.o(aVar4.l(this, c12));
                        aVar4.n(h12);
                    } else {
                        aVar4.m(h11);
                        aVar4.o(aVar4.l(this, c12));
                    }
                } catch (Throwable th3) {
                    throw th3;
                }
            }
            d dVar3 = (d) q1.f10109a.a();
            if (dVar3 != null && dVar3.a() == 0) {
                aVar3.g();
                synchronized (p.I()) {
                    C2057k c13 = aVar3.c();
                    aVar4.p(c13.f());
                    aVar4.q(c13.j());
                    C6514M m11 = C6514M.f71813a;
                }
            }
            return aVar4;
        } catch (Throwable th4) {
            int q15 = c11.q();
            if (q15 > 0) {
                Object[] p15 = c11.p();
                do {
                    ((J) p15[i22]).b(this);
                    i22++;
                } while (i22 < q15);
            }
            throw th4;
        }
    }

    private final String w() {
        a aVar = (a) p.F(this.f9769d);
        if (aVar.k(this, C2057k.f21728e.c())) {
            return String.valueOf(aVar.j());
        }
        return "<Not calculated>";
    }

    public o1 d() {
        return this.f9768c;
    }

    public Object getValue() {
        C2057k.a aVar = C2057k.f21728e;
        C6798l h10 = aVar.c().h();
        if (h10 != null) {
            h10.invoke(this);
        }
        C2057k c10 = aVar.c();
        return v((a) p.G(this.f9769d, c10), c10, true, this.f9767b).j();
    }

    public z k() {
        return this.f9769d;
    }

    public void n(z zVar) {
        C6496s.f(zVar, "null cannot be cast to non-null type androidx.compose.runtime.DerivedSnapshotState.ResultRecord<T of androidx.compose.runtime.DerivedSnapshotState>");
        this.f9769d = (a) zVar;
    }

    public I.a p() {
        C2057k c10 = C2057k.f21728e.c();
        return v((a) p.G(this.f9769d, c10), c10, false, this.f9767b);
    }

    public String toString() {
        a aVar = (a) p.F(this.f9769d);
        return "DerivedState(value=" + w() + ")@" + hashCode();
    }

    public final z u(C2057k kVar) {
        return v((a) p.G(this.f9769d, kVar), kVar, false, this.f9767b);
    }
}
