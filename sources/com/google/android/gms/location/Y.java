package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.internal.C4535q;
import za.C5298a;
import za.c;

public final class Y extends C5298a {
    public static final Parcelable.Creator<Y> CREATOR = new Z();

    /* renamed from: a  reason: collision with root package name */
    boolean f54368a;

    /* renamed from: b  reason: collision with root package name */
    long f54369b;

    /* renamed from: c  reason: collision with root package name */
    float f54370c;

    /* renamed from: d  reason: collision with root package name */
    long f54371d;

    /* renamed from: e  reason: collision with root package name */
    int f54372e;

    public Y() {
        this(true, 50, 0.0f, Long.MAX_VALUE, a.e.API_PRIORITY_OTHER);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Y)) {
            return false;
        }
        Y y10 = (Y) obj;
        if (this.f54368a == y10.f54368a && this.f54369b == y10.f54369b && Float.compare(this.f54370c, y10.f54370c) == 0 && this.f54371d == y10.f54371d && this.f54372e == y10.f54372e) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return C4535q.c(Boolean.valueOf(this.f54368a), Long.valueOf(this.f54369b), Float.valueOf(this.f54370c), Long.valueOf(this.f54371d), Integer.valueOf(this.f54372e));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("DeviceOrientationRequest[mShouldUseMag=");
        sb2.append(this.f54368a);
        sb2.append(" mMinimumSamplingPeriodMs=");
        sb2.append(this.f54369b);
        sb2.append(" mSmallestAngleChangeRadians=");
        sb2.append(this.f54370c);
        long j10 = this.f54371d;
        if (j10 != Long.MAX_VALUE) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            sb2.append(" expireIn=");
            sb2.append(j10 - elapsedRealtime);
            sb2.append("ms");
        }
        if (this.f54372e != Integer.MAX_VALUE) {
            sb2.append(" num=");
            sb2.append(this.f54372e);
        }
        sb2.append(']');
        return sb2.toString();
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.g(parcel, 1, this.f54368a);
        c.w(parcel, 2, this.f54369b);
        c.p(parcel, 3, this.f54370c);
        c.w(parcel, 4, this.f54371d);
        c.t(parcel, 5, this.f54372e);
        c.b(parcel, a10);
    }

    Y(boolean z10, long j10, float f10, long j11, int i10) {
        this.f54368a = z10;
        this.f54369b = j10;
        this.f54370c = f10;
        this.f54371d = j11;
        this.f54372e = i10;
    }
}
