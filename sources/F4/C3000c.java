package F4;

import B4.b;
import B4.e;
import B4.g;
import B4.i;
import B4.n;
import B4.o;
import G4.c;
import I4.a;
import I4.d;
import android.graphics.PointF;
import android.view.animation.Interpolator;
import u4.C4071k;

/* renamed from: F4.c  reason: case insensitive filesystem */
public abstract class C3000c {

    /* renamed from: a  reason: collision with root package name */
    private static final c.a f30694a = c.a.a("a", "p", "s", "rz", "r", "o", "so", "eo", "sk", "sa");

    /* renamed from: b  reason: collision with root package name */
    private static final c.a f30695b = c.a.a("k");

    private static boolean a(e eVar) {
        if (eVar == null || (eVar.g() && ((PointF) ((a) eVar.i().get(0)).f31739b).equals(0.0f, 0.0f))) {
            return true;
        }
        return false;
    }

    private static boolean b(o oVar) {
        if (oVar == null || (!(oVar instanceof i) && oVar.g() && ((PointF) ((a) oVar.i().get(0)).f31739b).equals(0.0f, 0.0f))) {
            return true;
        }
        return false;
    }

    private static boolean c(b bVar) {
        if (bVar == null || (bVar.g() && ((Float) ((a) bVar.i().get(0)).f31739b).floatValue() == 0.0f)) {
            return true;
        }
        return false;
    }

    private static boolean d(g gVar) {
        if (gVar == null || (gVar.g() && ((d) ((a) gVar.i().get(0)).f31739b).a(1.0f, 1.0f))) {
            return true;
        }
        return false;
    }

    private static boolean e(b bVar) {
        if (bVar == null || (bVar.g() && ((Float) ((a) bVar.i().get(0)).f31739b).floatValue() == 0.0f)) {
            return true;
        }
        return false;
    }

    private static boolean f(b bVar) {
        if (bVar == null || (bVar.g() && ((Float) ((a) bVar.i().get(0)).f31739b).floatValue() == 0.0f)) {
            return true;
        }
        return false;
    }

    public static n g(c cVar, C4071k kVar) {
        boolean z10;
        e eVar;
        o oVar;
        b bVar;
        b bVar2;
        b bVar3;
        boolean z11;
        c cVar2 = cVar;
        C4071k kVar2 = kVar;
        boolean z12 = false;
        if (cVar.M() == c.b.BEGIN_OBJECT) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            cVar.f();
        }
        b bVar4 = null;
        e eVar2 = null;
        o oVar2 = null;
        g gVar = null;
        b bVar5 = null;
        b bVar6 = null;
        B4.d dVar = null;
        b bVar7 = null;
        b bVar8 = null;
        while (cVar.q()) {
            switch (cVar2.T(f30694a)) {
                case 0:
                    boolean z13 = z12;
                    cVar.f();
                    while (cVar.q()) {
                        if (cVar2.T(f30695b) != 0) {
                            cVar.U();
                            cVar.V();
                        } else {
                            eVar2 = C2998a.a(cVar, kVar);
                        }
                    }
                    cVar.o();
                    z12 = z13;
                    continue;
                case 1:
                    boolean z14 = z12;
                    oVar2 = C2998a.b(cVar, kVar);
                    continue;
                case 2:
                    boolean z15 = z12;
                    gVar = C3001d.j(cVar, kVar);
                    continue;
                case 3:
                    kVar2.a("Lottie doesn't support 3D layers.");
                    break;
                case 4:
                    break;
                case 5:
                    dVar = C3001d.h(cVar, kVar);
                    continue;
                case 6:
                    bVar7 = C3001d.f(cVar2, kVar2, z12);
                    continue;
                case 7:
                    bVar8 = C3001d.f(cVar2, kVar2, z12);
                    continue;
                case 8:
                    bVar5 = C3001d.f(cVar2, kVar2, z12);
                    continue;
                case 9:
                    bVar6 = C3001d.f(cVar2, kVar2, z12);
                    continue;
                default:
                    cVar.U();
                    cVar.V();
                    continue;
            }
            b f10 = C3001d.f(cVar2, kVar2, z12);
            if (f10.i().isEmpty()) {
                a aVar = r1;
                a aVar2 = new a(kVar, Float.valueOf(0.0f), Float.valueOf(0.0f), (Interpolator) null, 0.0f, Float.valueOf(kVar.f()));
                f10.i().add(aVar);
            } else if (((a) f10.i().get(0)).f31739b == null) {
                z11 = false;
                f10.i().set(0, new a(kVar, Float.valueOf(0.0f), Float.valueOf(0.0f), (Interpolator) null, 0.0f, Float.valueOf(kVar.f())));
                z12 = z11;
                bVar4 = f10;
            }
            z11 = false;
            z12 = z11;
            bVar4 = f10;
        }
        if (z10) {
            cVar.o();
        }
        if (a(eVar2)) {
            eVar = null;
        } else {
            eVar = eVar2;
        }
        if (b(oVar2)) {
            oVar = null;
        } else {
            oVar = oVar2;
        }
        if (c(bVar4)) {
            bVar = null;
        } else {
            bVar = bVar4;
        }
        if (d(gVar)) {
            gVar = null;
        }
        if (f(bVar5)) {
            bVar2 = null;
        } else {
            bVar2 = bVar5;
        }
        if (e(bVar6)) {
            bVar3 = null;
        } else {
            bVar3 = bVar6;
        }
        return new n(eVar, oVar, gVar, bVar, dVar, bVar7, bVar8, bVar2, bVar3);
    }
}
