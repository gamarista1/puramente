package Ma;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import com.google.android.gms.common.internal.C4536s;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import org.json.JSONException;
import org.json.JSONObject;
import za.C5298a;
import za.c;

public class e extends C5298a {
    public static final Parcelable.Creator<e> CREATOR = new k();

    /* renamed from: a  reason: collision with root package name */
    private final b f52029a;

    /* renamed from: b  reason: collision with root package name */
    private final String f52030b;

    /* renamed from: c  reason: collision with root package name */
    String f52031c;

    public e(b bVar, String str, String str2) {
        this.f52029a = (b) C4536s.l(bVar);
        this.f52031c = str;
        this.f52030b = str2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        String str = this.f52031c;
        if (str == null) {
            if (eVar.f52031c != null) {
                return false;
            }
        } else if (!str.equals(eVar.f52031c)) {
            return false;
        }
        if (!this.f52029a.equals(eVar.f52029a)) {
            return false;
        }
        String str2 = this.f52030b;
        if (str2 == null) {
            if (eVar.f52030b != null) {
                return false;
            }
        } else if (!str2.equals(eVar.f52030b)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        int i10;
        String str = this.f52031c;
        int i11 = 0;
        if (str == null) {
            i10 = 0;
        } else {
            i10 = str.hashCode();
        }
        int hashCode = ((i10 + 31) * 31) + this.f52029a.hashCode();
        String str2 = this.f52030b;
        if (str2 != null) {
            i11 = str2.hashCode();
        }
        return (hashCode * 31) + i11;
    }

    public String o0() {
        return this.f52030b;
    }

    public String p0() {
        return this.f52031c;
    }

    public b q0() {
        return this.f52029a;
    }

    public String toString() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("keyHandle", Base64.encodeToString(this.f52029a.o0(), 11));
            if (this.f52029a.p0() != c.UNKNOWN) {
                jSONObject.put(DiagnosticsEntry.VERSION_KEY, this.f52029a.p0().toString());
            }
            if (this.f52029a.q0() != null) {
                jSONObject.put("transports", this.f52029a.q0().toString());
            }
            String str = this.f52031c;
            if (str != null) {
                jSONObject.put("challenge", str);
            }
            String str2 = this.f52030b;
            if (str2 != null) {
                jSONObject.put("appId", str2);
            }
            return jSONObject.toString();
        } catch (JSONException e10) {
            throw new RuntimeException(e10);
        }
    }

    public void writeToParcel(Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.B(parcel, 2, q0(), i10, false);
        c.D(parcel, 3, p0(), false);
        c.D(parcel, 4, o0(), false);
        c.b(parcel, a10);
    }
}
