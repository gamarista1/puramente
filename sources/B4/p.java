package B4;

import I4.a;
import java.util.Arrays;
import java.util.List;

abstract class p implements o {

    /* renamed from: a  reason: collision with root package name */
    final List f29816a;

    p(List list) {
        this.f29816a = list;
    }

    public boolean g() {
        if (this.f29816a.isEmpty()) {
            return true;
        }
        if (this.f29816a.size() != 1 || !((a) this.f29816a.get(0)).i()) {
            return false;
        }
        return true;
    }

    public List i() {
        return this.f29816a;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        if (!this.f29816a.isEmpty()) {
            sb2.append("values=");
            sb2.append(Arrays.toString(this.f29816a.toArray()));
        }
        return sb2.toString();
    }
}
