package com.amazon.a;

import android.app.Application;
import android.content.Context;
import com.amazon.a.a.c.f;
import com.amazon.a.a.c.g;
import com.amazon.a.a.i.e;
import com.amazon.a.a.k.d;
import com.amazon.a.a.l.b;
import com.amazon.a.a.o.c;
import java.util.HashMap;

public final class a implements d {

    /* renamed from: a  reason: collision with root package name */
    protected static final String f37039a = "ActivityName";

    /* renamed from: b  reason: collision with root package name */
    protected static final String f37040b = "EventName";

    /* renamed from: c  reason: collision with root package name */
    protected static final String f37041c = "Timestamp";
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public static final c f37042d = new c("AppstoreSDK");

    /* renamed from: e  reason: collision with root package name */
    private static final com.amazon.a.a.g.c f37043e = new com.amazon.a.a.g.a();
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public static a f37044f;
    @com.amazon.a.a.k.a

    /* renamed from: g  reason: collision with root package name */
    private com.amazon.a.a.a.a f37045g;
    @com.amazon.a.a.k.a

    /* renamed from: h  reason: collision with root package name */
    private b f37046h;
    @com.amazon.a.a.k.a

    /* renamed from: i  reason: collision with root package name */
    private f f37047i;
    @com.amazon.a.a.k.a

    /* renamed from: j  reason: collision with root package name */
    private com.amazon.a.a.n.b f37048j;
    @com.amazon.a.a.k.a

    /* renamed from: k  reason: collision with root package name */
    private e f37049k;
    @com.amazon.a.a.k.a

    /* renamed from: l  reason: collision with root package name */
    private com.amazon.a.a.m.c f37050l;
    /* access modifiers changed from: private */
    @com.amazon.a.a.k.a

    /* renamed from: m  reason: collision with root package name */
    public Application f37051m;
    @com.amazon.a.a.k.a

    /* renamed from: n  reason: collision with root package name */
    private com.amazon.a.a.o.b.b f37052n;
    @com.amazon.a.a.k.a

    /* renamed from: o  reason: collision with root package name */
    private com.amazon.a.a.g.c f37053o;

    private a(Application application) {
        long currentTimeMillis = System.currentTimeMillis();
        if (c.f37534a) {
            c cVar = f37042d;
            cVar.a("Starting initialization process for application: " + application.getPackageName());
        }
        b(application);
        if (c.f37534a) {
            long currentTimeMillis2 = System.currentTimeMillis();
            c cVar2 = f37042d;
            cVar2.a("AppstoreSDK.Constructor Time: " + (currentTimeMillis2 - currentTimeMillis));
        }
    }

    /* access modifiers changed from: private */
    public static void c(com.amazon.a.a.n.a.a aVar) {
        if (!d()) {
            f37042d.b("AppstoreSDK subsystem is not fully initialized.  Cannot process task.");
        } else {
            f37044f.f37048j.a(com.amazon.a.a.n.b.d.COMMAND, aVar);
        }
    }

    public static boolean d() {
        if (f37044f != null) {
            return true;
        }
        return false;
    }

    private static boolean l() {
        String str;
        try {
            str = (String) Class.forName(com.amazon.a.a.o.b.at).getMethod(com.amazon.a.a.o.b.au, new Class[]{String.class}).invoke((Object) null, new Object[]{com.amazon.a.a.o.b.aq});
        } catch (Throwable unused) {
            f37042d.b("Unable to retrieve Sandbox property through reflection, using getProp");
            str = a(com.amazon.a.a.o.b.aq);
        }
        return com.amazon.a.a.o.b.ar.equals(str);
    }

    private com.amazon.a.a.n.a m() {
        return new e();
    }

    public void e() {
        h();
        j();
        f();
        g();
    }

    public void f() {
        this.f37047i.a(new com.amazon.a.a.c.c<com.amazon.a.a.a.a.a>() {
            public com.amazon.a.a.c.d b() {
                return com.amazon.a.a.c.d.MIDDLE;
            }

            public com.amazon.a.a.c.b a() {
                return com.amazon.a.a.a.a.b.PAUSE;
            }

            public void a(com.amazon.a.a.a.a.a aVar) {
                HashMap hashMap = new HashMap();
                hashMap.put(a.f37040b, com.amazon.a.a.a.a.b.PAUSE.name());
                hashMap.put(a.f37039a, aVar.b().getClass().getName());
                hashMap.put(a.f37041c, Long.valueOf(System.currentTimeMillis()));
                com.amazon.a.a.f.b bVar = new com.amazon.a.a.f.b(hashMap);
                if (c.f37534a) {
                    a.f37042d.a("Adding lifecycle PAUSE command to pipeline");
                }
                a.c(bVar);
            }
        });
    }

