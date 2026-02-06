package com.google.firebase.functions;

import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;

public final /* synthetic */ class m implements Continuation {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ n f57216a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ String f57217b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Object f57218c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ v f57219d;

    public /* synthetic */ m(n nVar, String str, Object obj, v vVar) {
        this.f57216a = nVar;
        this.f57217b = str;
        this.f57218c = obj;
        this.f57219d = vVar;
    }

    public final Object then(Task task) {
        return this.f57216a.p(this.f57217b, this.f57218c, this.f57219d, task);
    }
}
