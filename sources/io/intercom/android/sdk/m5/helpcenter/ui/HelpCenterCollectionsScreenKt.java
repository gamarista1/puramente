package io.intercom.android.sdk.m5.helpcenter.ui;

import D.x;
import Y.A1;
import Y.C1500m;
import Y.M0;
import g0.c;
import io.intercom.android.sdk.m5.helpcenter.HelpCenterViewModel;
import io.intercom.android.sdk.m5.helpcenter.states.CollectionsRow;
import io.intercom.android.sdk.m5.helpcenter.states.CollectionsUiState;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import lf.C6514M;
import lf.C6535s;
import yf.C6798l;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aM\u0010\t\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00060\u00052\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00060\u0005H\u0001¢\u0006\u0004\b\t\u0010\n\u001a/\u0010\u000e\u001a\u00020\u0006*\u00020\u000b2\u0006\u0010\r\u001a\u00020\f2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00060\u0005H\u0002¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lio/intercom/android/sdk/m5/helpcenter/HelpCenterViewModel;", "viewModel", "", "", "collectionIds", "Lkotlin/Function1;", "Llf/M;", "onCollectionClick", "onAutoNavigateToCollection", "HelpCenterCollectionsScreen", "(Lio/intercom/android/sdk/m5/helpcenter/HelpCenterViewModel;Ljava/util/List;Lyf/l;Lyf/l;LY/m;I)V", "LD/x;", "Lio/intercom/android/sdk/m5/helpcenter/states/CollectionsUiState$Content;", "state", "helpCenterCollectionItems", "(LD/x;Lio/intercom/android/sdk/m5/helpcenter/states/CollectionsUiState$Content;Lyf/l;)V", "intercom-sdk-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class HelpCenterCollectionsScreenKt {
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v0, resolved type: yf.l} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void HelpCenterCollectionsScreen(io.intercom.android.sdk.m5.helpcenter.HelpCenterViewModel r18, java.util.List<java.lang.String> r19, yf.C6798l r20, yf.C6798l r21, Y.C1500m r22, int r23) {
        /*
            r1 = r18
            r2 = r19
            r3 = r20
            r4 = r21
            r5 = r23
            java.lang.String r0 = "viewModel"
            kotlin.jvm.internal.C6496s.h(r1, r0)
            java.lang.String r0 = "collectionIds"
            kotlin.jvm.internal.C6496s.h(r2, r0)
            java.lang.String r0 = "onCollectionClick"
            kotlin.jvm.internal.C6496s.h(r3, r0)
            java.lang.String r0 = "onAutoNavigateToCollection"
            kotlin.jvm.internal.C6496s.h(r4, r0)
            r0 = -1836627764(0xffffffff928748cc, float:-8.537644E-28)
            r6 = r22
            Y.m r0 = r6.h(r0)
            io.intercom.android.sdk.m5.helpcenter.ui.HelpCenterCollectionsScreenKt$HelpCenterCollectionsScreen$1 r6 = new io.intercom.android.sdk.m5.helpcenter.ui.HelpCenterCollectionsScreenKt$HelpCenterCollectionsScreen$1
            r7 = 0
            r6.<init>(r1, r2, r7)
            java.lang.String r8 = ""
            r9 = 70
            Y.P.g(r8, r6, r0, r9)
            io.intercom.android.sdk.m5.helpcenter.ui.HelpCenterCollectionsScreenKt$HelpCenterCollectionsScreen$2 r6 = new io.intercom.android.sdk.m5.helpcenter.ui.HelpCenterCollectionsScreenKt$HelpCenterCollectionsScreen$2
            r6.<init>(r1, r4, r7)
            Y.P.g(r8, r6, r0, r9)
            Xg.L r6 = r18.getCollectionsState()
            r8 = 8
            r9 = 1
            Y.A1 r6 = Y.p1.b(r6, r7, r0, r8, r9)
            k0.c$a r8 = k0.c.f23044a
            k0.c$b r11 = r8.g()
            k0.i$a r8 = k0.i.f23074a
            r10 = 0
            k0.i r7 = androidx.compose.foundation.layout.q.f(r8, r10, r9, r7)
            r8 = 2138903112(0x7f7d1248, float:3.363896E38)
            r0.T(r8)
            boolean r8 = r0.S(r6)
            r10 = r5 & 896(0x380, float:1.256E-42)
            r10 = r10 ^ 384(0x180, float:5.38E-43)
            r12 = 256(0x100, float:3.59E-43)
            if (r10 <= r12) goto L_0x006c
            boolean r10 = r0.S(r3)
            if (r10 != 0) goto L_0x0072
        L_0x006c:
            r10 = r5 & 384(0x180, float:5.38E-43)
            if (r10 != r12) goto L_0x0071
            goto L_0x0072
        L_0x0071:
            r9 = 0
        L_0x0072:
            r8 = r8 | r9
            java.lang.Object r9 = r0.A()
            if (r8 != 0) goto L_0x0081
            Y.m$a r8 = Y.C1500m.f10026a
            java.lang.Object r8 = r8.a()
            if (r9 != r8) goto L_0x0089
        L_0x0081:
            io.intercom.android.sdk.m5.helpcenter.ui.e r9 = new io.intercom.android.sdk.m5.helpcenter.ui.e
            r9.<init>(r6, r3)
            r0.r(r9)
        L_0x0089:
            r14 = r9
            yf.l r14 = (yf.C6798l) r14
            r0.M()
            r16 = 196614(0x30006, float:2.75515E-40)
            r17 = 222(0xde, float:3.11E-43)
            r8 = 0
            r9 = 0
            r10 = 0
            r12 = 0
            r13 = 0
            r15 = 0
            r6 = r7
            r7 = r8
            r8 = r9
            r9 = r10
            r10 = r12
            r12 = r13
            r13 = r15
            r15 = r0
            D.C1109b.a(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            Y.Y0 r6 = r0.k()
            if (r6 == 0) goto L_0x00be
            io.intercom.android.sdk.m5.helpcenter.ui.f r7 = new io.intercom.android.sdk.m5.helpcenter.ui.f
            r0 = r7
            r1 = r18
            r2 = r19
            r3 = r20
            r4 = r21
            r5 = r23
            r0.<init>(r1, r2, r3, r4, r5)
            r6.a(r7)
        L_0x00be:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: io.intercom.android.sdk.m5.helpcenter.ui.HelpCenterCollectionsScreenKt.HelpCenterCollectionsScreen(io.intercom.android.sdk.m5.helpcenter.HelpCenterViewModel, java.util.List, yf.l, yf.l, Y.m, int):void");
    }

    /* access modifiers changed from: private */
    public static final C6514M HelpCenterCollectionsScreen$lambda$1$lambda$0(A1 a12, C6798l lVar, x xVar) {
        C6496s.h(a12, "$state");
        C6496s.h(lVar, "$onCollectionClick");
        C6496s.h(xVar, "$this$LazyColumn");
        CollectionsUiState collectionsUiState = (CollectionsUiState) a12.getValue();
        if (C6496s.c(collectionsUiState, CollectionsUiState.Initial.INSTANCE) || C6496s.c(collectionsUiState, CollectionsUiState.Loading.INSTANCE)) {
            x.c(xVar, (Object) null, (Object) null, ComposableSingletons$HelpCenterCollectionsScreenKt.INSTANCE.m335getLambda1$intercom_sdk_base_release(), 3, (Object) null);
        } else if (collectionsUiState instanceof CollectionsUiState.Error) {
            x.c(xVar, (Object) null, (Object) null, c.c(1972516599, true, new HelpCenterCollectionsScreenKt$HelpCenterCollectionsScreen$3$1$1(collectionsUiState)), 3, (Object) null);
        } else if (collectionsUiState instanceof CollectionsUiState.Content) {
            CollectionsUiState.Content content = (CollectionsUiState.Content) collectionsUiState;
            if (content.getCollections().isEmpty()) {
                x.c(xVar, (Object) null, (Object) null, ComposableSingletons$HelpCenterCollectionsScreenKt.INSTANCE.m336getLambda2$intercom_sdk_base_release(), 3, (Object) null);
            } else {
                helpCenterCollectionItems(xVar, content, lVar);
            }
        } else {
            throw new C6535s();
        }
        return C6514M.f71813a;
    }

    /* access modifiers changed from: private */
    public static final C6514M HelpCenterCollectionsScreen$lambda$2(HelpCenterViewModel helpCenterViewModel, List list, C6798l lVar, C6798l lVar2, int i10, C1500m mVar, int i11) {
        C6496s.h(helpCenterViewModel, "$viewModel");
        C6496s.h(list, "$collectionIds");
        C6496s.h(lVar, "$onCollectionClick");
        C6496s.h(lVar2, "$onAutoNavigateToCollection");
        HelpCenterCollectionsScreen(helpCenterViewModel, list, lVar, lVar2, mVar, M0.a(i10 | 1));
        return C6514M.f71813a;
    }

    private static final void helpCenterCollectionItems(x xVar, CollectionsUiState.Content content, C6798l lVar) {
        x.c(xVar, (Object) null, (Object) null, c.c(-464708772, true, new HelpCenterCollectionsScreenKt$helpCenterCollectionItems$1(content)), 3, (Object) null);
        List<CollectionsRow> collections = content.getCollections();
        xVar.a(collections.size(), (C6798l) null, new HelpCenterCollectionsScreenKt$helpCenterCollectionItems$$inlined$itemsIndexed$default$2(collections), c.c(-1091073711, true, new HelpCenterCollectionsScreenKt$helpCenterCollectionItems$$inlined$itemsIndexed$default$3(collections, lVar)));
    }
}
