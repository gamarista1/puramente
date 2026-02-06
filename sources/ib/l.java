package Ib;

import java.util.Comparator;

public class l implements Comparator {

    /* renamed from: a  reason: collision with root package name */
    private static l f51164a = new l();

    private l() {
    }

    public static l b(Class cls) {
        return f51164a;
    }

    /* renamed from: a */
    public int compare(Comparable comparable, Comparable comparable2) {
        return comparable.compareTo(comparable2);
    }
}
