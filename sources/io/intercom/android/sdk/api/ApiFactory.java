package io.intercom.android.sdk.api;

import android.content.Context;
import android.text.TextUtils;
import com.google.gson.e;
import com.google.gson.f;
import fi.a;
import io.intercom.android.sdk.Provider;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.api.RetryInterceptor;
import io.intercom.android.sdk.helpcenter.api.HelpCenterApi;
import io.intercom.android.sdk.helpcenter.utils.networking.NetworkResponseAdapterFactory;
import io.intercom.android.sdk.identity.AppConfig;
import io.intercom.android.sdk.identity.AppIdentity;
import io.intercom.android.sdk.identity.UserIdentity;
import io.intercom.android.sdk.logger.LumberMill;
import io.intercom.android.sdk.m5.data.IntercomDataLayer;
import io.intercom.android.sdk.m5.home.data.HomeCardType;
import io.intercom.android.sdk.m5.home.data.HomeCards;
import io.intercom.android.sdk.metrics.UnreadConversationsTracker;
import io.intercom.android.sdk.metrics.ops.OpsMetricTracker;
import io.intercom.android.sdk.models.Ticket;
import io.intercom.android.sdk.models.TicketAttributeType;
import io.intercom.android.sdk.tickets.create.data.TicketApi;
import io.intercom.android.sdk.utilities.UtilsKt;
import io.intercom.android.sdk.utilities.commons.TimeProvider;
import io.intercom.android.sdk.utilities.gson.RuntimeTypeAdapterFactory;
import java.io.File;
import java.util.concurrent.TimeUnit;
import javax.net.SocketFactory;
import retrofit2.G;
import rh.C6703A;
import rh.C6706c;

public class ApiFactory {
    private static final String CACHE_NAME = "Intercom_SDK/HttpCache";
    private static final int CACHE_SIZE = 10485760;
    private static final String ENDPOINT = "/messenger/mobile/";
    private static final int INTERCOM_TRAFFIC_TAG = 46837266;
    private static final int MAX_DNS_SEGMENT_SIZE = 63;
    private static final String PARTIAL_HOSTNAME_AUS = ".mobile-messenger.au.intercom.io";
    private static final String PARTIAL_HOSTNAME_EU = ".mobile-messenger.eu.intercom.io";
    private static final String PARTIAL_HOSTNAME_US = ".mobile-messenger.intercom.com";
    private static final String PROTOCOL = "https://";
    private static G kotlinxRetrofit;
    private static G legacyRetrofit;
    public static MessengerApi messengerApi;
    private static C6703A okHttpClient;
    private static C6703A okHttpClientWithoutHeaders;
    private static G retrofitWithoutHeaders;
    public static ExternalUploadApi uploadApi;

    static String convertHostnameToUrl(String str) {
        return PROTOCOL + str + ENDPOINT;
    }

    public static Api create(Context context, AppIdentity appIdentity, UserIdentity userIdentity, String str, Provider<AppConfig> provider, OpsMetricTracker opsMetricTracker, IntercomDataLayer intercomDataLayer, UnreadConversationsTracker unreadConversationsTracker) {
        return createWithNetworkClient(context, appIdentity, userIdentity, createConfigurableHttpClient(context, appIdentity, userIdentity), str, provider, opsMetricTracker, intercomDataLayer, unreadConversationsTracker);
    }

    public static C6703A createConfigurableHttpClient(Context context, AppIdentity appIdentity, UserIdentity userIdentity) {
        if (okHttpClient == null) {
            C6703A.a aVar = new C6703A.a();
            TimeUnit timeUnit = TimeUnit.MINUTES;
            C6703A.a b10 = aVar.S(2, timeUnit).f(2, timeUnit).W(2, timeUnit).U(new TaggingSocketFactory(SocketFactory.getDefault(), INTERCOM_TRAFFIC_TAG)).a(new UserIdentityInterceptor(userIdentity)).a(new RetryInterceptor(new RetryInterceptor.Sleeper())).a(new ShutdownInterceptor(new ShutdownState(context, appIdentity, TimeProvider.SYSTEM))).b(HeaderInterceptor.create(context, appIdentity));
            File cacheDir = context.getCacheDir();
            if (cacheDir != null) {
                b10.d(new C6706c(new File(cacheDir.getAbsolutePath(), CACHE_NAME), 10485760));
            }
            okHttpClient = b10.c();
        }
        if (okHttpClientWithoutHeaders == null) {
            okHttpClientWithoutHeaders = new C6703A.a().c();
        }
        return okHttpClient;
    }

