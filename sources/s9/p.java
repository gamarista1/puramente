package S9;

import D9.a;
import I9.l;
import N9.A;
import N9.C3065n;
import N9.C3068q;
import N9.L;
import N9.N;
import N9.T;
import N9.V;
import S9.f;
import android.net.Uri;
import android.os.Handler;
import android.util.SparseIntArray;
import com.google.common.collect.C4770v;
import ga.z;
import ia.A;
import ia.B;
import ia.C3604b;
import ia.C3610h;
import ia.y;
import ja.C3645a;
import ja.M;
import ja.s;
import ja.w;
import java.io.EOFException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import k9.C3717q0;
import k9.C3718r0;
import k9.L0;
import k9.e1;
import n9.C3871g;
import o9.u;
import o9.v;
import q9.C3962B;
import q9.j;
import q9.m;

final class p implements B.b, B.f, N, m, L.d {

    /* renamed from: r0  reason: collision with root package name */
    private static final Set f34064r0 = Collections.unmodifiableSet(new HashSet(Arrays.asList(new Integer[]{1, 2, 5})));

    /* renamed from: A  reason: collision with root package name */
    private int f34065A;

    /* renamed from: B  reason: collision with root package name */
    private int f34066B;

    /* renamed from: C  reason: collision with root package name */
    private boolean f34067C;

    /* renamed from: D  reason: collision with root package name */
    private boolean f34068D;

    /* renamed from: E  reason: collision with root package name */
    private int f34069E;

    /* renamed from: F  reason: collision with root package name */
    private C3717q0 f34070F;

    /* renamed from: G  reason: collision with root package name */
    private C3717q0 f34071G;

    /* renamed from: H  reason: collision with root package name */
    private boolean f34072H;

    /* renamed from: I  reason: collision with root package name */
    private V f34073I;

    /* renamed from: X  reason: collision with root package name */
    private Set f34074X;

    /* renamed from: Y  reason: collision with root package name */
    private int[] f34075Y;

    /* renamed from: Z  reason: collision with root package name */
    private int f34076Z;

    /* renamed from: a  reason: collision with root package name */
    private final String f34077a;

    /* renamed from: b  reason: collision with root package name */
    private final int f34078b;

    /* renamed from: c  reason: collision with root package name */
    private final b f34079c;

    /* renamed from: d  reason: collision with root package name */
    private final f f34080d;

    /* renamed from: e  reason: collision with root package name */
    private final C3604b f34081e;

    /* renamed from: f  reason: collision with root package name */
    private final C3717q0 f34082f;

    /* renamed from: f0  reason: collision with root package name */
    private boolean f34083f0;

    /* renamed from: g  reason: collision with root package name */
    private final v f34084g;

    /* renamed from: g0  reason: collision with root package name */
    private boolean[] f34085g0;

    /* renamed from: h  reason: collision with root package name */
    private final u.a f34086h;

    /* renamed from: h0  reason: collision with root package name */
    private boolean[] f34087h0;

    /* renamed from: i  reason: collision with root package name */
    private final A f34088i;

    /* renamed from: i0  reason: collision with root package name */
    private long f34089i0;

    /* renamed from: j  reason: collision with root package name */
    private final B f34090j = new B("Loader:HlsSampleStreamWrapper");

    /* renamed from: j0  reason: collision with root package name */
    private long f34091j0;

    /* renamed from: k  reason: collision with root package name */
    private final A.a f34092k;

    /* renamed from: k0  reason: collision with root package name */
    private boolean f34093k0;

    /* renamed from: l  reason: collision with root package name */
    private final int f34094l;

    /* renamed from: l0  reason: collision with root package name */
    private boolean f34095l0;

    /* renamed from: m  reason: collision with root package name */
    private final f.b f34096m = new f.b();

    /* renamed from: m0  reason: collision with root package name */
    private boolean f34097m0;

    /* renamed from: n  reason: collision with root package name */
    private final ArrayList f34098n;

    /* renamed from: n0  reason: collision with root package name */
    private boolean f34099n0;

    /* renamed from: o  reason: collision with root package name */
    private final List f34100o;

    /* renamed from: o0  reason: collision with root package name */
    private long f34101o0;

    /* renamed from: p  reason: collision with root package name */
    private final Runnable f34102p;

    /* renamed from: p0  reason: collision with root package name */
    private o9.m f34103p0;

    /* renamed from: q  reason: collision with root package name */
    private final Runnable f34104q;

    /* renamed from: q0  reason: collision with root package name */
    private i f34105q0;

    /* renamed from: r  reason: collision with root package name */
    private final Handler f34106r;

    /* renamed from: s  reason: collision with root package name */
    private final ArrayList f34107s;

    /* renamed from: t  reason: collision with root package name */
    private final Map f34108t;

    /* renamed from: u  reason: collision with root package name */
    private P9.f f34109u;

    /* renamed from: v  reason: collision with root package name */
    private d[] f34110v;

    /* renamed from: w  reason: collision with root package name */
    private int[] f34111w = new int[0];

    /* renamed from: x  reason: collision with root package name */
    private Set f34112x;

    /* renamed from: y  reason: collision with root package name */
    private SparseIntArray f34113y;

    /* renamed from: z  reason: collision with root package name */
    private C3962B f34114z;

    public interface b extends N.a {
        void d();

        void q(Uri uri);
    }

    private static class c implements C3962B {

        /* renamed from: g  reason: collision with root package name */
        private static final C3717q0 f34115g = new C3717q0.b().e0("application/id3").E();

        /* renamed from: h  reason: collision with root package name */
        private static final C3717q0 f34116h = new C3717q0.b().e0("application/x-emsg").E();

        /* renamed from: a  reason: collision with root package name */
        private final F9.b f34117a = new F9.b();

        /* renamed from: b  reason: collision with root package name */
        private final C3962B f34118b;

