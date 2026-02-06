package ce;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.media.session.c;
import g.C1998a;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Random;
import kotlin.jvm.internal.C6496s;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    private final me.a f53755a;

    /* renamed from: b  reason: collision with root package name */
    private Random f53756b = new Random();

    /* renamed from: c  reason: collision with root package name */
    private final Map f53757c = new HashMap();

    /* renamed from: d  reason: collision with root package name */
    private final Map f53758d = new HashMap();

    /* renamed from: e  reason: collision with root package name */
    private final Map f53759e = new HashMap();

    /* renamed from: f  reason: collision with root package name */
    private ArrayList f53760f = new ArrayList();

    /* renamed from: g  reason: collision with root package name */
    private final Map f53761g = new HashMap();

    /* renamed from: h  reason: collision with root package name */
    private final Map f53762h = new HashMap();

    /* renamed from: i  reason: collision with root package name */
    private final Bundle f53763i = new Bundle();

    private static final class a {
    }

    public b(me.a aVar) {
        C6496s.h(aVar, "currentActivityProvider");
        this.f53755a = aVar;
    }

    private final void b(String str, int i10, Intent intent, a aVar) {
        c.a(this.f53759e.get(str));
        this.f53763i.putParcelable(str, new C1998a(i10, intent));
    }

    public final boolean a(int i10, int i11, Intent intent) {
        String str = (String) this.f53757c.get(Integer.valueOf(i10));
        if (str == null) {
            return false;
        }
        c.a(this.f53761g.get(str));
        b(str, i11, intent, (a) null);
        return true;
    }

    public final void c(Context context) {
        C6496s.h(context, "context");
        e e10 = new e(context).d("launchedKeys", this.f53760f).e("keyToRequestCode", this.f53758d);
        Map map = this.f53762h;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : map.entrySet()) {
            if (this.f53760f.contains((String) entry.getKey())) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        e10.f("keyToParamsForFallbackCallback", linkedHashMap).b("pendingResult", this.f53763i).c("random", this.f53756b).h();
    }

    public final void d(Context context) {
        C6496s.h(context, "context");
        e eVar = new e(context);
        ArrayList l10 = eVar.l("launchedKeys");
        if (l10 != null) {
            this.f53760f = l10;
        }
        Map n10 = eVar.n("keyToParamsForFallbackCallback");
        if (n10 != null) {
            this.f53762h.putAll(n10);
        }
        Bundle i10 = eVar.i("pendingResult");
        if (i10 != null) {
            this.f53763i.putAll(i10);
        }
        Serializable k10 = eVar.k("random");
        if (k10 != null) {
            this.f53756b = (Random) k10;
        }
        Map m10 = eVar.m("keyToRequestCode");
        if (m10 != null) {
            for (Map.Entry entry : m10.entrySet()) {
                String str = (String) entry.getKey();
                int intValue = ((Number) entry.getValue()).intValue();
                this.f53758d.put(str, Integer.valueOf(intValue));
                this.f53757c.put(Integer.valueOf(intValue), str);
            }
        }
    }
}
