package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C4535q;
import com.google.android.gms.common.internal.C4536s;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import za.C5298a;
import za.c;

public final class T extends C5298a {
    public static final Parcelable.Creator<T> CREATOR = new U();

    /* renamed from: a  reason: collision with root package name */
    private final int f54364a;

    /* renamed from: b  reason: collision with root package name */
    private final int f54365b;

    /* renamed from: c  reason: collision with root package name */
    private final int f54366c;

    /* renamed from: d  reason: collision with root package name */
    private final int f54367d;

    public T(int i10, int i11, int i12, int i13) {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14 = true;
        if (i10 < 0 || i10 > 23) {
            z10 = false;
        } else {
            z10 = true;
        }
        C4536s.p(z10, "Start hour must be in range [0, 23].");
        if (i11 < 0 || i11 > 59) {
            z11 = false;
        } else {
            z11 = true;
        }
        C4536s.p(z11, "Start minute must be in range [0, 59].");
        if (i12 < 0 || i12 > 23) {
            z12 = false;
        } else {
            z12 = true;
        }
        C4536s.p(z12, "End hour must be in range [0, 23].");
        if (i13 < 0 || i13 > 59) {
            z13 = false;
        } else {
            z13 = true;
        }
        C4536s.p(z13, "End minute must be in range [0, 59].");
        C4536s.p(((i10 + i11) + i12) + i13 <= 0 ? false : z14, "Parameters can't be all 0.");
        this.f54364a = i10;
        this.f54365b = i11;
        this.f54366c = i12;
        this.f54367d = i13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof T)) {
            return false;
        }
        T t10 = (T) obj;
        if (this.f54364a == t10.f54364a && this.f54365b == t10.f54365b && this.f54366c == t10.f54366c && this.f54367d == t10.f54367d) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return C4535q.c(Integer.valueOf(this.f54364a), Integer.valueOf(this.f54365b), Integer.valueOf(this.f54366c), Integer.valueOf(this.f54367d));
    }

    public final String toString() {
        int i10 = this.f54364a;
        int i11 = this.f54365b;
        int i12 = this.f54366c;
        int i13 = this.f54367d;
        StringBuilder sb2 = new StringBuilder(ModuleDescriptor.MODULE_VERSION);
        sb2.append("UserPreferredSleepWindow [startHour=");
        sb2.append(i10);
        sb2.append(", startMinute=");
        sb2.append(i11);
        sb2.append(", endHour=");
        sb2.append(i12);
        sb2.append(", endMinute=");
        sb2.append(i13);
        sb2.append(']');
        return sb2.toString();
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        C4536s.l(parcel);
        int a10 = c.a(parcel);
        c.t(parcel, 1, this.f54364a);
        c.t(parcel, 2, this.f54365b);
        c.t(parcel, 3, this.f54366c);
        c.t(parcel, 4, this.f54367d);
        c.b(parcel, a10);
    }
}
