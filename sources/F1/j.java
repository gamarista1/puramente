package f1;

import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import f1.b;
import java.util.Arrays;

public class j implements b.a {

    /* renamed from: n  reason: collision with root package name */
    private static float f19677n = 0.001f;

    /* renamed from: a  reason: collision with root package name */
    private final int f19678a = -1;

    /* renamed from: b  reason: collision with root package name */
    private int f19679b = 16;

    /* renamed from: c  reason: collision with root package name */
    private int f19680c = 16;

    /* renamed from: d  reason: collision with root package name */
    int[] f19681d = new int[16];

    /* renamed from: e  reason: collision with root package name */
    int[] f19682e = new int[16];

    /* renamed from: f  reason: collision with root package name */
    int[] f19683f = new int[16];

    /* renamed from: g  reason: collision with root package name */
    float[] f19684g = new float[16];

    /* renamed from: h  reason: collision with root package name */
    int[] f19685h = new int[16];

    /* renamed from: i  reason: collision with root package name */
    int[] f19686i = new int[16];

    /* renamed from: j  reason: collision with root package name */
    int f19687j = 0;

    /* renamed from: k  reason: collision with root package name */
    int f19688k = -1;

    /* renamed from: l  reason: collision with root package name */
    private final b f19689l;

    /* renamed from: m  reason: collision with root package name */
    protected final c f19690m;

    j(b bVar, c cVar) {
        this.f19689l = bVar;
        this.f19690m = cVar;
        clear();
    }

    private void l(i iVar, int i10) {
        int[] iArr;
        int i11 = iVar.f19656c % this.f19680c;
        int[] iArr2 = this.f19681d;
        int i12 = iArr2[i11];
        if (i12 == -1) {
            iArr2[i11] = i10;
        } else {
            while (true) {
                iArr = this.f19682e;
                int i13 = iArr[i12];
                if (i13 == -1) {
                    break;
                }
                i12 = i13;
            }
            iArr[i12] = i10;
        }
        this.f19682e[i10] = -1;
    }

    private void m(int i10, i iVar, float f10) {
        this.f19683f[i10] = iVar.f19656c;
        this.f19684g[i10] = f10;
        this.f19685h[i10] = -1;
        this.f19686i[i10] = -1;
        iVar.a(this.f19689l);
        iVar.f19666m++;
        this.f19687j++;
    }

    private int n() {
        for (int i10 = 0; i10 < this.f19679b; i10++) {
            if (this.f19683f[i10] == -1) {
                return i10;
            }
        }
        return -1;
    }

    private void o() {
        int i10 = this.f19679b * 2;
        this.f19683f = Arrays.copyOf(this.f19683f, i10);
        this.f19684g = Arrays.copyOf(this.f19684g, i10);
        this.f19685h = Arrays.copyOf(this.f19685h, i10);
        this.f19686i = Arrays.copyOf(this.f19686i, i10);
        this.f19682e = Arrays.copyOf(this.f19682e, i10);
        for (int i11 = this.f19679b; i11 < i10; i11++) {
            this.f19683f[i11] = -1;
            this.f19682e[i11] = -1;
        }
        this.f19679b = i10;
    }

