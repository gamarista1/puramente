package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzaje;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zztd  reason: invalid package */
public final class zztd extends zzaje<zztd, zza> implements zzakr {
    /* access modifiers changed from: private */
    public static final zztd zzc;
    private static volatile zzaky<zztd> zzd;
    private int zze;
    private int zzf;

    /* renamed from: com.google.android.gms.internal.firebase-auth-api.zztd$zza */
    public static final class zza extends zzaje.zza<zztd, zza> implements zzakr {
        private zza() {
            super(zztd.zzc);
        }

        public final zza zza(int i10) {
            zzi();
            ((zztd) this.zza).zza(i10);
            return this;
        }

        /* synthetic */ zza(zztc zztc) {
            this();
        }
    }

    static {
        zztd zztd = new zztd();
        zzc = zztd;
        zzaje.zza(zztd.class, zztd);
    }

    private zztd() {
    }

    public static zza zzc() {
        return (zza) zzc.zzm();
    }

    public final int zza() {
        return this.zze;
    }

    public final int zzb() {
        return this.zzf;
    }

    public static zztd zza(zzaho zzaho, zzaiq zzaiq) {
        return (zztd) zzaje.zza(zzc, zzaho, zzaiq);
    }

    /* access modifiers changed from: protected */
    public final Object zza(int i10, Object obj, Object obj2) {
        switch (zztc.zza[i10 - 1]) {
            case 1:
                return new zztd();
            case 2:
                return new zza((zztc) null);
            case 3:
                return zzaje.zza((zzakp) zzc, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\u000b", new Object[]{"zze", "zzf"});
            case 4:
                return zzc;
            case 5:
                zzaky<zztd> zzaky = zzd;
                if (zzaky == null) {
                    synchronized (zztd.class) {
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