    public void g() {
        this.f37047i.a(new com.amazon.a.a.c.c<com.amazon.a.a.a.a.a>() {
            public com.amazon.a.a.c.d b() {
                return com.amazon.a.a.c.d.MIDDLE;
            }

            public com.amazon.a.a.c.b a() {
                return com.amazon.a.a.a.a.b.RESUME;
            }

            public void a(com.amazon.a.a.a.a.a aVar) {
                HashMap hashMap = new HashMap();
                hashMap.put(a.f37040b, com.amazon.a.a.a.a.b.RESUME.name());
                hashMap.put(a.f37039a, aVar.b().getClass().getName());
                hashMap.put(a.f37041c, Long.valueOf(System.currentTimeMillis()));
                com.amazon.a.a.f.b bVar = new com.amazon.a.a.f.b(hashMap);
                if (c.f37534a) {
                    a.f37042d.a("Adding lifecycle RESUME command to pipeline");
                }
                a.c(bVar);
            }
        });
    }

    public void h() {
        this.f37047i.a(new com.amazon.a.a.c.c<com.amazon.a.a.a.a.c>() {
            public com.amazon.a.a.c.d b() {
                return com.amazon.a.a.c.d.LAST;
            }

            public com.amazon.a.a.c.b a() {
                return com.amazon.a.a.a.a.d.CREATE;
            }

            public void a(com.amazon.a.a.a.a.c cVar) {
                a.this.i();
            }
        });
    }

    public void i() {
        if (c.f37534a) {
            f37042d.a("Enqueuing launch workflow");
        }
        if (!a(this.f37051m)) {
            this.f37048j.a(com.amazon.a.a.n.b.d.COMMAND, m());
        }
    }

    public void j() {
        this.f37047i.a(new com.amazon.a.a.c.c<com.amazon.a.a.a.a.c>() {
            public com.amazon.a.a.c.d b() {
                return com.amazon.a.a.c.d.LAST;
            }

            public com.amazon.a.a.c.b a() {
                return com.amazon.a.a.a.a.d.DESTROY;
            }

            public void a(com.amazon.a.a.a.a.c cVar) {
                if (c.f37534a) {
                    c k10 = a.f37042d;
                    k10.a("Beginning shutdown process for application: " + a.this.f37051m.getPackageName());
                }
                a unused = a.f37044f = null;
            }
        });
    }

