package com.google.firebase.remoteconfig.internal;

import android.os.Bundle;
import ic.C5027b;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;
import xb.C5276a;

public class y {

    /* renamed from: a  reason: collision with root package name */
    private final C5027b f57948a;

    /* renamed from: b  reason: collision with root package name */
    private final Map f57949b = Collections.synchronizedMap(new HashMap());

    public y(C5027b bVar) {
        this.f57948a = bVar;
    }

    public void a(String str, g gVar) {
        JSONObject optJSONObject;
        C5276a aVar = (C5276a) this.f57948a.get();
        if (aVar != null) {
            JSONObject i10 = gVar.i();
            if (i10.length() >= 1) {
                JSONObject g10 = gVar.g();
                if (g10.length() >= 1 && (optJSONObject = i10.optJSONObject(str)) != null) {
                    String optString = optJSONObject.optString("choiceId");
                    if (!optString.isEmpty()) {
                        synchronized (this.f57949b) {
                            try {
                                if (!optString.equals(this.f57949b.get(str))) {
                                    this.f57949b.put(str, optString);
                                    Bundle bundle = new Bundle();
                                    bundle.putString("arm_key", str);
                                    bundle.putString("arm_value", g10.optString(str));
                                    bundle.putString("personalization_id", optJSONObject.optString("personalizationId"));
                                    bundle.putInt("arm_index", optJSONObject.optInt("armIndex", -1));
                                    bundle.putString("group", optJSONObject.optString("group"));
                                    aVar.b("fp", "personalization_assignment", bundle);
                                    Bundle bundle2 = new Bundle();
                                    bundle2.putString("_fpid", optString);
                                    aVar.b("fp", "_fpc", bundle2);
                                }
                            } catch (Throwable th2) {
                                while (true) {
                                    throw th2;
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}
