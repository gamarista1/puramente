package com.facebook.react.modules.accessibilityinfo;

import android.annotation.TargetApi;
import android.content.ContentResolver;
import android.database.ContentObserver;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.provider.Settings;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import com.facebook.fbreact.specs.NativeAccessibilityInfoSpec;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.LifecycleEventListener;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.UiThreadUtil;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Q7.a(name = "AccessibilityInfo")
@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u000e\b\u0001\u0018\u0000 J2\u00020\u00012\u00020\u0002:\u0003KLMB\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\n\u0010\tJ\u000f\u0010\u000b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u000b\u0010\tJ\u0017\u0010\u000e\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0010\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0011\u0010\tJ\u0017\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0016\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0016\u0010\u0015J\u0017\u0010\u0017\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0017\u0010\u0015J\u0017\u0010\u0018\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0018\u0010\u0015J\u0017\u0010\u0019\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0019\u0010\u0015J\u0017\u0010\u001a\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u001a\u0010\u0015J\u000f\u0010\u001b\u001a\u00020\u0007H\u0017¢\u0006\u0004\b\u001b\u0010\tJ\u000f\u0010\u001c\u001a\u00020\u0007H\u0017¢\u0006\u0004\b\u001c\u0010\tJ\u000f\u0010\u001d\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u001d\u0010\tJ\u000f\u0010\u001e\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u001e\u0010\tJ\u000f\u0010\u001f\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u001f\u0010\tJ\u0019\u0010\"\u001a\u00020\u00072\b\u0010!\u001a\u0004\u0018\u00010 H\u0016¢\u0006\u0004\b\"\u0010#J\u0017\u0010&\u001a\u00020\u00072\u0006\u0010%\u001a\u00020$H\u0016¢\u0006\u0004\b&\u0010'J\u001f\u0010)\u001a\u00020\u00072\u0006\u0010(\u001a\u00020$2\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b)\u0010*R\u0014\u0010,\u001a\u00020+8\u0002X\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0014\u0010.\u001a\u00020+8\u0002X\u0004¢\u0006\u0006\n\u0004\b.\u0010-R\u0016\u00100\u001a\u0004\u0018\u00010/8\u0002X\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u0018\u00103\u001a\u000602R\u00020\u00008\u0002X\u0004¢\u0006\u0006\n\u0004\b3\u00104R\u0018\u00106\u001a\u000605R\u00020\u00008\u0002X\u0004¢\u0006\u0006\n\u0004\b6\u00107R\u0014\u00109\u001a\u0002088\u0002X\u0004¢\u0006\u0006\n\u0004\b9\u0010:R\u0016\u0010;\u001a\u00020\f8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b;\u0010<R\u0016\u0010=\u001a\u00020\f8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b=\u0010<R\u0016\u0010>\u001a\u00020\f8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b>\u0010<R\u0016\u0010?\u001a\u00020\f8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b?\u0010<R\u0016\u0010A\u001a\u00020@8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bA\u0010BR\u0016\u0010C\u001a\u00020\f8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bC\u0010<R\u0016\u0010D\u001a\u00020\f8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bD\u0010<R\u0014\u0010E\u001a\u00020\f8CX\u0004¢\u0006\u0006\u001a\u0004\bE\u0010FR\u0014\u0010G\u001a\u00020\f8CX\u0004¢\u0006\u0006\u001a\u0004\bG\u0010FR\u0014\u0010H\u001a\u00020\f8CX\u0004¢\u0006\u0006\u001a\u0004\bH\u0010FR\u0014\u0010I\u001a\u00020\f8CX\u0004¢\u0006\u0006\u001a\u0004\bI\u0010F¨\u0006N"}, d2 = {"Lcom/facebook/react/modules/accessibilityinfo/AccessibilityInfoModule;", "Lcom/facebook/fbreact/specs/NativeAccessibilityInfoSpec;", "Lcom/facebook/react/bridge/LifecycleEventListener;", "Lcom/facebook/react/bridge/ReactApplicationContext;", "context", "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "Llf/M;", "updateAndSendReduceMotionChangeEvent", "()V", "updateAndSendInvertColorsChangeEvent", "updateAndSendHighTextContrastChangeEvent", "", "enabled", "updateAndSendTouchExplorationChangeEvent", "(Z)V", "updateAndSendAccessibilityServiceChangeEvent", "updateAndSendGrayscaleModeChangeEvent", "Lcom/facebook/react/bridge/Callback;", "successCallback", "isReduceMotionEnabled", "(Lcom/facebook/react/bridge/Callback;)V", "isInvertColorsEnabled", "isGrayscaleEnabled", "isHighTextContrastEnabled", "isTouchExplorationEnabled", "isAccessibilityServiceEnabled", "onHostResume", "onHostPause", "initialize", "invalidate", "onHostDestroy", "", "message", "announceForAccessibility", "(Ljava/lang/String;)V", "", "reactTag", "setAccessibilityFocus", "(D)V", "originalTimeout", "getRecommendedTimeoutMillis", "(DLcom/facebook/react/bridge/Callback;)V", "Landroid/database/ContentObserver;", "animationScaleObserver", "Landroid/database/ContentObserver;", "highTextContrastObserver", "Landroid/view/accessibility/AccessibilityManager;", "accessibilityManager", "Landroid/view/accessibility/AccessibilityManager;", "Lcom/facebook/react/modules/accessibilityinfo/AccessibilityInfoModule$c;", "touchExplorationStateChangeListener", "Lcom/facebook/react/modules/accessibilityinfo/AccessibilityInfoModule$c;", "Lcom/facebook/react/modules/accessibilityinfo/AccessibilityInfoModule$b;", "accessibilityServiceChangeListener", "Lcom/facebook/react/modules/accessibilityinfo/AccessibilityInfoModule$b;", "Landroid/content/ContentResolver;", "contentResolver", "Landroid/content/ContentResolver;", "reduceMotionEnabled", "Z", "highTextContrastEnabled", "touchExplorationEnabled", "accessibilityServiceEnabled", "", "recommendedTimeout", "I", "invertColorsEnabled", "grayscaleModeEnabled", "isReduceMotionEnabledValue", "()Z", "isInvertColorsEnabledValue", "isGrayscaleEnabledValue", "isHighTextContrastEnabledValue", "Companion", "c", "b", "a", "ReactAndroid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class AccessibilityInfoModule extends NativeAccessibilityInfoSpec implements LifecycleEventListener {
    private static final String ACCESSIBILITY_HIGH_TEXT_CONTRAST_ENABLED_CONSTANT = "high_text_contrast_enabled";
    private static final String ACCESSIBILITY_SERVICE_EVENT_NAME = "accessibilityServiceDidChange";
    public static final a Companion = new a((DefaultConstructorMarker) null);
    private static final String GRAYSCALE_MODE_EVENT_NAME = "grayscaleModeDidChange";
    private static final String HIGH_TEXT_CONTRAST_EVENT_NAME = "highTextContrastDidChange";
    private static final String INVERT_COLOR_EVENT_NAME = "invertColorDidChange";
    public static final String NAME = "AccessibilityInfo";
    private static final String REDUCE_MOTION_EVENT_NAME = "reduceMotionDidChange";
    private static final String TOUCH_EXPLORATION_EVENT_NAME = "touchExplorationDidChange";
    private final AccessibilityManager accessibilityManager;
    private final b accessibilityServiceChangeListener = new b();
    private boolean accessibilityServiceEnabled;
    private final ContentObserver animationScaleObserver = new d(this, UiThreadUtil.getUiThreadHandler());
    private final ContentResolver contentResolver;
    private boolean grayscaleModeEnabled;
    private boolean highTextContrastEnabled;
    private final ContentObserver highTextContrastObserver = new e(this, UiThreadUtil.getUiThreadHandler());
    private boolean invertColorsEnabled;
    private int recommendedTimeout;
    private boolean reduceMotionEnabled;
    private boolean touchExplorationEnabled;
    private final c touchExplorationStateChangeListener = new c();

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    private final class b implements AccessibilityManager.AccessibilityStateChangeListener {
        public b() {
        }

        public void onAccessibilityStateChanged(boolean z10) {
            AccessibilityInfoModule.this.updateAndSendAccessibilityServiceChangeEvent(z10);
        }
    }

    private final class c implements AccessibilityManager.TouchExplorationStateChangeListener {
        public c() {
        }

        public void onTouchExplorationStateChanged(boolean z10) {
            AccessibilityInfoModule.this.updateAndSendTouchExplorationChangeEvent(z10);
        }
    }

    public static final class d extends ContentObserver {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ AccessibilityInfoModule f40960a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(AccessibilityInfoModule accessibilityInfoModule, Handler handler) {
            super(handler);
            this.f40960a = accessibilityInfoModule;
        }

        public void onChange(boolean z10) {
            onChange(z10, (Uri) null);
        }

        public void onChange(boolean z10, Uri uri) {
            if (this.f40960a.getReactApplicationContext().hasActiveReactInstance()) {
                this.f40960a.updateAndSendReduceMotionChangeEvent();
            }
        }
    }

    public static final class e extends ContentObserver {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ AccessibilityInfoModule f40961a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(AccessibilityInfoModule accessibilityInfoModule, Handler handler) {
            super(handler);
            this.f40961a = accessibilityInfoModule;
        }

        public void onChange(boolean z10) {
            onChange(z10, (Uri) null);
        }

        public void onChange(boolean z10, Uri uri) {
            if (this.f40961a.getReactApplicationContext().hasActiveReactInstance()) {
                this.f40961a.updateAndSendHighTextContrastChangeEvent();
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AccessibilityInfoModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        C6496s.h(reactApplicationContext, "context");
        Object systemService = reactApplicationContext.getApplicationContext().getSystemService("accessibility");
        C6496s.f(systemService, "null cannot be cast to non-null type android.view.accessibility.AccessibilityManager");
        AccessibilityManager accessibilityManager2 = (AccessibilityManager) systemService;
        this.accessibilityManager = accessibilityManager2;
        this.contentResolver = getReactApplicationContext().getContentResolver();
        this.touchExplorationEnabled = accessibilityManager2.isTouchExplorationEnabled();
        this.accessibilityServiceEnabled = accessibilityManager2.isEnabled();
        this.reduceMotionEnabled = isReduceMotionEnabledValue();
        this.highTextContrastEnabled = isHighTextContrastEnabledValue();
        this.grayscaleModeEnabled = isGrayscaleEnabledValue();
    }

    @TargetApi(21)
    private final boolean isGrayscaleEnabledValue() {
        try {
            if (Settings.Secure.getInt(this.contentResolver, "accessibility_display_daltonizer_enabled") == 1 && Settings.Secure.getInt(this.contentResolver, "accessibility_display_daltonizer") == 0) {
                return true;
            }
            return false;
        } catch (Settings.SettingNotFoundException unused) {
            return false;
        }
    }

    @TargetApi(21)
    private final boolean isHighTextContrastEnabledValue() {
        if (Settings.Secure.getInt(this.contentResolver, ACCESSIBILITY_HIGH_TEXT_CONTRAST_ENABLED_CONSTANT, 0) != 0) {
            return true;
        }
        return false;
    }

    @TargetApi(21)
    private final boolean isInvertColorsEnabledValue() {
        try {
            if (Settings.Secure.getInt(this.contentResolver, "accessibility_display_inversion_enabled") == 1) {
                return true;
            }
            return false;
        } catch (Settings.SettingNotFoundException unused) {
            return false;
        }
    }

    @TargetApi(21)
    private final boolean isReduceMotionEnabledValue() {
        float f10;
        String string = Settings.Global.getString(this.contentResolver, "transition_animation_scale");
        if (string != null) {
            f10 = Float.parseFloat(string);
        } else {
            f10 = 1.0f;
        }
        if (f10 == 0.0f) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: private */
    public final void updateAndSendAccessibilityServiceChangeEvent(boolean z10) {
        if (this.accessibilityServiceEnabled != z10) {
            this.accessibilityServiceEnabled = z10;
            if (getReactApplicationContextIfActiveOrWarn() != null) {
                getReactApplicationContext().emitDeviceEvent(ACCESSIBILITY_SERVICE_EVENT_NAME, Boolean.valueOf(this.accessibilityServiceEnabled));
            }
        }
    }

    private final void updateAndSendGrayscaleModeChangeEvent() {
        boolean isGrayscaleEnabledValue = isGrayscaleEnabledValue();
        if (this.grayscaleModeEnabled != isGrayscaleEnabledValue) {
            this.grayscaleModeEnabled = isGrayscaleEnabledValue;
            ReactApplicationContext reactApplicationContextIfActiveOrWarn = getReactApplicationContextIfActiveOrWarn();
            if (reactApplicationContextIfActiveOrWarn != null) {
                reactApplicationContextIfActiveOrWarn.emitDeviceEvent(GRAYSCALE_MODE_EVENT_NAME, Boolean.valueOf(this.grayscaleModeEnabled));
            }
        }
    }

    /* access modifiers changed from: private */
    public final void updateAndSendHighTextContrastChangeEvent() {
        boolean isHighTextContrastEnabledValue = isHighTextContrastEnabledValue();
        if (this.highTextContrastEnabled != isHighTextContrastEnabledValue) {
            this.highTextContrastEnabled = isHighTextContrastEnabledValue;
            ReactApplicationContext reactApplicationContextIfActiveOrWarn = getReactApplicationContextIfActiveOrWarn();
            if (reactApplicationContextIfActiveOrWarn != null) {
                reactApplicationContextIfActiveOrWarn.emitDeviceEvent(HIGH_TEXT_CONTRAST_EVENT_NAME, Boolean.valueOf(this.highTextContrastEnabled));
            }
        }
    }

    private final void updateAndSendInvertColorsChangeEvent() {
        boolean isInvertColorsEnabledValue = isInvertColorsEnabledValue();
        if (this.invertColorsEnabled != isInvertColorsEnabledValue) {
            this.invertColorsEnabled = isInvertColorsEnabledValue;
            ReactApplicationContext reactApplicationContextIfActiveOrWarn = getReactApplicationContextIfActiveOrWarn();
            if (reactApplicationContextIfActiveOrWarn != null) {
                reactApplicationContextIfActiveOrWarn.emitDeviceEvent(INVERT_COLOR_EVENT_NAME, Boolean.valueOf(this.invertColorsEnabled));
            }
        }
    }

    /* access modifiers changed from: private */
    public final void updateAndSendReduceMotionChangeEvent() {
        boolean isReduceMotionEnabledValue = isReduceMotionEnabledValue();
        if (this.reduceMotionEnabled != isReduceMotionEnabledValue) {
            this.reduceMotionEnabled = isReduceMotionEnabledValue;
            ReactApplicationContext reactApplicationContextIfActiveOrWarn = getReactApplicationContextIfActiveOrWarn();
            if (reactApplicationContextIfActiveOrWarn != null) {
                reactApplicationContextIfActiveOrWarn.emitDeviceEvent(REDUCE_MOTION_EVENT_NAME, Boolean.valueOf(this.reduceMotionEnabled));
            }
        }
    }

    /* access modifiers changed from: private */
    public final void updateAndSendTouchExplorationChangeEvent(boolean z10) {
        if (this.touchExplorationEnabled != z10) {
            this.touchExplorationEnabled = z10;
            if (getReactApplicationContextIfActiveOrWarn() != null) {
                getReactApplicationContext().emitDeviceEvent(TOUCH_EXPLORATION_EVENT_NAME, Boolean.valueOf(this.touchExplorationEnabled));
            }
        }
    }

    public void announceForAccessibility(String str) {
        AccessibilityManager accessibilityManager2 = this.accessibilityManager;
        if (accessibilityManager2 != null && accessibilityManager2.isEnabled()) {
            AccessibilityEvent obtain = AccessibilityEvent.obtain(16384);
            obtain.getText().add(str);
            obtain.setClassName(AccessibilityInfoModule.class.getName());
            obtain.setPackageName(getReactApplicationContext().getPackageName());
            this.accessibilityManager.sendAccessibilityEvent(obtain);
        }
    }

    public void getRecommendedTimeoutMillis(double d10, Callback callback) {
        int i10;
        C6496s.h(callback, "successCallback");
        if (Build.VERSION.SDK_INT < 29) {
            callback.invoke(Integer.valueOf((int) d10));
            return;
        }
        AccessibilityManager accessibilityManager2 = this.accessibilityManager;
        if (accessibilityManager2 != null) {
            i10 = accessibilityManager2.getRecommendedTimeoutMillis((int) d10, 4);
        } else {
            i10 = 0;
        }
        this.recommendedTimeout = i10;
        callback.invoke(Integer.valueOf(i10));
    }

    public void initialize() {
        boolean z10;
        getReactApplicationContext().addLifecycleEventListener(this);
        AccessibilityManager accessibilityManager2 = this.accessibilityManager;
        boolean z11 = false;
        if (accessibilityManager2 == null || !accessibilityManager2.isTouchExplorationEnabled()) {
            z10 = false;
        } else {
            z10 = true;
        }
        updateAndSendTouchExplorationChangeEvent(z10);
        AccessibilityManager accessibilityManager3 = this.accessibilityManager;
        if (accessibilityManager3 != null && accessibilityManager3.isEnabled()) {
            z11 = true;
        }
        updateAndSendAccessibilityServiceChangeEvent(z11);
        updateAndSendReduceMotionChangeEvent();
        updateAndSendHighTextContrastChangeEvent();
    }

    public void invalidate() {
        getReactApplicationContext().removeLifecycleEventListener(this);
        super.invalidate();
    }

    public void isAccessibilityServiceEnabled(Callback callback) {
        C6496s.h(callback, "successCallback");
        callback.invoke(Boolean.valueOf(this.accessibilityServiceEnabled));
    }

    public void isGrayscaleEnabled(Callback callback) {
        C6496s.h(callback, "successCallback");
        callback.invoke(Boolean.valueOf(this.grayscaleModeEnabled));
    }

    public void isHighTextContrastEnabled(Callback callback) {
        C6496s.h(callback, "successCallback");
        callback.invoke(Boolean.valueOf(this.highTextContrastEnabled));
    }

    public void isInvertColorsEnabled(Callback callback) {
        C6496s.h(callback, "successCallback");
        callback.invoke(Boolean.valueOf(this.invertColorsEnabled));
    }

    public void isReduceMotionEnabled(Callback callback) {
        C6496s.h(callback, "successCallback");
        callback.invoke(Boolean.valueOf(this.reduceMotionEnabled));
    }

    public void isTouchExplorationEnabled(Callback callback) {
        C6496s.h(callback, "successCallback");
        callback.invoke(Boolean.valueOf(this.touchExplorationEnabled));
    }

    public void onHostDestroy() {
    }

    @TargetApi(21)
    public void onHostPause() {
        AccessibilityManager accessibilityManager2 = this.accessibilityManager;
        if (accessibilityManager2 != null) {
            accessibilityManager2.removeTouchExplorationStateChangeListener(this.touchExplorationStateChangeListener);
        }
        AccessibilityManager accessibilityManager3 = this.accessibilityManager;
        if (accessibilityManager3 != null) {
            accessibilityManager3.removeAccessibilityStateChangeListener(this.accessibilityServiceChangeListener);
        }
        this.contentResolver.unregisterContentObserver(this.animationScaleObserver);
        this.contentResolver.unregisterContentObserver(this.highTextContrastObserver);
    }

    @TargetApi(21)
    public void onHostResume() {
        boolean z10;
        AccessibilityManager accessibilityManager2 = this.accessibilityManager;
        if (accessibilityManager2 != null) {
            accessibilityManager2.addTouchExplorationStateChangeListener(this.touchExplorationStateChangeListener);
        }
        AccessibilityManager accessibilityManager3 = this.accessibilityManager;
        if (accessibilityManager3 != null) {
            accessibilityManager3.addAccessibilityStateChangeListener(this.accessibilityServiceChangeListener);
        }
        boolean z11 = false;
        this.contentResolver.registerContentObserver(Settings.Global.getUriFor("transition_animation_scale"), false, this.animationScaleObserver);
        this.contentResolver.registerContentObserver(Settings.Global.getUriFor(ACCESSIBILITY_HIGH_TEXT_CONTRAST_ENABLED_CONSTANT), false, this.highTextContrastObserver);
        AccessibilityManager accessibilityManager4 = this.accessibilityManager;
        if (accessibilityManager4 == null || !accessibilityManager4.isTouchExplorationEnabled()) {
            z10 = false;
        } else {
            z10 = true;
        }
        updateAndSendTouchExplorationChangeEvent(z10);
        AccessibilityManager accessibilityManager5 = this.accessibilityManager;
        if (accessibilityManager5 != null && accessibilityManager5.isEnabled()) {
            z11 = true;
        }
        updateAndSendAccessibilityServiceChangeEvent(z11);
        updateAndSendReduceMotionChangeEvent();
        updateAndSendHighTextContrastChangeEvent();
        updateAndSendInvertColorsChangeEvent();
        updateAndSendGrayscaleModeChangeEvent();
    }

    public void setAccessibilityFocus(double d10) {
    }
}
