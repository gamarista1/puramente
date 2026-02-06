package Ca;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.server.response.a;
import za.C5298a;
import za.c;

/* renamed from: Ca.b  reason: case insensitive filesystem */
public final class C4248b extends C5298a {
    public static final Parcelable.Creator<C4248b> CREATOR = new c();

    /* renamed from: a  reason: collision with root package name */
    final int f50385a;

    /* renamed from: b  reason: collision with root package name */
    private final C4247a f50386b;

    C4248b(int i10, C4247a aVar) {
        this.f50385a = i10;
        this.f50386b = aVar;
    }

    public static C4248b o0(a.b bVar) {
        if (bVar instanceof C4247a) {
            return new C4248b((C4247a) bVar);
        }
        throw new IllegalArgumentException("Unsupported safe parcelable field converter class.");
    }

    public final a.b p0() {
        C4247a aVar = this.f50386b;
        if (aVar != null) {
            return aVar;
        }
        throw new IllegalStateException("There was no converter wrapped in this ConverterWrapper.");
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        int i11 = this.f50385a;
        int a10 = c.a(parcel);
        c.t(parcel, 1, i11);
        c.B(parcel, 2, this.f50386b, i10, false);
        c.b(parcel, a10);
    }

    private C4248b(C4247a aVar) {
        this.f50385a = 1;
        this.f50386b = aVar;
    }
}
