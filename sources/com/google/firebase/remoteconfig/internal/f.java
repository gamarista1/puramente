package com.google.firebase.remoteconfig.internal;

import com.google.android.gms.tasks.OnCanceledListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import r3.m;

public class f {

    /* renamed from: d  reason: collision with root package name */
    private static final Map f57828d = new HashMap();

    /* renamed from: e  reason: collision with root package name */
    private static final Executor f57829e = new m();

    /* renamed from: a  reason: collision with root package name */
    private final Executor f57830a;

    /* renamed from: b  reason: collision with root package name */
    private final u f57831b;

    /* renamed from: c  reason: collision with root package name */
    private Task f57832c = null;

    private static class b implements OnSuccessListener, OnFailureListener, OnCanceledListener {

        /* renamed from: a  reason: collision with root package name */
        private final CountDownLatch f57833a;

        private b() {
            this.f57833a = new CountDownLatch(1);
        }

        public boolean a(long j10, TimeUnit timeUnit) {
            return this.f57833a.await(j10, timeUnit);
        }

        public void onCanceled() {
            this.f57833a.countDown();
        }

        public void onFailure(Exception exc) {
            this.f57833a.countDown();
        }

        public void onSuccess(Object obj) {
            this.f57833a.countDown();
        }
    }

    private f(Executor executor, u uVar) {
        this.f57830a = executor;
        this.f57831b = uVar;
    }

    private static Object c(Task task, long j10, TimeUnit timeUnit) {
        b bVar = new b();
        Executor executor = f57829e;
        task.addOnSuccessListener(executor, bVar);
        task.addOnFailureListener(executor, (OnFailureListener) bVar);
        task.addOnCanceledListener(executor, (OnCanceledListener) bVar);
        if (!bVar.a(j10, timeUnit)) {
            throw new TimeoutException("Task await timed out.");
        } else if (task.isSuccessful()) {
            return task.getResult();
        } else {
            throw new ExecutionException(task.getException());
        }
    }

    public static synchronized f h(Executor executor, u uVar) {
        f fVar;
        synchronized (f.class) {
            try {
                String b10 = uVar.b();
                Map map = f57828d;
                if (!map.containsKey(b10)) {
                    map.put(b10, new f(executor, uVar));
                }
                fVar = (f) map.get(b10);
            } catch (Throwable th2) {
                while (true) {
                    throw th2;
                }
            }
        }
        return fVar;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ Void i(g gVar) {
        return this.f57831b.e(gVar);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ Task j(boolean z10, g gVar, Void voidR) {
        if (z10) {
            m(gVar);
        }
        return Tasks.forResult(gVar);
    }

    private synchronized void m(g gVar) {
        this.f57832c = Tasks.forResult(gVar);
    }

    public void d() {
        synchronized (this) {
            this.f57832c = Tasks.forResult(null);
        }
        this.f57831b.a();
    }

    public synchronized Task e() {
        try {
            Task task = this.f57832c;
            if (task != null) {
                if (task.isComplete() && !this.f57832c.isSuccessful()) {
                }
            }
            Executor executor = this.f57830a;
            u uVar = this.f57831b;
            Objects.requireNonNull(uVar);
            this.f57832c = Tasks.call(executor, new c(uVar));
        } catch (Throwable th2) {
            while (true) {
                throw th2;
            }
        }
        return this.f57832c;
    }

    public g f() {
        return g(5);
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0024, code lost:
        return (com.google.firebase.remoteconfig.internal.g) c(e(), r3, java.util.concurrent.TimeUnit.SECONDS);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0025, code lost:
        r3 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x002a, code lost:
        android.util.Log.d("FirebaseRemoteConfig", "Reading from storage file failed.", r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0032, code lost:
        return null;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.google.firebase.remoteconfig.internal.g g(long r3) {
        /*
            r2 = this;
            monitor-enter(r2)
            com.google.android.gms.tasks.Task r0 = r2.f57832c     // Catch:{ all -> 0x0015 }
            if (r0 == 0) goto L_0x0017
            boolean r0 = r0.isSuccessful()     // Catch:{ all -> 0x0015 }
            if (r0 == 0) goto L_0x0017
            com.google.android.gms.tasks.Task r3 = r2.f57832c     // Catch:{ all -> 0x0015 }
            java.lang.Object r3 = r3.getResult()     // Catch:{ all -> 0x0015 }
            com.google.firebase.remoteconfig.internal.g r3 = (com.google.firebase.remoteconfig.internal.g) r3     // Catch:{ all -> 0x0015 }
            monitor-exit(r2)     // Catch:{ all -> 0x0015 }
            return r3
        L_0x0015:
            r3 = move-exception
            goto L_0x0033
        L_0x0017:
            monitor-exit(r2)     // Catch:{ all -> 0x0015 }
            com.google.android.gms.tasks.Task r0 = r2.e()     // Catch:{ InterruptedException -> 0x0029, ExecutionException -> 0x0027, TimeoutException -> 0x0025 }
            java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.SECONDS     // Catch:{ InterruptedException -> 0x0029, ExecutionException -> 0x0027, TimeoutException -> 0x0025 }
            java.lang.Object r3 = c(r0, r3, r1)     // Catch:{ InterruptedException -> 0x0029, ExecutionException -> 0x0027, TimeoutException -> 0x0025 }
            com.google.firebase.remoteconfig.internal.g r3 = (com.google.firebase.remoteconfig.internal.g) r3     // Catch:{ InterruptedException -> 0x0029, ExecutionException -> 0x0027, TimeoutException -> 0x0025 }
            return r3
        L_0x0025:
            r3 = move-exception
            goto L_0x002a
        L_0x0027:
            r3 = move-exception
            goto L_0x002a
        L_0x0029:
            r3 = move-exception
        L_0x002a:
            java.lang.String r4 = "FirebaseRemoteConfig"
            java.lang.String r0 = "Reading from storage file failed."
            android.util.Log.d(r4, r0, r3)
            r3 = 0
            return r3
        L_0x0033:
            monitor-exit(r2)     // Catch:{ all -> 0x0015 }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.remoteconfig.internal.f.g(long):com.google.firebase.remoteconfig.internal.g");
    }

    public Task k(g gVar) {
        return l(gVar, true);
    }

    public Task l(g gVar, boolean z10) {
        return Tasks.call(this.f57830a, new d(this, gVar)).onSuccessTask(this.f57830a, new e(this, z10, gVar));
    }
}
