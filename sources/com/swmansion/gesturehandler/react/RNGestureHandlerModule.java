package com.swmansion.gesturehandler.react;

import android.util.Log;
import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import com.facebook.react.bridge.JavaScriptContextHolder;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.soloader.SoLoader;
import com.swmansion.gesturehandler.NativeRNGestureHandlerModuleSpec;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lf.C6514M;
import td.C5217a;
import vd.C5260d;

@Q7.a(name = "RNGestureHandlerModule")
@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0005\b\u0007\u0018\u0000 I2\u00020\u00012\u00020\u0002:\u0001JB\u0011\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J1\u0010\u0010\u001a\u00020\u000f\"\b\b\u0000\u0010\b*\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J)\u0010\u0012\u001a\u00020\u000f\"\b\b\u0000\u0010\b*\u00020\u00072\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0018\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\u0014H ¢\u0006\u0004\b\u0016\u0010\u0017J\u0019\u0010\u001a\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u0018\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\tH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ'\u0010 \u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u000e\u001a\u00020\rH\u0017¢\u0006\u0004\b \u0010!J'\u0010$\u001a\u00020\u000f2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\"\u001a\u00020\u001e2\u0006\u0010#\u001a\u00020\u001eH\u0017¢\u0006\u0004\b$\u0010%J\u001f\u0010&\u001a\u00020\u000f2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u000e\u001a\u00020\rH\u0017¢\u0006\u0004\b&\u0010'J\u0017\u0010(\u001a\u00020\u000f2\u0006\u0010\u001f\u001a\u00020\u001eH\u0017¢\u0006\u0004\b(\u0010)J\u001f\u0010,\u001a\u00020\u000f2\u0006\u0010\"\u001a\u00020\u001e2\u0006\u0010+\u001a\u00020*H\u0017¢\u0006\u0004\b,\u0010-J\u000f\u0010.\u001a\u00020\u000fH\u0017¢\u0006\u0004\b.\u0010/J\u000f\u00100\u001a\u00020\u000fH\u0017¢\u0006\u0004\b0\u0010/J\u001f\u00102\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u00101\u001a\u00020\u000bH\u0016¢\u0006\u0004\b2\u00103J\u000f\u00104\u001a\u00020*H\u0017¢\u0006\u0004\b4\u00105J\u000f\u00106\u001a\u00020\u000fH\u0016¢\u0006\u0004\b6\u0010/J\u0015\u00108\u001a\u00020\u000f2\u0006\u00107\u001a\u00020\u0019¢\u0006\u0004\b8\u00109J\u0015\u0010:\u001a\u00020\u000f2\u0006\u00107\u001a\u00020\u0019¢\u0006\u0004\b:\u00109R\u0017\u0010<\u001a\u00020;8\u0006¢\u0006\f\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?R\u0014\u0010A\u001a\u00020@8\u0002X\u0004¢\u0006\u0006\n\u0004\bA\u0010BR\u0014\u0010D\u001a\u00020C8\u0002X\u0004¢\u0006\u0006\n\u0004\bD\u0010ER\u001a\u0010G\u001a\b\u0012\u0004\u0012\u00020\u00190F8\u0002X\u0004¢\u0006\u0006\n\u0004\bG\u0010H¨\u0006K"}, d2 = {"Lcom/swmansion/gesturehandler/react/RNGestureHandlerModule;", "Lcom/swmansion/gesturehandler/NativeRNGestureHandlerModuleSpec;", "Ltd/a;", "Lcom/facebook/react/bridge/ReactApplicationContext;", "reactContext", "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "Lvd/d;", "T", "", "handlerName", "", "handlerTag", "Lcom/facebook/react/bridge/ReadableMap;", "config", "Llf/M;", "createGestureHandlerHelper", "(Ljava/lang/String;ILcom/facebook/react/bridge/ReadableMap;)V", "updateGestureHandlerHelper", "(ILcom/facebook/react/bridge/ReadableMap;)V", "", "jsiPtr", "decorateRuntime", "(J)V", "viewTag", "Lcom/swmansion/gesturehandler/react/k;", "findRootHelperForViewAncestor", "(I)Lcom/swmansion/gesturehandler/react/k;", "getName", "()Ljava/lang/String;", "", "handlerTagDouble", "createGestureHandler", "(Ljava/lang/String;DLcom/facebook/react/bridge/ReadableMap;)V", "viewTagDouble", "actionTypeDouble", "attachGestureHandler", "(DDD)V", "updateGestureHandler", "(DLcom/facebook/react/bridge/ReadableMap;)V", "dropGestureHandler", "(D)V", "", "blockNativeResponder", "handleSetJSResponder", "(DZ)V", "handleClearJSResponder", "()V", "flushOperations", "newState", "setGestureHandlerState", "(II)V", "install", "()Z", "invalidate", "root", "registerRootHelper", "(Lcom/swmansion/gesturehandler/react/k;)V", "unregisterRootHelper", "Lcom/swmansion/gesturehandler/react/i;", "registry", "Lcom/swmansion/gesturehandler/react/i;", "getRegistry", "()Lcom/swmansion/gesturehandler/react/i;", "Lcom/swmansion/gesturehandler/react/d;", "eventDispatcher", "Lcom/swmansion/gesturehandler/react/d;", "Lcom/swmansion/gesturehandler/react/f;", "interactionManager", "Lcom/swmansion/gesturehandler/react/f;", "", "roots", "Ljava/util/List;", "Companion", "a", "react-native-gesture-handler_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class RNGestureHandlerModule extends NativeRNGestureHandlerModuleSpec implements C5217a {
    public static final a Companion = new a((DefaultConstructorMarker) null);
    public static final String NAME = "RNGestureHandlerModule";
    private final d eventDispatcher;
    private final f interactionManager;
    private final i registry = new i();
    private final List<k> roots;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public RNGestureHandlerModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        ReactApplicationContext reactApplicationContext2 = getReactApplicationContext();
        C6496s.g(reactApplicationContext2, "getReactApplicationContext(...)");
        this.eventDispatcher = new d(reactApplicationContext2);
        this.interactionManager = new f();
        this.roots = new ArrayList();
    }

    private final <T extends C5260d> void createGestureHandlerHelper(String str, int i10, ReadableMap readableMap) {
        if (this.registry.h(i10) == null) {
            C5260d.c b10 = e.f59582a.b(str);
            if (b10 != null) {
                C5260d b11 = b10.b(getReactApplicationContext(), i10);
                b11.E0(this.eventDispatcher);
                this.registry.j(b11);
                this.interactionManager.e(b11, readableMap);
                b10.f(b11, readableMap);
                return;
            }
            throw new JSApplicationIllegalArgumentException("Invalid handler name " + str);
        }
        throw new IllegalStateException("Handler with tag " + i10 + " already exists. Please ensure that no Gesture instance is used across multiple GestureDetectors.");
    }

    private final native void decorateRuntime(long j10);

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: com.swmansion.gesturehandler.react.k} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: com.swmansion.gesturehandler.react.k} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v1, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v0, resolved type: com.swmansion.gesturehandler.react.k} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v4, resolved type: com.swmansion.gesturehandler.react.k} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final com.swmansion.gesturehandler.react.k findRootHelperForViewAncestor(int r7) {
        /*
            r6 = this;
            com.facebook.react.bridge.ReactApplicationContext r0 = r6.getReactApplicationContext()
            java.lang.String r1 = "getReactApplicationContext(...)"
            kotlin.jvm.internal.C6496s.g(r0, r1)
            com.facebook.react.uimanager.UIManagerModule r0 = com.swmansion.gesturehandler.react.a.b(r0)
            int r7 = r0.resolveRootTagFromReactTag(r7)
            r0 = 1
            r1 = 0
            if (r7 >= r0) goto L_0x0016
            return r1
        L_0x0016:
            java.util.List<com.swmansion.gesturehandler.react.k> r0 = r6.roots
            monitor-enter(r0)
            java.util.List<com.swmansion.gesturehandler.react.k> r2 = r6.roots     // Catch:{ all -> 0x0044 }
            java.lang.Iterable r2 = (java.lang.Iterable) r2     // Catch:{ all -> 0x0044 }
            java.util.Iterator r2 = r2.iterator()     // Catch:{ all -> 0x0044 }
        L_0x0021:
            boolean r3 = r2.hasNext()     // Catch:{ all -> 0x0044 }
            if (r3 == 0) goto L_0x0046
            java.lang.Object r3 = r2.next()     // Catch:{ all -> 0x0044 }
            r4 = r3
            com.swmansion.gesturehandler.react.k r4 = (com.swmansion.gesturehandler.react.k) r4     // Catch:{ all -> 0x0044 }
            android.view.ViewGroup r5 = r4.f()     // Catch:{ all -> 0x0044 }
            boolean r5 = r5 instanceof com.facebook.react.Z     // Catch:{ all -> 0x0044 }
            if (r5 == 0) goto L_0x0021
            android.view.ViewGroup r4 = r4.f()     // Catch:{ all -> 0x0044 }
            com.facebook.react.Z r4 = (com.facebook.react.Z) r4     // Catch:{ all -> 0x0044 }
            int r4 = r4.getRootViewTag()     // Catch:{ all -> 0x0044 }
            if (r4 != r7) goto L_0x0021
            r1 = r3
            goto L_0x0046
        L_0x0044:
            r7 = move-exception
            goto L_0x004a
        L_0x0046:
            com.swmansion.gesturehandler.react.k r1 = (com.swmansion.gesturehandler.react.k) r1     // Catch:{ all -> 0x0044 }
            monitor-exit(r0)
            return r1
        L_0x004a:
            monitor-exit(r0)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.swmansion.gesturehandler.react.RNGestureHandlerModule.findRootHelperForViewAncestor(int):com.swmansion.gesturehandler.react.k");
    }

    /* access modifiers changed from: private */
    public static final void install$lambda$1(RNGestureHandlerModule rNGestureHandlerModule) {
        try {
            SoLoader.t("gesturehandler");
            JavaScriptContextHolder javaScriptContextHolder = rNGestureHandlerModule.getReactApplicationContext().getJavaScriptContextHolder();
            C6496s.e(javaScriptContextHolder);
            rNGestureHandlerModule.decorateRuntime(javaScriptContextHolder.get());
        } catch (Exception unused) {
            Log.w("[RNGestureHandler]", "Could not install JSI bindings.");
        }
    }

    private final <T extends C5260d> void updateGestureHandlerHelper(int i10, ReadableMap readableMap) {
        C5260d.c a10;
        C5260d h10 = this.registry.h(i10);
        if (h10 != null && (a10 = e.f59582a.a(h10)) != null) {
            this.interactionManager.g(i10);
            this.interactionManager.e(h10, readableMap);
            a10.f(h10, readableMap);
        }
    }

    @ReactMethod
    public void attachGestureHandler(double d10, double d11, double d12) {
        int i10 = (int) d10;
        if (!this.registry.c(i10, (int) d11, (int) d12)) {
            throw new JSApplicationIllegalArgumentException("Handler with tag " + i10 + " does not exists");
        }
    }

    @ReactMethod
    public void createGestureHandler(String str, double d10, ReadableMap readableMap) {
        C6496s.h(str, "handlerName");
        C6496s.h(readableMap, "config");
        createGestureHandlerHelper(str, (int) d10, readableMap);
    }

    @ReactMethod
    public void dropGestureHandler(double d10) {
        int i10 = (int) d10;
        this.interactionManager.g(i10);
        this.registry.g(i10);
    }

    @ReactMethod
    public void flushOperations() {
    }

    public String getName() {
        return "RNGestureHandlerModule";
    }

    public final i getRegistry() {
        return this.registry;
    }

    @ReactMethod
    public void handleClearJSResponder() {
    }

    @ReactMethod
    public void handleSetJSResponder(double d10, boolean z10) {
        int i10 = (int) d10;
        k findRootHelperForViewAncestor = findRootHelperForViewAncestor(i10);
        if (findRootHelperForViewAncestor != null) {
            findRootHelperForViewAncestor.g(i10, z10);
        }
    }

    @ReactMethod(isBlockingSynchronousMethod = true)
    public boolean install() {
        getReactApplicationContext().runOnJSQueueThread(new g(this));
        return true;
    }

    public void invalidate() {
        this.registry.f();
        this.interactionManager.h();
        synchronized (this.roots) {
            while (!this.roots.isEmpty()) {
                try {
                    this.roots.size();
                    this.roots.get(0).j();
                    this.roots.size();
                } finally {
                }
            }
            C6514M m10 = C6514M.f71813a;
        }
        super.invalidate();
    }

    public final void registerRootHelper(k kVar) {
        C6496s.h(kVar, "root");
        synchronized (this.roots) {
            this.roots.contains(kVar);
            this.roots.add(kVar);
        }
    }

    public void setGestureHandlerState(int i10, int i11) {
        C5260d h10 = this.registry.h(i10);
        if (h10 == null) {
            return;
        }
        if (i11 == 1) {
            h10.D();
        } else if (i11 == 2) {
            h10.p();
        } else if (i11 == 3) {
            h10.q();
        } else if (i11 == 4) {
            h10.l(true);
        } else if (i11 == 5) {
            h10.B();
        }
    }

    public final void unregisterRootHelper(k kVar) {
        C6496s.h(kVar, "root");
        synchronized (this.roots) {
            this.roots.remove(kVar);
        }
    }

    @ReactMethod
    public void updateGestureHandler(double d10, ReadableMap readableMap) {
        C6496s.h(readableMap, "config");
        updateGestureHandlerHelper((int) d10, readableMap);
    }
}
