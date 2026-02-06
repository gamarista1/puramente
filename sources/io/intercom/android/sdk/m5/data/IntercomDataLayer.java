package io.intercom.android.sdk.m5.data;

import Ug.C5600w0;
import Ug.K;
import Ug.M;
import Wg.a;
import Xg.B;
import Xg.C5696h;
import Xg.D;
import Xg.L;
import Xg.N;
import Xg.w;
import Xg.x;
import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import androidx.core.content.c;
import io.intercom.android.nexus.NexusConfig;
import io.intercom.android.sdk.Intercom;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.identity.AppConfig;
import io.intercom.android.sdk.identity.AppConfigKt;
import io.intercom.android.sdk.m5.home.data.HomeCards;
import io.intercom.android.sdk.models.AttachmentSettings;
import io.intercom.android.sdk.models.BotIntro;
import io.intercom.android.sdk.models.Config;
import io.intercom.android.sdk.models.ConfigModules;
import io.intercom.android.sdk.models.Conversation;
import io.intercom.android.sdk.models.ConversationStateSyncSettings;
import io.intercom.android.sdk.models.DeliveryOption;
import io.intercom.android.sdk.models.HostAppState;
import io.intercom.android.sdk.models.OpenMessengerResponse;
import io.intercom.android.sdk.models.OverlayState;
import io.intercom.android.sdk.models.TeamPresence;
import io.intercom.android.sdk.models.Ticket;
import io.intercom.android.sdk.models.carousel.Carousel;
import io.intercom.android.sdk.survey.model.SurveyData;
import io.intercom.android.sdk.utilities.ActivityUtils;
import io.intercom.android.sdk.utilities.PreferenceKeys;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import lf.C6514M;
import mf.C6565s;
import mf.Y;
import qf.C6658d;
import qf.g;
import rf.C6680b;
import yf.C6798l;

