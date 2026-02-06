package com.swmansion.rnscreens;

import C7.d;
import Ef.g;
import Rg.k;
import android.view.View;
import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.C3413g0;
import com.facebook.react.uimanager.C3415h0;
import com.facebook.react.uimanager.ViewGroupManager;
import com.facebook.react.uimanager.W;
import com.facebook.react.uimanager.w0;
import com.swmansion.rnscreens.r;
import e8.C3500a;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lf.C6502A;
import m8.C3792F;
import m8.G;
import mf.C6565s;
import mf.O;

@Q7.a(name = "RNSScreen")
@Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010%\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0017\u0018\u0000 c2\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u0003:\u0001dB\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0014¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u0011\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J'\u0010\u0018\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u001f\u0010\u001a\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u001f\u0010\u001c\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ-\u0010#\u001a\u0004\u0018\u00010\"2\u0006\u0010\r\u001a\u00020\u00022\b\u0010\u001f\u001a\u0004\u0018\u00010\u001e2\b\u0010!\u001a\u0004\u0018\u00010 H\u0016¢\u0006\u0004\b#\u0010$J\u0017\u0010%\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u0002H\u0014¢\u0006\u0004\b%\u0010&J\u001f\u0010\u0011\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u0016H\u0007¢\u0006\u0004\b\u0011\u0010\u001bJ!\u0010(\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u00022\b\u0010'\u001a\u0004\u0018\u00010\u0006H\u0017¢\u0006\u0004\b(\u0010)J!\u0010+\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u00022\b\u0010*\u001a\u0004\u0018\u00010\u0006H\u0017¢\u0006\u0004\b+\u0010)J\u001f\u0010.\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010-\u001a\u00020,H\u0017¢\u0006\u0004\b.\u0010/J!\u00100\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u00022\b\u0010*\u001a\u0004\u0018\u00010\u0006H\u0017¢\u0006\u0004\b0\u0010)J!\u00102\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u00022\b\u00101\u001a\u0004\u0018\u00010\u0006H\u0017¢\u0006\u0004\b2\u0010)J!\u00104\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u00022\b\u00103\u001a\u0004\u0018\u00010\u0006H\u0017¢\u0006\u0004\b4\u0010)J!\u00106\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u00022\b\u00105\u001a\u0004\u0018\u00010\u0016H\u0017¢\u0006\u0004\b6\u00107J!\u00109\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u00022\b\u00108\u001a\u0004\u0018\u00010\u0006H\u0017¢\u0006\u0004\b9\u0010)J\u001f\u0010;\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010:\u001a\u00020,H\u0017¢\u0006\u0004\b;\u0010/J\u001f\u0010=\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010<\u001a\u00020,H\u0017¢\u0006\u0004\b=\u0010/J!\u0010?\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u00022\b\u0010>\u001a\u0004\u0018\u00010\u0016H\u0017¢\u0006\u0004\b?\u00107J\u001f\u0010A\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010@\u001a\u00020,H\u0017¢\u0006\u0004\bA\u0010/J\u001f\u0010C\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010B\u001a\u00020,H\u0017¢\u0006\u0004\bC\u0010/J\u001f\u0010E\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010D\u001a\u00020,H\u0017¢\u0006\u0004\bE\u0010/J!\u0010G\u001a\u00020\u00102\b\u0010\r\u001a\u0004\u0018\u00010\u00022\u0006\u0010F\u001a\u00020\u0016H\u0017¢\u0006\u0004\bG\u0010\u001bJ!\u0010H\u001a\u00020\u00102\b\u0010\r\u001a\u0004\u0018\u00010\u00022\u0006\u0010F\u001a\u00020,H\u0016¢\u0006\u0004\bH\u0010/J!\u0010I\u001a\u00020\u00102\b\u0010\r\u001a\u0004\u0018\u00010\u00022\u0006\u0010F\u001a\u00020,H\u0016¢\u0006\u0004\bI\u0010/J!\u0010J\u001a\u00020\u00102\b\u0010\r\u001a\u0004\u0018\u00010\u00022\u0006\u0010F\u001a\u00020\u0016H\u0016¢\u0006\u0004\bJ\u0010\u001bJ!\u0010K\u001a\u00020\u00102\b\u0010\r\u001a\u0004\u0018\u00010\u00022\u0006\u0010F\u001a\u00020,H\u0016¢\u0006\u0004\bK\u0010/J!\u0010L\u001a\u00020\u00102\b\u0010\r\u001a\u0004\u0018\u00010\u00022\u0006\u0010F\u001a\u00020,H\u0016¢\u0006\u0004\bL\u0010/J#\u0010N\u001a\u00020\u00102\b\u0010\r\u001a\u0004\u0018\u00010\u00022\b\u0010F\u001a\u0004\u0018\u00010MH\u0016¢\u0006\u0004\bN\u0010OJ!\u0010P\u001a\u00020\u00102\b\u0010\r\u001a\u0004\u0018\u00010\u00022\u0006\u0010F\u001a\u00020,H\u0016¢\u0006\u0004\bP\u0010/J!\u0010Q\u001a\u00020\u00102\b\u0010\r\u001a\u0004\u0018\u00010\u00022\u0006\u0010F\u001a\u00020,H\u0016¢\u0006\u0004\bQ\u0010/J#\u0010R\u001a\u00020\u00102\b\u0010\r\u001a\u0004\u0018\u00010\u00022\b\u0010F\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\bR\u0010)J!\u0010T\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u00022\b\u0010F\u001a\u0004\u0018\u00010SH\u0017¢\u0006\u0004\bT\u0010UJ\u001f\u0010V\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010F\u001a\u00020\u0016H\u0017¢\u0006\u0004\bV\u0010\u001bJ\u001f\u0010W\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010F\u001a\u00020,H\u0017¢\u0006\u0004\bW\u0010/J\u001f\u0010X\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010F\u001a\u00020\u000eH\u0017¢\u0006\u0004\bX\u0010\u0012J\u001f\u0010Y\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010F\u001a\u00020,H\u0017¢\u0006\u0004\bY\u0010/J\u001f\u0010Z\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010F\u001a\u00020\u0016H\u0017¢\u0006\u0004\bZ\u0010\u001bJ\u001b\u0010\\\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\"0[H\u0016¢\u0006\u0004\b\\\u0010]J\u0015\u0010_\u001a\b\u0012\u0004\u0012\u00020\u00020^H\u0014¢\u0006\u0004\b_\u0010`R\u001a\u0010a\u001a\b\u0012\u0004\u0012\u00020\u00020^8\u0002X\u0004¢\u0006\u0006\n\u0004\ba\u0010b¨\u0006e"}, d2 = {"Lcom/swmansion/rnscreens/ScreenViewManager;", "Lcom/facebook/react/uimanager/ViewGroupManager;", "Lcom/swmansion/rnscreens/r;", "Lm8/G;", "<init>", "()V", "", "getName", "()Ljava/lang/String;", "Lcom/facebook/react/uimanager/h0;", "reactContext", "createViewInstance", "(Lcom/facebook/react/uimanager/h0;)Lcom/swmansion/rnscreens/r;", "view", "", "activityState", "Llf/M;", "setActivityState", "(Lcom/swmansion/rnscreens/r;F)V", "parent", "Landroid/view/View;", "child", "", "index", "addView", "(Lcom/swmansion/rnscreens/r;Landroid/view/View;I)V", "removeViewAt", "(Lcom/swmansion/rnscreens/r;I)V", "removeView", "(Lcom/swmansion/rnscreens/r;Landroid/view/View;)V", "Lcom/facebook/react/uimanager/W;", "props", "Lcom/facebook/react/uimanager/g0;", "stateWrapper", "", "updateState", "(Lcom/swmansion/rnscreens/r;Lcom/facebook/react/uimanager/W;Lcom/facebook/react/uimanager/g0;)Ljava/lang/Object;", "onAfterUpdateTransaction", "(Lcom/swmansion/rnscreens/r;)V", "presentation", "setStackPresentation", "(Lcom/swmansion/rnscreens/r;Ljava/lang/String;)V", "animation", "setStackAnimation", "", "gestureEnabled", "setGestureEnabled", "(Lcom/swmansion/rnscreens/r;Z)V", "setReplaceAnimation", "screenOrientation", "setScreenOrientation", "statusBarAnimation", "setStatusBarAnimation", "statusBarColor", "setStatusBarColor", "(Lcom/swmansion/rnscreens/r;Ljava/lang/Integer;)V", "statusBarStyle", "setStatusBarStyle", "statusBarTranslucent", "setStatusBarTranslucent", "statusBarHidden", "setStatusBarHidden", "navigationBarColor", "setNavigationBarColor", "navigationBarTranslucent", "setNavigationBarTranslucent", "navigationBarHidden", "setNavigationBarHidden", "nativeBackButtonDismissalEnabled", "setNativeBackButtonDismissalEnabled", "value", "setSheetElevation", "setFullScreenSwipeEnabled", "setFullScreenSwipeShadowEnabled", "setTransitionDuration", "setHideKeyboardOnSwipe", "setCustomAnimationOnSwipe", "Lcom/facebook/react/bridge/ReadableMap;", "setGestureResponseDistance", "(Lcom/swmansion/rnscreens/r;Lcom/facebook/react/bridge/ReadableMap;)V", "setHomeIndicatorHidden", "setPreventNativeDismiss", "setSwipeDirection", "Lcom/facebook/react/bridge/ReadableArray;", "setSheetAllowedDetents", "(Lcom/swmansion/rnscreens/r;Lcom/facebook/react/bridge/ReadableArray;)V", "setSheetLargestUndimmedDetent", "setSheetGrabberVisible", "setSheetCornerRadius", "setSheetExpandsWhenScrolledToEdge", "setSheetInitialDetent", "", "getExportedCustomDirectEventTypeConstants", "()Ljava/util/Map;", "Lcom/facebook/react/uimanager/w0;", "getDelegate", "()Lcom/facebook/react/uimanager/w0;", "delegate", "Lcom/facebook/react/uimanager/w0;", "Companion", "a", "react-native-screens_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public class ScreenViewManager extends ViewGroupManager<r> implements G {
    public static final a Companion = new a((DefaultConstructorMarker) null);
    public static final String REACT_CLASS = "RNSScreen";
    private final w0 delegate = new C3792F(this);

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* access modifiers changed from: private */
    public static final double setSheetAllowedDetents$lambda$0(ReadableArray readableArray, int i10) {
        return readableArray.getDouble(i10);
    }

    /* access modifiers changed from: protected */
    public w0 getDelegate() {
        return this.delegate;
    }

    public Map<String, Object> getExportedCustomDirectEventTypeConstants() {
        return O.n(C6502A.a("topDismissed", d.d("registrationName", "onDismissed")), C6502A.a("topWillAppear", d.d("registrationName", "onWillAppear")), C6502A.a("topAppear", d.d("registrationName", "onAppear")), C6502A.a("topWillDisappear", d.d("registrationName", "onWillDisappear")), C6502A.a("topDisappear", d.d("registrationName", "onDisappear")), C6502A.a("topHeaderHeightChange", d.d("registrationName", "onHeaderHeightChange")), C6502A.a("topHeaderBackButtonClicked", d.d("registrationName", "onHeaderBackButtonClicked")), C6502A.a("topTransitionProgress", d.d("registrationName", "onTransitionProgress")), C6502A.a("topSheetDetentChanged", d.d("registrationName", "onSheetDetentChanged")));
    }

    public String getName() {
        return REACT_CLASS;
    }

    public /* bridge */ /* synthetic */ void removeAllViews(View view) {
        super.removeAllViews(view);
    }

    public void setCustomAnimationOnSwipe(r rVar, boolean z10) {
    }

    public void setFullScreenSwipeEnabled(r rVar, boolean z10) {
    }

    public void setFullScreenSwipeShadowEnabled(r rVar, boolean z10) {
    }

    public void setGestureResponseDistance(r rVar, ReadableMap readableMap) {
    }

    public void setHideKeyboardOnSwipe(r rVar, boolean z10) {
    }

    public void setHomeIndicatorHidden(r rVar, boolean z10) {
    }

    public void setPreventNativeDismiss(r rVar, boolean z10) {
    }

    public void setSwipeDirection(r rVar, String str) {
    }

    public void setTransitionDuration(r rVar, int i10) {
    }

    /* access modifiers changed from: protected */
    public r createViewInstance(C3415h0 h0Var) {
        C6496s.h(h0Var, "reactContext");
        return new r(h0Var);
    }

    /* access modifiers changed from: protected */
    public void onAfterUpdateTransaction(r rVar) {
        C6496s.h(rVar, "view");
        super.onAfterUpdateTransaction(rVar);
        rVar.o();
    }

    public void removeView(r rVar, View view) {
        C6496s.h(rVar, "parent");
        C6496s.h(view, "view");
        super.removeView(rVar, view);
        if (view instanceof C4938w) {
            rVar.setFooter((C4938w) null);
        }
    }

    public void setActivityState(r rVar, float f10) {
        C6496s.h(rVar, "view");
        setActivityState(rVar, (int) f10);
    }

    @C3500a(defaultBoolean = true, name = "gestureEnabled")
    public void setGestureEnabled(r rVar, boolean z10) {
        C6496s.h(rVar, "view");
        rVar.setGestureEnabled(z10);
    }

    @C3500a(name = "nativeBackButtonDismissalEnabled")
    public void setNativeBackButtonDismissalEnabled(r rVar, boolean z10) {
        C6496s.h(rVar, "view");
        rVar.setNativeBackButtonDismissalEnabled(z10);
    }

    @C3500a(customType = "Color", name = "navigationBarColor")
    public void setNavigationBarColor(r rVar, Integer num) {
        C6496s.h(rVar, "view");
        rVar.setNavigationBarColor(num);
    }

    @C3500a(name = "navigationBarHidden")
    public void setNavigationBarHidden(r rVar, boolean z10) {
        C6496s.h(rVar, "view");
        rVar.setNavigationBarHidden(Boolean.valueOf(z10));
    }

    @C3500a(name = "navigationBarTranslucent")
    public void setNavigationBarTranslucent(r rVar, boolean z10) {
        C6496s.h(rVar, "view");
        rVar.setNavigationBarTranslucent(Boolean.valueOf(z10));
    }

    @C3500a(name = "replaceAnimation")
    public void setReplaceAnimation(r rVar, String str) {
        r.c cVar;
        C6496s.h(rVar, "view");
        if (str == null || C6496s.c(str, "pop")) {
            cVar = r.c.POP;
        } else if (C6496s.c(str, "push")) {
            cVar = r.c.PUSH;
        } else {
            throw new JSApplicationIllegalArgumentException("Unknown replace animation type " + str);
        }
        rVar.setReplaceAnimation(cVar);
    }

    @C3500a(name = "screenOrientation")
    public void setScreenOrientation(r rVar, String str) {
        C6496s.h(rVar, "view");
        rVar.setScreenOrientation(str);
    }

    @C3500a(name = "sheetAllowedDetents")
    public void setSheetAllowedDetents(r rVar, ReadableArray readableArray) {
        C6496s.h(rVar, "view");
        rVar.getSheetDetents().clear();
        if (readableArray == null || readableArray.size() == 0) {
            rVar.getSheetDetents().add(Double.valueOf(1.0d));
        } else {
            k.F(k.x(C6565s.b0(g.f62817d.a(0, readableArray.size() - 1, 1)), new K(readableArray)), rVar.getSheetDetents());
        }
    }

    @C3500a(name = "sheetCornerRadius")
    public void setSheetCornerRadius(r rVar, float f10) {
        C6496s.h(rVar, "view");
        rVar.setSheetCornerRadius(f10);
    }

    @C3500a(name = "sheetElevation")
    public void setSheetElevation(r rVar, int i10) {
        if (rVar != null) {
            rVar.setSheetElevation((float) i10);
        }
    }

    @C3500a(name = "sheetExpandsWhenScrolledToEdge")
    public void setSheetExpandsWhenScrolledToEdge(r rVar, boolean z10) {
        C6496s.h(rVar, "view");
        rVar.setSheetExpandsWhenScrolledToEdge(z10);
    }

    @C3500a(name = "sheetGrabberVisible")
    public void setSheetGrabberVisible(r rVar, boolean z10) {
        C6496s.h(rVar, "view");
        rVar.setSheetGrabberVisible(z10);
    }

    @C3500a(name = "sheetInitialDetent")
    public void setSheetInitialDetent(r rVar, int i10) {
        C6496s.h(rVar, "view");
        rVar.setSheetInitialDetentIndex(i10);
    }

    @C3500a(name = "sheetLargestUndimmedDetent")
    public void setSheetLargestUndimmedDetent(r rVar, int i10) {
        C6496s.h(rVar, "view");
        if (-1 > i10 || i10 >= 3) {
            throw new IllegalStateException("[RNScreens] sheetLargestUndimmedDetent on Android supports values between -1 and 2");
        }
        rVar.setSheetLargestUndimmedDetentIndex(i10);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x004e, code lost:
        if (r4.equals("flip") != false) goto L_0x009d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0083, code lost:
        if (r4.equals("simple_push") != false) goto L_0x009d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x009c, code lost:
        throw new com.facebook.react.bridge.JSApplicationIllegalArgumentException("Unknown animation type " + r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0022, code lost:
        if (r4.equals("default") != false) goto L_0x009d;
     */
    @e8.C3500a(name = "stackAnimation")
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void setStackAnimation(com.swmansion.rnscreens.r r3, java.lang.String r4) {
        /*
            r2 = this;
            java.lang.String r0 = "view"
            kotlin.jvm.internal.C6496s.h(r3, r0)
            if (r4 == 0) goto L_0x009d
            int r0 = r4.hashCode()
            switch(r0) {
                case -1418955385: goto L_0x007d;
                case -1198710326: goto L_0x0072;
                case -427095442: goto L_0x0067;
                case -349395819: goto L_0x005c;
                case 3135100: goto L_0x0051;
                case 3145837: goto L_0x0048;
                case 3387192: goto L_0x003d;
                case 182437661: goto L_0x0032;
                case 1500346553: goto L_0x0026;
                case 1544803905: goto L_0x001c;
                case 1601504978: goto L_0x0010;
                default: goto L_0x000e;
            }
        L_0x000e:
            goto L_0x0086
        L_0x0010:
            java.lang.String r0 = "slide_from_bottom"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x0086
            com.swmansion.rnscreens.r$d r4 = com.swmansion.rnscreens.r.d.SLIDE_FROM_BOTTOM
            goto L_0x009f
        L_0x001c:
            java.lang.String r0 = "default"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x0086
            goto L_0x009d
        L_0x0026:
            java.lang.String r0 = "ios_from_right"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x0086
            com.swmansion.rnscreens.r$d r4 = com.swmansion.rnscreens.r.d.IOS_FROM_RIGHT
            goto L_0x009f
        L_0x0032:
            java.lang.String r0 = "fade_from_bottom"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x0086
            com.swmansion.rnscreens.r$d r4 = com.swmansion.rnscreens.r.d.FADE_FROM_BOTTOM
            goto L_0x009f
        L_0x003d:
            java.lang.String r0 = "none"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x0086
            com.swmansion.rnscreens.r$d r4 = com.swmansion.rnscreens.r.d.NONE
            goto L_0x009f
        L_0x0048:
            java.lang.String r0 = "flip"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x0086
            goto L_0x009d
        L_0x0051:
            java.lang.String r0 = "fade"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x0086
            com.swmansion.rnscreens.r$d r4 = com.swmansion.rnscreens.r.d.FADE
            goto L_0x009f
        L_0x005c:
            java.lang.String r0 = "slide_from_right"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x0086
            com.swmansion.rnscreens.r$d r4 = com.swmansion.rnscreens.r.d.SLIDE_FROM_RIGHT
            goto L_0x009f
        L_0x0067:
            java.lang.String r0 = "slide_from_left"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x0086
            com.swmansion.rnscreens.r$d r4 = com.swmansion.rnscreens.r.d.SLIDE_FROM_LEFT
            goto L_0x009f
        L_0x0072:
            java.lang.String r0 = "ios_from_left"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x0086
            com.swmansion.rnscreens.r$d r4 = com.swmansion.rnscreens.r.d.IOS_FROM_LEFT
            goto L_0x009f
        L_0x007d:
            java.lang.String r0 = "simple_push"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x0086
            goto L_0x009d
        L_0x0086:
            com.facebook.react.bridge.JSApplicationIllegalArgumentException r3 = new com.facebook.react.bridge.JSApplicationIllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Unknown animation type "
            r0.append(r1)
            r0.append(r4)
            java.lang.String r4 = r0.toString()
            r3.<init>(r4)
            throw r3
        L_0x009d:
            com.swmansion.rnscreens.r$d r4 = com.swmansion.rnscreens.r.d.DEFAULT
        L_0x009f:
            r3.setStackAnimation(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.swmansion.rnscreens.ScreenViewManager.setStackAnimation(com.swmansion.rnscreens.r, java.lang.String):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0029, code lost:
        if (r4.equals("containedTransparentModal") != false) goto L_0x0053;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0032, code lost:
        if (r4.equals("containedModal") != false) goto L_0x003d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x003b, code lost:
        if (r4.equals("modal") != false) goto L_0x003d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x003d, code lost:
        r4 = com.swmansion.rnscreens.r.e.f59887b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0051, code lost:
        if (r4.equals("transparentModal") != false) goto L_0x0053;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0053, code lost:
        r4 = com.swmansion.rnscreens.r.e.f59888c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0055, code lost:
        r3.setStackPresentation(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0058, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0020, code lost:
        if (r4.equals("fullScreenModal") != false) goto L_0x003d;
     */
    @e8.C3500a(name = "stackPresentation")
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void setStackPresentation(com.swmansion.rnscreens.r r3, java.lang.String r4) {
        /*
            r2 = this;
            java.lang.String r0 = "view"
            kotlin.jvm.internal.C6496s.h(r3, r0)
            if (r4 == 0) goto L_0x0059
            int r0 = r4.hashCode()
            switch(r0) {
                case -76271493: goto L_0x004b;
                case 3452698: goto L_0x0040;
                case 104069805: goto L_0x0035;
                case 438078970: goto L_0x002c;
                case 955284238: goto L_0x0023;
                case 1171936146: goto L_0x001a;
                case 1798290171: goto L_0x000f;
                default: goto L_0x000e;
            }
        L_0x000e:
            goto L_0x0059
        L_0x000f:
            java.lang.String r0 = "formSheet"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x0059
            com.swmansion.rnscreens.r$e r4 = com.swmansion.rnscreens.r.e.FORM_SHEET
            goto L_0x0055
        L_0x001a:
            java.lang.String r0 = "fullScreenModal"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x0059
            goto L_0x003d
        L_0x0023:
            java.lang.String r0 = "containedTransparentModal"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x0059
            goto L_0x0053
        L_0x002c:
            java.lang.String r0 = "containedModal"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x0059
            goto L_0x003d
        L_0x0035:
            java.lang.String r0 = "modal"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x0059
        L_0x003d:
            com.swmansion.rnscreens.r$e r4 = com.swmansion.rnscreens.r.e.MODAL
            goto L_0x0055
        L_0x0040:
            java.lang.String r0 = "push"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x0059
            com.swmansion.rnscreens.r$e r4 = com.swmansion.rnscreens.r.e.PUSH
            goto L_0x0055
        L_0x004b:
            java.lang.String r0 = "transparentModal"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x0059
        L_0x0053:
            com.swmansion.rnscreens.r$e r4 = com.swmansion.rnscreens.r.e.TRANSPARENT_MODAL
        L_0x0055:
            r3.setStackPresentation(r4)
            return
        L_0x0059:
            com.facebook.react.bridge.JSApplicationIllegalArgumentException r3 = new com.facebook.react.bridge.JSApplicationIllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Unknown presentation type "
            r0.append(r1)
            r0.append(r4)
            java.lang.String r4 = r0.toString()
            r3.<init>(r4)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.swmansion.rnscreens.ScreenViewManager.setStackPresentation(com.swmansion.rnscreens.r, java.lang.String):void");
    }

    @C3500a(name = "statusBarAnimation")
    public void setStatusBarAnimation(r rVar, String str) {
        C6496s.h(rVar, "view");
        rVar.setStatusBarAnimated(Boolean.valueOf(str != null && !C6496s.c("none", str)));
    }

    @C3500a(customType = "Color", name = "statusBarColor")
    public void setStatusBarColor(r rVar, Integer num) {
        C6496s.h(rVar, "view");
        rVar.setStatusBarColor(num);
    }

    @C3500a(name = "statusBarHidden")
    public void setStatusBarHidden(r rVar, boolean z10) {
        C6496s.h(rVar, "view");
        rVar.setStatusBarHidden(Boolean.valueOf(z10));
    }

    @C3500a(name = "statusBarStyle")
    public void setStatusBarStyle(r rVar, String str) {
        C6496s.h(rVar, "view");
        rVar.setStatusBarStyle(str);
    }

    @C3500a(name = "statusBarTranslucent")
    public void setStatusBarTranslucent(r rVar, boolean z10) {
        C6496s.h(rVar, "view");
        rVar.setStatusBarTranslucent(Boolean.valueOf(z10));
    }

    public Object updateState(r rVar, W w10, C3413g0 g0Var) {
        C6496s.h(rVar, "view");
        rVar.setStateWrapper(g0Var);
        return super.updateState(rVar, w10, g0Var);
    }

    public void addView(r rVar, View view, int i10) {
        C6496s.h(rVar, "parent");
        C6496s.h(view, "child");
        if (view instanceof C4936u) {
            rVar.q((C4936u) view);
        } else if (view instanceof C4938w) {
            rVar.setFooter((C4938w) view);
        }
        super.addView(rVar, view, i10);
    }

    public void removeViewAt(r rVar, int i10) {
        C6496s.h(rVar, "parent");
        if (rVar.getChildAt(i10) instanceof C4938w) {
            rVar.setFooter((C4938w) null);
        }
        super.removeViewAt(rVar, i10);
    }

    @C3500a(name = "activityState")
    public final void setActivityState(r rVar, int i10) {
        C6496s.h(rVar, "view");
        if (i10 != -1) {
            if (i10 == 0) {
                rVar.setActivityState(r.a.INACTIVE);
            } else if (i10 == 1) {
                rVar.setActivityState(r.a.TRANSITIONING_OR_BELOW_TOP);
            } else if (i10 == 2) {
                rVar.setActivityState(r.a.ON_TOP);
            }
        }
    }
}
