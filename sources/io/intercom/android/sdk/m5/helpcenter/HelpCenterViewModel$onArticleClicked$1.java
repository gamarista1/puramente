package io.intercom.android.sdk.m5.helpcenter;

import Ug.K;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import lf.C6514M;
import qf.C6658d;
import yf.p;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LUg/K;", "Llf/M;", "<anonymous>", "(LUg/K;)V"}, k = 3, mv = {2, 0, 0})
@f(c = "io.intercom.android.sdk.m5.helpcenter.HelpCenterViewModel$onArticleClicked$1", f = "HelpCenterViewModel.kt", l = {311, 314, 319}, m = "invokeSuspend")
final class HelpCenterViewModel$onArticleClicked$1 extends l implements p {
    int I$0;
    int I$1;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ HelpCenterViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    HelpCenterViewModel$onArticleClicked$1(HelpCenterViewModel helpCenterViewModel, C6658d<? super HelpCenterViewModel$onArticleClicked$1> dVar) {
        super(2, dVar);
        this.this$0 = helpCenterViewModel;
    }

    public final C6658d<C6514M> create(Object obj, C6658d<?> dVar) {
        return new HelpCenterViewModel$onArticleClicked$1(this.this$0, dVar);
    }

    public final Object invoke(K k10, C6658d<? super C6514M> dVar) {
        return ((HelpCenterViewModel$onArticleClicked$1) create(k10, dVar)).invokeSuspend(C6514M.f71813a);
    }

