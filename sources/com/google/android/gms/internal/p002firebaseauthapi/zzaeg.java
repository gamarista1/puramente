package com.google.android.gms.internal.p002firebaseauthapi;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzaeg  reason: invalid package */
final class zzaeg extends zzafx {
    private final String zza;
    private final String zzb;

    zzaeg(String str, String str2) {
        this.zza = str;
        this.zzb = str2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzafx) {
            zzafx zzafx = (zzafx) obj;
            String str = this.zza;
            if (str != null ? str.equals(zzafx.zzb()) : zzafx.zzb() == null) {
                String str2 = this.zzb;
                if (str2 != null ? !str2.equals(zzafx.zza()) : zzafx.zza() != null) {
                    return false;
                }
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        String str = this.zza;
        int i11 = 0;
        if (str == null) {
            i10 = 0;
        } else {
            i10 = str.hashCode();
        }
        int i12 = (i10 ^ 1000003) * 1000003;
        String str2 = this.zzb;
        if (str2 != null) {
            i11 = str2.hashCode();
        }
        return i12 ^ i11;
    }

    public final String toString() {
        String str = this.zza;
        String str2 = this.zzb;
        return "RecaptchaEnforcementState{provider=" + str + ", enforcementState=" + str2 + "}";
    }

    /* access modifiers changed from: package-private */
    public final String zza() {
        return this.zzb;
    }

    /* access modifiers changed from: package-private */
    public final String zzb() {
        return this.zza;
    }
}
