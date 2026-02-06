package com.google.firebase.messaging;

import Ea.n;
import android.content.Context;
import android.content.SharedPreferences;
import java.util.concurrent.Executor;
import r3.m;

abstract class V {
    private static SharedPreferences b(Context context) {
        Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            context = applicationContext;
        }
        return context.getSharedPreferences("com.google.firebase.messaging", 0);
    }

    static boolean c(Context context) {
        return b(context).getBoolean("proxy_notification_initialized", false);
    }

    static boolean d(SharedPreferences sharedPreferences, boolean z10) {
        if (!sharedPreferences.contains("proxy_retention") || sharedPreferences.getBoolean("proxy_retention", false) != z10) {
            return false;
        }
        return true;
    }

    static void f(Context context, boolean z10) {
        SharedPreferences.Editor edit = b(context).edit();
        edit.putBoolean("proxy_notification_initialized", z10);
        edit.apply();
    }

    static void g(Context context, H h10, boolean z10) {
        if (n.j() && !d(b(context), z10)) {
            h10.l(z10).addOnSuccessListener((Executor) new m(), new U(context, z10));
        }
    }

    /* access modifiers changed from: package-private */
    public static void h(Context context, boolean z10) {
        SharedPreferences.Editor edit = b(context).edit();
        edit.putBoolean("proxy_retention", z10);
        edit.apply();
    }
}
