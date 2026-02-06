package ra;

import android.os.Parcelable;

public final class o implements Parcelable.Creator {
    /* JADX WARNING: type inference failed for: r1v3, types: [android.os.Parcelable] */
    /* JADX WARNING: type inference failed for: r1v4, types: [android.os.Parcelable] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel r10) {
        /*
            r9 = this;
            int r0 = za.b.L(r10)
            r1 = 0
            r3 = r1
            r4 = r3
            r5 = r4
            r6 = r5
            r7 = r6
            r8 = r7
        L_0x000b:
            int r1 = r10.dataPosition()
            if (r1 >= r0) goto L_0x0048
            int r1 = za.b.C(r10)
            int r2 = za.b.v(r1)
            switch(r2) {
                case 1: goto L_0x0043;
                case 2: goto L_0x003e;
                case 3: goto L_0x0039;
                case 4: goto L_0x0034;
                case 5: goto L_0x002a;
                case 6: goto L_0x0020;
                default: goto L_0x001c;
            }
        L_0x001c:
            za.b.K(r10, r1)
            goto L_0x000b
        L_0x0020:
            android.os.Parcelable$Creator r2 = android.app.PendingIntent.CREATOR
            android.os.Parcelable r1 = za.b.o(r10, r1, r2)
            r8 = r1
            android.app.PendingIntent r8 = (android.app.PendingIntent) r8
            goto L_0x000b
        L_0x002a:
            android.os.Parcelable$Creator<com.google.android.gms.auth.api.signin.GoogleSignInAccount> r2 = com.google.android.gms.auth.api.signin.GoogleSignInAccount.CREATOR
            android.os.Parcelable r1 = za.b.o(r10, r1, r2)
            r7 = r1
            com.google.android.gms.auth.api.signin.GoogleSignInAccount r7 = (com.google.android.gms.auth.api.signin.GoogleSignInAccount) r7
            goto L_0x000b
        L_0x0034:
            java.util.ArrayList r6 = za.b.r(r10, r1)
            goto L_0x000b
        L_0x0039:
            java.lang.String r5 = za.b.p(r10, r1)
            goto L_0x000b
        L_0x003e:
            java.lang.String r4 = za.b.p(r10, r1)
            goto L_0x000b
        L_0x0043:
            java.lang.String r3 = za.b.p(r10, r1)
            goto L_0x000b
        L_0x0048:
            za.b.u(r10, r0)
            ra.a r10 = new ra.a
            r2 = r10
            r2.<init>(r3, r4, r5, r6, r7, r8)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: ra.o.createFromParcel(android.os.Parcel):java.lang.Object");
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new C5183a[i10];
    }
}
