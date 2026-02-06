package io.intercom.android.sdk.survey.block;

import H0.F;
import J0.C1241g;
import M0.e;
import V.V;
import Y.C1494j;
import Y.C1500m;
import Y.C1523y;
import Y.F1;
import Z3.f;
import Z3.w;
import androidx.compose.foundation.b;
import androidx.compose.foundation.layout.d;
import androidx.compose.foundation.layout.q;
import io.intercom.android.sdk.R;
import k0.c;
import k0.h;
import k0.i;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import lf.C6514M;
import r0.C2544x0;
import r0.g2;
import yf.C6787a;
import yf.p;
import yf.r;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* renamed from: io.intercom.android.sdk.survey.block.ComposableSingletons$PdfAttachmentBlockKt$lambda-2$1  reason: invalid class name */
final class ComposableSingletons$PdfAttachmentBlockKt$lambda2$1 implements r {
    public static final ComposableSingletons$PdfAttachmentBlockKt$lambda2$1 INSTANCE = new ComposableSingletons$PdfAttachmentBlockKt$lambda2$1();

    ComposableSingletons$PdfAttachmentBlockKt$lambda2$1() {
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        invoke((w) obj, (f.b.C0194b) obj2, (C1500m) obj3, ((Number) obj4).intValue());
        return C6514M.f71813a;
    }

    public final void invoke(w wVar, f.b.C0194b bVar, C1500m mVar, int i10) {
        C6496s.h(wVar, "$this$SubcomposeAsyncImage");
        C6496s.h(bVar, "it");
        if ((i10 & 641) != 128 || !mVar.i()) {
            i.a aVar = i.f23074a;
            C2544x0.a aVar2 = C2544x0.f25560b;
            i d10 = b.d(aVar, C2544x0.o(aVar2.a(), 0.5f, 0.0f, 0.0f, 0.0f, 14, (Object) null), (g2) null, 2, (Object) null);
            F h10 = d.h(c.f23044a.e(), false);
            int a10 = C1494j.a(mVar, 0);
            C1523y p10 = mVar.p();
            i e10 = h.e(mVar, d10);
            C1241g.a aVar3 = C1241g.f3853J;
            C6787a a11 = aVar3.a();
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
            F1.b(a12, h10, aVar3.c());
            F1.b(a12, p10, aVar3.e());
            p b10 = aVar3.b();
            if (a12.f() || !C6496s.c(a12.A(), Integer.valueOf(a10))) {
                a12.r(Integer.valueOf(a10));
                a12.V(Integer.valueOf(a10), b10);
            }
            F1.b(a12, e10, aVar3.d());
            androidx.compose.foundation.layout.f fVar = androidx.compose.foundation.layout.f.f12848a;
            V.a(e.c(R.drawable.intercom_ic_reload, mVar, 0), "Reload", q.n(aVar, c1.h.j((float) 24)), aVar2.i(), mVar, 3512, 0);
            mVar.u();
            return;
        }
        mVar.I();
    }
}
