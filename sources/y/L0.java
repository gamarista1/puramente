package Y;

import androidx.collection.H;
import androidx.collection.K;
import androidx.collection.W;
import java.util.List;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.C6498u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lf.C6514M;
import yf.C6798l;
import yf.p;

public final class L0 implements Y0, K0 {

    /* renamed from: h  reason: collision with root package name */
    public static final a f9795h = new a((DefaultConstructorMarker) null);

    /* renamed from: i  reason: collision with root package name */
    public static final int f9796i = 8;

    /* renamed from: a  reason: collision with root package name */
    private int f9797a;

    /* renamed from: b  reason: collision with root package name */
    private N0 f9798b;

    /* renamed from: c  reason: collision with root package name */
    private C1477d f9799c;

    /* renamed from: d  reason: collision with root package name */
    private p f9800d;
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public int f9801e;
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public H f9802f;
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public K f9803g;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void a(C1485f1 f1Var, List list, N0 n02) {
            L0 l02;
            if (!list.isEmpty()) {
                int size = list.size();
                for (int i10 = 0; i10 < size; i10++) {
                    Object Y02 = f1Var.Y0((C1477d) list.get(i10), 0);
                    if (Y02 instanceof L0) {
                        l02 = (L0) Y02;
                    } else {
                        l02 = null;
                    }
                    if (l02 != null) {
                        l02.e(n02);
                    }
                }
            }
        }

