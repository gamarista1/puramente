package com.google.firebase.remoteconfig.internal;

import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;

public final /* synthetic */ class e implements SuccessContinuation {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ f f57825a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ boolean f57826b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ g f57827c;

    public /* synthetic */ e(f fVar, boolean z10, g gVar) {
        this.f57825a = fVar;
        this.f57826b = z10;
        this.f57827c = gVar;
    }

    public final Task then(Object obj) {
        return this.f57825a.j(this.f57826b, this.f57827c, (Void) obj);
    }
}
