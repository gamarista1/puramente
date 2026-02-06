package com.google.android.recaptcha.internal;

import Ug.K;
import kotlin.coroutines.jvm.internal.l;
import lf.C6514M;
import qf.C6658d;
import yf.p;

final class zzbz extends l implements p {
    int zza;
    final /* synthetic */ zzcj zzb;
    final /* synthetic */ zzca zzc;
    final /* synthetic */ String zzd;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    zzbz(zzcj zzcj, zzca zzca, String str, C6658d dVar) {
        super(2, dVar);
        this.zzb = zzcj;
        this.zzc = zzca;
        this.zzd = str;
    }

    public final C6658d create(Object obj, C6658d dVar) {
        return new zzbz(this.zzb, this.zzc, this.zzd, dVar);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzbz) create((K) obj, (C6658d) obj2)).invokeSuspend(C6514M.f71813a);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0047, code lost:
        if (r1.zzg(r5, r3, r4) == r0) goto L_0x0057;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0055, code lost:
        if (r1.zzh(r5, r2, r4) != r0) goto L_0x0058;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0057, code lost:
        return r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r5) {
        /*
            r4 = this;
            java.lang.Object r0 = rf.C6680b.f()
            int r1 = r4.zza
            r2 = 1
            if (r1 == 0) goto L_0x0015
            if (r1 == r2) goto L_0x000f
            lf.w.b(r5)
            goto L_0x0058
        L_0x000f:
            lf.w.b(r5)     // Catch:{ Exception -> 0x0013 }
            goto L_0x0058
        L_0x0013:
            r5 = move-exception
            goto L_0x004a
        L_0x0015:
            lf.w.b(r5)
            com.google.android.recaptcha.internal.zzcj r5 = r4.zzb
            com.google.android.recaptcha.internal.zzz r1 = new com.google.android.recaptcha.internal.zzz
            r1.<init>()
            r5.zza = r1
            java.lang.String r5 = r4.zzd     // Catch:{ Exception -> 0x0013 }
            com.google.android.recaptcha.internal.zzfy r1 = com.google.android.recaptcha.internal.zzfy.zzh()     // Catch:{ Exception -> 0x0013 }
            byte[] r5 = r1.zzj(r5)     // Catch:{ Exception -> 0x0013 }
            com.google.android.recaptcha.internal.zzpn r5 = com.google.android.recaptcha.internal.zzpn.zzg(r5)     // Catch:{ Exception -> 0x0013 }
            com.google.android.recaptcha.internal.zzca r1 = r4.zzc     // Catch:{ Exception -> 0x0013 }
            com.google.android.recaptcha.internal.zzee r1 = r1.zzd     // Catch:{ Exception -> 0x0013 }
            com.google.android.recaptcha.internal.zzpf r5 = r1.zza(r5)     // Catch:{ Exception -> 0x0013 }
            com.google.android.recaptcha.internal.zzca r1 = r4.zzc     // Catch:{ Exception -> 0x0013 }
            java.util.List r5 = r5.zzi()     // Catch:{ Exception -> 0x0013 }
            com.google.android.recaptcha.internal.zzcj r3 = r4.zzb     // Catch:{ Exception -> 0x0013 }
            r4.zza = r2     // Catch:{ Exception -> 0x0013 }
            java.lang.Object r5 = r1.zzg(r5, r3, r4)     // Catch:{ Exception -> 0x0013 }
            if (r5 != r0) goto L_0x0058
            goto L_0x0057
        L_0x004a:
            com.google.android.recaptcha.internal.zzca r1 = r4.zzc
            com.google.android.recaptcha.internal.zzcj r2 = r4.zzb
            r3 = 2
            r4.zza = r3
            java.lang.Object r5 = r1.zzh(r5, r2, r4)
            if (r5 != r0) goto L_0x0058
        L_0x0057:
            return r0
        L_0x0058:
            lf.M r5 = lf.C6514M.f71813a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzbz.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
