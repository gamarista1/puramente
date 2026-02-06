package com.google.firebase.iid;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.util.Log;
import com.revenuecat.purchases.common.Constants;
import ub.C5230g;

public class n {

    /* renamed from: a  reason: collision with root package name */
    private final Context f57320a;

    /* renamed from: b  reason: collision with root package name */
    private String f57321b;

    /* renamed from: c  reason: collision with root package name */
    private String f57322c;

    /* renamed from: d  reason: collision with root package name */
    private int f57323d;

    /* renamed from: e  reason: collision with root package name */
    private int f57324e = 0;

    public n(Context context) {
        this.f57320a = context;
    }

    public static String c(C5230g gVar) {
        String f10 = gVar.r().f();
        if (f10 != null) {
            return f10;
        }
        String c10 = gVar.r().c();
        if (!c10.startsWith("1:")) {
            return c10;
        }
        String[] split = c10.split(Constants.SUBS_ID_BASE_PLAN_ID_SEPARATOR);
        if (split.length < 2) {
            return null;
        }
        String str = split[1];
        if (str.isEmpty()) {
            return null;
        }
        return str;
    }

    private PackageInfo f(String str) {
        try {
            return this.f57320a.getPackageManager().getPackageInfo(str, 0);
        } catch (PackageManager.NameNotFoundException e10) {
            String valueOf = String.valueOf(e10);
            StringBuilder sb2 = new StringBuilder(valueOf.length() + 23);
            sb2.append("Failed to find package ");
            sb2.append(valueOf);
            Log.w("FirebaseInstanceId", sb2.toString());
            return null;
        }
    }

    private synchronized void h() {
        PackageInfo f10 = f(this.f57320a.getPackageName());
        if (f10 != null) {
            this.f57321b = Integer.toString(f10.versionCode);
            this.f57322c = f10.versionName;
        }
    }

    public synchronized String a() {
        try {
            if (this.f57321b == null) {
                h();
            }
        } catch (Throwable th2) {
            while (true) {
                throw th2;
            }
        }
        return this.f57321b;
    }

    public synchronized String b() {
        try {
            if (this.f57322c == null) {
                h();
            }
        } catch (Throwable th2) {
            while (true) {
                throw th2;
            }
        }
        return this.f57322c;
    }

    public synchronized int d() {
        PackageInfo f10;
        try {
            if (this.f57323d == 0 && (f10 = f("com.google.android.gms")) != null) {
                this.f57323d = f10.versionCode;
            }
        } catch (Throwable th2) {
            while (true) {
                throw th2;
            }
        }
        return this.f57323d;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:40:0x007a, code lost:
        return r2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized int e() {
        /*
            r5 = this;
            monitor-enter(r5)
            int r0 = r5.f57324e     // Catch:{ all -> 0x0022 }
            if (r0 == 0) goto L_0x0007
            monitor-exit(r5)
            return r0
        L_0x0007:
            android.content.Context r0 = r5.f57320a     // Catch:{ all -> 0x0022 }
            android.content.pm.PackageManager r0 = r0.getPackageManager()     // Catch:{ all -> 0x0022 }
            java.lang.String r1 = "com.google.android.c2dm.permission.SEND"
            java.lang.String r2 = "com.google.android.gms"
            int r1 = r0.checkPermission(r1, r2)     // Catch:{ all -> 0x0022 }
            r2 = -1
            r3 = 0
            if (r1 != r2) goto L_0x0024
            java.lang.String r0 = "FirebaseInstanceId"
            java.lang.String r1 = "Google Play services missing or without correct permission."
            android.util.Log.e(r0, r1)     // Catch:{ all -> 0x0022 }
            monitor-exit(r5)
            return r3
        L_0x0022:
            r0 = move-exception
            goto L_0x007b
        L_0x0024:
            boolean r1 = Ea.n.h()     // Catch:{ all -> 0x0022 }
            r2 = 1
            if (r1 != 0) goto L_0x0048
            android.content.Intent r1 = new android.content.Intent     // Catch:{ all -> 0x0022 }
            java.lang.String r4 = "com.google.android.c2dm.intent.REGISTER"
            r1.<init>(r4)     // Catch:{ all -> 0x0022 }
            java.lang.String r4 = "com.google.android.gms"
            r1.setPackage(r4)     // Catch:{ all -> 0x0022 }
            java.util.List r1 = r0.queryIntentServices(r1, r3)     // Catch:{ all -> 0x0022 }
            if (r1 == 0) goto L_0x0048
            int r1 = r1.size()     // Catch:{ all -> 0x0022 }
            if (r1 > 0) goto L_0x0044
            goto L_0x0048
        L_0x0044:
            r5.f57324e = r2     // Catch:{ all -> 0x0022 }
            monitor-exit(r5)
            return r2
        L_0x0048:
            android.content.Intent r1 = new android.content.Intent     // Catch:{ all -> 0x0022 }
            java.lang.String r4 = "com.google.iid.TOKEN_REQUEST"
            r1.<init>(r4)     // Catch:{ all -> 0x0022 }
            java.lang.String r4 = "com.google.android.gms"
            r1.setPackage(r4)     // Catch:{ all -> 0x0022 }
            java.util.List r0 = r0.queryBroadcastReceivers(r1, r3)     // Catch:{ all -> 0x0022 }
            r1 = 2
            if (r0 == 0) goto L_0x0066
            int r0 = r0.size()     // Catch:{ all -> 0x0022 }
            if (r0 > 0) goto L_0x0062
            goto L_0x0066
        L_0x0062:
            r5.f57324e = r1     // Catch:{ all -> 0x0022 }
            monitor-exit(r5)
            return r1
        L_0x0066:
            java.lang.String r0 = "FirebaseInstanceId"
            java.lang.String r3 = "Failed to resolve IID implementation package, falling back"
            android.util.Log.w(r0, r3)     // Catch:{ all -> 0x0022 }
            boolean r0 = Ea.n.h()     // Catch:{ all -> 0x0022 }
            if (r0 == 0) goto L_0x0077
            r5.f57324e = r1     // Catch:{ all -> 0x0022 }
            r2 = r1
            goto L_0x0079
        L_0x0077:
            r5.f57324e = r2     // Catch:{ all -> 0x0022 }
        L_0x0079:
            monitor-exit(r5)
            return r2
        L_0x007b:
            monitor-exit(r5)     // Catch:{ all -> 0x0022 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.iid.n.e():int");
    }

    public boolean g() {
        if (e() != 0) {
            return true;
        }
        return false;
    }
}
