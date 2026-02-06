package Tb;

import Lb.l;
import java.util.Comparator;

public abstract class h implements Comparator {
    public static h b(String str) {
        if (str.equals(".value")) {
            return u.j();
        }
        if (str.equals(".key")) {
            return j.j();
        }
        if (!str.equals(".priority")) {
            return new p(new l(str));
        }
        throw new IllegalStateException("queryDefinition shouldn't ever be .priority since it's the default");
    }

    public int a(m mVar, m mVar2, boolean z10) {
        if (z10) {
            return compare(mVar2, mVar);
        }
        return compare(mVar, mVar2);
    }

    public abstract String c();

    public boolean d(n nVar, n nVar2) {
        if (compare(new m(b.j(), nVar), new m(b.j(), nVar2)) != 0) {
            return true;
        }
        return false;
    }

    public abstract boolean e(n nVar);

    public abstract m f(b bVar, n nVar);

    public abstract m g();

    public m h() {
        return m.b();
    }
}
