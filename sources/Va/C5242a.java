package va;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import za.C5298a;
import za.c;

/* renamed from: va.a  reason: case insensitive filesystem */
public class C5242a extends C5298a {
    public static final Parcelable.Creator<C5242a> CREATOR = new C5245d();

    /* renamed from: a  reason: collision with root package name */
    final int f61718a;

    /* renamed from: b  reason: collision with root package name */
    private int f61719b;

    /* renamed from: c  reason: collision with root package name */
    private Bundle f61720c;

    C5242a(int i10, int i11, Bundle bundle) {
        this.f61718a = i10;
        this.f61719b = i11;
        this.f61720c = bundle;
    }

    public int o0() {
        return this.f61719b;
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.t(parcel, 1, this.f61718a);
        c.t(parcel, 2, o0());
        c.j(parcel, 3, this.f61720c, false);
        c.b(parcel, a10);
    }
}
