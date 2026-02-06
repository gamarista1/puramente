package com.google.android.recaptcha.internal;

import Ug.K;
import android.app.Application;
import android.webkit.WebView;
import kotlin.coroutines.jvm.internal.l;
import lf.C6514M;
import qf.C6658d;
import yf.p;

final class zzaj extends l implements p {
    Object zza;
    int zzb;
    final /* synthetic */ Application zzc;
    final /* synthetic */ zzab zzd;
    final /* synthetic */ String zze;
    final /* synthetic */ zzbq zzf;
    final /* synthetic */ zzbd zzg;
    final /* synthetic */ zzbg zzh;
    final /* synthetic */ long zzi;
    final /* synthetic */ zzt zzj;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    zzaj(Application application, zzab zzab, String str, zzbq zzbq, zzbd zzbd, zzt zzt, WebView webView, zzbg zzbg, long j10, C6658d dVar) {
        super(2, dVar);
        this.zzc = application;
        this.zzd = zzab;
        this.zze = str;
        this.zzf = zzbq;
        this.zzg = zzbd;
        this.zzj = zzt;
        this.zzh = zzbg;
        this.zzi = j10;
    }

    public final C6658d create(Object obj, C6658d dVar) {
        return new zzaj(this.zzc, this.zzd, this.zze, this.zzf, this.zzg, this.zzj, (WebView) null, this.zzh, this.zzi, dVar);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzaj) create((K) obj, (C6658d) obj2)).invokeSuspend(C6514M.f71813a);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x008e, code lost:
        if (r3 != r1) goto L_0x001f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0058, code lost:
        if (r2 != r1) goto L_0x005a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r28) {
        /*
            r27 = this;
            r0 = r27
            java.lang.Object r1 = rf.C6680b.f()
            int r2 = r0.zzb
            r3 = 2
            r5 = 1
            if (r2 == 0) goto L_0x0032
            if (r2 == r5) goto L_0x002c
            if (r2 != r3) goto L_0x0023
            java.lang.Object r2 = r0.zza
            com.google.android.recaptcha.internal.zzoe r2 = (com.google.android.recaptcha.internal.zzoe) r2
            lf.w.b(r28)
            r3 = r28
            lf.v r3 = (lf.v) r3
            java.lang.Object r3 = r3.j()
        L_0x001f:
            r22 = r2
            goto L_0x0091
        L_0x0023:
            java.lang.Object r1 = r0.zza
            java.lang.Throwable r1 = (java.lang.Throwable) r1
            lf.w.b(r28)
            goto L_0x00f8
        L_0x002c:
            lf.w.b(r28)
            r2 = r28
            goto L_0x005a
        L_0x0032:
            lf.w.b(r28)
            com.google.android.recaptcha.internal.zzam r2 = com.google.android.recaptcha.internal.zzam.zza
            android.app.Application r7 = r0.zzc
            com.google.android.recaptcha.internal.zzab r11 = r0.zzd
            java.lang.String r8 = r0.zze
            com.google.android.recaptcha.internal.zzbq r10 = r0.zzf
            com.google.android.recaptcha.internal.zzbd r9 = r0.zzg
            com.google.android.recaptcha.internal.zzt r2 = r0.zzj
            r0.zzb = r5
            Ug.K r2 = r2.zza()
            qf.g r2 = r2.getCoroutineContext()
            com.google.android.recaptcha.internal.zzal r13 = new com.google.android.recaptcha.internal.zzal
            r12 = 0
            r6 = r13
            r6.<init>(r7, r8, r9, r10, r11, r12)
            java.lang.Object r2 = Ug.C5572i.g(r2, r13, r0)
            if (r2 == r1) goto L_0x0104
        L_0x005a:
            android.app.Application r6 = r0.zzc
            com.google.android.recaptcha.internal.zzoe r2 = (com.google.android.recaptcha.internal.zzoe) r2
            com.google.android.recaptcha.internal.zzez r15 = new com.google.android.recaptcha.internal.zzez
            android.webkit.WebView r8 = new android.webkit.WebView
            r8.<init>(r6)
            java.lang.String r9 = r0.zze
            android.app.Application r10 = r0.zzc
            com.google.android.recaptcha.internal.zzab r11 = r0.zzd
            com.google.android.recaptcha.internal.zzbd r12 = r0.zzg
            com.google.android.recaptcha.internal.zzt r13 = r0.zzj
            com.google.android.recaptcha.internal.zzbg r14 = r0.zzh
            com.google.android.recaptcha.internal.zzbq r6 = r0.zzf
            r7 = r15
            r4 = r15
            r15 = r6
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15)
            com.google.android.recaptcha.internal.zzg r6 = com.google.android.recaptcha.internal.zzam.zze()
            r6.zzd(r4)
            long r6 = r0.zzi
            com.google.android.recaptcha.internal.zzg r4 = com.google.android.recaptcha.internal.zzam.zze()
            r0.zza = r2
            r0.zzb = r3
            java.lang.Object r3 = r4.zzb(r6, r2, r0)
            if (r3 == r1) goto L_0x0104
            goto L_0x001f
        L_0x0091:
            com.google.android.recaptcha.internal.zzt r2 = r0.zzj
            java.lang.Throwable r3 = lf.v.e(r3)
            if (r3 != 0) goto L_0x00cb
            android.app.Application r1 = r0.zzc
            com.google.android.recaptcha.internal.zzaw r2 = new com.google.android.recaptcha.internal.zzaw
            com.google.android.recaptcha.internal.zzam r3 = com.google.android.recaptcha.internal.zzam.zza
            java.lang.String r3 = r0.zze
            com.google.android.recaptcha.internal.zzt r4 = r0.zzj
            com.google.android.recaptcha.internal.zzab r5 = r0.zzd
            com.google.android.recaptcha.internal.zzbd r6 = r0.zzg
            com.google.android.recaptcha.internal.zzbg r7 = r0.zzh
            com.google.android.recaptcha.internal.zzg r18 = com.google.android.recaptcha.internal.zzam.zze()
            com.google.android.recaptcha.internal.zzq r8 = new com.google.android.recaptcha.internal.zzq
            r8.<init>(r1)
            com.google.android.recaptcha.internal.zzbs r26 = new com.google.android.recaptcha.internal.zzbs
            r26.<init>()
            r16 = r2
            r17 = r1
            r19 = r3
            r20 = r4
            r21 = r5
            r23 = r6
            r24 = r7
            r25 = r8
            r16.<init>(r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)
            return r2
        L_0x00cb:
            Ug.K r4 = r2.zzc()
            qf.g r4 = r4.getCoroutineContext()
            r6 = 0
            Ug.C0.i(r4, r6, r5, r6)
            Ug.K r2 = r2.zzc()
            qf.g r2 = r2.getCoroutineContext()
            Ug.w0 r2 = Ug.A0.n(r2)
            Rg.h r2 = r2.E()
            java.util.List r2 = Rg.k.G(r2)
            r0.zza = r3
            r4 = 3
            r0.zzb = r4
            java.lang.Object r2 = Ug.C5566f.b(r2, r0)
            if (r2 != r1) goto L_0x00f7
            goto L_0x0104
        L_0x00f7:
            r1 = r3
        L_0x00f8:
            com.google.android.recaptcha.internal.zzam r2 = com.google.android.recaptcha.internal.zzam.zza
            com.google.android.recaptcha.internal.zzg r2 = new com.google.android.recaptcha.internal.zzg
            r3 = 0
            r2.<init>(r3, r5, r3)
            com.google.android.recaptcha.internal.zzam.zzf(r2)
            throw r1
        L_0x0104:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzaj.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
