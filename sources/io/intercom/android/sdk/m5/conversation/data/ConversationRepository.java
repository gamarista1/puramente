package io.intercom.android.sdk.m5.conversation.data;

import Sg.p;
import Ug.K;
import Xg.C5694f;
import android.content.Context;
import com.facebook.react.bridge.BaseJavaModule;
import com.google.gson.e;
import io.intercom.android.nexus.NexusClient;
import io.intercom.android.sdk.Injector;
import io.intercom.android.sdk.api.Api;
import io.intercom.android.sdk.api.ExternalUploadApi;
import io.intercom.android.sdk.api.MessengerApi;
import io.intercom.android.sdk.api.MessengerApiHelper;
import io.intercom.android.sdk.api.UserUpdateRequest;
import io.intercom.android.sdk.blocks.lib.models.Block;
import io.intercom.android.sdk.helpcenter.utils.networking.NetworkResponse;
import io.intercom.android.sdk.identity.UserIdentity;
import io.intercom.android.sdk.m5.conversation.ui.components.composer.MediaData;
import io.intercom.android.sdk.m5.upload.data.UploadRepository;
import io.intercom.android.sdk.metrics.MetricTracker;
import io.intercom.android.sdk.models.ComposerSuggestions;
import io.intercom.android.sdk.models.Conversation;
import io.intercom.android.sdk.models.ConversationResponse;
import io.intercom.android.sdk.models.GifResponse;
import io.intercom.android.sdk.models.Part;
import io.intercom.android.sdk.models.Upload;
import io.intercom.android.sdk.utilities.TimeFormatterExtKt;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.b;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lf.C6502A;
import lf.C6514M;
import lf.C6531o;
import lf.C6535s;
import mf.O;
import qf.C6658d;
import rf.C6680b;

