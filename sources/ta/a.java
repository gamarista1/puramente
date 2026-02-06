package Ta;

import Ea.e;
import Ea.h;
import Ea.p;
import Ea.r;
import android.content.Context;
import android.os.PowerManager;
import android.os.WorkSource;
import android.support.v4.media.session.c;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.internal.C4536s;
import com.google.android.gms.internal.stats.zzb;
import com.google.android.gms.internal.stats.zzc;
import com.google.android.gms.internal.stats.zzh;
import com.google.android.gms.internal.stats.zzi;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

public class a {

    /* renamed from: r  reason: collision with root package name */
    private static final long f52478r = TimeUnit.DAYS.toMillis(366);

    /* renamed from: s  reason: collision with root package name */
    private static volatile ScheduledExecutorService f52479s = null;

    /* renamed from: t  reason: collision with root package name */
    private static final Object f52480t = new Object();

    /* renamed from: u  reason: collision with root package name */
    private static volatile e f52481u = new c();

    /* renamed from: a  reason: collision with root package name */
    private final Object f52482a = new Object();

    /* renamed from: b  reason: collision with root package name */
    private final PowerManager.WakeLock f52483b;

    /* renamed from: c  reason: collision with root package name */
    private int f52484c = 0;

    /* renamed from: d  reason: collision with root package name */
    private Future f52485d;

    /* renamed from: e  reason: collision with root package name */
    private long f52486e;

    /* renamed from: f  reason: collision with root package name */
    private final Set f52487f = new HashSet();

    /* renamed from: g  reason: collision with root package name */
    private boolean f52488g = true;

    /* renamed from: h  reason: collision with root package name */
    private int f52489h;

    /* renamed from: i  reason: collision with root package name */
    zzb f52490i;

    /* renamed from: j  reason: collision with root package name */
    private e f52491j = h.c();

    /* renamed from: k  reason: collision with root package name */
    private WorkSource f52492k;

    /* renamed from: l  reason: collision with root package name */
    private final String f52493l;

    /* renamed from: m  reason: collision with root package name */
    private final String f52494m;

    /* renamed from: n  reason: collision with root package name */
    private final Context f52495n;

    /* renamed from: o  reason: collision with root package name */
    private final Map f52496o = new HashMap();

    /* renamed from: p  reason: collision with root package name */
    private AtomicInteger f52497p = new AtomicInteger(0);

    /* renamed from: q  reason: collision with root package name */
    private final ScheduledExecutorService f52498q;

