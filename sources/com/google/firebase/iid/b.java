package com.google.firebase.iid;

import Fa.C4287b;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

abstract class b {

    /* renamed from: a  reason: collision with root package name */
    private static final Executor f57293a = a.f57292a;

    static Executor a() {
        return f57293a;
    }

    static ExecutorService b() {
        return new ThreadPoolExecutor(0, 1, 30, TimeUnit.SECONDS, new LinkedBlockingQueue(), new C4287b("firebase-iid-executor"));
    }
}
