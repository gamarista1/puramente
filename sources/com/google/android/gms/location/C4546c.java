package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C4535q;
import com.google.android.gms.common.internal.C4536s;
import za.C5298a;
import za.c;

/* renamed from: com.google.android.gms.location.c  reason: case insensitive filesystem */
public class C4546c extends C5298a {
    public static final Parcelable.Creator<C4546c> CREATOR = new V();

    /* renamed from: a  reason: collision with root package name */
    private final int f54383a;

    /* renamed from: b  reason: collision with root package name */
    private final int f54384b;

    C4546c(int i10, int i11) {
        this.f54383a = i10;
        this.f54384b = i11;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4546c)) {
            return false;
        }
        C4546c cVar = (C4546c) obj;
        if (this.f54383a == cVar.f54383a && this.f54384b == cVar.f54384b) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return C4535q.c(Integer.valueOf(this.f54383a), Integer.valueOf(this.f54384b));
    }

    public int o0() {
        return this.f54383a;
    }

    public int p0() {
        return this.f54384b;
    }

    public String toString() {
        int i10 = this.f54383a;
        int i11 = this.f54384b;
        StringBuilder sb2 = new StringBuilder(75);
        sb2.append("ActivityTransition [mActivityType=");
        sb2.append(i10);
        sb2.append(", mTransitionType=");
        sb2.append(i11);
        sb2.append(']');
        return sb2.toString();
    }

    public void writeToParcel(Parcel parcel, int i10) {
        C4536s.l(parcel);
        int a10 = c.a(parcel);
        c.t(parcel, 1, o0());
        c.t(parcel, 2, p0());
        c.b(parcel, a10);
    }
}
