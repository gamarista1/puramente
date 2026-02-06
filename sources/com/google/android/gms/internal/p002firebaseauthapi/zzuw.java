package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzaje;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzuw  reason: invalid package */
public final class zzuw extends zzaje<zzuw, zza> implements zzakr {
    /* access modifiers changed from: private */
    public static final zzuw zzc;
    private static volatile zzaky<zzuw> zzd;
    private String zze = "";
    private zzaho zzf = zzaho.zza;
    private int zzg;

    /* renamed from: com.google.android.gms.internal.firebase-auth-api.zzuw$zza */
    public static final class zza extends zzaje.zza<zzuw, zza> implements zzakr {
        private zza() {
            super(zzuw.zzc);
        }

        public final zza zza(zzb zzb) {
            zzi();
            ((zzuw) this.zza).zza(zzb);
            return this;
        }

        /* synthetic */ zza(zzux zzux) {
            this();
        }

        public final zza zza(String str) {
            zzi();
            ((zzuw) this.zza).zza(str);
            return this;
        }

        public final zza zza(zzaho zzaho) {
            zzi();
            ((zzuw) this.zza).zza(zzaho);
            return this;
        }
    }

    static {
        zzuw zzuw = new zzuw();
        zzc = zzuw;
        zzaje.zza(zzuw.class, zzuw);
    }

    private zzuw() {
    }

    public static zza zza() {
        return (zza) zzc.zzm();
    }

    public static zzuw zzd() {
        return zzc;
    }

    public final zzb zzb() {
        zzb zza2 = zzb.zza(this.zzg);
        if (zza2 == null) {
            return zzb.UNRECOGNIZED;
        }
        return zza2;
    }

    public final zzaho zze() {
        return this.zzf;
    }

    public final String zzf() {
        return this.zze;
    }

    /* access modifiers changed from: protected */
    public final Object zza(int i10, Object obj, Object obj2) {
        switch (zzux.zza[i10 - 1]) {
            case 1:
                return new zzuw();
            case 2:
                return new zza((zzux) null);
            case 3:
                return zzaje.zza((zzakp) zzc, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\n\u0003\f", new Object[]{"zze", "zzf", "zzg"});
            case 4:
                return zzc;
            case 5:
                zzaky<zzuw> zzaky = zzd;
                if (zzaky == null) {
                    synchronized (zzuw.class) {
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

    /* renamed from: com.google.android.gms.internal.firebase-auth-api.zzuw$zzb */
    public enum zzb implements zzajg {
        UNKNOWN_KEYMATERIAL(0),
        SYMMETRIC(1),
        ASYMMETRIC_PRIVATE(2),
        ASYMMETRIC_PUBLIC(3),
        REMOTE(4),
        UNRECOGNIZED(-1);
        
        private static final zzajj<zzb> zzg = null;
        private final int zzi;

        static {
            zzg = new zzuy();
        }

        private zzb(int i10) {
            this.zzi = i10;
        }

        public final String toString() {
            StringBuilder sb2 = new StringBuilder("<");
            sb2.append(zzb.class.getName());
            sb2.append('@');
            sb2.append(Integer.toHexString(System.identityHashCode(this)));
            if (this != UNRECOGNIZED) {
                sb2.append(" number=");
                sb2.append(zza());
            }
            sb2.append(" name=");
            sb2.append(name());
            sb2.append('>');
            return sb2.toString();
        }

        public final int zza() {
            if (this != UNRECOGNIZED) {
                return this.zzi;
            }
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }

        public static zzb zza(int i10) {
            if (i10 == 0) {
                return UNKNOWN_KEYMATERIAL;
            }
            if (i10 == 1) {
                return SYMMETRIC;
            }
            if (i10 == 2) {
                return ASYMMETRIC_PRIVATE;
            }
            if (i10 == 3) {
                return ASYMMETRIC_PUBLIC;
            }
            if (i10 != 4) {
                return null;
            }
            return REMOTE;
        }
    }

    /* access modifiers changed from: private */
    public final void zza(zzb zzb2) {
        this.zzg = zzb2.zza();
    }

    /* access modifiers changed from: private */
    public final void zza(String str) {
        str.getClass();
        this.zze = str;
    }

    /* access modifiers changed from: private */
    public final void zza(zzaho zzaho) {
        zzaho.getClass();
        this.zzf = zzaho;
    }
}
