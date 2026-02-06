package B4;

import I4.a;
import java.util.List;
import x4.C4155a;
import x4.C4164j;
import x4.k;

public class e implements o {

    /* renamed from: a  reason: collision with root package name */
    private final List f29792a;

    public e(List list) {
        this.f29792a = list;
    }

    public boolean g() {
        if (this.f29792a.size() != 1 || !((a) this.f29792a.get(0)).i()) {
            return false;
        }
        return true;
    }

    public C4155a h() {
        if (((a) this.f29792a.get(0)).i()) {
            return new k(this.f29792a);
        }
        return new C4164j(this.f29792a);
    }

    public List i() {
        return this.f29792a;
    }
}
