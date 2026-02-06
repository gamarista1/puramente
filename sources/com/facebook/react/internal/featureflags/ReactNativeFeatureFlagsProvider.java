package com.facebook.react.internal.featureflags;

import B7.a;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b-\bg\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H'J\b\u0010\u0004\u001a\u00020\u0003H'J\b\u0010\u0005\u001a\u00020\u0003H'J\b\u0010\u0006\u001a\u00020\u0003H'J\b\u0010\u0007\u001a\u00020\u0003H'J\b\u0010\b\u001a\u00020\u0003H'J\b\u0010\t\u001a\u00020\u0003H'J\b\u0010\n\u001a\u00020\u0003H'J\b\u0010\u000b\u001a\u00020\u0003H'J\b\u0010\f\u001a\u00020\u0003H'J\b\u0010\r\u001a\u00020\u0003H'J\b\u0010\u000e\u001a\u00020\u0003H'J\b\u0010\u000f\u001a\u00020\u0003H'J\b\u0010\u0010\u001a\u00020\u0003H'J\b\u0010\u0011\u001a\u00020\u0003H'J\b\u0010\u0012\u001a\u00020\u0003H'J\b\u0010\u0013\u001a\u00020\u0003H'J\b\u0010\u0014\u001a\u00020\u0003H'J\b\u0010\u0015\u001a\u00020\u0003H'J\b\u0010\u0016\u001a\u00020\u0003H'J\b\u0010\u0017\u001a\u00020\u0003H'J\b\u0010\u0018\u001a\u00020\u0003H'J\b\u0010\u0019\u001a\u00020\u0003H'J\b\u0010\u001a\u001a\u00020\u0003H'J\b\u0010\u001b\u001a\u00020\u0003H'J\b\u0010\u001c\u001a\u00020\u0003H'J\b\u0010\u001d\u001a\u00020\u0003H'J\b\u0010\u001e\u001a\u00020\u0003H'J\b\u0010\u001f\u001a\u00020\u0003H'J\b\u0010 \u001a\u00020\u0003H'J\b\u0010!\u001a\u00020\u0003H'J\b\u0010\"\u001a\u00020\u0003H'J\b\u0010#\u001a\u00020\u0003H'J\b\u0010$\u001a\u00020\u0003H'J\b\u0010%\u001a\u00020\u0003H'J\b\u0010&\u001a\u00020\u0003H'J\b\u0010'\u001a\u00020\u0003H'J\b\u0010(\u001a\u00020\u0003H'J\b\u0010)\u001a\u00020\u0003H'J\b\u0010*\u001a\u00020\u0003H'J\b\u0010+\u001a\u00020\u0003H'J\b\u0010,\u001a\u00020\u0003H'J\b\u0010-\u001a\u00020\u0003H'J\b\u0010.\u001a\u00020\u0003H'J\b\u0010/\u001a\u00020\u0003H'ø\u0001\u0000\u0002\u0006\n\u0004\b!0\u0001¨\u00060À\u0006\u0001"}, d2 = {"Lcom/facebook/react/internal/featureflags/ReactNativeFeatureFlagsProvider;", "", "commonTestFlag", "", "completeReactInstanceCreationOnBgThreadOnAndroid", "disableEventLoopOnBridgeless", "disableMountItemReorderingAndroid", "enableAlignItemsBaselineOnFabricIOS", "enableAndroidLineHeightCentering", "enableBridgelessArchitecture", "enableCppPropsIteratorSetter", "enableDeletionOfUnmountedViews", "enableEagerRootViewAttachment", "enableEventEmitterRetentionDuringGesturesOnAndroid", "enableFabricLogs", "enableFabricRenderer", "enableFabricRendererExclusively", "enableFixForViewCommandRace", "enableGranularShadowTreeStateReconciliation", "enableIOSViewClipToPaddingBox", "enableLayoutAnimationsOnAndroid", "enableLayoutAnimationsOnIOS", "enableLongTaskAPI", "enableNewBackgroundAndBorderDrawables", "enablePreciseSchedulingForPremountItemsOnAndroid", "enablePropsUpdateReconciliationAndroid", "enableReportEventPaintTime", "enableSynchronousStateUpdates", "enableUIConsistency", "enableViewRecycling", "excludeYogaFromRawProps", "fixMappingOfEventPrioritiesBetweenFabricAndReact", "fixMountingCoordinatorReportedPendingTransactionsOnAndroid", "fuseboxEnabledDebug", "fuseboxEnabledRelease", "initEagerTurboModulesOnNativeModulesQueueAndroid", "lazyAnimationCallbacks", "loadVectorDrawablesOnImages", "traceTurboModulePromiseRejectionsOnAndroid", "useAlwaysAvailableJSErrorHandling", "useFabricInterop", "useImmediateExecutorInAndroidBridgeless", "useNativeViewConfigsInBridgelessMode", "useOptimisedViewPreallocationOnAndroid", "useOptimizedEventBatchingOnAndroid", "useRuntimeShadowNodeReferenceUpdate", "useTurboModuleInterop", "useTurboModules", "ReactAndroid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@a
public interface ReactNativeFeatureFlagsProvider {
    @a
    boolean commonTestFlag();

