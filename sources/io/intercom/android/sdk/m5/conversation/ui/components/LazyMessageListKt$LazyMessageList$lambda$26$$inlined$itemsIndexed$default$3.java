package io.intercom.android.sdk.m5.conversation.ui.components;

import D.A;
import D.c;
import Y.C1500m;
import Y.C1505o0;
import Y.C1510r0;
import android.content.Context;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C6498u;
import lf.C6514M;
import yf.C6787a;
import yf.C6798l;
import yf.r;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u000b¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "LD/c;", "", "it", "Llf/M;", "invoke", "(LD/c;ILY/m;I)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
public final class LazyMessageListKt$LazyMessageList$lambda$26$$inlined$itemsIndexed$default$3 extends C6498u implements r {
    final /* synthetic */ List $contentRows$inlined;
    final /* synthetic */ Context $context$inlined;
    final /* synthetic */ C1505o0 $firstVisibleItemIndex$delegate$inlined;
    final /* synthetic */ C1510r0 $isListAtTheBottom$delegate$inlined;
    final /* synthetic */ List $items;
    final /* synthetic */ A $lazyListState$inlined;
    final /* synthetic */ C6798l $navigateToAnotherConversation$inlined;
    final /* synthetic */ C6787a $navigateToTicketDetail$inlined;
    final /* synthetic */ C6798l $onCreateTicket$inlined;
    final /* synthetic */ C6798l $onReplyClicked$inlined;
    final /* synthetic */ C6798l $onRetryImageClicked$inlined;
    final /* synthetic */ C6798l $onRetryMessageClicked$inlined;
    final /* synthetic */ C6798l $onSubmitAttribute$inlined;
    final /* synthetic */ C6798l $onSuggestionClick$inlined;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LazyMessageListKt$LazyMessageList$lambda$26$$inlined$itemsIndexed$default$3(List list, List list2, C6787a aVar, C6798l lVar, C6798l lVar2, A a10, C6798l lVar3, C6798l lVar4, C6798l lVar5, C6798l lVar6, Context context, C1510r0 r0Var, C1505o0 o0Var, C6798l lVar7) {
        super(4);
        this.$items = list;
        this.$contentRows$inlined = list2;
        this.$navigateToTicketDetail$inlined = aVar;
        this.$onSuggestionClick$inlined = lVar;
        this.$onReplyClicked$inlined = lVar2;
        this.$lazyListState$inlined = a10;
        this.$navigateToAnotherConversation$inlined = lVar3;
        this.$onSubmitAttribute$inlined = lVar4;
        this.$onRetryImageClicked$inlined = lVar5;
        this.$onCreateTicket$inlined = lVar6;
        this.$context$inlined = context;
        this.$isListAtTheBottom$delegate$inlined = r0Var;
        this.$firstVisibleItemIndex$delegate$inlined = o0Var;
        this.$onRetryMessageClicked$inlined = lVar7;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        invoke((c) obj, ((Number) obj2).intValue(), (C1500m) obj3, ((Number) obj4).intValue());
        return C6514M.f71813a;
    }