    private void q(int i10, i iVar, float f10) {
        int n10 = n();
        m(n10, iVar, f10);
        if (i10 != -1) {
            this.f19685h[n10] = i10;
            int[] iArr = this.f19686i;
            iArr[n10] = iArr[i10];
            iArr[i10] = n10;
        } else {
            this.f19685h[n10] = -1;
            if (this.f19687j > 0) {
                this.f19686i[n10] = this.f19688k;
                this.f19688k = n10;
            } else {
                this.f19686i[n10] = -1;
            }
        }
        int i11 = this.f19686i[n10];
        if (i11 != -1) {
            this.f19685h[i11] = n10;
        }
        l(iVar, n10);
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void r(f1.i r6) {
        /*
            r5 = this;
            int r6 = r6.f19656c
            int r0 = r5.f19680c
            int r0 = r6 % r0
            int[] r1 = r5.f19681d
            r2 = r1[r0]
            r3 = -1
            if (r2 != r3) goto L_0x000e
            return
        L_0x000e:
            int[] r4 = r5.f19683f
            r4 = r4[r2]
            if (r4 != r6) goto L_0x001d
            int[] r6 = r5.f19682e
            r4 = r6[r2]
            r1[r0] = r4
            r6[r2] = r3
            goto L_0x0039
        L_0x001d:
            int[] r0 = r5.f19682e
            r1 = r0[r2]
            if (r1 == r3) goto L_0x002b
            int[] r4 = r5.f19683f
            r4 = r4[r1]
            if (r4 == r6) goto L_0x002b
            r2 = r1
            goto L_0x001d
        L_0x002b:
            if (r1 == r3) goto L_0x0039
            int[] r4 = r5.f19683f
            r4 = r4[r1]
            if (r4 != r6) goto L_0x0039
            r6 = r0[r1]
            r0[r2] = r6
            r0[r1] = r3
        L_0x0039:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: f1.j.r(f1.i):void");
    }

    public i a(int i10) {
        int i11 = this.f19687j;
        if (i11 == 0) {
            return null;
        }
        int i12 = this.f19688k;
        for (int i13 = 0; i13 < i11; i13++) {
            if (i13 == i10 && i12 != -1) {
                return this.f19690m.f19615d[this.f19683f[i12]];
            }
            i12 = this.f19686i[i12];
            if (i12 == -1) {
                break;
            }
        }
        return null;
    }

    public void b(i iVar, float f10, boolean z10) {
        float f11 = f19677n;
        if (f10 <= (-f11) || f10 >= f11) {
            int p10 = p(iVar);
            if (p10 == -1) {
                e(iVar, f10);
                return;
            }
            float[] fArr = this.f19684g;
            float f12 = fArr[p10] + f10;
            fArr[p10] = f12;
            float f13 = f19677n;
            if (f12 > (-f13) && f12 < f13) {
                fArr[p10] = 0.0f;
                d(iVar, z10);
            }
        }
    }

    public void c() {
        int i10 = this.f19687j;
        int i11 = this.f19688k;
        int i12 = 0;
        while (i12 < i10) {
            float[] fArr = this.f19684g;
            fArr[i11] = fArr[i11] * -1.0f;
            i11 = this.f19686i[i11];
            if (i11 != -1) {
                i12++;
            } else {
                return;
            }
        }
    }

    public void clear() {
        int i10 = this.f19687j;
        for (int i11 = 0; i11 < i10; i11++) {
            i a10 = a(i11);
            if (a10 != null) {
                a10.e(this.f19689l);
            }
        }
        for (int i12 = 0; i12 < this.f19679b; i12++) {
            this.f19683f[i12] = -1;
            this.f19682e[i12] = -1;
        }
        for (int i13 = 0; i13 < this.f19680c; i13++) {
            this.f19681d[i13] = -1;
        }
        this.f19687j = 0;
        this.f19688k = -1;
    }

    public float d(i iVar, boolean z10) {
        int p10 = p(iVar);
        if (p10 == -1) {
            return 0.0f;
        }
        r(iVar);
        float f10 = this.f19684g[p10];
        if (this.f19688k == p10) {
            this.f19688k = this.f19686i[p10];
        }
        this.f19683f[p10] = -1;
        int[] iArr = this.f19685h;
        int i10 = iArr[p10];
        if (i10 != -1) {
            int[] iArr2 = this.f19686i;
            iArr2[i10] = iArr2[p10];
        }
        int i11 = this.f19686i[p10];
        if (i11 != -1) {
            iArr[i11] = iArr[p10];
        }
        this.f19687j--;
        iVar.f19666m--;
        if (z10) {
            iVar.e(this.f19689l);
        }
        return f10;
    }

    public void e(i iVar, float f10) {
        float f11 = f19677n;
        if (f10 <= (-f11) || f10 >= f11) {
            if (this.f19687j == 0) {
                m(0, iVar, f10);
                l(iVar, 0);
                this.f19688k = 0;
                return;
            }
            int p10 = p(iVar);
            if (p10 != -1) {
                this.f19684g[p10] = f10;
                return;
            }
            if (this.f19687j + 1 >= this.f19679b) {
                o();
            }
            int i10 = this.f19687j;
            int i11 = this.f19688k;
            int i12 = -1;
            for (int i13 = 0; i13 < i10; i13++) {
                int i14 = this.f19683f[i11];
                int i15 = iVar.f19656c;
                if (i14 == i15) {
                    this.f19684g[i11] = f10;
                    return;
                }
                if (i14 < i15) {
                    i12 = i11;
                }
                i11 = this.f19686i[i11];
                if (i11 == -1) {
                    break;
                }
            }
            q(i12, iVar, f10);
            return;
        }
        d(iVar, true);
    }

    public int f() {
        return this.f19687j;
    }

    public float g(int i10) {
        int i11 = this.f19687j;
        int i12 = this.f19688k;
        for (int i13 = 0; i13 < i11; i13++) {
            if (i13 == i10) {
                return this.f19684g[i12];
            }
            i12 = this.f19686i[i12];
            if (i12 == -1) {
                return 0.0f;
            }
        }
        return 0.0f;
    }

    public float h(i iVar) {
        int p10 = p(iVar);
        if (p10 != -1) {
            return this.f19684g[p10];
        }
        return 0.0f;
    }

    public boolean i(i iVar) {
        if (p(iVar) != -1) {
            return true;
        }
        return false;
    }

    public float j(b bVar, boolean z10) {
        float h10 = h(bVar.f19606a);
        d(bVar.f19606a, z10);
        j jVar = (j) bVar.f19610e;
        int f10 = jVar.f();
        int i10 = 0;
        int i11 = 0;
        while (i10 < f10) {
            int i12 = jVar.f19683f[i11];
            if (i12 != -1) {
                b(this.f19690m.f19615d[i12], jVar.f19684g[i11] * h10, z10);
                i10++;
            }
            i11++;
        }
        return h10;
    }

    public void k(float f10) {
        int i10 = this.f19687j;
        int i11 = this.f19688k;
        int i12 = 0;
        while (i12 < i10) {
            float[] fArr = this.f19684g;
            fArr[i11] = fArr[i11] / f10;
            i11 = this.f19686i[i11];
            if (i11 != -1) {
                i12++;
            } else {
                return;
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0032 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int p(f1.i r4) {
        /*
            r3 = this;
            int r0 = r3.f19687j
            r1 = -1
            if (r0 == 0) goto L_0x0033
            if (r4 != 0) goto L_0x0008
            goto L_0x0033
        L_0x0008:
            int r4 = r4.f19656c
            int r0 = r3.f19680c
            int r0 = r4 % r0
            int[] r2 = r3.f19681d
            r0 = r2[r0]
            if (r0 != r1) goto L_0x0015
            return r1
        L_0x0015:
            int[] r2 = r3.f19683f
            r2 = r2[r0]
            if (r2 != r4) goto L_0x001c
            return r0
        L_0x001c:
            int[] r2 = r3.f19682e
            r0 = r2[r0]
            if (r0 == r1) goto L_0x0029
            int[] r2 = r3.f19683f
            r2 = r2[r0]
            if (r2 == r4) goto L_0x0029
            goto L_0x001c
        L_0x0029:
            if (r0 != r1) goto L_0x002c
            return r1
        L_0x002c:
            int[] r2 = r3.f19683f
            r2 = r2[r0]
            if (r2 != r4) goto L_0x0033
            return r0
        L_0x0033:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: f1.j.p(f1.i):int");
    }

    public String toString() {
        String str;
        String str2;
        String str3 = hashCode() + " { ";
        int i10 = this.f19687j;
        for (int i11 = 0; i11 < i10; i11++) {
            i a10 = a(i11);
            if (a10 != null) {
                String str4 = str3 + a10 + " = " + g(i11) + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR;
                int p10 = p(a10);
                String str5 = str4 + "[p: ";
                if (this.f19685h[p10] != -1) {
                    str = str5 + this.f19690m.f19615d[this.f19683f[this.f19685h[p10]]];
                } else {
                    str = str5 + "none";
                }
                String str6 = str + ", n: ";
                if (this.f19686i[p10] != -1) {
                    str2 = str6 + this.f19690m.f19615d[this.f19683f[this.f19686i[p10]]];
                } else {
                    str2 = str6 + "none";
                }
                str3 = str2 + "]";
            }
        }
        return str3 + " }";
    }
}
