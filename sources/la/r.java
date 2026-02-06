package La;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C4535q;
import com.google.android.gms.common.internal.C4536s;
import za.C5298a;
import za.c;

public class r extends C5298a {
    public static final Parcelable.Creator<r> CREATOR = new H0();

    /* renamed from: a  reason: collision with root package name */
    private final String f51644a;

    public r(String str) {
        this.f51644a = (String) C4536s.l(str);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof r)) {
            return false;
        }
        return this.f51644a.equals(((r) obj).f51644a);
    }

    public int hashCode() {
        return C4535q.c(this.f51644a);
    }

    public String o0() {
        return this.f51644a;
    }

    public void writeToParcel(Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.D(parcel, 2, o0(), false);
        c.b(parcel, a10);
    }
}
