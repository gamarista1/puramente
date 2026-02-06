package io.intercom.android.sdk.m5.conversation.ui.components;

import C.C1085c;
import C.W;
import C.Z;
import C.a0;
import H0.F;
import J0.C1241g;
import M0.e;
import Q0.T;
import V.T0;
import V.V;
import V0.n;
import Y.C1494j;
import Y.C1500m;
import Y.C1523y;
import Y.F1;
import Y.M0;
import Y.Y0;
import android.net.Uri;
import androidx.compose.foundation.layout.q;
import b1.j;
import b1.k;
import c1.h;
import io.intercom.android.sdk.m5.conversation.states.InputTypeState;
import io.intercom.android.sdk.metrics.MetricTracker;
import java.util.List;
import k0.c;
import k0.i;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import lf.C6514M;
import mf.C6565s;
import yf.C6787a;
import yf.C6798l;
import yf.p;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\u001a]\u0010\r\u001a\u00020\u00052\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0018\u0010\u0006\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0004\u0012\u00020\u00050\u00022\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00072\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00050\u00022\u0006\u0010\f\u001a\u00020\u000bH\u0001¢\u0006\u0004\b\r\u0010\u000e\u001a!\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\t2\b\b\u0001\u0010\u0011\u001a\u00020\u0010H\u0003¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lk0/i;", "modifier", "Lkotlin/Function1;", "", "Landroid/net/Uri;", "Llf/M;", "onMediaSelected", "Lkotlin/Function0;", "dismissSheet", "", "trackClickedInput", "Lio/intercom/android/sdk/m5/conversation/states/InputTypeState;", "inputTypeState", "MediaInputSheetContent", "(Lk0/i;Lyf/l;Lyf/a;Lyf/l;Lio/intercom/android/sdk/m5/conversation/states/InputTypeState;LY/m;II)V", "text", "", "icon", "MediaInputSheetContentItem", "(Ljava/lang/String;ILY/m;I)V", "intercom-sdk-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class MediaInputSheetContentKt {
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v1, resolved type: yf.l} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v4, resolved type: yf.a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v3, resolved type: yf.l} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v6, resolved type: yf.a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v6, resolved type: yf.a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v8, resolved type: yf.l} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v5, resolved type: yf.a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v7, resolved type: yf.a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v8, resolved type: k0.i$a} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void MediaInputSheetContent(k0.i r30, yf.C6798l r31, yf.C6787a r32, yf.C6798l r33, io.intercom.android.sdk.m5.conversation.states.InputTypeState r34, Y.C1500m r35, int r36, int r37) {
        /*
            r2 = r31
            r3 = r32
            r4 = r33
            r6 = r36
            java.lang.String r0 = "onMediaSelected"
            kotlin.jvm.internal.C6496s.h(r2, r0)
            java.lang.String r0 = "dismissSheet"
            kotlin.jvm.internal.C6496s.h(r3, r0)
            java.lang.String r0 = "trackClickedInput"
            kotlin.jvm.internal.C6496s.h(r4, r0)
            java.lang.String r0 = "inputTypeState"
            r5 = r34
            kotlin.jvm.internal.C6496s.h(r5, r0)
            r0 = -842940445(0xffffffffcdc1bfe3, float:-4.06322272E8)
            r1 = r35
            Y.m r0 = r1.h(r0)
            r1 = 1
            r7 = r37 & 1
            if (r7 == 0) goto L_0x0030
            k0.i$a r7 = k0.i.f23074a
            r15 = r7
            goto L_0x0032
        L_0x0030:
            r15 = r30
        L_0x0032:
            C.c r7 = C.C1085c.f882a
            C.c$m r7 = r7.g()
            k0.c$a r8 = k0.c.f23044a
            k0.c$b r8 = r8.k()
            r14 = 0
            H0.F r7 = C.C1090h.a(r7, r8, r0, r14)
            int r8 = Y.C1494j.a(r0, r14)
            Y.y r9 = r0.p()
            k0.i r10 = k0.h.e(r0, r15)
            J0.g$a r11 = J0.C1241g.f3853J
            yf.a r12 = r11.a()
            Y.f r13 = r0.j()
            if (r13 != 0) goto L_0x005e
            Y.C1494j.c()
        L_0x005e:
            r0.F()
            boolean r13 = r0.f()
            if (r13 == 0) goto L_0x006b
            r0.U(r12)
            goto L_0x006e
        L_0x006b:
            r0.q()
        L_0x006e:
            Y.m r12 = Y.F1.a(r0)
            yf.p r13 = r11.c()
            Y.F1.b(r12, r7, r13)
            yf.p r7 = r11.e()
            Y.F1.b(r12, r9, r7)
            yf.p r7 = r11.b()
            boolean r9 = r12.f()
            if (r9 != 0) goto L_0x0098
            java.lang.Object r9 = r12.A()
            java.lang.Integer r13 = java.lang.Integer.valueOf(r8)
            boolean r9 = kotlin.jvm.internal.C6496s.c(r9, r13)
            if (r9 != 0) goto L_0x00a6
        L_0x0098:
            java.lang.Integer r9 = java.lang.Integer.valueOf(r8)
            r12.r(r9)
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            r12.V(r8, r7)
        L_0x00a6:
            yf.p r7 = r11.d()
            Y.F1.b(r12, r10, r7)
            C.k r7 = C.C1093k.f978a
            r7 = -1878694694(0xffffffff900564da, float:-2.6307318E-29)
            r0.T(r7)
            r7 = -1878695438(0xffffffff900561f2, float:-2.630508E-29)
            r0.T(r7)
            boolean r7 = r34.getCameraInputEnabled()
            r13 = 2048(0x800, float:2.87E-42)
            r12 = 32
            if (r7 == 0) goto L_0x023c
            io.intercom.android.sdk.m5.conversation.ui.components.composer.CameraInputType r8 = io.intercom.android.sdk.m5.conversation.ui.components.composer.CameraInputType.PHOTO
            r7 = 2017624231(0x784280a7, float:1.5779921E34)
            r0.T(r7)
            r7 = r6 & 112(0x70, float:1.57E-43)
            r11 = r7 ^ 48
            if (r11 <= r12) goto L_0x00d9
            boolean r7 = r0.S(r2)
            if (r7 != 0) goto L_0x00dd
        L_0x00d9:
            r7 = r6 & 48
            if (r7 != r12) goto L_0x00df
        L_0x00dd:
            r7 = r1
            goto L_0x00e0
        L_0x00df:
            r7 = r14
        L_0x00e0:
            java.lang.Object r9 = r0.A()
            if (r7 != 0) goto L_0x00ee
            Y.m$a r7 = Y.C1500m.f10026a
            java.lang.Object r7 = r7.a()
            if (r9 != r7) goto L_0x00f6
        L_0x00ee:
            io.intercom.android.sdk.m5.conversation.ui.components.W r9 = new io.intercom.android.sdk.m5.conversation.ui.components.W
            r9.<init>(r2)
            r0.r(r9)
        L_0x00f6:
            yf.l r9 = (yf.C6798l) r9
            r0.M()
            r7 = 2017628249(0x78429059, float:1.5784895E34)
            r0.T(r7)
            r7 = r6 & 7168(0x1c00, float:1.0045E-41)
            r10 = r7 ^ 3072(0xc00, float:4.305E-42)
            if (r10 <= r13) goto L_0x010d
            boolean r7 = r0.S(r4)
            if (r7 != 0) goto L_0x0111
        L_0x010d:
            r7 = r6 & 3072(0xc00, float:4.305E-42)
            if (r7 != r13) goto L_0x0113
        L_0x0111:
            r7 = r1
            goto L_0x0114
        L_0x0113:
            r7 = r14
        L_0x0114:
            java.lang.Object r1 = r0.A()
            if (r7 != 0) goto L_0x0122
            Y.m$a r7 = Y.C1500m.f10026a
            java.lang.Object r7 = r7.a()
            if (r1 != r7) goto L_0x012a
        L_0x0122:
            io.intercom.android.sdk.m5.conversation.ui.components.Y r1 = new io.intercom.android.sdk.m5.conversation.ui.components.Y
            r1.<init>(r4)
            r0.r(r1)
        L_0x012a:
            yf.a r1 = (yf.C6787a) r1
            r0.M()
            r7 = 2017632787(0x7842a213, float:1.5790513E34)
            r0.T(r7)
            r7 = r6 & 896(0x380, float:1.256E-42)
            r7 = r7 ^ 384(0x180, float:5.38E-43)
            r16 = r15
            r15 = 256(0x100, float:3.59E-43)
            if (r7 <= r15) goto L_0x0145
            boolean r17 = r0.S(r3)
            if (r17 != 0) goto L_0x0149
        L_0x0145:
            r12 = r6 & 384(0x180, float:5.38E-43)
            if (r12 != r15) goto L_0x014b
        L_0x0149:
            r12 = 1
            goto L_0x014c
        L_0x014b:
            r12 = r14
        L_0x014c:
            java.lang.Object r13 = r0.A()
            if (r12 != 0) goto L_0x015a
            Y.m$a r12 = Y.C1500m.f10026a
            java.lang.Object r12 = r12.a()
            if (r13 != r12) goto L_0x0162
        L_0x015a:
            io.intercom.android.sdk.m5.conversation.ui.components.Z r13 = new io.intercom.android.sdk.m5.conversation.ui.components.Z
            r13.<init>(r3)
            r0.r(r13)
        L_0x0162:
            r12 = r13
            yf.a r12 = (yf.C6787a) r12
            r0.M()
            io.intercom.android.sdk.m5.conversation.ui.components.ComposableSingletons$MediaInputSheetContentKt r18 = io.intercom.android.sdk.m5.conversation.ui.components.ComposableSingletons$MediaInputSheetContentKt.INSTANCE
            yf.p r13 = r18.m234getLambda1$intercom_sdk_base_release()
            r19 = 196656(0x30030, float:2.75574E-40)
            r20 = 1
            r21 = 0
            r22 = r7
            r7 = r21
            r23 = r10
            r10 = r1
            r1 = r11
            r11 = r12
            r12 = r13
            r13 = r0
            r21 = r14
            r14 = r19
            r5 = r15
            r19 = r16
            r15 = r20
            io.intercom.android.sdk.m5.conversation.ui.components.composer.CameraInputButtonKt.CameraInputButton(r7, r8, r9, r10, r11, r12, r13, r14, r15)
            io.intercom.android.sdk.m5.conversation.ui.components.composer.CameraInputType r8 = io.intercom.android.sdk.m5.conversation.ui.components.composer.CameraInputType.VIDEO
            r7 = 2017647079(0x7842d9e7, float:1.5808206E34)
            r0.T(r7)
            r15 = 32
            if (r1 <= r15) goto L_0x019e
            boolean r1 = r0.S(r2)
            if (r1 != 0) goto L_0x01a2
        L_0x019e:
            r1 = r6 & 48
            if (r1 != r15) goto L_0x01a4
        L_0x01a2:
            r14 = 1
            goto L_0x01a6
        L_0x01a4:
            r14 = r21
        L_0x01a6:
            java.lang.Object r1 = r0.A()
            if (r14 != 0) goto L_0x01b4
            Y.m$a r7 = Y.C1500m.f10026a
            java.lang.Object r7 = r7.a()
            if (r1 != r7) goto L_0x01bc
        L_0x01b4:
            io.intercom.android.sdk.m5.conversation.ui.components.a0 r1 = new io.intercom.android.sdk.m5.conversation.ui.components.a0
            r1.<init>(r2)
            r0.r(r1)
        L_0x01bc:
            r9 = r1
            yf.l r9 = (yf.C6798l) r9
            r0.M()
            r1 = 2017651097(0x7842e999, float:1.581318E34)
            r0.T(r1)
            r7 = r23
            r1 = 2048(0x800, float:2.87E-42)
            if (r7 <= r1) goto L_0x01d4
            boolean r7 = r0.S(r4)
            if (r7 != 0) goto L_0x01d8
        L_0x01d4:
            r7 = r6 & 3072(0xc00, float:4.305E-42)
            if (r7 != r1) goto L_0x01da
        L_0x01d8:
            r14 = 1
            goto L_0x01dc
        L_0x01da:
            r14 = r21
        L_0x01dc:
            java.lang.Object r7 = r0.A()
            if (r14 != 0) goto L_0x01ea
            Y.m$a r10 = Y.C1500m.f10026a
            java.lang.Object r10 = r10.a()
            if (r7 != r10) goto L_0x01f2
        L_0x01ea:
            io.intercom.android.sdk.m5.conversation.ui.components.b0 r7 = new io.intercom.android.sdk.m5.conversation.ui.components.b0
            r7.<init>(r4)
            r0.r(r7)
        L_0x01f2:
            r10 = r7
            yf.a r10 = (yf.C6787a) r10
            r0.M()
            r7 = 2017655635(0x7842fb53, float:1.5818798E34)
            r0.T(r7)
            r7 = r22
            if (r7 <= r5) goto L_0x0208
            boolean r7 = r0.S(r3)
            if (r7 != 0) goto L_0x020c
        L_0x0208:
            r7 = r6 & 384(0x180, float:5.38E-43)
            if (r7 != r5) goto L_0x020e
        L_0x020c:
            r14 = 1
            goto L_0x0210
        L_0x020e:
            r14 = r21
        L_0x0210:
            java.lang.Object r5 = r0.A()
            if (r14 != 0) goto L_0x021e
            Y.m$a r7 = Y.C1500m.f10026a
            java.lang.Object r7 = r7.a()
            if (r5 != r7) goto L_0x0226
        L_0x021e:
            io.intercom.android.sdk.m5.conversation.ui.components.c0 r5 = new io.intercom.android.sdk.m5.conversation.ui.components.c0
            r5.<init>(r3)
            r0.r(r5)
        L_0x0226:
            r11 = r5
            yf.a r11 = (yf.C6787a) r11
            r0.M()
            yf.p r12 = r18.m235getLambda2$intercom_sdk_base_release()
            r14 = 196656(0x30030, float:2.75574E-40)
            r5 = 1
            r7 = 0
            r13 = r0
            r1 = r15
            r15 = r5
            io.intercom.android.sdk.m5.conversation.ui.components.composer.CameraInputButtonKt.CameraInputButton(r7, r8, r9, r10, r11, r12, r13, r14, r15)
            goto L_0x0241
        L_0x023c:
            r1 = r12
            r21 = r14
            r19 = r15
        L_0x0241:
            r0.M()
            r5 = -1878648653(0xffffffff900618b3, float:-2.6445868E-29)
            r0.T(r5)
            boolean r5 = r34.getMediaInputEnabled()
            r18 = 12587446(0xc011b6, float:1.7638769E-38)
            if (r5 == 0) goto L_0x02ea
            io.intercom.android.sdk.ui.component.MediaType r9 = io.intercom.android.sdk.ui.component.MediaType.ImageAndVideo
            java.util.Set r10 = r34.getTrustedFileExtensions()
            io.intercom.android.sdk.ui.component.MediaPickerButtonCTAStyle$TopBarButton r12 = io.intercom.android.sdk.ui.component.MediaPickerButtonCTAStyle.TopBarButton.INSTANCE
            r28 = 6
            r29 = 0
            r24 = 1
            r25 = 0
            r26 = 0
            x.I r8 = V.C1409u0.c(r24, r25, r26, r28, r29)
            r5 = 2017674808(0x78434638, float:1.5842533E34)
            r0.T(r5)
            r5 = r6 & 112(0x70, float:1.57E-43)
            r5 = r5 ^ 48
            if (r5 <= r1) goto L_0x027b
            boolean r5 = r0.S(r2)
            if (r5 != 0) goto L_0x027f
        L_0x027b:
            r5 = r6 & 48
            if (r5 != r1) goto L_0x0281
        L_0x027f:
            r14 = 1
            goto L_0x0283
        L_0x0281:
            r14 = r21
        L_0x0283:
            java.lang.Object r5 = r0.A()
            if (r14 != 0) goto L_0x0291
            Y.m$a r7 = Y.C1500m.f10026a
            java.lang.Object r7 = r7.a()
            if (r5 != r7) goto L_0x0299
        L_0x0291:
            io.intercom.android.sdk.m5.conversation.ui.components.d0 r5 = new io.intercom.android.sdk.m5.conversation.ui.components.d0
            r5.<init>(r2)
            r0.r(r5)
        L_0x0299:
            r11 = r5
            yf.l r11 = (yf.C6798l) r11
            r0.M()
            r5 = 2017682648(0x784364d8, float:1.5852238E34)
            r0.T(r5)
            r5 = r6 & 7168(0x1c00, float:1.0045E-41)
            r5 = r5 ^ 3072(0xc00, float:4.305E-42)
            r7 = 2048(0x800, float:2.87E-42)
            if (r5 <= r7) goto L_0x02b3
            boolean r5 = r0.S(r4)
            if (r5 != 0) goto L_0x02b7
        L_0x02b3:
            r5 = r6 & 3072(0xc00, float:4.305E-42)
            if (r5 != r7) goto L_0x02b9
        L_0x02b7:
            r14 = 1
            goto L_0x02bb
        L_0x02b9:
            r14 = r21
        L_0x02bb:
            java.lang.Object r5 = r0.A()
            if (r14 != 0) goto L_0x02c9
            Y.m$a r7 = Y.C1500m.f10026a
            java.lang.Object r7 = r7.a()
            if (r5 != r7) goto L_0x02d1
        L_0x02c9:
            io.intercom.android.sdk.m5.conversation.ui.components.e0 r5 = new io.intercom.android.sdk.m5.conversation.ui.components.e0
            r5.<init>(r4)
            r0.r(r5)
        L_0x02d1:
            r13 = r5
            yf.a r13 = (yf.C6787a) r13
            r0.M()
            io.intercom.android.sdk.m5.conversation.ui.components.ComposableSingletons$MediaInputSheetContentKt r5 = io.intercom.android.sdk.m5.conversation.ui.components.ComposableSingletons$MediaInputSheetContentKt.INSTANCE
            yf.p r14 = r5.m236getLambda3$intercom_sdk_base_release()
            int r5 = io.intercom.android.sdk.ui.component.MediaPickerButtonCTAStyle.TopBarButton.$stable
            int r5 = r5 << 15
            r16 = r5 | r18
            r17 = 0
            r7 = 1
            r15 = r0
            io.intercom.android.sdk.ui.component.MediaPickerButtonKt.MediaPickerButton(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
        L_0x02ea:
            r0.M()
            r5 = -1878620614(0xffffffff9006863a, float:-2.6530245E-29)
            r0.T(r5)
            boolean r5 = r34.getFileInputEnabled()
            if (r5 == 0) goto L_0x0390
            io.intercom.android.sdk.ui.component.MediaType r9 = io.intercom.android.sdk.ui.component.MediaType.DocumentOnly
            java.util.Set r10 = r34.getTrustedFileExtensions()
            io.intercom.android.sdk.ui.component.MediaPickerButtonCTAStyle$TopBarButton r12 = io.intercom.android.sdk.ui.component.MediaPickerButtonCTAStyle.TopBarButton.INSTANCE
            r28 = 6
            r29 = 0
            r24 = 1
            r25 = 0
            r26 = 0
            x.I r8 = V.C1409u0.c(r24, r25, r26, r28, r29)
            r5 = 2017704824(0x7843bb78, float:1.5879691E34)
            r0.T(r5)
            r5 = r6 & 112(0x70, float:1.57E-43)
            r5 = r5 ^ 48
            if (r5 <= r1) goto L_0x0321
            boolean r5 = r0.S(r2)
            if (r5 != 0) goto L_0x0325
        L_0x0321:
            r5 = r6 & 48
            if (r5 != r1) goto L_0x0327
        L_0x0325:
            r14 = 1
            goto L_0x0329
        L_0x0327:
            r14 = r21
        L_0x0329:
            java.lang.Object r1 = r0.A()
            if (r14 != 0) goto L_0x0337
            Y.m$a r5 = Y.C1500m.f10026a
            java.lang.Object r5 = r5.a()
            if (r1 != r5) goto L_0x033f
        L_0x0337:
            io.intercom.android.sdk.m5.conversation.ui.components.U r1 = new io.intercom.android.sdk.m5.conversation.ui.components.U
            r1.<init>(r2)
            r0.r(r1)
        L_0x033f:
            r11 = r1
            yf.l r11 = (yf.C6798l) r11
            r0.M()
            r1 = 2017712663(0x7843da17, float:1.5889395E34)
            r0.T(r1)
            r1 = r6 & 7168(0x1c00, float:1.0045E-41)
            r1 = r1 ^ 3072(0xc00, float:4.305E-42)
            r5 = 2048(0x800, float:2.87E-42)
            if (r1 <= r5) goto L_0x0359
            boolean r1 = r0.S(r4)
            if (r1 != 0) goto L_0x035d
        L_0x0359:
            r1 = r6 & 3072(0xc00, float:4.305E-42)
            if (r1 != r5) goto L_0x035f
        L_0x035d:
            r1 = 1
            goto L_0x0361
        L_0x035f:
            r1 = r21
        L_0x0361:
            java.lang.Object r5 = r0.A()
            if (r1 != 0) goto L_0x036f
            Y.m$a r1 = Y.C1500m.f10026a
            java.lang.Object r1 = r1.a()
            if (r5 != r1) goto L_0x0377
        L_0x036f:
            io.intercom.android.sdk.m5.conversation.ui.components.V r5 = new io.intercom.android.sdk.m5.conversation.ui.components.V
            r5.<init>(r4)
            r0.r(r5)
        L_0x0377:
            r13 = r5
            yf.a r13 = (yf.C6787a) r13
            r0.M()
            io.intercom.android.sdk.m5.conversation.ui.components.ComposableSingletons$MediaInputSheetContentKt r1 = io.intercom.android.sdk.m5.conversation.ui.components.ComposableSingletons$MediaInputSheetContentKt.INSTANCE
            yf.p r14 = r1.m237getLambda4$intercom_sdk_base_release()
            int r1 = io.intercom.android.sdk.ui.component.MediaPickerButtonCTAStyle.TopBarButton.$stable
            int r1 = r1 << 15
            r16 = r1 | r18
            r17 = 0
            r7 = 1
            r15 = r0
            io.intercom.android.sdk.ui.component.MediaPickerButtonKt.MediaPickerButton(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
        L_0x0390:
            r0.M()
            lf.M r1 = lf.C6514M.f71813a
            r0.M()
            r0.u()
            Y.Y0 r8 = r0.k()
            if (r8 == 0) goto L_0x03b8
            io.intercom.android.sdk.m5.conversation.ui.components.X r9 = new io.intercom.android.sdk.m5.conversation.ui.components.X
            r0 = r9
            r1 = r19
            r2 = r31
            r3 = r32
            r4 = r33
            r5 = r34
            r6 = r36
            r7 = r37
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            r8.a(r9)
        L_0x03b8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: io.intercom.android.sdk.m5.conversation.ui.components.MediaInputSheetContentKt.MediaInputSheetContent(k0.i, yf.l, yf.a, yf.l, io.intercom.android.sdk.m5.conversation.states.InputTypeState, Y.m, int, int):void");
    }

    /* access modifiers changed from: private */
    public static final C6514M MediaInputSheetContent$lambda$21$lambda$20$lambda$1$lambda$0(C6798l lVar, Uri uri) {
        C6496s.h(lVar, "$onMediaSelected");
        lVar.invoke(C6565s.r(uri));
        return C6514M.f71813a;
    }

    /* access modifiers changed from: private */
    public static final C6514M MediaInputSheetContent$lambda$21$lambda$20$lambda$11$lambda$10(C6787a aVar) {
        C6496s.h(aVar, "$dismissSheet");
        aVar.invoke();
        return C6514M.f71813a;
    }

    /* access modifiers changed from: private */
    public static final C6514M MediaInputSheetContent$lambda$21$lambda$20$lambda$13$lambda$12(C6798l lVar, List list) {
        C6496s.h(lVar, "$onMediaSelected");
        C6496s.h(list, "it");
        lVar.invoke(list);
        return C6514M.f71813a;
    }

    /* access modifiers changed from: private */
    public static final C6514M MediaInputSheetContent$lambda$21$lambda$20$lambda$15$lambda$14(C6798l lVar) {
        C6496s.h(lVar, "$trackClickedInput");
        lVar.invoke(MetricTracker.Object.IMAGE_INPUT);
        return C6514M.f71813a;
    }

    /* access modifiers changed from: private */
    public static final C6514M MediaInputSheetContent$lambda$21$lambda$20$lambda$17$lambda$16(C6798l lVar, List list) {
        C6496s.h(lVar, "$onMediaSelected");
        C6496s.h(list, "it");
        lVar.invoke(list);
        return C6514M.f71813a;
    }

    /* access modifiers changed from: private */
    public static final C6514M MediaInputSheetContent$lambda$21$lambda$20$lambda$19$lambda$18(C6798l lVar) {
        C6496s.h(lVar, "$trackClickedInput");
        lVar.invoke(MetricTracker.Object.FILE_INPUT);
        return C6514M.f71813a;
    }

    /* access modifiers changed from: private */
    public static final C6514M MediaInputSheetContent$lambda$21$lambda$20$lambda$3$lambda$2(C6798l lVar) {
        C6496s.h(lVar, "$trackClickedInput");
        lVar.invoke(MetricTracker.Object.CAMERA_INPUT);
        return C6514M.f71813a;
    }

    /* access modifiers changed from: private */
    public static final C6514M MediaInputSheetContent$lambda$21$lambda$20$lambda$5$lambda$4(C6787a aVar) {
        C6496s.h(aVar, "$dismissSheet");
        aVar.invoke();
        return C6514M.f71813a;
    }

    /* access modifiers changed from: private */
    public static final C6514M MediaInputSheetContent$lambda$21$lambda$20$lambda$7$lambda$6(C6798l lVar, Uri uri) {
        C6496s.h(lVar, "$onMediaSelected");
        lVar.invoke(C6565s.r(uri));
        return C6514M.f71813a;
    }

    /* access modifiers changed from: private */
    public static final C6514M MediaInputSheetContent$lambda$21$lambda$20$lambda$9$lambda$8(C6798l lVar) {
        C6496s.h(lVar, "$trackClickedInput");
        lVar.invoke(MetricTracker.Object.CAMERA_INPUT);
        return C6514M.f71813a;
    }

    /* access modifiers changed from: private */
    public static final C6514M MediaInputSheetContent$lambda$22(i iVar, C6798l lVar, C6787a aVar, C6798l lVar2, InputTypeState inputTypeState, int i10, int i11, C1500m mVar, int i12) {
        C6496s.h(lVar, "$onMediaSelected");
        C6496s.h(aVar, "$dismissSheet");
        C6496s.h(lVar2, "$trackClickedInput");
        C6496s.h(inputTypeState, "$inputTypeState");
        MediaInputSheetContent(iVar, lVar, aVar, lVar2, inputTypeState, mVar, M0.a(i10 | 1), i11);
        return C6514M.f71813a;
    }

    /* access modifiers changed from: private */
    public static final void MediaInputSheetContentItem(String str, int i10, C1500m mVar, int i11) {
        int i12;
        C1500m mVar2;
        int i13;
        int i14;
        String str2 = str;
        int i15 = i10;
        int i16 = i11;
        C1500m h10 = mVar.h(-181831684);
        if ((i16 & 14) == 0) {
            if (h10.S(str2)) {
                i14 = 4;
            } else {
                i14 = 2;
            }
            i12 = i14 | i16;
        } else {
            i12 = i16;
        }
        if ((i16 & 112) == 0) {
            if (h10.d(i15)) {
                i13 = 32;
            } else {
                i13 = 16;
            }
            i12 |= i13;
        }
        if ((i12 & 91) != 18 || !h10.i()) {
            i.a aVar = i.f23074a;
            i h11 = q.h(q.i(aVar, h.j((float) 56)), 0.0f, 1, (Object) null);
            F b10 = W.b(C1085c.f882a.f(), c.f23044a.i(), h10, 48);
            int a10 = C1494j.a(h10, 0);
            C1523y p10 = h10.p();
            i e10 = k0.h.e(h10, h11);
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
            V.a(e.c(i15, h10, (i12 >> 3) & 14), (String) null, q.n(aVar, h.j((float) 24)), 0, h10, 440, 8);
            a0.a(q.r(aVar, h.j((float) 8)), h10, 6);
            mVar2 = h10;
            T0.b(str, (i) null, 0, 0, (n) null, (V0.p) null, (V0.h) null, 0, (k) null, (j) null, 0, 0, false, 0, 0, (C6798l) null, (T) null, mVar2, i12 & 14, 0, 131070);
            mVar2.u();
        } else {
            h10.I();
            mVar2 = h10;
        }
        Y0 k10 = mVar2.k();
        if (k10 != null) {
            k10.a(new T(str, i10, i11));
        }
    }

    /* access modifiers changed from: private */
    public static final C6514M MediaInputSheetContentItem$lambda$24(String str, int i10, int i11, C1500m mVar, int i12) {
        C6496s.h(str, "$text");
        MediaInputSheetContentItem(str, i10, mVar, M0.a(i11 | 1));
        return C6514M.f71813a;
    }
}
