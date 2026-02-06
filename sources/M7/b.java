package M7;

import com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider;
import kotlin.jvm.internal.C6496s;
import yf.C6787a;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static final b f32633a = new b();

    /* renamed from: b  reason: collision with root package name */
    private static C6787a f32634b;

    /* renamed from: c  reason: collision with root package name */
    private static c f32635c;

    static {
        a aVar = new a();
        f32634b = aVar;
        f32635c = (c) aVar.invoke();
    }

    private b() {
    }

    /* access modifiers changed from: private */
    public static final d b() {
        return new d();
    }

    public static final boolean c() {
        return f32635c.completeReactInstanceCreationOnBgThreadOnAndroid();
    }

    public static final boolean d() {
        return f32635c.enableAndroidLineHeightCentering();
    }

    public static final boolean e() {
        return f32635c.enableBridgelessArchitecture();
    }

    public static final boolean f() {
        return f32635c.enableEagerRootViewAttachment();
    }

    public static final boolean g() {
        return f32635c.enableEventEmitterRetentionDuringGesturesOnAndroid();
    }

    public static final boolean h() {
        return f32635c.enableFabricLogs();
    }

    public static final boolean i() {
        return f32635c.enableFabricRenderer();
    }

    public static final boolean j() {
        return f32635c.enableFabricRendererExclusively();
    }

    public static final boolean k() {
        return f32635c.enableNewBackgroundAndBorderDrawables();
    }

    public static final boolean l() {
        return f32635c.enablePreciseSchedulingForPremountItemsOnAndroid();
    }

    public static final boolean m() {
        return f32635c.enableViewRecycling();
    }

    public static final boolean n() {
        return f32635c.initEagerTurboModulesOnNativeModulesQueueAndroid();
    }

    public static final boolean o() {
        return f32635c.lazyAnimationCallbacks();
    }

    public static final boolean p() {
        return f32635c.loadVectorDrawablesOnImages();
    }

    public static final void q(ReactNativeFeatureFlagsProvider reactNativeFeatureFlagsProvider) {
        C6496s.h(reactNativeFeatureFlagsProvider, "provider");
        f32635c.a(reactNativeFeatureFlagsProvider);
    }

    public static final boolean r() {
        return f32635c.useFabricInterop();
    }

    public static final boolean s() {
        return f32635c.useImmediateExecutorInAndroidBridgeless();
    }

    public static final boolean t() {
        return f32635c.useNativeViewConfigsInBridgelessMode();
    }

    public static final boolean u() {
        return f32635c.useOptimisedViewPreallocationOnAndroid();
    }

    public static final boolean v() {
        return f32635c.useOptimizedEventBatchingOnAndroid();
    }

    public static final boolean w() {
        return f32635c.useTurboModuleInterop();
    }

    public static final boolean x() {
        return f32635c.useTurboModules();
    }
}
