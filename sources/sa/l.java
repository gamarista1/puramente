package Sa;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.V;
import za.C5298a;
import za.c;

public final class l extends C5298a {
    public static final Parcelable.Creator<l> CREATOR = new m();

    /* renamed from: a  reason: collision with root package name */
    final int f52368a;

    /* renamed from: b  reason: collision with root package name */
    private final ConnectionResult f52369b;

    /* renamed from: c  reason: collision with root package name */
    private final V f52370c;

    l(int i10, ConnectionResult connectionResult, V v10) {
        this.f52368a = i10;
        this.f52369b = connectionResult;
        this.f52370c = v10;
    }

    public final ConnectionResult o0() {
        return this.f52369b;
    }

    public final V p0() {
        return this.f52370c;
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.t(parcel, 1, this.f52368a);
        c.B(parcel, 2, this.f52369b, i10, false);
        c.B(parcel, 3, this.f52370c, i10, false);
        c.b(parcel, a10);
    }
}
