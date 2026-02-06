package La;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C4535q;
import za.C5298a;
import za.c;

/* renamed from: La.F  reason: case insensitive filesystem */
public class C4325F extends C5298a {
    public static final Parcelable.Creator<C4325F> CREATOR = new C4344f0();

    /* renamed from: a  reason: collision with root package name */
    private final boolean f51557a;

    public C4325F(boolean z10) {
        this.f51557a = z10;
    }

    public boolean equals(Object obj) {
        if ((obj instanceof C4325F) && this.f51557a == ((C4325F) obj).f51557a) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return C4535q.c(Boolean.valueOf(this.f51557a));
    }

    public boolean o0() {
        return this.f51557a;
    }

    public void writeToParcel(Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.g(parcel, 1, o0());
        c.b(parcel, a10);
    }
}
