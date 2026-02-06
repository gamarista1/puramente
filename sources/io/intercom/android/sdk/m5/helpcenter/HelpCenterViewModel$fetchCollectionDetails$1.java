package io.intercom.android.sdk.m5.helpcenter;

import Ug.K;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import lf.C6514M;
import qf.C6658d;
import yf.p;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LUg/K;", "Llf/M;", "<anonymous>", "(LUg/K;)V"}, k = 3, mv = {2, 0, 0})
@f(c = "io.intercom.android.sdk.m5.helpcenter.HelpCenterViewModel$fetchCollectionDetails$1", f = "HelpCenterViewModel.kt", l = {243, 285}, m = "invokeSuspend")
final class HelpCenterViewModel$fetchCollectionDetails$1 extends l implements p {
    final /* synthetic */ String $collectionId;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    final /* synthetic */ HelpCenterViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    HelpCenterViewModel$fetchCollectionDetails$1(HelpCenterViewModel helpCenterViewModel, String str, C6658d<? super HelpCenterViewModel$fetchCollectionDetails$1> dVar) {
        super(2, dVar);
        this.this$0 = helpCenterViewModel;
        this.$collectionId = str;
    }

    /* access modifiers changed from: private */
    public static final C6514M invokeSuspend$lambda$0(HelpCenterViewModel helpCenterViewModel, String str) {
        helpCenterViewModel.fetchCollectionDetails(str);
        return C6514M.f71813a;
    }

    public final C6658d<C6514M> create(Object obj, C6658d<?> dVar) {
        return new HelpCenterViewModel$fetchCollectionDetails$1(this.this$0, this.$collectionId, dVar);
    }

