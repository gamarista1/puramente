package La;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C4535q;
import com.google.android.gms.common.internal.C4536s;
import za.c;

/* renamed from: La.m  reason: case insensitive filesystem */
public class C4354m extends C4355n {
    public static final Parcelable.Creator<C4354m> CREATOR = new y0();

    /* renamed from: a  reason: collision with root package name */
    private final C4364x f51615a;

    /* renamed from: b  reason: collision with root package name */
    private final Uri f51616b;

    /* renamed from: c  reason: collision with root package name */
    private final byte[] f51617c;

    C4354m(C4364x xVar, Uri uri, byte[] bArr) {
        this.f51615a = (C4364x) C4536s.l(xVar);
        r0(uri);
        this.f51616b = uri;
        s0(bArr);
        this.f51617c = bArr;
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
        if (!(obj instanceof C4354m)) {
            return false;
        }
        C4354m mVar = (C4354m) obj;
        if (!C4535q.b(this.f51615a, mVar.f51615a) || !C4535q.b(this.f51616b, mVar.f51616b)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C4535q.c(this.f51615a, this.f51616b);
    }

    public byte[] o0() {
        return this.f51617c;
    }

    public Uri p0() {
        return this.f51616b;
    }

    public C4364x q0() {
        return this.f51615a;
    }

    public void writeToParcel(Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.B(parcel, 2, q0(), i10, false);
        c.B(parcel, 3, p0(), i10, false);
        c.k(parcel, 4, o0(), false);
        c.b(parcel, a10);
    }
}
