package io.intercom.android.sdk.m5.components;

import Y.C1500m;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.m5.components.avatar.AvatarWrapper;
import io.intercom.android.sdk.models.Avatar;
import java.util.List;
import k0.i;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lf.C6514M;
import mf.C6565s;
import yf.C6787a;
import yf.p;
import yf.q;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* renamed from: io.intercom.android.sdk.m5.components.ComposableSingletons$TopActionBarKt$lambda-3$1  reason: invalid class name */
final class ComposableSingletons$TopActionBarKt$lambda3$1 implements p {
    public static final ComposableSingletons$TopActionBarKt$lambda3$1 INSTANCE = new ComposableSingletons$TopActionBarKt$lambda3$1();

    ComposableSingletons$TopActionBarKt$lambda3$1() {
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
            Avatar create = Avatar.create("", "HC");
            C6496s.g(create, "create(...)");
            AvatarWrapper avatarWrapper = new AvatarWrapper(create, false, 2, (DefaultConstructorMarker) null);
            Avatar create2 = Avatar.create("", "AA");
            C6496s.g(create2, "create(...)");
            AvatarWrapper avatarWrapper2 = new AvatarWrapper(create2, false, 2, (DefaultConstructorMarker) null);
            Avatar create3 = Avatar.create("", "SS");
            C6496s.g(create3, "create(...)");
            List q10 = C6565s.q(avatarWrapper, avatarWrapper2, new AvatarWrapper(create3, false, 2, (DefaultConstructorMarker) null));
            Integer valueOf = Integer.valueOf(R.drawable.intercom_clock);
            G g10 = r0;
            G g11 = new G();
            TopActionBarKt.m207TopActionBarNpQZenA((i) null, "Team", "Back in 3 hours", valueOf, q10, g10, (Integer) null, true, 0, 0, 0, (C6787a) null, (q) null, mVar, 12812720, 0, 8001);
            return;
        }
        mVar.I();
    }
}
