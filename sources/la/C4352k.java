package La;

import La.C4323D;
import La.C4335b;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C4535q;
import za.C5298a;
import za.c;

/* renamed from: La.k  reason: case insensitive filesystem */
public class C4352k extends C5298a {
    public static final Parcelable.Creator<C4352k> CREATOR = new w0();

    /* renamed from: a  reason: collision with root package name */
    private final C4335b f51608a;

    /* renamed from: b  reason: collision with root package name */
    private final Boolean f51609b;

    /* renamed from: c  reason: collision with root package name */
    private final C4350i0 f51610c;

    /* renamed from: d  reason: collision with root package name */
    private final C4323D f51611d;

    C4352k(String str, Boolean bool, String str2, String str3) {
        C4335b bVar;
        C4350i0 i0Var;
        C4323D d10 = null;
        if (str == null) {
            bVar = null;
        } else {
            try {
                bVar = C4335b.a(str);
            } catch (C4323D.a | C4335b.a | C4348h0 e10) {
                throw new IllegalArgumentException(e10);
            }
        }
        this.f51608a = bVar;
        this.f51609b = bool;
        if (str2 == null) {
            i0Var = null;
        } else {
            i0Var = C4350i0.a(str2);
        }
        this.f51610c = i0Var;
        if (str3 != null) {
            d10 = C4323D.a(str3);
        }
        this.f51611d = d10;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C4352k)) {
            return false;
        }
        C4352k kVar = (C4352k) obj;
        if (!C4535q.b(this.f51608a, kVar.f51608a) || !C4535q.b(this.f51609b, kVar.f51609b) || !C4535q.b(this.f51610c, kVar.f51610c) || !C4535q.b(q0(), kVar.q0())) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C4535q.c(this.f51608a, this.f51609b, this.f51610c, q0());
    }

    public String o0() {
        C4335b bVar = this.f51608a;
        if (bVar == null) {
            return null;
        }
        return bVar.toString();
    }

    public Boolean p0() {
        return this.f51609b;
    }

    public C4323D q0() {
        C4323D d10 = this.f51611d;
        if (d10 != null) {
            return d10;
        }
        Boolean bool = this.f51609b;
        if (bool == null || !bool.booleanValue()) {
            return null;
        }
        return C4323D.RESIDENT_KEY_REQUIRED;
    }

    public String r0() {
        if (q0() == null) {
            return null;
        }
        return q0().toString();
    }

    public void writeToParcel(Parcel parcel, int i10) {
        String str;
        int a10 = c.a(parcel);
        c.D(parcel, 2, o0(), false);
        c.i(parcel, 3, p0(), false);
        C4350i0 i0Var = this.f51610c;
        if (i0Var == null) {
            str = null;
        } else {
            str = i0Var.toString();
        }
        c.D(parcel, 4, str, false);
        c.D(parcel, 5, r0(), false);
        c.b(parcel, a10);
    }
}
