package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzaje;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzsb  reason: invalid package */
public final class zzsb extends zzaje<zzsb, zza> implements zzakr {
    /* access modifiers changed from: private */
    public static final zzsb zzc;
    private static volatile zzaky<zzsb> zzd;
    private int zze;

    /* renamed from: com.google.android.gms.internal.firebase-auth-api.zzsb$zza */
    public static final class zza extends zzaje.zza<zzsb, zza> implements zzakr {
        private zza() {
            super(zzsb.zzc);
        }

        public final zza zza(int i10) {
            zzi();
            ((zzsb) this.zza).zza(i10);
            return this;
        }

        /* synthetic */ zza(zzsa zzsa) {
            this();
        }
    }

    static {
        zzsb zzsb = new zzsb();
        zzc = zzsb;
        zzaje.zza(zzsb.class, zzsb);
    }

    private zzsb() {
    }

    public static zza zzb() {
        return (zza) zzc.zzm();
    }

    public static zzsb zzd() {
        return zzc;
    }

    public final int zza() {
        return this.zze;
    }

    /* access modifiers changed from: protected */
    public final Object zza(int i10, Object obj, Object obj2) {
        switch (zzsa.zza[i10 - 1]) {
            case 1:
                return new zzsb();
            case 2:
                return new zza((zzsa) null);
            case 3:
                return zzaje.zza((zzakp) zzc, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[]{"zze"});
            case 4:
                return zzc;
            case 5:
                zzaky<zzsb> zzaky = zzd;
                if (zzaky == null) {
                    synchronized (zzsb.class) {
                        try {
                            zzaky = zzd;
                            if (zzaky == null) {
                                zzaky = new zzaje.zzc<>(zzc);
                                zzd = zzaky;
                            }
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                }
                return zzaky;
            case 6:
                return (byte) 1;
            case 7:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
    }

    /* access modifiers changed from: private */
    public final void zza(int i10) {
        this.zze = i10;
    }
}
