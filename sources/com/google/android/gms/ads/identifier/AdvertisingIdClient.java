package com.google.android.gms.ads.identifier;

import Da.C4250b;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Log;
import com.google.android.gms.common.b;
import com.google.android.gms.common.d;
import com.google.android.gms.common.internal.C4536s;
import com.google.android.gms.internal.ads_identifier.zze;
import com.google.android.gms.internal.ads_identifier.zzf;
import io.branch.rnbranch.RNBranchModule;
import java.io.IOException;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;
import ya.C5284a;
import ya.C5288e;

public class AdvertisingIdClient {

    /* renamed from: a  reason: collision with root package name */
    C5284a f53769a;

    /* renamed from: b  reason: collision with root package name */
    zzf f53770b;

    /* renamed from: c  reason: collision with root package name */
    boolean f53771c;

    /* renamed from: d  reason: collision with root package name */
    final Object f53772d = new Object();

    /* renamed from: e  reason: collision with root package name */
    b f53773e;

    /* renamed from: f  reason: collision with root package name */
    private final Context f53774f;

    /* renamed from: g  reason: collision with root package name */
    final long f53775g;

    public static final class Info {

        /* renamed from: a  reason: collision with root package name */
        private final String f53776a;

        /* renamed from: b  reason: collision with root package name */
        private final boolean f53777b;

        public Info(String str, boolean z10) {
            this.f53776a = str;
            this.f53777b = z10;
        }

        public String getId() {
            return this.f53776a;
        }

        public boolean isLimitAdTrackingEnabled() {
            return this.f53777b;
        }

