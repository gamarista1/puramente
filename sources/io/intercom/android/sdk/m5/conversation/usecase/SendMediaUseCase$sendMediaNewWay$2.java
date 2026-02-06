package io.intercom.android.sdk.m5.conversation.usecase;

import Ug.K;
import Xg.w;
import Xg.x;
import io.intercom.android.sdk.m5.conversation.ui.components.composer.MediaData;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import lf.C6514M;
import qf.C6658d;
import yf.p;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LUg/K;", "Llf/M;", "<anonymous>", "(LUg/K;)V"}, k = 3, mv = {2, 0, 0})
@f(c = "io.intercom.android.sdk.m5.conversation.usecase.SendMediaUseCase$sendMediaNewWay$2", f = "SendMediaUseCase.kt", l = {250, 259, 270, 304, 329}, m = "invokeSuspend")
final class SendMediaUseCase$sendMediaNewWay$2 extends l implements p {
    final /* synthetic */ x $clientState;
    final /* synthetic */ MediaData.Media $mediaData;
    final /* synthetic */ w $uiEffect;
    final /* synthetic */ String $uuid;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ SendMediaUseCase this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    SendMediaUseCase$sendMediaNewWay$2(MediaData.Media media, String str, x xVar, SendMediaUseCase sendMediaUseCase, w wVar, C6658d<? super SendMediaUseCase$sendMediaNewWay$2> dVar) {
        super(2, dVar);
        this.$mediaData = media;
        this.$uuid = str;
        this.$clientState = xVar;
        this.this$0 = sendMediaUseCase;
        this.$uiEffect = wVar;
    }

    public final C6658d<C6514M> create(Object obj, C6658d<?> dVar) {
        SendMediaUseCase$sendMediaNewWay$2 sendMediaUseCase$sendMediaNewWay$2 = new SendMediaUseCase$sendMediaNewWay$2(this.$mediaData, this.$uuid, this.$clientState, this.this$0, this.$uiEffect, dVar);
        sendMediaUseCase$sendMediaNewWay$2.L$0 = obj;
        return sendMediaUseCase$sendMediaNewWay$2;
    }

    public final Object invoke(K k10, C6658d<? super C6514M> dVar) {
        return ((SendMediaUseCase$sendMediaNewWay$2) create(k10, dVar)).invokeSuspend(C6514M.f71813a);
    }

