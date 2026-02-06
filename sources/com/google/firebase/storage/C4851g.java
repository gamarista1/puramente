package com.google.firebase.storage;

import Kc.c;
import Lc.b;
import android.net.Uri;
import android.text.TextUtils;
import com.amazon.a.a.o.b.f;
import com.google.android.gms.common.internal.C4536s;
import com.google.android.gms.tasks.TaskCompletionSource;
import org.json.JSONObject;

/* renamed from: com.google.firebase.storage.g  reason: case insensitive filesystem */
class C4851g implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private o f58072a;

    /* renamed from: b  reason: collision with root package name */
    private TaskCompletionSource f58073b;

    /* renamed from: c  reason: collision with root package name */
    private c f58074c;

    C4851g(o oVar, TaskCompletionSource taskCompletionSource) {
        C4536s.l(oVar);
        C4536s.l(taskCompletionSource);
        this.f58072a = oVar;
        this.f58073b = taskCompletionSource;
        if (!oVar.s().o().equals(oVar.o())) {
            C4849e t10 = this.f58072a.t();
            this.f58074c = new c(t10.a().m(), t10.c(), t10.b(), t10.l());
            return;
        }
        throw new IllegalArgumentException("getDownloadUrl() is not supported at the root of the bucket.");
    }

    private Uri a(JSONObject jSONObject) {
        String optString = jSONObject.optString("downloadTokens");
        if (TextUtils.isEmpty(optString)) {
            return null;
        }
        String str = optString.split(f.f37529a, -1)[0];
        Uri.Builder buildUpon = this.f58072a.u().c().buildUpon();
        buildUpon.appendQueryParameter("alt", "media");
        buildUpon.appendQueryParameter("token", str);
        return buildUpon.build();
    }

    public void run() {
        Uri uri;
        b bVar = new b(this.f58072a.u(), this.f58072a.f());
        this.f58074c.d(bVar);
        if (bVar.v()) {
            uri = a(bVar.n());
        } else {
            uri = null;
        }
        TaskCompletionSource taskCompletionSource = this.f58073b;
        if (taskCompletionSource != null) {
            bVar.a(taskCompletionSource, uri);
        }
    }
}
