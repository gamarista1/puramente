package ga;

import N9.C3070t;
import N9.T;
import P9.n;
import P9.o;
import com.google.common.collect.B;
import com.google.common.collect.C4770v;
import com.google.common.collect.D;
import com.google.common.collect.I;
import ga.r;
import ia.C3607e;
import ja.C3648d;
import ja.M;
import ja.s;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import k9.C3717q0;
import k9.n1;

/* renamed from: ga.a  reason: case insensitive filesystem */
public class C3564a extends c {

    /* renamed from: h  reason: collision with root package name */
    private final C3607e f43763h;

    /* renamed from: i  reason: collision with root package name */
    private final long f43764i;

    /* renamed from: j  reason: collision with root package name */
    private final long f43765j;

    /* renamed from: k  reason: collision with root package name */
    private final long f43766k;

    /* renamed from: l  reason: collision with root package name */
    private final int f43767l;

    /* renamed from: m  reason: collision with root package name */
    private final int f43768m;

    /* renamed from: n  reason: collision with root package name */
    private final float f43769n;

    /* renamed from: o  reason: collision with root package name */
    private final float f43770o;

    /* renamed from: p  reason: collision with root package name */
    private final C4770v f43771p;

    /* renamed from: q  reason: collision with root package name */
    private final C3648d f43772q;

    /* renamed from: r  reason: collision with root package name */
    private float f43773r;

    /* renamed from: s  reason: collision with root package name */
    private int f43774s;

    /* renamed from: t  reason: collision with root package name */
    private int f43775t;

    /* renamed from: u  reason: collision with root package name */
    private long f43776u;

    /* renamed from: v  reason: collision with root package name */
    private n f43777v;

    /* renamed from: ga.a$a  reason: collision with other inner class name */
    public static final class C0673a {

        /* renamed from: a  reason: collision with root package name */
        public final long f43778a;

        /* renamed from: b  reason: collision with root package name */
        public final long f43779b;

