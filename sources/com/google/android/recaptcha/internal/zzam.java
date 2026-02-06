package com.google.android.recaptcha.internal;

import Ug.C5572i;
import Ug.M;
import android.app.Application;
import com.google.android.gms.tasks.Task;
import dh.C5817a;
import dh.c;
import java.util.List;
import java.util.UUID;
import kotlin.jvm.internal.DefaultConstructorMarker;
import qf.C6658d;
import qf.g;

public final class zzam {
    public static final zzam zza = new zzam();
    private static zzaw zzb;
    private static final String zzc = UUID.randomUUID().toString();
    private static final C5817a zzd = c.b(false, 1, (Object) null);
    private static final zzt zze = new zzt();
    private static zzg zzf = new zzg((List) null, 1, (DefaultConstructorMarker) null);

    private zzam() {
    }

    public static final Object zzc(Application application, String str, long j10, zzbq zzbq, C6658d dVar) {
        return C5572i.g(zze.zzb().getCoroutineContext(), new zzah(application, str, j10, (zzbq) null, (C6658d) null), dVar);
    }

    public static final Task zzd(Application application, String str, long j10) {
        return zzj.zza(C5576k.b(zze.zzb(), (g) null, (M) null, new zzak(application, str, j10, (C6658d) null), 3, (Object) null));
    }

    public static final zzg zze() {
        return zzf;
    }

