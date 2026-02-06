package a8;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;

public class d {

    /* renamed from: e  reason: collision with root package name */
    private static final a f36159e = new a((DefaultConstructorMarker) null);

    /* renamed from: f  reason: collision with root package name */
    private static final String f36160f = d.class.getSimpleName();

    /* renamed from: a  reason: collision with root package name */
    private final Context f36161a;

    /* renamed from: b  reason: collision with root package name */
    private final SharedPreferences f36162b;

    /* renamed from: c  reason: collision with root package name */
    private final String f36163c;

    /* renamed from: d  reason: collision with root package name */
    private final Map f36164d = new LinkedHashMap();

    private static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public d(Context context) {
        C6496s.h(context, "appContext");
        this.f36161a = context;
        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);
        C6496s.g(defaultSharedPreferences, "getDefaultSharedPreferences(...)");
        this.f36162b = defaultSharedPreferences;
        String packageName = context.getPackageName();
        C6496s.g(packageName, "getPackageName(...)");
        this.f36163c = packageName;
    }

    public final Map a() {
        return this.f36164d;
    }

    public String b() {
        String string = this.f36162b.getString("debug_http_host", (String) null);
        if (string != null && string.length() > 0) {
            return string;
        }
        String h10 = com.facebook.react.modules.systeminfo.a.h(this.f36161a);
        if (C6496s.c(h10, "localhost")) {
            String str = f36160f;
            String b10 = com.facebook.react.modules.systeminfo.a.b(this.f36161a);
            U5.a.I(str, "You seem to be running on device. Run '" + b10 + "' to forward the debug server's port to the device.");
        }
        return h10;
    }

    public final String c() {
        return this.f36163c;
    }

    public void d(String str) {
        C6496s.h(str, "host");
        this.f36162b.edit().putString("debug_http_host", str).apply();
    }
}
