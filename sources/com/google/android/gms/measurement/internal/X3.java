package com.google.android.gms.measurement.internal;

import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.adjust.sdk.Constants;

final class X3 implements Application.ActivityLifecycleCallbacks {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ C4643k3 f54931a;

    X3(C4643k3 k3Var) {
        this.f54931a = k3Var;
    }

    /* JADX WARNING: Removed duplicated region for block: B:40:0x00b0 A[SYNTHETIC, Splitter:B:40:0x00b0] */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x010f A[Catch:{ RuntimeException -> 0x0028 }, RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x0110 A[Catch:{ RuntimeException -> 0x0028 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static /* synthetic */ void a(com.google.android.gms.measurement.internal.X3 r16, boolean r17, android.net.Uri r18, java.lang.String r19, java.lang.String r20) {
        /*
            r1 = r16
            r0 = r19
            r2 = r20
            com.google.android.gms.measurement.internal.k3 r3 = r1.f54931a
            r3.i()
            com.google.android.gms.measurement.internal.k3 r3 = r1.f54931a     // Catch:{ RuntimeException -> 0x0028 }
            com.google.android.gms.measurement.internal.B5 r3 = r3.f()     // Catch:{ RuntimeException -> 0x0028 }
            boolean r4 = com.google.android.gms.internal.measurement.zzoj.zza()     // Catch:{ RuntimeException -> 0x0028 }
            r6 = 1
            if (r4 == 0) goto L_0x002b
            com.google.android.gms.measurement.internal.k3 r4 = r1.f54931a     // Catch:{ RuntimeException -> 0x0028 }
            com.google.android.gms.measurement.internal.h r4 = r4.a()     // Catch:{ RuntimeException -> 0x0028 }
            com.google.android.gms.measurement.internal.M1 r7 = com.google.android.gms.measurement.internal.F.f54608M0     // Catch:{ RuntimeException -> 0x0028 }
            boolean r4 = r4.o(r7)     // Catch:{ RuntimeException -> 0x0028 }
            if (r4 == 0) goto L_0x002b
            r4 = r6
            goto L_0x002c
        L_0x0028:
            r0 = move-exception
            goto L_0x0197
        L_0x002b:
            r4 = 0
        L_0x002c:
            boolean r7 = android.text.TextUtils.isEmpty(r20)     // Catch:{ RuntimeException -> 0x0028 }
            java.lang.String r8 = "_cis"
            java.lang.String r9 = "Activity created with data 'referrer' without required params"
            java.lang.String r10 = "utm_medium"
            java.lang.String r11 = "utm_source"
            java.lang.String r12 = "utm_campaign"
            r13 = 0
            java.lang.String r14 = "gclid"
            if (r7 == 0) goto L_0x0041
        L_0x003f:
            r3 = r13
            goto L_0x00ac
        L_0x0041:
            boolean r7 = r2.contains(r14)     // Catch:{ RuntimeException -> 0x0028 }
            if (r7 != 0) goto L_0x008f
            if (r4 == 0) goto L_0x0051
            java.lang.String r7 = "gbraid"
            boolean r7 = r2.contains(r7)     // Catch:{ RuntimeException -> 0x0028 }
            if (r7 != 0) goto L_0x008f
        L_0x0051:
            boolean r7 = r2.contains(r12)     // Catch:{ RuntimeException -> 0x0028 }
            if (r7 != 0) goto L_0x008f
            boolean r7 = r2.contains(r11)     // Catch:{ RuntimeException -> 0x0028 }
            if (r7 != 0) goto L_0x008f
            boolean r7 = r2.contains(r10)     // Catch:{ RuntimeException -> 0x0028 }
            if (r7 != 0) goto L_0x008f
            java.lang.String r7 = "utm_id"
            boolean r7 = r2.contains(r7)     // Catch:{ RuntimeException -> 0x0028 }
            if (r7 != 0) goto L_0x008f
            java.lang.String r7 = "dclid"
            boolean r7 = r2.contains(r7)     // Catch:{ RuntimeException -> 0x0028 }
            if (r7 != 0) goto L_0x008f
            java.lang.String r7 = "srsltid"
            boolean r7 = r2.contains(r7)     // Catch:{ RuntimeException -> 0x0028 }
            if (r7 != 0) goto L_0x008f
            java.lang.String r7 = "sfmc_id"
            boolean r7 = r2.contains(r7)     // Catch:{ RuntimeException -> 0x0028 }
            if (r7 != 0) goto L_0x008f
            com.google.android.gms.measurement.internal.V1 r3 = r3.zzj()     // Catch:{ RuntimeException -> 0x0028 }
            com.google.android.gms.measurement.internal.X1 r3 = r3.A()     // Catch:{ RuntimeException -> 0x0028 }
            r3.a(r9)     // Catch:{ RuntimeException -> 0x0028 }
            goto L_0x003f
        L_0x008f:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ RuntimeException -> 0x0028 }
            java.lang.String r15 = "https://google.com/search?"
            r7.<init>(r15)     // Catch:{ RuntimeException -> 0x0028 }
            r7.append(r2)     // Catch:{ RuntimeException -> 0x0028 }
            java.lang.String r7 = r7.toString()     // Catch:{ RuntimeException -> 0x0028 }
            android.net.Uri r7 = android.net.Uri.parse(r7)     // Catch:{ RuntimeException -> 0x0028 }
            android.os.Bundle r3 = r3.x(r7, r4)     // Catch:{ RuntimeException -> 0x0028 }
            if (r3 == 0) goto L_0x00ac
            java.lang.String r4 = "referrer"
            r3.putString(r8, r4)     // Catch:{ RuntimeException -> 0x0028 }
        L_0x00ac:
            java.lang.String r4 = "_cmp"
            if (r17 == 0) goto L_0x0109
            com.google.android.gms.measurement.internal.k3 r7 = r1.f54931a     // Catch:{ RuntimeException -> 0x0028 }
            com.google.android.gms.measurement.internal.B5 r7 = r7.f()     // Catch:{ RuntimeException -> 0x0028 }
            boolean r15 = com.google.android.gms.internal.measurement.zzoj.zza()     // Catch:{ RuntimeException -> 0x0028 }
            if (r15 == 0) goto L_0x00ce
            com.google.android.gms.measurement.internal.k3 r15 = r1.f54931a     // Catch:{ RuntimeException -> 0x0028 }
            com.google.android.gms.measurement.internal.h r15 = r15.a()     // Catch:{ RuntimeException -> 0x0028 }
            com.google.android.gms.measurement.internal.M1 r5 = com.google.android.gms.measurement.internal.F.f54608M0     // Catch:{ RuntimeException -> 0x0028 }
            boolean r5 = r15.o(r5)     // Catch:{ RuntimeException -> 0x0028 }
            if (r5 == 0) goto L_0x00ce
            r15 = r18
            r5 = r6
            goto L_0x00d1
        L_0x00ce:
            r15 = r18
            r5 = 0
        L_0x00d1:
            android.os.Bundle r5 = r7.x(r15, r5)     // Catch:{ RuntimeException -> 0x0028 }
            if (r5 == 0) goto L_0x0109
            java.lang.String r7 = "intent"
            r5.putString(r8, r7)     // Catch:{ RuntimeException -> 0x0028 }
            boolean r7 = r5.containsKey(r14)     // Catch:{ RuntimeException -> 0x0028 }
            if (r7 != 0) goto L_0x00fd
            if (r3 == 0) goto L_0x00fd
            boolean r7 = r3.containsKey(r14)     // Catch:{ RuntimeException -> 0x0028 }
            if (r7 == 0) goto L_0x00fd
            java.lang.String r7 = "_cer"
            java.lang.String r8 = "gclid=%s"
            java.lang.String r15 = r3.getString(r14)     // Catch:{ RuntimeException -> 0x0028 }
            java.lang.Object[] r15 = new java.lang.Object[]{r15}     // Catch:{ RuntimeException -> 0x0028 }
            java.lang.String r8 = java.lang.String.format(r8, r15)     // Catch:{ RuntimeException -> 0x0028 }
            r5.putString(r7, r8)     // Catch:{ RuntimeException -> 0x0028 }
        L_0x00fd:
            com.google.android.gms.measurement.internal.k3 r7 = r1.f54931a     // Catch:{ RuntimeException -> 0x0028 }
            r7.T0(r0, r4, r5)     // Catch:{ RuntimeException -> 0x0028 }
            com.google.android.gms.measurement.internal.k3 r7 = r1.f54931a     // Catch:{ RuntimeException -> 0x0028 }
            com.google.android.gms.measurement.internal.G5 r7 = r7.f55199p     // Catch:{ RuntimeException -> 0x0028 }
            r7.b(r0, r5)     // Catch:{ RuntimeException -> 0x0028 }
        L_0x0109:
            boolean r5 = android.text.TextUtils.isEmpty(r20)     // Catch:{ RuntimeException -> 0x0028 }
            if (r5 == 0) goto L_0x0110
            return
        L_0x0110:
            com.google.android.gms.measurement.internal.k3 r5 = r1.f54931a     // Catch:{ RuntimeException -> 0x0028 }
            com.google.android.gms.measurement.internal.V1 r5 = r5.zzj()     // Catch:{ RuntimeException -> 0x0028 }
            com.google.android.gms.measurement.internal.X1 r5 = r5.A()     // Catch:{ RuntimeException -> 0x0028 }
            java.lang.String r7 = "Activity created with referrer"
            r5.b(r7, r2)     // Catch:{ RuntimeException -> 0x0028 }
            com.google.android.gms.measurement.internal.k3 r5 = r1.f54931a     // Catch:{ RuntimeException -> 0x0028 }
            com.google.android.gms.measurement.internal.h r5 = r5.a()     // Catch:{ RuntimeException -> 0x0028 }
            com.google.android.gms.measurement.internal.M1 r7 = com.google.android.gms.measurement.internal.F.f54660m0     // Catch:{ RuntimeException -> 0x0028 }
            boolean r5 = r5.o(r7)     // Catch:{ RuntimeException -> 0x0028 }
            java.lang.String r7 = "_ldl"
            java.lang.String r8 = "auto"
            if (r5 == 0) goto L_0x0155
            if (r3 == 0) goto L_0x0140
            com.google.android.gms.measurement.internal.k3 r2 = r1.f54931a     // Catch:{ RuntimeException -> 0x0028 }
            r2.T0(r0, r4, r3)     // Catch:{ RuntimeException -> 0x0028 }
            com.google.android.gms.measurement.internal.k3 r2 = r1.f54931a     // Catch:{ RuntimeException -> 0x0028 }
            com.google.android.gms.measurement.internal.G5 r2 = r2.f55199p     // Catch:{ RuntimeException -> 0x0028 }
            r2.b(r0, r3)     // Catch:{ RuntimeException -> 0x0028 }
            goto L_0x014f
        L_0x0140:
            com.google.android.gms.measurement.internal.k3 r0 = r1.f54931a     // Catch:{ RuntimeException -> 0x0028 }
            com.google.android.gms.measurement.internal.V1 r0 = r0.zzj()     // Catch:{ RuntimeException -> 0x0028 }
            com.google.android.gms.measurement.internal.X1 r0 = r0.A()     // Catch:{ RuntimeException -> 0x0028 }
            java.lang.String r3 = "Referrer does not contain valid parameters"
            r0.b(r3, r2)     // Catch:{ RuntimeException -> 0x0028 }
        L_0x014f:
            com.google.android.gms.measurement.internal.k3 r0 = r1.f54931a     // Catch:{ RuntimeException -> 0x0028 }
            r0.f0(r8, r7, r13, r6)     // Catch:{ RuntimeException -> 0x0028 }
            return
        L_0x0155:
            boolean r0 = r2.contains(r14)     // Catch:{ RuntimeException -> 0x0028 }
            if (r0 == 0) goto L_0x0189
            boolean r0 = r2.contains(r12)     // Catch:{ RuntimeException -> 0x0028 }
            if (r0 != 0) goto L_0x017d
            boolean r0 = r2.contains(r11)     // Catch:{ RuntimeException -> 0x0028 }
            if (r0 != 0) goto L_0x017d
            boolean r0 = r2.contains(r10)     // Catch:{ RuntimeException -> 0x0028 }
            if (r0 != 0) goto L_0x017d
            java.lang.String r0 = "utm_term"
            boolean r0 = r2.contains(r0)     // Catch:{ RuntimeException -> 0x0028 }
            if (r0 != 0) goto L_0x017d
            java.lang.String r0 = "utm_content"
            boolean r0 = r2.contains(r0)     // Catch:{ RuntimeException -> 0x0028 }
            if (r0 == 0) goto L_0x0189
        L_0x017d:
            boolean r0 = android.text.TextUtils.isEmpty(r20)     // Catch:{ RuntimeException -> 0x0028 }
            if (r0 != 0) goto L_0x0188
            com.google.android.gms.measurement.internal.k3 r0 = r1.f54931a     // Catch:{ RuntimeException -> 0x0028 }
            r0.f0(r8, r7, r2, r6)     // Catch:{ RuntimeException -> 0x0028 }
        L_0x0188:
            return
        L_0x0189:
            com.google.android.gms.measurement.internal.k3 r0 = r1.f54931a     // Catch:{ RuntimeException -> 0x0028 }
            com.google.android.gms.measurement.internal.V1 r0 = r0.zzj()     // Catch:{ RuntimeException -> 0x0028 }
            com.google.android.gms.measurement.internal.X1 r0 = r0.A()     // Catch:{ RuntimeException -> 0x0028 }
            r0.a(r9)     // Catch:{ RuntimeException -> 0x0028 }
            return
        L_0x0197:
            com.google.android.gms.measurement.internal.k3 r1 = r1.f54931a
            com.google.android.gms.measurement.internal.V1 r1 = r1.zzj()
            com.google.android.gms.measurement.internal.X1 r1 = r1.B()
            java.lang.String r2 = "Throwable caught in handleReferrerForOnActivityCreated"
            r1.b(r2, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.X3.a(com.google.android.gms.measurement.internal.X3, boolean, android.net.Uri, java.lang.String, java.lang.String):void");
    }

    public final void onActivityCreated(Activity activity, Bundle bundle) {
        String str;
        boolean z10;
        try {
            this.f54931a.zzj().F().a("onActivityCreated");
            Intent intent = activity.getIntent();
            if (intent == null) {
                this.f54931a.n().A(activity, bundle);
                return;
            }
            Uri data = intent.getData();
            if (data == null || !data.isHierarchical()) {
                Bundle extras = intent.getExtras();
                if (extras != null) {
                    String string = extras.getString("com.android.vending.referral_url");
                    if (!TextUtils.isEmpty(string)) {
                        data = Uri.parse(string);
                    }
                }
                data = null;
            }
            Uri uri = data;
            if (uri != null) {
                if (uri.isHierarchical()) {
                    this.f54931a.f();
                    if (B5.a0(intent)) {
                        str = "gs";
                    } else {
                        str = "auto";
                    }
                    String str2 = str;
                    String queryParameter = uri.getQueryParameter(Constants.REFERRER);
                    if (bundle == null) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    this.f54931a.zzl().y(new W3(this, z10, uri, str2, queryParameter));
                    this.f54931a.n().A(activity, bundle);
                    return;
                }
            }
            this.f54931a.n().A(activity, bundle);
        } catch (RuntimeException e10) {
            this.f54931a.zzj().B().b("Throwable caught in onActivityCreated", e10);
            this.f54931a.n().A(activity, bundle);
        } catch (Throwable th2) {
            this.f54931a.n().A(activity, bundle);
            throw th2;
        }
    }

    public final void onActivityDestroyed(Activity activity) {
        this.f54931a.n().z(activity);
    }

    public final void onActivityPaused(Activity activity) {
        this.f54931a.n().L(activity);
        V4 p10 = this.f54931a.p();
        p10.zzl().y(new W4(p10, p10.zzb().a()));
    }

    public final void onActivityResumed(Activity activity) {
        V4 p10 = this.f54931a.p();
        p10.zzl().y(new X4(p10, p10.zzb().a()));
        this.f54931a.n().N(activity);
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        this.f54931a.n().M(activity, bundle);
    }

    public final void onActivityStarted(Activity activity) {
    }

    public final void onActivityStopped(Activity activity) {
    }
}
