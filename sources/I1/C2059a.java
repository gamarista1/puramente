package i1;

import f1.d;
import f1.i;
import i1.C2062d;
import i1.C2063e;
import java.util.HashMap;

/* renamed from: i1.a  reason: case insensitive filesystem */
public class C2059a extends C2068j {

    /* renamed from: X0  reason: collision with root package name */
    private int f21818X0 = 0;

    /* renamed from: Y0  reason: collision with root package name */
    private boolean f21819Y0 = true;

    /* renamed from: Z0  reason: collision with root package name */
    private int f21820Z0 = 0;

    /* renamed from: a1  reason: collision with root package name */
    boolean f21821a1 = false;

    public int A1() {
        return this.f21818X0;
    }

    public int B1() {
        return this.f21820Z0;
    }

    public int C1() {
        int i10 = this.f21818X0;
        if (i10 == 0 || i10 == 1) {
            return 0;
        }
        if (i10 == 2 || i10 == 3) {
            return 1;
        }
        return -1;
    }

    /* access modifiers changed from: protected */
    public void D1() {
        for (int i10 = 0; i10 < this.f22033W0; i10++) {
            C2063e eVar = this.f22032V0[i10];
            if (this.f21819Y0 || eVar.h()) {
                int i11 = this.f21818X0;
                if (i11 == 0 || i11 == 1) {
                    eVar.X0(0, true);
                } else if (i11 == 2 || i11 == 3) {
                    eVar.X0(1, true);
                }
            }
        }
    }

    public void E1(boolean z10) {
        this.f21819Y0 = z10;
    }

    public void F1(int i10) {
        this.f21818X0 = i10;
    }

    public void G1(int i10) {
        this.f21820Z0 = i10;
    }

    public void g(d dVar, boolean z10) {
        C2062d[] dVarArr;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        C2062d[] dVarArr2 = this.f21908Y;
        dVarArr2[0] = this.f21896Q;
        dVarArr2[2] = this.f21898R;
        dVarArr2[1] = this.f21900S;
        dVarArr2[3] = this.f21902T;
        int i15 = 0;
        while (true) {
            dVarArr = this.f21908Y;
            if (i15 >= dVarArr.length) {
                break;
            }
            C2062d dVar2 = dVarArr[i15];
            dVar2.f21852i = dVar.q(dVar2);
            i15++;
        }
        int i16 = this.f21818X0;
        if (i16 >= 0 && i16 < 4) {
            C2062d dVar3 = dVarArr[i16];
            if (!this.f21821a1) {
                y1();
            }
            if (this.f21821a1) {
                this.f21821a1 = false;
                int i17 = this.f21818X0;
                if (i17 == 0 || i17 == 1) {
                    dVar.f(this.f21896Q.f21852i, this.f21925h0);
                    dVar.f(this.f21900S.f21852i, this.f21925h0);
                } else if (i17 == 2 || i17 == 3) {
                    dVar.f(this.f21898R.f21852i, this.f21927i0);
                    dVar.f(this.f21902T.f21852i, this.f21927i0);
                }
            } else {
                int i18 = 0;
                while (true) {
                    if (i18 >= this.f22033W0) {
                        z11 = false;
                        break;
                    }
                    C2063e eVar = this.f22032V0[i18];
                    if ((this.f21819Y0 || eVar.h()) && ((((i13 = this.f21818X0) == 0 || i13 == 1) && eVar.C() == C2063e.b.MATCH_CONSTRAINT && eVar.f21896Q.f21849f != null && eVar.f21900S.f21849f != null) || (((i14 = this.f21818X0) == 2 || i14 == 3) && eVar.V() == C2063e.b.MATCH_CONSTRAINT && eVar.f21898R.f21849f != null && eVar.f21902T.f21849f != null))) {
                        z11 = true;
                    } else {
                        i18++;
                    }
                }
                z11 = true;
                if (this.f21896Q.l() || this.f21900S.l()) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (this.f21898R.l() || this.f21902T.l()) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                if (z11 || (((i12 = this.f21818X0) != 0 || !z12) && ((i12 != 2 || !z13) && ((i12 != 1 || !z12) && (i12 != 3 || !z13))))) {
                    z14 = false;
                } else {
                    z14 = true;
                }
                if (!z14) {
                    i10 = 4;
                } else {
                    i10 = 5;
                }
                for (int i19 = 0; i19 < this.f22033W0; i19++) {
                    C2063e eVar2 = this.f22032V0[i19];
                    if (this.f21819Y0 || eVar2.h()) {
                        i q10 = dVar.q(eVar2.f21908Y[this.f21818X0]);
                        C2062d[] dVarArr3 = eVar2.f21908Y;
                        int i20 = this.f21818X0;
                        C2062d dVar4 = dVarArr3[i20];
                        dVar4.f21852i = q10;
                        C2062d dVar5 = dVar4.f21849f;
                        if (dVar5 == null || dVar5.f21847d != this) {
                            i11 = 0;
                        } else {
                            i11 = dVar4.f21850g;
                        }
                        if (i20 == 0 || i20 == 2) {
                            dVar.i(dVar3.f21852i, q10, this.f21820Z0 - i11, z11);
                        } else {
                            dVar.g(dVar3.f21852i, q10, this.f21820Z0 + i11, z11);
                        }
                        dVar.e(dVar3.f21852i, q10, this.f21820Z0 + i11, i10);
                    }
                }
                int i21 = this.f21818X0;
                if (i21 == 0) {
                    dVar.e(this.f21900S.f21852i, this.f21896Q.f21852i, 0, 8);
                    dVar.e(this.f21896Q.f21852i, this.f21915c0.f21900S.f21852i, 0, 4);
                    dVar.e(this.f21896Q.f21852i, this.f21915c0.f21896Q.f21852i, 0, 0);
                } else if (i21 == 1) {
                    dVar.e(this.f21896Q.f21852i, this.f21900S.f21852i, 0, 8);
                    dVar.e(this.f21896Q.f21852i, this.f21915c0.f21896Q.f21852i, 0, 4);
                    dVar.e(this.f21896Q.f21852i, this.f21915c0.f21900S.f21852i, 0, 0);
                } else if (i21 == 2) {
                    dVar.e(this.f21902T.f21852i, this.f21898R.f21852i, 0, 8);
                    dVar.e(this.f21898R.f21852i, this.f21915c0.f21902T.f21852i, 0, 4);
                    dVar.e(this.f21898R.f21852i, this.f21915c0.f21898R.f21852i, 0, 0);
                } else if (i21 == 3) {
                    dVar.e(this.f21898R.f21852i, this.f21902T.f21852i, 0, 8);
                    dVar.e(this.f21898R.f21852i, this.f21915c0.f21898R.f21852i, 0, 4);
                    dVar.e(this.f21898R.f21852i, this.f21915c0.f21902T.f21852i, 0, 0);
                }
            }
        }
    }

