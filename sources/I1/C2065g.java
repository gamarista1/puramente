package i1;

import android.support.v4.media.session.c;
import f1.d;
import java.util.ArrayList;
import java.util.HashMap;

/* renamed from: i1.g  reason: case insensitive filesystem */
public class C2065g extends C2071m {

    /* renamed from: A1  reason: collision with root package name */
    private int f21998A1 = 0;

    /* renamed from: B1  reason: collision with root package name */
    private int f21999B1 = -1;

    /* renamed from: C1  reason: collision with root package name */
    private int f22000C1 = 0;

    /* renamed from: D1  reason: collision with root package name */
    private ArrayList f22001D1 = new ArrayList();

    /* renamed from: E1  reason: collision with root package name */
    private C2063e[] f22002E1 = null;

    /* renamed from: F1  reason: collision with root package name */
    private C2063e[] f22003F1 = null;

    /* renamed from: G1  reason: collision with root package name */
    private int[] f22004G1 = null;

    /* renamed from: H1  reason: collision with root package name */
    private C2063e[] f22005H1;

    /* renamed from: I1  reason: collision with root package name */
    private int f22006I1 = 0;

    /* renamed from: k1  reason: collision with root package name */
    private int f22007k1 = -1;

    /* renamed from: l1  reason: collision with root package name */
    private int f22008l1 = -1;

    /* renamed from: m1  reason: collision with root package name */
    private int f22009m1 = -1;

    /* renamed from: n1  reason: collision with root package name */
    private int f22010n1 = -1;

    /* renamed from: o1  reason: collision with root package name */
    private int f22011o1 = -1;

    /* renamed from: p1  reason: collision with root package name */
    private int f22012p1 = -1;

    /* renamed from: q1  reason: collision with root package name */
    private float f22013q1 = 0.5f;

    /* renamed from: r1  reason: collision with root package name */
    private float f22014r1 = 0.5f;

    /* renamed from: s1  reason: collision with root package name */
    private float f22015s1 = 0.5f;

    /* renamed from: t1  reason: collision with root package name */
    private float f22016t1 = 0.5f;

    /* renamed from: u1  reason: collision with root package name */
    private float f22017u1 = 0.5f;

    /* renamed from: v1  reason: collision with root package name */
    private float f22018v1 = 0.5f;

    /* renamed from: w1  reason: collision with root package name */
    private int f22019w1 = 0;

    /* renamed from: x1  reason: collision with root package name */
    private int f22020x1 = 0;

    /* renamed from: y1  reason: collision with root package name */
    private int f22021y1 = 2;

    /* renamed from: z1  reason: collision with root package name */
    private int f22022z1 = 2;

