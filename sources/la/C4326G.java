package La;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C4535q;
import java.util.HashSet;
import java.util.List;
import za.C5298a;
import za.c;

/* renamed from: La.G  reason: case insensitive filesystem */
public class C4326G extends C5298a {
    public static final Parcelable.Creator<C4326G> CREATOR = new j0();

    /* renamed from: a  reason: collision with root package name */
    private final List f51558a;

    C4326G(List list) {
        this.f51558a = list;
    }

    public boolean equals(Object obj) {
        List list;
        if (!(obj instanceof C4326G)) {
            return false;
        }
        C4326G g10 = (C4326G) obj;
        List list2 = this.f51558a;
        if ((list2 != null || g10.f51558a != null) && (list2 == null || (list = g10.f51558a) == null || !list2.containsAll(list) || !g10.f51558a.containsAll(this.f51558a))) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C4535q.c(new HashSet(this.f51558a));
    }

    public List o0() {
        return this.f51558a;
    }

    public void writeToParcel(Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.H(parcel, 1, o0(), false);
        c.b(parcel, a10);
    }
}
