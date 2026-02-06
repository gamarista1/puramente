package u8;

import android.os.Bundle;
import com.facebook.C3459v;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.UUID;
import kotlin.jvm.internal.C6496s;
import mf.C6565s;
import o7.W;
import org.json.JSONException;
import org.json.JSONObject;
import v8.d;
import v8.e;
import v8.g;
import v8.i;
import v8.k;
import v8.l;
import v8.n;

public final class f {

    /* renamed from: a  reason: collision with root package name */
    public static final f f48636a = new f();

    private f() {
    }

    public static final Bundle a(UUID uuid, e eVar, boolean z10) {
        C6496s.h(uuid, "callId");
        C6496s.h(eVar, "shareContent");
        if (eVar instanceof g) {
            return f48636a.c((g) eVar, z10);
        }
        if (eVar instanceof k) {
            k kVar = (k) eVar;
            List i10 = m.i(kVar, uuid);
            if (i10 == null) {
                i10 = C6565s.n();
            }
            return f48636a.e(kVar, i10, z10);
        } else if (eVar instanceof n) {
            n nVar = (n) eVar;
            return f48636a.g(nVar, m.o(nVar, uuid), z10);
        } else if (eVar instanceof i) {
            i iVar = (i) eVar;
            List g10 = m.g(iVar, uuid);
            if (g10 == null) {
                g10 = C6565s.n();
            }
            return f48636a.d(iVar, g10, z10);
        } else if (eVar instanceof d) {
            d dVar = (d) eVar;
            return f48636a.b(dVar, m.m(dVar, uuid), z10);
        } else if (!(eVar instanceof l)) {
            return null;
        } else {
            l lVar = (l) eVar;
            return f48636a.f(lVar, m.f(lVar, uuid), m.l(lVar, uuid), z10);
        }
    }

    private final Bundle b(d dVar, Bundle bundle, boolean z10) {
        Bundle h10 = h(dVar, z10);
        W.t0(h10, "effect_id", dVar.i());
        if (bundle != null) {
            h10.putBundle("effect_textures", bundle);
        }
        try {
            JSONObject a10 = C4100b.a(dVar.h());
            if (a10 != null) {
                W.t0(h10, "effect_arguments", a10.toString());
            }
            return h10;
        } catch (JSONException e10) {
            throw new C3459v("Unable to create a JSON Object from the provided CameraEffectArguments: " + e10.getMessage());
        }
    }

    private final Bundle c(g gVar, boolean z10) {
        Bundle h10 = h(gVar, z10);
        W.t0(h10, "QUOTE", gVar.h());
        W.u0(h10, "MESSENGER_LINK", gVar.a());
        W.u0(h10, "TARGET_DISPLAY", gVar.a());
        return h10;
    }

    private final Bundle d(i iVar, List list, boolean z10) {
        Bundle h10 = h(iVar, z10);
        h10.putParcelableArrayList("MEDIA", new ArrayList(list));
        return h10;
    }

    private final Bundle e(k kVar, List list, boolean z10) {
        Bundle h10 = h(kVar, z10);
        h10.putStringArrayList("PHOTOS", new ArrayList(list));
        return h10;
    }

    private final Bundle f(l lVar, Bundle bundle, Bundle bundle2, boolean z10) {
        Bundle h10 = h(lVar, z10);
        if (bundle != null) {
            h10.putParcelable("bg_asset", bundle);
        }
        if (bundle2 != null) {
            h10.putParcelable("interactive_asset_uri", bundle2);
        }
        Collection j10 = lVar.j();
        if (j10 != null && !j10.isEmpty()) {
            h10.putStringArrayList("top_background_color_list", new ArrayList(j10));
        }
        W.t0(h10, "content_url", lVar.h());
        return h10;
    }

    private final Bundle g(n nVar, String str, boolean z10) {
        Bundle h10 = h(nVar, z10);
        W.t0(h10, "TITLE", nVar.i());
        W.t0(h10, "DESCRIPTION", nVar.h());
        W.t0(h10, "VIDEO", str);
        return h10;
    }

    private final Bundle h(e eVar, boolean z10) {
        String str;
        Bundle bundle = new Bundle();
        W.u0(bundle, "LINK", eVar.a());
        W.t0(bundle, "PLACE", eVar.d());
        W.t0(bundle, "PAGE", eVar.b());
        W.t0(bundle, "REF", eVar.e());
        W.t0(bundle, "REF", eVar.e());
        bundle.putBoolean("DATA_FAILURES_FATAL", z10);
        Collection c10 = eVar.c();
        if (c10 != null && !c10.isEmpty()) {
            bundle.putStringArrayList("FRIENDS", new ArrayList(c10));
        }
        v8.f f10 = eVar.f();
        if (f10 != null) {
            str = f10.a();
        } else {
            str = null;
        }
        W.t0(bundle, "HASHTAG", str);
        return bundle;
    }
}
