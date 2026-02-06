package io.invertase.firebase.config;

import Dc.r;
import Dc.t;
import Dc.u;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.os.Bundle;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.remoteconfig.a;
import io.invertase.firebase.common.b;
import java.util.HashMap;
import java.util.Map;
import ub.C5230g;

public class m extends b {
    m(Context context, String str) {
        super(context, str);
    }

    private Bundle k(u uVar) {
        Bundle bundle = new Bundle(2);
        bundle.putString("value", uVar.asString());
        int i10 = uVar.i();
        if (i10 == 1) {
            bundle.putString("source", "default");
        } else if (i10 != 2) {
            bundle.putString("source", "static");
        } else {
            bundle.putString("source", "remote");
        }
        return bundle;
    }

    private int q(String str) {
        return a().getResources().getIdentifier(str, "xml", a().getPackageName());
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ Void r(C5230g gVar, long j10) {
        Task task;
        a r10 = a.r(gVar);
        if (j10 == -1) {
            task = r10.m();
        } else {
            task = r10.n(j10);
        }
        Tasks.await(task);
        return null;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ Void s(Bundle bundle, C5230g gVar) {
        t.b bVar = new t.b();
        if (bundle.containsKey("minimumFetchInterval")) {
            bVar.e((long) bundle.getDouble("minimumFetchInterval"));
        }
        if (bundle.containsKey("fetchTimeout")) {
            bVar.d((long) bundle.getDouble("fetchTimeout"));
        }
        a.r(gVar).D(bVar.c());
        return null;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ Void t(String str, C5230g gVar) {
        XmlResourceParser xmlResourceParser;
        int q10 = q(str);
        try {
            xmlResourceParser = a().getResources().getXml(q10);
        } catch (Resources.NotFoundException unused) {
            xmlResourceParser = null;
        }
        if (xmlResourceParser != null) {
            Tasks.await(a.r(gVar).F(q10));
            return null;
        }
        throw new Exception("resource_not_found");
    }

    private String u(int i10) {
        if (i10 == -1) {
            return com.amazon.device.simplesignin.a.a.a.f38020s;
        }
        if (i10 == 0) {
            return "no_fetch_yet";
        }
        if (i10 == 1) {
            return "failure";
        }
        if (i10 != 2) {
            return "unknown";
        }
        return "throttled";
    }

    /* access modifiers changed from: package-private */
    public Task j(String str) {
        return a.r(C5230g.p(str)).j();
    }

    /* access modifiers changed from: package-private */
    public Task l(String str) {
        Task l10 = a.r(C5230g.p(str)).l();
        try {
            Tasks.await(n(str));
        } catch (Exception unused) {
        }
        return l10;
    }

    /* access modifiers changed from: package-private */
    public Task m(String str, long j10) {
        return Tasks.call(d(), new j(C5230g.p(str), j10));
    }

    /* access modifiers changed from: package-private */
    public Task n(String str) {
        return a.r(C5230g.p(str)).o();
    }

    /* access modifiers changed from: package-private */
    public Map o(String str) {
        Map p10 = a.r(C5230g.p(str)).p();
        HashMap hashMap = new HashMap(p10.size());
        for (Map.Entry entry : p10.entrySet()) {
            hashMap.put((String) entry.getKey(), k((u) entry.getValue()));
        }
        return hashMap;
    }

    public Map p(String str) {
        HashMap hashMap = new HashMap();
        r q10 = a.r(C5230g.p(str)).q();
        t b10 = q10.b();
        hashMap.put("values", o(str));
        hashMap.put("lastFetchTime", Long.valueOf(q10.a()));
        hashMap.put("lastFetchStatus", u(q10.c()));
        hashMap.put("minimumFetchInterval", Long.valueOf(b10.b()));
        hashMap.put("fetchTimeout", Long.valueOf(b10.a()));
        return hashMap;
    }

    /* access modifiers changed from: package-private */
    public Task v(String str) {
        return a.r(C5230g.p(str)).C();
    }

    /* access modifiers changed from: package-private */
    public Task w(String str, Bundle bundle) {
        return Tasks.call(d(), new k(bundle, C5230g.p(str)));
    }

    /* access modifiers changed from: package-private */
    public Task x(String str, HashMap hashMap) {
        return a.r(C5230g.p(str)).G(hashMap);
    }

    /* access modifiers changed from: package-private */
    public Task y(String str, String str2) {
        return Tasks.call(d(), new l(this, str2, C5230g.p(str)));
    }
}
