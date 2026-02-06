package f3;

import W2.s;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import f2.C1961B;
import f3.K;
import i2.C2073A;
import i2.C2076a;
import i2.G;
import i2.L;
import i2.z;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import z2.C2972p;
import z2.C2973q;
import z2.I;
import z2.J;
import z2.r;
import z2.u;

public final class J implements C2972p {

    /* renamed from: v  reason: collision with root package name */
    public static final u f20442v = new I();
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final int f20443a;

    /* renamed from: b  reason: collision with root package name */
    private final int f20444b;

    /* renamed from: c  reason: collision with root package name */
    private final int f20445c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public final List f20446d;

    /* renamed from: e  reason: collision with root package name */
    private final C2073A f20447e;

    /* renamed from: f  reason: collision with root package name */
    private final SparseIntArray f20448f;
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public final K.c f20449g;

    /* renamed from: h  reason: collision with root package name */
    private final s.a f20450h;
    /* access modifiers changed from: private */

    /* renamed from: i  reason: collision with root package name */
    public final SparseArray f20451i;
    /* access modifiers changed from: private */

    /* renamed from: j  reason: collision with root package name */
    public final SparseBooleanArray f20452j;
    /* access modifiers changed from: private */

    /* renamed from: k  reason: collision with root package name */
    public final SparseBooleanArray f20453k;

    /* renamed from: l  reason: collision with root package name */
    private final H f20454l;

    /* renamed from: m  reason: collision with root package name */
    private G f20455m;
    /* access modifiers changed from: private */

    /* renamed from: n  reason: collision with root package name */
    public r f20456n;
    /* access modifiers changed from: private */

    /* renamed from: o  reason: collision with root package name */
    public int f20457o;
    /* access modifiers changed from: private */

    /* renamed from: p  reason: collision with root package name */
    public boolean f20458p;

    /* renamed from: q  reason: collision with root package name */
    private boolean f20459q;

    /* renamed from: r  reason: collision with root package name */
    private boolean f20460r;
    /* access modifiers changed from: private */

    /* renamed from: s  reason: collision with root package name */
    public K f20461s;

    /* renamed from: t  reason: collision with root package name */
    private int f20462t;
    /* access modifiers changed from: private */

    /* renamed from: u  reason: collision with root package name */
    public int f20463u;

    public J(int i10, s.a aVar) {
        this(1, i10, aVar, new G(0), new C1994j(0), 112800);
    }

