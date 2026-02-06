package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C4535q;
import com.google.android.gms.common.internal.ReflectedParcelable;
import java.util.Arrays;
import za.C5298a;
import za.c;

public final class LocationAvailability extends C5298a implements ReflectedParcelable {
    public static final Parcelable.Creator<LocationAvailability> CREATOR = new D();

    /* renamed from: a  reason: collision with root package name */
    int f54341a;

    /* renamed from: b  reason: collision with root package name */
    int f54342b;

    /* renamed from: c  reason: collision with root package name */
    long f54343c;

    /* renamed from: d  reason: collision with root package name */
    int f54344d;

    /* renamed from: e  reason: collision with root package name */
    N[] f54345e;

    LocationAvailability(int i10, int i11, int i12, long j10, N[] nArr) {
        this.f54344d = i10;
        this.f54341a = i11;
        this.f54342b = i12;
        this.f54343c = j10;
        this.f54345e = nArr;
    }

    public boolean equals(Object obj) {
        if (obj instanceof LocationAvailability) {
            LocationAvailability locationAvailability = (LocationAvailability) obj;
            if (this.f54341a == locationAvailability.f54341a && this.f54342b == locationAvailability.f54342b && this.f54343c == locationAvailability.f54343c && this.f54344d == locationAvailability.f54344d && Arrays.equals(this.f54345e, locationAvailability.f54345e)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public int hashCode() {
        return C4535q.c(Integer.valueOf(this.f54344d), Integer.valueOf(this.f54341a), Integer.valueOf(this.f54342b), Long.valueOf(this.f54343c), this.f54345e);
    }

    public boolean o0() {
        return this.f54344d < 1000;
    }

    public String toString() {
        boolean o02 = o0();
        StringBuilder sb2 = new StringBuilder(48);
        sb2.append("LocationAvailability[isLocationAvailable: ");
        sb2.append(o02);
        sb2.append("]");
        return sb2.toString();
    }

    public void writeToParcel(Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.t(parcel, 1, this.f54341a);
        c.t(parcel, 2, this.f54342b);
        c.w(parcel, 3, this.f54343c);
        c.t(parcel, 4, this.f54344d);
        c.G(parcel, 5, this.f54345e, i10, false);
        c.b(parcel, a10);
    }
}
