package ya;

import android.os.Parcel;
import android.os.Parcelable;
import za.C5298a;
import za.c;

public final class z extends C5298a {
    public static final Parcelable.Creator<z> CREATOR = new C5283A();

    /* renamed from: a  reason: collision with root package name */
    private final boolean f62311a;

    /* renamed from: b  reason: collision with root package name */
    private final String f62312b;

    /* renamed from: c  reason: collision with root package name */
    private final int f62313c;

    /* renamed from: d  reason: collision with root package name */
    private final int f62314d;

    z(boolean z10, String str, int i10, int i11) {
        this.f62311a = z10;
        this.f62312b = str;
        this.f62313c = H.a(i10) - 1;
        this.f62314d = m.a(i11) - 1;
    }

    public final boolean o0() {
        return this.f62311a;
    }

    public final int p0() {
        return m.a(this.f62314d);
    }

    public final int q0() {
        return H.a(this.f62313c);
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.g(parcel, 1, this.f62311a);
        c.D(parcel, 2, this.f62312b, false);
        c.t(parcel, 3, this.f62313c);
        c.t(parcel, 4, this.f62314d);
        c.b(parcel, a10);
    }

    public final String zza() {
        return this.f62312b;
    }
}