@Metadata(d1 = {"\u0000®\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\b\u0013\b\u0001\u0018\u00002\u00020\u0001BA\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0013\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010¢\u0006\u0004\b\u0012\u0010\u0013JF\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u001e2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u00142\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u00172\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\u0006\u0010\u001d\u001a\u00020\u001cH@¢\u0006\u0004\b \u0010!Jv\u0010*\u001a\b\u0012\u0004\u0012\u00020)0\u001e2\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u00172\b\u0010\"\u001a\u0004\u0018\u00010\u00142\b\u0010#\u001a\u0004\u0018\u00010\u00142\b\u0010$\u001a\u0004\u0018\u00010\u00142\u000e\u0010&\u001a\n\u0012\u0004\u0012\u00020%\u0018\u00010\u00172\u0006\u0010\u001d\u001a\u00020\u001c2\b\u0010'\u001a\u0004\u0018\u00010\u001a2\b\u0010(\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0016\u001a\u00020\u0014H@¢\u0006\u0004\b*\u0010+J&\u0010/\u001a\b\u0012\u0004\u0012\u00020.0\u001e2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010-\u001a\u00020,H@¢\u0006\u0004\b/\u00100J(\u00102\u001a\b\u0012\u0004\u0012\u00020.0\u001e2\u0006\u00101\u001a\u00020\u00142\b\u0010(\u001a\u0004\u0018\u00010\u0014H@¢\u0006\u0004\b2\u00103J6\u00106\u001a\b\u0012\u0004\u0012\u00020\u001f0\u001e2\u0006\u00104\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u00105\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0014H@¢\u0006\u0004\b6\u00107J\u0018\u00109\u001a\u0002082\u0006\u0010\u0015\u001a\u00020\u0014H@¢\u0006\u0004\b9\u0010:J\u001e\u0010=\u001a\b\u0012\u0004\u0012\u00020<0\u001e2\u0006\u0010;\u001a\u00020\u0014H@¢\u0006\u0004\b=\u0010:J\u001e\u0010A\u001a\b\u0012\u0004\u0012\u00020@0\u001e2\u0006\u0010?\u001a\u00020>H@¢\u0006\u0004\bA\u0010BJ>\u0010G\u001a\b\u0012\u0004\u0012\u00020.0\u001e2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010C\u001a\u00020\u00142\u0006\u0010D\u001a\u00020\u00142\u0006\u0010E\u001a\u00020\u00142\u0006\u0010F\u001a\u00020\u0014H@¢\u0006\u0004\bG\u0010HJ\r\u0010J\u001a\u00020I¢\u0006\u0004\bJ\u0010KJ\r\u0010L\u001a\u000208¢\u0006\u0004\bL\u0010MJ#\u0010P\u001a\u0002082\u0006\u0010\u0015\u001a\u00020\u00142\f\u0010O\u001a\b\u0012\u0004\u0012\u00020\u00140N¢\u0006\u0004\bP\u0010QR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010R\u001a\u0004\bS\u0010TR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010UR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010V\u001a\u0004\bW\u0010XR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010Y\u001a\u0004\bZ\u0010[R\u001b\u0010J\u001a\u00020I8BX\u0002¢\u0006\f\n\u0004\b\\\u0010]\u001a\u0004\b^\u0010KR\u001a\u0010_\u001a\b\u0012\u0004\u0012\u00020\u00110\u00108\u0002X\u0004¢\u0006\u0006\n\u0004\b_\u0010`¨\u0006a"}, d2 = {"Lio/intercom/android/sdk/m5/conversation/data/ConversationRepository;", "", "Lio/intercom/android/sdk/api/MessengerApi;", "messengerApi", "Lio/intercom/android/sdk/m5/upload/data/UploadRepository;", "uploadRepository", "Lio/intercom/android/sdk/api/Api;", "api", "Lio/intercom/android/sdk/identity/UserIdentity;", "userIdentity", "Lio/intercom/android/nexus/NexusClient;", "nexusClient", "LUg/K;", "scope", "<init>", "(Lio/intercom/android/sdk/api/MessengerApi;Lio/intercom/android/sdk/m5/upload/data/UploadRepository;Lio/intercom/android/sdk/api/Api;Lio/intercom/android/sdk/identity/UserIdentity;Lio/intercom/android/nexus/NexusClient;LUg/K;)V", "LXg/f;", "Lio/intercom/android/sdk/m5/conversation/data/ParsedNexusEvent;", "realTimeEvents", "()LXg/f;", "", "conversationId", "clientUUID", "", "Lio/intercom/android/sdk/blocks/lib/models/Block$Builder;", "blocks", "", "lastAdminPartCreatedAt", "", "fromVoiceDictation", "Lio/intercom/android/sdk/helpcenter/utils/networking/NetworkResponse;", "Lio/intercom/android/sdk/models/Part$Builder;", "replyToConversation", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/Long;ZLqf/d;)Ljava/lang/Object;", "botIntroId", "articleId", "botBehaviourId", "Lio/intercom/android/sdk/models/ComposerSuggestions$Suggestion;", "suggestions", "snapshotId", "openRequestId", "Lio/intercom/android/sdk/models/ConversationResponse$Builder;", "createNewConversation", "(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;ZLjava/lang/Long;Ljava/lang/String;Ljava/lang/String;Lqf/d;)Ljava/lang/Object;", "Lio/intercom/android/sdk/m5/conversation/data/GetConversationReason;", "reason", "Lio/intercom/android/sdk/models/Conversation;", "getConversation", "(Ljava/lang/String;Lio/intercom/android/sdk/m5/conversation/data/GetConversationReason;Lqf/d;)Ljava/lang/Object;", "suggestionId", "createConversationFromSuggestion", "(Ljava/lang/String;Ljava/lang/String;Lqf/d;)Ljava/lang/Object;", "quickReplyId", "quickReplyPartId", "addQuickReplyToConversation", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lqf/d;)Ljava/lang/Object;", "Llf/M;", "markAsRead", "(Ljava/lang/String;Lqf/d;)Ljava/lang/Object;", "searchQuery", "Lio/intercom/android/sdk/models/GifResponse;", "loadGifs", "Lio/intercom/android/sdk/m5/conversation/ui/components/composer/MediaData$Media;", "imageData", "Lio/intercom/android/sdk/models/Upload$Builder;", "uploadMedia", "(Lio/intercom/android/sdk/m5/conversation/ui/components/composer/MediaData$Media;Lqf/d;)Ljava/lang/Object;", "partId", "identifier", "formValue", "formType", "submitForm", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lqf/d;)Ljava/lang/Object;", "Lio/intercom/android/sdk/m5/conversation/data/NexusEventsRepository;", "nexusEventsRepository", "()Lio/intercom/android/sdk/m5/conversation/data/NexusEventsRepository;", "dismissPrivacyPolicy", "()V", "", "interactions", "recordInteractions", "(Ljava/lang/String;[Ljava/lang/String;)V", "Lio/intercom/android/sdk/api/MessengerApi;", "getMessengerApi", "()Lio/intercom/android/sdk/api/MessengerApi;", "Lio/intercom/android/sdk/m5/upload/data/UploadRepository;", "Lio/intercom/android/sdk/api/Api;", "getApi", "()Lio/intercom/android/sdk/api/Api;", "Lio/intercom/android/sdk/identity/UserIdentity;", "getUserIdentity", "()Lio/intercom/android/sdk/identity/UserIdentity;", "nexusEventsRepository$delegate", "Lkotlin/Lazy;", "getNexusEventsRepository", "nexusEventFlow", "LXg/f;", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ConversationRepository {
    public static final int $stable = 8;
    private final Api api;
    private final MessengerApi messengerApi;
    private final C5694f nexusEventFlow;
    private final Lazy nexusEventsRepository$delegate;
    private final UploadRepository uploadRepository;
    private final UserIdentity userIdentity;

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
                io.intercom.android.sdk.m5.conversation.data.GetConversationReason[] r0 = io.intercom.android.sdk.m5.conversation.data.GetConversationReason.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                io.intercom.android.sdk.m5.conversation.data.GetConversationReason r1 = io.intercom.android.sdk.m5.conversation.data.GetConversationReason.NEW_COMMENT     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                io.intercom.android.sdk.m5.conversation.data.GetConversationReason r1 = io.intercom.android.sdk.m5.conversation.data.GetConversationReason.NEXUS_CONNECTED     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                io.intercom.android.sdk.m5.conversation.data.GetConversationReason r1 = io.intercom.android.sdk.m5.conversation.data.GetConversationReason.NETWORK_CONNECTED     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                io.intercom.android.sdk.m5.conversation.data.GetConversationReason r1 = io.intercom.android.sdk.m5.conversation.data.GetConversationReason.OPEN_CONVERSATION     // Catch:{ NoSuchFieldError -> 0x002b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002b }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002b }
            L_0x002b:
                io.intercom.android.sdk.m5.conversation.data.GetConversationReason r1 = io.intercom.android.sdk.m5.conversation.data.GetConversationReason.POLLING     // Catch:{ NoSuchFieldError -> 0x0034 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0034 }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0034 }
            L_0x0034:
                $EnumSwitchMapping$0 = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: io.intercom.android.sdk.m5.conversation.data.ConversationRepository.WhenMappings.<clinit>():void");
        }
    }

    public ConversationRepository(MessengerApi messengerApi2, UploadRepository uploadRepository2, Api api2, UserIdentity userIdentity2, NexusClient nexusClient, K k10) {
        C6496s.h(messengerApi2, "messengerApi");
        C6496s.h(uploadRepository2, "uploadRepository");
        C6496s.h(api2, MetricTracker.Place.API);
        C6496s.h(userIdentity2, "userIdentity");
        C6496s.h(nexusClient, "nexusClient");
        C6496s.h(k10, "scope");
        this.messengerApi = messengerApi2;
        this.uploadRepository = uploadRepository2;
        this.api = api2;
        this.userIdentity = userIdentity2;
        this.nexusEventsRepository$delegate = C6531o.b(new a(nexusClient, this, k10));
        this.nexusEventFlow = NexusEventAsFlowKt.nexusEventAsFlow(nexusClient);
    }

    private final NexusEventsRepository getNexusEventsRepository() {
        return (NexusEventsRepository) this.nexusEventsRepository$delegate.getValue();
    }

    /* access modifiers changed from: private */
    public static final NexusEventsRepository nexusEventsRepository_delegate$lambda$0(NexusClient nexusClient, ConversationRepository conversationRepository, K k10) {
        C6496s.h(nexusClient, "$nexusClient");
        C6496s.h(conversationRepository, "this$0");
        C6496s.h(k10, "$scope");
        return new NexusEventsRepository(nexusClient, conversationRepository.userIdentity, k10);
    }

    public final Object addQuickReplyToConversation(String str, String str2, String str3, String str4, C6658d<? super NetworkResponse<Part.Builder>> dVar) {
        Map n10 = O.n(C6502A.a("reply_option_uuid", str), C6502A.a("client_assigned_uuid", str4));
        if (str3.length() > 0) {
            n10.put("quick_reply_part_id", str3);
        }
        return this.messengerApi.addConversationQuickReplySuspend(str2, MessengerApiHelper.INSTANCE.getDefaultRequestBody$intercom_sdk_base_release(n10), dVar);
    }

    public final Object createConversationFromSuggestion(String str, String str2, C6658d<? super NetworkResponse<Conversation>> dVar) {
        MessengerApiHelper messengerApiHelper = MessengerApiHelper.INSTANCE;
        Map c10 = O.c();
        c10.put("id", str);
        if (str2 != null) {
            c10.put("messenger_open_request_id", str2);
        }
        return this.messengerApi.triggerInboundConversationSuspend(messengerApiHelper.getDefaultRequestBody$intercom_sdk_base_release(O.b(c10)), dVar);
    }

    public final Object createNewConversation(List<Block.Builder> list, String str, String str2, String str3, List<ComposerSuggestions.Suggestion> list2, boolean z10, Long l10, String str4, String str5, C6658d<? super NetworkResponse<ConversationResponse.Builder>> dVar) {
        Map<String, Object> baseNewConversationParams = this.api.baseNewConversationParams();
        baseNewConversationParams.put("blocks", list);
        baseNewConversationParams.put("from_voice_dictation", b.a(z10));
        baseNewConversationParams.put("client_assigned_uuid", str5);
        if (str != null) {
            baseNewConversationParams.put("bot_intro", str);
        }
        if (str2 != null) {
            baseNewConversationParams.put("article_id", str2);
        }
        if (str3 != null) {
            baseNewConversationParams.put("resolution_bot_behavior_version_id", str3);
        }
        if (list2 != null) {
            baseNewConversationParams.put(MetricTracker.Object.COMPOSER_SUGGESTIONS, new e().v(list2));
        }
        if (l10 != null) {
            baseNewConversationParams.put("snapshot_id", l10);
        }
        if (str4 != null) {
            baseNewConversationParams.put("messenger_open_request_id", str4);
        }
        MessengerApiHelper messengerApiHelper = MessengerApiHelper.INSTANCE;
        C6496s.e(baseNewConversationParams);
        return this.messengerApi.startNewConversationSuspend(messengerApiHelper.getDefaultRequestBody$intercom_sdk_base_release(baseNewConversationParams), dVar);
    }

    public final void dismissPrivacyPolicy() {
        this.api.updateUser(UserUpdateRequest.create(false, false, O.f(C6502A.a("dismissed_privacy_policy_notice_at", Long.valueOf(System.currentTimeMillis() / ((long) 1000)))), true), new ConversationRepository$dismissPrivacyPolicy$1());
    }

    public final Api getApi() {
        return this.api;
    }

    public final Object getConversation(String str, GetConversationReason getConversationReason, C6658d<? super NetworkResponse<Conversation>> dVar) {
        String str2;
        int i10 = WhenMappings.$EnumSwitchMapping$0[getConversationReason.ordinal()];
        if (i10 == 1) {
            str2 = "Nexus New Comment";
        } else if (i10 == 2) {
            str2 = "Nexus Reconnected";
        } else if (i10 == 3) {
            str2 = "Internet Reconnected";
        } else if (i10 == 4) {
            str2 = "Click Conversation";
        } else if (i10 == 5) {
            str2 = "State Sync";
        } else {
            throw new C6535s();
        }
        Map n10 = O.n(C6502A.a("request_origin", str2));
        if (getConversationReason == GetConversationReason.POLLING) {
            n10.put(BaseJavaModule.METHOD_TYPE_SYNC, com.amazon.a.a.o.b.f37475af);
        }
        return this.messengerApi.getConversationSuspend(str, MessengerApiHelper.INSTANCE.getDefaultRequestBody$intercom_sdk_base_release(n10), dVar);
    }

    public final MessengerApi getMessengerApi() {
        return this.messengerApi;
    }

    public final UserIdentity getUserIdentity() {
        return this.userIdentity;
    }

    public final Object loadGifs(String str, C6658d<? super NetworkResponse<? extends GifResponse>> dVar) {
        Map map;
        if (!p.d0(str)) {
            map = O.f(C6502A.a("query", str));
        } else {
            map = O.i();
        }
        return this.messengerApi.getGifsSuspended(MessengerApiHelper.INSTANCE.getDefaultRequestBody$intercom_sdk_base_release(map), dVar);
    }

    public final Object markAsRead(String str, C6658d<? super C6514M> dVar) {
        Object markAsReadSuspend = this.messengerApi.markAsReadSuspend(str, MessengerApiHelper.INSTANCE.getDefaultRequestBody$intercom_sdk_base_release(O.f(C6502A.a("app_id", Injector.get().getAppIdentity().appId()))), dVar);
        if (markAsReadSuspend == C6680b.f()) {
            return markAsReadSuspend;
        }
        return C6514M.f71813a;
    }

    public final NexusEventsRepository nexusEventsRepository() {
        return getNexusEventsRepository();
    }

    public final C5694f realTimeEvents() {
        return this.nexusEventFlow;
    }

    public final void recordInteractions(String str, String[] strArr) {
        C6496s.h(str, "conversationId");
        C6496s.h(strArr, "interactions");
        this.api.recordInteractions(str, strArr);
    }

    public final Object replyToConversation(String str, String str2, List<Block.Builder> list, Long l10, boolean z10, C6658d<? super NetworkResponse<Part.Builder>> dVar) {
        Map<String, Object> createBaseReplyParams = this.api.createBaseReplyParams();
        createBaseReplyParams.put("blocks", list);
        createBaseReplyParams.put("client_assigned_uuid", str2);
        createBaseReplyParams.put("from_voice_dictation", b.a(z10));
        if (l10 != null) {
            createBaseReplyParams.put("last_admin_part_created_at", TimeFormatterExtKt.toISOFormat(l10.longValue()));
        }
        MessengerApiHelper messengerApiHelper = MessengerApiHelper.INSTANCE;
        C6496s.e(createBaseReplyParams);
        return this.messengerApi.replyToConversationSuspend(str, messengerApiHelper.getDefaultRequestBody$intercom_sdk_base_release(createBaseReplyParams), dVar);
    }

    public final Object submitForm(String str, String str2, String str3, String str4, String str5, C6658d<? super NetworkResponse<Conversation>> dVar) {
        return this.messengerApi.submitFormSuspend(str, MessengerApiHelper.INSTANCE.getDefaultRequestBody$intercom_sdk_base_release(O.f(C6502A.a("form_params", O.l(C6502A.a("conversation_part_id", str2), C6502A.a("identifier", str3), C6502A.a("value", str4), C6502A.a("type", str5))))), dVar);
    }

    public final Object uploadMedia(MediaData.Media media, C6658d<? super NetworkResponse<Upload.Builder>> dVar) {
        return this.uploadRepository.uploadFile(media, dVar);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ConversationRepository(MessengerApi messengerApi2, UploadRepository uploadRepository2, Api api2, UserIdentity userIdentity2, NexusClient nexusClient, K k10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? Injector.get().getMessengerApi() : messengerApi2, (i10 & 2) != 0 ? new UploadRepository((MessengerApi) null, (ExternalUploadApi) null, (UserIdentity) null, (Context) null, 15, (DefaultConstructorMarker) null) : uploadRepository2, (i10 & 4) != 0 ? Injector.get().getApi() : api2, (i10 & 8) != 0 ? Injector.get().getUserIdentity() : userIdentity2, (i10 & 16) != 0 ? Injector.get().getNexusClient() : nexusClient, k10);
    }
}
