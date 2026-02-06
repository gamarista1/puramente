package J0;

import H0.C1180a;
import H0.C1197s;
import H0.U;
import H0.V;
import H0.Z;
import H0.a0;
import androidx.collection.G;
import androidx.collection.K;
import androidx.collection.L;
import c1.n;
import java.lang.ref.WeakReference;
import java.util.Map;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.C6498u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lf.C6514M;
import yf.C6787a;
import yf.C6798l;

public abstract class P extends U implements T, W {

    /* renamed from: n  reason: collision with root package name */
    public static final b f3704n = new b((DefaultConstructorMarker) null);

    /* renamed from: o  reason: collision with root package name */
    private static final C6798l f3705o = a.f3714a;

    /* renamed from: f  reason: collision with root package name */
    private a0 f3706f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f3707g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f3708h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f3709i;

    /* renamed from: j  reason: collision with root package name */
    private final U.a f3710j = V.a(this);

    /* renamed from: k  reason: collision with root package name */
    private G f3711k;

    /* renamed from: l  reason: collision with root package name */
    private G f3712l;

    /* renamed from: m  reason: collision with root package name */
    private K f3713m;

    static final class a extends C6498u implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        public static final a f3714a = new a();

        a() {
            super(1);
        }

        public final void a(r0 r0Var) {
            if (r0Var.Y0()) {
                r0Var.a().p1(r0Var);
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((r0) obj);
            return C6514M.f71813a;
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
        }
    }

    static final class c extends C6498u implements C6787a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ r0 f3715a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ P f3716b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(r0 r0Var, P p10) {
            super(0);
            this.f3715a = r0Var;
            this.f3716b = p10;
        }

