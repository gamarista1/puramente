package f1;

import f1.d;
import f1.i;
import java.util.ArrayList;

public class b implements d.a {

    /* renamed from: a  reason: collision with root package name */
    i f19606a = null;

    /* renamed from: b  reason: collision with root package name */
    float f19607b = 0.0f;

    /* renamed from: c  reason: collision with root package name */
    boolean f19608c = false;

    /* renamed from: d  reason: collision with root package name */
    ArrayList f19609d = new ArrayList();

    /* renamed from: e  reason: collision with root package name */
    public a f19610e;

    /* renamed from: f  reason: collision with root package name */
    boolean f19611f = false;

    public interface a {
        i a(int i10);

        void b(i iVar, float f10, boolean z10);

        void c();

        void clear();

        float d(i iVar, boolean z10);

        void e(i iVar, float f10);

        int f();

        float g(int i10);

        float h(i iVar);

        boolean i(i iVar);

        float j(b bVar, boolean z10);

        void k(float f10);
    }

    public b() {
    }

    private boolean u(i iVar, d dVar) {
        if (iVar.f19666m <= 1) {
            return true;
        }
        return false;
    }

    private i w(boolean[] zArr, i iVar) {
        i.a aVar;
        int f10 = this.f19610e.f();
        i iVar2 = null;
        float f11 = 0.0f;
        for (int i10 = 0; i10 < f10; i10++) {
            float g10 = this.f19610e.g(i10);
            if (g10 < 0.0f) {
                i a10 = this.f19610e.a(i10);
                if ((zArr == null || !zArr[a10.f19656c]) && a10 != iVar && (((aVar = a10.f19663j) == i.a.SLACK || aVar == i.a.ERROR) && g10 < f11)) {
                    f11 = g10;
                    iVar2 = a10;
                }
            }
        }
        return iVar2;
    }

    public void A(d dVar, i iVar, boolean z10) {
        if (iVar != null && iVar.f19660g) {
            this.f19607b += iVar.f19659f * this.f19610e.h(iVar);
            this.f19610e.d(iVar, z10);
            if (z10) {
                iVar.e(this);
            }
            if (d.f19618u && this.f19610e.f() == 0) {
                this.f19611f = true;
                dVar.f19624b = true;
            }
        }
    }

    public void B(d dVar, b bVar, boolean z10) {
        this.f19607b += bVar.f19607b * this.f19610e.j(bVar, z10);
        if (z10) {
            bVar.f19606a.e(this);
        }
        if (d.f19618u && this.f19606a != null && this.f19610e.f() == 0) {
            this.f19611f = true;
            dVar.f19624b = true;
        }
    }

    public void C(d dVar, i iVar, boolean z10) {
        if (iVar != null && iVar.f19667n) {
            float h10 = this.f19610e.h(iVar);
            this.f19607b += iVar.f19669p * h10;
            this.f19610e.d(iVar, z10);
            if (z10) {
                iVar.e(this);
            }
            this.f19610e.b(dVar.f19637o.f19615d[iVar.f19668o], h10, z10);
            if (d.f19618u && this.f19610e.f() == 0) {
                this.f19611f = true;
                dVar.f19624b = true;
            }
        }
    }

    public void D(d dVar) {
        if (dVar.f19630h.length != 0) {
            boolean z10 = false;
            while (!z10) {
                int f10 = this.f19610e.f();
                for (int i10 = 0; i10 < f10; i10++) {
                    i a10 = this.f19610e.a(i10);
                    if (a10.f19657d != -1 || a10.f19660g || a10.f19667n) {
                        this.f19609d.add(a10);
                    }
                }
                int size = this.f19609d.size();
                if (size > 0) {
                    for (int i11 = 0; i11 < size; i11++) {
                        i iVar = (i) this.f19609d.get(i11);
                        if (iVar.f19660g) {
                            A(dVar, iVar, true);
                        } else if (iVar.f19667n) {
                            C(dVar, iVar, true);
                        } else {
                            B(dVar, dVar.f19630h[iVar.f19657d], true);
                        }
                    }
                    this.f19609d.clear();
                } else {
                    z10 = true;
                }
            }
            if (d.f19618u && this.f19606a != null && this.f19610e.f() == 0) {
                this.f19611f = true;
                dVar.f19624b = true;
            }
        }
    }

