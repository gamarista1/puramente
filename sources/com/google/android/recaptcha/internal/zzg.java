package com.google.android.recaptcha.internal;

import Ug.L;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mf.C6565s;
import qf.C6658d;

public final class zzg {
    private final List zza;

    public zzg() {
        this((List) null, 1, (DefaultConstructorMarker) null);
    }

    public final Object zza(String str, long j10, C6658d dVar) {
        return L.e(new zzc(this, str, j10, (C6658d) null), dVar);
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object zzb(long r11, com.google.android.recaptcha.internal.zzoe r13, qf.C6658d r14) {
        /*
            r10 = this;
            boolean r0 = r14 instanceof com.google.android.recaptcha.internal.zzd
            if (r0 == 0) goto L_0x0013
            r0 = r14
            com.google.android.recaptcha.internal.zzd r0 = (com.google.android.recaptcha.internal.zzd) r0
            int r1 = r0.zzc
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.zzc = r1
            goto L_0x0018
        L_0x0013:
            com.google.android.recaptcha.internal.zzd r0 = new com.google.android.recaptcha.internal.zzd
            r0.<init>(r10, r14)
        L_0x0018:
            java.lang.Object r14 = r0.zza
            java.lang.Object r1 = rf.C6680b.f()
            int r2 = r0.zzc
            r3 = 1
            if (r2 == 0) goto L_0x0031
            if (r2 != r3) goto L_0x0029
            lf.w.b(r14)
            goto L_0x0047
        L_0x0029:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L_0x0031:
            lf.w.b(r14)
            com.google.android.recaptcha.internal.zzf r14 = new com.google.android.recaptcha.internal.zzf
            r9 = 0
            r4 = r14
            r5 = r10
            r6 = r11
            r8 = r13
            r4.<init>(r5, r6, r8, r9)
            r0.zzc = r3
            java.lang.Object r14 = Ug.L.e(r14, r0)
            if (r14 != r1) goto L_0x0047
            return r1
        L_0x0047:
            lf.v r14 = (lf.v) r14
            java.lang.Object r11 = r14.j()
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzg.zzb(long, com.google.android.recaptcha.internal.zzoe, qf.d):java.lang.Object");
    }

    public final List zzc() {
        return this.zza;
    }

    public final void zzd(zza zza2) {
        this.zza.add(zza2);
    }

    public /* synthetic */ zzg(List list, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        List n10 = C6565s.n();
        ArrayList arrayList = new ArrayList();
        this.zza = arrayList;
        arrayList.addAll(n10);
    }
}
