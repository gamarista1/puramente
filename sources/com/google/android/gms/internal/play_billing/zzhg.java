package com.google.android.gms.internal.play_billing;

import com.google.android.gms.internal.play_billing.zzhg;
import com.google.android.gms.internal.play_billing.zzhk;

public class zzhg<MessageType extends zzhk<MessageType, BuilderType>, BuilderType extends zzhg<MessageType, BuilderType>> extends zzfu<MessageType, BuilderType> {
    protected zzhk zza;
    private final zzhk zzb;

    protected zzhg(MessageType messagetype) {
        this.zzb = messagetype;
        if (!messagetype.zzA()) {
            this.zza = messagetype.zzp();
            return;
        }
        throw new IllegalArgumentException("Default instance must be immutable.");
    }

    private static void zza(Object obj, Object obj2) {
        zziu.zza().zzb(obj.getClass()).zzg(obj, obj2);
    }

    /* renamed from: zzd */
    public final zzhg zzb() {
        zzhg zzhg = (zzhg) this.zzb.zzd(5, (Object) null, (Object) null);
        zzhg.zza = zzh();
        return zzhg;
    }

    public final zzhg zze(zzhk zzhk) {
        if (!this.zzb.equals(zzhk)) {
            if (!this.zza.zzA()) {
                zzk();
            }
            zza(this.zza, zzhk);
        }
        return this;
    }

    public final MessageType zzf() {
        MessageType zzg = zzh();
        if (zzhk.zzz(zzg, true)) {
            return zzg;
        }
        throw new zzji(zzg);
    }

    /* renamed from: zzg */
    public MessageType zzh() {
        if (!this.zza.zzA()) {
            return this.zza;
        }
        this.zza.zzv();
        return this.zza;
    }

    public final /* bridge */ /* synthetic */ zzim zzi() {
        throw null;
    }

    /* access modifiers changed from: protected */
    public final void zzj() {
        if (!this.zza.zzA()) {
            zzk();
        }
    }

    /* access modifiers changed from: protected */
    public void zzk() {
        zzhk zzp = this.zzb.zzp();
        zza(zzp, this.zza);
        this.zza = zzp;
    }

    public final boolean zzl() {
        return zzhk.zzz(this.zza, false);
    }
}
