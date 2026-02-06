package com.google.android.play.core.integrity;

import android.content.Context;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.play.integrity.internal.C4745h;
import com.google.android.play.integrity.internal.D;

final class aq extends D {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Context f56487a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ ax f56488b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    aq(ax axVar, TaskCompletionSource taskCompletionSource, Context context) {
        super(taskCompletionSource);
        this.f56488b = axVar;
        this.f56487a = context;
    }

    /* access modifiers changed from: protected */
    public final void b() {
        this.f56488b.f56505d.trySetResult(Boolean.valueOf(C4745h.a(this.f56487a)));
    }
}