    private void A() {
        this.f20452j.clear();
        this.f20451i.clear();
        SparseArray a10 = this.f20449g.a();
        int size = a10.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.f20451i.put(a10.keyAt(i10), (K) a10.valueAt(i10));
        }
        this.f20451i.put(0, new E(new a()));
        this.f20461s = null;
    }

    private boolean B(int i10) {
        if (this.f20443a == 2 || this.f20458p || !this.f20453k.get(i10, false)) {
            return true;
        }
        return false;
    }

    static /* synthetic */ int m(J j10) {
        int i10 = j10.f20457o;
        j10.f20457o = i10 + 1;
        return i10;
    }

    private boolean w(C2973q qVar) {
        byte[] e10 = this.f20447e.e();
        if (9400 - this.f20447e.f() < 188) {
            int a10 = this.f20447e.a();
            if (a10 > 0) {
                System.arraycopy(e10, this.f20447e.f(), e10, 0, a10);
            }
            this.f20447e.S(e10, a10);
        }
        while (this.f20447e.a() < 188) {
            int g10 = this.f20447e.g();
            int read = qVar.read(e10, g10, 9400 - g10);
            if (read == -1) {
                return false;
            }
            this.f20447e.T(g10 + read);
        }
        return true;
    }

    private int x() {
        int f10 = this.f20447e.f();
        int g10 = this.f20447e.g();
        int a10 = L.a(this.f20447e.e(), f10, g10);
        this.f20447e.U(a10);
        int i10 = a10 + 188;
        if (i10 > g10) {
            int i11 = this.f20462t + (a10 - f10);
            this.f20462t = i11;
            if (this.f20443a == 2 && i11 > 376) {
                throw C1961B.a("Cannot find sync byte. Most likely not a Transport Stream.", (Throwable) null);
            }
        } else {
            this.f20462t = 0;
        }
        return i10;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ C2972p[] y() {
        return new C2972p[]{new J(1, s.a.f8664a)};
    }

    private void z(long j10) {
        if (!this.f20459q) {
            this.f20459q = true;
            if (this.f20454l.b() != -9223372036854775807L) {
                G g10 = new G(this.f20454l.c(), this.f20454l.b(), j10, this.f20463u, this.f20445c);
                this.f20455m = g10;
                this.f20456n.u(g10.b());
                return;
            }
            this.f20456n.u(new J.b(this.f20454l.b()));
        }
    }

    public void a(long j10, long j11) {
        boolean z10;
        G g10;
        boolean z11;
        if (this.f20443a != 2) {
            z10 = true;
        } else {
            z10 = false;
        }
        C2076a.g(z10);
        int size = this.f20446d.size();
        for (int i10 = 0; i10 < size; i10++) {
            G g11 = (G) this.f20446d.get(i10);
            if (g11.f() == -9223372036854775807L) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (!z11) {
                long d10 = g11.d();
                if (d10 == -9223372036854775807L || d10 == 0 || d10 == j11) {
                    z11 = false;
                } else {
                    z11 = true;
                }
            }
            if (z11) {
                g11.i(j11);
            }
        }
        if (!(j11 == 0 || (g10 = this.f20455m) == null)) {
            g10.h(j11);
        }
        this.f20447e.Q(0);
        this.f20448f.clear();
        for (int i11 = 0; i11 < this.f20451i.size(); i11++) {
            ((K) this.f20451i.valueAt(i11)).a();
        }
        this.f20462t = 0;
    }

    public void f(r rVar) {
        if ((this.f20444b & 1) == 0) {
            rVar = new W2.u(rVar, this.f20450h);
        }
        this.f20456n = rVar;
    }

    public int i(C2973q qVar, I i10) {
        boolean z10;
        int i11;
        boolean z11;
        K k10;
        int i12;
        C2973q qVar2 = qVar;
        I i13 = i10;
        long a10 = qVar.a();
        if (this.f20443a == 2) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (this.f20458p) {
            if (a10 != -1 && !z10 && !this.f20454l.d()) {
                return this.f20454l.e(qVar2, i13, this.f20463u);
            }
            z(a10);
            if (this.f20460r) {
                this.f20460r = false;
                a(0, 0);
                if (qVar.getPosition() != 0) {
                    i13.f29106a = 0;
                    return 1;
                }
            }
            G g10 = this.f20455m;
            if (g10 != null && g10.d()) {
                return this.f20455m.c(qVar2, i13);
            }
        }
        if (!w(qVar)) {
            for (int i14 = 0; i14 < this.f20451i.size(); i14++) {
                K k11 = (K) this.f20451i.valueAt(i14);
                if (k11 instanceof y) {
                    y yVar = (y) k11;
                    if (yVar.d(z10)) {
                        yVar.b(new C2073A(), 1);
                    }
                }
            }
            return -1;
        }
        int x10 = x();
        int g11 = this.f20447e.g();
        if (x10 > g11) {
            return 0;
        }
        int q10 = this.f20447e.q();
        if ((8388608 & q10) != 0) {
            this.f20447e.U(x10);
            return 0;
        }
        if ((4194304 & q10) != 0) {
            i11 = 1;
        } else {
            i11 = 0;
        }
        int i15 = (2096896 & q10) >> 8;
        if ((q10 & 32) != 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        if ((q10 & 16) != 0) {
            k10 = (K) this.f20451i.get(i15);
        } else {
            k10 = null;
        }
        if (k10 == null) {
            this.f20447e.U(x10);
            return 0;
        }
        if (this.f20443a != 2) {
            int i16 = q10 & 15;
            int i17 = this.f20448f.get(i15, i16 - 1);
            this.f20448f.put(i15, i16);
            if (i17 == i16) {
                this.f20447e.U(x10);
                return 0;
            } else if (i16 != ((i17 + 1) & 15)) {
                k10.a();
            }
        }
        if (z11) {
            int H10 = this.f20447e.H();
            if ((this.f20447e.H() & 64) != 0) {
                i12 = 2;
            } else {
                i12 = 0;
            }
            i11 |= i12;
            this.f20447e.V(H10 - 1);
        }
        boolean z12 = this.f20458p;
        if (B(i15)) {
            this.f20447e.T(x10);
            k10.b(this.f20447e, i11);
            this.f20447e.T(g11);
        }
        if (this.f20443a != 2 && !z12 && this.f20458p && a10 != -1) {
            this.f20460r = true;
        }
        this.f20447e.U(x10);
        return 0;
    }

    public boolean j(C2973q qVar) {
        byte[] e10 = this.f20447e.e();
        qVar.l(e10, 0, 940);
        int i10 = 0;
        while (i10 < 188) {
            int i11 = 0;
            while (i11 < 5) {
                if (e10[(i11 * 188) + i10] != 71) {
                    i10++;
                } else {
                    i11++;
                }
            }
            qVar.j(i10);
            return true;
        }
        return false;
    }

    public J(int i10, int i11, s.a aVar, G g10, K.c cVar, int i12) {
        this.f20449g = (K.c) C2076a.e(cVar);
        this.f20445c = i12;
        this.f20443a = i10;
        this.f20444b = i11;
        this.f20450h = aVar;
        if (i10 == 1 || i10 == 2) {
            this.f20446d = Collections.singletonList(g10);
        } else {
            ArrayList arrayList = new ArrayList();
            this.f20446d = arrayList;
            arrayList.add(g10);
        }
        this.f20447e = new C2073A(new byte[9400], 0);
        this.f20452j = new SparseBooleanArray();
        this.f20453k = new SparseBooleanArray();
        this.f20451i = new SparseArray();
        this.f20448f = new SparseIntArray();
        this.f20454l = new H(i12);
        this.f20456n = r.f29275e0;
        this.f20463u = -1;
        A();
    }

    public void release() {
    }

    private class a implements D {

        /* renamed from: a  reason: collision with root package name */
        private final z f20464a = new z(new byte[4]);

        public a() {
        }

        public void b(C2073A a10) {
            if (a10.H() == 0 && (a10.H() & 128) != 0) {
                a10.V(6);
                int a11 = a10.a() / 4;
                for (int i10 = 0; i10 < a11; i10++) {
                    a10.k(this.f20464a, 4);
                    int h10 = this.f20464a.h(16);
                    this.f20464a.r(3);
                    if (h10 == 0) {
                        this.f20464a.r(13);
                    } else {
                        int h11 = this.f20464a.h(13);
                        if (J.this.f20451i.get(h11) == null) {
                            J.this.f20451i.put(h11, new E(new b(h11)));
                            J.m(J.this);
                        }
                    }
                }
                if (J.this.f20443a != 2) {
                    J.this.f20451i.remove(0);
                }
            }
        }

        public void c(G g10, r rVar, K.d dVar) {
        }
    }

    private class b implements D {

        /* renamed from: a  reason: collision with root package name */
        private final z f20466a = new z(new byte[5]);

        /* renamed from: b  reason: collision with root package name */
        private final SparseArray f20467b = new SparseArray();

        /* renamed from: c  reason: collision with root package name */
        private final SparseIntArray f20468c = new SparseIntArray();

        /* renamed from: d  reason: collision with root package name */
        private final int f20469d;

        public b(int i10) {
            this.f20469d = i10;
        }

        private K.b a(C2073A a10, int i10) {
            int i11;
            C2073A a11 = a10;
            int f10 = a10.f();
            int i12 = f10 + i10;
            int i13 = -1;
            String str = null;
            ArrayList arrayList = null;
            int i14 = 0;
            while (a10.f() < i12) {
                int H10 = a10.H();
                int f11 = a10.f() + a10.H();
                if (f11 > i12) {
                    break;
                }
                if (H10 == 5) {
                    long J10 = a10.J();
                    if (J10 != 1094921523) {
                        if (J10 != 1161904947) {
                            if (J10 != 1094921524) {
                                if (J10 == 1212503619) {
                                    i13 = 36;
                                }
                                a11.V(f11 - a10.f());
                            }
                        }
                        i13 = 135;
                        a11.V(f11 - a10.f());
                    }
                    i13 = 129;
                    a11.V(f11 - a10.f());
                } else {
                    if (H10 != 106) {
                        if (H10 != 122) {
                            if (H10 == 127) {
                                int H11 = a10.H();
                                if (H11 != 21) {
                                    if (H11 == 14) {
                                        i13 = 136;
                                    } else if (H11 == 33) {
                                        i13 = 139;
                                    }
                                }
                            } else {
                                if (H10 == 123) {
                                    i11 = 138;
                                } else if (H10 == 10) {
                                    String trim = a11.E(3).trim();
                                    i14 = a10.H();
                                    str = trim;
                                } else if (H10 == 89) {
                                    ArrayList arrayList2 = new ArrayList();
                                    while (a10.f() < f11) {
                                        String trim2 = a11.E(3).trim();
                                        int H12 = a10.H();
                                        byte[] bArr = new byte[4];
                                        a11.l(bArr, 0, 4);
                                        arrayList2.add(new K.a(trim2, H12, bArr));
                                    }
                                    arrayList = arrayList2;
                                    i13 = 89;
                                } else if (H10 == 111) {
                                    i11 = 257;
                                }
                                i13 = i11;
                            }
                            a11.V(f11 - a10.f());
                        }
                        i13 = 135;
                        a11.V(f11 - a10.f());
                    }
                    i13 = 129;
                    a11.V(f11 - a10.f());
                }
                i13 = 172;
                a11.V(f11 - a10.f());
            }
            a11.U(i12);
            return new K.b(i13, str, i14, arrayList, Arrays.copyOfRange(a10.e(), f10, i12));
        }

        public void b(C2073A a10) {
            G g10;
            int i10;
            int i11;
            K k10;
            C2073A a11 = a10;
            if (a10.H() == 2) {
                if (J.this.f20443a == 1 || J.this.f20443a == 2 || J.this.f20457o == 1) {
                    g10 = (G) J.this.f20446d.get(0);
                } else {
                    g10 = new G(((G) J.this.f20446d.get(0)).d());
                    J.this.f20446d.add(g10);
                }
                if ((a10.H() & 128) != 0) {
                    a11.V(1);
                    int N10 = a10.N();
                    int i12 = 3;
                    a11.V(3);
                    a11.k(this.f20466a, 2);
                    this.f20466a.r(3);
                    int i13 = 13;
                    int unused = J.this.f20463u = this.f20466a.h(13);
                    a11.k(this.f20466a, 2);
                    int i14 = 4;
                    this.f20466a.r(4);
                    a11.V(this.f20466a.h(12));
                    if (J.this.f20443a == 2 && J.this.f20461s == null) {
                        K.b bVar = new K.b(21, (String) null, 0, (List) null, L.f22077f);
                        J j10 = J.this;
                        K unused2 = j10.f20461s = j10.f20449g.b(21, bVar);
                        if (J.this.f20461s != null) {
                            J.this.f20461s.c(g10, J.this.f20456n, new K.d(N10, 21, 8192));
                        }
                    }
                    this.f20467b.clear();
                    this.f20468c.clear();
                    int a12 = a10.a();
                    while (a12 > 0) {
                        a11.k(this.f20466a, 5);
                        int h10 = this.f20466a.h(8);
                        this.f20466a.r(i12);
                        int h11 = this.f20466a.h(i13);
                        this.f20466a.r(i14);
                        int h12 = this.f20466a.h(12);
                        K.b a13 = a(a11, h12);
                        if (h10 == 6 || h10 == 5) {
                            h10 = a13.f20474a;
                        }
                        a12 -= h12 + 5;
                        if (J.this.f20443a == 2) {
                            i11 = h10;
                        } else {
                            i11 = h11;
                        }
                        if (!J.this.f20452j.get(i11)) {
                            if (J.this.f20443a == 2 && h10 == 21) {
                                k10 = J.this.f20461s;
                            } else {
                                k10 = J.this.f20449g.b(h10, a13);
                            }
                            if (J.this.f20443a != 2 || h11 < this.f20468c.get(i11, 8192)) {
                                this.f20468c.put(i11, h11);
                                this.f20467b.put(i11, k10);
                            }
                        }
                        i12 = 3;
                        i14 = 4;
                        i13 = 13;
                    }
                    int size = this.f20468c.size();
                    for (int i15 = 0; i15 < size; i15++) {
                        int keyAt = this.f20468c.keyAt(i15);
                        int valueAt = this.f20468c.valueAt(i15);
                        J.this.f20452j.put(keyAt, true);
                        J.this.f20453k.put(valueAt, true);
                        K k11 = (K) this.f20467b.valueAt(i15);
                        if (k11 != null) {
                            if (k11 != J.this.f20461s) {
                                k11.c(g10, J.this.f20456n, new K.d(N10, keyAt, 8192));
                            }
                            J.this.f20451i.put(valueAt, k11);
                        }
                    }
                    if (J.this.f20443a != 2) {
                        J.this.f20451i.remove(this.f20469d);
                        J j11 = J.this;
                        if (j11.f20443a == 1) {
                            i10 = 0;
                        } else {
                            i10 = J.this.f20457o - 1;
                        }
                        int unused3 = j11.f20457o = i10;
                        if (J.this.f20457o == 0) {
                            J.this.f20456n.k();
                            boolean unused4 = J.this.f20458p = true;
                        }
                    } else if (!J.this.f20458p) {
                        J.this.f20456n.k();
                        int unused5 = J.this.f20457o = 0;
                        boolean unused6 = J.this.f20458p = true;
                    }
                }
            }
        }

        public void c(G g10, r rVar, K.d dVar) {
        }
    }
}
