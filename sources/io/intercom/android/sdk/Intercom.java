package io.intercom.android.sdk;

import Sg.p;
import Ug.G;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Application;
import android.app.TaskStackBuilder;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Handler;
import android.os.Looper;
import com.adjust.sdk.network.ErrorCodes;
import com.intercom.twig.Twig;
import io.intercom.android.nexus.NexusClient;
import io.intercom.android.sdk.IntercomContent;
import io.intercom.android.sdk.IntercomPushManager;
import io.intercom.android.sdk.activities.IntercomCarouselActivity;
import io.intercom.android.sdk.api.Api;
import io.intercom.android.sdk.api.DeDuper;
import io.intercom.android.sdk.api.UserUpdateRequest;
import io.intercom.android.sdk.api.UserUpdater;
import io.intercom.android.sdk.errorreporting.ErrorReporter;
import io.intercom.android.sdk.helpcenter.api.CollectionContentRequestCallback;
import io.intercom.android.sdk.helpcenter.api.CollectionRequestCallback;
import io.intercom.android.sdk.helpcenter.api.HelpCenterApiWrapper;
import io.intercom.android.sdk.helpcenter.api.SearchRequestCallback;
import io.intercom.android.sdk.helpcenter.articles.ArticleActivity;
import io.intercom.android.sdk.helpcenter.articles.ArticleMetadata;
import io.intercom.android.sdk.helpcenter.utils.HelpCenterUrlUtilsKt;
import io.intercom.android.sdk.identity.AppConfig;
import io.intercom.android.sdk.identity.FeatureFlag;
import io.intercom.android.sdk.identity.Registration;
import io.intercom.android.sdk.identity.UserIdentity;
import io.intercom.android.sdk.logger.LumberMill;
import io.intercom.android.sdk.m5.ConversationScreenOpenerKt;
import io.intercom.android.sdk.m5.data.IntercomDataLayer;
import io.intercom.android.sdk.m5.data.UnreadCountTracker;
import io.intercom.android.sdk.m5.navigation.BackstackManager;
import io.intercom.android.sdk.m5.navigation.IntercomRootActivityLauncher;
import io.intercom.android.sdk.metrics.MetricTracker;
import io.intercom.android.sdk.models.HostAppState;
import io.intercom.android.sdk.overlay.LauncherOpenBehaviour;
import io.intercom.android.sdk.overlay.OverlayPresenter;
import io.intercom.android.sdk.push.IntercomLegacyPushClientHandler;
import io.intercom.android.sdk.push.SystemNotificationManager;
import io.intercom.android.sdk.sentry.SentrySessionManager;
import io.intercom.android.sdk.survey.ui.IntercomSurveyActivity;
import io.intercom.android.sdk.utilities.ActivityFinisher;
import io.intercom.android.sdk.utilities.AttributeSanitiser;
import io.intercom.android.sdk.utilities.PreferenceKeys;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lf.C6521e;
import lf.C6535s;
import mf.C6565s;
import mf.O;
import sf.C6714a;

