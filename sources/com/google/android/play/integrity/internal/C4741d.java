package com.google.android.play.integrity.internal;

import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.support.v4.media.session.c;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.google.android.play.integrity.internal.d  reason: case insensitive filesystem */
public final class C4741d {

    /* renamed from: o  reason: collision with root package name */
    private static final Map f56566o = new HashMap();
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final Context f56567a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final C f56568b;

    /* renamed from: c  reason: collision with root package name */
    private final String f56569c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public final List f56570d = new ArrayList();

    /* renamed from: e  reason: collision with root package name */
    private final Set f56571e = new HashSet();
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public final Object f56572f = new Object();
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public boolean f56573g;

    /* renamed from: h  reason: collision with root package name */
    private final Intent f56574h;
    /* access modifiers changed from: private */

    /* renamed from: i  reason: collision with root package name */
    public final J f56575i;

    /* renamed from: j  reason: collision with root package name */
    private final WeakReference f56576j;

    /* renamed from: k  reason: collision with root package name */
    private final IBinder.DeathRecipient f56577k = new F(this);
    /* access modifiers changed from: private */

    /* renamed from: l  reason: collision with root package name */
    public final AtomicInteger f56578l = new AtomicInteger(0);
    /* access modifiers changed from: private */

    /* renamed from: m  reason: collision with root package name */
    public ServiceConnection f56579m;
    /* access modifiers changed from: private */

    /* renamed from: n  reason: collision with root package name */
    public IInterface f56580n;

    public C4741d(Context context, C c10, String str, Intent intent, J j10, I i10) {
        this.f56567a = context;
        this.f56568b = c10;
        this.f56569c = str;
        this.f56574h = intent;
        this.f56575i = j10;
        this.f56576j = new WeakReference((Object) null);
    }

    public static /* synthetic */ void k(C4741d dVar) {
        dVar.f56568b.c("reportBinderDeath", new Object[0]);
        c.a(dVar.f56576j.get());
        dVar.f56568b.c("%s : Binder has died.", dVar.f56569c);
        for (D a10 : dVar.f56570d) {
            a10.a(dVar.w());
        }
        dVar.f56570d.clear();
        synchronized (dVar.f56572f) {
            dVar.x();
        }
    }

    static /* bridge */ /* synthetic */ void o(C4741d dVar, TaskCompletionSource taskCompletionSource) {
        dVar.f56571e.add(taskCompletionSource);
        taskCompletionSource.getTask().addOnCompleteListener(new E(dVar, taskCompletionSource));
    }

    static /* bridge */ /* synthetic */ void q(C4741d dVar, D d10) {
        if (dVar.f56580n == null && !dVar.f56573g) {
            dVar.f56568b.c("Initiate binding to the service.", new Object[0]);
            dVar.f56570d.add(d10);
            C4740c cVar = new C4740c(dVar, (C4739b) null);
            dVar.f56579m = cVar;
            dVar.f56573g = true;
            if (!dVar.f56567a.bindService(dVar.f56574h, cVar, 1)) {
                dVar.f56568b.c("Failed to bind to the service.", new Object[0]);
                dVar.f56573g = false;
                for (D a10 : dVar.f56570d) {
                    a10.a(new C4742e());
                }
                dVar.f56570d.clear();
            }
        } else if (dVar.f56573g) {
            dVar.f56568b.c("Waiting to bind to the service.", new Object[0]);
            dVar.f56570d.add(d10);
        } else {
            d10.run();
        }
    }

    static /* bridge */ /* synthetic */ void r(C4741d dVar) {
        dVar.f56568b.c("linkToDeath", new Object[0]);
        try {
            dVar.f56580n.asBinder().linkToDeath(dVar.f56577k, 0);
        } catch (RemoteException e10) {
            dVar.f56568b.b(e10, "linkToDeath failed", new Object[0]);
        }
    }

    static /* bridge */ /* synthetic */ void s(C4741d dVar) {
        dVar.f56568b.c("unlinkToDeath", new Object[0]);
        dVar.f56580n.asBinder().unlinkToDeath(dVar.f56577k, 0);
    }

    private final RemoteException w() {
        return new RemoteException(String.valueOf(this.f56569c).concat(" : Binder has died."));
    }

    /* access modifiers changed from: private */
    public final void x() {
        for (TaskCompletionSource trySetException : this.f56571e) {
            trySetException.trySetException(w());
        }
        this.f56571e.clear();
    }

    public final Handler c() {
        Handler handler;
        Map map = f56566o;
        synchronized (map) {
            try {
                if (!map.containsKey(this.f56569c)) {
                    HandlerThread handlerThread = new HandlerThread(this.f56569c, 10);
                    handlerThread.start();
                    map.put(this.f56569c, new Handler(handlerThread.getLooper()));
                }
                handler = (Handler) map.get(this.f56569c);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return handler;
    }

    public final IInterface e() {
        return this.f56580n;
    }

    public final void t(D d10, TaskCompletionSource taskCompletionSource) {
        c().post(new G(this, d10.c(), taskCompletionSource, d10));
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void u(TaskCompletionSource taskCompletionSource, Task task) {
        synchronized (this.f56572f) {
            this.f56571e.remove(taskCompletionSource);
        }
    }

    public final void v(TaskCompletionSource taskCompletionSource) {
        synchronized (this.f56572f) {
            this.f56571e.remove(taskCompletionSource);
        }
        c().post(new H(this));
    }
}
