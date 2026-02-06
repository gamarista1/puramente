package io.intercom.android.sdk.databinding;

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

public final class IntercomPreviewChatFullOverlayBinding {
    public final FrameLayout chatAvatarContainer;
    public final FrameLayout chatFullBody;
    public final View chatOverlayOverflowFade;
    public final ImageView chatheadAvatar;
    public final ComposeView chatheadAvatarComposeView;
    public final FrameLayout chatheadRoot;
    public final LinearLayout chatheadTextContainer;
    public final TextView chatheadTextHeader;
    public final CardView parentCard;
    private final FrameLayout rootView;

    private IntercomPreviewChatFullOverlayBinding(FrameLayout frameLayout, FrameLayout frameLayout2, FrameLayout frameLayout3, View view, ImageView imageView, ComposeView composeView, FrameLayout frameLayout4, LinearLayout linearLayout, TextView textView, CardView cardView) {
        this.rootView = frameLayout;
        this.chatAvatarContainer = frameLayout2;
        this.chatFullBody = frameLayout3;
        this.chatOverlayOverflowFade = view;
        this.chatheadAvatar = imageView;
        this.chatheadAvatarComposeView = composeView;
        this.chatheadRoot = frameLayout4;
        this.chatheadTextContainer = linearLayout;
        this.chatheadTextHeader = textView;
        this.parentCard = cardView;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0016, code lost:
        r0 = io.intercom.android.sdk.R.id.chat_overlay_overflow_fade;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static io.intercom.android.sdk.databinding.IntercomPreviewChatFullOverlayBinding bind(android.view.View r13) {
        /*
            int r0 = io.intercom.android.sdk.R.id.chat_avatar_container
            android.view.View r1 = H3.a.a(r13, r0)
            r4 = r1
            android.widget.FrameLayout r4 = (android.widget.FrameLayout) r4
            if (r4 == 0) goto L_0x0060
            int r0 = io.intercom.android.sdk.R.id.chat_full_body
            android.view.View r1 = H3.a.a(r13, r0)
            r5 = r1
            android.widget.FrameLayout r5 = (android.widget.FrameLayout) r5
            if (r5 == 0) goto L_0x0060
            int r0 = io.intercom.android.sdk.R.id.chat_overlay_overflow_fade
            android.view.View r6 = H3.a.a(r13, r0)
            if (r6 == 0) goto L_0x0060
            int r0 = io.intercom.android.sdk.R.id.chathead_avatar
            android.view.View r1 = H3.a.a(r13, r0)
            r7 = r1
            android.widget.ImageView r7 = (android.widget.ImageView) r7
            if (r7 == 0) goto L_0x0060
            int r0 = io.intercom.android.sdk.R.id.chathead_avatar_compose_view
            android.view.View r1 = H3.a.a(r13, r0)
            r8 = r1
            androidx.compose.ui.platform.ComposeView r8 = (androidx.compose.ui.platform.ComposeView) r8
            if (r8 == 0) goto L_0x0060
            r9 = r13
            android.widget.FrameLayout r9 = (android.widget.FrameLayout) r9
            int r0 = io.intercom.android.sdk.R.id.chathead_text_container
            android.view.View r1 = H3.a.a(r13, r0)
            r10 = r1
            android.widget.LinearLayout r10 = (android.widget.LinearLayout) r10
            if (r10 == 0) goto L_0x0060
            int r0 = io.intercom.android.sdk.R.id.chathead_text_header
            android.view.View r1 = H3.a.a(r13, r0)
            r11 = r1
            android.widget.TextView r11 = (android.widget.TextView) r11
            if (r11 == 0) goto L_0x0060
            int r0 = io.intercom.android.sdk.R.id.parent_card
            android.view.View r1 = H3.a.a(r13, r0)
            r12 = r1
            androidx.cardview.widget.CardView r12 = (androidx.cardview.widget.CardView) r12
            if (r12 == 0) goto L_0x0060
            io.intercom.android.sdk.databinding.IntercomPreviewChatFullOverlayBinding r13 = new io.intercom.android.sdk.databinding.IntercomPreviewChatFullOverlayBinding
            r2 = r13
            r3 = r9
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            return r13
        L_0x0060:
            android.content.res.Resources r13 = r13.getResources()
            java.lang.String r13 = r13.getResourceName(r0)
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "Missing required view with ID: "
            java.lang.String r13 = r1.concat(r13)
            r0.<init>(r13)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: io.intercom.android.sdk.databinding.IntercomPreviewChatFullOverlayBinding.bind(android.view.View):io.intercom.android.sdk.databinding.IntercomPreviewChatFullOverlayBinding");
    }

    public static IntercomPreviewChatFullOverlayBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, (ViewGroup) null, false);
    }

    public static IntercomPreviewChatFullOverlayBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.intercom_preview_chat_full_overlay, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public FrameLayout getRoot() {
        return this.rootView;
    }
}
