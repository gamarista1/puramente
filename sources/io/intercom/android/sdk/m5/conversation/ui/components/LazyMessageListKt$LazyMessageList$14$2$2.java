package io.intercom.android.sdk.m5.conversation.ui.components;

import io.intercom.android.sdk.m5.conversation.states.ContentRow;
import kotlin.Metadata;
import yf.C6787a;
import yf.C6798l;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
final class LazyMessageListKt$LazyMessageList$14$2$2 implements C6787a {
    final /* synthetic */ ContentRow $item;
    final /* synthetic */ C6798l $onRetryMessageClicked;

    LazyMessageListKt$LazyMessageList$14$2$2(C6798l lVar, ContentRow contentRow) {
        this.$onRetryMessageClicked = lVar;
        this.$item = contentRow;
    }

    public final void invoke() {
        this.$onRetryMessageClicked.invoke(((ContentRow.BubbleMessageRow) this.$item).getPartWrapper().getPart());
    }
}
