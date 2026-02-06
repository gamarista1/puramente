package Dd;

import C7.j;
import I7.i;
import Pd.h;
import Rg.k;
import android.app.Application;
import android.content.Context;
import android.support.v4.media.session.c;
import com.facebook.react.A;
import com.facebook.react.C3362h;
import com.facebook.react.O;
import com.facebook.react.V;
import com.facebook.react.bridge.UIManagerProvider;
import com.facebook.react.devsupport.I;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mf.C6565s;

public final class m extends r {

    /* renamed from: f  reason: collision with root package name */
    public static final a f50643f = new a((DefaultConstructorMarker) null);

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final A a(Context context, O o10) {
            C6496s.h(context, "context");
            C6496s.h(o10, "reactNativeHost");
            return e.a(context, o10);
        }

        private a() {
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public m(Application application, O o10) {
        super(application, o10);
        C6496s.h(application, "application");
        C6496s.h(o10, "host");
    }

    /* access modifiers changed from: private */
    public static final Object z(h hVar) {
        return hVar.f();
    }

    public boolean d() {
        return r().d();
    }

    public j e() {
        j e10 = r().e();
        C6496s.g(e10, "getSurfaceDelegateFactory(...)");
        return e10;
    }

    /* access modifiers changed from: protected */
    public I getDevSupportManagerFactory() {
        I i10 = (I) k.r(k.y(C6565s.b0(u()), new l()));
        if (i10 == null) {
            return (I) x("getDevSupportManagerFactory");
        }
        return i10;
    }

    public C3362h getJSEngineResolutionAlgorithm() {
        return (C3362h) x("getJSEngineResolutionAlgorithm");
    }

    /* access modifiers changed from: protected */
    public V.a getReactPackageTurboModuleManagerDelegateBuilder() {
        return (V.a) x("getReactPackageTurboModuleManagerDelegateBuilder");
    }

    /* access modifiers changed from: protected */
    public i getRedBoxHandler() {
        c.a(x("getRedBoxHandler"));
        return null;
    }

    /* access modifiers changed from: protected */
    public UIManagerProvider getUIManagerProvider() {
        return (UIManagerProvider) x("getUIManagerProvider");
    }
}
