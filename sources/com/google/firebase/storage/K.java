package com.google.firebase.storage;

import Kc.c;
import Lc.k;
import android.util.Log;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.storage.n;
import org.json.JSONException;

class K implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final o f58011a;

    /* renamed from: b  reason: collision with root package name */
    private final TaskCompletionSource f58012b;

    /* renamed from: c  reason: collision with root package name */
    private final n f58013c;

    /* renamed from: d  reason: collision with root package name */
    private n f58014d = null;

    /* renamed from: e  reason: collision with root package name */
    private c f58015e;

    public K(o oVar, TaskCompletionSource taskCompletionSource, n nVar) {
        this.f58011a = oVar;
        this.f58012b = taskCompletionSource;
        this.f58013c = nVar;
        C4849e t10 = oVar.t();
        this.f58015e = new c(t10.a().m(), t10.c(), t10.b(), t10.l());
    }

    public void run() {
        k kVar = new k(this.f58011a.u(), this.f58011a.f(), this.f58013c.q());
        this.f58015e.d(kVar);
        if (kVar.v()) {
            try {
                this.f58014d = new n.b(kVar.n(), this.f58011a).a();
            } catch (JSONException e10) {
                Log.e("UpdateMetadataTask", "Unable to parse a valid JSON object from resulting metadata:" + kVar.m(), e10);
                this.f58012b.setException(m.d(e10));
                return;
            }
        }
        TaskCompletionSource taskCompletionSource = this.f58012b;
        if (taskCompletionSource != null) {
            kVar.a(taskCompletionSource, this.f58014d);
        }
    }
}
