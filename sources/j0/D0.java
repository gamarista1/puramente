package J0;

import java.util.Comparator;
import java.util.TreeSet;

public final class D0 extends TreeSet {
    public D0(Comparator comparator) {
        super(comparator);
    }

    public /* bridge */ int a() {
        return super.size();
    }

    public final /* bridge */ int size() {
        return a();
    }
}
