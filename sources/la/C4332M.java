package La;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C4535q;
import com.google.android.gms.common.internal.C4536s;
import za.C5298a;
import za.c;

/* renamed from: La.M  reason: case insensitive filesystem */
public final class C4332M extends C5298a {
    public static final Parcelable.Creator<C4332M> CREATOR = new N();

    /* renamed from: a  reason: collision with root package name */
    private final boolean f51564a;

    public C4332M(boolean z10) {
        this.f51564a = ((Boolean) C4536s.l(Boolean.valueOf(z10))).booleanValue();
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof C4332M) && this.f51564a == ((C4332M) obj).f51564a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return C4535q.c(Boolean.valueOf(this.f51564a));
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.g(parcel, 1, this.f51564a);
        c.b(parcel, a10);
    }
}
