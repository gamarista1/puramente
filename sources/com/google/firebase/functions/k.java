package com.google.firebase.functions;

import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import java.net.URL;

public final /* synthetic */ class k implements Continuation {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ n f57210a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ URL f57211b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Object f57212c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ v f57213d;

    public /* synthetic */ k(n nVar, URL url, Object obj, v vVar) {
        this.f57210a = nVar;
        this.f57211b = url;
        this.f57212c = obj;
        this.f57213d = vVar;
    }

    public final Object then(Task task) {
        return this.f57210a.r(this.f57211b, this.f57212c, this.f57213d, task);
    }
}
