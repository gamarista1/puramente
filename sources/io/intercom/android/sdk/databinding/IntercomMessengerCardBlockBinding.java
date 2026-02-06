package io.intercom.android.sdk.databinding;

import H3.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import io.intercom.android.sdk.R;

public final class IntercomMessengerCardBlockBinding {
    public final ProgressBar loadingView;
    private final FrameLayout rootView;

    private IntercomMessengerCardBlockBinding(FrameLayout frameLayout, ProgressBar progressBar) {
        this.rootView = frameLayout;
        this.loadingView = progressBar;
    }

    public static IntercomMessengerCardBlockBinding bind(View view) {
        int i10 = R.id.loading_view;
        ProgressBar progressBar = (ProgressBar) a.a(view, i10);
        if (progressBar != null) {
            return new IntercomMessengerCardBlockBinding((FrameLayout) view, progressBar);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static IntercomMessengerCardBlockBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, (ViewGroup) null, false);
    }

    public static IntercomMessengerCardBlockBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.intercom_messenger_card_block, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public FrameLayout getRoot() {
        return this.rootView;
    }
}
