package com.android.billingclient.api;

import J4.C3035a;
import J4.C3036b;
import J4.C3037c;
import J4.C3039e;
import J4.C3040f;
import J4.C3044j;
import J4.C3047m;
import J4.E;
import J4.s;
import J4.u;
import J4.v;
import J4.w;
import J4.x;
import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import com.google.android.gms.internal.play_billing.zzav;
import com.google.android.gms.internal.play_billing.zze;
import com.google.android.gms.internal.play_billing.zzel;
import com.google.android.gms.internal.play_billing.zzeu;
import com.google.android.gms.internal.play_billing.zzew;
import com.google.android.gms.internal.play_billing.zzfb;
import com.google.android.gms.internal.play_billing.zzjz;
import com.google.android.gms.internal.play_billing.zzkd;
import com.google.android.gms.internal.play_billing.zzr;
import com.google.android.gms.internal.play_billing.zzv;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.function.Consumer;

final class L extends C3195b {

    /* renamed from: G  reason: collision with root package name */
    private final Context f38119G;
    /* access modifiers changed from: private */

    /* renamed from: H  reason: collision with root package name */
    public volatile int f38120H = 0;
    /* access modifiers changed from: private */

    /* renamed from: I  reason: collision with root package name */
    public volatile zzav f38121I;

    /* renamed from: J  reason: collision with root package name */
    private volatile K f38122J;

    /* renamed from: K  reason: collision with root package name */
    private volatile zzew f38123K;

    L(String str, Context context, N n10, ExecutorService executorService) {
        super((String) null, context, (N) null, (ExecutorService) null);
        this.f38119G = context;
    }

    private final int h1(zzeu zzeu) {
        try {
            return ((Integer) zzeu.get(28500, TimeUnit.MILLISECONDS)).intValue();
        } catch (TimeoutException e10) {
            o1(114, 28, O.f38132G);
            zze.zzm("BillingClientTesting", "Asynchronous call to Billing Override Service timed out.", e10);
            return 0;
        } catch (Exception e11) {
            if (e11 instanceof InterruptedException) {
                Thread.currentThread().interrupt();
            }
            o1(107, 28, O.f38132G);
            zze.zzm("BillingClientTesting", "An error occurred while retrieving billing override.", e11);
            return 0;
        }
    }

    private final synchronized zzew i1() {
        try {
            if (this.f38123K == null) {
                this.f38123K = zzfb.zzb(Executors.newSingleThreadScheduledExecutor());
            }
        } catch (Throwable th2) {
            while (true) {
                throw th2;
            }
        }
        return this.f38123K;
    }

    private final synchronized void j1() {
        p1(27);
        try {
            if (!(this.f38122J == null || this.f38121I == null)) {
                zze.zzk("BillingClientTesting", "Unbinding from Billing Override Service.");
                this.f38119G.unbindService(this.f38122J);
                this.f38122J = new K(this, (x) null);
            }
            this.f38121I = null;
            if (this.f38123K != null) {
                this.f38123K.shutdownNow();
                this.f38123K = null;
            }
        } catch (RuntimeException e10) {
            try {
                zze.zzm("BillingClientTesting", "There was an exception while ending Billing Override Service connection!", e10);
            } catch (Throwable th2) {
                this.f38120H = 3;
                throw th2;
            }
        }
        this.f38120H = 3;
    }

    private final synchronized void k1() {
        if (c1()) {
            zze.zzk("BillingClientTesting", "Billing Override Service connection is valid. No need to re-initialize.");
            p1(26);
            return;
        }
        int i10 = 1;
        if (this.f38120H == 1) {
            zze.zzl("BillingClientTesting", "Client is already in the process of connecting to Billing Override Service.");
        } else if (this.f38120H == 3) {
            zze.zzl("BillingClientTesting", "Billing Override Service Client was already closed and can't be reused. Please create another instance.");
            o1(38, 26, O.a(-1, "Billing Override Service connection is disconnected."));
        } else {
            this.f38120H = 1;
            zze.zzk("BillingClientTesting", "Starting Billing Override Service setup.");
            this.f38122J = new K(this, (x) null);
            Intent intent = new Intent("com.google.android.apps.play.billingtestcompanion.BillingOverrideService.BIND");
            intent.setPackage("com.google.android.apps.play.billingtestcompanion");
            List<ResolveInfo> queryIntentServices = this.f38119G.getPackageManager().queryIntentServices(intent, 0);
            if (queryIntentServices == null || queryIntentServices.isEmpty()) {
                i10 = 41;
            } else {
                ServiceInfo serviceInfo = queryIntentServices.get(0).serviceInfo;
                if (serviceInfo != null) {
                    String str = serviceInfo.packageName;
                    String str2 = serviceInfo.name;
                    if (!Objects.equals(str, "com.google.android.apps.play.billingtestcompanion") || str2 == null) {
                        zze.zzl("BillingClientTesting", "The device doesn't have valid Play Billing Lab.");
                    } else {
                        ComponentName componentName = new ComponentName(str, str2);
                        Intent intent2 = new Intent(intent);
                        intent2.setComponent(componentName);
                        if (this.f38119G.bindService(intent2, this.f38122J, 1)) {
                            zze.zzk("BillingClientTesting", "Billing Override Service was bonded successfully.");
                            return;
                        }
                        zze.zzl("BillingClientTesting", "Connection to Billing Override Service is blocked.");
                    }
                    i10 = 39;
                }
            }
            this.f38120H = 0;
            zze.zzk("BillingClientTesting", "Billing Override Service unavailable on device.");
            o1(i10, 26, O.a(2, "Billing Override Service unavailable on device."));
        }
    }

