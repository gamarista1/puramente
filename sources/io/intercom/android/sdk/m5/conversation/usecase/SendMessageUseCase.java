package io.intercom.android.sdk.m5.conversation.usecase;

import Xg.x;
import io.intercom.android.sdk.Injector;
import io.intercom.android.sdk.blocks.lib.models.Block;
import io.intercom.android.sdk.helpcenter.articles.ArticleMetadata;
import io.intercom.android.sdk.helpcenter.utils.networking.NetworkResponse;
import io.intercom.android.sdk.identity.UserIdentity;
import io.intercom.android.sdk.m5.conversation.data.ConversationRepository;
import io.intercom.android.sdk.m5.conversation.states.BottomSheetState;
import io.intercom.android.sdk.m5.conversation.states.ComposerState;
import io.intercom.android.sdk.m5.conversation.states.ConversationClientState;
import io.intercom.android.sdk.m5.conversation.states.CurrentlyTypingState;
import io.intercom.android.sdk.m5.conversation.states.FinStreamingData;
import io.intercom.android.sdk.m5.conversation.states.FloatingIndicatorState;
import io.intercom.android.sdk.m5.conversation.states.LaunchMode;
import io.intercom.android.sdk.m5.conversation.states.NetworkState;
import io.intercom.android.sdk.m5.conversation.states.PendingMessage;
import io.intercom.android.sdk.m5.data.IntercomDataLayer;
import io.intercom.android.sdk.metrics.MetricTracker;
import io.intercom.android.sdk.models.Conversation;
import io.intercom.android.sdk.models.OpenMessengerResponse;
import io.intercom.android.sdk.models.Part;
import io.intercom.android.sdk.models.Participant;
import io.intercom.android.sdk.utilities.commons.TimeProvider;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mf.O;
import qf.C6658d;

