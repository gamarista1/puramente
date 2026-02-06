package io.intercom.android.sdk.m5.inbox.ui;

import V.B0;
import Y.C1500m;
import Y.M0;
import Y.Y0;
import io.intercom.android.sdk.models.EmptyState;
import io.intercom.android.sdk.ui.IntercomPreviews;
import io.intercom.android.sdk.ui.theme.IntercomColors;
import io.intercom.android.sdk.ui.theme.IntercomThemeKt;
import io.intercom.android.sdk.ui.theme.IntercomTypography;
import k0.i;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import lf.C6514M;
import yf.C6787a;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\u001a7\u0010\t\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0002\u0010\b\u001a\u00020\u0007H\u0001¢\u0006\u0004\b\t\u0010\n\u001a\u000f\u0010\u000b\u001a\u00020\u0005H\u0003¢\u0006\u0004\b\u000b\u0010\f\u001a\u000f\u0010\r\u001a\u00020\u0005H\u0003¢\u0006\u0004\b\r\u0010\f\u001a\u000f\u0010\u000e\u001a\u00020\u0005H\u0003¢\u0006\u0004\b\u000e\u0010\f\u001a\u000f\u0010\u000f\u001a\u00020\u0005H\u0003¢\u0006\u0004\b\u000f\u0010\f¨\u0006\u0010"}, d2 = {"Lio/intercom/android/sdk/models/EmptyState;", "emptyState", "", "showActionButton", "Lkotlin/Function0;", "Llf/M;", "onActionButtonClick", "Lk0/i;", "modifier", "InboxEmptyScreen", "(Lio/intercom/android/sdk/models/EmptyState;ZLyf/a;Lk0/i;LY/m;II)V", "EmptyScreenMessagePreview", "(LY/m;I)V", "EmptyScreenHelpPreview", "EmptyScreenWithoutActionPreview", "EmptyScreenBotPreview", "intercom-sdk-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class InboxEmptyScreenKt {
    @IntercomPreviews
    private static final void EmptyScreenBotPreview(C1500m mVar, int i10) {
        C1500m h10 = mVar.h(862447475);
        if (i10 != 0 || !h10.i()) {
            IntercomThemeKt.IntercomTheme((IntercomColors) null, (IntercomTypography) null, (B0) null, ComposableSingletons$InboxEmptyScreenKt.INSTANCE.m398getLambda8$intercom_sdk_base_release(), h10, 3072, 7);
        } else {
            h10.I();
        }
        Y0 k10 = h10.k();
        if (k10 != null) {
            k10.a(new l(i10));
        }
    }

    /* access modifiers changed from: private */
    public static final C6514M EmptyScreenBotPreview$lambda$4(int i10, C1500m mVar, int i11) {
        EmptyScreenBotPreview(mVar, M0.a(i10 | 1));
        return C6514M.f71813a;
    }

    @IntercomPreviews
    private static final void EmptyScreenHelpPreview(C1500m mVar, int i10) {
        C1500m h10 = mVar.h(-1522245405);
        if (i10 != 0 || !h10.i()) {
            IntercomThemeKt.IntercomTheme((IntercomColors) null, (IntercomTypography) null, (B0) null, ComposableSingletons$InboxEmptyScreenKt.INSTANCE.m394getLambda4$intercom_sdk_base_release(), h10, 3072, 7);
        } else {
            h10.I();
        }
        Y0 k10 = h10.k();
        if (k10 != null) {
            k10.a(new n(i10));
        }
    }

    /* access modifiers changed from: private */
    public static final C6514M EmptyScreenHelpPreview$lambda$2(int i10, C1500m mVar, int i11) {
        EmptyScreenHelpPreview(mVar, M0.a(i10 | 1));
        return C6514M.f71813a;
    }

    @IntercomPreviews
    private static final void EmptyScreenMessagePreview(C1500m mVar, int i10) {
        C1500m h10 = mVar.h(1317218099);
        if (i10 != 0 || !h10.i()) {
            IntercomThemeKt.IntercomTheme((IntercomColors) null, (IntercomTypography) null, (B0) null, ComposableSingletons$InboxEmptyScreenKt.INSTANCE.m392getLambda2$intercom_sdk_base_release(), h10, 3072, 7);
        } else {
            h10.I();
        }
        Y0 k10 = h10.k();
        if (k10 != null) {
            k10.a(new j(i10));
        }
    }

    /* access modifiers changed from: private */
    public static final C6514M EmptyScreenMessagePreview$lambda$1(int i10, C1500m mVar, int i11) {
        EmptyScreenMessagePreview(mVar, M0.a(i10 | 1));
        return C6514M.f71813a;
    }

    @IntercomPreviews
    private static final void EmptyScreenWithoutActionPreview(C1500m mVar, int i10) {
        C1500m h10 = mVar.h(-132232118);
        if (i10 != 0 || !h10.i()) {
            IntercomThemeKt.IntercomTheme((IntercomColors) null, (IntercomTypography) null, (B0) null, ComposableSingletons$InboxEmptyScreenKt.INSTANCE.m396getLambda6$intercom_sdk_base_release(), h10, 3072, 7);
        } else {
            h10.I();
        }
        Y0 k10 = h10.k();
        if (k10 != null) {
            k10.a(new k(i10));
        }
    }

    /* access modifiers changed from: private */
    public static final C6514M EmptyScreenWithoutActionPreview$lambda$3(int i10, C1500m mVar, int i11) {
        EmptyScreenWithoutActionPreview(mVar, M0.a(i10 | 1));
        return C6514M.f71813a;
    }

    /* JADX WARNING: Removed duplicated region for block: B:46:0x0087  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x008c  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00c3  */
    /* JADX WARNING: Removed duplicated region for block: B:55:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void InboxEmptyScreen(io.intercom.android.sdk.models.EmptyState r15, boolean r16, yf.C6787a r17, k0.i r18, Y.C1500m r19, int r20, int r21) {
        /*
            r1 = r15
            r2 = r16
            r3 = r17
            r5 = r20
            java.lang.String r0 = "emptyState"
            kotlin.jvm.internal.C6496s.h(r15, r0)
            java.lang.String r0 = "onActionButtonClick"
            kotlin.jvm.internal.C6496s.h(r3, r0)
            r0 = -727293785(0xffffffffd4a660a7, float:-5.716689E12)
            r4 = r19
            Y.m r0 = r4.h(r0)
            r4 = r21 & 1
            if (r4 == 0) goto L_0x0021
            r4 = r5 | 6
            goto L_0x0031
        L_0x0021:
            r4 = r5 & 14
            if (r4 != 0) goto L_0x0030
            boolean r4 = r0.S(r15)
            if (r4 == 0) goto L_0x002d
            r4 = 4
            goto L_0x002e
        L_0x002d:
            r4 = 2
        L_0x002e:
            r4 = r4 | r5
            goto L_0x0031
        L_0x0030:
            r4 = r5
        L_0x0031:
            r6 = r21 & 2
            if (r6 == 0) goto L_0x0038
            r4 = r4 | 48
            goto L_0x0048
        L_0x0038:
            r6 = r5 & 112(0x70, float:1.57E-43)
            if (r6 != 0) goto L_0x0048
            boolean r6 = r0.b(r2)
            if (r6 == 0) goto L_0x0045
            r6 = 32
            goto L_0x0047
        L_0x0045:
            r6 = 16
        L_0x0047:
            r4 = r4 | r6
        L_0x0048:
            r6 = r21 & 4
            if (r6 == 0) goto L_0x004f
            r4 = r4 | 384(0x180, float:5.38E-43)
            goto L_0x005f
        L_0x004f:
            r6 = r5 & 896(0x380, float:1.256E-42)
            if (r6 != 0) goto L_0x005f
            boolean r6 = r0.C(r3)
            if (r6 == 0) goto L_0x005c
            r6 = 256(0x100, float:3.59E-43)
            goto L_0x005e
        L_0x005c:
            r6 = 128(0x80, float:1.794E-43)
        L_0x005e:
            r4 = r4 | r6
        L_0x005f:
            r6 = r21 & 8
            if (r6 == 0) goto L_0x0068
            r4 = r4 | 3072(0xc00, float:4.305E-42)
        L_0x0065:
            r7 = r18
            goto L_0x007a
        L_0x0068:
            r7 = r5 & 7168(0x1c00, float:1.0045E-41)
            if (r7 != 0) goto L_0x0065
            r7 = r18
            boolean r8 = r0.S(r7)
            if (r8 == 0) goto L_0x0077
            r8 = 2048(0x800, float:2.87E-42)
            goto L_0x0079
        L_0x0077:
            r8 = 1024(0x400, float:1.435E-42)
        L_0x0079:
            r4 = r4 | r8
        L_0x007a:
            r8 = r4 & 5851(0x16db, float:8.199E-42)
            r9 = 1170(0x492, float:1.64E-42)
            if (r8 != r9) goto L_0x008c
            boolean r8 = r0.i()
            if (r8 != 0) goto L_0x0087
            goto L_0x008c
        L_0x0087:
            r0.I()
            r4 = r7
            goto L_0x00bd
        L_0x008c:
            if (r6 == 0) goto L_0x0092
            k0.i$a r6 = k0.i.f23074a
            r14 = r6
            goto L_0x0093
        L_0x0092:
            r14 = r7
        L_0x0093:
            java.lang.String r6 = r15.getTitle()
            java.lang.String r8 = r15.getText()
            int r7 = io.intercom.android.sdk.R.drawable.intercom_messages_icon
            java.lang.Integer r9 = java.lang.Integer.valueOf(r7)
            io.intercom.android.sdk.m5.inbox.ui.InboxEmptyScreenKt$InboxEmptyScreen$1 r7 = new io.intercom.android.sdk.m5.inbox.ui.InboxEmptyScreenKt$InboxEmptyScreen$1
            r7.<init>(r2, r15, r3)
            r10 = 54
            r11 = 2045450098(0x79eb1772, float:1.5258316E35)
            r12 = 1
            g0.a r10 = g0.c.e(r11, r12, r7, r0, r10)
            int r4 = r4 >> 6
            r4 = r4 & 112(0x70, float:1.57E-43)
            r12 = r4 | 24576(0x6000, float:3.4438E-41)
            r13 = 0
            r7 = r14
            r11 = r0
            io.intercom.android.sdk.m5.components.EmptyStateKt.EmptyState(r6, r7, r8, r9, r10, r11, r12, r13)
            r4 = r14
        L_0x00bd:
            Y.Y0 r7 = r0.k()
            if (r7 == 0) goto L_0x00d5
            io.intercom.android.sdk.m5.inbox.ui.m r8 = new io.intercom.android.sdk.m5.inbox.ui.m
            r0 = r8
            r1 = r15
            r2 = r16
            r3 = r17
            r5 = r20
            r6 = r21
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r7.a(r8)
        L_0x00d5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: io.intercom.android.sdk.m5.inbox.ui.InboxEmptyScreenKt.InboxEmptyScreen(io.intercom.android.sdk.models.EmptyState, boolean, yf.a, k0.i, Y.m, int, int):void");
    }

    /* access modifiers changed from: private */
    public static final C6514M InboxEmptyScreen$lambda$0(EmptyState emptyState, boolean z10, C6787a aVar, i iVar, int i10, int i11, C1500m mVar, int i12) {
        C6496s.h(emptyState, "$emptyState");
        C6496s.h(aVar, "$onActionButtonClick");
        InboxEmptyScreen(emptyState, z10, aVar, iVar, mVar, M0.a(i10 | 1), i11);
        return C6514M.f71813a;
    }
}
