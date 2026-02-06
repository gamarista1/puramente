package com.revenuecat.purchases.common;

import Sg.p;
import Tg.a;
import android.os.Build;
import com.amazon.a.a.o.b;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import com.revenuecat.purchases.Store;
import com.revenuecat.purchases.VerificationResult;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsTracker;
import com.revenuecat.purchases.common.networking.ETagManager;
import com.revenuecat.purchases.common.networking.Endpoint;
import com.revenuecat.purchases.common.networking.HTTPRequest;
import com.revenuecat.purchases.common.networking.HTTPResult;
import com.revenuecat.purchases.common.networking.MapConverter;
import com.revenuecat.purchases.common.networking.RCHTTPStatusCodes;
import com.revenuecat.purchases.common.verification.SigningManager;
import com.revenuecat.purchases.interfaces.StorefrontProvider;
import com.revenuecat.purchases.strings.NetworkStrings;
import com.revenuecat.purchases.utils.MapExtensionsKt;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lf.C6502A;
import mf.O;
import org.json.JSONObject;
import wf.t;

@Metadata(d1 = {"\u0000´\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0017\b\u0000\u0018\u0000 b2\u00020\u0001:\u0001bBO\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u0017\u001a\u00020\u001b2\u0006\u0010\u001a\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\u0017\u0010\u001cJ\u0017\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u0019\u0010\"\u001a\u0004\u0018\u00010\u00142\u0006\u0010!\u001a\u00020 H\u0002¢\u0006\u0004\b\"\u0010#J\u001f\u0010'\u001a\u00020&2\u0006\u0010$\u001a\u00020\u001b2\u0006\u0010%\u001a\u00020\u001dH\u0002¢\u0006\u0004\b'\u0010(Jq\u00105\u001a\u0004\u0018\u0001042\u0006\u0010*\u001a\u00020)2\u0006\u0010,\u001a\u00020+2\u0016\u0010%\u001a\u0012\u0012\u0004\u0012\u00020\u001d\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010-2\u001a\u00100\u001a\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u001d0/\u0018\u00010.2\u0012\u00101\u001a\u000e\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u001d0-2\u0006\u00103\u001a\u000202H\u0002¢\u0006\u0004\b5\u00106J1\u0010;\u001a\u00020&2\u0006\u0010,\u001a\u00020+2\u0006\u00108\u001a\u0002072\u0006\u00109\u001a\u0002022\b\u0010:\u001a\u0004\u0018\u000104H\u0002¢\u0006\u0004\b;\u0010<J[\u0010B\u001a\u000e\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u001d0-2\u0012\u0010=\u001a\u000e\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u001d0-2\u0006\u0010>\u001a\u00020\u001d2\u0006\u00103\u001a\u0002022\b\u0010?\u001a\u0004\u0018\u00010\u001d2\u0006\u0010@\u001a\u0002022\b\u0010A\u001a\u0004\u0018\u00010\u001dH\u0002¢\u0006\u0004\bB\u0010CJ\u0017\u0010F\u001a\u00020 2\u0006\u0010E\u001a\u00020DH\u0002¢\u0006\u0004\bF\u0010GJ\u000f\u0010H\u001a\u00020\u001dH\u0002¢\u0006\u0004\bH\u0010IJ=\u0010M\u001a\u00020L2\u0006\u0010>\u001a\u00020\u001d2\u0006\u0010!\u001a\u00020J2\b\u0010K\u001a\u0004\u0018\u00010\u001d2\b\u0010?\u001a\u0004\u0018\u00010\u001d2\b\u0010A\u001a\u0004\u0018\u00010\u001dH\u0002¢\u0006\u0004\bM\u0010NJ\u001f\u0010P\u001a\n O*\u0004\u0018\u00010\u001d0\u001d2\u0006\u0010!\u001a\u00020JH\u0002¢\u0006\u0004\bP\u0010QJ\u0019\u0010R\u001a\u0004\u0018\u00010\u001d2\u0006\u0010!\u001a\u00020JH\u0002¢\u0006\u0004\bR\u0010QJ\u0019\u0010S\u001a\u0004\u0018\u0001072\u0006\u0010!\u001a\u00020JH\u0002¢\u0006\u0004\bS\u0010TJo\u0010U\u001a\u0002042\u0006\u0010*\u001a\u00020)2\u0006\u0010,\u001a\u00020+2\u0016\u0010%\u001a\u0012\u0012\u0004\u0012\u00020\u001d\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010-2\u001a\u00100\u001a\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u001d0/\u0018\u00010.2\u0012\u00101\u001a\u000e\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u001d0-2\b\b\u0002\u00103\u001a\u000202¢\u0006\u0004\bU\u00106J\r\u0010V\u001a\u00020&¢\u0006\u0004\bV\u0010WR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010XR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010YR\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010ZR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010[\u001a\u0004\b\\\u0010]R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010^R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0004¢\u0006\u0006\n\u0004\b\r\u0010_R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010`R\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010a¨\u0006c"}, d2 = {"Lcom/revenuecat/purchases/common/HTTPClient;", "", "Lcom/revenuecat/purchases/common/AppConfig;", "appConfig", "Lcom/revenuecat/purchases/common/networking/ETagManager;", "eTagManager", "Lcom/revenuecat/purchases/common/diagnostics/DiagnosticsTracker;", "diagnosticsTrackerIfEnabled", "Lcom/revenuecat/purchases/common/verification/SigningManager;", "signingManager", "Lcom/revenuecat/purchases/interfaces/StorefrontProvider;", "storefrontProvider", "Lcom/revenuecat/purchases/common/DateProvider;", "dateProvider", "Lcom/revenuecat/purchases/common/networking/MapConverter;", "mapConverter", "Lcom/revenuecat/purchases/common/LocaleProvider;", "localeProvider", "<init>", "(Lcom/revenuecat/purchases/common/AppConfig;Lcom/revenuecat/purchases/common/networking/ETagManager;Lcom/revenuecat/purchases/common/diagnostics/DiagnosticsTracker;Lcom/revenuecat/purchases/common/verification/SigningManager;Lcom/revenuecat/purchases/interfaces/StorefrontProvider;Lcom/revenuecat/purchases/common/DateProvider;Lcom/revenuecat/purchases/common/networking/MapConverter;Lcom/revenuecat/purchases/common/LocaleProvider;)V", "Ljava/io/InputStream;", "inputStream", "Ljava/io/BufferedReader;", "buffer", "(Ljava/io/InputStream;)Ljava/io/BufferedReader;", "Ljava/io/OutputStream;", "outputStream", "Ljava/io/BufferedWriter;", "(Ljava/io/OutputStream;)Ljava/io/BufferedWriter;", "", "readFully", "(Ljava/io/InputStream;)Ljava/lang/String;", "Ljava/net/HttpURLConnection;", "connection", "getInputStream", "(Ljava/net/HttpURLConnection;)Ljava/io/InputStream;", "writer", "body", "Llf/M;", "writeFully", "(Ljava/io/BufferedWriter;Ljava/lang/String;)V", "Ljava/net/URL;", "baseURL", "Lcom/revenuecat/purchases/common/networking/Endpoint;", "endpoint", "", "", "Lkotlin/Pair;", "postFieldsToSign", "requestHeaders", "", "refreshETag", "Lcom/revenuecat/purchases/common/networking/HTTPResult;", "performCall", "(Ljava/net/URL;Lcom/revenuecat/purchases/common/networking/Endpoint;Ljava/util/Map;Ljava/util/List;Ljava/util/Map;Z)Lcom/revenuecat/purchases/common/networking/HTTPResult;", "Ljava/util/Date;", "requestStartTime", "callSuccessful", "callResult", "trackHttpRequestPerformedIfNeeded", "(Lcom/revenuecat/purchases/common/networking/Endpoint;Ljava/util/Date;ZLcom/revenuecat/purchases/common/networking/HTTPResult;)V", "authenticationHeaders", "urlPath", "nonce", "shouldSignResponse", "postFieldsToSignHeader", "getHeaders", "(Ljava/util/Map;Ljava/lang/String;ZLjava/lang/String;ZLjava/lang/String;)Ljava/util/Map;", "Lcom/revenuecat/purchases/common/networking/HTTPRequest;", "request", "getConnection", "(Lcom/revenuecat/purchases/common/networking/HTTPRequest;)Ljava/net/HttpURLConnection;", "getXPlatformHeader", "()Ljava/lang/String;", "Ljava/net/URLConnection;", "payload", "Lcom/revenuecat/purchases/VerificationResult;", "verifyResponse", "(Ljava/lang/String;Ljava/net/URLConnection;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/revenuecat/purchases/VerificationResult;", "kotlin.jvm.PlatformType", "getETagHeader", "(Ljava/net/URLConnection;)Ljava/lang/String;", "getRequestTimeHeader", "getRequestDateHeader", "(Ljava/net/URLConnection;)Ljava/util/Date;", "performRequest", "clearCaches", "()V", "Lcom/revenuecat/purchases/common/AppConfig;", "Lcom/revenuecat/purchases/common/networking/ETagManager;", "Lcom/revenuecat/purchases/common/diagnostics/DiagnosticsTracker;", "Lcom/revenuecat/purchases/common/verification/SigningManager;", "getSigningManager", "()Lcom/revenuecat/purchases/common/verification/SigningManager;", "Lcom/revenuecat/purchases/interfaces/StorefrontProvider;", "Lcom/revenuecat/purchases/common/DateProvider;", "Lcom/revenuecat/purchases/common/networking/MapConverter;", "Lcom/revenuecat/purchases/common/LocaleProvider;", "Companion", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class HTTPClient {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    public static final int NO_STATUS_CODE = -1;
    private final AppConfig appConfig;
    private final DateProvider dateProvider;
    private final DiagnosticsTracker diagnosticsTrackerIfEnabled;
    private final ETagManager eTagManager;
    private final LocaleProvider localeProvider;
    private final MapConverter mapConverter;
    private final SigningManager signingManager;
    private final StorefrontProvider storefrontProvider;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/revenuecat/purchases/common/HTTPClient$Companion;", "", "()V", "NO_STATUS_CODE", "", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Store.values().length];
            try {
                iArr[Store.AMAZON.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public HTTPClient(AppConfig appConfig2, ETagManager eTagManager2, DiagnosticsTracker diagnosticsTracker, SigningManager signingManager2, StorefrontProvider storefrontProvider2, DateProvider dateProvider2, MapConverter mapConverter2, LocaleProvider localeProvider2) {
        C6496s.h(appConfig2, "appConfig");
        C6496s.h(eTagManager2, "eTagManager");
        C6496s.h(signingManager2, "signingManager");
        C6496s.h(storefrontProvider2, "storefrontProvider");
        C6496s.h(dateProvider2, "dateProvider");
        C6496s.h(mapConverter2, "mapConverter");
        C6496s.h(localeProvider2, "localeProvider");
        this.appConfig = appConfig2;
        this.eTagManager = eTagManager2;
        this.diagnosticsTrackerIfEnabled = diagnosticsTracker;
        this.signingManager = signingManager2;
        this.storefrontProvider = storefrontProvider2;
        this.dateProvider = dateProvider2;
        this.mapConverter = mapConverter2;
        this.localeProvider = localeProvider2;
    }

    private final BufferedReader buffer(InputStream inputStream) {
        return new BufferedReader(new InputStreamReader(inputStream));
    }

    private final HttpURLConnection getConnection(HTTPRequest hTTPRequest) {
        URLConnection uRLConnection = (URLConnection) FirebasePerfUrlConnection.instrument(hTTPRequest.getFullURL().openConnection());
        C6496s.f(uRLConnection, "null cannot be cast to non-null type java.net.HttpURLConnection");
        HttpURLConnection httpURLConnection = (HttpURLConnection) uRLConnection;
        for (Map.Entry next : hTTPRequest.getHeaders().entrySet()) {
            httpURLConnection.addRequestProperty((String) next.getKey(), (String) next.getValue());
        }
        JSONObject body = hTTPRequest.getBody();
        if (body != null) {
            httpURLConnection.setDoOutput(true);
            httpURLConnection.setRequestMethod("POST");
            OutputStream outputStream = httpURLConnection.getOutputStream();
            C6496s.g(outputStream, "os");
            BufferedWriter buffer = buffer(outputStream);
            String jSONObject = body.toString();
            C6496s.g(jSONObject, "body.toString()");
            writeFully(buffer, jSONObject);
        }
        return httpURLConnection;
    }

    private final String getETagHeader(URLConnection uRLConnection) {
        return uRLConnection.getHeaderField("X-RevenueCat-ETag");
    }

    private final Map<String, String> getHeaders(Map<String, String> map, String str, boolean z10, String str2, boolean z11, String str3) {
        Object obj;
        Pair a10 = C6502A.a("Content-Type", "application/json");
        Pair a11 = C6502A.a("X-Platform", getXPlatformHeader());
        Pair a12 = C6502A.a("X-Platform-Flavor", this.appConfig.getPlatformInfo().getFlavor());
        Pair a13 = C6502A.a("X-Platform-Flavor-Version", this.appConfig.getPlatformInfo().getVersion());
        Pair a14 = C6502A.a("X-Platform-Version", String.valueOf(Build.VERSION.SDK_INT));
        Pair a15 = C6502A.a("X-Platform-Device", Build.MODEL);
        Pair a16 = C6502A.a("X-Platform-Brand", Build.BRAND);
        Pair a17 = C6502A.a("X-Version", "8.12.2");
        Pair a18 = C6502A.a("X-Preferred-Locales", this.localeProvider.getCurrentLocalesLanguageTags());
        Pair a19 = C6502A.a("X-Client-Locale", this.appConfig.getLanguageTag());
        Pair a20 = C6502A.a("X-Client-Version", this.appConfig.getVersionName());
        Pair a21 = C6502A.a("X-Client-Bundle-ID", this.appConfig.getPackageName());
        Pair a22 = C6502A.a("X-Observer-Mode-Enabled", this.appConfig.getFinishTransactions() ? b.f37476ag : b.f37475af);
        Object obj2 = b.f37475af;
        Pair a23 = C6502A.a("X-Nonce", str2);
        Pair a24 = C6502A.a(HTTPRequest.POST_PARAMS_HASH, str3);
        if (this.appConfig.getCustomEntitlementComputation()) {
            obj = obj2;
        } else {
            obj = null;
        }
        return MapExtensionsKt.filterNotNullValues(O.p(O.p(O.l(a10, a11, a12, a13, a14, a15, a16, a17, a18, a19, a20, a21, a22, a23, a24, C6502A.a("X-Custom-Entitlements-Computation", obj), C6502A.a("X-Storefront", this.storefrontProvider.getStorefront()), C6502A.a("X-Is-Debug-Build", String.valueOf(this.appConfig.isDebugBuild()))), map), this.eTagManager.getETagHeaders$purchases_defaultsRelease(str, z11, z10)));
    }

    private final InputStream getInputStream(HttpURLConnection httpURLConnection) {
        boolean z10;
        try {
            return httpURLConnection.getInputStream();
        } catch (Exception e10) {
            if (e10 instanceof IllegalArgumentException) {
                z10 = true;
            } else {
                z10 = e10 instanceof IOException;
            }
            if (z10) {
                LogIntent logIntent = LogIntent.WARNING;
                String format = String.format(NetworkStrings.PROBLEM_CONNECTING, Arrays.copyOf(new Object[]{e10.getMessage()}, 1));
                C6496s.g(format, "format(this, *args)");
                LogWrapperKt.log(logIntent, format);
                return httpURLConnection.getErrorStream();
            }
            throw e10;
        }
    }

    private final Date getRequestDateHeader(URLConnection uRLConnection) {
        String requestTimeHeader = getRequestTimeHeader(uRLConnection);
        if (requestTimeHeader != null) {
            return new Date(Long.parseLong(requestTimeHeader));
        }
        return null;
    }

    private final String getRequestTimeHeader(URLConnection uRLConnection) {
        String headerField = uRLConnection.getHeaderField(HTTPResult.REQUEST_TIME_HEADER_NAME);
        if (headerField == null || p.d0(headerField)) {
            return null;
        }
        return headerField;
    }

    private final String getXPlatformHeader() {
        if (WhenMappings.$EnumSwitchMapping$0[this.appConfig.getStore().ordinal()] == 1) {
            return "amazon";
        }
        return "android";
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x009f A[Catch:{ all -> 0x00a4 }] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00a9  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00ce  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0113  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final com.revenuecat.purchases.common.networking.HTTPResult performCall(java.net.URL r22, com.revenuecat.purchases.common.networking.Endpoint r23, java.util.Map<java.lang.String, ? extends java.lang.Object> r24, java.util.List<kotlin.Pair<java.lang.String, java.lang.String>> r25, java.util.Map<java.lang.String, java.lang.String> r26, boolean r27) {
        /*
            r21 = this;
            r8 = r21
            r0 = r23
            r1 = r24
            r2 = r25
            java.lang.String r9 = "format(this, *args)"
            r10 = 0
            if (r1 == 0) goto L_0x0015
            com.revenuecat.purchases.common.networking.MapConverter r3 = r8.mapConverter
            org.json.JSONObject r1 = r3.convertToJSON$purchases_defaultsRelease(r1)
            r11 = r1
            goto L_0x0016
        L_0x0015:
            r11 = r10
        L_0x0016:
            java.lang.String r12 = r23.getPath()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = "/v1"
            r1.append(r3)
            r1.append(r12)
            java.lang.String r15 = r1.toString()
            com.revenuecat.purchases.common.verification.SigningManager r1 = r8.signingManager
            boolean r13 = r1.shouldVerifyEndpoint(r0)
            if (r13 == 0) goto L_0x003b
            boolean r1 = r23.getNeedsNonceToPerformSigning()
            if (r1 == 0) goto L_0x003b
            r1 = 1
            goto L_0x003c
        L_0x003b:
            r1 = 0
        L_0x003c:
            java.net.URL r14 = new java.net.URL     // Catch:{ MalformedURLException -> 0x004e }
            r3 = r22
            r14.<init>(r3, r15)     // Catch:{ MalformedURLException -> 0x004e }
            if (r1 == 0) goto L_0x0051
            com.revenuecat.purchases.common.verification.SigningManager r1 = r8.signingManager     // Catch:{ MalformedURLException -> 0x004e }
            java.lang.String r1 = r1.createRandomNonce()     // Catch:{ MalformedURLException -> 0x004e }
            r16 = r1
            goto L_0x0053
        L_0x004e:
            r0 = move-exception
            goto L_0x0124
        L_0x0051:
            r16 = r10
        L_0x0053:
            if (r2 == 0) goto L_0x0063
            if (r13 == 0) goto L_0x0059
            r1 = r2
            goto L_0x005a
        L_0x0059:
            r1 = r10
        L_0x005a:
            if (r1 == 0) goto L_0x0063
            com.revenuecat.purchases.common.verification.SigningManager r1 = r8.signingManager     // Catch:{ MalformedURLException -> 0x004e }
            java.lang.String r0 = r1.getPostParamsForSigningHeaderIfNeeded(r0, r2)     // Catch:{ MalformedURLException -> 0x004e }
            goto L_0x0064
        L_0x0063:
            r0 = r10
        L_0x0064:
            r1 = r21
            r2 = r26
            r3 = r15
            r4 = r27
            r5 = r16
            r6 = r13
            r7 = r0
            java.util.Map r1 = r1.getHeaders(r2, r3, r4, r5, r6, r7)     // Catch:{ MalformedURLException -> 0x004e }
            com.revenuecat.purchases.common.networking.HTTPRequest r2 = new com.revenuecat.purchases.common.networking.HTTPRequest     // Catch:{ MalformedURLException -> 0x004e }
            r2.<init>(r14, r1, r11)     // Catch:{ MalformedURLException -> 0x004e }
            java.net.HttpURLConnection r7 = r8.getConnection(r2)     // Catch:{ MalformedURLException -> 0x004e }
            java.io.InputStream r1 = r8.getInputStream(r7)
            java.lang.String r2 = "API request started: %s %s"
            java.lang.String r3 = r7.getRequestMethod()     // Catch:{ all -> 0x00a4 }
            java.lang.Object[] r3 = new java.lang.Object[]{r3, r12}     // Catch:{ all -> 0x00a4 }
            r4 = 2
            java.lang.Object[] r3 = java.util.Arrays.copyOf(r3, r4)     // Catch:{ all -> 0x00a4 }
            java.lang.String r2 = java.lang.String.format(r2, r3)     // Catch:{ all -> 0x00a4 }
            kotlin.jvm.internal.C6496s.g(r2, r9)     // Catch:{ all -> 0x00a4 }
            com.revenuecat.purchases.common.LogUtilsKt.debugLog(r2)     // Catch:{ all -> 0x00a4 }
            int r14 = r7.getResponseCode()     // Catch:{ all -> 0x00a4 }
            if (r1 == 0) goto L_0x00a7
            java.lang.String r10 = r8.readFully(r1)     // Catch:{ all -> 0x00a4 }
            goto L_0x00a7
        L_0x00a4:
            r0 = move-exception
            goto L_0x011b
        L_0x00a7:
            if (r1 == 0) goto L_0x00ac
            r1.close()
        L_0x00ac:
            r7.disconnect()
            java.lang.String r1 = r7.getRequestMethod()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r14)
            java.lang.Object[] r1 = new java.lang.Object[]{r1, r12, r2}
            r2 = 3
            java.lang.Object[] r1 = java.util.Arrays.copyOf(r1, r2)
            java.lang.String r2 = "API request completed with status: %s %s %s"
            java.lang.String r1 = java.lang.String.format(r2, r1)
            kotlin.jvm.internal.C6496s.g(r1, r9)
            com.revenuecat.purchases.common.LogUtilsKt.debugLog(r1)
            if (r10 == 0) goto L_0x0113
            if (r13 == 0) goto L_0x00e5
            com.revenuecat.purchases.common.networking.RCHTTPStatusCodes r1 = com.revenuecat.purchases.common.networking.RCHTTPStatusCodes.INSTANCE
            boolean r1 = r1.isSuccessful(r14)
            if (r1 == 0) goto L_0x00e5
            r1 = r21
            r2 = r15
            r3 = r7
            r4 = r10
            r5 = r16
            r6 = r0
            com.revenuecat.purchases.VerificationResult r0 = r1.verifyResponse(r2, r3, r4, r5, r6)
            goto L_0x00e7
        L_0x00e5:
            com.revenuecat.purchases.VerificationResult r0 = com.revenuecat.purchases.VerificationResult.NOT_REQUESTED
        L_0x00e7:
            com.revenuecat.purchases.VerificationResult r1 = com.revenuecat.purchases.VerificationResult.FAILED
            if (r0 != r1) goto L_0x00fc
            com.revenuecat.purchases.common.verification.SigningManager r1 = r8.signingManager
            com.revenuecat.purchases.common.verification.SignatureVerificationMode r1 = r1.getSignatureVerificationMode()
            boolean r1 = r1 instanceof com.revenuecat.purchases.common.verification.SignatureVerificationMode.Enforced
            if (r1 != 0) goto L_0x00f6
            goto L_0x00fc
        L_0x00f6:
            com.revenuecat.purchases.common.verification.SignatureVerificationException r0 = new com.revenuecat.purchases.common.verification.SignatureVerificationException
            r0.<init>(r12)
            throw r0
        L_0x00fc:
            com.revenuecat.purchases.common.networking.ETagManager r13 = r8.eTagManager
            java.lang.String r16 = r8.getETagHeader(r7)
            java.util.Date r19 = r8.getRequestDateHeader(r7)
            r1 = r15
            r15 = r10
            r17 = r1
            r18 = r27
            r20 = r0
            com.revenuecat.purchases.common.networking.HTTPResult r0 = r13.getHTTPResultFromCacheOrBackend$purchases_defaultsRelease(r14, r15, r16, r17, r18, r19, r20)
            return r0
        L_0x0113:
            java.io.IOException r0 = new java.io.IOException
            java.lang.String r1 = "HTTP Response payload is null"
            r0.<init>(r1)
            throw r0
        L_0x011b:
            if (r1 == 0) goto L_0x0120
            r1.close()
        L_0x0120:
            r7.disconnect()
            throw r0
        L_0x0124:
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revenuecat.purchases.common.HTTPClient.performCall(java.net.URL, com.revenuecat.purchases.common.networking.Endpoint, java.util.Map, java.util.List, java.util.Map, boolean):com.revenuecat.purchases.common.networking.HTTPResult");
    }

    public static /* synthetic */ HTTPResult performRequest$default(HTTPClient hTTPClient, URL url, Endpoint endpoint, Map map, List list, Map map2, boolean z10, int i10, Object obj) {
        if ((i10 & 32) != 0) {
            z10 = false;
        }
        return hTTPClient.performRequest(url, endpoint, map, list, map2, z10);
    }

    private final String readFully(InputStream inputStream) {
        return t.d(buffer(inputStream));
    }

    private final void trackHttpRequestPerformedIfNeeded(Endpoint endpoint, Date date, boolean z10, HTTPResult hTTPResult) {
        int i10;
        HTTPResult.Origin origin;
        VerificationResult verificationResult;
        boolean z11;
        DiagnosticsTracker diagnosticsTracker = this.diagnosticsTrackerIfEnabled;
        if (diagnosticsTracker != null) {
            long between = DurationExtensionsKt.between(a.f65168b, date, this.dateProvider.getNow());
            if (!z10) {
                i10 = -1;
            } else if (hTTPResult != null) {
                i10 = hTTPResult.getResponseCode();
            } else {
                i10 = RCHTTPStatusCodes.NOT_MODIFIED;
            }
            int i11 = i10;
            Integer num = null;
            if (hTTPResult != null) {
                origin = hTTPResult.getOrigin();
            } else {
                origin = null;
            }
            if (hTTPResult == null || (verificationResult = hTTPResult.getVerificationResult()) == null) {
                verificationResult = VerificationResult.NOT_REQUESTED;
            }
            VerificationResult verificationResult2 = verificationResult;
            if (!z10 || !RCHTTPStatusCodes.INSTANCE.isSuccessful(i11)) {
                z11 = false;
            } else {
                z11 = true;
            }
            boolean z12 = z11;
            if (hTTPResult != null) {
                num = hTTPResult.getBackendErrorCode();
            }
            diagnosticsTracker.m57trackHttpRequestPerformednRVORKE(endpoint, between, z12, i11, num, origin, verificationResult2);
        }
    }

    private final VerificationResult verifyResponse(String str, URLConnection uRLConnection, String str2, String str3, String str4) {
        return this.signingManager.verifyResponse(str, uRLConnection.getHeaderField(HTTPResult.SIGNATURE_HEADER_NAME), str3, str2, getRequestTimeHeader(uRLConnection), getETagHeader(uRLConnection), str4);
    }

    private final void writeFully(BufferedWriter bufferedWriter, String str) {
        bufferedWriter.write(str);
        bufferedWriter.flush();
    }

    public final void clearCaches() {
        this.eTagManager.clearCaches$purchases_defaultsRelease();
    }

    public final SigningManager getSigningManager() {
        return this.signingManager;
    }

    public final HTTPResult performRequest(URL url, Endpoint endpoint, Map<String, ? extends Object> map, List<Pair<String, String>> list, Map<String, String> map2, boolean z10) {
        C6496s.h(url, "baseURL");
        C6496s.h(endpoint, "endpoint");
        C6496s.h(map2, "requestHeaders");
        if (this.appConfig.getForceServerErrors()) {
            LogUtilsKt.warnLog("Forcing server error for request to " + endpoint.getPath());
            return new HTTPResult(500, "", HTTPResult.Origin.BACKEND, (Date) null, VerificationResult.NOT_REQUESTED);
        }
        Date now = this.dateProvider.getNow();
        try {
            HTTPResult performCall = performCall(url, endpoint, map, list, map2, z10);
            trackHttpRequestPerformedIfNeeded(endpoint, now, true, performCall);
            if (performCall != null) {
                return performCall;
            }
            LogWrapperKt.log(LogIntent.WARNING, NetworkStrings.ETAG_RETRYING_CALL);
            return performRequest(url, endpoint, map, list, map2, true);
        } catch (Throwable th2) {
            trackHttpRequestPerformedIfNeeded(endpoint, now, false, (HTTPResult) null);
            throw th2;
        }
    }

    private final BufferedWriter buffer(OutputStream outputStream) {
        return new BufferedWriter(new OutputStreamWriter(outputStream));
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ HTTPClient(com.revenuecat.purchases.common.AppConfig r12, com.revenuecat.purchases.common.networking.ETagManager r13, com.revenuecat.purchases.common.diagnostics.DiagnosticsTracker r14, com.revenuecat.purchases.common.verification.SigningManager r15, com.revenuecat.purchases.interfaces.StorefrontProvider r16, com.revenuecat.purchases.common.DateProvider r17, com.revenuecat.purchases.common.networking.MapConverter r18, com.revenuecat.purchases.common.LocaleProvider r19, int r20, kotlin.jvm.internal.DefaultConstructorMarker r21) {
        /*
            r11 = this;
            r0 = r20
            r1 = r0 & 32
            if (r1 == 0) goto L_0x000d
            com.revenuecat.purchases.common.DefaultDateProvider r1 = new com.revenuecat.purchases.common.DefaultDateProvider
            r1.<init>()
            r8 = r1
            goto L_0x000f
        L_0x000d:
            r8 = r17
        L_0x000f:
            r1 = r0 & 64
            if (r1 == 0) goto L_0x001a
            com.revenuecat.purchases.common.networking.MapConverter r1 = new com.revenuecat.purchases.common.networking.MapConverter
            r1.<init>()
            r9 = r1
            goto L_0x001c
        L_0x001a:
            r9 = r18
        L_0x001c:
            r0 = r0 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x0027
            com.revenuecat.purchases.common.DefaultLocaleProvider r0 = new com.revenuecat.purchases.common.DefaultLocaleProvider
            r0.<init>()
            r10 = r0
            goto L_0x0029
        L_0x0027:
            r10 = r19
        L_0x0029:
            r2 = r11
            r3 = r12
            r4 = r13
            r5 = r14
            r6 = r15
            r7 = r16
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revenuecat.purchases.common.HTTPClient.<init>(com.revenuecat.purchases.common.AppConfig, com.revenuecat.purchases.common.networking.ETagManager, com.revenuecat.purchases.common.diagnostics.DiagnosticsTracker, com.revenuecat.purchases.common.verification.SigningManager, com.revenuecat.purchases.interfaces.StorefrontProvider, com.revenuecat.purchases.common.DateProvider, com.revenuecat.purchases.common.networking.MapConverter, com.revenuecat.purchases.common.LocaleProvider, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
