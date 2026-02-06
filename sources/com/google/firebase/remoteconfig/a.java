package com.google.firebase.remoteconfig;

import Dc.d;
import Dc.e;
import Dc.h;
import Dc.i;
import Dc.k;
import Dc.l;
import Dc.n;
import Dc.r;
import Dc.t;
import Fb.j;
import android.content.Context;
import android.util.Log;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.remoteconfig.internal.f;
import com.google.firebase.remoteconfig.internal.g;
import com.google.firebase.remoteconfig.internal.m;
import com.google.firebase.remoteconfig.internal.o;
import com.google.firebase.remoteconfig.internal.p;
import com.google.firebase.remoteconfig.internal.q;
import com.google.firebase.remoteconfig.internal.v;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import jc.C5046e;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import ub.C5230g;
import vb.C5246a;
import vb.c;

public class a {

    /* renamed from: n  reason: collision with root package name */
    public static final byte[] f57771n = new byte[0];

    /* renamed from: a  reason: collision with root package name */
    private final Context f57772a;

    /* renamed from: b  reason: collision with root package name */
    private final C5230g f57773b;

    /* renamed from: c  reason: collision with root package name */
    private final c f57774c;

    /* renamed from: d  reason: collision with root package name */
    private final Executor f57775d;

    /* renamed from: e  reason: collision with root package name */
    private final f f57776e;

    /* renamed from: f  reason: collision with root package name */
    private final f f57777f;

    /* renamed from: g  reason: collision with root package name */
    private final f f57778g;

    /* renamed from: h  reason: collision with root package name */
    private final m f57779h;

    /* renamed from: i  reason: collision with root package name */
    private final o f57780i;

    /* renamed from: j  reason: collision with root package name */
    private final p f57781j;

    /* renamed from: k  reason: collision with root package name */
    private final C5046e f57782k;

    /* renamed from: l  reason: collision with root package name */
    private final q f57783l;

    /* renamed from: m  reason: collision with root package name */
    private final Ec.c f57784m;

    a(Context context, C5230g gVar, C5046e eVar, c cVar, Executor executor, f fVar, f fVar2, f fVar3, m mVar, o oVar, p pVar, q qVar, Ec.c cVar2) {
        this.f57772a = context;
        this.f57773b = gVar;
        this.f57782k = eVar;
        this.f57774c = cVar;
        this.f57775d = executor;
        this.f57776e = fVar;
        this.f57777f = fVar2;
        this.f57778g = fVar3;
        this.f57779h = mVar;
        this.f57780i = oVar;
        this.f57781j = pVar;
        this.f57783l = qVar;
        this.f57784m = cVar2;
    }

    /* access modifiers changed from: private */
    public boolean B(Task task) {
        if (!task.isSuccessful()) {
            return false;
        }
        this.f57776e.d();
        g gVar = (g) task.getResult();
        if (gVar != null) {
            K(gVar.e());
            this.f57784m.c(gVar);
            return true;
        }
        Log.e("FirebaseRemoteConfig", "Activated configs written to disk are null.");
        return true;
    }

    private Task H(Map map) {
        try {
            return this.f57778g.k(g.l().b(map).a()).onSuccessTask(j.a(), new Dc.f());
        } catch (JSONException e10) {
            Log.e("FirebaseRemoteConfig", "The provided defaults map could not be processed.", e10);
            return Tasks.forResult(null);
        }
    }

    static List J(JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            HashMap hashMap = new HashMap();
            JSONObject jSONObject = jSONArray.getJSONObject(i10);
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                hashMap.put(next, jSONObject.getString(next));
            }
            arrayList.add(hashMap);
        }
        return arrayList;
    }

    public static a r(C5230g gVar) {
        return ((c) gVar.k(c.class)).f();
    }

    private static boolean s(g gVar, g gVar2) {
        if (gVar2 == null || !gVar.h().equals(gVar2.h())) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ Task t(Task task, Task task2, Task task3) {
        if (!task.isSuccessful() || task.getResult() == null) {
            return Tasks.forResult(Boolean.FALSE);
        }
        g gVar = (g) task.getResult();
        if (!task2.isSuccessful() || s(gVar, (g) task2.getResult())) {
            return this.f57777f.k(gVar).continueWith(this.f57775d, new k(this));
        }
        return Tasks.forResult(Boolean.FALSE);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ r u(Task task, Task task2) {
        return (r) task.getResult();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ Task x(Void voidR) {
        return j();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ Void y() {
        this.f57777f.d();
        this.f57776e.d();
        this.f57778g.d();
        this.f57781j.a();
        return null;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ Void z(t tVar) {
        this.f57781j.m(tVar);
        return null;
    }

    public Task C() {
        return Tasks.call(this.f57775d, new Dc.g(this));
    }

    public Task D(t tVar) {
        return Tasks.call(this.f57775d, new Dc.m(this, tVar));
    }

    /* access modifiers changed from: package-private */
    public void E(boolean z10) {
        this.f57783l.e(z10);
    }

    public Task F(int i10) {
        return H(v.a(this.f57772a, i10));
    }

    public Task G(Map map) {
        HashMap hashMap = new HashMap();
        for (Map.Entry entry : map.entrySet()) {
            Object value = entry.getValue();
            if (value instanceof byte[]) {
                hashMap.put((String) entry.getKey(), new String((byte[]) value));
            } else {
                hashMap.put((String) entry.getKey(), value.toString());
            }
        }
        return H(hashMap);
    }

    /* access modifiers changed from: package-private */
    public void I() {
        this.f57777f.e();
        this.f57778g.e();
        this.f57776e.e();
    }

    /* access modifiers changed from: package-private */
    public void K(JSONArray jSONArray) {
        if (this.f57774c != null) {
            try {
                this.f57774c.m(J(jSONArray));
            } catch (JSONException e10) {
                Log.e("FirebaseRemoteConfig", "Could not parse ABT experiments from the JSON response.", e10);
            } catch (C5246a e11) {
                Log.w("FirebaseRemoteConfig", "Could not update ABT experiments.", e11);
            }
        }
    }

    public Task j() {
        Task e10 = this.f57776e.e();
        Task e11 = this.f57777f.e();
        return Tasks.whenAllComplete((Task<?>[]) new Task[]{e10, e11}).continueWithTask(this.f57775d, new e(this, e10, e11));
    }

    public d k(Dc.c cVar) {
        return this.f57783l.b(cVar);
    }

    public Task l() {
        Task e10 = this.f57777f.e();
        Task e11 = this.f57778g.e();
        Task e12 = this.f57776e.e();
        Task call = Tasks.call(this.f57775d, new h(this));
        return Tasks.whenAllComplete((Task<?>[]) new Task[]{e10, e11, e12, call, this.f57782k.getId(), this.f57782k.a(false)}).continueWith(this.f57775d, new i(call));
    }

    public Task m() {
        return this.f57779h.i().onSuccessTask(j.a(), new n());
    }

    public Task n(long j10) {
        return this.f57779h.j(j10).onSuccessTask(j.a(), new l());
    }

    public Task o() {
        return m().onSuccessTask(this.f57775d, new Dc.j(this));
    }

    public Map p() {
        return this.f57780i.d();
    }

    public r q() {
        return this.f57781j.d();
    }
}
