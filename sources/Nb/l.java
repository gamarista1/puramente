package nb;

import java.io.Serializable;

public abstract class l implements Serializable {
    private static final long serialVersionUID = 0;

    l() {
    }

    public static l a() {
        return C5106a.e();
    }

    public static l d(Object obj) {
        return new r(o.j(obj));
    }

    public abstract Object b();

    public abstract boolean c();
}
