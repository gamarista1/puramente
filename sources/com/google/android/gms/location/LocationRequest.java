package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import com.google.android.gms.common.internal.C4535q;
import com.google.android.gms.common.internal.ReflectedParcelable;
import za.C5298a;
import za.c;

public final class LocationRequest extends C5298a implements ReflectedParcelable {
    public static final Parcelable.Creator<LocationRequest> CREATOR = new E();

    /* renamed from: a  reason: collision with root package name */
    int f54346a;

    /* renamed from: b  reason: collision with root package name */
    long f54347b;

    /* renamed from: c  reason: collision with root package name */
    long f54348c;

    /* renamed from: d  reason: collision with root package name */
    boolean f54349d;

    /* renamed from: e  reason: collision with root package name */
    long f54350e;

    /* renamed from: f  reason: collision with root package name */
    int f54351f;

    /* renamed from: g  reason: collision with root package name */
    float f54352g;

    /* renamed from: h  reason: collision with root package name */
    long f54353h;

    /* renamed from: i  reason: collision with root package name */
    boolean f54354i;

    LocationRequest(int i10, long j10, long j11, boolean z10, long j12, int i11, float f10, long j13, boolean z11) {
        this.f54346a = i10;
        this.f54347b = j10;
        this.f54348c = j11;
        this.f54349d = z10;
        this.f54350e = j12;
        this.f54351f = i11;
        this.f54352g = f10;
        this.f54353h = j13;
        this.f54354i = z11;
    }

    public boolean equals(Object obj) {
        if (obj instanceof LocationRequest) {
            LocationRequest locationRequest = (LocationRequest) obj;
            if (this.f54346a == locationRequest.f54346a && this.f54347b == locationRequest.f54347b && this.f54348c == locationRequest.f54348c && this.f54349d == locationRequest.f54349d && this.f54350e == locationRequest.f54350e && this.f54351f == locationRequest.f54351f && this.f54352g == locationRequest.f54352g && p0() == locationRequest.p0() && this.f54354i == locationRequest.f54354i) {
                return true;
            }
            return false;
        }
        return false;
    }

    public int hashCode() {
        return C4535q.c(Integer.valueOf(this.f54346a), Long.valueOf(this.f54347b), Float.valueOf(this.f54352g), Long.valueOf(this.f54353h));
    }

    public long o0() {
        return this.f54347b;
    }

    public long p0() {
        long j10 = this.f54353h;
        long j11 = this.f54347b;
        return j10 < j11 ? j11 : j10;
    }

    public String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Request[");
        int i10 = this.f54346a;
        if (i10 == 100) {
            str = "PRIORITY_HIGH_ACCURACY";
        } else if (i10 == 102) {
            str = "PRIORITY_BALANCED_POWER_ACCURACY";
        } else if (i10 == 104) {
            str = "PRIORITY_LOW_POWER";
        } else if (i10 != 105) {
            str = "???";
        } else {
            str = "PRIORITY_NO_POWER";
        }
        sb2.append(str);
        if (this.f54346a != 105) {
            sb2.append(" requested=");
            sb2.append(this.f54347b);
            sb2.append("ms");
        }
        sb2.append(" fastest=");
        sb2.append(this.f54348c);
        sb2.append("ms");
        if (this.f54353h > this.f54347b) {
            sb2.append(" maxWait=");
            sb2.append(this.f54353h);
            sb2.append("ms");
        }
        if (this.f54352g > 0.0f) {
            sb2.append(" smallestDisplacement=");
            sb2.append(this.f54352g);
            sb2.append("m");
        }
        long j10 = this.f54350e;
        if (j10 != Long.MAX_VALUE) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            sb2.append(" expireIn=");
            sb2.append(j10 - elapsedRealtime);
            sb2.append("ms");
        }
        if (this.f54351f != Integer.MAX_VALUE) {
            sb2.append(" num=");
            sb2.append(this.f54351f);
        }
        sb2.append(']');
        return sb2.toString();
    }

    public void writeToParcel(Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.t(parcel, 1, this.f54346a);
        c.w(parcel, 2, this.f54347b);
        c.w(parcel, 3, this.f54348c);
        c.g(parcel, 4, this.f54349d);
        c.w(parcel, 5, this.f54350e);
        c.t(parcel, 6, this.f54351f);
        c.p(parcel, 7, this.f54352g);
        c.w(parcel, 8, this.f54353h);
        c.g(parcel, 9, this.f54354i);
        c.b(parcel, a10);
    }
}
