package com.google.android.recaptcha.internal;

import kotlin.jvm.internal.DefaultConstructorMarker;

public final class zzbd {
    public static final zzbc zza = new zzbc((DefaultConstructorMarker) null);
    private String zzb;
    private String zzc;
    private String zzd;

    private zzbd(String str, String str2) {
        this.zzb = str;
        this.zzc = str2;
    }

    public final zzbb zza(zzne zzne) {
        return new zzbb(zzne, this.zzb, this.zzc, this.zzd, (String) null);
    }

    public final zzbd zzb() {
        return new zzbd(this);
    }

    public final zzbd zzc(String str) {
        this.zzd = str;
        return this;
    }

    public final String zzd() {
        return this.zzc;
    }

    public /* synthetic */ zzbd(String str, String str2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2);
    }

    private zzbd(zzbd zzbd) {
        this(zzbd.zzb, zzbd.zzc);
        this.zzd = zzbd.zzd;
    }
}
