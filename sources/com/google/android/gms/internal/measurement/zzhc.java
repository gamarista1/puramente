package com.google.android.gms.internal.measurement;

import android.util.Log;

final class zzhc extends zzgz<Boolean> {
    zzhc(zzhh zzhh, String str, Boolean bool, boolean z10) {
        super(zzhh, str, bool);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ Object zza(Object obj) {
        if (obj instanceof Boolean) {
            return (Boolean) obj;
        }
        if (obj instanceof String) {
            String str = (String) obj;
            if (zzfy.zzc.matcher(str).matches()) {
                return Boolean.TRUE;
            }
            if (zzfy.zzd.matcher(str).matches()) {
                return Boolean.FALSE;
            }
        }
        String zzb = super.zzb();
        String valueOf = String.valueOf(obj);
        Log.e("PhenotypeFlag", "Invalid boolean value for " + zzb + ": " + valueOf);
        return null;
    }
}
