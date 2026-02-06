package La;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C4535q;
import com.google.android.gms.common.internal.C4536s;
import java.util.Arrays;
import za.C5298a;
import za.c;

public final class S extends C5298a {
    public static final Parcelable.Creator<S> CREATOR = new T();

    /* renamed from: a  reason: collision with root package name */
    private final byte[][] f51566a;

    public S(byte[][] bArr) {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        if (bArr != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        C4536s.a(z10);
        if (1 != ((bArr.length & 1) ^ 1)) {
            z11 = false;
        } else {
            z11 = true;
        }
        C4536s.a(z11);
        for (int i10 = 0; i10 < bArr.length; i10 += 2) {
            if (i10 == 0 || bArr[i10] != null) {
                z12 = true;
            } else {
                z12 = false;
            }
            C4536s.a(z12);
            int i11 = i10 + 1;
            if (bArr[i11] != null) {
                z13 = true;
            } else {
                z13 = false;
            }
            C4536s.a(z13);
            int length = bArr[i11].length;
            if (length == 32 || length == 64) {
                z14 = true;
            } else {
                z14 = false;
            }
            C4536s.a(z14);
        }
        this.f51566a = bArr;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof S)) {
            return false;
        }
        return Arrays.deepEquals(this.f51566a, ((S) obj).f51566a);
    }

    public final int hashCode() {
        int i10 = 0;
        for (byte[] bArr : this.f51566a) {
            i10 ^= C4535q.c(bArr);
        }
        return i10;
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.l(parcel, 1, this.f51566a, false);
        c.b(parcel, a10);
    }
}
