package La;

import La.C4366z;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C4535q;
import com.google.android.gms.common.internal.C4536s;
import com.google.android.gms.internal.fido.zzbc;
import com.google.android.gms.internal.fido.zzh;
import java.util.Arrays;
import java.util.List;
import za.C5298a;
import za.c;

/* renamed from: La.v  reason: case insensitive filesystem */
public class C4362v extends C5298a {
    public static final Parcelable.Creator<C4362v> CREATOR = new W();

    /* renamed from: d  reason: collision with root package name */
    private static final zzbc f51667d = zzbc.zzk(zzh.zza, zzh.zzb);

    /* renamed from: a  reason: collision with root package name */
    private final C4366z f51668a;

    /* renamed from: b  reason: collision with root package name */
    private final byte[] f51669b;

    /* renamed from: c  reason: collision with root package name */
    private final List f51670c;

    public C4362v(String str, byte[] bArr, List list) {
        C4536s.l(str);
        try {
            this.f51668a = C4366z.a(str);
            this.f51669b = (byte[]) C4536s.l(bArr);
            this.f51670c = list;
        } catch (C4366z.a e10) {
            throw new IllegalArgumentException(e10);
        }
    }

    public boolean equals(Object obj) {
        List list;
        if (!(obj instanceof C4362v)) {
            return false;
        }
        C4362v vVar = (C4362v) obj;
        if (!this.f51668a.equals(vVar.f51668a) || !Arrays.equals(this.f51669b, vVar.f51669b)) {
            return false;
        }
        List list2 = this.f51670c;
        if (list2 == null && vVar.f51670c == null) {
            return true;
        }
        if (list2 == null || (list = vVar.f51670c) == null || !list2.containsAll(list) || !vVar.f51670c.containsAll(this.f51670c)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C4535q.c(this.f51668a, Integer.valueOf(Arrays.hashCode(this.f51669b)), this.f51670c);
    }

    public byte[] o0() {
        return this.f51669b;
    }

    public List p0() {
        return this.f51670c;
    }

    public String q0() {
        return this.f51668a.toString();
    }

    public void writeToParcel(Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.D(parcel, 2, q0(), false);
        c.k(parcel, 3, o0(), false);
        c.H(parcel, 4, p0(), false);
        c.b(parcel, a10);
    }
}
