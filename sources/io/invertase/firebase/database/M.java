package io.invertase.firebase.database;

import Ve.C5607a;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;

public class M implements C5607a {

    /* renamed from: a  reason: collision with root package name */
    private String f71329a;

    /* renamed from: b  reason: collision with root package name */
    private WritableMap f71330b;

    /* renamed from: c  reason: collision with root package name */
    private String f71331c;

    /* renamed from: d  reason: collision with root package name */
    private int f71332d;

    M(String str, WritableMap writableMap, String str2, int i10) {
        this.f71329a = str;
        this.f71330b = writableMap;
        this.f71331c = str2;
        this.f71332d = i10;
    }

    public WritableMap a() {
        WritableMap createMap = Arguments.createMap();
        createMap.putInt("id", this.f71332d);
        createMap.putMap("body", this.f71330b);
        createMap.putString("appName", this.f71331c);
        createMap.putString("eventName", this.f71329a);
        return createMap;
    }

    public String b() {
        return this.f71329a;
    }
}
