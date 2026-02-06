package La;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C4535q;
import com.google.android.gms.common.internal.C4536s;
import za.C5298a;
import za.c;

/* renamed from: La.y  reason: case insensitive filesystem */
public class C4365y extends C5298a {
    public static final Parcelable.Creator<C4365y> CREATOR = new Z();

    /* renamed from: a  reason: collision with root package name */
    private final String f51682a;

    /* renamed from: b  reason: collision with root package name */
    private final String f51683b;

    /* renamed from: c  reason: collision with root package name */
    private final String f51684c;

    public C4365y(String str, String str2, String str3) {
        this.f51682a = (String) C4536s.l(str);
        this.f51683b = (String) C4536s.l(str2);
        this.f51684c = str3;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C4365y)) {
            return false;
        }
        C4365y yVar = (C4365y) obj;
        if (!C4535q.b(this.f51682a, yVar.f51682a) || !C4535q.b(this.f51683b, yVar.f51683b) || !C4535q.b(this.f51684c, yVar.f51684c)) {
            return false;
        }
        return true;
    }

    public String getName() {
        return this.f51683b;
    }

    public int hashCode() {
        return C4535q.c(this.f51682a, this.f51683b, this.f51684c);
    }

    public String o0() {
        return this.f51684c;
    }

    public String p0() {
        return this.f51682a;
    }

    public void writeToParcel(Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.D(parcel, 2, p0(), false);
        c.D(parcel, 3, getName(), false);
        c.D(parcel, 4, o0(), false);
        c.b(parcel, a10);
    }
}
