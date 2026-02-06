package t2;

import com.google.common.collect.I;
import f2.H;
import f2.w;
import i2.C2076a;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import k2.x;
import t2.C2615C;
import w2.C2820b;

/* renamed from: t2.M  reason: case insensitive filesystem */
public final class C2625M extends C2641g {

    /* renamed from: v  reason: collision with root package name */
    private static final w f26003v = new w.c().c("MergingMediaSource").a();

    /* renamed from: k  reason: collision with root package name */
    private final boolean f26004k;

    /* renamed from: l  reason: collision with root package name */
    private final boolean f26005l;

    /* renamed from: m  reason: collision with root package name */
    private final C2615C[] f26006m;

    /* renamed from: n  reason: collision with root package name */
    private final H[] f26007n;

    /* renamed from: o  reason: collision with root package name */
    private final ArrayList f26008o;

    /* renamed from: p  reason: collision with root package name */
    private final C2643i f26009p;

    /* renamed from: q  reason: collision with root package name */
    private final Map f26010q;

    /* renamed from: r  reason: collision with root package name */
    private final com.google.common.collect.H f26011r;

    /* renamed from: s  reason: collision with root package name */
    private int f26012s;

    /* renamed from: t  reason: collision with root package name */
    private long[][] f26013t;

    /* renamed from: u  reason: collision with root package name */
    private b f26014u;

    /* renamed from: t2.M$a */
    private static final class a extends C2656v {

        /* renamed from: f  reason: collision with root package name */
        private final long[] f26015f;

        /* renamed from: g  reason: collision with root package name */
        private final long[] f26016g;

        public a(H h10, Map map) {
            super(h10);
            int p10 = h10.p();
            this.f26016g = new long[h10.p()];
            H.c cVar = new H.c();
            for (int i10 = 0; i10 < p10; i10++) {
                this.f26016g[i10] = h10.n(i10, cVar).f19779m;
            }
            int i11 = h10.i();
            this.f26015f = new long[i11];
            H.b bVar = new H.b();
            for (int i12 = 0; i12 < i11; i12++) {
                h10.g(i12, bVar, true);
                long longValue = ((Long) C2076a.e((Long) map.get(bVar.f19745b))).longValue();
                long[] jArr = this.f26015f;
                longValue = longValue == Long.MIN_VALUE ? bVar.f19747d : longValue;
                jArr[i12] = longValue;
                long j10 = bVar.f19747d;
                if (j10 != -9223372036854775807L) {
                    long[] jArr2 = this.f26016g;
                    int i13 = bVar.f19746c;
                    jArr2[i13] = jArr2[i13] - (j10 - longValue);
                }
            }
        }

        public H.b g(int i10, H.b bVar, boolean z10) {
            super.g(i10, bVar, z10);
            bVar.f19747d = this.f26015f[i10];
            return bVar;
        }

        public H.c o(int i10, H.c cVar, long j10) {
            long j11;
            super.o(i10, cVar, j10);
            long j12 = this.f26016g[i10];
            cVar.f19779m = j12;
            if (j12 != -9223372036854775807L) {
                long j13 = cVar.f19778l;
                if (j13 != -9223372036854775807L) {
                    j11 = Math.min(j13, j12);
                    cVar.f19778l = j11;
                    return cVar;
                }
            }
            j11 = cVar.f19778l;
            cVar.f19778l = j11;
            return cVar;
        }
    }

    /* renamed from: t2.M$b */
    public static final class b extends IOException {

        /* renamed from: a  reason: collision with root package name */
        public final int f26017a;

        public b(int i10) {
            this.f26017a = i10;
        }
    }

    public C2625M(C2615C... cArr) {
        this(false, cArr);
    }

    private void I() {
        H.b bVar = new H.b();
        for (int i10 = 0; i10 < this.f26012s; i10++) {
            long j10 = -this.f26007n[0].f(i10, bVar).n();
            int i11 = 1;
            while (true) {
                H[] hArr = this.f26007n;
                if (i11 >= hArr.length) {
                    break;
                }
                this.f26013t[i10][i11] = j10 - (-hArr[i11].f(i10, bVar).n());
                i11++;
            }
        }
    }

