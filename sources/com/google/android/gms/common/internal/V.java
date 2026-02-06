package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.C4529k;
import za.C5298a;
import za.c;

public final class V extends C5298a {
    public static final Parcelable.Creator<V> CREATOR = new W();

    /* renamed from: a  reason: collision with root package name */
    final int f54132a;

    /* renamed from: b  reason: collision with root package name */
    final IBinder f54133b;

    /* renamed from: c  reason: collision with root package name */
    private final ConnectionResult f54134c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f54135d;

    /* renamed from: e  reason: collision with root package name */
    private final boolean f54136e;

    V(int i10, IBinder iBinder, ConnectionResult connectionResult, boolean z10, boolean z11) {
        this.f54132a = i10;
        this.f54133b = iBinder;
        this.f54134c = connectionResult;
        this.f54135d = z10;
        this.f54136e = z11;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof V)) {
            return false;
        }
        V v10 = (V) obj;
        if (!this.f54134c.equals(v10.f54134c) || !C4535q.b(p0(), v10.p0())) {
            return false;
        }
        return true;
    }

    public final ConnectionResult o0() {
        return this.f54134c;
    }

    public final C4529k p0() {
        IBinder iBinder = this.f54133b;
        if (iBinder == null) {
            return null;
        }
        return C4529k.a.a(iBinder);
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.t(parcel, 1, this.f54132a);
        c.s(parcel, 2, this.f54133b, false);
        c.B(parcel, 3, this.f54134c, i10, false);
        c.g(parcel, 4, this.f54135d);
        c.g(parcel, 5, this.f54136e);
        c.b(parcel, a10);
    }
}
