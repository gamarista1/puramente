package androidx.compose.ui.platform;

import O0.n;
import java.util.Comparator;

/* renamed from: androidx.compose.ui.platform.y  reason: case insensitive filesystem */
public final class C1673y implements Comparator {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Comparator f14088a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ Comparator f14089b;

    public C1673y(Comparator comparator, Comparator comparator2) {
        this.f14088a = comparator;
        this.f14089b = comparator2;
    }

    public final int compare(Object obj, Object obj2) {
        int compare = this.f14088a.compare(obj, obj2);
        if (compare != 0) {
            return compare;
        }
        return this.f14089b.compare(((n) obj).q(), ((n) obj2).q());
    }
}
