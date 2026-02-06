package io.intercom.android.sdk.helpcenter.articles;

import Ug.C5600w0;
import Ug.G;
import Ug.K;
import Ug.M;
import Xg.C5695g;
import Xg.C5696h;
import Xg.L;
import Xg.N;
import Xg.x;
import androidx.lifecycle.a0;
import androidx.lifecycle.b0;
import androidx.lifecycle.c0;
import androidx.lifecycle.e0;
import com.revenuecat.purchases.common.networking.RCHTTPStatusCodes;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.articles.ArticleWebViewListener;
import io.intercom.android.sdk.helpcenter.api.HelpCenterApi;
import io.intercom.android.sdk.helpcenter.articles.ArticleViewState;
import io.intercom.android.sdk.identity.AppConfig;
import io.intercom.android.sdk.m5.data.CommonRepository;
import io.intercom.android.sdk.m5.data.IntercomDataLayer;
import io.intercom.android.sdk.m5.data.IntercomEvent;
import io.intercom.android.sdk.metrics.MetricTracker;
import io.intercom.android.sdk.models.Conversation;
import io.intercom.android.sdk.models.OpenMessengerResponse;
import io.intercom.android.sdk.utilities.extensions.AppConfigExtensionsKt;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lf.C6514M;
import lf.C6535s;
import lf.w;
import qf.C6658d;
import rf.C6680b;
import yf.C6798l;
import yf.p;

