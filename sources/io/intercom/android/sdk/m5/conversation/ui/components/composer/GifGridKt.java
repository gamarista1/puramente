package io.intercom.android.sdk.m5.conversation.ui.components.composer;

import F.y;
import J.C1225v;
import V.B0;
import Y.C1500m;
import Y.C1510r0;
import Y.M0;
import Y.Y0;
import androidx.compose.ui.platform.C1651m1;
import g0.c;
import io.intercom.android.sdk.ui.IntercomPreviews;
import io.intercom.android.sdk.ui.theme.IntercomColors;
import io.intercom.android.sdk.ui.theme.IntercomThemeKt;
import io.intercom.android.sdk.ui.theme.IntercomTypography;
import java.util.List;
import k0.i;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import lf.C6514M;
import yf.C6787a;
import yf.C6798l;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u001aO\u0010\n\u001a\u00020\u00062\b\b\u0002\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00060\u00052\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0001¢\u0006\u0004\b\n\u0010\u000b\u001a+\u0010\u0010\u001a\u00020\u00062\b\b\u0001\u0010\r\u001a\u00020\f2\u0010\b\u0002\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u000eH\u0003¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u000f\u0010\u0012\u001a\u00020\u0006H\u0003¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lk0/i;", "modifier", "", "Lio/intercom/android/sdk/blocks/lib/models/Block;", "gifs", "Lkotlin/Function1;", "Llf/M;", "onGifClick", "", "onGifSearchQueryChange", "GifGrid", "(Lk0/i;Ljava/util/List;Lyf/l;Lyf/l;LY/m;II)V", "", "iconId", "Lkotlin/Function0;", "onClick", "GifGridIcon", "(ILyf/a;LY/m;II)V", "PreviewGifGrid", "(LY/m;I)V", "intercom-sdk-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class GifGridKt {
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r43v0, resolved type: yf.l} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v14, resolved type: yf.l} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v10, resolved type: k0.i$a} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void GifGrid(k0.i r48, java.util.List<? extends io.intercom.android.sdk.blocks.lib.models.Block> r49, yf.C6798l r50, yf.C6798l r51, Y.C1500m r52, int r53, int r54) {
        /*
            r2 = r49
            r3 = r50
            r4 = r51
            r5 = r53
            java.lang.String r0 = "gifs"
            kotlin.jvm.internal.C6496s.h(r2, r0)
            java.lang.String r0 = "onGifClick"
            kotlin.jvm.internal.C6496s.h(r3, r0)
            java.lang.String r0 = "onGifSearchQueryChange"
            kotlin.jvm.internal.C6496s.h(r4, r0)
            r0 = 2027814826(0x78ddffaa, float:3.6021347E34)
            r1 = r52
            Y.m r0 = r1.h(r0)
            r1 = 1
            r6 = r54 & 1
            if (r6 == 0) goto L_0x0029
            k0.i$a r6 = k0.i.f23074a
            r15 = r6
            goto L_0x002b
        L_0x0029:
            r15 = r48
        L_0x002b:
            r6 = -1549192846(0xffffffffa3a93172, float:-1.8343958E-17)
            r0.T(r6)
            java.lang.Object r6 = r0.A()
            Y.m$a r31 = Y.C1500m.f10026a
            java.lang.Object r7 = r31.a()
            r14 = 2
            r13 = 0
            if (r6 != r7) goto L_0x0048
            java.lang.String r6 = ""
            Y.r0 r6 = Y.u1.d(r6, r13, r14, r13)
            r0.r(r6)
        L_0x0048:
            r12 = r6
            Y.r0 r12 = (Y.C1510r0) r12
            r0.M()
            r6 = -1549190918(0xffffffffa3a938fa, float:-1.8347147E-17)
            r0.T(r6)
            java.lang.Object r6 = r0.A()
            java.lang.Object r7 = r31.a()
            if (r6 != r7) goto L_0x0065
            B.l r6 = B.k.a()
            r0.r(r6)
        L_0x0065:
            r10 = r6
            B.l r10 = (B.l) r10
            r0.M()
            Y.I0 r6 = androidx.compose.ui.platform.C1644k0.o()
            java.lang.Object r6 = r0.m(r6)
            r11 = r6
            androidx.compose.ui.platform.m1 r11 = (androidx.compose.ui.platform.C1651m1) r11
            k0.i$a r8 = k0.i.f23074a
            C.c r9 = C.C1085c.f882a
            C.c$m r6 = r9.g()
            k0.c$a r32 = k0.c.f23044a
            k0.c$b r7 = r32.k()
            r1 = 0
            H0.F r6 = C.C1090h.a(r6, r7, r0, r1)
            int r7 = Y.C1494j.a(r0, r1)
            Y.y r13 = r0.p()
            k0.i r14 = k0.h.e(r0, r8)
            J0.g$a r33 = J0.C1241g.f3853J
            yf.a r1 = r33.a()
            Y.f r17 = r0.j()
            if (r17 != 0) goto L_0x00a4
            Y.C1494j.c()
        L_0x00a4:
            r0.F()
            boolean r17 = r0.f()
            if (r17 == 0) goto L_0x00b1
            r0.U(r1)
            goto L_0x00b4
        L_0x00b1:
            r0.q()
        L_0x00b4:
            Y.m r1 = Y.F1.a(r0)
            r17 = r8
            yf.p r8 = r33.c()
            Y.F1.b(r1, r6, r8)
            yf.p r6 = r33.e()
            Y.F1.b(r1, r13, r6)
            yf.p r6 = r33.b()
            boolean r8 = r1.f()
            if (r8 != 0) goto L_0x00e0
            java.lang.Object r8 = r1.A()
            java.lang.Integer r13 = java.lang.Integer.valueOf(r7)
            boolean r8 = kotlin.jvm.internal.C6496s.c(r8, r13)
            if (r8 != 0) goto L_0x00ee
        L_0x00e0:
            java.lang.Integer r8 = java.lang.Integer.valueOf(r7)
            r1.r(r8)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r1.V(r7, r6)
        L_0x00ee:
            yf.p r6 = r33.d()
            Y.F1.b(r1, r14, r6)
            C.k r1 = C.C1093k.f978a
            r1 = -1834338565(0xffffffff92aa36fb, float:-1.0742062E-27)
            r0.T(r1)
            java.lang.Object r1 = r12.getValue()
            java.lang.String r6 = "intercom version"
            boolean r1 = kotlin.jvm.internal.C6496s.c(r1, r6)
            if (r1 == 0) goto L_0x0146
            r29 = 0
            r30 = 131070(0x1fffe, float:1.83668E-40)
            java.lang.String r6 = "15.16.1"
            r7 = 0
            r13 = 0
            r34 = r9
            r1 = r17
            r8 = r13
            r35 = r10
            r36 = r11
            r10 = r13
            r13 = 0
            r14 = r12
            r12 = r13
            r17 = 0
            r48 = r14
            r14 = r17
            r16 = 0
            r37 = r15
            r15 = r16
            r17 = 0
            r18 = 0
            r19 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            r25 = 0
            r26 = 0
            r28 = 0
            r27 = r0
            V.T0.b(r6, r7, r8, r10, r12, r13, r14, r15, r17, r18, r19, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30)
            goto L_0x0152
        L_0x0146:
            r34 = r9
            r35 = r10
            r36 = r11
            r48 = r12
            r37 = r15
            r1 = r17
        L_0x0152:
            r0.M()
            r13 = 0
            r6 = 1
            r12 = 0
            k0.i r7 = androidx.compose.foundation.layout.q.h(r1, r13, r6, r12)
            r6 = 8
            float r11 = (float) r6
            float r6 = c1.h.j(r11)
            r8 = 2
            k0.i r6 = androidx.compose.foundation.layout.n.k(r7, r6, r13, r8, r12)
            io.intercom.android.sdk.ui.theme.IntercomTheme r7 = io.intercom.android.sdk.ui.theme.IntercomTheme.INSTANCE
            int r9 = io.intercom.android.sdk.ui.theme.IntercomTheme.$stable
            io.intercom.android.sdk.ui.theme.IntercomColors r10 = r7.getColors(r0, r9)
            long r14 = r10.m700getPrimaryText0d7_KjU()
            r20 = 14
            r21 = 0
            r16 = 1028443341(0x3d4ccccd, float:0.05)
            r17 = 0
            r18 = 0
            r19 = 0
            long r14 = r0.C2544x0.o(r14, r16, r17, r18, r19, r20, r21)
            V.B0 r10 = r7.getShapes(r0, r9)
            I.a r10 = r10.e()
            k0.i r6 = androidx.compose.foundation.b.c(r6, r14, r10)
            float r10 = c1.h.j(r11)
            r14 = 12
            float r14 = (float) r14
            float r14 = c1.h.j(r14)
            k0.i r6 = androidx.compose.foundation.layout.n.j(r6, r10, r14)
            k0.c$c r10 = r32.i()
            C.c$e r14 = r34.f()
            r15 = 48
            H0.F r10 = C.W.b(r14, r10, r0, r15)
            r14 = 0
            int r15 = Y.C1494j.a(r0, r14)
            Y.y r14 = r0.p()
            k0.i r6 = k0.h.e(r0, r6)
            yf.a r8 = r33.a()
            Y.f r16 = r0.j()
            if (r16 != 0) goto L_0x01c8
            Y.C1494j.c()
        L_0x01c8:
            r0.F()
            boolean r16 = r0.f()
            if (r16 == 0) goto L_0x01d5
            r0.U(r8)
            goto L_0x01d8
        L_0x01d5:
            r0.q()
        L_0x01d8:
            Y.m r8 = Y.F1.a(r0)
            yf.p r12 = r33.c()
            Y.F1.b(r8, r10, r12)
            yf.p r10 = r33.e()
            Y.F1.b(r8, r14, r10)
            yf.p r10 = r33.b()
            boolean r12 = r8.f()
            if (r12 != 0) goto L_0x0202
            java.lang.Object r12 = r8.A()
            java.lang.Integer r14 = java.lang.Integer.valueOf(r15)
            boolean r12 = kotlin.jvm.internal.C6496s.c(r12, r14)
            if (r12 != 0) goto L_0x0210
        L_0x0202:
            java.lang.Integer r12 = java.lang.Integer.valueOf(r15)
            r8.r(r12)
            java.lang.Integer r12 = java.lang.Integer.valueOf(r15)
            r8.V(r12, r10)
        L_0x0210:
            yf.p r10 = r33.d()
            Y.F1.b(r8, r6, r10)
            C.Z r16 = C.Z.f873a
            java.lang.Object r6 = r48.getValue()
            java.lang.String r6 = (java.lang.String) r6
            io.intercom.android.sdk.ui.theme.IntercomTypography r7 = r7.getTypography(r0, r9)
            Q0.T r12 = r7.getType04()
            r20 = 2
            r21 = 0
            r18 = 1065353216(0x3f800000, float:1.0)
            r19 = 0
            r17 = r1
            k0.i r8 = C.Y.b(r16, r17, r18, r19, r20, r21)
            J.x$a r7 = J.C1227x.f3486g
            J.x r14 = r7.a()
            W0.r$a r7 = W0.r.f8593b
            int r18 = r7.g()
            r22 = 119(0x77, float:1.67E-43)
            r23 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r19 = 0
            r20 = 0
            J.x r22 = J.C1227x.c(r14, r15, r16, r17, r18, r19, r20, r21, r22, r23)
            r7 = -1582275237(0xffffffffa1b0655b, float:-1.1953052E-18)
            r0.T(r7)
            r7 = r36
            boolean r9 = r0.S(r7)
            java.lang.Object r10 = r0.A()
            if (r9 != 0) goto L_0x026a
            java.lang.Object r9 = r31.a()
            if (r10 != r9) goto L_0x0272
        L_0x026a:
            io.intercom.android.sdk.m5.conversation.ui.components.composer.S r10 = new io.intercom.android.sdk.m5.conversation.ui.components.composer.S
            r10.<init>(r7)
            r0.r(r10)
        L_0x0272:
            r43 = r10
            yf.l r43 = (yf.C6798l) r43
            r0.M()
            J.w r26 = new J.w
            r39 = 0
            r40 = 0
            r41 = 0
            r42 = 0
            r44 = 0
            r45 = 47
            r46 = 0
            r38 = r26
            r38.<init>(r39, r40, r41, r42, r43, r44, r45, r46)
            r7 = -1582287683(0xffffffffa1b034bd, float:-1.1940184E-18)
            r0.T(r7)
            r7 = r5 & 7168(0x1c00, float:1.0045E-41)
            r15 = r7 ^ 3072(0xc00, float:4.305E-42)
            r14 = 2048(0x800, float:2.87E-42)
            if (r15 <= r14) goto L_0x02a2
            boolean r7 = r0.S(r4)
            if (r7 != 0) goto L_0x02a6
        L_0x02a2:
            r7 = r5 & 3072(0xc00, float:4.305E-42)
            if (r7 != r14) goto L_0x02a8
        L_0x02a6:
            r7 = 1
            goto L_0x02a9
        L_0x02a8:
            r7 = 0
        L_0x02a9:
            java.lang.Object r9 = r0.A()
            if (r7 != 0) goto L_0x02b9
            java.lang.Object r7 = r31.a()
            if (r9 != r7) goto L_0x02b6
            goto L_0x02b9
        L_0x02b6:
            r10 = r48
            goto L_0x02c3
        L_0x02b9:
            io.intercom.android.sdk.m5.conversation.ui.components.composer.T r9 = new io.intercom.android.sdk.m5.conversation.ui.components.composer.T
            r10 = r48
            r9.<init>(r10, r4)
            r0.r(r9)
        L_0x02c3:
            r7 = r9
            yf.l r7 = (yf.C6798l) r7
            r0.M()
            io.intercom.android.sdk.m5.conversation.ui.components.composer.GifGridKt$GifGrid$1$1$3 r9 = new io.intercom.android.sdk.m5.conversation.ui.components.composer.GifGridKt$GifGrid$1$1$3
            r13 = r35
            r9.<init>(r10, r13)
            r13 = 54
            r14 = 1827261249(0x6ce9cb41, float:2.2611164E27)
            r17 = r10
            r10 = 1
            g0.a r21 = g0.c.e(r14, r10, r9, r0, r13)
            r24 = 196608(0x30000, float:2.75506E-40)
            r25 = 32280(0x7e18, float:4.5234E-41)
            r9 = 0
            r10 = 0
            r13 = r17
            r14 = 1
            r16 = 0
            r47 = r15
            r15 = r16
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r23 = 100663296(0x6000000, float:2.4074124E-35)
            r27 = r11
            r11 = r12
            r12 = r22
            r28 = r13
            r13 = r26
            r22 = r0
            J.C1207c.b(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25)
            float r6 = c1.h.j(r27)
            k0.i r6 = androidx.compose.foundation.layout.q.r(r1, r6)
            r7 = 6
            C.a0.a(r6, r0, r7)
            java.lang.Object r6 = r28.getValue()
            java.lang.CharSequence r6 = (java.lang.CharSequence) r6
            int r6 = r6.length()
            if (r6 <= 0) goto L_0x0360
            r6 = -1804490114(0xffffffff9471aa7e, float:-1.2201014E-26)
            r0.T(r6)
            int r6 = io.intercom.android.sdk.R.drawable.intercom_close
            r8 = -1582228259(0xffffffffa1b11cdd, float:-1.2001627E-18)
            r0.T(r8)
            r8 = r47
            r9 = 2048(0x800, float:2.87E-42)
            if (r8 <= r9) goto L_0x0335
            boolean r8 = r0.S(r4)
            if (r8 != 0) goto L_0x0339
        L_0x0335:
            r8 = r5 & 3072(0xc00, float:4.305E-42)
            if (r8 != r9) goto L_0x033b
        L_0x0339:
            r8 = 1
            goto L_0x033c
        L_0x033b:
            r8 = 0
        L_0x033c:
            java.lang.Object r9 = r0.A()
            if (r8 != 0) goto L_0x0348
            java.lang.Object r8 = r31.a()
            if (r9 != r8) goto L_0x0352
        L_0x0348:
            io.intercom.android.sdk.m5.conversation.ui.components.composer.U r9 = new io.intercom.android.sdk.m5.conversation.ui.components.composer.U
            r8 = r28
            r9.<init>(r8, r4)
            r0.r(r9)
        L_0x0352:
            yf.a r9 = (yf.C6787a) r9
            r0.M()
            r8 = 0
            GifGridIcon(r6, r9, r0, r8, r8)
            r0.M()
            r10 = 0
            goto L_0x0371
        L_0x0360:
            r8 = 0
            r6 = -1804309663(0xffffffff94746b61, float:-1.2340029E-26)
            r0.T(r6)
            int r6 = io.intercom.android.sdk.R.drawable.intercom_gif_search_icon
            r9 = 2
            r10 = 0
            GifGridIcon(r6, r10, r0, r8, r9)
            r0.M()
        L_0x0371:
            r0.u()
            r6 = 4
            float r6 = (float) r6
            float r6 = c1.h.j(r6)
            k0.i r1 = androidx.compose.foundation.layout.q.i(r1, r6)
            C.a0.a(r1, r0, r7)
            r15 = r37
            r1 = 1
            r6 = 0
            k0.i r7 = androidx.compose.foundation.layout.q.h(r15, r6, r1, r10)
            F.H$a r6 = new F.H$a
            r1 = 3
            r6.<init>(r1)
            float r1 = c1.h.j(r27)
            C.N r9 = androidx.compose.foundation.layout.n.a(r1)
            float r11 = c1.h.j(r27)
            float r1 = c1.h.j(r27)
            r8 = r34
            C.c$f r12 = r8.n(r1)
            io.intercom.android.sdk.m5.conversation.ui.components.composer.V r1 = new io.intercom.android.sdk.m5.conversation.ui.components.composer.V
            r1.<init>(r2, r3)
            r17 = 1772544(0x1b0c00, float:2.483863E-39)
            r18 = 404(0x194, float:5.66E-43)
            r8 = 0
            r10 = 0
            r13 = 0
            r14 = 0
            r19 = r15
            r15 = r1
            r16 = r0
            F.C1171f.a(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            r0.u()
            Y.Y0 r7 = r0.k()
            if (r7 == 0) goto L_0x03d9
            io.intercom.android.sdk.m5.conversation.ui.components.composer.W r8 = new io.intercom.android.sdk.m5.conversation.ui.components.composer.W
            r0 = r8
            r1 = r19
            r2 = r49
            r3 = r50
            r4 = r51
            r5 = r53
            r6 = r54
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r7.a(r8)
        L_0x03d9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: io.intercom.android.sdk.m5.conversation.ui.components.composer.GifGridKt.GifGrid(k0.i, java.util.List, yf.l, yf.l, Y.m, int, int):void");
    }

    /* access modifiers changed from: private */
    public static final C6514M GifGrid$lambda$11$lambda$10(List list, C6798l lVar, y yVar) {
        C6496s.h(list, "$gifs");
        C6496s.h(lVar, "$onGifClick");
        C6496s.h(yVar, "$this$LazyVerticalStaggeredGrid");
        yVar.b(list.size(), (C6798l) null, new GifGridKt$GifGrid$lambda$11$lambda$10$$inlined$itemsIndexed$default$2(list), (C6798l) null, c.c(284833944, true, new GifGridKt$GifGrid$lambda$11$lambda$10$$inlined$itemsIndexed$default$4(list, lVar)));
        return C6514M.f71813a;
    }

    /* access modifiers changed from: private */
    public static final C6514M GifGrid$lambda$11$lambda$8$lambda$3$lambda$2(C1651m1 m1Var, C1225v vVar) {
        C6496s.h(vVar, "$this$KeyboardActions");
        if (m1Var != null) {
            m1Var.a();
        }
        return C6514M.f71813a;
    }

    /* access modifiers changed from: private */
    public static final C6514M GifGrid$lambda$11$lambda$8$lambda$5$lambda$4(C1510r0 r0Var, C6798l lVar, String str) {
        C6496s.h(r0Var, "$searchText");
        C6496s.h(lVar, "$onGifSearchQueryChange");
        C6496s.h(str, "it");
        r0Var.setValue(str);
        lVar.invoke(str);
        return C6514M.f71813a;
    }

    /* access modifiers changed from: private */
    public static final C6514M GifGrid$lambda$11$lambda$8$lambda$7$lambda$6(C1510r0 r0Var, C6798l lVar) {
        C6496s.h(r0Var, "$searchText");
        C6496s.h(lVar, "$onGifSearchQueryChange");
        r0Var.setValue("");
        lVar.invoke("");
        return C6514M.f71813a;
    }

    /* access modifiers changed from: private */
    public static final C6514M GifGrid$lambda$12(i iVar, List list, C6798l lVar, C6798l lVar2, int i10, int i11, C1500m mVar, int i12) {
        C6496s.h(list, "$gifs");
        C6496s.h(lVar, "$onGifClick");
        C6496s.h(lVar2, "$onGifSearchQueryChange");
        GifGrid(iVar, list, lVar, lVar2, mVar, M0.a(i10 | 1), i11);
        return C6514M.f71813a;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v0, resolved type: yf.a} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static final void GifGridIcon(int r11, yf.C6787a r12, Y.C1500m r13, int r14, int r15) {
        /*
            r0 = -1949834895(0xffffffff8bc7e171, float:-7.699122E-32)
            Y.m r13 = r13.h(r0)
            r0 = r15 & 1
            if (r0 == 0) goto L_0x000e
            r0 = r14 | 6
            goto L_0x001e
        L_0x000e:
            r0 = r14 & 14
            if (r0 != 0) goto L_0x001d
            boolean r0 = r13.d(r11)
            if (r0 == 0) goto L_0x001a
            r0 = 4
            goto L_0x001b
        L_0x001a:
            r0 = 2
        L_0x001b:
            r0 = r0 | r14
            goto L_0x001e
        L_0x001d:
            r0 = r14
        L_0x001e:
            r1 = r15 & 2
            r2 = 16
            r3 = 32
            if (r1 == 0) goto L_0x0029
            r0 = r0 | 48
            goto L_0x0037
        L_0x0029:
            r4 = r14 & 112(0x70, float:1.57E-43)
            if (r4 != 0) goto L_0x0037
            boolean r4 = r13.C(r12)
            if (r4 == 0) goto L_0x0035
            r4 = r3
            goto L_0x0036
        L_0x0035:
            r4 = r2
        L_0x0036:
            r0 = r0 | r4
        L_0x0037:
            r4 = r0 & 91
            r5 = 18
            if (r4 != r5) goto L_0x0048
            boolean r4 = r13.i()
            if (r4 != 0) goto L_0x0044
            goto L_0x0048
        L_0x0044:
            r13.I()
            goto L_0x00ae
        L_0x0048:
            if (r1 == 0) goto L_0x004b
            r12 = 0
        L_0x004b:
            k0.i$a r1 = k0.i.f23074a
            float r2 = (float) r2
            float r2 = c1.h.j(r2)
            k0.i r1 = androidx.compose.foundation.layout.q.n(r1, r2)
            java.lang.String r2 = java.lang.String.valueOf(r11)
            k0.i r4 = androidx.compose.ui.platform.n1.a(r1, r2)
            r1 = 0
            r2 = 1
            if (r12 == 0) goto L_0x0064
            r5 = r2
            goto L_0x0065
        L_0x0064:
            r5 = r1
        L_0x0065:
            r6 = -2076063811(0xffffffff8441c7bd, float:-2.2778756E-36)
            r13.T(r6)
            r6 = r0 & 112(0x70, float:1.57E-43)
            if (r6 != r3) goto L_0x0070
            r1 = r2
        L_0x0070:
            java.lang.Object r2 = r13.A()
            if (r1 != 0) goto L_0x007e
            Y.m$a r1 = Y.C1500m.f10026a
            java.lang.Object r1 = r1.a()
            if (r2 != r1) goto L_0x0086
        L_0x007e:
            io.intercom.android.sdk.m5.conversation.ui.components.composer.X r2 = new io.intercom.android.sdk.m5.conversation.ui.components.composer.X
            r2.<init>(r12)
            r13.r(r2)
        L_0x0086:
            r8 = r2
            yf.a r8 = (yf.C6787a) r8
            r13.M()
            r9 = 6
            r10 = 0
            r6 = 0
            r7 = 0
            k0.i r3 = androidx.compose.foundation.d.d(r4, r5, r6, r7, r8, r9, r10)
            r0 = r0 & 14
            w0.c r1 = M0.e.c(r11, r13, r0)
            io.intercom.android.sdk.ui.theme.IntercomTheme r0 = io.intercom.android.sdk.ui.theme.IntercomTheme.INSTANCE
            int r2 = io.intercom.android.sdk.ui.theme.IntercomTheme.$stable
            io.intercom.android.sdk.ui.theme.IntercomColors r0 = r0.getColors(r13, r2)
            long r4 = r0.m673getActionContrastWhite0d7_KjU()
            r7 = 56
            r8 = 0
            r2 = 0
            r6 = r13
            V.V.a(r1, r2, r3, r4, r6, r7, r8)
        L_0x00ae:
            Y.Y0 r13 = r13.k()
            if (r13 == 0) goto L_0x00bc
            io.intercom.android.sdk.m5.conversation.ui.components.composer.Y r0 = new io.intercom.android.sdk.m5.conversation.ui.components.composer.Y
            r0.<init>(r11, r12, r14, r15)
            r13.a(r0)
        L_0x00bc:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: io.intercom.android.sdk.m5.conversation.ui.components.composer.GifGridKt.GifGridIcon(int, yf.a, Y.m, int, int):void");
    }

    /* access modifiers changed from: private */
    public static final C6514M GifGridIcon$lambda$14$lambda$13(C6787a aVar) {
        if (aVar != null) {
            aVar.invoke();
        }
        return C6514M.f71813a;
    }

    /* access modifiers changed from: private */
    public static final C6514M GifGridIcon$lambda$15(int i10, C6787a aVar, int i11, int i12, C1500m mVar, int i13) {
        GifGridIcon(i10, aVar, mVar, M0.a(i11 | 1), i12);
        return C6514M.f71813a;
    }

    @IntercomPreviews
    private static final void PreviewGifGrid(C1500m mVar, int i10) {
        C1500m h10 = mVar.h(-1512591839);
        if (i10 != 0 || !h10.i()) {
            IntercomThemeKt.IntercomTheme((IntercomColors) null, (IntercomTypography) null, (B0) null, ComposableSingletons$GifGridKt.INSTANCE.m269getLambda3$intercom_sdk_base_release(), h10, 3072, 7);
        } else {
            h10.I();
        }
        Y0 k10 = h10.k();
        if (k10 != null) {
            k10.a(new Q(i10));
        }
    }

    /* access modifiers changed from: private */
    public static final C6514M PreviewGifGrid$lambda$16(int i10, C1500m mVar, int i11) {
        PreviewGifGrid(mVar, M0.a(i10 | 1));
        return C6514M.f71813a;
    }
}
