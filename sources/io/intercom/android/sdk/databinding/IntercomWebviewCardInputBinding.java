package io.intercom.android.sdk.databinding;

import H3.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AutoCompleteTextView;
import android.widget.FrameLayout;
import io.intercom.android.sdk.R;

public final class IntercomWebviewCardInputBinding {
    public final AutoCompleteTextView input;
    private final FrameLayout rootView;

    private IntercomWebviewCardInputBinding(FrameLayout frameLayout, AutoCompleteTextView autoCompleteTextView) {
        this.rootView = frameLayout;
        this.input = autoCompleteTextView;
    }

    public static IntercomWebviewCardInputBinding bind(View view) {
        int i10 = R.id.input;
        AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) a.a(view, i10);
        if (autoCompleteTextView != null) {
            return new IntercomWebviewCardInputBinding((FrameLayout) view, autoCompleteTextView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static IntercomWebviewCardInputBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, (ViewGroup) null, false);
    }

    public static IntercomWebviewCardInputBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.intercom_webview_card_input, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public FrameLayout getRoot() {
        return this.rootView;
    }
}
