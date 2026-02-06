package com.google.firebase.auth;

import com.google.android.gms.common.internal.C4536s;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;

/* renamed from: com.google.firebase.auth.l0  reason: case insensitive filesystem */
final class C4798l0 implements Continuation {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ String f57053a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ C4783e f57054b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ A f57055c;

    C4798l0(A a10, String str, C4783e eVar) {
        this.f57053a = str;
        this.f57054b = eVar;
        this.f57055c = a10;
    }

    public final /* synthetic */ Object then(Task task) {
        return FirebaseAuth.getInstance(this.f57055c.K0()).W((String) C4536s.l(((C) task.getResult()).f()), this.f57053a, this.f57054b);
    }
}
