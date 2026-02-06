package io.intercom.android.sdk.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import io.intercom.android.sdk.R;

public final class IntercomBlocksContainerLayoutBinding {
    private final LinearLayout rootView;

    private IntercomBlocksContainerLayoutBinding(LinearLayout linearLayout) {
        this.rootView = linearLayout;
    }

    public static IntercomBlocksContainerLayoutBinding bind(View view) {
        if (view != null) {
            return new IntercomBlocksContainerLayoutBinding((LinearLayout) view);
        }
        throw new NullPointerException("rootView");
    }

    public static IntercomBlocksContainerLayoutBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, (ViewGroup) null, false);
    }

    public static IntercomBlocksContainerLayoutBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.intercom_blocks_container_layout, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public LinearLayout getRoot() {
        return this.rootView;
    }
}
