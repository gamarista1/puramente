package com.google.firebase.storage;

import Kc.c;
import Lc.d;
import android.util.Log;
import com.google.android.gms.common.internal.C4536s;
import com.google.android.gms.tasks.TaskCompletionSource;
import org.json.JSONException;

/* renamed from: com.google.firebase.storage.j  reason: case insensitive filesystem */
class C4854j implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final o f58082a;

    /* renamed from: b  reason: collision with root package name */
    private final TaskCompletionSource f58083b;

    /* renamed from: c  reason: collision with root package name */
    private final c f58084c;

    /* renamed from: d  reason: collision with root package name */
    private final String f58085d;

    /* renamed from: e  reason: collision with root package name */
    private final Integer f58086e;

    C4854j(o oVar, Integer num, String str, TaskCompletionSource taskCompletionSource) {
        C4536s.l(oVar);
        C4536s.l(taskCompletionSource);
        this.f58082a = oVar;
        this.f58086e = num;
        this.f58085d = str;
        this.f58083b = taskCompletionSource;
        C4849e t10 = oVar.t();
        this.f58084c = new c(t10.a().m(), t10.c(), t10.b(), t10.k());
    }

    public void run() {
        C4853i iVar;
        d dVar = new d(this.f58082a.u(), this.f58082a.f(), this.f58086e, this.f58085d);
        this.f58084c.d(dVar);
        if (dVar.v()) {
            try {
                iVar = C4853i.a(this.f58082a.t(), dVar.n());
            } catch (JSONException e10) {
                Log.e("ListTask", "Unable to parse response body. " + dVar.m(), e10);
                this.f58083b.setException(m.d(e10));
                return;
            }
        } else {
            iVar = null;
        }
        TaskCompletionSource taskCompletionSource = this.f58083b;
        if (taskCompletionSource != null) {
            dVar.a(taskCompletionSource, iVar);
        }
    }
}
