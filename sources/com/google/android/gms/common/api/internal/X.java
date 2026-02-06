package com.google.android.gms.common.api.internal;

import android.app.Activity;
import android.app.PendingIntent;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.a;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.b;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.concurrent.CancellationException;

public final class X extends t0 {

    /* renamed from: e  reason: collision with root package name */
    private TaskCompletionSource f53988e = new TaskCompletionSource();

    private X(C4498j jVar) {
        super(jVar, a.o());
        this.mLifecycleFragment.a("GmsAvailabilityHelper", this);
    }

    public static X i(Activity activity) {
        C4498j fragment = LifecycleCallback.getFragment(activity);
        X x10 = (X) fragment.d("GmsAvailabilityHelper", X.class);
        if (x10 == null) {
            return new X(fragment);
        }
        if (x10.f53988e.getTask().isComplete()) {
            x10.f53988e = new TaskCompletionSource();
        }
        return x10;
    }

    /* access modifiers changed from: protected */
    public final void b(ConnectionResult connectionResult, int i10) {
        String p02 = connectionResult.p0();
        if (p02 == null) {
            p02 = "Error connecting to Google Play services";
        }
        this.f53988e.setException(new b(new Status(connectionResult, p02, connectionResult.o0())));
    }

    /* access modifiers changed from: protected */
    public final void c() {
        Activity p10 = this.mLifecycleFragment.p();
        if (p10 == null) {
            this.f53988e.trySetException(new b(new Status(8)));
            return;
        }
        int g10 = this.f54074d.g(p10);
        if (g10 == 0) {
            this.f53988e.trySetResult(null);
        } else if (!this.f53988e.getTask().isComplete()) {
            h(new ConnectionResult(g10, (PendingIntent) null), 0);
        }
    }

    public final Task j() {
        return this.f53988e.getTask();
    }

    public final void onDestroy() {
        super.onDestroy();
        this.f53988e.trySetException(new CancellationException("Host activity was destroyed before Google Play services could be made available."));
    }
}
