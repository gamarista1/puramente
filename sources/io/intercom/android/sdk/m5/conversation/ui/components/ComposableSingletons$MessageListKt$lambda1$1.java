package io.intercom.android.sdk.m5.conversation.ui.components;

import Y.C1500m;
import androidx.compose.foundation.o;
import io.intercom.android.sdk.m5.conversation.states.ContentRow;
import io.intercom.android.sdk.m5.conversation.states.GroupingPosition;
import io.intercom.android.sdk.m5.conversation.states.PendingMessage;
import io.intercom.android.sdk.m5.conversation.ui.components.row.BubbleMessageRowKt;
import io.intercom.android.sdk.models.Part;
import io.intercom.android.sdk.models.ReplyOption;
import java.util.List;
import k0.i;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lf.C6514M;
import mf.C6565s;
import yf.C6787a;
import yf.C6798l;
import yf.p;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* renamed from: io.intercom.android.sdk.m5.conversation.ui.components.ComposableSingletons$MessageListKt$lambda-1$1  reason: invalid class name */
final class ComposableSingletons$MessageListKt$lambda1$1 implements p {
    public static final ComposableSingletons$MessageListKt$lambda1$1 INSTANCE = new ComposableSingletons$MessageListKt$lambda1$1();

    ComposableSingletons$MessageListKt$lambda1$1() {
    }

    /* access modifiers changed from: private */
    public static final C6514M invoke$lambda$1(ReplyOption replyOption) {
        C6496s.h(replyOption, "it");
        return C6514M.f71813a;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C1500m) obj, ((Number) obj2).intValue());
        return C6514M.f71813a;
    }

    public final void invoke(C1500m mVar, int i10) {
        if ((i10 & 11) != 2 || !mVar.i()) {
            List c10 = C6565s.c();
            c10.add(new ContentRow.TeamIntroRow("Our team is here to help you with any questions you have"));
            c10.add(new ContentRow.SpecialNoticeRow("Our response times are slower than usual. We’re working hard to get to your message"));
            Part build = new Part.Builder().withParticipantIsAdmin(true).withBlocks(C6565s.e(BubbleMessageRowKt.getParagraphBlock())).withMetadata(BubbleMessageRowKt.getHumanMetadata()).build();
            C6496s.g(build, "build(...)");
            ContentRow.BubbleMessageRow.PartWrapper partWrapper = new ContentRow.BubbleMessageRow.PartWrapper(build, false, true, (List) null, (List) null, 24, (DefaultConstructorMarker) null);
            GroupingPosition groupingPosition = GroupingPosition.STANDALONE;
            c10.add(new ContentRow.BubbleMessageRow(partWrapper, groupingPosition, (PendingMessage.FailedImageUploadData) null, false, false, 16, (DefaultConstructorMarker) null));
            c10.add(new ContentRow.DayDividerRow(164138400));
            Part build2 = new Part.Builder().withParticipantIsAdmin(true).withBlocks(C6565s.e(BubbleMessageRowKt.getParagraphBlock())).withMetadata(BubbleMessageRowKt.getHumanMetadata()).build();
            C6496s.g(build2, "build(...)");
            c10.add(new ContentRow.BubbleMessageRow(new ContentRow.BubbleMessageRow.PartWrapper(build2, false, true, (List) null, (List) null, 24, (DefaultConstructorMarker) null), GroupingPosition.TOP, (PendingMessage.FailedImageUploadData) null, false, false, 16, (DefaultConstructorMarker) null));
            Part build3 = new Part.Builder().withParticipantIsAdmin(true).withBlocks(C6565s.e(BubbleMessageRowKt.getLongParagraphBlock())).build();
            C6496s.g(build3, "build(...)");
            c10.add(new ContentRow.BubbleMessageRow(new ContentRow.BubbleMessageRow.PartWrapper(build3, false, true, (List) null, (List) null, 24, (DefaultConstructorMarker) null), GroupingPosition.MIDDLE, (PendingMessage.FailedImageUploadData) null, false, false, 16, (DefaultConstructorMarker) null));
            Part build4 = new Part.Builder().withParticipantIsAdmin(true).withBlocks(C6565s.e(BubbleMessageRowKt.getParagraphBlock())).build();
            C6496s.g(build4, "build(...)");
            c10.add(new ContentRow.BubbleMessageRow(new ContentRow.BubbleMessageRow.PartWrapper(build4, false, true, (List) null, (List) null, 24, (DefaultConstructorMarker) null), GroupingPosition.BOTTOM, (PendingMessage.FailedImageUploadData) null, false, false, 16, (DefaultConstructorMarker) null));
            Part build5 = new Part.Builder().withParticipantIsAdmin(true).withBlocks(C6565s.e(BubbleMessageRowKt.getParagraphBlock())).build();
            C6496s.g(build5, "build(...)");
            c10.add(new ContentRow.BubbleMessageRow(new ContentRow.BubbleMessageRow.PartWrapper(build5, false, false, (List) null, (List) null, 24, (DefaultConstructorMarker) null), groupingPosition, (PendingMessage.FailedImageUploadData) null, true, false, 16, (DefaultConstructorMarker) null));
            MessageListKt.MessageList((i) null, C6565s.a(c10), (o) null, (C6798l) null, new C6114g(), (C6798l) null, (C6798l) null, (C6798l) null, (C6787a) null, (C6798l) null, false, (C6798l) null, mVar, 24640, 0, 4077);
            return;
        }
        mVar.I();
    }
}
