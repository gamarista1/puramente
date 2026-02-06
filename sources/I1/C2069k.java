package i1;

import f1.d;
import i1.C2063e;

/* renamed from: i1.k  reason: case insensitive filesystem */
public abstract class C2069k {

    /* renamed from: a  reason: collision with root package name */
    static boolean[] f22034a = new boolean[3];

    static void a(C2064f fVar, d dVar, C2063e eVar) {
        eVar.f21948t = -1;
        eVar.f21950u = -1;
        C2063e.b bVar = fVar.f21913b0[0];
        C2063e.b bVar2 = C2063e.b.WRAP_CONTENT;
        if (bVar != bVar2 && eVar.f21913b0[0] == C2063e.b.MATCH_PARENT) {
            int i10 = eVar.f21896Q.f21850g;
            int Y10 = fVar.Y() - eVar.f21900S.f21850g;
            C2062d dVar2 = eVar.f21896Q;
            dVar2.f21852i = dVar.q(dVar2);
            C2062d dVar3 = eVar.f21900S;
            dVar3.f21852i = dVar.q(dVar3);
            dVar.f(eVar.f21896Q.f21852i, i10);
            dVar.f(eVar.f21900S.f21852i, Y10);
            eVar.f21948t = 2;
            eVar.T0(i10, Y10);
        }
        if (fVar.f21913b0[1] != bVar2 && eVar.f21913b0[1] == C2063e.b.MATCH_PARENT) {
            int i11 = eVar.f21898R.f21850g;
            int z10 = fVar.z() - eVar.f21902T.f21850g;
            C2062d dVar4 = eVar.f21898R;
            dVar4.f21852i = dVar.q(dVar4);
            C2062d dVar5 = eVar.f21902T;
            dVar5.f21852i = dVar.q(dVar5);
            dVar.f(eVar.f21898R.f21852i, i11);
            dVar.f(eVar.f21902T.f21852i, z10);
            if (eVar.f21937n0 > 0 || eVar.X() == 8) {
                C2062d dVar6 = eVar.f21904U;
                dVar6.f21852i = dVar.q(dVar6);
                dVar.f(eVar.f21904U.f21852i, eVar.f21937n0 + i11);
            }
            eVar.f21950u = 2;
            eVar.k1(i11, z10);
        }
    }

    public static final boolean b(int i10, int i11) {
        if ((i10 & i11) == i11) {
            return true;
        }
        return false;
    }
}
