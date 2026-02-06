package io.intercom.android.sdk.m5.components.avatar;

import C.C1088f;
import Y.C1500m;
import Y.C1510r0;
import Z3.f;
import io.intercom.android.sdk.utilities.ColorExtensionsKt;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import lf.C6514M;
import r0.C2544x0;
import r0.g2;
import yf.q;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
final class AvatarIconKt$DefaultAvatar$1 implements q {
    final /* synthetic */ AvatarWrapper $avatarWrapper;
    final /* synthetic */ C1510r0 $backgroundColor$delegate;
    final /* synthetic */ C2544x0 $customBackgroundColor;
    final /* synthetic */ C1510r0 $cutShape$delegate;
    final /* synthetic */ long $defaultBackgroundColor;
    final /* synthetic */ C1510r0 $indicatorSize$delegate;
    final /* synthetic */ boolean $isActive;
    final /* synthetic */ long $placeHolderTextSize;
    final /* synthetic */ g2 $shape;
    final /* synthetic */ boolean $shouldDrawBorder;
    final /* synthetic */ long $textColor;

    AvatarIconKt$DefaultAvatar$1(boolean z10, g2 g2Var, boolean z11, C1510r0 r0Var, C1510r0 r0Var2, C1510r0 r0Var3, AvatarWrapper avatarWrapper, long j10, C2544x0 x0Var, long j11, long j12) {
        this.$isActive = z10;
        this.$shape = g2Var;
        this.$shouldDrawBorder = z11;
        this.$indicatorSize$delegate = r0Var;
        this.$cutShape$delegate = r0Var2;
        this.$backgroundColor$delegate = r0Var3;
        this.$avatarWrapper = avatarWrapper;
        this.$defaultBackgroundColor = j10;
        this.$customBackgroundColor = x0Var;
        this.$textColor = j11;
        this.$placeHolderTextSize = j12;
    }

    /* access modifiers changed from: private */
    public static final C6514M invoke$lambda$6$lambda$1$lambda$0(long j10, C1510r0 r0Var, f.b.c cVar) {
        C6496s.h(r0Var, "$backgroundColor$delegate");
        C6496s.h(cVar, "it");
        if (C2544x0.q(AvatarIconKt.DefaultAvatar_Rd90Nhg$lambda$2(r0Var), C2544x0.f25560b.g())) {
            AvatarIconKt.DefaultAvatar_Rd90Nhg$lambda$3(r0Var, j10);
        }
        return C6514M.f71813a;
    }

    /* access modifiers changed from: private */
    public static final C6514M invoke$lambda$6$lambda$3$lambda$2(C2544x0 x0Var, long j10, C1510r0 r0Var, f.b.d dVar) {
        long j11;
        C6496s.h(r0Var, "$backgroundColor$delegate");
        C6496s.h(dVar, "it");
        if (x0Var != null) {
            j11 = x0Var.y();
        } else {
            j11 = ColorExtensionsKt.m711darken8_81llA(j10);
        }
        AvatarIconKt.DefaultAvatar_Rd90Nhg$lambda$3(r0Var, j11);
        return C6514M.f71813a;
    }

