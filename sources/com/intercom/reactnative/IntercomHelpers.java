package com.intercom.reactnative;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableMapKeySetIterator;
import com.facebook.react.bridge.ReadableType;
import com.facebook.react.bridge.WritableMap;
import io.intercom.android.sdk.Company;
import io.intercom.android.sdk.Intercom;
import io.intercom.android.sdk.UserAttributes;
import io.intercom.android.sdk.identity.Registration;
import io.intercom.android.sdk.models.AttributeType;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class IntercomHelpers {

    /* renamed from: com.intercom.reactnative.IntercomHelpers$1  reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$facebook$react$bridge$ReadableType;

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
                $SwitchMap$com$facebook$react$bridge$ReadableType = r0
                com.facebook.react.bridge.ReadableType r1 = com.facebook.react.bridge.ReadableType.Null     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = $SwitchMap$com$facebook$react$bridge$ReadableType     // Catch:{ NoSuchFieldError -> 0x001d }
                com.facebook.react.bridge.ReadableType r1 = com.facebook.react.bridge.ReadableType.Boolean     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = $SwitchMap$com$facebook$react$bridge$ReadableType     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.facebook.react.bridge.ReadableType r1 = com.facebook.react.bridge.ReadableType.Number     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = $SwitchMap$com$facebook$react$bridge$ReadableType     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.facebook.react.bridge.ReadableType r1 = com.facebook.react.bridge.ReadableType.String     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = $SwitchMap$com$facebook$react$bridge$ReadableType     // Catch:{ NoSuchFieldError -> 0x003e }
                com.facebook.react.bridge.ReadableType r1 = com.facebook.react.bridge.ReadableType.Map     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = $SwitchMap$com$facebook$react$bridge$ReadableType     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.facebook.react.bridge.ReadableType r1 = com.facebook.react.bridge.ReadableType.Array     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.intercom.reactnative.IntercomHelpers.AnonymousClass1.<clinit>():void");
        }
    }

    public static Company buildCompany(ReadableMap readableMap) {
        if (!readableMap.hasKey("id")) {
            return null;
        }
        Company.Builder builder = new Company.Builder();
        builder.withCompanyId(readableMap.getString("id"));
        if (readableMap.hasKey("name")) {
            builder.withName(readableMap.getString("name"));
        }
        if (readableMap.hasKey("plan")) {
            builder.withPlan(readableMap.getString("plan"));
        }
        if (readableMap.hasKey("monthlySpend")) {
            builder.withMonthlySpend(Integer.valueOf(readableMap.getInt("monthlySpend")));
        }
        if (readableMap.hasKey("createdAt")) {
            builder.withCreatedAt(Long.valueOf((long) readableMap.getInt("createdAt")));
        }
        if (readableMap.hasKey("customAttributes")) {
            builder.withCustomAttributes(deconstructReadableMap(readableMap.getMap("customAttributes"), Boolean.FALSE));
        }
        return builder.build();
    }

    public static UserAttributes buildUserAttributes(ReadableMap readableMap) {
        UserAttributes.Builder builder = new UserAttributes.Builder();
        ReadableMapKeySetIterator keySetIterator = readableMap.keySetIterator();
        while (keySetIterator.hasNextKey()) {
            String nextKey = keySetIterator.nextKey();
            nextKey.hashCode();
            char c10 = 65535;
            switch (nextKey.hashCode()) {
                case -1412832805:
                    if (nextKey.equals("companies")) {
                        c10 = 0;
                        break;
                    }
                    break;
                case -1335915340:
                    if (nextKey.equals("unsubscribedFromEmails")) {
                        c10 = 1;
                        break;
                    }
                    break;
                case -979840662:
                    if (nextKey.equals("signedUpAt")) {
                        c10 = 2;
                        break;
                    }
                    break;
                case -836030906:
                    if (nextKey.equals("userId")) {
                        c10 = 3;
                        break;
                    }
                    break;
                case 3373707:
                    if (nextKey.equals("name")) {
                        c10 = 4;
                        break;
                    }
                    break;
                case 96619420:
                    if (nextKey.equals("email")) {
                        c10 = 5;
                        break;
                    }
                    break;
                case 106642798:
                    if (nextKey.equals(AttributeType.PHONE)) {
                        c10 = 6;
                        break;
                    }
                    break;
                case 344406852:
                    if (nextKey.equals("languageOverride")) {
                        c10 = 7;
                        break;
                    }
                    break;
                case 555169704:
                    if (nextKey.equals("customAttributes")) {
                        c10 = 8;
                        break;
                    }
                    break;
            }
            switch (c10) {
                case 0:
                    ReadableArray array = readableMap.getArray(nextKey);
                    for (int i10 = 0; i10 < array.size(); i10++) {
                        Company buildCompany = buildCompany(array.getMap(i10));
                        if (buildCompany != null) {
                            builder.withCompany(buildCompany);
                        }
                    }
                    break;
                case 1:
                    builder.withUnsubscribedFromEmails(Boolean.valueOf(readableMap.getBoolean(nextKey)));
                    break;
                case 2:
                    builder.withSignedUpAt(parseDateFromTimestamp(Integer.valueOf(readableMap.getInt(nextKey))));
                    break;
                case 3:
                    builder.withUserId(readableMap.getString(nextKey));
                    break;
                case 4:
                    builder.withName(readableMap.getString(nextKey));
                    break;
                case 5:
                    builder.withEmail(readableMap.getString(nextKey));
                    break;
                case 6:
                    builder.withPhone(readableMap.getString(nextKey));
                    break;
                case 7:
                    builder.withLanguageOverride(readableMap.getString(nextKey));
                    break;
                case 8:
                    if (readableMap.getType(nextKey) != ReadableType.Map) {
                        break;
                    } else {
                        builder.withCustomAttributes(deconstructReadableMap(readableMap.getMap(nextKey), Boolean.FALSE));
                        break;
                    }
            }
        }
        return builder.build();
    }

    public static Map<String, Object> deconstructReadableMap(ReadableMap readableMap, Boolean bool) {
        ReadableMapKeySetIterator keySetIterator = readableMap.keySetIterator();
        HashMap hashMap = new HashMap();
        while (keySetIterator.hasNextKey()) {
            String nextKey = keySetIterator.nextKey();
            switch (AnonymousClass1.$SwitchMap$com$facebook$react$bridge$ReadableType[readableMap.getType(nextKey).ordinal()]) {
                case 1:
                    hashMap.put(nextKey, (Object) null);
                    break;
                case 2:
                    hashMap.put(nextKey, Boolean.valueOf(readableMap.getBoolean(nextKey)));
                    break;
                case 3:
                    hashMap.put(nextKey, Double.valueOf(readableMap.getDouble(nextKey)));
                    break;
                case 4:
                    hashMap.put(nextKey, readableMap.getString(nextKey));
                    break;
                case 5:
                    if (!bool.booleanValue()) {
                        break;
                    } else {
                        hashMap.put(nextKey, deconstructReadableMap(readableMap.getMap(nextKey), Boolean.TRUE));
                        break;
                    }
                case 6:
                    if (!bool.booleanValue()) {
                        break;
                    } else {
                        hashMap.put(nextKey, recursivelyDeconstructReadableArray(readableMap.getArray(nextKey)));
                        break;
                    }
                default:
                    throw new IllegalArgumentException("Could not convert object with key: " + nextKey + ".");
            }
        }
        return hashMap;
    }

    public static WritableMap deconstructRegistration(Registration registration) {
        WritableMap createMap = Arguments.createMap();
        if (registration.getEmail() != null) {
            createMap.putString("email", registration.getEmail());
        }
        if (registration.getUserId() != null) {
            createMap.putString("userId", registration.getUserId());
        }
        return createMap;
    }

    public static String getValueAsStringForKey(ReadableMap readableMap, String str) {
        int i10 = AnonymousClass1.$SwitchMap$com$facebook$react$bridge$ReadableType[readableMap.getType(str).ordinal()];
        if (i10 == 3) {
            return String.valueOf(readableMap.getInt(str));
        }
        if (i10 == 4) {
            return readableMap.getString(str);
        }
        throw new IllegalArgumentException("Value for Key: \"" + str + "\" should be a String");
    }

    public static Date parseDateFromTimestamp(Number number) {
        return new Date(number.longValue() * 1000);
    }

    public static List<String> readableArrayToStringList(ReadableArray readableArray) {
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < readableArray.size(); i10++) {
            if (AnonymousClass1.$SwitchMap$com$facebook$react$bridge$ReadableType[readableArray.getType(i10).ordinal()] == 4) {
                arrayList.add(i10, readableArray.getString(i10));
            }
        }
        return arrayList;
    }

    public static List<Object> recursivelyDeconstructReadableArray(ReadableArray readableArray) {
        ArrayList arrayList = new ArrayList(readableArray.size());
        for (int i10 = 0; i10 < readableArray.size(); i10++) {
            switch (AnonymousClass1.$SwitchMap$com$facebook$react$bridge$ReadableType[readableArray.getType(i10).ordinal()]) {
                case 1:
                    arrayList.add(i10, (Object) null);
                    break;
                case 2:
                    arrayList.add(i10, Boolean.valueOf(readableArray.getBoolean(i10)));
                    break;
                case 3:
                    arrayList.add(i10, Double.valueOf(readableArray.getDouble(i10)));
                    break;
                case 4:
                    arrayList.add(i10, readableArray.getString(i10));
                    break;
                case 5:
                    arrayList.add(i10, deconstructReadableMap(readableArray.getMap(i10), Boolean.TRUE));
                    break;
                case 6:
                    arrayList.add(i10, recursivelyDeconstructReadableArray(readableArray.getArray(i10)));
                    break;
                default:
                    throw new IllegalArgumentException("Could not convert object at index " + i10 + ".");
            }
        }
        return arrayList;
    }

    public static int stringToLogLevel(String str) {
        str.hashCode();
        char c10 = 65535;
        switch (str.hashCode()) {
            case 2251950:
                if (str.equals("INFO")) {
                    c10 = 0;
                    break;
                }
                break;
            case 2656902:
                if (str.equals("WARN")) {
                    c10 = 1;
                    break;
                }
                break;
            case 64921139:
                if (str.equals("DEBUG")) {
                    c10 = 2;
                    break;
                }
                break;
            case 66247144:
                if (str.equals("ERROR")) {
                    c10 = 3;
                    break;
                }
                break;
            case 1069090146:
                if (str.equals("VERBOSE")) {
                    c10 = 4;
                    break;
                }
                break;
            case 1940088646:
                if (str.equals("ASSERT")) {
                    c10 = 5;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                return 4;
            case 1:
                return 5;
            case 2:
                return 3;
            case 3:
                return 6;
            case 4:
                return 2;
            case 5:
                return 7;
            default:
                return 8;
        }
    }

    public static Intercom.Visibility stringToVisibility(String str) {
        if (str.equalsIgnoreCase("VISIBLE")) {
            return Intercom.Visibility.VISIBLE;
        }
        return Intercom.Visibility.GONE;
    }
}
