package io.invertase.firebase.perf;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.util.SparseArray;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.perf.metrics.Trace;
import io.invertase.firebase.common.b;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import rc.e;
import vc.C5254g;

public class q extends b {

    /* renamed from: d  reason: collision with root package name */
    private static SparseArray f71468d = new SparseArray();

    /* renamed from: e  reason: collision with root package name */
    private static SparseArray f71469e = new SparseArray();

    /* renamed from: f  reason: collision with root package name */
    private static SparseArray f71470f = new SparseArray();

    q(Context context, String str) {
        super(context, str);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ Void o(String str, String str2, int i10) {
        C5254g e10 = e.c().e(str, str2);
        e10.g();
        f71470f.put(i10, e10);
        return null;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ Void p(Activity activity, String str, int i10) {
        i iVar = new i(activity, str);
        iVar.e();
        f71469e.put(i10, iVar);
        return null;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ Void q(String str, int i10) {
        Trace f10 = e.c().f(str);
        f10.start();
        f71468d.put(i10, f10);
        return null;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ Void r(int i10, Bundle bundle, Bundle bundle2) {
        C5254g gVar = (C5254g) f71470f.get(i10);
        if (bundle.containsKey("httpResponseCode")) {
            gVar.c((int) bundle.getDouble("httpResponseCode"));
        }
        if (bundle.containsKey("requestPayloadSize")) {
            gVar.d((long) ((int) bundle.getDouble("requestPayloadSize")));
        }
        if (bundle.containsKey("responsePayloadSize")) {
            gVar.f((long) ((int) bundle.getDouble("responsePayloadSize")));
        }
        if (bundle.containsKey("responseContentType")) {
            gVar.e(bundle.getString("responseContentType"));
        }
        for (String next : bundle2.keySet()) {
            String string = bundle2.getString(next);
            Objects.requireNonNull(string);
            gVar.b(next, string);
        }
        gVar.h();
        f71470f.remove(i10);
        return null;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ Void s(int i10) {
        ((i) f71469e.get(i10)).f();
        f71469e.remove(i10);
        return null;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ Void t(int i10, Bundle bundle, Bundle bundle2) {
        Trace trace = (Trace) f71468d.get(i10);
        Set<String> keySet = bundle.keySet();
        Set<String> keySet2 = bundle2.keySet();
        for (String next : keySet) {
            Double d10 = (Double) bundle.get(next);
            d10.doubleValue();
            trace.putMetric(next, (long) d10.intValue());
        }
        for (String next2 : keySet2) {
            Object obj = bundle2.get(next2);
            Objects.requireNonNull(obj);
            trace.putAttribute(next2, (String) obj);
        }
        trace.stop();
        f71468d.remove(i10);
        return null;
    }

    /* access modifiers changed from: package-private */
    public Task A(int i10, Bundle bundle, Bundle bundle2) {
        return Tasks.call(new j(i10, bundle, bundle2));
    }

    public Map b() {
        HashMap hashMap = new HashMap();
        hashMap.put("isPerformanceCollectionEnabled", Boolean.valueOf(e.c().d()));
        hashMap.put("isInstrumentationEnabled", Boolean.TRUE);
        return hashMap;
    }

    public void f() {
        super.f();
        f71468d.clear();
        f71470f.clear();
        f71469e.clear();
    }

    /* access modifiers changed from: package-private */
    public Task u(Boolean bool) {
        return Tasks.call(new p(bool));
    }

    /* access modifiers changed from: package-private */
    public Task v(int i10, String str, String str2) {
        return Tasks.call(new k(str, str2, i10));
    }

    /* access modifiers changed from: package-private */
    public Task w(Activity activity, int i10, String str) {
        return Tasks.call(new o(activity, str, i10));
    }

    /* access modifiers changed from: package-private */
    public Task x(int i10, String str) {
        return Tasks.call(new n(str, i10));
    }

    /* access modifiers changed from: package-private */
    public Task y(int i10, Bundle bundle, Bundle bundle2) {
        return Tasks.call(new l(i10, bundle, bundle2));
    }

    /* access modifiers changed from: package-private */
    public Task z(int i10) {
        return Tasks.call(new m(i10));
    }
}
