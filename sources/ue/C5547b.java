package Ue;

import Ve.C5607a;
import com.facebook.react.bridge.WritableMap;

/* renamed from: Ue.b  reason: case insensitive filesystem */
public class C5547b implements C5607a {

    /* renamed from: a  reason: collision with root package name */
    private String f65187a;

    /* renamed from: b  reason: collision with root package name */
    private WritableMap f65188b;

    /* renamed from: c  reason: collision with root package name */
    private String f65189c;

    public C5547b(String str, WritableMap writableMap) {
        this.f65187a = str;
        this.f65188b = writableMap;
    }

    public WritableMap a() {
        return this.f65188b;
    }

    public String b() {
        return this.f65187a;
    }

    public C5547b(String str, WritableMap writableMap, String str2) {
        this.f65187a = str;
        this.f65188b = writableMap;
        this.f65189c = str2;
    }
}
