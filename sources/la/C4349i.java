package La;

import La.C4358q;
import android.os.Parcel;
import android.os.Parcelable;
import com.amazon.a.a.o.b;
import com.google.android.gms.common.internal.C4535q;
import com.google.android.gms.internal.fido.zzam;
import com.google.android.gms.internal.fido.zzan;
import za.c;

/* renamed from: La.i  reason: case insensitive filesystem */
public class C4349i extends C4351j {
    public static final Parcelable.Creator<C4349i> CREATOR = new v0();

    /* renamed from: a  reason: collision with root package name */
    private final C4358q f51600a;

    /* renamed from: b  reason: collision with root package name */
    private final String f51601b;

    /* renamed from: c  reason: collision with root package name */
    private final int f51602c;

    C4349i(int i10, String str, int i11) {
        try {
            this.f51600a = C4358q.b(i10);
            this.f51601b = str;
            this.f51602c = i11;
        } catch (C4358q.a e10) {
            throw new IllegalArgumentException(e10);
        }
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C4349i)) {
            return false;
        }
        C4349i iVar = (C4349i) obj;
        if (!C4535q.b(this.f51600a, iVar.f51600a) || !C4535q.b(this.f51601b, iVar.f51601b) || !C4535q.b(Integer.valueOf(this.f51602c), Integer.valueOf(iVar.f51602c))) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C4535q.c(this.f51600a, this.f51601b, Integer.valueOf(this.f51602c));
    }

    public int o0() {
        return this.f51600a.a();
    }

    public String p0() {
        return this.f51601b;
    }

    public String toString() {
        zzam zza = zzan.zza(this);
        zza.zza("errorCode", this.f51600a.a());
        String str = this.f51601b;
        if (str != null) {
            zza.zzb(b.f37483f, str);
        }
        return zza.toString();
    }

    public void writeToParcel(Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.t(parcel, 2, o0());
        c.D(parcel, 3, p0(), false);
        c.t(parcel, 4, this.f51602c);
        c.b(parcel, a10);
    }
}
