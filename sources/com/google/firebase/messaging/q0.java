package com.google.firebase.messaging;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.ScheduledFuture;

public final /* synthetic */ class q0 implements OnCompleteListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ScheduledFuture f57586a;

    public /* synthetic */ q0(ScheduledFuture scheduledFuture) {
        this.f57586a = scheduledFuture;
    }

    public final void onComplete(Task task) {
        this.f57586a.cancel(false);
    }
}