        private a() {
        }
    }

    static final class b extends C6498u implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ L0 f9804a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f9805b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ H f9806c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(L0 l02, int i10, H h10) {
            super(1);
            this.f9804a = l02;
            this.f9805b = i10;
            this.f9806c = h10;
        }

        public final void a(C1508q qVar) {
            int i10;
            boolean z10;
            C1508q qVar2 = qVar;
            if (this.f9804a.f9801e == this.f9805b && C6496s.c(this.f9806c, this.f9804a.f9802f) && (qVar2 instanceof C1513t)) {
                H h10 = this.f9806c;
                int i11 = this.f9805b;
                L0 l02 = this.f9804a;
                long[] jArr = h10.f12106a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i12 = 0;
                    while (true) {
                        long j10 = jArr[i12];
                        if ((((~j10) << 7) & j10 & -9187201950435737472L) != -9187201950435737472L) {
                            int i13 = 8;
                            int i14 = 8 - ((~(i12 - length)) >>> 31);
                            int i15 = 0;
                            while (i15 < i14) {
                                if ((255 & j10) < 128) {
                                    int i16 = (i12 << 3) + i15;
                                    Object obj = h10.f12107b[i16];
                                    if (h10.f12108c[i16] != i11) {
                                        z10 = true;
                                    } else {
                                        z10 = false;
                                    }
                                    if (z10) {
                                        C1513t tVar = (C1513t) qVar2;
                                        tVar.K(obj, l02);
                                        if (obj instanceof I) {
                                            tVar.J((I) obj);
                                            K c10 = l02.f9803g;
                                            if (c10 != null) {
                                                c10.o(obj);
                                            }
                                        }
                                    }
                                    if (z10) {
                                        h10.p(i16);
                                    }
                                    i10 = 8;
                                } else {
                                    i10 = i13;
                                }
                                j10 >>= i10;
                                i15++;
                                i13 = i10;
                            }
                            if (i14 != i13) {
                                return;
                            }
                        }
                        if (i12 != length) {
                            i12++;
                        } else {
                            return;
                        }
                    }
                }
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((C1508q) obj);
            return C6514M.f71813a;
        }
    }

    public L0(N0 n02) {
        this.f9798b = n02;
    }

    private final void F(boolean z10) {
        if (z10) {
            this.f9797a |= 32;
        } else {
            this.f9797a &= -33;
        }
    }

    private final void G(boolean z10) {
        if (z10) {
            this.f9797a |= 16;
        } else {
            this.f9797a &= -17;
        }
    }

    private final boolean f(I i10, K k10) {
        C6496s.f(i10, "null cannot be cast to non-null type androidx.compose.runtime.DerivedState<kotlin.Any?>");
        o1 d10 = i10.d();
        if (d10 == null) {
            d10 = p1.q();
        }
        return !d10.b(i10.p().a(), k10.b(i10));
    }

    private final boolean o() {
        if ((this.f9797a & 32) != 0) {
            return true;
        }
        return false;
    }

    public final void A(C1477d dVar) {
        this.f9799c = dVar;
    }

    public final void B(boolean z10) {
        if (z10) {
            this.f9797a |= 2;
        } else {
            this.f9797a &= -3;
        }
    }

    public final void C(boolean z10) {
        if (z10) {
            this.f9797a |= 4;
        } else {
            this.f9797a &= -5;
        }
    }

    public final void D(boolean z10) {
        if (z10) {
            this.f9797a |= 64;
        } else {
            this.f9797a &= -65;
        }
    }

    public final void E(boolean z10) {
        if (z10) {
            this.f9797a |= 8;
        } else {
            this.f9797a &= -9;
        }
    }

    public final void H(boolean z10) {
        if (z10) {
            this.f9797a |= 1;
        } else {
            this.f9797a &= -2;
        }
    }

    public final void I(int i10) {
        this.f9801e = i10;
        G(false);
    }

    public void a(p pVar) {
        this.f9800d = pVar;
    }

    public final void e(N0 n02) {
        this.f9798b = n02;
    }

    public final void g(C1500m mVar) {
        C6514M m10;
        p pVar = this.f9800d;
        if (pVar != null) {
            pVar.invoke(mVar, 1);
            m10 = C6514M.f71813a;
        } else {
            m10 = null;
        }
        if (m10 == null) {
            throw new IllegalStateException("Invalid restart scope");
        }
    }

    public final C6798l h(int i10) {
        int i11 = i10;
        H h10 = this.f9802f;
        if (h10 == null || p()) {
            return null;
        }
        Object[] objArr = h10.f12107b;
        int[] iArr = h10.f12108c;
        long[] jArr = h10.f12106a;
        int length = jArr.length - 2;
        if (length < 0) {
            return null;
        }
        int i12 = 0;
        while (true) {
            long j10 = jArr[i12];
            if ((((~j10) << 7) & j10 & -9187201950435737472L) != -9187201950435737472L) {
                int i13 = 8 - ((~(i12 - length)) >>> 31);
                for (int i14 = 0; i14 < i13; i14++) {
                    if ((255 & j10) < 128) {
                        int i15 = (i12 << 3) + i14;
                        Object obj = objArr[i15];
                        if (iArr[i15] != i11) {
                            return new b(this, i11, h10);
                        }
                    }
                    j10 >>= 8;
                }
                if (i13 != 8) {
                    return null;
                }
            }
            if (i12 == length) {
                return null;
            }
            i12++;
        }
    }

    public final C1477d i() {
        return this.f9799c;
    }

    public void invalidate() {
        N0 n02 = this.f9798b;
        if (n02 != null) {
            n02.n(this, (Object) null);
        }
    }

    public final boolean j() {
        if (this.f9800d != null) {
            return true;
        }
        return false;
    }

    public final boolean k() {
        if ((this.f9797a & 2) != 0) {
            return true;
        }
        return false;
    }

    public final boolean l() {
        if ((this.f9797a & 4) != 0) {
            return true;
        }
        return false;
    }

    public final boolean m() {
        if ((this.f9797a & 64) != 0) {
            return true;
        }
        return false;
    }

    public final boolean n() {
        if ((this.f9797a & 8) != 0) {
            return true;
        }
        return false;
    }

    public final boolean p() {
        if ((this.f9797a & 16) != 0) {
            return true;
        }
        return false;
    }

    public final boolean q() {
        if ((this.f9797a & 1) != 0) {
            return true;
        }
        return false;
    }

    public final boolean r() {
        boolean z10;
        if (this.f9798b == null) {
            return false;
        }
        C1477d dVar = this.f9799c;
        if (dVar != null) {
            z10 = dVar.b();
        } else {
            z10 = false;
        }
        if (z10) {
            return true;
        }
        return false;
    }

    public final Z s(Object obj) {
        Z n10;
        N0 n02 = this.f9798b;
        if (n02 == null || (n10 = n02.n(this, obj)) == null) {
            return Z.IGNORED;
        }
        return n10;
    }

    public final boolean t() {
        if (this.f9803g != null) {
            return true;
        }
        return false;
    }

    public final boolean u(Object obj) {
        K k10;
        Object obj2 = obj;
        if (obj2 == null || (k10 = this.f9803g) == null) {
            return true;
        }
        if (obj2 instanceof I) {
            return f((I) obj2, k10);
        }
        if (!(obj2 instanceof W)) {
            return true;
        }
        W w10 = (W) obj2;
        if (w10.e()) {
            Object[] objArr = w10.f12131b;
            long[] jArr = w10.f12130a;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i10 = 0;
                while (true) {
                    long j10 = jArr[i10];
                    if ((((~j10) << 7) & j10 & -9187201950435737472L) != -9187201950435737472L) {
                        int i11 = 8 - ((~(i10 - length)) >>> 31);
                        for (int i12 = 0; i12 < i11; i12++) {
                            if ((255 & j10) < 128) {
                                Object obj3 = objArr[(i10 << 3) + i12];
                                if (!(obj3 instanceof I) || f((I) obj3, k10)) {
                                    return true;
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
        }
        return false;
    }

    public final void v(I i10, Object obj) {
        K k10 = this.f9803g;
        if (k10 == null) {
            k10 = new K(0, 1, (DefaultConstructorMarker) null);
            this.f9803g = k10;
        }
        k10.r(i10, obj);
    }

    public final boolean w(Object obj) {
        if (o()) {
            return false;
        }
        H h10 = this.f9802f;
        if (h10 == null) {
            h10 = new H(0, 1, (DefaultConstructorMarker) null);
            this.f9802f = h10;
        }
        if (h10.o(obj, this.f9801e, -1) == this.f9801e) {
            return true;
        }
        return false;
    }

    public final void x() {
        N0 n02 = this.f9798b;
        if (n02 != null) {
            n02.f(this);
        }
        this.f9798b = null;
        this.f9802f = null;
        this.f9803g = null;
    }

    public final void y() {
        H h10;
        N0 n02 = this.f9798b;
        if (n02 != null && (h10 = this.f9802f) != null) {
            F(true);
            try {
                Object[] objArr = h10.f12107b;
                int[] iArr = h10.f12108c;
                long[] jArr = h10.f12106a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i10 = 0;
                    while (true) {
                        long j10 = jArr[i10];
                        if ((((~j10) << 7) & j10 & -9187201950435737472L) != -9187201950435737472L) {
                            int i11 = 8 - ((~(i10 - length)) >>> 31);
                            for (int i12 = 0; i12 < i11; i12++) {
                                if ((255 & j10) < 128) {
                                    int i13 = (i10 << 3) + i12;
                                    Object obj = objArr[i13];
                                    int i14 = iArr[i13];
                                    n02.a(obj);
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
            } finally {
                F(false);
            }
        }
    }

    public final void z() {
        G(true);
    }
}
