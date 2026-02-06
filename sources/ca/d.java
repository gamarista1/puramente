package Ca;

import android.os.Parcel;
import android.os.Parcelable;
import za.C5298a;
import za.c;

public final class d extends C5298a {
    public static final Parcelable.Creator<d> CREATOR = new f();

    /* renamed from: a  reason: collision with root package name */
    final int f50387a;

    /* renamed from: b  reason: collision with root package name */
    final String f50388b;

    /* renamed from: c  reason: collision with root package name */
    final int f50389c;

    d(int i10, String str, int i11) {
        this.f50387a = i10;
        this.f50388b = str;
        this.f50389c = i11;
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        int i11 = this.f50387a;
        int a10 = c.a(parcel);
        c.t(parcel, 1, i11);
        c.D(parcel, 2, this.f50388b, false);
        c.t(parcel, 3, this.f50389c);
        c.b(parcel, a10);
    }

    d(String str, int i10) {
        this.f50387a = 1;
        this.f50388b = str;
        this.f50389c = i10;
    }
}