    /* access modifiers changed from: private */
    public static final boolean l1(int i10) {
        return i10 > 0;
    }

    /* access modifiers changed from: private */
    public final C3198e m1(int i10, int i11) {
        C3198e a10 = O.a(i11, "Billing override value was set by a license tester.");
        o1(105, i10, a10);
        return a10;
    }

    private final zzeu n1(int i10) {
        if (c1()) {
            return zzv.zza(new F(this, i10));
        }
        zze.zzl("BillingClientTesting", "Billing Override Service is not ready.");
        o1(106, 28, O.a(-1, "Billing Override Service connection is disconnected."));
        return zzel.zza(0);
    }

    /* access modifiers changed from: private */
    public final void o1(int i10, int i11, C3198e eVar) {
        zzjz b10 = M.b(i10, i11, eVar);
        Objects.requireNonNull(b10, "ApiFailure should not be null");
        L0().f(b10);
    }

    /* access modifiers changed from: private */
    public final void p1(int i10) {
        zzkd d10 = M.d(i10);
        Objects.requireNonNull(d10, "ApiSuccess should not be null");
        L0().d(d10);
    }

    private final void q1(int i10, Consumer consumer, Runnable runnable) {
        zzel.zzc(zzel.zzb(n1(i10), 28500, TimeUnit.MILLISECONDS, i1()), new I(this, i10, consumer, runnable), P0());
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void X0(C3035a aVar, C3036b bVar) {
        super.a(aVar, bVar);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void Y0(C3039e eVar, C3040f fVar) {
        super.b(eVar, fVar);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void Z0(C3198e eVar) {
        super.N0(eVar);
    }

    public final void a(C3035a aVar, C3036b bVar) {
        Objects.requireNonNull(bVar);
        q1(3, new w(bVar), new G(this, aVar, bVar));
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void a1(C3202i iVar, C3044j jVar) {
        super.i(iVar, jVar);
    }

    public final void b(C3039e eVar, C3040f fVar) {
        q1(4, new v(fVar, eVar), new E(this, eVar, fVar));
    }

    public final void c() {
        j1();
        super.c();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0014, code lost:
        return false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized boolean c1() {
        /*
            r2 = this;
            monitor-enter(r2)
            int r0 = r2.f38120H     // Catch:{ all -> 0x0011 }
            r1 = 2
            if (r0 != r1) goto L_0x0013
            com.google.android.gms.internal.play_billing.zzav r0 = r2.f38121I     // Catch:{ all -> 0x0011 }
            if (r0 == 0) goto L_0x0013
            com.android.billingclient.api.K r0 = r2.f38122J     // Catch:{ all -> 0x0011 }
            if (r0 == 0) goto L_0x0013
            monitor-exit(r2)
            r0 = 1
            return r0
        L_0x0011:
            r0 = move-exception
            goto L_0x0016
        L_0x0013:
            monitor-exit(r2)
            r0 = 0
            return r0
        L_0x0016:
            monitor-exit(r2)     // Catch:{ all -> 0x0011 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.billingclient.api.L.c1():boolean");
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ Object e1(int i10, zzr zzr) {
        String str;
        try {
            if (this.f38121I != null) {
                zzav zzav = this.f38121I;
                String packageName = this.f38119G.getPackageName();
                switch (i10) {
                    case 2:
                        str = "LAUNCH_BILLING_FLOW";
                        break;
                    case 3:
                        str = "ACKNOWLEDGE_PURCHASE";
                        break;
                    case 4:
                        str = "CONSUME_ASYNC";
                        break;
                    case 5:
                        str = "IS_FEATURE_SUPPORTED";
                        break;
                    case 6:
                        str = "START_CONNECTION";
                        break;
                    case 7:
                        str = "QUERY_PRODUCT_DETAILS_ASYNC";
                        break;
                    default:
                        str = "QUERY_SKU_DETAILS_ASYNC";
                        break;
                }
                zzav.zza(packageName, str, new J(zzr));
                return "billingOverrideService.getBillingOverride";
            }
            throw null;
        } catch (Exception e10) {
            o1(107, 28, O.f38132G);
            zze.zzm("BillingClientTesting", "An error occurred while retrieving billing override.", e10);
            zzr.zzb(0);
            return "billingOverrideService.getBillingOverride";
        }
    }

    public final C3198e g(Activity activity, C3197d dVar) {
        H h10 = new H(this);
        C c10 = new C(this, activity, dVar);
        int h12 = h1(n1(2));
        if (l1(h12)) {
            C3198e m12 = m1(2, h12);
            h10.accept(m12);
            return m12;
        }
        try {
            return (C3198e) c10.call();
        } catch (Exception e10) {
            C3198e eVar = O.f38143k;
            o1(115, 2, eVar);
            zze.zzm("BillingClientTesting", "An internal error occurred.", e10);
            return eVar;
        }
    }

    public final void i(C3202i iVar, C3044j jVar) {
        q1(7, new u(jVar), new D(this, iVar, jVar));
    }

    public final void m(C3037c cVar) {
        k1();
        super.m(cVar);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ C3198e r1(Activity activity, C3197d dVar) {
        return super.g(activity, dVar);
    }

    L(String str, C3200g gVar, Context context, E e10, N n10, ExecutorService executorService) {
        super((String) null, gVar, context, (E) null, (N) null, (ExecutorService) null);
        this.f38119G = context;
    }

    L(String str, C3200g gVar, Context context, C3047m mVar, s sVar, N n10, ExecutorService executorService) {
        super((String) null, gVar, context, mVar, (s) null, (N) null, (ExecutorService) null);
        this.f38119G = context;
    }
}
