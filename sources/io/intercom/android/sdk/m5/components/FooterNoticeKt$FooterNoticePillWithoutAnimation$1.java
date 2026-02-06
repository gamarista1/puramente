package io.intercom.android.sdk.m5.components;

import C.C1092j;
import H0.F;
import J0.C1241g;
import Y.C1494j;
import Y.C1500m;
import Y.C1523y;
import Y.F1;
import androidx.compose.foundation.layout.d;
import androidx.compose.foundation.layout.f;
import androidx.compose.foundation.layout.n;
import c1.h;
import io.intercom.android.sdk.m5.components.avatar.AvatarWrapper;
import java.util.List;
import k0.c;
import k0.i;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import lf.C6514M;
import yf.C6787a;
import yf.p;
import yf.q;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
final class FooterNoticeKt$FooterNoticePillWithoutAnimation$1 implements q {
    final /* synthetic */ List<AvatarWrapper> $avatars;
    final /* synthetic */ String $title;

    FooterNoticeKt$FooterNoticePillWithoutAnimation$1(String str, List<AvatarWrapper> list) {
        this.$title = str;
        this.$avatars = list;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        invoke((C1092j) obj, (C1500m) obj2, ((Number) obj3).intValue());
        return C6514M.f71813a;
    }

    public final void invoke(C1092j jVar, C1500m mVar, int i10) {
        C6496s.h(jVar, "$this$IntercomCard");
        if ((i10 & 81) != 16 || !mVar.i()) {
            i j10 = n.j(i.f23074a, h.j((float) 10), h.j((float) 12));
            String str = this.$title;
            List<AvatarWrapper> list = this.$avatars;
            F h10 = d.h(c.f23044a.o(), false);
            int a10 = C1494j.a(mVar, 0);
            C1523y p10 = mVar.p();
            i e10 = k0.h.e(mVar, j10);
            C1241g.a aVar = C1241g.f3853J;
            C6787a a11 = aVar.a();
            if (mVar.j() == null) {
                C1494j.c();
            }
            mVar.F();
            if (mVar.f()) {
                mVar.U(a11);
            } else {
                mVar.q();
            }
            C1500m a12 = F1.a(mVar);
            F1.b(a12, h10, aVar.c());
            F1.b(a12, p10, aVar.e());
            p b10 = aVar.b();
            if (a12.f() || !C6496s.c(a12.A(), Integer.valueOf(a10))) {
                a12.r(Integer.valueOf(a10));
                a12.V(Integer.valueOf(a10), b10);
            }
            F1.b(a12, e10, aVar.d());
            f fVar = f.f12848a;
            FooterNoticeKt.FooterTitle(str, list, mVar, 64);
            mVar.u();
            return;
        }
        mVar.I();
    }
}
