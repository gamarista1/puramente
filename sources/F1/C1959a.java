package f1;

import f1.b;
import java.util.Arrays;

/* renamed from: f1.a  reason: case insensitive filesystem */
public class C1959a implements b.a {

    /* renamed from: l  reason: collision with root package name */
    private static float f19594l = 0.001f;

    /* renamed from: a  reason: collision with root package name */
    int f19595a = 0;

    /* renamed from: b  reason: collision with root package name */
    private final b f19596b;

    /* renamed from: c  reason: collision with root package name */
    protected final c f19597c;

    /* renamed from: d  reason: collision with root package name */
    private int f19598d = 8;

    /* renamed from: e  reason: collision with root package name */
    private i f19599e = null;

    /* renamed from: f  reason: collision with root package name */
    private int[] f19600f = new int[8];

    /* renamed from: g  reason: collision with root package name */
    private int[] f19601g = new int[8];

    /* renamed from: h  reason: collision with root package name */
    private float[] f19602h = new float[8];

    /* renamed from: i  reason: collision with root package name */
    private int f19603i = -1;

    /* renamed from: j  reason: collision with root package name */
    private int f19604j = -1;

    /* renamed from: k  reason: collision with root package name */
    private boolean f19605k = false;

    C1959a(b bVar, c cVar) {
        this.f19596b = bVar;
        this.f19597c = cVar;
    }

    public i a(int i10) {
        int i11 = this.f19603i;
        int i12 = 0;
        while (i11 != -1 && i12 < this.f19595a) {
            if (i12 == i10) {
                return this.f19597c.f19615d[this.f19600f[i11]];
            }
            i11 = this.f19601g[i11];
            i12++;
        }
        return null;
    }

    public void b(i iVar, float f10, boolean z10) {
        float f11 = f19594l;
        if (f10 <= (-f11) || f10 >= f11) {
            int i10 = this.f19603i;
            if (i10 == -1) {
                this.f19603i = 0;
                this.f19602h[0] = f10;
                this.f19600f[0] = iVar.f19656c;
                this.f19601g[0] = -1;
                iVar.f19666m++;
                iVar.a(this.f19596b);
                this.f19595a++;
                if (!this.f19605k) {
                    int i11 = this.f19604j + 1;
                    this.f19604j = i11;
                    int[] iArr = this.f19600f;
                    if (i11 >= iArr.length) {
                        this.f19605k = true;
                        this.f19604j = iArr.length - 1;
                        return;
                    }
                    return;
                }
                return;
            }
            int i12 = 0;
            int i13 = -1;
            while (i10 != -1 && i12 < this.f19595a) {
                int i14 = this.f19600f[i10];
                int i15 = iVar.f19656c;
                if (i14 == i15) {
                    float[] fArr = this.f19602h;
                    float f12 = fArr[i10] + f10;
                    float f13 = f19594l;
                    if (f12 > (-f13) && f12 < f13) {
                        f12 = 0.0f;
                    }
                    fArr[i10] = f12;
                    if (f12 == 0.0f) {
                        if (i10 == this.f19603i) {
                            this.f19603i = this.f19601g[i10];
                        } else {
                            int[] iArr2 = this.f19601g;
                            iArr2[i13] = iArr2[i10];
                        }
                        if (z10) {
                            iVar.e(this.f19596b);
                        }
                        if (this.f19605k) {
                            this.f19604j = i10;
                        }
                        iVar.f19666m--;
                        this.f19595a--;
                        return;
                    }
                    return;
                }
                if (i14 < i15) {
                    i13 = i10;
                }
                i10 = this.f19601g[i10];
                i12++;
            }
            int i16 = this.f19604j;
            int i17 = i16 + 1;
            if (this.f19605k) {
                int[] iArr3 = this.f19600f;
                if (iArr3[i16] != -1) {
                    i16 = iArr3.length;
                }
            } else {
                i16 = i17;
            }
            int[] iArr4 = this.f19600f;
            if (i16 >= iArr4.length && this.f19595a < iArr4.length) {
                int i18 = 0;
                while (true) {
                    int[] iArr5 = this.f19600f;
                    if (i18 >= iArr5.length) {
                        break;
                    } else if (iArr5[i18] == -1) {
                        i16 = i18;
                        break;
                    } else {
                        i18++;
                    }
                }
            }
            int[] iArr6 = this.f19600f;
            if (i16 >= iArr6.length) {
                i16 = iArr6.length;
                int i19 = this.f19598d * 2;
                this.f19598d = i19;
                this.f19605k = false;
                this.f19604j = i16 - 1;
                this.f19602h = Arrays.copyOf(this.f19602h, i19);
                this.f19600f = Arrays.copyOf(this.f19600f, this.f19598d);
                this.f19601g = Arrays.copyOf(this.f19601g, this.f19598d);
            }
            this.f19600f[i16] = iVar.f19656c;
            this.f19602h[i16] = f10;
            if (i13 != -1) {
                int[] iArr7 = this.f19601g;
                iArr7[i16] = iArr7[i13];
                iArr7[i13] = i16;
            } else {
                this.f19601g[i16] = this.f19603i;
                this.f19603i = i16;
            }
            iVar.f19666m++;
            iVar.a(this.f19596b);
            this.f19595a++;
            if (!this.f19605k) {
                this.f19604j++;
            }
            int i20 = this.f19604j;
            int[] iArr8 = this.f19600f;
            if (i20 >= iArr8.length) {
                this.f19605k = true;
                this.f19604j = iArr8.length - 1;
            }
        }
    }

