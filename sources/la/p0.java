package La;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C4535q;
import java.util.Arrays;
import za.C5298a;
import za.c;

public final class p0 extends C5298a {
    public static final Parcelable.Creator<p0> CREATOR = new q0();

    /* renamed from: a  reason: collision with root package name */
    private final byte[] f51628a;

    /* renamed from: b  reason: collision with root package name */
    private final byte[] f51629b;

    public p0(byte[] bArr, byte[] bArr2) {
        this.f51628a = bArr;
        this.f51629b = bArr2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof p0)) {
            return false;
        }
        p0 p0Var = (p0) obj;
        if (!Arrays.equals(this.f51628a, p0Var.f51628a) || !Arrays.equals(this.f51629b, p0Var.f51629b)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return C4535q.c(this.f51628a, this.f51629b);
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.k(parcel, 1, this.f51628a, false);
        c.k(parcel, 2, this.f51629b, false);
        c.b(parcel, a10);
    }
}
