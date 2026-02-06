package Db;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.internal.C4536s;
import com.google.android.gms.internal.p002firebaseauthapi.zzaff;
import com.google.android.gms.internal.p002firebaseauthapi.zzafv;
import com.google.android.gms.internal.p002firebaseauthapi.zzxy;
import com.google.firebase.auth.C4778b0;
import org.json.JSONException;
import org.json.JSONObject;
import za.C5298a;
import za.c;

public final class A0 extends C5298a implements C4778b0 {
    public static final Parcelable.Creator<A0> CREATOR = new z0();

    /* renamed from: a  reason: collision with root package name */
    private String f50424a;

    /* renamed from: b  reason: collision with root package name */
    private String f50425b;

    /* renamed from: c  reason: collision with root package name */
    private String f50426c;

    /* renamed from: d  reason: collision with root package name */
    private String f50427d;

    /* renamed from: e  reason: collision with root package name */
    private Uri f50428e;

    /* renamed from: f  reason: collision with root package name */
    private String f50429f;

    /* renamed from: g  reason: collision with root package name */
    private String f50430g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f50431h;

    /* renamed from: i  reason: collision with root package name */
    private String f50432i;

    public A0(zzafv zzafv) {
        C4536s.l(zzafv);
        this.f50424a = zzafv.zzd();
        this.f50425b = C4536s.f(zzafv.zzf());
        this.f50426c = zzafv.zzb();
        Uri zza = zzafv.zza();
        if (zza != null) {
            this.f50427d = zza.toString();
            this.f50428e = zza;
        }
        this.f50429f = zzafv.zzc();
        this.f50430g = zzafv.zze();
        this.f50431h = false;
        this.f50432i = zzafv.zzg();
    }

    public static A0 o0(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            return new A0(jSONObject.optString("userId"), jSONObject.optString("providerId"), jSONObject.optString("email"), jSONObject.optString("phoneNumber"), jSONObject.optString("displayName"), jSONObject.optString("photoUrl"), jSONObject.optBoolean("isEmailVerified"), jSONObject.optString("rawUserInfo"));
        } catch (JSONException e10) {
            Log.d("DefaultAuthUserInfo", "Failed to unpack UserInfo from JSON");
            throw new zzxy(e10);
        }
    }

    public final String a() {
        return this.f50424a;
    }

    public final String d() {
        return this.f50430g;
    }

    public final String g() {
        return this.f50426c;
    }

    public final Uri h() {
        if (!TextUtils.isEmpty(this.f50427d) && this.f50428e == null) {
            this.f50428e = Uri.parse(this.f50427d);
        }
        return this.f50428e;
    }

    public final String j0() {
        return this.f50429f;
    }

    public final boolean k() {
        return this.f50431h;
    }

    public final String p0() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.putOpt("userId", this.f50424a);
            jSONObject.putOpt("providerId", this.f50425b);
            jSONObject.putOpt("displayName", this.f50426c);
            jSONObject.putOpt("photoUrl", this.f50427d);
            jSONObject.putOpt("email", this.f50429f);
            jSONObject.putOpt("phoneNumber", this.f50430g);
            jSONObject.putOpt("isEmailVerified", Boolean.valueOf(this.f50431h));
            jSONObject.putOpt("rawUserInfo", this.f50432i);
            return jSONObject.toString();
        } catch (JSONException e10) {
            Log.d("DefaultAuthUserInfo", "Failed to jsonify this object");
            throw new zzxy(e10);
        }
    }

    public final String r() {
        return this.f50425b;
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.D(parcel, 1, a(), false);
        c.D(parcel, 2, r(), false);
        c.D(parcel, 3, g(), false);
        c.D(parcel, 4, this.f50427d, false);
        c.D(parcel, 5, j0(), false);
        c.D(parcel, 6, d(), false);
        c.g(parcel, 7, k());
        c.D(parcel, 8, this.f50432i, false);
        c.b(parcel, a10);
    }

    public final String zza() {
        return this.f50432i;
    }

    public A0(zzaff zzaff, String str) {
        C4536s.l(zzaff);
        C4536s.f(str);
        this.f50424a = C4536s.f(zzaff.zzi());
        this.f50425b = str;
        this.f50429f = zzaff.zzh();
        this.f50426c = zzaff.zzg();
        Uri zzc = zzaff.zzc();
        if (zzc != null) {
            this.f50427d = zzc.toString();
            this.f50428e = zzc;
        }
        this.f50431h = zzaff.zzm();
        this.f50432i = null;
        this.f50430g = zzaff.zzj();
    }

    public A0(String str, String str2, String str3, String str4, String str5, String str6, boolean z10, String str7) {
        this.f50424a = str;
        this.f50425b = str2;
        this.f50429f = str3;
        this.f50430g = str4;
        this.f50426c = str5;
        this.f50427d = str6;
        if (!TextUtils.isEmpty(str6)) {
            this.f50428e = Uri.parse(this.f50427d);
        }
        this.f50431h = z10;
        this.f50432i = str7;
    }
}
