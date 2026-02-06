package com.google.android.recaptcha;

import android.app.Application;
import com.google.android.gms.tasks.Task;
import com.google.android.recaptcha.internal.zzam;
import kotlin.Metadata;
import qf.C6658d;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J%\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\n\u0010\u000bJ-\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\fH\u0007¢\u0006\u0004\b\n\u0010\u000eJ6\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\r\u001a\u00020\fH@ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0011\u0010\u0012\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006\u0014"}, d2 = {"Lcom/google/android/recaptcha/Recaptcha;", "", "<init>", "()V", "Landroid/app/Application;", "application", "", "siteKey", "Lcom/google/android/gms/tasks/Task;", "Lcom/google/android/recaptcha/RecaptchaTasksClient;", "getTasksClient", "(Landroid/app/Application;Ljava/lang/String;)Lcom/google/android/gms/tasks/Task;", "", "timeout", "(Landroid/app/Application;Ljava/lang/String;J)Lcom/google/android/gms/tasks/Task;", "Llf/v;", "Lcom/google/android/recaptcha/RecaptchaClient;", "getClient-BWLJW6A", "(Landroid/app/Application;Ljava/lang/String;JLqf/d;)Ljava/lang/Object;", "getClient", "java.com.google.android.libraries.abuse.recaptcha.enterprise_enterprise"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class Recaptcha {
    public static final Recaptcha INSTANCE = new Recaptcha();

    private Recaptcha() {
    }

    /* renamed from: getClient-BWLJW6A$default  reason: not valid java name */
    public static /* synthetic */ Object m19getClientBWLJW6A$default(Recaptcha recaptcha, Application application, String str, long j10, C6658d dVar, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            j10 = 10000;
        }
        return recaptcha.m20getClientBWLJW6A(application, str, j10, dVar);
    }

    public static final Task<RecaptchaTasksClient> getTasksClient(Application application, String str) {
        return zzam.zzd(application, str, 10000);
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0025  */
    /* renamed from: getClient-BWLJW6A  reason: not valid java name */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object m20getClientBWLJW6A(android.app.Application r8, java.lang.String r9, long r10, qf.C6658d<? super lf.v> r12) {
        /*
            r7 = this;
            boolean r0 = r12 instanceof com.google.android.recaptcha.Recaptcha$getClient$1
            if (r0 == 0) goto L_0x0014
            r0 = r12
            com.google.android.recaptcha.Recaptcha$getClient$1 r0 = (com.google.android.recaptcha.Recaptcha$getClient$1) r0
            int r1 = r0.zzc
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0014
            int r1 = r1 - r2
            r0.zzc = r1
        L_0x0012:
            r6 = r0
            goto L_0x001a
        L_0x0014:
            com.google.android.recaptcha.Recaptcha$getClient$1 r0 = new com.google.android.recaptcha.Recaptcha$getClient$1
            r0.<init>(r7, r12)
            goto L_0x0012
        L_0x001a:
            java.lang.Object r12 = r6.zza
            java.lang.Object r0 = rf.C6680b.f()
            int r1 = r6.zzc
            r2 = 1
            if (r1 == 0) goto L_0x0035
            if (r1 != r2) goto L_0x002d
            lf.w.b(r12)     // Catch:{ all -> 0x002b }
            goto L_0x0049
        L_0x002b:
            r8 = move-exception
            goto L_0x0050
        L_0x002d:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L_0x0035:
            lf.w.b(r12)
            lf.v$a r12 = lf.v.f71841b     // Catch:{ all -> 0x002b }
            com.google.android.recaptcha.internal.zzam r12 = com.google.android.recaptcha.internal.zzam.zza     // Catch:{ all -> 0x002b }
            r6.zzc = r2     // Catch:{ all -> 0x002b }
            r5 = 0
            r1 = r8
            r2 = r9
            r3 = r10
            java.lang.Object r12 = com.google.android.recaptcha.internal.zzam.zzc(r1, r2, r3, r5, r6)     // Catch:{ all -> 0x002b }
            if (r12 != r0) goto L_0x0049
            return r0
        L_0x0049:
            com.google.android.recaptcha.internal.zzaw r12 = (com.google.android.recaptcha.internal.zzaw) r12     // Catch:{ all -> 0x002b }
            java.lang.Object r8 = lf.v.b(r12)     // Catch:{ all -> 0x002b }
            goto L_0x005a
        L_0x0050:
            lf.v$a r9 = lf.v.f71841b
            java.lang.Object r8 = lf.w.a(r8)
            java.lang.Object r8 = lf.v.b(r8)
        L_0x005a:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.Recaptcha.m20getClientBWLJW6A(android.app.Application, java.lang.String, long, qf.d):java.lang.Object");
    }

    public static final Task<RecaptchaTasksClient> getTasksClient(Application application, String str, long j10) {
        return zzam.zzd(application, str, j10);
    }
}
