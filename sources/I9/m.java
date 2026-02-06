package I9;

import android.os.Parcel;
import android.os.Parcelable;
import ja.M;
import java.util.ArrayList;
import java.util.List;

public final class m extends i {
    public static final Parcelable.Creator<m> CREATOR = new a();

    /* renamed from: b  reason: collision with root package name */
    public final String f31821b;

    /* renamed from: c  reason: collision with root package name */
    public final String f31822c;

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

    public m(String str, String str2, String str3) {
        super(str);
        this.f31821b = str2;
        this.f31822c = str3;
    }

    private static List a(String str) {
        ArrayList arrayList = new ArrayList();
        try {
            if (str.length() >= 10) {
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(0, 4))));
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(5, 7))));
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(8, 10))));
            } else if (str.length() >= 7) {
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(0, 4))));
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(5, 7))));
            } else if (str.length() >= 4) {
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(0, 4))));
            }
            return arrayList;
        } catch (NumberFormatException unused) {
            return new ArrayList();
        }
    }

    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void E(k9.D0.b r9) {
        /*
            r8 = this;
            r0 = 4
            java.lang.String r1 = r8.f31810a
            r1.hashCode()
            r2 = 3
            r3 = 0
            r4 = 2
            r5 = 1
            r6 = -1
            int r7 = r1.hashCode()
            switch(r7) {
                case 82815: goto L_0x0125;
                case 82878: goto L_0x011a;
                case 82897: goto L_0x010f;
                case 83253: goto L_0x0104;
                case 83254: goto L_0x00f9;
                case 83255: goto L_0x00ee;
                case 83341: goto L_0x00e3;
                case 83378: goto L_0x00d8;
                case 83536: goto L_0x00ca;
                case 83552: goto L_0x00bc;
                case 2567331: goto L_0x00ae;
                case 2569357: goto L_0x00a0;
                case 2569891: goto L_0x0092;
                case 2570401: goto L_0x0084;
                case 2570410: goto L_0x0076;
                case 2571565: goto L_0x0068;
                case 2575251: goto L_0x005a;
                case 2581512: goto L_0x004c;
                case 2581513: goto L_0x003e;
                case 2581514: goto L_0x0030;
                case 2583398: goto L_0x0022;
                case 2590194: goto L_0x0014;
                default: goto L_0x0012;
            }
        L_0x0012:
            goto L_0x012f
        L_0x0014:
            java.lang.String r7 = "TYER"
            boolean r1 = r1.equals(r7)
            if (r1 != 0) goto L_0x001e
            goto L_0x012f
        L_0x001e:
            r6 = 21
            goto L_0x012f
        L_0x0022:
            java.lang.String r7 = "TRCK"
            boolean r1 = r1.equals(r7)
            if (r1 != 0) goto L_0x002c
            goto L_0x012f
        L_0x002c:
            r6 = 20
            goto L_0x012f
        L_0x0030:
            java.lang.String r7 = "TPE3"
            boolean r1 = r1.equals(r7)
            if (r1 != 0) goto L_0x003a
            goto L_0x012f
        L_0x003a:
            r6 = 19
            goto L_0x012f
        L_0x003e:
            java.lang.String r7 = "TPE2"
            boolean r1 = r1.equals(r7)
            if (r1 != 0) goto L_0x0048
            goto L_0x012f
        L_0x0048:
            r6 = 18
            goto L_0x012f
        L_0x004c:
            java.lang.String r7 = "TPE1"
            boolean r1 = r1.equals(r7)
            if (r1 != 0) goto L_0x0056
            goto L_0x012f
        L_0x0056:
            r6 = 17
            goto L_0x012f
        L_0x005a:
            java.lang.String r7 = "TIT2"
            boolean r1 = r1.equals(r7)
            if (r1 != 0) goto L_0x0064
            goto L_0x012f
        L_0x0064:
            r6 = 16
            goto L_0x012f
        L_0x0068:
            java.lang.String r7 = "TEXT"
            boolean r1 = r1.equals(r7)
            if (r1 != 0) goto L_0x0072
            goto L_0x012f
        L_0x0072:
            r6 = 15
            goto L_0x012f
        L_0x0076:
            java.lang.String r7 = "TDRL"
            boolean r1 = r1.equals(r7)
            if (r1 != 0) goto L_0x0080
            goto L_0x012f
        L_0x0080:
            r6 = 14
            goto L_0x012f
        L_0x0084:
            java.lang.String r7 = "TDRC"
            boolean r1 = r1.equals(r7)
            if (r1 != 0) goto L_0x008e
            goto L_0x012f
        L_0x008e:
            r6 = 13
            goto L_0x012f
        L_0x0092:
            java.lang.String r7 = "TDAT"
            boolean r1 = r1.equals(r7)
            if (r1 != 0) goto L_0x009c
            goto L_0x012f
        L_0x009c:
            r6 = 12
            goto L_0x012f
        L_0x00a0:
            java.lang.String r7 = "TCOM"
            boolean r1 = r1.equals(r7)
            if (r1 != 0) goto L_0x00aa
            goto L_0x012f
        L_0x00aa:
            r6 = 11
            goto L_0x012f
        L_0x00ae:
            java.lang.String r7 = "TALB"
            boolean r1 = r1.equals(r7)
            if (r1 != 0) goto L_0x00b8
            goto L_0x012f
        L_0x00b8:
            r6 = 10
            goto L_0x012f
        L_0x00bc:
            java.lang.String r7 = "TYE"
            boolean r1 = r1.equals(r7)
            if (r1 != 0) goto L_0x00c6
            goto L_0x012f
        L_0x00c6:
            r6 = 9
            goto L_0x012f
        L_0x00ca:
            java.lang.String r7 = "TXT"
            boolean r1 = r1.equals(r7)
            if (r1 != 0) goto L_0x00d4
            goto L_0x012f
        L_0x00d4:
            r6 = 8
            goto L_0x012f
        L_0x00d8:
            java.lang.String r7 = "TT2"
            boolean r1 = r1.equals(r7)
            if (r1 != 0) goto L_0x00e1
            goto L_0x012f
        L_0x00e1:
            r6 = 7
            goto L_0x012f
        L_0x00e3:
            java.lang.String r7 = "TRK"
            boolean r1 = r1.equals(r7)
            if (r1 != 0) goto L_0x00ec
            goto L_0x012f
        L_0x00ec:
            r6 = 6
            goto L_0x012f
        L_0x00ee:
            java.lang.String r7 = "TP3"
            boolean r1 = r1.equals(r7)
            if (r1 != 0) goto L_0x00f7
            goto L_0x012f
        L_0x00f7:
            r6 = 5
            goto L_0x012f
        L_0x00f9:
            java.lang.String r7 = "TP2"
            boolean r1 = r1.equals(r7)
            if (r1 != 0) goto L_0x0102
            goto L_0x012f
        L_0x0102:
            r6 = r0
            goto L_0x012f
        L_0x0104:
            java.lang.String r7 = "TP1"
            boolean r1 = r1.equals(r7)
            if (r1 != 0) goto L_0x010d
            goto L_0x012f
        L_0x010d:
            r6 = r2
            goto L_0x012f
        L_0x010f:
            java.lang.String r7 = "TDA"
            boolean r1 = r1.equals(r7)
            if (r1 != 0) goto L_0x0118
            goto L_0x012f
        L_0x0118:
            r6 = r4
            goto L_0x012f
        L_0x011a:
            java.lang.String r7 = "TCM"
            boolean r1 = r1.equals(r7)
            if (r1 != 0) goto L_0x0123
            goto L_0x012f
        L_0x0123:
            r6 = r5
            goto L_0x012f
        L_0x0125:
            java.lang.String r7 = "TAL"
            boolean r1 = r1.equals(r7)
            if (r1 != 0) goto L_0x012e
            goto L_0x012f
        L_0x012e:
            r6 = r3
        L_0x012f:
            switch(r6) {
                case 0: goto L_0x0213;
                case 1: goto L_0x020d;
                case 2: goto L_0x01e9;
                case 3: goto L_0x01e3;
                case 4: goto L_0x01dd;
                case 5: goto L_0x01d7;
                case 6: goto L_0x01ae;
                case 7: goto L_0x01a8;
                case 8: goto L_0x01a1;
                case 9: goto L_0x0192;
                case 10: goto L_0x0213;
                case 11: goto L_0x020d;
                case 12: goto L_0x01e9;
                case 13: goto L_0x0163;
                case 14: goto L_0x0134;
                case 15: goto L_0x01a1;
                case 16: goto L_0x01a8;
                case 17: goto L_0x01e3;
                case 18: goto L_0x01dd;
                case 19: goto L_0x01d7;
                case 20: goto L_0x01ae;
                case 21: goto L_0x0192;
                default: goto L_0x0132;
            }
        L_0x0132:
            goto L_0x0218
        L_0x0134:
            java.lang.String r0 = r8.f31822c
            java.util.List r0 = a(r0)
            int r1 = r0.size()
            if (r1 == r5) goto L_0x0158
            if (r1 == r4) goto L_0x014f
            if (r1 == r2) goto L_0x0146
            goto L_0x0218
        L_0x0146:
            java.lang.Object r1 = r0.get(r4)
            java.lang.Integer r1 = (java.lang.Integer) r1
            r9.d0(r1)
        L_0x014f:
            java.lang.Object r1 = r0.get(r5)
            java.lang.Integer r1 = (java.lang.Integer) r1
            r9.e0(r1)
        L_0x0158:
            java.lang.Object r0 = r0.get(r3)
            java.lang.Integer r0 = (java.lang.Integer) r0
            r9.f0(r0)
            goto L_0x0218
        L_0x0163:
            java.lang.String r0 = r8.f31822c
            java.util.List r0 = a(r0)
            int r1 = r0.size()
            if (r1 == r5) goto L_0x0187
            if (r1 == r4) goto L_0x017e
            if (r1 == r2) goto L_0x0175
            goto L_0x0218
        L_0x0175:
            java.lang.Object r1 = r0.get(r4)
            java.lang.Integer r1 = (java.lang.Integer) r1
            r9.a0(r1)
        L_0x017e:
            java.lang.Object r1 = r0.get(r5)
            java.lang.Integer r1 = (java.lang.Integer) r1
            r9.b0(r1)
        L_0x0187:
            java.lang.Object r0 = r0.get(r3)
            java.lang.Integer r0 = (java.lang.Integer) r0
            r9.c0(r0)
            goto L_0x0218
        L_0x0192:
            java.lang.String r0 = r8.f31822c     // Catch:{  }
            int r0 = java.lang.Integer.parseInt(r0)     // Catch:{  }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{  }
            r9.c0(r0)     // Catch:{  }
            goto L_0x0218
        L_0x01a1:
            java.lang.String r0 = r8.f31822c
            r9.n0(r0)
            goto L_0x0218
        L_0x01a8:
            java.lang.String r0 = r8.f31822c
            r9.i0(r0)
            goto L_0x0218
        L_0x01ae:
            java.lang.String r0 = r8.f31822c
            java.lang.String r1 = "/"
            java.lang.String[] r0 = ja.M.R0(r0, r1)
            r1 = r0[r3]     // Catch:{  }
            int r1 = java.lang.Integer.parseInt(r1)     // Catch:{  }
            int r2 = r0.length     // Catch:{  }
            if (r2 <= r5) goto L_0x01ca
            r0 = r0[r5]     // Catch:{  }
            int r0 = java.lang.Integer.parseInt(r0)     // Catch:{  }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{  }
            goto L_0x01cb
        L_0x01ca:
            r0 = 0
        L_0x01cb:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch:{  }
            k9.D0$b r9 = r9.l0(r1)     // Catch:{  }
            r9.k0(r0)     // Catch:{  }
            goto L_0x0218
        L_0x01d7:
            java.lang.String r0 = r8.f31822c
            r9.R(r0)
            goto L_0x0218
        L_0x01dd:
            java.lang.String r0 = r8.f31822c
            r9.K(r0)
            goto L_0x0218
        L_0x01e3:
            java.lang.String r0 = r8.f31822c
            r9.M(r0)
            goto L_0x0218
        L_0x01e9:
            java.lang.String r1 = r8.f31822c     // Catch:{ NumberFormatException -> 0x0218 }
            java.lang.String r0 = r1.substring(r4, r0)     // Catch:{ NumberFormatException -> 0x0218 }
            int r0 = java.lang.Integer.parseInt(r0)     // Catch:{ NumberFormatException -> 0x0218 }
            java.lang.String r1 = r8.f31822c     // Catch:{ NumberFormatException -> 0x0218 }
            java.lang.String r1 = r1.substring(r3, r4)     // Catch:{ NumberFormatException -> 0x0218 }
            int r1 = java.lang.Integer.parseInt(r1)     // Catch:{ NumberFormatException -> 0x0218 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ NumberFormatException -> 0x0218 }
            k9.D0$b r9 = r9.b0(r0)     // Catch:{ NumberFormatException -> 0x0218 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)     // Catch:{ NumberFormatException -> 0x0218 }
            r9.a0(r0)     // Catch:{ NumberFormatException -> 0x0218 }
            goto L_0x0218
        L_0x020d:
            java.lang.String r0 = r8.f31822c
            r9.Q(r0)
            goto L_0x0218
        L_0x0213:
            java.lang.String r0 = r8.f31822c
            r9.L(r0)
        L_0x0218:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: I9.m.E(k9.D0$b):void");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || m.class != obj.getClass()) {
            return false;
        }
        m mVar = (m) obj;
        if (!M.c(this.f31810a, mVar.f31810a) || !M.c(this.f31821b, mVar.f31821b) || !M.c(this.f31822c, mVar.f31822c)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        int i10;
        int hashCode = (527 + this.f31810a.hashCode()) * 31;
        String str = this.f31821b;
        int i11 = 0;
        if (str != null) {
            i10 = str.hashCode();
        } else {
            i10 = 0;
        }
        int i12 = (hashCode + i10) * 31;
        String str2 = this.f31822c;
        if (str2 != null) {
            i11 = str2.hashCode();
        }
        return i12 + i11;
    }

    public String toString() {
        return this.f31810a + ": description=" + this.f31821b + ": value=" + this.f31822c;
    }

    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f31810a);
        parcel.writeString(this.f31821b);
        parcel.writeString(this.f31822c);
    }

    m(Parcel parcel) {
        super((String) M.j(parcel.readString()));
        this.f31821b = parcel.readString();
        this.f31822c = (String) M.j(parcel.readString());
    }
}
