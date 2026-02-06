package io.intercom.android.sdk.databinding;

import H3.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.views.IntercomErrorView;

public final class IntercomErrorSheetBinding {
    public final Button actionButton;
    public final TextView emptyTextSubtitle;
    public final TextView emptyTextTitle;
    public final IntercomErrorView errorLayoutSheet;
    private final IntercomErrorView rootView;

    private IntercomErrorSheetBinding(IntercomErrorView intercomErrorView, Button button, TextView textView, TextView textView2, IntercomErrorView intercomErrorView2) {
        this.rootView = intercomErrorView;
        this.actionButton = button;
        this.emptyTextSubtitle = textView;
        this.emptyTextTitle = textView2;
        this.errorLayoutSheet = intercomErrorView2;
    }

    public static IntercomErrorSheetBinding bind(View view) {
        int i10 = R.id.action_button;
        Button button = (Button) a.a(view, i10);
        if (button != null) {
            i10 = R.id.empty_text_subtitle;
            TextView textView = (TextView) a.a(view, i10);
            if (textView != null) {
                i10 = R.id.empty_text_title;
                TextView textView2 = (TextView) a.a(view, i10);
                if (textView2 != null) {
                    IntercomErrorView intercomErrorView = (IntercomErrorView) view;
                    return new IntercomErrorSheetBinding(intercomErrorView, button, textView, textView2, intercomErrorView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static IntercomErrorSheetBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, (ViewGroup) null, false);
    }

    public static IntercomErrorSheetBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.intercom_error_sheet, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public IntercomErrorView getRoot() {
        return this.rootView;
    }
}
