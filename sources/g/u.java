package G;

import A.j;
import H0.G;
import Ug.K;
import c1.s;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mf.C6565s;
import yf.C6798l;
import z.q;

public final class u implements n, G {

    /* renamed from: a  reason: collision with root package name */
    private final List f2406a;

    /* renamed from: b  reason: collision with root package name */
    private final int f2407b;

    /* renamed from: c  reason: collision with root package name */
    private final int f2408c;

    /* renamed from: d  reason: collision with root package name */
    private final int f2409d;

    /* renamed from: e  reason: collision with root package name */
    private final q f2410e;

    /* renamed from: f  reason: collision with root package name */
    private final int f2411f;

    /* renamed from: g  reason: collision with root package name */
    private final int f2412g;

    /* renamed from: h  reason: collision with root package name */
    private final boolean f2413h;

    /* renamed from: i  reason: collision with root package name */
    private final int f2414i;

    /* renamed from: j  reason: collision with root package name */
    private final C1179e f2415j;

    /* renamed from: k  reason: collision with root package name */
    private final C1179e f2416k;

    /* renamed from: l  reason: collision with root package name */
    private float f2417l;

    /* renamed from: m  reason: collision with root package name */
    private int f2418m;

    /* renamed from: n  reason: collision with root package name */
    private boolean f2419n;

    /* renamed from: o  reason: collision with root package name */
    private final j f2420o;

    /* renamed from: p  reason: collision with root package name */
    private final boolean f2421p;

    /* renamed from: q  reason: collision with root package name */
    private final List f2422q;

    /* renamed from: r  reason: collision with root package name */
    private final List f2423r;

    /* renamed from: s  reason: collision with root package name */
    private final K f2424s;

    /* renamed from: t  reason: collision with root package name */
    private final /* synthetic */ G f2425t;

    public u(List list, int i10, int i11, int i12, q qVar, int i13, int i14, boolean z10, int i15, C1179e eVar, C1179e eVar2, float f10, int i16, boolean z11, j jVar, G g10, boolean z12, List list2, List list3, K k10) {
        this.f2406a = list;
        this.f2407b = i10;
        this.f2408c = i11;
        this.f2409d = i12;
        this.f2410e = qVar;
        this.f2411f = i13;
        this.f2412g = i14;
        this.f2413h = z10;
        this.f2414i = i15;
        this.f2415j = eVar;
        this.f2416k = eVar2;
        this.f2417l = f10;
        this.f2418m = i16;
        this.f2419n = z11;
        this.f2420o = jVar;
        this.f2421p = z12;
        this.f2422q = list2;
        this.f2423r = list3;
        this.f2424s = k10;
        this.f2425t = g10;
    }

    public long a() {
        return s.a(e(), d());
    }

    public int b() {
        return this.f2409d;
    }

    public q c() {
        return this.f2410e;
    }

    public int d() {
        return this.f2425t.d();
    }

    public int e() {
        return this.f2425t.e();
    }

    public int f() {
        return -j();
    }

    public int g() {
        return this.f2412g;
    }

    public boolean h() {
        return this.f2413h;
    }

    public int i() {
        return this.f2407b;
    }

    public int j() {
        return this.f2411f;
    }

    public List k() {
        return this.f2406a;
    }

    public int l() {
        return this.f2408c;
    }

    public int m() {
        return this.f2414i;
    }

    public j n() {
        return this.f2420o;
    }

    public final boolean o() {
        int i10;
        C1179e eVar = this.f2415j;
        if (eVar != null) {
            i10 = eVar.getIndex();
        } else {
            i10 = 0;
        }
        if (i10 == 0 && this.f2418m == 0) {
            return false;
        }
        return true;
    }

    public Map p() {
        return this.f2425t.p();
    }

    public void q() {
        this.f2425t.q();
    }

    public C6798l r() {
        return this.f2425t.r();
    }

    public final boolean s() {
        return this.f2419n;
    }

    public final C1179e t() {
        return this.f2416k;
    }

    public final float u() {
        return this.f2417l;
    }

    public final C1179e v() {
        return this.f2415j;
    }

