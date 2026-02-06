package com.amazon.a.a.l;

import android.app.Activity;
import android.content.Intent;
import com.amazon.a.a.c.f;
import com.amazon.a.a.k.d;
import com.amazon.a.a.n.b;
import java.util.Random;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.atomic.AtomicReference;

public class c implements d, b {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public static final com.amazon.a.a.o.c f37276a = new com.amazon.a.a.o.c("ActivityResultManagerImpl");

    /* renamed from: b  reason: collision with root package name */
    private static final Random f37277b = new Random();

    /* renamed from: c  reason: collision with root package name */
    private static final int f37278c = 65535;
    @com.amazon.a.a.k.a

    /* renamed from: d  reason: collision with root package name */
    private b f37279d;
    /* access modifiers changed from: private */
    @com.amazon.a.a.k.a

    /* renamed from: e  reason: collision with root package name */
    public com.amazon.a.a.a.a f37280e;
    @com.amazon.a.a.k.a

    /* renamed from: f  reason: collision with root package name */
    private f f37281f;
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public AtomicReference<a> f37282g = new AtomicReference<>();

    /* renamed from: h  reason: collision with root package name */
    private BlockingQueue<a> f37283h = new LinkedBlockingQueue();

    public void e() {
        this.f37281f.a(new com.amazon.a.a.c.c<com.amazon.a.a.a.a.a>() {
            public com.amazon.a.a.c.d b() {
                return com.amazon.a.a.c.d.MIDDLE;
            }

            public com.amazon.a.a.c.b a() {
                return com.amazon.a.a.a.a.b.RESUME;
            }

            public void a(com.amazon.a.a.a.a.a aVar) {
                a aVar2 = (a) c.this.f37282g.get();
                if (aVar2 != null) {
                    aVar2.b(aVar.b());
                }
            }
        });
    }

    private int b() {
        return f37277b.nextInt(f37278c) + 1;
    }

    private static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final Intent f37287a;

        /* renamed from: b  reason: collision with root package name */
        private final int f37288b;

        /* renamed from: c  reason: collision with root package name */
        private Activity f37289c;

        public a(Intent intent, int i10) {
            this.f37287a = intent;
            this.f37288b = i10;
        }

        public void a(Activity activity) {
            com.amazon.a.a.o.c a10 = c.f37276a;
            a10.a("Calling startActivityForResult from: " + activity);
            activity.startActivityForResult(this.f37287a, this.f37288b);
            this.f37289c = activity;
        }

        public void b(Activity activity) {
            c.f37276a.b("Context changed while awaiting result!");
            if (this.f37289c != null) {
                com.amazon.a.a.o.c a10 = c.f37276a;
                a10.b("Finishing activity from old context: " + this.f37289c);
                this.f37289c.finishActivity(this.f37288b);
            }
            a(activity);
        }

