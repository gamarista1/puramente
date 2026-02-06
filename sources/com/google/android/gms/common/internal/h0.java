package com.google.android.gms.common.internal;

import Ga.C4293e;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;

public abstract class h0 {

    /* renamed from: a  reason: collision with root package name */
    private static final Object f54186a = new Object();

    /* renamed from: b  reason: collision with root package name */
    private static boolean f54187b;

    /* renamed from: c  reason: collision with root package name */
    private static String f54188c;

    /* renamed from: d  reason: collision with root package name */
    private static int f54189d;

    public static int a(Context context) {
        b(context);
        return f54189d;
    }

    private static void b(Context context) {
        synchronized (f54186a) {
            try {
                if (!f54187b) {
                    f54187b = true;
                    Bundle bundle = C4293e.a(context).c(context.getPackageName(), 128).metaData;
                    if (bundle != null) {
                        f54188c = bundle.getString("com.google.app.id");
                        f54189d = bundle.getInt("com.google.android.gms.version");
                    }
                }
            } catch (PackageManager.NameNotFoundException e10) {
                Log.wtf("MetadataValueReader", "This should never happen.", e10);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
