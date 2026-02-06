package u8;

import android.os.Bundle;
import com.amazon.a.a.o.b;
import io.intercom.android.sdk.metrics.MetricTracker;
import io.intercom.android.sdk.models.carousel.ActionType;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.C6496s;
import mf.C6565s;
import o7.W;
import v8.C4113c;
import v8.e;
import v8.f;
import v8.g;
import v8.j;
import v8.k;

public final class o {

    /* renamed from: a  reason: collision with root package name */
    public static final o f48667a = new o();

    private o() {
    }

    public static final Bundle a(C4113c cVar) {
        String str;
        String obj;
        String obj2;
        C6496s.h(cVar, "gameRequestContent");
        Bundle bundle = new Bundle();
        W.t0(bundle, MetricTracker.Object.MESSAGE, cVar.e());
        W.r0(bundle, "to", cVar.g());
        W.t0(bundle, b.f37461S, cVar.i());
        W.t0(bundle, "data", cVar.c());
        C4113c.a a10 = cVar.a();
        String str2 = null;
        if (a10 == null || (obj2 = a10.toString()) == null) {
            str = null;
        } else {
            Locale locale = Locale.ENGLISH;
            C6496s.g(locale, "ENGLISH");
            str = obj2.toLowerCase(locale);
            C6496s.g(str, "this as java.lang.String).toLowerCase(locale)");
        }
        W.t0(bundle, "action_type", str);
        W.t0(bundle, "object_id", cVar.f());
        C4113c.e d10 = cVar.d();
        if (!(d10 == null || (obj = d10.toString()) == null)) {
            Locale locale2 = Locale.ENGLISH;
            C6496s.g(locale2, "ENGLISH");
            str2 = obj.toLowerCase(locale2);
            C6496s.g(str2, "this as java.lang.String).toLowerCase(locale)");
        }
        W.t0(bundle, "filters", str2);
        W.r0(bundle, "suggestions", cVar.h());
        return bundle;
    }

    public static final Bundle b(g gVar) {
        C6496s.h(gVar, "shareLinkContent");
        Bundle d10 = d(gVar);
        W.u0(d10, "href", gVar.a());
        W.t0(d10, "quote", gVar.h());
        return d10;
    }

    public static final Bundle c(k kVar) {
        C6496s.h(kVar, "sharePhotoContent");
        Bundle d10 = d(kVar);
        List h10 = kVar.h();
        if (h10 == null) {
            h10 = C6565s.n();
        }
        Iterable<j> iterable = h10;
        ArrayList arrayList = new ArrayList(C6565s.y(iterable, 10));
        for (j e10 : iterable) {
            arrayList.add(String.valueOf(e10.e()));
        }
        d10.putStringArray("media", (String[]) arrayList.toArray(new String[0]));
        return d10;
    }

    public static final Bundle d(e eVar) {
        String str;
        C6496s.h(eVar, "shareContent");
        Bundle bundle = new Bundle();
        f f10 = eVar.f();
        if (f10 != null) {
            str = f10.a();
        } else {
            str = null;
        }
        W.t0(bundle, "hashtag", str);
        return bundle;
    }

    public static final Bundle e(j jVar) {
        C6496s.h(jVar, "shareFeedContent");
        Bundle bundle = new Bundle();
        W.t0(bundle, "to", jVar.o());
        W.t0(bundle, ActionType.LINK, jVar.h());
        W.t0(bundle, "picture", jVar.n());
        W.t0(bundle, "source", jVar.l());
        W.t0(bundle, "name", jVar.k());
        W.t0(bundle, "caption", jVar.i());
        W.t0(bundle, b.f37480c, jVar.j());
        return bundle;
    }

    public static final Bundle f(g gVar) {
        String str;
        C6496s.h(gVar, "shareLinkContent");
        Bundle bundle = new Bundle();
        W.t0(bundle, ActionType.LINK, W.Q(gVar.a()));
        W.t0(bundle, "quote", gVar.h());
        f f10 = gVar.f();
        if (f10 != null) {
            str = f10.a();
        } else {
            str = null;
        }
        W.t0(bundle, "hashtag", str);
        return bundle;
    }
}
