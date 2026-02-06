package Ue;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class i {

    /* renamed from: b  reason: collision with root package name */
    private static i f65204b = new i();

    /* renamed from: a  reason: collision with root package name */
    private JSONObject f65205a;

    private i() {
        try {
            this.f65205a = new JSONObject("{\"database_persistence_enabled\":true,\"messaging_android_notification_channel_id\":\"main_remote_notifications\",\"messaging_ios_auto_register_for_remote_messages\":true}");
        } catch (JSONException unused) {
        }
    }

    public static i g() {
        return f65204b;
    }

    public boolean a(String str) {
        JSONObject jSONObject = this.f65205a;
        if (jSONObject == null) {
            return false;
        }
        return jSONObject.has(str);
    }

    public WritableMap b() {
        WritableMap createMap = Arguments.createMap();
        JSONArray names = this.f65205a.names();
        for (int i10 = 0; i10 < names.length(); i10++) {
            try {
                String string = names.getString(i10);
                m.h(string, this.f65205a.get(string), createMap);
            } catch (JSONException unused) {
            }
        }
        return createMap;
    }

    public ArrayList c(String str) {
        ArrayList arrayList = new ArrayList();
        JSONObject jSONObject = this.f65205a;
        if (jSONObject == null) {
            return arrayList;
        }
        try {
            JSONArray optJSONArray = jSONObject.optJSONArray(str);
            if (optJSONArray != null) {
                for (int i10 = 0; i10 < optJSONArray.length(); i10++) {
                    arrayList.add(optJSONArray.getString(i10));
                }
            }
        } catch (JSONException unused) {
        }
        return arrayList;
    }

    public int d(String str, int i10) {
        JSONObject jSONObject = this.f65205a;
        if (jSONObject == null) {
            return i10;
        }
        return jSONObject.optInt(str, i10);
    }

    public long e(String str, long j10) {
        JSONObject jSONObject = this.f65205a;
        if (jSONObject == null) {
            return j10;
        }
        return jSONObject.optLong(str, j10);
    }

    public String f() {
        return "{\"database_persistence_enabled\":true,\"messaging_android_notification_channel_id\":\"main_remote_notifications\",\"messaging_ios_auto_register_for_remote_messages\":true}";
    }
}
