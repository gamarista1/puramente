package io.intercom.android.sdk.tickets.create.ui;

import C.C1085c;
import C.W;
import C.Y;
import C.Z;
import C.a0;
import H0.F;
import J0.C1241g;
import M0.e;
import V.C1400p0;
import V.T0;
import V.V;
import V0.n;
import Y.C1494j;
import Y.C1500m;
import Y.C1523y;
import Y.F1;
import b1.j;
import b1.k;
import c1.h;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.tickets.create.model.CreateTicketViewModel;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import k0.c;
import k0.i;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import lf.C6514M;
import yf.C6787a;
import yf.C6798l;
import yf.p;
import yf.q;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
final class CreateTicketContentScreenKt$CreateTicketContentScreen$1$2 implements q {
    final /* synthetic */ CreateTicketViewModel.CreateTicketFormUiState.Content $state;

    CreateTicketContentScreenKt$CreateTicketContentScreen$1$2(CreateTicketViewModel.CreateTicketFormUiState.Content content) {
        this.$state = content;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        invoke((Y) obj, (C1500m) obj2, ((Number) obj3).intValue());
        return C6514M.f71813a;
    }

    public final void invoke(Y y10, C1500m mVar, int i10) {
        C1500m mVar2 = mVar;
        C6496s.h(y10, "$this$LegacyIntercomPrimaryButton");
        if ((i10 & 81) == 16 && mVar.i()) {
            mVar.I();
        } else if (this.$state.getShowCreatingTicketProgress()) {
            mVar2.T(-265539615);
            C1400p0.a(androidx.compose.foundation.layout.q.n(i.f23074a, h.j((float) 24)), 0, h.j((float) 2), 0, 0, mVar, 390, 26);
            mVar.M();
        } else {
            mVar2.T(-265348128);
            c.C0368c i11 = c.f23044a.i();
            i.a aVar = i.f23074a;
            F b10 = W.b(C1085c.f882a.f(), i11, mVar2, 48);
            int a10 = C1494j.a(mVar2, 0);
            C1523y p10 = mVar.p();
            i e10 = k0.h.e(mVar2, aVar);
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
            F1.b(a12, e10, aVar2.d());
            Z z10 = Z.f873a;
            String a13 = M0.i.a(R.string.intercom_tickets_create_ticket, mVar2, 0);
            IntercomTheme intercomTheme = IntercomTheme.INSTANCE;
            int i12 = IntercomTheme.$stable;
            T0.b(a13, (i) null, intercomTheme.getColors(mVar2, i12).m694getOnAction0d7_KjU(), 0, (n) null, (V0.p) null, (V0.h) null, 0, (k) null, (j) null, 0, 0, false, 0, 0, (C6798l) null, intercomTheme.getTypography(mVar2, i12).getType04(), mVar, 0, 0, 65530);
            i.a aVar3 = aVar;
            C1500m mVar3 = mVar;
            a0.a(androidx.compose.foundation.layout.q.r(aVar3, h.j((float) 6)), mVar3, 6);
            V.a(e.c(R.drawable.intercom_ticket_detail_icon, mVar3, 0), (String) null, androidx.compose.foundation.layout.q.n(aVar3, h.j((float) 16)), intercomTheme.getColors(mVar3, i12).m694getOnAction0d7_KjU(), mVar, 440, 0);
            mVar.u();
            mVar.M();
        }
    }
}
