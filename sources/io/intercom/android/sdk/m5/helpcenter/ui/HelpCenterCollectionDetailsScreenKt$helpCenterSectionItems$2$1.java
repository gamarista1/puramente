package io.intercom.android.sdk.m5.helpcenter.ui;

import C.a0;
import D.c;
import Y.C1500m;
import androidx.compose.foundation.layout.n;
import c1.h;
import io.intercom.android.sdk.m5.helpcenter.states.CollectionDetailsRow;
import io.intercom.android.sdk.m5.helpcenter.ui.components.ArticleRowComponentKt;
import io.intercom.android.sdk.ui.component.IntercomDividerKt;
import java.util.List;
import k0.i;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import lf.C6514M;
import yf.C6798l;
import yf.q;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
final class HelpCenterCollectionDetailsScreenKt$helpCenterSectionItems$2$1 implements q {
    final /* synthetic */ List<CollectionDetailsRow> $collectionDetailsRows;
    final /* synthetic */ int $index;
    final /* synthetic */ CollectionDetailsRow $item;
    final /* synthetic */ C6798l $onArticleClicked;

    HelpCenterCollectionDetailsScreenKt$helpCenterSectionItems$2$1(int i10, CollectionDetailsRow collectionDetailsRow, C6798l lVar, List<? extends CollectionDetailsRow> list) {
        this.$index = i10;
        this.$item = collectionDetailsRow;
        this.$onArticleClicked = lVar;
        this.$collectionDetailsRows = list;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        invoke((c) obj, (C1500m) obj2, ((Number) obj3).intValue());
        return C6514M.f71813a;
    }

    public final void invoke(c cVar, C1500m mVar, int i10) {
        C6496s.h(cVar, "$this$item");
        if ((i10 & 81) != 16 || !mVar.i()) {
            mVar.T(153525508);
            if (this.$index == 0) {
                a0.a(androidx.compose.foundation.layout.q.i(i.f23074a, h.j((float) 16)), mVar, 6);
            }
            mVar.M();
            ArticleRowComponentKt.ArticleRowComponent((i) null, (CollectionDetailsRow.ArticleRow) this.$item, this.$onArticleClicked, mVar, 0, 1);
            if (this.$index != this.$collectionDetailsRows.size() - 1 && (this.$collectionDetailsRows.get(this.$index + 1) instanceof CollectionDetailsRow.ArticleRow)) {
                float f10 = (float) 16;
                IntercomDividerKt.IntercomDivider(n.m(i.f23074a, h.j(f10), 0.0f, h.j(f10), 0.0f, 10, (Object) null), mVar, 6, 0);
                return;
            }
            return;
        }
        mVar.I();
    }
}
