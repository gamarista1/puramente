package com.google.firebase.storage;

import Kc.c;
import Lc.b;
import android.util.Log;
import com.google.android.gms.common.internal.C4536s;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.storage.n;
import org.json.JSONException;

/* renamed from: com.google.firebase.storage.h  reason: case insensitive filesystem */
class C4852h implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private o f58075a;

    /* renamed from: b  reason: collision with root package name */
    private TaskCompletionSource f58076b;

    /* renamed from: c  reason: collision with root package name */
    private n f58077c;

    /* renamed from: d  reason: collision with root package name */
    private c f58078d;

    C4852h(o oVar, TaskCompletionSource taskCompletionSource) {
        C4536s.l(oVar);
        C4536s.l(taskCompletionSource);
        this.f58075a = oVar;
        this.f58076b = taskCompletionSource;
        if (!oVar.s().o().equals(oVar.o())) {
            C4849e t10 = this.f58075a.t();
            this.f58078d = new c(t10.a().m(), t10.c(), t10.b(), t10.k());
            return;
        }
        throw new IllegalArgumentException("getMetadata() is not supported at the root of the bucket.");
    }

    public void run() {
        b bVar = new b(this.f58075a.u(), this.f58075a.f());
        this.f58078d.d(bVar);
        if (bVar.v()) {
            try {
                this.f58077c = new n.b(bVar.n(), this.f58075a).a();
            } catch (JSONException e10) {
                Log.e("GetMetadataTask", "Unable to parse resulting metadata. " + bVar.m(), e10);
                this.f58076b.setException(m.d(e10));
                return;
            }
        }
        TaskCompletionSource taskCompletionSource = this.f58076b;
        if (taskCompletionSource != null) {
            bVar.a(taskCompletionSource, this.f58077c);
        }
    }
}
