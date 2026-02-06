package La;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C4535q;
import com.google.android.gms.common.internal.C4536s;
import java.util.HashSet;
import java.util.List;
import za.C5298a;
import za.c;

public final class C0 extends C5298a {
    public static final Parcelable.Creator<C0> CREATOR = new D0();

    /* renamed from: a  reason: collision with root package name */
    private final List f51541a;

    public C0(List list) {
        this.f51541a = (List) C4536s.l(list);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C0)) {
            return false;
        }
        C0 c02 = (C0) obj;
        if (!this.f51541a.containsAll(c02.f51541a) || !c02.f51541a.containsAll(this.f51541a)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return C4535q.c(new HashSet(this.f51541a));
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.H(parcel, 1, this.f51541a, false);
        c.b(parcel, a10);
    }
}