    public final Object invoke(K k10, C6658d<? super C6514M> dVar) {
        return ((HelpCenterViewModel$fetchCollectionDetails$1) create(k10, dVar)).invokeSuspend(C6514M.f71813a);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v10, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v4, resolved type: io.intercom.android.sdk.helpcenter.sections.HelpCenterCollectionContent} */
    /* JADX WARNING: type inference failed for: r13v17, types: [io.intercom.android.sdk.m5.helpcenter.states.CollectionDetailsUiState$Error] */
    /* JADX WARNING: type inference failed for: r13v19, types: [io.intercom.android.sdk.m5.helpcenter.states.CollectionDetailsUiState$Error] */
    /* JADX WARNING: type inference failed for: r13v22, types: [io.intercom.android.sdk.m5.helpcenter.states.CollectionDetailsUiState$Error] */
    /* JADX WARNING: type inference failed for: r13v23, types: [io.intercom.android.sdk.m5.helpcenter.states.CollectionDetailsUiState$Error] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            r12 = this;
            java.lang.Object r0 = rf.C6680b.f()
            int r1 = r12.label
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L_0x002f
            if (r1 == r3) goto L_0x002b
            if (r1 != r2) goto L_0x0023
            java.lang.Object r0 = r12.L$3
            java.util.List r0 = (java.util.List) r0
            java.lang.Object r1 = r12.L$2
            Xg.x r1 = (Xg.x) r1
            java.lang.Object r2 = r12.L$1
            java.util.List r2 = (java.util.List) r2
            java.lang.Object r3 = r12.L$0
            io.intercom.android.sdk.helpcenter.sections.HelpCenterCollectionContent r3 = (io.intercom.android.sdk.helpcenter.sections.HelpCenterCollectionContent) r3
            lf.w.b(r13)
            goto L_0x0143
        L_0x0023:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r0)
            throw r13
        L_0x002b:
            lf.w.b(r13)
            goto L_0x0073
        L_0x002f:
            lf.w.b(r13)
            io.intercom.android.sdk.m5.helpcenter.HelpCenterViewModel r13 = r12.this$0
            Xg.L r13 = r13.getCollectionDetailsState()
            java.lang.Object r13 = r13.getValue()
            io.intercom.android.sdk.m5.helpcenter.states.CollectionDetailsUiState r13 = (io.intercom.android.sdk.m5.helpcenter.states.CollectionDetailsUiState) r13
            boolean r1 = r13 instanceof io.intercom.android.sdk.m5.helpcenter.states.CollectionDetailsUiState.Content
            if (r1 == 0) goto L_0x0053
            io.intercom.android.sdk.m5.helpcenter.states.CollectionDetailsUiState$Content r13 = (io.intercom.android.sdk.m5.helpcenter.states.CollectionDetailsUiState.Content) r13
            java.lang.String r13 = r13.getId()
            java.lang.String r1 = r12.$collectionId
            boolean r13 = kotlin.jvm.internal.C6496s.c(r13, r1)
            if (r13 == 0) goto L_0x0053
            lf.M r13 = lf.C6514M.f71813a
            return r13
        L_0x0053:
            io.intercom.android.sdk.m5.helpcenter.HelpCenterViewModel r13 = r12.this$0
            Xg.x r13 = r13._collectionDetailsState
            io.intercom.android.sdk.m5.helpcenter.states.CollectionDetailsUiState$Loading r1 = io.intercom.android.sdk.m5.helpcenter.states.CollectionDetailsUiState.Loading.INSTANCE
            r13.setValue(r1)
            io.intercom.android.sdk.m5.helpcenter.HelpCenterViewModel r13 = r12.this$0
            io.intercom.android.sdk.helpcenter.api.HelpCenterApi r4 = r13.helpCenterApi
            java.lang.String r5 = r12.$collectionId
            r12.label = r3
            r6 = 0
            r8 = 2
            r9 = 0
            r7 = r12
            java.lang.Object r13 = io.intercom.android.sdk.helpcenter.api.HelpCenterApi.DefaultImpls.fetchCollectionDetails$default(r4, r5, r6, r7, r8, r9)
            if (r13 != r0) goto L_0x0073
            return r0
        L_0x0073:
            io.intercom.android.sdk.helpcenter.utils.networking.NetworkResponse r13 = (io.intercom.android.sdk.helpcenter.utils.networking.NetworkResponse) r13
            io.intercom.android.sdk.m5.helpcenter.HelpCenterViewModel r1 = r12.this$0
            Xg.x r1 = r1._collectionDetailsState
            boolean r4 = r13 instanceof io.intercom.android.sdk.helpcenter.utils.networking.NetworkResponse.ServerError
            if (r4 == 0) goto L_0x00b0
            io.intercom.android.sdk.m5.helpcenter.HelpCenterViewModel r0 = r12.this$0
            io.intercom.android.sdk.helpcenter.utils.networking.NetworkResponse$ServerError r13 = (io.intercom.android.sdk.helpcenter.utils.networking.NetworkResponse.ServerError) r13
            int r2 = r13.getCode()
            java.lang.Integer r2 = kotlin.coroutines.jvm.internal.b.c(r2)
            r0.sendFailedSingleCollectionMetric(r2)
            int r13 = r13.getCode()
            r0 = 404(0x194, float:5.66E-43)
            if (r13 != r0) goto L_0x00a3
            io.intercom.android.sdk.m5.helpcenter.states.CollectionDetailsUiState$Error r13 = new io.intercom.android.sdk.m5.helpcenter.states.CollectionDetailsUiState$Error
            io.intercom.android.sdk.m5.helpcenter.HelpCenterViewModel r0 = r12.this$0
            io.intercom.android.sdk.m5.components.ErrorState$WithoutCTA r0 = r0.notFoundError
            r13.<init>(r0)
            goto L_0x016a
        L_0x00a3:
            io.intercom.android.sdk.m5.helpcenter.states.CollectionDetailsUiState$Error r13 = new io.intercom.android.sdk.m5.helpcenter.states.CollectionDetailsUiState$Error
            io.intercom.android.sdk.m5.helpcenter.HelpCenterViewModel r0 = r12.this$0
            io.intercom.android.sdk.m5.components.ErrorState$WithoutCTA r0 = r0.genericError
            r13.<init>(r0)
            goto L_0x016a
        L_0x00b0:
            boolean r4 = r13 instanceof io.intercom.android.sdk.helpcenter.utils.networking.NetworkResponse.ClientError
            r5 = 0
            if (r4 == 0) goto L_0x00c7
            io.intercom.android.sdk.m5.helpcenter.HelpCenterViewModel r13 = r12.this$0
            io.intercom.android.sdk.m5.helpcenter.HelpCenterViewModel.sendFailedSingleCollectionMetric$default(r13, r5, r3, r5)
            io.intercom.android.sdk.m5.helpcenter.states.CollectionDetailsUiState$Error r13 = new io.intercom.android.sdk.m5.helpcenter.states.CollectionDetailsUiState$Error
            io.intercom.android.sdk.m5.helpcenter.HelpCenterViewModel r0 = r12.this$0
            io.intercom.android.sdk.m5.components.ErrorState$WithoutCTA r0 = r0.genericError
            r13.<init>(r0)
            goto L_0x016a
        L_0x00c7:
            boolean r4 = r13 instanceof io.intercom.android.sdk.helpcenter.utils.networking.NetworkResponse.NetworkError
            if (r4 == 0) goto L_0x00e4
            io.intercom.android.sdk.m5.helpcenter.HelpCenterViewModel r13 = r12.this$0
            io.intercom.android.sdk.m5.helpcenter.HelpCenterViewModel.sendFailedSingleCollectionMetric$default(r13, r5, r3, r5)
            io.intercom.android.sdk.m5.helpcenter.states.CollectionDetailsUiState$Error r13 = new io.intercom.android.sdk.m5.helpcenter.states.CollectionDetailsUiState$Error
            io.intercom.android.sdk.m5.helpcenter.HelpCenterViewModel r0 = r12.this$0
            java.lang.String r2 = r12.$collectionId
            io.intercom.android.sdk.m5.helpcenter.b r3 = new io.intercom.android.sdk.m5.helpcenter.b
            r3.<init>(r0, r2)
            io.intercom.android.sdk.m5.components.ErrorState$WithCTA r0 = r0.errorWithRetry(r3)
            r13.<init>(r0)
            goto L_0x016a
        L_0x00e4:
            boolean r3 = r13 instanceof io.intercom.android.sdk.helpcenter.utils.networking.NetworkResponse.Success
            if (r3 == 0) goto L_0x0170
            io.intercom.android.sdk.helpcenter.utils.networking.NetworkResponse$Success r13 = (io.intercom.android.sdk.helpcenter.utils.networking.NetworkResponse.Success) r13
            java.lang.Object r13 = r13.getBody()
            r3 = r13
            io.intercom.android.sdk.helpcenter.sections.HelpCenterCollectionContent r3 = (io.intercom.android.sdk.helpcenter.sections.HelpCenterCollectionContent) r3
            io.intercom.android.sdk.m5.helpcenter.HelpCenterViewModel r13 = r12.this$0
            java.util.List r13 = r13.transformToUiModel((io.intercom.android.sdk.helpcenter.sections.HelpCenterCollectionContent) r3)
            java.util.Collection r13 = (java.util.Collection) r13
            java.util.List r13 = mf.C6565s.h1(r13)
            io.intercom.android.sdk.m5.helpcenter.HelpCenterViewModel r4 = r12.this$0
            boolean r4 = r4.isPartialHelpCenterLoaded
            if (r4 == 0) goto L_0x010a
            io.intercom.android.sdk.m5.helpcenter.states.CollectionDetailsRow$FullHelpCenterRow r4 = io.intercom.android.sdk.m5.helpcenter.states.CollectionDetailsRow.FullHelpCenterRow.INSTANCE
            r13.add(r4)
        L_0x010a:
            io.intercom.android.sdk.m5.helpcenter.HelpCenterViewModel r4 = r12.this$0
            io.intercom.android.sdk.metrics.MetricTracker r4 = r4.metricTracker
            io.intercom.android.sdk.m5.helpcenter.HelpCenterViewModel r5 = r12.this$0
            boolean r5 = r5.isPartialHelpCenterLoaded
            java.lang.Boolean r5 = kotlin.coroutines.jvm.internal.b.a(r5)
            io.intercom.android.sdk.m5.helpcenter.HelpCenterViewModel r6 = r12.this$0
            boolean r6 = r6.isFromSearchBrowse()
            java.lang.String r7 = "article_list"
            r4.viewedNativeHelpCenter(r7, r5, r6)
            io.intercom.android.sdk.m5.helpcenter.HelpCenterViewModel r4 = r12.this$0
            boolean r4 = r4.shouldAddSendMessageRow()
            if (r4 == 0) goto L_0x014f
            io.intercom.android.sdk.m5.helpcenter.HelpCenterViewModel r4 = r12.this$0
            r12.L$0 = r3
            r12.L$1 = r13
            r12.L$2 = r1
            r12.L$3 = r13
            r12.label = r2
            java.lang.Object r2 = r4.getCtaData(r12)
            if (r2 != r0) goto L_0x0140
            return r0
        L_0x0140:
            r0 = r13
            r13 = r2
            r2 = r0
        L_0x0143:
            io.intercom.android.sdk.helpcenter.articles.ArticleViewState$TeamPresenceState r13 = (io.intercom.android.sdk.helpcenter.articles.ArticleViewState.TeamPresenceState) r13
            io.intercom.android.sdk.m5.helpcenter.states.CollectionDetailsRow$SendMessageRow r4 = new io.intercom.android.sdk.m5.helpcenter.states.CollectionDetailsRow$SendMessageRow
            r4.<init>(r13)
            r0.add(r4)
            r11 = r2
            goto L_0x0150
        L_0x014f:
            r11 = r13
        L_0x0150:
            io.intercom.android.sdk.m5.helpcenter.states.CollectionDetailsUiState$Content r13 = new io.intercom.android.sdk.m5.helpcenter.states.CollectionDetailsUiState$Content
            java.lang.String r6 = r3.getCollectionId()
            java.lang.String r7 = r3.getTitle()
            java.lang.String r8 = r3.getSummary()
            int r9 = r3.getArticlesCount()
            java.util.List r10 = r3.getAuthors()
            r5 = r13
            r5.<init>(r6, r7, r8, r9, r10, r11)
        L_0x016a:
            r1.setValue(r13)
            lf.M r13 = lf.C6514M.f71813a
            return r13
        L_0x0170:
            lf.s r13 = new lf.s
            r13.<init>()
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: io.intercom.android.sdk.m5.helpcenter.HelpCenterViewModel$fetchCollectionDetails$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
