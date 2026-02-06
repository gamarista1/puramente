package com.google.android.play.core.integrity;

import android.os.Bundle;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.play.integrity.internal.C;
import io.branch.rnbranch.RNBranchModule;

final class av extends at {

    /* renamed from: c  reason: collision with root package name */
    private final C f56500c = new C("OnWarmUpIntegrityTokenCallback");

    av(ax axVar, TaskCompletionSource taskCompletionSource) {
        super(axVar, taskCompletionSource);
    }

    public final void e(Bundle bundle) {
        super.e(bundle);
        this.f56500c.c("onWarmUpExpressIntegrityToken", new Object[0]);
        int i10 = bundle.getInt(RNBranchModule.NATIVE_INIT_SESSION_FINISHED_EVENT_ERROR);
        if (i10 != 0) {
            this.f56497a.trySetException(new StandardIntegrityException(i10, (Throwable) null));
        } else {
            this.f56497a.trySetResult(Long.valueOf(bundle.getLong("warm.up.sid")));
        }
    }
}
