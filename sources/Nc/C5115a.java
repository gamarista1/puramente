package nc;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import androidx.core.content.c;
import dc.C4942a;
import dc.C4944c;
import ub.C5225b;

/* renamed from: nc.a  reason: case insensitive filesystem */
public class C5115a {

    /* renamed from: a  reason: collision with root package name */
    private final Context f61119a;

    /* renamed from: b  reason: collision with root package name */
    private final SharedPreferences f61120b;

    /* renamed from: c  reason: collision with root package name */
    private final C4944c f61121c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f61122d = c();

    public C5115a(Context context, String str, C4944c cVar) {
        Context a10 = a(context);
        this.f61119a = a10;
        this.f61120b = a10.getSharedPreferences("com.google.firebase.common.prefs:" + str, 0);
        this.f61121c = cVar;
    }

    private static Context a(Context context) {
        return c.createDeviceProtectedStorageContext(context);
    }

    private boolean c() {
        if (this.f61120b.contains("firebase_data_collection_default_enabled")) {
            return this.f61120b.getBoolean("firebase_data_collection_default_enabled", true);
        }
        return d();
    }

    private boolean d() {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        try {
            PackageManager packageManager = this.f61119a.getPackageManager();
            if (packageManager == null || (applicationInfo = packageManager.getApplicationInfo(this.f61119a.getPackageName(), 128)) == null || (bundle = applicationInfo.metaData) == null || !bundle.containsKey("firebase_data_collection_default_enabled")) {
                return true;
            }
            return applicationInfo.metaData.getBoolean("firebase_data_collection_default_enabled");
        } catch (PackageManager.NameNotFoundException unused) {
            return true;
        }
    }

    private synchronized void f(boolean z10) {
        if (this.f61122d != z10) {
            this.f61122d = z10;
            this.f61121c.d(new C4942a(C5225b.class, new C5225b(z10)));
        }
    }

    public synchronized boolean b() {
        return this.f61122d;
    }

    public synchronized void e(Boolean bool) {
        if (bool == null) {
            try {
                this.f61120b.edit().remove("firebase_data_collection_default_enabled").apply();
                f(d());
            } catch (Throwable th2) {
                while (true) {
                    throw th2;
                }
            }
        } else {
            boolean equals = Boolean.TRUE.equals(bool);
            this.f61120b.edit().putBoolean("firebase_data_collection_default_enabled", equals).apply();
            f(equals);
        }
    }
}
