package io.intercom.android.sdk.m5.components;

import Y.C1500m;
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
/* renamed from: io.intercom.android.sdk.m5.components.ComposableSingletons$TopActionBarKt$lambda-1$1  reason: invalid class name */
final class ComposableSingletons$TopActionBarKt$lambda1$1 implements p {
    public static final ComposableSingletons$TopActionBarKt$lambda1$1 INSTANCE = new ComposableSingletons$TopActionBarKt$lambda1$1();

    ComposableSingletons$TopActionBarKt$lambda1$1() {
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
            List e10 = C6565s.e(new AvatarWrapper(create, false, 2, (DefaultConstructorMarker) null));
            E e11 = r0;
            E e12 = new E();
            TopActionBarKt.m207TopActionBarNpQZenA((i) null, "Hannah", (String) null, (Integer) null, e10, e11, (Integer) null, true, 0, 0, 0, (C6787a) null, (q) null, mVar, 12812336, 0, 8013);
            return;
        }
        mVar.I();
    }
}
