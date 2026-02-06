package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import za.C5298a;
import za.c;

public final class C extends C5298a implements Iterable {
    public static final Parcelable.Creator<C> CREATOR = new E();
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final Bundle f54472a;

    C(Bundle bundle) {
        this.f54472a = bundle;
    }

    public final Iterator iterator() {
        return new B(this);
    }

    public final int o0() {
        return this.f54472a.size();
    }

    /* access modifiers changed from: package-private */
    public final Double q0(String str) {
        return Double.valueOf(this.f54472a.getDouble(str));
    }

    public final Bundle r0() {
        return new Bundle(this.f54472a);
    }

    /* access modifiers changed from: package-private */
    public final Long s0(String str) {
        return Long.valueOf(this.f54472a.getLong(str));
    }

    /* access modifiers changed from: package-private */
    public final Object t0(String str) {
        return this.f54472a.get(str);
    }

    public final String toString() {
        return this.f54472a.toString();
    }

    /* access modifiers changed from: package-private */
    public final String u0(String str) {
        return this.f54472a.getString(str);
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.j(parcel, 2, r0(), false);
        c.b(parcel, a10);
    }
}
