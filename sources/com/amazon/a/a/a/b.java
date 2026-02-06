package com.amazon.a.a.a;

import android.app.Activity;
import android.app.Application;
import android.app.Service;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.amazon.a.a.c.f;
import com.amazon.a.a.k.a;
import com.amazon.a.a.k.d;
import com.amazon.a.a.o.c;
import com.amazon.a.a.o.g;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

public final class b implements a, d {

    /* renamed from: a  reason: collision with root package name */
    public static final c f37074a = new c("ContextManagerImplV2");

    /* renamed from: b  reason: collision with root package name */
    private final AtomicReference<Activity> f37075b = new AtomicReference<>();

    /* renamed from: c  reason: collision with root package name */
    private final List<Activity> f37076c = new ArrayList();

    /* renamed from: d  reason: collision with root package name */
    private final g<Service> f37077d = new g<>();

    /* renamed from: e  reason: collision with root package name */
    private final g<Activity> f37078e = new g<>();

    /* renamed from: f  reason: collision with root package name */
    private final AtomicBoolean f37079f = new AtomicBoolean(false);

    /* renamed from: g  reason: collision with root package name */
    private final AtomicBoolean f37080g = new AtomicBoolean(false);

    /* renamed from: h  reason: collision with root package name */
    private final AtomicBoolean f37081h = new AtomicBoolean(false);
    @a

    /* renamed from: i  reason: collision with root package name */
    private Application f37082i;
    @a

    /* renamed from: j  reason: collision with root package name */
    private com.amazon.a.a.n.b f37083j;
    @a

    /* renamed from: k  reason: collision with root package name */
    private f f37084k;

    /* renamed from: l  reason: collision with root package name */
    private String f37085l;

    /* renamed from: m  reason: collision with root package name */
    private boolean f37086m = false;

    private boolean g(Activity activity) {
        if (activity == null) {
            return false;
        }
        return activity.isTaskRoot();
    }

    private boolean h(Activity activity) {
        if (c.f37534a) {
            f37074a.a("Checking if application is destroyed");
        }
        if (!this.f37076c.isEmpty()) {
            return false;
        }
        c cVar = f37074a;
        cVar.a("App is destroyed: " + activity.isTaskRoot() + ", " + activity.isFinishing());
        if (!activity.isTaskRoot() || !activity.isFinishing()) {
            return false;
        }
        return true;
    }

