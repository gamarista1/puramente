package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.internal.C4510w;
import com.google.android.gms.tasks.TaskCompletionSource;
import ya.C5286c;

final class g0 extends C4510w {

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ C4510w.a f54041d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    g0(C4510w.a aVar, C5286c[] cVarArr, boolean z10, int i10) {
        super(cVarArr, z10, i10);
        this.f54041d = aVar;
    }

    /* access modifiers changed from: protected */
    public final void b(a.b bVar, TaskCompletionSource taskCompletionSource) {
        this.f54041d.f54078a.accept(bVar, taskCompletionSource);
    }
}
