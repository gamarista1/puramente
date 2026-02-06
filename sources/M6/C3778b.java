package m6;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import m6.C3777a;

/* renamed from: m6.b  reason: case insensitive filesystem */
class C3778b extends C3777a {
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final Object f46468b = new Object();

    /* renamed from: c  reason: collision with root package name */
    private final Handler f46469c = new Handler(Looper.getMainLooper());
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public ArrayList f46470d = new ArrayList();
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public ArrayList f46471e = new ArrayList();

    /* renamed from: f  reason: collision with root package name */
    private final Runnable f46472f = new a();

    /* renamed from: m6.b$a */
    class a implements Runnable {
        a() {
        }

        public void run() {
            synchronized (C3778b.this.f46468b) {
                ArrayList g10 = C3778b.this.f46471e;
                C3778b bVar = C3778b.this;
                bVar.f46471e = bVar.f46470d;
                C3778b.this.f46470d = g10;
            }
            int size = C3778b.this.f46471e.size();
            for (int i10 = 0; i10 < size; i10++) {
                ((C3777a.C0696a) C3778b.this.f46471e.get(i10)).release();
            }
            C3778b.this.f46471e.clear();
        }
    }

    public void a(C3777a.C0696a aVar) {
        synchronized (this.f46468b) {
            this.f46470d.remove(aVar);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x002a, code lost:
        if (r1 == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x002c, code lost:
        r2.f46469c.post(r2.f46472f);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:?, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void d(m6.C3777a.C0696a r3) {
        /*
            r2 = this;
            boolean r0 = m6.C3777a.c()
            if (r0 != 0) goto L_0x000a
            r3.release()
            return
        L_0x000a:
            java.lang.Object r0 = r2.f46468b
            monitor-enter(r0)
            java.util.ArrayList r1 = r2.f46470d     // Catch:{ all -> 0x0017 }
            boolean r1 = r1.contains(r3)     // Catch:{ all -> 0x0017 }
            if (r1 == 0) goto L_0x0019
            monitor-exit(r0)     // Catch:{ all -> 0x0017 }
            return
        L_0x0017:
            r3 = move-exception
            goto L_0x0034
        L_0x0019:
            java.util.ArrayList r1 = r2.f46470d     // Catch:{ all -> 0x0017 }
            r1.add(r3)     // Catch:{ all -> 0x0017 }
            java.util.ArrayList r3 = r2.f46470d     // Catch:{ all -> 0x0017 }
            int r3 = r3.size()     // Catch:{ all -> 0x0017 }
            r1 = 1
            if (r3 != r1) goto L_0x0028
            goto L_0x0029
        L_0x0028:
            r1 = 0
        L_0x0029:
            monitor-exit(r0)     // Catch:{ all -> 0x0017 }
            if (r1 == 0) goto L_0x0033
            android.os.Handler r3 = r2.f46469c
            java.lang.Runnable r0 = r2.f46472f
            r3.post(r0)
        L_0x0033:
            return
        L_0x0034:
            monitor-exit(r0)     // Catch:{ all -> 0x0017 }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: m6.C3778b.d(m6.a$a):void");
    }
}
