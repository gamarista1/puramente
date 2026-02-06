package A9;

import A9.I;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import ja.A;
import ja.B;
import ja.C3645a;
import ja.M;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import k9.L0;
import q9.k;
import q9.l;
import q9.m;
import q9.p;
import q9.y;
import q9.z;

public final class H implements k {

    /* renamed from: t  reason: collision with root package name */
    public static final p f29471t = new G();
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final int f29472a;

    /* renamed from: b  reason: collision with root package name */
    private final int f29473b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public final List f29474c;

    /* renamed from: d  reason: collision with root package name */
    private final B f29475d;

    /* renamed from: e  reason: collision with root package name */
    private final SparseIntArray f29476e;
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public final I.c f29477f;
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public final SparseArray f29478g;
    /* access modifiers changed from: private */

    /* renamed from: h  reason: collision with root package name */
    public final SparseBooleanArray f29479h;
    /* access modifiers changed from: private */

    /* renamed from: i  reason: collision with root package name */
    public final SparseBooleanArray f29480i;

    /* renamed from: j  reason: collision with root package name */
    private final F f29481j;

    /* renamed from: k  reason: collision with root package name */
    private E f29482k;
    /* access modifiers changed from: private */

    /* renamed from: l  reason: collision with root package name */
    public m f29483l;
    /* access modifiers changed from: private */

    /* renamed from: m  reason: collision with root package name */
    public int f29484m;
    /* access modifiers changed from: private */

    /* renamed from: n  reason: collision with root package name */
    public boolean f29485n;

    /* renamed from: o  reason: collision with root package name */
    private boolean f29486o;

    /* renamed from: p  reason: collision with root package name */
    private boolean f29487p;
    /* access modifiers changed from: private */

    /* renamed from: q  reason: collision with root package name */
    public I f29488q;

    /* renamed from: r  reason: collision with root package name */
    private int f29489r;
    /* access modifiers changed from: private */

    /* renamed from: s  reason: collision with root package name */
    public int f29490s;

    public H() {
        this(0);
    }

    static /* synthetic */ int k(H h10) {
        int i10 = h10.f29484m;
        h10.f29484m = i10 + 1;
        return i10;
    }

    private boolean u(l lVar) {
        byte[] d10 = this.f29475d.d();
        if (9400 - this.f29475d.e() < 188) {
            int a10 = this.f29475d.a();
            if (a10 > 0) {
                System.arraycopy(d10, this.f29475d.e(), d10, 0, a10);
            }
            this.f29475d.N(d10, a10);
        }
        while (this.f29475d.a() < 188) {
            int f10 = this.f29475d.f();
            int read = lVar.read(d10, f10, 9400 - f10);
            if (read == -1) {
                return false;
            }
            this.f29475d.O(f10 + read);
        }
        return true;
    }

    private int v() {
        int e10 = this.f29475d.e();
        int f10 = this.f29475d.f();
        int a10 = J.a(this.f29475d.d(), e10, f10);
        this.f29475d.P(a10);
        int i10 = a10 + 188;
        if (i10 > f10) {
            int i11 = this.f29489r + (a10 - e10);
            this.f29489r = i11;
            if (this.f29472a == 2 && i11 > 376) {
                throw L0.a("Cannot find sync byte. Most likely not a Transport Stream.", (Throwable) null);
            }
        } else {
            this.f29489r = 0;
        }
        return i10;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ k[] w() {
        return new k[]{new H()};
    }

    private void x(long j10) {
        if (!this.f29486o) {
            this.f29486o = true;
            if (this.f29481j.b() != -9223372036854775807L) {
                E e10 = new E(this.f29481j.c(), this.f29481j.b(), j10, this.f29490s, this.f29473b);
                this.f29482k = e10;
                this.f29483l.q(e10.b());
                return;
            }
            this.f29483l.q(new z.b(this.f29481j.b()));
        }
    }

    private void y() {
        this.f29479h.clear();
        this.f29478g.clear();
        SparseArray a10 = this.f29477f.a();
        int size = a10.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.f29478g.put(a10.keyAt(i10), (I) a10.valueAt(i10));
        }
        this.f29478g.put(0, new C(new a()));
        this.f29488q = null;
    }

    private boolean z(int i10) {
        if (this.f29472a == 2 || this.f29485n || !this.f29480i.get(i10, false)) {
            return true;
        }
        return false;
    }

