package io.intercom.android.sdk.databinding;

import H3.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.views.ContentAwareScrollView;

public final class IntercomFragmentCarouselScreenBinding {
    public final LinearLayout intercomCarouselActionLayout;
    public final FrameLayout intercomCarouselContentContainer;
    public final LinearLayout intercomCarouselFragmentRoot;
    public final View intercomCarouselGradient;
    public final ContentAwareScrollView intercomCarouselScrollView;
    private final LinearLayout rootView;

    private IntercomFragmentCarouselScreenBinding(LinearLayout linearLayout, LinearLayout linearLayout2, FrameLayout frameLayout, LinearLayout linearLayout3, View view, ContentAwareScrollView contentAwareScrollView) {
        this.rootView = linearLayout;
        this.intercomCarouselActionLayout = linearLayout2;
        this.intercomCarouselContentContainer = frameLayout;
        this.intercomCarouselFragmentRoot = linearLayout3;
        this.intercomCarouselGradient = view;
        this.intercomCarouselScrollView = contentAwareScrollView;
    }

    public static IntercomFragmentCarouselScreenBinding bind(View view) {
        int i10 = R.id.intercom_carousel_action_layout;
        LinearLayout linearLayout = (LinearLayout) a.a(view, i10);
        if (linearLayout != null) {
            i10 = R.id.intercom_carousel_content_container;
            FrameLayout frameLayout = (FrameLayout) a.a(view, i10);
            if (frameLayout != null) {
                LinearLayout linearLayout2 = (LinearLayout) view;
                i10 = R.id.intercom_carousel_gradient;
                View a10 = a.a(view, i10);
                if (a10 != null) {
                    i10 = R.id.intercom_carousel_scroll_view;
                    ContentAwareScrollView contentAwareScrollView = (ContentAwareScrollView) a.a(view, i10);
                    if (contentAwareScrollView != null) {
                        return new IntercomFragmentCarouselScreenBinding(linearLayout2, linearLayout, frameLayout, linearLayout2, a10, contentAwareScrollView);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static IntercomFragmentCarouselScreenBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, (ViewGroup) null, false);
    }

    public static IntercomFragmentCarouselScreenBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.intercom_fragment_carousel_screen, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public LinearLayout getRoot() {
        return this.rootView;
    }
}
