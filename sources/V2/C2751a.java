package v2;

import com.google.common.collect.C4770v;
import com.google.common.collect.D;
import f2.H;
import f2.I;
import i2.C2078c;
import i2.p;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import t2.C2615C;
import v2.x;
import w2.C2822d;

/* renamed from: v2.a  reason: case insensitive filesystem */
public class C2751a extends C2753c {

    /* renamed from: h  reason: collision with root package name */
    private final C2822d f26970h;

    /* renamed from: i  reason: collision with root package name */
    private final long f26971i;

    /* renamed from: j  reason: collision with root package name */
    private final long f26972j;

    /* renamed from: k  reason: collision with root package name */
    private final long f26973k;

    /* renamed from: l  reason: collision with root package name */
    private final int f26974l;

    /* renamed from: m  reason: collision with root package name */
    private final int f26975m;

    /* renamed from: n  reason: collision with root package name */
    private final float f26976n;

    /* renamed from: o  reason: collision with root package name */
    private final float f26977o;

    /* renamed from: p  reason: collision with root package name */
    private final C4770v f26978p;

    /* renamed from: q  reason: collision with root package name */
    private final C2078c f26979q;

    /* renamed from: r  reason: collision with root package name */
    private float f26980r;

    /* renamed from: s  reason: collision with root package name */
    private int f26981s;

    /* renamed from: t  reason: collision with root package name */
    private int f26982t;

    /* renamed from: u  reason: collision with root package name */
    private long f26983u;

    /* renamed from: v  reason: collision with root package name */
    private long f26984v;

    /* renamed from: v2.a$a  reason: collision with other inner class name */
    public static final class C0450a {

        /* renamed from: a  reason: collision with root package name */
        public final long f26985a;

        /* renamed from: b  reason: collision with root package name */
        public final long f26986b;