    public void c() {
        int i10 = this.f19603i;
        int i11 = 0;
        while (i10 != -1 && i11 < this.f19595a) {
            float[] fArr = this.f19602h;
            fArr[i10] = fArr[i10] * -1.0f;
            i10 = this.f19601g[i10];
            i11++;
        }
    }

    public final void clear() {
        int i10 = this.f19603i;
        int i11 = 0;
        while (i10 != -1 && i11 < this.f19595a) {
            i iVar = this.f19597c.f19615d[this.f19600f[i10]];
            if (iVar != null) {
                iVar.e(this.f19596b);
            }
            i10 = this.f19601g[i10];
            i11++;
        }
        this.f19603i = -1;
        this.f19604j = -1;
        this.f19605k = false;
        this.f19595a = 0;
    }

    public final float d(i iVar, boolean z10) {
        if (this.f19599e == iVar) {
            this.f19599e = null;
        }
        int i10 = this.f19603i;
        if (i10 == -1) {
            return 0.0f;
        }
        int i11 = 0;
        int i12 = -1;
        while (i10 != -1 && i11 < this.f19595a) {
            if (this.f19600f[i10] == iVar.f19656c) {
                if (i10 == this.f19603i) {
                    this.f19603i = this.f19601g[i10];
                } else {
                    int[] iArr = this.f19601g;
                    iArr[i12] = iArr[i10];
                }
                if (z10) {
                    iVar.e(this.f19596b);
                }
                iVar.f19666m--;
                this.f19595a--;
                this.f19600f[i10] = -1;
                if (this.f19605k) {
                    this.f19604j = i10;
                }
                return this.f19602h[i10];
            }
            i11++;
            i12 = i10;
            i10 = this.f19601g[i10];
        }
        return 0.0f;
    }

