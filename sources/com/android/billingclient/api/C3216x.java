package com.android.billingclient.api;

import J4.C3037c;
import J4.t;
import android.content.ComponentName;
import android.content.ServiceConnection;
import com.google.android.gms.internal.play_billing.zze;
import com.google.android.gms.internal.play_billing.zzjx;
import com.google.android.gms.internal.play_billing.zzjz;
import com.google.android.gms.internal.play_billing.zzke;
import com.google.android.gms.internal.play_billing.zzki;
import com.google.android.gms.internal.play_billing.zzkl;
import com.google.android.gms.internal.play_billing.zzlu;

/* renamed from: com.android.billingclient.api.x  reason: case insensitive filesystem */
final class C3216x implements ServiceConnection {

    /* renamed from: a  reason: collision with root package name */
    private final C3037c f38351a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ C3195b f38352b;

    /* synthetic */ C3216x(C3195b bVar, C3037c cVar, t tVar) {
        this.f38352b = bVar;
        this.f38351a = cVar;
    }

    private final void c(C3198e eVar) {
        synchronized (this.f38352b.f38207a) {
            try {
                if (this.f38352b.f38208b != 3) {
                    this.f38351a.onBillingSetupFinished(eVar);
                }
            } catch (Throwable th2) {
                while (true) {
                    throw th2;
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:169:0x0273  */
    /* JADX WARNING: Removed duplicated region for block: B:170:0x0278  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* synthetic */ java.lang.Object a() {
        /*
            r15 = this;
            com.android.billingclient.api.b r0 = r15.f38352b
            java.lang.Object r0 = r0.f38207a
            monitor-enter(r0)
            com.android.billingclient.api.b r1 = r15.f38352b     // Catch:{ all -> 0x0014 }
            int r1 = r1.f38208b     // Catch:{ all -> 0x0014 }
            r2 = 3
            r3 = 0
            if (r1 != r2) goto L_0x0017
            monitor-exit(r0)     // Catch:{ all -> 0x0014 }
            goto L_0x0305
        L_0x0014:
            r1 = move-exception
            goto L_0x0306
        L_0x0017:
            com.android.billingclient.api.b r1 = r15.f38352b     // Catch:{ all -> 0x0014 }
            int r1 = r1.f38208b     // Catch:{ all -> 0x0014 }
            monitor-exit(r0)     // Catch:{ all -> 0x0014 }
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            if (r0 != 0) goto L_0x0040
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            java.lang.String r4 = "accountName"
            r0.putString(r4, r3)
            com.android.billingclient.api.b r4 = r15.f38352b
            java.lang.String r5 = r4.f38209c
            java.lang.Long r4 = r4.f38206F
            long r6 = r4.longValue()
            com.google.android.gms.internal.play_billing.zze.zzc(r0, r5, r6)
            goto L_0x0041
        L_0x0040:
            r0 = r3
        L_0x0041:
            r4 = 6
            r5 = 0
            r6 = 1
            com.android.billingclient.api.b r7 = r15.f38352b     // Catch:{ Exception -> 0x0067 }
            java.lang.Object r7 = r7.f38207a     // Catch:{ Exception -> 0x0067 }
            monitor-enter(r7)     // Catch:{ Exception -> 0x0067 }
            com.android.billingclient.api.b r8 = r15.f38352b     // Catch:{ all -> 0x0249 }
            com.google.android.gms.internal.play_billing.zzan r8 = r8.f38214h     // Catch:{ all -> 0x0249 }
            monitor-exit(r7)     // Catch:{ all -> 0x0249 }
            if (r8 != 0) goto L_0x006a
            com.android.billingclient.api.b r0 = r15.f38352b     // Catch:{ Exception -> 0x0067 }
            r0.U(r5)     // Catch:{ Exception -> 0x0067 }
            com.android.billingclient.api.b r0 = r15.f38352b     // Catch:{ Exception -> 0x0067 }
            com.android.billingclient.api.e r2 = com.android.billingclient.api.O.f38145m     // Catch:{ Exception -> 0x0067 }
            r7 = 119(0x77, float:1.67E-43)
            r0.A0(r7, 6, r2)     // Catch:{ Exception -> 0x0067 }
            r15.c(r2)     // Catch:{ Exception -> 0x0067 }
            goto L_0x0305
        L_0x0067:
            r0 = move-exception
            goto L_0x024c
        L_0x006a:
            com.android.billingclient.api.b r7 = r15.f38352b     // Catch:{ Exception -> 0x0067 }
            android.content.Context r7 = r7.f38212f     // Catch:{ Exception -> 0x0067 }
            java.lang.String r7 = r7.getPackageName()     // Catch:{ Exception -> 0x0067 }
            r9 = 23
            r11 = r2
            r10 = r9
        L_0x0078:
            if (r10 < r2) goto L_0x00a5
            if (r0 != 0) goto L_0x0083
            java.lang.String r11 = "subs"
            int r11 = r8.zzy(r10, r7, r11)     // Catch:{ Exception -> 0x0067 }
            goto L_0x0089
        L_0x0083:
            java.lang.String r11 = "subs"
            int r11 = r8.zzc(r10, r7, r11, r0)     // Catch:{ Exception -> 0x0067 }
        L_0x0089:
            if (r11 != 0) goto L_0x00a2
            java.lang.String r12 = "BillingClient"
            java.lang.StringBuilder r13 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0067 }
            r13.<init>()     // Catch:{ Exception -> 0x0067 }
            java.lang.String r14 = "highestLevelSupportedForSubs: "
            r13.append(r14)     // Catch:{ Exception -> 0x0067 }
            r13.append(r10)     // Catch:{ Exception -> 0x0067 }
            java.lang.String r13 = r13.toString()     // Catch:{ Exception -> 0x0067 }
            com.google.android.gms.internal.play_billing.zze.zzk(r12, r13)     // Catch:{ Exception -> 0x0067 }
            goto L_0x00a6
        L_0x00a2:
            int r10 = r10 + -1
            goto L_0x0078
        L_0x00a5:
            r10 = r5
        L_0x00a6:
            com.android.billingclient.api.b r12 = r15.f38352b     // Catch:{ Exception -> 0x0067 }
            r13 = 5
            if (r10 < r13) goto L_0x00ad
            r13 = r6
            goto L_0x00ae
        L_0x00ad:
            r13 = r5
        L_0x00ae:
            r12.f38217k = r13     // Catch:{ Exception -> 0x0067 }
            com.android.billingclient.api.b r12 = r15.f38352b     // Catch:{ Exception -> 0x0067 }
            if (r10 < r2) goto L_0x00b7
            r13 = r6
            goto L_0x00b8
        L_0x00b7:
            r13 = r5
        L_0x00b8:
            r12.f38216j = r13     // Catch:{ Exception -> 0x0067 }
            r12 = 9
            if (r10 >= r2) goto L_0x00c8
            java.lang.String r10 = "BillingClient"
            java.lang.String r13 = "In-app billing API does not support subscription on this device."
            com.google.android.gms.internal.play_billing.zze.zzk(r10, r13)     // Catch:{ Exception -> 0x0067 }
            r10 = r12
            goto L_0x00c9
        L_0x00c8:
            r10 = r6
        L_0x00c9:
            r13 = r9
        L_0x00ca:
            if (r13 < r2) goto L_0x0102
            if (r0 != 0) goto L_0x00d5
            java.lang.String r11 = "inapp"
            int r11 = r8.zzy(r13, r7, r11)     // Catch:{ Exception -> 0x0067 }
            goto L_0x00db
        L_0x00d5:
            java.lang.String r11 = "inapp"
            int r11 = r8.zzc(r13, r7, r11, r0)     // Catch:{ Exception -> 0x0067 }
        L_0x00db:
            if (r11 != 0) goto L_0x00ff
            com.android.billingclient.api.b r0 = r15.f38352b     // Catch:{ Exception -> 0x0067 }
            r0.f38218l = r13     // Catch:{ Exception -> 0x0067 }
            java.lang.String r0 = "BillingClient"
            com.android.billingclient.api.b r7 = r15.f38352b     // Catch:{ Exception -> 0x0067 }
            int r7 = r7.f38218l     // Catch:{ Exception -> 0x0067 }
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0067 }
            r8.<init>()     // Catch:{ Exception -> 0x0067 }
            java.lang.String r13 = "mHighestLevelSupportedForInApp: "
            r8.append(r13)     // Catch:{ Exception -> 0x0067 }
            r8.append(r7)     // Catch:{ Exception -> 0x0067 }
            java.lang.String r7 = r8.toString()     // Catch:{ Exception -> 0x0067 }
            com.google.android.gms.internal.play_billing.zze.zzk(r0, r7)     // Catch:{ Exception -> 0x0067 }
            goto L_0x0102
        L_0x00ff:
            int r13 = r13 + -1
            goto L_0x00ca
        L_0x0102:
            com.android.billingclient.api.b r0 = r15.f38352b     // Catch:{ Exception -> 0x0067 }
            int r7 = r0.f38218l     // Catch:{ Exception -> 0x0067 }
            if (r7 < r9) goto L_0x010c
            r7 = r6
            goto L_0x010d
        L_0x010c:
            r7 = r5
        L_0x010d:
            r0.f38201A = r7     // Catch:{ Exception -> 0x0067 }
            com.android.billingclient.api.b r0 = r15.f38352b     // Catch:{ Exception -> 0x0067 }
            int r7 = r0.f38218l     // Catch:{ Exception -> 0x0067 }
            r8 = 22
            if (r7 < r8) goto L_0x011c
            r7 = r6
            goto L_0x011d
        L_0x011c:
            r7 = r5
        L_0x011d:
            r0.f38232z = r7     // Catch:{ Exception -> 0x0067 }
            com.android.billingclient.api.b r0 = r15.f38352b     // Catch:{ Exception -> 0x0067 }
            int r7 = r0.f38218l     // Catch:{ Exception -> 0x0067 }
            r8 = 21
            if (r7 < r8) goto L_0x012c
            r7 = r6
            goto L_0x012d
        L_0x012c:
            r7 = r5
        L_0x012d:
            r0.f38231y = r7     // Catch:{ Exception -> 0x0067 }
            com.android.billingclient.api.b r0 = r15.f38352b     // Catch:{ Exception -> 0x0067 }
            int r7 = r0.f38218l     // Catch:{ Exception -> 0x0067 }
            r8 = 20
            if (r7 < r8) goto L_0x013c
            r7 = r6
            goto L_0x013d
        L_0x013c:
            r7 = r5
        L_0x013d:
            r0.f38230x = r7     // Catch:{ Exception -> 0x0067 }
            com.android.billingclient.api.b r0 = r15.f38352b     // Catch:{ Exception -> 0x0067 }
            int r7 = r0.f38218l     // Catch:{ Exception -> 0x0067 }
            r8 = 19
            if (r7 < r8) goto L_0x014c
            r7 = r6
            goto L_0x014d
        L_0x014c:
            r7 = r5
        L_0x014d:
            r0.f38229w = r7     // Catch:{ Exception -> 0x0067 }
            com.android.billingclient.api.b r0 = r15.f38352b     // Catch:{ Exception -> 0x0067 }
            int r7 = r0.f38218l     // Catch:{ Exception -> 0x0067 }
            r8 = 18
            if (r7 < r8) goto L_0x015c
            r7 = r6
            goto L_0x015d
        L_0x015c:
            r7 = r5
        L_0x015d:
            r0.f38228v = r7     // Catch:{ Exception -> 0x0067 }
            com.android.billingclient.api.b r0 = r15.f38352b     // Catch:{ Exception -> 0x0067 }
            int r7 = r0.f38218l     // Catch:{ Exception -> 0x0067 }
            r8 = 17
            if (r7 < r8) goto L_0x016c
            r7 = r6
            goto L_0x016d
        L_0x016c:
            r7 = r5
        L_0x016d:
            r0.f38227u = r7     // Catch:{ Exception -> 0x0067 }
            com.android.billingclient.api.b r0 = r15.f38352b     // Catch:{ Exception -> 0x0067 }
            int r7 = r0.f38218l     // Catch:{ Exception -> 0x0067 }
            r8 = 16
            if (r7 < r8) goto L_0x017c
            r7 = r6
            goto L_0x017d
        L_0x017c:
            r7 = r5
        L_0x017d:
            r0.f38226t = r7     // Catch:{ Exception -> 0x0067 }
            com.android.billingclient.api.b r0 = r15.f38352b     // Catch:{ Exception -> 0x0067 }
            int r7 = r0.f38218l     // Catch:{ Exception -> 0x0067 }
            r8 = 15
            if (r7 < r8) goto L_0x018c
            r7 = r6
            goto L_0x018d
        L_0x018c:
            r7 = r5
        L_0x018d:
            r0.f38225s = r7     // Catch:{ Exception -> 0x0067 }
            com.android.billingclient.api.b r0 = r15.f38352b     // Catch:{ Exception -> 0x0067 }
            int r7 = r0.f38218l     // Catch:{ Exception -> 0x0067 }
            r8 = 14
            if (r7 < r8) goto L_0x019c
            r7 = r6
            goto L_0x019d
        L_0x019c:
            r7 = r5
        L_0x019d:
            r0.f38224r = r7     // Catch:{ Exception -> 0x0067 }
            com.android.billingclient.api.b r0 = r15.f38352b     // Catch:{ Exception -> 0x0067 }
            int r7 = r0.f38218l     // Catch:{ Exception -> 0x0067 }
            r8 = 12
            if (r7 < r8) goto L_0x01ac
            r7 = r6
            goto L_0x01ad
        L_0x01ac:
            r7 = r5
        L_0x01ad:
            r0.f38223q = r7     // Catch:{ Exception -> 0x0067 }
            com.android.billingclient.api.b r0 = r15.f38352b     // Catch:{ Exception -> 0x0067 }
            int r7 = r0.f38218l     // Catch:{ Exception -> 0x0067 }
            r8 = 10
            if (r7 < r8) goto L_0x01bc
            r7 = r6
            goto L_0x01bd
        L_0x01bc:
            r7 = r5
        L_0x01bd:
            r0.f38222p = r7     // Catch:{ Exception -> 0x0067 }
            com.android.billingclient.api.b r0 = r15.f38352b     // Catch:{ Exception -> 0x0067 }
            int r7 = r0.f38218l     // Catch:{ Exception -> 0x0067 }
            if (r7 < r12) goto L_0x01ca
            r7 = r6
            goto L_0x01cb
        L_0x01ca:
            r7 = r5
        L_0x01cb:
            r0.f38221o = r7     // Catch:{ Exception -> 0x0067 }
            com.android.billingclient.api.b r0 = r15.f38352b     // Catch:{ Exception -> 0x0067 }
            int r7 = r0.f38218l     // Catch:{ Exception -> 0x0067 }
            r8 = 8
            if (r7 < r8) goto L_0x01da
            r7 = r6
            goto L_0x01db
        L_0x01da:
            r7 = r5
        L_0x01db:
            r0.f38220n = r7     // Catch:{ Exception -> 0x0067 }
            com.android.billingclient.api.b r0 = r15.f38352b     // Catch:{ Exception -> 0x0067 }
            int r7 = r0.f38218l     // Catch:{ Exception -> 0x0067 }
            if (r7 < r4) goto L_0x01e8
            r7 = r6
            goto L_0x01e9
        L_0x01e8:
            r7 = r5
        L_0x01e9:
            r0.f38219m = r7     // Catch:{ Exception -> 0x0067 }
            com.android.billingclient.api.b r0 = r15.f38352b     // Catch:{ Exception -> 0x0067 }
            int r0 = r0.f38218l     // Catch:{ Exception -> 0x0067 }
            if (r0 >= r2) goto L_0x01fd
            java.lang.String r0 = "BillingClient"
            java.lang.String r7 = "In-app billing API version 3 is not supported on this device."
            com.google.android.gms.internal.play_billing.zze.zzl(r0, r7)     // Catch:{ Exception -> 0x0067 }
            r10 = 36
        L_0x01fd:
            if (r11 != 0) goto L_0x023e
            com.android.billingclient.api.b r0 = r15.f38352b     // Catch:{ Exception -> 0x0067 }
            java.lang.Object r0 = r0.f38207a     // Catch:{ Exception -> 0x0067 }
            monitor-enter(r0)     // Catch:{ Exception -> 0x0067 }
            com.android.billingclient.api.b r7 = r15.f38352b     // Catch:{ all -> 0x0211 }
            int r7 = r7.f38208b     // Catch:{ all -> 0x0211 }
            if (r7 != r2) goto L_0x0213
            monitor-exit(r0)     // Catch:{ all -> 0x0211 }
            goto L_0x0305
        L_0x0211:
            r2 = move-exception
            goto L_0x023c
        L_0x0213:
            if (r1 != r6) goto L_0x0217
            r2 = r5
            goto L_0x0218
        L_0x0217:
            r2 = r6
        L_0x0218:
            com.android.billingclient.api.b r7 = r15.f38352b     // Catch:{ all -> 0x0211 }
            r8 = 2
            r7.U(r8)     // Catch:{ all -> 0x0211 }
            com.android.billingclient.api.b r7 = r15.f38352b     // Catch:{ all -> 0x0211 }
            com.android.billingclient.api.Y r7 = r7.f38211e     // Catch:{ all -> 0x0211 }
            if (r7 == 0) goto L_0x022d
            com.android.billingclient.api.b r7 = r15.f38352b     // Catch:{ all -> 0x0211 }
            com.android.billingclient.api.Y r7 = r7.f38211e     // Catch:{ all -> 0x0211 }
            goto L_0x022e
        L_0x022d:
            r7 = r3
        L_0x022e:
            monitor-exit(r0)     // Catch:{ all -> 0x0211 }
            if (r7 == 0) goto L_0x023a
            com.android.billingclient.api.b r0 = r15.f38352b     // Catch:{ Exception -> 0x0067 }
            boolean r0 = r0.f38231y     // Catch:{ Exception -> 0x0067 }
            r7.g(r0)     // Catch:{ Exception -> 0x0067 }
        L_0x023a:
            r0 = r3
            goto L_0x027f
        L_0x023c:
            monitor-exit(r0)     // Catch:{ all -> 0x0211 }
            throw r2     // Catch:{ Exception -> 0x0067 }
        L_0x023e:
            if (r1 != r6) goto L_0x0242
            r2 = r5
            goto L_0x0243
        L_0x0242:
            r2 = r6
        L_0x0243:
            com.android.billingclient.api.b r0 = r15.f38352b     // Catch:{ Exception -> 0x0067 }
            r0.U(r5)     // Catch:{ Exception -> 0x0067 }
            goto L_0x023a
        L_0x0249:
            r0 = move-exception
            monitor-exit(r7)     // Catch:{ all -> 0x0249 }
            throw r0     // Catch:{ Exception -> 0x0067 }
        L_0x024c:
            if (r1 != r6) goto L_0x0250
            r2 = r5
            goto L_0x0251
        L_0x0250:
            r2 = r6
        L_0x0251:
            java.lang.String r1 = "BillingClient"
            java.lang.String r7 = "Exception while checking if billing is supported; try to reconnect"
            com.google.android.gms.internal.play_billing.zze.zzm(r1, r7, r0)
            boolean r1 = r0 instanceof android.os.DeadObjectException
            r7 = 42
            if (r1 == 0) goto L_0x0262
            r1 = 101(0x65, float:1.42E-43)
        L_0x0260:
            r10 = r1
            goto L_0x0271
        L_0x0262:
            boolean r1 = r0 instanceof android.os.RemoteException
            if (r1 == 0) goto L_0x0269
            r1 = 100
            goto L_0x0260
        L_0x0269:
            boolean r1 = r0 instanceof java.lang.SecurityException
            if (r1 == 0) goto L_0x0270
            r1 = 102(0x66, float:1.43E-43)
            goto L_0x0260
        L_0x0270:
            r10 = r7
        L_0x0271:
            if (r10 != r7) goto L_0x0278
            java.lang.String r0 = com.android.billingclient.api.M.a(r0)
            goto L_0x0279
        L_0x0278:
            r0 = r3
        L_0x0279:
            com.android.billingclient.api.b r1 = r15.f38352b
            r1.U(r5)
            r11 = r4
        L_0x027f:
            if (r11 != 0) goto L_0x02b6
            if (r6 == r2) goto L_0x028b
            com.android.billingclient.api.b r0 = r15.f38352b     // Catch:{ all -> 0x0289 }
            r0.C0(6)     // Catch:{ all -> 0x0289 }
            goto L_0x02b0
        L_0x0289:
            r0 = move-exception
            goto L_0x02a9
        L_0x028b:
            com.android.billingclient.api.b r0 = r15.f38352b     // Catch:{ all -> 0x0289 }
            com.android.billingclient.api.N r0 = r0.f38213g     // Catch:{ all -> 0x0289 }
            com.google.android.gms.internal.play_billing.zzlo r1 = com.google.android.gms.internal.play_billing.zzlq.zzc()     // Catch:{ all -> 0x0289 }
            com.google.android.gms.internal.play_billing.zzke r2 = com.google.android.gms.internal.play_billing.zzki.zzc()     // Catch:{ all -> 0x0289 }
            r2.zzn(r5)     // Catch:{ all -> 0x0289 }
            r1.zza(r2)     // Catch:{ all -> 0x0289 }
            com.google.android.gms.internal.play_billing.zzhk r1 = r1.zzf()     // Catch:{ all -> 0x0289 }
            com.google.android.gms.internal.play_billing.zzlq r1 = (com.google.android.gms.internal.play_billing.zzlq) r1     // Catch:{ all -> 0x0289 }
            r0.b(r1)     // Catch:{ all -> 0x0289 }
            goto L_0x02b0
        L_0x02a9:
            java.lang.String r1 = "BillingClient"
            java.lang.String r2 = "Unable to log."
            com.google.android.gms.internal.play_billing.zze.zzm(r1, r2, r0)
        L_0x02b0:
            com.android.billingclient.api.e r0 = com.android.billingclient.api.O.f38144l
            r15.c(r0)
            goto L_0x0305
        L_0x02b6:
            com.android.billingclient.api.e r1 = com.android.billingclient.api.O.f38133a
            if (r6 == r2) goto L_0x02c2
            com.android.billingclient.api.b r2 = r15.f38352b     // Catch:{ all -> 0x02c0 }
            r2.B0(r10, 6, r1, r0)     // Catch:{ all -> 0x02c0 }
            goto L_0x0300
        L_0x02c0:
            r0 = move-exception
            goto L_0x02f9
        L_0x02c2:
            com.google.android.gms.internal.play_billing.zzke r2 = com.google.android.gms.internal.play_billing.zzki.zzc()     // Catch:{ all -> 0x02c0 }
            int r4 = r1.b()     // Catch:{ all -> 0x02c0 }
            r2.zzn(r4)     // Catch:{ all -> 0x02c0 }
            java.lang.String r1 = r1.a()     // Catch:{ all -> 0x02c0 }
            r2.zzm(r1)     // Catch:{ all -> 0x02c0 }
            r2.zzo(r10)     // Catch:{ all -> 0x02c0 }
            if (r0 == 0) goto L_0x02dc
            r2.zza(r0)     // Catch:{ all -> 0x02c0 }
        L_0x02dc:
            com.android.billingclient.api.b r0 = r15.f38352b     // Catch:{ all -> 0x02c0 }
            com.android.billingclient.api.N r0 = r0.f38213g     // Catch:{ all -> 0x02c0 }
            com.google.android.gms.internal.play_billing.zzlo r1 = com.google.android.gms.internal.play_billing.zzlq.zzc()     // Catch:{ all -> 0x02c0 }
            com.google.android.gms.internal.play_billing.zzhk r2 = r2.zzf()     // Catch:{ all -> 0x02c0 }
            com.google.android.gms.internal.play_billing.zzki r2 = (com.google.android.gms.internal.play_billing.zzki) r2     // Catch:{ all -> 0x02c0 }
            r1.zzm(r2)     // Catch:{ all -> 0x02c0 }
            com.google.android.gms.internal.play_billing.zzhk r1 = r1.zzf()     // Catch:{ all -> 0x02c0 }
            com.google.android.gms.internal.play_billing.zzlq r1 = (com.google.android.gms.internal.play_billing.zzlq) r1     // Catch:{ all -> 0x02c0 }
            r0.b(r1)     // Catch:{ all -> 0x02c0 }
            goto L_0x0300
        L_0x02f9:
            java.lang.String r1 = "BillingClient"
            java.lang.String r2 = "Unable to log."
            com.google.android.gms.internal.play_billing.zze.zzm(r1, r2, r0)
        L_0x0300:
            com.android.billingclient.api.e r0 = com.android.billingclient.api.O.f38133a
            r15.c(r0)
        L_0x0305:
            return r3
        L_0x0306:
            monitor-exit(r0)     // Catch:{ all -> 0x0014 }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.billingclient.api.C3216x.a():java.lang.Object");
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void b() {
        this.f38352b.U(0);
        C3198e eVar = O.f38146n;
        this.f38352b.A0(24, 6, eVar);
        c(eVar);
    }

    public final void onBindingDied(ComponentName componentName) {
        zze.zzl("BillingClient", "Billing service died.");
        try {
            if (C3195b.p0(this.f38352b)) {
                N K02 = this.f38352b.f38213g;
                zzjx zzc = zzjz.zzc();
                zzc.zzn(6);
                zzke zzc2 = zzki.zzc();
                zzc2.zzo(122);
                zzc.zza(zzc2);
                K02.f((zzjz) zzc.zzf());
            } else {
                this.f38352b.f38213g.a(zzkl.zzB());
            }
        } catch (Throwable th2) {
            zze.zzm("BillingClient", "Unable to log.", th2);
        }
        synchronized (this.f38352b.f38207a) {
            if (this.f38352b.f38208b != 3) {
                if (this.f38352b.f38208b != 0) {
                    this.f38352b.U(0);
                    this.f38352b.W();
                    this.f38351a.onBillingServiceDisconnected();
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0025, code lost:
        r1 = r7.f38352b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x003b, code lost:
        if (com.android.billingclient.api.C3195b.p(new com.android.billingclient.api.C3214v(r7), 30000, new com.android.billingclient.api.C3215w(r7), r1.u0(), r1.O()) != null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x003d, code lost:
        r8 = r7.f38352b;
        r9 = r8.L();
        r8.A0(25, 6, r9);
        c(r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:?, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onServiceConnected(android.content.ComponentName r8, android.os.IBinder r9) {
        /*
            r7 = this;
            java.lang.String r8 = "BillingClient"
            java.lang.String r0 = "Billing service connected."
            com.google.android.gms.internal.play_billing.zze.zzk(r8, r0)
            com.android.billingclient.api.b r8 = r7.f38352b
            java.lang.Object r8 = r8.f38207a
            monitor-enter(r8)
            com.android.billingclient.api.b r0 = r7.f38352b     // Catch:{ all -> 0x0019 }
            int r0 = r0.f38208b     // Catch:{ all -> 0x0019 }
            r1 = 3
            if (r0 != r1) goto L_0x001b
            monitor-exit(r8)     // Catch:{ all -> 0x0019 }
            return
        L_0x0019:
            r9 = move-exception
            goto L_0x004d
        L_0x001b:
            com.android.billingclient.api.b r0 = r7.f38352b     // Catch:{ all -> 0x0019 }
            com.google.android.gms.internal.play_billing.zzan r9 = com.google.android.gms.internal.play_billing.zzam.zzu(r9)     // Catch:{ all -> 0x0019 }
            r0.f38214h = r9     // Catch:{ all -> 0x0019 }
            monitor-exit(r8)     // Catch:{ all -> 0x0019 }
            com.android.billingclient.api.b r1 = r7.f38352b
            com.android.billingclient.api.v r2 = new com.android.billingclient.api.v
            r2.<init>(r7)
            com.android.billingclient.api.w r5 = new com.android.billingclient.api.w
            r5.<init>(r7)
            android.os.Handler r6 = r1.u0()
            r3 = 30000(0x7530, double:1.4822E-319)
            java.util.concurrent.Future r8 = com.android.billingclient.api.C3195b.p(r2, 30000, r5, r6, r1.O())
            if (r8 != 0) goto L_0x004c
            com.android.billingclient.api.b r8 = r7.f38352b
            com.android.billingclient.api.e r9 = r8.L()
            r0 = 25
            r1 = 6
            r8.A0(r0, 6, r9)
            r7.c(r9)
        L_0x004c:
            return
        L_0x004d:
            monitor-exit(r8)     // Catch:{ all -> 0x0019 }
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.billingclient.api.C3216x.onServiceConnected(android.content.ComponentName, android.os.IBinder):void");
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        zze.zzl("BillingClient", "Billing service disconnected.");
        try {
            if (C3195b.p0(this.f38352b)) {
                N K02 = this.f38352b.f38213g;
                zzjx zzc = zzjz.zzc();
                zzc.zzn(6);
                zzke zzc2 = zzki.zzc();
                zzc2.zzo(121);
                zzc.zza(zzc2);
                K02.f((zzjz) zzc.zzf());
            } else {
                this.f38352b.f38213g.e(zzlu.zzB());
            }
        } catch (Throwable th2) {
            zze.zzm("BillingClient", "Unable to log.", th2);
        }
        synchronized (this.f38352b.f38207a) {
            try {
                if (this.f38352b.f38208b != 3) {
                    this.f38352b.U(0);
                    this.f38351a.onBillingServiceDisconnected();
                }
            } catch (Throwable th3) {
                while (true) {
                    throw th3;
                }
            }
        }
    }
}