        public int a() {
            return this.f37288b;
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(4:10|11|12|13) */
    /* JADX WARNING: Code restructure failed: missing block: B:11:?, code lost:
        r7 = f37276a;
        r7.a("Interrupted while awaiting for request, returning null");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x009b, code lost:
        r7.a("Received Response: " + r1.a());
        r6.f37282g.set((java.lang.Object) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x00b6, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x00b7, code lost:
        r2 = f37276a;
        r2.a("Received Response: " + r1.a());
        r6.f37282g.set((java.lang.Object) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x00d4, code lost:
        throw r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0092, code lost:
        r7 = move-exception;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:10:0x0094 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.amazon.a.a.l.a a(android.content.Intent r7) {
        /*
            r6 = this;
            java.lang.String r0 = "Received Response: "
            com.amazon.a.a.l.c$a r1 = new com.amazon.a.a.l.c$a
            int r2 = r6.b()
            r1.<init>(r7, r2)
            java.util.concurrent.atomic.AtomicReference<com.amazon.a.a.l.c$a> r2 = r6.f37282g
            r3 = 0
            boolean r2 = w.C2780Y.a(r2, r3, r1)
            if (r2 != 0) goto L_0x001c
            com.amazon.a.a.o.c r7 = f37276a
            java.lang.String r0 = "StartActivityForResult called while ActivityResultManager is already awaiting a result"
            r7.b(r0)
            return r3
        L_0x001c:
            com.amazon.a.a.o.c r2 = f37276a
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "Starting activity for result: "
            r4.append(r5)
            r4.append(r7)
            java.lang.String r5 = ", "
            r4.append(r5)
            int r7 = r7.getFlags()
            r4.append(r7)
            java.lang.String r7 = ", requestId: "
            r4.append(r7)
            int r7 = r1.a()
            r4.append(r7)
            java.lang.String r7 = r4.toString()
            r2.a(r7)
            com.amazon.a.a.l.c$2 r7 = new com.amazon.a.a.l.c$2
            r7.<init>(r1)
            com.amazon.a.a.n.b r4 = r6.f37279d
            com.amazon.a.a.n.b.d r5 = com.amazon.a.a.n.b.d.FOREGROUND
            r4.b(r5, r7)
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ InterruptedException -> 0x0094 }
            r7.<init>()     // Catch:{ InterruptedException -> 0x0094 }
            java.lang.String r4 = "Blocking for request: "
            r7.append(r4)     // Catch:{ InterruptedException -> 0x0094 }
            int r4 = r1.a()     // Catch:{ InterruptedException -> 0x0094 }
            r7.append(r4)     // Catch:{ InterruptedException -> 0x0094 }
            java.lang.String r7 = r7.toString()     // Catch:{ InterruptedException -> 0x0094 }
            r2.a(r7)     // Catch:{ InterruptedException -> 0x0094 }
            java.util.concurrent.BlockingQueue<com.amazon.a.a.l.a> r7 = r6.f37283h     // Catch:{ InterruptedException -> 0x0094 }
            java.lang.Object r7 = r7.take()     // Catch:{ InterruptedException -> 0x0094 }
            com.amazon.a.a.l.a r7 = (com.amazon.a.a.l.a) r7     // Catch:{ InterruptedException -> 0x0094 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r0)
            int r0 = r1.a()
            r4.append(r0)
            java.lang.String r0 = r4.toString()
            r2.a(r0)
            java.util.concurrent.atomic.AtomicReference<com.amazon.a.a.l.c$a> r0 = r6.f37282g
            r0.set(r3)
            return r7
        L_0x0092:
            r7 = move-exception
            goto L_0x00b7
        L_0x0094:
            com.amazon.a.a.o.c r7 = f37276a     // Catch:{ all -> 0x0092 }
            java.lang.String r2 = "Interrupted while awaiting for request, returning null"
            r7.a(r2)     // Catch:{ all -> 0x0092 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r0)
            int r0 = r1.a()
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r7.a(r0)
            java.util.concurrent.atomic.AtomicReference<com.amazon.a.a.l.c$a> r7 = r6.f37282g
            r7.set(r3)
            return r3
        L_0x00b7:
            com.amazon.a.a.o.c r2 = f37276a
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r0)
            int r0 = r1.a()
            r4.append(r0)
            java.lang.String r0 = r4.toString()
            r2.a(r0)
            java.util.concurrent.atomic.AtomicReference<com.amazon.a.a.l.c$a> r0 = r6.f37282g
            r0.set(r3)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.a.a.l.c.a(android.content.Intent):com.amazon.a.a.l.a");
    }

    public boolean a(a aVar) {
        if (com.amazon.a.a.o.c.f37534a) {
            com.amazon.a.a.o.c cVar = f37276a;
            cVar.a("Recieved ActivityResult: " + aVar);
        }
        a aVar2 = this.f37282g.get();
        if (aVar2 == null) {
            if (com.amazon.a.a.o.c.f37534a) {
                f37276a.a("We don't have a current open request, returning");
            }
            return false;
        } else if (aVar2.a() != aVar.b()) {
            if (com.amazon.a.a.o.c.f37534a) {
                com.amazon.a.a.o.c cVar2 = f37276a;
                cVar2.a("We don't have a request with code: " + aVar.b() + ", returning");
            }
            return false;
        } else {
            if (com.amazon.a.a.o.c.f37534a) {
                com.amazon.a.a.o.c cVar3 = f37276a;
                cVar3.a("Signaling thread waiting for request: " + aVar.b());
            }
            this.f37283h.add(aVar);
            return true;
        }
    }
}
