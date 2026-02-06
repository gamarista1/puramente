package j1;

import j1.f;

class g extends f {

    /* renamed from: m  reason: collision with root package name */
    public int f22649m;

    g(p pVar) {
        super(pVar);
        if (pVar instanceof l) {
            this.f22632e = f.a.HORIZONTAL_DIMENSION;
        } else {
            this.f22632e = f.a.VERTICAL_DIMENSION;
        }
    }

    public void d(int i10) {
        if (!this.f22637j) {
            this.f22637j = true;
            this.f22634g = i10;
            for (d dVar : this.f22638k) {
                dVar.a(dVar);
            }
        }
    }
}
