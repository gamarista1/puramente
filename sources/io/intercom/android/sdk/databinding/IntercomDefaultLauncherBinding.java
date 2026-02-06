package io.intercom.android.sdk.databinding;

import H3.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.TextView;
import io.intercom.android.sdk.R;

public final class IntercomDefaultLauncherBinding {
    public final TextView launcherBadgeCount;
    public final ImageButton launcherIcon;
    public final FrameLayout launcherRoot;
    private final FrameLayout rootView;

    private IntercomDefaultLauncherBinding(FrameLayout frameLayout, TextView textView, ImageButton imageButton, FrameLayout frameLayout2) {
        this.rootView = frameLayout;
        this.launcherBadgeCount = textView;
        this.launcherIcon = imageButton;
        this.launcherRoot = frameLayout2;
    }

    public static IntercomDefaultLauncherBinding bind(View view) {
        int i10 = R.id.launcher_badge_count;
        TextView textView = (TextView) a.a(view, i10);
        if (textView != null) {
            i10 = R.id.launcher_icon;
            ImageButton imageButton = (ImageButton) a.a(view, i10);
            if (imageButton != null) {
                FrameLayout frameLayout = (FrameLayout) view;
                return new IntercomDefaultLauncherBinding(frameLayout, textView, imageButton, frameLayout);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static IntercomDefaultLauncherBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, (ViewGroup) null, false);
    }

    public static IntercomDefaultLauncherBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.intercom_default_launcher, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public FrameLayout getRoot() {
        return this.rootView;
    }
}
