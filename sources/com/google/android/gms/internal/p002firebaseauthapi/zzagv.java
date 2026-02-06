package com.google.android.gms.internal.p002firebaseauthapi;

import android.os.Parcel;
import android.os.Parcelable;
import com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer;
import za.b;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzagv  reason: invalid package */
public final class zzagv implements Parcelable.Creator<zzags> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int L10 = b.L(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        String str8 = null;
        String str9 = null;
        String str10 = null;
        String str11 = null;
        String str12 = null;
        String str13 = null;
        boolean z10 = false;
        boolean z11 = false;
        boolean z12 = false;
        while (parcel.dataPosition() < L10) {
            int C10 = b.C(parcel);
            switch (b.v(C10)) {
                case 2:
                    str = b.p(parcel2, C10);
                    break;
                case 3:
                    str2 = b.p(parcel2, C10);
                    break;
                case 4:
                    str3 = b.p(parcel2, C10);
                    break;
                case 5:
                    str4 = b.p(parcel2, C10);
                    break;
                case 6:
                    str5 = b.p(parcel2, C10);
                    break;
                case 7:
                    str6 = b.p(parcel2, C10);
                    break;
                case 8:
                    str7 = b.p(parcel2, C10);
                    break;
                case 9:
                    str8 = b.p(parcel2, C10);
                    break;
                case 10:
                    z10 = b.w(parcel2, C10);
                    break;
                case 11:
                    z11 = b.w(parcel2, C10);
                    break;
                case 12:
                    str9 = b.p(parcel2, C10);
                    break;
                case 13:
                    str10 = b.p(parcel2, C10);
                    break;
                case StdKeyDeserializer.TYPE_URL:
                    str11 = b.p(parcel2, C10);
                    break;
                case StdKeyDeserializer.TYPE_CLASS:
                    str12 = b.p(parcel2, C10);
                    break;
                case 16:
                    z12 = b.w(parcel2, C10);
                    break;
                case 17:
                    str13 = b.p(parcel2, C10);
                    break;
                default:
                    b.K(parcel2, C10);
                    break;
            }
        }
        b.u(parcel2, L10);
        return new zzags(str, str2, str3, str4, str5, str6, str7, str8, z10, z11, str9, str10, str11, str12, z12, str13);
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new zzags[i10];
    }
}
