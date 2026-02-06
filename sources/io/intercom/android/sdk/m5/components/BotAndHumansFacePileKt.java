package io.intercom.android.sdk.m5.components;

import C.C1085c;
import C.W;
import C.Z;
import H0.F;
import J0.C1241g;
import V.B0;
import Y.C1494j;
import Y.C1500m;
import Y.C1523y;
import Y.F1;
import Y.M0;
import Y.Y0;
import androidx.compose.foundation.layout.q;
import androidx.compose.ui.draw.b;
import c1.h;
import c1.t;
import io.intercom.android.sdk.m5.components.avatar.AvatarIconKt;
import io.intercom.android.sdk.m5.components.avatar.AvatarWrapper;
import io.intercom.android.sdk.models.Avatar;
import io.intercom.android.sdk.ui.IntercomPreviews;
import io.intercom.android.sdk.ui.theme.IntercomColors;
import io.intercom.android.sdk.ui.theme.IntercomThemeKt;
import io.intercom.android.sdk.ui.theme.IntercomTypography;
import java.util.List;
import k0.c;
import k0.i;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lf.C6502A;
import lf.C6514M;
import q0.C2427m;
import r0.C2541w0;
import r0.C2544x0;
import r0.g2;
import t0.C2602c;
import t0.C2603d;
import yf.C6787a;
import yf.C6798l;
import yf.p;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0007\u001aK\u0010\r\u001a\u00020\n2\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0016\u0010\u0005\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\bH\u0001¢\u0006\u0004\b\u000b\u0010\f\u001a-\u0010\u0010\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00042\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00020\u000eH\u0000¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u000f\u0010\u0012\u001a\u00020\nH\u0003¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u000f\u0010\u0014\u001a\u00020\nH\u0003¢\u0006\u0004\b\u0014\u0010\u0013¨\u0006\u0015"}, d2 = {"Lk0/i;", "modifier", "Lio/intercom/android/sdk/models/Avatar;", "botAvatar", "Lkotlin/Pair;", "teammateAvatarPair", "Lc1/h;", "botAvatarSize", "", "botName", "Llf/M;", "BotAndHumansFacePile-hGBTI10", "(Lk0/i;Lio/intercom/android/sdk/models/Avatar;Lkotlin/Pair;FLjava/lang/String;LY/m;II)V", "BotAndHumansFacePile", "", "humanAvatars", "humanAvatarPairForHome", "(Ljava/util/List;)Lkotlin/Pair;", "BotWithTwoTeammatesPreview", "(LY/m;I)V", "BotsWithOneTeammatePreview", "intercom-sdk-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class BotAndHumansFacePileKt {
    /* renamed from: BotAndHumansFacePile-hGBTI10  reason: not valid java name */
    public static final void m138BotAndHumansFacePilehGBTI10(i iVar, Avatar avatar, Pair<? extends Avatar, ? extends Avatar> pair, float f10, String str, C1500m mVar, int i10, int i11) {
        i.a aVar;
        String str2;
        float f11;
        float f12;
        Avatar avatar2 = avatar;
        float f13 = f10;
        C6496s.h(avatar2, "botAvatar");
        C6496s.h(pair, "teammateAvatarPair");
        C1500m h10 = mVar.h(957129373);
        if ((i11 & 1) != 0) {
            aVar = i.f23074a;
        } else {
            aVar = iVar;
        }
        if ((i11 & 16) != 0) {
            str2 = "";
        } else {
            str2 = str;
        }
        float j10 = h.j(((float) 0.75d) * f13);
        float j11 = h.j(((float) 0.25d) * j10);
        F b10 = W.b(C1085c.f882a.n(h.j(h.j(((float) 0.0625d) * f13) - j11)), c.f23044a.i(), h10, 48);
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
        F1.b(a12, b10, aVar2.c());
        F1.b(a12, p10, aVar2.e());
        p b11 = aVar2.b();
        if (a12.f() || !C6496s.c(a12.A(), Integer.valueOf(a10))) {
            a12.r(Integer.valueOf(a10));
            a12.V(Integer.valueOf(a10), b11);
        }
        F1.b(a12, e10, aVar2.d());
        Z z10 = Z.f873a;
        Avatar avatar3 = (Avatar) pair.c();
        h10.T(1213840539);
        if (avatar3 == null) {
            f12 = j11;
            f11 = j10;
        } else {
            AvatarWrapper avatarWrapper = new AvatarWrapper(avatar3, false, 2, (DefaultConstructorMarker) null);
            i n10 = q.n(i.f23074a, j10);
            h10.T(1012545465);
            boolean c10 = h10.c(j10) | h10.c(j11);
            Object A10 = h10.A();
            if (c10 || A10 == C1500m.f10026a.a()) {
                A10 = new C6029i(j10, j11);
                h10.r(A10);
            }
            h10.M();
            f12 = j11;
            f11 = j10;
            AvatarIconKt.m208AvatarIconRd90Nhg(b.d(n10, (C6798l) A10), avatarWrapper, (g2) null, false, 0, (C2544x0) null, h10, 64, 60);
        }
        h10.M();
        i.a aVar3 = i.f23074a;
        i.a aVar4 = aVar3;
        AvatarIconKt.m208AvatarIconRd90Nhg(q.n(aVar3, f13), new AvatarWrapper(avatar2, true), (g2) null, false, 0, (C2544x0) null, h10, 64, 60);
        Avatar avatar4 = (Avatar) pair.d();
        h10.T(1213869401);
        if (avatar4 != null) {
            AvatarWrapper avatarWrapper2 = new AvatarWrapper(avatar4, false, 2, (DefaultConstructorMarker) null);
            float f14 = f11;
            i n11 = q.n(aVar4, f14);
            h10.T(1012574327);
            float f15 = f12;
            boolean c11 = h10.c(f15) | h10.c(f14);
            Object A11 = h10.A();
            if (c11 || A11 == C1500m.f10026a.a()) {
                A11 = new C6031j(f15, f14);
                h10.r(A11);
            }
            h10.M();
            AvatarIconKt.m208AvatarIconRd90Nhg(b.d(n11, (C6798l) A11), avatarWrapper2, (g2) null, false, 0, (C2544x0) null, h10, 64, 60);
        }
        h10.M();
        h10.u();
        Y0 k10 = h10.k();
        if (k10 != null) {
            k10.a(new C6033k(aVar, avatar, pair, f10, str2, i10, i11));
        }
    }

    /* access modifiers changed from: private */
    public static final C6514M BotAndHumansFacePile_hGBTI10$lambda$10$lambda$4$lambda$3$lambda$2(float f10, float f11, C2602c cVar) {
        C6496s.h(cVar, "$this$drawWithContent");
        if (cVar.getLayoutDirection() == t.Ltr) {
            float t12 = cVar.t1(h.j(f10 - f11));
            float i10 = C2427m.i(cVar.d());
            int b10 = C2541w0.f25557a.b();
            C2603d w12 = cVar.w1();
            long d10 = w12.d();
            w12.f().q();
            try {
                w12.e().c(0.0f, 0.0f, t12, i10, b10);
                cVar.H1();
            } finally {
                w12.f().h();
                w12.h(d10);
            }
        } else {
            float t13 = cVar.t1(f11);
            float k10 = C2427m.k(cVar.d());
            float i11 = C2427m.i(cVar.d());
            int b11 = C2541w0.f25557a.b();
            C2603d w13 = cVar.w1();
            long d11 = w13.d();
            w13.f().q();
            try {
                w13.e().c(t13, 0.0f, k10, i11, b11);
                cVar.H1();
            } finally {
                w13.f().h();
                w13.h(d11);
            }
        }
        return C6514M.f71813a;
    }

    /* access modifiers changed from: private */
    public static final C6514M BotAndHumansFacePile_hGBTI10$lambda$10$lambda$9$lambda$8$lambda$7(float f10, float f11, C2602c cVar) {
        C6496s.h(cVar, "$this$drawWithContent");
        if (cVar.getLayoutDirection() == t.Ltr) {
            float t12 = cVar.t1(f10);
            float k10 = C2427m.k(cVar.d());
            float i10 = C2427m.i(cVar.d());
            int b10 = C2541w0.f25557a.b();
            C2603d w12 = cVar.w1();
            long d10 = w12.d();
            w12.f().q();
            try {
                w12.e().c(t12, 0.0f, k10, i10, b10);
                cVar.H1();
            } finally {
                w12.f().h();
                w12.h(d10);
            }
        } else {
            float t13 = cVar.t1(h.j(f11 - f10));
            float i11 = C2427m.i(cVar.d());
            int b11 = C2541w0.f25557a.b();
            C2603d w13 = cVar.w1();
            long d11 = w13.d();
            w13.f().q();
            try {
                w13.e().c(0.0f, 0.0f, t13, i11, b11);
                cVar.H1();
            } finally {
                w13.f().h();
                w13.h(d11);
            }
        }
        return C6514M.f71813a;
    }

    /* access modifiers changed from: private */
    public static final C6514M BotAndHumansFacePile_hGBTI10$lambda$11(i iVar, Avatar avatar, Pair pair, float f10, String str, int i10, int i11, C1500m mVar, int i12) {
        C6496s.h(avatar, "$botAvatar");
        C6496s.h(pair, "$teammateAvatarPair");
        m138BotAndHumansFacePilehGBTI10(iVar, avatar, pair, f10, str, mVar, M0.a(i10 | 1), i11);
        return C6514M.f71813a;
    }

    @IntercomPreviews
    private static final void BotWithTwoTeammatesPreview(C1500m mVar, int i10) {
        C1500m h10 = mVar.h(-366024049);
        if (i10 != 0 || !h10.i()) {
            IntercomThemeKt.IntercomTheme((IntercomColors) null, (IntercomTypography) null, (B0) null, ComposableSingletons$BotAndHumansFacePileKt.INSTANCE.m144getLambda1$intercom_sdk_base_release(), h10, 3072, 7);
        } else {
            h10.I();
        }
        Y0 k10 = h10.k();
        if (k10 != null) {
            k10.a(new C6027h(i10));
        }
    }

    /* access modifiers changed from: private */
    public static final C6514M BotWithTwoTeammatesPreview$lambda$12(int i10, C1500m mVar, int i11) {
        BotWithTwoTeammatesPreview(mVar, M0.a(i10 | 1));
        return C6514M.f71813a;
    }

    @IntercomPreviews
    private static final void BotsWithOneTeammatePreview(C1500m mVar, int i10) {
        C1500m h10 = mVar.h(1130939763);
        if (i10 != 0 || !h10.i()) {
            IntercomThemeKt.IntercomTheme((IntercomColors) null, (IntercomTypography) null, (B0) null, ComposableSingletons$BotAndHumansFacePileKt.INSTANCE.m145getLambda2$intercom_sdk_base_release(), h10, 3072, 7);
        } else {
            h10.I();
        }
        Y0 k10 = h10.k();
        if (k10 != null) {
            k10.a(new C6035l(i10));
        }
    }

    /* access modifiers changed from: private */
    public static final C6514M BotsWithOneTeammatePreview$lambda$13(int i10, C1500m mVar, int i11) {
        BotsWithOneTeammatePreview(mVar, M0.a(i10 | 1));
        return C6514M.f71813a;
    }

    public static final Pair<Avatar, Avatar> humanAvatarPairForHome(List<? extends Avatar> list) {
        C6496s.h(list, "humanAvatars");
        int size = list.size();
        if (size == 0) {
            return C6502A.a((Object) null, (Object) null);
        }
        if (size != 1) {
            return new Pair<>(list.get(0), list.get(1));
        }
        return new Pair<>((Object) null, list.get(0));
    }
}