        /* renamed from: c  reason: collision with root package name */
        private final C3717q0 f34119c;

        /* renamed from: d  reason: collision with root package name */
        private C3717q0 f34120d;

        /* renamed from: e  reason: collision with root package name */
        private byte[] f34121e;

        /* renamed from: f  reason: collision with root package name */
        private int f34122f;

        public c(C3962B b10, int i10) {
            this.f34118b = b10;
            if (i10 == 1) {
                this.f34119c = f34115g;
            } else if (i10 == 3) {
                this.f34119c = f34116h;
            } else {
                throw new IllegalArgumentException("Unknown metadataType: " + i10);
            }
            this.f34121e = new byte[0];
            this.f34122f = 0;
        }

        private boolean g(F9.a aVar) {
            C3717q0 m10 = aVar.m();
            if (m10 == null || !M.c(this.f34119c.f45770l, m10.f45770l)) {
                return false;
            }
            return true;
        }

        private void h(int i10) {
            byte[] bArr = this.f34121e;
            if (bArr.length < i10) {
                this.f34121e = Arrays.copyOf(bArr, i10 + (i10 / 2));
            }
        }

        private ja.B i(int i10, int i11) {
            int i12 = this.f34122f - i11;
            ja.B b10 = new ja.B(Arrays.copyOfRange(this.f34121e, i12 - i10, i12));
            byte[] bArr = this.f34121e;
            System.arraycopy(bArr, i12, bArr, 0, i11);
            this.f34122f = i11;
            return b10;
        }

        public void b(ja.B b10, int i10, int i11) {
            h(this.f34122f + i10);
            b10.j(this.f34121e, this.f34122f, i10);
            this.f34122f += i10;
        }

        public void c(C3717q0 q0Var) {
            this.f34120d = q0Var;
            this.f34118b.c(this.f34119c);
        }

        public int e(C3610h hVar, int i10, boolean z10, int i11) {
            h(this.f34122f + i10);
            int read = hVar.read(this.f34121e, this.f34122f, i10);
            if (read != -1) {
                this.f34122f += read;
                return read;
            } else if (z10) {
                return -1;
            } else {
                throw new EOFException();
            }
        }

        public void f(long j10, int i10, int i11, int i12, C3962B.a aVar) {
            C3645a.e(this.f34120d);
            ja.B i13 = i(i11, i12);
            if (!M.c(this.f34120d.f45770l, this.f34119c.f45770l)) {
                if ("application/x-emsg".equals(this.f34120d.f45770l)) {
                    F9.a c10 = this.f34117a.c(i13);
                    if (!g(c10)) {
                        s.i("HlsSampleStreamWrapper", String.format("Ignoring EMSG. Expected it to contain wrapped %s but actual wrapped format: %s", new Object[]{this.f34119c.f45770l, c10.m()}));
                        return;
                    }
                    i13 = new ja.B((byte[]) C3645a.e(c10.t()));
                } else {
                    s.i("HlsSampleStreamWrapper", "Ignoring sample for unsupported format: " + this.f34120d.f45770l);
                    return;
                }
            }
            int a10 = i13.a();
            this.f34118b.d(i13, a10);
            this.f34118b.f(j10, i10, a10, i12, aVar);
        }
    }

    private static final class d extends L {

        /* renamed from: H  reason: collision with root package name */
        private final Map f34123H;

        /* renamed from: I  reason: collision with root package name */
        private o9.m f34124I;

        private D9.a h0(D9.a aVar) {
            int i10;
            if (aVar == null) {
                return null;
            }
            int d10 = aVar.d();
            int i11 = 0;
            while (true) {
                if (i11 >= d10) {
                    i11 = -1;
                    break;
                }
                a.b c10 = aVar.c(i11);
                if ((c10 instanceof l) && "com.apple.streaming.transportStreamTimestamp".equals(((l) c10).f31819b)) {
                    break;
                }
                i11++;
            }
            if (i11 == -1) {
                return aVar;
            }
            if (d10 == 1) {
                return null;
            }
            a.b[] bVarArr = new a.b[(d10 - 1)];
            for (int i12 = 0; i12 < d10; i12++) {
                if (i12 != i11) {
                    if (i12 < i11) {
                        i10 = i12;
                    } else {
                        i10 = i12 - 1;
                    }
                    bVarArr[i10] = aVar.c(i12);
                }
            }
            return new D9.a(bVarArr);
        }

        public void f(long j10, int i10, int i11, int i12, C3962B.a aVar) {
            super.f(j10, i10, i11, i12, aVar);
        }

        public void i0(o9.m mVar) {
            this.f34124I = mVar;
            I();
        }

        public void j0(i iVar) {
            f0(iVar.f34018k);
        }

        public C3717q0 w(C3717q0 q0Var) {
            o9.m mVar;
            o9.m mVar2 = this.f34124I;
            if (mVar2 == null) {
                mVar2 = q0Var.f45773o;
            }
            if (!(mVar2 == null || (mVar = (o9.m) this.f34123H.get(mVar2.f47520c)) == null)) {
                mVar2 = mVar;
            }
            D9.a h02 = h0(q0Var.f45768j);
            if (!(mVar2 == q0Var.f45773o && h02 == q0Var.f45768j)) {
                q0Var = q0Var.b().M(mVar2).X(h02).E();
            }
            return super.w(q0Var);
        }

        private d(C3604b bVar, v vVar, u.a aVar, Map map) {
            super(bVar, vVar, aVar);
            this.f34123H = map;
        }
    }

