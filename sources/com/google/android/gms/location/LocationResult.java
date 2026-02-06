package com.google.android.gms.location;

import android.location.Location;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import za.C5298a;
import za.c;

public final class LocationResult extends C5298a implements ReflectedParcelable {
    public static final Parcelable.Creator<LocationResult> CREATOR = new F();

    /* renamed from: b  reason: collision with root package name */
    static final List f54355b = Collections.emptyList();

    /* renamed from: a  reason: collision with root package name */
    private final List f54356a;

    LocationResult(List list) {
        this.f54356a = list;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof LocationResult)) {
            return false;
        }
        LocationResult locationResult = (LocationResult) obj;
        if (locationResult.f54356a.size() != this.f54356a.size()) {
            return false;
        }
        Iterator it = this.f54356a.iterator();
        for (Location time : locationResult.f54356a) {
            if (((Location) it.next()).getTime() != time.getTime()) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int i10 = 17;
        for (Location time : this.f54356a) {
            long time2 = time.getTime();
            i10 = (i10 * 31) + ((int) (time2 ^ (time2 >>> 32)));
        }
        return i10;
    }

    public List o0() {
        return this.f54356a;
    }

    public String toString() {
        String valueOf = String.valueOf(this.f54356a);
        StringBuilder sb2 = new StringBuilder(valueOf.length() + 27);
        sb2.append("LocationResult[locations: ");
        sb2.append(valueOf);
        sb2.append("]");
        return sb2.toString();
    }

    public void writeToParcel(Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.H(parcel, 1, o0(), false);
        c.b(parcel, a10);
    }
}
