package com.google.firebase.storage;

import Fb.j;
import java.util.concurrent.Executor;

public class F {

    /* renamed from: a  reason: collision with root package name */
    public static F f57992a = new F();

    /* renamed from: b  reason: collision with root package name */
    private static Executor f57993b;

    /* renamed from: c  reason: collision with root package name */
    private static Executor f57994c;

    /* renamed from: d  reason: collision with root package name */
    private static Executor f57995d;

    /* renamed from: e  reason: collision with root package name */
    private static Executor f57996e;

    /* renamed from: f  reason: collision with root package name */
    private static Executor f57997f;

    public static F b() {
        return f57992a;
    }

    public static void d(Executor executor, Executor executor2) {
        f57993b = j.b(executor, 5);
        f57995d = j.b(executor, 3);
        f57994c = j.b(executor, 2);
        f57996e = j.c(executor);
        f57997f = executor2;
    }

    public Executor a() {
        return f57993b;
    }

    public Executor c() {
        return f57997f;
    }

    public void e(Runnable runnable) {
        f57996e.execute(runnable);
    }

    public void f(Runnable runnable) {
        f57993b.execute(runnable);
    }

    public void g(Runnable runnable) {
        f57995d.execute(runnable);
    }

    public void h(Runnable runnable) {
        f57994c.execute(runnable);
    }
}
