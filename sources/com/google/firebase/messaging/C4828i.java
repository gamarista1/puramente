package com.google.firebase.messaging;

import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import android.util.Log;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.messaging.o0;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import r3.m;

/* renamed from: com.google.firebase.messaging.i  reason: case insensitive filesystem */
public abstract class C4828i extends Service {
    static final long MESSAGE_TIMEOUT_S = 20;
    private static final String TAG = "EnhancedIntentService";
    private Binder binder;
    final ExecutorService executor = C4834o.d();
    private int lastStartId;
    private final Object lock = new Object();
    private int runningTasks = 0;

    /* renamed from: com.google.firebase.messaging.i$a */
    class a implements o0.a {
        a() {
        }

        public Task a(Intent intent) {
            return C4828i.this.f(intent);
        }
    }

    private void c(Intent intent) {
        if (intent != null) {
            m0.c(intent);
        }
        synchronized (this.lock) {
            try {
                int i10 = this.runningTasks - 1;
                this.runningTasks = i10;
                if (i10 == 0) {
                    stopSelfResultHook(this.lastStartId);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void d(Intent intent, Task task) {
        c(intent);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void e(Intent intent, TaskCompletionSource taskCompletionSource) {
        try {
            handleIntent(intent);
        } finally {
            taskCompletionSource.setResult(null);
        }
    }

    /* access modifiers changed from: private */
    public Task f(Intent intent) {
        if (handleIntentOnMainThread(intent)) {
            return Tasks.forResult(null);
        }
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.executor.execute(new C4827h(this, intent, taskCompletionSource));
        return taskCompletionSource.getTask();
    }

    /* access modifiers changed from: protected */
    public abstract Intent getStartCommandIntent(Intent intent);

    public abstract void handleIntent(Intent intent);

    public boolean handleIntentOnMainThread(Intent intent) {
        return false;
    }

    public final synchronized IBinder onBind(Intent intent) {
        try {
            if (Log.isLoggable(TAG, 3)) {
                Log.d(TAG, "Service received bind request");
            }
            if (this.binder == null) {
                this.binder = new o0(new a());
            }
        } catch (Throwable th2) {
            while (true) {
                throw th2;
            }
        }
        return this.binder;
    }

    public void onDestroy() {
        this.executor.shutdown();
        super.onDestroy();
    }

    public final int onStartCommand(Intent intent, int i10, int i11) {
        synchronized (this.lock) {
            this.lastStartId = i11;
            this.runningTasks++;
        }
        Intent startCommandIntent = getStartCommandIntent(intent);
        if (startCommandIntent == null) {
            c(intent);
            return 2;
        }
        Task f10 = f(startCommandIntent);
        if (f10.isComplete()) {
            c(intent);
            return 2;
        }
        f10.addOnCompleteListener((Executor) new m(), new C4826g(this, intent));
        return 3;
    }

    /* access modifiers changed from: package-private */
    public boolean stopSelfResultHook(int i10) {
        return stopSelfResult(i10);
    }
}
