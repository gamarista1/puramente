package io.intercom.android.sdk.utilities;

import Xg.C5695g;
import io.intercom.android.nexus.NexusConfig;
import io.intercom.android.sdk.NexusWrapper;
import io.intercom.android.sdk.identity.AppConfig;
import io.intercom.android.sdk.m5.data.IntercomDataLayer;
import io.intercom.android.sdk.m5.data.IntercomEvent;
import io.intercom.android.sdk.models.HostAppState;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import lf.C6514M;
import qf.C6658d;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
final class NexusClientUtilsKt$handleNexusClientLifecycle$3<T> implements C5695g {
    final /* synthetic */ IntercomDataLayer $dataLayer;
    final /* synthetic */ NexusWrapper $nexusWrapper;

    NexusClientUtilsKt$handleNexusClientLifecycle$3(NexusWrapper nexusWrapper, IntercomDataLayer intercomDataLayer) {
        this.$nexusWrapper = nexusWrapper;
        this.$dataLayer = intercomDataLayer;
    }

    public final Object emit(IntercomEvent intercomEvent, C6658d<? super C6514M> dVar) {
        if (intercomEvent instanceof IntercomEvent.AppEnteredBackground) {
            this.$nexusWrapper.scheduleDisconnect(((AppConfig) this.$dataLayer.getConfig().getValue()).getNewSessionThresholdMs());
        } else if (intercomEvent instanceof IntercomEvent.AppEnteredForeground) {
            this.$nexusWrapper.connect(((AppConfig) this.$dataLayer.getConfig().getValue()).getRealTimeConfig(), true);
        } else if (intercomEvent instanceof IntercomEvent.BaseResponseReceived) {
            NexusConfig realTimeConfig = ((IntercomEvent.BaseResponseReceived) intercomEvent).getBaseResponse().getConfig().getRealTimeConfig();
            if (realTimeConfig.getEndpoints().isEmpty()) {
                this.$nexusWrapper.disconnect();
            } else if (!((HostAppState) this.$dataLayer.getHostAppState().getValue()).isBackgrounded()) {
                this.$nexusWrapper.connect(realTimeConfig, true);
            }
        } else if (C6496s.c(intercomEvent, IntercomEvent.SoftReset.INSTANCE)) {
            this.$nexusWrapper.disconnect();
        }
        return C6514M.f71813a;
    }
}
