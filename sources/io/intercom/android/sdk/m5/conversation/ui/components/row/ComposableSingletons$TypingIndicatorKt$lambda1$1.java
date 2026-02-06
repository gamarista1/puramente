package io.intercom.android.sdk.m5.conversation.ui.components.row;

import C.C1085c;
import C.C1090h;
import C.C1093k;
import H0.F;
import J0.C1241g;
import Y.C1494j;
import Y.C1500m;
import Y.C1523y;
import Y.F1;
import c1.h;
import io.intercom.android.sdk.m5.components.avatar.AvatarWrapper;
import io.intercom.android.sdk.m5.conversation.states.CurrentlyTypingState;
import io.intercom.android.sdk.m5.conversation.states.TypingIndicatorType;
import io.intercom.android.sdk.models.Avatar;
import io.intercom.android.sdk.ui.common.StringProvider;
import k0.c;
import k0.i;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lf.C6514M;
import yf.C6787a;
import yf.p;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* renamed from: io.intercom.android.sdk.m5.conversation.ui.components.row.ComposableSingletons$TypingIndicatorKt$lambda-1$1  reason: invalid class name */
final class ComposableSingletons$TypingIndicatorKt$lambda1$1 implements p {
    public static final ComposableSingletons$TypingIndicatorKt$lambda1$1 INSTANCE = new ComposableSingletons$TypingIndicatorKt$lambda1$1();

    ComposableSingletons$TypingIndicatorKt$lambda1$1() {
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C1500m) obj, ((Number) obj2).intValue());
        return C6514M.f71813a;
    }

    public final void invoke(C1500m mVar, int i10) {
        C1500m mVar2 = mVar;
        if ((i10 & 11) != 2 || !mVar.i()) {
            C1085c cVar = C1085c.f882a;
            float j10 = h.j((float) 16);
            c.a aVar = c.f23044a;
            C1085c.m p10 = cVar.p(j10, aVar.i());
            c.b k10 = aVar.k();
            i.a aVar2 = i.f23074a;
            F a10 = C1090h.a(p10, k10, mVar2, 54);
            int a11 = C1494j.a(mVar2, 0);
            C1523y p11 = mVar.p();
            i e10 = k0.h.e(mVar2, aVar2);
            C1241g.a aVar3 = C1241g.f3853J;
            C6787a a12 = aVar3.a();
            if (mVar.j() == null) {
                C1494j.c();
            }
            mVar.F();
            if (mVar.f()) {
                mVar2.U(a12);
            } else {
                mVar.q();
            }
            C1500m a13 = F1.a(mVar);
            F1.b(a13, a10, aVar3.c());
            F1.b(a13, p11, aVar3.e());
            p b10 = aVar3.b();
            if (a13.f() || !C6496s.c(a13.A(), Integer.valueOf(a11))) {
                a13.r(Integer.valueOf(a11));
                a13.V(Integer.valueOf(a11), b10);
            }
            F1.b(a13, e10, aVar3.d());
            C1093k kVar = C1093k.f978a;
            Avatar create = Avatar.create("", "SK");
            C6496s.g(create, "create(...)");
            AvatarWrapper avatarWrapper = new AvatarWrapper(create, false);
            TypingIndicatorType typingIndicatorType = TypingIndicatorType.ADMIN;
            TypingIndicatorKt.m327TypingIndicator6a0pyJM((i) null, new CurrentlyTypingState(avatarWrapper, false, (StringProvider) null, typingIndicatorType, 6, (DefaultConstructorMarker) null), 0.0f, mVar, 64, 5);
            Avatar create2 = Avatar.create("", "SK");
            C6496s.g(create2, "create(...)");
            TypingIndicatorKt.m327TypingIndicator6a0pyJM((i) null, new CurrentlyTypingState(new AvatarWrapper(create2, true), false, (StringProvider) null, typingIndicatorType, 6, (DefaultConstructorMarker) null), 0.0f, mVar, 64, 5);
            mVar.u();
            return;
        }
        mVar.I();
    }
}
