package com.google.android.gms.common.server.response;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.server.response.a;
import za.C5298a;
import za.c;

public final class g extends C5298a {
    public static final Parcelable.Creator<g> CREATOR = new e();

    /* renamed from: a  reason: collision with root package name */
    final int f54285a;

    /* renamed from: b  reason: collision with root package name */
    final String f54286b;

    /* renamed from: c  reason: collision with root package name */
    final a.C0822a f54287c;

    g(int i10, String str, a.C0822a aVar) {
        this.f54285a = i10;
        this.f54286b = str;
        this.f54287c = aVar;
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        int i11 = this.f54285a;
        int a10 = c.a(parcel);
        c.t(parcel, 1, i11);
        c.D(parcel, 2, this.f54286b, false);
        c.B(parcel, 3, this.f54287c, i10, false);
        c.b(parcel, a10);
    }

    g(String str, a.C0822a aVar) {
        this.f54285a = 1;
        this.f54286b = str;
        this.f54287c = aVar;
    }
}
