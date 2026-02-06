package io.intercom.android.sdk.m5.helpcenter;

import Ug.C5600w0;
import Ug.G;
import Ug.K;
import Ug.M;
import Ug.Z;
import Wg.a;
import Xg.B;
import Xg.C5696h;
import Xg.D;
import Xg.H;
import Xg.L;
import Xg.N;
import Xg.w;
import Xg.x;
import android.content.Context;
import android.content.res.Configuration;
import androidx.lifecycle.a0;
import androidx.lifecycle.b0;
import androidx.lifecycle.c0;
import androidx.lifecycle.e0;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.helpcenter.api.HelpCenterApi;
import io.intercom.android.sdk.helpcenter.articles.ArticleMetadata;
import io.intercom.android.sdk.helpcenter.articles.ArticleViewState;
import io.intercom.android.sdk.helpcenter.collections.HelpCenterCollection;
import io.intercom.android.sdk.helpcenter.component.TeammateHelpKt;
import io.intercom.android.sdk.helpcenter.sections.HelpCenterArticle;
import io.intercom.android.sdk.helpcenter.sections.HelpCenterCollectionContent;
import io.intercom.android.sdk.helpcenter.utils.HelpCenterEligibilityChecker;
import io.intercom.android.sdk.identity.AppConfig;
import io.intercom.android.sdk.m5.components.ErrorState;
import io.intercom.android.sdk.m5.data.CommonRepository;
import io.intercom.android.sdk.m5.data.IntercomDataLayer;
import io.intercom.android.sdk.m5.helpcenter.states.CollectionDetailsRow;
import io.intercom.android.sdk.m5.helpcenter.states.CollectionDetailsUiState;
import io.intercom.android.sdk.m5.helpcenter.states.CollectionRowData;
import io.intercom.android.sdk.m5.helpcenter.states.CollectionsRow;
import io.intercom.android.sdk.m5.helpcenter.states.CollectionsUiState;
import io.intercom.android.sdk.metrics.MetricTracker;
import io.intercom.android.sdk.models.Space;
import io.intercom.android.sdk.models.TeamPresence;
import io.intercom.android.sdk.ui.common.StringProvider;
import io.intercom.android.sdk.utilities.ContextLocaliser;
import io.intercom.android.sdk.utilities.extensions.AppConfigExtensionsKt;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lf.C6514M;
import lf.C6531o;
import mf.C6565s;
import mf.Y;
import qf.C6658d;
import qf.g;
import rf.C6680b;
import yf.C6787a;
import yf.p;

