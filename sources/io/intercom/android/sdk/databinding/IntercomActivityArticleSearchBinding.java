package io.intercom.android.sdk.databinding;

import H3.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import io.intercom.android.sdk.R;

public final class IntercomActivityArticleSearchBinding {
    public final ComposeView articleSearchComposeView;
    public final ConstraintLayout intercomSearchScreenRoot;
    private final ConstraintLayout rootView;

    private IntercomActivityArticleSearchBinding(ConstraintLayout constraintLayout, ComposeView composeView, ConstraintLayout constraintLayout2) {
        this.rootView = constraintLayout;
        this.articleSearchComposeView = composeView;
        this.intercomSearchScreenRoot = constraintLayout2;
    }

    public static IntercomActivityArticleSearchBinding bind(View view) {
        int i10 = R.id.article_search_compose_view;
        ComposeView composeView = (ComposeView) a.a(view, i10);
        if (composeView != null) {
            ConstraintLayout constraintLayout = (ConstraintLayout) view;
            return new IntercomActivityArticleSearchBinding(constraintLayout, composeView, constraintLayout);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static IntercomActivityArticleSearchBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, (ViewGroup) null, false);
    }

    public static IntercomActivityArticleSearchBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.intercom_activity_article_search, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}
