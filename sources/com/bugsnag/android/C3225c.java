package com.bugsnag.android;

import Sg.p;
import android.app.ActivityManager;
import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Process;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lf.v;
import lf.w;
import mf.C6565s;

/* renamed from: com.bugsnag.android.c  reason: case insensitive filesystem */
public final class C3225c {

    /* renamed from: b  reason: collision with root package name */
    public static final a f38669b = new a((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final HandlerThread f38670a;

    /* renamed from: com.bugsnag.android.c$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* renamed from: com.bugsnag.android.c$b */
    public static final class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C3225c f38671a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ A f38672b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ AtomicInteger f38673c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ Handler f38674d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ C3262o0 f38675e;

        b(C3225c cVar, A a10, AtomicInteger atomicInteger, Handler handler, C3262o0 o0Var) {
            this.f38671a = cVar;
            this.f38672b = a10;
            this.f38673c = atomicInteger;
            this.f38674d = handler;
            this.f38675e = o0Var;
        }

        public void run() {
            ActivityManager.ProcessErrorStateInfo c10 = this.f38671a.c(this.f38672b.f38373i);
            if (c10 != null) {
                this.f38671a.a(this.f38675e, c10);
                this.f38672b.K(this.f38675e, (C3242h1) null);
            } else if (this.f38673c.getAndIncrement() < 300) {
                this.f38674d.postDelayed(this, 100);
            }
        }
    }

    public C3225c() {
        HandlerThread handlerThread = new HandlerThread("bugsnag-anr-collector");
        this.f38670a = handlerThread;
        handlerThread.start();
    }

    public final void a(C3262o0 o0Var, ActivityManager.ProcessErrorStateInfo processErrorStateInfo) {
        String str = processErrorStateInfo.shortMsg;
        if (!o0Var.h().isEmpty()) {
            C3250k0 k0Var = (C3250k0) o0Var.h().get(0);
            if (p.J(str, "ANR", false, 2, (Object) null)) {
                str = p.F(str, "ANR", "", false, 4, (Object) null);
            }
            k0Var.h(str);
        }
    }

    public final ActivityManager.ProcessErrorStateInfo b(ActivityManager activityManager, int i10) {
        List<ActivityManager.ProcessErrorStateInfo> list;
        Object obj;
        if (activityManager == null) {
            list = null;
        } else {
            try {
                list = activityManager.getProcessesInErrorState();
            } catch (RuntimeException unused) {
                return null;
            }
        }
        if (list == null) {
            list = C6565s.n();
        }
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((ActivityManager.ProcessErrorStateInfo) obj).pid == i10) {
                break;
            }
        }
        return (ActivityManager.ProcessErrorStateInfo) obj;
    }

    public final ActivityManager.ProcessErrorStateInfo c(Context context) {
        Object obj;
        ActivityManager activityManager;
        ActivityManager activityManager2 = null;
        try {
            v.a aVar = v.f71841b;
            Object systemService = context.getSystemService("activity");
            if (systemService instanceof ActivityManager) {
                activityManager = (ActivityManager) systemService;
            } else {
                activityManager = null;
            }
            obj = v.b(activityManager);
        } catch (Throwable th2) {
            v.a aVar2 = v.f71841b;
            obj = v.b(w.a(th2));
        }
        if (!v.g(obj)) {
            activityManager2 = obj;
        }
        return b(activityManager2, Process.myPid());
    }

    public final void d(A a10, C3262o0 o0Var) {
        Handler handler = new Handler(this.f38670a.getLooper());
        handler.post(new b(this, a10, new AtomicInteger(), handler, o0Var));
    }
}
