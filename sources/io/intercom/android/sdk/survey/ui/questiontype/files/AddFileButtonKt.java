package io.intercom.android.sdk.survey.ui.questiontype.files;

import C.C1085c;
import C.W;
import C.Z;
import H0.F;
import I.g;
import J0.C1241g;
import S.a;
import V.O0;
import V.T0;
import V.V;
import Y.C1494j;
import Y.C1500m;
import Y.C1523y;
import Y.F1;
import Y.M0;
import Y.Y0;
import androidx.compose.foundation.b;
import androidx.compose.foundation.layout.n;
import androidx.compose.foundation.layout.q;
import b1.j;
import b1.k;
import c1.h;
import io.intercom.android.sdk.ui.IntercomPreviews;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import k0.c;
import k0.i;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import lf.C6514M;
import o0.C2342e;
import r0.C2544x0;
import r0.g2;
import x.C2868g;
import yf.C6787a;
import yf.C6798l;
import yf.p;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a#\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0001\u0010\u0003\u001a\u00020\u0002H\u0001¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u000f\u0010\u0007\u001a\u00020\u0004H\u0003¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lk0/i;", "modifier", "", "text", "Llf/M;", "AddFileButton", "(Lk0/i;ILY/m;II)V", "AddFileButtonPreview", "(LY/m;I)V", "intercom-sdk-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class AddFileButtonKt {
    public static final void AddFileButton(i iVar, int i10, C1500m mVar, int i11, int i12) {
        int i13;
        i iVar2;
        i.a aVar;
        int i14;
        int i15;
        int i16 = i10;
        int i17 = i11;
        int i18 = i12;
        C1500m h10 = mVar.h(533336753);
        int i19 = i18 & 1;
        if (i19 != 0) {
            i13 = i17 | 6;
            iVar2 = iVar;
        } else if ((i17 & 14) == 0) {
            iVar2 = iVar;
            if (h10.S(iVar2)) {
                i15 = 4;
            } else {
                i15 = 2;
            }
            i13 = i15 | i17;
        } else {
            iVar2 = iVar;
            i13 = i17;
        }
        if ((i18 & 2) != 0) {
            i13 |= 48;
        } else if ((i17 & 112) == 0) {
            if (h10.d(i16)) {
                i14 = 32;
            } else {
                i14 = 16;
            }
            i13 |= i14;
        }
        if ((i13 & 91) != 18 || !h10.i()) {
            if (i19 != 0) {
                aVar = i.f23074a;
            } else {
                aVar = iVar2;
            }
            IntercomTheme intercomTheme = IntercomTheme.INSTANCE;
            int i20 = IntercomTheme.$stable;
            i i21 = n.i(C2342e.a(b.c(aVar, C2544x0.o(intercomTheme.getColors(h10, i20).m700getPrimaryText0d7_KjU(), 0.06f, 0.0f, 0.0f, 0.0f, 14, (Object) null), intercomTheme.getShapes(h10, i20).e()), g.a(2)), h.j((float) 8));
            F b10 = W.b(C1085c.f882a.n(h.j((float) 3)), c.f23044a.i(), h10, 54);
            int a10 = C1494j.a(h10, 0);
            C1523y p10 = h10.p();
            i e10 = k0.h.e(h10, i21);
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
            T0.b(M0.i.a(i16, h10, (i13 >> 3) & 14), aVar3, intercomTheme.getColors(h10, i20).m700getPrimaryText0d7_KjU(), 0, (V0.n) null, V0.p.f8210b.d(), (V0.h) null, 0, (k) null, (j) null, 0, 0, false, 0, 0, (C6798l) null, intercomTheme.getTypography(h10, i20).getType04Point5(), h10, 196656, 0, 65496);
            V.b(a.a(Q.b.f5154a.a()), "Add", q.n(aVar3, h.j((float) 16)), intercomTheme.getColors(h10, i20).m700getPrimaryText0d7_KjU(), h10, 432, 0);
            h10.u();
            iVar2 = aVar;
        } else {
            h10.I();
        }
        Y0 k10 = h10.k();
        if (k10 != null) {
            k10.a(new C6302b(iVar2, i16, i17, i18));
        }
    }

    /* access modifiers changed from: private */
    public static final C6514M AddFileButton$lambda$1(i iVar, int i10, int i11, int i12, C1500m mVar, int i13) {
        AddFileButton(iVar, i10, mVar, M0.a(i11 | 1), i12);
        return C6514M.f71813a;
    }

    @IntercomPreviews
    private static final void AddFileButtonPreview(C1500m mVar, int i10) {
        C1500m h10 = mVar.h(-126735215);
        if (i10 != 0 || !h10.i()) {
            O0.a((i) null, (g2) null, 0, 0, 0.0f, 0.0f, (C2868g) null, ComposableSingletons$AddFileButtonKt.INSTANCE.m488getLambda1$intercom_sdk_base_release(), h10, 12582912, 127);
        } else {
            h10.I();
        }
        Y0 k10 = h10.k();
        if (k10 != null) {
            k10.a(new C6301a(i10));
        }
    }

    /* access modifiers changed from: private */
    public static final C6514M AddFileButtonPreview$lambda$2(int i10, C1500m mVar, int i11) {
        AddFileButtonPreview(mVar, M0.a(i10 | 1));
        return C6514M.f71813a;
    }
}
