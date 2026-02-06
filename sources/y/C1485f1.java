package Y;

import Y.C1500m;
import androidx.collection.C;
import androidx.collection.I;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mf.C6559l;
import mf.C6565s;

/* renamed from: Y.f1  reason: case insensitive filesystem */
public final class C1485f1 {

    /* renamed from: y  reason: collision with root package name */
    public static final a f9977y = new a((DefaultConstructorMarker) null);

    /* renamed from: z  reason: collision with root package name */
    public static final int f9978z = 8;

    /* renamed from: a  reason: collision with root package name */
    private final C1476c1 f9979a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public int[] f9980b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public Object[] f9981c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public ArrayList f9982d;
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public HashMap f9983e;

    /* renamed from: f  reason: collision with root package name */
    private C f9984f;
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public int f9985g;

    /* renamed from: h  reason: collision with root package name */
    private int f9986h;
    /* access modifiers changed from: private */

    /* renamed from: i  reason: collision with root package name */
    public int f9987i;

    /* renamed from: j  reason: collision with root package name */
    private int f9988j;
    /* access modifiers changed from: private */

    /* renamed from: k  reason: collision with root package name */
    public int f9989k;
    /* access modifiers changed from: private */

    /* renamed from: l  reason: collision with root package name */
    public int f9990l;
    /* access modifiers changed from: private */

    /* renamed from: m  reason: collision with root package name */
    public int f9991m;

    /* renamed from: n  reason: collision with root package name */
    private int f9992n;
    /* access modifiers changed from: private */

    /* renamed from: o  reason: collision with root package name */
    public int f9993o;

    /* renamed from: p  reason: collision with root package name */
    private final W f9994p = new W();

    /* renamed from: q  reason: collision with root package name */
    private final W f9995q = new W();

    /* renamed from: r  reason: collision with root package name */
    private final W f9996r = new W();

    /* renamed from: s  reason: collision with root package name */
    private C f9997s;
    /* access modifiers changed from: private */

    /* renamed from: t  reason: collision with root package name */
    public int f9998t;

    /* renamed from: u  reason: collision with root package name */
    private int f9999u;

    /* renamed from: v  reason: collision with root package name */
    private int f10000v;

    /* renamed from: w  reason: collision with root package name */
    private boolean f10001w;

    /* renamed from: x  reason: collision with root package name */
    private F0 f10002x;

    /* renamed from: Y.f1$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* access modifiers changed from: private */
        public final List b(C1485f1 f1Var, int i10, C1485f1 f1Var2, boolean z10, boolean z11, boolean z12) {
            int i11;
            ArrayList arrayList;
            int i12;
            C1485f1 f1Var3 = f1Var;
            int i13 = i10;
            C1485f1 f1Var4 = f1Var2;
            int k02 = f1Var.k0(i10);
            int i14 = i13 + k02;
            int b10 = f1Var.P(i10);
            int b11 = f1Var3.P(i14);
            int i15 = b11 - b10;
            boolean a10 = f1Var.M(i10);
            f1Var4.o0(k02);
            f1Var4.p0(i15, f1Var2.a0());
            if (f1Var.f9985g < i14) {
                f1Var3.x0(i14);
            }
            if (f1Var.f9989k < b11) {
                f1Var3.z0(b11, i14);
            }
            int[] i16 = f1Var2.f9980b;
            int a02 = f1Var2.a0();
            C6559l.k(f1Var.f9980b, i16, a02 * 5, i13 * 5, i14 * 5);
            Object[] k10 = f1Var2.f9981c;
            int g10 = f1Var2.f9987i;
            C6559l.m(f1Var.f9981c, k10, g10, b10, b11);
            int c02 = f1Var2.c0();
            C1482e1.b0(i16, a02, c02);
            int i17 = a02 - i13;
            int i18 = a02 + k02;
            int c10 = g10 - f1Var4.Q(i16, a02);
            int m10 = f1Var2.f9991m;
            boolean z13 = a10;
            int l10 = f1Var2.f9990l;
            int length = k10.length;
            int i19 = g10;
            int i20 = m10;
            int i21 = b10;
            int i22 = a02;
            while (true) {
                i11 = 0;
                if (i22 >= i18) {
                    break;
                }
                if (i22 != a02) {
                    i12 = i18;
                    C1482e1.b0(i16, i22, C1482e1.T(i16, i22) + i17);
                } else {
                    i12 = i18;
                }
                int c11 = f1Var4.Q(i16, i22) + c10;
                if (i20 >= i22) {
                    i11 = f1Var2.f9989k;
                }
                int i23 = c10;
                C1482e1.X(i16, i22, f1Var4.S(c11, i11, l10, length));
                if (i22 == i20) {
                    i20++;
                }
                i22++;
                c10 = i23;
                i18 = i12;
            }
            int i24 = i18;
            f1Var4.f9991m = i20;
            int o10 = C1482e1.P(f1Var.f9982d, i13, f1Var.d0());
            int o11 = C1482e1.P(f1Var.f9982d, i14, f1Var.d0());
            if (o10 < o11) {
                ArrayList f10 = f1Var.f9982d;
                ArrayList arrayList2 = new ArrayList(o11 - o10);
                for (int i25 = o10; i25 < o11; i25++) {
                    C1477d dVar = (C1477d) f10.get(i25);
                    dVar.c(dVar.a() + i17);
                    arrayList2.add(dVar);
                }
                f1Var2.f9982d.addAll(C1482e1.P(f1Var2.f9982d, f1Var2.a0(), f1Var2.d0()), arrayList2);
                f10.subList(o10, o11).clear();
                arrayList = arrayList2;
            } else {
                arrayList = C6565s.n();
            }
            if (!arrayList.isEmpty()) {
                HashMap o12 = f1Var.f9983e;
                HashMap o13 = f1Var2.f9983e;
                if (!(o12 == null || o13 == null)) {
                    int size = arrayList.size();
                    for (int i26 = 0; i26 < size; i26++) {
                        V v10 = (V) o12.get((C1477d) arrayList.get(i26));
                    }
                }
            }
            f1Var2.c0();
            V unused = f1Var4.e1(c02);
            int i27 = 1;
            int E02 = f1Var.E0(i10);
            if (z12) {
                if (z10) {
                    if (E02 >= 0) {
                        i11 = 1;
                    }
                    if (i11 != 0) {
                        f1Var.g1();
                        f1Var3.D(E02 - f1Var.a0());
                        f1Var.g1();
                    }
                    f1Var3.D(i13 - f1Var.a0());
                    boolean L02 = f1Var.L0();
                    if (i11 != 0) {
                        f1Var.W0();
                        f1Var.T();
                        f1Var.W0();
                        f1Var.T();
                    }
                    i11 = L02;
                } else {
                    i11 = f1Var3.M0(i13, k02);
                    f1Var3.N0(i21, i15, i13 - 1);
                }
            }
            if (i11 != 0) {
                C1506p.r("Unexpectedly removed anchors");
            }
            int j10 = f1Var2.f9993o;
            if (!C1482e1.N(i16, a02)) {
                i27 = C1482e1.Q(i16, a02);
            }
            f1Var4.f9993o = j10 + i27;
            if (z11) {
                f1Var4.f9998t = i24;
                f1Var4.f9987i = i19 + i15;
            }
            if (z13) {
                f1Var4.p1(c02);
            }
            return arrayList;
        }

