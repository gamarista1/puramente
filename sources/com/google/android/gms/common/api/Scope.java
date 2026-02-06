package com.google.android.gms.common.api;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C4536s;
import com.google.android.gms.common.internal.ReflectedParcelable;
import za.C5298a;
import za.c;

public final class Scope extends C5298a implements ReflectedParcelable {
    public static final Parcelable.Creator<Scope> CREATOR = new t();

    /* renamed from: a  reason: collision with root package name */
    final int f53904a;

    /* renamed from: b  reason: collision with root package name */
    private final String f53905b;

    Scope(int i10, String str) {
        C4536s.g(str, "scopeUri must not be null or empty");
        this.f53904a = i10;
        this.f53905b = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Scope)) {
            return false;
        }
        return this.f53905b.equals(((Scope) obj).f53905b);
    }

    public int hashCode() {
        return this.f53905b.hashCode();
    }

    public String o0() {
        return this.f53905b;
    }

    public String toString() {
        return this.f53905b;
    }

    public void writeToParcel(Parcel parcel, int i10) {
        int i11 = this.f53904a;
        int a10 = c.a(parcel);
        c.t(parcel, 1, i11);
        c.D(parcel, 2, o0(), false);
        c.b(parcel, a10);
    }

    public Scope(String str) {
        this(1, str);
    }
}