    /* JADX WARNING: Removed duplicated region for block: B:113:0x0457  */
    /* JADX WARNING: Removed duplicated region for block: B:118:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void invoke(D.c r24, int r25, Y.C1500m r26, int r27) {
        /*
            r23 = this;
            r0 = r23
            r1 = r24
            r2 = r25
            r15 = r26
            r3 = r27 & 6
            r4 = 4
            r5 = 2
            if (r3 != 0) goto L_0x001a
            boolean r3 = r15.S(r1)
            if (r3 == 0) goto L_0x0016
            r3 = r4
            goto L_0x0017
        L_0x0016:
            r3 = r5
        L_0x0017:
            r3 = r27 | r3
            goto L_0x001c
        L_0x001a:
            r3 = r27
        L_0x001c:
            r6 = r27 & 48
            r7 = 32
            r8 = 16
            if (r6 != 0) goto L_0x002e
            boolean r6 = r15.d(r2)
            if (r6 == 0) goto L_0x002c
            r6 = r7
            goto L_0x002d
        L_0x002c:
            r6 = r8
        L_0x002d:
            r3 = r3 | r6
        L_0x002e:
            r6 = r3 & 147(0x93, float:2.06E-43)
            r9 = 146(0x92, float:2.05E-43)
            if (r6 != r9) goto L_0x0040
            boolean r6 = r26.i()
            if (r6 != 0) goto L_0x003b
            goto L_0x0040
        L_0x003b:
            r26.I()
            goto L_0x045a
        L_0x0040:
            boolean r6 = Y.C1506p.H()
            if (r6 == 0) goto L_0x004f
            r6 = -1
            java.lang.String r9 = "androidx.compose.foundation.lazy.itemsIndexed.<anonymous> (LazyDsl.kt:188)"
            r10 = -1091073711(0xffffffffbef78951, float:-0.48346952)
            Y.C1506p.Q(r10, r3, r6, r9)
        L_0x004f:
            java.util.List r6 = r0.$items
            java.lang.Object r6 = r6.get(r2)
            io.intercom.android.sdk.m5.conversation.states.ContentRow r6 = (io.intercom.android.sdk.m5.conversation.states.ContentRow) r6
            r9 = 890558215(0x3514d707, float:5.54472E-7)
            r15.T(r9)
            java.util.List r9 = r0.$contentRows$inlined
            float r18 = io.intercom.android.sdk.m5.conversation.ui.components.MessageListKt.gapWithPrevious(r6, r2, r9)
            k0.i$a r16 = k0.i.f23074a
            r21 = 13
            r22 = 0
            r17 = 0
            r19 = 0
            r20 = 0
            k0.i r9 = androidx.compose.foundation.layout.n.m(r16, r17, r18, r19, r20, r21, r22)
            boolean r10 = io.intercom.android.sdk.m5.conversation.ui.components.LazyMessageListKt.shouldFadeInItem(r6)
            r11 = 5
            r12 = 1137180672(0x43c80000, float:400.0)
            r13 = 0
            r14 = 0
            if (r10 == 0) goto L_0x0083
            w.g0 r10 = w.C2798j.h(r13, r12, r14, r11, r14)
            goto L_0x0084
        L_0x0083:
            r10 = r14
        L_0x0084:
            boolean r16 = io.intercom.android.sdk.m5.conversation.ui.components.LazyMessageListKt.shouldFadeOutItem(r6)
            if (r16 == 0) goto L_0x008f
            w.g0 r11 = w.C2798j.h(r13, r12, r14, r11, r14)
            goto L_0x0090
        L_0x008f:
            r11 = r14
        L_0x0090:
            k0.i r9 = r1.c(r9, r10, r14, r11)
            boolean r1 = r6 instanceof io.intercom.android.sdk.m5.conversation.states.ContentRow.AskedAboutRow
            r10 = 1
            r11 = 0
            if (r1 == 0) goto L_0x00b5
            r1 = 891164884(0x351e18d4, float:5.8895716E-7)
            r15.T(r1)
            k0.i r1 = androidx.compose.foundation.layout.q.h(r9, r13, r10, r14)
            io.intercom.android.sdk.m5.conversation.states.ContentRow$AskedAboutRow r6 = (io.intercom.android.sdk.m5.conversation.states.ContentRow.AskedAboutRow) r6
            io.intercom.android.sdk.models.Part r2 = r6.getPart()
            r3 = 64
            io.intercom.android.sdk.m5.conversation.ui.components.row.AskedAboutRowKt.AskedAboutRow(r1, r2, r15, r3, r11)
            r26.M()
        L_0x00b2:
            r12 = r15
            goto L_0x044e
        L_0x00b5:
            boolean r1 = r6 instanceof io.intercom.android.sdk.m5.conversation.states.ContentRow.BigTicketRow
            if (r1 == 0) goto L_0x00d5
            r1 = 891396640(0x3521a220, float:6.0213097E-7)
            r15.T(r1)
            io.intercom.android.sdk.m5.conversation.states.ContentRow$BigTicketRow r6 = (io.intercom.android.sdk.m5.conversation.states.ContentRow.BigTicketRow) r6
            io.intercom.android.sdk.tickets.TicketDetailState$TicketDetailContentState r1 = r6.getTicketDetailContentState()
            yf.a r2 = r0.$navigateToTicketDetail$inlined
            r6 = 392(0x188, float:5.5E-43)
            r7 = 0
            r3 = 1
            r4 = r9
            r5 = r26
            io.intercom.android.sdk.m5.conversation.ui.components.row.BigTicketCardKt.BigTicketCard(r1, r2, r3, r4, r5, r6, r7)
            r26.M()
            goto L_0x00b2
        L_0x00d5:
            boolean r1 = r6 instanceof io.intercom.android.sdk.m5.conversation.states.ContentRow.ComposerSuggestionRow
            if (r1 == 0) goto L_0x0100
            r1 = 891750443(0x3527082b, float:6.2224234E-7)
            r15.T(r1)
            io.intercom.android.sdk.m5.conversation.states.ContentRow$ComposerSuggestionRow r6 = (io.intercom.android.sdk.m5.conversation.states.ContentRow.ComposerSuggestionRow) r6
            java.util.List r2 = r6.getSuggestions()
            k0.i r1 = androidx.compose.foundation.layout.q.h(r9, r13, r10, r14)
            float r3 = (float) r8
            float r3 = c1.h.j(r3)
            k0.i r1 = androidx.compose.foundation.layout.n.k(r1, r3, r13, r5, r14)
            yf.l r3 = r0.$onSuggestionClick$inlined
            r5 = 64
            r6 = 0
            r4 = r26
            io.intercom.android.sdk.m5.conversation.ui.components.row.QuickRepliesKt.ComposerSuggestions(r1, r2, r3, r4, r5, r6)
            r26.M()
            goto L_0x00b2
        L_0x0100:
            boolean r1 = r6 instanceof io.intercom.android.sdk.m5.conversation.states.ContentRow.QuickRepliesRow
            if (r1 == 0) goto L_0x0138
            r1 = 892149134(0x352d1d8e, float:6.449053E-7)
            r15.T(r1)
            k0.i r16 = androidx.compose.foundation.layout.q.h(r9, r13, r10, r14)
            float r1 = (float) r8
            float r17 = c1.h.j(r1)
            float r19 = c1.h.j(r1)
            r21 = 10
            r22 = 0
            r18 = 0
            r20 = 0
            k0.i r1 = androidx.compose.foundation.layout.n.m(r16, r17, r18, r19, r20, r21, r22)
            io.intercom.android.sdk.m5.conversation.states.ContentRow$QuickRepliesRow r6 = (io.intercom.android.sdk.m5.conversation.states.ContentRow.QuickRepliesRow) r6
            java.util.List r2 = r6.getReplyOptions()
            yf.l r3 = r0.$onReplyClicked$inlined
            r5 = 64
            r6 = 0
            r4 = r26
            io.intercom.android.sdk.m5.conversation.ui.components.row.QuickRepliesKt.ReplyOptions(r1, r2, r3, r4, r5, r6)
            r26.M()
            goto L_0x00b2
        L_0x0138:
            boolean r1 = r6 instanceof io.intercom.android.sdk.m5.conversation.states.ContentRow.DayDividerRow
            if (r1 == 0) goto L_0x0162
            r1 = 892539393(0x35331201, float:6.6708895E-7)
            r15.T(r1)
            io.intercom.android.sdk.m5.conversation.states.ContentRow$DayDividerRow r6 = (io.intercom.android.sdk.m5.conversation.states.ContentRow.DayDividerRow) r6
            long r1 = r6.getTimestamp()
            Y.I0 r3 = androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.g()
            java.lang.Object r3 = r15.m(r3)
            android.content.Context r3 = (android.content.Context) r3
            java.lang.String r1 = io.intercom.android.sdk.utilities.TimeFormatterExtKt.formattedDateForDayDivider(r1, r3)
            k0.i r2 = androidx.compose.foundation.layout.q.h(r9, r13, r10, r14)
            io.intercom.android.sdk.m5.conversation.ui.components.row.DayDividerKt.DayDivider(r1, r2, r15, r11, r11)
            r26.M()
            goto L_0x00b2
        L_0x0162:
            boolean r1 = r6 instanceof io.intercom.android.sdk.m5.conversation.states.ContentRow.EventRow
            if (r1 == 0) goto L_0x018c
            r1 = 892814394(0x3537443a, float:6.8272095E-7)
            r15.T(r1)
            k0.i r1 = androidx.compose.foundation.layout.q.h(r9, r13, r10, r14)
            io.intercom.android.sdk.m5.conversation.states.ContentRow$EventRow r6 = (io.intercom.android.sdk.m5.conversation.states.ContentRow.EventRow) r6
            java.lang.String r2 = r6.getLabel()
            io.intercom.android.sdk.m5.components.avatar.AvatarWrapper r3 = new io.intercom.android.sdk.m5.components.avatar.AvatarWrapper
            io.intercom.android.sdk.models.Avatar r4 = r6.getAvatar()
            r3.<init>(r4, r11, r5, r14)
            r5 = 512(0x200, float:7.175E-43)
            r6 = 0
            r4 = r26
            io.intercom.android.sdk.m5.conversation.ui.components.row.EventRowKt.EventRow(r1, r2, r3, r4, r5, r6)
            r26.M()
            goto L_0x00b2
        L_0x018c:
            boolean r1 = r6 instanceof io.intercom.android.sdk.m5.conversation.states.ContentRow.FinAnswerRow
            if (r1 == 0) goto L_0x01b0
            r1 = 893100214(0x353ba0b6, float:6.9896794E-7)
            r15.T(r1)
            io.intercom.android.sdk.m5.conversation.states.ContentRow$FinAnswerRow r6 = (io.intercom.android.sdk.m5.conversation.states.ContentRow.FinAnswerRow) r6
            io.intercom.android.sdk.models.Part r1 = r6.getPart()
            io.intercom.android.sdk.m5.conversation.states.GroupingPosition r2 = r6.getGroupingPosition()
            r6 = 8
            r7 = 8
            r4 = 0
            r3 = r9
            r5 = r26
            io.intercom.android.sdk.m5.conversation.ui.components.row.FinAnswerRowKt.FinAnswerRow(r1, r2, r3, r4, r5, r6, r7)
            r26.M()
            goto L_0x00b2
        L_0x01b0:
            boolean r1 = r6 instanceof io.intercom.android.sdk.m5.conversation.states.ContentRow.FinStreamingRow
            if (r1 == 0) goto L_0x0223
            r1 = 893400945(0x35403771, float:7.160625E-7)
            r15.T(r1)
            r8 = r6
            io.intercom.android.sdk.m5.conversation.states.ContentRow$FinStreamingRow r8 = (io.intercom.android.sdk.m5.conversation.states.ContentRow.FinStreamingRow) r8
            java.util.List r12 = r8.getBlocks()
            r1 = -248273976(0xfffffffff133a3c8, float:-8.8953306E29)
            r15.T(r1)
            r1 = r3 & 112(0x70, float:1.57E-43)
            r1 = r1 ^ 48
            if (r1 <= r7) goto L_0x01d3
            boolean r1 = r15.d(r2)
            if (r1 != 0) goto L_0x01d7
        L_0x01d3:
            r1 = r3 & 48
            if (r1 != r7) goto L_0x01d8
        L_0x01d7:
            r11 = r10
        L_0x01d8:
            D.A r1 = r0.$lazyListState$inlined
            boolean r1 = r15.S(r1)
            r1 = r1 | r11
            java.lang.Object r3 = r26.A()
            if (r1 != 0) goto L_0x01ed
            Y.m$a r1 = Y.C1500m.f10026a
            java.lang.Object r1 = r1.a()
            if (r3 != r1) goto L_0x0200
        L_0x01ed:
            io.intercom.android.sdk.m5.conversation.ui.components.LazyMessageListKt$LazyMessageList$14$2$1$1 r7 = new io.intercom.android.sdk.m5.conversation.ui.components.LazyMessageListKt$LazyMessageList$14$2$1$1
            D.A r3 = r0.$lazyListState$inlined
            Y.r0 r4 = r0.$isListAtTheBottom$delegate$inlined
            Y.o0 r5 = r0.$firstVisibleItemIndex$delegate$inlined
            r6 = 0
            r1 = r7
            r2 = r25
            r1.<init>(r2, r3, r4, r5, r6)
            r15.r(r7)
            r3 = r7
        L_0x0200:
            yf.p r3 = (yf.p) r3
            r26.M()
            r1 = 72
            Y.P.g(r12, r3, r15, r1)
            k0.i r3 = androidx.compose.foundation.layout.q.h(r9, r13, r10, r14)
            java.util.List r1 = r8.getBlocks()
            io.intercom.android.sdk.models.StreamingPart r2 = r8.getStreamingPart()
            r5 = 72
            r6 = 0
            r4 = r26
            io.intercom.android.sdk.m5.conversation.ui.components.row.FinStreamingRowKt.FinStreamingRow(r1, r2, r3, r4, r5, r6)
            r26.M()
            goto L_0x00b2
        L_0x0223:
            boolean r1 = r6 instanceof io.intercom.android.sdk.m5.conversation.states.ContentRow.FooterNoticeRow
            if (r1 == 0) goto L_0x0264
            r1 = 893948405(0x354891f5, float:7.47182E-7)
            r15.T(r1)
            r1 = 24
            float r1 = (float) r1
            float r1 = c1.h.j(r1)
            float r2 = (float) r4
            float r2 = c1.h.j(r2)
            k0.i r1 = androidx.compose.foundation.layout.n.j(r9, r1, r2)
            io.intercom.android.sdk.m5.conversation.states.ContentRow$FooterNoticeRow r6 = (io.intercom.android.sdk.m5.conversation.states.ContentRow.FooterNoticeRow) r6
            io.intercom.android.sdk.m5.conversation.states.FooterNoticeState r2 = r6.getFooterNoticeState()
            java.lang.String r2 = r2.getTitle()
            io.intercom.android.sdk.m5.conversation.states.FooterNoticeState r3 = r6.getFooterNoticeState()
            java.lang.String r3 = r3.getSubtitle()
            io.intercom.android.sdk.m5.conversation.states.FooterNoticeState r4 = r6.getFooterNoticeState()
            java.util.List r4 = r4.getAvatars()
            r6 = 4096(0x1000, float:5.74E-42)
            r7 = 0
            r5 = r26
            io.intercom.android.sdk.m5.components.FooterNoticeKt.ExpandedFooterNotice(r1, r2, r3, r4, r5, r6, r7)
            r26.M()
            goto L_0x00b2
        L_0x0264:
            boolean r1 = r6 instanceof io.intercom.android.sdk.m5.conversation.states.ContentRow.MergedConversationRow
            if (r1 == 0) goto L_0x02a1
            r1 = 894378127(0x354f208f, float:7.716089E-7)
            r15.T(r1)
            io.intercom.android.sdk.m5.conversation.states.ContentRow$MergedConversationRow r6 = (io.intercom.android.sdk.m5.conversation.states.ContentRow.MergedConversationRow) r6
            java.lang.String r1 = r6.getDescription()
            if (r1 == 0) goto L_0x029c
            int r1 = r1.length()
            if (r1 != 0) goto L_0x027d
            goto L_0x029c
        L_0x027d:
            java.lang.String r1 = r6.getConversationId()
            if (r1 == 0) goto L_0x029c
            int r1 = r1.length()
            if (r1 != 0) goto L_0x028a
            goto L_0x029c
        L_0x028a:
            java.lang.String r2 = r6.getDescription()
            java.lang.String r3 = r6.getConversationId()
            yf.l r4 = r0.$navigateToAnotherConversation$inlined
            r6 = 0
            r7 = 0
            r1 = r9
            r5 = r26
            io.intercom.android.sdk.m5.conversation.ui.components.row.MergedConversationRowKt.MergedConversationRow(r1, r2, r3, r4, r5, r6, r7)
        L_0x029c:
            r26.M()
            goto L_0x00b2
        L_0x02a1:
            boolean r1 = r6 instanceof io.intercom.android.sdk.m5.conversation.states.ContentRow.BubbleMessageRow
            if (r1 == 0) goto L_0x0330
            r1 = 894927788(0x355783ac, float:8.028535E-7)
            r15.T(r1)
            k0.i r4 = androidx.compose.foundation.layout.q.h(r9, r13, r10, r14)
            r1 = r6
            io.intercom.android.sdk.m5.conversation.states.ContentRow$BubbleMessageRow r1 = (io.intercom.android.sdk.m5.conversation.states.ContentRow.BubbleMessageRow) r1
            io.intercom.android.sdk.m5.conversation.states.ContentRow$BubbleMessageRow$PartWrapper r2 = r1.getPartWrapper()
            io.intercom.android.sdk.models.Part r2 = r2.getPart()
            io.intercom.android.sdk.m5.conversation.states.ContentRow$BubbleMessageRow$PartWrapper r3 = r1.getPartWrapper()
            io.intercom.android.sdk.models.Part r3 = r3.getPart()
            long r7 = r3.getCreatedAt()
            java.lang.String r5 = io.intercom.android.sdk.utilities.TimeFormatterExtKt.toHourOfDay(r7)
            io.intercom.android.sdk.m5.conversation.states.ContentRow$BubbleMessageRow$PartWrapper r3 = r1.getPartWrapper()
            java.util.List r7 = r3.getFailedAttributeIdentifiers()
            io.intercom.android.sdk.m5.conversation.states.ContentRow$BubbleMessageRow$PartWrapper r3 = r1.getPartWrapper()
            java.util.List r8 = r3.getLoadingAttributeIdentifiers()
            io.intercom.android.sdk.m5.conversation.states.GroupingPosition r3 = r1.getGroupingPosition()
            io.intercom.android.sdk.m5.conversation.states.ContentRow$BubbleMessageRow$PartWrapper r9 = r1.getPartWrapper()
            boolean r9 = r9.isAdminOrAltParticipant()
            io.intercom.android.sdk.m5.conversation.states.PendingMessage$FailedImageUploadData r10 = r1.getFailedImageUploadData()
            r12 = -248197795(0xfffffffff134cd5d, float:-8.952891E29)
            r15.T(r12)
            boolean r1 = r1.isFailed()
            if (r1 == 0) goto L_0x030a
            io.intercom.android.sdk.m5.conversation.ui.components.row.FailedMessage r1 = new io.intercom.android.sdk.m5.conversation.ui.components.row.FailedMessage
            int r12 = io.intercom.android.sdk.R.string.intercom_failed_delivery
            java.lang.String r11 = M0.i.a(r12, r15, r11)
            io.intercom.android.sdk.m5.conversation.ui.components.LazyMessageListKt$LazyMessageList$14$2$2 r12 = new io.intercom.android.sdk.m5.conversation.ui.components.LazyMessageListKt$LazyMessageList$14$2$2
            yf.l r13 = r0.$onRetryMessageClicked$inlined
            r12.<init>(r13, r6)
            r1.<init>(r11, r12)
            r11 = r1
            goto L_0x030b
        L_0x030a:
            r11 = r14
        L_0x030b:
            r26.M()
            yf.l r6 = r0.$onSubmitAttribute$inlined
            yf.l r12 = r0.$onRetryImageClicked$inlined
            yf.l r13 = r0.$onCreateTicket$inlined
            r16 = 0
            r17 = 0
            r14 = 18874376(0x1200008, float:2.938738E-38)
            r1 = r2
            r2 = r3
            r3 = r9
            r9 = r12
            r12 = r13
            r13 = r26
            r15 = r16
            r16 = r17
            io.intercom.android.sdk.m5.conversation.ui.components.row.BubbleMessageRowKt.BubbleMessageRow(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            r26.M()
            r12 = r26
            goto L_0x044e
        L_0x0330:
            boolean r1 = r6 instanceof io.intercom.android.sdk.m5.conversation.states.ContentRow.NewMessagesRow
            if (r1 == 0) goto L_0x0344
            r1 = 896270956(0x356c026c, float:8.7920375E-7)
            r12 = r26
            r12.T(r1)
            io.intercom.android.sdk.m5.conversation.ui.components.row.NewMessagesRowKt.NewMessagesRow(r9, r12, r11, r11)
            r26.M()
            goto L_0x044e
        L_0x0344:
            r12 = r26
            boolean r1 = r6 instanceof io.intercom.android.sdk.m5.conversation.states.ContentRow.NoteCardRow
            if (r1 == 0) goto L_0x0368
            r1 = 896445517(0x356eac4d, float:8.891264E-7)
            r12.T(r1)
            io.intercom.android.sdk.m5.conversation.states.ContentRow$NoteCardRow r6 = (io.intercom.android.sdk.m5.conversation.states.ContentRow.NoteCardRow) r6
            io.intercom.android.sdk.models.Part r2 = r6.getPart()
            java.lang.String r3 = r6.getCompanyName()
            r5 = 64
            r6 = 0
            r1 = r9
            r4 = r26
            io.intercom.android.sdk.m5.conversation.ui.components.row.NoteCardRowKt.NoteCardRow(r1, r2, r3, r4, r5, r6)
            r26.M()
            goto L_0x044e
        L_0x0368:
            boolean r1 = r6 instanceof io.intercom.android.sdk.m5.conversation.states.ContentRow.PostCardRow
            if (r1 == 0) goto L_0x038a
            r1 = 896711373(0x3572bacd, float:9.0423856E-7)
            r12.T(r1)
            io.intercom.android.sdk.m5.conversation.states.ContentRow$PostCardRow r6 = (io.intercom.android.sdk.m5.conversation.states.ContentRow.PostCardRow) r6
            io.intercom.android.sdk.models.Part r2 = r6.getPart()
            java.lang.String r3 = r6.getCompanyName()
            r5 = 64
            r6 = 0
            r1 = r9
            r4 = r26
            io.intercom.android.sdk.m5.conversation.ui.components.row.PostCardRowKt.PostCardRow(r1, r2, r3, r4, r5, r6)
            r26.M()
            goto L_0x044e
        L_0x038a:
            boolean r1 = r6 instanceof io.intercom.android.sdk.m5.conversation.states.ContentRow.TeamIntroRow
            if (r1 == 0) goto L_0x03b8
            r1 = 896977632(0x3576cae0, float:9.1937363E-7)
            r12.T(r1)
            float r1 = (float) r8
            float r16 = c1.h.j(r1)
            float r18 = c1.h.j(r1)
            r20 = 10
            r21 = 0
            r17 = 0
            r19 = 0
            r15 = r9
            k0.i r1 = androidx.compose.foundation.layout.n.m(r15, r16, r17, r18, r19, r20, r21)
            io.intercom.android.sdk.m5.conversation.states.ContentRow$TeamIntroRow r6 = (io.intercom.android.sdk.m5.conversation.states.ContentRow.TeamIntroRow) r6
            java.lang.String r2 = r6.getMessage()
            io.intercom.android.sdk.m5.conversation.ui.components.row.TeamIntroKt.TeamIntro(r2, r1, r12, r11, r11)
            r26.M()
            goto L_0x044e
        L_0x03b8:
            boolean r1 = r6 instanceof io.intercom.android.sdk.m5.conversation.states.ContentRow.SpecialNoticeRow
            if (r1 == 0) goto L_0x03e5
            r1 = 897229724(0x357aa39c, float:9.337034E-7)
            r12.T(r1)
            float r1 = (float) r8
            float r16 = c1.h.j(r1)
            float r18 = c1.h.j(r1)
            r20 = 10
            r21 = 0
            r17 = 0
            r19 = 0
            r15 = r9
            k0.i r1 = androidx.compose.foundation.layout.n.m(r15, r16, r17, r18, r19, r20, r21)
            io.intercom.android.sdk.m5.conversation.states.ContentRow$SpecialNoticeRow r6 = (io.intercom.android.sdk.m5.conversation.states.ContentRow.SpecialNoticeRow) r6
            java.lang.String r2 = r6.getMessage()
            io.intercom.android.sdk.m5.conversation.ui.components.row.SpecialNoticeKt.SpecialNotice(r2, r1, r12, r11, r11)
            r26.M()
            goto L_0x044e
        L_0x03e5:
            boolean r1 = r6 instanceof io.intercom.android.sdk.m5.conversation.states.ContentRow.TicketStatusRow
            if (r1 == 0) goto L_0x041f
            r1 = 897493441(0x357ea9c1, float:9.48694E-7)
            r12.T(r1)
            io.intercom.android.sdk.m5.conversation.states.ContentRow$TicketStatusRow r6 = (io.intercom.android.sdk.m5.conversation.states.ContentRow.TicketStatusRow) r6
            java.lang.String r1 = r6.getTicketEventStatus()
            java.lang.String r2 = r6.getTicketStatusText()
            long r3 = r6.getCreatedAt()
            android.content.Context r7 = r0.$context$inlined
            java.lang.String r3 = io.intercom.android.sdk.utilities.TimeFormatterExtKt.formattedDateFromLong(r3, r7)
            float r4 = (float) r8
            float r4 = c1.h.j(r4)
            k0.i r4 = androidx.compose.foundation.layout.n.k(r9, r4, r13, r5, r14)
            java.lang.String r5 = r6.getCustomStateLabel()
            java.lang.String r6 = r6.getCustomStatePrefix()
            r8 = 0
            r9 = 0
            r7 = r26
            io.intercom.android.sdk.m5.conversation.ui.components.row.TicketStatusRowKt.TicketStatusRow(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            r26.M()
            goto L_0x044e
        L_0x041f:
            boolean r1 = r6 instanceof io.intercom.android.sdk.m5.conversation.states.ContentRow.TypingIndicatorRow
            if (r1 == 0) goto L_0x045b
            r1 = 898027633(0x3586d071, float:1.0044442E-6)
            r12.T(r1)
            k0.i r1 = androidx.compose.foundation.layout.q.h(r9, r13, r10, r14)
            float r2 = (float) r8
            float r2 = c1.h.j(r2)
            k0.i r1 = androidx.compose.foundation.layout.n.k(r1, r2, r13, r5, r14)
            io.intercom.android.sdk.m5.conversation.states.ContentRow$TypingIndicatorRow r6 = (io.intercom.android.sdk.m5.conversation.states.ContentRow.TypingIndicatorRow) r6
            io.intercom.android.sdk.m5.conversation.states.CurrentlyTypingState r2 = r6.getCurrentlyTypingState()
            r3 = 36
            float r3 = (float) r3
            float r3 = c1.h.j(r3)
            r5 = 448(0x1c0, float:6.28E-43)
            r6 = 0
            r4 = r26
            io.intercom.android.sdk.m5.conversation.ui.components.row.TypingIndicatorKt.m327TypingIndicator6a0pyJM(r1, r2, r3, r4, r5, r6)
            r26.M()
        L_0x044e:
            r26.M()
            boolean r1 = Y.C1506p.H()
            if (r1 == 0) goto L_0x045a
            Y.C1506p.P()
        L_0x045a:
            return
        L_0x045b:
            r1 = -248342211(0xfffffffff132993d, float:-8.843774E29)
            r12.T(r1)
            r26.M()
            lf.s r1 = new lf.s
            r1.<init>()
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: io.intercom.android.sdk.m5.conversation.ui.components.LazyMessageListKt$LazyMessageList$lambda$26$$inlined$itemsIndexed$default$3.invoke(D.c, int, Y.m, int):void");
    }
}
