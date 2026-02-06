package io.intercom.android.sdk.m5.helpcenter.ui;

import D.c;
import Y.C1500m;
import io.intercom.android.sdk.m5.helpcenter.states.CollectionDetailsRow;
import io.intercom.android.sdk.m5.helpcenter.ui.components.CollectionRowComponentKt;
import k0.i;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import lf.C6514M;
import yf.C6798l;
import yf.q;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
final class HelpCenterCollectionDetailsScreenKt$helpCenterSectionItems$2$2 implements q {
    final /* synthetic */ CollectionDetailsRow $item;
    final /* synthetic */ C6798l $onCollectionClicked;

    HelpCenterCollectionDetailsScreenKt$helpCenterSectionItems$2$2(CollectionDetailsRow collectionDetailsRow, C6798l lVar) {
        this.$item = collectionDetailsRow;
        this.$onCollectionClicked = lVar;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        invoke((c) obj, (C1500m) obj2, ((Number) obj3).intValue());
        return C6514M.f71813a;
    }

    public final void invoke(c cVar, C1500m mVar, int i10) {
        C6496s.h(cVar, "$this$item");
        if ((i10 & 81) != 16 || !mVar.i()) {
            CollectionRowComponentKt.CollectionRowComponent(((CollectionDetailsRow.CollectionRow) this.$item).getRowData(), this.$onCollectionClicked, (i) null, mVar, 0, 4);
        } else {
            mVar.I();
        }
    }
}
