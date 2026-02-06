package io.intercom.android.sdk.m5.components;

import H0.F;
import I.f;
import J0.C1241g;
import V.B0;
import Y.C1494j;
import Y.C1500m;
import Y.C1523y;
import Y.F1;
import Y.M0;
import Y.Y0;
import androidx.compose.foundation.layout.d;
import androidx.compose.foundation.layout.q;
import c1.h;
import c1.w;
import io.intercom.android.sdk.m5.components.avatar.AvatarIconKt;
import io.intercom.android.sdk.m5.components.avatar.AvatarShape;
import io.intercom.android.sdk.m5.components.avatar.AvatarWrapper;
import io.intercom.android.sdk.m5.shapes.CutAvatarBoxShape;
import io.intercom.android.sdk.ui.IntercomPreviews;
import io.intercom.android.sdk.ui.theme.IntercomColors;
import io.intercom.android.sdk.ui.theme.IntercomThemeKt;
import io.intercom.android.sdk.ui.theme.IntercomTypography;
import java.util.List;
import k0.c;
import k0.i;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lf.C6502A;
import lf.C6514M;
import mf.C6565s;
import r0.C2544x0;
import r0.g2;
import yf.C6787a;
import yf.p;

@Metadata(d1 = {"\u0000$\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u001a;\u0010\f\u001a\u00020\t2\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u0007H\u0001¢\u0006\u0004\b\n\u0010\u000b\u001a\u000f\u0010\r\u001a\u00020\tH\u0003¢\u0006\u0004\b\r\u0010\u000e\u001a\u000f\u0010\u000f\u001a\u00020\tH\u0003¢\u0006\u0004\b\u000f\u0010\u000e\u001a\u000f\u0010\u0010\u001a\u00020\tH\u0003¢\u0006\u0004\b\u0010\u0010\u000e¨\u0006\u0011"}, d2 = {"", "Lio/intercom/android/sdk/m5/components/avatar/AvatarWrapper;", "avatars", "Lk0/i;", "modifier", "Lr0/g2;", "avatarShape", "Lc1/h;", "size", "Llf/M;", "AvatarTriangleGroup--jt2gSs", "(Ljava/util/List;Lk0/i;Lr0/g2;FLY/m;II)V", "AvatarTriangleGroup", "SingleAvatarPreview", "(LY/m;I)V", "DoubleAvatarsPreview", "TripleAvatarsPreview", "intercom-sdk-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class AvatarTriangleGroupKt {
    /* renamed from: AvatarTriangleGroup--jt2gSs  reason: not valid java name */
    public static final void m137AvatarTriangleGroupjt2gSs(List<AvatarWrapper> list, i iVar, g2 g2Var, float f10, C1500m mVar, int i10, int i11) {
        i.a aVar;
        int i12;
        f fVar;
        float f11;
        float f12;
        i iVar2;
        AvatarWrapper avatarWrapper;
        AvatarWrapper avatarWrapper2;
        AvatarWrapper avatarWrapper3;
        AvatarWrapper avatarWrapper4;
        List<AvatarWrapper> list2 = list;
        C6496s.h(list2, "avatars");
        C1500m h10 = mVar.h(-534156342);
        if ((i11 & 2) != 0) {
            aVar = i.f23074a;
        } else {
            aVar = iVar;
        }
        if ((i11 & 4) != 0) {
            fVar = AvatarIconKt.getComposeShape(AvatarShape.CIRCLE);
            i12 = i10 & -897;
        } else {
            fVar = g2Var;
            i12 = i10;
        }
        if ((i11 & 8) != 0) {
            f11 = h.j((float) 32);
        } else {
            f11 = f10;
        }
        long f13 = w.f(12);
        if (list.size() > 1) {
            h10.T(643591148);
            float f14 = (float) 2;
            float j10 = h.j(h.j(f11 / f14) + h.j(h.j((float) 1) * f14));
            i n10 = q.n(aVar, f11);
            c.a aVar2 = c.f23044a;
            F h11 = d.h(aVar2.o(), false);
            int a10 = C1494j.a(h10, 0);
            C1523y p10 = h10.p();
            i e10 = k0.h.e(h10, n10);
            C1241g.a aVar3 = C1241g.f3853J;
            C6787a a11 = aVar3.a();
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
            F1.b(a12, h11, aVar3.c());
            F1.b(a12, p10, aVar3.e());
            p b10 = aVar3.b();
            if (a12.f() || !C6496s.c(a12.A(), Integer.valueOf(a10))) {
                a12.r(Integer.valueOf(a10));
                a12.V(Integer.valueOf(a10), b10);
            }
            F1.b(a12, e10, aVar3.d());
            androidx.compose.foundation.layout.f fVar2 = androidx.compose.foundation.layout.f.f12848a;
            if (list.size() > 0) {
                avatarWrapper2 = list2.get(0);
            } else {
                avatarWrapper2 = AvatarWrapper.Companion.getNULL();
            }
            i.a aVar4 = i.f23074a;
            float f15 = f11 - j10;
            float f16 = f14;
            float f17 = j10;
            i.a aVar5 = aVar4;
            androidx.compose.foundation.layout.f fVar3 = fVar2;
            f12 = f11;
            AvatarIconKt.m208AvatarIconRd90Nhg(fVar2.e(q.n(aVar4, j10), aVar2.m()), avatarWrapper2, new CutAvatarBoxShape(fVar, h.j(f14), C6565s.q(C6502A.a(h.e(h.j(h.j(f15) / f14)), h.e(h.j(f15))), C6502A.a(h.e(h.j(-h.j(h.j(f15) / f14))), h.e(h.j(f15)))), (DefaultConstructorMarker) null), false, f13, (C2544x0) null, h10, 24640, 40);
            if (1 < list.size()) {
                avatarWrapper3 = list2.get(1);
            } else {
                avatarWrapper3 = AvatarWrapper.Companion.getNULL();
            }
            float f18 = f17;
            i.a aVar6 = aVar5;
            androidx.compose.foundation.layout.f fVar4 = fVar3;
            androidx.compose.foundation.layout.f fVar5 = fVar4;
            i.a aVar7 = aVar6;
            i iVar3 = aVar;
            float f19 = f18;
            AvatarIconKt.m208AvatarIconRd90Nhg(fVar4.e(q.n(aVar6, f18), aVar2.d()), avatarWrapper3, new CutAvatarBoxShape(fVar, h.j(f16), C6565s.e(C6502A.a(h.e(h.j(f15)), h.e(h.j((float) 0)))), (DefaultConstructorMarker) null), false, f13, (C2544x0) null, h10, 24640, 40);
            if (2 < list.size()) {
                avatarWrapper4 = list2.get(2);
            } else {
                avatarWrapper4 = AvatarWrapper.Companion.getNULL();
            }
            AvatarIconKt.m208AvatarIconRd90Nhg(fVar5.e(q.n(aVar7, f19), aVar2.c()), avatarWrapper4, fVar, false, f13, (C2544x0) null, h10, (i12 & 896) | 24640, 40);
            h10.u();
            h10.M();
            iVar2 = iVar3;
        } else {
            f12 = f11;
            i iVar4 = aVar;
            h10.T(645459394);
            if (list.size() > 0) {
                avatarWrapper = list2.get(0);
            } else {
                avatarWrapper = AvatarWrapper.Companion.getNULL();
            }
            AvatarWrapper avatarWrapper5 = avatarWrapper;
            iVar2 = iVar4;
            i n11 = q.n(iVar2, f12);
            AvatarShape shape = avatarWrapper5.getAvatar().getShape();
            C6496s.g(shape, "getShape(...)");
            AvatarIconKt.m208AvatarIconRd90Nhg(n11, avatarWrapper5, AvatarIconKt.getComposeShape(shape), false, 0, (C2544x0) null, h10, 64, 56);
            h10.M();
        }
        Y0 k10 = h10.k();
        if (k10 != null) {
            k10.a(new C6021e(list, iVar2, fVar, f12, i10, i11));
        }
    }

    /* access modifiers changed from: private */
    public static final C6514M AvatarTriangleGroup__jt2gSs$lambda$5(List list, i iVar, g2 g2Var, float f10, int i10, int i11, C1500m mVar, int i12) {
        C6496s.h(list, "$avatars");
        m137AvatarTriangleGroupjt2gSs(list, iVar, g2Var, f10, mVar, M0.a(i10 | 1), i11);
        return C6514M.f71813a;
    }

    @IntercomPreviews
    private static final void DoubleAvatarsPreview(C1500m mVar, int i10) {
        C1500m h10 = mVar.h(-2121947035);
        if (i10 != 0 || !h10.i()) {
            IntercomThemeKt.IntercomTheme((IntercomColors) null, (IntercomTypography) null, (B0) null, ComposableSingletons$AvatarTriangleGroupKt.INSTANCE.m142getLambda2$intercom_sdk_base_release(), h10, 3072, 7);
        } else {
            h10.I();
        }
        Y0 k10 = h10.k();
        if (k10 != null) {
            k10.a(new C6019d(i10));
        }
    }

    /* access modifiers changed from: private */
    public static final C6514M DoubleAvatarsPreview$lambda$7(int i10, C1500m mVar, int i11) {
        DoubleAvatarsPreview(mVar, M0.a(i10 | 1));
        return C6514M.f71813a;
    }

    @IntercomPreviews
    private static final void SingleAvatarPreview(C1500m mVar, int i10) {
        C1500m h10 = mVar.h(-932654159);
        if (i10 != 0 || !h10.i()) {
            IntercomThemeKt.IntercomTheme((IntercomColors) null, (IntercomTypography) null, (B0) null, ComposableSingletons$AvatarTriangleGroupKt.INSTANCE.m141getLambda1$intercom_sdk_base_release(), h10, 3072, 7);
        } else {
            h10.I();
        }
        Y0 k10 = h10.k();
        if (k10 != null) {
            k10.a(new C6025g(i10));
        }
    }

    /* access modifiers changed from: private */
    public static final C6514M SingleAvatarPreview$lambda$6(int i10, C1500m mVar, int i11) {
        SingleAvatarPreview(mVar, M0.a(i10 | 1));
        return C6514M.f71813a;
    }

    @IntercomPreviews
    private static final void TripleAvatarsPreview(C1500m mVar, int i10) {
        C1500m h10 = mVar.h(-724464974);
        if (i10 != 0 || !h10.i()) {
            IntercomThemeKt.IntercomTheme((IntercomColors) null, (IntercomTypography) null, (B0) null, ComposableSingletons$AvatarTriangleGroupKt.INSTANCE.m143getLambda3$intercom_sdk_base_release(), h10, 3072, 7);
        } else {
            h10.I();
        }
        Y0 k10 = h10.k();
        if (k10 != null) {
            k10.a(new C6023f(i10));
        }
    }

    /* access modifiers changed from: private */
    public static final C6514M TripleAvatarsPreview$lambda$8(int i10, C1500m mVar, int i11) {
        TripleAvatarsPreview(mVar, M0.a(i10 | 1));
        return C6514M.f71813a;
    }
}
