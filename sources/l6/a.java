package L6;

import android.content.Context;
import android.os.Bundle;
import com.facebook.C3462y;
import com.revenuecat.purchases.amazon.purchasing.ProxyAmazonBillingActivity;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;
import t5.C4021N;

public class a {

    /* renamed from: f  reason: collision with root package name */
    private static a f32518f;

    /* renamed from: a  reason: collision with root package name */
    private final C4021N f32519a;

    /* renamed from: b  reason: collision with root package name */
    private String f32520b = null;

    /* renamed from: c  reason: collision with root package name */
    private String f32521c = null;

    /* renamed from: d  reason: collision with root package name */
    private String f32522d = null;

    /* renamed from: e  reason: collision with root package name */
    private ConcurrentHashMap f32523e;

    private a(Context context) {
        this.f32519a = new C4021N(context);
        this.f32523e = new ConcurrentHashMap();
    }

    private Bundle a() {
        Bundle bundle = new Bundle();
        String str = this.f32520b;
        if (str != null) {
            bundle.putString("app_id", str);
        }
        String str2 = this.f32522d;
        if (str2 != null) {
            bundle.putString("session_id", str2);
        }
        return bundle;
    }

    public static synchronized a b(Context context) {
        a aVar;
        synchronized (a.class) {
            try {
                if (f32518f == null) {
                    f32518f = new a(context);
                }
                aVar = f32518f;
            } catch (Throwable th2) {
                while (true) {
                    throw th2;
                }
            }
        }
        return aVar;
    }

    private Bundle c(String str) {
        Bundle a10 = a();
        if (str != null) {
            String str2 = (String) this.f32523e.getOrDefault(str, (Object) null);
            a10.putString(ProxyAmazonBillingActivity.EXTRAS_REQUEST_ID, str);
            if (str2 != null) {
                a10.putString("function_type", str2);
                this.f32523e.remove(str);
            }
        }
        return a10;
    }

    private Bundle d(String str, String str2) {
        Bundle a10 = a();
        a10.putString(ProxyAmazonBillingActivity.EXTRAS_REQUEST_ID, str);
        a10.putString("function_type", str2);
        return a10;
    }

    public void e(String str, String str2, JSONObject jSONObject) {
        Bundle d10 = d(str2, str);
        d10.putString("payload", jSONObject.toString());
        this.f32519a.g("cloud_games_preparing_request", d10);
    }

    public void f(C3462y yVar, String str) {
        Bundle c10 = c(str);
        c10.putString("error_code", Integer.toString(yVar.c()));
        c10.putString("error_type", yVar.e());
        c10.putString("error_message", yVar.d());
        this.f32519a.g("cloud_games_sending_error_response", c10);
    }

    public void g(String str) {
        this.f32519a.g("cloud_games_sending_success_response", c(str));
    }

    public void h(String str, String str2, JSONObject jSONObject) {
        Bundle d10 = d(str2, str);
        this.f32523e.put(str2, str);
        d10.putString("payload", jSONObject.toString());
        this.f32519a.g("cloud_games_sent_request", d10);
    }
}
