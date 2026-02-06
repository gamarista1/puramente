package com.google.android.gms.location;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C4536s;
import com.google.android.gms.internal.location.zzbs;
import java.util.List;
import za.C5298a;
import za.c;

public final class P extends C5298a {
    public static final Parcelable.Creator<P> CREATOR = new Q();

    /* renamed from: a  reason: collision with root package name */
    private final List f54361a;

    /* renamed from: b  reason: collision with root package name */
    private final PendingIntent f54362b;

    /* renamed from: c  reason: collision with root package name */
    private final String f54363c;

    P(List list, PendingIntent pendingIntent, String str) {
        zzbs zzbs;
        if (list == null) {
            zzbs = zzbs.zzi();
        } else {
            zzbs = zzbs.zzj(list);
        }
        this.f54361a = zzbs;
        this.f54362b = pendingIntent;
        this.f54363c = str;
    }

    public static P o0(List list) {
        C4536s.m(list, "geofence can't be null.");
        C4536s.b(!list.isEmpty(), "Geofences must contains at least one id.");
        return new P(list, (PendingIntent) null, "");
    }

    public static P p0(PendingIntent pendingIntent) {
        C4536s.m(pendingIntent, "PendingIntent can not be null.");
        return new P((List) null, pendingIntent, "");
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.F(parcel, 1, this.f54361a, false);
        c.B(parcel, 2, this.f54362b, i10, false);
        c.D(parcel, 3, this.f54363c, false);
        c.b(parcel, a10);
    }
}
