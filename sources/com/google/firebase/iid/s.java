package com.google.firebase.iid;

import android.util.Pair;
import androidx.collection.C1587a;
import com.google.android.gms.tasks.Task;
import java.util.Map;
import java.util.concurrent.Executor;

class s {

    /* renamed from: a  reason: collision with root package name */
    private final Executor f57330a;

    /* renamed from: b  reason: collision with root package name */
    private final Map f57331b = new C1587a();

    interface a {
        Task start();
    }

    s(Executor executor) {
        this.f57330a = executor;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x003d, code lost:
        return r3;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized com.google.android.gms.tasks.Task a(java.lang.String r3, java.lang.String r4, com.google.firebase.iid.s.a r5) {
        /*
            r2 = this;
            monitor-enter(r2)
            android.util.Pair r0 = new android.util.Pair     // Catch:{ all -> 0x003a }
            r0.<init>(r3, r4)     // Catch:{ all -> 0x003a }
            java.util.Map r3 = r2.f57331b     // Catch:{ all -> 0x003a }
            java.lang.Object r3 = r3.get(r0)     // Catch:{ all -> 0x003a }
            com.google.android.gms.tasks.Task r3 = (com.google.android.gms.tasks.Task) r3     // Catch:{ all -> 0x003a }
            r4 = 3
            if (r3 == 0) goto L_0x003e
            java.lang.String r5 = "FirebaseInstanceId"
            boolean r4 = android.util.Log.isLoggable(r5, r4)     // Catch:{ all -> 0x003a }
            if (r4 == 0) goto L_0x003c
            java.lang.String r4 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x003a }
            int r5 = r4.length()     // Catch:{ all -> 0x003a }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x003a }
            int r5 = r5 + 29
            r0.<init>(r5)     // Catch:{ all -> 0x003a }
            java.lang.String r5 = "Joining ongoing request for: "
            r0.append(r5)     // Catch:{ all -> 0x003a }
            r0.append(r4)     // Catch:{ all -> 0x003a }
            java.lang.String r4 = "FirebaseInstanceId"
            java.lang.String r5 = r0.toString()     // Catch:{ all -> 0x003a }
            android.util.Log.d(r4, r5)     // Catch:{ all -> 0x003a }
            goto L_0x003c
        L_0x003a:
            r3 = move-exception
            goto L_0x007c
        L_0x003c:
            monitor-exit(r2)
            return r3
        L_0x003e:
            java.lang.String r3 = "FirebaseInstanceId"
            boolean r3 = android.util.Log.isLoggable(r3, r4)     // Catch:{ all -> 0x003a }
            if (r3 == 0) goto L_0x0066
            java.lang.String r3 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x003a }
            int r4 = r3.length()     // Catch:{ all -> 0x003a }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x003a }
            int r4 = r4 + 24
            r1.<init>(r4)     // Catch:{ all -> 0x003a }
            java.lang.String r4 = "Making new request for: "
            r1.append(r4)     // Catch:{ all -> 0x003a }
            r1.append(r3)     // Catch:{ all -> 0x003a }
            java.lang.String r3 = "FirebaseInstanceId"
            java.lang.String r4 = r1.toString()     // Catch:{ all -> 0x003a }
            android.util.Log.d(r3, r4)     // Catch:{ all -> 0x003a }
        L_0x0066:
            com.google.android.gms.tasks.Task r3 = r5.start()     // Catch:{ all -> 0x003a }
            java.util.concurrent.Executor r4 = r2.f57330a     // Catch:{ all -> 0x003a }
            com.google.firebase.iid.r r5 = new com.google.firebase.iid.r     // Catch:{ all -> 0x003a }
            r5.<init>(r2, r0)     // Catch:{ all -> 0x003a }
            com.google.android.gms.tasks.Task r3 = r3.continueWithTask(r4, r5)     // Catch:{ all -> 0x003a }
            java.util.Map r4 = r2.f57331b     // Catch:{ all -> 0x003a }
            r4.put(r0, r3)     // Catch:{ all -> 0x003a }
            monitor-exit(r2)
            return r3
        L_0x007c:
            monitor-exit(r2)     // Catch:{ all -> 0x003a }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.iid.s.a(java.lang.String, java.lang.String, com.google.firebase.iid.s$a):com.google.android.gms.tasks.Task");
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ Task b(Pair pair, Task task) {
        synchronized (this) {
            this.f57331b.remove(pair);
        }
        return task;
    }
}
