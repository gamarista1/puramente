package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C4535q;
import com.google.android.gms.common.internal.C4536s;
import java.util.List;
import za.C5298a;
import za.c;

/* renamed from: com.google.android.gms.location.q  reason: case insensitive filesystem */
public class C4560q extends C5298a {
    public static final Parcelable.Creator<C4560q> CREATOR = new S();

    /* renamed from: a  reason: collision with root package name */
    private final List f54415a;

    /* renamed from: b  reason: collision with root package name */
    private final int f54416b;

    public C4560q(List list, int i10) {
        this.f54415a = list;
        this.f54416b = i10;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4560q)) {
            return false;
        }
        C4560q qVar = (C4560q) obj;
        if (!C4535q.b(this.f54415a, qVar.f54415a) || this.f54416b != qVar.f54416b) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C4535q.c(this.f54415a, Integer.valueOf(this.f54416b));
    }

    public int o0() {
        return this.f54416b;
    }

    public void writeToParcel(Parcel parcel, int i10) {
        C4536s.l(parcel);
        int a10 = c.a(parcel);
        c.H(parcel, 1, this.f54415a, false);
        c.t(parcel, 2, o0());
        c.b(parcel, a10);
    }
}
