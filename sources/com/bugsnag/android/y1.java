package com.bugsnag.android;

import java.io.File;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public final class y1 {

    /* renamed from: a  reason: collision with root package name */
    private final File f38992a;

    /* renamed from: b  reason: collision with root package name */
    private final ReentrantReadWriteLock f38993b = new ReentrantReadWriteLock();

    public y1(File file) {
        this.f38992a = file;
    }

    public final File a() {
        return this.f38992a;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0037, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:?, code lost:
        wf.C6763c.a(r2, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x003b, code lost:
        throw r1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.bugsnag.android.K0.a b(yf.C6798l r5) {
        /*
            r4 = this;
            java.util.concurrent.locks.ReentrantReadWriteLock r0 = r4.f38993b
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r0 = r0.readLock()
            r0.lock()
            java.io.File r1 = r4.a()     // Catch:{ all -> 0x0033 }
            java.nio.charset.Charset r2 = Sg.C5541d.f65029b     // Catch:{ all -> 0x0033 }
            java.io.FileInputStream r3 = new java.io.FileInputStream     // Catch:{ all -> 0x0033 }
            r3.<init>(r1)     // Catch:{ all -> 0x0033 }
            java.io.InputStreamReader r1 = new java.io.InputStreamReader     // Catch:{ all -> 0x0033 }
            r1.<init>(r3, r2)     // Catch:{ all -> 0x0033 }
            java.io.BufferedReader r2 = new java.io.BufferedReader     // Catch:{ all -> 0x0033 }
            r3 = 8192(0x2000, float:1.14794E-41)
            r2.<init>(r1, r3)     // Catch:{ all -> 0x0033 }
            android.util.JsonReader r1 = new android.util.JsonReader     // Catch:{ all -> 0x0035 }
            r1.<init>(r2)     // Catch:{ all -> 0x0035 }
            java.lang.Object r5 = r5.invoke(r1)     // Catch:{ all -> 0x0035 }
            com.bugsnag.android.K0$a r5 = (com.bugsnag.android.K0.a) r5     // Catch:{ all -> 0x0035 }
            r1 = 0
            wf.C6763c.a(r2, r1)     // Catch:{ all -> 0x0033 }
            r0.unlock()
            return r5
        L_0x0033:
            r5 = move-exception
            goto L_0x003c
        L_0x0035:
            r5 = move-exception
            throw r5     // Catch:{ all -> 0x0037 }
        L_0x0037:
            r1 = move-exception
            wf.C6763c.a(r2, r5)     // Catch:{ all -> 0x0033 }
            throw r1     // Catch:{ all -> 0x0033 }
        L_0x003c:
            r0.unlock()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bugsnag.android.y1.b(yf.l):com.bugsnag.android.K0$a");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0034, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:?, code lost:
        wf.C6763c.a(r2, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0038, code lost:
        throw r1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void c(com.bugsnag.android.K0.a r5) {
        /*
            r4 = this;
            java.util.concurrent.locks.ReentrantReadWriteLock r0 = r4.f38993b
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r0 = r0.writeLock()
            r0.lock()
            java.io.File r1 = r4.a()     // Catch:{ all -> 0x0030 }
            java.nio.charset.Charset r2 = Sg.C5541d.f65029b     // Catch:{ all -> 0x0030 }
            java.io.FileOutputStream r3 = new java.io.FileOutputStream     // Catch:{ all -> 0x0030 }
            r3.<init>(r1)     // Catch:{ all -> 0x0030 }
            java.io.OutputStreamWriter r1 = new java.io.OutputStreamWriter     // Catch:{ all -> 0x0030 }
            r1.<init>(r3, r2)     // Catch:{ all -> 0x0030 }
            java.io.BufferedWriter r2 = new java.io.BufferedWriter     // Catch:{ all -> 0x0030 }
            r3 = 8192(0x2000, float:1.14794E-41)
            r2.<init>(r1, r3)     // Catch:{ all -> 0x0030 }
            com.bugsnag.android.K0 r1 = new com.bugsnag.android.K0     // Catch:{ all -> 0x0032 }
            r1.<init>(r2)     // Catch:{ all -> 0x0032 }
            r5.toStream(r1)     // Catch:{ all -> 0x0032 }
            r5 = 0
            wf.C6763c.a(r2, r5)     // Catch:{ all -> 0x0030 }
            r0.unlock()
            return
        L_0x0030:
            r5 = move-exception
            goto L_0x0039
        L_0x0032:
            r5 = move-exception
            throw r5     // Catch:{ all -> 0x0034 }
        L_0x0034:
            r1 = move-exception
            wf.C6763c.a(r2, r5)     // Catch:{ all -> 0x0030 }
            throw r1     // Catch:{ all -> 0x0030 }
        L_0x0039:
            r0.unlock()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bugsnag.android.y1.c(com.bugsnag.android.K0$a):void");
    }
}
