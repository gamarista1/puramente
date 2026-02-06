package io.intercom.android.sdk.m5.conversation.ui.components;

import C.C1085c;
import C.C1090h;
import C.C1093k;
import C.W;
import C.Z;
import C.a0;
import H0.F;
import I.g;
import J0.C1241g;
import Q0.A;
import Q0.T;
import V.T0;
import V.V;
import V0.o;
import X0.e;
import Y.C1494j;
import Y.C1500m;
import Y.C1523y;
import Y.F1;
import android.content.Context;
import androidx.compose.foundation.b;
import androidx.compose.foundation.d;
import androidx.compose.foundation.layout.n;
import androidx.compose.foundation.layout.q;
import b1.C1869a;
import b1.C1876h;
import b1.j;
import b1.k;
import b1.s;
import c1.h;
import io.intercom.android.sdk.Injector;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.models.AiAnswerInfo;
import io.intercom.android.sdk.ui.component.IntercomDividerKt;
import io.intercom.android.sdk.ui.theme.IntercomColors;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import io.intercom.android.sdk.utilities.LinkOpener;
import k0.c;
import k0.i;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import lf.C6514M;
import r0.C2544x0;
import r0.e2;
import t0.C2606g;
import yf.C6787a;
import yf.C6798l;
import yf.p;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
final class AnswerInfoDialogKt$AnswerInfoDialog$2 implements p {
    final /* synthetic */ Context $context;
    final /* synthetic */ AiAnswerInfo $info;
    final /* synthetic */ IntercomColors $intercomColors;
    final /* synthetic */ C6787a $onDismiss;

    AnswerInfoDialogKt$AnswerInfoDialog$2(IntercomColors intercomColors, AiAnswerInfo aiAnswerInfo, C6787a aVar, Context context) {
        this.$intercomColors = intercomColors;
        this.$info = aiAnswerInfo;
        this.$onDismiss = aVar;
        this.$context = context;
    }

    /* access modifiers changed from: private */
    public static final C6514M invoke$lambda$2$lambda$0(C6787a aVar, AiAnswerInfo aiAnswerInfo, Context context) {
        C6496s.h(aiAnswerInfo, "$info");
        C6496s.h(context, "$context");
        aVar.invoke();
        LinkOpener.handleUrl(aiAnswerInfo.getUrl(), context, Injector.get().getApi());
        return C6514M.f71813a;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C1500m) obj, ((Number) obj2).intValue());
        return C6514M.f71813a;
    }

    public final void invoke(C1500m mVar, int i10) {
        C1500m mVar2 = mVar;
        if ((i10 & 11) != 2 || !mVar.i()) {
            i.a aVar = i.f23074a;
            i c10 = b.c(aVar, this.$intercomColors.m678getBackground0d7_KjU(), g.c(h.j((float) 10)));
            c.a aVar2 = c.f23044a;
            c.b g10 = aVar2.g();
            AiAnswerInfo aiAnswerInfo = this.$info;
            C6787a aVar3 = this.$onDismiss;
            Context context = this.$context;
            C1085c cVar = C1085c.f882a;
            F a10 = C1090h.a(cVar.g(), g10, mVar2, 48);
            int a11 = C1494j.a(mVar2, 0);
            C1523y p10 = mVar.p();
            i e10 = k0.h.e(mVar2, c10);
            C1241g.a aVar4 = C1241g.f3853J;
            C6787a a12 = aVar4.a();
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
            F1.b(a13, a10, aVar4.c());
            F1.b(a13, p10, aVar4.e());
            p b10 = aVar4.b();
            if (a13.f() || !C6496s.c(a13.A(), Integer.valueOf(a11))) {
                a13.r(Integer.valueOf(a11));
                a13.V(Integer.valueOf(a11), b10);
            }
            F1.b(a13, e10, aVar4.d());
            C1093k kVar = C1093k.f978a;
            float f10 = (float) 24;
            float f11 = (float) 16;
            i j10 = n.j(aVar, h.j(f10), h.j(f11));
            String text = aiAnswerInfo.getText();
            IntercomTheme intercomTheme = IntercomTheme.INSTANCE;
            int i11 = IntercomTheme.$stable;
            int i12 = i11;
            IntercomTheme intercomTheme2 = intercomTheme;
            float f12 = f11;
            float f13 = f10;
            Context context2 = context;
            C6787a aVar5 = aVar3;
            AiAnswerInfo aiAnswerInfo2 = aiAnswerInfo;
            i.a aVar6 = aVar;
            T0.b(text, j10, 0, 0, (V0.n) null, (V0.p) null, (V0.h) null, 0, (k) null, (j) null, 0, 0, false, 0, 0, (C6798l) null, intercomTheme.getTypography(mVar2, i11).getType04(), mVar, 48, 0, 65532);
            C1500m mVar3 = mVar;
            mVar3.T(1930856679);
            String url = aiAnswerInfo2.getUrl();
            if (url == null || url.length() == 0) {
                C1500m mVar4 = mVar3;
            } else {
                IntercomDividerKt.IntercomDivider((i) null, mVar3, 0, 1);
                i j11 = n.j(q.h(d.d(aVar6, false, (String) null, (O0.g) null, new C6110e(aVar5, aiAnswerInfo2, context2), 7, (Object) null), 0.0f, 1, (Object) null), h.j(f13), h.j(f12));
                F b11 = W.b(cVar.b(), aVar2.i(), mVar3, 54);
                int a14 = C1494j.a(mVar3, 0);
                C1523y p11 = mVar.p();
                i e11 = k0.h.e(mVar3, j11);
                C6787a a15 = aVar4.a();
                if (mVar.j() == null) {
                    C1494j.c();
                }
                mVar.F();
                if (mVar.f()) {
                    mVar3.U(a15);
                } else {
                    mVar.q();
                }
                C1500m a16 = F1.a(mVar);
                F1.b(a16, b11, aVar4.c());
                F1.b(a16, p11, aVar4.e());
                p b12 = aVar4.b();
                if (a16.f() || !C6496s.c(a16.A(), Integer.valueOf(a14))) {
                    a16.r(Integer.valueOf(a14));
                    a16.V(Integer.valueOf(a14), b12);
                }
                F1.b(a16, e11, aVar4.d());
                Z z10 = Z.f873a;
                T c11 = T.c(intercomTheme2.getTypography(mVar3, i12).getType04(), 0, 0, V0.p.f8210b.d(), (V0.n) null, (o) null, (V0.h) null, (String) null, 0, (C1869a) null, (b1.o) null, (e) null, 0, (k) null, (e2) null, (C2606g) null, 0, 0, 0, (b1.q) null, (A) null, (C1876h) null, 0, 0, (s) null, 16777211, (Object) null);
                C2544x0.a aVar7 = C2544x0.f25560b;
                T0.b("Learn more", (i) null, aVar7.a(), 0, (V0.n) null, (V0.p) null, (V0.h) null, 0, (k) null, (j) null, 0, 0, false, 0, 0, (C6798l) null, c11, mVar, 390, 0, 65530);
                i.a aVar8 = aVar6;
                C1500m mVar5 = mVar;
                a0.a(q.n(aVar8, h.j((float) 8)), mVar5, 6);
                V.a(M0.e.c(R.drawable.intercom_external_link, mVar5, 0), (String) null, q.n(aVar8, h.j(f12)), aVar7.a(), mVar, 3512, 0);
                mVar.u();
            }
            mVar.M();
            mVar.u();
            return;
        }
        mVar.I();
    }
}
