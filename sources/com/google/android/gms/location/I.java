package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import za.C5298a;
import za.c;

public final class I extends C5298a {
    public static final Parcelable.Creator<I> CREATOR = new J();

    /* renamed from: a  reason: collision with root package name */
    private final String f54338a;

    /* renamed from: b  reason: collision with root package name */
    private final String f54339b;

    /* renamed from: c  reason: collision with root package name */
    private final String f54340c;

    I(String str, String str2, String str3) {
        this.f54340c = str;
        this.f54338a = str2;
        this.f54339b = str3;
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.D(parcel, 1, this.f54338a, false);
        c.D(parcel, 2, this.f54339b, false);
        c.D(parcel, 5, this.f54340c, false);
        c.b(parcel, a10);
    }
}
