package com.google.android.gms.internal.play_billing;

public enum zzkn {
    BROADCAST_ACTION_UNSPECIFIED(0),
    PURCHASES_UPDATED_ACTION(1),
    LOCAL_PURCHASES_UPDATED_ACTION(2),
    ALTERNATIVE_BILLING_ACTION(3);
    
    private final int zzf;

    private zzkn(int i10) {
        this.zzf = i10;
    }

    public final String toString() {
        return Integer.toString(this.zzf);
    }
}
