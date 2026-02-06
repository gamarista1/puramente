package com.google.android.material.datepicker;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.material.datepicker.a;
import java.util.Arrays;

public class g implements a.c {
    public static final Parcelable.Creator<g> CREATOR = new a();

    /* renamed from: a  reason: collision with root package name */
    private final long f55818a;

    class a implements Parcelable.Creator {
        a() {
        }

        /* renamed from: a */
        public g createFromParcel(Parcel parcel) {
            return new g(parcel.readLong(), (a) null);
        }

        /* renamed from: b */
        public g[] newArray(int i10) {
            return new g[i10];
        }
    }

    /* synthetic */ g(long j10, a aVar) {
        this(j10);
    }

    public static g a(long j10) {
        return new g(j10);
    }

    public boolean D(long j10) {
        if (j10 >= this.f55818a) {
            return true;
        }
        return false;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        if (this.f55818a == ((g) obj).f55818a) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f55818a)});
    }

    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeLong(this.f55818a);
    }

    private g(long j10) {
        this.f55818a = j10;
    }
}
