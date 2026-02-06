package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.zzff;

/* renamed from: com.google.android.gms.measurement.internal.d  reason: case insensitive filesystem */
final class C4590d extends M5 {

    /* renamed from: g  reason: collision with root package name */
    private zzff.zze f55032g;

    /* renamed from: h  reason: collision with root package name */
    private final /* synthetic */ J5 f55033h;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C4590d(J5 j52, String str, int i10, zzff.zze zze) {
        super(str, i10);
        this.f55033h = j52;
        this.f55032g = zze;
    }

    /* access modifiers changed from: package-private */
    public final int a() {
        return this.f55032g.zza();
    }

    /* access modifiers changed from: package-private */
    public final boolean i() {
        return false;
    }

    /* access modifiers changed from: package-private */
    public final boolean j() {
        return true;
    }

    /* JADX WARNING: type inference failed for: r4v17, types: [java.lang.Integer] */
    /* access modifiers changed from: package-private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean k(java.lang.Long r11, java.lang.Long r12, com.google.android.gms.internal.measurement.zzfn.zzo r13, boolean r14) {
        /*
            r10 = this;
            boolean r0 = com.google.android.gms.internal.measurement.zzoc.zza()
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L_0x001a
            com.google.android.gms.measurement.internal.J5 r0 = r10.f55033h
            com.google.android.gms.measurement.internal.h r0 = r0.a()
            java.lang.String r3 = r10.f54783a
            com.google.android.gms.measurement.internal.M1 r4 = com.google.android.gms.measurement.internal.F.f54654j0
            boolean r0 = r0.B(r3, r4)
            if (r0 == 0) goto L_0x001a
            r0 = r2
            goto L_0x001b
        L_0x001a:
            r0 = r1
        L_0x001b:
            com.google.android.gms.internal.measurement.zzff$zze r3 = r10.f55032g
            boolean r3 = r3.zzf()
            com.google.android.gms.internal.measurement.zzff$zze r4 = r10.f55032g
            boolean r4 = r4.zzg()
            com.google.android.gms.internal.measurement.zzff$zze r5 = r10.f55032g
            boolean r5 = r5.zzh()
            if (r3 != 0) goto L_0x0036
            if (r4 != 0) goto L_0x0036
            if (r5 == 0) goto L_0x0034
            goto L_0x0036
        L_0x0034:
            r3 = r1
            goto L_0x0037
        L_0x0036:
            r3 = r2
        L_0x0037:
            r4 = 0
            if (r14 == 0) goto L_0x0064
            if (r3 != 0) goto L_0x0064
            com.google.android.gms.measurement.internal.J5 r11 = r10.f55033h
            com.google.android.gms.measurement.internal.V1 r11 = r11.zzj()
            com.google.android.gms.measurement.internal.X1 r11 = r11.F()
            int r12 = r10.f54784b
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
            com.google.android.gms.internal.measurement.zzff$zze r13 = r10.f55032g
            boolean r13 = r13.zzi()
            if (r13 == 0) goto L_0x005e
            com.google.android.gms.internal.measurement.zzff$zze r13 = r10.f55032g
            int r13 = r13.zza()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r13)
        L_0x005e:
            java.lang.String r13 = "Property filter already evaluated true and it is not associated with an enhanced audience. audience ID, filter ID"
            r11.c(r13, r12, r4)
            return r2
        L_0x0064:
            com.google.android.gms.internal.measurement.zzff$zze r6 = r10.f55032g
            com.google.android.gms.internal.measurement.zzff$zzc r6 = r6.zzb()
            boolean r7 = r6.zzf()
            boolean r8 = r13.zzk()
            if (r8 == 0) goto L_0x00ab
            boolean r8 = r6.zzh()
            if (r8 != 0) goto L_0x0099
            com.google.android.gms.measurement.internal.J5 r6 = r10.f55033h
            com.google.android.gms.measurement.internal.V1 r6 = r6.zzj()
            com.google.android.gms.measurement.internal.X1 r6 = r6.G()
            com.google.android.gms.measurement.internal.J5 r7 = r10.f55033h
            com.google.android.gms.measurement.internal.R1 r7 = r7.d()
            java.lang.String r8 = r13.zzg()
            java.lang.String r7 = r7.g(r8)
            java.lang.String r8 = "No number filter for long property. property"
            r6.b(r8, r7)
            goto L_0x0189
        L_0x0099:
            long r8 = r13.zzc()
            com.google.android.gms.internal.measurement.zzff$zzd r4 = r6.zzc()
            java.lang.Boolean r4 = com.google.android.gms.measurement.internal.M5.c(r8, r4)
            java.lang.Boolean r4 = com.google.android.gms.measurement.internal.M5.d(r4, r7)
            goto L_0x0189
        L_0x00ab:
            boolean r8 = r13.zzi()
            if (r8 == 0) goto L_0x00e8
            boolean r8 = r6.zzh()
            if (r8 != 0) goto L_0x00d6
            com.google.android.gms.measurement.internal.J5 r6 = r10.f55033h
            com.google.android.gms.measurement.internal.V1 r6 = r6.zzj()
            com.google.android.gms.measurement.internal.X1 r6 = r6.G()
            com.google.android.gms.measurement.internal.J5 r7 = r10.f55033h
            com.google.android.gms.measurement.internal.R1 r7 = r7.d()
            java.lang.String r8 = r13.zzg()
            java.lang.String r7 = r7.g(r8)
            java.lang.String r8 = "No number filter for double property. property"
            r6.b(r8, r7)
            goto L_0x0189
        L_0x00d6:
            double r8 = r13.zza()
            com.google.android.gms.internal.measurement.zzff$zzd r4 = r6.zzc()
            java.lang.Boolean r4 = com.google.android.gms.measurement.internal.M5.b(r8, r4)
            java.lang.Boolean r4 = com.google.android.gms.measurement.internal.M5.d(r4, r7)
            goto L_0x0189
        L_0x00e8:
            boolean r8 = r13.zzm()
            if (r8 == 0) goto L_0x016c
            boolean r8 = r6.zzj()
            if (r8 != 0) goto L_0x0155
            boolean r8 = r6.zzh()
            if (r8 != 0) goto L_0x0118
            com.google.android.gms.measurement.internal.J5 r6 = r10.f55033h
            com.google.android.gms.measurement.internal.V1 r6 = r6.zzj()
            com.google.android.gms.measurement.internal.X1 r6 = r6.G()
            com.google.android.gms.measurement.internal.J5 r7 = r10.f55033h
            com.google.android.gms.measurement.internal.R1 r7 = r7.d()
            java.lang.String r8 = r13.zzg()
            java.lang.String r7 = r7.g(r8)
            java.lang.String r8 = "No string or number filter defined. property"
            r6.b(r8, r7)
            goto L_0x0189
        L_0x0118:
            java.lang.String r8 = r13.zzh()
            boolean r8 = com.google.android.gms.measurement.internal.x5.c0(r8)
            if (r8 == 0) goto L_0x0133
            java.lang.String r4 = r13.zzh()
            com.google.android.gms.internal.measurement.zzff$zzd r6 = r6.zzc()
            java.lang.Boolean r4 = com.google.android.gms.measurement.internal.M5.e(r4, r6)
            java.lang.Boolean r4 = com.google.android.gms.measurement.internal.M5.d(r4, r7)
            goto L_0x0189
        L_0x0133:
            com.google.android.gms.measurement.internal.J5 r6 = r10.f55033h
            com.google.android.gms.measurement.internal.V1 r6 = r6.zzj()
            com.google.android.gms.measurement.internal.X1 r6 = r6.G()
            com.google.android.gms.measurement.internal.J5 r7 = r10.f55033h
            com.google.android.gms.measurement.internal.R1 r7 = r7.d()
            java.lang.String r8 = r13.zzg()
            java.lang.String r7 = r7.g(r8)
            java.lang.String r8 = r13.zzh()
            java.lang.String r9 = "Invalid user property value for Numeric number filter. property, value"
            r6.c(r9, r7, r8)
            goto L_0x0189
        L_0x0155:
            java.lang.String r4 = r13.zzh()
            com.google.android.gms.internal.measurement.zzff$zzf r6 = r6.zzd()
            com.google.android.gms.measurement.internal.J5 r8 = r10.f55033h
            com.google.android.gms.measurement.internal.V1 r8 = r8.zzj()
            java.lang.Boolean r4 = com.google.android.gms.measurement.internal.M5.g(r4, r6, r8)
            java.lang.Boolean r4 = com.google.android.gms.measurement.internal.M5.d(r4, r7)
            goto L_0x0189
        L_0x016c:
            com.google.android.gms.measurement.internal.J5 r6 = r10.f55033h
            com.google.android.gms.measurement.internal.V1 r6 = r6.zzj()
            com.google.android.gms.measurement.internal.X1 r6 = r6.G()
            com.google.android.gms.measurement.internal.J5 r7 = r10.f55033h
            com.google.android.gms.measurement.internal.R1 r7 = r7.d()
            java.lang.String r8 = r13.zzg()
            java.lang.String r7 = r7.g(r8)
            java.lang.String r8 = "User property has no value, property"
            r6.b(r8, r7)
        L_0x0189:
            com.google.android.gms.measurement.internal.J5 r6 = r10.f55033h
            com.google.android.gms.measurement.internal.V1 r6 = r6.zzj()
            com.google.android.gms.measurement.internal.X1 r6 = r6.F()
            if (r4 != 0) goto L_0x0198
            java.lang.String r7 = "null"
            goto L_0x0199
        L_0x0198:
            r7 = r4
        L_0x0199:
            java.lang.String r8 = "Property filter result"
            r6.b(r8, r7)
            if (r4 != 0) goto L_0x01a1
            return r1
        L_0x01a1:
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            r10.f54785c = r1
            if (r5 == 0) goto L_0x01ae
            boolean r1 = r4.booleanValue()
            if (r1 != 0) goto L_0x01ae
            return r2
        L_0x01ae:
            if (r14 == 0) goto L_0x01b8
            com.google.android.gms.internal.measurement.zzff$zze r14 = r10.f55032g
            boolean r14 = r14.zzf()
            if (r14 == 0) goto L_0x01ba
        L_0x01b8:
            r10.f54786d = r4
        L_0x01ba:
            boolean r14 = r4.booleanValue()
            if (r14 == 0) goto L_0x01ff
            if (r3 == 0) goto L_0x01ff
            boolean r14 = r13.zzl()
            if (r14 == 0) goto L_0x01ff
            long r13 = r13.zzd()
            if (r11 == 0) goto L_0x01d2
            long r13 = r11.longValue()
        L_0x01d2:
            if (r0 == 0) goto L_0x01ea
            com.google.android.gms.internal.measurement.zzff$zze r11 = r10.f55032g
            boolean r11 = r11.zzf()
            if (r11 == 0) goto L_0x01ea
            com.google.android.gms.internal.measurement.zzff$zze r11 = r10.f55032g
            boolean r11 = r11.zzg()
            if (r11 != 0) goto L_0x01ea
            if (r12 == 0) goto L_0x01ea
            long r13 = r12.longValue()
        L_0x01ea:
            com.google.android.gms.internal.measurement.zzff$zze r11 = r10.f55032g
            boolean r11 = r11.zzg()
            if (r11 == 0) goto L_0x01f9
            java.lang.Long r11 = java.lang.Long.valueOf(r13)
            r10.f54788f = r11
            goto L_0x01ff
        L_0x01f9:
            java.lang.Long r11 = java.lang.Long.valueOf(r13)
            r10.f54787e = r11
        L_0x01ff:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C4590d.k(java.lang.Long, java.lang.Long, com.google.android.gms.internal.measurement.zzfn$zzo, boolean):boolean");
    }
}
