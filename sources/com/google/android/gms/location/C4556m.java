package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.k;
import za.C5298a;
import za.c;

/* renamed from: com.google.android.gms.location.m  reason: case insensitive filesystem */
public final class C4556m extends C5298a implements k {
    public static final Parcelable.Creator<C4556m> CREATOR = new L();

    /* renamed from: a  reason: collision with root package name */
    private final Status f54407a;

    /* renamed from: b  reason: collision with root package name */
    private final C4557n f54408b;

    public C4556m(Status status, C4557n nVar) {
        this.f54407a = status;
        this.f54408b = nVar;
    }

    public Status getStatus() {
        return this.f54407a;
    }

    public C4557n o0() {
        return this.f54408b;
    }

    public void writeToParcel(Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.B(parcel, 1, getStatus(), i10, false);
        c.B(parcel, 2, o0(), i10, false);
        c.b(parcel, a10);
    }
}
