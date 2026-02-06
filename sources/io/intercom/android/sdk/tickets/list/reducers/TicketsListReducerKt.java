package io.intercom.android.sdk.tickets.list.reducers;

import io.intercom.android.sdk.Injector;
import io.intercom.android.sdk.identity.AppConfig;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import lf.C6514M;
import n3.C2331a;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a)\u0010\u0006\u001a\u00020\u0005*\b\u0012\u0004\u0012\u00020\u00010\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Ln3/a;", "Lio/intercom/android/sdk/tickets/list/ui/TicketRowData;", "Lkotlin/Function0;", "Lio/intercom/android/sdk/identity/AppConfig;", "config", "Lio/intercom/android/sdk/tickets/list/data/TicketsScreenUiState;", "reduceToTicketsScreenUiState", "(Ln3/a;Lyf/a;LY/m;II)Lio/intercom/android/sdk/tickets/list/data/TicketsScreenUiState;", "intercom-sdk-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class TicketsListReducerKt {
    /* JADX WARNING: type inference failed for: r4v21 */
    /* JADX WARNING: type inference failed for: r13v1, types: [io.intercom.android.sdk.m5.components.ErrorState$WithoutCTA] */
    /* JADX WARNING: type inference failed for: r5v7, types: [io.intercom.android.sdk.m5.components.ErrorState$WithCTA] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final io.intercom.android.sdk.tickets.list.data.TicketsScreenUiState reduceToTicketsScreenUiState(n3.C2331a r19, yf.C6787a r20, Y.C1500m r21, int r22, int r23) {
        /*
            r0 = r19
            r1 = r21
            java.lang.String r2 = "<this>"
            kotlin.jvm.internal.C6496s.h(r0, r2)
            r2 = -356015290(0xffffffffeac7a346, float:-1.2067364E26)
            r1.T(r2)
            r2 = r23 & 1
            if (r2 == 0) goto L_0x0019
            Se.a r2 = new Se.a
            r2.<init>()
            goto L_0x001b
        L_0x0019:
            r2 = r20
        L_0x001b:
            java.lang.Object r2 = r2.invoke()
            io.intercom.android.sdk.identity.AppConfig r2 = (io.intercom.android.sdk.identity.AppConfig) r2
            io.intercom.android.sdk.models.Space$Type r3 = io.intercom.android.sdk.models.Space.Type.TICKETS
            java.lang.String r2 = r2.getSpaceLabelIfExists(r3)
            r3 = -374395883(0xffffffffe9af2c15, float:-2.6471274E25)
            r1.T(r3)
            r3 = 0
            if (r2 != 0) goto L_0x0036
            int r2 = io.intercom.android.sdk.R.string.intercom_tickets_space_title
            java.lang.String r2 = M0.i.a(r2, r1, r3)
        L_0x0036:
            r21.M()
            m3.q r4 = r19.h()
            int r4 = r4.size()
            if (r4 == 0) goto L_0x0092
            m3.g r3 = r19.i()
            m3.r r3 = r3.a()
            boolean r3 = r3 instanceof m3.r.b
            m3.g r4 = r19.i()
            m3.r r4 = r4.a()
            boolean r5 = r4 instanceof m3.r.a
            r6 = 0
            if (r5 == 0) goto L_0x005d
            m3.r$a r4 = (m3.r.a) r4
            goto L_0x005e
        L_0x005d:
            r4 = r6
        L_0x005e:
            if (r4 == 0) goto L_0x008b
            java.lang.Throwable r4 = r4.b()
            boolean r4 = r4 instanceof java.io.IOException
            if (r4 == 0) goto L_0x007c
            io.intercom.android.sdk.m5.components.ErrorState$WithCTA r4 = new io.intercom.android.sdk.m5.components.ErrorState$WithCTA
            Se.b r10 = new Se.b
            r10.<init>(r0)
            r11 = 15
            r12 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r5 = r4
            r5.<init>(r6, r7, r8, r9, r10, r11, r12)
        L_0x007a:
            r6 = r4
            goto L_0x008b
        L_0x007c:
            io.intercom.android.sdk.m5.components.ErrorState$WithoutCTA r4 = new io.intercom.android.sdk.m5.components.ErrorState$WithoutCTA
            r17 = 7
            r18 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r13 = r4
            r13.<init>(r14, r15, r16, r17, r18)
            goto L_0x007a
        L_0x008b:
            io.intercom.android.sdk.tickets.list.data.TicketsScreenUiState$Content r4 = new io.intercom.android.sdk.tickets.list.data.TicketsScreenUiState$Content
            r4.<init>(r0, r3, r6, r2)
            goto L_0x0116
        L_0x0092:
            m3.g r4 = r19.i()
            m3.r r4 = r4.d()
            boolean r4 = r4 instanceof m3.r.a
            if (r4 == 0) goto L_0x00ea
            m3.g r3 = r19.i()
            m3.r r3 = r3.d()
            java.lang.String r4 = "null cannot be cast to non-null type androidx.paging.LoadState.Error"
            kotlin.jvm.internal.C6496s.f(r3, r4)
            m3.r$a r3 = (m3.r.a) r3
            java.lang.Throwable r3 = r3.b()
            boolean r3 = r3 instanceof java.io.IOException
            if (r3 == 0) goto L_0x00d3
            io.intercom.android.sdk.tickets.list.data.TicketsScreenUiState$Error r3 = new io.intercom.android.sdk.tickets.list.data.TicketsScreenUiState$Error
            io.intercom.android.sdk.m5.components.ErrorState$WithCTA r12 = new io.intercom.android.sdk.m5.components.ErrorState$WithCTA
            int r4 = io.intercom.android.sdk.R.string.intercom_failed_to_load_tickets
            java.lang.Integer r7 = java.lang.Integer.valueOf(r4)
            Se.c r9 = new Se.c
            r9.<init>(r0)
            r10 = 11
            r11 = 0
            r5 = 0
            r6 = 0
            r8 = 0
            r4 = r12
            r4.<init>(r5, r6, r7, r8, r9, r10, r11)
            r3.<init>(r12, r2)
            r4 = r3
            goto L_0x0116
        L_0x00d3:
            io.intercom.android.sdk.tickets.list.data.TicketsScreenUiState$Error r0 = new io.intercom.android.sdk.tickets.list.data.TicketsScreenUiState$Error
            io.intercom.android.sdk.m5.components.ErrorState$WithoutCTA r9 = new io.intercom.android.sdk.m5.components.ErrorState$WithoutCTA
            int r3 = io.intercom.android.sdk.R.string.intercom_failed_to_load_tickets
            java.lang.Integer r6 = java.lang.Integer.valueOf(r3)
            r7 = 3
            r8 = 0
            r4 = 0
            r5 = 0
            r3 = r9
            r3.<init>(r4, r5, r6, r7, r8)
            r0.<init>(r9, r2)
            r4 = r0
            goto L_0x0116
        L_0x00ea:
            m3.g r0 = r19.i()
            m3.r r0 = r0.d()
            boolean r0 = r0 instanceof m3.r.b
            if (r0 == 0) goto L_0x00fc
            io.intercom.android.sdk.tickets.list.data.TicketsScreenUiState$Initial r4 = new io.intercom.android.sdk.tickets.list.data.TicketsScreenUiState$Initial
            r4.<init>(r2)
            goto L_0x0116
        L_0x00fc:
            io.intercom.android.sdk.tickets.list.data.TicketsScreenUiState$Empty r4 = new io.intercom.android.sdk.tickets.list.data.TicketsScreenUiState$Empty
            io.intercom.android.sdk.models.EmptyState r0 = new io.intercom.android.sdk.models.EmptyState
            int r5 = io.intercom.android.sdk.R.string.intercom_tickets_empty_state_title
            java.lang.String r6 = M0.i.a(r5, r1, r3)
            int r5 = io.intercom.android.sdk.R.string.intercom_tickets_empty_state_text
            java.lang.String r7 = M0.i.a(r5, r1, r3)
            r9 = 4
            r10 = 0
            r8 = 0
            r5 = r0
            r5.<init>(r6, r7, r8, r9, r10)
            r4.<init>(r0, r2)
        L_0x0116:
            r21.M()
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: io.intercom.android.sdk.tickets.list.reducers.TicketsListReducerKt.reduceToTicketsScreenUiState(n3.a, yf.a, Y.m, int, int):io.intercom.android.sdk.tickets.list.data.TicketsScreenUiState");
    }

    /* access modifiers changed from: private */
    public static final AppConfig reduceToTicketsScreenUiState$lambda$0() {
        return Injector.get().getAppConfigProvider().get();
    }

    /* access modifiers changed from: private */
    public static final C6514M reduceToTicketsScreenUiState$lambda$2$lambda$1(C2331a aVar) {
        C6496s.h(aVar, "$this_reduceToTicketsScreenUiState");
        aVar.k();
        return C6514M.f71813a;
    }

    /* access modifiers changed from: private */
    public static final C6514M reduceToTicketsScreenUiState$lambda$3(C2331a aVar) {
        C6496s.h(aVar, "$this_reduceToTicketsScreenUiState");
        aVar.j();
        return C6514M.f71813a;
    }
}
