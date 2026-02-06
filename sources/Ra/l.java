package ra;

import La.C4360t;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C4535q;
import com.google.android.gms.common.internal.C4536s;
import za.C5298a;
import za.c;

public final class l extends C5298a {
    public static final Parcelable.Creator<l> CREATOR = new C5180B();

    /* renamed from: a  reason: collision with root package name */
    private final String f61547a;

    /* renamed from: b  reason: collision with root package name */
    private final String f61548b;

    /* renamed from: c  reason: collision with root package name */
    private final String f61549c;

    /* renamed from: d  reason: collision with root package name */
    private final String f61550d;

    /* renamed from: e  reason: collision with root package name */
    private final Uri f61551e;

    /* renamed from: f  reason: collision with root package name */
    private final String f61552f;

    /* renamed from: g  reason: collision with root package name */
    private final String f61553g;

    /* renamed from: h  reason: collision with root package name */
    private final String f61554h;

    /* renamed from: i  reason: collision with root package name */
    private final C4360t f61555i;

    l(String str, String str2, String str3, String str4, Uri uri, String str5, String str6, String str7, C4360t tVar) {
        this.f61547a = (String) C4536s.l(str);
        this.f61548b = str2;
        this.f61549c = str3;
        this.f61550d = str4;
        this.f61551e = uri;
        this.f61552f = str5;
        this.f61553g = str6;
        this.f61554h = str7;
        this.f61555i = tVar;
    }

    public String d() {
        return this.f61554h;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        if (!C4535q.b(this.f61547a, lVar.f61547a) || !C4535q.b(this.f61548b, lVar.f61548b) || !C4535q.b(this.f61549c, lVar.f61549c) || !C4535q.b(this.f61550d, lVar.f61550d) || !C4535q.b(this.f61551e, lVar.f61551e) || !C4535q.b(this.f61552f, lVar.f61552f) || !C4535q.b(this.f61553g, lVar.f61553g) || !C4535q.b(this.f61554h, lVar.f61554h) || !C4535q.b(this.f61555i, lVar.f61555i)) {
            return false;
        }
        return true;
    }

    public String g() {
        return this.f61548b;
    }

    public int hashCode() {
        return C4535q.c(this.f61547a, this.f61548b, this.f61549c, this.f61550d, this.f61551e, this.f61552f, this.f61553g, this.f61554h, this.f61555i);
    }

    public String o0() {
        return this.f61550d;
    }

    public String p0() {
        return this.f61549c;
    }

    public String q0() {
        return this.f61553g;
    }

    public String r0() {
        return this.f61547a;
    }

    public String s0() {
        return this.f61552f;
    }

    public Uri t0() {
        return this.f61551e;
    }

    public C4360t u0() {
        return this.f61555i;
    }

    public void writeToParcel(Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.D(parcel, 1, r0(), false);
        c.D(parcel, 2, g(), false);
        c.D(parcel, 3, p0(), false);
        c.D(parcel, 4, o0(), false);
        c.B(parcel, 5, t0(), i10, false);
        c.D(parcel, 6, s0(), false);
        c.D(parcel, 7, q0(), false);
        c.D(parcel, 8, d(), false);
        c.B(parcel, 9, u0(), i10, false);
        c.b(parcel, a10);
    }
}
