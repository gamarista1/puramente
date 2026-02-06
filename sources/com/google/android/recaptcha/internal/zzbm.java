package com.google.android.recaptcha.internal;

import Ug.C5600w0;
import Ug.K;
import Ug.M;
import android.content.Context;
import java.util.ArrayList;
import java.util.List;
import java.util.Timer;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mf.C6565s;
import qf.C6658d;
import qf.g;

public final class zzbm implements zzbh {
    public static final zzbi zza = new zzbi((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */
    public static Timer zzb;
    private final zzbn zzc;
    /* access modifiers changed from: private */
    public final K zzd;
    /* access modifiers changed from: private */
    public final zzaz zze;

    public zzbm(Context context, zzbn zzbn, K k10) {
        this.zzc = zzbn;
        this.zzd = k10;
        zzaz zzaz = null;
        try {
            zzaz zzc2 = zzaz.zzc;
            zzc2 = zzc2 == null ? new zzaz(context, (DefaultConstructorMarker) null) : zzc2;
            zzaz.zzc = zzc2;
            zzaz = zzc2;
        } catch (Exception unused) {
        }
        this.zze = zzaz;
        zzh();
    }

    /* access modifiers changed from: private */
    public final void zzg() {
        zzaz zzaz;
        zzaz zzaz2 = this.zze;
        if (zzaz2 != null) {
            for (List<zzba> it : C6565s.l1(zzaz2.zzd(), 20, 20, true)) {
                zznh zzi = zzni.zzi();
                ArrayList arrayList = new ArrayList();
                for (zzba zzba : it) {
                    try {
                        zzpd zzk = zzpd.zzk(zzfy.zzg().zzj(zzba.zzc()));
                        int zzJ = zzk.zzJ();
                        int i10 = zzJ - 1;
                        if (zzJ != 0) {
                            if (i10 == 0) {
                                zzi.zzp(zzk.zzf());
                            } else if (i10 == 1) {
                                zzi.zzq(zzk.zzg());
                            }
                            arrayList.add(zzba);
                        } else {
                            throw null;
                        }
                    } catch (Exception unused) {
                        zzaz zzaz3 = this.zze;
                        if (zzaz3 != null) {
                            zzaz3.zzf(zzba);
                        }
                    }
                }
                if (zzi.zzd() + zzi.zze() != 0) {
                    if (this.zzc.zza(((zzni) zzi.zzj()).zzd()) && (zzaz = this.zze) != null) {
                        zzaz.zza(arrayList);
                    }
                }
            }
        }
    }

    private final void zzh() {
        if (zzb == null) {
            Timer timer = new Timer();
            zzb = timer;
            timer.schedule(new zzbj(this), 120000, 120000);
        }
    }

    public final void zza(zzpd zzpd) {
        C5600w0 unused = C5576k.d(this.zzd, (g) null, (M) null, new zzbl(this, zzpd, (C6658d) null), 3, (Object) null);
        zzh();
    }
}
