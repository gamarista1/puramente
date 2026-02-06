package com.google.android.gms.internal.play_billing;

import android.os.Bundle;
import android.os.Parcel;

public abstract class zzz extends zzar implements zzaa {
    public zzz() {
        super("com.android.vending.billing.IInAppBillingCreateExternalPaymentReportingDetailsCallback");
    }

    /* access modifiers changed from: protected */
    public final boolean zzb(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 != 1) {
            return false;
        }
        zzas.zzb(parcel);
        zza((Bundle) zzas.zza(parcel, Bundle.CREATOR));
        return true;
    }
}
