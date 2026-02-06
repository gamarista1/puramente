package io.intercom.android.sdk.tickets.create.model;

import Ug.C5600w0;
import Ug.G;
import Ug.K;
import Ug.M;
import Wg.a;
import Xg.B;
import Xg.C5695g;
import Xg.C5696h;
import Xg.D;
import Xg.L;
import Xg.N;
import Xg.w;
import Xg.x;
import android.content.Context;
import android.webkit.MimeTypeMap;
import androidx.lifecycle.a0;
import androidx.lifecycle.b0;
import androidx.lifecycle.c0;
import androidx.lifecycle.e0;
import com.amazon.a.a.o.b;
import io.intercom.android.sdk.blocks.lib.models.TicketTypeV2;
import io.intercom.android.sdk.identity.AppConfig;
import io.intercom.android.sdk.identity.UserIdentity;
import io.intercom.android.sdk.m5.components.ErrorState;
import io.intercom.android.sdk.m5.conversation.ui.components.composer.MediaData;
import io.intercom.android.sdk.metrics.MetricTracker;
import io.intercom.android.sdk.survey.QuestionState;
import io.intercom.android.sdk.survey.model.SurveyData;
import io.intercom.android.sdk.survey.ui.models.Answer;
import io.intercom.android.sdk.survey.ui.questiontype.AnswerClickData;
import io.intercom.android.sdk.tickets.create.data.TicketAttributeRequest;
import io.intercom.android.sdk.tickets.create.data.TicketRepository;
import io.intercom.android.sdk.tickets.create.reducers.ConditionalAttributesReducerKt;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lf.C6514M;
import lf.C6527k;
import mf.C6565s;
import qf.C6658d;
import qf.g;
import rf.C6680b;
import yf.C6798l;
import yf.p;

