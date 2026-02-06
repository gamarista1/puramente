package io.intercom.android.sdk.m5.conversation.ui.components.row;

import B.l;
import C.C1085c;
import C.C1090h;
import C.C1093k;
import C.W;
import C.Z;
import C.a0;
import H0.F;
import J0.C1241g;
import M0.e;
import O0.g;
import Q0.A;
import Q0.T;
import V.B0;
import V.T0;
import V.V;
import V0.n;
import V0.o;
import Y.C1494j;
import Y.C1500m;
import Y.C1523y;
import Y.F1;
import Y.M0;
import Y.Y0;
import android.content.Context;
import androidx.compose.foundation.d;
import androidx.compose.foundation.layout.q;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import b1.C1869a;
import b1.C1876h;
import b1.j;
import b1.k;
import b1.s;
import b1.t;
import c1.h;
import c1.w;
import io.intercom.android.sdk.Injector;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.m5.components.AvatarGroupKt;
import io.intercom.android.sdk.m5.components.BotAndHumansFacePileKt;
import io.intercom.android.sdk.m5.components.avatar.AvatarIconKt;
import io.intercom.android.sdk.m5.components.avatar.AvatarWrapper;
import io.intercom.android.sdk.m5.conversation.states.ExpandedTeamPresenceState;
import io.intercom.android.sdk.models.Avatar;
import io.intercom.android.sdk.models.Header;
import io.intercom.android.sdk.ui.IntercomPreviews;
import io.intercom.android.sdk.ui.theme.IntercomColors;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import io.intercom.android.sdk.ui.theme.IntercomThemeKt;
import io.intercom.android.sdk.ui.theme.IntercomTypography;
import io.intercom.android.sdk.utilities.ColorExtensionsKt;
import io.intercom.android.sdk.utilities.LinkOpener;
import java.util.ArrayList;
import k0.c;
import k0.i;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lf.C6502A;
import lf.C6514M;
import lf.C6535s;
import mf.C6565s;
import r0.C2544x0;
import r0.e2;
import r0.g2;
import t0.C2606g;
import w0.C2817c;
import x.C2843G;
import yf.C6787a;
import yf.C6798l;
import yf.p;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a!\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002H\u0001¢\u0006\u0004\b\u0005\u0010\u0006\u001a#\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\tH\u0003¢\u0006\u0004\b\f\u0010\r\u001a\u000f\u0010\u000e\u001a\u00020\u0004H\u0003¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u000f\u0010\u0010\u001a\u00020\u0004H\u0003¢\u0006\u0004\b\u0010\u0010\u000f\u001a\u000f\u0010\u0011\u001a\u00020\u0004H\u0003¢\u0006\u0004\b\u0011\u0010\u000f\"\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lio/intercom/android/sdk/m5/conversation/states/ExpandedTeamPresenceState;", "teamPresenceUiState", "Lk0/i;", "modifier", "Llf/M;", "ExpandedTeamPresenceLayout", "(Lio/intercom/android/sdk/m5/conversation/states/ExpandedTeamPresenceState;Lk0/i;LY/m;II)V", "Lio/intercom/android/sdk/models/Header$Expanded$Style;", "style", "", "color", "LQ0/T;", "getTextStyleFor", "(Lio/intercom/android/sdk/models/Header$Expanded$Style;Ljava/lang/String;LY/m;II)LQ0/T;", "ExpandedTeamPresenceLayoutPreviewWithFin", "(LY/m;I)V", "ExpandedTeamPresenceLayoutPreviewWithFinAndHumans", "ExpandedTeamPresenceLayoutPreviewWithAssignedAdmin", "Lc1/h;", "AvatarSize", "F", "intercom-sdk-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class ExpandedTeamPresenceLayoutKt {
    private static final float AvatarSize = h.j((float) 56);

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        /* JADX WARNING: Can't wrap try/catch for region: R(19:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|(2:13|14)|15|17|18|19|20|21|22|23|24|25|27) */
        /* JADX WARNING: Can't wrap try/catch for region: R(21:0|1|2|3|(2:5|6)|7|9|10|11|(2:13|14)|15|17|18|19|20|21|22|23|24|25|27) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x003c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x0044 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x004c */
        static {
            /*
                io.intercom.android.sdk.models.AvatarType[] r0 = io.intercom.android.sdk.models.AvatarType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                r1 = 1
                io.intercom.android.sdk.models.AvatarType r2 = io.intercom.android.sdk.models.AvatarType.FACEPILE     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                r2 = 2
                io.intercom.android.sdk.models.AvatarType r3 = io.intercom.android.sdk.models.AvatarType.LAYERED_BUBBLES     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r0[r3] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                r3 = 3
                io.intercom.android.sdk.models.AvatarType r4 = io.intercom.android.sdk.models.AvatarType.LOGO     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r0[r4] = r3     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                r4 = 4
                io.intercom.android.sdk.models.AvatarType r5 = io.intercom.android.sdk.models.AvatarType.UNKNOWN     // Catch:{ NoSuchFieldError -> 0x002b }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x002b }
                r0[r5] = r4     // Catch:{ NoSuchFieldError -> 0x002b }
            L_0x002b:
                $EnumSwitchMapping$0 = r0
                io.intercom.android.sdk.models.Header$Expanded$Style[] r0 = io.intercom.android.sdk.models.Header.Expanded.Style.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                io.intercom.android.sdk.models.Header$Expanded$Style r5 = io.intercom.android.sdk.models.Header.Expanded.Style.H1     // Catch:{ NoSuchFieldError -> 0x003c }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x003c }
                r0[r5] = r1     // Catch:{ NoSuchFieldError -> 0x003c }
            L_0x003c:
                io.intercom.android.sdk.models.Header$Expanded$Style r1 = io.intercom.android.sdk.models.Header.Expanded.Style.PARAGRAPH     // Catch:{ NoSuchFieldError -> 0x0044 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0044 }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0044 }
            L_0x0044:
                io.intercom.android.sdk.models.Header$Expanded$Style r1 = io.intercom.android.sdk.models.Header.Expanded.Style.INTRO     // Catch:{ NoSuchFieldError -> 0x004c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x004c }
                r0[r1] = r3     // Catch:{ NoSuchFieldError -> 0x004c }
            L_0x004c:
                io.intercom.android.sdk.models.Header$Expanded$Style r1 = io.intercom.android.sdk.models.Header.Expanded.Style.GREETING     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r0[r1] = r4     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                $EnumSwitchMapping$1 = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: io.intercom.android.sdk.m5.conversation.ui.components.row.ExpandedTeamPresenceLayoutKt.WhenMappings.<clinit>():void");
        }
    }

    public static final void ExpandedTeamPresenceLayout(ExpandedTeamPresenceState expandedTeamPresenceState, i iVar, C1500m mVar, int i10, int i11) {
        i iVar2;
        int i12;
        int i13;
        boolean z10;
        Context context;
        Pair pair;
        Pair a10;
        ExpandedTeamPresenceState expandedTeamPresenceState2 = expandedTeamPresenceState;
        int i14 = i11;
        C6496s.h(expandedTeamPresenceState2, "teamPresenceUiState");
        C1500m h10 = mVar.h(-1694898660);
        i.a aVar = (i14 & 2) != 0 ? i.f23074a : iVar;
        Context context2 = (Context) h10.m(AndroidCompositionLocals_androidKt.g());
        F a11 = C1090h.a(C1085c.f882a.g(), c.f23044a.g(), h10, 48);
        int a12 = C1494j.a(h10, 0);
        C1523y p10 = h10.p();
        i e10 = k0.h.e(h10, aVar);
        C1241g.a aVar2 = C1241g.f3853J;
        C6787a a13 = aVar2.a();
        if (h10.j() == null) {
            C1494j.c();
        }
        h10.F();
        if (h10.f()) {
            h10.U(a13);
        } else {
            h10.q();
        }
        C1500m a14 = F1.a(h10);
        F1.b(a14, a11, aVar2.c());
        F1.b(a14, p10, aVar2.e());
        p b10 = aVar2.b();
        if (a14.f() || !C6496s.c(a14.A(), Integer.valueOf(a12))) {
            a14.r(Integer.valueOf(a12));
            a14.V(Integer.valueOf(a12), b10);
        }
        F1.b(a14, e10, aVar2.d());
        C1093k kVar = C1093k.f978a;
        int i15 = WhenMappings.$EnumSwitchMapping$0[expandedTeamPresenceState.getAvatarType().ordinal()];
        if (i15 == 1) {
            iVar2 = aVar;
            i12 = 0;
            h10.T(-655467756);
            i.a aVar3 = i.f23074a;
            Avatar avatar = ((AvatarWrapper) C6565s.o0(expandedTeamPresenceState.getAvatars())).getAvatar();
            if (expandedTeamPresenceState.getAvatars().size() >= 3) {
                pair = C6502A.a(expandedTeamPresenceState.getAvatars().get(1).getAvatar(), expandedTeamPresenceState.getAvatars().get(2).getAvatar());
            } else {
                if (expandedTeamPresenceState.getAvatars().size() == 2) {
                    a10 = C6502A.a(expandedTeamPresenceState.getAvatars().get(1).getAvatar(), (Object) null);
                } else {
                    a10 = C6502A.a((Object) null, (Object) null);
                }
                pair = a10;
            }
            BotAndHumansFacePileKt.m138BotAndHumansFacePilehGBTI10(aVar3, avatar, pair, AvatarSize, (String) null, h10, 3654, 16);
            h10.M();
            C6514M m10 = C6514M.f71813a;
        } else if (i15 == 2) {
            iVar2 = aVar;
            i12 = 0;
            h10.T(-654655587);
            if (expandedTeamPresenceState.getAvatars().size() == 1) {
                h10.T(-654606390);
                AvatarIconKt.m208AvatarIconRd90Nhg(q.n(i.f23074a, AvatarSize), expandedTeamPresenceState.getAvatars().get(0), (g2) null, expandedTeamPresenceState.getDisplayActiveIndicator(), w.f(24), (C2544x0) null, h10, 24646, 36);
                h10.M();
            } else {
                h10.T(-654265855);
                AvatarGroupKt.m136AvatarGroupJ8mCjc(expandedTeamPresenceState.getAvatars(), i.f23074a, AvatarSize, w.f(24), h10, 3512, 0);
                h10.M();
            }
            h10.M();
            C6514M m11 = C6514M.f71813a;
        } else if (i15 == 3) {
            h10.T(-653933318);
            iVar2 = aVar;
            i12 = 0;
            AvatarIconKt.m208AvatarIconRd90Nhg(q.n(i.f23074a, AvatarSize), expandedTeamPresenceState.getAvatars().get(0), (g2) null, expandedTeamPresenceState.getDisplayActiveIndicator(), w.f(24), C2544x0.k(C2544x0.f25560b.g()), h10, 221254, 4);
            h10.M();
            C6514M m12 = C6514M.f71813a;
        } else if (i15 == 4) {
            h10.T(-653494885);
            h10.M();
            C6514M m13 = C6514M.f71813a;
            iVar2 = aVar;
            i12 = 0;
        } else {
            h10.T(-852429191);
            h10.M();
            throw new C6535s();
        }
        float f10 = (float) 12;
        int i16 = 6;
        a0.a(q.i(i.f23074a, h.j(f10)), h10, 6);
        h10.T(-852359896);
        for (Header.Expanded.Body body : expandedTeamPresenceState.getBody()) {
            a0.a(q.i(i.f23074a, h.j((float) 4)), h10, i16);
            T0.b(body.getText(), (i) null, 0, 0, (n) null, (V0.p) null, (V0.h) null, 0, (k) null, j.h(j.f19110b.a()), 0, t.f19154a.b(), false, 2, 0, (C6798l) null, getTextStyleFor(body.getStyle(), body.getColor(), h10, i12, i12), h10, 0, 3120, 54782);
            f10 = f10;
            context2 = context2;
            iVar2 = iVar2;
            i16 = 6;
            i12 = 0;
        }
        float f11 = f10;
        Context context3 = context2;
        i iVar3 = iVar2;
        h10.M();
        h10.T(-852346650);
        int i17 = 54;
        int i18 = 8;
        if (!expandedTeamPresenceState.getSocialAccounts().isEmpty()) {
            i.a aVar4 = i.f23074a;
            i13 = 6;
            a0.a(q.i(aVar4, h.j(f11)), h10, 6);
            C1085c cVar = C1085c.f882a;
            float j10 = h.j((float) 8);
            c.a aVar5 = c.f23044a;
            F b11 = W.b(cVar.o(j10, aVar5.g()), aVar5.i(), h10, 54);
            z10 = false;
            int a15 = C1494j.a(h10, 0);
            C1523y p11 = h10.p();
            i e11 = k0.h.e(h10, aVar4);
            C1241g.a aVar6 = C1241g.f3853J;
            C6787a a16 = aVar6.a();
            if (h10.j() == null) {
                C1494j.c();
            }
            h10.F();
            if (h10.f()) {
                h10.U(a16);
            } else {
                h10.q();
            }
            C1500m a17 = F1.a(h10);
            F1.b(a17, b11, aVar6.c());
            F1.b(a17, p11, aVar6.e());
            p b12 = aVar6.b();
            if (a17.f() || !C6496s.c(a17.A(), Integer.valueOf(a15))) {
                a17.r(Integer.valueOf(a15));
                a17.V(Integer.valueOf(a15), b12);
            }
            F1.b(a17, e11, aVar6.d());
            Z z11 = Z.f873a;
            h10.T(-457726390);
            for (Header.Expanded.SocialAccount socialAccount : expandedTeamPresenceState.getSocialAccounts()) {
                if (C6496s.c(socialAccount.getProvider(), "twitter")) {
                    C2817c c10 = e.c(R.drawable.intercom_twitter, h10, 0);
                    String provider = socialAccount.getProvider();
                    long r62 = IntercomTheme.INSTANCE.getColors(h10, IntercomTheme.$stable).m673getActionContrastWhite0d7_KjU();
                    i n10 = q.n(i.f23074a, h.j((float) 16));
                    h10.T(-144020278);
                    Object A10 = h10.A();
                    if (A10 == C1500m.f10026a.a()) {
                        A10 = B.k.a();
                        h10.r(A10);
                    }
                    h10.M();
                    Context context4 = context3;
                    context = context4;
                    V.a(c10, provider, d.b(n10, (l) A10, (C2843G) null, false, (String) null, (g) null, new E(socialAccount, context4), 28, (Object) null), r62, h10, 8, 0);
                } else {
                    context = context3;
                }
                context3 = context;
            }
            h10.M();
            h10.u();
        } else {
            z10 = false;
            i13 = 6;
        }
        h10.M();
        h10.T(-852298704);
        for (Header.Expanded.Footer footer : expandedTeamPresenceState.getFooters()) {
            i.a aVar7 = i.f23074a;
            a0.a(q.i(aVar7, h.j((float) 4)), h10, i13);
            F b13 = W.b(C1085c.f882a.n(h.j((float) i18)), c.f23044a.i(), h10, i17);
            int a18 = C1494j.a(h10, z10 ? 1 : 0);
            C1523y p12 = h10.p();
            i e12 = k0.h.e(h10, aVar7);
            C1241g.a aVar8 = C1241g.f3853J;
            C6787a a19 = aVar8.a();
            if (h10.j() == null) {
                C1494j.c();
            }
            h10.F();
            if (h10.f()) {
                h10.U(a19);
            } else {
                h10.q();
            }
            C1500m a20 = F1.a(h10);
            F1.b(a20, b13, aVar8.c());
            F1.b(a20, p12, aVar8.e());
            p b14 = aVar8.b();
            if (a20.f() || !C6496s.c(a20.A(), Integer.valueOf(a18))) {
                a20.r(Integer.valueOf(a18));
                a20.V(Integer.valueOf(a18), b14);
            }
            F1.b(a20, e12, aVar8.d());
            Z z12 = Z.f873a;
            h10.T(-143995125);
            if (footer.getAvatarDetails() != null) {
                Iterable<Avatar.Builder> avatars = footer.getAvatarDetails().getAvatars();
                ArrayList arrayList = new ArrayList(C6565s.y(avatars, 10));
                for (Avatar.Builder build : avatars) {
                    Avatar build2 = build.build();
                    C6496s.g(build2, "build(...)");
                    arrayList.add(new AvatarWrapper(build2, z10, 2, (DefaultConstructorMarker) null));
                }
                AvatarGroupKt.m136AvatarGroupJ8mCjc(arrayList, aVar7, h.j((float) 20), 0, h10, 440, 8);
            }
            h10.M();
            T0.b(footer.getText(), (i) null, 0, 0, (n) null, (V0.p) null, (V0.h) null, 0, (k) null, j.h(j.f19110b.a()), 0, t.f19154a.b(), false, 2, 0, (C6798l) null, getTextStyleFor(footer.getStyle(), footer.getColor(), h10, z10, z10), h10, 0, 3120, 54782);
            h10.u();
            z10 = z10;
            i13 = i13;
            i18 = i18;
            i17 = i17;
        }
        h10.M();
        h10.u();
        Y0 k10 = h10.k();
        if (k10 != null) {
            k10.a(new F(expandedTeamPresenceState2, iVar3, i10, i14));
        }
    }

    /* access modifiers changed from: private */
    public static final C6514M ExpandedTeamPresenceLayout$lambda$8$lambda$4$lambda$3$lambda$2(Header.Expanded.SocialAccount socialAccount, Context context) {
        C6496s.h(socialAccount, "$it");
        C6496s.h(context, "$context");
        LinkOpener.handleUrl(socialAccount.getProfileUrl(), context, Injector.get().getApi());
        return C6514M.f71813a;
    }

    /* access modifiers changed from: private */
    public static final C6514M ExpandedTeamPresenceLayout$lambda$9(ExpandedTeamPresenceState expandedTeamPresenceState, i iVar, int i10, int i11, C1500m mVar, int i12) {
        C6496s.h(expandedTeamPresenceState, "$teamPresenceUiState");
        ExpandedTeamPresenceLayout(expandedTeamPresenceState, iVar, mVar, M0.a(i10 | 1), i11);
        return C6514M.f71813a;
    }

    @IntercomPreviews
    private static final void ExpandedTeamPresenceLayoutPreviewWithAssignedAdmin(C1500m mVar, int i10) {
        C1500m h10 = mVar.h(-1042616954);
        if (i10 != 0 || !h10.i()) {
            IntercomThemeKt.IntercomTheme((IntercomColors) null, (IntercomTypography) null, (B0) null, ComposableSingletons$ExpandedTeamPresenceLayoutKt.INSTANCE.m295getLambda6$intercom_sdk_base_release(), h10, 3072, 7);
        } else {
            h10.I();
        }
        Y0 k10 = h10.k();
        if (k10 != null) {
            k10.a(new G(i10));
        }
    }

    /* access modifiers changed from: private */
    public static final C6514M ExpandedTeamPresenceLayoutPreviewWithAssignedAdmin$lambda$12(int i10, C1500m mVar, int i11) {
        ExpandedTeamPresenceLayoutPreviewWithAssignedAdmin(mVar, M0.a(i10 | 1));
        return C6514M.f71813a;
    }

    @IntercomPreviews
    private static final void ExpandedTeamPresenceLayoutPreviewWithFin(C1500m mVar, int i10) {
        C1500m h10 = mVar.h(467453596);
        if (i10 != 0 || !h10.i()) {
            IntercomThemeKt.IntercomTheme((IntercomColors) null, (IntercomTypography) null, (B0) null, ComposableSingletons$ExpandedTeamPresenceLayoutKt.INSTANCE.m291getLambda2$intercom_sdk_base_release(), h10, 3072, 7);
        } else {
            h10.I();
        }
        Y0 k10 = h10.k();
        if (k10 != null) {
            k10.a(new H(i10));
        }
    }

    /* access modifiers changed from: private */
    public static final C6514M ExpandedTeamPresenceLayoutPreviewWithFin$lambda$10(int i10, C1500m mVar, int i11) {
        ExpandedTeamPresenceLayoutPreviewWithFin(mVar, M0.a(i10 | 1));
        return C6514M.f71813a;
    }

    @IntercomPreviews
    private static final void ExpandedTeamPresenceLayoutPreviewWithFinAndHumans(C1500m mVar, int i10) {
        C1500m h10 = mVar.h(278476299);
        if (i10 != 0 || !h10.i()) {
            IntercomThemeKt.IntercomTheme((IntercomColors) null, (IntercomTypography) null, (B0) null, ComposableSingletons$ExpandedTeamPresenceLayoutKt.INSTANCE.m293getLambda4$intercom_sdk_base_release(), h10, 3072, 7);
        } else {
            h10.I();
        }
        Y0 k10 = h10.k();
        if (k10 != null) {
            k10.a(new I(i10));
        }
    }

    /* access modifiers changed from: private */
    public static final C6514M ExpandedTeamPresenceLayoutPreviewWithFinAndHumans$lambda$11(int i10, C1500m mVar, int i11) {
        ExpandedTeamPresenceLayoutPreviewWithFinAndHumans(mVar, M0.a(i10 | 1));
        return C6514M.f71813a;
    }

    private static final T getTextStyleFor(Header.Expanded.Style style, String str, C1500m mVar, int i10, int i11) {
        String str2;
        T t10;
        long y10;
        long y11;
        long y12;
        C1500m mVar2 = mVar;
        mVar2.T(33871301);
        C2544x0 x0Var = null;
        if ((i11 & 2) != 0) {
            str2 = null;
        } else {
            str2 = str;
        }
        int i12 = WhenMappings.$EnumSwitchMapping$1[style.ordinal()];
        if (i12 == 1) {
            mVar2.T(1720557014);
            t10 = IntercomTheme.INSTANCE.getTypography(mVar2, IntercomTheme.$stable).getType03();
            mVar.M();
        } else if (i12 == 2) {
            mVar2.T(1720559900);
            IntercomTheme intercomTheme = IntercomTheme.INSTANCE;
            int i13 = IntercomTheme.$stable;
            T type04 = intercomTheme.getTypography(mVar2, i13).getType04();
            if (str2 != null) {
                x0Var = C2544x0.k(ColorExtensionsKt.toComposeColor$default(str2, 0.0f, 1, (Object) null));
            }
            if (x0Var == null) {
                y10 = intercomTheme.getColors(mVar2, i13).m686getDescriptionText0d7_KjU();
            } else {
                y10 = x0Var.y();
            }
            t10 = T.c(type04, y10, 0, (V0.p) null, (n) null, (o) null, (V0.h) null, (String) null, 0, (C1869a) null, (b1.o) null, (X0.e) null, 0, (k) null, (e2) null, (C2606g) null, 0, 0, 0, (b1.q) null, (A) null, (C1876h) null, 0, 0, (s) null, 16777214, (Object) null);
            mVar.M();
        } else if (i12 == 3) {
            mVar2.T(1720565846);
            IntercomTheme intercomTheme2 = IntercomTheme.INSTANCE;
            int i14 = IntercomTheme.$stable;
            T type01 = intercomTheme2.getTypography(mVar2, i14).getType01();
            if (str2 != null) {
                x0Var = C2544x0.k(ColorExtensionsKt.toComposeColor$default(str2, 0.0f, 1, (Object) null));
            }
            if (x0Var == null) {
                y11 = intercomTheme2.getColors(mVar2, i14).m693getIntroText0d7_KjU();
            } else {
                y11 = x0Var.y();
            }
            t10 = T.c(type01, y11, 0, (V0.p) null, (n) null, (o) null, (V0.h) null, (String) null, 0, (C1869a) null, (b1.o) null, (X0.e) null, 0, (k) null, (e2) null, (C2606g) null, 0, 0, 0, (b1.q) null, (A) null, (C1876h) null, 0, 0, (s) null, 16777214, (Object) null);
            mVar.M();
        } else if (i12 != 4) {
            mVar2.T(1720576342);
            t10 = IntercomTheme.INSTANCE.getTypography(mVar2, IntercomTheme.$stable).getType04();
            mVar.M();
        } else {
            mVar2.T(1720571705);
            IntercomTheme intercomTheme3 = IntercomTheme.INSTANCE;
            int i15 = IntercomTheme.$stable;
            T type012 = intercomTheme3.getTypography(mVar2, i15).getType01();
            if (str2 != null) {
                x0Var = C2544x0.k(ColorExtensionsKt.toComposeColor$default(str2, 0.0f, 1, (Object) null));
            }
            if (x0Var == null) {
                y12 = intercomTheme3.getColors(mVar2, i15).m690getGreetingText0d7_KjU();
            } else {
                y12 = x0Var.y();
            }
            t10 = T.c(type012, y12, 0, (V0.p) null, (n) null, (o) null, (V0.h) null, (String) null, 0, (C1869a) null, (b1.o) null, (X0.e) null, 0, (k) null, (e2) null, (C2606g) null, 0, 0, 0, (b1.q) null, (A) null, (C1876h) null, 0, 0, (s) null, 16777214, (Object) null);
            mVar.M();
        }
        mVar.M();
        return t10;
    }
}
