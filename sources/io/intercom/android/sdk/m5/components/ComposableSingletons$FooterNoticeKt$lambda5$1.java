package io.intercom.android.sdk.m5.components;

import Y.C1500m;
import io.intercom.android.sdk.m5.components.avatar.AvatarWrapper;
import io.intercom.android.sdk.models.Avatar;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lf.C6514M;
import mf.C6565s;
import yf.p;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* renamed from: io.intercom.android.sdk.m5.components.ComposableSingletons$FooterNoticeKt$lambda-5$1  reason: invalid class name */
final class ComposableSingletons$FooterNoticeKt$lambda5$1 implements p {
    public static final ComposableSingletons$FooterNoticeKt$lambda5$1 INSTANCE = new ComposableSingletons$FooterNoticeKt$lambda5$1();

    ComposableSingletons$FooterNoticeKt$lambda5$1() {
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
            Avatar create = Avatar.create("", "SK");
            C6496s.g(create, "create(...)");
            AvatarWrapper avatarWrapper = new AvatarWrapper(create, false, 2, (DefaultConstructorMarker) null);
            Avatar create2 = Avatar.create("", "LD");
            C6496s.g(create2, "create(...)");
            AvatarWrapper avatarWrapper2 = new AvatarWrapper(create2, false, 2, (DefaultConstructorMarker) null);
            Avatar create3 = Avatar.create("", "LY");
            C6496s.g(create3, "create(...)");
            FooterNoticeKt.FooterNoticePillWithoutAnimation("The team will reply in 1314 minutes", C6565s.q(avatarWrapper, avatarWrapper2, new AvatarWrapper(create3, false, 2, (DefaultConstructorMarker) null)), new C6060y(), mVar, 454);
            return;
        }
        mVar.I();
    }
}
