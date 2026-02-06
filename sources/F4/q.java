package F4;

import B4.b;
import B4.d;
import C4.f;
import C4.g;
import C4.s;
import G4.c;
import I4.a;
import java.util.ArrayList;
import java.util.Collections;
import u4.C4071k;

abstract class q {

    /* renamed from: a  reason: collision with root package name */
    private static final c.a f30722a = c.a.a("nm", "g", "o", "t", "s", "e", "w", "lc", "lj", "ml", "hd", "d");

    /* renamed from: b  reason: collision with root package name */
    private static final c.a f30723b = c.a.a("p", "k");

    /* renamed from: c  reason: collision with root package name */
    private static final c.a f30724c = c.a.a("n", "v");

    static f a(c cVar, C4071k kVar) {
        String str;
        B4.c cVar2;
        g gVar;
        c cVar3 = cVar;
        C4071k kVar2 = kVar;
        ArrayList arrayList = new ArrayList();
        float f10 = 0.0f;
        String str2 = null;
        g gVar2 = null;
        B4.c cVar4 = null;
        B4.f fVar = null;
        B4.f fVar2 = null;
        b bVar = null;
        s.b bVar2 = null;
        s.c cVar5 = null;
        b bVar3 = null;
        boolean z10 = false;
        d dVar = null;
        while (cVar.q()) {
            switch (cVar3.T(f30722a)) {
                case 0:
                    str2 = cVar.F();
                    continue;
                case 1:
                    str = str2;
                    cVar.f();
                    int i10 = -1;
                    while (cVar.q()) {
                        int T10 = cVar3.T(f30723b);
                        if (T10 != 0) {
                            cVar2 = cVar4;
                            if (T10 != 1) {
                                cVar.U();
                                cVar.V();
                            } else {
                                cVar4 = C3001d.g(cVar3, kVar2, i10);
                            }
                        } else {
                            cVar2 = cVar4;
                            i10 = cVar.y();
                        }
                        cVar4 = cVar2;
                    }
                    B4.c cVar6 = cVar4;
                    cVar.o();
                    break;
                case 2:
                    String str3 = str2;
                    dVar = C3001d.h(cVar, kVar);
                    continue;
                case 3:
                    str = str2;
                    if (cVar.y() == 1) {
                        gVar = g.LINEAR;
                    } else {
                        gVar = g.RADIAL;
                    }
                    gVar2 = gVar;
                    break;
                case 4:
                    String str4 = str2;
                    fVar = C3001d.i(cVar, kVar);
                    continue;
                case 5:
                    String str5 = str2;
                    fVar2 = C3001d.i(cVar, kVar);
                    continue;
                case 6:
                    String str6 = str2;
                    bVar = C3001d.e(cVar, kVar);
                    continue;
                case 7:
                    str = str2;
                    bVar2 = s.b.values()[cVar.y() - 1];
                    break;
                case 8:
                    str = str2;
                    cVar5 = s.c.values()[cVar.y() - 1];
                    break;
                case 9:
                    str = str2;
                    f10 = (float) cVar.v();
                    break;
                case 10:
                    z10 = cVar.t();
                    continue;
                case 11:
                    cVar.b();
                    while (cVar.q()) {
                        cVar.f();
                        String str7 = null;
                        b bVar4 = null;
                        while (cVar.q()) {
                            int T11 = cVar3.T(f30724c);
                            if (T11 != 0) {
                                b bVar5 = bVar3;
                                if (T11 != 1) {
                                    cVar.U();
                                    cVar.V();
                                } else {
                                    bVar4 = C3001d.e(cVar, kVar);
                                }
                                bVar3 = bVar5;
                            } else {
                                b bVar6 = bVar3;
                                str7 = cVar.F();
                            }
                        }
                        b bVar7 = bVar3;
                        cVar.o();
                        if (str7.equals("o")) {
                            bVar3 = bVar4;
                        } else {
                            if (str7.equals("d") || str7.equals("g")) {
                                kVar2.u(true);
                                arrayList.add(bVar4);
                            }
                            bVar3 = bVar7;
                        }
                    }
                    b bVar8 = bVar3;
                    cVar.n();
                    if (arrayList.size() == 1) {
                        arrayList.add((b) arrayList.get(0));
                    }
                    bVar3 = bVar8;
                    continue;
                default:
                    cVar.U();
                    cVar.V();
                    continue;
            }
            str2 = str;
        }
        String str8 = str2;
        if (dVar == null) {
            dVar = new d(Collections.singletonList(new a(100)));
        }
        return new f(str8, gVar2, cVar4, dVar, fVar, fVar2, bVar, bVar2, cVar5, f10, arrayList, bVar3, z10);
    }
}
