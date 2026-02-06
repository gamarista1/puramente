package com.google.android.gms.measurement.internal;

import Pa.C4380c;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C4536s;
import za.C5298a;
import za.c;

public final class D extends C5298a {
    public static final Parcelable.Creator<D> CREATOR = new C4380c();

    /* renamed from: a  reason: collision with root package name */
    public final String f54497a;

    /* renamed from: b  reason: collision with root package name */
    public final C f54498b;

    /* renamed from: c  reason: collision with root package name */
    public final String f54499c;

    /* renamed from: d  reason: collision with root package name */
    public final long f54500d;

    D(D d10, long j10) {
        C4536s.l(d10);
        this.f54497a = d10.f54497a;
        this.f54498b = d10.f54498b;
        this.f54499c = d10.f54499c;
        this.f54500d = j10;
    }

    public final String toString() {
        String str = this.f54499c;
        String str2 = this.f54497a;
        String valueOf = String.valueOf(this.f54498b);
        return "origin=" + str + ",name=" + str2 + ",params=" + valueOf;
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.D(parcel, 2, this.f54497a, false);
        c.B(parcel, 3, this.f54498b, i10, false);
        c.D(parcel, 4, this.f54499c, false);
        c.w(parcel, 5, this.f54500d);
        c.b(parcel, a10);
    }

    public D(String str, C c10, String str2, long j10) {
        this.f54497a = str;
        this.f54498b = c10;
        this.f54499c = str2;
        this.f54500d = j10;
    }
}
