package io.intercom.android.sdk.databinding;

import H3.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.compose.ui.platform.ComposeView;
import io.intercom.android.sdk.R;

public final class IntercomPreviewNotificationBinding {
    public final ComposeView chatSnippetComposeView;
    public final TextView inAppNotificationMessageSummary;
    public final FrameLayout notificationRoot;
    public final CardView parentCard;
    public final ImageView previewAvatar;
    public final ComposeView previewAvatarComposeView;
    public final TextView replyFromTextview;
    private final FrameLayout rootView;
    public final ComposeView ticketHeaderComposeView;

    private IntercomPreviewNotificationBinding(FrameLayout frameLayout, ComposeView composeView, TextView textView, FrameLayout frameLayout2, CardView cardView, ImageView imageView, ComposeView composeView2, TextView textView2, ComposeView composeView3) {
        this.rootView = frameLayout;
        this.chatSnippetComposeView = composeView;
        this.inAppNotificationMessageSummary = textView;
        this.notificationRoot = frameLayout2;
        this.parentCard = cardView;
        this.previewAvatar = imageView;
        this.previewAvatarComposeView = composeView2;
        this.replyFromTextview = textView2;
        this.ticketHeaderComposeView = composeView3;
    }

    public static IntercomPreviewNotificationBinding bind(View view) {
        int i10 = R.id.chat_snippet_compose_view;
        ComposeView composeView = (ComposeView) a.a(view, i10);
        if (composeView != null) {
            i10 = R.id.in_app_notification_message_summary;
            TextView textView = (TextView) a.a(view, i10);
            if (textView != null) {
                FrameLayout frameLayout = (FrameLayout) view;
                i10 = R.id.parent_card;
                CardView cardView = (CardView) a.a(view, i10);
                if (cardView != null) {
                    i10 = R.id.preview_avatar;
                    ImageView imageView = (ImageView) a.a(view, i10);
                    if (imageView != null) {
                        i10 = R.id.preview_avatar_compose_view;
                        ComposeView composeView2 = (ComposeView) a.a(view, i10);
                        if (composeView2 != null) {
                            i10 = R.id.reply_from_textview;
                            TextView textView2 = (TextView) a.a(view, i10);
                            if (textView2 != null) {
                                i10 = R.id.ticket_header_compose_view;
                                ComposeView composeView3 = (ComposeView) a.a(view, i10);
                                if (composeView3 != null) {
                                    return new IntercomPreviewNotificationBinding(frameLayout, composeView, textView, frameLayout, cardView, imageView, composeView2, textView2, composeView3);
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static IntercomPreviewNotificationBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, (ViewGroup) null, false);
    }

    public static IntercomPreviewNotificationBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.intercom_preview_notification, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public FrameLayout getRoot() {
        return this.rootView;
    }
}
