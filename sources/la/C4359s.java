package La;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C4535q;
import za.C5298a;
import za.c;

/* renamed from: La.s  reason: case insensitive filesystem */
public class C4359s extends C5298a {
    public static final Parcelable.Creator<C4359s> CREATOR = new O();

    /* renamed from: a  reason: collision with root package name */
    private final boolean f51647a;

    public C4359s(boolean z10) {
        this.f51647a = z10;
    }

    public boolean equals(Object obj) {
        if ((obj instanceof C4359s) && this.f51647a == ((C4359s) obj).o0()) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return C4535q.c(Boolean.valueOf(this.f51647a));
    }

    public boolean o0() {
        return this.f51647a;
    }

    public void writeToParcel(Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.g(parcel, 1, o0());
        c.b(parcel, a10);
    }
}
