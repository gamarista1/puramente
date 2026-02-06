package j1;

import i1.C2063e;
import i1.C2066h;

class j extends p {
    j(C2063e eVar) {
        super(eVar);
        eVar.f21918e.f();
        eVar.f21920f.f();
        this.f22685f = ((C2066h) eVar).x1();
    }

    private void q(f fVar) {
        this.f22687h.f22638k.add(fVar);
        fVar.f22639l.add(this.f22687h);
    }

    public void a(d dVar) {
        f fVar = this.f22687h;
        if (fVar.f22630c && !fVar.f22637j) {
            this.f22687h.d((int) ((((float) ((f) fVar.f22639l.get(0)).f22634g) * ((C2066h) this.f22681b).A1()) + 0.5f));
        }
    }

    /* access modifiers changed from: package-private */
    public void d() {
        C2066h hVar = (C2066h) this.f22681b;
        int y12 = hVar.y1();
        int z12 = hVar.z1();
        hVar.A1();
        if (hVar.x1() == 1) {
            if (y12 != -1) {
                this.f22687h.f22639l.add(this.f22681b.f21915c0.f21918e.f22687h);
                this.f22681b.f21915c0.f21918e.f22687h.f22638k.add(this.f22687h);
                this.f22687h.f22633f = y12;
            } else if (z12 != -1) {
                this.f22687h.f22639l.add(this.f22681b.f21915c0.f21918e.f22688i);
                this.f22681b.f21915c0.f21918e.f22688i.f22638k.add(this.f22687h);
                this.f22687h.f22633f = -z12;
            } else {
                f fVar = this.f22687h;
                fVar.f22629b = true;
                fVar.f22639l.add(this.f22681b.f21915c0.f21918e.f22688i);
                this.f22681b.f21915c0.f21918e.f22688i.f22638k.add(this.f22687h);
            }
            q(this.f22681b.f21918e.f22687h);
            q(this.f22681b.f21918e.f22688i);
            return;
        }
        if (y12 != -1) {
            this.f22687h.f22639l.add(this.f22681b.f21915c0.f21920f.f22687h);
            this.f22681b.f21915c0.f21920f.f22687h.f22638k.add(this.f22687h);
            this.f22687h.f22633f = y12;
        } else if (z12 != -1) {
            this.f22687h.f22639l.add(this.f22681b.f21915c0.f21920f.f22688i);
            this.f22681b.f21915c0.f21920f.f22688i.f22638k.add(this.f22687h);
            this.f22687h.f22633f = -z12;
        } else {
            f fVar2 = this.f22687h;
            fVar2.f22629b = true;
            fVar2.f22639l.add(this.f22681b.f21915c0.f21920f.f22688i);
            this.f22681b.f21915c0.f21920f.f22688i.f22638k.add(this.f22687h);
        }
        q(this.f22681b.f21920f.f22687h);
        q(this.f22681b.f21920f.f22688i);
    }

    public void e() {
        if (((C2066h) this.f22681b).x1() == 1) {
            this.f22681b.r1(this.f22687h.f22634g);
        } else {
            this.f22681b.s1(this.f22687h.f22634g);
        }
    }

    /* access modifiers changed from: package-private */
    public void f() {
        this.f22687h.c();
    }

    /* access modifiers changed from: package-private */
    public boolean m() {
        return false;
    }
}
