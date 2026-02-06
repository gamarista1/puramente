package io.intercom.android.sdk.overlay;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.compose.ui.platform.ComposeView;
import io.intercom.android.sdk.Provider;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.identity.AppConfig;
import io.intercom.android.sdk.m5.notification.InAppNotificationCardKt;
import io.intercom.android.sdk.models.Conversation;
import io.intercom.android.sdk.models.Part;
import io.intercom.android.sdk.overlay.InAppNotification;
import io.intercom.android.sdk.utilities.AvatarUtils;
import io.intercom.android.sdk.utilities.commons.ScreenUtils;

class ChatSnippet extends ChatNotification {
    private TextView contentBody;

    public ChatSnippet(Context context, Conversation conversation, int i10, int i11, InAppNotification.Listener listener, Provider<AppConfig> provider) {
        super(context, conversation, i10, i11, listener, provider);
    }

    private void setBodyText(Part part) {
        if (part.getSummary().isEmpty()) {
            this.contentBody.setText(this.localisedContext.getString(R.string.intercom_image_attached));
        } else if (part.getEventData().getCustomStatePrefix() == null || part.getEventData().getCustomStatePrefix().isEmpty()) {
            this.contentBody.setText(part.getSummary());
        } else {
            this.contentBody.setText(part.getEventData().getCustomStatePrefix());
        }
    }

    /* access modifiers changed from: protected */
    public View getContentContainer() {
        return this.overlayRoot.findViewById(R.id.chathead_text_body);
    }

    /* access modifiers changed from: protected */
    public ViewGroup inflateChatRootView(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        ViewGroup viewGroup2 = (ViewGroup) layoutInflater.inflate(R.layout.intercom_preview_chat_snippet_overlay, viewGroup, false);
        this.contentBody = (TextView) viewGroup2.findViewById(R.id.chathead_text_body);
        return viewGroup2;
    }

    public void update(Conversation conversation, Runnable runnable) {
        this.conversation = conversation;
        View findViewById = this.overlayRoot.findViewById(R.id.chathead_text_body);
        View findViewById2 = this.overlayRoot.findViewById(R.id.chathead_text_container);
        findViewById2.setPivotX(0.0f);
        performReplyPulse(findViewById2, findViewById, runnable);
    }

    /* access modifiers changed from: protected */
    public void updateContentContainer(Part part) {
        setBodyText(part);
    }

    /* access modifiers changed from: protected */
    public void updateViewDataDuringReplyPulse(int i10) {
        Part lastPart = this.conversation.lastPart();
        ImageView imageView = (ImageView) this.overlayRoot.findViewById(R.id.chathead_avatar);
        AvatarUtils.loadAvatarIntoView(this.conversation.lastAdmin().getAvatar(), imageView, this.appConfigProvider.get());
        TextView textView = (TextView) this.overlayRoot.findViewById(R.id.chathead_text_header);
        textView.setText(getHeaderText());
        setBodyText(lastPart);
        CardView cardView = (CardView) this.overlayRoot.findViewById(R.id.parent_card);
        if (cardView != null) {
            cardView.setRadius((float) ScreenUtils.dpToPx(20.0f, cardView.getContext()));
        }
        ComposeView composeView = (ComposeView) this.overlayRoot.findViewById(R.id.ticket_header_compose_view);
        if (!ComposeCompatibilityUtilKt.isLegacyActivity(composeView)) {
            InAppNotificationCardKt.addTicketHeaderToCompose(composeView, this.conversation);
            if (this.conversation.getTicket() != null) {
                textView.setVisibility(8);
                composeView.setVisibility(0);
            } else {
                textView.setVisibility(0);
                composeView.setVisibility(8);
            }
            ComposeView composeView2 = (ComposeView) this.overlayRoot.findViewById(R.id.chathead_avatar_compose_view);
            if (composeView2 != null && !ComposeCompatibilityUtilKt.isLegacyActivity(composeView2)) {
                ComposeCompatibilityUtilKt.addAvatarIconToCompose(composeView2, lastPart.getParticipant(), this.appConfigProvider.get());
                imageView.setVisibility(8);
                composeView2.setVisibility(0);
            }
        }
    }
}
