package io.intercom.android.sdk.databinding;

import H3.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import io.intercom.android.sdk.R;

public final class IntercomCardListBlockBinding {
    public final LinearLayout cardLinks;
    private final FrameLayout rootView;

    private IntercomCardListBlockBinding(FrameLayout frameLayout, LinearLayout linearLayout) {
        this.rootView = frameLayout;
        this.cardLinks = linearLayout;
    }

    public static IntercomCardListBlockBinding bind(View view) {
        int i10 = R.id.card_links;
        LinearLayout linearLayout = (LinearLayout) a.a(view, i10);
        if (linearLayout != null) {
            return new IntercomCardListBlockBinding((FrameLayout) view, linearLayout);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static IntercomCardListBlockBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, (ViewGroup) null, false);
    }

    public static IntercomCardListBlockBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.intercom_card_list_block, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public FrameLayout getRoot() {
        return this.rootView;
    }
}
