package io.intercom.android.sdk.m5.helpcenter.ui;

import D.c;
import M0.i;
import V.T0;
import V0.p;
import Y.C1500m;
import android.content.Context;
import androidx.compose.foundation.layout.n;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import b1.j;
import b1.k;
import c1.h;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.m5.helpcenter.states.CollectionsRow;
import io.intercom.android.sdk.m5.helpcenter.states.CollectionsUiState;
import io.intercom.android.sdk.ui.component.IntercomDividerKt;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import io.intercom.android.sdk.utilities.Phrase;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import lf.C6514M;
import yf.C6798l;
import yf.q;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
final class HelpCenterCollectionsScreenKt$helpCenterCollectionItems$1 implements q {
    final /* synthetic */ CollectionsUiState.Content $state;

    HelpCenterCollectionsScreenKt$helpCenterCollectionItems$1(CollectionsUiState.Content content) {
        this.$state = content;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        invoke((c) obj, (C1500m) obj2, ((Number) obj3).intValue());
        return C6514M.f71813a;
    }

    public final void invoke(c cVar, C1500m mVar, int i10) {
        String obj;
        C1500m mVar2 = mVar;
        C6496s.h(cVar, "$this$item");
        if ((i10 & 81) != 16 || !mVar.i()) {
            ArrayList arrayList = new ArrayList();
            for (Object next : this.$state.getCollections()) {
                if (!(((CollectionsRow) next) instanceof CollectionsRow.SendMessageRow)) {
                    arrayList.add(next);
                }
            }
            int size = arrayList.size();
            if (size == 1) {
                mVar2.T(765329843);
                obj = i.a(R.string.intercom_single_collection, mVar2, 0);
                mVar.M();
            } else {
                mVar2.T(765428144);
                obj = Phrase.from((Context) mVar2.m(AndroidCompositionLocals_androidKt.g()), R.string.intercom_multiple_collections).put("total_collection", size).format().toString();
                mVar.M();
            }
            T0.b(obj, n.i(androidx.compose.foundation.layout.q.h(k0.i.f23074a, 0.0f, 1, (Object) null), h.j((float) 16)), 0, 0, (V0.n) null, (p) null, (V0.h) null, 0, (k) null, (j) null, 0, 0, false, 0, 0, (C6798l) null, IntercomTheme.INSTANCE.getTypography(mVar2, IntercomTheme.$stable).getType04SemiBold(), mVar, 48, 0, 65532);
            IntercomDividerKt.IntercomDivider((k0.i) null, mVar, 0, 1);
            return;
        }
        mVar.I();
    }
}
