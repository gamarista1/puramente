package La;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C4535q;
import za.C5298a;
import za.c;

/* renamed from: La.f  reason: case insensitive filesystem */
public class C4343f extends C5298a {
    public static final Parcelable.Creator<C4343f> CREATOR = new o0();

    /* renamed from: a  reason: collision with root package name */
    private final boolean f51590a;

    public C4343f(boolean z10) {
        this.f51590a = z10;
    }

    public boolean equals(Object obj) {
        if ((obj instanceof C4343f) && this.f51590a == ((C4343f) obj).f51590a) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return C4535q.c(Boolean.valueOf(this.f51590a));
    }

    public boolean o0() {
        return this.f51590a;
    }

    public void writeToParcel(Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.g(parcel, 1, o0());
        c.b(parcel, a10);
    }
}