        public String toString() {
            String str = this.f53776a;
            boolean z10 = this.f53777b;
            StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 7);
            sb2.append("{");
            sb2.append(str);
            sb2.append("}");
            sb2.append(z10);
            return sb2.toString();
        }
    }

    public AdvertisingIdClient(Context context, long j10, boolean z10, boolean z11) {
        Context applicationContext;
        C4536s.l(context);
        if (z10 && (applicationContext = context.getApplicationContext()) != null) {
            context = applicationContext;
        }
        this.f53774f = context;
        this.f53771c = false;
        this.f53775g = j10;
    }

    public static void a(boolean z10) {
    }

    private final Info e(int i10) {
        Info info;
        C4536s.k("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            try {
                if (!this.f53771c) {
                    synchronized (this.f53772d) {
                        b bVar = this.f53773e;
                        if (bVar == null || !bVar.f53782d) {
                            throw new IOException("AdvertisingIdClient is not connected.");
                        }
                    }
                    c(false);
                    if (!this.f53771c) {
                        throw new IOException("AdvertisingIdClient cannot reconnect.");
                    }
                }
                C4536s.l(this.f53769a);
                C4536s.l(this.f53770b);
                info = new Info(this.f53770b.zzc(), this.f53770b.zze(true));
            } catch (RemoteException e10) {
                Log.i("AdvertisingIdClient", "GMS remote exception ", e10);
                throw new IOException("Remote exception");
            } catch (Exception e11) {
                throw new IOException("AdvertisingIdClient cannot reconnect.", e11);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        f();
        return info;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(7:2|3|(3:5|6|7)|9|10|(1:12)|13) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0014 */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x001c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void f() {
        /*
            r5 = this;
            java.lang.Object r0 = r5.f53772d
            monitor-enter(r0)
            com.google.android.gms.ads.identifier.b r1 = r5.f53773e     // Catch:{ all -> 0x0012 }
            if (r1 == 0) goto L_0x0014
            java.util.concurrent.CountDownLatch r1 = r1.f53781c     // Catch:{ all -> 0x0012 }
            r1.countDown()     // Catch:{ all -> 0x0012 }
            com.google.android.gms.ads.identifier.b r1 = r5.f53773e     // Catch:{ InterruptedException -> 0x0014 }
            r1.join()     // Catch:{ InterruptedException -> 0x0014 }
            goto L_0x0014
        L_0x0012:
            r1 = move-exception
            goto L_0x0025
        L_0x0014:
            long r1 = r5.f53775g     // Catch:{ all -> 0x0012 }
            r3 = 0
            int r3 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r3 <= 0) goto L_0x0023
            com.google.android.gms.ads.identifier.b r3 = new com.google.android.gms.ads.identifier.b     // Catch:{ all -> 0x0012 }
            r3.<init>(r5, r1)     // Catch:{ all -> 0x0012 }
            r5.f53773e = r3     // Catch:{ all -> 0x0012 }
        L_0x0023:
            monitor-exit(r0)     // Catch:{ all -> 0x0012 }
            return
        L_0x0025:
            monitor-exit(r0)     // Catch:{ all -> 0x0012 }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.identifier.AdvertisingIdClient.f():void");
    }

    public static Info getAdvertisingIdInfo(Context context) {
        AdvertisingIdClient advertisingIdClient = new AdvertisingIdClient(context, -1, true, false);
        try {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            advertisingIdClient.c(false);
            Info e10 = advertisingIdClient.e(-1);
            advertisingIdClient.d(e10, true, 0.0f, SystemClock.elapsedRealtime() - elapsedRealtime, "", (Throwable) null);
            advertisingIdClient.b();
            return e10;
        } catch (Throwable th2) {
            advertisingIdClient.b();
            throw th2;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0034, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void b() {
        /*
            r3 = this;
            java.lang.String r0 = "Calling this from your main thread can lead to deadlock"
            com.google.android.gms.common.internal.C4536s.k(r0)
            monitor-enter(r3)
            android.content.Context r0 = r3.f53774f     // Catch:{ all -> 0x0031 }
            if (r0 == 0) goto L_0x0033
            ya.a r0 = r3.f53769a     // Catch:{ all -> 0x0031 }
            if (r0 != 0) goto L_0x000f
            goto L_0x0033
        L_0x000f:
            boolean r0 = r3.f53771c     // Catch:{ all -> 0x001f }
            if (r0 == 0) goto L_0x0027
            Da.b r0 = Da.C4250b.b()     // Catch:{ all -> 0x001f }
            android.content.Context r1 = r3.f53774f     // Catch:{ all -> 0x001f }
            ya.a r2 = r3.f53769a     // Catch:{ all -> 0x001f }
            r0.c(r1, r2)     // Catch:{ all -> 0x001f }
            goto L_0x0027
        L_0x001f:
            r0 = move-exception
            java.lang.String r1 = "AdvertisingIdClient"
            java.lang.String r2 = "AdvertisingIdClient unbindService failed."
            android.util.Log.i(r1, r2, r0)     // Catch:{ all -> 0x0031 }
        L_0x0027:
            r0 = 0
            r3.f53771c = r0     // Catch:{ all -> 0x0031 }
            r0 = 0
            r3.f53770b = r0     // Catch:{ all -> 0x0031 }
            r3.f53769a = r0     // Catch:{ all -> 0x0031 }
            monitor-exit(r3)     // Catch:{ all -> 0x0031 }
            return
        L_0x0031:
            r0 = move-exception
            goto L_0x0035
        L_0x0033:
            monitor-exit(r3)     // Catch:{ all -> 0x0031 }
            return
        L_0x0035:
            monitor-exit(r3)     // Catch:{ all -> 0x0031 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.identifier.AdvertisingIdClient.b():void");
    }

    /* access modifiers changed from: protected */
    public final void c(boolean z10) {
        C4536s.k("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            try {
                if (this.f53771c) {
                    b();
                }
                Context context = this.f53774f;
                context.getPackageManager().getPackageInfo("com.android.vending", 0);
                int h10 = b.f().h(context, d.f54103a);
                if (h10 != 0) {
                    if (h10 != 2) {
                        throw new IOException("Google Play services not available");
                    }
                }
                C5284a aVar = new C5284a();
                Intent intent = new Intent("com.google.android.gms.ads.identifier.service.START");
                intent.setPackage("com.google.android.gms");
                if (C4250b.b().a(context, intent, aVar, 1)) {
                    this.f53769a = aVar;
                    this.f53770b = zze.zza(aVar.b(10000, TimeUnit.MILLISECONDS));
                    this.f53771c = true;
                    if (z10) {
                        f();
                    }
                } else {
                    throw new IOException("Connection failure");
                }
            } catch (PackageManager.NameNotFoundException unused) {
                throw new C5288e(9);
            } catch (InterruptedException unused2) {
                throw new IOException("Interrupted exception");
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final boolean d(Info info, boolean z10, float f10, long j10, String str, Throwable th2) {
        if (Math.random() > 0.0d) {
            return false;
        }
        HashMap hashMap = new HashMap();
        String str2 = "1";
        hashMap.put("app_context", str2);
        if (info != null) {
            if (true != info.isLimitAdTrackingEnabled()) {
                str2 = "0";
            }
            hashMap.put("limit_ad_tracking", str2);
            String id2 = info.getId();
            if (id2 != null) {
                hashMap.put("ad_id_size", Integer.toString(id2.length()));
            }
        }
        if (th2 != null) {
            hashMap.put(RNBranchModule.NATIVE_INIT_SESSION_FINISHED_EVENT_ERROR, th2.getClass().getName());
        }
        hashMap.put("tag", "AdvertisingIdClient");
        hashMap.put("time_spent", Long.toString(j10));
        new a(this, hashMap).start();
        return true;
    }

    /* access modifiers changed from: protected */
    public final void finalize() {
        b();
        super.finalize();
    }
}