@Metadata(d1 = {"\u0000¾\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u0000 f2\u00020\u0001:\u0003fghB]\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u0011\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u001f\u0010\u001d\u001a\u00020\u001c2\u000e\b\u0002\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0019H\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ%\u0010$\u001a\u00020#2\u0006\u0010 \u001a\u00020\u001f2\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u000e0!H\u0002¢\u0006\u0004\b$\u0010%J\u0017\u0010&\u001a\u00020#2\u0006\u0010 \u001a\u00020\u001fH\u0002¢\u0006\u0004\b&\u0010'J'\u0010,\u001a\u00020#2\u0006\u0010)\u001a\u00020(2\u0006\u0010*\u001a\u00020\u00102\u0006\u0010+\u001a\u00020\u0010H\u0002¢\u0006\u0004\b,\u0010-J#\u00101\u001a\u00020\u001c2\u0012\u00100\u001a\u000e\u0012\u0004\u0012\u00020/\u0012\u0004\u0012\u00020\u001c0.H\u0002¢\u0006\u0004\b1\u00102J\u0015\u00103\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0019H\u0002¢\u0006\u0004\b3\u00104J\u000f\u00105\u001a\u00020\u001cH\u0002¢\u0006\u0004\b5\u00106J\u001d\u00108\u001a\u00020\u001c2\f\u00107\u001a\b\u0012\u0004\u0012\u00020(0\u0019H\u0002¢\u0006\u0004\b8\u0010\u001eJ\u0019\u0010;\u001a\u00020\u001c2\n\b\u0002\u0010:\u001a\u0004\u0018\u000109¢\u0006\u0004\b;\u0010<J\u0015\u0010>\u001a\u00020\u001c2\u0006\u0010=\u001a\u00020\u000e¢\u0006\u0004\b>\u0010?J\u0015\u0010B\u001a\u00020\u001c2\u0006\u0010A\u001a\u00020@¢\u0006\u0004\bB\u0010CJ\u0015\u0010D\u001a\u00020\u001c2\u0006\u0010A\u001a\u00020@¢\u0006\u0004\bD\u0010CJ\u0015\u0010F\u001a\u00020\u001c2\u0006\u0010E\u001a\u00020@¢\u0006\u0004\bF\u0010CR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010GR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010HR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010IR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\t\u0010JR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010KR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0004¢\u0006\u0006\n\u0004\b\r\u0010LR\u0016\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010MR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010NR\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010OR\u001a\u0010Q\u001a\b\u0012\u0004\u0012\u00020\u00160P8\u0002X\u0004¢\u0006\u0006\n\u0004\bQ\u0010RR\u001d\u0010T\u001a\b\u0012\u0004\u0012\u00020\u00160S8\u0006¢\u0006\f\n\u0004\bT\u0010U\u001a\u0004\bV\u0010WR\u0018\u0010X\u001a\u0004\u0018\u00010/8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bX\u0010YR\u001a\u0010\\\u001a\b\u0012\u0004\u0012\u00020[0Z8\u0002X\u0004¢\u0006\u0006\n\u0004\b\\\u0010]R\u001d\u0010_\u001a\b\u0012\u0004\u0012\u00020[0^8\u0006¢\u0006\f\n\u0004\b_\u0010`\u001a\u0004\ba\u0010bR\u0018\u0010d\u001a\u0004\u0018\u00010c8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bd\u0010e¨\u0006i"}, d2 = {"Lio/intercom/android/sdk/tickets/create/model/CreateTicketViewModel;", "Landroidx/lifecycle/a0;", "Lio/intercom/android/sdk/tickets/create/model/CreateTicketLaunchedFrom;", "launchedFrom", "Lio/intercom/android/sdk/tickets/create/data/TicketRepository;", "ticketRepository", "Lio/intercom/android/sdk/identity/UserIdentity;", "userIdentity", "Lio/intercom/android/sdk/identity/AppConfig;", "config", "LUg/G;", "dispatcher", "Lio/intercom/android/sdk/metrics/MetricTracker;", "metricTracker", "", "conversationId", "", "ticketTypeId", "Landroid/content/Context;", "applicationContext", "<init>", "(Lio/intercom/android/sdk/tickets/create/model/CreateTicketLaunchedFrom;Lio/intercom/android/sdk/tickets/create/data/TicketRepository;Lio/intercom/android/sdk/identity/UserIdentity;Lio/intercom/android/sdk/identity/AppConfig;LUg/G;Lio/intercom/android/sdk/metrics/MetricTracker;Ljava/lang/String;ILandroid/content/Context;)V", "Lio/intercom/android/sdk/tickets/create/model/CreateTicketViewModel$CreateTicketFormUiState;", "getLastKnownContent", "()Lio/intercom/android/sdk/tickets/create/model/CreateTicketViewModel$CreateTicketFormUiState;", "", "Lio/intercom/android/sdk/tickets/create/data/TicketAttributeRequest;", "attributes", "Llf/M;", "fetchTicketType", "(Ljava/util/List;)V", "Lio/intercom/android/sdk/m5/conversation/ui/components/composer/MediaData$Media;", "data", "", "supportedFileType", "", "isUnsupportedFileType", "(Lio/intercom/android/sdk/m5/conversation/ui/components/composer/MediaData$Media;Ljava/util/Set;)Z", "isFileSizeExceeded", "(Lio/intercom/android/sdk/m5/conversation/ui/components/composer/MediaData$Media;)Z", "Lio/intercom/android/sdk/survey/ui/models/Answer$MediaAnswer$MediaItem;", "mediaItem", "index", "maxSelection", "canRetryFileLimitExceededError", "(Lio/intercom/android/sdk/survey/ui/models/Answer$MediaAnswer$MediaItem;II)Z", "Lkotlin/Function1;", "Lio/intercom/android/sdk/tickets/create/model/CreateTicketViewModel$CreateTicketFormUiState$Content;", "operation", "withState", "(Lyf/l;)V", "getAttributeRequest", "()Ljava/util/List;", "updateCtaState", "()V", "mediaItems", "compressAndUploadFileAttachments", "LUg/K;", "compositionAwareScope", "createTicket", "(LUg/K;)V", "questionID", "onAnswerUpdated", "(Ljava/lang/String;)V", "Lio/intercom/android/sdk/survey/ui/questiontype/AnswerClickData;", "fileClickData", "onRetryFileClicked", "(Lio/intercom/android/sdk/survey/ui/questiontype/AnswerClickData;)V", "onDeleteFileClicked", "answerClickData", "onAnswerClicked", "Lio/intercom/android/sdk/tickets/create/model/CreateTicketLaunchedFrom;", "Lio/intercom/android/sdk/tickets/create/data/TicketRepository;", "Lio/intercom/android/sdk/identity/UserIdentity;", "Lio/intercom/android/sdk/identity/AppConfig;", "LUg/G;", "Lio/intercom/android/sdk/metrics/MetricTracker;", "Ljava/lang/String;", "I", "Landroid/content/Context;", "LXg/x;", "_uiState", "LXg/x;", "LXg/L;", "uiState", "LXg/L;", "getUiState", "()LXg/L;", "lastKnownContentState", "Lio/intercom/android/sdk/tickets/create/model/CreateTicketViewModel$CreateTicketFormUiState$Content;", "LXg/w;", "Lio/intercom/android/sdk/tickets/create/model/CreateTicketViewModel$TicketSideEffect;", "_effect", "LXg/w;", "LXg/B;", "effect", "LXg/B;", "getEffect", "()LXg/B;", "Lio/intercom/android/sdk/blocks/lib/models/TicketTypeV2;", "currentTicketType", "Lio/intercom/android/sdk/blocks/lib/models/TicketTypeV2;", "Companion", "CreateTicketFormUiState", "TicketSideEffect", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class CreateTicketViewModel extends a0 {
    public static final int $stable = 8;
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */
    public final w _effect;
    /* access modifiers changed from: private */
    public final x _uiState;
    /* access modifiers changed from: private */
    public final Context applicationContext;
    /* access modifiers changed from: private */
    public final AppConfig config;
    /* access modifiers changed from: private */
    public final String conversationId;
    /* access modifiers changed from: private */
    public TicketTypeV2 currentTicketType;
    /* access modifiers changed from: private */
    public final G dispatcher;
    private final B effect;
    /* access modifiers changed from: private */
    public CreateTicketFormUiState.Content lastKnownContentState;
    private final CreateTicketLaunchedFrom launchedFrom;
    private final MetricTracker metricTracker;
    /* access modifiers changed from: private */
    public final TicketRepository ticketRepository;
    /* access modifiers changed from: private */
    public final int ticketTypeId;
    private final L uiState;
    /* access modifiers changed from: private */
    public final UserIdentity userIdentity;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LUg/K;", "Llf/M;", "<anonymous>", "(LUg/K;)V"}, k = 3, mv = {2, 0, 0})
    @f(c = "io.intercom.android.sdk.tickets.create.model.CreateTicketViewModel$1", f = "CreateTicketViewModel.kt", l = {86}, m = "invokeSuspend")
    /* renamed from: io.intercom.android.sdk.tickets.create.model.CreateTicketViewModel$1  reason: invalid class name */
    static final class AnonymousClass1 extends l implements p {
        int label;
        final /* synthetic */ CreateTicketViewModel this$0;

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
                x access$get_uiState$p = this.this$0._uiState;
                final CreateTicketViewModel createTicketViewModel = this.this$0;
                AnonymousClass1 r12 = new C5695g() {
                    public final Object emit(CreateTicketFormUiState createTicketFormUiState, C6658d<? super C6514M> dVar) {
                        if (createTicketFormUiState instanceof CreateTicketFormUiState.Content) {
                            createTicketViewModel.lastKnownContentState = (CreateTicketFormUiState.Content) createTicketFormUiState;
                        }
                        return C6514M.f71813a;
                    }
                };
                this.label = 1;
                if (access$get_uiState$p.collect(r12, this) == f10) {
                    return f10;
                }
            } else if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                lf.w.b(obj);
            }
            throw new C6527k();
        }
    }

    @Metadata(d1 = {"\u00003\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\n\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J)\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ/\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lio/intercom/android/sdk/tickets/create/model/CreateTicketViewModel$Companion;", "", "<init>", "()V", "", "ticketTypeId", "", "conversationId", "Lio/intercom/android/sdk/tickets/create/model/CreateTicketLaunchedFrom;", "launchedFrom", "io/intercom/android/sdk/tickets/create/model/CreateTicketViewModel$Companion$factory$1", "factory", "(ILjava/lang/String;Lio/intercom/android/sdk/tickets/create/model/CreateTicketLaunchedFrom;)Lio/intercom/android/sdk/tickets/create/model/CreateTicketViewModel$Companion$factory$1;", "Landroidx/lifecycle/e0;", "owner", "Lio/intercom/android/sdk/tickets/create/model/CreateTicketViewModel;", "create", "(Landroidx/lifecycle/e0;ILjava/lang/String;Lio/intercom/android/sdk/tickets/create/model/CreateTicketLaunchedFrom;)Lio/intercom/android/sdk/tickets/create/model/CreateTicketViewModel;", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final CreateTicketViewModel$Companion$factory$1 factory(int i10, String str, CreateTicketLaunchedFrom createTicketLaunchedFrom) {
            return new CreateTicketViewModel$Companion$factory$1(createTicketLaunchedFrom, str, i10);
        }

        public final CreateTicketViewModel create(e0 e0Var, int i10, String str, CreateTicketLaunchedFrom createTicketLaunchedFrom) {
            C6496s.h(e0Var, "owner");
            C6496s.h(createTicketLaunchedFrom, "launchedFrom");
            return (CreateTicketViewModel) new c0(e0Var, (c0.c) factory(i10, str, createTicketLaunchedFrom)).b(CreateTicketViewModel.class);
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0005¢\u0006\u0004\b\u0002\u0010\u0003\u0001\u0004\b\t\n\u000b¨\u0006\f"}, d2 = {"Lio/intercom/android/sdk/tickets/create/model/CreateTicketViewModel$CreateTicketFormUiState;", "", "<init>", "()V", "Initial", "Loading", "Error", "Content", "Lio/intercom/android/sdk/tickets/create/model/CreateTicketViewModel$CreateTicketFormUiState$Content;", "Lio/intercom/android/sdk/tickets/create/model/CreateTicketViewModel$CreateTicketFormUiState$Error;", "Lio/intercom/android/sdk/tickets/create/model/CreateTicketViewModel$CreateTicketFormUiState$Initial;", "Lio/intercom/android/sdk/tickets/create/model/CreateTicketViewModel$CreateTicketFormUiState$Loading;", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static abstract class CreateTicketFormUiState {
        public static final int $stable = 0;

        @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\t\u0010\u0015\u001a\u00020\bHÆ\u0003J\t\u0010\u0016\u001a\u00020\bHÆ\u0003J7\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\bHÇ\u0001J\u0013\u0010\u0018\u001a\u00020\b2\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH×\u0003J\t\u0010\u001b\u001a\u00020\u001cH×\u0001J\t\u0010\u001d\u001a\u00020\u0003H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\t\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011¨\u0006\u001e"}, d2 = {"Lio/intercom/android/sdk/tickets/create/model/CreateTicketViewModel$CreateTicketFormUiState$Content;", "Lio/intercom/android/sdk/tickets/create/model/CreateTicketViewModel$CreateTicketFormUiState;", "title", "", "questions", "", "Lio/intercom/android/sdk/survey/QuestionState;", "showCreatingTicketProgress", "", "enableCta", "<init>", "(Ljava/lang/String;Ljava/util/List;ZZ)V", "getTitle", "()Ljava/lang/String;", "getQuestions", "()Ljava/util/List;", "getShowCreatingTicketProgress", "()Z", "getEnableCta", "component1", "component2", "component3", "component4", "copy", "equals", "other", "", "hashCode", "", "toString", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Content extends CreateTicketFormUiState {
            public static final int $stable = 8;
            private final boolean enableCta;
            private final List<QuestionState> questions;
            private final boolean showCreatingTicketProgress;
            private final String title;

            /* JADX INFO: this call moved to the top of the method (can break code semantics) */
            public /* synthetic */ Content(String str, List list, boolean z10, boolean z11, int i10, DefaultConstructorMarker defaultConstructorMarker) {
                this(str, list, (i10 & 4) != 0 ? false : z10, (i10 & 8) != 0 ? true : z11);
            }

            public static /* synthetic */ Content copy$default(Content content, String str, List<QuestionState> list, boolean z10, boolean z11, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    str = content.title;
                }
                if ((i10 & 2) != 0) {
                    list = content.questions;
                }
                if ((i10 & 4) != 0) {
                    z10 = content.showCreatingTicketProgress;
                }
                if ((i10 & 8) != 0) {
                    z11 = content.enableCta;
                }
                return content.copy(str, list, z10, z11);
            }

            public final String component1() {
                return this.title;
            }

            public final List<QuestionState> component2() {
                return this.questions;
            }

            public final boolean component3() {
                return this.showCreatingTicketProgress;
            }

            public final boolean component4() {
                return this.enableCta;
            }

            public final Content copy(String str, List<QuestionState> list, boolean z10, boolean z11) {
                C6496s.h(str, b.f37461S);
                C6496s.h(list, "questions");
                return new Content(str, list, z10, z11);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Content)) {
                    return false;
                }
                Content content = (Content) obj;
                return C6496s.c(this.title, content.title) && C6496s.c(this.questions, content.questions) && this.showCreatingTicketProgress == content.showCreatingTicketProgress && this.enableCta == content.enableCta;
            }

            public final boolean getEnableCta() {
                return this.enableCta;
            }

            public final List<QuestionState> getQuestions() {
                return this.questions;
            }

            public final boolean getShowCreatingTicketProgress() {
                return this.showCreatingTicketProgress;
            }

            public final String getTitle() {
                return this.title;
            }

            public int hashCode() {
                return (((((this.title.hashCode() * 31) + this.questions.hashCode()) * 31) + Boolean.hashCode(this.showCreatingTicketProgress)) * 31) + Boolean.hashCode(this.enableCta);
            }

            public String toString() {
                return "Content(title=" + this.title + ", questions=" + this.questions + ", showCreatingTicketProgress=" + this.showCreatingTicketProgress + ", enableCta=" + this.enableCta + ')';
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public Content(String str, List<QuestionState> list, boolean z10, boolean z11) {
                super((DefaultConstructorMarker) null);
                C6496s.h(str, b.f37461S);
                C6496s.h(list, "questions");
                this.title = str;
                this.questions = list;
                this.showCreatingTicketProgress = z10;
                this.enableCta = z11;
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÇ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH×\u0003J\t\u0010\u000e\u001a\u00020\u000fH×\u0001J\t\u0010\u0010\u001a\u00020\u0011H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lio/intercom/android/sdk/tickets/create/model/CreateTicketViewModel$CreateTicketFormUiState$Error;", "Lio/intercom/android/sdk/tickets/create/model/CreateTicketViewModel$CreateTicketFormUiState;", "errorState", "Lio/intercom/android/sdk/m5/components/ErrorState;", "<init>", "(Lio/intercom/android/sdk/m5/components/ErrorState;)V", "getErrorState", "()Lio/intercom/android/sdk/m5/components/ErrorState;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Error extends CreateTicketFormUiState {
            public static final int $stable = 0;
            private final ErrorState errorState;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public Error(ErrorState errorState2) {
                super((DefaultConstructorMarker) null);
                C6496s.h(errorState2, "errorState");
                this.errorState = errorState2;
            }

            public static /* synthetic */ Error copy$default(Error error, ErrorState errorState2, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    errorState2 = error.errorState;
                }
                return error.copy(errorState2);
            }

            public final ErrorState component1() {
                return this.errorState;
            }

            public final Error copy(ErrorState errorState2) {
                C6496s.h(errorState2, "errorState");
                return new Error(errorState2);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Error) && C6496s.c(this.errorState, ((Error) obj).errorState);
            }

            public final ErrorState getErrorState() {
                return this.errorState;
            }

            public int hashCode() {
                return this.errorState.hashCode();
            }

            public String toString() {
                return "Error(errorState=" + this.errorState + ')';
            }
        }

        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H×\u0003J\t\u0010\b\u001a\u00020\tH×\u0001J\t\u0010\n\u001a\u00020\u000bH×\u0001¨\u0006\f"}, d2 = {"Lio/intercom/android/sdk/tickets/create/model/CreateTicketViewModel$CreateTicketFormUiState$Initial;", "Lio/intercom/android/sdk/tickets/create/model/CreateTicketViewModel$CreateTicketFormUiState;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Initial extends CreateTicketFormUiState {
            public static final int $stable = 0;
            public static final Initial INSTANCE = new Initial();

            private Initial() {
                super((DefaultConstructorMarker) null);
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof Initial);
            }

            public int hashCode() {
                return 1870846745;
            }

            public String toString() {
                return "Initial";
            }
        }

        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H×\u0003J\t\u0010\b\u001a\u00020\tH×\u0001J\t\u0010\n\u001a\u00020\u000bH×\u0001¨\u0006\f"}, d2 = {"Lio/intercom/android/sdk/tickets/create/model/CreateTicketViewModel$CreateTicketFormUiState$Loading;", "Lio/intercom/android/sdk/tickets/create/model/CreateTicketViewModel$CreateTicketFormUiState;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Loading extends CreateTicketFormUiState {
            public static final int $stable = 0;
            public static final Loading INSTANCE = new Loading();

            private Loading() {
                super((DefaultConstructorMarker) null);
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof Loading);
            }

            public int hashCode() {
                return 259155217;
            }

            public String toString() {
                return "Loading";
            }
        }

        public /* synthetic */ CreateTicketFormUiState(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private CreateTicketFormUiState() {
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b1\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0005¢\u0006\u0004\b\u0002\u0010\u0003\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lio/intercom/android/sdk/tickets/create/model/CreateTicketViewModel$TicketSideEffect;", "", "<init>", "()V", "Finish", "AnswerClicked", "Lio/intercom/android/sdk/tickets/create/model/CreateTicketViewModel$TicketSideEffect$AnswerClicked;", "Lio/intercom/android/sdk/tickets/create/model/CreateTicketViewModel$TicketSideEffect$Finish;", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static abstract class TicketSideEffect {
        public static final int $stable = 0;

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÇ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH×\u0003J\t\u0010\u000e\u001a\u00020\u000fH×\u0001J\t\u0010\u0010\u001a\u00020\u0011H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lio/intercom/android/sdk/tickets/create/model/CreateTicketViewModel$TicketSideEffect$AnswerClicked;", "Lio/intercom/android/sdk/tickets/create/model/CreateTicketViewModel$TicketSideEffect;", "answerClickData", "Lio/intercom/android/sdk/survey/ui/questiontype/AnswerClickData;", "<init>", "(Lio/intercom/android/sdk/survey/ui/questiontype/AnswerClickData;)V", "getAnswerClickData", "()Lio/intercom/android/sdk/survey/ui/questiontype/AnswerClickData;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class AnswerClicked extends TicketSideEffect {
            public static final int $stable = 8;
            private final AnswerClickData answerClickData;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public AnswerClicked(AnswerClickData answerClickData2) {
                super((DefaultConstructorMarker) null);
                C6496s.h(answerClickData2, "answerClickData");
                this.answerClickData = answerClickData2;
            }

            public static /* synthetic */ AnswerClicked copy$default(AnswerClicked answerClicked, AnswerClickData answerClickData2, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    answerClickData2 = answerClicked.answerClickData;
                }
                return answerClicked.copy(answerClickData2);
            }

            public final AnswerClickData component1() {
                return this.answerClickData;
            }

            public final AnswerClicked copy(AnswerClickData answerClickData2) {
                C6496s.h(answerClickData2, "answerClickData");
                return new AnswerClicked(answerClickData2);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof AnswerClicked) && C6496s.c(this.answerClickData, ((AnswerClicked) obj).answerClickData);
            }

            public final AnswerClickData getAnswerClickData() {
                return this.answerClickData;
            }

            public int hashCode() {
                return this.answerClickData.hashCode();
            }

            public String toString() {
                return "AnswerClicked(answerClickData=" + this.answerClickData + ')';
            }
        }

        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H×\u0003J\t\u0010\b\u001a\u00020\tH×\u0001J\t\u0010\n\u001a\u00020\u000bH×\u0001¨\u0006\f"}, d2 = {"Lio/intercom/android/sdk/tickets/create/model/CreateTicketViewModel$TicketSideEffect$Finish;", "Lio/intercom/android/sdk/tickets/create/model/CreateTicketViewModel$TicketSideEffect;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Finish extends TicketSideEffect {
            public static final int $stable = 0;
            public static final Finish INSTANCE = new Finish();

            private Finish() {
                super((DefaultConstructorMarker) null);
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof Finish);
            }

            public int hashCode() {
                return -1916377057;
            }

            public String toString() {
                return "Finish";
            }
        }

        public /* synthetic */ TicketSideEffect(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TicketSideEffect() {
        }
    }

    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ CreateTicketViewModel(io.intercom.android.sdk.tickets.create.model.CreateTicketLaunchedFrom r20, io.intercom.android.sdk.tickets.create.data.TicketRepository r21, io.intercom.android.sdk.identity.UserIdentity r22, io.intercom.android.sdk.identity.AppConfig r23, Ug.G r24, io.intercom.android.sdk.metrics.MetricTracker r25, java.lang.String r26, int r27, android.content.Context r28, int r29, kotlin.jvm.internal.DefaultConstructorMarker r30) {
        /*
            r19 = this;
            r0 = r29
            r1 = r0 & 2
            if (r1 == 0) goto L_0x0015
            io.intercom.android.sdk.tickets.create.data.TicketRepository r1 = new io.intercom.android.sdk.tickets.create.data.TicketRepository
            r7 = 15
            r8 = 0
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r2 = r1
            r2.<init>(r3, r4, r5, r6, r7, r8)
            r11 = r1
            goto L_0x0017
        L_0x0015:
            r11 = r21
        L_0x0017:
            r1 = r0 & 4
            if (r1 == 0) goto L_0x0025
            io.intercom.android.sdk.Injector r1 = io.intercom.android.sdk.Injector.get()
            io.intercom.android.sdk.identity.UserIdentity r1 = r1.getUserIdentity()
            r12 = r1
            goto L_0x0027
        L_0x0025:
            r12 = r22
        L_0x0027:
            r1 = r0 & 8
            if (r1 == 0) goto L_0x003b
            io.intercom.android.sdk.Injector r1 = io.intercom.android.sdk.Injector.get()
            io.intercom.android.sdk.Provider r1 = r1.getAppConfigProvider()
            java.lang.Object r1 = r1.get()
            io.intercom.android.sdk.identity.AppConfig r1 = (io.intercom.android.sdk.identity.AppConfig) r1
            r13 = r1
            goto L_0x003d
        L_0x003b:
            r13 = r23
        L_0x003d:
            r1 = r0 & 16
            if (r1 == 0) goto L_0x0047
            Ug.G r1 = Ug.Z.b()
            r14 = r1
            goto L_0x0049
        L_0x0047:
            r14 = r24
        L_0x0049:
            r1 = r0 & 32
            if (r1 == 0) goto L_0x0057
            io.intercom.android.sdk.Injector r1 = io.intercom.android.sdk.Injector.get()
            io.intercom.android.sdk.metrics.MetricTracker r1 = r1.getMetricTracker()
            r15 = r1
            goto L_0x0059
        L_0x0057:
            r15 = r25
        L_0x0059:
            r0 = r0 & 256(0x100, float:3.59E-43)
            if (r0 == 0) goto L_0x0068
            io.intercom.android.sdk.Injector r0 = io.intercom.android.sdk.Injector.get()
            android.app.Application r0 = r0.getApplication()
            r18 = r0
            goto L_0x006a
        L_0x0068:
            r18 = r28
        L_0x006a:
            r9 = r19
            r10 = r20
            r16 = r26
            r17 = r27
            r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17, r18)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: io.intercom.android.sdk.tickets.create.model.CreateTicketViewModel.<init>(io.intercom.android.sdk.tickets.create.model.CreateTicketLaunchedFrom, io.intercom.android.sdk.tickets.create.data.TicketRepository, io.intercom.android.sdk.identity.UserIdentity, io.intercom.android.sdk.identity.AppConfig, Ug.G, io.intercom.android.sdk.metrics.MetricTracker, java.lang.String, int, android.content.Context, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    /* access modifiers changed from: private */
    public final boolean canRetryFileLimitExceededError(Answer.MediaAnswer.MediaItem mediaItem, int i10, int i11) {
        if (mediaItem.getUploadStatus() instanceof Answer.MediaAnswer.FileUploadStatus.Error) {
            Answer.MediaAnswer.FileUploadStatus uploadStatus = mediaItem.getUploadStatus();
            C6496s.f(uploadStatus, "null cannot be cast to non-null type io.intercom.android.sdk.survey.ui.models.Answer.MediaAnswer.FileUploadStatus.Error");
            if (!(((Answer.MediaAnswer.FileUploadStatus.Error) uploadStatus).getError() instanceof Answer.MediaAnswer.FileUploadError.FileLimitExceeded) || i10 >= i11) {
                return false;
            }
            return true;
        }
        return false;
    }

    /* access modifiers changed from: private */
    public final void compressAndUploadFileAttachments(List<Answer.MediaAnswer.MediaItem> list) {
        C5600w0 unused = C5576k.d(b0.a(this), this.dispatcher, (M) null, new CreateTicketViewModel$compressAndUploadFileAttachments$1(list, this, (C6658d<? super CreateTicketViewModel$compressAndUploadFileAttachments$1>) null), 2, (Object) null);
    }

    public static /* synthetic */ void createTicket$default(CreateTicketViewModel createTicketViewModel, K k10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            k10 = null;
        }
        createTicketViewModel.createTicket(k10);
    }

    /* access modifiers changed from: private */
    public static final C6514M createTicket$lambda$0(CreateTicketViewModel createTicketViewModel, K k10, CreateTicketFormUiState.Content content) {
        C6496s.h(createTicketViewModel, "this$0");
        C6496s.h(content, "content");
        C5600w0 unused = C5576k.d(b0.a(createTicketViewModel), createTicketViewModel.dispatcher, (M) null, new CreateTicketViewModel$createTicket$1$1(content, createTicketViewModel, k10, (C6658d<? super CreateTicketViewModel$createTicket$1$1>) null), 2, (Object) null);
        return C6514M.f71813a;
    }

    /* access modifiers changed from: private */
    public final void fetchTicketType(List<TicketAttributeRequest> list) {
        C5600w0 unused = C5576k.d(b0.a(this), this.dispatcher, (M) null, new CreateTicketViewModel$fetchTicketType$1(this, list, (C6658d<? super CreateTicketViewModel$fetchTicketType$1>) null), 2, (Object) null);
    }

    static /* synthetic */ void fetchTicketType$default(CreateTicketViewModel createTicketViewModel, List list, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            list = C6565s.n();
        }
        createTicketViewModel.fetchTicketType(list);
    }

    /* access modifiers changed from: private */
    public final List<TicketAttributeRequest> getAttributeRequest() {
        ArrayList arrayList = new ArrayList();
        withState(new e(arrayList));
        return arrayList;
    }

    /* access modifiers changed from: private */
    public static final C6514M getAttributeRequest$lambda$6(List list, CreateTicketFormUiState.Content content) {
        C6496s.h(list, "$list");
        C6496s.h(content, "content");
        ArrayList<QuestionState> arrayList = new ArrayList<>();
        for (Object next : content.getQuestions()) {
            if (!C6496s.c(((QuestionState) next).getQuestionModel().getId(), CreateTicketViewModelKt.EmailId)) {
                arrayList.add(next);
            }
        }
        for (QuestionState questionState : arrayList) {
            Object access$formatAnswerForServer = CreateTicketViewModelKt.formatAnswerForServer(questionState);
            if (!C6496s.c(access$formatAnswerForServer, C6514M.f71813a)) {
                list.add(new TicketAttributeRequest(questionState.getQuestionModel().getId(), access$formatAnswerForServer));
            }
        }
        return C6514M.f71813a;
    }

    /* access modifiers changed from: private */
    public final CreateTicketFormUiState getLastKnownContent() {
        if (this._uiState.getValue() instanceof CreateTicketFormUiState.Content) {
            return (CreateTicketFormUiState) this._uiState.getValue();
        }
        return this.lastKnownContentState;
    }

    /* access modifiers changed from: private */
    public final boolean isFileSizeExceeded(MediaData.Media media) {
        if (media.getSize() > this.config.getAttachmentSettings().getUploadSizeLimit()) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: private */
    public final boolean isUnsupportedFileType(MediaData.Media media, Set<String> set) {
        return !C6565s.e0(set, MimeTypeMap.getSingleton().getExtensionFromMimeType(media.getMimeType()));
    }

    /* access modifiers changed from: private */
    public static final C6514M onAnswerUpdated$lambda$3(String str, CreateTicketViewModel createTicketViewModel, CreateTicketFormUiState.Content content) {
        C6496s.h(str, "$questionID");
        C6496s.h(createTicketViewModel, "this$0");
        C6496s.h(content, "content");
        List<TicketAttributeRequest> reduceAttributeList = ConditionalAttributesReducerKt.reduceAttributeList(str, createTicketViewModel.currentTicketType, content);
        if (!reduceAttributeList.isEmpty()) {
            createTicketViewModel.withState(new d(createTicketViewModel));
            createTicketViewModel.fetchTicketType(reduceAttributeList);
        }
        C5600w0 unused = C5576k.d(b0.a(createTicketViewModel), createTicketViewModel.dispatcher, (M) null, new CreateTicketViewModel$onAnswerUpdated$1$2(content, createTicketViewModel, (C6658d<? super CreateTicketViewModel$onAnswerUpdated$1$2>) null), 2, (Object) null);
        return C6514M.f71813a;
    }

    /* access modifiers changed from: private */
    public static final C6514M onAnswerUpdated$lambda$3$lambda$2$lambda$1(CreateTicketViewModel createTicketViewModel, CreateTicketFormUiState.Content content) {
        C6496s.h(createTicketViewModel, "this$0");
        C6496s.h(content, "it");
        createTicketViewModel._uiState.setValue(CreateTicketFormUiState.Content.copy$default(content, (String) null, (List) null, true, false, 11, (Object) null));
        return C6514M.f71813a;
    }

    /* access modifiers changed from: private */
    public static final C6514M onDeleteFileClicked$lambda$11(AnswerClickData answerClickData, CreateTicketViewModel createTicketViewModel, CreateTicketFormUiState.Content content) {
        C6496s.h(answerClickData, "$fileClickData");
        C6496s.h(createTicketViewModel, "this$0");
        C6496s.h(content, "content");
        for (QuestionState questionState : content.getQuestions()) {
            if (C6496s.c(questionState.getQuestionModel().getId(), answerClickData.getQuestionId())) {
                Answer answer = questionState.getAnswer();
                C6496s.f(answer, "null cannot be cast to non-null type io.intercom.android.sdk.survey.ui.models.Answer.MediaAnswer");
                questionState.setAnswer(new Answer.MediaAnswer(C6565s.H0(((Answer.MediaAnswer) answer).getMediaItems(), answerClickData.getClickedItem())));
                createTicketViewModel.onAnswerUpdated(answerClickData.getQuestionId());
                return C6514M.f71813a;
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    /* access modifiers changed from: private */
    public static final C6514M onRetryFileClicked$lambda$9(CreateTicketViewModel createTicketViewModel, AnswerClickData answerClickData, CreateTicketFormUiState.Content content) {
        C6496s.h(createTicketViewModel, "this$0");
        C6496s.h(answerClickData, "$fileClickData");
        C6496s.h(content, "content");
        for (QuestionState questionState : content.getQuestions()) {
            if (C6496s.c(questionState.getQuestionModel().getId(), answerClickData.getQuestionId())) {
                Answer answer = questionState.getAnswer();
                C6496s.f(answer, "null cannot be cast to non-null type io.intercom.android.sdk.survey.ui.models.Answer.MediaAnswer");
                Answer.MediaAnswer mediaAnswer = (Answer.MediaAnswer) answer;
                for (Answer.MediaAnswer.MediaItem mediaItem : mediaAnswer.getMediaItems()) {
                    if (C6496s.c(mediaItem, answerClickData.getClickedItem())) {
                        mediaItem.setUploadStatus(Answer.MediaAnswer.FileUploadStatus.None.INSTANCE);
                        questionState.setAnswer(new Answer.MediaAnswer(mediaAnswer.getMediaItems()));
                        createTicketViewModel.onAnswerUpdated(answerClickData.getQuestionId());
                        return C6514M.f71813a;
                    }
                }
                throw new NoSuchElementException("Collection contains no element matching the predicate.");
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    /* access modifiers changed from: private */
    public final void updateCtaState() {
        withState(new g(this));
    }

    /* access modifiers changed from: private */
    public static final C6514M updateCtaState$lambda$14(CreateTicketViewModel createTicketViewModel, CreateTicketFormUiState.Content content) {
        C6496s.h(createTicketViewModel, "this$0");
        C6496s.h(content, "content");
        ArrayList<QuestionState> arrayList = new ArrayList<>();
        for (Object next : content.getQuestions()) {
            if (((QuestionState) next).getQuestionModel() instanceof SurveyData.Step.Question.UploadFileQuestionModel) {
                arrayList.add(next);
            }
        }
        for (QuestionState questionState : arrayList) {
            questionState.validate();
            if (questionState.getAnswer() instanceof Answer.MediaAnswer) {
                Answer answer = questionState.getAnswer();
                C6496s.f(answer, "null cannot be cast to non-null type io.intercom.android.sdk.survey.ui.models.Answer.MediaAnswer");
                Iterable<Answer.MediaAnswer.MediaItem> mediaItems = ((Answer.MediaAnswer) answer).getMediaItems();
                if (!(mediaItems instanceof Collection) || !((Collection) mediaItems).isEmpty()) {
                    for (Answer.MediaAnswer.MediaItem uploadStatus : mediaItems) {
                        if (!(uploadStatus.getUploadStatus() instanceof Answer.MediaAnswer.FileUploadStatus.Success)) {
                            createTicketViewModel._uiState.setValue(CreateTicketFormUiState.Content.copy$default(content, (String) null, (List) null, false, false, 7, (Object) null));
                            return C6514M.f71813a;
                        }
                    }
                    continue;
                }
            }
        }
        createTicketViewModel._uiState.setValue(CreateTicketFormUiState.Content.copy$default(content, (String) null, (List) null, false, true, 7, (Object) null));
        return C6514M.f71813a;
    }

    /* access modifiers changed from: private */
    public final void withState(C6798l lVar) {
        if (this._uiState.getValue() instanceof CreateTicketFormUiState.Content) {
            Object value = this._uiState.getValue();
            C6496s.f(value, "null cannot be cast to non-null type io.intercom.android.sdk.tickets.create.model.CreateTicketViewModel.CreateTicketFormUiState.Content");
            lVar.invoke((CreateTicketFormUiState.Content) value);
        }
    }

    public final void createTicket(K k10) {
        MetricTracker metricTracker2 = this.metricTracker;
        Integer valueOf = Integer.valueOf(this.ticketTypeId);
        String str = this.conversationId;
        if (str == null) {
            str = "";
        }
        metricTracker2.submittedCreateTicketForm(valueOf, str, this.launchedFrom.getFrom());
        withState(new b(this, k10));
    }

    public final B getEffect() {
        return this.effect;
    }

    public final L getUiState() {
        return this.uiState;
    }

    public final void onAnswerClicked(AnswerClickData answerClickData) {
        C6496s.h(answerClickData, "answerClickData");
        C5600w0 unused = C5576k.d(b0.a(this), (g) null, (M) null, new CreateTicketViewModel$onAnswerClicked$1(this, answerClickData, (C6658d<? super CreateTicketViewModel$onAnswerClicked$1>) null), 3, (Object) null);
    }

    public final void onAnswerUpdated(String str) {
        C6496s.h(str, "questionID");
        withState(new f(str, this));
    }

    public final void onDeleteFileClicked(AnswerClickData answerClickData) {
        C6496s.h(answerClickData, "fileClickData");
        withState(new c(answerClickData, this));
    }

    public final void onRetryFileClicked(AnswerClickData answerClickData) {
        C6496s.h(answerClickData, "fileClickData");
        withState(new a(this, answerClickData));
    }

    public CreateTicketViewModel(CreateTicketLaunchedFrom createTicketLaunchedFrom, TicketRepository ticketRepository2, UserIdentity userIdentity2, AppConfig appConfig, G g10, MetricTracker metricTracker2, String str, int i10, Context context) {
        C6496s.h(createTicketLaunchedFrom, "launchedFrom");
        C6496s.h(ticketRepository2, "ticketRepository");
        C6496s.h(userIdentity2, "userIdentity");
        C6496s.h(appConfig, "config");
        C6496s.h(g10, "dispatcher");
        C6496s.h(metricTracker2, "metricTracker");
        C6496s.h(context, "applicationContext");
        this.launchedFrom = createTicketLaunchedFrom;
        this.ticketRepository = ticketRepository2;
        this.userIdentity = userIdentity2;
        this.config = appConfig;
        this.dispatcher = g10;
        this.metricTracker = metricTracker2;
        this.conversationId = str;
        this.ticketTypeId = i10;
        this.applicationContext = context;
        x a10 = N.a(CreateTicketFormUiState.Initial.INSTANCE);
        this._uiState = a10;
        this.uiState = C5696h.b(a10);
        w b10 = D.b(0, 0, (a) null, 7, (Object) null);
        this._effect = b10;
        this.effect = C5696h.a(b10);
        C5600w0 unused = C5576k.d(b0.a(this), g10, (M) null, new AnonymousClass1(this, (C6658d<? super AnonymousClass1>) null), 2, (Object) null);
        metricTracker2.viewedCreateTicketForm(Integer.valueOf(i10), str == null ? "" : str, createTicketLaunchedFrom.getFrom());
        fetchTicketType$default(this, (List) null, 1, (Object) null);
    }
}
