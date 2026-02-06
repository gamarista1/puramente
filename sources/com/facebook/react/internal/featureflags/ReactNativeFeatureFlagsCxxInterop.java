package com.facebook.react.internal.featureflags;

import B7.a;
import com.facebook.soloader.SoLoader;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b/\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004H ¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0004H ¢\u0006\u0004\b\u0007\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0004H ¢\u0006\u0004\b\b\u0010\u0006J\u0010\u0010\t\u001a\u00020\u0004H ¢\u0006\u0004\b\t\u0010\u0006J\u0010\u0010\n\u001a\u00020\u0004H ¢\u0006\u0004\b\n\u0010\u0006J\u0010\u0010\u000b\u001a\u00020\u0004H ¢\u0006\u0004\b\u000b\u0010\u0006J\u0010\u0010\f\u001a\u00020\u0004H ¢\u0006\u0004\b\f\u0010\u0006J\u0010\u0010\r\u001a\u00020\u0004H ¢\u0006\u0004\b\r\u0010\u0006J\u0010\u0010\u000e\u001a\u00020\u0004H ¢\u0006\u0004\b\u000e\u0010\u0006J\u0010\u0010\u000f\u001a\u00020\u0004H ¢\u0006\u0004\b\u000f\u0010\u0006J\u0010\u0010\u0010\u001a\u00020\u0004H ¢\u0006\u0004\b\u0010\u0010\u0006J\u0010\u0010\u0011\u001a\u00020\u0004H ¢\u0006\u0004\b\u0011\u0010\u0006J\u0010\u0010\u0012\u001a\u00020\u0004H ¢\u0006\u0004\b\u0012\u0010\u0006J\u0010\u0010\u0013\u001a\u00020\u0004H ¢\u0006\u0004\b\u0013\u0010\u0006J\u0010\u0010\u0014\u001a\u00020\u0004H ¢\u0006\u0004\b\u0014\u0010\u0006J\u0010\u0010\u0015\u001a\u00020\u0004H ¢\u0006\u0004\b\u0015\u0010\u0006J\u0010\u0010\u0016\u001a\u00020\u0004H ¢\u0006\u0004\b\u0016\u0010\u0006J\u0010\u0010\u0017\u001a\u00020\u0004H ¢\u0006\u0004\b\u0017\u0010\u0006J\u0010\u0010\u0018\u001a\u00020\u0004H ¢\u0006\u0004\b\u0018\u0010\u0006J\u0010\u0010\u0019\u001a\u00020\u0004H ¢\u0006\u0004\b\u0019\u0010\u0006J\u0010\u0010\u001a\u001a\u00020\u0004H ¢\u0006\u0004\b\u001a\u0010\u0006J\u0010\u0010\u001b\u001a\u00020\u0004H ¢\u0006\u0004\b\u001b\u0010\u0006J\u0010\u0010\u001c\u001a\u00020\u0004H ¢\u0006\u0004\b\u001c\u0010\u0006J\u0010\u0010\u001d\u001a\u00020\u0004H ¢\u0006\u0004\b\u001d\u0010\u0006J\u0010\u0010\u001e\u001a\u00020\u0004H ¢\u0006\u0004\b\u001e\u0010\u0006J\u0010\u0010\u001f\u001a\u00020\u0004H ¢\u0006\u0004\b\u001f\u0010\u0006J\u0010\u0010 \u001a\u00020\u0004H ¢\u0006\u0004\b \u0010\u0006J\u0010\u0010!\u001a\u00020\u0004H ¢\u0006\u0004\b!\u0010\u0006J\u0010\u0010\"\u001a\u00020\u0004H ¢\u0006\u0004\b\"\u0010\u0006J\u0010\u0010#\u001a\u00020\u0004H ¢\u0006\u0004\b#\u0010\u0006J\u0010\u0010$\u001a\u00020\u0004H ¢\u0006\u0004\b$\u0010\u0006J\u0010\u0010%\u001a\u00020\u0004H ¢\u0006\u0004\b%\u0010\u0006J\u0010\u0010&\u001a\u00020\u0004H ¢\u0006\u0004\b&\u0010\u0006J\u0010\u0010'\u001a\u00020\u0004H ¢\u0006\u0004\b'\u0010\u0006J\u0010\u0010(\u001a\u00020\u0004H ¢\u0006\u0004\b(\u0010\u0006J\u0010\u0010)\u001a\u00020\u0004H ¢\u0006\u0004\b)\u0010\u0006J\u0010\u0010*\u001a\u00020\u0004H ¢\u0006\u0004\b*\u0010\u0006J\u0010\u0010+\u001a\u00020\u0004H ¢\u0006\u0004\b+\u0010\u0006J\u0010\u0010,\u001a\u00020\u0004H ¢\u0006\u0004\b,\u0010\u0006J\u0010\u0010-\u001a\u00020\u0004H ¢\u0006\u0004\b-\u0010\u0006J\u0010\u0010.\u001a\u00020\u0004H ¢\u0006\u0004\b.\u0010\u0006J\u0010\u0010/\u001a\u00020\u0004H ¢\u0006\u0004\b/\u0010\u0006J\u0010\u00100\u001a\u00020\u0004H ¢\u0006\u0004\b0\u0010\u0006J\u0010\u00101\u001a\u00020\u0004H ¢\u0006\u0004\b1\u0010\u0006J\u0010\u00102\u001a\u00020\u0004H ¢\u0006\u0004\b2\u0010\u0006J\u0018\u00105\u001a\u0002042\u0006\u00103\u001a\u00020\u0001H ¢\u0006\u0004\b5\u00106J\u0010\u00107\u001a\u000204H ¢\u0006\u0004\b7\u0010\u0003J\u001a\u00109\u001a\u0004\u0018\u0001082\u0006\u00103\u001a\u00020\u0001H ¢\u0006\u0004\b9\u0010:¨\u0006;"}, d2 = {"Lcom/facebook/react/internal/featureflags/ReactNativeFeatureFlagsCxxInterop;", "", "<init>", "()V", "", "commonTestFlag", "()Z", "completeReactInstanceCreationOnBgThreadOnAndroid", "disableEventLoopOnBridgeless", "disableMountItemReorderingAndroid", "enableAlignItemsBaselineOnFabricIOS", "enableAndroidLineHeightCentering", "enableBridgelessArchitecture", "enableCppPropsIteratorSetter", "enableDeletionOfUnmountedViews", "enableEagerRootViewAttachment", "enableEventEmitterRetentionDuringGesturesOnAndroid", "enableFabricLogs", "enableFabricRenderer", "enableFabricRendererExclusively", "enableFixForViewCommandRace", "enableGranularShadowTreeStateReconciliation", "enableIOSViewClipToPaddingBox", "enableLayoutAnimationsOnAndroid", "enableLayoutAnimationsOnIOS", "enableLongTaskAPI", "enableNewBackgroundAndBorderDrawables", "enablePreciseSchedulingForPremountItemsOnAndroid", "enablePropsUpdateReconciliationAndroid", "enableReportEventPaintTime", "enableSynchronousStateUpdates", "enableUIConsistency", "enableViewRecycling", "excludeYogaFromRawProps", "fixMappingOfEventPrioritiesBetweenFabricAndReact", "fixMountingCoordinatorReportedPendingTransactionsOnAndroid", "fuseboxEnabledDebug", "fuseboxEnabledRelease", "initEagerTurboModulesOnNativeModulesQueueAndroid", "lazyAnimationCallbacks", "loadVectorDrawablesOnImages", "traceTurboModulePromiseRejectionsOnAndroid", "useAlwaysAvailableJSErrorHandling", "useFabricInterop", "useImmediateExecutorInAndroidBridgeless", "useNativeViewConfigsInBridgelessMode", "useOptimisedViewPreallocationOnAndroid", "useOptimizedEventBatchingOnAndroid", "useRuntimeShadowNodeReferenceUpdate", "useTurboModuleInterop", "useTurboModules", "provider", "Llf/M;", "override", "(Ljava/lang/Object;)V", "dangerouslyReset", "", "dangerouslyForceOverride", "(Ljava/lang/Object;)Ljava/lang/String;", "ReactAndroid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@a
public final class ReactNativeFeatureFlagsCxxInterop {

    /* renamed from: a  reason: collision with root package name */
    public static final ReactNativeFeatureFlagsCxxInterop f40912a = new ReactNativeFeatureFlagsCxxInterop();

    static {
        SoLoader.t("react_featureflagsjni");
    }

    private ReactNativeFeatureFlagsCxxInterop() {
    }

    @a
    public static final native boolean commonTestFlag();

    @a
    public static final native boolean completeReactInstanceCreationOnBgThreadOnAndroid();

    @a
    public static final native String dangerouslyForceOverride(Object obj);

    @a
    public static final native void dangerouslyReset();

    @a
    public static final native boolean disableEventLoopOnBridgeless();

    @a
    public static final native boolean disableMountItemReorderingAndroid();

    @a
    public static final native boolean enableAlignItemsBaselineOnFabricIOS();

    @a
    public static final native boolean enableAndroidLineHeightCentering();

    @a
    public static final native boolean enableBridgelessArchitecture();

    @a
    public static final native boolean enableCppPropsIteratorSetter();

    @a
    public static final native boolean enableDeletionOfUnmountedViews();

    @a
    public static final native boolean enableEagerRootViewAttachment();

    @a
    public static final native boolean enableEventEmitterRetentionDuringGesturesOnAndroid();

    @a
    public static final native boolean enableFabricLogs();

    @a
    public static final native boolean enableFabricRenderer();

    @a
    public static final native boolean enableFabricRendererExclusively();

    @a
    public static final native boolean enableFixForViewCommandRace();

    @a
    public static final native boolean enableGranularShadowTreeStateReconciliation();

    @a
    public static final native boolean enableIOSViewClipToPaddingBox();

    @a
    public static final native boolean enableLayoutAnimationsOnAndroid();

    @a
    public static final native boolean enableLayoutAnimationsOnIOS();

    @a
    public static final native boolean enableLongTaskAPI();

    @a
    public static final native boolean enableNewBackgroundAndBorderDrawables();

    @a
    public static final native boolean enablePreciseSchedulingForPremountItemsOnAndroid();

    @a
    public static final native boolean enablePropsUpdateReconciliationAndroid();

    @a
    public static final native boolean enableReportEventPaintTime();

    @a
    public static final native boolean enableSynchronousStateUpdates();

    @a
    public static final native boolean enableUIConsistency();

    @a
    public static final native boolean enableViewRecycling();

    @a
    public static final native boolean excludeYogaFromRawProps();

    @a
    public static final native boolean fixMappingOfEventPrioritiesBetweenFabricAndReact();

    @a
    public static final native boolean fixMountingCoordinatorReportedPendingTransactionsOnAndroid();

    @a
    public static final native boolean fuseboxEnabledDebug();

    @a
    public static final native boolean fuseboxEnabledRelease();

    @a
    public static final native boolean initEagerTurboModulesOnNativeModulesQueueAndroid();

    @a
    public static final native boolean lazyAnimationCallbacks();

    @a
    public static final native boolean loadVectorDrawablesOnImages();

    @a
    public static final native void override(Object obj);

    @a
    public static final native boolean traceTurboModulePromiseRejectionsOnAndroid();

    @a
    public static final native boolean useAlwaysAvailableJSErrorHandling();

    @a
    public static final native boolean useFabricInterop();

    @a
    public static final native boolean useImmediateExecutorInAndroidBridgeless();

    @a
    public static final native boolean useNativeViewConfigsInBridgelessMode();

    @a
    public static final native boolean useOptimisedViewPreallocationOnAndroid();

    @a
    public static final native boolean useOptimizedEventBatchingOnAndroid();

    @a
    public static final native boolean useRuntimeShadowNodeReferenceUpdate();

    @a
    public static final native boolean useTurboModuleInterop();

    @a
    public static final native boolean useTurboModules();
}
