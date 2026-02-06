package i1;

import f1.c;
import java.util.ArrayList;

/* renamed from: i1.n  reason: case insensitive filesystem */
public abstract class C2072n extends C2063e {

    /* renamed from: V0  reason: collision with root package name */
    public ArrayList f22048V0 = new ArrayList();

    public void a(C2063e eVar) {
        this.f22048V0.add(eVar);
        if (eVar.M() != null) {
            ((C2072n) eVar.M()).y1(eVar);
        }
        eVar.h1(this);
    }

    public void v0() {
        this.f22048V0.clear();
        super.v0();
    }

    public ArrayList w1() {
        return this.f22048V0;
    }

    public abstract void x1();

    public void y1(C2063e eVar) {
        this.f22048V0.remove(eVar);
        eVar.v0();
    }

    public void z0(c cVar) {
        super.z0(cVar);
        int size = this.f22048V0.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((C2063e) this.f22048V0.get(i10)).z0(cVar);
        }
    }

    public void z1() {
        this.f22048V0.clear();
    }
}
