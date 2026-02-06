package Pa;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import za.C5298a;
import za.c;

/* renamed from: Pa.a  reason: case insensitive filesystem */
public final class C4378a extends C5298a {
    public static final Parcelable.Creator<C4378a> CREATOR = new C4379b();

    /* renamed from: a  reason: collision with root package name */
    public final Bundle f52132a;

    public C4378a(Bundle bundle) {
        this.f52132a = bundle;
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.j(parcel, 1, this.f52132a, false);
        c.b(parcel, a10);
    }
}
