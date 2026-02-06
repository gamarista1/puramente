package com.facebook.react.uimanager;

import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import android.view.View;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.GuardedRunnable;
import com.facebook.react.bridge.LifecycleEventListener;
import com.facebook.react.bridge.OnBatchCompleteListener;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMarker;
import com.facebook.react.bridge.ReactMarkerConstants;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableType;
import com.facebook.react.bridge.UIManager;
import com.facebook.react.bridge.UIManagerListener;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.EventDispatcher;
import com.facebook.react.uimanager.events.RCTEventEmitter;
import f8.C3519a;
import g6.C3538a;
import g8.C3540a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import z8.C4236a;
import z8.C4237b;

@Q7.a(name = "UIManager")
public class UIManagerModule extends ReactContextBaseJavaModule implements OnBatchCompleteListener, LifecycleEventListener, UIManager {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final boolean DEBUG = f6.c.a().a(C3538a.f43661g);
    public static final String NAME = "UIManager";
    public static final String TAG = "UIManagerModule";
    private int mBatchId = 0;
    private final Map<String, Object> mCustomDirectEvents;
    private final EventDispatcher mEventDispatcher;
    private final List<r0> mListeners = new ArrayList();
    private final e mMemoryTrimCallback = new e();
    private final Map<String, Object> mModuleConstants;
    /* access modifiers changed from: private */
    public final m0 mUIImplementation;
    private final CopyOnWriteArrayList<UIManagerListener> mUIManagerListeners = new CopyOnWriteArrayList<>();
    private final B0 mViewManagerRegistry;

    class a implements d {
        a() {
        }

        public String a(String str) {
            return UIManagerModule.this.resolveCustomDirectEventName(str);
        }
    }

    class b extends GuardedRunnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ int f41553a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Object f41554b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(ReactContext reactContext, int i10, Object obj) {
            super(reactContext);
            this.f41553a = i10;
            this.f41554b = obj;
        }

