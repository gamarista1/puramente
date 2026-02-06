package io.intercom.android.sdk.post;

import C.C1085c;
import C.C1090h;
import C.C1093k;
import C.W;
import C.Z;
import H0.F;
import J0.C1241g;
import O0.g;
import S.d;
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
import b1.j;
import b1.k;
import c1.h;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.models.Avatar;
import io.intercom.android.sdk.survey.ui.components.CircularAvatarComponentKt;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import k0.c;
import k0.i;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import lf.C6514M;
import r0.C2544x0;
import r0.g2;
import yf.C6787a;
import yf.C6798l;
import yf.p;
import yf.q;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a=\u0010\n\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0003¢\u0006\u0004\b\n\u0010\u000b\u001a+\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\b0\fH\u0001¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lk0/i;", "modifier", "Lio/intercom/android/sdk/models/Avatar;", "avatar", "", "title", "subTitle", "Lkotlin/Function0;", "Llf/M;", "onCloseClick", "TopBar", "(Lk0/i;Lio/intercom/android/sdk/models/Avatar;Ljava/lang/String;Ljava/lang/String;Lyf/a;LY/m;I)V", "Lkotlin/Function1;", "LC/Y;", "content", "BottomBarContent", "(Lk0/i;Lyf/q;LY/m;I)V", "intercom-sdk-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class PostActivityV2Kt {
    public static final void BottomBarContent(i iVar, q qVar, C1500m mVar, int i10) {
        int i11;
        int i12;
        int i13;
        i iVar2 = iVar;
        q qVar2 = qVar;
        int i14 = i10;
        C6496s.h(iVar2, "modifier");
        C6496s.h(qVar2, "content");
        C1500m h10 = mVar.h(2049700691);
        if ((i14 & 14) == 0) {
            if (h10.S(iVar2)) {
                i13 = 4;
            } else {
                i13 = 2;
            }
            i11 = i13 | i14;
        } else {
            i11 = i14;
        }
        if ((i14 & 112) == 0) {
            if (h10.C(qVar2)) {
                i12 = 32;
            } else {
                i12 = 16;
            }
            i11 |= i12;
        }
        if ((i11 & 91) != 18 || !h10.i()) {
            c.C0368c i15 = c.f23044a.i();
            i k10 = n.k(b.d(androidx.compose.foundation.layout.q.i(androidx.compose.foundation.layout.q.h(iVar2, 0.0f, 1, (Object) null), h.j((float) 56)), C2544x0.f25560b.a(), (g2) null, 2, (Object) null), h.j((float) 16), 0.0f, 2, (Object) null);
            F b10 = W.b(C1085c.f882a.d(), i15, h10, 54);
            int a10 = C1494j.a(h10, 0);
            C1523y p10 = h10.p();
            i e10 = k0.h.e(h10, k10);
            C1241g.a aVar = C1241g.f3853J;
            C6787a a11 = aVar.a();
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
            F1.b(a12, b10, aVar.c());
            F1.b(a12, p10, aVar.e());
            p b11 = aVar.b();
            if (a12.f() || !C6496s.c(a12.A(), Integer.valueOf(a10))) {
                a12.r(Integer.valueOf(a10));
                a12.V(Integer.valueOf(a10), b11);
            }
            F1.b(a12, e10, aVar.d());
            qVar2.invoke(Z.f873a, h10, Integer.valueOf((i11 & 112) | 6));
            h10.u();
        } else {
            h10.I();
        }
        Y0 k11 = h10.k();
        if (k11 != null) {
            k11.a(new i(iVar2, qVar2, i14));
        }
    }

    /* access modifiers changed from: private */
    public static final C6514M BottomBarContent$lambda$5(i iVar, q qVar, int i10, C1500m mVar, int i11) {
        C6496s.h(iVar, "$modifier");
        C6496s.h(qVar, "$content");
        BottomBarContent(iVar, qVar, mVar, M0.a(i10 | 1));
        return C6514M.f71813a;
    }

    /* access modifiers changed from: private */
    public static final void TopBar(i iVar, Avatar avatar, String str, String str2, C6787a aVar, C1500m mVar, int i10) {
        C1500m h10 = mVar.h(131412917);
        c.a aVar2 = c.f23044a;
        c.C0368c i11 = aVar2.i();
        i i12 = androidx.compose.foundation.layout.q.i(androidx.compose.foundation.layout.q.h(iVar, 0.0f, 1, (Object) null), h.j((float) 56));
        C2544x0.a aVar3 = C2544x0.f25560b;
        i k10 = n.k(b.d(i12, aVar3.a(), (g2) null, 2, (Object) null), h.j((float) 16), 0.0f, 2, (Object) null);
        C1085c cVar = C1085c.f882a;
        F b10 = W.b(cVar.d(), i11, h10, 54);
        int a10 = C1494j.a(h10, 0);
        C1523y p10 = h10.p();
        i e10 = k0.h.e(h10, k10);
        C1241g.a aVar4 = C1241g.f3853J;
        C6787a a11 = aVar4.a();
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
        F1.b(a12, b10, aVar4.c());
        F1.b(a12, p10, aVar4.e());
        p b11 = aVar4.b();
        if (a12.f() || !C6496s.c(a12.A(), Integer.valueOf(a10))) {
            a12.r(Integer.valueOf(a10));
            a12.V(Integer.valueOf(a10), b11);
        }
        F1.b(a12, e10, aVar4.d());
        Z z10 = Z.f873a;
        c.C0368c i13 = aVar2.i();
        i.a aVar5 = i.f23074a;
        F b12 = W.b(cVar.f(), i13, h10, 48);
        int a13 = C1494j.a(h10, 0);
        C1523y p11 = h10.p();
        i e11 = k0.h.e(h10, aVar5);
        C6787a a14 = aVar4.a();
        if (h10.j() == null) {
            C1494j.c();
        }
        h10.F();
        if (h10.f()) {
            h10.U(a14);
        } else {
            h10.q();
        }
        C1500m a15 = F1.a(h10);
        F1.b(a15, b12, aVar4.c());
        F1.b(a15, p11, aVar4.e());
        p b13 = aVar4.b();
        if (a15.f() || !C6496s.c(a15.A(), Integer.valueOf(a13))) {
            a15.r(Integer.valueOf(a13));
            a15.V(Integer.valueOf(a13), b13);
        }
        F1.b(a15, e11, aVar4.d());
        i.a aVar6 = aVar5;
        CircularAvatarComponentKt.m465CircularAvataraMcp0Q(avatar, aVar3.i(), h.j((float) 32), h10, 440, 0);
        i k11 = n.k(aVar6, h.j((float) 8), 0.0f, 2, (Object) null);
        F a16 = C1090h.a(cVar.g(), aVar2.k(), h10, 0);
        int a17 = C1494j.a(h10, 0);
        C1523y p12 = h10.p();
        i e12 = k0.h.e(h10, k11);
        C6787a a18 = aVar4.a();
        if (h10.j() == null) {
            C1494j.c();
        }
        h10.F();
        if (h10.f()) {
            h10.U(a18);
        } else {
            h10.q();
        }
        C1500m a19 = F1.a(h10);
        F1.b(a19, a16, aVar4.c());
        F1.b(a19, p12, aVar4.e());
        p b14 = aVar4.b();
        if (a19.f() || !C6496s.c(a19.A(), Integer.valueOf(a17))) {
            a19.r(Integer.valueOf(a17));
            a19.V(Integer.valueOf(a17), b14);
        }
        F1.b(a19, e12, aVar4.d());
        C1093k kVar = C1093k.f978a;
        long i14 = aVar3.i();
        IntercomTheme intercomTheme = IntercomTheme.INSTANCE;
        int i15 = IntercomTheme.$stable;
        int i16 = i15;
        i.a aVar7 = aVar6;
        IntercomTheme intercomTheme2 = intercomTheme;
        T0.b(str, (i) null, i14, 0, (V0.n) null, (V0.p) null, (V0.h) null, 0, (k) null, (j) null, 0, 0, false, 0, 0, (C6798l) null, intercomTheme.getTypography(h10, i15).getType04Point5(), h10, ((i10 >> 6) & 14) | 384, 0, 65530);
        h10.T(-2145848981);
        if (!Sg.p.d0(str2)) {
            T0.b(str2, (i) null, aVar3.i(), 0, (V0.n) null, (V0.p) null, (V0.h) null, 0, (k) null, (j) null, 0, 0, false, 0, 0, (C6798l) null, intercomTheme2.getTypography(h10, i16).getType05(), h10, ((i10 >> 9) & 14) | 384, 0, 65530);
        }
        h10.M();
        h10.u();
        h10.u();
        V.b(d.a(Q.b.f5154a.a()), M0.i.a(R.string.intercom_dismiss, h10, 0), androidx.compose.foundation.d.d(aVar7, false, (String) null, (g) null, aVar, 7, (Object) null), aVar3.i(), h10, 3072, 0);
        h10.u();
        Y0 k12 = h10.k();
        if (k12 != null) {
            k12.a(new h(iVar, avatar, str, str2, aVar, i10));
        }
    }

    /* access modifiers changed from: private */
    public static final C6514M TopBar$lambda$3(i iVar, Avatar avatar, String str, String str2, C6787a aVar, int i10, C1500m mVar, int i11) {
        C6496s.h(iVar, "$modifier");
        C6496s.h(avatar, "$avatar");
        C6496s.h(str, "$title");
        C6496s.h(str2, "$subTitle");
        C6496s.h(aVar, "$onCloseClick");
        TopBar(iVar, avatar, str, str2, aVar, mVar, M0.a(i10 | 1));
        return C6514M.f71813a;
    }
}
