package t2;

import androidx.media3.exoplayer.U;
import com.google.common.collect.E;
import com.revenuecat.purchases.common.Constants;
import f2.I;
import f2.s;
import i2.C2076a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.IdentityHashMap;
import m2.C2190B;
import t2.C2614B;
import v2.x;

/* renamed from: t2.L  reason: case insensitive filesystem */
final class C2624L implements C2614B, C2614B.a {

    /* renamed from: a  reason: collision with root package name */
    private final C2614B[] f25992a;

    /* renamed from: b  reason: collision with root package name */
    private final IdentityHashMap f25993b;

    /* renamed from: c  reason: collision with root package name */
    private final C2643i f25994c;

    /* renamed from: d  reason: collision with root package name */
    private final ArrayList f25995d = new ArrayList();

    /* renamed from: e  reason: collision with root package name */
    private final HashMap f25996e = new HashMap();

    /* renamed from: f  reason: collision with root package name */
    private C2614B.a f25997f;

    /* renamed from: g  reason: collision with root package name */
    private j0 f25998g;

    /* renamed from: h  reason: collision with root package name */
    private C2614B[] f25999h;

    /* renamed from: i  reason: collision with root package name */
    private a0 f26000i;

    /* renamed from: t2.L$a */
    private static final class a implements x {

        /* renamed from: a  reason: collision with root package name */
        private final x f26001a;

        /* renamed from: b  reason: collision with root package name */
        private final I f26002b;

        public a(x xVar, I i10) {
            this.f26001a = xVar;
            this.f26002b = i10;
        }

        public s b(int i10) {
            return this.f26002b.a(this.f26001a.c(i10));
        }

        public int c(int i10) {
            return this.f26001a.c(i10);
        }

        public void d(float f10) {
            this.f26001a.d(f10);
        }

        public void disable() {
            this.f26001a.disable();
        }

        public void e() {
            this.f26001a.e();
        }

        public void enable() {
            this.f26001a.enable();
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (!this.f26001a.equals(aVar.f26001a) || !this.f26002b.equals(aVar.f26002b)) {
                return false;
            }
            return true;
        }

        public int f(int i10) {
            return this.f26001a.f(i10);
        }

        public I g() {
            return this.f26002b;
        }

        public void h(boolean z10) {
            this.f26001a.h(z10);
        }

        public int hashCode() {
            return ((527 + this.f26002b.hashCode()) * 31) + this.f26001a.hashCode();
        }

        public int i() {
            return this.f26001a.i();
        }

        public s j() {
            return this.f26002b.a(this.f26001a.i());
        }

        public void k() {
            this.f26001a.k();
        }

        public int length() {
            return this.f26001a.length();
        }
    }

    public C2624L(C2643i iVar, long[] jArr, C2614B... bArr) {
        this.f25994c = iVar;
        this.f25992a = bArr;
        this.f26000i = iVar.b();
        this.f25993b = new IdentityHashMap();
        this.f25999h = new C2614B[0];
        for (int i10 = 0; i10 < bArr.length; i10++) {
            long j10 = jArr[i10];
            if (j10 != 0) {
                this.f25992a[i10] = new g0(bArr[i10], j10);
            }
        }
    }

    public long a() {
        return this.f26000i.a();
    }

    public boolean b() {
        return this.f26000i.b();
    }

    public long c() {
        return this.f26000i.c();
    }

