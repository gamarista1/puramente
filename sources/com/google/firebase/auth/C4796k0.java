package com.google.firebase.auth;

import com.google.android.gms.common.internal.C4536s;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;

/* renamed from: com.google.firebase.auth.k0  reason: case insensitive filesystem */
final class C4796k0 implements Continuation {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ A f57051a;

    C4796k0(A a10) {
        this.f57051a = a10;
    }

    public final /* synthetic */ Object then(Task task) {
        return FirebaseAuth.getInstance(this.f57051a.K0()).L((C4783e) null, (String) C4536s.l(((C) task.getResult()).f()));
    }
}
