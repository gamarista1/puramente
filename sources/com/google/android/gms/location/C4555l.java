package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Collections;
import java.util.List;
import za.C5298a;
import za.c;

/* renamed from: com.google.android.gms.location.l  reason: case insensitive filesystem */
public final class C4555l extends C5298a {
    public static final Parcelable.Creator<C4555l> CREATOR = new K();

    /* renamed from: a  reason: collision with root package name */
    private final List f54403a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f54404b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f54405c;

    /* renamed from: d  reason: collision with root package name */
    private I f54406d;

    C4555l(List list, boolean z10, boolean z11, I i10) {
        this.f54403a = list;
        this.f54404b = z10;
        this.f54405c = z11;
        this.f54406d = i10;
    }

    public void writeToParcel(Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.H(parcel, 1, Collections.unmodifiableList(this.f54403a), false);
        c.g(parcel, 2, this.f54404b);
        c.g(parcel, 3, this.f54405c);
        c.B(parcel, 5, this.f54406d, i10, false);
        c.b(parcel, a10);
    }
}
