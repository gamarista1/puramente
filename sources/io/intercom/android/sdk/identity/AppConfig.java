package io.intercom.android.sdk.identity;

import io.intercom.android.nexus.NexusConfig;
import io.intercom.android.sdk.models.AttachmentSettings;
import io.intercom.android.sdk.models.ConfigModules;
import io.intercom.android.sdk.models.ConversationStateSyncSettings;
import io.intercom.android.sdk.models.HomeConfig;
import io.intercom.android.sdk.models.OpenConfig;
import io.intercom.android.sdk.models.Space;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import lf.C6521e;

@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u000b\n\u0002\u0010\"\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b*\n\u0002\u0018\u0002\n\u0002\b*\b\b\u0018\u00002\u00020\u0001B³\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u0005\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0010\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u000e\u0012\u0006\u0010\u0012\u001a\u00020\t\u0012\u0006\u0010\u0013\u001a\u00020\t\u0012\u0006\u0010\u0014\u001a\u00020\u0003\u0012\u0006\u0010\u0015\u001a\u00020\u0003\u0012\u0006\u0010\u0016\u001a\u00020\t\u0012\u0006\u0010\u0017\u001a\u00020\t\u0012\u0006\u0010\u0018\u001a\u00020\u0003\u0012\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00030\u001a\u0012\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00030\u001a\u0012\u0006\u0010\u001c\u001a\u00020\u0003\u0012\u0006\u0010\u001d\u001a\u00020\u0003\u0012\u0006\u0010\u001e\u001a\u00020\t\u0012\u0006\u0010\u001f\u001a\u00020\t\u0012\u0006\u0010 \u001a\u00020\t\u0012\u0006\u0010!\u001a\u00020\t\u0012\u0006\u0010\"\u001a\u00020\t\u0012\b\u0010#\u001a\u0004\u0018\u00010$\u0012\u0006\u0010%\u001a\u00020&\u0012\u0006\u0010'\u001a\u00020\t\u0012\u0006\u0010(\u001a\u00020)\u0012\u0006\u0010*\u001a\u00020\t\u0012\u0006\u0010+\u001a\u00020\t\u0012\u0006\u0010,\u001a\u00020-¢\u0006\u0004\b.\u0010/J\u000e\u0010S\u001a\u00020\t2\u0006\u0010T\u001a\u00020\u0003J\u0006\u0010U\u001a\u00020\tJ\u000e\u0010V\u001a\u00020\t2\u0006\u0010W\u001a\u00020XJ\u0010\u0010Y\u001a\u0004\u0018\u00010\u00032\u0006\u0010W\u001a\u00020XJ\t\u0010Z\u001a\u00020\u0003HÆ\u0003J\t\u0010[\u001a\u00020\u0005HÆ\u0003J\t\u0010\\\u001a\u00020\u0005HÆ\u0003J\t\u0010]\u001a\u00020\u0005HÆ\u0003J\t\u0010^\u001a\u00020\tHÆ\u0003J\t\u0010_\u001a\u00020\tHÆ\u0003J\t\u0010`\u001a\u00020\tHÆ\u0003J\t\u0010a\u001a\u00020\u0005HÆ\u0003J\t\u0010b\u001a\u00020\u000eHÆ\u0003J\t\u0010c\u001a\u00020\u000eHÆ\u0003J\t\u0010d\u001a\u00020\u000eHÆ\u0003J\t\u0010e\u001a\u00020\u000eHÆ\u0003J\t\u0010f\u001a\u00020\tHÆ\u0003J\t\u0010g\u001a\u00020\tHÆ\u0003J\t\u0010h\u001a\u00020\u0003HÆ\u0003J\t\u0010i\u001a\u00020\u0003HÆ\u0003J\t\u0010j\u001a\u00020\tHÆ\u0003J\t\u0010k\u001a\u00020\tHÆ\u0003J\t\u0010l\u001a\u00020\u0003HÆ\u0003J\u000f\u0010m\u001a\b\u0012\u0004\u0012\u00020\u00030\u001aHÆ\u0003J\u000f\u0010n\u001a\b\u0012\u0004\u0012\u00020\u00030\u001aHÆ\u0003J\t\u0010o\u001a\u00020\u0003HÆ\u0003J\t\u0010p\u001a\u00020\u0003HÆ\u0003J\t\u0010q\u001a\u00020\tHÆ\u0003J\t\u0010r\u001a\u00020\tHÆ\u0003J\t\u0010s\u001a\u00020\tHÆ\u0003J\t\u0010t\u001a\u00020\tHÆ\u0003J\t\u0010u\u001a\u00020\tHÆ\u0003J\u000b\u0010v\u001a\u0004\u0018\u00010$HÆ\u0003J\t\u0010w\u001a\u00020&HÆ\u0003J\t\u0010x\u001a\u00020\tHÆ\u0003J\t\u0010y\u001a\u00020)HÆ\u0003J\t\u0010z\u001a\u00020\tHÆ\u0003J\t\u0010{\u001a\u00020\tHÆ\u0003J\t\u0010|\u001a\u00020-HÆ\u0003Jõ\u0002\u0010}\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00052\b\b\u0003\u0010\u0006\u001a\u00020\u00052\b\b\u0003\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\u00052\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\u000e2\b\b\u0002\u0010\u0012\u001a\u00020\t2\b\b\u0002\u0010\u0013\u001a\u00020\t2\b\b\u0002\u0010\u0014\u001a\u00020\u00032\b\b\u0002\u0010\u0015\u001a\u00020\u00032\b\b\u0002\u0010\u0016\u001a\u00020\t2\b\b\u0002\u0010\u0017\u001a\u00020\t2\b\b\u0002\u0010\u0018\u001a\u00020\u00032\u000e\b\u0002\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00030\u001a2\u000e\b\u0002\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00030\u001a2\b\b\u0002\u0010\u001c\u001a\u00020\u00032\b\b\u0002\u0010\u001d\u001a\u00020\u00032\b\b\u0002\u0010\u001e\u001a\u00020\t2\b\b\u0002\u0010\u001f\u001a\u00020\t2\b\b\u0002\u0010 \u001a\u00020\t2\b\b\u0002\u0010!\u001a\u00020\t2\b\b\u0002\u0010\"\u001a\u00020\t2\n\b\u0002\u0010#\u001a\u0004\u0018\u00010$2\b\b\u0002\u0010%\u001a\u00020&2\b\b\u0002\u0010'\u001a\u00020\t2\b\b\u0002\u0010(\u001a\u00020)2\b\b\u0002\u0010*\u001a\u00020\t2\b\b\u0002\u0010+\u001a\u00020\t2\b\b\u0002\u0010,\u001a\u00020-HÇ\u0001J\u0013\u0010~\u001a\u00020\t2\b\u0010\u001a\u0004\u0018\u00010\u0001H×\u0003J\n\u0010\u0001\u001a\u00020\u0005H×\u0001J\n\u0010\u0001\u001a\u00020\u0003H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b0\u00101R\u001c\u0010\u0004\u001a\u00020\u00058\u0006X\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b2\u00103\u001a\u0004\b4\u00105R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b6\u00105R\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b7\u00105R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\b\u00108R\u0011\u0010\n\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\n\u00108R\u0011\u0010\u000b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u00108R\u0011\u0010\f\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b9\u00105R\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b:\u0010;R\u0011\u0010\u000f\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b<\u0010;R\u0011\u0010\u0010\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b=\u0010;R\u0011\u0010\u0011\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b>\u0010;R\u0011\u0010\u0012\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u00108R\u0011\u0010\u0013\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u00108R\u0011\u0010\u0014\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b?\u00101R\u0011\u0010\u0015\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b@\u00101R\u0011\u0010\u0016\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u00108R\u0011\u0010\u0017\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u00108R\u0011\u0010\u0018\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bA\u00101R\u0017\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00030\u001a¢\u0006\b\n\u0000\u001a\u0004\bB\u0010CR\u0017\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00030\u001a¢\u0006\b\n\u0000\u001a\u0004\bD\u0010CR\u0011\u0010\u001c\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bE\u00101R\u0011\u0010\u001d\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bF\u00101R\u0011\u0010\u001e\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u00108R\u0011\u0010\u001f\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u00108R\u0011\u0010 \u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b \u00108R\u0011\u0010!\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b!\u00108R\u0011\u0010\"\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\bG\u00108R\u0013\u0010#\u001a\u0004\u0018\u00010$¢\u0006\b\n\u0000\u001a\u0004\bH\u0010IR\u0011\u0010%\u001a\u00020&¢\u0006\b\n\u0000\u001a\u0004\bJ\u0010KR\u0011\u0010'\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\bL\u00108R\u0011\u0010(\u001a\u00020)¢\u0006\b\n\u0000\u001a\u0004\bM\u0010NR\u0011\u0010*\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\bO\u00108R\u0011\u0010+\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\bP\u00108R\u0011\u0010,\u001a\u00020-¢\u0006\b\n\u0000\u001a\u0004\bQ\u0010R¨\u0006\u0001"}, d2 = {"Lio/intercom/android/sdk/identity/AppConfig;", "", "name", "", "primaryColor", "", "secondaryColor", "secondaryColorDark", "isPrimaryColorRenderDarkText", "", "isSecondaryColorRenderDarkText", "isInboundMessages", "rateLimitCount", "rateLimitPeriodMs", "", "userUpdateCacheMaxAgeMs", "newSessionThresholdMs", "softResetTimeoutMs", "isMetricsEnabled", "isAudioEnabled", "locale", "helpCenterLocale", "isReceivedFromServer", "isBackgroundRequestsEnabled", "helpCenterUrl", "helpCenterUrls", "", "features", "launcherLogoUrl", "teamGreeting", "isIdentityVerificationEnabled", "isAccessToTeammateEnabled", "isHelpCenterRequireSearchEnabled", "isPreventMultipleInboundConversationsEnabled", "hasOpenConversations", "configModules", "Lio/intercom/android/sdk/models/ConfigModules;", "realTimeConfig", "Lio/intercom/android/nexus/NexusConfig;", "newPushUiDisabled", "attachmentSettings", "Lio/intercom/android/sdk/models/AttachmentSettings;", "articleAutoReactionEnabled", "finDictationUiEnabled", "conversationStateSyncSettings", "Lio/intercom/android/sdk/models/ConversationStateSyncSettings;", "<init>", "(Ljava/lang/String;IIIZZZIJJJJZZLjava/lang/String;Ljava/lang/String;ZZLjava/lang/String;Ljava/util/Set;Ljava/util/Set;Ljava/lang/String;Ljava/lang/String;ZZZZZLio/intercom/android/sdk/models/ConfigModules;Lio/intercom/android/nexus/NexusConfig;ZLio/intercom/android/sdk/models/AttachmentSettings;ZZLio/intercom/android/sdk/models/ConversationStateSyncSettings;)V", "getName", "()Ljava/lang/String;", "getPrimaryColor$annotations", "()V", "getPrimaryColor", "()I", "getSecondaryColor", "getSecondaryColorDark", "()Z", "getRateLimitCount", "getRateLimitPeriodMs", "()J", "getUserUpdateCacheMaxAgeMs", "getNewSessionThresholdMs", "getSoftResetTimeoutMs", "getLocale", "getHelpCenterLocale", "getHelpCenterUrl", "getHelpCenterUrls", "()Ljava/util/Set;", "getFeatures", "getLauncherLogoUrl", "getTeamGreeting", "getHasOpenConversations", "getConfigModules", "()Lio/intercom/android/sdk/models/ConfigModules;", "getRealTimeConfig", "()Lio/intercom/android/nexus/NexusConfig;", "getNewPushUiDisabled", "getAttachmentSettings", "()Lio/intercom/android/sdk/models/AttachmentSettings;", "getArticleAutoReactionEnabled", "getFinDictationUiEnabled", "getConversationStateSyncSettings", "()Lio/intercom/android/sdk/models/ConversationStateSyncSettings;", "hasFeature", "feature", "isBackgroundRequestsDisabled", "isSpaceEnabled", "space", "Lio/intercom/android/sdk/models/Space$Type;", "getSpaceLabelIfExists", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "component29", "component30", "component31", "component32", "component33", "component34", "component35", "copy", "equals", "other", "hashCode", "toString", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class AppConfig {
    public static final int $stable = 8;
    private final boolean articleAutoReactionEnabled;
    private final AttachmentSettings attachmentSettings;
    private final ConfigModules configModules;
    private final ConversationStateSyncSettings conversationStateSyncSettings;
    private final Set<String> features;
    private final boolean finDictationUiEnabled;
    private final boolean hasOpenConversations;
    private final String helpCenterLocale;
    private final String helpCenterUrl;
    private final Set<String> helpCenterUrls;
    private final boolean isAccessToTeammateEnabled;
    private final boolean isAudioEnabled;
    private final boolean isBackgroundRequestsEnabled;
    private final boolean isHelpCenterRequireSearchEnabled;
    private final boolean isIdentityVerificationEnabled;
    private final boolean isInboundMessages;
    private final boolean isMetricsEnabled;
    private final boolean isPreventMultipleInboundConversationsEnabled;
    private final boolean isPrimaryColorRenderDarkText;
    private final boolean isReceivedFromServer;
    private final boolean isSecondaryColorRenderDarkText;
    private final String launcherLogoUrl;
    private final String locale;
    private final String name;
    private final boolean newPushUiDisabled;
    private final long newSessionThresholdMs;
    private final int primaryColor;
    private final int rateLimitCount;
    private final long rateLimitPeriodMs;
    private final NexusConfig realTimeConfig;
    private final int secondaryColor;
    private final int secondaryColorDark;
    private final long softResetTimeoutMs;
    private final String teamGreeting;
    private final long userUpdateCacheMaxAgeMs;

    public AppConfig(String str, int i10, int i11, int i12, boolean z10, boolean z11, boolean z12, int i13, long j10, long j11, long j12, long j13, boolean z13, boolean z14, String str2, String str3, boolean z15, boolean z16, String str4, Set<String> set, Set<String> set2, String str5, String str6, boolean z17, boolean z18, boolean z19, boolean z20, boolean z21, ConfigModules configModules2, NexusConfig nexusConfig, boolean z22, AttachmentSettings attachmentSettings2, boolean z23, boolean z24, ConversationStateSyncSettings conversationStateSyncSettings2) {
        String str7 = str2;
        String str8 = str3;
        String str9 = str4;
        Set<String> set3 = set;
        Set<String> set4 = set2;
        String str10 = str5;
        String str11 = str6;
        NexusConfig nexusConfig2 = nexusConfig;
        AttachmentSettings attachmentSettings3 = attachmentSettings2;
        ConversationStateSyncSettings conversationStateSyncSettings3 = conversationStateSyncSettings2;
        C6496s.h(str, "name");
        C6496s.h(str7, "locale");
        C6496s.h(str8, "helpCenterLocale");
        C6496s.h(str9, "helpCenterUrl");
        C6496s.h(set3, "helpCenterUrls");
        C6496s.h(set4, "features");
        C6496s.h(str10, "launcherLogoUrl");
        C6496s.h(str11, "teamGreeting");
        C6496s.h(nexusConfig2, "realTimeConfig");
        C6496s.h(attachmentSettings3, "attachmentSettings");
        C6496s.h(conversationStateSyncSettings3, "conversationStateSyncSettings");
        this.name = str;
        this.primaryColor = i10;
        this.secondaryColor = i11;
        this.secondaryColorDark = i12;
        this.isPrimaryColorRenderDarkText = z10;
        this.isSecondaryColorRenderDarkText = z11;
        this.isInboundMessages = z12;
        this.rateLimitCount = i13;
        this.rateLimitPeriodMs = j10;
        this.userUpdateCacheMaxAgeMs = j11;
        this.newSessionThresholdMs = j12;
        this.softResetTimeoutMs = j13;
        this.isMetricsEnabled = z13;
        this.isAudioEnabled = z14;
        this.locale = str7;
        this.helpCenterLocale = str8;
        this.isReceivedFromServer = z15;
        this.isBackgroundRequestsEnabled = z16;
        this.helpCenterUrl = str9;
        this.helpCenterUrls = set3;
        this.features = set4;
        this.launcherLogoUrl = str10;
        this.teamGreeting = str11;
        this.isIdentityVerificationEnabled = z17;
        this.isAccessToTeammateEnabled = z18;
        this.isHelpCenterRequireSearchEnabled = z19;
        this.isPreventMultipleInboundConversationsEnabled = z20;
        this.hasOpenConversations = z21;
        this.configModules = configModules2;
        this.realTimeConfig = nexusConfig2;
        this.newPushUiDisabled = z22;
        this.attachmentSettings = attachmentSettings3;
        this.articleAutoReactionEnabled = z23;
        this.finDictationUiEnabled = z24;
        this.conversationStateSyncSettings = conversationStateSyncSettings3;
    }

    public static /* synthetic */ AppConfig copy$default(AppConfig appConfig, String str, int i10, int i11, int i12, boolean z10, boolean z11, boolean z12, int i13, long j10, long j11, long j12, long j13, boolean z13, boolean z14, String str2, String str3, boolean z15, boolean z16, String str4, Set set, Set set2, String str5, String str6, boolean z17, boolean z18, boolean z19, boolean z20, boolean z21, ConfigModules configModules2, NexusConfig nexusConfig, boolean z22, AttachmentSettings attachmentSettings2, boolean z23, boolean z24, ConversationStateSyncSettings conversationStateSyncSettings2, int i14, int i15, Object obj) {
        AppConfig appConfig2 = appConfig;
        int i16 = i14;
        return appConfig.copy((i16 & 1) != 0 ? appConfig2.name : str, (i16 & 2) != 0 ? appConfig2.primaryColor : i10, (i16 & 4) != 0 ? appConfig2.secondaryColor : i11, (i16 & 8) != 0 ? appConfig2.secondaryColorDark : i12, (i16 & 16) != 0 ? appConfig2.isPrimaryColorRenderDarkText : z10, (i16 & 32) != 0 ? appConfig2.isSecondaryColorRenderDarkText : z11, (i16 & 64) != 0 ? appConfig2.isInboundMessages : z12, (i16 & 128) != 0 ? appConfig2.rateLimitCount : i13, (i16 & 256) != 0 ? appConfig2.rateLimitPeriodMs : j10, (i16 & 512) != 0 ? appConfig2.userUpdateCacheMaxAgeMs : j11, (i16 & 1024) != 0 ? appConfig2.newSessionThresholdMs : j12, (i16 & 2048) != 0 ? appConfig2.softResetTimeoutMs : j13, (i16 & 4096) != 0 ? appConfig2.isMetricsEnabled : z13, (i16 & 8192) != 0 ? appConfig2.isAudioEnabled : z14, (i16 & 16384) != 0 ? appConfig2.locale : str2, (i16 & 32768) != 0 ? appConfig2.helpCenterLocale : str3, (i16 & 65536) != 0 ? appConfig2.isReceivedFromServer : z15, (i16 & 131072) != 0 ? appConfig2.isBackgroundRequestsEnabled : z16, (i16 & 262144) != 0 ? appConfig2.helpCenterUrl : str4, (i16 & 524288) != 0 ? appConfig2.helpCenterUrls : set, (i16 & 1048576) != 0 ? appConfig2.features : set2, (i16 & 2097152) != 0 ? appConfig2.launcherLogoUrl : str5, (i16 & 4194304) != 0 ? appConfig2.teamGreeting : str6, (i16 & 8388608) != 0 ? appConfig2.isIdentityVerificationEnabled : z17, (i16 & 16777216) != 0 ? appConfig2.isAccessToTeammateEnabled : z18, (i16 & 33554432) != 0 ? appConfig2.isHelpCenterRequireSearchEnabled : z19, (i16 & 67108864) != 0 ? appConfig2.isPreventMultipleInboundConversationsEnabled : z20, (i16 & 134217728) != 0 ? appConfig2.hasOpenConversations : z21, (i16 & 268435456) != 0 ? appConfig2.configModules : configModules2, (i16 & 536870912) != 0 ? appConfig2.realTimeConfig : nexusConfig, (i16 & 1073741824) != 0 ? appConfig2.newPushUiDisabled : z22, (i16 & Integer.MIN_VALUE) != 0 ? appConfig2.attachmentSettings : attachmentSettings2, (i15 & 1) != 0 ? appConfig2.articleAutoReactionEnabled : z23, (i15 & 2) != 0 ? appConfig2.finDictationUiEnabled : z24, (i15 & 4) != 0 ? appConfig2.conversationStateSyncSettings : conversationStateSyncSettings2);
    }

    @C6521e
    public static /* synthetic */ void getPrimaryColor$annotations() {
    }

    public final String component1() {
        return this.name;
    }

    public final long component10() {
        return this.userUpdateCacheMaxAgeMs;
    }

    public final long component11() {
        return this.newSessionThresholdMs;
    }

    public final long component12() {
        return this.softResetTimeoutMs;
    }

    public final boolean component13() {
        return this.isMetricsEnabled;
    }

    public final boolean component14() {
        return this.isAudioEnabled;
    }

    public final String component15() {
        return this.locale;
    }

    public final String component16() {
        return this.helpCenterLocale;
    }

    public final boolean component17() {
        return this.isReceivedFromServer;
    }

    public final boolean component18() {
        return this.isBackgroundRequestsEnabled;
    }

    public final String component19() {
        return this.helpCenterUrl;
    }

    public final int component2() {
        return this.primaryColor;
    }

    public final Set<String> component20() {
        return this.helpCenterUrls;
    }

    public final Set<String> component21() {
        return this.features;
    }

    public final String component22() {
        return this.launcherLogoUrl;
    }

    public final String component23() {
        return this.teamGreeting;
    }

    public final boolean component24() {
        return this.isIdentityVerificationEnabled;
    }

    public final boolean component25() {
        return this.isAccessToTeammateEnabled;
    }

    public final boolean component26() {
        return this.isHelpCenterRequireSearchEnabled;
    }

    public final boolean component27() {
        return this.isPreventMultipleInboundConversationsEnabled;
    }

    public final boolean component28() {
        return this.hasOpenConversations;
    }

    public final ConfigModules component29() {
        return this.configModules;
    }

    public final int component3() {
        return this.secondaryColor;
    }

    public final NexusConfig component30() {
        return this.realTimeConfig;
    }

    public final boolean component31() {
        return this.newPushUiDisabled;
    }

    public final AttachmentSettings component32() {
        return this.attachmentSettings;
    }

    public final boolean component33() {
        return this.articleAutoReactionEnabled;
    }

    public final boolean component34() {
        return this.finDictationUiEnabled;
    }

    public final ConversationStateSyncSettings component35() {
        return this.conversationStateSyncSettings;
    }

    public final int component4() {
        return this.secondaryColorDark;
    }

    public final boolean component5() {
        return this.isPrimaryColorRenderDarkText;
    }

    public final boolean component6() {
        return this.isSecondaryColorRenderDarkText;
    }

    public final boolean component7() {
        return this.isInboundMessages;
    }

    public final int component8() {
        return this.rateLimitCount;
    }

    public final long component9() {
        return this.rateLimitPeriodMs;
    }

    public final AppConfig copy(String str, int i10, int i11, int i12, boolean z10, boolean z11, boolean z12, int i13, long j10, long j11, long j12, long j13, boolean z13, boolean z14, String str2, String str3, boolean z15, boolean z16, String str4, Set<String> set, Set<String> set2, String str5, String str6, boolean z17, boolean z18, boolean z19, boolean z20, boolean z21, ConfigModules configModules2, NexusConfig nexusConfig, boolean z22, AttachmentSettings attachmentSettings2, boolean z23, boolean z24, ConversationStateSyncSettings conversationStateSyncSettings2) {
        String str7 = str;
        C6496s.h(str7, "name");
        C6496s.h(str2, "locale");
        C6496s.h(str3, "helpCenterLocale");
        C6496s.h(str4, "helpCenterUrl");
        C6496s.h(set, "helpCenterUrls");
        C6496s.h(set2, "features");
        C6496s.h(str5, "launcherLogoUrl");
        C6496s.h(str6, "teamGreeting");
        C6496s.h(nexusConfig, "realTimeConfig");
        C6496s.h(attachmentSettings2, "attachmentSettings");
        C6496s.h(conversationStateSyncSettings2, "conversationStateSyncSettings");
        return new AppConfig(str7, i10, i11, i12, z10, z11, z12, i13, j10, j11, j12, j13, z13, z14, str2, str3, z15, z16, str4, set, set2, str5, str6, z17, z18, z19, z20, z21, configModules2, nexusConfig, z22, attachmentSettings2, z23, z24, conversationStateSyncSettings2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AppConfig)) {
            return false;
        }
        AppConfig appConfig = (AppConfig) obj;
        return C6496s.c(this.name, appConfig.name) && this.primaryColor == appConfig.primaryColor && this.secondaryColor == appConfig.secondaryColor && this.secondaryColorDark == appConfig.secondaryColorDark && this.isPrimaryColorRenderDarkText == appConfig.isPrimaryColorRenderDarkText && this.isSecondaryColorRenderDarkText == appConfig.isSecondaryColorRenderDarkText && this.isInboundMessages == appConfig.isInboundMessages && this.rateLimitCount == appConfig.rateLimitCount && this.rateLimitPeriodMs == appConfig.rateLimitPeriodMs && this.userUpdateCacheMaxAgeMs == appConfig.userUpdateCacheMaxAgeMs && this.newSessionThresholdMs == appConfig.newSessionThresholdMs && this.softResetTimeoutMs == appConfig.softResetTimeoutMs && this.isMetricsEnabled == appConfig.isMetricsEnabled && this.isAudioEnabled == appConfig.isAudioEnabled && C6496s.c(this.locale, appConfig.locale) && C6496s.c(this.helpCenterLocale, appConfig.helpCenterLocale) && this.isReceivedFromServer == appConfig.isReceivedFromServer && this.isBackgroundRequestsEnabled == appConfig.isBackgroundRequestsEnabled && C6496s.c(this.helpCenterUrl, appConfig.helpCenterUrl) && C6496s.c(this.helpCenterUrls, appConfig.helpCenterUrls) && C6496s.c(this.features, appConfig.features) && C6496s.c(this.launcherLogoUrl, appConfig.launcherLogoUrl) && C6496s.c(this.teamGreeting, appConfig.teamGreeting) && this.isIdentityVerificationEnabled == appConfig.isIdentityVerificationEnabled && this.isAccessToTeammateEnabled == appConfig.isAccessToTeammateEnabled && this.isHelpCenterRequireSearchEnabled == appConfig.isHelpCenterRequireSearchEnabled && this.isPreventMultipleInboundConversationsEnabled == appConfig.isPreventMultipleInboundConversationsEnabled && this.hasOpenConversations == appConfig.hasOpenConversations && C6496s.c(this.configModules, appConfig.configModules) && C6496s.c(this.realTimeConfig, appConfig.realTimeConfig) && this.newPushUiDisabled == appConfig.newPushUiDisabled && C6496s.c(this.attachmentSettings, appConfig.attachmentSettings) && this.articleAutoReactionEnabled == appConfig.articleAutoReactionEnabled && this.finDictationUiEnabled == appConfig.finDictationUiEnabled && C6496s.c(this.conversationStateSyncSettings, appConfig.conversationStateSyncSettings);
    }

    public final boolean getArticleAutoReactionEnabled() {
        return this.articleAutoReactionEnabled;
    }

    public final AttachmentSettings getAttachmentSettings() {
        return this.attachmentSettings;
    }

    public final ConfigModules getConfigModules() {
        return this.configModules;
    }

    public final ConversationStateSyncSettings getConversationStateSyncSettings() {
        return this.conversationStateSyncSettings;
    }

    public final Set<String> getFeatures() {
        return this.features;
    }

    public final boolean getFinDictationUiEnabled() {
        return this.finDictationUiEnabled;
    }

    public final boolean getHasOpenConversations() {
        return this.hasOpenConversations;
    }

    public final String getHelpCenterLocale() {
        return this.helpCenterLocale;
    }

    public final String getHelpCenterUrl() {
        return this.helpCenterUrl;
    }

    public final Set<String> getHelpCenterUrls() {
        return this.helpCenterUrls;
    }

    public final String getLauncherLogoUrl() {
        return this.launcherLogoUrl;
    }

    public final String getLocale() {
        return this.locale;
    }

    public final String getName() {
        return this.name;
    }

    public final boolean getNewPushUiDisabled() {
        return this.newPushUiDisabled;
    }

    public final long getNewSessionThresholdMs() {
        return this.newSessionThresholdMs;
    }

    public final int getPrimaryColor() {
        return this.primaryColor;
    }

    public final int getRateLimitCount() {
        return this.rateLimitCount;
    }

    public final long getRateLimitPeriodMs() {
        return this.rateLimitPeriodMs;
    }

    public final NexusConfig getRealTimeConfig() {
        return this.realTimeConfig;
    }

    public final int getSecondaryColor() {
        return this.secondaryColor;
    }

    public final int getSecondaryColorDark() {
        return this.secondaryColorDark;
    }

    public final long getSoftResetTimeoutMs() {
        return this.softResetTimeoutMs;
    }

    public final String getSpaceLabelIfExists(Space.Type type) {
        HomeConfig home;
        OpenConfig openConfig;
        List<Space> spaces;
        Object obj;
        C6496s.h(type, "space");
        ConfigModules configModules2 = this.configModules;
        if (configModules2 == null || (home = configModules2.getHome()) == null || (openConfig = home.getOpenConfig()) == null || (spaces = openConfig.getSpaces()) == null) {
            return null;
        }
        Iterator it = spaces.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((Space) obj).getType() == type) {
                break;
            }
        }
        Space space = (Space) obj;
        if (space != null) {
            return space.getLabel();
        }
        return null;
    }

    public final String getTeamGreeting() {
        return this.teamGreeting;
    }

    public final long getUserUpdateCacheMaxAgeMs() {
        return this.userUpdateCacheMaxAgeMs;
    }

    public final boolean hasFeature(String str) {
        C6496s.h(str, "feature");
        return this.features.contains(str);
    }

    public int hashCode() {
        int hashCode = ((((((((((((((((((((((((((((((((((((((((((((((((((((((this.name.hashCode() * 31) + Integer.hashCode(this.primaryColor)) * 31) + Integer.hashCode(this.secondaryColor)) * 31) + Integer.hashCode(this.secondaryColorDark)) * 31) + Boolean.hashCode(this.isPrimaryColorRenderDarkText)) * 31) + Boolean.hashCode(this.isSecondaryColorRenderDarkText)) * 31) + Boolean.hashCode(this.isInboundMessages)) * 31) + Integer.hashCode(this.rateLimitCount)) * 31) + Long.hashCode(this.rateLimitPeriodMs)) * 31) + Long.hashCode(this.userUpdateCacheMaxAgeMs)) * 31) + Long.hashCode(this.newSessionThresholdMs)) * 31) + Long.hashCode(this.softResetTimeoutMs)) * 31) + Boolean.hashCode(this.isMetricsEnabled)) * 31) + Boolean.hashCode(this.isAudioEnabled)) * 31) + this.locale.hashCode()) * 31) + this.helpCenterLocale.hashCode()) * 31) + Boolean.hashCode(this.isReceivedFromServer)) * 31) + Boolean.hashCode(this.isBackgroundRequestsEnabled)) * 31) + this.helpCenterUrl.hashCode()) * 31) + this.helpCenterUrls.hashCode()) * 31) + this.features.hashCode()) * 31) + this.launcherLogoUrl.hashCode()) * 31) + this.teamGreeting.hashCode()) * 31) + Boolean.hashCode(this.isIdentityVerificationEnabled)) * 31) + Boolean.hashCode(this.isAccessToTeammateEnabled)) * 31) + Boolean.hashCode(this.isHelpCenterRequireSearchEnabled)) * 31) + Boolean.hashCode(this.isPreventMultipleInboundConversationsEnabled)) * 31) + Boolean.hashCode(this.hasOpenConversations)) * 31;
        ConfigModules configModules2 = this.configModules;
        return ((((((((((((hashCode + (configModules2 == null ? 0 : configModules2.hashCode())) * 31) + this.realTimeConfig.hashCode()) * 31) + Boolean.hashCode(this.newPushUiDisabled)) * 31) + this.attachmentSettings.hashCode()) * 31) + Boolean.hashCode(this.articleAutoReactionEnabled)) * 31) + Boolean.hashCode(this.finDictationUiEnabled)) * 31) + this.conversationStateSyncSettings.hashCode();
    }

    public final boolean isAccessToTeammateEnabled() {
        return this.isAccessToTeammateEnabled;
    }

    public final boolean isAudioEnabled() {
        return this.isAudioEnabled;
    }

    public final boolean isBackgroundRequestsDisabled() {
        return !this.isBackgroundRequestsEnabled;
    }

    public final boolean isBackgroundRequestsEnabled() {
        return this.isBackgroundRequestsEnabled;
    }

    public final boolean isHelpCenterRequireSearchEnabled() {
        return this.isHelpCenterRequireSearchEnabled;
    }

    public final boolean isIdentityVerificationEnabled() {
        return this.isIdentityVerificationEnabled;
    }

    public final boolean isInboundMessages() {
        return this.isInboundMessages;
    }

    public final boolean isMetricsEnabled() {
        return this.isMetricsEnabled;
    }

    public final boolean isPreventMultipleInboundConversationsEnabled() {
        return this.isPreventMultipleInboundConversationsEnabled;
    }

    public final boolean isPrimaryColorRenderDarkText() {
        return this.isPrimaryColorRenderDarkText;
    }

    public final boolean isReceivedFromServer() {
        return this.isReceivedFromServer;
    }

    public final boolean isSecondaryColorRenderDarkText() {
        return this.isSecondaryColorRenderDarkText;
    }

    public final boolean isSpaceEnabled(Space.Type type) {
        HomeConfig home;
        OpenConfig openConfig;
        List<Space> spaces;
        C6496s.h(type, "space");
        ConfigModules configModules2 = this.configModules;
        if (configModules2 == null || (home = configModules2.getHome()) == null || (openConfig = home.getOpenConfig()) == null || (spaces = openConfig.getSpaces()) == null) {
            return false;
        }
        Iterable<Space> iterable = spaces;
        if ((iterable instanceof Collection) && ((Collection) iterable).isEmpty()) {
            return false;
        }
        for (Space type2 : iterable) {
            if (type2.getType() == type) {
                return true;
            }
        }
        return false;
    }

    public String toString() {
        return "AppConfig(name=" + this.name + ", primaryColor=" + this.primaryColor + ", secondaryColor=" + this.secondaryColor + ", secondaryColorDark=" + this.secondaryColorDark + ", isPrimaryColorRenderDarkText=" + this.isPrimaryColorRenderDarkText + ", isSecondaryColorRenderDarkText=" + this.isSecondaryColorRenderDarkText + ", isInboundMessages=" + this.isInboundMessages + ", rateLimitCount=" + this.rateLimitCount + ", rateLimitPeriodMs=" + this.rateLimitPeriodMs + ", userUpdateCacheMaxAgeMs=" + this.userUpdateCacheMaxAgeMs + ", newSessionThresholdMs=" + this.newSessionThresholdMs + ", softResetTimeoutMs=" + this.softResetTimeoutMs + ", isMetricsEnabled=" + this.isMetricsEnabled + ", isAudioEnabled=" + this.isAudioEnabled + ", locale=" + this.locale + ", helpCenterLocale=" + this.helpCenterLocale + ", isReceivedFromServer=" + this.isReceivedFromServer + ", isBackgroundRequestsEnabled=" + this.isBackgroundRequestsEnabled + ", helpCenterUrl=" + this.helpCenterUrl + ", helpCenterUrls=" + this.helpCenterUrls + ", features=" + this.features + ", launcherLogoUrl=" + this.launcherLogoUrl + ", teamGreeting=" + this.teamGreeting + ", isIdentityVerificationEnabled=" + this.isIdentityVerificationEnabled + ", isAccessToTeammateEnabled=" + this.isAccessToTeammateEnabled + ", isHelpCenterRequireSearchEnabled=" + this.isHelpCenterRequireSearchEnabled + ", isPreventMultipleInboundConversationsEnabled=" + this.isPreventMultipleInboundConversationsEnabled + ", hasOpenConversations=" + this.hasOpenConversations + ", configModules=" + this.configModules + ", realTimeConfig=" + this.realTimeConfig + ", newPushUiDisabled=" + this.newPushUiDisabled + ", attachmentSettings=" + this.attachmentSettings + ", articleAutoReactionEnabled=" + this.articleAutoReactionEnabled + ", finDictationUiEnabled=" + this.finDictationUiEnabled + ", conversationStateSyncSettings=" + this.conversationStateSyncSettings + ')';
    }
}