@Metadata(d1 = {"\u0000à\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\"\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001b\u0010\u0010\u001a\u00020\n2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0018\u001a\u00020\n2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0015\u0010\u001c\u001a\u00020\n2\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001c\u0010\u001dJ\u0015\u0010 \u001a\u00020\n2\u0006\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b \u0010!J\u0015\u0010$\u001a\u00020\n2\u0006\u0010#\u001a\u00020\"¢\u0006\u0004\b$\u0010%J\r\u0010&\u001a\u00020\n¢\u0006\u0004\b&\u0010'J\u0015\u0010*\u001a\u00020\n2\u0006\u0010)\u001a\u00020(¢\u0006\u0004\b*\u0010+J\r\u0010,\u001a\u00020\n¢\u0006\u0004\b,\u0010'J\u0015\u0010/\u001a\u00020\n2\u0006\u0010.\u001a\u00020-¢\u0006\u0004\b/\u00100J\u0015\u00103\u001a\u00020\n2\u0006\u00102\u001a\u000201¢\u0006\u0004\b3\u00104J\u0015\u00105\u001a\u00020\n2\u0006\u00102\u001a\u000201¢\u0006\u0004\b5\u00104J\u001b\u00108\u001a\u00020\n2\f\u00107\u001a\b\u0012\u0004\u0012\u00020\u001606¢\u0006\u0004\b8\u00109J\u0015\u0010<\u001a\u00020\n2\u0006\u0010;\u001a\u00020:¢\u0006\u0004\b<\u0010=J\r\u0010>\u001a\u00020\n¢\u0006\u0004\b>\u0010'J\u0015\u0010@\u001a\u00020\n2\u0006\u0010?\u001a\u00020\u0016¢\u0006\u0004\b@\u0010\u0019J\u0015\u0010B\u001a\u00020\n2\u0006\u0010A\u001a\u00020\u000e¢\u0006\u0004\bB\u0010CJ\u0015\u0010E\u001a\u00020\n2\u0006\u0010D\u001a\u00020\u0016¢\u0006\u0004\bE\u0010\u0019J\u001b\u0010G\u001a\u00020\n2\f\u0010F\u001a\b\u0012\u0004\u0012\u00020\u000e0\r¢\u0006\u0004\bG\u0010\u0011J\u0015\u0010J\u001a\u00020\n2\u0006\u0010I\u001a\u00020H¢\u0006\u0004\bJ\u0010KJ\u0015\u0010L\u001a\u00020\n2\u0006\u0010I\u001a\u00020H¢\u0006\u0004\bL\u0010KJ\u0015\u0010M\u001a\u00020\n2\u0006\u0010I\u001a\u00020H¢\u0006\u0004\bM\u0010KJ\u0015\u0010P\u001a\u00020\n2\u0006\u0010O\u001a\u00020N¢\u0006\u0004\bP\u0010QJ\r\u0010R\u001a\u00020\n¢\u0006\u0004\bR\u0010'J\r\u0010S\u001a\u00020\n¢\u0006\u0004\bS\u0010'J\r\u0010T\u001a\u00020\n¢\u0006\u0004\bT\u0010'J\r\u0010U\u001a\u00020\n¢\u0006\u0004\bU\u0010'J\u0018\u0010X\u001a\u00020\n2\u0006\u0010W\u001a\u00020VH@¢\u0006\u0004\bX\u0010YJ)\u0010]\u001a\u00020\n2\u0006\u0010Z\u001a\u00020\u00042\u0012\u0010\\\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\n0[¢\u0006\u0004\b]\u0010^J)\u0010a\u001a\u00020\n2\u0006\u0010Z\u001a\u00020\u00042\u0012\u0010`\u001a\u000e\u0012\u0004\u0012\u00020_\u0012\u0004\u0012\u00020\n0[¢\u0006\u0004\ba\u0010^J/\u0010c\u001a\u00020\n2\u0006\u0010Z\u001a\u00020\u00042\u0018\u0010b\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001606\u0012\u0004\u0012\u00020\n0[¢\u0006\u0004\bc\u0010^J!\u0010X\u001a\u00020\n2\b\b\u0002\u0010Z\u001a\u00020\u00042\u0006\u0010d\u001a\u00020VH\u0007¢\u0006\u0004\bX\u0010eJ)\u0010g\u001a\u00020\n2\u0006\u0010Z\u001a\u00020\u00042\u0012\u0010f\u001a\u000e\u0012\u0004\u0012\u00020V\u0012\u0004\u0012\u00020\n0[¢\u0006\u0004\bg\u0010^J\u0015\u0010j\u001a\u00020\n2\u0006\u0010i\u001a\u00020h¢\u0006\u0004\bj\u0010kJ\r\u0010l\u001a\u00020\n¢\u0006\u0004\bl\u0010'J\u000f\u0010m\u001a\u0004\u0018\u00010h¢\u0006\u0004\bm\u0010nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010oR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010pR \u0010r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0q8\u0002X\u0004¢\u0006\u0006\n\u0004\br\u0010sR#\u0010F\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0t8\u0006¢\u0006\f\n\u0004\bF\u0010u\u001a\u0004\bv\u0010wR\u001a\u0010x\u001a\b\u0012\u0004\u0012\u00020\u00120q8\u0002X\u0004¢\u0006\u0006\n\u0004\bx\u0010sR\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120t8\u0006¢\u0006\f\n\u0004\b\u0013\u0010u\u001a\u0004\by\u0010wR\u001c\u0010z\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00160q8\u0002X\u0004¢\u0006\u0006\n\u0004\bz\u0010sR\u001f\u0010\u0017\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00160t8\u0006¢\u0006\f\n\u0004\b\u0017\u0010u\u001a\u0004\b{\u0010wR\u001a\u0010|\u001a\b\u0012\u0004\u0012\u00020\u001a0q8\u0002X\u0004¢\u0006\u0006\n\u0004\b|\u0010sR\u001d\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0t8\u0006¢\u0006\f\n\u0004\b\u001b\u0010u\u001a\u0004\b}\u0010wR\u001a\u0010~\u001a\b\u0012\u0004\u0012\u00020\u001e0q8\u0002X\u0004¢\u0006\u0006\n\u0004\b~\u0010sR\u001d\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0t8\u0006¢\u0006\f\n\u0004\b\u001f\u0010u\u001a\u0004\b\u0010wR\u001c\u0010\u0001\u001a\b\u0012\u0004\u0012\u00020\"0q8\u0002X\u0004¢\u0006\u0007\n\u0005\b\u0001\u0010sR\u001e\u0010#\u001a\b\u0012\u0004\u0012\u00020\"0t8\u0006¢\u0006\r\n\u0004\b#\u0010u\u001a\u0005\b\u0001\u0010wR\u001c\u0010\u0001\u001a\b\u0012\u0004\u0012\u00020_0q8\u0002X\u0004¢\u0006\u0007\n\u0005\b\u0001\u0010sR \u0010\u0001\u001a\b\u0012\u0004\u0012\u00020_0t8\u0006¢\u0006\u000e\n\u0005\b\u0001\u0010u\u001a\u0005\b\u0001\u0010wR\u001d\u0010\u0001\u001a\t\u0012\u0005\u0012\u00030\u00010q8\u0002X\u0004¢\u0006\u0007\n\u0005\b\u0001\u0010sR!\u0010\u0001\u001a\t\u0012\u0005\u0012\u00030\u00010t8\u0006¢\u0006\u000e\n\u0005\b\u0001\u0010u\u001a\u0005\b\u0001\u0010wR\"\u0010\u0001\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u0016060q8\u0002X\u0004¢\u0006\u0007\n\u0005\b\u0001\u0010sR$\u00107\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u0016060t8\u0006¢\u0006\r\n\u0004\b7\u0010u\u001a\u0005\b\u0001\u0010wR\u001e\u0010\u0001\u001a\t\u0012\u0004\u0012\u00020V0\u00018\u0002X\u0004¢\u0006\b\n\u0006\b\u0001\u0010\u0001R!\u0010d\u001a\t\u0012\u0004\u0012\u00020V0\u00018\u0006¢\u0006\u000f\n\u0005\bd\u0010\u0001\u001a\u0006\b\u0001\u0010\u0001R\u001c\u0010\u0001\u001a\b\u0012\u0004\u0012\u00020\b0q8\u0002X\u0004¢\u0006\u0007\n\u0005\b\u0001\u0010sR\u001b\u0010\u0001\u001a\u0004\u0018\u00010h8\u0002@\u0002X\u000e¢\u0006\b\n\u0006\b\u0001\u0010\u0001R \u0010\u0001\u001a\t\u0012\u0005\u0012\u00030\u00010\r8\u0002@\u0002X\u000e¢\u0006\b\n\u0006\b\u0001\u0010\u0001R\u001e\u0010;\u001a\b\u0012\u0004\u0012\u00020\b0t8\u0006¢\u0006\r\n\u0004\b;\u0010u\u001a\u0005\b\u0001\u0010w¨\u0006\u0001"}, d2 = {"Lio/intercom/android/sdk/m5/data/IntercomDataLayer;", "", "Landroid/content/Context;", "context", "LUg/K;", "applicationScope", "<init>", "(Landroid/content/Context;LUg/K;)V", "Lio/intercom/android/sdk/identity/AppConfig;", "newAppConfig", "Llf/M;", "updateAppConfig", "(Lio/intercom/android/sdk/identity/AppConfig;)V", "", "Lio/intercom/android/sdk/models/Conversation;", "newConversations", "addConversations", "(Ljava/util/List;)V", "Lio/intercom/android/sdk/models/BotIntro;", "botIntro", "updateBotIntro", "(Lio/intercom/android/sdk/models/BotIntro;)V", "", "botBehaviourId", "updateBotBehaviourId", "(Ljava/lang/String;)V", "Lio/intercom/android/sdk/models/TeamPresence;", "teamPresence", "updateTeamPresence", "(Lio/intercom/android/sdk/models/TeamPresence;)V", "Lio/intercom/android/sdk/models/Ticket;", "ticket", "updateTicket", "(Lio/intercom/android/sdk/models/Ticket;)V", "Lio/intercom/android/sdk/survey/model/SurveyData;", "surveyData", "updateSurveyData", "(Lio/intercom/android/sdk/survey/model/SurveyData;)V", "clearSurveyData", "()V", "Lio/intercom/android/sdk/models/carousel/Carousel;", "carousel", "updateCarousel", "(Lio/intercom/android/sdk/models/carousel/Carousel;)V", "clearCarousel", "", "bottomPadding", "updateBottomPadding", "(I)V", "Lio/intercom/android/sdk/Intercom$Visibility;", "visibility", "updateLauncherVisibility", "(Lio/intercom/android/sdk/Intercom$Visibility;)V", "updateInAppNotificationsVisibility", "", "unreadConversationIds", "updateUnreadConversationIds", "(Ljava/util/Set;)V", "Lio/intercom/android/sdk/models/Config;", "config", "updateConfig", "(Lio/intercom/android/sdk/models/Config;)V", "resetConfig", "conversationId", "markConversationAsRead", "conversation", "fetchConversationSuccess", "(Lio/intercom/android/sdk/models/Conversation;)V", "partId", "markConversationPartAsDismissed", "conversations", "updateOverlayConversations", "Landroid/app/Activity;", "activity", "activityReadyForViewAttachment", "(Landroid/app/Activity;)V", "activityPaused", "activityStopped", "", "timestamp", "appEnteredBackground", "(J)V", "appEnteredForeground", "updateSessionStarted", "hardReset", "clearUserData", "Lio/intercom/android/sdk/m5/data/IntercomEvent;", "intercomEvent", "emitEvent", "(Lio/intercom/android/sdk/m5/data/IntercomEvent;Lqf/d;)Ljava/lang/Object;", "coroutineScope", "Lkotlin/Function1;", "onNewAppConfig", "configUpdates", "(LUg/K;Lyf/l;)V", "Lio/intercom/android/sdk/models/OverlayState;", "onNewOverlyState", "overlayStateUpdates", "onNewUnreadConversationsIdsState", "unreadConversationIdsUpdates", "event", "(LUg/K;Lio/intercom/android/sdk/m5/data/IntercomEvent;)V", "onNewEvent", "listenToEvents", "Lio/intercom/android/sdk/models/OpenMessengerResponse;", "response", "updateOpenResponse", "(Lio/intercom/android/sdk/models/OpenMessengerResponse;)V", "clearOpenResponse", "getOpenResponse", "()Lio/intercom/android/sdk/models/OpenMessengerResponse;", "Landroid/content/Context;", "LUg/K;", "LXg/x;", "_conversations", "LXg/x;", "LXg/L;", "LXg/L;", "getConversations", "()LXg/L;", "_botIntro", "getBotIntro", "_botBehaviourId", "getBotBehaviourId", "_teamPresence", "getTeamPresence", "_ticket", "getTicket", "_surveyData", "getSurveyData", "_overlayState", "overlayState", "getOverlayState", "Lio/intercom/android/sdk/models/HostAppState;", "_hostAppState", "hostAppState", "getHostAppState", "_unreadConversationIds", "getUnreadConversationIds", "LXg/w;", "_event", "LXg/w;", "LXg/B;", "LXg/B;", "getEvent", "()LXg/B;", "_config", "openResponse", "Lio/intercom/android/sdk/models/OpenMessengerResponse;", "Lio/intercom/android/sdk/m5/home/data/HomeCards;", "homeCards", "Ljava/util/List;", "getConfig", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class IntercomDataLayer {
    public static final int $stable = 8;
    private final x _botBehaviourId;
    private final x _botIntro;
    private final x _config;
    private final x _conversations;
    private final w _event;
    private final x _hostAppState;
    private final x _overlayState;
    private final x _surveyData;
    private final x _teamPresence;
    private final x _ticket;
    private final x _unreadConversationIds;
    private final K applicationScope;
    private final L botBehaviourId;
    private final L botIntro;
    private final L config;
    private final Context context;
    private final L conversations;
    private final B event;
    private List<? extends HomeCards> homeCards = C6565s.n();
    private final L hostAppState;
    private OpenMessengerResponse openResponse;
    private final L overlayState;
    private final L surveyData;
    private final L teamPresence;
    private final L ticket;
    private final L unreadConversationIds;

    public IntercomDataLayer(Context context2, K k10) {
        C6496s.h(context2, "context");
        C6496s.h(k10, "applicationScope");
        this.context = context2;
        this.applicationScope = k10;
        x a10 = N.a(C6565s.n());
        this._conversations = a10;
        this.conversations = C5696h.b(a10);
        x a11 = N.a(BotIntro.NULL);
        this._botIntro = a11;
        this.botIntro = C5696h.b(a11);
        x a12 = N.a((Object) null);
        this._botBehaviourId = a12;
        this.botBehaviourId = C5696h.b(a12);
        x a13 = N.a(TeamPresence.NULL);
        this._teamPresence = a13;
        this.teamPresence = C5696h.b(a13);
        x a14 = N.a(Ticket.Companion.getNULL());
        this._ticket = a14;
        this.ticket = C5696h.b(a14);
        x a15 = N.a(SurveyData.Companion.getNULL());
        this._surveyData = a15;
        this.surveyData = C5696h.b(a15);
        x a16 = N.a(OverlayState.NULL);
        this._overlayState = a16;
        this.overlayState = C5696h.b(a16);
        x a17 = N.a(HostAppState.NULL);
        this._hostAppState = a17;
        this.hostAppState = C5696h.b(a17);
        x a18 = N.a(Y.e());
        this._unreadConversationIds = a18;
        this.unreadConversationIds = C5696h.b(a18);
        w b10 = D.b(0, 0, (a) null, 7, (Object) null);
        this._event = b10;
        this.event = b10;
        SharedPreferences sharedPreferences = context2.getSharedPreferences(PreferenceKeys.INTERCOM_PREFS, 0);
        C6496s.e(sharedPreferences);
        x a19 = N.a(AppConfigKt.getAppConfig(sharedPreferences, c.getColor(context2, R.color.intercom_main_blue), new NexusConfig()));
        this._config = a19;
        this.config = C5696h.b(a19);
    }

    public static /* synthetic */ void emitEvent$default(IntercomDataLayer intercomDataLayer, K k10, IntercomEvent intercomEvent, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            k10 = intercomDataLayer.applicationScope;
        }
        intercomDataLayer.emitEvent(k10, intercomEvent);
    }

    private final void updateAppConfig(AppConfig appConfig) {
        if (!C6496s.c(appConfig, this._config.getValue())) {
            SharedPreferences sharedPreferences = this.context.getSharedPreferences(PreferenceKeys.INTERCOM_PREFS, 0);
            C6496s.e(sharedPreferences);
            AppConfigKt.setAppConfig(sharedPreferences, appConfig);
            this._config.setValue(appConfig);
        }
    }

    public final void activityPaused(Activity activity) {
        Object value;
        C6496s.h(activity, "activity");
        x xVar = this._overlayState;
        do {
            value = xVar.getValue();
        } while (!xVar.e(value, OverlayState.copy$default((OverlayState) value, (SurveyData) null, (Carousel) null, 0, (Intercom.Visibility) null, (Intercom.Visibility) null, (List) null, (Set) null, (Activity) null, activity, 127, (Object) null)));
    }

    public final void activityReadyForViewAttachment(Activity activity) {
        Object value;
        C6496s.h(activity, "activity");
        if (!ActivityUtils.isHostActivity(activity)) {
            activity = null;
        }
        x xVar = this._overlayState;
        do {
            value = xVar.getValue();
        } while (!xVar.e(value, OverlayState.copy$default((OverlayState) value, (SurveyData) null, (Carousel) null, 0, (Intercom.Visibility) null, (Intercom.Visibility) null, (List) null, (Set) null, activity, (Activity) null, 127, (Object) null)));
    }

    public final void activityStopped(Activity activity) {
        Activity activity2;
        Object value;
        C6496s.h(activity, "activity");
        if (C6496s.c(activity, ((OverlayState) this.overlayState.getValue()).getPausedHostActivity())) {
            activity2 = null;
        } else {
            activity2 = ((OverlayState) this.overlayState.getValue()).getPausedHostActivity();
        }
        x xVar = this._overlayState;
        do {
            value = xVar.getValue();
        } while (!xVar.e(value, OverlayState.copy$default((OverlayState) value, (SurveyData) null, (Carousel) null, 0, (Intercom.Visibility) null, (Intercom.Visibility) null, (List) null, (Set) null, (Activity) null, activity2, 255, (Object) null)));
    }

    public final void addConversations(List<Conversation> list) {
        Object value;
        ArrayList arrayList;
        C6496s.h(list, "newConversations");
        x xVar = this._conversations;
        do {
            value = xVar.getValue();
            HashSet hashSet = new HashSet();
            arrayList = new ArrayList();
            for (Object next : C6565s.U0(C6565s.K0(list, (List) value), new IntercomDataLayer$addConversations$lambda$2$$inlined$sortedByDescending$1())) {
                if (hashSet.add(((Conversation) next).getId())) {
                    arrayList.add(next);
                }
            }
        } while (!xVar.e(value, arrayList));
    }

    public final void appEnteredBackground(long j10) {
        Object value;
        Object value2;
        x xVar = this._overlayState;
        do {
            value = xVar.getValue();
        } while (!xVar.e(value, OverlayState.copy$default((OverlayState) value, (SurveyData) null, (Carousel) null, 0, (Intercom.Visibility) null, (Intercom.Visibility) null, (List) null, (Set) null, (Activity) null, (Activity) null, 127, (Object) null)));
        x xVar2 = this._hostAppState;
        do {
            value2 = xVar2.getValue();
        } while (!xVar2.e(value2, HostAppState.copy$default((HostAppState) value2, true, false, j10, 2, (Object) null)));
    }

    public final void appEnteredForeground() {
        Object value;
        x xVar = this._hostAppState;
        do {
            value = xVar.getValue();
        } while (!xVar.e(value, HostAppState.copy$default((HostAppState) value, false, false, 0, 4, (Object) null)));
    }

    public final void clearCarousel() {
        Object value;
        Carousel carousel;
        x xVar = this._overlayState;
        do {
            value = xVar.getValue();
            carousel = Carousel.NULL;
            C6496s.g(carousel, "NULL");
        } while (!xVar.e(value, OverlayState.copy$default((OverlayState) value, (SurveyData) null, carousel, 0, (Intercom.Visibility) null, (Intercom.Visibility) null, (List) null, (Set) null, (Activity) null, (Activity) null, 509, (Object) null)));
    }

    public final void clearOpenResponse() {
        this.openResponse = null;
    }

    public final void clearSurveyData() {
        Object value;
        Object value2;
        x xVar = this._surveyData;
        do {
            value = xVar.getValue();
            SurveyData surveyData2 = (SurveyData) value;
        } while (!xVar.e(value, SurveyData.Companion.getNULL()));
        x xVar2 = this._overlayState;
        do {
            value2 = xVar2.getValue();
        } while (!xVar2.e(value2, OverlayState.copy$default((OverlayState) value2, SurveyData.Companion.getNULL(), (Carousel) null, 0, (Intercom.Visibility) null, (Intercom.Visibility) null, (List) null, (Set) null, (Activity) null, (Activity) null, 510, (Object) null)));
    }

    public final void clearUserData() {
        Object value;
        Object value2;
        Object value3;
        Object value4;
        Object value5;
        Object value6;
        Object value7;
        SurveyData surveyData2;
        Carousel carousel;
        Object value8;
        x xVar = this._conversations;
        do {
            value = xVar.getValue();
            List list = (List) value;
        } while (!xVar.e(value, C6565s.n()));
        x xVar2 = this._botIntro;
        do {
            value2 = xVar2.getValue();
            BotIntro botIntro2 = (BotIntro) value2;
        } while (!xVar2.e(value2, BotIntro.NULL));
        x xVar3 = this._botBehaviourId;
        do {
            value3 = xVar3.getValue();
            String str = (String) value3;
        } while (!xVar3.e(value3, (Object) null));
        x xVar4 = this._teamPresence;
        do {
            value4 = xVar4.getValue();
            TeamPresence teamPresence2 = (TeamPresence) value4;
        } while (!xVar4.e(value4, TeamPresence.NULL));
        x xVar5 = this._ticket;
        do {
            value5 = xVar5.getValue();
            Ticket ticket2 = (Ticket) value5;
        } while (!xVar5.e(value5, Ticket.Companion.getNULL()));
        x xVar6 = this._surveyData;
        do {
            value6 = xVar6.getValue();
            SurveyData surveyData3 = (SurveyData) value6;
        } while (!xVar6.e(value6, SurveyData.Companion.getNULL()));
        x xVar7 = this._overlayState;
        do {
            value7 = xVar7.getValue();
            surveyData2 = SurveyData.Companion.getNULL();
            carousel = Carousel.NULL;
            C6496s.g(carousel, "NULL");
        } while (!xVar7.e(value7, OverlayState.copy$default((OverlayState) value7, surveyData2, carousel, 0, (Intercom.Visibility) null, (Intercom.Visibility) null, C6565s.n(), Y.e(), (Activity) null, (Activity) null, 412, (Object) null)));
        x xVar8 = this._unreadConversationIds;
        do {
            value8 = xVar8.getValue();
            Set set = (Set) value8;
        } while (!xVar8.e(value8, Y.e()));
        this.openResponse = null;
        this.homeCards = C6565s.n();
    }

    public final void configUpdates(K k10, C6798l lVar) {
        C6496s.h(k10, "coroutineScope");
        C6496s.h(lVar, "onNewAppConfig");
        C5600w0 unused = C5576k.d(k10, (g) null, (M) null, new IntercomDataLayer$configUpdates$1(this, lVar, (C6658d<? super IntercomDataLayer$configUpdates$1>) null), 3, (Object) null);
    }

    public final void emitEvent(IntercomEvent intercomEvent) {
        C6496s.h(intercomEvent, "event");
        emitEvent$default(this, (K) null, intercomEvent, 1, (Object) null);
    }

    public final void fetchConversationSuccess(Conversation conversation) {
        Object value;
        Object value2;
        ArrayList arrayList;
        C6496s.h(conversation, "conversation");
        Set set = (Set) this.unreadConversationIds.getValue();
        if (conversation.isRead()) {
            x xVar = this._unreadConversationIds;
            do {
                value2 = xVar.getValue();
                Set set2 = (Set) value2;
                arrayList = new ArrayList();
                for (Object next : set) {
                    if (!C6496s.c((String) next, conversation.getId())) {
                        arrayList.add(next);
                    }
                }
            } while (!xVar.e(value2, C6565s.j1(arrayList)));
            return;
        }
        x xVar2 = this._unreadConversationIds;
        do {
            value = xVar2.getValue();
            Set set3 = (Set) value;
        } while (!xVar2.e(value, Y.o(set, conversation.getId())));
    }

    public final L getBotBehaviourId() {
        return this.botBehaviourId;
    }

    public final L getBotIntro() {
        return this.botIntro;
    }

    public final L getConfig() {
        return this.config;
    }

    public final L getConversations() {
        return this.conversations;
    }

    public final B getEvent() {
        return this.event;
    }

    public final L getHostAppState() {
        return this.hostAppState;
    }

    public final OpenMessengerResponse getOpenResponse() {
        return this.openResponse;
    }

    public final L getOverlayState() {
        return this.overlayState;
    }

    public final L getSurveyData() {
        return this.surveyData;
    }

    public final L getTeamPresence() {
        return this.teamPresence;
    }

    public final L getTicket() {
        return this.ticket;
    }

    public final L getUnreadConversationIds() {
        return this.unreadConversationIds;
    }

    public final void hardReset() {
        Object value;
        resetConfig();
        x xVar = this._hostAppState;
        do {
            value = xVar.getValue();
        } while (!xVar.e(value, HostAppState.copy$default((HostAppState) value, false, false, 0, 5, (Object) null)));
    }

    public final void listenToEvents(K k10, C6798l lVar) {
        C6496s.h(k10, "coroutineScope");
        C6496s.h(lVar, "onNewEvent");
        C5600w0 unused = C5576k.d(k10, (g) null, (M) null, new IntercomDataLayer$listenToEvents$1(this, lVar, (C6658d<? super IntercomDataLayer$listenToEvents$1>) null), 3, (Object) null);
    }

    public final void markConversationAsRead(String str) {
        Object value;
        OverlayState overlayState2;
        ArrayList arrayList;
        Object value2;
        ArrayList arrayList2;
        String str2 = str;
        C6496s.h(str2, "conversationId");
        List<Conversation> conversations2 = ((OverlayState) this.overlayState.getValue()).getConversations();
        x xVar = this._overlayState;
        do {
            value = xVar.getValue();
            overlayState2 = (OverlayState) value;
            arrayList = new ArrayList();
            for (Object next : conversations2) {
                if (!C6496s.c(((Conversation) next).getId(), str2)) {
                    arrayList.add(next);
                }
            }
        } while (!xVar.e(value, OverlayState.copy$default(overlayState2, (SurveyData) null, (Carousel) null, 0, (Intercom.Visibility) null, (Intercom.Visibility) null, arrayList, (Set) null, (Activity) null, (Activity) null, 479, (Object) null)));
        Set set = (Set) this.unreadConversationIds.getValue();
        x xVar2 = this._unreadConversationIds;
        do {
            value2 = xVar2.getValue();
            Set set2 = (Set) value2;
            arrayList2 = new ArrayList();
            for (Object next2 : set) {
                if (!C6496s.c((String) next2, str2)) {
                    arrayList2.add(next2);
                }
            }
        } while (!xVar2.e(value2, C6565s.j1(arrayList2)));
    }

    public final void markConversationPartAsDismissed(String str) {
        String str2 = str;
        C6496s.h(str2, "partId");
        List<Conversation> conversations2 = ((OverlayState) this.overlayState.getValue()).getConversations();
        Set o10 = Y.o(((OverlayState) this.overlayState.getValue()).getDismissedPartIds(), str2);
        x xVar = this._overlayState;
        while (true) {
            Object value = xVar.getValue();
            OverlayState overlayState2 = (OverlayState) value;
            ArrayList arrayList = new ArrayList();
            for (Object next : conversations2) {
                Conversation conversation = (Conversation) next;
                Iterable iterable = o10;
                if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
                    Iterator it = iterable.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (C6496s.c((String) it.next(), conversation.lastPart().getId())) {
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                }
                arrayList.add(next);
            }
            if (xVar.e(value, OverlayState.copy$default(overlayState2, (SurveyData) null, (Carousel) null, 0, (Intercom.Visibility) null, (Intercom.Visibility) null, arrayList, o10, (Activity) null, (Activity) null, 415, (Object) null))) {
                return;
            }
        }
    }

    public final void overlayStateUpdates(K k10, C6798l lVar) {
        C6496s.h(k10, "coroutineScope");
        C6496s.h(lVar, "onNewOverlyState");
        C5600w0 unused = C5576k.d(k10, (g) null, (M) null, new IntercomDataLayer$overlayStateUpdates$1(this, lVar, (C6658d<? super IntercomDataLayer$overlayStateUpdates$1>) null), 3, (Object) null);
    }

    public final void resetConfig() {
        NexusConfig nexusConfig = r1;
        NexusConfig nexusConfig2 = new NexusConfig();
        updateAppConfig(AppConfig.copy$default((AppConfig) this.config.getValue(), (String) null, 0, 0, 0, false, false, false, 0, 0, 0, 0, 0, false, false, (String) null, (String) null, false, false, (String) null, (Set) null, (Set) null, (String) null, "", false, false, false, false, false, (ConfigModules) null, nexusConfig, false, (AttachmentSettings) null, false, false, (ConversationStateSyncSettings) null, -541065217, 7, (Object) null));
    }

    public final void unreadConversationIdsUpdates(K k10, C6798l lVar) {
        C6496s.h(k10, "coroutineScope");
        C6496s.h(lVar, "onNewUnreadConversationsIdsState");
        C5600w0 unused = C5576k.d(k10, (g) null, (M) null, new IntercomDataLayer$unreadConversationIdsUpdates$1(this, lVar, (C6658d<? super IntercomDataLayer$unreadConversationIdsUpdates$1>) null), 3, (Object) null);
    }

    public final void updateBotBehaviourId(String str) {
        Object value;
        x xVar = this._botBehaviourId;
        do {
            value = xVar.getValue();
            String str2 = (String) value;
        } while (!xVar.e(value, str));
    }

    public final void updateBotIntro(BotIntro botIntro2) {
        Object value;
        C6496s.h(botIntro2, "botIntro");
        x xVar = this._botIntro;
        do {
            value = xVar.getValue();
            BotIntro botIntro3 = (BotIntro) value;
        } while (!xVar.e(value, botIntro2));
    }

    public final void updateBottomPadding(int i10) {
        Object value;
        x xVar = this._overlayState;
        do {
            value = xVar.getValue();
        } while (!xVar.e(value, OverlayState.copy$default((OverlayState) value, (SurveyData) null, (Carousel) null, i10, (Intercom.Visibility) null, (Intercom.Visibility) null, (List) null, (Set) null, (Activity) null, (Activity) null, 507, (Object) null)));
    }

    public final void updateCarousel(Carousel carousel) {
        Object value;
        OverlayState overlayState2;
        Carousel carousel2;
        C6496s.h(carousel, "carousel");
        x xVar = this._overlayState;
        do {
            value = xVar.getValue();
            overlayState2 = (OverlayState) value;
            if (C6496s.c(overlayState2.getCarousel(), Carousel.NULL)) {
                carousel2 = carousel;
            } else {
                carousel2 = overlayState2.getCarousel();
            }
        } while (!xVar.e(value, OverlayState.copy$default(overlayState2, (SurveyData) null, carousel2, 0, (Intercom.Visibility) null, (Intercom.Visibility) null, (List) null, (Set) null, (Activity) null, (Activity) null, 509, (Object) null)));
    }

    public final void updateConfig(Config config2) {
        C6496s.h(config2, "config");
        if (!C6496s.c(config2, Config.Companion.getNULL())) {
            updateAppConfig(AppConfigKt.getAppConfig(config2, ((AppConfig) this._config.getValue()).getPrimaryColor()));
        }
    }

    public final void updateInAppNotificationsVisibility(Intercom.Visibility visibility) {
        Object value;
        C6496s.h(visibility, "visibility");
        x xVar = this._overlayState;
        do {
            value = xVar.getValue();
        } while (!xVar.e(value, OverlayState.copy$default((OverlayState) value, (SurveyData) null, (Carousel) null, 0, (Intercom.Visibility) null, visibility, (List) null, (Set) null, (Activity) null, (Activity) null, 495, (Object) null)));
    }

    public final void updateLauncherVisibility(Intercom.Visibility visibility) {
        Object value;
        C6496s.h(visibility, "visibility");
        x xVar = this._overlayState;
        do {
            value = xVar.getValue();
        } while (!xVar.e(value, OverlayState.copy$default((OverlayState) value, (SurveyData) null, (Carousel) null, 0, visibility, (Intercom.Visibility) null, (List) null, (Set) null, (Activity) null, (Activity) null, 503, (Object) null)));
    }

    public final void updateOpenResponse(OpenMessengerResponse openMessengerResponse) {
        C6496s.h(openMessengerResponse, "response");
        this.openResponse = openMessengerResponse;
    }

    public final void updateOverlayConversations(List<Conversation> list) {
        Object value;
        OverlayState overlayState2;
        ArrayList arrayList;
        List<Conversation> list2 = list;
        C6496s.h(list2, "conversations");
        Set<String> dismissedPartIds = ((OverlayState) this.overlayState.getValue()).getDismissedPartIds();
        x xVar = this._overlayState;
        do {
            value = xVar.getValue();
            overlayState2 = (OverlayState) value;
            ArrayList arrayList2 = new ArrayList();
            for (Object next : list2) {
                Conversation conversation = (Conversation) next;
                Iterable iterable = dismissedPartIds;
                if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
                    Iterator it = iterable.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (C6496s.c((String) it.next(), conversation.lastPart().getId())) {
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                }
                arrayList2.add(next);
            }
            arrayList = new ArrayList();
            for (Object next2 : arrayList2) {
                if (((Conversation) next2).lastPart().getDeliveryOption() != DeliveryOption.BADGE) {
                    arrayList.add(next2);
                }
            }
        } while (!xVar.e(value, OverlayState.copy$default(overlayState2, (SurveyData) null, (Carousel) null, 0, (Intercom.Visibility) null, (Intercom.Visibility) null, arrayList, (Set) null, (Activity) null, (Activity) null, 479, (Object) null)));
    }

    public final void updateSessionStarted() {
        Object value;
        x xVar = this._hostAppState;
        do {
            value = xVar.getValue();
        } while (!xVar.e(value, HostAppState.copy$default((HostAppState) value, false, true, 0, 5, (Object) null)));
    }

    public final void updateSurveyData(SurveyData surveyData2) {
        Object value;
        Object value2;
        OverlayState overlayState2;
        SurveyData surveyData3;
        C6496s.h(surveyData2, "surveyData");
        x xVar = this._surveyData;
        do {
            value = xVar.getValue();
            SurveyData surveyData4 = (SurveyData) value;
        } while (!xVar.e(value, surveyData2));
        x xVar2 = this._overlayState;
        do {
            value2 = xVar2.getValue();
            overlayState2 = (OverlayState) value2;
            if (C6496s.c(overlayState2.getSurveyData(), SurveyData.Companion.getNULL())) {
                surveyData3 = surveyData2;
            } else {
                surveyData3 = overlayState2.getSurveyData();
            }
        } while (!xVar2.e(value2, OverlayState.copy$default(overlayState2, surveyData3, (Carousel) null, 0, (Intercom.Visibility) null, (Intercom.Visibility) null, (List) null, (Set) null, (Activity) null, (Activity) null, 510, (Object) null)));
    }

    public final void updateTeamPresence(TeamPresence teamPresence2) {
        Object value;
        C6496s.h(teamPresence2, "teamPresence");
        x xVar = this._teamPresence;
        do {
            value = xVar.getValue();
            TeamPresence teamPresence3 = (TeamPresence) value;
        } while (!xVar.e(value, teamPresence2));
    }

    public final void updateTicket(Ticket ticket2) {
        Object value;
        C6496s.h(ticket2, "ticket");
        x xVar = this._ticket;
        do {
            value = xVar.getValue();
            Ticket ticket3 = (Ticket) value;
        } while (!xVar.e(value, ticket2));
    }

    public final void updateUnreadConversationIds(Set<String> set) {
        Object value;
        C6496s.h(set, "unreadConversationIds");
        x xVar = this._unreadConversationIds;
        do {
            value = xVar.getValue();
            Set set2 = (Set) value;
        } while (!xVar.e(value, set));
    }

    public final Object emitEvent(IntercomEvent intercomEvent, C6658d<? super C6514M> dVar) {
        Object emit = this._event.emit(intercomEvent, dVar);
        return emit == C6680b.f() ? emit : C6514M.f71813a;
    }

    public final void emitEvent(K k10, IntercomEvent intercomEvent) {
        C6496s.h(k10, "coroutineScope");
        C6496s.h(intercomEvent, "event");
        C5600w0 unused = C5576k.d(k10, (g) null, (M) null, new IntercomDataLayer$emitEvent$2(this, intercomEvent, (C6658d<? super IntercomDataLayer$emitEvent$2>) null), 3, (Object) null);
    }
}
