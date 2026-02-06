package v5;

import Sg.p;
import android.content.SharedPreferences;
import android.os.Bundle;
import com.facebook.C3286a;
import com.facebook.I;
import com.facebook.M;
import com.facebook.S;
import com.facebook.T;
import com.facebook.V;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lf.C6523g;
import mf.C6565s;
import o7.J;
import o7.W;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import t7.C4049a;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    public static final d f48724a = new d();

    /* renamed from: b  reason: collision with root package name */
    private static final String f48725b = d.class.getCanonicalName();

    /* renamed from: c  reason: collision with root package name */
    private static boolean f48726c;

    private d() {
    }

    public static final void b() {
        try {
            c cVar = new c();
            M m10 = new M((C3286a) null, I.m() + "/cloudbridge_settings", (Bundle) null, T.GET, cVar, (String) null, 32, (DefaultConstructorMarker) null);
            J.a aVar = J.f47112e;
            V v10 = V.APP_EVENTS;
            String str = f48725b;
            C6496s.f(str, "null cannot be cast to non-null type kotlin.String");
            aVar.c(v10, str, " \n\nCreating Graph Request: \n=============\n%s\n\n ", m10);
            m10.l();
        } catch (JSONException e10) {
            J.a aVar2 = J.f47112e;
            V v11 = V.APP_EVENTS;
            String str2 = f48725b;
            C6496s.f(str2, "null cannot be cast to non-null type kotlin.String");
            aVar2.c(v11, str2, " \n\nGraph Request Exception: \n=============\n%s\n\n ", C6523g.b(e10));
        }
    }

    /* access modifiers changed from: private */
    public static final void c(S s10) {
        C6496s.h(s10, "response");
        f48724a.d(s10);
    }

    public static final Map e() {
        Class<d> cls = d.class;
        if (C4049a.d(cls)) {
            return null;
        }
        try {
            SharedPreferences sharedPreferences = I.l().getSharedPreferences("com.facebook.sdk.CloudBridgeSavedCredentials", 0);
            if (sharedPreferences == null) {
                return null;
            }
            o oVar = o.DATASETID;
            String string = sharedPreferences.getString(oVar.b(), (String) null);
            o oVar2 = o.URL;
            String string2 = sharedPreferences.getString(oVar2.b(), (String) null);
            o oVar3 = o.ACCESSKEY;
            String string3 = sharedPreferences.getString(oVar3.b(), (String) null);
            if (string != null) {
                if (!p.d0(string)) {
                    if (string2 != null) {
                        if (!p.d0(string2)) {
                            if (string3 != null) {
                                if (!p.d0(string3)) {
                                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                                    linkedHashMap.put(oVar2.b(), string2);
                                    linkedHashMap.put(oVar.b(), string);
                                    linkedHashMap.put(oVar3.b(), string3);
                                    J.f47112e.c(V.APP_EVENTS, f48725b.toString(), " \n\nLoading Cloudbridge settings from saved Prefs: \n================\n DATASETID: %s\n URL: %s \n ACCESSKEY: %s \n\n ", string, string2, string3);
                                    return linkedHashMap;
                                }
                            }
                        }
                    }
                }
            }
            return null;
        } catch (Throwable th2) {
            C4049a.b(th2, cls);
            return null;
        }
    }

    public final void d(S s10) {
        Object obj;
        boolean z10;
        C6496s.h(s10, "response");
        if (s10.b() != null) {
            J.a aVar = J.f47112e;
            V v10 = V.APP_EVENTS;
            String str = f48725b;
            C6496s.f(str, "null cannot be cast to non-null type kotlin.String");
            aVar.c(v10, str, " \n\nGraph Response Error: \n================\nResponse Error: %s\nResponse Error Exception: %s\n\n ", s10.b().toString(), String.valueOf(s10.b().h()));
            Map e10 = e();
            if (e10 != null) {
                URL url = new URL(String.valueOf(e10.get(o.URL.b())));
                String valueOf = String.valueOf(e10.get(o.DATASETID.b()));
                g.d(valueOf, url.getProtocol() + "://" + url.getHost(), String.valueOf(e10.get(o.ACCESSKEY.b())));
                f48726c = true;
                return;
            }
            return;
        }
        J.a aVar2 = J.f47112e;
        V v11 = V.APP_EVENTS;
        String str2 = f48725b;
        C6496s.f(str2, "null cannot be cast to non-null type kotlin.String");
        aVar2.c(v11, str2, " \n\nGraph Response Received: \n================\n%s\n\n ", s10);
        JSONObject c10 = s10.c();
        if (c10 != null) {
            try {
                obj = c10.get("data");
            } catch (JSONException e11) {
                J.a aVar3 = J.f47112e;
                V v12 = V.APP_EVENTS;
                String str3 = f48725b;
                C6496s.g(str3, "TAG");
                aVar3.c(v12, str3, "CloudBridge Settings API response is not a valid json: \n%s ", C6523g.b(e11));
                return;
            } catch (NullPointerException e12) {
                J.a aVar4 = J.f47112e;
                V v13 = V.APP_EVENTS;
                String str4 = f48725b;
                C6496s.g(str4, "TAG");
                aVar4.c(v13, str4, "CloudBridge Settings API response is not a valid json: \n%s ", C6523g.b(e12));
                return;
            }
        } else {
            obj = null;
        }
        C6496s.f(obj, "null cannot be cast to non-null type org.json.JSONArray");
        Map o10 = W.o(new JSONObject((String) C6565s.q0(W.n((JSONArray) obj))));
        String str5 = (String) o10.get(o.URL.b());
        String str6 = (String) o10.get(o.DATASETID.b());
        String str7 = (String) o10.get(o.ACCESSKEY.b());
        if (str5 == null || str6 == null || str7 == null) {
            C6496s.g(str2, "TAG");
            aVar2.b(v11, str2, "CloudBridge Settings API response doesn't have valid data");
            return;
        }
        try {
            g.d(str6, str5, str7);
            g(o10);
            o oVar = o.ENABLED;
            if (o10.get(oVar.b()) != null) {
                Object obj2 = o10.get(oVar.b());
                C6496s.f(obj2, "null cannot be cast to non-null type kotlin.Boolean");
                z10 = ((Boolean) obj2).booleanValue();
            } else {
                z10 = false;
            }
            f48726c = z10;
        } catch (MalformedURLException e13) {
            J.a aVar5 = J.f47112e;
            V v14 = V.APP_EVENTS;
            String str8 = f48725b;
            C6496s.g(str8, "TAG");
            aVar5.c(v14, str8, "CloudBridge Settings API response doesn't have valid url\n %s ", C6523g.b(e13));
        }
    }

    public final boolean f() {
        return f48726c;
    }

    public final void g(Map map) {
        SharedPreferences sharedPreferences = I.l().getSharedPreferences("com.facebook.sdk.CloudBridgeSavedCredentials", 0);
        if (sharedPreferences != null) {
            if (map == null) {
                SharedPreferences.Editor edit = sharedPreferences.edit();
                edit.clear();
                edit.apply();
                return;
            }
            o oVar = o.DATASETID;
            Object obj = map.get(oVar.b());
            o oVar2 = o.URL;
            Object obj2 = map.get(oVar2.b());
            o oVar3 = o.ACCESSKEY;
            Object obj3 = map.get(oVar3.b());
            if (obj != null && obj2 != null && obj3 != null) {
                SharedPreferences.Editor edit2 = sharedPreferences.edit();
                edit2.putString(oVar.b(), obj.toString());
                edit2.putString(oVar2.b(), obj2.toString());
                edit2.putString(oVar3.b(), obj3.toString());
                edit2.apply();
                J.f47112e.c(V.APP_EVENTS, f48725b.toString(), " \n\nSaving Cloudbridge settings from saved Prefs: \n================\n DATASETID: %s\n URL: %s \n ACCESSKEY: %s \n\n ", obj, obj2, obj3);
            }
        }
    }
}
