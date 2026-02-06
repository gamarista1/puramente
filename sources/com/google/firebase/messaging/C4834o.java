package com.google.firebase.messaging;

import Fa.C4287b;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import qc.b;
import qc.c;

/* renamed from: com.google.firebase.messaging.o  reason: case insensitive filesystem */
abstract class C4834o {
    private static Executor a(String str) {
        return new ThreadPoolExecutor(0, 1, 30, TimeUnit.SECONDS, new LinkedBlockingQueue(), new C4287b(str));
    }

    static Executor b() {
        return a("Firebase-Messaging-File-Io");
    }

    static ScheduledExecutorService c() {
        return new ScheduledThreadPoolExecutor(1, new C4287b("Firebase-Messaging-Init"));
    }

    static ExecutorService d() {
        return b.a().a(new C4287b("Firebase-Messaging-Intent-Handle"), c.HIGH_SPEED);
    }

    static ExecutorService e() {
        return Executors.newSingleThreadExecutor(new C4287b("Firebase-Messaging-Network-Io"));
    }

    static ExecutorService f() {
        return Executors.newSingleThreadExecutor(new C4287b("Firebase-Messaging-Task"));
    }

    static ScheduledExecutorService g() {
        return new ScheduledThreadPoolExecutor(1, new C4287b("Firebase-Messaging-Topics-Io"));
    }
}
