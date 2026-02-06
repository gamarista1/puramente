package io.intercom.android.sdk.survey.ui.questiontype.text;

import C.C1085c;
import C.C1090h;
import C.C1093k;
import H0.F;
import J0.C1241g;
import Y.C1494j;
import Y.C1500m;
import Y.C1523y;
import Y.F1;
import androidx.compose.foundation.layout.n;
import c1.h;
import io.intercom.android.sdk.survey.SurveyViewModelKt;
import io.intercom.android.sdk.survey.model.SurveyCustomization;
import k0.c;
import k0.i;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lf.C6514M;
import r0.C2544x0;
import yf.C6787a;
import yf.C6798l;
import yf.p;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* renamed from: io.intercom.android.sdk.survey.ui.questiontype.text.ComposableSingletons$TextInputPillKt$lambda-3$1  reason: invalid class name */
final class ComposableSingletons$TextInputPillKt$lambda3$1 implements p {
    public static final ComposableSingletons$TextInputPillKt$lambda3$1 INSTANCE = new ComposableSingletons$TextInputPillKt$lambda3$1();

    ComposableSingletons$TextInputPillKt$lambda3$1() {
    }

    /* access modifiers changed from: private */
    public static final C6514M invoke$lambda$1$lambda$0(String str) {
        C6496s.h(str, "it");
        return C6514M.f71813a;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C1500m) obj, ((Number) obj2).intValue());
        return C6514M.f71813a;
    }

    public final void invoke(C1500m mVar, int i10) {
        C1500m mVar2 = mVar;
        if ((i10 & 11) != 2 || !mVar.i()) {
            i i11 = n.i(i.f23074a, h.j((float) 16));
            F a10 = C1090h.a(C1085c.f882a.g(), c.f23044a.k(), mVar2, 0);
            int a11 = C1494j.a(mVar2, 0);
            C1523y p10 = mVar.p();
            i e10 = k0.h.e(mVar2, i11);
            C1241g.a aVar = C1241g.f3853J;
            C6787a a12 = aVar.a();
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
            F1.b(a13, a10, aVar.c());
            F1.b(a13, p10, aVar.e());
            p b10 = aVar.b();
            if (a13.f() || !C6496s.c(a13.A(), Integer.valueOf(a11))) {
                a13.r(Integer.valueOf(a11));
                a13.V(Integer.valueOf(a11), b10);
            }
            F1.b(a13, e10, aVar.d());
            C1093k kVar = C1093k.f978a;
            g gVar = r0;
            g gVar2 = new g();
            TextInputPillKt.m517TextInputPillg5ZjG94("some text", (String) null, gVar, (C2544x0) null, SurveyViewModelKt.toSurveyUiColors(new SurveyCustomization((String) null, (String) null, 3, (DefaultConstructorMarker) null)).m423getButton0d7_KjU(), 0, false, (C6798l) null, 0, 0, true, (p) null, false, 0.0f, mVar, 390, 6, 15338);
            mVar.u();
            return;
        }
        mVar.I();
    }
}