@Metadata(d1 = {"\u0000Ò\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\b\u0001\u0018\u0000 k2\u00020\u0001:\u0001kBK\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u001d\u0010\u0018\u001a\u00020\u00172\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u001b\u0010\u001c\u001a\u00020\u00152\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ#\u0010\"\u001a\b\u0012\u0004\u0012\u00020!0\u001e2\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u001eH\u0002¢\u0006\u0004\b\"\u0010#J\u000f\u0010%\u001a\u00020$H\u0002¢\u0006\u0004\b%\u0010&J\u001b\u0010'\u001a\u00020\u00152\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0002¢\u0006\u0004\b'\u0010\u001dJ\u001d\u0010\"\u001a\b\u0012\u0004\u0012\u00020*0\u001e2\u0006\u0010)\u001a\u00020(H\u0002¢\u0006\u0004\b\"\u0010+J\u0010\u0010,\u001a\u00020\u0015H@¢\u0006\u0004\b,\u0010-J\u000f\u0010.\u001a\u00020$H\u0002¢\u0006\u0004\b.\u0010&J\u0010\u00100\u001a\u00020/H@¢\u0006\u0004\b0\u0010-J\u0015\u00103\u001a\u0002012\u0006\u00102\u001a\u000201¢\u0006\u0004\b3\u00104J\r\u00106\u001a\u000205¢\u0006\u0004\b6\u00107J\u001d\u0010:\u001a\u00020\u00152\u000e\b\u0002\u00109\u001a\b\u0012\u0004\u0012\u00020\b08¢\u0006\u0004\b:\u0010;J\u0015\u0010=\u001a\u00020\u00152\u0006\u0010<\u001a\u00020\b¢\u0006\u0004\b=\u0010>J\r\u0010?\u001a\u00020\u0015¢\u0006\u0004\b?\u0010@R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010AR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010BR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010CR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\t\u0010DR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010ER\u0014\u0010\r\u001a\u00020\f8\u0002X\u0004¢\u0006\u0006\n\u0004\b\r\u0010FR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010GR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010HR\u001a\u0010K\u001a\b\u0012\u0004\u0012\u00020J0I8\u0002X\u0004¢\u0006\u0006\n\u0004\bK\u0010LR\u001d\u0010N\u001a\b\u0012\u0004\u0012\u00020J0M8\u0006¢\u0006\f\n\u0004\bN\u0010O\u001a\u0004\bP\u0010QR\u001a\u0010S\u001a\b\u0012\u0004\u0012\u00020R0I8\u0002X\u0004¢\u0006\u0006\n\u0004\bS\u0010LR\u001d\u0010T\u001a\b\u0012\u0004\u0012\u00020R0M8\u0006¢\u0006\f\n\u0004\bT\u0010O\u001a\u0004\bU\u0010QR\u001a\u0010X\u001a\b\u0012\u0004\u0012\u00020W0V8\u0002X\u0004¢\u0006\u0006\n\u0004\bX\u0010YR\u001d\u0010[\u001a\b\u0012\u0004\u0012\u00020W0Z8\u0006¢\u0006\f\n\u0004\b[\u0010\\\u001a\u0004\b]\u0010^R\u0016\u0010_\u001a\u00020$8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b_\u0010`R\u0016\u0010a\u001a\u00020$8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\ba\u0010`R\u0014\u0010c\u001a\u00020b8\u0002X\u0004¢\u0006\u0006\n\u0004\bc\u0010dR\u0014\u0010e\u001a\u00020b8\u0002X\u0004¢\u0006\u0006\n\u0004\be\u0010dR\u001b\u0010j\u001a\u00020/8BX\u0002¢\u0006\f\n\u0004\bf\u0010g\u001a\u0004\bh\u0010i¨\u0006l"}, d2 = {"Lio/intercom/android/sdk/m5/helpcenter/HelpCenterViewModel;", "Landroidx/lifecycle/a0;", "Lio/intercom/android/sdk/helpcenter/api/HelpCenterApi;", "helpCenterApi", "Lio/intercom/android/sdk/identity/AppConfig;", "appConfig", "Lio/intercom/android/sdk/metrics/MetricTracker;", "metricTracker", "", "place", "Lio/intercom/android/sdk/helpcenter/utils/HelpCenterEligibilityChecker;", "helpCenterEligibilityChecker", "LUg/G;", "dispatcher", "Lio/intercom/android/sdk/m5/data/IntercomDataLayer;", "intercomDataLayer", "Lio/intercom/android/sdk/m5/data/CommonRepository;", "commonRepository", "<init>", "(Lio/intercom/android/sdk/helpcenter/api/HelpCenterApi;Lio/intercom/android/sdk/identity/AppConfig;Lio/intercom/android/sdk/metrics/MetricTracker;Ljava/lang/String;Lio/intercom/android/sdk/helpcenter/utils/HelpCenterEligibilityChecker;LUg/G;Lio/intercom/android/sdk/m5/data/IntercomDataLayer;Lio/intercom/android/sdk/m5/data/CommonRepository;)V", "Lkotlin/Function0;", "Llf/M;", "onClick", "Lio/intercom/android/sdk/m5/components/ErrorState$WithCTA;", "errorWithRetry", "(Lyf/a;)Lio/intercom/android/sdk/m5/components/ErrorState$WithCTA;", "", "errorCode", "sendFailedCollectionListMetric", "(Ljava/lang/Integer;)V", "", "Lio/intercom/android/sdk/helpcenter/collections/HelpCenterCollection;", "body", "Lio/intercom/android/sdk/m5/helpcenter/states/CollectionsRow$CollectionRow;", "transformToUiModel", "(Ljava/util/List;)Ljava/util/List;", "", "shouldAddSendMessageRow", "()Z", "sendFailedSingleCollectionMetric", "Lio/intercom/android/sdk/helpcenter/sections/HelpCenterCollectionContent;", "networkResponse", "Lio/intercom/android/sdk/m5/helpcenter/states/CollectionDetailsRow;", "(Lio/intercom/android/sdk/helpcenter/sections/HelpCenterCollectionContent;)Ljava/util/List;", "onNewConfig", "(Lqf/d;)Ljava/lang/Object;", "isFromSearchBrowse", "Lio/intercom/android/sdk/helpcenter/articles/ArticleViewState$TeamPresenceState;", "getCtaData", "Landroid/content/Context;", "context", "localizedContext", "(Landroid/content/Context;)Landroid/content/Context;", "Lio/intercom/android/sdk/ui/common/StringProvider;", "getScreenTitle", "()Lio/intercom/android/sdk/ui/common/StringProvider;", "", "collectionIds", "fetchCollections", "(Ljava/util/Set;)V", "collectionId", "fetchCollectionDetails", "(Ljava/lang/String;)V", "onArticleClicked", "()V", "Lio/intercom/android/sdk/helpcenter/api/HelpCenterApi;", "Lio/intercom/android/sdk/identity/AppConfig;", "Lio/intercom/android/sdk/metrics/MetricTracker;", "Ljava/lang/String;", "Lio/intercom/android/sdk/helpcenter/utils/HelpCenterEligibilityChecker;", "LUg/G;", "Lio/intercom/android/sdk/m5/data/IntercomDataLayer;", "Lio/intercom/android/sdk/m5/data/CommonRepository;", "LXg/x;", "Lio/intercom/android/sdk/m5/helpcenter/states/CollectionsUiState;", "_collectionsState", "LXg/x;", "LXg/L;", "collectionsState", "LXg/L;", "getCollectionsState", "()LXg/L;", "Lio/intercom/android/sdk/m5/helpcenter/states/CollectionDetailsUiState;", "_collectionDetailsState", "collectionDetailsState", "getCollectionDetailsState", "LXg/w;", "Lio/intercom/android/sdk/m5/helpcenter/states/CollectionsUiEffects;", "_effect", "LXg/w;", "LXg/B;", "effect", "LXg/B;", "getEffect", "()LXg/B;", "isPartialHelpCenterLoaded", "Z", "hasClickedAtLeastOneArticle", "Lio/intercom/android/sdk/m5/components/ErrorState$WithoutCTA;", "genericError", "Lio/intercom/android/sdk/m5/components/ErrorState$WithoutCTA;", "notFoundError", "searchBrowseTeamPresenceState$delegate", "Lkotlin/Lazy;", "getSearchBrowseTeamPresenceState", "()Lio/intercom/android/sdk/helpcenter/articles/ArticleViewState$TeamPresenceState;", "searchBrowseTeamPresenceState", "Companion", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class HelpCenterViewModel extends a0 {
    public static final int $stable = 8;
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */
    public final x _collectionDetailsState;
    /* access modifiers changed from: private */
    public final x _collectionsState;
    /* access modifiers changed from: private */
    public final w _effect;
    private final AppConfig appConfig;
    private final L collectionDetailsState;
    private final L collectionsState;
    private final CommonRepository commonRepository;
    private final G dispatcher;
    private final B effect;
    /* access modifiers changed from: private */
    public final ErrorState.WithoutCTA genericError;
    /* access modifiers changed from: private */
    public boolean hasClickedAtLeastOneArticle;
    /* access modifiers changed from: private */
    public final HelpCenterApi helpCenterApi;
    private final HelpCenterEligibilityChecker helpCenterEligibilityChecker;
    /* access modifiers changed from: private */
    public final IntercomDataLayer intercomDataLayer;
    /* access modifiers changed from: private */
    public boolean isPartialHelpCenterLoaded;
    /* access modifiers changed from: private */
    public final MetricTracker metricTracker;
    /* access modifiers changed from: private */
    public final ErrorState.WithoutCTA notFoundError;
    private final String place;
    private final Lazy searchBrowseTeamPresenceState$delegate;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LUg/K;", "Llf/M;", "<anonymous>", "(LUg/K;)V"}, k = 3, mv = {2, 0, 0})
    @f(c = "io.intercom.android.sdk.m5.helpcenter.HelpCenterViewModel$1", f = "HelpCenterViewModel.kt", l = {100}, m = "invokeSuspend")
    /* renamed from: io.intercom.android.sdk.m5.helpcenter.HelpCenterViewModel$1  reason: invalid class name */
    static final class AnonymousClass1 extends l implements p {
        int label;
        final /* synthetic */ HelpCenterViewModel this$0;

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
                lf.w.b(obj);
                L config = this.this$0.intercomDataLayer.getConfig();
                final HelpCenterViewModel helpCenterViewModel = this.this$0;
                AnonymousClass1 r12 = new p((C6658d<? super AnonymousClass1>) null) {
                    int label;

                    public final C6658d<C6514M> create(Object obj, C6658d<?> dVar) {
                        return 

                        @Metadata(d1 = {"\u0000-\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\b\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ%\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lio/intercom/android/sdk/m5/helpcenter/HelpCenterViewModel$Companion;", "", "<init>", "()V", "Lio/intercom/android/sdk/helpcenter/api/HelpCenterApi;", "helpCenterApi", "", "place", "io/intercom/android/sdk/m5/helpcenter/HelpCenterViewModel$Companion$factory$1", "factory", "(Lio/intercom/android/sdk/helpcenter/api/HelpCenterApi;Ljava/lang/String;)Lio/intercom/android/sdk/m5/helpcenter/HelpCenterViewModel$Companion$factory$1;", "Landroidx/lifecycle/e0;", "owner", "Lio/intercom/android/sdk/m5/helpcenter/HelpCenterViewModel;", "create", "(Landroidx/lifecycle/e0;Lio/intercom/android/sdk/helpcenter/api/HelpCenterApi;Ljava/lang/String;)Lio/intercom/android/sdk/m5/helpcenter/HelpCenterViewModel;", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
                        public static final class Companion {
                            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                                this();
                            }

                            private final HelpCenterViewModel$Companion$factory$1 factory(HelpCenterApi helpCenterApi, String str) {
                                return new HelpCenterViewModel$Companion$factory$1(helpCenterApi, str);
                            }

                            public final HelpCenterViewModel create(e0 e0Var, HelpCenterApi helpCenterApi, String str) {
                                C6496s.h(e0Var, "owner");
                                C6496s.h(helpCenterApi, "helpCenterApi");
                                C6496s.h(str, "place");
                                return (HelpCenterViewModel) new c0(e0Var, (c0.c) factory(helpCenterApi, str)).b(HelpCenterViewModel.class);
                            }

                            private Companion() {
                            }
                        }

                        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
                        public /* synthetic */ HelpCenterViewModel(HelpCenterApi helpCenterApi2, AppConfig appConfig2, MetricTracker metricTracker2, String str, HelpCenterEligibilityChecker helpCenterEligibilityChecker2, G g10, IntercomDataLayer intercomDataLayer2, CommonRepository commonRepository2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
                            this(helpCenterApi2, appConfig2, metricTracker2, str, (i10 & 16) != 0 ? HelpCenterEligibilityChecker.INSTANCE : helpCenterEligibilityChecker2, (i10 & 32) != 0 ? Z.b() : g10, intercomDataLayer2, commonRepository2);
                        }

                        /* access modifiers changed from: private */
                        public final ErrorState.WithCTA errorWithRetry(C6787a aVar) {
                            return new ErrorState.WithCTA(0, 0, (Integer) null, 0, aVar, 15, (DefaultConstructorMarker) null);
                        }

                        public static /* synthetic */ void fetchCollections$default(HelpCenterViewModel helpCenterViewModel, Set set, int i10, Object obj) {
                            if ((i10 & 1) != 0) {
                                set = Y.e();
                            }
                            helpCenterViewModel.fetchCollections(set);
                        }

                        /* Code decompiled incorrectly, please refer to instructions dump. */
                        public final java.lang.Object getCtaData(qf.C6658d<? super io.intercom.android.sdk.helpcenter.articles.ArticleViewState.TeamPresenceState> r14) {
                            /*
                                r13 = this;
                                boolean r0 = r14 instanceof io.intercom.android.sdk.m5.helpcenter.HelpCenterViewModel$getCtaData$1
                                if (r0 == 0) goto L_0x0013
                                r0 = r14
                                io.intercom.android.sdk.m5.helpcenter.HelpCenterViewModel$getCtaData$1 r0 = (io.intercom.android.sdk.m5.helpcenter.HelpCenterViewModel$getCtaData$1) r0
                                int r1 = r0.label
                                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                                r3 = r1 & r2
                                if (r3 == 0) goto L_0x0013
                                int r1 = r1 - r2
                                r0.label = r1
                                goto L_0x0018
                            L_0x0013:
                                io.intercom.android.sdk.m5.helpcenter.HelpCenterViewModel$getCtaData$1 r0 = new io.intercom.android.sdk.m5.helpcenter.HelpCenterViewModel$getCtaData$1
                                r0.<init>(r13, r14)
                            L_0x0018:
                                java.lang.Object r14 = r0.result
                                java.lang.Object r1 = rf.C6680b.f()
                                int r2 = r0.label
                                r3 = 1
                                if (r2 == 0) goto L_0x0035
                                if (r2 != r3) goto L_0x002d
                                java.lang.Object r0 = r0.L$0
                                io.intercom.android.sdk.m5.helpcenter.HelpCenterViewModel r0 = (io.intercom.android.sdk.m5.helpcenter.HelpCenterViewModel) r0
                                lf.w.b(r14)
                                goto L_0x0046
                            L_0x002d:
                                java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
                                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                                r14.<init>(r0)
                                throw r14
                            L_0x0035:
                                lf.w.b(r14)
                                io.intercom.android.sdk.m5.data.CommonRepository r14 = r13.commonRepository
                                r0.L$0 = r13
                                r0.label = r3
                                java.lang.Object r14 = r14.openMessenger(r0)
                                if (r14 != r1) goto L_0x0045
                                return r1
                            L_0x0045:
                                r0 = r13
                            L_0x0046:
                                io.intercom.android.sdk.models.OpenMessengerResponse r14 = (io.intercom.android.sdk.models.OpenMessengerResponse) r14
                                if (r14 != 0) goto L_0x004f
                                io.intercom.android.sdk.helpcenter.articles.ArticleViewState$TeamPresenceState r14 = r0.getSearchBrowseTeamPresenceState()
                                return r14
                            L_0x004f:
                                io.intercom.android.sdk.models.OpenMessengerResponse$NewConversationData r14 = r14.getNewConversationData()
                                if (r14 != 0) goto L_0x005a
                                io.intercom.android.sdk.helpcenter.articles.ArticleViewState$TeamPresenceState r14 = r0.getSearchBrowseTeamPresenceState()
                                return r14
                            L_0x005a:
                                io.intercom.android.sdk.helpcenter.articles.ArticleViewState$TeamPresenceState r0 = r0.getSearchBrowseTeamPresenceState()
                                io.intercom.android.sdk.models.OpenMessengerResponse$NewConversationData$Cta r10 = r14.getCta()
                                r11 = 511(0x1ff, float:7.16E-43)
                                r12 = 0
                                r1 = 0
                                r2 = 0
                                r3 = 0
                                r4 = 0
                                r5 = 0
                                r6 = 0
                                r7 = 0
                                r8 = 0
                                r9 = 0
                                io.intercom.android.sdk.helpcenter.articles.ArticleViewState$TeamPresenceState r14 = io.intercom.android.sdk.helpcenter.articles.ArticleViewState.TeamPresenceState.copy$default(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
                                return r14
                            */
                            throw new UnsupportedOperationException("Method not decompiled: io.intercom.android.sdk.m5.helpcenter.HelpCenterViewModel.getCtaData(qf.d):java.lang.Object");
                        }

                        private final ArticleViewState.TeamPresenceState getSearchBrowseTeamPresenceState() {
                            return (ArticleViewState.TeamPresenceState) this.searchBrowseTeamPresenceState$delegate.getValue();
                        }

                        /* access modifiers changed from: private */
                        public final boolean isFromSearchBrowse() {
                            return C6496s.c(this.place, "search_browse");
                        }

                        /* Code decompiled incorrectly, please refer to instructions dump. */
                        public final java.lang.Object onNewConfig(qf.C6658d<? super lf.C6514M> r8) {
                            /*
                                r7 = this;
                                boolean r0 = r8 instanceof io.intercom.android.sdk.m5.helpcenter.HelpCenterViewModel$onNewConfig$1
                                if (r0 == 0) goto L_0x0013
                                r0 = r8
                                io.intercom.android.sdk.m5.helpcenter.HelpCenterViewModel$onNewConfig$1 r0 = (io.intercom.android.sdk.m5.helpcenter.HelpCenterViewModel$onNewConfig$1) r0
                                int r1 = r0.label
                                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                                r3 = r1 & r2
                                if (r3 == 0) goto L_0x0013
                                int r1 = r1 - r2
                                r0.label = r1
                                goto L_0x0018
                            L_0x0013:
                                io.intercom.android.sdk.m5.helpcenter.HelpCenterViewModel$onNewConfig$1 r0 = new io.intercom.android.sdk.m5.helpcenter.HelpCenterViewModel$onNewConfig$1
                                r0.<init>(r7, r8)
                            L_0x0018:
                                java.lang.Object r8 = r0.result
                                java.lang.Object r1 = rf.C6680b.f()
                                int r2 = r0.label
                                r3 = 2
                                r4 = 1
                                if (r2 == 0) goto L_0x004d
                                if (r2 == r4) goto L_0x003d
                                if (r2 != r3) goto L_0x0035
                                java.lang.Object r1 = r0.L$1
                                io.intercom.android.sdk.m5.helpcenter.states.CollectionDetailsUiState$Content r1 = (io.intercom.android.sdk.m5.helpcenter.states.CollectionDetailsUiState.Content) r1
                                java.lang.Object r0 = r0.L$0
                                Xg.x r0 = (Xg.x) r0
                                lf.w.b(r8)
                                goto L_0x00b7
                            L_0x0035:
                                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                                r8.<init>(r0)
                                throw r8
                            L_0x003d:
                                java.lang.Object r2 = r0.L$2
                                io.intercom.android.sdk.m5.helpcenter.states.CollectionsUiState$Content r2 = (io.intercom.android.sdk.m5.helpcenter.states.CollectionsUiState.Content) r2
                                java.lang.Object r4 = r0.L$1
                                Xg.x r4 = (Xg.x) r4
                                java.lang.Object r5 = r0.L$0
                                io.intercom.android.sdk.m5.helpcenter.HelpCenterViewModel r5 = (io.intercom.android.sdk.m5.helpcenter.HelpCenterViewModel) r5
                                lf.w.b(r8)
                                goto L_0x007a
                            L_0x004d:
                                lf.w.b(r8)
                                Xg.x r8 = r7._collectionsState
                                java.lang.Object r8 = r8.getValue()
                                io.intercom.android.sdk.m5.helpcenter.states.CollectionsUiState r8 = (io.intercom.android.sdk.m5.helpcenter.states.CollectionsUiState) r8
                                boolean r2 = r8 instanceof io.intercom.android.sdk.m5.helpcenter.states.CollectionsUiState.Content
                                if (r2 == 0) goto L_0x008d
                                Xg.x r2 = r7._collectionsState
                                boolean r5 = r7.shouldAddSendMessageRow()
                                if (r5 == 0) goto L_0x0082
                                io.intercom.android.sdk.m5.helpcenter.states.CollectionsUiState$Content r8 = (io.intercom.android.sdk.m5.helpcenter.states.CollectionsUiState.Content) r8
                                r0.L$0 = r7
                                r0.L$1 = r2
                                r0.L$2 = r8
                                r0.label = r4
                                java.lang.Object r4 = r7.getCtaData(r0)
                                if (r4 != r1) goto L_0x0075
                                return r1
                            L_0x0075:
                                r5 = r7
                                r6 = r2
                                r2 = r8
                                r8 = r4
                                r4 = r6
                            L_0x007a:
                                io.intercom.android.sdk.helpcenter.articles.ArticleViewState$TeamPresenceState r8 = (io.intercom.android.sdk.helpcenter.articles.ArticleViewState.TeamPresenceState) r8
                                io.intercom.android.sdk.m5.helpcenter.states.CollectionsUiState$Content r8 = r2.copyWithSingleSendMessageRow(r8)
                                r2 = r4
                                goto L_0x0089
                            L_0x0082:
                                io.intercom.android.sdk.m5.helpcenter.states.CollectionsUiState$Content r8 = (io.intercom.android.sdk.m5.helpcenter.states.CollectionsUiState.Content) r8
                                io.intercom.android.sdk.m5.helpcenter.states.CollectionsUiState$Content r8 = r8.copyWithoutSendMessageRow()
                                r5 = r7
                            L_0x0089:
                                r2.setValue(r8)
                                goto L_0x008e
                            L_0x008d:
                                r5 = r7
                            L_0x008e:
                                Xg.x r8 = r5._collectionDetailsState
                                java.lang.Object r8 = r8.getValue()
                                io.intercom.android.sdk.m5.helpcenter.states.CollectionDetailsUiState r8 = (io.intercom.android.sdk.m5.helpcenter.states.CollectionDetailsUiState) r8
                                boolean r2 = r8 instanceof io.intercom.android.sdk.m5.helpcenter.states.CollectionDetailsUiState.Content
                                if (r2 == 0) goto L_0x00c8
                                Xg.x r2 = r5._collectionDetailsState
                                boolean r4 = r5.shouldAddSendMessageRow()
                                if (r4 == 0) goto L_0x00bf
                                io.intercom.android.sdk.m5.helpcenter.states.CollectionDetailsUiState$Content r8 = (io.intercom.android.sdk.m5.helpcenter.states.CollectionDetailsUiState.Content) r8
                                r0.L$0 = r2
                                r0.L$1 = r8
                                r4 = 0
                                r0.L$2 = r4
                                r0.label = r3
                                java.lang.Object r0 = r5.getCtaData(r0)
                                if (r0 != r1) goto L_0x00b4
                                return r1
                            L_0x00b4:
                                r1 = r8
                                r8 = r0
                                r0 = r2
                            L_0x00b7:
                                io.intercom.android.sdk.helpcenter.articles.ArticleViewState$TeamPresenceState r8 = (io.intercom.android.sdk.helpcenter.articles.ArticleViewState.TeamPresenceState) r8
                                io.intercom.android.sdk.m5.helpcenter.states.CollectionDetailsUiState$Content r8 = r1.copyWithSingleSendMessageRow(r8)
                                r2 = r0
                                goto L_0x00c5
                            L_0x00bf:
                                io.intercom.android.sdk.m5.helpcenter.states.CollectionDetailsUiState$Content r8 = (io.intercom.android.sdk.m5.helpcenter.states.CollectionDetailsUiState.Content) r8
                                io.intercom.android.sdk.m5.helpcenter.states.CollectionDetailsUiState$Content r8 = r8.copyWithoutSendMessageRow()
                            L_0x00c5:
                                r2.setValue(r8)
                            L_0x00c8:
                                lf.M r8 = lf.C6514M.f71813a
                                return r8
                            */
                            throw new UnsupportedOperationException("Method not decompiled: io.intercom.android.sdk.m5.helpcenter.HelpCenterViewModel.onNewConfig(qf.d):java.lang.Object");
                        }

                        /* access modifiers changed from: private */
                        public static final ArticleViewState.TeamPresenceState searchBrowseTeamPresenceState_delegate$lambda$0(HelpCenterViewModel helpCenterViewModel) {
                            C6496s.h(helpCenterViewModel, "this$0");
                            return TeammateHelpKt.computeViewState((ArticleMetadata) null, ArticleViewState.TeamPresenceState.Companion.getDefaultTeamPresenceState(), (TeamPresence) helpCenterViewModel.intercomDataLayer.getTeamPresence().getValue(), helpCenterViewModel.appConfig, helpCenterViewModel.place, true);
                        }

                        /* access modifiers changed from: private */
                        public final void sendFailedCollectionListMetric(Integer num) {
                            String str;
                            MetricTracker metricTracker2 = this.metricTracker;
                            if (num != null) {
                                str = num.toString();
                            } else {
                                str = null;
                            }
                            metricTracker2.failedHelpCenter(MetricTracker.Object.HELP_CENTER, MetricTracker.Place.COLLECTION_LIST, str, isFromSearchBrowse());
                        }

                        static /* synthetic */ void sendFailedCollectionListMetric$default(HelpCenterViewModel helpCenterViewModel, Integer num, int i10, Object obj) {
                            if ((i10 & 1) != 0) {
                                num = null;
                            }
                            helpCenterViewModel.sendFailedCollectionListMetric(num);
                        }

                        /* access modifiers changed from: private */
                        public final void sendFailedSingleCollectionMetric(Integer num) {
                            String str;
                            MetricTracker metricTracker2 = this.metricTracker;
                            if (num != null) {
                                str = num.toString();
                            } else {
                                str = null;
                            }
                            metricTracker2.failedHelpCenter(MetricTracker.Object.HELP_CENTER, MetricTracker.Place.ARTICLE_LIST, str, isFromSearchBrowse());
                        }

                        static /* synthetic */ void sendFailedSingleCollectionMetric$default(HelpCenterViewModel helpCenterViewModel, Integer num, int i10, Object obj) {
                            if ((i10 & 1) != 0) {
                                num = null;
                            }
                            helpCenterViewModel.sendFailedSingleCollectionMetric(num);
                        }

                        /* access modifiers changed from: private */
                        public final boolean shouldAddSendMessageRow() {
                            if (!AppConfigExtensionsKt.canStartNewConversation(this.appConfig) || !this.hasClickedAtLeastOneArticle) {
                                return false;
                            }
                            return true;
                        }

                        /* access modifiers changed from: private */
                        public final List<CollectionsRow.CollectionRow> transformToUiModel(List<HelpCenterCollection> list) {
                            Iterable<HelpCenterCollection> iterable = list;
                            ArrayList arrayList = new ArrayList(C6565s.y(iterable, 10));
                            for (HelpCenterCollection helpCenterCollection : iterable) {
                                arrayList.add(new CollectionsRow.CollectionRow(new CollectionRowData(helpCenterCollection.getId(), helpCenterCollection.getTitle(), helpCenterCollection.getSummary().length() == 0 ? 8 : 0, helpCenterCollection.getSummary(), helpCenterCollection.getArticlesCount(), helpCenterCollection.getCollectionsCount())));
                            }
                            return arrayList;
                        }

                        public final void fetchCollectionDetails(String str) {
                            C6496s.h(str, "collectionId");
                            C5600w0 unused = C5576k.d(b0.a(this), this.dispatcher, (M) null, new HelpCenterViewModel$fetchCollectionDetails$1(this, str, (C6658d<? super HelpCenterViewModel$fetchCollectionDetails$1>) null), 2, (Object) null);
                        }

                        public final void fetchCollections(Set<String> set) {
                            C6496s.h(set, "collectionIds");
                            if (!this.helpCenterEligibilityChecker.isEligibleUser()) {
                                this._collectionsState.setValue(new CollectionsUiState.Error(this.genericError));
                            } else {
                                C5600w0 unused = C5576k.d(b0.a(this), this.dispatcher, (M) null, new HelpCenterViewModel$fetchCollections$1(this, set, (C6658d<? super HelpCenterViewModel$fetchCollections$1>) null), 2, (Object) null);
                            }
                        }

                        public final L getCollectionDetailsState() {
                            return this.collectionDetailsState;
                        }

                        public final L getCollectionsState() {
                            return this.collectionsState;
                        }

                        public final B getEffect() {
                            return this.effect;
                        }

                        public final StringProvider getScreenTitle() {
                            String spaceLabelIfExists = this.appConfig.getSpaceLabelIfExists(Space.Type.HELP);
                            if (spaceLabelIfExists != null) {
                                return new StringProvider.ActualString(spaceLabelIfExists);
                            }
                            return new StringProvider.StringRes(R.string.intercom_get_help, (List) null, 2, (DefaultConstructorMarker) null);
                        }

                        public final Context localizedContext(Context context) {
                            C6496s.h(context, "context");
                            Configuration configuration = new Configuration(context.getResources().getConfiguration());
                            configuration.setLocale(ContextLocaliser.convertToLocale(this.appConfig.getHelpCenterLocale()));
                            Context createConfigurationContext = context.createConfigurationContext(configuration);
                            C6496s.g(createConfigurationContext, "createConfigurationContext(...)");
                            return createConfigurationContext;
                        }

                        public final void onArticleClicked() {
                            C5600w0 unused = C5576k.d(b0.a(this), this.dispatcher, (M) null, new HelpCenterViewModel$onArticleClicked$1(this, (C6658d<? super HelpCenterViewModel$onArticleClicked$1>) null), 2, (Object) null);
                        }

                        public HelpCenterViewModel(HelpCenterApi helpCenterApi2, AppConfig appConfig2, MetricTracker metricTracker2, String str, HelpCenterEligibilityChecker helpCenterEligibilityChecker2, G g10, IntercomDataLayer intercomDataLayer2, CommonRepository commonRepository2) {
                            HelpCenterApi helpCenterApi3 = helpCenterApi2;
                            AppConfig appConfig3 = appConfig2;
                            MetricTracker metricTracker3 = metricTracker2;
                            String str2 = str;
                            HelpCenterEligibilityChecker helpCenterEligibilityChecker3 = helpCenterEligibilityChecker2;
                            G g11 = g10;
                            IntercomDataLayer intercomDataLayer3 = intercomDataLayer2;
                            CommonRepository commonRepository3 = commonRepository2;
                            C6496s.h(helpCenterApi3, "helpCenterApi");
                            C6496s.h(appConfig3, "appConfig");
                            C6496s.h(metricTracker3, "metricTracker");
                            C6496s.h(str2, "place");
                            C6496s.h(helpCenterEligibilityChecker3, "helpCenterEligibilityChecker");
                            C6496s.h(g11, "dispatcher");
                            C6496s.h(intercomDataLayer3, "intercomDataLayer");
                            C6496s.h(commonRepository3, "commonRepository");
                            this.helpCenterApi = helpCenterApi3;
                            this.appConfig = appConfig3;
                            this.metricTracker = metricTracker3;
                            this.place = str2;
                            this.helpCenterEligibilityChecker = helpCenterEligibilityChecker3;
                            this.dispatcher = g11;
                            this.intercomDataLayer = intercomDataLayer3;
                            this.commonRepository = commonRepository3;
                            x a10 = N.a(CollectionsUiState.Initial.INSTANCE);
                            this._collectionsState = a10;
                            this.collectionsState = C5696h.b(a10);
                            x a11 = N.a(CollectionDetailsUiState.Initial.INSTANCE);
                            this._collectionDetailsState = a11;
                            this.collectionDetailsState = C5696h.b(a11);
                            w b10 = D.b(0, 0, (a) null, 7, (Object) null);
                            this._effect = b10;
                            this.effect = t.g(b10, b0.a(this), H.f66443a.c(), 0, 4, (Object) null);
                            this.genericError = new ErrorState.WithoutCTA(0, 0, (Integer) null, 7, (DefaultConstructorMarker) null);
                            this.notFoundError = new ErrorState.WithoutCTA(0, R.string.intercom_page_not_found, (Integer) null, 5, (DefaultConstructorMarker) null);
                            this.searchBrowseTeamPresenceState$delegate = C6531o.b(new a(this));
                            if (str.length() > 0) {
                                metricTracker3.openedNativeHelpCenter(str2, (String) null);
                            }
                            C5600w0 unused = C5576k.d(b0.a(this), (g) null, (M) null, new AnonymousClass1(this, (C6658d<? super AnonymousClass1>) null), 3, (Object) null);
                        }

                        /* access modifiers changed from: private */
                        public final List<CollectionDetailsRow> transformToUiModel(HelpCenterCollectionContent helpCenterCollectionContent) {
                            ArrayList arrayList = new ArrayList();
                            Iterable<HelpCenterArticle> helpCenterArticles = helpCenterCollectionContent.getHelpCenterArticles();
                            ArrayList arrayList2 = new ArrayList(C6565s.y(helpCenterArticles, 10));
                            for (HelpCenterArticle helpCenterArticle : helpCenterArticles) {
                                arrayList2.add(new CollectionDetailsRow.ArticleRow(helpCenterArticle.getArticleId(), helpCenterArticle.getTitle()));
                            }
                            arrayList.addAll(arrayList2);
                            Iterable<HelpCenterCollection> subCollections = helpCenterCollectionContent.getSubCollections();
                            ArrayList arrayList3 = new ArrayList(C6565s.y(subCollections, 10));
                            for (HelpCenterCollection helpCenterCollection : subCollections) {
                                arrayList3.add(new CollectionDetailsRow.CollectionRow(new CollectionRowData(helpCenterCollection.getId(), helpCenterCollection.getTitle(), helpCenterCollection.getSummary().length() == 0 ? 8 : 0, helpCenterCollection.getSummary(), helpCenterCollection.getArticlesCount(), helpCenterCollection.getCollectionsCount())));
                            }
                            arrayList.addAll(arrayList3);
                            return arrayList;
                        }
                    }
