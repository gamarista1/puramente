package qa;

import android.os.Parcelable;

public final class j implements Parcelable.Creator {
    /* JADX WARNING: type inference failed for: r1v14, types: [android.os.Parcelable] */
    /* JADX WARNING: type inference failed for: r1v17, types: [android.os.Parcelable] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel r11) {
        /*
            r10 = this;
            int r0 = za.b.L(r11)
            java.util.HashSet r2 = new java.util.HashSet
            r2.<init>()
            r1 = 0
            r3 = 0
            r4 = r1
            r6 = r4
            r7 = r6
            r8 = r7
            r5 = r3
        L_0x0010:
            int r1 = r11.dataPosition()
            if (r1 >= r0) goto L_0x007d
            int r1 = za.b.C(r11)
            int r9 = za.b.v(r1)
            switch(r9) {
                case 1: goto L_0x0070;
                case 2: goto L_0x0063;
                case 3: goto L_0x0056;
                case 4: goto L_0x0049;
                case 5: goto L_0x0037;
                case 6: goto L_0x0025;
                default: goto L_0x0021;
            }
        L_0x0021:
            za.b.K(r11, r1)
            goto L_0x0010
        L_0x0025:
            android.os.Parcelable$Creator<qa.a> r8 = qa.C5146a.CREATOR
            android.os.Parcelable r1 = za.b.o(r11, r1, r8)
            r8 = r1
            qa.a r8 = (qa.C5146a) r8
            r1 = 6
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r2.add(r1)
            goto L_0x0010
        L_0x0037:
            android.os.Parcelable$Creator r7 = android.app.PendingIntent.CREATOR
            android.os.Parcelable r1 = za.b.o(r11, r1, r7)
            r7 = r1
            android.app.PendingIntent r7 = (android.app.PendingIntent) r7
            r1 = 5
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r2.add(r1)
            goto L_0x0010
        L_0x0049:
            byte[] r6 = za.b.g(r11, r1)
            r1 = 4
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r2.add(r1)
            goto L_0x0010
        L_0x0056:
            int r5 = za.b.E(r11, r1)
            r1 = 3
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r2.add(r1)
            goto L_0x0010
        L_0x0063:
            java.lang.String r4 = za.b.p(r11, r1)
            r1 = 2
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r2.add(r1)
            goto L_0x0010
        L_0x0070:
            int r3 = za.b.E(r11, r1)
            r1 = 1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r2.add(r1)
            goto L_0x0010
        L_0x007d:
            int r1 = r11.dataPosition()
            if (r1 != r0) goto L_0x008a
            qa.i r11 = new qa.i
            r1 = r11
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)
            return r11
        L_0x008a:
            za.b$a r1 = new za.b$a
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Overread allowed size end="
            r2.append(r3)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r1.<init>(r0, r11)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: qa.j.createFromParcel(android.os.Parcel):java.lang.Object");
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new i[i10];
    }
}