    /* JADX WARNING: Removed duplicated region for block: B:47:0x00ef A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00f0  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            r11 = this;
            java.lang.Object r0 = rf.C6680b.f()
            int r1 = r11.label
            r2 = 3
            r3 = 2
            r4 = 0
            r5 = 1
            if (r1 == 0) goto L_0x004c
            if (r1 == r5) goto L_0x003a
            if (r1 == r3) goto L_0x0027
            if (r1 != r2) goto L_0x001f
            java.lang.Object r0 = r11.L$1
            Xg.x r0 = (Xg.x) r0
            java.lang.Object r1 = r11.L$0
            io.intercom.android.sdk.m5.helpcenter.states.CollectionsUiState$Content r1 = (io.intercom.android.sdk.m5.helpcenter.states.CollectionsUiState.Content) r1
            lf.w.b(r12)
            goto L_0x00f2
        L_0x001f:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r0)
            throw r12
        L_0x0027:
            int r1 = r11.I$0
            java.lang.Object r3 = r11.L$2
            Xg.x r3 = (Xg.x) r3
            java.lang.Object r5 = r11.L$1
            io.intercom.android.sdk.m5.helpcenter.states.CollectionDetailsUiState$Content r5 = (io.intercom.android.sdk.m5.helpcenter.states.CollectionDetailsUiState.Content) r5
            java.lang.Object r6 = r11.L$0
            io.intercom.android.sdk.m5.helpcenter.states.CollectionsUiState$Content r6 = (io.intercom.android.sdk.m5.helpcenter.states.CollectionsUiState.Content) r6
            lf.w.b(r12)
            goto L_0x00ce
        L_0x003a:
            int r1 = r11.I$1
            int r5 = r11.I$0
            java.lang.Object r6 = r11.L$1
            io.intercom.android.sdk.m5.helpcenter.states.CollectionsUiState$Content r6 = (io.intercom.android.sdk.m5.helpcenter.states.CollectionsUiState.Content) r6
            java.lang.Object r7 = r11.L$0
            io.intercom.android.sdk.m5.helpcenter.states.CollectionDetailsUiState$Content r7 = (io.intercom.android.sdk.m5.helpcenter.states.CollectionDetailsUiState.Content) r7
            lf.w.b(r12)
            r12 = r7
            goto L_0x00b0
        L_0x004c:
            lf.w.b(r12)
            io.intercom.android.sdk.m5.helpcenter.HelpCenterViewModel r12 = r11.this$0
            r12.hasClickedAtLeastOneArticle = r5
            io.intercom.android.sdk.m5.helpcenter.HelpCenterViewModel r12 = r11.this$0
            boolean r12 = r12.shouldAddSendMessageRow()
            if (r12 == 0) goto L_0x00fb
            io.intercom.android.sdk.m5.helpcenter.HelpCenterViewModel r12 = r11.this$0
            Xg.x r12 = r12._collectionDetailsState
            java.lang.Object r12 = r12.getValue()
            boolean r1 = r12 instanceof io.intercom.android.sdk.m5.helpcenter.states.CollectionDetailsUiState.Content
            if (r1 == 0) goto L_0x006d
            io.intercom.android.sdk.m5.helpcenter.states.CollectionDetailsUiState$Content r12 = (io.intercom.android.sdk.m5.helpcenter.states.CollectionDetailsUiState.Content) r12
            goto L_0x006e
        L_0x006d:
            r12 = r4
        L_0x006e:
            io.intercom.android.sdk.m5.helpcenter.HelpCenterViewModel r1 = r11.this$0
            Xg.x r1 = r1._collectionsState
            java.lang.Object r1 = r1.getValue()
            boolean r6 = r1 instanceof io.intercom.android.sdk.m5.helpcenter.states.CollectionsUiState.Content
            if (r6 == 0) goto L_0x007f
            io.intercom.android.sdk.m5.helpcenter.states.CollectionsUiState$Content r1 = (io.intercom.android.sdk.m5.helpcenter.states.CollectionsUiState.Content) r1
            goto L_0x0080
        L_0x007f:
            r1 = r4
        L_0x0080:
            r6 = 0
            if (r12 == 0) goto L_0x008b
            boolean r7 = r12.hasSendMessageRow()
            if (r7 != 0) goto L_0x008b
            r7 = r5
            goto L_0x008c
        L_0x008b:
            r7 = r6
        L_0x008c:
            if (r1 == 0) goto L_0x0095
            boolean r8 = r1.hasSendMessageRow()
            if (r8 != 0) goto L_0x0095
            r6 = r5
        L_0x0095:
            if (r7 != 0) goto L_0x0099
            if (r6 == 0) goto L_0x00fb
        L_0x0099:
            r11.L$0 = r12
            r11.L$1 = r1
            r11.I$0 = r7
            r11.I$1 = r6
            r11.label = r5
            r8 = 2000(0x7d0, double:9.88E-321)
            java.lang.Object r5 = Ug.V.a(r8, r11)
            if (r5 != r0) goto L_0x00ac
            return r0
        L_0x00ac:
            r5 = r7
            r10 = r6
            r6 = r1
            r1 = r10
        L_0x00b0:
            if (r5 == 0) goto L_0x00d7
            if (r12 == 0) goto L_0x00d7
            io.intercom.android.sdk.m5.helpcenter.HelpCenterViewModel r5 = r11.this$0
            Xg.x r7 = r5._collectionDetailsState
            r11.L$0 = r6
            r11.L$1 = r12
            r11.L$2 = r7
            r11.I$0 = r1
            r11.label = r3
            java.lang.Object r3 = r5.getCtaData(r11)
            if (r3 != r0) goto L_0x00cb
            return r0
        L_0x00cb:
            r5 = r12
            r12 = r3
            r3 = r7
        L_0x00ce:
            io.intercom.android.sdk.helpcenter.articles.ArticleViewState$TeamPresenceState r12 = (io.intercom.android.sdk.helpcenter.articles.ArticleViewState.TeamPresenceState) r12
            io.intercom.android.sdk.m5.helpcenter.states.CollectionDetailsUiState$Content r12 = r5.copyWithSingleSendMessageRow(r12)
            r3.setValue(r12)
        L_0x00d7:
            if (r1 == 0) goto L_0x00fb
            if (r6 == 0) goto L_0x00fb
            io.intercom.android.sdk.m5.helpcenter.HelpCenterViewModel r12 = r11.this$0
            Xg.x r1 = r12._collectionsState
            r11.L$0 = r6
            r11.L$1 = r1
            r11.L$2 = r4
            r11.label = r2
            java.lang.Object r12 = r12.getCtaData(r11)
            if (r12 != r0) goto L_0x00f0
            return r0
        L_0x00f0:
            r0 = r1
            r1 = r6
        L_0x00f2:
            io.intercom.android.sdk.helpcenter.articles.ArticleViewState$TeamPresenceState r12 = (io.intercom.android.sdk.helpcenter.articles.ArticleViewState.TeamPresenceState) r12
            io.intercom.android.sdk.m5.helpcenter.states.CollectionsUiState$Content r12 = r1.copyWithSingleSendMessageRow(r12)
            r0.setValue(r12)
        L_0x00fb:
            lf.M r12 = lf.C6514M.f71813a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: io.intercom.android.sdk.m5.helpcenter.HelpCenterViewModel$onArticleClicked$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
