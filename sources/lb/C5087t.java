package lb;

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
import kb.i;

/* renamed from: lb.t  reason: case insensitive filesystem */
public final class C5087t {

    /* renamed from: o  reason: collision with root package name */
    private static final Map f60983o = new HashMap();
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final Context f60984a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final C5076i f60985b;

    /* renamed from: c  reason: collision with root package name */
    private final String f60986c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public final List f60987d = new ArrayList();

    /* renamed from: e  reason: collision with root package name */
    private final Set f60988e = new HashSet();

    /* renamed from: f  reason: collision with root package name */
    private final Object f60989f = new Object();
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public boolean f60990g;

    /* renamed from: h  reason: collision with root package name */
    private final Intent f60991h;

    /* renamed from: i  reason: collision with root package name */
    private final WeakReference f60992i;

    /* renamed from: j  reason: collision with root package name */
    private final IBinder.DeathRecipient f60993j = new C5079l(this);

    /* renamed from: k  reason: collision with root package name */
    private final AtomicInteger f60994k = new AtomicInteger(0);
    /* access modifiers changed from: private */

    /* renamed from: l  reason: collision with root package name */
    public ServiceConnection f60995l;
    /* access modifiers changed from: private */

    /* renamed from: m  reason: collision with root package name */
    public IInterface f60996m;

    /* renamed from: n  reason: collision with root package name */
    private final i f60997n;

    public C5087t(Context context, C5076i iVar, String str, Intent intent, i iVar2, C5082o oVar, byte[] bArr) {
        this.f60984a = context;
        this.f60985b = iVar;
        this.f60986c = "com.google.android.finsky.inappreviewservice.InAppReviewService";
        this.f60991h = intent;
        this.f60997n = iVar2;
        this.f60992i = new WeakReference((Object) null);
    }

    public static /* synthetic */ void h(C5087t tVar) {
        tVar.f60985b.d("reportBinderDeath", new Object[0]);
        c.a(tVar.f60992i.get());
        tVar.f60985b.d("%s : Binder has died.", tVar.f60986c);
        for (C5077j c10 : tVar.f60987d) {
            c10.c(tVar.s());
        }
        tVar.f60987d.clear();
        tVar.t();
    }

    static /* bridge */ /* synthetic */ void m(C5087t tVar, C5077j jVar) {
        if (tVar.f60996m == null && !tVar.f60990g) {
            tVar.f60985b.d("Initiate binding to the service.", new Object[0]);
            tVar.f60987d.add(jVar);
            C5086s sVar = new C5086s(tVar, (C5085r) null);
            tVar.f60995l = sVar;
            tVar.f60990g = true;
            if (!tVar.f60984a.bindService(tVar.f60991h, sVar, 1)) {
                tVar.f60985b.d("Failed to bind to the service.", new Object[0]);
                tVar.f60990g = false;
                for (C5077j c10 : tVar.f60987d) {
                    c10.c(new C5088u());
                }
                tVar.f60987d.clear();
            }
        } else if (tVar.f60990g) {
            tVar.f60985b.d("Waiting to bind to the service.", new Object[0]);
            tVar.f60987d.add(jVar);
        } else {
            jVar.run();
        }
    }

    static /* bridge */ /* synthetic */ void n(C5087t tVar) {
        tVar.f60985b.d("linkToDeath", new Object[0]);
        try {
            tVar.f60996m.asBinder().linkToDeath(tVar.f60993j, 0);
        } catch (RemoteException e10) {
            tVar.f60985b.c(e10, "linkToDeath failed", new Object[0]);
        }
    }

    static /* bridge */ /* synthetic */ void o(C5087t tVar) {
        tVar.f60985b.d("unlinkToDeath", new Object[0]);
        tVar.f60996m.asBinder().unlinkToDeath(tVar.f60993j, 0);
    }

    private final RemoteException s() {
        return new RemoteException(String.valueOf(this.f60986c).concat(" : Binder has died."));
    }

    /* access modifiers changed from: private */
    public final void t() {
        synchronized (this.f60989f) {
            try {
                for (TaskCompletionSource trySetException : this.f60988e) {
                    trySetException.trySetException(s());
                }
                this.f60988e.clear();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final Handler c() {
        Handler handler;
        Map map = f60983o;
        synchronized (map) {
            try {
                if (!map.containsKey(this.f60986c)) {
                    HandlerThread handlerThread = new HandlerThread(this.f60986c, 10);
                    handlerThread.start();
                    map.put(this.f60986c, new Handler(handlerThread.getLooper()));
                }
                handler = (Handler) map.get(this.f60986c);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return handler;
    }

    public final IInterface e() {
        return this.f60996m;
    }

    public final void p(C5077j jVar, TaskCompletionSource taskCompletionSource) {
        synchronized (this.f60989f) {
            this.f60988e.add(taskCompletionSource);
            taskCompletionSource.getTask().addOnCompleteListener(new C5078k(this, taskCompletionSource));
        }
        synchronized (this.f60989f) {
            try {
                if (this.f60994k.getAndIncrement() > 0) {
                    this.f60985b.a("Already connected to the service.", new Object[0]);
                }
            } catch (Throwable th2) {
                while (true) {
                    throw th2;
                }
            }
        }
        c().post(new C5080m(this, jVar.b(), jVar));
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void q(TaskCompletionSource taskCompletionSource, Task task) {
        synchronized (this.f60989f) {
            this.f60988e.remove(taskCompletionSource);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x002b, code lost:
        c().post(new lb.C5081n(r3));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0037, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void r(com.google.android.gms.tasks.TaskCompletionSource r4) {
        /*
            r3 = this;
            java.lang.Object r0 = r3.f60989f
            monitor-enter(r0)
            java.util.Set r1 = r3.f60988e     // Catch:{ all -> 0x003a }
            r1.remove(r4)     // Catch:{ all -> 0x003a }
            monitor-exit(r0)     // Catch:{ all -> 0x003a }
            java.lang.Object r4 = r3.f60989f
            monitor-enter(r4)
            java.util.concurrent.atomic.AtomicInteger r0 = r3.f60994k     // Catch:{ all -> 0x0028 }
            int r0 = r0.get()     // Catch:{ all -> 0x0028 }
            if (r0 <= 0) goto L_0x002a
            java.util.concurrent.atomic.AtomicInteger r0 = r3.f60994k     // Catch:{ all -> 0x0028 }
            int r0 = r0.decrementAndGet()     // Catch:{ all -> 0x0028 }
            if (r0 <= 0) goto L_0x002a
            lb.i r0 = r3.f60985b     // Catch:{ all -> 0x0028 }
            java.lang.String r1 = "Leaving the connection open for other ongoing calls."
            r2 = 0
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch:{ all -> 0x0028 }
            r0.d(r1, r2)     // Catch:{ all -> 0x0028 }
            monitor-exit(r4)     // Catch:{ all -> 0x0028 }
            return
        L_0x0028:
            r0 = move-exception
            goto L_0x0038
        L_0x002a:
            monitor-exit(r4)     // Catch:{ all -> 0x0028 }
            lb.n r4 = new lb.n
            r4.<init>(r3)
            android.os.Handler r0 = r3.c()
            r0.post(r4)
            return
        L_0x0038:
            monitor-exit(r4)     // Catch:{ all -> 0x0028 }
            throw r0
        L_0x003a:
            r4 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x003a }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: lb.C5087t.r(com.google.android.gms.tasks.TaskCompletionSource):void");
    }
}
