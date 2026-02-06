package io.intercom.android.sdk.models;

import Oc.c;
import io.intercom.android.nexus.NexusConfig;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b&\n\u0002\u0018\u0002\n\u0002\b+\b\b\u0018\u0000 }2\u00020\u0001:\u0001}Bí\u0002\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\r\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0013\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0015\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0013\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0013\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0013\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u001a\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00030\u001d\u0012\u000e\b\u0002\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00030\u001d\u0012\b\b\u0002\u0010\u001f\u001a\u00020\u000b\u0012\b\b\u0002\u0010 \u001a\u00020\u000b\u0012\b\b\u0002\u0010!\u001a\u00020\u000b\u0012\b\b\u0002\u0010\"\u001a\u00020\u000b\u0012\b\b\u0002\u0010#\u001a\u00020\u000b\u0012\n\b\u0002\u0010$\u001a\u0004\u0018\u00010%\u0012\b\b\u0002\u0010&\u001a\u00020'\u0012\b\b\u0002\u0010(\u001a\u00020\u000b\u0012\b\b\u0002\u0010)\u001a\u00020\u000b\u0012\b\b\u0002\u0010*\u001a\u00020\u000b\u0012\b\b\u0002\u0010+\u001a\u00020,¢\u0006\u0004\b-\u0010.J\t\u0010V\u001a\u00020\u0003HÆ\u0003J\u000b\u0010W\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010X\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010Y\u001a\u00020\u0003HÆ\u0003J\t\u0010Z\u001a\u00020\u0003HÆ\u0003J\t\u0010[\u001a\u00020\u0003HÆ\u0003J\t\u0010\\\u001a\u00020\u0003HÆ\u0003J\t\u0010]\u001a\u00020\u000bHÆ\u0003J\t\u0010^\u001a\u00020\u000bHÆ\u0003J\t\u0010_\u001a\u00020\u000bHÆ\u0003J\t\u0010`\u001a\u00020\u000bHÆ\u0003J\t\u0010a\u001a\u00020\u000bHÆ\u0003J\t\u0010b\u001a\u00020\u000bHÆ\u0003J\t\u0010c\u001a\u00020\u000bHÆ\u0003J\t\u0010d\u001a\u00020\u0013HÂ\u0003J\t\u0010e\u001a\u00020\u0015HÆ\u0003J\t\u0010f\u001a\u00020\u0013HÂ\u0003J\t\u0010g\u001a\u00020\u0013HÂ\u0003J\t\u0010h\u001a\u00020\u0013HÂ\u0003J\t\u0010i\u001a\u00020\u001aHÂ\u0003J\t\u0010j\u001a\u00020\u0003HÆ\u0003J\u000f\u0010k\u001a\b\u0012\u0004\u0012\u00020\u00030\u001dHÆ\u0003J\u000f\u0010l\u001a\b\u0012\u0004\u0012\u00020\u00030\u001dHÆ\u0003J\t\u0010m\u001a\u00020\u000bHÆ\u0003J\t\u0010n\u001a\u00020\u000bHÆ\u0003J\t\u0010o\u001a\u00020\u000bHÆ\u0003J\t\u0010p\u001a\u00020\u000bHÆ\u0003J\t\u0010q\u001a\u00020\u000bHÆ\u0003J\u000b\u0010r\u001a\u0004\u0018\u00010%HÆ\u0003J\t\u0010s\u001a\u00020'HÆ\u0003J\t\u0010t\u001a\u00020\u000bHÆ\u0003J\t\u0010u\u001a\u00020\u000bHÆ\u0003J\t\u0010v\u001a\u00020\u000bHÆ\u0003J\t\u0010w\u001a\u00020,HÆ\u0003Jï\u0002\u0010x\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\u000b2\b\b\u0002\u0010\u000f\u001a\u00020\u000b2\b\b\u0002\u0010\u0010\u001a\u00020\u000b2\b\b\u0002\u0010\u0011\u001a\u00020\u000b2\b\b\u0002\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u00152\b\b\u0002\u0010\u0016\u001a\u00020\u00132\b\b\u0002\u0010\u0017\u001a\u00020\u00132\b\b\u0002\u0010\u0018\u001a\u00020\u00132\b\b\u0002\u0010\u0019\u001a\u00020\u001a2\b\b\u0002\u0010\u001b\u001a\u00020\u00032\u000e\b\u0002\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00030\u001d2\u000e\b\u0002\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00030\u001d2\b\b\u0002\u0010\u001f\u001a\u00020\u000b2\b\b\u0002\u0010 \u001a\u00020\u000b2\b\b\u0002\u0010!\u001a\u00020\u000b2\b\b\u0002\u0010\"\u001a\u00020\u000b2\b\b\u0002\u0010#\u001a\u00020\u000b2\n\b\u0002\u0010$\u001a\u0004\u0018\u00010%2\b\b\u0002\u0010&\u001a\u00020'2\b\b\u0002\u0010(\u001a\u00020\u000b2\b\b\u0002\u0010)\u001a\u00020\u000b2\b\b\u0002\u0010*\u001a\u00020\u000b2\b\b\u0002\u0010+\u001a\u00020,HÇ\u0001J\u0013\u0010y\u001a\u00020\u000b2\b\u0010z\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010{\u001a\u00020\u0015H×\u0001J\t\u0010|\u001a\u00020\u0003H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b/\u00100R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b1\u00100R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b2\u00100R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b3\u00100R\u0016\u0010\u0007\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b4\u00100R\u0016\u0010\b\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b5\u00100R\u0016\u0010\t\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b6\u00100R\u0016\u0010\n\u001a\u00020\u000b8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u00107R\u0016\u0010\f\u001a\u00020\u000b8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u00107R\u0016\u0010\r\u001a\u00020\u000b8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u00107R\u0016\u0010\u000e\u001a\u00020\u000b8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u00107R\u0016\u0010\u000f\u001a\u00020\u000b8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u00107R\u0016\u0010\u0010\u001a\u00020\u000b8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u00107R\u0016\u0010\u0011\u001a\u00020\u000b8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u00107R\u0010\u0010\u0012\u001a\u00020\u00138\u0002X\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0014\u001a\u00020\u00158\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b8\u00109R\u0010\u0010\u0016\u001a\u00020\u00138\u0002X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0017\u001a\u00020\u00138\u0002X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0018\u001a\u00020\u00138\u0002X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0019\u001a\u00020\u001a8\u0002X\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u001b\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b:\u00100R\u001c\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00030\u001d8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b;\u0010<R\u001c\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00030\u001d8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b=\u0010<R\u0016\u0010\u001f\u001a\u00020\u000b8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b>\u00107R\u0016\u0010 \u001a\u00020\u000b8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b?\u00107R\u0016\u0010!\u001a\u00020\u000b8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b@\u00107R\u0016\u0010\"\u001a\u00020\u000b8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\bA\u00107R\u0016\u0010#\u001a\u00020\u000b8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\bB\u00107R\u0018\u0010$\u001a\u0004\u0018\u00010%8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\bC\u0010DR\u0016\u0010&\u001a\u00020'8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\bE\u0010FR\u0016\u0010(\u001a\u00020\u000b8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b(\u00107R\u0016\u0010)\u001a\u00020\u000b8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b)\u00107R\u0016\u0010*\u001a\u00020\u000b8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b*\u00107R\u0016\u0010+\u001a\u00020,8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\bG\u0010HR\u0011\u0010I\u001a\u00020\u00138F¢\u0006\u0006\u001a\u0004\bJ\u0010KR\u0011\u0010L\u001a\u00020\u00138F¢\u0006\u0006\u001a\u0004\bM\u0010KR\u0011\u0010N\u001a\u00020\u00138F¢\u0006\u0006\u001a\u0004\bO\u0010KR\u0011\u0010P\u001a\u00020\u00138F¢\u0006\u0006\u001a\u0004\bQ\u0010KR\u0011\u0010R\u001a\u00020S8F¢\u0006\u0006\u001a\u0004\bT\u0010U¨\u0006~"}, d2 = {"Lio/intercom/android/sdk/models/Config;", "", "name", "", "primaryColor", "secondaryColor", "locale", "helpCenterLocale", "launcherLogoUrl", "teamGreeting", "isFirstRequest", "", "isInboundMessages", "isAudioEnabled", "isMetricsEnabled", "isBackgroundRequestsEnabled", "isPrimaryColorRenderDarkText", "isSecondaryColorRenderDarkText", "_rateLimitPeriodSeconds", "", "rateLimitCount", "", "_userUpdateCacheMaxAgeSeconds", "_softResetTimeoutSeconds", "_newSessionThresholdSeconds", "_realTimeConfigBuilder", "Lio/intercom/android/nexus/NexusConfig$Builder;", "helpCenterUrl", "helpCenterUrls", "", "features", "identityVerificationEnabled", "accessToTeammateEnabled", "helpCenterRequireSearch", "preventMultipleInboundConversationsEnabled", "hasOpenConversations", "modules", "Lio/intercom/android/sdk/models/ConfigModules;", "attachmentSettings", "Lio/intercom/android/sdk/models/AttachmentSettings;", "isAndroidNewPushUiDisabled", "isArticleAutoReactionEnabled", "isFinDictationUiEnabled", "conversationStateSyncSettings", "Lio/intercom/android/sdk/models/ConversationStateSyncSettings;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZZZZZZJIJJJLio/intercom/android/nexus/NexusConfig$Builder;Ljava/lang/String;Ljava/util/Set;Ljava/util/Set;ZZZZZLio/intercom/android/sdk/models/ConfigModules;Lio/intercom/android/sdk/models/AttachmentSettings;ZZZLio/intercom/android/sdk/models/ConversationStateSyncSettings;)V", "getName", "()Ljava/lang/String;", "getPrimaryColor", "getSecondaryColor", "getLocale", "getHelpCenterLocale", "getLauncherLogoUrl", "getTeamGreeting", "()Z", "getRateLimitCount", "()I", "getHelpCenterUrl", "getHelpCenterUrls", "()Ljava/util/Set;", "getFeatures", "getIdentityVerificationEnabled", "getAccessToTeammateEnabled", "getHelpCenterRequireSearch", "getPreventMultipleInboundConversationsEnabled", "getHasOpenConversations", "getModules", "()Lio/intercom/android/sdk/models/ConfigModules;", "getAttachmentSettings", "()Lio/intercom/android/sdk/models/AttachmentSettings;", "getConversationStateSyncSettings", "()Lio/intercom/android/sdk/models/ConversationStateSyncSettings;", "rateLimitPeriod", "getRateLimitPeriod", "()J", "userUpdateCacheMaxAge", "getUserUpdateCacheMaxAge", "softResetTimeout", "getSoftResetTimeout", "newSessionThreshold", "getNewSessionThreshold", "realTimeConfig", "Lio/intercom/android/nexus/NexusConfig;", "getRealTimeConfig", "()Lio/intercom/android/nexus/NexusConfig;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "component29", "component30", "component31", "component32", "component33", "component34", "copy", "equals", "other", "hashCode", "toString", "Companion", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class Config {
    public static final int $stable = 8;
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    public static final long DEFAULT_CACHE_MAX_AGE_SECONDS = 300;
    public static final int DEFAULT_RATE_LIMIT_COUNT = 100;
    public static final long DEFAULT_RATE_LIMIT_PERIOD_SECONDS = 60;
    public static final long DEFAULT_SESSION_TIMEOUT_SECONDS = 20;
    public static final long DEFAULT_SOFT_RESET_TIMEOUT_SECONDS = 1;
    /* access modifiers changed from: private */
    public static final Config NULL = new Config((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, false, false, false, false, false, false, false, 0, 0, 0, 0, 0, (NexusConfig.Builder) null, (String) null, (Set) null, (Set) null, false, false, false, false, false, (ConfigModules) null, (AttachmentSettings) null, false, false, false, (ConversationStateSyncSettings) null, -1, 3, (DefaultConstructorMarker) null);
    @c("new_session_threshold")
    private final long _newSessionThresholdSeconds;
    @c("local_rate_limit_period")
    private final long _rateLimitPeriodSeconds;
    @c("real_time_config")
    private final NexusConfig.Builder _realTimeConfigBuilder;
    @c("soft_reset_timeout")
    private final long _softResetTimeoutSeconds;
    @c("user_update_dup_cache_max_age")
    private final long _userUpdateCacheMaxAgeSeconds;
    @c("access_to_teammate_enabled")
    private final boolean accessToTeammateEnabled;
    @c("attachment_settings")
    private final AttachmentSettings attachmentSettings;
    @c("conversation_state_sync_settings")
    private final ConversationStateSyncSettings conversationStateSyncSettings;
    @c("features")
    private final Set<String> features;
    @c("has_open_conversations")
    private final boolean hasOpenConversations;
    @c("help_center_locale")
    private final String helpCenterLocale;
    @c("help_center_require_search")
    private final boolean helpCenterRequireSearch;
    @c("help_center_url")
    private final String helpCenterUrl;
    @c("help_center_urls")
    private final Set<String> helpCenterUrls;
    @c("identity_verification_enabled")
    private final boolean identityVerificationEnabled;
    @c("android_new_push_ui_disabled")
    private final boolean isAndroidNewPushUiDisabled;
    @c("article_auto_reaction_enabled")
    private final boolean isArticleAutoReactionEnabled;
    @c("audio_enabled")
    private final boolean isAudioEnabled;
    @c("background_requests_enabled")
    private final boolean isBackgroundRequestsEnabled;
    @c("fin_dictation_ui_enabled")
    private final boolean isFinDictationUiEnabled;
    @c("is_first_request")
    private final boolean isFirstRequest;
    @c("inbound_messages")
    private final boolean isInboundMessages;
    @c("metrics_enabled")
    private final boolean isMetricsEnabled;
    @c("primary_color_render_dark_text")
    private final boolean isPrimaryColorRenderDarkText;
    @c("secondary_color_render_dark_text")
    private final boolean isSecondaryColorRenderDarkText;
    @c("launcher_logo_url")
    private final String launcherLogoUrl;
    private final String locale;
    @c("modules")
    private final ConfigModules modules;
    private final String name;
    @c("prevent_multiple_inbound_conversations_enabled")
    private final boolean preventMultipleInboundConversationsEnabled;
    @c("base_color")
    private final String primaryColor;
    @c("local_rate_limit")
    private final int rateLimitCount;
    @c("secondary_color")
    private final String secondaryColor;
    @c("team_greeting")
    private final String teamGreeting;

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007XT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0007XT¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0007XT¢\u0006\u0002\n\u0000R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lio/intercom/android/sdk/models/Config$Companion;", "", "<init>", "()V", "DEFAULT_RATE_LIMIT_COUNT", "", "DEFAULT_RATE_LIMIT_PERIOD_SECONDS", "", "DEFAULT_CACHE_MAX_AGE_SECONDS", "DEFAULT_SESSION_TIMEOUT_SECONDS", "DEFAULT_SOFT_RESET_TIMEOUT_SECONDS", "NULL", "Lio/intercom/android/sdk/models/Config;", "getNULL", "()Lio/intercom/android/sdk/models/Config;", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Config getNULL() {
            return Config.NULL;
        }

        private Companion() {
        }
    }

    public Config() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, false, false, false, false, false, false, false, 0, 0, 0, 0, 0, (NexusConfig.Builder) null, (String) null, (Set) null, (Set) null, false, false, false, false, false, (ConfigModules) null, (AttachmentSettings) null, false, false, false, (ConversationStateSyncSettings) null, -1, 3, (DefaultConstructorMarker) null);
    }

    private final long component15() {
        return this._rateLimitPeriodSeconds;
    }

    private final long component17() {
        return this._userUpdateCacheMaxAgeSeconds;
    }

    private final long component18() {
        return this._softResetTimeoutSeconds;
    }

    private final long component19() {
        return this._newSessionThresholdSeconds;
    }

    private final NexusConfig.Builder component20() {
        return this._realTimeConfigBuilder;
    }

    public static /* synthetic */ Config copy$default(Config config, String str, String str2, String str3, String str4, String str5, String str6, String str7, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, long j10, int i10, long j11, long j12, long j13, NexusConfig.Builder builder, String str8, Set set, Set set2, boolean z17, boolean z18, boolean z19, boolean z20, boolean z21, ConfigModules configModules, AttachmentSettings attachmentSettings2, boolean z22, boolean z23, boolean z24, ConversationStateSyncSettings conversationStateSyncSettings2, int i11, int i12, Object obj) {
        Config config2 = config;
        int i13 = i11;
        return config.copy((i13 & 1) != 0 ? config2.name : str, (i13 & 2) != 0 ? config2.primaryColor : str2, (i13 & 4) != 0 ? config2.secondaryColor : str3, (i13 & 8) != 0 ? config2.locale : str4, (i13 & 16) != 0 ? config2.helpCenterLocale : str5, (i13 & 32) != 0 ? config2.launcherLogoUrl : str6, (i13 & 64) != 0 ? config2.teamGreeting : str7, (i13 & 128) != 0 ? config2.isFirstRequest : z10, (i13 & 256) != 0 ? config2.isInboundMessages : z11, (i13 & 512) != 0 ? config2.isAudioEnabled : z12, (i13 & 1024) != 0 ? config2.isMetricsEnabled : z13, (i13 & 2048) != 0 ? config2.isBackgroundRequestsEnabled : z14, (i13 & 4096) != 0 ? config2.isPrimaryColorRenderDarkText : z15, (i13 & 8192) != 0 ? config2.isSecondaryColorRenderDarkText : z16, (i13 & 16384) != 0 ? config2._rateLimitPeriodSeconds : j10, (i13 & 32768) != 0 ? config2.rateLimitCount : i10, (65536 & i13) != 0 ? config2._userUpdateCacheMaxAgeSeconds : j11, (i13 & 131072) != 0 ? config2._softResetTimeoutSeconds : j12, (i13 & 262144) != 0 ? config2._newSessionThresholdSeconds : j13, (i13 & 524288) != 0 ? config2._realTimeConfigBuilder : builder, (1048576 & i13) != 0 ? config2.helpCenterUrl : str8, (i13 & 2097152) != 0 ? config2.helpCenterUrls : set, (i13 & 4194304) != 0 ? config2.features : set2, (i13 & 8388608) != 0 ? config2.identityVerificationEnabled : z17, (i13 & 16777216) != 0 ? config2.accessToTeammateEnabled : z18, (i13 & 33554432) != 0 ? config2.helpCenterRequireSearch : z19, (i13 & 67108864) != 0 ? config2.preventMultipleInboundConversationsEnabled : z20, (i13 & 134217728) != 0 ? config2.hasOpenConversations : z21, (i13 & 268435456) != 0 ? config2.modules : configModules, (i13 & 536870912) != 0 ? config2.attachmentSettings : attachmentSettings2, (i13 & 1073741824) != 0 ? config2.isAndroidNewPushUiDisabled : z22, (i13 & Integer.MIN_VALUE) != 0 ? config2.isArticleAutoReactionEnabled : z23, (i12 & 1) != 0 ? config2.isFinDictationUiEnabled : z24, (i12 & 2) != 0 ? config2.conversationStateSyncSettings : conversationStateSyncSettings2);
    }

    public final String component1() {
        return this.name;
    }

    public final boolean component10() {
        return this.isAudioEnabled;
    }

    public final boolean component11() {
        return this.isMetricsEnabled;
    }

    public final boolean component12() {
        return this.isBackgroundRequestsEnabled;
    }

    public final boolean component13() {
        return this.isPrimaryColorRenderDarkText;
    }

    public final boolean component14() {
        return this.isSecondaryColorRenderDarkText;
    }

    public final int component16() {
        return this.rateLimitCount;
    }

    public final String component2() {
        return this.primaryColor;
    }

    public final String component21() {
        return this.helpCenterUrl;
    }

    public final Set<String> component22() {
        return this.helpCenterUrls;
    }

    public final Set<String> component23() {
        return this.features;
    }

    public final boolean component24() {
        return this.identityVerificationEnabled;
    }

    public final boolean component25() {
        return this.accessToTeammateEnabled;
    }

    public final boolean component26() {
        return this.helpCenterRequireSearch;
    }

    public final boolean component27() {
        return this.preventMultipleInboundConversationsEnabled;
    }

    public final boolean component28() {
        return this.hasOpenConversations;
    }

    public final ConfigModules component29() {
        return this.modules;
    }

    public final String component3() {
        return this.secondaryColor;
    }

    public final AttachmentSettings component30() {
        return this.attachmentSettings;
    }

    public final boolean component31() {
        return this.isAndroidNewPushUiDisabled;
    }

    public final boolean component32() {
        return this.isArticleAutoReactionEnabled;
    }

    public final boolean component33() {
        return this.isFinDictationUiEnabled;
    }

    public final ConversationStateSyncSettings component34() {
        return this.conversationStateSyncSettings;
    }

    public final String component4() {
        return this.locale;
    }

    public final String component5() {
        return this.helpCenterLocale;
    }

    public final String component6() {
        return this.launcherLogoUrl;
    }

    public final String component7() {
        return this.teamGreeting;
    }

    public final boolean component8() {
        return this.isFirstRequest;
    }

    public final boolean component9() {
        return this.isInboundMessages;
    }

    public final Config copy(String str, String str2, String str3, String str4, String str5, String str6, String str7, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, long j10, int i10, long j11, long j12, long j13, NexusConfig.Builder builder, String str8, Set<String> set, Set<String> set2, boolean z17, boolean z18, boolean z19, boolean z20, boolean z21, ConfigModules configModules, AttachmentSettings attachmentSettings2, boolean z22, boolean z23, boolean z24, ConversationStateSyncSettings conversationStateSyncSettings2) {
        String str9 = str;
        C6496s.h(str9, "name");
        C6496s.h(str4, "locale");
        C6496s.h(str5, "helpCenterLocale");
        C6496s.h(str6, "launcherLogoUrl");
        C6496s.h(str7, "teamGreeting");
        C6496s.h(builder, "_realTimeConfigBuilder");
        C6496s.h(str8, "helpCenterUrl");
        C6496s.h(set, "helpCenterUrls");
        C6496s.h(set2, "features");
        C6496s.h(attachmentSettings2, "attachmentSettings");
        C6496s.h(conversationStateSyncSettings2, "conversationStateSyncSettings");
        return new Config(str9, str2, str3, str4, str5, str6, str7, z10, z11, z12, z13, z14, z15, z16, j10, i10, j11, j12, j13, builder, str8, set, set2, z17, z18, z19, z20, z21, configModules, attachmentSettings2, z22, z23, z24, conversationStateSyncSettings2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Config)) {
            return false;
        }
        Config config = (Config) obj;
        return C6496s.c(this.name, config.name) && C6496s.c(this.primaryColor, config.primaryColor) && C6496s.c(this.secondaryColor, config.secondaryColor) && C6496s.c(this.locale, config.locale) && C6496s.c(this.helpCenterLocale, config.helpCenterLocale) && C6496s.c(this.launcherLogoUrl, config.launcherLogoUrl) && C6496s.c(this.teamGreeting, config.teamGreeting) && this.isFirstRequest == config.isFirstRequest && this.isInboundMessages == config.isInboundMessages && this.isAudioEnabled == config.isAudioEnabled && this.isMetricsEnabled == config.isMetricsEnabled && this.isBackgroundRequestsEnabled == config.isBackgroundRequestsEnabled && this.isPrimaryColorRenderDarkText == config.isPrimaryColorRenderDarkText && this.isSecondaryColorRenderDarkText == config.isSecondaryColorRenderDarkText && this._rateLimitPeriodSeconds == config._rateLimitPeriodSeconds && this.rateLimitCount == config.rateLimitCount && this._userUpdateCacheMaxAgeSeconds == config._userUpdateCacheMaxAgeSeconds && this._softResetTimeoutSeconds == config._softResetTimeoutSeconds && this._newSessionThresholdSeconds == config._newSessionThresholdSeconds && C6496s.c(this._realTimeConfigBuilder, config._realTimeConfigBuilder) && C6496s.c(this.helpCenterUrl, config.helpCenterUrl) && C6496s.c(this.helpCenterUrls, config.helpCenterUrls) && C6496s.c(this.features, config.features) && this.identityVerificationEnabled == config.identityVerificationEnabled && this.accessToTeammateEnabled == config.accessToTeammateEnabled && this.helpCenterRequireSearch == config.helpCenterRequireSearch && this.preventMultipleInboundConversationsEnabled == config.preventMultipleInboundConversationsEnabled && this.hasOpenConversations == config.hasOpenConversations && C6496s.c(this.modules, config.modules) && C6496s.c(this.attachmentSettings, config.attachmentSettings) && this.isAndroidNewPushUiDisabled == config.isAndroidNewPushUiDisabled && this.isArticleAutoReactionEnabled == config.isArticleAutoReactionEnabled && this.isFinDictationUiEnabled == config.isFinDictationUiEnabled && C6496s.c(this.conversationStateSyncSettings, config.conversationStateSyncSettings);
    }

    public final boolean getAccessToTeammateEnabled() {
        return this.accessToTeammateEnabled;
    }

    public final AttachmentSettings getAttachmentSettings() {
        return this.attachmentSettings;
    }

    public final ConversationStateSyncSettings getConversationStateSyncSettings() {
        return this.conversationStateSyncSettings;
    }

    public final Set<String> getFeatures() {
        return this.features;
    }

    public final boolean getHasOpenConversations() {
        return this.hasOpenConversations;
    }

    public final String getHelpCenterLocale() {
        return this.helpCenterLocale;
    }

    public final boolean getHelpCenterRequireSearch() {
        return this.helpCenterRequireSearch;
    }

    public final String getHelpCenterUrl() {
        return this.helpCenterUrl;
    }

    public final Set<String> getHelpCenterUrls() {
        return this.helpCenterUrls;
    }

    public final boolean getIdentityVerificationEnabled() {
        return this.identityVerificationEnabled;
    }

    public final String getLauncherLogoUrl() {
        return this.launcherLogoUrl;
    }

    public final String getLocale() {
        return this.locale;
    }

    public final ConfigModules getModules() {
        return this.modules;
    }

    public final String getName() {
        return this.name;
    }

    public final long getNewSessionThreshold() {
        return TimeUnit.SECONDS.toMillis(this._newSessionThresholdSeconds);
    }

    public final boolean getPreventMultipleInboundConversationsEnabled() {
        return this.preventMultipleInboundConversationsEnabled;
    }

    public final String getPrimaryColor() {
        return this.primaryColor;
    }

    public final int getRateLimitCount() {
        return this.rateLimitCount;
    }

    public final long getRateLimitPeriod() {
        return TimeUnit.SECONDS.toMillis(this._rateLimitPeriodSeconds);
    }

    public final NexusConfig getRealTimeConfig() {
        NexusConfig build = this._realTimeConfigBuilder.build();
        C6496s.g(build, "build(...)");
        return build;
    }

    public final String getSecondaryColor() {
        return this.secondaryColor;
    }

    public final long getSoftResetTimeout() {
        return TimeUnit.SECONDS.toMillis(this._softResetTimeoutSeconds);
    }

    public final String getTeamGreeting() {
        return this.teamGreeting;
    }

    public final long getUserUpdateCacheMaxAge() {
        return TimeUnit.SECONDS.toMillis(this._userUpdateCacheMaxAgeSeconds);
    }

    public int hashCode() {
        int hashCode = this.name.hashCode() * 31;
        String str = this.primaryColor;
        int i10 = 0;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.secondaryColor;
        int hashCode3 = (((((((((((((((((((((((((((((((((((((((((((((((((((hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31) + this.locale.hashCode()) * 31) + this.helpCenterLocale.hashCode()) * 31) + this.launcherLogoUrl.hashCode()) * 31) + this.teamGreeting.hashCode()) * 31) + Boolean.hashCode(this.isFirstRequest)) * 31) + Boolean.hashCode(this.isInboundMessages)) * 31) + Boolean.hashCode(this.isAudioEnabled)) * 31) + Boolean.hashCode(this.isMetricsEnabled)) * 31) + Boolean.hashCode(this.isBackgroundRequestsEnabled)) * 31) + Boolean.hashCode(this.isPrimaryColorRenderDarkText)) * 31) + Boolean.hashCode(this.isSecondaryColorRenderDarkText)) * 31) + Long.hashCode(this._rateLimitPeriodSeconds)) * 31) + Integer.hashCode(this.rateLimitCount)) * 31) + Long.hashCode(this._userUpdateCacheMaxAgeSeconds)) * 31) + Long.hashCode(this._softResetTimeoutSeconds)) * 31) + Long.hashCode(this._newSessionThresholdSeconds)) * 31) + this._realTimeConfigBuilder.hashCode()) * 31) + this.helpCenterUrl.hashCode()) * 31) + this.helpCenterUrls.hashCode()) * 31) + this.features.hashCode()) * 31) + Boolean.hashCode(this.identityVerificationEnabled)) * 31) + Boolean.hashCode(this.accessToTeammateEnabled)) * 31) + Boolean.hashCode(this.helpCenterRequireSearch)) * 31) + Boolean.hashCode(this.preventMultipleInboundConversationsEnabled)) * 31) + Boolean.hashCode(this.hasOpenConversations)) * 31;
        ConfigModules configModules = this.modules;
        if (configModules != null) {
            i10 = configModules.hashCode();
        }
        return ((((((((((hashCode3 + i10) * 31) + this.attachmentSettings.hashCode()) * 31) + Boolean.hashCode(this.isAndroidNewPushUiDisabled)) * 31) + Boolean.hashCode(this.isArticleAutoReactionEnabled)) * 31) + Boolean.hashCode(this.isFinDictationUiEnabled)) * 31) + this.conversationStateSyncSettings.hashCode();
    }

    public final boolean isAndroidNewPushUiDisabled() {
        return this.isAndroidNewPushUiDisabled;
    }

    public final boolean isArticleAutoReactionEnabled() {
        return this.isArticleAutoReactionEnabled;
    }

    public final boolean isAudioEnabled() {
        return this.isAudioEnabled;
    }

    public final boolean isBackgroundRequestsEnabled() {
        return this.isBackgroundRequestsEnabled;
    }

    public final boolean isFinDictationUiEnabled() {
        return this.isFinDictationUiEnabled;
    }

    public final boolean isFirstRequest() {
        return this.isFirstRequest;
    }

    public final boolean isInboundMessages() {
        return this.isInboundMessages;
    }

    public final boolean isMetricsEnabled() {
        return this.isMetricsEnabled;
    }

    public final boolean isPrimaryColorRenderDarkText() {
        return this.isPrimaryColorRenderDarkText;
    }

    public final boolean isSecondaryColorRenderDarkText() {
        return this.isSecondaryColorRenderDarkText;
    }

    public String toString() {
        return "Config(name=" + this.name + ", primaryColor=" + this.primaryColor + ", secondaryColor=" + this.secondaryColor + ", locale=" + this.locale + ", helpCenterLocale=" + this.helpCenterLocale + ", launcherLogoUrl=" + this.launcherLogoUrl + ", teamGreeting=" + this.teamGreeting + ", isFirstRequest=" + this.isFirstRequest + ", isInboundMessages=" + this.isInboundMessages + ", isAudioEnabled=" + this.isAudioEnabled + ", isMetricsEnabled=" + this.isMetricsEnabled + ", isBackgroundRequestsEnabled=" + this.isBackgroundRequestsEnabled + ", isPrimaryColorRenderDarkText=" + this.isPrimaryColorRenderDarkText + ", isSecondaryColorRenderDarkText=" + this.isSecondaryColorRenderDarkText + ", _rateLimitPeriodSeconds=" + this._rateLimitPeriodSeconds + ", rateLimitCount=" + this.rateLimitCount + ", _userUpdateCacheMaxAgeSeconds=" + this._userUpdateCacheMaxAgeSeconds + ", _softResetTimeoutSeconds=" + this._softResetTimeoutSeconds + ", _newSessionThresholdSeconds=" + this._newSessionThresholdSeconds + ", _realTimeConfigBuilder=" + this._realTimeConfigBuilder + ", helpCenterUrl=" + this.helpCenterUrl + ", helpCenterUrls=" + this.helpCenterUrls + ", features=" + this.features + ", identityVerificationEnabled=" + this.identityVerificationEnabled + ", accessToTeammateEnabled=" + this.accessToTeammateEnabled + ", helpCenterRequireSearch=" + this.helpCenterRequireSearch + ", preventMultipleInboundConversationsEnabled=" + this.preventMultipleInboundConversationsEnabled + ", hasOpenConversations=" + this.hasOpenConversations + ", modules=" + this.modules + ", attachmentSettings=" + this.attachmentSettings + ", isAndroidNewPushUiDisabled=" + this.isAndroidNewPushUiDisabled + ", isArticleAutoReactionEnabled=" + this.isArticleAutoReactionEnabled + ", isFinDictationUiEnabled=" + this.isFinDictationUiEnabled + ", conversationStateSyncSettings=" + this.conversationStateSyncSettings + ')';
    }

    public Config(String str, String str2, String str3, String str4, String str5, String str6, String str7, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, long j10, int i10, long j11, long j12, long j13, NexusConfig.Builder builder, String str8, Set<String> set, Set<String> set2, boolean z17, boolean z18, boolean z19, boolean z20, boolean z21, ConfigModules configModules, AttachmentSettings attachmentSettings2, boolean z22, boolean z23, boolean z24, ConversationStateSyncSettings conversationStateSyncSettings2) {
        String str9 = str4;
        String str10 = str5;
        String str11 = str6;
        String str12 = str7;
        NexusConfig.Builder builder2 = builder;
        String str13 = str8;
        Set<String> set3 = set;
        Set<String> set4 = set2;
        AttachmentSettings attachmentSettings3 = attachmentSettings2;
        ConversationStateSyncSettings conversationStateSyncSettings3 = conversationStateSyncSettings2;
        C6496s.h(str, "name");
        C6496s.h(str9, "locale");
        C6496s.h(str10, "helpCenterLocale");
        C6496s.h(str11, "launcherLogoUrl");
        C6496s.h(str12, "teamGreeting");
        C6496s.h(builder2, "_realTimeConfigBuilder");
        C6496s.h(str13, "helpCenterUrl");
        C6496s.h(set3, "helpCenterUrls");
        C6496s.h(set4, "features");
        C6496s.h(attachmentSettings3, "attachmentSettings");
        C6496s.h(conversationStateSyncSettings3, "conversationStateSyncSettings");
        this.name = str;
        this.primaryColor = str2;
        this.secondaryColor = str3;
        this.locale = str9;
        this.helpCenterLocale = str10;
        this.launcherLogoUrl = str11;
        this.teamGreeting = str12;
        this.isFirstRequest = z10;
        this.isInboundMessages = z11;
        this.isAudioEnabled = z12;
        this.isMetricsEnabled = z13;
        this.isBackgroundRequestsEnabled = z14;
        this.isPrimaryColorRenderDarkText = z15;
        this.isSecondaryColorRenderDarkText = z16;
        this._rateLimitPeriodSeconds = j10;
        this.rateLimitCount = i10;
        this._userUpdateCacheMaxAgeSeconds = j11;
        this._softResetTimeoutSeconds = j12;
        this._newSessionThresholdSeconds = j13;
        this._realTimeConfigBuilder = builder2;
        this.helpCenterUrl = str13;
        this.helpCenterUrls = set3;
        this.features = set4;
        this.identityVerificationEnabled = z17;
        this.accessToTeammateEnabled = z18;
        this.helpCenterRequireSearch = z19;
        this.preventMultipleInboundConversationsEnabled = z20;
        this.hasOpenConversations = z21;
        this.modules = configModules;
        this.attachmentSettings = attachmentSettings3;
        this.isAndroidNewPushUiDisabled = z22;
        this.isArticleAutoReactionEnabled = z23;
        this.isFinDictationUiEnabled = z24;
        this.conversationStateSyncSettings = conversationStateSyncSettings3;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ Config(java.lang.String r39, java.lang.String r40, java.lang.String r41, java.lang.String r42, java.lang.String r43, java.lang.String r44, java.lang.String r45, boolean r46, boolean r47, boolean r48, boolean r49, boolean r50, boolean r51, boolean r52, long r53, int r55, long r56, long r58, long r60, io.intercom.android.nexus.NexusConfig.Builder r62, java.lang.String r63, java.util.Set r64, java.util.Set r65, boolean r66, boolean r67, boolean r68, boolean r69, boolean r70, io.intercom.android.sdk.models.ConfigModules r71, io.intercom.android.sdk.models.AttachmentSettings r72, boolean r73, boolean r74, boolean r75, io.intercom.android.sdk.models.ConversationStateSyncSettings r76, int r77, int r78, kotlin.jvm.internal.DefaultConstructorMarker r79) {
        /*
            r38 = this;
            r0 = r77
            r1 = r0 & 1
            java.lang.String r2 = ""
            if (r1 == 0) goto L_0x000a
            r1 = r2
            goto L_0x000c
        L_0x000a:
            r1 = r39
        L_0x000c:
            r3 = r0 & 2
            if (r3 == 0) goto L_0x0012
            r3 = 0
            goto L_0x0014
        L_0x0012:
            r3 = r40
        L_0x0014:
            r5 = r0 & 4
            if (r5 == 0) goto L_0x001a
            r5 = 0
            goto L_0x001c
        L_0x001a:
            r5 = r41
        L_0x001c:
            r6 = r0 & 8
            if (r6 == 0) goto L_0x0022
            r6 = r2
            goto L_0x0024
        L_0x0022:
            r6 = r42
        L_0x0024:
            r7 = r0 & 16
            if (r7 == 0) goto L_0x002a
            r7 = r2
            goto L_0x002c
        L_0x002a:
            r7 = r43
        L_0x002c:
            r8 = r0 & 32
            if (r8 == 0) goto L_0x0032
            r8 = r2
            goto L_0x0034
        L_0x0032:
            r8 = r44
        L_0x0034:
            r9 = r0 & 64
            if (r9 == 0) goto L_0x003a
            r9 = r2
            goto L_0x003c
        L_0x003a:
            r9 = r45
        L_0x003c:
            r10 = r0 & 128(0x80, float:1.794E-43)
            if (r10 == 0) goto L_0x0042
            r10 = 0
            goto L_0x0044
        L_0x0042:
            r10 = r46
        L_0x0044:
            r12 = r0 & 256(0x100, float:3.59E-43)
            if (r12 == 0) goto L_0x004a
            r12 = 0
            goto L_0x004c
        L_0x004a:
            r12 = r47
        L_0x004c:
            r13 = r0 & 512(0x200, float:7.175E-43)
            if (r13 == 0) goto L_0x0052
            r13 = 1
            goto L_0x0054
        L_0x0052:
            r13 = r48
        L_0x0054:
            r15 = r0 & 1024(0x400, float:1.435E-42)
            if (r15 == 0) goto L_0x005a
            r15 = 1
            goto L_0x005c
        L_0x005a:
            r15 = r49
        L_0x005c:
            r4 = r0 & 2048(0x800, float:2.87E-42)
            if (r4 == 0) goto L_0x0062
            r4 = 1
            goto L_0x0064
        L_0x0062:
            r4 = r50
        L_0x0064:
            r11 = r0 & 4096(0x1000, float:5.74E-42)
            if (r11 == 0) goto L_0x006a
            r11 = 0
            goto L_0x006c
        L_0x006a:
            r11 = r51
        L_0x006c:
            r14 = r0 & 8192(0x2000, float:1.14794E-41)
            if (r14 == 0) goto L_0x0072
            r14 = 0
            goto L_0x0074
        L_0x0072:
            r14 = r52
        L_0x0074:
            r79 = r2
            r2 = r0 & 16384(0x4000, float:2.2959E-41)
            if (r2 == 0) goto L_0x007d
            r16 = 60
            goto L_0x007f
        L_0x007d:
            r16 = r53
        L_0x007f:
            r2 = 32768(0x8000, float:4.5918E-41)
            r2 = r2 & r0
            if (r2 == 0) goto L_0x0088
            r2 = 100
            goto L_0x008a
        L_0x0088:
            r2 = r55
        L_0x008a:
            r18 = 65536(0x10000, float:9.18355E-41)
            r18 = r0 & r18
            if (r18 == 0) goto L_0x0093
            r18 = 300(0x12c, double:1.48E-321)
            goto L_0x0095
        L_0x0093:
            r18 = r56
        L_0x0095:
            r20 = 131072(0x20000, float:1.83671E-40)
            r20 = r0 & r20
            if (r20 == 0) goto L_0x009e
            r20 = 1
            goto L_0x00a0
        L_0x009e:
            r20 = r58
        L_0x00a0:
            r22 = 262144(0x40000, float:3.67342E-40)
            r22 = r0 & r22
            if (r22 == 0) goto L_0x00a9
            r22 = 20
            goto L_0x00ab
        L_0x00a9:
            r22 = r60
        L_0x00ab:
            r24 = 524288(0x80000, float:7.34684E-40)
            r24 = r0 & r24
            if (r24 == 0) goto L_0x00b7
            io.intercom.android.nexus.NexusConfig$Builder r24 = new io.intercom.android.nexus.NexusConfig$Builder
            r24.<init>()
            goto L_0x00b9
        L_0x00b7:
            r24 = r62
        L_0x00b9:
            r25 = 1048576(0x100000, float:1.469368E-39)
            r25 = r0 & r25
            if (r25 == 0) goto L_0x00c2
            r25 = r79
            goto L_0x00c4
        L_0x00c2:
            r25 = r63
        L_0x00c4:
            r26 = 2097152(0x200000, float:2.938736E-39)
            r26 = r0 & r26
            if (r26 == 0) goto L_0x00cf
            java.util.Set r26 = mf.Y.e()
            goto L_0x00d1
        L_0x00cf:
            r26 = r64
        L_0x00d1:
            r27 = 4194304(0x400000, float:5.877472E-39)
            r27 = r0 & r27
            if (r27 == 0) goto L_0x00dc
            java.util.Set r27 = mf.Y.e()
            goto L_0x00de
        L_0x00dc:
            r27 = r65
        L_0x00de:
            r28 = 8388608(0x800000, float:1.17549435E-38)
            r28 = r0 & r28
            if (r28 == 0) goto L_0x00e7
            r28 = 0
            goto L_0x00e9
        L_0x00e7:
            r28 = r66
        L_0x00e9:
            r29 = 16777216(0x1000000, float:2.3509887E-38)
            r29 = r0 & r29
            if (r29 == 0) goto L_0x00f2
            r29 = 1
            goto L_0x00f4
        L_0x00f2:
            r29 = r67
        L_0x00f4:
            r30 = 33554432(0x2000000, float:9.403955E-38)
            r30 = r0 & r30
            if (r30 == 0) goto L_0x00fd
            r30 = 0
            goto L_0x00ff
        L_0x00fd:
            r30 = r68
        L_0x00ff:
            r31 = 67108864(0x4000000, float:1.5046328E-36)
            r31 = r0 & r31
            if (r31 == 0) goto L_0x0108
            r31 = 0
            goto L_0x010a
        L_0x0108:
            r31 = r69
        L_0x010a:
            r32 = 134217728(0x8000000, float:3.85186E-34)
            r32 = r0 & r32
            if (r32 == 0) goto L_0x0113
            r32 = 0
            goto L_0x0115
        L_0x0113:
            r32 = r70
        L_0x0115:
            r33 = 268435456(0x10000000, float:2.5243549E-29)
            r33 = r0 & r33
            if (r33 == 0) goto L_0x011e
            r33 = 0
            goto L_0x0120
        L_0x011e:
            r33 = r71
        L_0x0120:
            r34 = 536870912(0x20000000, float:1.0842022E-19)
            r34 = r0 & r34
            if (r34 == 0) goto L_0x012d
            io.intercom.android.sdk.models.AttachmentSettings$Companion r34 = io.intercom.android.sdk.models.AttachmentSettings.Companion
            io.intercom.android.sdk.models.AttachmentSettings r34 = r34.getDEFAULT()
            goto L_0x012f
        L_0x012d:
            r34 = r72
        L_0x012f:
            r35 = 1073741824(0x40000000, float:2.0)
            r35 = r0 & r35
            if (r35 == 0) goto L_0x0138
            r35 = 1
            goto L_0x013a
        L_0x0138:
            r35 = r73
        L_0x013a:
            r36 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r0 & r36
            if (r0 == 0) goto L_0x0142
            r0 = 1
            goto L_0x0144
        L_0x0142:
            r0 = r74
        L_0x0144:
            r36 = r78 & 1
            if (r36 == 0) goto L_0x014b
            r36 = 0
            goto L_0x014d
        L_0x014b:
            r36 = r75
        L_0x014d:
            r37 = r78 & 2
            if (r37 == 0) goto L_0x0158
            io.intercom.android.sdk.models.ConversationStateSyncSettings$Companion r37 = io.intercom.android.sdk.models.ConversationStateSyncSettings.Companion
            io.intercom.android.sdk.models.ConversationStateSyncSettings r37 = r37.getDEFAULT()
            goto L_0x015a
        L_0x0158:
            r37 = r76
        L_0x015a:
            r39 = r38
            r40 = r1
            r41 = r3
            r42 = r5
            r43 = r6
            r44 = r7
            r45 = r8
            r46 = r9
            r47 = r10
            r48 = r12
            r49 = r13
            r50 = r15
            r51 = r4
            r52 = r11
            r53 = r14
            r54 = r16
            r56 = r2
            r57 = r18
            r59 = r20
            r61 = r22
            r63 = r24
            r64 = r25
            r65 = r26
            r66 = r27
            r67 = r28
            r68 = r29
            r69 = r30
            r70 = r31
            r71 = r32
            r72 = r33
            r73 = r34
            r74 = r35
            r75 = r0
            r76 = r36
            r77 = r37
            r39.<init>(r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51, r52, r53, r54, r56, r57, r59, r61, r63, r64, r65, r66, r67, r68, r69, r70, r71, r72, r73, r74, r75, r76, r77)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: io.intercom.android.sdk.models.Config.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, boolean, boolean, boolean, boolean, boolean, boolean, long, int, long, long, long, io.intercom.android.nexus.NexusConfig$Builder, java.lang.String, java.util.Set, java.util.Set, boolean, boolean, boolean, boolean, boolean, io.intercom.android.sdk.models.ConfigModules, io.intercom.android.sdk.models.AttachmentSettings, boolean, boolean, boolean, io.intercom.android.sdk.models.ConversationStateSyncSettings, int, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
