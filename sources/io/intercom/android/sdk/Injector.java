package io.intercom.android.sdk;

import Ug.C5600w0;
import Ug.K;
import Ug.L;
import Ug.U0;
import android.annotation.SuppressLint;
import android.app.Application;
import android.app.NotificationManager;
import com.google.gson.e;
import com.intercom.twig.Twig;
import io.intercom.android.nexus.NexusClient;
import io.intercom.android.sdk.api.Api;
import io.intercom.android.sdk.api.ApiFactory;
import io.intercom.android.sdk.api.DeDuper;
import io.intercom.android.sdk.api.ExternalUploadApi;
import io.intercom.android.sdk.api.MessengerApi;
import io.intercom.android.sdk.api.SurveyApi;
import io.intercom.android.sdk.api.TaggingSocketFactory;
import io.intercom.android.sdk.api.UserUpdater;
import io.intercom.android.sdk.errorreporting.ErrorReporter;
import io.intercom.android.sdk.exceptions.IntercomIntegrationException;
import io.intercom.android.sdk.helpcenter.api.HelpCenterApi;
import io.intercom.android.sdk.identity.AppConfig;
import io.intercom.android.sdk.identity.AppIdentity;
import io.intercom.android.sdk.identity.UserIdentity;
import io.intercom.android.sdk.logger.LumberMill;
import io.intercom.android.sdk.m5.data.IntercomDataLayer;
import io.intercom.android.sdk.metrics.MetricTracker;
import io.intercom.android.sdk.metrics.MetricsStore;
import io.intercom.android.sdk.metrics.UnreadConversationsTracker;
import io.intercom.android.sdk.metrics.ops.OpsMetricTracker;
import io.intercom.android.sdk.overlay.OverlayPresenter;
import io.intercom.android.sdk.push.SystemNotificationManager;
import io.intercom.android.sdk.tickets.create.data.TicketApi;
import io.intercom.android.sdk.user.UserUpdaterHelper;
import io.intercom.android.sdk.utilities.ActivityFinisher;
import io.intercom.android.sdk.utilities.FirstMessageUtilsKt;
import io.intercom.android.sdk.utilities.NexusClientUtilsKt;
import io.intercom.android.sdk.utilities.PreferenceKeys;
import io.intercom.android.sdk.utilities.SystemSettings;
import io.intercom.android.sdk.utilities.UuidStringProvider;
import io.intercom.android.sdk.utilities.commons.TimeProvider;
import java.util.concurrent.TimeUnit;
import javax.net.SocketFactory;

public class Injector {
    private static final int NEXUS_TRAFFIC_TAG = 63987;
    private static final Twig TWIG = LumberMill.getLogger();
    @SuppressLint({"StaticFieldLeak"})
    private static Injector instance;
    private final ActivityFinisher activityFinisher = new ActivityFinisher();
    private Api api;
    private final Provider<Api> apiProvider = new Provider<Api>() {
        public Api get() {
            return Injector.this.getApi();
        }
    };
    private final Provider<AppConfig> appConfigProvider = new Provider<AppConfig>() {
        public AppConfig get() {
            return (AppConfig) Injector.this.dataLayer.getConfig().getValue();
        }
    };
    private final AppIdentity appIdentity;
    private final Application application;
    private final K applicationScope;
    /* access modifiers changed from: private */
    public IntercomDataLayer dataLayer;
    private ErrorReporter errorReporter;
    private ExternalUploadApi externalUploadApi;
    private e gson;
    private HelpCenterApi helpCenterApi;
    private LifecycleTracker lifecycleTracker;
    private MessengerApi messengerApi;
    private MetricTracker metricTracker;
    private final Provider<MetricTracker> metricTrackerProvider = new Provider<MetricTracker>() {
        public MetricTracker get() {
            return Injector.this.getMetricTracker();
        }
    };
    private MetricsStore metricsStore;
    private NexusWrapper nexusClient;
    private OpsMetricTracker opsMetricTracker;
    private OverlayPresenter overlayPresenter;
    private ResetManager resetManager;
    private DeDuper superDeDuper;
    private SurveyApi surveyApi;
    private SystemNotificationManager systemNotificationManager;
    private TicketApi ticketApi;
    private UnreadConversationsTracker unreadConversationsTracker;
    private final UserIdentity userIdentity;
    private final Provider<UserIdentity> userIdentityProvider = new Provider<UserIdentity>() {
        public UserIdentity get() {
            return Injector.this.getUserIdentity();
        }
    };
    private UserUpdater userUpdater;
    private UserUpdaterHelper userUpdaterHelper;
    private final Provider<UserUpdater> userUpdaterProvider = new Provider<UserUpdater>() {
        public UserUpdater get() {
            return Injector.this.getUserUpdater();
        }
    };

