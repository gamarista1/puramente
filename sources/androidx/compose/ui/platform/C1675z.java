package androidx.compose.ui.platform;

import O0.n;
import java.util.Comparator;
import pf.C6632a;

/* renamed from: androidx.compose.ui.platform.z  reason: case insensitive filesystem */
public final class C1675z implements Comparator {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Comparator f14093a;

    public C1675z(Comparator comparator) {
        this.f14093a = comparator;
    }

    public final int compare(Object obj, Object obj2) {
        int compare = this.f14093a.compare(obj, obj2);
        if (compare != 0) {
            return compare;
        }
        return C6632a.d(Integer.valueOf(((n) obj).o()), Integer.valueOf(((n) obj2).o()));
    }
}
