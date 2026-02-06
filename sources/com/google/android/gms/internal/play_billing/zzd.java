package com.google.android.gms.internal.play_billing;

enum zzd {
    RESPONSE_CODE_UNSPECIFIED(-999),
    SERVICE_TIMEOUT(-3),
    FEATURE_NOT_SUPPORTED(-2),
    SERVICE_DISCONNECTED(-1),
    OK(0),
    USER_CANCELED(1),
    SERVICE_UNAVAILABLE(2),
    BILLING_UNAVAILABLE(3),
    ITEM_UNAVAILABLE(4),
    DEVELOPER_ERROR(5),
    ERROR(6),
    ITEM_ALREADY_OWNED(7),
    ITEM_NOT_OWNED(8),
    EXPIRED_OFFER_TOKEN(11),
    NETWORK_ERROR(12);
    
    private static final zzcr zzp = null;
    private final int zzr;

    static {
        zzcq zzcq = new zzcq();
        for (zzd zzd : values()) {
            zzcq.zza(Integer.valueOf(zzd.zzr), zzd);
        }
        zzp = zzcq.zzb();
    }

    private zzd(int i10) {
        this.zzr = i10;
    }

    static zzd zza(int i10) {
        zzcr zzcr = zzp;
        Integer valueOf = Integer.valueOf(i10);
        if (!zzcr.containsKey(valueOf)) {
            return RESPONSE_CODE_UNSPECIFIED;
        }
        return (zzd) zzcr.get(valueOf);
    }
}
