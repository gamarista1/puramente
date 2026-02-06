package io.intercom.android.sdk.m5.home.ui.header;

import V.B0;
import Y.C1500m;
import Y.M0;
import Y.Y0;
import Z3.f;
import io.intercom.android.sdk.m5.home.states.HomeUiState;
import io.intercom.android.sdk.ui.theme.IntercomColors;
import io.intercom.android.sdk.ui.theme.IntercomThemeKt;
import io.intercom.android.sdk.ui.theme.IntercomTypography;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import lf.C6514M;
import yf.C6787a;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\u001a-\u0010\t\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0001¢\u0006\u0004\b\u0007\u0010\b\u001a\u000f\u0010\n\u001a\u00020\u0005H\u0003¢\u0006\u0004\b\n\u0010\u000b\u001a\u000f\u0010\f\u001a\u00020\u0005H\u0003¢\u0006\u0004\b\f\u0010\u000b\u001a\u000f\u0010\r\u001a\u00020\u0005H\u0003¢\u0006\u0004\b\r\u0010\u000b\u001a\u000f\u0010\u000e\u001a\u00020\u0005H\u0003¢\u0006\u0004\b\u000e\u0010\u000b¨\u0006\u000f"}, d2 = {"Lc1/h;", "headerHeight", "Lio/intercom/android/sdk/m5/home/states/HomeUiState$Content$ContentHeader$HeaderBackdropStyle;", "backdropStyle", "Lkotlin/Function0;", "Llf/M;", "onImageLoaded", "HomeHeaderBackdrop--orJrPs", "(FLio/intercom/android/sdk/m5/home/states/HomeUiState$Content$ContentHeader$HeaderBackdropStyle;Lyf/a;LY/m;I)V", "HomeHeaderBackdrop", "SolidHeaderBackdropPreview", "(LY/m;I)V", "GradientHeaderBackdropPreview", "SolidHeaderBackdropWithFadePreview", "GradientHeaderBackdropWithFadePreview", "intercom-sdk-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class HomeHeaderBackdropKt {
    private static final void GradientHeaderBackdropPreview(C1500m mVar, int i10) {
        C1500m h10 = mVar.h(-1564631091);
        if (i10 != 0 || !h10.i()) {
            IntercomThemeKt.IntercomTheme((IntercomColors) null, (IntercomTypography) null, (B0) null, ComposableSingletons$HomeHeaderBackdropKt.INSTANCE.m383getLambda2$intercom_sdk_base_release(), h10, 3072, 7);
        } else {
            h10.I();
        }
        Y0 k10 = h10.k();
        if (k10 != null) {
            k10.a(new f(i10));
        }
    }

    /* access modifiers changed from: private */
    public static final C6514M GradientHeaderBackdropPreview$lambda$5(int i10, C1500m mVar, int i11) {
        GradientHeaderBackdropPreview(mVar, M0.a(i10 | 1));
        return C6514M.f71813a;
    }

    private static final void GradientHeaderBackdropWithFadePreview(C1500m mVar, int i10) {
        C1500m h10 = mVar.h(-205873713);
        if (i10 != 0 || !h10.i()) {
            IntercomThemeKt.IntercomTheme((IntercomColors) null, (IntercomTypography) null, (B0) null, ComposableSingletons$HomeHeaderBackdropKt.INSTANCE.m385getLambda4$intercom_sdk_base_release(), h10, 3072, 7);
        } else {
            h10.I();
        }
        Y0 k10 = h10.k();
        if (k10 != null) {
            k10.a(new g(i10));
        }
    }

    /* access modifiers changed from: private */
    public static final C6514M GradientHeaderBackdropWithFadePreview$lambda$7(int i10, C1500m mVar, int i11) {
        GradientHeaderBackdropWithFadePreview(mVar, M0.a(i10 | 1));
        return C6514M.f71813a;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v24, resolved type: yf.l} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: HomeHeaderBackdrop--orJrPs  reason: not valid java name */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m390HomeHeaderBackdroporJrPs(float r31, io.intercom.android.sdk.m5.home.states.HomeUiState.Content.ContentHeader.HeaderBackdropStyle r32, yf.C6787a r33, Y.C1500m r34, int r35) {
        /*
            r0 = r31
            r1 = r32
            r2 = r33
            r3 = r35
            java.lang.String r4 = "backdropStyle"
            kotlin.jvm.internal.C6496s.h(r1, r4)
            java.lang.String r4 = "onImageLoaded"
            kotlin.jvm.internal.C6496s.h(r2, r4)
            r4 = 1649492382(0x6251419e, float:9.650244E20)
            r5 = r34
            Y.m r4 = r5.h(r4)
            r5 = r3 & 14
            if (r5 != 0) goto L_0x002a
            boolean r5 = r4.c(r0)
            if (r5 == 0) goto L_0x0027
            r5 = 4
            goto L_0x0028
        L_0x0027:
            r5 = 2
        L_0x0028:
            r5 = r5 | r3
            goto L_0x002b
        L_0x002a:
            r5 = r3
        L_0x002b:
            r6 = r3 & 112(0x70, float:1.57E-43)
            if (r6 != 0) goto L_0x003b
            boolean r6 = r4.S(r1)
            if (r6 == 0) goto L_0x0038
            r6 = 32
            goto L_0x003a
        L_0x0038:
            r6 = 16
        L_0x003a:
            r5 = r5 | r6
        L_0x003b:
            r6 = r3 & 896(0x380, float:1.256E-42)
            r7 = 256(0x100, float:3.59E-43)
            if (r6 != 0) goto L_0x004c
            boolean r6 = r4.C(r2)
            if (r6 == 0) goto L_0x0049
            r6 = r7
            goto L_0x004b
        L_0x0049:
            r6 = 128(0x80, float:1.794E-43)
        L_0x004b:
            r5 = r5 | r6
        L_0x004c:
            r6 = r5 & 731(0x2db, float:1.024E-42)
            r8 = 146(0x92, float:2.05E-43)
            if (r6 != r8) goto L_0x005e
            boolean r6 = r4.i()
            if (r6 != 0) goto L_0x0059
            goto L_0x005e
        L_0x0059:
            r4.I()
            goto L_0x02ec
        L_0x005e:
            k0.i$a r15 = k0.i.f23074a
            k0.c$a r27 = k0.c.f23044a
            k0.c r6 = r27.o()
            r14 = 0
            H0.F r6 = androidx.compose.foundation.layout.d.h(r6, r14)
            int r8 = Y.C1494j.a(r4, r14)
            Y.y r9 = r4.p()
            k0.i r10 = k0.h.e(r4, r15)
            J0.g$a r11 = J0.C1241g.f3853J
            yf.a r12 = r11.a()
            Y.f r13 = r4.j()
            if (r13 != 0) goto L_0x0086
            Y.C1494j.c()
        L_0x0086:
            r4.F()
            boolean r13 = r4.f()
            if (r13 == 0) goto L_0x0093
            r4.U(r12)
            goto L_0x0096
        L_0x0093:
            r4.q()
        L_0x0096:
            Y.m r12 = Y.F1.a(r4)
            yf.p r13 = r11.c()
            Y.F1.b(r12, r6, r13)
            yf.p r6 = r11.e()
            Y.F1.b(r12, r9, r6)
            yf.p r6 = r11.b()
            boolean r9 = r12.f()
            if (r9 != 0) goto L_0x00c0
            java.lang.Object r9 = r12.A()
            java.lang.Integer r13 = java.lang.Integer.valueOf(r8)
            boolean r9 = kotlin.jvm.internal.C6496s.c(r9, r13)
            if (r9 != 0) goto L_0x00ce
        L_0x00c0:
            java.lang.Integer r9 = java.lang.Integer.valueOf(r8)
            r12.r(r9)
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            r12.V(r8, r6)
        L_0x00ce:
            yf.p r6 = r11.d()
            Y.F1.b(r12, r10, r6)
            androidx.compose.foundation.layout.f r6 = androidx.compose.foundation.layout.f.f12848a
            boolean r8 = r1 instanceof io.intercom.android.sdk.m5.home.states.HomeUiState.Content.ContentHeader.HeaderBackdropStyle.Gradient
            r13 = 160(0xa0, float:2.24E-43)
            r12 = 0
            r11 = 0
            r10 = 80
            r9 = 1
            if (r8 == 0) goto L_0x0149
            r5 = 1047117817(0x3e69bff9, float:0.22827138)
            r4.T(r5)
            r0.n0$a r16 = r0.C2514n0.f25547b
            r5 = r1
            io.intercom.android.sdk.m5.home.states.HomeUiState$Content$ContentHeader$HeaderBackdropStyle$Gradient r5 = (io.intercom.android.sdk.m5.home.states.HomeUiState.Content.ContentHeader.HeaderBackdropStyle.Gradient) r5
            java.util.List r17 = r5.getColors()
            r23 = 14
            r24 = 0
            r18 = 0
            r20 = 0
            r22 = 0
            r0.n0 r7 = r0.C2514n0.a.e(r16, r17, r18, r20, r22, r23, r24)
            r16 = 6
            r17 = 0
            r18 = 0
            r19 = 0
            r8 = r15
            r34 = r6
            r6 = r9
            r9 = r7
            r7 = r10
            r10 = r18
            r14 = r11
            r11 = r19
            r12 = r16
            r6 = r13
            r13 = r17
            k0.i r8 = androidx.compose.foundation.b.b(r8, r9, r10, r11, r12, r13)
            boolean r5 = r5.getFade()
            if (r5 == 0) goto L_0x0127
            float r5 = (float) r6
        L_0x0122:
            float r5 = c1.h.j(r5)
            goto L_0x0129
        L_0x0127:
            float r5 = (float) r7
            goto L_0x0122
        L_0x0129:
            float r5 = r5 + r0
            float r5 = c1.h.j(r5)
            k0.i r5 = androidx.compose.foundation.layout.q.i(r8, r5)
            r8 = 1
            r13 = 0
            k0.i r5 = androidx.compose.foundation.layout.q.h(r5, r14, r8, r13)
            r12 = 0
            androidx.compose.foundation.layout.d.a(r5, r4, r12)
            r4.M()
            r29 = r34
            r5 = r6
            r30 = r15
            r15 = r14
            r14 = r13
            r13 = 1
            goto L_0x0277
        L_0x0149:
            r34 = r6
            r6 = r13
            r13 = r12
            r12 = r14
            r14 = r11
            r11 = r10
            boolean r8 = r1 instanceof io.intercom.android.sdk.m5.home.states.HomeUiState.Content.ContentHeader.HeaderBackdropStyle.Image
            if (r8 == 0) goto L_0x0228
            r8 = 1047558823(0x3e707aa7, float:0.23484288)
            r4.T(r8)
            j4.i$a r8 = new j4.i$a
            Y.I0 r9 = androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.g()
            java.lang.Object r9 = r4.m(r9)
            android.content.Context r9 = (android.content.Context) r9
            r8.<init>(r9)
            r9 = r1
            io.intercom.android.sdk.m5.home.states.HomeUiState$Content$ContentHeader$HeaderBackdropStyle$Image r9 = (io.intercom.android.sdk.m5.home.states.HomeUiState.Content.ContentHeader.HeaderBackdropStyle.Image) r9
            java.lang.String r10 = r9.getImageUrl()
            j4.i$a r8 = r8.d(r10)
            r10 = 1
            j4.i$a r8 = r8.c(r10)
            j4.i r17 = r8.a()
            Y.I0 r8 = androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.g()
            java.lang.Object r8 = r4.m(r8)
            android.content.Context r8 = (android.content.Context) r8
            X3.g r23 = io.intercom.android.sdk.ui.coil.IntercomImageLoaderKt.getImageLoader(r8)
            H0.h$a r8 = H0.C1187h.f2609a
            H0.h r28 = r8.a()
            long r9 = r9.m364getFallbackColor0d7_KjU()
            r18 = 2
            r19 = 0
            r20 = 0
            r8 = r15
            r21 = r15
            r15 = r11
            r11 = r20
            r20 = r12
            r12 = r18
            r6 = r13
            r13 = r19
            k0.i r8 = androidx.compose.foundation.b.d(r8, r9, r11, r12, r13)
            float r9 = (float) r15
            float r9 = c1.h.j(r9)
            float r9 = r9 + r0
            float r9 = c1.h.j(r9)
            k0.i r8 = androidx.compose.foundation.layout.q.i(r8, r9)
            r9 = 1
            k0.i r8 = androidx.compose.foundation.layout.q.h(r8, r14, r9, r6)
            r10 = -1074565948(0xffffffffbff36cc4, float:-1.9017568)
            r4.T(r10)
            r5 = r5 & 896(0x380, float:1.256E-42)
            if (r5 != r7) goto L_0x01cb
            r5 = r9
            goto L_0x01cd
        L_0x01cb:
            r5 = r20
        L_0x01cd:
            java.lang.Object r7 = r4.A()
            if (r5 != 0) goto L_0x01db
            Y.m$a r5 = Y.C1500m.f10026a
            java.lang.Object r5 = r5.a()
            if (r7 != r5) goto L_0x01e3
        L_0x01db:
            io.intercom.android.sdk.m5.home.ui.header.i r7 = new io.intercom.android.sdk.m5.home.ui.header.i
            r7.<init>(r2)
            r4.r(r7)
        L_0x01e3:
            r5 = r7
            yf.l r5 = (yf.C6798l) r5
            r13 = r14
            r7 = r20
            r14 = r5
            r4.M()
            r25 = 384(0x180, float:5.38E-43)
            r26 = 257520(0x3edf0, float:3.60862E-40)
            r5 = 0
            r12 = r34
            r10 = r6
            r11 = 160(0xa0, float:2.24E-43)
            r6 = r5
            r9 = r5
            r10 = r5
            r11 = r5
            r29 = r12
            r12 = r5
            r13 = r5
            r30 = r21
            r15 = r5
            r16 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r24 = 568(0x238, float:7.96E-43)
            r5 = r17
            r7 = r23
            r17 = r28
            r23 = r4
            Z3.u.c(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)
            r4.M()
            r5 = 160(0xa0, float:2.24E-43)
            r7 = 80
            r12 = 0
            r13 = 1
            r14 = 0
            r15 = 0
            goto L_0x0277
        L_0x0228:
            r29 = r34
            r30 = r15
            boolean r5 = r1 instanceof io.intercom.android.sdk.m5.home.states.HomeUiState.Content.ContentHeader.HeaderBackdropStyle.Solid
            if (r5 == 0) goto L_0x02fb
            r5 = 1048341232(0x3e7c6af0, float:0.24650168)
            r4.T(r5)
            r5 = r1
            io.intercom.android.sdk.m5.home.states.HomeUiState$Content$ContentHeader$HeaderBackdropStyle$Solid r5 = (io.intercom.android.sdk.m5.home.states.HomeUiState.Content.ContentHeader.HeaderBackdropStyle.Solid) r5
            long r9 = r5.m368getColor0d7_KjU()
            r12 = 2
            r13 = 0
            r11 = 0
            r8 = r30
            k0.i r6 = androidx.compose.foundation.b.d(r8, r9, r11, r12, r13)
            boolean r5 = r5.getFade()
            if (r5 == 0) goto L_0x0257
            r5 = 160(0xa0, float:2.24E-43)
            float r7 = (float) r5
            float r7 = c1.h.j(r7)
            r8 = r7
            r7 = 80
            goto L_0x0260
        L_0x0257:
            r5 = 160(0xa0, float:2.24E-43)
            r7 = 80
            float r8 = (float) r7
            float r8 = c1.h.j(r8)
        L_0x0260:
            float r8 = r8 + r0
            float r8 = c1.h.j(r8)
            k0.i r6 = androidx.compose.foundation.layout.q.i(r6, r8)
            r13 = 1
            r14 = 0
            r15 = 0
            k0.i r6 = androidx.compose.foundation.layout.q.h(r6, r15, r13, r14)
            r12 = 0
            androidx.compose.foundation.layout.d.a(r6, r4, r12)
            r4.M()
        L_0x0277:
            r6 = -1074550730(0xffffffffbff3a836, float:-1.9035709)
            r4.T(r6)
            boolean r6 = r32.getFade()
            if (r6 == 0) goto L_0x02e6
            r0.n0$a r16 = r0.C2514n0.f25547b
            r0.x0$a r6 = r0.C2544x0.f25560b
            long r8 = r6.g()
            r0.x0 r6 = r0.C2544x0.k(r8)
            io.intercom.android.sdk.ui.theme.IntercomTheme r8 = io.intercom.android.sdk.ui.theme.IntercomTheme.INSTANCE
            int r9 = io.intercom.android.sdk.ui.theme.IntercomTheme.$stable
            io.intercom.android.sdk.ui.theme.IntercomColors r8 = r8.getColors(r4, r9)
            long r8 = r8.m678getBackground0d7_KjU()
            r0.x0 r8 = r0.C2544x0.k(r8)
            r0.x0[] r6 = new r0.C2544x0[]{r6, r8}
            java.util.List r17 = mf.C6565s.q(r6)
            r21 = 14
            r22 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r0.n0 r9 = r0.C2514n0.a.j(r16, r17, r18, r19, r20, r21, r22)
            r6 = 6
            r16 = 0
            r10 = 0
            r11 = 0
            r8 = r30
            r12 = r6
            r6 = r13
            r13 = r16
            k0.i r8 = androidx.compose.foundation.b.b(r8, r9, r10, r11, r12, r13)
            boolean r9 = r1 instanceof io.intercom.android.sdk.m5.home.states.HomeUiState.Content.ContentHeader.HeaderBackdropStyle.Image
            if (r9 == 0) goto L_0x02ce
            float r5 = (float) r7
        L_0x02c9:
            float r5 = c1.h.j(r5)
            goto L_0x02d0
        L_0x02ce:
            float r5 = (float) r5
            goto L_0x02c9
        L_0x02d0:
            k0.i r5 = androidx.compose.foundation.layout.q.i(r8, r5)
            k0.i r5 = androidx.compose.foundation.layout.q.h(r5, r15, r6, r14)
            k0.c r6 = r27.b()
            r7 = r29
            k0.i r5 = r7.e(r5, r6)
            r6 = 0
            androidx.compose.foundation.layout.d.a(r5, r4, r6)
        L_0x02e6:
            r4.M()
            r4.u()
        L_0x02ec:
            Y.Y0 r4 = r4.k()
            if (r4 == 0) goto L_0x02fa
            io.intercom.android.sdk.m5.home.ui.header.j r5 = new io.intercom.android.sdk.m5.home.ui.header.j
            r5.<init>(r0, r1, r2, r3)
            r4.a(r5)
        L_0x02fa:
            return
        L_0x02fb:
            r0 = -1074601674(0xffffffffbff2e136, float:-1.8974979)
            r4.T(r0)
            r4.M()
            lf.s r0 = new lf.s
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: io.intercom.android.sdk.m5.home.ui.header.HomeHeaderBackdropKt.m390HomeHeaderBackdroporJrPs(float, io.intercom.android.sdk.m5.home.states.HomeUiState$Content$ContentHeader$HeaderBackdropStyle, yf.a, Y.m, int):void");
    }

    /* access modifiers changed from: private */
    public static final C6514M HomeHeaderBackdrop__orJrPs$lambda$2$lambda$1$lambda$0(C6787a aVar, f.b.d dVar) {
        C6496s.h(aVar, "$onImageLoaded");
        C6496s.h(dVar, "it");
        aVar.invoke();
        return C6514M.f71813a;
    }

    /* access modifiers changed from: private */
    public static final C6514M HomeHeaderBackdrop__orJrPs$lambda$3(float f10, HomeUiState.Content.ContentHeader.HeaderBackdropStyle headerBackdropStyle, C6787a aVar, int i10, C1500m mVar, int i11) {
        C6496s.h(headerBackdropStyle, "$backdropStyle");
        C6496s.h(aVar, "$onImageLoaded");
        m390HomeHeaderBackdroporJrPs(f10, headerBackdropStyle, aVar, mVar, M0.a(i10 | 1));
        return C6514M.f71813a;
    }

    private static final void SolidHeaderBackdropPreview(C1500m mVar, int i10) {
        C1500m h10 = mVar.h(784552236);
        if (i10 != 0 || !h10.i()) {
            IntercomThemeKt.IntercomTheme((IntercomColors) null, (IntercomTypography) null, (B0) null, ComposableSingletons$HomeHeaderBackdropKt.INSTANCE.m382getLambda1$intercom_sdk_base_release(), h10, 3072, 7);
        } else {
            h10.I();
        }
        Y0 k10 = h10.k();
        if (k10 != null) {
            k10.a(new k(i10));
        }
    }

    /* access modifiers changed from: private */
    public static final C6514M SolidHeaderBackdropPreview$lambda$4(int i10, C1500m mVar, int i11) {
        SolidHeaderBackdropPreview(mVar, M0.a(i10 | 1));
        return C6514M.f71813a;
    }

    private static final void SolidHeaderBackdropWithFadePreview(C1500m mVar, int i10) {
        C1500m h10 = mVar.h(14975022);
        if (i10 != 0 || !h10.i()) {
            IntercomThemeKt.IntercomTheme((IntercomColors) null, (IntercomTypography) null, (B0) null, ComposableSingletons$HomeHeaderBackdropKt.INSTANCE.m384getLambda3$intercom_sdk_base_release(), h10, 3072, 7);
        } else {
            h10.I();
        }
        Y0 k10 = h10.k();
        if (k10 != null) {
            k10.a(new h(i10));
        }
    }

    /* access modifiers changed from: private */
    public static final C6514M SolidHeaderBackdropWithFadePreview$lambda$6(int i10, C1500m mVar, int i11) {
        SolidHeaderBackdropWithFadePreview(mVar, M0.a(i10 | 1));
        return C6514M.f71813a;
    }
}
