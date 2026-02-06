package La;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C4535q;
import com.google.android.gms.common.internal.C4536s;
import za.C5298a;
import za.c;

public final class P extends C5298a {
    public static final Parcelable.Creator<P> CREATOR = new Q();

    /* renamed from: a  reason: collision with root package name */
    private final String f51565a;

    public P(String str) {
        this.f51565a = (String) C4536s.l(str);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof P)) {
            return false;
        }
        return this.f51565a.equals(((P) obj).f51565a);
    }

    public final int hashCode() {
        return C4535q.c(this.f51565a);
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.D(parcel, 1, this.f51565a, false);
        c.b(parcel, a10);
    }
}
