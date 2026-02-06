package expo.modules.kotlin.views;

import ae.C4464a;
import ae.r;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.react.bridge.ReactContext;
import expo.modules.adapters.react.NativeModulesProxy;
import expo.modules.kotlin.exception.CodedException;
import fe.C4992b;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.C6496s;
import mf.C6565s;
import yf.C6798l;
import yf.p;

public final class n {

    /* renamed from: a  reason: collision with root package name */
    private final p f60485a;

    /* renamed from: b  reason: collision with root package name */
    private final Class f60486b;

    /* renamed from: c  reason: collision with root package name */
    private final Map f60487c;

    /* renamed from: d  reason: collision with root package name */
    private final C6798l f60488d;

    /* renamed from: e  reason: collision with root package name */
    private final b f60489e;

    /* renamed from: f  reason: collision with root package name */
    private final C6798l f60490f;

    /* renamed from: g  reason: collision with root package name */
    private final List f60491g;

    /* renamed from: h  reason: collision with root package name */
    private final List f60492h;

    public n(p pVar, Class cls, Map map, C6798l lVar, b bVar, m mVar, C6798l lVar2, List list) {
        C6496s.h(pVar, "viewFactory");
        C6496s.h(cls, "viewType");
        C6496s.h(map, "props");
        C6496s.h(list, "asyncFunctions");
        this.f60485a = pVar;
        this.f60486b = cls;
        this.f60487c = map;
        this.f60488d = lVar;
        this.f60489e = bVar;
        this.f60490f = lVar2;
        this.f60491g = list;
        this.f60492h = C6565s.e1(map.keySet());
    }

    public final View a(Context context, C4464a aVar) {
        C6496s.h(context, "context");
        C6496s.h(aVar, "appContext");
        return (View) this.f60485a.invoke(context, aVar);
    }

    public final List b() {
        return this.f60491g;
    }

    public final b c() {
        return this.f60489e;
    }

    public final C6798l d() {
        return this.f60488d;
    }

    public final C6798l e() {
        return this.f60490f;
    }

    public final Map f() {
        return this.f60487c;
    }

    public final List g() {
        return this.f60492h;
    }

    public final m h() {
        return null;
    }

    public final o i() {
        if (ViewGroup.class.isAssignableFrom(this.f60486b)) {
            return o.GROUP;
        }
        return o.SIMPLE;
    }

    public final Class j() {
        return this.f60486b;
    }

    public final void k(View view, CodedException codedException) {
        ReactContext reactContext;
        NativeModulesProxy a10;
        C4992b m10;
        C6496s.h(view, "view");
        C6496s.h(codedException, "exception");
        Context context = view.getContext();
        if (context instanceof ReactContext) {
            reactContext = (ReactContext) context;
        } else {
            reactContext = null;
        }
        if (reactContext != null && (a10 = r.a(reactContext)) != null && (m10 = a10.getKotlinInteropModuleRegistry().f().m()) != null) {
            m10.k(codedException);
        }
    }
}
