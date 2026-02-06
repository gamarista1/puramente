package com.oblador.storereview;

import android.app.Activity;
import android.util.Log;
import com.facebook.react.bridge.ReactApplicationContext;
import com.google.android.gms.tasks.Task;
import kb.C5062b;
import kb.c;
import kb.d;

public abstract class b {
    /* access modifiers changed from: private */
    public static /* synthetic */ void b(ReactApplicationContext reactApplicationContext, c cVar, Task task) {
        if (task.isSuccessful()) {
            C5062b bVar = (C5062b) task.getResult();
            Activity currentActivity = reactApplicationContext.getCurrentActivity();
            if (currentActivity != null) {
                cVar.b(currentActivity, bVar);
            } else {
                Log.w(NativeRNStoreReviewSpec.NAME, "Current activity is null. Unable to launch review flow.");
            }
        } else {
            Log.w(NativeRNStoreReviewSpec.NAME, "Requesting review failed", task.getException());
        }
    }

    public static void c(ReactApplicationContext reactApplicationContext) {
        c a10 = d.a(reactApplicationContext);
        a10.a().addOnCompleteListener(new a(reactApplicationContext, a10));
    }
}
