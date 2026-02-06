package io.intercom.android.sdk.m5.conversation.ui.components.row;

import V.C1404s;
import Y.C1500m;
import androidx.compose.foundation.layout.n;
import io.intercom.android.sdk.m5.conversation.states.PendingMessage;
import io.intercom.android.sdk.m5.conversation.ui.components.row.MessageStyle;
import io.intercom.android.sdk.models.Part;
import java.util.List;
import k0.i;
import kotlin.Metadata;
import lf.C6514M;
import yf.C6787a;
import yf.C6798l;
import yf.p;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
final class BubbleMessageRowKt$BubbleMessageRow$6$1$1$1 implements p {
    final /* synthetic */ Part $conversationPart;
    final /* synthetic */ List<String> $failedAttributeIdentifiers;
    final /* synthetic */ PendingMessage.FailedImageUploadData $failedImageUploadData;
    final /* synthetic */ boolean $isAdminOrAltParticipant;
    final /* synthetic */ List<String> $loadingAttributeIdentifiers;
    final /* synthetic */ MessageStyle $messageStyle;
    final /* synthetic */ C6787a $onClick;
    final /* synthetic */ C6798l $onCreateTicket;
    final /* synthetic */ C6798l $onRetryImageClicked;
    final /* synthetic */ C6798l $onSubmitAttribute;
    final /* synthetic */ Part $part;
    final /* synthetic */ MessageStyle.BubbleStyle $this_with;

    BubbleMessageRowKt$BubbleMessageRow$6$1$1$1(MessageStyle.BubbleStyle bubbleStyle, Part part, Part part2, List<String> list, List<String> list2, C6798l lVar, MessageStyle messageStyle, C6787a aVar, C6798l lVar2, boolean z10, PendingMessage.FailedImageUploadData failedImageUploadData, C6798l lVar3) {
        this.$this_with = bubbleStyle;
        this.$conversationPart = part;
        this.$part = part2;
        this.$failedAttributeIdentifiers = list;
        this.$loadingAttributeIdentifiers = list2;
        this.$onSubmitAttribute = lVar;
        this.$messageStyle = messageStyle;
        this.$onClick = aVar;
        this.$onCreateTicket = lVar2;
        this.$isAdminOrAltParticipant = z10;
        this.$failedImageUploadData = failedImageUploadData;
        this.$onRetryImageClicked = lVar3;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C1500m) obj, ((Number) obj2).intValue());
        return C6514M.f71813a;
    }

    public final void invoke(C1500m mVar, int i10) {
        if ((i10 & 11) != 2 || !mVar.i()) {
            BubbleMessageRowKt$BubbleMessageRow$6.invoke$lambda$5$Content(this.$conversationPart, this.$part, this.$failedAttributeIdentifiers, this.$loadingAttributeIdentifiers, this.$onSubmitAttribute, this.$messageStyle, this.$onClick, this.$onCreateTicket, this.$isAdminOrAltParticipant, this.$failedImageUploadData, this.$onRetryImageClicked, C1404s.c(this.$this_with.m325getColor0d7_KjU(), mVar, 0), n.h(i.f23074a, this.$this_with.getPadding()), mVar, 0, 0);
        } else {
            mVar.I();
        }
    }
}
