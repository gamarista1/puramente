package Ab;

import Bb.c;
import android.util.Log;
import com.google.android.gms.common.internal.C4536s;
import io.jsonwebtoken.Claims;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
import zb.C5299a;

public final class a extends C5299a {

    /* renamed from: d  reason: collision with root package name */
    private static final String f50170d = "Ab.a";

    /* renamed from: a  reason: collision with root package name */
    private final String f50171a;

    /* renamed from: b  reason: collision with root package name */
    private final long f50172b;

    /* renamed from: c  reason: collision with root package name */
    private final long f50173c;

    a(String str, long j10, long j11) {
        C4536s.f(str);
        this.f50171a = str;
        this.f50173c = j10;
        this.f50172b = j11;
    }

    public static a c(String str) {
        C4536s.l(str);
        Map b10 = c.b(str);
        long e10 = e(b10, Claims.ISSUED_AT);
        return new a(str, (e(b10, Claims.EXPIRATION) - e10) * 1000, e10 * 1000);
    }

    static a d(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            return new a(jSONObject.getString("token"), jSONObject.getLong("expiresIn"), jSONObject.getLong("receivedAt"));
        } catch (JSONException e10) {
            String str2 = f50170d;
            Log.e(str2, "Could not deserialize token: " + e10.getMessage());
            return null;
        }
    }

    private static long e(Map map, String str) {
        C4536s.l(map);
        C4536s.f(str);
        Integer num = (Integer) map.get(str);
        if (num == null) {
            return 0;
        }
        return num.longValue();
    }

    public long a() {
        return this.f50172b + this.f50173c;
    }

    public String b() {
        return this.f50171a;
    }
}
