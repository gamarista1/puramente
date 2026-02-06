package ra;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C4535q;
import com.google.android.gms.common.internal.C4536s;
import za.C5298a;
import za.c;

public class m extends C5298a {
    public static final Parcelable.Creator<m> CREATOR = new C5182D();

    /* renamed from: a  reason: collision with root package name */
    private final String f61556a;

    /* renamed from: b  reason: collision with root package name */
    private final String f61557b;

    public m(String str, String str2) {
        this.f61556a = C4536s.g(((String) C4536s.m(str, "Account identifier cannot be null")).trim(), "Account identifier cannot be empty");
        this.f61557b = C4536s.f(str2);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        if (!C4535q.b(this.f61556a, mVar.f61556a) || !C4535q.b(this.f61557b, mVar.f61557b)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C4535q.c(this.f61556a, this.f61557b);
    }

    public String o0() {
        return this.f61556a;
    }

    public String p0() {
        return this.f61557b;
    }

    public void writeToParcel(Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.D(parcel, 1, o0(), false);
        c.D(parcel, 2, p0(), false);
        c.b(parcel, a10);
    }
}
