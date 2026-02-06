package com.amazon.a.a.a;

import android.app.Activity;
import android.app.Application;
import android.app.Service;
import com.amazon.a.a.a.a.b;
import com.amazon.a.a.a.a.d;
import com.amazon.a.a.c.f;
import com.amazon.a.a.k.a;
import com.amazon.a.a.o.g;
import java.util.LinkedHashSet;
import java.util.concurrent.atomic.AtomicReference;

public final class c implements a {

    /* renamed from: a  reason: collision with root package name */
    public static final com.amazon.a.a.o.c f37090a = new com.amazon.a.a.o.c("ContextManagerImplV3");

    /* renamed from: b  reason: collision with root package name */
    private final AtomicReference<Activity> f37091b = new AtomicReference<>();

    /* renamed from: c  reason: collision with root package name */
    private final g<Activity> f37092c = new g<>();

    /* renamed from: d  reason: collision with root package name */
    private final LinkedHashSet<Activity> f37093d = new LinkedHashSet<>();
    @a

    /* renamed from: e  reason: collision with root package name */
    private Application f37094e;
    @a

    /* renamed from: f  reason: collision with root package name */
    private f f37095f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f37096g = false;

    private boolean e() {
        if (!this.f37096g && this.f37093d.size() == 1) {
            return true;
        }
        return false;
    }

    private boolean h(Activity activity) {
        if (com.amazon.a.a.o.c.f37534a) {
            f37090a.a("Checking if application is destroyed");
        }
        if (!this.f37093d.isEmpty()) {
            return false;
        }
        com.amazon.a.a.o.c cVar = f37090a;
        cVar.a("App is destroyed: " + activity.isTaskRoot() + ", " + activity.isFinishing());
        if (!activity.isTaskRoot() || !activity.isFinishing()) {
            return false;
        }
        return true;
    }

    private Activity i(Activity activity) {
        while (activity.isChild()) {
            activity = activity.getParent();
        }
        return activity;
    }

    public void a(Service service) {
    }

    public void b(Service service) {
    }

    public void c(Activity activity) {
        com.amazon.a.a.o.a.a.a();
        com.amazon.a.a.o.c cVar = f37090a;
        cVar.a("Activity resumed: " + activity + ", is child: " + activity.isChild());
        this.f37092c.a(activity);
        this.f37093d.add(activity);
        Activity i10 = i(activity);
        this.f37091b.set(i10);
        cVar.a("Setting visible to: " + i10);
        if (com.amazon.a.a.o.c.f37534a) {
            cVar.a("Activity now visible: " + activity + ", publishing resume event");
        }
        a(b.RESUME, activity);
    }

    public boolean d() {
        return false;
    }

    public void f() {
    }

    public void g() {
    }

    private boolean g(Activity activity) {
        if (activity == null) {
            return false;
        }
        return activity.isTaskRoot();
    }

    public Activity a() {
        com.amazon.a.a.o.a.a.a();
        Object[] array = this.f37093d.toArray();
        Activity activity = null;
        for (int length = array.length - 1; length >= 0; length--) {
            activity = (Activity) array[length];
            if (g(activity)) {
                f37090a.a("root activity" + activity);
                return activity;
            }
        }
        if (activity != null || array.length <= 0) {
            return activity;
        }
        f37090a.a("root not fount returning" + activity);
        return (Activity) array[array.length - 1];
    }

    public void b(Activity activity) {
        com.amazon.a.a.o.a.a.a((Object) activity, "activity");
        com.amazon.a.a.o.a.a.a();
        this.f37093d.remove(activity);
        if (com.amazon.a.a.o.c.f37534a) {
            com.amazon.a.a.o.c cVar = f37090a;
            cVar.a("Activity->onDestroy.  Activity: " + activity + ", Total Activities: " + this.f37093d.size());
        }
        a(b.DESTROY, activity);
        if (h(activity)) {
            f37090a.a("AppLifeCycle application has been destroyed");
            this.f37096g = false;
            a(d.DESTROY);
        }
    }

    public void d(Activity activity) {
        com.amazon.a.a.o.a.a.a();
        if (com.amazon.a.a.o.c.f37534a) {
            com.amazon.a.a.o.c cVar = f37090a;
            cVar.a("Activity paused: " + activity + ", visible activity: " + b());
        }
        this.f37093d.add(activity);
        if (b() == activity) {
            if (com.amazon.a.a.o.c.f37534a) {
                f37090a.a("Setting visible activity to null");
            }
            this.f37091b.set((Object) null);
            a(b.PAUSE, activity);
        }
    }

    public void f(Activity activity) {
        com.amazon.a.a.o.a.a.a((Object) activity, "activity");
        com.amazon.a.a.o.a.a.a();
        com.amazon.a.a.o.c cVar = f37090a;
        cVar.a("Activity stopped: " + activity);
        this.f37093d.add(activity);
        this.f37092c.b(activity);
        a(b.STOP, activity);
        if (this.f37092c.a()) {
            a(d.STOP);
        }
    }

    public void e(Activity activity) {
        com.amazon.a.a.o.a.a.a((Object) activity, "activity");
        com.amazon.a.a.o.a.a.a();
        com.amazon.a.a.o.c cVar = f37090a;
        cVar.a("Activity started: " + activity);
        this.f37093d.add(activity);
        this.f37092c.a(activity);
        a(b.START, activity);
        if (e()) {
            this.f37096g = true;
            a(d.CREATE);
        }
        if (this.f37092c.b() == 1) {
            a(d.START);
        }
    }

    public boolean h() {
        com.amazon.a.a.o.a.a.a();
        return c() || !this.f37093d.isEmpty() || !this.f37092c.a();
    }

    public void a(Activity activity) {
        com.amazon.a.a.o.a.a.a((Object) activity, "activity");
        com.amazon.a.a.o.a.a.a();
        this.f37093d.add(activity);
        if (com.amazon.a.a.o.c.f37534a) {
            com.amazon.a.a.o.c cVar = f37090a;
            cVar.a("Activity->onCreate.  Activity: " + activity + ", Total Activities: " + this.f37093d.size());
        }
        a(b.CREATE, activity);
        if (e()) {
            this.f37096g = true;
            a(d.CREATE);
        }
    }

    public boolean c() {
        return this.f37091b.get() != null;
    }

    public Activity b() {
        com.amazon.a.a.o.a.a.a();
        return this.f37091b.get();
    }

    private void a(b bVar, Activity activity) {
        this.f37095f.a((com.amazon.a.a.c.a) new com.amazon.a.a.a.a.a(bVar, activity));
    }

    private void a(d dVar) {
        this.f37095f.a((com.amazon.a.a.c.a) new com.amazon.a.a.a.a.c(dVar, this.f37094e));
    }
}
