package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C4535q;
import za.C5298a;
import za.c;

public final class N extends C5298a {
    public static final Parcelable.Creator<N> CREATOR = new O();

    /* renamed from: a  reason: collision with root package name */
    public final int f54357a;

    /* renamed from: b  reason: collision with root package name */
    public final int f54358b;

    /* renamed from: c  reason: collision with root package name */
    public final long f54359c;

    /* renamed from: d  reason: collision with root package name */
    public final long f54360d;

    N(int i10, int i11, long j10, long j11) {
        this.f54357a = i10;
        this.f54358b = i11;
        this.f54359c = j10;
        this.f54360d = j11;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof N) {
            N n10 = (N) obj;
            if (this.f54357a == n10.f54357a && this.f54358b == n10.f54358b && this.f54359c == n10.f54359c && this.f54360d == n10.f54360d) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return C4535q.c(Integer.valueOf(this.f54358b), Integer.valueOf(this.f54357a), Long.valueOf(this.f54360d), Long.valueOf(this.f54359c));
    }

    public final String toString() {
        return "NetworkLocationStatus:" + " Wifi status: " + this.f54357a + " Cell status: " + this.f54358b + " elapsed time NS: " + this.f54360d + " system time ms: " + this.f54359c;
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.t(parcel, 1, this.f54357a);
        c.t(parcel, 2, this.f54358b);
        c.w(parcel, 3, this.f54359c);
        c.w(parcel, 4, this.f54360d);
        c.b(parcel, a10);
    }
}
