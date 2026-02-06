package io.intercom.android.sdk.m5.conversation.ui.components.row;

import C.C1085c;
import C.C1090h;
import C.C1093k;
import C.a0;
import H0.F;
import J0.C1241g;
import Y.C1494j;
import Y.C1500m;
import Y.C1523y;
import Y.F1;
import androidx.compose.foundation.b;
import androidx.compose.foundation.layout.q;
import io.intercom.android.sdk.blocks.lib.models.Block;
import io.intercom.android.sdk.m5.components.avatar.AvatarShape;
import io.intercom.android.sdk.models.Avatar;
import io.intercom.android.sdk.models.StreamingPart;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import k0.c;
import k0.h;
import k0.i;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import lf.C6514M;
import mf.C6565s;
import r0.g2;
import yf.C6787a;
import yf.p;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* renamed from: io.intercom.android.sdk.m5.conversation.ui.components.row.ComposableSingletons$FinStreamingRowKt$lambda-1$1  reason: invalid class name */
final class ComposableSingletons$FinStreamingRowKt$lambda1$1 implements p {
    public static final ComposableSingletons$FinStreamingRowKt$lambda1$1 INSTANCE = new ComposableSingletons$FinStreamingRowKt$lambda1$1();

    ComposableSingletons$FinStreamingRowKt$lambda1$1() {
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C1500m) obj, ((Number) obj2).intValue());
        return C6514M.f71813a;
    }

    public final void invoke(C1500m mVar, int i10) {
        if ((i10 & 11) != 2 || !mVar.i()) {
            i.a aVar = i.f23074a;
            i d10 = b.d(q.h(aVar, 0.0f, 1, (Object) null), IntercomTheme.INSTANCE.getColors(mVar, IntercomTheme.$stable).m678getBackground0d7_KjU(), (g2) null, 2, (Object) null);
            F a10 = C1090h.a(C1085c.f882a.g(), c.f23044a.k(), mVar, 0);
            int a11 = C1494j.a(mVar, 0);
            C1523y p10 = mVar.p();
            i e10 = h.e(mVar, d10);
            C1241g.a aVar2 = C1241g.f3853J;
            C6787a a12 = aVar2.a();
            if (mVar.j() == null) {
                C1494j.c();
            }
            mVar.F();
            if (mVar.f()) {
                mVar.U(a12);
            } else {
                mVar.q();
            }
            C1500m a13 = F1.a(mVar);
            F1.b(a13, a10, aVar2.c());
            F1.b(a13, p10, aVar2.e());
            p b10 = aVar2.b();
            if (a13.f() || !C6496s.c(a13.A(), Integer.valueOf(a11))) {
                a13.r(Integer.valueOf(a11));
                a13.V(Integer.valueOf(a11), b10);
            }
            F1.b(a13, e10, aVar2.d());
            C1093k kVar = C1093k.f978a;
            float f10 = (float) 16;
            a0.a(q.i(aVar, c1.h.j(f10)), mVar, 6);
            FinStreamingRowKt.FinStreamingRow(C6565s.q(new Block.Builder().withType("paragraph").withText("<b>Hello</b> <i>World</i> Three <a href=\"http://test.com\">Four</a").build(), new Block.Builder().withType("paragraph").withText("Next line").build()), new StreamingPart(new io.intercom.android.sdk.models.Metadata("Bot", "AI Agent", 1726738186L, C6565s.e(new Avatar.Builder().withInitials("BB").withShape(AvatarShape.SQUIRCLE)))), q.h(aVar, 0.0f, 1, (Object) null), mVar, 456, 0);
            a0.a(q.i(aVar, c1.h.j(f10)), mVar, 6);
            mVar.u();
            return;
        }
        mVar.I();
    }
}
