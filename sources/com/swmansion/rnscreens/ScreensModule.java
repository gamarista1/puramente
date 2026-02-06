package com.swmansion.rnscreens;

import android.util.Log;
import android.view.View;
import com.facebook.react.bridge.JavaScriptContextHolder;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.UIManager;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.fabric.FabricUIManager;
import com.facebook.react.uimanager.events.EventDispatcher;
import com.facebook.react.uimanager.n0;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import yd.h;

@Q7.a(name = "RNSModule")
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 &2\u00020\u0001:\u0001'B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H ¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u0010H\u0003¢\u0006\u0004\b\u0012\u0010\u0013J!\u0010\u0016\u001a\u00020\b2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0015\u001a\u00020\u0014H\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001b\u0010\u001cR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001dR\u0016\u0010\u001e\u001a\u00020\u000b8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010!\u001a\u00020 8\u0002X\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0018\u0010$\u001a\u0004\u0018\u00010#8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b$\u0010%¨\u0006("}, d2 = {"Lcom/swmansion/rnscreens/ScreensModule;", "Lcom/swmansion/rnscreens/NativeScreensModuleSpec;", "Lcom/facebook/react/bridge/ReactApplicationContext;", "reactContext", "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "", "jsiPtr", "Llf/M;", "nativeInstall", "(J)V", "", "reactTag", "", "startTransition", "(Ljava/lang/Integer;)[I", "", "progress", "updateTransition", "(D)V", "", "canceled", "finishTransition", "(Ljava/lang/Integer;Z)V", "initialize", "()V", "", "getName", "()Ljava/lang/String;", "Lcom/facebook/react/bridge/ReactApplicationContext;", "topScreenId", "I", "Ljava/util/concurrent/atomic/AtomicBoolean;", "isActiveTransition", "Ljava/util/concurrent/atomic/AtomicBoolean;", "Lcom/swmansion/rnscreens/NativeProxy;", "proxy", "Lcom/swmansion/rnscreens/NativeProxy;", "Companion", "a", "react-native-screens_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ScreensModule extends NativeScreensModuleSpec {
    public static final a Companion = new a((DefaultConstructorMarker) null);
    public static final String NAME = "RNSModule";
    private final AtomicBoolean isActiveTransition = new AtomicBoolean(false);
    private NativeProxy proxy;
    private final ReactApplicationContext reactContext;
    private int topScreenId = -1;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ScreensModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        C6496s.h(reactApplicationContext, "reactContext");
        this.reactContext = reactApplicationContext;
        try {
            System.loadLibrary("rnscreens");
            JavaScriptContextHolder javaScriptContextHolder = getReactApplicationContext().getJavaScriptContextHolder();
            if (javaScriptContextHolder != null) {
                nativeInstall(javaScriptContextHolder.get());
            } else {
                Log.e("[RNScreens]", "Could not install JSI bindings.");
            }
        } catch (UnsatisfiedLinkError unused) {
            Log.w("[RNScreens]", "Could not load RNScreens module.");
        }
    }

    @B7.a
    private final void finishTransition(Integer num, boolean z10) {
        View view;
        UiThreadUtil.assertOnUiThread();
        if (!this.isActiveTransition.get() || num == null) {
            Log.e("[RNScreens]", "Unable to call `finishTransition` method before transition start.");
            return;
        }
        UIManager i10 = n0.i(this.reactContext, num.intValue());
        if (i10 != null) {
            view = i10.resolveView(num.intValue());
        } else {
            view = null;
        }
        if (view instanceof B) {
            if (z10) {
                ((B) view).h();
            } else {
                ((B) view).q();
            }
            this.isActiveTransition.set(false);
        }
        this.topScreenId = -1;
    }

    private final native void nativeInstall(long j10);

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0034, code lost:
        r8 = (com.swmansion.rnscreens.B) r8;
        r1 = r8.getFragments();
     */
    @B7.a
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final int[] startTransition(java.lang.Integer r8) {
        /*
            r7 = this;
            com.facebook.react.bridge.UiThreadUtil.assertOnUiThread()
            java.util.concurrent.atomic.AtomicBoolean r0 = r7.isActiveTransition
            boolean r0 = r0.get()
            r1 = -1
            if (r0 != 0) goto L_0x006e
            if (r8 != 0) goto L_0x000f
            goto L_0x006e
        L_0x000f:
            r7.topScreenId = r1
            r0 = 2
            int[] r2 = new int[r0]
            r3 = 0
            r2[r3] = r1
            r4 = 1
            r2[r4] = r1
            com.facebook.react.bridge.ReactApplicationContext r1 = r7.reactContext
            int r5 = r8.intValue()
            com.facebook.react.bridge.UIManager r1 = com.facebook.react.uimanager.n0.i(r1, r5)
            if (r1 == 0) goto L_0x002f
            int r8 = r8.intValue()
            android.view.View r8 = r1.resolveView(r8)
            goto L_0x0030
        L_0x002f:
            r8 = 0
        L_0x0030:
            boolean r1 = r8 instanceof com.swmansion.rnscreens.B
            if (r1 == 0) goto L_0x006d
            com.swmansion.rnscreens.B r8 = (com.swmansion.rnscreens.B) r8
            java.util.ArrayList r1 = r8.getFragments()
            int r5 = r1.size()
            if (r5 <= r4) goto L_0x006d
            java.util.concurrent.atomic.AtomicBoolean r6 = r7.isActiveTransition
            r6.set(r4)
            r8.e()
            int r8 = r5 + -1
            java.lang.Object r8 = r1.get(r8)
            com.swmansion.rnscreens.F r8 = (com.swmansion.rnscreens.F) r8
            com.swmansion.rnscreens.r r8 = r8.g()
            int r8 = r8.getId()
            r7.topScreenId = r8
            r2[r3] = r8
            int r5 = r5 - r0
            java.lang.Object r8 = r1.get(r5)
            com.swmansion.rnscreens.F r8 = (com.swmansion.rnscreens.F) r8
            com.swmansion.rnscreens.r r8 = r8.g()
            int r8 = r8.getId()
            r2[r4] = r8
        L_0x006d:
            return r2
        L_0x006e:
            int[] r8 = new int[]{r1, r1}
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.swmansion.rnscreens.ScreensModule.startTransition(java.lang.Integer):int[]");
    }

    @B7.a
    private final void updateTransition(double d10) {
        UiThreadUtil.assertOnUiThread();
        if (this.topScreenId != -1) {
            float f10 = (float) d10;
            short a10 = C4940y.f59945h.a(f10);
            EventDispatcher c10 = n0.c(this.reactContext, this.topScreenId);
            if (c10 != null) {
                c10.h(new h(n0.e(this.reactContext), this.topScreenId, f10, true, true, a10));
            }
        }
    }

    public String getName() {
        return "RNSModule";
    }

    public void initialize() {
        super.initialize();
        UIManager g10 = n0.g(this.reactContext, 2);
        C6496s.f(g10, "null cannot be cast to non-null type com.facebook.react.fabric.FabricUIManager");
        NativeProxy nativeProxy = new NativeProxy();
        nativeProxy.nativeAddMutationsListener((FabricUIManager) g10);
        this.proxy = nativeProxy;
    }
}
