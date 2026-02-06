package io.intercom.android.sdk.databinding;

import H3.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.compose.ui.platform.ComposeView;
import io.intercom.android.sdk.R;

public final class IntercomPreviewChatSnippetOverlayBinding {
    public final FrameLayout chatAvatarContainer;
    public final FrameLayout chatFullBody;
    public final ComposeView chatSnippetComposeView;
    public final ImageView chatheadAvatar;
    public final ComposeView chatheadAvatarComposeView;
    public final FrameLayout chatheadRoot;
    public final TextView chatheadTextBody;
    public final LinearLayout chatheadTextContainer;
    public final TextView chatheadTextHeader;
    public final CardView parentCard;
    private final FrameLayout rootView;
    public final ComposeView ticketHeaderComposeView;

    private IntercomPreviewChatSnippetOverlayBinding(FrameLayout frameLayout, FrameLayout frameLayout2, FrameLayout frameLayout3, ComposeView composeView, ImageView imageView, ComposeView composeView2, FrameLayout frameLayout4, TextView textView, LinearLayout linearLayout, TextView textView2, CardView cardView, ComposeView composeView3) {
        this.rootView = frameLayout;
        this.chatAvatarContainer = frameLayout2;
        this.chatFullBody = frameLayout3;
        this.chatSnippetComposeView = composeView;
        this.chatheadAvatar = imageView;
        this.chatheadAvatarComposeView = composeView2;
        this.chatheadRoot = frameLayout4;
        this.chatheadTextBody = textView;
        this.chatheadTextContainer = linearLayout;
        this.chatheadTextHeader = textView2;
        this.parentCard = cardView;
        this.ticketHeaderComposeView = composeView3;
    }

    public static IntercomPreviewChatSnippetOverlayBinding bind(View view) {
        int i10 = R.id.chat_avatar_container;
        FrameLayout frameLayout = (FrameLayout) a.a(view, i10);
        if (frameLayout != null) {
            i10 = R.id.chat_full_body;
            FrameLayout frameLayout2 = (FrameLayout) a.a(view, i10);
            if (frameLayout2 != null) {
                i10 = R.id.chat_snippet_compose_view;
                ComposeView composeView = (ComposeView) a.a(view, i10);
                if (composeView != null) {
                    i10 = R.id.chathead_avatar;
                    ImageView imageView = (ImageView) a.a(view, i10);
                    if (imageView != null) {
                        i10 = R.id.chathead_avatar_compose_view;
                        ComposeView composeView2 = (ComposeView) a.a(view, i10);
                        if (composeView2 != null) {
                            FrameLayout frameLayout3 = (FrameLayout) view;
                            i10 = R.id.chathead_text_body;
                            TextView textView = (TextView) a.a(view, i10);
                            if (textView != null) {
                                i10 = R.id.chathead_text_container;
                                LinearLayout linearLayout = (LinearLayout) a.a(view, i10);
                                if (linearLayout != null) {
                                    i10 = R.id.chathead_text_header;
                                    TextView textView2 = (TextView) a.a(view, i10);
                                    if (textView2 != null) {
                                        i10 = R.id.parent_card;
                                        CardView cardView = (CardView) a.a(view, i10);
                                        if (cardView != null) {
                                            i10 = R.id.ticket_header_compose_view;
                                            ComposeView composeView3 = (ComposeView) a.a(view, i10);
                                            if (composeView3 != null) {
                                                return new IntercomPreviewChatSnippetOverlayBinding(frameLayout3, frameLayout, frameLayout2, composeView, imageView, composeView2, frameLayout3, textView, linearLayout, textView2, cardView, composeView3);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static IntercomPreviewChatSnippetOverlayBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, (ViewGroup) null, false);
    }

    public static IntercomPreviewChatSnippetOverlayBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.intercom_preview_chat_snippet_overlay, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public FrameLayout getRoot() {
        return this.rootView;
    }
}