    public p(String str, int i10, b bVar, f fVar, Map map, C3604b bVar2, long j10, C3717q0 q0Var, v vVar, u.a aVar, ia.A a10, A.a aVar2, int i11) {
        this.f34077a = str;
        this.f34078b = i10;
        this.f34079c = bVar;
        this.f34080d = fVar;
        this.f34108t = map;
        this.f34081e = bVar2;
        this.f34082f = q0Var;
        this.f34084g = vVar;
        this.f34086h = aVar;
        this.f34088i = a10;
        this.f34092k = aVar2;
        this.f34094l = i11;
        Set set = f34064r0;
        this.f34112x = new HashSet(set.size());
        this.f34113y = new SparseIntArray(set.size());
        this.f34110v = new d[0];
        this.f34087h0 = new boolean[0];
        this.f34085g0 = new boolean[0];
        ArrayList arrayList = new ArrayList();
        this.f34098n = arrayList;
        this.f34100o = Collections.unmodifiableList(arrayList);
        this.f34107s = new ArrayList();
        this.f34102p = new n(this);
        this.f34104q = new o(this);
        this.f34106r = M.w();
        this.f34089i0 = j10;
        this.f34091j0 = j10;
    }

    private boolean A(int i10) {
        for (int i11 = i10; i11 < this.f34098n.size(); i11++) {
            if (((i) this.f34098n.get(i11)).f34021n) {
                return false;
            }
        }
        i iVar = (i) this.f34098n.get(i10);
        for (int i12 = 0; i12 < this.f34110v.length; i12++) {
            if (this.f34110v[i12].C() > iVar.m(i12)) {
                return false;
            }
        }
        return true;
    }

    private static j C(int i10, int i11) {
        s.i("HlsSampleStreamWrapper", "Unmapped track with id " + i10 + " of type " + i11);
        return new j();
    }

    private L D(int i10, int i11) {
        int length = this.f34110v.length;
        boolean z10 = true;
        if (!(i11 == 1 || i11 == 2)) {
            z10 = false;
        }
        d dVar = new d(this.f34081e, this.f34084g, this.f34086h, this.f34108t);
        dVar.b0(this.f34089i0);
        if (z10) {
            dVar.i0(this.f34103p0);
        }
        dVar.a0(this.f34101o0);
        i iVar = this.f34105q0;
        if (iVar != null) {
            dVar.j0(iVar);
        }
        dVar.d0(this);
        int i12 = length + 1;
        int[] copyOf = Arrays.copyOf(this.f34111w, i12);
        this.f34111w = copyOf;
        copyOf[length] = i10;
        this.f34110v = (d[]) M.F0(this.f34110v, dVar);
        boolean[] copyOf2 = Arrays.copyOf(this.f34087h0, i12);
        this.f34087h0 = copyOf2;
        copyOf2[length] = z10;
        this.f34083f0 |= z10;
        this.f34112x.add(Integer.valueOf(i11));
        this.f34113y.append(i11, length);
        if (M(i11) > M(this.f34065A)) {
            this.f34066B = length;
            this.f34065A = i11;
        }
        this.f34085g0 = Arrays.copyOf(this.f34085g0, i12);
        return dVar;
    }

    private V E(T[] tArr) {
        for (int i10 = 0; i10 < tArr.length; i10++) {
            T t10 = tArr[i10];
            C3717q0[] q0VarArr = new C3717q0[t10.f33189a];
            for (int i11 = 0; i11 < t10.f33189a; i11++) {
                C3717q0 b10 = t10.b(i11);
                q0VarArr[i11] = b10.c(this.f34084g.d(b10));
            }
            tArr[i10] = new T(t10.f33190b, q0VarArr);
        }
        return new V(tArr);
    }

    private static C3717q0 F(C3717q0 q0Var, C3717q0 q0Var2, boolean z10) {
        String str;
        String str2;
        int i10;
        int i11;
        if (q0Var == null) {
            return q0Var2;
        }
        int k10 = w.k(q0Var2.f45770l);
        if (M.K(q0Var.f45767i, k10) == 1) {
            str2 = M.L(q0Var.f45767i, k10);
            str = w.g(str2);
        } else {
            str2 = w.d(q0Var.f45767i, q0Var2.f45770l);
            str = q0Var2.f45770l;
        }
        C3717q0.b c02 = q0Var2.b().S(q0Var.f45759a).U(q0Var.f45760b).V(q0Var.f45761c).g0(q0Var.f45762d).c0(q0Var.f45763e);
        if (z10) {
            i10 = q0Var.f45764f;
        } else {
            i10 = -1;
        }
        C3717q0.b G10 = c02.G(i10);
        if (z10) {
            i11 = q0Var.f45765g;
        } else {
            i11 = -1;
        }
        C3717q0.b I10 = G10.Z(i11).I(str2);
        if (k10 == 2) {
            I10.j0(q0Var.f45775q).Q(q0Var.f45776r).P(q0Var.f45777s);
        }
        if (str != null) {
            I10.e0(str);
        }
        int i12 = q0Var.f45783y;
        if (i12 != -1 && k10 == 1) {
            I10.H(i12);
        }
        D9.a aVar = q0Var.f45768j;
        if (aVar != null) {
            D9.a aVar2 = q0Var2.f45768j;
            if (aVar2 != null) {
                aVar = aVar2.b(aVar);
            }
            I10.X(aVar);
        }
        return I10.E();
    }

    private void G(int i10) {
        C3645a.f(!this.f34090j.j());
        while (true) {
            if (i10 >= this.f34098n.size()) {
                i10 = -1;
                break;
            } else if (A(i10)) {
                break;
            } else {
                i10++;
            }
        }
        if (i10 != -1) {
            long j10 = K().f33607h;
            i H10 = H(i10);
            if (this.f34098n.isEmpty()) {
                this.f34091j0 = this.f34089i0;
            } else {
                ((i) com.google.common.collect.B.d(this.f34098n)).o();
            }
            this.f34097m0 = false;
            this.f34092k.D(this.f34065A, H10.f33606g, j10);
        }
    }

    private i H(int i10) {
        i iVar = (i) this.f34098n.get(i10);
        ArrayList arrayList = this.f34098n;
        M.N0(arrayList, i10, arrayList.size());
        for (int i11 = 0; i11 < this.f34110v.length; i11++) {
            this.f34110v[i11].u(iVar.m(i11));
        }
        return iVar;
    }

