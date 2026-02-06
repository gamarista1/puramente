package ta;

import android.app.PendingIntent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import za.C5298a;
import za.c;

/* renamed from: ta.c  reason: case insensitive filesystem */
public class C5205c extends C5298a {
    public static final Parcelable.Creator<C5205c> CREATOR = new C5207e();

    /* renamed from: a  reason: collision with root package name */
    public final int f61653a;

    /* renamed from: b  reason: collision with root package name */
    public final PendingIntent f61654b;

    /* renamed from: c  reason: collision with root package name */
    public final int f61655c;

    /* renamed from: d  reason: collision with root package name */
    public final byte[] f61656d;

    /* renamed from: e  reason: collision with root package name */
    final int f61657e;

    /* renamed from: f  reason: collision with root package name */
    final Bundle f61658f;

    C5205c(int i10, int i11, PendingIntent pendingIntent, int i12, Bundle bundle, byte[] bArr) {
        this.f61657e = i10;
        this.f61653a = i11;
        this.f61655c = i12;
        this.f61658f = bundle;
        this.f61656d = bArr;
        this.f61654b = pendingIntent;
    }

    public void writeToParcel(Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.t(parcel, 1, this.f61653a);
        c.B(parcel, 2, this.f61654b, i10, false);
        c.t(parcel, 3, this.f61655c);
        c.j(parcel, 4, this.f61658f, false);
        c.k(parcel, 5, this.f61656d, false);
        c.t(parcel, 1000, this.f61657e);
        c.b(parcel, a10);
    }
}
