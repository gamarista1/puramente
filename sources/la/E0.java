package La;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C4535q;
import com.google.android.gms.common.internal.C4536s;
import za.C5298a;
import za.c;

public final class E0 extends C5298a {
    public static final Parcelable.Creator<E0> CREATOR = new F0();

    /* renamed from: a  reason: collision with root package name */
    private final boolean f51556a;

    public E0(boolean z10) {
        this.f51556a = ((Boolean) C4536s.l(Boolean.valueOf(z10))).booleanValue();
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof E0) && this.f51556a == ((E0) obj).f51556a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return C4535q.c(Boolean.valueOf(this.f51556a));
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.g(parcel, 1, this.f51556a);
        c.b(parcel, a10);
    }
}