@Metadata(d1 = {"\u0000þ\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0017\b\u0007\u0018\u0000 §\u00012\u00020\u0001:\u0006¨\u0001©\u0001§\u0001B\u0001\b\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u0004\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u0004\u0012\u0006\u0010\u001c\u001a\u00020\u001b\u0012\u0006\u0010\u001e\u001a\u00020\u001d\u0012\u0006\u0010 \u001a\u00020\u001f\u0012\u0006\u0010\"\u001a\u00020!¢\u0006\u0004\b#\u0010$J\u000f\u0010&\u001a\u00020%H\u0002¢\u0006\u0004\b&\u0010'J\u001f\u0010-\u001a\u00020,2\u0006\u0010)\u001a\u00020(2\u0006\u0010+\u001a\u00020*H\u0002¢\u0006\u0004\b-\u0010.J\u000f\u0010/\u001a\u00020,H\u0002¢\u0006\u0004\b/\u00100J-\u00104\u001a\u00020,2\u0014\u00103\u001a\u0010\u0012\u0004\u0012\u000202\u0012\u0006\u0012\u0004\u0018\u00010\u0001012\u0006\u0010+\u001a\u00020*H\u0002¢\u0006\u0004\b4\u00105J+\u00108\u001a\u00020,2\b\u00106\u001a\u0004\u0018\u0001022\u0010\u00107\u001a\f\u0012\u0004\u0012\u000202\u0012\u0002\b\u000301H\u0002¢\u0006\u0004\b8\u00109J\u000f\u0010:\u001a\u00020%H\u0002¢\u0006\u0004\b:\u0010'J\u0017\u0010<\u001a\u00020,2\u0006\u0010;\u001a\u000202H\u0002¢\u0006\u0004\b<\u0010=J#\u0010A\u001a\u00020,2\b\u0010>\u001a\u0004\u0018\u0001022\b\u0010@\u001a\u0004\u0018\u00010?H\u0002¢\u0006\u0004\bA\u0010BJ\u0019\u0010E\u001a\u00020,2\b\b\u0002\u0010D\u001a\u00020CH\u0007¢\u0006\u0004\bE\u0010FJ\u0015\u0010I\u001a\u00020,2\u0006\u0010H\u001a\u00020G¢\u0006\u0004\bI\u0010JJ\u000f\u0010K\u001a\u00020,H\u0007¢\u0006\u0004\bK\u00100J\u0017\u0010L\u001a\u00020,2\b\b\u0002\u0010+\u001a\u00020*¢\u0006\u0004\bL\u0010MJ\u0019\u0010N\u001a\u00020,2\b\u0010)\u001a\u0004\u0018\u00010(H\u0007¢\u0006\u0004\bN\u0010OJ\u001f\u0010P\u001a\u00020,2\u0006\u0010)\u001a\u00020(2\b\b\u0002\u0010+\u001a\u00020*¢\u0006\u0004\bP\u0010.J\r\u0010Q\u001a\u00020%¢\u0006\u0004\bQ\u0010'J\u000f\u0010R\u001a\u0004\u0018\u00010(¢\u0006\u0004\bR\u0010SJ\u0015\u0010U\u001a\u00020,2\u0006\u0010T\u001a\u000202¢\u0006\u0004\bU\u0010=J\u0015\u0010W\u001a\u00020,2\u0006\u0010V\u001a\u000202¢\u0006\u0004\bW\u0010=J%\u0010[\u001a\u00020,2\f\u0010Z\u001a\b\u0012\u0004\u0012\u00020Y0X2\b\b\u0002\u0010+\u001a\u00020*¢\u0006\u0004\b[\u0010\\J\u0019\u0010^\u001a\u00020,2\b\u00103\u001a\u0004\u0018\u00010]H\u0007¢\u0006\u0004\b^\u0010_J\u001f\u0010^\u001a\u00020,2\u0006\u00103\u001a\u00020]2\b\b\u0002\u0010+\u001a\u00020*¢\u0006\u0004\b^\u0010`J\u0015\u0010a\u001a\u00020,2\u0006\u00106\u001a\u000202¢\u0006\u0004\ba\u0010=J+\u0010a\u001a\u00020,2\b\u00106\u001a\u0004\u0018\u0001022\u0012\u0010b\u001a\u000e\u0012\u0004\u0012\u000202\u0012\u0002\b\u0003\u0018\u000101¢\u0006\u0004\ba\u00109J\u000f\u0010c\u001a\u00020,H\u0007¢\u0006\u0004\bc\u00100J\r\u0010d\u001a\u00020,¢\u0006\u0004\bd\u00100J\u0017\u0010d\u001a\u00020,2\b\u0010e\u001a\u0004\u0018\u000102¢\u0006\u0004\bd\u0010=J\u000f\u0010f\u001a\u00020,H\u0007¢\u0006\u0004\bf\u00100J\u000f\u0010g\u001a\u00020,H\u0007¢\u0006\u0004\bg\u00100J!\u0010i\u001a\u00020,2\u0010\u0010h\u001a\f\u0012\u0006\u0012\u0004\u0018\u000102\u0018\u00010XH\u0007¢\u0006\u0004\bi\u0010jJ\u0019\u0010l\u001a\u00020,2\b\u0010k\u001a\u0004\u0018\u000102H\u0007¢\u0006\u0004\bl\u0010=J\u0017\u0010n\u001a\u00020,2\u0006\u0010m\u001a\u000202H\u0007¢\u0006\u0004\bn\u0010=J\u0015\u0010q\u001a\u00020,2\u0006\u0010p\u001a\u00020o¢\u0006\u0004\bq\u0010rJ\u0017\u0010u\u001a\u00020,2\b\u0010t\u001a\u0004\u0018\u00010s¢\u0006\u0004\bu\u0010vJ\u0017\u0010w\u001a\u00020,2\b\u0010t\u001a\u0004\u0018\u00010s¢\u0006\u0004\bw\u0010vJ\r\u0010x\u001a\u00020,¢\u0006\u0004\bx\u00100J\u000f\u0010y\u001a\u00020,H\u0007¢\u0006\u0004\by\u00100J\u0019\u0010y\u001a\u00020,2\b\u0010@\u001a\u0004\u0018\u00010?H\u0007¢\u0006\u0004\by\u0010zJ\u000f\u0010{\u001a\u00020,H\u0007¢\u0006\u0004\b{\u00100J\r\u0010|\u001a\u00020,¢\u0006\u0004\b|\u00100J\u0016\u0010\u001a\u00020,2\u0006\u0010~\u001a\u00020}¢\u0006\u0005\b\u0010\u0001J\u001a\u0010\u0001\u001a\u00020,2\b\u0010~\u001a\u0004\u0018\u00010}¢\u0006\u0006\b\u0001\u0010\u0001J\u001a\u0010\u0001\u001a\u00020,2\u0007\u0010\u0001\u001a\u000202H\u0007¢\u0006\u0005\b\u0001\u0010=J\u001c\u0010\u0001\u001a\u00020,2\n\u0010\u0001\u001a\u0005\u0018\u00010\u0001¢\u0006\u0006\b\u0001\u0010\u0001J#\u0010\u0001\u001a\u00020,2\u0011\u0010\u0001\u001a\f\u0012\u0007\b\u0001\u0012\u00030\u00010\u0001¢\u0006\u0006\b\u0001\u0010\u0001J'\u0010\u0001\u001a\u00020,2\t\u0010\u0001\u001a\u0004\u0018\u0001022\n\u0010\u0001\u001a\u0005\u0018\u00010\u0001¢\u0006\u0006\b\u0001\u0010\u0001J'\u0010\u0001\u001a\u00020,2\t\u0010\u0001\u001a\u0004\u0018\u0001022\n\u0010\u0001\u001a\u0005\u0018\u00010\u0001¢\u0006\u0006\b\u0001\u0010\u0001R\u0015\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0007\n\u0005\b\u0003\u0010\u0001R\u001b\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0004¢\u0006\u0007\n\u0005\b\u0006\u0010\u0001R\u0015\u0010\b\u001a\u00020\u00078\u0002X\u0004¢\u0006\u0007\n\u0005\b\b\u0010\u0001R\u0015\u0010\n\u001a\u00020\t8\u0002X\u0004¢\u0006\u0007\n\u0005\b\n\u0010\u0001R\u0015\u0010\f\u001a\u00020\u000b8\u0002X\u0004¢\u0006\u0007\n\u0005\b\f\u0010\u0001R\u0015\u0010\u0010\u001a\u00020\u000f8\u0002X\u0004¢\u0006\u0007\n\u0005\b\u0010\u0010\u0001R\u0015\u0010\u0012\u001a\u00020\u00118\u0002X\u0004¢\u0006\u0007\n\u0005\b\u0012\u0010\u0001R\u001b\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00048\u0002X\u0004¢\u0006\u0007\n\u0005\b\u0014\u0010\u0001R\u0015\u0010\u0016\u001a\u00020\u00158\u0002X\u0004¢\u0006\u0007\n\u0005\b\u0016\u0010\u0001R\u0015\u0010\u0018\u001a\u00020\u00178\u0002X\u0004¢\u0006\u0007\n\u0005\b\u0018\u0010\u0001R\u001b\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u00048\u0002X\u0004¢\u0006\u0007\n\u0005\b\u001a\u0010\u0001R\u0015\u0010\u001c\u001a\u00020\u001b8\u0002X\u0004¢\u0006\u0007\n\u0005\b\u001c\u0010 \u0001R\u0015\u0010\u001e\u001a\u00020\u001d8\u0002X\u0004¢\u0006\u0007\n\u0005\b\u001e\u0010¡\u0001R\u0015\u0010 \u001a\u00020\u001f8\u0002X\u0004¢\u0006\u0007\n\u0005\b \u0010¢\u0001R\u0015\u0010\"\u001a\u00020!8\u0002X\u0004¢\u0006\u0007\n\u0005\b\"\u0010£\u0001R\u0014\u0010¦\u0001\u001a\u00020o8F¢\u0006\b\u001a\u0006\b¤\u0001\u0010¥\u0001¨\u0006ª\u0001"}, d2 = {"Lio/intercom/android/sdk/Intercom;", "", "Lio/intercom/android/sdk/api/DeDuper;", "superDeDuper", "Lio/intercom/android/sdk/Provider;", "Lio/intercom/android/sdk/api/Api;", "apiProvider", "Lio/intercom/android/nexus/NexusClient;", "nexusClient", "Lio/intercom/android/sdk/m5/data/UnreadCountTracker;", "unreadCountTracker", "Lio/intercom/android/sdk/metrics/MetricTracker;", "metricTracker", "Lio/intercom/android/sdk/errorreporting/ErrorReporter;", "errorReporter", "Landroid/app/Application;", "context", "Lio/intercom/android/sdk/overlay/OverlayPresenter;", "overlayPresenter", "Lio/intercom/android/sdk/identity/AppConfig;", "appConfigProvider", "Lio/intercom/android/sdk/identity/UserIdentity;", "userIdentity", "Lio/intercom/android/sdk/push/SystemNotificationManager;", "systemNotificationManager", "Lio/intercom/android/sdk/api/UserUpdater;", "userUpdater", "Lio/intercom/android/sdk/ResetManager;", "resetManager", "Lcom/intercom/twig/Twig;", "twig", "Lio/intercom/android/sdk/utilities/ActivityFinisher;", "activityFinisher", "Lio/intercom/android/sdk/m5/data/IntercomDataLayer;", "dataLayer", "<init>", "(Lio/intercom/android/sdk/api/DeDuper;Lio/intercom/android/sdk/Provider;Lio/intercom/android/nexus/NexusClient;Lio/intercom/android/sdk/m5/data/UnreadCountTracker;Lio/intercom/android/sdk/metrics/MetricTracker;Lio/intercom/android/sdk/errorreporting/ErrorReporter;Landroid/app/Application;Lio/intercom/android/sdk/overlay/OverlayPresenter;Lio/intercom/android/sdk/Provider;Lio/intercom/android/sdk/identity/UserIdentity;Lio/intercom/android/sdk/push/SystemNotificationManager;Lio/intercom/android/sdk/Provider;Lio/intercom/android/sdk/ResetManager;Lcom/intercom/twig/Twig;Lio/intercom/android/sdk/utilities/ActivityFinisher;Lio/intercom/android/sdk/m5/data/IntercomDataLayer;)V", "", "shouldDisableErrorReporting", "()Z", "Lio/intercom/android/sdk/identity/Registration;", "userRegistration", "Lio/intercom/android/sdk/IntercomStatusCallback;", "intercomStatusCallback", "Llf/M;", "registerNewIdentifiedUser", "(Lio/intercom/android/sdk/identity/Registration;Lio/intercom/android/sdk/IntercomStatusCallback;)V", "softRegister", "()V", "", "", "userAttributes", "performUpdate", "(Ljava/util/Map;Lio/intercom/android/sdk/IntercomStatusCallback;)V", "name", "metadata", "logEventWithValidation", "(Ljava/lang/String;Ljava/util/Map;)V", "noUserRegistered", "error", "logErrorAndOpenInbox", "(Ljava/lang/String;)V", "pushDataString", "Landroid/app/TaskStackBuilder;", "customStack", "openIntercomChatPush", "(Ljava/lang/String;Landroid/app/TaskStackBuilder;)V", "Lio/intercom/android/sdk/IntercomSpace;", "space", "present", "(Lio/intercom/android/sdk/IntercomSpace;)V", "Lio/intercom/android/sdk/IntercomContent;", "content", "presentContent", "(Lio/intercom/android/sdk/IntercomContent;)V", "registerUnidentifiedUser", "loginUnidentifiedUser", "(Lio/intercom/android/sdk/IntercomStatusCallback;)V", "registerIdentifiedUser", "(Lio/intercom/android/sdk/identity/Registration;)V", "loginIdentifiedUser", "isUserLoggedIn", "fetchLoggedInUserAttributes", "()Lio/intercom/android/sdk/identity/Registration;", "userHash", "setUserHash", "jwt", "setUserJwt", "", "Lio/intercom/android/sdk/AuthToken;", "authTokens", "setAuthTokens", "(Ljava/util/List;Lio/intercom/android/sdk/IntercomStatusCallback;)V", "Lio/intercom/android/sdk/UserAttributes;", "updateUser", "(Lio/intercom/android/sdk/UserAttributes;)V", "(Lio/intercom/android/sdk/UserAttributes;Lio/intercom/android/sdk/IntercomStatusCallback;)V", "logEvent", "metaData", "displayMessenger", "displayMessageComposer", "initialMessage", "displayConversationsList", "displayHelpCenter", "collectionIds", "displayHelpCenterCollections", "(Ljava/util/List;)V", "carouselId", "displayCarousel", "surveyId", "displaySurvey", "", "bottomPadding", "setBottomPadding", "(I)V", "Lio/intercom/android/sdk/Intercom$Visibility;", "visibility", "setInAppMessageVisibility", "(Lio/intercom/android/sdk/Intercom$Visibility;)V", "setLauncherVisibility", "hideIntercom", "handlePushMessage", "(Landroid/app/TaskStackBuilder;)V", "reset", "logout", "Lio/intercom/android/sdk/UnreadConversationCountListener;", "listener", "addUnreadConversationCountListener", "(Lio/intercom/android/sdk/UnreadConversationCountListener;)V", "removeUnreadConversationCountListener", "articleId", "displayArticle", "Lio/intercom/android/sdk/helpcenter/api/CollectionRequestCallback;", "collectionRequestCallback", "fetchHelpCenterCollections", "(Lio/intercom/android/sdk/helpcenter/api/CollectionRequestCallback;)V", "Ljava/lang/Class;", "Landroid/app/Activity;", "activityClass", "pushBackstackActivity", "(Ljava/lang/Class;)V", "collectionId", "Lio/intercom/android/sdk/helpcenter/api/CollectionContentRequestCallback;", "collectionContentRequestCallback", "fetchHelpCenterCollection", "(Ljava/lang/String;Lio/intercom/android/sdk/helpcenter/api/CollectionContentRequestCallback;)V", "searchTerm", "Lio/intercom/android/sdk/helpcenter/api/SearchRequestCallback;", "searchRequestCallback", "searchHelpCenter", "(Ljava/lang/String;Lio/intercom/android/sdk/helpcenter/api/SearchRequestCallback;)V", "Lio/intercom/android/sdk/api/DeDuper;", "Lio/intercom/android/sdk/Provider;", "Lio/intercom/android/nexus/NexusClient;", "Lio/intercom/android/sdk/m5/data/UnreadCountTracker;", "Lio/intercom/android/sdk/metrics/MetricTracker;", "Landroid/app/Application;", "Lio/intercom/android/sdk/overlay/OverlayPresenter;", "Lio/intercom/android/sdk/identity/UserIdentity;", "Lio/intercom/android/sdk/push/SystemNotificationManager;", "Lio/intercom/android/sdk/ResetManager;", "Lcom/intercom/twig/Twig;", "Lio/intercom/android/sdk/utilities/ActivityFinisher;", "Lio/intercom/android/sdk/m5/data/IntercomDataLayer;", "getUnreadConversationCount", "()I", "unreadConversationCount", "Companion", "Visibility", "LogLevel", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class Intercom {
    public static final int $stable = 8;
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    public static final Visibility GONE = Visibility.GONE;
    public static final String PUSH_RECEIVER = "intercom_sdk";
    /* access modifiers changed from: private */
    public static final Twig TWIG = LumberMill.getLogger();
    public static final Visibility VISIBLE = Visibility.VISIBLE;
    /* access modifiers changed from: private */
    @SuppressLint({"StaticFieldLeak"})
    public static Intercom instance;
    private final ActivityFinisher activityFinisher;
    private final Provider<Api> apiProvider;
    private final Provider<AppConfig> appConfigProvider;
    private final Application context;
    private final IntercomDataLayer dataLayer;
    private final MetricTracker metricTracker;
    private final NexusClient nexusClient;
    private final OverlayPresenter overlayPresenter;
    private final ResetManager resetManager;
    private final DeDuper superDeDuper;
    private final SystemNotificationManager systemNotificationManager;
    private final Twig twig;
    private final UnreadCountTracker unreadCountTracker;
    private final UserIdentity userIdentity;
    private final Provider<UserUpdater> userUpdater;

    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J+\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\n\u0010\u000bJ-\u0010\r\u001a\u00020\f2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u0006H\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u0019\u0010\u000f\u001a\u00020\f2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u0019\u0010\u0011\u001a\u00020\f2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\u0011\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\tH\u0007¢\u0006\u0004\b\u0012\u0010\u0013J\u0019\u0010\u0016\u001a\u00020\f2\b\b\u0001\u0010\u0015\u001a\u00020\u0014H\u0007¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0019\u001a\u00020\u00188\u0006X\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001b\u001a\u00020\u00188\u0006X\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001aR\u0014\u0010\u001c\u001a\u00020\u00068\u0006XT¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u001c\u0010 \u001a\n \u001f*\u0004\u0018\u00010\u001e0\u001e8\u0002X\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0018\u0010\"\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\"\u0010#¨\u0006$"}, d2 = {"Lio/intercom/android/sdk/Intercom$Companion;", "", "<init>", "()V", "Landroid/app/Application;", "application", "", "apiKey", "appId", "Lio/intercom/android/sdk/Intercom;", "create", "(Landroid/app/Application;Ljava/lang/String;Ljava/lang/String;)Lio/intercom/android/sdk/Intercom;", "Llf/M;", "initialize", "(Landroid/app/Application;Ljava/lang/String;Ljava/lang/String;)V", "registerForLaterInitialisation", "(Landroid/app/Application;)V", "unregisterForLateInitialisation", "client", "()Lio/intercom/android/sdk/Intercom;", "", "logLevel", "setLogLevel", "(I)V", "Lio/intercom/android/sdk/Intercom$Visibility;", "VISIBLE", "Lio/intercom/android/sdk/Intercom$Visibility;", "GONE", "PUSH_RECEIVER", "Ljava/lang/String;", "Lcom/intercom/twig/Twig;", "kotlin.jvm.PlatformType", "TWIG", "Lcom/intercom/twig/Twig;", "instance", "Lio/intercom/android/sdk/Intercom;", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final Intercom create(Application application, String str, String str2) {
            Injector.initWithAppCredentials(application, str, str2);
            Injector injector = Injector.get();
            IntercomDataLayer dataLayer = injector.getDataLayer();
            IntercomDataLayer intercomDataLayer = dataLayer;
            DeDuper deDuper = injector.getDeDuper();
            DeDuper deDuper2 = deDuper;
            C6496s.g(deDuper, "getDeDuper(...)");
            Provider<Api> apiProvider = injector.getApiProvider();
            Provider<Api> provider = apiProvider;
            C6496s.g(apiProvider, "getApiProvider(...)");
            NexusClient nexusClient = injector.getNexusClient();
            NexusClient nexusClient2 = nexusClient;
            C6496s.g(nexusClient, "getNexusClient(...)");
            UnreadCountTracker unreadCountTracker = r6;
            C6496s.e(dataLayer);
            UnreadCountTracker unreadCountTracker2 = new UnreadCountTracker(dataLayer);
            MetricTracker metricTracker = injector.getMetricTracker();
            MetricTracker metricTracker2 = metricTracker;
            C6496s.g(metricTracker, "getMetricTracker(...)");
            ErrorReporter errorReporter = injector.getErrorReporter();
            ErrorReporter errorReporter2 = errorReporter;
            C6496s.g(errorReporter, "getErrorReporter(...)");
            OverlayPresenter overlayPresenter = injector.getOverlayPresenter();
            OverlayPresenter overlayPresenter2 = overlayPresenter;
            C6496s.g(overlayPresenter, "getOverlayPresenter(...)");
            Provider<AppConfig> appConfigProvider = injector.getAppConfigProvider();
            Provider<AppConfig> provider2 = appConfigProvider;
            C6496s.g(appConfigProvider, "getAppConfigProvider(...)");
            UserIdentity userIdentity = injector.getUserIdentity();
            UserIdentity userIdentity2 = userIdentity;
            C6496s.g(userIdentity, "getUserIdentity(...)");
            SystemNotificationManager systemNotificationManager = injector.getSystemNotificationManager();
            SystemNotificationManager systemNotificationManager2 = systemNotificationManager;
            C6496s.g(systemNotificationManager, "getSystemNotificationManager(...)");
            Provider<UserUpdater> userUpdaterProvider = injector.getUserUpdaterProvider();
            Provider<UserUpdater> provider3 = userUpdaterProvider;
            C6496s.g(userUpdaterProvider, "getUserUpdaterProvider(...)");
            ResetManager resetManager = injector.getResetManager();
            ResetManager resetManager2 = resetManager;
            C6496s.g(resetManager, "getResetManager(...)");
            Twig logger = LumberMill.getLogger();
            Twig twig = logger;
            C6496s.g(logger, "getLogger(...)");
            ActivityFinisher activityFinisher = injector.getActivityFinisher();
            C6496s.g(activityFinisher, "getActivityFinisher(...)");
            return new Intercom(deDuper2, provider, nexusClient2, unreadCountTracker, metricTracker2, errorReporter2, application, overlayPresenter2, provider2, userIdentity2, systemNotificationManager2, provider3, resetManager2, twig, activityFinisher, intercomDataLayer);
        }

        public final synchronized Intercom client() {
            Intercom access$getInstance$cp;
            access$getInstance$cp = Intercom.instance;
            if (access$getInstance$cp == null) {
                throw new IllegalStateException("Intercom has been initialized incorrectly. Please make sure the first Intercom method you call is initialize() and that you're passing in the correct app ID and API key");
            }
            return access$getInstance$cp;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:16:0x0058, code lost:
            return;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final synchronized void initialize(android.app.Application r3, java.lang.String r4, java.lang.String r5) {
            /*
                r2 = this;
                monitor-enter(r2)
                io.intercom.android.sdk.Intercom r0 = io.intercom.android.sdk.Intercom.instance     // Catch:{ all -> 0x0015 }
                r1 = 0
                if (r0 == 0) goto L_0x0017
                com.intercom.twig.Twig r3 = io.intercom.android.sdk.Intercom.TWIG     // Catch:{ all -> 0x0015 }
                java.lang.String r4 = "Intercom has already been initialized"
                java.lang.Object[] r5 = new java.lang.Object[r1]     // Catch:{ all -> 0x0015 }
                r3.i(r4, r5)     // Catch:{ all -> 0x0015 }
                monitor-exit(r2)
                return
            L_0x0015:
                r3 = move-exception
                goto L_0x0059
            L_0x0017:
                if (r3 == 0) goto L_0x001e
                io.intercom.android.sdk.sentry.SentrySessionManager r0 = io.intercom.android.sdk.sentry.SentrySessionManager.INSTANCE     // Catch:{ all -> 0x0015 }
                r0.registerSentry(r3)     // Catch:{ all -> 0x0015 }
            L_0x001e:
                boolean r0 = io.intercom.android.sdk.utilities.ValidatorUtil.isValidConstructorParams(r3, r4, r5)     // Catch:{ all -> 0x0015 }
                if (r0 == 0) goto L_0x004c
                kotlin.jvm.internal.C6496s.e(r3)     // Catch:{ all -> 0x0015 }
                io.intercom.android.sdk.Intercom r4 = r2.create(r3, r4, r5)     // Catch:{ all -> 0x0015 }
                io.intercom.android.sdk.Intercom.instance = r4     // Catch:{ all -> 0x0015 }
                io.intercom.android.sdk.LateInitializationPreparer r4 = io.intercom.android.sdk.LateInitializationPreparer.getInstance()     // Catch:{ all -> 0x0015 }
                io.intercom.android.sdk.Injector r5 = io.intercom.android.sdk.Injector.get()     // Catch:{ all -> 0x0015 }
                r4.handlePastLifecycleEvents(r3, r5)     // Catch:{ all -> 0x0015 }
                io.intercom.android.sdk.Injector r3 = io.intercom.android.sdk.Injector.get()     // Catch:{ all -> 0x0015 }
                io.intercom.android.sdk.metrics.MetricTracker r3 = r3.getMetricTracker()     // Catch:{ all -> 0x0015 }
                r3.initialiseAPICall()     // Catch:{ all -> 0x0015 }
                io.intercom.android.sdk.Injector r3 = io.intercom.android.sdk.Injector.get()     // Catch:{ all -> 0x0015 }
                r3.initializeIntercomEventsListeners()     // Catch:{ all -> 0x0015 }
                goto L_0x0057
            L_0x004c:
                com.intercom.twig.Twig r3 = io.intercom.android.sdk.Intercom.TWIG     // Catch:{ all -> 0x0015 }
                java.lang.String r4 = "Intercom has been initialized incorrectly. Please make sure that you're passing in the correct app ID and API key"
                java.lang.Object[] r5 = new java.lang.Object[r1]     // Catch:{ all -> 0x0015 }
                r3.e(r4, r5)     // Catch:{ all -> 0x0015 }
            L_0x0057:
                monitor-exit(r2)
                return
            L_0x0059:
                monitor-exit(r2)     // Catch:{ all -> 0x0015 }
                throw r3
            */
            throw new UnsupportedOperationException("Method not decompiled: io.intercom.android.sdk.Intercom.Companion.initialize(android.app.Application, java.lang.String, java.lang.String):void");
        }

        public final synchronized void registerForLaterInitialisation(Application application) {
            if (Intercom.instance != null) {
                Intercom.TWIG.i("Intercom has already been initialized", new Object[0]);
            } else if (application != null) {
                LateInitializationPreparer.getInstance().register(application);
            } else {
                throw new NullPointerException("Cannot call registerForLaterInitialisation() with a null Application");
            }
        }

        public final void setLogLevel(@LogLevel int i10) {
            Injector.get().getMetricTracker().setLogLevelAPICall();
            LumberMill.setLogLevel(i10);
        }

        public final void unregisterForLateInitialisation(Application application) {
            Injector.get().getMetricTracker().unRegisterForLateInitialisationAPICall();
            if (application != null) {
                LateInitializationPreparer.getInstance().unregister(application);
                return;
            }
            throw new NullPointerException("Cannot call unregisterForLateInitialisation() with a null Application");
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\b\u0002\b\u0002\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002B\u0000¨\u0006\u0003"}, d2 = {"Lio/intercom/android/sdk/Intercom$LogLevel;", "", "Companion", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @Retention(RetentionPolicy.RUNTIME)
    public @interface LogLevel {
        public static final int ASSERT = 7;
        public static final Companion Companion = Companion.$$INSTANCE;
        public static final int DEBUG = 3;
        public static final int DISABLED = 8;
        public static final int ERROR = 6;
        public static final int INFO = 4;
        public static final int VERBOSE = 2;
        public static final int WARN = 5;

        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005XT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005XT¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005XT¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lio/intercom/android/sdk/Intercom$LogLevel$Companion;", "", "<init>", "()V", "VERBOSE", "", "DEBUG", "INFO", "WARN", "ERROR", "ASSERT", "DISABLED", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Companion {
            static final /* synthetic */ Companion $$INSTANCE = new Companion();
            public static final int ASSERT = 7;
            public static final int DEBUG = 3;
            public static final int DISABLED = 8;
            public static final int ERROR = 6;
            public static final int INFO = 4;
            public static final int VERBOSE = 2;
            public static final int WARN = 5;

            private Companion() {
            }
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lio/intercom/android/sdk/Intercom$Visibility;", "", "<init>", "(Ljava/lang/String;I)V", "GONE", "VISIBLE", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public enum Visibility {
        GONE,
        VISIBLE;

        static {
            Visibility[] $values;
            $ENTRIES = C6714a.a($values);
        }

        public static EnumEntries getEntries() {
            return $ENTRIES;
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        /* JADX WARNING: Can't wrap try/catch for region: R(13:0|(2:1|2)|3|5|6|7|8|9|10|11|12|13|15) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0033 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0021 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x002a */
        static {
            /*
                io.intercom.android.sdk.IntercomPushManager$IntercomPushIntegrationType[] r0 = io.intercom.android.sdk.IntercomPushManager.IntercomPushIntegrationType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                r1 = 1
                io.intercom.android.sdk.IntercomPushManager$IntercomPushIntegrationType r2 = io.intercom.android.sdk.IntercomPushManager.IntercomPushIntegrationType.FCM     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                $EnumSwitchMapping$0 = r0
                io.intercom.android.sdk.IntercomSpace[] r0 = io.intercom.android.sdk.IntercomSpace.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                io.intercom.android.sdk.IntercomSpace r2 = io.intercom.android.sdk.IntercomSpace.HelpCenter     // Catch:{ NoSuchFieldError -> 0x0021 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0021 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0021 }
            L_0x0021:
                io.intercom.android.sdk.IntercomSpace r1 = io.intercom.android.sdk.IntercomSpace.Home     // Catch:{ NoSuchFieldError -> 0x002a }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002a }
            L_0x002a:
                io.intercom.android.sdk.IntercomSpace r1 = io.intercom.android.sdk.IntercomSpace.Messages     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                io.intercom.android.sdk.IntercomSpace r1 = io.intercom.android.sdk.IntercomSpace.Tickets     // Catch:{ NoSuchFieldError -> 0x003c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003c }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003c }
            L_0x003c:
                $EnumSwitchMapping$1 = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: io.intercom.android.sdk.Intercom.WhenMappings.<clinit>():void");
        }
    }

    public Intercom(DeDuper deDuper, Provider<Api> provider, NexusClient nexusClient2, UnreadCountTracker unreadCountTracker2, MetricTracker metricTracker2, ErrorReporter errorReporter, Application application, OverlayPresenter overlayPresenter2, Provider<AppConfig> provider2, UserIdentity userIdentity2, SystemNotificationManager systemNotificationManager2, Provider<UserUpdater> provider3, ResetManager resetManager2, Twig twig2, ActivityFinisher activityFinisher2, IntercomDataLayer intercomDataLayer) {
        DeDuper deDuper2 = deDuper;
        Provider<Api> provider4 = provider;
        NexusClient nexusClient3 = nexusClient2;
        UnreadCountTracker unreadCountTracker3 = unreadCountTracker2;
        Application application2 = application;
        OverlayPresenter overlayPresenter3 = overlayPresenter2;
        Provider<AppConfig> provider5 = provider2;
        UserIdentity userIdentity3 = userIdentity2;
        SystemNotificationManager systemNotificationManager3 = systemNotificationManager2;
        Provider<UserUpdater> provider6 = provider3;
        ResetManager resetManager3 = resetManager2;
        Twig twig3 = twig2;
        ActivityFinisher activityFinisher3 = activityFinisher2;
        IntercomDataLayer intercomDataLayer2 = intercomDataLayer;
        C6496s.h(deDuper2, "superDeDuper");
        C6496s.h(provider4, "apiProvider");
        C6496s.h(nexusClient3, "nexusClient");
        C6496s.h(unreadCountTracker3, "unreadCountTracker");
        C6496s.h(metricTracker2, "metricTracker");
        C6496s.h(errorReporter, "errorReporter");
        C6496s.h(application2, "context");
        C6496s.h(overlayPresenter3, "overlayPresenter");
        C6496s.h(provider5, "appConfigProvider");
        C6496s.h(userIdentity3, "userIdentity");
        C6496s.h(systemNotificationManager3, "systemNotificationManager");
        C6496s.h(provider6, "userUpdater");
        C6496s.h(resetManager3, "resetManager");
        C6496s.h(twig3, "twig");
        C6496s.h(activityFinisher3, "activityFinisher");
        C6496s.h(intercomDataLayer2, "dataLayer");
        this.superDeDuper = deDuper2;
        this.apiProvider = provider4;
        this.nexusClient = nexusClient3;
        this.unreadCountTracker = unreadCountTracker3;
        this.metricTracker = metricTracker2;
        this.context = application2;
        this.overlayPresenter = overlayPresenter3;
        this.appConfigProvider = provider5;
        this.userIdentity = userIdentity3;
        this.systemNotificationManager = systemNotificationManager3;
        this.userUpdater = provider6;
        this.resetManager = resetManager3;
        this.twig = twig3;
        this.activityFinisher = activityFinisher3;
        this.dataLayer = intercomDataLayer2;
        IntercomPushManager.IntercomPushIntegrationType installedModuleType = IntercomPushManager.getInstalledModuleType();
        if ((installedModuleType == null ? -1 : WhenMappings.$EnumSwitchMapping$0[installedModuleType.ordinal()]) == 1) {
            twig3.i("Enabling FCM for cloud messaging", new Object[0]);
            IntercomLegacyPushClientHandler.Companion.setUpNotificationChannels(systemNotificationManager3, application2);
            IntercomPushManager.initializeFcmService(application);
        } else {
            twig3.internal("No FCM integration detected");
        }
        if (shouldDisableErrorReporting()) {
            errorReporter.disableExceptionHandler();
        } else {
            errorReporter.enableExceptionHandler();
        }
    }

    public static final synchronized Intercom client() {
        Intercom client;
        synchronized (Intercom.class) {
            client = Companion.client();
        }
        return client;
    }

    public static final synchronized void initialize(Application application, String str, String str2) {
        synchronized (Intercom.class) {
            Companion.initialize(application, str, str2);
        }
    }

    private final void logErrorAndOpenInbox(String str) {
        this.twig.e(str, new Object[0]);
        present(IntercomSpace.Messages);
    }

    private final void logEventWithValidation(String str, Map<String, ?> map) {
        if (str == null || str.length() == 0) {
            this.twig.e("The event name is null or empty. We can't log an event with this string.", new Object[0]);
        } else {
            this.apiProvider.get().logEvent(str, map);
        }
    }

    public static /* synthetic */ void loginIdentifiedUser$default(Intercom intercom, Registration registration, IntercomStatusCallback intercomStatusCallback, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            intercomStatusCallback = IntercomStatusCallbackKt.getNoStatusCallback();
        }
        intercom.loginIdentifiedUser(registration, intercomStatusCallback);
    }

    public static /* synthetic */ void loginUnidentifiedUser$default(Intercom intercom, IntercomStatusCallback intercomStatusCallback, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            intercomStatusCallback = IntercomStatusCallbackKt.getNoStatusCallback();
        }
        intercom.loginUnidentifiedUser(intercomStatusCallback);
    }

    private final boolean noUserRegistered() {
        if (!this.userIdentity.identityExists() || this.userIdentity.isSoftReset()) {
            return true;
        }
        return false;
    }

    private final void openIntercomChatPush(String str, TaskStackBuilder taskStackBuilder) {
        if (C6496s.c(str, IntercomPushManager.MULTIPLE_NOTIFICATIONS)) {
            IntercomRootActivityLauncher.INSTANCE.startMessages(this.context);
        } else {
            Intent conversationIntent = ConversationScreenOpenerKt.getConversationIntent(this.context, str);
            if (taskStackBuilder != null) {
                taskStackBuilder.addNextIntent(conversationIntent);
                this.context.startActivities(taskStackBuilder.getIntents());
            } else {
                this.context.startActivity(conversationIntent);
            }
        }
        this.metricTracker.viewedPushNotification(str);
        IntercomLegacyPushClientHandler.Companion.clear(this.systemNotificationManager, this.context);
    }

    private final void performUpdate(Map<String, ? extends Object> map, IntercomStatusCallback intercomStatusCallback) {
        if (this.userIdentity.isUnidentified()) {
            AttributeSanitiser.anonymousSanitisation(map);
        }
        if (this.superDeDuper.shouldUpdateUser(map)) {
            this.superDeDuper.update(map);
            this.userUpdater.get().updateUser(UserUpdateRequest.create(false, ((HostAppState) this.dataLayer.getHostAppState().getValue()).isBackgrounded(), map, false), intercomStatusCallback);
            this.twig.internal("dupe", "updated user");
            return;
        }
        intercomStatusCallback.onSuccess();
        this.twig.internal("dupe", "dropped dupe");
    }

    public static /* synthetic */ void present$default(Intercom intercom, IntercomSpace intercomSpace, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            intercomSpace = IntercomSpace.Home;
        }
        intercom.present(intercomSpace);
    }

    public static final synchronized void registerForLaterInitialisation(Application application) {
        synchronized (Intercom.class) {
            Companion.registerForLaterInitialisation(application);
        }
    }

    private final void registerNewIdentifiedUser(Registration registration, IntercomStatusCallback intercomStatusCallback) {
        UserUpdateRequest userUpdateRequest;
        this.resetManager.hardReset();
        this.userIdentity.registerIdentifiedUser(registration);
        this.nexusClient.disconnect();
        boolean z10 = !((HostAppState) this.dataLayer.getHostAppState().getValue()).getSessionStartedSinceLastBackgrounded();
        boolean isBackgrounded = ((HostAppState) this.dataLayer.getHostAppState().getValue()).isBackgrounded();
        if (registration.getAttributes() != null) {
            UserAttributes attributes = registration.getAttributes();
            C6496s.e(attributes);
            userUpdateRequest = UserUpdateRequest.create(z10, isBackgrounded, attributes.toMap(), true);
            C6496s.e(userUpdateRequest);
        } else {
            userUpdateRequest = UserUpdateRequest.create(z10, isBackgrounded, true);
            C6496s.e(userUpdateRequest);
        }
        this.userUpdater.get().updateUser(userUpdateRequest, intercomStatusCallback);
    }

    public static /* synthetic */ void setAuthTokens$default(Intercom intercom, List list, IntercomStatusCallback intercomStatusCallback, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            intercomStatusCallback = IntercomStatusCallbackKt.getNoStatusCallback();
        }
        intercom.setAuthTokens(list, intercomStatusCallback);
    }

    public static final void setLogLevel(@LogLevel int i10) {
        Companion.setLogLevel(i10);
    }

    private final boolean shouldDisableErrorReporting() {
        return this.appConfigProvider.get().hasFeature(FeatureFlag.DISABLE_ERROR_REPORTING);
    }

    private final void softRegister() {
        this.nexusClient.connect(this.appConfigProvider.get().getRealTimeConfig(), true);
        this.userIdentity.softRestart();
        this.resetManager.clear();
        a aVar = new a(this);
        if (C6496s.c(Looper.myLooper(), Looper.getMainLooper())) {
            aVar.run();
        } else {
            new Handler(Looper.getMainLooper()).post(aVar);
        }
    }

    /* access modifiers changed from: private */
    public static final void softRegister$lambda$2(Intercom intercom) {
        C6496s.h(intercom, "this$0");
        intercom.overlayPresenter.refreshStateBecauseUserIdentityIsNotInStoreYet();
    }

    public static final void unregisterForLateInitialisation(Application application) {
        Companion.unregisterForLateInitialisation(application);
    }

    public static /* synthetic */ void updateUser$default(Intercom intercom, UserAttributes userAttributes, IntercomStatusCallback intercomStatusCallback, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            intercomStatusCallback = IntercomStatusCallbackKt.getNoStatusCallback();
        }
        intercom.updateUser(userAttributes, intercomStatusCallback);
    }

    public final void addUnreadConversationCountListener(UnreadConversationCountListener unreadConversationCountListener) {
        C6496s.h(unreadConversationCountListener, "listener");
        this.metricTracker.addUnreadConversationCountListenerAPICall();
        UnreadCountTracker.addListener$default(this.unreadCountTracker, unreadConversationCountListener, (G) null, 2, (Object) null);
    }

    @C6521e
    public final void displayArticle(String str) {
        C6496s.h(str, "articleId");
        this.metricTracker.displayArticleAPICall();
        this.context.startActivity(ArticleActivity.Companion.buildIntent(this.context, new ArticleActivity.ArticleActivityArguments(str, MetricTracker.Place.API, false, false, 12, (DefaultConstructorMarker) null)));
    }

    @C6521e
    public final void displayCarousel(String str) {
        this.metricTracker.displayCarouselAPICall();
        Application application = this.context;
        application.startActivity(IntercomCarouselActivity.buildIntent(application, str));
    }

    @C6521e
    public final void displayConversationsList() {
        this.metricTracker.displayConversationsListAPICall();
        this.metricTracker.openedMessengerConversationList(LauncherOpenBehaviour.LauncherType.CUSTOM);
        IntercomRootActivityLauncher.INSTANCE.startMessages(this.context);
    }

    @C6521e
    public final void displayHelpCenter() {
        this.metricTracker.displayHelpCenterAPICall();
        displayHelpCenterCollections(C6565s.n());
    }

    @C6521e
    public final void displayHelpCenterCollections(List<String> list) {
        List list2;
        this.metricTracker.displayHelpCenterCollectionsAPICall();
        Application application = this.context;
        if (list != null) {
            list2 = C6565s.l0(list);
        } else {
            list2 = null;
        }
        if (list2 == null) {
            list2 = C6565s.n();
        }
        HelpCenterUrlUtilsKt.openCollections(application, list2, MetricTracker.Place.API);
    }

    public final void displayMessageComposer() {
        this.metricTracker.displayMessageComposerAPICall();
        displayMessageComposer("");
    }

    @C6521e
    public final void displayMessenger() {
        this.metricTracker.displayMessengerAPICall();
        if (noUserRegistered()) {
            logErrorAndOpenInbox("The messenger was opened but there was no user registered on this device.Please call registerUnidentifiedUser() or registerIdentifiedUser(Registration).");
        } else {
            new LauncherOpenBehaviour().openMessenger(this.context);
        }
    }

    @C6521e
    public final void displaySurvey(String str) {
        C6496s.h(str, "surveyId");
        this.metricTracker.displaySurveyAPICall();
        Application application = this.context;
        application.startActivity(IntercomSurveyActivity.Companion.buildIntent(application, str));
    }

    public final void fetchHelpCenterCollection(String str, CollectionContentRequestCallback collectionContentRequestCallback) {
        this.metricTracker.fetchHelpCenterCollectionAPICall();
        HelpCenterApiWrapper helpCenterApiWrapper = HelpCenterApiWrapper.INSTANCE;
        MetricTracker metricTracker2 = this.metricTracker;
        C6496s.e(str);
        C6496s.e(collectionContentRequestCallback);
        helpCenterApiWrapper.fetchHelpCenterCollection(metricTracker2, str, collectionContentRequestCallback);
    }

    public final void fetchHelpCenterCollections(CollectionRequestCallback collectionRequestCallback) {
        this.metricTracker.fetchHelpCenterCollectionsAPICall();
        HelpCenterApiWrapper helpCenterApiWrapper = HelpCenterApiWrapper.INSTANCE;
        MetricTracker metricTracker2 = this.metricTracker;
        C6496s.e(collectionRequestCallback);
        helpCenterApiWrapper.fetchHelpCenterCollections(metricTracker2, collectionRequestCallback);
    }

    public final Registration fetchLoggedInUserAttributes() {
        UserIdentity userIdentity2 = this.userIdentity;
        if (!userIdentity2.identityExists()) {
            userIdentity2 = null;
        }
        if (userIdentity2 == null) {
            return null;
        }
        Registration registration = new Registration();
        String userId = userIdentity2.getUserId();
        if (!(userId == null || userId.length() == 0)) {
            registration.withUserId(userIdentity2.getUserId());
        }
        String email = userIdentity2.getEmail();
        if (!(email == null || email.length() == 0)) {
            registration.withEmail(userIdentity2.getEmail());
        }
        String anonymousId = userIdentity2.getAnonymousId();
        if (!(anonymousId == null || anonymousId.length() == 0)) {
            registration.withUserId(userIdentity2.getAnonymousId());
        }
        return registration;
    }

    public final int getUnreadConversationCount() {
        this.metricTracker.unreadConversationCountAPICall();
        return ((Set) this.dataLayer.getUnreadConversationIds().getValue()).size();
    }

    @C6521e
    public final void handlePushMessage() {
        this.metricTracker.handlePushMessageAPICall();
        handlePushMessage((TaskStackBuilder) null);
    }

    public final void hideIntercom() {
        this.metricTracker.hideIntercomAPICall();
        this.activityFinisher.finishActivities();
    }

    public final boolean isUserLoggedIn() {
        return this.userIdentity.identityExists();
    }

    public final void logEvent(String str) {
        C6496s.h(str, "name");
        this.metricTracker.logEventAPICall();
        logEventWithValidation(str, O.i());
    }

    public final void loginIdentifiedUser(Registration registration, IntercomStatusCallback intercomStatusCallback) {
        Map<String, Object> map;
        C6496s.h(registration, "userRegistration");
        C6496s.h(intercomStatusCallback, "intercomStatusCallback");
        this.metricTracker.loginIdentifiedUserAPICall();
        String userId = registration.getUserId();
        C6496s.g(userId, "getUserId(...)");
        if (userId.length() == 0) {
            String email = registration.getEmail();
            C6496s.g(email, "getEmail(...)");
            if (email.length() == 0) {
                this.twig.e("Failed to register user. You need to provide a user identifier, an email address, or both. ", new Object[0]);
                intercomStatusCallback.onFailure(new IntercomError(ErrorCodes.IO_EXCEPTION, "Failed to register user. You need to provide unique user identifier, an email address, or both."));
                return;
            }
        }
        if (!this.userIdentity.identityExists()) {
            if (!this.userIdentity.isSoftReset() || !this.userIdentity.softIdentityIsSameUser(registration)) {
                registerNewIdentifiedUser(registration, intercomStatusCallback);
                return;
            }
            softRegister();
            intercomStatusCallback.onSuccess();
        } else if (!C6496s.c(registration.getEmail(), this.userIdentity.getEmail()) || !C6496s.c(registration.getUserId(), this.userIdentity.getUserId())) {
            this.twig.i("The user is already registered with a different email or user id", new Object[0]);
            registerNewIdentifiedUser(registration, intercomStatusCallback);
        } else if (this.userIdentity.registrationHasAttributes(registration)) {
            this.twig.i("We already have a registered user. Updating this user with the attributes provided.", new Object[0]);
            UserAttributes attributes = registration.getAttributes();
            if (attributes == null || (map = attributes.toMap()) == null) {
                map = O.i();
            }
            performUpdate(map, intercomStatusCallback);
        } else {
            this.twig.i("The user is already registered with the same email and user id, skipping API call", new Object[0]);
            intercomStatusCallback.onSuccess();
        }
    }

    public final void loginUnidentifiedUser(IntercomStatusCallback intercomStatusCallback) {
        C6496s.h(intercomStatusCallback, "intercomStatusCallback");
        this.metricTracker.loginUnidentifiedUserAPICall();
        if (this.userIdentity.isUnidentified()) {
            this.twig.i("The unidentified user is already registered", new Object[0]);
            intercomStatusCallback.onSuccess();
        } else if (this.userIdentity.isIdentified()) {
            this.twig.e("The identified user is already registered", new Object[0]);
            intercomStatusCallback.onFailure(new IntercomError(3002, "Failed to register user. We already have a registered user. If you are attempting to register a new user, call logout() before this. If you are attempting to register an identified user call: registerIdentifiedUser(Registration)"));
        } else {
            this.resetManager.hardReset();
            this.userIdentity.registerUnidentifiedUser();
            this.nexusClient.disconnect();
            this.userUpdater.get().updateUser(UserUpdateRequest.create(!((HostAppState) this.dataLayer.getHostAppState().getValue()).getSessionStartedSinceLastBackgrounded(), ((HostAppState) this.dataLayer.getHostAppState().getValue()).isBackgrounded(), true), intercomStatusCallback);
        }
    }

    public final void logout() {
        this.metricTracker.logoutAPICall();
        if (!this.userIdentity.isSoftReset()) {
            this.resetManager.softReset();
        }
        SentrySessionManager.INSTANCE.closeSentry();
    }

    public final void present() {
        present$default(this, (IntercomSpace) null, 1, (Object) null);
    }

    public final void presentContent(IntercomContent intercomContent) {
        C6496s.h(intercomContent, "content");
        if (!Injector.isNotInitialised() && !noUserRegistered()) {
            Injector.get().getMetricTracker().presentContentAPICall(intercomContent);
        }
        if (intercomContent instanceof IntercomContent.Article) {
            Application application = this.context;
            application.startActivity(ArticleActivity.Companion.buildIntent(application, new ArticleActivity.ArticleActivityArguments(((IntercomContent.Article) intercomContent).getId(), MetricTracker.Place.API, false, false, 12, (DefaultConstructorMarker) null)));
        } else if (intercomContent instanceof IntercomContent.Carousel) {
            Application application2 = this.context;
            application2.startActivity(IntercomCarouselActivity.buildIntent(application2, ((IntercomContent.Carousel) intercomContent).getId()));
        } else if (intercomContent instanceof IntercomContent.Survey) {
            Application application3 = this.context;
            application3.startActivity(IntercomSurveyActivity.Companion.buildIntent(application3, ((IntercomContent.Survey) intercomContent).getId()));
        } else if (intercomContent instanceof IntercomContent.HelpCenterCollections) {
            HelpCenterUrlUtilsKt.openCollections(this.context, ((IntercomContent.HelpCenterCollections) intercomContent).getIds(), MetricTracker.Place.API);
        } else if (intercomContent instanceof IntercomContent.Conversation) {
            ConversationScreenOpenerKt.openComposer$default(this.context, "", true, (ArticleMetadata) null, ((IntercomContent.Conversation) intercomContent).getId(), 8, (Object) null);
        } else if (intercomContent instanceof IntercomContent.Ticket) {
            IntercomRootActivityLauncher.INSTANCE.startTicketDetails(this.context, ((IntercomContent.Ticket) intercomContent).getId(), MetricTracker.Context.FROM_PROGRAMMATIC);
        } else {
            throw new C6535s();
        }
    }

    public final void pushBackstackActivity(Class<? extends Activity> cls) {
        C6496s.h(cls, "activityClass");
        this.metricTracker.pushBackstackItemAPICall();
        BackstackManager.INSTANCE.setBackstackItem(cls);
    }

    @C6521e
    public final void registerIdentifiedUser(Registration registration) {
        if (registration == null) {
            this.metricTracker.registerIdentifiedUserAPICall();
            this.twig.e("The registration object passed is null. An example successful call is registerIdentifiedUser(Registration.create().withEmail(email));", new Object[0]);
            return;
        }
        loginIdentifiedUser(registration, IntercomStatusCallbackKt.getNoStatusCallback());
    }

    @C6521e
    public final void registerUnidentifiedUser() {
        loginUnidentifiedUser(IntercomStatusCallbackKt.getNoStatusCallback());
    }

    public final void removeUnreadConversationCountListener(UnreadConversationCountListener unreadConversationCountListener) {
        this.metricTracker.removeUnreadConversationCountListenerAPICall();
        if (unreadConversationCountListener != null) {
            this.unreadCountTracker.removeListener(unreadConversationCountListener);
        }
    }

    @C6521e
    public final void reset() {
        this.metricTracker.resetAPICall();
        logout();
    }

    public final void searchHelpCenter(String str, SearchRequestCallback searchRequestCallback) {
        this.metricTracker.searchHelpCenterAPICall();
        HelpCenterApiWrapper helpCenterApiWrapper = HelpCenterApiWrapper.INSTANCE;
        MetricTracker metricTracker2 = this.metricTracker;
        C6496s.e(str);
        C6496s.e(searchRequestCallback);
        helpCenterApiWrapper.fetchHelpCenterResultsForSearchTerm(metricTracker2, str, searchRequestCallback);
    }

    public final void setAuthTokens(List<AuthToken> list, IntercomStatusCallback intercomStatusCallback) {
        C6496s.h(list, "authTokens");
        C6496s.h(intercomStatusCallback, "intercomStatusCallback");
        this.metricTracker.authTokensAPICall();
        ArrayList arrayList = new ArrayList();
        for (Object next : list) {
            AuthToken authToken = (AuthToken) next;
            if (authToken.getName().length() > 0 && authToken.getToken().length() > 0) {
                arrayList.add(next);
            }
        }
        if (arrayList.isEmpty()) {
            this.twig.e("All auth tokens in the map have empty keys or values.", new Object[0]);
            intercomStatusCallback.onFailure(new IntercomError(3003, "ERROR - Failed to set Auth Tokens. All keys or values passed were empty."));
            return;
        }
        this.apiProvider.get().setAuthTokens(arrayList, intercomStatusCallback);
    }

    public final void setBottomPadding(int i10) {
        this.metricTracker.setBottomPaddingAPICall();
        this.dataLayer.updateBottomPadding(i10);
    }

    public final void setInAppMessageVisibility(Visibility visibility) {
        this.metricTracker.setInAppMessageVisibilityAPICall();
        if (visibility != null) {
            this.dataLayer.updateInAppNotificationsVisibility(visibility);
        } else {
            this.twig.i("The visibility provided is null, visibility won't be updated", new Object[0]);
        }
    }

    public final void setLauncherVisibility(Visibility visibility) {
        this.metricTracker.setLauncherVisibilityAPICall();
        if (visibility != null) {
            this.dataLayer.updateLauncherVisibility(visibility);
        } else {
            this.twig.i("The visibility provided is null, visibility won't be updated", new Object[0]);
        }
    }

    public final void setUserHash(String str) {
        C6496s.h(str, "userHash");
        this.metricTracker.setUserHashAPICall();
        if (str.length() == 0) {
            this.twig.w("The user hash you sent us to verify was empty, we will not be able to authenticate your requests without a valid user hash.", new Object[0]);
        } else if (C6496s.c(this.userIdentity.getHmac(), str)) {
            this.twig.i("The user hash set matches the existing user identity hash value", new Object[0]);
        } else {
            if (this.userIdentity.softUserIdentityHmacDiffers(str)) {
                this.resetManager.hardReset();
            }
            this.userIdentity.setUserHash(str);
        }
    }

    public final void setUserJwt(String str) {
        C6496s.h(str, MetricTracker.Object.JWT);
        this.metricTracker.setUserJwtAPICall();
        if (str.length() == 0) {
            this.twig.w("The JWT you sent us to verify was empty, we will not be able to authenticate your requests without a valid JWT.", new Object[0]);
        } else if (C6496s.c(this.userIdentity.getJwt(), str)) {
            this.twig.i("The JWT set matches the existing user identity JWT value", new Object[0]);
        } else {
            if (this.userIdentity.softUserIdentityJwtDiffers(str)) {
                this.resetManager.hardReset();
            }
            this.userIdentity.setJwt(str);
        }
    }

    @C6521e
    public final void updateUser(UserAttributes userAttributes) {
        this.metricTracker.updateUserAPICall();
        if (userAttributes == null) {
            LumberMill.getLogger().e("updateUser method failed: the UserAttributes object provided is null", new Object[0]);
        } else {
            updateUser(userAttributes, IntercomStatusCallbackKt.getNoStatusCallback());
        }
    }

    public final void present(IntercomSpace intercomSpace) {
        C6496s.h(intercomSpace, "space");
        if (noUserRegistered()) {
            TWIG.e("Intercom was presented but there was no user registered on this device.Please call registerUnidentifiedUser() or registerIdentifiedUser(Registration).", new Object[0]);
            return;
        }
        Injector.get().getMetricTracker().presentAPICall(intercomSpace);
        int i10 = WhenMappings.$EnumSwitchMapping$1[intercomSpace.ordinal()];
        if (i10 == 1) {
            HelpCenterUrlUtilsKt.openCollections(this.context, C6565s.n(), MetricTracker.Place.API);
        } else if (i10 == 2) {
            IntercomRootActivityLauncher.INSTANCE.startHome(this.context);
        } else if (i10 == 3) {
            IntercomRootActivityLauncher.INSTANCE.startMessages(this.context);
        } else if (i10 == 4) {
            IntercomRootActivityLauncher.INSTANCE.startTickets(this.context);
        } else {
            throw new C6535s();
        }
    }

    public final void displayMessageComposer(String str) {
        if (!(str == null || str.length() == 0)) {
            this.metricTracker.displayMessageComposerInitialMessageAPICall();
        }
        if (noUserRegistered()) {
            logErrorAndOpenInbox("The messenger was opened but there was no user registered on this device. Please call registerUnidentifiedUser() or registerIdentifiedUser(Registration).");
        } else if (!this.appConfigProvider.get().isReceivedFromServer()) {
            logErrorAndOpenInbox("It appears your app has not received a successful response from Intercom. Please check if you are using the correct Android app ID and API Key from the Intercom settings.");
        } else if (!this.appConfigProvider.get().isInboundMessages()) {
            logErrorAndOpenInbox("It appears your app is not on a plan that allows message composing. As a fallback we are calling present(IntercomSpace.Messages)");
        } else {
            this.metricTracker.openedMessengerNewConversation(LauncherOpenBehaviour.LauncherType.CUSTOM);
            Application application = this.context;
            if (str == null) {
                str = "";
            }
            ConversationScreenOpenerKt.openComposer$default(application, str, true, (ArticleMetadata) null, (String) null, 24, (Object) null);
        }
    }

    @C6521e
    public final void handlePushMessage(TaskStackBuilder taskStackBuilder) {
        if (taskStackBuilder != null) {
            this.metricTracker.handlePushMessageCustomStackAPICall();
        }
        SharedPreferences sharedPreferences = this.context.getSharedPreferences(PreferenceKeys.INTERCOM_PUSH_PREFS, 0);
        String string = sharedPreferences.getString(IntercomPushManager.INTERCOM_PUSH_PATH, "");
        if (string == null || p.d0(string)) {
            this.twig.internal("No Uri found");
            return;
        }
        openIntercomChatPush(string, taskStackBuilder);
        sharedPreferences.edit().clear().apply();
    }

    public final void logEvent(String str, Map<String, ?> map) {
        this.metricTracker.logEventMetadataAPICall();
        if (map == null) {
            this.twig.i("The metadata provided is null, logging event with no metadata", new Object[0]);
        } else if (map.isEmpty()) {
            this.twig.i("The metadata provided is empty, logging event with no metadata", new Object[0]);
        }
        Map y10 = map != null ? O.y(map) : null;
        if (y10 == null) {
            y10 = O.i();
        }
        logEventWithValidation(str, y10);
    }

    public final void updateUser(UserAttributes userAttributes, IntercomStatusCallback intercomStatusCallback) {
        C6496s.h(userAttributes, "userAttributes");
        C6496s.h(intercomStatusCallback, "intercomStatusCallback");
        this.metricTracker.updateUserCallbackAPICall();
        Map<String, Object> map = userAttributes.toMap();
        C6496s.g(map, "toMap(...)");
        performUpdate(map, intercomStatusCallback);
    }
}
