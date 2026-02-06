package io.invertase.firebase.messaging;

import Ue.o;
import com.amazon.a.a.o.b.f;
import com.facebook.react.bridge.WritableMap;
import com.google.firebase.messaging.W;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

public class t implements r {

    /* renamed from: a  reason: collision with root package name */
    private final String f71440a = f.f37529a;

    private List d(String str) {
        return new ArrayList(Arrays.asList(str.split(f.f37529a)));
    }

    private String e(String str, String str2) {
        return str2.replace(str + f.f37529a, "");
    }

    public void a(String str) {
        o e10 = o.e();
        e10.g(str);
        String f10 = e10.f("all_notification_ids", "");
        if (!f10.isEmpty()) {
            e10.j("all_notification_ids", e(str, f10));
        }
    }

    public WritableMap b(String str) {
        String f10 = o.e().f(str, (String) null);
        if (f10 != null) {
            try {
                WritableMap b10 = a.b(new JSONObject(f10));
                b10.putString("to", str);
                return b10;
            } catch (JSONException e10) {
                e10.printStackTrace();
            }
        }
        return null;
    }

    public void c(W w10) {
        try {
            String jSONObject = a.d(q.i(w10)).toString();
            o e10 = o.e();
            e10.j(w10.r0(), jSONObject);
            String str = e10.f("all_notification_ids", "") + w10.r0() + f.f37529a;
            List d10 = d(str);
            if (d10.size() > 100) {
                String str2 = (String) d10.get(0);
                e10.g(str2);
                str = e(str2, str);
            }
            e10.j("all_notification_ids", str);
        } catch (JSONException e11) {
            e11.printStackTrace();
        }
    }
}