    /* access modifiers changed from: private */
    public static final C6514M invoke$lambda$6$lambda$5$lambda$4(long j10, C1510r0 r0Var, f.b.C0194b bVar) {
        C6496s.h(r0Var, "$backgroundColor$delegate");
        C6496s.h(bVar, "it");
        if (C2544x0.q(AvatarIconKt.DefaultAvatar_Rd90Nhg$lambda$2(r0Var), C2544x0.f25560b.g())) {
            AvatarIconKt.DefaultAvatar_Rd90Nhg$lambda$3(r0Var, j10);
        }
        return C6514M.f71813a;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        invoke((C1088f) obj, (C1500m) obj2, ((Number) obj3).intValue());
        return C6514M.f71813a;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v2, resolved type: yf.l} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v7, resolved type: yf.l} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v1, resolved type: yf.l} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void invoke(C.C1088f r32, Y.C1500m r33, int r34) {
        /*
            r31 = this;
            r0 = r31
            r1 = r32
            r14 = r33
            java.lang.String r2 = "$this$BoxWithConstraints"
            kotlin.jvm.internal.C6496s.h(r1, r2)
            r2 = r34 & 14
            if (r2 != 0) goto L_0x001b
            boolean r2 = r14.S(r1)
            if (r2 == 0) goto L_0x0017
            r2 = 4
            goto L_0x0018
        L_0x0017:
            r2 = 2
        L_0x0018:
            r2 = r34 | r2
            goto L_0x001d
        L_0x001b:
            r2 = r34
        L_0x001d:
            r2 = r2 & 91
            r3 = 18
            if (r2 != r3) goto L_0x002f
            boolean r2 = r33.i()
            if (r2 != 0) goto L_0x002a
            goto L_0x002f
        L_0x002a:
            r33.I()
            goto L_0x023d
        L_0x002f:
            boolean r2 = r0.$isActive
            r3 = 0
            if (r2 == 0) goto L_0x0068
            Y.r0 r2 = r0.$indicatorSize$delegate
            float r4 = r32.d()
            r5 = 36
            float r5 = (float) r5
            float r5 = c1.h.j(r5)
            int r4 = c1.h.i(r4, r5)
            if (r4 <= 0) goto L_0x004f
            r4 = 16
        L_0x0049:
            float r4 = (float) r4
            float r4 = c1.h.j(r4)
            goto L_0x0052
        L_0x004f:
            r4 = 8
            goto L_0x0049
        L_0x0052:
            io.intercom.android.sdk.m5.components.avatar.AvatarIconKt.DefaultAvatar_Rd90Nhg$lambda$6(r2, r4)
            Y.r0 r2 = r0.$cutShape$delegate
            io.intercom.android.sdk.m5.shapes.CutAvatarWithIndicatorShape r4 = new io.intercom.android.sdk.m5.shapes.CutAvatarWithIndicatorShape
            r0.g2 r5 = r0.$shape
            Y.r0 r6 = r0.$indicatorSize$delegate
            float r6 = io.intercom.android.sdk.m5.components.avatar.AvatarIconKt.DefaultAvatar_Rd90Nhg$lambda$5(r6)
            r4.<init>(r5, r6, r3)
            io.intercom.android.sdk.m5.components.avatar.AvatarIconKt.DefaultAvatar_Rd90Nhg$lambda$9(r2, r4)
            goto L_0x006f
        L_0x0068:
            Y.r0 r2 = r0.$cutShape$delegate
            r0.g2 r4 = r0.$shape
            io.intercom.android.sdk.m5.components.avatar.AvatarIconKt.DefaultAvatar_Rd90Nhg$lambda$9(r2, r4)
        L_0x006f:
            k0.i$a r11 = k0.i.f23074a
            k0.i r2 = r1.f(r11)
            Y.r0 r4 = r0.$backgroundColor$delegate
            long r4 = io.intercom.android.sdk.m5.components.avatar.AvatarIconKt.DefaultAvatar_Rd90Nhg$lambda$2(r4)
            Y.r0 r6 = r0.$cutShape$delegate
            r0.g2 r6 = io.intercom.android.sdk.m5.components.avatar.AvatarIconKt.DefaultAvatar_Rd90Nhg$lambda$8(r6)
            k0.i r2 = androidx.compose.foundation.b.c(r2, r4, r6)
            boolean r4 = r0.$shouldDrawBorder
            Y.r0 r5 = r0.$cutShape$delegate
            r0.g2 r5 = io.intercom.android.sdk.m5.components.avatar.AvatarIconKt.DefaultAvatar_Rd90Nhg$lambda$8(r5)
            k0.i r2 = io.intercom.android.sdk.m5.components.avatar.AvatarIconKt.avatarBorder(r2, r4, r5)
            Y.r0 r4 = r0.$cutShape$delegate
            r0.g2 r4 = io.intercom.android.sdk.m5.components.avatar.AvatarIconKt.DefaultAvatar_Rd90Nhg$lambda$8(r4)
            k0.i r2 = o0.C2342e.a(r2, r4)
            io.intercom.android.sdk.m5.components.avatar.AvatarWrapper r10 = r0.$avatarWrapper
            long r12 = r0.$defaultBackgroundColor
            r0.x0 r15 = r0.$customBackgroundColor
            long r8 = r0.$textColor
            long r6 = r0.$placeHolderTextSize
            Y.r0 r5 = r0.$backgroundColor$delegate
            k0.c$a r24 = k0.c.f23044a
            k0.c r4 = r24.o()
            r3 = 0
            H0.F r4 = androidx.compose.foundation.layout.d.h(r4, r3)
            int r16 = Y.C1494j.a(r14, r3)
            Y.y r3 = r33.p()
            k0.i r2 = k0.h.e(r14, r2)
            J0.g$a r17 = J0.C1241g.f3853J
            r18 = r5
            yf.a r5 = r17.a()
            Y.f r19 = r33.j()
            if (r19 != 0) goto L_0x00cf
            Y.C1494j.c()
        L_0x00cf:
            r33.F()
            boolean r19 = r33.f()
            if (r19 == 0) goto L_0x00dc
            r14.U(r5)
            goto L_0x00df
        L_0x00dc:
            r33.q()
        L_0x00df:
            Y.m r5 = Y.F1.a(r33)
            r21 = r6
            yf.p r6 = r17.c()
            Y.F1.b(r5, r4, r6)
            yf.p r4 = r17.e()
            Y.F1.b(r5, r3, r4)
            yf.p r3 = r17.b()
            boolean r4 = r5.f()
            if (r4 != 0) goto L_0x010b
            java.lang.Object r4 = r5.A()
            java.lang.Integer r6 = java.lang.Integer.valueOf(r16)
            boolean r4 = kotlin.jvm.internal.C6496s.c(r4, r6)
            if (r4 != 0) goto L_0x0119
        L_0x010b:
            java.lang.Integer r4 = java.lang.Integer.valueOf(r16)
            r5.r(r4)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r16)
            r5.V(r4, r3)
        L_0x0119:
            yf.p r3 = r17.d()
            Y.F1.b(r5, r2, r3)
            androidx.compose.foundation.layout.f r2 = androidx.compose.foundation.layout.f.f12848a
            java.lang.String r3 = r10.getImageUrl()
            k0.c r4 = r24.e()
            k0.i r2 = r2.e(r11, r4)
            r4 = 0
            r6 = 1
            r5 = 0
            k0.i r25 = androidx.compose.foundation.layout.q.f(r2, r4, r6, r5)
            java.lang.String r26 = r10.getLabel()
            Y.I0 r2 = androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.g()
            java.lang.Object r2 = r14.m(r2)
            android.content.Context r2 = (android.content.Context) r2
            X3.g r27 = io.intercom.android.sdk.ui.coil.IntercomImageLoaderKt.getImageLoader(r2)
            H0.h$a r2 = H0.C1187h.f2609a
            H0.h r28 = r2.a()
            io.intercom.android.sdk.m5.components.avatar.AvatarIconKt$DefaultAvatar$1$1$1 r2 = new io.intercom.android.sdk.m5.components.avatar.AvatarIconKt$DefaultAvatar$1$1$1
            r4 = r2
            r7 = r18
            r5 = r10
            r1 = r6
            r34 = r11
            r16 = r21
            r11 = r7
            r6 = r8
            r18 = r8
            r8 = r16
            r4.<init>(r5, r6, r8)
            r4 = -1513639009(0xffffffffa5c7b39f, float:-3.4642713E-16)
            r8 = 54
            g0.a r29 = g0.c.e(r4, r1, r2, r14, r8)
            io.intercom.android.sdk.m5.components.avatar.AvatarIconKt$DefaultAvatar$1$1$2 r2 = new io.intercom.android.sdk.m5.components.avatar.AvatarIconKt$DefaultAvatar$1$1$2
            r4 = r2
            r6 = r18
            r10 = r8
            r8 = r16
            r4.<init>(r5, r6, r8)
            r4 = 427755177(0x197f06a9, float:1.3184536E-23)
            g0.a r9 = g0.c.e(r4, r1, r2, r14, r10)
            r1 = 1981523763(0x761ba733, float:7.892551E32)
            r14.T(r1)
            boolean r1 = r14.e(r12)
            java.lang.Object r2 = r33.A()
            if (r1 != 0) goto L_0x0194
            Y.m$a r1 = Y.C1500m.f10026a
            java.lang.Object r1 = r1.a()
            if (r2 != r1) goto L_0x019c
        L_0x0194:
            io.intercom.android.sdk.m5.components.avatar.o r2 = new io.intercom.android.sdk.m5.components.avatar.o
            r2.<init>(r12, r11)
            r14.r(r2)
        L_0x019c:
            r10 = r2
            yf.l r10 = (yf.C6798l) r10
            r33.M()
            r1 = 1981536443(0x761bd8bb, float:7.902362E32)
            r14.T(r1)
            boolean r1 = r14.S(r15)
            boolean r2 = r14.e(r12)
            r1 = r1 | r2
            java.lang.Object r2 = r33.A()
            if (r1 != 0) goto L_0x01bf
            Y.m$a r1 = Y.C1500m.f10026a
            java.lang.Object r1 = r1.a()
            if (r2 != r1) goto L_0x01c7
        L_0x01bf:
            io.intercom.android.sdk.m5.components.avatar.p r2 = new io.intercom.android.sdk.m5.components.avatar.p
            r2.<init>(r15, r12, r11)
            r14.r(r2)
        L_0x01c7:
            r1 = r2
            yf.l r1 = (yf.C6798l) r1
            r33.M()
            r2 = 1981530099(0x761bbff3, float:7.897453E32)
            r14.T(r2)
            boolean r2 = r14.e(r12)
            java.lang.Object r4 = r33.A()
            if (r2 != 0) goto L_0x01e5
            Y.m$a r2 = Y.C1500m.f10026a
            java.lang.Object r2 = r2.a()
            if (r4 != r2) goto L_0x01ed
        L_0x01e5:
            io.intercom.android.sdk.m5.components.avatar.q r4 = new io.intercom.android.sdk.m5.components.avatar.q
            r4.<init>(r12, r11)
            r14.r(r4)
        L_0x01ed:
            r12 = r4
            yf.l r12 = (yf.C6798l) r12
            r33.M()
            r22 = 384(0x180, float:5.38E-43)
            r23 = 256080(0x3e850, float:3.58845E-40)
            r6 = 0
            r8 = 0
            r13 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r21 = 12780032(0xc30200, float:1.7908639E-38)
            r2 = r3
            r11 = 0
            r3 = r26
            r4 = r27
            r5 = r25
            r7 = r29
            r30 = r34
            r11 = r1
            r1 = r14
            r14 = r28
            r20 = r33
            Z3.u.c(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23)
            r33.u()
            boolean r2 = r0.$isActive
            if (r2 == 0) goto L_0x023d
            Y.r0 r2 = r0.$indicatorSize$delegate
            float r2 = io.intercom.android.sdk.m5.components.avatar.AvatarIconKt.DefaultAvatar_Rd90Nhg$lambda$5(r2)
            r3 = r30
            k0.i r2 = androidx.compose.foundation.layout.q.n(r3, r2)
            k0.c r3 = r24.c()
            r4 = r32
            k0.i r2 = r4.e(r2, r3)
            r3 = 0
            io.intercom.android.sdk.m5.components.avatar.AvatarIconKt.AvatarActiveIndicator(r2, r1, r3, r3)
        L_0x023d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: io.intercom.android.sdk.m5.components.avatar.AvatarIconKt$DefaultAvatar$1.invoke(C.f, Y.m, int):void");
    }
}
