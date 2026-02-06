package com.android.billingclient.api;

import J4.C3035a;
import J4.C3036b;
import J4.C3037c;
import J4.C3038d;
import J4.C3039e;
import J4.C3040f;
import J4.C3041g;
import J4.C3042h;
import J4.C3044j;
import J4.C3045k;
import J4.C3046l;
import J4.C3047m;
import J4.C3048n;
import J4.E;
import J4.I;
import J4.o;
import J4.p;
import J4.r;
import J4.s;
import J4.t;
import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.ResultReceiver;
import android.text.TextUtils;
import android.view.View;
import androidx.core.app.g;
import com.amazon.a.a.o.b;
import com.android.billingclient.api.C3202i;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.google.android.gms.internal.play_billing.zzan;
import com.google.android.gms.internal.play_billing.zzbe;
import com.google.android.gms.internal.play_billing.zzco;
import com.google.android.gms.internal.play_billing.zze;
import com.google.android.gms.internal.play_billing.zzev;
import com.google.android.gms.internal.play_billing.zzfb;
import com.google.android.gms.internal.play_billing.zzjx;
import com.google.android.gms.internal.play_billing.zzjz;
import com.google.android.gms.internal.play_billing.zzkb;
import com.google.android.gms.internal.play_billing.zzkd;
import com.google.android.gms.internal.play_billing.zzke;
import com.google.android.gms.internal.play_billing.zzki;
import com.google.android.gms.internal.play_billing.zzks;
import com.google.android.gms.internal.play_billing.zzku;
import com.google.android.gms.internal.play_billing.zzlv;
import com.google.android.gms.internal.play_billing.zzlx;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import org.json.JSONException;

/* renamed from: com.android.billingclient.api.b  reason: case insensitive filesystem */
class C3195b extends C3194a {
    /* access modifiers changed from: private */

    /* renamed from: A  reason: collision with root package name */
    public boolean f38201A;

    /* renamed from: B  reason: collision with root package name */
    private C3200g f38202B;

    /* renamed from: C  reason: collision with root package name */
    private boolean f38203C;

    /* renamed from: D  reason: collision with root package name */
    private ExecutorService f38204D;

    /* renamed from: E  reason: collision with root package name */
    private volatile zzev f38205E;
    /* access modifiers changed from: private */

    /* renamed from: F  reason: collision with root package name */
    public final Long f38206F;
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final Object f38207a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public volatile int f38208b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public final String f38209c;

    /* renamed from: d  reason: collision with root package name */
    private final Handler f38210d;
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public volatile Y f38211e;
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public Context f38212f;
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public N f38213g;
    /* access modifiers changed from: private */

    /* renamed from: h  reason: collision with root package name */
    public volatile zzan f38214h;

    /* renamed from: i  reason: collision with root package name */
    private volatile C3216x f38215i;
    /* access modifiers changed from: private */

    /* renamed from: j  reason: collision with root package name */
    public boolean f38216j;
    /* access modifiers changed from: private */

    /* renamed from: k  reason: collision with root package name */
    public boolean f38217k;
    /* access modifiers changed from: private */

    /* renamed from: l  reason: collision with root package name */
    public int f38218l;
    /* access modifiers changed from: private */

    /* renamed from: m  reason: collision with root package name */
    public boolean f38219m;
    /* access modifiers changed from: private */

    /* renamed from: n  reason: collision with root package name */
    public boolean f38220n;
    /* access modifiers changed from: private */

    /* renamed from: o  reason: collision with root package name */
    public boolean f38221o;
    /* access modifiers changed from: private */

    /* renamed from: p  reason: collision with root package name */
    public boolean f38222p;
    /* access modifiers changed from: private */

    /* renamed from: q  reason: collision with root package name */
    public boolean f38223q;
    /* access modifiers changed from: private */

    /* renamed from: r  reason: collision with root package name */
    public boolean f38224r;
    /* access modifiers changed from: private */

    /* renamed from: s  reason: collision with root package name */
    public boolean f38225s;
    /* access modifiers changed from: private */

    /* renamed from: t  reason: collision with root package name */
    public boolean f38226t;
    /* access modifiers changed from: private */

    /* renamed from: u  reason: collision with root package name */
    public boolean f38227u;
    /* access modifiers changed from: private */

    /* renamed from: v  reason: collision with root package name */
    public boolean f38228v;
    /* access modifiers changed from: private */

    /* renamed from: w  reason: collision with root package name */
    public boolean f38229w;
    /* access modifiers changed from: private */

    /* renamed from: x  reason: collision with root package name */
    public boolean f38230x;
    /* access modifiers changed from: private */

    /* renamed from: y  reason: collision with root package name */
    public boolean f38231y;
    /* access modifiers changed from: private */

    /* renamed from: z  reason: collision with root package name */
    public boolean f38232z;

    C3195b(String str, Context context, N n10, ExecutorService executorService) {
        this.f38207a = new Object();
        this.f38208b = 0;
        this.f38210d = new Handler(Looper.getMainLooper());
        this.f38218l = 0;
        Long valueOf = Long.valueOf(new Random().nextLong());
        this.f38206F = valueOf;
        String N10 = N();
        this.f38209c = N10;
        this.f38212f = context.getApplicationContext();
        zzks zzc = zzku.zzc();
        zzc.zzo(N10);
        zzc.zzn(this.f38212f.getPackageName());
        zzc.zzm(valueOf.longValue());
        this.f38213g = new P(this.f38212f, (zzku) zzc.zzf());
        this.f38212f.getPackageName();
    }

    /* access modifiers changed from: private */
    public void A0(int i10, int i11, C3198e eVar) {
        try {
            Q(M.b(i10, i11, eVar));
        } catch (Throwable th2) {
            zze.zzm("BillingClient", "Unable to log.", th2);
        }
    }

    /* access modifiers changed from: private */
    public final void B0(int i10, int i11, C3198e eVar, String str) {
        try {
            Q(M.c(i10, i11, eVar, str));
        } catch (Throwable th2) {
            zze.zzm("BillingClient", "Unable to log.", th2);
        }
    }

    /* access modifiers changed from: private */
    public void C0(int i10) {
        try {
            R(M.d(i10));
        } catch (Throwable th2) {
            zze.zzm("BillingClient", "Unable to log.", th2);
        }
    }

    /* access modifiers changed from: private */
    public final C3198e L() {
        int[] iArr = {0, 3};
        synchronized (this.f38207a) {
            for (int i10 = 0; i10 < 2; i10++) {
                if (this.f38208b == iArr[i10]) {
                    return O.f38145m;
                }
            }
            return O.f38143k;
        }
    }

    private final String M(C3202i iVar) {
        if (!TextUtils.isEmpty((CharSequence) null)) {
            return null;
        }
        return this.f38212f.getPackageName();
    }

    private static String N() {
        try {
            return (String) Class.forName("com.android.billingclient.ktx.BuildConfig").getField("VERSION_NAME").get((Object) null);
        } catch (Exception unused) {
            return "7.1.1";
        }
    }

    private final synchronized ExecutorService O() {
        try {
            if (this.f38204D == null) {
                this.f38204D = Executors.newFixedThreadPool(zze.zza, new r(this));
            }
        } catch (Throwable th2) {
            while (true) {
                throw th2;
            }
        }
        return this.f38204D;
    }

    private final void P(C3039e eVar, C3040f fVar) {
        zzan zzan;
        int i10;
        String str;
        String a10 = eVar.a();
        try {
            zze.zzk("BillingClient", "Consuming purchase with token: " + a10);
            synchronized (this.f38207a) {
                zzan = this.f38214h;
            }
            if (zzan == null) {
                f0(fVar, a10, O.f38145m, 119, "Service has been reset to null.", (Exception) null);
                return;
            }
            if (this.f38221o) {
                String packageName = this.f38212f.getPackageName();
                boolean z10 = this.f38221o;
                String str2 = this.f38209c;
                long longValue = this.f38206F.longValue();
                Bundle bundle = new Bundle();
                if (z10) {
                    zze.zzc(bundle, str2, longValue);
                }
                Bundle zze = zzan.zze(9, packageName, a10, bundle);
                i10 = zze.getInt("RESPONSE_CODE");
                str = zze.zzh(zze, "BillingClient");
            } else {
                i10 = zzan.zza(3, this.f38212f.getPackageName(), a10);
                str = "";
            }
            C3198e a11 = O.a(i10, str);
            if (i10 == 0) {
                zze.zzk("BillingClient", "Successfully consumed purchase.");
                fVar.a(a11, a10);
                return;
            }
            f0(fVar, a10, a11, 23, "Error consuming purchase with token. Response code: " + i10, (Exception) null);
        } catch (DeadObjectException e10) {
            DeadObjectException deadObjectException = e10;
            f0(fVar, a10, O.f38145m, 29, "Error consuming purchase!", deadObjectException);
        } catch (Exception e11) {
            Exception exc = e11;
            f0(fVar, a10, O.f38143k, 29, "Error consuming purchase!", exc);
        }
    }

    private final void Q(zzjz zzjz) {
        try {
            this.f38213g.c(zzjz, this.f38218l);
        } catch (Throwable th2) {
            zze.zzm("BillingClient", "Unable to log.", th2);
        }
    }

    private final void R(zzkd zzkd) {
        try {
            this.f38213g.g(zzkd, this.f38218l);
        } catch (Throwable th2) {
            zze.zzm("BillingClient", "Unable to log.", th2);
        }
    }

    private final void S(String str, C3045k kVar) {
        if (!f()) {
            C3198e eVar = O.f38145m;
            A0(2, 11, eVar);
            kVar.a(eVar, (List) null);
        } else if (p(new C3212t(this, str, kVar), 30000, new C3206m(this, kVar), u0(), O()) == null) {
            C3198e L10 = L();
            A0(25, 11, L10);
            kVar.a(L10, (List) null);
        }
    }

    private final void T(String str, C3046l lVar) {
        if (!f()) {
            C3198e eVar = O.f38145m;
            A0(2, 9, eVar);
            lVar.a(eVar, zzco.zzl());
        } else if (TextUtils.isEmpty(str)) {
            zze.zzl("BillingClient", "Please provide a valid product type.");
            C3198e eVar2 = O.f38140h;
            A0(50, 9, eVar2);
            lVar.a(eVar2, zzco.zzl());
        } else if (p(new C3211s(this, str, lVar), 30000, new C3203j(this, lVar), u0(), O()) == null) {
            C3198e L10 = L();
            A0(25, 9, L10);
            lVar.a(L10, zzco.zzl());
        }
    }