    public final int w() {
        return this.f2418m;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: boolean} */
    /* JADX WARNING: type inference failed for: r2v0 */
    /* JADX WARNING: type inference failed for: r2v2, types: [int] */
    /* JADX WARNING: type inference failed for: r2v3 */
    /* JADX WARNING: type inference failed for: r2v5 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean x(int r7) {
        /*
            r6 = this;
            int r0 = r6.i()
            int r1 = r6.l()
            int r0 = r0 + r1
            boolean r1 = r6.f2421p
            r2 = 0
            if (r1 != 0) goto L_0x00dc
            java.util.List r1 = r6.k()
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L_0x00dc
            G.e r1 = r6.f2415j
            if (r1 == 0) goto L_0x00dc
            int r1 = r6.f2418m
            int r1 = r1 - r7
            if (r1 < 0) goto L_0x00dc
            if (r1 >= r0) goto L_0x00dc
            if (r0 == 0) goto L_0x0029
            float r1 = (float) r7
            float r3 = (float) r0
            float r1 = r1 / r3
            goto L_0x002a
        L_0x0029:
            r1 = 0
        L_0x002a:
            float r3 = r6.f2417l
            float r3 = r3 - r1
            G.e r4 = r6.f2416k
            if (r4 == 0) goto L_0x00dc
            r4 = 1056964608(0x3f000000, float:0.5)
            int r4 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r4 >= 0) goto L_0x00dc
            r4 = -1090519040(0xffffffffbf000000, float:-0.5)
            int r3 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r3 > 0) goto L_0x003f
            goto L_0x00dc
        L_0x003f:
            java.util.List r3 = r6.k()
            java.lang.Object r3 = mf.C6565s.o0(r3)
            G.e r3 = (G.C1179e) r3
            java.util.List r4 = r6.k()
            java.lang.Object r4 = mf.C6565s.z0(r4)
            G.e r4 = (G.C1179e) r4
            if (r7 >= 0) goto L_0x0071
            int r3 = r3.a()
            int r3 = r3 + r0
            int r5 = r6.j()
            int r3 = r3 - r5
            int r4 = r4.a()
            int r4 = r4 + r0
            int r0 = r6.g()
            int r4 = r4 - r0
            int r0 = java.lang.Math.min(r3, r4)
            int r3 = -r7
            if (r0 <= r3) goto L_0x00dc
            goto L_0x0089
        L_0x0071:
            int r0 = r6.j()
            int r3 = r3.a()
            int r0 = r0 - r3
            int r3 = r6.g()
            int r4 = r4.a()
            int r3 = r3 - r4
            int r0 = java.lang.Math.min(r0, r3)
            if (r0 <= r7) goto L_0x00dc
        L_0x0089:
            float r0 = r6.f2417l
            float r0 = r0 - r1
            r6.f2417l = r0
            int r0 = r6.f2418m
            int r0 = r0 - r7
            r6.f2418m = r0
            java.util.List r0 = r6.k()
            int r1 = r0.size()
            r3 = r2
        L_0x009c:
            if (r3 >= r1) goto L_0x00aa
            java.lang.Object r4 = r0.get(r3)
            G.e r4 = (G.C1179e) r4
            r4.b(r7)
            int r3 = r3 + 1
            goto L_0x009c
        L_0x00aa:
            java.util.List r0 = r6.f2422q
            int r1 = r0.size()
            r3 = r2
        L_0x00b1:
            if (r3 >= r1) goto L_0x00bf
            java.lang.Object r4 = r0.get(r3)
            G.e r4 = (G.C1179e) r4
            r4.b(r7)
            int r3 = r3 + 1
            goto L_0x00b1
        L_0x00bf:
            java.util.List r0 = r6.f2423r
            int r1 = r0.size()
        L_0x00c5:
            if (r2 >= r1) goto L_0x00d3
            java.lang.Object r3 = r0.get(r2)
            G.e r3 = (G.C1179e) r3
            r3.b(r7)
            int r2 = r2 + 1
            goto L_0x00c5
        L_0x00d3:
            boolean r0 = r6.f2419n
            r2 = 1
            if (r0 != 0) goto L_0x00dc
            if (r7 <= 0) goto L_0x00dc
            r6.f2419n = r2
        L_0x00dc:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: G.u.x(int):boolean");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u(List list, int i10, int i11, int i12, q qVar, int i13, int i14, boolean z10, int i15, C1179e eVar, C1179e eVar2, float f10, int i16, boolean z11, j jVar, G g10, boolean z12, List list2, List list3, K k10, int i17, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, i10, i11, i12, qVar, i13, i14, z10, i15, eVar, eVar2, f10, i16, z11, jVar, g10, z12, (i17 & 131072) != 0 ? C6565s.n() : list2, (i17 & 262144) != 0 ? C6565s.n() : list3, k10);
    }
}
