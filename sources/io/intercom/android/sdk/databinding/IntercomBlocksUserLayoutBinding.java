package io.intercom.android.sdk.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import io.intercom.android.sdk.R;

public final class IntercomBlocksUserLayoutBinding {
    private final LinearLayout rootView;

    private IntercomBlocksUserLayoutBinding(LinearLayout linearLayout) {
        this.rootView = linearLayout;
    }

    public static IntercomBlocksUserLayoutBinding bind(View view) {
        if (view != null) {
            return new IntercomBlocksUserLayoutBinding((LinearLayout) view);
        }
        throw new NullPointerException("rootView");
    }

    public static IntercomBlocksUserLayoutBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, (ViewGroup) null, false);
    }

    public static IntercomBlocksUserLayoutBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.intercom_blocks_user_layout, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public LinearLayout getRoot() {
        return this.rootView;
    }
}
