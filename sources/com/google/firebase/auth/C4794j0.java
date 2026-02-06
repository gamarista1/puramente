package com.google.firebase.auth;

import com.google.android.gms.common.internal.C4536s;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;

/* renamed from: com.google.firebase.auth.j0  reason: case insensitive filesystem */
final class C4794j0 implements Continuation {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ C4783e f57049a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ A f57050b;

    C4794j0(A a10, C4783e eVar) {
        this.f57049a = eVar;
        this.f57050b = a10;
    }

    public final /* synthetic */ Object then(Task task) {
        return FirebaseAuth.getInstance(this.f57050b.K0()).L(this.f57049a, (String) C4536s.l(((C) task.getResult()).f()));
    }
}
