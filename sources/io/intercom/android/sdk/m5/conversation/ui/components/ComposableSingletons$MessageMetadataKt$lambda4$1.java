package io.intercom.android.sdk.m5.conversation.ui.components;

import H0.F;
import J0.C1241g;
import V.O0;
import Y.C1494j;
import Y.C1500m;
import Y.C1523y;
import Y.F1;
import androidx.compose.foundation.layout.d;
import androidx.compose.foundation.layout.f;
import androidx.compose.foundation.layout.q;
import k0.c;
import k0.h;
import k0.i;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import lf.C6514M;
import r0.g2;
import x.C2868g;
import yf.C6787a;
import yf.p;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* renamed from: io.intercom.android.sdk.m5.conversation.ui.components.ComposableSingletons$MessageMetadataKt$lambda-4$1  reason: invalid class name */
final class ComposableSingletons$MessageMetadataKt$lambda4$1 implements p {
    public static final ComposableSingletons$MessageMetadataKt$lambda4$1 INSTANCE = new ComposableSingletons$MessageMetadataKt$lambda4$1();

    ComposableSingletons$MessageMetadataKt$lambda4$1() {
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C1500m) obj, ((Number) obj2).intValue());
        return C6514M.f71813a;
    }

    public final void invoke(C1500m mVar, int i10) {
        if ((i10 & 11) != 2 || !mVar.i()) {
            i h10 = q.h(i.f23074a, 0.0f, 1, (Object) null);
            F h11 = d.h(c.f23044a.o(), false);
            int a10 = C1494j.a(mVar, 0);
            C1523y p10 = mVar.p();
            i e10 = h.e(mVar, h10);
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
            F1.b(a12, h11, aVar.c());
            F1.b(a12, p10, aVar.e());
            p b10 = aVar.b();
            if (a12.f() || !C6496s.c(a12.A(), Integer.valueOf(a10))) {
                a12.r(Integer.valueOf(a10));
                a12.V(Integer.valueOf(a10), b10);
            }
            F1.b(a12, e10, aVar.d());
            f fVar = f.f12848a;
            O0.a((i) null, (g2) null, 0, 0, 0.0f, 0.0f, (C2868g) null, ComposableSingletons$MessageMetadataKt.INSTANCE.m244getLambda3$intercom_sdk_base_release(), mVar, 12582912, 127);
            mVar.u();
            return;
        }
        mVar.I();
    }
}
