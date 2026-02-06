package io.intercom.android.sdk.databinding;

import H3.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.views.IntercomToolbar;

public final class IntercomActivitySheetBinding {
    public final IntercomToolbar intercomToolbar;
    private final LinearLayout rootView;
    public final LinearLayout sheetRoot;
    public final FrameLayout sheetView;

    private IntercomActivitySheetBinding(LinearLayout linearLayout, IntercomToolbar intercomToolbar2, LinearLayout linearLayout2, FrameLayout frameLayout) {
        this.rootView = linearLayout;
        this.intercomToolbar = intercomToolbar2;
        this.sheetRoot = linearLayout2;
        this.sheetView = frameLayout;
    }

    public static IntercomActivitySheetBinding bind(View view) {
        int i10 = R.id.intercom_toolbar;
        IntercomToolbar intercomToolbar2 = (IntercomToolbar) a.a(view, i10);
        if (intercomToolbar2 != null) {
            LinearLayout linearLayout = (LinearLayout) view;
            int i11 = R.id.sheet_view;
            FrameLayout frameLayout = (FrameLayout) a.a(view, i11);
            if (frameLayout != null) {
                return new IntercomActivitySheetBinding(linearLayout, intercomToolbar2, linearLayout, frameLayout);
            }
            i10 = i11;
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static IntercomActivitySheetBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, (ViewGroup) null, false);
    }

    public static IntercomActivitySheetBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.intercom_activity_sheet, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public LinearLayout getRoot() {
        return this.rootView;
    }
}
