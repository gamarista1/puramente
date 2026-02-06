package com.google.android.gms.internal.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer;
import com.google.android.gms.common.internal.C4520d;
import com.google.android.gms.location.LocationRequest;
import java.util.ArrayList;
import za.b;

public final class zzbb implements Parcelable.Creator<zzba> {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int L10 = b.L(parcel);
        ArrayList arrayList = zzba.zza;
        LocationRequest locationRequest = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        boolean z10 = false;
        boolean z11 = false;
        boolean z12 = false;
        boolean z13 = false;
        boolean z14 = false;
        long j10 = Long.MAX_VALUE;
        while (parcel.dataPosition() < L10) {
            int C10 = b.C(parcel);
            int v10 = b.v(C10);
            if (v10 != 1) {
                switch (v10) {
                    case 5:
                        arrayList = b.t(parcel2, C10, C4520d.CREATOR);
                        break;
                    case 6:
                        str = b.p(parcel2, C10);
                        break;
                    case 7:
                        z10 = b.w(parcel2, C10);
                        break;
                    case 8:
                        z11 = b.w(parcel2, C10);
                        break;
                    case 9:
                        z12 = b.w(parcel2, C10);
                        break;
                    case 10:
                        str2 = b.p(parcel2, C10);
                        break;
                    case 11:
                        z13 = b.w(parcel2, C10);
                        break;
                    case 12:
                        z14 = b.w(parcel2, C10);
                        break;
                    case 13:
                        str3 = b.p(parcel2, C10);
                        break;
                    case StdKeyDeserializer.TYPE_URL:
                        j10 = b.G(parcel2, C10);
                        break;
                    default:
                        b.K(parcel2, C10);
                        break;
                }
            } else {
                locationRequest = (LocationRequest) b.o(parcel2, C10, LocationRequest.CREATOR);
            }
        }
        b.u(parcel2, L10);
        return new zzba(locationRequest, arrayList, str, z10, z11, z12, str2, z13, z14, str3, j10);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i10) {
        return new zzba[i10];
    }
}
