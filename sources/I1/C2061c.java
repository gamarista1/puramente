package i1;

import i1.C2063e;
import java.util.ArrayList;

/* renamed from: i1.c  reason: case insensitive filesystem */
public class C2061c {

    /* renamed from: a  reason: collision with root package name */
    protected C2063e f21822a;

    /* renamed from: b  reason: collision with root package name */
    protected C2063e f21823b;

    /* renamed from: c  reason: collision with root package name */
    protected C2063e f21824c;

    /* renamed from: d  reason: collision with root package name */
    protected C2063e f21825d;

    /* renamed from: e  reason: collision with root package name */
    protected C2063e f21826e;

    /* renamed from: f  reason: collision with root package name */
    protected C2063e f21827f;

    /* renamed from: g  reason: collision with root package name */
    protected C2063e f21828g;

    /* renamed from: h  reason: collision with root package name */
    protected ArrayList f21829h;

    /* renamed from: i  reason: collision with root package name */
    protected int f21830i;

    /* renamed from: j  reason: collision with root package name */
    protected int f21831j;

    /* renamed from: k  reason: collision with root package name */
    protected float f21832k = 0.0f;

    /* renamed from: l  reason: collision with root package name */
    int f21833l;

    /* renamed from: m  reason: collision with root package name */
    int f21834m;

    /* renamed from: n  reason: collision with root package name */
    int f21835n;

    /* renamed from: o  reason: collision with root package name */
    boolean f21836o;

    /* renamed from: p  reason: collision with root package name */
    private int f21837p;

    /* renamed from: q  reason: collision with root package name */
    private boolean f21838q;

    /* renamed from: r  reason: collision with root package name */
    protected boolean f21839r;

    /* renamed from: s  reason: collision with root package name */
    protected boolean f21840s;

    /* renamed from: t  reason: collision with root package name */
    protected boolean f21841t;

    /* renamed from: u  reason: collision with root package name */
    protected boolean f21842u;

    /* renamed from: v  reason: collision with root package name */
    private boolean f21843v;

    public C2061c(C2063e eVar, int i10, boolean z10) {
        this.f21822a = eVar;
        this.f21837p = i10;
        this.f21838q = z10;
    }

    private void b() {
        int i10 = this.f21837p * 2;
        C2063e eVar = this.f21822a;
        boolean z10 = true;
        this.f21836o = true;
        C2063e eVar2 = eVar;
        boolean z11 = false;
        while (!z11) {
            this.f21830i++;
            C2063e[] eVarArr = eVar.f21895P0;
            int i11 = this.f21837p;
            C2063e eVar3 = null;
            eVarArr[i11] = null;
            eVar.f21893O0[i11] = null;
            if (eVar.X() != 8) {
                this.f21833l++;
                C2063e.b w10 = eVar.w(this.f21837p);
                C2063e.b bVar = C2063e.b.MATCH_CONSTRAINT;
                if (w10 != bVar) {
                    this.f21834m += eVar.G(this.f21837p);
                }
                int f10 = this.f21834m + eVar.f21908Y[i10].f();
                this.f21834m = f10;
                int i12 = i10 + 1;
                this.f21834m = f10 + eVar.f21908Y[i12].f();
                int f11 = this.f21835n + eVar.f21908Y[i10].f();
                this.f21835n = f11;
                this.f21835n = f11 + eVar.f21908Y[i12].f();
                if (this.f21823b == null) {
                    this.f21823b = eVar;
                }
                this.f21825d = eVar;
                C2063e.b[] bVarArr = eVar.f21913b0;
                int i13 = this.f21837p;
                if (bVarArr[i13] == bVar) {
                    int i14 = eVar.f21958y[i13];
                    if (i14 == 0 || i14 == 3 || i14 == 2) {
                        this.f21831j++;
                        float f12 = eVar.f21891N0[i13];
                        if (f12 > 0.0f) {
                            this.f21832k += f12;
                        }
                        if (c(eVar, i13)) {
                            if (f12 < 0.0f) {
                                this.f21839r = true;
                            } else {
                                this.f21840s = true;
                            }
                            if (this.f21829h == null) {
                                this.f21829h = new ArrayList();
                            }
                            this.f21829h.add(eVar);
                        }
                        if (this.f21827f == null) {
                            this.f21827f = eVar;
                        }
                        C2063e eVar4 = this.f21828g;
                        if (eVar4 != null) {
                            eVar4.f21893O0[this.f21837p] = eVar;
                        }
                        this.f21828g = eVar;
                    }
                    if (this.f21837p == 0) {
                        if (eVar.f21954w != 0) {
                            this.f21836o = false;
                        } else if (!(eVar.f21960z == 0 && eVar.f21864A == 0)) {
                            this.f21836o = false;
                        }
                    } else if (eVar.f21956x != 0) {
                        this.f21836o = false;
                    } else if (!(eVar.f21868C == 0 && eVar.f21870D == 0)) {
                        this.f21836o = false;
                    }
                    if (eVar.f21921f0 != 0.0f) {
                        this.f21836o = false;
                        this.f21842u = true;
                    }
                }
            }
            if (eVar2 != eVar) {
                eVar2.f21895P0[this.f21837p] = eVar;
            }
            C2062d dVar = eVar.f21908Y[i10 + 1].f21849f;
            if (dVar != null) {
                C2063e eVar5 = dVar.f21847d;
                C2062d dVar2 = eVar5.f21908Y[i10].f21849f;
                if (dVar2 != null && dVar2.f21847d == eVar) {
                    eVar3 = eVar5;
                }
            }
            if (eVar3 == null) {
                eVar3 = eVar;
                z11 = true;
            }
            eVar2 = eVar;
            eVar = eVar3;
        }
        C2063e eVar6 = this.f21823b;
        if (eVar6 != null) {
            this.f21834m -= eVar6.f21908Y[i10].f();
        }
        C2063e eVar7 = this.f21825d;
        if (eVar7 != null) {
            this.f21834m -= eVar7.f21908Y[i10 + 1].f();
        }
        this.f21824c = eVar;
        if (this.f21837p != 0 || !this.f21838q) {
            this.f21826e = this.f21822a;
        } else {
            this.f21826e = eVar;
        }
        if (!this.f21840s || !this.f21839r) {
            z10 = false;
        }
        this.f21841t = z10;
    }

    private static boolean c(C2063e eVar, int i10) {
        int i11;
        if (eVar.X() != 8 && eVar.f21913b0[i10] == C2063e.b.MATCH_CONSTRAINT && ((i11 = eVar.f21958y[i10]) == 0 || i11 == 3)) {
            return true;
        }
        return false;
    }

    public void a() {
        if (!this.f21843v) {
            b();
        }
        this.f21843v = true;
    }
}