    public boolean e(U u10) {
        if (this.f25995d.isEmpty()) {
            return this.f26000i.e(u10);
        }
        int size = this.f25995d.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((C2614B) this.f25995d.get(i10)).e(u10);
        }
        return false;
    }

    public void f(long j10) {
        this.f26000i.f(j10);
    }

    public long g(long j10) {
        long g10 = this.f25999h[0].g(j10);
        int i10 = 1;
        while (true) {
            C2614B[] bArr = this.f25999h;
            if (i10 >= bArr.length) {
                return g10;
            }
            if (bArr[i10].g(g10) == g10) {
                i10++;
            } else {
                throw new IllegalStateException("Unexpected child seekToUs result.");
            }
        }
    }

    public long h() {
        long j10 = -9223372036854775807L;
        for (C2614B b10 : this.f25999h) {
            long h10 = b10.h();
            if (h10 != -9223372036854775807L) {
                if (j10 == -9223372036854775807L) {
                    C2614B[] bArr = this.f25999h;
                    int length = bArr.length;
                    int i10 = 0;
                    while (i10 < length) {
                        C2614B b11 = bArr[i10];
                        if (b11 == b10) {
                            break;
                        } else if (b11.g(h10) == h10) {
                            i10++;
                        } else {
                            throw new IllegalStateException("Unexpected child seekToUs result.");
                        }
                    }
                    j10 = h10;
                } else if (h10 != j10) {
                    throw new IllegalStateException("Conflicting discontinuities.");
                }
            } else if (!(j10 == -9223372036854775807L || b10.g(j10) == j10)) {
                throw new IllegalStateException("Unexpected child seekToUs result.");
            }
        }
        return j10;
    }

    public void i(C2614B b10) {
        this.f25995d.remove(b10);
        if (this.f25995d.isEmpty()) {
            int i10 = 0;
            for (C2614B n10 : this.f25992a) {
                i10 += n10.n().f26271a;
            }
            I[] iArr = new I[i10];
            int i11 = 0;
            int i12 = 0;
            while (true) {
                C2614B[] bArr = this.f25992a;
                if (i11 < bArr.length) {
                    j0 n11 = bArr[i11].n();
                    int i13 = n11.f26271a;
                    int i14 = 0;
                    while (i14 < i13) {
                        I b11 = n11.b(i14);
                        s[] sVarArr = new s[b11.f19785a];
                        for (int i15 = 0; i15 < b11.f19785a; i15++) {
                            s a10 = b11.a(i15);
                            s.b a11 = a10.a();
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append(i11);
                            sb2.append(Constants.SUBS_ID_BASE_PLAN_ID_SEPARATOR);
                            String str = a10.f20070a;
                            if (str == null) {
                                str = "";
                            }
                            sb2.append(str);
                            sVarArr[i15] = a11.a0(sb2.toString()).K();
                        }
                        I i16 = new I(i11 + Constants.SUBS_ID_BASE_PLAN_ID_SEPARATOR + b11.f19786b, sVarArr);
                        this.f25996e.put(i16, b11);
                        iArr[i12] = i16;
                        i14++;
                        i12++;
                    }
                    i11++;
                } else {
                    this.f25998g = new j0(iArr);
                    ((C2614B.a) C2076a.e(this.f25997f)).i(this);
                    return;
                }
            }
        }
    }

    public void j() {
        for (C2614B j10 : this.f25992a) {
            j10.j();
        }
    }

    public C2614B l(int i10) {
        C2614B b10 = this.f25992a[i10];
        if (b10 instanceof g0) {
            return ((g0) b10).k();
        }
        return b10;
    }

    public j0 n() {
        return (j0) C2076a.e(this.f25998g);
    }

    public void o(long j10, boolean z10) {
        for (C2614B o10 : this.f25999h) {
            o10.o(j10, z10);
        }
    }

    public void p(C2614B.a aVar, long j10) {
        this.f25997f = aVar;
        Collections.addAll(this.f25995d, this.f25992a);
        for (C2614B p10 : this.f25992a) {
            p10.p(this, j10);
        }
    }

    /* renamed from: q */
    public void d(C2614B b10) {
        ((C2614B.a) C2076a.e(this.f25997f)).d(this);
    }

    public long s(long j10, C2190B b10) {
        C2614B b11;
        C2614B[] bArr = this.f25999h;
        if (bArr.length > 0) {
            b11 = bArr[0];
        } else {
            b11 = this.f25992a[0];
        }
        return b11.s(j10, b10);
    }

    public long t(x[] xVarArr, boolean[] zArr, Z[] zArr2, boolean[] zArr3, long j10) {
        Integer num;
        Integer num2;
        int i10;
        x[] xVarArr2 = xVarArr;
        Z[] zArr4 = zArr2;
        int[] iArr = new int[xVarArr2.length];
        int[] iArr2 = new int[xVarArr2.length];
        int i11 = 0;
        int i12 = 0;
        while (true) {
            num = 0;
            if (i12 >= xVarArr2.length) {
                break;
            }
            Z z10 = zArr4[i12];
            if (z10 != null) {
                num = (Integer) this.f25993b.get(z10);
            }
            if (num == null) {
                i10 = -1;
            } else {
                i10 = num.intValue();
            }
            iArr[i12] = i10;
            x xVar = xVarArr2[i12];
            if (xVar != null) {
                String str = xVar.g().f19786b;
                iArr2[i12] = Integer.parseInt(str.substring(0, str.indexOf(Constants.SUBS_ID_BASE_PLAN_ID_SEPARATOR)));
            } else {
                iArr2[i12] = -1;
            }
            i12++;
        }
        this.f25993b.clear();
        int length = xVarArr2.length;
        Z[] zArr5 = new Z[length];
        Z[] zArr6 = new Z[xVarArr2.length];
        x[] xVarArr3 = new x[xVarArr2.length];
        ArrayList arrayList = new ArrayList(this.f25992a.length);
        long j11 = j10;
        int i13 = 0;
        while (i13 < this.f25992a.length) {
            for (int i14 = i11; i14 < xVarArr2.length; i14++) {
                if (iArr[i14] == i13) {
                    num2 = zArr4[i14];
                } else {
                    num2 = num;
                }
                zArr6[i14] = num2;
                if (iArr2[i14] == i13) {
                    x xVar2 = (x) C2076a.e(xVarArr2[i14]);
                    xVarArr3[i14] = new a(xVar2, (I) C2076a.e((I) this.f25996e.get(xVar2.g())));
                } else {
                    xVarArr3[i14] = num;
                }
            }
            int i15 = i13;
            ArrayList arrayList2 = arrayList;
            x[] xVarArr4 = xVarArr3;
            long t10 = this.f25992a[i13].t(xVarArr3, zArr, zArr6, zArr3, j11);
            if (i15 == 0) {
                j11 = t10;
            } else if (t10 != j11) {
                throw new IllegalStateException("Children enabled at different positions.");
            }
            boolean z11 = false;
            for (int i16 = 0; i16 < xVarArr2.length; i16++) {
                boolean z12 = true;
                if (iArr2[i16] == i15) {
                    zArr5[i16] = zArr6[i16];
                    this.f25993b.put((Z) C2076a.e(zArr6[i16]), Integer.valueOf(i15));
                    z11 = true;
                } else if (iArr[i16] == i15) {
                    if (zArr6[i16] != null) {
                        z12 = false;
                    }
                    C2076a.g(z12);
                }
            }
            if (z11) {
                arrayList2.add(this.f25992a[i15]);
            }
            i13 = i15 + 1;
            arrayList = arrayList2;
            xVarArr3 = xVarArr4;
            i11 = 0;
            num = null;
        }
        int i17 = i11;
        ArrayList arrayList3 = arrayList;
        System.arraycopy(zArr5, i17, zArr4, i17, length);
        this.f25999h = (C2614B[]) arrayList3.toArray(new C2614B[i17]);
        this.f26000i = this.f25994c.a(arrayList3, E.k(arrayList3, new C2623K()));
        return j11;
    }
}
