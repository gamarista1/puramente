package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.revenuecat.purchases.common.Constants;
import za.C5298a;
import za.c;

/* renamed from: com.google.android.gms.common.internal.d  reason: case insensitive filesystem */
public class C4520d extends C5298a {
    public static final Parcelable.Creator<C4520d> CREATOR = new A();

    /* renamed from: a  reason: collision with root package name */
    public final int f54146a;

    /* renamed from: b  reason: collision with root package name */
    public final String f54147b;

    public C4520d(int i10, String str) {
        this.f54146a = i10;
        this.f54147b = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C4520d)) {
            return false;
        }
        C4520d dVar = (C4520d) obj;
        if (dVar.f54146a != this.f54146a || !C4535q.b(dVar.f54147b, this.f54147b)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.f54146a;
    }

    public final String toString() {
        return this.f54146a + Constants.SUBS_ID_BASE_PLAN_ID_SEPARATOR + this.f54147b;
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        int i11 = this.f54146a;
        int a10 = c.a(parcel);
        c.t(parcel, 1, i11);
        c.D(parcel, 2, this.f54147b, false);
        c.b(parcel, a10);
    }
}
