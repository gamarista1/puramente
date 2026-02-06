package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C4536s;
import za.C5298a;
import za.c;

public final class A5 extends C5298a {
    public static final Parcelable.Creator<A5> CREATOR = new z5();

    /* renamed from: a  reason: collision with root package name */
    private final int f54440a;

    /* renamed from: b  reason: collision with root package name */
    public final String f54441b;

    /* renamed from: c  reason: collision with root package name */
    public final long f54442c;

    /* renamed from: d  reason: collision with root package name */
    public final Long f54443d;

    /* renamed from: e  reason: collision with root package name */
    public final String f54444e;

    /* renamed from: f  reason: collision with root package name */
    public final String f54445f;

    /* renamed from: g  reason: collision with root package name */
    public final Double f54446g;

    A5(C5 c52) {
        this(c52.f54494c, c52.f54495d, c52.f54496e, c52.f54493b);
    }

    public final Object o0() {
        Long l10 = this.f54443d;
        if (l10 != null) {
            return l10;
        }
        Double d10 = this.f54446g;
        if (d10 != null) {
            return d10;
        }
        String str = this.f54444e;
        if (str != null) {
            return str;
        }
        return null;
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.t(parcel, 1, this.f54440a);
        c.D(parcel, 2, this.f54441b, false);
        c.w(parcel, 3, this.f54442c);
        c.y(parcel, 4, this.f54443d, false);
        c.r(parcel, 5, (Float) null, false);
        c.D(parcel, 6, this.f54444e, false);
        c.D(parcel, 7, this.f54445f, false);
        c.o(parcel, 8, this.f54446g, false);
        c.b(parcel, a10);
    }

    A5(String str, long j10, Object obj, String str2) {
        C4536s.f(str);
        this.f54440a = 2;
        this.f54441b = str;
        this.f54442c = j10;
        this.f54445f = str2;
        if (obj == null) {
            this.f54443d = null;
            this.f54446g = null;
            this.f54444e = null;
        } else if (obj instanceof Long) {
            this.f54443d = (Long) obj;
            this.f54446g = null;
            this.f54444e = null;
        } else if (obj instanceof String) {
            this.f54443d = null;
            this.f54446g = null;
            this.f54444e = (String) obj;
        } else if (obj instanceof Double) {
            this.f54443d = null;
            this.f54446g = (Double) obj;
            this.f54444e = null;
        } else {
            throw new IllegalArgumentException("User attribute given of un-supported type");
        }
    }

    A5(int i10, String str, long j10, Long l10, Float f10, String str2, String str3, Double d10) {
        this.f54440a = i10;
        this.f54441b = str;
        this.f54442c = j10;
        this.f54443d = l10;
        if (i10 == 1) {
            this.f54446g = f10 != null ? Double.valueOf(f10.doubleValue()) : null;
        } else {
            this.f54446g = d10;
        }
        this.f54444e = str2;
        this.f54445f = str3;
    }
}