    private boolean i() {
        if (!this.f37086m && this.f37076c.size() == 1) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: private */
    public void j() {
        if (c.f37534a) {
            c cVar = f37074a;
            cVar.a("----------- EXECUTING FINISH ACTIVITIES -----------");
            cVar.a(this.f37082i.getPackageName());
            cVar.a("---------------------------------------------------");
        }
        k();
        l();
        m();
    }

    private void k() {
        Activity a10 = a();
        for (Activity next : this.f37076c) {
            if (!next.equals(a10)) {
                j(next);
            }
        }
    }

    private void l() {
        Activity a10 = a();
        if (a10 == null) {
            f37074a.a("Shutdown found no root, no activities to pop off stack!");
            return;
        }
        c cVar = f37074a;
        cVar.a("Moving task to background");
        a10.moveTaskToBack(true);
        cVar.a("Popping activity stack, root: " + a10);
        Intent intent = new Intent(a10, a10.getClass());
        intent.addFlags(67108864);
        intent.addFlags(536870912);
        a10.startActivity(intent);
    }

    private void m() {
        this.f37083j.a(com.amazon.a.a.n.b.d.FOREGROUND, new com.amazon.a.a.n.a() {
            public void a() {
                Activity a10 = b.this.a();
                c cVar = b.f37074a;
                cVar.a("Finishing Root Task: " + a10);
                if (a10 != null) {
                    cVar.a("Finishing Root");
                    a10.finish();
                }
            }

            public String toString() {
                return "ContextManager: kill root task";
            }
        });
    }

    public void b(Activity activity) {
        com.amazon.a.a.o.a.a.a((Object) activity, "activity");
        com.amazon.a.a.o.a.a.a();
        this.f37076c.remove(activity);
        if (c.f37534a) {
            c cVar = f37074a;
            cVar.a("Activity->onDestroy.  Activity: " + activity + ", Total Activities: " + this.f37076c.size());
        }
        a(com.amazon.a.a.a.a.b.DESTROY, activity);
        if (h(activity)) {
            this.f37086m = false;
            a(com.amazon.a.a.a.a.d.DESTROY);
        }
    }

    public void c(Activity activity) {
        com.amazon.a.a.o.a.a.a();
        c cVar = f37074a;
        cVar.a("Activity resumed: " + activity + ", is child: " + activity.isChild());
        Activity i10 = i(activity);
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Setting visible to: ");
        sb2.append(i10);
        cVar.a(sb2.toString());
        this.f37075b.set(i10);
        if (c.f37534a) {
            cVar.a("Activity now visible: " + activity + ", publishing resume event");
        }
        a(com.amazon.a.a.a.a.b.RESUME, activity);
    }

    public void d(Activity activity) {
        com.amazon.a.a.o.a.a.a();
        if (c.f37534a) {
            c cVar = f37074a;
            cVar.a("Activity paused: " + activity + ", visible activity: " + b());
        }
        if (b() == activity) {
            if (c.f37534a) {
                f37074a.a("Setting visible activity to null");
            }
            this.f37075b.set((Object) null);
            a(com.amazon.a.a.a.a.b.PAUSE, activity);
        }
    }

    public void e(Activity activity) {
        com.amazon.a.a.o.a.a.a((Object) activity, "activity");
        com.amazon.a.a.o.a.a.a();
        c cVar = f37074a;
        cVar.a("Activity started: " + activity);
        this.f37078e.a(activity);
        a(com.amazon.a.a.a.a.b.START, activity);
        if (this.f37078e.b() == 1) {
            a(com.amazon.a.a.a.a.d.START);
        }
    }

    public void f(Activity activity) {
        com.amazon.a.a.o.a.a.a((Object) activity, "activity");
        com.amazon.a.a.o.a.a.a();
        c cVar = f37074a;
        cVar.a("Activity stopped: " + activity);
        this.f37078e.b(activity);
        a(com.amazon.a.a.a.a.b.STOP, activity);
        if (this.f37078e.a()) {
            a(com.amazon.a.a.a.a.d.STOP);
        }
    }

    public void g() {
        if (!this.f37080g.compareAndSet(false, true) && c.f37534a) {
            f37074a.a("Ignoring duplicate stopServices request");
        }
        if (c.f37534a) {
            c cVar = f37074a;
            cVar.a("------------- STOPPING SERVICES -------------------");
            cVar.a(this.f37082i.getPackageName());
            cVar.a("---------------------------------------------------");
        }
        Intent intent = new Intent(this.f37085l);
        intent.setPackage(this.f37082i.getPackageName());
        if (c.f37534a) {
            c cVar2 = f37074a;
            cVar2.a("Sending Broadcast!!!!: " + intent + ", Thread: " + Thread.currentThread());
        }
        this.f37082i.sendBroadcast(intent);
    }

    private Activity i(Activity activity) {
        while (activity.isChild()) {
            activity = activity.getParent();
        }
        return activity;
    }

    public Activity a() {
        com.amazon.a.a.o.a.a.a();
        for (int size = this.f37076c.size() - 1; size >= 0; size--) {
            Activity activity = this.f37076c.get(size);
            if (g(activity)) {
                return activity;
            }
        }
        return null;
    }

    public void a(Activity activity) {
        com.amazon.a.a.o.a.a.a((Object) activity, "activity");
        com.amazon.a.a.o.a.a.a();
        this.f37076c.add(activity);
        if (c.f37534a) {
            c cVar = f37074a;
            cVar.a("Activity->onCreate.  Activity: " + activity + ", Total Activities: " + this.f37076c.size());
        }
        a(com.amazon.a.a.a.a.b.CREATE, activity);
        if (i()) {
            this.f37086m = true;
            a(com.amazon.a.a.a.a.d.CREATE);
        }
    }

    private void j(Activity activity) {
        if (activity != null) {
            if (activity.isChild()) {
                c cVar = f37074a;
                cVar.a("Not finishing activity: " + activity + ", it is a child of: " + activity.getParent());
                return;
            }
            c cVar2 = f37074a;
            cVar2.a("Finishing Activity: " + activity);
            activity.finish();
        }
    }

    public void e() {
        String packageName = this.f37082i.getPackageName();
        this.f37085l = "com.amazon." + packageName + ".shutdown";
        this.f37082i.registerReceiver(new BroadcastReceiver() {
            public void onReceive(Context context, Intent intent) {
                b.this.a(intent);
            }
        }, new IntentFilter(this.f37085l));
    }

    public void f() {
        if (this.f37079f.compareAndSet(false, true)) {
            if (c.f37534a) {
                c cVar = f37074a;
                cVar.a("---------- SCHEDULING FINISH ACTIVITIES -----------");
                cVar.a(this.f37082i.getPackageName());
                cVar.a(Thread.currentThread().toString());
                cVar.a("---------------------------------------------------");
            }
            this.f37083j.a(com.amazon.a.a.n.b.d.FOREGROUND, new com.amazon.a.a.n.a() {
                public void a() {
                    b.this.j();
                }

                public String toString() {
                    return "ContextManager: init app shutdown on main thread";
                }
            });
        }
    }

    public boolean h() {
        com.amazon.a.a.o.a.a.a("Method isContextAware() is not used for Kiwi's ContextManagerImplV2");
        return false;
    }

    public boolean c() {
        return this.f37075b.get() != null;
    }

    public boolean d() {
        return this.f37080g.get() || this.f37079f.get();
    }

    private void c(Service service) {
        if (service != null) {
            if (c.f37534a) {
                c cVar = f37074a;
                cVar.a("Stopping service: " + service);
            }
            service.stopSelf();
        }
    }

    public void b(Service service) {
        com.amazon.a.a.o.a.a.a();
        this.f37077d.b(service);
    }

    public Activity b() {
        com.amazon.a.a.o.a.a.a();
        return this.f37075b.get();
    }

    private void a(com.amazon.a.a.a.a.b bVar, Activity activity) {
        this.f37084k.a((com.amazon.a.a.c.a) new com.amazon.a.a.a.a.a(bVar, activity));
    }

    private void a(com.amazon.a.a.a.a.d dVar) {
        this.f37084k.a((com.amazon.a.a.c.a) new com.amazon.a.a.a.a.c(dVar, this.f37082i));
    }

    public void a(Service service) {
        com.amazon.a.a.o.a.a.a();
        if (c.f37534a) {
            c cVar = f37074a;
            cVar.a("Service->onCreate: " + service);
        }
        this.f37077d.a(service);
    }

    /* access modifiers changed from: private */
    public void a(Intent intent) {
        if (c.f37534a) {
            c cVar = f37074a;
            cVar.a("Received broadcast intent: " + intent);
        }
        if (!intent.getAction().equals(this.f37085l)) {
            if (c.f37535b) {
                c cVar2 = f37074a;
                cVar2.b("Received broadcast for unrequested action: " + intent.getAction());
            }
        } else if (!this.f37080g.get()) {
            if (c.f37535b) {
                c cVar3 = f37074a;
                cVar3.b("Received intent to shutdown app when we are not in shutdown state: " + intent);
            }
        } else if (this.f37081h.compareAndSet(false, true)) {
            if (c.f37534a) {
                c cVar4 = f37074a;
                cVar4.a("Stopping services in response to broadcast");
                cVar4.a("Service to stop: " + this.f37077d.b());
            }
            Iterator<Service> it = this.f37077d.iterator();
            while (it.hasNext()) {
                c(it.next());
            }
        } else if (c.f37534a) {
            f37074a.a("shutdown broadcast already received, ignoring");
        }
    }
}
