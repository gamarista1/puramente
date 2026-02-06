package com.google.android.gms.internal.measurement;

import android.content.Context;
import nb.u;

final class zzgh extends zzhg {
    private final Context zza;
    private final u zzb;

    zzgh(Context context, u uVar) {
        if (context != null) {
            this.zza = context;
            this.zzb = uVar;
            return;
        }
        throw new NullPointerException("Null context");
    }

    public final boolean equals(Object obj) {
        u uVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzhg) {
            zzhg zzhg = (zzhg) obj;
            if (!this.zza.equals(zzhg.zza()) || ((uVar = this.zzb) != null ? !uVar.equals(zzhg.zzb()) : zzhg.zzb() != null)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int hashCode = (this.zza.hashCode() ^ 1000003) * 1000003;
        u uVar = this.zzb;
        if (uVar == null) {
            i10 = 0;
        } else {
            i10 = uVar.hashCode();
        }
        return hashCode ^ i10;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.zza);
        String valueOf2 = String.valueOf(this.zzb);
        return "FlagsContext{context=" + valueOf + ", hermeticFileOverrides=" + valueOf2 + "}";
    }

    /* access modifiers changed from: package-private */
    public final Context zza() {
        return this.zza;
    }

    /* access modifiers changed from: package-private */
    public final u zzb() {
        return this.zzb;
    }
}
