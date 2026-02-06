package Ue;

import android.content.SharedPreferences;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import io.invertase.firebase.app.a;
import java.util.Map;

public class k {

    /* renamed from: b  reason: collision with root package name */
    private static k f65207b = new k();

    /* renamed from: a  reason: collision with root package name */
    private SharedPreferences f65208a;

    private SharedPreferences c() {
        if (this.f65208a == null) {
            this.f65208a = a.a().getSharedPreferences("io.invertase.firebase", 0);
        }
        return this.f65208a;
    }

    public static k d() {
        return f65207b;
    }

    public void a() {
        c().edit().clear().apply();
    }

    public WritableMap b() {
        WritableMap createMap = Arguments.createMap();
        for (Map.Entry next : c().getAll().entrySet()) {
            m.h((String) next.getKey(), next.getValue(), createMap);
        }
        return createMap;
    }

    public void e(String str, boolean z10) {
        c().edit().putBoolean(str, z10).apply();
    }

    public void f(String str, String str2) {
        c().edit().putString(str, str2).apply();
    }
}
