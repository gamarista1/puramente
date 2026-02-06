package io.intercom.android.sdk.survey.ui.components;

import H0.C1187h;
import H0.F;
import I.g;
import J0.C1241g;
import M0.e;
import O0.m;
import O0.t;
import O0.v;
import Q0.T;
import V.T0;
import V0.n;
import Y.C1494j;
import Y.C1500m;
import Y.C1523y;
import Y.F1;
import Y.M0;
import Y.Y0;
import android.content.Context;
import androidx.compose.foundation.b;
import androidx.compose.foundation.layout.d;
import androidx.compose.foundation.layout.f;
import androidx.compose.foundation.layout.q;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import b1.j;
import b1.k;
import c1.h;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.models.Avatar;
import io.intercom.android.sdk.ui.coil.IntercomImageLoaderKt;
import io.intercom.android.sdk.utilities.ColorExtensionsKt;
import j4.C3622i;
import k0.c;
import k0.i;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import lf.C6514M;
import m4.C3773b;
import o0.C2342e;
import r0.C2544x0;
import r0.C2547y0;
import r0.g2;
import x.C2842F;
import yf.C6787a;
import yf.C6798l;
import yf.p;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a)\u0010\t\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\u0007\u0010\b\u001a\u000f\u0010\n\u001a\u00020\u0006H\u0001¢\u0006\u0004\b\n\u0010\u000b\u001a\u000f\u0010\f\u001a\u00020\u0006H\u0001¢\u0006\u0004\b\f\u0010\u000b¨\u0006\r"}, d2 = {"Lio/intercom/android/sdk/models/Avatar;", "avatar", "Lr0/x0;", "backgroundColor", "Lc1/h;", "size", "Llf/M;", "CircularAvatar-aM-cp0Q", "(Lio/intercom/android/sdk/models/Avatar;JFLY/m;II)V", "CircularAvatar", "PreviewDefaultAvatar", "(LY/m;I)V", "PreviewInitialAvatar", "intercom-sdk-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class CircularAvatarComponentKt {
    /* renamed from: CircularAvatar-aM-cp0Q  reason: not valid java name */
    public static final void m465CircularAvataraMcp0Q(Avatar avatar, long j10, float f10, C1500m mVar, int i10, int i11) {
        String str;
        i.a aVar;
        C6496s.h(avatar, "avatar");
        C1500m h10 = mVar.h(-276383091);
        float j11 = (i11 & 4) != 0 ? h.j((float) 40) : f10;
        i.a aVar2 = i.f23074a;
        c.a aVar3 = c.f23044a;
        F h11 = d.h(aVar3.o(), false);
        int a10 = C1494j.a(h10, 0);
        C1523y p10 = h10.p();
        i e10 = k0.h.e(h10, aVar2);
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
        F1.b(a12, h11, aVar4.c());
        F1.b(a12, p10, aVar4.e());
        p b10 = aVar4.b();
        if (a12.f() || !C6496s.c(a12.A(), Integer.valueOf(a10))) {
            a12.r(Integer.valueOf(a10));
            a12.V(Integer.valueOf(a10), b10);
        }
        F1.b(a12, e10, aVar4.d());
        f fVar = f.f12848a;
        String a13 = M0.i.a(R.string.intercom_surveys_sender_image, h10, 0);
        String initials = avatar.getInitials();
        C6496s.g(initials, "getInitials(...)");
        if (initials.length() > 0) {
            h10.T(-2071598305);
            i d10 = b.d(C2342e.a(q.n(aVar2, j11), g.e()), j10, (g2) null, 2, (Object) null);
            F h12 = d.h(aVar3.o(), false);
            int a14 = C1494j.a(h10, 0);
            C1523y p11 = h10.p();
            i e11 = k0.h.e(h10, d10);
            C6787a a15 = aVar4.a();
            if (h10.j() == null) {
                C1494j.c();
            }
            h10.F();
            if (h10.f()) {
                h10.U(a15);
            } else {
                h10.q();
            }
            C1500m a16 = F1.a(h10);
            F1.b(a16, h12, aVar4.c());
            F1.b(a16, p11, aVar4.e());
            p b11 = aVar4.b();
            if (a16.f() || !C6496s.c(a16.A(), Integer.valueOf(a14))) {
                a16.r(Integer.valueOf(a14));
                a16.V(Integer.valueOf(a14), b11);
            }
            F1.b(a16, e11, aVar4.d());
            String initials2 = avatar.getInitials();
            C6496s.g(initials2, "getInitials(...)");
            i e12 = fVar.e(aVar2, aVar3.e());
            h10.T(592336280);
            boolean S10 = h10.S(a13);
            Object A10 = h10.A();
            if (S10 || A10 == C1500m.f10026a.a()) {
                A10 = new C6278a(a13);
                h10.r(A10);
            }
            h10.M();
            str = a13;
            aVar = aVar2;
            T0.b(initials2, m.d(e12, false, (C6798l) A10, 1, (Object) null), ColorExtensionsKt.m712generateTextColor8_81llA(j10), 0, (n) null, (V0.p) null, (V0.h) null, 0, (k) null, (j) null, 0, 0, false, 0, 0, (C6798l) null, (T) null, h10, 0, 0, 131064);
            h10.u();
            h10.M();
        } else {
            aVar = aVar2;
            str = a13;
            h10.T(-2071004283);
            i d11 = b.d(C2342e.a(q.n(aVar, j11), g.e()), j10, (g2) null, 2, (Object) null);
            F h13 = d.h(aVar3.o(), false);
            int a17 = C1494j.a(h10, 0);
            C1523y p12 = h10.p();
            i e13 = k0.h.e(h10, d11);
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
            F1.b(a19, h13, aVar4.c());
            F1.b(a19, p12, aVar4.e());
            p b12 = aVar4.b();
            if (a19.f() || !C6496s.c(a19.A(), Integer.valueOf(a17))) {
                a19.r(Integer.valueOf(a17));
                a19.V(Integer.valueOf(a17), b12);
            }
            F1.b(a19, e13, aVar4.d());
            C2842F.a(e.c(R.drawable.intercom_default_avatar_icon, h10, 0), str, fVar.e(aVar, aVar3.e()), (c) null, C1187h.f2609a.a(), 0.0f, C2547y0.a.c(C2547y0.f25576b, ColorExtensionsKt.m712generateTextColor8_81llA(j10), 0, 2, (Object) null), h10, 24584, 40);
            h10.u();
            h10.M();
        }
        h10.T(-1313708522);
        String imageUrl = avatar.getImageUrl();
        C6496s.g(imageUrl, "getImageUrl(...)");
        if (imageUrl.length() > 0) {
            String imageUrl2 = avatar.getImageUrl();
            X3.g imageLoader = IntercomImageLoaderKt.getImageLoader((Context) h10.m(AndroidCompositionLocals_androidKt.g()));
            h10.z(1750824323);
            C3622i.a d12 = new C3622i.a((Context) h10.m(AndroidCompositionLocals_androidKt.g())).d(imageUrl2);
            d12.c(true);
            d12.E(new C3773b());
            C1500m mVar2 = h10;
            Z3.f c10 = Z3.h.c(d12.a(), imageLoader, (C6798l) null, (C6798l) null, (C1187h) null, 0, (Z3.p) null, mVar2, 72, 124);
            h10.R();
            C2842F.a(c10, str, q.n(aVar, j11), (c) null, (C1187h) null, 0.0f, (C2547y0) null, mVar2, 0, 120);
        }
        h10.M();
        h10.u();
        Y0 k10 = h10.k();
        if (k10 != null) {
            k10.a(new C6279b(avatar, j10, j11, i10, i11));
        }
    }

    /* access modifiers changed from: private */
    public static final C6514M CircularAvatar_aM_cp0Q$lambda$5$lambda$2$lambda$1$lambda$0(String str, v vVar) {
        C6496s.h(str, "$contentDescription");
        C6496s.h(vVar, "$this$semantics");
        t.Y(vVar, str);
        return C6514M.f71813a;
    }

    /* access modifiers changed from: private */
    public static final C6514M CircularAvatar_aM_cp0Q$lambda$6(Avatar avatar, long j10, float f10, int i10, int i11, C1500m mVar, int i12) {
        C6496s.h(avatar, "$avatar");
        m465CircularAvataraMcp0Q(avatar, j10, f10, mVar, M0.a(i10 | 1), i11);
        return C6514M.f71813a;
    }

    public static final void PreviewDefaultAvatar(C1500m mVar, int i10) {
        C1500m h10 = mVar.h(-1706634993);
        if (i10 != 0 || !h10.i()) {
            Avatar create = Avatar.create("", "");
            C6496s.g(create, "create(...)");
            m465CircularAvataraMcp0Q(create, C2544x0.f25560b.j(), 0.0f, h10, 56, 4);
        } else {
            h10.I();
        }
        Y0 k10 = h10.k();
        if (k10 != null) {
            k10.a(new C6280c(i10));
        }
    }

    /* access modifiers changed from: private */
    public static final C6514M PreviewDefaultAvatar$lambda$7(int i10, C1500m mVar, int i11) {
        PreviewDefaultAvatar(mVar, M0.a(i10 | 1));
        return C6514M.f71813a;
    }

    public static final void PreviewInitialAvatar(C1500m mVar, int i10) {
        C1500m h10 = mVar.h(1788709612);
        if (i10 != 0 || !h10.i()) {
            Avatar create = Avatar.create("", "PS");
            C6496s.g(create, "create(...)");
            m465CircularAvataraMcp0Q(create, C2544x0.f25560b.b(), 0.0f, h10, 56, 4);
        } else {
            h10.I();
        }
        Y0 k10 = h10.k();
        if (k10 != null) {
            k10.a(new C6281d(i10));
        }
    }

    /* access modifiers changed from: private */
    public static final C6514M PreviewInitialAvatar$lambda$8(int i10, C1500m mVar, int i11) {
        PreviewInitialAvatar(mVar, M0.a(i10 | 1));
        return C6514M.f71813a;
    }
}
