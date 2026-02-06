package Jg;

import java.util.ArrayList;

public final class a extends ArrayList implements k {
    public a(int i10) {
        super(i10);
    }

    public /* bridge */ boolean a(l lVar) {
        return super.contains(lVar);
    }

    public final /* bridge */ boolean contains(Object obj) {
        if (!(obj instanceof l)) {
            return false;
        }
        return a((l) obj);
    }

    public /* bridge */ int d() {
        return super.size();
    }

    public /* bridge */ int g(l lVar) {
        return super.indexOf(lVar);
    }

    public /* bridge */ int h(l lVar) {
        return super.lastIndexOf(lVar);
    }

    public final /* bridge */ int indexOf(Object obj) {
        if (!(obj instanceof l)) {
            return -1;
        }
        return g((l) obj);
    }

    public /* bridge */ boolean k(l lVar) {
        return super.remove(lVar);
    }

    public final /* bridge */ int lastIndexOf(Object obj) {
        if (!(obj instanceof l)) {
            return -1;
        }
        return h((l) obj);
    }

    public final /* bridge */ boolean remove(Object obj) {
        if (!(obj instanceof l)) {
            return false;
        }
        return k((l) obj);
    }

    public final /* bridge */ int size() {
        return d();
    }
}
