package io.intercom.android.sdk.m5.components;

import Y.C1500m;
import io.intercom.android.sdk.models.PoweredBy;
import k0.i;
import kotlin.Metadata;
import lf.C6514M;
import r0.C2544x0;
import yf.p;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* renamed from: io.intercom.android.sdk.m5.components.ComposableSingletons$PoweredByBadgeKt$lambda-3$1  reason: invalid class name */
final class ComposableSingletons$PoweredByBadgeKt$lambda3$1 implements p {
    public static final ComposableSingletons$PoweredByBadgeKt$lambda3$1 INSTANCE = new ComposableSingletons$PoweredByBadgeKt$lambda3$1();

    ComposableSingletons$PoweredByBadgeKt$lambda3$1() {
    }

    /* access modifiers changed from: private */
    public static final C6514M invoke$lambda$0() {
        return C6514M.f71813a;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C1500m) obj, ((Number) obj2).intValue());
        return C6514M.f71813a;
    }

    public final void invoke(C1500m mVar, int i10) {
        if ((i10 & 11) != 2 || !mVar.i()) {
            PoweredByBadgeKt.m205PoweredByBadgewBJOh4Y("Powered by Fin Ai Agent", PoweredBy.PoweredByIconType.FIN, new D(), (i) null, C2544x0.f25560b.g(), 0, mVar, 25014, 40);
            return;
        }
        mVar.I();
    }
}
