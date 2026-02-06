package com.google.firebase.messaging;

import android.content.Intent;
import android.os.Binder;
import android.os.Process;
import android.util.Log;
import com.google.android.gms.tasks.Task;
import com.google.firebase.messaging.r0;
import java.util.concurrent.Executor;
import r3.m;

class o0 extends Binder {

    /* renamed from: a  reason: collision with root package name */
    private final a f57581a;

    interface a {
        Task a(Intent intent);
    }

    o0(a aVar) {
        this.f57581a = aVar;
    }

    /* access modifiers changed from: package-private */
    public void c(r0.a aVar) {
        if (Binder.getCallingUid() == Process.myUid()) {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "service received new intent via bind strategy");
            }
            this.f57581a.a(aVar.f57594a).addOnCompleteListener((Executor) new m(), new n0(aVar));
            return;
        }
        throw new SecurityException("Binding only allowed within app");
    }
}