    public static void a(Context context) {
        if (!d()) {
            synchronized (a.class) {
                try {
                    if (!d()) {
                        Application application = (Application) context.getApplicationContext();
                        f37044f = new a(application);
                        application.registerActivityLifecycleCallbacks(com.amazon.a.a.f.a.a());
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    private void b(Application application) {
        Object obj;
        com.amazon.a.a.k.c cVar = new com.amazon.a.a.k.c();
        cVar.a(application);
        cVar.a(new com.amazon.a.a.n.d());
        cVar.a(new com.amazon.a.a.m.c());
        cVar.a(new com.amazon.a.a.l.c());
        cVar.a(new com.amazon.a.a.a.c());
        cVar.a(new com.amazon.a.a.i.f());
        cVar.a(new g());
        cVar.a(new com.amazon.a.a.b.b());
        cVar.a(new com.amazon.a.a.h.d());
        cVar.a(new com.amazon.a.a.n.a.d());
        cVar.a(new com.amazon.a.a.o.b.d());
        cVar.a(new com.amazon.a.a.n.a.b());
        if (a(application)) {
            obj = new com.amazon.a.a.g.d();
        } else {
            obj = new com.amazon.a.a.g.b();
        }
        cVar.a(obj);
        cVar.a();
        cVar.b(this);
    }

    public static com.amazon.a.a.g.c c() {
        if (d()) {
            return f37044f.f37053o;
        }
        f37042d.a("Appstore SDK is not initialized. Returning default log handler");
        return f37043e;
    }

    public static boolean a(Application application) {
        boolean z10 = (application.getApplicationInfo().flags & 2) != 0;
        boolean l10 = l();
        if (!z10 || !l10) {
            f37042d.a("Production Mode: Release build or debug.amazon.sandboxmode property is not set on device");
            return false;
        }
        f37042d.a("Sandbox Mode: Debug build and debug.amazon.sandboxmode property is set on device");
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x003f A[SYNTHETIC, Splitter:B:19:0x003f] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x004d A[SYNTHETIC, Splitter:B:24:0x004d] */
    /* JADX WARNING: Removed duplicated region for block: B:30:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String a(java.lang.String r4) {
        /*
            java.lang.String r0 = "Unable to close BufferedReader instance"
            r1 = 0
            java.lang.Runtime r2 = java.lang.Runtime.getRuntime()     // Catch:{ IOException -> 0x0035 }
            java.lang.String r3 = "/system/bin/getprop"
            java.lang.String[] r4 = new java.lang.String[]{r3, r4}     // Catch:{ IOException -> 0x0035 }
            java.lang.Process r4 = r2.exec(r4)     // Catch:{ IOException -> 0x0035 }
            java.io.BufferedReader r2 = new java.io.BufferedReader     // Catch:{ IOException -> 0x0035 }
            java.io.InputStreamReader r3 = new java.io.InputStreamReader     // Catch:{ IOException -> 0x0035 }
            java.io.InputStream r4 = r4.getInputStream()     // Catch:{ IOException -> 0x0035 }
            r3.<init>(r4)     // Catch:{ IOException -> 0x0035 }
            r2.<init>(r3)     // Catch:{ IOException -> 0x0035 }
            java.lang.String r4 = r2.readLine()     // Catch:{ IOException -> 0x0030, all -> 0x002d }
            r2.close()     // Catch:{ Exception -> 0x0027 }
            goto L_0x002c
        L_0x0027:
            com.amazon.a.a.o.c r1 = f37042d
            r1.b(r0)
        L_0x002c:
            return r4
        L_0x002d:
            r4 = move-exception
            r1 = r2
            goto L_0x004b
        L_0x0030:
            r4 = move-exception
            r1 = r2
            goto L_0x0036
        L_0x0033:
            r4 = move-exception
            goto L_0x004b
        L_0x0035:
            r4 = move-exception
        L_0x0036:
            com.amazon.a.a.o.c r2 = f37042d     // Catch:{ all -> 0x0033 }
            java.lang.String r3 = "Can't get system property"
            r2.a(r3, r4)     // Catch:{ all -> 0x0033 }
            if (r1 == 0) goto L_0x0048
            r1.close()     // Catch:{ Exception -> 0x0043 }
            goto L_0x0048
        L_0x0043:
            com.amazon.a.a.o.c r4 = f37042d
            r4.b(r0)
        L_0x0048:
            java.lang.String r4 = ""
            return r4
        L_0x004b:
            if (r1 == 0) goto L_0x0056
            r1.close()     // Catch:{ Exception -> 0x0051 }
            goto L_0x0056
        L_0x0051:
            com.amazon.a.a.o.c r1 = f37042d
            r1.b(r0)
        L_0x0056:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.a.a.a(java.lang.String):java.lang.String");
    }

    @Deprecated
    public static void a(com.amazon.a.a.n.a.a aVar) {
        if (c.f37534a) {
            f37042d.a("WARNING: Use of deprecated method detected.");
        }
        if (d()) {
            c(aVar);
        } else {
            f37042d.b("AppstoreSDK subsystem is not fully initialized.  Cannot process task.");
        }
    }

    public static void a(com.amazon.a.a.n.a.a aVar, Context context) {
        if (!d()) {
            if (context == null || context.getApplicationContext() == null) {
                f37042d.b("AppstoreSDK subsystem cannot be initialized because of null context. Unable to enqueue task.");
                return;
            }
            f37044f = new a((Application) context.getApplicationContext());
        }
        c(aVar);
    }

    public static com.amazon.a.a.a.a b() {
        if (d()) {
            return f37044f.f37045g;
        }
        f37042d.b("Appstore SDK is not initialized. Cannot get ContextManager returning null");
        return null;
    }

    private static void b(String str, Context context) {
        if (c.f37534a) {
            c cVar = f37042d;
            cVar.a(str + " called on context: " + context + " when AppstoreSDK is dead, ignoring...");
        }
    }

    public static e a() {
        if (d()) {
            return f37044f.f37049k;
        }
        f37042d.b("Appstore SDK is not initialized. Cannot get PromptManager returning null");
        return null;
    }

    public static boolean a(String str, String str2) {
        if (d()) {
            try {
                return com.amazon.a.a.o.b.e.a(str, str2, f37044f.f37052n.a());
            } catch (com.amazon.a.a.o.b.a.a e10) {
                c cVar = f37042d;
                cVar.a("Unable to validate signature: " + e10.getMessage());
                return false;
            }
        } else {
            f37042d.a("AppstoreSDK was not yet initialized - cannot do the IAP call");
            return false;
        }
    }

    public static boolean a(String str, Context context) {
        com.amazon.a.a.o.a.a.a();
        if (c.f37534a) {
            c cVar = f37042d;
            cVar.a(str + ": " + context);
        }
        if (d()) {
            return true;
        }
        b(str, context);
        return false;
    }
}
