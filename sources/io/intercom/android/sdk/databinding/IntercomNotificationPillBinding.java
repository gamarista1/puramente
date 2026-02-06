package io.intercom.android.sdk.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import io.intercom.android.sdk.R;

public final class IntercomNotificationPillBinding {
    public final TextView notificationPill;
    private final TextView rootView;

    private IntercomNotificationPillBinding(TextView textView, TextView textView2) {
        this.rootView = textView;
        this.notificationPill = textView2;
    }

    public static IntercomNotificationPillBinding bind(View view) {
        if (view != null) {
            TextView textView = (TextView) view;
            return new IntercomNotificationPillBinding(textView, textView);
        }
        throw new NullPointerException("rootView");
    }

    public static IntercomNotificationPillBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, (ViewGroup) null, false);
    }

    public static IntercomNotificationPillBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.intercom_notification_pill, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public TextView getRoot() {
        return this.rootView;
    }
}
