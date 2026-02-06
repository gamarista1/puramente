package Db;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.firebase.auth.B;
import org.json.JSONException;
import org.json.JSONObject;
import za.c;

/* renamed from: Db.h  reason: case insensitive filesystem */
public final class C4260h implements B {
    public static final Parcelable.Creator<C4260h> CREATOR = new C4259g();

    /* renamed from: a  reason: collision with root package name */
    private long f50516a;

    /* renamed from: b  reason: collision with root package name */
    private long f50517b;

    public C4260h(long j10, long j11) {
        this.f50516a = j10;
        this.f50517b = j11;
    }

    public static C4260h a(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        try {
            return new C4260h(jSONObject.getLong("lastSignInTimestamp"), jSONObject.getLong("creationTimestamp"));
        } catch (JSONException unused) {
            return null;
        }
    }

    public final JSONObject b() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("lastSignInTimestamp", this.f50516a);
            jSONObject.put("creationTimestamp", this.f50517b);
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.w(parcel, 1, z());
        c.w(parcel, 2, x());
        c.b(parcel, a10);
    }

    public final long x() {
        return this.f50517b;
    }

    public final long z() {
        return this.f50516a;
    }
}
