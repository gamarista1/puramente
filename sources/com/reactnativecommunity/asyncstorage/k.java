package com.reactnativecommunity.asyncstorage;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class k extends SQLiteOpenHelper {

    /* renamed from: d  reason: collision with root package name */
    private static k f59258d;

    /* renamed from: a  reason: collision with root package name */
    private Context f59259a;

    /* renamed from: b  reason: collision with root package name */
    private SQLiteDatabase f59260b;

    /* renamed from: c  reason: collision with root package name */
    private long f59261c = (j.f59257a.longValue() * 1048576);

    private k(Context context) {
        super(context, "RKStorage", (SQLiteDatabase.CursorFactory) null, 1);
        this.f59259a = context;
    }

    private synchronized boolean f() {
        b();
        return this.f59259a.deleteDatabase("RKStorage");
    }

    public static k q(Context context) {
        if (f59258d == null) {
            f59258d = new k(context.getApplicationContext());
        }
        return f59258d;
    }

    /* access modifiers changed from: package-private */
    public synchronized void a() {
        o().delete("catalystLocalStorage", (String) null, (String[]) null);
    }

    public synchronized void b() {
        SQLiteDatabase sQLiteDatabase = this.f59260b;
        if (sQLiteDatabase != null && sQLiteDatabase.isOpen()) {
            this.f59260b.close();
            this.f59260b = null;
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Can't wrap try/catch for region: R(9:15|16|18|19|20|21|22|35|23) */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0031, code lost:
        continue;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x002a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized boolean n() {
        /*
            r5 = this;
            monitor-enter(r5)
            android.database.sqlite.SQLiteDatabase r0 = r5.f59260b     // Catch:{ all -> 0x000e }
            r1 = 1
            if (r0 == 0) goto L_0x0010
            boolean r0 = r0.isOpen()     // Catch:{ all -> 0x000e }
            if (r0 == 0) goto L_0x0010
            monitor-exit(r5)
            return r1
        L_0x000e:
            r0 = move-exception
            goto L_0x0040
        L_0x0010:
            r0 = 0
            r2 = 0
        L_0x0012:
            r3 = 2
            if (r2 >= r3) goto L_0x0034
            if (r2 <= 0) goto L_0x001d
            r5.f()     // Catch:{ SQLiteException -> 0x001b }
            goto L_0x001d
        L_0x001b:
            r0 = move-exception
            goto L_0x0024
        L_0x001d:
            android.database.sqlite.SQLiteDatabase r3 = r5.getWritableDatabase()     // Catch:{ SQLiteException -> 0x001b }
            r5.f59260b = r3     // Catch:{ SQLiteException -> 0x001b }
            goto L_0x0034
        L_0x0024:
            r3 = 30
            java.lang.Thread.sleep(r3)     // Catch:{ InterruptedException -> 0x002a }
            goto L_0x0031
        L_0x002a:
            java.lang.Thread r3 = java.lang.Thread.currentThread()     // Catch:{ all -> 0x000e }
            r3.interrupt()     // Catch:{ all -> 0x000e }
        L_0x0031:
            int r2 = r2 + 1
            goto L_0x0012
        L_0x0034:
            android.database.sqlite.SQLiteDatabase r2 = r5.f59260b     // Catch:{ all -> 0x000e }
            if (r2 == 0) goto L_0x003f
            long r3 = r5.f59261c     // Catch:{ all -> 0x000e }
            r2.setMaximumSize(r3)     // Catch:{ all -> 0x000e }
            monitor-exit(r5)
            return r1
        L_0x003f:
            throw r0     // Catch:{ all -> 0x000e }
        L_0x0040:
            monitor-exit(r5)     // Catch:{ all -> 0x000e }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.reactnativecommunity.asyncstorage.k.n():boolean");
    }

    public synchronized SQLiteDatabase o() {
        n();
        return this.f59260b;
    }

    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("CREATE TABLE catalystLocalStorage (key TEXT PRIMARY KEY, value TEXT NOT NULL)");
    }

    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
        if (i10 != i11) {
            f();
            onCreate(sQLiteDatabase);
        }
    }
}
