package io.intercom.android.sdk.identity;

import android.content.SharedPreferences;
import com.google.gson.e;
import io.intercom.android.nexus.NexusConfig;
import io.intercom.android.sdk.models.AttachmentSettings;
import io.intercom.android.sdk.models.Config;
import io.intercom.android.sdk.models.ConfigModules;
import io.intercom.android.sdk.models.ConversationStateSyncSettings;
import io.intercom.android.sdk.utilities.ColorUtils;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import mf.Y;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b$\u001a\u001d\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\b\b\u0001\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a!\u0010\b\u001a\u00020\u00012\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0002\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\b\u0010\t\u001a%\u0010\u0004\u001a\u00020\u0003*\u00020\n2\b\b\u0001\u0010\u0002\u001a\u00020\u00012\u0006\u0010\f\u001a\u00020\u000bH\u0000¢\u0006\u0004\b\u0004\u0010\r\u001a\u001b\u0010\u0010\u001a\u00020\u000f*\u00020\n2\u0006\u0010\u000e\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\u0010\u0010\u0011\"\u0014\u0010\u0012\u001a\u00020\u00068\u0002XT¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\"\u0014\u0010\u0014\u001a\u00020\u00068\u0002XT¢\u0006\u0006\n\u0004\b\u0014\u0010\u0013\"\u0014\u0010\u0015\u001a\u00020\u00068\u0002XT¢\u0006\u0006\n\u0004\b\u0015\u0010\u0013\"\u0014\u0010\u0016\u001a\u00020\u00068\u0002XT¢\u0006\u0006\n\u0004\b\u0016\u0010\u0013\"\u0014\u0010\u0017\u001a\u00020\u00068\u0002XT¢\u0006\u0006\n\u0004\b\u0017\u0010\u0013\"\u0014\u0010\u0018\u001a\u00020\u00068\u0002XT¢\u0006\u0006\n\u0004\b\u0018\u0010\u0013\"\u0014\u0010\u0019\u001a\u00020\u00068\u0002XT¢\u0006\u0006\n\u0004\b\u0019\u0010\u0013\"\u0014\u0010\u001a\u001a\u00020\u00068\u0002XT¢\u0006\u0006\n\u0004\b\u001a\u0010\u0013\"\u0014\u0010\u001b\u001a\u00020\u00068\u0002XT¢\u0006\u0006\n\u0004\b\u001b\u0010\u0013\"\u0014\u0010\u001c\u001a\u00020\u00068\u0002XT¢\u0006\u0006\n\u0004\b\u001c\u0010\u0013\"\u0014\u0010\u001d\u001a\u00020\u00068\u0002XT¢\u0006\u0006\n\u0004\b\u001d\u0010\u0013\"\u0014\u0010\u001e\u001a\u00020\u00068\u0002XT¢\u0006\u0006\n\u0004\b\u001e\u0010\u0013\"\u0014\u0010\u001f\u001a\u00020\u00068\u0002XT¢\u0006\u0006\n\u0004\b\u001f\u0010\u0013\"\u0014\u0010 \u001a\u00020\u00068\u0002XT¢\u0006\u0006\n\u0004\b \u0010\u0013\"\u0014\u0010!\u001a\u00020\u00068\u0002XT¢\u0006\u0006\n\u0004\b!\u0010\u0013\"\u0014\u0010\"\u001a\u00020\u00068\u0002XT¢\u0006\u0006\n\u0004\b\"\u0010\u0013\"\u0014\u0010#\u001a\u00020\u00068\u0002XT¢\u0006\u0006\n\u0004\b#\u0010\u0013\"\u0014\u0010$\u001a\u00020\u00068\u0002XT¢\u0006\u0006\n\u0004\b$\u0010\u0013\"\u0014\u0010%\u001a\u00020\u00068\u0002XT¢\u0006\u0006\n\u0004\b%\u0010\u0013\"\u0014\u0010&\u001a\u00020\u00068\u0002XT¢\u0006\u0006\n\u0004\b&\u0010\u0013\"\u0014\u0010'\u001a\u00020\u00068\u0002XT¢\u0006\u0006\n\u0004\b'\u0010\u0013\"\u0014\u0010(\u001a\u00020\u00068\u0002XT¢\u0006\u0006\n\u0004\b(\u0010\u0013\"\u0014\u0010)\u001a\u00020\u00068\u0002XT¢\u0006\u0006\n\u0004\b)\u0010\u0013\"\u0014\u0010*\u001a\u00020\u00068\u0002XT¢\u0006\u0006\n\u0004\b*\u0010\u0013\"\u0014\u0010+\u001a\u00020\u00068\u0002XT¢\u0006\u0006\n\u0004\b+\u0010\u0013\"\u0014\u0010,\u001a\u00020\u00068\u0002XT¢\u0006\u0006\n\u0004\b,\u0010\u0013\"\u0014\u0010-\u001a\u00020\u00068\u0002XT¢\u0006\u0006\n\u0004\b-\u0010\u0013\"\u0014\u0010.\u001a\u00020\u00068\u0002XT¢\u0006\u0006\n\u0004\b.\u0010\u0013\"\u0014\u0010/\u001a\u00020\u00068\u0002XT¢\u0006\u0006\n\u0004\b/\u0010\u0013\"\u0014\u00100\u001a\u00020\u00068\u0002XT¢\u0006\u0006\n\u0004\b0\u0010\u0013\"\u0014\u00101\u001a\u00020\u00068\u0002XT¢\u0006\u0006\n\u0004\b1\u0010\u0013\"\u0014\u00102\u001a\u00020\u00068\u0002XT¢\u0006\u0006\n\u0004\b2\u0010\u0013¨\u00063"}, d2 = {"Lio/intercom/android/sdk/models/Config;", "", "defaultColor", "Lio/intercom/android/sdk/identity/AppConfig;", "getAppConfig", "(Lio/intercom/android/sdk/models/Config;I)Lio/intercom/android/sdk/identity/AppConfig;", "", "color", "getConfigColor", "(Ljava/lang/String;I)I", "Landroid/content/SharedPreferences;", "Lio/intercom/android/nexus/NexusConfig;", "realTimeConfig", "(Landroid/content/SharedPreferences;ILio/intercom/android/nexus/NexusConfig;)Lio/intercom/android/sdk/identity/AppConfig;", "newAppConfig", "Llf/M;", "setAppConfig", "(Landroid/content/SharedPreferences;Lio/intercom/android/sdk/identity/AppConfig;)V", "APP_NAME", "Ljava/lang/String;", "APP_INBOUND_MESSAGES", "APP_PRIMARY_COLOR", "APP_SECONDARY_COLOR", "APP_PRIMARY_COLOR_RENDER_DARK_TEXT", "APP_SECONDARY_COLOR_RENDER_DARK_TEXT", "APP_USER_UPDATE_CACHE_MAX_AGE_MS", "APP_RATE_LIMIT_PERIOD_MS", "APP_SOFT_RESET_TIMEOUT_MS", "APP_NEW_SESSION_THRESHOLD_MS", "APP_RATE_LIMIT_COUNT", "APP_AUDIO_ENABLED", "APP_METRICS_ENABLED", "APP_LOCALE", "APP_HELP_CENTER_LOCALE", "APP_RECEIVED_FROM_SERVER", "APP_BACKGROUND_REQUESTS_ENABLED", "APP_HELP_CENTER_URL", "APP_HELP_CENTER_URLS", "APP_FEATURES", "APP_LAUNCHER_LOGO_URL", "APP_TEAM_GREETING", "APP_IDENTITY_VERIFICATION_ENABLED", "APP_ACCESS_TEAMMATE_ENABLED", "APP_HELP_CENTER_REQUIRE_SEARCH", "APP_PREVENT_MULTIPLE_INBOUND_CONVERSATIONS_ENABLED", "APP_HAS_OPEN_CONVERSATIONS", "APP_HUB_HEADER_CONFIG", "NEW_PUSH_UI_DISABLED", "APP_ATTACHMENT_SETTINGS", "APP_ARTICLE_AUTO_REACTION_ENABLED", "FIN_DICTATION_UI_ENABLED", "intercom-sdk-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class AppConfigKt {
    private static final String APP_ACCESS_TEAMMATE_ENABLED = "access_to_teammate_enabled";
    private static final String APP_ARTICLE_AUTO_REACTION_ENABLED = "article_auto_reaction_enabled";
    private static final String APP_ATTACHMENT_SETTINGS = "app_attachment_settings";
    private static final String APP_AUDIO_ENABLED = "app_audio_enabled";
    private static final String APP_BACKGROUND_REQUESTS_ENABLED = "app_background_requests_enabled";
    private static final String APP_FEATURES = "features";
    private static final String APP_HAS_OPEN_CONVERSATIONS = "has_open_conversations";
    private static final String APP_HELP_CENTER_LOCALE = "help_center_locale";
    private static final String APP_HELP_CENTER_REQUIRE_SEARCH = "help_center_require_search";
    private static final String APP_HELP_CENTER_URL = "help_center_url";
    private static final String APP_HELP_CENTER_URLS = "help_center_urls";
    private static final String APP_HUB_HEADER_CONFIG = "hub_config";
    private static final String APP_IDENTITY_VERIFICATION_ENABLED = "app_identity_verification_enabled";
    private static final String APP_INBOUND_MESSAGES = "app_inbound_messages";
    private static final String APP_LAUNCHER_LOGO_URL = "app_launcher_logo_url";
    private static final String APP_LOCALE = "app_locale";
    private static final String APP_METRICS_ENABLED = "app_metrics_enabled";
    private static final String APP_NAME = "app_name";
    private static final String APP_NEW_SESSION_THRESHOLD_MS = "new_session_threshold_ms";
    private static final String APP_PREVENT_MULTIPLE_INBOUND_CONVERSATIONS_ENABLED = "prevent_multiple_inbound_conversations_enabled";
    private static final String APP_PRIMARY_COLOR = "app_primary_color";
    private static final String APP_PRIMARY_COLOR_RENDER_DARK_TEXT = "app_primary_color_render_dark_text";
    private static final String APP_RATE_LIMIT_COUNT = "app_rate_limit_count";
    private static final String APP_RATE_LIMIT_PERIOD_MS = "app_rate_limit_period_ms";
    private static final String APP_RECEIVED_FROM_SERVER = "app_received_from_server";
    private static final String APP_SECONDARY_COLOR = "app_secondary_color";
    private static final String APP_SECONDARY_COLOR_RENDER_DARK_TEXT = "app_secondary_color_render_dark_text";
    private static final String APP_SOFT_RESET_TIMEOUT_MS = "app_soft_reset_timeout_ms";
    private static final String APP_TEAM_GREETING = "app_team_greeting";
    private static final String APP_USER_UPDATE_CACHE_MAX_AGE_MS = "app_user_update_cache_max_age_ms";
    private static final String FIN_DICTATION_UI_ENABLED = "fin_dictation_ui_enabled";
    private static final String NEW_PUSH_UI_DISABLED = "new_push_ui_disabled";

    public static final AppConfig getAppConfig(Config config, int i10) {
        int i11 = i10;
        C6496s.h(config, "<this>");
        int configColor = getConfigColor(config.getPrimaryColor(), i11);
        int configColor2 = getConfigColor(config.getSecondaryColor(), i11);
        return new AppConfig(config.getName(), configColor, configColor2, ColorUtils.darkenColor(configColor2), config.isPrimaryColorRenderDarkText(), config.isSecondaryColorRenderDarkText(), config.isInboundMessages(), config.getRateLimitCount(), config.getRateLimitPeriod(), config.getUserUpdateCacheMaxAge(), config.getNewSessionThreshold(), config.getSoftResetTimeout(), config.isMetricsEnabled(), config.isAudioEnabled(), config.getLocale(), config.getHelpCenterLocale(), true, config.isBackgroundRequestsEnabled(), config.getHelpCenterUrl(), config.getHelpCenterUrls(), config.getFeatures(), config.getLauncherLogoUrl(), config.getTeamGreeting(), config.getIdentityVerificationEnabled(), config.getAccessToTeammateEnabled(), config.getHelpCenterRequireSearch(), config.getPreventMultipleInboundConversationsEnabled(), config.getHasOpenConversations(), config.getModules(), config.getRealTimeConfig(), config.isAndroidNewPushUiDisabled(), config.getAttachmentSettings(), config.isArticleAutoReactionEnabled(), config.isFinDictationUiEnabled(), config.getConversationStateSyncSettings());
    }

    private static final int getConfigColor(String str, int i10) {
        if (str == null) {
            return i10;
        }
        return ColorUtils.parseColor(str);
    }

    public static final void setAppConfig(SharedPreferences sharedPreferences, AppConfig appConfig) {
        C6496s.h(sharedPreferences, "<this>");
        C6496s.h(appConfig, "newAppConfig");
        e eVar = new e();
        sharedPreferences.edit().putString(APP_NAME, appConfig.getName()).putString(APP_LOCALE, appConfig.getLocale()).putString(APP_HELP_CENTER_LOCALE, appConfig.getHelpCenterLocale()).putString(APP_LAUNCHER_LOGO_URL, appConfig.getLauncherLogoUrl()).putString(APP_TEAM_GREETING, appConfig.getTeamGreeting()).putInt(APP_PRIMARY_COLOR, appConfig.getPrimaryColor()).putInt(APP_SECONDARY_COLOR, appConfig.getSecondaryColor()).putInt(APP_RATE_LIMIT_COUNT, appConfig.getRateLimitCount()).putLong(APP_USER_UPDATE_CACHE_MAX_AGE_MS, appConfig.getUserUpdateCacheMaxAgeMs()).putLong(APP_RATE_LIMIT_PERIOD_MS, appConfig.getRateLimitPeriodMs()).putLong(APP_NEW_SESSION_THRESHOLD_MS, appConfig.getNewSessionThresholdMs()).putLong(APP_SOFT_RESET_TIMEOUT_MS, appConfig.getSoftResetTimeoutMs()).putBoolean(APP_INBOUND_MESSAGES, appConfig.isInboundMessages()).putBoolean(APP_AUDIO_ENABLED, appConfig.isAudioEnabled()).putBoolean(APP_METRICS_ENABLED, appConfig.isMetricsEnabled()).putBoolean(APP_RECEIVED_FROM_SERVER, appConfig.isReceivedFromServer()).putBoolean(APP_BACKGROUND_REQUESTS_ENABLED, appConfig.isBackgroundRequestsEnabled()).putBoolean(APP_PRIMARY_COLOR_RENDER_DARK_TEXT, appConfig.isPrimaryColorRenderDarkText()).putBoolean(APP_SECONDARY_COLOR_RENDER_DARK_TEXT, appConfig.isSecondaryColorRenderDarkText()).putString(APP_HELP_CENTER_URL, appConfig.getHelpCenterUrl()).putStringSet(APP_HELP_CENTER_URLS, appConfig.getHelpCenterUrls()).putStringSet(APP_FEATURES, appConfig.getFeatures()).putBoolean(APP_ACCESS_TEAMMATE_ENABLED, appConfig.isAccessToTeammateEnabled()).putBoolean(APP_HELP_CENTER_REQUIRE_SEARCH, appConfig.isHelpCenterRequireSearchEnabled()).putBoolean(APP_PREVENT_MULTIPLE_INBOUND_CONVERSATIONS_ENABLED, appConfig.isPreventMultipleInboundConversationsEnabled()).putBoolean(APP_HAS_OPEN_CONVERSATIONS, appConfig.getHasOpenConversations()).putString(APP_HUB_HEADER_CONFIG, eVar.v(appConfig.getConfigModules())).putString(APP_ATTACHMENT_SETTINGS, eVar.v(appConfig.getAttachmentSettings())).putBoolean(APP_ARTICLE_AUTO_REACTION_ENABLED, appConfig.getArticleAutoReactionEnabled()).putBoolean(FIN_DICTATION_UI_ENABLED, appConfig.getFinDictationUiEnabled()).putBoolean(NEW_PUSH_UI_DISABLED, appConfig.getNewPushUiDisabled()).apply();
    }

    public static final AppConfig getAppConfig(SharedPreferences sharedPreferences, int i10, NexusConfig nexusConfig) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        SharedPreferences sharedPreferences2 = sharedPreferences;
        C6496s.h(sharedPreferences2, "<this>");
        C6496s.h(nexusConfig, "realTimeConfig");
        int i11 = sharedPreferences2.getInt(APP_PRIMARY_COLOR, i10);
        int i12 = sharedPreferences2.getInt(APP_SECONDARY_COLOR, i11);
        e eVar = new e();
        String string = sharedPreferences2.getString(APP_NAME, "");
        String str6 = string == null ? "" : string;
        int darkenColor = ColorUtils.darkenColor(i12);
        boolean z10 = sharedPreferences2.getBoolean(APP_PRIMARY_COLOR_RENDER_DARK_TEXT, false);
        boolean z11 = sharedPreferences2.getBoolean(APP_SECONDARY_COLOR_RENDER_DARK_TEXT, false);
        boolean z12 = sharedPreferences2.getBoolean(APP_INBOUND_MESSAGES, false);
        int i13 = sharedPreferences2.getInt(APP_RATE_LIMIT_COUNT, 100);
        TimeUnit timeUnit = TimeUnit.SECONDS;
        long j10 = sharedPreferences2.getLong(APP_RATE_LIMIT_PERIOD_MS, timeUnit.toMillis(60));
        long j11 = sharedPreferences2.getLong(APP_USER_UPDATE_CACHE_MAX_AGE_MS, timeUnit.toMillis(300));
        long j12 = sharedPreferences2.getLong(APP_NEW_SESSION_THRESHOLD_MS, timeUnit.toMillis(20));
        long j13 = sharedPreferences2.getLong(APP_SOFT_RESET_TIMEOUT_MS, timeUnit.toMillis(1));
        boolean z13 = sharedPreferences2.getBoolean(APP_METRICS_ENABLED, true);
        boolean z14 = sharedPreferences2.getBoolean(APP_AUDIO_ENABLED, true);
        String string2 = sharedPreferences2.getString(APP_LOCALE, "");
        if (string2 == null) {
            str = "";
        } else {
            str = string2;
        }
        String string3 = sharedPreferences2.getString(APP_HELP_CENTER_LOCALE, "");
        if (string3 == null) {
            str2 = "";
        } else {
            str2 = string3;
        }
        boolean z15 = sharedPreferences2.getBoolean(APP_RECEIVED_FROM_SERVER, false);
        boolean z16 = sharedPreferences2.getBoolean(APP_BACKGROUND_REQUESTS_ENABLED, true);
        String string4 = sharedPreferences2.getString(APP_HELP_CENTER_URL, "");
        if (string4 == null) {
            str3 = "";
        } else {
            str3 = string4;
        }
        Set<String> stringSet = sharedPreferences2.getStringSet(APP_HELP_CENTER_URLS, Y.e());
        if (stringSet == null) {
            stringSet = Y.e();
        }
        Set<String> set = stringSet;
        Set<String> stringSet2 = sharedPreferences2.getStringSet(APP_FEATURES, Y.e());
        if (stringSet2 == null) {
            stringSet2 = Y.e();
        }
        Set<String> set2 = stringSet2;
        String string5 = sharedPreferences2.getString(APP_LAUNCHER_LOGO_URL, "");
        if (string5 == null) {
            str4 = "";
        } else {
            str4 = string5;
        }
        String string6 = sharedPreferences2.getString(APP_TEAM_GREETING, "");
        if (string6 == null) {
            str5 = "";
        } else {
            str5 = string6;
        }
        boolean z17 = sharedPreferences2.getBoolean(NEW_PUSH_UI_DISABLED, false);
        Object m10 = eVar.m(sharedPreferences2.getString(APP_ATTACHMENT_SETTINGS, eVar.v(AttachmentSettings.Companion.getDEFAULT())), AttachmentSettings.class);
        C6496s.g(m10, "fromJson(...)");
        return new AppConfig(str6, i11, i12, darkenColor, z10, z11, z12, i13, j10, j11, j12, j13, z13, z14, str, str2, z15, z16, str3, set, set2, str4, str5, sharedPreferences2.getBoolean(APP_IDENTITY_VERIFICATION_ENABLED, false), sharedPreferences2.getBoolean(APP_ACCESS_TEAMMATE_ENABLED, true), sharedPreferences2.getBoolean(APP_HELP_CENTER_REQUIRE_SEARCH, false), sharedPreferences2.getBoolean(APP_PREVENT_MULTIPLE_INBOUND_CONVERSATIONS_ENABLED, false), sharedPreferences2.getBoolean(APP_HAS_OPEN_CONVERSATIONS, false), (ConfigModules) eVar.m(sharedPreferences2.getString(APP_HUB_HEADER_CONFIG, (String) null), ConfigModules.class), nexusConfig, z17, (AttachmentSettings) m10, sharedPreferences2.getBoolean(APP_ARTICLE_AUTO_REACTION_ENABLED, true), sharedPreferences2.getBoolean(FIN_DICTATION_UI_ENABLED, false), ConversationStateSyncSettings.Companion.getDEFAULT());
    }
}
