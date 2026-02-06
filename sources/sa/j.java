package Sa;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.T;
import za.C5298a;
import za.c;

public final class j extends C5298a {
    public static final Parcelable.Creator<j> CREATOR = new k();

    /* renamed from: a  reason: collision with root package name */
    final int f52366a;

    /* renamed from: b  reason: collision with root package name */
    final T f52367b;

    j(int i10, T t10) {
        this.f52366a = i10;
        this.f52367b = t10;
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.t(parcel, 1, this.f52366a);
        c.B(parcel, 2, this.f52367b, i10, false);
        c.b(parcel, a10);
    }
}
