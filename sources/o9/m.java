package o9;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import ja.C3645a;
import ja.M;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.UUID;
import k9.C3702j;

public final class m implements Comparator, Parcelable {
    public static final Parcelable.Creator<m> CREATOR = new a();

    /* renamed from: a  reason: collision with root package name */
    private final b[] f47518a;

    /* renamed from: b  reason: collision with root package name */
    private int f47519b;

    /* renamed from: c  reason: collision with root package name */
    public final String f47520c;

    /* renamed from: d  reason: collision with root package name */
    public final int f47521d;

    class a implements Parcelable.Creator {
        a() {
        }

        /* renamed from: a */
        public m createFromParcel(Parcel parcel) {
            return new m(parcel);
        }

        /* renamed from: b */
        public m[] newArray(int i10) {
            return new m[i10];
        }
    }

    public static final class b implements Parcelable {
        public static final Parcelable.Creator<b> CREATOR = new a();

        /* renamed from: a  reason: collision with root package name */
        private int f47522a;

        /* renamed from: b  reason: collision with root package name */
        public final UUID f47523b;

        /* renamed from: c  reason: collision with root package name */
        public final String f47524c;

        /* renamed from: d  reason: collision with root package name */
        public final String f47525d;

        /* renamed from: e  reason: collision with root package name */
        public final byte[] f47526e;

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

        public boolean a(b bVar) {
            if (!c() || bVar.c() || !d(bVar.f47523b)) {
                return false;
            }
            return true;
        }

        public b b(byte[] bArr) {
            return new b(this.f47523b, this.f47524c, this.f47525d, bArr);
        }

        public boolean c() {
            if (this.f47526e != null) {
                return true;
            }
            return false;
        }

        public boolean d(UUID uuid) {
            if (C3702j.f45575a.equals(this.f47523b) || uuid.equals(this.f47523b)) {
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
            if (!M.c(this.f47524c, bVar.f47524c) || !M.c(this.f47525d, bVar.f47525d) || !M.c(this.f47523b, bVar.f47523b) || !Arrays.equals(this.f47526e, bVar.f47526e)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            int i10;
            if (this.f47522a == 0) {
                int hashCode = this.f47523b.hashCode() * 31;
                String str = this.f47524c;
                if (str == null) {
                    i10 = 0;
                } else {
                    i10 = str.hashCode();
                }
                this.f47522a = ((((hashCode + i10) * 31) + this.f47525d.hashCode()) * 31) + Arrays.hashCode(this.f47526e);
            }
            return this.f47522a;
        }

        public void writeToParcel(Parcel parcel, int i10) {
            parcel.writeLong(this.f47523b.getMostSignificantBits());
            parcel.writeLong(this.f47523b.getLeastSignificantBits());
            parcel.writeString(this.f47524c);
            parcel.writeString(this.f47525d);
            parcel.writeByteArray(this.f47526e);
        }

        public b(UUID uuid, String str, String str2, byte[] bArr) {
            this.f47523b = (UUID) C3645a.e(uuid);
            this.f47524c = str;
            this.f47525d = (String) C3645a.e(str2);
            this.f47526e = bArr;
        }

        b(Parcel parcel) {
            this.f47523b = new UUID(parcel.readLong(), parcel.readLong());
            this.f47524c = parcel.readString();
            this.f47525d = (String) M.j(parcel.readString());
            this.f47526e = parcel.createByteArray();
        }
    }

    public m(List list) {
        this((String) null, false, (b[]) list.toArray(new b[0]));
    }

    private static boolean b(ArrayList arrayList, int i10, UUID uuid) {
        for (int i11 = 0; i11 < i10; i11++) {
            if (((b) arrayList.get(i11)).f47523b.equals(uuid)) {
                return true;
            }
        }
        return false;
    }

    public static m d(m mVar, m mVar2) {
        String str;
        ArrayList arrayList = new ArrayList();
        if (mVar != null) {
            str = mVar.f47520c;
            for (b bVar : mVar.f47518a) {
                if (bVar.c()) {
                    arrayList.add(bVar);
                }
            }
        } else {
            str = null;
        }
        if (mVar2 != null) {
            if (str == null) {
                str = mVar2.f47520c;
            }
            int size = arrayList.size();
            for (b bVar2 : mVar2.f47518a) {
                if (bVar2.c() && !b(arrayList, size, bVar2.f47523b)) {
                    arrayList.add(bVar2);
                }
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new m(str, (List) arrayList);
    }

    /* renamed from: a */
    public int compare(b bVar, b bVar2) {
        UUID uuid = C3702j.f45575a;
        if (!uuid.equals(bVar.f47523b)) {
            return bVar.f47523b.compareTo(bVar2.f47523b);
        }
        if (uuid.equals(bVar2.f47523b)) {
            return 0;
        }
        return 1;
    }

    public m c(String str) {
        if (M.c(this.f47520c, str)) {
            return this;
        }
        return new m(str, false, this.f47518a);
    }

    public int describeContents() {
        return 0;
    }

    public b e(int i10) {
        return this.f47518a[i10];
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || m.class != obj.getClass()) {
            return false;
        }
        m mVar = (m) obj;
        if (!M.c(this.f47520c, mVar.f47520c) || !Arrays.equals(this.f47518a, mVar.f47518a)) {
            return false;
        }
        return true;
    }

    public m f(m mVar) {
        boolean z10;
        String str;
        String str2 = this.f47520c;
        if (str2 == null || (str = mVar.f47520c) == null || TextUtils.equals(str2, str)) {
            z10 = true;
        } else {
            z10 = false;
        }
        C3645a.f(z10);
        String str3 = this.f47520c;
        if (str3 == null) {
            str3 = mVar.f47520c;
        }
        return new m(str3, (b[]) M.G0(this.f47518a, mVar.f47518a));
    }

    public int hashCode() {
        int i10;
        if (this.f47519b == 0) {
            String str = this.f47520c;
            if (str == null) {
                i10 = 0;
            } else {
                i10 = str.hashCode();
            }
            this.f47519b = (i10 * 31) + Arrays.hashCode(this.f47518a);
        }
        return this.f47519b;
    }

    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f47520c);
        parcel.writeTypedArray(this.f47518a, 0);
    }

    public m(String str, List list) {
        this(str, false, (b[]) list.toArray(new b[0]));
    }

    public m(b... bVarArr) {
        this((String) null, bVarArr);
    }

    public m(String str, b... bVarArr) {
        this(str, true, bVarArr);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v2, resolved type: o9.m$b[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private m(java.lang.String r1, boolean r2, o9.m.b... r3) {
        /*
            r0 = this;
            r0.<init>()
            r0.f47520c = r1
            if (r2 == 0) goto L_0x000e
            java.lang.Object r1 = r3.clone()
            r3 = r1
            o9.m$b[] r3 = (o9.m.b[]) r3
        L_0x000e:
            r0.f47518a = r3
            int r1 = r3.length
            r0.f47521d = r1
            java.util.Arrays.sort(r3, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o9.m.<init>(java.lang.String, boolean, o9.m$b[]):void");
    }

    m(Parcel parcel) {
        this.f47520c = parcel.readString();
        b[] bVarArr = (b[]) M.j((b[]) parcel.createTypedArray(b.CREATOR));
        this.f47518a = bVarArr;
        this.f47521d = bVarArr.length;
    }
}
