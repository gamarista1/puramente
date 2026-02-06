package io.invertase.firebase.database;

import Ve.C5607a;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;

/* renamed from: io.invertase.firebase.database.b  reason: case insensitive filesystem */
public class C6403b implements C5607a {

    /* renamed from: a  reason: collision with root package name */
    private String f71370a;

    /* renamed from: b  reason: collision with root package name */
    private WritableMap f71371b;

    C6403b(String str, WritableMap writableMap) {
        this.f71370a = str;
        this.f71371b = writableMap;
    }

    public WritableMap a() {
        WritableMap createMap = Arguments.createMap();
        createMap.putMap("body", this.f71371b);
        createMap.putString("eventName", this.f71370a);
        return createMap;
    }

    public String b() {
        return this.f71370a;
    }
}
