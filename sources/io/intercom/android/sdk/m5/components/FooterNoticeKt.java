package io.intercom.android.sdk.m5.components;

import B.l;
import C.C1085c;
import C.C1090h;
import C.C1093k;
import C.W;
import C.Z;
import C.a0;
import H0.F;
import J0.C1241g;
import Q0.T;
import V.O0;
import V.T0;
import V0.n;
import Y.C1494j;
import Y.C1500m;
import Y.C1523y;
import Y.F1;
import Y.M0;
import Y.Y0;
import androidx.compose.foundation.layout.d;
import androidx.compose.foundation.layout.f;
import androidx.compose.foundation.layout.q;
import androidx.compose.ui.platform.C1644k0;
import b1.j;
import b1.k;
import c1.h;
import c1.w;
import com.amazon.a.a.o.b;
import io.intercom.android.sdk.m5.components.avatar.AvatarWrapper;
import io.intercom.android.sdk.ui.common.TransitionsKt;
import io.intercom.android.sdk.ui.component.IntercomCardKt;
import io.intercom.android.sdk.ui.component.IntercomCardStyle;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import java.util.List;
import k0.c;
import k0.i;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import lf.C6514M;
import r0.g2;
import v.C2721d;
import w.C2777V;
import x.C2868g;
import yf.C6787a;
import yf.C6798l;
import yf.p;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a=\u0010\n\u001a\u00020\b2\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0001¢\u0006\u0004\b\n\u0010\u000b\u001a7\u0010\r\u001a\u00020\b2\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0001¢\u0006\u0004\b\r\u0010\u000e\u001a3\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0003¢\u0006\u0004\b\u000f\u0010\u0010\u001a%\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0003¢\u0006\u0004\b\u0011\u0010\u0012\u001a\u000f\u0010\u0013\u001a\u00020\bH\u0001¢\u0006\u0004\b\u0013\u0010\u0014\u001a\u000f\u0010\u0015\u001a\u00020\bH\u0001¢\u0006\u0004\b\u0015\u0010\u0014\u001a\u000f\u0010\u0016\u001a\u00020\bH\u0001¢\u0006\u0004\b\u0016\u0010\u0014\u001a\u000f\u0010\u0017\u001a\u00020\bH\u0001¢\u0006\u0004\b\u0017\u0010\u0014\u001a\u000f\u0010\u0018\u001a\u00020\bH\u0001¢\u0006\u0004\b\u0018\u0010\u0014\"\u001a\u0010\u001a\u001a\u00020\u00198\u0000X\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"Lk0/i;", "modifier", "", "title", "", "Lio/intercom/android/sdk/m5/components/avatar/AvatarWrapper;", "avatars", "Lkotlin/Function0;", "Llf/M;", "onClick", "FooterNoticePill", "(Lk0/i;Ljava/lang/String;Ljava/util/List;Lyf/a;LY/m;II)V", "subtitle", "ExpandedFooterNotice", "(Lk0/i;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;LY/m;II)V", "FooterNoticePillWithoutAnimation", "(Ljava/lang/String;Ljava/util/List;Lyf/a;LY/m;I)V", "FooterTitle", "(Ljava/lang/String;Ljava/util/List;LY/m;I)V", "ExpandedFooterNoticePreview", "(LY/m;I)V", "ExpandedFooterNoticePreviewMultipleAvatars", "ExpandedTitleOnlyFooterNoticePreview", "FooterNoticePillPreview", "FooterNoticePillMultipleAvatarsPreview", "Lc1/h;", "HandoverPillBottomPadding", "F", "getHandoverPillBottomPadding", "()F", "intercom-sdk-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class FooterNoticeKt {
    private static final float HandoverPillBottomPadding = h.j((float) 10);

    public static final void ExpandedFooterNotice(i iVar, String str, String str2, List<AvatarWrapper> list, C1500m mVar, int i10, int i11) {
        i iVar2;
        i iVar3;
        String str3 = str;
        List<AvatarWrapper> list2 = list;
        C6496s.h(str3, b.f37461S);
        C6496s.h(str2, "subtitle");
        C6496s.h(list2, "avatars");
        C1500m h10 = mVar.h(-1076553086);
        if ((i11 & 1) != 0) {
            iVar2 = i.f23074a;
        } else {
            iVar2 = iVar;
        }
        F a10 = C1090h.a(C1085c.f882a.g(), c.f23044a.g(), h10, 48);
        int a11 = C1494j.a(h10, 0);
        C1523y p10 = h10.p();
        i e10 = k0.h.e(h10, iVar2);
        C1241g.a aVar = C1241g.f3853J;
        C6787a a12 = aVar.a();
        if (h10.j() == null) {
            C1494j.c();
        }
        h10.F();
        if (h10.f()) {
            h10.U(a12);
        } else {
            h10.q();
        }
        C1500m a13 = F1.a(h10);
        F1.b(a13, a10, aVar.c());
        F1.b(a13, p10, aVar.e());
        p b10 = aVar.b();
        if (a13.f() || !C6496s.c(a13.A(), Integer.valueOf(a11))) {
            a13.r(Integer.valueOf(a11));
            a13.V(Integer.valueOf(a11), b10);
        }
        F1.b(a13, e10, aVar.d());
        C1093k kVar = C1093k.f978a;
        FooterTitle(str3, list2, h10, ((i10 >> 3) & 14) | 64);
        h10.T(2043466329);
        if (str2.length() > 0) {
            a0.a(q.i(i.f23074a, h.j((float) 8)), h10, 6);
            IntercomTheme intercomTheme = IntercomTheme.INSTANCE;
            int i12 = IntercomTheme.$stable;
            iVar3 = iVar2;
            String str4 = str2;
            T0.b(str4, (i) null, intercomTheme.getColors(h10, i12).m686getDescriptionText0d7_KjU(), 0, (n) null, (V0.p) null, (V0.h) null, 0, (k) null, j.h(j.f19110b.a()), 0, 0, false, 0, 0, (C6798l) null, intercomTheme.getTypography(h10, i12).getType04Point5(), h10, (i10 >> 6) & 14, 0, 65018);
        } else {
            iVar3 = iVar2;
        }
        h10.M();
        h10.u();
        Y0 k10 = h10.k();
        if (k10 != null) {
            k10.a(new C6040n0(iVar3, str, str2, list, i10, i11));
        }
    }

    /* access modifiers changed from: private */
    public static final C6514M ExpandedFooterNotice$lambda$6(i iVar, String str, String str2, List list, int i10, int i11, C1500m mVar, int i12) {
        C6496s.h(str, "$title");
        C6496s.h(str2, "$subtitle");
        C6496s.h(list, "$avatars");
        ExpandedFooterNotice(iVar, str, str2, list, mVar, M0.a(i10 | 1), i11);
        return C6514M.f71813a;
    }

    public static final void ExpandedFooterNoticePreview(C1500m mVar, int i10) {
        C1500m h10 = mVar.h(1644521079);
        if (i10 != 0 || !h10.i()) {
            O0.a((i) null, (g2) null, 0, 0, 0.0f, 0.0f, (C2868g) null, ComposableSingletons$FooterNoticeKt.INSTANCE.m162getLambda1$intercom_sdk_base_release(), h10, 12582912, 127);
        } else {
            h10.I();
        }
        Y0 k10 = h10.k();
        if (k10 != null) {
            k10.a(new C6044p0(i10));
        }
    }

    /* access modifiers changed from: private */
    public static final C6514M ExpandedFooterNoticePreview$lambda$10(int i10, C1500m mVar, int i11) {
        ExpandedFooterNoticePreview(mVar, M0.a(i10 | 1));
        return C6514M.f71813a;
    }

    public static final void ExpandedFooterNoticePreviewMultipleAvatars(C1500m mVar, int i10) {
        C1500m h10 = mVar.h(419901737);
        if (i10 != 0 || !h10.i()) {
            O0.a((i) null, (g2) null, 0, 0, 0.0f, 0.0f, (C2868g) null, ComposableSingletons$FooterNoticeKt.INSTANCE.m163getLambda2$intercom_sdk_base_release(), h10, 12582912, 127);
        } else {
            h10.I();
        }
        Y0 k10 = h10.k();
        if (k10 != null) {
            k10.a(new C6034k0(i10));
        }
    }

    /* access modifiers changed from: private */
    public static final C6514M ExpandedFooterNoticePreviewMultipleAvatars$lambda$11(int i10, C1500m mVar, int i11) {
        ExpandedFooterNoticePreviewMultipleAvatars(mVar, M0.a(i10 | 1));
        return C6514M.f71813a;
    }

    public static final void ExpandedTitleOnlyFooterNoticePreview(C1500m mVar, int i10) {
        C1500m h10 = mVar.h(-385296499);
        if (i10 != 0 || !h10.i()) {
            O0.a((i) null, (g2) null, 0, 0, 0.0f, 0.0f, (C2868g) null, ComposableSingletons$FooterNoticeKt.INSTANCE.m164getLambda3$intercom_sdk_base_release(), h10, 12582912, 127);
        } else {
            h10.I();
        }
        Y0 k10 = h10.k();
        if (k10 != null) {
            k10.a(new C6036l0(i10));
        }
    }

    /* access modifiers changed from: private */
    public static final C6514M ExpandedTitleOnlyFooterNoticePreview$lambda$12(int i10, C1500m mVar, int i11) {
        ExpandedTitleOnlyFooterNoticePreview(mVar, M0.a(i10 | 1));
        return C6514M.f71813a;
    }

    public static final void FooterNoticePill(i iVar, String str, List<AvatarWrapper> list, C6787a aVar, C1500m mVar, int i10, int i11) {
        i.a aVar2;
        String str2 = str;
        List<AvatarWrapper> list2 = list;
        C6787a aVar3 = aVar;
        C6496s.h(str2, b.f37461S);
        C6496s.h(list2, "avatars");
        C6496s.h(aVar3, "onClick");
        C1500m h10 = mVar.h(2116373339);
        if ((i11 & 1) != 0) {
            aVar2 = i.f23074a;
        } else {
            aVar2 = iVar;
        }
        F h11 = d.h(c.f23044a.o(), false);
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
        h10.T(-2063426416);
        Object A10 = h10.A();
        C2777V v10 = A10;
        if (A10 == C1500m.f10026a.a()) {
            C2777V v11 = new C2777V(Boolean.FALSE);
            v11.h(Boolean.TRUE);
            h10.r(v11);
            v10 = v11;
        }
        h10.M();
        C2721d.f((C2777V) v10, (i) null, TransitionsKt.floatingButtonEnterTransition((int) ((c1.d) h10.m(C1644k0.e())).t1(HandoverPillBottomPadding)), (androidx.compose.animation.k) null, (String) null, g0.c.e(-1063955783, true, new FooterNoticeKt$FooterNoticePill$1$1(str2, list2, aVar3), h10, 54), h10, C2777V.f27247d | 196608, 26);
        h10.u();
        Y0 k10 = h10.k();
        if (k10 != null) {
            k10.a(new C6030i0(aVar2, str, list, aVar, i10, i11));
        }
    }

    /* access modifiers changed from: private */
    public static final C6514M FooterNoticePill$lambda$4(i iVar, String str, List list, C6787a aVar, int i10, int i11, C1500m mVar, int i12) {
        C6496s.h(str, "$title");
        C6496s.h(list, "$avatars");
        C6496s.h(aVar, "$onClick");
        FooterNoticePill(iVar, str, list, aVar, mVar, M0.a(i10 | 1), i11);
        return C6514M.f71813a;
    }

    public static final void FooterNoticePillMultipleAvatarsPreview(C1500m mVar, int i10) {
        C1500m h10 = mVar.h(961872365);
        if (i10 != 0 || !h10.i()) {
            O0.a((i) null, (g2) null, 0, 0, 0.0f, 0.0f, (C2868g) null, ComposableSingletons$FooterNoticeKt.INSTANCE.m166getLambda5$intercom_sdk_base_release(), h10, 12582912, 127);
        } else {
            h10.I();
        }
        Y0 k10 = h10.k();
        if (k10 != null) {
            k10.a(new C6038m0(i10));
        }
    }

    /* access modifiers changed from: private */
    public static final C6514M FooterNoticePillMultipleAvatarsPreview$lambda$14(int i10, C1500m mVar, int i11) {
        FooterNoticePillMultipleAvatarsPreview(mVar, M0.a(i10 | 1));
        return C6514M.f71813a;
    }

    public static final void FooterNoticePillPreview(C1500m mVar, int i10) {
        C1500m h10 = mVar.h(615648759);
        if (i10 != 0 || !h10.i()) {
            O0.a((i) null, (g2) null, 0, 0, 0.0f, 0.0f, (C2868g) null, ComposableSingletons$FooterNoticeKt.INSTANCE.m165getLambda4$intercom_sdk_base_release(), h10, 12582912, 127);
        } else {
            h10.I();
        }
        Y0 k10 = h10.k();
        if (k10 != null) {
            k10.a(new C6028h0(i10));
        }
    }

    /* access modifiers changed from: private */
    public static final C6514M FooterNoticePillPreview$lambda$13(int i10, C1500m mVar, int i11) {
        FooterNoticePillPreview(mVar, M0.a(i10 | 1));
        return C6514M.f71813a;
    }

    /* access modifiers changed from: private */
    public static final void FooterNoticePillWithoutAnimation(String str, List<AvatarWrapper> list, C6787a aVar, C1500m mVar, int i10) {
        String str2 = str;
        List<AvatarWrapper> list2 = list;
        int i11 = i10;
        C1500m h10 = mVar.h(-2078164816);
        IntercomCardKt.IntercomCard(aVar, androidx.compose.foundation.layout.n.i(i.f23074a, HandoverPillBottomPadding), false, IntercomCardStyle.INSTANCE.m591defaultStyleqUnfpCA(IntercomTheme.INSTANCE.getShapes(h10, IntercomTheme.$stable).a(), 0, 0, 0.0f, (C2868g) null, 0, h10, IntercomCardStyle.$stable << 18, 62), (l) null, g0.c.e(-1065463783, true, new FooterNoticeKt$FooterNoticePillWithoutAnimation$1(str2, list2), h10, 54), h10, ((i11 >> 6) & 14) | 196656 | (IntercomCardStyle.Style.$stable << 9), 20);
        Y0 k10 = h10.k();
        if (k10 != null) {
            k10.a(new C6032j0(str2, list2, aVar, i11));
        }
    }

    /* access modifiers changed from: private */
    public static final C6514M FooterNoticePillWithoutAnimation$lambda$7(String str, List list, C6787a aVar, int i10, C1500m mVar, int i11) {
        C6496s.h(str, "$title");
        C6496s.h(list, "$avatars");
        C6496s.h(aVar, "$onClick");
        FooterNoticePillWithoutAnimation(str, list, aVar, mVar, M0.a(i10 | 1));
        return C6514M.f71813a;
    }

    /* access modifiers changed from: private */
    public static final void FooterTitle(String str, List<AvatarWrapper> list, C1500m mVar, int i10) {
        List<AvatarWrapper> list2 = list;
        int i11 = i10;
        C1500m h10 = mVar.h(-973759395);
        C1085c.f b10 = C1085c.f882a.b();
        c.C0368c i12 = c.f23044a.i();
        i.a aVar = i.f23074a;
        F b11 = W.b(b10, i12, h10, 54);
        int a10 = C1494j.a(h10, 0);
        C1523y p10 = h10.p();
        i e10 = k0.h.e(h10, aVar);
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
        F1.b(a12, b11, aVar2.c());
        F1.b(a12, p10, aVar2.e());
        p b12 = aVar2.b();
        if (a12.f() || !C6496s.c(a12.A(), Integer.valueOf(a10))) {
            a12.r(Integer.valueOf(a10));
            a12.V(Integer.valueOf(a10), b12);
        }
        F1.b(a12, e10, aVar2.d());
        Z z10 = Z.f873a;
        h10.T(1829795659);
        if (!list2.isEmpty()) {
            AvatarGroupKt.m136AvatarGroupJ8mCjc(list, (i) null, h.j((float) 16), w.f(10), h10, 3464, 2);
            a0.a(q.r(aVar, h.j((float) 8)), h10, 6);
        }
        h10.M();
        IntercomTheme intercomTheme = IntercomTheme.INSTANCE;
        int i13 = IntercomTheme.$stable;
        T type04Point5 = intercomTheme.getTypography(h10, i13).getType04Point5();
        C1500m mVar2 = h10;
        T0.b(str, (i) null, intercomTheme.getColors(h10, i13).m686getDescriptionText0d7_KjU(), 0, (n) null, (V0.p) null, (V0.h) null, 0, (k) null, j.h(j.f19110b.a()), 0, 0, false, 0, 0, (C6798l) null, type04Point5, mVar2, i11 & 14, 0, 65018);
        mVar2.u();
        Y0 k10 = mVar2.k();
        if (k10 != null) {
            k10.a(new C6042o0(str, list2, i11));
        }
    }

    /* access modifiers changed from: private */
    public static final C6514M FooterTitle$lambda$9(String str, List list, int i10, C1500m mVar, int i11) {
        C6496s.h(str, "$title");
        C6496s.h(list, "$avatars");
        FooterTitle(str, list, mVar, M0.a(i10 | 1));
        return C6514M.f71813a;
    }

    public static final float getHandoverPillBottomPadding() {
        return HandoverPillBottomPadding;
    }
}
