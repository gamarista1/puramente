package com.google.android.play.core.integrity;

import android.app.PendingIntent;
import android.os.Build;
import android.os.Bundle;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.play.integrity.internal.C;
import io.branch.rnbranch.RNBranchModule;

final class au extends at {

    /* renamed from: c  reason: collision with root package name */
    private final C f56499c = new C("OnRequestIntegrityTokenCallback");

    au(ax axVar, TaskCompletionSource taskCompletionSource) {
        super(axVar, taskCompletionSource);
    }

    public final void c(Bundle bundle) {
        PendingIntent pendingIntent;
        super.c(bundle);
        this.f56499c.c("onRequestExpressIntegrityToken", new Object[0]);
        int i10 = bundle.getInt(RNBranchModule.NATIVE_INIT_SESSION_FINISHED_EVENT_ERROR);
        if (i10 != 0) {
            this.f56497a.trySetException(new StandardIntegrityException(i10, (Throwable) null));
            return;
        }
        if (Build.VERSION.SDK_INT >= 33) {
            pendingIntent = (PendingIntent) bundle.getParcelable("dialog.intent", PendingIntent.class);
        } else {
            pendingIntent = (PendingIntent) bundle.getParcelable("dialog.intent");
        }
        TaskCompletionSource taskCompletionSource = this.f56497a;
        b bVar = new b();
        bVar.c(bundle.getString("token"));
        bVar.b(this.f56499c);
        bVar.a(pendingIntent);
        taskCompletionSource.trySetResult(bVar.d());
    }
}
