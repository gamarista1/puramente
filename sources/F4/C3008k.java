package F4;

import B4.a;
import B4.b;
import G4.c;
import u4.C4071k;

/* renamed from: F4.k  reason: case insensitive filesystem */
public class C3008k {

    /* renamed from: f  reason: collision with root package name */
    private static final c.a f30708f = c.a.a("ef");

    /* renamed from: g  reason: collision with root package name */
    private static final c.a f30709g = c.a.a("nm", "v");

    /* renamed from: a  reason: collision with root package name */
    private a f30710a;

    /* renamed from: b  reason: collision with root package name */
    private b f30711b;

    /* renamed from: c  reason: collision with root package name */
    private b f30712c;

    /* renamed from: d  reason: collision with root package name */
    private b f30713d;

    /* renamed from: e  reason: collision with root package name */
    private b f30714e;

    private void a(c cVar, C4071k kVar) {
        cVar.f();
        String str = "";
        while (cVar.q()) {
            int T10 = cVar.T(f30709g);
            if (T10 != 0) {
                if (T10 == 1) {
                    str.hashCode();
                    char c10 = 65535;
                    switch (str.hashCode()) {
                        case 353103893:
                            if (str.equals("Distance")) {
                                c10 = 0;
                                break;
                            }
                            break;
                        case 397447147:
                            if (str.equals("Opacity")) {
                                c10 = 1;
                                break;
                            }
                            break;
                        case 1041377119:
                            if (str.equals("Direction")) {
                                c10 = 2;
                                break;
                            }
                            break;
                        case 1379387491:
                            if (str.equals("Shadow Color")) {
                                c10 = 3;
                                break;
                            }
                            break;
                        case 1383710113:
                            if (str.equals("Softness")) {
                                c10 = 4;
                                break;
                            }
                            break;
                    }
                    switch (c10) {
                        case 0:
                            this.f30713d = C3001d.e(cVar, kVar);
                            break;
                        case 1:
                            this.f30711b = C3001d.f(cVar, kVar, false);
                            break;
                        case 2:
                            this.f30712c = C3001d.f(cVar, kVar, false);
                            break;
                        case 3:
                            this.f30710a = C3001d.c(cVar, kVar);
                            break;
                        case 4:
                            this.f30714e = C3001d.e(cVar, kVar);
                            break;
                        default:
                            cVar.V();
                            break;
                    }
                } else {
                    cVar.U();
                    cVar.V();
                }
            } else {
                str = cVar.F();
            }
        }
        cVar.o();
    }

    /* access modifiers changed from: package-private */
    public C3007j b(c cVar, C4071k kVar) {
        b bVar;
        b bVar2;
        b bVar3;
        b bVar4;
        while (cVar.q()) {
            if (cVar.T(f30708f) != 0) {
                cVar.U();
                cVar.V();
            } else {
                cVar.b();
                while (cVar.q()) {
                    a(cVar, kVar);
                }
                cVar.n();
            }
        }
        a aVar = this.f30710a;
        if (aVar == null || (bVar = this.f30711b) == null || (bVar2 = this.f30712c) == null || (bVar3 = this.f30713d) == null || (bVar4 = this.f30714e) == null) {
            return null;
        }
        return new C3007j(aVar, bVar, bVar2, bVar3, bVar4);
    }
}
