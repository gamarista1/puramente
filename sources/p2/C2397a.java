package p2;

import com.amazon.a.a.o.b.f;
import i2.L;
import i2.p;
import io.jsonwebtoken.JwsHeader;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: p2.a  reason: case insensitive filesystem */
abstract class C2397a {
    public static byte[] a(byte[] bArr) {
        if (L.f22072a >= 27) {
            return bArr;
        }
        return L.q0(c(L.G(bArr)));
    }

    public static byte[] b(byte[] bArr) {
        if (L.f22072a >= 27) {
            return bArr;
        }
        try {
            JSONObject jSONObject = new JSONObject(L.G(bArr));
            StringBuilder sb2 = new StringBuilder("{\"keys\":[");
            JSONArray jSONArray = jSONObject.getJSONArray("keys");
            for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                if (i10 != 0) {
                    sb2.append(f.f37529a);
                }
                JSONObject jSONObject2 = jSONArray.getJSONObject(i10);
                sb2.append("{\"k\":\"");
                sb2.append(d(jSONObject2.getString("k")));
                sb2.append("\",\"kid\":\"");
                sb2.append(d(jSONObject2.getString(JwsHeader.KEY_ID)));
                sb2.append("\",\"kty\":\"");
                sb2.append(jSONObject2.getString("kty"));
                sb2.append("\"}");
            }
            sb2.append("]}");
            return L.q0(sb2.toString());
        } catch (JSONException e10) {
            p.d("ClearKeyUtil", "Failed to adjust response data: " + L.G(bArr), e10);
            return bArr;
        }
    }

    private static String c(String str) {
        return str.replace('+', '-').replace('/', '_');
    }

    private static String d(String str) {
        return str.replace('-', '+').replace('_', '/');
    }
}
