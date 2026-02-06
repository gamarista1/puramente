package com.amazon.a.a.n.a;

import android.app.Application;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.amazon.a.a.n.a.a.b;
import com.amazon.a.a.o.c;
import com.amazon.d.a.d;
import com.amazon.d.a.e;
import com.amazon.d.a.f;
import com.amazon.d.a.g;
import com.amazon.d.a.h;
import com.amazon.d.a.i;
import com.amazon.d.a.j;
import java.util.Map;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class d {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public static final c f37337a = new c("CommandServiceClient");

    /* renamed from: b  reason: collision with root package name */
    private static final String f37338b = "com.amazon.venezia.service.command.CommandServiceImpl";

    /* renamed from: c  reason: collision with root package name */
    private static final String f37339c = "com.amazon.venezia.CommandService";

    /* renamed from: d  reason: collision with root package name */
    private com.amazon.d.a.d f37340d;

    /* renamed from: e  reason: collision with root package name */
    private String f37341e;
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public final BlockingQueue<c> f37342f = new LinkedBlockingQueue();
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public final BlockingQueue<com.amazon.d.a.d> f37343g = new LinkedBlockingQueue();
    @com.amazon.a.a.k.a

    /* renamed from: h  reason: collision with root package name */
    private Application f37344h;
    @com.amazon.a.a.k.a

    /* renamed from: i  reason: collision with root package name */
    private b f37345i;
    @com.amazon.a.a.k.a

    /* renamed from: j  reason: collision with root package name */
    private com.amazon.a.a.m.c f37346j;

    /* renamed from: k  reason: collision with root package name */
    private final ServiceConnection f37347k = new ServiceConnection() {
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            d.f37337a.a("onServiceConnected");
            d.this.f37343g.add(d.a.a(iBinder));
        }

        public void onServiceDisconnected(ComponentName componentName) {
            d.f37337a.a("onServiceDisconnected!!!");
        }
    };

    /* renamed from: l  reason: collision with root package name */
    private final i f37348l = new i.a() {
        public void a(j jVar) {
            d.this.f37342f.add(new c(jVar));
        }

        public void a(h hVar) {
            d.this.f37342f.add(new c(hVar));
        }

        public void a(f fVar) {
            d.this.f37342f.add(new c(fVar));
        }

        public void a(g gVar) {
            d.this.f37342f.add(new c(gVar));
        }
    };

    static class a {

        /* renamed from: a  reason: collision with root package name */
        int f37353a;

        /* renamed from: b  reason: collision with root package name */
        boolean f37354b;

        /* renamed from: c  reason: collision with root package name */
        long f37355c;

        a() {
        }
    }

    private boolean d() {
        if (this.f37340d != null) {
            return true;
        }
        return false;
    }

    private void e() {
        long currentTimeMillis = System.currentTimeMillis();
        c cVar = f37337a;
        cVar.a("Binding Service!!!");
        Intent f10 = f();
        if (a((Context) this.f37344h, f10)) {
            cVar.a("Found service on one or more packages");
            Intent a10 = a(f10);
            String packageName = a10.getComponent().getPackageName();
            cVar.a("Attempting to bind to service on " + packageName);
            if (this.f37344h.bindService(a10, this.f37347k, 1)) {
                try {
                    cVar.a("Blocking while service is being bound!!");
                    this.f37340d = this.f37343g.take();
                    cVar.a("service bound, returning!!");
                    if (c.f37534a) {
                        long currentTimeMillis2 = System.currentTimeMillis();
                        cVar.a("Kiwi.BindService Time: " + (currentTimeMillis2 - currentTimeMillis));
                    }
                    this.f37346j.a(com.amazon.a.a.m.c.f37301f, packageName);
                    this.f37341e = packageName;
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                    throw new b();
                }
            } else {
                throw new b();
            }
        } else {
            throw new com.amazon.a.a.n.a.a.c();
        }
    }

    private Intent f() {
        Intent intent = new Intent();
        intent.setAction(f37339c);
        f37337a.a("Created intent with  action  com.amazon.venezia.CommandService");
        return intent;
    }

    private c g() {
        try {
            c cVar = f37337a;
            cVar.a("Blocking for result from service");
            c take = this.f37342f.take();
            cVar.a("Received result from service");
            return take;
        } catch (InterruptedException unused) {
            f37337a.a("TaskThread interrupted, returning null result");
            return null;
        }
    }

    private c b(com.amazon.d.a.c cVar) {
        this.f37346j.a(com.amazon.a.a.m.c.f37302g, cVar.b());
        this.f37340d.a(cVar, this.f37348l);
        return g();
    }

    public c a(com.amazon.d.a.c cVar) {
        a aVar = new a();
        aVar.f37353a = 6;
        aVar.f37355c = 100;
        while (true) {
            try {
                if (!d()) {
                    e();
                }
                return b(cVar);
            } catch (b e10) {
                a((com.amazon.a.a.d.b) e10, aVar);
                if (!aVar.f37354b) {
                    throw e10;
                }
            } catch (com.amazon.a.a.n.a.a.c e11) {
                a((com.amazon.a.a.d.b) e11, aVar);
                if (!aVar.f37354b) {
                    throw e11;
                }
            }
        }
    }

    public void b() {
        c cVar = f37337a;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Finishing CommandServiceClient, unbinding service: ");
        sb2.append(this.f37340d != null);
        cVar.a(sb2.toString());
        if (this.f37340d != null) {
            this.f37344h.unbindService(this.f37347k);
            this.f37340d = null;
        }
    }

    private boolean b(String str) {
        c cVar = f37337a;
        cVar.a("isPackageSignatureTrusted " + str);
        return this.f37345i.a(str, i.f37404a);
    }

    static void a(com.amazon.a.a.d.b bVar, a aVar) {
        c cVar = f37337a;
        cVar.b("CommandServiceException happened, retriesLeft=" + aVar.f37353a, bVar);
        int i10 = aVar.f37353a;
        if (i10 == 0) {
            aVar.f37354b = false;
            return;
        }
        aVar.f37353a = i10 - 1;
        aVar.f37354b = true;
        try {
            cVar.a("Sleeping for " + aVar.f37355c + " ms");
            Thread.sleep(aVar.f37355c);
        } catch (InterruptedException unused) {
            aVar.f37354b = false;
        }
        aVar.f37355c *= 2;
    }

    public String a() {
        return this.f37341e;
    }

    private boolean a(Context context, Intent intent) {
        return context.getPackageManager().resolveService(intent, 64) != null;
    }

    private Intent a(String str) {
        Intent intent = new Intent();
        intent.setAction(f37339c);
        intent.setClassName(str, f37338b);
        return intent;
    }

    private Intent a(Intent intent) {
        if (this.f37341e != null) {
            c cVar = f37337a;
            cVar.a("Using previously determined package " + this.f37341e);
            return a(this.f37341e);
        }
        c cVar2 = f37337a;
        cVar2.a("No previously determined package found, checking for suitable package.");
        Intent a10 = a(this.f37344h.getPackageManager().queryIntentServices(intent, 64));
        if (a10 != null) {
            return a10;
        }
        cVar2.a("No app with valid signature was providing our service.");
        throw new com.amazon.a.a.n.a.a.c();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:?, code lost:
        r5.a("Signature of package " + r3 + " is okay");
        r2 = r3;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private android.content.Intent a(java.util.List<android.content.pm.ResolveInfo> r9) {
        /*
            r8 = this;
            r0 = 0
            r1 = 0
            r2 = r0
        L_0x0003:
            int r3 = r9.size()     // Catch:{ Exception -> 0x007b }
            r4 = -1
            if (r1 >= r3) goto L_0x0099
            java.lang.Object r2 = r9.get(r1)     // Catch:{ Exception -> 0x007b }
            android.content.pm.ResolveInfo r2 = (android.content.pm.ResolveInfo) r2     // Catch:{ Exception -> 0x007b }
            android.content.pm.ServiceInfo r3 = r2.serviceInfo     // Catch:{ Exception -> 0x007b }
            android.content.pm.ApplicationInfo r3 = r3.applicationInfo     // Catch:{ Exception -> 0x007b }
            java.lang.String r3 = r3.packageName     // Catch:{ Exception -> 0x007b }
            com.amazon.a.a.o.c r5 = f37337a     // Catch:{ Exception -> 0x007b }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x007b }
            r6.<init>()     // Catch:{ Exception -> 0x007b }
            java.lang.String r7 = "Examining package "
            r6.append(r7)     // Catch:{ Exception -> 0x007b }
            r6.append(r3)     // Catch:{ Exception -> 0x007b }
            java.lang.String r6 = r6.toString()     // Catch:{ Exception -> 0x007b }
            r5.a(r6)     // Catch:{ Exception -> 0x007b }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x007b }
            r6.<init>()     // Catch:{ Exception -> 0x007b }
            java.lang.String r7 = "Priority is "
            r6.append(r7)     // Catch:{ Exception -> 0x007b }
            android.content.IntentFilter r2 = r2.filter     // Catch:{ Exception -> 0x007b }
            int r2 = r2.getPriority()     // Catch:{ Exception -> 0x007b }
            r6.append(r2)     // Catch:{ Exception -> 0x007b }
            java.lang.String r2 = r6.toString()     // Catch:{ Exception -> 0x007b }
            r5.a(r2)     // Catch:{ Exception -> 0x007b }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x007b }
            r2.<init>()     // Catch:{ Exception -> 0x007b }
            java.lang.String r6 = "Checking signature of package "
            r2.append(r6)     // Catch:{ Exception -> 0x007b }
            r2.append(r3)     // Catch:{ Exception -> 0x007b }
            java.lang.String r2 = r2.toString()     // Catch:{ Exception -> 0x007b }
            r5.a(r2)     // Catch:{ Exception -> 0x007b }
            boolean r2 = r8.b((java.lang.String) r3)     // Catch:{ Exception -> 0x007b }
            java.lang.String r6 = "Signature of package "
            if (r2 == 0) goto L_0x007d
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x007b }
            r9.<init>()     // Catch:{ Exception -> 0x007b }
            r9.append(r6)     // Catch:{ Exception -> 0x007b }
            r9.append(r3)     // Catch:{ Exception -> 0x007b }
            java.lang.String r2 = " is okay"
            r9.append(r2)     // Catch:{ Exception -> 0x007b }
            java.lang.String r9 = r9.toString()     // Catch:{ Exception -> 0x007b }
            r5.a(r9)     // Catch:{ Exception -> 0x007b }
            r2 = r3
            goto L_0x009a
        L_0x007b:
            r9 = move-exception
            goto L_0x00a1
        L_0x007d:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x007b }
            r2.<init>()     // Catch:{ Exception -> 0x007b }
            r2.append(r6)     // Catch:{ Exception -> 0x007b }
            r2.append(r3)     // Catch:{ Exception -> 0x007b }
            java.lang.String r4 = " is bad"
            r2.append(r4)     // Catch:{ Exception -> 0x007b }
            java.lang.String r2 = r2.toString()     // Catch:{ Exception -> 0x007b }
            r5.a(r2)     // Catch:{ Exception -> 0x007b }
            int r1 = r1 + 1
            r2 = r3
            goto L_0x0003
        L_0x0099:
            r1 = r4
        L_0x009a:
            if (r1 <= r4) goto L_0x00b7
            android.content.Intent r9 = r8.a((java.lang.String) r2)     // Catch:{ Exception -> 0x007b }
            return r9
        L_0x00a1:
            com.amazon.a.a.o.c r1 = f37337a
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Caught exception "
            r2.append(r3)
            r2.append(r9)
            java.lang.String r9 = r2.toString()
            r1.a(r9)
        L_0x00b7:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.a.a.n.a.d.a(java.util.List):android.content.Intent");
    }

    public c a(com.amazon.d.a.a aVar) {
        aVar.a((com.amazon.d.a.b) null);
        return g();
    }

    public c a(f fVar, final e eVar) {
        fVar.a(new e.a() {
            public String a() {
                return eVar.name();
            }

            public Map b() {
                return null;
            }
        });
        return g();
    }
}