        public C0673a(long j10, long j11) {
            this.f43778a = j10;
            this.f43779b = j11;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0673a)) {
                return false;
            }
            C0673a aVar = (C0673a) obj;
            if (this.f43778a == aVar.f43778a && this.f43779b == aVar.f43779b) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return (((int) this.f43778a) * 31) + ((int) this.f43779b);
        }
    }

    /* renamed from: ga.a$b */
    public static class b implements r.b {

        /* renamed from: a  reason: collision with root package name */
        private final int f43780a;

        /* renamed from: b  reason: collision with root package name */
        private final int f43781b;

        /* renamed from: c  reason: collision with root package name */
        private final int f43782c;

        /* renamed from: d  reason: collision with root package name */
        private final int f43783d;

        /* renamed from: e  reason: collision with root package name */
        private final int f43784e;

        /* renamed from: f  reason: collision with root package name */
        private final float f43785f;

        /* renamed from: g  reason: collision with root package name */
        private final float f43786g;

        /* renamed from: h  reason: collision with root package name */
        private final C3648d f43787h;

        public b() {
            this(10000, 25000, 25000, 0.7f);
        }

        public final r[] a(r.a[] aVarArr, C3607e eVar, C3070t.b bVar, n1 n1Var) {
            r rVar;
            C4770v v10 = C3564a.z(aVarArr);
            r[] rVarArr = new r[aVarArr.length];
            for (int i10 = 0; i10 < aVarArr.length; i10++) {
                r.a aVar = aVarArr[i10];
                if (aVar != null) {
                    int[] iArr = aVar.f43903b;
                    if (iArr.length != 0) {
                        if (iArr.length == 1) {
                            rVar = new s(aVar.f43902a, iArr[0], aVar.f43904c);
                        } else {
                            rVar = b(aVar.f43902a, iArr, aVar.f43904c, eVar, (C4770v) v10.get(i10));
                        }
                        rVarArr[i10] = rVar;
                    }
                }
            }
            return rVarArr;
        }

        /* access modifiers changed from: protected */
        public C3564a b(T t10, int[] iArr, int i10, C3607e eVar, C4770v vVar) {
            return new C3564a(t10, iArr, i10, eVar, (long) this.f43780a, (long) this.f43781b, (long) this.f43782c, this.f43783d, this.f43784e, this.f43785f, this.f43786g, vVar, this.f43787h);
        }

        public b(int i10, int i11, int i12, float f10) {
            this(i10, i11, i12, 1279, 719, f10, 0.75f, C3648d.f44997a);
        }

        public b(int i10, int i11, int i12, int i13, int i14, float f10, float f11, C3648d dVar) {
            this.f43780a = i10;
            this.f43781b = i11;
            this.f43782c = i12;
            this.f43783d = i13;
            this.f43784e = i14;
            this.f43785f = f10;
            this.f43786g = f11;
            this.f43787h = dVar;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    protected C3564a(T t10, int[] iArr, int i10, C3607e eVar, long j10, long j11, long j12, int i11, int i12, float f10, float f11, List list, C3648d dVar) {
        super(t10, iArr, i10);
        C3607e eVar2;
        long j13;
        if (j12 < j10) {
            s.i("AdaptiveTrackSelection", "Adjusting minDurationToRetainAfterDiscardMs to be at least minDurationForQualityIncreaseMs");
            eVar2 = eVar;
            j13 = j10;
        } else {
            eVar2 = eVar;
            j13 = j12;
        }
        this.f43763h = eVar2;
        this.f43764i = j10 * 1000;
        this.f43765j = j11 * 1000;
        this.f43766k = j13 * 1000;
        this.f43767l = i11;
        this.f43768m = i12;
        this.f43769n = f10;
        this.f43770o = f11;
        this.f43771p = C4770v.z(list);
        this.f43772q = dVar;
        this.f43773r = 1.0f;
        this.f43775t = 0;
        this.f43776u = -9223372036854775807L;
    }

    private long A(long j10) {
        long G10 = G(j10);
        if (this.f43771p.isEmpty()) {
            return G10;
        }
        int i10 = 1;
        while (i10 < this.f43771p.size() - 1 && ((C0673a) this.f43771p.get(i10)).f43778a < G10) {
            i10++;
        }
        C0673a aVar = (C0673a) this.f43771p.get(i10 - 1);
        C0673a aVar2 = (C0673a) this.f43771p.get(i10);
        long j11 = aVar.f43778a;
        long j12 = aVar.f43779b;
        return j12 + ((long) ((((float) (G10 - j11)) / ((float) (aVar2.f43778a - j11))) * ((float) (aVar2.f43779b - j12))));
    }

    private long B(List list) {
        if (list.isEmpty()) {
            return -9223372036854775807L;
        }
        n nVar = (n) B.d(list);
        long j10 = nVar.f33606g;
        if (j10 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        long j11 = nVar.f33607h;
        if (j11 != -9223372036854775807L) {
            return j11 - j10;
        }
        return -9223372036854775807L;
    }

    private long D(o[] oVarArr, List list) {
        int i10 = this.f43774s;
        if (i10 >= oVarArr.length || !oVarArr[i10].next()) {
            for (o oVar : oVarArr) {
                if (oVar.next()) {
                    return oVar.b() - oVar.a();
                }
            }
            return B(list);
        }
        o oVar2 = oVarArr[this.f43774s];
        return oVar2.b() - oVar2.a();
    }

    private static long[][] E(r.a[] aVarArr) {
        long[][] jArr = new long[aVarArr.length][];
        for (int i10 = 0; i10 < aVarArr.length; i10++) {
            r.a aVar = aVarArr[i10];
            if (aVar == null) {
                jArr[i10] = new long[0];
            } else {
                jArr[i10] = new long[aVar.f43903b.length];
                int i11 = 0;
                while (true) {
                    int[] iArr = aVar.f43903b;
                    if (i11 >= iArr.length) {
                        break;
                    }
                    jArr[i10][i11] = (long) aVar.f43902a.b(iArr[i11]).f45766h;
                    i11++;
                }
                Arrays.sort(jArr[i10]);
            }
        }
        return jArr;
    }

    private static C4770v F(long[][] jArr) {
        double d10;
        D e10 = I.c().a().e();
        for (int i10 = 0; i10 < jArr.length; i10++) {
            long[] jArr2 = jArr[i10];
            if (jArr2.length > 1) {
                int length = jArr2.length;
                double[] dArr = new double[length];
                int i11 = 0;
                while (true) {
                    long[] jArr3 = jArr[i10];
                    double d11 = 0.0d;
                    if (i11 >= jArr3.length) {
                        break;
                    }
                    long j10 = jArr3[i11];
                    if (j10 != -1) {
                        d11 = Math.log((double) j10);
                    }
                    dArr[i11] = d11;
                    i11++;
                }
                int i12 = length - 1;
                double d12 = dArr[i12] - dArr[0];
                int i13 = 0;
                while (i13 < i12) {
                    double d13 = dArr[i13];
                    i13++;
                    double d14 = (d13 + dArr[i13]) * 0.5d;
                    if (d12 == 0.0d) {
                        d10 = 1.0d;
                    } else {
                        d10 = (d14 - dArr[0]) / d12;
                    }
                    e10.put(Double.valueOf(d10), Integer.valueOf(i10));
                }
            }
        }
        return C4770v.z(e10.values());
    }

    private long G(long j10) {
        long f10 = (long) (((float) this.f43763h.f()) * this.f43769n);
        long c10 = this.f43763h.c();
        if (c10 == -9223372036854775807L || j10 == -9223372036854775807L) {
            return (long) (((float) f10) / this.f43773r);
        }
        float f11 = (float) j10;
        return (long) ((((float) f10) * Math.max((f11 / this.f43773r) - ((float) c10), 0.0f)) / f11);
    }

    private long H(long j10, long j11) {
        if (j10 == -9223372036854775807L) {
            return this.f43764i;
        }
        if (j11 != -9223372036854775807L) {
            j10 -= j11;
        }
        return Math.min((long) (((float) j10) * this.f43770o), this.f43764i);
    }

    private static void w(List list, long[] jArr) {
        long j10 = 0;
        for (long j11 : jArr) {
            j10 += j11;
        }
        for (int i10 = 0; i10 < list.size(); i10++) {
            C4770v.a aVar = (C4770v.a) list.get(i10);
            if (aVar != null) {
                aVar.a(new C0673a(j10, jArr[i10]));
            }
        }
    }

    private int y(long j10, long j11) {
        long A10 = A(j11);
        int i10 = 0;
        for (int i11 = 0; i11 < this.f43789b; i11++) {
            if (j10 == Long.MIN_VALUE || !p(i11, j10)) {
                C3717q0 b10 = b(i11);
                if (x(b10, b10.f45766h, A10)) {
                    return i11;
                }
                i10 = i11;
            }
        }
        return i10;
    }

    /* access modifiers changed from: private */
    public static C4770v z(r.a[] aVarArr) {
        C4770v vVar;
        long j10;
        ArrayList arrayList = new ArrayList();
        for (r.a aVar : aVarArr) {
            if (aVar == null || aVar.f43903b.length <= 1) {
                arrayList.add((Object) null);
            } else {
                C4770v.a t10 = C4770v.t();
                t10.a(new C0673a(0, 0));
                arrayList.add(t10);
            }
        }
        long[][] E10 = E(aVarArr);
        int[] iArr = new int[E10.length];
        long[] jArr = new long[E10.length];
        for (int i10 = 0; i10 < E10.length; i10++) {
            long[] jArr2 = E10[i10];
            if (jArr2.length == 0) {
                j10 = 0;
            } else {
                j10 = jArr2[0];
            }
            jArr[i10] = j10;
        }
        w(arrayList, jArr);
        C4770v F10 = F(E10);
        for (int i11 = 0; i11 < F10.size(); i11++) {
            int intValue = ((Integer) F10.get(i11)).intValue();
            int i12 = iArr[intValue] + 1;
            iArr[intValue] = i12;
            jArr[intValue] = E10[intValue][i12];
            w(arrayList, jArr);
        }
        for (int i13 = 0; i13 < aVarArr.length; i13++) {
            if (arrayList.get(i13) != null) {
                jArr[i13] = jArr[i13] * 2;
            }
        }
        w(arrayList, jArr);
        C4770v.a t11 = C4770v.t();
        for (int i14 = 0; i14 < arrayList.size(); i14++) {
            C4770v.a aVar2 = (C4770v.a) arrayList.get(i14);
            if (aVar2 == null) {
                vVar = C4770v.E();
            } else {
                vVar = aVar2.k();
            }
            t11.a(vVar);
        }
        return t11.k();
    }

    /* access modifiers changed from: protected */
    public long C() {
        return this.f43766k;
    }

    /* access modifiers changed from: protected */
    public boolean I(long j10, List list) {
        long j11 = this.f43776u;
        if (j11 == -9223372036854775807L || j10 - j11 >= 1000 || (!list.isEmpty() && !((n) B.d(list)).equals(this.f43777v))) {
            return true;
        }
        return false;
    }

    public int a() {
        return this.f43774s;
    }

    public void d(float f10) {
        this.f43773r = f10;
    }

    public void disable() {
        this.f43777v = null;
    }

    public void enable() {
        this.f43776u = -9223372036854775807L;
        this.f43777v = null;
    }

    public void m(long j10, long j11, long j12, List list, o[] oVarArr) {
        int i10;
        long a10 = this.f43772q.a();
        long D10 = D(oVarArr, list);
        int i11 = this.f43775t;
        if (i11 == 0) {
            this.f43775t = 1;
            this.f43774s = y(a10, D10);
            return;
        }
        int i12 = this.f43774s;
        if (list.isEmpty()) {
            i10 = -1;
        } else {
            i10 = l(((n) B.d(list)).f33603d);
        }
        if (i10 != -1) {
            i11 = ((n) B.d(list)).f33604e;
            i12 = i10;
        }
        int y10 = y(a10, D10);
        if (!p(i12, a10)) {
            C3717q0 b10 = b(i12);
            C3717q0 b11 = b(y10);
            long H10 = H(j12, D10);
            int i13 = b11.f45766h;
            int i14 = b10.f45766h;
            if ((i13 > i14 && j11 < H10) || (i13 < i14 && j11 >= this.f43765j)) {
                y10 = i12;
            }
        }
        if (y10 != i12) {
            i11 = 3;
        }
        this.f43775t = i11;
        this.f43774s = y10;
    }

    public Object q() {
        return null;
    }

    public int r(long j10, List list) {
        n nVar;
        int i10;
        int i11;
        long a10 = this.f43772q.a();
        if (!I(a10, list)) {
            return list.size();
        }
        this.f43776u = a10;
        if (list.isEmpty()) {
            nVar = null;
        } else {
            nVar = (n) B.d(list);
        }
        this.f43777v = nVar;
        if (list.isEmpty()) {
            return 0;
        }
        int size = list.size();
        long f02 = M.f0(((n) list.get(size - 1)).f33606g - j10, this.f43773r);
        long C10 = C();
        if (f02 < C10) {
            return size;
        }
        C3717q0 b10 = b(y(a10, B(list)));
        for (int i12 = 0; i12 < size; i12++) {
            n nVar2 = (n) list.get(i12);
            C3717q0 q0Var = nVar2.f33603d;
            if (M.f0(nVar2.f33606g - j10, this.f43773r) >= C10 && q0Var.f45766h < b10.f45766h && (i10 = q0Var.f45776r) != -1 && i10 <= this.f43768m && (i11 = q0Var.f45775q) != -1 && i11 <= this.f43767l && i10 < b10.f45776r) {
                return i12;
            }
        }
        return size;
    }

    public int s() {
        return this.f43775t;
    }

    /* access modifiers changed from: protected */
    public boolean x(C3717q0 q0Var, int i10, long j10) {
        if (((long) i10) <= j10) {
            return true;
        }
        return false;
    }
}
