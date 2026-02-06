package com.google.android.gms.internal.play_billing;

import android.os.Parcel;

public abstract class zzaw extends zzar implements zzax {
    public zzaw() {
        super("com.google.android.apps.play.billingtestcompanion.aidl.IBillingOverrideServiceCallback");
    }

    /* access modifiers changed from: protected */
    public final boolean zzb(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 != 1) {
            return false;
        }
        int readInt = parcel.readInt();
        zzas.zzb(parcel);
        zza(readInt);
        return true;
    }
}
