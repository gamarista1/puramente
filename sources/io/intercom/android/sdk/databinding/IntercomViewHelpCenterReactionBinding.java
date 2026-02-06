package io.intercom.android.sdk.databinding;

import H3.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.motion.widget.MotionLayout;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.helpcenter.utils.views.GrayscaleImageView;

public final class IntercomViewHelpCenterReactionBinding {
    public final GrayscaleImageView intercomReactionHappy;
    public final GrayscaleImageView intercomReactionNeutral;
    public final GrayscaleImageView intercomReactionSad;
    public final TextView intercomReactionTitle;
    public final MotionLayout motionLayout;
    private final MotionLayout rootView;

    private IntercomViewHelpCenterReactionBinding(MotionLayout motionLayout2, GrayscaleImageView grayscaleImageView, GrayscaleImageView grayscaleImageView2, GrayscaleImageView grayscaleImageView3, TextView textView, MotionLayout motionLayout3) {
        this.rootView = motionLayout2;
        this.intercomReactionHappy = grayscaleImageView;
        this.intercomReactionNeutral = grayscaleImageView2;
        this.intercomReactionSad = grayscaleImageView3;
        this.intercomReactionTitle = textView;
        this.motionLayout = motionLayout3;
    }

    public static IntercomViewHelpCenterReactionBinding bind(View view) {
        int i10 = R.id.intercom_reaction_happy;
        GrayscaleImageView grayscaleImageView = (GrayscaleImageView) a.a(view, i10);
        if (grayscaleImageView != null) {
            i10 = R.id.intercom_reaction_neutral;
            GrayscaleImageView grayscaleImageView2 = (GrayscaleImageView) a.a(view, i10);
            if (grayscaleImageView2 != null) {
                i10 = R.id.intercom_reaction_sad;
                GrayscaleImageView grayscaleImageView3 = (GrayscaleImageView) a.a(view, i10);
                if (grayscaleImageView3 != null) {
                    i10 = R.id.intercom_reaction_title;
                    TextView textView = (TextView) a.a(view, i10);
                    if (textView != null) {
                        MotionLayout motionLayout2 = (MotionLayout) view;
                        return new IntercomViewHelpCenterReactionBinding(motionLayout2, grayscaleImageView, grayscaleImageView2, grayscaleImageView3, textView, motionLayout2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static IntercomViewHelpCenterReactionBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, (ViewGroup) null, false);
    }

    public static IntercomViewHelpCenterReactionBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.intercom_view_help_center_reaction, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public MotionLayout getRoot() {
        return this.rootView;
    }
}
