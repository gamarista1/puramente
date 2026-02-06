package La;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C4535q;
import za.C5298a;
import za.c;

/* renamed from: La.H  reason: case insensitive filesystem */
public class C4327H extends C5298a {
    public static final Parcelable.Creator<C4327H> CREATOR = new l0();

    /* renamed from: a  reason: collision with root package name */
    private final int f51559a;

    /* renamed from: b  reason: collision with root package name */
    private final short f51560b;

    /* renamed from: c  reason: collision with root package name */
    private final short f51561c;

    C4327H(int i10, short s10, short s11) {
        this.f51559a = i10;
        this.f51560b = s10;
        this.f51561c = s11;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C4327H)) {
            return false;
        }
        C4327H h10 = (C4327H) obj;
        if (this.f51559a == h10.f51559a && this.f51560b == h10.f51560b && this.f51561c == h10.f51561c) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return C4535q.c(Integer.valueOf(this.f51559a), Short.valueOf(this.f51560b), Short.valueOf(this.f51561c));
    }

    public short o0() {
        return this.f51560b;
    }

    public short p0() {
        return this.f51561c;
    }

    public int q0() {
        return this.f51559a;
    }

    public void writeToParcel(Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.t(parcel, 1, q0());
        c.C(parcel, 2, o0());
        c.C(parcel, 3, p0());
        c.b(parcel, a10);
    }
}