    /* JADX WARNING: Removed duplicated region for block: B:100:0x040d  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x02d8  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x0335  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x0338  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x0349  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x034e  */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x03fd A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x03fe  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r38) {
        /*
            r37 = this;
            r8 = r37
            java.lang.Object r9 = rf.C6680b.f()
            int r0 = r8.label
            r1 = 5
            r2 = 4
            r3 = 3
            r4 = 2
            r5 = 1
            r6 = 0
            if (r0 == 0) goto L_0x0058
            if (r0 == r5) goto L_0x004d
            if (r0 == r4) goto L_0x0044
            if (r0 == r3) goto L_0x0033
            if (r0 == r2) goto L_0x0023
            if (r0 != r1) goto L_0x001b
            goto L_0x0044
        L_0x001b:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x0023:
            java.lang.Object r0 = r8.L$1
            io.intercom.android.sdk.models.Upload r0 = (io.intercom.android.sdk.models.Upload) r0
            java.lang.Object r2 = r8.L$0
            io.intercom.android.sdk.m5.conversation.ui.components.composer.MediaData$Media r2 = (io.intercom.android.sdk.m5.conversation.ui.components.composer.MediaData.Media) r2
            lf.w.b(r38)
            r1 = r2
            r2 = r38
            goto L_0x032d
        L_0x0033:
            java.lang.Object r0 = r8.L$1
            Ug.S r0 = (Ug.S) r0
            java.lang.Object r3 = r8.L$0
            io.intercom.android.sdk.m5.conversation.ui.components.composer.MediaData$Media r3 = (io.intercom.android.sdk.m5.conversation.ui.components.composer.MediaData.Media) r3
            lf.w.b(r38)
            r2 = r0
            r1 = r3
            r0 = r38
            goto L_0x02c8
        L_0x0044:
            java.lang.Object r0 = r8.L$0
            io.intercom.android.sdk.m5.conversation.ui.components.composer.MediaData$Media r0 = (io.intercom.android.sdk.m5.conversation.ui.components.composer.MediaData.Media) r0
            lf.w.b(r38)
            goto L_0x0480
        L_0x004d:
            java.lang.Object r0 = r8.L$0
            Ug.K r0 = (Ug.K) r0
            lf.w.b(r38)
            r1 = r38
            goto L_0x01e1
        L_0x0058:
            lf.w.b(r38)
            java.lang.Object r0 = r8.L$0
            Ug.K r0 = (Ug.K) r0
            io.intercom.android.sdk.m5.conversation.ui.components.composer.MediaData$Media r7 = r8.$mediaData
            boolean r10 = r7 instanceof io.intercom.android.sdk.m5.conversation.ui.components.composer.MediaData.Media.Image
            if (r10 == 0) goto L_0x0099
            io.intercom.android.sdk.blocks.lib.models.Block$Builder r7 = new io.intercom.android.sdk.blocks.lib.models.Block$Builder
            r7.<init>()
            io.intercom.android.sdk.m5.conversation.ui.components.composer.MediaData$Media r10 = r8.$mediaData
            io.intercom.android.sdk.m5.conversation.ui.components.composer.MediaData$Media$Image r10 = (io.intercom.android.sdk.m5.conversation.ui.components.composer.MediaData.Media.Image) r10
            android.net.Uri r10 = r10.getUri()
            io.intercom.android.sdk.blocks.lib.models.Block$Builder r7 = r7.withLocalUri(r10)
            io.intercom.android.sdk.m5.conversation.ui.components.composer.MediaData$Media r10 = r8.$mediaData
            io.intercom.android.sdk.m5.conversation.ui.components.composer.MediaData$Media$Image r10 = (io.intercom.android.sdk.m5.conversation.ui.components.composer.MediaData.Media.Image) r10
            int r10 = r10.getWidth()
            io.intercom.android.sdk.blocks.lib.models.Block$Builder r7 = r7.withWidth(r10)
            io.intercom.android.sdk.m5.conversation.ui.components.composer.MediaData$Media r10 = r8.$mediaData
            io.intercom.android.sdk.m5.conversation.ui.components.composer.MediaData$Media$Image r10 = (io.intercom.android.sdk.m5.conversation.ui.components.composer.MediaData.Media.Image) r10
            int r10 = r10.getHeight()
            io.intercom.android.sdk.blocks.lib.models.Block$Builder r7 = r7.withHeight(r10)
            java.lang.String r10 = "IMAGE"
            io.intercom.android.sdk.blocks.lib.models.Block$Builder r7 = r7.withType(r10)
            kotlin.jvm.internal.C6496s.e(r7)
            goto L_0x0135
        L_0x0099:
            boolean r10 = r7 instanceof io.intercom.android.sdk.m5.conversation.ui.components.composer.MediaData.Media.Video
            if (r10 == 0) goto L_0x00ea
            io.intercom.android.sdk.blocks.lib.models.Block$Builder r7 = new io.intercom.android.sdk.blocks.lib.models.Block$Builder
            r7.<init>()
            io.intercom.android.sdk.m5.conversation.ui.components.composer.MediaData$Media r10 = r8.$mediaData
            io.intercom.android.sdk.m5.conversation.ui.components.composer.MediaData$Media$Video r10 = (io.intercom.android.sdk.m5.conversation.ui.components.composer.MediaData.Media.Video) r10
            android.net.Uri r10 = r10.getUri()
            io.intercom.android.sdk.blocks.lib.models.Block$Builder r7 = r7.withLocalUri(r10)
            io.intercom.android.sdk.m5.conversation.ui.components.composer.MediaData$Media r10 = r8.$mediaData
            io.intercom.android.sdk.m5.conversation.ui.components.composer.MediaData$Media$Video r10 = (io.intercom.android.sdk.m5.conversation.ui.components.composer.MediaData.Media.Video) r10
            int r10 = r10.getWidth()
            io.intercom.android.sdk.blocks.lib.models.Block$Builder r7 = r7.withWidth(r10)
            io.intercom.android.sdk.m5.conversation.ui.components.composer.MediaData$Media r10 = r8.$mediaData
            io.intercom.android.sdk.m5.conversation.ui.components.composer.MediaData$Media$Video r10 = (io.intercom.android.sdk.m5.conversation.ui.components.composer.MediaData.Media.Video) r10
            int r10 = r10.getHeight()
            io.intercom.android.sdk.blocks.lib.models.Block$Builder r7 = r7.withHeight(r10)
            java.lang.String r10 = "VIDEOFILE"
            io.intercom.android.sdk.blocks.lib.models.Block$Builder r7 = r7.withType(r10)
            io.intercom.android.sdk.m5.conversation.ui.components.composer.MediaData$Media r10 = r8.$mediaData
            io.intercom.android.sdk.m5.conversation.ui.components.composer.MediaData$Media$Video r10 = (io.intercom.android.sdk.m5.conversation.ui.components.composer.MediaData.Media.Video) r10
            io.intercom.android.sdk.m5.conversation.ui.components.composer.MediaData$Media$Image r10 = r10.getThumbnail()
            if (r10 == 0) goto L_0x00e1
            android.net.Uri r10 = r10.getUri()
            if (r10 == 0) goto L_0x00e1
            java.lang.String r10 = r10.toString()
            goto L_0x00e2
        L_0x00e1:
            r10 = r6
        L_0x00e2:
            io.intercom.android.sdk.blocks.lib.models.Block$Builder r7 = r7.withThumbnailUrl(r10)
            kotlin.jvm.internal.C6496s.e(r7)
            goto L_0x0135
        L_0x00ea:
            boolean r7 = r7 instanceof io.intercom.android.sdk.m5.conversation.ui.components.composer.MediaData.Media.Other
            if (r7 == 0) goto L_0x048e
            io.intercom.android.sdk.blocks.lib.models.BlockAttachment$Builder r7 = new io.intercom.android.sdk.blocks.lib.models.BlockAttachment$Builder
            r7.<init>()
            io.intercom.android.sdk.m5.conversation.ui.components.composer.MediaData$Media r10 = r8.$mediaData
            io.intercom.android.sdk.m5.conversation.ui.components.composer.MediaData$Media$Other r10 = (io.intercom.android.sdk.m5.conversation.ui.components.composer.MediaData.Media.Other) r10
            java.lang.String r10 = r10.getFileName()
            io.intercom.android.sdk.blocks.lib.models.BlockAttachment$Builder r7 = r7.withName(r10)
            io.intercom.android.sdk.m5.conversation.ui.components.composer.MediaData$Media r10 = r8.$mediaData
            io.intercom.android.sdk.m5.conversation.ui.components.composer.MediaData$Media$Other r10 = (io.intercom.android.sdk.m5.conversation.ui.components.composer.MediaData.Media.Other) r10
            android.net.Uri r10 = r10.getUri()
            java.lang.String r10 = r10.toString()
            io.intercom.android.sdk.blocks.lib.models.BlockAttachment$Builder r7 = r7.withUrl(r10)
            io.intercom.android.sdk.m5.conversation.ui.components.composer.MediaData$Media r10 = r8.$mediaData
            io.intercom.android.sdk.m5.conversation.ui.components.composer.MediaData$Media$Other r10 = (io.intercom.android.sdk.m5.conversation.ui.components.composer.MediaData.Media.Other) r10
            java.lang.String r10 = r10.getMimeType()
            io.intercom.android.sdk.blocks.lib.models.BlockAttachment$Builder r7 = r7.withContentType(r10)
            io.intercom.android.sdk.blocks.lib.models.BlockAttachment r7 = r7.build()
            io.intercom.android.sdk.blocks.lib.models.Block$Builder r10 = new io.intercom.android.sdk.blocks.lib.models.Block$Builder
            r10.<init>()
            java.util.List r7 = mf.C6565s.e(r7)
            io.intercom.android.sdk.blocks.lib.models.Block$Builder r7 = r10.withAttachments(r7)
            java.lang.String r10 = "LOCAL_ATTACHMENT"
            io.intercom.android.sdk.blocks.lib.models.Block$Builder r7 = r7.withType(r10)
            kotlin.jvm.internal.C6496s.e(r7)
        L_0x0135:
            io.intercom.android.sdk.models.Part$Builder r10 = new io.intercom.android.sdk.models.Part$Builder
            r10.<init>()
            java.util.List r7 = mf.C6565s.e(r7)
            io.intercom.android.sdk.models.Part$Builder r7 = r10.withBlocks(r7)
            r10 = 0
            io.intercom.android.sdk.models.Part$Builder r7 = r7.withParticipantIsAdmin(r10)
            java.lang.String r11 = r8.$uuid
            io.intercom.android.sdk.models.Part$Builder r7 = r7.withClientAssignedUuid(r11)
            io.intercom.android.sdk.models.Part r7 = r7.build()
            io.intercom.android.sdk.m5.conversation.usecase.SendMediaUseCase r11 = r8.this$0
            io.intercom.android.sdk.models.Participant$Builder r12 = new io.intercom.android.sdk.models.Participant$Builder
            r12.<init>()
            io.intercom.android.sdk.identity.UserIdentity r11 = r11.userIdentity
            java.lang.String r11 = r11.getIntercomId()
            io.intercom.android.sdk.models.Participant$Builder r11 = r12.withId(r11)
            io.intercom.android.sdk.models.Participant r11 = r11.build()
            r7.setParticipant(r11)
            io.intercom.android.sdk.models.Part$MessageState r11 = io.intercom.android.sdk.models.Part.MessageState.SENDING
            r7.setMessageState(r11)
            Xg.x r11 = r8.$clientState
            java.lang.String r12 = r8.$uuid
        L_0x0174:
            java.lang.Object r13 = r11.getValue()
            r16 = r13
            io.intercom.android.sdk.m5.conversation.states.ConversationClientState r16 = (io.intercom.android.sdk.m5.conversation.states.ConversationClientState) r16
            r14 = r16
            java.util.LinkedHashMap r15 = new java.util.LinkedHashMap
            r38 = r15
            r38.<init>()
            java.util.Map r1 = r16.getPendingMessages()
            r2 = r38
            r2.putAll(r1)
            io.intercom.android.sdk.m5.conversation.states.PendingMessage r1 = new io.intercom.android.sdk.m5.conversation.states.PendingMessage
            kotlin.jvm.internal.C6496s.e(r7)
            r1.<init>(r7, r10, r6)
            r2.put(r12, r1)
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
            io.intercom.android.sdk.m5.conversation.states.ConversationClientState r1 = io.intercom.android.sdk.m5.conversation.states.ConversationClientState.copy$default(r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36)
            boolean r1 = r11.e(r13, r1)
            if (r1 == 0) goto L_0x048a
            io.intercom.android.sdk.m5.conversation.ui.components.composer.MediaData$Media r1 = r8.$mediaData
            io.intercom.android.sdk.m5.conversation.usecase.SendMediaUseCase r2 = r8.this$0
            android.content.Context r2 = r2.applicationContext
            r8.L$0 = r0
            r8.label = r5
            java.lang.Object r1 = io.intercom.android.sdk.m5.utils.MediaCompressionKt.getCompressedMediaData(r1, r2, r8)
            if (r1 != r9) goto L_0x01e1
            return r9
        L_0x01e1:
            io.intercom.android.sdk.m5.conversation.ui.components.composer.MediaData$Media r1 = (io.intercom.android.sdk.m5.conversation.ui.components.composer.MediaData.Media) r1
            long r10 = r1.getSize()
            io.intercom.android.sdk.m5.conversation.usecase.SendMediaUseCase r2 = r8.this$0
            yf.a r2 = r2.attachmentSettings
            java.lang.Object r2 = r2.invoke()
            io.intercom.android.sdk.models.AttachmentSettings r2 = (io.intercom.android.sdk.models.AttachmentSettings) r2
            long r12 = r2.getUploadSizeLimit()
            int r2 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r2 <= 0) goto L_0x028c
            Xg.x r2 = r8.$clientState
            java.lang.String r5 = r8.$uuid
        L_0x01ff:
            java.lang.Object r0 = r2.getValue()
            r10 = r0
            io.intercom.android.sdk.m5.conversation.states.ConversationClientState r10 = (io.intercom.android.sdk.m5.conversation.states.ConversationClientState) r10
            java.util.Map r3 = r10.getPendingMessages()
            java.util.LinkedHashMap r11 = new java.util.LinkedHashMap
            r11.<init>()
            java.util.Set r3 = r3.entrySet()
            java.util.Iterator r3 = r3.iterator()
        L_0x0217:
            boolean r6 = r3.hasNext()
            if (r6 == 0) goto L_0x0239
            java.lang.Object r6 = r3.next()
            java.util.Map$Entry r6 = (java.util.Map.Entry) r6
            java.lang.Object r7 = r6.getKey()
            boolean r7 = kotlin.jvm.internal.C6496s.c(r5, r7)
            if (r7 != 0) goto L_0x0217
            java.lang.Object r7 = r6.getKey()
            java.lang.Object r6 = r6.getValue()
            r11.put(r7, r6)
            goto L_0x0217
        L_0x0239:
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
            io.intercom.android.sdk.m5.conversation.states.ConversationClientState r3 = io.intercom.android.sdk.m5.conversation.states.ConversationClientState.copy$default(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32)
            boolean r0 = r2.e(r0, r3)
            if (r0 == 0) goto L_0x01ff
            Xg.w r0 = r8.$uiEffect
            io.intercom.android.sdk.m5.conversation.states.ConversationUiEffect$ShowUploadSizeLimitDialog r2 = new io.intercom.android.sdk.m5.conversation.states.ConversationUiEffect$ShowUploadSizeLimitDialog
            io.intercom.android.sdk.m5.conversation.usecase.SendMediaUseCase r3 = r8.this$0
            yf.a r3 = r3.attachmentSettings
            java.lang.Object r3 = r3.invoke()
            io.intercom.android.sdk.models.AttachmentSettings r3 = (io.intercom.android.sdk.models.AttachmentSettings) r3
            java.lang.String r3 = r3.getUploadSizeLimitMB()
            r2.<init>(r3)
            r8.L$0 = r1
            r8.label = r4
            java.lang.Object r0 = r0.emit(r2, r8)
            if (r0 != r9) goto L_0x047f
            return r9
        L_0x028c:
            boolean r2 = r1 instanceof io.intercom.android.sdk.m5.conversation.ui.components.composer.MediaData.Media.Video
            if (r2 == 0) goto L_0x02aa
            r2 = r1
            io.intercom.android.sdk.m5.conversation.ui.components.composer.MediaData$Media$Video r2 = (io.intercom.android.sdk.m5.conversation.ui.components.composer.MediaData.Media.Video) r2
            io.intercom.android.sdk.m5.conversation.ui.components.composer.MediaData$Media$Image r2 = r2.getThumbnail()
            if (r2 == 0) goto L_0x02aa
            io.intercom.android.sdk.m5.conversation.usecase.SendMediaUseCase$sendMediaNewWay$2$thumbnailUpload$1 r13 = new io.intercom.android.sdk.m5.conversation.usecase.SendMediaUseCase$sendMediaNewWay$2$thumbnailUpload$1
            io.intercom.android.sdk.m5.conversation.usecase.SendMediaUseCase r2 = r8.this$0
            r13.<init>(r2, r1, r6)
            r14 = 3
            r15 = 0
            r11 = 0
            r12 = 0
            r10 = r0
            Ug.S r2 = Ug.C5576k.b(r10, r11, r12, r13, r14, r15)
            goto L_0x02ab
        L_0x02aa:
            r2 = r6
        L_0x02ab:
            io.intercom.android.sdk.m5.conversation.usecase.SendMediaUseCase$sendMediaNewWay$2$mediaUpload$1 r13 = new io.intercom.android.sdk.m5.conversation.usecase.SendMediaUseCase$sendMediaNewWay$2$mediaUpload$1
            io.intercom.android.sdk.m5.conversation.usecase.SendMediaUseCase r4 = r8.this$0
            r13.<init>(r4, r1, r6)
            r14 = 3
            r15 = 0
            r11 = 0
            r12 = 0
            r10 = r0
            Ug.S r0 = Ug.C5576k.b(r10, r11, r12, r13, r14, r15)
            r8.L$0 = r1
            r8.L$1 = r2
            r8.label = r3
            java.lang.Object r0 = r0.y(r8)
            if (r0 != r9) goto L_0x02c8
            return r9
        L_0x02c8:
            io.intercom.android.sdk.helpcenter.utils.networking.NetworkResponse r0 = (io.intercom.android.sdk.helpcenter.utils.networking.NetworkResponse) r0
            boolean r3 = r0 instanceof io.intercom.android.sdk.helpcenter.utils.networking.NetworkResponse.ClientError
            if (r3 != 0) goto L_0x040d
            boolean r3 = r0 instanceof io.intercom.android.sdk.helpcenter.utils.networking.NetworkResponse.NetworkError
            if (r3 != 0) goto L_0x040d
            boolean r3 = r0 instanceof io.intercom.android.sdk.helpcenter.utils.networking.NetworkResponse.ServerError
            if (r3 == 0) goto L_0x02d8
            goto L_0x040d
        L_0x02d8:
            boolean r3 = r0 instanceof io.intercom.android.sdk.helpcenter.utils.networking.NetworkResponse.Success
            if (r3 == 0) goto L_0x0407
            io.intercom.android.sdk.helpcenter.utils.networking.NetworkResponse$Success r0 = (io.intercom.android.sdk.helpcenter.utils.networking.NetworkResponse.Success) r0
            java.lang.Object r0 = r0.getBody()
            io.intercom.android.sdk.models.Upload$Builder r0 = (io.intercom.android.sdk.models.Upload.Builder) r0
            io.intercom.android.sdk.models.Upload r0 = r0.build()
            boolean r3 = r1 instanceof io.intercom.android.sdk.m5.conversation.ui.components.composer.MediaData.Media.Image
            if (r3 == 0) goto L_0x0319
            io.intercom.android.sdk.blocks.lib.models.Block$Builder r2 = new io.intercom.android.sdk.blocks.lib.models.Block$Builder
            r2.<init>()
            java.lang.String r0 = r0.getPublicUrl()
            io.intercom.android.sdk.blocks.lib.models.Block$Builder r0 = r2.withUrl(r0)
            r2 = r1
            io.intercom.android.sdk.m5.conversation.ui.components.composer.MediaData$Media$Image r2 = (io.intercom.android.sdk.m5.conversation.ui.components.composer.MediaData.Media.Image) r2
            int r3 = r2.getWidth()
            io.intercom.android.sdk.blocks.lib.models.Block$Builder r0 = r0.withWidth(r3)
            int r2 = r2.getHeight()
            io.intercom.android.sdk.blocks.lib.models.Block$Builder r0 = r0.withHeight(r2)
            io.intercom.android.sdk.blocks.lib.BlockType r2 = io.intercom.android.sdk.blocks.lib.BlockType.IMAGE
            java.lang.String r2 = r2.getSerializedName()
            io.intercom.android.sdk.blocks.lib.models.Block$Builder r0 = r0.withType(r2)
        L_0x0316:
            r10 = r1
            goto L_0x03d7
        L_0x0319:
            boolean r3 = r1 instanceof io.intercom.android.sdk.m5.conversation.ui.components.composer.MediaData.Media.Video
            if (r3 == 0) goto L_0x0386
            if (r2 == 0) goto L_0x0330
            r8.L$0 = r1
            r8.L$1 = r0
            r13 = 4
            r8.label = r13
            java.lang.Object r2 = r2.y(r8)
            if (r2 != r9) goto L_0x032d
            return r9
        L_0x032d:
            io.intercom.android.sdk.helpcenter.utils.networking.NetworkResponse r2 = (io.intercom.android.sdk.helpcenter.utils.networking.NetworkResponse) r2
            goto L_0x0331
        L_0x0330:
            r2 = r6
        L_0x0331:
            boolean r3 = r2 instanceof io.intercom.android.sdk.helpcenter.utils.networking.NetworkResponse.Success
            if (r3 == 0) goto L_0x0338
            io.intercom.android.sdk.helpcenter.utils.networking.NetworkResponse$Success r2 = (io.intercom.android.sdk.helpcenter.utils.networking.NetworkResponse.Success) r2
            goto L_0x0339
        L_0x0338:
            r2 = r6
        L_0x0339:
            if (r2 == 0) goto L_0x034e
            java.lang.Object r2 = r2.getBody()
            io.intercom.android.sdk.models.Upload$Builder r2 = (io.intercom.android.sdk.models.Upload.Builder) r2
            if (r2 == 0) goto L_0x034e
            io.intercom.android.sdk.models.Upload r2 = r2.build()
            if (r2 == 0) goto L_0x034e
            java.lang.String r2 = r2.getPublicUrl()
            goto L_0x034f
        L_0x034e:
            r2 = r6
        L_0x034f:
            io.intercom.android.sdk.blocks.lib.models.Block$Builder r3 = new io.intercom.android.sdk.blocks.lib.models.Block$Builder
            r3.<init>()
            java.lang.String r0 = r0.getPublicUrl()
            io.intercom.android.sdk.blocks.lib.models.Block$Builder r0 = r3.withUrl(r0)
            r3 = r1
            io.intercom.android.sdk.m5.conversation.ui.components.composer.MediaData$Media$Video r3 = (io.intercom.android.sdk.m5.conversation.ui.components.composer.MediaData.Media.Video) r3
            int r4 = r3.getWidth()
            io.intercom.android.sdk.blocks.lib.models.Block$Builder r0 = r0.withWidth(r4)
            int r4 = r3.getHeight()
            io.intercom.android.sdk.blocks.lib.models.Block$Builder r0 = r0.withHeight(r4)
            long r3 = r3.getDuration()
            io.intercom.android.sdk.blocks.lib.models.Block$Builder r0 = r0.withDuration(r3)
            io.intercom.android.sdk.blocks.lib.models.Block$Builder r0 = r0.withThumbnailUrl(r2)
            io.intercom.android.sdk.blocks.lib.BlockType r2 = io.intercom.android.sdk.blocks.lib.BlockType.VIDEOFILE
            java.lang.String r2 = r2.getSerializedName()
            io.intercom.android.sdk.blocks.lib.models.Block$Builder r0 = r0.withType(r2)
            goto L_0x0316
        L_0x0386:
            boolean r2 = r1 instanceof io.intercom.android.sdk.m5.conversation.ui.components.composer.MediaData.Media.Other
            if (r2 == 0) goto L_0x0401
            io.intercom.android.sdk.blocks.lib.models.BlockAttachment$Builder r2 = new io.intercom.android.sdk.blocks.lib.models.BlockAttachment$Builder
            r2.<init>()
            r3 = r1
            io.intercom.android.sdk.m5.conversation.ui.components.composer.MediaData$Media$Other r3 = (io.intercom.android.sdk.m5.conversation.ui.components.composer.MediaData.Media.Other) r3
            java.lang.String r4 = r3.getFileName()
            io.intercom.android.sdk.blocks.lib.models.BlockAttachment$Builder r2 = r2.withName(r4)
            int r4 = r0.getId()
            io.intercom.android.sdk.blocks.lib.models.BlockAttachment$Builder r2 = r2.withId(r4)
            long r4 = r3.getSize()
            io.intercom.android.sdk.blocks.lib.models.BlockAttachment$Builder r2 = r2.withSize(r4)
            java.lang.String r0 = r0.getPublicUrl()
            io.intercom.android.sdk.blocks.lib.models.BlockAttachment$Builder r0 = r2.withUrl(r0)
            java.lang.String r2 = r3.getMimeType()
            io.intercom.android.sdk.blocks.lib.models.BlockAttachment$Builder r0 = r0.withContentType(r2)
            io.intercom.android.sdk.blocks.lib.models.BlockAttachment r0 = r0.build()
            io.intercom.android.sdk.blocks.lib.models.Block$Builder r2 = new io.intercom.android.sdk.blocks.lib.models.Block$Builder
            r2.<init>()
            java.util.List r0 = mf.C6565s.e(r0)
            io.intercom.android.sdk.blocks.lib.models.Block$Builder r0 = r2.withAttachments(r0)
            io.intercom.android.sdk.blocks.lib.BlockType r2 = io.intercom.android.sdk.blocks.lib.BlockType.ATTACHMENTLIST
            java.lang.String r2 = r2.getSerializedName()
            io.intercom.android.sdk.blocks.lib.models.Block$Builder r0 = r0.withType(r2)
            goto L_0x0316
        L_0x03d7:
            io.intercom.android.sdk.m5.conversation.usecase.SendMediaUseCase r1 = r8.this$0
            io.intercom.android.sdk.m5.conversation.usecase.SendMessageUseCase r1 = r1.getSendMessageUseCase()
            Xg.x r2 = r8.$clientState
            java.util.List r3 = mf.C6565s.e(r0)
            java.lang.String r4 = r8.$uuid
            r8.L$0 = r10
            r8.L$1 = r6
            r14 = 5
            r8.label = r14
            r5 = 0
            r6 = 8
            r7 = 0
            r0 = r1
            r1 = r2
            r2 = r3
            r3 = r4
            r4 = r5
            r5 = r37
            java.lang.Object r0 = io.intercom.android.sdk.m5.conversation.usecase.SendMessageUseCase.invoke$default(r0, r1, r2, r3, r4, r5, r6, r7)
            if (r0 != r9) goto L_0x03fe
            return r9
        L_0x03fe:
            r0 = r10
            goto L_0x0480
        L_0x0401:
            lf.s r0 = new lf.s
            r0.<init>()
            throw r0
        L_0x0407:
            lf.s r0 = new lf.s
            r0.<init>()
            throw r0
        L_0x040d:
            Xg.x r0 = r8.$clientState
            java.lang.Object r0 = r0.getValue()
            io.intercom.android.sdk.m5.conversation.states.ConversationClientState r0 = (io.intercom.android.sdk.m5.conversation.states.ConversationClientState) r0
            java.util.Map r0 = r0.getPendingMessages()
            java.lang.String r2 = r8.$uuid
            java.lang.Object r0 = r0.get(r2)
            r2 = r0
            io.intercom.android.sdk.m5.conversation.states.PendingMessage r2 = (io.intercom.android.sdk.m5.conversation.states.PendingMessage) r2
            if (r2 == 0) goto L_0x047f
            io.intercom.android.sdk.m5.conversation.states.PendingMessage$FailedImageUploadData r5 = new io.intercom.android.sdk.m5.conversation.states.PendingMessage$FailedImageUploadData
            java.lang.String r0 = r8.$uuid
            r5.<init>(r0, r1)
            r6 = 3
            r7 = 0
            r3 = 0
            r4 = 0
            io.intercom.android.sdk.m5.conversation.states.PendingMessage r0 = io.intercom.android.sdk.m5.conversation.states.PendingMessage.copy$default(r2, r3, r4, r5, r6, r7)
            Xg.x r2 = r8.$clientState
            java.lang.String r3 = r8.$uuid
        L_0x0437:
            java.lang.Object r4 = r2.getValue()
            r5 = r4
            io.intercom.android.sdk.m5.conversation.states.ConversationClientState r5 = (io.intercom.android.sdk.m5.conversation.states.ConversationClientState) r5
            r9 = r5
            java.util.LinkedHashMap r6 = new java.util.LinkedHashMap
            r10 = r6
            r6.<init>()
            java.util.Map r5 = r5.getPendingMessages()
            r6.putAll(r5)
            r6.put(r3, r0)
            r30 = 1048574(0xffffe, float:1.469365E-39)
            r31 = 0
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
            r26 = 0
            r27 = 0
            r28 = 0
            r29 = 0
            io.intercom.android.sdk.m5.conversation.states.ConversationClientState r5 = io.intercom.android.sdk.m5.conversation.states.ConversationClientState.copy$default(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31)
            boolean r4 = r2.e(r4, r5)
            if (r4 == 0) goto L_0x0437
        L_0x047f:
            r0 = r1
        L_0x0480:
            android.net.Uri r0 = r0.getUri()
            io.intercom.android.sdk.m5.utils.MediaCompressionKt.deleteCompressedMedia(r0)
            lf.M r0 = lf.C6514M.f71813a
            return r0
        L_0x048a:
            r1 = 5
            r2 = 4
            goto L_0x0174
        L_0x048e:
            lf.s r0 = new lf.s
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: io.intercom.android.sdk.m5.conversation.usecase.SendMediaUseCase$sendMediaNewWay$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
