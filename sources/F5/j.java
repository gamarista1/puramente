package F5;

import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import com.facebook.I;
import com.revenuecat.purchases.subscriberattributes.SubscriberAttributeKt;
import kotlin.Lazy;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.C6498u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lf.C6531o;
import org.json.JSONObject;
import t7.C4049a;
import yf.C6787a;

public final class j {

    /* renamed from: b  reason: collision with root package name */
    public static final a f30769b = new a((DefaultConstructorMarker) null);

    /* renamed from: c  reason: collision with root package name */
    private static volatile j f30770c;

    /* renamed from: a  reason: collision with root package name */
    private final Lazy f30771a;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final j a() {
            j a10 = j.a();
            if (a10 == null) {
                synchronized (this) {
                    if (!I.G()) {
                        return null;
                    }
                    a10 = j.a();
                    if (a10 == null) {
                        a10 = new j((DefaultConstructorMarker) null);
                        j.b(a10);
                    }
                }
            }
            return a10;
        }

        private a() {
        }
    }

    static final class b extends C6498u implements C6787a {

        /* renamed from: a  reason: collision with root package name */
        public static final b f30772a = new b();

        b() {
            super(0);
        }

        public final SharedPreferences invoke() {
            return I.l().getSharedPreferences("com.facebook.sdk.APPLINK_INFO", 0);
        }
    }

    public static final class c implements Application.ActivityLifecycleCallbacks {
        c() {
        }

        public void onActivityCreated(Activity activity, Bundle bundle) {
            C6496s.h(activity, "activity");
        }

        public void onActivityDestroyed(Activity activity) {
            C6496s.h(activity, "activity");
        }

        public void onActivityPaused(Activity activity) {
            C6496s.h(activity, "activity");
        }

        public void onActivityResumed(Activity activity) {
            C6496s.h(activity, "activity");
            j a10 = j.f30769b.a();
            if (a10 != null) {
                a10.g(activity);
            }
        }

        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
            C6496s.h(activity, "activity");
            C6496s.h(bundle, "bundle");
        }

        public void onActivityStarted(Activity activity) {
            C6496s.h(activity, "activity");
            j a10 = j.f30769b.a();
            if (a10 != null) {
                a10.g(activity);
            }
        }

        public void onActivityStopped(Activity activity) {
            C6496s.h(activity, "activity");
        }
    }

    public /* synthetic */ j(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public static final /* synthetic */ j a() {
        Class<j> cls = j.class;
        if (C4049a.d(cls)) {
            return null;
        }
        try {
            return f30770c;
        } catch (Throwable th2) {
            C4049a.b(th2, cls);
            return null;
        }
    }

    public static final /* synthetic */ void b(j jVar) {
        Class<j> cls = j.class;
        if (!C4049a.d(cls)) {
            try {
                f30770c = jVar;
            } catch (Throwable th2) {
                C4049a.b(th2, cls);
            }
        }
    }

    private final SharedPreferences f() {
        if (C4049a.d(this)) {
            return null;
        }
        try {
            Object value = this.f30771a.getValue();
            C6496s.g(value, "<get-preferences>(...)");
            return (SharedPreferences) value;
        } catch (Throwable th2) {
            C4049a.b(th2, this);
            return null;
        }
    }

    public final String c(Intent intent) {
        if (C4049a.d(this)) {
            return null;
        }
        try {
            C6496s.h(intent, "intent");
            Bundle bundleExtra = intent.getBundleExtra("al_applink_data");
            if (bundleExtra == null) {
                return null;
            }
            return bundleExtra.getString("campaign_ids");
        } catch (Throwable th2) {
            C4049a.b(th2, this);
            return null;
        }
    }

    public final String d(Uri uri) {
        if (C4049a.d(this)) {
            return null;
        }
        try {
            C6496s.h(uri, "uri");
            String queryParameter = uri.getQueryParameter("al_applink_data");
            if (queryParameter == null) {
                return null;
            }
            return new JSONObject(queryParameter).getString("campaign_ids");
        } catch (Exception unused) {
            Log.d("AppLinkManager", "Fail to parse Applink data from Uri");
            return null;
        } catch (Throwable th2) {
            C4049a.b(th2, this);
            return null;
        }
    }

    public final String e(String str) {
        if (C4049a.d(this)) {
            return null;
        }
        try {
            C6496s.h(str, SubscriberAttributeKt.JSON_NAME_KEY);
            return f().getString(str, (String) null);
        } catch (Throwable th2) {
            C4049a.b(th2, this);
            return null;
        }
    }

    public final void g(Activity activity) {
        if (!C4049a.d(this)) {
            try {
                C6496s.h(activity, "activity");
                Uri data = activity.getIntent().getData();
                if (data != null) {
                    Intent intent = activity.getIntent();
                    C6496s.g(intent, "activity.intent");
                    h(data, intent);
                }
            } catch (Throwable th2) {
                C4049a.b(th2, this);
            }
        }
    }

    public final void h(Uri uri, Intent intent) {
        if (!C4049a.d(this)) {
            try {
                C6496s.h(uri, "uri");
                C6496s.h(intent, "intent");
                String d10 = d(uri);
                if (d10 == null) {
                    d10 = c(intent);
                }
                if (d10 != null) {
                    f().edit().putString("campaign_ids", d10).apply();
                }
            } catch (Throwable th2) {
                C4049a.b(th2, this);
            }
        }
    }

    public final void i(Application application) {
        if (!C4049a.d(this)) {
            try {
                C6496s.h(application, "application");
                application.registerActivityLifecycleCallbacks(new c());
            } catch (Throwable th2) {
                C4049a.b(th2, this);
            }
        }
    }

    private j() {
        this.f30771a = C6531o.b(b.f30772a);
    }
}
