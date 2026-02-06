package ta;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import za.C5298a;
import za.c;

/* renamed from: ta.b  reason: case insensitive filesystem */
public class C5204b extends C5298a {
    public static final Parcelable.Creator<C5204b> CREATOR = new C5206d();

    /* renamed from: g  reason: collision with root package name */
    public static final int f61638g = 0;

    /* renamed from: h  reason: collision with root package name */
    public static final int f61639h = 1;

    /* renamed from: i  reason: collision with root package name */
    public static final int f61640i = 2;

    /* renamed from: j  reason: collision with root package name */
    public static final int f61641j = 3;

    /* renamed from: k  reason: collision with root package name */
    public static final int f61642k = 4;

    /* renamed from: l  reason: collision with root package name */
    public static final int f61643l = 5;

    /* renamed from: m  reason: collision with root package name */
    public static final int f61644m = 6;

    /* renamed from: n  reason: collision with root package name */
    public static final int f61645n = 7;

    /* renamed from: o  reason: collision with root package name */
    public static final int f61646o = 7;

    /* renamed from: a  reason: collision with root package name */
    public final String f61647a;

    /* renamed from: b  reason: collision with root package name */
    public final int f61648b;

    /* renamed from: c  reason: collision with root package name */
    public final long f61649c;

    /* renamed from: d  reason: collision with root package name */
    public final byte[] f61650d;

    /* renamed from: e  reason: collision with root package name */
    final int f61651e;

    /* renamed from: f  reason: collision with root package name */
    final Bundle f61652f;

    C5204b(int i10, String str, int i11, long j10, byte[] bArr, Bundle bundle) {
        this.f61651e = i10;
        this.f61647a = str;
        this.f61648b = i11;
        this.f61649c = j10;
        this.f61650d = bArr;
        this.f61652f = bundle;
    }

    public String toString() {
        String str = this.f61647a;
        int i10 = this.f61648b;
        return "ProxyRequest[ url: " + str + ", method: " + i10 + " ]";
    }

    public void writeToParcel(Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.D(parcel, 1, this.f61647a, false);
        c.t(parcel, 2, this.f61648b);
        c.w(parcel, 3, this.f61649c);
        c.k(parcel, 4, this.f61650d, false);
        c.j(parcel, 5, this.f61652f, false);
        c.t(parcel, 1000, this.f61651e);
        c.b(parcel, a10);
    }
}
