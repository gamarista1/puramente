package com.amazon.a;

import android.app.Activity;
import android.app.Application;
import android.app.Dialog;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import com.amazon.a.a.c.f;
import com.amazon.a.a.i.e;
import com.amazon.a.a.k.a;
import com.amazon.a.a.k.d;
import com.amazon.a.a.l.b;
import com.amazon.a.a.o.c;
import java.util.HashMap;

public final class g implements d {

    /* renamed from: a  reason: collision with root package name */
    protected static final String f37627a = "ActivityName";

    /* renamed from: b  reason: collision with root package name */
    protected static final String f37628b = "EventName";

    /* renamed from: c  reason: collision with root package name */
    protected static final String f37629c = "Timestamp";
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public static final c f37630d = new c("Kiwi");
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public static g f37631e;

    /* renamed from: f  reason: collision with root package name */
    private final boolean f37632f;
    @a

    /* renamed from: g  reason: collision with root package name */
    private com.amazon.a.a.a.a f37633g;
    @a

    /* renamed from: h  reason: collision with root package name */
    private b f37634h;
    @a

    /* renamed from: i  reason: collision with root package name */
    private f f37635i;
    @a

    /* renamed from: j  reason: collision with root package name */
    private com.amazon.a.a.n.b f37636j;
    @a

    /* renamed from: k  reason: collision with root package name */
    private e f37637k;
    @a

    /* renamed from: l  reason: collision with root package name */
    private com.amazon.a.a.m.c f37638l;
    /* access modifiers changed from: private */
    @a

    /* renamed from: m  reason: collision with root package name */
    public Application f37639m;
    @a

    /* renamed from: n  reason: collision with root package name */
    private com.amazon.a.a.o.b.b f37640n;

    private g(Application application, boolean z10) {
        long currentTimeMillis = System.currentTimeMillis();
        this.f37632f = z10;
        if (c.f37534a) {
            c cVar = f37630d;
            cVar.a("Starting initialization process for application: " + application.getPackageName());
            cVar.a("DRM enabled: " + z10);
        }
        a(application);
        if (c.f37534a) {
            long currentTimeMillis2 = System.currentTimeMillis();
            c cVar2 = f37630d;
            cVar2.a("Kiwi.Constructor Time: " + (currentTimeMillis2 - currentTimeMillis));
        }
    }

    public static void d(Activity activity) {
        long currentTimeMillis = System.currentTimeMillis();
        if (a("onStart", (Context) activity)) {
            f37631e.f37633g.e(activity);
        }
        if (c.f37534a) {
            long currentTimeMillis2 = System.currentTimeMillis();
            c cVar = f37630d;
            cVar.a("Kiwi.ActivityOnStart Time: " + (currentTimeMillis2 - currentTimeMillis));
        }
    }

    public static void e(Activity activity) {
        long currentTimeMillis = System.currentTimeMillis();
        if (a("onStop", (Context) activity)) {
            f37631e.f37633g.f(activity);
        }
        if (c.f37534a) {
            long currentTimeMillis2 = System.currentTimeMillis();
            c cVar = f37630d;
            cVar.a("Kiwi.ActivityOnStop Time: " + (currentTimeMillis2 - currentTimeMillis));
        }
    }

    private void f() {
        this.f37635i.a(new com.amazon.a.a.c.c<com.amazon.a.a.a.a.a>() {
            public com.amazon.a.a.c.d b() {
                return com.amazon.a.a.c.d.MIDDLE;
            }

            public com.amazon.a.a.c.b a() {
                return com.amazon.a.a.a.a.b.RESUME;
            }

            public void a(com.amazon.a.a.a.a.a aVar) {
                HashMap hashMap = new HashMap();
                hashMap.put(g.f37628b, com.amazon.a.a.a.a.b.RESUME.name());
                hashMap.put(g.f37627a, aVar.b().getClass().getName());
                hashMap.put(g.f37629c, Long.valueOf(System.currentTimeMillis()));
                com.amazon.a.a.f.b bVar = new com.amazon.a.a.f.b(hashMap);
                if (c.f37534a) {
                    g.f37630d.a("Adding lifecycle RESUME command to pipeline");
                }
                g.c((com.amazon.a.a.n.a.a) bVar);
            }
        });
    }

    private void g() {
        this.f37635i.a(new com.amazon.a.a.c.c<com.amazon.a.a.a.a.c>() {
            public com.amazon.a.a.c.d b() {
                return com.amazon.a.a.c.d.LAST;
            }

            public com.amazon.a.a.c.b a() {
                return com.amazon.a.a.a.a.d.CREATE;
            }

            public void a(com.amazon.a.a.a.a.c cVar) {
                g.this.h();
            }
        });
    }

