package com.adjust.nativemodule;

import android.net.Uri;
import com.adjust.sdk.AdjustAttribution;
import com.adjust.sdk.AdjustEventFailure;
import com.adjust.sdk.AdjustEventSuccess;
import com.adjust.sdk.AdjustFactory;
import com.adjust.sdk.AdjustSessionFailure;
import com.adjust.sdk.AdjustSessionSuccess;
import com.adjust.sdk.Constants;
import com.adjust.sdk.ILogger;
import com.amazon.a.a.o.b;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableMapKeySetIterator;
import com.facebook.react.bridge.WritableMap;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import io.intercom.android.sdk.metrics.MetricTracker;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

abstract class a {

    /* renamed from: com.adjust.nativemodule.a$a  reason: collision with other inner class name */
    static /* synthetic */ class C0603a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f36797a;

        /* JADX WARNING: Can't wrap try/catch for region: R(14:0|1|2|3|4|5|6|7|8|9|10|11|12|14) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                com.facebook.react.bridge.ReadableType[] r0 = com.facebook.react.bridge.ReadableType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f36797a = r0
                com.facebook.react.bridge.ReadableType r1 = com.facebook.react.bridge.ReadableType.Null     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f36797a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.facebook.react.bridge.ReadableType r1 = com.facebook.react.bridge.ReadableType.Boolean     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f36797a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.facebook.react.bridge.ReadableType r1 = com.facebook.react.bridge.ReadableType.Number     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f36797a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.facebook.react.bridge.ReadableType r1 = com.facebook.react.bridge.ReadableType.String     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f36797a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.facebook.react.bridge.ReadableType r1 = com.facebook.react.bridge.ReadableType.Map     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f36797a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.facebook.react.bridge.ReadableType r1 = com.facebook.react.bridge.ReadableType.Array     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.adjust.nativemodule.a.C0603a.<clinit>():void");
        }
    }

    public static WritableMap a(AdjustAttribution adjustAttribution) {
        double d10;
        WritableMap createMap = Arguments.createMap();
        if (adjustAttribution == null) {
            return createMap;
        }
        String str = adjustAttribution.trackerToken;
        String str2 = "";
        if (str == null) {
            str = str2;
        }
        createMap.putString("trackerToken", str);
        String str3 = adjustAttribution.trackerName;
        if (str3 == null) {
            str3 = str2;
        }
        createMap.putString("trackerName", str3);
        String str4 = adjustAttribution.network;
        if (str4 == null) {
            str4 = str2;
        }
        createMap.putString("network", str4);
        String str5 = adjustAttribution.campaign;
        if (str5 == null) {
            str5 = str2;
        }
        createMap.putString("campaign", str5);
        String str6 = adjustAttribution.adgroup;
        if (str6 == null) {
            str6 = str2;
        }
        createMap.putString("adgroup", str6);
        String str7 = adjustAttribution.creative;
        if (str7 == null) {
            str7 = str2;
        }
        createMap.putString("creative", str7);
        String str8 = adjustAttribution.clickLabel;
        if (str8 == null) {
            str8 = str2;
        }
        createMap.putString("clickLabel", str8);
        String str9 = adjustAttribution.costType;
        if (str9 == null) {
            str9 = str2;
        }
        createMap.putString("costType", str9);
        Double d11 = adjustAttribution.costAmount;
        if (d11 == null || d11.isNaN()) {
            d10 = 0.0d;
        } else {
            d10 = adjustAttribution.costAmount.doubleValue();
        }
        createMap.putDouble("costAmount", d10);
        String str10 = adjustAttribution.costCurrency;
        if (str10 == null) {
            str10 = str2;
        }
        createMap.putString("costCurrency", str10);
        String str11 = adjustAttribution.fbInstallReferrer;
        if (str11 != null) {
            str2 = str11;
        }
        createMap.putString("fbInstallReferrer", str2);
        return createMap;
    }

    public static WritableMap b(Uri uri) {
        WritableMap createMap = Arguments.createMap();
        if (uri == null) {
            return createMap;
        }
        createMap.putString(Constants.DEEPLINK, uri.toString());
        return createMap;
    }

    public static WritableMap c(AdjustEventFailure adjustEventFailure) {
        String str;
        WritableMap createMap = Arguments.createMap();
        if (adjustEventFailure == null) {
            return createMap;
        }
        String str2 = adjustEventFailure.message;
        String str3 = "";
        if (str2 == null) {
            str2 = str3;
        }
        createMap.putString(MetricTracker.Object.MESSAGE, str2);
        String str4 = adjustEventFailure.timestamp;
        if (str4 == null) {
            str4 = str3;
        }
        createMap.putString(DiagnosticsEntry.TIMESTAMP_KEY, str4);
        String str5 = adjustEventFailure.adid;
        if (str5 == null) {
            str5 = str3;
        }
        createMap.putString("adid", str5);
        String str6 = adjustEventFailure.eventToken;
        if (str6 == null) {
            str6 = str3;
        }
        createMap.putString("eventToken", str6);
        String str7 = adjustEventFailure.callbackId;
        if (str7 == null) {
            str7 = str3;
        }
        createMap.putString("callbackId", str7);
        if (adjustEventFailure.willRetry) {
            str = b.f37475af;
        } else {
            str = b.f37476ag;
        }
        createMap.putString("willRetry", str);
        JSONObject jSONObject = adjustEventFailure.jsonResponse;
        if (jSONObject != null) {
            str3 = jSONObject.toString();
        }
        createMap.putString("jsonResponse", str3);
        return createMap;
    }

    public static WritableMap d(AdjustEventSuccess adjustEventSuccess) {
        WritableMap createMap = Arguments.createMap();
        if (adjustEventSuccess == null) {
            return createMap;
        }
        String str = adjustEventSuccess.message;
        String str2 = "";
        if (str == null) {
            str = str2;
        }
        createMap.putString(MetricTracker.Object.MESSAGE, str);
        String str3 = adjustEventSuccess.timestamp;
        if (str3 == null) {
            str3 = str2;
        }
        createMap.putString(DiagnosticsEntry.TIMESTAMP_KEY, str3);
        String str4 = adjustEventSuccess.adid;
        if (str4 == null) {
            str4 = str2;
        }
        createMap.putString("adid", str4);
        String str5 = adjustEventSuccess.eventToken;
        if (str5 == null) {
            str5 = str2;
        }
        createMap.putString("eventToken", str5);
        String str6 = adjustEventSuccess.callbackId;
        if (str6 == null) {
            str6 = str2;
        }
        createMap.putString("callbackId", str6);
        JSONObject jSONObject = adjustEventSuccess.jsonResponse;
        if (jSONObject != null) {
            str2 = jSONObject.toString();
        }
        createMap.putString("jsonResponse", str2);
        return createMap;
    }

    public static WritableMap e(AdjustSessionFailure adjustSessionFailure) {
        String str;
        WritableMap createMap = Arguments.createMap();
        if (adjustSessionFailure == null) {
            return createMap;
        }
        String str2 = adjustSessionFailure.message;
        String str3 = "";
        if (str2 == null) {
            str2 = str3;
        }
        createMap.putString(MetricTracker.Object.MESSAGE, str2);
        String str4 = adjustSessionFailure.timestamp;
        if (str4 == null) {
            str4 = str3;
        }
        createMap.putString(DiagnosticsEntry.TIMESTAMP_KEY, str4);
        String str5 = adjustSessionFailure.adid;
        if (str5 == null) {
            str5 = str3;
        }
        createMap.putString("adid", str5);
        if (adjustSessionFailure.willRetry) {
            str = b.f37475af;
        } else {
            str = b.f37476ag;
        }
        createMap.putString("willRetry", str);
        JSONObject jSONObject = adjustSessionFailure.jsonResponse;
        if (jSONObject != null) {
            str3 = jSONObject.toString();
        }
        createMap.putString("jsonResponse", str3);
        return createMap;
    }

    public static WritableMap f(AdjustSessionSuccess adjustSessionSuccess) {
        WritableMap createMap = Arguments.createMap();
        if (adjustSessionSuccess == null) {
            return createMap;
        }
        String str = adjustSessionSuccess.message;
        String str2 = "";
        if (str == null) {
            str = str2;
        }
        createMap.putString(MetricTracker.Object.MESSAGE, str);
        String str3 = adjustSessionSuccess.timestamp;
        if (str3 == null) {
            str3 = str2;
        }
        createMap.putString(DiagnosticsEntry.TIMESTAMP_KEY, str3);
        String str4 = adjustSessionSuccess.adid;
        if (str4 == null) {
            str4 = str2;
        }
        createMap.putString("adid", str4);
        JSONObject jSONObject = adjustSessionSuccess.jsonResponse;
        if (jSONObject != null) {
            str2 = jSONObject.toString();
        }
        createMap.putString("jsonResponse", str2);
        return createMap;
    }

    public static List g(ReadableArray readableArray) {
        if (readableArray == null) {
            return null;
        }
        List arrayList = new ArrayList(readableArray.size());
        for (int i10 = 0; i10 < readableArray.size(); i10++) {
            switch (C0603a.f36797a[readableArray.getType(i10).ordinal()]) {
                case 1:
                    arrayList.add((Object) null);
                    break;
                case 2:
                    arrayList.add(Boolean.valueOf(readableArray.getBoolean(i10)));
                    break;
                case 3:
                    double d10 = readableArray.getDouble(i10);
                    int i11 = (int) d10;
                    if (d10 != ((double) i11)) {
                        arrayList.add(Double.valueOf(d10));
                        break;
                    } else {
                        arrayList.add(Integer.valueOf(i11));
                        break;
                    }
                case 4:
                    arrayList.add(readableArray.getString(i10));
                    break;
                case 5:
                    arrayList.add(h(readableArray.getMap(i10)));
                    break;
                case 6:
                    arrayList = g(readableArray.getArray(i10));
                    break;
                default:
                    AdjustFactory.getLogger().error("Could not convert object with index: " + i10 + ".", new Object[0]);
                    break;
            }
        }
        return arrayList;
    }

    public static Map h(ReadableMap readableMap) {
        if (readableMap == null) {
            return null;
        }
        ReadableMapKeySetIterator keySetIterator = readableMap.keySetIterator();
        if (!keySetIterator.hasNextKey()) {
            return null;
        }
        HashMap hashMap = new HashMap();
        while (keySetIterator.hasNextKey()) {
            String nextKey = keySetIterator.nextKey();
            String obj = i(readableMap, nextKey).toString();
            if (obj == null) {
                ILogger logger = AdjustFactory.getLogger();
                logger.warn("Null parameter inside key-value pair with key: " + nextKey, new Object[0]);
            } else {
                hashMap.put(nextKey, obj);
            }
        }
        return hashMap;
    }

    private static Object i(ReadableMap readableMap, String str) {
        if (readableMap == null) {
            return null;
        }
        switch (C0603a.f36797a[readableMap.getType(str).ordinal()]) {
            case 1:
                return null;
            case 2:
                return Boolean.valueOf(readableMap.getBoolean(str));
            case 3:
                double d10 = readableMap.getDouble(str);
                int i10 = (int) d10;
                if (d10 == ((double) i10)) {
                    return Integer.valueOf(i10);
                }
                return Double.valueOf(d10);
            case 4:
                return readableMap.getString(str);
            case 5:
                return h(readableMap.getMap(str));
            case 6:
                return g(readableMap.getArray(str));
            default:
                ILogger logger = AdjustFactory.getLogger();
                logger.error("Could not convert object with key: " + str + ".", new Object[0]);
                return null;
        }
    }
}
