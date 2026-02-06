package xb;

import Oa.a;
import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.common.internal.C4536s;
import com.google.android.gms.internal.measurement.zzdq;
import dc.C4942a;
import dc.C4945d;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import ub.C5225b;
import ub.C5230g;
import xb.C5276a;

public class b implements C5276a {

    /* renamed from: c  reason: collision with root package name */
    private static volatile C5276a f62216c;

    /* renamed from: a  reason: collision with root package name */
    private final a f62217a;

    /* renamed from: b  reason: collision with root package name */
    final Map f62218b = new ConcurrentHashMap();

    private b(a aVar) {
        C4536s.l(aVar);
        this.f62217a = aVar;
    }

    public static C5276a g(C5230g gVar, Context context, C4945d dVar) {
        C4536s.l(gVar);
        C4536s.l(context);
        C4536s.l(dVar);
        C4536s.l(context.getApplicationContext());
        if (f62216c == null) {
            synchronized (b.class) {
                try {
                    if (f62216c == null) {
                        Bundle bundle = new Bundle(1);
                        if (gVar.y()) {
                            dVar.c(C5225b.class, new d(), new c());
                            bundle.putBoolean("dataCollectionDefaultEnabled", gVar.x());
                        }
                        f62216c = new b(zzdq.zza(context, (String) null, (String) null, (String) null, bundle).zzb());
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f62216c;
    }

    static /* synthetic */ void h(C4942a aVar) {
        boolean z10 = ((C5225b) aVar.a()).f61677a;
        synchronized (b.class) {
            ((b) C4536s.l(f62216c)).f62217a.h(z10);
        }
    }

    public void a(C5276a.C0916a aVar) {
        if (com.google.firebase.analytics.connector.internal.b.g(aVar)) {
            this.f62217a.f(com.google.firebase.analytics.connector.internal.b.a(aVar));
        }
    }

    public void b(String str, String str2, Bundle bundle) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        if (com.google.firebase.analytics.connector.internal.b.h(str) && com.google.firebase.analytics.connector.internal.b.d(str2, bundle) && com.google.firebase.analytics.connector.internal.b.f(str, str2, bundle)) {
            com.google.firebase.analytics.connector.internal.b.c(str, str2, bundle);
            this.f62217a.e(str, str2, bundle);
        }
    }

    public void c(String str, String str2, Object obj) {
        if (com.google.firebase.analytics.connector.internal.b.h(str) && com.google.firebase.analytics.connector.internal.b.e(str, str2)) {
            this.f62217a.g(str, str2, obj);
        }
    }

    public void clearConditionalUserProperty(String str, String str2, Bundle bundle) {
        if (str2 == null || com.google.firebase.analytics.connector.internal.b.d(str2, bundle)) {
            this.f62217a.a(str, str2, bundle);
        }
    }

    public Map d(boolean z10) {
        return this.f62217a.d((String) null, (String) null, z10);
    }

    public int e(String str) {
        return this.f62217a.c(str);
    }

    public List f(String str, String str2) {
        ArrayList arrayList = new ArrayList();
        for (Bundle b10 : this.f62217a.b(str, str2)) {
            arrayList.add(com.google.firebase.analytics.connector.internal.b.b(b10));
        }
        return arrayList;
    }
}
