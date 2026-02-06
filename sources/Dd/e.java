package Dd;

import Sg.p;
import android.content.Context;
import android.support.v4.media.session.c;
import com.facebook.react.A;
import com.facebook.react.B;
import com.facebook.react.C3362h;
import com.facebook.react.O;
import com.facebook.react.V;
import com.facebook.react.bridge.JSBundleLoader;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.defaults.DefaultComponentsRegistry;
import com.facebook.react.defaults.DefaultTurboModuleManagerDelegate;
import com.facebook.react.fabric.ComponentFactory;
import com.facebook.react.fabric.ReactNativeConfig;
import com.facebook.react.runtime.BindingsInstaller;
import com.facebook.react.runtime.C3377f;
import com.facebook.react.runtime.JSCInstance;
import com.facebook.react.runtime.JSRuntimeFactory;
import com.facebook.react.runtime.ReactHostImpl;
import com.facebook.react.runtime.hermes.HermesInstance;
import io.branch.rnbranch.RNBranchModule;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    public static final e f50614a = new e();

    /* renamed from: b  reason: collision with root package name */
    private static A f50615b;

    public static final class b implements B {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ O f50622a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ boolean f50623b;

        b(O o10, boolean z10) {
            this.f50622a = o10;
            this.f50623b = z10;
        }

        public void a(ReactContext reactContext) {
            C6496s.h(reactContext, "context");
            Iterator it = ((m) this.f50622a).u().iterator();
            if (it.hasNext()) {
                c.a(it.next());
                throw null;
            }
        }
    }

    private e() {
    }

    public static final A a(Context context, O o10) {
        C6496s.h(context, "context");
        C6496s.h(o10, "reactNativeHost");
        if (o10 instanceof m) {
            if (f50615b == null) {
                m mVar = (m) o10;
                boolean f10 = mVar.f();
                a aVar = new a(new WeakReference(context), mVar, (BindingsInstaller) null, (ReactNativeConfig) null, (V.a) null, 28, (DefaultConstructorMarker) null);
                ComponentFactory componentFactory = new ComponentFactory();
                DefaultComponentsRegistry.register(componentFactory);
                Iterator it = mVar.u().iterator();
                if (!it.hasNext()) {
                    ReactHostImpl reactHostImpl = new ReactHostImpl(context, aVar, componentFactory, true, f10);
                    Iterator it2 = mVar.u().iterator();
                    if (!it2.hasNext()) {
                        reactHostImpl.j(new b(o10, f10));
                        f50615b = reactHostImpl;
                    } else {
                        c.a(it2.next());
                        reactHostImpl.f();
                        throw null;
                    }
                } else {
                    c.a(it.next());
                    throw null;
                }
            }
            A a10 = f50615b;
            C6496s.f(a10, "null cannot be cast to non-null type com.facebook.react.ReactHost");
            return a10;
        }
        throw new IllegalArgumentException("You can call createFromReactNativeHost only with instances of ReactNativeHostWrapper");
    }

    private static final class a implements C3377f {

        /* renamed from: a  reason: collision with root package name */
        private final WeakReference f50616a;

        /* renamed from: b  reason: collision with root package name */
        private final m f50617b;

        /* renamed from: c  reason: collision with root package name */
        private final BindingsInstaller f50618c;

        /* renamed from: d  reason: collision with root package name */
        private final ReactNativeConfig f50619d;

        /* renamed from: e  reason: collision with root package name */
        private final V.a f50620e;

        /* renamed from: f  reason: collision with root package name */
        private JSBundleLoader f50621f;

        public a(WeakReference weakReference, m mVar, BindingsInstaller bindingsInstaller, ReactNativeConfig reactNativeConfig, V.a aVar) {
            C6496s.h(weakReference, "weakContext");
            C6496s.h(mVar, "reactNativeHostWrapper");
            C6496s.h(reactNativeConfig, "reactNativeConfig");
            C6496s.h(aVar, "turboModuleManagerDelegateBuilder");
            this.f50616a = weakReference;
            this.f50617b = mVar;
            this.f50618c = bindingsInstaller;
            this.f50619d = reactNativeConfig;
            this.f50620e = aVar;
        }

        public JSRuntimeFactory a() {
            if (this.f50617b.getJSEngineResolutionAlgorithm() == C3362h.HERMES) {
                return new HermesInstance();
            }
            return new JSCInstance();
        }

        public ReactNativeConfig b() {
            return this.f50619d;
        }

        public JSBundleLoader c() {
            JSBundleLoader jSBundleLoader = this.f50621f;
            if (jSBundleLoader != null) {
                return jSBundleLoader;
            }
            Context context = (Context) this.f50616a.get();
            if (context != null) {
                String jSBundleFile = this.f50617b.getJSBundleFile();
                if (jSBundleFile == null) {
                    String bundleAssetName = this.f50617b.getBundleAssetName();
                    JSBundleLoader createAssetLoader = JSBundleLoader.createAssetLoader(context, "assets://" + bundleAssetName, true);
                    C6496s.g(createAssetLoader, "createAssetLoader(...)");
                    return createAssetLoader;
                } else if (p.J(jSBundleFile, "assets://", false, 2, (Object) null)) {
                    JSBundleLoader createAssetLoader2 = JSBundleLoader.createAssetLoader(context, jSBundleFile, true);
                    C6496s.g(createAssetLoader2, "createAssetLoader(...)");
                    return createAssetLoader2;
                } else {
                    JSBundleLoader createFileLoader = JSBundleLoader.createFileLoader(jSBundleFile);
                    C6496s.g(createFileLoader, "createFileLoader(...)");
                    return createFileLoader;
                }
            } else {
                throw new IllegalStateException("Unable to get concrete Context");
            }
        }

        public String d() {
            return this.f50617b.getJSMainModuleName();
        }

        public List e() {
            return this.f50617b.getPackages();
        }

        public void f(Exception exc) {
            C6496s.h(exc, RNBranchModule.NATIVE_INIT_SESSION_FINISHED_EVENT_ERROR);
            this.f50617b.f();
            Iterator it = this.f50617b.u().iterator();
            if (it.hasNext()) {
                c.a(it.next());
                throw null;
            }
        }

        public V.a g() {
            return this.f50620e;
        }

        public BindingsInstaller getBindingsInstaller() {
            return this.f50618c;
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ a(WeakReference weakReference, m mVar, BindingsInstaller bindingsInstaller, ReactNativeConfig reactNativeConfig, V.a aVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this(weakReference, mVar, (i10 & 4) != 0 ? null : bindingsInstaller, (i10 & 8) != 0 ? ReactNativeConfig.DEFAULT_CONFIG : reactNativeConfig, (i10 & 16) != 0 ? new DefaultTurboModuleManagerDelegate.a() : aVar);
        }
    }
}
