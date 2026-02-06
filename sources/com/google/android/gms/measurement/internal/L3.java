package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.zzdg;

final class L3 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ zzdg f54759a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ C4643k3 f54760b;

    L3(C4643k3 k3Var, zzdg zzdg) {
        this.f54759a = zzdg;
        this.f54760b = k3Var;
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0057  */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0069 A[SYNTHETIC, Splitter:B:12:0x0069] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r7 = this;
            com.google.android.gms.measurement.internal.k3 r0 = r7.f54760b
            com.google.android.gms.measurement.internal.V4 r0 = r0.p()
            com.google.android.gms.measurement.internal.g2 r1 = r0.e()
            com.google.android.gms.measurement.internal.h3 r1 = r1.H()
            boolean r1 = r1.B()
            r2 = 0
            if (r1 != 0) goto L_0x0024
            com.google.android.gms.measurement.internal.V1 r0 = r0.zzj()
            com.google.android.gms.measurement.internal.X1 r0 = r0.H()
            java.lang.String r1 = "Analytics storage consent denied; will not get session id"
            r0.a(r1)
        L_0x0022:
            r0 = r2
            goto L_0x0055
        L_0x0024:
            com.google.android.gms.measurement.internal.g2 r1 = r0.e()
            Ea.e r3 = r0.zzb()
            long r3 = r3.currentTimeMillis()
            boolean r1 = r1.u(r3)
            if (r1 != 0) goto L_0x0022
            com.google.android.gms.measurement.internal.g2 r1 = r0.e()
            com.google.android.gms.measurement.internal.l2 r1 = r1.f55105s
            long r3 = r1.a()
            r5 = 0
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 != 0) goto L_0x0047
            goto L_0x0022
        L_0x0047:
            com.google.android.gms.measurement.internal.g2 r0 = r0.e()
            com.google.android.gms.measurement.internal.l2 r0 = r0.f55105s
            long r0 = r0.a()
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
        L_0x0055:
            if (r0 == 0) goto L_0x0069
            com.google.android.gms.measurement.internal.k3 r1 = r7.f54760b
            com.google.android.gms.measurement.internal.E2 r1 = r1.f55074a
            com.google.android.gms.measurement.internal.B5 r1 = r1.G()
            com.google.android.gms.internal.measurement.zzdg r2 = r7.f54759a
            long r3 = r0.longValue()
            r1.L(r2, r3)
            return
        L_0x0069:
            com.google.android.gms.internal.measurement.zzdg r0 = r7.f54759a     // Catch:{ RemoteException -> 0x006f }
            r0.zza(r2)     // Catch:{ RemoteException -> 0x006f }
            return
        L_0x006f:
            r0 = move-exception
            com.google.android.gms.measurement.internal.k3 r1 = r7.f54760b
            com.google.android.gms.measurement.internal.E2 r1 = r1.f55074a
            com.google.android.gms.measurement.internal.V1 r1 = r1.zzj()
            com.google.android.gms.measurement.internal.X1 r1 = r1.B()
            java.lang.String r2 = "getSessionId failed with exception"
            r1.b(r2, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.L3.run():void");
    }
}
