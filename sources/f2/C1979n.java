package f2;

import android.os.Parcel;
import android.os.Parcelable;
import i2.C2076a;
import i2.L;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.UUID;

/* renamed from: f2.n  reason: case insensitive filesystem */
public final class C1979n implements Comparator, Parcelable {
    public static final Parcelable.Creator<C1979n> CREATOR = new a();

    /* renamed from: a  reason: collision with root package name */
    private final b[] f20012a;

    /* renamed from: b  reason: collision with root package name */
    private int f20013b;

    /* renamed from: c  reason: collision with root package name */
    public final String f20014c;

    /* renamed from: d  reason: collision with root package name */
    public final int f20015d;

    /* renamed from: f2.n$a */
    class a implements Parcelable.Creator {
        a() {
        }

        /* renamed from: a */
        public C1979n createFromParcel(Parcel parcel) {
            return new C1979n(parcel);
        }

        /* renamed from: b */
        public C1979n[] newArray(int i10) {
            return new C1979n[i10];
        }
    }

    /* renamed from: f2.n$b */
    public static final class b implements Parcelable {
        public static final Parcelable.Creator<b> CREATOR = new a();

        /* renamed from: a  reason: collision with root package name */
        private int f20016a;

        /* renamed from: b  reason: collision with root package name */
        public final UUID f20017b;

        /* renamed from: c  reason: collision with root package name */
        public final String f20018c;

        /* renamed from: d  reason: collision with root package name */
        public final String f20019d;

        /* renamed from: e  reason: collision with root package name */
        public final byte[] f20020e;

        /* renamed from: f2.n$b$a */
        class a implements Parcelable.Creator {
            a() {
            }

            /* renamed from: a */
            public b createFromParcel(Parcel parcel) {
                return new b(parcel);
            }

            /* renamed from: b */
            public b[] newArray(int i10) {
                return new b[i10];
            }
        }

        public b(UUID uuid, String str, byte[] bArr) {
            this(uuid, (String) null, str, bArr);
        }

        public b a(byte[] bArr) {
            return new b(this.f20017b, this.f20018c, this.f20019d, bArr);
        }

        public boolean b(UUID uuid) {
            if (C1973h.f19972a.equals(this.f20017b) || uuid.equals(this.f20017b)) {
                return true;
            }
            return false;
        }

        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof b)) {
                return false;
            }
            if (obj == this) {
                return true;
            }
            b bVar = (b) obj;
            if (!L.c(this.f20018c, bVar.f20018c) || !L.c(this.f20019d, bVar.f20019d) || !L.c(this.f20017b, bVar.f20017b) || !Arrays.equals(this.f20020e, bVar.f20020e)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            int i10;
            if (this.f20016a == 0) {
                int hashCode = this.f20017b.hashCode() * 31;
                String str = this.f20018c;
                if (str == null) {
                    i10 = 0;
                } else {
                    i10 = str.hashCode();
                }
                this.f20016a = ((((hashCode + i10) * 31) + this.f20019d.hashCode()) * 31) + Arrays.hashCode(this.f20020e);
            }
            return this.f20016a;
        }

        public void writeToParcel(Parcel parcel, int i10) {
            parcel.writeLong(this.f20017b.getMostSignificantBits());
            parcel.writeLong(this.f20017b.getLeastSignificantBits());
            parcel.writeString(this.f20018c);
            parcel.writeString(this.f20019d);
            parcel.writeByteArray(this.f20020e);
        }

        public b(UUID uuid, String str, String str2, byte[] bArr) {
            this.f20017b = (UUID) C2076a.e(uuid);
            this.f20018c = str;
            this.f20019d = C1960A.p((String) C2076a.e(str2));
            this.f20020e = bArr;
        }

        b(Parcel parcel) {
            this.f20017b = new UUID(parcel.readLong(), parcel.readLong());
            this.f20018c = parcel.readString();
            this.f20019d = (String) L.h(parcel.readString());
            this.f20020e = parcel.createByteArray();
        }
    }

    public C1979n(List list) {
        this((String) null, false, (b[]) list.toArray(new b[0]));
    }

    /* renamed from: a */
    public int compare(b bVar, b bVar2) {
        UUID uuid = C1973h.f19972a;
        if (!uuid.equals(bVar.f20017b)) {
            return bVar.f20017b.compareTo(bVar2.f20017b);
        }
        if (uuid.equals(bVar2.f20017b)) {
            return 0;
        }
        return 1;
    }

    public C1979n b(String str) {
        if (L.c(this.f20014c, str)) {
            return this;
        }
        return new C1979n(str, false, this.f20012a);
    }

    public b c(int i10) {
        return this.f20012a[i10];
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C1979n.class != obj.getClass()) {
            return false;
        }
        C1979n nVar = (C1979n) obj;
        if (!L.c(this.f20014c, nVar.f20014c) || !Arrays.equals(this.f20012a, nVar.f20012a)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        int i10;
        if (this.f20013b == 0) {
            String str = this.f20014c;
            if (str == null) {
                i10 = 0;
            } else {
                i10 = str.hashCode();
            }
            this.f20013b = (i10 * 31) + Arrays.hashCode(this.f20012a);
        }
        return this.f20013b;
    }

    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f20014c);
        parcel.writeTypedArray(this.f20012a, 0);
    }

    public C1979n(b... bVarArr) {
        this((String) null, bVarArr);
    }

    public C1979n(String str, b... bVarArr) {
        this(str, true, bVarArr);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v2, resolved type: f2.n$b[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private C1979n(java.lang.String r1, boolean r2, f2.C1979n.b... r3) {
        /*
            r0 = this;
            r0.<init>()
            r0.f20014c = r1
            if (r2 == 0) goto L_0x000e
            java.lang.Object r1 = r3.clone()
            r3 = r1
            f2.n$b[] r3 = (f2.C1979n.b[]) r3
        L_0x000e:
            r0.f20012a = r3
            int r1 = r3.length
            r0.f20015d = r1
            java.util.Arrays.sort(r3, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: f2.C1979n.<init>(java.lang.String, boolean, f2.n$b[]):void");
    }

    C1979n(Parcel parcel) {
        this.f20014c = parcel.readString();
        b[] bVarArr = (b[]) L.h((b[]) parcel.createTypedArray(b.CREATOR));
        this.f20012a = bVarArr;
        this.f20015d = bVarArr.length;
    }
}