    private boolean I(i iVar) {
        int i10 = iVar.f34018k;
        int length = this.f34110v.length;
        for (int i11 = 0; i11 < length; i11++) {
            if (this.f34085g0[i11] && this.f34110v[i11].Q() == i10) {
                return false;
            }
        }
        return true;
    }

    private static boolean J(C3717q0 q0Var, C3717q0 q0Var2) {
        String str = q0Var.f45770l;
        String str2 = q0Var2.f45770l;
        int k10 = w.k(str);
        if (k10 != 3) {
            if (k10 == w.k(str2)) {
                return true;
            }
            return false;
        } else if (!M.c(str, str2)) {
            return false;
        } else {
            if (!"application/cea-608".equals(str) && !"application/cea-708".equals(str)) {
                return true;
            }
            if (q0Var.f45756D == q0Var2.f45756D) {
                return true;
            }
            return false;
        }
    }

    private i K() {
        ArrayList arrayList = this.f34098n;
        return (i) arrayList.get(arrayList.size() - 1);
    }

    private C3962B L(int i10, int i11) {
        C3645a.a(f34064r0.contains(Integer.valueOf(i11)));
        int i12 = this.f34113y.get(i11, -1);
        if (i12 == -1) {
            return null;
        }
        if (this.f34112x.add(Integer.valueOf(i11))) {
            this.f34111w[i12] = i10;
        }
        if (this.f34111w[i12] == i10) {
            return this.f34110v[i12];
        }
        return C(i10, i11);
    }

    private static int M(int i10) {
        if (i10 == 1) {
            return 2;
        }
        if (i10 == 2) {
            return 3;
        }
        if (i10 != 3) {
            return 0;
        }
        return 1;
    }

    private void N(i iVar) {
        this.f34105q0 = iVar;
        this.f34070F = iVar.f33603d;
        this.f34091j0 = -9223372036854775807L;
        this.f34098n.add(iVar);
        C4770v.a t10 = C4770v.t();
        for (d G10 : this.f34110v) {
            t10.a(Integer.valueOf(G10.G()));
        }
        iVar.n(this, t10.k());
        for (d dVar : this.f34110v) {
            dVar.j0(iVar);
            if (iVar.f34021n) {
                dVar.g0();
            }
        }
    }

    private static boolean O(P9.f fVar) {
        return fVar instanceof i;
    }

    private boolean P() {
        if (this.f34091j0 != -9223372036854775807L) {
            return true;
        }
        return false;
    }

    private void S() {
        int i10 = this.f34073I.f33196a;
        int[] iArr = new int[i10];
        this.f34075Y = iArr;
        Arrays.fill(iArr, -1);
        for (int i11 = 0; i11 < i10; i11++) {
            int i12 = 0;
            while (true) {
                d[] dVarArr = this.f34110v;
                if (i12 >= dVarArr.length) {
                    break;
                } else if (J((C3717q0) C3645a.h(dVarArr[i12].F()), this.f34073I.b(i11).b(0))) {
                    this.f34075Y[i11] = i12;
                    break;
                } else {
                    i12++;
                }
            }
        }
        Iterator it = this.f34107s.iterator();
        while (it.hasNext()) {
            ((l) it.next()).a();
        }
    }

    /* access modifiers changed from: private */
    public void T() {
        if (!this.f34072H && this.f34075Y == null && this.f34067C) {
            d[] dVarArr = this.f34110v;
            int length = dVarArr.length;
            int i10 = 0;
            while (i10 < length) {
                if (dVarArr[i10].F() != null) {
                    i10++;
                } else {
                    return;
                }
            }
            if (this.f34073I != null) {
                S();
                return;
            }
            z();
            l0();
            this.f34079c.d();
        }
    }

    /* access modifiers changed from: private */
    public void c0() {
        this.f34067C = true;
        T();
    }

    private void g0() {
        for (d W10 : this.f34110v) {
            W10.W(this.f34093k0);
        }
        this.f34093k0 = false;
    }