    private void G1(boolean z10) {
        C2063e eVar;
        float f10;
        int i10;
        if (this.f22004G1 != null && this.f22003F1 != null && this.f22002E1 != null) {
            for (int i11 = 0; i11 < this.f22006I1; i11++) {
                this.f22005H1[i11].x0();
            }
            int[] iArr = this.f22004G1;
            int i12 = iArr[0];
            int i13 = iArr[1];
            float f11 = this.f22013q1;
            C2063e eVar2 = null;
            int i14 = 0;
            while (i14 < i12) {
                if (z10) {
                    i10 = (i12 - i14) - 1;
                    f10 = 1.0f - this.f22013q1;
                } else {
                    f10 = f11;
                    i10 = i14;
                }
                C2063e eVar3 = this.f22003F1[i10];
                if (!(eVar3 == null || eVar3.X() == 8)) {
                    if (i14 == 0) {
                        eVar3.l(eVar3.f21896Q, this.f21896Q, B1());
                        eVar3.S0(this.f22007k1);
                        eVar3.R0(f10);
                    }
                    if (i14 == i12 - 1) {
                        eVar3.l(eVar3.f21900S, this.f21900S, C1());
                    }
                    if (i14 > 0 && eVar2 != null) {
                        eVar3.l(eVar3.f21896Q, eVar2.f21900S, this.f22019w1);
                        eVar2.l(eVar2.f21900S, eVar3.f21896Q, 0);
                    }
                    eVar2 = eVar3;
                }
                i14++;
                f11 = f10;
            }
            for (int i15 = 0; i15 < i13; i15++) {
                C2063e eVar4 = this.f22002E1[i15];
                if (!(eVar4 == null || eVar4.X() == 8)) {
                    if (i15 == 0) {
                        eVar4.l(eVar4.f21898R, this.f21898R, D1());
                        eVar4.j1(this.f22008l1);
                        eVar4.i1(this.f22014r1);
                    }
                    if (i15 == i13 - 1) {
                        eVar4.l(eVar4.f21902T, this.f21902T, A1());
                    }
                    if (i15 > 0 && eVar2 != null) {
                        eVar4.l(eVar4.f21898R, eVar2.f21902T, this.f22020x1);
                        eVar2.l(eVar2.f21902T, eVar4.f21898R, 0);
                    }
                    eVar2 = eVar4;
                }
            }
            for (int i16 = 0; i16 < i12; i16++) {
                for (int i17 = 0; i17 < i13; i17++) {
                    int i18 = (i17 * i12) + i16;
                    if (this.f22000C1 == 1) {
                        i18 = (i16 * i13) + i17;
                    }
                    C2063e[] eVarArr = this.f22005H1;
                    if (!(i18 >= eVarArr.length || (eVar = eVarArr[i18]) == null || eVar.X() == 8)) {
                        C2063e eVar5 = this.f22003F1[i16];
                        C2063e eVar6 = this.f22002E1[i17];
                        if (eVar != eVar5) {
                            eVar.l(eVar.f21896Q, eVar5.f21896Q, 0);
                            eVar.l(eVar.f21900S, eVar5.f21900S, 0);
                        }
                        if (eVar != eVar6) {
                            eVar.l(eVar.f21898R, eVar6.f21898R, 0);
                            eVar.l(eVar.f21902T, eVar6.f21902T, 0);
                        }
                    }
                }
            }
        }
    }

    public void g(d dVar, boolean z10) {
        boolean z11;
        super.g(dVar, z10);
        if (M() == null || !((C2064f) M()).V1()) {
            z11 = false;
        } else {
            z11 = true;
        }
        int i10 = this.f21998A1;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 == 2) {
                    G1(z11);
                } else if (i10 == 3 && this.f22001D1.size() > 0) {
                    c.a(this.f22001D1.get(0));
                    throw null;
                }
            } else if (this.f22001D1.size() > 0) {
                c.a(this.f22001D1.get(0));
                throw null;
            }
        } else if (this.f22001D1.size() > 0) {
            c.a(this.f22001D1.get(0));
            throw null;
        }
        F1(false);
    }

    public void n(C2063e eVar, HashMap hashMap) {
        super.n(eVar, hashMap);
        C2065g gVar = (C2065g) eVar;
        this.f22007k1 = gVar.f22007k1;
        this.f22008l1 = gVar.f22008l1;
        this.f22009m1 = gVar.f22009m1;
        this.f22010n1 = gVar.f22010n1;
        this.f22011o1 = gVar.f22011o1;
        this.f22012p1 = gVar.f22012p1;
        this.f22013q1 = gVar.f22013q1;
        this.f22014r1 = gVar.f22014r1;
        this.f22015s1 = gVar.f22015s1;
        this.f22016t1 = gVar.f22016t1;
        this.f22017u1 = gVar.f22017u1;
        this.f22018v1 = gVar.f22018v1;
        this.f22019w1 = gVar.f22019w1;
        this.f22020x1 = gVar.f22020x1;
        this.f22021y1 = gVar.f22021y1;
        this.f22022z1 = gVar.f22022z1;
        this.f21998A1 = gVar.f21998A1;
        this.f21999B1 = gVar.f21999B1;
        this.f22000C1 = gVar.f22000C1;
    }
}
