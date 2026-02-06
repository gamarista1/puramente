package i1;

import f1.d;
import f1.i;
import i1.C2062d;
import i1.C2063e;
import java.util.HashMap;

/* renamed from: i1.h  reason: case insensitive filesystem */
public class C2066h extends C2063e {

    /* renamed from: V0  reason: collision with root package name */
    protected float f22023V0 = -1.0f;

    /* renamed from: W0  reason: collision with root package name */
    protected int f22024W0 = -1;

    /* renamed from: X0  reason: collision with root package name */
    protected int f22025X0 = -1;

    /* renamed from: Y0  reason: collision with root package name */
    protected boolean f22026Y0 = true;

    /* renamed from: Z0  reason: collision with root package name */
    private C2062d f22027Z0 = this.f21898R;

    /* renamed from: a1  reason: collision with root package name */
    private int f22028a1;

    /* renamed from: b1  reason: collision with root package name */
    private int f22029b1;

    /* renamed from: c1  reason: collision with root package name */
    private boolean f22030c1;

    /* renamed from: i1.h$a */
    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f22031a;

        /* JADX WARNING: Can't wrap try/catch for region: R(18:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|(3:17|18|20)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0054 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0060 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                i1.d$a[] r0 = i1.C2062d.a.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f22031a = r0
                i1.d$a r1 = i1.C2062d.a.LEFT     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f22031a     // Catch:{ NoSuchFieldError -> 0x001d }
                i1.d$a r1 = i1.C2062d.a.RIGHT     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f22031a     // Catch:{ NoSuchFieldError -> 0x0028 }
                i1.d$a r1 = i1.C2062d.a.TOP     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f22031a     // Catch:{ NoSuchFieldError -> 0x0033 }
                i1.d$a r1 = i1.C2062d.a.BOTTOM     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f22031a     // Catch:{ NoSuchFieldError -> 0x003e }
                i1.d$a r1 = i1.C2062d.a.BASELINE     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f22031a     // Catch:{ NoSuchFieldError -> 0x0049 }
                i1.d$a r1 = i1.C2062d.a.CENTER     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f22031a     // Catch:{ NoSuchFieldError -> 0x0054 }
                i1.d$a r1 = i1.C2062d.a.CENTER_X     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                int[] r0 = f22031a     // Catch:{ NoSuchFieldError -> 0x0060 }
                i1.d$a r1 = i1.C2062d.a.CENTER_Y     // Catch:{ NoSuchFieldError -> 0x0060 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0060 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0060 }
            L_0x0060:
                int[] r0 = f22031a     // Catch:{ NoSuchFieldError -> 0x006c }
                i1.d$a r1 = i1.C2062d.a.NONE     // Catch:{ NoSuchFieldError -> 0x006c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006c }
                r2 = 9
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x006c }
            L_0x006c:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: i1.C2066h.a.<clinit>():void");
        }
    }

    public C2066h() {
        this.f22028a1 = 0;
        this.f22029b1 = 0;
        this.f21909Z.clear();
        this.f21909Z.add(this.f22027Z0);
        int length = this.f21908Y.length;
        for (int i10 = 0; i10 < length; i10++) {
            this.f21908Y[i10] = this.f22027Z0;
        }
    }

    public float A1() {
        return this.f22023V0;
    }

    public void B1(int i10) {
        this.f22027Z0.t(i10);
        this.f22030c1 = true;
    }

    public void C1(int i10) {
        if (i10 > -1) {
            this.f22023V0 = -1.0f;
            this.f22024W0 = i10;
            this.f22025X0 = -1;
        }
    }

    public void D1(int i10) {
        if (i10 > -1) {
            this.f22023V0 = -1.0f;
            this.f22024W0 = -1;
            this.f22025X0 = i10;
        }
    }

    public void E1(float f10) {
        if (f10 > -1.0f) {
            this.f22023V0 = f10;
            this.f22024W0 = -1;
            this.f22025X0 = -1;
        }
    }

    public void F1(int i10) {
        if (this.f22028a1 != i10) {
            this.f22028a1 = i10;
            this.f21909Z.clear();
            if (this.f22028a1 == 1) {
                this.f22027Z0 = this.f21896Q;
            } else {
                this.f22027Z0 = this.f21898R;
            }
            this.f21909Z.add(this.f22027Z0);
            int length = this.f21908Y.length;
            for (int i11 = 0; i11 < length; i11++) {
                this.f21908Y[i11] = this.f22027Z0;
            }
        }
    }

    public void g(d dVar, boolean z10) {
        boolean z11;
        C2064f fVar = (C2064f) M();
        if (fVar != null) {
            C2062d q10 = fVar.q(C2062d.a.LEFT);
            C2062d q11 = fVar.q(C2062d.a.RIGHT);
            C2063e eVar = this.f21915c0;
            boolean z12 = true;
            if (eVar == null || eVar.f21913b0[0] != C2063e.b.WRAP_CONTENT) {
                z11 = false;
            } else {
                z11 = true;
            }
            if (this.f22028a1 == 0) {
                q10 = fVar.q(C2062d.a.TOP);
                q11 = fVar.q(C2062d.a.BOTTOM);
                C2063e eVar2 = this.f21915c0;
                if (eVar2 == null || eVar2.f21913b0[1] != C2063e.b.WRAP_CONTENT) {
                    z12 = false;
                }
                z11 = z12;
            }
            if (this.f22030c1 && this.f22027Z0.n()) {
                i q12 = dVar.q(this.f22027Z0);
                dVar.f(q12, this.f22027Z0.e());
                if (this.f22024W0 != -1) {
                    if (z11) {
                        dVar.h(dVar.q(q11), q12, 0, 5);
                    }
                } else if (this.f22025X0 != -1 && z11) {
                    i q13 = dVar.q(q11);
                    dVar.h(q12, dVar.q(q10), 0, 5);
                    dVar.h(q13, q12, 0, 5);
                }
                this.f22030c1 = false;
            } else if (this.f22024W0 != -1) {
                i q14 = dVar.q(this.f22027Z0);
                dVar.e(q14, dVar.q(q10), this.f22024W0, 8);
                if (z11) {
                    dVar.h(dVar.q(q11), q14, 0, 5);
                }
            } else if (this.f22025X0 != -1) {
                i q15 = dVar.q(this.f22027Z0);
                i q16 = dVar.q(q11);
                dVar.e(q15, q16, -this.f22025X0, 8);
                if (z11) {
                    dVar.h(q15, dVar.q(q10), 0, 5);
                    dVar.h(q16, q15, 0, 5);
                }
            } else if (this.f22023V0 != -1.0f) {
                dVar.d(d.s(dVar, dVar.q(this.f22027Z0), dVar.q(q11), this.f22023V0));
            }
        }
    }

    public boolean h() {
        return true;
    }

    public void n(C2063e eVar, HashMap hashMap) {
        super.n(eVar, hashMap);
        C2066h hVar = (C2066h) eVar;
        this.f22023V0 = hVar.f22023V0;
        this.f22024W0 = hVar.f22024W0;
        this.f22025X0 = hVar.f22025X0;
        this.f22026Y0 = hVar.f22026Y0;
        F1(hVar.f22028a1);
    }

    public boolean p0() {
        return this.f22030c1;
    }

    public C2062d q(C2062d.a aVar) {
        int i10 = a.f22031a[aVar.ordinal()];
        if (i10 == 1 || i10 == 2) {
            if (this.f22028a1 == 1) {
                return this.f22027Z0;
            }
            return null;
        } else if ((i10 == 3 || i10 == 4) && this.f22028a1 == 0) {
            return this.f22027Z0;
        } else {
            return null;
        }
    }

    public boolean q0() {
        return this.f22030c1;
    }

    public void v1(d dVar, boolean z10) {
        if (M() != null) {
            int y10 = dVar.y(this.f22027Z0);
            if (this.f22028a1 == 1) {
                r1(y10);
                s1(0);
                Q0(M().z());
                p1(0);
                return;
            }
            r1(0);
            s1(y10);
            p1(M().Y());
            Q0(0);
        }
    }

    public C2062d w1() {
        return this.f22027Z0;
    }

    public int x1() {
        return this.f22028a1;
    }

    public int y1() {
        return this.f22024W0;
    }

    public int z1() {
        return this.f22025X0;
    }
}
