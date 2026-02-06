package La;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C4535q;
import com.google.android.gms.common.internal.C4536s;
import za.c;

/* renamed from: La.l  reason: case insensitive filesystem */
public class C4353l extends C4355n {
    public static final Parcelable.Creator<C4353l> CREATOR = new x0();

    /* renamed from: a  reason: collision with root package name */
    private final C4361u f51612a;

    /* renamed from: b  reason: collision with root package name */
    private final Uri f51613b;

    /* renamed from: c  reason: collision with root package name */
    private final byte[] f51614c;

    C4353l(C4361u uVar, Uri uri, byte[] bArr) {
        this.f51612a = (C4361u) C4536s.l(uVar);
        r0(uri);
        this.f51613b = uri;
        s0(bArr);
        this.f51614c = bArr;
    }

    private static Uri r0(Uri uri) {
        boolean z10;
        C4536s.l(uri);
        boolean z11 = false;
        if (uri.getScheme() != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        C4536s.b(z10, "origin scheme must be non-empty");
        if (uri.getAuthority() != null) {
            z11 = true;
        }
        C4536s.b(z11, "origin authority must be non-empty");
        return uri;
    }

    private static byte[] s0(byte[] bArr) {
        boolean z10 = true;
        if (!(bArr == null || bArr.length == 32)) {
            z10 = false;
        }
        C4536s.b(z10, "clientDataHash must be 32 bytes long");
        return bArr;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C4353l)) {
            return false;
        }
        C4353l lVar = (C4353l) obj;
        if (!C4535q.b(this.f51612a, lVar.f51612a) || !C4535q.b(this.f51613b, lVar.f51613b)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C4535q.c(this.f51612a, this.f51613b);
    }

    public byte[] o0() {
        return this.f51614c;
    }

    public Uri p0() {
        return this.f51613b;
    }

    public C4361u q0() {
        return this.f51612a;
    }

    public void writeToParcel(Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.B(parcel, 2, q0(), i10, false);
        c.B(parcel, 3, p0(), i10, false);
        c.k(parcel, 4, o0(), false);
        c.b(parcel, a10);
    }
}