    private void L() {
        H[] hArr;
        H.b bVar = new H.b();
        for (int i10 = 0; i10 < this.f26012s; i10++) {
            int i11 = 0;
            long j10 = Long.MIN_VALUE;
            while (true) {
                hArr = this.f26007n;
                if (i11 >= hArr.length) {
                    break;
                }
                long j11 = hArr[i11].f(i10, bVar).j();
                if (j11 != -9223372036854775807L) {
                    long j12 = j11 + this.f26013t[i10][i11];
                    if (j10 == Long.MIN_VALUE || j12 < j10) {
                        j10 = j12;
                    }
                }
                i11++;
            }
            Object m10 = hArr[0].m(i10);
            this.f26010q.put(m10, Long.valueOf(j10));
            for (C2638d u10 : this.f26011r.get(m10)) {
                u10.u(0, j10);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void A() {
        super.A();
        Arrays.fill(this.f26007n, (Object) null);
        this.f26012s = -1;
        this.f26014u = null;
        this.f26008o.clear();
        Collections.addAll(this.f26008o, this.f26006m);
    }

    /* access modifiers changed from: protected */
    /* renamed from: J */
    public C2615C.b C(Integer num, C2615C.b bVar) {
        if (num.intValue() == 0) {
            return bVar;
        }
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: K */
    public void G(Integer num, C2615C c10, H h10) {
        if (this.f26014u == null) {
            if (this.f26012s == -1) {
                this.f26012s = h10.i();
            } else if (h10.i() != this.f26012s) {
                this.f26014u = new b(0);
                return;
            }
            if (this.f26013t.length == 0) {
                int i10 = this.f26012s;
                int[] iArr = new int[2];
                iArr[1] = this.f26007n.length;
                iArr[0] = i10;
                this.f26013t = (long[][]) Array.newInstance(Long.TYPE, iArr);
            }
            this.f26008o.remove(c10);
            this.f26007n[num.intValue()] = h10;
            if (this.f26008o.isEmpty()) {
                if (this.f26004k) {
                    I();
                }
                a aVar = this.f26007n[0];
                if (this.f26005l) {
                    L();
                    aVar = new a(aVar, this.f26010q);
                }
                z(aVar);
            }
        }
    }

    public w a() {
        C2615C[] cArr = this.f26006m;
        if (cArr.length > 0) {
            return cArr[0].a();
        }
        return f26003v;
    }

    public void c() {
        b bVar = this.f26014u;
        if (bVar == null) {
            super.c();
            return;
        }
        throw bVar;
    }

    public void j(C2614B b10) {
        if (this.f26005l) {
            C2638d dVar = (C2638d) b10;
            Iterator it = this.f26011r.a().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry entry = (Map.Entry) it.next();
                if (((C2638d) entry.getValue()).equals(dVar)) {
                    this.f26011r.remove(entry.getKey(), entry.getValue());
                    break;
                }
            }
            b10 = dVar.f26183a;
        }
        C2624L l10 = (C2624L) b10;
        int i10 = 0;
        while (true) {
            C2615C[] cArr = this.f26006m;
            if (i10 < cArr.length) {
                cArr[i10].j(l10.l(i10));
                i10++;
            } else {
                return;
            }
        }
    }

    public void m(w wVar) {
        this.f26006m[0].m(wVar);
    }

    public C2614B o(C2615C.b bVar, C2820b bVar2, long j10) {
        int length = this.f26006m.length;
        C2614B[] bArr = new C2614B[length];
        int b10 = this.f26007n[0].b(bVar.f25960a);
        for (int i10 = 0; i10 < length; i10++) {
            bArr[i10] = this.f26006m[i10].o(bVar.a(this.f26007n[i10].m(b10)), bVar2, j10 - this.f26013t[b10][i10]);
        }
        C2624L l10 = new C2624L(this.f26009p, this.f26013t[b10], bArr);
        if (!this.f26005l) {
            return l10;
        }
        C2638d dVar = new C2638d(l10, true, 0, ((Long) C2076a.e((Long) this.f26010q.get(bVar.f25960a))).longValue());
        this.f26011r.put(bVar.f25960a, dVar);
        return dVar;
    }

    /* access modifiers changed from: protected */
    public void y(x xVar) {
        super.y(xVar);
        for (int i10 = 0; i10 < this.f26006m.length; i10++) {
            H(Integer.valueOf(i10), this.f26006m[i10]);
        }
    }

    public C2625M(boolean z10, C2615C... cArr) {
        this(z10, false, cArr);
    }

    public C2625M(boolean z10, boolean z11, C2615C... cArr) {
        this(z10, z11, new C2644j(), cArr);
    }

    public C2625M(boolean z10, boolean z11, C2643i iVar, C2615C... cArr) {
        this.f26004k = z10;
        this.f26005l = z11;
        this.f26006m = cArr;
        this.f26009p = iVar;
        this.f26008o = new ArrayList(Arrays.asList(cArr));
        this.f26012s = -1;
        this.f26007n = new H[cArr.length];
        this.f26013t = new long[0][];
        this.f26010q = new HashMap();
        this.f26011r = I.a().a().e();
    }
}
