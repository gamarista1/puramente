package Lc;

import Kc.h;
import org.json.JSONObject;
import ub.C5230g;

public class k extends e {

    /* renamed from: m  reason: collision with root package name */
    private final JSONObject f51992m;

    public k(h hVar, C5230g gVar, JSONObject jSONObject) {
        super(hVar, gVar);
        this.f51992m = jSONObject;
        G("X-HTTP-Method-Override", "PATCH");
    }

    /* access modifiers changed from: protected */
    public String e() {
        return "PUT";
    }

    /* access modifiers changed from: protected */
    public JSONObject g() {
        return this.f51992m;
    }
}
