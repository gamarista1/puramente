package pf;

import java.util.Comparator;
import kotlin.jvm.internal.C6496s;

/* renamed from: pf.f  reason: case insensitive filesystem */
final class C6637f implements Comparator {

    /* renamed from: a  reason: collision with root package name */
    public static final C6637f f72482a = new C6637f();

    private C6637f() {
    }

    /* renamed from: a */
    public int compare(Comparable comparable, Comparable comparable2) {
        C6496s.h(comparable, "a");
        C6496s.h(comparable2, "b");
        return comparable.compareTo(comparable2);
    }

    public final Comparator reversed() {
        return C6638g.f72483a;
    }
}
