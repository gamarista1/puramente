package com.google.android.gms.internal.measurement;

import Ha.C4295b;
import Pa.m;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.common.internal.C4536s;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.google.android.gms.internal.measurement.zzdq;

final class zzdp extends zzdq.zza {
    private final /* synthetic */ String zzc;
    private final /* synthetic */ String zzd;
    private final /* synthetic */ Context zze;
    private final /* synthetic */ Bundle zzf;
    private final /* synthetic */ zzdq zzg;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    zzdp(zzdq zzdq, String str, String str2, Context context, Bundle bundle) {
        super(zzdq);
        this.zzc = str;
        this.zzd = str2;
        this.zze = context;
        this.zzf = bundle;
        this.zzg = zzdq;
    }

    public final void zza() {
        String str;
        String str2;
        String str3;
        boolean z10;
        try {
            if (this.zzg.zzc(this.zzc, this.zzd)) {
                str = this.zzd;
                str2 = this.zzc;
                str3 = this.zzg.zzc;
            } else {
                str3 = null;
                str2 = null;
                str = null;
            }
            C4536s.l(this.zze);
            zzdq zzdq = this.zzg;
            zzdq.zzj = zzdq.zza(this.zze, true);
            if (this.zzg.zzj == null) {
                Log.w(this.zzg.zzc, "Failed to connect to measurement client.");
                return;
            }
            int a10 = DynamiteModule.a(this.zze, ModuleDescriptor.MODULE_ID);
            int c10 = DynamiteModule.c(this.zze, ModuleDescriptor.MODULE_ID);
            int max = Math.max(a10, c10);
            if (c10 < a10) {
                z10 = true;
            } else {
                z10 = false;
            }
            ((zzdb) C4536s.l(this.zzg.zzj)).initialize(C4295b.c(this.zze), new zzdo(97001, (long) max, z10, str3, str2, str, this.zzf, m.a(this.zze)), this.zza);
        } catch (Exception e10) {
            this.zzg.zza(e10, true, false);
        }
    }
}