    public void a(d.a aVar) {
        if (aVar instanceof b) {
            b bVar = (b) aVar;
            this.f19606a = null;
            this.f19610e.clear();
            for (int i10 = 0; i10 < bVar.f19610e.f(); i10++) {
                this.f19610e.b(bVar.f19610e.a(i10), bVar.f19610e.g(i10), true);
            }
        }
    }

    public i b(d dVar, boolean[] zArr) {
        return w(zArr, (i) null);
    }

    public void c(i iVar) {
        int i10 = iVar.f19658e;
        float f10 = 1.0f;
        if (i10 != 1) {
            if (i10 == 2) {
                f10 = 1000.0f;
            } else if (i10 == 3) {
                f10 = 1000000.0f;
            } else if (i10 == 4) {
                f10 = 1.0E9f;
            } else if (i10 == 5) {
                f10 = 1.0E12f;
            }
        }
        this.f19610e.e(iVar, f10);
    }

    public void clear() {
        this.f19610e.clear();
        this.f19606a = null;
        this.f19607b = 0.0f;
    }

    public b d(d dVar, int i10) {
        this.f19610e.e(dVar.o(i10, "ep"), 1.0f);
        this.f19610e.e(dVar.o(i10, "em"), -1.0f);
        return this;
    }

    /* access modifiers changed from: package-private */
    public b e(i iVar, int i10) {
        this.f19610e.e(iVar, (float) i10);
        return this;
    }

    /* access modifiers changed from: package-private */
    public boolean f(d dVar) {
        boolean z10;
        i g10 = g(dVar);
        if (g10 == null) {
            z10 = true;
        } else {
            x(g10);
            z10 = false;
        }
        if (this.f19610e.f() == 0) {
            this.f19611f = true;
        }
        return z10;
    }

    /* access modifiers changed from: package-private */
    public i g(d dVar) {
        boolean u10;
        boolean u11;
        int f10 = this.f19610e.f();
        i iVar = null;
        float f11 = 0.0f;
        float f12 = 0.0f;
        boolean z10 = false;
        boolean z11 = false;
        i iVar2 = null;
        for (int i10 = 0; i10 < f10; i10++) {
            float g10 = this.f19610e.g(i10);
            i a10 = this.f19610e.a(i10);
            if (a10.f19663j == i.a.UNRESTRICTED) {
                if (iVar == null) {
                    u11 = u(a10, dVar);
                } else if (f11 > g10) {
                    u11 = u(a10, dVar);
                } else if (!z10 && u(a10, dVar)) {
                    f11 = g10;
                    iVar = a10;
                    z10 = true;
                }
                z10 = u11;
                f11 = g10;
                iVar = a10;
            } else if (iVar == null && g10 < 0.0f) {
                if (iVar2 == null) {
                    u10 = u(a10, dVar);
                } else if (f12 > g10) {
                    u10 = u(a10, dVar);
                } else if (!z11 && u(a10, dVar)) {
                    f12 = g10;
                    iVar2 = a10;
                    z11 = true;
                }
                z11 = u10;
                f12 = g10;
                iVar2 = a10;
            }
        }
        if (iVar != null) {
            return iVar;
        }
        return iVar2;
    }

    public i getKey() {
        return this.f19606a;
    }

    /* access modifiers changed from: package-private */
    public b h(i iVar, i iVar2, int i10, float f10, i iVar3, i iVar4, int i11) {
        if (iVar2 == iVar3) {
            this.f19610e.e(iVar, 1.0f);
            this.f19610e.e(iVar4, 1.0f);
            this.f19610e.e(iVar2, -2.0f);
            return this;
        }
        if (f10 == 0.5f) {
            this.f19610e.e(iVar, 1.0f);
            this.f19610e.e(iVar2, -1.0f);
            this.f19610e.e(iVar3, -1.0f);
            this.f19610e.e(iVar4, 1.0f);
            if (i10 > 0 || i11 > 0) {
                this.f19607b = (float) ((-i10) + i11);
            }
        } else if (f10 <= 0.0f) {
            this.f19610e.e(iVar, -1.0f);
            this.f19610e.e(iVar2, 1.0f);
            this.f19607b = (float) i10;
        } else if (f10 >= 1.0f) {
            this.f19610e.e(iVar4, -1.0f);
            this.f19610e.e(iVar3, 1.0f);
            this.f19607b = (float) (-i11);
        } else {
            float f11 = 1.0f - f10;
            this.f19610e.e(iVar, f11 * 1.0f);
            this.f19610e.e(iVar2, f11 * -1.0f);
            this.f19610e.e(iVar3, -1.0f * f10);
            this.f19610e.e(iVar4, 1.0f * f10);
            if (i10 > 0 || i11 > 0) {
                this.f19607b = (((float) (-i10)) * f11) + (((float) i11) * f10);
            }
        }
        return this;
    }

