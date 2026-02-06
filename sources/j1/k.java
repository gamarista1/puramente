package j1;

import i1.C2059a;
import i1.C2063e;
import j1.f;

class k extends p {
    k(C2063e eVar) {
        super(eVar);
    }

    private void q(f fVar) {
        this.f22687h.f22638k.add(fVar);
        fVar.f22639l.add(this.f22687h);
    }

    public void a(d dVar) {
        C2059a aVar = (C2059a) this.f22681b;
        int A12 = aVar.A1();
        int i10 = 0;
        int i11 = -1;
        for (f fVar : this.f22687h.f22639l) {
            int i12 = fVar.f22634g;
            if (i11 == -1 || i12 < i11) {
                i11 = i12;
            }
            if (i10 < i12) {
                i10 = i12;
            }
        }
        if (A12 == 0 || A12 == 2) {
            this.f22687h.d(i11 + aVar.B1());
        } else {
            this.f22687h.d(i10 + aVar.B1());
        }
    }

    /* access modifiers changed from: package-private */
    public void d() {
        C2063e eVar = this.f22681b;
        if (eVar instanceof C2059a) {
            this.f22687h.f22629b = true;
            C2059a aVar = (C2059a) eVar;
            int A12 = aVar.A1();
            boolean z12 = aVar.z1();
            int i10 = 0;
            if (A12 == 0) {
                this.f22687h.f22632e = f.a.LEFT;
                while (i10 < aVar.f22033W0) {
                    C2063e eVar2 = aVar.f22032V0[i10];
                    if (z12 || eVar2.X() != 8) {
                        f fVar = eVar2.f21918e.f22687h;
                        fVar.f22638k.add(this.f22687h);
                        this.f22687h.f22639l.add(fVar);
                    }
                    i10++;
                }
                q(this.f22681b.f21918e.f22687h);
                q(this.f22681b.f21918e.f22688i);
            } else if (A12 == 1) {
                this.f22687h.f22632e = f.a.RIGHT;
                while (i10 < aVar.f22033W0) {
                    C2063e eVar3 = aVar.f22032V0[i10];
                    if (z12 || eVar3.X() != 8) {
                        f fVar2 = eVar3.f21918e.f22688i;
                        fVar2.f22638k.add(this.f22687h);
                        this.f22687h.f22639l.add(fVar2);
                    }
                    i10++;
                }
                q(this.f22681b.f21918e.f22687h);
                q(this.f22681b.f21918e.f22688i);
            } else if (A12 == 2) {
                this.f22687h.f22632e = f.a.TOP;
                while (i10 < aVar.f22033W0) {
                    C2063e eVar4 = aVar.f22032V0[i10];
                    if (z12 || eVar4.X() != 8) {
                        f fVar3 = eVar4.f21920f.f22687h;
                        fVar3.f22638k.add(this.f22687h);
                        this.f22687h.f22639l.add(fVar3);
                    }
                    i10++;
                }
                q(this.f22681b.f21920f.f22687h);
                q(this.f22681b.f21920f.f22688i);
            } else if (A12 == 3) {
                this.f22687h.f22632e = f.a.BOTTOM;
                while (i10 < aVar.f22033W0) {
                    C2063e eVar5 = aVar.f22032V0[i10];
                    if (z12 || eVar5.X() != 8) {
                        f fVar4 = eVar5.f21920f.f22688i;
                        fVar4.f22638k.add(this.f22687h);
                        this.f22687h.f22639l.add(fVar4);
                    }
                    i10++;
                }
                q(this.f22681b.f21920f.f22687h);
                q(this.f22681b.f21920f.f22688i);
            }
        }
    }

    public void e() {
        C2063e eVar = this.f22681b;
        if (eVar instanceof C2059a) {
            int A12 = ((C2059a) eVar).A1();
            if (A12 == 0 || A12 == 1) {
                this.f22681b.r1(this.f22687h.f22634g);
            } else {
                this.f22681b.s1(this.f22687h.f22634g);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void f() {
        this.f22682c = null;
        this.f22687h.c();
    }

    /* access modifiers changed from: package-private */
    public boolean m() {
        return false;
    }
}
