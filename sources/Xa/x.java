package xa;

import Da.C4250b;
import android.content.ComponentName;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.Looper;
import android.os.Messenger;
import android.util.Log;
import android.util.SparseArray;
import com.google.android.gms.common.internal.C4536s;
import com.google.android.gms.internal.cloudmessaging.zzf;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.TimeUnit;

final class x implements ServiceConnection {

    /* renamed from: a  reason: collision with root package name */
    int f62193a = 0;

    /* renamed from: b  reason: collision with root package name */
    final Messenger f62194b = new Messenger(new zzf(Looper.getMainLooper(), new u(this)));

    /* renamed from: c  reason: collision with root package name */
    y f62195c;

    /* renamed from: d  reason: collision with root package name */
    final Queue f62196d = new ArrayDeque();

    /* renamed from: e  reason: collision with root package name */
    final SparseArray f62197e = new SparseArray();

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ D f62198f;

    /* synthetic */ x(D d10, w wVar) {
        this.f62198f = d10;
    }

    /* access modifiers changed from: package-private */
    public final synchronized void a(int i10, String str) {
        b(i10, str, (Throwable) null);
    }

    /* access modifiers changed from: package-private */
    public final synchronized void b(int i10, String str, Throwable th2) {
        try {
            if (Log.isLoggable("MessengerIpcClient", 3)) {
                Log.d("MessengerIpcClient", "Disconnected: ".concat(String.valueOf(str)));
            }
            int i11 = this.f62193a;
            if (i11 == 0) {
                throw new IllegalStateException();
            } else if (i11 == 1 || i11 == 2) {
                if (Log.isLoggable("MessengerIpcClient", 2)) {
                    Log.v("MessengerIpcClient", "Unbinding service");
                }
                this.f62193a = 4;
                C4250b.b().c(this.f62198f.f62142a, this);
                B b10 = new B(i10, str, th2);
                for (C5267A c10 : this.f62196d) {
                    c10.c(b10);
                }
                this.f62196d.clear();
                for (int i12 = 0; i12 < this.f62197e.size(); i12++) {
                    ((C5267A) this.f62197e.valueAt(i12)).c(b10);
                }
                this.f62197e.clear();
            } else if (i11 == 3) {
                this.f62193a = 4;
            }
        } catch (Throwable th3) {
            throw th3;
        }
    }

    /* access modifiers changed from: package-private */
    public final void c() {
        this.f62198f.f62143b.execute(new r(this));
    }

    /* access modifiers changed from: package-private */
    public final synchronized void d() {
        if (this.f62193a == 1) {
            a(1, "Timed out while binding");
        }
    }

    /* access modifiers changed from: package-private */
    public final synchronized void e(int i10) {
        C5267A a10 = (C5267A) this.f62197e.get(i10);
        if (a10 != null) {
            Log.w("MessengerIpcClient", "Timing out request: " + i10);
            this.f62197e.remove(i10);
            a10.c(new B(3, "Timed out waiting for response", (Throwable) null));
            f();
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x003b, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void f() {
        /*
            r2 = this;
            monitor-enter(r2)
            int r0 = r2.f62193a     // Catch:{ all -> 0x0026 }
            r1 = 2
            if (r0 != r1) goto L_0x003a
            java.util.Queue r0 = r2.f62196d     // Catch:{ all -> 0x0026 }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x0026 }
            if (r0 == 0) goto L_0x003a
            android.util.SparseArray r0 = r2.f62197e     // Catch:{ all -> 0x0026 }
            int r0 = r0.size()     // Catch:{ all -> 0x0026 }
            if (r0 != 0) goto L_0x003a
            java.lang.String r0 = "MessengerIpcClient"
            boolean r0 = android.util.Log.isLoggable(r0, r1)     // Catch:{ all -> 0x0026 }
            if (r0 == 0) goto L_0x0028
            java.lang.String r0 = "MessengerIpcClient"
            java.lang.String r1 = "Finished handling requests, unbinding"
            android.util.Log.v(r0, r1)     // Catch:{ all -> 0x0026 }
            goto L_0x0028
        L_0x0026:
            r0 = move-exception
            goto L_0x003c
        L_0x0028:
            r0 = 3
            r2.f62193a = r0     // Catch:{ all -> 0x0026 }
            xa.D r0 = r2.f62198f     // Catch:{ all -> 0x0026 }
            Da.b r1 = Da.C4250b.b()     // Catch:{ all -> 0x0026 }
            android.content.Context r0 = r0.f62142a     // Catch:{ all -> 0x0026 }
            r1.c(r0, r2)     // Catch:{ all -> 0x0026 }
            monitor-exit(r2)
            return
        L_0x003a:
            monitor-exit(r2)
            return
        L_0x003c:
            monitor-exit(r2)     // Catch:{ all -> 0x0026 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: xa.x.f():void");
    }

    /* access modifiers changed from: package-private */
    public final synchronized boolean g(C5267A a10) {
        boolean z10;
        int i10 = this.f62193a;
        if (i10 == 0) {
            this.f62196d.add(a10);
            if (this.f62193a == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            C4536s.o(z10);
            if (Log.isLoggable("MessengerIpcClient", 2)) {
                Log.v("MessengerIpcClient", "Starting bind to GmsCore");
            }
            this.f62193a = 1;
            Intent intent = new Intent("com.google.android.c2dm.intent.REGISTER");
            intent.setPackage("com.google.android.gms");
            try {
                if (!C4250b.b().a(this.f62198f.f62142a, intent, this, 1)) {
                    a(0, "Unable to bind to service");
                } else {
                    this.f62198f.f62143b.schedule(new s(this), 30, TimeUnit.SECONDS);
                }
            } catch (SecurityException e10) {
                b(0, "Unable to bind to service", e10);
            }
        } else if (i10 == 1) {
            this.f62196d.add(a10);
            return true;
        } else if (i10 != 2) {
            return false;
        } else {
            this.f62196d.add(a10);
            c();
            return true;
        }
        return true;
    }

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (Log.isLoggable("MessengerIpcClient", 2)) {
            Log.v("MessengerIpcClient", "Service connected");
        }
        this.f62198f.f62143b.execute(new q(this, iBinder));
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        if (Log.isLoggable("MessengerIpcClient", 2)) {
            Log.v("MessengerIpcClient", "Service disconnected");
        }
        this.f62198f.f62143b.execute(new t(this));
    }
}
