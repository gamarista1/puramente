package com.google.android.gms.common.api;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.C4535q;
import com.google.android.gms.common.internal.ReflectedParcelable;
import za.C5298a;
import za.c;

public final class Status extends C5298a implements k, ReflectedParcelable {
    public static final Parcelable.Creator<Status> CREATOR = new u();

    /* renamed from: e  reason: collision with root package name */
    public static final Status f53906e = new Status(-1);

    /* renamed from: f  reason: collision with root package name */
    public static final Status f53907f = new Status(0);

    /* renamed from: g  reason: collision with root package name */
    public static final Status f53908g = new Status(14);

    /* renamed from: h  reason: collision with root package name */
    public static final Status f53909h = new Status(8);

    /* renamed from: i  reason: collision with root package name */
    public static final Status f53910i = new Status(15);

    /* renamed from: j  reason: collision with root package name */
    public static final Status f53911j = new Status(16);

    /* renamed from: k  reason: collision with root package name */
    public static final Status f53912k = new Status(18);

    /* renamed from: l  reason: collision with root package name */
    public static final Status f53913l = new Status(17);

    /* renamed from: a  reason: collision with root package name */
    private final int f53914a;

    /* renamed from: b  reason: collision with root package name */
    private final String f53915b;

    /* renamed from: c  reason: collision with root package name */
    private final PendingIntent f53916c;

    /* renamed from: d  reason: collision with root package name */
    private final ConnectionResult f53917d;

    Status(int i10, String str, PendingIntent pendingIntent, ConnectionResult connectionResult) {
        this.f53914a = i10;
        this.f53915b = str;
        this.f53916c = pendingIntent;
        this.f53917d = connectionResult;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof Status)) {
            return false;
        }
        Status status = (Status) obj;
        if (this.f53914a != status.f53914a || !C4535q.b(this.f53915b, status.f53915b) || !C4535q.b(this.f53916c, status.f53916c) || !C4535q.b(this.f53917d, status.f53917d)) {
            return false;
        }
        return true;
    }

    public Status getStatus() {
        return this;
    }

    public int hashCode() {
        return C4535q.c(Integer.valueOf(this.f53914a), this.f53915b, this.f53916c, this.f53917d);
    }

    public boolean isCanceled() {
        return this.f53914a == 16;
    }

    public ConnectionResult o0() {
        return this.f53917d;
    }

    public int p0() {
        return this.f53914a;
    }

    public String q0() {
        return this.f53915b;
    }

    public boolean r0() {
        return this.f53916c != null;
    }

    public boolean s0() {
        return this.f53914a <= 0;
    }

    public String toString() {
        C4535q.a d10 = C4535q.d(this);
        d10.a("statusCode", zza());
        d10.a("resolution", this.f53916c);
        return d10.toString();
    }

    public void writeToParcel(Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.t(parcel, 1, p0());
        c.D(parcel, 2, q0(), false);
        c.B(parcel, 3, this.f53916c, i10, false);
        c.B(parcel, 4, o0(), i10, false);
        c.b(parcel, a10);
    }

    public final String zza() {
        String str = this.f53915b;
        if (str != null) {
            return str;
        }
        return c.a(this.f53914a);
    }

    public Status(int i10) {
        this(i10, (String) null);
    }

    public Status(ConnectionResult connectionResult, String str) {
        this(connectionResult, str, 17);
    }

    public Status(int i10, String str) {
        this(i10, str, (PendingIntent) null);
    }

    public Status(ConnectionResult connectionResult, String str, int i10) {
        this(i10, str, connectionResult.q0(), connectionResult);
    }

    public Status(int i10, String str, PendingIntent pendingIntent) {
        this(i10, str, pendingIntent, (ConnectionResult) null);
    }
}
