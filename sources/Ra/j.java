package ra;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C4535q;
import com.google.android.gms.common.internal.C4536s;
import za.C5298a;
import za.c;

public class j extends C5298a {
    public static final Parcelable.Creator<j> CREATOR = new C5179A();

    /* renamed from: a  reason: collision with root package name */
    private final PendingIntent f61546a;

    public j(PendingIntent pendingIntent) {
        this.f61546a = (PendingIntent) C4536s.l(pendingIntent);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof j)) {
            return false;
        }
        return C4535q.b(this.f61546a, ((j) obj).f61546a);
    }

    public int hashCode() {
        return C4535q.c(this.f61546a);
    }

    public PendingIntent o0() {
        return this.f61546a;
    }

    public void writeToParcel(Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.B(parcel, 1, o0(), i10, false);
        c.b(parcel, a10);
    }
}