        public C0450a(long j10, long j11) {
            this.f26985a = j10;
            this.f26986b = j11;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0450a)) {
                return false;
            }
            C0450a aVar = (C0450a) obj;
            if (this.f26985a == aVar.f26985a && this.f26986b == aVar.f26986b) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return (((int) this.f26985a) * 31) + ((int) this.f26986b);
        }
    }

    /* renamed from: v2.a$b */
    public static class b implements x.b {

        /* renamed from: a  reason: collision with root package name */
        private final int f26987a;

        /* renamed from: b  reason: collision with root package name */
        private final int f26988b;

        /* renamed from: c  reason: collision with root package name */
        private final int f26989c;

        /* renamed from: d  reason: collision with root package name */
        private final int f26990d;

        /* renamed from: e  reason: collision with root package name */
        private final int f26991e;

        /* renamed from: f  reason: collision with root package name */
        private final float f26992f;

        /* renamed from: g  reason: collision with root package name */
        private final float f26993g;

        /* renamed from: h  reason: collision with root package name */
        private final C2078c f26994h;

        public b() {
            this(10000, 25000, 25000, 0.7f);
        }

        public final x[] a(x.a[] aVarArr, C2822d dVar, C2615C.b bVar, H h10) {
            x xVar;
            C4770v n10 = C2751a.p(aVarArr);
            x[] xVarArr = new x[aVarArr.length];
            for (int i10 = 0; i10 < aVarArr.length; i10++) {
                x.a aVar = aVarArr[i10];
                if (aVar != null) {
                    int[] iArr = aVar.f27133b;
                    if (iArr.length != 0) {
                        if (iArr.length == 1) {
                            xVar = new y(aVar.f27132a, iArr[0], aVar.f27134c);
                        } else {
                            xVar = b(aVar.f27132a, iArr, aVar.f27134c, dVar, (C4770v) n10.get(i10));
                        }
                        xVarArr[i10] = xVar;
                    }
                }
            }
            return xVarArr;
        }

        /* access modifiers changed from: protected */
        public C2751a b(I i10, int[] iArr, int i11, C2822d dVar, C4770v vVar) {
            return new C2751a(i10, iArr, i11, dVar, (long) this.f26987a, (long) this.f26988b, (long) this.f26989c, this.f26990d, this.f26991e, this.f26992f, this.f26993g, vVar, this.f26994h);
        }

        public b(int i10, int i11, int i12, float f10) {
            this(i10, i11, i12, 1279, 719, f10, 0.75f, C2078c.f22089a);
        }

        public b(int i10, int i11, int i12, int i13, int i14, float f10, float f11, C2078c cVar) {
            this.f26987a = i10;
            this.f26988b = i11;
            this.f26989c = i12;
            this.f26990d = i13;
            this.f26991e = i14;
            this.f26992f = f10;
            this.f26993g = f11;
            this.f26994h = cVar;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    protected C2751a(I i10, int[] iArr, int i11, C2822d dVar, long j10, long j11, long j12, int i12, int i13, float f10, float f11, List list, C2078c cVar) {
        super(i10, iArr, i11);
        C2822d dVar2;
        long j13;
        if (j12 < j10) {
            p.h("AdaptiveTrackSelection", "Adjusting minDurationToRetainAfterDiscardMs to be at least minDurationForQualityIncreaseMs");
            dVar2 = dVar;
            j13 = j10;
        } else {
            dVar2 = dVar;
            j13 = j12;
        }
        this.f26970h = dVar2;
        this.f26971i = j10 * 1000;
        this.f26972j = j11 * 1000;
        this.f26973k = j13 * 1000;
        this.f26974l = i12;
        this.f26975m = i13;
        this.f26976n = f10;
        this.f26977o = f11;
        this.f26978p = C4770v.z(list);
        this.f26979q = cVar;
        this.f26980r = 1.0f;
        this.f26982t = 0;
        this.f26983u = -9223372036854775807L;
        this.f26984v = -2147483647L;
    }

    private static void o(List list, long[] jArr) {
        long j10 = 0;
        for (long j11 : jArr) {
            j10 += j11;
        }
        for (int i10 = 0; i10 < list.size(); i10++) {
            C4770v.a aVar = (C4770v.a) list.get(i10);
            if (aVar != null) {
                aVar.a(new C0450a(j10, jArr[i10]));
            }
        }
    }

    /* access modifiers changed from: private */
    public static C4770v p(x.a[] aVarArr) {
        C4770v vVar;
        long j10;
        ArrayList arrayList = new ArrayList();
        for (x.a aVar : aVarArr) {
            if (aVar == null || aVar.f27133b.length <= 1) {
                arrayList.add((Object) null);
            } else {
                C4770v.a t10 = C4770v.t();
                t10.a(new C0450a(0, 0));
                arrayList.add(t10);
            }
        }
        long[][] q10 = q(aVarArr);
        int[] iArr = new int[q10.length];
        long[] jArr = new long[q10.length];
        for (int i10 = 0; i10 < q10.length; i10++) {
            long[] jArr2 = q10[i10];
            if (jArr2.length == 0) {
                j10 = 0;
            } else {
                j10 = jArr2[0];
            }
            jArr[i10] = j10;
        }
        o(arrayList, jArr);
        C4770v r10 = r(q10);
        for (int i11 = 0; i11 < r10.size(); i11++) {
            int intValue = ((Integer) r10.get(i11)).intValue();
            int i12 = iArr[intValue] + 1;
            iArr[intValue] = i12;
            jArr[intValue] = q10[intValue][i12];
            o(arrayList, jArr);
        }
        for (int i13 = 0; i13 < aVarArr.length; i13++) {
            if (arrayList.get(i13) != null) {
                jArr[i13] = jArr[i13] * 2;
            }
        }
        o(arrayList, jArr);
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

    private static long[][] q(x.a[] aVarArr) {
        long[][] jArr = new long[aVarArr.length][];
        for (int i10 = 0; i10 < aVarArr.length; i10++) {
            x.a aVar = aVarArr[i10];
            if (aVar == null) {
                jArr[i10] = new long[0];
            } else {
                jArr[i10] = new long[aVar.f27133b.length];
                int i11 = 0;
                while (true) {
                    int[] iArr = aVar.f27133b;
                    if (i11 >= iArr.length) {
                        break;
                    }
                    long j10 = (long) aVar.f27132a.a(iArr[i11]).f20078i;
                    long[] jArr2 = jArr[i10];
                    if (j10 == -1) {
                        j10 = 0;
                    }
                    jArr2[i11] = j10;
                    i11++;
                }
                Arrays.sort(jArr[i10]);
            }
        }
        return jArr;
    }

    private static C4770v r(long[][] jArr) {
        double d10;
        D e10 = com.google.common.collect.I.c().a().e();
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

    public int a() {
        return this.f26981s;
    }

    public void d(float f10) {
        this.f26980r = f10;
    }

    public void enable() {
        this.f26983u = -9223372036854775807L;
    }

    public void disable() {
    }
}
