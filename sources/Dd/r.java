package Dd;

import Pd.f;
import Pd.h;
import Rg.k;
import android.app.Application;
import android.support.v4.media.session.c;
import androidx.collection.C1587a;
import com.facebook.react.B;
import com.facebook.react.J;
import com.facebook.react.O;
import com.facebook.react.bridge.JavaScriptExecutorFactory;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.defaults.d;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.C6496s;
import mf.C6565s;

public abstract class r extends d {

    /* renamed from: c  reason: collision with root package name */
    private final O f50646c;

    /* renamed from: d  reason: collision with root package name */
    private final List f50647d;

    /* renamed from: e  reason: collision with root package name */
    private final C1587a f50648e;

    public static final class a implements B {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ r f50649a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ boolean f50650b;

        a(r rVar, boolean z10) {
            this.f50649a = rVar;
            this.f50650b = z10;
        }

        public void a(ReactContext reactContext) {
            C6496s.h(reactContext, "context");
            Iterator it = this.f50649a.u().iterator();
            if (it.hasNext()) {
                c.a(it.next());
                throw null;
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public r(Application application, O o10) {
        super(application);
        C6496s.h(application, "application");
        C6496s.h(o10, "host");
        this.f50646c = o10;
        ArrayList arrayList = new ArrayList();
        for (f a10 : c.f50609b.a()) {
            List a11 = a10.a(application);
            C6496s.g(a11, "createReactNativeHostHandlers(...)");
            C6565s.D(arrayList, a11);
        }
        this.f50647d = arrayList;
        this.f50648e = new C1587a();
    }

    /* access modifiers changed from: private */
    public static final String q(r rVar, h hVar) {
        return hVar.c(rVar.f());
    }

    /* access modifiers changed from: private */
    public static final String s(r rVar, h hVar) {
        return hVar.d(rVar.f());
    }

    /* access modifiers changed from: private */
    public static final JavaScriptExecutorFactory t(h hVar) {
        return hVar.b();
    }

    /* access modifiers changed from: private */
    public static final Boolean v(h hVar) {
        return hVar.e();
    }

    private final void w(J j10) {
        Field declaredField = O.class.getDeclaredField("b");
        declaredField.setAccessible(true);
        declaredField.set(this.f50646c, j10);
    }

    /* access modifiers changed from: protected */
    public J createReactInstanceManager() {
        boolean f10 = f();
        Iterator it = this.f50647d.iterator();
        if (!it.hasNext()) {
            J createReactInstanceManager = super.createReactInstanceManager();
            Iterator it2 = this.f50647d.iterator();
            if (!it2.hasNext()) {
                createReactInstanceManager.s(new a(this, f10));
                C6496s.e(createReactInstanceManager);
                w(createReactInstanceManager);
                return createReactInstanceManager;
            }
            c.a(it2.next());
            createReactInstanceManager.E();
            throw null;
        }
        c.a(it.next());
        throw null;
    }

    public boolean f() {
        Boolean bool = (Boolean) k.r(k.y(C6565s.b0(this.f50647d), new n()));
        if (bool != null) {
            return bool.booleanValue();
        }
        return this.f50646c.f();
    }

    public String getBundleAssetName() {
        String str = (String) k.r(k.y(C6565s.b0(this.f50647d), new q(this)));
        if (str == null) {
            return (String) x("getBundleAssetName");
        }
        return str;
    }

    public String getJSBundleFile() {
        String str = (String) k.r(k.y(C6565s.b0(this.f50647d), new o(this)));
        if (str == null) {
            return (String) x("getJSBundleFile");
        }
        return str;
    }

    public String getJSMainModuleName() {
        return (String) x("getJSMainModuleName");
    }

    /* access modifiers changed from: protected */
    public JavaScriptExecutorFactory getJavaScriptExecutorFactory() {
        JavaScriptExecutorFactory javaScriptExecutorFactory = (JavaScriptExecutorFactory) k.r(k.y(C6565s.b0(this.f50647d), new p()));
        if (javaScriptExecutorFactory == null) {
            return (JavaScriptExecutorFactory) x("getJavaScriptExecutorFactory");
        }
        return javaScriptExecutorFactory;
    }

    public List getPackages() {
        return (List) x("getPackages");
    }

    /* access modifiers changed from: protected */
    public final O r() {
        return this.f50646c;
    }

    public final List u() {
        return this.f50647d;
    }

    public final Object x(String str) {
        C6496s.h(str, "name");
        Method method = (Method) this.f50648e.get(str);
        if (method == null) {
            method = O.class.getDeclaredMethod(str, (Class[]) null);
            method.setAccessible(true);
            this.f50648e.put(str, method);
        }
        C6496s.e(method);
        return method.invoke(this.f50646c, (Object[]) null);
    }
}