    /* access modifiers changed from: private */
    public final void U(int i10) {
        synchronized (this.f38207a) {
            try {
                if (this.f38208b != 3) {
                    String Y10 = Y(this.f38208b);
                    String Y11 = Y(i10);
                    zze.zzk("BillingClient", "Setting clientState from " + Y10 + " to " + Y11);
                    this.f38208b = i10;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private final synchronized void V() {
        ExecutorService executorService = this.f38204D;
        if (executorService != null) {
            executorService.shutdownNow();
            this.f38204D = null;
            this.f38205E = null;
        }
    }

    /* JADX INFO: finally extract failed */
    /* access modifiers changed from: private */
    public final void W() {
        synchronized (this.f38207a) {
            if (this.f38215i != null) {
                try {
                    this.f38212f.unbindService(this.f38215i);
                    this.f38214h = null;
                    this.f38215i = null;
                } catch (Throwable th2) {
                    this.f38214h = null;
                    this.f38215i = null;
                    throw th2;
                }
            }
        }
    }

    private final boolean X() {
        if (!this.f38229w || !this.f38202B.b()) {
            return false;
        }
        return true;
    }

    private static final String Y(int i10) {
        if (i10 == 0) {
            return "DISCONNECTED";
        }
        if (i10 != 1) {
            return i10 != 2 ? "CLOSED" : "CONNECTED";
        }
        return "CONNECTING";
    }

    private final A Z(C3198e eVar, int i10, String str, Exception exc) {
        zze.zzm("BillingClient", str, exc);
        B0(i10, 7, eVar, M.a(exc));
        return new A(eVar.b(), eVar.a(), new ArrayList());
    }

    private final B a0(C3198e eVar, int i10, String str, Exception exc) {
        zze.zzm("BillingClient", str, exc);
        B0(i10, 11, eVar, M.a(exc));
        return new B(eVar, (List) null);
    }

    private final I b0(int i10, C3198e eVar, int i11, String str, Exception exc) {
        B0(i11, 9, eVar, M.a(exc));
        zze.zzm("BillingClient", str, exc);
        return new I(eVar, (List) null);
    }

    /* access modifiers changed from: private */
    public final I c0(String str, int i10) {
        zzan zzan;
        Bundle bundle;
        int i11;
        zze.zzk("BillingClient", "Querying owned items, item type: ".concat(String.valueOf(str)));
        ArrayList arrayList = new ArrayList();
        Bundle zzd = zze.zzd(this.f38221o, this.f38229w, this.f38202B.a(), this.f38202B.b(), this.f38209c, this.f38206F.longValue());
        String str2 = null;
        do {
            try {
                synchronized (this.f38207a) {
                    zzan = this.f38214h;
                }
                if (zzan == null) {
                    return b0(9, O.f38145m, 119, "Service has been reset to null", (Exception) null);
                }
                if (this.f38221o) {
                    if (true != this.f38229w) {
                        i11 = 9;
                    } else {
                        i11 = 19;
                    }
                    bundle = zzan.zzj(i11, this.f38212f.getPackageName(), str, str2, zzd);
                    String str3 = str;
                } else {
                    bundle = zzan.zzi(3, this.f38212f.getPackageName(), str, str2);
                }
                V a10 = W.a(bundle, "BillingClient", "getPurchase()");
                C3198e a11 = a10.a();
                if (a11 != O.f38144l) {
                    return b0(9, a11, a10.b(), "Purchase bundle invalid", (Exception) null);
                }
                ArrayList<String> stringArrayList = bundle.getStringArrayList("INAPP_PURCHASE_ITEM_LIST");
                ArrayList<String> stringArrayList2 = bundle.getStringArrayList("INAPP_PURCHASE_DATA_LIST");
                ArrayList<String> stringArrayList3 = bundle.getStringArrayList("INAPP_DATA_SIGNATURE_LIST");
                int i12 = 0;
                boolean z10 = false;
                while (i12 < stringArrayList2.size()) {
                    String str4 = stringArrayList2.get(i12);
                    String str5 = stringArrayList3.get(i12);
                    zze.zzk("BillingClient", "Sku is owned: ".concat(String.valueOf(stringArrayList.get(i12))));
                    try {
                        Purchase purchase = new Purchase(str4, str5);
                        if (TextUtils.isEmpty(purchase.f())) {
                            zze.zzl("BillingClient", "BUG: empty/null token!");
                            z10 = true;
                        }
                        arrayList.add(purchase);
                        i12++;
                    } catch (JSONException e10) {
                        return b0(9, O.f38143k, 51, "Got an exception trying to decode the purchase!", e10);
                    }
                }
                if (z10) {
                    A0(26, 9, O.f38143k);
                }
                str2 = bundle.getString("INAPP_CONTINUATION_TOKEN");
                zze.zzk("BillingClient", "Continuation token: ".concat(String.valueOf(str2)));
            } catch (DeadObjectException e11) {
                return b0(9, O.f38145m, 52, "Got exception trying to get purchases try to reconnect", e11);
            } catch (Exception e12) {
                return b0(9, O.f38143k, 52, "Got exception trying to get purchases try to reconnect", e12);
            }
        } while (!TextUtils.isEmpty(str2));
        return new I(O.f38144l, arrayList);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: com.google.android.gms.internal.play_billing.zzkd} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v3, resolved type: com.google.android.gms.internal.play_billing.zzjz} */
    /* JADX WARNING: type inference failed for: r1v0 */
    /* JADX WARNING: type inference failed for: r1v2 */
    /* JADX WARNING: type inference failed for: r1v4 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void d0(com.android.billingclient.api.C3198e r8, int r9, int r10) {
        /*
            r7 = this;
            int r0 = r8.b()
            r1 = 0
            java.lang.String r2 = "Unable to create logging payload"
            java.lang.String r3 = "BillingLogger"
            r4 = 5
            if (r0 == 0) goto L_0x004d
            int r0 = com.android.billingclient.api.M.f38124a
            com.google.android.gms.internal.play_billing.zzjx r0 = com.google.android.gms.internal.play_billing.zzjz.zzc()     // Catch:{ Exception -> 0x0045 }
            com.google.android.gms.internal.play_billing.zzke r5 = com.google.android.gms.internal.play_billing.zzki.zzc()     // Catch:{ Exception -> 0x0045 }
            int r6 = r8.b()     // Catch:{ Exception -> 0x0045 }
            r5.zzn(r6)     // Catch:{ Exception -> 0x0045 }
            java.lang.String r8 = r8.a()     // Catch:{ Exception -> 0x0045 }
            r5.zzm(r8)     // Catch:{ Exception -> 0x0045 }
            r5.zzo(r9)     // Catch:{ Exception -> 0x0045 }
            r0.zza(r5)     // Catch:{ Exception -> 0x0045 }
            r0.zzn(r4)     // Catch:{ Exception -> 0x0045 }
            com.google.android.gms.internal.play_billing.zzky r8 = com.google.android.gms.internal.play_billing.zzlb.zzc()     // Catch:{ Exception -> 0x0045 }
            r8.zza(r10)     // Catch:{ Exception -> 0x0045 }
            com.google.android.gms.internal.play_billing.zzhk r8 = r8.zzf()     // Catch:{ Exception -> 0x0045 }
            com.google.android.gms.internal.play_billing.zzlb r8 = (com.google.android.gms.internal.play_billing.zzlb) r8     // Catch:{ Exception -> 0x0045 }
            r0.zzm(r8)     // Catch:{ Exception -> 0x0045 }
            com.google.android.gms.internal.play_billing.zzhk r8 = r0.zzf()     // Catch:{ Exception -> 0x0045 }
            com.google.android.gms.internal.play_billing.zzjz r8 = (com.google.android.gms.internal.play_billing.zzjz) r8     // Catch:{ Exception -> 0x0045 }
            r1 = r8
            goto L_0x0049
        L_0x0045:
            r8 = move-exception
            com.google.android.gms.internal.play_billing.zze.zzm(r3, r2, r8)
        L_0x0049:
            r7.Q(r1)
            return
        L_0x004d:
            int r8 = com.android.billingclient.api.M.f38124a
            com.google.android.gms.internal.play_billing.zzkb r8 = com.google.android.gms.internal.play_billing.zzkd.zzc()     // Catch:{ Exception -> 0x006e }
            r8.zzn(r4)     // Catch:{ Exception -> 0x006e }
            com.google.android.gms.internal.play_billing.zzky r9 = com.google.android.gms.internal.play_billing.zzlb.zzc()     // Catch:{ Exception -> 0x006e }
            r9.zza(r10)     // Catch:{ Exception -> 0x006e }
            com.google.android.gms.internal.play_billing.zzhk r9 = r9.zzf()     // Catch:{ Exception -> 0x006e }
            com.google.android.gms.internal.play_billing.zzlb r9 = (com.google.android.gms.internal.play_billing.zzlb) r9     // Catch:{ Exception -> 0x006e }
            r8.zza(r9)     // Catch:{ Exception -> 0x006e }
            com.google.android.gms.internal.play_billing.zzhk r8 = r8.zzf()     // Catch:{ Exception -> 0x006e }
            com.google.android.gms.internal.play_billing.zzkd r8 = (com.google.android.gms.internal.play_billing.zzkd) r8     // Catch:{ Exception -> 0x006e }
            r1 = r8
            goto L_0x0072
        L_0x006e:
            r8 = move-exception
            com.google.android.gms.internal.play_billing.zze.zzm(r3, r2, r8)
        L_0x0072:
            r7.R(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.billingclient.api.C3195b.d0(com.android.billingclient.api.e, int, int):void");
    }

    private final void e0(C3036b bVar, C3198e eVar, int i10, Exception exc) {
        zze.zzm("BillingClient", "Error in acknowledge purchase!", exc);
        B0(i10, 3, eVar, M.a(exc));
        bVar.a(eVar);
    }

    private final void f0(C3040f fVar, String str, C3198e eVar, int i10, String str2, Exception exc) {
        zze.zzm("BillingClient", str2, exc);
        B0(i10, 4, eVar, M.a(exc));
        fVar.a(eVar, str);
    }

    private void n(Context context, C3047m mVar, C3200g gVar, s sVar, String str, N n10) {
        boolean z10;
        this.f38212f = context.getApplicationContext();
        zzks zzc = zzku.zzc();
        zzc.zzo(str);
        zzc.zzn(this.f38212f.getPackageName());
        zzc.zzm(this.f38206F.longValue());
        if (n10 != null) {
            this.f38213g = n10;
        } else {
            this.f38213g = new P(this.f38212f, (zzku) zzc.zzf());
        }
        if (mVar == null) {
            zze.zzl("BillingClient", "Billing client should have a valid listener but the provided is null.");
        }
        this.f38211e = new Y(this.f38212f, mVar, (E) null, sVar, (p) null, this.f38213g);
        this.f38202B = gVar;
        if (sVar != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f38203C = z10;
        this.f38212f.getPackageName();
    }

    /* access modifiers changed from: package-private */
    public static Future p(Callable callable, long j10, Runnable runnable, Handler handler, ExecutorService executorService) {
        try {
            Future submit = executorService.submit(callable);
            handler.postDelayed(new r(submit, runnable), (long) (((double) j10) * 0.95d));
            return submit;
        } catch (Exception e10) {
            zze.zzm("BillingClient", "Async task throws exception!", e10);
            return null;
        }
    }

    static /* bridge */ /* synthetic */ boolean p0(C3195b bVar) {
        boolean z10;
        synchronized (bVar.f38207a) {
            z10 = true;
            if (bVar.f38208b != 1) {
                z10 = false;
            }
        }
        return z10;
    }

    /* access modifiers changed from: private */
    public final Handler u0() {
        if (Looper.myLooper() == null) {
            return this.f38210d;
        }
        return new Handler(Looper.myLooper());
    }

    /* access modifiers changed from: private */
    public final B v0(String str) {
        zzan zzan;
        zze.zzk("BillingClient", "Querying purchase history, item type: ".concat(String.valueOf(str)));
        ArrayList arrayList = new ArrayList();
        Bundle zzd = zze.zzd(this.f38221o, this.f38229w, this.f38202B.a(), this.f38202B.b(), this.f38209c, this.f38206F.longValue());
        String str2 = null;
        while (this.f38219m) {
            try {
                synchronized (this.f38207a) {
                    zzan = this.f38214h;
                }
                if (zzan == null) {
                    return a0(O.f38145m, 119, "Service reset to null", (Exception) null);
                }
                Bundle zzh = zzan.zzh(6, this.f38212f.getPackageName(), str, str2, zzd);
                V a10 = W.a(zzh, "BillingClient", "getPurchaseHistory()");
                C3198e a11 = a10.a();
                if (a11 != O.f38144l) {
                    A0(a10.b(), 11, a11);
                    return new B(a11, (List) null);
                }
                ArrayList<String> stringArrayList = zzh.getStringArrayList("INAPP_PURCHASE_ITEM_LIST");
                ArrayList<String> stringArrayList2 = zzh.getStringArrayList("INAPP_PURCHASE_DATA_LIST");
                ArrayList<String> stringArrayList3 = zzh.getStringArrayList("INAPP_DATA_SIGNATURE_LIST");
                int i10 = 0;
                boolean z10 = false;
                while (i10 < stringArrayList2.size()) {
                    String str3 = stringArrayList2.get(i10);
                    String str4 = stringArrayList3.get(i10);
                    zze.zzk("BillingClient", "Purchase record found for sku : ".concat(String.valueOf(stringArrayList.get(i10))));
                    try {
                        PurchaseHistoryRecord purchaseHistoryRecord = new PurchaseHistoryRecord(str3, str4);
                        if (TextUtils.isEmpty(purchaseHistoryRecord.d())) {
                            zze.zzl("BillingClient", "BUG: empty/null token!");
                            z10 = true;
                        }
                        arrayList.add(purchaseHistoryRecord);
                        i10++;
                    } catch (JSONException e10) {
                        return a0(O.f38143k, 51, "Got an exception trying to decode the purchase!", e10);
                    }
                }
                if (z10) {
                    A0(26, 11, O.f38143k);
                }
                str2 = zzh.getString("INAPP_CONTINUATION_TOKEN");
                zze.zzk("BillingClient", "Continuation token: ".concat(String.valueOf(str2)));
                if (TextUtils.isEmpty(str2)) {
                    return new B(O.f38144l, arrayList);
                }
            } catch (DeadObjectException e11) {
                return a0(O.f38145m, 59, "Got exception trying to get purchase history", e11);
            } catch (Exception e12) {
                return a0(O.f38143k, 59, "Got exception trying to get purchase history", e12);
            }
        }
        zze.zzl("BillingClient", "getPurchaseHistory is not supported on current device");
        return new B(O.f38149q, (List) null);
    }

    private final C3198e w0() {
        zze.zzk("BillingClient", "Service connection is valid. No need to re-initialize.");
        zzkb zzc = zzkd.zzc();
        zzc.zzn(6);
        zzlv zzc2 = zzlx.zzc();
        zzc2.zza(true);
        zzc.zzm(zzc2);
        R((zzkd) zzc.zzf());
        return O.f38144l;
    }

    private final void y0(C3038d dVar, C3198e eVar, int i10, Exception exc) {
        zze.zzm("BillingClient", "getBillingConfig got an exception.", exc);
        B0(i10, 13, eVar, M.a(exc));
        dVar.a(eVar, (C3196c) null);
    }

    private final void z0(int i10, int i11, Exception exc) {
        zzjz zzjz;
        zze.zzm("BillingClient", "showInAppMessages error.", exc);
        N n10 = this.f38213g;
        String a10 = M.a(exc);
        try {
            zzke zzc = zzki.zzc();
            zzc.zzn(i10);
            zzc.zzo(i11);
            if (a10 != null) {
                zzc.zza(a10);
            }
            zzjx zzc2 = zzjz.zzc();
            zzc2.zza(zzc);
            zzc2.zzn(30);
            zzjz = (zzjz) zzc2.zzf();
        } catch (Throwable th2) {
            zze.zzm("BillingLogger", "Unable to create logging payload", th2);
            zzjz = null;
        }
        n10.f(zzjz);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ Bundle E0(int i10, String str, String str2, C3197d dVar, Bundle bundle) {
        zzan zzan;
        try {
            synchronized (this.f38207a) {
                zzan = this.f38214h;
            }
            if (zzan == null) {
                return zze.zzn(O.f38145m, 119);
            }
            return zzan.zzg(i10, this.f38212f.getPackageName(), str, str2, (String) null, bundle);
        } catch (DeadObjectException e10) {
            return zze.zzo(O.f38145m, 5, M.a(e10));
        } catch (Exception e11) {
            return zze.zzo(O.f38143k, 5, M.a(e11));
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ Bundle F0(String str, String str2) {
        zzan zzan;
        try {
            synchronized (this.f38207a) {
                zzan = this.f38214h;
            }
            if (zzan == null) {
                return zze.zzn(O.f38145m, 119);
            }
            return zzan.zzf(3, this.f38212f.getPackageName(), str, str2, (String) null);
        } catch (DeadObjectException e10) {
            return zze.zzo(O.f38145m, 5, M.a(e10));
        } catch (Exception e11) {
            return zze.zzo(O.f38143k, 5, M.a(e11));
        }
    }

    /* access modifiers changed from: package-private */
    public final A I0(C3202i iVar) {
        int i10;
        zzan zzan;
        int i11;
        ArrayList arrayList = new ArrayList();
        String c10 = iVar.c();
        zzco b10 = iVar.b();
        int size = b10.size();
        int i12 = 0;
        while (i12 < size) {
            int i13 = i12 + 20;
            if (i13 > size) {
                i10 = size;
            } else {
                i10 = i13;
            }
            ArrayList arrayList2 = new ArrayList(b10.subList(i12, i10));
            ArrayList arrayList3 = new ArrayList();
            int size2 = arrayList2.size();
            for (int i14 = 0; i14 < size2; i14++) {
                arrayList3.add(((C3202i.b) arrayList2.get(i14)).b());
            }
            Bundle bundle = new Bundle();
            bundle.putStringArrayList("ITEM_ID_LIST", arrayList3);
            bundle.putString("playBillingLibraryVersion", this.f38209c);
            try {
                synchronized (this.f38207a) {
                    zzan = this.f38214h;
                }
                if (zzan == null) {
                    return Z(O.f38145m, 119, "Service has been reset to null.", (Exception) null);
                }
                if (true != this.f38230x) {
                    i11 = 17;
                } else {
                    i11 = 20;
                }
                int i15 = i11;
                String packageName = this.f38212f.getPackageName();
                boolean X10 = X();
                String str = this.f38209c;
                M(iVar);
                M(iVar);
                M(iVar);
                M(iVar);
                String str2 = packageName;
                long longValue = this.f38206F.longValue();
                Bundle bundle2 = new Bundle();
                zze.zzc(bundle2, str, longValue);
                bundle2.putBoolean(b.f37472ac, true);
                bundle2.putString("SKU_DETAILS_RESPONSE_FORMAT", "PRODUCT_DETAILS");
                if (X10) {
                    bundle2.putBoolean("enablePendingPurchaseForSubscriptions", true);
                }
                ArrayList arrayList4 = new ArrayList();
                ArrayList arrayList5 = new ArrayList();
                int size3 = arrayList2.size();
                int i16 = 0;
                boolean z10 = false;
                boolean z11 = false;
                while (i16 < size3) {
                    arrayList4.add((Object) null);
                    z10 |= !TextUtils.isEmpty((CharSequence) null);
                    ArrayList arrayList6 = arrayList2;
                    if (((C3202i.b) arrayList2.get(i16)).c().equals("first_party")) {
                        zzbe.zzc((Object) null, "Serialized DocId is required for constructing ExtraParams to query ProductDetails for all first party products.");
                        arrayList5.add((Object) null);
                        z11 = true;
                    }
                    i16++;
                    arrayList2 = arrayList6;
                }
                if (z10) {
                    bundle2.putStringArrayList("SKU_OFFER_ID_TOKEN_LIST", arrayList4);
                }
                if (!arrayList5.isEmpty()) {
                    bundle2.putStringArrayList("SKU_SERIALIZED_DOCID_LIST", arrayList5);
                }
                if (z11 && !TextUtils.isEmpty((CharSequence) null)) {
                    bundle2.putString("accountName", (String) null);
                }
                Bundle zzl = zzan.zzl(i15, str2, c10, bundle, bundle2);
                if (zzl == null) {
                    return Z(O.f38128C, 44, "queryProductDetailsAsync got empty product details response.", (Exception) null);
                }
                if (!zzl.containsKey("DETAILS_LIST")) {
                    int zzb = zze.zzb(zzl, "BillingClient");
                    String zzh = zze.zzh(zzl, "BillingClient");
                    if (zzb == 0) {
                        return Z(O.a(6, zzh), 45, "getSkuDetails() returned a bundle with neither an error nor a product detail list for queryProductDetailsAsync.", (Exception) null);
                    }
                    C3198e a10 = O.a(zzb, zzh);
                    return Z(a10, 23, "getSkuDetails() failed for queryProductDetailsAsync. Response code: " + zzb, (Exception) null);
                }
                ArrayList<String> stringArrayList = zzl.getStringArrayList("DETAILS_LIST");
                if (stringArrayList == null) {
                    return Z(O.f38128C, 46, "queryProductDetailsAsync got null response list", (Exception) null);
                }
                int i17 = 0;
                while (i17 < stringArrayList.size()) {
                    try {
                        C3201h hVar = new C3201h(stringArrayList.get(i17));
                        zze.zzk("BillingClient", "Got product details: ".concat(hVar.toString()));
                        arrayList.add(hVar);
                        i17++;
                    } catch (JSONException e10) {
                        return Z(O.a(6, "Error trying to decode SkuDetails."), 47, "Got a JSON exception trying to decode ProductDetails. \n Exception: ", e10);
                    }
                }
                i12 = i13;
            } catch (DeadObjectException e11) {
                return Z(O.f38145m, 43, "queryProductDetailsAsync got a remote exception (try to reconnect).", e11);
            } catch (Exception e12) {
                return Z(O.f38143k, 43, "queryProductDetailsAsync got a remote exception (try to reconnect).", e12);
            }
        }
        return new A(0, "", arrayList);
    }

    /* access modifiers changed from: package-private */
    public final N L0() {
        return this.f38213g;
    }

    /* access modifiers changed from: package-private */
    public final C3198e N0(C3198e eVar) {
        if (Thread.interrupted()) {
            return eVar;
        }
        this.f38210d.post(new Z(this, eVar));
        return eVar;
    }

    /* access modifiers changed from: package-private */
    public final synchronized zzev P0() {
        try {
            if (this.f38205E == null) {
                this.f38205E = zzfb.zza(O());
            }
        } catch (Throwable th2) {
            while (true) {
                throw th2;
            }
        }
        return this.f38205E;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ Object S0(C3036b bVar, C3035a aVar) {
        zzan zzan;
        try {
            synchronized (this.f38207a) {
                zzan = this.f38214h;
            }
            if (zzan == null) {
                e0(bVar, O.f38145m, 119, (Exception) null);
                return null;
            }
            String packageName = this.f38212f.getPackageName();
            String a10 = aVar.a();
            String str = this.f38209c;
            long longValue = this.f38206F.longValue();
            Bundle bundle = new Bundle();
            zze.zzc(bundle, str, longValue);
            Bundle zzd = zzan.zzd(9, packageName, a10, bundle);
            bVar.a(O.a(zze.zzb(zzd, "BillingClient"), zze.zzh(zzd, "BillingClient")));
            return null;
        } catch (DeadObjectException e10) {
            e0(bVar, O.f38145m, 28, e10);
            return null;
        } catch (Exception e11) {
            e0(bVar, O.f38143k, 28, e11);
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ Object T0(C3039e eVar, C3040f fVar) {
        P(eVar, fVar);
        return null;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ Object U0(C3038d dVar) {
        zzan zzan;
        try {
            synchronized (this.f38207a) {
                zzan = this.f38214h;
            }
            if (zzan == null) {
                y0(dVar, O.f38145m, 119, (Exception) null);
            } else {
                String packageName = this.f38212f.getPackageName();
                String str = this.f38209c;
                long longValue = this.f38206F.longValue();
                Bundle bundle = new Bundle();
                zze.zzc(bundle, str, longValue);
                zzan.zzp(18, packageName, bundle, new C3217y(dVar, this.f38213g, this.f38218l, (t) null));
            }
        } catch (DeadObjectException e10) {
            y0(dVar, O.f38145m, 62, e10);
        } catch (Exception e11) {
            y0(dVar, O.f38143k, 62, e11);
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ Object V0(Bundle bundle, Activity activity, ResultReceiver resultReceiver) {
        zzan zzan;
        try {
            synchronized (this.f38207a) {
                zzan = this.f38214h;
            }
            if (zzan == null) {
                z0(-1, 119, (Exception) null);
            } else {
                zzan.zzt(12, this.f38212f.getPackageName(), bundle, new C3218z(new WeakReference(activity), resultReceiver, (t) null));
            }
        } catch (DeadObjectException e10) {
            z0(-1, 118, e10);
        } catch (Exception e11) {
            z0(6, 118, e11);
        }
        return null;
    }

    public void a(C3035a aVar, C3036b bVar) {
        if (!f()) {
            C3198e eVar = O.f38145m;
            A0(2, 3, eVar);
            bVar.a(eVar);
        } else if (TextUtils.isEmpty(aVar.a())) {
            zze.zzl("BillingClient", "Please provide a valid purchase token.");
            C3198e eVar2 = O.f38142j;
            A0(26, 3, eVar2);
            bVar.a(eVar2);
        } else if (!this.f38221o) {
            C3198e eVar3 = O.f38134b;
            A0(27, 3, eVar3);
            bVar.a(eVar3);
        } else if (p(new b0(this, bVar, aVar), 30000, new c0(this, bVar), u0(), O()) == null) {
            C3198e L10 = L();
            A0(25, 3, L10);
            bVar.a(L10);
        }
    }

    public void b(C3039e eVar, C3040f fVar) {
        if (!f()) {
            C3198e eVar2 = O.f38145m;
            A0(2, 4, eVar2);
            fVar.a(eVar2, eVar.a());
        } else if (p(new C3204k(this, eVar, fVar), 30000, new C3205l(this, fVar, eVar), u0(), O()) == null) {
            C3198e L10 = L();
            A0(25, 4, L10);
            fVar.a(L10, eVar.a());
        }
    }

    public void c() {
        C0(12);
        synchronized (this.f38207a) {
            try {
                if (this.f38211e != null) {
                    this.f38211e.f();
                }
            } catch (Throwable th2) {
                zze.zzm("BillingClient", "There was an exception while shutting down broadcast manager while ending connection!", th2);
            }
            try {
                zze.zzk("BillingClient", "Unbinding from service.");
                W();
            } catch (Throwable th3) {
                zze.zzm("BillingClient", "There was an exception while unbinding from the service while ending connection!", th3);
            }
            try {
                V();
            } catch (Throwable th4) {
                U(3);
                throw th4;
            }
            U(3);
        }
        return;
    }

    public void d(C3041g gVar, C3038d dVar) {
        if (!f()) {
            zze.zzl("BillingClient", "Service disconnected.");
            C3198e eVar = O.f38145m;
            A0(2, 13, eVar);
            dVar.a(eVar, (C3196c) null);
        } else if (!this.f38228v) {
            zze.zzl("BillingClient", "Current client doesn't support get billing config.");
            C3198e eVar2 = O.f38126A;
            A0(32, 13, eVar2);
            dVar.a(eVar2, (C3196c) null);
        } else if (p(new d0(this, dVar), 30000, new e0(this, dVar), u0(), O()) == null) {
            C3198e L10 = L();
            A0(25, 13, L10);
            dVar.a(L10, (C3196c) null);
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.android.billingclient.api.C3198e e(java.lang.String r17) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            boolean r2 = r16.f()
            r3 = 2
            r4 = 5
            if (r2 != 0) goto L_0x001c
            com.android.billingclient.api.e r1 = com.android.billingclient.api.O.f38145m
            int r2 = r1.b()
            if (r2 == 0) goto L_0x0018
            r0.A0(r3, r4, r1)
            goto L_0x001b
        L_0x0018:
            r0.C0(r4)
        L_0x001b:
            return r1
        L_0x001c:
            com.android.billingclient.api.e r2 = com.android.billingclient.api.O.f38133a
            int r2 = r17.hashCode()
            r5 = 1
            r6 = 4
            r8 = 6
            r9 = 7
            r10 = 8
            r11 = 11
            r12 = 12
            r13 = 13
            r14 = 14
            r15 = 9
            r3 = 10
            switch(r2) {
                case -422092961: goto L_0x00cb;
                case 96321: goto L_0x00c1;
                case 97314: goto L_0x00b7;
                case 98307: goto L_0x00ad;
                case 99300: goto L_0x00a3;
                case 100293: goto L_0x0099;
                case 101286: goto L_0x008f;
                case 102279: goto L_0x0085;
                case 103272: goto L_0x007b;
                case 104265: goto L_0x0070;
                case 105258: goto L_0x0065;
                case 106251: goto L_0x005a;
                case 107244: goto L_0x004f;
                case 207616302: goto L_0x0044;
                case 1987365622: goto L_0x0039;
                default: goto L_0x0037;
            }
        L_0x0037:
            goto L_0x00d5
        L_0x0039:
            java.lang.String r2 = "subscriptions"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x00d5
            r2 = 0
            goto L_0x00d6
        L_0x0044:
            java.lang.String r2 = "priceChangeConfirmation"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x00d5
            r2 = 2
            goto L_0x00d6
        L_0x004f:
            java.lang.String r2 = "lll"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x00d5
            r2 = r14
            goto L_0x00d6
        L_0x005a:
            java.lang.String r2 = "kkk"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x00d5
            r2 = r13
            goto L_0x00d6
        L_0x0065:
            java.lang.String r2 = "jjj"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x00d5
            r2 = r12
            goto L_0x00d6
        L_0x0070:
            java.lang.String r2 = "iii"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x00d5
            r2 = r11
            goto L_0x00d6
        L_0x007b:
            java.lang.String r2 = "hhh"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x00d5
            r2 = r3
            goto L_0x00d6
        L_0x0085:
            java.lang.String r2 = "ggg"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x00d5
            r2 = r15
            goto L_0x00d6
        L_0x008f:
            java.lang.String r2 = "fff"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x00d5
            r2 = r10
            goto L_0x00d6
        L_0x0099:
            java.lang.String r2 = "eee"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x00d5
            r2 = r9
            goto L_0x00d6
        L_0x00a3:
            java.lang.String r2 = "ddd"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x00d5
            r2 = r4
            goto L_0x00d6
        L_0x00ad:
            java.lang.String r2 = "ccc"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x00d5
            r2 = r8
            goto L_0x00d6
        L_0x00b7:
            java.lang.String r2 = "bbb"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x00d5
            r2 = 3
            goto L_0x00d6
        L_0x00c1:
            java.lang.String r2 = "aaa"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x00d5
            r2 = r6
            goto L_0x00d6
        L_0x00cb:
            java.lang.String r2 = "subscriptionsUpdate"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x00d5
            r2 = r5
            goto L_0x00d6
        L_0x00d5:
            r2 = -1
        L_0x00d6:
            r7 = 19
            switch(r2) {
                case 0: goto L_0x01c0;
                case 1: goto L_0x01b1;
                case 2: goto L_0x01a2;
                case 3: goto L_0x0193;
                case 4: goto L_0x0184;
                case 5: goto L_0x0175;
                case 6: goto L_0x0168;
                case 7: goto L_0x0159;
                case 8: goto L_0x014a;
                case 9: goto L_0x013b;
                case 10: goto L_0x012c;
                case 11: goto L_0x011d;
                case 12: goto L_0x010e;
                case 13: goto L_0x00fd;
                case 14: goto L_0x00ee;
                default: goto L_0x00db;
            }
        L_0x00db:
            java.lang.String r2 = "BillingClient"
            java.lang.String r3 = "Unsupported feature: "
            java.lang.String r1 = r3.concat(r1)
            com.google.android.gms.internal.play_billing.zze.zzl(r2, r1)
            com.android.billingclient.api.e r1 = com.android.billingclient.api.O.f38158z
            r2 = 34
            r0.d0(r1, r2, r5)
            return r1
        L_0x00ee:
            boolean r1 = r0.f38201A
            if (r1 == 0) goto L_0x00f5
            com.android.billingclient.api.e r1 = com.android.billingclient.api.O.f38144l
            goto L_0x00f7
        L_0x00f5:
            com.android.billingclient.api.e r1 = com.android.billingclient.api.O.f38157y
        L_0x00f7:
            r2 = 116(0x74, float:1.63E-43)
            r0.d0(r1, r2, r7)
            return r1
        L_0x00fd:
            boolean r1 = r0.f38232z
            if (r1 == 0) goto L_0x0104
            com.android.billingclient.api.e r1 = com.android.billingclient.api.O.f38144l
            goto L_0x0106
        L_0x0104:
            com.android.billingclient.api.e r1 = com.android.billingclient.api.O.f38156x
        L_0x0106:
            r2 = 103(0x67, float:1.44E-43)
            r3 = 18
            r0.d0(r1, r2, r3)
            return r1
        L_0x010e:
            boolean r1 = r0.f38231y
            if (r1 == 0) goto L_0x0115
            com.android.billingclient.api.e r1 = com.android.billingclient.api.O.f38144l
            goto L_0x0117
        L_0x0115:
            com.android.billingclient.api.e r1 = com.android.billingclient.api.O.f38130E
        L_0x0117:
            r2 = 66
            r0.d0(r1, r2, r14)
            return r1
        L_0x011d:
            boolean r1 = r0.f38230x
            if (r1 == 0) goto L_0x0124
            com.android.billingclient.api.e r1 = com.android.billingclient.api.O.f38144l
            goto L_0x0126
        L_0x0124:
            com.android.billingclient.api.e r1 = com.android.billingclient.api.O.f38129D
        L_0x0126:
            r2 = 60
            r0.d0(r1, r2, r13)
            return r1
        L_0x012c:
            boolean r1 = r0.f38228v
            if (r1 == 0) goto L_0x0133
            com.android.billingclient.api.e r1 = com.android.billingclient.api.O.f38144l
            goto L_0x0135
        L_0x0133:
            com.android.billingclient.api.e r1 = com.android.billingclient.api.O.f38127B
        L_0x0135:
            r2 = 33
            r0.d0(r1, r2, r12)
            return r1
        L_0x013b:
            boolean r1 = r0.f38228v
            if (r1 == 0) goto L_0x0142
            com.android.billingclient.api.e r1 = com.android.billingclient.api.O.f38144l
            goto L_0x0144
        L_0x0142:
            com.android.billingclient.api.e r1 = com.android.billingclient.api.O.f38126A
        L_0x0144:
            r2 = 32
            r0.d0(r1, r2, r11)
            return r1
        L_0x014a:
            boolean r1 = r0.f38227u
            if (r1 == 0) goto L_0x0151
            com.android.billingclient.api.e r1 = com.android.billingclient.api.O.f38144l
            goto L_0x0153
        L_0x0151:
            com.android.billingclient.api.e r1 = com.android.billingclient.api.O.f38154v
        L_0x0153:
            r2 = 20
            r0.d0(r1, r2, r3)
            return r1
        L_0x0159:
            boolean r1 = r0.f38226t
            if (r1 == 0) goto L_0x0160
            com.android.billingclient.api.e r1 = com.android.billingclient.api.O.f38144l
            goto L_0x0162
        L_0x0160:
            com.android.billingclient.api.e r1 = com.android.billingclient.api.O.f38152t
        L_0x0162:
            r2 = 61
            r0.d0(r1, r2, r15)
            return r1
        L_0x0168:
            boolean r1 = r0.f38226t
            if (r1 == 0) goto L_0x016f
            com.android.billingclient.api.e r1 = com.android.billingclient.api.O.f38144l
            goto L_0x0171
        L_0x016f:
            com.android.billingclient.api.e r1 = com.android.billingclient.api.O.f38152t
        L_0x0171:
            r0.d0(r1, r7, r10)
            return r1
        L_0x0175:
            boolean r1 = r0.f38224r
            if (r1 == 0) goto L_0x017c
            com.android.billingclient.api.e r1 = com.android.billingclient.api.O.f38144l
            goto L_0x017e
        L_0x017c:
            com.android.billingclient.api.e r1 = com.android.billingclient.api.O.f38153u
        L_0x017e:
            r2 = 21
            r0.d0(r1, r2, r9)
            return r1
        L_0x0184:
            boolean r1 = r0.f38225s
            if (r1 == 0) goto L_0x018b
            com.android.billingclient.api.e r1 = com.android.billingclient.api.O.f38144l
            goto L_0x018d
        L_0x018b:
            com.android.billingclient.api.e r1 = com.android.billingclient.api.O.f38151s
        L_0x018d:
            r2 = 31
            r0.d0(r1, r2, r8)
            return r1
        L_0x0193:
            boolean r1 = r0.f38223q
            if (r1 == 0) goto L_0x019a
            com.android.billingclient.api.e r1 = com.android.billingclient.api.O.f38144l
            goto L_0x019c
        L_0x019a:
            com.android.billingclient.api.e r1 = com.android.billingclient.api.O.f38155w
        L_0x019c:
            r2 = 30
            r0.d0(r1, r2, r4)
            return r1
        L_0x01a2:
            boolean r1 = r0.f38220n
            if (r1 == 0) goto L_0x01a9
            com.android.billingclient.api.e r1 = com.android.billingclient.api.O.f38144l
            goto L_0x01ab
        L_0x01a9:
            com.android.billingclient.api.e r1 = com.android.billingclient.api.O.f38150r
        L_0x01ab:
            r2 = 35
            r0.d0(r1, r2, r6)
            return r1
        L_0x01b1:
            boolean r1 = r0.f38217k
            if (r1 == 0) goto L_0x01b9
            com.android.billingclient.api.e r1 = com.android.billingclient.api.O.f38144l
        L_0x01b7:
            r2 = 3
            goto L_0x01bc
        L_0x01b9:
            com.android.billingclient.api.e r1 = com.android.billingclient.api.O.f38148p
            goto L_0x01b7
        L_0x01bc:
            r0.d0(r1, r3, r2)
            return r1
        L_0x01c0:
            boolean r1 = r0.f38216j
            if (r1 == 0) goto L_0x01c8
            com.android.billingclient.api.e r1 = com.android.billingclient.api.O.f38144l
        L_0x01c6:
            r2 = 2
            goto L_0x01cb
        L_0x01c8:
            com.android.billingclient.api.e r1 = com.android.billingclient.api.O.f38147o
            goto L_0x01c6
        L_0x01cb:
            r0.d0(r1, r15, r2)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.billingclient.api.C3195b.e(java.lang.String):com.android.billingclient.api.e");
    }

    public final boolean f() {
        boolean z10;
        synchronized (this.f38207a) {
            try {
                z10 = false;
                if (!(this.f38208b != 2 || this.f38214h == null || this.f38215i == null)) {
                    z10 = true;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return z10;
    }

    /* JADX WARNING: Removed duplicated region for block: B:160:0x03f7  */
    /* JADX WARNING: Removed duplicated region for block: B:162:0x03fb  */
    /* JADX WARNING: Removed duplicated region for block: B:173:0x044a A[SYNTHETIC, Splitter:B:173:0x044a] */
    /* JADX WARNING: Removed duplicated region for block: B:182:0x045f A[Catch:{ TimeoutException -> 0x045c, CancellationException -> 0x0459, Exception -> 0x0456 }] */
    /* JADX WARNING: Removed duplicated region for block: B:201:0x04dd  */
    /* JADX WARNING: Removed duplicated region for block: B:205:0x04e4  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.android.billingclient.api.C3198e g(android.app.Activity r26, com.android.billingclient.api.C3197d r27) {
        /*
            r25 = this;
            r8 = r25
            r0 = r26
            java.lang.String r9 = "BUY_INTENT"
            java.lang.String r1 = "proxyPackageVersion"
            com.android.billingclient.api.Y r2 = r8.f38211e
            r10 = 2
            if (r2 == 0) goto L_0x0547
            com.android.billingclient.api.Y r2 = r8.f38211e
            J4.m r2 = r2.d()
            if (r2 == 0) goto L_0x0547
            boolean r2 = r25.f()
            if (r2 != 0) goto L_0x0024
            com.android.billingclient.api.e r0 = com.android.billingclient.api.O.f38145m
            r8.A0(r10, r10, r0)
            r8.N0(r0)
            return r0
        L_0x0024:
            java.util.ArrayList r2 = r27.h()
            java.util.List r3 = r27.i()
            r11 = 0
            java.lang.Object r4 = com.google.android.gms.internal.play_billing.zzcx.zza(r2, r11)
            android.support.v4.media.session.c.a(r4)
            java.lang.Object r4 = com.google.android.gms.internal.play_billing.zzcx.zza(r3, r11)
            com.android.billingclient.api.d$b r4 = (com.android.billingclient.api.C3197d.b) r4
            com.android.billingclient.api.h r5 = r4.b()
            java.lang.String r5 = r5.d()
            com.android.billingclient.api.h r6 = r4.b()
            java.lang.String r6 = r6.e()
            java.lang.String r7 = "subs"
            boolean r7 = r6.equals(r7)
            r12 = 9
            java.lang.String r13 = "BillingClient"
            if (r7 == 0) goto L_0x0069
            boolean r7 = r8.f38216j
            if (r7 == 0) goto L_0x005b
            goto L_0x0069
        L_0x005b:
            java.lang.String r0 = "Current client doesn't support subscriptions."
            com.google.android.gms.internal.play_billing.zze.zzl(r13, r0)
            com.android.billingclient.api.e r0 = com.android.billingclient.api.O.f38147o
            r8.A0(r12, r10, r0)
            r8.N0(r0)
            return r0
        L_0x0069:
            boolean r7 = r27.r()
            if (r7 == 0) goto L_0x0084
            boolean r7 = r8.f38219m
            if (r7 == 0) goto L_0x0074
            goto L_0x0084
        L_0x0074:
            java.lang.String r0 = "Current client doesn't support extra params for buy intent."
            com.google.android.gms.internal.play_billing.zze.zzl(r13, r0)
            com.android.billingclient.api.e r0 = com.android.billingclient.api.O.f38141i
            r1 = 18
            r8.A0(r1, r10, r0)
            r8.N0(r0)
            return r0
        L_0x0084:
            int r7 = r2.size()
            r14 = 1
            if (r7 <= r14) goto L_0x00a0
            boolean r7 = r8.f38226t
            if (r7 == 0) goto L_0x0090
            goto L_0x00a0
        L_0x0090:
            java.lang.String r0 = "Current client doesn't support multi-item purchases."
            com.google.android.gms.internal.play_billing.zze.zzl(r13, r0)
            com.android.billingclient.api.e r0 = com.android.billingclient.api.O.f38152t
            r1 = 19
            r8.A0(r1, r10, r0)
            r8.N0(r0)
            return r0
        L_0x00a0:
            boolean r7 = r3.isEmpty()
            if (r7 != 0) goto L_0x00bb
            boolean r7 = r8.f38227u
            if (r7 == 0) goto L_0x00ab
            goto L_0x00bb
        L_0x00ab:
            java.lang.String r0 = "Current client doesn't support purchases with ProductDetails."
            com.google.android.gms.internal.play_billing.zze.zzl(r13, r0)
            com.android.billingclient.api.e r0 = com.android.billingclient.api.O.f38154v
            r1 = 20
            r8.A0(r1, r10, r0)
            r8.N0(r0)
            return r0
        L_0x00bb:
            com.android.billingclient.api.e r7 = r27.c()
            com.android.billingclient.api.e r15 = com.android.billingclient.api.O.f38144l
            if (r7 == r15) goto L_0x00cc
            r0 = 120(0x78, float:1.68E-43)
            r8.A0(r0, r10, r7)
            r8.N0(r7)
            return r7
        L_0x00cc:
            boolean r7 = r8.f38219m
            if (r7 == 0) goto L_0x042a
            boolean r7 = r8.f38221o
            boolean r15 = r8.f38229w
            com.android.billingclient.api.g r12 = r8.f38202B
            boolean r12 = r12.a()
            com.android.billingclient.api.g r10 = r8.f38202B
            boolean r10 = r10.b()
            boolean r11 = r8.f38203C
            java.lang.String r14 = r8.f38209c
            r17 = r9
            java.lang.Long r9 = r8.f38206F
            r18 = r5
            r19 = r6
            long r5 = r9.longValue()
            android.content.Context r9 = r8.f38212f
            java.lang.String r9 = r9.getPackageName()
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            com.google.android.gms.internal.play_billing.zze.zzc(r0, r14, r5)
            int r5 = r27.b()
            if (r5 == 0) goto L_0x010d
            int r5 = r27.b()
            java.lang.String r6 = "prorationMode"
            r0.putInt(r6, r5)
        L_0x010d:
            java.lang.String r5 = r27.d()
            boolean r5 = android.text.TextUtils.isEmpty(r5)
            if (r5 != 0) goto L_0x0120
            java.lang.String r5 = r27.d()
            java.lang.String r6 = "accountId"
            r0.putString(r6, r5)
        L_0x0120:
            java.lang.String r5 = r27.e()
            boolean r5 = android.text.TextUtils.isEmpty(r5)
            if (r5 != 0) goto L_0x0133
            java.lang.String r5 = r27.e()
            java.lang.String r6 = "obfuscatedProfileId"
            r0.putString(r6, r5)
        L_0x0133:
            boolean r5 = r27.q()
            if (r5 == 0) goto L_0x013f
            java.lang.String r5 = "isOfferPersonalizedByDeveloper"
            r6 = 1
            r0.putBoolean(r5, r6)
        L_0x013f:
            r5 = 0
            boolean r6 = android.text.TextUtils.isEmpty(r5)
            if (r6 != 0) goto L_0x0158
            java.util.ArrayList r6 = new java.util.ArrayList
            java.lang.String[] r14 = new java.lang.String[]{r5}
            java.util.List r5 = java.util.Arrays.asList(r14)
            r6.<init>(r5)
            java.lang.String r5 = "skusToReplace"
            r0.putStringArrayList(r5, r6)
        L_0x0158:
            java.lang.String r5 = r27.f()
            boolean r5 = android.text.TextUtils.isEmpty(r5)
            if (r5 != 0) goto L_0x016b
            java.lang.String r5 = r27.f()
            java.lang.String r6 = "oldSkuPurchaseToken"
            r0.putString(r6, r5)
        L_0x016b:
            r5 = 0
            boolean r6 = android.text.TextUtils.isEmpty(r5)
            if (r6 != 0) goto L_0x0177
            java.lang.String r6 = "oldSkuPurchaseId"
            r0.putString(r6, r5)
        L_0x0177:
            java.lang.String r6 = r27.g()
            boolean r6 = android.text.TextUtils.isEmpty(r6)
            if (r6 != 0) goto L_0x018a
            java.lang.String r6 = r27.g()
            java.lang.String r14 = "originalExternalTransactionId"
            r0.putString(r14, r6)
        L_0x018a:
            boolean r6 = android.text.TextUtils.isEmpty(r5)
            if (r6 != 0) goto L_0x0195
            java.lang.String r6 = "paymentsPurchaseParams"
            r0.putString(r6, r5)
        L_0x0195:
            if (r7 == 0) goto L_0x01a0
            if (r12 == 0) goto L_0x01a0
            java.lang.String r5 = "enablePendingPurchases"
            r6 = 1
            r0.putBoolean(r5, r6)
            goto L_0x01a1
        L_0x01a0:
            r6 = 1
        L_0x01a1:
            if (r15 == 0) goto L_0x01aa
            if (r10 == 0) goto L_0x01aa
            java.lang.String r5 = "enablePendingPurchaseForSubscriptions"
            r0.putBoolean(r5, r6)
        L_0x01aa:
            if (r11 == 0) goto L_0x01b1
            java.lang.String r5 = "enableAlternativeBilling"
            r0.putBoolean(r5, r6)
        L_0x01b1:
            java.util.List r5 = r27.i()
            java.util.stream.Stream r5 = r5.stream()
            com.google.android.gms.internal.play_billing.zza r6 = new com.google.android.gms.internal.play_billing.zza
            r6.<init>()
            boolean r5 = r5.anyMatch(r6)
            if (r5 == 0) goto L_0x01fe
            com.google.android.gms.internal.play_billing.zzfm r5 = com.google.android.gms.internal.play_billing.zzfn.zza()
            java.util.List r6 = r27.i()
            java.util.stream.Stream r6 = r6.stream()
            com.google.android.gms.internal.play_billing.zzb r7 = new com.google.android.gms.internal.play_billing.zzb
            r7.<init>()
            java.util.stream.Stream r6 = r6.filter(r7)
            com.google.android.gms.internal.play_billing.zzc r7 = new com.google.android.gms.internal.play_billing.zzc
            r7.<init>(r9)
            java.util.stream.Stream r6 = r6.map(r7)
            java.util.stream.Collector r7 = com.google.android.gms.internal.play_billing.zzco.zzo()
            java.lang.Object r6 = r6.collect(r7)
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            r5.zza(r6)
            com.google.android.gms.internal.play_billing.zzhk r5 = r5.zzf()
            com.google.android.gms.internal.play_billing.zzfn r5 = (com.google.android.gms.internal.play_billing.zzfn) r5
            byte[] r5 = r5.zzh()
            java.lang.String r6 = "subscriptionProductReplacementParamsList"
            r0.putByteArray(r6, r5)
        L_0x01fe:
            boolean r5 = r2.isEmpty()
            java.lang.String r6 = "SKU_OFFER_ID_TOKEN_LIST"
            java.lang.String r7 = "additionalSkuTypes"
            java.lang.String r9 = "additionalSkus"
            java.lang.String r10 = "skuDetailsTokens"
            if (r5 != 0) goto L_0x027b
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.ArrayList r12 = new java.util.ArrayList
            r12.<init>()
            java.util.ArrayList r12 = new java.util.ArrayList
            r12.<init>()
            java.util.ArrayList r12 = new java.util.ArrayList
            r12.<init>()
            java.util.ArrayList r12 = new java.util.ArrayList
            r12.<init>()
            java.util.Iterator r12 = r2.iterator()
            boolean r14 = r12.hasNext()
            if (r14 != 0) goto L_0x0272
            boolean r12 = r5.isEmpty()
            if (r12 != 0) goto L_0x0238
            r0.putStringArrayList(r10, r5)
        L_0x0238:
            int r5 = r2.size()
            r10 = 1
            if (r5 <= r10) goto L_0x0261
            java.util.ArrayList r5 = new java.util.ArrayList
            int r12 = r2.size()
            int r12 = r12 + -1
            r5.<init>(r12)
            java.util.ArrayList r12 = new java.util.ArrayList
            int r14 = r2.size()
            int r14 = r14 + -1
            r12.<init>(r14)
            int r14 = r2.size()
            if (r10 < r14) goto L_0x0269
            r0.putStringArrayList(r9, r5)
            r0.putStringArrayList(r7, r12)
        L_0x0261:
            r20 = r1
            r23 = r4
            r21 = r13
            goto L_0x036a
        L_0x0269:
            java.lang.Object r0 = r2.get(r10)
            android.support.v4.media.session.c.a(r0)
            r2 = 0
            throw r2
        L_0x0272:
            r2 = 0
            java.lang.Object r0 = r12.next()
            android.support.v4.media.session.c.a(r0)
            throw r2
        L_0x027b:
            java.util.ArrayList r2 = new java.util.ArrayList
            int r5 = r3.size()
            int r5 = r5 + -1
            r2.<init>(r5)
            java.util.ArrayList r5 = new java.util.ArrayList
            int r12 = r3.size()
            int r12 = r12 + -1
            r5.<init>(r12)
            java.util.ArrayList r12 = new java.util.ArrayList
            r12.<init>()
            java.util.ArrayList r14 = new java.util.ArrayList
            r14.<init>()
            java.util.ArrayList r15 = new java.util.ArrayList
            r15.<init>()
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>()
            r20 = r1
            r21 = r13
            r1 = 0
        L_0x02aa:
            int r13 = r3.size()
            if (r1 >= r13) goto L_0x0340
            java.lang.Object r13 = r3.get(r1)
            com.android.billingclient.api.d$b r13 = (com.android.billingclient.api.C3197d.b) r13
            com.android.billingclient.api.h r22 = r13.b()
            java.lang.String r23 = r22.i()
            boolean r23 = r23.isEmpty()
            if (r23 != 0) goto L_0x02ce
            r23 = r4
            java.lang.String r4 = r22.i()
            r12.add(r4)
            goto L_0x02d0
        L_0x02ce:
            r23 = r4
        L_0x02d0:
            java.lang.String r4 = r13.c()
            r14.add(r4)
            java.lang.String r4 = r22.j()
            java.util.List r13 = r22.k()
            if (r13 == 0) goto L_0x030d
            java.util.List r13 = r22.k()
            boolean r13 = r13.isEmpty()
            if (r13 != 0) goto L_0x030d
            java.util.List r13 = r22.k()
            java.util.Iterator r13 = r13.iterator()
        L_0x02f3:
            boolean r22 = r13.hasNext()
            if (r22 == 0) goto L_0x030d
            java.lang.Object r22 = r13.next()
            com.android.billingclient.api.h$b r22 = (com.android.billingclient.api.C3201h.b) r22
            java.lang.String r24 = r22.f()
            boolean r24 = android.text.TextUtils.isEmpty(r24)
            if (r24 != 0) goto L_0x02f3
            java.lang.String r4 = r22.f()
        L_0x030d:
            boolean r13 = android.text.TextUtils.isEmpty(r4)
            if (r13 != 0) goto L_0x0316
            r15.add(r4)
        L_0x0316:
            if (r1 <= 0) goto L_0x033a
            java.lang.Object r4 = r3.get(r1)
            com.android.billingclient.api.d$b r4 = (com.android.billingclient.api.C3197d.b) r4
            com.android.billingclient.api.h r4 = r4.b()
            java.lang.String r4 = r4.d()
            r2.add(r4)
            java.lang.Object r4 = r3.get(r1)
            com.android.billingclient.api.d$b r4 = (com.android.billingclient.api.C3197d.b) r4
            com.android.billingclient.api.h r4 = r4.b()
            java.lang.String r4 = r4.e()
            r5.add(r4)
        L_0x033a:
            int r1 = r1 + 1
            r4 = r23
            goto L_0x02aa
        L_0x0340:
            r23 = r4
            r0.putStringArrayList(r6, r14)
            java.lang.String r1 = "AUTO_PAY_BALANCE_THRESHOLD_LIST"
            r0.putIntegerArrayList(r1, r11)
            boolean r1 = r12.isEmpty()
            if (r1 != 0) goto L_0x0353
            r0.putStringArrayList(r10, r12)
        L_0x0353:
            boolean r1 = r15.isEmpty()
            if (r1 != 0) goto L_0x035e
            java.lang.String r1 = "SKU_SERIALIZED_DOCID_LIST"
            r0.putStringArrayList(r1, r15)
        L_0x035e:
            boolean r1 = r2.isEmpty()
            if (r1 != 0) goto L_0x036a
            r0.putStringArrayList(r9, r2)
            r0.putStringArrayList(r7, r5)
        L_0x036a:
            boolean r1 = r0.containsKey(r6)
            if (r1 == 0) goto L_0x0381
            boolean r1 = r8.f38224r
            if (r1 == 0) goto L_0x0375
            goto L_0x0381
        L_0x0375:
            com.android.billingclient.api.e r0 = com.android.billingclient.api.O.f38153u
            r1 = 21
            r2 = 2
            r8.A0(r1, r2, r0)
            r8.N0(r0)
            return r0
        L_0x0381:
            if (r23 == 0) goto L_0x03a1
            com.android.billingclient.api.h r1 = r23.b()
            java.lang.String r1 = r1.h()
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L_0x03a1
            com.android.billingclient.api.h r1 = r23.b()
            java.lang.String r1 = r1.h()
            java.lang.String r2 = "skuPackageName"
            r0.putString(r2, r1)
            r6 = 1
        L_0x039f:
            r9 = 0
            goto L_0x03a3
        L_0x03a1:
            r6 = 0
            goto L_0x039f
        L_0x03a3:
            boolean r1 = android.text.TextUtils.isEmpty(r9)
            if (r1 != 0) goto L_0x03ae
            java.lang.String r1 = "accountName"
            r0.putString(r1, r9)
        L_0x03ae:
            android.content.Intent r1 = r26.getIntent()
            if (r1 != 0) goto L_0x03bc
            java.lang.String r1 = "Activity's intent is null."
            r10 = r21
            com.google.android.gms.internal.play_billing.zze.zzl(r10, r1)
            goto L_0x03ed
        L_0x03bc:
            r10 = r21
            java.lang.String r2 = "PROXY_PACKAGE"
            java.lang.String r4 = r1.getStringExtra(r2)
            boolean r4 = android.text.TextUtils.isEmpty(r4)
            if (r4 != 0) goto L_0x03ed
            java.lang.String r1 = r1.getStringExtra(r2)
            java.lang.String r2 = "proxyPackage"
            r0.putString(r2, r1)
            android.content.Context r2 = r8.f38212f     // Catch:{ NameNotFoundException -> 0x03e6 }
            android.content.pm.PackageManager r2 = r2.getPackageManager()     // Catch:{ NameNotFoundException -> 0x03e6 }
            r4 = 0
            android.content.pm.PackageInfo r1 = r2.getPackageInfo(r1, r4)     // Catch:{ NameNotFoundException -> 0x03e6 }
            java.lang.String r1 = r1.versionName     // Catch:{ NameNotFoundException -> 0x03e6 }
            r2 = r20
            r0.putString(r2, r1)     // Catch:{ NameNotFoundException -> 0x03e8 }
            goto L_0x03ed
        L_0x03e6:
            r2 = r20
        L_0x03e8:
            java.lang.String r1 = "package not found"
            r0.putString(r2, r1)
        L_0x03ed:
            boolean r1 = r8.f38227u
            if (r1 == 0) goto L_0x03fb
            boolean r1 = r3.isEmpty()
            if (r1 != 0) goto L_0x03fb
            r1 = 17
        L_0x03f9:
            r3 = r1
            goto L_0x040d
        L_0x03fb:
            boolean r1 = r8.f38225s
            if (r1 == 0) goto L_0x0404
            if (r6 == 0) goto L_0x0404
            r1 = 15
            goto L_0x03f9
        L_0x0404:
            boolean r1 = r8.f38221o
            if (r1 == 0) goto L_0x040b
            r3 = 9
            goto L_0x040d
        L_0x040b:
            r1 = 6
            goto L_0x03f9
        L_0x040d:
            com.android.billingclient.api.q r11 = new com.android.billingclient.api.q
            r1 = r11
            r2 = r25
            r4 = r18
            r5 = r19
            r6 = r27
            r7 = r0
            r1.<init>(r2, r3, r4, r5, r6, r7)
            android.os.Handler r15 = r8.f38210d
            java.util.concurrent.ExecutorService r16 = r25.O()
            r12 = 5000(0x1388, double:2.4703E-320)
            r14 = 0
            java.util.concurrent.Future r0 = p(r11, r12, r14, r15, r16)
            goto L_0x0448
        L_0x042a:
            r18 = r5
            r19 = r6
            r17 = r9
            r9 = r11
            r10 = r13
            com.android.billingclient.api.a0 r1 = new com.android.billingclient.api.a0
            r0 = r18
            r2 = r19
            r1.<init>(r8, r0, r2)
            android.os.Handler r5 = r8.f38210d
            java.util.concurrent.ExecutorService r6 = r25.O()
            r2 = 5000(0x1388, double:2.4703E-320)
            r4 = 0
            java.util.concurrent.Future r0 = p(r1, r2, r4, r5, r6)
        L_0x0448:
            if (r0 != 0) goto L_0x045f
            com.android.billingclient.api.e r0 = com.android.billingclient.api.O.f38136d     // Catch:{ TimeoutException -> 0x045c, CancellationException -> 0x0459, Exception -> 0x0456 }
            r1 = 25
            r2 = 2
            r8.A0(r1, r2, r0)     // Catch:{ TimeoutException -> 0x045c, CancellationException -> 0x0459, Exception -> 0x0456 }
            r8.N0(r0)     // Catch:{ TimeoutException -> 0x045c, CancellationException -> 0x0459, Exception -> 0x0456 }
            return r0
        L_0x0456:
            r0 = move-exception
            goto L_0x051f
        L_0x0459:
            r0 = move-exception
            goto L_0x0533
        L_0x045c:
            r0 = move-exception
            goto L_0x0533
        L_0x045f:
            java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ TimeoutException -> 0x045c, CancellationException -> 0x0459, Exception -> 0x0456 }
            r2 = 5000(0x1388, double:2.4703E-320)
            java.lang.Object r0 = r0.get(r2, r1)     // Catch:{ TimeoutException -> 0x045c, CancellationException -> 0x0459, Exception -> 0x0456 }
            r1 = r0
            android.os.Bundle r1 = (android.os.Bundle) r1     // Catch:{ TimeoutException -> 0x045c, CancellationException -> 0x0459, Exception -> 0x0456 }
            int r0 = com.google.android.gms.internal.play_billing.zze.zzb(r1, r10)     // Catch:{ TimeoutException -> 0x045c, CancellationException -> 0x0459, Exception -> 0x0456 }
            java.lang.String r2 = com.google.android.gms.internal.play_billing.zze.zzh(r1, r10)     // Catch:{ TimeoutException -> 0x045c, CancellationException -> 0x0459, Exception -> 0x0456 }
            if (r0 == 0) goto L_0x0505
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ TimeoutException -> 0x045c, CancellationException -> 0x0459, Exception -> 0x0456 }
            r3.<init>()     // Catch:{ TimeoutException -> 0x045c, CancellationException -> 0x0459, Exception -> 0x0456 }
            java.lang.String r4 = "Unable to buy item, Error response code: "
            r3.append(r4)     // Catch:{ TimeoutException -> 0x045c, CancellationException -> 0x0459, Exception -> 0x0456 }
            r3.append(r0)     // Catch:{ TimeoutException -> 0x045c, CancellationException -> 0x0459, Exception -> 0x0456 }
            java.lang.String r3 = r3.toString()     // Catch:{ TimeoutException -> 0x045c, CancellationException -> 0x0459, Exception -> 0x0456 }
            com.google.android.gms.internal.play_billing.zze.zzl(r10, r3)     // Catch:{ TimeoutException -> 0x045c, CancellationException -> 0x0459, Exception -> 0x0456 }
            com.android.billingclient.api.e r2 = com.android.billingclient.api.O.a(r0, r2)     // Catch:{ TimeoutException -> 0x045c, CancellationException -> 0x0459, Exception -> 0x0456 }
            if (r1 != 0) goto L_0x0491
        L_0x048e:
            r3 = 1
            r6 = 1
            goto L_0x04db
        L_0x0491:
            java.lang.String r0 = "LOG_REASON"
            java.lang.Object r0 = r1.get(r0)     // Catch:{ all -> 0x04aa }
            if (r0 != 0) goto L_0x049a
            goto L_0x048e
        L_0x049a:
            boolean r3 = r0 instanceof java.lang.Integer     // Catch:{ all -> 0x04aa }
            if (r3 == 0) goto L_0x04ac
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch:{ all -> 0x04aa }
            int r0 = r0.intValue()     // Catch:{ all -> 0x04aa }
            int r6 = com.google.android.gms.internal.play_billing.zzkg.zza(r0)     // Catch:{ all -> 0x04aa }
            r3 = 1
            goto L_0x04db
        L_0x04aa:
            r0 = move-exception
            goto L_0x04c9
        L_0x04ac:
            java.lang.Class r0 = r0.getClass()     // Catch:{ all -> 0x04aa }
            java.lang.String r0 = r0.getName()     // Catch:{ all -> 0x04aa }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x04aa }
            r3.<init>()     // Catch:{ all -> 0x04aa }
            java.lang.String r4 = "Unexpected type for bundle log reason: "
            r3.append(r4)     // Catch:{ all -> 0x04aa }
            r3.append(r0)     // Catch:{ all -> 0x04aa }
            java.lang.String r0 = r3.toString()     // Catch:{ all -> 0x04aa }
            com.google.android.gms.internal.play_billing.zze.zzl(r10, r0)     // Catch:{ all -> 0x04aa }
            goto L_0x048e
        L_0x04c9:
            java.lang.String r0 = r0.getMessage()     // Catch:{ TimeoutException -> 0x045c, CancellationException -> 0x0459, Exception -> 0x0456 }
            java.lang.String r3 = "Failed to get log reason from bundle: "
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ TimeoutException -> 0x045c, CancellationException -> 0x0459, Exception -> 0x0456 }
            java.lang.String r0 = r3.concat(r0)     // Catch:{ TimeoutException -> 0x045c, CancellationException -> 0x0459, Exception -> 0x0456 }
            com.google.android.gms.internal.play_billing.zze.zzl(r10, r0)     // Catch:{ TimeoutException -> 0x045c, CancellationException -> 0x0459, Exception -> 0x0456 }
            goto L_0x048e
        L_0x04db:
            if (r6 != r3) goto L_0x04df
            r6 = 23
        L_0x04df:
            if (r1 != 0) goto L_0x04e4
        L_0x04e1:
            r11 = r9
        L_0x04e2:
            r1 = 2
            goto L_0x04fe
        L_0x04e4:
            java.lang.String r0 = "ADDITIONAL_LOG_DETAILS"
            java.lang.String r11 = r1.getString(r0)     // Catch:{ all -> 0x04eb }
            goto L_0x04e2
        L_0x04eb:
            r0 = move-exception
            java.lang.String r0 = r0.getMessage()     // Catch:{ TimeoutException -> 0x045c, CancellationException -> 0x0459, Exception -> 0x0456 }
            java.lang.String r1 = "Failed to get additional log details from bundle: "
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ TimeoutException -> 0x045c, CancellationException -> 0x0459, Exception -> 0x0456 }
            java.lang.String r0 = r1.concat(r0)     // Catch:{ TimeoutException -> 0x045c, CancellationException -> 0x0459, Exception -> 0x0456 }
            com.google.android.gms.internal.play_billing.zze.zzl(r10, r0)     // Catch:{ TimeoutException -> 0x045c, CancellationException -> 0x0459, Exception -> 0x0456 }
            goto L_0x04e1
        L_0x04fe:
            r8.B0(r6, r1, r2, r11)     // Catch:{ TimeoutException -> 0x045c, CancellationException -> 0x0459, Exception -> 0x0456 }
            r8.N0(r2)     // Catch:{ TimeoutException -> 0x045c, CancellationException -> 0x0459, Exception -> 0x0456 }
            return r2
        L_0x0505:
            android.content.Intent r0 = new android.content.Intent     // Catch:{ TimeoutException -> 0x045c, CancellationException -> 0x0459, Exception -> 0x0456 }
            java.lang.Class<com.android.billingclient.api.ProxyBillingActivity> r2 = com.android.billingclient.api.ProxyBillingActivity.class
            r3 = r26
            r0.<init>(r3, r2)     // Catch:{ TimeoutException -> 0x045c, CancellationException -> 0x0459, Exception -> 0x0456 }
            r2 = r17
            android.os.Parcelable r1 = r1.getParcelable(r2)     // Catch:{ TimeoutException -> 0x045c, CancellationException -> 0x0459, Exception -> 0x0456 }
            android.app.PendingIntent r1 = (android.app.PendingIntent) r1     // Catch:{ TimeoutException -> 0x045c, CancellationException -> 0x0459, Exception -> 0x0456 }
            r0.putExtra(r2, r1)     // Catch:{ TimeoutException -> 0x045c, CancellationException -> 0x0459, Exception -> 0x0456 }
            r3.startActivity(r0)     // Catch:{ TimeoutException -> 0x045c, CancellationException -> 0x0459, Exception -> 0x0456 }
            com.android.billingclient.api.e r0 = com.android.billingclient.api.O.f38144l
            return r0
        L_0x051f:
            java.lang.String r1 = "Exception while launching billing flow. Try to reconnect"
            com.google.android.gms.internal.play_billing.zze.zzm(r10, r1, r0)
            com.android.billingclient.api.e r1 = com.android.billingclient.api.O.f38145m
            java.lang.String r0 = com.android.billingclient.api.M.a(r0)
            r2 = 5
            r3 = 2
            r8.B0(r2, r3, r1, r0)
            r8.N0(r1)
            return r1
        L_0x0533:
            java.lang.String r1 = "Time out while launching billing flow. Try to reconnect"
            com.google.android.gms.internal.play_billing.zze.zzm(r10, r1, r0)
            com.android.billingclient.api.e r1 = com.android.billingclient.api.O.f38146n
            java.lang.String r0 = com.android.billingclient.api.M.a(r0)
            r2 = 4
            r3 = 2
            r8.B0(r2, r3, r1, r0)
            r8.N0(r1)
            return r1
        L_0x0547:
            r3 = r10
            com.android.billingclient.api.e r0 = com.android.billingclient.api.O.f38131F
            r1 = 12
            r8.A0(r1, r3, r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.billingclient.api.C3195b.g(android.app.Activity, com.android.billingclient.api.d):com.android.billingclient.api.e");
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void h0(C3036b bVar) {
        C3198e eVar = O.f38146n;
        A0(24, 3, eVar);
        bVar.a(eVar);
    }

    public void i(C3202i iVar, C3044j jVar) {
        if (!f()) {
            C3198e eVar = O.f38145m;
            A0(2, 7, eVar);
            jVar.a(eVar, new ArrayList());
        } else if (!this.f38227u) {
            zze.zzl("BillingClient", "Querying product details is not supported.");
            C3198e eVar2 = O.f38154v;
            A0(20, 7, eVar2);
            jVar.a(eVar2, new ArrayList());
        } else if (p(new C3207n(this, iVar, jVar), 30000, new C3208o(this, jVar), u0(), O()) == null) {
            C3198e L10 = L();
            A0(25, 7, L10);
            jVar.a(L10, new ArrayList());
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void i0(C3198e eVar) {
        if (this.f38211e.d() != null) {
            this.f38211e.d().onPurchasesUpdated(eVar, (List) null);
        } else {
            zze.zzl("BillingClient", "No valid listener is set in BroadcastManager");
        }
    }

    public final void j(C3048n nVar, C3045k kVar) {
        S(nVar.b(), kVar);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void j0(C3040f fVar, C3039e eVar) {
        C3198e eVar2 = O.f38146n;
        A0(24, 4, eVar2);
        fVar.a(eVar2, eVar.a());
    }

    public final void k(o oVar, C3046l lVar) {
        T(oVar.b(), lVar);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void k0(C3038d dVar) {
        C3198e eVar = O.f38146n;
        A0(24, 13, eVar);
        dVar.a(eVar, (C3196c) null);
    }

    public final C3198e l(Activity activity, C3199f fVar, C3042h hVar) {
        if (!f()) {
            zze.zzl("BillingClient", "Service disconnected.");
            return O.f38145m;
        } else if (!this.f38223q) {
            zze.zzl("BillingClient", "Current client doesn't support showing in-app messages.");
            return O.f38155w;
        } else {
            View findViewById = activity.findViewById(16908290);
            IBinder windowToken = findViewById.getWindowToken();
            Rect rect = new Rect();
            findViewById.getGlobalVisibleRect(rect);
            Bundle bundle = new Bundle();
            g.b(bundle, "KEY_WINDOW_TOKEN", windowToken);
            bundle.putInt("KEY_DIMEN_LEFT", rect.left);
            bundle.putInt("KEY_DIMEN_TOP", rect.top);
            bundle.putInt("KEY_DIMEN_RIGHT", rect.right);
            bundle.putInt("KEY_DIMEN_BOTTOM", rect.bottom);
            bundle.putString("playBillingLibraryVersion", this.f38209c);
            bundle.putIntegerArrayList("KEY_CATEGORY_IDS", fVar.b());
            p(new C3209p(this, bundle, activity, new C3213u(this, this.f38210d, hVar)), 5000, (Runnable) null, this.f38210d, O());
            return O.f38144l;
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void l0(C3044j jVar) {
        C3198e eVar = O.f38146n;
        A0(24, 7, eVar);
        jVar.a(eVar, new ArrayList());
    }

    public void m(C3037c cVar) {
        C3198e eVar;
        synchronized (this.f38207a) {
            try {
                if (f()) {
                    eVar = w0();
                } else if (this.f38208b == 1) {
                    zze.zzl("BillingClient", "Client is already in the process of connecting to billing service.");
                    eVar = O.f38137e;
                    A0(37, 6, eVar);
                } else if (this.f38208b == 3) {
                    zze.zzl("BillingClient", "Client was already closed and can't be reused. Please create another instance.");
                    eVar = O.f38145m;
                    A0(38, 6, eVar);
                } else {
                    U(1);
                    W();
                    zze.zzk("BillingClient", "Starting in-app billing setup.");
                    this.f38215i = new C3216x(this, cVar, (t) null);
                    Intent intent = new Intent("com.android.vending.billing.InAppBillingService.BIND");
                    intent.setPackage("com.android.vending");
                    List<ResolveInfo> queryIntentServices = this.f38212f.getPackageManager().queryIntentServices(intent, 0);
                    int i10 = 41;
                    if (queryIntentServices != null && !queryIntentServices.isEmpty()) {
                        ServiceInfo serviceInfo = queryIntentServices.get(0).serviceInfo;
                        i10 = 40;
                        if (serviceInfo != null) {
                            String str = serviceInfo.packageName;
                            String str2 = serviceInfo.name;
                            if (!Objects.equals(str, "com.android.vending") || str2 == null) {
                                zze.zzl("BillingClient", "The device doesn't have valid Play Store.");
                            } else {
                                ComponentName componentName = new ComponentName(str, str2);
                                Intent intent2 = new Intent(intent);
                                intent2.setComponent(componentName);
                                intent2.putExtra("playBillingLibraryVersion", this.f38209c);
                                synchronized (this.f38207a) {
                                    try {
                                        if (this.f38208b == 2) {
                                            eVar = w0();
                                        } else if (this.f38208b != 1) {
                                            zze.zzl("BillingClient", "Client state no longer CONNECTING, returning service disconnected.");
                                            eVar = O.f38145m;
                                            A0(ModuleDescriptor.MODULE_VERSION, 6, eVar);
                                        } else {
                                            C3216x xVar = this.f38215i;
                                            if (this.f38212f.bindService(intent2, xVar, 1)) {
                                                zze.zzk("BillingClient", "Service was bonded successfully.");
                                                eVar = null;
                                            } else {
                                                zze.zzl("BillingClient", "Connection to Billing service is blocked.");
                                                i10 = 39;
                                            }
                                        }
                                    } catch (Throwable th2) {
                                        while (true) {
                                            throw th2;
                                        }
                                    }
                                }
                            }
                        } else {
                            zze.zzl("BillingClient", "The device doesn't have valid Play Store.");
                        }
                    }
                    U(0);
                    zze.zzk("BillingClient", "Billing service unavailable on device.");
                    eVar = O.f38135c;
                    A0(i10, 6, eVar);
                }
            } finally {
                while (true) {
                }
            }
        }
        if (eVar != null) {
            cVar.onBillingSetupFinished(eVar);
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void m0(C3045k kVar) {
        C3198e eVar = O.f38146n;
        A0(24, 11, eVar);
        kVar.a(eVar, (List) null);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void n0(C3046l lVar) {
        C3198e eVar = O.f38146n;
        A0(24, 9, eVar);
        lVar.a(eVar, zzco.zzl());
    }

    C3195b(String str, C3200g gVar, Context context, E e10, N n10, ExecutorService executorService) {
        this.f38207a = new Object();
        this.f38208b = 0;
        this.f38210d = new Handler(Looper.getMainLooper());
        this.f38218l = 0;
        Long valueOf = Long.valueOf(new Random().nextLong());
        this.f38206F = valueOf;
        this.f38209c = N();
        this.f38212f = context.getApplicationContext();
        zzks zzc = zzku.zzc();
        zzc.zzo(N());
        zzc.zzn(this.f38212f.getPackageName());
        zzc.zzm(valueOf.longValue());
        this.f38213g = new P(this.f38212f, (zzku) zzc.zzf());
        zze.zzl("BillingClient", "Billing client should have a valid listener but the provided is null.");
        this.f38211e = new Y(this.f38212f, (C3047m) null, (E) null, (s) null, (p) null, this.f38213g);
        this.f38202B = gVar;
        this.f38212f.getPackageName();
    }

    C3195b(String str, C3200g gVar, Context context, C3047m mVar, s sVar, N n10, ExecutorService executorService) {
        String N10 = N();
        this.f38207a = new Object();
        this.f38208b = 0;
        this.f38210d = new Handler(Looper.getMainLooper());
        this.f38218l = 0;
        this.f38206F = Long.valueOf(new Random().nextLong());
        this.f38209c = N10;
        n(context, mVar, gVar, (s) null, N10, (N) null);
    }
}
