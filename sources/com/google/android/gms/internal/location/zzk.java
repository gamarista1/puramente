package com.google.android.gms.internal.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C4520d;
import com.google.android.gms.location.Y;
import java.util.List;
import za.b;

public final class zzk implements Parcelable.Creator<zzj> {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int L10 = b.L(parcel);
        Y y10 = zzj.zzb;
        List<C4520d> list = zzj.zza;
        String str = null;
        while (parcel.dataPosition() < L10) {
            int C10 = b.C(parcel);
            int v10 = b.v(C10);
            if (v10 == 1) {
                y10 = (Y) b.o(parcel, C10, Y.CREATOR);
            } else if (v10 == 2) {
                list = b.t(parcel, C10, C4520d.CREATOR);
            } else if (v10 != 3) {
                b.K(parcel, C10);
            } else {
                str = b.p(parcel, C10);
            }
        }
        b.u(parcel, L10);
        return new zzj(y10, list, str);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i10) {
        return new zzj[i10];
    }
}
