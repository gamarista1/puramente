package io.intercom.android.sdk.metrics;

import Oc.c;
import io.intercom.android.sdk.utilities.commons.TimeProvider;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

public class MetricObject {
    static final String KEY_ACTION = "action";
    private static final String KEY_ANDROID_INSTALLER_PACKAGE_NAME = "android_installer_package_name";
    private static final String KEY_ANDROID_IS_DEBUG_BUILD = "android_is_debug_build";
    static final String KEY_APP_MIN_SDK_VERSION = "app_min_sdk_version";
    static final String KEY_APP_NAME = "app_name";
    static final String KEY_APP_VERSION = "app_version";
    static final String KEY_CONTEXT = "context";
    static final String KEY_CONVERSATION_SHOWN = "conversation_shown";
    static final String KEY_OBJECT = "object";
    static final String KEY_OWNER = "owner";
    static final String KEY_PLACE = "place";
    static final String KEY_SDK_VERSION = "sdk_version";
    static final String KEY_USER_ID = "user_id";
    @c("created_at")
    private final long createdAt;

    /* renamed from: id  reason: collision with root package name */
    private final String f70026id;
    private final Map<String, Object> metadata;
    private final String name;

    MetricObject(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, TimeProvider timeProvider, String str9, String str10, String str11, String str12) {
        HashMap hashMap = new HashMap();
        this.metadata = hashMap;
        this.name = str;
        this.createdAt = TimeUnit.MILLISECONDS.toSeconds(timeProvider.currentTimeMillis());
        this.f70026id = str3;
        String str13 = str5;
        hashMap.put(KEY_ACTION, str5);
        String str14 = str6;
        hashMap.put(KEY_OBJECT, str6);
        String str15 = str7;
        hashMap.put(KEY_PLACE, str7);
        String str16 = str8;
        hashMap.put(KEY_CONTEXT, str8);
        String str17 = str2;
        hashMap.put(KEY_OWNER, str2);
        hashMap.put(KEY_APP_MIN_SDK_VERSION, str11);
        hashMap.put(KEY_APP_NAME, str12);
        if (!str4.isEmpty()) {
            String str18 = str4;
            hashMap.put(KEY_USER_ID, str4);
        }
        hashMap.put(KEY_SDK_VERSION, str10);
        String str19 = str9;
        hashMap.put(KEY_APP_VERSION, str9);
    }

    /* access modifiers changed from: package-private */
    public MetricObject addInstallerPackageName(String str) {
        addMetaData(KEY_ANDROID_INSTALLER_PACKAGE_NAME, str);
        return this;
    }

    /* access modifiers changed from: package-private */
    public MetricObject addIsDebugBuild(boolean z10) {
        addMetaData(KEY_ANDROID_IS_DEBUG_BUILD, Boolean.valueOf(z10));
        return this;
    }

    /* access modifiers changed from: package-private */
    public MetricObject addMetaData(String str, Object obj) {
        this.metadata.put(str, obj);
        return this;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        MetricObject metricObject = (MetricObject) obj;
        if (this.createdAt != metricObject.createdAt || !this.metadata.equals(metricObject.metadata)) {
            return false;
        }
        String str = this.f70026id;
        String str2 = metricObject.f70026id;
        if (str != null) {
            return str.equals(str2);
        }
        if (str2 == null) {
            return true;
        }
        return false;
    }

    public long getCreatedAt() {
        return this.createdAt;
    }

    public String getId() {
        return this.f70026id;
    }

    public Map<String, Object> getMetadata() {
        return this.metadata;
    }

    public String getName() {
        return this.name;
    }

    public int hashCode() {
        int i10;
        int hashCode = this.metadata.hashCode() * 31;
        String str = this.f70026id;
        if (str != null) {
            i10 = str.hashCode();
        } else {
            i10 = 0;
        }
        long j10 = this.createdAt;
        return ((hashCode + i10) * 31) + ((int) (j10 ^ (j10 >>> 32)));
    }

    public String toString() {
        return "MetricObject{metadata=" + this.metadata + ", id='" + this.f70026id + '\'' + ", createdAt=" + this.createdAt + '}';
    }
}
