package com.google.android.gms.common.api.internal;

import android.os.Handler;
import java.util.concurrent.Executor;

public final /* synthetic */ class F implements Executor {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Handler f53953a;

    public /* synthetic */ F(Handler handler) {
        this.f53953a = handler;
    }

    public final void execute(Runnable runnable) {
        this.f53953a.post(runnable);
    }
}
