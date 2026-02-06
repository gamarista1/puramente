package io.intercom.android.sdk.m5.helpcenter.ui;

import D.x;
import Y.A1;
import Y.C1500m;
import Y.M0;
import g0.c;
import io.intercom.android.sdk.m5.helpcenter.HelpCenterViewModel;
import io.intercom.android.sdk.m5.helpcenter.states.CollectionDetailsRow;
import io.intercom.android.sdk.m5.helpcenter.states.CollectionDetailsUiState;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import lf.C6514M;
import lf.C6535s;
import mf.C6565s;
import yf.C6798l;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aI\u0010\b\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u00042\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u0004H\u0001¢\u0006\u0004\b\b\u0010\t\u001aC\u0010\r\u001a\u00020\u0005*\u00020\n2\u0006\u0010\f\u001a\u00020\u000b2\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u00042\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u0004H\u0002¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lio/intercom/android/sdk/m5/helpcenter/HelpCenterViewModel;", "viewModel", "", "collectionId", "Lkotlin/Function1;", "Llf/M;", "onArticleClicked", "onCollectionClicked", "HelpCenterCollectionDetailsScreen", "(Lio/intercom/android/sdk/m5/helpcenter/HelpCenterViewModel;Ljava/lang/String;Lyf/l;Lyf/l;LY/m;II)V", "LD/x;", "Lio/intercom/android/sdk/m5/helpcenter/states/CollectionDetailsUiState$Content;", "state", "helpCenterSectionItems", "(LD/x;Lio/intercom/android/sdk/m5/helpcenter/states/CollectionDetailsUiState$Content;Lyf/l;Lyf/l;)V", "intercom-sdk-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class HelpCenterCollectionDetailsScreenKt {
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v0, resolved type: yf.l} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void HelpCenterCollectionDetailsScreen(io.intercom.android.sdk.m5.helpcenter.HelpCenterViewModel r18, java.lang.String r19, yf.C6798l r20, yf.C6798l r21, Y.C1500m r22, int r23, int r24) {
        /*
            r1 = r18
            r2 = r19
            r4 = r21
            r5 = r23
            java.lang.String r0 = "viewModel"
            kotlin.jvm.internal.C6496s.h(r1, r0)
            java.lang.String r0 = "collectionId"
            kotlin.jvm.internal.C6496s.h(r2, r0)
            java.lang.String r0 = "onCollectionClicked"
            kotlin.jvm.internal.C6496s.h(r4, r0)
            r0 = -1331499807(0xffffffffb0a2ece1, float:-1.1854376E-9)
            r3 = r22
            Y.m r0 = r3.h(r0)
            r3 = r24 & 4
            if (r3 == 0) goto L_0x002a
            io.intercom.android.sdk.m5.helpcenter.ui.b r3 = new io.intercom.android.sdk.m5.helpcenter.ui.b
            r3.<init>()
            goto L_0x002c
        L_0x002a:
            r3 = r20
        L_0x002c:
            io.intercom.android.sdk.m5.helpcenter.ui.HelpCenterCollectionDetailsScreenKt$HelpCenterCollectionDetailsScreen$2 r6 = new io.intercom.android.sdk.m5.helpcenter.ui.HelpCenterCollectionDetailsScreenKt$HelpCenterCollectionDetailsScreen$2
            r7 = 0
            r6.<init>(r1, r2, r7)
            r8 = 70
            java.lang.String r9 = ""
            Y.P.g(r9, r6, r0, r8)
            Xg.L r6 = r18.getCollectionDetailsState()
            r8 = 8
            r9 = 1
            Y.A1 r6 = Y.p1.b(r6, r7, r0, r8, r9)
            k0.c$a r8 = k0.c.f23044a
            k0.c$b r11 = r8.g()
            k0.i$a r8 = k0.i.f23074a
            r10 = 0
            k0.i r7 = androidx.compose.foundation.layout.q.f(r8, r10, r9, r7)
            r8 = -1710791525(0xffffffff9a07649b, float:-2.7998614E-23)
            r0.T(r8)
            boolean r8 = r0.S(r6)
            r10 = r5 & 896(0x380, float:1.256E-42)
            r10 = r10 ^ 384(0x180, float:5.38E-43)
            r12 = 0
            r13 = 256(0x100, float:3.59E-43)
            if (r10 <= r13) goto L_0x006a
            boolean r10 = r0.S(r3)
            if (r10 != 0) goto L_0x006e
        L_0x006a:
            r10 = r5 & 384(0x180, float:5.38E-43)
            if (r10 != r13) goto L_0x0070
        L_0x006e:
            r10 = r9
            goto L_0x0071
        L_0x0070:
            r10 = r12
        L_0x0071:
            r8 = r8 | r10
            r10 = r5 & 7168(0x1c00, float:1.0045E-41)
            r10 = r10 ^ 3072(0xc00, float:4.305E-42)
            r13 = 2048(0x800, float:2.87E-42)
            if (r10 <= r13) goto L_0x0080
            boolean r10 = r0.S(r4)
            if (r10 != 0) goto L_0x0086
        L_0x0080:
            r10 = r5 & 3072(0xc00, float:4.305E-42)
            if (r10 != r13) goto L_0x0085
            goto L_0x0086
        L_0x0085:
            r9 = r12
        L_0x0086:
            r8 = r8 | r9
            java.lang.Object r9 = r0.A()
            if (r8 != 0) goto L_0x0095
            Y.m$a r8 = Y.C1500m.f10026a
            java.lang.Object r8 = r8.a()
            if (r9 != r8) goto L_0x009d
        L_0x0095:
            io.intercom.android.sdk.m5.helpcenter.ui.c r9 = new io.intercom.android.sdk.m5.helpcenter.ui.c
            r9.<init>(r6, r3, r4)
            r0.r(r9)
        L_0x009d:
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
            Y.Y0 r7 = r0.k()
            if (r7 == 0) goto L_0x00d2
            io.intercom.android.sdk.m5.helpcenter.ui.d r8 = new io.intercom.android.sdk.m5.helpcenter.ui.d
            r0 = r8
            r1 = r18
            r2 = r19
            r4 = r21
            r5 = r23
            r6 = r24
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r7.a(r8)
        L_0x00d2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: io.intercom.android.sdk.m5.helpcenter.ui.HelpCenterCollectionDetailsScreenKt.HelpCenterCollectionDetailsScreen(io.intercom.android.sdk.m5.helpcenter.HelpCenterViewModel, java.lang.String, yf.l, yf.l, Y.m, int, int):void");
    }

    /* access modifiers changed from: private */
    public static final C6514M HelpCenterCollectionDetailsScreen$lambda$0(String str) {
        C6496s.h(str, "it");
        return C6514M.f71813a;
    }

    /* access modifiers changed from: private */
    public static final C6514M HelpCenterCollectionDetailsScreen$lambda$2$lambda$1(A1 a12, C6798l lVar, C6798l lVar2, x xVar) {
        C6496s.h(a12, "$state");
        C6496s.h(lVar2, "$onCollectionClicked");
        C6496s.h(xVar, "$this$LazyColumn");
        CollectionDetailsUiState collectionDetailsUiState = (CollectionDetailsUiState) a12.getValue();
        if (C6496s.c(collectionDetailsUiState, CollectionDetailsUiState.Initial.INSTANCE) || C6496s.c(collectionDetailsUiState, CollectionDetailsUiState.Loading.INSTANCE)) {
            x.c(xVar, (Object) null, (Object) null, ComposableSingletons$HelpCenterCollectionDetailsScreenKt.INSTANCE.m332getLambda1$intercom_sdk_base_release(), 3, (Object) null);
        } else if (collectionDetailsUiState instanceof CollectionDetailsUiState.Error) {
            x.c(xVar, (Object) null, (Object) null, c.c(-1898957876, true, new HelpCenterCollectionDetailsScreenKt$HelpCenterCollectionDetailsScreen$3$1$1(collectionDetailsUiState)), 3, (Object) null);
        } else if (collectionDetailsUiState instanceof CollectionDetailsUiState.Content) {
            CollectionDetailsUiState.Content content = (CollectionDetailsUiState.Content) collectionDetailsUiState;
            if (content.getCollectionDetailsRows().isEmpty()) {
                x.c(xVar, (Object) null, (Object) null, ComposableSingletons$HelpCenterCollectionDetailsScreenKt.INSTANCE.m333getLambda2$intercom_sdk_base_release(), 3, (Object) null);
            } else {
                helpCenterSectionItems(xVar, content, lVar, lVar2);
            }
        } else {
            throw new C6535s();
        }
        return C6514M.f71813a;
    }

    /* access modifiers changed from: private */
    public static final C6514M HelpCenterCollectionDetailsScreen$lambda$3(HelpCenterViewModel helpCenterViewModel, String str, C6798l lVar, C6798l lVar2, int i10, int i11, C1500m mVar, int i12) {
        C6496s.h(helpCenterViewModel, "$viewModel");
        C6496s.h(str, "$collectionId");
        C6496s.h(lVar2, "$onCollectionClicked");
        HelpCenterCollectionDetailsScreen(helpCenterViewModel, str, lVar, lVar2, mVar, M0.a(i10 | 1), i11);
        return C6514M.f71813a;
    }

    private static final void helpCenterSectionItems(x xVar, CollectionDetailsUiState.Content content, C6798l lVar, C6798l lVar2) {
        x.c(xVar, (Object) null, (Object) null, c.c(1491252145, true, new HelpCenterCollectionDetailsScreenKt$helpCenterSectionItems$1(content)), 3, (Object) null);
        List<CollectionDetailsRow> collectionDetailsRows = content.getCollectionDetailsRows();
        int i10 = 0;
        for (Object next : collectionDetailsRows) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                C6565s.x();
            }
            CollectionDetailsRow collectionDetailsRow = (CollectionDetailsRow) next;
            if (collectionDetailsRow instanceof CollectionDetailsRow.ArticleRow) {
                x.c(xVar, (Object) null, (Object) null, c.c(-103698696, true, new HelpCenterCollectionDetailsScreenKt$helpCenterSectionItems$2$1(i10, collectionDetailsRow, lVar, collectionDetailsRows)), 3, (Object) null);
            } else if (C6496s.c(collectionDetailsRow, CollectionDetailsRow.FullHelpCenterRow.INSTANCE)) {
                x.c(xVar, (Object) null, (Object) null, ComposableSingletons$HelpCenterCollectionDetailsScreenKt.INSTANCE.m334getLambda3$intercom_sdk_base_release(), 3, (Object) null);
            } else if (collectionDetailsRow instanceof CollectionDetailsRow.CollectionRow) {
                x.c(xVar, (Object) null, (Object) null, c.c(1175818224, true, new HelpCenterCollectionDetailsScreenKt$helpCenterSectionItems$2$2(collectionDetailsRow, lVar2)), 3, (Object) null);
            } else if (collectionDetailsRow instanceof CollectionDetailsRow.SendMessageRow) {
                x.c(xVar, (Object) null, (Object) null, c.c(1352146481, true, new HelpCenterCollectionDetailsScreenKt$helpCenterSectionItems$2$3(collectionDetailsRow)), 3, (Object) null);
            } else {
                throw new C6535s();
            }
            i10 = i11;
        }
    }
}
