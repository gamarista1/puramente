package io.intercom.android.sdk.m5.conversation.usecase;

import Ug.L;
import Xg.w;
import Xg.x;
import android.content.Context;
import io.intercom.android.sdk.Injector;
import io.intercom.android.sdk.identity.UserIdentity;
import io.intercom.android.sdk.m5.conversation.data.ConversationRepository;
import io.intercom.android.sdk.m5.conversation.ui.components.composer.MediaData;
import io.intercom.android.sdk.models.AttachmentSettings;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import lf.C6514M;
import qf.C6658d;
import rf.C6680b;
import yf.C6787a;

@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\b\u0001\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0004\b\r\u0010\u000eJ<\u0010\u001a\u001a\u00020\u00192\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017H@¢\u0006\u0004\b\u001a\u0010\u001bJ>\u0010\u001c\u001a\u00020\u00192\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\u0006\u0010\u0016\u001a\u00020\u00152\b\b\u0002\u0010\u0018\u001a\u00020\u0017H@¢\u0006\u0004\b\u001c\u0010\u001bJ>\u0010\u001d\u001a\u00020\u00192\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\u0006\u0010\u0016\u001a\u00020\u00152\b\b\u0002\u0010\u0018\u001a\u00020\u0017HB¢\u0006\u0004\b\u001d\u0010\u001bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010!R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\"R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\t\u0010#R\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0002X\u0004¢\u0006\u0006\n\u0004\b\f\u0010$¨\u0006%"}, d2 = {"Lio/intercom/android/sdk/m5/conversation/usecase/SendMediaUseCase;", "", "Lio/intercom/android/sdk/m5/conversation/usecase/SendMessageUseCase;", "sendMessageUseCase", "Lio/intercom/android/sdk/m5/conversation/data/ConversationRepository;", "conversationRepository", "Lio/intercom/android/sdk/identity/UserIdentity;", "userIdentity", "Landroid/content/Context;", "applicationContext", "Lkotlin/Function0;", "Lio/intercom/android/sdk/models/AttachmentSettings;", "attachmentSettings", "<init>", "(Lio/intercom/android/sdk/m5/conversation/usecase/SendMessageUseCase;Lio/intercom/android/sdk/m5/conversation/data/ConversationRepository;Lio/intercom/android/sdk/identity/UserIdentity;Landroid/content/Context;Lyf/a;)V", "LXg/x;", "Lio/intercom/android/sdk/m5/conversation/states/ConversationClientState;", "clientState", "LXg/w;", "Lio/intercom/android/sdk/m5/conversation/states/ConversationUiEffect;", "uiEffect", "Lio/intercom/android/sdk/m5/conversation/ui/components/composer/MediaData$Media;", "mediaData", "", "uuid", "Llf/M;", "sendMedia", "(LXg/x;LXg/w;Lio/intercom/android/sdk/m5/conversation/ui/components/composer/MediaData$Media;Ljava/lang/String;Lqf/d;)Ljava/lang/Object;", "sendMediaNewWay", "invoke", "Lio/intercom/android/sdk/m5/conversation/usecase/SendMessageUseCase;", "getSendMessageUseCase", "()Lio/intercom/android/sdk/m5/conversation/usecase/SendMessageUseCase;", "Lio/intercom/android/sdk/m5/conversation/data/ConversationRepository;", "Lio/intercom/android/sdk/identity/UserIdentity;", "Landroid/content/Context;", "Lyf/a;", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SendMediaUseCase {
    public static final int $stable = 8;
    /* access modifiers changed from: private */
    public final Context applicationContext;
    /* access modifiers changed from: private */
    public final C6787a attachmentSettings;
    /* access modifiers changed from: private */
    public final ConversationRepository conversationRepository;
    private final SendMessageUseCase sendMessageUseCase;
    /* access modifiers changed from: private */
    public final UserIdentity userIdentity;

    public SendMediaUseCase(SendMessageUseCase sendMessageUseCase2, ConversationRepository conversationRepository2, UserIdentity userIdentity2, Context context, C6787a aVar) {
        C6496s.h(sendMessageUseCase2, "sendMessageUseCase");
        C6496s.h(conversationRepository2, "conversationRepository");
        C6496s.h(userIdentity2, "userIdentity");
        C6496s.h(context, "applicationContext");
        C6496s.h(aVar, "attachmentSettings");
        this.sendMessageUseCase = sendMessageUseCase2;
        this.conversationRepository = conversationRepository2;
        this.userIdentity = userIdentity2;
        this.applicationContext = context;
        this.attachmentSettings = aVar;
    }

    /* access modifiers changed from: private */
    public static final AttachmentSettings _init_$lambda$0() {
        return Injector.get().getAppConfigProvider().get().getAttachmentSettings();
    }

    public static /* synthetic */ Object invoke$default(SendMediaUseCase sendMediaUseCase, x xVar, w wVar, MediaData.Media media, String str, C6658d dVar, int i10, Object obj) {
        if ((i10 & 8) != 0) {
            str = UUID.randomUUID().toString();
        }
        return sendMediaUseCase.invoke(xVar, wVar, media, str, dVar);
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x007e  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x01b5 A[LOOP:1: B:37:0x01b5->B:44:0x0221, LOOP_START] */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0248  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x0270  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x0328  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0033  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object sendMedia(Xg.x r39, Xg.w r40, io.intercom.android.sdk.m5.conversation.ui.components.composer.MediaData.Media r41, java.lang.String r42, qf.C6658d<? super lf.C6514M> r43) {
        /*
            r38 = this;
            r0 = r38
            r1 = r39
            r2 = r41
            r3 = r42
            r4 = r43
            boolean r5 = r4 instanceof io.intercom.android.sdk.m5.conversation.usecase.SendMediaUseCase$sendMedia$1
            if (r5 == 0) goto L_0x001e
            r5 = r4
            io.intercom.android.sdk.m5.conversation.usecase.SendMediaUseCase$sendMedia$1 r5 = (io.intercom.android.sdk.m5.conversation.usecase.SendMediaUseCase$sendMedia$1) r5
            int r6 = r5.label
            r7 = -2147483648(0xffffffff80000000, float:-0.0)
            r8 = r6 & r7
            if (r8 == 0) goto L_0x001e
            int r6 = r6 - r7
            r5.label = r6
        L_0x001c:
            r11 = r5
            goto L_0x0024
        L_0x001e:
            io.intercom.android.sdk.m5.conversation.usecase.SendMediaUseCase$sendMedia$1 r5 = new io.intercom.android.sdk.m5.conversation.usecase.SendMediaUseCase$sendMedia$1
            r5.<init>(r0, r4)
            goto L_0x001c
        L_0x0024:
            java.lang.Object r4 = r11.result
            java.lang.Object r5 = rf.C6680b.f()
            int r6 = r11.label
            r7 = 4
            r8 = 3
            r9 = 2
            r10 = 1
            r12 = 0
            if (r6 == 0) goto L_0x007e
            if (r6 == r10) goto L_0x0064
            if (r6 == r9) goto L_0x005b
            if (r6 == r8) goto L_0x0044
            if (r6 != r7) goto L_0x003c
            goto L_0x005b
        L_0x003c:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L_0x0044:
            java.lang.Object r1 = r11.L$3
            io.intercom.android.sdk.m5.conversation.ui.components.composer.MediaData$Media r1 = (io.intercom.android.sdk.m5.conversation.ui.components.composer.MediaData.Media) r1
            java.lang.Object r2 = r11.L$2
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r3 = r11.L$1
            Xg.x r3 = (Xg.x) r3
            java.lang.Object r6 = r11.L$0
            io.intercom.android.sdk.m5.conversation.usecase.SendMediaUseCase r6 = (io.intercom.android.sdk.m5.conversation.usecase.SendMediaUseCase) r6
            lf.w.b(r4)
            r9 = r2
            r7 = r3
            goto L_0x0260
        L_0x005b:
            java.lang.Object r1 = r11.L$0
            io.intercom.android.sdk.m5.conversation.ui.components.composer.MediaData$Media r1 = (io.intercom.android.sdk.m5.conversation.ui.components.composer.MediaData.Media) r1
            lf.w.b(r4)
            goto L_0x0391
        L_0x0064:
            java.lang.Object r1 = r11.L$3
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r2 = r11.L$2
            Xg.w r2 = (Xg.w) r2
            java.lang.Object r3 = r11.L$1
            Xg.x r3 = (Xg.x) r3
            java.lang.Object r6 = r11.L$0
            io.intercom.android.sdk.m5.conversation.usecase.SendMediaUseCase r6 = (io.intercom.android.sdk.m5.conversation.usecase.SendMediaUseCase) r6
            lf.w.b(r4)
            r37 = r3
            r3 = r1
            r1 = r37
            goto L_0x019f
        L_0x007e:
            lf.w.b(r4)
            boolean r4 = r2 instanceof io.intercom.android.sdk.m5.conversation.ui.components.composer.MediaData.Media.Image
            if (r4 == 0) goto L_0x00af
            io.intercom.android.sdk.blocks.lib.models.Block$Builder r4 = new io.intercom.android.sdk.blocks.lib.models.Block$Builder
            r4.<init>()
            r6 = r2
            io.intercom.android.sdk.m5.conversation.ui.components.composer.MediaData$Media$Image r6 = (io.intercom.android.sdk.m5.conversation.ui.components.composer.MediaData.Media.Image) r6
            android.net.Uri r13 = r6.getUri()
            io.intercom.android.sdk.blocks.lib.models.Block$Builder r4 = r4.withLocalUri(r13)
            int r13 = r6.getWidth()
            io.intercom.android.sdk.blocks.lib.models.Block$Builder r4 = r4.withWidth(r13)
            int r6 = r6.getHeight()
            io.intercom.android.sdk.blocks.lib.models.Block$Builder r4 = r4.withHeight(r6)
            java.lang.String r6 = "IMAGE"
            io.intercom.android.sdk.blocks.lib.models.Block$Builder r4 = r4.withType(r6)
            kotlin.jvm.internal.C6496s.e(r4)
            goto L_0x00f9
        L_0x00af:
            boolean r4 = r2 instanceof io.intercom.android.sdk.m5.conversation.ui.components.composer.MediaData.Media.Video
            if (r4 != 0) goto L_0x00be
            boolean r4 = r2 instanceof io.intercom.android.sdk.m5.conversation.ui.components.composer.MediaData.Media.Other
            if (r4 == 0) goto L_0x00b8
            goto L_0x00be
        L_0x00b8:
            lf.s r1 = new lf.s
            r1.<init>()
            throw r1
        L_0x00be:
            io.intercom.android.sdk.blocks.lib.models.BlockAttachment$Builder r4 = new io.intercom.android.sdk.blocks.lib.models.BlockAttachment$Builder
            r4.<init>()
            java.lang.String r6 = r41.getFileName()
            io.intercom.android.sdk.blocks.lib.models.BlockAttachment$Builder r4 = r4.withName(r6)
            android.net.Uri r6 = r41.getUri()
            java.lang.String r6 = r6.toString()
            io.intercom.android.sdk.blocks.lib.models.BlockAttachment$Builder r4 = r4.withUrl(r6)
            java.lang.String r6 = r41.getMimeType()
            io.intercom.android.sdk.blocks.lib.models.BlockAttachment$Builder r4 = r4.withContentType(r6)
            io.intercom.android.sdk.blocks.lib.models.BlockAttachment r4 = r4.build()
            io.intercom.android.sdk.blocks.lib.models.Block$Builder r6 = new io.intercom.android.sdk.blocks.lib.models.Block$Builder
            r6.<init>()
            java.util.List r4 = mf.C6565s.e(r4)
            io.intercom.android.sdk.blocks.lib.models.Block$Builder r4 = r6.withAttachments(r4)
            java.lang.String r6 = "LOCAL_ATTACHMENT"
            io.intercom.android.sdk.blocks.lib.models.Block$Builder r4 = r4.withType(r6)
            kotlin.jvm.internal.C6496s.e(r4)
        L_0x00f9:
            io.intercom.android.sdk.models.Part$Builder r6 = new io.intercom.android.sdk.models.Part$Builder
            r6.<init>()
            java.util.List r4 = mf.C6565s.e(r4)
            io.intercom.android.sdk.models.Part$Builder r4 = r6.withBlocks(r4)
            r6 = 0
            io.intercom.android.sdk.models.Part$Builder r4 = r4.withParticipantIsAdmin(r6)
            io.intercom.android.sdk.models.Part$Builder r4 = r4.withClientAssignedUuid(r3)
            io.intercom.android.sdk.models.Part r4 = r4.build()
            io.intercom.android.sdk.models.Participant$Builder r13 = new io.intercom.android.sdk.models.Participant$Builder
            r13.<init>()
            io.intercom.android.sdk.identity.UserIdentity r14 = r0.userIdentity
            java.lang.String r14 = r14.getIntercomId()
            io.intercom.android.sdk.models.Participant$Builder r13 = r13.withId(r14)
            io.intercom.android.sdk.models.Participant r13 = r13.build()
            r4.setParticipant(r13)
            io.intercom.android.sdk.models.Part$MessageState r13 = io.intercom.android.sdk.models.Part.MessageState.SENDING
            r4.setMessageState(r13)
        L_0x012e:
            java.lang.Object r13 = r39.getValue()
            r16 = r13
            io.intercom.android.sdk.m5.conversation.states.ConversationClientState r16 = (io.intercom.android.sdk.m5.conversation.states.ConversationClientState) r16
            r14 = r16
            java.util.LinkedHashMap r15 = new java.util.LinkedHashMap
            r43 = r15
            r43.<init>()
            java.util.Map r7 = r16.getPendingMessages()
            r8 = r43
            r8.putAll(r7)
            io.intercom.android.sdk.m5.conversation.states.PendingMessage r7 = new io.intercom.android.sdk.m5.conversation.states.PendingMessage
            kotlin.jvm.internal.C6496s.e(r4)
            r7.<init>(r4, r6, r12)
            r8.put(r3, r7)
            r35 = 1048574(0xffffe, float:1.469365E-39)
            r36 = 0
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
            r26 = 0
            r27 = 0
            r28 = 0
            r29 = 0
            r30 = 0
            r31 = 0
            r32 = 0
            r33 = 0
            r34 = 0
            io.intercom.android.sdk.m5.conversation.states.ConversationClientState r7 = io.intercom.android.sdk.m5.conversation.states.ConversationClientState.copy$default(r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36)
            boolean r7 = r1.e(r13, r7)
            if (r7 == 0) goto L_0x039b
            android.content.Context r4 = r0.applicationContext
            r11.L$0 = r0
            r11.L$1 = r1
            r7 = r40
            r11.L$2 = r7
            r11.L$3 = r3
            r11.label = r10
            java.lang.Object r4 = io.intercom.android.sdk.m5.utils.MediaCompressionKt.getCompressedMediaData(r2, r4, r11)
            if (r4 != r5) goto L_0x019d
            return r5
        L_0x019d:
            r6 = r0
            r2 = r7
        L_0x019f:
            io.intercom.android.sdk.m5.conversation.ui.components.composer.MediaData$Media r4 = (io.intercom.android.sdk.m5.conversation.ui.components.composer.MediaData.Media) r4
            long r7 = r4.getSize()
            yf.a r10 = r6.attachmentSettings
            java.lang.Object r10 = r10.invoke()
            io.intercom.android.sdk.models.AttachmentSettings r10 = (io.intercom.android.sdk.models.AttachmentSettings) r10
            long r13 = r10.getUploadSizeLimit()
            int r7 = (r7 > r13 ? 1 : (r7 == r13 ? 0 : -1))
            if (r7 <= 0) goto L_0x0248
        L_0x01b5:
            java.lang.Object r7 = r1.getValue()
            r13 = r7
            io.intercom.android.sdk.m5.conversation.states.ConversationClientState r13 = (io.intercom.android.sdk.m5.conversation.states.ConversationClientState) r13
            java.util.Map r8 = r13.getPendingMessages()
            java.util.LinkedHashMap r14 = new java.util.LinkedHashMap
            r14.<init>()
            java.util.Set r8 = r8.entrySet()
            java.util.Iterator r8 = r8.iterator()
        L_0x01cd:
            boolean r10 = r8.hasNext()
            if (r10 == 0) goto L_0x01ef
            java.lang.Object r10 = r8.next()
            java.util.Map$Entry r10 = (java.util.Map.Entry) r10
            java.lang.Object r15 = r10.getKey()
            boolean r15 = kotlin.jvm.internal.C6496s.c(r3, r15)
            if (r15 != 0) goto L_0x01cd
            java.lang.Object r15 = r10.getKey()
            java.lang.Object r10 = r10.getValue()
            r14.put(r15, r10)
            goto L_0x01cd
        L_0x01ef:
            r34 = 1048574(0xffffe, float:1.469365E-39)
            r35 = 0
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
            r26 = 0
            r27 = 0
            r28 = 0
            r29 = 0
            r30 = 0
            r31 = 0
            r32 = 0
            r33 = 0
            io.intercom.android.sdk.m5.conversation.states.ConversationClientState r8 = io.intercom.android.sdk.m5.conversation.states.ConversationClientState.copy$default(r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35)
            boolean r7 = r1.e(r7, r8)
            if (r7 == 0) goto L_0x01b5
            io.intercom.android.sdk.m5.conversation.states.ConversationUiEffect$ShowUploadSizeLimitDialog r1 = new io.intercom.android.sdk.m5.conversation.states.ConversationUiEffect$ShowUploadSizeLimitDialog
            yf.a r3 = r6.attachmentSettings
            java.lang.Object r3 = r3.invoke()
            io.intercom.android.sdk.models.AttachmentSettings r3 = (io.intercom.android.sdk.models.AttachmentSettings) r3
            java.lang.String r3 = r3.getUploadSizeLimitMB()
            r1.<init>(r3)
            r11.L$0 = r4
            r11.L$1 = r12
            r11.L$2 = r12
            r11.L$3 = r12
            r11.label = r9
            java.lang.Object r1 = r2.emit(r1, r11)
            if (r1 != r5) goto L_0x0245
            return r5
        L_0x0245:
            r1 = r4
            goto L_0x0391
        L_0x0248:
            io.intercom.android.sdk.m5.conversation.data.ConversationRepository r2 = r6.conversationRepository
            r11.L$0 = r6
            r11.L$1 = r1
            r11.L$2 = r3
            r11.L$3 = r4
            r8 = 3
            r11.label = r8
            java.lang.Object r2 = r2.uploadMedia(r4, r11)
            if (r2 != r5) goto L_0x025c
            return r5
        L_0x025c:
            r7 = r1
            r9 = r3
            r1 = r4
            r4 = r2
        L_0x0260:
            io.intercom.android.sdk.helpcenter.utils.networking.NetworkResponse r4 = (io.intercom.android.sdk.helpcenter.utils.networking.NetworkResponse) r4
            boolean r2 = r4 instanceof io.intercom.android.sdk.helpcenter.utils.networking.NetworkResponse.ClientError
            if (r2 != 0) goto L_0x0328
            boolean r2 = r4 instanceof io.intercom.android.sdk.helpcenter.utils.networking.NetworkResponse.NetworkError
            if (r2 != 0) goto L_0x0328
            boolean r2 = r4 instanceof io.intercom.android.sdk.helpcenter.utils.networking.NetworkResponse.ServerError
            if (r2 == 0) goto L_0x0270
            goto L_0x0328
        L_0x0270:
            boolean r2 = r4 instanceof io.intercom.android.sdk.helpcenter.utils.networking.NetworkResponse.Success
            if (r2 == 0) goto L_0x0322
            io.intercom.android.sdk.helpcenter.utils.networking.NetworkResponse$Success r4 = (io.intercom.android.sdk.helpcenter.utils.networking.NetworkResponse.Success) r4
            java.lang.Object r2 = r4.getBody()
            io.intercom.android.sdk.models.Upload$Builder r2 = (io.intercom.android.sdk.models.Upload.Builder) r2
            io.intercom.android.sdk.models.Upload r2 = r2.build()
            boolean r3 = r1 instanceof io.intercom.android.sdk.m5.conversation.ui.components.composer.MediaData.Media.Image
            if (r3 == 0) goto L_0x02af
            io.intercom.android.sdk.blocks.lib.models.Block$Builder r3 = new io.intercom.android.sdk.blocks.lib.models.Block$Builder
            r3.<init>()
            java.lang.String r2 = r2.getPublicUrl()
            io.intercom.android.sdk.blocks.lib.models.Block$Builder r2 = r3.withUrl(r2)
            r3 = r1
            io.intercom.android.sdk.m5.conversation.ui.components.composer.MediaData$Media$Image r3 = (io.intercom.android.sdk.m5.conversation.ui.components.composer.MediaData.Media.Image) r3
            int r4 = r3.getWidth()
            io.intercom.android.sdk.blocks.lib.models.Block$Builder r2 = r2.withWidth(r4)
            int r3 = r3.getHeight()
            io.intercom.android.sdk.blocks.lib.models.Block$Builder r2 = r2.withHeight(r3)
            io.intercom.android.sdk.blocks.lib.BlockType r3 = io.intercom.android.sdk.blocks.lib.BlockType.IMAGE
            java.lang.String r3 = r3.getSerializedName()
            io.intercom.android.sdk.blocks.lib.models.Block$Builder r2 = r2.withType(r3)
            goto L_0x0306
        L_0x02af:
            boolean r3 = r1 instanceof io.intercom.android.sdk.m5.conversation.ui.components.composer.MediaData.Media.Video
            if (r3 != 0) goto L_0x02be
            boolean r3 = r1 instanceof io.intercom.android.sdk.m5.conversation.ui.components.composer.MediaData.Media.Other
            if (r3 == 0) goto L_0x02b8
            goto L_0x02be
        L_0x02b8:
            lf.s r1 = new lf.s
            r1.<init>()
            throw r1
        L_0x02be:
            io.intercom.android.sdk.blocks.lib.models.BlockAttachment$Builder r3 = new io.intercom.android.sdk.blocks.lib.models.BlockAttachment$Builder
            r3.<init>()
            java.lang.String r4 = r1.getFileName()
            io.intercom.android.sdk.blocks.lib.models.BlockAttachment$Builder r3 = r3.withName(r4)
            int r4 = r2.getId()
            io.intercom.android.sdk.blocks.lib.models.BlockAttachment$Builder r3 = r3.withId(r4)
            long r13 = r1.getSize()
            io.intercom.android.sdk.blocks.lib.models.BlockAttachment$Builder r3 = r3.withSize(r13)
            java.lang.String r2 = r2.getPublicUrl()
            io.intercom.android.sdk.blocks.lib.models.BlockAttachment$Builder r2 = r3.withUrl(r2)
            java.lang.String r3 = r1.getMimeType()
            io.intercom.android.sdk.blocks.lib.models.BlockAttachment$Builder r2 = r2.withContentType(r3)
            io.intercom.android.sdk.blocks.lib.models.BlockAttachment r2 = r2.build()
            io.intercom.android.sdk.blocks.lib.models.Block$Builder r3 = new io.intercom.android.sdk.blocks.lib.models.Block$Builder
            r3.<init>()
            java.util.List r2 = mf.C6565s.e(r2)
            io.intercom.android.sdk.blocks.lib.models.Block$Builder r2 = r3.withAttachments(r2)
            io.intercom.android.sdk.blocks.lib.BlockType r3 = io.intercom.android.sdk.blocks.lib.BlockType.ATTACHMENTLIST
            java.lang.String r3 = r3.getSerializedName()
            io.intercom.android.sdk.blocks.lib.models.Block$Builder r2 = r2.withType(r3)
        L_0x0306:
            io.intercom.android.sdk.m5.conversation.usecase.SendMessageUseCase r6 = r6.sendMessageUseCase
            java.util.List r8 = mf.C6565s.e(r2)
            r11.L$0 = r1
            r11.L$1 = r12
            r11.L$2 = r12
            r11.L$3 = r12
            r13 = 4
            r11.label = r13
            r10 = 0
            r12 = 8
            r13 = 0
            java.lang.Object r2 = io.intercom.android.sdk.m5.conversation.usecase.SendMessageUseCase.invoke$default(r6, r7, r8, r9, r10, r11, r12, r13)
            if (r2 != r5) goto L_0x0391
            return r5
        L_0x0322:
            lf.s r1 = new lf.s
            r1.<init>()
            throw r1
        L_0x0328:
            java.lang.Object r2 = r7.getValue()
            io.intercom.android.sdk.m5.conversation.states.ConversationClientState r2 = (io.intercom.android.sdk.m5.conversation.states.ConversationClientState) r2
            java.util.Map r2 = r2.getPendingMessages()
            java.lang.Object r2 = r2.get(r9)
            r10 = r2
            io.intercom.android.sdk.m5.conversation.states.PendingMessage r10 = (io.intercom.android.sdk.m5.conversation.states.PendingMessage) r10
            if (r10 == 0) goto L_0x0391
            io.intercom.android.sdk.m5.conversation.states.PendingMessage$FailedImageUploadData r13 = new io.intercom.android.sdk.m5.conversation.states.PendingMessage$FailedImageUploadData
            r13.<init>(r9, r1)
            r14 = 3
            r15 = 0
            r11 = 0
            r12 = 0
            io.intercom.android.sdk.m5.conversation.states.PendingMessage r2 = io.intercom.android.sdk.m5.conversation.states.PendingMessage.copy$default(r10, r11, r12, r13, r14, r15)
        L_0x0348:
            java.lang.Object r3 = r7.getValue()
            r4 = r3
            io.intercom.android.sdk.m5.conversation.states.ConversationClientState r4 = (io.intercom.android.sdk.m5.conversation.states.ConversationClientState) r4
            r10 = r4
            java.util.LinkedHashMap r5 = new java.util.LinkedHashMap
            r11 = r5
            r5.<init>()
            java.util.Map r4 = r4.getPendingMessages()
            r5.putAll(r4)
            r5.put(r9, r2)
            r31 = 1048574(0xffffe, float:1.469365E-39)
            r32 = 0
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
            r26 = 0
            r27 = 0
            r28 = 0
            r29 = 0
            r30 = 0
            io.intercom.android.sdk.m5.conversation.states.ConversationClientState r4 = io.intercom.android.sdk.m5.conversation.states.ConversationClientState.copy$default(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32)
            boolean r3 = r7.e(r3, r4)
            if (r3 == 0) goto L_0x0348
        L_0x0391:
            android.net.Uri r1 = r1.getUri()
            io.intercom.android.sdk.m5.utils.MediaCompressionKt.deleteCompressedMedia(r1)
            lf.M r1 = lf.C6514M.f71813a
            return r1
        L_0x039b:
            r7 = r40
            r7 = 4
            r8 = 3
            goto L_0x012e
        */
        throw new UnsupportedOperationException("Method not decompiled: io.intercom.android.sdk.m5.conversation.usecase.SendMediaUseCase.sendMedia(Xg.x, Xg.w, io.intercom.android.sdk.m5.conversation.ui.components.composer.MediaData$Media, java.lang.String, qf.d):java.lang.Object");
    }

    /* access modifiers changed from: private */
    public final Object sendMediaNewWay(x xVar, w wVar, MediaData.Media media, String str, C6658d<? super C6514M> dVar) {
        Object e10 = L.e(new SendMediaUseCase$sendMediaNewWay$2(media, str, xVar, this, wVar, (C6658d<? super SendMediaUseCase$sendMediaNewWay$2>) null), dVar);
        if (e10 == C6680b.f()) {
            return e10;
        }
        return C6514M.f71813a;
    }

    static /* synthetic */ Object sendMediaNewWay$default(SendMediaUseCase sendMediaUseCase, x xVar, w wVar, MediaData.Media media, String str, C6658d dVar, int i10, Object obj) {
        if ((i10 & 8) != 0) {
            str = UUID.randomUUID().toString();
        }
        return sendMediaUseCase.sendMediaNewWay(xVar, wVar, media, str, dVar);
    }

    public final SendMessageUseCase getSendMessageUseCase() {
        return this.sendMessageUseCase;
    }

    public final Object invoke(x xVar, w wVar, MediaData.Media media, String str, C6658d<? super C6514M> dVar) {
        Object sendMedia = sendMedia(xVar, wVar, media, str, dVar);
        if (sendMedia == C6680b.f()) {
            return sendMedia;
        }
        return C6514M.f71813a;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ SendMediaUseCase(io.intercom.android.sdk.m5.conversation.usecase.SendMessageUseCase r7, io.intercom.android.sdk.m5.conversation.data.ConversationRepository r8, io.intercom.android.sdk.identity.UserIdentity r9, android.content.Context r10, yf.C6787a r11, int r12, kotlin.jvm.internal.DefaultConstructorMarker r13) {
        /*
            r6 = this;
            r13 = r12 & 4
            if (r13 == 0) goto L_0x000c
            io.intercom.android.sdk.Injector r9 = io.intercom.android.sdk.Injector.get()
            io.intercom.android.sdk.identity.UserIdentity r9 = r9.getUserIdentity()
        L_0x000c:
            r3 = r9
            r9 = r12 & 8
            if (r9 == 0) goto L_0x0019
            io.intercom.android.sdk.Injector r9 = io.intercom.android.sdk.Injector.get()
            android.app.Application r10 = r9.getApplication()
        L_0x0019:
            r4 = r10
            r9 = r12 & 16
            if (r9 == 0) goto L_0x0023
            io.intercom.android.sdk.m5.conversation.usecase.c r11 = new io.intercom.android.sdk.m5.conversation.usecase.c
            r11.<init>()
        L_0x0023:
            r5 = r11
            r0 = r6
            r1 = r7
            r2 = r8
            r0.<init>(r1, r2, r3, r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: io.intercom.android.sdk.m5.conversation.usecase.SendMediaUseCase.<init>(io.intercom.android.sdk.m5.conversation.usecase.SendMessageUseCase, io.intercom.android.sdk.m5.conversation.data.ConversationRepository, io.intercom.android.sdk.identity.UserIdentity, android.content.Context, yf.a, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