    public void a(long j10, long j11) {
        boolean z10;
        E e10;
        boolean z11;
        if (this.f29472a != 2) {
            z10 = true;
        } else {
            z10 = false;
        }
        C3645a.f(z10);
        int size = this.f29474c.size();
        for (int i10 = 0; i10 < size; i10++) {
            ja.I i11 = (ja.I) this.f29474c.get(i10);
            if (i11.e() == -9223372036854775807L) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (!z11) {
                long c10 = i11.c();
                if (c10 == -9223372036854775807L || c10 == 0 || c10 == j11) {
                    z11 = false;
                } else {
                    z11 = true;
                }
            }
            if (z11) {
                i11.g(j11);
            }
        }
        if (!(j11 == 0 || (e10 = this.f29482k) == null)) {
            e10.h(j11);
        }
        this.f29475d.L(0);
        this.f29476e.clear();
        for (int i12 = 0; i12 < this.f29478g.size(); i12++) {
            ((I) this.f29478g.valueAt(i12)).a();
        }
        this.f29489r = 0;
    }

    public void f(m mVar) {
        this.f29483l = mVar;
    }

    public boolean h(l lVar) {
        byte[] d10 = this.f29475d.d();
        lVar.l(d10, 0, 940);
        int i10 = 0;
        while (i10 < 188) {
            int i11 = 0;
            while (i11 < 5) {
                if (d10[(i11 * 188) + i10] != 71) {
                    i10++;
                } else {
                    i11++;
                }
            }
            lVar.j(i10);
            return true;
        }
        return false;
    }

