package ya;

import Ha.C4294a;
import Ha.C4295b;
import android.content.Context;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import za.C5298a;
import za.c;

public final class x extends C5298a {
    public static final Parcelable.Creator<x> CREATOR = new y();

    /* renamed from: a  reason: collision with root package name */
    private final String f62305a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f62306b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f62307c;

    /* renamed from: d  reason: collision with root package name */
    private final Context f62308d;

    /* renamed from: e  reason: collision with root package name */
    private final boolean f62309e;

    /* renamed from: f  reason: collision with root package name */
    private final boolean f62310f;

    x(String str, boolean z10, boolean z11, IBinder iBinder, boolean z12, boolean z13) {
        this.f62305a = str;
        this.f62306b = z10;
        this.f62307c = z11;
        this.f62308d = (Context) C4295b.b(C4294a.C0774a.a(iBinder));
        this.f62309e = z12;
        this.f62310f = z13;
    }

    /* JADX WARNING: type inference failed for: r5v5, types: [Ha.a, android.os.IBinder] */
    public final void writeToParcel(Parcel parcel, int i10) {
        String str = this.f62305a;
        int a10 = c.a(parcel);
        c.D(parcel, 1, str, false);
        c.g(parcel, 2, this.f62306b);
        c.g(parcel, 3, this.f62307c);
        c.s(parcel, 4, C4295b.c(this.f62308d), false);
        c.g(parcel, 5, this.f62309e);
        c.g(parcel, 6, this.f62310f);
        c.b(parcel, a10);
    }
}
