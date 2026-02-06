package io.intercom.android.sdk.m5.conversation.ui.components;

import Y.C1500m;
import io.intercom.android.sdk.m5.components.avatar.AvatarWrapper;
import io.intercom.android.sdk.models.Avatar;
import k0.i;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lf.C6514M;
import mf.C6565s;
import yf.p;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* renamed from: io.intercom.android.sdk.m5.conversation.ui.components.ComposableSingletons$MessageMetadataKt$lambda-3$1  reason: invalid class name */
final class ComposableSingletons$MessageMetadataKt$lambda3$1 implements p {
    public static final ComposableSingletons$MessageMetadataKt$lambda3$1 INSTANCE = new ComposableSingletons$MessageMetadataKt$lambda3$1();

    ComposableSingletons$MessageMetadataKt$lambda3$1() {
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
            Avatar create2 = Avatar.create("", "PL");
            C6496s.g(create2, "create(...)");
            AvatarWrapper avatarWrapper2 = new AvatarWrapper(create2, false, 2, (DefaultConstructorMarker) null);
            Avatar create3 = Avatar.create("", "IS");
            C6496s.g(create3, "create(...)");
            MessageMetadataKt.MessageMetadata(C6565s.q(avatarWrapper, avatarWrapper2, new AvatarWrapper(create3, false, 2, (DefaultConstructorMarker) null)), "This Lisa Agent has very long and boring name", (i) null, "AI Agent", 1726738186L, mVar, 27704, 4);
            return;
        }
        mVar.I();
    }
}