    private boolean h0(long j10) {
        int length = this.f34110v.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (!this.f34110v[i10].Z(j10, false) && (this.f34087h0[i10] || !this.f34083f0)) {
                return false;
            }
        }
        return true;
    }

    private void l0() {
        this.f34068D = true;
    }

    private void q0(N9.M[] mArr) {
        this.f34107s.clear();
        for (l lVar : mArr) {
            if (lVar != null) {
                this.f34107s.add(lVar);
            }
        }
    }

    private void x() {
        C3645a.f(this.f34068D);
        C3645a.e(this.f34073I);
        C3645a.e(this.f34074X);
    }

    private void z() {
        C3717q0 q0Var;
        int i10;
        C3717q0 q0Var2;
        C3717q0 q0Var3;
        int length = this.f34110v.length;
        boolean z10 = false;
        int i11 = -2;
        int i12 = -1;
        int i13 = 0;
        while (true) {
            int i14 = 2;
            if (i13 >= length) {
                break;
            }
            String str = ((C3717q0) C3645a.h(this.f34110v[i13].F())).f45770l;
            if (!w.s(str)) {
                if (w.o(str)) {
                    i14 = 1;
                } else if (w.r(str)) {
                    i14 = 3;
                } else {
                    i14 = -2;
                }
            }
            if (M(i14) > M(i11)) {
                i12 = i13;
                i11 = i14;
            } else if (i14 == i11 && i12 != -1) {
                i12 = -1;
            }
            i13++;
        }
        T j10 = this.f34080d.j();
        int i15 = j10.f33189a;
        this.f34076Z = -1;
        this.f34075Y = new int[length];
        for (int i16 = 0; i16 < length; i16++) {
            this.f34075Y[i16] = i16;
        }
        T[] tArr = new T[length];
        for (int i17 = 0; i17 < length; i17++) {
            C3717q0 q0Var4 = (C3717q0) C3645a.h(this.f34110v[i17].F());
            if (i17 == i12) {
                C3717q0[] q0VarArr = new C3717q0[i15];
                for (int i18 = 0; i18 < i15; i18++) {
                    C3717q0 b10 = j10.b(i18);
                    if (i11 == 1 && (q0Var3 = this.f34082f) != null) {
                        b10 = b10.j(q0Var3);
                    }
                    if (i15 == 1) {
                        q0Var2 = q0Var4.j(b10);
                    } else {
                        q0Var2 = F(b10, q0Var4, true);
                    }
                    q0VarArr[i18] = q0Var2;
                }
                tArr[i17] = new T(this.f34077a, q0VarArr);
                this.f34076Z = i17;
            } else {
                if (i11 != 2 || !w.o(q0Var4.f45770l)) {
                    q0Var = null;
                } else {
                    q0Var = this.f34082f;
                }
                StringBuilder sb2 = new StringBuilder();
                sb2.append(this.f34077a);
                sb2.append(":muxed:");
                if (i17 < i12) {
                    i10 = i17;
                } else {
                    i10 = i17 - 1;
                }
                sb2.append(i10);
                tArr[i17] = new T(sb2.toString(), F(q0Var, q0Var4, false));
            }
        }
        this.f34073I = E(tArr);
        if (this.f34074X == null) {
            z10 = true;
        }
        C3645a.f(z10);
        this.f34074X = Collections.emptySet();
    }

    public void B() {
        if (!this.f34068D) {
            m(this.f34089i0);
        }
    }

    public boolean Q(int i10) {
        if (P() || !this.f34110v[i10].K(this.f34097m0)) {
            return false;
        }
        return true;
    }

    public boolean R() {
        if (this.f34065A == 2) {
            return true;
        }
        return false;
    }

    public void U() {
        this.f34090j.e();
        this.f34080d.n();
    }

    public void V(int i10) {
        U();
        this.f34110v[i10].N();
    }

    /* renamed from: W */
    public void t(P9.f fVar, long j10, long j11, boolean z10) {
        P9.f fVar2 = fVar;
        this.f34109u = null;
        C3065n nVar = new C3065n(fVar2.f33600a, fVar2.f33601b, fVar.f(), fVar.e(), j10, j11, fVar.c());
        this.f34088i.b(fVar2.f33600a);
        this.f34092k.r(nVar, fVar2.f33602c, this.f34078b, fVar2.f33603d, fVar2.f33604e, fVar2.f33605f, fVar2.f33606g, fVar2.f33607h);
        if (!z10) {
            if (P() || this.f34069E == 0) {
                g0();
            }
            if (this.f34069E > 0) {
                this.f34079c.p(this);
            }
        }
    }

    /* renamed from: X */
    public void p(P9.f fVar, long j10, long j11) {
        P9.f fVar2 = fVar;
        this.f34109u = null;
        this.f34080d.p(fVar2);
        C3065n nVar = new C3065n(fVar2.f33600a, fVar2.f33601b, fVar.f(), fVar.e(), j10, j11, fVar.c());
        this.f34088i.b(fVar2.f33600a);
        this.f34092k.u(nVar, fVar2.f33602c, this.f34078b, fVar2.f33603d, fVar2.f33604e, fVar2.f33605f, fVar2.f33606g, fVar2.f33607h);
        if (!this.f34068D) {
            m(this.f34089i0);
        } else {
            this.f34079c.p(this);
        }
    }

    /* renamed from: Y */
    public B.c u(P9.f fVar, long j10, long j11, IOException iOException, int i10) {
        boolean z10;
        B.c cVar;
        int i11;
        P9.f fVar2 = fVar;
        IOException iOException2 = iOException;
        boolean O10 = O(fVar);
        if (O10 && !((i) fVar2).q() && (iOException2 instanceof y.f) && ((i11 = ((y.f) iOException2).f44562d) == 410 || i11 == 404)) {
            return B.f44362d;
        }
        long c10 = fVar.c();
        C3065n nVar = new C3065n(fVar2.f33600a, fVar2.f33601b, fVar.f(), fVar.e(), j10, j11, c10);
        A.c cVar2 = new A.c(nVar, new C3068q(fVar2.f33602c, this.f34078b, fVar2.f33603d, fVar2.f33604e, fVar2.f33605f, M.Z0(fVar2.f33606g), M.Z0(fVar2.f33607h)), iOException2, i10);
        A.b d10 = this.f34088i.d(z.c(this.f34080d.k()), cVar2);
        boolean z11 = false;
        if (d10 == null || d10.f44356a != 2) {
            z10 = false;
        } else {
            z10 = this.f34080d.m(fVar2, d10.f44357b);
        }
        if (z10) {
            if (O10 && c10 == 0) {
                ArrayList arrayList = this.f34098n;
                if (((i) arrayList.remove(arrayList.size() - 1)) == fVar2) {
                    z11 = true;
                }
                C3645a.f(z11);
                if (this.f34098n.isEmpty()) {
                    this.f34091j0 = this.f34089i0;
                } else {
                    ((i) com.google.common.collect.B.d(this.f34098n)).o();
                }
            }
            cVar = B.f44364f;
        } else {
            long c11 = this.f34088i.c(cVar2);
            if (c11 != -9223372036854775807L) {
                cVar = B.h(false, c11);
            } else {
                cVar = B.f44365g;
            }
        }
        B.c cVar3 = cVar;
        boolean c12 = cVar3.c();
        this.f34092k.w(nVar, fVar2.f33602c, this.f34078b, fVar2.f33603d, fVar2.f33604e, fVar2.f33605f, fVar2.f33606g, fVar2.f33607h, iOException, !c12);
        if (!c12) {
            this.f34109u = null;
            this.f34088i.b(fVar2.f33600a);
        }
        if (z10) {
            if (!this.f34068D) {
                m(this.f34089i0);
            } else {
                this.f34079c.p(this);
            }
        }
        return cVar3;
    }

    public void Z() {
        this.f34112x.clear();
    }

    public long a() {
        if (P()) {
            return this.f34091j0;
        }
        if (this.f34097m0) {
            return Long.MIN_VALUE;
        }
        return K().f33607h;
    }

    public boolean a0(Uri uri, A.c cVar, boolean z10) {
        long j10;
        A.b d10;
        if (!this.f34080d.o(uri)) {
            return true;
        }
        if (z10 || (d10 = this.f34088i.d(z.c(this.f34080d.k()), cVar)) == null || d10.f44356a != 2) {
            j10 = -9223372036854775807L;
        } else {
            j10 = d10.f44357b;
        }
        if (!this.f34080d.q(uri, j10) || j10 == -9223372036854775807L) {
            return false;
        }
        return true;
    }

    public boolean b() {
        return this.f34090j.j();
    }

    public void b0() {
        if (!this.f34098n.isEmpty()) {
            i iVar = (i) com.google.common.collect.B.d(this.f34098n);
            int c10 = this.f34080d.c(iVar);
            if (c10 == 1) {
                iVar.v();
            } else if (c10 == 2 && !this.f34097m0 && this.f34090j.j()) {
                this.f34090j.f();
            }
        }
    }

    public long c() {
        if (this.f34097m0) {
            return Long.MIN_VALUE;
        }
        if (P()) {
            return this.f34091j0;
        }
        long j10 = this.f34089i0;
        i K10 = K();
        if (!K10.h()) {
            if (this.f34098n.size() > 1) {
                ArrayList arrayList = this.f34098n;
                K10 = (i) arrayList.get(arrayList.size() - 2);
            } else {
                K10 = null;
            }
        }
        if (K10 != null) {
            j10 = Math.max(j10, K10.f33607h);
        }
        if (this.f34067C) {
            for (d z10 : this.f34110v) {
                j10 = Math.max(j10, z10.z());
            }
        }
        return j10;
    }

    public C3962B d(int i10, int i11) {
        C3962B b10;
        if (!f34064r0.contains(Integer.valueOf(i11))) {
            int i12 = 0;
            while (true) {
                C3962B[] bArr = this.f34110v;
                if (i12 >= bArr.length) {
                    b10 = null;
                    break;
                } else if (this.f34111w[i12] == i10) {
                    b10 = bArr[i12];
                    break;
                } else {
                    i12++;
                }
            }
        } else {
            b10 = L(i10, i11);
        }
        if (b10 == null) {
            if (this.f34099n0) {
                return C(i10, i11);
            }
            b10 = D(i10, i11);
        }
        if (i11 != 5) {
            return b10;
        }
        if (this.f34114z == null) {
            this.f34114z = new c(b10, this.f34094l);
        }
        return this.f34114z;
    }

    public void d0(T[] tArr, int i10, int... iArr) {
        this.f34073I = E(tArr);
        this.f34074X = new HashSet();
        for (int b10 : iArr) {
            this.f34074X.add(this.f34073I.b(b10));
        }
        this.f34076Z = i10;
        Handler handler = this.f34106r;
        b bVar = this.f34079c;
        Objects.requireNonNull(bVar);
        handler.post(new m(bVar));
        l0();
    }

    public void e(C3717q0 q0Var) {
        this.f34106r.post(this.f34102p);
    }

    public int e0(int i10, C3718r0 r0Var, C3871g gVar, int i11) {
        C3717q0 q0Var;
        if (P()) {
            return -3;
        }
        int i12 = 0;
        if (!this.f34098n.isEmpty()) {
            int i13 = 0;
            while (i13 < this.f34098n.size() - 1 && I((i) this.f34098n.get(i13))) {
                i13++;
            }
            M.N0(this.f34098n, 0, i13);
            i iVar = (i) this.f34098n.get(0);
            C3717q0 q0Var2 = iVar.f33603d;
            if (!q0Var2.equals(this.f34071G)) {
                this.f34092k.i(this.f34078b, q0Var2, iVar.f33604e, iVar.f33605f, iVar.f33606g);
            }
            this.f34071G = q0Var2;
        }
        if (!this.f34098n.isEmpty() && !((i) this.f34098n.get(0)).q()) {
            return -3;
        }
        int S10 = this.f34110v[i10].S(r0Var, gVar, i11, this.f34097m0);
        if (S10 == -5) {
            C3717q0 q0Var3 = (C3717q0) C3645a.e(r0Var.f45824b);
            if (i10 == this.f34066B) {
                int Q10 = this.f34110v[i10].Q();
                while (i12 < this.f34098n.size() && ((i) this.f34098n.get(i12)).f34018k != Q10) {
                    i12++;
                }
                if (i12 < this.f34098n.size()) {
                    q0Var = ((i) this.f34098n.get(i12)).f33603d;
                } else {
                    q0Var = (C3717q0) C3645a.e(this.f34070F);
                }
                q0Var3 = q0Var3.j(q0Var);
            }
            r0Var.f45824b = q0Var3;
        }
        return S10;
    }

    public void f(long j10) {
        if (!this.f34090j.i() && !P()) {
            if (this.f34090j.j()) {
                C3645a.e(this.f34109u);
                if (this.f34080d.v(j10, this.f34109u, this.f34100o)) {
                    this.f34090j.f();
                    return;
                }
                return;
            }
            int size = this.f34100o.size();
            while (size > 0 && this.f34080d.c((i) this.f34100o.get(size - 1)) == 2) {
                size--;
            }
            if (size < this.f34100o.size()) {
                G(size);
            }
            int h10 = this.f34080d.h(j10, this.f34100o);
            if (h10 < this.f34098n.size()) {
                G(h10);
            }
        }
    }

    public void f0() {
        if (this.f34068D) {
            for (d R10 : this.f34110v) {
                R10.R();
            }
        }
        this.f34090j.m(this);
        this.f34106r.removeCallbacksAndMessages((Object) null);
        this.f34072H = true;
        this.f34107s.clear();
    }

    public void i() {
        for (d T10 : this.f34110v) {
            T10.T();
        }
    }

    public boolean i0(long j10, boolean z10) {
        this.f34089i0 = j10;
        if (P()) {
            this.f34091j0 = j10;
            return true;
        }
        if (this.f34067C && !z10 && h0(j10)) {
            return false;
        }
        this.f34091j0 = j10;
        this.f34097m0 = false;
        this.f34098n.clear();
        if (this.f34090j.j()) {
            if (this.f34067C) {
                for (d r10 : this.f34110v) {
                    r10.r();
                }
            }
            this.f34090j.f();
        } else {
            this.f34090j.g();
            g0();
        }
        return true;
    }

    public void j() {
        U();
        if (this.f34097m0 && !this.f34068D) {
            throw L0.a("Loading finished before preparation is complete.", (Throwable) null);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v6, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v3, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v13, resolved type: java.lang.Object[]} */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x011a, code lost:
        if (r18.i() != r0.f34080d.j().c(r1.f33603d)) goto L_0x011c;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x0126  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean j0(ga.r[] r20, boolean[] r21, N9.M[] r22, boolean[] r23, long r24, boolean r26) {
        /*
            r19 = this;
            r0 = r19
            r1 = r20
            r2 = r22
            r12 = r24
            r19.x()
            int r3 = r0.f34069E
            r14 = 0
            r4 = r14
        L_0x000f:
            int r5 = r1.length
            r6 = 0
            r15 = 1
            if (r4 >= r5) goto L_0x002f
            r5 = r2[r4]
            S9.l r5 = (S9.l) r5
            if (r5 == 0) goto L_0x002c
            r7 = r1[r4]
            if (r7 == 0) goto L_0x0022
            boolean r7 = r21[r4]
            if (r7 != 0) goto L_0x002c
        L_0x0022:
            int r7 = r0.f34069E
            int r7 = r7 - r15
            r0.f34069E = r7
            r5.c()
            r2[r4] = r6
        L_0x002c:
            int r4 = r4 + 1
            goto L_0x000f
        L_0x002f:
            if (r26 != 0) goto L_0x0041
            boolean r4 = r0.f34095l0
            if (r4 == 0) goto L_0x0038
            if (r3 != 0) goto L_0x003f
            goto L_0x0041
        L_0x0038:
            long r3 = r0.f34089i0
            int r3 = (r12 > r3 ? 1 : (r12 == r3 ? 0 : -1))
            if (r3 == 0) goto L_0x003f
            goto L_0x0041
        L_0x003f:
            r3 = r14
            goto L_0x0042
        L_0x0041:
            r3 = r15
        L_0x0042:
            S9.f r4 = r0.f34080d
            ga.r r4 = r4.k()
            r16 = r3
            r11 = r4
            r3 = r14
        L_0x004c:
            int r5 = r1.length
            if (r3 >= r5) goto L_0x009f
            r5 = r1[r3]
            if (r5 != 0) goto L_0x0054
            goto L_0x009c
        L_0x0054:
            N9.V r7 = r0.f34073I
            N9.T r8 = r5.g()
            int r7 = r7.c(r8)
            int r8 = r0.f34076Z
            if (r7 != r8) goto L_0x0068
            S9.f r8 = r0.f34080d
            r8.u(r5)
            r11 = r5
        L_0x0068:
            r5 = r2[r3]
            if (r5 != 0) goto L_0x009c
            int r5 = r0.f34069E
            int r5 = r5 + r15
            r0.f34069E = r5
            S9.l r5 = new S9.l
            r5.<init>(r0, r7)
            r2[r3] = r5
            r23[r3] = r15
            int[] r8 = r0.f34075Y
            if (r8 == 0) goto L_0x009c
            r5.a()
            if (r16 != 0) goto L_0x009c
            S9.p$d[] r5 = r0.f34110v
            int[] r8 = r0.f34075Y
            r7 = r8[r7]
            r5 = r5[r7]
            boolean r7 = r5.Z(r12, r15)
            if (r7 != 0) goto L_0x0099
            int r5 = r5.C()
            if (r5 == 0) goto L_0x0099
            r5 = r15
            goto L_0x009a
        L_0x0099:
            r5 = r14
        L_0x009a:
            r16 = r5
        L_0x009c:
            int r3 = r3 + 1
            goto L_0x004c
        L_0x009f:
            int r1 = r0.f34069E
            if (r1 != 0) goto L_0x00d5
            S9.f r1 = r0.f34080d
            r1.r()
            r0.f34071G = r6
            r0.f34093k0 = r15
            java.util.ArrayList r1 = r0.f34098n
            r1.clear()
            ia.B r1 = r0.f34090j
            boolean r1 = r1.j()
            if (r1 == 0) goto L_0x00d1
            boolean r1 = r0.f34067C
            if (r1 == 0) goto L_0x00ca
            S9.p$d[] r1 = r0.f34110v
            int r3 = r1.length
        L_0x00c0:
            if (r14 >= r3) goto L_0x00ca
            r4 = r1[r14]
            r4.r()
            int r14 = r14 + 1
            goto L_0x00c0
        L_0x00ca:
            ia.B r1 = r0.f34090j
            r1.f()
            goto L_0x0135
        L_0x00d1:
            r19.g0()
            goto L_0x0135
        L_0x00d5:
            java.util.ArrayList r1 = r0.f34098n
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L_0x0122
            boolean r1 = ja.M.c(r11, r4)
            if (r1 != 0) goto L_0x0122
            boolean r1 = r0.f34095l0
            if (r1 != 0) goto L_0x011c
            r3 = 0
            int r1 = (r12 > r3 ? 1 : (r12 == r3 ? 0 : -1))
            if (r1 >= 0) goto L_0x00ee
            long r3 = -r12
        L_0x00ee:
            r6 = r3
            S9.i r1 = r19.K()
            S9.f r3 = r0.f34080d
            P9.o[] r17 = r3.a(r1, r12)
            r8 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            java.util.List r10 = r0.f34100o
            r3 = r11
            r4 = r24
            r18 = r11
            r11 = r17
            r3.m(r4, r6, r8, r10, r11)
            S9.f r3 = r0.f34080d
            N9.T r3 = r3.j()
            k9.q0 r1 = r1.f33603d
            int r1 = r3.c(r1)
            int r3 = r18.i()
            if (r3 == r1) goto L_0x0122
        L_0x011c:
            r0.f34093k0 = r15
            r1 = r15
            r16 = r1
            goto L_0x0124
        L_0x0122:
            r1 = r26
        L_0x0124:
            if (r16 == 0) goto L_0x0135
            r0.i0(r12, r1)
        L_0x0129:
            int r1 = r2.length
            if (r14 >= r1) goto L_0x0135
            r1 = r2[r14]
            if (r1 == 0) goto L_0x0132
            r23[r14] = r15
        L_0x0132:
            int r14 = r14 + 1
            goto L_0x0129
        L_0x0135:
            r0.q0(r2)
            r0.f34095l0 = r15
            return r16
        */
        throw new UnsupportedOperationException("Method not decompiled: S9.p.j0(ga.r[], boolean[], N9.M[], boolean[], long, boolean):boolean");
    }

    public void k() {
        this.f34099n0 = true;
        this.f34106r.post(this.f34104q);
    }

    public void k0(o9.m mVar) {
        if (!M.c(this.f34103p0, mVar)) {
            this.f34103p0 = mVar;
            int i10 = 0;
            while (true) {
                d[] dVarArr = this.f34110v;
                if (i10 < dVarArr.length) {
                    if (this.f34087h0[i10]) {
                        dVarArr[i10].i0(mVar);
                    }
                    i10++;
                } else {
                    return;
                }
            }
        }
    }

    public long l(long j10, e1 e1Var) {
        return this.f34080d.b(j10, e1Var);
    }

    public boolean m(long j10) {
        List list;
        long max;
        boolean z10;
        if (this.f34097m0 || this.f34090j.j() || this.f34090j.i()) {
            return false;
        }
        if (P()) {
            list = Collections.emptyList();
            max = this.f34091j0;
            for (d b02 : this.f34110v) {
                b02.b0(this.f34091j0);
            }
        } else {
            list = this.f34100o;
            i K10 = K();
            if (K10.h()) {
                max = K10.f33607h;
            } else {
                max = Math.max(this.f34089i0, K10.f33606g);
            }
        }
        List list2 = list;
        long j11 = max;
        this.f34096m.a();
        f fVar = this.f34080d;
        if (this.f34068D || !list2.isEmpty()) {
            z10 = true;
        } else {
            z10 = false;
        }
        fVar.e(j10, j11, list2, z10, this.f34096m);
        f.b bVar = this.f34096m;
        boolean z11 = bVar.f33994b;
        P9.f fVar2 = bVar.f33993a;
        Uri uri = bVar.f33995c;
        if (z11) {
            this.f34091j0 = -9223372036854775807L;
            this.f34097m0 = true;
            return true;
        } else if (fVar2 == null) {
            if (uri != null) {
                this.f34079c.q(uri);
            }
            return false;
        } else {
            if (O(fVar2)) {
                N((i) fVar2);
            }
            this.f34109u = fVar2;
            this.f34092k.A(new C3065n(fVar2.f33600a, fVar2.f33601b, this.f34090j.n(fVar2, this, this.f34088i.a(fVar2.f33602c))), fVar2.f33602c, this.f34078b, fVar2.f33603d, fVar2.f33604e, fVar2.f33605f, fVar2.f33606g, fVar2.f33607h);
            return true;
        }
    }

    public void m0(boolean z10) {
        this.f34080d.t(z10);
    }

    public V n() {
        x();
        return this.f34073I;
    }

    public void n0(long j10) {
        if (this.f34101o0 != j10) {
            this.f34101o0 = j10;
            for (d a02 : this.f34110v) {
                a02.a0(j10);
            }
        }
    }

    public void o(long j10, boolean z10) {
        if (this.f34067C && !P()) {
            int length = this.f34110v.length;
            for (int i10 = 0; i10 < length; i10++) {
                this.f34110v[i10].q(j10, z10, this.f34085g0[i10]);
            }
        }
    }

    public int o0(int i10, long j10) {
        if (P()) {
            return 0;
        }
        d dVar = this.f34110v[i10];
        int E10 = dVar.E(j10, this.f34097m0);
        i iVar = (i) com.google.common.collect.B.e(this.f34098n, (Object) null);
        if (iVar != null && !iVar.q()) {
            E10 = Math.min(E10, iVar.m(i10) - dVar.C());
        }
        dVar.e0(E10);
        return E10;
    }

    public void p0(int i10) {
        x();
        C3645a.e(this.f34075Y);
        int i11 = this.f34075Y[i10];
        C3645a.f(this.f34085g0[i11]);
        this.f34085g0[i11] = false;
    }

    public int y(int i10) {
        x();
        C3645a.e(this.f34075Y);
        int i11 = this.f34075Y[i10];
        if (i11 != -1) {
            boolean[] zArr = this.f34085g0;
            if (zArr[i11]) {
                return -2;
            }
            zArr[i11] = true;
            return i11;
        } else if (this.f34074X.contains(this.f34073I.b(i10))) {
            return -3;
        } else {
            return -2;
        }
    }

    public void q(q9.z zVar) {
    }
}
