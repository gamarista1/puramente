package qa;

import android.os.Parcel;
import android.os.Parcelable;
import za.C5298a;
import za.c;

/* renamed from: qa.a  reason: case insensitive filesystem */
public class C5146a extends C5298a {
    public static final Parcelable.Creator<C5146a> CREATOR = new k();

    /* renamed from: a  reason: collision with root package name */
    final int f61342a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f61343b;

    /* renamed from: c  reason: collision with root package name */
    private final long f61344c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f61345d;

    C5146a(int i10, boolean z10, long j10, boolean z11) {
        this.f61342a = i10;
        this.f61343b = z10;
        this.f61344c = j10;
        this.f61345d = z11;
    }

    public long o0() {
        return this.f61344c;
    }

    public boolean p0() {
        return this.f61345d;
    }

    public boolean q0() {
        return this.f61343b;
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.t(parcel, 1, this.f61342a);
        c.g(parcel, 2, q0());
        c.w(parcel, 3, o0());
        c.g(parcel, 4, p0());
        c.b(parcel, a10);
    }
}