    protected Injector(Application application2, AppIdentity appIdentity2, UserIdentity userIdentity2) {
        this.application = application2;
        this.appIdentity = appIdentity2;
        this.userIdentity = userIdentity2;
        this.applicationScope = L.a(U0.a((C5600w0) null));
    }

    public static synchronized Injector get() {
        Injector injector;
        synchronized (Injector.class) {
            injector = instance;
            if (injector == null) {
                throw new IntercomIntegrationException("Intercom was not initialized correctly, Intercom.initialize() needs to be called in onCreate() in your Application class.");
            }
        }
        return injector;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0028, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static synchronized void initIfCachedCredentials(android.app.Application r4) {
        /*
            java.lang.Class<io.intercom.android.sdk.Injector> r0 = io.intercom.android.sdk.Injector.class
            monitor-enter(r0)
            io.intercom.android.sdk.Injector r1 = instance     // Catch:{ all -> 0x0025 }
            if (r1 == 0) goto L_0x0009
            monitor-exit(r0)
            return
        L_0x0009:
            io.intercom.android.sdk.identity.AppIdentity r1 = io.intercom.android.sdk.identity.AppIdentity.loadFromDevice(r4)     // Catch:{ all -> 0x0025 }
            java.lang.String r2 = r1.apiKey()     // Catch:{ all -> 0x0025 }
            java.lang.String r1 = r1.appId()     // Catch:{ all -> 0x0025 }
            boolean r3 = r1.isEmpty()     // Catch:{ all -> 0x0025 }
            if (r3 != 0) goto L_0x0027
            boolean r3 = r2.isEmpty()     // Catch:{ all -> 0x0025 }
            if (r3 != 0) goto L_0x0027
            initWithAppCredentials(r4, r2, r1)     // Catch:{ all -> 0x0025 }
            goto L_0x0027
        L_0x0025:
            r4 = move-exception
            goto L_0x0029
        L_0x0027:
            monitor-exit(r0)
            return
        L_0x0029:
            monitor-exit(r0)     // Catch:{ all -> 0x0025 }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: io.intercom.android.sdk.Injector.initIfCachedCredentials(android.app.Application):void");
    }

    public static synchronized void initWithAppCredentials(Application application2, String str, String str2) {
        synchronized (Injector.class) {
            if (instance == null) {
                TWIG.internal("Injector", "Initializing");
                AppIdentity create = AppIdentity.create(str, str2);
                create.persist(application2);
                Injector injector = new Injector(application2, create, new UserIdentity(application2));
                instance = injector;
                application2.registerActivityLifecycleCallbacks(injector.getLifecycleTracker());
            }
        }
    }

    public static synchronized boolean isNotInitialised() {
        boolean z10;
        synchronized (Injector.class) {
            if (instance == null) {
                z10 = true;
            } else {
                z10 = false;
            }
        }
        return z10;
    }

    static void setSharedInstance(Injector injector) {
        instance = injector;
    }

    public ActivityFinisher getActivityFinisher() {
        return this.activityFinisher;
    }

    public synchronized Api getApi() {
        try {
            if (this.api == null) {
                this.api = ApiFactory.create(getApplication(), this.appIdentity, this.userIdentity, ApiFactory.getServerUrl(this.appIdentity, this.application), this.appConfigProvider, getOpsMetricTracker(), getDataLayer(), getUnreadConversationsTracker());
                this.messengerApi = ApiFactory.messengerApi;
            }
            this.api.updateMaxRequests();
        } catch (Throwable th2) {
            while (true) {
                throw th2;
            }
        }
        return this.api;
    }

    public Provider<Api> getApiProvider() {
        return this.apiProvider;
    }

    public Provider<AppConfig> getAppConfigProvider() {
        return this.appConfigProvider;
    }

    public AppIdentity getAppIdentity() {
        return this.appIdentity;
    }

    public Application getApplication() {
        return this.application;
    }

    public synchronized IntercomDataLayer getDataLayer() {
        try {
            if (this.dataLayer == null) {
                this.dataLayer = new IntercomDataLayer(this.application, this.applicationScope);
            }
        } catch (Throwable th2) {
            while (true) {
                throw th2;
            }
        }
        return this.dataLayer;
    }

    public synchronized DeDuper getDeDuper() {
        try {
            if (this.superDeDuper == null) {
                DeDuper deDuper = new DeDuper(this.appConfigProvider, this.application.getSharedPreferences(PreferenceKeys.INTERCOM_DEDUPER_PREFS, 0));
                this.superDeDuper = deDuper;
                deDuper.readPersistedCachedAttributes();
            }
        } catch (Throwable th2) {
            while (true) {
                throw th2;
            }
        }
        return this.superDeDuper;
    }

    public synchronized ErrorReporter getErrorReporter() {
        try {
            if (this.errorReporter == null) {
                this.errorReporter = ErrorReporter.create(this.application, getGson(), this.apiProvider);
            }
        } catch (Throwable th2) {
            while (true) {
                throw th2;
            }
        }
        return this.errorReporter;
    }

    public ExternalUploadApi getExternalUploadApi() {
        if (this.externalUploadApi == null) {
            this.externalUploadApi = ApiFactory.uploadApi;
        }
        return this.externalUploadApi;
    }

    public synchronized e getGson() {
        try {
            if (this.gson == null) {
                this.gson = new e();
            }
        } catch (Throwable th2) {
            while (true) {
                throw th2;
            }
        }
        return this.gson;
    }

    public synchronized HelpCenterApi getHelpCenterApi() {
        try {
            if (this.helpCenterApi == null) {
                this.helpCenterApi = ApiFactory.createHelpCenterApi(getApplication(), this.appIdentity, this.userIdentity, ApiFactory.getServerUrl(this.appIdentity, this.application), getGson());
            }
        } catch (Throwable th2) {
            while (true) {
                throw th2;
            }
        }
        return this.helpCenterApi;
    }

    public synchronized LifecycleTracker getLifecycleTracker() {
        try {
            if (this.lifecycleTracker == null) {
                this.lifecycleTracker = LifecycleTracker.create(getSystemNotificationManager(), getMetricsStore(), getErrorReporter(), getDeDuper(), getTimeProvider(), getResetManager(), SystemSettings.getTransitionScale(this.application), getApiProvider(), getDataLayer(), getUserUpdaterHelper());
            }
        } catch (Throwable th2) {
            while (true) {
                throw th2;
            }
        }
        return this.lifecycleTracker;
    }

    public MessengerApi getMessengerApi() {
        if (this.messengerApi == null) {
            this.messengerApi = ApiFactory.messengerApi;
        }
        return this.messengerApi;
    }

    public synchronized MetricTracker getMetricTracker() {
        try {
            if (this.metricTracker == null) {
                this.metricTracker = new MetricTracker(this.userIdentity, getMetricsStore(), getApplication());
            }
        } catch (Throwable th2) {
            while (true) {
                throw th2;
            }
        }
        return this.metricTracker;
    }

    public synchronized MetricsStore getMetricsStore() {
        try {
            if (this.metricsStore == null) {
                this.metricsStore = new MetricsStore(getApplication(), getApiProvider(), this.appConfigProvider);
            }
        } catch (Throwable th2) {
            while (true) {
                throw th2;
            }
        }
        return this.metricsStore;
    }

    public synchronized NexusClient getNexusClient() {
        try {
            if (this.nexusClient == null) {
                this.nexusClient = new NexusWrapper(LumberMill.getNexusTwig(), NexusClient.defaultOkHttpClientBuilder().U(new TaggingSocketFactory(SocketFactory.getDefault(), NEXUS_TRAFFIC_TAG)).c(), getApi(), getNexusDebouncePeriod(), getDataLayer());
            }
        } catch (Throwable th2) {
            while (true) {
                throw th2;
            }
        }
        return this.nexusClient;
    }

    /* access modifiers changed from: protected */
    public long getNexusDebouncePeriod() {
        return TimeUnit.SECONDS.toMillis(1);
    }

    public synchronized OpsMetricTracker getOpsMetricTracker() {
        try {
            if (this.opsMetricTracker == null) {
                this.opsMetricTracker = new OpsMetricTracker(getMetricsStore(), getTimeProvider(), UuidStringProvider.SYSTEM);
            }
        } catch (Throwable th2) {
            while (true) {
                throw th2;
            }
        }
        return this.opsMetricTracker;
    }

    public synchronized OverlayPresenter getOverlayPresenter() {
        try {
            if (this.overlayPresenter == null) {
                this.overlayPresenter = new OverlayPresenter(getApplication(), this.appConfigProvider, getMetricTracker(), this.userIdentity, getDataLayer(), getApiProvider());
            }
        } catch (Throwable th2) {
            while (true) {
                throw th2;
            }
        }
        return this.overlayPresenter;
    }

    public synchronized ResetManager getResetManager() {
        try {
            if (this.resetManager == null) {
                this.resetManager = new ResetManager(getApiProvider(), getUserIdentity(), getOverlayPresenter(), this.appConfigProvider, this.application, this.activityFinisher, getDataLayer(), getUnreadConversationsTracker());
            }
        } catch (Throwable th2) {
            while (true) {
                throw th2;
            }
        }
        return this.resetManager;
    }

    public synchronized SurveyApi getSurveyApi() {
        try {
            if (this.surveyApi == null) {
                this.surveyApi = ApiFactory.createSurveyApi(getApplication(), this.appIdentity, this.userIdentity, ApiFactory.getServerUrl(this.appIdentity, this.application), getGson());
            }
        } catch (Throwable th2) {
            while (true) {
                throw th2;
            }
        }
        return this.surveyApi;
    }

    public synchronized SystemNotificationManager getSystemNotificationManager() {
        try {
            if (this.systemNotificationManager == null) {
                this.systemNotificationManager = new SystemNotificationManager((NotificationManager) this.application.getSystemService("notification"));
            }
        } catch (Throwable th2) {
            while (true) {
                throw th2;
            }
        }
        return this.systemNotificationManager;
    }

    public synchronized TicketApi getTicketApi() {
        try {
            if (this.ticketApi == null) {
                this.ticketApi = ApiFactory.createTicketApi(getApplication(), this.appIdentity, this.userIdentity, ApiFactory.getServerUrl(this.appIdentity, this.application));
            }
        } catch (Throwable th2) {
            while (true) {
                throw th2;
            }
        }
        return this.ticketApi;
    }

    public TimeProvider getTimeProvider() {
        return TimeProvider.SYSTEM;
    }

    public synchronized UnreadConversationsTracker getUnreadConversationsTracker() {
        try {
            if (this.unreadConversationsTracker == null) {
                this.unreadConversationsTracker = new UnreadConversationsTracker(this.metricTrackerProvider);
            }
        } catch (Throwable th2) {
            while (true) {
                throw th2;
            }
        }
        return this.unreadConversationsTracker;
    }

    public UserIdentity getUserIdentity() {
        return this.userIdentity;
    }

    public synchronized UserUpdater getUserUpdater() {
        try {
            if (this.userUpdater == null) {
                this.userUpdater = new UserUpdater(getApiProvider(), getOpsMetricTracker(), getDataLayer());
            }
        } catch (Throwable th2) {
            while (true) {
                throw th2;
            }
        }
        return this.userUpdater;
    }

    public synchronized UserUpdaterHelper getUserUpdaterHelper() {
        try {
            if (this.userUpdaterHelper == null) {
                this.userUpdaterHelper = new UserUpdaterHelper(this.userUpdaterProvider, getDataLayer(), this.userIdentityProvider);
            }
        } catch (Throwable th2) {
            while (true) {
                throw th2;
            }
        }
        return this.userUpdaterHelper;
    }

    public Provider<UserUpdater> getUserUpdaterProvider() {
        return this.userUpdaterProvider;
    }

    public void initializeIntercomEventsListeners() {
        FirstMessageUtilsKt.handleFirstMessageToast(this.applicationScope, LumberMill.getLogger(), this.application, getDataLayer());
        NexusClientUtilsKt.handleNexusClientLifecycle(this.applicationScope, getDataLayer(), (NexusWrapper) getNexusClient());
    }
}
