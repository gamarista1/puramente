package com.google.firebase.messaging;

import Ea.n;
import android.content.Context;
import android.content.Intent;
import android.util.Base64;
import android.util.Log;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.util.concurrent.Executor;
import r3.m;

/* renamed from: com.google.firebase.messaging.n  reason: case insensitive filesystem */
public class C4833n {

    /* renamed from: c  reason: collision with root package name */
    private static final Object f57576c = new Object();

    /* renamed from: d  reason: collision with root package name */
    private static r0 f57577d;

    /* renamed from: a  reason: collision with root package name */
    private final Context f57578a;

    /* renamed from: b  reason: collision with root package name */
    private final Executor f57579b = new m();

    public C4833n(Context context) {
        this.f57578a = context;
    }

    private static Task e(Context context, Intent intent, boolean z10) {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Binding to service");
        }
        r0 f10 = f(context, "com.google.firebase.MESSAGING_EVENT");
        if (!z10) {
            return f10.d(intent).continueWith(new m(), new C4832m());
        }
        if (b0.b().e(context)) {
            m0.f(context, f10, intent);
        } else {
            f10.d(intent);
        }
        return Tasks.forResult(-1);
    }

    private static r0 f(Context context, String str) {
        r0 r0Var;
        synchronized (f57576c) {
            try {
                if (f57577d == null) {
                    f57577d = new r0(context, str);
                }
                r0Var = f57577d;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return r0Var;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ Integer g(Task task) {
        return -1;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ Task j(Context context, Intent intent, boolean z10, Task task) {
        if (!n.h() || ((Integer) task.getResult()).intValue() != 402) {
            return task;
        }
        return e(context, intent, z10).continueWith(new m(), new C4831l());
    }

    public Task k(Intent intent) {
        String stringExtra = intent.getStringExtra("gcm.rawData64");
        if (stringExtra != null) {
            intent.putExtra("rawData", Base64.decode(stringExtra, 0));
            intent.removeExtra("gcm.rawData64");
        }
        return l(this.f57578a, intent);
    }

    public Task l(Context context, Intent intent) {
        boolean z10;
        boolean z11 = false;
        if (!n.h() || context.getApplicationInfo().targetSdkVersion < 26) {
            z10 = false;
        } else {
            z10 = true;
        }
        if ((intent.getFlags() & 268435456) != 0) {
            z11 = true;
        }
        if (!z10 || z11) {
            return Tasks.call(this.f57579b, new C4829j(context, intent)).continueWithTask(this.f57579b, new C4830k(context, intent, z11));
        }
        return e(context, intent, z11);
    }
}
