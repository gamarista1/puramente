package y7;

import Sg.C5541d;
import Sg.p;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import android.util.Log;
import com.amazon.a.a.o.b.f;
import com.facebook.C3286a;
import com.facebook.C3293h;
import com.facebook.C3320j;
import com.facebook.C3459v;
import com.facebook.C3462y;
import com.facebook.I;
import com.facebook.K;
import com.facebook.M;
import com.facebook.S;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mf.C6565s;
import mf.O;
import o7.W;
import org.json.JSONException;
import org.json.JSONObject;
import t5.C4021N;
import y7.C4214u;

public abstract class E implements Parcelable {

    /* renamed from: c  reason: collision with root package name */
    public static final a f49600c = new a((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private Map f49601a;

    /* renamed from: b  reason: collision with root package name */
    public C4214u f49602b;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final C3286a a(Bundle bundle, C3293h hVar, String str) {
            String string;
            Bundle bundle2 = bundle;
            C6496s.h(bundle, "bundle");
            C6496s.h(str, "applicationId");
            Date y10 = W.y(bundle, "com.facebook.platform.extra.EXPIRES_SECONDS_SINCE_EPOCH", new Date(0));
            ArrayList<String> stringArrayList = bundle.getStringArrayList("com.facebook.platform.extra.PERMISSIONS");
            String string2 = bundle.getString("com.facebook.platform.extra.ACCESS_TOKEN");
            Date y11 = W.y(bundle, "com.facebook.platform.extra.EXTRA_DATA_ACCESS_EXPIRATION_TIME", new Date(0));
            if (string2 == null || string2.length() == 0 || (string = bundle.getString("com.facebook.platform.extra.USER_ID")) == null || string.length() == 0) {
                return null;
            }
            return new C3286a(string2, str, string, stringArrayList, (Collection) null, (Collection) null, hVar, y10, new Date(), y11, bundle.getString("graph_domain"));
        }

        public final C3286a b(Collection collection, Bundle bundle, C3293h hVar, String str) {
            Collection collection2;
            ArrayList arrayList;
            ArrayList arrayList2;
            Bundle bundle2 = bundle;
            C6496s.h(bundle2, "bundle");
            C6496s.h(str, "applicationId");
            Date y10 = W.y(bundle2, "expires_in", new Date());
            String string = bundle2.getString("access_token");
            if (string == null) {
                return null;
            }
            Date y11 = W.y(bundle2, "data_access_expiration_time", new Date(0));
            String string2 = bundle2.getString("granted_scopes");
            if (string2 == null || string2.length() <= 0) {
                collection2 = collection;
            } else {
                String[] strArr = (String[]) p.F0(string2, new String[]{f.f37529a}, false, 0, 6, (Object) null).toArray(new String[0]);
                collection2 = C6565s.h(Arrays.copyOf(strArr, strArr.length));
            }
            String string3 = bundle2.getString("denied_scopes");
            if (string3 == null || string3.length() <= 0) {
                arrayList = null;
            } else {
                String[] strArr2 = (String[]) p.F0(string3, new String[]{f.f37529a}, false, 0, 6, (Object) null).toArray(new String[0]);
                arrayList = C6565s.h(Arrays.copyOf(strArr2, strArr2.length));
            }
            String string4 = bundle2.getString("expired_scopes");
            if (string4 == null || string4.length() <= 0) {
                arrayList2 = null;
            } else {
                String[] strArr3 = (String[]) p.F0(string4, new String[]{f.f37529a}, false, 0, 6, (Object) null).toArray(new String[0]);
                arrayList2 = C6565s.h(Arrays.copyOf(strArr3, strArr3.length));
            }
            if (W.e0(string)) {
                return null;
            }
            return new C3286a(string, str, e(bundle2.getString("signed_request")), collection2, arrayList, arrayList2, hVar, y10, new Date(), y11, bundle2.getString("graph_domain"));
        }

        public final C3320j c(Bundle bundle, String str) {
            C6496s.h(bundle, "bundle");
            String string = bundle.getString("com.facebook.platform.extra.ID_TOKEN");
            if (string == null || string.length() == 0 || str == null || str.length() == 0) {
                return null;
            }
            try {
                return new C3320j(string, str);
            } catch (Exception e10) {
                throw new C3459v(e10.getMessage());
            }
        }

        public final C3320j d(Bundle bundle, String str) {
            C6496s.h(bundle, "bundle");
            String string = bundle.getString("id_token");
            if (string == null || string.length() == 0 || str == null || str.length() == 0) {
                return null;
            }
            try {
                return new C3320j(string, str);
            } catch (Exception e10) {
                throw new C3459v(e10.getMessage(), e10);
            }
        }

        public final String e(String str) {
            if (str == null || str.length() == 0) {
                throw new C3459v("Authorization response does not contain the signed_request");
            }
            try {
                String[] strArr = (String[]) p.F0(str, new String[]{"."}, false, 0, 6, (Object) null).toArray(new String[0]);
                if (strArr.length == 2) {
                    byte[] decode = Base64.decode(strArr[1], 0);
                    C6496s.g(decode, "data");
                    String string = new JSONObject(new String(decode, C5541d.f65029b)).getString("user_id");
                    C6496s.g(string, "jsonObject.getString(\"user_id\")");
                    return string;
                }
            } catch (UnsupportedEncodingException | JSONException unused) {
            }
            throw new C3459v("Failed to retrieve user_id from signed_request");
        }

        private a() {
        }
    }

    public E(C4214u uVar) {
        C6496s.h(uVar, "loginClient");
        n(uVar);
    }

    /* access modifiers changed from: protected */
    public void a(String str, Object obj) {
        String str2;
        if (this.f49601a == null) {
            this.f49601a = new HashMap();
        }
        Map map = this.f49601a;
        if (map != null) {
            if (obj != null) {
                str2 = obj.toString();
            } else {
                str2 = null;
            }
            String str3 = (String) map.put(str, str2);
        }
    }

    /* access modifiers changed from: protected */
    public String c(String str) {
        C6496s.h(str, "authId");
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("0_auth_logger_id", str);
            jSONObject.put("3_method", f());
            l(jSONObject);
        } catch (JSONException e10) {
            Log.w("LoginMethodHandler", "Error creating client state json: " + e10.getMessage());
        }
        String jSONObject2 = jSONObject.toString();
        C6496s.g(jSONObject2, "param.toString()");
        return jSONObject2;
    }

