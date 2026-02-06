package ra;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.internal.C4535q;
import com.google.android.gms.common.internal.C4536s;
import java.util.List;
import za.C5298a;
import za.c;

/* renamed from: ra.a  reason: case insensitive filesystem */
public final class C5183a extends C5298a {
    public static final Parcelable.Creator<C5183a> CREATOR = new o();

    /* renamed from: a  reason: collision with root package name */
    private final String f61477a;

    /* renamed from: b  reason: collision with root package name */
    private final String f61478b;

    /* renamed from: c  reason: collision with root package name */
    private final String f61479c;

    /* renamed from: d  reason: collision with root package name */
    private final List f61480d;

    /* renamed from: e  reason: collision with root package name */
    private final GoogleSignInAccount f61481e;

    /* renamed from: f  reason: collision with root package name */
    private final PendingIntent f61482f;

    public C5183a(String str, String str2, String str3, List list, GoogleSignInAccount googleSignInAccount, PendingIntent pendingIntent) {
        this.f61477a = str;
        this.f61478b = str2;
        this.f61479c = str3;
        this.f61480d = (List) C4536s.l(list);
        this.f61482f = pendingIntent;
        this.f61481e = googleSignInAccount;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C5183a)) {
            return false;
        }
        C5183a aVar = (C5183a) obj;
        if (!C4535q.b(this.f61477a, aVar.f61477a) || !C4535q.b(this.f61478b, aVar.f61478b) || !C4535q.b(this.f61479c, aVar.f61479c) || !C4535q.b(this.f61480d, aVar.f61480d) || !C4535q.b(this.f61482f, aVar.f61482f) || !C4535q.b(this.f61481e, aVar.f61481e)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C4535q.c(this.f61477a, this.f61478b, this.f61479c, this.f61480d, this.f61482f, this.f61481e);
    }

    public String o0() {
        return this.f61478b;
    }

    public List p0() {
        return this.f61480d;
    }

    public PendingIntent q0() {
        return this.f61482f;
    }

    public String r0() {
        return this.f61477a;
    }

    public GoogleSignInAccount s0() {
        return this.f61481e;
    }

    public void writeToParcel(Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.D(parcel, 1, r0(), false);
        c.D(parcel, 2, o0(), false);
        c.D(parcel, 3, this.f61479c, false);
        c.F(parcel, 4, p0(), false);
        c.B(parcel, 5, s0(), i10, false);
        c.B(parcel, 6, q0(), i10, false);
        c.b(parcel, a10);
    }
}
