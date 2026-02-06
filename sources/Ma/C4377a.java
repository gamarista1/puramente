package Ma;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C4536s;
import za.C5298a;
import za.c;

/* renamed from: Ma.a  reason: case insensitive filesystem */
public class C4377a extends C5298a {
    public static final Parcelable.Creator<C4377a> CREATOR = new g();

    /* renamed from: d  reason: collision with root package name */
    public static final C4377a f52005d = new C4377a();

    /* renamed from: e  reason: collision with root package name */
    public static final C4377a f52006e = new C4377a("unavailable");

    /* renamed from: f  reason: collision with root package name */
    public static final C4377a f52007f = new C4377a("unused");

    /* renamed from: a  reason: collision with root package name */
    private final C0797a f52008a;

    /* renamed from: b  reason: collision with root package name */
    private final String f52009b;

    /* renamed from: c  reason: collision with root package name */
    private final String f52010c;

    /* renamed from: Ma.a$a  reason: collision with other inner class name */
    public enum C0797a implements Parcelable {
        ABSENT(0),
        STRING(1),
        OBJECT(2);
        
        public static final Parcelable.Creator<C0797a> CREATOR = null;
        /* access modifiers changed from: private */

        /* renamed from: a  reason: collision with root package name */
        public final int f52015a;

        static {
            CREATOR = new f();
        }

        private C0797a(int i10) {
            this.f52015a = i10;
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i10) {
            parcel.writeInt(this.f52015a);
        }
    }

    /* renamed from: Ma.a$b */
    public static class b extends Exception {
        public b(int i10) {
            super(String.format("ChannelIdValueType %s not supported", new Object[]{Integer.valueOf(i10)}));
        }
    }

    private C4377a() {
        this.f52008a = C0797a.ABSENT;
        this.f52010c = null;
        this.f52009b = null;
    }

    public static C0797a r0(int i10) {
        for (C0797a aVar : C0797a.values()) {
            if (i10 == aVar.f52015a) {
                return aVar;
            }
        }
        throw new b(i10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4377a)) {
            return false;
        }
        C4377a aVar = (C4377a) obj;
        if (!this.f52008a.equals(aVar.f52008a)) {
            return false;
        }
        int ordinal = this.f52008a.ordinal();
        if (ordinal == 0) {
            return true;
        }
        if (ordinal == 1) {
            return this.f52009b.equals(aVar.f52009b);
        }
        if (ordinal != 2) {
            return false;
        }
        return this.f52010c.equals(aVar.f52010c);
    }

    public int hashCode() {
        int i10;
        int hashCode;
        int hashCode2 = this.f52008a.hashCode() + 31;
        int ordinal = this.f52008a.ordinal();
        if (ordinal == 1) {
            i10 = hashCode2 * 31;
            hashCode = this.f52009b.hashCode();
        } else if (ordinal != 2) {
            return hashCode2;
        } else {
            i10 = hashCode2 * 31;
            hashCode = this.f52010c.hashCode();
        }
        return i10 + hashCode;
    }

    public String o0() {
        return this.f52010c;
    }

    public String p0() {
        return this.f52009b;
    }

    public int q0() {
        return this.f52008a.f52015a;
    }

    public void writeToParcel(Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.t(parcel, 2, q0());
        c.D(parcel, 3, p0(), false);
        c.D(parcel, 4, o0(), false);
        c.b(parcel, a10);
    }

    C4377a(int i10, String str, String str2) {
        try {
            this.f52008a = r0(i10);
            this.f52009b = str;
            this.f52010c = str2;
        } catch (b e10) {
            throw new IllegalArgumentException(e10);
        }
    }

    private C4377a(String str) {
        this.f52009b = (String) C4536s.l(str);
        this.f52008a = C0797a.STRING;
        this.f52010c = null;
    }
}
