package com.google.android.gms.auth.api.identity;

import android.os.Parcelable;

public final class a implements Parcelable.Creator {
    /* JADX WARNING: type inference failed for: r1v3, types: [android.os.Parcelable] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel r15) {
        /*
            r14 = this;
            int r0 = za.b.L(r15)
            r1 = 0
            r2 = 0
            r6 = r1
            r7 = r6
            r11 = r7
            r13 = r11
            r4 = r2
            r5 = r4
            r8 = r5
            r9 = r8
            r10 = r9
            r12 = r10
        L_0x0010:
            int r1 = r15.dataPosition()
            if (r1 >= r0) goto L_0x005e
            int r1 = za.b.C(r15)
            int r2 = za.b.v(r1)
            switch(r2) {
                case 1: goto L_0x0057;
                case 2: goto L_0x0052;
                case 3: goto L_0x004d;
                case 4: goto L_0x0048;
                case 5: goto L_0x003e;
                case 6: goto L_0x0039;
                case 7: goto L_0x0034;
                case 8: goto L_0x002f;
                case 9: goto L_0x002a;
                case 10: goto L_0x0025;
                default: goto L_0x0021;
            }
        L_0x0021:
            za.b.K(r15, r1)
            goto L_0x0010
        L_0x0025:
            boolean r13 = za.b.w(r15, r1)
            goto L_0x0010
        L_0x002a:
            android.os.Bundle r12 = za.b.f(r15, r1)
            goto L_0x0010
        L_0x002f:
            boolean r11 = za.b.w(r15, r1)
            goto L_0x0010
        L_0x0034:
            java.lang.String r10 = za.b.p(r15, r1)
            goto L_0x0010
        L_0x0039:
            java.lang.String r9 = za.b.p(r15, r1)
            goto L_0x0010
        L_0x003e:
            android.os.Parcelable$Creator r2 = android.accounts.Account.CREATOR
            android.os.Parcelable r1 = za.b.o(r15, r1, r2)
            r8 = r1
            android.accounts.Account r8 = (android.accounts.Account) r8
            goto L_0x0010
        L_0x0048:
            boolean r7 = za.b.w(r15, r1)
            goto L_0x0010
        L_0x004d:
            boolean r6 = za.b.w(r15, r1)
            goto L_0x0010
        L_0x0052:
            java.lang.String r5 = za.b.p(r15, r1)
            goto L_0x0010
        L_0x0057:
            android.os.Parcelable$Creator<com.google.android.gms.common.api.Scope> r2 = com.google.android.gms.common.api.Scope.CREATOR
            java.util.ArrayList r4 = za.b.t(r15, r1, r2)
            goto L_0x0010
        L_0x005e:
            za.b.u(r15, r0)
            com.google.android.gms.auth.api.identity.AuthorizationRequest r15 = new com.google.android.gms.auth.api.identity.AuthorizationRequest
            r3 = r15
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.auth.api.identity.a.createFromParcel(android.os.Parcel):java.lang.Object");
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new AuthorizationRequest[i10];
    }
}
