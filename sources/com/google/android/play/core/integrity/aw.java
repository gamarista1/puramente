package com.google.android.play.core.integrity;

import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.play.integrity.internal.C4742e;
import com.google.android.play.integrity.internal.D;

abstract class aw extends D {

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ ax f56501f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    aw(ax axVar, TaskCompletionSource taskCompletionSource) {
        super(taskCompletionSource);
        this.f56501f = axVar;
    }

    public final void a(Exception exc) {
        if (!(exc instanceof C4742e)) {
            super.a(exc);
        } else if (ax.g(this.f56501f)) {
            super.a(new StandardIntegrityException(-2, exc));
        } else {
            super.a(new StandardIntegrityException(-9, exc));
        }
    }
}
