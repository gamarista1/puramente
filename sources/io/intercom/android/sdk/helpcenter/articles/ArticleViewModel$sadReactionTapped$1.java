package io.intercom.android.sdk.helpcenter.articles;

import Ug.K;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import lf.C6514M;
import qf.C6658d;
import yf.p;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LUg/K;", "Llf/M;", "<anonymous>", "(LUg/K;)V"}, k = 3, mv = {2, 0, 0})
@f(c = "io.intercom.android.sdk.helpcenter.articles.ArticleViewModel$sadReactionTapped$1", f = "ArticleViewModel.kt", l = {183}, m = "invokeSuspend")
final class ArticleViewModel$sadReactionTapped$1 extends l implements p {
    int I$0;
    int I$1;
    int I$2;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ ArticleViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    ArticleViewModel$sadReactionTapped$1(ArticleViewModel articleViewModel, C6658d<? super ArticleViewModel$sadReactionTapped$1> dVar) {
        super(2, dVar);
        this.this$0 = articleViewModel;
    }

    public final C6658d<C6514M> create(Object obj, C6658d<?> dVar) {
        return new ArticleViewModel$sadReactionTapped$1(this.this$0, dVar);
    }

    public final Object invoke(K k10, C6658d<? super C6514M> dVar) {
        return ((ArticleViewModel$sadReactionTapped$1) create(k10, dVar)).invokeSuspend(C6514M.f71813a);
    }

