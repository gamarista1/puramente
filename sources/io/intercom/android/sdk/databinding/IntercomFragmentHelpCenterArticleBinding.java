package io.intercom.android.sdk.databinding;

import H3.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.core.widget.NestedScrollView;
import com.google.android.material.divider.MaterialDivider;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.m5.helpcenter.ui.components.TeamPresenceComponent;
import io.intercom.android.sdk.views.IntercomShimmerLayout;

public final class IntercomFragmentHelpCenterArticleBinding {
    public final LinearLayout articleContents;
    public final TextView articleErrorTextView;
    public final Group articleErrorViews;
    public final IntercomShimmerLayout articleLoadingView;
    public final ConstraintLayout articleParentView;
    public final IntercomViewHelpCenterReactionBinding articleReactions;
    public final View articleReactionsDivider;
    public final TextView articleRetryButton;
    public final NestedScrollView articleScrollview;
    public final TeamPresenceComponent articleTeamHelp;
    public final Toolbar articleToolbar;
    public final MaterialDivider articleToolbarDivider;
    public final WebView articleWebView;
    private final ConstraintLayout rootView;

    private IntercomFragmentHelpCenterArticleBinding(ConstraintLayout constraintLayout, LinearLayout linearLayout, TextView textView, Group group, IntercomShimmerLayout intercomShimmerLayout, ConstraintLayout constraintLayout2, IntercomViewHelpCenterReactionBinding intercomViewHelpCenterReactionBinding, View view, TextView textView2, NestedScrollView nestedScrollView, TeamPresenceComponent teamPresenceComponent, Toolbar toolbar, MaterialDivider materialDivider, WebView webView) {
        this.rootView = constraintLayout;
        this.articleContents = linearLayout;
        this.articleErrorTextView = textView;
        this.articleErrorViews = group;
        this.articleLoadingView = intercomShimmerLayout;
        this.articleParentView = constraintLayout2;
        this.articleReactions = intercomViewHelpCenterReactionBinding;
        this.articleReactionsDivider = view;
        this.articleRetryButton = textView2;
        this.articleScrollview = nestedScrollView;
        this.articleTeamHelp = teamPresenceComponent;
        this.articleToolbar = toolbar;
        this.articleToolbarDivider = materialDivider;
        this.articleWebView = webView;
    }

    public static IntercomFragmentHelpCenterArticleBinding bind(View view) {
        View view2 = view;
        int i10 = R.id.article_contents;
        LinearLayout linearLayout = (LinearLayout) a.a(view2, i10);
        if (linearLayout != null) {
            i10 = R.id.article_error_text_view;
            TextView textView = (TextView) a.a(view2, i10);
            if (textView != null) {
                i10 = R.id.article_error_views;
                Group group = (Group) a.a(view2, i10);
                if (group != null) {
                    i10 = R.id.article_loading_view;
                    IntercomShimmerLayout intercomShimmerLayout = (IntercomShimmerLayout) a.a(view2, i10);
                    if (intercomShimmerLayout != null) {
                        ConstraintLayout constraintLayout = (ConstraintLayout) view2;
                        i10 = R.id.article_reactions;
                        View a10 = a.a(view2, i10);
                        if (a10 != null) {
                            IntercomViewHelpCenterReactionBinding bind = IntercomViewHelpCenterReactionBinding.bind(a10);
                            i10 = R.id.article_reactions_divider;
                            View a11 = a.a(view2, i10);
                            if (a11 != null) {
                                i10 = R.id.article_retry_button;
                                TextView textView2 = (TextView) a.a(view2, i10);
                                if (textView2 != null) {
                                    i10 = R.id.article_scrollview;
                                    NestedScrollView nestedScrollView = (NestedScrollView) a.a(view2, i10);
                                    if (nestedScrollView != null) {
                                        i10 = R.id.article_team_help;
                                        TeamPresenceComponent teamPresenceComponent = (TeamPresenceComponent) a.a(view2, i10);
                                        if (teamPresenceComponent != null) {
                                            i10 = R.id.article_toolbar;
                                            Toolbar toolbar = (Toolbar) a.a(view2, i10);
                                            if (toolbar != null) {
                                                i10 = R.id.article_toolbar_divider;
                                                MaterialDivider materialDivider = (MaterialDivider) a.a(view2, i10);
                                                if (materialDivider != null) {
                                                    i10 = R.id.article_web_view;
                                                    WebView webView = (WebView) a.a(view2, i10);
                                                    if (webView != null) {
                                                        return new IntercomFragmentHelpCenterArticleBinding(constraintLayout, linearLayout, textView, group, intercomShimmerLayout, constraintLayout, bind, a11, textView2, nestedScrollView, teamPresenceComponent, toolbar, materialDivider, webView);
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static IntercomFragmentHelpCenterArticleBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, (ViewGroup) null, false);
    }

    public static IntercomFragmentHelpCenterArticleBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.intercom_fragment_help_center_article, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}
