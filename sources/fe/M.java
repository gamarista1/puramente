package Fe;

import Ce.a;
import Fe.I;
import android.content.Context;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public abstract class M extends I {
    public M(Context context, B b10, String str, HashMap hashMap, JSONObject jSONObject, JSONObject jSONObject2, List list) {
        super(context, b10);
        JSONObject jSONObject3 = new JSONObject();
        try {
            jSONObject3.put(y.Name.b(), str);
            if (jSONObject2.length() > 0) {
                jSONObject3.put(y.CustomData.b(), jSONObject2);
            }
            if (jSONObject.length() > 0) {
                jSONObject3.put(y.EventData.b(), jSONObject);
            }
            if (hashMap.size() > 0) {
                for (Map.Entry entry : hashMap.entrySet()) {
                    jSONObject3.put((String) entry.getKey(), entry.getValue());
                }
            }
            if (list.size() > 0) {
                JSONArray jSONArray = new JSONArray();
                jSONObject3.put(y.ContentItems.b(), jSONArray);
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    jSONArray.put(((a) it.next()).c());
                }
            }
            F(jSONObject3);
        } catch (JSONException e10) {
            C3023l.m("Caught JSONException " + e10.getMessage());
        }
        M(context, jSONObject3);
    }

    /* access modifiers changed from: protected */
    public void F(JSONObject jSONObject) {
        super.F(jSONObject);
        this.f30898e.l0(jSONObject);
    }

    /* access modifiers changed from: protected */
    public boolean G() {
        return true;
    }

    public boolean H() {
        return false;
    }

    /* access modifiers changed from: protected */
    public boolean I() {
        return true;
    }

    public I.a j() {
        return I.a.V2;
    }

    public boolean s() {
        return false;
    }

    public void e() {
    }
}
