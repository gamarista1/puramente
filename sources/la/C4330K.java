package La;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C4535q;
import com.google.android.gms.common.internal.C4536s;
import za.C5298a;
import za.c;

/* renamed from: La.K  reason: case insensitive filesystem */
public final class C4330K extends C5298a {
    public static final Parcelable.Creator<C4330K> CREATOR = new C4331L();

    /* renamed from: a  reason: collision with root package name */
    private final long f51563a;

    public C4330K(long j10) {
        this.f51563a = ((Long) C4536s.l(Long.valueOf(j10))).longValue();
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof C4330K) && this.f51563a == ((C4330K) obj).f51563a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return C4535q.c(Long.valueOf(this.f51563a));
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.w(parcel, 1, this.f51563a);
        c.b(parcel, a10);
    }
}
