package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzaje;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzth  reason: invalid package */
public final class zzth extends zzaje<zzth, zza> implements zzakr {
    /* access modifiers changed from: private */
    public static final zzth zzc;
    private static volatile zzaky<zzth> zzd;

    /* renamed from: com.google.android.gms.internal.firebase-auth-api.zzth$zza */
    public static final class zza extends zzaje.zza<zzth, zza> implements zzakr {
        private zza() {
            super(zzth.zzc);
        }

        /* synthetic */ zza(zztg zztg) {
            this();
        }
    }

    static {
        zzth zzth = new zzth();
        zzc = zzth;
        zzaje.zza(zzth.class, zzth);
    }

    private zzth() {
    }

    public static zzth zzb() {
        return zzc;
    }

    public static zzth zza(zzaho zzaho, zzaiq zzaiq) {
        return (zzth) zzaje.zza(zzc, zzaho, zzaiq);
    }

    /* access modifiers changed from: protected */
    public final Object zza(int i10, Object obj, Object obj2) {
        switch (zztg.zza[i10 - 1]) {
            case 1:
                return new zzth();
            case 2:
                return new zza((zztg) null);
            case 3:
                return zzaje.zza((zzakp) zzc, "\u0000\u0000", (Object[]) null);
            case 4:
                return zzc;
            case 5:
                zzaky<zzth> zzaky = zzd;
                if (zzaky == null) {
                    synchronized (zzth.class) {
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
}
