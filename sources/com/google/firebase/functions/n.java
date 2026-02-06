package com.google.firebase.functions;

import Qa.a;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import com.google.android.gms.common.internal.C4536s;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.functions.o;
import com.revenuecat.purchases.common.Constants;
import ec.C4949a;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.concurrent.Executor;
import org.json.JSONException;
import org.json.JSONObject;
import rh.C;
import rh.C6703A;
import rh.C6708e;
import rh.C6709f;
import rh.D;
import rh.E;
import rh.y;
import ub.C5230g;

public class n {
    /* access modifiers changed from: private */

    /* renamed from: j  reason: collision with root package name */
    public static final TaskCompletionSource f57220j = new TaskCompletionSource();

    /* renamed from: k  reason: collision with root package name */
    private static boolean f57221k = false;

    /* renamed from: a  reason: collision with root package name */
    private final C6703A f57222a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final z f57223b;

    /* renamed from: c  reason: collision with root package name */
    private final a f57224c;

    /* renamed from: d  reason: collision with root package name */
    private final Executor f57225d;

    /* renamed from: e  reason: collision with root package name */
    private final String f57226e;

    /* renamed from: f  reason: collision with root package name */
    private final String f57227f;

    /* renamed from: g  reason: collision with root package name */
    private final String f57228g;

    /* renamed from: h  reason: collision with root package name */
    private String f57229h = "https://%1$s-%2$s.cloudfunctions.net/%3$s";

    /* renamed from: i  reason: collision with root package name */
    private Yb.a f57230i;

    class a implements a.C0800a {
        a() {
        }

        public void a() {
            n.f57220j.setResult(null);
        }

        public void b(int i10, Intent intent) {
            Log.d("FirebaseFunctions", "Failed to update ssl context");
            n.f57220j.setResult(null);
        }
    }

    class b implements C6709f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ TaskCompletionSource f57231a;

        b(TaskCompletionSource taskCompletionSource) {
            this.f57231a = taskCompletionSource;
        }

        public void onFailure(C6708e eVar, IOException iOException) {
            if (iOException instanceof InterruptedIOException) {
                o.a aVar = o.a.DEADLINE_EXCEEDED;
                this.f57231a.setException(new o(aVar.name(), aVar, (Object) null, iOException));
                return;
            }
            o.a aVar2 = o.a.INTERNAL;
            this.f57231a.setException(new o(aVar2.name(), aVar2, (Object) null, iOException));
        }

        public void onResponse(C6708e eVar, E e10) {
            o.a c10 = o.a.c(e10.o());
            String E10 = e10.a().E();
            o a10 = o.a(c10, E10, n.this.f57223b);
            if (a10 != null) {
                this.f57231a.setException(a10);
                return;
            }
            try {
                JSONObject jSONObject = new JSONObject(E10);
                Object opt = jSONObject.opt("data");
                if (opt == null) {
                    opt = jSONObject.opt("result");
                }
                if (opt == null) {
                    this.f57231a.setException(new o("Response is missing data field.", o.a.INTERNAL, (Object) null));
                    return;
                }
                this.f57231a.setResult(new y(n.this.f57223b.a(opt)));
            } catch (JSONException e11) {
                this.f57231a.setException(new o("Response is not valid JSON object.", o.a.INTERNAL, (Object) null, e11));
            }
        }
    }

    n(Context context, String str, String str2, a aVar, Executor executor, Executor executor2) {
        this.f57225d = executor;
        this.f57222a = new C6703A();
        this.f57223b = new z();
        this.f57224c = (a) C4536s.l(aVar);
        this.f57226e = (String) C4536s.l(str);
        try {
            new URL(str2);
            this.f57227f = "us-central1";
            this.f57228g = str2;
        } catch (MalformedURLException unused) {
            this.f57227f = str2;
            this.f57228g = null;
        }
        t(context, executor2);
    }

    private Task j(URL url, Object obj, w wVar, v vVar) {
        C4536s.m(url, "url cannot be null");
        HashMap hashMap = new HashMap();
        hashMap.put("data", this.f57223b.b(obj));
        C.a h10 = new C.a().m(url).h(D.create(y.g("application/json"), new JSONObject(hashMap).toString()));
        if (wVar.b() != null) {
            h10 = h10.e("Authorization", "Bearer " + wVar.b());
        }
        if (wVar.c() != null) {
            h10 = h10.e("Firebase-Instance-ID-Token", wVar.c());
        }
        if (wVar.a() != null) {
            h10 = h10.e("X-Firebase-AppCheck", wVar.a());
        }
        C6708e a10 = vVar.a(this.f57222a).a(h10.b());
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        a10.f0(new b(taskCompletionSource));
        return taskCompletionSource.getTask();
    }

    public static n m(C5230g gVar, String str) {
        C4536s.m(gVar, "You must call FirebaseApp.initializeApp first.");
        C4536s.l(str);
        s sVar = (s) gVar.k(s.class);
        C4536s.m(sVar, "Functions component does not exist.");
        return sVar.a(str);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ Task o(v vVar, Task task) {
        return this.f57224c.a(vVar.b());
    }

    /* access modifiers changed from: private */
    public /* synthetic */ Task p(String str, Object obj, v vVar, Task task) {
        if (!task.isSuccessful()) {
            return Tasks.forException(task.getException());
        }
        return j(n(str), obj, (w) task.getResult(), vVar);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ Task q(v vVar, Task task) {
        return this.f57224c.a(vVar.b());
    }

    /* access modifiers changed from: private */
    public /* synthetic */ Task r(URL url, Object obj, v vVar, Task task) {
        if (!task.isSuccessful()) {
            return Tasks.forException(task.getException());
        }
        return j(url, obj, (w) task.getResult(), vVar);
    }

    private static void t(Context context, Executor executor) {
        synchronized (f57220j) {
            try {
                if (!f57221k) {
                    f57221k = true;
                    executor.execute(new C4949a(context));
                }
            } catch (Throwable th2) {
                while (true) {
                    throw th2;
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public Task h(String str, Object obj, v vVar) {
        return f57220j.getTask().continueWithTask(this.f57225d, new l(this, vVar)).continueWithTask(this.f57225d, new m(this, str, obj, vVar));
    }

    /* access modifiers changed from: package-private */
    public Task i(URL url, Object obj, v vVar) {
        return f57220j.getTask().continueWithTask(this.f57225d, new j(this, vVar)).continueWithTask(this.f57225d, new k(this, url, obj, vVar));
    }

    public x k(String str) {
        return new x(this, str, new v());
    }

    public x l(URL url) {
        return new x(this, url, new v());
    }

    /* access modifiers changed from: package-private */
    public URL n(String str) {
        Yb.a aVar = this.f57230i;
        if (aVar != null) {
            this.f57229h = "http://" + aVar.a() + Constants.SUBS_ID_BASE_PLAN_ID_SEPARATOR + aVar.b() + "/%2$s/%1$s/%3$s";
        }
        String format = String.format(this.f57229h, new Object[]{this.f57227f, this.f57226e, str});
        if (this.f57228g != null && aVar == null) {
            format = this.f57228g + "/" + str;
        }
        try {
            return new URL(format);
        } catch (MalformedURLException e10) {
            throw new IllegalStateException(e10);
        }
    }

    public void u(String str, int i10) {
        this.f57230i = new Yb.a(str, i10);
    }
}
