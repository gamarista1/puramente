package io.intercom.android.sdk.m5.components.avatar;

import C.C1087e;
import H0.C1187h;
import H0.F;
import I.f;
import I.g;
import J0.C1241g;
import M0.e;
import O0.t;
import O0.v;
import Sg.p;
import V.B0;
import Y.C1494j;
import Y.C1500m;
import Y.C1510r0;
import Y.C1523y;
import Y.F1;
import Y.M0;
import Y.Y0;
import Y.o1;
import Z3.u;
import android.content.Context;
import androidx.compose.foundation.b;
import androidx.compose.foundation.layout.d;
import androidx.compose.foundation.layout.n;
import androidx.compose.foundation.layout.q;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import c1.h;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.ui.IntercomPreviews;
import io.intercom.android.sdk.ui.coil.IntercomImageLoaderKt;
import io.intercom.android.sdk.ui.theme.IntercomColors;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import io.intercom.android.sdk.ui.theme.IntercomThemeKt;
import io.intercom.android.sdk.ui.theme.IntercomTypography;
import io.intercom.android.sdk.utilities.ColorExtensionsKt;
import k0.c;
import k0.i;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import lf.C6514M;
import lf.C6535s;
import mf.C6565s;
import o0.C2342e;
import r0.C2514n0;
import r0.C2544x0;
import r0.C2547y0;
import r0.C2550z0;
import r0.g2;
import t0.C2605f;
import t0.C2606g;
import x.C2842F;
import x.C2866e;
import x.C2870i;
import yf.C6787a;
import yf.C6798l;
import yf.r;

