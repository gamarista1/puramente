package com.facebook.react.modules.fresco;

import M7.b;
import X6.C3091n;
import X6.C3096t;
import X6.C3097u;
import X7.c;
import X7.d;
import X7.e;
import a7.d;
import android.content.Context;
import com.facebook.react.bridge.LifecycleEventListener;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.modules.network.h;
import com.facebook.react.modules.network.i;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;
import j6.b;
import java.util.HashSet;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import rh.C6703A;
import rh.x;

@Q7.a(name = "FrescoModule", needsEagerInit = true)
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0011\b\u0017\u0018\u0000 #2\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0001$B)\b\u0007\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fB1\b\u0017\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0007¢\u0006\u0004\b\u000b\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0017\u0010\u0013J\u000f\u0010\u0018\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0018\u0010\u0013J\u000f\u0010\u0019\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0019\u0010\u0013J\u000f\u0010\u001a\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u001a\u0010\u0013J\u000f\u0010\u001b\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u001b\u0010\u0013R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u001cR\u0018\u0010\u001d\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0018\u0010\u001f\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0016\u0010\u000e\u001a\u0004\u0018\u00010\r8BX\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\"¨\u0006%"}, d2 = {"Lcom/facebook/react/modules/fresco/FrescoModule;", "Lcom/facebook/react/bridge/ReactContextBaseJavaModule;", "", "Lcom/facebook/react/bridge/LifecycleEventListener;", "Lcom/facebook/react/turbomodule/core/interfaces/TurboModule;", "Lcom/facebook/react/bridge/ReactApplicationContext;", "reactContext", "", "clearOnDestroy", "LX6/u;", "imagePipelineConfig", "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;ZLX6/u;)V", "LX6/t;", "imagePipeline", "hasBeenInitializedExternally", "(Lcom/facebook/react/bridge/ReactApplicationContext;LX6/t;ZZ)V", "Llf/M;", "initialize", "()V", "", "getName", "()Ljava/lang/String;", "clearSensitiveData", "onHostResume", "onHostPause", "onHostDestroy", "invalidate", "Z", "config", "LX6/u;", "pipeline", "LX6/t;", "getImagePipeline", "()LX6/t;", "Companion", "a", "ReactAndroid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public class FrescoModule extends ReactContextBaseJavaModule implements LifecycleEventListener, TurboModule {
    public static final a Companion = new a((DefaultConstructorMarker) null);
    public static final String NAME = "FrescoModule";
    /* access modifiers changed from: private */
    public static boolean hasBeenInitialized;
    private final boolean clearOnDestroy;
    private C3097u config;
    private C3096t pipeline;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* access modifiers changed from: private */
        public final C3097u b(ReactContext reactContext) {
            return c(reactContext).a();
        }

        public final C3097u.a c(ReactContext reactContext) {
            C6496s.h(reactContext, "context");
            HashSet hashSet = new HashSet();
            hashSet.add(new d());
            C6703A a10 = h.a();
            d.a aVar = new d.a();
            if (b.p()) {
                e.f35380a.c(aVar, reactContext);
            }
            i.a(a10).a(new x(new com.facebook.react.modules.network.e(reactContext)));
            Context applicationContext = reactContext.getApplicationContext();
            C6496s.g(applicationContext, "getApplicationContext(...)");
            C6496s.e(a10);
            return T6.a.a(applicationContext, a10).S(new c(a10)).R(aVar.d()).Q(C3091n.AUTO).T(hashSet);
        }

        public final boolean d() {
            return FrescoModule.hasBeenInitialized;
        }

        private a() {
        }
    }

    public FrescoModule(ReactApplicationContext reactApplicationContext) {
        this(reactApplicationContext, false, (C3097u) null, 6, (DefaultConstructorMarker) null);
    }

    public static final C3097u.a getDefaultConfigBuilder(ReactContext reactContext) {
        return Companion.c(reactContext);
    }

    private final C3096t getImagePipeline() {
        if (this.pipeline == null) {
            this.pipeline = j6.d.a();
        }
        return this.pipeline;
    }

    public static final boolean hasBeenInitialized() {
        return Companion.d();
    }

    public void clearSensitiveData() {
        C3096t imagePipeline = getImagePipeline();
        if (imagePipeline != null) {
            imagePipeline.c();
        }
    }

    public String getName() {
        return NAME;
    }

    public void initialize() {
        super.initialize();
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        reactApplicationContext.addLifecycleEventListener(this);
        a aVar = Companion;
        if (!aVar.d()) {
            C3097u uVar = this.config;
            if (uVar == null) {
                C6496s.e(reactApplicationContext);
                uVar = aVar.b(reactApplicationContext);
            }
            b.a e10 = j6.b.e();
            C6496s.g(e10, "newBuilder(...)");
            if (M7.b.p()) {
                e10.e(e.f35380a.d());
            }
            j6.d.e(reactApplicationContext.getApplicationContext(), uVar, e10.f());
            hasBeenInitialized = true;
        } else if (this.config != null) {
            U5.a.I("ReactNative", "Fresco has already been initialized with a different config. The new Fresco configuration will be ignored!");
        }
        this.config = null;
    }

    public void invalidate() {
        getReactApplicationContext().removeLifecycleEventListener(this);
        super.invalidate();
    }

    public void onHostDestroy() {
        C3096t imagePipeline;
        if (Companion.d() && this.clearOnDestroy && (imagePipeline = getImagePipeline()) != null) {
            imagePipeline.e();
        }
    }

    public void onHostPause() {
    }

    public void onHostResume() {
    }

    public FrescoModule(ReactApplicationContext reactApplicationContext, C3096t tVar) {
        this(reactApplicationContext, tVar, false, false, 12, (DefaultConstructorMarker) null);
    }

    public FrescoModule(ReactApplicationContext reactApplicationContext, C3096t tVar, boolean z10) {
        this(reactApplicationContext, tVar, z10, false, 8, (DefaultConstructorMarker) null);
    }

    public FrescoModule(ReactApplicationContext reactApplicationContext, boolean z10) {
        this(reactApplicationContext, z10, (C3097u) null, 4, (DefaultConstructorMarker) null);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ FrescoModule(ReactApplicationContext reactApplicationContext, boolean z10, C3097u uVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(reactApplicationContext, (i10 & 2) != 0 ? true : z10, (i10 & 4) != 0 ? null : uVar);
    }

    public FrescoModule(ReactApplicationContext reactApplicationContext, boolean z10, C3097u uVar) {
        super(reactApplicationContext);
        this.clearOnDestroy = z10;
        this.config = uVar;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ FrescoModule(ReactApplicationContext reactApplicationContext, C3096t tVar, boolean z10, boolean z11, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(reactApplicationContext, tVar, (i10 & 4) != 0 ? true : z10, (i10 & 8) != 0 ? false : z11);
    }

    public FrescoModule(ReactApplicationContext reactApplicationContext, C3096t tVar, boolean z10, boolean z11) {
        this(reactApplicationContext, z10, (C3097u) null, 4, (DefaultConstructorMarker) null);
        this.pipeline = tVar;
        if (z11) {
            hasBeenInitialized = true;
        }
    }
}
