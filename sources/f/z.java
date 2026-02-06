package F;

import E.B;
import Y.C1488g1;
import Y.C1505o0;
import i0.C2057k;
import java.util.List;
import lf.C6514M;
import mf.C6559l;
import yf.C6798l;
import yf.p;

public final class z {

    /* renamed from: a  reason: collision with root package name */
    private final p f2115a;

    /* renamed from: b  reason: collision with root package name */
    private int[] f2116b;

    /* renamed from: c  reason: collision with root package name */
    private final C1505o0 f2117c;

    /* renamed from: d  reason: collision with root package name */
    private int[] f2118d;

    /* renamed from: e  reason: collision with root package name */
    private final C1505o0 f2119e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f2120f;

    /* renamed from: g  reason: collision with root package name */
    private Object f2121g;

    /* renamed from: h  reason: collision with root package name */
    private final B f2122h;

    public z(int[] iArr, int[] iArr2, p pVar) {
        int i10;
        this.f2115a = pVar;
        this.f2116b = iArr;
        this.f2117c = C1488g1.a(a(iArr));
        this.f2118d = iArr2;
        this.f2119e = C1488g1.a(b(iArr, iArr2));
        Integer V02 = C6559l.V0(iArr);
        if (V02 != null) {
            i10 = V02.intValue();
        } else {
            i10 = 0;
        }
        this.f2122h = new B(i10, 90, 200);
    }

    private final int a(int[] iArr) {
        int i10 = Integer.MAX_VALUE;
        for (int i11 : iArr) {
            if (i11 <= 0) {
                return 0;
            }
            if (i10 > i11) {
                i10 = i11;
            }
        }
        if (i10 == Integer.MAX_VALUE) {
            return 0;
        }
        return i10;
    }

    private final int b(int[] iArr, int[] iArr2) {
        int a10 = a(iArr);
        int length = iArr2.length;
        int i10 = Integer.MAX_VALUE;
        for (int i11 = 0; i11 < length; i11++) {
            if (iArr[i11] == a10) {
                i10 = Math.min(i10, iArr2[i11]);
            }
        }
        if (i10 == Integer.MAX_VALUE) {
            return 0;
        }
        return i10;
    }

    private final void i(int i10) {
        this.f2117c.f(i10);
    }

    private final void j(int i10) {
        this.f2119e.f(i10);
    }

    private final void k(int[] iArr, int[] iArr2) {
        this.f2116b = iArr;
        i(a(iArr));
        this.f2118d = iArr2;
        j(b(iArr, iArr2));
    }

    public final int c() {
        return this.f2117c.b();
    }

    public final int[] d() {
        return this.f2116b;
    }

    public final B e() {
        return this.f2122h;
    }

    public final int f() {
        return this.f2119e.b();
    }

    public final int[] g() {
        return this.f2118d;
    }

    public final void h(int i10, int i11) {
        int[] iArr = (int[]) this.f2115a.invoke(Integer.valueOf(i10), Integer.valueOf(this.f2116b.length));
        int length = iArr.length;
        int[] iArr2 = new int[length];
        for (int i12 = 0; i12 < length; i12++) {
            iArr2[i12] = i11;
        }
        k(iArr, iArr2);
        this.f2122h.m(i10);
        this.f2121g = null;
    }

    public final void l(v vVar) {
        C6798l lVar;
        Object obj;
        Object obj2;
        int a10 = a(vVar.m());
        List k10 = vVar.k();
        int size = k10.size();
        int i10 = 0;
        while (true) {
            lVar = null;
            if (i10 >= size) {
                obj = lVar;
                break;
            }
            obj = k10.get(i10);
            if (((x) obj).getIndex() == a10) {
                break;
            }
            i10++;
        }
        x xVar = (x) obj;
        if (xVar != null) {
            obj2 = xVar.getKey();
        } else {
            obj2 = lVar;
        }
        this.f2121g = obj2;
        this.f2122h.m(a10);
        if (this.f2120f || vVar.h() > 0) {
            this.f2120f = true;
            C2057k.a aVar = C2057k.f21728e;
            C2057k d10 = aVar.d();
            if (d10 != null) {
                lVar = d10.h();
            }
            C2057k f10 = aVar.f(d10);
            try {
                k(vVar.m(), vVar.n());
                C6514M m10 = C6514M.f71813a;
            } finally {
                aVar.m(d10, f10, lVar);
            }
        }
    }

    public final void m(int[] iArr) {
        this.f2118d = iArr;
        j(b(this.f2116b, iArr));
    }

    /* JADX INFO: finally extract failed */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v4, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v4, resolved type: int[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int[] n(E.C1150t r6, int[] r7) {
        /*
            r5 = this;
            java.lang.Object r0 = r5.f2121g
            r1 = 0
            java.lang.Integer r2 = mf.C6559l.l0(r7, r1)
            if (r2 == 0) goto L_0x000d
            int r1 = r2.intValue()
        L_0x000d:
            int r6 = E.u.a(r6, r0, r1)
            boolean r0 = mf.C6559l.U(r7, r6)
            if (r0 != 0) goto L_0x0052
            E.B r0 = r5.f2122h
            r0.m(r6)
            i0.k$a r0 = i0.C2057k.f21728e
            i0.k r1 = r0.d()
            if (r1 == 0) goto L_0x0029
            yf.l r2 = r1.h()
            goto L_0x002a
        L_0x0029:
            r2 = 0
        L_0x002a:
            i0.k r3 = r0.f(r1)
            yf.p r4 = r5.f2115a     // Catch:{ all -> 0x004d }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch:{ all -> 0x004d }
            int r7 = r7.length     // Catch:{ all -> 0x004d }
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)     // Catch:{ all -> 0x004d }
            java.lang.Object r6 = r4.invoke(r6, r7)     // Catch:{ all -> 0x004d }
            r7 = r6
            int[] r7 = (int[]) r7     // Catch:{ all -> 0x004d }
            r0.m(r1, r3, r2)
            r5.f2116b = r7
            int r6 = r5.a(r7)
            r5.i(r6)
            goto L_0x0052
        L_0x004d:
            r6 = move-exception
            r0.m(r1, r3, r2)
            throw r6
        L_0x0052:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: F.z.n(E.t, int[]):int[]");
    }
}
