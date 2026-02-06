package Dd;

import Pd.f;
import android.app.Application;
import android.content.res.Configuration;
import android.support.v4.media.session.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.C6496s;
import mf.C6565s;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f50607a = new a();

    /* renamed from: b  reason: collision with root package name */
    private static List f50608b;

    private a() {
    }

    private final List a(Application application) {
        List list = f50608b;
        if (list != null) {
            return list;
        }
        ArrayList arrayList = new ArrayList();
        for (f e10 : c.f50609b.a()) {
            List e11 = e10.e(application);
            C6496s.g(e11, "createApplicationLifecycleListeners(...)");
            C6565s.D(arrayList, e11);
        }
        f50608b = arrayList;
        return arrayList;
    }

    public static final void b(Application application) {
        C6496s.h(application, "application");
        Iterator it = f50607a.a(application).iterator();
        if (it.hasNext()) {
            c.a(it.next());
            throw null;
        }
    }

    public static final void c(Application application, Configuration configuration) {
        C6496s.h(application, "application");
        C6496s.h(configuration, "newConfig");
        Iterator it = f50607a.a(application).iterator();
        if (it.hasNext()) {
            c.a(it.next());
            throw null;
        }
    }
}
