package io.intercom.android.sdk.m5.inbox.reducers;

import io.intercom.android.sdk.identity.AppConfig;
import io.intercom.android.sdk.utilities.extensions.AppConfigExtensionsKt;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import lf.C6514M;
import n3.C2331a;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a5\u0010\t\u001a\u00020\b*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0007\u001a\u00020\u0006H\u0001¢\u0006\u0004\b\t\u0010\n\u001a\u0013\u0010\f\u001a\u00020\u000b*\u00020\u0004H\u0002¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Ln3/a;", "Lio/intercom/android/sdk/models/Conversation;", "Lio/intercom/android/sdk/models/EmptyState;", "emptyState", "Lio/intercom/android/sdk/identity/AppConfig;", "appConfig", "", "navIcon", "Lio/intercom/android/sdk/m5/inbox/states/InboxUiState;", "reduceToInboxUiState", "(Ln3/a;Lio/intercom/android/sdk/models/EmptyState;Lio/intercom/android/sdk/identity/AppConfig;ILY/m;II)Lio/intercom/android/sdk/m5/inbox/states/InboxUiState;", "", "shouldShowSendMessageButton", "(Lio/intercom/android/sdk/identity/AppConfig;)Z", "intercom-sdk-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class InboxPagingItemsReducerKt {
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v1, resolved type: io.intercom.android.sdk.m5.inbox.states.InboxUiState$Content} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v2, resolved type: io.intercom.android.sdk.m5.inbox.states.InboxUiState$Initial} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v3, resolved type: io.intercom.android.sdk.m5.inbox.states.InboxUiState$Loading} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v4, resolved type: io.intercom.android.sdk.m5.inbox.states.InboxUiState$Empty} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v9, resolved type: io.intercom.android.sdk.m5.inbox.states.InboxUiState$Error} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v10, resolved type: io.intercom.android.sdk.m5.inbox.states.InboxUiState$Error} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v6, resolved type: io.intercom.android.sdk.m5.inbox.states.InboxUiState$Content} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v11, resolved type: io.intercom.android.sdk.m5.inbox.states.InboxUiState$Error} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v7, resolved type: io.intercom.android.sdk.m5.inbox.states.InboxUiState$Content} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v8, resolved type: io.intercom.android.sdk.m5.inbox.states.InboxUiState$Content} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v9, resolved type: io.intercom.android.sdk.m5.inbox.states.InboxUiState$Content} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v25, resolved type: io.intercom.android.sdk.m5.inbox.states.InboxUiState$Content} */
    /* JADX WARNING: type inference failed for: r0v20 */
    /* JADX WARNING: type inference failed for: r15v2, types: [io.intercom.android.sdk.m5.components.ErrorState$WithoutCTA] */
    /* JADX WARNING: type inference failed for: r7v8, types: [io.intercom.android.sdk.m5.components.ErrorState$WithCTA] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final io.intercom.android.sdk.m5.inbox.states.InboxUiState reduceToInboxUiState(n3.C2331a r21, io.intercom.android.sdk.models.EmptyState r22, io.intercom.android.sdk.identity.AppConfig r23, int r24, Y.C1500m r25, int r26, int r27) {
        /*
            r2 = r21
            r0 = r22
            r6 = r25
            java.lang.String r1 = "<this>"
            kotlin.jvm.internal.C6496s.h(r2, r1)
            java.lang.String r1 = "emptyState"
            kotlin.jvm.internal.C6496s.h(r0, r1)
            r1 = 886365946(0x34d4defa, float:3.9650314E-7)
            r6.T(r1)
            r1 = r27 & 2
            if (r1 == 0) goto L_0x0029
            io.intercom.android.sdk.Injector r1 = io.intercom.android.sdk.Injector.get()
            io.intercom.android.sdk.Provider r1 = r1.getAppConfigProvider()
            java.lang.Object r1 = r1.get()
            io.intercom.android.sdk.identity.AppConfig r1 = (io.intercom.android.sdk.identity.AppConfig) r1
            goto L_0x002b
        L_0x0029:
            r1 = r23
        L_0x002b:
            io.intercom.android.sdk.models.Space$Type r3 = io.intercom.android.sdk.models.Space.Type.MESSAGES
            java.lang.String r3 = r1.getSpaceLabelIfExists(r3)
            r4 = -261437153(0xfffffffff06ac91f, float:-2.9065053E29)
            r6.T(r4)
            if (r3 != 0) goto L_0x0040
            int r3 = io.intercom.android.sdk.R.string.intercom_messages_space_title
            r4 = 0
            java.lang.String r3 = M0.i.a(r3, r6, r4)
        L_0x0040:
            r9 = r3
            r25.M()
            io.intercom.android.sdk.ui.theme.IntercomTheme r3 = io.intercom.android.sdk.ui.theme.IntercomTheme.INSTANCE
            int r4 = io.intercom.android.sdk.ui.theme.IntercomTheme.$stable
            io.intercom.android.sdk.ui.theme.IntercomColors r5 = r3.getColors(r6, r4)
            long r7 = r5.m691getHeader0d7_KjU()
            io.intercom.android.sdk.ui.theme.IntercomColors r3 = r3.getColors(r6, r4)
            long r3 = r3.m697getOnHeader0d7_KjU()
            io.intercom.android.sdk.ui.common.IntercomTopBarState r5 = new io.intercom.android.sdk.ui.common.IntercomTopBarState
            java.lang.Integer r10 = java.lang.Integer.valueOf(r24)
            r0.x0 r11 = r0.C2544x0.k(r7)
            r0.x0 r12 = r0.C2544x0.k(r3)
            r14 = 36
            r15 = 0
            r3 = 0
            r13 = 0
            r7 = r5
            r8 = r10
            r10 = r3
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15)
            m3.q r3 = r21.h()
            int r3 = r3.size()
            if (r3 == 0) goto L_0x00d4
            boolean r3 = shouldShowSendMessageButton(r1)
            m3.g r0 = r21.i()
            m3.r r0 = r0.a()
            boolean r4 = r0 instanceof m3.r.b
            m3.g r0 = r21.i()
            m3.r r0 = r0.a()
            boolean r1 = r0 instanceof m3.r.a
            r7 = 0
            if (r1 == 0) goto L_0x0099
            m3.r$a r0 = (m3.r.a) r0
            goto L_0x009a
        L_0x0099:
            r0 = r7
        L_0x009a:
            if (r0 == 0) goto L_0x00c8
            java.lang.Throwable r0 = r0.b()
            boolean r0 = r0 instanceof java.io.IOException
            if (r0 == 0) goto L_0x00b7
            io.intercom.android.sdk.m5.components.ErrorState$WithCTA r0 = new io.intercom.android.sdk.m5.components.ErrorState$WithCTA
            Pe.a r12 = new Pe.a
            r12.<init>(r2)
            r13 = 15
            r14 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r7 = r0
            r7.<init>(r8, r9, r10, r11, r12, r13, r14)
            goto L_0x00c7
        L_0x00b7:
            io.intercom.android.sdk.m5.components.ErrorState$WithoutCTA r0 = new io.intercom.android.sdk.m5.components.ErrorState$WithoutCTA
            r19 = 7
            r20 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r15 = r0
            r15.<init>(r16, r17, r18, r19, r20)
        L_0x00c7:
            r7 = r0
        L_0x00c8:
            io.intercom.android.sdk.m5.inbox.states.InboxUiState$Content r8 = new io.intercom.android.sdk.m5.inbox.states.InboxUiState$Content
            r0 = r8
            r1 = r5
            r2 = r21
            r5 = r7
            r0.<init>(r1, r2, r3, r4, r5)
            goto L_0x014e
        L_0x00d4:
            m3.g r3 = r21.i()
            m3.r r3 = r3.d()
            boolean r3 = r3 instanceof m3.r.a
            if (r3 == 0) goto L_0x0121
            m3.g r0 = r21.i()
            m3.r r0 = r0.d()
            java.lang.String r1 = "null cannot be cast to non-null type androidx.paging.LoadState.Error"
            kotlin.jvm.internal.C6496s.f(r0, r1)
            m3.r$a r0 = (m3.r.a) r0
            java.lang.Throwable r0 = r0.b()
            boolean r0 = r0 instanceof java.io.IOException
            if (r0 == 0) goto L_0x0110
            io.intercom.android.sdk.m5.inbox.states.InboxUiState$Error r0 = new io.intercom.android.sdk.m5.inbox.states.InboxUiState$Error
            io.intercom.android.sdk.m5.components.ErrorState$WithCTA r1 = new io.intercom.android.sdk.m5.components.ErrorState$WithCTA
            Pe.b r12 = new Pe.b
            r12.<init>(r2)
            r13 = 15
            r14 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r7 = r1
            r7.<init>(r8, r9, r10, r11, r12, r13, r14)
            r0.<init>(r5, r1)
        L_0x010e:
            r8 = r0
            goto L_0x014e
        L_0x0110:
            io.intercom.android.sdk.m5.inbox.states.InboxUiState$Error r0 = new io.intercom.android.sdk.m5.inbox.states.InboxUiState$Error
            io.intercom.android.sdk.m5.components.ErrorState$WithoutCTA r1 = new io.intercom.android.sdk.m5.components.ErrorState$WithoutCTA
            r11 = 7
            r12 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r7 = r1
            r7.<init>(r8, r9, r10, r11, r12)
            r0.<init>(r5, r1)
            goto L_0x010e
        L_0x0121:
            io.intercom.android.sdk.models.EmptyState$Companion r3 = io.intercom.android.sdk.models.EmptyState.Companion
            io.intercom.android.sdk.models.EmptyState r3 = r3.getNULL()
            boolean r3 = kotlin.jvm.internal.C6496s.c(r0, r3)
            if (r3 != 0) goto L_0x0137
            io.intercom.android.sdk.m5.inbox.states.InboxUiState$Empty r8 = new io.intercom.android.sdk.m5.inbox.states.InboxUiState$Empty
            boolean r1 = shouldShowSendMessageButton(r1)
            r8.<init>(r5, r0, r1)
            goto L_0x014e
        L_0x0137:
            m3.g r0 = r21.i()
            m3.r r0 = r0.d()
            boolean r0 = r0 instanceof m3.r.b
            if (r0 == 0) goto L_0x0149
            io.intercom.android.sdk.m5.inbox.states.InboxUiState$Loading r8 = new io.intercom.android.sdk.m5.inbox.states.InboxUiState$Loading
            r8.<init>(r5)
            goto L_0x014e
        L_0x0149:
            io.intercom.android.sdk.m5.inbox.states.InboxUiState$Initial r8 = new io.intercom.android.sdk.m5.inbox.states.InboxUiState$Initial
            r8.<init>(r5)
        L_0x014e:
            r25.M()
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: io.intercom.android.sdk.m5.inbox.reducers.InboxPagingItemsReducerKt.reduceToInboxUiState(n3.a, io.intercom.android.sdk.models.EmptyState, io.intercom.android.sdk.identity.AppConfig, int, Y.m, int, int):io.intercom.android.sdk.m5.inbox.states.InboxUiState");
    }

    /* access modifiers changed from: private */
    public static final C6514M reduceToInboxUiState$lambda$1$lambda$0(C2331a aVar) {
        C6496s.h(aVar, "$this_reduceToInboxUiState");
        aVar.k();
        return C6514M.f71813a;
    }

    /* access modifiers changed from: private */
    public static final C6514M reduceToInboxUiState$lambda$2(C2331a aVar) {
        C6496s.h(aVar, "$this_reduceToInboxUiState");
        aVar.j();
        return C6514M.f71813a;
    }

    private static final boolean shouldShowSendMessageButton(AppConfig appConfig) {
        if (!AppConfigExtensionsKt.canStartNewConversation(appConfig) || appConfig.isHelpCenterRequireSearchEnabled()) {
            return false;
        }
        return true;
    }
}
