package io.intercom.android.sdk.helpcenter.search;

import D.c;
import Y.C1500m;
import io.intercom.android.sdk.helpcenter.search.ArticleSearchResultRow;
import io.intercom.android.sdk.helpcenter.search.ArticleSearchState;
import io.intercom.android.sdk.m5.helpcenter.ui.components.ArticleResultRowComponentKt;
import io.intercom.android.sdk.m5.helpcenter.ui.components.TeamPresenceButtonStyle;
import io.intercom.android.sdk.m5.helpcenter.ui.components.TeamPresenceComponentKt;
import k0.i;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import lf.C6514M;
import lf.C6535s;
import yf.C6798l;
import yf.r;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
final class IntercomArticleSearchScreenKt$IntercomArticleSearchScreen$1$1$1$1 implements r {
    final /* synthetic */ C6798l $onArticleClicked;
    final /* synthetic */ ArticleSearchState $state;

    IntercomArticleSearchScreenKt$IntercomArticleSearchScreen$1$1$1$1(ArticleSearchState articleSearchState, C6798l lVar) {
        this.$state = articleSearchState;
        this.$onArticleClicked = lVar;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        invoke((c) obj, ((Number) obj2).intValue(), (C1500m) obj3, ((Number) obj4).intValue());
        return C6514M.f71813a;
    }

    public final void invoke(c cVar, int i10, C1500m mVar, int i11) {
        C6496s.h(cVar, "$this$items");
        if ((i11 & 112) == 0) {
            i11 |= mVar.d(i10) ? 32 : 16;
        }
        if ((i11 & 721) != 144 || !mVar.i()) {
            ArticleSearchResultRow articleSearchResultRow = ((ArticleSearchState.Content) this.$state).getSearchResults().get(i10);
            if (articleSearchResultRow instanceof ArticleSearchResultRow.ArticleResultRow) {
                mVar.T(-1577698623);
                ArticleResultRowComponentKt.ArticleResultRowComponent((ArticleSearchResultRow.ArticleResultRow) articleSearchResultRow, this.$onArticleClicked, (i) null, mVar, 0, 4);
                mVar.M();
            } else if (articleSearchResultRow instanceof ArticleSearchResultRow.TeammateHelpRow) {
                mVar.T(-1577693088);
                TeamPresenceComponentKt.TeamPresenceComponent(((ArticleSearchResultRow.TeammateHelpRow) articleSearchResultRow).getTeamPresenceState(), false, (TeamPresenceButtonStyle) null, mVar, 0, 6);
                mVar.M();
            } else {
                mVar.T(-1577703168);
                mVar.M();
                throw new C6535s();
            }
        } else {
            mVar.I();
        }
    }
}
