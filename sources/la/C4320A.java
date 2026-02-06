package La;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C4535q;
import com.google.android.gms.common.internal.C4536s;
import java.util.Arrays;
import za.C5298a;
import za.c;

/* renamed from: La.A  reason: case insensitive filesystem */
public class C4320A extends C5298a {
    public static final Parcelable.Creator<C4320A> CREATOR = new C4336b0();

    /* renamed from: a  reason: collision with root package name */
    private final byte[] f51523a;

    /* renamed from: b  reason: collision with root package name */
    private final String f51524b;

    /* renamed from: c  reason: collision with root package name */
    private final String f51525c;

    /* renamed from: d  reason: collision with root package name */
    private final String f51526d;

    public C4320A(byte[] bArr, String str, String str2, String str3) {
        this.f51523a = (byte[]) C4536s.l(bArr);
        this.f51524b = (String) C4536s.l(str);
        this.f51525c = str2;
        this.f51526d = (String) C4536s.l(str3);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C4320A)) {
            return false;
        }
        C4320A a10 = (C4320A) obj;
        if (!Arrays.equals(this.f51523a, a10.f51523a) || !C4535q.b(this.f51524b, a10.f51524b) || !C4535q.b(this.f51525c, a10.f51525c) || !C4535q.b(this.f51526d, a10.f51526d)) {
            return false;
        }
        return true;
    }

    public String g() {
        return this.f51526d;
    }

    public String getName() {
        return this.f51524b;
    }

    public int hashCode() {
        return C4535q.c(this.f51523a, this.f51524b, this.f51525c, this.f51526d);
    }

    public String o0() {
        return this.f51525c;
    }

    public byte[] p0() {
        return this.f51523a;
    }

    public void writeToParcel(Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.k(parcel, 2, p0(), false);
        c.D(parcel, 3, getName(), false);
        c.D(parcel, 4, o0(), false);
        c.D(parcel, 5, g(), false);
        c.b(parcel, a10);
    }
}
