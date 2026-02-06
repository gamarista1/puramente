package com.facebook.react.views.modal;

import A8.a;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Build;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStructure;
import android.view.Window;
import android.view.WindowInsetsController;
import android.view.accessibility.AccessibilityEvent;
import android.widget.FrameLayout;
import com.facebook.react.C3371q;
import com.facebook.react.bridge.LifecycleEventListener;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.bridge.WritableNativeMap;
import com.facebook.react.config.ReactFeatureFlags;
import com.facebook.react.uimanager.C3405c0;
import com.facebook.react.uimanager.C3408e;
import com.facebook.react.uimanager.C3413g0;
import com.facebook.react.uimanager.C3415h0;
import com.facebook.react.uimanager.C3425s;
import com.facebook.react.uimanager.C3426t;
import com.facebook.react.uimanager.G;
import com.facebook.react.uimanager.events.EventDispatcher;
import com.facebook.react.views.view.e;
import com.facebook.react.views.view.k;
import java.util.ArrayList;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u0000 {2\u00020\u00012\u00020\u0002:\u0003|{}B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0011\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\nH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0011\u0010\tJ\u000f\u0010\u0012\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0012\u0010\tJ\u0017\u0010\u0015\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J7\u0010\u001d\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u001c\u001a\u00020\u0018H\u0014¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010 \u001a\u00020\u00072\u0006\u0010\u001f\u001a\u00020\u0018H\u0016¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\u0007H\u0014¢\u0006\u0004\b\"\u0010\tJ\u000f\u0010#\u001a\u00020\u0007H\u0014¢\u0006\u0004\b#\u0010\tJ!\u0010'\u001a\u00020\u00072\b\u0010%\u001a\u0004\u0018\u00010$2\u0006\u0010&\u001a\u00020\u0018H\u0016¢\u0006\u0004\b'\u0010(J\u000f\u0010)\u001a\u00020\u0018H\u0016¢\u0006\u0004\b)\u0010*J\u0019\u0010+\u001a\u0004\u0018\u00010$2\u0006\u0010&\u001a\u00020\u0018H\u0016¢\u0006\u0004\b+\u0010,J\u0019\u0010-\u001a\u00020\u00072\b\u0010%\u001a\u0004\u0018\u00010$H\u0016¢\u0006\u0004\b-\u0010.J\u0017\u0010/\u001a\u00020\u00072\u0006\u0010&\u001a\u00020\u0018H\u0016¢\u0006\u0004\b/\u0010!J'\u00103\u001a\u00020\u00072\u0016\u00102\u001a\u0012\u0012\u0004\u0012\u00020$00j\b\u0012\u0004\u0012\u00020$`1H\u0016¢\u0006\u0004\b3\u00104J\u0017\u00107\u001a\u00020\u000e2\u0006\u00106\u001a\u000205H\u0016¢\u0006\u0004\b7\u00108J\r\u00109\u001a\u00020\u0007¢\u0006\u0004\b9\u0010\tJ\u000f\u0010:\u001a\u00020\u0007H\u0016¢\u0006\u0004\b:\u0010\tJ\u000f\u0010;\u001a\u00020\u0007H\u0016¢\u0006\u0004\b;\u0010\tJ\u000f\u0010<\u001a\u00020\u0007H\u0016¢\u0006\u0004\b<\u0010\tJ\r\u0010=\u001a\u00020\u0007¢\u0006\u0004\b=\u0010\tR(\u0010@\u001a\u0004\u0018\u00010>2\b\u0010?\u001a\u0004\u0018\u00010>8G@BX\u000e¢\u0006\f\n\u0004\b@\u0010A\u001a\u0004\bB\u0010CR\"\u0010D\u001a\u00020\u000e8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\bD\u0010E\u001a\u0004\bF\u0010G\"\u0004\bH\u0010IR$\u0010K\u001a\u0004\u0018\u00010J8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\bK\u0010L\u001a\u0004\bM\u0010N\"\u0004\bO\u0010PR$\u0010R\u001a\u0004\u0018\u00010Q8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\bR\u0010S\u001a\u0004\bT\u0010U\"\u0004\bV\u0010WR*\u0010X\u001a\u00020\u000e2\u0006\u0010?\u001a\u00020\u000e8\u0006@FX\u000e¢\u0006\u0012\n\u0004\bX\u0010E\u001a\u0004\bY\u0010G\"\u0004\bZ\u0010IR*\u0010[\u001a\u00020\u000e2\u0006\u0010?\u001a\u00020\u000e8\u0006@FX\u000e¢\u0006\u0012\n\u0004\b[\u0010E\u001a\u0004\b\\\u0010G\"\u0004\b]\u0010IR.\u0010_\u001a\u0004\u0018\u00010^2\b\u0010?\u001a\u0004\u0018\u00010^8\u0006@FX\u000e¢\u0006\u0012\n\u0004\b_\u0010`\u001a\u0004\ba\u0010b\"\u0004\bc\u0010dR*\u0010e\u001a\u00020\u000e2\u0006\u0010?\u001a\u00020\u000e8\u0006@FX\u000e¢\u0006\u0012\n\u0004\be\u0010E\u001a\u0004\bf\u0010G\"\u0004\bg\u0010IR\u0014\u0010i\u001a\u00020h8\u0002X\u0004¢\u0006\u0006\n\u0004\bi\u0010jR\u0016\u0010k\u001a\u00020\u000e8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bk\u0010ER\u0014\u0010n\u001a\u00020$8BX\u0004¢\u0006\u0006\u001a\u0004\bl\u0010mR(\u0010p\u001a\u0004\u0018\u00010o2\b\u0010p\u001a\u0004\u0018\u00010o8F@FX\u000e¢\u0006\f\u001a\u0004\bq\u0010r\"\u0004\bs\u0010tR(\u0010v\u001a\u0004\u0018\u00010u2\b\u0010v\u001a\u0004\u0018\u00010u8F@FX\u000e¢\u0006\f\u001a\u0004\bw\u0010x\"\u0004\by\u0010z¨\u0006~"}, d2 = {"Lcom/facebook/react/views/modal/ReactModalHostView;", "Landroid/view/ViewGroup;", "Lcom/facebook/react/bridge/LifecycleEventListener;", "Lcom/facebook/react/uimanager/h0;", "context", "<init>", "(Lcom/facebook/react/uimanager/h0;)V", "Llf/M;", "dismiss", "()V", "Landroid/app/Activity;", "getCurrentActivity", "()Landroid/app/Activity;", "activity", "", "isFlagSecureSet", "(Landroid/app/Activity;)Z", "updateProperties", "updateSystemAppearance", "Landroid/view/ViewStructure;", "structure", "dispatchProvideStructure", "(Landroid/view/ViewStructure;)V", "changed", "", "l", "t", "r", "b", "onLayout", "(ZIIII)V", "id", "setId", "(I)V", "onAttachedToWindow", "onDetachedFromWindow", "Landroid/view/View;", "child", "index", "addView", "(Landroid/view/View;I)V", "getChildCount", "()I", "getChildAt", "(I)Landroid/view/View;", "removeView", "(Landroid/view/View;)V", "removeViewAt", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "outChildren", "addChildrenForAccessibility", "(Ljava/util/ArrayList;)V", "Landroid/view/accessibility/AccessibilityEvent;", "event", "dispatchPopulateAccessibilityEvent", "(Landroid/view/accessibility/AccessibilityEvent;)Z", "onDropInstance", "onHostResume", "onHostPause", "onHostDestroy", "showOrUpdate", "Landroid/app/Dialog;", "value", "dialog", "Landroid/app/Dialog;", "getDialog", "()Landroid/app/Dialog;", "transparent", "Z", "getTransparent", "()Z", "setTransparent", "(Z)V", "Landroid/content/DialogInterface$OnShowListener;", "onShowListener", "Landroid/content/DialogInterface$OnShowListener;", "getOnShowListener", "()Landroid/content/DialogInterface$OnShowListener;", "setOnShowListener", "(Landroid/content/DialogInterface$OnShowListener;)V", "Lcom/facebook/react/views/modal/ReactModalHostView$OnRequestCloseListener;", "onRequestCloseListener", "Lcom/facebook/react/views/modal/ReactModalHostView$OnRequestCloseListener;", "getOnRequestCloseListener", "()Lcom/facebook/react/views/modal/ReactModalHostView$OnRequestCloseListener;", "setOnRequestCloseListener", "(Lcom/facebook/react/views/modal/ReactModalHostView$OnRequestCloseListener;)V", "statusBarTranslucent", "getStatusBarTranslucent", "setStatusBarTranslucent", "navigationBarTranslucent", "getNavigationBarTranslucent", "setNavigationBarTranslucent", "", "animationType", "Ljava/lang/String;", "getAnimationType", "()Ljava/lang/String;", "setAnimationType", "(Ljava/lang/String;)V", "hardwareAccelerated", "getHardwareAccelerated", "setHardwareAccelerated", "Lcom/facebook/react/views/modal/ReactModalHostView$DialogRootViewGroup;", "dialogRootViewGroup", "Lcom/facebook/react/views/modal/ReactModalHostView$DialogRootViewGroup;", "createNewDialog", "getContentView", "()Landroid/view/View;", "contentView", "Lcom/facebook/react/uimanager/g0;", "stateWrapper", "getStateWrapper", "()Lcom/facebook/react/uimanager/g0;", "setStateWrapper", "(Lcom/facebook/react/uimanager/g0;)V", "Lcom/facebook/react/uimanager/events/EventDispatcher;", "eventDispatcher", "getEventDispatcher", "()Lcom/facebook/react/uimanager/events/EventDispatcher;", "setEventDispatcher", "(Lcom/facebook/react/uimanager/events/EventDispatcher;)V", "Companion", "OnRequestCloseListener", "DialogRootViewGroup", "ReactAndroid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SuppressLint({"ViewConstructor"})
public final class ReactModalHostView extends ViewGroup implements LifecycleEventListener {
    private static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private static final String TAG = "ReactModalHost";
    /* access modifiers changed from: private */
    public static int statusBarHeight;
    private String animationType;
    private boolean createNewDialog;
    private Dialog dialog;
    private final DialogRootViewGroup dialogRootViewGroup;
    private boolean hardwareAccelerated;
    private boolean navigationBarTranslucent;
    private OnRequestCloseListener onRequestCloseListener;
    private DialogInterface.OnShowListener onShowListener;
    private boolean statusBarTranslucent;
    private boolean transparent;

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u000f\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002XT¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0015\u001a\u00020\u00148\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lcom/facebook/react/views/modal/ReactModalHostView$Companion;", "", "<init>", "()V", "Lcom/facebook/react/bridge/ReactContext;", "reactContext", "Llf/M;", "initStatusBarHeight", "(Lcom/facebook/react/bridge/ReactContext;)V", "", "getScreenDisplayMetricsWithoutInsets", "()J", "", "width", "height", "encodeFloatsToLong", "(FF)J", "", "TAG", "Ljava/lang/String;", "", "statusBarHeight", "I", "ReactAndroid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final long encodeFloatsToLong(float f10, float f11) {
            return ((long) Float.floatToRawIntBits(f11)) | (((long) Float.floatToRawIntBits(f10)) << 32);
        }

        /* access modifiers changed from: private */
        @a
        public final long getScreenDisplayMetricsWithoutInsets() {
            DisplayMetrics c10 = C3408e.c();
            G g10 = G.f41415a;
            return encodeFloatsToLong(g10.d((float) c10.widthPixels), g10.d((float) (c10.heightPixels - ReactModalHostView.statusBarHeight)));
        }

        /* access modifiers changed from: private */
        public final void initStatusBarHeight(ReactContext reactContext) {
            ReactModalHostView.statusBarHeight = C3408e.f41567a.d(reactContext.getCurrentActivity());
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u0011\b\u0000\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J/\u0010\r\u001a\u00020\f2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u0007H\u0014¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0011\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u0018\u001a\u00020\u0017H\u0017¢\u0006\u0004\b\u001c\u0010\u001bJ\u0017\u0010\u001d\u001a\u00020\u00192\u0006\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u001d\u0010\u001bJ\u0017\u0010\u001e\u001a\u00020\u00192\u0006\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u001e\u0010\u001bJ\u001f\u0010\"\u001a\u00020\f2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010!\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\"\u0010#J\u001f\u0010$\u001a\u00020\f2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010!\u001a\u00020\u0017H\u0016¢\u0006\u0004\b$\u0010#J\u0017\u0010&\u001a\u00020\f2\u0006\u0010%\u001a\u00020\u0019H\u0016¢\u0006\u0004\b&\u0010'R$\u0010)\u001a\u0004\u0018\u00010(8\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R$\u00100\u001a\u0004\u0018\u00010/8\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\b0\u00101\u001a\u0004\b2\u00103\"\u0004\b4\u00105R\u0016\u00106\u001a\u00020\u00078\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b6\u00107R\u0016\u00108\u001a\u00020\u00078\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b8\u00107R\u0014\u0010:\u001a\u0002098\u0002X\u0004¢\u0006\u0006\n\u0004\b:\u0010;R\u0018\u0010=\u001a\u0004\u0018\u00010<8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b=\u0010>R\u0014\u0010B\u001a\u00020?8BX\u0004¢\u0006\u0006\u001a\u0004\b@\u0010A¨\u0006C"}, d2 = {"Lcom/facebook/react/views/modal/ReactModalHostView$DialogRootViewGroup;", "Lcom/facebook/react/views/view/e;", "Lcom/facebook/react/uimanager/c0;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "", "w", "h", "oldw", "oldh", "Llf/M;", "onSizeChanged", "(IIII)V", "width", "height", "updateState", "(II)V", "", "t", "handleException", "(Ljava/lang/Throwable;)V", "Landroid/view/MotionEvent;", "event", "", "onInterceptTouchEvent", "(Landroid/view/MotionEvent;)Z", "onTouchEvent", "onInterceptHoverEvent", "onHoverEvent", "Landroid/view/View;", "childView", "ev", "onChildStartedNativeGesture", "(Landroid/view/View;Landroid/view/MotionEvent;)V", "onChildEndedNativeGesture", "disallowIntercept", "requestDisallowInterceptTouchEvent", "(Z)V", "Lcom/facebook/react/uimanager/g0;", "stateWrapper", "Lcom/facebook/react/uimanager/g0;", "getStateWrapper$ReactAndroid_release", "()Lcom/facebook/react/uimanager/g0;", "setStateWrapper$ReactAndroid_release", "(Lcom/facebook/react/uimanager/g0;)V", "Lcom/facebook/react/uimanager/events/EventDispatcher;", "eventDispatcher", "Lcom/facebook/react/uimanager/events/EventDispatcher;", "getEventDispatcher$ReactAndroid_release", "()Lcom/facebook/react/uimanager/events/EventDispatcher;", "setEventDispatcher$ReactAndroid_release", "(Lcom/facebook/react/uimanager/events/EventDispatcher;)V", "viewWidth", "I", "viewHeight", "Lcom/facebook/react/uimanager/t;", "jSTouchDispatcher", "Lcom/facebook/react/uimanager/t;", "Lcom/facebook/react/uimanager/s;", "jSPointerDispatcher", "Lcom/facebook/react/uimanager/s;", "Lcom/facebook/react/uimanager/h0;", "getReactContext", "()Lcom/facebook/react/uimanager/h0;", "reactContext", "ReactAndroid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class DialogRootViewGroup extends e implements C3405c0 {
        private EventDispatcher eventDispatcher;
        private C3425s jSPointerDispatcher;
        private final C3426t jSTouchDispatcher = new C3426t(this);
        private C3413g0 stateWrapper;
        /* access modifiers changed from: private */
        public int viewHeight;
        /* access modifiers changed from: private */
        public int viewWidth;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public DialogRootViewGroup(Context context) {
            super(context);
            C6496s.h(context, "context");
            if (ReactFeatureFlags.dispatchPointerEvents) {
                this.jSPointerDispatcher = new C3425s(this);
            }
        }

        /* access modifiers changed from: private */
        public final C3415h0 getReactContext() {
            Context context = getContext();
            C6496s.f(context, "null cannot be cast to non-null type com.facebook.react.uimanager.ThemedReactContext");
            return (C3415h0) context;
        }

        public final EventDispatcher getEventDispatcher$ReactAndroid_release() {
            return this.eventDispatcher;
        }

        public final C3413g0 getStateWrapper$ReactAndroid_release() {
            return this.stateWrapper;
        }

        public void handleException(Throwable th2) {
            C6496s.h(th2, "t");
            getReactContext().b().handleException(new RuntimeException(th2));
        }

        public void onChildEndedNativeGesture(View view, MotionEvent motionEvent) {
            C6496s.h(view, "childView");
            C6496s.h(motionEvent, "ev");
            EventDispatcher eventDispatcher2 = this.eventDispatcher;
            if (eventDispatcher2 != null) {
                this.jSTouchDispatcher.e(motionEvent, eventDispatcher2);
            }
            C3425s sVar = this.jSPointerDispatcher;
            if (sVar != null) {
                sVar.o();
            }
        }

        @Deprecated
        public /* bridge */ /* synthetic */ void onChildStartedNativeGesture(MotionEvent motionEvent) {
            super.onChildStartedNativeGesture(motionEvent);
        }

        public boolean onHoverEvent(MotionEvent motionEvent) {
            C3425s sVar;
            C6496s.h(motionEvent, "event");
            EventDispatcher eventDispatcher2 = this.eventDispatcher;
            if (!(eventDispatcher2 == null || (sVar = this.jSPointerDispatcher) == null)) {
                sVar.k(motionEvent, eventDispatcher2, false);
            }
            return super.onHoverEvent(motionEvent);
        }

        public boolean onInterceptHoverEvent(MotionEvent motionEvent) {
            C3425s sVar;
            C6496s.h(motionEvent, "event");
            EventDispatcher eventDispatcher2 = this.eventDispatcher;
            if (!(eventDispatcher2 == null || (sVar = this.jSPointerDispatcher) == null)) {
                sVar.k(motionEvent, eventDispatcher2, true);
            }
            return super.onHoverEvent(motionEvent);
        }

        public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            C6496s.h(motionEvent, "event");
            EventDispatcher eventDispatcher2 = this.eventDispatcher;
            if (eventDispatcher2 != null) {
                this.jSTouchDispatcher.c(motionEvent, eventDispatcher2, getReactContext());
                C3425s sVar = this.jSPointerDispatcher;
                if (sVar != null) {
                    sVar.k(motionEvent, eventDispatcher2, true);
                }
            }
            return super.onInterceptTouchEvent(motionEvent);
        }

        /* access modifiers changed from: protected */
        public void onSizeChanged(int i10, int i11, int i12, int i13) {
            super.onSizeChanged(i10, i11, i12, i13);
            this.viewWidth = i10;
            this.viewHeight = i11;
            updateState(i10, i11);
        }

        @SuppressLint({"ClickableViewAccessibility"})
        public boolean onTouchEvent(MotionEvent motionEvent) {
            C6496s.h(motionEvent, "event");
            EventDispatcher eventDispatcher2 = this.eventDispatcher;
            if (eventDispatcher2 != null) {
                this.jSTouchDispatcher.c(motionEvent, eventDispatcher2, getReactContext());
                C3425s sVar = this.jSPointerDispatcher;
                if (sVar != null) {
                    sVar.k(motionEvent, eventDispatcher2, false);
                }
            }
            super.onTouchEvent(motionEvent);
            return true;
        }

        public void requestDisallowInterceptTouchEvent(boolean z10) {
        }

        public final void setEventDispatcher$ReactAndroid_release(EventDispatcher eventDispatcher2) {
            this.eventDispatcher = eventDispatcher2;
        }

        public final void setStateWrapper$ReactAndroid_release(C3413g0 g0Var) {
            this.stateWrapper = g0Var;
        }

        public final void updateState(int i10, int i11) {
            G g10 = G.f41415a;
            float d10 = g10.d((float) i10);
            float d11 = g10.d((float) i11);
            C3413g0 g0Var = this.stateWrapper;
            if (g0Var != null) {
                WritableNativeMap writableNativeMap = new WritableNativeMap();
                writableNativeMap.putDouble("screenWidth", (double) d10);
                writableNativeMap.putDouble("screenHeight", (double) d11);
                g0Var.updateState(writableNativeMap);
                return;
            }
            getReactContext().runOnNativeModulesQueueThread(new ReactModalHostView$DialogRootViewGroup$updateState$2$1(this, getReactContext()));
        }

        public void onChildStartedNativeGesture(View view, MotionEvent motionEvent) {
            C6496s.h(view, "childView");
            C6496s.h(motionEvent, "ev");
            EventDispatcher eventDispatcher2 = this.eventDispatcher;
            if (eventDispatcher2 != null) {
                this.jSTouchDispatcher.f(motionEvent, eventDispatcher2);
                C3425s sVar = this.jSPointerDispatcher;
                if (sVar != null) {
                    sVar.p(view, motionEvent, eventDispatcher2);
                }
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bæ\u0001\u0018\u00002\u00020\u0001J\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006ø\u0001\u0000\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0007À\u0006\u0001"}, d2 = {"Lcom/facebook/react/views/modal/ReactModalHostView$OnRequestCloseListener;", "", "Landroid/content/DialogInterface;", "dialog", "Llf/M;", "onRequestClose", "(Landroid/content/DialogInterface;)V", "ReactAndroid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface OnRequestCloseListener {
        void onRequestClose(DialogInterface dialogInterface);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ReactModalHostView(C3415h0 h0Var) {
        super(h0Var);
        C6496s.h(h0Var, "context");
        Companion.initStatusBarHeight(h0Var);
        this.dialogRootViewGroup = new DialogRootViewGroup(h0Var);
    }

    /* JADX WARNING: type inference failed for: r1v3, types: [android.view.ViewParent] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void dismiss() {
        /*
            r3 = this;
            com.facebook.react.bridge.UiThreadUtil.assertOnUiThread()
            android.app.Dialog r0 = r3.dialog
            if (r0 == 0) goto L_0x003d
            boolean r1 = r0.isShowing()
            if (r1 == 0) goto L_0x0024
            android.content.Context r1 = r0.getContext()
            java.lang.Class<android.app.Activity> r2 = android.app.Activity.class
            java.lang.Object r1 = n8.C3864a.a(r1, r2)
            android.app.Activity r1 = (android.app.Activity) r1
            if (r1 == 0) goto L_0x0021
            boolean r1 = r1.isFinishing()
            if (r1 != 0) goto L_0x0024
        L_0x0021:
            r0.dismiss()
        L_0x0024:
            r0 = 0
            r3.dialog = r0
            r1 = 1
            r3.createNewDialog = r1
            com.facebook.react.views.modal.ReactModalHostView$DialogRootViewGroup r1 = r3.dialogRootViewGroup
            android.view.ViewParent r1 = r1.getParent()
            boolean r2 = r1 instanceof android.view.ViewGroup
            if (r2 == 0) goto L_0x0037
            r0 = r1
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
        L_0x0037:
            if (r0 == 0) goto L_0x003d
            r1 = 0
            r0.removeViewAt(r1)
        L_0x003d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.views.modal.ReactModalHostView.dismiss():void");
    }

    private final View getContentView() {
        FrameLayout frameLayout = new FrameLayout(getContext());
        frameLayout.addView(this.dialogRootViewGroup);
        if (!this.statusBarTranslucent) {
            frameLayout.setFitsSystemWindows(true);
        }
        return frameLayout;
    }

    private final Activity getCurrentActivity() {
        Context context = getContext();
        C6496s.f(context, "null cannot be cast to non-null type com.facebook.react.uimanager.ThemedReactContext");
        return ((C3415h0) context).getCurrentActivity();
    }

    @a
    private static final long getScreenDisplayMetricsWithoutInsets() {
        return Companion.getScreenDisplayMetricsWithoutInsets();
    }

    private final boolean isFlagSecureSet(Activity activity) {
        if (activity == null || (activity.getWindow().getAttributes().flags & 8192) == 0) {
            return false;
        }
        return true;
    }

    private final void updateProperties() {
        Dialog dialog2 = this.dialog;
        if (dialog2 != null) {
            Window window = dialog2.getWindow();
            if (window != null) {
                Activity currentActivity = getCurrentActivity();
                if (currentActivity != null && !currentActivity.isFinishing() && !currentActivity.isDestroyed()) {
                    try {
                        Window window2 = currentActivity.getWindow();
                        if (window2 != null) {
                            if ((window2.getAttributes().flags & 1024) != 0) {
                                window.addFlags(1024);
                            } else {
                                window.clearFlags(1024);
                            }
                        }
                        k.e(window, this.navigationBarTranslucent);
                        if (!this.navigationBarTranslucent) {
                            k.b(window, this.statusBarTranslucent);
                        }
                        if (this.transparent) {
                            window.clearFlags(2);
                            return;
                        }
                        window.setDimAmount(0.5f);
                        window.setFlags(2, 2);
                    } catch (IllegalArgumentException e10) {
                        U5.a.o("ReactNative", "ReactModalHostView: error while setting window flags: ", e10.getMessage());
                    }
                }
            } else {
                throw new IllegalStateException("dialog must have window when we call updateProperties");
            }
        } else {
            throw new IllegalStateException("dialog must exist when we call updateProperties");
        }
    }

    private final void updateSystemAppearance() {
        Activity currentActivity = getCurrentActivity();
        if (currentActivity != null) {
            Dialog dialog2 = this.dialog;
            if (dialog2 != null) {
                Window window = dialog2.getWindow();
                if (window != null) {
                    Window window2 = currentActivity.getWindow();
                    if (Build.VERSION.SDK_INT > 30) {
                        WindowInsetsController a10 = window2.getInsetsController();
                        if (a10 != null) {
                            int a11 = a10.getSystemBarsAppearance() & 8;
                            WindowInsetsController a12 = window.getInsetsController();
                            if (a12 != null) {
                                a12.setSystemBarsAppearance(a11, 8);
                                return;
                            }
                            return;
                        }
                        throw new IllegalStateException("Required value was null.");
                    }
                    window.getDecorView().setSystemUiVisibility(window2.getDecorView().getSystemUiVisibility());
                    return;
                }
                throw new IllegalStateException("dialog must have window when we call updateProperties");
            }
            throw new IllegalStateException("dialog must exist when we call updateProperties");
        }
    }

    public void addChildrenForAccessibility(ArrayList<View> arrayList) {
        C6496s.h(arrayList, "outChildren");
    }

    public void addView(View view, int i10) {
        UiThreadUtil.assertOnUiThread();
        this.dialogRootViewGroup.addView(view, i10);
    }

    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        C6496s.h(accessibilityEvent, "event");
        return false;
    }

    public void dispatchProvideStructure(ViewStructure viewStructure) {
        C6496s.h(viewStructure, "structure");
        this.dialogRootViewGroup.dispatchProvideStructure(viewStructure);
    }

    public final String getAnimationType() {
        return this.animationType;
    }

    public View getChildAt(int i10) {
        return this.dialogRootViewGroup.getChildAt(i10);
    }

    public int getChildCount() {
        return this.dialogRootViewGroup.getChildCount();
    }

    public final Dialog getDialog() {
        return this.dialog;
    }

    public final EventDispatcher getEventDispatcher() {
        return this.dialogRootViewGroup.getEventDispatcher$ReactAndroid_release();
    }

    public final boolean getHardwareAccelerated() {
        return this.hardwareAccelerated;
    }

    public final boolean getNavigationBarTranslucent() {
        return this.navigationBarTranslucent;
    }

    public final OnRequestCloseListener getOnRequestCloseListener() {
        return this.onRequestCloseListener;
    }

    public final DialogInterface.OnShowListener getOnShowListener() {
        return this.onShowListener;
    }

    public final C3413g0 getStateWrapper() {
        return this.dialogRootViewGroup.getStateWrapper$ReactAndroid_release();
    }

    public final boolean getStatusBarTranslucent() {
        return this.statusBarTranslucent;
    }

    public final boolean getTransparent() {
        return this.transparent;
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Context context = getContext();
        C6496s.f(context, "null cannot be cast to non-null type com.facebook.react.uimanager.ThemedReactContext");
        ((C3415h0) context).addLifecycleEventListener(this);
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        onDropInstance();
    }

    public final void onDropInstance() {
        Context context = getContext();
        C6496s.f(context, "null cannot be cast to non-null type com.facebook.react.uimanager.ThemedReactContext");
        ((C3415h0) context).removeLifecycleEventListener(this);
        dismiss();
    }

    public void onHostDestroy() {
        onDropInstance();
    }

    public void onHostPause() {
    }

    public void onHostResume() {
        showOrUpdate();
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
    }

    public void removeView(View view) {
        UiThreadUtil.assertOnUiThread();
        if (view != null) {
            this.dialogRootViewGroup.removeView(view);
        }
    }

    public void removeViewAt(int i10) {
        UiThreadUtil.assertOnUiThread();
        this.dialogRootViewGroup.removeView(getChildAt(i10));
    }

    public final void setAnimationType(String str) {
        this.animationType = str;
        this.createNewDialog = true;
    }

    public final void setEventDispatcher(EventDispatcher eventDispatcher) {
        this.dialogRootViewGroup.setEventDispatcher$ReactAndroid_release(eventDispatcher);
    }

    public final void setHardwareAccelerated(boolean z10) {
        this.hardwareAccelerated = z10;
        this.createNewDialog = true;
    }

    public void setId(int i10) {
        super.setId(i10);
        this.dialogRootViewGroup.setId(i10);
    }

    public final void setNavigationBarTranslucent(boolean z10) {
        this.navigationBarTranslucent = z10;
        this.createNewDialog = true;
    }

    public final void setOnRequestCloseListener(OnRequestCloseListener onRequestCloseListener2) {
        this.onRequestCloseListener = onRequestCloseListener2;
    }

    public final void setOnShowListener(DialogInterface.OnShowListener onShowListener2) {
        this.onShowListener = onShowListener2;
    }

    public final void setStateWrapper(C3413g0 g0Var) {
        this.dialogRootViewGroup.setStateWrapper$ReactAndroid_release(g0Var);
    }

    public final void setStatusBarTranslucent(boolean z10) {
        this.statusBarTranslucent = z10;
        this.createNewDialog = true;
    }

    public final void setTransparent(boolean z10) {
        this.transparent = z10;
    }

    public final void showOrUpdate() {
        int i10;
        Context context;
        Window window;
        Window window2;
        UiThreadUtil.assertOnUiThread();
        if (this.createNewDialog) {
            dismiss();
            this.createNewDialog = false;
            String str = this.animationType;
            if (C6496s.c(str, "fade")) {
                i10 = C3371q.f41179e;
            } else if (C6496s.c(str, "slide")) {
                i10 = C3371q.f41180f;
            } else {
                i10 = C3371q.f41178d;
            }
            Activity currentActivity = getCurrentActivity();
            if (currentActivity != null) {
                context = currentActivity;
            } else {
                context = getContext();
            }
            Dialog dialog2 = new Dialog(context, i10);
            this.dialog = dialog2;
            Window window3 = dialog2.getWindow();
            Objects.requireNonNull(window3);
            window3.setFlags(8, 8);
            dialog2.setContentView(getContentView());
            updateProperties();
            dialog2.setOnShowListener(this.onShowListener);
            dialog2.setOnKeyListener(new ReactModalHostView$showOrUpdate$1(this));
            Window window4 = dialog2.getWindow();
            if (window4 != null) {
                window4.setSoftInputMode(16);
            }
            if (this.hardwareAccelerated && (window2 = dialog2.getWindow()) != null) {
                window2.addFlags(16777216);
            }
            if (isFlagSecureSet(currentActivity) && (window = dialog2.getWindow()) != null) {
                window.setFlags(8192, 8192);
            }
            if (currentActivity != null && !currentActivity.isFinishing()) {
                dialog2.show();
                updateSystemAppearance();
                Window window5 = dialog2.getWindow();
                if (window5 != null) {
                    window5.clearFlags(8);
                    return;
                }
                return;
            }
            return;
        }
        updateProperties();
    }
}
