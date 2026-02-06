package com.google.firebase.storage;

import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.google.firebase.storage.i  reason: case insensitive filesystem */
public final class C4853i {

    /* renamed from: a  reason: collision with root package name */
    private final List f58079a;

    /* renamed from: b  reason: collision with root package name */
    private final List f58080b;

    /* renamed from: c  reason: collision with root package name */
    private final String f58081c;

    C4853i(List list, List list2, String str) {
        this.f58079a = list;
        this.f58080b = list2;
        this.f58081c = str;
    }

    static C4853i a(C4849e eVar, JSONObject jSONObject) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        if (jSONObject.has("prefixes")) {
            JSONArray jSONArray = jSONObject.getJSONArray("prefixes");
            for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                String string = jSONArray.getString(i10);
                if (string.endsWith("/")) {
                    string = string.substring(0, string.length() - 1);
                }
                arrayList.add(eVar.p(string));
            }
        }
        if (jSONObject.has("items")) {
            JSONArray jSONArray2 = jSONObject.getJSONArray("items");
            for (int i11 = 0; i11 < jSONArray2.length(); i11++) {
                arrayList2.add(eVar.p(jSONArray2.getJSONObject(i11).getString("name")));
            }
        }
        return new C4853i(arrayList, arrayList2, jSONObject.optString("nextPageToken", (String) null));
    }

    public List b() {
        return this.f58080b;
    }

    public String c() {
        return this.f58081c;
    }

    public List d() {
        return this.f58079a;
    }
}
