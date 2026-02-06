package io.intercom.android.sdk;

import com.intercom.twig.Twig;
import io.intercom.android.nexus.NexusClient;
import io.intercom.android.nexus.NexusConfig;
import io.intercom.android.nexus.NexusEvent;
import io.intercom.android.nexus.NexusEventType;
import io.intercom.android.nexus.NexusListener;
import io.intercom.android.sdk.api.Api;
import io.intercom.android.sdk.m5.data.IntercomDataLayer;
import io.intercom.android.sdk.metrics.MetricTracker;
import io.intercom.android.sdk.models.HostAppState;
import io.intercom.android.sdk.models.OverlayState;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mf.C6565s;
import rh.C6703A;

@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u0000 32\u00020\u00012\u00020\u0002:\u00013B/\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0011\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u001f\u0010\u001c\u001a\u00020\u00142\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u001f\u0010\u001e\u001a\u00020\u00142\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u000fH\u0007¢\u0006\u0004\b\u001e\u0010\u001dJ\u000f\u0010\u001f\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u001f\u0010\u0018J\u000f\u0010 \u001a\u00020\u0014H\u0007¢\u0006\u0004\b \u0010\u0018J\u0015\u0010\"\u001a\u00020\u00142\u0006\u0010!\u001a\u00020\t¢\u0006\u0004\b\"\u0010#J\u0017\u0010$\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b$\u0010\u0016J\u000f\u0010%\u001a\u00020\u0014H\u0016¢\u0006\u0004\b%\u0010\u0018J\u000f\u0010&\u001a\u00020\u0014H\u0016¢\u0006\u0004\b&\u0010\u0018J\u000f\u0010'\u001a\u00020\u0014H\u0016¢\u0006\u0004\b'\u0010\u0018R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010(R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0004¢\u0006\u0006\n\u0004\b\b\u0010)R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0004¢\u0006\u0006\n\u0004\b\n\u0010*R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\f\u0010+R\u001c\u0010.\u001a\n -*\u0004\u0018\u00010,0,8\u0002X\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u001c\u00101\u001a\b\u0012\u0002\b\u0003\u0018\u0001008\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b1\u00102¨\u00064"}, d2 = {"Lio/intercom/android/sdk/NexusWrapper;", "Lio/intercom/android/nexus/NexusClient;", "Lio/intercom/android/nexus/NexusListener;", "Lcom/intercom/twig/Twig;", "twig", "Lrh/A;", "okHttpClient", "Lio/intercom/android/sdk/api/Api;", "api", "", "debouncePeriodMs", "Lio/intercom/android/sdk/m5/data/IntercomDataLayer;", "dataLayer", "<init>", "(Lcom/intercom/twig/Twig;Lrh/A;Lio/intercom/android/sdk/api/Api;JLio/intercom/android/sdk/m5/data/IntercomDataLayer;)V", "", "removeCallbacks", "()Ljava/lang/Boolean;", "Lio/intercom/android/nexus/NexusEvent;", "event", "Llf/M;", "logKnownEvent", "(Lio/intercom/android/nexus/NexusEvent;)V", "fetchUnreadConversationsIfBackgrounded", "()V", "Lio/intercom/android/nexus/NexusConfig;", "config", "shouldSendPresence", "connect", "(Lio/intercom/android/nexus/NexusConfig;Z)V", "connectNow", "disconnect", "disconnectNow", "delayMs", "scheduleDisconnect", "(J)V", "notifyEvent", "onConnect", "onConnectFailed", "onShutdown", "Lcom/intercom/twig/Twig;", "Lio/intercom/android/sdk/api/Api;", "J", "Lio/intercom/android/sdk/m5/data/IntercomDataLayer;", "Ljava/util/concurrent/ScheduledExecutorService;", "kotlin.jvm.PlatformType", "executor", "Ljava/util/concurrent/ScheduledExecutorService;", "Ljava/util/concurrent/ScheduledFuture;", "actionFuture", "Ljava/util/concurrent/ScheduledFuture;", "Companion", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class NexusWrapper extends NexusClient implements NexusListener {
    public static final int $stable = 8;
    private static final String CONVERSATION_ID = "conversationId";
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private ScheduledFuture<?> actionFuture;
    private final Api api;
    private final IntercomDataLayer dataLayer;
    private final long debouncePeriodMs;
    private final ScheduledExecutorService executor = Executors.newSingleThreadScheduledExecutor();
    private final Twig twig;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005XT¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lio/intercom/android/sdk/NexusWrapper$Companion;", "", "<init>", "()V", "CONVERSATION_ID", "", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        /* JADX WARNING: Can't wrap try/catch for region: R(13:0|1|2|3|4|5|6|7|8|9|10|11|13) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0022 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x002b */
        static {
            /*
                io.intercom.android.nexus.NexusEventType[] r0 = io.intercom.android.nexus.NexusEventType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                io.intercom.android.nexus.NexusEventType r1 = io.intercom.android.nexus.NexusEventType.AdminIsTyping     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                io.intercom.android.nexus.NexusEventType r1 = io.intercom.android.nexus.NexusEventType.NewComment     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                io.intercom.android.nexus.NexusEventType r1 = io.intercom.android.nexus.NexusEventType.UserContentSeenByAdmin     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                io.intercom.android.nexus.NexusEventType r1 = io.intercom.android.nexus.NexusEventType.ConversationSeen     // Catch:{ NoSuchFieldError -> 0x002b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002b }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002b }
            L_0x002b:
                io.intercom.android.nexus.NexusEventType r1 = io.intercom.android.nexus.NexusEventType.NewContent     // Catch:{ NoSuchFieldError -> 0x0034 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0034 }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0034 }
            L_0x0034:
                $EnumSwitchMapping$0 = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: io.intercom.android.sdk.NexusWrapper.WhenMappings.<clinit>():void");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NexusWrapper(Twig twig2, C6703A a10, Api api2, long j10, IntercomDataLayer intercomDataLayer) {
        super(twig2, a10);
        C6496s.h(twig2, "twig");
        C6496s.h(a10, "okHttpClient");
        C6496s.h(api2, MetricTracker.Place.API);
        C6496s.h(intercomDataLayer, "dataLayer");
        this.twig = twig2;
        this.api = api2;
        this.debouncePeriodMs = j10;
        this.dataLayer = intercomDataLayer;
    }

    /* access modifiers changed from: private */
    public static final void connect$lambda$0(NexusWrapper nexusWrapper, NexusConfig nexusConfig, boolean z10) {
        C6496s.h(nexusWrapper, "this$0");
        C6496s.h(nexusConfig, "$config");
        nexusWrapper.connectNow(nexusConfig, z10);
    }

    /* access modifiers changed from: private */
    public static final void disconnect$lambda$1(NexusWrapper nexusWrapper) {
        C6496s.h(nexusWrapper, "this$0");
        nexusWrapper.disconnectNow();
    }

    private final void fetchUnreadConversationsIfBackgrounded() {
        if (((OverlayState) this.dataLayer.getOverlayState().getValue()).getResumedHostActivity() != null || ((HostAppState) this.dataLayer.getHostAppState().getValue()).isBackgrounded()) {
            this.api.getUnreadConversations();
        }
    }

    private final void logKnownEvent(NexusEvent nexusEvent) {
        Twig twig2 = this.twig;
        twig2.internal("Nexus", "Received " + nexusEvent.getEventType() + " event");
    }

    private final Boolean removeCallbacks() {
        ScheduledFuture<?> scheduledFuture = this.actionFuture;
        if (scheduledFuture != null) {
            return Boolean.valueOf(scheduledFuture.cancel(false));
        }
        return null;
    }

    /* access modifiers changed from: private */
    public static final void scheduleDisconnect$lambda$2(NexusWrapper nexusWrapper) {
        C6496s.h(nexusWrapper, "this$0");
        nexusWrapper.disconnectNow();
    }

    public void connect(NexusConfig nexusConfig, boolean z10) {
        C6496s.h(nexusConfig, "config");
        if (nexusConfig.getEndpoints().isEmpty()) {
            this.twig.w("No realtime endpoints present so we can't connect", new Object[0]);
            return;
        }
        removeCallbacks();
        this.actionFuture = this.executor.schedule(new b(this, nexusConfig, z10), this.debouncePeriodMs, TimeUnit.MILLISECONDS);
    }

    public final void connectNow(NexusConfig nexusConfig, boolean z10) {
        C6496s.h(nexusConfig, "config");
        if (!isConnected()) {
            super.connect(nexusConfig, z10);
            setTopics(C6565s.e("*"));
            addEventListener(this);
        }
    }

    public void disconnect() {
        removeCallbacks();
        this.actionFuture = this.executor.schedule(new c(this), this.debouncePeriodMs, TimeUnit.MILLISECONDS);
    }

    public final void disconnectNow() {
        removeEventListener(this);
        super.disconnect();
    }

    public void notifyEvent(NexusEvent nexusEvent) {
        int i10;
        C6496s.h(nexusEvent, "event");
        String optString = nexusEvent.getEventData().optString(CONVERSATION_ID);
        NexusEventType eventType = nexusEvent.getEventType();
        if (eventType == null) {
            i10 = -1;
        } else {
            i10 = WhenMappings.$EnumSwitchMapping$0[eventType.ordinal()];
        }
        if (i10 == 1) {
            logKnownEvent(nexusEvent);
        } else if (i10 == 2) {
            logKnownEvent(nexusEvent);
            fetchUnreadConversationsIfBackgrounded();
        } else if (i10 == 3) {
            logKnownEvent(nexusEvent);
        } else if (i10 == 4) {
            logKnownEvent(nexusEvent);
            IntercomDataLayer intercomDataLayer = this.dataLayer;
            C6496s.e(optString);
            intercomDataLayer.markConversationAsRead(optString);
        } else if (i10 != 5) {
            Twig twig2 = this.twig;
            twig2.internal("Nexus", "Unexpected event: " + nexusEvent.getEventType());
        } else {
            logKnownEvent(nexusEvent);
            long optLong = nexusEvent.getEventData().optLong("entity_type");
            String optString2 = nexusEvent.getEventData().optString("entity_id");
            if (optLong == 44) {
                this.api.fetchCarouselByEntityId(optString2);
            } else if (optLong == 85) {
                this.api.fetchSurveyByEntityId(optString2);
            } else {
                Twig twig3 = this.twig;
                twig3.internal("Nexus NewContent", "Unexpected entity type: " + optLong);
            }
        }
    }

    public void onConnect() {
    }

    public void onConnectFailed() {
    }

    public void onShutdown() {
    }

    public final void scheduleDisconnect(long j10) {
        removeCallbacks();
        this.actionFuture = this.executor.schedule(new d(this), j10, TimeUnit.MILLISECONDS);
    }
}
