package io.intercom.android.sdk.m5.conversation.ui.components.composer;

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
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.m5.conversation.states.BottomBarUiState;
import io.intercom.android.sdk.ui.theme.IntercomColors;
import io.intercom.android.sdk.ui.theme.IntercomThemeKt;
import io.intercom.android.sdk.ui.theme.IntercomTypography;
import java.util.List;
import k0.c;
import k0.h;
import k0.i;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import lf.C6514M;
import lf.C6535s;
import yf.C6787a;
import yf.p;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\t\u001aQ\u0010\u000b\u001a\u00020\b2\b\b\u0002\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0001¢\u0006\u0004\b\u000b\u0010\f\u001a3\u0010\u0010\u001a\u00020\b2\b\b\u0001\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0003¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u000f\u0010\u0012\u001a\u00020\bH\u0003¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u000f\u0010\u0014\u001a\u00020\bH\u0003¢\u0006\u0004\b\u0014\u0010\u0013\u001a\u000f\u0010\u0015\u001a\u00020\bH\u0003¢\u0006\u0004\b\u0015\u0010\u0013¨\u0006\u0016"}, d2 = {"Lk0/i;", "modifier", "", "Lio/intercom/android/sdk/m5/conversation/states/BottomBarUiState$BottomBarButton;", "buttons", "", "enabled", "Lkotlin/Function0;", "Llf/M;", "onGifInputSelected", "onMediaInputSelected", "BottomBarButtonComponent", "(Lk0/i;Ljava/util/List;ZLyf/a;Lyf/a;LY/m;II)V", "", "icon", "onClick", "BottomBarIcon", "(IZLyf/a;LY/m;II)V", "BottomBarButtonComponentPreview", "(LY/m;I)V", "BottomBarButtonComponentPreviewGifOnly", "BottomBarButtonComponentPreviewMediaOnly", "intercom-sdk-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class BottomBarButtonComponentKt {
    public static final void BottomBarButtonComponent(i iVar, List<? extends BottomBarUiState.BottomBarButton> list, boolean z10, C6787a aVar, C6787a aVar2, C1500m mVar, int i10, int i11) {
        i.a aVar3;
        boolean z11;
        C6076a aVar4;
        C6078b bVar;
        List<? extends BottomBarUiState.BottomBarButton> list2 = list;
        C6496s.h(list, "buttons");
        C1500m h10 = mVar.h(-1392249176);
        if ((i11 & 1) != 0) {
            aVar3 = i.f23074a;
        } else {
            aVar3 = iVar;
        }
        if ((i11 & 4) != 0) {
            z11 = true;
        } else {
            z11 = z10;
        }
        if ((i11 & 8) != 0) {
            aVar4 = new C6076a();
        } else {
            aVar4 = aVar;
        }
        if ((i11 & 16) != 0) {
            bVar = new C6078b();
        } else {
            bVar = aVar2;
        }
        F b10 = W.b(C1085c.f882a.f(), c.f23044a.l(), h10, 0);
        int a10 = C1494j.a(h10, 0);
        C1523y p10 = h10.p();
        i e10 = h.e(h10, aVar3);
        C1241g.a aVar5 = C1241g.f3853J;
        C6787a a11 = aVar5.a();
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
        F1.b(a12, b10, aVar5.c());
        F1.b(a12, p10, aVar5.e());
        p b11 = aVar5.b();
        if (a12.f() || !C6496s.c(a12.A(), Integer.valueOf(a10))) {
            a12.r(Integer.valueOf(a10));
            a12.V(Integer.valueOf(a10), b11);
        }
        F1.b(a12, e10, aVar5.d());
        Z z12 = Z.f873a;
        h10.T(-1981857044);
        for (BottomBarUiState.BottomBarButton bottomBarButton : list2) {
            if (C6496s.c(bottomBarButton, BottomBarUiState.BottomBarButton.GifInsert.INSTANCE)) {
                h10.T(1310873340);
                BottomBarIcon(R.drawable.intercom_ic_gif_input, z11, aVar4, h10, (i10 >> 3) & 1008, 0);
                h10.M();
            } else if (C6496s.c(bottomBarButton, BottomBarUiState.BottomBarButton.MediaInsert.INSTANCE)) {
                h10.T(1311174815);
                BottomBarIcon(R.drawable.intercom_ic_plus, z11, bVar, h10, ((i10 >> 3) & 112) | ((i10 >> 6) & 896), 0);
                h10.M();
            } else {
                h10.T(1427757579);
                h10.M();
                throw new C6535s();
            }
        }
        h10.M();
        h10.u();
        Y0 k10 = h10.k();
        if (k10 != null) {
            k10.a(new C6080c(aVar3, list, z11, aVar4, bVar, i10, i11));
        }
    }

    /* access modifiers changed from: private */
    public static final C6514M BottomBarButtonComponent$lambda$0() {
        return C6514M.f71813a;
    }

    /* access modifiers changed from: private */
    public static final C6514M BottomBarButtonComponent$lambda$1() {
        return C6514M.f71813a;
    }

    /* access modifiers changed from: private */
    public static final C6514M BottomBarButtonComponent$lambda$4(i iVar, List list, boolean z10, C6787a aVar, C6787a aVar2, int i10, int i11, C1500m mVar, int i12) {
        C6496s.h(list, "$buttons");
        BottomBarButtonComponent(iVar, list, z10, aVar, aVar2, mVar, M0.a(i10 | 1), i11);
        return C6514M.f71813a;
    }

    private static final void BottomBarButtonComponentPreview(C1500m mVar, int i10) {
        C1500m h10 = mVar.h(-179036889);
        if (i10 != 0 || !h10.i()) {
            IntercomThemeKt.IntercomTheme((IntercomColors) null, (IntercomTypography) null, (B0) null, ComposableSingletons$BottomBarButtonComponentKt.INSTANCE.m258getLambda2$intercom_sdk_base_release(), h10, 3072, 7);
        } else {
            h10.I();
        }
        Y0 k10 = h10.k();
        if (k10 != null) {
            k10.a(new C6088g(i10));
        }
    }

    /* access modifiers changed from: private */
    public static final C6514M BottomBarButtonComponentPreview$lambda$7(int i10, C1500m mVar, int i11) {
        BottomBarButtonComponentPreview(mVar, M0.a(i10 | 1));
        return C6514M.f71813a;
    }

    private static final void BottomBarButtonComponentPreviewGifOnly(C1500m mVar, int i10) {
        C1500m h10 = mVar.h(-1619387831);
        if (i10 != 0 || !h10.i()) {
            IntercomThemeKt.IntercomTheme((IntercomColors) null, (IntercomTypography) null, (B0) null, ComposableSingletons$BottomBarButtonComponentKt.INSTANCE.m260getLambda4$intercom_sdk_base_release(), h10, 3072, 7);
        } else {
            h10.I();
        }
        Y0 k10 = h10.k();
        if (k10 != null) {
            k10.a(new C6090h(i10));
        }
    }

    /* access modifiers changed from: private */
    public static final C6514M BottomBarButtonComponentPreviewGifOnly$lambda$8(int i10, C1500m mVar, int i11) {
        BottomBarButtonComponentPreviewGifOnly(mVar, M0.a(i10 | 1));
        return C6514M.f71813a;
    }

    private static final void BottomBarButtonComponentPreviewMediaOnly(C1500m mVar, int i10) {
        C1500m h10 = mVar.h(-1269009367);
        if (i10 != 0 || !h10.i()) {
            IntercomThemeKt.IntercomTheme((IntercomColors) null, (IntercomTypography) null, (B0) null, ComposableSingletons$BottomBarButtonComponentKt.INSTANCE.m262getLambda6$intercom_sdk_base_release(), h10, 3072, 7);
        } else {
            h10.I();
        }
        Y0 k10 = h10.k();
        if (k10 != null) {
            k10.a(new C6082d(i10));
        }
    }

    /* access modifiers changed from: private */
    public static final C6514M BottomBarButtonComponentPreviewMediaOnly$lambda$9(int i10, C1500m mVar, int i11) {
        BottomBarButtonComponentPreviewMediaOnly(mVar, M0.a(i10 | 1));
        return C6514M.f71813a;
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x0042  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0047  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0066  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x006c  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00aa  */
    /* JADX WARNING: Removed duplicated region for block: B:50:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static final void BottomBarIcon(int r15, boolean r16, yf.C6787a r17, Y.C1500m r18, int r19, int r20) {
        /*
            r1 = r15
            r4 = r19
            r0 = 1211476790(0x4835ab36, float:186028.84)
            r2 = r18
            Y.m r0 = r2.h(r0)
            r2 = r20 & 1
            if (r2 == 0) goto L_0x0013
            r2 = r4 | 6
            goto L_0x0023
        L_0x0013:
            r2 = r4 & 14
            if (r2 != 0) goto L_0x0022
            boolean r2 = r0.d(r15)
            if (r2 == 0) goto L_0x001f
            r2 = 4
            goto L_0x0020
        L_0x001f:
            r2 = 2
        L_0x0020:
            r2 = r2 | r4
            goto L_0x0023
        L_0x0022:
            r2 = r4
        L_0x0023:
            r3 = r20 & 2
            if (r3 == 0) goto L_0x002c
            r2 = r2 | 48
        L_0x0029:
            r5 = r16
            goto L_0x003e
        L_0x002c:
            r5 = r4 & 112(0x70, float:1.57E-43)
            if (r5 != 0) goto L_0x0029
            r5 = r16
            boolean r6 = r0.b(r5)
            if (r6 == 0) goto L_0x003b
            r6 = 32
            goto L_0x003d
        L_0x003b:
            r6 = 16
        L_0x003d:
            r2 = r2 | r6
        L_0x003e:
            r6 = r20 & 4
            if (r6 == 0) goto L_0x0047
            r2 = r2 | 384(0x180, float:5.38E-43)
        L_0x0044:
            r7 = r17
            goto L_0x0059
        L_0x0047:
            r7 = r4 & 896(0x380, float:1.256E-42)
            if (r7 != 0) goto L_0x0044
            r7 = r17
            boolean r8 = r0.C(r7)
            if (r8 == 0) goto L_0x0056
            r8 = 256(0x100, float:3.59E-43)
            goto L_0x0058
        L_0x0056:
            r8 = 128(0x80, float:1.794E-43)
        L_0x0058:
            r2 = r2 | r8
        L_0x0059:
            r8 = r2 & 731(0x2db, float:1.024E-42)
            r9 = 146(0x92, float:2.05E-43)
            if (r8 != r9) goto L_0x006c
            boolean r8 = r0.i()
            if (r8 != 0) goto L_0x0066
            goto L_0x006c
        L_0x0066:
            r0.I()
            r2 = r5
            r3 = r7
            goto L_0x00a4
        L_0x006c:
            r8 = 1
            if (r3 == 0) goto L_0x0071
            r3 = r8
            goto L_0x0072
        L_0x0071:
            r3 = r5
        L_0x0072:
            if (r6 == 0) goto L_0x007b
            io.intercom.android.sdk.m5.conversation.ui.components.composer.e r5 = new io.intercom.android.sdk.m5.conversation.ui.components.composer.e
            r5.<init>()
            r14 = r5
            goto L_0x007c
        L_0x007b:
            r14 = r7
        L_0x007c:
            io.intercom.android.sdk.m5.conversation.ui.components.composer.BottomBarButtonComponentKt$BottomBarIcon$2 r5 = new io.intercom.android.sdk.m5.conversation.ui.components.composer.BottomBarButtonComponentKt$BottomBarIcon$2
            r5.<init>(r15)
            r6 = 54
            r7 = 1749933369(0x684ddd39, float:3.888664E24)
            g0.a r10 = g0.c.e(r7, r8, r5, r0, r6)
            int r5 = r2 >> 6
            r5 = r5 & 14
            r6 = 196608(0x30000, float:2.75506E-40)
            r5 = r5 | r6
            int r2 = r2 << 3
            r2 = r2 & 896(0x380, float:1.256E-42)
            r12 = r5 | r2
            r13 = 26
            r6 = 0
            r8 = 0
            r9 = 0
            r5 = r14
            r7 = r3
            r11 = r0
            V.U.b(r5, r6, r7, r8, r9, r10, r11, r12, r13)
            r2 = r3
            r3 = r14
        L_0x00a4:
            Y.Y0 r6 = r0.k()
            if (r6 == 0) goto L_0x00b8
            io.intercom.android.sdk.m5.conversation.ui.components.composer.f r7 = new io.intercom.android.sdk.m5.conversation.ui.components.composer.f
            r0 = r7
            r1 = r15
            r4 = r19
            r5 = r20
            r0.<init>(r1, r2, r3, r4, r5)
            r6.a(r7)
        L_0x00b8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: io.intercom.android.sdk.m5.conversation.ui.components.composer.BottomBarButtonComponentKt.BottomBarIcon(int, boolean, yf.a, Y.m, int, int):void");
    }

    /* access modifiers changed from: private */
    public static final C6514M BottomBarIcon$lambda$5() {
        return C6514M.f71813a;
    }

    /* access modifiers changed from: private */
    public static final C6514M BottomBarIcon$lambda$6(int i10, boolean z10, C6787a aVar, int i11, int i12, C1500m mVar, int i13) {
        BottomBarIcon(i10, z10, aVar, mVar, M0.a(i11 | 1), i12);
        return C6514M.f71813a;
    }
}
