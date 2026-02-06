package H9;

import D9.a;
import android.os.Parcel;
import android.os.Parcelable;
import ja.C3645a;
import ja.M;
import k9.D0;

public final class b implements a.b {
    public static final Parcelable.Creator<b> CREATOR = new a();

    /* renamed from: a  reason: collision with root package name */
    public final int f31718a;

    /* renamed from: b  reason: collision with root package name */
    public final String f31719b;

    /* renamed from: c  reason: collision with root package name */
    public final String f31720c;

    /* renamed from: d  reason: collision with root package name */
    public final String f31721d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f31722e;

    /* renamed from: f  reason: collision with root package name */
    public final int f31723f;

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

    public b(int i10, String str, String str2, String str3, boolean z10, int i11) {
        C3645a.a(i11 == -1 || i11 > 0);
        this.f31718a = i10;
        this.f31719b = str;
        this.f31720c = str2;
        this.f31721d = str3;
        this.f31722e = z10;
        this.f31723f = i11;
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x005d  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0066  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0071  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x007a  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0085  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x008e  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0099  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00a8  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00b3  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00eb  */
    /* JADX WARNING: Removed duplicated region for block: B:51:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static H9.b a(java.util.Map r13) {
        /*
            java.lang.String r0 = "Invalid metadata interval: "
            java.lang.String r1 = "icy-br"
            java.lang.Object r1 = r13.get(r1)
            java.util.List r1 = (java.util.List) r1
            java.lang.String r2 = "IcyHeaders"
            r3 = 1
            r4 = 0
            r5 = -1
            if (r1 == 0) goto L_0x0050
            java.lang.Object r1 = r1.get(r4)
            java.lang.String r1 = (java.lang.String) r1
            int r6 = java.lang.Integer.parseInt(r1)     // Catch:{ NumberFormatException -> 0x0039 }
            int r6 = r6 * 1000
            if (r6 <= 0) goto L_0x0021
            r1 = r3
            goto L_0x0037
        L_0x0021:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ NumberFormatException -> 0x003a }
            r7.<init>()     // Catch:{ NumberFormatException -> 0x003a }
            java.lang.String r8 = "Invalid bitrate: "
            r7.append(r8)     // Catch:{ NumberFormatException -> 0x003a }
            r7.append(r1)     // Catch:{ NumberFormatException -> 0x003a }
            java.lang.String r7 = r7.toString()     // Catch:{ NumberFormatException -> 0x003a }
            ja.s.i(r2, r7)     // Catch:{ NumberFormatException -> 0x003a }
            r1 = r4
            r6 = r5
        L_0x0037:
            r7 = r6
            goto L_0x0052
        L_0x0039:
            r6 = r5
        L_0x003a:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = "Invalid bitrate header: "
            r7.append(r8)
            r7.append(r1)
            java.lang.String r1 = r7.toString()
            ja.s.i(r2, r1)
            r1 = r4
            goto L_0x0037
        L_0x0050:
            r1 = r4
            r7 = r5
        L_0x0052:
            java.lang.String r6 = "icy-genre"
            java.lang.Object r6 = r13.get(r6)
            java.util.List r6 = (java.util.List) r6
            r8 = 0
            if (r6 == 0) goto L_0x0066
            java.lang.Object r1 = r6.get(r4)
            java.lang.String r1 = (java.lang.String) r1
            r9 = r1
            r1 = r3
            goto L_0x0067
        L_0x0066:
            r9 = r8
        L_0x0067:
            java.lang.String r6 = "icy-name"
            java.lang.Object r6 = r13.get(r6)
            java.util.List r6 = (java.util.List) r6
            if (r6 == 0) goto L_0x007a
            java.lang.Object r1 = r6.get(r4)
            java.lang.String r1 = (java.lang.String) r1
            r10 = r1
            r1 = r3
            goto L_0x007b
        L_0x007a:
            r10 = r8
        L_0x007b:
            java.lang.String r6 = "icy-url"
            java.lang.Object r6 = r13.get(r6)
            java.util.List r6 = (java.util.List) r6
            if (r6 == 0) goto L_0x008e
            java.lang.Object r1 = r6.get(r4)
            java.lang.String r1 = (java.lang.String) r1
            r11 = r1
            r1 = r3
            goto L_0x008f
        L_0x008e:
            r11 = r8
        L_0x008f:
            java.lang.String r6 = "icy-pub"
            java.lang.Object r6 = r13.get(r6)
            java.util.List r6 = (java.util.List) r6
            if (r6 == 0) goto L_0x00a8
            java.lang.Object r1 = r6.get(r4)
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r6 = "1"
            boolean r1 = r1.equals(r6)
            r12 = r1
            r1 = r3
            goto L_0x00a9
        L_0x00a8:
            r12 = r4
        L_0x00a9:
            java.lang.String r6 = "icy-metaint"
            java.lang.Object r13 = r13.get(r6)
            java.util.List r13 = (java.util.List) r13
            if (r13 == 0) goto L_0x00e9
            java.lang.Object r13 = r13.get(r4)
            java.lang.String r13 = (java.lang.String) r13
            int r4 = java.lang.Integer.parseInt(r13)     // Catch:{ NumberFormatException -> 0x00d7 }
            if (r4 <= 0) goto L_0x00c1
            r5 = r4
            goto L_0x00d4
        L_0x00c1:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ NumberFormatException -> 0x00d6 }
            r3.<init>()     // Catch:{ NumberFormatException -> 0x00d6 }
            r3.append(r0)     // Catch:{ NumberFormatException -> 0x00d6 }
            r3.append(r13)     // Catch:{ NumberFormatException -> 0x00d6 }
            java.lang.String r3 = r3.toString()     // Catch:{ NumberFormatException -> 0x00d6 }
            ja.s.i(r2, r3)     // Catch:{ NumberFormatException -> 0x00d6 }
            r3 = r1
        L_0x00d4:
            r1 = r3
            goto L_0x00e9
        L_0x00d6:
            r5 = r4
        L_0x00d7:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r0)
            r3.append(r13)
            java.lang.String r13 = r3.toString()
            ja.s.i(r2, r13)
        L_0x00e9:
            if (r1 == 0) goto L_0x00f7
            H9.b r13 = new H9.b
            r6 = r13
            r8 = r9
            r9 = r10
            r10 = r11
            r11 = r12
            r12 = r5
            r6.<init>(r7, r8, r9, r10, r11, r12)
            r8 = r13
        L_0x00f7:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: H9.b.a(java.util.Map):H9.b");
    }

    public void E(D0.b bVar) {
        String str = this.f31720c;
        if (str != null) {
            bVar.g0(str);
        }
        String str2 = this.f31719b;
        if (str2 != null) {
            bVar.X(str2);
        }
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || b.class != obj.getClass()) {
            return false;
        }
        b bVar = (b) obj;
        if (this.f31718a != bVar.f31718a || !M.c(this.f31719b, bVar.f31719b) || !M.c(this.f31720c, bVar.f31720c) || !M.c(this.f31721d, bVar.f31721d) || this.f31722e != bVar.f31722e || this.f31723f != bVar.f31723f) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        int i10;
        int i11;
        int i12 = (527 + this.f31718a) * 31;
        String str = this.f31719b;
        int i13 = 0;
        if (str != null) {
            i10 = str.hashCode();
        } else {
            i10 = 0;
        }
        int i14 = (i12 + i10) * 31;
        String str2 = this.f31720c;
        if (str2 != null) {
            i11 = str2.hashCode();
        } else {
            i11 = 0;
        }
        int i15 = (i14 + i11) * 31;
        String str3 = this.f31721d;
        if (str3 != null) {
            i13 = str3.hashCode();
        }
        return ((((i15 + i13) * 31) + (this.f31722e ? 1 : 0)) * 31) + this.f31723f;
    }

    public String toString() {
        return "IcyHeaders: name=\"" + this.f31720c + "\", genre=\"" + this.f31719b + "\", bitrate=" + this.f31718a + ", metadataInterval=" + this.f31723f;
    }

    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f31718a);
        parcel.writeString(this.f31719b);
        parcel.writeString(this.f31720c);
        parcel.writeString(this.f31721d);
        M.a1(parcel, this.f31722e);
        parcel.writeInt(this.f31723f);
    }

    b(Parcel parcel) {
        this.f31718a = parcel.readInt();
        this.f31719b = parcel.readString();
        this.f31720c = parcel.readString();
        this.f31721d = parcel.readString();
        this.f31722e = M.M0(parcel);
        this.f31723f = parcel.readInt();
    }
}
