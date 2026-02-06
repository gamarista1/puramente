package com.adjust.sdk.network;

import android.content.Context;
import android.net.Uri;
import com.adjust.sdk.ActivityKind;
import com.adjust.sdk.ActivityPackage;
import com.adjust.sdk.AdjustFactory;
import com.adjust.sdk.AdjustSigner;
import com.adjust.sdk.Constants;
import com.adjust.sdk.ILogger;
import com.adjust.sdk.ResponseData;
import com.adjust.sdk.SharedPreferencesManager;
import com.adjust.sdk.TrackingState;
import com.adjust.sdk.Util;
import com.adjust.sdk.network.IActivityPackageSender;
import com.adjust.sdk.network.UtilNetworking;
import com.adjust.sdk.scheduler.SingleThreadCachedScheduler;
import com.adjust.sdk.scheduler.ThreadExecutor;
import com.amazon.a.a.o.b.f;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import io.intercom.android.sdk.metrics.MetricTracker;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.SocketTimeoutException;
import java.net.URL;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLHandshakeException;
import org.json.JSONException;
import org.json.JSONObject;

public class ActivityPackageSender implements IActivityPackageSender {
    private String basePath;
    private String clientSdk;
    private UtilNetworking.IConnectionOptions connectionOptions;
    private Context context;
    private ThreadExecutor executor = new SingleThreadCachedScheduler("ActivityPackageSender");
    private String gdprPath;
    private UtilNetworking.IHttpsURLConnectionProvider httpsURLConnectionProvider;
    private ILogger logger = AdjustFactory.getLogger();
    private String purchaseVerificationPath;
    private String subscriptionPath;
    private UrlStrategy urlStrategy;

    public class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ IActivityPackageSender.ResponseDataCallbackSubscriber f36975a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ ActivityPackage f36976b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ Map f36977c;

        public a(IActivityPackageSender.ResponseDataCallbackSubscriber responseDataCallbackSubscriber, ActivityPackage activityPackage, Map map) {
            this.f36975a = responseDataCallbackSubscriber;
            this.f36976b = activityPackage;
            this.f36977c = map;
        }

