package ra;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C4535q;
import za.C5298a;
import za.c;

public class h extends C5298a {
    public static final Parcelable.Creator<h> CREATOR = new y();

    /* renamed from: a  reason: collision with root package name */
    private final PendingIntent f61539a;

    public h(PendingIntent pendingIntent) {
        this.f61539a = pendingIntent;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof h)) {
            return false;
        }
        return C4535q.b(this.f61539a, ((h) obj).f61539a);
    }

    public int hashCode() {
        return C4535q.c(this.f61539a);
    }

    public PendingIntent o0() {
        return this.f61539a;
    }

    public void writeToParcel(Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.B(parcel, 1, o0(), i10, false);
        c.b(parcel, a10);
    }
}