    /* access modifiers changed from: private */
    public void h() {
        if (c.f37534a) {
            f37630d.a("Enqueuing launch workflow");
        }
        this.f37636j.a(com.amazon.a.a.n.b.d.COMMAND, i());
    }

    private com.amazon.a.a.n.a i() {
        if (this.f37632f) {
            return new f();
        }
        return new e();
    }

    private void j() {
        this.f37635i.a(new com.amazon.a.a.c.c<com.amazon.a.a.a.a.c>() {
            public com.amazon.a.a.c.d b() {
                return com.amazon.a.a.c.d.LAST;
            }

            public com.amazon.a.a.c.b a() {
                return com.amazon.a.a.a.a.d.DESTROY;
            }

            public void a(com.amazon.a.a.a.a.c cVar) {
                if (c.f37534a) {
                    c b10 = g.f37630d;
                    b10.a("Beginning shutdown process for application: " + g.this.f37639m.getPackageName());
                }
                g unused = g.f37631e = null;
            }
        });
    }

    private void a(Application application) {
        com.amazon.a.a.k.c cVar = new com.amazon.a.a.k.c();
        cVar.a(application);
        cVar.a(new com.amazon.a.a.n.d());
        cVar.a(new com.amazon.a.a.m.c());
        cVar.a(new com.amazon.a.a.l.c());
        cVar.a(new com.amazon.a.a.a.b());
        cVar.a(new com.amazon.a.a.i.f());
        cVar.a(new com.amazon.a.a.c.g());
        cVar.a(new com.amazon.a.a.b.b());
        cVar.a(new com.amazon.a.a.h.d());
        cVar.a(new com.amazon.a.a.n.a.d());
        cVar.a(new com.amazon.a.a.o.b.c());
        cVar.a(new com.amazon.a.a.n.a.b());
        cVar.a();
        cVar.b(this);
    }

    /* access modifiers changed from: private */
    public static void c(com.amazon.a.a.n.a.a aVar) {
        f37631e.f37636j.a(com.amazon.a.a.n.b.d.COMMAND, aVar);
    }

    private static boolean c() {
        return f37631e != null;
    }

    private static void b(String str, Context context) {
        if (c.f37534a) {
            c cVar = f37630d;
            cVar.a(str + " called on context: " + context + " when Kiwi is dead, ignoring...");
        }
    }

    public static void c(Activity activity) {
        long currentTimeMillis = System.currentTimeMillis();
        if (a("onDestroy", (Context) activity)) {
            try {
                f37631e.f37633g.b(activity);
            } catch (Exception e10) {
                f37630d.b("Kiwi.ActivityOnDestroy Error: ", e10);
            }
        }
        if (c.f37534a) {
            long currentTimeMillis2 = System.currentTimeMillis();
            c cVar = f37630d;
            cVar.a("Kiwi.ActivityOnDestroy Time: " + (currentTimeMillis2 - currentTimeMillis));
        }
    }

    public static void b(Activity activity) {
        long currentTimeMillis = System.currentTimeMillis();
        if (a("onPause", (Context) activity)) {
            f37631e.f37633g.d(activity);
        }
        if (c.f37534a) {
            long currentTimeMillis2 = System.currentTimeMillis();
            c cVar = f37630d;
            cVar.a("Kiwi.ActivityOnPause Time: " + (currentTimeMillis2 - currentTimeMillis));
        }
    }

    private void d() {
        this.f37635i.a(new com.amazon.a.a.c.c<com.amazon.a.a.a.a.a>() {
            public com.amazon.a.a.c.d b() {
                return com.amazon.a.a.c.d.MIDDLE;
            }

            public com.amazon.a.a.c.b a() {
                return com.amazon.a.a.a.a.b.PAUSE;
            }

            public void a(com.amazon.a.a.a.a.a aVar) {
                HashMap hashMap = new HashMap();
                hashMap.put(g.f37628b, com.amazon.a.a.a.a.b.PAUSE.name());
                hashMap.put(g.f37627a, aVar.b().getClass().getName());
                hashMap.put(g.f37629c, Long.valueOf(System.currentTimeMillis()));
                com.amazon.a.a.f.b bVar = new com.amazon.a.a.f.b(hashMap);
                if (c.f37534a) {
                    g.f37630d.a("Adding lifecycle PAUSE command to pipeline");
                }
                g.c((com.amazon.a.a.n.a.a) bVar);
            }
        });
    }

