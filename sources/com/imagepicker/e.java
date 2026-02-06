package com.imagepicker;

import android.text.TextUtils;
import com.adjust.sdk.Constants;
import com.facebook.react.bridge.ReadableMap;

public class e {

    /* renamed from: a  reason: collision with root package name */
    int f59113a;

    /* renamed from: b  reason: collision with root package name */
    Boolean f59114b;

    /* renamed from: c  reason: collision with root package name */
    Boolean f59115c;

    /* renamed from: d  reason: collision with root package name */
    int f59116d = 1;

    /* renamed from: e  reason: collision with root package name */
    int f59117e;

    /* renamed from: f  reason: collision with root package name */
    int f59118f;

    /* renamed from: g  reason: collision with root package name */
    int f59119g;

    /* renamed from: h  reason: collision with root package name */
    Boolean f59120h;

    /* renamed from: i  reason: collision with root package name */
    int f59121i;

    /* renamed from: j  reason: collision with root package name */
    Boolean f59122j = Boolean.FALSE;

    /* renamed from: k  reason: collision with root package name */
    String f59123k;

    e(ReadableMap readableMap) {
        this.f59123k = readableMap.getString("mediaType");
        this.f59113a = readableMap.getInt("selectionLimit");
        this.f59114b = Boolean.valueOf(readableMap.getBoolean("includeBase64"));
        this.f59115c = Boolean.valueOf(readableMap.getBoolean("includeExtra"));
        String string = readableMap.getString("videoQuality");
        if (!TextUtils.isEmpty(string) && !string.toLowerCase().equals(Constants.HIGH)) {
            this.f59116d = 0;
        }
        if (readableMap.getString("cameraType").equals("front")) {
            this.f59122j = Boolean.TRUE;
        }
        this.f59117e = (int) (readableMap.getDouble("quality") * 100.0d);
        this.f59119g = readableMap.getInt("maxHeight");
        this.f59118f = readableMap.getInt("maxWidth");
        this.f59120h = Boolean.valueOf(readableMap.getBoolean("saveToPhotos"));
        this.f59121i = readableMap.getInt("durationLimit");
    }
}
