package io.intercom.android.sdk.m5.conversation.ui.components.row;

import C.C1085c;
import C.W;
import C.Z;
import H0.F;
import J0.C1241g;
import Q0.T;
import V.D;
import V.T0;
import Y.C1494j;
import Y.C1500m;
import Y.C1523y;
import Y.F1;
import Y.M0;
import Y.Y0;
import androidx.compose.foundation.layout.n;
import androidx.compose.foundation.layout.q;
import b1.j;
import b1.k;
import c1.h;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.ui.IntercomPreviews;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import k0.c;
import k0.i;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import lf.C6514M;
import yf.C6787a;
import yf.C6798l;
import yf.p;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u0019\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0001\u001a\u00020\u0000H\u0001¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u000f\u0010\u0005\u001a\u00020\u0002H\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lk0/i;", "modifier", "Llf/M;", "NewMessagesRow", "(Lk0/i;LY/m;II)V", "NewMessagesRowPreview", "(LY/m;I)V", "intercom-sdk-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class NewMessagesRowKt {
    public static final void NewMessagesRow(i iVar, C1500m mVar, int i10, int i11) {
        int i12;
        i iVar2;
        i.a aVar;
        int i13;
        int i14 = i10;
        int i15 = i11;
        C1500m h10 = mVar.h(1974801002);
        int i16 = i15 & 1;
        if (i16 != 0) {
            i12 = i14 | 6;
            iVar2 = iVar;
        } else if ((i14 & 14) == 0) {
            iVar2 = iVar;
            if (h10.S(iVar2)) {
                i13 = 4;
            } else {
                i13 = 2;
            }
            i12 = i13 | i14;
        } else {
            iVar2 = iVar;
            i12 = i14;
        }
        if ((i12 & 11) != 2 || !h10.i()) {
            if (i16 != 0) {
                aVar = i.f23074a;
            } else {
                aVar = iVar2;
            }
            i k10 = n.k(q.h(aVar, 0.0f, 1, (Object) null), h.j((float) 16), 0.0f, 2, (Object) null);
            F b10 = W.b(C1085c.f882a.f(), c.f23044a.i(), h10, 48);
            int a10 = C1494j.a(h10, 0);
            C1523y p10 = h10.p();
            i e10 = k0.h.e(h10, k10);
            C1241g.a aVar2 = C1241g.f3853J;
            C6787a a11 = aVar2.a();
            if (h10.j() == null) {
                C1494j.c();
            }
            h10.F();
            if (h10.f()) {
                h10.U(a11);
            } else {
                h10.q();
            }
            C1500m a12 = F1.a(h10);
            F1.b(a12, b10, aVar2.c());
            F1.b(a12, p10, aVar2.e());
            p b11 = aVar2.b();
            if (a12.f() || !C6496s.c(a12.A(), Integer.valueOf(a10))) {
                a12.r(Integer.valueOf(a10));
                a12.V(Integer.valueOf(a10), b11);
            }
            F1.b(a12, e10, aVar2.d());
            Z z10 = Z.f873a;
            i.a aVar3 = i.f23074a;
            i r10 = q.r(aVar3, h.j((float) 36));
            IntercomTheme intercomTheme = IntercomTheme.INSTANCE;
            int i17 = IntercomTheme.$stable;
            i iVar3 = aVar;
            int i18 = i17;
            D.a(r10, 0.0f, intercomTheme.getColors(h10, i17).m679getBadge0d7_KjU(), h10, 6, 2);
            i k11 = n.k(aVar3, h.j((float) 8), 0.0f, 2, (Object) null);
            IntercomTheme intercomTheme2 = intercomTheme;
            T0.b(M0.i.a(R.string.intercom_new, h10, 0), k11, intercomTheme2.getColors(h10, i18).m679getBadge0d7_KjU(), 0, (V0.n) null, (V0.p) null, (V0.h) null, 0, (k) null, (j) null, 0, 0, false, 0, 0, (C6798l) null, (T) null, h10, 48, 0, 131064);
            D.a((i) null, 0.0f, intercomTheme2.getColors(h10, i18).m679getBadge0d7_KjU(), h10, 0, 3);
            h10.u();
            iVar2 = iVar3;
        } else {
            h10.I();
        }
        Y0 k12 = h10.k();
        if (k12 != null) {
            k12.a(new C6131b0(iVar2, i14, i15));
        }
    }

    /* access modifiers changed from: private */
    public static final C6514M NewMessagesRow$lambda$1(i iVar, int i10, int i11, C1500m mVar, int i12) {
        NewMessagesRow(iVar, mVar, M0.a(i10 | 1), i11);
        return C6514M.f71813a;
    }

    @IntercomPreviews
    public static final void NewMessagesRowPreview(C1500m mVar, int i10) {
        C1500m h10 = mVar.h(2081615555);
        if (i10 != 0 || !h10.i()) {
            NewMessagesRow((i) null, h10, 0, 1);
        } else {
            h10.I();
        }
        Y0 k10 = h10.k();
        if (k10 != null) {
            k10.a(new C6133c0(i10));
        }
    }

    /* access modifiers changed from: private */
    public static final C6514M NewMessagesRowPreview$lambda$2(int i10, C1500m mVar, int i11) {
        NewMessagesRowPreview(mVar, M0.a(i10 | 1));
        return C6514M.f71813a;
    }
}
