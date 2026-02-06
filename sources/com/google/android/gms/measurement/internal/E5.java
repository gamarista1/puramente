package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.C4536s;
import java.util.List;
import za.C5298a;
import za.c;

public final class E5 extends C5298a {
    public static final Parcelable.Creator<E5> CREATOR = new n5();

    /* renamed from: A  reason: collision with root package name */
    public final int f54551A;

    /* renamed from: B  reason: collision with root package name */
    public final String f54552B;

    /* renamed from: C  reason: collision with root package name */
    public final int f54553C;

    /* renamed from: D  reason: collision with root package name */
    public final long f54554D;

    /* renamed from: E  reason: collision with root package name */
    public final String f54555E;

    /* renamed from: F  reason: collision with root package name */
    public final String f54556F;

    /* renamed from: a  reason: collision with root package name */
    public final String f54557a;

    /* renamed from: b  reason: collision with root package name */
    public final String f54558b;

    /* renamed from: c  reason: collision with root package name */
    public final String f54559c;

    /* renamed from: d  reason: collision with root package name */
    public final String f54560d;

    /* renamed from: e  reason: collision with root package name */
    public final long f54561e;

    /* renamed from: f  reason: collision with root package name */
    public final long f54562f;

    /* renamed from: g  reason: collision with root package name */
    public final String f54563g;

    /* renamed from: h  reason: collision with root package name */
    public final boolean f54564h;

    /* renamed from: i  reason: collision with root package name */
    public final boolean f54565i;

    /* renamed from: j  reason: collision with root package name */
    public final long f54566j;

    /* renamed from: k  reason: collision with root package name */
    public final String f54567k;

    /* renamed from: l  reason: collision with root package name */
    private final long f54568l;

    /* renamed from: m  reason: collision with root package name */
    public final long f54569m;

    /* renamed from: n  reason: collision with root package name */
    public final int f54570n;

    /* renamed from: o  reason: collision with root package name */
    public final boolean f54571o;

    /* renamed from: p  reason: collision with root package name */
    public final boolean f54572p;

    /* renamed from: q  reason: collision with root package name */
    public final String f54573q;

    /* renamed from: r  reason: collision with root package name */
    public final Boolean f54574r;

    /* renamed from: s  reason: collision with root package name */
    public final long f54575s;

    /* renamed from: t  reason: collision with root package name */
    public final List f54576t;

    /* renamed from: u  reason: collision with root package name */
    private final String f54577u;

    /* renamed from: v  reason: collision with root package name */
    public final String f54578v;

    /* renamed from: w  reason: collision with root package name */
    public final String f54579w;

    /* renamed from: x  reason: collision with root package name */
    public final String f54580x;

    /* renamed from: y  reason: collision with root package name */
    public final boolean f54581y;

    /* renamed from: z  reason: collision with root package name */
    public final long f54582z;

    E5(String str, String str2, String str3, long j10, String str4, long j11, long j12, String str5, boolean z10, boolean z11, String str6, long j13, long j14, int i10, boolean z12, boolean z13, String str7, Boolean bool, long j15, List list, String str8, String str9, String str10, String str11, boolean z14, long j16, int i11, String str12, int i12, long j17, String str13, String str14) {
        C4536s.f(str);
        this.f54557a = str;
        this.f54558b = TextUtils.isEmpty(str2) ? null : str2;
        this.f54559c = str3;
        this.f54566j = j10;
        this.f54560d = str4;
        this.f54561e = j11;
        this.f54562f = j12;
        this.f54563g = str5;
        this.f54564h = z10;
        this.f54565i = z11;
        this.f54567k = str6;
        this.f54568l = j13;
        this.f54569m = j14;
        this.f54570n = i10;
        this.f54571o = z12;
        this.f54572p = z13;
        this.f54573q = str7;
        this.f54574r = bool;
        this.f54575s = j15;
        this.f54576t = list;
        this.f54577u = null;
        this.f54578v = str9;
        this.f54579w = str10;
        this.f54580x = str11;
        this.f54581y = z14;
        this.f54582z = j16;
        this.f54551A = i11;
        this.f54552B = str12;
        this.f54553C = i12;
        this.f54554D = j17;
        this.f54555E = str13;
        this.f54556F = str14;
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.D(parcel, 2, this.f54557a, false);
        c.D(parcel, 3, this.f54558b, false);
        c.D(parcel, 4, this.f54559c, false);
        c.D(parcel, 5, this.f54560d, false);
        c.w(parcel, 6, this.f54561e);
        c.w(parcel, 7, this.f54562f);
        c.D(parcel, 8, this.f54563g, false);
        c.g(parcel, 9, this.f54564h);
        c.g(parcel, 10, this.f54565i);
        c.w(parcel, 11, this.f54566j);
        c.D(parcel, 12, this.f54567k, false);
        c.w(parcel, 13, this.f54568l);
        c.w(parcel, 14, this.f54569m);
        c.t(parcel, 15, this.f54570n);
        c.g(parcel, 16, this.f54571o);
        c.g(parcel, 18, this.f54572p);
        c.D(parcel, 19, this.f54573q, false);
        c.i(parcel, 21, this.f54574r, false);
        c.w(parcel, 22, this.f54575s);
        c.F(parcel, 23, this.f54576t, false);
        c.D(parcel, 24, this.f54577u, false);
        c.D(parcel, 25, this.f54578v, false);
        c.D(parcel, 26, this.f54579w, false);
        c.D(parcel, 27, this.f54580x, false);
        c.g(parcel, 28, this.f54581y);
        c.w(parcel, 29, this.f54582z);
        c.t(parcel, 30, this.f54551A);
        c.D(parcel, 31, this.f54552B, false);
        c.t(parcel, 32, this.f54553C);
        c.w(parcel, 34, this.f54554D);
        c.D(parcel, 35, this.f54555E, false);
        c.D(parcel, 36, this.f54556F, false);
        c.b(parcel, a10);
    }

    E5(String str, String str2, String str3, String str4, long j10, long j11, String str5, boolean z10, boolean z11, long j12, String str6, long j13, long j14, int i10, boolean z12, boolean z13, String str7, Boolean bool, long j15, List list, String str8, String str9, String str10, String str11, boolean z14, long j16, int i11, String str12, int i12, long j17, String str13, String str14) {
        this.f54557a = str;
        this.f54558b = str2;
        this.f54559c = str3;
        this.f54566j = j12;
        this.f54560d = str4;
        this.f54561e = j10;
        this.f54562f = j11;
        this.f54563g = str5;
        this.f54564h = z10;
        this.f54565i = z11;
        this.f54567k = str6;
        this.f54568l = j13;
        this.f54569m = j14;
        this.f54570n = i10;
        this.f54571o = z12;
        this.f54572p = z13;
        this.f54573q = str7;
        this.f54574r = bool;
        this.f54575s = j15;
        this.f54576t = list;
        this.f54577u = str8;
        this.f54578v = str9;
        this.f54579w = str10;
        this.f54580x = str11;
        this.f54581y = z14;
        this.f54582z = j16;
        this.f54551A = i11;
        this.f54552B = str12;
        this.f54553C = i12;
        this.f54554D = j17;
        this.f54555E = str13;
        this.f54556F = str14;
    }
}
