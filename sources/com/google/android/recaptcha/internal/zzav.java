package com.google.android.recaptcha.internal;

import Ug.K;
import com.google.android.recaptcha.RecaptchaAction;
import kotlin.coroutines.jvm.internal.l;
import lf.C6514M;
import qf.C6658d;
import yf.p;

final class zzav extends l implements p {
    final /* synthetic */ zzbd zza;
    final /* synthetic */ zzaw zzb;
    final /* synthetic */ RecaptchaAction zzc;
    final /* synthetic */ zzog zzd;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    zzav(zzbd zzbd, zzaw zzaw, RecaptchaAction recaptchaAction, zzog zzog, C6658d dVar) {
        super(2, dVar);
        this.zza = zzbd;
        this.zzb = zzaw;
        this.zzc = recaptchaAction;
        this.zzd = zzog;
    }

    public final C6658d create(Object obj, C6658d dVar) {
        return new zzav(this.zza, this.zzb, this.zzc, this.zzd, dVar);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzav) create((K) obj, (C6658d) obj2)).invokeSuspend(C6514M.f71813a);
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(3:11|12|13) */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x00fe, code lost:
        throw new com.google.android.recaptcha.internal.zzp(com.google.android.recaptcha.internal.zzn.zzc, com.google.android.recaptcha.internal.zzl.zzR, (java.lang.String) null);
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x00f5 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r6) {
        /*
            r5 = this;
            rf.C6680b.f()
            lf.w.b(r6)
            com.google.android.recaptcha.internal.zzbd r6 = r5.zza
            com.google.android.recaptcha.internal.zzne r0 = com.google.android.recaptcha.internal.zzne.FETCH_TOKEN
            com.google.android.recaptcha.internal.zzbb r6 = r6.zza(r0)
            com.google.android.recaptcha.internal.zzaw r0 = r5.zzb
            com.google.android.recaptcha.internal.zzbg r0 = r0.zzi
            r1 = 2
            r2 = 0
            r0.zze.put(r6, new com.google.android.recaptcha.internal.zzbf(r6, r0.zza, new com.google.android.recaptcha.internal.zzac()))
            com.google.android.recaptcha.internal.zzob r0 = com.google.android.recaptcha.internal.zzoc.zzf()
            com.google.android.recaptcha.internal.zzaw r1 = r5.zzb
            java.lang.String r3 = r1.zzg()
            r0.zzr(r3)
            com.google.android.recaptcha.RecaptchaAction r3 = r5.zzc
            java.lang.String r3 = r3.getAction()
            r0.zzd(r3)
            com.google.android.recaptcha.internal.zzoe r3 = r1.zzg
            java.lang.String r3 = r3.zzI()
            r0.zzq(r3)
            com.google.android.recaptcha.internal.zzoe r1 = r1.zzg
            java.lang.String r1 = r1.zzH()
            r0.zzp(r1)
            com.google.android.recaptcha.internal.zzog r1 = r5.zzd
            java.lang.String r3 = r1.zzH()
            r0.zzt(r3)
            java.lang.String r3 = r1.zzj()
            r0.zze(r3)
            java.lang.String r1 = r1.zzI()
            r0.zzs(r1)
            com.google.android.recaptcha.internal.zzit r0 = r0.zzj()
            com.google.android.recaptcha.internal.zzoc r0 = (com.google.android.recaptcha.internal.zzoc) r0
            com.google.android.recaptcha.internal.zzaw r1 = r5.zzb     // Catch:{ Exception -> 0x0111 }
            com.google.android.recaptcha.internal.zzab r1 = r1.zzf     // Catch:{ Exception -> 0x0111 }
            java.net.URL r3 = new java.net.URL     // Catch:{ Exception -> 0x0111 }
            java.lang.String r1 = r1.zzd()     // Catch:{ Exception -> 0x0111 }
            r3.<init>(r1)     // Catch:{ Exception -> 0x0111 }
            java.net.URLConnection r1 = r3.openConnection()     // Catch:{ Exception -> 0x0111 }
            java.lang.Object r1 = com.google.firebase.perf.network.FirebasePerfUrlConnection.instrument(r1)     // Catch:{ Exception -> 0x0111 }
            java.net.URLConnection r1 = (java.net.URLConnection) r1     // Catch:{ Exception -> 0x0111 }
            java.lang.String r3 = "null cannot be cast to non-null type java.net.HttpURLConnection"
            kotlin.jvm.internal.C6496s.f(r1, r3)     // Catch:{ Exception -> 0x0111 }
            java.net.HttpURLConnection r1 = (java.net.HttpURLConnection) r1     // Catch:{ Exception -> 0x0111 }
            java.lang.String r3 = "POST"
            r1.setRequestMethod(r3)     // Catch:{ Exception -> 0x0111 }
            r3 = 1
            r1.setDoOutput(r3)     // Catch:{ Exception -> 0x0111 }
            java.lang.String r3 = "application/x-protobuffer"
            java.lang.String r4 = "Content-Type"
            r1.setRequestProperty(r4, r3)     // Catch:{ Exception -> 0x0111 }
            r1.connect()     // Catch:{ Exception -> 0x00ff }
            com.google.android.recaptcha.internal.zzoi r3 = com.google.android.recaptcha.internal.zzoj.zzf()     // Catch:{ Exception -> 0x00ff }
            java.lang.String r4 = r0.zzi()     // Catch:{ Exception -> 0x00ff }
            r3.zzd(r4)     // Catch:{ Exception -> 0x00ff }
            java.lang.String r4 = r0.zzk()     // Catch:{ Exception -> 0x00ff }
            r3.zzq(r4)     // Catch:{ Exception -> 0x00ff }
            java.lang.String r4 = r0.zzI()     // Catch:{ Exception -> 0x00ff }
            r3.zzt(r4)     // Catch:{ Exception -> 0x00ff }
            java.lang.String r4 = r0.zzH()     // Catch:{ Exception -> 0x00ff }
            r3.zzp(r4)     // Catch:{ Exception -> 0x00ff }
            java.lang.String r4 = r0.zzJ()     // Catch:{ Exception -> 0x00ff }
            r3.zzr(r4)     // Catch:{ Exception -> 0x00ff }
            java.lang.String r4 = r0.zzK()     // Catch:{ Exception -> 0x00ff }
            r3.zzs(r4)     // Catch:{ Exception -> 0x00ff }
            java.lang.String r0 = r0.zzj()     // Catch:{ Exception -> 0x00ff }
            r3.zze(r0)     // Catch:{ Exception -> 0x00ff }
            com.google.android.recaptcha.internal.zzit r0 = r3.zzj()     // Catch:{ Exception -> 0x00ff }
            com.google.android.recaptcha.internal.zzoj r0 = (com.google.android.recaptcha.internal.zzoj) r0     // Catch:{ Exception -> 0x00ff }
            byte[] r0 = r0.zzd()     // Catch:{ Exception -> 0x00ff }
            java.io.OutputStream r3 = r1.getOutputStream()     // Catch:{ Exception -> 0x00ff }
            r3.write(r0)     // Catch:{ Exception -> 0x00ff }
            int r0 = r1.getResponseCode()     // Catch:{ Exception -> 0x00ff }
            r3 = 200(0xc8, float:2.8E-43)
            if (r0 != r3) goto L_0x0101
            java.io.InputStream r0 = r1.getInputStream()     // Catch:{ Exception -> 0x00ff }
            com.google.android.recaptcha.internal.zzol r0 = com.google.android.recaptcha.internal.zzol.zzg(r0)     // Catch:{ Exception -> 0x00f5 }
            com.google.android.recaptcha.internal.zzaw r1 = r5.zzb
            com.google.android.recaptcha.internal.zzbg r1 = r1.zzi
            r1.zza(r6)
            return r0
        L_0x00f5:
            com.google.android.recaptcha.internal.zzp r0 = new com.google.android.recaptcha.internal.zzp     // Catch:{ Exception -> 0x00ff }
            com.google.android.recaptcha.internal.zzn r1 = com.google.android.recaptcha.internal.zzn.zzc     // Catch:{ Exception -> 0x00ff }
            com.google.android.recaptcha.internal.zzl r3 = com.google.android.recaptcha.internal.zzl.zzR     // Catch:{ Exception -> 0x00ff }
            r0.<init>(r1, r3, r2)     // Catch:{ Exception -> 0x00ff }
            throw r0     // Catch:{ Exception -> 0x00ff }
        L_0x00ff:
            r0 = move-exception
            goto L_0x010a
        L_0x0101:
            int r0 = r1.getResponseCode()     // Catch:{ Exception -> 0x00ff }
            com.google.android.recaptcha.internal.zzp r0 = com.google.android.recaptcha.internal.zzbr.zza(r0)     // Catch:{ Exception -> 0x00ff }
            throw r0     // Catch:{ Exception -> 0x00ff }
        L_0x010a:
            boolean r1 = r0 instanceof com.google.android.recaptcha.internal.zzp     // Catch:{ Exception -> 0x0111 }
            if (r1 == 0) goto L_0x0113
            com.google.android.recaptcha.internal.zzp r0 = (com.google.android.recaptcha.internal.zzp) r0     // Catch:{ Exception -> 0x0111 }
            goto L_0x011c
        L_0x0111:
            r0 = move-exception
            goto L_0x011d
        L_0x0113:
            com.google.android.recaptcha.internal.zzp r0 = new com.google.android.recaptcha.internal.zzp     // Catch:{ Exception -> 0x0111 }
            com.google.android.recaptcha.internal.zzn r1 = com.google.android.recaptcha.internal.zzn.zze     // Catch:{ Exception -> 0x0111 }
            com.google.android.recaptcha.internal.zzl r3 = com.google.android.recaptcha.internal.zzl.zzQ     // Catch:{ Exception -> 0x0111 }
            r0.<init>(r1, r3, r2)     // Catch:{ Exception -> 0x0111 }
        L_0x011c:
            throw r0     // Catch:{ Exception -> 0x0111 }
        L_0x011d:
            boolean r1 = r0 instanceof com.google.android.recaptcha.internal.zzp
            if (r1 == 0) goto L_0x0124
            com.google.android.recaptcha.internal.zzp r0 = (com.google.android.recaptcha.internal.zzp) r0
            goto L_0x012d
        L_0x0124:
            com.google.android.recaptcha.internal.zzp r0 = new com.google.android.recaptcha.internal.zzp
            com.google.android.recaptcha.internal.zzn r1 = com.google.android.recaptcha.internal.zzn.zzc
            com.google.android.recaptcha.internal.zzl r3 = com.google.android.recaptcha.internal.zzl.zzam
            r0.<init>(r1, r3, r2)
        L_0x012d:
            com.google.android.recaptcha.internal.zzaw r1 = r5.zzb
            com.google.android.recaptcha.internal.zzbg r1 = r1.zzi
            r1.zzb(r6, r0, r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzav.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