    /* JADX WARNING: type inference failed for: r2v5, types: [io.intercom.android.sdk.helpcenter.articles.ArticleViewState, java.lang.Object] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r26) {
        /*
            r25 = this;
            r0 = r25
            java.lang.Object r1 = rf.C6680b.f()
            int r2 = r0.label
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L_0x0035
            if (r2 != r4) goto L_0x002d
            int r1 = r0.I$2
            int r2 = r0.I$1
            int r5 = r0.I$0
            java.lang.Object r6 = r0.L$2
            Xg.x r6 = (Xg.x) r6
            java.lang.Object r7 = r0.L$1
            io.intercom.android.sdk.helpcenter.articles.ArticleViewState$TeamPresenceState r7 = (io.intercom.android.sdk.helpcenter.articles.ArticleViewState.TeamPresenceState) r7
            java.lang.Object r8 = r0.L$0
            io.intercom.android.sdk.helpcenter.articles.ArticleViewState$Content r8 = (io.intercom.android.sdk.helpcenter.articles.ArticleViewState.Content) r8
            lf.w.b(r26)
            r10 = r2
            r2 = r6
            r11 = r7
            r24 = r8
            r8 = r5
            r5 = r26
            goto L_0x00c8
        L_0x002d:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L_0x0035:
            lf.w.b(r26)
            io.intercom.android.sdk.helpcenter.articles.ArticleViewModel r2 = r0.this$0
            Xg.x r2 = r2._state
            java.lang.Object r2 = r2.getValue()
            io.intercom.android.sdk.helpcenter.articles.ArticleViewState r2 = (io.intercom.android.sdk.helpcenter.articles.ArticleViewState) r2
            boolean r5 = r2 instanceof io.intercom.android.sdk.helpcenter.articles.ArticleViewState.Content
            if (r5 == 0) goto L_0x0116
            io.intercom.android.sdk.helpcenter.articles.ArticleViewModel r5 = r0.this$0
            Xg.x r6 = r5._state
            io.intercom.android.sdk.helpcenter.articles.ArticleViewModel r5 = r0.this$0
            r8 = r2
            io.intercom.android.sdk.helpcenter.articles.ArticleViewState$Content r8 = (io.intercom.android.sdk.helpcenter.articles.ArticleViewState.Content) r8
            io.intercom.android.sdk.metrics.MetricTracker r2 = r5.metricTracker
            io.intercom.android.sdk.identity.AppConfig r7 = r5.appConfig
            boolean r7 = r7.isInboundMessages()
            java.lang.Boolean r7 = kotlin.coroutines.jvm.internal.b.a(r7)
            boolean r9 = r5.isFromSearchBrowse
            java.lang.String r10 = "reaction_sad"
            r2.sentArticleReaction(r10, r7, r9)
            java.lang.String r2 = r5.articleId
            java.lang.String r7 = r5.articleContentId
            r9 = 2
            r5.sendReactionToServer(r2, r7, r9)
            int r2 = io.intercom.android.sdk.R.id.sad_end
            boolean r7 = r5.shouldAddSendMessageRow()
            if (r7 == 0) goto L_0x0082
            r9 = r3
            goto L_0x0084
        L_0x0082:
            r9 = 8
        L_0x0084:
            io.intercom.android.sdk.helpcenter.articles.ArticleMetadata r10 = r8.getArticleMetadata()
            io.intercom.android.sdk.helpcenter.articles.ArticleViewState$TeamPresenceState r11 = r8.getTeamPresenceState()
            io.intercom.android.sdk.identity.AppConfig r13 = r5.appConfig
            boolean r15 = r5.isFromSearchBrowse
            io.intercom.android.sdk.m5.data.IntercomDataLayer r12 = r5.intercomDataLayer
            Xg.L r12 = r12.getTeamPresence()
            java.lang.Object r12 = r12.getValue()
            io.intercom.android.sdk.models.TeamPresence r12 = (io.intercom.android.sdk.models.TeamPresence) r12
            java.lang.String r14 = "article"
            io.intercom.android.sdk.helpcenter.articles.ArticleViewState$TeamPresenceState r10 = io.intercom.android.sdk.helpcenter.component.TeammateHelpKt.computeViewState(r10, r11, r12, r13, r14, r15)
            io.intercom.android.sdk.m5.data.CommonRepository r5 = r5.commonRepository
            r0.L$0 = r8
            r0.L$1 = r10
            r0.L$2 = r6
            r0.I$0 = r2
            r0.I$1 = r9
            r0.I$2 = r7
            r0.label = r4
            java.lang.Object r5 = r5.openMessenger(r0)
            if (r5 != r1) goto L_0x00c1
            return r1
        L_0x00c1:
            r1 = r7
            r24 = r8
            r11 = r10
            r8 = r2
            r2 = r6
            r10 = r9
        L_0x00c8:
            io.intercom.android.sdk.models.OpenMessengerResponse r5 = (io.intercom.android.sdk.models.OpenMessengerResponse) r5
            if (r5 == 0) goto L_0x00d1
            io.intercom.android.sdk.models.OpenMessengerResponse$NewConversationData r6 = r5.getNewConversationData()
            goto L_0x00d2
        L_0x00d1:
            r6 = 0
        L_0x00d2:
            if (r6 == 0) goto L_0x00f2
            io.intercom.android.sdk.models.OpenMessengerResponse$NewConversationData r5 = r5.getNewConversationData()
            io.intercom.android.sdk.models.OpenMessengerResponse$NewConversationData$Cta r21 = r5.getCta()
            r22 = 511(0x1ff, float:7.16E-43)
            r23 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            io.intercom.android.sdk.helpcenter.articles.ArticleViewState$TeamPresenceState r11 = io.intercom.android.sdk.helpcenter.articles.ArticleViewState.TeamPresenceState.copy$default(r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23)
        L_0x00f2:
            r17 = r11
            io.intercom.android.sdk.helpcenter.articles.ArticleViewState$ReactionState r6 = r24.getReactionState()
            io.intercom.android.sdk.helpcenter.articles.ArticleViewState$Reaction r9 = io.intercom.android.sdk.helpcenter.articles.ArticleViewState.Reaction.Sad
            if (r1 == 0) goto L_0x00fe
            r11 = r4
            goto L_0x00ff
        L_0x00fe:
            r11 = r3
        L_0x00ff:
            r12 = 1
            r13 = 0
            r7 = 0
            io.intercom.android.sdk.helpcenter.articles.ArticleViewState$ReactionState r16 = io.intercom.android.sdk.helpcenter.articles.ArticleViewState.ReactionState.copy$default(r6, r7, r8, r9, r10, r11, r12, r13)
            r18 = 7
            r19 = 0
            r14 = 0
            r15 = 0
            r12 = r24
            io.intercom.android.sdk.helpcenter.articles.ArticleViewState$Content r1 = io.intercom.android.sdk.helpcenter.articles.ArticleViewState.Content.copy$default(r12, r13, r14, r15, r16, r17, r18, r19)
            r2.setValue(r1)
            goto L_0x0129
        L_0x0116:
            io.intercom.android.sdk.helpcenter.articles.ArticleViewState$Initial r1 = io.intercom.android.sdk.helpcenter.articles.ArticleViewState.Initial.INSTANCE
            boolean r1 = kotlin.jvm.internal.C6496s.c(r2, r1)
            if (r1 != 0) goto L_0x0129
            boolean r1 = r2 instanceof io.intercom.android.sdk.helpcenter.articles.ArticleViewState.Error
            if (r1 == 0) goto L_0x0123
            goto L_0x0129
        L_0x0123:
            lf.s r1 = new lf.s
            r1.<init>()
            throw r1
        L_0x0129:
            lf.M r1 = lf.C6514M.f71813a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: io.intercom.android.sdk.helpcenter.articles.ArticleViewModel$sadReactionTapped$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
