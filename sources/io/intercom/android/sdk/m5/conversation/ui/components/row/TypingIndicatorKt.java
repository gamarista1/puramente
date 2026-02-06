package io.intercom.android.sdk.m5.conversation.ui.components.row;

import C.C1085c;
import C.W;
import C.Z;
import H0.F;
import I.f;
import I.g;
import J0.C1241g;
import V.B0;
import Y.A1;
import Y.C1494j;
import Y.C1500m;
import Y.C1523y;
import Y.F1;
import Y.M0;
import Y.Y0;
import androidx.compose.foundation.b;
import androidx.compose.foundation.layout.n;
import androidx.compose.foundation.layout.q;
import c1.h;
import io.intercom.android.sdk.m5.components.avatar.AvatarIconKt;
import io.intercom.android.sdk.m5.conversation.states.CurrentlyTypingState;
import io.intercom.android.sdk.ui.IntercomPreviews;
import io.intercom.android.sdk.ui.extension.ModifierExtensionsKt;
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
import r0.C2547y0;
import r0.g2;
import t0.C2605f;
import t0.C2606g;
import w.C2760D;
import w.C2769M;
import w.C2770N;
import w.C2771O;
import w.C2785b0;
import w.C2798j;
import w.j0;
import w.k0;
import x.C2866e;
import x.C2868g;
import x.C2869h;
import x.C2870i;
import yf.C6787a;
import yf.C6798l;
import yf.p;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\b\u001a+\u0010\t\u001a\u00020\u00062\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\u0007\u0010\b\u001a\u000f\u0010\n\u001a\u00020\u0006H\u0003¢\u0006\u0004\b\n\u0010\u000b\u001a\u001d\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\r\u001a\u00020\fH\u0003¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u000f\u0010\u0012\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u0012\u0010\u000b\u001a\u000f\u0010\u0013\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u0013\u0010\u000b\"\u0014\u0010\u0014\u001a\u00020\f8\u0002XT¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0017²\u0006\f\u0010\u0016\u001a\u00020\u000f8\nX\u0002"}, d2 = {"Lk0/i;", "modifier", "Lio/intercom/android/sdk/m5/conversation/states/CurrentlyTypingState;", "typingIndicatorData", "Lc1/h;", "avatarSize", "Llf/M;", "TypingIndicator-6a0pyJM", "(Lk0/i;Lio/intercom/android/sdk/m5/conversation/states/CurrentlyTypingState;FLY/m;II)V", "TypingIndicator", "TeammateTypingIndicator", "(LY/m;I)V", "", "delayMillis", "LY/A1;", "", "animateDotAlpha", "(ILY/m;I)LY/A1;", "TypingIndicatorPreview", "TypingIndicatorWithoutAvatarPreview", "AnimateDuration", "I", "alpha", "intercom-sdk-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class TypingIndicatorKt {
    private static final int AnimateDuration = 600;

    private static final void TeammateTypingIndicator(C1500m mVar, int i10) {
        C1500m h10 = mVar.h(349650241);
        if (i10 != 0 || !h10.i()) {
            f c10 = g.c(h.j((float) 20));
            boolean z10 = true;
            float j10 = h.j((float) 1);
            IntercomTheme intercomTheme = IntercomTheme.INSTANCE;
            int i11 = IntercomTheme.$stable;
            TypingIndicatorStyle typingIndicatorStyle = new TypingIndicatorStyle(c10, C2869h.a(j10, intercomTheme.getColors(h10, i11).m676getAdminBorder0d7_KjU()), intercomTheme.getColors(h10, i11).m675getAdminBackground0d7_KjU(), (DefaultConstructorMarker) null);
            i c11 = b.c(i.f23074a, typingIndicatorStyle.m331getColor0d7_KjU(), typingIndicatorStyle.getShape());
            if (typingIndicatorStyle.getBorderStroke() == null) {
                z10 = false;
            }
            h10.T(-676457367);
            boolean S10 = h10.S(typingIndicatorStyle);
            Object A10 = h10.A();
            if (S10 || A10 == C1500m.f10026a.a()) {
                A10 = new D0(typingIndicatorStyle);
                h10.r(A10);
            }
            h10.M();
            i j11 = n.j(ModifierExtensionsKt.ifTrue(c11, z10, (C6798l) A10), h.j((float) 16), h.j((float) 18));
            F b10 = W.b(C1085c.f882a.n(h.j((float) 4)), c.f23044a.i(), h10, 54);
            int a10 = C1494j.a(h10, 0);
            C1523y p10 = h10.p();
            i e10 = k0.h.e(h10, j11);
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
            Z z11 = Z.f873a;
            List<Number> q10 = C6565s.q(0, 200, 400);
            h10.T(-2125336505);
            for (Number intValue : q10) {
                A1 animateDotAlpha = animateDotAlpha(intValue.intValue(), h10, 0);
                long r42 = IntercomTheme.INSTANCE.getColors(h10, IntercomTheme.$stable).m708isTyping0d7_KjU();
                i n10 = q.n(i.f23074a, h.j((float) 8));
                h10.T(-1598002378);
                boolean e11 = h10.e(r42) | h10.S(animateDotAlpha);
                Object A11 = h10.A();
                if (e11 || A11 == C1500m.f10026a.a()) {
                    A11 = new E0(r42, animateDotAlpha);
                    h10.r(A11);
                }
                h10.M();
                C2870i.a(n10, (C6798l) A11, h10, 6);
            }
            h10.M();
            h10.u();
        } else {
            h10.I();
        }
        Y0 k10 = h10.k();
        if (k10 != null) {
            k10.a(new F0(i10));
        }
    }

    /* access modifiers changed from: private */
    public static final C6514M TeammateTypingIndicator$lambda$10(int i10, C1500m mVar, int i11) {
        TeammateTypingIndicator(mVar, M0.a(i10 | 1));
        return C6514M.f71813a;
    }

    /* access modifiers changed from: private */
    public static final i TeammateTypingIndicator$lambda$4$lambda$3(TypingIndicatorStyle typingIndicatorStyle, i iVar) {
        i e10;
        C6496s.h(typingIndicatorStyle, "$style");
        C6496s.h(iVar, "$this$ifTrue");
        C2868g borderStroke = typingIndicatorStyle.getBorderStroke();
        if (borderStroke == null || (e10 = C2866e.e(iVar, borderStroke, typingIndicatorStyle.getShape())) == null) {
            return iVar;
        }
        return e10;
    }

    private static final float TeammateTypingIndicator$lambda$9$lambda$8$lambda$5(A1 a12) {
        return ((Number) a12.getValue()).floatValue();
    }

    /* access modifiers changed from: private */
    public static final C6514M TeammateTypingIndicator$lambda$9$lambda$8$lambda$7$lambda$6(long j10, A1 a12, C2605f fVar) {
        A1 a13 = a12;
        C6496s.h(a12, "$alpha$delegate");
        C6496s.h(fVar, "$this$Canvas");
        C2605f.n0(fVar, C2544x0.o(j10, TeammateTypingIndicator$lambda$9$lambda$8$lambda$5(a12), 0.0f, 0.0f, 0.0f, 14, (Object) null), 0.0f, 0, 0.0f, (C2606g) null, (C2547y0) null, 0, 126, (Object) null);
        return C6514M.f71813a;
    }

    /* renamed from: TypingIndicator-6a0pyJM  reason: not valid java name */
    public static final void m327TypingIndicator6a0pyJM(i iVar, CurrentlyTypingState currentlyTypingState, float f10, C1500m mVar, int i10, int i11) {
        i iVar2;
        float f11;
        C6496s.h(currentlyTypingState, "typingIndicatorData");
        C1500m h10 = mVar.h(1574154580);
        if ((i11 & 1) != 0) {
            iVar2 = i.f23074a;
        } else {
            iVar2 = iVar;
        }
        if ((i11 & 4) != 0) {
            f11 = h.j((float) 36);
        } else {
            f11 = f10;
        }
        F b10 = W.b(C1085c.f882a.n(h.j((float) 8)), c.f23044a.i(), h10, 54);
        int a10 = C1494j.a(h10, 0);
        C1523y p10 = h10.p();
        i e10 = k0.h.e(h10, iVar2);
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
        Z z10 = Z.f873a;
        h10.T(-1949038310);
        if (currentlyTypingState.getShowAvatar()) {
            AvatarIconKt.m208AvatarIconRd90Nhg(q.n(i.f23074a, f11), currentlyTypingState.getAvatarWrapper(), (g2) null, false, 0, (C2544x0) null, h10, 64, 60);
        }
        h10.M();
        TeammateTypingIndicator(h10, 0);
        h10.u();
        Y0 k10 = h10.k();
        if (k10 != null) {
            k10.a(new B0(iVar2, currentlyTypingState, f11, i10, i11));
        }
    }

    @IntercomPreviews
    public static final void TypingIndicatorPreview(C1500m mVar, int i10) {
        C1500m h10 = mVar.h(-955207145);
        if (i10 != 0 || !h10.i()) {
            IntercomThemeKt.IntercomTheme((IntercomColors) null, (IntercomTypography) null, (B0) null, ComposableSingletons$TypingIndicatorKt.INSTANCE.m314getLambda2$intercom_sdk_base_release(), h10, 3072, 7);
        } else {
            h10.I();
        }
        Y0 k10 = h10.k();
        if (k10 != null) {
            k10.a(new A0(i10));
        }
    }

    /* access modifiers changed from: private */
    public static final C6514M TypingIndicatorPreview$lambda$11(int i10, C1500m mVar, int i11) {
        TypingIndicatorPreview(mVar, M0.a(i10 | 1));
        return C6514M.f71813a;
    }

    @IntercomPreviews
    public static final void TypingIndicatorWithoutAvatarPreview(C1500m mVar, int i10) {
        C1500m h10 = mVar.h(-544244118);
        if (i10 != 0 || !h10.i()) {
            IntercomThemeKt.IntercomTheme((IntercomColors) null, (IntercomTypography) null, (B0) null, ComposableSingletons$TypingIndicatorKt.INSTANCE.m316getLambda4$intercom_sdk_base_release(), h10, 3072, 7);
        } else {
            h10.I();
        }
        Y0 k10 = h10.k();
        if (k10 != null) {
            k10.a(new C0(i10));
        }
    }

    /* access modifiers changed from: private */
    public static final C6514M TypingIndicatorWithoutAvatarPreview$lambda$12(int i10, C1500m mVar, int i11) {
        TypingIndicatorWithoutAvatarPreview(mVar, M0.a(i10 | 1));
        return C6514M.f71813a;
    }

    /* access modifiers changed from: private */
    public static final C6514M TypingIndicator_6a0pyJM$lambda$1(i iVar, CurrentlyTypingState currentlyTypingState, float f10, int i10, int i11, C1500m mVar, int i12) {
        C6496s.h(currentlyTypingState, "$typingIndicatorData");
        m327TypingIndicator6a0pyJM(iVar, currentlyTypingState, f10, mVar, M0.a(i10 | 1), i11);
        return C6514M.f71813a;
    }

    private static final A1 animateDotAlpha(int i10, C1500m mVar, int i11) {
        mVar.T(-1913274997);
        A1 a10 = C2771O.a(C2771O.c("IsTypingInfiniteTransition", mVar, 6, 0), 1.0f, 0.1f, C2798j.d(C2798j.j(AnimateDuration, 0, (C2760D) null, 6, (Object) null), C2785b0.Reverse, j0.a(i10, k0.f27440a.a())), "IsTypingAnimation", mVar, C2770N.f27201f | 25008 | (C2769M.f27197d << 9), 0);
        mVar.M();
        return a10;
    }
}
