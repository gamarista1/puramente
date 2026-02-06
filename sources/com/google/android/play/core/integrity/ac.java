package com.google.android.play.core.integrity;

import android.app.PendingIntent;
import android.os.Build;
import android.os.Bundle;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.play.integrity.internal.A;
import com.google.android.play.integrity.internal.C;
import io.branch.rnbranch.RNBranchModule;

final class ac extends A {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ ad f56467a;

    /* renamed from: b  reason: collision with root package name */
    private final C f56468b = new C("OnRequestIntegrityTokenCallback");

    /* renamed from: c  reason: collision with root package name */
    private final TaskCompletionSource f56469c;

    ac(ad adVar, TaskCompletionSource taskCompletionSource) {
        this.f56467a = adVar;
        this.f56469c = taskCompletionSource;
    }

    public final void b(Bundle bundle) {
        PendingIntent pendingIntent;
        this.f56467a.f56470a.v(this.f56469c);
        this.f56468b.c("onRequestIntegrityToken", new Object[0]);
        int i10 = bundle.getInt(RNBranchModule.NATIVE_INIT_SESSION_FINISHED_EVENT_ERROR);
        if (i10 != 0) {
            this.f56469c.trySetException(new IntegrityServiceException(i10, (Throwable) null));
            return;
        }
        String string = bundle.getString("token");
        if (string == null) {
            this.f56469c.trySetException(new IntegrityServiceException(-100, (Throwable) null));
            return;
        }
        if (Build.VERSION.SDK_INT >= 33) {
            pendingIntent = (PendingIntent) bundle.getParcelable("dialog.intent", PendingIntent.class);
        } else {
            pendingIntent = (PendingIntent) bundle.getParcelable("dialog.intent");
        }
        TaskCompletionSource taskCompletionSource = this.f56469c;
        C4737a aVar = new C4737a();
        aVar.c(string);
        aVar.b(this.f56468b);
        aVar.a(pendingIntent);
        taskCompletionSource.trySetResult(aVar.d());
    }
}
