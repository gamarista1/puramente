package io.intercom.android.sdk.m5.home.ui.header;

import Y.C1500m;
import c1.h;
import io.intercom.android.sdk.m5.home.states.HomeUiState;
import io.intercom.android.sdk.utilities.ColorUtils;
import java.util.ArrayList;
import kotlin.Metadata;
import lf.C6514M;
import mf.C6565s;
import r0.C2544x0;
import r0.C2550z0;
import yf.p;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* renamed from: io.intercom.android.sdk.m5.home.ui.header.ComposableSingletons$HomeHeaderBackdropKt$lambda-2$1  reason: invalid class name */
final class ComposableSingletons$HomeHeaderBackdropKt$lambda2$1 implements p {
    public static final ComposableSingletons$HomeHeaderBackdropKt$lambda2$1 INSTANCE = new ComposableSingletons$HomeHeaderBackdropKt$lambda2$1();

    ComposableSingletons$HomeHeaderBackdropKt$lambda2$1() {
    }

    /* access modifiers changed from: private */
    public static final C6514M invoke$lambda$1() {
        return C6514M.f71813a;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C1500m) obj, ((Number) obj2).intValue());
        return C6514M.f71813a;
    }

    public final void invoke(C1500m mVar, int i10) {
        if ((i10 & 11) != 2 || !mVar.i()) {
            float j10 = h.j((float) 200);
            Iterable<String> q10 = C6565s.q("#142C4D", "#0057FF", "#CAF4F7");
            ArrayList arrayList = new ArrayList(C6565s.y(q10, 10));
            for (String parseColor : q10) {
                arrayList.add(C2544x0.k(C2550z0.b(ColorUtils.parseColor(parseColor))));
            }
            HomeHeaderBackdropKt.m390HomeHeaderBackdroporJrPs(j10, new HomeUiState.Content.ContentHeader.HeaderBackdropStyle.Gradient(arrayList, false), new b(), mVar, 454);
            return;
        }
        mVar.I();
    }
}
