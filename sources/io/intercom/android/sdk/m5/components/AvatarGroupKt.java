package io.intercom.android.sdk.m5.components;

import C.C1085c;
import C.W;
import C.Z;
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
import androidx.compose.foundation.layout.q;
import c1.h;
import io.intercom.android.sdk.m5.components.avatar.AvatarIconKt;
import io.intercom.android.sdk.m5.components.avatar.AvatarShape;
import io.intercom.android.sdk.m5.components.avatar.AvatarWrapper;
import io.intercom.android.sdk.m5.shapes.OverlappedAvatarShape;
import io.intercom.android.sdk.ui.IntercomPreviews;
import io.intercom.android.sdk.ui.theme.IntercomColors;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import io.intercom.android.sdk.ui.theme.IntercomThemeKt;
import io.intercom.android.sdk.ui.theme.IntercomTypography;
import java.util.List;
import k0.c;
import k0.i;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lf.C6514M;
import mf.C6565s;
import r0.C2544x0;
import r0.g2;
import yf.C6787a;
import yf.p;

@Metadata(d1 = {"\u0000$\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a;\u0010\f\u001a\u00020\t2\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u0007H\u0001¢\u0006\u0004\b\n\u0010\u000b\u001a\u000f\u0010\r\u001a\u00020\tH\u0003¢\u0006\u0004\b\r\u0010\u000e\u001a\u000f\u0010\u000f\u001a\u00020\tH\u0003¢\u0006\u0004\b\u000f\u0010\u000e¨\u0006\u0010"}, d2 = {"", "Lio/intercom/android/sdk/m5/components/avatar/AvatarWrapper;", "avatars", "Lk0/i;", "modifier", "Lc1/h;", "avatarSize", "Lc1/v;", "placeHolderTextSize", "Llf/M;", "AvatarGroup--J8mCjc", "(Ljava/util/List;Lk0/i;FJLY/m;II)V", "AvatarGroup", "AvatarGroupPreview", "(LY/m;I)V", "AvatarGroupWithMixedShapesPreview", "intercom-sdk-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class AvatarGroupKt {
    /* renamed from: AvatarGroup--J8mCjc  reason: not valid java name */
    public static final void m136AvatarGroupJ8mCjc(List<AvatarWrapper> list, i iVar, float f10, long j10, C1500m mVar, int i10, int i11) {
        i.a aVar;
        float f11;
        int i12;
        long j11;
        g2 g2Var;
        List<AvatarWrapper> list2 = list;
        C6496s.h(list2, "avatars");
        C1500m h10 = mVar.h(-258460642);
        if ((i11 & 2) != 0) {
            aVar = i.f23074a;
        } else {
            aVar = iVar;
        }
        if ((i11 & 4) != 0) {
            f11 = h.j((float) 38);
        } else {
            f11 = f10;
        }
        if ((i11 & 8) != 0) {
            j11 = IntercomTheme.INSTANCE.getTypography(h10, IntercomTheme.$stable).getType04Point5().l();
            i12 = i10 & -7169;
        } else {
            j11 = j10;
            i12 = i10;
        }
        float f12 = (float) 2;
        float j12 = h.j(f12);
        C1085c.f n10 = C1085c.f882a.n(h.j(-j12));
        DefaultConstructorMarker defaultConstructorMarker = null;
        i x10 = q.x(aVar, (c) null, false, 3, (Object) null);
        F b10 = W.b(n10, c.f23044a.l(), h10, 6);
        int a10 = C1494j.a(h10, 0);
        C1523y p10 = h10.p();
        i e10 = k0.h.e(h10, x10);
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
        h10.T(700807476);
        int i13 = 0;
        for (Object next : list2) {
            int i14 = i13 + 1;
            if (i13 < 0) {
                C6565s.x();
            }
            AvatarWrapper avatarWrapper = (AvatarWrapper) next;
            if (i13 == 0) {
                AvatarShape shape = avatarWrapper.getAvatar().getShape();
                C6496s.g(shape, "getShape(...)");
                g2Var = AvatarIconKt.getComposeShape(shape);
            } else {
                AvatarShape shape2 = list2.get(i13 - 1).getAvatar().getShape();
                C6496s.g(shape2, "getShape(...)");
                f composeShape = AvatarIconKt.getComposeShape(shape2);
                float j13 = h.j(j12 * f12);
                AvatarShape shape3 = avatarWrapper.getAvatar().getShape();
                C6496s.g(shape3, "getShape(...)");
                g2Var = new OverlappedAvatarShape(AvatarIconKt.getComposeShape(shape3), composeShape, j13, defaultConstructorMarker);
            }
            float f13 = j12;
            AvatarIconKt.m208AvatarIconRd90Nhg(q.n(i.f23074a, f11), avatarWrapper, g2Var, false, j11, (C2544x0) null, h10, (57344 & (i12 << 3)) | 64, 40);
            i13 = i14;
            f12 = f12;
            defaultConstructorMarker = defaultConstructorMarker;
            j12 = f13;
        }
        h10.M();
        h10.u();
        Y0 k10 = h10.k();
        if (k10 != null) {
            k10.a(new C6013a(list, aVar, f11, j11, i10, i11));
        }
    }

    @IntercomPreviews
    private static final void AvatarGroupPreview(C1500m mVar, int i10) {
        C1500m h10 = mVar.h(-2091006176);
        if (i10 != 0 || !h10.i()) {
            IntercomThemeKt.IntercomTheme((IntercomColors) null, (IntercomTypography) null, (B0) null, ComposableSingletons$AvatarGroupKt.INSTANCE.m139getLambda1$intercom_sdk_base_release(), h10, 3072, 7);
        } else {
            h10.I();
        }
        Y0 k10 = h10.k();
        if (k10 != null) {
            k10.a(new C6017c(i10));
        }
    }

    /* access modifiers changed from: private */
    public static final C6514M AvatarGroupPreview$lambda$3(int i10, C1500m mVar, int i11) {
        AvatarGroupPreview(mVar, M0.a(i10 | 1));
        return C6514M.f71813a;
    }

    @IntercomPreviews
    private static final void AvatarGroupWithMixedShapesPreview(C1500m mVar, int i10) {
        C1500m h10 = mVar.h(-1253949399);
        if (i10 != 0 || !h10.i()) {
            IntercomThemeKt.IntercomTheme((IntercomColors) null, (IntercomTypography) null, (B0) null, ComposableSingletons$AvatarGroupKt.INSTANCE.m140getLambda2$intercom_sdk_base_release(), h10, 3072, 7);
        } else {
            h10.I();
        }
        Y0 k10 = h10.k();
        if (k10 != null) {
            k10.a(new C6015b(i10));
        }
    }

    /* access modifiers changed from: private */
    public static final C6514M AvatarGroupWithMixedShapesPreview$lambda$4(int i10, C1500m mVar, int i11) {
        AvatarGroupWithMixedShapesPreview(mVar, M0.a(i10 | 1));
        return C6514M.f71813a;
    }

    /* access modifiers changed from: private */
    public static final C6514M AvatarGroup__J8mCjc$lambda$2(List list, i iVar, float f10, long j10, int i10, int i11, C1500m mVar, int i12) {
        C6496s.h(list, "$avatars");
        m136AvatarGroupJ8mCjc(list, iVar, f10, j10, mVar, M0.a(i10 | 1), i11);
        return C6514M.f71813a;
    }
}
