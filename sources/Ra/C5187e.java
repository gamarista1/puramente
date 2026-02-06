package ra;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C4535q;
import za.C5298a;
import za.c;

/* renamed from: ra.e  reason: case insensitive filesystem */
public class C5187e extends C5298a {
    public static final Parcelable.Creator<C5187e> CREATOR = new s();

    /* renamed from: a  reason: collision with root package name */
    private final int f61526a;

    C5187e(int i10) {
        this.f61526a = i10;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C5187e)) {
            return false;
        }
        return C4535q.b(Integer.valueOf(this.f61526a), Integer.valueOf(((C5187e) obj).f61526a));
    }

    public int hashCode() {
        return C4535q.c(Integer.valueOf(this.f61526a));
    }

    public void writeToParcel(Parcel parcel, int i10) {
        int i11 = this.f61526a;
        int a10 = c.a(parcel);
        c.t(parcel, 1, i11);
        c.b(parcel, a10);
    }
}