    @a
    boolean completeReactInstanceCreationOnBgThreadOnAndroid();

    @a
    boolean disableEventLoopOnBridgeless();

    @a
    boolean disableMountItemReorderingAndroid();

    @a
    boolean enableAlignItemsBaselineOnFabricIOS();

    @a
    boolean enableAndroidLineHeightCentering();

    @a
    boolean enableBridgelessArchitecture();

    @a
    boolean enableCppPropsIteratorSetter();

    @a
    boolean enableDeletionOfUnmountedViews();

    @a
    boolean enableEagerRootViewAttachment();

    @a
    boolean enableEventEmitterRetentionDuringGesturesOnAndroid();

    @a
    boolean enableFabricLogs();

    @a
    boolean enableFabricRenderer();

    @a
    boolean enableFabricRendererExclusively();

    @a
    boolean enableFixForViewCommandRace();

    @a
    boolean enableGranularShadowTreeStateReconciliation();

    @a
    boolean enableIOSViewClipToPaddingBox();

    @a
    boolean enableLayoutAnimationsOnAndroid();

    @a
    boolean enableLayoutAnimationsOnIOS();

    @a
    boolean enableLongTaskAPI();

    @a
    boolean enableNewBackgroundAndBorderDrawables();

    @a
    boolean enablePreciseSchedulingForPremountItemsOnAndroid();

    @a
    boolean enablePropsUpdateReconciliationAndroid();

    @a
    boolean enableReportEventPaintTime();

    @a
    boolean enableSynchronousStateUpdates();

    @a
    boolean enableUIConsistency();

    @a
    boolean enableViewRecycling();

    @a
    boolean excludeYogaFromRawProps();

    @a
    boolean fixMappingOfEventPrioritiesBetweenFabricAndReact();

    @a
    boolean fixMountingCoordinatorReportedPendingTransactionsOnAndroid();

    @a
    boolean fuseboxEnabledDebug();

    @a
    boolean fuseboxEnabledRelease();

    @a
    boolean initEagerTurboModulesOnNativeModulesQueueAndroid();

    @a
    boolean lazyAnimationCallbacks();

    @a
    boolean loadVectorDrawablesOnImages();

    @a
    boolean traceTurboModulePromiseRejectionsOnAndroid();

    @a
    boolean useAlwaysAvailableJSErrorHandling();

    @a
    boolean useFabricInterop();

    @a
    boolean useImmediateExecutorInAndroidBridgeless();

    @a
    boolean useNativeViewConfigsInBridgelessMode();

    @a
    boolean useOptimisedViewPreallocationOnAndroid();

    @a
    boolean useOptimizedEventBatchingOnAndroid();

    @a
    boolean useRuntimeShadowNodeReferenceUpdate();

    @a
    boolean useTurboModuleInterop();

    @a
    boolean useTurboModules();
}
