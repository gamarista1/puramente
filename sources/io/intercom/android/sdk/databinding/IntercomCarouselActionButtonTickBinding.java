package io.intercom.android.sdk.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import io.intercom.android.sdk.R;

public final class IntercomCarouselActionButtonTickBinding {
    private final ImageView rootView;

    private IntercomCarouselActionButtonTickBinding(ImageView imageView) {
        this.rootView = imageView;
    }

    public static IntercomCarouselActionButtonTickBinding bind(View view) {
        if (view != null) {
            return new IntercomCarouselActionButtonTickBinding((ImageView) view);
        }
        throw new NullPointerException("rootView");
    }

    public static IntercomCarouselActionButtonTickBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, (ViewGroup) null, false);
    }

    public static IntercomCarouselActionButtonTickBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.intercom_carousel_action_button_tick, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public ImageView getRoot() {
        return this.rootView;
    }
}