    public int i(l lVar, y yVar) {
        int i10;
        boolean z10;
        I i11;
        int i12;
        l lVar2 = lVar;
        y yVar2 = yVar;
        long a10 = lVar.a();
        if (this.f29485n) {
            if (a10 != -1 && this.f29472a != 2 && !this.f29481j.d()) {
                return this.f29481j.e(lVar2, yVar2, this.f29490s);
            }
            x(a10);
            if (this.f29487p) {
                this.f29487p = false;
                a(0, 0);
                if (lVar.getPosition() != 0) {
                    yVar2.f47919a = 0;
                    return 1;
                }
            }
            E e10 = this.f29482k;
            if (e10 != null && e10.d()) {
                return this.f29482k.c(lVar2, yVar2);
            }
        }
        if (!u(lVar)) {
            return -1;
        }
        int v10 = v();
        int f10 = this.f29475d.f();
        if (v10 > f10) {
            return 0;
        }
        int n10 = this.f29475d.n();
        if ((8388608 & n10) != 0) {
            this.f29475d.P(v10);
            return 0;
        }
        if ((4194304 & n10) != 0) {
            i10 = 1;
        } else {
            i10 = 0;
        }
        int i13 = (2096896 & n10) >> 8;
        if ((n10 & 32) != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if ((n10 & 16) != 0) {
            i11 = (I) this.f29478g.get(i13);
        } else {
            i11 = null;
        }
        if (i11 == null) {
            this.f29475d.P(v10);
            return 0;
        }
        if (this.f29472a != 2) {
            int i14 = n10 & 15;
            int i15 = this.f29476e.get(i13, i14 - 1);
            this.f29476e.put(i13, i14);
            if (i15 == i14) {
                this.f29475d.P(v10);
                return 0;
            } else if (i14 != ((i15 + 1) & 15)) {
                i11.a();
            }
        }
        if (z10) {
            int D10 = this.f29475d.D();
            if ((this.f29475d.D() & 64) != 0) {
                i12 = 2;
            } else {
                i12 = 0;
            }
            i10 |= i12;
            this.f29475d.Q(D10 - 1);
        }
        boolean z11 = this.f29485n;
        if (z(i13)) {
            this.f29475d.O(v10);
            i11.c(this.f29475d, i10);
            this.f29475d.O(f10);
        }
        if (this.f29472a != 2 && !z11 && this.f29485n && a10 != -1) {
            this.f29487p = true;
        }
        this.f29475d.P(v10);
        return 0;
    }

    public H(int i10) {
        this(1, i10, 112800);
    }

    public H(int i10, int i11, int i12) {
        this(i10, new ja.I(0), new C2993j(i11), i12);
    }

    public H(int i10, ja.I i11, I.c cVar) {
        this(i10, i11, cVar, 112800);
    }

    public H(int i10, ja.I i11, I.c cVar, int i12) {
        this.f29477f = (I.c) C3645a.e(cVar);
        this.f29473b = i12;
        this.f29472a = i10;
        if (i10 == 1 || i10 == 2) {
            this.f29474c = Collections.singletonList(i11);
        } else {
            ArrayList arrayList = new ArrayList();
            this.f29474c = arrayList;
            arrayList.add(i11);
        }
        this.f29475d = new B(new byte[9400], 0);
        this.f29479h = new SparseBooleanArray();
        this.f29480i = new SparseBooleanArray();
        this.f29478g = new SparseArray();
        this.f29476e = new SparseIntArray();
        this.f29481j = new F(i12);
        this.f29483l = m.f47890b0;
        this.f29490s = -1;
        y();
    }

    public void release() {
    }

    private class a implements B {

        /* renamed from: a  reason: collision with root package name */
        private final A f29491a = new A(new byte[4]);

        public a() {
        }

        public void c(B b10) {
            if (b10.D() == 0 && (b10.D() & 128) != 0) {
                b10.Q(6);
                int a10 = b10.a() / 4;
                for (int i10 = 0; i10 < a10; i10++) {
                    b10.i(this.f29491a, 4);
                    int h10 = this.f29491a.h(16);
                    this.f29491a.r(3);
                    if (h10 == 0) {
                        this.f29491a.r(13);
                    } else {
                        int h11 = this.f29491a.h(13);
                        if (H.this.f29478g.get(h11) == null) {
                            H.this.f29478g.put(h11, new C(new b(h11)));
                            H.k(H.this);
                        }
                    }
                }
                if (H.this.f29472a != 2) {
                    H.this.f29478g.remove(0);
                }
            }
        }

        public void b(ja.I i10, m mVar, I.d dVar) {
        }
    }

    private class b implements B {

        /* renamed from: a  reason: collision with root package name */
        private final A f29493a = new A(new byte[5]);

        /* renamed from: b  reason: collision with root package name */
        private final SparseArray f29494b = new SparseArray();

        /* renamed from: c  reason: collision with root package name */
        private final SparseIntArray f29495c = new SparseIntArray();

        /* renamed from: d  reason: collision with root package name */
        private final int f29496d;

        public b(int i10) {
            this.f29496d = i10;
        }

        private I.b a(B b10, int i10) {
            int e10 = b10.e();
            int i11 = i10 + e10;
            int i12 = -1;
            String str = null;
            ArrayList arrayList = null;
            while (b10.e() < i11) {
                int D10 = b10.D();
                int e11 = b10.e() + b10.D();
                if (e11 > i11) {
                    break;
                }
                if (D10 == 5) {
                    long F10 = b10.F();
                    if (F10 != 1094921523) {
                        if (F10 != 1161904947) {
                            if (F10 != 1094921524) {
                                if (F10 == 1212503619) {
                                    i12 = 36;
                                }
                                b10.Q(e11 - b10.e());
                            }
                        }
                        i12 = 135;
                        b10.Q(e11 - b10.e());
                    }
                    i12 = 129;
                    b10.Q(e11 - b10.e());
                } else {
                    if (D10 != 106) {
                        if (D10 != 122) {
                            if (D10 == 127) {
                                if (b10.D() != 21) {
                                }
                            } else if (D10 == 123) {
                                i12 = 138;
                            } else if (D10 == 10) {
                                str = b10.A(3).trim();
                            } else if (D10 == 89) {
                                ArrayList arrayList2 = new ArrayList();
                                while (b10.e() < e11) {
                                    String trim = b10.A(3).trim();
                                    int D11 = b10.D();
                                    byte[] bArr = new byte[4];
                                    b10.j(bArr, 0, 4);
                                    arrayList2.add(new I.a(trim, D11, bArr));
                                }
                                arrayList = arrayList2;
                                i12 = 89;
                            } else if (D10 == 111) {
                                i12 = 257;
                            }
                            b10.Q(e11 - b10.e());
                        }
                        i12 = 135;
                        b10.Q(e11 - b10.e());
                    }
                    i12 = 129;
                    b10.Q(e11 - b10.e());
                }
                i12 = 172;
                b10.Q(e11 - b10.e());
            }
            b10.P(i11);
            return new I.b(i12, str, arrayList, Arrays.copyOfRange(b10.d(), e10, i11));
        }

        public void c(B b10) {
            ja.I i10;
            int i11;
            int i12;
            I i13;
            B b11 = b10;
            if (b10.D() == 2) {
                if (H.this.f29472a == 1 || H.this.f29472a == 2 || H.this.f29484m == 1) {
                    i10 = (ja.I) H.this.f29474c.get(0);
                } else {
                    i10 = new ja.I(((ja.I) H.this.f29474c.get(0)).c());
                    H.this.f29474c.add(i10);
                }
                if ((b10.D() & 128) != 0) {
                    b11.Q(1);
                    int J10 = b10.J();
                    int i14 = 3;
                    b11.Q(3);
                    b11.i(this.f29493a, 2);
                    this.f29493a.r(3);
                    int i15 = 13;
                    int unused = H.this.f29490s = this.f29493a.h(13);
                    b11.i(this.f29493a, 2);
                    int i16 = 4;
                    this.f29493a.r(4);
                    b11.Q(this.f29493a.h(12));
                    if (H.this.f29472a == 2 && H.this.f29488q == null) {
                        I.b bVar = new I.b(21, (String) null, (List) null, M.f44986f);
                        H h10 = H.this;
                        I unused2 = h10.f29488q = h10.f29477f.b(21, bVar);
                        if (H.this.f29488q != null) {
                            H.this.f29488q.b(i10, H.this.f29483l, new I.d(J10, 21, 8192));
                        }
                    }
                    this.f29494b.clear();
                    this.f29495c.clear();
                    int a10 = b10.a();
                    while (a10 > 0) {
                        b11.i(this.f29493a, 5);
                        int h11 = this.f29493a.h(8);
                        this.f29493a.r(i14);
                        int h12 = this.f29493a.h(i15);
                        this.f29493a.r(i16);
                        int h13 = this.f29493a.h(12);
                        I.b a11 = a(b11, h13);
                        if (h11 == 6 || h11 == 5) {
                            h11 = a11.f29501a;
                        }
                        a10 -= h13 + 5;
                        if (H.this.f29472a == 2) {
                            i12 = h11;
                        } else {
                            i12 = h12;
                        }
                        if (!H.this.f29479h.get(i12)) {
                            if (H.this.f29472a == 2 && h11 == 21) {
                                i13 = H.this.f29488q;
                            } else {
                                i13 = H.this.f29477f.b(h11, a11);
                            }
                            if (H.this.f29472a != 2 || h12 < this.f29495c.get(i12, 8192)) {
                                this.f29495c.put(i12, h12);
                                this.f29494b.put(i12, i13);
                            }
                        }
                        i14 = 3;
                        i16 = 4;
                        i15 = 13;
                    }
                    int size = this.f29495c.size();
                    for (int i17 = 0; i17 < size; i17++) {
                        int keyAt = this.f29495c.keyAt(i17);
                        int valueAt = this.f29495c.valueAt(i17);
                        H.this.f29479h.put(keyAt, true);
                        H.this.f29480i.put(valueAt, true);
                        I i18 = (I) this.f29494b.valueAt(i17);
                        if (i18 != null) {
                            if (i18 != H.this.f29488q) {
                                i18.b(i10, H.this.f29483l, new I.d(J10, keyAt, 8192));
                            }
                            H.this.f29478g.put(valueAt, i18);
                        }
                    }
                    if (H.this.f29472a != 2) {
                        H.this.f29478g.remove(this.f29496d);
                        H h14 = H.this;
                        if (h14.f29472a == 1) {
                            i11 = 0;
                        } else {
                            i11 = H.this.f29484m - 1;
                        }
                        int unused3 = h14.f29484m = i11;
                        if (H.this.f29484m == 0) {
                            H.this.f29483l.k();
                            boolean unused4 = H.this.f29485n = true;
                        }
                    } else if (!H.this.f29485n) {
                        H.this.f29483l.k();
                        int unused5 = H.this.f29484m = 0;
                        boolean unused6 = H.this.f29485n = true;
                    }
                }
            }
        }

        public void b(ja.I i10, m mVar, I.d dVar) {
        }
    }
}