        public final void run() {
            this.f36975a.onResponseDataCallback(ActivityPackageSender.this.sendActivityPackageSync(this.f36976b, this.f36977c));
        }
    }

    public ActivityPackageSender(List<String> list, boolean z10, String str, String str2, String str3, String str4, String str5, Context context2) {
        this.basePath = str;
        this.gdprPath = str2;
        this.subscriptionPath = str3;
        this.purchaseVerificationPath = str4;
        this.clientSdk = str5;
        this.context = context2;
        this.urlStrategy = new UrlStrategy(AdjustFactory.getBaseUrl(), AdjustFactory.getGdprUrl(), AdjustFactory.getSubscriptionUrl(), AdjustFactory.getPurchaseVerificationUrl(), list, z10);
        this.httpsURLConnectionProvider = AdjustFactory.getHttpsURLConnectionProvider();
        this.connectionOptions = AdjustFactory.getConnectionOptions();
    }

    private DataOutputStream configConnectionForGET(HttpsURLConnection httpsURLConnection) {
        httpsURLConnection.setRequestMethod("GET");
        return null;
    }

    private DataOutputStream configConnectionForPOST(HttpsURLConnection httpsURLConnection, Map<String, String> map, Map<String, String> map2, Map<String, String> map3) {
        httpsURLConnection.setRequestMethod("POST");
        httpsURLConnection.setUseCaches(false);
        httpsURLConnection.setDoInput(true);
        httpsURLConnection.setDoOutput(true);
        String generatePOSTBodyString = generatePOSTBodyString(map, map2, map3);
        if (generatePOSTBodyString == null) {
            return null;
        }
        DataOutputStream dataOutputStream = new DataOutputStream(httpsURLConnection.getOutputStream());
        dataOutputStream.writeBytes(generatePOSTBodyString);
        return dataOutputStream;
    }

    private String errorMessage(Throwable th2, String str, ActivityPackage activityPackage) {
        return Util.formatString("%s. (%s)", activityPackage.getFailureMessage(), Util.getReasonString(str, th2));
    }

    private static String extractAuthorizationHeader(Map<String, String> map) {
        return map.remove("authorization");
    }

    private static String extractTargetUrl(Map<String, String> map, ActivityKind activityKind, UrlStrategy urlStrategy2) {
        String remove = map.remove("endpoint");
        return remove != null ? remove : urlStrategy2.targetUrlByActivityKind(activityKind);
    }

    private String generatePOSTBodyString(Map<String, String> map, Map<String, String> map2, Map<String, String> map3) {
        StringBuilder sb2 = new StringBuilder();
        if (map3 == null || map3.isEmpty()) {
            if (map != null && !map.isEmpty()) {
                injectParametersToPOSTStringBuilder(map, sb2);
            }
            if (map2 != null && !map2.isEmpty()) {
                injectParametersToPOSTStringBuilder(map2, sb2);
            }
        } else {
            injectParametersToPOSTStringBuilder(map3, sb2);
        }
        if (sb2.length() > 0 && sb2.charAt(sb2.length() - 1) == '&') {
            sb2.deleteCharAt(sb2.length() - 1);
        }
        return sb2.toString();
    }

    private String generateUrlStringForGET(ActivityKind activityKind, String str, Map<String, String> map, Map<String, String> map2, Map<String, String> map3) {
        URL url = new URL(urlWithExtraPathByActivityKind(activityKind, extractTargetUrl(map3, activityKind, this.urlStrategy)));
        Uri.Builder builder = new Uri.Builder();
        builder.scheme(url.getProtocol());
        builder.encodedAuthority(url.getAuthority());
        builder.path(url.getPath());
        builder.appendPath(str);
        this.logger.debug("Making request to url: %s", builder.toString());
        if (map3 == null || map3.isEmpty()) {
            if (map != null) {
                for (Map.Entry next : map.entrySet()) {
                    builder.appendQueryParameter((String) next.getKey(), (String) next.getValue());
                }
            }
            if (map2 != null) {
                for (Map.Entry next2 : map2.entrySet()) {
                    builder.appendQueryParameter((String) next2.getKey(), (String) next2.getValue());
                }
            }
        } else {
            for (Map.Entry next3 : map3.entrySet()) {
                builder.appendQueryParameter((String) next3.getKey(), (String) next3.getValue());
            }
        }
        return builder.build().toString();
    }

    private String generateUrlStringForPOST(ActivityKind activityKind, String str, Map<String, String> map) {
        String formatString = Util.formatString("%s%s", urlWithExtraPathByActivityKind(activityKind, extractTargetUrl(map, activityKind, this.urlStrategy)), str);
        this.logger.debug("Making request to url : %s", formatString);
        return formatString;
    }

    private void injectParametersToPOSTStringBuilder(Map<String, String> map, StringBuilder sb2) {
        if (map != null && !map.isEmpty()) {
            for (Map.Entry next : map.entrySet()) {
                String encode = URLEncoder.encode((String) next.getKey(), Constants.ENCODING);
                String str = (String) next.getValue();
                String encode2 = str != null ? URLEncoder.encode(str, Constants.ENCODING) : "";
                sb2.append(encode);
                sb2.append(f.f37530b);
                sb2.append(encode2);
                sb2.append("&");
            }
        }
    }

    private void localError(Throwable th2, String str, ResponseData responseData, int i10) {
        String errorMessage = errorMessage(th2, str, responseData.activityPackage);
        this.logger.error(errorMessage, new Object[0]);
        responseData.message = errorMessage;
        responseData.willRetry = false;
        responseData.activityPackage.addError(i10);
    }

    private void parseResponse(ResponseData responseData, String str) {
        JSONObject jSONObject;
        if (str.length() == 0) {
            this.logger.error("Empty response string", new Object[0]);
            return;
        }
        try {
            jSONObject = new JSONObject(str);
        } catch (JSONException e10) {
            this.logger.error(errorMessage(e10, "Failed to parse JSON response", responseData.activityPackage), new Object[0]);
            jSONObject = null;
        }
        if (jSONObject != null) {
            responseData.jsonResponse = jSONObject;
            responseData.message = UtilNetworking.extractJsonString(jSONObject, MetricTracker.Object.MESSAGE);
            responseData.adid = UtilNetworking.extractJsonString(jSONObject, "adid");
            responseData.timestamp = UtilNetworking.extractJsonString(jSONObject, DiagnosticsEntry.TIMESTAMP_KEY);
            String extractJsonString = UtilNetworking.extractJsonString(jSONObject, "tracking_state");
            if (extractJsonString != null && extractJsonString.equals("opted_out")) {
                responseData.trackingState = TrackingState.OPTED_OUT;
            }
            responseData.askIn = UtilNetworking.extractJsonLong(jSONObject, "ask_in");
            responseData.retryIn = UtilNetworking.extractJsonLong(jSONObject, "retry_in");
            responseData.continueIn = UtilNetworking.extractJsonLong(jSONObject, "continue_in");
            responseData.attribution = Util.attributionFromJson(jSONObject.optJSONObject("attribution"), Util.getSdkPrefixPlatform(this.clientSdk));
            responseData.resolvedDeeplink = UtilNetworking.extractJsonString(jSONObject, "resolved_click_url");
            responseData.controlParams = jSONObject.optJSONObject("control_params");
        }
    }

    private void remoteError(Throwable th2, String str, ResponseData responseData, Integer num) {
        String str2 = errorMessage(th2, str, responseData.activityPackage) + " Will retry later";
        this.logger.error(str2, new Object[0]);
        responseData.message = str2;
        responseData.willRetry = true;
        responseData.activityPackage.addError(num.intValue());
    }

    private boolean shouldRetryToSend(ResponseData responseData) {
        if (!responseData.willRetry) {
            this.logger.debug("Will not retry with current url strategy", new Object[0]);
            this.urlStrategy.resetAfterSuccess();
            return false;
        } else if (this.urlStrategy.shouldRetryAfterFailure(responseData.activityKind)) {
            this.logger.error("Failed with current url strategy, but it will retry with new", new Object[0]);
            return true;
        } else {
            this.logger.error("Failed with current url strategy and it will not retry", new Object[0]);
            return false;
        }
    }

    private Map<String, String> signParameters(ActivityPackage activityPackage, Map<String, String> map) {
        HashMap hashMap = new HashMap(activityPackage.getParameters());
        hashMap.putAll(map);
        HashMap hashMap2 = new HashMap();
        hashMap2.put("client_sdk", activityPackage.getClientSdk());
        hashMap2.put("activity_kind", activityPackage.getActivityKind().toString());
        hashMap2.put("endpoint", this.urlStrategy.targetUrlByActivityKind(activityPackage.getActivityKind()));
        JSONObject controlParamsJson = SharedPreferencesManager.getDefaultInstance(this.context).getControlParamsJson();
        if (controlParamsJson != null) {
            Iterator<String> keys = controlParamsJson.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                try {
                    if (controlParamsJson.get(next) instanceof String) {
                        hashMap2.put(next, (String) controlParamsJson.get(next));
                    }
                } catch (JSONException unused) {
                    this.logger.error("JSONException while iterating control params", new Object[0]);
                }
            }
        }
        return AdjustSigner.sign(hashMap, hashMap2, this.context, this.logger);
    }

    private void tryToGetResponse(ResponseData responseData) {
        DataOutputStream dataOutputStream = null;
        try {
            String extractAuthorizationHeader = extractAuthorizationHeader(responseData.signedParameters);
            this.logger.verbose("authorizationHeader: %s", extractAuthorizationHeader);
            boolean z10 = true;
            boolean z11 = responseData.activityPackage.getActivityKind() == ActivityKind.ATTRIBUTION;
            HttpsURLConnection generateHttpsURLConnection = this.httpsURLConnectionProvider.generateHttpsURLConnection(new URL(z11 ? generateUrlStringForGET(responseData.activityPackage.getActivityKind(), responseData.activityPackage.getPath(), responseData.activityPackage.getParameters(), responseData.sendingParameters, responseData.signedParameters) : generateUrlStringForPOST(responseData.activityPackage.getActivityKind(), responseData.activityPackage.getPath(), responseData.signedParameters)));
            this.connectionOptions.applyConnectionOptions(generateHttpsURLConnection, this.clientSdk);
            if (extractAuthorizationHeader != null) {
                generateHttpsURLConnection.setRequestProperty("Authorization", extractAuthorizationHeader);
            }
            DataOutputStream configConnectionForGET = z11 ? configConnectionForGET(generateHttpsURLConnection) : configConnectionForPOST(generateHttpsURLConnection, responseData.activityPackage.getParameters(), responseData.sendingParameters, responseData.signedParameters);
            Integer readConnectionResponse = readConnectionResponse(generateHttpsURLConnection, responseData);
            responseData.success = responseData.jsonResponse != null && responseData.retryIn == null && readConnectionResponse != null && readConnectionResponse.intValue() == 200;
            JSONObject jSONObject = responseData.jsonResponse;
            if (jSONObject != null) {
                if (responseData.retryIn == null) {
                    z10 = false;
                }
            }
            responseData.willRetry = z10;
            if (jSONObject == null) {
                responseData.activityPackage.addError(1000);
            } else if (responseData.retryIn != null) {
                responseData.activityPackage.addError(ErrorCodes.SERVER_RETRY_IN);
            }
            if (configConnectionForGET != null) {
                try {
                    configConnectionForGET.flush();
                    configConnectionForGET.close();
                } catch (IOException e10) {
                    this.logger.error(errorMessage(e10, "Flushing and closing connection output stream", responseData.activityPackage), new Object[0]);
                }
            }
        } catch (UnsupportedEncodingException e11) {
            localError(e11, "Failed to encode parameters", responseData, ErrorCodes.UNSUPPORTED_ENCODING_EXCEPTION);
            if (dataOutputStream != null) {
                try {
                    dataOutputStream.flush();
                    dataOutputStream.close();
                } catch (IOException e12) {
                    this.logger.error(errorMessage(e12, "Flushing and closing connection output stream", responseData.activityPackage), new Object[0]);
                }
            }
        } catch (MalformedURLException e13) {
            localError(e13, "Malformed URL", responseData, ErrorCodes.MALFORMED_URL_EXCEPTION);
            if (dataOutputStream != null) {
                try {
                    dataOutputStream.flush();
                    dataOutputStream.close();
                } catch (IOException e14) {
                    this.logger.error(errorMessage(e14, "Flushing and closing connection output stream", responseData.activityPackage), new Object[0]);
                }
            }
        } catch (ProtocolException e15) {
            localError(e15, "Protocol Error", responseData, ErrorCodes.PROTOCOL_EXCEPTION);
            if (dataOutputStream != null) {
                try {
                    dataOutputStream.flush();
                    dataOutputStream.close();
                } catch (IOException e16) {
                    this.logger.error(errorMessage(e16, "Flushing and closing connection output stream", responseData.activityPackage), new Object[0]);
                }
            }
        } catch (SocketTimeoutException e17) {
            remoteError(e17, "Request timed out", responseData, Integer.valueOf(ErrorCodes.SOCKET_TIMEOUT_EXCEPTION));
            if (dataOutputStream != null) {
                try {
                    dataOutputStream.flush();
                    dataOutputStream.close();
                } catch (IOException e18) {
                    this.logger.error(errorMessage(e18, "Flushing and closing connection output stream", responseData.activityPackage), new Object[0]);
                }
            }
        } catch (SSLHandshakeException e19) {
            remoteError(e19, "Certificate failed", responseData, Integer.valueOf(ErrorCodes.SSL_HANDSHAKE_EXCEPTION));
            if (dataOutputStream != null) {
                try {
                    dataOutputStream.flush();
                    dataOutputStream.close();
                } catch (IOException e20) {
                    this.logger.error(errorMessage(e20, "Flushing and closing connection output stream", responseData.activityPackage), new Object[0]);
                }
            }
        } catch (IOException e21) {
            remoteError(e21, "Request failed", responseData, Integer.valueOf(ErrorCodes.IO_EXCEPTION));
            if (dataOutputStream != null) {
                try {
                    dataOutputStream.flush();
                    dataOutputStream.close();
                } catch (IOException e22) {
                    this.logger.error(errorMessage(e22, "Flushing and closing connection output stream", responseData.activityPackage), new Object[0]);
                }
            }
        } catch (Throwable th2) {
            if (dataOutputStream != null) {
                try {
                    dataOutputStream.flush();
                    dataOutputStream.close();
                } catch (IOException e23) {
                    this.logger.error(errorMessage(e23, "Flushing and closing connection output stream", responseData.activityPackage), new Object[0]);
                }
            }
            throw th2;
        }
    }

    private String urlWithExtraPathByActivityKind(ActivityKind activityKind, String str) {
        if (activityKind == ActivityKind.GDPR) {
            if (this.gdprPath == null) {
                return str;
            }
            return str + this.gdprPath;
        } else if (activityKind == ActivityKind.SUBSCRIPTION) {
            if (this.subscriptionPath == null) {
                return str;
            }
            return str + this.subscriptionPath;
        } else if (activityKind == ActivityKind.PURCHASE_VERIFICATION) {
            if (this.purchaseVerificationPath == null) {
                return str;
            }
            return str + this.purchaseVerificationPath;
        } else if (this.basePath == null) {
            return str;
        } else {
            return str + this.basePath;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0047, code lost:
        if (r7 == null) goto L_0x004c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Integer readConnectionResponse(javax.net.ssl.HttpsURLConnection r7, com.adjust.sdk.ResponseData r8) {
        /*
            r6 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r1 = 0
            r2 = 0
            r7.connect()     // Catch:{ IOException -> 0x001e }
            int r3 = r7.getResponseCode()     // Catch:{ IOException -> 0x001e }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r3)     // Catch:{ IOException -> 0x001e }
            r4 = 400(0x190, float:5.6E-43)
            if (r3 < r4) goto L_0x0020
            java.io.InputStream r3 = r7.getErrorStream()     // Catch:{ IOException -> 0x001e }
            goto L_0x0024
        L_0x001b:
            r8 = move-exception
            goto L_0x00b2
        L_0x001e:
            r3 = move-exception
            goto L_0x0038
        L_0x0020:
            java.io.InputStream r3 = r7.getInputStream()     // Catch:{ IOException -> 0x001e }
        L_0x0024:
            java.io.InputStreamReader r4 = new java.io.InputStreamReader     // Catch:{ IOException -> 0x001e }
            r4.<init>(r3)     // Catch:{ IOException -> 0x001e }
            java.io.BufferedReader r3 = new java.io.BufferedReader     // Catch:{ IOException -> 0x001e }
            r3.<init>(r4)     // Catch:{ IOException -> 0x001e }
        L_0x002e:
            java.lang.String r4 = r3.readLine()     // Catch:{ IOException -> 0x001e }
            if (r4 == 0) goto L_0x0049
            r0.append(r4)     // Catch:{ IOException -> 0x001e }
            goto L_0x002e
        L_0x0038:
            java.lang.String r4 = "Connecting and reading response"
            com.adjust.sdk.ActivityPackage r5 = r8.activityPackage     // Catch:{ all -> 0x001b }
            java.lang.String r3 = r6.errorMessage(r3, r4, r5)     // Catch:{ all -> 0x001b }
            com.adjust.sdk.ILogger r4 = r6.logger     // Catch:{ all -> 0x001b }
            java.lang.Object[] r5 = new java.lang.Object[r1]     // Catch:{ all -> 0x001b }
            r4.error(r3, r5)     // Catch:{ all -> 0x001b }
            if (r7 == 0) goto L_0x004c
        L_0x0049:
            r7.disconnect()
        L_0x004c:
            int r7 = r0.length()
            if (r7 != 0) goto L_0x005c
            com.adjust.sdk.ILogger r7 = r6.logger
            java.lang.Object[] r8 = new java.lang.Object[r1]
            java.lang.String r0 = "Empty response string buffer"
            r7.error(r0, r8)
            return r2
        L_0x005c:
            int r7 = r2.intValue()
            r3 = 429(0x1ad, float:6.01E-43)
            if (r7 != r3) goto L_0x006e
            com.adjust.sdk.ILogger r7 = r6.logger
            java.lang.Object[] r8 = new java.lang.Object[r1]
            java.lang.String r0 = "Too frequent requests to the endpoint (429)"
            r7.error(r0, r8)
            return r2
        L_0x006e:
            java.lang.String r7 = r0.toString()
            com.adjust.sdk.ILogger r0 = r6.logger
            java.lang.Object[] r1 = new java.lang.Object[]{r7}
            java.lang.String r3 = "Response string: %s"
            r0.debug(r3, r1)
            r6.parseResponse(r8, r7)
            org.json.JSONObject r7 = r8.controlParams
            if (r7 == 0) goto L_0x008f
            android.content.Context r7 = r6.context
            com.adjust.sdk.SharedPreferencesManager r7 = com.adjust.sdk.SharedPreferencesManager.getDefaultInstance(r7)
            org.json.JSONObject r0 = r8.controlParams
            r7.saveControlParams(r0)
        L_0x008f:
            java.lang.String r7 = r8.message
            if (r7 != 0) goto L_0x0094
            return r2
        L_0x0094:
            int r8 = r2.intValue()
            r0 = 200(0xc8, float:2.8E-43)
            java.lang.String r1 = "Response message: %s"
            if (r8 != r0) goto L_0x00a8
            com.adjust.sdk.ILogger r8 = r6.logger
            java.lang.Object[] r7 = new java.lang.Object[]{r7}
            r8.info(r1, r7)
            goto L_0x00b1
        L_0x00a8:
            com.adjust.sdk.ILogger r8 = r6.logger
            java.lang.Object[] r7 = new java.lang.Object[]{r7}
            r8.error(r1, r7)
        L_0x00b1:
            return r2
        L_0x00b2:
            if (r7 == 0) goto L_0x00b7
            r7.disconnect()
        L_0x00b7:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.adjust.sdk.network.ActivityPackageSender.readConnectionResponse(javax.net.ssl.HttpsURLConnection, com.adjust.sdk.ResponseData):java.lang.Integer");
    }

    public void sendActivityPackage(ActivityPackage activityPackage, Map<String, String> map, IActivityPackageSender.ResponseDataCallbackSubscriber responseDataCallbackSubscriber) {
        this.executor.submit(new a(responseDataCallbackSubscriber, activityPackage, map));
    }

    public ResponseData sendActivityPackageSync(ActivityPackage activityPackage, Map<String, String> map) {
        ResponseData buildResponseData;
        do {
            buildResponseData = ResponseData.buildResponseData(activityPackage, map, signParameters(activityPackage, map));
            tryToGetResponse(buildResponseData);
        } while (shouldRetryToSend(buildResponseData));
        return buildResponseData;
    }
}
