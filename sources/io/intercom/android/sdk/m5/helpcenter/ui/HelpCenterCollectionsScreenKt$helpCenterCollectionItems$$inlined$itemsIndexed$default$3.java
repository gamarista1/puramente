package io.intercom.android.sdk.m5.helpcenter.ui;

import D.c;
import Y.C1500m;
import Y.C1506p;
import androidx.compose.foundation.layout.n;
import c1.h;
import io.intercom.android.sdk.m5.helpcenter.states.CollectionsRow;
import io.intercom.android.sdk.m5.helpcenter.ui.components.BrowseAllHelpTopicsComponentKt;
import io.intercom.android.sdk.m5.helpcenter.ui.components.CollectionRowComponentKt;
import io.intercom.android.sdk.m5.helpcenter.ui.components.TeamPresenceButtonStyle;
import io.intercom.android.sdk.m5.helpcenter.ui.components.TeamPresenceComponentKt;
import java.util.List;
import k0.i;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.C6498u;
import lf.C6514M;
import lf.C6535s;
import yf.C6798l;
import yf.r;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u000b¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "LD/c;", "", "it", "Llf/M;", "invoke", "(LD/c;ILY/m;I)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
public final class HelpCenterCollectionsScreenKt$helpCenterCollectionItems$$inlined$itemsIndexed$default$3 extends C6498u implements r {
    final /* synthetic */ List $items;
    final /* synthetic */ C6798l $onCollectionClick$inlined;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public HelpCenterCollectionsScreenKt$helpCenterCollectionItems$$inlined$itemsIndexed$default$3(List list, C6798l lVar) {
        super(4);
        this.$items = list;
        this.$onCollectionClick$inlined = lVar;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        invoke((c) obj, ((Number) obj2).intValue(), (C1500m) obj3, ((Number) obj4).intValue());
        return C6514M.f71813a;
    }

    public final void invoke(c cVar, int i10, C1500m mVar, int i11) {
        int i12;
        if ((i11 & 6) == 0) {
            i12 = (mVar.S(cVar) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= mVar.d(i10) ? 32 : 16;
        }
        if ((i12 & 147) != 146 || !mVar.i()) {
            if (C1506p.H()) {
                C1506p.Q(-1091073711, i12, -1, "androidx.compose.foundation.lazy.itemsIndexed.<anonymous> (LazyDsl.kt:188)");
            }
            CollectionsRow collectionsRow = (CollectionsRow) this.$items.get(i10);
            mVar.T(766027716);
            if (C6496s.c(collectionsRow, CollectionsRow.FullHelpCenterRow.INSTANCE)) {
                mVar.T(766073285);
                BrowseAllHelpTopicsComponentKt.BrowseAllHelpTopicsComponent(n.m(i.f23074a, 0.0f, h.j((float) 24), 0.0f, 0.0f, 13, (Object) null), mVar, 6, 0);
                mVar.M();
            } else if (collectionsRow instanceof CollectionsRow.SendMessageRow) {
                mVar.T(766223604);
                TeamPresenceComponentKt.TeamPresenceComponent(((CollectionsRow.SendMessageRow) collectionsRow).getTeamPresenceState(), false, (TeamPresenceButtonStyle) null, mVar, 48, 4);
                mVar.M();
            } else if (collectionsRow instanceof CollectionsRow.CollectionRow) {
                mVar.T(766388896);
                CollectionRowComponentKt.CollectionRowComponent(((CollectionsRow.CollectionRow) collectionsRow).getRowData(), this.$onCollectionClick$inlined, (i) null, mVar, 0, 4);
                mVar.M();
            } else if (C6496s.c(collectionsRow, CollectionsRow.BrowseAllHelpTopicsAsListRow.INSTANCE)) {
                mVar.T(766553072);
                BrowseAllHelpTopicsComponentKt.BrowseAllHelpTopicsAsItem((i) null, mVar, 0, 1);
                mVar.M();
            } else {
                mVar.T(-390931425);
                mVar.M();
                throw new C6535s();
            }
            mVar.M();
            if (C1506p.H()) {
                C1506p.P();
                return;
            }
            return;
        }
        mVar.I();
    }
}
