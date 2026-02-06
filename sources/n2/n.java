package N2;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.common.collect.C4770v;
import i2.C2076a;
import i2.L;
import java.util.ArrayList;
import java.util.List;

public final class n extends i {
    public static final Parcelable.Creator<n> CREATOR = new a();

    /* renamed from: b  reason: collision with root package name */
    public final String f4430b;

    /* renamed from: c  reason: collision with root package name */
    public final String f4431c;

    /* renamed from: d  reason: collision with root package name */
    public final C4770v f4432d;

    class a implements Parcelable.Creator {
        a() {
        }

        /* renamed from: a */
        public n createFromParcel(Parcel parcel) {
            return new n(parcel, (a) null);
        }

        /* renamed from: b */
        public n[] newArray(int i10) {
            return new n[i10];
        }
    }

    /* synthetic */ n(Parcel parcel, a aVar) {
        this(parcel);
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
    public void P(f2.y.b r9) {
        /*
            r8 = this;
            r0 = 4
            java.lang.String r1 = r8.f4418a
            r1.hashCode()
            r2 = 3
            r3 = 2
            r4 = 1
            r5 = 0
            r6 = -1
            int r7 = r1.hashCode()
            switch(r7) {
                case 82815: goto L_0x0133;
                case 82878: goto L_0x0128;
                case 82897: goto L_0x011d;
                case 83253: goto L_0x0112;
                case 83254: goto L_0x0107;
                case 83255: goto L_0x00fc;
                case 83341: goto L_0x00f1;
                case 83378: goto L_0x00e6;
                case 83536: goto L_0x00d8;
                case 83552: goto L_0x00ca;
                case 2567331: goto L_0x00bc;
                case 2569357: goto L_0x00ae;
                case 2569358: goto L_0x00a0;
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
            goto L_0x013d
        L_0x0014:
            java.lang.String r7 = "TYER"
            boolean r1 = r1.equals(r7)
            if (r1 != 0) goto L_0x001e
            goto L_0x013d
        L_0x001e:
            r6 = 22
            goto L_0x013d
        L_0x0022:
            java.lang.String r7 = "TRCK"
            boolean r1 = r1.equals(r7)
            if (r1 != 0) goto L_0x002c
            goto L_0x013d
        L_0x002c:
            r6 = 21
            goto L_0x013d
        L_0x0030:
            java.lang.String r7 = "TPE3"
            boolean r1 = r1.equals(r7)
            if (r1 != 0) goto L_0x003a
            goto L_0x013d
        L_0x003a:
            r6 = 20
            goto L_0x013d
        L_0x003e:
            java.lang.String r7 = "TPE2"
            boolean r1 = r1.equals(r7)
            if (r1 != 0) goto L_0x0048
            goto L_0x013d
        L_0x0048:
            r6 = 19
            goto L_0x013d
        L_0x004c:
            java.lang.String r7 = "TPE1"
            boolean r1 = r1.equals(r7)
            if (r1 != 0) goto L_0x0056
            goto L_0x013d
        L_0x0056:
            r6 = 18
            goto L_0x013d
        L_0x005a:
            java.lang.String r7 = "TIT2"
            boolean r1 = r1.equals(r7)
            if (r1 != 0) goto L_0x0064
            goto L_0x013d
        L_0x0064:
            r6 = 17
            goto L_0x013d
        L_0x0068:
            java.lang.String r7 = "TEXT"
            boolean r1 = r1.equals(r7)
            if (r1 != 0) goto L_0x0072
            goto L_0x013d
        L_0x0072:
            r6 = 16
            goto L_0x013d
        L_0x0076:
            java.lang.String r7 = "TDRL"
            boolean r1 = r1.equals(r7)
            if (r1 != 0) goto L_0x0080
            goto L_0x013d
        L_0x0080:
            r6 = 15
            goto L_0x013d
        L_0x0084:
            java.lang.String r7 = "TDRC"
            boolean r1 = r1.equals(r7)
            if (r1 != 0) goto L_0x008e
            goto L_0x013d
        L_0x008e:
            r6 = 14
            goto L_0x013d
        L_0x0092:
            java.lang.String r7 = "TDAT"
            boolean r1 = r1.equals(r7)
            if (r1 != 0) goto L_0x009c
            goto L_0x013d
        L_0x009c:
            r6 = 13
            goto L_0x013d
        L_0x00a0:
            java.lang.String r7 = "TCON"
            boolean r1 = r1.equals(r7)
            if (r1 != 0) goto L_0x00aa
            goto L_0x013d
        L_0x00aa:
            r6 = 12
            goto L_0x013d
        L_0x00ae:
            java.lang.String r7 = "TCOM"
            boolean r1 = r1.equals(r7)
            if (r1 != 0) goto L_0x00b8
            goto L_0x013d
        L_0x00b8:
            r6 = 11
            goto L_0x013d
        L_0x00bc:
            java.lang.String r7 = "TALB"
            boolean r1 = r1.equals(r7)
            if (r1 != 0) goto L_0x00c6
            goto L_0x013d
        L_0x00c6:
            r6 = 10
            goto L_0x013d
        L_0x00ca:
            java.lang.String r7 = "TYE"
            boolean r1 = r1.equals(r7)
            if (r1 != 0) goto L_0x00d4
            goto L_0x013d
        L_0x00d4:
            r6 = 9
            goto L_0x013d
        L_0x00d8:
            java.lang.String r7 = "TXT"
            boolean r1 = r1.equals(r7)
            if (r1 != 0) goto L_0x00e2
            goto L_0x013d
        L_0x00e2:
            r6 = 8
            goto L_0x013d
        L_0x00e6:
            java.lang.String r7 = "TT2"
            boolean r1 = r1.equals(r7)
            if (r1 != 0) goto L_0x00ef
            goto L_0x013d
        L_0x00ef:
            r6 = 7
            goto L_0x013d
        L_0x00f1:
            java.lang.String r7 = "TRK"
            boolean r1 = r1.equals(r7)
            if (r1 != 0) goto L_0x00fa
            goto L_0x013d
        L_0x00fa:
            r6 = 6
            goto L_0x013d
        L_0x00fc:
            java.lang.String r7 = "TP3"
            boolean r1 = r1.equals(r7)
            if (r1 != 0) goto L_0x0105
            goto L_0x013d
        L_0x0105:
            r6 = 5
            goto L_0x013d
        L_0x0107:
            java.lang.String r7 = "TP2"
            boolean r1 = r1.equals(r7)
            if (r1 != 0) goto L_0x0110
            goto L_0x013d
        L_0x0110:
            r6 = r0
            goto L_0x013d
        L_0x0112:
            java.lang.String r7 = "TP1"
            boolean r1 = r1.equals(r7)
            if (r1 != 0) goto L_0x011b
            goto L_0x013d
        L_0x011b:
            r6 = r2
            goto L_0x013d
        L_0x011d:
            java.lang.String r7 = "TDA"
            boolean r1 = r1.equals(r7)
            if (r1 != 0) goto L_0x0126
            goto L_0x013d
        L_0x0126:
            r6 = r3
            goto L_0x013d
        L_0x0128:
            java.lang.String r7 = "TCM"
            boolean r1 = r1.equals(r7)
            if (r1 != 0) goto L_0x0131
            goto L_0x013d
        L_0x0131:
            r6 = r4
            goto L_0x013d
        L_0x0133:
            java.lang.String r7 = "TAL"
            boolean r1 = r1.equals(r7)
            if (r1 != 0) goto L_0x013c
            goto L_0x013d
        L_0x013c:
            r6 = r5
        L_0x013d:
            switch(r6) {
                case 0: goto L_0x028c;
                case 1: goto L_0x0280;
                case 2: goto L_0x0258;
                case 3: goto L_0x024c;
                case 4: goto L_0x0240;
                case 5: goto L_0x0234;
                case 6: goto L_0x0205;
                case 7: goto L_0x01f8;
                case 8: goto L_0x01eb;
                case 9: goto L_0x01d6;
                case 10: goto L_0x028c;
                case 11: goto L_0x0280;
                case 12: goto L_0x01ac;
                case 13: goto L_0x0258;
                case 14: goto L_0x0177;
                case 15: goto L_0x0142;
                case 16: goto L_0x01eb;
                case 17: goto L_0x01f8;
                case 18: goto L_0x024c;
                case 19: goto L_0x0240;
                case 20: goto L_0x0234;
                case 21: goto L_0x0205;
                case 22: goto L_0x01d6;
                default: goto L_0x0140;
            }
        L_0x0140:
            goto L_0x0297
        L_0x0142:
            com.google.common.collect.v r0 = r8.f4432d
            java.lang.Object r0 = r0.get(r5)
            java.lang.String r0 = (java.lang.String) r0
            java.util.List r0 = a(r0)
            int r1 = r0.size()
            if (r1 == r4) goto L_0x016c
            if (r1 == r3) goto L_0x0163
            if (r1 == r2) goto L_0x015a
            goto L_0x0297
        L_0x015a:
            java.lang.Object r1 = r0.get(r3)
            java.lang.Integer r1 = (java.lang.Integer) r1
            r9.i0(r1)
        L_0x0163:
            java.lang.Object r1 = r0.get(r4)
            java.lang.Integer r1 = (java.lang.Integer) r1
            r9.j0(r1)
        L_0x016c:
            java.lang.Object r0 = r0.get(r5)
            java.lang.Integer r0 = (java.lang.Integer) r0
            r9.k0(r0)
            goto L_0x0297
        L_0x0177:
            com.google.common.collect.v r0 = r8.f4432d
            java.lang.Object r0 = r0.get(r5)
            java.lang.String r0 = (java.lang.String) r0
            java.util.List r0 = a(r0)
            int r1 = r0.size()
            if (r1 == r4) goto L_0x01a1
            if (r1 == r3) goto L_0x0198
            if (r1 == r2) goto L_0x018f
            goto L_0x0297
        L_0x018f:
            java.lang.Object r1 = r0.get(r3)
            java.lang.Integer r1 = (java.lang.Integer) r1
            r9.f0(r1)
        L_0x0198:
            java.lang.Object r1 = r0.get(r4)
            java.lang.Integer r1 = (java.lang.Integer) r1
            r9.g0(r1)
        L_0x01a1:
            java.lang.Object r0 = r0.get(r5)
            java.lang.Integer r0 = (java.lang.Integer) r0
            r9.h0(r0)
            goto L_0x0297
        L_0x01ac:
            com.google.common.collect.v r0 = r8.f4432d
            java.lang.Object r0 = r0.get(r5)
            java.lang.String r0 = (java.lang.String) r0
            java.lang.Integer r0 = com.google.common.primitives.f.o(r0)
            if (r0 != 0) goto L_0x01c7
            com.google.common.collect.v r0 = r8.f4432d
            java.lang.Object r0 = r0.get(r5)
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            r9.b0(r0)
            goto L_0x0297
        L_0x01c7:
            int r0 = r0.intValue()
            java.lang.String r0 = N2.j.a(r0)
            if (r0 == 0) goto L_0x0297
            r9.b0(r0)
            goto L_0x0297
        L_0x01d6:
            com.google.common.collect.v r0 = r8.f4432d     // Catch:{  }
            java.lang.Object r0 = r0.get(r5)     // Catch:{  }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{  }
            int r0 = java.lang.Integer.parseInt(r0)     // Catch:{  }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{  }
            r9.h0(r0)     // Catch:{  }
            goto L_0x0297
        L_0x01eb:
            com.google.common.collect.v r0 = r8.f4432d
            java.lang.Object r0 = r0.get(r5)
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            r9.r0(r0)
            goto L_0x0297
        L_0x01f8:
            com.google.common.collect.v r0 = r8.f4432d
            java.lang.Object r0 = r0.get(r5)
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            r9.n0(r0)
            goto L_0x0297
        L_0x0205:
            com.google.common.collect.v r0 = r8.f4432d
            java.lang.Object r0 = r0.get(r5)
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r1 = "/"
            java.lang.String[] r0 = i2.L.a1(r0, r1)
            r1 = r0[r5]     // Catch:{  }
            int r1 = java.lang.Integer.parseInt(r1)     // Catch:{  }
            int r2 = r0.length     // Catch:{  }
            if (r2 <= r4) goto L_0x0227
            r0 = r0[r4]     // Catch:{  }
            int r0 = java.lang.Integer.parseInt(r0)     // Catch:{  }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{  }
            goto L_0x0228
        L_0x0227:
            r0 = 0
        L_0x0228:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch:{  }
            f2.y$b r9 = r9.q0(r1)     // Catch:{  }
            r9.p0(r0)     // Catch:{  }
            goto L_0x0297
        L_0x0234:
            com.google.common.collect.v r0 = r8.f4432d
            java.lang.Object r0 = r0.get(r5)
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            r9.U(r0)
            goto L_0x0297
        L_0x0240:
            com.google.common.collect.v r0 = r8.f4432d
            java.lang.Object r0 = r0.get(r5)
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            r9.N(r0)
            goto L_0x0297
        L_0x024c:
            com.google.common.collect.v r0 = r8.f4432d
            java.lang.Object r0 = r0.get(r5)
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            r9.P(r0)
            goto L_0x0297
        L_0x0258:
            com.google.common.collect.v r1 = r8.f4432d     // Catch:{ NumberFormatException -> 0x0297 }
            java.lang.Object r1 = r1.get(r5)     // Catch:{ NumberFormatException -> 0x0297 }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ NumberFormatException -> 0x0297 }
            java.lang.String r0 = r1.substring(r3, r0)     // Catch:{ NumberFormatException -> 0x0297 }
            int r0 = java.lang.Integer.parseInt(r0)     // Catch:{ NumberFormatException -> 0x0297 }
            java.lang.String r1 = r1.substring(r5, r3)     // Catch:{ NumberFormatException -> 0x0297 }
            int r1 = java.lang.Integer.parseInt(r1)     // Catch:{ NumberFormatException -> 0x0297 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ NumberFormatException -> 0x0297 }
            f2.y$b r9 = r9.g0(r0)     // Catch:{ NumberFormatException -> 0x0297 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)     // Catch:{ NumberFormatException -> 0x0297 }
            r9.f0(r0)     // Catch:{ NumberFormatException -> 0x0297 }
            goto L_0x0297
        L_0x0280:
            com.google.common.collect.v r0 = r8.f4432d
            java.lang.Object r0 = r0.get(r5)
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            r9.T(r0)
            goto L_0x0297
        L_0x028c:
            com.google.common.collect.v r0 = r8.f4432d
            java.lang.Object r0 = r0.get(r5)
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            r9.O(r0)
        L_0x0297:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: N2.n.P(f2.y$b):void");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || n.class != obj.getClass()) {
            return false;
        }
        n nVar = (n) obj;
        if (!L.c(this.f4418a, nVar.f4418a) || !L.c(this.f4430b, nVar.f4430b) || !this.f4432d.equals(nVar.f4432d)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        int i10;
        int hashCode = (527 + this.f4418a.hashCode()) * 31;
        String str = this.f4430b;
        if (str != null) {
            i10 = str.hashCode();
        } else {
            i10 = 0;
        }
        return ((hashCode + i10) * 31) + this.f4432d.hashCode();
    }

    public String toString() {
        return this.f4418a + ": description=" + this.f4430b + ": values=" + this.f4432d;
    }

    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f4418a);
        parcel.writeString(this.f4430b);
        parcel.writeStringArray((String[]) this.f4432d.toArray(new String[0]));
    }

    public n(String str, String str2, List list) {
        super(str);
        C2076a.a(!list.isEmpty());
        this.f4430b = str2;
        C4770v z10 = C4770v.z(list);
        this.f4432d = z10;
        this.f4431c = (String) z10.get(0);
    }

    private n(Parcel parcel) {
        this((String) C2076a.e(parcel.readString()), parcel.readString(), C4770v.A((String[]) C2076a.e(parcel.createStringArray())));
    }
}