@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u0000 *2\u00020\u0001:\u0001*B=\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ.\u0010\u0018\u001a\u00020\u00172\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015HB¢\u0006\u0004\b\u0018\u0010\u0019J@\u0010\u0018\u001a\u00020\u00172\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a2\b\b\u0002\u0010\u001d\u001a\u00020\u00132\b\b\u0002\u0010\u001f\u001a\u00020\u001eHB¢\u0006\u0004\b\u0018\u0010 R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010!R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\"R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010#R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\t\u0010$R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010%R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0004¢\u0006\u0006\n\u0004\b\r\u0010&R\u0014\u0010(\u001a\u00020'8\u0002X\u0004¢\u0006\u0006\n\u0004\b(\u0010)¨\u0006+"}, d2 = {"Lio/intercom/android/sdk/m5/conversation/usecase/SendMessageUseCase;", "", "Lio/intercom/android/sdk/m5/conversation/data/ConversationRepository;", "conversationRepository", "Lio/intercom/android/sdk/m5/conversation/usecase/RefreshConversationUseCase;", "refreshConversationUseCase", "Lio/intercom/android/sdk/m5/conversation/usecase/SoundEffectsUseCase;", "soundEffectsUseCase", "Lio/intercom/android/sdk/identity/UserIdentity;", "userIdentity", "Lio/intercom/android/sdk/m5/data/IntercomDataLayer;", "intercomDataLayer", "Lio/intercom/android/sdk/metrics/MetricTracker;", "metricTracker", "<init>", "(Lio/intercom/android/sdk/m5/conversation/data/ConversationRepository;Lio/intercom/android/sdk/m5/conversation/usecase/RefreshConversationUseCase;Lio/intercom/android/sdk/m5/conversation/usecase/SoundEffectsUseCase;Lio/intercom/android/sdk/identity/UserIdentity;Lio/intercom/android/sdk/m5/data/IntercomDataLayer;Lio/intercom/android/sdk/metrics/MetricTracker;)V", "LXg/x;", "Lio/intercom/android/sdk/m5/conversation/states/ConversationClientState;", "clientState", "", "messageText", "Lio/intercom/android/sdk/m5/conversation/ui/components/composer/TextInputSource;", "textInputSource", "Llf/M;", "invoke", "(LXg/x;Ljava/lang/String;Lio/intercom/android/sdk/m5/conversation/ui/components/composer/TextInputSource;Lqf/d;)Ljava/lang/Object;", "", "Lio/intercom/android/sdk/blocks/lib/models/Block$Builder;", "blocks", "clientUUID", "", "fromVoiceDictation", "(LXg/x;Ljava/util/List;Ljava/lang/String;ZLqf/d;)Ljava/lang/Object;", "Lio/intercom/android/sdk/m5/conversation/data/ConversationRepository;", "Lio/intercom/android/sdk/m5/conversation/usecase/RefreshConversationUseCase;", "Lio/intercom/android/sdk/m5/conversation/usecase/SoundEffectsUseCase;", "Lio/intercom/android/sdk/identity/UserIdentity;", "Lio/intercom/android/sdk/m5/data/IntercomDataLayer;", "Lio/intercom/android/sdk/metrics/MetricTracker;", "Ljava/util/concurrent/atomic/AtomicBoolean;", "newConversationRequestPending", "Ljava/util/concurrent/atomic/AtomicBoolean;", "Companion", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SendMessageUseCase {
    public static final int $stable = 8;
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private final ConversationRepository conversationRepository;
    private final IntercomDataLayer intercomDataLayer;
    private final MetricTracker metricTracker;
    private final AtomicBoolean newConversationRequestPending;
    private final RefreshConversationUseCase refreshConversationUseCase;
    private final SoundEffectsUseCase soundEffectsUseCase;
    private final UserIdentity userIdentity;

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JC\u0010\u0011\u001a\u00020\u00102\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0011\u0010\u0012J#\u0010\u0014\u001a\u00020\u00102\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0013\u001a\u00020\n¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lio/intercom/android/sdk/m5/conversation/usecase/SendMessageUseCase$Companion;", "", "<init>", "()V", "LXg/x;", "Lio/intercom/android/sdk/m5/conversation/states/ConversationClientState;", "clientState", "", "Lio/intercom/android/sdk/blocks/lib/models/Block$Builder;", "blocks", "", "uuid", "Lio/intercom/android/sdk/identity/UserIdentity;", "userIdentity", "", "fromVoiceDictation", "Llf/M;", "addBlocksToPendingMessages", "(LXg/x;Ljava/util/List;Ljava/lang/String;Lio/intercom/android/sdk/identity/UserIdentity;Z)V", "clientUUID", "updateFailedPendingMessages", "(LXg/x;Ljava/lang/String;)V", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ void addBlocksToPendingMessages$default(Companion companion, x xVar, List list, String str, UserIdentity userIdentity, boolean z10, int i10, Object obj) {
            if ((i10 & 16) != 0) {
                z10 = false;
            }
            companion.addBlocksToPendingMessages(xVar, list, str, userIdentity, z10);
        }

        public final void addBlocksToPendingMessages(x xVar, List<Block.Builder> list, String str, UserIdentity userIdentity, boolean z10) {
            Object value;
            ConversationClientState conversationClientState;
            LinkedHashMap linkedHashMap;
            x xVar2 = xVar;
            List<Block.Builder> list2 = list;
            String str2 = str;
            C6496s.h(xVar2, "clientState");
            C6496s.h(list2, "blocks");
            C6496s.h(str2, "uuid");
            C6496s.h(userIdentity, "userIdentity");
            Part build = new Part.Builder().withBlocks(list2).withCreatedAt(TimeUnit.MILLISECONDS.toSeconds(TimeProvider.SYSTEM.currentTimeMillis())).withParticipantIsAdmin(false).withClientAssignedUuid(str2).withFromVoiceDictation(z10).build();
            build.setParticipant(new Participant.Builder().withId(userIdentity.getIntercomId()).build());
            build.setMessageState(Part.MessageState.SENDING);
            do {
                value = xVar.getValue();
                ConversationClientState conversationClientState2 = (ConversationClientState) value;
                conversationClientState = conversationClientState2;
                linkedHashMap = r12;
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                linkedHashMap2.putAll(conversationClientState2.getPendingMessages());
                C6496s.e(build);
                linkedHashMap2.put(str2, new PendingMessage(build, false, (PendingMessage.FailedImageUploadData) null, 4, (DefaultConstructorMarker) null));
            } while (!xVar2.e(value, ConversationClientState.copy$default(conversationClientState, linkedHashMap, (Conversation) null, (String) null, (CurrentlyTypingState) null, (ComposerState) null, (BottomSheetState) null, (LaunchMode) null, (NetworkResponse) null, (ArticleMetadata) null, (NetworkState) null, (List) null, (List) null, (FinStreamingData) null, (OpenMessengerResponse) null, 0, 0, (FloatingIndicatorState) null, (String) null, false, false, 1048574, (Object) null)));
        }

        public final void updateFailedPendingMessages(x xVar, String str) {
            Object value;
            ConversationClientState conversationClientState;
            Map B10;
            x xVar2 = xVar;
            String str2 = str;
            C6496s.h(xVar2, "clientState");
            C6496s.h(str2, "clientUUID");
            do {
                value = xVar.getValue();
                conversationClientState = (ConversationClientState) value;
                B10 = O.B(((ConversationClientState) xVar.getValue()).getPendingMessages());
                PendingMessage pendingMessage = (PendingMessage) B10.get(str2);
                if (pendingMessage != null) {
                    B10.put(str2, PendingMessage.copy$default(pendingMessage, (Part) null, true, (PendingMessage.FailedImageUploadData) null, 5, (Object) null));
                }
            } while (!xVar2.e(value, ConversationClientState.copy$default(conversationClientState, B10, (Conversation) null, (String) null, (CurrentlyTypingState) null, (ComposerState) null, (BottomSheetState) null, (LaunchMode) null, (NetworkResponse) null, (ArticleMetadata) null, (NetworkState) null, (List) null, (List) null, (FinStreamingData) null, (OpenMessengerResponse) null, 0, 0, (FloatingIndicatorState) null, (String) null, false, false, 1048574, (Object) null)));
        }

        private Companion() {
        }
    }

    public SendMessageUseCase(ConversationRepository conversationRepository2, RefreshConversationUseCase refreshConversationUseCase2, SoundEffectsUseCase soundEffectsUseCase2, UserIdentity userIdentity2, IntercomDataLayer intercomDataLayer2, MetricTracker metricTracker2) {
        C6496s.h(conversationRepository2, "conversationRepository");
        C6496s.h(refreshConversationUseCase2, "refreshConversationUseCase");
        C6496s.h(soundEffectsUseCase2, "soundEffectsUseCase");
        C6496s.h(userIdentity2, "userIdentity");
        C6496s.h(intercomDataLayer2, "intercomDataLayer");
        C6496s.h(metricTracker2, "metricTracker");
        this.conversationRepository = conversationRepository2;
        this.refreshConversationUseCase = refreshConversationUseCase2;
        this.soundEffectsUseCase = soundEffectsUseCase2;
        this.userIdentity = userIdentity2;
        this.intercomDataLayer = intercomDataLayer2;
        this.metricTracker = metricTracker2;
        this.newConversationRequestPending = new AtomicBoolean(false);
    }

    public static /* synthetic */ Object invoke$default(SendMessageUseCase sendMessageUseCase, x xVar, List list, String str, boolean z10, C6658d dVar, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            str = UUID.randomUUID().toString();
        }
        String str2 = str;
        if ((i10 & 8) != 0) {
            z10 = false;
        }
        return sendMessageUseCase.invoke(xVar, list, str2, z10, dVar);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v8, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v5, resolved type: io.intercom.android.sdk.m5.conversation.ui.components.composer.TextInputSource} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x004a  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x00aa  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0025  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invoke(Xg.x r8, java.lang.String r9, io.intercom.android.sdk.m5.conversation.ui.components.composer.TextInputSource r10, qf.C6658d<? super lf.C6514M> r11) {
        /*
            r7 = this;
            boolean r0 = r11 instanceof io.intercom.android.sdk.m5.conversation.usecase.SendMessageUseCase$invoke$1
            if (r0 == 0) goto L_0x0014
            r0 = r11
            io.intercom.android.sdk.m5.conversation.usecase.SendMessageUseCase$invoke$1 r0 = (io.intercom.android.sdk.m5.conversation.usecase.SendMessageUseCase$invoke$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0014
            int r1 = r1 - r2
            r0.label = r1
        L_0x0012:
            r6 = r0
            goto L_0x001a
        L_0x0014:
            io.intercom.android.sdk.m5.conversation.usecase.SendMessageUseCase$invoke$1 r0 = new io.intercom.android.sdk.m5.conversation.usecase.SendMessageUseCase$invoke$1
            r0.<init>(r7, r11)
            goto L_0x0012
        L_0x001a:
            java.lang.Object r11 = r6.result
            java.lang.Object r0 = rf.C6680b.f()
            int r1 = r6.label
            r2 = 1
            if (r1 == 0) goto L_0x004a
            if (r1 != r2) goto L_0x0042
            java.lang.Object r8 = r6.L$4
            java.lang.String r8 = (java.lang.String) r8
            java.lang.Object r9 = r6.L$3
            r10 = r9
            io.intercom.android.sdk.m5.conversation.ui.components.composer.TextInputSource r10 = (io.intercom.android.sdk.m5.conversation.ui.components.composer.TextInputSource) r10
            java.lang.Object r9 = r6.L$2
            java.lang.String r9 = (java.lang.String) r9
            java.lang.Object r0 = r6.L$1
            Xg.x r0 = (Xg.x) r0
            java.lang.Object r1 = r6.L$0
            io.intercom.android.sdk.m5.conversation.usecase.SendMessageUseCase r1 = (io.intercom.android.sdk.m5.conversation.usecase.SendMessageUseCase) r1
            lf.w.b(r11)
            r11 = r8
            r8 = r0
            goto L_0x0098
        L_0x0042:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L_0x004a:
            lf.w.b(r11)
            java.util.UUID r11 = java.util.UUID.randomUUID()
            java.lang.String r11 = r11.toString()
            java.lang.String r1 = "toString(...)"
            kotlin.jvm.internal.C6496s.g(r11, r1)
            io.intercom.android.sdk.blocks.BlockFactory r1 = new io.intercom.android.sdk.blocks.BlockFactory
            io.intercom.android.sdk.blocks.logic.TextSplittingStrategy r3 = new io.intercom.android.sdk.blocks.logic.TextSplittingStrategy
            r3.<init>()
            r1.<init>(r3)
            java.lang.CharSequence r3 = Sg.p.g1(r9)
            java.lang.String r3 = r3.toString()
            java.util.List r3 = r1.getBlocksForText(r3)
            int r1 = r9.length()
            if (r1 <= 0) goto L_0x0097
            kotlin.jvm.internal.C6496s.e(r3)
            io.intercom.android.sdk.m5.conversation.ui.components.composer.TextInputSource r1 = io.intercom.android.sdk.m5.conversation.ui.components.composer.TextInputSource.KEYBOARD
            if (r10 == r1) goto L_0x007f
            r5 = r2
            goto L_0x0081
        L_0x007f:
            r1 = 0
            r5 = r1
        L_0x0081:
            r6.L$0 = r7
            r6.L$1 = r8
            r6.L$2 = r9
            r6.L$3 = r10
            r6.L$4 = r11
            r6.label = r2
            r1 = r7
            r2 = r8
            r4 = r11
            java.lang.Object r1 = r1.invoke(r2, r3, r4, r5, r6)
            if (r1 != r0) goto L_0x0097
            return r0
        L_0x0097:
            r1 = r7
        L_0x0098:
            io.intercom.android.sdk.m5.data.IntercomDataLayer r0 = r1.intercomDataLayer
            Xg.L r0 = r0.getConfig()
            java.lang.Object r0 = r0.getValue()
            io.intercom.android.sdk.identity.AppConfig r0 = (io.intercom.android.sdk.identity.AppConfig) r0
            boolean r0 = r0.getFinDictationUiEnabled()
            if (r0 == 0) goto L_0x00f9
            io.intercom.android.sdk.metrics.MetricTracker r0 = r1.metricTracker
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "message_sent_via_"
            r1.append(r2)
            java.lang.String r10 = r10.name()
            java.util.Locale r2 = java.util.Locale.ROOT
            java.lang.String r10 = r10.toLowerCase(r2)
            java.lang.String r2 = "toLowerCase(...)"
            kotlin.jvm.internal.C6496s.g(r10, r2)
            r1.append(r10)
            java.lang.String r10 = r1.toString()
            java.lang.Object r8 = r8.getValue()
            io.intercom.android.sdk.m5.conversation.states.ConversationClientState r8 = (io.intercom.android.sdk.m5.conversation.states.ConversationClientState) r8
            java.lang.String r8 = r8.getConversationId()
            if (r8 != 0) goto L_0x00da
            java.lang.String r8 = ""
        L_0x00da:
            java.lang.String r1 = "client_uuid"
            kotlin.Pair r11 = lf.C6502A.a(r1, r11)
            int r9 = r9.length()
            java.lang.String r9 = java.lang.String.valueOf(r9)
            java.lang.String r1 = "char_count"
            kotlin.Pair r9 = lf.C6502A.a(r1, r9)
            kotlin.Pair[] r9 = new kotlin.Pair[]{r11, r9}
            java.util.Map r9 = mf.O.l(r9)
            r0.trackFinDictation(r10, r8, r9)
        L_0x00f9:
            lf.M r8 = lf.C6514M.f71813a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: io.intercom.android.sdk.m5.conversation.usecase.SendMessageUseCase.invoke(Xg.x, java.lang.String, io.intercom.android.sdk.m5.conversation.ui.components.composer.TextInputSource, qf.d):java.lang.Object");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ SendMessageUseCase(ConversationRepository conversationRepository2, RefreshConversationUseCase refreshConversationUseCase2, SoundEffectsUseCase soundEffectsUseCase2, UserIdentity userIdentity2, IntercomDataLayer intercomDataLayer2, MetricTracker metricTracker2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(conversationRepository2, refreshConversationUseCase2, soundEffectsUseCase2, (i10 & 8) != 0 ? Injector.get().getUserIdentity() : userIdentity2, (i10 & 16) != 0 ? Injector.get().getDataLayer() : intercomDataLayer2, (i10 & 32) != 0 ? Injector.get().getMetricTracker() : metricTracker2);
    }

    /* JADX WARNING: Removed duplicated region for block: B:105:0x02e6  */
    /* JADX WARNING: Removed duplicated region for block: B:112:0x030b  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x00ac  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x0183  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x0224  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x0278  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x02d0 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x02d1  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0033  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invoke(Xg.x r30, java.util.List<io.intercom.android.sdk.blocks.lib.models.Block.Builder> r31, java.lang.String r32, boolean r33, qf.C6658d<? super lf.C6514M> r34) {
        /*
            r29 = this;
            r0 = r29
            r7 = r30
            r15 = r32
            r1 = r34
            boolean r2 = r1 instanceof io.intercom.android.sdk.m5.conversation.usecase.SendMessageUseCase$invoke$2
            if (r2 == 0) goto L_0x001c
            r2 = r1
            io.intercom.android.sdk.m5.conversation.usecase.SendMessageUseCase$invoke$2 r2 = (io.intercom.android.sdk.m5.conversation.usecase.SendMessageUseCase$invoke$2) r2
            int r3 = r2.label
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L_0x001c
            int r3 = r3 - r4
            r2.label = r3
        L_0x001a:
            r14 = r2
            goto L_0x0022
        L_0x001c:
            io.intercom.android.sdk.m5.conversation.usecase.SendMessageUseCase$invoke$2 r2 = new io.intercom.android.sdk.m5.conversation.usecase.SendMessageUseCase$invoke$2
            r2.<init>(r0, r1)
            goto L_0x001a
        L_0x0022:
            java.lang.Object r1 = r14.result
            java.lang.Object r13 = rf.C6680b.f()
            int r2 = r14.label
            r10 = 5
            r8 = 4
            r9 = 3
            r12 = 2
            r11 = 0
            r6 = 1
            r5 = 0
            if (r2 == 0) goto L_0x00ac
            if (r2 == r6) goto L_0x0094
            if (r2 == r12) goto L_0x007f
            if (r2 == r9) goto L_0x0061
            if (r2 == r8) goto L_0x004a
            if (r2 != r10) goto L_0x0042
            lf.w.b(r1)
            goto L_0x0317
        L_0x0042:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L_0x004a:
            java.lang.Object r2 = r14.L$2
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r3 = r14.L$1
            Xg.x r3 = (Xg.x) r3
            java.lang.Object r4 = r14.L$0
            io.intercom.android.sdk.m5.conversation.usecase.SendMessageUseCase r4 = (io.intercom.android.sdk.m5.conversation.usecase.SendMessageUseCase) r4
            lf.w.b(r1)
            r12 = r5
            r28 = r14
            r14 = r13
            r13 = r28
            goto L_0x02d7
        L_0x0061:
            boolean r2 = r14.Z$0
            java.lang.Object r3 = r14.L$3
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r4 = r14.L$2
            java.util.List r4 = (java.util.List) r4
            java.lang.Object r6 = r14.L$1
            Xg.x r6 = (Xg.x) r6
            java.lang.Object r7 = r14.L$0
            io.intercom.android.sdk.m5.conversation.usecase.SendMessageUseCase r7 = (io.intercom.android.sdk.m5.conversation.usecase.SendMessageUseCase) r7
            lf.w.b(r1)
            r12 = r5
            r9 = r7
            r5 = r2
            r2 = r4
            r7 = r6
            r6 = r13
            r4 = r14
            goto L_0x0263
        L_0x007f:
            java.lang.Object r2 = r14.L$3
            io.intercom.android.sdk.models.ConversationResponse r2 = (io.intercom.android.sdk.models.ConversationResponse) r2
            java.lang.Object r3 = r14.L$2
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r4 = r14.L$1
            Xg.x r4 = (Xg.x) r4
            java.lang.Object r5 = r14.L$0
            io.intercom.android.sdk.m5.conversation.usecase.SendMessageUseCase r5 = (io.intercom.android.sdk.m5.conversation.usecase.SendMessageUseCase) r5
            lf.w.b(r1)
            goto L_0x01bf
        L_0x0094:
            java.lang.Object r2 = r14.L$2
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r3 = r14.L$1
            Xg.x r3 = (Xg.x) r3
            java.lang.Object r4 = r14.L$0
            io.intercom.android.sdk.m5.conversation.usecase.SendMessageUseCase r4 = (io.intercom.android.sdk.m5.conversation.usecase.SendMessageUseCase) r4
            lf.w.b(r1)
            r7 = r1
            r5 = r2
            r8 = r4
            r1 = r11
            r2 = r12
            r6 = r13
            r4 = r14
            goto L_0x0173
        L_0x00ac:
            lf.w.b(r1)
            io.intercom.android.sdk.m5.conversation.usecase.SendMessageUseCase$Companion r1 = Companion
            io.intercom.android.sdk.identity.UserIdentity r4 = r0.userIdentity
            r2 = r30
            r3 = r31
            r16 = r4
            r4 = r32
            r12 = r5
            r5 = r16
            r10 = r6
            r6 = r33
            r1.addBlocksToPendingMessages(r2, r3, r4, r5, r6)
            java.lang.Object r1 = r30.getValue()
            io.intercom.android.sdk.m5.conversation.states.ConversationClientState r1 = (io.intercom.android.sdk.m5.conversation.states.ConversationClientState) r1
            java.lang.String r1 = r1.getConversationId()
            if (r1 != 0) goto L_0x0237
            java.util.concurrent.atomic.AtomicBoolean r1 = r0.newConversationRequestPending
            boolean r1 = r1.compareAndSet(r11, r10)
            if (r1 == 0) goto L_0x0237
            io.intercom.android.sdk.m5.data.IntercomDataLayer r1 = r0.intercomDataLayer
            Xg.L r1 = r1.getBotIntro()
            java.lang.Object r1 = r1.getValue()
            io.intercom.android.sdk.models.BotIntro r1 = (io.intercom.android.sdk.models.BotIntro) r1
            io.intercom.android.sdk.models.BotIntro r2 = io.intercom.android.sdk.models.BotIntro.NULL
            boolean r2 = kotlin.jvm.internal.C6496s.c(r2, r1)
            if (r2 != 0) goto L_0x00f1
            java.lang.String r1 = r1.getId()
            goto L_0x00f2
        L_0x00f1:
            r1 = r12
        L_0x00f2:
            io.intercom.android.sdk.m5.conversation.data.ConversationRepository r8 = r0.conversationRepository
            java.lang.Object r2 = r30.getValue()
            io.intercom.android.sdk.m5.conversation.states.ConversationClientState r2 = (io.intercom.android.sdk.m5.conversation.states.ConversationClientState) r2
            io.intercom.android.sdk.helpcenter.articles.ArticleMetadata r2 = r2.getArticleMetadata()
            if (r2 == 0) goto L_0x0105
            java.lang.String r2 = r2.getId()
            goto L_0x0106
        L_0x0105:
            r2 = r12
        L_0x0106:
            io.intercom.android.sdk.m5.data.IntercomDataLayer r3 = r0.intercomDataLayer
            Xg.L r3 = r3.getBotBehaviourId()
            java.lang.Object r3 = r3.getValue()
            java.lang.String r3 = (java.lang.String) r3
            io.intercom.android.sdk.m5.data.IntercomDataLayer r4 = r0.intercomDataLayer
            io.intercom.android.sdk.models.OpenMessengerResponse r4 = r4.getOpenResponse()
            if (r4 == 0) goto L_0x0125
            io.intercom.android.sdk.models.ComposerSuggestions r4 = r4.getComposerSuggestions()
            if (r4 == 0) goto L_0x0125
            java.util.List r4 = r4.getSuggestions()
            goto L_0x0126
        L_0x0125:
            r4 = r12
        L_0x0126:
            io.intercom.android.sdk.m5.data.IntercomDataLayer r5 = r0.intercomDataLayer
            io.intercom.android.sdk.models.OpenMessengerResponse r5 = r5.getOpenResponse()
            if (r5 == 0) goto L_0x0139
            io.intercom.android.sdk.models.ComposerSuggestions r5 = r5.getComposerSuggestions()
            if (r5 == 0) goto L_0x0139
            java.lang.Long r5 = r5.getSnapshotId()
            goto L_0x013a
        L_0x0139:
            r5 = r12
        L_0x013a:
            io.intercom.android.sdk.m5.data.IntercomDataLayer r6 = r0.intercomDataLayer
            io.intercom.android.sdk.models.OpenMessengerResponse r6 = r6.getOpenResponse()
            if (r6 == 0) goto L_0x0149
            java.lang.String r6 = r6.getRequestId()
            r16 = r6
            goto L_0x014b
        L_0x0149:
            r16 = r12
        L_0x014b:
            r14.L$0 = r0
            r14.L$1 = r7
            r14.L$2 = r15
            r14.label = r10
            r9 = r31
            r10 = r1
            r1 = r11
            r11 = r2
            r2 = 2
            r12 = r3
            r6 = r13
            r13 = r4
            r4 = r14
            r14 = r33
            r3 = r15
            r15 = r5
            r17 = r32
            r18 = r4
            java.lang.Object r5 = r8.createNewConversation(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            if (r5 != r6) goto L_0x016c
            return r6
        L_0x016c:
            r8 = r0
            r28 = r5
            r5 = r3
            r3 = r7
            r7 = r28
        L_0x0173:
            io.intercom.android.sdk.helpcenter.utils.networking.NetworkResponse r7 = (io.intercom.android.sdk.helpcenter.utils.networking.NetworkResponse) r7
            boolean r9 = r7 instanceof io.intercom.android.sdk.helpcenter.utils.networking.NetworkResponse.ClientError
            if (r9 != 0) goto L_0x0224
            boolean r9 = r7 instanceof io.intercom.android.sdk.helpcenter.utils.networking.NetworkResponse.NetworkError
            if (r9 != 0) goto L_0x0224
            boolean r9 = r7 instanceof io.intercom.android.sdk.helpcenter.utils.networking.NetworkResponse.ServerError
            if (r9 == 0) goto L_0x0183
            goto L_0x0224
        L_0x0183:
            boolean r9 = r7 instanceof io.intercom.android.sdk.helpcenter.utils.networking.NetworkResponse.Success
            if (r9 == 0) goto L_0x021e
            java.util.concurrent.atomic.AtomicBoolean r9 = r8.newConversationRequestPending
            r9.set(r1)
            io.intercom.android.sdk.m5.conversation.usecase.SoundEffectsUseCase r1 = r8.soundEffectsUseCase
            io.intercom.android.sdk.m5.conversation.usecase.Action r9 = io.intercom.android.sdk.m5.conversation.usecase.Action.MESSAGE_SENT
            r1.invoke$intercom_sdk_base_release(r9)
            io.intercom.android.sdk.helpcenter.utils.networking.NetworkResponse$Success r7 = (io.intercom.android.sdk.helpcenter.utils.networking.NetworkResponse.Success) r7
            java.lang.Object r1 = r7.getBody()
            io.intercom.android.sdk.models.ConversationResponse$Builder r1 = (io.intercom.android.sdk.models.ConversationResponse.Builder) r1
            io.intercom.android.sdk.models.ConversationResponse r1 = r1.build()
            io.intercom.android.sdk.m5.data.IntercomDataLayer r7 = r8.intercomDataLayer
            io.intercom.android.sdk.m5.data.IntercomEvent$NewConversation r9 = new io.intercom.android.sdk.m5.data.IntercomEvent$NewConversation
            io.intercom.android.sdk.models.Conversation r10 = r1.getConversation()
            r9.<init>(r10)
            r4.L$0 = r8
            r4.L$1 = r3
            r4.L$2 = r5
            r4.L$3 = r1
            r4.label = r2
            java.lang.Object r2 = r7.emitEvent((io.intercom.android.sdk.m5.data.IntercomEvent) r9, (qf.C6658d<? super lf.C6514M>) r4)
            if (r2 != r6) goto L_0x01bb
            return r6
        L_0x01bb:
            r2 = r1
            r4 = r3
            r3 = r5
            r5 = r8
        L_0x01bf:
            io.intercom.android.sdk.m5.data.IntercomDataLayer r1 = r5.intercomDataLayer
            io.intercom.android.sdk.models.Config r5 = r2.getConfig()
            java.lang.String r6 = "getConfig(...)"
            kotlin.jvm.internal.C6496s.g(r5, r6)
            r1.updateConfig(r5)
        L_0x01cd:
            java.lang.Object r1 = r4.getValue()
            r5 = r1
            io.intercom.android.sdk.m5.conversation.states.ConversationClientState r5 = (io.intercom.android.sdk.m5.conversation.states.ConversationClientState) r5
            java.lang.Object r6 = r4.getValue()
            io.intercom.android.sdk.m5.conversation.states.ConversationClientState r6 = (io.intercom.android.sdk.m5.conversation.states.ConversationClientState) r6
            java.util.Map r6 = r6.getPendingMessages()
            java.util.Map r7 = mf.O.B(r6)
            r6 = r7
            r7.remove(r3)
            io.intercom.android.sdk.models.Conversation r7 = r2.getConversation()
            io.intercom.android.sdk.models.Conversation r8 = r2.getConversation()
            java.lang.String r8 = r8.getId()
            r26 = 1048568(0xffff8, float:1.469357E-39)
            r27 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            r25 = 0
            io.intercom.android.sdk.m5.conversation.states.ConversationClientState r5 = io.intercom.android.sdk.m5.conversation.states.ConversationClientState.copy$default(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27)
            boolean r1 = r4.e(r1, r5)
            if (r1 == 0) goto L_0x01cd
            goto L_0x0317
        L_0x021e:
            lf.s r1 = new lf.s
            r1.<init>()
            throw r1
        L_0x0224:
            java.util.concurrent.atomic.AtomicBoolean r2 = r8.newConversationRequestPending
            r2.set(r1)
            io.intercom.android.sdk.m5.conversation.usecase.SoundEffectsUseCase r1 = r8.soundEffectsUseCase
            io.intercom.android.sdk.m5.conversation.usecase.Action r2 = io.intercom.android.sdk.m5.conversation.usecase.Action.MESSAGE_FAILED
            r1.invoke$intercom_sdk_base_release(r2)
            io.intercom.android.sdk.m5.conversation.usecase.SendMessageUseCase$Companion r1 = Companion
            r1.updateFailedPendingMessages(r3, r5)
            goto L_0x0317
        L_0x0237:
            r6 = r13
            r4 = r14
            r3 = r15
            java.lang.Object r1 = r30.getValue()
            io.intercom.android.sdk.m5.conversation.states.ConversationClientState r1 = (io.intercom.android.sdk.m5.conversation.states.ConversationClientState) r1
            java.lang.String r1 = r1.getConversationId()
            if (r1 != 0) goto L_0x0270
            io.intercom.android.sdk.m5.conversation.usecase.SendMessageUseCase$invoke$conversationId$1 r1 = new io.intercom.android.sdk.m5.conversation.usecase.SendMessageUseCase$invoke$conversationId$1
            r1.<init>(r12)
            r4.L$0 = r0
            r4.L$1 = r7
            r2 = r31
            r4.L$2 = r2
            r4.L$3 = r3
            r5 = r33
            r4.Z$0 = r5
            r4.label = r9
            java.lang.Object r1 = Xg.C5696h.v(r7, r1, r4)
            if (r1 != r6) goto L_0x0262
            return r6
        L_0x0262:
            r9 = r0
        L_0x0263:
            io.intercom.android.sdk.m5.conversation.states.ConversationClientState r1 = (io.intercom.android.sdk.m5.conversation.states.ConversationClientState) r1
            java.lang.String r1 = r1.getConversationId()
            r10 = r9
        L_0x026a:
            r9 = r5
            r5 = r1
            r1 = r7
            r7 = r2
            r2 = r3
            goto L_0x0276
        L_0x0270:
            r2 = r31
            r5 = r33
            r10 = r0
            goto L_0x026a
        L_0x0276:
            if (r5 == 0) goto L_0x0317
            java.lang.Object r3 = r1.getValue()
            io.intercom.android.sdk.m5.conversation.states.ConversationClientState r3 = (io.intercom.android.sdk.m5.conversation.states.ConversationClientState) r3
            io.intercom.android.sdk.models.Conversation r3 = r3.getConversation()
            if (r3 == 0) goto L_0x02b5
            java.util.List r3 = r3.parts()
            if (r3 == 0) goto L_0x02b5
            int r11 = r3.size()
            java.util.ListIterator r3 = r3.listIterator(r11)
        L_0x0292:
            boolean r11 = r3.hasPrevious()
            if (r11 == 0) goto L_0x02a6
            java.lang.Object r11 = r3.previous()
            r13 = r11
            io.intercom.android.sdk.models.Part r13 = (io.intercom.android.sdk.models.Part) r13
            boolean r13 = r13.isAdmin()
            if (r13 == 0) goto L_0x0292
            goto L_0x02a7
        L_0x02a6:
            r11 = r12
        L_0x02a7:
            io.intercom.android.sdk.models.Part r11 = (io.intercom.android.sdk.models.Part) r11
            if (r11 == 0) goto L_0x02b5
            long r13 = r11.getCreatedAt()
            java.lang.Long r3 = kotlin.coroutines.jvm.internal.b.d(r13)
            r11 = r3
            goto L_0x02b6
        L_0x02b5:
            r11 = r12
        L_0x02b6:
            io.intercom.android.sdk.m5.conversation.data.ConversationRepository r3 = r10.conversationRepository
            r4.L$0 = r10
            r4.L$1 = r1
            r4.L$2 = r2
            r4.L$3 = r12
            r4.label = r8
            r13 = r4
            r4 = r5
            r5 = r2
            r14 = r6
            r6 = r7
            r7 = r11
            r8 = r9
            r9 = r13
            java.lang.Object r3 = r3.replyToConversation(r4, r5, r6, r7, r8, r9)
            if (r3 != r14) goto L_0x02d1
            return r14
        L_0x02d1:
            r4 = r10
            r28 = r3
            r3 = r1
            r1 = r28
        L_0x02d7:
            io.intercom.android.sdk.helpcenter.utils.networking.NetworkResponse r1 = (io.intercom.android.sdk.helpcenter.utils.networking.NetworkResponse) r1
            boolean r5 = r1 instanceof io.intercom.android.sdk.helpcenter.utils.networking.NetworkResponse.ClientError
            if (r5 != 0) goto L_0x030b
            boolean r5 = r1 instanceof io.intercom.android.sdk.helpcenter.utils.networking.NetworkResponse.NetworkError
            if (r5 != 0) goto L_0x030b
            boolean r5 = r1 instanceof io.intercom.android.sdk.helpcenter.utils.networking.NetworkResponse.ServerError
            if (r5 == 0) goto L_0x02e6
            goto L_0x030b
        L_0x02e6:
            boolean r1 = r1 instanceof io.intercom.android.sdk.helpcenter.utils.networking.NetworkResponse.Success
            if (r1 == 0) goto L_0x0305
            io.intercom.android.sdk.m5.conversation.usecase.SoundEffectsUseCase r1 = r4.soundEffectsUseCase
            io.intercom.android.sdk.m5.conversation.usecase.Action r2 = io.intercom.android.sdk.m5.conversation.usecase.Action.MESSAGE_SENT
            r1.invoke$intercom_sdk_base_release(r2)
            io.intercom.android.sdk.m5.conversation.usecase.RefreshConversationUseCase r1 = r4.refreshConversationUseCase
            io.intercom.android.sdk.m5.conversation.data.GetConversationReason r2 = io.intercom.android.sdk.m5.conversation.data.GetConversationReason.NEW_COMMENT
            r13.L$0 = r12
            r13.L$1 = r12
            r13.L$2 = r12
            r4 = 5
            r13.label = r4
            java.lang.Object r1 = r1.invoke(r3, r2, r13)
            if (r1 != r14) goto L_0x0317
            return r14
        L_0x0305:
            lf.s r1 = new lf.s
            r1.<init>()
            throw r1
        L_0x030b:
            io.intercom.android.sdk.m5.conversation.usecase.SoundEffectsUseCase r1 = r4.soundEffectsUseCase
            io.intercom.android.sdk.m5.conversation.usecase.Action r4 = io.intercom.android.sdk.m5.conversation.usecase.Action.MESSAGE_FAILED
            r1.invoke$intercom_sdk_base_release(r4)
            io.intercom.android.sdk.m5.conversation.usecase.SendMessageUseCase$Companion r1 = Companion
            r1.updateFailedPendingMessages(r3, r2)
        L_0x0317:
            lf.M r1 = lf.C6514M.f71813a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: io.intercom.android.sdk.m5.conversation.usecase.SendMessageUseCase.invoke(Xg.x, java.util.List, java.lang.String, boolean, qf.d):java.lang.Object");
    }
}