    public static HelpCenterApi createHelpCenterApi(Context context, AppIdentity appIdentity, UserIdentity userIdentity, String str, e eVar) {
        createRetrofit(str, createConfigurableHttpClient(context, appIdentity, userIdentity), eVar);
        return (HelpCenterApi) kotlinxRetrofit.b(HelpCenterApi.class);
    }

    private static MessengerApi createMessengerApi(C6703A a10, String str) {
        Class cls = HomeCards.HomeNewConversationData.class;
        Class cls2 = HomeCards.HomeRecentConversationData.class;
        Class cls3 = HomeCards.HomeHelpCenterData.class;
        Class cls4 = HomeCards.HomeExternalLinkData.class;
        Class cls5 = HomeCards.HomeMessengerAppData.class;
        Class cls6 = HomeCards.HomeRecentTicketsData.class;
        Class cls7 = HomeCards.HomeTicketLinksData.class;
        createRetrofit(str, a10, new f().c(RuntimeTypeAdapterFactory.of(HomeCards.class, "type").registerSubtype(HomeCards.HomeSpacesData.class, HomeCardType.SPACES.name().toLowerCase()).registerSubtype(cls, HomeCardType.NEW_CONVERSATION.name().toLowerCase()).registerSubtype(cls2, HomeCardType.RECENT_CONVERSATION.name().toLowerCase()).registerSubtype(cls3, HomeCardType.HELP_CENTER.name().toLowerCase()).registerSubtype(cls4, HomeCardType.EXTERNAL_LINKS.name().toLowerCase()).registerSubtype(cls5, HomeCardType.MESSENGER_APP.name().toLowerCase()).registerSubtype(cls6, HomeCardType.RECENT_TICKETS.name().toLowerCase()).registerSubtype(cls7, HomeCardType.TICKET_LINKS.name().toLowerCase()).registerIgnoredSubtype(HomeCards.UnSupported.class, "UnSupported")).c(getTicketTypeAdapterFactory()).b());
        return (MessengerApi) legacyRetrofit.b(MessengerApi.class);
    }

    private static void createRetrofit(String str, C6703A a10, e eVar) {
        if (legacyRetrofit == null) {
            legacyRetrofit = new G.b().c(str).a(new NetworkResponseAdapterFactory()).g(a10).b(a.f(eVar)).e();
        }
        if (kotlinxRetrofit == null) {
            kotlinxRetrofit = new G.b().c(str).a(new NetworkResponseAdapterFactory()).g(a10).b(KotlinXConvertorFactory.INSTANCE.getConvertorFactory()).e();
        }
        if (retrofitWithoutHeaders == null) {
            G.b b10 = new G.b().c(str).a(new NetworkResponseAdapterFactory()).b(a.f(eVar));
            C6703A a11 = okHttpClientWithoutHeaders;
            if (a11 != null) {
                b10.g(a11);
            }
            retrofitWithoutHeaders = b10.e();
        }
    }

    public static SurveyApi createSurveyApi(Context context, AppIdentity appIdentity, UserIdentity userIdentity, String str, e eVar) {
        createRetrofit(str, createConfigurableHttpClient(context, appIdentity, userIdentity), eVar);
        return (SurveyApi) legacyRetrofit.b(SurveyApi.class);
    }

    public static TicketApi createTicketApi(Context context, AppIdentity appIdentity, UserIdentity userIdentity, String str) {
        createRetrofit(str, createConfigurableHttpClient(context, appIdentity, userIdentity), new f().c(getTicketTypeAdapterFactory()).b());
        return (TicketApi) legacyRetrofit.b(TicketApi.class);
    }

