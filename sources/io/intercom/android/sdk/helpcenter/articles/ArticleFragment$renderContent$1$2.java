package io.intercom.android.sdk.helpcenter.articles;

import androidx.constraintlayout.motion.widget.MotionLayout;
import io.intercom.android.sdk.databinding.IntercomFragmentHelpCenterArticleBinding;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;

@Metadata(d1 = {"\u0000/\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J)\u0010\b\u001a\u00020\u00072\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\b\u0010\tJ1\u0010\f\u001a\u00020\u00072\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u000e\u001a\u00020\u00072\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ1\u0010\u0011\u001a\u00020\u00072\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"io/intercom/android/sdk/helpcenter/articles/ArticleFragment$renderContent$1$2", "Landroidx/constraintlayout/motion/widget/MotionLayout$i;", "Landroidx/constraintlayout/motion/widget/MotionLayout;", "p0", "", "p1", "p2", "Llf/M;", "onTransitionStarted", "(Landroidx/constraintlayout/motion/widget/MotionLayout;II)V", "", "p3", "onTransitionChange", "(Landroidx/constraintlayout/motion/widget/MotionLayout;IIF)V", "onTransitionCompleted", "(Landroidx/constraintlayout/motion/widget/MotionLayout;I)V", "", "onTransitionTrigger", "(Landroidx/constraintlayout/motion/widget/MotionLayout;IZF)V", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ArticleFragment$renderContent$1$2 implements MotionLayout.i {
    final /* synthetic */ IntercomFragmentHelpCenterArticleBinding $this_with;

    ArticleFragment$renderContent$1$2(IntercomFragmentHelpCenterArticleBinding intercomFragmentHelpCenterArticleBinding) {
        this.$this_with = intercomFragmentHelpCenterArticleBinding;
    }

    /* access modifiers changed from: private */
    public static final void onTransitionCompleted$lambda$0(IntercomFragmentHelpCenterArticleBinding intercomFragmentHelpCenterArticleBinding, ArticleFragment$renderContent$1$2 articleFragment$renderContent$1$2) {
        C6496s.h(intercomFragmentHelpCenterArticleBinding, "$this_with");
        C6496s.h(articleFragment$renderContent$1$2, "this$0");
        intercomFragmentHelpCenterArticleBinding.articleScrollview.W(0, intercomFragmentHelpCenterArticleBinding.articleTeamHelp.getBottom());
        intercomFragmentHelpCenterArticleBinding.articleReactions.motionLayout.y0(articleFragment$renderContent$1$2);
    }

    public void onTransitionChange(MotionLayout motionLayout, int i10, int i11, float f10) {
    }

    public void onTransitionCompleted(MotionLayout motionLayout, int i10) {
        IntercomFragmentHelpCenterArticleBinding intercomFragmentHelpCenterArticleBinding = this.$this_with;
        intercomFragmentHelpCenterArticleBinding.articleScrollview.post(new C6011k(intercomFragmentHelpCenterArticleBinding, this));
    }

    public void onTransitionStarted(MotionLayout motionLayout, int i10, int i11) {
    }

    public void onTransitionTrigger(MotionLayout motionLayout, int i10, boolean z10, float f10) {
    }
}
