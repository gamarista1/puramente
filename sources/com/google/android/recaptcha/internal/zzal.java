package com.google.android.recaptcha.internal;

import Ug.K;
import android.app.Application;
import android.os.Build;
import com.adjust.sdk.Constants;
import java.net.URLEncoder;
import java.nio.charset.Charset;
import kotlin.coroutines.jvm.internal.l;
import lf.C6514M;
import lf.w;
import qf.C6658d;
import rf.C6680b;
import yf.p;

final class zzal extends l implements p {
    final /* synthetic */ Application zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ zzbd zzc;
    final /* synthetic */ zzbq zzd;
    final /* synthetic */ zzab zze;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    zzal(Application application, String str, zzbd zzbd, zzbq zzbq, zzab zzab, C6658d dVar) {
        super(2, dVar);
        this.zza = application;
        this.zzb = str;
        this.zzc = zzbd;
        this.zzd = zzbq;
        this.zze = zzab;
    }

    public final C6658d create(Object obj, C6658d dVar) {
        return new zzal(this.zza, this.zzb, this.zzc, this.zzd, this.zze, dVar);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzal) create((K) obj, (C6658d) obj2)).invokeSuspend(C6514M.f71813a);
    }

    public final Object invokeSuspend(Object obj) {
        C6680b.f();
        w.b(obj);
        zzaf zzaf = zzaf.zza;
        zzbd zzbd = this.zzc;
        Application application = this.zza;
        String zza2 = zzaf.zza(application);
        String packageName = application.getPackageName();
        String zzd2 = zzbd.zzd();
        zzq zzq = new zzq(application);
        int i10 = Build.VERSION.SDK_INT;
        String zza3 = zzq.zza("_GRECAPTCHA_KC");
        if (zza3 == null) {
            zza3 = "";
        }
        String encode = URLEncoder.encode(this.zzb, Constants.ENCODING);
        String encode2 = URLEncoder.encode(packageName, Constants.ENCODING);
        String encode3 = URLEncoder.encode(zza2, Constants.ENCODING);
        String encode4 = URLEncoder.encode("18.4.0", Constants.ENCODING);
        String encode5 = URLEncoder.encode(zzd2, Constants.ENCODING);
        byte[] bytes = ("k=" + encode + "&pk=" + encode2 + "&mst=" + encode3 + "&msv=" + encode4 + "&msi=" + encode5 + "&mov=" + i10 + "&mkc=" + zza3).getBytes(Charset.forName(Constants.ENCODING));
        zzbq zzbq = this.zzd;
        zzab zzab = this.zze;
        return zzbq.zza(zzab.zzb(), bytes, this.zzc);
    }
}