    public a(Context context, int i10, String str) {
        String str2;
        String packageName = context.getPackageName();
        C4536s.m(context, "WakeLock: context must not be null");
        C4536s.g(str, "WakeLock: wakeLockName must not be empty");
        this.f52495n = context.getApplicationContext();
        this.f52494m = str;
        this.f52490i = null;
        if (!"com.google.android.gms".equals(context.getPackageName())) {
            String valueOf = String.valueOf(str);
            if (valueOf.length() != 0) {
                str2 = "*gcore*:".concat(valueOf);
            } else {
                str2 = new String("*gcore*:");
            }
            this.f52493l = str2;
        } else {
            this.f52493l = str;
        }
        PowerManager powerManager = (PowerManager) context.getSystemService("power");
        if (powerManager != null) {
            PowerManager.WakeLock newWakeLock = powerManager.newWakeLock(i10, str);
            this.f52483b = newWakeLock;
            if (r.c(context)) {
                WorkSource b10 = r.b(context, p.b(packageName) ? context.getPackageName() : packageName);
                this.f52492k = b10;
                if (b10 != null) {
                    i(newWakeLock, b10);
                }
            }
            ScheduledExecutorService scheduledExecutorService = f52479s;
            if (scheduledExecutorService == null) {
                synchronized (f52480t) {
                    try {
                        scheduledExecutorService = f52479s;
                        if (scheduledExecutorService == null) {
                            zzh.zza();
                            scheduledExecutorService = Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(1));
                            f52479s = scheduledExecutorService;
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
            this.f52498q = scheduledExecutorService;
            return;
        }
        StringBuilder sb2 = new StringBuilder(29);
        sb2.append("expected a non-null reference", 0, 29);
        throw new zzi(sb2.toString());
    }

    public static /* synthetic */ void e(a aVar) {
        synchronized (aVar.f52482a) {
            try {
                if (aVar.b()) {
                    Log.e("WakeLock", String.valueOf(aVar.f52493l).concat(" ** IS FORCE-RELEASED ON TIMEOUT **"));
                    aVar.g();
                    if (aVar.b()) {
                        aVar.f52484c = 1;
                        aVar.h(0);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private final String f(String str) {
        if (this.f52488g) {
            TextUtils.isEmpty((CharSequence) null);
        }
        return null;
    }

    private final void g() {
        if (!this.f52487f.isEmpty()) {
            ArrayList arrayList = new ArrayList(this.f52487f);
            this.f52487f.clear();
            if (arrayList.size() > 0) {
                c.a(arrayList.get(0));
                throw null;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00a6, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void h(int r6) {
        /*
            r5 = this;
            java.lang.Object r6 = r5.f52482a
            monitor-enter(r6)
            boolean r0 = r5.b()     // Catch:{ all -> 0x000b }
            if (r0 != 0) goto L_0x000e
            monitor-exit(r6)     // Catch:{ all -> 0x000b }
            return
        L_0x000b:
            r0 = move-exception
            goto L_0x00a7
        L_0x000e:
            boolean r0 = r5.f52488g     // Catch:{ all -> 0x000b }
            r1 = 0
            if (r0 == 0) goto L_0x001e
            int r0 = r5.f52484c     // Catch:{ all -> 0x000b }
            int r0 = r0 + -1
            r5.f52484c = r0     // Catch:{ all -> 0x000b }
            if (r0 > 0) goto L_0x001c
            goto L_0x0020
        L_0x001c:
            monitor-exit(r6)     // Catch:{ all -> 0x000b }
            return
        L_0x001e:
            r5.f52484c = r1     // Catch:{ all -> 0x000b }
        L_0x0020:
            r5.g()     // Catch:{ all -> 0x000b }
            java.util.Map r0 = r5.f52496o     // Catch:{ all -> 0x000b }
            java.util.Collection r0 = r0.values()     // Catch:{ all -> 0x000b }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x000b }
        L_0x002d:
            boolean r2 = r0.hasNext()     // Catch:{ all -> 0x000b }
            if (r2 == 0) goto L_0x003c
            java.lang.Object r2 = r0.next()     // Catch:{ all -> 0x000b }
            Ta.d r2 = (Ta.d) r2     // Catch:{ all -> 0x000b }
            r2.f52500a = r1     // Catch:{ all -> 0x000b }
            goto L_0x002d
        L_0x003c:
            java.util.Map r0 = r5.f52496o     // Catch:{ all -> 0x000b }
            r0.clear()     // Catch:{ all -> 0x000b }
            java.util.concurrent.Future r0 = r5.f52485d     // Catch:{ all -> 0x000b }
            r2 = 0
            if (r0 == 0) goto L_0x004f
            r0.cancel(r1)     // Catch:{ all -> 0x000b }
            r5.f52485d = r2     // Catch:{ all -> 0x000b }
            r3 = 0
            r5.f52486e = r3     // Catch:{ all -> 0x000b }
        L_0x004f:
            r5.f52489h = r1     // Catch:{ all -> 0x000b }
            android.os.PowerManager$WakeLock r0 = r5.f52483b     // Catch:{ all -> 0x000b }
            boolean r0 = r0.isHeld()     // Catch:{ all -> 0x000b }
            if (r0 == 0) goto L_0x0094
            android.os.PowerManager$WakeLock r0 = r5.f52483b     // Catch:{ RuntimeException -> 0x0067 }
            r0.release()     // Catch:{ RuntimeException -> 0x0067 }
            com.google.android.gms.internal.stats.zzb r0 = r5.f52490i     // Catch:{ all -> 0x000b }
            if (r0 == 0) goto L_0x00a5
            r5.f52490i = r2     // Catch:{ all -> 0x000b }
            goto L_0x00a5
        L_0x0065:
            r0 = move-exception
            goto L_0x008d
        L_0x0067:
            r0 = move-exception
            java.lang.Class r1 = r0.getClass()     // Catch:{ all -> 0x0065 }
            java.lang.Class<java.lang.RuntimeException> r3 = java.lang.RuntimeException.class
            boolean r1 = r1.equals(r3)     // Catch:{ all -> 0x0065 }
            if (r1 == 0) goto L_0x008c
            java.lang.String r1 = "WakeLock"
            java.lang.String r3 = r5.f52493l     // Catch:{ all -> 0x0065 }
            java.lang.String r3 = java.lang.String.valueOf(r3)     // Catch:{ all -> 0x0065 }
            java.lang.String r4 = " failed to release!"
            java.lang.String r3 = r3.concat(r4)     // Catch:{ all -> 0x0065 }
            android.util.Log.e(r1, r3, r0)     // Catch:{ all -> 0x0065 }
            com.google.android.gms.internal.stats.zzb r0 = r5.f52490i     // Catch:{ all -> 0x000b }
            if (r0 == 0) goto L_0x00a5
            r5.f52490i = r2     // Catch:{ all -> 0x000b }
            goto L_0x00a5
        L_0x008c:
            throw r0     // Catch:{ all -> 0x0065 }
        L_0x008d:
            com.google.android.gms.internal.stats.zzb r1 = r5.f52490i     // Catch:{ all -> 0x000b }
            if (r1 == 0) goto L_0x0093
            r5.f52490i = r2     // Catch:{ all -> 0x000b }
        L_0x0093:
            throw r0     // Catch:{ all -> 0x000b }
        L_0x0094:
            java.lang.String r0 = "WakeLock"
            java.lang.String r1 = r5.f52493l     // Catch:{ all -> 0x000b }
            java.lang.String r1 = java.lang.String.valueOf(r1)     // Catch:{ all -> 0x000b }
            java.lang.String r2 = " should be held!"
            java.lang.String r1 = r1.concat(r2)     // Catch:{ all -> 0x000b }
            android.util.Log.e(r0, r1)     // Catch:{ all -> 0x000b }
        L_0x00a5:
            monitor-exit(r6)     // Catch:{ all -> 0x000b }
            return
        L_0x00a7:
            monitor-exit(r6)     // Catch:{ all -> 0x000b }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: Ta.a.h(int):void");
    }

    private static void i(PowerManager.WakeLock wakeLock, WorkSource workSource) {
        try {
            wakeLock.setWorkSource(workSource);
        } catch (ArrayIndexOutOfBoundsException | IllegalArgumentException e10) {
            Log.wtf("WakeLock", e10.toString());
        }
    }

    public void a(long j10) {
        this.f52497p.incrementAndGet();
        long j11 = Long.MAX_VALUE;
        long max = Math.max(Math.min(Long.MAX_VALUE, f52478r), 1);
        if (j10 > 0) {
            max = Math.min(j10, max);
        }
        synchronized (this.f52482a) {
            try {
                if (!b()) {
                    this.f52490i = zzb.zza(false, (zzc) null);
                    this.f52483b.acquire();
                    this.f52491j.a();
                }
                this.f52484c++;
                this.f52489h++;
                f((String) null);
                d dVar = (d) this.f52496o.get((Object) null);
                if (dVar == null) {
                    dVar = new d((c) null);
                    this.f52496o.put((Object) null, dVar);
                }
                dVar.f52500a++;
                long a10 = this.f52491j.a();
                if (Long.MAX_VALUE - a10 > max) {
                    j11 = a10 + max;
                }
                if (j11 > this.f52486e) {
                    this.f52486e = j11;
                    Future future = this.f52485d;
                    if (future != null) {
                        future.cancel(false);
                    }
                    this.f52485d = this.f52498q.schedule(new b(this), max, TimeUnit.MILLISECONDS);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public boolean b() {
        boolean z10;
        synchronized (this.f52482a) {
            if (this.f52484c > 0) {
                z10 = true;
            } else {
                z10 = false;
            }
        }
        return z10;
    }

    public void c() {
        if (this.f52497p.decrementAndGet() < 0) {
            Log.e("WakeLock", String.valueOf(this.f52493l).concat(" release without a matched acquire!"));
        }
        synchronized (this.f52482a) {
            try {
                f((String) null);
                if (this.f52496o.containsKey((Object) null)) {
                    d dVar = (d) this.f52496o.get((Object) null);
                    if (dVar != null) {
                        int i10 = dVar.f52500a - 1;
                        dVar.f52500a = i10;
                        if (i10 == 0) {
                            this.f52496o.remove((Object) null);
                        }
                    }
                } else {
                    Log.w("WakeLock", String.valueOf(this.f52493l).concat(" counter does not exist"));
                }
                h(0);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void d(boolean z10) {
        synchronized (this.f52482a) {
            this.f52488g = z10;
        }
    }
}