    public final C4214u d() {
        C4214u uVar = this.f49602b;
        if (uVar != null) {
            return uVar;
        }
        C6496s.v("loginClient");
        return null;
    }

    public final Map e() {
        return this.f49601a;
    }

    public abstract String f();

    /* access modifiers changed from: protected */
    public String g() {
        return "fb" + I.m() + "://authorize/";
    }

    /* access modifiers changed from: protected */
    public void h(String str) {
        String str2;
        C4214u.e p10 = d().p();
        if (p10 == null || (str2 = p10.a()) == null) {
            str2 = I.m();
        }
        C4021N n10 = new C4021N(d().i(), str2);
        Bundle bundle = new Bundle();
        bundle.putString("fb_web_login_e2e", str);
        bundle.putLong("fb_web_login_switchback_time", System.currentTimeMillis());
        bundle.putString("app_id", str2);
        n10.h("fb_dialogs_web_login_dialog_complete", (Double) null, bundle);
    }

    public boolean i() {
        return false;
    }

    public boolean j(int i10, int i11, Intent intent) {
        return false;
    }

    /* access modifiers changed from: protected */
    public Bundle k(C4214u.e eVar, Bundle bundle) {
        String str;
        C6496s.h(eVar, "request");
        C6496s.h(bundle, "values");
        String string = bundle.getString("code");
        if (!W.e0(string)) {
            if (string != null) {
                String g10 = g();
                String f10 = eVar.f();
                if (f10 == null) {
                    f10 = "";
                }
                M a10 = K.a(string, g10, f10);
                if (a10 != null) {
                    S k10 = a10.k();
                    C3462y b10 = k10.b();
                    if (b10 == null) {
                        try {
                            JSONObject c10 = k10.c();
                            if (c10 != null) {
                                str = c10.getString("access_token");
                            } else {
                                str = null;
                            }
                            if (c10 == null || W.e0(str)) {
                                throw new C3459v("No access token found from result");
                            }
                            bundle.putString("access_token", str);
                            if (c10.has("id_token")) {
                                bundle.putString("id_token", c10.getString("id_token"));
                            }
                            return bundle;
                        } catch (JSONException e10) {
                            throw new C3459v("Fail to process code exchange response: " + e10.getMessage());
                        }
                    } else {
                        throw new K(b10, b10.d());
                    }
                }
            }
            throw new C3459v("Failed to create code exchange request");
        }
        throw new C3459v("No code param found from the request");
    }

    public void l(JSONObject jSONObject) {
        C6496s.h(jSONObject, "param");
    }

    public final void n(C4214u uVar) {
        C6496s.h(uVar, "<set-?>");
        this.f49602b = uVar;
    }

    public boolean o() {
        return false;
    }

    public abstract int p(C4214u.e eVar);

    public void writeToParcel(Parcel parcel, int i10) {
        C6496s.h(parcel, "dest");
        W.M0(parcel, this.f49601a);
    }

    protected E(Parcel parcel) {
        C6496s.h(parcel, "source");
        Map x02 = W.x0(parcel);
        this.f49601a = x02 != null ? O.B(x02) : null;
    }

    public void b() {
    }
}
