package com.google.android.gms.internal.p002firebaseauthapi;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzuj  reason: invalid package */
public enum zzuj implements zzajg {
    KDF_UNKNOWN(0),
    HKDF_SHA256(1),
    HKDF_SHA384(2),
    HKDF_SHA512(3),
    UNRECOGNIZED(-1);
    
    private static final zzajj<zzuj> zzf = null;
    private final int zzh;

    static {
        zzf = new zzum();
    }

    private zzuj(int i10) {
        this.zzh = i10;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("<");
        sb2.append(zzuj.class.getName());
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
            return this.zzh;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    public static zzuj zza(int i10) {
        if (i10 == 0) {
            return KDF_UNKNOWN;
        }
        if (i10 == 1) {
            return HKDF_SHA256;
        }
        if (i10 == 2) {
            return HKDF_SHA384;
        }
        if (i10 != 3) {
            return null;
        }
        return HKDF_SHA512;
    }
}
