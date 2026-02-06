package com.google.firebase.messaging;

import Da.C4250b;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.util.Log;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

class r0 implements ServiceConnection {

    /* renamed from: a  reason: collision with root package name */
    private final Context f57588a;

    /* renamed from: b  reason: collision with root package name */
    private final Intent f57589b;

    /* renamed from: c  reason: collision with root package name */
    private final ScheduledExecutorService f57590c;

    /* renamed from: d  reason: collision with root package name */
    private final Queue f57591d;

    /* renamed from: e  reason: collision with root package name */
    private o0 f57592e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f57593f;

    static class a {

        /* renamed from: a  reason: collision with root package name */
        final Intent f57594a;

        /* renamed from: b  reason: collision with root package name */
        private final TaskCompletionSource f57595b = new TaskCompletionSource();

        a(Intent intent) {
            this.f57594a = intent;
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void f() {
            Log.w("FirebaseMessaging", "Service took too long to process intent: " + this.f57594a.getAction() + " finishing.");
            d();
        }

        /* access modifiers changed from: package-private */
        public void c(ScheduledExecutorService scheduledExecutorService) {
            e().addOnCompleteListener((Executor) scheduledExecutorService, new q0(scheduledExecutorService.schedule(new p0(this), 20, TimeUnit.SECONDS)));
        }

        /* access modifiers changed from: package-private */
        public void d() {
            this.f57595b.trySetResult(null);
        }

        /* access modifiers changed from: package-private */
        public Task e() {
            return this.f57595b.getTask();
        }
    }

    r0(Context context, String str) {
        this(context, str, a());
    }

    private static ScheduledThreadPoolExecutor a() {
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1);
        scheduledThreadPoolExecutor.setKeepAliveTime(40, TimeUnit.SECONDS);
        scheduledThreadPoolExecutor.allowCoreThreadTimeOut(true);
        return scheduledThreadPoolExecutor;
    }

    private void b() {
        while (!this.f57591d.isEmpty()) {
            ((a) this.f57591d.poll()).d();
        }
    }

    private synchronized void c() {
        try {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "flush queue called");
            }
            while (!this.f57591d.isEmpty()) {
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                    Log.d("FirebaseMessaging", "found intent to be delivered");
                }
                o0 o0Var = this.f57592e;
                if (o0Var == null || !o0Var.isBinderAlive()) {
                    e();
                    return;
                }
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                    Log.d("FirebaseMessaging", "binder is alive, sending the intent.");
                }
                this.f57592e.c((a) this.f57591d.poll());
            }
        } finally {
            while (true) {
            }
        }
    }

    private void e() {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("binder is dead. start connection? ");
            sb2.append(!this.f57593f);
            Log.d("FirebaseMessaging", sb2.toString());
        }
        if (!this.f57593f) {
            this.f57593f = true;
            try {
                if (!C4250b.b().a(this.f57588a, this.f57589b, this, 65)) {
                    Log.e("FirebaseMessaging", "binding to the service failed");
                    this.f57593f = false;
                    b();
                }
            } catch (SecurityException e10) {
                Log.e("FirebaseMessaging", "Exception while binding the service", e10);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public synchronized Task d(Intent intent) {
        a aVar;
        try {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "new intent queued in the bind-strategy delivery");
            }
            aVar = new a(intent);
            aVar.c(this.f57590c);
            this.f57591d.add(aVar);
            c();
        } catch (Throwable th2) {
            while (true) {
                throw th2;
            }
        }
        return aVar.e();
    }

    public synchronized void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        try {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "onServiceConnected: " + componentName);
            }
            this.f57593f = false;
            if (!(iBinder instanceof o0)) {
                Log.e("FirebaseMessaging", "Invalid service connection: " + iBinder);
                b();
                return;
            }
            this.f57592e = (o0) iBinder;
            c();
        } catch (Throwable th2) {
            while (true) {
                throw th2;
            }
        }
    }

    public void onServiceDisconnected(ComponentName componentName) {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "onServiceDisconnected: " + componentName);
        }
        c();
    }

    r0(Context context, String str, ScheduledExecutorService scheduledExecutorService) {
        this.f57591d = new ArrayDeque();
        this.f57593f = false;
        Context applicationContext = context.getApplicationContext();
        this.f57588a = applicationContext;
        this.f57589b = new Intent(str).setPackage(applicationContext.getPackageName());
        this.f57590c = scheduledExecutorService;
    }
}