    public void e() {
        g();
        j();
        d();
        f();
    }

    public static void b(Activity activity, boolean z10) {
        if (a("onWindowFocusChanged", (Context) activity)) {
            f37631e.f37637k.a(activity, z10);
        }
    }

    public static void a(Activity activity, boolean z10) {
        long currentTimeMillis = System.currentTimeMillis();
        if (!c()) {
            f37631e = new g(activity.getApplication(), z10);
        }
        if (a("onCreate", (Context) activity)) {
            f37631e.f37633g.a(activity);
        }
        if (c.f37534a) {
            long currentTimeMillis2 = System.currentTimeMillis();
            c cVar = f37630d;
            cVar.a("Kiwi.ActivityOnCreate Time: " + (currentTimeMillis2 - currentTimeMillis));
        }
    }

    @Deprecated
    public static void a(com.amazon.a.a.n.a.a aVar) {
        if (c.f37534a) {
            f37630d.a("WARNING: Use of deprecated method detected.");
        }
        if (c()) {
            c(aVar);
        } else {
            f37630d.b("Kiwi subsystem is not fully initialized.  Cannot process task.");
        }
    }

    public static void a(com.amazon.a.a.n.a.a aVar, Context context) {
        if (!c()) {
            if (context == null || context.getApplicationContext() == null) {
                f37630d.b("Kiwi subsystem cannot be initialized because of null context. Unable to enqueue task.");
                return;
            }
            f37631e = new g((Application) context.getApplicationContext(), false);
        }
        c(aVar);
    }

    public static e a() {
        return f37631e.f37637k;
    }

    public static boolean a(String str, String str2) {
        if (c()) {
            try {
                return com.amazon.a.a.o.b.e.a(str, str2, f37631e.f37640n.a());
            } catch (com.amazon.a.a.o.b.a.a e10) {
                c cVar = f37630d;
                cVar.a("Unable to validate signature: " + e10.getMessage());
                return false;
            }
        } else {
            f37630d.a("Kiwi was not yet initialized - cannot do the IAP call");
            return false;
        }
    }

    private static boolean a(String str, Context context) {
        com.amazon.a.a.o.a.a.a();
        if (c.f37534a) {
            c cVar = f37630d;
            cVar.a(str + ": " + context);
        }
        if (c()) {
            return true;
        }
        b(str, context);
        return false;
    }

    public static void a(Activity activity) {
        long currentTimeMillis = System.currentTimeMillis();
        if (a("onResume", (Context) activity)) {
            f37631e.f37633g.c(activity);
        }
        if (c.f37534a) {
            long currentTimeMillis2 = System.currentTimeMillis();
            c cVar = f37630d;
            cVar.a("Kiwi.ActivityOnResume Time: " + (currentTimeMillis2 - currentTimeMillis));
        }
    }

    public static Dialog a(Activity activity, int i10) {
        long currentTimeMillis = System.currentTimeMillis();
        if (a("onCreateDialog", (Context) activity)) {
            return f37631e.f37637k.a(activity, i10);
        }
        if (!c.f37534a) {
            return null;
        }
        long currentTimeMillis2 = System.currentTimeMillis();
        c cVar = f37630d;
        cVar.a("Kiwi.ActivityOnCreateDialog Time: " + (currentTimeMillis2 - currentTimeMillis));
        return null;
    }

    public static boolean a(Activity activity, int i10, int i11, Intent intent) {
        if (!a("onActivityResult", (Context) activity)) {
            return false;
        }
        return f37631e.f37634h.a(new com.amazon.a.a.l.a(activity, i10, i11, intent));
    }

    public static void a(Service service, boolean z10) {
        long currentTimeMillis = System.currentTimeMillis();
        if (a("onCreate", (Context) service)) {
            f37631e.f37633g.a(service);
        }
        if (c.f37534a) {
            long currentTimeMillis2 = System.currentTimeMillis();
            c cVar = f37630d;
            cVar.a("Kiwi.ServiceOnCreate Time: " + (currentTimeMillis2 - currentTimeMillis));
        }
    }

    public static void a(Service service) {
        long currentTimeMillis = System.currentTimeMillis();
        if (a("onDestroy", (Context) service)) {
            f37631e.f37633g.b(service);
        }
        if (c.f37534a) {
            long currentTimeMillis2 = System.currentTimeMillis();
            c cVar = f37630d;
            cVar.a("Kiwi.ServiceOnDestroy Time: " + (currentTimeMillis2 - currentTimeMillis));
        }
    }
}
