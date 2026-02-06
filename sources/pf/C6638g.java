package pf;

import java.util.Comparator;
import kotlin.jvm.internal.C6496s;

/* renamed from: pf.g  reason: case insensitive filesystem */
final class C6638g implements Comparator {

    /* renamed from: a  reason: collision with root package name */
    public static final C6638g f72483a = new C6638g();

    private C6638g() {
    }

    /* renamed from: a */
    public int compare(Comparable comparable, Comparable comparable2) {
        C6496s.h(comparable, "a");
        C6496s.h(comparable2, "b");
        return comparable2.compareTo(comparable);
    }

    public final Comparator reversed() {
        return C6637f.f72482a;
    }
}
