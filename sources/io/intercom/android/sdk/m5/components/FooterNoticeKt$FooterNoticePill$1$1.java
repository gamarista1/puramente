package io.intercom.android.sdk.m5.components;

import Y.C1500m;
import io.intercom.android.sdk.m5.components.avatar.AvatarWrapper;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import lf.C6514M;
import v.C2722e;
import yf.C6787a;
import yf.q;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
final class FooterNoticeKt$FooterNoticePill$1$1 implements q {
    final /* synthetic */ List<AvatarWrapper> $avatars;
    final /* synthetic */ C6787a $onClick;
    final /* synthetic */ String $title;

    FooterNoticeKt$FooterNoticePill$1$1(String str, List<AvatarWrapper> list, C6787a aVar) {
        this.$title = str;
        this.$avatars = list;
        this.$onClick = aVar;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        invoke((C2722e) obj, (C1500m) obj2, ((Number) obj3).intValue());
        return C6514M.f71813a;
    }

    public final void invoke(C2722e eVar, C1500m mVar, int i10) {
        C6496s.h(eVar, "$this$AnimatedVisibility");
        FooterNoticeKt.FooterNoticePillWithoutAnimation(this.$title, this.$avatars, this.$onClick, mVar, 64);
    }
}