    public final void e(i iVar, float f10) {
        if (f10 == 0.0f) {
            d(iVar, true);
            return;
        }
        int i10 = this.f19603i;
        if (i10 == -1) {
            this.f19603i = 0;
            this.f19602h[0] = f10;
            this.f19600f[0] = iVar.f19656c;
            this.f19601g[0] = -1;
            iVar.f19666m++;
            iVar.a(this.f19596b);
            this.f19595a++;
            if (!this.f19605k) {
                int i11 = this.f19604j + 1;
                this.f19604j = i11;
                int[] iArr = this.f19600f;
                if (i11 >= iArr.length) {
                    this.f19605k = true;
                    this.f19604j = iArr.length - 1;
                    return;
                }
                return;
            }
            return;
        }
        int i12 = 0;
        int i13 = -1;
        while (i10 != -1 && i12 < this.f19595a) {
            int i14 = this.f19600f[i10];
            int i15 = iVar.f19656c;
            if (i14 == i15) {
                this.f19602h[i10] = f10;
                return;
            }
            if (i14 < i15) {
                i13 = i10;
            }
            i10 = this.f19601g[i10];
            i12++;
        }
        int i16 = this.f19604j;
        int i17 = i16 + 1;
        if (this.f19605k) {
            int[] iArr2 = this.f19600f;
            if (iArr2[i16] != -1) {
                i16 = iArr2.length;
            }
        } else {
            i16 = i17;
        }
        int[] iArr3 = this.f19600f;
        if (i16 >= iArr3.length && this.f19595a < iArr3.length) {
            int i18 = 0;
            while (true) {
                int[] iArr4 = this.f19600f;
                if (i18 >= iArr4.length) {
                    break;
                } else if (iArr4[i18] == -1) {
                    i16 = i18;
                    break;
                } else {
                    i18++;
                }
            }
        }
        int[] iArr5 = this.f19600f;
        if (i16 >= iArr5.length) {
            i16 = iArr5.length;
            int i19 = this.f19598d * 2;
            this.f19598d = i19;
            this.f19605k = false;
            this.f19604j = i16 - 1;
            this.f19602h = Arrays.copyOf(this.f19602h, i19);
            this.f19600f = Arrays.copyOf(this.f19600f, this.f19598d);
            this.f19601g = Arrays.copyOf(this.f19601g, this.f19598d);
        }
        this.f19600f[i16] = iVar.f19656c;
        this.f19602h[i16] = f10;
        if (i13 != -1) {
            int[] iArr6 = this.f19601g;
            iArr6[i16] = iArr6[i13];
            iArr6[i13] = i16;
        } else {
            this.f19601g[i16] = this.f19603i;
            this.f19603i = i16;
        }
        iVar.f19666m++;
        iVar.a(this.f19596b);
        int i20 = this.f19595a + 1;
        this.f19595a = i20;
        if (!this.f19605k) {
            this.f19604j++;
        }
        int[] iArr7 = this.f19600f;
        if (i20 >= iArr7.length) {
            this.f19605k = true;
        }
        if (this.f19604j >= iArr7.length) {
            this.f19605k = true;
            this.f19604j = iArr7.length - 1;
        }
    }

    public int f() {
        return this.f19595a;
    }

    public float g(int i10) {
        int i11 = this.f19603i;
        int i12 = 0;
        while (i11 != -1 && i12 < this.f19595a) {
            if (i12 == i10) {
                return this.f19602h[i11];
            }
            i11 = this.f19601g[i11];
            i12++;
        }
        return 0.0f;
    }

    public final float h(i iVar) {
        int i10 = this.f19603i;
        int i11 = 0;
        while (i10 != -1 && i11 < this.f19595a) {
            if (this.f19600f[i10] == iVar.f19656c) {
                return this.f19602h[i10];
            }
            i10 = this.f19601g[i10];
            i11++;
        }
        return 0.0f;
    }

    public boolean i(i iVar) {
        int i10 = this.f19603i;
        if (i10 == -1) {
            return false;
        }
        int i11 = 0;
        while (i10 != -1 && i11 < this.f19595a) {
            if (this.f19600f[i10] == iVar.f19656c) {
                return true;
            }
            i10 = this.f19601g[i10];
            i11++;
        }
        return false;
    }

    public float j(b bVar, boolean z10) {
        float h10 = h(bVar.f19606a);
        d(bVar.f19606a, z10);
        b.a aVar = bVar.f19610e;
        int f10 = aVar.f();
        for (int i10 = 0; i10 < f10; i10++) {
            i a10 = aVar.a(i10);
            b(a10, aVar.h(a10) * h10, z10);
        }
        return h10;
    }

    public void k(float f10) {
        int i10 = this.f19603i;
        int i11 = 0;
        while (i10 != -1 && i11 < this.f19595a) {
            float[] fArr = this.f19602h;
            fArr[i10] = fArr[i10] / f10;
            i10 = this.f19601g[i10];
            i11++;
        }
    }

    public String toString() {
        int i10 = this.f19603i;
        String str = "";
        int i11 = 0;
        while (i10 != -1 && i11 < this.f19595a) {
            str = ((str + " -> ") + this.f19602h[i10] + " : ") + this.f19597c.f19615d[this.f19600f[i10]];
            i10 = this.f19601g[i10];
            i11++;
        }
        return str;
    }
}
