package ra;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C4535q;
import com.google.android.gms.common.internal.C4536s;
import za.C5298a;
import za.c;

public class i extends C5298a {
    public static final Parcelable.Creator<i> CREATOR = new z();

    /* renamed from: a  reason: collision with root package name */
    private final m f61540a;

    /* renamed from: b  reason: collision with root package name */
    private final String f61541b;

    /* renamed from: c  reason: collision with root package name */
    private final int f61542c;

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private m f61543a;

        /* renamed from: b  reason: collision with root package name */
        private String f61544b;

        /* renamed from: c  reason: collision with root package name */
        private int f61545c;

        public i a() {
            return new i(this.f61543a, this.f61544b, this.f61545c);
        }

        public a b(m mVar) {
            this.f61543a = mVar;
            return this;
        }

        public final a c(String str) {
            this.f61544b = str;
            return this;
        }

        public final a d(int i10) {
            this.f61545c = i10;
            return this;
        }
    }

    i(m mVar, String str, int i10) {
        this.f61540a = (m) C4536s.l(mVar);
        this.f61541b = str;
        this.f61542c = i10;
    }

    public static a o0() {
        return new a();
    }

    public static a q0(i iVar) {
        C4536s.l(iVar);
        a o02 = o0();
        o02.b(iVar.p0());
        o02.d(iVar.f61542c);
        String str = iVar.f61541b;
        if (str != null) {
            o02.c(str);
        }
        return o02;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        if (!C4535q.b(this.f61540a, iVar.f61540a) || !C4535q.b(this.f61541b, iVar.f61541b) || this.f61542c != iVar.f61542c) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C4535q.c(this.f61540a, this.f61541b);
    }

    public m p0() {
        return this.f61540a;
    }

    public void writeToParcel(Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.B(parcel, 1, p0(), i10, false);
        c.D(parcel, 2, this.f61541b, false);
        c.t(parcel, 3, this.f61542c);
        c.b(parcel, a10);
    }
}
