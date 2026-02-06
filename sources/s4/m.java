package S4;

import V4.r;
import e5.C3496g;

public class m extends C3496g implements r {
    public m(k kVar) {
        super(kVar);
    }

    public Class a() {
        return k.class;
    }

    public int getSize() {
        return ((k) this.f43343a).i();
    }

    public void initialize() {
        ((k) this.f43343a).e().prepareToDraw();
    }

    public void recycle() {
        ((k) this.f43343a).stop();
        ((k) this.f43343a).l();
    }
}
