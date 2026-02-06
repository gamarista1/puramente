package com.google.firebase.messaging;

import Ea.n;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.util.Log;
import com.revenuecat.purchases.common.Constants;
import java.util.List;
import ub.C5230g;

class M {

    /* renamed from: a  reason: collision with root package name */
    private final Context f57427a;

    /* renamed from: b  reason: collision with root package name */
    private String f57428b;

    /* renamed from: c  reason: collision with root package name */
    private String f57429c;

    /* renamed from: d  reason: collision with root package name */
    private int f57430d;

    /* renamed from: e  reason: collision with root package name */
    private int f57431e = 0;

    M(Context context) {
        this.f57427a = context;
    }

    static String c(C5230g gVar) {
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
            return this.f57427a.getPackageManager().getPackageInfo(str, 0);
        } catch (PackageManager.NameNotFoundException e10) {
            Log.w("FirebaseMessaging", "Failed to find package " + e10);
            return null;
        }
    }

    private synchronized void h() {
        PackageInfo f10 = f(this.f57427a.getPackageName());
        if (f10 != null) {
            this.f57428b = Integer.toString(f10.versionCode);
            this.f57429c = f10.versionName;
        }
    }

    /* access modifiers changed from: package-private */
    public synchronized String a() {
        try {
            if (this.f57428b == null) {
                h();
            }
        } catch (Throwable th2) {
            while (true) {
                throw th2;
            }
        }
        return this.f57428b;
    }

    /* access modifiers changed from: package-private */
    public synchronized String b() {
        try {
            if (this.f57429c == null) {
                h();
            }
        } catch (Throwable th2) {
            while (true) {
                throw th2;
            }
        }
        return this.f57429c;
    }

    /* access modifiers changed from: package-private */
    public synchronized int d() {
        PackageInfo f10;
        try {
            if (this.f57430d == 0 && (f10 = f("com.google.android.gms")) != null) {
                this.f57430d = f10.versionCode;
            }
        } catch (Throwable th2) {
            while (true) {
                throw th2;
            }
        }
        return this.f57430d;
    }

    /* access modifiers changed from: package-private */
    public synchronized int e() {
        int i10 = this.f57431e;
        if (i10 != 0) {
            return i10;
        }
        PackageManager packageManager = this.f57427a.getPackageManager();
        if (packageManager.checkPermission("com.google.android.c2dm.permission.SEND", "com.google.android.gms") == -1) {
            Log.e("FirebaseMessaging", "Google Play services missing or without correct permission.");
            return 0;
        }
        if (!n.h()) {
            Intent intent = new Intent("com.google.android.c2dm.intent.REGISTER");
            intent.setPackage("com.google.android.gms");
            List<ResolveInfo> queryIntentServices = packageManager.queryIntentServices(intent, 0);
            if (queryIntentServices != null && queryIntentServices.size() > 0) {
                this.f57431e = 1;
                return 1;
            }
        }
        Intent intent2 = new Intent("com.google.iid.TOKEN_REQUEST");
        intent2.setPackage("com.google.android.gms");
        List<ResolveInfo> queryBroadcastReceivers = packageManager.queryBroadcastReceivers(intent2, 0);
        if (queryBroadcastReceivers == null || queryBroadcastReceivers.size() <= 0) {
            Log.w("FirebaseMessaging", "Failed to resolve IID implementation package, falling back");
            if (n.h()) {
                this.f57431e = 2;
            } else {
                this.f57431e = 1;
            }
            return this.f57431e;
        }
        this.f57431e = 2;
        return 2;
    }

    /* access modifiers changed from: package-private */
    public boolean g() {
        if (e() != 0) {
            return true;
        }
        return false;
    }
}