    public boolean h() {
        return true;
    }

    public void n(C2063e eVar, HashMap hashMap) {
        super.n(eVar, hashMap);
        C2059a aVar = (C2059a) eVar;
        this.f21818X0 = aVar.f21818X0;
        this.f21819Y0 = aVar.f21819Y0;
        this.f21820Z0 = aVar.f21820Z0;
    }

    public boolean p0() {
        return this.f21821a1;
    }

    public boolean q0() {
        return this.f21821a1;
    }

    public String toString() {
        String str = "[Barrier] " + v() + " {";
        for (int i10 = 0; i10 < this.f22033W0; i10++) {
            C2063e eVar = this.f22032V0[i10];
            if (i10 > 0) {
                str = str + ", ";
            }
            str = str + eVar.v();
        }
        return str + "}";
    }

    public boolean y1() {
        int i10;
        int i11;
        int i12;
        boolean z10 = true;
        int i13 = 0;
        while (true) {
            i10 = this.f22033W0;
            if (i13 >= i10) {
                break;
            }
            C2063e eVar = this.f22032V0[i13];
            if ((this.f21819Y0 || eVar.h()) && ((((i11 = this.f21818X0) == 0 || i11 == 1) && !eVar.p0()) || (((i12 = this.f21818X0) == 2 || i12 == 3) && !eVar.q0()))) {
                z10 = false;
            }
            i13++;
        }
        if (!z10 || i10 <= 0) {
            return false;
        }
        int i14 = 0;
        boolean z11 = false;
        for (int i15 = 0; i15 < this.f22033W0; i15++) {
            C2063e eVar2 = this.f22032V0[i15];
            if (this.f21819Y0 || eVar2.h()) {
                if (!z11) {
                    int i16 = this.f21818X0;
                    if (i16 == 0) {
                        i14 = eVar2.q(C2062d.a.LEFT).e();
                    } else if (i16 == 1) {
                        i14 = eVar2.q(C2062d.a.RIGHT).e();
                    } else if (i16 == 2) {
                        i14 = eVar2.q(C2062d.a.TOP).e();
                    } else if (i16 == 3) {
                        i14 = eVar2.q(C2062d.a.BOTTOM).e();
                    }
                    z11 = true;
                }
                int i17 = this.f21818X0;
                if (i17 == 0) {
                    i14 = Math.min(i14, eVar2.q(C2062d.a.LEFT).e());
                } else if (i17 == 1) {
                    i14 = Math.max(i14, eVar2.q(C2062d.a.RIGHT).e());
                } else if (i17 == 2) {
                    i14 = Math.min(i14, eVar2.q(C2062d.a.TOP).e());
                } else if (i17 == 3) {
                    i14 = Math.max(i14, eVar2.q(C2062d.a.BOTTOM).e());
                }
            }
        }
        int i18 = i14 + this.f21820Z0;
        int i19 = this.f21818X0;
        if (i19 == 0 || i19 == 1) {
            K0(i18, i18);
        } else {
            N0(i18, i18);
        }
        this.f21821a1 = true;
        return true;
    }

    public boolean z1() {
        return this.f21819Y0;
    }
}
