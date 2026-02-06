package ae;

import D3.a;
import com.facebook.react.bridge.JavaScriptContextHolder;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.RuntimeExecutor;
import com.facebook.react.turbomodule.core.CallInvokerHolderImpl;
import com.facebook.react.turbomodule.core.interfaces.CallInvokerHolder;
import expo.modules.kotlin.jni.JNIDeallocator;
import expo.modules.kotlin.jni.JSIContext;
import fe.C4991a;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lf.C6514M;
import oe.b;
import oe.d;

public final class u {

    /* renamed from: a  reason: collision with root package name */
    private final WeakReference f53648a;

    /* renamed from: b  reason: collision with root package name */
    private final WeakReference f53649b;

    /* renamed from: c  reason: collision with root package name */
    private final n f53650c = new n(w.a(this));

    /* renamed from: d  reason: collision with root package name */
    public JSIContext f53651d;

    /* renamed from: e  reason: collision with root package name */
    private final m f53652e;

    /* renamed from: f  reason: collision with root package name */
    private final JNIDeallocator f53653f;

    /* renamed from: g  reason: collision with root package name */
    private final d f53654g;

    /* renamed from: h  reason: collision with root package name */
    private final b f53655h;

    public u(C4464a aVar, WeakReference weakReference) {
        C6496s.h(aVar, "appContext");
        C6496s.h(weakReference, "reactContextHolder");
        this.f53648a = weakReference;
        this.f53649b = w.a(aVar);
        C4991a aVar2 = new C4991a();
        aVar2.j(this);
        this.f53652e = new m(aVar2);
        this.f53653f = new JNIDeallocator(false, 1, (DefaultConstructorMarker) null);
        this.f53654g = new d(this);
        this.f53655h = new b();
    }

    private final boolean k() {
        if (this.f53651d != null) {
            return true;
        }
        return false;
    }

    public final void a() {
        ((C4991a) this.f53652e.g()).j((u) null);
        this.f53653f.f();
    }

    public final C4464a b() {
        return (C4464a) this.f53649b.get();
    }

    public final b c() {
        return this.f53655h;
    }

    public final m d() {
        return this.f53652e;
    }

    public final JNIDeallocator e() {
        return this.f53653f;
    }

    public final JSIContext f() {
        JSIContext jSIContext = this.f53651d;
        if (jSIContext != null) {
            return jSIContext;
        }
        C6496s.v("jsiContext");
        return null;
    }

    public final WeakReference g() {
        return this.f53648a;
    }

    public final n h() {
        return this.f53650c;
    }

    public final d i() {
        return this.f53654g;
    }

    public final void j() {
        synchronized (this) {
            if (k()) {
                Rd.d.g(C4466c.a(), "⚠️ JSI interop was already installed", (Throwable) null, 2, (Object) null);
                return;
            }
            a.c("[" + "ExpoModulesCore" + "] " + (this + ".installJSIContext"));
            try {
                l(new JSIContext());
                ReactApplicationContext reactApplicationContext = (ReactApplicationContext) g().get();
                if (reactApplicationContext != null) {
                    JavaScriptContextHolder javaScriptContextHolder = reactApplicationContext.getJavaScriptContextHolder();
                    if (javaScriptContextHolder != null) {
                        Long valueOf = Long.valueOf(javaScriptContextHolder.get());
                        if (valueOf.longValue() == 0) {
                            valueOf = null;
                        }
                        if (valueOf == null) {
                            Rd.d.b(C4466c.a(), "❌ Cannot install JSI interop - JS runtime pointer is null", (Throwable) null, 2, (Object) null);
                        } else {
                            long longValue = valueOf.longValue();
                            if (reactApplicationContext.isBridgeless()) {
                                JSIContext f10 = f();
                                RuntimeExecutor runtimeExecutor = reactApplicationContext.getCatalystInstance().getRuntimeExecutor();
                                C6496s.e(runtimeExecutor);
                                f10.n(this, longValue, runtimeExecutor);
                            } else {
                                JSIContext f11 = f();
                                CallInvokerHolder jSCallInvokerHolder = reactApplicationContext.getCatalystInstance().getJSCallInvokerHolder();
                                C6496s.f(jSCallInvokerHolder, "null cannot be cast to non-null type com.facebook.react.turbomodule.core.CallInvokerHolderImpl");
                                f11.f(this, longValue, (CallInvokerHolderImpl) jSCallInvokerHolder);
                            }
                            C4466c.a().c("✅ JSI interop was installed");
                        }
                    }
                }
            } catch (Throwable th2) {
                a.f();
                throw th2;
            }
            C6514M m10 = C6514M.f71813a;
            a.f();
        }
    }

    public final void l(JSIContext jSIContext) {
        C6496s.h(jSIContext, "<set-?>");
        this.f53651d = jSIContext;
    }
}
