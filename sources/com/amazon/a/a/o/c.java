package com.amazon.a.a.o;

import android.util.Log;

public class c {

    /* renamed from: a  reason: collision with root package name */
    public static boolean f37534a = true;

    /* renamed from: b  reason: collision with root package name */
    public static boolean f37535b = true;

    /* renamed from: c  reason: collision with root package name */
    private static boolean f37536c = false;

    /* renamed from: d  reason: collision with root package name */
    private static final String f37537d = "Kiwi";

    /* renamed from: e  reason: collision with root package name */
    private String f37538e;

    public c(String str) {
        this.f37538e = str;
    }

    private String d(String str) {
        return this.f37538e + ": " + str;
    }

    public void a(String str) {
        if (f37534a) {
            Log.d(f37537d, d(str));
        }
    }

    public void b(String str) {
        if (f37535b) {
            Log.e(f37537d, d(str));
        }
    }

    public void c(String str) {
        if (f37536c) {
            Log.e(f37537d, "TEST-" + d(str));
        }
    }

    public void a(String str, Throwable th2) {
        if (f37534a) {
            Log.d(f37537d, d(str), th2);
        }
    }

    public void b(String str, Throwable th2) {
        if (f37535b) {
            Log.e(f37537d, d(str), th2);
        }
    }

    public static void a() {
        f37536c = true;
    }

    public static boolean b() {
        return f37536c;
    }
}
