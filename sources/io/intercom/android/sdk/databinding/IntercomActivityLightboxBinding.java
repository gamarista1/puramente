package io.intercom.android.sdk.databinding;

import H3.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.lightbox.LightBoxImageView;

public final class IntercomActivityLightboxBinding {
    public final LightBoxImageView fullImage;
    public final RelativeLayout rootView;
    private final RelativeLayout rootView_;

    private IntercomActivityLightboxBinding(RelativeLayout relativeLayout, LightBoxImageView lightBoxImageView, RelativeLayout relativeLayout2) {
        this.rootView_ = relativeLayout;
        this.fullImage = lightBoxImageView;
        this.rootView = relativeLayout2;
    }

    public static IntercomActivityLightboxBinding bind(View view) {
        int i10 = R.id.full_image;
        LightBoxImageView lightBoxImageView = (LightBoxImageView) a.a(view, i10);
        if (lightBoxImageView != null) {
            RelativeLayout relativeLayout = (RelativeLayout) view;
            return new IntercomActivityLightboxBinding(relativeLayout, lightBoxImageView, relativeLayout);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static IntercomActivityLightboxBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, (ViewGroup) null, false);
    }

    public static IntercomActivityLightboxBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.intercom_activity_lightbox, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public RelativeLayout getRoot() {
        return this.rootView_;
    }
}
