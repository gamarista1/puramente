package io.intercom.android.sdk.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import io.intercom.android.sdk.R;

public final class IntercomBlocksAdminLayoutBinding {
    private final LinearLayout rootView;

    private IntercomBlocksAdminLayoutBinding(LinearLayout linearLayout) {
        this.rootView = linearLayout;
    }

    public static IntercomBlocksAdminLayoutBinding bind(View view) {
        if (view != null) {
            return new IntercomBlocksAdminLayoutBinding((LinearLayout) view);
        }
        throw new NullPointerException("rootView");
    }

    public static IntercomBlocksAdminLayoutBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, (ViewGroup) null, false);
    }

    public static IntercomBlocksAdminLayoutBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.intercom_blocks_admin_layout, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public LinearLayout getRoot() {
        return this.rootView;
    }
}
