package D;

import H0.G;
import Ug.K;
import c1.d;
import c1.s;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import yf.C6798l;
import z.q;

public final class r implements p, G {

    /* renamed from: a  reason: collision with root package name */
    private final s f1306a;

    /* renamed from: b  reason: collision with root package name */
    private int f1307b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f1308c;

    /* renamed from: d  reason: collision with root package name */
    private float f1309d;

    /* renamed from: e  reason: collision with root package name */
    private final float f1310e;

    /* renamed from: f  reason: collision with root package name */
    private final boolean f1311f;

    /* renamed from: g  reason: collision with root package name */
    private final K f1312g;

    /* renamed from: h  reason: collision with root package name */
    private final d f1313h;

    /* renamed from: i  reason: collision with root package name */
    private final long f1314i;

    /* renamed from: j  reason: collision with root package name */
    private final List f1315j;

    /* renamed from: k  reason: collision with root package name */
    private final int f1316k;

    /* renamed from: l  reason: collision with root package name */
    private final int f1317l;

    /* renamed from: m  reason: collision with root package name */
    private final int f1318m;

    /* renamed from: n  reason: collision with root package name */
    private final boolean f1319n;

    /* renamed from: o  reason: collision with root package name */
    private final q f1320o;

    /* renamed from: p  reason: collision with root package name */
    private final int f1321p;

    /* renamed from: q  reason: collision with root package name */
    private final int f1322q;

    /* renamed from: r  reason: collision with root package name */
    private final /* synthetic */ G f1323r;

    public /* synthetic */ r(s sVar, int i10, boolean z10, float f10, G g10, float f11, boolean z11, K k10, d dVar, long j10, List list, int i11, int i12, int i13, boolean z12, q qVar, int i14, int i15, DefaultConstructorMarker defaultConstructorMarker) {
        this(sVar, i10, z10, f10, g10, f11, z11, k10, dVar, j10, list, i11, i12, i13, z12, qVar, i14, i15);
    }

    public long a() {
        return s.a(e(), d());
    }

    public int b() {
        return this.f1321p;
    }

    public q c() {
        return this.f1320o;
    }

    public int d() {
        return this.f1323r.d();
    }

    public int e() {
        return this.f1323r.e();
    }

    public int f() {
        return -j();
    }

    public int g() {
        return this.f1317l;
    }

    public int h() {
        return this.f1318m;
    }

    public int i() {
        return this.f1322q;
    }

    public int j() {
        return this.f1316k;
    }

    public List k() {
        return this.f1315j;
    }

    public final boolean l() {
        int i10;
        s sVar = this.f1306a;
        if (sVar != null) {
            i10 = sVar.getIndex();
        } else {
            i10 = 0;
        }
        if (i10 == 0 && this.f1307b == 0) {
            return false;
        }
        return true;
    }

    public final boolean m() {
        return this.f1308c;
    }

    public final long n() {
        return this.f1314i;
    }

    public final float o() {
        return this.f1309d;
    }

    public Map p() {
        return this.f1323r.p();
    }

    public void q() {
        this.f1323r.q();
    }

    public C6798l r() {
        return this.f1323r.r();
    }

    public final K s() {
        return this.f1312g;
    }

    public final d t() {
        return this.f1313h;
    }

    public final s u() {
        return this.f1306a;
    }

    public final int v() {
        return this.f1307b;
    }

    public final float w() {
        return this.f1310e;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: boolean} */
    /* JADX WARNING: type inference failed for: r1v0 */
    /* JADX WARNING: type inference failed for: r1v2, types: [int] */
    /* JADX WARNING: type inference failed for: r1v3 */
    /* JADX WARNING: type inference failed for: r1v5 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean x(int r5, boolean r6) {
        /*
            r4 = this;
            boolean r0 = r4.f1311f
            r1 = 0
            if (r0 != 0) goto L_0x00a4
            java.util.List r0 = r4.k()
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x00a4
            D.s r0 = r4.f1306a
            if (r0 == 0) goto L_0x00a4
            int r0 = r0.i()
            int r2 = r4.f1307b
            int r2 = r2 - r5
            if (r2 < 0) goto L_0x00a4
            if (r2 >= r0) goto L_0x00a4
            java.util.List r0 = r4.k()
            java.lang.Object r0 = mf.C6565s.o0(r0)
            D.s r0 = (D.s) r0
            java.util.List r2 = r4.k()
            java.lang.Object r2 = mf.C6565s.z0(r2)
            D.s r2 = (D.s) r2
            boolean r3 = r0.p()
            if (r3 != 0) goto L_0x00a4
            boolean r3 = r2.p()
            if (r3 == 0) goto L_0x003f
            goto L_0x00a4
        L_0x003f:
            if (r5 >= 0) goto L_0x0065
            int r3 = r0.a()
            int r0 = r0.i()
            int r3 = r3 + r0
            int r0 = r4.j()
            int r3 = r3 - r0
            int r0 = r2.a()
            int r2 = r2.i()
            int r0 = r0 + r2
            int r2 = r4.g()
            int r0 = r0 - r2
            int r0 = java.lang.Math.min(r3, r0)
            int r2 = -r5
            if (r0 <= r2) goto L_0x00a4
            goto L_0x007d
        L_0x0065:
            int r3 = r4.j()
            int r0 = r0.a()
            int r3 = r3 - r0
            int r0 = r4.g()
            int r2 = r2.a()
            int r0 = r0 - r2
            int r0 = java.lang.Math.min(r3, r0)
            if (r0 <= r5) goto L_0x00a4
        L_0x007d:
            int r0 = r4.f1307b
            int r0 = r0 - r5
            r4.f1307b = r0
            java.util.List r0 = r4.k()
            int r2 = r0.size()
        L_0x008a:
            if (r1 >= r2) goto L_0x0098
            java.lang.Object r3 = r0.get(r1)
            D.s r3 = (D.s) r3
            r3.b(r5, r6)
            int r1 = r1 + 1
            goto L_0x008a
        L_0x0098:
            float r6 = (float) r5
            r4.f1309d = r6
            boolean r6 = r4.f1308c
            r1 = 1
            if (r6 != 0) goto L_0x00a4
            if (r5 <= 0) goto L_0x00a4
            r4.f1308c = r1
        L_0x00a4:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: D.r.x(int, boolean):boolean");
    }

    private r(s sVar, int i10, boolean z10, float f10, G g10, float f11, boolean z11, K k10, d dVar, long j10, List list, int i11, int i12, int i13, boolean z12, q qVar, int i14, int i15) {
        this.f1306a = sVar;
        this.f1307b = i10;
        this.f1308c = z10;
        this.f1309d = f10;
        this.f1310e = f11;
        this.f1311f = z11;
        this.f1312g = k10;
        this.f1313h = dVar;
        this.f1314i = j10;
        this.f1315j = list;
        this.f1316k = i11;
        this.f1317l = i12;
        this.f1318m = i13;
        this.f1319n = z12;
        this.f1320o = qVar;
        this.f1321p = i14;
        this.f1322q = i15;
        this.f1323r = g10;
    }
}
