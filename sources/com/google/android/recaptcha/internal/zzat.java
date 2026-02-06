package com.google.android.recaptcha.internal;

import Ug.K;
import com.google.android.recaptcha.RecaptchaAction;
import kotlin.coroutines.jvm.internal.l;
import lf.C6514M;
import qf.C6658d;
import yf.p;

final class zzat extends l implements p {
    int zza;
    final /* synthetic */ zzaw zzb;
    final /* synthetic */ long zzc;
    final /* synthetic */ RecaptchaAction zzd;
    final /* synthetic */ zzbd zze;
    final /* synthetic */ String zzf;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    zzat(zzaw zzaw, long j10, RecaptchaAction recaptchaAction, zzbd zzbd, String str, C6658d dVar) {
        super(2, dVar);
        this.zzb = zzaw;
        this.zzc = j10;
        this.zzd = recaptchaAction;
        this.zze = zzbd;
        this.zzf = str;
    }

    public final C6658d create(Object obj, C6658d dVar) {
        return new zzat(this.zzb, this.zzc, this.zzd, this.zze, this.zzf, dVar);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzat) create((K) obj, (C6658d) obj2)).invokeSuspend(C6514M.f71813a);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000c, code lost:
        if (r1 != 1) goto L_0x003d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0029, code lost:
        if (r13 != r0) goto L_0x002b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x003a, code lost:
        if (r13 == r0) goto L_0x0064;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x003d, code lost:
        r13 = (com.google.android.recaptcha.internal.zzol) r13;
        r12.zzb.zzl(r13, r12.zze);
        r12.zzb.zzi.zza(r12.zze.zza(com.google.android.recaptcha.internal.zzne.zzo));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0063, code lost:
        return lf.v.a(lf.v.b(r13.zzi()));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0064, code lost:
        return r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            r12 = this;
            java.lang.Object r0 = rf.C6680b.f()
            int r1 = r12.zza
            r2 = 1
            lf.w.b(r13)
            if (r1 == 0) goto L_0x000f
            if (r1 == r2) goto L_0x002b
            goto L_0x003d
        L_0x000f:
            com.google.android.recaptcha.internal.zzaw r13 = r12.zzb
            long r3 = r12.zzc
            com.google.android.recaptcha.RecaptchaAction r1 = r12.zzd
            com.google.android.recaptcha.internal.zzbd r5 = r12.zze
            com.google.android.recaptcha.internal.zzaw.zzi(r13, r3, r1, r5)
            com.google.android.recaptcha.internal.zzaw r6 = r12.zzb
            long r7 = r12.zzc
            java.lang.String r9 = r12.zzf
            com.google.android.recaptcha.internal.zzbd r10 = r12.zze
            r12.zza = r2
            r11 = r12
            java.lang.Object r13 = r6.zzj(r7, r9, r10, r11)
            if (r13 == r0) goto L_0x0064
        L_0x002b:
            com.google.android.recaptcha.internal.zzaw r1 = r12.zzb
            com.google.android.recaptcha.RecaptchaAction r2 = r12.zzd
            com.google.android.recaptcha.internal.zzbd r3 = r12.zze
            com.google.android.recaptcha.internal.zzog r13 = (com.google.android.recaptcha.internal.zzog) r13
            r4 = 2
            r12.zza = r4
            java.lang.Object r13 = Ug.C5572i.g(r1.zzl.zza().getCoroutineContext(), new com.google.android.recaptcha.internal.zzav(r3, r1, r2, r13, (qf.C6658d) null), r12)
            if (r13 != r0) goto L_0x003d
            goto L_0x0064
        L_0x003d:
            com.google.android.recaptcha.internal.zzaw r0 = r12.zzb
            com.google.android.recaptcha.internal.zzbd r1 = r12.zze
            com.google.android.recaptcha.internal.zzol r13 = (com.google.android.recaptcha.internal.zzol) r13
            r0.zzl(r13, r1)
            com.google.android.recaptcha.internal.zzaw r0 = r12.zzb
            com.google.android.recaptcha.internal.zzbd r1 = r12.zze
            com.google.android.recaptcha.internal.zzbg r0 = r0.zzi
            com.google.android.recaptcha.internal.zzne r2 = com.google.android.recaptcha.internal.zzne.EXECUTE_TOTAL
            com.google.android.recaptcha.internal.zzbb r1 = r1.zza(r2)
            r0.zza(r1)
            java.lang.String r13 = r13.zzi()
            java.lang.Object r13 = lf.v.b(r13)
            lf.v r13 = lf.v.a(r13)
            return r13
        L_0x0064:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzat.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