@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0007\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aK\u0010\u000f\u001a\u00020\f2\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0001¢\u0006\u0004\b\r\u0010\u000e\u001aK\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0003¢\u0006\u0004\b\u0010\u0010\u0011\u001a+\u0010\u0013\u001a\u00020\f2\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004H\u0003¢\u0006\u0004\b\u0013\u0010\u0014\u001a+\u0010\u0017\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0016\u001a\u00020\u0015H\u0003¢\u0006\u0004\b\u0017\u0010\u0018\u001a+\u0010\u0019\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0016\u001a\u00020\u0015H\u0003¢\u0006\u0004\b\u0019\u0010\u0018\u001a#\u0010\u001b\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u001b\u0010\u001c\u001a\u0019\u0010\u001d\u001a\u00020\f2\b\b\u0002\u0010\u0001\u001a\u00020\u0000H\u0003¢\u0006\u0004\b\u001d\u0010\u001e\u001a9\u0010&\u001a\u00020\f2\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010!\u001a\u00020\n2\u0006\u0010\"\u001a\u00020\b2\u0006\u0010#\u001a\u00020\u001fH\u0003¢\u0006\u0004\b$\u0010%\u001a\u000f\u0010'\u001a\u00020\fH\u0003¢\u0006\u0004\b'\u0010(\u001a\u000f\u0010)\u001a\u00020\fH\u0003¢\u0006\u0004\b)\u0010(\u001a\u000f\u0010*\u001a\u00020\fH\u0003¢\u0006\u0004\b*\u0010(\u001a\u000f\u0010+\u001a\u00020\fH\u0003¢\u0006\u0004\b+\u0010(\u001a\u000f\u0010,\u001a\u00020\fH\u0003¢\u0006\u0004\b,\u0010(\"\u0018\u00101\u001a\u00020.*\u00020-8@X\u0004¢\u0006\u0006\u001a\u0004\b/\u00100¨\u00066²\u0006\u000e\u00102\u001a\u00020\n8\n@\nX\u0002²\u0006\u000e\u00104\u001a\u0002038\n@\nX\u0002²\u0006\u000e\u00105\u001a\u00020\u00048\n@\nX\u0002"}, d2 = {"Lk0/i;", "modifier", "Lio/intercom/android/sdk/m5/components/avatar/AvatarWrapper;", "avatarWrapper", "Lr0/g2;", "shape", "", "isActive", "Lc1/v;", "placeHolderTextSize", "Lr0/x0;", "customBackgroundColor", "Llf/M;", "AvatarIcon-Rd90Nhg", "(Lk0/i;Lio/intercom/android/sdk/m5/components/avatar/AvatarWrapper;Lr0/g2;ZJLr0/x0;LY/m;II)V", "AvatarIcon", "DefaultAvatar-Rd90Nhg", "(Lio/intercom/android/sdk/m5/components/avatar/AvatarWrapper;Lk0/i;Lr0/g2;ZJLr0/x0;LY/m;II)V", "DefaultAvatar", "FinAvatar", "(Lk0/i;Lio/intercom/android/sdk/m5/components/avatar/AvatarWrapper;Lr0/g2;LY/m;II)V", "", "alpha", "FinAvatarPlaceholder", "(Lio/intercom/android/sdk/m5/components/avatar/AvatarWrapper;Lk0/i;FLY/m;II)V", "BotAvatarPlaceholder", "shouldDrawBorder", "avatarBorder", "(Lk0/i;ZLr0/g2;)Lk0/i;", "AvatarActiveIndicator", "(Lk0/i;LY/m;II)V", "", "avatarInitials", "textColor", "textSize", "contentDescription", "AvatarPlaceholder-jxWH9Kg", "(Lk0/i;Ljava/lang/String;JJLjava/lang/String;LY/m;II)V", "AvatarPlaceholder", "AvatarIconPreview", "(LY/m;I)V", "AvatarIconActivePreview", "AvatarIconSquirclePreview", "AvatarIconCutPreview", "BotAvatarPreview", "Lio/intercom/android/sdk/m5/components/avatar/AvatarShape;", "LI/f;", "getComposeShape", "(Lio/intercom/android/sdk/m5/components/avatar/AvatarShape;)LI/f;", "composeShape", "backgroundColor", "Lc1/h;", "indicatorSize", "cutShape", "intercom-sdk-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class AvatarIconKt {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        static {
            /*
                io.intercom.android.sdk.m5.components.avatar.AvatarShape[] r0 = io.intercom.android.sdk.m5.components.avatar.AvatarShape.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                io.intercom.android.sdk.m5.components.avatar.AvatarShape r1 = io.intercom.android.sdk.m5.components.avatar.AvatarShape.CIRCLE     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                io.intercom.android.sdk.m5.components.avatar.AvatarShape r1 = io.intercom.android.sdk.m5.components.avatar.AvatarShape.SQUIRCLE     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                $EnumSwitchMapping$0 = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: io.intercom.android.sdk.m5.components.avatar.AvatarIconKt.WhenMappings.<clinit>():void");
        }
    }

    /* access modifiers changed from: private */
    public static final void AvatarActiveIndicator(i iVar, C1500m mVar, int i10, int i11) {
        int i12;
        int i13;
        C1500m h10 = mVar.h(-1051352444);
        int i14 = i11 & 1;
        if (i14 != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 14) == 0) {
            if (h10.S(iVar)) {
                i13 = 4;
            } else {
                i13 = 2;
            }
            i12 = i13 | i10;
        } else {
            i12 = i10;
        }
        if ((i12 & 11) != 2 || !h10.i()) {
            if (i14 != 0) {
                iVar = i.f23074a;
            }
            long r02 = IntercomTheme.INSTANCE.getColors(h10, IntercomTheme.$stable).m674getActive0d7_KjU();
            i n10 = q.n(iVar, h.j((float) 8));
            h10.T(821174264);
            boolean e10 = h10.e(r02);
            Object A10 = h10.A();
            if (e10 || A10 == C1500m.f10026a.a()) {
                A10 = new i(r02);
                h10.r(A10);
            }
            h10.M();
            C2870i.a(n10, (C6798l) A10, h10, 0);
        } else {
            h10.I();
        }
        Y0 k10 = h10.k();
        if (k10 != null) {
            k10.a(new j(iVar, i10, i11));
        }
    }

    /* access modifiers changed from: private */
    public static final C6514M AvatarActiveIndicator$lambda$16$lambda$15(long j10, C2605f fVar) {
        C6496s.h(fVar, "$this$Canvas");
        C2605f.n0(fVar, j10, 0.0f, 0, 0.0f, (C2606g) null, (C2547y0) null, 0, 126, (Object) null);
        return C6514M.f71813a;
    }

    /* access modifiers changed from: private */
    public static final C6514M AvatarActiveIndicator$lambda$17(i iVar, int i10, int i11, C1500m mVar, int i12) {
        AvatarActiveIndicator(iVar, mVar, M0.a(i10 | 1), i11);
        return C6514M.f71813a;
    }

    /* renamed from: AvatarIcon-Rd90Nhg  reason: not valid java name */
    public static final void m208AvatarIconRd90Nhg(i iVar, AvatarWrapper avatarWrapper, g2 g2Var, boolean z10, long j10, C2544x0 x0Var, C1500m mVar, int i10, int i11) {
        i.a aVar;
        f fVar;
        int i12;
        boolean z11;
        long j11;
        C2544x0 x0Var2;
        C6496s.h(avatarWrapper, "avatarWrapper");
        C1500m h10 = mVar.h(462320907);
        if ((i11 & 1) != 0) {
            aVar = i.f23074a;
        } else {
            aVar = iVar;
        }
        if ((i11 & 4) != 0) {
            AvatarShape shape = avatarWrapper.getAvatar().getShape();
            C6496s.g(shape, "getShape(...)");
            i12 = i10 & -897;
            fVar = getComposeShape(shape);
        } else {
            fVar = g2Var;
            i12 = i10;
        }
        if ((i11 & 8) != 0) {
            z11 = false;
        } else {
            z11 = z10;
        }
        if ((i11 & 16) != 0) {
            i12 &= -57345;
            j11 = IntercomTheme.INSTANCE.getTypography(h10, IntercomTheme.$stable).getType04Point5().l();
        } else {
            j11 = j10;
        }
        if ((i11 & 32) != 0) {
            x0Var2 = null;
        } else {
            x0Var2 = x0Var;
        }
        if (C6496s.c(fVar, getComposeShape(AvatarShape.SQUIRCLE))) {
            h10.T(1816424278);
            FinAvatar(aVar, avatarWrapper, fVar, h10, (i12 & 14) | 64 | (i12 & 896), 0);
            h10.M();
        } else {
            h10.T(1816572799);
            m210DefaultAvatarRd90Nhg(avatarWrapper, aVar, fVar, z11, j11, x0Var2, h10, ((i12 << 3) & 112) | 8 | (i12 & 896) | (i12 & 7168) | (57344 & i12) | (i12 & 458752), 0);
            h10.M();
        }
        Y0 k10 = h10.k();
        if (k10 != null) {
            n nVar = r0;
            n nVar2 = new n(aVar, avatarWrapper, fVar, z11, j11, x0Var2, i10, i11);
            k10.a(nVar);
        }
    }

    @IntercomPreviews
    private static final void AvatarIconActivePreview(C1500m mVar, int i10) {
        C1500m h10 = mVar.h(-382759013);
        if (i10 != 0 || !h10.i()) {
            IntercomThemeKt.IntercomTheme((IntercomColors) null, (IntercomTypography) null, (B0) null, ComposableSingletons$AvatarIconKt.INSTANCE.m212getLambda2$intercom_sdk_base_release(), h10, 3072, 7);
        } else {
            h10.I();
        }
        Y0 k10 = h10.k();
        if (k10 != null) {
            k10.a(new b(i10));
        }
    }

    /* access modifiers changed from: private */
    public static final C6514M AvatarIconActivePreview$lambda$23(int i10, C1500m mVar, int i11) {
        AvatarIconActivePreview(mVar, M0.a(i10 | 1));
        return C6514M.f71813a;
    }

    @IntercomPreviews
    private static final void AvatarIconCutPreview(C1500m mVar, int i10) {
        C1500m h10 = mVar.h(-1591864993);
        if (i10 != 0 || !h10.i()) {
            IntercomThemeKt.IntercomTheme((IntercomColors) null, (IntercomTypography) null, (B0) null, ComposableSingletons$AvatarIconKt.INSTANCE.m214getLambda4$intercom_sdk_base_release(), h10, 3072, 7);
        } else {
            h10.I();
        }
        Y0 k10 = h10.k();
        if (k10 != null) {
            k10.a(new c(i10));
        }
    }

    /* access modifiers changed from: private */
    public static final C6514M AvatarIconCutPreview$lambda$25(int i10, C1500m mVar, int i11) {
        AvatarIconCutPreview(mVar, M0.a(i10 | 1));
        return C6514M.f71813a;
    }

    @IntercomPreviews
    private static final void AvatarIconPreview(C1500m mVar, int i10) {
        C1500m h10 = mVar.h(-1461886463);
        if (i10 != 0 || !h10.i()) {
            IntercomThemeKt.IntercomTheme((IntercomColors) null, (IntercomTypography) null, (B0) null, ComposableSingletons$AvatarIconKt.INSTANCE.m211getLambda1$intercom_sdk_base_release(), h10, 3072, 7);
        } else {
            h10.I();
        }
        Y0 k10 = h10.k();
        if (k10 != null) {
            k10.a(new d(i10));
        }
    }

    /* access modifiers changed from: private */
    public static final C6514M AvatarIconPreview$lambda$22(int i10, C1500m mVar, int i11) {
        AvatarIconPreview(mVar, M0.a(i10 | 1));
        return C6514M.f71813a;
    }

    @IntercomPreviews
    private static final void AvatarIconSquirclePreview(C1500m mVar, int i10) {
        C1500m h10 = mVar.h(-1626854011);
        if (i10 != 0 || !h10.i()) {
            IntercomThemeKt.IntercomTheme((IntercomColors) null, (IntercomTypography) null, (B0) null, ComposableSingletons$AvatarIconKt.INSTANCE.m213getLambda3$intercom_sdk_base_release(), h10, 3072, 7);
        } else {
            h10.I();
        }
        Y0 k10 = h10.k();
        if (k10 != null) {
            k10.a(new e(i10));
        }
    }

    /* access modifiers changed from: private */
    public static final C6514M AvatarIconSquirclePreview$lambda$24(int i10, C1500m mVar, int i11) {
        AvatarIconSquirclePreview(mVar, M0.a(i10 | 1));
        return C6514M.f71813a;
    }

    /* access modifiers changed from: private */
    public static final C6514M AvatarIcon_Rd90Nhg$lambda$0(i iVar, AvatarWrapper avatarWrapper, g2 g2Var, boolean z10, long j10, C2544x0 x0Var, int i10, int i11, C1500m mVar, int i12) {
        C6496s.h(avatarWrapper, "$avatarWrapper");
        m208AvatarIconRd90Nhg(iVar, avatarWrapper, g2Var, z10, j10, x0Var, mVar, M0.a(i10 | 1), i11);
        return C6514M.f71813a;
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x0050  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0055  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x006b  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0070  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0089  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x008c  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00ab  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00b2  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x01f2  */
    /* JADX WARNING: Removed duplicated region for block: B:89:? A[RETURN, SYNTHETIC] */
    /* renamed from: AvatarPlaceholder-jxWH9Kg  reason: not valid java name */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static final void m209AvatarPlaceholderjxWH9Kg(k0.i r35, java.lang.String r36, long r37, long r39, java.lang.String r41, Y.C1500m r42, int r43, int r44) {
        /*
            r8 = r41
            r9 = r43
            r0 = 8
            r1 = 16
            r2 = 2
            r3 = 4
            r4 = -99590848(0xfffffffffa105d40, float:-1.8739552E35)
            r5 = r42
            Y.m r7 = r5.h(r4)
            r4 = 1
            r5 = r44 & 1
            if (r5 == 0) goto L_0x001e
            r6 = r9 | 6
            r10 = r6
            r6 = r35
            goto L_0x0032
        L_0x001e:
            r6 = r9 & 14
            if (r6 != 0) goto L_0x002f
            r6 = r35
            boolean r10 = r7.S(r6)
            if (r10 == 0) goto L_0x002c
            r10 = r3
            goto L_0x002d
        L_0x002c:
            r10 = r2
        L_0x002d:
            r10 = r10 | r9
            goto L_0x0032
        L_0x002f:
            r6 = r35
            r10 = r9
        L_0x0032:
            r2 = r44 & 2
            if (r2 == 0) goto L_0x003b
            r10 = r10 | 48
        L_0x0038:
            r2 = r36
            goto L_0x004c
        L_0x003b:
            r2 = r9 & 112(0x70, float:1.57E-43)
            if (r2 != 0) goto L_0x0038
            r2 = r36
            boolean r11 = r7.S(r2)
            if (r11 == 0) goto L_0x004a
            r11 = 32
            goto L_0x004b
        L_0x004a:
            r11 = r1
        L_0x004b:
            r10 = r10 | r11
        L_0x004c:
            r3 = r44 & 4
            if (r3 == 0) goto L_0x0055
            r10 = r10 | 384(0x180, float:5.38E-43)
            r14 = r37
            goto L_0x0067
        L_0x0055:
            r3 = r9 & 896(0x380, float:1.256E-42)
            r14 = r37
            if (r3 != 0) goto L_0x0067
            boolean r3 = r7.e(r14)
            if (r3 == 0) goto L_0x0064
            r3 = 256(0x100, float:3.59E-43)
            goto L_0x0066
        L_0x0064:
            r3 = 128(0x80, float:1.794E-43)
        L_0x0066:
            r10 = r10 | r3
        L_0x0067:
            r3 = r44 & 8
            if (r3 == 0) goto L_0x0070
            r10 = r10 | 3072(0xc00, float:4.305E-42)
            r12 = r39
            goto L_0x0082
        L_0x0070:
            r3 = r9 & 7168(0x1c00, float:1.0045E-41)
            r12 = r39
            if (r3 != 0) goto L_0x0082
            boolean r3 = r7.e(r12)
            if (r3 == 0) goto L_0x007f
            r3 = 2048(0x800, float:2.87E-42)
            goto L_0x0081
        L_0x007f:
            r3 = 1024(0x400, float:1.435E-42)
        L_0x0081:
            r10 = r10 | r3
        L_0x0082:
            r1 = r44 & 16
            r11 = 57344(0xe000, float:8.0356E-41)
            if (r1 == 0) goto L_0x008c
            r10 = r10 | 24576(0x6000, float:3.4438E-41)
            goto L_0x009c
        L_0x008c:
            r1 = r9 & r11
            if (r1 != 0) goto L_0x009c
            boolean r1 = r7.S(r8)
            if (r1 == 0) goto L_0x0099
            r1 = 16384(0x4000, float:2.2959E-41)
            goto L_0x009b
        L_0x0099:
            r1 = 8192(0x2000, float:1.14794E-41)
        L_0x009b:
            r10 = r10 | r1
        L_0x009c:
            r1 = 46811(0xb6db, float:6.5596E-41)
            r1 = r1 & r10
            r0 = 9362(0x2492, float:1.3119E-41)
            if (r1 != r0) goto L_0x00b2
            boolean r0 = r7.i()
            if (r0 != 0) goto L_0x00ab
            goto L_0x00b2
        L_0x00ab:
            r7.I()
            r1 = r6
            r10 = r7
            goto L_0x01ec
        L_0x00b2:
            if (r5 == 0) goto L_0x00b7
            k0.i$a r0 = k0.i.f23074a
            r6 = r0
        L_0x00b7:
            k0.c$a r0 = k0.c.f23044a
            k0.c r0 = r0.e()
            r1 = 0
            H0.F r0 = androidx.compose.foundation.layout.d.h(r0, r1)
            int r5 = Y.C1494j.a(r7, r1)
            Y.y r1 = r7.p()
            k0.i r4 = k0.h.e(r7, r6)
            J0.g$a r17 = J0.C1241g.f3853J
            yf.a r3 = r17.a()
            Y.f r19 = r7.j()
            if (r19 != 0) goto L_0x00dd
            Y.C1494j.c()
        L_0x00dd:
            r7.F()
            boolean r19 = r7.f()
            if (r19 == 0) goto L_0x00ea
            r7.U(r3)
            goto L_0x00ed
        L_0x00ea:
            r7.q()
        L_0x00ed:
            Y.m r3 = Y.F1.a(r7)
            yf.p r11 = r17.c()
            Y.F1.b(r3, r0, r11)
            yf.p r0 = r17.e()
            Y.F1.b(r3, r1, r0)
            yf.p r0 = r17.b()
            boolean r1 = r3.f()
            if (r1 != 0) goto L_0x0117
            java.lang.Object r1 = r3.A()
            java.lang.Integer r11 = java.lang.Integer.valueOf(r5)
            boolean r1 = kotlin.jvm.internal.C6496s.c(r1, r11)
            if (r1 != 0) goto L_0x0125
        L_0x0117:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r5)
            r3.r(r1)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r5)
            r3.V(r1, r0)
        L_0x0125:
            yf.p r0 = r17.d()
            Y.F1.b(r3, r4, r0)
            androidx.compose.foundation.layout.f r0 = androidx.compose.foundation.layout.f.f12848a
            boolean r0 = Sg.p.d0(r36)
            if (r0 != 0) goto L_0x01b4
            r0 = -2026950757(0xffffffff872f2f9b, float:-1.3179527E-34)
            r7.T(r0)
            k0.i$a r0 = k0.i.f23074a
            r1 = -758120322(0xffffffffd2d0007e, float:-4.46680728E11)
            r7.T(r1)
            r1 = 57344(0xe000, float:8.0356E-41)
            r1 = r1 & r10
            r3 = 16384(0x4000, float:2.2959E-41)
            if (r1 != r3) goto L_0x014c
            r1 = 1
            goto L_0x014d
        L_0x014c:
            r1 = 0
        L_0x014d:
            java.lang.Object r3 = r7.A()
            if (r1 != 0) goto L_0x015b
            Y.m$a r1 = Y.C1500m.f10026a
            java.lang.Object r1 = r1.a()
            if (r3 != r1) goto L_0x0163
        L_0x015b:
            io.intercom.android.sdk.m5.components.avatar.f r3 = new io.intercom.android.sdk.m5.components.avatar.f
            r3.<init>(r8)
            r7.r(r3)
        L_0x0163:
            yf.l r3 = (yf.C6798l) r3
            r7.M()
            r1 = 0
            r4 = 1
            r5 = 0
            k0.i r11 = O0.m.d(r0, r5, r3, r4, r1)
            io.intercom.android.sdk.ui.theme.IntercomTheme r0 = io.intercom.android.sdk.ui.theme.IntercomTheme.INSTANCE
            int r1 = io.intercom.android.sdk.ui.theme.IntercomTheme.$stable
            io.intercom.android.sdk.ui.theme.IntercomTypography r0 = r0.getTypography(r7, r1)
            Q0.T r30 = r0.getType04Point5()
            int r0 = r10 >> 3
            r0 = r0 & 14
            r1 = r10 & 896(0x380, float:1.256E-42)
            r0 = r0 | r1
            r1 = r10 & 7168(0x1c00, float:1.0045E-41)
            r32 = r0 | r1
            r33 = 0
            r34 = 65520(0xfff0, float:9.1813E-41)
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r25 = 0
            r26 = 0
            r27 = 0
            r28 = 0
            r29 = 0
            r10 = r36
            r12 = r37
            r14 = r39
            r31 = r7
            V.T0.b(r10, r11, r12, r14, r16, r17, r18, r19, r21, r22, r23, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34)
            r7.M()
            r12 = r6
            r10 = r7
            goto L_0x01e8
        L_0x01b4:
            r0 = -2026601015(0xffffffff873485c9, float:-1.3581011E-34)
            r7.T(r0)
            int r0 = io.intercom.android.sdk.R.drawable.intercom_ic_avatar_person
            r1 = 0
            w0.c r0 = M0.e.c(r0, r7, r1)
            r1 = 8
            float r3 = (float) r1
            float r3 = c1.h.j(r3)
            k0.i r3 = androidx.compose.foundation.layout.n.i(r6, r3)
            int r4 = r10 >> 9
            r4 = r4 & 112(0x70, float:1.57E-43)
            r1 = r1 | r4
            int r4 = r10 << 3
            r4 = r4 & 7168(0x1c00, float:1.0045E-41)
            r10 = r1 | r4
            r11 = 0
            r1 = r41
            r2 = r3
            r3 = r37
            r5 = r7
            r12 = r6
            r6 = r10
            r10 = r7
            r7 = r11
            V.V.a(r0, r1, r2, r3, r5, r6, r7)
            r10.M()
        L_0x01e8:
            r10.u()
            r1 = r12
        L_0x01ec:
            Y.Y0 r10 = r10.k()
            if (r10 == 0) goto L_0x0207
            io.intercom.android.sdk.m5.components.avatar.g r11 = new io.intercom.android.sdk.m5.components.avatar.g
            r0 = r11
            r2 = r36
            r3 = r37
            r5 = r39
            r7 = r41
            r8 = r43
            r9 = r44
            r0.<init>(r1, r2, r3, r5, r7, r8, r9)
            r10.a(r11)
        L_0x0207:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: io.intercom.android.sdk.m5.components.avatar.AvatarIconKt.m209AvatarPlaceholderjxWH9Kg(k0.i, java.lang.String, long, long, java.lang.String, Y.m, int, int):void");
    }

    /* access modifiers changed from: private */
    public static final C6514M AvatarPlaceholder_jxWH9Kg$lambda$20$lambda$19$lambda$18(String str, v vVar) {
        C6496s.h(str, "$contentDescription");
        C6496s.h(vVar, "$this$semantics");
        t.Y(vVar, str);
        return C6514M.f71813a;
    }

    /* access modifiers changed from: private */
    public static final C6514M AvatarPlaceholder_jxWH9Kg$lambda$21(i iVar, String str, long j10, long j11, String str2, int i10, int i11, C1500m mVar, int i12) {
        C6496s.h(str, "$avatarInitials");
        String str3 = str2;
        C6496s.h(str3, "$contentDescription");
        m209AvatarPlaceholderjxWH9Kg(iVar, str, j10, j11, str3, mVar, M0.a(i10 | 1), i11);
        return C6514M.f71813a;
    }

    private static final void BotAvatarPlaceholder(AvatarWrapper avatarWrapper, i iVar, float f10, C1500m mVar, int i10, int i11) {
        i.a aVar;
        float f11;
        C1500m h10 = mVar.h(1859249921);
        if ((i11 & 2) != 0) {
            aVar = i.f23074a;
        } else {
            aVar = iVar;
        }
        if ((i11 & 4) != 0) {
            f11 = 1.0f;
        } else {
            f11 = f10;
        }
        C2842F.a(e.c(R.drawable.intercom_default_avatar_icon, h10, 0), avatarWrapper.getAvatar().getLabel(), aVar, (c) null, (C1187h) null, f11, (C2547y0) null, h10, ((i10 << 3) & 896) | 8 | ((i10 << 9) & 458752), 88);
        Y0 k10 = h10.k();
        if (k10 != null) {
            k10.a(new m(avatarWrapper, aVar, f11, i10, i11));
        }
    }

    /* access modifiers changed from: private */
    public static final C6514M BotAvatarPlaceholder$lambda$14(AvatarWrapper avatarWrapper, i iVar, float f10, int i10, int i11, C1500m mVar, int i12) {
        C6496s.h(avatarWrapper, "$avatarWrapper");
        BotAvatarPlaceholder(avatarWrapper, iVar, f10, mVar, M0.a(i10 | 1), i11);
        return C6514M.f71813a;
    }

    @IntercomPreviews
    private static final void BotAvatarPreview(C1500m mVar, int i10) {
        C1500m h10 = mVar.h(1158049743);
        if (i10 != 0 || !h10.i()) {
            IntercomThemeKt.IntercomTheme((IntercomColors) null, (IntercomTypography) null, (B0) null, ComposableSingletons$AvatarIconKt.INSTANCE.m215getLambda5$intercom_sdk_base_release(), h10, 3072, 7);
        } else {
            h10.I();
        }
        Y0 k10 = h10.k();
        if (k10 != null) {
            k10.a(new a(i10));
        }
    }

    /* access modifiers changed from: private */
    public static final C6514M BotAvatarPreview$lambda$26(int i10, C1500m mVar, int i11) {
        BotAvatarPreview(mVar, M0.a(i10 | 1));
        return C6514M.f71813a;
    }

    /* renamed from: DefaultAvatar-Rd90Nhg  reason: not valid java name */
    private static final void m210DefaultAvatarRd90Nhg(AvatarWrapper avatarWrapper, i iVar, g2 g2Var, boolean z10, long j10, C2544x0 x0Var, C1500m mVar, int i10, int i11) {
        i.a aVar;
        f fVar;
        int i12;
        boolean z11;
        long j11;
        C2544x0 x0Var2;
        long j12;
        C1500m h10 = mVar.h(386725315);
        if ((i11 & 2) != 0) {
            aVar = i.f23074a;
        } else {
            aVar = iVar;
        }
        if ((i11 & 4) != 0) {
            i12 = i10 & -897;
            fVar = getComposeShape(AvatarShape.CIRCLE);
        } else {
            fVar = g2Var;
            i12 = i10;
        }
        if ((i11 & 8) != 0) {
            z11 = false;
        } else {
            z11 = z10;
        }
        if ((i11 & 16) != 0) {
            j11 = IntercomTheme.INSTANCE.getTypography(h10, IntercomTheme.$stable).getType04Point5().l();
            i12 &= -57345;
        } else {
            j11 = j10;
        }
        if ((i11 & 32) != 0) {
            x0Var2 = null;
        } else {
            x0Var2 = x0Var;
        }
        long r17 = IntercomTheme.INSTANCE.getColors(h10, IntercomTheme.$stable).m672getAction0d7_KjU();
        h10.T(870353824);
        Object A10 = h10.A();
        C1500m.a aVar2 = C1500m.f10026a;
        if (A10 == aVar2.a()) {
            if (x0Var2 != null) {
                j12 = x0Var2.y();
            } else {
                j12 = ColorExtensionsKt.m711darken8_81llA(r17);
            }
            A10 = u1.d(C2544x0.k(j12), (o1) null, 2, (Object) null);
            h10.r(A10);
        }
        C1510r0 r0Var = (C1510r0) A10;
        h10.M();
        long r20 = ColorExtensionsKt.m712generateTextColor8_81llA(DefaultAvatar_Rd90Nhg$lambda$2(r0Var));
        boolean r12 = ColorExtensionsKt.m718isDarkColor8_81llA(DefaultAvatar_Rd90Nhg$lambda$2(r0Var));
        h10.T(870360972);
        Object A11 = h10.A();
        if (A11 == aVar2.a()) {
            A11 = u1.d(h.e(h.j((float) 8)), (o1) null, 2, (Object) null);
            h10.r(A11);
        }
        C1510r0 r0Var2 = (C1510r0) A11;
        h10.M();
        h10.T(870362701);
        Object A12 = h10.A();
        if (A12 == aVar2.a()) {
            A12 = u1.d(fVar, (o1) null, 2, (Object) null);
            h10.r(A12);
        }
        h10.M();
        AvatarIconKt$DefaultAvatar$1 avatarIconKt$DefaultAvatar$1 = r9;
        AvatarIconKt$DefaultAvatar$1 avatarIconKt$DefaultAvatar$12 = new AvatarIconKt$DefaultAvatar$1(z11, fVar, r12, r0Var2, (C1510r0) A12, r0Var, avatarWrapper, r17, x0Var2, r20, j11);
        C1087e.a(aVar, (c) null, false, g0.c.e(-1891463123, true, avatarIconKt$DefaultAvatar$1, h10, 54), h10, ((i12 >> 3) & 14) | 3072, 6);
        Y0 k10 = h10.k();
        if (k10 != null) {
            k10.a(new k(avatarWrapper, aVar, fVar, z11, j11, x0Var2, i10, i11));
        }
    }

    /* access modifiers changed from: private */
    public static final void DefaultAvatar_Rd90Nhg$Placeholder(AvatarWrapper avatarWrapper, long j10, long j11, i iVar, C1500m mVar, int i10, int i11) {
        i iVar2;
        C1500m mVar2 = mVar;
        mVar2.T(1593692287);
        if ((i11 & 1) != 0) {
            iVar2 = i.f23074a;
        } else {
            iVar2 = iVar;
        }
        if (avatarWrapper.isBot()) {
            mVar2.T(-731150059);
            BotAvatarPlaceholder(avatarWrapper, n.i(iVar2, h.j((float) 8)), 0.0f, mVar, 8, 4);
            mVar.M();
        } else {
            mVar2.T(-730984085);
            m209AvatarPlaceholderjxWH9Kg(iVar2, avatarWrapper.getInitials(), j10, j11, avatarWrapper.getLabel(), mVar, i10 & 14, 0);
            mVar.M();
        }
        mVar.M();
    }

    /* access modifiers changed from: private */
    public static final C6514M DefaultAvatar_Rd90Nhg$lambda$10(AvatarWrapper avatarWrapper, i iVar, g2 g2Var, boolean z10, long j10, C2544x0 x0Var, int i10, int i11, C1500m mVar, int i12) {
        C6496s.h(avatarWrapper, "$avatarWrapper");
        m210DefaultAvatarRd90Nhg(avatarWrapper, iVar, g2Var, z10, j10, x0Var, mVar, M0.a(i10 | 1), i11);
        return C6514M.f71813a;
    }

    /* access modifiers changed from: private */
    public static final long DefaultAvatar_Rd90Nhg$lambda$2(C1510r0 r0Var) {
        return ((C2544x0) r0Var.getValue()).y();
    }

    /* access modifiers changed from: private */
    public static final void DefaultAvatar_Rd90Nhg$lambda$3(C1510r0 r0Var, long j10) {
        r0Var.setValue(C2544x0.k(j10));
    }

    /* access modifiers changed from: private */
    public static final float DefaultAvatar_Rd90Nhg$lambda$5(C1510r0 r0Var) {
        return ((h) r0Var.getValue()).r();
    }

    /* access modifiers changed from: private */
    public static final void DefaultAvatar_Rd90Nhg$lambda$6(C1510r0 r0Var, float f10) {
        r0Var.setValue(h.e(f10));
    }

    /* access modifiers changed from: private */
    public static final g2 DefaultAvatar_Rd90Nhg$lambda$8(C1510r0 r0Var) {
        return (g2) r0Var.getValue();
    }

    /* access modifiers changed from: private */
    public static final void DefaultAvatar_Rd90Nhg$lambda$9(C1510r0 r0Var, g2 g2Var) {
        r0Var.setValue(g2Var);
    }

    private static final void FinAvatar(i iVar, AvatarWrapper avatarWrapper, g2 g2Var, C1500m mVar, int i10, int i11) {
        i.a aVar;
        f fVar;
        i iVar2;
        g2 g2Var2;
        C1500m mVar2;
        AvatarWrapper avatarWrapper2 = avatarWrapper;
        C1500m h10 = mVar.h(-1375245291);
        if ((i11 & 1) != 0) {
            aVar = i.f23074a;
        } else {
            aVar = iVar;
        }
        if ((i11 & 4) != 0) {
            fVar = getComposeShape(AvatarShape.SQUIRCLE);
        } else {
            fVar = g2Var;
        }
        i h11 = aVar.h(C2342e.a(i.f23074a, fVar));
        if (!p.d0(avatarWrapper.getImageUrl())) {
            h10.T(-446848193);
            u.c(avatarWrapper.getImageUrl(), avatarWrapper.getAvatar().getLabel(), IntercomImageLoaderKt.getImageLoader((Context) h10.m(AndroidCompositionLocals_androidKt.g())), h11, (C6798l) null, g0.c.e(-1294140715, true, new AvatarIconKt$FinAvatar$1(avatarWrapper2, h11), h10, 54), (r) null, g0.c.e(-818047861, true, new AvatarIconKt$FinAvatar$2(avatarWrapper2, h11), h10, 54), (C6798l) null, (C6798l) null, (C6798l) null, (c) null, (C1187h) null, 0.0f, (C2547y0) null, 0, false, (Z3.p) null, h10, 12780032, 0, 261968);
            h10.M();
            g2Var2 = fVar;
            iVar2 = aVar;
            mVar2 = h10;
        } else {
            h10.T(-446135689);
            g2Var2 = fVar;
            iVar2 = aVar;
            mVar2 = h10;
            FinAvatarPlaceholder(avatarWrapper, h11, 0.0f, h10, 8, 4);
            mVar2.M();
        }
        Y0 k10 = mVar2.k();
        if (k10 != null) {
            k10.a(new h(iVar2, avatarWrapper, g2Var2, i10, i11));
        }
    }

    /* access modifiers changed from: private */
    public static final C6514M FinAvatar$lambda$11(i iVar, AvatarWrapper avatarWrapper, g2 g2Var, int i10, int i11, C1500m mVar, int i12) {
        C6496s.h(avatarWrapper, "$avatarWrapper");
        FinAvatar(iVar, avatarWrapper, g2Var, mVar, M0.a(i10 | 1), i11);
        return C6514M.f71813a;
    }

    /* access modifiers changed from: private */
    public static final void FinAvatarPlaceholder(AvatarWrapper avatarWrapper, i iVar, float f10, C1500m mVar, int i10, int i11) {
        C1500m h10 = mVar.h(-427803587);
        if ((i11 & 2) != 0) {
            iVar = i.f23074a;
        }
        if ((i11 & 4) != 0) {
            f10 = 1.0f;
        }
        i d10 = b.d(iVar, ColorExtensionsKt.m711darken8_81llA(IntercomTheme.INSTANCE.getColors(h10, IntercomTheme.$stable).m672getAction0d7_KjU()), (g2) null, 2, (Object) null);
        F h11 = d.h(c.f23044a.e(), false);
        int a10 = C1494j.a(h10, 0);
        C1523y p10 = h10.p();
        i e10 = k0.h.e(h10, d10);
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
        F1.b(a12, h11, aVar.c());
        F1.b(a12, p10, aVar.e());
        yf.p b10 = aVar.b();
        if (a12.f() || !C6496s.c(a12.A(), Integer.valueOf(a10))) {
            a12.r(Integer.valueOf(a10));
            a12.V(Integer.valueOf(a10), b10);
        }
        F1.b(a12, e10, aVar.d());
        androidx.compose.foundation.layout.f fVar = androidx.compose.foundation.layout.f.f12848a;
        BotAvatarPlaceholder(avatarWrapper, n.i(i.f23074a, h.j((float) 4)), f10, h10, (i10 & 896) | 56, 0);
        h10.u();
        Y0 k10 = h10.k();
        if (k10 != null) {
            k10.a(new l(avatarWrapper, iVar, f10, i10, i11));
        }
    }

    /* access modifiers changed from: private */
    public static final C6514M FinAvatarPlaceholder$lambda$13(AvatarWrapper avatarWrapper, i iVar, float f10, int i10, int i11, C1500m mVar, int i12) {
        C6496s.h(avatarWrapper, "$avatarWrapper");
        FinAvatarPlaceholder(avatarWrapper, iVar, f10, mVar, M0.a(i10 | 1), i11);
        return C6514M.f71813a;
    }

    public static final i avatarBorder(i iVar, boolean z10, g2 g2Var) {
        C6496s.h(iVar, "<this>");
        C6496s.h(g2Var, "shape");
        if (z10) {
            return C2866e.g(iVar, h.j((float) 0.5d), C2514n0.a.b(C2514n0.f25547b, C6565s.q(C2544x0.k(C2550z0.b(872415231)), C2544x0.k(C2550z0.b(872415231))), 0.0f, 0.0f, 0, 14, (Object) null), g2Var);
        }
        return iVar;
    }

    public static final f getComposeShape(AvatarShape avatarShape) {
        C6496s.h(avatarShape, "<this>");
        int i10 = WhenMappings.$EnumSwitchMapping$0[avatarShape.ordinal()];
        if (i10 == 1) {
            return g.a(50);
        }
        if (i10 == 2) {
            return g.a(16);
        }
        throw new C6535s();
    }
}
