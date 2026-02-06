package io.intercom.android.sdk.databinding;

import H3.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import io.intercom.android.sdk.R;

public final class IntercomContainerLayoutBinding {
    public final LinearLayout cellLayout;
    public final ProgressBar progressBar;
    private final FrameLayout rootView;

    private IntercomContainerLayoutBinding(FrameLayout frameLayout, LinearLayout linearLayout, ProgressBar progressBar2) {
        this.rootView = frameLayout;
        this.cellLayout = linearLayout;
        this.progressBar = progressBar2;
    }

    public static IntercomContainerLayoutBinding bind(View view) {
        int i10 = R.id.cellLayout;
        LinearLayout linearLayout = (LinearLayout) a.a(view, i10);
        if (linearLayout != null) {
            i10 = R.id.progressBar;
            ProgressBar progressBar2 = (ProgressBar) a.a(view, i10);
            if (progressBar2 != null) {
                return new IntercomContainerLayoutBinding((FrameLayout) view, linearLayout, progressBar2);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static IntercomContainerLayoutBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, (ViewGroup) null, false);
    }

    public static IntercomContainerLayoutBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.intercom_container_layout, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public FrameLayout getRoot() {
        return this.rootView;
    }
}
