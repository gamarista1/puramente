package com.google.android.recaptcha.internal;

import Ug.C5599w;
import android.webkit.JavascriptInterface;
import java.util.concurrent.TimeUnit;
import lf.C6514M;

public final class zzeq {
    final /* synthetic */ zzez zza;
    private Long zzb;
    private final zzfh zzc = zzfh.zzb();

    public zzeq(zzez zzez) {
        this.zza = zzez;
    }

    private final void zzb() {
        if (this.zzb == null) {
            this.zzc.zzf();
            this.zzb = Long.valueOf(this.zzc.zza(TimeUnit.MILLISECONDS));
        }
    }

    public final Long zza() {
        return this.zzb;
    }

    @JavascriptInterface
    public final void zzlce(String str) {
        zznf zzI = zznf.zzI(zzfy.zzh().zzj(str));
        zzez zzez = this.zza;
        if (zzez.zzg().zzb == null) {
            zzez.zzi.zza(zzez.zzp.zza(zzne.LOAD_WEBVIEW));
        }
        zzb();
        zzpc zzi = zzpd.zzi();
        zzi.zzd(zzI);
        this.zza.zzi.zzd((zzpd) zzi.zzj());
    }

    @JavascriptInterface
    public final void zzlsm(String str) {
        zzb();
        zzpc zzi = zzpd.zzi();
        zzi.zze(zznu.zzi(zzfy.zzh().zzj(str)));
        this.zza.zzi.zzd((zzpd) zzi.zzj());
    }

    @JavascriptInterface
    public final void zzoid(String str) {
        zzb();
        zzox zzg = zzox.zzg(zzfy.zzh().zzj(str));
        zzg.zzi().name();
        if (zzg.zzi() == zzpb.JS_CODE_SUCCESS) {
            this.zza.zzk().hashCode();
            if (!this.zza.zzk().j0(C6514M.f71813a)) {
                this.zza.zzk().hashCode();
                return;
            }
            return;
        }
        zzg.zzi().name();
        zzo zzo = zzp.zza;
        zzp zza2 = zzo.zza(zzg.zzi());
        this.zza.zzk().hashCode();
        this.zza.zzk().f(zza2);
    }

    @JavascriptInterface
    public final void zzrp(String str) {
        zzb();
        zzbu zzbu = this.zza.zzc;
        if (zzbu == null) {
            zzbu = null;
        }
        zzbu.zza(str);
    }

    @JavascriptInterface
    public final void zzscd(String str) {
        zzb();
        zzog zzi = zzog.zzi(zzfy.zzh().zzj(str));
        zzi.toString();
        C5599w wVar = (C5599w) this.zza.zzl.remove(zzi.zzk());
        if (wVar != null) {
            wVar.j0(zzi);
        }
    }
}
