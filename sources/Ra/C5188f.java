package ra;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C4535q;
import com.google.android.gms.common.internal.C4536s;
import za.C5298a;
import za.c;

/* renamed from: ra.f  reason: case insensitive filesystem */
public class C5188f extends C5298a {
    public static final Parcelable.Creator<C5188f> CREATOR = new t();

    /* renamed from: a  reason: collision with root package name */
    private final String f61527a;

    /* renamed from: b  reason: collision with root package name */
    private final String f61528b;

    /* renamed from: c  reason: collision with root package name */
    private final String f61529c;

    /* renamed from: d  reason: collision with root package name */
    private final String f61530d;

    /* renamed from: e  reason: collision with root package name */
    private final boolean f61531e;

    /* renamed from: f  reason: collision with root package name */
    private final int f61532f;

    /* renamed from: ra.f$a */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private String f61533a;

        /* renamed from: b  reason: collision with root package name */
        private String f61534b;

        /* renamed from: c  reason: collision with root package name */
        private String f61535c;

        /* renamed from: d  reason: collision with root package name */
        private String f61536d;

        /* renamed from: e  reason: collision with root package name */
        private boolean f61537e;

        /* renamed from: f  reason: collision with root package name */
        private int f61538f;

        public C5188f a() {
            return new C5188f(this.f61533a, this.f61534b, this.f61535c, this.f61536d, this.f61537e, this.f61538f);
        }

        public a b(String str) {
            this.f61534b = str;
            return this;
        }

        public a c(String str) {
            this.f61536d = str;
            return this;
        }

        public a d(boolean z10) {
            this.f61537e = z10;
            return this;
        }

        public a e(String str) {
            C4536s.l(str);
            this.f61533a = str;
            return this;
        }

        public final a f(String str) {
            this.f61535c = str;
            return this;
        }

        public final a g(int i10) {
            this.f61538f = i10;
            return this;
        }
    }

    C5188f(String str, String str2, String str3, String str4, boolean z10, int i10) {
        C4536s.l(str);
        this.f61527a = str;
        this.f61528b = str2;
        this.f61529c = str3;
        this.f61530d = str4;
        this.f61531e = z10;
        this.f61532f = i10;
    }

    public static a o0() {
        return new a();
    }

    public static a t0(C5188f fVar) {
        C4536s.l(fVar);
        a o02 = o0();
        o02.e(fVar.r0());
        o02.c(fVar.q0());
        o02.b(fVar.p0());
        o02.d(fVar.f61531e);
        o02.g(fVar.f61532f);
        String str = fVar.f61529c;
        if (str != null) {
            o02.f(str);
        }
        return o02;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C5188f)) {
            return false;
        }
        C5188f fVar = (C5188f) obj;
        if (!C4535q.b(this.f61527a, fVar.f61527a) || !C4535q.b(this.f61530d, fVar.f61530d) || !C4535q.b(this.f61528b, fVar.f61528b) || !C4535q.b(Boolean.valueOf(this.f61531e), Boolean.valueOf(fVar.f61531e)) || this.f61532f != fVar.f61532f) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C4535q.c(this.f61527a, this.f61528b, this.f61530d, Boolean.valueOf(this.f61531e), Integer.valueOf(this.f61532f));
    }

    public String p0() {
        return this.f61528b;
    }

    public String q0() {
        return this.f61530d;
    }

    public String r0() {
        return this.f61527a;
    }

    public boolean s0() {
        return this.f61531e;
    }

    public void writeToParcel(Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.D(parcel, 1, r0(), false);
        c.D(parcel, 2, p0(), false);
        c.D(parcel, 3, this.f61529c, false);
        c.D(parcel, 4, q0(), false);
        c.g(parcel, 5, s0());
        c.t(parcel, 6, this.f61532f);
        c.b(parcel, a10);
    }
}
