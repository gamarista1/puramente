package Ma;

import Ma.c;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C4535q;
import java.util.Arrays;
import java.util.List;
import za.C5298a;

public class b extends C5298a {
    public static final Parcelable.Creator<b> CREATOR = new h();

    /* renamed from: a  reason: collision with root package name */
    private final int f52016a;

    /* renamed from: b  reason: collision with root package name */
    private final byte[] f52017b;

    /* renamed from: c  reason: collision with root package name */
    private final c f52018c;

    /* renamed from: d  reason: collision with root package name */
    private final List f52019d;

    b(int i10, byte[] bArr, String str, List list) {
        this.f52016a = i10;
        this.f52017b = bArr;
        try {
            this.f52018c = c.a(str);
            this.f52019d = list;
        } catch (c.a e10) {
            throw new IllegalArgumentException(e10);
        }
    }

    public boolean equals(Object obj) {
        List list;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (!Arrays.equals(this.f52017b, bVar.f52017b) || !this.f52018c.equals(bVar.f52018c)) {
            return false;
        }
        List list2 = this.f52019d;
        if (list2 == null && bVar.f52019d == null) {
            return true;
        }
        if (list2 == null || (list = bVar.f52019d) == null || !list2.containsAll(list) || !bVar.f52019d.containsAll(this.f52019d)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C4535q.c(Integer.valueOf(Arrays.hashCode(this.f52017b)), this.f52018c, this.f52019d);
    }

    public byte[] o0() {
        return this.f52017b;
    }

    public c p0() {
        return this.f52018c;
    }

    public List q0() {
        return this.f52019d;
    }

    public int r0() {
        return this.f52016a;
    }

    public String toString() {
        String str;
        List list = this.f52019d;
        if (list == null) {
            str = "null";
        } else {
            str = list.toString();
        }
        return String.format("{keyHandle: %s, version: %s, transports: %s}", new Object[]{Ea.c.c(this.f52017b), this.f52018c, str});
    }

    public void writeToParcel(Parcel parcel, int i10) {
        int a10 = za.c.a(parcel);
        za.c.t(parcel, 1, r0());
        za.c.k(parcel, 2, o0(), false);
        za.c.D(parcel, 3, this.f52018c.toString(), false);
        za.c.H(parcel, 4, q0(), false);
        za.c.b(parcel, a10);
    }
}