        public void runGuarded() {
            UIManagerModule.this.mUIImplementation.U(this.f41553a, this.f41554b);
        }
    }

    class c extends GuardedRunnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ int f41556a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f41557b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f41558c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(ReactContext reactContext, int i10, int i11, int i12) {
            super(reactContext);
            this.f41556a = i10;
            this.f41557b = i11;
            this.f41558c = i12;
        }

        public void runGuarded() {
            UIManagerModule.this.mUIImplementation.Y(this.f41556a, this.f41557b, this.f41558c);
            UIManagerModule.this.mUIImplementation.m(-1);
        }
    }

    public interface d {
        String a(String str);
    }

    private static class e implements ComponentCallbacks2 {
        public void onConfigurationChanged(Configuration configuration) {
        }

        public void onLowMemory() {
        }

        public void onTrimMemory(int i10) {
            if (i10 >= 60) {
                H0.b().c();
            }
        }

        private e() {
        }
    }

    public UIManagerModule(ReactApplicationContext reactApplicationContext, C0 c02, int i10) {
        super(reactApplicationContext);
        C3408e.g(reactApplicationContext);
        com.facebook.react.uimanager.events.e eVar = new com.facebook.react.uimanager.events.e(reactApplicationContext);
        this.mEventDispatcher = eVar;
        this.mModuleConstants = createConstants(c02);
        this.mCustomDirectEvents = p0.c();
        B0 b02 = new B0(c02);
        this.mViewManagerRegistry = b02;
        this.mUIImplementation = new m0(reactApplicationContext, b02, (EventDispatcher) eVar, i10);
        reactApplicationContext.addLifecycleEventListener(this);
    }

    private static Map<String, Object> createConstants(C0 c02) {
        ReactMarker.logMarker(ReactMarkerConstants.CREATE_UI_MANAGER_MODULE_CONSTANTS_START);
        C4237b.a(0, "CreateUIManagerConstants").b("Lazy", Boolean.TRUE).c();
        try {
            return q0.a(c02);
        } finally {
            C4236a.i(0);
            ReactMarker.logMarker(ReactMarkerConstants.CREATE_UI_MANAGER_MODULE_CONSTANTS_END);
        }
    }

    public <T extends View> int addRootView(T t10) {
        return addRootView(t10, (WritableMap) null);
    }

    public void addUIBlock(l0 l0Var) {
        this.mUIImplementation.a(l0Var);
    }

    public void addUIManagerEventListener(UIManagerListener uIManagerListener) {
        this.mUIManagerListeners.add(uIManagerListener);
    }

    @Deprecated
    public void addUIManagerListener(r0 r0Var) {
        this.mListeners.add(r0Var);
    }

    @ReactMethod
    public void clearJSResponder() {
        this.mUIImplementation.f();
    }

    @ReactMethod
    public void configureNextLayoutAnimation(ReadableMap readableMap, Callback callback, Callback callback2) {
        this.mUIImplementation.g(readableMap, callback);
    }

    @ReactMethod
    public void createView(int i10, String str, int i11, ReadableMap readableMap) {
        if (DEBUG) {
            String str2 = "(UIManager.createView) tag: " + i10 + ", class: " + str + ", props: " + readableMap;
            U5.a.b("ReactNative", str2);
            f6.c.a().c(C3538a.f43661g, str2);
        }
        this.mUIImplementation.j(i10, str, i11, readableMap);
    }

    @Deprecated
    public void dispatchCommand(int i10, int i11, ReadableArray readableArray) {
        this.mUIImplementation.k(i10, i11, readableArray);
    }

    @ReactMethod
    public void dispatchViewManagerCommand(int i10, Dynamic dynamic, ReadableArray readableArray) {
        UIManager g10 = n0.g(getReactApplicationContext(), C3519a.a(i10));
        if (g10 != null) {
            if (dynamic.getType() == ReadableType.Number) {
                g10.dispatchCommand(i10, dynamic.asInt(), readableArray);
            } else if (dynamic.getType() == ReadableType.String) {
                g10.dispatchCommand(i10, dynamic.asString(), readableArray);
            }
        }
    }

    @ReactMethod
    public void findSubviewIn(int i10, ReadableArray readableArray, Callback callback) {
        this.mUIImplementation.o(i10, (float) Math.round(G.g(readableArray.getDouble(0))), (float) Math.round(G.g(readableArray.getDouble(1))), callback);
    }

    public Map<String, Object> getConstants() {
        return this.mModuleConstants;
    }

    @ReactMethod(isBlockingSynchronousMethod = true)
    public WritableMap getConstantsForViewManager(String str) {
        ViewManager O10 = this.mUIImplementation.O(str);
        if (O10 == null) {
            return null;
        }
        return getConstantsForViewManager(O10, this.mCustomDirectEvents);
    }

    @ReactMethod(isBlockingSynchronousMethod = true)
    public WritableMap getDefaultEventTypes() {
        return Arguments.makeNativeMap((Map<String, Object>) q0.d());
    }

    @Deprecated
    public d getDirectEventNamesResolver() {
        return new a();
    }

    public EventDispatcher getEventDispatcher() {
        return this.mEventDispatcher;
    }

    public String getName() {
        return NAME;
    }

    public Map<String, Long> getPerformanceCounters() {
        return this.mUIImplementation.p();
    }

    @Deprecated
    public m0 getUIImplementation() {
        return this.mUIImplementation;
    }

    @Deprecated
    public B0 getViewManagerRegistry_DO_NOT_USE() {
        return this.mViewManagerRegistry;
    }

    public void initialize() {
        getReactApplicationContext().registerComponentCallbacks(this.mMemoryTrimCallback);
        getReactApplicationContext().registerComponentCallbacks(this.mViewManagerRegistry);
        this.mEventDispatcher.a(1, (RCTEventEmitter) getReactApplicationContext().getJSModule(RCTEventEmitter.class));
    }

    public void invalidate() {
        super.invalidate();
        this.mEventDispatcher.d();
        this.mUIImplementation.B();
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        reactApplicationContext.unregisterComponentCallbacks(this.mMemoryTrimCallback);
        reactApplicationContext.unregisterComponentCallbacks(this.mViewManagerRegistry);
        H0.b().c();
        x0.a();
    }

    public void invalidateNodeLayout(int i10) {
        U N10 = this.mUIImplementation.N(i10);
        if (N10 == null) {
            U5.a.I("ReactNative", "Warning : attempted to dirty a non-existent react shadow node. reactTag=" + i10);
            return;
        }
        N10.dirty();
        this.mUIImplementation.m(-1);
    }

    @ReactMethod
    public void manageChildren(int i10, ReadableArray readableArray, ReadableArray readableArray2, ReadableArray readableArray3, ReadableArray readableArray4, ReadableArray readableArray5) {
        if (DEBUG) {
            String str = "(UIManager.manageChildren) tag: " + i10 + ", moveFrom: " + readableArray + ", moveTo: " + readableArray2 + ", addTags: " + readableArray3 + ", atIndices: " + readableArray4 + ", removeFrom: " + readableArray5;
            U5.a.b("ReactNative", str);
            f6.c.a().c(C3538a.f43661g, str);
        }
        this.mUIImplementation.u(i10, readableArray, readableArray2, readableArray3, readableArray4, readableArray5);
    }

    public void markActiveTouchForTag(int i10, int i11) {
    }

    @ReactMethod
    public void measure(int i10, Callback callback) {
        this.mUIImplementation.v(i10, callback);
    }

    @ReactMethod
    public void measureInWindow(int i10, Callback callback) {
        this.mUIImplementation.w(i10, callback);
    }

    @ReactMethod
    public void measureLayout(int i10, int i11, Callback callback, Callback callback2) {
        this.mUIImplementation.x(i10, i11, callback, callback2);
    }

    public void onBatchComplete() {
        int i10 = this.mBatchId;
        this.mBatchId = i10 + 1;
        C4237b.a(0, "onBatchCompleteUI").a("BatchId", i10).c();
        for (r0 willDispatchViewUpdates : this.mListeners) {
            willDispatchViewUpdates.willDispatchViewUpdates(this);
        }
        Iterator<UIManagerListener> it = this.mUIManagerListeners.iterator();
        while (it.hasNext()) {
            it.next().willDispatchViewUpdates(this);
        }
        try {
            if (this.mUIImplementation.q() > 0) {
                this.mUIImplementation.m(i10);
            }
        } finally {
            C4236a.i(0);
        }
    }

    public void onHostDestroy() {
        this.mUIImplementation.C();
    }

    public void onHostPause() {
        this.mUIImplementation.D();
    }

    public void onHostResume() {
        this.mUIImplementation.E();
    }

    public void prependUIBlock(l0 l0Var) {
        this.mUIImplementation.F(l0Var);
    }

    public void profileNextBatch() {
        this.mUIImplementation.G();
    }

    public void receiveEvent(int i10, String str, WritableMap writableMap) {
        receiveEvent(-1, i10, str, writableMap);
    }

    @ReactMethod
    public void removeRootView(int i10) {
        this.mUIImplementation.J(i10);
    }

    public void removeUIManagerEventListener(UIManagerListener uIManagerListener) {
        this.mUIManagerListeners.remove(uIManagerListener);
    }

    @Deprecated
    public void removeUIManagerListener(r0 r0Var) {
        this.mListeners.remove(r0Var);
    }

    @Deprecated
    public String resolveCustomDirectEventName(String str) {
        Map map;
        if (str == null || (map = (Map) this.mCustomDirectEvents.get(str)) == null) {
            return str;
        }
        return (String) map.get("registrationName");
    }

    @Deprecated
    public int resolveRootTagFromReactTag(int i10) {
        if (C3519a.d(i10)) {
            return i10;
        }
        return this.mUIImplementation.M(i10);
    }

    public View resolveView(int i10) {
        UiThreadUtil.assertOnUiThread();
        return this.mUIImplementation.r().S().resolveView(i10);
    }

    @ReactMethod
    public void sendAccessibilityEvent(int i10, int i11) {
        int a10 = C3519a.a(i10);
        if (a10 == 2) {
            UIManager g10 = n0.g(getReactApplicationContext(), a10);
            if (g10 != null) {
                g10.sendAccessibilityEvent(i10, i11);
                return;
            }
            return;
        }
        this.mUIImplementation.P(i10, i11);
    }

    @ReactMethod
    public void setChildren(int i10, ReadableArray readableArray) {
        if (DEBUG) {
            String str = "(UIManager.setChildren) tag: " + i10 + ", children: " + readableArray;
            U5.a.b("ReactNative", str);
            f6.c.a().c(C3538a.f43661g, str);
        }
        this.mUIImplementation.Q(i10, readableArray);
    }

    @ReactMethod
    public void setJSResponder(int i10, boolean z10) {
        this.mUIImplementation.R(i10, z10);
    }

    @ReactMethod
    public void setLayoutAnimationEnabledExperimental(boolean z10) {
        this.mUIImplementation.S(z10);
    }

    public void setViewHierarchyUpdateDebugListener(C3540a aVar) {
        this.mUIImplementation.T(aVar);
    }

    public void setViewLocalData(int i10, Object obj) {
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        reactApplicationContext.assertOnUiQueueThread();
        reactApplicationContext.runOnNativeModulesQueueThread(new b(reactApplicationContext, i10, obj));
    }

    public <T extends View> int startSurface(T t10, String str, WritableMap writableMap, int i10, int i11) {
        throw new UnsupportedOperationException();
    }

    public void stopSurface(int i10) {
        throw new UnsupportedOperationException();
    }

    public void sweepActiveTouchForTag(int i10, int i11) {
    }

    public void synchronouslyUpdateViewOnUIThread(int i10, ReadableMap readableMap) {
        this.mUIImplementation.V(i10, new W(readableMap));
    }

    public void updateInsetsPadding(int i10, int i11, int i12, int i13, int i14) {
        getReactApplicationContext().assertOnNativeModulesQueueThread();
        this.mUIImplementation.W(i10, i11, i12, i13, i14);
    }

    public void updateNodeSize(int i10, int i11, int i12) {
        getReactApplicationContext().assertOnNativeModulesQueueThread();
        this.mUIImplementation.X(i10, i11, i12);
    }

    public void updateRootLayoutSpecs(int i10, int i11, int i12, int i13, int i14) {
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        reactApplicationContext.runOnNativeModulesQueueThread(new c(reactApplicationContext, i10, i11, i12));
    }

    @ReactMethod
    public void updateView(int i10, String str, ReadableMap readableMap) {
        if (DEBUG) {
            String str2 = "(UIManager.updateView) tag: " + i10 + ", class: " + str + ", props: " + readableMap;
            U5.a.b("ReactNative", str2);
            f6.c.a().c(C3538a.f43661g, str2);
        }
        this.mUIImplementation.a0(i10, str, readableMap);
    }

    @Deprecated
    @ReactMethod
    public void viewIsDescendantOf(int i10, int i11, Callback callback) {
        this.mUIImplementation.c0(i10, i11, callback);
    }

    public <T extends View> int addRootView(T t10, WritableMap writableMap) {
        C4236a.c(0, "UIManagerModule.addRootView");
        int a10 = T.a();
        this.mUIImplementation.H(t10, a10, new C3415h0(getReactApplicationContext(), t10.getContext(), ((S) t10).getSurfaceID(), -1));
        C4236a.i(0);
        return a10;
    }

    public void dispatchCommand(int i10, String str, ReadableArray readableArray) {
        this.mUIImplementation.l(i10, str, readableArray);
    }

    public void receiveEvent(int i10, int i11, String str, WritableMap writableMap) {
        ((RCTEventEmitter) getReactApplicationContext().getJSModule(RCTEventEmitter.class)).receiveEvent(i11, str, writableMap);
    }

    public static WritableMap getConstantsForViewManager(ViewManager viewManager, Map<String, Object> map) {
        C4237b.a(0, "UIManagerModule.getConstantsForViewManager").b("ViewManager", viewManager.getName()).b("Lazy", Boolean.TRUE).c();
        try {
            Map c10 = q0.c(viewManager, (Map) null, (Map) null, (Map) null, map);
            if (c10 != null) {
                return Arguments.makeNativeMap((Map<String, Object>) c10);
            }
            C4237b.b(0).c();
            return null;
        } finally {
            C4237b.b(0).c();
        }
    }

    public static Map<String, Object> createConstants(List<ViewManager> list, Map<String, Object> map, Map<String, Object> map2) {
        ReactMarker.logMarker(ReactMarkerConstants.CREATE_UI_MANAGER_MODULE_CONSTANTS_START);
        C4237b.a(0, "CreateUIManagerConstants").b("Lazy", Boolean.FALSE).c();
        try {
            return q0.b(list, map, map2);
        } finally {
            C4236a.i(0);
            ReactMarker.logMarker(ReactMarkerConstants.CREATE_UI_MANAGER_MODULE_CONSTANTS_END);
        }
    }

    public UIManagerModule(ReactApplicationContext reactApplicationContext, List<ViewManager> list, int i10) {
        super(reactApplicationContext);
        C3408e.g(reactApplicationContext);
        com.facebook.react.uimanager.events.e eVar = new com.facebook.react.uimanager.events.e(reactApplicationContext);
        this.mEventDispatcher = eVar;
        HashMap b10 = C7.d.b();
        this.mCustomDirectEvents = b10;
        this.mModuleConstants = createConstants(list, (Map<String, Object>) null, b10);
        B0 b02 = new B0((List) list);
        this.mViewManagerRegistry = b02;
        this.mUIImplementation = new m0(reactApplicationContext, b02, (EventDispatcher) eVar, i10);
        reactApplicationContext.addLifecycleEventListener(this);
    }
}
