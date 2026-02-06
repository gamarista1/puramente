package com.bugsnag.android;

import android.util.Log;

public final class N implements S0 {

    /* renamed from: a  reason: collision with root package name */
    public static final N f38552a = new N();

    private N() {
    }

    public void a(String str, Throwable th2) {
        Log.d("Bugsnag", str, th2);
    }

    public void b(String str, Throwable th2) {
        Log.w("Bugsnag", str, th2);
    }

    public void c(String str, Throwable th2) {
        Log.e("Bugsnag", str, th2);
    }

    public void d(String str) {
        Log.i("Bugsnag", str);
    }

    public void e(String str) {
        Log.w("Bugsnag", str);
    }

    public void f(String str) {
        Log.e("Bugsnag", str);
    }

    public void g(String str) {
        Log.d("Bugsnag", str);
    }
}
