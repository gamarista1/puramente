package com.ReactNativeBlobUtil;

import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.revenuecat.purchases.subscriberattributes.SubscriberAttributeKt;
import java.util.Locale;

class b {

    /* renamed from: a  reason: collision with root package name */
    public Boolean f36626a;

    /* renamed from: b  reason: collision with root package name */
    public Boolean f36627b;

    /* renamed from: c  reason: collision with root package name */
    public String f36628c;

    /* renamed from: d  reason: collision with root package name */
    public String f36629d;

    /* renamed from: e  reason: collision with root package name */
    public ReadableMap f36630e;

    /* renamed from: f  reason: collision with root package name */
    public Boolean f36631f;

    /* renamed from: g  reason: collision with root package name */
    public Boolean f36632g;

    /* renamed from: h  reason: collision with root package name */
    public String f36633h;

    /* renamed from: i  reason: collision with root package name */
    public String f36634i;

    /* renamed from: j  reason: collision with root package name */
    public Boolean f36635j;

    /* renamed from: k  reason: collision with root package name */
    public Boolean f36636k;

    /* renamed from: l  reason: collision with root package name */
    public long f36637l = 60000;

    /* renamed from: m  reason: collision with root package name */
    public Boolean f36638m;

    /* renamed from: n  reason: collision with root package name */
    public Boolean f36639n;

    /* renamed from: o  reason: collision with root package name */
    public ReadableArray f36640o;

    b(ReadableMap readableMap) {
        boolean z10;
        boolean z11;
        String str;
        String str2;
        boolean z12;
        boolean z13;
        String str3;
        boolean z14;
        Boolean bool = Boolean.FALSE;
        this.f36632g = bool;
        Boolean bool2 = Boolean.TRUE;
        this.f36636k = bool2;
        this.f36638m = bool;
        this.f36639n = bool2;
        String str4 = null;
        this.f36640o = null;
        if (readableMap != null) {
            boolean z15 = true;
            if (!readableMap.hasKey("fileCache") || !readableMap.getBoolean("fileCache")) {
                z10 = false;
            } else {
                z10 = true;
            }
            this.f36626a = Boolean.valueOf(z10);
            if (readableMap.hasKey("transformFile")) {
                z11 = readableMap.getBoolean("transformFile");
            } else {
                z11 = false;
            }
            this.f36627b = Boolean.valueOf(z11);
            if (readableMap.hasKey("path")) {
                str = readableMap.getString("path");
            } else {
                str = null;
            }
            this.f36628c = str;
            if (readableMap.hasKey("appendExt")) {
                str2 = readableMap.getString("appendExt");
            } else {
                str2 = "";
            }
            this.f36629d = str2;
            if (!readableMap.hasKey("trusty") || !readableMap.getBoolean("trusty")) {
                z12 = false;
            } else {
                z12 = true;
            }
            this.f36631f = Boolean.valueOf(z12);
            if (!readableMap.hasKey("wifiOnly") || !readableMap.getBoolean("wifiOnly")) {
                z13 = false;
            } else {
                z13 = true;
            }
            this.f36632g = Boolean.valueOf(z13);
            if (readableMap.hasKey("addAndroidDownloads")) {
                this.f36630e = readableMap.getMap("addAndroidDownloads");
            }
            if (readableMap.hasKey("binaryContentTypes")) {
                this.f36640o = readableMap.getArray("binaryContentTypes");
            }
            String str5 = this.f36628c;
            if (str5 != null && str5.toLowerCase(Locale.ROOT).contains("?append=true")) {
                this.f36636k = bool;
            }
            if (readableMap.hasKey("overwrite")) {
                this.f36636k = Boolean.valueOf(readableMap.getBoolean("overwrite"));
            }
            if (readableMap.hasKey("followRedirect")) {
                this.f36639n = Boolean.valueOf(readableMap.getBoolean("followRedirect"));
            }
            if (readableMap.hasKey(SubscriberAttributeKt.JSON_NAME_KEY)) {
                str3 = readableMap.getString(SubscriberAttributeKt.JSON_NAME_KEY);
            } else {
                str3 = null;
            }
            this.f36633h = str3;
            this.f36634i = readableMap.hasKey("contentType") ? readableMap.getString("contentType") : str4;
            if (!readableMap.hasKey("increment") || !readableMap.getBoolean("increment")) {
                z14 = false;
            } else {
                z14 = true;
            }
            this.f36638m = Boolean.valueOf(z14);
            this.f36635j = Boolean.valueOf((!readableMap.hasKey("auto") || !readableMap.getBoolean("auto")) ? false : z15);
            if (readableMap.hasKey("timeout")) {
                this.f36637l = (long) readableMap.getInt("timeout");
            }
        }
    }
}
