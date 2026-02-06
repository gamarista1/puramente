package io.invertase.firebase.storage;

import Ve.C5607a;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;

public class g implements C5607a {

    /* renamed from: a  reason: collision with root package name */
    private int f71477a;

    /* renamed from: b  reason: collision with root package name */
    private String f71478b;

    /* renamed from: c  reason: collision with root package name */
    private WritableMap f71479c;

    /* renamed from: d  reason: collision with root package name */
    private String f71480d;

    g(WritableMap writableMap, String str, String str2, int i10) {
        this.f71479c = writableMap;
        this.f71480d = str;
        this.f71478b = str2;
        this.f71477a = i10;
    }

    public WritableMap a() {
        WritableMap createMap = Arguments.createMap();
        createMap.putInt("taskId", this.f71477a);
        createMap.putMap("body", this.f71479c);
        createMap.putString("appName", this.f71478b);
        createMap.putString("eventName", this.f71480d);
        return createMap;
    }

    public String b() {
        return "storage_event";
    }
}
