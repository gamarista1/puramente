package u1;

import android.os.CancellationSignal;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    private boolean f26541a;

    /* renamed from: b  reason: collision with root package name */
    private Object f26542b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f26543c;

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0012, code lost:
        if (r0 == null) goto L_0x0026;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
        ((android.os.CancellationSignal) r0).cancel();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x001a, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x001b, code lost:
        monitor-enter(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:?, code lost:
        r2.f26543c = false;
        notifyAll();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0022, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0026, code lost:
        monitor-enter(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:?, code lost:
        r2.f26543c = false;
        notifyAll();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x002c, code lost:
        monitor-exit(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x002d, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a() {
        /*
            r2 = this;
            monitor-enter(r2)
            boolean r0 = r2.f26541a     // Catch:{ all -> 0x0007 }
            if (r0 == 0) goto L_0x0009
            monitor-exit(r2)     // Catch:{ all -> 0x0007 }
            return
        L_0x0007:
            r0 = move-exception
            goto L_0x0031
        L_0x0009:
            r0 = 1
            r2.f26541a = r0     // Catch:{ all -> 0x0007 }
            r2.f26543c = r0     // Catch:{ all -> 0x0007 }
            java.lang.Object r0 = r2.f26542b     // Catch:{ all -> 0x0007 }
            monitor-exit(r2)     // Catch:{ all -> 0x0007 }
            r1 = 0
            if (r0 == 0) goto L_0x0026
            android.os.CancellationSignal r0 = (android.os.CancellationSignal) r0     // Catch:{ all -> 0x001a }
            r0.cancel()     // Catch:{ all -> 0x001a }
            goto L_0x0026
        L_0x001a:
            r0 = move-exception
            monitor-enter(r2)
            r2.f26543c = r1     // Catch:{ all -> 0x0023 }
            r2.notifyAll()     // Catch:{ all -> 0x0023 }
            monitor-exit(r2)     // Catch:{ all -> 0x0023 }
            throw r0
        L_0x0023:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0023 }
            throw r0
        L_0x0026:
            monitor-enter(r2)
            r2.f26543c = r1     // Catch:{ all -> 0x002e }
            r2.notifyAll()     // Catch:{ all -> 0x002e }
            monitor-exit(r2)     // Catch:{ all -> 0x002e }
            return
        L_0x002e:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x002e }
            throw r0
        L_0x0031:
            monitor-exit(r2)     // Catch:{ all -> 0x0007 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: u1.d.a():void");
    }

    public Object b() {
        Object obj;
        synchronized (this) {
            try {
                if (this.f26542b == null) {
                    CancellationSignal cancellationSignal = new CancellationSignal();
                    this.f26542b = cancellationSignal;
                    if (this.f26541a) {
                        cancellationSignal.cancel();
                    }
                }
                obj = this.f26542b;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return obj;
    }
}