@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u0000 J2\u00020\u00012\u00020\u0002:\u0001JBq\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\u0005\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u000e\u001a\u00020\f\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00170\u0015¢\u0006\u0004\b\u0019\u0010\u001aJ'\u0010\u001e\u001a\u00020\u00172\u0006\u0010\u001b\u001a\u00020\u00052\u0006\u0010\u001c\u001a\u00020\u00052\u0006\u0010\u001d\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u001b\u0010!\u001a\u00020\u00172\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u0016H\u0002¢\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u00020\fH\u0002¢\u0006\u0004\b#\u0010$J\u0017\u0010'\u001a\u00020\u00172\u0006\u0010&\u001a\u00020%H\u0002¢\u0006\u0004\b'\u0010(J\u0015\u0010)\u001a\u00020\u00172\u0006\u0010\u001b\u001a\u00020\u0005¢\u0006\u0004\b)\u0010*J\u000f\u0010+\u001a\u00020\u0017H\u0016¢\u0006\u0004\b+\u0010,J\u000f\u0010-\u001a\u00020\u0017H\u0016¢\u0006\u0004\b-\u0010,J\u000f\u0010.\u001a\u00020\u0017H\u0016¢\u0006\u0004\b.\u0010,J\u000f\u0010/\u001a\u00020\u0017H\u0016¢\u0006\u0004\b/\u0010,J\u0017\u00101\u001a\u00020\u00172\u0006\u00100\u001a\u00020\u0016H\u0016¢\u0006\u0004\b1\u00102J\r\u00103\u001a\u00020\u0017¢\u0006\u0004\b3\u0010,J\r\u00104\u001a\u00020\u0017¢\u0006\u0004\b4\u0010,J\r\u00105\u001a\u00020\u0017¢\u0006\u0004\b5\u0010,J\u0017\u00107\u001a\u00020\u00172\b\u00106\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b7\u0010*R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0004\u00108R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0006\u00109R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0004¢\u0006\u0006\n\u0004\b\b\u0010:R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0004¢\u0006\u0006\n\u0004\b\n\u0010;R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0004¢\u0006\u0006\n\u0004\b\r\u0010<R\u0014\u0010\u000e\u001a\u00020\f8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010<R\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010=R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010>R\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010?R \u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00170\u00158\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010@R\u001a\u0010C\u001a\b\u0012\u0004\u0012\u00020B0A8\u0002X\u0004¢\u0006\u0006\n\u0004\bC\u0010DR\u001d\u0010F\u001a\b\u0012\u0004\u0012\u00020B0E8\u0006¢\u0006\f\n\u0004\bF\u0010G\u001a\u0004\bH\u0010IR\u0016\u0010\u001c\u001a\u00020\u00058\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u001c\u00109R\u0016\u0010\u001b\u001a\u00020\u00058\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u001b\u00109¨\u0006K"}, d2 = {"Lio/intercom/android/sdk/helpcenter/articles/ArticleViewModel;", "Landroidx/lifecycle/a0;", "Lio/intercom/android/sdk/articles/ArticleWebViewListener;", "Lio/intercom/android/sdk/helpcenter/api/HelpCenterApi;", "helpCenterApi", "", "baseUrl", "Lio/intercom/android/sdk/identity/AppConfig;", "appConfig", "Lio/intercom/android/sdk/metrics/MetricTracker;", "metricTracker", "metricPlace", "", "isFromSearchBrowse", "shouldHideReactions", "LUg/G;", "dispatcher", "Lio/intercom/android/sdk/m5/data/IntercomDataLayer;", "intercomDataLayer", "Lio/intercom/android/sdk/m5/data/CommonRepository;", "commonRepository", "Lkotlin/Function1;", "", "Llf/M;", "scrollTo", "<init>", "(Lio/intercom/android/sdk/helpcenter/api/HelpCenterApi;Ljava/lang/String;Lio/intercom/android/sdk/identity/AppConfig;Lio/intercom/android/sdk/metrics/MetricTracker;Ljava/lang/String;ZZLUg/G;Lio/intercom/android/sdk/m5/data/IntercomDataLayer;Lio/intercom/android/sdk/m5/data/CommonRepository;Lyf/l;)V", "articleId", "articleContentId", "reactionIndex", "sendReactionToServer", "(Ljava/lang/String;Ljava/lang/String;I)V", "errorCode", "sendFailedMetric", "(Ljava/lang/Integer;)V", "shouldAddSendMessageRow", "()Z", "Lio/intercom/android/sdk/models/Conversation;", "conversation", "updateTeamPresence", "(Lio/intercom/android/sdk/models/Conversation;)V", "fragmentLoaded", "(Ljava/lang/String;)V", "onArticleFinishedLoading", "()V", "onArticleLoadingError", "articleNotFound", "onArticleStartedLoading", "y", "scrollArticleViewTo", "(I)V", "sadReactionTapped", "happyReactionTapped", "neutralReactionTapped", "value", "articleContentIdFetched", "Lio/intercom/android/sdk/helpcenter/api/HelpCenterApi;", "Ljava/lang/String;", "Lio/intercom/android/sdk/identity/AppConfig;", "Lio/intercom/android/sdk/metrics/MetricTracker;", "Z", "LUg/G;", "Lio/intercom/android/sdk/m5/data/IntercomDataLayer;", "Lio/intercom/android/sdk/m5/data/CommonRepository;", "Lyf/l;", "LXg/x;", "Lio/intercom/android/sdk/helpcenter/articles/ArticleViewState;", "_state", "LXg/x;", "LXg/L;", "state", "LXg/L;", "getState", "()LXg/L;", "Companion", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ArticleViewModel extends a0 implements ArticleWebViewListener {
    public static final int $stable = 8;
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    public static final int HAPPY_SERVER_INDEX = 0;
    public static final int NEUTRAL_SERVER_INDEX = 1;
    public static final int SAD_SERVER_INDEX = 2;
    /* access modifiers changed from: private */
    public final x _state;
    /* access modifiers changed from: private */
    public final AppConfig appConfig;
    /* access modifiers changed from: private */
    public String articleContentId;
    /* access modifiers changed from: private */
    public String articleId;
    private final String baseUrl;
    /* access modifiers changed from: private */
    public final CommonRepository commonRepository;
    private final G dispatcher;
    /* access modifiers changed from: private */
    public final HelpCenterApi helpCenterApi;
    /* access modifiers changed from: private */
    public final IntercomDataLayer intercomDataLayer;
    /* access modifiers changed from: private */
    public final boolean isFromSearchBrowse;
    /* access modifiers changed from: private */
    public final MetricTracker metricTracker;
    private final C6798l scrollTo;
    private final boolean shouldHideReactions;
    private final L state;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LUg/K;", "Llf/M;", "<anonymous>", "(LUg/K;)V"}, k = 3, mv = {2, 0, 0})
    @f(c = "io.intercom.android.sdk.helpcenter.articles.ArticleViewModel$1", f = "ArticleViewModel.kt", l = {70}, m = "invokeSuspend")
    /* renamed from: io.intercom.android.sdk.helpcenter.articles.ArticleViewModel$1  reason: invalid class name */
    static final class AnonymousClass1 extends l implements p {
        int label;
        final /* synthetic */ ArticleViewModel this$0;

        {
            this.this$0 = r1;
        }

        public final C6658d<C6514M> create(Object obj, C6658d<?> dVar) {
            return new AnonymousClass1(this.this$0, dVar);
        }

        public final Object invoke(K k10, C6658d<? super C6514M> dVar) {
            return ((AnonymousClass1) create(k10, dVar)).invokeSuspend(C6514M.f71813a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C6680b.f();
            int i10 = this.label;
            if (i10 == 0) {
                w.b(obj);
                ArticleViewModel$1$invokeSuspend$$inlined$filterIsInstance$1 articleViewModel$1$invokeSuspend$$inlined$filterIsInstance$1 = new ArticleViewModel$1$invokeSuspend$$inlined$filterIsInstance$1(this.this$0.intercomDataLayer.getEvent());
                final ArticleViewModel articleViewModel = this.this$0;
                AnonymousClass1 r52 = new C5695g() {
                    public final Object emit(IntercomEvent.NewConversation newConversation, C6658d<? super C6514M> dVar) {
                        articleViewModel.updateTeamPresence(newConversation.getConversation());
                        return C6514M.f71813a;
                    }
                };
                this.label = 1;
                if (articleViewModel$1$invokeSuspend$$inlined$filterIsInstance$1.collect(r52, this) == f10) {
                    return f10;
                }
            } else if (i10 == 1) {
                w.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return C6514M.f71813a;
        }
    }

    @Metadata(d1 = {"\u0000E\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007*\u0001\u0010\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JK\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012JQ\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\f¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0018\u001a\u00020\r8\u0006XT¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001a\u001a\u00020\r8\u0006XT¢\u0006\u0006\n\u0004\b\u001a\u0010\u0019R\u0014\u0010\u001b\u001a\u00020\r8\u0006XT¢\u0006\u0006\n\u0004\b\u001b\u0010\u0019¨\u0006\u001c"}, d2 = {"Lio/intercom/android/sdk/helpcenter/articles/ArticleViewModel$Companion;", "", "<init>", "()V", "Lio/intercom/android/sdk/helpcenter/api/HelpCenterApi;", "helpCenterApi", "", "baseUrl", "metricPlace", "", "isFromSearchBrowse", "shouldHideReactions", "Lkotlin/Function1;", "", "Llf/M;", "scrollTo", "io/intercom/android/sdk/helpcenter/articles/ArticleViewModel$Companion$factory$1", "factory", "(Lio/intercom/android/sdk/helpcenter/api/HelpCenterApi;Ljava/lang/String;Ljava/lang/String;ZZLyf/l;)Lio/intercom/android/sdk/helpcenter/articles/ArticleViewModel$Companion$factory$1;", "Landroidx/lifecycle/e0;", "owner", "Lio/intercom/android/sdk/helpcenter/articles/ArticleViewModel;", "create", "(Landroidx/lifecycle/e0;Lio/intercom/android/sdk/helpcenter/api/HelpCenterApi;Ljava/lang/String;Ljava/lang/String;ZZLyf/l;)Lio/intercom/android/sdk/helpcenter/articles/ArticleViewModel;", "HAPPY_SERVER_INDEX", "I", "NEUTRAL_SERVER_INDEX", "SAD_SERVER_INDEX", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final ArticleViewModel$Companion$factory$1 factory(HelpCenterApi helpCenterApi, String str, String str2, boolean z10, boolean z11, C6798l lVar) {
            return new ArticleViewModel$Companion$factory$1(helpCenterApi, str, str2, z10, z11, lVar);
        }

        public final ArticleViewModel create(e0 e0Var, HelpCenterApi helpCenterApi, String str, String str2, boolean z10, boolean z11, C6798l lVar) {
            C6496s.h(e0Var, "owner");
            C6496s.h(helpCenterApi, "helpCenterApi");
            C6496s.h(str, "baseUrl");
            C6496s.h(str2, "metricPlace");
            C6496s.h(lVar, "scrollTo");
            return (ArticleViewModel) new c0(e0Var, (c0.c) factory(helpCenterApi, str, str2, z10, z11, lVar)).b(ArticleViewModel.class);
        }

        private Companion() {
        }
    }

    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ ArticleViewModel(io.intercom.android.sdk.helpcenter.api.HelpCenterApi r16, java.lang.String r17, io.intercom.android.sdk.identity.AppConfig r18, io.intercom.android.sdk.metrics.MetricTracker r19, java.lang.String r20, boolean r21, boolean r22, Ug.G r23, io.intercom.android.sdk.m5.data.IntercomDataLayer r24, io.intercom.android.sdk.m5.data.CommonRepository r25, yf.C6798l r26, int r27, kotlin.jvm.internal.DefaultConstructorMarker r28) {
        /*
            r15 = this;
            r0 = r27
            r1 = r0 & 32
            r2 = 0
            if (r1 == 0) goto L_0x0009
            r9 = r2
            goto L_0x000b
        L_0x0009:
            r9 = r21
        L_0x000b:
            r1 = r0 & 64
            if (r1 == 0) goto L_0x0011
            r10 = r2
            goto L_0x0013
        L_0x0011:
            r10 = r22
        L_0x0013:
            r0 = r0 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x001d
            Ug.G r0 = Ug.Z.b()
            r11 = r0
            goto L_0x001f
        L_0x001d:
            r11 = r23
        L_0x001f:
            r3 = r15
            r4 = r16
            r5 = r17
            r6 = r18
            r7 = r19
            r8 = r20
            r12 = r24
            r13 = r25
            r14 = r26
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: io.intercom.android.sdk.helpcenter.articles.ArticleViewModel.<init>(io.intercom.android.sdk.helpcenter.api.HelpCenterApi, java.lang.String, io.intercom.android.sdk.identity.AppConfig, io.intercom.android.sdk.metrics.MetricTracker, java.lang.String, boolean, boolean, Ug.G, io.intercom.android.sdk.m5.data.IntercomDataLayer, io.intercom.android.sdk.m5.data.CommonRepository, yf.l, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    private final void sendFailedMetric(Integer num) {
        String str;
        MetricTracker metricTracker2 = this.metricTracker;
        if (num != null) {
            str = num.toString();
        } else {
            str = null;
        }
        metricTracker2.failedHelpCenter(MetricTracker.Object.HELP_CENTER, "article", str, this.isFromSearchBrowse);
    }

    static /* synthetic */ void sendFailedMetric$default(ArticleViewModel articleViewModel, Integer num, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            num = null;
        }
        articleViewModel.sendFailedMetric(num);
    }

    /* access modifiers changed from: private */
    public final void sendReactionToServer(String str, String str2, int i10) {
        C5600w0 unused = C5576k.d(b0.a(this), this.dispatcher, (M) null, new ArticleViewModel$sendReactionToServer$1(this, str, i10, str2, (C6658d<? super ArticleViewModel$sendReactionToServer$1>) null), 2, (Object) null);
    }

    /* access modifiers changed from: private */
    public final boolean shouldAddSendMessageRow() {
        if (!AppConfigExtensionsKt.canStartNewConversation(this.appConfig) || !this.appConfig.getArticleAutoReactionEnabled()) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: private */
    public final void updateTeamPresence(Conversation conversation) {
        ArticleViewState articleViewState = (ArticleViewState) this._state.getValue();
        if (articleViewState instanceof ArticleViewState.Content) {
            ArticleViewState.Content content = (ArticleViewState.Content) articleViewState;
            if (content.getReactionState().getTransitionState() == R.id.sad_end) {
                this._state.setValue(ArticleViewState.Content.copy$default(content, (String) null, (ArticleMetadata) null, (ArticleViewState.WebViewStatus) null, (ArticleViewState.ReactionState) null, ArticleViewState.TeamPresenceState.copy$default(content.getTeamPresenceState(), (ArticleMetadata) null, new ArticleViewState.ConversationState(conversation.getId(), 0, 2, (DefaultConstructorMarker) null), (Integer) null, 0, 0, 0, (String) null, (String) null, false, (OpenMessengerResponse.NewConversationData.Cta) null, 1021, (Object) null), 15, (Object) null));
            }
        }
    }

    public final void articleContentIdFetched(String str) {
        int i10;
        if (str != null) {
            this.articleContentId = str;
            ArticleViewState articleViewState = (ArticleViewState) this._state.getValue();
            if (articleViewState instanceof ArticleViewState.Content) {
                x xVar = this._state;
                ArticleViewState.Content content = (ArticleViewState.Content) articleViewState;
                ArticleViewState.ReactionState reactionState = content.getReactionState();
                if (this.shouldHideReactions) {
                    i10 = 8;
                } else {
                    i10 = 0;
                }
                xVar.setValue(ArticleViewState.Content.copy$default(content, (String) null, (ArticleMetadata) null, (ArticleViewState.WebViewStatus) null, ArticleViewState.ReactionState.copy$default(reactionState, i10, 0, (ArticleViewState.Reaction) null, 0, false, 30, (Object) null), (ArticleViewState.TeamPresenceState) null, 23, (Object) null));
            } else if (!C6496s.c(articleViewState, ArticleViewState.Initial.INSTANCE) && !(articleViewState instanceof ArticleViewState.Error)) {
                throw new C6535s();
            }
        }
    }

    public void articleNotFound() {
        sendFailedMetric(Integer.valueOf(RCHTTPStatusCodes.NOT_FOUND));
        this._state.setValue(new ArticleViewState.Error(R.string.intercom_page_not_found, 8, this.appConfig.getPrimaryColor()));
    }

    public final void fragmentLoaded(String str) {
        C6496s.h(str, "articleId");
        this.articleId = str;
        ArticleViewState.Content content = new ArticleViewState.Content(this.baseUrl + "/articles/" + str, new ArticleMetadata(str, (String) null, 2, (DefaultConstructorMarker) null), ArticleViewState.WebViewStatus.Loading, ArticleViewState.ReactionState.Companion.getDefaultReactionState(), ArticleViewState.TeamPresenceState.Companion.getDefaultTeamPresenceState());
        this._state.setValue(content);
        C5600w0 unused = C5576k.d(b0.a(this), this.dispatcher, (M) null, new ArticleViewModel$fragmentLoaded$1(this, str, content, (C6658d<? super ArticleViewModel$fragmentLoaded$1>) null), 2, (Object) null);
    }

    public final L getState() {
        return this.state;
    }

    public final void happyReactionTapped() {
        ArticleViewState articleViewState = (ArticleViewState) this._state.getValue();
        if (articleViewState instanceof ArticleViewState.Content) {
            x xVar = this._state;
            ArticleViewState.Content content = (ArticleViewState.Content) articleViewState;
            this.metricTracker.sentArticleReaction(MetricTracker.Context.REACTION_HAPPY, (Boolean) null, this.isFromSearchBrowse);
            sendReactionToServer(this.articleId, this.articleContentId, 0);
            xVar.setValue(ArticleViewState.Content.copy$default(content, (String) null, (ArticleMetadata) null, (ArticleViewState.WebViewStatus) null, ArticleViewState.ReactionState.copy$default(content.getReactionState(), 0, R.id.happy_end, ArticleViewState.Reaction.Happy, 8, false, 1, (Object) null), (ArticleViewState.TeamPresenceState) null, 23, (Object) null));
        } else if (!C6496s.c(articleViewState, ArticleViewState.Initial.INSTANCE) && !(articleViewState instanceof ArticleViewState.Error)) {
            throw new C6535s();
        }
    }

    public final void neutralReactionTapped() {
        ArticleViewState articleViewState = (ArticleViewState) this._state.getValue();
        if (articleViewState instanceof ArticleViewState.Content) {
            x xVar = this._state;
            ArticleViewState.Content content = (ArticleViewState.Content) articleViewState;
            this.metricTracker.sentArticleReaction(MetricTracker.Context.REACTION_NEUTRAL, (Boolean) null, this.isFromSearchBrowse);
            sendReactionToServer(this.articleId, this.articleContentId, 1);
            xVar.setValue(ArticleViewState.Content.copy$default(content, (String) null, (ArticleMetadata) null, (ArticleViewState.WebViewStatus) null, ArticleViewState.ReactionState.copy$default(content.getReactionState(), 0, R.id.neutral_end, ArticleViewState.Reaction.Neutral, 8, false, 1, (Object) null), (ArticleViewState.TeamPresenceState) null, 23, (Object) null));
        } else if (!C6496s.c(articleViewState, ArticleViewState.Initial.INSTANCE) && !(articleViewState instanceof ArticleViewState.Error)) {
            throw new C6535s();
        }
    }

    public void onArticleFinishedLoading() {
        this.metricTracker.viewedNativeHelpCenter("article", (Boolean) null, this.isFromSearchBrowse);
        ArticleViewState articleViewState = (ArticleViewState) this._state.getValue();
        if (articleViewState instanceof ArticleViewState.Content) {
            this._state.setValue(ArticleViewState.Content.copy$default((ArticleViewState.Content) articleViewState, (String) null, (ArticleMetadata) null, ArticleViewState.WebViewStatus.Ready, (ArticleViewState.ReactionState) null, (ArticleViewState.TeamPresenceState) null, 27, (Object) null));
        } else if (!C6496s.c(articleViewState, ArticleViewState.Initial.INSTANCE) && !(articleViewState instanceof ArticleViewState.Error)) {
            throw new C6535s();
        }
    }

    public void onArticleLoadingError() {
        sendFailedMetric$default(this, (Integer) null, 1, (Object) null);
        this._state.setValue(new ArticleViewState.Error(R.string.intercom_something_went_wrong_try_again, 0, this.appConfig.getPrimaryColor()));
    }

    public void onArticleStartedLoading() {
        ArticleViewState articleViewState = (ArticleViewState) this._state.getValue();
        if (articleViewState instanceof ArticleViewState.Content) {
            this._state.setValue(ArticleViewState.Content.copy$default((ArticleViewState.Content) articleViewState, (String) null, (ArticleMetadata) null, ArticleViewState.WebViewStatus.Loading, (ArticleViewState.ReactionState) null, (ArticleViewState.TeamPresenceState) null, 27, (Object) null));
        } else if (!C6496s.c(articleViewState, ArticleViewState.Initial.INSTANCE) && !(articleViewState instanceof ArticleViewState.Error)) {
            throw new C6535s();
        }
    }

    public final void sadReactionTapped() {
        C5600w0 unused = C5576k.d(b0.a(this), this.dispatcher, (M) null, new ArticleViewModel$sadReactionTapped$1(this, (C6658d<? super ArticleViewModel$sadReactionTapped$1>) null), 2, (Object) null);
    }

    public void scrollArticleViewTo(int i10) {
        this.scrollTo.invoke(Integer.valueOf(i10));
    }

    public ArticleViewModel(HelpCenterApi helpCenterApi2, String str, AppConfig appConfig2, MetricTracker metricTracker2, String str2, boolean z10, boolean z11, G g10, IntercomDataLayer intercomDataLayer2, CommonRepository commonRepository2, C6798l lVar) {
        C6496s.h(helpCenterApi2, "helpCenterApi");
        C6496s.h(str, "baseUrl");
        C6496s.h(appConfig2, "appConfig");
        C6496s.h(metricTracker2, "metricTracker");
        C6496s.h(str2, "metricPlace");
        C6496s.h(g10, "dispatcher");
        C6496s.h(intercomDataLayer2, "intercomDataLayer");
        C6496s.h(commonRepository2, "commonRepository");
        C6496s.h(lVar, "scrollTo");
        this.helpCenterApi = helpCenterApi2;
        this.baseUrl = str;
        this.appConfig = appConfig2;
        this.metricTracker = metricTracker2;
        this.isFromSearchBrowse = z10;
        this.shouldHideReactions = z11;
        this.dispatcher = g10;
        this.intercomDataLayer = intercomDataLayer2;
        this.commonRepository = commonRepository2;
        this.scrollTo = lVar;
        x a10 = N.a(ArticleViewState.Initial.INSTANCE);
        this._state = a10;
        this.state = C5696h.b(a10);
        this.articleContentId = "";
        this.articleId = "";
        if (!C6496s.c(str2, MetricTracker.Place.COLLECTION_LIST)) {
            String str3 = "article";
            if (!C6496s.c(str2, str3)) {
                metricTracker2.openedNativeHelpCenter(str2, !C6496s.c(str2, MetricTracker.Place.API) ? MetricTracker.Context.NO_CONTEXT : str3);
            }
        }
        C5600w0 unused = C5576k.d(b0.a(this), g10, (M) null, new AnonymousClass1(this, (C6658d<? super AnonymousClass1>) null), 2, (Object) null);
    }
}
