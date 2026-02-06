package g5;

import V4.r;
import e5.C3496g;

/* renamed from: g5.e  reason: case insensitive filesystem */
public class C3532e extends C3496g implements r {
    public C3532e(C3530c cVar) {
        super(cVar);
    }

    public Class a() {
        return C3530c.class;
    }

    public int getSize() {
        return ((C3530c) this.f43343a).i();
    }

    public void initialize() {
        ((C3530c) this.f43343a).e().prepareToDraw();
    }

    public void recycle() {
        ((C3530c) this.f43343a).stop();
        ((C3530c) this.f43343a).k();
    }
}
