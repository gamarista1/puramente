package io.intercom.android.sdk.helpcenter.search;

import Xg.C5694f;
import Xg.C5695g;
import kotlin.Metadata;
import lf.C6514M;
import qf.C6658d;
import rf.C6680b;

@Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "LXg/f;", "LXg/g;", "collector", "Llf/M;", "collect", "(LXg/g;Lqf/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ArticleSearchViewModel$1$invokeSuspend$$inlined$map$2 implements C5694f {
    final /* synthetic */ C5694f $this_unsafeTransform$inlined;
    final /* synthetic */ ArticleSearchViewModel this$0;

    public ArticleSearchViewModel$1$invokeSuspend$$inlined$map$2(C5694f fVar, ArticleSearchViewModel articleSearchViewModel) {
        this.$this_unsafeTransform$inlined = fVar;
        this.this$0 = articleSearchViewModel;
    }

    public Object collect(final C5695g gVar, C6658d dVar) {
        C5694f fVar = this.$this_unsafeTransform$inlined;
        final ArticleSearchViewModel articleSearchViewModel = this.this$0;
        Object collect = fVar.collect(new C5695g() {
            /* JADX WARNING: Removed duplicated region for block: B:16:0x0057  */
            /* JADX WARNING: Removed duplicated region for block: B:40:0x0105  */
            /* JADX WARNING: Removed duplicated region for block: B:41:0x010a  */
            /* JADX WARNING: Removed duplicated region for block: B:43:0x010d  */
            /* JADX WARNING: Removed duplicated region for block: B:51:0x015d A[RETURN] */
            /* JADX WARNING: Removed duplicated region for block: B:8:0x002a  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.lang.Object emit(java.lang.Object r24, qf.C6658d r25) {
                /*
                    r23 = this;
                    r0 = r23
                    r1 = r25
                    boolean r2 = r1 instanceof io.intercom.android.sdk.helpcenter.search.ArticleSearchViewModel$1$invokeSuspend$$inlined$map$2.AnonymousClass2.AnonymousClass1
                    if (r2 == 0) goto L_0x0017
                    r2 = r1
                    io.intercom.android.sdk.helpcenter.search.ArticleSearchViewModel$1$invokeSuspend$$inlined$map$2$2$1 r2 = (io.intercom.android.sdk.helpcenter.search.ArticleSearchViewModel$1$invokeSuspend$$inlined$map$2.AnonymousClass2.AnonymousClass1) r2
                    int r3 = r2.label
                    r4 = -2147483648(0xffffffff80000000, float:-0.0)
                    r5 = r3 & r4
                    if (r5 == 0) goto L_0x0017
                    int r3 = r3 - r4
                    r2.label = r3
                    goto L_0x001c
                L_0x0017:
                    io.intercom.android.sdk.helpcenter.search.ArticleSearchViewModel$1$invokeSuspend$$inlined$map$2$2$1 r2 = new io.intercom.android.sdk.helpcenter.search.ArticleSearchViewModel$1$invokeSuspend$$inlined$map$2$2$1
                    r2.<init>(r0, r1)
                L_0x001c:
                    java.lang.Object r1 = r2.result
                    java.lang.Object r3 = rf.C6680b.f()
                    int r4 = r2.label
                    r5 = 3
                    r6 = 2
                    r7 = 1
                    r8 = 0
                    if (r4 == 0) goto L_0x0057
                    if (r4 == r7) goto L_0x004f
                    if (r4 == r6) goto L_0x003d
                    if (r4 != r5) goto L_0x0035
                    lf.w.b(r1)
                    goto L_0x015e
                L_0x0035:
                    java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                    java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                    r1.<init>(r2)
                    throw r1
                L_0x003d:
                    java.lang.Object r4 = r2.L$2
                    io.intercom.android.sdk.helpcenter.articles.ArticleViewState$TeamPresenceState r4 = (io.intercom.android.sdk.helpcenter.articles.ArticleViewState.TeamPresenceState) r4
                    java.lang.Object r6 = r2.L$1
                    Xg.g r6 = (Xg.C5695g) r6
                    java.lang.Object r7 = r2.L$0
                    io.intercom.android.sdk.helpcenter.search.ArticleSearchViewModel$1$invokeSuspend$$inlined$map$2$2 r7 = (io.intercom.android.sdk.helpcenter.search.ArticleSearchViewModel$1$invokeSuspend$$inlined$map$2.AnonymousClass2) r7
                    lf.w.b(r1)
                    r9 = r4
                    goto L_0x0101
                L_0x004f:
                    java.lang.Object r4 = r2.L$0
                    Xg.g r4 = (Xg.C5695g) r4
                    lf.w.b(r1)
                    goto L_0x00a8
                L_0x0057:
                    lf.w.b(r1)
                    Xg.g r1 = r4
                    r4 = r24
                    io.intercom.android.sdk.helpcenter.utils.networking.NetworkResponse r4 = (io.intercom.android.sdk.helpcenter.utils.networking.NetworkResponse) r4
                    boolean r9 = r4 instanceof io.intercom.android.sdk.helpcenter.utils.networking.NetworkResponse.ServerError
                    if (r9 == 0) goto L_0x0077
                    io.intercom.android.sdk.helpcenter.search.ArticleSearchViewModel r6 = r2
                    io.intercom.android.sdk.helpcenter.utils.networking.NetworkResponse$ServerError r4 = (io.intercom.android.sdk.helpcenter.utils.networking.NetworkResponse.ServerError) r4
                    int r4 = r4.getCode()
                    java.lang.Integer r4 = kotlin.coroutines.jvm.internal.b.c(r4)
                    r6.sendFailedSearchMetric(r4)
                    io.intercom.android.sdk.helpcenter.search.ArticleSearchState$Error r4 = io.intercom.android.sdk.helpcenter.search.ArticleSearchState.Error.INSTANCE
                    goto L_0x014f
                L_0x0077:
                    boolean r9 = r4 instanceof io.intercom.android.sdk.helpcenter.utils.networking.NetworkResponse.ClientError
                    if (r9 != 0) goto L_0x0148
                    boolean r9 = r4 instanceof io.intercom.android.sdk.helpcenter.utils.networking.NetworkResponse.NetworkError
                    if (r9 == 0) goto L_0x0081
                    goto L_0x0148
                L_0x0081:
                    boolean r9 = r4 instanceof io.intercom.android.sdk.helpcenter.utils.networking.NetworkResponse.Success
                    if (r9 == 0) goto L_0x0142
                    io.intercom.android.sdk.helpcenter.utils.networking.NetworkResponse$Success r4 = (io.intercom.android.sdk.helpcenter.utils.networking.NetworkResponse.Success) r4
                    java.lang.Object r4 = r4.getBody()
                    java.util.List r4 = (java.util.List) r4
                    r9 = r4
                    java.util.Collection r9 = (java.util.Collection) r9
                    boolean r9 = r9.isEmpty()
                    if (r9 != 0) goto L_0x00b3
                    io.intercom.android.sdk.helpcenter.search.ArticleSearchViewModel r6 = r2
                    r2.L$0 = r1
                    r2.label = r7
                    java.lang.Object r4 = r6.transformToUiModel(r4, r2)
                    if (r4 != r3) goto L_0x00a3
                    return r3
                L_0x00a3:
                    r22 = r4
                    r4 = r1
                    r1 = r22
                L_0x00a8:
                    java.util.List r1 = (java.util.List) r1
                    io.intercom.android.sdk.helpcenter.search.ArticleSearchState$Content r6 = new io.intercom.android.sdk.helpcenter.search.ArticleSearchState$Content
                    r6.<init>(r1)
                    r1 = r4
                    r4 = r6
                    goto L_0x014f
                L_0x00b3:
                    io.intercom.android.sdk.helpcenter.search.ArticleSearchViewModel r4 = r2
                    boolean r4 = r4.shouldAddSendMessageRow()
                    if (r4 == 0) goto L_0x0136
                    io.intercom.android.sdk.helpcenter.articles.ArticleViewState$TeamPresenceState$Companion r4 = io.intercom.android.sdk.helpcenter.articles.ArticleViewState.TeamPresenceState.Companion
                    io.intercom.android.sdk.helpcenter.articles.ArticleViewState$TeamPresenceState r10 = r4.getDefaultTeamPresenceState()
                    io.intercom.android.sdk.helpcenter.search.ArticleSearchViewModel r4 = r2
                    io.intercom.android.sdk.identity.AppConfig r12 = r4.appConfig
                    io.intercom.android.sdk.helpcenter.search.ArticleSearchViewModel r4 = r2
                    boolean r14 = r4.isFromSearchBrowse
                    io.intercom.android.sdk.helpcenter.search.ArticleSearchViewModel r4 = r2
                    io.intercom.android.sdk.m5.data.IntercomDataLayer r4 = r4.intercomDataLayer
                    Xg.L r4 = r4.getTeamPresence()
                    java.lang.Object r4 = r4.getValue()
                    r11 = r4
                    io.intercom.android.sdk.models.TeamPresence r11 = (io.intercom.android.sdk.models.TeamPresence) r11
                    r9 = 0
                    java.lang.String r13 = "search_results"
                    io.intercom.android.sdk.helpcenter.articles.ArticleViewState$TeamPresenceState r4 = io.intercom.android.sdk.helpcenter.component.TeammateHelpKt.computeViewState(r9, r10, r11, r12, r13, r14)
                    io.intercom.android.sdk.helpcenter.search.ArticleSearchViewModel r7 = r2
                    io.intercom.android.sdk.m5.data.CommonRepository r7 = r7.commonRepository
                    r2.L$0 = r0
                    r2.L$1 = r1
                    r2.L$2 = r4
                    r2.label = r6
                    java.lang.Object r6 = r7.openMessenger(r2)
                    if (r6 != r3) goto L_0x00fa
                    return r3
                L_0x00fa:
                    r7 = r0
                    r9 = r4
                    r22 = r6
                    r6 = r1
                    r1 = r22
                L_0x0101:
                    io.intercom.android.sdk.models.OpenMessengerResponse r1 = (io.intercom.android.sdk.models.OpenMessengerResponse) r1
                    if (r1 == 0) goto L_0x010a
                    io.intercom.android.sdk.models.OpenMessengerResponse$NewConversationData r4 = r1.getNewConversationData()
                    goto L_0x010b
                L_0x010a:
                    r4 = r8
                L_0x010b:
                    if (r4 == 0) goto L_0x0129
                    io.intercom.android.sdk.models.OpenMessengerResponse$NewConversationData r1 = r1.getNewConversationData()
                    io.intercom.android.sdk.models.OpenMessengerResponse$NewConversationData$Cta r19 = r1.getCta()
                    r20 = 511(0x1ff, float:7.16E-43)
                    r21 = 0
                    r10 = 0
                    r11 = 0
                    r12 = 0
                    r13 = 0
                    r14 = 0
                    r15 = 0
                    r16 = 0
                    r17 = 0
                    r18 = 0
                    io.intercom.android.sdk.helpcenter.articles.ArticleViewState$TeamPresenceState r9 = io.intercom.android.sdk.helpcenter.articles.ArticleViewState.TeamPresenceState.copy$default(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
                L_0x0129:
                    io.intercom.android.sdk.helpcenter.search.ArticleSearchState$NoResults r4 = new io.intercom.android.sdk.helpcenter.search.ArticleSearchState$NoResults
                    io.intercom.android.sdk.helpcenter.search.ArticleSearchViewModel r1 = r2
                    java.lang.String r1 = r1.lastSearchedInput
                    r4.<init>(r9, r1)
                    r1 = r6
                    goto L_0x014f
                L_0x0136:
                    io.intercom.android.sdk.helpcenter.search.ArticleSearchState$NoResultsNoTeamHelp r4 = new io.intercom.android.sdk.helpcenter.search.ArticleSearchState$NoResultsNoTeamHelp
                    io.intercom.android.sdk.helpcenter.search.ArticleSearchViewModel r6 = r2
                    java.lang.String r6 = r6.lastSearchedInput
                    r4.<init>(r6)
                    goto L_0x014f
                L_0x0142:
                    lf.s r1 = new lf.s
                    r1.<init>()
                    throw r1
                L_0x0148:
                    io.intercom.android.sdk.helpcenter.search.ArticleSearchViewModel r4 = r2
                    io.intercom.android.sdk.helpcenter.search.ArticleSearchViewModel.sendFailedSearchMetric$default(r4, r8, r7, r8)
                    io.intercom.android.sdk.helpcenter.search.ArticleSearchState$Error r4 = io.intercom.android.sdk.helpcenter.search.ArticleSearchState.Error.INSTANCE
                L_0x014f:
                    r2.L$0 = r8
                    r2.L$1 = r8
                    r2.L$2 = r8
                    r2.label = r5
                    java.lang.Object r1 = r1.emit(r4, r2)
                    if (r1 != r3) goto L_0x015e
                    return r3
                L_0x015e:
                    lf.M r1 = lf.C6514M.f71813a
                    return r1
                */
                throw new UnsupportedOperationException("Method not decompiled: io.intercom.android.sdk.helpcenter.search.ArticleSearchViewModel$1$invokeSuspend$$inlined$map$2.AnonymousClass2.emit(java.lang.Object, qf.d):java.lang.Object");
            }
        }, dVar);
        if (collect == C6680b.f()) {
            return collect;
        }
        return C6514M.f71813a;
    }
}
