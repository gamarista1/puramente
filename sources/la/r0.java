package La;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C4535q;
import java.util.Arrays;
import za.C5298a;
import za.c;

public final class r0 extends C5298a {
    public static final Parcelable.Creator<r0> CREATOR = new s0();

    /* renamed from: a  reason: collision with root package name */
    private final boolean f51645a;

    /* renamed from: b  reason: collision with root package name */
    private final byte[] f51646b;

    public r0(boolean z10, byte[] bArr) {
        this.f51645a = z10;
        this.f51646b = bArr;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof r0)) {
            return false;
        }
        r0 r0Var = (r0) obj;
        if (this.f51645a != r0Var.f51645a || !Arrays.equals(this.f51646b, r0Var.f51646b)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return C4535q.c(Boolean.valueOf(this.f51645a), this.f51646b);
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.g(parcel, 1, this.f51645a);
        c.k(parcel, 2, this.f51646b, false);
        c.b(parcel, a10);
    }
}
