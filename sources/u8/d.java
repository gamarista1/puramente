package u8;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.UUID;
import kotlin.jvm.internal.C6496s;
import mf.C6565s;
import o7.W;
import v8.e;
import v8.g;
import v8.k;
import v8.n;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    public static final d f48627a = new d();

    private d() {
    }

    public static final Bundle a(UUID uuid, e eVar, boolean z10) {
        C6496s.h(uuid, "callId");
        C6496s.h(eVar, "shareContent");
        if (eVar instanceof g) {
            return f48627a.b((g) eVar, z10);
        }
        if (eVar instanceof k) {
            k kVar = (k) eVar;
            List i10 = m.i(kVar, uuid);
            if (i10 == null) {
                i10 = C6565s.n();
            }
            return f48627a.c(kVar, i10, z10);
        }
        boolean z11 = eVar instanceof n;
        return null;
    }

    private final Bundle b(g gVar, boolean z10) {
        return d(gVar, z10);
    }

    private final Bundle c(k kVar, List list, boolean z10) {
        Bundle d10 = d(kVar, z10);
        d10.putStringArrayList("com.facebook.platform.extra.PHOTOS", new ArrayList(list));
        return d10;
    }

    private final Bundle d(e eVar, boolean z10) {
        Bundle bundle = new Bundle();
        W.u0(bundle, "com.facebook.platform.extra.LINK", eVar.a());
        W.t0(bundle, "com.facebook.platform.extra.PLACE", eVar.d());
        W.t0(bundle, "com.facebook.platform.extra.REF", eVar.e());
        bundle.putBoolean("com.facebook.platform.extra.DATA_FAILURES_FATAL", z10);
        Collection c10 = eVar.c();
        if (c10 != null && !c10.isEmpty()) {
            bundle.putStringArrayList("com.facebook.platform.extra.FRIENDS", new ArrayList(c10));
        }
        return bundle;
    }
}
