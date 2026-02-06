package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzaje;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzsz  reason: invalid package */
public final class zzsz extends zzaje<zzsz, zza> implements zzakr {
    /* access modifiers changed from: private */
    public static final zzsz zzc;
    private static volatile zzaky<zzsz> zzd;
    private int zze;
    private int zzf;

    /* renamed from: com.google.android.gms.internal.firebase-auth-api.zzsz$zza */
    public static final class zza extends zzaje.zza<zzsz, zza> implements zzakr {
        private zza() {
            super(zzsz.zzc);
        }

        public final zza zza(int i10) {
            zzi();
            ((zzsz) this.zza).zza(i10);
            return this;
        }

        /* synthetic */ zza(zzsy zzsy) {
            this();
        }
    }

    static {
        zzsz zzsz = new zzsz();
        zzc = zzsz;
        zzaje.zza(zzsz.class, zzsz);
    }

    private zzsz() {
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

    public static zzsz zza(zzaho zzaho, zzaiq zzaiq) {
        return (zzsz) zzaje.zza(zzc, zzaho, zzaiq);
    }

    /* access modifiers changed from: protected */
    public final Object zza(int i10, Object obj, Object obj2) {
        switch (zzsy.zza[i10 - 1]) {
            case 1:
                return new zzsz();
            case 2:
                return new zza((zzsy) null);
            case 3:
                return zzaje.zza((zzakp) zzc, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\u000b", new Object[]{"zzf", "zze"});
            case 4:
                return zzc;
            case 5:
                zzaky<zzsz> zzaky = zzd;
                if (zzaky == null) {
                    synchronized (zzsz.class) {
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
