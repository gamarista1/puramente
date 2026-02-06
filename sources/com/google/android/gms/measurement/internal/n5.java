package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.amazon.c.a.a.c;
import com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer;
import java.util.ArrayList;
import java.util.List;
import za.b;

public final class n5 implements Parcelable.Creator {
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
        Boolean bool = null;
        ArrayList arrayList = null;
        String str8 = null;
        String str9 = null;
        String str10 = null;
        long j10 = 0;
        long j11 = 0;
        long j12 = 0;
        long j13 = 0;
        long j14 = 0;
        long j15 = 0;
        long j16 = 0;
        boolean z10 = true;
        boolean z11 = true;
        boolean z12 = false;
        int i10 = 0;
        boolean z13 = false;
        boolean z14 = false;
        int i11 = 0;
        long j17 = -2147483648L;
        String str11 = "";
        String str12 = str11;
        String str13 = str12;
        String str14 = str13;
        int i12 = 100;
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
                    j10 = b.G(parcel2, C10);
                    break;
                case 7:
                    j11 = b.G(parcel2, C10);
                    break;
                case 8:
                    str5 = b.p(parcel2, C10);
                    break;
                case 9:
                    z10 = b.w(parcel2, C10);
                    break;
                case 10:
                    z12 = b.w(parcel2, C10);
                    break;
                case 11:
                    j17 = b.G(parcel2, C10);
                    break;
                case 12:
                    str6 = b.p(parcel2, C10);
                    break;
                case 13:
                    j12 = b.G(parcel2, C10);
                    break;
                case StdKeyDeserializer.TYPE_URL:
                    j13 = b.G(parcel2, C10);
                    break;
                case StdKeyDeserializer.TYPE_CLASS:
                    i10 = b.E(parcel2, C10);
                    break;
                case 16:
                    z11 = b.w(parcel2, C10);
                    break;
                case 18:
                    z13 = b.w(parcel2, C10);
                    break;
                case 19:
                    str7 = b.p(parcel2, C10);
                    break;
                case 21:
                    bool = b.x(parcel2, C10);
                    break;
                case 22:
                    j14 = b.G(parcel2, C10);
                    break;
                case 23:
                    arrayList = b.r(parcel2, C10);
                    break;
                case 24:
                    str8 = b.p(parcel2, C10);
                    break;
                case 25:
                    str11 = b.p(parcel2, C10);
                    break;
                case 26:
                    str12 = b.p(parcel2, C10);
                    break;
                case 27:
                    str9 = b.p(parcel2, C10);
                    break;
                case 28:
                    z14 = b.w(parcel2, C10);
                    break;
                case 29:
                    j15 = b.G(parcel2, C10);
                    break;
                case 30:
                    i12 = b.E(parcel2, C10);
                    break;
                case 31:
                    str13 = b.p(parcel2, C10);
                    break;
                case c.f37660h:
                    i11 = b.E(parcel2, C10);
                    break;
                case 34:
                    j16 = b.G(parcel2, C10);
                    break;
                case 35:
                    str10 = b.p(parcel2, C10);
                    break;
                case 36:
                    str14 = b.p(parcel2, C10);
                    break;
                default:
                    b.K(parcel2, C10);
                    break;
            }
        }
        b.u(parcel2, L10);
        return new E5(str, str2, str3, str4, j10, j11, str5, z10, z12, j17, str6, j12, j13, i10, z11, z13, str7, bool, j14, (List) arrayList, str8, str11, str12, str9, z14, j15, i12, str13, i11, j16, str10, str14);
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new E5[i10];
    }
}