    static String createUniqueIdentifier(String str) {
        String str2 = removeInvalidCharacters(str) + "-android";
        int length = str2.length();
        int i10 = MAX_DNS_SEGMENT_SIZE;
        if (length <= MAX_DNS_SEGMENT_SIZE) {
            return str2;
        }
        if (str2.charAt(62) == '-') {
            i10 = 62;
        }
        return str2.substring(0, i10);
    }

    public static Api createWithNetworkClient(Context context, AppIdentity appIdentity, UserIdentity userIdentity, C6703A a10, String str, Provider<AppConfig> provider, OpsMetricTracker opsMetricTracker, IntercomDataLayer intercomDataLayer, UnreadConversationsTracker unreadConversationsTracker) {
        if (messengerApi == null) {
            messengerApi = createMessengerApi(a10, str);
        }
        if (uploadApi == null) {
            uploadApi = (ExternalUploadApi) retrofitWithoutHeaders.b(ExternalUploadApi.class);
        }
        UserIdentity userIdentity2 = userIdentity;
        IntercomDataLayer intercomDataLayer2 = intercomDataLayer;
        return new Api(context, appIdentity, userIdentity, a10, messengerApi, new CallbackHolder(intercomDataLayer2, userIdentity, unreadConversationsTracker), new RateLimiter(provider.get()), provider, opsMetricTracker, intercomDataLayer2);
    }

    private static String getCorrectServerHostname(int i10, Context context) {
        if (i10 == UtilsKt.getRegionCode(context, R.integer.intercom_server_region_aus)) {
            return PARTIAL_HOSTNAME_AUS;
        }
        if (i10 == UtilsKt.getRegionCode(context, R.integer.intercom_server_region_eu)) {
            return PARTIAL_HOSTNAME_EU;
        }
        if (i10 == UtilsKt.getRegionCode(context, R.integer.intercom_server_region_us) || i10 == 0) {
            LumberMill.getLogger().i("Defaulting to US region, since no explicit region was mentioned. For more info on regions, please visit Intercom Android SDK documentation", new Object[0]);
            return PARTIAL_HOSTNAME_US;
        }
        LumberMill.getLogger().e("Incorrect value for region is provided in AndroidManifest.xml file. Please use one of the available regions values from provided list. For more info on regions, please visit Intercom Android SDK documentation", new Object[0]);
        return "";
    }

    static String getFullHostname(String str, Context context) {
        return createUniqueIdentifier(str) + getCorrectServerHostname(UtilsKt.getServerRegionFromManifest(context), context);
    }

    public static String getServerUrl(AppIdentity appIdentity, Context context) {
        String str;
        String readHostFromManifest = UtilsKt.readHostFromManifest(context);
        if (TextUtils.isEmpty(readHostFromManifest)) {
            str = getFullHostname(appIdentity.appId(), context);
        } else {
            str = createUniqueIdentifier(appIdentity.appId()) + readHostFromManifest;
        }
        return convertHostnameToUrl(str);
    }

    private static RuntimeTypeAdapterFactory<Ticket.TicketAttribute> getTicketTypeAdapterFactory() {
        Class cls = Ticket.TicketAttribute.PrimitiveAttribute.class;
        return RuntimeTypeAdapterFactory.of(Ticket.TicketAttribute.class, "type").registerSubtype(cls, TicketAttributeType.STRING.name().toLowerCase()).registerSubtype(cls, TicketAttributeType.INTEGER.name().toLowerCase()).registerSubtype(cls, TicketAttributeType.FLOAT.name().toLowerCase()).registerSubtype(cls, TicketAttributeType.BOOLEAN.name().toLowerCase()).registerSubtype(Ticket.TicketAttribute.ListAttribute.class, TicketAttributeType.LIST.name().toLowerCase()).registerSubtype(Ticket.TicketAttribute.DateTimeAttribute.class, TicketAttributeType.DATETIME.name().toLowerCase()).registerSubtype(Ticket.TicketAttribute.FilesAttribute.class, TicketAttributeType.FILES.name().toLowerCase()).registerIgnoredSubtype(Ticket.TicketAttribute.UnSupported.class, "UnSupported");
    }

    public static String removeInvalidCharacters(String str) {
        return str.replaceAll("[^A-Za-z0-9\\-$]", "");
    }
}