        static /* synthetic */ List c(a aVar, C1485f1 f1Var, int i10, C1485f1 f1Var2, boolean z10, boolean z11, boolean z12, int i11, Object obj) {
            if ((i11 & 32) != 0) {
                z12 = true;
            }
            return aVar.b(f1Var, i10, f1Var2, z10, z11, z12);
        }

        private a() {
        }
    }

    public C1485f1(C1476c1 c1Var) {
        this.f9979a = c1Var;
        this.f9980b = c1Var.z();
        this.f9981c = c1Var.C();
        this.f9982d = c1Var.v();
        this.f9983e = c1Var.E();
        this.f9984f = c1Var.x();
        this.f9985g = c1Var.A();
        this.f9986h = (this.f9980b.length / 5) - c1Var.A();
        this.f9989k = c1Var.D();
        this.f9990l = this.f9981c.length - c1Var.D();
        this.f9991m = c1Var.A();
        this.f9999u = c1Var.A();
        this.f10000v = -1;
    }

    private final int D0(int[] iArr, int i10) {
        return Q(iArr, i10);
    }

    private final int F0(int[] iArr, int i10) {
        return G0(C1482e1.T(iArr, h0(i10)));
    }

    private final int G0(int i10) {
        if (i10 > -2) {
            return i10;
        }
        return d0() + i10 + 2;
    }

    private final int H(int[] iArr, int i10) {
        return Q(iArr, i10) + C1482e1.E(C1482e1.H(iArr, i10) >> 29);
    }

    private final int H0(int i10, int i11) {
        if (i10 < i11) {
            return i10;
        }
        return -((d0() - i10) + 2);
    }

    private final Object I0(Object obj) {
        Object U02 = U0();
        T0(obj);
        return U02;
    }

    private final boolean J(int i10) {
        int i11 = i10 + 1;
        int k02 = i10 + k0(i10);
        while (i11 < k02) {
            if (C1482e1.C(this.f9980b, h0(i11))) {
                return true;
            }
            i11 += k0(i11);
        }
        return false;
    }

    private final void J0() {
        F0 f02 = this.f10002x;
        if (f02 != null) {
            while (f02.b()) {
                q1(f02.d(), f02);
            }
        }
    }

    private final void K() {
        int i10 = this.f9989k;
        C6559l.w(this.f9981c, (Object) null, i10, this.f9990l + i10);
    }

    private final boolean K0(int i10, int i11, HashMap hashMap) {
        int i12 = i11 + i10;
        int o10 = C1482e1.P(this.f9982d, i12, Y() - this.f9986h);
        if (o10 >= this.f9982d.size()) {
            o10--;
        }
        int i13 = o10 + 1;
        boolean z10 = false;
        int i14 = 0;
        while (o10 >= 0) {
            C1477d dVar = (C1477d) this.f9982d.get(o10);
            int F10 = F(dVar);
            if (F10 < i10) {
                break;
            }
            if (F10 < i12) {
                dVar.c(Integer.MIN_VALUE);
                if (hashMap != null) {
                    V v10 = (V) hashMap.remove(dVar);
                }
                if (i14 == 0) {
                    i14 = o10 + 1;
                }
                i13 = o10;
            }
            o10--;
        }
        if (i13 < i14) {
            z10 = true;
        }
        if (z10) {
            this.f9982d.subList(i13, i14).clear();
        }
        return z10;
    }

    /* access modifiers changed from: private */
    public final boolean M(int i10) {
        if (i10 < 0 || !C1482e1.C(this.f9980b, h0(i10))) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: private */
    public final boolean M0(int i10, int i11) {
        boolean z10 = false;
        if (i11 > 0) {
            ArrayList arrayList = this.f9982d;
            x0(i10);
            if (!arrayList.isEmpty()) {
                z10 = K0(i10, i11, this.f9983e);
            }
            this.f9985g = i10;
            this.f9986h += i11;
            int i12 = this.f9991m;
            if (i12 > i10) {
                this.f9991m = Math.max(i10, i12 - i11);
            }
            int i13 = this.f9999u;
            if (i13 >= this.f9985g) {
                this.f9999u = i13 - i11;
            }
            int i14 = this.f10000v;
            if (N(i14)) {
                p1(i14);
            }
        }
        return z10;
    }

    private final boolean N(int i10) {
        if (i10 < 0 || !C1482e1.D(this.f9980b, h0(i10))) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: private */
    public final void N0(int i10, int i11, int i12) {
        if (i11 > 0) {
            int i13 = this.f9990l;
            int i14 = i10 + i11;
            z0(i14, i12);
            this.f9989k = i10;
            this.f9990l = i13 + i11;
            C6559l.w(this.f9981c, (Object) null, i10, i14);
            int i15 = this.f9988j;
            if (i15 >= i10) {
                this.f9988j = i15 - i11;
            }
        }
    }

    private final int O(int i10, int i11, int i12) {
        if (i10 < 0) {
            return (i12 - i11) + i10 + 1;
        }
        return i10;
    }

    /* access modifiers changed from: private */
    public final int P(int i10) {
        return Q(this.f9980b, h0(i10));
    }

    private final int P0() {
        int Y10 = (Y() - this.f9986h) - this.f9995q.i();
        this.f9999u = Y10;
        return Y10;
    }

    /* access modifiers changed from: private */
    public final int Q(int[] iArr, int i10) {
        if (i10 >= Y()) {
            return this.f9981c.length - this.f9990l;
        }
        return O(C1482e1.F(iArr, i10), this.f9990l, this.f9981c.length);
    }

    private final void Q0() {
        this.f9995q.j((Y() - this.f9986h) - this.f9999u);
    }

    /* access modifiers changed from: private */
    public final int R(int i10) {
        if (i10 < this.f9989k) {
            return i10;
        }
        return i10 + this.f9990l;
    }

    /* access modifiers changed from: private */
    public final int S(int i10, int i11, int i12, int i13) {
        if (i10 > i11) {
            return -(((i13 - i12) - i10) + 1);
        }
        return i10;
    }

    private final void X(int i10, int i11, int i12) {
        int H02 = H0(i10, this.f9985g);
        while (i12 < i11) {
            C1482e1.b0(this.f9980b, h0(i12), H02);
            int h10 = C1482e1.I(this.f9980b, h0(i12)) + i12;
            X(i12, h10, i12 + 1);
            i12 = h10;
        }
    }

    private final int Y() {
        return this.f9980b.length / 5;
    }

    /* access modifiers changed from: private */
    public final int Z0(int[] iArr, int i10) {
        if (i10 >= Y()) {
            return this.f9981c.length - this.f9990l;
        }
        return O(C1482e1.V(iArr, i10), this.f9990l, this.f9981c.length);
    }

    /* access modifiers changed from: private */
    public final V e1(int i10) {
        C1477d l12;
        HashMap hashMap = this.f9983e;
        if (hashMap == null || (l12 = l1(i10)) == null) {
            return null;
        }
        return (V) hashMap.get(l12);
    }

    /* access modifiers changed from: private */
    public final int h0(int i10) {
        if (i10 < this.f9985g) {
            return i10;
        }
        return i10 + this.f9986h;
    }

    private final void i1(int i10, Object obj, boolean z10, Object obj2) {
        boolean z11;
        int i11;
        boolean z12;
        boolean z13;
        Object obj3 = obj;
        Object obj4 = obj2;
        int i12 = this.f10000v;
        if (this.f9992n > 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f9996r.j(this.f9993o);
        if (z11) {
            int i13 = this.f9998t;
            int Q10 = Q(this.f9980b, h0(i13));
            o0(1);
            this.f9987i = Q10;
            this.f9988j = Q10;
            int h02 = h0(i13);
            C1500m.a aVar = C1500m.f10026a;
            if (obj3 != aVar.a()) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (z10 || obj4 == aVar.a()) {
                z13 = false;
            } else {
                z13 = true;
            }
            int S10 = S(Q10, this.f9989k, this.f9990l, this.f9981c.length);
            if (S10 >= 0 && this.f9991m < i13) {
                S10 = -(((this.f9981c.length - this.f9990l) - S10) + 1);
            }
            C1482e1.M(this.f9980b, h02, i10, z10, z12, z13, this.f10000v, S10);
            int i14 = (z10 ? 1 : 0) + (z12 ? 1 : 0) + (z13 ? 1 : 0);
            if (i14 > 0) {
                p0(i14, i13);
                Object[] objArr = this.f9981c;
                int i15 = this.f9987i;
                if (z10) {
                    objArr[i15] = obj4;
                    i15++;
                }
                if (z12) {
                    objArr[i15] = obj3;
                    i15++;
                }
                if (z13) {
                    objArr[i15] = obj4;
                    i15++;
                }
                this.f9987i = i15;
            }
            this.f9993o = 0;
            i11 = i13 + 1;
            this.f10000v = i13;
            this.f9998t = i11;
            if (i12 >= 0) {
                e1(i12);
            }
        } else {
            this.f9994p.j(i12);
            Q0();
            int i16 = this.f9998t;
            int h03 = h0(i16);
            if (!C6496s.c(obj4, C1500m.f10026a.a())) {
                if (z10) {
                    t1(obj4);
                } else {
                    o1(obj4);
                }
            }
            this.f9987i = Z0(this.f9980b, h03);
            this.f9988j = Q(this.f9980b, h0(this.f9998t + 1));
            this.f9993o = C1482e1.Q(this.f9980b, h03);
            this.f10000v = i16;
            this.f9998t = i16 + 1;
            i11 = i16 + C1482e1.I(this.f9980b, h03);
        }
        this.f9999u = i11;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x003c, code lost:
        r5 = (Y.C1477d) r3.f9982d.get(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0017, code lost:
        r0 = (Y.C1477d) r3.f9982d.get(r4);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void n1(int r4, int r5) {
        /*
            r3 = this;
            int r0 = r3.f9986h
            int r1 = r3.Y()
            int r1 = r1 - r0
            if (r4 >= r5) goto L_0x002e
            java.util.ArrayList r0 = r3.f9982d
            int r4 = Y.C1482e1.P(r0, r4, r1)
        L_0x000f:
            java.util.ArrayList r0 = r3.f9982d
            int r0 = r0.size()
            if (r4 >= r0) goto L_0x0053
            java.util.ArrayList r0 = r3.f9982d
            java.lang.Object r0 = r0.get(r4)
            Y.d r0 = (Y.C1477d) r0
            int r2 = r0.a()
            if (r2 >= 0) goto L_0x0053
            int r2 = r2 + r1
            if (r2 >= r5) goto L_0x0053
            r0.c(r2)
            int r4 = r4 + 1
            goto L_0x000f
        L_0x002e:
            java.util.ArrayList r4 = r3.f9982d
            int r4 = Y.C1482e1.P(r4, r5, r1)
        L_0x0034:
            java.util.ArrayList r5 = r3.f9982d
            int r5 = r5.size()
            if (r4 >= r5) goto L_0x0053
            java.util.ArrayList r5 = r3.f9982d
            java.lang.Object r5 = r5.get(r4)
            Y.d r5 = (Y.C1477d) r5
            int r0 = r5.a()
            if (r0 < 0) goto L_0x0053
            int r0 = r1 - r0
            int r0 = -r0
            r5.c(r0)
            int r4 = r4 + 1
            goto L_0x0034
        L_0x0053:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.C1485f1.n1(int, int):void");
    }

    /* access modifiers changed from: private */
    public final void o0(int i10) {
        int i11;
        if (i10 > 0) {
            int i12 = this.f9998t;
            x0(i12);
            int i13 = this.f9985g;
            int i14 = this.f9986h;
            int[] iArr = this.f9980b;
            int length = iArr.length / 5;
            int i15 = length - i14;
            int i16 = 0;
            if (i14 < i10) {
                int max = Math.max(Math.max(length * 2, i15 + i10), 32);
                int[] iArr2 = new int[(max * 5)];
                int i17 = max - i15;
                C6559l.k(iArr, iArr2, 0, 0, i13 * 5);
                C6559l.k(iArr, iArr2, (i13 + i17) * 5, (i14 + i13) * 5, length * 5);
                this.f9980b = iArr2;
                i14 = i17;
            }
            int i18 = this.f9999u;
            if (i18 >= i13) {
                this.f9999u = i18 + i10;
            }
            int i19 = i13 + i10;
            this.f9985g = i19;
            this.f9986h = i14 - i10;
            if (i15 > 0) {
                i11 = P(i12 + i10);
            } else {
                i11 = 0;
            }
            if (this.f9991m >= i13) {
                i16 = this.f9989k;
            }
            int S10 = S(i11, i16, this.f9990l, this.f9981c.length);
            for (int i20 = i13; i20 < i19; i20++) {
                C1482e1.X(this.f9980b, i20, S10);
            }
            int i21 = this.f9991m;
            if (i21 >= i13) {
                this.f9991m = i21 + i10;
            }
        }
    }

    /* access modifiers changed from: private */
    public final void p0(int i10, int i11) {
        if (i10 > 0) {
            z0(this.f9987i, i11);
            int i12 = this.f9989k;
            int i13 = this.f9990l;
            if (i13 < i10) {
                Object[] objArr = this.f9981c;
                int length = objArr.length;
                int i14 = length - i13;
                int max = Math.max(Math.max(length * 2, i14 + i10), 32);
                Object[] objArr2 = new Object[max];
                for (int i15 = 0; i15 < max; i15++) {
                    objArr2[i15] = null;
                }
                int i16 = max - i14;
                C6559l.m(objArr, objArr2, 0, 0, i12);
                C6559l.m(objArr, objArr2, i12 + i16, i13 + i12, length);
                this.f9981c = objArr2;
                i13 = i16;
            }
            int i17 = this.f9988j;
            if (i17 >= i12) {
                this.f9988j = i17 + i10;
            }
            this.f9989k = i12 + i10;
            this.f9990l = i13 - i10;
        }
    }

    /* access modifiers changed from: private */
    public final void p1(int i10) {
        if (i10 >= 0) {
            F0 f02 = this.f10002x;
            if (f02 == null) {
                f02 = new F0((List) null, 1, (DefaultConstructorMarker) null);
                this.f10002x = f02;
            }
            f02.a(i10);
        }
    }

    private final void q1(int i10, F0 f02) {
        int h02 = h0(i10);
        boolean J10 = J(i10);
        if (C1482e1.D(this.f9980b, h02) != J10) {
            C1482e1.W(this.f9980b, h02, J10);
            int E02 = E0(i10);
            if (E02 >= 0) {
                f02.a(E02);
            }
        }
    }

    private final void r1(int[] iArr, int i10, int i11) {
        C1482e1.X(iArr, i10, S(i11, this.f9989k, this.f9990l, this.f9981c.length));
    }

    public static /* synthetic */ void t0(C1485f1 f1Var, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = f1Var.f10000v;
        }
        f1Var.s0(i10);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x001a, code lost:
        r3 = (Y.C1477d) r5.f9982d.get(r1);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void u0(int r6, int r7, int r8) {
        /*
            r5 = this;
            int r8 = r8 + r6
            int r0 = r5.d0()
            java.util.ArrayList r1 = r5.f9982d
            int r1 = Y.C1482e1.P(r1, r6, r0)
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            if (r1 < 0) goto L_0x0033
        L_0x0012:
            java.util.ArrayList r3 = r5.f9982d
            int r3 = r3.size()
            if (r1 >= r3) goto L_0x0033
            java.util.ArrayList r3 = r5.f9982d
            java.lang.Object r3 = r3.get(r1)
            Y.d r3 = (Y.C1477d) r3
            int r4 = r5.F(r3)
            if (r4 < r6) goto L_0x0033
            if (r4 >= r8) goto L_0x0033
            r2.add(r3)
            java.util.ArrayList r3 = r5.f9982d
            r3.remove(r1)
            goto L_0x0012
        L_0x0033:
            int r7 = r7 - r6
            int r6 = r2.size()
            r8 = 0
        L_0x0039:
            if (r8 >= r6) goto L_0x0062
            java.lang.Object r1 = r2.get(r8)
            Y.d r1 = (Y.C1477d) r1
            int r3 = r5.F(r1)
            int r3 = r3 + r7
            int r4 = r5.f9985g
            if (r3 < r4) goto L_0x0051
            int r4 = r0 - r3
            int r4 = -r4
            r1.c(r4)
            goto L_0x0054
        L_0x0051:
            r1.c(r3)
        L_0x0054:
            java.util.ArrayList r4 = r5.f9982d
            int r3 = Y.C1482e1.P(r4, r3, r0)
            java.util.ArrayList r4 = r5.f9982d
            r4.add(r3, r1)
            int r8 = r8 + 1
            goto L_0x0039
        L_0x0062:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.C1485f1.u0(int, int, int):void");
    }

    private final void u1(int i10, Object obj) {
        boolean z10;
        int h02 = h0(i10);
        int[] iArr = this.f9980b;
        if (h02 >= iArr.length || !C1482e1.N(iArr, h02)) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (!z10) {
            C1506p.r("Updating the node of a group at " + i10 + " that was not created with as a node group");
        }
        this.f9981c[R(D0(this.f9980b, h02))] = obj;
    }

    /* access modifiers changed from: private */
    public final void x0(int i10) {
        int i11;
        boolean z10;
        int i12 = this.f9986h;
        int i13 = this.f9985g;
        if (i13 != i10) {
            if (!this.f9982d.isEmpty()) {
                n1(i13, i10);
            }
            if (i12 > 0) {
                int[] iArr = this.f9980b;
                int i14 = i10 * 5;
                int i15 = i12 * 5;
                int i16 = i13 * 5;
                if (i10 < i13) {
                    C6559l.k(iArr, iArr, i15 + i14, i14, i16);
                } else {
                    C6559l.k(iArr, iArr, i16, i16 + i15, i14 + i15);
                }
            }
            if (i10 < i13) {
                i13 = i10 + i12;
            }
            int Y10 = Y();
            if (i11 < Y10) {
                z10 = true;
            } else {
                z10 = false;
            }
            C1506p.O(z10);
            while (i11 < Y10) {
                int s10 = C1482e1.T(this.f9980b, i11);
                int H02 = H0(G0(s10), i10);
                if (H02 != s10) {
                    C1482e1.b0(this.f9980b, i11, H02);
                }
                i11++;
                if (i11 == i10) {
                    i11 += i12;
                }
            }
        }
        this.f9985g = i10;
    }

    /* access modifiers changed from: private */
    public final void z0(int i10, int i11) {
        boolean z10;
        boolean z11;
        int i12 = this.f9990l;
        int i13 = this.f9989k;
        int i14 = this.f9991m;
        if (i13 != i10) {
            Object[] objArr = this.f9981c;
            if (i10 < i13) {
                C6559l.m(objArr, objArr, i10 + i12, i10, i13);
            } else {
                C6559l.m(objArr, objArr, i13, i13 + i12, i10 + i12);
            }
        }
        int min = Math.min(i11 + 1, d0());
        if (i14 != min) {
            int length = this.f9981c.length - i12;
            if (min < i14) {
                int h02 = h0(min);
                int h03 = h0(i14);
                int i15 = this.f9985g;
                while (h02 < h03) {
                    int e10 = C1482e1.F(this.f9980b, h02);
                    if (e10 >= 0) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (!z11) {
                        C1506p.r("Unexpected anchor value, expected a positive anchor");
                    }
                    C1482e1.X(this.f9980b, h02, -((length - e10) + 1));
                    h02++;
                    if (h02 == i15) {
                        h02 += this.f9986h;
                    }
                }
            } else {
                int h04 = h0(i14);
                int h05 = h0(min);
                while (h04 < h05) {
                    int e11 = C1482e1.F(this.f9980b, h04);
                    if (e11 < 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (!z10) {
                        C1506p.r("Unexpected anchor value, expected a negative anchor");
                    }
                    C1482e1.X(this.f9980b, h04, e11 + length + 1);
                    h04++;
                    if (h04 == this.f9985g) {
                        h04 += this.f9986h;
                    }
                }
            }
            this.f9991m = min;
        }
        this.f9989k = i10;
    }

    public final Object A0(int i10) {
        int h02 = h0(i10);
        if (C1482e1.N(this.f9980b, h02)) {
            return this.f9981c[R(D0(this.f9980b, h02))];
        }
        return null;
    }

    public final Object B0(C1477d dVar) {
        return A0(dVar.e(this));
    }

    public final int C0(int i10) {
        return C1482e1.Q(this.f9980b, h0(i10));
    }

    public final void D(int i10) {
        boolean z10;
        boolean z11;
        boolean z12 = false;
        if (i10 >= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            C1506p.r("Cannot seek backwards");
        }
        if (this.f9992n <= 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (!z11) {
            C0.b("Cannot call seek() while inserting");
        }
        if (i10 != 0) {
            int i11 = this.f9998t + i10;
            if (i11 >= this.f10000v && i11 <= this.f9999u) {
                z12 = true;
            }
            if (!z12) {
                C1506p.r("Cannot seek outside the current group (" + this.f10000v + '-' + this.f9999u + ')');
            }
            this.f9998t = i11;
            int Q10 = Q(this.f9980b, h0(i11));
            this.f9987i = Q10;
            this.f9988j = Q10;
        }
    }

    public final C1477d E(int i10) {
        ArrayList arrayList = this.f9982d;
        int t10 = C1482e1.U(arrayList, i10, d0());
        if (t10 >= 0) {
            return (C1477d) arrayList.get(t10);
        }
        if (i10 > this.f9985g) {
            i10 = -(d0() - i10);
        }
        C1477d dVar = new C1477d(i10);
        arrayList.add(-(t10 + 1), dVar);
        return dVar;
    }

    public final int E0(int i10) {
        return F0(this.f9980b, i10);
    }

    public final int F(C1477d dVar) {
        int a10 = dVar.a();
        if (a10 < 0) {
            return a10 + d0();
        }
        return a10;
    }

    public final void G(C1477d dVar, Object obj) {
        boolean z10;
        if (this.f9992n == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            C1506p.r("Can only append a slot if not current inserting");
        }
        int i10 = this.f9987i;
        int i11 = this.f9988j;
        int F10 = F(dVar);
        int Q10 = Q(this.f9980b, h0(F10 + 1));
        this.f9987i = Q10;
        this.f9988j = Q10;
        p0(1, F10);
        if (i10 >= Q10) {
            i10++;
            i11++;
        }
        this.f9981c[Q10] = obj;
        this.f9987i = i10;
        this.f9988j = i11;
    }

    public final void I() {
        int i10 = this.f9992n;
        this.f9992n = i10 + 1;
        if (i10 == 0) {
            Q0();
        }
    }

    public final void L(boolean z10) {
        this.f10001w = true;
        if (z10 && this.f9994p.d()) {
            x0(d0());
            z0(this.f9981c.length - this.f9990l, this.f9985g);
            K();
            J0();
        }
        this.f9979a.k(this, this.f9980b, this.f9985g, this.f9981c, this.f9989k, this.f9982d, this.f9983e, this.f9984f);
    }

    public final boolean L0() {
        boolean z10;
        if (this.f9992n == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            C1506p.r("Cannot remove group while inserting");
        }
        int i10 = this.f9998t;
        int i11 = this.f9987i;
        int Q10 = Q(this.f9980b, h0(i10));
        int V02 = V0();
        e1(this.f10000v);
        F0 f02 = this.f10002x;
        if (f02 != null) {
            while (f02.b() && f02.c() >= i10) {
                f02.d();
            }
        }
        boolean M02 = M0(i10, this.f9998t - i10);
        N0(Q10, this.f9987i - Q10, i10 - 1);
        this.f9998t = i10;
        this.f9987i = i11;
        this.f9993o -= V02;
        return M02;
    }

    public final void O0() {
        boolean z10;
        if (this.f9992n == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            C1506p.r("Cannot reset when inserting");
        }
        J0();
        this.f9998t = 0;
        this.f9999u = Y() - this.f9986h;
        this.f9987i = 0;
        this.f9988j = 0;
        this.f9993o = 0;
    }

    public final Object R0(int i10, int i11, Object obj) {
        int R10 = R(a1(i10, i11));
        Object[] objArr = this.f9981c;
        Object obj2 = objArr[R10];
        objArr[R10] = obj;
        return obj2;
    }

    public final Object S0(int i10, Object obj) {
        return R0(this.f9998t, i10, obj);
    }

    public final int T() {
        boolean z10;
        int i10;
        int i11;
        int i12;
        I i13;
        boolean z11 = true;
        int i14 = 0;
        if (this.f9992n > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        int i15 = this.f9998t;
        int i16 = this.f9999u;
        int i17 = this.f10000v;
        int h02 = h0(i17);
        int i18 = this.f9993o;
        int i19 = i15 - i17;
        boolean m10 = C1482e1.N(this.f9980b, h02);
        if (z10) {
            C c10 = this.f9997s;
            if (!(c10 == null || (i13 = (I) c10.c(i17)) == null)) {
                Object[] objArr = i13.f12112a;
                int i20 = i13.f12113b;
                for (int i21 = 0; i21 < i20; i21++) {
                    I0(objArr[i21]);
                }
                I i22 = (I) c10.q(i17);
            }
            C1482e1.Y(this.f9980b, h02, i19);
            C1482e1.a0(this.f9980b, h02, i18);
            int i23 = this.f9996r.i();
            if (m10) {
                i11 = 1;
            } else {
                i11 = i18;
            }
            this.f9993o = i23 + i11;
            int F02 = F0(this.f9980b, i17);
            this.f10000v = F02;
            if (F02 < 0) {
                i12 = d0();
            } else {
                i12 = h0(F02 + 1);
            }
            if (i12 >= 0) {
                i14 = Q(this.f9980b, i12);
            }
            this.f9987i = i14;
            this.f9988j = i14;
        } else {
            if (i15 != i16) {
                z11 = false;
            }
            if (!z11) {
                C1506p.r("Expected to be at the end of a group");
            }
            int h10 = C1482e1.I(this.f9980b, h02);
            int p10 = C1482e1.Q(this.f9980b, h02);
            C1482e1.Y(this.f9980b, h02, i19);
            C1482e1.a0(this.f9980b, h02, i18);
            int i24 = this.f9994p.i();
            P0();
            this.f10000v = i24;
            int F03 = F0(this.f9980b, i17);
            int i25 = this.f9996r.i();
            this.f9993o = i25;
            if (F03 == i24) {
                if (!m10) {
                    i14 = i18 - p10;
                }
                this.f9993o = i25 + i14;
            } else {
                int i26 = i19 - h10;
                if (m10) {
                    i10 = 0;
                } else {
                    i10 = i18 - p10;
                }
                if (!(i26 == 0 && i10 == 0)) {
                    while (F03 != 0 && F03 != i24 && (i10 != 0 || i26 != 0)) {
                        int h03 = h0(F03);
                        if (i26 != 0) {
                            C1482e1.Y(this.f9980b, h03, C1482e1.I(this.f9980b, h03) + i26);
                        }
                        if (i10 != 0) {
                            int[] iArr = this.f9980b;
                            C1482e1.a0(iArr, h03, C1482e1.Q(iArr, h03) + i10);
                        }
                        if (C1482e1.N(this.f9980b, h03)) {
                            i10 = 0;
                        }
                        F03 = F0(this.f9980b, F03);
                    }
                }
                this.f9993o += i10;
            }
        }
        return i18;
    }

    public final void T0(Object obj) {
        boolean z10;
        if (this.f9987i <= this.f9988j) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            C1506p.r("Writing to an invalid slot");
        }
        this.f9981c[R(this.f9987i - 1)] = obj;
    }

    public final void U() {
        boolean z10;
        boolean z11 = false;
        if (this.f9992n > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            C0.b("Unbalanced begin/end insert");
        }
        int i10 = this.f9992n - 1;
        this.f9992n = i10;
        if (i10 == 0) {
            if (this.f9996r.b() == this.f9994p.b()) {
                z11 = true;
            }
            if (!z11) {
                C1506p.r("startGroup/endGroup mismatch while inserting");
            }
            P0();
        }
    }

    public final Object U0() {
        if (this.f9992n > 0) {
            p0(1, this.f10000v);
        }
        Object[] objArr = this.f9981c;
        int i10 = this.f9987i;
        this.f9987i = i10 + 1;
        return objArr[R(i10)];
    }

    public final void V(int i10) {
        boolean z10;
        boolean z11 = false;
        if (this.f9992n <= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            C1506p.r("Cannot call ensureStarted() while inserting");
        }
        int i11 = this.f10000v;
        if (i11 != i10) {
            if (i10 >= i11 && i10 < this.f9999u) {
                z11 = true;
            }
            if (!z11) {
                C1506p.r("Started group at " + i10 + " must be a subgroup of the group at " + i11);
            }
            int i12 = this.f9998t;
            int i13 = this.f9987i;
            int i14 = this.f9988j;
            this.f9998t = i10;
            g1();
            this.f9998t = i12;
            this.f9987i = i13;
            this.f9988j = i14;
        }
    }

    public final int V0() {
        int h02 = h0(this.f9998t);
        int h10 = this.f9998t + C1482e1.I(this.f9980b, h02);
        this.f9998t = h10;
        this.f9987i = Q(this.f9980b, h0(h10));
        if (C1482e1.N(this.f9980b, h02)) {
            return 1;
        }
        return C1482e1.Q(this.f9980b, h02);
    }

    public final void W(C1477d dVar) {
        V(dVar.e(this));
    }

    public final void W0() {
        int i10 = this.f9999u;
        this.f9998t = i10;
        this.f9987i = Q(this.f9980b, h0(i10));
    }

    public final Object X0(int i10, int i11) {
        int Z02 = Z0(this.f9980b, h0(i10));
        int Q10 = Q(this.f9980b, h0(i10 + 1));
        int i12 = i11 + Z02;
        if (Z02 > i12 || i12 >= Q10) {
            return C1500m.f10026a.a();
        }
        return this.f9981c[R(i12)];
    }

    public final Object Y0(C1477d dVar, int i10) {
        return X0(F(dVar), i10);
    }

    public final boolean Z() {
        return this.f10001w;
    }

    public final int a0() {
        return this.f9998t;
    }

    public final int a1(int i10, int i11) {
        boolean z10;
        int Z02 = Z0(this.f9980b, h0(i10));
        int Q10 = Q(this.f9980b, h0(i10 + 1));
        int i12 = Z02 + i11;
        if (i12 < Z02 || i12 >= Q10) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (!z10) {
            C1506p.r("Write to an invalid slot index " + i11 + " for group " + i10);
        }
        return i12;
    }

    public final int b0() {
        return this.f9999u;
    }

    public final int b1(int i10) {
        return Q(this.f9980b, h0(i10 + k0(i10)));
    }

    public final int c0() {
        return this.f10000v;
    }

    public final int c1(int i10) {
        return Q(this.f9980b, h0(i10 + 1));
    }

    public final int d0() {
        return Y() - this.f9986h;
    }

    public final int d1(int i10) {
        return Z0(this.f9980b, h0(i10));
    }

    public final int e0() {
        return this.f9981c.length - this.f9990l;
    }

    public final C1476c1 f0() {
        return this.f9979a;
    }

    public final void f1(int i10, Object obj, Object obj2) {
        i1(i10, obj, false, obj2);
    }

    public final Object g0(int i10) {
        int h02 = h0(i10);
        if (C1482e1.J(this.f9980b, h02)) {
            return this.f9981c[H(this.f9980b, h02)];
        }
        return C1500m.f10026a.a();
    }

    public final void g1() {
        boolean z10;
        if (this.f9992n == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            C1506p.r("Key must be supplied when inserting");
        }
        C1500m.a aVar = C1500m.f10026a;
        i1(0, aVar.a(), false, aVar.a());
    }

    public final void h1(int i10, Object obj) {
        i1(i10, obj, false, C1500m.f10026a.a());
    }

    public final int i0(int i10) {
        return C1482e1.O(this.f9980b, h0(i10));
    }

    public final Object j0(int i10) {
        int h02 = h0(i10);
        if (C1482e1.L(this.f9980b, h02)) {
            return this.f9981c[C1482e1.S(this.f9980b, h02)];
        }
        return null;
    }

    public final void j1(int i10, Object obj) {
        i1(i10, obj, true, C1500m.f10026a.a());
    }

    public final int k0(int i10) {
        return C1482e1.I(this.f9980b, h0(i10));
    }

    public final void k1(int i10) {
        boolean z10;
        boolean z11 = false;
        if (i10 > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        C1506p.O(z10);
        int i11 = this.f10000v;
        int Z02 = Z0(this.f9980b, h0(i11));
        int Q10 = Q(this.f9980b, h0(i11 + 1)) - i10;
        if (Q10 >= Z02) {
            z11 = true;
        }
        C1506p.O(z11);
        N0(Q10, i10, i11);
        int i12 = this.f9987i;
        if (i12 >= Z02) {
            this.f9987i = i12 - i10;
        }
    }

    public final boolean l0(int i10) {
        return m0(i10, this.f9998t);
    }

    public final C1477d l1(int i10) {
        if (i10 < 0 || i10 >= d0()) {
            return null;
        }
        return C1482e1.G(this.f9982d, i10, d0());
    }

    public final boolean m0(int i10, int i11) {
        int i12;
        int k02;
        if (i11 == this.f10000v) {
            i12 = this.f9999u;
        } else {
            if (i11 > this.f9994p.h(0)) {
                k02 = k0(i11);
            } else {
                int c10 = this.f9994p.c(i11);
                if (c10 < 0) {
                    k02 = k0(i11);
                } else {
                    i12 = (Y() - this.f9986h) - this.f9995q.f(c10);
                }
            }
            i12 = k02 + i11;
        }
        if (i10 <= i11 || i10 >= i12) {
            return false;
        }
        return true;
    }

    public final Object m1(Object obj) {
        if (this.f9992n <= 0 || this.f9987i == this.f9989k) {
            return I0(obj);
        }
        C c10 = this.f9997s;
        if (c10 == null) {
            c10 = new C(0, 1, (DefaultConstructorMarker) null);
        }
        this.f9997s = c10;
        int i10 = this.f10000v;
        Object c11 = c10.c(i10);
        if (c11 == null) {
            c11 = new I(0, 1, (DefaultConstructorMarker) null);
            c10.t(i10, c11);
        }
        ((I) c11).g(obj);
        return C1500m.f10026a.a();
    }

    public final boolean n0(int i10) {
        int i11 = this.f10000v;
        if ((i10 <= i11 || i10 >= this.f9999u) && (i11 != 0 || i10 != 0)) {
            return false;
        }
        return true;
    }

    public final void o1(Object obj) {
        int h02 = h0(this.f9998t);
        if (!C1482e1.J(this.f9980b, h02)) {
            C1506p.r("Updating the data of a group that was not created with a data slot");
        }
        this.f9981c[R(H(this.f9980b, h02))] = obj;
    }

    public final boolean q0() {
        int i10 = this.f9998t;
        if (i10 >= this.f9999u || !C1482e1.N(this.f9980b, h0(i10))) {
            return false;
        }
        return true;
    }

    public final boolean r0(int i10) {
        return C1482e1.N(this.f9980b, h0(i10));
    }

    public final void s0(int i10) {
        int h02 = h0(i10);
        if (!C1482e1.K(this.f9980b, h02)) {
            C1482e1.Z(this.f9980b, h02, true);
            if (!C1482e1.D(this.f9980b, h02)) {
                p1(E0(i10));
            }
        }
    }

    public final void s1(C1477d dVar, Object obj) {
        u1(dVar.e(this), obj);
    }

    public final void t1(Object obj) {
        u1(this.f9998t, obj);
    }

    public String toString() {
        return "SlotWriter(current = " + this.f9998t + " end=" + this.f9999u + " size = " + d0() + " gap=" + this.f9985g + '-' + (this.f9985g + this.f9986h) + ')';
    }

    public final List v0(C1476c1 c1Var, int i10, boolean z10) {
        boolean z11;
        boolean z12 = false;
        z12 = true;
        if (this.f9992n > 0) {
            z11 = z12;
        } else {
            z11 = z12;
        }
        C1506p.O(z11);
        if (i10 == 0 && this.f9998t == 0 && this.f9979a.A() == 0 && C1482e1.I(c1Var.z(), i10) == c1Var.A()) {
            int[] iArr = this.f9980b;
            Object[] objArr = this.f9981c;
            ArrayList arrayList = this.f9982d;
            HashMap hashMap = this.f9983e;
            C c10 = this.f9984f;
            int[] z13 = c1Var.z();
            int A10 = c1Var.A();
            Object[] C10 = c1Var.C();
            int D10 = c1Var.D();
            HashMap E10 = c1Var.E();
            C x10 = c1Var.x();
            this.f9980b = z13;
            this.f9981c = C10;
            this.f9982d = c1Var.v();
            this.f9985g = A10;
            this.f9986h = (z13.length / 5) - A10;
            this.f9989k = D10;
            this.f9990l = C10.length - D10;
            this.f9991m = A10;
            this.f9983e = E10;
            this.f9984f = x10;
            c1Var.S(iArr, 0, objArr, 0, arrayList, hashMap, c10);
            return this.f9982d;
        }
        C1485f1 Q10 = c1Var.Q();
        try {
            return f9977y.b(Q10, i10, this, true, true, z10);
        } finally {
            Q10.L(z12);
        }
    }

    public final void v1() {
        this.f9983e = this.f9979a.E();
        this.f9984f = this.f9979a.x();
    }

    public final void w0(int i10) {
        boolean z10;
        boolean z11;
        int i11;
        boolean z12;
        if (this.f9992n == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            C1506p.r("Cannot move a group while inserting");
        }
        if (i10 >= 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (!z11) {
            C1506p.r("Parameter offset is out of bounds");
        }
        if (i10 != 0) {
            int i12 = this.f9998t;
            int i13 = this.f10000v;
            int i14 = this.f9999u;
            int i15 = i12;
            for (int i16 = i10; i16 > 0; i16--) {
                i15 += C1482e1.I(this.f9980b, h0(i15));
                if (i15 <= i14) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (!z12) {
                    C1506p.r("Parameter offset is out of bounds");
                }
            }
            int h10 = C1482e1.I(this.f9980b, h0(i15));
            int Q10 = Q(this.f9980b, h0(this.f9998t));
            int Q11 = Q(this.f9980b, h0(i15));
            int i17 = i15 + h10;
            int Q12 = Q(this.f9980b, h0(i17));
            int i18 = Q12 - Q11;
            p0(i18, Math.max(this.f9998t - 1, 0));
            o0(h10);
            int[] iArr = this.f9980b;
            int h02 = h0(i17) * 5;
            C6559l.k(iArr, iArr, h0(i12) * 5, h02, (h10 * 5) + h02);
            if (i18 > 0) {
                Object[] objArr = this.f9981c;
                C6559l.m(objArr, objArr, Q10, R(Q11 + i18), R(Q12 + i18));
            }
            int i19 = Q11 + i18;
            int i20 = i19 - Q10;
            int i21 = this.f9989k;
            int i22 = this.f9990l;
            int length = this.f9981c.length;
            int i23 = this.f9991m;
            int i24 = i12 + h10;
            int i25 = i12;
            while (i25 < i24) {
                int h03 = h0(i25);
                int i26 = i21;
                int Q13 = Q(iArr, h03) - i20;
                int i27 = i20;
                if (i23 < h03) {
                    i11 = 0;
                } else {
                    i11 = i26;
                }
                r1(iArr, h03, S(Q13, i11, i22, length));
                i25++;
                i21 = i26;
                i20 = i27;
            }
            u0(i17, i12, h10);
            if (M0(i17, h10)) {
                C1506p.r("Unexpectedly removed anchors");
            }
            X(i13, this.f9999u, i12);
            if (i18 > 0) {
                N0(i19, i18, i17 - 1);
            }
        }
    }

    /* JADX INFO: finally extract failed */
    public final List y0(int i10, C1476c1 c1Var, int i11) {
        boolean z10;
        if (this.f9992n > 0 || k0(this.f9998t + i10) != 1) {
            z10 = false;
        } else {
            z10 = true;
        }
        C1506p.O(z10);
        int i12 = this.f9998t;
        int i13 = this.f9987i;
        int i14 = this.f9988j;
        D(i10);
        g1();
        I();
        C1485f1 Q10 = c1Var.Q();
        try {
            List c10 = a.c(f9977y, Q10, i11, this, false, true, false, 32, (Object) null);
            Q10.L(true);
            U();
            T();
            this.f9998t = i12;
            this.f9987i = i13;
            this.f9988j = i14;
            return c10;
        } catch (Throwable th2) {
            Q10.L(false);
            throw th2;
        }
    }
}
