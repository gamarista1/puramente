package com.amazon.device.simplesignin.a.d;

import com.amazon.device.simplesignin.a.a.a;
import com.amazon.device.simplesignin.model.Link;
import com.amazon.device.simplesignin.model.Token;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    private static final String f38091a = "b";

    private b() {
    }

    public static List<Link> a(String str, String str2) {
        try {
            JSONArray jSONArray = new JSONArray(str2);
            if (jSONArray.length() == 0) {
                a.a(f38091a, "No links available, links object received is empty.");
                return Collections.emptyList();
            }
            ArrayList arrayList = new ArrayList(jSONArray.length());
            int i10 = 0;
            while (i10 < jSONArray.length()) {
                try {
                    JSONObject jSONObject = (JSONObject) jSONArray.get(i10);
                    Link link = new Link();
                    link.setAmazonUserId(str);
                    link.setIdentityProviderName(jSONObject.getString(a.f38027z));
                    link.setLinkId(jSONObject.getString(a.f38026y));
                    link.setPartnerUserId(jSONObject.getString(a.f37990A));
                    link.setLinkedTimestamp(jSONObject.getLong(a.f37991B));
                    Token token = new Token();
                    JSONObject jSONObject2 = new JSONObject(jSONObject.getString(a.f37992C));
                    token.setToken(jSONObject2.getString("token"));
                    token.setSchema(jSONObject2.getString(a.f37994E));
                    link.setSsiToken(token);
                    arrayList.add(link);
                    i10++;
                } catch (JSONException e10) {
                    String str3 = f38091a;
                    a.b(str3, "Failure generating Link object from response." + e10);
                    return null;
                }
            }
            return arrayList;
        } catch (JSONException e11) {
            String str4 = f38091a;
            a.b(str4, "Failure generating Link object from Kiwi response." + e11);
            return null;
        }
    }

    public static String a(String str) {
        try {
            return new JSONObject(str).getString(a.f38026y);
        } catch (JSONException e10) {
            String str2 = f38091a;
            a.b(str2, "Failure extracting Link ID object from response." + e10);
            return null;
        }
    }
}
