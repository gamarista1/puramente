package K3;

import J3.e;
import J3.f;
import K3.a;
import K3.l;
import android.content.pm.PackageInfo;
import android.os.Build;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public abstract class r {

    /* renamed from: A  reason: collision with root package name */
    public static final a.b f4028A = new a.b("WEB_MESSAGE_PORT_POST_MESSAGE", "WEB_MESSAGE_PORT_POST_MESSAGE");

    /* renamed from: B  reason: collision with root package name */
    public static final a.b f4029B = new a.b("WEB_MESSAGE_PORT_CLOSE", "WEB_MESSAGE_PORT_CLOSE");

    /* renamed from: C  reason: collision with root package name */
    public static final a.d f4030C = new a.d("WEB_MESSAGE_ARRAY_BUFFER", "WEB_MESSAGE_ARRAY_BUFFER");

    /* renamed from: D  reason: collision with root package name */
    public static final a.b f4031D = new a.b("WEB_MESSAGE_PORT_SET_MESSAGE_CALLBACK", "WEB_MESSAGE_PORT_SET_MESSAGE_CALLBACK");

    /* renamed from: E  reason: collision with root package name */
    public static final a.b f4032E = new a.b("CREATE_WEB_MESSAGE_CHANNEL", "CREATE_WEB_MESSAGE_CHANNEL");

    /* renamed from: F  reason: collision with root package name */
    public static final a.b f4033F = new a.b("POST_WEB_MESSAGE", "POST_WEB_MESSAGE");

    /* renamed from: G  reason: collision with root package name */
    public static final a.b f4034G = new a.b("WEB_MESSAGE_CALLBACK_ON_MESSAGE", "WEB_MESSAGE_CALLBACK_ON_MESSAGE");

    /* renamed from: H  reason: collision with root package name */
    public static final a.e f4035H = new a.e("GET_WEB_VIEW_CLIENT", "GET_WEB_VIEW_CLIENT");

    /* renamed from: I  reason: collision with root package name */
    public static final a.e f4036I = new a.e("GET_WEB_CHROME_CLIENT", "GET_WEB_CHROME_CLIENT");

    /* renamed from: J  reason: collision with root package name */
    public static final a.h f4037J = new a.h("GET_WEB_VIEW_RENDERER", "GET_WEB_VIEW_RENDERER");

    /* renamed from: K  reason: collision with root package name */
    public static final a.h f4038K = new a.h("WEB_VIEW_RENDERER_TERMINATE", "WEB_VIEW_RENDERER_TERMINATE");

    /* renamed from: L  reason: collision with root package name */
    public static final a.g f4039L = new a.g("TRACING_CONTROLLER_BASIC_USAGE", "TRACING_CONTROLLER_BASIC_USAGE");

    /* renamed from: M  reason: collision with root package name */
    public static final l.b f4040M = new l.b("STARTUP_FEATURE_SET_DATA_DIRECTORY_SUFFIX", "STARTUP_FEATURE_SET_DATA_DIRECTORY_SUFFIX");

    /* renamed from: N  reason: collision with root package name */
    public static final l.a f4041N = new l.a("STARTUP_FEATURE_SET_DIRECTORY_BASE_PATHS", "STARTUP_FEATURE_SET_DIRECTORY_BASE_PATH");

    /* renamed from: O  reason: collision with root package name */
    public static final l.a f4042O = new l.a("STARTUP_FEATURE_CONFIGURE_PARTITIONED_COOKIES", "STARTUP_FEATURE_CONFIGURE_PARTITIONED_COOKIES");

    /* renamed from: P  reason: collision with root package name */
    public static final a.h f4043P = new a.h("WEB_VIEW_RENDERER_CLIENT_BASIC_USAGE", "WEB_VIEW_RENDERER_CLIENT_BASIC_USAGE");

    /* renamed from: Q  reason: collision with root package name */
    public static final a.i f4044Q = new a("ALGORITHMIC_DARKENING", "ALGORITHMIC_DARKENING");

    /* renamed from: R  reason: collision with root package name */
    public static final a.d f4045R = new a.d("PROXY_OVERRIDE", "PROXY_OVERRIDE:3");

    /* renamed from: S  reason: collision with root package name */
    public static final a.d f4046S = new a.d("MULTI_PROCESS", "MULTI_PROCESS_QUERY");

    /* renamed from: T  reason: collision with root package name */
    public static final a.h f4047T = new a.h("FORCE_DARK", "FORCE_DARK");

    /* renamed from: U  reason: collision with root package name */
    public static final a.d f4048U = new a.d("FORCE_DARK_STRATEGY", "FORCE_DARK_BEHAVIOR");

    /* renamed from: V  reason: collision with root package name */
    public static final a.d f4049V = new a.d("WEB_MESSAGE_LISTENER", "WEB_MESSAGE_LISTENER");

    /* renamed from: W  reason: collision with root package name */
    public static final a.d f4050W = new a.d("DOCUMENT_START_SCRIPT", "DOCUMENT_START_SCRIPT:1");

    /* renamed from: X  reason: collision with root package name */
    public static final a.d f4051X = new a.d("PROXY_OVERRIDE_REVERSE_BYPASS", "PROXY_OVERRIDE_REVERSE_BYPASS");

    /* renamed from: Y  reason: collision with root package name */
    public static final a.d f4052Y = new a.d("GET_VARIATIONS_HEADER", "GET_VARIATIONS_HEADER");

    /* renamed from: Z  reason: collision with root package name */
    public static final a.d f4053Z = new a.d("ENTERPRISE_AUTHENTICATION_APP_LINK_POLICY", "ENTERPRISE_AUTHENTICATION_APP_LINK_POLICY");

    /* renamed from: a  reason: collision with root package name */
    public static final a.b f4054a = new a.b("VISUAL_STATE_CALLBACK", "VISUAL_STATE_CALLBACK");

    /* renamed from: a0  reason: collision with root package name */
    public static final a.d f4055a0 = new a.d("GET_COOKIE_INFO", "GET_COOKIE_INFO");

    /* renamed from: b  reason: collision with root package name */
    public static final a.b f4056b = new a.b("OFF_SCREEN_PRERASTER", "OFF_SCREEN_PRERASTER");

    /* renamed from: b0  reason: collision with root package name */
    public static final a.d f4057b0 = new a.d("REQUESTED_WITH_HEADER_ALLOW_LIST", "REQUESTED_WITH_HEADER_ALLOW_LIST");

    /* renamed from: c  reason: collision with root package name */
    public static final a.e f4058c = new a.e("SAFE_BROWSING_ENABLE", "SAFE_BROWSING_ENABLE");

    /* renamed from: c0  reason: collision with root package name */
    public static final a.d f4059c0 = new a.d("USER_AGENT_METADATA", "USER_AGENT_METADATA");

    /* renamed from: d  reason: collision with root package name */
    public static final a.c f4060d = new a.c("DISABLED_ACTION_MODE_MENU_ITEMS", "DISABLED_ACTION_MODE_MENU_ITEMS");

    /* renamed from: d0  reason: collision with root package name */
    public static final a.d f4061d0 = new b("MULTI_PROFILE", "MULTI_PROFILE");

    /* renamed from: e  reason: collision with root package name */
    public static final a.f f4062e = new a.f("START_SAFE_BROWSING", "START_SAFE_BROWSING");

    /* renamed from: e0  reason: collision with root package name */
    public static final a.d f4063e0 = new a.d("ATTRIBUTION_REGISTRATION_BEHAVIOR", "ATTRIBUTION_BEHAVIOR");

    /* renamed from: f  reason: collision with root package name */
    public static final a.f f4064f = new a.f("SAFE_BROWSING_WHITELIST", "SAFE_BROWSING_WHITELIST");

    /* renamed from: f0  reason: collision with root package name */
    public static final a.d f4065f0 = new a.d("WEBVIEW_MEDIA_INTEGRITY_API_STATUS", "WEBVIEW_INTEGRITY_API_STATUS");

    /* renamed from: g  reason: collision with root package name */
    public static final a.f f4066g = new a.f("SAFE_BROWSING_WHITELIST", "SAFE_BROWSING_ALLOWLIST");

    /* renamed from: g0  reason: collision with root package name */
    public static final a.d f4067g0 = new a.d("MUTE_AUDIO", "MUTE_AUDIO");

    /* renamed from: h  reason: collision with root package name */
    public static final a.f f4068h = new a.f("SAFE_BROWSING_ALLOWLIST", "SAFE_BROWSING_WHITELIST");

    /* renamed from: h0  reason: collision with root package name */
    public static final a.d f4069h0 = new a.d("WEB_AUTHENTICATION", "WEB_AUTHENTICATION");

    /* renamed from: i  reason: collision with root package name */
    public static final a.f f4070i = new a.f("SAFE_BROWSING_ALLOWLIST", "SAFE_BROWSING_ALLOWLIST");

    /* renamed from: i0  reason: collision with root package name */
    public static final a.d f4071i0 = new a.d("SPECULATIVE_LOADING_STATUS", "SPECULATIVE_LOADING");

    /* renamed from: j  reason: collision with root package name */
    public static final a.f f4072j = new a.f("SAFE_BROWSING_PRIVACY_POLICY_URL", "SAFE_BROWSING_PRIVACY_POLICY_URL");

    /* renamed from: j0  reason: collision with root package name */
    public static final a.d f4073j0 = new a.d("BACK_FORWARD_CACHE", "BACK_FORWARD_CACHE");

    /* renamed from: k  reason: collision with root package name */
    public static final a.c f4074k = new a.c("SERVICE_WORKER_BASIC_USAGE", "SERVICE_WORKER_BASIC_USAGE");

    /* renamed from: k0  reason: collision with root package name */
    public static final a.d f4075k0 = new a.d("DELETE_BROWSING_DATA", "WEB_STORAGE_DELETE_BROWSING_DATA");

    /* renamed from: l  reason: collision with root package name */
    public static final a.c f4076l = new a.c("SERVICE_WORKER_CACHE_MODE", "SERVICE_WORKER_CACHE_MODE");

    /* renamed from: l0  reason: collision with root package name */
    public static final a.d f4077l0 = new c("PREFETCH_URL_V4", "PREFETCH_URL_V4");

    /* renamed from: m  reason: collision with root package name */
    public static final a.c f4078m = new a.c("SERVICE_WORKER_CONTENT_ACCESS", "SERVICE_WORKER_CONTENT_ACCESS");

    /* renamed from: m0  reason: collision with root package name */
    public static final a.d f4079m0 = new a.d("IMPLEMENTATION_ONLY_FEATURE", "ASYNC_WEBVIEW_STARTUP");

    /* renamed from: n  reason: collision with root package name */
    public static final a.c f4080n = new a.c("SERVICE_WORKER_FILE_ACCESS", "SERVICE_WORKER_FILE_ACCESS");

    /* renamed from: n0  reason: collision with root package name */
    public static final a.d f4081n0 = new a.d("DEFAULT_TRAFFICSTATS_TAGGING", "DEFAULT_TRAFFICSTATS_TAGGING");

    /* renamed from: o  reason: collision with root package name */
    public static final a.c f4082o = new a.c("SERVICE_WORKER_BLOCK_NETWORK_LOADS", "SERVICE_WORKER_BLOCK_NETWORK_LOADS");

    /* renamed from: o0  reason: collision with root package name */
    public static final a.d f4083o0 = new a.d("PRERENDER_URL_V2", "PRERENDER_URL_V2");

    /* renamed from: p  reason: collision with root package name */
    public static final a.c f4084p = new a.c("SERVICE_WORKER_SHOULD_INTERCEPT_REQUEST", "SERVICE_WORKER_SHOULD_INTERCEPT_REQUEST");

    /* renamed from: p0  reason: collision with root package name */
    public static final a.d f4085p0 = new a.d("SPECULATIVE_LOADING_CONFIG_V2", "SPECULATIVE_LOADING_CONFIG_V2");

    /* renamed from: q  reason: collision with root package name */
    public static final a.b f4086q = new a.b("RECEIVE_WEB_RESOURCE_ERROR", "RECEIVE_WEB_RESOURCE_ERROR");

    /* renamed from: q0  reason: collision with root package name */
    public static final a.d f4087q0 = new a.d("SAVE_STATE", "SAVE_STATE");

    /* renamed from: r  reason: collision with root package name */
    public static final a.b f4088r = new a.b("RECEIVE_HTTP_ERROR", "RECEIVE_HTTP_ERROR");

    /* renamed from: r0  reason: collision with root package name */
    public static final a.d f4089r0 = new a.d("WEB_VIEW_NAVIGATION_CLIENT_BASIC_USAGE", "WEB_VIEW_NAVIGATION_CLIENT_BASIC_USAGE");

    /* renamed from: s  reason: collision with root package name */
    public static final a.c f4090s = new a.c("SHOULD_OVERRIDE_WITH_REDIRECTS", "SHOULD_OVERRIDE_WITH_REDIRECTS");

    /* renamed from: s0  reason: collision with root package name */
    public static final a.d f4091s0 = new a.d("CACHE_PROVIDER", "PROVIDER_WEAKLY_REF_WEBVIEW");

    /* renamed from: t  reason: collision with root package name */
    public static final a.f f4092t = new a.f("SAFE_BROWSING_HIT", "SAFE_BROWSING_HIT");

    /* renamed from: t0  reason: collision with root package name */
    public static final a.d f4093t0 = new a.d("PAYMENT_REQUEST", "PAYMENT_REQUEST");

    /* renamed from: u  reason: collision with root package name */
    public static final a.c f4094u = new a.c("WEB_RESOURCE_REQUEST_IS_REDIRECT", "WEB_RESOURCE_REQUEST_IS_REDIRECT");

    /* renamed from: u0  reason: collision with root package name */
    public static final a.d f4095u0 = new a.d("WEBVIEW_BUILDER", "WEBVIEW_BUILDER");

    /* renamed from: v  reason: collision with root package name */
    public static final a.b f4096v = new a.b("WEB_RESOURCE_ERROR_GET_DESCRIPTION", "WEB_RESOURCE_ERROR_GET_DESCRIPTION");

    /* renamed from: w  reason: collision with root package name */
    public static final a.b f4097w = new a.b("WEB_RESOURCE_ERROR_GET_CODE", "WEB_RESOURCE_ERROR_GET_CODE");

    /* renamed from: x  reason: collision with root package name */
    public static final a.f f4098x = new a.f("SAFE_BROWSING_RESPONSE_BACK_TO_SAFETY", "SAFE_BROWSING_RESPONSE_BACK_TO_SAFETY");

    /* renamed from: y  reason: collision with root package name */
    public static final a.f f4099y = new a.f("SAFE_BROWSING_RESPONSE_PROCEED", "SAFE_BROWSING_RESPONSE_PROCEED");

    /* renamed from: z  reason: collision with root package name */
    public static final a.f f4100z = new a.f("SAFE_BROWSING_RESPONSE_SHOW_INTERSTITIAL", "SAFE_BROWSING_RESPONSE_SHOW_INTERSTITIAL");

    class a extends a.i {

        /* renamed from: d  reason: collision with root package name */
        private final Pattern f4101d = Pattern.compile("\\A\\d+");

        a(String str, String str2) {
            super(str, str2);
        }

        public boolean d() {
            boolean d10 = super.d();
            if (!d10 || Build.VERSION.SDK_INT >= 29) {
                return d10;
            }
            PackageInfo c10 = e.c();
            if (c10 == null) {
                return false;
            }
            Matcher matcher = this.f4101d.matcher(c10.versionName);
            if (!matcher.find() || Integer.parseInt(c10.versionName.substring(matcher.start(), matcher.end())) < 105) {
                return false;
            }
            return true;
        }
    }

    class b extends a.d {
        b(String str, String str2) {
            super(str, str2);
        }

        public boolean d() {
            if (super.d() && f.a("MULTI_PROCESS")) {
                return e.g();
            }
            return false;
        }
    }

    class c extends a.d {
        c(String str, String str2) {
            super(str, str2);
        }

        public boolean d() {
            if (!f.a("MULTI_PROFILE")) {
                return false;
            }
            return super.d();
        }
    }

    public static UnsupportedOperationException a() {
        return new UnsupportedOperationException("This method is not supported by the current version of the framework and the current WebView APK");
    }

    public static boolean b(String str) {
        return c(str, a.e());
    }

    public static boolean c(String str, Collection collection) {
        HashSet<h> hashSet = new HashSet<>();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            h hVar = (h) it.next();
            if (hVar.b().equals(str)) {
                hashSet.add(hVar);
            }
        }
        if (!hashSet.isEmpty()) {
            for (h a10 : hashSet) {
                if (a10.a()) {
                    return true;
                }
            }
            return false;
        }
        throw new RuntimeException("Unknown feature " + str);
    }
}
