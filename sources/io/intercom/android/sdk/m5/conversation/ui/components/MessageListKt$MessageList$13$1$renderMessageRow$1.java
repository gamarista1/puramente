package io.intercom.android.sdk.m5.conversation.ui.components;

import Y.C1500m;
import androidx.compose.foundation.layout.q;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.m5.conversation.states.ContentRow;
import io.intercom.android.sdk.m5.conversation.states.GroupingPosition;
import io.intercom.android.sdk.m5.conversation.states.PendingMessage;
import io.intercom.android.sdk.m5.conversation.ui.components.row.BubbleMessageRowKt;
import io.intercom.android.sdk.m5.conversation.ui.components.row.FailedMessage;
import io.intercom.android.sdk.models.Part;
import io.intercom.android.sdk.utilities.TimeFormatterExtKt;
import java.util.List;
import k0.i;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import lf.C6514M;
import yf.C6798l;
import yf.p;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
final class MessageListKt$MessageList$13$1$renderMessageRow$1 implements p {
    final /* synthetic */ ContentRow $item;
    final /* synthetic */ C6798l $onCreateTicket;
    final /* synthetic */ C6798l $onRetryImageClicked;
    final /* synthetic */ C6798l $onRetryMessageClicked;
    final /* synthetic */ C6798l $onSubmitAttribute;

    MessageListKt$MessageList$13$1$renderMessageRow$1(ContentRow contentRow, C6798l lVar, C6798l lVar2, C6798l lVar3, C6798l lVar4) {
        this.$item = contentRow;
        this.$onSubmitAttribute = lVar;
        this.$onRetryImageClicked = lVar2;
        this.$onCreateTicket = lVar3;
        this.$onRetryMessageClicked = lVar4;
    }

    /* access modifiers changed from: private */
    public static final C6514M invoke$lambda$0(C6798l lVar, ContentRow contentRow) {
        C6496s.h(contentRow, "$item");
        lVar.invoke(((ContentRow.BubbleMessageRow) contentRow).getPartWrapper().getPart());
        return C6514M.f71813a;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C1500m) obj, ((Number) obj2).intValue());
        return C6514M.f71813a;
    }

    public final void invoke(C1500m mVar, int i10) {
        C1500m mVar2 = mVar;
        if ((i10 & 11) != 2 || !mVar.i()) {
            FailedMessage failedMessage = null;
            i h10 = q.h(i.f23074a, 0.0f, 1, (Object) null);
            Part part = ((ContentRow.BubbleMessageRow) this.$item).getPartWrapper().getPart();
            String hourOfDay = TimeFormatterExtKt.toHourOfDay(((ContentRow.BubbleMessageRow) this.$item).getPartWrapper().getPart().getCreatedAt());
            List<String> failedAttributeIdentifiers = ((ContentRow.BubbleMessageRow) this.$item).getPartWrapper().getFailedAttributeIdentifiers();
            List<String> loadingAttributeIdentifiers = ((ContentRow.BubbleMessageRow) this.$item).getPartWrapper().getLoadingAttributeIdentifiers();
            GroupingPosition groupingPosition = ((ContentRow.BubbleMessageRow) this.$item).getGroupingPosition();
            boolean isAdminOrAltParticipant = ((ContentRow.BubbleMessageRow) this.$item).getPartWrapper().isAdminOrAltParticipant();
            PendingMessage.FailedImageUploadData failedImageUploadData = ((ContentRow.BubbleMessageRow) this.$item).getFailedImageUploadData();
            mVar2.T(-1874262548);
            if (((ContentRow.BubbleMessageRow) this.$item).isFailed()) {
                failedMessage = new FailedMessage(M0.i.a(R.string.intercom_failed_delivery, mVar2, 0), new v0(this.$onRetryMessageClicked, this.$item));
            }
            mVar.M();
            C6798l lVar = this.$onSubmitAttribute;
            C6798l lVar2 = this.$onRetryImageClicked;
            BubbleMessageRowKt.BubbleMessageRow(part, groupingPosition, isAdminOrAltParticipant, h10, hourOfDay, lVar, failedAttributeIdentifiers, loadingAttributeIdentifiers, lVar2, failedImageUploadData, failedMessage, this.$onCreateTicket, mVar, 18877448, 0, 0);
            return;
        }
        mVar.I();
    }
}
