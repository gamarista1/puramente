package Dd;

import Pd.f;
import android.util.Log;
import com.facebook.react.P;
import com.facebook.react.bridge.ReactApplicationContext;
import java.util.Comparator;
import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.O;
import lf.C6531o;
import mf.C6565s;
import pf.C6632a;

public final class c implements P {

    /* renamed from: b  reason: collision with root package name */
    public static final a f50609b = new a((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public static final Lazy f50610c = C6531o.b(new b());

    /* renamed from: a  reason: collision with root package name */
    private final expo.modules.adapters.react.a f50611a = new expo.modules.adapters.react.a(f50609b.a());

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final List a() {
            return (List) c.f50610c.getValue();
        }

        private a() {
        }
    }

    public static final class b implements Comparator {
        public final int compare(Object obj, Object obj2) {
            Md.a aVar = Md.a.f52052a;
            return C6632a.d(Integer.valueOf(aVar.a(O.b(((f) obj2).getClass()).v())), Integer.valueOf(aVar.a(O.b(((f) obj).getClass()).v())));
        }
    }

    /* access modifiers changed from: private */
    public static final List c() {
        try {
            Object invoke = d.class.getMethod("getPackageList", (Class[]) null).invoke((Object) null, (Object[]) null);
            C6496s.f(invoke, "null cannot be cast to non-null type kotlin.collections.List<expo.modules.core.interfaces.Package>");
            return C6565s.U0((List) invoke, new b());
        } catch (Exception e10) {
            Log.e("ExpoModulesPackage", "Couldn't get expo package list.", e10);
            return C6565s.n();
        }
    }

    public List createNativeModules(ReactApplicationContext reactApplicationContext) {
        C6496s.h(reactApplicationContext, "reactContext");
        List createNativeModules = this.f50611a.createNativeModules(reactApplicationContext);
        C6496s.g(createNativeModules, "createNativeModules(...)");
        return createNativeModules;
    }

    public List createViewManagers(ReactApplicationContext reactApplicationContext) {
        C6496s.h(reactApplicationContext, "reactContext");
        List createViewManagers = this.f50611a.createViewManagers(reactApplicationContext);
        C6496s.g(createViewManagers, "createViewManagers(...)");
        return createViewManagers;
    }
}