    /* access modifiers changed from: package-private */
    public b i(i iVar, int i10) {
        this.f19606a = iVar;
        float f10 = (float) i10;
        iVar.f19659f = f10;
        this.f19607b = f10;
        this.f19611f = true;
        return this;
    }

    public boolean isEmpty() {
        if (this.f19606a == null && this.f19607b == 0.0f && this.f19610e.f() == 0) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public b j(i iVar, i iVar2, float f10) {
        this.f19610e.e(iVar, -1.0f);
        this.f19610e.e(iVar2, f10);
        return this;
    }

    public b k(i iVar, i iVar2, i iVar3, i iVar4, float f10) {
        this.f19610e.e(iVar, -1.0f);
        this.f19610e.e(iVar2, 1.0f);
        this.f19610e.e(iVar3, f10);
        this.f19610e.e(iVar4, -f10);
        return this;
    }

    public b l(float f10, float f11, float f12, i iVar, i iVar2, i iVar3, i iVar4) {
        this.f19607b = 0.0f;
        if (f11 == 0.0f || f10 == f12) {
            this.f19610e.e(iVar, 1.0f);
            this.f19610e.e(iVar2, -1.0f);
            this.f19610e.e(iVar4, 1.0f);
            this.f19610e.e(iVar3, -1.0f);
        } else if (f10 == 0.0f) {
            this.f19610e.e(iVar, 1.0f);
            this.f19610e.e(iVar2, -1.0f);
        } else if (f12 == 0.0f) {
            this.f19610e.e(iVar3, 1.0f);
            this.f19610e.e(iVar4, -1.0f);
        } else {
            float f13 = (f10 / f11) / (f12 / f11);
            this.f19610e.e(iVar, 1.0f);
            this.f19610e.e(iVar2, -1.0f);
            this.f19610e.e(iVar4, f13);
            this.f19610e.e(iVar3, -f13);
        }
        return this;
    }

    public b m(i iVar, int i10) {
        if (i10 < 0) {
            this.f19607b = (float) (i10 * -1);
            this.f19610e.e(iVar, 1.0f);
        } else {
            this.f19607b = (float) i10;
            this.f19610e.e(iVar, -1.0f);
        }
        return this;
    }

    public b n(i iVar, i iVar2, int i10) {
        boolean z10 = false;
        if (i10 != 0) {
            if (i10 < 0) {
                i10 *= -1;
                z10 = true;
            }
            this.f19607b = (float) i10;
        }
        if (!z10) {
            this.f19610e.e(iVar, -1.0f);
            this.f19610e.e(iVar2, 1.0f);
        } else {
            this.f19610e.e(iVar, 1.0f);
            this.f19610e.e(iVar2, -1.0f);
        }
        return this;
    }

    public b o(i iVar, i iVar2, i iVar3, int i10) {
        boolean z10 = false;
        if (i10 != 0) {
            if (i10 < 0) {
                i10 *= -1;
                z10 = true;
            }
            this.f19607b = (float) i10;
        }
        if (!z10) {
            this.f19610e.e(iVar, -1.0f);
            this.f19610e.e(iVar2, 1.0f);
            this.f19610e.e(iVar3, 1.0f);
        } else {
            this.f19610e.e(iVar, 1.0f);
            this.f19610e.e(iVar2, -1.0f);
            this.f19610e.e(iVar3, -1.0f);
        }
        return this;
    }

    public b p(i iVar, i iVar2, i iVar3, int i10) {
        boolean z10 = false;
        if (i10 != 0) {
            if (i10 < 0) {
                i10 *= -1;
                z10 = true;
            }
            this.f19607b = (float) i10;
        }
        if (!z10) {
            this.f19610e.e(iVar, -1.0f);
            this.f19610e.e(iVar2, 1.0f);
            this.f19610e.e(iVar3, -1.0f);
        } else {
            this.f19610e.e(iVar, 1.0f);
            this.f19610e.e(iVar2, -1.0f);
            this.f19610e.e(iVar3, 1.0f);
        }
        return this;
    }

    public b q(i iVar, i iVar2, i iVar3, i iVar4, float f10) {
        this.f19610e.e(iVar3, 0.5f);
        this.f19610e.e(iVar4, 0.5f);
        this.f19610e.e(iVar, -0.5f);
        this.f19610e.e(iVar2, -0.5f);
        this.f19607b = -f10;
        return this;
    }

    /* access modifiers changed from: package-private */
    public void r() {
        float f10 = this.f19607b;
        if (f10 < 0.0f) {
            this.f19607b = f10 * -1.0f;
            this.f19610e.c();
        }
    }

    /* access modifiers changed from: package-private */
    public boolean s() {
        i iVar = this.f19606a;
        if (iVar == null || (iVar.f19663j != i.a.UNRESTRICTED && this.f19607b < 0.0f)) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    public boolean t(i iVar) {
        return this.f19610e.i(iVar);
    }

    public String toString() {
        return z();
    }

    public i v(i iVar) {
        return w((boolean[]) null, iVar);
    }

    /* access modifiers changed from: package-private */
    public void x(i iVar) {
        i iVar2 = this.f19606a;
        if (iVar2 != null) {
            this.f19610e.e(iVar2, -1.0f);
            this.f19606a.f19657d = -1;
            this.f19606a = null;
        }
        float d10 = this.f19610e.d(iVar, true) * -1.0f;
        this.f19606a = iVar;
        if (d10 != 1.0f) {
            this.f19607b /= d10;
            this.f19610e.k(d10);
        }
    }

    public void y() {
        this.f19606a = null;
        this.f19610e.clear();
        this.f19607b = 0.0f;
        this.f19611f = false;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0069, code lost:
        r7 = r10.f19610e.g(r3);
     */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x00c0  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x00d0  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String z() {
        /*
            r10 = this;
            f1.i r0 = r10.f19606a
            java.lang.String r1 = ""
            if (r0 != 0) goto L_0x0018
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r1)
            java.lang.String r1 = "0"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            goto L_0x0029
        L_0x0018:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r1)
            f1.i r1 = r10.f19606a
            r0.append(r1)
            java.lang.String r0 = r0.toString()
        L_0x0029:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            java.lang.String r0 = " = "
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            float r1 = r10.f19607b
            r2 = 0
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            r3 = 0
            r4 = 1
            if (r1 == 0) goto L_0x0056
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            float r0 = r10.f19607b
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r1 = r4
            goto L_0x0057
        L_0x0056:
            r1 = r3
        L_0x0057:
            f1.b$a r5 = r10.f19610e
            int r5 = r5.f()
        L_0x005d:
            if (r3 >= r5) goto L_0x00ec
            f1.b$a r6 = r10.f19610e
            f1.i r6 = r6.a(r3)
            if (r6 != 0) goto L_0x0069
            goto L_0x00e8
        L_0x0069:
            f1.b$a r7 = r10.f19610e
            float r7 = r7.g(r3)
            int r8 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r8 != 0) goto L_0x0075
            goto L_0x00e8
        L_0x0075:
            java.lang.String r6 = r6.toString()
            r9 = -1082130432(0xffffffffbf800000, float:-1.0)
            if (r1 != 0) goto L_0x0094
            int r1 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r1 >= 0) goto L_0x00ba
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            java.lang.String r0 = "- "
            r1.append(r0)
            java.lang.String r0 = r1.toString()
        L_0x0092:
            float r7 = r7 * r9
            goto L_0x00ba
        L_0x0094:
            if (r8 <= 0) goto L_0x00a8
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            java.lang.String r0 = " + "
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            goto L_0x00ba
        L_0x00a8:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            java.lang.String r0 = " - "
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            goto L_0x0092
        L_0x00ba:
            r1 = 1065353216(0x3f800000, float:1.0)
            int r1 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r1 != 0) goto L_0x00d0
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            r1.append(r6)
            java.lang.String r0 = r1.toString()
            goto L_0x00e7
        L_0x00d0:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            r1.append(r7)
            java.lang.String r0 = " "
            r1.append(r0)
            r1.append(r6)
            java.lang.String r0 = r1.toString()
        L_0x00e7:
            r1 = r4
        L_0x00e8:
            int r3 = r3 + 1
            goto L_0x005d
        L_0x00ec:
            if (r1 != 0) goto L_0x00ff
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            java.lang.String r0 = "0.0"
            r1.append(r0)
            java.lang.String r0 = r1.toString()
        L_0x00ff:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: f1.b.z():java.lang.String");
    }

    public b(c cVar) {
        this.f19610e = new C1959a(this, cVar);
    }
}
