package La;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C4535q;
import com.google.android.gms.common.internal.C4536s;
import java.util.Arrays;
import za.C5298a;
import za.c;

public final class A0 extends C5298a {
    public static final Parcelable.Creator<A0> CREATOR = new B0();

    /* renamed from: a  reason: collision with root package name */
    private final long f51527a;

    /* renamed from: b  reason: collision with root package name */
    private final byte[] f51528b;

    /* renamed from: c  reason: collision with root package name */
    private final byte[] f51529c;

    /* renamed from: d  reason: collision with root package name */
    private final byte[] f51530d;

    A0(long j10, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.f51527a = j10;
        this.f51528b = (byte[]) C4536s.l(bArr);
        this.f51529c = (byte[]) C4536s.l(bArr2);
        this.f51530d = (byte[]) C4536s.l(bArr3);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof A0)) {
            return false;
        }
        A0 a02 = (A0) obj;
        if (this.f51527a != a02.f51527a || !Arrays.equals(this.f51528b, a02.f51528b) || !Arrays.equals(this.f51529c, a02.f51529c) || !Arrays.equals(this.f51530d, a02.f51530d)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return C4535q.c(Long.valueOf(this.f51527a), this.f51528b, this.f51529c, this.f51530d);
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.w(parcel, 1, this.f51527a);
        c.k(parcel, 2, this.f51528b, false);
        c.k(parcel, 3, this.f51529c, false);
        c.k(parcel, 4, this.f51530d, false);
        c.b(parcel, a10);
    }
}
