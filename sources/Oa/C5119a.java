package oa;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C4535q;
import com.google.android.gms.common.internal.C4536s;
import za.C5298a;
import za.c;

/* renamed from: oa.a  reason: case insensitive filesystem */
public class C5119a extends C5298a {
    public static final Parcelable.Creator<C5119a> CREATOR = new g();

    /* renamed from: a  reason: collision with root package name */
    final int f61147a;

    /* renamed from: b  reason: collision with root package name */
    final long f61148b;

    /* renamed from: c  reason: collision with root package name */
    final String f61149c;

    /* renamed from: d  reason: collision with root package name */
    final int f61150d;

    /* renamed from: e  reason: collision with root package name */
    final int f61151e;

    /* renamed from: f  reason: collision with root package name */
    final String f61152f;

    C5119a(int i10, long j10, String str, int i11, int i12, String str2) {
        this.f61147a = i10;
        this.f61148b = j10;
        this.f61149c = (String) C4536s.l(str);
        this.f61150d = i11;
        this.f61151e = i12;
        this.f61152f = str2;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C5119a)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        C5119a aVar = (C5119a) obj;
        if (this.f61147a == aVar.f61147a && this.f61148b == aVar.f61148b && C4535q.b(this.f61149c, aVar.f61149c) && this.f61150d == aVar.f61150d && this.f61151e == aVar.f61151e && C4535q.b(this.f61152f, aVar.f61152f)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return C4535q.c(Integer.valueOf(this.f61147a), Long.valueOf(this.f61148b), this.f61149c, Integer.valueOf(this.f61150d), Integer.valueOf(this.f61151e), this.f61152f);
    }

    public String toString() {
        String str;
        int i10 = this.f61150d;
        if (i10 == 1) {
            str = "ADDED";
        } else if (i10 == 2) {
            str = "REMOVED";
        } else if (i10 == 3) {
            str = "RENAMED_FROM";
        } else if (i10 != 4) {
            str = "UNKNOWN";
        } else {
            str = "RENAMED_TO";
        }
        String str2 = this.f61149c;
        String str3 = this.f61152f;
        int i11 = this.f61151e;
        return "AccountChangeEvent {accountName = " + str2 + ", changeType = " + str + ", changeData = " + str3 + ", eventIndex = " + i11 + "}";
    }

    public void writeToParcel(Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.t(parcel, 1, this.f61147a);
        c.w(parcel, 2, this.f61148b);
        c.D(parcel, 3, this.f61149c, false);
        c.t(parcel, 4, this.f61150d);
        c.t(parcel, 5, this.f61151e);
        c.D(parcel, 6, this.f61152f, false);
        c.b(parcel, a10);
    }
}
