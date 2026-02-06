package o9;

import com.amazon.a.a.o.b.f;
import io.jsonwebtoken.JwsHeader;
import ja.M;
import ja.s;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: o9.a  reason: case insensitive filesystem */
abstract class C3914a {
    public static byte[] a(byte[] bArr) {
        if (M.f44981a >= 27) {
            return bArr;
        }
        return M.n0(c(M.D(bArr)));
    }

    public static byte[] b(byte[] bArr) {
        if (M.f44981a >= 27) {
            return bArr;
        }
        try {
            JSONObject jSONObject = new JSONObject(M.D(bArr));
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
            return M.n0(sb2.toString());
        } catch (JSONException e10) {
            s.d("ClearKeyUtil", "Failed to adjust response data: " + M.D(bArr), e10);
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
