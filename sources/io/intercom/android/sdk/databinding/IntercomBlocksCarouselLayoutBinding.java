package io.intercom.android.sdk.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import io.intercom.android.sdk.R;

public final class IntercomBlocksCarouselLayoutBinding {
    private final LinearLayout rootView;

    private IntercomBlocksCarouselLayoutBinding(LinearLayout linearLayout) {
        this.rootView = linearLayout;
    }

    public static IntercomBlocksCarouselLayoutBinding bind(View view) {
        if (view != null) {
            return new IntercomBlocksCarouselLayoutBinding((LinearLayout) view);
        }
        throw new NullPointerException("rootView");
    }

    public static IntercomBlocksCarouselLayoutBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, (ViewGroup) null, false);
    }

    public static IntercomBlocksCarouselLayoutBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.intercom_blocks_carousel_layout, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public LinearLayout getRoot() {
        return this.rootView;
    }
}
