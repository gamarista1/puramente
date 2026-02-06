package io.intercom.android.sdk.m5.components.avatar;

import C.C1085c;
import C.W;
import C.Z;
import C.a0;
import H0.F;
import J0.C1241g;
import Y.C1494j;
import Y.C1500m;
import Y.C1523y;
import Y.F1;
import androidx.compose.foundation.layout.q;
import io.intercom.android.sdk.models.Avatar;
import k0.c;
import k0.h;
import k0.i;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lf.C6514M;
import r0.C2544x0;
import yf.C6787a;
import yf.p;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* renamed from: io.intercom.android.sdk.m5.components.avatar.ComposableSingletons$AvatarIconKt$lambda-3$1  reason: invalid class name */
final class ComposableSingletons$AvatarIconKt$lambda3$1 implements p {
    public static final ComposableSingletons$AvatarIconKt$lambda3$1 INSTANCE = new ComposableSingletons$AvatarIconKt$lambda3$1();

    ComposableSingletons$AvatarIconKt$lambda3$1() {
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C1500m) obj, ((Number) obj2).intValue());
        return C6514M.f71813a;
    }

    public final void invoke(C1500m mVar, int i10) {
        C1500m mVar2 = mVar;
        if ((i10 & 11) != 2 || !mVar.i()) {
            C1085c.f e10 = C1085c.f882a.e();
            i.a aVar = i.f23074a;
            F b10 = W.b(e10, c.f23044a.l(), mVar2, 6);
            int a10 = C1494j.a(mVar2, 0);
            C1523y p10 = mVar.p();
            i e11 = h.e(mVar2, aVar);
            C1241g.a aVar2 = C1241g.f3853J;
            C6787a a11 = aVar2.a();
            if (mVar.j() == null) {
                C1494j.c();
            }
            mVar.F();
            if (mVar.f()) {
                mVar2.U(a11);
            } else {
                mVar.q();
            }
            C1500m a12 = F1.a(mVar);
            F1.b(a12, b10, aVar2.c());
            F1.b(a12, p10, aVar2.e());
            p b11 = aVar2.b();
            if (a12.f() || !C6496s.c(a12.A(), Integer.valueOf(a10))) {
                a12.r(Integer.valueOf(a10));
                a12.V(Integer.valueOf(a10), b11);
            }
            F1.b(a12, e11, aVar2.d());
            Z z10 = Z.f873a;
            Avatar create = Avatar.create("", "SK");
            C6496s.g(create, "create(...)");
            AvatarWrapper avatarWrapper = new AvatarWrapper(create, false, 2, (DefaultConstructorMarker) null);
            float f10 = (float) 36;
            i n10 = q.n(aVar, c1.h.j(f10));
            AvatarShape avatarShape = AvatarShape.SQUIRCLE;
            float f11 = f10;
            C1500m mVar3 = mVar;
            AvatarIconKt.m208AvatarIconRd90Nhg(n10, avatarWrapper, AvatarIconKt.getComposeShape(avatarShape), false, 0, (C2544x0) null, mVar3, 70, 56);
            a0.a(q.r(aVar, c1.h.j((float) 16)), mVar2, 6);
            Avatar create2 = Avatar.create("", "");
            C6496s.g(create2, "create(...)");
            AvatarIconKt.m208AvatarIconRd90Nhg(q.n(aVar, c1.h.j(f11)), new AvatarWrapper(create2, false, 2, (DefaultConstructorMarker) null), AvatarIconKt.getComposeShape(avatarShape), false, 0, (C2544x0) null, mVar3, 70, 56);
            mVar.u();
            return;
        }
        mVar.I();
    }
}
