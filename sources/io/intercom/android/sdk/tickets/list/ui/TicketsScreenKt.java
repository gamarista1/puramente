package io.intercom.android.sdk.tickets.list.ui;

import C.N;
import D.x;
import Y.C1500m;
import Y.M0;
import g0.c;
import io.intercom.android.sdk.m5.components.ErrorState;
import io.intercom.android.sdk.tickets.list.data.TicketsScreenUiState;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import lf.C6514M;
import yf.C6787a;
import yf.C6798l;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001aE\u0010\n\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00030\u00052\b\b\u0001\u0010\t\u001a\u00020\bH\u0001¢\u0006\u0004\b\n\u0010\u000b\u001a5\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\r2\u0014\b\u0002\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00030\u0005H\u0001¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lio/intercom/android/sdk/tickets/list/data/TicketsScreenUiState;", "uiState", "Lkotlin/Function0;", "Llf/M;", "onBackButtonClick", "Lkotlin/Function1;", "", "onTicketClick", "", "navIcon", "TicketsScreen", "(Lio/intercom/android/sdk/tickets/list/data/TicketsScreenUiState;Lyf/a;Lyf/l;ILY/m;II)V", "Lio/intercom/android/sdk/tickets/list/data/TicketsScreenUiState$Content;", "LC/N;", "paddingValues", "onClick", "TicketsScreenContent", "(Lio/intercom/android/sdk/tickets/list/data/TicketsScreenUiState$Content;LC/N;Lyf/l;LY/m;II)V", "intercom-sdk-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class TicketsScreenKt {
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0068  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x006b  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0088  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x008d  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00f2  */
    /* JADX WARNING: Removed duplicated region for block: B:55:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void TicketsScreen(io.intercom.android.sdk.tickets.list.data.TicketsScreenUiState r21, yf.C6787a r22, yf.C6798l r23, int r24, Y.C1500m r25, int r26, int r27) {
        /*
            r1 = r21
            r2 = r22
            r4 = r24
            r5 = r26
            java.lang.String r0 = "uiState"
            kotlin.jvm.internal.C6496s.h(r1, r0)
            java.lang.String r0 = "onBackButtonClick"
            kotlin.jvm.internal.C6496s.h(r2, r0)
            r0 = -1552213693(0xffffffffa37b1943, float:-1.3612087E-17)
            r3 = r25
            Y.m r0 = r3.h(r0)
            r3 = r27 & 1
            if (r3 == 0) goto L_0x0022
            r3 = r5 | 6
            goto L_0x0032
        L_0x0022:
            r3 = r5 & 14
            if (r3 != 0) goto L_0x0031
            boolean r3 = r0.S(r1)
            if (r3 == 0) goto L_0x002e
            r3 = 4
            goto L_0x002f
        L_0x002e:
            r3 = 2
        L_0x002f:
            r3 = r3 | r5
            goto L_0x0032
        L_0x0031:
            r3 = r5
        L_0x0032:
            r6 = r27 & 2
            if (r6 == 0) goto L_0x0039
            r3 = r3 | 48
            goto L_0x0049
        L_0x0039:
            r6 = r5 & 112(0x70, float:1.57E-43)
            if (r6 != 0) goto L_0x0049
            boolean r6 = r0.C(r2)
            if (r6 == 0) goto L_0x0046
            r6 = 32
            goto L_0x0048
        L_0x0046:
            r6 = 16
        L_0x0048:
            r3 = r3 | r6
        L_0x0049:
            r6 = r27 & 4
            if (r6 == 0) goto L_0x0052
            r3 = r3 | 384(0x180, float:5.38E-43)
        L_0x004f:
            r7 = r23
            goto L_0x0064
        L_0x0052:
            r7 = r5 & 896(0x380, float:1.256E-42)
            if (r7 != 0) goto L_0x004f
            r7 = r23
            boolean r8 = r0.C(r7)
            if (r8 == 0) goto L_0x0061
            r8 = 256(0x100, float:3.59E-43)
            goto L_0x0063
        L_0x0061:
            r8 = 128(0x80, float:1.794E-43)
        L_0x0063:
            r3 = r3 | r8
        L_0x0064:
            r8 = r27 & 8
            if (r8 == 0) goto L_0x006b
            r3 = r3 | 3072(0xc00, float:4.305E-42)
            goto L_0x007b
        L_0x006b:
            r8 = r5 & 7168(0x1c00, float:1.0045E-41)
            if (r8 != 0) goto L_0x007b
            boolean r8 = r0.d(r4)
            if (r8 == 0) goto L_0x0078
            r8 = 2048(0x800, float:2.87E-42)
            goto L_0x007a
        L_0x0078:
            r8 = 1024(0x400, float:1.435E-42)
        L_0x007a:
            r3 = r3 | r8
        L_0x007b:
            r3 = r3 & 5851(0x16db, float:8.199E-42)
            r8 = 1170(0x492, float:1.64E-42)
            if (r3 != r8) goto L_0x008d
            boolean r3 = r0.i()
            if (r3 != 0) goto L_0x0088
            goto L_0x008d
        L_0x0088:
            r0.I()
            r3 = r7
            goto L_0x00ec
        L_0x008d:
            if (r6 == 0) goto L_0x0095
            io.intercom.android.sdk.tickets.list.ui.n r3 = new io.intercom.android.sdk.tickets.list.ui.n
            r3.<init>()
            goto L_0x0096
        L_0x0095:
            r3 = r7
        L_0x0096:
            k0.i$a r6 = k0.i.f23074a
            io.intercom.android.sdk.ui.theme.IntercomTheme r7 = io.intercom.android.sdk.ui.theme.IntercomTheme.INSTANCE
            int r8 = io.intercom.android.sdk.ui.theme.IntercomTheme.$stable
            io.intercom.android.sdk.ui.theme.IntercomColors r7 = r7.getColors(r0, r8)
            long r7 = r7.m678getBackground0d7_KjU()
            r10 = 2
            r11 = 0
            r9 = 0
            k0.i r6 = androidx.compose.foundation.b.d(r6, r7, r9, r10, r11)
            C.f0$a r7 = C.f0.f925a
            r8 = 8
            C.f0 r7 = C.l0.b(r7, r0, r8)
            k0.i r6 = C.i0.d(r6, r7)
            java.lang.String r7 = "tickets_screen"
            k0.i r6 = androidx.compose.ui.platform.n1.a(r6, r7)
            io.intercom.android.sdk.tickets.list.ui.TicketsScreenKt$TicketsScreen$2 r7 = new io.intercom.android.sdk.tickets.list.ui.TicketsScreenKt$TicketsScreen$2
            r7.<init>(r1, r2, r4)
            r8 = -1473942521(0xffffffffa8256c07, float:-9.182765E-15)
            r9 = 1
            r10 = 54
            g0.a r7 = g0.c.e(r8, r9, r7, r0, r10)
            io.intercom.android.sdk.tickets.list.ui.TicketsScreenKt$TicketsScreen$3 r8 = new io.intercom.android.sdk.tickets.list.ui.TicketsScreenKt$TicketsScreen$3
            r8.<init>(r1, r3)
            r11 = -1690440366(0xffffffff9b3ded52, float:-1.5710396E-22)
            g0.a r17 = g0.c.e(r11, r9, r8, r0, r10)
            r19 = 805306416(0x30000030, float:4.6566395E-10)
            r20 = 508(0x1fc, float:7.12E-43)
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r14 = 0
            r16 = 0
            r18 = r0
            V.C1415x0.a(r6, r7, r8, r9, r10, r11, r12, r14, r16, r17, r18, r19, r20)
        L_0x00ec:
            Y.Y0 r7 = r0.k()
            if (r7 == 0) goto L_0x0105
            io.intercom.android.sdk.tickets.list.ui.o r8 = new io.intercom.android.sdk.tickets.list.ui.o
            r0 = r8
            r1 = r21
            r2 = r22
            r4 = r24
            r5 = r26
            r6 = r27
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r7.a(r8)
        L_0x0105:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: io.intercom.android.sdk.tickets.list.ui.TicketsScreenKt.TicketsScreen(io.intercom.android.sdk.tickets.list.data.TicketsScreenUiState, yf.a, yf.l, int, Y.m, int, int):void");
    }

    /* access modifiers changed from: private */
    public static final C6514M TicketsScreen$lambda$0(String str) {
        C6496s.h(str, "it");
        return C6514M.f71813a;
    }

    /* access modifiers changed from: private */
    public static final C6514M TicketsScreen$lambda$1(TicketsScreenUiState ticketsScreenUiState, C6787a aVar, C6798l lVar, int i10, int i11, int i12, C1500m mVar, int i13) {
        C6496s.h(ticketsScreenUiState, "$uiState");
        C6496s.h(aVar, "$onBackButtonClick");
        TicketsScreen(ticketsScreenUiState, aVar, lVar, i10, mVar, M0.a(i11 | 1), i12);
        return C6514M.f71813a;
    }

    /* JADX WARNING: Removed duplicated region for block: B:36:0x006f  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0074  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00ae  */
    /* JADX WARNING: Removed duplicated region for block: B:45:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void TicketsScreenContent(io.intercom.android.sdk.tickets.list.data.TicketsScreenUiState.Content r18, C.N r19, yf.C6798l r20, Y.C1500m r21, int r22, int r23) {
        /*
            r1 = r18
            r14 = r19
            r15 = r22
            java.lang.String r0 = "uiState"
            kotlin.jvm.internal.C6496s.h(r1, r0)
            java.lang.String r0 = "paddingValues"
            kotlin.jvm.internal.C6496s.h(r14, r0)
            r0 = -1912868973(0xffffffff8dfbef93, float:-1.5526745E-30)
            r2 = r21
            Y.m r0 = r2.h(r0)
            r2 = r23 & 1
            if (r2 == 0) goto L_0x0020
            r2 = r15 | 6
            goto L_0x0030
        L_0x0020:
            r2 = r15 & 14
            if (r2 != 0) goto L_0x002f
            boolean r2 = r0.S(r1)
            if (r2 == 0) goto L_0x002c
            r2 = 4
            goto L_0x002d
        L_0x002c:
            r2 = 2
        L_0x002d:
            r2 = r2 | r15
            goto L_0x0030
        L_0x002f:
            r2 = r15
        L_0x0030:
            r3 = r23 & 2
            if (r3 == 0) goto L_0x0037
            r2 = r2 | 48
            goto L_0x0047
        L_0x0037:
            r3 = r15 & 112(0x70, float:1.57E-43)
            if (r3 != 0) goto L_0x0047
            boolean r3 = r0.S(r14)
            if (r3 == 0) goto L_0x0044
            r3 = 32
            goto L_0x0046
        L_0x0044:
            r3 = 16
        L_0x0046:
            r2 = r2 | r3
        L_0x0047:
            r3 = r23 & 4
            if (r3 == 0) goto L_0x0050
            r2 = r2 | 384(0x180, float:5.38E-43)
        L_0x004d:
            r4 = r20
            goto L_0x0062
        L_0x0050:
            r4 = r15 & 896(0x380, float:1.256E-42)
            if (r4 != 0) goto L_0x004d
            r4 = r20
            boolean r5 = r0.C(r4)
            if (r5 == 0) goto L_0x005f
            r5 = 256(0x100, float:3.59E-43)
            goto L_0x0061
        L_0x005f:
            r5 = 128(0x80, float:1.794E-43)
        L_0x0061:
            r2 = r2 | r5
        L_0x0062:
            r5 = r2 & 731(0x2db, float:1.024E-42)
            r6 = 146(0x92, float:2.05E-43)
            if (r5 != r6) goto L_0x0074
            boolean r5 = r0.i()
            if (r5 != 0) goto L_0x006f
            goto L_0x0074
        L_0x006f:
            r0.I()
            r3 = r4
            goto L_0x00a8
        L_0x0074:
            if (r3 == 0) goto L_0x007d
            io.intercom.android.sdk.tickets.list.ui.k r3 = new io.intercom.android.sdk.tickets.list.ui.k
            r3.<init>()
            r13 = r3
            goto L_0x007e
        L_0x007d:
            r13 = r4
        L_0x007e:
            k0.i$a r3 = k0.i.f23074a
            r4 = 0
            r5 = 0
            r6 = 1
            k0.i r3 = androidx.compose.foundation.layout.q.f(r3, r4, r6, r5)
            io.intercom.android.sdk.tickets.list.ui.l r10 = new io.intercom.android.sdk.tickets.list.ui.l
            r10.<init>(r1, r13)
            int r2 = r2 << 3
            r2 = r2 & 896(0x380, float:1.256E-42)
            r12 = r2 | 6
            r16 = 250(0xfa, float:3.5E-43)
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r2 = r3
            r3 = r4
            r4 = r19
            r11 = r0
            r17 = r13
            r13 = r16
            D.C1109b.a(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            r3 = r17
        L_0x00a8:
            Y.Y0 r6 = r0.k()
            if (r6 == 0) goto L_0x00bf
            io.intercom.android.sdk.tickets.list.ui.m r7 = new io.intercom.android.sdk.tickets.list.ui.m
            r0 = r7
            r1 = r18
            r2 = r19
            r4 = r22
            r5 = r23
            r0.<init>(r1, r2, r3, r4, r5)
            r6.a(r7)
        L_0x00bf:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: io.intercom.android.sdk.tickets.list.ui.TicketsScreenKt.TicketsScreenContent(io.intercom.android.sdk.tickets.list.data.TicketsScreenUiState$Content, C.N, yf.l, Y.m, int, int):void");
    }

    /* access modifiers changed from: private */
    public static final C6514M TicketsScreenContent$lambda$2(String str) {
        C6496s.h(str, "it");
        return C6514M.f71813a;
    }

    /* access modifiers changed from: private */
    public static final C6514M TicketsScreenContent$lambda$3(TicketsScreenUiState.Content content, C6798l lVar, x xVar) {
        C6496s.h(content, "$uiState");
        C6496s.h(xVar, "$this$LazyColumn");
        x.e(xVar, content.getLazyPagingTickets().g(), (C6798l) null, (C6798l) null, c.c(-683737040, true, new TicketsScreenKt$TicketsScreenContent$2$1(content, lVar)), 6, (Object) null);
        ErrorState errorState = content.getErrorState();
        if (errorState != null) {
            x.c(xVar, (Object) null, (Object) null, c.c(1834539240, true, new TicketsScreenKt$TicketsScreenContent$2$2(errorState)), 3, (Object) null);
        }
        if (content.isLoadingMore()) {
            x.c(xVar, (Object) null, (Object) null, ComposableSingletons$TicketsScreenKt.INSTANCE.m557getLambda1$intercom_sdk_base_release(), 3, (Object) null);
        }
        return C6514M.f71813a;
    }

    /* access modifiers changed from: private */
    public static final C6514M TicketsScreenContent$lambda$4(TicketsScreenUiState.Content content, N n10, C6798l lVar, int i10, int i11, C1500m mVar, int i12) {
        C6496s.h(content, "$uiState");
        C6496s.h(n10, "$paddingValues");
        TicketsScreenContent(content, n10, lVar, mVar, M0.a(i10 | 1), i11);
        return C6514M.f71813a;
    }
}