    public static final void zzf(zzg zzg) {
        zzf = zzg;
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:62:0x01b2 */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0067  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x00d5 A[Catch:{ RecaptchaException -> 0x0107, Exception -> 0x0103, all -> 0x00fe }] */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x0191 A[Catch:{ RecaptchaException -> 0x0173, Exception -> 0x01b0, all -> 0x0171 }] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object zza(android.app.Application r22, java.lang.String r23, long r24, com.google.android.recaptcha.internal.zzab r26, android.webkit.WebView r27, com.google.android.recaptcha.internal.zzbq r28, com.google.android.recaptcha.internal.zzt r29, qf.C6658d r30) {
        /*
            r21 = this;
            r0 = r30
            boolean r1 = r0 instanceof com.google.android.recaptcha.internal.zzai
            if (r1 == 0) goto L_0x0017
            r1 = r0
            com.google.android.recaptcha.internal.zzai r1 = (com.google.android.recaptcha.internal.zzai) r1
            int r2 = r1.zzg
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L_0x0017
            int r2 = r2 - r3
            r1.zzg = r2
            r2 = r21
            goto L_0x001e
        L_0x0017:
            com.google.android.recaptcha.internal.zzai r1 = new com.google.android.recaptcha.internal.zzai
            r2 = r21
            r1.<init>(r2, r0)
        L_0x001e:
            java.lang.Object r0 = r1.zze
            java.lang.Object r3 = rf.C6680b.f()
            int r4 = r1.zzg
            r5 = 1
            r6 = 2
            r7 = 0
            if (r4 == 0) goto L_0x0067
            if (r4 == r5) goto L_0x004e
            if (r4 != r6) goto L_0x0046
            java.lang.Object r3 = r1.zzc
            com.google.android.recaptcha.internal.zzbg r3 = (com.google.android.recaptcha.internal.zzbg) r3
            java.lang.Object r4 = r1.zzb
            com.google.android.recaptcha.internal.zzbd r4 = (com.google.android.recaptcha.internal.zzbd) r4
            java.lang.Object r1 = r1.zza
            dh.a r1 = (dh.C5817a) r1
            lf.w.b(r0)     // Catch:{ RecaptchaException -> 0x0043, Exception -> 0x01b2 }
            goto L_0x015e
        L_0x0040:
            r0 = move-exception
            goto L_0x01be
        L_0x0043:
            r0 = move-exception
            goto L_0x01bd
        L_0x0046:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x004e:
            long r4 = r1.zzd
            dh.a r8 = r1.zzh
            com.google.android.recaptcha.internal.zzt r9 = r1.zzi
            java.lang.Object r10 = r1.zzc
            com.google.android.recaptcha.internal.zzab r10 = (com.google.android.recaptcha.internal.zzab) r10
            java.lang.Object r11 = r1.zzb
            java.lang.String r11 = (java.lang.String) r11
            java.lang.Object r12 = r1.zza
            android.app.Application r12 = (android.app.Application) r12
            lf.w.b(r0)
            r15 = r8
            r14 = r9
            r9 = r12
            goto L_0x0090
        L_0x0067:
            lf.w.b(r0)
            dh.a r0 = zzd
            r4 = r22
            r1.zza = r4
            r8 = r23
            r1.zzb = r8
            r9 = r26
            r1.zzc = r9
            r10 = r29
            r1.zzi = r10
            r1.zzh = r0
            r11 = r24
            r1.zzd = r11
            r1.zzg = r5
            java.lang.Object r5 = r0.a(r7, r1)
            if (r5 == r3) goto L_0x01c2
            r15 = r0
            r14 = r10
            r10 = r9
            r9 = r4
            r4 = r11
            r11 = r8
        L_0x0090:
            java.util.UUID r0 = java.util.UUID.randomUUID()     // Catch:{ RecaptchaException -> 0x0107, Exception -> 0x0103, all -> 0x00fe }
            java.lang.String r0 = r0.toString()     // Catch:{ RecaptchaException -> 0x0107, Exception -> 0x0103, all -> 0x00fe }
            java.lang.String r8 = zzc     // Catch:{ RecaptchaException -> 0x0107, Exception -> 0x0103, all -> 0x00fe }
            com.google.android.recaptcha.internal.zzbd r13 = new com.google.android.recaptcha.internal.zzbd     // Catch:{ RecaptchaException -> 0x0107, Exception -> 0x0103, all -> 0x00fe }
            r13.<init>(r8, r0, r7)     // Catch:{ RecaptchaException -> 0x0107, Exception -> 0x0103, all -> 0x00fe }
            r13.zzc(r0)     // Catch:{ RecaptchaException -> 0x0107, Exception -> 0x0103, all -> 0x00fe }
            com.google.android.recaptcha.internal.zzbg r0 = new com.google.android.recaptcha.internal.zzbg     // Catch:{ RecaptchaException -> 0x0107, Exception -> 0x0103, all -> 0x00fe }
            com.google.android.recaptcha.internal.zzbm r8 = new com.google.android.recaptcha.internal.zzbm     // Catch:{ RecaptchaException -> 0x0107, Exception -> 0x0103, all -> 0x00fe }
            com.google.android.recaptcha.internal.zzbo r12 = new com.google.android.recaptcha.internal.zzbo     // Catch:{ RecaptchaException -> 0x0107, Exception -> 0x0103, all -> 0x00fe }
            java.lang.String r6 = r10.zzc()     // Catch:{ RecaptchaException -> 0x0107, Exception -> 0x0103, all -> 0x00fe }
            r12.<init>(r6)     // Catch:{ RecaptchaException -> 0x0107, Exception -> 0x0103, all -> 0x00fe }
            Ug.K r6 = r14.zza()     // Catch:{ RecaptchaException -> 0x0107, Exception -> 0x0103, all -> 0x00fe }
            r8.<init>(r9, r12, r6)     // Catch:{ RecaptchaException -> 0x0107, Exception -> 0x0103, all -> 0x00fe }
            r22 = r0
            r23 = r11
            r24 = r9
            r25 = r10
            r26 = r14
            r27 = r8
            r22.<init>(r23, r24, r25, r26, r27)     // Catch:{ RecaptchaException -> 0x0107, Exception -> 0x0103, all -> 0x00fe }
            com.google.android.recaptcha.internal.zzne r6 = com.google.android.recaptcha.internal.zzne.INIT_TOTAL     // Catch:{ RecaptchaException -> 0x0107, Exception -> 0x0103, all -> 0x00fe }
            com.google.android.recaptcha.internal.zzbb r8 = r13.zza(r6)     // Catch:{ RecaptchaException -> 0x0107, Exception -> 0x0103, all -> 0x00fe }
            r12 = 2
            r0.zze.put(r8, new com.google.android.recaptcha.internal.zzbf(r8, r0.zza, new com.google.android.recaptcha.internal.zzac()))     // Catch:{ RecaptchaException -> 0x0107, Exception -> 0x0103, all -> 0x00fe }
            r16 = 5000(0x1388, double:2.4703E-320)
            int r8 = (r4 > r16 ? 1 : (r4 == r16 ? 0 : -1))
            if (r8 < 0) goto L_0x0191
            java.lang.String r8 = "android.permission.INTERNET"
            int r8 = androidx.core.content.c.checkSelfPermission(r9, r8)     // Catch:{ RecaptchaException -> 0x0107, Exception -> 0x0103, all -> 0x00fe }
            if (r8 != 0) goto L_0x0175
            com.google.android.recaptcha.internal.zzbq r12 = new com.google.android.recaptcha.internal.zzbq     // Catch:{ RecaptchaException -> 0x0107, Exception -> 0x0103, all -> 0x00fe }
            com.google.android.recaptcha.internal.zzy r8 = new com.google.android.recaptcha.internal.zzy     // Catch:{ RecaptchaException -> 0x0107, Exception -> 0x0103, all -> 0x00fe }
            r8.<init>(r9)     // Catch:{ RecaptchaException -> 0x0107, Exception -> 0x0103, all -> 0x00fe }
            r12.<init>(r8, r0)     // Catch:{ RecaptchaException -> 0x0107, Exception -> 0x0103, all -> 0x00fe }
            com.google.android.recaptcha.internal.zzaw r8 = zzb     // Catch:{ RecaptchaException -> 0x0107, Exception -> 0x0103, all -> 0x00fe }
            if (r8 == 0) goto L_0x0131
            java.lang.String r1 = r8.zzg()     // Catch:{ RecaptchaException -> 0x0107, Exception -> 0x0103, all -> 0x00fe }
            boolean r1 = kotlin.jvm.internal.C6496s.c(r1, r11)     // Catch:{ RecaptchaException -> 0x0107, Exception -> 0x0103, all -> 0x00fe }
            if (r1 == 0) goto L_0x010c
            com.google.android.recaptcha.internal.zzbb r1 = r13.zza(r6)     // Catch:{ RecaptchaException -> 0x0107, Exception -> 0x0103, all -> 0x00fe }
            r0.zza(r1)     // Catch:{ RecaptchaException -> 0x0107, Exception -> 0x0103, all -> 0x00fe }
            goto L_0x016d
        L_0x00fe:
            r0 = move-exception
            r20 = r15
            goto L_0x01ad
        L_0x0103:
            r20 = r15
            goto L_0x01b0
        L_0x0107:
            r0 = move-exception
            r20 = r15
            goto L_0x01bb
        L_0x010c:
            com.google.android.recaptcha.RecaptchaException r0 = new com.google.android.recaptcha.RecaptchaException     // Catch:{ RecaptchaException -> 0x0107, Exception -> 0x0103, all -> 0x00fe }
            com.google.android.recaptcha.RecaptchaErrorCode r1 = com.google.android.recaptcha.RecaptchaErrorCode.INVALID_SITEKEY     // Catch:{ RecaptchaException -> 0x0107, Exception -> 0x0103, all -> 0x00fe }
            java.lang.String r3 = r8.zzg()     // Catch:{ RecaptchaException -> 0x0107, Exception -> 0x0103, all -> 0x00fe }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ RecaptchaException -> 0x0107, Exception -> 0x0103, all -> 0x00fe }
            r4.<init>()     // Catch:{ RecaptchaException -> 0x0107, Exception -> 0x0103, all -> 0x00fe }
            java.lang.String r5 = "Only one site key can be used per runtime. The site key you provided "
            r4.append(r5)     // Catch:{ RecaptchaException -> 0x0107, Exception -> 0x0103, all -> 0x00fe }
            r4.append(r11)     // Catch:{ RecaptchaException -> 0x0107, Exception -> 0x0103, all -> 0x00fe }
            java.lang.String r5 = " is different than "
            r4.append(r5)     // Catch:{ RecaptchaException -> 0x0107, Exception -> 0x0103, all -> 0x00fe }
            r4.append(r3)     // Catch:{ RecaptchaException -> 0x0107, Exception -> 0x0103, all -> 0x00fe }
            java.lang.String r3 = r4.toString()     // Catch:{ RecaptchaException -> 0x0107, Exception -> 0x0103, all -> 0x00fe }
            r0.<init>(r1, r3)     // Catch:{ RecaptchaException -> 0x0107, Exception -> 0x0103, all -> 0x00fe }
            throw r0     // Catch:{ RecaptchaException -> 0x0107, Exception -> 0x0103, all -> 0x00fe }
        L_0x0131:
            r1.zza = r15     // Catch:{ RecaptchaException -> 0x0107, Exception -> 0x0103, all -> 0x00fe }
            r1.zzb = r13     // Catch:{ RecaptchaException -> 0x0107, Exception -> 0x0103, all -> 0x00fe }
            r1.zzc = r0     // Catch:{ RecaptchaException -> 0x0107, Exception -> 0x0103, all -> 0x00fe }
            r1.zzi = r7     // Catch:{ RecaptchaException -> 0x0107, Exception -> 0x0103, all -> 0x00fe }
            r1.zzh = r7     // Catch:{ RecaptchaException -> 0x0107, Exception -> 0x0103, all -> 0x00fe }
            r6 = 2
            r1.zzg = r6     // Catch:{ RecaptchaException -> 0x0107, Exception -> 0x0103, all -> 0x00fe }
            com.google.android.recaptcha.internal.zzaj r6 = new com.google.android.recaptcha.internal.zzaj     // Catch:{ RecaptchaException -> 0x0107, Exception -> 0x0103, all -> 0x00fe }
            r16 = 0
            r19 = 0
            r8 = r6
            r22 = r13
            r20 = r15
            r15 = r16
            r16 = r0
            r17 = r4
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16, r17, r19)     // Catch:{ RecaptchaException -> 0x0173, Exception -> 0x01b0, all -> 0x0171 }
            java.lang.Object r1 = Ug.e1.c(r4, r6, r1)     // Catch:{ RecaptchaException -> 0x0173, Exception -> 0x01b0, all -> 0x0171 }
            if (r1 == r3) goto L_0x01c2
            r4 = r22
            r3 = r0
            r0 = r1
            r1 = r20
        L_0x015e:
            r8 = r0
            com.google.android.recaptcha.internal.zzaw r8 = (com.google.android.recaptcha.internal.zzaw) r8     // Catch:{ RecaptchaException -> 0x0043, Exception -> 0x01b2 }
            zzb = r8     // Catch:{ RecaptchaException -> 0x0043, Exception -> 0x01b2 }
            com.google.android.recaptcha.internal.zzne r0 = com.google.android.recaptcha.internal.zzne.INIT_TOTAL     // Catch:{ RecaptchaException -> 0x0043, Exception -> 0x01b2 }
            com.google.android.recaptcha.internal.zzbb r0 = r4.zza(r0)     // Catch:{ RecaptchaException -> 0x0043, Exception -> 0x01b2 }
            r3.zza(r0)     // Catch:{ RecaptchaException -> 0x0043, Exception -> 0x01b2 }
            r15 = r1
        L_0x016d:
            r15.e(r7)
            return r8
        L_0x0171:
            r0 = move-exception
            goto L_0x01ad
        L_0x0173:
            r0 = move-exception
            goto L_0x01bb
        L_0x0175:
            r1 = r13
            r20 = r15
            com.google.android.recaptcha.internal.zzbb r1 = r1.zza(r6)     // Catch:{ RecaptchaException -> 0x0173, Exception -> 0x01b0, all -> 0x0171 }
            com.google.android.recaptcha.internal.zzp r3 = new com.google.android.recaptcha.internal.zzp     // Catch:{ RecaptchaException -> 0x0173, Exception -> 0x01b0, all -> 0x0171 }
            com.google.android.recaptcha.internal.zzn r4 = com.google.android.recaptcha.internal.zzn.zze     // Catch:{ RecaptchaException -> 0x0173, Exception -> 0x01b0, all -> 0x0171 }
            com.google.android.recaptcha.internal.zzl r5 = com.google.android.recaptcha.internal.zzl.zzv     // Catch:{ RecaptchaException -> 0x0173, Exception -> 0x01b0, all -> 0x0171 }
            r3.<init>(r4, r5, r7)     // Catch:{ RecaptchaException -> 0x0173, Exception -> 0x01b0, all -> 0x0171 }
            r0.zzb(r1, r3, r7)     // Catch:{ RecaptchaException -> 0x0173, Exception -> 0x01b0, all -> 0x0171 }
            com.google.android.recaptcha.RecaptchaException r0 = new com.google.android.recaptcha.RecaptchaException     // Catch:{ RecaptchaException -> 0x0173, Exception -> 0x01b0, all -> 0x0171 }
            com.google.android.recaptcha.RecaptchaErrorCode r1 = com.google.android.recaptcha.RecaptchaErrorCode.NETWORK_ERROR     // Catch:{ RecaptchaException -> 0x0173, Exception -> 0x01b0, all -> 0x0171 }
            r3 = 2
            r0.<init>(r1, r7, r3, r7)     // Catch:{ RecaptchaException -> 0x0173, Exception -> 0x01b0, all -> 0x0171 }
            throw r0     // Catch:{ RecaptchaException -> 0x0173, Exception -> 0x01b0, all -> 0x0171 }
        L_0x0191:
            r1 = r13
            r20 = r15
            com.google.android.recaptcha.internal.zzp r3 = new com.google.android.recaptcha.internal.zzp     // Catch:{ RecaptchaException -> 0x0173, Exception -> 0x01b0, all -> 0x0171 }
            com.google.android.recaptcha.internal.zzn r4 = com.google.android.recaptcha.internal.zzn.zzm     // Catch:{ RecaptchaException -> 0x0173, Exception -> 0x01b0, all -> 0x0171 }
            com.google.android.recaptcha.internal.zzl r5 = com.google.android.recaptcha.internal.zzl.zzT     // Catch:{ RecaptchaException -> 0x0173, Exception -> 0x01b0, all -> 0x0171 }
            r3.<init>(r4, r5, r7)     // Catch:{ RecaptchaException -> 0x0173, Exception -> 0x01b0, all -> 0x0171 }
            com.google.android.recaptcha.internal.zzbb r1 = r1.zza(r6)     // Catch:{ RecaptchaException -> 0x0173, Exception -> 0x01b0, all -> 0x0171 }
            r0.zzb(r1, r3, r7)     // Catch:{ RecaptchaException -> 0x0173, Exception -> 0x01b0, all -> 0x0171 }
            com.google.android.recaptcha.RecaptchaException r0 = new com.google.android.recaptcha.RecaptchaException     // Catch:{ RecaptchaException -> 0x0173, Exception -> 0x01b0, all -> 0x0171 }
            com.google.android.recaptcha.RecaptchaErrorCode r1 = com.google.android.recaptcha.RecaptchaErrorCode.INVALID_TIMEOUT     // Catch:{ RecaptchaException -> 0x0173, Exception -> 0x01b0, all -> 0x0171 }
            r3 = 2
            r0.<init>(r1, r7, r3, r7)     // Catch:{ RecaptchaException -> 0x0173, Exception -> 0x01b0, all -> 0x0171 }
            throw r0     // Catch:{ RecaptchaException -> 0x0173, Exception -> 0x01b0, all -> 0x0171 }
        L_0x01ad:
            r1 = r20
            goto L_0x01be
        L_0x01b0:
            r1 = r20
        L_0x01b2:
            com.google.android.recaptcha.RecaptchaException r0 = new com.google.android.recaptcha.RecaptchaException     // Catch:{ all -> 0x0040 }
            com.google.android.recaptcha.RecaptchaErrorCode r3 = com.google.android.recaptcha.RecaptchaErrorCode.INTERNAL_ERROR     // Catch:{ all -> 0x0040 }
            r4 = 2
            r0.<init>(r3, r7, r4, r7)     // Catch:{ all -> 0x0040 }
            throw r0     // Catch:{ all -> 0x0040 }
        L_0x01bb:
            r1 = r20
        L_0x01bd:
            throw r0     // Catch:{ all -> 0x0040 }
        L_0x01be:
            r1.e(r7)
            throw r0
        L_0x01c2:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzam.zza(android.app.Application, java.lang.String, long, com.google.android.recaptcha.internal.zzab, android.webkit.WebView, com.google.android.recaptcha.internal.zzbq, com.google.android.recaptcha.internal.zzt, qf.d):java.lang.Object");
    }
}