        public final void invoke() {
            C6798l r10 = this.f3715a.b().r();
            if (r10 != null) {
                r10.invoke(this.f3716b.K1());
            }
        }
    }

    public static final class d implements H0.G {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ int f3717a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f3718b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Map f3719c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C6798l f3720d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ C6798l f3721e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ P f3722f;

        d(int i10, int i11, Map map, C6798l lVar, C6798l lVar2, P p10) {
            this.f3717a = i10;
            this.f3718b = i11;
            this.f3719c = map;
            this.f3720d = lVar;
            this.f3721e = lVar2;
            this.f3722f = p10;
        }

        public int d() {
            return this.f3718b;
        }

        public int e() {
            return this.f3717a;
        }

        public Map p() {
            return this.f3719c;
        }

        public void q() {
            this.f3721e.invoke(this.f3722f.I1());
        }

        public C6798l r() {
            return this.f3720d;
        }
    }

    public static final class e implements a0 {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ P f3723a;

        e(P p10) {
            this.f3723a = p10;
        }

        public float getDensity() {
            return this.f3723a.getDensity();
        }

        public float r1() {
            return this.f3723a.r1();
        }
    }

    private final void M1(Z z10) {
        L l10;
        K k10 = v1(z10).f3713m;
        if (k10 != null) {
            l10 = (L) k10.o(z10);
        } else {
            l10 = null;
        }
        if (l10 != null) {
            Q1(l10);
        }
    }

    private final void Q1(L l10) {
        G g10;
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
                        if ((255 & j10) < 128 && (g10 = (G) ((WeakReference) objArr[(i10 << 3) + i12]).get()) != null) {
                            if (r0()) {
                                g10.p1(false);
                            } else {
                                g10.t1(false);
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
    }

    /* access modifiers changed from: private */
    public final void p1(r0 r0Var) {
        P F12;
        L l10;
        o0 snapshotObserver;
        r0 r0Var2 = r0Var;
        if (!this.f3709i) {
            C6798l r10 = r0Var.b().r();
            K k10 = this.f3713m;
            char c10 = 7;
            long j10 = -9187201950435737472L;
            if (r10 != null) {
                G g10 = this.f3712l;
                if (g10 == null) {
                    g10 = new G(0, 1, (DefaultConstructorMarker) null);
                    this.f3712l = g10;
                }
                G g11 = this.f3711k;
                if (g11 == null) {
                    g11 = new G(0, 1, (DefaultConstructorMarker) null);
                    this.f3711k = g11;
                }
                g10.p(g11);
                g11.i();
                m0 m02 = A1().m0();
                if (!(m02 == null || (snapshotObserver = m02.getSnapshotObserver()) == null)) {
                    snapshotObserver.i(r0Var2, f3705o, new c(r0Var2, this));
                }
                if (k10 != null) {
                    Object[] objArr = g10.f12102b;
                    float[] fArr = g10.f12103c;
                    long[] jArr = g10.f12101a;
                    int length = jArr.length - 2;
                    if (length >= 0) {
                        float[] fArr2 = fArr;
                        int i10 = 0;
                        while (true) {
                            long j11 = jArr[i10];
                            if ((((~j11) << 7) & j11 & j10) != j10) {
                                int i11 = 8 - ((~(i10 - length)) >>> 31);
                                for (int i12 = 0; i12 < i11; i12++) {
                                    if ((j11 & 255) < 128) {
                                        int i13 = (i10 << 3) + i12;
                                        Object obj = objArr[i13];
                                        float f10 = fArr2[i13];
                                        android.support.v4.media.session.c.a(obj);
                                        if (!(g11.e((Object) null, Float.NaN) == f10 || (l10 = (L) k10.o((Object) null)) == null)) {
                                            Q1(l10);
                                        }
                                    }
                                    j11 >>= 8;
                                }
                                if (i11 != 8) {
                                    break;
                                }
                            }
                            if (i10 == length) {
                                break;
                            }
                            i10++;
                            j10 = -9187201950435737472L;
                        }
                    }
                }
                Object[] objArr2 = g11.f12102b;
                long[] jArr2 = g11.f12101a;
                int length2 = jArr2.length - 2;
                if (length2 >= 0) {
                    int i14 = 0;
                    while (true) {
                        long j12 = jArr2[i14];
                        if ((((~j12) << c10) & j12 & -9187201950435737472L) != -9187201950435737472L) {
                            int i15 = 8 - ((~(i14 - length2)) >>> 31);
                            for (int i16 = 0; i16 < i15; i16++) {
                                if ((j12 & 255) < 128) {
                                    android.support.v4.media.session.c.a(objArr2[(i14 << 3) + i16]);
                                    if (!g10.a((Object) null) && (F12 = F1()) != null) {
                                        F12.M1((Z) null);
                                    }
                                }
                                j12 >>= 8;
                            }
                            if (i15 != 8) {
                                break;
                            }
                        }
                        if (i14 == length2) {
                            break;
                        }
                        i14++;
                        c10 = 7;
                    }
                }
                g10.i();
            } else if (k10 != null) {
                Object[] objArr3 = k10.f12125c;
                long[] jArr3 = k10.f12123a;
                int length3 = jArr3.length - 2;
                if (length3 >= 0) {
                    int i17 = 0;
                    while (true) {
                        long j13 = jArr3[i17];
                        if ((((~j13) << 7) & j13 & -9187201950435737472L) != -9187201950435737472L) {
                            int i18 = 8 - ((~(i17 - length3)) >>> 31);
                            for (int i19 = 0; i19 < i18; i19++) {
                                if ((j13 & 255) < 128) {
                                    Q1((L) objArr3[(i17 << 3) + i19]);
                                }
                                j13 >>= 8;
                            }
                            if (i18 != 8) {
                                break;
                            }
                        }
                        if (i17 == length3) {
                            break;
                        }
                        i17++;
                    }
                }
                k10.h();
            }
        }
    }

    private final P v1(Z z10) {
        P F12;
        P p10 = this;
        while (true) {
            G g10 = p10.f3711k;
            if ((g10 != null && g10.a(z10)) || (F12 = p10.F1()) == null) {
                return p10;
            }
            p10 = F12;
        }
    }

    public abstract G A1();

    public abstract C1197s C1();

    public void D0(boolean z10) {
        this.f3707g = z10;
    }

    public abstract boolean D1();

    public abstract H0.G E1();

    public abstract P F1();

    public final U.a I1() {
        return this.f3710j;
    }

    public abstract long J1();

    public final a0 K1() {
        a0 a0Var = this.f3706f;
        if (a0Var == null) {
            return new e(this);
        }
        return a0Var;
    }

    /* access modifiers changed from: protected */
    public final void L1(C1235c0 c0Var) {
        G g10;
        C1230a p10;
        C1235c0 E22 = c0Var.E2();
        if (E22 != null) {
            g10 = E22.A1();
        } else {
            g10 = null;
        }
        if (!C6496s.c(g10, c0Var.A1())) {
            c0Var.u2().p().m();
            return;
        }
        C1232b D10 = c0Var.u2().D();
        if (D10 != null && (p10 = D10.p()) != null) {
            p10.m();
        }
    }

    public boolean N1() {
        return this.f3707g;
    }

    public final boolean O1() {
        return this.f3709i;
    }

    public final boolean P1() {
        return this.f3708h;
    }

    public abstract void R1();

    public final void S1(boolean z10) {
        this.f3709i = z10;
    }

    public final void T1(boolean z10) {
        this.f3708h = z10;
    }

    public H0.G i0(int i10, int i11, Map map, C6798l lVar, C6798l lVar2) {
        boolean z10;
        if ((i10 & -16777216) == 0 && (-16777216 & i11) == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            G0.a.b("Size(" + i10 + " x " + i11 + ") is out of range. Each dimension must be between 0 and 16777215.");
        }
        return new d(i10, i11, map, lVar, lVar2, this);
    }

    public final int k0(C1180a aVar) {
        int n12;
        if (D1() && (n12 = n1(aVar)) != Integer.MIN_VALUE) {
            return n12 + n.k(Q0());
        }
        return Integer.MIN_VALUE;
    }

    public abstract int n1(C1180a aVar);

    public final void q1(H0.G g10) {
        if (g10 != null) {
            p1(new r0(g10, this));
            return;
        }
        K k10 = this.f3713m;
        if (k10 != null) {
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
                                Q1((L) objArr[(i10 << 3) + i12]);
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
        }
        K k11 = this.f3713m;
        if (k11 != null) {
            k11.h();
        }
        G g11 = this.f3711k;
        if (g11 != null) {
            g11.i();
        }
    }

    public boolean r0() {
        return false;
    }

    public abstract P z1();
}
